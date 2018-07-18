package gob.shcp.sireh.control.spc.capcer;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import gob.shcp.fsn.control.AbstractController;
import gob.shcp.fsn.control.support.AnnotatedController;
import gob.shcp.jcr.node.FsnResource;
import gob.shcp.sireh.model.spc.ConsultaCursoDTO;
import gob.shcp.sireh.model.spc.ConsultaCursoEvaluarDTO;
import gob.shcp.sireh.model.spc.TnCapEvaluaCursoDTO;
import gob.shcp.sireh.model.spc.TnCapParticipanteDTO;
import gob.shcp.sireh.model.spc.registro.CustomParticipantesInscritosDTO;
import gob.shcp.sireh.model.spc.registro.CustomRegistroCursoDTO;
import gob.shcp.sireh.model.spc.seguimiento.CalificacionesDTO;
import gob.shcp.sireh.model.spc.seguimiento.CargarConstanciaDTO;
import gob.shcp.sireh.model.spc.seguimiento.ConsultaBitacoraDTO;
import gob.shcp.sireh.model.spc.seguimiento.EvaluacionReaccionDTO;
import gob.shcp.sireh.model.spc.seguimiento.EvaluarParticipanteDTO;
import gob.shcp.sireh.model.spc.seguimiento.TcCapSituacionParticipanteDTO;
import gob.shcp.sireh.service.expediente.TestJcrService;
import gob.shcp.sireh.service.spc.capcer.registro.RegistroCursoSPCService;
import gob.shcp.sireh.service.spc.capcer.seguimiento.SeguimientoCursoSPCService;

import java.io.IOException;
import java.io.PrintWriter;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


/**
 * Controlador encargado de atender solicitudes del modulo Seguimiento y Control
 */
@Controller
public class SeguimientoCursoSPCController extends AbstractController implements AnnotatedController {
    
    // Roles
    private static final String SECURITY_ROL_ADMIN = "AUTH_USERS";
    //private static final String SECURITY_ROL_ADMIN = "SIREH_ADMIN";
    private static final String SECURITY_ROL_ADM_CER = "SIREH_CAP_ADM_CER";
    private static final String SECURITY_ROL_ADM = "SIREH_CAP_ADM";
    private static final String SECURITY_ROL_OPER = "SIREH_CAP_OPERADOR";
    private static final String SECURITY_ROL_CORD = "SIREH_CAP_COORDINACION";
    private static final String SECURITY_ROL_EJE = "SIREH_CAP_EJECUTIVO";
    
    // Control
    private static final String EVALUAR_PARTICIPANTE = "EVALUAR_PARTICIPANTE";
    private static final String CARGAR_CONSTANCIAS = "CARGAR_CONSTANCIAS";
    private static final String EVALUACION_REACCION = "EVALUACION_REACCION";
    
    /**
     * Evaluar Participante - Consulta
     * @author Martin C.
     * @param model Model
     * @param consultaCursoDTO ConsultaCursoDTO
     * @return String
     */
    @RequestMapping
    public String consultaEvaluarParticipante(Model model, ConsultaCursoDTO consultaCursoDTO) {
        if (consultaCursoDTO.isCancel()) {
            consultaCursoDTO = new ConsultaCursoDTO();
        }
        consultaCursoDTO = navegacionEvaluarParticipante(consultaCursoDTO);
        model.addAttribute(consultaCursoDTO);
        return super.getViewName("consultaCurso");
    }

    /**
     * Evaluar Participante
     * @author Martin C.
     * @param model Model
     * @param evaluarParticipanteDTO EvaluarParticipanteDTO
     * @param idCurso String
     * @return String
     * @throws IOException, JsonGenerationException, JsonMappingException
     */
    @RequestMapping
    public String evaluarParticipante(Model model, EvaluarParticipanteDTO evaluarParticipanteDTO, @RequestParam("idCurso") String idCurso) throws IOException, JsonGenerationException, JsonMappingException {
        if (evaluarParticipanteDTO.isCancelar()) {
            evaluarParticipanteDTO = new EvaluarParticipanteDTO();
        }

        evaluarParticipanteDTO = super.getService(SeguimientoCursoSPCService.class).getEvaluarParticipante(new Integer(idCurso));

        if (evaluarParticipanteDTO == null) {
            super.saveWarning(model, "No se encontro informacion asociada a la peticion.");
            return consultaEvaluarParticipante(model, new ConsultaCursoDTO());
        } else {
            // Rol Administrador de Capacitacion
            if (super.security().isUserAuthorized(SECURITY_ROL_ADM)) {
                evaluarParticipanteDTO.setRolAdministradorCapacitacion(true);
            } else {
                evaluarParticipanteDTO.setRolAdministradorCapacitacion(false);
            }

            // Rol Operador de Capacitacion
            if (super.security().isUserAuthorized(SECURITY_ROL_OPER)) {
                evaluarParticipanteDTO.setRolOperadorCapacitacion(true);
            } else {
                evaluarParticipanteDTO.setRolOperadorCapacitacion(false);
            }
            evaluarParticipanteDTO.setUrlOrigen("consultaEvaluarParticipante.do");
            evaluarParticipanteDTO.setUrlDestino("saveEvaluarParticipante.do");
            evaluarParticipanteDTO.setUrlValidar("validarEvaluarParticipante.do");
            evaluarParticipanteDTO.setBeanName("consultaCurso-asignarParticipante");
            evaluarParticipanteDTO.setMuestraRegistros(true);
            evaluarParticipanteDTO.setIdCurso(new Integer(idCurso));
            evaluarParticipanteDTO.setIdCurso(new Integer(idCurso));
        }

        model.addAttribute(evaluarParticipanteDTO);
        return super.getViewName("evaluarParticipante");
    }

