package gob.shcp.sireh.control.clc;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import gob.shcp.fsn.control.AbstractController;
import gob.shcp.fsn.control.support.AnnotatedController;

import gob.shcp.sireh.model.TdCxlcDTO;
import gob.shcp.sireh.model.TdSecCxlcDTO;
import gob.shcp.sireh.model.clc.consulta.ConsultaRegistroClcDTO;
import gob.shcp.sireh.model.clc.consulta.FonacFstseSindiDTO;
import gob.shcp.sireh.model.clc.consulta.ejercidoCptoPagoDTO;

import gob.shcp.sireh.service.clc.consultas.ClcRegistraService;

import java.io.IOException;
import java.io.PrintWriter;

import java.text.SimpleDateFormat;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ClcConsultasController extends AbstractController implements AnnotatedController {
	
    /**
     * Metodo encargado de consultar el registro de CLC.
     * @author Oscar S.
     * @param model Model
     * @param consultaClcDTO ConsultaRegistroClcDTO
     * @return String
     */
    @RequestMapping
    public String consultaRegistroClc(Model model, ConsultaRegistroClcDTO consultaClcDTO) {
        if (consultaClcDTO.isCancel()) {
            consultaClcDTO = new ConsultaRegistroClcDTO();
        }
        // Seccion - Texto
        consultaClcDTO.setSeccion(" - Registro CLC");
        // Bean Name pagedList
        consultaClcDTO.setBeanName("consultaRegistroCLC");

        // Navegacion
        consultaClcDTO.setUrlOrigen("consultaRegistroCLC");
        consultaClcDTO.setUrlDestino("consultaRegistroCLC");
        
        if (consultaClcDTO.isMuestraRegistros()) {
            if (consultaClcDTO.getCxlcCiclo() == null || consultaClcDTO.getCxlcCiclo().equals("")) {
                super.saveError(model, "clc.consultas.consultaRegistroClc.error.cxlcCiclo");
                consultaClcDTO.setMuestraRegistros(false);
            }
        }
        
        model.addAttribute(consultaClcDTO);
        return super.getViewName("consultaRegistroClc");
    }
    
    /**
     * Metodo encargado de consultar clcs de acuerdo a la clc seleccionada, se genera un JSON como respuesta.
     * @author Oscar S.
     * @param cxlcCiclo RequestParam
     * @param cxlcQnaPago RequestParam
     * @param idTipoNomina RequestParam
     * @param cxlcComplemento RequestParam
     * @param cxlc RequestParam
     * @param response HttpServletResponse
     */
    @RequestMapping
    public void jsonCallbackCxlc(@RequestParam("cxlcCiclo") String cxlcCiclo,
                                 @RequestParam("cxlcQnaPago") String cxlcQnaPago,
                                 @RequestParam("idTipoNomina") String idTipoNomina,
                                 @RequestParam("cxlcComplemento") String cxlcComplemento,
                                 @RequestParam("cxlc") String cxlc,
                                 HttpServletResponse response) throws IOException  {
        
        List<TdCxlcDTO> listaCxlc = super.getService(ClcRegistraService.class).consultasRegistraTdCxlc(
                                                     cxlcCiclo,
                                                     cxlcQnaPago,
                                                     idTipoNomina,
                                                     cxlcComplemento,
                                                     cxlc);

        // Cadena JSON
        String jsonDataString = generateJSONStringCxlc(listaCxlc);
        
        response.setContentType("text/plain");
        PrintWriter out = response.getWriter();
        
        out.print(jsonDataString);
    }
    
    /**
     * Metodo encargado de consultar secuencias de clcs de acuerdo a la clc seleccionada, se genera un JSON como respuesta.
     * @author Oscar S.
     * @param secCxlcCiclo RequestParam
     * @param cxlc RequestParam
     * @param response HttpServletResponse
     */
    @RequestMapping
    public void jsonCallbackSecCxlc(@RequestParam("secCxlcCiclo") Integer secCxlcCiclo, 
                                    @RequestParam("cxlc") Integer cxlc, 
                                    HttpServletResponse response) throws IOException {
    
        logger.debug("jsonCallbackSecCxlc -> secCxlcCiclo -----------------> " + secCxlcCiclo);
        logger.debug("jsonCallbackSecCxlc -> cxlc -------------------------> " + cxlc);
        
        List<TdSecCxlcDTO> listaSecCxlc = super.getService(ClcRegistraService.class).consultasRegistraTdSecCxlc(secCxlcCiclo, cxlc);
        
        // Cadena JSON
        String jsonDataString = generateJSONStringSecCxlc(listaSecCxlc);
        
        response.setContentType("text/plain");
        PrintWriter out = response.getWriter();
        
        out.print(jsonDataString);
    }
    
    /**
     * Metodo encargado de generar cadenas tipo JSON con base en una lista de objetos TdCxlcDTO
     * @author Oscar S.
     * @param listaCxlc List<TdCxlcDTO>
     * @return jsonString String
     */
    @SuppressWarnings("unchecked")
    private String generateJSONStringCxlc(List<TdCxlcDTO> listaCxlc) throws IOException, JsonGenerationException, JsonMappingException {
        ObjectMapper mapper = new ObjectMapper();
        
        // jsonMap Nivel 1
        HashMap<String, Object> jsonMapNiv1 = new HashMap<String, Object>();
        
        // jsonMap Nivel 2
        List jsonMapNiv2 = new ArrayList();
        HashMap<String, Object> idCellJsonMap;
        
        // jsonMap Nivel 3
        HashMap<String, Object> jsonCxlc;
        
        // subGrid
        HashMap<String, String> subGrid;
         
        int counter = 1;
        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        
        for (TdCxlcDTO cxlc : listaCxlc) { 
            jsonCxlc = new HashMap<String, Object>();
            jsonCxlc.put("cxlcCiclo", cxlc.getCxlcCiclo() != null ? cxlc.getCxlcCiclo().toString() : "");
            jsonCxlc.put("cxlc", cxlc.getCxlc() != null ? cxlc.getCxlc().toString() : "");
            jsonCxlc.put("cxlcQnaPago", cxlc.getCxlcQnaPago() > 0 ? String.valueOf(cxlc.getCxlcQnaPago()) : "");
            jsonCxlc.put("idTipoNomina", cxlc.getIdTipoNomina() != null ? cxlc.getIdTipoNomina().toString() : "");
            jsonCxlc.put("cxlcComplemento", cxlc.getCxlcComplemento());
            jsonCxlc.put("cxlcMonto", cxlc.getCxlcMonto() > 0 ? cxlc.getCxlcMonto() : 0);
             
            jsonCxlc.put("cxlcSituacion", cxlc.getCxlcSituacion() != null ? cxlc.getCxlcSituacion() : "");
            jsonCxlc.put("cxlcRectifica", cxlc.getCxlcRectifica() != null ? cxlc.getCxlcRectifica().toString() : "");
            jsonCxlc.put("cxlcTipoProceso", cxlc.getCxlcTipoProceso() != null ? cxlc.getCxlcTipoProceso().toString() : "");
            jsonCxlc.put("cxlcMaestroPto", cxlc.getCxlcMaestroPto() != null ? cxlc.getCxlcMaestroPto().toString() : "");
            
            jsonCxlc.put("cxlcConciliaSicop", cxlc.getCxlcConciliaSicop() != null ? cxlc.getCxlcConciliaSicop().toString() : "");
            jsonCxlc.put("cxlcNota", cxlc.getCxlcNota() != null ? cxlc.getCxlcNota().toString() : "");
            jsonCxlc.put("cxlcCompromiso", cxlc.getCxlcCompromiso() != null ? cxlc.getCxlcCompromiso().toString() : "");
            jsonCxlc.put("cxlcDevengado", cxlc.getCxlcDevengado() != null ? cxlc.getCxlcDevengado().toString() : "");
            jsonCxlc.put("cxlcIva", cxlc.getCxlcIva() != null ? cxlc.getCxlcIva().toString() : "");
            jsonCxlc.put("cxlcParametros", cxlc.getCxlcParametros() != null ? cxlc.getCxlcParametros().toString() : "");
            
            jsonCxlc.put("cxlcOrigen", cxlc.getCxlcOrigen() != null ? cxlc.getCxlcOrigen() : 0);
            jsonCxlc.put("nominaOrigen", cxlc.getNominaOrigen() != null ? cxlc.getNominaOrigen().toString() : "");
            
            jsonCxlc.put("usuario", cxlc.getUsuario() != null ? cxlc.getUsuario().toString() : "");
            jsonCxlc.put("fecModifico", cxlc.getFecModifico() != null ? cxlc.getFecModifico().toString() : "");
            
            // jsonMap Nivel 2
            idCellJsonMap = new HashMap<String, Object>();
            idCellJsonMap.put("id", String.valueOf(counter));
            idCellJsonMap.put("cell", jsonCxlc);
            
            jsonMapNiv2.add(idCellJsonMap);
            
            counter++;
        }
        
        jsonMapNiv1.put("page", "1");
        jsonMapNiv1.put("total", 1);
        jsonMapNiv1.put("records", String.valueOf(listaCxlc.size()));
        jsonMapNiv1.put("rows", jsonMapNiv2);
        
        return mapper.writeValueAsString(jsonMapNiv1);
    }
   
    /**
     * Metodo encargado de generar cadenas yipo JSON con base en una lista de objetos TdSecCxlcDTO
     * @author Oscar S.
     * @param listaSecCxlc List<TdSecCxlcDTO>
     * @return jsonString String
     */ 
    @SuppressWarnings("unchecked")
    private String generateJSONStringSecCxlc(List<TdSecCxlcDTO> listaSecCxlc) throws IOException, JsonGenerationException, JsonMappingException {
        ObjectMapper mapper = new ObjectMapper();
        
        // jsonMap Nivel 1
        HashMap<String, Object> jsonMapNiv1 = new HashMap<String, Object>();
        
        // jsonMap Nivel 2
        List jsonMapNiv2 = new ArrayList();
        HashMap<String, Object> idCellJsonMap;
        
        // jsonMap Nivel 3
        HashMap<String, Object> jsonCxlc;
        
        // subGrid
        HashMap<String, String> subGrid;
         
        int counter = 1;
        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        
        for (TdSecCxlcDTO cxlc : listaSecCxlc) { 
            jsonCxlc = new HashMap<String, Object>();
            jsonCxlc.put("secCxlcCiclo", cxlc.getSecCxlcCiclo() != null ? cxlc.getSecCxlcCiclo().toString() : "");
            jsonCxlc.put("cxlc", cxlc.getCxlc() != null ? cxlc.getCxlc().toString() : "");
            jsonCxlc.put("secCxlc", cxlc.getSecCxlc() != null ? cxlc.getSecCxlc().toString() : "");
            jsonCxlc.put("idUnidad", cxlc.getIdUnidad() != null ? String.valueOf(cxlc.getIdUnidad()) : "");
            jsonCxlc.put("idUnidadEjecuto", cxlc.getIdUnidadEjecuto() != null ? cxlc.getIdUnidadEjecuto().toString() : "");
            
            jsonCxlc.put("idEdo", cxlc.getIdEdo() != null ? cxlc.getIdEdo().toString() : "");
            jsonCxlc.put("idFuncion", cxlc.getIdFuncion() != null ? cxlc.getIdFuncion().toString() : "");
            jsonCxlc.put("idPrograma", cxlc.getIdPrograma() != null ? cxlc.getIdPrograma().toString() : "");
            jsonCxlc.put("idActInsti", cxlc.getIdActInsti() != null ? cxlc.getIdActInsti().toString() : "");
            jsonCxlc.put("idActPriorita", cxlc.getIdActPriorita() != null ? cxlc.getIdActPriorita().toString() : "");
            jsonCxlc.put("idActInstiEsp", cxlc.getIdActInstiEsp() != null ? cxlc.getIdActInstiEsp().toString() : "");
            
            jsonCxlc.put("idPartida", cxlc.getIdPartida() != null ? cxlc.getIdPartida().toString() : "");
            jsonCxlc.put("idTipoGasto", cxlc.getIdTipoGasto() != null ? cxlc.getIdTipoGasto() : 0);
            jsonCxlc.put("idFuenteFinan", cxlc.getIdFuenteFinan() != null ? cxlc.getIdFuenteFinan() : 0);
            jsonCxlc.put("secGuiaContableEjer", cxlc.getSecGuiaContableEjer() != null ? cxlc.getSecGuiaContableEjer().toString() : "");
            jsonCxlc.put("secMonto", cxlc.getSecMonto() > 0 ? cxlc.getSecMonto() : 0);
            
            jsonCxlc.put("secClaveMov", cxlc.getSecClaveMov() != null ? cxlc.getSecClaveMov().toString() : "");
            jsonCxlc.put("idSindicato", cxlc.getIdSindicato() != null ? cxlc.getIdSindicato().toString() : "");
            jsonCxlc.put("secFecExtraSicop", cxlc.getSecFecExtraSicop() != null ? cxlc.getSecFecExtraSicop().toString() : "");
            jsonCxlc.put("secCxlcTerceros", cxlc.getSecCxlcTerceros() != null ? cxlc.getSecCxlcTerceros().toString() : "");
            jsonCxlc.put("secTerceros", cxlc.getSecTerceros() != null ? cxlc.getSecTerceros().toString() : "");
            
            jsonCxlc.put("idGrupopago", cxlc.getIdGrupopago() != null ? cxlc.getIdGrupopago().toString() : "");
            jsonCxlc.put("secCtaClabe", cxlc.getSecCtaClabe() != null ? cxlc.getSecCtaClabe().toString() : "");
            jsonCxlc.put("secCompromiso", cxlc.getSecCompromiso() != null ? cxlc.getSecCompromiso().toString() : "");
            jsonCxlc.put("secDevengado", cxlc.getSecDevengado() != null ? cxlc.getSecDevengado().toString() : "");
            jsonCxlc.put("secCxlcSiaff", cxlc.getSecCxlcSiaff() != null ? cxlc.getSecCxlcSiaff().toString() : "");
            
            jsonCxlc.put("secSiaff", cxlc.getSecSiaff() != null ? cxlc.getSecSiaff().toString() : "");
            jsonCxlc.put("secQnaApli", cxlc.getSecQnaApli() != null ? cxlc.getSecQnaApli().toString() : "");
            jsonCxlc.put("secTipoCpto", cxlc.getSecTipoCpto() != null ? cxlc.getSecTipoCpto().toString() : "");
            jsonCxlc.put("secCptoMovto", cxlc.getSecCptoMovto() != null ? cxlc.getSecCptoMovto().toString() : "");
            jsonCxlc.put("usuario", cxlc.getUsuario() != null ? cxlc.getUsuario().toString() : "");
            jsonCxlc.put("fecModifico", cxlc.getFecModifico() != null ? cxlc.getFecModifico().toString() : "");
            
            // jsonMap Nivel 2
            idCellJsonMap = new HashMap<String, Object>();
            idCellJsonMap.put("id", String.valueOf(counter));
            idCellJsonMap.put("cell", jsonCxlc);
            
            jsonMapNiv2.add(idCellJsonMap);
            
            counter++;
        }
        
        jsonMapNiv1.put("page", "1");
        jsonMapNiv1.put("total", 1);
        jsonMapNiv1.put("records", String.valueOf(listaSecCxlc.size()));
        jsonMapNiv1.put("rows", jsonMapNiv2);
        
        return mapper.writeValueAsString(jsonMapNiv1);
    }

    /**
     * Metodo encargado de consultar casos de impuestos sobre nomina.
     * @author Equipo de Desarrollo.
     * @param model Model
     * @param consultaClcDTO ConsultaRegistroClcDTO
     * @return String
     */
    @RequestMapping
    public String consultaCasosImpNom(Model model, ConsultaRegistroClcDTO consultaClcDTO) {
        if (consultaClcDTO.isCancel()) {
            consultaClcDTO = new ConsultaRegistroClcDTO();
        }
        // Seccion
        consultaClcDTO.setSeccion(" - Casos impuestos sobre nóminas");
        // Bean Name pagedList
        consultaClcDTO.setBeanName("consultaCasosImpNom");

        // Navegacion
        consultaClcDTO.setUrlOrigen("consultaCasosImpNom");
        consultaClcDTO.setUrlDestino("consultaCasosImpNom");

        // Seccion - Bandera
        consultaClcDTO.setCasosImpuestos(true);

        model.addAttribute(consultaClcDTO);
        return super.getViewName("consultaCasosImpNom");
    }

    /**
     * Metodo encargado de consultar clc procesadas.
     * @author Equipo de Desarrollo.
     * @param model Model
     * @param consultaClcDTO ConsultaRegistroClcDTO
     * @return String
     */
    @RequestMapping
    public String clcProcesada(Model model, ConsultaRegistroClcDTO consultaClcDTO) {
        // el nombre del elemento .Do del menu es el nombre del metodo del controlador
        if (consultaClcDTO.isCancel()) {
            consultaClcDTO = new ConsultaRegistroClcDTO();
        }
        // Seccion
        consultaClcDTO.setSeccion(" - CLC's Procesadas");
        // Bean Name pagedList  Nota: Va el nombre de la consulta SQL resultado
        consultaClcDTO.setBeanName("CxlcsProcesadas");
        
        // Navegacion
        consultaClcDTO.setUrlOrigen("clcProcesada");
        consultaClcDTO.setUrlDestino("clcProcesada");
        
        // Seccion - Bandera
        consultaClcDTO.setCasosImpuestos(true);

        model.addAttribute(consultaClcDTO);
        return super.getViewName("clcProcesada"); //Va el nombre de la JSP o del Servlet ClcProcesada=tiles:/clc/consultas/ClcProcesada
    }

    /**
     * Metodo encargado de consultar clc por concepto de pago
     * @author Equipo de Desarrollo..
     * @param model Model
     * @param ejercidoCptoPagoDTO EjercidoCptoPagoDTO
     * @return String
     */
    @RequestMapping
    public String altasEjercidoCptoPago(Model model, ejercidoCptoPagoDTO ejercidoCptoPagoDTO) {
        // el nombre del elemento .Do del menu es el nombre del metodo del controlador
        if (ejercidoCptoPagoDTO.isCancel()) {
            ejercidoCptoPagoDTO = new ejercidoCptoPagoDTO();
        }
        // Seccion
        ejercidoCptoPagoDTO.setSeccion(" - Ejercido por concepto de pago");
        // Bean Name pagedList  Nota: Va el nombre de la consulta SQL resultado
        ejercidoCptoPagoDTO.setBeanName("ejercidoCptoPago");
        
        // Navegacion
        ejercidoCptoPagoDTO.setUrlOrigen("altasEjercidoCptoPago");
        ejercidoCptoPagoDTO.setUrlDestino("altasEjercidoCptoPago");
        
        // Seccion - Bandera
        ejercidoCptoPagoDTO.setCasosImpuestos(true);

        model.addAttribute(ejercidoCptoPagoDTO);
        return super.getViewName("ejercidoCptoPago"); //Va el nombre de la JSP o del Servlet ClcProcesada=tiles:/clc/consultas/ClcProcesada
    }

    /**
     * Metodo encargado de consultar Fonac, Fstse y Sindicato
     * @author Equipo de Desarrollo.
     * @param model Model
     * @param fonacFstseSindiDTO FonacFstseSindiDTO
     * @return String
     */
    @RequestMapping
    public String clcFonacFstseSindi(Model model, FonacFstseSindiDTO fonacFstseSindiDTO) {
        // despues de String va el nombre del elemento .Do del menu es el nombre del metodo del controlador definido en el menu-config
        if (fonacFstseSindiDTO.isCancel()) {
            fonacFstseSindiDTO = new FonacFstseSindiDTO();
        }
        // Seccion
        fonacFstseSindiDTO.setSeccion(" - FONAC FSTSE Sindicato");
        
        // Bean Name pagedList
        fonacFstseSindiDTO.setBeanName("sacafonacFstseSindic");

        // Navegacion
        fonacFstseSindiDTO.setUrlOrigen("clcFonacFstseSindi");
        fonacFstseSindiDTO.setUrlDestino("clcFonacFstseSindi");

        model.addAttribute(fonacFstseSindiDTO);
        return super.getViewName("fonacFstseSindi"); //Va el nombre de la JSP o del Servlet ClcProcesada=tiles:/clc/consultas/ClcProcesada
    }
}
