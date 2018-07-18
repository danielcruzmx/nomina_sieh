package gob.shcp.sireh.service.expediente;

import gob.shcp.fsn.data.DAO;
import gob.shcp.fsn.service.AbstractService;

import gob.shcp.sireh.data.jdbc.QueryExpedienteDAO;
import gob.shcp.sireh.data.jdbc.TdCurriculoCurDAO;
import gob.shcp.sireh.data.jdbc.TdCurriculoEscDAO;
import gob.shcp.sireh.data.jdbc.TdCurriculoExplDAO;
import gob.shcp.sireh.data.jdbc.TdEmpleadoDAO;

import gob.shcp.sireh.data.jdbc.TnComprobanteDAO;
import gob.shcp.sireh.data.jdbc.TnComprobanteDigDAO;
import gob.shcp.sireh.data.jdbc.support.CustomDoctosExpPersonal;
import gob.shcp.sireh.data.jdbc.support.CustomTnComprobante;

import gob.shcp.sireh.domain.CustomTdExpDoctosSinDatos;
import gob.shcp.sireh.domain.jdbc.CustomExpediente;
import gob.shcp.sireh.domain.jdbc.CustomTdDepEco;
import gob.shcp.sireh.domain.jdbc.CustomTdExpAntecedentesAcademicos;
import gob.shcp.sireh.domain.jdbc.CustomTdExpCapacitacion;
import gob.shcp.sireh.domain.jdbc.CustomTdExpLab;
import gob.shcp.sireh.domain.jdbc.CustomTnHistoricoPago;
import gob.shcp.sireh.domain.jdbc.CustomTnMovtoConceptoPago;
import gob.shcp.sireh.domain.jdbc.CustomTnMovtosEmpPla;
import gob.shcp.sireh.domain.jdbc.TdCurriculoCur;
import gob.shcp.sireh.domain.jdbc.TdCurriculoEsc;
import gob.shcp.sireh.domain.jdbc.TdCurriculoExpl;
import gob.shcp.sireh.domain.jdbc.TdEmpleado;
import gob.shcp.sireh.domain.jdbc.TnComprobante;
import gob.shcp.sireh.domain.jdbc.TnComprobanteDig;
import gob.shcp.sireh.domain.jdbc.TnComprobanteDigPK;
import gob.shcp.sireh.domain.jdbc.TnComprobantePK;

import gob.shcp.sireh.model.CustomTdExpCapacitacionDTO;
import gob.shcp.sireh.model.CustomTdExpDoctosSinDatosDTO;
import gob.shcp.sireh.model.nomina.terceros.timbradosat.TnComprobanteDigDTO;

import gob.shcp.sireh.model.expediente.CurricPubDTO;
import gob.shcp.sireh.model.expediente.CustomDoctosExpPersonalDTO;
import gob.shcp.sireh.model.expediente.CustomTdDepEcoDTO;
import gob.shcp.sireh.model.expediente.CustomTdExpAntecedentesAcademicosDTO;
import gob.shcp.sireh.model.expediente.CustomTdExpLabDTO;
import gob.shcp.sireh.model.expediente.CustomTnComprobanteDTO;
import gob.shcp.sireh.model.expediente.CustomTnHistoricoPagoDTO;
import gob.shcp.sireh.model.expediente.CustomTnMovtoConceptoPagoDTO;
import gob.shcp.sireh.model.expediente.CustomTnMovtosEmpPlaDTO;
import gob.shcp.sireh.model.expediente.ExpedienteDTO;


import gob.shcp.sireh.model.nomina.terceros.timbradosat.TnComprobanteDTO;

import java.text.NumberFormat;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

/**
 * Business Service encargado de atender solicitudes del expediente 
 */
public class ExpedienteBS extends AbstractService implements ExpedienteService {