    /**
     * Evaluar Participante - Guardar
     * @author Martin C.
     * @param model Model
     * @param evaluarParticipanteDTO EvaluarParticipanteDTO
     * @return String
     */
    @RequestMapping
    public String saveEvaluarParticipante(Model model, EvaluarParticipanteDTO evaluarParticipanteDTO) {
        List<CalificacionesDTO> lCalificacionesDTO = new ArrayList<CalificacionesDTO>();
        ObjectMapper objectMapper = new ObjectMapper();

        try {
            lCalificacionesDTO = (List<CalificacionesDTO>)objectMapper.readValue(evaluarParticipanteDTO.getPostData(), objectMapper.getTypeFactory().constructCollectionType(List.class, CalificacionesDTO.class));
        } catch (JsonParseException e) {
            e.printStackTrace();
            lCalificacionesDTO = null;
            super.saveError(model, "error: ObjectMapper lanzo una excepcion del tipo JsonParseException, " + "en SeguimientoCursoSPCController.saveEvaluarParticipante.");
        } catch (JsonMappingException e) {
            e.printStackTrace();
            lCalificacionesDTO = null;
            super.saveError(model, "error: ObjectMapper lanzo una excepcion del tipo JsonMappingException, " + "en SeguimientoCursoSPCController.saveEvaluarParticipante.");
        } catch (IOException e) {
            e.printStackTrace();
            lCalificacionesDTO = null;
            super.saveError(model, "error: ObjectMapper lanzo una excepcion del tipo IOException, " + "en SeguimientoCursoSPCController.saveEvaluarParticipante.");
        }

        // Actualiza calificaciones
        if (lCalificacionesDTO != null) {
            if (lCalificacionesDTO.size() > 0) {
                super.getService(SeguimientoCursoSPCService.class).saveEvaluarParticipante(evaluarParticipanteDTO.getIdCurso(), lCalificacionesDTO);
                super.saveMessage(model, "Las calificaciones fueron guardadas exitosamente.");
            } else {
                super.saveError(model, "ERROR: Hubo un prblema al guardar las calificaciones.");
            }
        } else {
            super.saveError(model, "ERROR: No se encontro informacion asociada a la peticion.");
        }

        evaluarParticipanteDTO.setJsonDataString(evaluarParticipanteDTO.getPostData());
        model.addAttribute(evaluarParticipanteDTO);
        return super.getViewName("evaluarParticipante");
    }

    /**
     * Evaluar Participante - Validar
     * @author Martin C.
     * @param model Model
     * @return String
     */
    @RequestMapping
    public String validarEvaluarParticipante(Model model) {
        return super.getViewName("consultaEvaluarParticipante");
    }

    /**
     * Evaluar Participante - Guardar
     * @author Martin C.
     * @param response HttpServletResponse
     * @throws IOException
     */
    @RequestMapping
    public void jsonCallbackEstatusEvaluacionParticipante(HttpServletResponse response) throws IOException {
        List<TcCapSituacionParticipanteDTO> lTcCapSituacionParticipanteDTO;

        StringBuffer sb = new StringBuffer();
        sb.append("<select name='estatus' id='estatus'>");
        sb.append("<option value='' selected='selected'>Seleccione...</option>");

        lTcCapSituacionParticipanteDTO = super.getService(SeguimientoCursoSPCService.class).getEstatusEvaluacionParticipante();

        for (TcCapSituacionParticipanteDTO estatus: lTcCapSituacionParticipanteDTO) {
            sb.append("<option value= '" + estatus.getIdSituacionParticipante() + "'>" + estatus.getDescSituacionParticipante() + "</option>");
        }
        sb.append("</select>");

        // Cadena JSON
        String jsonDataStringStatus = sb.toString();
        response.setContentType("text/plain");
        PrintWriter out = response.getWriter();
        out.print(jsonDataStringStatus);
    }

    /**
     * Evaluar participante - Navegacion EvaluarParticipante
     * @author Martin C.
     * @param consultaCursoDTO ConsultaCursoDTO
     * @return consultaCursoDTO ConsultaCursoDTO
     */
    private ConsultaCursoDTO navegacionEvaluarParticipante(ConsultaCursoDTO consultaCursoDTO) {
        // Interior 
        consultaCursoDTO.setInterior("Evaluar Participante");
        consultaCursoDTO.setControl(EVALUAR_PARTICIPANTE);
        // Navegacion
        consultaCursoDTO.setUrlOrigen("consultaEvaluarParticipante");
        consultaCursoDTO.setUrlDestino("consultaEvaluarParticipante");
        consultaCursoDTO.setUrlRegistroCurso("registrarCurso");
        consultaCursoDTO.setUrlDeleteRegistroCurso("deleteRegistroCurso");
        consultaCursoDTO.setLinkDestino("evaluarParticipante.do");
        consultaCursoDTO.setParamIdDestino("idCurso");
        consultaCursoDTO.setPropertyDestino("idCursos");

        // PagedList
        consultaCursoDTO.setBeanName("consultaCurso-asignarParticipante");

        // Obtener roles
        List roles = super.security().getRoles();
        for (Object rol: roles) {
            logger.debug("navegacionRegistroCurso -> Roles ---------->" + (String)rol);
        }

        // Rol Administrador de Capacitacion
        if (super.security().isUserAuthorized(SECURITY_ROL_ADM)) {
            consultaCursoDTO.setRolAdministradorCapacitacion(true);
        } else {
            consultaCursoDTO.setRolAdministradorCapacitacion(false);
        }

        // Rol Operador de Capacitacion
        if (super.security().isUserAuthorized(SECURITY_ROL_OPER)) {
            consultaCursoDTO.setRolOperadorCapacitacion(true);
        } else {
            consultaCursoDTO.setRolOperadorCapacitacion(false);
        }

        // Filtros tipo de curso
        List<String> estatusCursos = new ArrayList<String>();
        estatusCursos.add("CON");
        consultaCursoDTO.setEstatusCursos(estatusCursos);

        return consultaCursoDTO;
    }

    /******************************************************************************************************************************************************************************/

