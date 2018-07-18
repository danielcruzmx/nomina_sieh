package gob.shcp.sireh.control.consultas;


import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import gob.shcp.fsn.control.AbstractController;
import gob.shcp.fsn.control.support.AnnotatedController;

import gob.shcp.sireh.comprobante.init.ProductReport;
import gob.shcp.sireh.model.CustomTdExpCapacitacionDTO;
import gob.shcp.sireh.model.CustomTdExpDoctosSinDatosDTO;
import gob.shcp.sireh.model.expediente.CustomTdDepEcoDTO;
import gob.shcp.sireh.model.expediente.CustomTnComprobanteDTO;
import gob.shcp.sireh.model.expediente.CustomTnMovtoConceptoPagoDTO;
import gob.shcp.sireh.model.expediente.ExpedienteDTO;
import gob.shcp.sireh.model.expediente.MuestraFirmaElectronicaDTO;
import gob.shcp.sireh.model.nomina.terceros.timbradosat.TnComprobanteDTO;
import gob.shcp.sireh.service.consultas.ConsultasService;
import gob.shcp.sireh.service.expediente.ExpedienteService;


import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import java.io.OutputStream;
import java.io.UnsupportedEncodingException;

import java.sql.SQLException;

import java.text.SimpleDateFormat;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