    /**
     * @param rfcEmpleado
     * @return
     */
    public ExpedienteDTO getExpediente(String rfcEmpleado) {

        //******************* Paso 1) Obtiene el RFC actual
        List<CustomExpediente> listaExpedientes = super.persistence().get(QueryExpedienteDAO.class).findExpediente(rfcEmpleado);
        CustomExpediente expedientevar = listaExpedientes.get(0);
        
        //******************* Paso 2) Conversion de objeto de dominio a DTO
        final ExpedienteDTO expedienteDTO = super.transformation().map(expedientevar, ExpedienteDTO.class);
        
        //******************* Paso 3) Dependientes Economicos
        // Llenado de la lista de Dependientes economicos con el query       
        List<CustomTdDepEco> listaDependientesDomain = super.persistence().get(QueryExpedienteDAO.class).findDependientesEco(rfcEmpleado);
        // Conversion de objeto de dominio a DTO
        final List<CustomTdDepEcoDTO> listaDependientesDTO = super.transformation().map(listaDependientesDomain, CustomTdDepEcoDTO.class);
        // Set de valores al DTO
        expedienteDTO.setListaDependientesDTO(listaDependientesDTO);

        //******************* Paso 3.1) Antecedentes Academicos
        List<CustomTdExpAntecedentesAcademicos> listaAntAcademicosDomain = super.persistence().get(QueryExpedienteDAO.class).findAntAcademicos(rfcEmpleado);
        final List<CustomTdExpAntecedentesAcademicosDTO> listaAntAcademicosDTO = super.transformation().map(listaAntAcademicosDomain, CustomTdExpAntecedentesAcademicosDTO.class);
        expedienteDTO.setListaAntAcademicosDTO(listaAntAcademicosDTO);
        
        //******************* Paso 3.2) Capacitacion / Cursos
        List<CustomTdExpCapacitacion> listaCapacitacionDomain = super.persistence().get(QueryExpedienteDAO.class).findCapacitacion(rfcEmpleado);
        final List<CustomTdExpCapacitacionDTO> listaCapacitacionDTO = super.transformation().map(listaCapacitacionDomain, CustomTdExpCapacitacionDTO.class);
        expedienteDTO.setListaCursosDTO(listaCapacitacionDTO);
        
        //******************* Paso 3.3) Servicio Profesional de Carrera
         List<CustomTdExpDoctosSinDatos> listaSPCDomain = super.persistence().get(QueryExpedienteDAO.class).findSPC(rfcEmpleado);
         final List<CustomTdExpDoctosSinDatosDTO> listaSPCDTO = super.transformation().map(listaSPCDomain, CustomTdExpDoctosSinDatosDTO.class);
         expedienteDTO.setListaSPCDTO(listaSPCDTO);
        
        //****************** Paso 4) Experiencia Laboral
        // Llenado de la lista de Experiencia Laboral con el query 
        List<CustomTdExpLab> listaExperienciaLaboarlDomain = super.persistence().get(QueryExpedienteDAO.class).findExperienciaLaboral(rfcEmpleado);
        // Conversión de objeto de dominio a DTO
        final List<CustomTdExpLabDTO> listaExperienciaLaboralDTO = super.transformation().map(listaExperienciaLaboarlDomain, CustomTdExpLabDTO.class);
        // Set de valores al DTO
        expedienteDTO.setListaExperienciaLaboralDTO(listaExperienciaLaboralDTO);

        //****************** Paso 5) Conceptos de pago adicionales
        // Llenado de la lista de conceptos adicionales con el query.- PARAMETROS: 1 CAMPO=>RFC, 2=>STATUS REGISTRO, 2=>TIPO DE CONCEPTO Y 10=>CONCEPTOS, SI SE QUIERE OBTENER TODA LA INFORMACION SE INCLUYE %
        List<CustomTnMovtoConceptoPago> listaConceptosAdicionalesDomain = 
            super.persistence().get(QueryExpedienteDAO.class).findConceptosAdicionales(rfcEmpleado, "%", "%", "P%", 
                                                                                       "D%", "D%", "%", "%", "%", "%", 
                                                                                       "%", "%", "%", "%", "%", "%", 
                                                                                       "%", "%", "%", "%", "%");
        // Conversión de objeto de dominio a DTO
        final List<CustomTnMovtoConceptoPagoDTO> listaConceptosAdicionalesDTO = super.transformation().map(listaConceptosAdicionalesDomain, CustomTnMovtoConceptoPagoDTO.class);
        // Set de valores al DTO
        expedienteDTO.setListaConceptosAdicionalesDTO(listaConceptosAdicionalesDTO);

        //****************** Paso 6) Movimientos Empleado
        // Llenado de la lista de conceptos adicionales con el query 
        List<CustomTnMovtosEmpPla> listaMovimientosEmpleadoDomain = super.persistence().get(QueryExpedienteDAO.class).findMovimientosEmpleado(rfcEmpleado);
        // Conversión de objeto de dominio a DTO
        final List<CustomTnMovtosEmpPlaDTO> listaMovientosEmpleadoDTO = super.transformation().map(listaMovimientosEmpleadoDomain, CustomTnMovtosEmpPlaDTO.class);
        // Set de valores al DTO
        expedienteDTO.setListaMovimientosEmpleadoDTO(listaMovientosEmpleadoDTO);

        //****************** Paso 7) Historico de Pagos
        // Llenado de la lista de conceptos adicionales con el query 
        List<CustomTnHistoricoPago> listaHistoricoPagoDomain = super.persistence().get(QueryExpedienteDAO.class).findHistoricoPago(rfcEmpleado);
        // Conversión de objeto de dominio a DTO
        final List<CustomTnHistoricoPagoDTO> listaHistoricoPagoDTO = super.transformation().map(listaHistoricoPagoDomain, CustomTnHistoricoPagoDTO.class);
        // Set de valores al DTO
        expedienteDTO.setListaHistoricoPagoDTO(listaHistoricoPagoDTO);
        
        //****************** Paso 8) Timbrado
        List<CustomTnComprobante> comprobantes = super.persistence().get(QueryExpedienteDAO.class).findComprobante(rfcEmpleado);
        // Conversión de objeto de dominio a DTO
        final List<CustomTnComprobanteDTO> listaTnComprobanteDTO = super.transformation().map(comprobantes, CustomTnComprobanteDTO.class);
        // Set de valores al DTO
        expedienteDTO.setListaComprobanteDTO(listaTnComprobanteDTO);
        
        
        //****************** Paso 9) Incidencias de personal (Faltas, licencias y días economicos)
        // Llenado de la lista de conceptos adicionales con el query.- PARAMETROS: 1 CAMPO=>RFC, 2=>STATUS REGISTRO, 2=>TIPO DE CONCEPTO Y 10=>CONCEPTOS, SI SE QUIERE OBTENER TODA LA INFORMACION SE INCLUYE %
        List<CustomTnMovtoConceptoPago> listaIncidenciasDomain = super.persistence().get(QueryExpedienteDAO.class).findConceptosAdicionales(rfcEmpleado, "%", "%", "P%", 
                                                                                                                                                       "D%", "U%", "LS%", "LM%", "67%", 
                                                                                                                                                       "OE%", "OS%", "FA%", "OV%", 
                                                                                                                                                       "TV%", "17%", "18%", "DL%", 
                                                                                                                                                       "DM%", "I7%", "D7%", "D8%");
        // Conversión de objeto de dominio a DTO
        final List<CustomTnMovtoConceptoPagoDTO> listaIncidenciasDTO = super.transformation().map(listaIncidenciasDomain, CustomTnMovtoConceptoPagoDTO.class);
        // Set de valores al DTO
        expedienteDTO.setListaIncidenciasDTO(listaIncidenciasDTO);

        //****************** Paso 10)Notas de mérito

        //**************** Paso 11) Set de valores al DTO
        //DE CUSTOM PARA DAO, (FORMATEO DE IMPORTES Y ELIMINACION DE DOMICILIOS CUANDOS
        //FORMATEO DE IMPORTES Y ELIMINACION DE DOMICILIOS CUANDO NO TIENEN ID_INMUEBLE
        NumberFormat formatter = NumberFormat.getCurrencyInstance();
        String importeLabel;

        if (expedienteDTO.getSueldoNom() == null) {
            expedienteDTO.setSueldoNom(0.0);
        }
        if (expedienteDTO.getCompensacionNom() == null) {
            expedienteDTO.setCompensacionNom(0.0);
        }
        if (expedienteDTO.getImporteHonorario() == null) {
            expedienteDTO.setImporteHonorario(0.0);
        }

        importeLabel = formatter.format(expedienteDTO.getSueldoNom());
        expedienteDTO.setSueldoNomLabel(importeLabel);

        importeLabel = formatter.format(expedienteDTO.getCompensacionNom());
        expedienteDTO.setCompensacionNomLabel(importeLabel);

        importeLabel = formatter.format(expedienteDTO.getImporteHonorario());
        expedienteDTO.setSueldoHonLabel(importeLabel);

        if (expedienteDTO.getIdInmueble() == 0) {
            expedienteDTO.setDescInmueble(null);
        }
        if (expedienteDTO.getIdInmuebleJefe() == 0) {
            expedienteDTO.setDescInmuebleJefe(null);
        }

        return expedienteDTO;
    }
    
    /**
     * Metodo encargado de obtener el comprobante de pago.
     * @author Oscar S.
     * @param idComprobante RequestParam
     * @param rfcEmpleado RequestParam
     * @param idPaquete Integer
     * @return TnComprobanteDTO
     */
    public TnComprobanteDTO getExpedienteComprobante(Integer idComprobante, String rfcEmpleado, Integer idPaquete) {
        TnComprobantePK pk = new TnComprobantePK();
        pk.setIdComprobante(idComprobante.longValue());
        pk.setIdPaquete(idPaquete);
        pk.setCompRfc(rfcEmpleado);
        
        TnComprobante comprobante = super.persistence().get(TnComprobanteDAO.class).getById(pk);
        return super.transformation().map(comprobante, TnComprobanteDTO.class);
    }
    
