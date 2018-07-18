package gob.shcp.sireh.control.expediente;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import gob.shcp.fsn.control.AbstractController;
import gob.shcp.fsn.control.support.AnnotatedController;
import gob.shcp.jcr.node.FsnResource;
import gob.shcp.sireh.comprobante.init.ProductReport;
import gob.shcp.sireh.model.CustomTdExpCapacitacionDTO;
import gob.shcp.sireh.model.CustomTdExpDoctosSinDatosDTO;
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
import gob.shcp.sireh.model.expediente.MuestraFirmaElectronicaDTO;
import gob.shcp.sireh.model.nomina.ConsultaEmpleadoDTO;

import gob.shcp.sireh.model.nomina.terceros.timbradosat.TnComprobanteDTO;
import gob.shcp.sireh.service.expediente.ExpedienteService;
import gob.shcp.sireh.service.expediente.TestJcrService;
import gob.shcp.sireh.service.nomina.movimientos.CambioNominaService;
import gob.shcp.sireh.service.spc.capcer.registro.RegistroCursoSPCService;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

import java.sql.Connection;
import java.sql.SQLException;

import java.text.SimpleDateFormat;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import javax.xml.bind.JAXBException;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperRunManager;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


/**
 * Controlador encargado de atender solicitudes del expediente de personal 
 */
@Controller
public class ExpedienteController extends AbstractController implements AnnotatedController {

    private static final String RFC_PATRON = "SHC850101U37";
    
    // Jasper Historico de pagos
    private static final String JASPER_HISTORICO_PAGOS = "comprobantePagoPersonal.jasper";
    
    /**
     * Metodo encargado de buscar  Empleados para consulta general de empleados en activo
     * @author Roberto Muñoz.
     * @param model Model
     * @param consultaEmpleadoDTO ConsultaEmpleadoDTO
     */
    @RequestMapping
    public String consultaBusca(Model model, ConsultaEmpleadoDTO consultaEmpleadoDTO) {
        if (consultaEmpleadoDTO.isCancel()) {
            consultaEmpleadoDTO = new ConsultaEmpleadoDTO();
        }
        consultaEmpleadoDTO.setUrlController("expediente");
        consultaEmpleadoDTO.setUrlOrigen("consultaBusca");
        consultaEmpleadoDTO.setUrlDestino("consultaGeneral");
        consultaEmpleadoDTO.setNombrePantalla("consultaGeneral");

        model.addAttribute(consultaEmpleadoDTO);
        return super.getViewName("consultarEmpleados");
    }

    /**
     * Metodo encargado de consultar datos laborales de personal en activo.
     * @author Roberto Muñoz.
     * @param model Model
     * @param expedienteDTO ExpedientePersonalDTO
     * @return String
     */
    @RequestMapping
    public String consultaGeneral(Model model, ExpedienteDTO expedienteDTO) throws IOException, JsonGenerationException, JsonMappingException {
        if (expedienteDTO.isCancel()) {
            expedienteDTO = new ExpedienteDTO();
        }
        expedienteDTO = super.getService(ExpedienteService.class).getExpediente(expedienteDTO.getRfcEmpleado());
        expedienteDTO.setUrlOrigen("consultaBusca");
        expedienteDTO.setUrlDestino("consultaGeneral");

        // Colores y marco
        expedienteDTO.setColormarco("silver");
        expedienteDTO.setGruesolinea("1px");
        expedienteDTO.setGruesoletra("1.2em");

        // Obtener Ciclo
        expedienteDTO.setUniCiclo(super.security().getOperationYear());

        // Experiencia Laboral JSON
        expedienteDTO.setJsonEL(generateJSONStringEL(expedienteDTO.getListaExperienciaLaboralDTO()));
        expedienteDTO.setLocel(expedienteDTO.getListaExperienciaLaboralDTO().size());
        if (expedienteDTO.getLocel() > 6) {
            expedienteDTO.setDesel(7);
        } else {
            expedienteDTO.setDesel(expedienteDTO.getLocel());
        }

        if (expedienteDTO.getLocel() > 1) {
            expedienteDTO.setVenel(((expedienteDTO.getDesel()) * 23.2));
        } else {
            expedienteDTO.setVenel(150.0);
        }

        // Trayectoria Laboral JSON
        expedienteDTO.setJsonTL(generateJSONStringTL(expedienteDTO.getListaMovimientosEmpleadoDTO()));
        expedienteDTO.setLoctl(expedienteDTO.getListaMovimientosEmpleadoDTO().size());
        if (expedienteDTO.getLoctl() > 6) {
            expedienteDTO.setDestl(7);
        } else {
            expedienteDTO.setDestl(expedienteDTO.getLoctl());
        }

        if (expedienteDTO.getLoctl() > 1) {
            expedienteDTO.setVentl(((expedienteDTO.getDestl()) * 23.2));
        } else {
            expedienteDTO.setVentl(150.0);
        }

        model.addAttribute(expedienteDTO);
        return super.getViewName("consultaGeneral");
    }

    /**
     * Metodo encargado de buscar  Empleados para consulta de expediente.
     * @author Roberto Muñoz.
     * @param model Model
     * @param consultaEmpleadoDTO ConsultaEmpleadoDTO
     */
    @RequestMapping
    public String expedienteBusca(Model model, ConsultaEmpleadoDTO consultaEmpleadoDTO) {
        if (consultaEmpleadoDTO.isCancel()) {
            consultaEmpleadoDTO = new ConsultaEmpleadoDTO();
        }
        consultaEmpleadoDTO.setUrlController("expediente");
        consultaEmpleadoDTO.setUrlOrigen("expedienteBusca");
        consultaEmpleadoDTO.setUrlDestino("expediente");
        consultaEmpleadoDTO.setNombrePantalla("expediente");

        model.addAttribute(consultaEmpleadoDTO);
        return super.getViewName("consultaEmpleados");
    }

    /**
     * Metodo encargado de consultar expediente personal.
     * @author Roberto Muñoz.
     * @param model Model
     * @param expedienteDTO ExpedientePersonalDTO
     * @return String
     */
    @RequestMapping
    public String expediente(Model model, ExpedienteDTO expedienteDTO) throws IOException, JsonGenerationException, JsonMappingException {
        if (expedienteDTO.isCancel()) {
            expedienteDTO = new ExpedienteDTO();
        }
        expedienteDTO = super.getService(ExpedienteService.class).getExpediente(expedienteDTO.getRfcEmpleado());
        expedienteDTO.setUrlOrigen("expedienteBusca");
        expedienteDTO.setUrlDestino("expediente");

        // Colores y marco
        expedienteDTO.setColormarco("silver");
        expedienteDTO.setGruesolinea("1px");
        expedienteDTO.setGruesoletra("1.2em");

        // Obtener Ciclo
        expedienteDTO.setUniCiclo(super.security().getOperationYear());

        // Dependientes Economicos JSON
        expedienteDTO.setJsonDependientes(generateJSONString(expedienteDTO.getListaDependientesDTO()));
        expedienteDTO.setLocdep(expedienteDTO.getListaDependientesDTO().size());
        if (expedienteDTO.getLocdep() > 6) {
            expedienteDTO.setDesdep(7);
        } else {
            expedienteDTO.setDesdep(expedienteDTO.getLocdep());
        }
        if (expedienteDTO.getLocdep() > 1) {
            expedienteDTO.setVendep(((expedienteDTO.getDesdep()) * 23.2));
        } else {
            expedienteDTO.setVendep(150.0);
        }
        
        // Antecedentes Academicos JSON
        expedienteDTO.setJsonAntAcademicos(generateJSONStringAnAc(expedienteDTO.getListaAntAcademicosDTO()));
        expedienteDTO.setLocAnAc(expedienteDTO.getListaAntAcademicosDTO().size());
        if(expedienteDTO.getLocAnAc() > 6){
            expedienteDTO.setDescAnAc(7);
        } else {
            expedienteDTO.setDescAnAc(expedienteDTO.getLocAnAc());
        }
        if(expedienteDTO.getLocAnAc() > 1){
            expedienteDTO.setVenAnAc(((expedienteDTO.getDescAnAc()) * 25.5));
        } else {
            expedienteDTO.setVenAnAc(150.0);
        }

        // Experiencia Laboral JSON
        expedienteDTO.setJsonEL(generateJSONStringEL(expedienteDTO.getListaExperienciaLaboralDTO()));
        expedienteDTO.setLocel(expedienteDTO.getListaExperienciaLaboralDTO().size());
        if (expedienteDTO.getLocel() > 6) {
            expedienteDTO.setDesel(7);
        } else {
            expedienteDTO.setDesel(expedienteDTO.getLocel());
        }
        if (expedienteDTO.getLocel() > 1) {
            expedienteDTO.setVenel(((expedienteDTO.getDesel()) * 25.5));
        } else {
            expedienteDTO.setVenel(150.0);
        }
        
        // Cursos
        // http://stackoverflow.com/questions/5361971/replace-all-double-quotes-within-string
        expedienteDTO.setJsonCursos(generateJSONStringCursos(expedienteDTO.getListaCursosDTO()));
        expedienteDTO.setLocCursos(expedienteDTO.getListaCursosDTO().size());
        if(expedienteDTO.getLocCursos() > 6){
            expedienteDTO.setDesCursos(7);
        } else {
            expedienteDTO.setDesCursos(expedienteDTO.getLocCursos());
        }
        if(expedienteDTO.getLocCursos() > 1){
            expedienteDTO.setVenCursos(((expedienteDTO.getDesCursos()) * 25.5));
        } else {
            expedienteDTO.setVenCursos(150.0);
        }
        
        // Servico Profesional de Carrera (SPC)
        expedienteDTO.setJsonSPC(generateJSONStringSPC(expedienteDTO.getListaSPCDTO()));
        expedienteDTO.setLocSPC(expedienteDTO.getListaSPCDTO().size());
        if(expedienteDTO.getLocSPC() > 6){
            expedienteDTO.setDesSPC(7);
        } else {
            expedienteDTO.setDesSPC(expedienteDTO.getLocSPC());
        }
        if(expedienteDTO.getLocSPC() > 1){
            expedienteDTO.setVenSPC(((expedienteDTO.getDesSPC()) * 25.5));
        } else {
            expedienteDTO.setVenSPC(150.0);
        }
        
        // Conceptos de nomina adicionales JSON
        expedienteDTO.setJsonCA(generateJSONStringCA(expedienteDTO.getListaConceptosAdicionalesDTO()));
        expedienteDTO.setLocca(expedienteDTO.getListaConceptosAdicionalesDTO().size());
        if (expedienteDTO.getLocca() > 6) {
            expedienteDTO.setDesca(7);
        } else {
            expedienteDTO.setDesca(expedienteDTO.getLocca());
        }
        if (expedienteDTO.getLocca() > 1) {
            expedienteDTO.setVenca(((expedienteDTO.getDesca()) * 30.5));
        } else {
            expedienteDTO.setVenca(150.0);
        }

        // Conceptos de nomina adicionales Historicos JSON
        expedienteDTO.setJsonCAH(generateJSONStringCAH(expedienteDTO.getListaConceptosAdicionalesDTO()));
        expedienteDTO.setLoccah(expedienteDTO.getListaConceptosAdicionalesDTO().size());
        if (expedienteDTO.getLoccah() > 6) {
            expedienteDTO.setDescah(7);
        } else {
            expedienteDTO.setDescah(expedienteDTO.getLoccah());
        }
        if (expedienteDTO.getLoccah() > 1) {
            expedienteDTO.setVencah(((expedienteDTO.getDescah()) * 23.2));
        } else {
            expedienteDTO.setVencah(150.0);
        }

        // Trayectoria Laboral JSON
        expedienteDTO.setJsonTL(generateJSONStringTL(expedienteDTO.getListaMovimientosEmpleadoDTO()));
        expedienteDTO.setLoctl(expedienteDTO.getListaMovimientosEmpleadoDTO().size());
        if (expedienteDTO.getLoctl() > 6) {
            expedienteDTO.setDestl(7);
        } else {
            expedienteDTO.setDestl(expedienteDTO.getLoctl());
        }
        if (expedienteDTO.getLoctl() > 1) {
            expedienteDTO.setVentl(((expedienteDTO.getDestl()) * 23.2));
        } else {
            expedienteDTO.setVentl(150.0);
        }

        // Pagos de Nómina JSON
        expedienteDTO.setJsonPN(generateJSONStringPN(expedienteDTO.getListaHistoricoPagoDTO()));
        expedienteDTO.setLocpn(expedienteDTO.getListaHistoricoPagoDTO().size());
        if (expedienteDTO.getLocpn() > 6) {
            expedienteDTO.setDespn(7);
        } else {
            expedienteDTO.setDespn(expedienteDTO.getLocpn());
        }
        if (expedienteDTO.getLocpn() > 1) {
            expedienteDTO.setVenpn(((expedienteDTO.getDespn()) * 23.2));
        } else {
            expedienteDTO.setVenpn(150.0);
        }

        // Incidencias de personal JSON
        expedienteDTO.setJsonIP(generateJSONStringIP(expedienteDTO.getListaIncidenciasDTO()));
        expedienteDTO.setLocip(expedienteDTO.getListaIncidenciasDTO().size());
        if (expedienteDTO.getLocip() > 6) {
            expedienteDTO.setDesip(7);
        } else {
            expedienteDTO.setDesip(expedienteDTO.getLocip());
        }
        if (expedienteDTO.getLocip() > 1) {
            expedienteDTO.setVenip(((expedienteDTO.getDesip()) * 23.2));
        } else {
            expedienteDTO.setVenip(150.0);
        }

        // TODO: Timbrado - Comprobantes
        expedienteDTO.setJsonTimbrado(generateJSONStringTimbrado(expedienteDTO.getListaComprobanteDTO()));
        expedienteDTO.setLocTimbrado(expedienteDTO.getListaComprobanteDTO().size());
        if (expedienteDTO.getLocTimbrado() > 6) {
            expedienteDTO.setDesTimbrado(7);
        } else {
            expedienteDTO.setDesTimbrado(expedienteDTO.getLocTimbrado());
        }
        if (expedienteDTO.getLocTimbrado() > 1) {
            expedienteDTO.setVenTimbrado(((expedienteDTO.getDesTimbrado()) * 23.2));
        } else {
            expedienteDTO.setVenTimbrado(150.0);
        }
        
        // Datos del usuario
        String userName = super.security().getUserName();
        //logger.debug("--------------------> userName -> " + userName);
        String userRfc = super.identity().get(userName).getRfc().toUpperCase();
        // TODO: Solo para pruebas
        //userRfc = "QUMC710207RM7";
        logger.debug("--------------------> userRfc -> " + userRfc);
        
        // Validacion con firma electronica
        logger.debug("--------------------> PKI_VALID_RFC: " + super.configuration().getString("PKI_VALID_RFC"));
        boolean validRfc = new Boolean(super.configuration().getString("PKI_VALID_RFC"));
        logger.debug("--------------------> validRfc: " + validRfc);
        
        if (validRfc) {
            // Valida si el RFC solicitado es igual al RFC del usuario firmado en sesion
            if (userRfc.equals(expedienteDTO.getRfcEmpleado())) {
                expedienteDTO.setUserComprobante(true);
            } else {
                expedienteDTO.setUserComprobante(false);
            }
        } else {
            // Sin validacion
            expedienteDTO.setUserComprobante(true);
        }
        
        model.addAttribute(expedienteDTO);
        return super.getViewName("expediente");
    }
    