import java.util.UUID;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import javax.xml.bind.JAXBException;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ConsultasController extends AbstractController implements AnnotatedController {
    
    private static final String RFC_PATRON = "SHC850101U37";
    
    /**
     * Consulta los datos personales del trabajador
     * @author Martin C.
     * @param model Model
     * @param expedienteDTO ExpedienteDTO
     * @return String
     */
    @RequestMapping
    public String datosPersonales(Model model, ExpedienteDTO expedienteDTO) throws IOException, JsonGenerationException, JsonMappingException {
        String userName = super.security().getUserName();
        String userRfc = super.identity().get(userName).getRfc().toUpperCase();
        
        // TODO: Solo para pruebas
        //userRfc = "QUMC710207RM7";
        logger.debug("--------------------> userRfc: " + userRfc);
        
        expedienteDTO = super.getService(ConsultasService.class).datosPersonales(userRfc, expedienteDTO);
        
        model.addAttribute(expedienteDTO);
        return super.getViewName("datosPersonales");
    }
    
    /**
     * Consulta los dependientes economicos del trabajador
     * @author Martin C.
     * @param model Model
     * @param expedienteDTO ExpedienteDTO
     * @return String
     */
    @RequestMapping
    public String familiaresDependientes(Model model, ExpedienteDTO expedienteDTO) throws IOException, JsonGenerationException, JsonMappingException {
        String userName = super.security().getUserName();
        String userRfc = super.identity().get(userName).getRfc().toUpperCase();
        
        // TODO: Solo para pruebas
        //userRfc = "QUMC710207RM7";
        logger.debug("--------------------> userRfc: " + userRfc);
        
        expedienteDTO = super.getService(ConsultasService.class).datosPersonales(userRfc, expedienteDTO);
        expedienteDTO = super.getService(ConsultasService.class).familiaresDependientes(userRfc, expedienteDTO);
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
        
        model.addAttribute(expedienteDTO);
        return super.getViewName("familiaresDependientes");
    }
    
    /**
     * Consulta las incidencias laborales del trabajador
     * @author Martin C.
     * @param model Model
     * @param expedienteDTO ExpedienteDTO
     * @return String
     */
    @RequestMapping
    public String comprobantesPago(Model model, ExpedienteDTO expedienteDTO) throws IOException, JsonGenerationException, JsonMappingException {
        String userName = super.security().getUserName();
        String userRfc = super.identity().get(userName).getRfc().toUpperCase();
        
        // TODO: Solo para pruebas
        //userRfc = "QUMC710207RM7";
        logger.debug("--------------------> userRfc: " + userRfc);
        
        expedienteDTO = super.getService(ConsultasService.class).comprobantesPago(userRfc, expedienteDTO);
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
        
        
        boolean validRfc = new Boolean(super.configuration().getString("PKI_VALID_RFC"));
        logger.debug("-------------> PKI_VALID_RFC: " + validRfc);
        /*
        if(validRfc) {
            expedienteDTO.setUserComprobante(true);
        }
        else { expedienteDTO.setUserComprobante(false); }
        */
         expedienteDTO.setUserComprobante(true);
         
        model.addAttribute(expedienteDTO);
        return super.getViewName("comprobantesPago");
    }
    
    /**
     * Consulta las incidencias laborales del trabajador
     * @author Martin C.
     * @param model Model
     * @param expedienteDTO ExpedienteDTO
     * @return String
     */
    @RequestMapping
    public String incidenciasLaborales(Model model, ExpedienteDTO expedienteDTO) throws IOException, JsonGenerationException, JsonMappingException {
        String userName = super.security().getUserName();
        String userRfc = super.identity().get(userName).getRfc().toUpperCase();
        
        // TODO: Solo para pruebas
        //userRfc = "QUMC710207RM7";
        logger.debug("--------------------> userRfc: " + userRfc);
        
        expedienteDTO = super.getService(ConsultasService.class).incidenciasLaborales(userRfc, expedienteDTO);
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
        model.addAttribute(expedienteDTO);
        return super.getViewName("incidenciasLaborales");
    }
    
    /**
     * Consulta las notas de merito del trabajador
     * @author Martin C.
     * @param model Model
     * @param expedienteDTO ExpedienteDTO
     * @return String
     */
    @RequestMapping
    public String notasMerito(Model model, ExpedienteDTO expedienteDTO) throws IOException, JsonGenerationException, JsonMappingException {
        String userName = super.security().getUserName();
        String userRfc = super.identity().get(userName).getRfc().toUpperCase();
        
        // TODO: Solo para pruebas
        //userRfc = "QUMC710207RM7";
        logger.debug("--------------------> userRfc: " + userRfc);
        
        expedienteDTO = super.getService(ConsultasService.class).notasMerito(userRfc, expedienteDTO);
        
        model.addAttribute(expedienteDTO);
        return super.getViewName("notasMerito");
    }
    
    /**
     * Consulta de capacitación y cursos del trabajador
     * @author Martin C.
     * @param model Model
     * @param expedienteDTO ExpedienteDTO
     * @return String
     */
    @RequestMapping
    public String capacitacionCursos(Model model, ExpedienteDTO expedienteDTO) throws IOException, JsonGenerationException, JsonMappingException {
        String userName = super.security().getUserName();
        String userRfc = super.identity().get(userName).getRfc().toUpperCase();
        
        // TODO: Solo para pruebas
        //userRfc = "UICA590726SV4";
        logger.debug("--------------------> userRfc: " + userRfc);
        
        expedienteDTO = super.getService(ConsultasService.class).capacitacionCursos(userRfc, expedienteDTO);
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
        model.addAttribute(expedienteDTO);
        logger.debug("JsonCursos" + expedienteDTO.getJsonCursos());
        return super.getViewName("capacitacionCursos");
    }
    
    /**
     * Consulta del servicio profesional de carrera del trabajador
     * @author Martin C.
     * @param model Model
     * @param expedienteDTO ExpedienteDTO
     * @return String
     */
    @RequestMapping
    public String servicioProfesional(Model model, ExpedienteDTO expedienteDTO) throws IOException, JsonGenerationException, JsonMappingException {
        String userName = super.security().getUserName();
        String userRfc = super.identity().get(userName).getRfc().toUpperCase();
        
        // TODO: Solo para pruebas
        //userRfc = "QUMC710207RM7";
        logger.debug("--------------------> userRfc: " + userRfc);
        
        expedienteDTO = super.getService(ConsultasService.class).servicioProfesional(userRfc, expedienteDTO);
        
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
        
        model.addAttribute(expedienteDTO);
        return super.getViewName("servicioProfesional");
    }
    
    
    //***********************************************
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
    
     @SuppressWarnings("unchecked")
     private String generateJSONStringCursos(List<CustomTdExpCapacitacionDTO> listaCursos) throws IOException, JsonGenerationException, JsonMappingException {
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
}