    /**
     * Metodo encargado de cambiar el estado del comprobante a "FIRMADO".
     * @author Oscar S.
     * @param comprobante TnComprobanteDTO
     */
    public void firmarComprobante(TnComprobanteDTO comprobante) {
        TnComprobante compFirma = super.transformation().map(comprobante, TnComprobante.class);
        compFirma.setIdEdoComprobante(new Integer(3));
        super.persistence().get(TnComprobanteDAO.class).save(compFirma);
    }
    
    /**
     * Metodo encargado de obtener el listado de dcoumentos activos con base en el rfc del empleado.
     * @author Oscar S.
     * @param rfcEmpleado String
     * @param tipo String
     * @return List&lt;CustomDoctosExpPersonalDTO&gt;
     */
    public List<CustomDoctosExpPersonalDTO> getExpDoctoActivos(String rfcEmpleado, String tipo) {
        List<CustomDoctosExpPersonal> customDoctosExpPersonal = new ArrayList<CustomDoctosExpPersonal>();
        
        if (tipo.equals("FALTANTES_OBLIGATORIOS")) {
            customDoctosExpPersonal = super.persistence().get(QueryExpedienteDAO.class).getExpDoctoFaltantesObligatorios(rfcEmpleado, rfcEmpleado,rfcEmpleado, rfcEmpleado, rfcEmpleado, rfcEmpleado, rfcEmpleado, rfcEmpleado, rfcEmpleado, rfcEmpleado, rfcEmpleado, rfcEmpleado, rfcEmpleado, rfcEmpleado, rfcEmpleado, rfcEmpleado, rfcEmpleado, rfcEmpleado);
        } else if (tipo.equals("FALTANTES_LABORALES")) {
            customDoctosExpPersonal = super.persistence().get(QueryExpedienteDAO.class).getExpDoctoFaltantesLaborales(rfcEmpleado, rfcEmpleado, rfcEmpleado, rfcEmpleado, rfcEmpleado, rfcEmpleado);
        } else {
            customDoctosExpPersonal = super.persistence().get(QueryExpedienteDAO.class).getExpDoctoActivos(rfcEmpleado, rfcEmpleado, rfcEmpleado, rfcEmpleado, rfcEmpleado, rfcEmpleado, rfcEmpleado, rfcEmpleado, rfcEmpleado, rfcEmpleado, rfcEmpleado, rfcEmpleado, rfcEmpleado, rfcEmpleado, rfcEmpleado, rfcEmpleado, rfcEmpleado, rfcEmpleado, rfcEmpleado, rfcEmpleado, rfcEmpleado, rfcEmpleado);
        }
        logger.debug("customDoctosExpPersonal ------> " + customDoctosExpPersonal.size());
        
        return super.transformation().map(customDoctosExpPersonal, CustomDoctosExpPersonalDTO.class);
    }
    
    /**
     * Metodo encargado de obtener el listado de dcoumentos historicos con base en el rfc del empleado y el tipo de documento.
     * @author Oscar S.
     * @param rfcEmpleado String
     * @param idDocto String
     * @return List&lt;CustomDoctosExpPersonalDTO&gt;
     */
    public List<CustomDoctosExpPersonalDTO> getExpDoctoHistoricos(String rfcEmpleado, String idDocto) {
        List<CustomDoctosExpPersonal> customDoctosExpPersonal = new ArrayList<CustomDoctosExpPersonal>();

        List<String> DOC_OBLIGATORIOS = Arrays.asList("SOEMP", "CURRV", "CERME", "IDOFI", "MBPDV", "CNISF", "CILAB", "ABMIS", "CONNO");

        if (DOC_OBLIGATORIOS.contains(idDocto)) {
            // DOCUMENTOS OBLIGATORIOS
            customDoctosExpPersonal = super.persistence().get(QueryExpedienteDAO.class).getExpDoctoHistoricoObligatoriosPorTipo(idDocto, rfcEmpleado);
            
        } else if (idDocto.equals("ACNAC")) {
            // ACTA DE NACIMIENTO
            customDoctosExpPersonal = super.persistence().get(QueryExpedienteDAO.class).getExpDoctoHistoricoActaNacimiento(rfcEmpleado);

        } else if (idDocto.equals("CARMI")) {
            // CARTILLA LIBERADA DEL SMN
            customDoctosExpPersonal = super.persistence().get(QueryExpedienteDAO.class).getExpDoctoHistoricoCartilla(rfcEmpleado);
            
        } else if (idDocto.equals("CCURP"))  {
            // CURP
            customDoctosExpPersonal = super.persistence().get(QueryExpedienteDAO.class).getExpDoctoHistoricoCurp(rfcEmpleado);
        
        } else if (idDocto.equals("CODOM")) {
            // COMP DOMICILIO / FORMATO ACTUA
            customDoctosExpPersonal = super.persistence().get(QueryExpedienteDAO.class).getExpDoctoHistoricoCompDomicilio(rfcEmpleado);

        } else if (idDocto.equals("COEST")) {
            // COMPROBANTE DE ESTUDIOS 
            customDoctosExpPersonal = super.persistence().get(QueryExpedienteDAO.class).getExpDoctoHistoricoComprobanteEstudios(rfcEmpleado);

        } else if (idDocto.equals("CRRFC"))  {
            // RFC EXPEDIDO POR EL SAT
            customDoctosExpPersonal = super.persistence().get(QueryExpedienteDAO.class).getExpDoctoHistoricoRfc(rfcEmpleado);        
        
        } else if (idDocto.equals("CTABA")) {
            // DOCUMENTO BANCARIO PARA NOMINA
            customDoctosExpPersonal = super.persistence().get(QueryExpedienteDAO.class).getExpDoctoHistoricoBancario(rfcEmpleado);

        } else if (idDocto.equals("FECLA"))  {
            // FECHAS LABORALES
            customDoctosExpPersonal = super.persistence().get(QueryExpedienteDAO.class).getExpDoctoHistoricoFechasLaborales(rfcEmpleado);
        
        } else {
            customDoctosExpPersonal = new ArrayList<CustomDoctosExpPersonal>();
            
        }
        logger.debug("getExpDoctoHistoricos -> customDoctosExpPersonal ------> " + customDoctosExpPersonal.size());

        return super.transformation().map(customDoctosExpPersonal, CustomDoctosExpPersonalDTO.class);
    }

