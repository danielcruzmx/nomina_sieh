package gob.shcp.sireh.service.plaza.honorarios;

import gob.shcp.fsn.service.ServiceException;

import gob.shcp.sireh.data.jdbc.QueryTdPlazaDAO;
import gob.shcp.sireh.data.jdbc.TcSitPlazaDAO;
import gob.shcp.sireh.data.jdbc.TcSituacionOkDAO;
import gob.shcp.sireh.data.jdbc.TdEmpleadoDAO;
import gob.shcp.sireh.data.jdbc.TdPlazaDAO;
import gob.shcp.sireh.data.jdbc.TnMovtosEmpPlaDAO;

import gob.shcp.sireh.domain.jdbc.TcAtributoPuesto;
import gob.shcp.sireh.domain.jdbc.TcSitPlaza;
import gob.shcp.sireh.domain.jdbc.TcSituacionOk;
import gob.shcp.sireh.domain.jdbc.TcSituacionOkPK;
import gob.shcp.sireh.domain.jdbc.TcTabulador;
import gob.shcp.sireh.domain.jdbc.TdEmpleado;
import gob.shcp.sireh.domain.jdbc.TdPlaza;
import gob.shcp.sireh.domain.jdbc.TnMovtosEmpPla;

import gob.shcp.sireh.model.plaza.honorarios.CambioSitPlazaDTO;
import gob.shcp.sireh.model.plaza.honorarios.CreacionPlazaDTO;
import gob.shcp.sireh.model.plaza.honorarios.LiberaPlazaDTO;
import gob.shcp.sireh.model.plaza.honorarios.ModificaImporteDTO;
import gob.shcp.sireh.model.plaza.honorarios.ProrrogaContratoDTO;

import gob.shcp.sireh.service.AbstractSirehService;
import gob.shcp.sireh.service.SirehUtils;

import java.math.BigDecimal;

import java.text.NumberFormat;

import java.util.Date;
import java.util.List;

/**
 * Business Service encargado de atender solicitudes correspondientes a Plazas de tipo Honorarios.
 */
public class PlazaHonorariosBS extends AbstractSirehService implements PlazaHonorariosService {
    
    private static final Integer HERRAMIENTA_AUXILIAR = new Integer(0);
    
    /**
     * Metodo encargado de obtener los datos de la Plaza con base en su id.
     * @author Oscar S.
     * @param idPlaza Integer
     * @return plazaDTO TdPlaza
     */
    private TdPlaza getPlaza(Integer idPlaza) {
        return super.persistence().get(TdPlazaDAO.class).getById(idPlaza);
    }
    
    /** 
    * Metodo encargado de Crear Plazas.
    * @author Oscar S.
    * @param creacionPlazaDTO CreacionPlazaDTO
    * @param usuario String
    * @return nuevoIdPlaza String
    */
    public String createPlaza(CreacionPlazaDTO creacionPlazaDTO, String usuario) {
        // Paso 1) Obtener el Empleado     
        TdEmpleado empleado = new TdEmpleado();
        
        // Paso 2) Preparar objeto plazaVacante
        TdPlaza plazaVacante = new TdPlaza();
        
        // Paso 3) Obtener ID  de la Plaza
        List<TdPlaza> plazas = super.persistence().get(QueryTdPlazaDAO.class).getMaxIdPlazaHonorarios();
        TdPlaza plaza = plazas.get(0);
        Integer nuevoIdPlaza = plaza.getIdPlaza();
        plazaVacante.setIdPlaza(nuevoIdPlaza);
        
        // Obtener el puesto con/sin espacios
        List<TcAtributoPuesto> puestos = super.persistence().get(QueryTdPlazaDAO.class).findCodigoPuesto(creacionPlazaDTO.getIdPuesto());
        TcAtributoPuesto puestoConEspacios = puestos.get(0);
        String idPuestoConEspacios = puestoConEspacios.getIdAtributoPuesto();
        
        // Paso 4) Validaciones
        plazaVacante.setIdUnidadPre(creacionPlazaDTO.getIdUnidad());
        plazaVacante.setIdUnidadNom(creacionPlazaDTO.getIdUnidad());
        plazaVacante.setIdPuestoPre(idPuestoConEspacios);
        plazaVacante.setIdPuestoNom("HONORAR");
        plazaVacante.setIdEdoPre(creacionPlazaDTO.getIdEdo());
        plazaVacante.setIdEdoNom(creacionPlazaDTO.getIdEdo());
        plazaVacante.setIdMuniNom(creacionPlazaDTO.getIdMuni() != null ? creacionPlazaDTO.getIdMuni() : new Integer(0));
        plazaVacante.setIdZonaEcoPre(creacionPlazaDTO.getIdZonaEco());
        plazaVacante.setIdZonaEcoNom(creacionPlazaDTO.getIdZonaEco());
            
        // Importe Honorario
        // Tabulador Anterior
        Double anteriorTabulador = super.getSumaSueldoCompensacion(idPuestoConEspacios, creacionPlazaDTO.getIdZonaEco());
                
        int comparaTabuladorIH = Double.compare(creacionPlazaDTO.getImporteHonorario(), anteriorTabulador);
        if (creacionPlazaDTO.getImporteHonorario() <= BigDecimal.ZERO.doubleValue() || comparaTabuladorIH > 0) {
            throw new ServiceException("El campo Importe Honorario no puede ser menor a cero ó mayor a la suma del Sueldo + Compensación.");
        } else {
            plazaVacante.setPlazaImpHono(creacionPlazaDTO.getImporteHonorario());
        }
         
        // Paso 4) Quincena de Captura
        Integer mepQnaCaptura = super.getQuincenaCaptura().intValue();
        
        // Paso 5) Validacion de Fechas
        if (creacionPlazaDTO.getPlazaIniCont() != null || creacionPlazaDTO.getPlazaFinCont() != null) {
            // Fecha Inicial - RETROACTIVO 45 DIAS 
            if (SirehUtils.comparaFechaLiberacionRetroactivo(creacionPlazaDTO.getPlazaIniCont(),super.parameter().getString("RETROACTIVO_PAGO"))) {
                // Deben ser Iguales
                plazaVacante.setPlazaIniCont(creacionPlazaDTO.getPlazaIniCont());
                plazaVacante.setPlazaUltimoMovto(creacionPlazaDTO.getPlazaIniCont());
            } else {
                throw new ServiceException("El campo Inicio de Contrato debe estar dentro del rango retroactivo de 45 días.");
            }
            
            // Fecha Termino
            if (creacionPlazaDTO.getPlazaIniCont() != null || creacionPlazaDTO.getPlazaFinCont() != null) {
                Date fechaInicial = (Date) creacionPlazaDTO.getPlazaIniCont();
                Date fechaFinal = (Date) creacionPlazaDTO.getPlazaFinCont();
                
                if (fechaInicial.compareTo(fechaFinal) > 0) {
                    throw new ServiceException("El Término de Contrato no puede ser menor que la Fecha Liberación.");
                } else { 
                    // Fecha limite respecto al año en curso
                    if (SirehUtils.validaFechaFinal(mepQnaCaptura.toString(), creacionPlazaDTO.getPlazaFinCont())) {
                        plazaVacante.setPlazaFinCont(creacionPlazaDTO.getPlazaFinCont());
                    } else {
                        throw new ServiceException("El Término de Contrato debe ser menor al 31 de Dic del año en curso.");
                    }
                }
            }
        }
         
        // Paso 6) Movimiento de Persona - 521
        Integer idMovtoPersona = super.getMovimientoPersonal("CREACION_DE_PLAZA_DE_HONORARIO");
        
        // Paso 7) Insert Plaza Vacante
        plazaVacante.setIdSitPlaza("C");
        plazaVacante.setPlazaCiclo(new Integer(super.security().getOperationYear()));
        plazaVacante.setIdGrupoPago("H");
        
        plazaVacante.setPlazaRespaldo(new Integer(0));
        
        plazaVacante.setIdProyReducePre("000000");
        plazaVacante.setIdProyAmpliaPre("000000");
        
        plazaVacante.setIdRangoPre(new Integer(0));
        plazaVacante.setIdRangoNom(new Integer(0));
        
        plazaVacante.setIdMovtoPersona(idMovtoPersona);
        
        plazaVacante.setPlazaReferencia(creacionPlazaDTO.getPlazaReferencia());
        plazaVacante.setPlazaQnaCaptura(mepQnaCaptura);
        plazaVacante.setIdTipoPlaza("X");
        plazaVacante.setIdServPub("HHHHH");
        plazaVacante.setIdPtoEstrategico("0");
        plazaVacante.setIdNodo("000");
        
        plazaVacante.setUsuario(usuario);
        plazaVacante.setFecModifico(new Date());
        super.persistence().get(TdPlazaDAO.class).save(plazaVacante);
        
        // Paso 8) Insert TN_MVTOS_EMP_PLA
        TnMovtosEmpPla tnMovtosEmpPla = SirehUtils.transformToTnMovtosEmpPla(empleado, plazaVacante, idMovtoPersona, mepQnaCaptura, usuario, new Date(), super.getAtributoPuesto(plazaVacante.getIdPuestoPre()));
        super.persistence().get(TnMovtosEmpPlaDAO.class).save(tnMovtosEmpPla);
        
        return String.valueOf(nuevoIdPlaza);
    }
    