    /**
     * Metodo encargado de obtener el listado de documentos activos con base en el rfc del empleado.
     * @author Oscar S.
     * @param rfcEmpleado String
     * @param tipo String
     * @param response HttpServletResponse
     * @return String
     */
    @RequestMapping
    public void jsonCallbackDocActivos(@RequestParam("rfcEmpleado") String rfcEmpleado, @RequestParam("tipo") String tipo, HttpServletResponse response) throws IOException {
        // Cadena JSON
        List<CustomDoctosExpPersonalDTO> customDoctosExpPersonalDTO = super.getService(ExpedienteService.class).getExpDoctoActivos(rfcEmpleado, tipo);
        logger.debug("jsonCallbackDocActivos ----> customDoctosExpPersonalDTO -------------------> " + customDoctosExpPersonalDTO.size());
        
        String jsonDataString = "";
        if (tipo.equals("FALTANTES_LABORALES")) {
            jsonDataString = generateJSONStringDocFaltantesLaborales(customDoctosExpPersonalDTO);
        } else {
            jsonDataString = generateJSONStringDocActivo(customDoctosExpPersonalDTO);
        } 

        response.setContentType("text/plain");
        PrintWriter out = response.getWriter();

        out.print(jsonDataString);
    }
    
    /**
     * Metodo encargado de obtener el listado de dcoumentos historicos con base en el rfc del empleado y el tipo de documento.
     * @author Oscar S.
     * @param rfcEmpleado String
     * @param idDocto String
     * @param response HttpServletResponse
     * @return String
     */
    @RequestMapping
    public void jsonCallbackDocHistorico(@RequestParam("rfcEmpleado") String rfcEmpleado, @RequestParam("idDocto") String idDocto, HttpServletResponse response) throws IOException {
        // Cadena JSON
        List<CustomDoctosExpPersonalDTO> customDoctosExpPersonalDTO = new ArrayList<CustomDoctosExpPersonalDTO>();
        List<String> DOC_SIN_DATOS = Arrays.asList("SOEMP", "CURRV", "CERME", "IDOFI", "DCLFD", "MBPDV", "CNISF", "CILAB", "SOCEM", "ABMIS", "CIFON", "INSAR", "AHOSO", 
                                                   "CSGMM", "SEGUR", "OFIDO", "CONNO", "ACSPF","PSPAS", "DOSPF", "COSER", "HUSER", "CONES", "ACTAD", "RNOIC", "AEOIC", 
                                                   "ACTAT", "MEDDI", "CONHE", "CAISS", "DEMAN", "LAUEJ", "BECAS", "ACDEF", "OFIRE", "OFISU", "ACUBA", "DMINC", "DESBE", "LICIS");
        
        if (DOC_SIN_DATOS.contains(idDocto) || idDocto.equals("CCTDE") || idDocto.equals("DFDBE") || idDocto.equals("DESBE") || idDocto.equals("COEST") || idDocto.equals("EXPLA") || idDocto.equals("LICIS")) {
            customDoctosExpPersonalDTO = super.getService(ExpedienteService.class).getExpDoctoSubgridActivosRegistrados(rfcEmpleado, idDocto);
        } else {
            customDoctosExpPersonalDTO = super.getService(ExpedienteService.class).getExpDoctoHistoricos(rfcEmpleado, idDocto);
        }
        logger.debug("jsonCallbackDocHistorico ---> customDoctosExpPersonalDTO -------------------> " + customDoctosExpPersonalDTO.size());
        
        String jsonDataString = generateJSONStringDocHistorico(customDoctosExpPersonalDTO);
         
        response.setContentType("text/plain");
        PrintWriter out = response.getWriter();

        out.print(jsonDataString);
    }
    
    /** 
     * Metodo encargado de construir cadenas de tipo json con base en listas de objetos de tipo CustomDoctosExpPersonalDTO.
     * @author Oscar S.
     * @param customDoctosExpPersonalDTO List<CustomDoctosExpPersonalDTO> 
     * @return String
     */
    @SuppressWarnings("unchecked")
    private String generateJSONStringDocActivo(List<CustomDoctosExpPersonalDTO> customDoctosExpPersonalDTO) throws IOException, JsonGenerationException, JsonMappingException {
        ObjectMapper mapper = new ObjectMapper();

        // jsonMapCA Nivel 1
        HashMap<String, Object> jsonMapNivDDEP1 = new HashMap<String, Object>();

        // jsonMapCA Nivel 2
        List jsonMapNivDDEP2 = new ArrayList();
        HashMap<String, Object> idCellJsonMap;

        // jsonMapCA Nivel 3
        HashMap<String, Object> jsonDocAct;

        int counter = 1;

        for (CustomDoctosExpPersonalDTO doctos: customDoctosExpPersonalDTO) {
            String idEstatus = doctos.getIdStatus() == null ? "" : doctos.getIdStatus().toString();
            
            if (idEstatus.equals("SIN") || idEstatus.equals("")) {
            //if (idEstatus.equals("ACT") || idEstatus.equals("SIN") || idEstatus.equals("")) {
                jsonDocAct = new HashMap<String, Object>();
                jsonDocAct.put("num", counter);
                jsonDocAct.put("orden", doctos.getOrdenDocto() != null ? doctos.getOrdenDocto().toString() : "");
                jsonDocAct.put("idDocto", doctos.getIdDocto() != null ? doctos.getIdDocto().toString() : "");
                jsonDocAct.put("descdocto", doctos.getDescDocto() != null ? doctos.getDescDocto().toString() : "");
                jsonDocAct.put("secuencia", doctos.getSecuencia() != null ? doctos.getSecuencia().toString() : "");
                jsonDocAct.put("idstatus", doctos.getIdStatus() != null ? doctos.getIdStatus().toString() : "");
                jsonDocAct.put("descstatus", doctos.getDescStatus() != null ? doctos.getDescStatus().toString() : "");
                jsonDocAct.put("idrechazo", doctos.getIdExpRechazo() != null ? doctos.getIdExpRechazo().toString() : "");
                jsonDocAct.put("descrechazo", doctos.getDescRechazo() != null ? doctos.getDescRechazo().toString() : "");
                jsonDocAct.put("referenciadocto", doctos.getDoctoRef() != null ? doctos.getDoctoRef().toString() : "");
                jsonDocAct.put("requerido", doctos.getRequerido()  != null ? doctos.getRequerido().toString() : "");
    
                // jsonMap Nivel 2
                idCellJsonMap = new HashMap<String, Object>();
                idCellJsonMap.put("id", String.valueOf(counter));
                idCellJsonMap.put("cell", jsonDocAct);
                jsonMapNivDDEP2.add(idCellJsonMap);
                counter++;
            }
        }
        jsonMapNivDDEP1.put("page", "1");
        jsonMapNivDDEP1.put("total", 1);
        jsonMapNivDDEP1.put("records", counter > 0 ? counter - 1 : 0);
        jsonMapNivDDEP1.put("rows", (Object) jsonMapNivDDEP2);

        return mapper.writeValueAsString(jsonMapNivDDEP1);
    }
    
    /** 
     * Faltantes Laborales - Metodo encargado de construir cadenas de tipo json con base en listas de objetos de tipo CustomDoctosExpPersonalDTO.
     * @author Oscar S.
     * @param customDoctosExpPersonalDTO List<CustomDoctosExpPersonalDTO> 
     * @return String
     */
    @SuppressWarnings("unchecked")
    private String generateJSONStringDocFaltantesLaborales(List<CustomDoctosExpPersonalDTO> customDoctosExpPersonalDTO) throws IOException, JsonGenerationException, JsonMappingException {
        ObjectMapper mapper = new ObjectMapper();

        // jsonMapCA Nivel 1
        HashMap<String, Object> jsonMapNivDDEP1 = new HashMap<String, Object>();

        // jsonMapCA Nivel 2
        List jsonMapNivDDEP2 = new ArrayList();
        HashMap<String, Object> idCellJsonMap;

        // jsonMapCA Nivel 3
        HashMap<String, Object> jsonDocFaltantes;

        int counter = 1;

        for (CustomDoctosExpPersonalDTO doctos: customDoctosExpPersonalDTO) {
            String idEstatus = doctos.getIdStatus() == null ? "" : doctos.getIdStatus().toString();
            
            if (idEstatus.equals("ACT") || idEstatus.equals("REC") || idEstatus.equals("SIN") || idEstatus.equals("")) {
                jsonDocFaltantes = new HashMap<String, Object>();
                jsonDocFaltantes.put("num", counter);
                jsonDocFaltantes.put("orden", doctos.getOrdenDocto() != null ? doctos.getOrdenDocto().toString() : "");
                jsonDocFaltantes.put("idDocto", doctos.getIdDocto() != null ? doctos.getIdDocto().toString() : "");
                jsonDocFaltantes.put("descdocto", doctos.getDescDocto() != null ? doctos.getDescDocto().toString() : "");
                jsonDocFaltantes.put("secuencia", doctos.getSecuencia() != null ? doctos.getSecuencia().toString() : "");
                jsonDocFaltantes.put("idstatus", doctos.getIdStatus() != null ? doctos.getIdStatus().toString() : "");
                jsonDocFaltantes.put("descstatus", doctos.getDescStatus() != null ? doctos.getDescStatus().toString() : "");
                jsonDocFaltantes.put("idrechazo", doctos.getIdExpRechazo() != null ? doctos.getIdExpRechazo().toString() : "");
                jsonDocFaltantes.put("descrechazo", doctos.getDescRechazo() != null ? doctos.getDescRechazo().toString() : "");
                jsonDocFaltantes.put("referenciadocto", doctos.getDoctoRef() != null ? doctos.getDoctoRef().toString() : "");
                jsonDocFaltantes.put("requerido", doctos.getRequerido()  != null ? doctos.getRequerido().toString() : "");
    
                // jsonMap Nivel 2
                idCellJsonMap = new HashMap<String, Object>();
                idCellJsonMap.put("id", String.valueOf(counter));
                idCellJsonMap.put("cell", jsonDocFaltantes);
                jsonMapNivDDEP2.add(idCellJsonMap);
                counter++;
            }
        }
        jsonMapNivDDEP1.put("page", "1");
        jsonMapNivDDEP1.put("total", 1);
        jsonMapNivDDEP1.put("records", counter > 0 ? counter - 1 : 0);
        jsonMapNivDDEP1.put("rows", (Object) jsonMapNivDDEP2);

        return mapper.writeValueAsString(jsonMapNivDDEP1);
    }
    