    /**
     * Metodo encargado de obtener el listado de dcoumentos activos-registrados con base en el rfc del empleado y el id de documento.
     * @author Oscar S.
     * @param rfcEmpleado String
     * @param idDocto String
     * @return List&lt;CustomDoctosExpPersonalDTO&gt;
     */
    public List<CustomDoctosExpPersonalDTO> getExpDoctoSubgridActivosRegistrados(String rfcEmpleado, String idDocto) {
        List<CustomDoctosExpPersonal> customDoctosExpPersonal = new ArrayList<CustomDoctosExpPersonal>();
        List<String> DOC_SIN_DATOS = Arrays.asList("SOEMP", "CURRV", "CERME", "IDOFI", "DCLFD", "MBPDV", "CNISF", "CILAB", "SOCEM", "ABMIS", "CIFON", "INSAR", "AHOSO", 
                                                   "CSGMM", "SEGUR", "OFIDO", "CONNO", "ACSPF","PSPAS", "DOSPF", "COSER", "HUSER", "CONES", "ACTAD", "RNOIC", "AEOIC", 
                                                   "ACTAT", "MEDDI", "CONHE", "CAISS", "DEMAN", "LAUEJ", "BECAS", "ACDEF", "OFIRE", "OFISU", "ACUBA", "DMINC", "DESBE", "LICIS");

        if (DOC_SIN_DATOS.contains(idDocto)) {
            // DOCUMENTOS SIN DATOS
            customDoctosExpPersonal = super.persistence().get(QueryExpedienteDAO.class).getExpDoctoSubgridActivosRegistradosObligatoriosPorTipo(idDocto, rfcEmpleado);
            
        } else if (idDocto.equals("CCTDE")) {
            // CAPACITACION
            customDoctosExpPersonal = super.persistence().get(QueryExpedienteDAO.class).getExpDoctoSubgridActivosRegistradosCapacitacion(rfcEmpleado);
            
        } else if (idDocto.equals("DFDBE")) {
            // FAMILIARES, DEPENDIENTES, BENEFICIARIOS
             customDoctosExpPersonal = super.persistence().get(QueryExpedienteDAO.class).getExpDoctoSubgridActivosRegistradosFamiliares(rfcEmpleado);
             
            } else if (idDocto.equals("DESBE")) {
                // DEPENDIENTES
                 customDoctosExpPersonal = super.persistence().get(QueryExpedienteDAO.class).getExpDoctoSubgridActivosRegistradosDependientes(rfcEmpleado);

        } else if (idDocto.equals("COEST")) {
            // COMPROBANTE DE ESTUDIOS 
            customDoctosExpPersonal = super.persistence().get(QueryExpedienteDAO.class).getExpDoctoSubgridActivosRegistradosComprobanteEstudios(rfcEmpleado);
            
        } else if (idDocto.equals("EXPLA")) {
            // EXPERIENCIA LABORAL
            customDoctosExpPersonal = super.persistence().get(QueryExpedienteDAO.class).getExpDoctoSubgridActivosRegistradosExperienciaLaboral(rfcEmpleado); 
            
        }
        logger.debug("getExpDoctoSubgridActivosRegistrados -> customDoctosExpPersonal ------> " + customDoctosExpPersonal.size());

        return super.transformation().map(customDoctosExpPersonal, CustomDoctosExpPersonalDTO.class);
    }
    
    public List<CustomDoctosExpPersonalDTO> getExpDoctoSubgridActivo(String rfcEmpleado, String idDocto) {
        List<CustomDoctosExpPersonal> customDoctosExpPersonal = new ArrayList<CustomDoctosExpPersonal>();
        
        if (idDocto.equals("AVIAC")) {
            // AVISO EN CASO DE ACCIDENTE
            customDoctosExpPersonal = super.persistence().get(QueryExpedienteDAO.class).getExpDoctoSubgridActivoAvisoAccdidente(rfcEmpleado);
            
        } else if (idDocto.equals("DATCO")) {
            // DATOS COMPLEMENTARIOS
            customDoctosExpPersonal = super.persistence().get(QueryExpedienteDAO.class).getExpDoctoSubgridActivoDatosComplementarios(rfcEmpleado);
        }
        logger.debug("getExpDoctoSubgridActivo -> customDoctosExpPersonal ------> " + customDoctosExpPersonal.size());

        return super.transformation().map(customDoctosExpPersonal, CustomDoctosExpPersonalDTO.class);
    }
    
    /**
     * Metodo encargado de obtener el comprobante de pago.
     * @author Martin C
     */
    public TnComprobanteDigDTO getExpedienteComprobanteV33(Integer cnFolio, String rfcEmpleado, Integer cnDifFolio) {
        TnComprobanteDigPK pk = new TnComprobanteDigPK();
        pk.setCnFolio(cnFolio.longValue());
        pk.setCnDifFolio(cnDifFolio);
        
        TnComprobanteDig comprobante = super.persistence().get(TnComprobanteDigDAO.class).getById(pk);
        return super.transformation().map(comprobante, TnComprobanteDigDTO.class);
    }    

