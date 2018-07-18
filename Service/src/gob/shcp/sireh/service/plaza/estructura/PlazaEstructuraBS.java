package gob.shcp.sireh.service.plaza.estructura;

import gob.shcp.fsn.service.ServiceException;

import gob.shcp.sireh.data.jdbc.QueryTcPuestoVacanciaDAO;
import gob.shcp.sireh.data.jdbc.QueryTdPlazaDAO;
import gob.shcp.sireh.data.jdbc.TcSitPlazaDAO;
import gob.shcp.sireh.data.jdbc.TcSituacionOkDAO;
import gob.shcp.sireh.data.jdbc.TcTipoPlazaDAO;
import gob.shcp.sireh.data.jdbc.TcTipoServPubDAO;
import gob.shcp.sireh.data.jdbc.TcVacanciaDAO;
import gob.shcp.sireh.data.jdbc.TdEmpleadoDAO;
import gob.shcp.sireh.data.jdbc.TdPlazaDAO;
import gob.shcp.sireh.data.jdbc.TnMovtosEmpPlaDAO;


import gob.shcp.sireh.data.jdbc.plaza.estructura.QueryTdPlazaConcursoDAO;
import gob.shcp.sireh.data.jdbc.plaza.estructura.TdHistoriaDesiertaDAO;
import gob.shcp.sireh.data.jdbc.plaza.estructura.TdPlazaConcursoDAO;
import gob.shcp.sireh.domain.jdbc.Item;
import gob.shcp.sireh.domain.jdbc.TcAtributoPuesto;
import gob.shcp.sireh.domain.jdbc.TcSitPlaza;

import gob.shcp.sireh.domain.jdbc.TcSituacionOk;
import gob.shcp.sireh.domain.jdbc.TcSituacionOkPK;
import gob.shcp.sireh.domain.jdbc.TcTabulador;
import gob.shcp.sireh.domain.jdbc.TcTipoPlaza;
import gob.shcp.sireh.domain.jdbc.TcTipoServPub;
import gob.shcp.sireh.domain.jdbc.TcVacancia;
import gob.shcp.sireh.domain.jdbc.TdEmpleado;
import gob.shcp.sireh.domain.jdbc.TdPlaza;
import gob.shcp.sireh.domain.jdbc.TnMovtosEmpPla;

import gob.shcp.sireh.domain.jdbc.plaza.estructura.CustomTdPlazaEnConcurso;
import gob.shcp.sireh.domain.jdbc.plaza.estructura.TdHistoriaDesierta;
import gob.shcp.sireh.domain.jdbc.plaza.estructura.TdHistoriaDesiertaPK;
import gob.shcp.sireh.domain.jdbc.plaza.estructura.TdPlazaConcurso;
import gob.shcp.sireh.domain.jdbc.plaza.estructura.TdPlazaConcursoPK;
import gob.shcp.sireh.model.ItemDTO;
import gob.shcp.sireh.model.plaza.estructura.AsignaPlazaSoporteDTO;
import gob.shcp.sireh.model.plaza.estructura.CambioPtoFisicoPlazaDTO;
import gob.shcp.sireh.model.plaza.estructura.CambioSitPlazaDTO;
import gob.shcp.sireh.model.plaza.estructura.CambioURFisicaPlazaDTO;
import gob.shcp.sireh.model.plaza.estructura.DenominacionFuncionalDTO;
import gob.shcp.sireh.model.plaza.estructura.LiberaPlazaDTO;
import gob.shcp.sireh.model.plaza.estructura.ModificaDatosPresupuestalesDTO;
import gob.shcp.sireh.model.plaza.estructura.ModificaTipoSPDTO;
import gob.shcp.sireh.model.plaza.estructura.ObservacionesPlazaDTO;
import gob.shcp.sireh.model.plaza.estructura.PlazaEnConcursoDTO;
import gob.shcp.sireh.model.plaza.estructura.PromocionPermutaDTO;
import gob.shcp.sireh.model.plaza.estructura.ProrrogaArt34DTO;

import gob.shcp.sireh.service.AbstractSirehService;
import gob.shcp.sireh.service.SirehUtils;

import java.text.DateFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.apache.commons.lang.time.DateUtils;

/**
 * Business Service encargado de atender solicitudes correspondientes a Plazas de tipo Estructura.
 */
public class PlazaEstructuraBS extends AbstractSirehService implements PlazaEstructuraService {
    
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
        if (plaza == null || 
           !(plaza.getIdSitPlaza().equals("C") || plaza.getIdSitPlaza().equals("V")) || 
           !(plaza.getIdGrupoPago().equals("E") || plaza.getIdGrupoPago().equals("J"))) {
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
                liberaPlazaDTO.setIdZonaEco(plaza.getIdZonaEcoNom());
                liberaPlazaDTO.setIdPuesto(plaza.getIdPuestoNom());
                liberaPlazaDTO.setIdMuni(plaza.getIdMuniNom() != null ? plaza.getIdMuniNom() : new Integer(0));
                liberaPlazaDTO.setIdRango(HERRAMIENTA_AUXILIAR);
                
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
            
            // Obtener Fecha de Término
            DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
            String strFecInfinita = df.format(plaza.getPlazaFinCont());
            
            // Fecha Infinita 
            if (strFecInfinita.equals(getApFin())) {
                liberaPlazaDTO.setCheckFechaTermino(true);
            } else {
                liberaPlazaDTO.setCheckFechaTermino(false);
            }
        }
        
        // VACANCIAS
        // Consulta si la plaza es de estructura o consejeria y si su nivel < 7
        List<TdPlaza> listaTdPlazaConVacancia = super.persistence().get(QueryTdPlazaDAO.class).getConsultaVacanciasPlazaCandidata(liberaPlazaDTO.getIdPlaza() ); 
        
        if (listaTdPlazaConVacancia != null && !listaTdPlazaConVacancia.isEmpty() && liberaPlazaDTO.getIdPlaza() != null && listaTdPlazaConVacancia.get(0).getIdPlaza().compareTo(liberaPlazaDTO.getIdPlaza()) == 0) {
            liberaPlazaDTO.setBeanNamePuesto("tcPuestoLiberaVacancia");
            liberaPlazaDTO.setIdPtoOrigen(liberaPlazaDTO.getIdPuesto() );
            Integer idVacancia = null;
            if(liberaPlazaDTO.getIdVacancia() != null && (liberaPlazaDTO.getIdVacancia() == 0 || liberaPlazaDTO.getIdVacancia() == 1 || liberaPlazaDTO.getIdVacancia() == 2)){
                idVacancia = liberaPlazaDTO.getIdVacancia();
                if (liberaPlazaDTO.getIdSitPlaza() != null && liberaPlazaDTO.getIdSitPlaza().equals("C") ) {
                    idVacancia++;
                    if (idVacancia >= 2) {
                        idVacancia = 2;
                    }
                }
            } else {
                idVacancia = 6;
            }
            liberaPlazaDTO.setIdVacancia(idVacancia);
            liberaPlazaDTO.setIdVacanciaAux(idVacancia);
            TcVacancia tcVacancia = super.persistence().get(TcVacanciaDAO.class).getById(idVacancia);
            liberaPlazaDTO.setIdVacanciaLabel(idVacancia + " - " + tcVacancia.getDescVacancia());
        } else {
            liberaPlazaDTO.setBeanNamePuesto("tcPuestoLibera");
        }
        liberaPlazaDTO.setIdSitPlazaDestino("V");
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
        
        // Obtener el puesto con/sin espacios
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
        TcTabulador tcTabuladorAnterior = super.getTabulador(tcAtributoPuestoAnterior, getHerramientaAuxiliar(), plaza.getIdZonaEcoPre());
        
        // Paso 6) Tabulador Anterior
        Double anteriorTabulador = Double.valueOf(tcTabuladorAnterior.getTabSueldo() + tcTabuladorAnterior.getTabCompensacion());
        
        // Paso 7) Validacion - Valores para Nivel Tabular seleccionado
        TcTabulador tcTabulador = new TcTabulador();
        try {
            TcAtributoPuesto tcAtributoPuesto = super.getAtributoPuesto(idPuestoConEspacios); 
            try {
                // Obtener el tabulador con/sin espacios
                List<TcTabulador> tabuladores = super.persistence().get(QueryTdPlazaDAO.class).findTabulador(idPuestoConEspacios, liberaPlazaDTO.getIdZonaEco());
                tcTabulador = tabuladores.get(0);
            } catch (Exception ex) {
                throw new ServiceException("La Zona Económica y/o Herramienta Auxiliar de Pago no son validas.");
            }
        } catch (Exception ex) {
            throw new ServiceException("Verifique la relación Código de Puesto - Zona Económica - Herramienta Auxiliar de Pago.");
        }
        
        // Paso 8) Validacion - Valores para Nivel Tabular seleccionado VS Nivel Tabular presupuestado
        Double nuevoTabulador = Double.valueOf(tcTabulador.getTabSueldo() + tcTabulador.getTabCompensacion());
        int comparaTabulador = Double.compare(anteriorTabulador, nuevoTabulador);
        if (comparaTabulador < 0) {
            throw new ServiceException("El Código de Puesto seleccionado es superior al Código de Puesto presupuestado.");
        }
        
        // Paso 9) Quincena de Captura
        Integer mepQnaCaptura = super.getQuincenaCaptura().intValue();
        
        // Paso 10) Validacion de fechas
        if (liberaPlazaDTO.getPlazaIniCont() != null || liberaPlazaDTO.getPlazaFinCont() != null) {
            Date fechaInicial = (Date) liberaPlazaDTO.getPlazaIniCont();
            Date fechaFinal = (Date) liberaPlazaDTO.getPlazaFinCont();
            
            if (fechaInicial.compareTo(fechaFinal) > 0) {
                throw new ServiceException("La Fecha Término no puede ser menor que la Fecha Liberación.");
            } else {                
                // Fecha Inicial - RETROACTIVO 90 DIAS 
                if (SirehUtils.comparaFechaLiberacionRetroactivo(fechaInicial, super.parameter().getString("RETROACTIVO_PAGO"))) {
                    // Deben ser Iguales
                    plazaVacante.setPlazaIniCont(liberaPlazaDTO.getPlazaIniCont());
                    plazaVacante.setPlazaUltimoMovto(liberaPlazaDTO.getPlazaIniCont());
                } else {
                    throw new ServiceException("El campo Fecha Liberación debe estar dentro del rango retroactivo de 90 días.");
                }
                 
                // Fecha Infinita
                if (liberaPlazaDTO.isCheckFechaTermino()) {
                    Date fechaInfinita = new Date();
                    SimpleDateFormat formatoDelTexto = new SimpleDateFormat("yyyy-MM-dd");
                    try {
                        fechaInfinita = formatoDelTexto.parse(getApFin());
                    } catch (ParseException ex) {
                        ex.printStackTrace();
                    }
                    plazaVacante.setPlazaFinCont(fechaInfinita);
                } else {
                    plazaVacante.setPlazaFinCont(liberaPlazaDTO.getPlazaFinCont());
                }
            }
        }
        