    /**
     * Metodo encargado de obtener el listado de dcoumentos historicos con base en el rfc del empleado y el tipo de documento.
     * @author Oscar S.
     * @param customDoctosExpPersonalDTO List<CustomDoctosExpPersonalDTO> 
     * @return String
     */
    @SuppressWarnings("unchecked")
    private String generateJSONStringDocHistorico(List<CustomDoctosExpPersonalDTO> customDoctosExpPersonalDTO) throws IOException, JsonGenerationException, JsonMappingException {
        ObjectMapper mapper = new ObjectMapper();

        // jsonMapCA Nivel 1
        HashMap<String, Object> jsonMapNivDDEP1 = new HashMap<String, Object>();

        // jsonMapCA Nivel 2
        List jsonMapNivDDEP2 = new ArrayList();
        HashMap<String, Object> idCellJsonMap;

        // jsonMapCA Nivel 3
        List<String> jsonDocHist = new ArrayList<String>();

        int counter = 1;

        for (CustomDoctosExpPersonalDTO doctos: customDoctosExpPersonalDTO) {
            if (doctos.getIdStatus().toString().equals("ACT") || doctos.getIdStatus().toString().equals("REG") || doctos.getIdStatus().toString().equals("REC") || doctos.getIdStatus().toString().equals("HIS")) {
                
                jsonDocHist = new ArrayList<String>();
                 
                if (doctos.getDoctoRef() != null && !doctos.getDoctoRef().equals("")) {
                    jsonDocHist.add("<a href='downloadFile.do?uuid=" + doctos.getDoctoRef() + "' class='requestlink' title='Descargar documento' target='_blank'><img width='20' align='middle' src='../images/pdf-download.jpg'//><//a>");
                } else {
                    jsonDocHist.add("");
                }
                jsonDocHist.add(doctos.getDescDocto() != null ? doctos.getDescDocto().toString() : "");
                jsonDocHist.add(doctos.getDescStatus() != null ? doctos.getDescStatus().toString() : "");
                jsonDocHist.add(doctos.getDescRechazo() != null ? doctos.getDescRechazo().toString() : "");
    
                // jsonMap Nivel 2
                idCellJsonMap = new HashMap<String, Object>();
                idCellJsonMap.put("id", String.valueOf(counter));
                idCellJsonMap.put("cell", jsonDocHist);
                jsonMapNivDDEP2.add(idCellJsonMap);
                counter++;
            }
        }
        jsonMapNivDDEP1.put("rows", (Object) jsonMapNivDDEP2);

        return mapper.writeValueAsString(jsonMapNivDDEP1);
    }
    
    /**
     * Descarga de documentos desde el filesystem del componenete FSN-JCR
     * @author Oscar S.
     * @param uuid String
     * @param response HttpServletResponse
     * @return String
     */
    @RequestMapping
    public String downloadFile(@RequestParam("uuid") String uuid, HttpServletResponse response) throws IOException {
        FsnResource fsnResource = super.getService(TestJcrService.class).getFile(uuid);
        
        String mimetype = fsnResource.getMimeType();
        response.setContentType(mimetype);
        fsnResource.getDataSize();
        FileCopyUtils.copy(fsnResource.getData(), response.getOutputStream());
        return null;
    }
    
    // TODO: Comprobante XML
    /**
     * Metodo encargado de obtener el comprobante de pago en formato xml.
     * @author Oscar S.
     * @param idComprobante RequestParam
     * @param rfcEmpleado RequestParam
     * @param response HttpServletResponse
     * @return String
     */
    @RequestMapping
    public String getComprobanteXMLCallback(@RequestParam("idComprobante") Integer idComprobante, 
                                            @RequestParam("rfcEmpleado") String rfcEmpleado, 
                                            @RequestParam("idPaquete") Integer idPaquete,
                                            HttpServletResponse response) {
        try {
            // Obtener datos del comprobante
            TnComprobanteDTO comprobante = super.getService(ExpedienteService.class).getExpedienteComprobante(idComprobante, rfcEmpleado, idPaquete);
            byte[] bytesXml = new String(IOUtils.toByteArray(comprobante.getXmlTimbrado().getAsciiStream())).getBytes("UTF-8");
            
            String XML_Utf8 = new String(bytesXml);
            XML_Utf8 = "<?xml version=\"1.0\" encoding=\"UTF-8\" ?>\n" + XML_Utf8;
            
            // Descarga archivo xml
            String fileName = rfcEmpleado + "_" + comprobante.getCompFolioRecibo();
            
            response.setContentType("application/xml");
            response.setContentLength(XML_Utf8.getBytes().length);
            response.setHeader("Content-Disposition", "attachment; filename=" + fileName + ".xml");
            OutputStream out = response.getOutputStream();
            out.write(XML_Utf8.getBytes(), 0, XML_Utf8.getBytes().length);  
        } catch (Exception e) {
            logger.debug("Exception: " + e.toString());
            return null;
        } 
        return null;
    }
    
    // TODO: Muestra firma electronica
    /**
     * Metodo encargado de mostrar el applet para firma electronica.
     * @author Oscar S.
     * @param model model
     * @param idComprobante RequestParam
     * @param rfcEmpleado RequestParam
     * @param idPaquete RequestParam
     * @param muestraFirmaElectronicaDTO muestraFirmaElectronicaDTO
     * @return String
     */
    @RequestMapping
    public String muestraFirmaElectronica(Model model, 
                                          @RequestParam("idComprobante") Integer idComprobante, 
                                          @RequestParam("rfcEmpleado") String rfcEmpleado, 
                                          @RequestParam("idPaquete") Integer idPaquete, 
                                          MuestraFirmaElectronicaDTO muestraFirmaElectronicaDTO) {
        
        muestraFirmaElectronicaDTO.setIdComprobante(idComprobante);
        muestraFirmaElectronicaDTO.setRfcEmpleado(rfcEmpleado);
        muestraFirmaElectronicaDTO.setIdPaquete(idPaquete);
        
        model.addAttribute(muestraFirmaElectronicaDTO);
        return super.getViewName("firmaElectronica");
    }
    
    // TODO: Comprobante PDF
    /**
     * Metodo encargado de obtener el comprobante de pago en formato pdf.
     * @author Oscar S.
     * @param idComprobante RequestParam
     * @param rfcEmpleado RequestParam
     * @param idPaquete RequestParam
     * @param response HttpServletResponse
     * @param request HttpServletRequest
     * @return String
     */
    @RequestMapping
    public String getComprobantePDFCallback(@RequestParam("idComprobante") Integer idComprobante, 
                                            @RequestParam("rfcEmpleado") String rfcEmpleado, 
                                            @RequestParam("idPaquete") Integer idPaquete, 
                                            HttpServletResponse response, 
                                            HttpServletRequest request) {
        byte[] bytesXml;
        byte[] bytesPdf;

        HttpSession session;
        ServletContext servletContext;

        File xmlFile = null;
        //FileOutputStream fos = null;
        File pdfFile = null;
        FileInputStream fis = null;
        TnComprobanteDTO comprobante = null;

        try {
            // Obtener datos del comprobante
            comprobante = super.getService(ExpedienteService.class).getExpedienteComprobante(idComprobante, rfcEmpleado, idPaquete);
            
            if (comprobante != null && comprobante.getXmlTimbrado() != null) {
                
                // Parametros iniciales
                String fileNameRandom = UUID.randomUUID().toString();
                String tempFilename = fileNameRandom + ".xml";
                String folioRecibo = comprobante.getCompFolioRecibo();
                String fileName = rfcEmpleado + "_" + folioRecibo;
                String rutaArchivo = super.configuration().getString("local.temp.dir");
                xmlFile = new File(rutaArchivo + File.separator + tempFilename);

                // Escribir cabecera
                bytesXml = new String(IOUtils.toByteArray(comprobante.getXmlTimbrado().getAsciiStream())).getBytes("UTF-8");

                String XML_Utf8 = new String(bytesXml);
                XML_Utf8 = "<?xml version=\"1.0\" encoding=\"UTF-8\" ?>\n" + XML_Utf8;
                FileUtils.writeStringToFile(xmlFile, XML_Utf8);

                // Paths
                session = request.getSession();
                servletContext = session.getServletContext();
                String rootPath = servletContext.getRealPath("/");
                //String pathDocs = rootPath + "META-INF/sireh/resources/docs" + File.separator;
                String pathDocs = rootPath + "WEB-INF/docs" + File.separator;
                logger.debug("pathDocs --------->" + pathDocs);
                String aXmlPath = rutaArchivo + File.separator + tempFilename;
                
                // Genera archivo pdf
                ProductReport productReport = new ProductReport();
                String reportOutputPath = super.configuration().getString("local.temp.dir");
                logger.debug("reportOutputPath --------->" + reportOutputPath);
                
                String file = productReport.writePDF(pathDocs, RFC_PATRON, folioRecibo, aXmlPath, reportOutputPath);
                logger.debug("file --------->" + file);

                // Descarga archivo pdf
                pdfFile = new File(file);
                
                if (pdfFile.exists()) {
                    // Comprobante no firmado
                    if (comprobante.getIdEdoComprobante() == 1) {
                        super.getService(ExpedienteService.class).firmarComprobante(comprobante);
                    }

                    fis = new FileInputStream(pdfFile);
                    bytesPdf = IOUtils.toByteArray(fis);

                    response.setContentType("application/pdf");
                    response.setContentLength(bytesPdf.length);
                    response.setHeader("Content-Disposition", "attachment; filename=" + fileName + ".pdf");
                    OutputStream out = response.getOutputStream();
                    out.write(bytesPdf, 0, bytesPdf.length);
                }
            }
        } catch (JAXBException e) {
            logger.debug("JAXBException --------->" + e.toString());
            e.printStackTrace();
            return null;
        } catch (UnsupportedEncodingException e) {
            logger.debug("UnsupportedEncodingException --------->" + e.toString());
            e.printStackTrace();
            return null;
        } catch (IOException e) {
            logger.debug("IOException --------->" + e.toString());
            e.printStackTrace();
            return null;
        } catch (SQLException e) {
            logger.debug("SQLException --------->" + e.toString());
            e.printStackTrace();
            return null;
        } catch (Exception e) {
            logger.debug("Exception --------->" + e.toString());
            e.printStackTrace();
            return null;
        } finally {
            try {
                if (pdfFile != null && pdfFile.exists()) {
                    fis.close();
                }
            } catch (IOException ioe) {
                logger.debug("IOException: " + ioe.toString());
                ioe.printStackTrace();
            }
        }
        return null;
    }
    