    /**
     * Metodo encargado de obtener los datos de la Plaza a liberar con base en su id.
     * @author Oscar S.
     * @param idPlaza Integer
     * @return liberaPlazaDTO LiberaPlazaDTO
     */
    public LiberaPlazaDTO getLiberaPlaza(Integer idPlaza) {
        // Paso 1) Obtener la Plaza actual
        TdPlaza plaza = getPlaza(idPlaza);
        LiberaPlazaDTO liberaPlazaDTO;
        
        // Valida Plaza
        if (plaza == null || !(plaza.getIdSitPlaza().equals("C") || plaza.getIdSitPlaza().equals("V")) || !plaza.getIdGrupoPago().equals("H")) {
            liberaPlazaDTO = new LiberaPlazaDTO();
            liberaPlazaDTO.setIdSitPlaza("INVALIDA");
        } else {
            liberaPlazaDTO = super.transformation().map(plaza, LiberaPlazaDTO.class);
            
            String puesto = "";
            Integer zonaEconomica = new Integer(0);
            Integer rango = new Integer(0);
            // Situacion Ocupada - Datos Nomina
            if (!plaza.getIdSitPlaza().equals("O")) {
                // Datos Nomina
                puesto = plaza.getIdPuestoPre();
                zonaEconomica = plaza.getIdZonaEcoPre();
                rango = plaza.getIdRangoPre();
                
                // Datos Nomina
                liberaPlazaDTO.setIdUnidad(plaza.getIdUnidadNom());
                liberaPlazaDTO.setIdEdo(plaza.getIdEdoNom());
                liberaPlazaDTO.setIdMuni(plaza.getIdMuniNom() != null ? plaza.getIdMuniNom() : new Integer(0));
                liberaPlazaDTO.setIdZonaEco(plaza.getIdZonaEcoNom());
                liberaPlazaDTO.setIdPuesto(plaza.getIdPuestoNom());
                liberaPlazaDTO.setIdRango(plaza.getIdRangoNom());
                
                // Etiquetas
                liberaPlazaDTO.setIdUnidadLabel(plaza.getIdUnidadPre());
                liberaPlazaDTO.setIdEdoLabel(plaza.getIdEdoPre());
                liberaPlazaDTO.setIdZonaEcoLabel(plaza.getIdZonaEcoPre());
                liberaPlazaDTO.setIdPuestoLabel(plaza.getIdPuestoPre());
                liberaPlazaDTO.setIdRangoLabel(plaza.getIdRangoPre());
                 
                liberaPlazaDTO.setDatosFisicos(false);
                liberaPlazaDTO.setDatosPresupuestales(true);
            }
            
            // Paso 2) Obtener el Nivel Fisico
            TcAtributoPuesto tcAtributoPuesto = super.getAtributoPuesto(puesto); 
            liberaPlazaDTO.setNivelFisico(tcAtributoPuesto.getIdNivelPto());
            liberaPlazaDTO.setNombramiento(tcAtributoPuesto.getIdNombramiento());
            // Etiquetas
            liberaPlazaDTO.setNivelFisicoLabel(tcAtributoPuesto.getIdNivelPto());
            liberaPlazaDTO.setNombramientoLabel(tcAtributoPuesto.getIdNombramiento());

            // Paso 3) Obtener el Sueldo y Compensacion
            TcTabulador tcTabulador = super.getTabulador(tcAtributoPuesto, rango, zonaEconomica);
            liberaPlazaDTO.setSueldo(tcTabulador.getTabSueldo());
            liberaPlazaDTO.setCompensacion(tcTabulador.getTabCompensacion());
            // Etiquetas
            NumberFormat formatter = NumberFormat.getCurrencyInstance();
            
            String sueldoString = formatter.format(tcTabulador.getTabSueldo());
            liberaPlazaDTO.setSueldoLabel(sueldoString);
            
            String compensacionString = formatter.format(tcTabulador.getTabCompensacion());
            liberaPlazaDTO.setCompensacionLabel(compensacionString);
            
            // Importe Honorario
            Double importe = tcTabulador.getTabSueldo() + tcTabulador.getTabCompensacion();
            String importeString = formatter.format(importe).replaceAll("\\$", "");
            logger.debug("getLiberaPlaza -> importe -----------------> " + importeString);
            liberaPlazaDTO.setImporteHonorarioString(importeString);
        }
        return liberaPlazaDTO;
    }
    