        // Paso 11) Obtener Valores adicionales de la plaza
        plazaVacante.setIdTipoPlaza(liberaPlazaDTO.getIdTipoPlaza());
        plazaVacante.setIdServPub(liberaPlazaDTO.getIdServPub());
        plazaVacante.setPlazaReferencia(liberaPlazaDTO.getPlazaReferencia());
        plazaVacante.setIdInmueble(liberaPlazaDTO.getIdInmueble());
        
        // Paso 12) Movimiento de Persona - 501
        Integer idMovtoPersona = super.getMovimientoPersonal("PLAZAS_LIBERACION_DE_PLAZAS_=_V");
        
        // Paso 13) Update Plaza Vacante
        plazaVacante.setIdSitPlaza(liberaPlazaDTO.getIdSitPlazaDestino());
        plazaVacante.setIdVacancia(liberaPlazaDTO.getIdVacancia());
        plazaVacante.setPlazaRfc("");
        plazaVacante.setUsuario(usuario);
        plazaVacante.setFecModifico(new Date());
        plazaVacante.setIdMovtoPersona(idMovtoPersona);
        plazaVacante.setPlazaQnaCaptura(mepQnaCaptura);
        super.persistence().get(TdPlazaDAO.class).save(plazaVacante);
                
        // Paso 14) Insert TN_MVTOS_EMP_PLA
        TnMovtosEmpPla tnMovtosEmpPla = SirehUtils.transformToTnMovtosEmpPla(empleado, plazaVacante, idMovtoPersona, mepQnaCaptura, usuario, new Date(), super.getAtributoPuesto(plazaVacante.getIdPuestoNom()));
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
        
        //TODO: Obtenener situacion
        //super.persistence().get(TcSituacionOkDAO.class).
        
        // Valida Plaza
        if (plaza == null || !plaza.getIdGrupoPago().equals("E")) {
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
            
            // Fecha Inicial - RETROACTIVO 90 DIAS 
            if (SirehUtils.comparaFechaLiberacionRetroactivo(fechaInicial, super.parameter().getString("RETROACTIVO_PAGO"))) {
                // Deben ser Iguales
                plazaVacante.setPlazaIniCont(cambioSitPlazaDTO.getPlazaIniCont());
                plazaVacante.setPlazaUltimoMovto(cambioSitPlazaDTO.getPlazaIniCont());
            } else {
                throw new ServiceException("La Vigencia de inicio debe estar dentro del rango retroactivo de 90 días.");
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
            plaza.getIdSitPlaza().equals("V")) || !plaza.getIdGrupoPago().equals("E")) {
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
                cambioPtoFisicoPlazaDTO.setIdRango(HERRAMIENTA_AUXILIAR);
                
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
                cambioPtoFisicoPlazaDTO.setIdRango(HERRAMIENTA_AUXILIAR);
                
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
            throw new ServiceException("El campo Código de Puesto no puede ser vacio.");
        } else {
            plazaVacante.setIdPuestoNom(idPuestoConEspacios);
        }
        /*if (idPuestoConEspacios.equals(puesto)) {
            throw new ServiceException("Seleccione un Código de Puesto diferente.");
        }*/
        if (cambioPtoFisicoPlazaDTO.getIdZonaEco() == null || cambioPtoFisicoPlazaDTO.getIdZonaEco().intValue() == 0) {
            throw new ServiceException("El campo Zona Económica no puede ser vacio.");
        } else {
            plazaVacante.setIdZonaEcoNom(cambioPtoFisicoPlazaDTO.getIdZonaEco());
        }
        
        // Paso 5) Quincena de Captura
        Integer mepQnaCaptura = super.getQuincenaCaptura().intValue();
        
        // Paso 6) Validaciones Independientes al estatus de la Plaza
        if (cambioPtoFisicoPlazaDTO.getPlazaIniCont() != null || plaza.getPlazaUltimoMovto() != null) {
            Date fechaInicial = (Date) cambioPtoFisicoPlazaDTO.getPlazaIniCont();
            Date fechaFinal = (Date) plaza.getPlazaUltimoMovto();
            
            // Fecha Inicial - RETROACTIVO 90 DIAS 
            if (SirehUtils.comparaFechaLiberacionRetroactivo(fechaInicial, super.parameter().getString("RETROACTIVO_PAGO"))) {
                // Deben ser Iguales
                plazaVacante.setPlazaIniCont(cambioPtoFisicoPlazaDTO.getPlazaIniCont());
                plazaVacante.setPlazaUltimoMovto(cambioPtoFisicoPlazaDTO.getPlazaIniCont());
            } else {
                throw new ServiceException("La Vigencia de inicio debe estar dentro del rango retroactivo de 90 días.");
            }
        }
        plazaVacante.setPlazaReferencia(cambioPtoFisicoPlazaDTO.getPlazaReferencia());
        
        // Paso 7) Movimiento Persona
        Integer idMovtoPersona;
        if (verificaCambioPtoFisicoPlaza(cambioPtoFisicoPlazaDTO)) {
            // Cambio de Puesto Físico Sobrevaluado - 513
            idMovtoPersona = getMovimientoPersonal("CAMBIO_PUESTO_FISICO_SOBREVALUADA");
        } else {
            // Cambio de Puesto Físico - 503
            idMovtoPersona = super.getMovimientoPersonal("PROMOCION_CAMBIO_DE_PUESTO_FISICO");
        }
        