    // TODO: Comprobante de Pago PDF 
    /**
     * Metodo encargado generar y desplegar el archivo PDF de los comprobantes de pago
     * @author Martin C.
     * @param folio String
     * @param diffolio String
     * @return String
     */
    @RequestMapping
    public void getComprobantePagoPDFCallback(@RequestParam("folio") String folio, @RequestParam("diffolio") String diffolio, HttpServletResponse response,  HttpServletRequest request) {
        HttpSession session;
        ServletContext servletContext;
        
        Map<String, Object> params = new HashMap<String, Object>();
        //params.put("P_RFC", "BACC750120SS2");
        //params.put("P_UNIDAD", 711);
        
        params.put("P_FOLIO", folio);
        params.put("P_DIF_FOLIO", diffolio);
        
        // Parametros iniciales
        String fileNameRandom = UUID.randomUUID().toString();

        // Paths
        session = request.getSession();
        servletContext = session.getServletContext();
        String rootPath = servletContext.getRealPath("/");
        String jasperFileName = null;

        jasperFileName = JASPER_HISTORICO_PAGOS;
        
        //params.put("REPORT_CONTEXT", servletContext);
        
        String reportBasePath = rootPath + "WEB-INF/reports/expediente" + File.separator;
        reportBasePath = reportBasePath.replace("\\", "/");
        
        // Genera archivo pdf
        String reportOutputPath = super.configuration().getString("local.temp.dir");
        reportOutputPath = reportOutputPath.replace("\\", "/");
        
        String imagesPath = rootPath + "images/reports";
        imagesPath = imagesPath.replace("\\", "/");
        
        String destFileName = reportOutputPath + File.separator + fileNameRandom + ".pdf";
        destFileName = destFileName.replace("\\", "/");
        
        String sourceFileName = reportBasePath + jasperFileName;
        sourceFileName = sourceFileName.replace("\\", "/");
        
        params.put("IMAGES_URI", imagesPath);
        Connection conn = super.getService(RegistroCursoSPCService.class).getConnection();
        
        logger.debug("createReportHistoricoPagos -------------> reportBasePath ------------->" + reportBasePath);
        logger.debug("createReportHistoricoPagos -------------> reportOutputPath -------------> " + reportOutputPath);
        logger.debug("createReportHistoricoPagos -------------> reportBasePath ---------------> " + reportBasePath);
        logger.debug("createReportHistoricoPagos -------------> destFileName -------------> " + destFileName);
        
        try {
            JasperRunManager.runReportToPdfFile(sourceFileName, destFileName, params, conn);
        } catch (JRException e) {
            logger.debug("createReportHistoricoPagos -------------> JRException -------------> " + e.toString());
        } finally {
            try {
                if (!conn.isClosed()) {
                    conn.close();
                }
            } 
            catch (SQLException e) {
                logger.debug("createReportHistoricoPagos -------------> SQLException -------------> " + e.toString());
            }
            //return fileNameRandom;
        }
        
        // Descargar del archivo pdf 
        byte[] bytesPdf;
        File pdfFile = null;
        FileInputStream fis = null;
        
        try {
          pdfFile = new File(destFileName);
          if (pdfFile.exists()) {
              fis = new FileInputStream(pdfFile);
              bytesPdf = IOUtils.toByteArray(fis);
              response.setContentType("application/pdf");
              response.setContentLength(bytesPdf.length);
              response.setHeader("Content-Disposition", "attachment; filename=" + JASPER_HISTORICO_PAGOS + ".pdf");
              OutputStream out;
              out = response.getOutputStream();
              out.write(bytesPdf, 0, bytesPdf.length);
          }
        } catch (FileNotFoundException fnfe) {
          logger.debug("descargaHistoricoPagos -> FileNotFoundException -> " + fnfe.toString());
        } catch (IOException e) {
          logger.debug("descargaHistoricoPagos -> IOException -> " + e.toString());
        } finally {
          try {
              if (pdfFile != null && pdfFile.exists()) {
                  fis.close();
              }
          } catch (IOException ioe) {
              logger.debug("descargaHistoricoPagos -> IOException: " + ioe.toString());
          }
        }
        
    }
                                            
    // TODO: Comprobante PDF Timbrado
    /**
     * Metodo encargado de obtener el comprobante de pago en formato pdf, si ya ha sido firmado.
     * @author Martin C.
     * @param StringIdComprobante String
     * @param rfcEmpleado String
     * @param StringIdPaquete String
     * @param response HttpServletResponse
     * @param request HttpServletRequest
     * @return String
     */
    @RequestMapping
    public String getComprobantePDFFirmadoCallback(@RequestParam("StringIdComprobante") String StringIdComprobante, 
                                            @RequestParam("rfcEmpleado") String rfcEmpleado, 
                                            @RequestParam("StringIdPaquete") String StringIdPaquete, 
                                            HttpServletResponse response, 
                                            HttpServletRequest request){
                                            
        Integer idComprobante   = new Integer(StringIdComprobante);
        Integer idPaquete       = new Integer(StringIdPaquete.substring(0, StringIdPaquete.length()-2));
        
        byte[] bytesXml;
        byte[] bytesPdf;

        HttpSession session;
        ServletContext servletContext;

        File xmlFile = null;
        //FileOutputStream fos = null;
        File pdfFile = null;
        FileInputStream fis = null;
        TnComprobanteDTO comprobante = null;

        try {
            // Obtener datos del comprobante
            comprobante = super.getService(ExpedienteService.class).getExpedienteComprobante(idComprobante, rfcEmpleado, idPaquete);
            
            if (comprobante != null && comprobante.getXmlTimbrado() != null) {
                
                // Parametros iniciales
                String fileNameRandom = UUID.randomUUID().toString();
                String tempFilename = fileNameRandom + ".xml";
                String folioRecibo = comprobante.getCompFolioRecibo();
                String fileName = rfcEmpleado + "_" + folioRecibo;
                String rutaArchivo = super.configuration().getString("local.temp.dir");
                xmlFile = new File(rutaArchivo + File.separator + tempFilename);

                // Escribir cabecera
                bytesXml = new String(IOUtils.toByteArray(comprobante.getXmlTimbrado().getAsciiStream())).getBytes("UTF-8");

                String XML_Utf8 = new String(bytesXml);
                XML_Utf8 = "<?xml version=\"1.0\" encoding=\"UTF-8\" ?>\n" + XML_Utf8;
                FileUtils.writeStringToFile(xmlFile, XML_Utf8);

                // Paths
                session = request.getSession();
                servletContext = session.getServletContext();
                String rootPath = servletContext.getRealPath("/");
                //String pathDocs = rootPath + "META-INF/sireh/resources/docs" + File.separator;
                String pathDocs = rootPath + "WEB-INF/docs" + File.separator;
                logger.debug("pathDocs --------->" + pathDocs);
                String aXmlPath = rutaArchivo + File.separator + tempFilename;
                
                // Genera archivo pdf
                ProductReport productReport = new ProductReport();
                String reportOutputPath = super.configuration().getString("local.temp.dir");
                logger.debug("reportOutputPath --------->" + reportOutputPath);
                
                String file = productReport.writePDF(pathDocs, RFC_PATRON, folioRecibo, aXmlPath, reportOutputPath);
                logger.debug("file --------->" + file);

                // Descarga archivo pdf
                pdfFile = new File(file);
                
                if (pdfFile.exists()) {
                    // Comprobante no firmado
                    //if (comprobante.getIdEdoComprobante() == 1) {
                        //super.getService(ExpedienteService.class).firmarComprobante(comprobante);
                    //}

                    fis = new FileInputStream(pdfFile);
                    bytesPdf = IOUtils.toByteArray(fis);

                    response.setContentType("application/pdf");
                    response.setContentLength(bytesPdf.length);
                    response.setHeader("Content-Disposition", "attachment; filename=" + fileName + ".pdf");
                    OutputStream out = response.getOutputStream();
                    out.write(bytesPdf, 0, bytesPdf.length);
                }
            }
        } catch (JAXBException e) {
            logger.debug("JAXBException --------->" + e.toString());
            e.printStackTrace();
            return null;
        } catch (UnsupportedEncodingException e) {
            logger.debug("UnsupportedEncodingException --------->" + e.toString());
            e.printStackTrace();
            return null;
        } catch (IOException e) {
            logger.debug("IOException --------->" + e.toString());
            e.printStackTrace();
            return null;
        } catch (SQLException e) {
            logger.debug("SQLException --------->" + e.toString());
            e.printStackTrace();
            return null;
        } catch (Exception e) {
            logger.debug("Exception --------->" + e.toString());
            e.printStackTrace();
            return null;
        } finally {
            try {
                if (pdfFile != null && pdfFile.exists()) {
                    fis.close();
                }
            } catch (IOException ioe) {
                logger.debug("IOException: " + ioe.toString());
                ioe.printStackTrace();
            }
        }
        return null;
    }
    
    /** 
     * TIMBRADO - Metodo encargado de construir cadenas de tipo json con base en listas de objetos de tipo CustomTnComprobanteDTO.
     * @author Oscar S.
     * @param listaComprobante List<CustomTnComprobanteDTO>
     * @return String
     */
    @SuppressWarnings("unchecked")
    private String generateJSONStringTimbrado(List<CustomTnComprobanteDTO> listaComprobante) throws IOException, JsonGenerationException, JsonMappingException {
        ObjectMapper mapper = new ObjectMapper();

        // jsonMapPN Nivel 1
        HashMap<String, Object> jsonMapNivPN1 = new HashMap<String, Object>();

        // jsonMapPN Nivel 2
        List jsonMapNivPN2 = new ArrayList();
        HashMap<String, Object> idCellJsonMap;

        // jsonMapPN Nivel 3
        HashMap<String, Object> jsonPN;

        int counter = 1;

        for (CustomTnComprobanteDTO comp: listaComprobante) {
            jsonPN = new HashMap<String, Object>();
            jsonPN.put("num", counter);
            jsonPN.put("acciones", "");
            jsonPN.put("idComprobante", comp.getIdComprobante() != null ? comp.getIdComprobante().toString() : "");
            jsonPN.put("idPaquete", comp.getIdPaquete() != null ? comp.getIdPaquete().toString() : "");
            jsonPN.put("hpIniPago", comp.getHpIniPago() != null ? comp.getHpIniPago().toString() : "");
            jsonPN.put("folioRecibido", comp.getCompFolioRecibo() != null ? comp.getCompFolioRecibo().toString() : "");
            jsonPN.put("folioFiscal", comp.getCompFolioFiscal() != null ? comp.getCompFolioFiscal().toString() : "");
            jsonPN.put("fechaEmision", comp.getCompFechaEmision() != null ? comp.getCompFechaEmision().toString() : "");
            jsonPN.put("nombreEmpleado", comp.getNombreEmpleado() != null ? comp.getNombreEmpleado().toString() : "");
            jsonPN.put("primerApellido", comp.getPrimerApellido() != null ? comp.getPrimerApellido().toString() : "");
            jsonPN.put("segundoApellido", comp.getSegundoApellido() != null ? comp.getSegundoApellido().toString() : "");
            jsonPN.put("rfcEmpleado", comp.getCompRfc() != null ? comp.getCompRfc().toString() : "");
            jsonPN.put("estadoComprobante", comp.getDescEdoComp() != null ? new String(comp.getDescEdoComp()).toUpperCase() : "");
            
            jsonPN.put("hpFolio", comp.getHpFolio() != null ? comp.getHpFolio().toString() : "");
            jsonPN.put("hpdiffolio", comp.getHpDifFolio() != null ? comp.getHpDifFolio().toString() : "");
            jsonPN.put("hpDescTipoNomina", comp.getDescTipoNomina() != null ? comp.getDescTipoNomina() : "");
            jsonPN.put("hpCicloUnidad", comp.getHpCicloUnidad() != null ? comp.getHpCicloUnidad().toString() : "");
            jsonPN.put("hpEjercicioFiscal", comp.getHpEjerFiscal() != null ? comp.getHpEjerFiscal().toString() : "");
            jsonPN.put("hpIdPlaza", comp.getIdPlaza() != null ? comp.getIdPlaza().toString() : "");
            jsonPN.put("hpIdUnidadNom", comp.getIdUnidadNom() != null ? comp.getIdUnidadNom() : "");
            jsonPN.put("hpIdPuestoNom", comp.getIdPuestoNom() != null ? comp.getIdPuestoNom() : "");
            jsonPN.put("hpDescGrupoPago", comp.getDescGrupoPago() != null ? comp.getDescGrupoPago() : "");
            jsonPN.put("hpNeto", comp.getNeto() != null ? comp.getNeto() : "");

            // jsonMap Nivel 2
            idCellJsonMap = new HashMap<String, Object>();
            idCellJsonMap.put("id", String.valueOf(counter));
            idCellJsonMap.put("cell", jsonPN);
            jsonMapNivPN2.add(idCellJsonMap);
            counter++;
        }
        jsonMapNivPN1.put("page", "1");
        jsonMapNivPN1.put("total", 1);
        jsonMapNivPN1.put("records", String.valueOf(listaComprobante.size()));
        jsonMapNivPN1.put("rows", (Object) jsonMapNivPN2);

        return mapper.writeValueAsString(jsonMapNivPN1);
    }

