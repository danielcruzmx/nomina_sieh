package gob.shcp.sireh.control.oficinaVirtual;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import gob.shcp.fsn.control.AbstractController;
import gob.shcp.fsn.control.support.AnnotatedController;

import gob.shcp.jcr.node.FsnResource;

import gob.shcp.sireh.model.oficinaVirtual.ConsultaNotificacionesDTO;
import gob.shcp.sireh.model.oficinaVirtual.CustomTnNotificacionDTO;
import gob.shcp.sireh.model.oficinaVirtual.DetalleNotificacionDTO;

import gob.shcp.sireh.service.expediente.TestJcrService;
import gob.shcp.sireh.service.oficinaVirtual.NotificacionesService;

import java.io.IOException;
import java.io.PrintWriter;

import java.text.SimpleDateFormat;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Controlador encargado de atender solicitudes del modulo de notificaciones
 */
@Controller
public class NotificacionController extends AbstractController implements AnnotatedController {
    
    /**
     * Oficina Virtual - Consulta Notificaciones - Principal.
     * @author Oscar S.
     * @param model Model
     * @param consultaNotificacionesDTO ConsultaNotificacionesDTO
     * @return String
     */
    @RequestMapping
    public String consultaNotificaciones(Model model, ConsultaNotificacionesDTO consultaNotificacionesDTO) {
        model.addAttribute(consultaNotificacionesDTO);
        return super.getViewName("consultaNotificaciones");
    }
    
    /**
     * Oficina Virtual - Consulta Notificaciones - Home.
     * @author Oscar S.
     * @param model Model
     * @param consultaNotificacionesDTO ConsultaNotificacionesDTO
     * @return String
     */
    @RequestMapping
    public String consultaNotificacionesHome(Model model, ConsultaNotificacionesDTO consultaNotificacionesDTO) {
        model.addAttribute(consultaNotificacionesDTO);
        return super.getViewName("consultaNotificacionesHome");
    }
    
    /**
     * Oficina Virtual - Consulta Notificaciones - Metodo encargado de obtener el listado de notificaciones por empleado.
     * @author Oscar S.
     * @param response HttpServletResponse
     * @return String
     */
    @RequestMapping
    public void jsonCallbackNotificaciones(HttpServletResponse response) throws IOException {
        // Datos del usuario
        String userName = super.security().getUserName();
        logger.debug("jsonCallbackNotificaciones -> userName -> " + userName);
        
        // TODO: Solo pruebas
        String rfcEmpleado = "VICL680810SG1";
        //String rfcEmpleado = super.identity().get(userName).getRfc().toUpperCase();
        logger.debug("jsonCallbackNotificaciones -> rfcEmpleado -> " + rfcEmpleado);
        
        // Cadena JSON
        List<CustomTnNotificacionDTO> customTnNotificacionDTO = super.getService(NotificacionesService.class).getNotificacionesEmpleado(rfcEmpleado);
        logger.debug("jsonCallbackNotificaciones -> customTnNotificacionDTO.size -> " + customTnNotificacionDTO.size());
        
        // Genera cadena JSON
        String jsonDataString = generateJSONStringNotificaciones(customTnNotificacionDTO);
        logger.debug("jsonCallbackNotificaciones -> jsonDataString -> " + jsonDataString);
        
        response.setContentType("text/plain");
        PrintWriter out = response.getWriter();
        out.print(jsonDataString);
    }

    /** 
     * Oficina Virtual - Consulta Notificaciones - Metodo encargado de construir cadenas de tipo json con base en listas de objetos de tipo customTnNotificacionDTO.
     * @author Oscar S.
     * @param customTnNotificacionDTO List&lt;CustomTnNotificacionDTO&gt;
     * @return String
     */
    @SuppressWarnings("unchecked")
    private String generateJSONStringNotificaciones(List<CustomTnNotificacionDTO> customTnNotificacionDTO) throws IOException, JsonGenerationException, JsonMappingException {
        ObjectMapper mapper = new ObjectMapper();
        
        // jsonMap Nivel 1
        HashMap<String, Object> jsonMapNotificacion1 = new HashMap<String, Object>();
        
        // jsonMap Nivel 2
        List jsonMapNotificacion2 = new ArrayList();
        HashMap<String, Object> idCellJsonMap;
        
        // jsonMap Nivel 3
        HashMap<String, Object> jsonNotificaciones;
        
        int counter = 1;
        
        for (CustomTnNotificacionDTO notificacion: customTnNotificacionDTO) {
            jsonNotificaciones = new HashMap<String, Object>();
            jsonNotificaciones.put("num", counter);
            jsonNotificaciones.put("seleccion", "");
            jsonNotificaciones.put("no", counter);
            jsonNotificaciones.put("idNotificacion", notificacion.getIdNotificacion() != null ? String.valueOf(notificacion.getIdNotificacion()) : "");
            jsonNotificaciones.put("descTipoNotificacion", notificacion.getDescTipoNotificacion() != null ? notificacion.getDescTipoNotificacion() : "");
            jsonNotificaciones.put("fromRfcNotificacion", notificacion.getFromRfcNotificacion() != null ? notificacion.getFromRfcNotificacion() : "");
            jsonNotificaciones.put("toRfcNotificacion", notificacion.getToRfcNotificacion() != null ? notificacion.getToRfcNotificacion() : "");
            jsonNotificaciones.put("ccRfcNotificacion", notificacion.getCcRfcNotificacion() != null ? notificacion.getCcRfcNotificacion() : "");
            jsonNotificaciones.put("tituloNotificacion", notificacion.getTituloNotificacion() != null ? notificacion.getTituloNotificacion() : "");
            jsonNotificaciones.put("msgNotificacion", notificacion.getMsgNotificacion() != null ? notificacion.getMsgNotificacion() : "");
            jsonNotificaciones.put("adjuntoNotificacion", notificacion.getAdjuntoNotificacion() != null ? notificacion.getAdjuntoNotificacion() : "");
            jsonNotificaciones.put("descSituacionNotificacion", notificacion.getDescSituacionNotificacion() != null ? notificacion.getDescSituacionNotificacion() : "");
            jsonNotificaciones.put("usuario", notificacion.getUsuario() != null ? notificacion.getUsuario() : "");
            jsonNotificaciones.put("fecModifico", notificacion.getFecModifico() != null ? new SimpleDateFormat("dd/MM/yyyy").format(notificacion.getFecModifico()) : "");

            // jsonMap Nivel 2
            idCellJsonMap = new HashMap<String, Object>();
            idCellJsonMap.put("id", String.valueOf(counter));
            idCellJsonMap.put("cell", jsonNotificaciones);
            jsonMapNotificacion2.add(idCellJsonMap);
            counter++;
        }
        jsonMapNotificacion1.put("page", "1");
        jsonMapNotificacion1.put("total", 1);
        jsonMapNotificacion1.put("records", counter > 0 ? counter - 1 : 0);
        jsonMapNotificacion1.put("rows", (Object)jsonMapNotificacion2);
        
        return mapper.writeValueAsString(jsonMapNotificacion1);
    }
    