    /**
     * Metodo encargado de liberar una Plaza con base en el objeto liberaPlazaDTO.
     * @author Oscar S.
     * @param liberaPlazaDTO LiberaPlazaDTO
     * @param usuario String
     */
    public void updateLiberaPlaza(LiberaPlazaDTO liberaPlazaDTO, String usuario) {
        // Paso 1) Obtener el Empleado actual        
        TdEmpleado empleado = new TdEmpleado();
        
        // Paso 2) Obtener la Plaza actual
        TdPlaza plaza = getPlaza(liberaPlazaDTO.getIdPlaza());
        
        // Paso 3) Preparar objeto Plaza
        TdPlaza plazaVacante = new TdPlaza();
        SirehUtils.copyProperties(plazaVacante, plaza);
        
        // Obtener el puesto sin espacios
        //List<TcAtributoPuesto> puestos = super.persistence().get(QueryTdPlazaDAO.class).findCodigoPuesto(liberaPlazaDTO.getIdPuesto());
        //TcAtributoPuesto puestoConEspacios = puestos.get(0);
        //String idPuestoConEspacios = puestoConEspacios.getIdAtributoPuesto();
        
        // Paso 4) Validaciones 
        if (!plaza.getIdSitPlaza().equals("O")) {
            plazaVacante.setIdUnidadNom(liberaPlazaDTO.getIdUnidad());
            //plazaVacante.setIdPuestoNom(liberaPlazaDTO.getIdPuesto());
            //plazaVacante.setIdPuestoNom(idPuestoConEspacios);
            plazaVacante.setIdPuestoNom("HONORAR");
            plazaVacante.setIdEdoNom(liberaPlazaDTO.getIdEdo());
            plazaVacante.setIdZonaEcoNom(liberaPlazaDTO.getIdZonaEco());
            plazaVacante.setIdMuniNom(liberaPlazaDTO.getIdMuni() != null ? liberaPlazaDTO.getIdMuni() : new Integer(0));
            plazaVacante.setIdRangoNom(HERRAMIENTA_AUXILIAR);
        }
        
        // Paso 5) Obtener Tabulador Anterior
        TcAtributoPuesto tcAtributoPuestoAnterior = super.getAtributoPuesto(plaza.getIdPuestoPre()); 
        TcTabulador tcTabuladorAnterior = super.getTabulador(tcAtributoPuestoAnterior, HERRAMIENTA_AUXILIAR, plaza.getIdZonaEcoPre());
        
        // Paso 6) Tabulador Anterior
        //Double anteriorTabulador = Double.valueOf(tcTabuladorAnterior.getTabSueldo() + tcTabuladorAnterior.getTabCompensacion());
        // Tabulador Anterior
        Double anteriorTabulador = super.getSumaSueldoCompensacion(plaza.getIdPuestoPre(), liberaPlazaDTO.getIdZonaEco());
        
        // Paso 7) Validacion - Valores para Nivel Tabular seleccionado        
        TcTabulador tcTabulador = new TcTabulador();
        try { 
            //TcAtributoPuesto tcAtributoPuesto = super.getAtributoPuesto(liberaPlazaDTO.getIdPuesto()); 
            //TcAtributoPuesto tcAtributoPuesto = super.getAtributoPuesto(idPuestoConEspacios); 
            TcAtributoPuesto tcAtributoPuesto = super.getAtributoPuesto("HONORAR"); 
            try {
                // Obtener el tabulador sin espacios
                //List<TcTabulador> tabuladores = super.persistence().get(QueryTdPlazaDAO.class).findTabulador(idPuestoConEspacios, liberaPlazaDTO.getIdZonaEco());
                List<TcTabulador> tabuladores = super.persistence().get(QueryTdPlazaDAO.class).findTabulador("HONORAR", liberaPlazaDTO.getIdZonaEco());
                tcTabulador = tabuladores.get(0);
            } catch (Exception ex) {
                throw new ServiceException("La Zona económica y/o Herramienta Auxiliar de Pago no son validas.");
            }
        } catch (Exception ex) {
            throw new ServiceException("Verifique la relación Código de puesto - Zona económica - Herramienta auxiliar de pago.");
        }
        
        // Paso 8) Validacion - Valores para Nivel Tabular seleccionado VS Nivel Tabular presupuestado
        Double nuevoTabulador = Double.valueOf(tcTabulador.getTabSueldo() + tcTabulador.getTabCompensacion());
        int comparaTabulador = Double.compare(anteriorTabulador, nuevoTabulador);
        if (comparaTabulador < 0) {
            throw new ServiceException("El Código de puesto seleccionado es superior al Código de puesto presupuestado.");
        }
        
        // Paso 9) Quincena de Captura
        Integer mepQnaCaptura = super.getQuincenaCaptura().intValue();
        
        // Paso 10) Validacion de fechas
        if (liberaPlazaDTO.getPlazaIniCont() != null || liberaPlazaDTO.getPlazaFinCont() != null) {
            Date fechaInicial = (Date) liberaPlazaDTO.getPlazaIniCont();
            Date fechaFinal = (Date) liberaPlazaDTO.getPlazaFinCont();
            
            if (fechaInicial.compareTo(fechaFinal) > 0) {
                throw new ServiceException("El Término de vigencia no puede ser menor que la Vigencia inicial.");
            } else {                
                // Fecha Inicial - RETROACTIVO 45 DIAS 
                if (SirehUtils.comparaFechaLiberacionRetroactivo(fechaInicial,super.parameter().getString("RETROACTIVO_PAGO"))) {
                    // Deben ser Iguales
                    plazaVacante.setPlazaIniCont(liberaPlazaDTO.getPlazaIniCont());
                    plazaVacante.setPlazaUltimoMovto(liberaPlazaDTO.getPlazaIniCont());
                    
                    // Fecha limite respecto al año en curso
                    if (SirehUtils.validaFechaFinal(mepQnaCaptura.toString(), liberaPlazaDTO.getPlazaFinCont())) {
                        plazaVacante.setPlazaFinCont(liberaPlazaDTO.getPlazaFinCont());
                    } else {
                        throw new ServiceException("El Término de vigencia debe ser menor al 31 de Dic del año en curso.");
                    }
                } else {
                    throw new ServiceException("El campo Vigencia inicial debe estar dentro del rango retroactivo de 45 días.");
                }
            }
        }
        
        // Paso 11) Obtener Valores adicionales de la plaza
        plazaVacante.setIdTipoPlaza(liberaPlazaDTO.getIdTipoPlaza());
        plazaVacante.setIdServPub(liberaPlazaDTO.getIdServPub());
        plazaVacante.setIdInmueble(liberaPlazaDTO.getIdInmueble() );
        
        // Importe Honorario
        int comparaTabuladorIH = Double.compare(liberaPlazaDTO.getPlazaImpHono(), anteriorTabulador);
        if (liberaPlazaDTO.getPlazaImpHono() <= BigDecimal.ZERO.doubleValue() || comparaTabuladorIH > 0) {
            throw new ServiceException("El campo Importe honorario no puede ser menor a cero ó mayor a la suma del Sueldo + Compensación.");
        } else {
            plazaVacante.setPlazaImpHono(liberaPlazaDTO.getPlazaImpHono());
        }
        
        
        plazaVacante.setPlazaReferencia(liberaPlazaDTO.getPlazaReferencia());
        
        // Paso 12) Movimiento de Persona - 501
        Integer idMovtoPersona = super.getMovimientoPersonal("PLAZAS_LIBERACION_DE_PLAZAS_=_V");
        
        // Paso 13) Update Plaza Vacante
        plazaVacante.setIdSitPlaza("V");
        plazaVacante.setPlazaRfc("");
        plazaVacante.setUsuario(usuario);
        plazaVacante.setFecModifico(new Date());
        plazaVacante.setIdMovtoPersona(idMovtoPersona);
        plazaVacante.setPlazaQnaCaptura(mepQnaCaptura);
        super.persistence().get(TdPlazaDAO.class).save(plazaVacante);
                
        // Paso 14) Insert TN_MVTOS_EMP_PLA
        TnMovtosEmpPla tnMovtosEmpPla = SirehUtils.transformToTnMovtosEmpPla(empleado, plazaVacante, idMovtoPersona, mepQnaCaptura, usuario, new Date(), super.getAtributoPuesto(plazaVacante.getIdPuestoPre()));
        super.persistence().get(TnMovtosEmpPlaDAO.class).save(tnMovtosEmpPla);
    }
    