    /** 
     * DEPENDIENTES ECONOMICOS - Metodo encargado de construir cadenas de tipo json con base en listas de objetos de tipo CustomTdDepEcoDTO.
     * @author Oscar S.
     * @param listaDependientes List<CustomTdDepEcoDTO>
     * @return String
     */
    @SuppressWarnings("unchecked")
    private String generateJSONString(List<CustomTdDepEcoDTO> listaDependientes) throws IOException, JsonGenerationException, JsonMappingException {
        ObjectMapper mapper = new ObjectMapper();

        // jsonMap Nivel 1
        HashMap<String, Object> jsonMapNiv1 = new HashMap<String, Object>();

        // jsonMap Nivel 2
        List jsonMapNiv2 = new ArrayList();
        HashMap<String, Object> idCellJsonMap;

        // jsonMap Nivel 3
        HashMap<String, Object> jsonDep;

        int counter = 1;
        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");

        for (CustomTdDepEcoDTO dep: listaDependientes) {
            jsonDep = new HashMap<String, Object>();
            jsonDep.put("num", counter);
            
            jsonDep.put("doctoSop", dep.getFdbDoctoRef() != null ? dep.getFdbDoctoRef() : "");
            jsonDep.put("nombre", dep.getNombreDependiente() != null ? dep.getNombreDependiente() : "");
            jsonDep.put("pApellido", dep.getFdbPrimerApellido() != null ? dep.getFdbPrimerApellido() : "");
            jsonDep.put("sApellido", dep.getFdbSegundoApellido() != null ? dep.getFdbSegundoApellido() : "");
            jsonDep.put("fecha", df.format(dep.getFdbFechaNacimiento()) != null ? df.format(dep.getFdbFechaNacimiento()) : df.format(new Date()));
            jsonDep.put("genero", dep.getDescGenero() != null ? dep.getDescGenero() : "");
            jsonDep.put("parentesco", dep.getDescParentesco() != null ? dep.getDescParentesco() : "");
            jsonDep.put("nivel", dep.getDescNivelEscolar() != null ? dep.getDescNivelEscolar() : "");
            jsonDep.put("promedio", dep.getFdbPromedio() != null ? dep.getFdbPromedio().toString() : "");
            jsonDep.put("fecModifico", dep.getFecModifico() != null ? df.format(dep.getFecModifico()) : "");
            
            // jsonMap Nivel 2
            idCellJsonMap = new HashMap<String, Object>();
            idCellJsonMap.put("id", String.valueOf(counter));
            idCellJsonMap.put("cell", jsonDep);
            jsonMapNiv2.add(idCellJsonMap);
            counter++;
        }
        jsonMapNiv1.put("page", "1");
        jsonMapNiv1.put("total", 1);
        jsonMapNiv1.put("records", String.valueOf(listaDependientes.size()));
        jsonMapNiv1.put("rows", (Object) jsonMapNiv2);

        return mapper.writeValueAsString(jsonMapNiv1);
    }
    
    /** 
     * ANTECEDENTES ACADEMICOS - Metodo encargado de construir cadenas de tipo json con base en listas de objetos.
     * @author Martin C.
     * @param listaAnAc List<CustomTdExpAntecedentesAcademicosDTO>
     * @return String
     */
     @SuppressWarnings("unchecked")
    private String generateJSONStringAnAc(List<CustomTdExpAntecedentesAcademicosDTO> listaAnAc) throws IOException, JsonGenerationException, JsonMappingException {
        ObjectMapper mapper = new ObjectMapper();

        // jsonMapEL Nivel 1
        HashMap<String, Object> jsonMapNiv1 = new HashMap<String, Object>();

        // jsonMapEL Nivel 2
        List jsonMapNiv2 = new ArrayList();
        HashMap<String, Object> idCellJsonMap;

        // jsonMapEL Nivel 3
        HashMap<String, Object> jsonAnAc;
        
        int counter = 1;
        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        
        for(CustomTdExpAntecedentesAcademicosDTO anAc: listaAnAc){
            jsonAnAc = new HashMap<String, Object>();
            jsonAnAc.put("num", counter);
            jsonAnAc.put("doctoSop", anAc.getAacDoctoRef() != null ? anAc.getAacDoctoRef() : "");
            jsonAnAc.put("nEscolar", anAc.getDescNivelEscolar() != null ? anAc.getDescNivelEscolar() : "");
            jsonAnAc.put("escdad", anAc.getDescProfnCarrera() != null ? anAc.getDescProfnCarrera() : "");
            jsonAnAc.put("estudios", anAc.getAacEstConcluidos() != null ? (anAc.getAacEstConcluidos().equalsIgnoreCase("S") ? "SI" : anAc.getAacEstConcluidos().equalsIgnoreCase("N") ? "NO" : "" ) : "");
            jsonAnAc.put("instit", anAc.getDescInstEducat() != null ? anAc.getDescInstEducat() : "");
            jsonAnAc.put("promedio", anAc.getAacPromedio() != null ? anAc.getAacPromedio().toString() : "");
            jsonAnAc.put("cedula", anAc.getAacCedProfesional() != null ? anAc.getAacCedProfesional().toString() : "");
            jsonAnAc.put("fecModifico", df.format(anAc.getFecModifico()) != null ? df.format(anAc.getFecModifico())  : "");
            
            idCellJsonMap = new HashMap<String, Object>();
            idCellJsonMap.put("id", String.valueOf(counter));
            idCellJsonMap.put("cell", jsonAnAc);
            jsonMapNiv2.add(idCellJsonMap);
            counter++;
        }
        
        jsonMapNiv1.put("page", "1");
        jsonMapNiv1.put("total", 1);
        jsonMapNiv1.put("records", String.valueOf(listaAnAc.size()));
        jsonMapNiv1.put("rows", (Object) jsonMapNiv2);

        return mapper.writeValueAsString(jsonMapNiv1);
    }
    
    
    /** 
     * CURSOS - Metodo encargado de construir cadenas de tipo json con base en listas de objetos.
     * @author Martin C.
     * @param listaCursos List<CustomTdExpCapacitacionDTO>
     * @return String
     */
     @SuppressWarnings("unchecked")
    private String generateJSONStringCursos(List<CustomTdExpCapacitacionDTO> listaCursos) throws IOException, JsonGenerationException, JsonMappingException {
        // TODO: CONSULTAR http://stackoverflow.com/questions/5361971/replace-all-double-quotes-within-string
        // TODO: PARA REMPLAZAR COMILLAS DOBLES Y SIMPLES ---> text = text.replaceAll("('|\")", "\\\\$1");
        
        ObjectMapper mapper = new ObjectMapper();

        // jsonMapEL Nivel 1
        HashMap<String, Object> jsonMapNiv1 = new HashMap<String, Object>();

        // jsonMapEL Nivel 2
        List jsonMapNiv2 = new ArrayList();
        HashMap<String, Object> idCellJsonMap;

        // jsonMapEL Nivel 3
        HashMap<String, Object> jsonCursos;
        
        int counter = 1;
        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        
        for(CustomTdExpCapacitacionDTO curso: listaCursos){
            jsonCursos = new HashMap<String, Object>();
            jsonCursos.put("num", counter);
            jsonCursos.put("doctoSop", curso.getCapDoctoRef() != null ? curso.getCapDoctoRef() : "");
            //jsonCursos.put("idCap", curso.getIdCapacitacion() != null ? curso.getIdCapacitacion() : "");
            jsonCursos.put("nivCap", curso.getNivelCapacitacion() != null ? curso.getNivelCapacitacion() : "");
            jsonCursos.put("descCap", curso.getDescCapacitacion() != null ? curso.getDescCapacitacion().replaceAll("\"", "\\\\\"") : "");
            jsonCursos.put("instEduc", curso.getDescInstEducat() != null ? curso.getDescInstEducat() : "");
            jsonCursos.put("capProm", curso.getCapPromedio() != null ? curso.getCapPromedio().toString() : "");
            jsonCursos.put("capConcl", curso.getCapEstConcluidos() != null ? curso.getCapEstConcluidos().equalsIgnoreCase("S") ? "SI" : curso.getCapEstConcluidos().equalsIgnoreCase("N") ? "NO": "" :  "");
            jsonCursos.put("fecModifico", curso.getFecModifico() != null ? df.format(curso.getFecModifico()) : "");
            
            idCellJsonMap = new HashMap<String, Object>();
            idCellJsonMap.put("id", String.valueOf(counter));
            idCellJsonMap.put("cell", jsonCursos);
            jsonMapNiv2.add(idCellJsonMap);
            counter++;
        }
        
        jsonMapNiv1.put("page", "1");
        jsonMapNiv1.put("total", 1);
        jsonMapNiv1.put("records", String.valueOf(listaCursos.size()));
        jsonMapNiv1.put("rows", (Object) jsonMapNiv2);

        return mapper.writeValueAsString(jsonMapNiv1);
    }
    
    /** 
     * SPC - Metodo encargado de construir cadenas de tipo json con base en listas de objetos.
     * @author Martin C.
     * @param listaSPC List<CustomTdExpCapacitacionDTO>
     * @return String
     */
     @SuppressWarnings("unchecked")
    private String generateJSONStringSPC(List<CustomTdExpDoctosSinDatosDTO> listaSPC) throws IOException, JsonGenerationException, JsonMappingException {
        ObjectMapper mapper = new ObjectMapper();

        // jsonMapEL Nivel 1
        HashMap<String, Object> jsonMapNiv1 = new HashMap<String, Object>();

        // jsonMapEL Nivel 2
        List jsonMapNiv2 = new ArrayList();
        HashMap<String, Object> idCellJsonMap;

        // jsonMapEL Nivel 3
        HashMap<String, Object> jsonSPC;
        
        int counter = 1;
        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        
        for(CustomTdExpDoctosSinDatosDTO spc: listaSPC){
            jsonSPC = new HashMap<String, Object>();
            jsonSPC.put("num", counter);
            jsonSPC.put("dsdDoctoRef", spc.getDsdDoctoRef() != null ? spc.getDsdDoctoRef() : "");
            jsonSPC.put("descDocto", spc.getDescDocto() != null ? spc.getDescDocto() : "");
            jsonSPC.put("dsdDescripDocto", spc.getDsdDescripDocto() != null ? spc.getDsdDescripDocto() : "");
            jsonSPC.put("dsdAxoDocto", spc.getDsdAxoDocto() != null ? spc.getDsdAxoDocto().toString() : "");
            jsonSPC.put("fecModifico", df.format(spc.getFecModifico()) != null ? df.format(spc.getFecModifico()) : "");
            
            idCellJsonMap = new HashMap<String, Object>();
            idCellJsonMap.put("id", String.valueOf(counter));
            idCellJsonMap.put("cell", jsonSPC);
            jsonMapNiv2.add(idCellJsonMap);
            counter++;
        }
        
        jsonMapNiv1.put("page", "1");
        jsonMapNiv1.put("total", 1);
        jsonMapNiv1.put("records", String.valueOf(listaSPC.size()));
        jsonMapNiv1.put("rows", (Object) jsonMapNiv2);

        return mapper.writeValueAsString(jsonMapNiv1);
    }
    