    /** 
     * Oficina Virtual - Consulta Notificaciones - Metodo encargado de obtener el detalle de la notificacion con base en su id.
     * @author Oscar S.
     * @param model Model
     * @param idNotificacion Integer
     * @return String
     */
    @RequestMapping
    public String detalleNotificacion(Model model, @RequestParam("idNotificacion") Integer idNotificacion, @RequestParam("interior") String interior) {
        logger.debug("detalleNotificacion -> idNotificacion -> " + idNotificacion);
        
        // Datos del usuario
        String userName = super.security().getUserName();
        logger.debug("detalleNotificacion -> userName -> " + userName);
        
        // TODO: Solo pruebas
        //String rfcEmpleado = "VICL680810SG1";
        String rfcEmpleado = super.identity().get(userName).getRfc().toUpperCase();
        logger.debug("detalleNotificacion -> rfcEmpleado -> " + rfcEmpleado);
        
        // Detalle Notificacion
        CustomTnNotificacionDTO customTnNotificacionDTO = super.getService(NotificacionesService.class).getNotificacionEmpleado(idNotificacion, rfcEmpleado);
        
        // Inicializar objeto
        DetalleNotificacionDTO detalleNotificacionDTO = new DetalleNotificacionDTO();
        
        detalleNotificacionDTO.setIdNotificacion(customTnNotificacionDTO.getIdNotificacion());
        detalleNotificacionDTO.setDescTipoNotificacion(customTnNotificacionDTO.getDescTipoNotificacion() != null ? customTnNotificacionDTO.getDescTipoNotificacion() : "-");
        detalleNotificacionDTO.setFromRfcNotificacion(customTnNotificacionDTO.getFromRfcNotificacion() != null ? customTnNotificacionDTO.getFromRfcNotificacion() : "-");
        detalleNotificacionDTO.setToRfcNotificacion(customTnNotificacionDTO.getToRfcNotificacion() != null ? customTnNotificacionDTO.getToRfcNotificacion() : "-");
        detalleNotificacionDTO.setCcRfcNotificacion(customTnNotificacionDTO.getCcRfcNotificacion() != null ? customTnNotificacionDTO.getCcRfcNotificacion() : "-");
        detalleNotificacionDTO.setTituloNotificacion(customTnNotificacionDTO.getTituloNotificacion() != null ? customTnNotificacionDTO.getTituloNotificacion() : "-");
        detalleNotificacionDTO.setMsgNotificacion(customTnNotificacionDTO.getMsgNotificacion() != null ? customTnNotificacionDTO.getMsgNotificacion() : "-");
        detalleNotificacionDTO.setAdjuntoNotificacion(customTnNotificacionDTO.getAdjuntoNotificacion() != null ? customTnNotificacionDTO.getAdjuntoNotificacion() : "-");
        detalleNotificacionDTO.setUsuario(customTnNotificacionDTO.getUsuario() != null ? customTnNotificacionDTO.getUsuario() : "-");
        detalleNotificacionDTO.setFecModifico(customTnNotificacionDTO.getFecModifico());
        detalleNotificacionDTO.setDescSituacionNotificacion(customTnNotificacionDTO.getDescSituacionNotificacion() != null ? customTnNotificacionDTO.getDescSituacionNotificacion() : "-");
        
        if (interior.equals("home")) {
            detalleNotificacionDTO.setUrlRegresar("consultaNotificacionesHome");
        } else {
            detalleNotificacionDTO.setUrlRegresar("consultaNotificaciones");
        }
        model.addAttribute(detalleNotificacionDTO);
        return super.getViewName("detalleNotificacion");
    }
    
    /**
     * Descarga de documentos desde el filesystem del componente FSN-JCR
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
    
}