     /** Prepara la pantalla de busqueda de evaluacion de reaccion
     * @author Gualberto G.
     * @param model
     * @param consultaCursoDTO
     * @return String
     */
    @RequestMapping
    public String consultaEvaluacionReaccion(Model model, ConsultaCursoDTO consultaCursoDTO) {
        // Limpiar objeto
        if (consultaCursoDTO.isCancel()) {
            consultaCursoDTO = new ConsultaCursoDTO();
        } else if (!consultaCursoDTO.isMuestraRegistros()) {
            consultaCursoDTO = new ConsultaCursoDTO();
        }
        
        // Parametros iniciales
        navegacionEvaluacionReaccion(consultaCursoDTO);
        model.addAttribute(consultaCursoDTO);
        return super.getViewName("consultaCurso");
    }
    
     /** Prepara un objeto con la confiuracion de la navegacion de la pantalla de busqueda de evaluacion de reaccion
     * @author Gualberto G.
     * @param consultaCursoDTO
     */
    private void navegacionEvaluacionReaccion(ConsultaCursoDTO consultaCursoDTO) {
        // Interior 
        consultaCursoDTO.setInterior("Evaluar curso");
        consultaCursoDTO.setControl(EVALUACION_REACCION);

        // Navegacion
        consultaCursoDTO.setUrlOrigen("consultaEvaluacionReaccion");
        consultaCursoDTO.setUrlDestino("consultaEvaluacionReaccion");
        consultaCursoDTO.setLinkDestino("evaluacionReaccion.do");
        consultaCursoDTO.setParamIdDestino("idCurso");
        consultaCursoDTO.setPropertyDestino("idCursos");

        // PagedList
        consultaCursoDTO.setBeanName("consultaCursosEvaluar-evaluacionReaccion");

        // Obtener roles
        List roles = super.security().getRoles();
        for (Object rol: roles) {
            logger.debug("navegacionRegistroCurso -> Roles ---------->" + (String)rol);
        }

        // Rol Administrador de Capacitacion
         consultaCursoDTO.setRolAdministradorCapacitacion(super.security().isUserAuthorized(SECURITY_ROL_ADM));

        // Rol Operador de Capacitacion
         consultaCursoDTO.setRolOperadorCapacitacion(super.security().isUserAuthorized(SECURITY_ROL_OPER));

        // Filtros tipo de curso
        List<String> estatusCursos = new ArrayList<String>();
        estatusCursos.add("CUR");
        estatusCursos.add("EVP");
        estatusCursos.add("EVR");
        consultaCursoDTO.setEstatusCursos(estatusCursos);
    }
    


    
    
    /**
     * Metodo que muestra la pantalla de evaluacion de reaccion para un curso especifico
     * @author Gualberto G.
     * @param model Model
     * @param idCurso String 
     * @return String
     */
    @RequestMapping
    public String evaluacionReaccion(Model model, @RequestParam("idCurso") String idCurso) {
        
         List<CustomParticipantesInscritosDTO> listaParticipantesInscritosDTO = super.getService(SeguimientoCursoSPCService.class).getParticipantesInscritosEvaluacionReacion(Integer.valueOf(super.security().getOperationYear()), Integer.valueOf(idCurso));
         // Pregunto si ya se ha guardado algún promedio
        TnCapEvaluaCursoDTO tnCapEvaluacionCursoDTO = super.getService(SeguimientoCursoSPCService.class).getEvaluacionCurso(Integer.valueOf( idCurso));

        Integer cursoParticipantes = listaParticipantesInscritosDTO != null && !listaParticipantesInscritosDTO.isEmpty() ? listaParticipantesInscritosDTO.size() : 0;
        CustomRegistroCursoDTO customRegistroCursoDTO = super.getService(RegistroCursoSPCService.class).getCursoRegistro(Integer.valueOf(idCurso));
        EvaluacionReaccionDTO evaluacionReaccionDTO = super.transformation().map(customRegistroCursoDTO, EvaluacionReaccionDTO.class);
        evaluacionReaccionDTO.setCursoParticipantes(cursoParticipantes);
        
        // Obtener roles
        List roles = super.security().getRoles();
        for (Object rol: roles) {
            logger.debug("asignarParticipante -> Roles ---------->" + (String)rol);
        }
        // Rol Operador de Capacitación
        evaluacionReaccionDTO.setRolOperadorCapacitacion(super.security().isUserAuthorized(SECURITY_ROL_OPER));
        // Rol Administrador de Capacitacion
        evaluacionReaccionDTO.setRolAdministradorCapacitacion(super.security().isUserAuthorized(SECURITY_ROL_ADM));

        // urls
        evaluacionReaccionDTO.setUrlSaveEvaluacionCurso("saveEvaluacionReaccion");
        evaluacionReaccionDTO.setUrlValidateEvaluacionCurso("validarEvaluacionReaccion");
        evaluacionReaccionDTO.setUrlCancelEvaluacionCurso("cancelEvaluacionReaccion");
        evaluacionReaccionDTO.setUrlTerminarCaptura("terminarCaptura.do");
        
        // Botones
        evaluacionReaccionDTO.setShowEditarCampos(customRegistroCursoDTO != null && !customRegistroCursoDTO.getIdControlCurso().equals("EVR"));
        evaluacionReaccionDTO.setShowTerminarCaptura(customRegistroCursoDTO != null && !customRegistroCursoDTO.getIdControlCurso().equals("EVR"));
        evaluacionReaccionDTO.setShowGuardar(customRegistroCursoDTO != null && !customRegistroCursoDTO.getIdControlCurso().equals("EVR") );
        evaluacionReaccionDTO.setShowValidar(tnCapEvaluacionCursoDTO != null);
        model.addAttribute(evaluacionReaccionDTO);
        return super.getViewName("evaluacionReaccion");
    }