    /** 
     * EXPERIENCIA LABORAL - Metodo encargado de construir cadenas de tipo json con base en listas de objetos.
     * @author Martin C.
     * @param listaEL List<CustomTdExpLabDTO>
     * @return String
     */
    @SuppressWarnings("unchecked")
    private String generateJSONStringEL(List<CustomTdExpLabDTO> listaEL) throws IOException, JsonGenerationException, JsonMappingException {
        ObjectMapper mapper = new ObjectMapper();

        // jsonMapEL Nivel 1
        HashMap<String, Object> jsonMapNivEL1 = new HashMap<String, Object>();

        // jsonMapEL Nivel 2
        List jsonMapNivEL2 = new ArrayList();
        HashMap<String, Object> idCellJsonMap;

        // jsonMapEL Nivel 3
        HashMap<String, Object> jsonEL;

        int counter = 1;
        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");

        for (CustomTdExpLabDTO el: listaEL) {
            jsonEL = new HashMap<String, Object>();
            jsonEL.put("num", counter);
            jsonEL.put("doctoSop", el.getExpDoctoRef() != null ? el.getExpDoctoRef() : "");
            jsonEL.put("sector", el.getExpSector() != null ? el.getExpSector() : "");
            jsonEL.put("pais", el.getDescPais() != null ? el.getDescPais() : "");
            jsonEL.put("periodo", df.format(el.getExpFecInicial()) + " - " + df.format(el.getExpFecFinal()) != null ? df.format(el.getExpFecInicial()) + " - " + df.format(el.getExpFecFinal()) : "") ;
            jsonEL.put("org", el.getExpOrganizacion() != null ? el.getExpOrganizacion() : "");
            jsonEL.put("puesto", el.getDescNivelCargo() != null ? el.getDescNivelCargo() : "");
            jsonEL.put("actividad", el.getDescActPrin() != null ? el.getDescActPrin() : "");
            jsonEL.put("fecModifico", df.format(el.getFecModifico()) != null ? df.format(el.getFecModifico()) : "");
            
            // jsonMap Nivel 2
            idCellJsonMap = new HashMap<String, Object>();
            idCellJsonMap.put("id", String.valueOf(counter));
            idCellJsonMap.put("cell", jsonEL);
            jsonMapNivEL2.add(idCellJsonMap);
            counter++;
        }
        jsonMapNivEL1.put("page", "1");
        jsonMapNivEL1.put("total", 1);
        jsonMapNivEL1.put("records", String.valueOf(listaEL.size()));
        jsonMapNivEL1.put("rows", (Object) jsonMapNivEL2);

        return mapper.writeValueAsString(jsonMapNivEL1);
    }        

    /** 
     * CONCEPTOS ADICIONALES DE NOMINA - Metodo encargado de construir cadenas de tipo json con base en listas de objetos de tipo CustomTnMovtoConceptoPagoDTO.
     * @author Roberto Muñoz.
     * @param listaCA List<CustomTnMovtoConceptoPagoDTO>
     * @return String
     */
    @SuppressWarnings("unchecked")
    private String generateJSONStringCA(List<CustomTnMovtoConceptoPagoDTO> listaCA) throws IOException, JsonGenerationException, JsonMappingException {
        ObjectMapper mapper = new ObjectMapper();

        // jsonMapCA Nivel 1
        HashMap<String, Object> jsonMapNivCA1 = new HashMap<String, Object>();

        // jsonMapCA Nivel 2
        List jsonMapNivCA2 = new ArrayList();
        HashMap<String, Object> idCellJsonMap;

        // jsonMapCA Nivel 3
        HashMap<String, Object> jsonCA;

        int counter = 1;

        for (CustomTnMovtoConceptoPagoDTO dep: listaCA) {
            if (dep.getIdSitCaptura().equals("V") == true) {
                jsonCA = new HashMap<String, Object>();
                jsonCA.put("num", counter);
                jsonCA.put("tipo", dep.getDescTipoConcepto() != null ? dep.getDescTipoConcepto().toString() : "");
                jsonCA.put("clave", dep.getIdConcepto() != null ? dep.getIdConcepto().toString() : "");
                jsonCA.put("descripcion", dep.getDescConPag() != null ? dep.getDescConPag().toString() : "");
                jsonCA.put("institucion", dep.getDescTercero() != null ? dep.getDescTercero().toString() : "");
                jsonCA.put("importe", dep.getMontof() != null ? dep.getMontof().toString() : "");
                jsonCA.put("porcentaje", dep.getPorcentajef() != null ? dep.getPorcentajef().toString() : "");
                jsonCA.put("qnainicial", dep.getMcpQnaIni() != null ? dep.getMcpQnaIni().toString() : "");
                jsonCA.put("qnafinal", dep.getMcpQnaFin() != null ? dep.getMcpQnaFin().toString() : "");
                jsonCA.put("qnasaplicadas", dep.getQnaAplicadasf() != null ? dep.getQnaAplicadasf().toString() : "");
                jsonCA.put("descSitCaptura", dep.getDescSitCaptura() != null ? dep.getDescSitCaptura().toString() : "");
                jsonCA.put("usuario", dep.getUsuario() != null ? dep.getUsuario().toString() : "");
                jsonCA.put("fecModifico", dep.getFecModifico() != null ? dep.getFecModifico().toString() : "");

                // jsonMap Nivel 2
                idCellJsonMap = new HashMap<String, Object>();
                idCellJsonMap.put("id", String.valueOf(counter));
                idCellJsonMap.put("cell", jsonCA);
                jsonMapNivCA2.add(idCellJsonMap);
                counter++;
            }
        }
        jsonMapNivCA1.put("page", "1");
        jsonMapNivCA1.put("total", 1);
        jsonMapNivCA1.put("records", counter > 0 ? counter - 1 : 0);
        jsonMapNivCA1.put("rows", (Object) jsonMapNivCA2);

        return mapper.writeValueAsString(jsonMapNivCA1);
    }

    /**
     * CONCEPTOS ADICIONALES DE NOMINA HISTORICOS - Metodo encargado de construir cadenas de tipo json con base en listas de objetos de tipo CustomTnMovtoConceptoPagoDTO.
     * @author Roberto Muñoz.
     * @param listaCAH List<CustomTnMovtoConceptoPagoDTO>
     * @return String
     */
    @SuppressWarnings("unchecked")
    private String generateJSONStringCAH(List<CustomTnMovtoConceptoPagoDTO> listaCAH) throws IOException, JsonGenerationException, JsonMappingException {
        ObjectMapper mapper = new ObjectMapper();

        // jsonMapCA Nivel 1
        HashMap<String, Object> jsonMapNivCAH1 = new HashMap<String, Object>();

        // jsonMapCA Nivel 2
        List jsonMapNivCAH2 = new ArrayList();
        HashMap<String, Object> idCellJsonMap;

        // jsonMapCA Nivel 3
        HashMap<String, Object> jsonCAH;

        int counter = 1;

        for (CustomTnMovtoConceptoPagoDTO deph: listaCAH) {
            if (deph.getIdSitCaptura().equals("V") == false) {
                jsonCAH = new HashMap<String, Object>();
                jsonCAH.put("num", counter);
                jsonCAH.put("tipo", deph.getDescTipoConcepto() != null ? deph.getDescTipoConcepto().toString() : "");
                jsonCAH.put("clave", deph.getIdConcepto() != null ? deph.getIdConcepto().toString() : "");
                jsonCAH.put("descripcion", deph.getDescConPag() != null ? deph.getDescConPag().toString() : "");
                jsonCAH.put("institucion", deph.getDescTercero() != null ? deph.getDescTercero().toString() : "");
                jsonCAH.put("importe", deph.getMontof() != null ? deph.getMontof().toString() : "");
                jsonCAH.put("porcentaje", deph.getPorcentajef() != null ? deph.getPorcentajef().toString() : "");
                jsonCAH.put("qnainicial", deph.getMcpQnaIni() != null ? deph.getMcpQnaIni().toString() : "");
                jsonCAH.put("qnafinal", deph.getMcpQnaFin() != null ? deph.getMcpQnaFin().toString() : "");
                jsonCAH.put("qnasaplicadas", deph.getQnaAplicadasf() != null ? deph.getQnaAplicadasf().toString() : "");
                jsonCAH.put("descSitCaptura", deph.getDescSitCaptura() != null ? deph.getDescSitCaptura().toString() : "");

                jsonCAH.put("usuario", deph.getUsuario() != null ? deph.getUsuario().toString() : "");
                jsonCAH.put("fecModifico", deph.getFecModifico() != null ? deph.getFecModifico().toString() : "");

                // jsonMap Nivel 2
                idCellJsonMap = new HashMap<String, Object>();
                idCellJsonMap.put("id", String.valueOf(counter));
                idCellJsonMap.put("cell", jsonCAH);
                jsonMapNivCAH2.add(idCellJsonMap);
                counter++;
            }
        }
        jsonMapNivCAH1.put("page", "1");
        jsonMapNivCAH1.put("total", 1);
        jsonMapNivCAH1.put("records", counter > 0 ? counter - 1 : 0);
        jsonMapNivCAH1.put("rows", (Object) jsonMapNivCAH2);

        return mapper.writeValueAsString(jsonMapNivCAH1);
    }

    /**
     * TRAYECTORIA LABORAL - Metodo encargado de construir cadenas de tipo json con base en listas de objetos de tipo CustomTnMovtosEmpPlaDTO.
     * @author Roberto Muñoz.
     * @param listaTL List<CustomTnMovtosEmpPlaDTO>
     * @return String
     */
    @SuppressWarnings("unchecked")
    private String generateJSONStringTL(List<CustomTnMovtosEmpPlaDTO> listaTL) throws IOException, JsonGenerationException, JsonMappingException {
        ObjectMapper mapper = new ObjectMapper();

        // jsonMapTL Nivel 1
        HashMap<String, Object> jsonMapNivTL1 = new HashMap<String, Object>();

        // jsonMapCA Nivel 2
        List jsonMapNivTL2 = new ArrayList();
        HashMap<String, Object> idCellJsonMap;

        // jsonMapTL Nivel 3
        HashMap<String, Object> jsonTL;

        int counter = 1;

        for (CustomTnMovtosEmpPlaDTO dep: listaTL) {
            jsonTL = new HashMap<String, Object>();
            jsonTL.put("num", counter);
            jsonTL.put("descripcion", dep.getDescMovsPersonal() != null ? dep.getDescMovsPersonal().toString() : "");
            jsonTL.put("vigencia", dep.getContrato() != null ? dep.getContrato().toString() : "");
            jsonTL.put("ur", dep.getIdUnidadNom() != null ? dep.getIdUnidadNom().toString() : "");
            jsonTL.put("pto", dep.getIdPuestoNom() != null ? dep.getIdPuestoNom().toString() : "");
            jsonTL.put("plaza", dep.getIdPlaza() != null ? dep.getIdPlaza().toString() : "");
            jsonTL.put("nombramiento", dep.getDescNombramiento() != null ? dep.getDescNombramiento().toString() : "");
            jsonTL.put("grupopago", dep.getDescGrupoPago() != null ? dep.getDescGrupoPago().toString() : "");
            jsonTL.put("qnacap", dep.getMepQnaCaptura() != null ? dep.getMepQnaCaptura().toString() : "");
            jsonTL.put("usuario", dep.getUsuario() != null ? dep.getUsuario().toString() : "");
            jsonTL.put("fecModifico", dep.getFecModifico() != null ? dep.getFecModifico().toString() : "");
            jsonTL.put("sitmov", dep.getSitmov() != null ? dep.getSitmov().toString() : "");

            // jsonMap Nivel 2
            idCellJsonMap = new HashMap<String, Object>();
            idCellJsonMap.put("id", String.valueOf(counter));
            idCellJsonMap.put("cell", jsonTL);
            jsonMapNivTL2.add(idCellJsonMap);
            counter++;
        }
        jsonMapNivTL1.put("page", "1");
        jsonMapNivTL1.put("total", 1);
        jsonMapNivTL1.put("records", String.valueOf(listaTL.size()));
        jsonMapNivTL1.put("rows", (Object) jsonMapNivTL2);

        return mapper.writeValueAsString(jsonMapNivTL1);
    }

