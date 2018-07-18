package gob.shcp.sireh.service.plaza.eventual;

import gob.shcp.fsn.service.ServiceException;

import gob.shcp.sireh.data.jdbc.QueryTdPlazaDAO;
import gob.shcp.sireh.data.jdbc.TcSitPlazaDAO;
import gob.shcp.sireh.data.jdbc.TcSituacionOkDAO;
import gob.shcp.sireh.data.jdbc.TcTipoPlazaDAO;
import gob.shcp.sireh.data.jdbc.TcTipoServPubDAO;
import gob.shcp.sireh.data.jdbc.TdEmpleadoDAO;
import gob.shcp.sireh.data.jdbc.TdPlazaDAO;
import gob.shcp.sireh.data.jdbc.TnMovtosEmpPlaDAO;

import gob.shcp.sireh.domain.jdbc.TcAtributoPuesto;
import gob.shcp.sireh.domain.jdbc.TcSitPlaza;
import gob.shcp.sireh.domain.jdbc.TcSituacionOk;
import gob.shcp.sireh.domain.jdbc.TcSituacionOkPK;
import gob.shcp.sireh.domain.jdbc.TcTabulador;
import gob.shcp.sireh.domain.jdbc.TcTipoPlaza;
import gob.shcp.sireh.domain.jdbc.TcTipoServPub;
import gob.shcp.sireh.domain.jdbc.TdEmpleado;
import gob.shcp.sireh.domain.jdbc.TdPlaza;
import gob.shcp.sireh.domain.jdbc.TnMovtosEmpPla;

import gob.shcp.sireh.model.plaza.eventual.CambioPtoFisicoPlazaDTO;
import gob.shcp.sireh.model.plaza.eventual.CambioSitPlazaDTO;
import gob.shcp.sireh.model.plaza.eventual.CambioURFisicaPlazaDTO;
import gob.shcp.sireh.model.plaza.eventual.CreacionPlazaDTO;
import gob.shcp.sireh.model.plaza.eventual.LiberaPlazaDTO;
import gob.shcp.sireh.model.plaza.eventual.ModificaTipoSPDTO;
import gob.shcp.sireh.model.plaza.eventual.ProrrogaContratoDTO;

import gob.shcp.sireh.service.AbstractSirehService;
import gob.shcp.sireh.service.SirehUtils;
import static gob.shcp.sireh.service.SirehUtils.*;

import java.text.NumberFormat;

import java.util.Date;
import java.util.List;

/**
 * Business Service encargado de atender solicitudes correspondientes a Plazas de tipo Eventual.
 */
public class PlazaEventualBS extends AbstractSirehService implements PlazaEventualService {
    
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
    * Metodo encargado de Crear Plazas de tipo Evnetual.
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
        
        // Paso 3) Obtener ID de la Plaza
        List<TdPlaza> plazas = super.persistence().get(QueryTdPlazaDAO.class).getMaxIdPlazaEventual();
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
        plazaVacante.setIdPuestoPre(creacionPlazaDTO.getIdPuesto());
        plazaVacante.setIdPuestoNom(idPuestoConEspacios);
        plazaVacante.setIdEdoPre(creacionPlazaDTO.getIdEdo());
        plazaVacante.setIdEdoNom(creacionPlazaDTO.getIdEdo());
        plazaVacante.setIdMuniNom(creacionPlazaDTO.getIdMuni() != null ? creacionPlazaDTO.getIdMuni() : new Integer(0));
        plazaVacante.setIdZonaEcoPre(creacionPlazaDTO.getIdZonaEco());
        plazaVacante.setIdZonaEcoNom(creacionPlazaDTO.getIdZonaEco());
        plazaVacante.setIdServPub(creacionPlazaDTO.getIdServPub());
         
        // Paso 4) Quincena de Captura
        Integer mepQnaCaptura = super.getQuincenaCaptura().intValue();
        
        // Paso 5) Validacion de Fechas
        if (creacionPlazaDTO.getPlazaIniCont() != null || creacionPlazaDTO.getPlazaFinCont() != null) {            
            // Fecha Inicial - RETROACTIVO 90 DIAS 
            if (SirehUtils.comparaFechaLiberacionRetroactivo(creacionPlazaDTO.getPlazaIniCont(),super.parameter().getString(RETROACTIVO_PAGO) )) {
                // Deben ser Iguales
                plazaVacante.setPlazaIniCont(creacionPlazaDTO.getPlazaIniCont());
                plazaVacante.setPlazaUltimoMovto(creacionPlazaDTO.getPlazaIniCont());
            } else {
                throw new ServiceException("El campo Vigencia inicial debe estar dentro del rango retroactivo de 90 días.");
            }
            
            // Fecha Término
            if (creacionPlazaDTO.getPlazaIniCont() != null || creacionPlazaDTO.getPlazaFinCont() != null) {
                Date fechaInicial = (Date) creacionPlazaDTO.getPlazaIniCont();
                Date fechaFinal = (Date) creacionPlazaDTO.getPlazaFinCont();
                
                if (fechaInicial.compareTo(fechaFinal) > 0) {
                    throw new ServiceException("El Término de vigencia no puede ser menor que la Vigencia inicial.");
                } else { 
                    // Fecha limite respecto al año en curso
                    if (SirehUtils.validaFechaFinal(mepQnaCaptura.toString(), creacionPlazaDTO.getPlazaFinCont())) {
                        plazaVacante.setPlazaFinCont(creacionPlazaDTO.getPlazaFinCont());
                    } else {
                        throw new ServiceException("El Término de vigencia debe ser menor al 31 de diciembre del año en curso.");
                    }
                }
            }
        }
         
        // Paso 6) Movimiento de Persona - 518
        Integer idMovtoPersona = super.getMovimientoPersonal("CREACION_DE_PLAZA_EVENTUAL");
        
        // Paso 7) Insert Plaza Vacante
        plazaVacante.setIdSitPlaza("C");
        plazaVacante.setPlazaCiclo(new Integer(super.security().getOperationYear()));
        plazaVacante.setIdGrupoPago("V");
        
        // Plaza Respaldo
        if (creacionPlazaDTO.getPlazaRespaldo().intValue() != 0) {
            // Obtener la Plaza Soporte
            TdPlaza plazaSoporte = getPlaza(creacionPlazaDTO.getPlazaRespaldo());
            
            // Plaza Soporte Sueldo + Compensacion
            Double tabuladorPlazaSoporte = super.getSumaSueldoCompensacion(plazaSoporte.getIdPuestoPre(), plazaSoporte.getIdZonaEcoPre());
            
            // Plaza Nueva - Sueldo + Compensacion
            Double tabuladorNuevaPlaza = super.getSumaSueldoCompensacion(idPuestoConEspacios, creacionPlazaDTO.getIdZonaEco());
            
            // Comparacion de sumatorias
            int comparaTabulador = Double.compare(tabuladorPlazaSoporte, tabuladorNuevaPlaza);
            if (comparaTabulador < 0) {
                throw new ServiceException("El Código de puesto seleccionado es superior al Código de puesto presupuestado correspondiente a la Plaza soporte.");
            }
            
            // Asignacion Plaza Soporte
            plazaVacante.setPlazaRespaldo(creacionPlazaDTO.getPlazaRespaldo());
            
            // Update status de la PLaza
            plazaSoporte.setIdSitPlaza("S");
            super.persistence().get(TdPlazaDAO.class).save(plazaSoporte);
            
            // Movimiento de Persona - 504
            Integer idMovtoPersonaSoporte = super.getMovimientoPersonal("PLAZAS_CAMBIA_SITUACION_C_O_V_=_C");
            
            // Insert TN_MVTOS_EMP_PLA
            TnMovtosEmpPla tnMovtosEmpPla = SirehUtils.transformToTnMovtosEmpPla(empleado, plazaSoporte, idMovtoPersonaSoporte, mepQnaCaptura, usuario, new Date(), super.getAtributoPuesto(plazaVacante.getIdPuestoPre()));
            super.persistence().get(TnMovtosEmpPlaDAO.class).save(tnMovtosEmpPla);
        } else {
            plazaVacante.setPlazaRespaldo(new Integer(0));
        }
        