    /**
     * Genera un String con los valores a presentar en el grid para un curso especifico
     * @param idCurso
     * @param response
     * @throws IOException
     */
    @RequestMapping
    public void jsonCallbackEvaluacionesReaccion(@RequestParam("idCurso") Integer idCurso, HttpServletResponse response) throws IOException {
        // Cadena JSON
         List<CustomParticipantesInscritosDTO> listaParticipantesInscritosDTO = super.getService(SeguimientoCursoSPCService.class).getParticipantesInscritosEvaluacionReacion(Integer.valueOf(super.security().getOperationYear()), Integer.valueOf(idCurso));
         
        Integer cursoParticipantes = listaParticipantesInscritosDTO != null && !listaParticipantesInscritosDTO.isEmpty() ? listaParticipantesInscritosDTO.size() : 0;
        
        TnCapEvaluaCursoDTO tnCapEvaluacionCursoDTO = super.getService(SeguimientoCursoSPCService.class).getEvaluacionCurso(idCurso);

        // Genera cadena JSON
        String jsonDataString = generateJSONStringEvaluacionesReaccion(tnCapEvaluacionCursoDTO,cursoParticipantes);
        response.setContentType("text/plain");
        PrintWriter out = response.getWriter();
        out.print(jsonDataString);
    }
    
    /**
     * Obtiene el json con los valores a presentar en el grid
     * @param tnCapEvaluacionCursoDTO
     * @param cursoParticipantes
     * @return String
     * @throws IOException
     * @throws JsonGenerationException
     * @throws JsonMappingException
     */
    @SuppressWarnings("unchecked")
    private String generateJSONStringEvaluacionesReaccion(TnCapEvaluaCursoDTO tnCapEvaluacionCursoDTO, Integer cursoParticipantes) throws IOException, JsonGenerationException, JsonMappingException {

        ObjectMapper mapper = new ObjectMapper();

        // jsonMap Nivel 1
        HashMap<String, Object> jsonMapEvaluacionReaccion = new HashMap<String, Object>();

        // jsonMap Nivel 2
        List jsonMapEvaluacionReaccion2 = new ArrayList();
        HashMap<String, Object> idCellJsonMap;

        // jsonMap Nivel 3
        HashMap<String, Object> jsonEvaluacion;

        int counter = 1;
        for (int i = 0; i < cursoParticipantes + 2; i++) {
            jsonEvaluacion = new HashMap<String, Object>();
            if (i <= cursoParticipantes) {
                if (i < cursoParticipantes) {
                    jsonEvaluacion.put("participante", "" + (i + 1));
                }
                if (i == cursoParticipantes) {
                    jsonEvaluacion.put("participante", "Total");
                }
                jsonEvaluacion.put("pregunta1", "0");
                jsonEvaluacion.put("pregunta2", "0");
                jsonEvaluacion.put("pregunta3", "0");
                jsonEvaluacion.put("pregunta4", "0");
                jsonEvaluacion.put("pregunta5", "0");
                jsonEvaluacion.put("pregunta6", "0");
                jsonEvaluacion.put("pregunta7", "0");
                jsonEvaluacion.put("pregunta8", "0");
                jsonEvaluacion.put("pregunta9", "0");
                jsonEvaluacion.put("pregunta10", "0");
            }
            if (i == cursoParticipantes + 1) {
                jsonEvaluacion.put("participante", "Promedio");
                jsonEvaluacion.put("pregunta1", 
                                   tnCapEvaluacionCursoDTO != null && 
                                   tnCapEvaluacionCursoDTO.getEvaluacionCursoP1() != 
                                   null ? 
                                   tnCapEvaluacionCursoDTO.getEvaluacionCursoP1().toString() : 
                                   "0");
                jsonEvaluacion.put("pregunta2", 
                                   tnCapEvaluacionCursoDTO != null && 
                                   tnCapEvaluacionCursoDTO.getEvaluacionCursoP2() != 
                                   null ? 
                                   tnCapEvaluacionCursoDTO.getEvaluacionCursoP2().toString() : 
                                   "0");
                jsonEvaluacion.put("pregunta3", 
                                   tnCapEvaluacionCursoDTO != null && 
                                   tnCapEvaluacionCursoDTO.getEvaluacionCursoP3() != 
                                   null ? 
                                   tnCapEvaluacionCursoDTO.getEvaluacionCursoP3().toString() : 
                                   "0");
                jsonEvaluacion.put("pregunta4", 
                                   tnCapEvaluacionCursoDTO != null && 
                                   tnCapEvaluacionCursoDTO.getEvaluacionCursoP4() != 
                                   null ? 
                                   tnCapEvaluacionCursoDTO.getEvaluacionCursoP4().toString() : 
                                   "0");
                jsonEvaluacion.put("pregunta5", 
                                   tnCapEvaluacionCursoDTO != null && 
                                   tnCapEvaluacionCursoDTO.getEvaluacionCursoP5() != 
                                   null ? 
                                   tnCapEvaluacionCursoDTO.getEvaluacionCursoP5().toString() : 
                                   "0");
                jsonEvaluacion.put("pregunta6", 
                                   tnCapEvaluacionCursoDTO != null && 
                                   tnCapEvaluacionCursoDTO.getEvaluacionCursoP6() != 
                                   null ? 
                                   tnCapEvaluacionCursoDTO.getEvaluacionCursoP6().toString() : 
                                   "0");
                jsonEvaluacion.put("pregunta7", 
                                   tnCapEvaluacionCursoDTO != null && 
                                   tnCapEvaluacionCursoDTO.getEvaluacionCursoP7() != 
                                   null ? 
                                   tnCapEvaluacionCursoDTO.getEvaluacionCursoP7().toString() : 
                                   "0");
                jsonEvaluacion.put("pregunta8", 
                                   tnCapEvaluacionCursoDTO != null && 
                                   tnCapEvaluacionCursoDTO.getEvaluacionCursoP8() != 
                                   null ? 
                                   tnCapEvaluacionCursoDTO.getEvaluacionCursoP8().toString() : 
                                   "0");
                jsonEvaluacion.put("pregunta9", 
                                   tnCapEvaluacionCursoDTO != null && 
                                   tnCapEvaluacionCursoDTO.getEvaluacionCursoP9() != 
                                   null ? 
                                   tnCapEvaluacionCursoDTO.getEvaluacionCursoP9().toString() : 
                                   "0");
                jsonEvaluacion.put("pregunta10", 
                                   tnCapEvaluacionCursoDTO != null && 
                                   tnCapEvaluacionCursoDTO.getEvaluacionCursoP10() != 
                                   null ? 
                                   tnCapEvaluacionCursoDTO.getEvaluacionCursoP10().toString() : 
                                   "0");
            }
            // jsonMap Nivel 2
            idCellJsonMap = new HashMap<String, Object>();
            idCellJsonMap.put("id", String.valueOf(counter));
            idCellJsonMap.put("cell", jsonEvaluacion);
            jsonMapEvaluacionReaccion2.add(idCellJsonMap);
            counter++;
        }
        jsonMapEvaluacionReaccion.put("page", "1");
        jsonMapEvaluacionReaccion.put("total", 1);
        jsonMapEvaluacionReaccion.put("records", counter > 0 ? counter - 1 : 0);
        jsonMapEvaluacionReaccion.put("rows", jsonMapEvaluacionReaccion2);

        return mapper.writeValueAsString(jsonMapEvaluacionReaccion);
    }
    