    /**
     * Metodo encargado de obtener el id de la Plaza para su Cambio de Situación.
     * @author Oscar S.
     * @param idPlaza Integer
     * @return cambioSitPlazaDTO CambioSitPlazaDTO
     */
    public CambioSitPlazaDTO getCambioSitPlaza(Integer idPlaza) {
        // Paso 1) Obtener la Plaza actual
        TdPlaza plaza = getPlaza(idPlaza);
        CambioSitPlazaDTO cambioSitPlazaDTO;
        
        // Valida Plaza
        if (plaza == null || !(
            plaza.getIdSitPlaza().equals("C") || 
            plaza.getIdSitPlaza().equals("O") || 
            plaza.getIdSitPlaza().equals("OR") || 
            plaza.getIdSitPlaza().equals("V") ||
            plaza.getIdSitPlaza().equals("VK") ||
            plaza.getIdSitPlaza().equals("VR") ||
            plaza.getIdSitPlaza().equals("VT")) || !plaza.getIdGrupoPago().equals("H")) {
            cambioSitPlazaDTO = new CambioSitPlazaDTO();
            cambioSitPlazaDTO.setIdSitPlaza("INVALIDA");
        } else {
            cambioSitPlazaDTO = super.transformation().map(plaza, CambioSitPlazaDTO.class);
            
            String puesto;
            Integer zonaEconomica;
            Integer rango;
            // Situacion Ocupada - Datos Nomina
            if (plaza.getIdSitPlaza().equals("O")) {
                // Datos Nomina
                puesto = plaza.getIdPuestoNom();
                zonaEconomica = plaza.getIdZonaEcoNom();
                rango = plaza.getIdRangoNom();
                
                // Etiquetas
                cambioSitPlazaDTO.setIdUnidadLabel(plaza.getIdUnidadNom());
                cambioSitPlazaDTO.setIdEdoLabel(plaza.getIdEdoNom());
                cambioSitPlazaDTO.setIdMuniLabel(plaza.getIdMuniNom() != null ? plaza.getIdMuniNom() : 0);
                cambioSitPlazaDTO.setIdZonaEcoLabel(plaza.getIdZonaEcoNom());
                cambioSitPlazaDTO.setIdPuestoLabel(plaza.getIdPuestoNom());
                cambioSitPlazaDTO.setIdRangoLabel(plaza.getIdRangoNom());
                
                cambioSitPlazaDTO.setDatosFisicos(true);
                cambioSitPlazaDTO.setDatosPresupuestales(false);
            } else {
                // Datos Nomina
                puesto = plaza.getIdPuestoNom();
                zonaEconomica = plaza.getIdZonaEcoNom();
                rango = plaza.getIdRangoNom();
                
                // Etiquetas
                cambioSitPlazaDTO.setIdUnidadLabel(plaza.getIdUnidadPre());
                cambioSitPlazaDTO.setIdEdoLabel(plaza.getIdEdoPre());
                cambioSitPlazaDTO.setIdZonaEcoLabel(plaza.getIdZonaEcoPre());
                cambioSitPlazaDTO.setIdPuestoLabel(plaza.getIdPuestoPre());
                cambioSitPlazaDTO.setIdRangoLabel(plaza.getIdRangoPre());
                
                cambioSitPlazaDTO.setDatosFisicos(false);
                cambioSitPlazaDTO.setDatosPresupuestales(true);
            }
            
            // Paso 2) Obtener el Nivel Fisico
            TcAtributoPuesto tcAtributoPuesto = super.getAtributoPuesto(puesto);
            // Etiquetas
            cambioSitPlazaDTO.setNivelFisicoLabel(tcAtributoPuesto.getIdNivelPto());
            cambioSitPlazaDTO.setNombramientoLabel(tcAtributoPuesto.getIdNombramiento());

            // Paso 3) Obtener el sueldo y compensacion
            TcTabulador tcTabulador = super.getTabulador(tcAtributoPuesto, rango, zonaEconomica);
            // Etiquetas
            NumberFormat formatter = NumberFormat.getCurrencyInstance();
            String sueldoString = formatter.format(tcTabulador.getTabSueldo());
            cambioSitPlazaDTO.setSueldoLabel(sueldoString);
            String compensacionString = formatter.format(tcTabulador.getTabCompensacion());
            cambioSitPlazaDTO.setCompensacionLabel(compensacionString);
            
            // Paso 4) Obtener la situación de la plaza
            TcSitPlaza sitPlaza = super.persistence().get(TcSitPlazaDAO.class).getById(plaza.getIdSitPlaza());
            cambioSitPlazaDTO.setIdSitPlazaOrigen(sitPlaza.getIdSitPlaza());
            cambioSitPlazaDTO.setDescSitPlaza(sitPlaza.getDescSitPlaza());
            
            //Ultimo Movimiento
            cambioSitPlazaDTO.setUltimoMovto(plaza.getPlazaUltimoMovto());
        }
        return cambioSitPlazaDTO;
    }
    