    /**
     * Metodo encargado de obtener los datos del Empleado con base en su RFC.
     * @param rfcEmpleado String
     */
    public CurricPubDTO getCurriculumPublico(String rfcEmpleado) {
        TdEmpleado empleado = super.persistence().get(TdEmpleadoDAO.class).getById(rfcEmpleado);
        TdCurriculoCur cursos = super.persistence().get(TdCurriculoCurDAO.class).getById(rfcEmpleado);
        TdCurriculoEsc escolaridad = super.persistence().get(TdCurriculoEscDAO.class).getById(rfcEmpleado);
        TdCurriculoExpl experiencia = super.persistence().get(TdCurriculoExplDAO.class).getById(rfcEmpleado);

        CurricPubDTO curricPubDTO = super.transformation().map(empleado, CurricPubDTO.class);

        curricPubDTO.setRfcEmpleado(empleado.getRfcEmpleado());
        curricPubDTO.setNombreEmpleado(empleado.getNombreEmpleado());
        curricPubDTO.setPrimerApellido(empleado.getPrimerApellido());
        curricPubDTO.setSegundoApellido(empleado.getSegundoApellido());
        
        if (escolaridad == null) {
            curricPubDTO.setEscolaridad( "" );
            curricPubDTO.setInstEduc( "" );
            curricPubDTO.setGradoAvancee( "" );
            curricPubDTO.setDoctoEsc( "" );
            curricPubDTO.setCarrera( "" );
        } else {
            curricPubDTO.setEscolaridad( escolaridad.getCurriceEscolaridad() );
            curricPubDTO.setInstEduc( escolaridad.getCurriceInstEduc() );
            curricPubDTO.setGradoAvancee( escolaridad.getCurriceGradoAvance() );
            curricPubDTO.setDoctoEsc( escolaridad.getCurriceDocto() );
            curricPubDTO.setCarrera( escolaridad.getCurriceCarrera() );
        }

        if (cursos == null) {
            curricPubDTO.setCurso1( "" );
            curricPubDTO.setInstituto1( "" );
            curricPubDTO.setDuracion1( "" );
            curricPubDTO.setGradoAvancec1( "" );
            curricPubDTO.setDoctoCur1( "" );
            curricPubDTO.setCurso2( "" );
            curricPubDTO.setInstituto2( "" );
            curricPubDTO.setDuracion2( "" );
            curricPubDTO.setGradoAvancec2( "" );
            curricPubDTO.setDoctoCur2( "" );
            curricPubDTO.setCurso3( "" );
            curricPubDTO.setInstituto3( "" );
            curricPubDTO.setDuracion3( "" );
            curricPubDTO.setGradoAvancec3( "" );
            curricPubDTO.setDoctoCur3( "" );
        } else {
            curricPubDTO.setCurso1( cursos.getCurriccCurso1() );
            curricPubDTO.setInstituto1( cursos.getCurriccInstituto1() );
            curricPubDTO.setDuracion1( cursos.getCurriccDuracion1() );
            curricPubDTO.setGradoAvancec1( cursos.getCurriccGradoa1() );
            curricPubDTO.setDoctoCur1( cursos.getCurriccDocto1() );
            curricPubDTO.setCurso2( cursos.getCurriccCurso2() );
            curricPubDTO.setInstituto2( cursos.getCurriccInstituto2() );
            curricPubDTO.setDuracion2( cursos.getCurriccDuracion2() );
            curricPubDTO.setGradoAvancec2( cursos.getCurriccGradoa2() );
            curricPubDTO.setDoctoCur2( cursos.getCurriccDocto2() );
            curricPubDTO.setCurso3( cursos.getCurriccCurso3() );
            curricPubDTO.setInstituto3( cursos.getCurriccInstituto3() );
            curricPubDTO.setDuracion3( cursos.getCurriccDuracion3() );
            curricPubDTO.setGradoAvancec3( cursos.getCurriccGradoa3() );
            curricPubDTO.setDoctoCur3( cursos.getCurriccDocto3() );
        }

        if (experiencia == null) {
            curricPubDTO.setSector1( "" );
            curricPubDTO.setLugar1( "" );
            curricPubDTO.setArea1( "" );
            curricPubDTO.setPuesto1( "" );
            curricPubDTO.setFuncion1( "");
            curricPubDTO.setFecIni1( "" );
            curricPubDTO.setFecFin1( "" );
            curricPubDTO.setSector2( "" );
            curricPubDTO.setLugar2( "" );
            curricPubDTO.setArea2( "" );
            curricPubDTO.setPuesto2( "" );
            curricPubDTO.setFuncion2( "" );
            curricPubDTO.setFecIni2( "" );
            curricPubDTO.setFecFin2( "" );
            curricPubDTO.setSector3( "" );
            curricPubDTO.setLugar3( "" );
            curricPubDTO.setArea3( "" );
            curricPubDTO.setPuesto3( "" );
            curricPubDTO.setFuncion3( "" );
            curricPubDTO.setFecIni3( "" );
            curricPubDTO.setFecFin3( "" );
        } else {
            curricPubDTO.setSector1( experiencia.getCurriclSector1() );
            curricPubDTO.setLugar1( experiencia.getCurriclLugar1() );
            curricPubDTO.setArea1( experiencia.getCurriclArea1() );
            curricPubDTO.setPuesto1( experiencia.getCurriclPuesto1() );
            curricPubDTO.setFuncion1( experiencia.getCurriclFuncion1() );
            curricPubDTO.setFecIni1( experiencia.getCurriclFecIni1() );
            curricPubDTO.setFecFin1( experiencia.getCurriclFecFin1() );
            curricPubDTO.setSector2( experiencia.getCurriclSector2() );
            curricPubDTO.setLugar2( experiencia.getCurriclLugar2() );
            curricPubDTO.setArea2( experiencia.getCurriclArea2() );
            curricPubDTO.setPuesto2( experiencia.getCurriclPuesto2() );
            curricPubDTO.setFuncion2( experiencia.getCurriclFuncion2() );
            curricPubDTO.setFecIni2( experiencia.getCurriclFecIni2() );
            curricPubDTO.setFecFin2( experiencia.getCurriclFecFin2() );
            curricPubDTO.setSector3( experiencia.getCurriclSector3() );
            curricPubDTO.setLugar3( experiencia.getCurriclLugar3() );
            curricPubDTO.setArea3( experiencia.getCurriclArea3() );
            curricPubDTO.setPuesto3( experiencia.getCurriclPuesto3() );
            curricPubDTO.setFuncion3( experiencia.getCurriclFuncion3() );
            curricPubDTO.setFecIni3( experiencia.getCurriclFecIni3() );
            curricPubDTO.setFecFin3( experiencia.getCurriclFecFin3() );
        }
        return curricPubDTO;

    }
    