    /**
     * Guarda los valores introducidos correspondientes a la evaluacion de reaccion del curso
     * @author Gualberto G.
     * @param model Model
     * @return String
     */
    @RequestMapping
    public String saveEvaluacionReaccion(Model model, EvaluacionReaccionDTO evaluacionReaccionDTO) {
            
        List<EvaluacionCursoJson> listaEvaluacionCursoJson = new ArrayList<EvaluacionCursoJson>();
        ObjectMapper mapper = new ObjectMapper();


        try {
            listaEvaluacionCursoJson = 
                    (List<EvaluacionCursoJson>)mapper.readValue(evaluacionReaccionDTO.getPostDataEvaluacionCurso(), mapper.getTypeFactory().constructCollectionType(List.class, EvaluacionCursoJson.class));
        } catch (JsonParseException e) {
            logger.debug("enviarNotificaciones -> JsonParseException ->" + e.toString());
        } catch (JsonMappingException e) {
            logger.debug("enviarNotificaciones -> JsonMappingException ->" + e.toString());
        } catch (IOException e) {
            logger.debug("enviarNotificaciones -> IOException ->" + e.toString());
        }
        
        TnCapEvaluaCursoDTO tnCapEvaluacionCursoDTO = super.getService(SeguimientoCursoSPCService.class).getEvaluacionCurso(evaluacionReaccionDTO.getIdCurso());
        if(tnCapEvaluacionCursoDTO == null){
            tnCapEvaluacionCursoDTO = new TnCapEvaluaCursoDTO();
            tnCapEvaluacionCursoDTO.setIdCurso(evaluacionReaccionDTO.getIdCurso());
        }
        
        for (EvaluacionCursoJson evaluacionCursoJson : listaEvaluacionCursoJson) {
            
            if (evaluacionCursoJson.getParticipante() != null && evaluacionCursoJson.getParticipante().equals("Promedio")){

                if (evaluacionCursoJson != null && Float.valueOf(evaluacionCursoJson.getPregunta1()).intValue() == 0 && 
                    Float.valueOf(evaluacionCursoJson.getPregunta2()).intValue() == 0 && 
                    Float.valueOf(evaluacionCursoJson.getPregunta3()).intValue() == 0 && 
                    Float.valueOf(evaluacionCursoJson.getPregunta4()).intValue() == 0 && 
                    Float.valueOf(evaluacionCursoJson.getPregunta5()).intValue() == 0 && 
                    Float.valueOf(evaluacionCursoJson.getPregunta6()).intValue() == 0 && 
                    Float.valueOf(evaluacionCursoJson.getPregunta7()).intValue() == 0 && 
                    Float.valueOf(evaluacionCursoJson.getPregunta8()).intValue() == 0 && 
                    Float.valueOf(evaluacionCursoJson.getPregunta9()).intValue() == 0 && 
                    Float.valueOf(evaluacionCursoJson.getPregunta10()).intValue() == 0){
                        super.saveMessage(model, "sireh.label.spc.capcer.seguimientoycontrol.saveEvaluacionCurso.ceros");
                        return consultaEvaluacionReaccion(model, new ConsultaCursoEvaluarDTO());
                    }
                tnCapEvaluacionCursoDTO.setEvaluacionCursoP1(evaluacionCursoJson != null ? Float.valueOf(evaluacionCursoJson.getPregunta1() ): Float.valueOf(0));
                tnCapEvaluacionCursoDTO.setEvaluacionCursoP2(evaluacionCursoJson != null ? Float.valueOf(evaluacionCursoJson.getPregunta2() ): Float.valueOf(0));
                tnCapEvaluacionCursoDTO.setEvaluacionCursoP3(evaluacionCursoJson != null ? Float.valueOf(evaluacionCursoJson.getPregunta3() ): Float.valueOf(0));
                tnCapEvaluacionCursoDTO.setEvaluacionCursoP4(evaluacionCursoJson != null ? Float.valueOf(evaluacionCursoJson.getPregunta4() ): Float.valueOf(0));
                tnCapEvaluacionCursoDTO.setEvaluacionCursoP5(evaluacionCursoJson != null ? Float.valueOf(evaluacionCursoJson.getPregunta5()): Float.valueOf(0));
                tnCapEvaluacionCursoDTO.setEvaluacionCursoP6(evaluacionCursoJson != null ? Float.valueOf(evaluacionCursoJson.getPregunta6() ): Float.valueOf(0));
                tnCapEvaluacionCursoDTO.setEvaluacionCursoP7(evaluacionCursoJson != null ? Float.valueOf(evaluacionCursoJson.getPregunta7()): Float.valueOf(0));
                tnCapEvaluacionCursoDTO.setEvaluacionCursoP8(evaluacionCursoJson != null ? Float.valueOf(evaluacionCursoJson.getPregunta8()): Float.valueOf(0));
                tnCapEvaluacionCursoDTO.setEvaluacionCursoP9(evaluacionCursoJson != null ? Float.valueOf(evaluacionCursoJson.getPregunta9() ): Float.valueOf(0));
                tnCapEvaluacionCursoDTO.setEvaluacionCursoP10(evaluacionCursoJson != null ? Float.valueOf(evaluacionCursoJson.getPregunta10() ): Float.valueOf(0));
                tnCapEvaluacionCursoDTO.setUsuario(super.security().getUserName() );
                tnCapEvaluacionCursoDTO.setFecModifico(new Date());
            }
        }
        
        super.getService(SeguimientoCursoSPCService.class).saveTnCapEvaluacionCurso(tnCapEvaluacionCursoDTO);
        super.saveMessage(model, "sireh.label.spc.capcer.seguimientoycontrol.saveEvaluacionCurso.ok");
        return consultaEvaluacionReaccion(model, new ConsultaCursoEvaluarDTO());
    }
    
    