        // Paso 8) Update Plaza Vacante
        plazaVacante.setIdRangoNom(HERRAMIENTA_AUXILIAR);
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
            TcAtributoPuesto tcAtributoPuesto = super.getAtributoPuesto(idPuestoConEspacios);
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
            /*
             *if (d1 < d2)
             *   return -1;		 // Neither val is NaN, thisVal is smaller
             *if (d1 > d2)
             *   return 1;		 // Neither val is NaN, thisVal is larger
             */
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
            plaza.getIdSitPlaza().equals("V")) || !plaza.getIdGrupoPago().equals("E")) {
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
            
            // Ultimo Movimiento
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
        if (plaza.getIdSitPlaza().equals("O")) { // Situacion Ocupada - Datos Nomina
            plazaVacante.setIdUnidadNom(cambioURFisicaPlazaDTO.getIdUnidad());
            plazaVacante.setIdEdoNom(cambioURFisicaPlazaDTO.getIdEdo());
            if (cambioURFisicaPlazaDTO.getIdMuni() == null) {
                throw new ServiceException("El campo Municipio no puede ser vacio.");
            } else {
                plazaVacante.setIdMuniNom(cambioURFisicaPlazaDTO.getIdMuni());
            }
        } else {
            plazaVacante.setIdUnidadNom(cambioURFisicaPlazaDTO.getIdUnidad());
            plazaVacante.setIdEdoNom(cambioURFisicaPlazaDTO.getIdEdo());
        }
        
        // Paso 5) Validaciones Independientes al estatus de la Plaza
        if (cambioURFisicaPlazaDTO.getIdZonaDistNom() == null || cambioURFisicaPlazaDTO.getIdZonaDistNom().intValue() == 0) {
            throw new ServiceException("El campo Zona Pagadora no puede ser vacio.");
        } else {
            plazaVacante.setIdZonaDistNom(cambioURFisicaPlazaDTO.getIdZonaDistNom());
        }
        
        // Paso 6) Quincena de Captura
        Integer mepQnaCaptura = super.getQuincenaCaptura().intValue();
        
        if (cambioURFisicaPlazaDTO.getPlazaIniCont() != null || plaza.getPlazaUltimoMovto() != null) {
            Date fechaInicial = (Date) cambioURFisicaPlazaDTO.getPlazaIniCont();
            Date fechaFinal = (Date) plaza.getPlazaUltimoMovto();
            
            // Fecha Inicial - RETROACTIVO 90 DIAS 
            if (SirehUtils.comparaFechaLiberacionRetroactivo(fechaInicial, super.parameter().getString("RETROACTIVO_PAGO"))) {
                // Deben ser Iguales
                plazaVacante.setPlazaIniCont(cambioURFisicaPlazaDTO.getPlazaIniCont());
                plazaVacante.setPlazaUltimoMovto(cambioURFisicaPlazaDTO.getPlazaIniCont());
            } else {
                throw new ServiceException("El campo Vigencia de inicio debe estar dentro del rango retroactivo de 90 días.");
            }
        }
        Date fechaInicial = (Date) cambioURFisicaPlazaDTO.getPlazaIniCont();
        Date fechaFinal = (Date) cambioURFisicaPlazaDTO.getPlazaFinCont();
        
        if (fechaInicial.compareTo(fechaFinal) > 0) {
            throw new ServiceException("El Término de vigencia no puede ser menor que la Vigencia de inicio.");
        } else {
            plazaVacante.setPlazaFinCont(cambioURFisicaPlazaDTO.getPlazaFinCont());
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
     * Metodo encargado de obtener el id de la Plaza para Asignar Plaza Soporte.
     * @author Oscar S.
     * @param idPlaza Integer
     * @return asignaPlazaSoporteDTO AsignaPlazaSoporteDTO
     */
    public AsignaPlazaSoporteDTO getAsignaPlazaSoporte(Integer idPlaza) {
        // Paso 1) Obtener la Plaza actual
        TdPlaza plaza = getPlaza(idPlaza);
        AsignaPlazaSoporteDTO asignaPlazaSoporteDTO;
        
        // Valida Plaza
        if (plaza == null || !plaza.getIdSitPlaza().equals("O") || !plaza.getIdGrupoPago().equals("V")) {
            asignaPlazaSoporteDTO = new AsignaPlazaSoporteDTO();
            asignaPlazaSoporteDTO.setIdSitPlaza("INVALIDA");
        } else {
            asignaPlazaSoporteDTO = super.transformation().map(plaza, AsignaPlazaSoporteDTO.class);
            
            // Paso 1) Datos Nomina
            String puesto = plaza.getIdPuestoPre();
            Integer zonaEconomica = plaza.getIdZonaEcoPre();
            Integer rango = plaza.getIdRangoPre();
            
            asignaPlazaSoporteDTO.setIdUnidad(plaza.getIdUnidadNom());
            asignaPlazaSoporteDTO.setIdEdo(plaza.getIdEdoNom());
            asignaPlazaSoporteDTO.setIdMuni(plaza.getIdMuniNom());
            asignaPlazaSoporteDTO.setIdPuesto(puesto);
            asignaPlazaSoporteDTO.setIdZonaEco(zonaEconomica);
            asignaPlazaSoporteDTO.setIdRango(rango);
            
            // Paso 2) Etiquetas
            asignaPlazaSoporteDTO.setIdUnidadLabel(plaza.getIdUnidadNom());
            asignaPlazaSoporteDTO.setIdEdoLabel(plaza.getIdEdoNom());
            asignaPlazaSoporteDTO.setIdMuniLabel(plaza.getIdMuniNom());
            asignaPlazaSoporteDTO.setIdPuestoLabel(puesto);
            asignaPlazaSoporteDTO.setIdZonaEcoLabel(zonaEconomica);
            asignaPlazaSoporteDTO.setIdRangoLabel(rango);
            
            // Paso 3) Banderas
            asignaPlazaSoporteDTO.setDatosFisicos(true);
            asignaPlazaSoporteDTO.setDatosPresupuestales(false);
            
            // Paso 4) Obtener el Nivel Fisico
            TcAtributoPuesto tcAtributoPuesto = super.getAtributoPuesto(puesto); 
            // Etiquetas
            asignaPlazaSoporteDTO.setNivelFisicoLabel(tcAtributoPuesto.getIdNivelPto());
            asignaPlazaSoporteDTO.setNombramientoLabel(tcAtributoPuesto.getIdNombramiento());

            // Paso 5) Obtener el sueldo y compensacion
            TcTabulador tcTabulador = super.getTabulador(tcAtributoPuesto, rango, zonaEconomica);
            // Etiquetas
            NumberFormat formatter = NumberFormat.getCurrencyInstance();
            String sueldoString = formatter.format(tcTabulador.getTabSueldo());
            asignaPlazaSoporteDTO.setSueldoLabel(sueldoString);
            String compensacionString = formatter.format(tcTabulador.getTabCompensacion());
            asignaPlazaSoporteDTO.setCompensacionLabel(compensacionString);
            
            // Paso 6) Obtener la situación de la plaza
            TcSitPlaza sitPlaza = super.persistence().get(TcSitPlazaDAO.class).getById(plaza.getIdSitPlaza());
            asignaPlazaSoporteDTO.setDescSitPlaza(sitPlaza.getDescSitPlaza());
            
            // Paso 7) Ultimo Movimiento
            asignaPlazaSoporteDTO.setUltimoMovto(plaza.getPlazaUltimoMovto());
        }
        return asignaPlazaSoporteDTO;
    }
    
    /**
     * Metodo encargado de Asignar Plaza Soporte a una Plaza Eventual con base en el objeto asignaPlazaSoporteDTO.
     * @author Oscar S.
     * @param asignaPlazaSoporteDTO AsignaPlazaSoporteDTO
     * @param usuario String
     */
    public void updateAsignaPlazaSoporte(AsignaPlazaSoporteDTO asignaPlazaSoporteDTO, String usuario) {
        // Paso 1) Obtener el Empleado actual        
        TdEmpleado empleado = new TdEmpleado();
        
        // Paso 2) Obtener la Plaza actual
        TdPlaza plaza = getPlaza(asignaPlazaSoporteDTO.getIdPlaza());
        
        // Paso 3) Preparar objeto Plaza
        TdPlaza plazaVacante = new TdPlaza();
        SirehUtils.copyProperties(plazaVacante, plaza);
        
        // Paso 4) Quincena de Captura
        Integer mepQnaCaptura = super.getQuincenaCaptura().intValue();
        
        // Paso 5) Plaza Respaldo
        if (asignaPlazaSoporteDTO.getPlazaRespaldo().intValue() != 0) {
            // Obtener la Plaza Soporte
            TdPlaza plazaSoporte = getPlaza(asignaPlazaSoporteDTO.getPlazaRespaldo());
            
            // Plaza Soporte Sueldo + Compensacion
            Double tabuladorPlazaSoporte = super.getSumaSueldoCompensacion(plazaSoporte.getIdPuestoPre(), plazaSoporte.getIdZonaEcoPre());
            
            // Plaza Nueva - Sueldo + Compensacion
            Double tabuladorNuevaPlaza = super.getSumaSueldoCompensacion(plaza.getIdPuestoNom(), plaza.getIdZonaEcoNom());
            
            // Comparacion de sumatorias
            int comparaTabulador = Double.compare(tabuladorPlazaSoporte, tabuladorNuevaPlaza);
            if (comparaTabulador < 0) {
                throw new ServiceException("El Código de Puesto seleccionado es menor al Código de Puesto presupuestado.");
            }
            
            // Asignacion Plaza Soporte
            plazaVacante.setPlazaRespaldo(asignaPlazaSoporteDTO.getPlazaRespaldo());
            
            // Update status de la PLaza
            plazaSoporte.setIdSitPlaza("S");
            plazaSoporte.setPlazaRespaldo(plaza.getIdPlaza());
            plazaSoporte.setUsuario(usuario);
            plazaSoporte.setFecModifico(new Date());
            super.persistence().get(TdPlazaDAO.class).save(plazaSoporte);
            
            // Movimiento de Persona - 504
            Integer idMovtoPersonaSoporte = super.getMovimientoPersonal("PLAZAS_CAMBIA_SITUACION_C_O_V_=_C");
        
            // Insert TN_MVTOS_EMP_PLA
            TnMovtosEmpPla tnMovtosEmpPla = SirehUtils.transformToTnMovtosEmpPla(empleado, plazaSoporte, idMovtoPersonaSoporte, mepQnaCaptura, usuario, new Date(), super.getAtributoPuesto(plazaSoporte.getIdPuestoPre()));
            super.persistence().get(TnMovtosEmpPlaDAO.class).save(tnMovtosEmpPla);
        } else {
            throw new ServiceException("Error al Asignar la Plaza Soporte.");
        }
        
        // Paso 6) Movimiento Persona - 533
        Integer idMovtoPersona = super.getMovimientoPersonal("ASIGNAR_SOPORTE_EVENTUALES");
        
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
     * Metodo encargado de eliminar Plaza Soporte a Plazas de Tipo Eventual.
     * @author Oscar S.
     * @param idPlazas Integer[]
     * @param usuario String
     */
    public void eliminaPlazaSoporte(Integer[] idPlazas, String usuario) {
        // Datos del Empleado
        TdEmpleado empleado = new TdEmpleado();
        
        // Movimiento Persona
        Integer idMovtoPersona = super.getMovimientoPersonal("ELIMINAR_SOPORTE_EVENTUALES");
        
        // Quincena de Captura
        Integer mepQnaCaptura = super.getQuincenaCaptura().intValue();
        
        for(Integer idPlaza : idPlazas) {
            // Datos de la Plaza
            TdPlaza plazaVacante = getPlaza(idPlaza);
            
            // Validacion
            if (plazaVacante.getPlazaRespaldo() != 0 && plazaVacante.getIdGrupoPago().equals("V") && plazaVacante.getIdSitPlaza().equals("O")) {
                
                // Datos de la Plaza Soporte
                TdPlaza plazaSoporte = getPlaza(plazaVacante.getPlazaRespaldo());
                
                // Update Plaza Soporte
                plazaSoporte.setIdSitPlaza("C");
                plazaSoporte.setPlazaRespaldo(new Integer(0));
                plazaSoporte.setUsuario(usuario);
                plazaSoporte.setFecModifico(new Date());
                plazaSoporte.setIdMovtoPersona(idMovtoPersona);
                plazaSoporte.setPlazaQnaCaptura(mepQnaCaptura);
                super.persistence().get(TdPlazaDAO.class).save(plazaSoporte);
                
                // Movimiento Persona - 532
                TnMovtosEmpPla tnMovtosEmpPlaSoporte = SirehUtils.transformToTnMovtosEmpPla(empleado, plazaSoporte, idMovtoPersona, mepQnaCaptura, usuario, new Date(), super.getAtributoPuesto(plazaSoporte.getIdPuestoPre()));
                super.persistence().get(TnMovtosEmpPlaDAO.class).save(tnMovtosEmpPlaSoporte);
                
                // Update Plaza Vacante
                plazaVacante.setIdSitPlaza("C");
                plazaVacante.setPlazaRespaldo(new Integer(0));
                plazaVacante.setUsuario(usuario);
                plazaVacante.setFecModifico(new Date());
                plazaVacante.setIdMovtoPersona(idMovtoPersona);
                plazaVacante.setPlazaQnaCaptura(mepQnaCaptura);
                super.persistence().get(TdPlazaDAO.class).save(plazaVacante);
                
                // Movimiento Persona - 532
                TnMovtosEmpPla tnMovtosEmpPla = SirehUtils.transformToTnMovtosEmpPla(empleado, plazaVacante, idMovtoPersona, mepQnaCaptura, usuario, new Date(), super.getAtributoPuesto(plazaVacante.getIdPuestoPre()));
                super.persistence().get(TnMovtosEmpPlaDAO.class).save(tnMovtosEmpPla);
            }
        }
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
            plaza.getIdSitPlaza().equals("O")) || !plaza.getIdGrupoPago().equals("E")) {
            modificaTipoSPDTO = new ModificaTipoSPDTO();
            modificaTipoSPDTO.setIdSitPlaza("INVALIDA");
        } else {
            modificaTipoSPDTO = super.transformation().map(plaza, ModificaTipoSPDTO.class);
            
            String puesto = "";
            Integer zonaEconomica = new Integer(0);
            Integer rango = new Integer(0);
            
            // Datos Nomina
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
            
            // Fecha Inicial - RETROACTIVO 90 DIAS 
            if (SirehUtils.comparaFechaLiberacionRetroactivo(fechaInicial, super.parameter().getString("RETROACTIVO_PAGO"))) {
                // Deben ser Iguales
                plazaVacante.setPlazaIniCont(modificaTipoSPDTO.getPlazaIniCont());
                plazaVacante.setPlazaUltimoMovto(modificaTipoSPDTO.getPlazaIniCont());
            } else {
                throw new ServiceException("El campo Inicio de contrato debe estar dentro del rango retroactivo de 90 días.");
            }
        }
        Date fechaInicial2 = (Date) modificaTipoSPDTO.getPlazaIniCont();
        Date fechaFinal2 = (Date) modificaTipoSPDTO.getPlazaFinCont();
        
        if (fechaInicial2.compareTo(fechaFinal2) > 0) {
            throw new ServiceException("El campo Término de contrato no puede ser menor que el Inicio de movimiento.");
        } else {
            plazaVacante.setPlazaFinCont(modificaTipoSPDTO.getPlazaFinCont());
        }
        
        // Paso 6) Obtener Valores adicionales de la plaza
        if (modificaTipoSPDTO.getIdTipoPlaza().equals(plaza.getIdTipoPlaza())) {
            throw new ServiceException("Seleccione un Tipo de Plaza diferente al anterior.");
        } else {
            plazaVacante.setIdTipoPlaza(modificaTipoSPDTO.getIdTipoPlaza());
        }
        if (modificaTipoSPDTO.getIdServPub().equals(plaza.getIdServPub())) {
            throw new ServiceException("Seleccione un Tipo de Servidor Público diferente al anterior.");
        } else {
            plazaVacante.setIdServPub(modificaTipoSPDTO.getIdServPub());
        }
        
        // Paso 7) Movimiento Personal
        Integer idMovtoPersona = null;
        if(modificaTipoSPDTO.isModificaPuesto()){
            idMovtoPersona = super.getMovimientoPersonal("PUESTO_OCUPADO_POR_CONSURSO_MODIFICA_PUESTO"); //529
            plazaVacante.setIdPuestoNom(modificaTipoSPDTO.getIdPuesto() );
        } else
        if (modificaTipoSPDTO.getIdTipoPlaza().equals("C") && modificaTipoSPDTO.getIdServPub().equals("BBAA0")) {
            // Paso 7) Movimiento Personal - 520
            idMovtoPersona = super.getMovimientoPersonal("PUESTO_OCUPADO_POR_CONCURSO");
        } else {
            // Paso 7) Movimiento Personal - 527
            idMovtoPersona = super.getMovimientoPersonal("CAMBIO_DE_TIPO_DE_SERVIDOR_PUBLICO");
        }
        
        // Paso 8) Update Plaza Vacante
        plazaVacante.setUsuario(usuario);
        if(modificaTipoSPDTO.isModificaPuesto() ){
            plazaVacante.setIdPuestoNom(modificaTipoSPDTO.getIdPuesto() );
        }
        plazaVacante.setFecModifico(new Date());
        plazaVacante.setIdMovtoPersona(idMovtoPersona);
        plazaVacante.setPlazaQnaCaptura(mepQnaCaptura);
        super.persistence().get(TdPlazaDAO.class).save(plazaVacante);
        
        // Paso 8) Insert TN_MVTOS_EMP_PLA
        TnMovtosEmpPla tnMovtosEmpPla = SirehUtils.transformToTnMovtosEmpPla(empleado, plazaVacante, idMovtoPersona, mepQnaCaptura, usuario, new Date(), super.getAtributoPuesto(plazaVacante.getIdPuestoPre()));
        super.persistence().get(TnMovtosEmpPlaDAO.class).save(tnMovtosEmpPla);
    }
    
    /**
     * Metodo encargado de obtener el id de la Plaza para modificar Denominación Funcional.
     * @author Oscar S.
     * @param idPlaza Integer
     * @return denominacionFuncionalDTO DenominacionFuncionalDTO
     */
    public DenominacionFuncionalDTO getModificaDenominacionFuncional(Integer idPlaza) {
        // Paso 1) Obtener la Plaza actual
        TdPlaza plaza = getPlaza(idPlaza);
        DenominacionFuncionalDTO denominacionFuncionalDTO;
        
        // Valida Plaza
        if (plaza == null || !plaza.getIdSitPlaza().equals("O") || !plaza.getIdGrupoPago().equals("E")) {
            denominacionFuncionalDTO = new DenominacionFuncionalDTO();
            denominacionFuncionalDTO.setIdSitPlaza("INVALIDA");
        } else {
            denominacionFuncionalDTO = super.transformation().map(plaza, DenominacionFuncionalDTO.class);
            
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
                denominacionFuncionalDTO.setIdUnidadLabel(plaza.getIdUnidadNom());
                denominacionFuncionalDTO.setIdEdoLabel(plaza.getIdEdoNom());
                denominacionFuncionalDTO.setIdMuniLabel(plaza.getIdMuniNom());
                denominacionFuncionalDTO.setIdZonaEcoLabel(plaza.getIdZonaEcoNom());
                denominacionFuncionalDTO.setIdPuestoLabel(plaza.getIdPuestoNom());
                denominacionFuncionalDTO.setIdRangoLabel(plaza.getIdRangoNom());
                
                denominacionFuncionalDTO.setDatosFisicos(true);
                denominacionFuncionalDTO.setDatosPresupuestales(false);
                
                // Datos del Empleado
                TdEmpleado empleado = super.persistence().get(TdEmpleadoDAO.class).getById(plaza.getPlazaRfc());
                denominacionFuncionalDTO.setRfcEmpleadoLabel(empleado.getRfcEmpleado());
                denominacionFuncionalDTO.setNombreEmpleadoLabel(empleado.getNombreEmpleado());
                denominacionFuncionalDTO.setPrimerApellidoLabel(empleado.getPrimerApellido());
                denominacionFuncionalDTO.setSegundoApellidoLabel(empleado.getSegundoApellido());
            }
            
            // Paso 2) Obtener el Nivel Fisico
            TcAtributoPuesto tcAtributoPuesto = super.getAtributoPuesto(puesto); 
            // Etiquetas
            denominacionFuncionalDTO.setNivelFisicoLabel(tcAtributoPuesto.getIdNivelPto());
            denominacionFuncionalDTO.setNombramientoLabel(tcAtributoPuesto.getIdNombramiento());

            // Paso 3) Obtener el sueldo y compensacion
            TcTabulador tcTabulador = super.getTabulador(tcAtributoPuesto, rango, zonaEconomica);
            // Etiquetas
            NumberFormat formatter = NumberFormat.getCurrencyInstance();
            String sueldoString = formatter.format(tcTabulador.getTabSueldo());
            denominacionFuncionalDTO.setSueldoLabel(sueldoString);
            String compensacionString = formatter.format(tcTabulador.getTabCompensacion());
            denominacionFuncionalDTO.setCompensacionLabel(compensacionString);
            
            // Paso 4) Obtener la situación de la plaza
            TcSitPlaza sitPlaza = super.persistence().get(TcSitPlazaDAO.class).getById(plaza.getIdSitPlaza());
            denominacionFuncionalDTO.setDescSitPlaza(sitPlaza.getDescSitPlaza());
            
            // Ultimo Movimiento
            denominacionFuncionalDTO.setUltimoMovto(plaza.getPlazaUltimoMovto());
        }
        return denominacionFuncionalDTO;
    }
    
    /**
     * Metodo encargado de modificar Denominación Funcional de la Plaza con base en el objeto denominacionFuncionalDTO.
     * @author Oscar S.
     * @param denominacionFuncionalDTO DenominacionFuncionalDTO
     * @param usuario String
     */
    public void updateModificaDenominacionFuncional(DenominacionFuncionalDTO denominacionFuncionalDTO, String usuario) {
        // Paso 1) Obtener la Plaza actual
        TdPlaza plaza = getPlaza(denominacionFuncionalDTO.getIdPlaza());
        
        // Paso 2) Obtener el Empleado actual        
        TdEmpleado empleado = super.persistence().get(TdEmpleadoDAO.class).getById(plaza.getPlazaRfc());
        
        // Paso 3) Preparar objeto Plaza
        TdPlaza plazaVacante = new TdPlaza();
        SirehUtils.copyProperties(plazaVacante, plaza);
        
        // Paso 4) Quincena de Captura
        Integer mepQnaCaptura = super.getQuincenaCaptura().intValue();
        
        // Paso 5) Validacion de fechas
        if (denominacionFuncionalDTO.getPlazaIniCont() != null || plaza.getPlazaUltimoMovto() != null) {
            Date fechaInicial = (Date) denominacionFuncionalDTO.getPlazaIniCont();
            Date fechaFinal = (Date) plaza.getPlazaUltimoMovto();
            
            if (fechaInicial.compareTo(fechaFinal) < 0) {
                throw new ServiceException("El Inicio de Movimiento no puede ser menor que la Fecha del Último Movimiento.");
            } else {                
                 // Fecha Inicial - RETROACTIVO 90 DIAS 
                 if (SirehUtils.comparaFechaLiberacionRetroactivo(fechaInicial, super.parameter().getString("RETROACTIVO_PAGO"))) {
                     // Deben ser Iguales
                     plazaVacante.setPlazaIniCont(denominacionFuncionalDTO.getPlazaIniCont());
                     plazaVacante.setPlazaUltimoMovto(denominacionFuncionalDTO.getPlazaIniCont());
                 } else {
                     throw new ServiceException("El Inicio de Movimiento debe estar dentro del rango retroactivo de 90 días.");
                 }
            }
        }
        
        // Paso 6) Movimiento Personal - 531
        Integer idMovtoPersona = super.getMovimientoPersonal("MODIFICACION_DE_DATOS");
        
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
     * Metodo encargado de obtener el id de la Plaza para modificar Observaciones.
     * @author Oscar S.
     * @param idPlaza Integer
     * @return observacionesPlazaDTO ObservacionesPlazaDTO
     */
    public ObservacionesPlazaDTO getModificaObservacionesPlaza(Integer idPlaza) {
        // Paso 1) Obtener la Plaza actual
        TdPlaza plaza = getPlaza(idPlaza);
        ObservacionesPlazaDTO observacionesPlazaDTO;
        
        // Valida Plaza
        if (plaza == null || !plaza.getIdSitPlaza().equals("O") || !plaza.getIdGrupoPago().equals("E")) {
            observacionesPlazaDTO = new ObservacionesPlazaDTO();
            observacionesPlazaDTO.setIdSitPlaza("INVALIDA");
        } else {
            observacionesPlazaDTO = super.transformation().map(plaza, ObservacionesPlazaDTO.class);
            
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
                observacionesPlazaDTO.setIdUnidadLabel(plaza.getIdUnidadNom());
                observacionesPlazaDTO.setIdEdoLabel(plaza.getIdEdoNom());
                observacionesPlazaDTO.setIdMuniLabel(plaza.getIdMuniNom());
                observacionesPlazaDTO.setIdZonaEcoLabel(plaza.getIdZonaEcoNom());
                observacionesPlazaDTO.setIdPuestoLabel(plaza.getIdPuestoNom());
                observacionesPlazaDTO.setIdRangoLabel(plaza.getIdRangoNom());
                
                observacionesPlazaDTO.setDatosFisicos(true);
                observacionesPlazaDTO.setDatosPresupuestales(false);
                
                // Datos del Empleado
                TdEmpleado empleado = super.persistence().get(TdEmpleadoDAO.class).getById(plaza.getPlazaRfc());
                observacionesPlazaDTO.setRfcEmpleadoLabel(empleado.getRfcEmpleado());
                observacionesPlazaDTO.setNombreEmpleadoLabel(empleado.getNombreEmpleado());
                observacionesPlazaDTO.setPrimerApellidoLabel(empleado.getPrimerApellido());
                observacionesPlazaDTO.setSegundoApellidoLabel(empleado.getSegundoApellido());
            }
            
            // Paso 2) Obtener el Nivel Fisico
            TcAtributoPuesto tcAtributoPuesto = super.getAtributoPuesto(puesto); 
            // Etiquetas
            observacionesPlazaDTO.setNivelFisicoLabel(tcAtributoPuesto.getIdNivelPto());
            observacionesPlazaDTO.setNombramientoLabel(tcAtributoPuesto.getIdNombramiento());

            // Paso 3) Obtener el sueldo y compensacion
            TcTabulador tcTabulador = super.getTabulador(tcAtributoPuesto, rango, zonaEconomica);
            // Etiquetas
            NumberFormat formatter = NumberFormat.getCurrencyInstance();
            String sueldoString = formatter.format(tcTabulador.getTabSueldo());
            observacionesPlazaDTO.setSueldoLabel(sueldoString);
            String compensacionString = formatter.format(tcTabulador.getTabCompensacion());
            observacionesPlazaDTO.setCompensacionLabel(compensacionString);
            
            // Paso 4) Obtener la situación de la plaza
            TcSitPlaza sitPlaza = super.persistence().get(TcSitPlazaDAO.class).getById(plaza.getIdSitPlaza());
            observacionesPlazaDTO.setDescSitPlaza(sitPlaza.getDescSitPlaza());
            
            // Ultimo Movimiento
            observacionesPlazaDTO.setUltimoMovto(plaza.getPlazaUltimoMovto());
        }
        return observacionesPlazaDTO;
    }
    
    /**
     * Metodo encargado de modificar Observaciones de la Plaza con base en el objeto observacionesPlazaDTO.
     * @author Oscar S.
     * @param observacionesPlazaDTO ObservacionesPlazaDTO
     * @param usuario String
     */
    public void updateObservacionesPlaza(ObservacionesPlazaDTO observacionesPlazaDTO, String usuario) {
        // Paso 1) Obtener la Plaza actual
        TdPlaza plaza = getPlaza(observacionesPlazaDTO.getIdPlaza());
        
        // Paso 2) Obtener el Empleado actual        
        TdEmpleado empleado = super.persistence().get(TdEmpleadoDAO.class).getById(plaza.getPlazaRfc());
        
        // Paso 3) Preparar objeto Plaza
        TdPlaza plazaVacante = new TdPlaza();
        SirehUtils.copyProperties(plazaVacante, plaza);
        
        // Paso 4) Quincena de Captura
        Integer mepQnaCaptura = super.getQuincenaCaptura().intValue();
        
        // Paso 5) Validaciones
        plazaVacante.setPlazaReferencia(observacionesPlazaDTO.getPlazaReferencia());
        
        // Paso 6) Movimiento Personal - 531
        Integer idMovtoPersona = super.getMovimientoPersonal("MODIFICACION_DE_DATOS");
        
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
     * Metodo encargado de obtener el id de la Plaza para Prorroga Art.34.
     * @author Oscar S.
     * @param idPlaza Integer
     * @return prorrogaArt34DTO ProrrogaArt34DTO
     */
    public ProrrogaArt34DTO getProrrogaArt34(Integer idPlaza) {
        // Paso 1) Obtener la Plaza actual
        TdPlaza plaza = getPlaza(idPlaza);
        ProrrogaArt34DTO prorrogaArt34DTO;
        
        // Valida Plaza
        if (plaza == null || !plaza.getIdSitPlaza().equals("O") || !plaza.getIdGrupoPago().equals("E")) {
            prorrogaArt34DTO = new ProrrogaArt34DTO();
            prorrogaArt34DTO.setIdSitPlaza("INVALIDA");
        } else {
            prorrogaArt34DTO = super.transformation().map(plaza, ProrrogaArt34DTO.class);
            
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
                prorrogaArt34DTO.setIdUnidadLabel(plaza.getIdUnidadNom());
                prorrogaArt34DTO.setIdEdoLabel(plaza.getIdEdoNom());
                prorrogaArt34DTO.setIdMuniLabel(plaza.getIdMuniNom());
                prorrogaArt34DTO.setIdZonaEcoLabel(plaza.getIdZonaEcoNom());
                prorrogaArt34DTO.setIdPuestoLabel(plaza.getIdPuestoNom());
                prorrogaArt34DTO.setIdRangoLabel(plaza.getIdRangoNom());
                
                prorrogaArt34DTO.setDatosFisicos(true);
                prorrogaArt34DTO.setDatosPresupuestales(false);
                
                // Datos del Empleado
                TdEmpleado empleado = super.persistence().get(TdEmpleadoDAO.class).getById(plaza.getPlazaRfc());
                prorrogaArt34DTO.setRfcEmpleadoLabel(empleado.getRfcEmpleado());
                prorrogaArt34DTO.setNombreEmpleadoLabel(empleado.getNombreEmpleado());
                prorrogaArt34DTO.setPrimerApellidoLabel(empleado.getPrimerApellido());
                prorrogaArt34DTO.setSegundoApellidoLabel(empleado.getSegundoApellido());
            }
            
            // Paso 2) Obtener el Nivel Fisico
            TcAtributoPuesto tcAtributoPuesto = super.getAtributoPuesto(puesto); 
            // Etiquetas
            prorrogaArt34DTO.setNivelFisicoLabel(tcAtributoPuesto.getIdNivelPto());
            prorrogaArt34DTO.setNombramientoLabel(tcAtributoPuesto.getIdNombramiento());

            // Paso 3) Obtener el sueldo y compensacion
            TcTabulador tcTabulador = super.getTabulador(tcAtributoPuesto, rango, zonaEconomica);
            // Etiquetas
            NumberFormat formatter = NumberFormat.getCurrencyInstance();
            String sueldoString = formatter.format(tcTabulador.getTabSueldo());
            prorrogaArt34DTO.setSueldoLabel(sueldoString);
            String compensacionString = formatter.format(tcTabulador.getTabCompensacion());
            prorrogaArt34DTO.setCompensacionLabel(compensacionString);
            
            // Paso 4) Obtener la situación de la plaza
            TcSitPlaza sitPlaza = super.persistence().get(TcSitPlazaDAO.class).getById(plaza.getIdSitPlaza());
            prorrogaArt34DTO.setDescSitPlaza(sitPlaza.getDescSitPlaza());
            
            // Ultimo Movimiento
            prorrogaArt34DTO.setUltimoMovto(plaza.getPlazaUltimoMovto());
        }
        return prorrogaArt34DTO;
    }
    
    /**
     * Metodo encargado de modificar Prorroga Art.34 de la Plaza con base en el objeto prorrogaArt34DTO.
     * @author Oscar S.
     * @param prorrogaArt34DTO ProrrogaArt34DTO
     * @param usuario String
     */
    public void updateProrrogaArt34(ProrrogaArt34DTO prorrogaArt34DTO, String usuario) {
        // Paso 1) Obtener la Plaza actual
        TdPlaza plaza = getPlaza(prorrogaArt34DTO.getIdPlaza());
        
        // Paso 2) Obtener el Empleado actual        
        TdEmpleado empleado = super.persistence().get(TdEmpleadoDAO.class).getById(plaza.getPlazaRfc());
        
        // Paso 3) Preparar objeto Plaza
        TdPlaza plazaVacante = new TdPlaza();
        SirehUtils.copyProperties(plazaVacante, plaza);
        
        // Paso 4) Quincena de Captura
        Integer mepQnaCaptura = super.getQuincenaCaptura().intValue();

        // Paso 5) Validación de fechas
        if (prorrogaArt34DTO.getPlazaIniCont() != null || 
            plaza.getPlazaUltimoMovto() != null) {
            Date fechaInicial = (Date)prorrogaArt34DTO.getPlazaIniCont();
            Date fechaFinal = (Date)plaza.getPlazaUltimoMovto();

            if (fechaInicial.compareTo(fechaFinal) < 0) {
                throw new ServiceException("El Inicio de contrato no puede ser menor que la Fecha del Último movimiento.");
            } else {
                if (SirehUtils.comparaQuincenaCaptura(mepQnaCaptura, fechaInicial)) {
                    // Deben ser iguales
                    plazaVacante.setPlazaIniCont(prorrogaArt34DTO.getPlazaIniCont());
                    plazaVacante.setPlazaUltimoMovto(prorrogaArt34DTO.getPlazaIniCont());
                } else {
                    throw new ServiceException("El Inicio de contrato debe ser posterior a la Quincena de Captura.");
                }
            }
        }
        
        // Termino de Contrato
        Date fechaInicial2 = (Date)prorrogaArt34DTO.getPlazaIniCont();
        Date fechaFinal2 = (Date)prorrogaArt34DTO.getPlazaFinCont();

        if (fechaInicial2.compareTo(fechaFinal2) > 0) {
            throw new ServiceException("El campo Termino de contrato no puede ser menor que el Inicio de movimiento.");
        } else {
            //Tipo de Prorroga
            if (prorrogaArt34DTO.getTipoProrroga().equals("ocupacion")) {
                // Fecha Abierta
                plazaVacante.setPlazaFinCont(prorrogaArt34DTO.getPlazaFinCont());
            } else {
                // Maximo 10 Meses para contratacion - 300 DIAS
                if (SirehUtils.validaFechaFinalConSuma(prorrogaArt34DTO.getPlazaIniCont(), prorrogaArt34DTO.getPlazaFinCont(), super.parameter().getString("RETROACTIVO_CONTRATACION"))) {
                    plazaVacante.setPlazaFinCont(prorrogaArt34DTO.getPlazaFinCont());
                } else {
                    throw new ServiceException("El campo Termino de contrato no puede exceder 10 meses apartir de la fecha de Inicio de contrato.");
                }
            }
        }
        
        // Paso 6) Movimiento Personal
        Integer idMovtoPersona;
        if (prorrogaArt34DTO.getTipoProrroga().equals("ocupacion")) {
            plazaVacante.setIdTipoPlaza("C");
            plazaVacante.setIdServPub("BBAA0");
            
            // Movimiento Personal - 520
            idMovtoPersona = super.getMovimientoPersonal("PUESTO_OCUPADO_POR_CONCURSO");
        } else {
            plazaVacante.setIdTipoPlaza("A");
            plazaVacante.setIdServPub("BBBC0");
            
            // Movimiento Personal - 519
            idMovtoPersona = super.getMovimientoPersonal("DESIG_ART_34_LEY_SPC_PARA_APF");   
        }
        
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
     * Metodo encargado de Intercambiar Datos Presupuestales de dos Plaza con base en el objeto modificaDatosPresupuestalesDTO.
     * @author Oscar S.
     * @param modificaDatosPresupuestalesDTO ModificaDatosPresupuestalesDTO
     * @param usuario String
     */
    public void updateIntercambioDatosPresupuestales(ModificaDatosPresupuestalesDTO modificaDatosPresupuestalesDTO, String usuario) {
        // Paso 1) Obtener la Plaza actual
        TdPlaza plazaOrigen = getPlaza(modificaDatosPresupuestalesDTO.getPlazaOrigen());
        TdPlaza plazaDestino = getPlaza(modificaDatosPresupuestalesDTO.getPlazaDestino());
        
        TdEmpleado empleadoOrigen = new TdEmpleado();
        TdEmpleado empleadoDestino = new TdEmpleado();
        
        // Paso 2) Obtener el Empleado actual
        if (plazaOrigen.getPlazaRfc() != null) {
            empleadoOrigen = super.persistence().get(TdEmpleadoDAO.class).getById(plazaOrigen.getPlazaRfc());
        }
        if (plazaDestino.getPlazaRfc() != null) {
            empleadoDestino = super.persistence().get(TdEmpleadoDAO.class).getById(plazaDestino.getPlazaRfc());
        }
        
        // Paso 3) Preparar objeto Plaza
        TdPlaza plazaVacanteOrigen = new TdPlaza();
        SirehUtils.copyProperties(plazaVacanteOrigen, plazaOrigen);
        TdPlaza plazaVacanteDestino = new TdPlaza();
        SirehUtils.copyProperties(plazaVacanteDestino, plazaDestino);
        
        // Paso 4) Quincena de Captura
        Integer mepQnaCaptura = super.getQuincenaCaptura().intValue();
        
        // Paso 5) Validaciones
        plazaVacanteOrigen.setIdUnidadPre(plazaDestino.getIdUnidadPre());
        plazaVacanteOrigen.setIdPuestoPre(plazaDestino.getIdPuestoPre());
        plazaVacanteOrigen.setIdEdoPre(plazaDestino.getIdEdoPre());
        plazaVacanteOrigen.setIdZonaEcoPre(plazaDestino.getIdZonaEcoPre());
        
        plazaVacanteDestino.setIdUnidadPre(plazaOrigen.getIdUnidadPre());
        plazaVacanteDestino.setIdPuestoPre(plazaOrigen.getIdPuestoPre());
        plazaVacanteDestino.setIdEdoPre(plazaOrigen.getIdEdoPre());
        plazaVacanteDestino.setIdZonaEcoPre(plazaOrigen.getIdZonaEcoPre());
        
        // Paso 6) Movimiento Personal2 - 514
        Integer idMovtoPersona = super.getMovimientoPersonal("CAMBIO_DE_DATOS_PRESUPUESTALES");
        
        // Paso 7) Update Plaza Vacante - Origen
        plazaVacanteOrigen.setUsuario(usuario);
        plazaVacanteOrigen.setFecModifico(new Date());
        plazaVacanteOrigen.setIdMovtoPersona(idMovtoPersona);
        plazaVacanteOrigen.setPlazaQnaCaptura(mepQnaCaptura);
        super.persistence().get(TdPlazaDAO.class).save(plazaVacanteOrigen);
        
        // Paso 8) Update Plaza Vacante - Destino
        plazaVacanteDestino.setUsuario(usuario);
        plazaVacanteDestino.setFecModifico(new Date());
        plazaVacanteDestino.setIdMovtoPersona(idMovtoPersona);
        plazaVacanteDestino.setPlazaQnaCaptura(mepQnaCaptura);
        super.persistence().get(TdPlazaDAO.class).save(plazaVacanteDestino);
        
        // Paso 9) Insert TN_MVTOS_EMP_PLA
        TnMovtosEmpPla tnMovtosEmpPlaOrigen = SirehUtils.transformToTnMovtosEmpPla(empleadoOrigen, plazaVacanteOrigen, idMovtoPersona, mepQnaCaptura, usuario, new Date(), super.getAtributoPuesto(plazaVacanteOrigen.getIdPuestoPre()));
        super.persistence().get(TnMovtosEmpPlaDAO.class).save(tnMovtosEmpPlaOrigen);
        
        // Paso 10) Insert TN_MVTOS_EMP_PLA
        TnMovtosEmpPla tnMovtosEmpPlaDestino = SirehUtils.transformToTnMovtosEmpPla(empleadoDestino, plazaVacanteDestino, idMovtoPersona, mepQnaCaptura, usuario, new Date(), super.getAtributoPuesto(plazaVacanteDestino.getIdPuestoPre()));
        super.persistence().get(TnMovtosEmpPlaDAO.class).save(tnMovtosEmpPlaDestino);
    }
    
    /**
     * Metodo encargado de Intercambiar Datos Nomina de dos plazas con base en el objeto promocionPermutaDTO.
     * @author Oscar S.
     * @param promocionPermutaDTO PromocionPermutaDTO
     * @param usuario String
     */
    public void updatePromocionPermuta(PromocionPermutaDTO promocionPermutaDTO, String usuario) {
        // Paso 1) Obtener la plaza actual
        TdPlaza plazaOrigen = getPlaza(promocionPermutaDTO.getPlazaOrigen());
        TdPlaza plazaDestino = getPlaza(promocionPermutaDTO.getPlazaDestino());
        
        // Paso 2) Obtener el empleado actual        
        TdEmpleado empleadoOrigen = super.persistence().get(TdEmpleadoDAO.class).getById(plazaOrigen.getPlazaRfc());
        TdEmpleado empleadoDestino = super.persistence().get(TdEmpleadoDAO.class).getById(plazaDestino.getPlazaRfc());
        
        // Paso 3) Preparar objeto plaza
        TdPlaza plazaVacanteOrigen = new TdPlaza();
        SirehUtils.copyProperties(plazaVacanteOrigen, plazaOrigen);
        TdPlaza plazaVacanteDestino = new TdPlaza();
        SirehUtils.copyProperties(plazaVacanteDestino, plazaDestino);
        
        // Paso 4) Quincena de captura
        Integer mepQnaCaptura = super.getQuincenaCaptura().intValue();
        
        // Paso 5) Validaciones rfc
        plazaVacanteOrigen.setPlazaRfc(plazaDestino.getPlazaRfc());
        plazaVacanteDestino.setPlazaRfc(plazaOrigen.getPlazaRfc());
        
        // Paso 6) Validacion de fechas

        Date fechaInicial = promocionPermutaDTO.getPlazaIniCont() != null ? (Date) promocionPermutaDTO.getPlazaIniCont() : null;
        Date fechaFinal = promocionPermutaDTO.getPlazaFinCont() != null ? (Date) promocionPermutaDTO.getPlazaFinCont() : null;
        
        if(fechaInicial == null || (fechaFinal == null && !promocionPermutaDTO.isCheckFechaTermino())){
            throw new ServiceException("Los campos Vigencia inicial y Término de vigencia no pueden ser vacios.");
        } else if (fechaInicial != null && fechaFinal != null && fechaInicial.compareTo(fechaFinal) > 0) {
            throw new ServiceException("El Término de vigencia no puede ser menor que la Vigencia inicial.");
        } else if (fechaInicial != null && DateUtils.truncate(fechaInicial, Calendar.DATE).after(DateUtils.truncate(SirehUtils.getQuincenaCapturaAsDate(super.getQuincenaCaptura().intValue(), 'F'), Calendar.DATE))) {
            throw new ServiceException("El campo de vigencia inicial no debe ser mayor al periodo de la quincena de captura.");
        } else {
            // Fecha Inicial - RETROACTIVO 90 DIAS 
            if (SirehUtils.comparaFechaLiberacionRetroactivo(fechaInicial, super.parameter().getString("RETROACTIVO_PAGO"))) {
                // Deben ser Iguales
                plazaVacanteOrigen.setPlazaIniCont(promocionPermutaDTO.getPlazaIniCont());
                plazaVacanteOrigen.setPlazaUltimoMovto(promocionPermutaDTO.getPlazaIniCont());
                
                plazaVacanteDestino.setPlazaIniCont(promocionPermutaDTO.getPlazaIniCont());
                plazaVacanteDestino.setPlazaUltimoMovto(promocionPermutaDTO.getPlazaIniCont());
            } else {
                throw new ServiceException("El campo Vigencia inicial debe estar dentro del rango retroactivo de 90 días.");
            }
             
            // Fecha Infinita
            if (promocionPermutaDTO.isCheckFechaTermino()) {
                Date fechaInfinita = new Date();
                SimpleDateFormat formatoDelTexto = new SimpleDateFormat("yyyy-MM-dd");
                try {
                    fechaInfinita = formatoDelTexto.parse(getApFin());
                } catch (ParseException ex) {
                    ex.printStackTrace();
                }
                plazaVacanteOrigen.setPlazaFinCont(fechaInfinita);
                plazaVacanteDestino.setPlazaFinCont(fechaInfinita);
            } else {
                plazaVacanteOrigen.setPlazaFinCont(promocionPermutaDTO.getPlazaFinCont());
                plazaVacanteDestino.setPlazaFinCont(promocionPermutaDTO.getPlazaFinCont());
            }
        }

        
        // Paso 7) Movimiento personal - 224
        Integer idMovtoPersona = super.getMovimientoPersonal("PROMOCION_PERMUTA");
        Date ultimoMovto = new Date();
        
        // Paso 8) Update plaza Vacante - Origen
        plazaVacanteOrigen.setUsuario(usuario);
        plazaVacanteOrigen.setFecModifico(ultimoMovto);
        plazaVacanteOrigen.setIdMovtoPersona(idMovtoPersona);
        plazaVacanteOrigen.setPlazaQnaCaptura(mepQnaCaptura);
        
        // Paso 9) Update empleado - Destino
        empleadoDestino.setIdPlazaVigente(plazaOrigen.getIdPlaza());
        empleadoDestino.setIdUltimoMovto(idMovtoPersona);
        empleadoDestino.setFecUltimoMovto(ultimoMovto != null ? DateUtils.truncate(ultimoMovto, Calendar.DATE) : null);
        empleadoDestino.setEmpQnaCaptura(mepQnaCaptura);
        empleadoDestino.setUsuario(usuario);
        empleadoDestino.setFecModifico(ultimoMovto);
        
        // Paso 10) Update plaza Vacante - Destino
        plazaVacanteDestino.setUsuario(usuario);
        plazaVacanteDestino.setFecModifico(ultimoMovto);
        plazaVacanteDestino.setIdMovtoPersona(idMovtoPersona);
        plazaVacanteDestino.setPlazaQnaCaptura(mepQnaCaptura);
        
        // Paso 11) Update empleado - Origen
        empleadoOrigen.setIdPlazaVigente(plazaDestino.getIdPlaza());
        empleadoOrigen.setIdUltimoMovto(idMovtoPersona);
        empleadoOrigen.setFecUltimoMovto(ultimoMovto != null ? DateUtils.truncate(ultimoMovto, Calendar.DATE) : null);
        empleadoOrigen.setEmpQnaCaptura(mepQnaCaptura);
        empleadoOrigen.setUsuario(usuario);
        empleadoOrigen.setFecModifico(ultimoMovto);
        
        /*********************************************************************************/
        // Paso 12) Preparar objeto plaza y empleado temporales, se corrige problema con indice IX_TD_PLAZA_09.
        // Plaza temp
        TdPlaza plazaVacanteDestinoTemp = new TdPlaza();
        SirehUtils.copyProperties(plazaVacanteDestinoTemp, plazaDestino);
        plazaVacanteDestinoTemp.setPlazaRfc("");
        
        // Paso 13) Updates temporales
        super.persistence().get(TdPlazaDAO.class).save(plazaVacanteDestinoTemp);
        /*********************************************************************************/
        
        // Paso 14) Updates definitivos
        super.persistence().get(TdPlazaDAO.class).save(plazaVacanteOrigen);
        super.persistence().get(TdEmpleadoDAO.class).save(empleadoDestino);
        super.persistence().get(TdPlazaDAO.class).save(plazaVacanteDestino);
        super.persistence().get(TdEmpleadoDAO.class).save(empleadoOrigen);
        
        // Paso 15) Insert TN_MVTOS_EMP_PLA
        TnMovtosEmpPla tnMovtosEmpPlaOrigen = SirehUtils.transformToTnMovtosEmpPla(empleadoDestino, plazaVacanteOrigen, idMovtoPersona, mepQnaCaptura, usuario, ultimoMovto, super.getAtributoPuesto(plazaVacanteOrigen.getIdPuestoNom()));
        super.persistence().get(TnMovtosEmpPlaDAO.class).save(tnMovtosEmpPlaOrigen);
        
        TnMovtosEmpPla tnMovtosEmpPlaDestino = SirehUtils.transformToTnMovtosEmpPla(empleadoOrigen, plazaVacanteDestino, idMovtoPersona, mepQnaCaptura, usuario, ultimoMovto, super.getAtributoPuesto(plazaVacanteDestino.getIdPuestoNom()));
        super.persistence().get(TnMovtosEmpPlaDAO.class).save(tnMovtosEmpPlaDestino);
    }

    public List<ItemDTO> findPuestoVacanciaByIdPtoOrigenPtoExcepcion(String idPtoOrigen, Integer ptoExcepcion) {
    
        List<Item> listaItem = new ArrayList<Item>();
        if(ptoExcepcion != null && ptoExcepcion.intValue() == 2 ){
            listaItem = super.persistence().get(QueryTcPuestoVacanciaDAO.class).findAllPuestos();
        }else {
            listaItem = super.persistence().get(QueryTcPuestoVacanciaDAO.class).findByIdOrigenPtoException(idPtoOrigen, ptoExcepcion);            
        }
        List<ItemDTO> listaItemDTO = new ArrayList<ItemDTO>();

        if (listaItem != null && !listaItem.isEmpty()) {
            for (int i = 0; i < listaItem.size(); i++) {
                ItemDTO itemDTO = new ItemDTO(listaItem.get(i).getClave(), listaItem.get(i).getValor());
                listaItemDTO.add(itemDTO);
            }
        }
        return listaItemDTO;
    }
    
    public String getTcVacanciaById(Integer idVacancia){
        TcVacancia tcVacancia = super.persistence().get(TcVacanciaDAO.class).getById(idVacancia);
        if(tcVacancia != null){
            return idVacancia + " - " + tcVacancia.getDescVacancia();
        }
        return null;
    }
    
    public PlazaEnConcursoDTO getPlazaEnConsurso(Integer idPlaza){
        List<CustomTdPlazaEnConcurso> lista = super.persistence().get(QueryTdPlazaDAO.class).getConsultaPlazaEnConcursoById(idPlaza);
        if(lista != null && !lista.isEmpty()){
            PlazaEnConcursoDTO plazaEnConcursoDTO = super.transformation().map(lista.get(0), PlazaEnConcursoDTO.class);
            return plazaEnConcursoDTO;
        }
        else return null;
    }
    
    public void updatePlazaEnConcurso(PlazaEnConcursoDTO plazaEnConcursoDTO, String movimiento){
        TdPlazaConcurso tdPlazaConcursoBase = super.persistence().get(QueryTdPlazaConcursoDAO.class).getByIdPlaza(plazaEnConcursoDTO.getIdPlaza());
        TdPlazaConcursoPK idComposite = null;
        String usuario = super.identity().get().getUserID();
        
        //  PLAZA SIN HISTORIA  --> CONCURSO 
        if(movimiento.equalsIgnoreCase("IC") | movimiento.equalsIgnoreCase("ID")){
            tdPlazaConcursoBase = new TdPlazaConcurso();
            idComposite = new TdPlazaConcursoPK(plazaEnConcursoDTO.getIdEstatus(), plazaEnConcursoDTO.getIdPlaza());
            tdPlazaConcursoBase.setIdentity(idComposite);
            tdPlazaConcursoBase.setUsuario(usuario);
            tdPlazaConcursoBase.setIdEtapa(plazaEnConcursoDTO.getIdEtapa());
            tdPlazaConcursoBase.setFecModifico( DateUtils.truncate(new Date(), Calendar.DATE) );
            if(movimiento.equalsIgnoreCase("IC")){ 
                tdPlazaConcursoBase.setFechaDesierta(null);
                tdPlazaConcursoBase.setFechaEtapa(plazaEnConcursoDTO.getFechaEtapa());
            }
            else if(movimiento.equalsIgnoreCase("ID")){
                tdPlazaConcursoBase.setFechaEtapa(null);
                tdPlazaConcursoBase.setFechaDesierta(plazaEnConcursoDTO.getFechaDesierta());
            }
            super.persistence().get(TdPlazaConcursoDAO.class).save(tdPlazaConcursoBase);
        }
        // CONCURSO --> CONCURSO
        else if(movimiento.equalsIgnoreCase("CC")){
            TdPlazaConcurso tdPlazaConcursoNueva = new TdPlazaConcurso( new TdPlazaConcursoPK(plazaEnConcursoDTO.getIdEstatus(), plazaEnConcursoDTO.getIdPlaza()),
                                                                        plazaEnConcursoDTO.getIdEtapa(),
                                                                        DateUtils.truncate(new Date(), Calendar.DATE),
                                                                        usuario,
                                                                        plazaEnConcursoDTO.getFechaDesierta(),
                                                                        plazaEnConcursoDTO.getFechaEtapa());
            
            // Respaldar el registro de TD_PLAZA_CONCURSO en TD_HISTORIA_DESIERTA
            TdPlazaConcurso plazaConcurso = super.getService(TdPlazaConcursoDAO.class).getById(new TdPlazaConcursoPK(tdPlazaConcursoBase.getIdEstatus(),tdPlazaConcursoBase.getIdPlaza()));
            TdHistoriaDesierta tdHistoriaDesierta = new TdHistoriaDesierta( new TdHistoriaDesiertaPK(plazaConcurso.getFechaEtapa(), plazaConcurso.getIdPlaza(), plazaConcurso.getIdEstatus()), 
                                                                            DateUtils.truncate(new Date(), Calendar.DATE), 
                                                                            super.identity().get().getUserID(),
                                                                            plazaConcurso.getIdEtapa(),
                                                                            plazaConcurso.getIdEstatus(),
                                                                            plazaConcurso.getFechaEtapa());
            super.persistence().get(TdHistoriaDesiertaDAO.class).save(tdHistoriaDesierta);
            
            // Inserta el nuevo registro en TD_PLAZA_CONCURSO
            super.persistence().get(TdPlazaConcursoDAO.class).delete(tdPlazaConcursoBase);
            super.persistence().get(TdPlazaConcursoDAO.class).save(tdPlazaConcursoNueva);
        }
        // PLAZA EN CONCURSO --> PLAZA DESIERTA
        else if(movimiento.equalsIgnoreCase("CD")){
            TdPlazaConcurso tdPlazaConcursoNueva = new TdPlazaConcurso( new TdPlazaConcursoPK(plazaEnConcursoDTO.getIdEstatus(), plazaEnConcursoDTO.getIdPlaza()),
                                                                        plazaEnConcursoDTO.getIdEtapa(),
                                                                        DateUtils.truncate(new Date(), Calendar.DATE),
                                                                        usuario,
                                                                        plazaEnConcursoDTO.getFechaDesierta(),
                                                                        plazaEnConcursoDTO.getFechaEtapa());
            
            // Respaldar el registro de TD_PLAZA_CONCURSO en TD_HISTORIA_DESIERTA
            TdPlazaConcurso plazaConcurso = super.getService(TdPlazaConcursoDAO.class).getById(new TdPlazaConcursoPK(tdPlazaConcursoBase.getIdEstatus(),tdPlazaConcursoBase.getIdPlaza()));
            
            TdHistoriaDesierta tdHistoriaDesierta = new TdHistoriaDesierta(  new TdHistoriaDesiertaPK(plazaConcurso.getFechaEtapa(), plazaConcurso.getIdPlaza(), plazaConcurso.getIdEstatus()), 
                                                                                DateUtils.truncate(new Date(), Calendar.DATE), 
                                                                                usuario, 
                                                                                plazaConcurso.getIdEtapa(), 
                                                                                plazaConcurso.getIdEstatus(), 
                                                                                plazaConcurso.getFechaEtapa());
            super.persistence().get(TdHistoriaDesiertaDAO.class).save(tdHistoriaDesierta);
            
            // Inserta el nuevo registro en TD_PLAZA_CONCURSO
            super.persistence().get(TdPlazaConcursoDAO.class).delete(tdPlazaConcursoBase);
            super.persistence().get(TdPlazaConcursoDAO.class).save(tdPlazaConcursoNueva);
        }
        else if(movimiento.equalsIgnoreCase("DC")){
            TdPlazaConcurso plazaConcurso = super.getService(TdPlazaConcursoDAO.class).getById(new TdPlazaConcursoPK(tdPlazaConcursoBase.getIdEstatus(),tdPlazaConcursoBase.getIdPlaza()));
            TdHistoriaDesierta tdHistoriaDesierta = new TdHistoriaDesierta( new TdHistoriaDesiertaPK(plazaConcurso.getFechaDesierta(), plazaConcurso.getIdPlaza(),  plazaConcurso.getIdEstatus()), 
                                                                            DateUtils.truncate(new Date(), Calendar.DATE), 
                                                                            usuario, 
                                                                            plazaConcurso.getIdEtapa(), 
                                                                            plazaConcurso.getIdEstatus(), 
                                                                            plazaConcurso.getFechaEtapa());
            super.persistence().get(TdHistoriaDesiertaDAO.class).save(tdHistoriaDesierta);
            
            TdPlazaConcurso tdPlazaConcursoNueva = new TdPlazaConcurso( new TdPlazaConcursoPK(plazaEnConcursoDTO.getIdEstatus(), plazaEnConcursoDTO.getIdPlaza()),
                                                                        plazaEnConcursoDTO.getIdEtapa(),
                                                                        DateUtils.truncate(new Date(), Calendar.DATE),
                                                                        usuario,
                                                                        null,
                                                                        plazaEnConcursoDTO.getFechaEtapa());
            // Inserta el nuevo registro en TD_PLAZA_CONCURSO
            super.persistence().get(TdPlazaConcursoDAO.class).delete(tdPlazaConcursoBase);
            super.persistence().get(TdPlazaConcursoDAO.class).save(tdPlazaConcursoNueva);
        }
        else if(movimiento.equalsIgnoreCase("DD")){
            TdPlazaConcurso plazaConcurso = super.getService(TdPlazaConcursoDAO.class).getById(new TdPlazaConcursoPK(tdPlazaConcursoBase.getIdEstatus(),tdPlazaConcursoBase.getIdPlaza()));
            TdHistoriaDesierta tdHistoriaDesierta = new TdHistoriaDesierta( new TdHistoriaDesiertaPK(plazaConcurso.getFechaDesierta(), plazaConcurso.getIdPlaza(), plazaConcurso.getIdEstatus()), 
                                                                            DateUtils.truncate(new Date(), Calendar.DATE), 
                                                                            usuario,
                                                                            plazaConcurso.getIdEtapa(), 
                                                                            plazaConcurso.getIdEstatus(), 
                                                                            plazaConcurso.getFechaEtapa());
            super.persistence().get(TdHistoriaDesiertaDAO.class).save(tdHistoriaDesierta);
            TdPlazaConcurso tdPlazaConcursoNueva = new TdPlazaConcurso( new TdPlazaConcursoPK(plazaEnConcursoDTO.getIdEstatus(), plazaEnConcursoDTO.getIdPlaza()),
                                                                        plazaEnConcursoDTO.getIdEtapa(),
                                                                        DateUtils.truncate(new Date(), Calendar.DATE),
                                                                        usuario,
                                                                        plazaEnConcursoDTO.getFechaDesierta(),
                                                                        plazaEnConcursoDTO.getFechaEtapa());
            // Inserta el nuevo registro en TD_PLAZA_CONCURSO
            super.persistence().get(TdPlazaConcursoDAO.class).delete(tdPlazaConcursoBase);
            super.persistence().get(TdPlazaConcursoDAO.class).save(tdPlazaConcursoNueva);
            
        }
        // CONCURSO --> CANCELADO
        else if(movimiento.equalsIgnoreCase("CCA")){
            TdPlazaConcurso tdPlazaConcursoNueva = new TdPlazaConcurso(new TdPlazaConcursoPK(plazaEnConcursoDTO.getIdEstatus(), plazaEnConcursoDTO.getIdPlaza()),
                                                                plazaEnConcursoDTO.getIdEtapa(),
                                                                DateUtils.truncate(new Date(), Calendar.DATE),
                                                                usuario,
                                                                plazaEnConcursoDTO.getFechaCancelado(),
                                                                plazaEnConcursoDTO.getFechaEtapa());
            
            // Respaldar el registro de TD_PLAZA_CONCURSO en TD_HISTORIA_DESIERTA
            TdPlazaConcurso plazaConcurso = super.getService(TdPlazaConcursoDAO.class).getById(new TdPlazaConcursoPK(tdPlazaConcursoBase.getIdEstatus(),tdPlazaConcursoBase.getIdPlaza()));
            
            TdHistoriaDesierta tdHistoriaDesierta = new TdHistoriaDesierta( new TdHistoriaDesiertaPK(plazaConcurso.getFechaEtapa(), plazaConcurso.getIdPlaza(), plazaConcurso.getIdEstatus()), 
                                                                            DateUtils.truncate(new Date(), Calendar.DATE), 
                                                                            usuario, 
                                                                            plazaConcurso.getIdEtapa(), 
                                                                            plazaConcurso.getIdEstatus(), 
                                                                            plazaConcurso.getFechaEtapa());
            super.persistence().get(TdHistoriaDesiertaDAO.class).save(tdHistoriaDesierta);
            // Inserta el nuevo registro en TD_PLAZA_CONCURSO
            super.persistence().get(TdPlazaConcursoDAO.class).delete(tdPlazaConcursoBase);
            super.persistence().get(TdPlazaConcursoDAO.class).save(tdPlazaConcursoNueva);
        }
        // CANCELADO --> CONCURSO
        else if(movimiento.equalsIgnoreCase("CAC")){
            TdPlazaConcurso tdPlazaConcursoNueva = new TdPlazaConcurso(new TdPlazaConcursoPK(plazaEnConcursoDTO.getIdEstatus(), plazaEnConcursoDTO.getIdPlaza()),
                                                                plazaEnConcursoDTO.getIdEtapa(),
                                                                DateUtils.truncate(new Date(), Calendar.DATE),
                                                                usuario,
                                                                null,
                                                                plazaEnConcursoDTO.getFechaEtapa());
            
            // Respaldar el registro de TD_PLAZA_CONCURSO en TD_HISTORIA_DESIERTA
            TdPlazaConcurso plazaConcurso = super.getService(TdPlazaConcursoDAO.class).getById(new TdPlazaConcursoPK(tdPlazaConcursoBase.getIdEstatus(),tdPlazaConcursoBase.getIdPlaza()));
            
            TdHistoriaDesierta tdHistoriaDesierta = new TdHistoriaDesierta( new TdHistoriaDesiertaPK(plazaConcurso.getFechaDesierta(), plazaConcurso.getIdPlaza(), plazaConcurso.getIdEstatus()), 
                                                                            DateUtils.truncate(new Date(), Calendar.DATE), 
                                                                            usuario, 
                                                                            plazaConcurso.getIdEtapa(), 
                                                                            plazaConcurso.getIdEstatus(), 
                                                                            plazaConcurso.getFechaEtapa());
            super.persistence().get(TdHistoriaDesiertaDAO.class).save(tdHistoriaDesierta);
            // Inserta el nuevo registro en TD_PLAZA_CONCURSO
            super.persistence().get(TdPlazaConcursoDAO.class).delete(tdPlazaConcursoBase);
            super.persistence().get(TdPlazaConcursoDAO.class).save(tdPlazaConcursoNueva);
        }
    }
    
    public PlazaEnConcursoDTO findPlazaConcursoById(PlazaEnConcursoDTO plazaEnConcursoDTO){
        TdPlazaConcurso tdPlazaConcursoBase = super.persistence().get(QueryTdPlazaConcursoDAO.class).getByIdPlaza(plazaEnConcursoDTO.getIdPlaza());
        return super.transformation().map(tdPlazaConcursoBase, PlazaEnConcursoDTO.class);
    }
}