    /**
     * Metodo encargado de cambiar la Situación de la Plaza con base en el objeto CambioSitPlazaDTO.
     * @author Oscar S.
     * @param cambioSitPlazaDTO CambioSitPlazaDTO
     * @param usuario String
     */
    public void updateCambioSitPlazaPlaza(CambioSitPlazaDTO cambioSitPlazaDTO, String usuario) {
        // Paso 1) Obtener el Empleado actual        
        TdEmpleado empleado = new TdEmpleado();
        
        // Paso 2) Obtener la Plaza actual
        TdPlaza plaza = getPlaza(cambioSitPlazaDTO.getIdPlaza());
        
        // Paso 3) Preparar objeto Plaza
        TdPlaza plazaVacante = new TdPlaza();
        SirehUtils.copyProperties(plazaVacante, plaza);
        
        // Paso 4) Validaciones
        plazaVacante.setIdSitPlaza(cambioSitPlazaDTO.getIdSitPlazaDestino());
        
        // Paso 5) Quincena de Captura
        Integer mepQnaCaptura = super.getQuincenaCaptura().intValue();
        
        if (cambioSitPlazaDTO.getPlazaIniCont() != null || plaza.getPlazaUltimoMovto() != null) {
            Date fechaInicial = (Date) cambioSitPlazaDTO.getPlazaIniCont();
            Date fechaFinal = (Date) plaza.getPlazaUltimoMovto();
            
            if (fechaInicial.compareTo(fechaFinal) < 0) {
                throw new ServiceException("El Inicio de movimiento no puede ser menor que la Fecha del Último movimiento.");
            } else {
                if (SirehUtils.comparaQuincenaCaptura(mepQnaCaptura, fechaInicial)) {
                    
                    // Fecha limite respecto al año en curso
                    if (SirehUtils.validaFechaFinal(mepQnaCaptura.toString(), cambioSitPlazaDTO.getPlazaIniCont())){
                        plazaVacante.setPlazaIniCont(cambioSitPlazaDTO.getPlazaIniCont());
                        plazaVacante.setPlazaUltimoMovto(cambioSitPlazaDTO.getPlazaIniCont());
                    } else {
                        throw new ServiceException("El Inicio de movimiento debe ser menor al 31 de Dic del año en curso.");
                    }
                } else {
                    throw new ServiceException("El Inicio de movimiento debe ser posterior a la Quincena de Captura.");
                }
            }
        }
        
        // Paso 6) Obtener Tipo de Movimiento
        TcSituacionOkPK tcSituacionOkPK = new TcSituacionOkPK();
        tcSituacionOkPK.setIdSitPlazaOrigen(plaza.getIdSitPlaza());
        tcSituacionOkPK.setIdSitPlazaDestino(cambioSitPlazaDTO.getIdSitPlazaDestino());
        TcSituacionOk tcSituacionOk = super.persistence().get(TcSituacionOkDAO.class).getById(tcSituacionOkPK);
        
        // Paso 7) Movimiento Persona
        Integer idMovtoPersona = tcSituacionOk.getIdMovtoPersona();
        
        // Paso 8) Update Plaza Vacante
        plazaVacante.setUsuario(usuario);
        plazaVacante.setFecModifico(new Date());
        plazaVacante.setIdMovtoPersona(idMovtoPersona);
        plazaVacante.setPlazaQnaCaptura(mepQnaCaptura);
        super.persistence().get(TdPlazaDAO.class).save(plazaVacante);
                
        // Paso 9) Insert TN_MVTOS_EMP_PLA
        TnMovtosEmpPla tnMovtosEmpPla = SirehUtils.transformToTnMovtosEmpPla(empleado, plazaVacante, idMovtoPersona, mepQnaCaptura, usuario, new Date(), super.getAtributoPuesto(plazaVacante.getIdPuestoPre()));
        super.persistence().get(TnMovtosEmpPlaDAO.class).save(tnMovtosEmpPla);
    }
    