    /**
     * Ejecuta la validacion de la evaluacion de reaccion de un curso
     * @author Gualberto G
     * @param model Model
     * @return String
     */
    @RequestMapping
    public String validarEvaluacionReaccion(Model model, EvaluacionReaccionDTO evaluacionReaccionDTO) {
        super.getService(SeguimientoCursoSPCService.class).saveValidarEvaluacionCurso(evaluacionReaccionDTO.getIdCurso());
        super.saveMessage(model, "sireh.label.spc.capcer.seguimientoycontrol.validaEvaluacionCurso.ok");
        return consultaEvaluacionReaccion(model, new ConsultaCursoEvaluarDTO());
    }

    /**
     * Ejecuta el boton cancelar de la pantalla de evaluacion de reaccion
     * @param model
     * @param evaluacionReaccionDTO EvaluacionReaccionDTO
     * @return String
     */
    @RequestMapping
    public String cancelEvaluacionReaccion(Model model, EvaluacionReaccionDTO evaluacionReaccionDTO){
        return consultaEvaluacionReaccion(model, new ConsultaCursoEvaluarDTO());
    }

    /******************************************************************************************************************************************************************************/

    /**
     * Cargar Constancia - Consulta
     * @author Martin C.
     * @param model Model
     * @param consultaCursoDTO ConsultaCursoDTO
     * @return String
     */
    @RequestMapping
    public String consultaCargarConstancia(Model model, ConsultaCursoDTO consultaCursoDTO) {
        if (consultaCursoDTO.isCancel()) {
            consultaCursoDTO = new ConsultaCursoDTO();
        }
        consultaCursoDTO = navegacionCargarConstancia(consultaCursoDTO);
        model.addAttribute(consultaCursoDTO);
        return super.getViewName("consultaCurso");
    }

    /**
     * Cargar Constancia
     * @author Martin C.
     * @param model Model
     * @param cargarConstanciaDTO CargarConstanciaDTO
     * @param idCurso String
     * @return String
     */
    @RequestMapping
    public String cargarConstancia(Model model, CargarConstanciaDTO cargarConstanciaDTO, @RequestParam("idCurso") String idCurso) {
        if (cargarConstanciaDTO.isCancelar()) {
            cargarConstanciaDTO = new CargarConstanciaDTO();
        }

        cargarConstanciaDTO = super.getService(SeguimientoCursoSPCService.class).cargarConstancia(idCurso);
        
        if (cargarConstanciaDTO == null) {
            super.saveWarning(model, "No se encontro informacion asociada a la peticion.");
            return consultaCargarConstancia(model, new ConsultaCursoDTO());
        } else {
            // Rol Administrador de Capacitacion
            if (super.security().isUserAuthorized(SECURITY_ROL_ADM)) {
                cargarConstanciaDTO.setRolAdministradorCapacitacion(true);
            } else {
                cargarConstanciaDTO.setRolAdministradorCapacitacion(false);
            }

            // Rol Operador de Capacitacion
            if (super.security().isUserAuthorized(SECURITY_ROL_OPER)) {
                cargarConstanciaDTO.setRolOperadorCapacitacion(true);
            } else {
                cargarConstanciaDTO.setRolOperadorCapacitacion(false);
            }
            cargarConstanciaDTO.setUrlOrigen("consultaCargarConstancia.do");
            cargarConstanciaDTO.setUrlDestino("saveCargarConstancia.do");
            cargarConstanciaDTO.setUrlBorrar("deleteCargarConstancia.do");
            cargarConstanciaDTO.setBeanName("spc:Capacitacion-seguimiento-constancias-pageList");
            cargarConstanciaDTO.setMuestraRegistros(true);
            cargarConstanciaDTO.setIdCurso(new Integer(idCurso));
        }
        model.addAttribute(cargarConstanciaDTO);
        return super.getViewName("cargarConstancia");
    }