    /**
     * Metodo encargado de actualizar informacion de curriculum del Empleado con base en el objeto curricPubDTO.
     * @param curricPubDTO CurricPubDTO
     * @param usuario String
     */
    public void updateCurriculumPublico(CurricPubDTO curricPubDTO, String usuario) {
        boolean cambios = false;
        TdEmpleado empleado = super.persistence().get(TdEmpleadoDAO.class).getById(curricPubDTO.getRfcEmpleado());
        TdCurriculoCur cursos = super.persistence().get(TdCurriculoCurDAO.class).getById(curricPubDTO.getRfcEmpleado());
        TdCurriculoEsc escolaridad = super.persistence().get(TdCurriculoEscDAO.class).getById(curricPubDTO.getRfcEmpleado());
        TdCurriculoExpl experiencia = super.persistence().get(TdCurriculoExplDAO.class).getById(curricPubDTO.getRfcEmpleado());
                
        cursos = cursos != null ? cursos : new TdCurriculoCur();         
        escolaridad = escolaridad != null ? escolaridad : new TdCurriculoEsc();        
        experiencia = experiencia != null ?  experiencia : new TdCurriculoExpl();

        escolaridad.setCurriceRfc(curricPubDTO.getRfcEmpleado());
        escolaridad.setUsuario(usuario);
        escolaridad.setFecModifico(new Date());
        cursos.setCurriccRfc(curricPubDTO.getRfcEmpleado());
        cursos.setUsuario(usuario);
        cursos.setFecModifico(new Date());
        experiencia.setCurriclRfc(curricPubDTO.getRfcEmpleado());
        experiencia.setUsuario(usuario);
        experiencia.setFecModifico(new Date());
        
/*        escolaridad.setCurriceEscolaridad( curricPubDTO.getEscolaridad() );
        escolaridad.setCurriceInstEduc( curricPubDTO.getInstEduc() );
        escolaridad.setCurriceGradoAvance( curricPubDTO.getGradoAvancee() );
        escolaridad.setCurriceDocto( curricPubDTO.getDoctoEsc() );

        cursos.setCurriccCurso1( curricPubDTO.getCurso1() );
        cursos.setCurriccInstituto1( curricPubDTO.getInstituto1() );
        cursos.setCurriccDuracion1( curricPubDTO.getDuracion1() );
        cursos.setCurriccGradoa1( curricPubDTO.getGradoAvancec1() );
        cursos.setCurriccDocto2( curricPubDTO.getDoctoCur2() );
        cursos.setCurriccCurso2( curricPubDTO.getCurso2() );
        cursos.setCurriccInstituto2( curricPubDTO.getInstituto2() );
        cursos.setCurriccDuracion2( curricPubDTO.getDuracion2() );
        cursos.setCurriccGradoa2( curricPubDTO.getGradoAvancec2() );
        cursos.setCurriccDocto2( curricPubDTO.getDoctoCur2() );
        cursos.setCurriccCurso3( curricPubDTO.getCurso3() );
        cursos.setCurriccInstituto3( curricPubDTO.getInstituto3() );
        cursos.setCurriccDuracion3( curricPubDTO.getDuracion3() );
        cursos.setCurriccGradoa3( curricPubDTO.getGradoAvancec3() );
        cursos.setCurriccDocto3( curricPubDTO.getDoctoCur3() );

        experiencia.setCurriclSector1( curricPubDTO.getSector1() );
        experiencia.setCurriclLugar1( curricPubDTO.getLugar1() );
        experiencia.setCurriclArea1( curricPubDTO.getArea1() );
        experiencia.setCurriclPuesto1( curricPubDTO.getPuesto1() );
        experiencia.setCurriclFuncion1( curricPubDTO.getFuncion1()  );
        experiencia.setCurriclFecIni1( curricPubDTO.getFecIni1() );
        experiencia.setCurriclFecFin1( curricPubDTO.getFecFin1() );
        experiencia.setCurriclSector2( curricPubDTO.getSector2() );
        experiencia.setCurriclLugar2( curricPubDTO.getLugar2() );
        experiencia.setCurriclArea2( curricPubDTO.getArea2() );
        experiencia.setCurriclPuesto2( curricPubDTO.getPuesto2() );
        experiencia.setCurriclFuncion2( curricPubDTO.getFuncion2()  );
        experiencia.setCurriclFecIni2( curricPubDTO.getFecIni2() );
        experiencia.setCurriclFecFin2( curricPubDTO.getFecFin2() );
        experiencia.setCurriclSector3( curricPubDTO.getSector3() );
        experiencia.setCurriclLugar3( curricPubDTO.getLugar3() );
        experiencia.setCurriclArea3( curricPubDTO.getArea3() );
        experiencia.setCurriclPuesto3( curricPubDTO.getPuesto3() );
        experiencia.setCurriclFuncion3( curricPubDTO.getFuncion3()  );
        experiencia.setCurriclFecIni3( curricPubDTO.getFecIni3() );
        experiencia.setCurriclFecFin3( curricPubDTO.getFecFin3() );
*/      
        escolaridad.setCurriceEscolaridad( escolaridad.getCurriceEscolaridad() == null ? "" : escolaridad.getCurriceEscolaridad() );
        escolaridad.setCurriceInstEduc( escolaridad.getCurriceInstEduc() == null ? "" : escolaridad.getCurriceInstEduc() );
        escolaridad.setCurriceGradoAvance( escolaridad.getCurriceGradoAvance() == null ? "" : escolaridad.getCurriceGradoAvance() );
        escolaridad.setCurriceDocto( escolaridad.getCurriceDocto() == null ? "" : escolaridad.getCurriceDocto() );
        escolaridad.setCurriceCarrera( escolaridad.getCurriceCarrera() == null ? "" : escolaridad.getCurriceCarrera() );
                
        cursos.setCurriccCurso1( cursos.getCurriccCurso1() == null ? "" : cursos.getCurriccCurso1() );
        cursos.setCurriccInstituto1( cursos.getCurriccInstituto1() == null ? "" : cursos.getCurriccInstituto1() );
        cursos.setCurriccDuracion1( cursos.getCurriccDuracion1() == null ? "" : cursos.getCurriccDuracion1() );
        cursos.setCurriccGradoa1( cursos.getCurriccGradoa1() == null ? "" : cursos.getCurriccGradoa1() );
        cursos.setCurriccDocto1( cursos.getCurriccDocto1() == null ? "" : cursos.getCurriccDocto1() );
        cursos.setCurriccCurso2( cursos.getCurriccCurso2() == null ? "" : cursos.getCurriccCurso2() );
        cursos.setCurriccInstituto2( cursos.getCurriccInstituto2() == null ? "" : cursos.getCurriccInstituto2() );
        cursos.setCurriccDuracion2( cursos.getCurriccDuracion2() == null ? "" : cursos.getCurriccDuracion2() );
        cursos.setCurriccGradoa2( cursos.getCurriccGradoa2() == null ? "" : cursos.getCurriccGradoa2() );
        cursos.setCurriccDocto2( cursos.getCurriccDocto2() == null ? "" : cursos.getCurriccDocto2() );
        cursos.setCurriccCurso3( cursos.getCurriccCurso3() == null ? "" : cursos.getCurriccCurso3() );
        cursos.setCurriccInstituto3( cursos.getCurriccInstituto3() == null ? "" : cursos.getCurriccInstituto3() );
        cursos.setCurriccDuracion3( cursos.getCurriccDuracion3() == null ? "" : cursos.getCurriccDuracion3() );
        cursos.setCurriccGradoa3( cursos.getCurriccGradoa3() == null ? "" : cursos.getCurriccGradoa3() );
        cursos.setCurriccDocto3( cursos.getCurriccDocto3() == null ? "" : cursos.getCurriccDocto3() );

        experiencia.setCurriclSector1( experiencia.getCurriclSector1() == null ? "" : experiencia.getCurriclSector1() );
        experiencia.setCurriclLugar1( experiencia.getCurriclLugar1() == null ? "" : experiencia.getCurriclLugar1() );
        experiencia.setCurriclArea1( experiencia.getCurriclArea1() == null ? "" : experiencia.getCurriclArea1() );
        experiencia.setCurriclPuesto1( experiencia.getCurriclPuesto1() == null ? "" : experiencia.getCurriclPuesto1() );
        experiencia.setCurriclFuncion1( experiencia.getCurriclFuncion1() == null ? "" : experiencia.getCurriclFuncion1() );
        experiencia.setCurriclFecIni1( experiencia.getCurriclFecIni1() == null ? "" : experiencia.getCurriclFecIni1() );
        experiencia.setCurriclFecFin1( experiencia.getCurriclFecFin1() == null ? "" : experiencia.getCurriclFecFin1() );
        experiencia.setCurriclSector2( experiencia.getCurriclSector2() == null ? "" : experiencia.getCurriclSector2() );
        experiencia.setCurriclLugar2( experiencia.getCurriclLugar2() == null ? "" : experiencia.getCurriclLugar2() );
        experiencia.setCurriclArea2( experiencia.getCurriclArea2() == null ? "" : experiencia.getCurriclArea2() );
        experiencia.setCurriclPuesto2( experiencia.getCurriclPuesto2() == null ? "" : experiencia.getCurriclPuesto2() );
        experiencia.setCurriclFuncion2( experiencia.getCurriclFuncion2() == null ? "" : experiencia.getCurriclFuncion2() );
        experiencia.setCurriclFecIni2( experiencia.getCurriclFecIni2() == null ? "" : experiencia.getCurriclFecIni2() );
        experiencia.setCurriclFecFin2( experiencia.getCurriclFecFin2() == null ? "" : experiencia.getCurriclFecFin2() );
        experiencia.setCurriclSector3( experiencia.getCurriclSector3() == null ? "" : experiencia.getCurriclSector3() );
        experiencia.setCurriclLugar3( experiencia.getCurriclLugar3() == null ? "" : experiencia.getCurriclLugar3() );
        experiencia.setCurriclArea3( experiencia.getCurriclArea3() == null ? "" : experiencia.getCurriclArea3() );
        experiencia.setCurriclPuesto3( experiencia.getCurriclPuesto3() == null ? "" : experiencia.getCurriclPuesto3() );
        experiencia.setCurriclFuncion3( experiencia.getCurriclFuncion3() == null ? "" : experiencia.getCurriclFuncion3() );
        experiencia.setCurriclFecIni3( experiencia.getCurriclFecIni3() == null ? "" : experiencia.getCurriclFecIni3() );
        experiencia.setCurriclFecFin3( experiencia.getCurriclFecFin3() == null ? "" : experiencia.getCurriclFecFin3() );
        
        if ((escolaridad.getCurriceEscolaridad() == null && curricPubDTO.getEscolaridad() != null) || !escolaridad.getCurriceEscolaridad().equals(curricPubDTO.getEscolaridad())) {
            escolaridad.setCurriceEscolaridad(curricPubDTO.getEscolaridad());
            cambios = true;
        }
        if ((escolaridad.getCurriceInstEduc() == null && curricPubDTO.getInstEduc() != null) || !escolaridad.getCurriceInstEduc().equals(curricPubDTO.getInstEduc())) {
            escolaridad.setCurriceInstEduc(curricPubDTO.getInstEduc());
            cambios = true;
        }
        if ((escolaridad.getCurriceGradoAvance() == null && curricPubDTO.getGradoAvancee() != null) || !escolaridad.getCurriceGradoAvance().equals(curricPubDTO.getGradoAvancee())) {
            escolaridad.setCurriceGradoAvance(curricPubDTO.getGradoAvancee());
            cambios = true;
        }
        if ((escolaridad.getCurriceDocto() == null && curricPubDTO.getDoctoEsc() != null) || !escolaridad.getCurriceDocto().equals(curricPubDTO.getDoctoEsc())) {
            escolaridad.setCurriceDocto(curricPubDTO.getDoctoEsc());
            cambios = true;
        }
        if ((escolaridad.getCurriceCarrera() == null && curricPubDTO.getCarrera() != null) || !escolaridad.getCurriceCarrera().equals(curricPubDTO.getCarrera())) {
            escolaridad.setCurriceCarrera(curricPubDTO.getCarrera());
            cambios = true;
        }

        if ((cursos.getCurriccCurso1() == null && curricPubDTO.getCurso1() != null) || !cursos.getCurriccCurso1().equals(curricPubDTO.getCurso1())) {
            cursos.setCurriccCurso1(curricPubDTO.getCurso1());
            cambios = true;
        }
        if ((cursos.getCurriccInstituto1() == null && curricPubDTO.getInstituto1() != null) || !cursos.getCurriccInstituto1().equals(curricPubDTO.getInstituto1())) {
            cursos.setCurriccInstituto1(curricPubDTO.getInstituto1());
            cambios = true;
        }
        if ((cursos.getCurriccDuracion1() == null && curricPubDTO.getDuracion1() != null) || !cursos.getCurriccDuracion1().equals(curricPubDTO.getDuracion1())) {
            cursos.setCurriccDuracion1(curricPubDTO.getDuracion1());
            cambios = true;
        }
        if ((cursos.getCurriccGradoa1() == null && curricPubDTO.getGradoAvancec1() != null) || !cursos.getCurriccGradoa1().equals(curricPubDTO.getGradoAvancec1())) {
            cursos.setCurriccGradoa1(curricPubDTO.getGradoAvancec1());
            cambios = true;
        }
        if ((cursos.getCurriccDocto1() == null && curricPubDTO.getDoctoCur1() != null) || !cursos.getCurriccDocto1().equals(curricPubDTO.getDoctoCur1())) {
            cursos.setCurriccDocto1(curricPubDTO.getDoctoCur1());
            cambios = true;
        }
        if ((cursos.getCurriccCurso2() == null && curricPubDTO.getCurso2() != null) || !cursos.getCurriccCurso2().equals(curricPubDTO.getCurso2())) {
            cursos.setCurriccCurso2(curricPubDTO.getCurso2());
            cambios = true;
        }
        if ((cursos.getCurriccInstituto2() == null && curricPubDTO.getInstituto2() != null) || !cursos.getCurriccInstituto2().equals(curricPubDTO.getInstituto2())) {
            cursos.setCurriccInstituto2(curricPubDTO.getInstituto2());
            cambios = true;
        }
        if ((cursos.getCurriccDuracion2() == null && curricPubDTO.getDuracion2() != null) || !cursos.getCurriccDuracion2().equals(curricPubDTO.getDuracion2())) {
            cursos.setCurriccDuracion2(curricPubDTO.getDuracion2());
            cambios = true;
        }
        if ((cursos.getCurriccGradoa2() == null && curricPubDTO.getGradoAvancec2() != null) || !cursos.getCurriccGradoa2().equals(curricPubDTO.getGradoAvancec2())) {
            cursos.setCurriccGradoa2(curricPubDTO.getGradoAvancec2());
            cambios = true;
        }
        if ((cursos.getCurriccDocto2() == null && curricPubDTO.getDoctoCur2() != null) || !cursos.getCurriccDocto2().equals(curricPubDTO.getDoctoCur2())) {
            cursos.setCurriccDocto2(curricPubDTO.getDoctoCur2());
            cambios = true;
        }
        if ((cursos.getCurriccCurso3() == null && curricPubDTO.getCurso3() != null) || !cursos.getCurriccCurso3().equals(curricPubDTO.getCurso3())) {
            cursos.setCurriccCurso3(curricPubDTO.getCurso3());
            cambios = true;
        }
        if ((cursos.getCurriccInstituto3() == null && curricPubDTO.getInstituto3() != null) || !cursos.getCurriccInstituto3().equals(curricPubDTO.getInstituto3())) {
            cursos.setCurriccInstituto3(curricPubDTO.getInstituto3());
            cambios = true;
        }
        if ((cursos.getCurriccDuracion3() == null && curricPubDTO.getDuracion3() != null) || !cursos.getCurriccDuracion3().equals(curricPubDTO.getDuracion3())) {
            cursos.setCurriccDuracion3(curricPubDTO.getDuracion3());
            cambios = true;
        }
        if ((cursos.getCurriccGradoa3() == null && curricPubDTO.getGradoAvancec3() != null) || !cursos.getCurriccGradoa3().equals(curricPubDTO.getGradoAvancec3())) {
            cursos.setCurriccGradoa3(curricPubDTO.getGradoAvancec3());
            cambios = true;
        }
        if ((cursos.getCurriccDocto3() == null && curricPubDTO.getDoctoCur3() != null) || !cursos.getCurriccDocto3().equals(curricPubDTO.getDoctoCur3())) {
            cursos.setCurriccDocto3(curricPubDTO.getDoctoCur3());
            cambios = true;
        }
        
        if ((experiencia.getCurriclSector1() == null && curricPubDTO.getSector1() != null) || !experiencia.getCurriclSector1().equals(curricPubDTO.getSector1())) {
            experiencia.setCurriclSector1(curricPubDTO.getSector1());
            cambios = true;
        }
        if ((experiencia.getCurriclLugar1() == null && curricPubDTO.getLugar1() != null) || !experiencia.getCurriclLugar1().equals(curricPubDTO.getLugar1())) {
            experiencia.setCurriclLugar1(curricPubDTO.getLugar1());
            cambios = true;
        }
        if ((experiencia.getCurriclArea1() == null && curricPubDTO.getArea1() != null) || !experiencia.getCurriclArea1().equals(curricPubDTO.getArea1())) {
            experiencia.setCurriclArea1(curricPubDTO.getArea1());
            cambios = true;
        }
        if ((experiencia.getCurriclPuesto1() == null && curricPubDTO.getPuesto1() != null) || !experiencia.getCurriclPuesto1().equals(curricPubDTO.getPuesto1())) {
            experiencia.setCurriclPuesto1(curricPubDTO.getPuesto1());
            cambios = true;
        }
        if ((experiencia.getCurriclFuncion1() == null && curricPubDTO.getFuncion1() != null) || !experiencia.getCurriclFuncion1().equals(curricPubDTO.getFuncion1())) {
            experiencia.setCurriclFuncion1(curricPubDTO.getFuncion1());
            cambios = true;
        }
        //experiencia.setCurriclFecIni1(curricPubDTO.getFecIni1());
        //experiencia.setCurriclFecFin1(curricPubDTO.getFecFin1());
        if ((experiencia.getCurriclFecIni1() == null && curricPubDTO.getFecIni1() != null) || !experiencia.getCurriclFecIni1().equals(curricPubDTO.getFecIni1())) {
            experiencia.setCurriclFecIni1(curricPubDTO.getFecIni1());
            cambios = true;
        }
        if ((experiencia.getCurriclFecFin1() == null && curricPubDTO.getFecFin1() != null) || !experiencia.getCurriclFecFin1().equals(curricPubDTO.getFecFin1())) {
            experiencia.setCurriclFecFin1(curricPubDTO.getFecFin1());
            cambios = true;
        }
        if ((experiencia.getCurriclSector2() == null && curricPubDTO.getSector2() != null) || !experiencia.getCurriclSector2().equals(curricPubDTO.getSector2())) {
            experiencia.setCurriclSector2(curricPubDTO.getSector2());
            cambios = true;
        }
        if ((experiencia.getCurriclLugar2() == null && curricPubDTO.getLugar2() != null) || !experiencia.getCurriclLugar2().equals(curricPubDTO.getLugar2())) {
            experiencia.setCurriclLugar2(curricPubDTO.getLugar2());
            cambios = true;
        }
        if ((experiencia.getCurriclArea2() == null && curricPubDTO.getArea2() != null) || !experiencia.getCurriclArea2().equals(curricPubDTO.getArea2())) {
            experiencia.setCurriclArea2(curricPubDTO.getArea2());
            cambios = true;
        }
        if ((experiencia.getCurriclPuesto2() == null && curricPubDTO.getPuesto2() != null) || !experiencia.getCurriclPuesto2().equals(curricPubDTO.getPuesto2())) {
            experiencia.setCurriclPuesto2(curricPubDTO.getPuesto2());
            cambios = true;
        }
        if ((experiencia.getCurriclFuncion2() == null && curricPubDTO.getFuncion2() != null) || !experiencia.getCurriclFuncion2().equals(curricPubDTO.getFuncion2())) {
            experiencia.setCurriclFuncion2(curricPubDTO.getFuncion2());
            cambios = true;
        }
//        experiencia.setCurriclFecIni2(curricPubDTO.getFecIni2());
//        experiencia.setCurriclFecFin2(curricPubDTO.getFecFin2());
        if ((experiencia.getCurriclFecIni2() == null && curricPubDTO.getFecIni2() != null) || !experiencia.getCurriclFecIni2().equals(curricPubDTO.getFecIni2())) {
            experiencia.setCurriclFecIni2(curricPubDTO.getFecIni2());
            cambios = true;
        }
        if ((experiencia.getCurriclFecFin2() == null && curricPubDTO.getFecFin2() != null) || !experiencia.getCurriclFecFin2().equals(curricPubDTO.getFecFin2())) {
            experiencia.setCurriclFecFin2(curricPubDTO.getFecFin2());
            cambios = true;
        }
        if ((experiencia.getCurriclSector3() == null && curricPubDTO.getSector3() != null) || !experiencia.getCurriclSector3().equals(curricPubDTO.getSector3())) {
            experiencia.setCurriclSector3(curricPubDTO.getSector3());
            cambios = true;
        }
        if ((experiencia.getCurriclLugar3() == null && curricPubDTO.getLugar3() != null) || !experiencia.getCurriclLugar3().equals(curricPubDTO.getLugar3())) {
            experiencia.setCurriclLugar3(curricPubDTO.getLugar3());
            cambios = true;
        }
        if ((experiencia.getCurriclArea3() == null && curricPubDTO.getArea3() != null) || !experiencia.getCurriclArea3().equals(curricPubDTO.getArea3())) {
            experiencia.setCurriclArea3(curricPubDTO.getArea3());
            cambios = true;
        }
        if ((experiencia.getCurriclPuesto3() == null && curricPubDTO.getPuesto3() != null) || !experiencia.getCurriclPuesto3().equals(curricPubDTO.getPuesto3())) {
            experiencia.setCurriclPuesto3(curricPubDTO.getPuesto3());
            cambios = true;
        }
        if ((experiencia.getCurriclFuncion3() == null && curricPubDTO.getFuncion3() != null) || !experiencia.getCurriclFuncion3().equals(curricPubDTO.getFuncion3())) {
            experiencia.setCurriclFuncion3(curricPubDTO.getFuncion3());
            cambios = true;
        }
//        experiencia.setCurriclFecIni3(curricPubDTO.getFecIni3());
//        experiencia.setCurriclFecFin3(curricPubDTO.getFecFin3());
        if ((experiencia.getCurriclFecIni3() == null && curricPubDTO.getFecIni3() != null) || !experiencia.getCurriclFecIni3().equals(curricPubDTO.getFecIni3())) {
            experiencia.setCurriclFecIni3(curricPubDTO.getFecIni3());
            cambios = true;
        }
        if ((experiencia.getCurriclFecFin3() == null && curricPubDTO.getFecFin3() != null) || !experiencia.getCurriclFecFin3().equals(curricPubDTO.getFecFin3())) {
            experiencia.setCurriclFecFin3(curricPubDTO.getFecFin3());
            cambios = true;
        }

        if (cambios) {
            super.persistence().get(TdCurriculoEscDAO.class).save(escolaridad);
            super.persistence().get(TdCurriculoCurDAO.class).save(cursos);
            super.persistence().get(TdCurriculoExplDAO.class).save(experiencia);
        }
        
    }

}