    /**
     * HISTORICO DE PAGOS - Metodo encargado de construir cadenas de tipo json con base en listas de objetos de tipo CustomTnHistoricoPagoDTO.
     * @author Roberto Muñoz.
     * @param listaPN List<CustomTnHistoricoPagoDTO>
     * @return String
     */
    @SuppressWarnings("unchecked")
    private String generateJSONStringPN(List<CustomTnHistoricoPagoDTO> listaPN) throws IOException, JsonGenerationException, JsonMappingException {
        ObjectMapper mapper = new ObjectMapper();

        // jsonMapPN Nivel 1
        HashMap<String, Object> jsonMapNivPN1 = new HashMap<String, Object>();

        // jsonMapPN Nivel 2
        List jsonMapNivPN2 = new ArrayList();
        HashMap<String, Object> idCellJsonMap;

        // jsonMapPN Nivel 3
        HashMap<String, Object> jsonPN;

        int counter = 1;

        for (CustomTnHistoricoPagoDTO dep: listaPN) {
            jsonPN = new HashMap<String, Object>();
            jsonPN.put("num", counter);
            jsonPN.put("folio", dep.getHpFolio() != null ? dep.getHpFolio().toString() : "");
            jsonPN.put("diffolio", dep.getHpDifFolio() != null ? dep.getHpDifFolio().toString() : "");
            jsonPN.put("nomina", dep.getDescTipoNomina() != null ? dep.getDescTipoNomina().toString() : "");
            jsonPN.put("ejercicio", dep.getHpEjerFiscal() != null ? dep.getHpEjerFiscal().toString() : "");
            jsonPN.put("qna", dep.getHpQnaPago() != null ? dep.getHpQnaPago().toString() : "");
            jsonPN.put("periodo", dep.getPeriodo() != null ? dep.getPeriodo().toString() : "");
            jsonPN.put("unidad", dep.getIdUnidadNom() != null ? dep.getIdUnidadNom().toString() : "");
            jsonPN.put("puesto", dep.getIdPuestoNom() != null ? dep.getIdPuestoNom().toString() : "");
            jsonPN.put("plaza", dep.getIdPlaza() != null ? dep.getIdPlaza().toString() : "");
            jsonPN.put("grupo", dep.getDescGrupoPago() != null ? dep.getDescGrupoPago().toString() : "");
            jsonPN.put("clabe", dep.getHpClabe() != null ? dep.getHpClabe().toString() : "");
            jsonPN.put("neto", dep.getNeto() != null ? dep.getNeto().toString() : "");

            // jsonMap Nivel 2
            idCellJsonMap = new HashMap<String, Object>();
            idCellJsonMap.put("id", String.valueOf(counter));
            idCellJsonMap.put("cell", jsonPN);
            jsonMapNivPN2.add(idCellJsonMap);
            counter++;
        }
        jsonMapNivPN1.put("page", "1");
        jsonMapNivPN1.put("total", 1);
        jsonMapNivPN1.put("records", String.valueOf(listaPN.size()));
        jsonMapNivPN1.put("rows", (Object) jsonMapNivPN2);

        return mapper.writeValueAsString(jsonMapNivPN1);
    }

    /**
     * INCIDENCIAS DE PERSONAL - Metodo encargado de construir cadenas de tipo json con base en listas de objetos de tipo CustomTnMovtoConceptoPagoDTO.
     * @author Roberto Muñoz.
     * @param listaIP List<CustomTnMovtoConceptoPagoDTO>
     * @return String
     */
    @SuppressWarnings("unchecked")
    private String generateJSONStringIP(List<CustomTnMovtoConceptoPagoDTO> listaIP) throws IOException, JsonGenerationException, JsonMappingException {
        ObjectMapper mapper = new ObjectMapper();

        // jsonMapIP Nivel 1
        HashMap<String, Object> jsonMapNivIP1 = new HashMap<String, Object>();

        // jsonMapIP Nivel 2
        List jsonMapNivIP2 = new ArrayList();
        HashMap<String, Object> idCellJsonMap;

        // jsonMapIP Nivel 3
        HashMap<String, Object> jsonIP;

        int counter = 1;
        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");

        for (CustomTnMovtoConceptoPagoDTO dep: listaIP) {
            jsonIP = new HashMap<String, Object>();
            jsonIP.put("num", counter);
            jsonIP.put("estado", dep.getDescSitCaptura() != null ? dep.getDescSitCaptura().toString() : "");
            jsonIP.put("tipo", dep.getDescTipoConcepto() != null ? dep.getDescTipoConcepto().toString() : "");
            jsonIP.put("concepto", dep.getIdConcepto() != null ? dep.getIdConcepto().toString() : "");
            jsonIP.put("descripcion", dep.getDescConPag() != null ? dep.getDescConPag().toString() : "");
            jsonIP.put("qnacap", dep.getMcpQnaCaptura() != null ? dep.getMcpQnaCaptura().toString() : "");
            jsonIP.put("monto", dep.getMontof() != null ? dep.getMontof().toString() : "");
            jsonIP.put("fecha", dep.getMcpFecIncidencia() != null ? df.format(dep.getMcpFecIncidencia()) : "");
            jsonIP.put("usuario", dep.getUsuario() != null ? dep.getUsuario().toString() : "");
            jsonIP.put("fecModifico", dep.getFecModifico() != null ? dep.getFecModifico().toString() : "");

            // jsonMap Nivel 2
            idCellJsonMap = new HashMap<String, Object>();
            idCellJsonMap.put("id", String.valueOf(counter));
            idCellJsonMap.put("cell", jsonIP);
            jsonMapNivIP2.add(idCellJsonMap);
            counter++;
        }
        jsonMapNivIP1.put("page", "1");
        jsonMapNivIP1.put("total", 1);
        jsonMapNivIP1.put("records", String.valueOf(listaIP.size()));
        jsonMapNivIP1.put("rows", (Object) jsonMapNivIP2);

        return mapper.writeValueAsString(jsonMapNivIP1);
    }

    /**
     * DEPENDIENTES ECONOMICOS - Metodo encargado de construir cadenas de tipo json con base en listas de objetos de tipo CustomTdDepEcoDTO.
     * @author Oscar Sanchez.
     * @param listaDependientes List<CustomTdDepEcoDTO>
     * @return String
     */
    @SuppressWarnings("unchecked")
    private String generateJSONStringSubGrid(List<CustomTdDepEcoDTO> listaDependientes) throws IOException, JsonGenerationException, JsonMappingException {
        ObjectMapper mapper = new ObjectMapper();

        // jsonMap Nivel 1
        HashMap<String, Object> jsonMapNiv1 = new HashMap<String, Object>();

        // jsonMap Nivel 2
        List jsonMapNiv2 = new ArrayList();

        // jsonMap Nivel 3
        List jsonMapNiv3;
        HashMap<String, Object> jsonDep;

        // subGrid
        HashMap<String, String> subGrid;

        int counter = 1;
        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");

        for (CustomTdDepEcoDTO dep: listaDependientes) {
            jsonDep = new HashMap<String, Object>();

            jsonDep.put("id", String.valueOf(counter));
            jsonDep.put("idDepEco", String.valueOf(counter));
            jsonDep.put("nombre", dep.getDeNombreCompleto());
            jsonDep.put("fecha", df.format(dep.getDeFecNac()));
            jsonDep.put("edad", dep.getDeEdad() != null ? dep.getDeEdad().toString() : "");
            jsonDep.put("genero", dep.getDeGenero() != null ? dep.getDeGenero() : "");
            jsonDep.put("parentesco", dep.getDeParentesco() != null ? dep.getDeParentesco() : "");
            jsonDep.put("nivel", dep.getDeNivelEscolar() != null ? dep.getDeNivelEscolar() : "");
            jsonDep.put("promedio", dep.getDePromEsc() != null ? dep.getDePromEsc().toString() : "");

            // subGrid
            subGrid = new HashMap<String, String>();
            subGrid.put("idDepEco", String.valueOf(counter));
            subGrid.put("golosina", "Manguitos Enchilados");

            jsonMapNiv3 = new ArrayList();
            jsonMapNiv3.add(subGrid);
            jsonDep.put("subLista", (Object) jsonMapNiv3);
            jsonMapNiv2.add(jsonDep);
            counter++;
        }

        jsonMapNiv1.put("page", "1");
        jsonMapNiv1.put("total", 1);
        jsonMapNiv1.put("records", String.valueOf(listaDependientes.size()));
        jsonMapNiv1.put("rows", (Object) jsonMapNiv2);

        return mapper.writeValueAsString(jsonMapNiv1);
    }

    /** 
     * DOCUMENTO DEL EXPEDIENTE DE PERSONAL - Metodo encargado de construir cadenas de tipo json con base en listas de objetos de tipo CustomDoctosExpPersonalDTO.
     * @author Roberto Muñoz.
     * @param listaDDEP List<CustomDoctosExpPersonalDTO> 
     * @return String
     */
    @SuppressWarnings("unchecked")
    private String generateJSONStringDDEP(List<CustomDoctosExpPersonalDTO> listaDDEP) throws IOException, JsonGenerationException, JsonMappingException {
        ObjectMapper mapper = new ObjectMapper();

        // jsonMapCA Nivel 1
        HashMap<String, Object> jsonMapNivDDEP1 = new HashMap<String, Object>();

        // jsonMapCA Nivel 2
        List jsonMapNivDDEP2 = new ArrayList();
        HashMap<String, Object> idCellJsonMap;

        // jsonMapCA Nivel 3
        HashMap<String, Object> jsonDDEP;

        int counter = 1;

        for (CustomDoctosExpPersonalDTO doctos: listaDDEP) {
            if (doctos.getIdStatus().toString().equals("REG") || doctos.getIdStatus().toString().equals("ACT") || 
                doctos.getIdStatus().toString().equals("HIS") || doctos.getIdStatus().toString().equals("REC") ||
                doctos.getIdStatus().toString().equals("SIN")) {
                jsonDDEP = new HashMap<String, Object>();
                jsonDDEP.put("num", counter);
                jsonDDEP.put("orden", doctos.getOrdenDocto() != null ? doctos.getOrdenDocto().toString() : "");
                jsonDDEP.put("iddocto", doctos.getIdDocto() != null ? doctos.getIdDocto().toString() : "");
                jsonDDEP.put("descdocto", doctos.getDescDocto() != null ? doctos.getDescDocto().toString() : "");
                jsonDDEP.put("secuencia", doctos.getSecuencia() != null ? doctos.getSecuencia().toString() : "");
                jsonDDEP.put("idstatus", doctos.getIdStatus() != null ? doctos.getIdStatus().toString() : "");
                jsonDDEP.put("descstatus", doctos.getDescStatus() != null ? doctos.getDescStatus().toString() : "");
                jsonDDEP.put("idrechazo", doctos.getIdExpRechazo() != null ? doctos.getIdExpRechazo().toString() : "");
                jsonDDEP.put("descrechazo", doctos.getDescRechazo() != null ? doctos.getDescRechazo().toString() : "");
                jsonDDEP.put("referenciadocto", doctos.getDoctoRef() != null ? doctos.getDoctoRef().toString() : "");
                jsonDDEP.put("requerido", doctos.getRequerido()  != null ? doctos.getRequerido().toString() : "");
    
                // jsonMap Nivel 2
                idCellJsonMap = new HashMap<String, Object>();
                idCellJsonMap.put("id", String.valueOf(counter));
                idCellJsonMap.put("cell", jsonDDEP);
                jsonMapNivDDEP2.add(idCellJsonMap);
                counter++;
            }
        }
        jsonMapNivDDEP1.put("page", "1");
        jsonMapNivDDEP1.put("total", 1);
        jsonMapNivDDEP1.put("records", counter > 0 ? counter - 1 : 0);
        jsonMapNivDDEP1.put("rows", (Object) jsonMapNivDDEP2);

        return mapper.writeValueAsString(jsonMapNivDDEP1);
    }
    