    /**
     * Cargar Constancia - Guardar
     * @author Martin C.
     * @param model Model
     * @param cargarConstanciaDTO CargarConstanciaDTO
     * @return String
     */
    @RequestMapping
    public String saveCargarConstancia(Model model, CargarConstanciaDTO cargarConstanciaDTO) {
        String[] datosConstanciaRfc = null;
        String idCurso = null;
        String rfcEmpleado = null;
        String participanteAcuse = null;
        String participanteAcuseFirmado = null;

        if ((cargarConstanciaDTO.getTipoDocumento() == null) || (cargarConstanciaDTO.getDocGrupo() == null) || 
            (cargarConstanciaDTO.getDocumentoSoporte().isEmpty())) {
            if (cargarConstanciaDTO.getTipoDocumento() == null) {
                super.saveError(model, "Seleccione el tipo de documento que desea agregar.");
            }
            if (cargarConstanciaDTO.getDocGrupo() == null) {
                super.saveError(model, "Seleccione un participante de la lista.");
            }
            if (cargarConstanciaDTO.getDocumentoSoporte().isEmpty()) {
                super.saveError(model, "Seleccione el archivo que sera agregado.");
            }
        } else {
            try {
                datosConstanciaRfc = cargarConstanciaDTO.getDocGrupo();
                String constanciaRfc = datosConstanciaRfc[0];
                
                if (constanciaRfc != null && !constanciaRfc.equals("")) {
                    String[] result = constanciaRfc.split("\\|");
                    idCurso = result[0];
                    rfcEmpleado = result[1];
                    participanteAcuseFirmado = result[2]; // Constancia
                    participanteAcuse = result[3]; // Acuse
                }

                String idFile = null;
                cargarConstanciaDTO.setName(cargarConstanciaDTO.getDocumentoSoporte().getOriginalFilename());
                cargarConstanciaDTO.setData(cargarConstanciaDTO.getDocumentoSoporte().getInputStream());
                cargarConstanciaDTO.setRfcMeta(rfcEmpleado);
                //cargarConstanciaDTO.setDocMeta("CRRFC");// esto que?
                cargarConstanciaDTO.setDocMeta(cargarConstanciaDTO.getTipoDocumento());
                cargarConstanciaDTO.setDescripcion(rfcEmpleado + " - comprobante del curso");

                idFile = super.getService(SeguimientoCursoSPCService.class).saveFileCargarConstancia(cargarConstanciaDTO, cargarConstanciaDTO.isRollback());

                TnCapParticipanteDTO tnCapParticipanteDTO = new TnCapParticipanteDTO();
                tnCapParticipanteDTO.setIdCurso(new Integer(idCurso));
                tnCapParticipanteDTO.setRfcEmpleado(rfcEmpleado);

                if (cargarConstanciaDTO.getTipoDocumento().equalsIgnoreCase("C")) {
                    tnCapParticipanteDTO.setParticipanteAcuseFirmado(idFile);
                    tnCapParticipanteDTO.setParticipanteAcuse(null);
                } else if (cargarConstanciaDTO.getTipoDocumento().equalsIgnoreCase("A")) {
                    tnCapParticipanteDTO.setParticipanteAcuse(idFile);
                    tnCapParticipanteDTO.setParticipanteAcuseFirmado(null);
                }

                tnCapParticipanteDTO.setUsuario(super.security().getUserName());
                tnCapParticipanteDTO.setFecModifico(new Date());
                super.getService(SeguimientoCursoSPCService.class).saveCargarConstancia(tnCapParticipanteDTO);

                cargarConstanciaDTO.setUrlOrigen("consultaCargarConstancia.do");
                cargarConstanciaDTO.setUrlDestino("saveCargarConstancia.do");
                cargarConstanciaDTO.setUrlBorrar("deleteCargarConstancia.do");
                cargarConstanciaDTO.setBeanName("spc:Capacitacion-seguimiento-constancias-pageList");
                cargarConstanciaDTO.setIdCurso(new Integer(idCurso));
                String mensaje = "";
                
                if (cargarConstanciaDTO.getTipoDocumento().equalsIgnoreCase("C")) {
                    mensaje = " de la constancia ha sido ejecutado correctamente. Archivo con id: " + idFile;
                } else {
                    mensaje = " del acuse ha sido ejecutado correctamente. Archivo con id: " + idFile;
                }

                super.saveMessage(model, "El proceso de alta  " + mensaje);
            } catch (Exception e) {
                logger.debug("Exception --------->" + e.toString());
                e.printStackTrace();
                String mensaje = "";
                if (cargarConstanciaDTO.getTipoDocumento().equalsIgnoreCase("C")) {
                    mensaje = "de la constancia.";
                } else {
                    mensaje = "del acuse.";
                }
                super.saveError(model, "Erro en el proceso de alta " + mensaje);
            }
        }

        model.addAttribute(cargarConstanciaDTO);
        return super.getViewName("cargarConstancia");
    }

    /**
     * Cargar Constancia - Eliminar
     * @author Martin C.
     * @param model Model
     * @param cargarConstanciaDTO CargarConstanciaDTO
     * @return String
     */
    @RequestMapping
    public String deleteCargarConstancia(Model model, CargarConstanciaDTO cargarConstanciaDTO) {
        String[] datosConstanciaRfc = null;
        String idCurso = null;
        String rfcEmpleado = null;
        String participanteAcuse = null;
        String participanteAcuseFirmado = null;
        String tipoDocumento = null;

        if ((cargarConstanciaDTO.getTipoDocumento() == null) || (cargarConstanciaDTO.getDocGrupo() == null)) {
            if (cargarConstanciaDTO.getTipoDocumento() == null) {
                super.saveError(model, "Seleccione el tipo de documento que desea eliminar.");
            }
            if (cargarConstanciaDTO.getDocGrupo() == null) {
                super.saveError(model, "Seleccione un participante de la lista.");
            }
        } else {
            try {
                datosConstanciaRfc = cargarConstanciaDTO.getDocGrupo();
                String constanciaRfc = datosConstanciaRfc[0];
                if (constanciaRfc != null && !constanciaRfc.equals("")) {
                    String[] result = constanciaRfc.split("\\|");
                    idCurso = result[0];
                    rfcEmpleado = result[1];
                    participanteAcuseFirmado = result[2]; // Constancia
                    participanteAcuse = result[3]; // Acuse
                }

                tipoDocumento = cargarConstanciaDTO.getTipoDocumento();
                TnCapParticipanteDTO tnCapParticipanteDTO = new TnCapParticipanteDTO();

                if (tipoDocumento.equalsIgnoreCase("A")) {
                    if (participanteAcuse.equals(" ")) {
                        super.saveWarning(model, "Error: El acuse que intenta eliminar no existe, verifique e intente nuevamente.");
                    } else if (!participanteAcuse.equals(" ")) {
                        tnCapParticipanteDTO.setParticipanteAcuse(null);
                        super.getService(SeguimientoCursoSPCService.class).deleteFileCargarConstancia(participanteAcuse);
                    }
                } else if (tipoDocumento.equalsIgnoreCase("C")) {
                    if (participanteAcuseFirmado.equals(" ")) {
                        super.saveWarning(model, "Error: Esta intentando eliminar una constancia que no existe, verifique e intente nuevamente.");
                    } else if (!participanteAcuseFirmado.equals(" ")) {
                        tnCapParticipanteDTO.setParticipanteAcuseFirmado(null);
                        super.getService(SeguimientoCursoSPCService.class).deleteFileCargarConstancia(participanteAcuseFirmado);
                    }
                }

                tnCapParticipanteDTO.setIdCurso(new Integer(idCurso));
                tnCapParticipanteDTO.setRfcEmpleado(rfcEmpleado);
                tnCapParticipanteDTO.setUsuario(super.security().getUserName());
                tnCapParticipanteDTO.setFecModifico(new Date());
                super.getService(SeguimientoCursoSPCService.class).deleteCargarConstancia(tnCapParticipanteDTO, tipoDocumento);
                
                cargarConstanciaDTO.setUrlOrigen("consultaCargarConstancia.do");
                cargarConstanciaDTO.setUrlDestino("saveCargarConstancia.do");
                cargarConstanciaDTO.setUrlBorrar("deleteCargarConstancia.do");
                cargarConstanciaDTO.setBeanName("spc:Capacitacion-seguimiento-constancias-pageList");
                cargarConstanciaDTO.setIdCurso(new Integer(idCurso));
            } catch (Exception e) {
                logger.debug("Exception --------->" + e.toString());
                e.printStackTrace();
                String mensaje = "";
                
                if (tipoDocumento.toUpperCase().equalsIgnoreCase("C")) {
                    mensaje = "de la constancia.";
                } else {
                    mensaje = "del acuse.";
                }
                super.saveError(model, "Error en el proceso de baja " + mensaje);
                model.addAttribute(cargarConstanciaDTO);
                return super.getViewName("cargarConstancia");
            }
        }
        String mensaje = "";
        
        if (tipoDocumento.equalsIgnoreCase("C")) {
            mensaje = "la constancia, ha sido ejecutado correctamente. Archivo con id:  " + participanteAcuseFirmado;
        } else {
            mensaje = "el acuse, ha sido ejecutado correctamente. Archivo con id:  " + participanteAcuse;
        }
        super.saveMessage(model, "El proceso de baja de " + mensaje);
        model.addAttribute(cargarConstanciaDTO);
        return super.getViewName("cargarConstancia");
    }