    /**
     * Metodo encargado de eliminar Plazas de Tipo Honorarios.
     * @author Oscar S.
     * @param idPlazas Integer[]
     * @param usuario String
     * @param observaciones String
     */
    public void depuraPlazas(Integer[] idPlazas, String usuario, String observaciones) {
        // Datos del Empleado
        TdEmpleado empleado = new TdEmpleado();
        
        // Movimiento Persona
        Integer idMovtoPersona = super.getMovimientoPersonal("ELIMINAR_PLAZA_EV_HON_SERVICIO_SOCIAL");
        
        // Quincena de Captura
        Integer mepQnaCaptura = super.getQuincenaCaptura().intValue();
        
        for(Integer idPlaza : idPlazas) {
            // Datos de la Plaza
            TdPlaza plaza = getPlaza(idPlaza);
            
            // Validacion
            if ( (plaza.getPlazaRespaldo() == null || plaza.getPlazaRespaldo() == 0) && plaza.getIdGrupoPago().equals("H") && (plaza.getIdSitPlaza().equals("C") || plaza.getIdSitPlaza().equals("V"))) {
                
                // Insert TN_MVTOS_EMP_PLA - 528
                TnMovtosEmpPla tnMovtosEmpPla = SirehUtils.transformToTnMovtosEmpPla(empleado, plaza, idMovtoPersona, mepQnaCaptura, usuario, new Date(), super.getAtributoPuesto(plaza.getIdPuestoPre()));
                
                // Observaciones
                tnMovtosEmpPla.setMepObserva(observaciones != null ? observaciones : "");
                 
                super.persistence().get(TnMovtosEmpPlaDAO.class).save(tnMovtosEmpPla);
                
                // Eliminacion
                super.persistence().get(TdPlazaDAO.class).delete(plaza);
            }
        }
    }
    
    /**
     * Metodo encargado de obtener el id de la Plaza para Prorroga de Contrato.
     * @author Oscar S.
     * @param idPlaza Integer
     * @return prorrogaContratoDTO ProrrogaContratoDTO
     */
    public ProrrogaContratoDTO getProrrogaContrato(Integer idPlaza) {
        // Paso 1) Obtener la Plaza actual
        TdPlaza plaza = getPlaza(idPlaza);
        ProrrogaContratoDTO prorrogaContratoDTO;
        
        // Valida Plaza
        if (plaza == null || !plaza.getIdSitPlaza().equals("O") || !plaza.getIdGrupoPago().equals("H")) {
            prorrogaContratoDTO = new ProrrogaContratoDTO();
            prorrogaContratoDTO.setIdSitPlaza("INVALIDA");
        } else {
            prorrogaContratoDTO = super.transformation().map(plaza, ProrrogaContratoDTO.class);
            
            String puesto = "";
            Integer zonaEconomica = new Integer(0);
            Integer rango = new Integer(0);
            
            String puestoPre = "";
            Integer zonaEconomicaPre = new Integer(0);
            Integer rangoPre = new Integer(0);

            // Datos Nomina
            puesto = plaza.getIdPuestoNom();
            zonaEconomica = plaza.getIdZonaEcoNom();
            rango = plaza.getIdRangoNom();
            
            // Datos Presupuestales
            puestoPre = plaza.getIdPuestoPre();
            zonaEconomicaPre = plaza.getIdZonaEcoPre();
            rangoPre = plaza.getIdRangoPre();
            
            // Datos Nomina
            prorrogaContratoDTO.setIdUnidad(plaza.getIdUnidadNom());
            prorrogaContratoDTO.setIdEdo(plaza.getIdEdoNom());
            prorrogaContratoDTO.setIdMuni(plaza.getIdMuniNom());
            prorrogaContratoDTO.setIdPuesto(plaza.getIdPuestoNom());
            prorrogaContratoDTO.setIdZonaEco(plaza.getIdZonaEcoNom());
            prorrogaContratoDTO.setIdRango(plaza.getIdRangoNom());
            
            // Etiquetas
            prorrogaContratoDTO.setIdUnidadLabel(plaza.getIdUnidadNom());
            prorrogaContratoDTO.setIdEdoLabel(plaza.getIdEdoNom());
            prorrogaContratoDTO.setIdMuniLabel(plaza.getIdMuniNom());
            prorrogaContratoDTO.setIdZonaEcoLabel(plaza.getIdZonaEcoNom());
            prorrogaContratoDTO.setIdPuestoLabel(plaza.getIdPuestoNom());
            prorrogaContratoDTO.setIdRangoLabel(plaza.getIdRangoNom());
            
            prorrogaContratoDTO.setDatosFisicos(true);
            prorrogaContratoDTO.setDatosPresupuestales(false);
            
            // Datos del Empleado
            TdEmpleado empleado = super.persistence().get(TdEmpleadoDAO.class).getById(plaza.getPlazaRfc());
            prorrogaContratoDTO.setRfcEmpleadoLabel(empleado.getRfcEmpleado());
            prorrogaContratoDTO.setNombreEmpleadoLabel(empleado.getNombreEmpleado());
            prorrogaContratoDTO.setPrimerApellidoLabel(empleado.getPrimerApellido());
            prorrogaContratoDTO.setSegundoApellidoLabel(empleado.getSegundoApellido());
            
            // Paso 2) Obtener el Nivel Fisico
            TcAtributoPuesto tcAtributoPuesto = super.getAtributoPuesto(puestoPre); 
            // Etiquetas
            prorrogaContratoDTO.setNivelFisicoLabel(tcAtributoPuesto.getIdNivelPto());
            prorrogaContratoDTO.setNombramientoLabel(tcAtributoPuesto.getIdNombramiento());

            // Paso 3) Obtener el sueldo y compensacion
            TcTabulador tcTabulador = super.getTabulador(tcAtributoPuesto, rangoPre, zonaEconomicaPre);
            // Etiquetas
            NumberFormat formatter = NumberFormat.getCurrencyInstance();
            String sueldoString = formatter.format(tcTabulador.getTabSueldo());
            prorrogaContratoDTO.setSueldoLabel(sueldoString);
            String compensacionString = formatter.format(tcTabulador.getTabCompensacion());
            prorrogaContratoDTO.setCompensacionLabel(compensacionString);
            
            // Paso 4) Obtener la situación de la plaza
            TcSitPlaza sitPlaza = super.persistence().get(TcSitPlazaDAO.class).getById(plaza.getIdSitPlaza());
            prorrogaContratoDTO.setDescSitPlaza(sitPlaza.getDescSitPlaza());
            
            // Ultimo Movimiento
            prorrogaContratoDTO.setUltimoMovto(plaza.getPlazaUltimoMovto());
        }
        return prorrogaContratoDTO;
    }
    