    /**
     * Metodo encargado de consultar expediente personal sin filtrar el RFC.
     * @author Martin C.
     * @param model Model
     * @param expedienteDTO ExpedientePersonalDTO
     * @return String
     */
    @RequestMapping
    public String expedienteRfc(Model model, ExpedienteDTO expedienteDTO) throws IOException, JsonGenerationException, JsonMappingException {

        String userRfc = super.identity().get(super.security().getUserName()).getRfc().toUpperCase();
        
        expedienteDTO = super.getService(ExpedienteService.class).getExpediente(userRfc);
        expedienteDTO.setUniCiclo(super.security().getOperationYear());
        
        expedienteDTO.setUrlOrigen("expedienteRfc");
        expedienteDTO.setUrlDestino("expedienteRfc");
        
        // Experiencia Laboral JSON
        expedienteDTO.setJsonEL(generateJSONStringEL(expedienteDTO.getListaExperienciaLaboralDTO()));
        expedienteDTO.setLocel(expedienteDTO.getListaExperienciaLaboralDTO().size());
        
        if (expedienteDTO.getLocel() > 6) {
            expedienteDTO.setDesel(7);
        } else {
            expedienteDTO.setDesel(expedienteDTO.getLocel());
        }

        if (expedienteDTO.getLocel() > 1) {
            expedienteDTO.setVenel(((expedienteDTO.getDesel()) * 23.2));
        } else {
            expedienteDTO.setVenel(150.0);
        }

        // Trayectoria Laboral JSON
        expedienteDTO.setJsonTL(generateJSONStringTL(expedienteDTO.getListaMovimientosEmpleadoDTO()));
        expedienteDTO.setLoctl(expedienteDTO.getListaMovimientosEmpleadoDTO().size());
        if (expedienteDTO.getLoctl() > 6) {
            expedienteDTO.setDestl(7);
        } else {
            expedienteDTO.setDestl(expedienteDTO.getLoctl());
        }

        if (expedienteDTO.getLoctl() > 1) {
            expedienteDTO.setVentl(((expedienteDTO.getDestl()) * 23.2));
        } else {
            expedienteDTO.setVentl(150.0);
        }
        
        // Dependientes Economicos JSON
        expedienteDTO.setJsonDependientes(generateJSONString(expedienteDTO.getListaDependientesDTO()));
        expedienteDTO.setLocdep(expedienteDTO.getListaDependientesDTO().size());
        if (expedienteDTO.getLocdep() > 6) {
            expedienteDTO.setDesdep(7);
        } else {
            expedienteDTO.setDesdep(expedienteDTO.getLocdep());
        }
        if (expedienteDTO.getLocdep() > 1) {
            expedienteDTO.setVendep(((expedienteDTO.getDesdep()) * 23.2));
        } else {
            expedienteDTO.setVendep(150.0);
        }
        
        // Antecedentes Academicos JSON
        expedienteDTO.setJsonAntAcademicos(generateJSONStringAnAc(expedienteDTO.getListaAntAcademicosDTO()));
        expedienteDTO.setLocAnAc(expedienteDTO.getListaAntAcademicosDTO().size());
        if(expedienteDTO.getLocAnAc() > 6){
            expedienteDTO.setDescAnAc(7);
        } else {
            expedienteDTO.setDescAnAc(expedienteDTO.getLocAnAc());
        }
        if(expedienteDTO.getLocAnAc() > 1){
            expedienteDTO.setVenAnAc(((expedienteDTO.getDescAnAc()) * 25.5));
        } else {
            expedienteDTO.setVenAnAc(150.0);
        }

        // Experiencia Laboral JSON
        expedienteDTO.setJsonEL(generateJSONStringEL(expedienteDTO.getListaExperienciaLaboralDTO()));
        expedienteDTO.setLocel(expedienteDTO.getListaExperienciaLaboralDTO().size());
        if (expedienteDTO.getLocel() > 6) {
            expedienteDTO.setDesel(7);
        } else {
            expedienteDTO.setDesel(expedienteDTO.getLocel());
        }
        if (expedienteDTO.getLocel() > 1) {
            expedienteDTO.setVenel(((expedienteDTO.getDesel()) * 25.5));
        } else {
            expedienteDTO.setVenel(150.0);
        }
        
        // Cursos
        expedienteDTO.setJsonCursos(generateJSONStringCursos(expedienteDTO.getListaCursosDTO()));
        expedienteDTO.setLocCursos(expedienteDTO.getListaCursosDTO().size());
        if(expedienteDTO.getLocCursos() > 6){
            expedienteDTO.setDesCursos(7);
        } else {
            expedienteDTO.setDesCursos(expedienteDTO.getLocCursos());
        }
        if(expedienteDTO.getLocCursos() > 1){
            expedienteDTO.setVenCursos(((expedienteDTO.getDesCursos()) * 25.5));
        } else {
            expedienteDTO.setVenCursos(150.0);
        }
        
        // Servico Profesional de Carrera (SPC)
        expedienteDTO.setJsonSPC(generateJSONStringSPC(expedienteDTO.getListaSPCDTO()));
        expedienteDTO.setLocSPC(expedienteDTO.getListaSPCDTO().size());
        if(expedienteDTO.getLocSPC() > 6){
            expedienteDTO.setDesSPC(7);
        } else {
            expedienteDTO.setDesSPC(expedienteDTO.getLocSPC());
        }
        if(expedienteDTO.getLocSPC() > 1){
            expedienteDTO.setVenSPC(((expedienteDTO.getDesSPC()) * 25.5));
        } else {
            expedienteDTO.setVenSPC(150.0);
        }
        
        // Conceptos de nomina adicionales JSON
        expedienteDTO.setJsonCA(generateJSONStringCA(expedienteDTO.getListaConceptosAdicionalesDTO()));
        expedienteDTO.setLocca(expedienteDTO.getListaConceptosAdicionalesDTO().size());
        if (expedienteDTO.getLocca() > 6) {
            expedienteDTO.setDesca(7);
        } else {
            expedienteDTO.setDesca(expedienteDTO.getLocca());
        }
        if (expedienteDTO.getLocca() > 1) {
            expedienteDTO.setVenca(((expedienteDTO.getDesca()) * 30.5));
        } else {
            expedienteDTO.setVenca(150.0);
        }

        // Conceptos de nomina adicionales Historicos JSON
        expedienteDTO.setJsonCAH(generateJSONStringCAH(expedienteDTO.getListaConceptosAdicionalesDTO()));
        expedienteDTO.setLoccah(expedienteDTO.getListaConceptosAdicionalesDTO().size());
        if (expedienteDTO.getLoccah() > 6) {
            expedienteDTO.setDescah(7);
        } else {
            expedienteDTO.setDescah(expedienteDTO.getLoccah());
        }
        if (expedienteDTO.getLoccah() > 1) {
            expedienteDTO.setVencah(((expedienteDTO.getDescah()) * 23.2));
        } else {
            expedienteDTO.setVencah(150.0);
        }

        // Trayectoria Laboral JSON
        expedienteDTO.setJsonTL(generateJSONStringTL(expedienteDTO.getListaMovimientosEmpleadoDTO()));
        expedienteDTO.setLoctl(expedienteDTO.getListaMovimientosEmpleadoDTO().size());
        if (expedienteDTO.getLoctl() > 6) {
            expedienteDTO.setDestl(7);
        } else {
            expedienteDTO.setDestl(expedienteDTO.getLoctl());
        }
        if (expedienteDTO.getLoctl() > 1) {
            expedienteDTO.setVentl(((expedienteDTO.getDestl()) * 23.2));
        } else {
            expedienteDTO.setVentl(150.0);
        }

        // Pagos de Nómina JSON
        expedienteDTO.setJsonPN(generateJSONStringPN(expedienteDTO.getListaHistoricoPagoDTO()));
        expedienteDTO.setLocpn(expedienteDTO.getListaHistoricoPagoDTO().size());
        if (expedienteDTO.getLocpn() > 6) {
            expedienteDTO.setDespn(7);
        } else {
            expedienteDTO.setDespn(expedienteDTO.getLocpn());
        }
        if (expedienteDTO.getLocpn() > 1) {
            expedienteDTO.setVenpn(((expedienteDTO.getDespn()) * 23.2));
        } else {
            expedienteDTO.setVenpn(150.0);
        }

        // Incidencias de personal JSON
        expedienteDTO.setJsonIP(generateJSONStringIP(expedienteDTO.getListaIncidenciasDTO()));
        expedienteDTO.setLocip(expedienteDTO.getListaIncidenciasDTO().size());
        if (expedienteDTO.getLocip() > 6) {
            expedienteDTO.setDesip(7);
        } else {
            expedienteDTO.setDesip(expedienteDTO.getLocip());
        }
        if (expedienteDTO.getLocip() > 1) {
            expedienteDTO.setVenip(((expedienteDTO.getDesip()) * 23.2));
        } else {
            expedienteDTO.setVenip(150.0);
        }

        // TODO: Timbrado - Comprobantes
        expedienteDTO.setJsonTimbrado(generateJSONStringTimbrado(expedienteDTO.getListaComprobanteDTO()));
        expedienteDTO.setLocTimbrado(expedienteDTO.getListaComprobanteDTO().size());
        if (expedienteDTO.getLocTimbrado() > 6) {
            expedienteDTO.setDesTimbrado(7);
        } else {
            expedienteDTO.setDesTimbrado(expedienteDTO.getLocTimbrado());
        }
        if (expedienteDTO.getLocTimbrado() > 1) {
            expedienteDTO.setVenTimbrado(((expedienteDTO.getDesTimbrado()) * 23.2));
        } else {
            expedienteDTO.setVenTimbrado(150.0);
        }
        
        // Validacion con firma electronica
        logger.debug("--------------------> PKI_VALID_RFC: " + super.configuration().getString("PKI_VALID_RFC"));
        boolean validRfc = new Boolean(super.configuration().getString("PKI_VALID_RFC"));
        logger.debug("--------------------> validRfc: " + validRfc);
        
        if (validRfc) {
            // Valida si el RFC solicitado es igual al RFC del usuario firmado en sesion
            if (userRfc.equals(expedienteDTO.getRfcEmpleado())) {
                expedienteDTO.setUserComprobante(true);
            } else {
                expedienteDTO.setUserComprobante(false);
            }
        } else {
            // Sin validacion
            expedienteDTO.setUserComprobante(true);
        }
        
        //desabilita el boton de regreso
         expedienteDTO.setFiltradoPorRfc(true);
        
        model.addAttribute(expedienteDTO);
        return super.getViewName("expediente");
        
    }   

    /**
     * Método encargado de consultar y listar los empleados para cambio de datos curriculum
     * @param model Model
     * @param consultaEmpleadoDTO ConsultaEmpleadoDTO
     * @return
     */
    @RequestMapping
    public String curriculumPublico(Model model,ConsultaEmpleadoDTO consultaEmpleadoDTO) {
        if(consultaEmpleadoDTO.isCancel()) {
            consultaEmpleadoDTO = new ConsultaEmpleadoDTO();
        }
        consultaEmpleadoDTO.setUrlOrigen("curriculumPublico");
        consultaEmpleadoDTO.setUrlDestino("cambioDatocurr");
        consultaEmpleadoDTO.setMenuTitle("De Curriculum público");
        
        model.addAttribute(consultaEmpleadoDTO);
        return super.getViewName("consultarEmpleadosHis");
    }

    /**
     * Método encargado de obtener los datos del empleado para el cambio de datos de curriculum
     * @param model
     * @param rfcEmpleado
     * @returnPu
     */
    @RequestMapping
    public String cambioDatocurr(Model model, @RequestParam("rfcEmpleado") String rfcEmpleado) {
        CurricPubDTO curricPubDTO = super.getService(ExpedienteService.class).getCurriculumPublico(rfcEmpleado);
        
        model.addAttribute(curricPubDTO);
        return super.getViewName("curriculumPublico");
    }

    /**
     * Método encargado de actualizar datos del curriculum de empleado
     * @param model Model
     * @param curricPubDTO CurricPubDTO
     * @return
     */
    @RequestMapping
    public String updateCurriculumPublico(Model model, CurricPubDTO curricPubDTO) {
        
        super.getService(ExpedienteService.class).updateCurriculumPublico(curricPubDTO, super.security().getUserName());
        
        ConsultaEmpleadoDTO consultaEmpleadoDTO = new ConsultaEmpleadoDTO();
        consultaEmpleadoDTO.setUrlOrigen("curriculumPublico");
        consultaEmpleadoDTO.setUrlDestino("cambioDatocurr");
        consultaEmpleadoDTO.setMenuTitle("De Curriculum público");
        
        model.addAttribute(consultaEmpleadoDTO);
        super.saveMessage(model, "nomina.expdiente.curriculum.datos.ok");
        return super.getViewName("consultarEmpleadosHis");
    }
    
}