        plazaVacante.setIdProyReducePre("000000");
        plazaVacante.setIdProyAmpliaPre("000000");
        
        plazaVacante.setIdRangoPre(new Integer(0));
        plazaVacante.setIdRangoNom(new Integer(0));
        
        plazaVacante.setPlazaImpHono(0.0);
        plazaVacante.setIdMovtoPersona(idMovtoPersona);
        
        plazaVacante.setPlazaReferencia(creacionPlazaDTO.getPlazaReferencia());
        plazaVacante.setPlazaQnaCaptura(mepQnaCaptura);
        plazaVacante.setIdTipoPlaza("X");
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
        if (plaza == null || !(plaza.getIdSitPlaza().equals("C") || plaza.getIdSitPlaza().equals("V") || !plaza.getIdGrupoPago().equals("V"))) {
            liberaPlazaDTO = new LiberaPlazaDTO();
            liberaPlazaDTO.setIdSitPlaza("INVALIDA");
        } else {
            liberaPlazaDTO = super.transformation().map(plaza, LiberaPlazaDTO.class);
            
            // Datos Presupuestales
            String puesto = plaza.getIdPuestoPre();
            Integer zonaEconomica = plaza.getIdZonaEcoPre();
            Integer rango = plaza.getIdRangoPre();
            
            // Datos Nomina
            liberaPlazaDTO.setIdUnidad(plaza.getIdUnidadNom());
            liberaPlazaDTO.setIdEdo(plaza.getIdEdoNom());
            liberaPlazaDTO.setIdMuni(plaza.getIdMuniNom() != null ? plaza.getIdMuniNom() : new Integer(0));
            liberaPlazaDTO.setIdZonaEco(plaza.getIdZonaEcoNom());
            liberaPlazaDTO.setIdPuesto(plaza.getIdPuestoNom());
            liberaPlazaDTO.setIdRango(plaza.getIdRangoNom());
            
            // Etiquetas - Datos Presupuestales
            liberaPlazaDTO.setIdUnidadLabel(plaza.getIdUnidadPre());
            liberaPlazaDTO.setIdEdoLabel(plaza.getIdEdoPre());
            liberaPlazaDTO.setIdZonaEcoLabel(plaza.getIdZonaEcoPre());
            liberaPlazaDTO.setIdPuestoLabel(plaza.getIdPuestoPre());
            liberaPlazaDTO.setIdRangoLabel(plaza.getIdRangoPre());
             
            liberaPlazaDTO.setDatosFisicos(false);
            liberaPlazaDTO.setDatosPresupuestales(true);
            
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
        List<TcAtributoPuesto> puestos = super.persistence().get(QueryTdPlazaDAO.class).findCodigoPuesto(liberaPlazaDTO.getIdPuesto());
        TcAtributoPuesto puestoConEspacios = puestos.get(0);
        String idPuestoConEspacios = puestoConEspacios.getIdAtributoPuesto();
        
        // Paso 4) Validaciones 
        if (!plaza.getIdSitPlaza().equals("O")) {
            plazaVacante.setIdUnidadNom(liberaPlazaDTO.getIdUnidad());
            plazaVacante.setIdPuestoNom(idPuestoConEspacios);
            plazaVacante.setIdEdoNom(liberaPlazaDTO.getIdEdo());
            plazaVacante.setIdZonaEcoNom(liberaPlazaDTO.getIdZonaEco());
            plazaVacante.setIdMuniNom(liberaPlazaDTO.getIdMuni());
            plazaVacante.setIdRangoNom(HERRAMIENTA_AUXILIAR);
        }
        
        // Paso 5) Obtener Tabulador Anterior
        TcAtributoPuesto tcAtributoPuestoAnterior = super.getAtributoPuesto(plaza.getIdPuestoPre());
        TcTabulador tcTabuladorAnterior = super.getTabulador(tcAtributoPuestoAnterior, HERRAMIENTA_AUXILIAR, plaza.getIdZonaEcoPre());
        
        // Paso 6) Tabulador Anterior
        Double anteriorTabulador = Double.valueOf(tcTabuladorAnterior.getTabSueldo() + tcTabuladorAnterior.getTabCompensacion());
        
        // Paso 7) Validacion - Valores para Nivel Tabular seleccionado        
        TcTabulador tcTabulador = new TcTabulador();
        try { 
            //TcAtributoPuesto tcAtributoPuesto = super.getAtributoPuesto(liberaPlazaDTO.getIdPuesto());            
            TcAtributoPuesto tcAtributoPuesto = super.getAtributoPuesto(idPuestoConEspacios); 
            try { 
                // Obtener el tabulador sin espacios
                List<TcTabulador> tabuladores = super.persistence().get(QueryTdPlazaDAO.class).findTabulador(idPuestoConEspacios, liberaPlazaDTO.getIdZonaEco());
                tcTabulador = tabuladores.get(0);
            } catch (Exception ex) {
                throw new ServiceException("La Zona económica y/o Herramienta auxiliar de pago no son validas.");
            }
        } catch (Exception ex) {
            throw new ServiceException("Verifique la relación Código de puesto -  Zona económica - Herramienta auxiliar de pago.");
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
        // Fecha Inicial - RETROACTIVO 90 DIAS 
        if (SirehUtils.comparaFechaLiberacionRetroactivo(liberaPlazaDTO.getPlazaIniCont(),super.parameter().getString(RETROACTIVO_PAGO))) {
            // Deben ser Iguales
            plazaVacante.setPlazaIniCont(liberaPlazaDTO.getPlazaIniCont());
            plazaVacante.setPlazaUltimoMovto(liberaPlazaDTO.getPlazaIniCont());
        } else {
            throw new ServiceException("La Vigencia inicial debe estar dentro del rango retroactivo de 90 días.");
        }
        
        // Fecha Término
        if (liberaPlazaDTO.getPlazaIniCont() != null || liberaPlazaDTO.getPlazaFinCont() != null) {
            Date fechaInicial = (Date) liberaPlazaDTO.getPlazaIniCont();
            Date fechaFinal = (Date) liberaPlazaDTO.getPlazaFinCont();
            
            if (fechaInicial.compareTo(fechaFinal) > 0) {
                throw new ServiceException("El Término de vigencia no puede ser menor que la Vigencia inicial.");
            } else { 
                // Fecha limite respecto al año en curso
                if (SirehUtils.validaFechaFinal(mepQnaCaptura.toString(), liberaPlazaDTO.getPlazaFinCont())) {
                    plazaVacante.setPlazaFinCont(liberaPlazaDTO.getPlazaFinCont());
                } else {
                    throw new ServiceException("El Término de vigencia debe ser menor al 31 de Dic del año en curso.");
                }
                // La fehca inicial debe estar comprendida en el anio en curso
                int anioQuincenaCaptura = mepQnaCaptura / 100;
                int anioFechaInicial = SirehUtils.getYearFromDate(fechaFinal);
                if (anioFechaInicial != anioQuincenaCaptura) {
                    throw new ServiceException("La Vigencia inicial debe estar comprendida entre el 1 de Ene y el 31 de Dic del año en curso.");
                }
            }
        }
        
        // Paso 11) Obtener Valores adicionales de la plaza
        plazaVacante.setIdTipoPlaza(liberaPlazaDTO.getIdTipoPlaza());
        plazaVacante.setIdServPub(liberaPlazaDTO.getIdServPub());
        plazaVacante.setIdInmueble(liberaPlazaDTO.getIdInmueble() );
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
            plaza.getIdSitPlaza().equals("VT")) || !plaza.getIdGrupoPago().equals("V")) {
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
                cambioSitPlazaDTO.setIdMuniLabel(plaza.getIdMuniNom());
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
            //Etiquetas
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
                throw new ServiceException("La Vigencia de inicio no puede ser menor que la Fecha del Último movimiento.");
            } else {
                /*if (SirehUtils.comparaQuincenaCaptura(mepQnaCaptura, fechaInicial)) {
                    // Fecha limite respecto al año en curso
                    if (SirehUtils.validaFechaFinal(mepQnaCaptura.toString(), cambioSitPlazaDTO.getPlazaIniCont())) {                        
                        plazaVacante.setPlazaIniCont(cambioSitPlazaDTO.getPlazaIniCont());
                        plazaVacante.setPlazaUltimoMovto(cambioSitPlazaDTO.getPlazaIniCont());
                    } else {
                        throw new ServiceException("El Inicio de movimiento debe ser menor al 31 de Dic del año en curso.");
                    }
                } else {
                    throw new ServiceException("El Inicio de movimiento debe ser posterior a la Quincena de Captura.");
                }*/
                
                // Fecha Inicial - RETROACTIVO 90 DIAS 
                if (SirehUtils.comparaFechaLiberacionRetroactivo(cambioSitPlazaDTO.getPlazaIniCont(),super.parameter().getString(RETROACTIVO_PAGO))) {
                    // Deben ser Iguales
                    plazaVacante.setPlazaIniCont(cambioSitPlazaDTO.getPlazaIniCont());
                    plazaVacante.setPlazaUltimoMovto(cambioSitPlazaDTO.getPlazaIniCont());
                } else {
                    throw new ServiceException("La Vigencia de inicio debe estar dentro del rango retroactivo de 90 días.");
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
     * Metodo encargado de obtener el id de la Plaza para su Cambio de Puesto Físico.
     * @author Oscar S.
     * @param idPlaza Integer
     * @return cambioPtoFisicoPlazaDTO CambioPtoFisicoPlazaDTO
     */
    public CambioPtoFisicoPlazaDTO getCambioPtoFisicoPlaza(Integer idPlaza) {
        // Paso 1) Obtener la Plaza actual
        TdPlaza plaza = getPlaza(idPlaza);
        CambioPtoFisicoPlazaDTO cambioPtoFisicoPlazaDTO;
        
        // Valida Plaza
        if (plaza == null || !(
            plaza.getIdSitPlaza().equals("C") || 
            plaza.getIdSitPlaza().equals("O") ||
            plaza.getIdSitPlaza().equals("V")) || !plaza.getIdGrupoPago().equals("V")) {
            cambioPtoFisicoPlazaDTO = new CambioPtoFisicoPlazaDTO();
            cambioPtoFisicoPlazaDTO.setIdSitPlaza("INVALIDA");
        } else {
            cambioPtoFisicoPlazaDTO = super.transformation().map(plaza, CambioPtoFisicoPlazaDTO.class);
            
            String puesto;
            Integer zonaEconomica;
            Integer rango;
            // Situacion Ocupada - Datos Nomina
            if (plaza.getIdSitPlaza().equals("O")) {
                // Datos Nomina
                puesto = plaza.getIdPuestoNom();
                zonaEconomica = plaza.getIdZonaEcoNom();
                rango = plaza.getIdRangoNom();
                
                // Datos Nomina
                cambioPtoFisicoPlazaDTO.setIdPuesto(plaza.getIdPuestoNom());
                cambioPtoFisicoPlazaDTO.setIdZonaEco(plaza.getIdZonaEcoNom());
                cambioPtoFisicoPlazaDTO.setIdRango(plaza.getIdRangoNom());
                
                // Etiquetas
                cambioPtoFisicoPlazaDTO.setIdUnidadLabel(plaza.getIdUnidadNom());
                cambioPtoFisicoPlazaDTO.setIdEdoLabel(plaza.getIdEdoNom());
                cambioPtoFisicoPlazaDTO.setIdMuniLabel(plaza.getIdMuniNom());
                cambioPtoFisicoPlazaDTO.setIdZonaEcoLabel(plaza.getIdZonaEcoNom());
                cambioPtoFisicoPlazaDTO.setIdPuestoLabel(plaza.getIdPuestoNom());
                cambioPtoFisicoPlazaDTO.setIdRangoLabel(plaza.getIdRangoNom());
                
                cambioPtoFisicoPlazaDTO.setDatosFisicos(true);
                cambioPtoFisicoPlazaDTO.setDatosPresupuestales(false);
            } else {
                // Datos Presupuestales
                puesto = plaza.getIdPuestoPre();
                zonaEconomica = plaza.getIdZonaEcoPre();
                rango = plaza.getIdRangoPre();
                
                // Datos Nomina
                cambioPtoFisicoPlazaDTO.setIdPuesto(plaza.getIdPuestoNom());
                cambioPtoFisicoPlazaDTO.setIdZonaEco(plaza.getIdZonaEcoNom());
                cambioPtoFisicoPlazaDTO.setIdRango(plaza.getIdRangoNom());
                
                // Etiquetas
                cambioPtoFisicoPlazaDTO.setIdUnidadLabel(plaza.getIdUnidadPre());
                cambioPtoFisicoPlazaDTO.setIdEdoLabel(plaza.getIdEdoPre());
                cambioPtoFisicoPlazaDTO.setIdZonaEcoLabel(plaza.getIdZonaEcoPre());
                cambioPtoFisicoPlazaDTO.setIdPuestoLabel(plaza.getIdPuestoPre());
                cambioPtoFisicoPlazaDTO.setIdRangoLabel(plaza.getIdRangoPre());
                
                cambioPtoFisicoPlazaDTO.setDatosFisicos(false);
                cambioPtoFisicoPlazaDTO.setDatosPresupuestales(true);
            }
            
            // Paso 2) Obtener el Nivel Fisico
            TcAtributoPuesto tcAtributoPuesto = super.getAtributoPuesto(puesto);
            // Etiquetas
            cambioPtoFisicoPlazaDTO.setNivelFisicoLabel(tcAtributoPuesto.getIdNivelPto());
            cambioPtoFisicoPlazaDTO.setNombramientoLabel(tcAtributoPuesto.getIdNombramiento());

            // Paso 3) Obtener el sueldo y compensacion
            TcTabulador tcTabulador = super.getTabulador(tcAtributoPuesto, rango, zonaEconomica);
            cambioPtoFisicoPlazaDTO.setSueldo(tcTabulador.getTabSueldo());
            cambioPtoFisicoPlazaDTO.setCompensacion(tcTabulador.getTabCompensacion());
            // Etiquetas
            NumberFormat formatter = NumberFormat.getCurrencyInstance();
            String sueldoString = formatter.format(tcTabulador.getTabSueldo());
            cambioPtoFisicoPlazaDTO.setSueldoLabel(sueldoString);
            String compensacionString = formatter.format(tcTabulador.getTabCompensacion());
            cambioPtoFisicoPlazaDTO.setCompensacionLabel(compensacionString);
            
            // Paso 4) Obtener la situación de la plaza
            TcSitPlaza sitPlaza = super.persistence().get(TcSitPlazaDAO.class).getById(plaza.getIdSitPlaza());
            cambioPtoFisicoPlazaDTO.setDescSitPlaza(sitPlaza.getDescSitPlaza());
            
            // Ultimo Movimiento
            cambioPtoFisicoPlazaDTO.setUltimoMovto(plaza.getPlazaUltimoMovto());
        }
        return cambioPtoFisicoPlazaDTO;
    }
    
    /**
     * Metodo encargado de cambiar el puesto fisico de la Plaza con base en el objeto cambioPtoFisicoPlazaDTO.
     * @author Oscar S.
     * @param cambioPtoFisicoPlazaDTO CambioPtoFisicoPlazaDTO
     * @param usuario String
     */
    public void updateCambioPtoFisicoPlaza(CambioPtoFisicoPlazaDTO cambioPtoFisicoPlazaDTO, String usuario) {
        // Paso 1) Obtener el Empleado actual        
        TdEmpleado empleado = new TdEmpleado();
        
        // Paso 2) Obtener la Plaza actual
        TdPlaza plaza = getPlaza(cambioPtoFisicoPlazaDTO.getIdPlaza());
        
        // Obtener el puesto con/sin espacios
        List<TcAtributoPuesto> puestos = super.persistence().get(QueryTdPlazaDAO.class).findCodigoPuesto(cambioPtoFisicoPlazaDTO.getIdPuesto());
        TcAtributoPuesto puestoConEspacios = puestos.get(0);
        String idPuestoConEspacios = puestoConEspacios.getIdAtributoPuesto();
        
        // Paso 3) Preparar objeto Plaza
        TdPlaza plazaVacante = new TdPlaza();
        SirehUtils.copyProperties(plazaVacante, plaza);
        
        // Codigo de puesto Anterior
        String puesto = plaza.getIdPuestoPre();

        // Paso 4) Validaciones Dependientes al estatus de la Plaza
        if (cambioPtoFisicoPlazaDTO.getIdPuesto() == null || cambioPtoFisicoPlazaDTO.getIdPuesto().equals("") || cambioPtoFisicoPlazaDTO.getIdPuesto().equals("0")) {
            throw new ServiceException("El campo Código de puesto no puede ser vacio.");
        } else {
            //plazaVacante.setIdPuestoNom(cambioPtoFisicoPlazaDTO.getIdPuesto());
            // Se afecta el puesto presupuestal y de nomina
            plazaVacante.setIdPuestoPre(idPuestoConEspacios);
            plazaVacante.setIdPuestoNom(idPuestoConEspacios);
        }
        //if (idPuestoConEspacios.equals(puesto)) {
        //    throw new ServiceException("Seleccione un Código de puesto diferente.");
        //}
        if (cambioPtoFisicoPlazaDTO.getIdZonaEco() == null || cambioPtoFisicoPlazaDTO.getIdZonaEco().intValue() == 0) {
            throw new ServiceException("El campo Zona económica no puede ser vacio.");
        } else {
            plazaVacante.setIdZonaEcoNom(cambioPtoFisicoPlazaDTO.getIdZonaEco());
        }
        
        // Paso 5) Quincena de Captura
        Integer mepQnaCaptura = super.getQuincenaCaptura().intValue();
        
        // Paso 6) Validaciones Independientes al estatus de la Plaza
        if (cambioPtoFisicoPlazaDTO.getPlazaIniCont() != null || plaza.getPlazaUltimoMovto() != null) {
            Date fechaInicial = (Date) cambioPtoFisicoPlazaDTO.getPlazaIniCont();
            Date fechaFinal = (Date) plaza.getPlazaUltimoMovto();
            
            if (fechaInicial.compareTo(fechaFinal) < 0) {
                throw new ServiceException("La Vigencia de inicio no puede ser menor que la Fecha del Último movimiento.");
            } else {
                /*if (SirehUtils.comparaQuincenaCaptura(mepQnaCaptura, fechaInicial)) {
                    // Fecha limite respecto al año en curso
                    if (SirehUtils.validaFechaFinal(mepQnaCaptura.toString(), cambioPtoFisicoPlazaDTO.getPlazaIniCont())) {
                        // Deben ser iguales
                        plazaVacante.setPlazaIniCont(cambioPtoFisicoPlazaDTO.getPlazaIniCont());
                        plazaVacante.setPlazaUltimoMovto(cambioPtoFisicoPlazaDTO.getPlazaIniCont());
                    } else {
                        throw new ServiceException("El Inicio de movimiento debe ser menor al 31 de Dic del año en curso.");
                    }
                } else {
                    throw new ServiceException("El Inicio de movimiento debe ser posterior a la Quincena de Captura.");
                }*/
                
                // Fecha Inicial - RETROACTIVO 90 DIAS 
                if (SirehUtils.comparaFechaLiberacionRetroactivo(cambioPtoFisicoPlazaDTO.getPlazaIniCont(),super.parameter().getString(RETROACTIVO_PAGO))) {
                    // Deben ser Iguales
                    plazaVacante.setPlazaIniCont(cambioPtoFisicoPlazaDTO.getPlazaIniCont());
                    plazaVacante.setPlazaUltimoMovto(cambioPtoFisicoPlazaDTO.getPlazaIniCont());
                } else {
                    throw new ServiceException("La Vigencia de inicio debe estar dentro del rango retroactivo de 90 días.");
                }
            }
        }
        plazaVacante.setPlazaReferencia(cambioPtoFisicoPlazaDTO.getPlazaReferencia());
        
        // Paso 7) Movimiento Persona
        Integer idMovtoPersona;
        if (verificaCambioPtoFisicoPlaza(cambioPtoFisicoPlazaDTO)) {
            // Cambio de Puesto Físico Sobrevaluado - 513
            idMovtoPersona = super.getMovimientoPersonal("CAMBIO_PUESTO_FISICO_SOBREVALUADA");
        } else {
            // Cambio de Puesto Físico - 503
            idMovtoPersona = super.getMovimientoPersonal("PROMOCION_CAMBIO_DE_PUESTO_FISICO");
        }
        
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
     * Metodo encargado de verificar si un Código de puesto está sobrevaluado.
     * @author Oscar S.
     * @param cambioPtoFisicoPlazaDTO CambioPtoFisicoPlazaDTO
     * @return boolean
     */
    public boolean verificaCambioPtoFisicoPlaza(CambioPtoFisicoPlazaDTO cambioPtoFisicoPlazaDTO) {
        // Paso 1) Obtener la Plaza actual
        TdPlaza plaza = getPlaza(cambioPtoFisicoPlazaDTO.getIdPlaza());
        
        // Obtener el puesto con/sin espacios
        List<TcAtributoPuesto> puestos = super.persistence().get(QueryTdPlazaDAO.class).findCodigoPuesto(cambioPtoFisicoPlazaDTO.getIdPuesto());
        TcAtributoPuesto puestoConEspacios = puestos.get(0);
        String idPuestoConEspacios = puestoConEspacios.getIdAtributoPuesto();
        
        // Código de Puesto de acuerdo al presupuesto
        String puesto = plaza.getIdPuestoPre().toUpperCase();
        if (puesto.equals(idPuestoConEspacios.toUpperCase())) {
        } else {
            // Paso 2) Obtener Tabulador Nuevo
            TcAtributoPuesto tcAtributoPuesto = super.getAtributoPuesto(cambioPtoFisicoPlazaDTO.getIdPuesto());
            // Obtener el tabulador con/sin espacios
            List<TcTabulador> tabuladores = super.persistence().get(QueryTdPlazaDAO.class).findTabulador(idPuestoConEspacios, cambioPtoFisicoPlazaDTO.getIdZonaEco());
            TcTabulador tcTabulador = tabuladores.get(0);
                
            // Paso 3) Obtener Tabulador Anterior
            TcAtributoPuesto tcAtributoPuestoAnterior = super.getAtributoPuesto(puesto);
            // Obtener el tabulador con/sin espacios
            List<TcTabulador> tabuladoresAnteriores = super.persistence().get(QueryTdPlazaDAO.class).findTabulador(tcAtributoPuestoAnterior.getIdAtributoPuesto(), plaza.getIdZonaEcoPre());
            TcTabulador tcTabuladorAnterior = tabuladoresAnteriores.get(0);
             
            // Paso 4) Obtener Suma de Tabuladores
            Double anteriorTabulador = Double.valueOf(tcTabuladorAnterior.getTabSueldo() + tcTabuladorAnterior.getTabCompensacion());
            Double nuevoTabulador = Double.valueOf(tcTabulador.getTabSueldo() + tcTabulador.getTabCompensacion());
            
            // Paso 5) Validacion - Valores para Nivel Tabular seleccionado VS Nivel Tabular presupuestado
            int comparaTabulador = Double.compare(anteriorTabulador, nuevoTabulador);
            if (comparaTabulador < 0) {
                return true;
            }
        }
        return false;
    }
    
    /**
     * Metodo encargado de obtener el id de la Plaza para su Cambio de Unidad Responsable.
     * @author Oscar S.
     * @param idPlaza Integer
     * @return cambioURFisicaPlazaDTO CambioURFisicaPlazaDTO
     */
    public CambioURFisicaPlazaDTO getCambioURFisicaPlaza(Integer idPlaza) {
        // Paso 1) Obtener la Plaza actual
        TdPlaza plaza = getPlaza(idPlaza);
        CambioURFisicaPlazaDTO cambioURFisicaPlazaDTO;
        
        // Valida Plaza
        if (plaza == null || !(
            plaza.getIdSitPlaza().equals("C") || 
            plaza.getIdSitPlaza().equals("O") ||
            plaza.getIdSitPlaza().equals("V")) || !plaza.getIdGrupoPago().equals("V")) {
            cambioURFisicaPlazaDTO = new CambioURFisicaPlazaDTO();
            cambioURFisicaPlazaDTO.setIdSitPlaza("INVALIDA");
        } else {
            cambioURFisicaPlazaDTO = super.transformation().map(plaza, CambioURFisicaPlazaDTO.class);
            
            String puesto;
            Integer zonaEconomica;
            Integer rango;
            // Situacion Ocupada - Datos Nomina
            if (plaza.getIdSitPlaza().equals("O")) {
                // Datos Nomina
                puesto = plaza.getIdPuestoNom();
                zonaEconomica = plaza.getIdZonaEcoNom();
                rango = plaza.getIdRangoNom();
                
                // Datos Nomina
                cambioURFisicaPlazaDTO.setIdUnidad(plaza.getIdUnidadNom());
                cambioURFisicaPlazaDTO.setIdEdo(plaza.getIdEdoNom());
                cambioURFisicaPlazaDTO.setIdMuni(plaza.getIdMuniNom());
                cambioURFisicaPlazaDTO.setIdPuesto(plaza.getIdPuestoNom());
                cambioURFisicaPlazaDTO.setIdZonaEco(plaza.getIdZonaEcoNom());
                cambioURFisicaPlazaDTO.setIdRango(plaza.getIdRangoNom());
                
                // Etiquetas
                cambioURFisicaPlazaDTO.setIdUnidadLabel(plaza.getIdUnidadNom());
                cambioURFisicaPlazaDTO.setIdEdoLabel(plaza.getIdEdoNom());
                cambioURFisicaPlazaDTO.setIdMuniLabel(plaza.getIdMuniNom());
                cambioURFisicaPlazaDTO.setIdZonaEcoLabel(plaza.getIdZonaEcoNom());
                cambioURFisicaPlazaDTO.setIdPuestoLabel(plaza.getIdPuestoNom());
                cambioURFisicaPlazaDTO.setIdRangoLabel(plaza.getIdRangoNom());
                
                cambioURFisicaPlazaDTO.setDatosFisicos(true);
                cambioURFisicaPlazaDTO.setDatosPresupuestales(false);
            } else {
                // Datos Presupuestales
                puesto = plaza.getIdPuestoPre();
                zonaEconomica = plaza.getIdZonaEcoPre();
                rango = plaza.getIdRangoPre();
                
                // Datos Nomina
                cambioURFisicaPlazaDTO.setIdUnidad(plaza.getIdUnidadNom());
                cambioURFisicaPlazaDTO.setIdEdo(plaza.getIdEdoNom());
                cambioURFisicaPlazaDTO.setIdPuesto(plaza.getIdPuestoNom());
                cambioURFisicaPlazaDTO.setIdZonaEco(plaza.getIdZonaEcoNom());
                cambioURFisicaPlazaDTO.setIdRango(plaza.getIdRangoNom());
                
                // Etiquetas
                cambioURFisicaPlazaDTO.setIdUnidadLabel(plaza.getIdUnidadPre());
                cambioURFisicaPlazaDTO.setIdEdoLabel(plaza.getIdEdoPre());
                cambioURFisicaPlazaDTO.setIdZonaEcoLabel(plaza.getIdZonaEcoPre());
                cambioURFisicaPlazaDTO.setIdPuestoLabel(plaza.getIdPuestoPre());
                cambioURFisicaPlazaDTO.setIdRangoLabel(plaza.getIdRangoPre());
                
                cambioURFisicaPlazaDTO.setDatosFisicos(false);
                cambioURFisicaPlazaDTO.setDatosPresupuestales(true);
            }
            
            // Paso 2) Obtener el Nivel Fisico
            TcAtributoPuesto tcAtributoPuesto = super.getAtributoPuesto(puesto); 
            // Etiquetas
            cambioURFisicaPlazaDTO.setNivelFisicoLabel(tcAtributoPuesto.getIdNivelPto());
            cambioURFisicaPlazaDTO.setNombramientoLabel(tcAtributoPuesto.getIdNombramiento());

            // Paso 3) Obtener el sueldo y compensacion
            TcTabulador tcTabulador = super.getTabulador(tcAtributoPuesto, rango, zonaEconomica);
            // Etiquetas
            NumberFormat formatter = NumberFormat.getCurrencyInstance();
            String sueldoString = formatter.format(tcTabulador.getTabSueldo());
            cambioURFisicaPlazaDTO.setSueldoLabel(sueldoString);
            String compensacionString = formatter.format(tcTabulador.getTabCompensacion());
            cambioURFisicaPlazaDTO.setCompensacionLabel(compensacionString);
            
            // Paso 4) Obtener la situación de la plaza
            TcSitPlaza sitPlaza = super.persistence().get(TcSitPlazaDAO.class).getById(plaza.getIdSitPlaza());
            cambioURFisicaPlazaDTO.setDescSitPlaza(sitPlaza.getDescSitPlaza());
            
            //Ultimo Movimiento
            cambioURFisicaPlazaDTO.setUltimoMovto(plaza.getPlazaUltimoMovto());
        }
        return cambioURFisicaPlazaDTO;
    }
    
    /**
     * Metodo encargado de cambiar la Unidad Responsable de la Plaza con base en el objeto CambioURFisicaPlazaDTO.
     * @author Oscar S.
     * @param cambioURFisicaPlazaDTO CambioURFisicaPlazaDTO
     * @param usuario String
     */
    public void updateCambioURFisicaPlaza(CambioURFisicaPlazaDTO cambioURFisicaPlazaDTO, String usuario) {
        // Paso 1) Obtener el Empleado actual        
        TdEmpleado empleado = new TdEmpleado();
        
        // Paso 2) Obtener la Plaza actual
        TdPlaza plaza = getPlaza(cambioURFisicaPlazaDTO.getIdPlaza());
        
        // Paso 3) Preparar objeto Plaza
        TdPlaza plazaVacante = new TdPlaza();
        SirehUtils.copyProperties(plazaVacante, plaza);
        
        // Paso 4) Validaciones Dependientes al estatus de la Plaza
        // Se afecta la unidad presupuestal y de nomina
        if (cambioURFisicaPlazaDTO.getIdUnidad().equals("XXX") || cambioURFisicaPlazaDTO.getIdUnidad().equals("X01") ||
            cambioURFisicaPlazaDTO.getIdUnidad().equals("X02") || cambioURFisicaPlazaDTO.getIdUnidad().equals("X03") ||
            cambioURFisicaPlazaDTO.getIdUnidad().equals("X04") || cambioURFisicaPlazaDTO.getIdUnidad().equals("X05") ||
            cambioURFisicaPlazaDTO.getIdUnidad().equals("X06") || cambioURFisicaPlazaDTO.getIdUnidad().equals("X07") ||
            cambioURFisicaPlazaDTO.getIdUnidad().equals("X08") || cambioURFisicaPlazaDTO.getIdUnidad().equals("X09") ||
            cambioURFisicaPlazaDTO.getIdUnidad().equals("X10") || cambioURFisicaPlazaDTO.getIdUnidad().equals("X11") ||
            cambioURFisicaPlazaDTO.getIdUnidad().equals("X12") || cambioURFisicaPlazaDTO.getIdUnidad().equals("X13") ||
            cambioURFisicaPlazaDTO.getIdUnidad().equals("X14") || cambioURFisicaPlazaDTO.getIdUnidad().equals("X15") ||
            cambioURFisicaPlazaDTO.getIdUnidad().equals("X16") || cambioURFisicaPlazaDTO.getIdUnidad().equals("X17") ||
            cambioURFisicaPlazaDTO.getIdUnidad().equals("X18") || cambioURFisicaPlazaDTO.getIdUnidad().equals("X19") ||
            cambioURFisicaPlazaDTO.getIdUnidad().equals("X20") || cambioURFisicaPlazaDTO.getIdUnidad().equals("X21") ||
            cambioURFisicaPlazaDTO.getIdUnidad().equals("X22") || cambioURFisicaPlazaDTO.getIdUnidad().equals("X23") ||
            cambioURFisicaPlazaDTO.getIdUnidad().equals("X24") || cambioURFisicaPlazaDTO.getIdUnidad().equals("X25")) {
            plazaVacante.setIdUnidadNom(cambioURFisicaPlazaDTO.getIdUnidad());
        } else {
            plazaVacante.setIdUnidadPre(cambioURFisicaPlazaDTO.getIdUnidad());
            plazaVacante.setIdUnidadNom(cambioURFisicaPlazaDTO.getIdUnidad());
        }
        
        plazaVacante.setIdEdoPre(cambioURFisicaPlazaDTO.getIdEdo());
        plazaVacante.setIdEdoNom(cambioURFisicaPlazaDTO.getIdEdo());
             
        if (cambioURFisicaPlazaDTO.getIdMuni() == null) {
            throw new ServiceException("El campo Municipio no puede ser vacio.");
        } else {
            plazaVacante.setIdMuniNom(cambioURFisicaPlazaDTO.getIdMuni());
        }
        
        // Paso 5) Validaciones Independientes al estatus de la Plaza
        if (cambioURFisicaPlazaDTO.getIdZonaDistNom() == null || cambioURFisicaPlazaDTO.getIdZonaDistNom().intValue() == 0) {
            throw new ServiceException("El campo Zona pagadora no puede ser vacio.");
        } else {
            plazaVacante.setIdZonaDistNom(cambioURFisicaPlazaDTO.getIdZonaDistNom());
        }
        
        // Paso 6) Quincena de Captura
        Integer mepQnaCaptura = super.getQuincenaCaptura().intValue();
        
        if (cambioURFisicaPlazaDTO.getPlazaIniCont() != null || plaza.getPlazaUltimoMovto() != null) {
            Date fechaInicial = (Date) cambioURFisicaPlazaDTO.getPlazaIniCont();
            Date fechaFinal = (Date) plaza.getPlazaUltimoMovto();
            
            if (fechaInicial.compareTo(fechaFinal) < 0) {
                throw new ServiceException("La Vigencia de inicio no puede ser menor que la Fecha del Último movimiento.");
            } else {
                /*if (SirehUtils.comparaQuincenaCaptura(mepQnaCaptura, fechaInicial)) {
                    // Deben ser iguales
                    plazaVacante.setPlazaIniCont(cambioURFisicaPlazaDTO.getPlazaIniCont());
                    plazaVacante.setPlazaUltimoMovto(cambioURFisicaPlazaDTO.getPlazaIniCont());
                } else {
                    throw new ServiceException("El Inicio de movimiento debe ser posterior a la Quincena de Captura.");
                }*/
                
                 // Fecha Inicial - RETROACTIVO 90 DIAS 
                 if (SirehUtils.comparaFechaLiberacionRetroactivo(cambioURFisicaPlazaDTO.getPlazaIniCont(),super.parameter().getString(RETROACTIVO_PAGO))) {
                     // Deben ser Iguales
                     plazaVacante.setPlazaIniCont(cambioURFisicaPlazaDTO.getPlazaIniCont());
                     plazaVacante.setPlazaUltimoMovto(cambioURFisicaPlazaDTO.getPlazaIniCont());
                 } else {
                     throw new ServiceException("La Vigencia de inicio debe estar dentro del rango retroactivo de 90 días.");
                 }
            }
        }
        Date fechaInicial2 = (Date) cambioURFisicaPlazaDTO.getPlazaIniCont();
        Date fechaFinal2 = (Date) cambioURFisicaPlazaDTO.getPlazaFinCont();
        
        if (fechaInicial2.compareTo(fechaFinal2) > 0) {
            throw new ServiceException("El campo Término de vigencia no puede ser menor que la Vigencia de inicio.");
        } else {
            // Fecha limite respecto al año en curso
            if (SirehUtils.validaFechaFinal(mepQnaCaptura.toString(), cambioURFisicaPlazaDTO.getPlazaFinCont())) {                        
                plazaVacante.setPlazaFinCont(cambioURFisicaPlazaDTO.getPlazaFinCont());
            } else {
                throw new ServiceException("El campo Término de vigencia debe ser menor al 31 de Dic del año en curso.");
            }
        }
        
        // Paso 7) Movimiento Persona - 502
        Integer idMovtoPersona = super.getMovimientoPersonal("CAMBIO_DE_ADSCRIPCION");
        
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
     * Metodo encargado de eliminar Plazas de Tipo Eventual.
     * @author Oscar S.
     * @param idPlazas Integer[]
     * @param usuario String
     */
    public void depuraPlazas(Integer[] idPlazas, String usuario) {
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
            if (plaza.getPlazaRespaldo() == 0 && plaza.getIdGrupoPago().equals("V") && (plaza.getIdSitPlaza().equals("C") || plaza.getIdSitPlaza().equals("V"))) {
                
                // Insert TN_MVTOS_EMP_PLA - 528
                TnMovtosEmpPla tnMovtosEmpPla = SirehUtils.transformToTnMovtosEmpPla(empleado, plaza, idMovtoPersona, mepQnaCaptura, usuario, new Date(), super.getAtributoPuesto(plaza.getIdPuestoPre()));
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
        if (plaza == null || !plaza.getIdSitPlaza().equals("O") || !plaza.getIdGrupoPago().equals("V")) {
            prorrogaContratoDTO = new ProrrogaContratoDTO();
            prorrogaContratoDTO.setIdSitPlaza("INVALIDA");
        } else {
            prorrogaContratoDTO = super.transformation().map(plaza, ProrrogaContratoDTO.class);
            
            String puesto = "";
            Integer zonaEconomica = new Integer(0);
            Integer rango = new Integer(0);
            
            // Situacion Ocupada - Datos Nomina
            if (plaza.getIdSitPlaza().equals("O")) {
                // Datos Nomina
                puesto = plaza.getIdPuestoNom();
                zonaEconomica = plaza.getIdZonaEcoNom();
                rango = plaza.getIdRangoNom();
                
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
            }
            
            // Paso 2) Obtener el Nivel Fisico
            TcAtributoPuesto tcAtributoPuesto = super.getAtributoPuesto(puesto); 
            // Etiquetas
            prorrogaContratoDTO.setNivelFisicoLabel(tcAtributoPuesto.getIdNivelPto());
            prorrogaContratoDTO.setNombramientoLabel(tcAtributoPuesto.getIdNombramiento());

            // Paso 3) Obtener el sueldo y compensacion
            TcTabulador tcTabulador = super.getTabulador(tcAtributoPuesto, rango, zonaEconomica);
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
                throw new ServiceException("La Vigencia inicial no puede ser menor que la Fecha del Último movimiento.");
            } else {
                /*if (SirehUtils.comparaQuincenaCaptura(mepQnaCaptura, fechaInicial)) {
                    // Deben ser iguales
                    plazaVacante.setPlazaIniCont(prorrogaContratoDTO.getPlazaIniCont());
                    plazaVacante.setPlazaUltimoMovto(prorrogaContratoDTO.getPlazaIniCont());
                } else {
                    throw new ServiceException("El Inicio de Contrato debe ser posterior a la Quincena de Captura.");
                }*/
                
                // Fecha Inicial - RETROACTIVO 90 DIAS 
                if (SirehUtils.comparaFechaLiberacionRetroactivo(prorrogaContratoDTO.getPlazaIniCont(),super.parameter().getString(RETROACTIVO_PAGO))) {
                    // Deben ser Iguales
                    plazaVacante.setPlazaIniCont(prorrogaContratoDTO.getPlazaIniCont());
                    plazaVacante.setPlazaUltimoMovto(prorrogaContratoDTO.getPlazaIniCont());
                } else {
                    throw new ServiceException("La Vigencia inicial debe estar dentro del rango retroactivo de 90 días.");
                }
            }
        }
        Date fechaInicial2 = (Date) prorrogaContratoDTO.getPlazaIniCont();
        Date fechaFinal2 = (Date) prorrogaContratoDTO.getPlazaFinCont();
        
        if (fechaInicial2.compareTo(fechaFinal2) > 0) {
            throw new ServiceException("El campo Término de vigencia no puede ser menor que la Vigencia de inicio.");
        } else {
            // Fecha limite respecto al año en curso
            if (SirehUtils.validaFechaFinal(mepQnaCaptura.toString(), prorrogaContratoDTO.getPlazaFinCont())) {                        
                plazaVacante.setPlazaFinCont(prorrogaContratoDTO.getPlazaFinCont());
            } else {
                throw new ServiceException("El campo Término de vigencia debe ser menor al 31 de Dic del año en curso.");
            }
        }
        
        // Paso 6) Movimiento Personal - 522 ó 538
        Integer idMovtoPersona = prorrogaContratoDTO.getTipoMovimiento().equals("PCE") ? super.getMovimientoPersonal("PRORROGA_DE_CONTRATO_EVENTUAL") : super.getMovimientoPersonal("MOVIMIENTO_EVENTUAL");
        
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
     * Metodo encargado de obtener el id de la Plaza para modificar el Tipo de SP.
     * @author Oscar S.
     * @param idPlaza Integer
     * @return modificaTipoSPDTO ModificaTipoSPDTO
     */
    public ModificaTipoSPDTO getModificaTipoSP(Integer idPlaza) {
        // Paso 1) Obtener la Plaza actual
        TdPlaza plaza = getPlaza(idPlaza);
        ModificaTipoSPDTO modificaTipoSPDTO;
        
        // Valida Plaza
        if (plaza == null || !(
            plaza.getIdSitPlaza().equals("C") || 
            plaza.getIdSitPlaza().equals("V") || 
            plaza.getIdSitPlaza().equals("O")) || !plaza.getIdGrupoPago().equals("V")) {
            modificaTipoSPDTO = new ModificaTipoSPDTO();
            modificaTipoSPDTO.setIdSitPlaza("INVALIDA");
        } else {
            modificaTipoSPDTO = super.transformation().map(plaza, ModificaTipoSPDTO.class);
            
            String puesto = "";
            Integer zonaEconomica = new Integer(0);
            Integer rango = new Integer(0);
            
            // Situacion Ocupada - Datos Nomina
            puesto = plaza.getIdPuestoNom();
            zonaEconomica = plaza.getIdZonaEcoNom();
            rango = plaza.getIdRangoNom();
            
            // Datos Nomina
            modificaTipoSPDTO.setIdUnidad(plaza.getIdUnidadNom());
            modificaTipoSPDTO.setIdEdo(plaza.getIdEdoNom());
            modificaTipoSPDTO.setIdMuni(plaza.getIdMuniNom());
            modificaTipoSPDTO.setIdPuesto(plaza.getIdPuestoNom());
            modificaTipoSPDTO.setIdZonaEco(plaza.getIdZonaEcoNom());
            modificaTipoSPDTO.setIdRango(plaza.getIdRangoNom());
            
            // Etiquetas
            modificaTipoSPDTO.setIdUnidadLabel(plaza.getIdUnidadNom());
            modificaTipoSPDTO.setIdEdoLabel(plaza.getIdEdoNom());
            modificaTipoSPDTO.setIdMuniLabel(plaza.getIdMuniNom());
            modificaTipoSPDTO.setIdZonaEcoLabel(plaza.getIdZonaEcoNom());
            modificaTipoSPDTO.setIdPuestoLabel(plaza.getIdPuestoNom());
            modificaTipoSPDTO.setIdRangoLabel(plaza.getIdRangoNom());
            
            modificaTipoSPDTO.setDatosFisicos(true);
            modificaTipoSPDTO.setDatosPresupuestales(false);
            
            //Tipo de Plaza
            TcTipoPlaza tipoPlaza = super.persistence().get(TcTipoPlazaDAO.class).getById(plaza.getIdTipoPlaza());
            modificaTipoSPDTO.setIdTipoPlazaLabel(tipoPlaza.getIdTipoPlaza() + " - " + tipoPlaza.getDescTipoPlaza());
             
            // Servidor Publico
            TcTipoServPub servPub = super.persistence().get(TcTipoServPubDAO.class).getById(plaza.getIdServPub());
            modificaTipoSPDTO.setIdServPubLabel(servPub.getIdServPub() + " - " + servPub.getDescTipoServPub());
            
            // Paso 2) Obtener el Nivel Fisico
            TcAtributoPuesto tcAtributoPuesto = super.getAtributoPuesto(puesto); 
            // Etiquetas
            modificaTipoSPDTO.setNivelFisicoLabel(tcAtributoPuesto.getIdNivelPto());
            modificaTipoSPDTO.setNombramientoLabel(tcAtributoPuesto.getIdNombramiento());

            // Paso 3) Obtener el sueldo y compensacion
            TcTabulador tcTabulador = super.getTabulador(tcAtributoPuesto, rango, zonaEconomica);
            // Etiquetas
            NumberFormat formatter = NumberFormat.getCurrencyInstance();
            String sueldoString = formatter.format(tcTabulador.getTabSueldo());
            modificaTipoSPDTO.setSueldoLabel(sueldoString);
            String compensacionString = formatter.format(tcTabulador.getTabCompensacion());
            modificaTipoSPDTO.setCompensacionLabel(compensacionString);
            
            // Paso 4) Obtener la situación de la plaza
            TcSitPlaza sitPlaza = super.persistence().get(TcSitPlazaDAO.class).getById(plaza.getIdSitPlaza());
            modificaTipoSPDTO.setDescSitPlaza(sitPlaza.getDescSitPlaza());
            
            // Ultimo Movimiento
            modificaTipoSPDTO.setUltimoMovto(plaza.getPlazaUltimoMovto());
        }
        return modificaTipoSPDTO;
    }
    
    /**
     * Metodo encargado de modificar el Tipo de SP de la Plaza con base en el objeto modificaTipoSPDTO.
     * @author Oscar S.
     * @param modificaTipoSPDTO ModificaTipoSPDTO
     * @param usuario String
     */
    public void updateModificaTipoSP(ModificaTipoSPDTO modificaTipoSPDTO, String usuario) {
        // Paso 1) Obtener la Plaza actual
        TdPlaza plaza = getPlaza(modificaTipoSPDTO.getIdPlaza());
        
        // Paso 2) Obtener el Empleado actual        
        TdEmpleado empleado = new TdEmpleado();
        
        // Paso 3) Preparar objeto Plaza
        TdPlaza plazaVacante = new TdPlaza();
        SirehUtils.copyProperties(plazaVacante, plaza);
        
        // Paso 4) Quincena de Captura
        Integer mepQnaCaptura = super.getQuincenaCaptura().intValue();
        
        // Paso 5) Validacion de fechas
        if (modificaTipoSPDTO.getPlazaIniCont() != null || plaza.getPlazaUltimoMovto() != null) {
            Date fechaInicial = (Date) modificaTipoSPDTO.getPlazaIniCont();
            Date fechaFinal = (Date) plaza.getPlazaUltimoMovto();
            
            if (fechaInicial.compareTo(fechaFinal) < 0) {
                throw new ServiceException("La Vigencia inicial no puede ser menor que la Fecha del Último movimiento.");
            } else {
                /*if (SirehUtils.comparaQuincenaCaptura(mepQnaCaptura, fechaInicial)) {
                    // Deben ser iguales
                    plazaVacante.setPlazaIniCont(modificaTipoSPDTO.getPlazaIniCont());
                    plazaVacante.setPlazaUltimoMovto(modificaTipoSPDTO.getPlazaIniCont());
                } else {
                    throw new ServiceException("El Inicio de Contrato debe ser posterior a la Quincena de Captura.");
                }*/
                
                // Fecha Inicial - RETROACTIVO 90 DIAS 
                if (SirehUtils.comparaFechaLiberacionRetroactivo(modificaTipoSPDTO.getPlazaIniCont(),super.parameter().getString(RETROACTIVO_PAGO))) {
                    // Deben ser Iguales
                    plazaVacante.setPlazaIniCont(modificaTipoSPDTO.getPlazaIniCont());
                    plazaVacante.setPlazaUltimoMovto(modificaTipoSPDTO.getPlazaIniCont());
                } else {
                    throw new ServiceException("La Vigencia inicial debe estar dentro del rango retroactivo de 90 días.");
                }
            }
        }
        Date fechaInicial2 = (Date) modificaTipoSPDTO.getPlazaIniCont();
        Date fechaFinal2 = (Date) modificaTipoSPDTO.getPlazaFinCont();
        
        if (fechaInicial2.compareTo(fechaFinal2) > 0) {
            throw new ServiceException("El campo Término de vigencia no puede ser menor que el Vigencia inicial.");
        } else {
            // Fecha limite respecto al año en curso
            if (SirehUtils.validaFechaFinal(mepQnaCaptura.toString(), modificaTipoSPDTO.getPlazaFinCont())) {                        
                plazaVacante.setPlazaFinCont(modificaTipoSPDTO.getPlazaFinCont());
            } else {
                throw new ServiceException("El campo Término de vigencia debe ser menor al 31 de Dic del año en curso.");
            }
        }
        
        // Paso 6) Obtener Valores adicionales de la plaza
        // X – NO LE APLICA AL SISTEMA DE CARRERA
        plazaVacante.setIdTipoPlaza("X");
        
        if (modificaTipoSPDTO.getIdServPub().equals(plaza.getIdServPub())) {
            throw new ServiceException("Seleccione un Tipo de Servidor público diferente al anterior.");
        } else {
            plazaVacante.setIdServPub(modificaTipoSPDTO.getIdServPub());
        }
        
        // Paso 7) Movimiento Personal - 527
        Integer idMovtoPersona = super.getMovimientoPersonal("CAMBIO_DE_TIPO_DE_SERVIDOR_PUBLICO");
        
        // Paso 8) Update Plaza Vacante
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