    /**
     * Metodo encargado de cambiar la Prorroga de Contrato de la Plaza con base en el objeto ProrrogaContratoDTO.
     * @author Oscar S.
     * @param prorrogaContratoDTO ProrrogaContratoDTO
     * @param usuario String
     */
    public void updateProrrogaContrato(ProrrogaContratoDTO prorrogaContratoDTO, String usuario) {
        // Paso 1) Obtener la Plaza actual
        TdPlaza plaza = getPlaza(prorrogaContratoDTO.getIdPlaza());
        
        // Paso 2) Obtener el Empleado actual        
        TdEmpleado empleado = super.persistence().get(TdEmpleadoDAO.class).getById(plaza.getPlazaRfc());
        
        // Paso 3) Preparar objeto Plaza
        TdPlaza plazaVacante = new TdPlaza();
        SirehUtils.copyProperties(plazaVacante, plaza);
        
        // Paso 4) Quincena de Captura
        Integer mepQnaCaptura = super.getQuincenaCaptura().intValue();
        
        // Paso 5) Validacion de fechas
        if (prorrogaContratoDTO.getPlazaIniCont() != null || plaza.getPlazaUltimoMovto() != null) {
            Date fechaInicial = (Date) prorrogaContratoDTO.getPlazaIniCont();
            Date fechaFinal = (Date) plaza.getPlazaUltimoMovto();
            
            if (fechaInicial.compareTo(fechaFinal) < 0) {
                throw new ServiceException("El Inicio de Contrato no puede ser menor que la Fecha del Último Movimiento.");
            } else {
                if (SirehUtils.comparaQuincenaCaptura(mepQnaCaptura, fechaInicial)) {
                    // Deben ser iguales
                    plazaVacante.setPlazaIniCont(prorrogaContratoDTO.getPlazaIniCont());
                    plazaVacante.setPlazaUltimoMovto(prorrogaContratoDTO.getPlazaIniCont());
                } else {
                    throw new ServiceException("El Inicio de Contrato debe ser posterior a la Quincena de Captura.");
                }
            }
        }
        if (prorrogaContratoDTO.getPlazaFinCont() == null) {
            throw new ServiceException("El campo Termino de Contrato no puede ser vacio.");
        } else {
            Date fechaInicial2 = (Date) prorrogaContratoDTO.getPlazaIniCont();
            Date fechaFinal2 = (Date) prorrogaContratoDTO.getPlazaFinCont();
            
            if (fechaInicial2.compareTo(fechaFinal2) > 0) {
                throw new ServiceException("El campo Termino de Contrato no puede ser menor que el Inicio de movimiento.");
            } else {
                // Fecha limite respecto al año en curso
                if (SirehUtils.validaFechaFinal(mepQnaCaptura.toString(), prorrogaContratoDTO.getPlazaFinCont())) {                        
                    plazaVacante.setPlazaFinCont(prorrogaContratoDTO.getPlazaFinCont());
                } else {
                    throw new ServiceException("El campo Termino de Contrato debe ser menor al 31 de Dic del año en curso.");
                }
            }
        }
        
        // Importe Honorario
        // Tabulador Anterior
        Double anteriorTabulador = super.getSumaSueldoCompensacion(plaza.getIdPuestoPre(), plaza.getIdZonaEcoPre());
                
        int comparaTabuladorIH = Double.compare(prorrogaContratoDTO.getPlazaImpHono(), anteriorTabulador);
        if (prorrogaContratoDTO.getPlazaImpHono() <= BigDecimal.ZERO.doubleValue() || comparaTabuladorIH > 0) {
            throw new ServiceException("El campo Importe Honorario no puede ser menor a cero ó mayor a la suma del Sueldo + Compensación.");
        } else {
            plazaVacante.setPlazaImpHono(prorrogaContratoDTO.getPlazaImpHono());
        }
        
        // Paso 6) Movimiento Personal - 613
        Integer idMovtoPersona = super.getMovimientoPersonal("PRORROGA_DE_CONTRATO_HONORARIO");
        
        // Paso 7) Update Plaza Vacante
        plazaVacante.setUsuario(usuario);
        plazaVacante.setFecModifico(new Date());
        plazaVacante.setIdMovtoPersona(idMovtoPersona);
        plazaVacante.setPlazaQnaCaptura(mepQnaCaptura);
        super.persistence().get(TdPlazaDAO.class).save(plazaVacante);
        
        // Paso 8) Insert TN_MVTOS_EMP_PLA
        TnMovtosEmpPla tnMovtosEmpPla = SirehUtils.transformToTnMovtosEmpPla(empleado, plazaVacante, idMovtoPersona, mepQnaCaptura, usuario, new Date(), super.getAtributoPuesto(plazaVacante.getIdPuestoPre()));
        super.persistence().get(TnMovtosEmpPlaDAO.class).save(tnMovtosEmpPla);
    }
    