    /**
     *  Navegacion Cargar Constancia
     * @author Martin C.
     * @param consultaCursoDTO ConsultaCursoDTO
     * @return consultaCursoDTO ConsultaCursoDTO
     */
    private ConsultaCursoDTO navegacionCargarConstancia(ConsultaCursoDTO consultaCursoDTO) {
        // Interior 
        consultaCursoDTO.setInterior("Cargar Constancias");
        consultaCursoDTO.setControl(CARGAR_CONSTANCIAS);

        // Navegacion
        consultaCursoDTO.setUrlOrigen("consultaCargarConstancia");
        consultaCursoDTO.setUrlDestino("consultaCargarConstancia");
        consultaCursoDTO.setUrlRegistroCurso("registrarCurso");
        consultaCursoDTO.setUrlDeleteRegistroCurso("deleteRegistroCurso");
        consultaCursoDTO.setLinkDestino("cargarConstancia.do");
        consultaCursoDTO.setParamIdDestino("idCurso");
        consultaCursoDTO.setPropertyDestino("idCursos");

        // PagedList
        consultaCursoDTO.setBeanName("consultaCurso-asignarParticipante");

        // Obtener roles
        List roles = super.security().getRoles();
        for (Object rol: roles) {
            logger.debug("navegacionRegistroCurso -> Roles ---------->" + (String)rol);
        }

        // Rol Administrador de Capacitacion
        if (super.security().isUserAuthorized(SECURITY_ROL_ADM)) {
            consultaCursoDTO.setRolAdministradorCapacitacion(true);
        } else {
            consultaCursoDTO.setRolAdministradorCapacitacion(false);
        }

        // Rol Operador de Capacitacion
        if (super.security().isUserAuthorized(SECURITY_ROL_OPER)) {
            consultaCursoDTO.setRolOperadorCapacitacion(true);
        } else {
            consultaCursoDTO.setRolOperadorCapacitacion(false);
        }

        // Filtros tipo de curso
        List<String> estatusCursos = new ArrayList<String>();
        estatusCursos.add("REG");
        estatusCursos.add("CAN");
        estatusCursos.add("PRO");
        estatusCursos.add("CON");
        consultaCursoDTO.setEstatusCursos(estatusCursos);
        
        return consultaCursoDTO;
    }

    /**
     * Descarga de documentos desde el filesystem del componenete FSN-JCR
     * @author Martin C.
     * @param uuid String
     * @param response HttpServletResponse
     * @return String
     * @throws IOException
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
    
    /******************************************************************************************************************************************************************************/

    /**
     * Bitácora - Consulta.
     * @author Oscar S.
     * @param model Model
     * @param consultaBitacoraDTO ConsultaBitacoraDTO
     * @return String
     */
    @RequestMapping
    public String consultaBitacora(Model model, ConsultaBitacoraDTO consultaBitacoraDTO) {
        // Limpiar objeto
        if (consultaBitacoraDTO.isCancel()) {
            consultaBitacoraDTO = new ConsultaBitacoraDTO();
        } else if (!consultaBitacoraDTO.isMuestraRegistros()) {
            consultaBitacoraDTO = new ConsultaBitacoraDTO();
        }

        // Navegacion
        consultaBitacoraDTO.setUrlOrigen("consultaBitacora");
        consultaBitacoraDTO.setUrlDestino("consultaBitacora");
        
        // PagedList
        if (consultaBitacoraDTO.getTipoBitacora() != null) {
            if (consultaBitacoraDTO.getTipoBitacora().equals("CURSO-PARTICIPANTE")) {
                consultaBitacoraDTO.setBeanName("consultaBitacora-cursoParticipante");

            } else if (consultaBitacoraDTO.getTipoBitacora().equals("CONTRATO-FACTURA")) {
                consultaBitacoraDTO.setBeanName("consultaBitacora-contratoFactura");

            } else {
                consultaBitacoraDTO.setBeanName("consultaBitacora-cursoInstructor");
            }
        }

        model.addAttribute(consultaBitacoraDTO);
        return super.getViewName("consultaBitacora");
    }
}