    /**
     * Metodo encargado de obtener el id de la Plaza para Modificación de Importe.
     * @author Oscar S.
     * @param idPlaza Integer
     * @return modificaImporteDTO ModificaImporteDTO
     */
    public ModificaImporteDTO getModificaImporte(Integer idPlaza) {
        // Paso 1) Obtener la Plaza actual
        TdPlaza plaza = getPlaza(idPlaza);
        ModificaImporteDTO modificaImporteDTO;
        
        // Valida Plaza
         if (plaza == null || !(
            plaza.getIdSitPlaza().equals("C") || 
            plaza.getIdSitPlaza().equals("V") || 
            plaza.getIdSitPlaza().equals("O")) || !plaza.getIdGrupoPago().equals("H")) {
            modificaImporteDTO = new ModificaImporteDTO();
            modificaImporteDTO.setIdSitPlaza("INVALIDA");
        } else {
            modificaImporteDTO = super.transformation().map(plaza, ModificaImporteDTO.class);
            
            String puesto = "";
            Integer zonaEconomica = new Integer(0);
            Integer rango = new Integer(0);
            
            String puestoPre = "";
            Integer zonaEconomicaPre = new Integer(0);
            Integer rangoPre = new Integer(0);
            
            // Datos Nomina
            puesto = plaza.getIdPuestoNom();
            zonaEconomica = plaza.getIdZonaEcoNom();
            rango = plaza.getIdRangoNom();
            
            // Datos Presupuestales
            puestoPre = plaza.getIdPuestoPre();
            zonaEconomicaPre = plaza.getIdZonaEcoPre();
            rangoPre = plaza.getIdRangoPre();
            
            // Datos Nomina
            modificaImporteDTO.setIdUnidad(plaza.getIdUnidadNom());
            modificaImporteDTO.setIdEdo(plaza.getIdEdoNom());
            modificaImporteDTO.setIdMuni(plaza.getIdMuniNom());
            modificaImporteDTO.setIdPuesto(plaza.getIdPuestoNom());
            modificaImporteDTO.setIdZonaEco(plaza.getIdZonaEcoNom());
            modificaImporteDTO.setIdRango(plaza.getIdRangoNom());
            
            // Etiquetas
            modificaImporteDTO.setIdUnidadLabel(plaza.getIdUnidadNom());
            modificaImporteDTO.setIdEdoLabel(plaza.getIdEdoNom());
            modificaImporteDTO.setIdMuniLabel(plaza.getIdMuniNom());
            modificaImporteDTO.setIdZonaEcoLabel(plaza.getIdZonaEcoNom());
            modificaImporteDTO.setIdPuestoLabel(plaza.getIdPuestoNom());
            modificaImporteDTO.setIdRangoLabel(plaza.getIdRangoNom());
            
            modificaImporteDTO.setDatosFisicos(true);
            modificaImporteDTO.setDatosPresupuestales(false);
            
            // Paso 2) Obtener el Nivel Fisico
            TcAtributoPuesto tcAtributoPuesto = super.getAtributoPuesto(puestoPre); 
            // Etiquetas
            modificaImporteDTO.setNivelFisicoLabel(tcAtributoPuesto.getIdNivelPto());
            modificaImporteDTO.setNombramientoLabel(tcAtributoPuesto.getIdNombramiento());

            // Paso 3) Obtener el sueldo y compensacion
            TcTabulador tcTabulador = super.getTabulador(tcAtributoPuesto, rangoPre, zonaEconomicaPre);
            // Etiquetas
            NumberFormat formatter = NumberFormat.getCurrencyInstance();
            
            String sueldoString = formatter.format(tcTabulador.getTabSueldo());
            modificaImporteDTO.setSueldoLabel(sueldoString);
            String compensacionString = formatter.format(tcTabulador.getTabCompensacion());
            modificaImporteDTO.setCompensacionLabel(compensacionString);
            
            String importeHonorarioString = formatter.format(plaza.getPlazaImpHono());
            modificaImporteDTO.setImporteHonorarioLabel(importeHonorarioString);
            
            // Paso 4) Obtener la situación de la plaza
            TcSitPlaza sitPlaza = super.persistence().get(TcSitPlazaDAO.class).getById(plaza.getIdSitPlaza());
            modificaImporteDTO.setDescSitPlaza(sitPlaza.getDescSitPlaza());
            
            // Ultimo Movimiento
            modificaImporteDTO.setUltimoMovto(plaza.getPlazaUltimoMovto());
        }
        return modificaImporteDTO;
    }
    
    /**
     * Metodo encargado de Modificar el Importe Honorario de la Plaza con base en el objeto modificaImporteDTO.
     * @author Oscar S.
     * @param modificaImporteDTO ModificaImporteDTO
     * @param usuario String
     */
    public void updateModificaImporte(ModificaImporteDTO modificaImporteDTO, String usuario) {
        // Paso 1) Obtener la Plaza actual
        TdPlaza plaza = getPlaza(modificaImporteDTO.getIdPlaza());
        
        // Paso 2) Obtener el Empleado actual        
         TdEmpleado empleado = new TdEmpleado();
        
        // Paso 3) Preparar objeto Plaza
        TdPlaza plazaVacante = new TdPlaza();
        SirehUtils.copyProperties(plazaVacante, plaza);
        
        // Paso 4) Quincena de Captura
        Integer mepQnaCaptura = super.getQuincenaCaptura().intValue();
        
        // Paso 5) Importe Honorario
        // Tabulador Anterior
        Double anteriorTabulador = super.getSumaSueldoCompensacion(plaza.getIdPuestoPre(), plaza.getIdZonaEcoPre());
                
        int comparaTabuladorIH = Double.compare(modificaImporteDTO.getPlazaImpHono(), anteriorTabulador);
        if (modificaImporteDTO.getPlazaImpHono() <= BigDecimal.ZERO.doubleValue() || comparaTabuladorIH > 0) {
            throw new ServiceException("El campo Importe Honorario no puede ser menor a cero ó mayor a la suma del Sueldo + Compensación.");
        } else {
            plazaVacante.setPlazaImpHono(modificaImporteDTO.getPlazaImpHono());
        }
        
        // Paso 6) Movimiento Personal - 510
        Integer idMovtoPersona = super.getMovimientoPersonal("PLAZAS_CAMBIO_DE_SUELDO_DE_HONORARIOS");
        
        // Paso 7) Update Plaza Vacante
        plazaVacante.setUsuario(usuario);
        plazaVacante.setFecModifico(new Date());
        plazaVacante.setIdMovtoPersona(idMovtoPersona);
        plazaVacante.setPlazaQnaCaptura(mepQnaCaptura);
        super.persistence().get(TdPlazaDAO.class).save(plazaVacante);
        
        // Paso 8) Insert TN_MVTOS_EMP_PLA
        TnMovtosEmpPla tnMovtosEmpPla = SirehUtils.transformToTnMovtosEmpPla(empleado, plazaVacante, idMovtoPersona, mepQnaCaptura, usuario, new Date(), super.getAtributoPuesto(plazaVacante.getIdPuestoPre()));
        super.persistence().get(TnMovtosEmpPlaDAO.class).save(tnMovtosEmpPla);
    }
}
