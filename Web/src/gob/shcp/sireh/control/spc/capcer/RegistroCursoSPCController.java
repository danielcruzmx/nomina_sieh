package gob.shcp.sireh.control.spc.capcer;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import gob.shcp.fsn.control.AbstractController;
import gob.shcp.fsn.control.support.AnnotatedController;

import gob.shcp.sireh.model.plaza.TdPlazaDTO;
import gob.shcp.sireh.model.ItemDTO;
import gob.shcp.sireh.model.TcAtributoPuestoDTO;
import gob.shcp.sireh.model.nomina.TdEmpleadoDTO;

import gob.shcp.sireh.model.spc.ConsultaCursoDTO;
import gob.shcp.sireh.model.spc.TcCapAulaDTO;
import gob.shcp.sireh.model.spc.TcCapCursoPrincpDTO;
import gob.shcp.sireh.model.spc.TcCapNotifCursoDTO;
import gob.shcp.sireh.model.spc.TnCapBitacoraInstDTO;
import gob.shcp.sireh.model.spc.TnCapContratoCurDTO;
import gob.shcp.sireh.model.spc.TnCapCursoDTO;
import gob.shcp.sireh.model.spc.TnCapFacturaCursoDTO;
import gob.shcp.sireh.model.spc.TnCapParticipanteDTO;
import gob.shcp.sireh.model.spc.registro.AltaContratoDTO;
import gob.shcp.sireh.model.spc.registro.AsignarInstructorDTO;
import gob.shcp.sireh.model.spc.registro.AsignarParticipanteDTO;
import gob.shcp.sireh.model.spc.registro.ConsultaContratoDTO;
import gob.shcp.sireh.model.spc.registro.CustomAltaContratoDTO;
import gob.shcp.sireh.model.spc.registro.CustomCursosFacturasDTO;
import gob.shcp.sireh.model.spc.registro.CustomParticipantesCandidatosDTO;
import gob.shcp.sireh.model.spc.registro.CustomParticipantesInscritosDTO;
import gob.shcp.sireh.model.spc.registro.CustomRegistroCursoDTO;
import gob.shcp.sireh.model.spc.registro.CustomTnCapCalendarioCursoDTO;
import gob.shcp.sireh.model.spc.registro.RegistrarCursoDTO;
import gob.shcp.sireh.model.spc.registro.RegistroCalendarioDTO;

import gob.shcp.sireh.service.spc.capcer.registro.RegistroCursoSPCService;
import gob.shcp.sireh.service.spc.jms.CapcerJMSService;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;

import java.sql.Connection;
import java.sql.SQLException;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.UUID;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperRunManager;

import org.apache.commons.io.IOUtils;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Controlador encargado de atender solicitudes del modulo Registro.
 */
@Controller
public class RegistroCursoSPCController extends AbstractController implements AnnotatedController {

    // Roles
    private static final String SECURITY_ROL_ADMIN = "AUTH_USERS";
    private static final String SECURITY_ROL_ADM_CER = "SIREH_CAP_ADM_CER";
    private static final String SECURITY_ROL_ADM = "SIREH_CAP_ADM";
    private static final String SECURITY_ROL_OPER = "SIREH_CAP_OPERADOR";
    private static final String SECURITY_ROL_CORD = "SIREH_CAP_COORDINACION";
    private static final String SECURITY_ROL_EJE = "SIREH_CAP_EJECUTIVO";
    
    // Control
    private static final String REGISTRAR_CURSO = "REG_CURSO";
    private static final String ASIGNAR_CALENDARIO = "ASIGNAR_CALENDARIO";
    private static final String ASIGNAR_PARTICIPANTE = "ASIGNAR_PARTICIPANTE";
    private static final String ASIGNAR_INSTRUCTOR = "ASIGNAR_INSTRUCTOR";
    private static final String ASIGNAR_CONTRATO = "ASIGNAR_CONTRATO";
    
    // Jasper Notificacion
    private static final String JASPER_NOTIFICACION_PRESENCIAL = "notificacionPresencial.jasper";
    private static final String JASPER_NOTIFICACION_LINEA = "notificacionLinea.jasper";
    private static final String JASPER_DOWN_FILE_NAME = "notificacion";
    
    // TODO: Registrar curso
    /**
     * Registro curso - Consulta.
     * @author Oscar S.
     * @param model Model
     * @param consultaCursoDTO ConsultaCursoDTO
     * @return String
     */
    @RequestMapping
    public String consultaCurso(Model model, ConsultaCursoDTO consultaCursoDTO) {
        // Limpiar objeto
        if (consultaCursoDTO.isCancel()) {
            consultaCursoDTO = new ConsultaCursoDTO();
        } else if (!consultaCursoDTO.isMuestraRegistros()) {
            consultaCursoDTO = new ConsultaCursoDTO();
        }

        // Parametros iniciales
        consultaCursoDTO = navegacionRegistroCurso(consultaCursoDTO);

        model.addAttribute(consultaCursoDTO);
        return super.getViewName("consultaCurso");
    }

    /**
     * Registrar curso.
     * @author Oscar S.
     * @param model Model
     * @param registrarCursoDTO RegistrarCursoDTO
     * @return String
     */
    @RequestMapping
    public String registrarCurso(Model model, RegistrarCursoDTO registrarCursoDTO) {
        // Vista
        registrarCursoDTO.setRegistrar(true);
        registrarCursoDTO.setEditar(false);
        registrarCursoDTO.setViewName("saveRegistroCurso");
        registrarCursoDTO.setPath("registrar");
        registrarCursoDTO.setDescControlCurso("-");

        // Año de operacion
        registrarCursoDTO.setAnioOperacion(super.security().getOperationYear());

        // Numero de participantes
        registrarCursoDTO.setNoParticipantes(new Integer(0));

        // Presupuesto
        registrarCursoDTO.setPresupuesto(new Double(0));

        // Obtener roles
        List roles = super.security().getRoles();
        for (Object rol: roles) {
            logger.debug("registrarCurso -> Roles -> " + (String)rol);
        }

        // Rol Administrador de Capacitacion
        if (super.security().isUserAuthorized(SECURITY_ROL_ADM)) {
            registrarCursoDTO.setRolAdministradorCapacitacion(true);
        } else {
            registrarCursoDTO.setRolAdministradorCapacitacion(false);
        }

        // Rol Operador de Capacitacion
        if (super.security().isUserAuthorized(SECURITY_ROL_OPER)) {
            registrarCursoDTO.setRolOperadorCapacitacion(true);
        } else {
            registrarCursoDTO.setRolOperadorCapacitacion(false);
        }
        
        // Situaciones validas
        List<String> situaciones = new ArrayList<String>();
        situaciones.add("1"); // PROPUESTO
        registrarCursoDTO.setSituaciones(situaciones);

        model.addAttribute(registrarCursoDTO);
        return super.getViewName("registrarCurso");
    }

    /**
     * Solicitud asincrona para obtener el catalogo de ejes tematicos.
     * @author Oscar S.
     * @param idTipoCurso String
     * @param response HttpServletResponse
     */
    @RequestMapping
    public void getEjeTematicoCallback(@RequestParam("idTipoCurso") String idTipoCurso, HttpServletResponse response) throws IOException {
        StringBuffer sb = new StringBuffer();
        
        try {
            List<ItemDTO> items = super.getService(RegistroCursoSPCService.class).getEjeTematicoCallback(idTipoCurso);
            sb.append("<option value=''>SELECCIONE...</option>");

            for (ItemDTO item: items) {
                sb.append("<option value='" + item.getClave() + "'>" + item.getClave() + " - " + item.getValor() + "</option>");
            }
        } catch (Exception e) {
            sb.append("<option value=''>SELECCIONE...</option>");
        }

        // Generar respuesta
        response.setHeader("Cache-Control", "no-cache");
        response.setDateHeader("Expires", 0);
        response.setHeader("Pragma", "no-cache");
        response.setContentType("text/plain");
        PrintWriter out = response.getWriter();
        out.print(sb.toString());
    }
    
    /**
     * Solicitud asincrona para obtener el catalogo de cursos.
     * @author Oscar S.
     * @param idEjeTematico String
     * @param response HttpServletResponse
     */
    @RequestMapping
    public void getCursoPrincipalCallback(@RequestParam("idEjeTematico") String idEjeTematico, HttpServletResponse response) throws IOException {
        StringBuffer sb = new StringBuffer();

        try {
            List<ItemDTO> items = super.getService(RegistroCursoSPCService.class).getCursoPrincipalCallback(idEjeTematico);
            sb.append("<option value=''>SELECCIONE...</option>");
            
            for (ItemDTO item: items) {
                sb.append("<option value='" + item.getClave() + "'>" + item.getClave() + " - " + item.getValor() + "</option>");
            }
        } catch (Exception e) {
            sb.append("<option value=''>SELECCIONE...</option>");
        }

        // Generar respuesta
        response.setHeader("Cache-Control", "no-cache");
        response.setDateHeader("Expires", 0);
        response.setHeader("Pragma", "no-cache");
        response.setContentType("text/plain");
        PrintWriter out = response.getWriter();
        out.print(sb.toString());
    }

    /**
     * Solicitud asincrona para obtener el catalogo de modalidades.
     * @author Oscar S.
     * @param idEjeTematico String
     * @param response HttpServletResponse
     */
    @RequestMapping
    public void getModalidadCallback(@RequestParam("idEjeTematico") String idEjeTematico, @RequestParam("idCursoPrincipal") String idCursoPrincipal,  HttpServletResponse response) throws IOException {
        StringBuffer sb = new StringBuffer();
        
        try {
            List<ItemDTO> items = super.getService(RegistroCursoSPCService.class).getModalidadCallback(idEjeTematico, idCursoPrincipal);
            
            for (ItemDTO item: items) {
                sb.append("<option value='" + item.getClave() + "'>" + item.getClave() + " - " + item.getValor() + "</option>");
            }
        } catch (Exception e) {
            sb.append("<option value=''>SELECCIONE...</option>");
        }

        // Generar respuesta
        response.setHeader("Cache-Control", "no-cache");
        response.setDateHeader("Expires", 0);
        response.setHeader("Pragma", "no-cache");
        response.setContentType("text/plain");
        PrintWriter out = response.getWriter();
        out.print(sb.toString());
    }

    /**
     * Solicitud asincrona para obtener el catalogo de finalidades.
     * @author Oscar S.
     * @param idEjeTematico String
     * @param idCursoPrincipal String
     * @param response HttpServletResponse
     */
    @RequestMapping
    public void getFinalidadCallback(@RequestParam("idEjeTematico") String idEjeTematico, @RequestParam("idCursoPrincipal") String idCursoPrincipal, HttpServletResponse response) throws IOException {
        StringBuffer sb = new StringBuffer();
        
        try {
            List<ItemDTO> items = super.getService(RegistroCursoSPCService.class).getFinalidadCallback(idEjeTematico, idCursoPrincipal);
            
            for (ItemDTO item: items) {
                sb.append("<option value='" + item.getClave() + "'>" + item.getClave() + " - " + item.getValor() + "</option>");
            }
        } catch (Exception e) {
            sb.append("<option value=''>SELECCIONE...</option>");
        }

        // Generar respuesta
        response.setHeader("Cache-Control", "no-cache");
        response.setDateHeader("Expires", 0);
        response.setHeader("Pragma", "no-cache");
        response.setContentType("text/plain");
        PrintWriter out = response.getWriter();
        out.print(sb.toString());
    }
    
    /**
     * Solicitud asincrona para obtener el catalogo de capacidades de certificacion.
     * @author Oscar S.
     * @param idEjeTematico String
     * @param idCursoPrincipal String
     * @param response HttpServletResponse
     */
    @RequestMapping
    public void getCapacidadCertCallback(@RequestParam("idEjeTematico")String idEjeTematico, @RequestParam("idCursoPrincipal") String idCursoPrincipal, HttpServletResponse response) throws IOException {
        StringBuffer sb = new StringBuffer();
        
        try {
            List<ItemDTO> items = super.getService(RegistroCursoSPCService.class).getCapacidadCertCallback(idEjeTematico, idCursoPrincipal);
            
            if (items.size() == 0) {
                sb.append("<option value=''>SELECCIONE...</option>");
            } else {
                for (ItemDTO item: items) {
                    sb.append("<option value='" + item.getClave() + "'>" + item.getClave() + " - " + item.getValor() + "</option>");
                }
            }
        } catch (Exception e) {
            sb.append("<option value=''>SELECCIONE...</option>");
        }

        // Generar respuesta
        response.setHeader("Cache-Control", "no-cache");
        response.setDateHeader("Expires", 0);
        response.setHeader("Pragma", "no-cache");
        response.setContentType("text/plain");
        PrintWriter out = response.getWriter();
        out.print(sb.toString());
    }
    
    /**
     * Solicitud asincrona para obtener el catalogo de caracteres.
     * @author Oscar S.
     * @param idEjeTematico String
     * @param idCursoPrincipal String
     * @param response HttpServletResponse
     */
    @RequestMapping
    public void getCaracterCallback(@RequestParam("idEjeTematico")String idEjeTematico, @RequestParam("idCursoPrincipal") String idCursoPrincipal, HttpServletResponse response) throws IOException {
        StringBuffer sb = new StringBuffer();
        
        try {
            List<ItemDTO> items = super.getService(RegistroCursoSPCService.class).getCaracterCallback(idEjeTematico, idCursoPrincipal);
            
            for (ItemDTO item: items) {
                sb.append("<option value='" + item.getClave() + "'>" + item.getClave() + " - " + item.getValor() + "</option>");
            }
        } catch (Exception e) {
            sb.append("<option value=''>SELECCIONE...</option>");
        }

        // Generar respuesta
        response.setHeader("Cache-Control", "no-cache");
        response.setDateHeader("Expires", 0);
        response.setHeader("Pragma", "no-cache");
        response.setContentType("text/plain");
        PrintWriter out = response.getWriter();
        out.print(sb.toString());
    }

    /**
     * Solicitud asincrona para obtener el catalogo de caracteres.
     * @author Oscar S.
     * @param idTipoCurso String
     * @param idCursoPrincicpal String
     * @param idEjeTematico String
     * @param cicloEjeTematico Integer
     * @param idSubprograma String
     * @param response HttpServletResponse
     */
    @RequestMapping
    public void getConsecutivoClaveCursoCallback(@RequestParam("idTipoCurso") String idTipoCurso, 
                                                 @RequestParam("idCursoPrincicpal") String idCursoPrincicpal, 
                                                 @RequestParam("idEjeTematico") String idEjeTematico, 
                                                 @RequestParam("cicloEjeTematico") Integer cicloEjeTematico, 
                                                 @RequestParam("idSubprograma") String idSubprograma, HttpServletResponse response) throws IOException { 
        String consecutivoActual = new String();
        String nuevo = new String();
        TnCapCursoDTO tnCapCursoDTO = new TnCapCursoDTO();
        
        try {
            // Obtener consecutivo
            List<TnCapCursoDTO> consecutivos = super.getService(RegistroCursoSPCService.class).getConsecutivoClaveCursoCallback(idCursoPrincicpal, idEjeTematico, cicloEjeTematico, idTipoCurso, idSubprograma);
            
            if (consecutivos.size() == 0) {
                tnCapCursoDTO = new TnCapCursoDTO();
                logger.debug("getConsecutivoClaveCursoCallback -> tnCapCursoDTO -> " + tnCapCursoDTO.getCursoClave());
                
                nuevo = "01";
            } else {
                tnCapCursoDTO = consecutivos.get(0);
                logger.debug("getConsecutivoClaveCursoCallback -> tnCapCursoDTO -> " + tnCapCursoDTO.getCursoClave());
                
                if (idTipoCurso.equals("CER")) {
                    consecutivoActual = tnCapCursoDTO.getCursoClave().substring(6, 8); //CERT010015-C
                } else {
                    consecutivoActual = tnCapCursoDTO.getCursoClave().substring(4, 6); //DH010015-C
                }
                logger.debug("getConsecutivoClaveCursoCallback -> consecutivoActual -> " + consecutivoActual);
                
                int consecutivoNuevo = Integer.parseInt(consecutivoActual) + 1;
                logger.debug("getConsecutivoClaveCursoCallback -> consecutivoNuevo -> " + consecutivoNuevo);

                if (consecutivoNuevo < 10) {
                    nuevo = "0" + consecutivoNuevo;
                } else {
                    nuevo = String.valueOf(consecutivoNuevo);
                }
            }
        } catch (Exception e) {
            logger.debug("getConsecutivoClaveCursoCallback -> Exception -> " + e.toString());
        }

        // Generar respuesta
        response.setHeader("Cache-Control", "no-cache");
        response.setDateHeader("Expires", 0);
        response.setHeader("Pragma", "no-cache");
        response.setContentType("text/plain");
        PrintWriter out = response.getWriter();
        out.print(nuevo);
    }

    /**
     * Registrar curso - Guardar.
     * @author Oscar S.
     * @param model Model
     * @param registrarCursoDTO RegistrarCursoDTO
     * @return String
     */
    @RequestMapping
    public String saveRegistroCurso(Model model, RegistrarCursoDTO registrarCursoDTO) {
        ConsultaCursoDTO consultaCursoDTO = new ConsultaCursoDTO();

        try {
            // Inicializar objeto
            TnCapCursoDTO tnCapCursoDTO = new TnCapCursoDTO();

            // Datos obligatorios
            tnCapCursoDTO.setIdCoordinacion(registrarCursoDTO.getIdCoordinacion());
            tnCapCursoDTO.setIdEjeTematico(registrarCursoDTO.getIdEjeTematico());
            tnCapCursoDTO.setIdTipoCurso(registrarCursoDTO.getTipoCurso());
            tnCapCursoDTO.setCicloEjeTematico(new Integer(super.security().getOperationYear()));
            tnCapCursoDTO.setIdSubprograma(registrarCursoDTO.getIdSubprograma());
            tnCapCursoDTO.setIdCursoPrincipal(registrarCursoDTO.getIdCursoPrincipal());
            tnCapCursoDTO.setCursoClave(registrarCursoDTO.getClaveCurso() == null ? "-" : registrarCursoDTO.getClaveCurso());
            tnCapCursoDTO.setIdControlCurso("REG");

            tnCapCursoDTO.setCursoDuracion(registrarCursoDTO.getDuracion() == null ? 0 : registrarCursoDTO.getDuracion());
            tnCapCursoDTO.setCursoPresupuesto(registrarCursoDTO.getPresupuesto() == null ? new Double(0) : new Double(String.valueOf(registrarCursoDTO.getPresupuesto()).replace(",", "")));
            tnCapCursoDTO.setCursoParticipantes(new Integer(0));
            tnCapCursoDTO.setRfcOperDgrh(registrarCursoDTO.getRfcOperDgrh() == null ? "" : registrarCursoDTO.getRfcOperDgrh());

            // Certificación
            if (registrarCursoDTO.getTipoCurso().equals("CER")) {
                tnCapCursoDTO.setCursoClaveCertificacion(registrarCursoDTO.getClaveCertificacion() == null ? "" : registrarCursoDTO.getClaveCertificacion());
                tnCapCursoDTO.setIdTipoCapacidad(registrarCursoDTO.getIdEjeTematico());
                tnCapCursoDTO.setIdNivelCurso(registrarCursoDTO.getNivelCurso() == null ? 4 : registrarCursoDTO.getNivelCurso());
                tnCapCursoDTO.setCursoSupervisorInst(registrarCursoDTO.getSupervisorInstEducat() == null ? "" : registrarCursoDTO.getSupervisorInstEducat());
            } else {
                tnCapCursoDTO.setCursoClaveCertificacion("");
                tnCapCursoDTO.setIdTipoCapacidad("NA"); // NA
                tnCapCursoDTO.setIdNivelCurso(4); // NA
                tnCapCursoDTO.setCursoSupervisorInst("");
            }

            // Proveedor
            tnCapCursoDTO.setIdProveedor(registrarCursoDTO.getProveedor() == null ? "" : registrarCursoDTO.getProveedor());
            tnCapCursoDTO.setIdSituacionProveedor(registrarCursoDTO.getSituacionProveedor() == null ? 3 : registrarCursoDTO.getSituacionProveedor()); // Situacion default 3 - NA

            tnCapCursoDTO.setUsuario(super.security().getUserName());
            tnCapCursoDTO.setFecModifico(new Date());

            // Guardar registro
            super.getService(RegistroCursoSPCService.class).saveRegistroCurso(tnCapCursoDTO);

            // Reiniciar consultaCursoDTO
            consultaCursoDTO = new ConsultaCursoDTO();
            tnCapCursoDTO = new TnCapCursoDTO();

            // Parametros iniciales
            consultaCursoDTO = navegacionRegistroCurso(consultaCursoDTO);

            // Mensaje de exito
            super.saveMessage(model, "sireh.label.spc.capcer.registro.registrarCurso.ok");
        } catch (Exception e) {
            logger.debug("saveRegistroCurso -> Exception -> " + e.toString());
            // Mensaje de error
            super.saveError(model, "sireh.label.spc.capcer.registro.registrarCurso.error");
        }

        model.addAttribute(consultaCursoDTO);
        return consultaCurso(model, consultaCursoDTO);
    }

    /**
     * Registrar curso - Consulta el curso a editar mediante el objeto tnCapCursoDTO.
     * @author Oscar S.
     * @param model Model
     * @param idCurso Integer
     * @return String
     */
    @RequestMapping
    public String editRegistroCurso(Model model, @RequestParam("idCurso") Integer idCurso) {
        // Obtener el curso
        CustomRegistroCursoDTO customRegistroCursoDTO = super.getService(RegistroCursoSPCService.class).getCursoRegistro(idCurso);

        // Inicializar Objeto
        RegistrarCursoDTO registrarCursoDTO = new RegistrarCursoDTO();

        // Tipo de curso
        registrarCursoDTO.setTipoCurso(customRegistroCursoDTO.getIdTipoCurso());
        logger.debug("editRegistroCurso -> tipoCurso -> " + customRegistroCursoDTO.getIdTipoCurso());
        
        // Obtener el curso principal
        Integer cicloEjeTematico = customRegistroCursoDTO.getCicloEjeTematico();
        String idCursoPrincipal = customRegistroCursoDTO.getIdCursoPrincipal();
        String idEjeTematico = customRegistroCursoDTO.getIdEjeTematico();
        TcCapCursoPrincpDTO tcCapCursoPrincipalDTO = super.getService(RegistroCursoSPCService.class).getCursoPrincipalRegistro(cicloEjeTematico, idCursoPrincipal, idEjeTematico);

        // Datos del curso
        registrarCursoDTO.setIdCoordinacion(customRegistroCursoDTO.getIdCoordinacion());
        registrarCursoDTO.setIdEjeTematico(customRegistroCursoDTO.getIdEjeTematico());
        registrarCursoDTO.setAnioOperacion(String.valueOf(customRegistroCursoDTO.getCicloEjeTematico()));
        registrarCursoDTO.setIdSubprograma(customRegistroCursoDTO.getIdSubprograma());
        registrarCursoDTO.setIdModalidad(tcCapCursoPrincipalDTO.getIdModalidad());
        registrarCursoDTO.setIdFinalidad(tcCapCursoPrincipalDTO.getIdFinalidad());
        registrarCursoDTO.setIdCaracter(tcCapCursoPrincipalDTO.getIdCaracter());
        registrarCursoDTO.setIdCursoPrincipal(customRegistroCursoDTO.getIdCursoPrincipal());
        registrarCursoDTO.setClaveCurso(customRegistroCursoDTO.getCursoClave());
        registrarCursoDTO.setDuracion(customRegistroCursoDTO.getCursoDuracion() == null ? 0 : customRegistroCursoDTO.getCursoDuracion());
        registrarCursoDTO.setPresupuesto(customRegistroCursoDTO.getCursoPresupuesto() == 0 ? new Double(0) : new Double(String.valueOf(customRegistroCursoDTO.getCursoPresupuesto()).replace(",", "")));
        registrarCursoDTO.setNoParticipantes(customRegistroCursoDTO.getCursoParticipantes() == null ? new Integer(0) : new Integer(String.valueOf(customRegistroCursoDTO.getCursoParticipantes()).replace(",", "")));
        registrarCursoDTO.setRfcOperDgrh(customRegistroCursoDTO.getRfcOperDgrh());
        
        // Certificacion
        registrarCursoDTO.setClaveCertificacion(customRegistroCursoDTO.getCursoClaveCertificacion());
        registrarCursoDTO.setTipoCapacidad(customRegistroCursoDTO.getIdTipoCapacidad());
        registrarCursoDTO.setNivelCurso(customRegistroCursoDTO.getIdNivelCurso());
        registrarCursoDTO.setSupervisorInstEducat(customRegistroCursoDTO.getCursoSupervisorInst());
        
        // Calendarizacion
        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        registrarCursoDTO.setCursoFecIni(customRegistroCursoDTO.getCursoFecIni() != null ? df.format(customRegistroCursoDTO.getCursoFecIni()) : "");
        registrarCursoDTO.setCursoFecFin(customRegistroCursoDTO.getCursoFecFin() != null ? df.format(customRegistroCursoDTO.getCursoFecFin()) : "");
        registrarCursoDTO.setDescSede(customRegistroCursoDTO.getDescSede() != null ? customRegistroCursoDTO.getDescSede() : "");
        registrarCursoDTO.setDescAula(customRegistroCursoDTO.getDescAula() != null ? customRegistroCursoDTO.getDescAula() : "");
        registrarCursoDTO.setDescHorario(customRegistroCursoDTO.getDescHorarioCurso() != null ? customRegistroCursoDTO.getDescHorarioCurso() : "");
         
        // Proveedor
        registrarCursoDTO.setTipoInstEducat(customRegistroCursoDTO.getIdTipoInstEducat());
        registrarCursoDTO.setProveedor(customRegistroCursoDTO.getIdProveedor());
        registrarCursoDTO.setSituacionProveedor(customRegistroCursoDTO.getIdSituacionProveedor());

        // Vista
        registrarCursoDTO.setRegistrar(false);
        registrarCursoDTO.setEditar(true);
        registrarCursoDTO.setViewName("updateRegistroCurso");
        registrarCursoDTO.setIdCursoEditar(idCurso);
        registrarCursoDTO.setPath("editar");
        registrarCursoDTO.setIdControlCurso(customRegistroCursoDTO.getIdControlCurso());
        registrarCursoDTO.setDescControlCurso(customRegistroCursoDTO.getDescControlCurso());

        // Año de operacion
        registrarCursoDTO.setAnioOperacion(super.security().getOperationYear());

        // Obtener roles
        List roles = super.security().getRoles();
        for (Object rol: roles) {
            logger.debug("editRegistroCurso -> Roles -> " + (String)rol);
        }

        // Rol Administrador de Capacitacion
        if (super.security().isUserAuthorized(SECURITY_ROL_ADM)) {
            registrarCursoDTO.setRolAdministradorCapacitacion(true);
        } else {
            registrarCursoDTO.setRolAdministradorCapacitacion(false);
        }

        // Rol Operador de Capacitacion
        if (super.security().isUserAuthorized(SECURITY_ROL_OPER)) {
            registrarCursoDTO.setRolOperadorCapacitacion(true);
        } else {
            registrarCursoDTO.setRolOperadorCapacitacion(false);
        }
        
        // Situaciones validas
        List<String> situaciones = new ArrayList<String>();
        if (customRegistroCursoDTO.getIdControlCurso().equals("REG")) {
            situaciones.add("1"); // PROPUESTO
        } else if (customRegistroCursoDTO.getIdControlCurso().equals("PRO") || customRegistroCursoDTO.getIdControlCurso().equals("CON")) {
            situaciones.add("2"); // CONFIRMADO
        } else {
            situaciones.add("1"); // PROPUESTO
            situaciones.add("2"); // CONFIRMADO
        }        
        registrarCursoDTO.setSituaciones(situaciones);

        model.addAttribute(registrarCursoDTO);
        return super.getViewName("registrarCurso");
    }

    /**
     * Registrar curso - Actualiza el curso mediante el objeto registrarCursoDTO.
     * @author Oscar S.
     * @param model Model
     * @param registrarCursoDTO RegistrarCursoDTO
     * @return String
     */
    @RequestMapping
    public String updateRegistroCurso(Model model, RegistrarCursoDTO registrarCursoDTO) {
        ConsultaCursoDTO consultaCursoDTO = new ConsultaCursoDTO();

        try {
            // Obtener el curso
            TnCapCursoDTO tnCapCursoDTO = super.getService(RegistroCursoSPCService.class).getCursoRegistro(registrarCursoDTO.getIdCursoEditar());
            java.lang.Float duracionOriginal = tnCapCursoDTO.getCursoDuracion();
            
            // Datos del curso
            tnCapCursoDTO.setCursoDuracion(registrarCursoDTO.getDuracion() == null ? 0 : registrarCursoDTO.getDuracion());
            tnCapCursoDTO.setCursoPresupuesto(registrarCursoDTO.getPresupuesto() == null ? new Double(0) : new Double(String.valueOf(registrarCursoDTO.getPresupuesto()).replace(",", "")));
            tnCapCursoDTO.setRfcOperDgrh(registrarCursoDTO.getRfcOperDgrh() == null ? "" : registrarCursoDTO.getRfcOperDgrh());
            
            // Certificación
            if (tnCapCursoDTO.getIdTipoCurso().equals("CER")) {
                tnCapCursoDTO.setCursoClaveCertificacion(registrarCursoDTO.getClaveCertificacion() == null ? "" : registrarCursoDTO.getClaveCertificacion());
                //tnCapCursoDTO.setIdTipoCapacidad(registrarCursoDTO.getTipoCapacidad() == null ? "4" : registrarCursoDTO.getTipoCapacidad());
                tnCapCursoDTO.setIdNivelCurso(registrarCursoDTO.getNivelCurso() == null ? 4 : registrarCursoDTO.getNivelCurso());
                tnCapCursoDTO.setCursoSupervisorInst(registrarCursoDTO.getSupervisorInstEducat() == null ? "" : registrarCursoDTO.getSupervisorInstEducat());
            } else {
                tnCapCursoDTO.setCursoClaveCertificacion("");
                tnCapCursoDTO.setIdTipoCapacidad("NA"); // NA
                tnCapCursoDTO.setIdNivelCurso(4); // NA
                tnCapCursoDTO.setCursoSupervisorInst("");
            }

            // Proveedor
            tnCapCursoDTO.setIdProveedor(registrarCursoDTO.getProveedor() == null ? "" : registrarCursoDTO.getProveedor());
            Integer situacionProveedor = registrarCursoDTO.getSituacionProveedor() == null ? 3 : registrarCursoDTO.getSituacionProveedor();
            tnCapCursoDTO.setIdSituacionProveedor(situacionProveedor); // Situacion default 3 - NA
            
            // Movimiento
            int idMovimiento = super.configuration().getNumber("movCapCode", "ACTUALIZACION_REGISTRO").intValue();

            tnCapCursoDTO.setUsuario(super.security().getUserName());
            tnCapCursoDTO.setFecModifico(new Date());
            
            // Valida si hay un cambio de duración
            if (duracionOriginal.equals(registrarCursoDTO.getDuracion())) {
                // Confirmado
                if (situacionProveedor == 2) { // CONFIRMADO
                    tnCapCursoDTO.setIdControlCurso("CON");
                    idMovimiento = super.configuration().getNumber("movCapCode", "CONFIRMAR_CURSO").intValue();
                }
                
                // Actualizar registro
                super.getService(RegistroCursoSPCService.class).updateRegistroCurso(tnCapCursoDTO, idMovimiento);
                
                // Mensaje de exito
                super.saveMessage(model, "sireh.label.spc.capcer.registro.updateRegistroCurso.ok");
            } else {
                tnCapCursoDTO.setIdSituacionProveedor(1); // PROPUESTO
                tnCapCursoDTO.setIdControlCurso("REG");
                
                // Actualizar registro
                super.getService(RegistroCursoSPCService.class).reiniciarCalendario(tnCapCursoDTO, idMovimiento);
                
                // Mensaje de exito
                super.saveMessage(model, "sireh.label.spc.capcer.registro.updateRegistroCurso.calendario.ok");
            }

            // Reiniciar consultaCursoDTO
            consultaCursoDTO = new ConsultaCursoDTO();

            // Parametros iniciales
            consultaCursoDTO = navegacionRegistroCurso(consultaCursoDTO);
        } catch (Exception e) {
            logger.debug("updateRegistroCurso -> Exception -> " + e.toString());
            // Mensaje de error
            super.saveError(model, "sireh.label.spc.capcer.registro.updateRegistroCurso.error");
        }
        model.addAttribute(consultaCursoDTO);
        return consultaCurso(model, consultaCursoDTO);
    }

    /**
     * Registrar curso - Elimina el/los curso(s) seleccionado(s) en la pantalla de consulta.
     * @author Oscar S.
     * @param model Model
     * @param consultaCursoDTO ConsultaCursoDTO
     * @return String
     */
    @RequestMapping
    public String deleteRegistroCurso(Model model, ConsultaCursoDTO consultaCursoDTO) {
        Integer[] idCursos = consultaCursoDTO.getIdCursos();

        try {
            // Eliminar registro
            super.getService(RegistroCursoSPCService.class).deleteRegistroCurso(idCursos);

            // Mensaje de exito
            super.saveMessage(model, "sireh.label.spc.capcer.registro.eliminarCurso.ok");
        } catch (Exception e) {
            logger.debug("deleteRegistroCurso -> Exception -> " + e.toString());
            // Mensaje de error
            super.saveError(model, "sireh.label.spc.capcer.registro.eliminarCurso.error");
        }

        // Reiniciar consultaCursoDTO
        consultaCursoDTO = new ConsultaCursoDTO();

        // Parametros iniciales
        consultaCursoDTO = navegacionRegistroCurso(consultaCursoDTO);

        model.addAttribute(consultaCursoDTO);
        return consultaCurso(model, consultaCursoDTO);
    }

    /**
     * Registrar curso - Metodo generico de navegacion
     * @author Oscar S.
     * @param consultaCursoDTO ConsultaCursoDTO
     * @return consultaCursoDTO ConsultaCursoDTO
     */
    private ConsultaCursoDTO navegacionRegistroCurso(ConsultaCursoDTO consultaCursoDTO) {
        // Interior 
        consultaCursoDTO.setInterior("Registrar curso");
        consultaCursoDTO.setControl(REGISTRAR_CURSO);

        // Navegacion
        consultaCursoDTO.setUrlOrigen("consultaCurso");
        consultaCursoDTO.setUrlDestino("consultaCurso");
        consultaCursoDTO.setUrlRegistroCurso("registrarCurso");
        consultaCursoDTO.setUrlDeleteRegistroCurso("deleteRegistroCurso");
        consultaCursoDTO.setLinkDestino("editRegistroCurso.do");
        consultaCursoDTO.setParamIdDestino("idCurso");
        consultaCursoDTO.setPropertyDestino("idCursos");

        // PagedList
        consultaCursoDTO.setBeanName("consultaCurso-registrarCurso");

        // Obtener roles
        List roles = super.security().getRoles();
        for (Object rol: roles) {
            logger.debug("navegacionRegistroCurso -> Roles -> " + (String)rol);
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

    /******************************************************************************************************************************************************************************/
    
     // TODO: Asignar calendario
    /**
     * Asignar Calendario - Metodo encargado de mostrar la pantalla de busqueda de cursos para asignar su calendarizacion.
     * @author Gualberto G.
     * @param model Model
     * @return String
     */
    @RequestMapping
    public String consultaAsignarCalendario(Model model, ConsultaCursoDTO consultaCursoDTO) {
        // Limpiar objeto
        if (consultaCursoDTO.isCancel()) {
            consultaCursoDTO = new ConsultaCursoDTO();
        }

        // Parametros iniciales
        consultaCursoDTO = navegacionAsignarCalendario(consultaCursoDTO);

        model.addAttribute(consultaCursoDTO);
        return super.getViewName("consultaCurso");
    }

    /**
     * Asignar Calendario - Metodo encargado de consultar los datos de un curso y mostrarlos en la pantalla para su actualizacion.
     * @author Gualberto G.
     * @param model Model
     * @return String
     */
    @RequestMapping
    public String asignarCalendario(Model model, @RequestParam("idCurso") String idCurso) {
        RegistroCalendarioDTO registroCalendarioDTO = super.getService(RegistroCursoSPCService.class).getRegistroCalendario(Integer.parseInt(idCurso));
        // Si la modalidad es el linea, o el subprograma es externo, se bloquea el panel de horario
        registroCalendarioDTO.setShowHorario(registroCalendarioDTO.getIdModalidad() != 2 && registroCalendarioDTO.getIdSubprograma() != null && !registroCalendarioDTO.getIdSubprograma().equals("E") );
        model.addAttribute(registroCalendarioDTO);
        return super.getViewName("asignarCalendario");
    }

    /**
     * Asignar Calendario - Metodo encargado de guardar los datos de calendarizacion ingresados en la pantalla por el usario.
     * @author Gualberto G.
     * @param model Model
     * @return String
     */
    @RequestMapping
    public String saveAsignarCalendario(Model model, RegistroCalendarioDTO registroCalendarioDTO) {
        super.getService(RegistroCursoSPCService.class).saveRegistroCalendario(registroCalendarioDTO);
        super.saveMessage(model, "sireh.label.spc.capcer.registro.asignarCalendario.ok");
        return consultaAsignarCalendario(model, new ConsultaCursoDTO());
    }
    
    /**
     * Asignar Calendario - Metodo generico de navegacion.
     * @author Gualberto G.
     * @param consultaCursoDTO ConsultaCursoDTO
     * @return consultaCursoDTO ConsultaCursoDTO
     */
    private ConsultaCursoDTO navegacionAsignarCalendario(ConsultaCursoDTO consultaCursoDTO) {
        // Interior 
        consultaCursoDTO.setInterior("Asignar calendario");
        consultaCursoDTO.setControl(ASIGNAR_CALENDARIO);
        
        // Navegacion
        consultaCursoDTO.setUrlOrigen("consultaAsignarCalendario");
        consultaCursoDTO.setUrlDestino("consultaAsignarCalendario");
        consultaCursoDTO.setUrlRegistroCurso("registrarCurso");
        consultaCursoDTO.setUrlDeleteRegistroCurso("deleteRegistroCurso");
        consultaCursoDTO.setLinkDestino("asignarCalendario.do");
        consultaCursoDTO.setParamIdDestino("idCurso");
        consultaCursoDTO.setPropertyDestino("idCursos");
        consultaCursoDTO.setControl("ASIGNAR_CALENDARIO");

        // PagedList
        consultaCursoDTO.setBeanName("consultaCurso-asignarCalendario");

        // Obtener roles
        List roles = super.security().getRoles();
        for (Object rol: roles) {
            logger.debug("navegacionAsignarCalendario -> Roles -> " + (String)rol);
        }

        // Rol Administrador de Capacitacion
        if (super.security().isUserAuthorized(SECURITY_ROL_ADM)) {
            consultaCursoDTO.setRolAdministradorCapacitacion(true);
        } else {
            consultaCursoDTO.setRolAdministradorCapacitacion(false);
        }

        // Rol Coordinacion administrativa
        if (super.security().isUserAuthorized(SECURITY_ROL_CORD)) {
            consultaCursoDTO.setRolCoordinacionAdministrativa(true);
        } else {
            consultaCursoDTO.setRolCoordinacionAdministrativa(false);
        }
        
        // Filtros tipo de curso
        List<String> estatusCursos = new ArrayList<String>();
        estatusCursos.add("REG");
        estatusCursos.add("PRO");
        consultaCursoDTO.setEstatusCursos(estatusCursos);

        return consultaCursoDTO;
    }

    /**
     * Asignar Calendario - Metodo que consulta el maximo por aula seleccionada.
     * @author Gualberto G.
     * @param idAula
     * @param response
     * @throws IOException
     */
    @RequestMapping
    public void getMaximoCallback(@RequestParam("idAula") String idAula, HttpServletResponse response) throws IOException {
        TcCapAulaDTO tcCapAulaDTO = super.getService(RegistroCursoSPCService.class).getDatosAula(idAula);
        
        // Generar respuesta
        response.setHeader("Cache-Control", "no-cache");
        response.setDateHeader("Expires", 0);
        response.setHeader("Pragma", "no-cache");
        response.setContentType("text/plain");
        PrintWriter out = response.getWriter();
        out.print(tcCapAulaDTO != null ? "" + tcCapAulaDTO.getCupoMaximoAula() : "");
    }
    
    /**
     * Asignar Calendario - Metodo que consulta la disponibilidad de horarios por aula.
     * @author Gualberto G./Oscar S.
     * @param idAula String
     * @param response HttpServletResponse
     * @throws IOException
     */
    @RequestMapping
    public void getCalendarCallback(@RequestParam("idAula") String idAula, HttpServletResponse response) throws IOException {
        List<CustomTnCapCalendarioCursoDTO> customTnCapCalendarioCursoDTO = new ArrayList<CustomTnCapCalendarioCursoDTO>();
        String jsonDataString = "{}";
        
        try {
            // Cadena JSON
            customTnCapCalendarioCursoDTO = super.getService(RegistroCursoSPCService.class).getCalendarioByAula(idAula);
            logger.debug("getCalendarCallback -> customTnCapCalendarioCursoDTO.size -> " + customTnCapCalendarioCursoDTO.size());
            
            // Genera cadena JSON
            jsonDataString = generateJSONStringHorarios(customTnCapCalendarioCursoDTO);
            logger.debug("getCalendarCallback -> jsonDataString -> " + jsonDataString);
        } catch (Exception e) {
            logger.debug("getCalendarCallback -> Exception -> " + e.toString());
        }
        
        response.setHeader("Cache-Control", "no-cache");
        response.setDateHeader("Expires", 0);
        response.setHeader("Pragma", "no-cache");
        response.setContentType("text/plain");
        PrintWriter out = response.getWriter();
        out.print(jsonDataString);
    }
    
    /** 
     * Asignar Calendario - Metodo encargado de construir cadenas de tipo json con base en listas de objetos de tipo CustomTnCapCalendarioCursoDTO.
     * @author Oscar S.
     * @param customTnCapCalendarioCursoDTO List&lt;CustomTnCapCalendarioCursoDTO&gt;
     * @throws IOException, JsonGenerationException, JsonMappingException 
     * @return String
     */
    public String generateJSONStringHorarios(List<CustomTnCapCalendarioCursoDTO> customTnCapCalendarioCursoDTO ) throws IOException, JsonGenerationException, JsonMappingException {
        ObjectMapper mapper = new ObjectMapper();

        // jsonMap Nivel 1
        List<Object> jsonMapCursosHorarios1 = new ArrayList<Object>();

        // jsonMap Nivel 3
        HashMap<String, Object> jsonCursosHorarios = new HashMap<String, Object>();

        for (CustomTnCapCalendarioCursoDTO horarios : customTnCapCalendarioCursoDTO) {
            jsonCursosHorarios = new HashMap<String, Object>();
            SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
            
            //jsonCursosHorarios.put("id", horarios.getIdCurso() != null ? String.valueOf(horarios.getIdCurso()) : "");
            String claveCurso = horarios.getCursoClave() != null ? horarios.getCursoClave() + " - " : "";
            jsonCursosHorarios.put("title", horarios.descCursoPrincipal != null ? String.valueOf(claveCurso + horarios.descCursoPrincipal) : "");
            
            String horarioInicial = horarios.getDescHorarioCursoInicial() != null ? "T" + horarios.getDescHorarioCursoInicial() + ":00" : "";
            jsonCursosHorarios.put("start", horarios.getFecha() != null ? df.format(horarios.getFecha()) + horarioInicial : "");
            
            String horarioFinal = horarios.getDescHorarioCursoFinal() != null ? "T" + horarios.getDescHorarioCursoFinal() + ":00" : "";
            jsonCursosHorarios.put("end", horarios.getFecha() != null ? df.format(horarios.getFecha()) + horarioFinal : "");
            
            jsonMapCursosHorarios1.add(jsonCursosHorarios);
        }
        return mapper.writeValueAsString(jsonMapCursosHorarios1);
    }
    
    /******************************************************************************************************************************************************************************/
    
    // TODO: Asignar participante
    /**
     * Asignar participante - Consulta.
     * @author Oscar S./Gualberto G.
     * @param model Model
     * @return String
     */
    @RequestMapping
    public String consultaAsignarParticipante(Model model, ConsultaCursoDTO consultaCursoDTO) {
        // Limpiar objeto
        if (consultaCursoDTO.isCancel()) {
            consultaCursoDTO = new ConsultaCursoDTO();
        }

        // Parametros iniciales
        consultaCursoDTO = navegacionAsignarParticipante(consultaCursoDTO);

        model.addAttribute(consultaCursoDTO);
        return super.getViewName("consultaCurso");
    }

    /**
     * Asignar participante - Metodo generico de navegacion
     * @author Oscar S.
     * @param consultaCursoDTO ConsultaCursoDTO
     * @return consultaCursoDTO ConsultaCursoDTO
     */
    private ConsultaCursoDTO navegacionAsignarParticipante(ConsultaCursoDTO consultaCursoDTO) {
        // Interior 
        consultaCursoDTO.setInterior("Asignar Participante");
        consultaCursoDTO.setControl(ASIGNAR_PARTICIPANTE);
        
        // Navegacion
        consultaCursoDTO.setUrlOrigen("consultaAsignarParticipante");
        consultaCursoDTO.setUrlDestino("consultaAsignarParticipante");
        consultaCursoDTO.setUrlInscribirParticipante("saveInscribirParticipante");
        consultaCursoDTO.setUrlCancelarParticipante("saveCancelarParticipante");         
        consultaCursoDTO.setLinkDestino("asignarParticipante.do");
        consultaCursoDTO.setParamIdDestino("idCurso");
        consultaCursoDTO.setPropertyDestino("idCursos");

        // PagedList
        consultaCursoDTO.setBeanName("consultaCurso-asignarParticipante");

        // Obtener roles
        List roles = super.security().getRoles();
        for (Object rol: roles) {
            logger.debug("navegacionAsignarParticipante -> Roles -> " + (String)rol);
        }

        // Rol Administrador de Capacitacion
        if (super.security().isUserAuthorized(SECURITY_ROL_ADM)) {
            consultaCursoDTO.setRolAdministradorCapacitacion(true);
        } else {
            consultaCursoDTO.setRolAdministradorCapacitacion(false);
        }

        // Rol Coordinacion administrativa
        if (super.security().isUserAuthorized(SECURITY_ROL_CORD)) {
            consultaCursoDTO.setRolCoordinacionAdministrativa(true);
        } else {
            consultaCursoDTO.setRolCoordinacionAdministrativa(false);
        }

        // Filtros tipo de curso
        List<String> estatusCursos = new ArrayList<String>();
        estatusCursos.add("CON");
        estatusCursos.add("ENV");
        estatusCursos.add("CUR");
        consultaCursoDTO.setEstatusCursos(estatusCursos);

        return consultaCursoDTO;
    }

    /**
     * Asignar participante.
     * @author Oscar S.
     * @param model Model
     * @param idCurso String 
     * @return String
     */
    @RequestMapping
    public String asignarParticipante(Model model, @RequestParam("idCurso") String idCurso) {
        // Obtener el curso
        AsignarParticipanteDTO asignarParticipanteDTO = super.getService(RegistroCursoSPCService.class).getAsignarParticipante(Integer.parseInt(idCurso));
        logger.debug("asignarParticipante -> asignarParticipanteDTO.getIdCurso() -> " + asignarParticipanteDTO.getIdCurso());
        
        // Obtener roles
        List roles = super.security().getRoles();
        for (Object rol: roles) {
            logger.debug("asignarParticipante -> Roles -> " + (String)rol);
        }
        
        // Rol Administrador de Capacitacion
        if (super.security().isUserAuthorized(SECURITY_ROL_ADM)) {
            asignarParticipanteDTO.setRolAdministradorCapacitacion(true);
        } else {
            asignarParticipanteDTO.setRolAdministradorCapacitacion(false);
        }

        // Rol Coordinacion administrativa
        if (super.security().isUserAuthorized(SECURITY_ROL_CORD)) {
            asignarParticipanteDTO.setRolCoordinacionAdministrativa(true);
        } else {
            asignarParticipanteDTO.setRolCoordinacionAdministrativa(false);
        }
        
        // Tipo de curso
        asignarParticipanteDTO.setTipoCurso(asignarParticipanteDTO.getIdTipoCurso().equals("CER") ? "CER" : "CAP");
        asignarParticipanteDTO.setTipoCursoDescripcion(asignarParticipanteDTO.getIdTipoCurso().equals("CER") ? "CERTIFICACION" : "CAPACITACION");
        asignarParticipanteDTO.setUrlInscribirParticipante("saveInscribirParticipante");
        asignarParticipanteDTO.setUrlCancelarParticipante("saveCancelarParticipante");   
        
        // Formato de fechas
        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        asignarParticipanteDTO.setCursoFecIniFormat(df.format(asignarParticipanteDTO.getCursoFecIni()));
        asignarParticipanteDTO.setCursoFecFinFormat(df.format(asignarParticipanteDTO.getCursoFecFin()));
        
        model.addAttribute(asignarParticipanteDTO);
        return super.getViewName("asignarParticipante");
    }

    /**
     * Metodo encargado de obtener el listado de participantes candidatos.
     * @author Oscar S.
     * @param tipoCurso String
     * @param idCurso Integer
     * @param response HttpServletResponse
     */
    @RequestMapping
    public void jsonCallbackParticipantesCandidatos(@RequestParam("tipoCurso")String tipoCurso, @RequestParam("idCurso") Integer idCurso, HttpServletResponse response) throws IOException {
        logger.debug("jsonCallbackParticipantesCandidatos -> tipoCurso -> " + tipoCurso);
        
        // Cadena JSON
        List<CustomParticipantesCandidatosDTO> customParticipantesCandidatosDTO = super.getService(RegistroCursoSPCService.class).getParticipantesCandidatos(Integer.valueOf(super.security().getOperationYear()), idCurso);
        logger.debug("jsonCallbackParticipantesCandidatos -> customParticipantesCandidatosDTO -> " + customParticipantesCandidatosDTO.size());

        // Genera cadena JSON
        String jsonDataString = generateJSONStringParticipantesCandidatos(customParticipantesCandidatosDTO);
        
        response.setHeader("Cache-Control", "no-cache");
        response.setDateHeader("Expires", 0);
        response.setHeader("Pragma", "no-cache");
        response.setContentType("text/plain");
        PrintWriter out = response.getWriter();
        out.print(jsonDataString);
    }

    /** 
     * Particpantes candidatos - Metodo encargado de construir cadenas de tipo json con base en listas de objetos de tipo customParticipantesCandidatosDTO.
     * @author Oscar S.
     * @param customParticipantesCandidatosDTO List<CustomParticipantesCandidatosDTO> 
     * @return String
     */
    @SuppressWarnings("unchecked")
    private String generateJSONStringParticipantesCandidatos(List<CustomParticipantesCandidatosDTO> customParticipantesCandidatosDTO) throws IOException, JsonGenerationException, JsonMappingException {
        ObjectMapper mapper = new ObjectMapper();

        // jsonMap Nivel 1
        HashMap<String, Object> jsonMapParticipante1 = new HashMap<String, Object>();

        // jsonMap Nivel 2
        List jsonMapParticipante2 = new ArrayList();
        HashMap<String, Object> idCellJsonMap;

        // jsonMap Nivel 3
        HashMap<String, Object> jsonParticipantes;

        int counter = 1;

        for (CustomParticipantesCandidatosDTO participante: customParticipantesCandidatosDTO) {
            jsonParticipantes = new HashMap<String, Object>();
            SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
            
            jsonParticipantes.put("num", counter);
            jsonParticipantes.put("seleccion", "");
            jsonParticipantes.put("unidad", participante.getIdUnidad() != null ? participante.getIdUnidad() + "-" + participante.getDescUnidad() : "");
            jsonParticipantes.put("nivel", participante.getIdNivelPto() != null ? participante.getIdNivelPto().toString() : "");
            jsonParticipantes.put("rfcEmpleado", participante.getRfcEmpleado() != null ? participante.getRfcEmpleado().toString() : "");
            jsonParticipantes.put("nombre", participante.getNombreEmpleado() != null ? participante.getNombreEmpleado().toString() : "");
            jsonParticipantes.put("primerApellido", participante.getPrimerApellido() != null ? participante.getPrimerApellido().toString() : "");
            jsonParticipantes.put("segundoApellido", participante.getSegundoApellido() != null ? participante.getSegundoApellido().toString() : "");
            
            jsonParticipantes.put("email", participante.getParticipanteEmailOficial() != null ? participante.getParticipanteEmailOficial().toString() : "");
            jsonParticipantes.put("emailAlterno", participante.getParticipanteEmailPersonal() != null ? participante.getParticipanteEmailPersonal().toString() : "");
            
            jsonParticipantes.put("fechaIngreso", participante.getFechaIngreso() != null ? df.format(participante.getFechaIngreso()) : "");
            jsonParticipantes.put("fechaReingreso", participante.getFechaReingreso() != null ? df.format(participante.getFechaReingreso()) : "");
            
            jsonParticipantes.put("fechaVigencia", participante.getSancionado() != null && participante.getSancionado().intValue() == 1 && participante.getVigenciaSancion() != null ? participante.getVigenciaSancion() : "");

            // jsonMap Nivel 2
            idCellJsonMap = new HashMap<String, Object>();
            idCellJsonMap.put("id", String.valueOf(counter));
            idCellJsonMap.put("cell", jsonParticipantes);
            jsonMapParticipante2.add(idCellJsonMap);
            counter++;
        }
        jsonMapParticipante1.put("page", "1");
        jsonMapParticipante1.put("total", 1);
        jsonMapParticipante1.put("records", counter > 0 ? counter - 1 : 0);
        jsonMapParticipante1.put("rows", (Object) jsonMapParticipante2);

        return mapper.writeValueAsString(jsonMapParticipante1);
    }
    
    /**
     * Asignar participante - Inscribir.
     * @author Oscar S.
     * @param model Model
     * @param asignarParticipanteDTO AsignarParticipanteDTO
     * @return String
     */
    @RequestMapping
    public String saveInscribirParticipante(Model model, AsignarParticipanteDTO asignarParticipanteDTO) {
        List<InscribirParticipanteJson> inscribirParticipanteJson = new ArrayList<InscribirParticipanteJson>();
        ObjectMapper mapper = new ObjectMapper();
        Integer ciclo = Integer.valueOf( super.security().getOperationYear());
        
        try {
            // Obtener el curso
            TnCapCursoDTO tnCapCursoDTO = super.getService(RegistroCursoSPCService.class).getCursoRegistro(asignarParticipanteDTO.getIdCurso());
            
            // Obtener el numero de participantes
            List<CustomParticipantesInscritosDTO> listaParticipantesInscritos = super.getService(RegistroCursoSPCService.class).getParticipantesInscritos(ciclo, asignarParticipanteDTO.getIdCurso());
            
            // Cadena JSON
            inscribirParticipanteJson = (List<InscribirParticipanteJson>)mapper.readValue(asignarParticipanteDTO.getPostDataInscribirParticipante(), mapper.getTypeFactory().constructCollectionType(List.class, InscribirParticipanteJson.class));
            
            // Participantes inscritos
            int contador = listaParticipantesInscritos != null && !listaParticipantesInscritos.isEmpty() ? listaParticipantesInscritos.size() : 0;
            
            for (InscribirParticipanteJson participante: inscribirParticipanteJson) {
                if (participante.getSeleccion().equals("True")) {
                    contador++;
                }
            }
            
            // Obtener el aula
            TcCapAulaDTO tcCapAulaDTO = super.getService(RegistroCursoSPCService.class).getDatosAula(tnCapCursoDTO.getIdAula());
            
            if (contador > tcCapAulaDTO.getCupoMaximoAula()) {
                super.saveError(model, "El número de participantes excede la capacidad del aula.");
            } else {
            
                for (InscribirParticipanteJson participante : inscribirParticipanteJson) {
                    if (participante.getSeleccion().equals("True")) {
                        // Obtener datos del empleado
                        TdEmpleadoDTO tdEmpleadoDTO = super.getService(RegistroCursoSPCService.class).getEmpleado(participante.getRfcEmpleado());
                        logger.debug("saveInscribirParticipante -> tdEmpleadoDTO.getIdPlazaVigente() -> " + tdEmpleadoDTO.getIdPlazaVigente());
                        
                        // Obtener datos de la plaza
                        TdPlazaDTO tdPlazaDTO = super.getService(RegistroCursoSPCService.class).getPlaza(tdEmpleadoDTO.getIdPlazaVigente());
                        logger.debug("saveInscribirParticipante -> tdPlazaDTO.getIdPuestoNom() -> " + tdPlazaDTO.getIdPuestoNom());
                        
                        // Asignar participante
                        TnCapParticipanteDTO tnCapParticipanteDTO = new TnCapParticipanteDTO();
                        tnCapParticipanteDTO.setIdCurso(asignarParticipanteDTO.getIdCurso());
                        tnCapParticipanteDTO.setRfcEmpleado(tdEmpleadoDTO.getRfcEmpleado());
                        tnCapParticipanteDTO.setParticipanteNombre(tdEmpleadoDTO.getNombreEmpleado());
                        tnCapParticipanteDTO.setParticipantePrimerApellido(tdEmpleadoDTO.getPrimerApellido() != null ? tdEmpleadoDTO.getPrimerApellido() : "");
                        tnCapParticipanteDTO.setParticipanteSegundoApellido(tdEmpleadoDTO.getSegundoApellido() != null ? tdEmpleadoDTO.getSegundoApellido() : "");
                        tnCapParticipanteDTO.setIdUnidad(participante.getUnidad().substring(0,3));
                        tnCapParticipanteDTO.setIdPuestoNom(tdPlazaDTO.getIdPuestoNom());
                        
                        // Obtener el puesto con/sin espacios
                        TcAtributoPuestoDTO tcAtributoPuestoDTO = super.getService(RegistroCursoSPCService.class).getAtributoPuestoConEspacios(tdPlazaDTO.getIdPuestoNom());
                        logger.debug("saveInscribirParticipante -> tcAtributoPuestoDTO.getIdNivelPto() -> " + tcAtributoPuestoDTO.getIdNivelPto());
                        tnCapParticipanteDTO.setIdNivelPto(tcAtributoPuestoDTO.getIdNivelPto());
                        
                        tnCapParticipanteDTO.setIdGenero(tdEmpleadoDTO.getIdGenero() != null ? tdEmpleadoDTO.getIdGenero() : "");
                        tnCapParticipanteDTO.setParticipanteAsistencia(0);
                        tnCapParticipanteDTO.setParticipanteCalificacionIni(0);
                        tnCapParticipanteDTO.setParticipanteCalificacionFin(0);                        
                        
                        // Email
                        tnCapParticipanteDTO.setParticipanteEmail(participante.getEmail() != null ? participante.getEmail() : participante.getEmailAlterno());
                        
                        tnCapParticipanteDTO.setParticipanteCurp(tdEmpleadoDTO.getCurpEmpleado() != null ? tdEmpleadoDTO.getCurpEmpleado() : "");
                        tnCapParticipanteDTO.setParticipanteIdRusp(String.valueOf((tdEmpleadoDTO.getIdRusp() != null && tdEmpleadoDTO.getIdRusp() != 0) ? tdEmpleadoDTO.getIdRusp() : 0));
                        
                        tnCapParticipanteDTO.setUsuario(super.security().getUserName());
                        tnCapParticipanteDTO.setFecModifico(new Date());
                        tnCapParticipanteDTO.setIdSituacionParticipante(new Integer(2)); // 2 - INSCRITO
                        
                        // Actualizar registro
                        super.getService(RegistroCursoSPCService.class).saveInscribirParticipante(tnCapCursoDTO, tnCapParticipanteDTO);
                    }
                }
                
                // Mensaje de exito
                super.saveMessage(model, "sireh.label.spc.capcer.registro.saveInscribirParticipante.ok");
            }
        } catch (Exception e) {
            logger.debug("saveInscribirParticipante -> Exception -> " + e.toString());
            // Mensaje de error
            super.saveError(model, "sireh.label.spc.capcer.registro.saveInscribirParticipante.error");
        }
        
        model.addAttribute(asignarParticipanteDTO);
        return asignarParticipante(model, String.valueOf(asignarParticipanteDTO.getIdCurso()));
    }
    
    /**
     * Metodo encargado de obtener el listado de participantes inscritos.
     * @author Oscar S.
     * @param tipoCurso String
     * @param idCurso Integer
     * @param response HttpServletResponse
     */
    @RequestMapping
    public void jsonCallbackParticipantesInscritos(@RequestParam("tipoCurso") String tipoCurso, @RequestParam("idCurso") Integer idCurso, HttpServletResponse response) throws IOException {
        logger.debug("jsonCallbackParticipantesInscritos -> tipoCurso -> " + tipoCurso);
        
        // Cadena JSON
        List<CustomParticipantesInscritosDTO> customParticipantesInscritosDTO = super.getService(RegistroCursoSPCService.class).getParticipantesInscritos(Integer.valueOf(super.security().getOperationYear()), idCurso);
        logger.debug("jsonCallbackParticipantesInscritos -> customParticipantesInscritosDTO -> " + customParticipantesInscritosDTO.size());
        
        // Genera cadena JSON
        String jsonDataString = generateJSONStringParticipantesInscritos(customParticipantesInscritosDTO);
        
        response.setHeader("Cache-Control", "no-cache");
        response.setDateHeader("Expires", 0);
        response.setHeader("Pragma", "no-cache");
        response.setContentType("text/plain");
        PrintWriter out = response.getWriter();
        out.print(jsonDataString);
    }
    
    /** 
     * Particpantes inscritos - Metodo encargado de construir cadenas de tipo json con base en listas de objetos de tipo customParticipantesInscritosDTO.
     * @author Oscar S.
     * @param customParticipantesInscritosDTO List<CustomParticipantesInscritosDTO> 
     * @return String
     */
    @SuppressWarnings("unchecked")
    private String generateJSONStringParticipantesInscritos(List<CustomParticipantesInscritosDTO> customParticipantesInscritosDTO) throws IOException, JsonGenerationException, JsonMappingException {
        ObjectMapper mapper = new ObjectMapper();

        // jsonMap Nivel 1
        HashMap<String, Object> jsonMapParticipante1 = new HashMap<String, Object>();

        // jsonMap Nivel 2
        List jsonMapParticipante2 = new ArrayList();
        HashMap<String, Object> idCellJsonMap;

        // jsonMap Nivel 3
        HashMap<String, Object> jsonParticipantes;

        int counter = 1;

        for (CustomParticipantesInscritosDTO participante: customParticipantesInscritosDTO) {
            jsonParticipantes = new HashMap<String, Object>();
            jsonParticipantes.put("num", counter);
            jsonParticipantes.put("seleccion", "");
            jsonParticipantes.put("unidad", participante.getIdUnidad() != null ? participante.getIdUnidad() + "-" + participante.getDescUnidad() : "");
            jsonParticipantes.put("nivel", participante.getIdNivelPto() != null ? participante.getIdNivelPto().toString() : "");
            jsonParticipantes.put("rfcEmpleado", participante.getRfcEmpleado() != null ? participante.getRfcEmpleado().toString() : "");
            jsonParticipantes.put("nombre", participante.getNombreEmpleado() != null ? participante.getNombreEmpleado().toString() : "");
            jsonParticipantes.put("primerApellido", participante.getPrimerApellido() != null ? participante.getPrimerApellido().toString() : "");
            jsonParticipantes.put("segundoApellido", participante.getSegundoApellido() != null ? participante.getSegundoApellido().toString() : "");
            jsonParticipantes.put("email", participante.getParticipanteEmail() != null ? participante.getParticipanteEmail().toString() : "");
            jsonParticipantes.put("fechaNotificacion", participante.getParticipanteNotificacion() != null ? new SimpleDateFormat("dd/MM/yyyy").format(participante.getParticipanteNotificacion()) : "");
            jsonParticipantes.put("participanteObservaciones", participante.getParticipanteObservaciones() != null ? participante.getParticipanteObservaciones() : "");
            
            // jsonMap Nivel 2
            idCellJsonMap = new HashMap<String, Object>();
            idCellJsonMap.put("id", String.valueOf(counter));
            idCellJsonMap.put("cell", jsonParticipantes);
            jsonMapParticipante2.add(idCellJsonMap);
            counter++;
        }
        jsonMapParticipante1.put("page", "1");
        jsonMapParticipante1.put("total", 1);
        jsonMapParticipante1.put("records", counter > 0 ? counter - 1 : 0);
        jsonMapParticipante1.put("rows", (Object) jsonMapParticipante2);

        return mapper.writeValueAsString(jsonMapParticipante1);
    }
    
    /**
     * Asignar participante - Cancelar inscripcion.
     * @author Oscar S.
     * @param model Model
     * @param asignarParticipanteDTO AsignarParticipanteDTO
     * @return String
     */
    @RequestMapping
    public String saveCancelarParticipante(Model model, AsignarParticipanteDTO asignarParticipanteDTO) {
        List<CancelarParticipanteJson> cancelarParticipanteJson = new ArrayList<CancelarParticipanteJson>();
        ObjectMapper mapper = new ObjectMapper();
        
        try {
            // Cadena JSON
            cancelarParticipanteJson = (List<CancelarParticipanteJson>)mapper.readValue(asignarParticipanteDTO.getPostDataCancelarParticipante(), mapper.getTypeFactory().constructCollectionType(List.class, CancelarParticipanteJson.class));
            
            for (CancelarParticipanteJson participante : cancelarParticipanteJson) {
                if (participante.getSeleccion().equals("True")) {
                    // Actualizar registro
                    super.getService(RegistroCursoSPCService.class).saveCancelarParticipante(participante.getRfcEmpleado(), asignarParticipanteDTO);
                }
            }
            
            // Mensaje de exito
            super.saveMessage(model, "sireh.label.spc.capcer.registro.saveCancelarParticipante.ok");
        } catch (Exception e) {
            logger.debug("saveCancelarParticipante -> Exception -> " + e.toString());
            // Mensaje de error
            super.saveError(model, "sireh.label.spc.capcer.registro.saveCancelarParticipante.error");
        }
        
        model.addAttribute(asignarParticipanteDTO);
        return asignarParticipante(model, String.valueOf(asignarParticipanteDTO.getIdCurso()));
    }
    
    /**
     * Metodo que gestiona la generacion del archivo de notificacion al participante y lo descarga.
     * @author Gualberto G
     * @param response
     * @param request
     * @return String
     */
    @RequestMapping
    public String downloadNotificacion(@RequestParam("idCurso") String idCurso, @RequestParam("idModalidad") String idModalidad, HttpServletResponse response, HttpServletRequest request) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("PAR_CICLO", Integer.valueOf( super.security().getOperationYear()));
        params.put("PAR_ID_CURSO", Integer.valueOf(idCurso));
        
        String fileNameRandom = createReportNotificacion(request, params, Integer.valueOf(idModalidad));
        descargarNotificacion(fileNameRandom, response);
        return null;
    }
    
    /**
     * Metodo encargado de generar el archivo de notificacion del participante y guardarlo en la carpeta temporal
     * @author Gualberto G.
     * @param request HttpServletRequest
     * @param params Map<String, Object>
     * @return String
     */
    private String createReportNotificacion(HttpServletRequest request, Map<String, Object> params, Integer idModalidad) {
        HttpSession session;
        ServletContext servletContext;

        // Parametros iniciales
        String fileNameRandom = UUID.randomUUID().toString();

        // Paths
        session = request.getSession();
        servletContext = session.getServletContext();
        String rootPath = servletContext.getRealPath("/");
        String jasperFileName = null;

        if (idModalidad.intValue() == 1) {
            jasperFileName = JASPER_NOTIFICACION_PRESENCIAL;
        } else if (idModalidad.intValue() == 2) {
            jasperFileName = JASPER_NOTIFICACION_LINEA;
        }
        
        String reportBasePath = rootPath + "WEB-INF/reports/capcer" + File.separator;
        logger.debug("createReportNotificacion -> reportBasePath -> " + reportBasePath);
        
        // Genera archivo pdf
        String reportOutputPath = super.configuration().getString("local.temp.dir");
        logger.debug("createReportNotificacion -> reportOutputPath -> " + reportOutputPath);
        reportBasePath = reportBasePath.replace("\\", "/");
        
        String imagesPath = rootPath + "images/reports";
        String destFileName = reportOutputPath + File.separator + fileNameRandom + ".pdf";
        logger.debug("createReportNotificacion -> destFileName -> " + destFileName);
        
        String sourceFileName = reportBasePath + jasperFileName;
        params.put("IMAGES_URI", imagesPath);
        Connection conn = super.getService(RegistroCursoSPCService.class).getConnection();
        
        // Descarga archivo pdf
        try {
            JasperRunManager.runReportToPdfFile(sourceFileName, destFileName, params, conn);
        } catch (JRException e) {
            logger.debug("createReportNotificacion -> JRException -> " + e.toString());
        } finally {
            try {
                if (!conn.isClosed()) {
                    conn.close();
                }
            } catch (SQLException e) {
                logger.debug("createReportNotificacion -> SQLException -> " + e.toString());
            }
            return fileNameRandom;
        }
    }

    /**
     * Metodo encargado de descargar el archivo pdf de la notificacion
     * @uthor Gualberto G.
     * @param fileNameRandom String
     * @param response HttpServletResponse
     */
    private void descargarNotificacion(String fileNameRandom, HttpServletResponse response) {
        byte[] bytesPdf;
        File pdfFile = null;
        FileInputStream fis = null;
        String reportOutputPath = super.configuration().getString("local.temp.dir");
        String destFileName = reportOutputPath + File.separator + fileNameRandom + ".pdf";
        logger.debug("descargarNotificacion -> destFileName -> " + destFileName);
        
        try {
            pdfFile = new File(destFileName);
            if (pdfFile.exists()) {
                fis = new FileInputStream(pdfFile);
                bytesPdf = IOUtils.toByteArray(fis);
                response.setContentType("application/pdf");
                response.setContentLength(bytesPdf.length);
                response.setHeader("Content-Disposition", "attachment; filename=" + JASPER_DOWN_FILE_NAME + ".pdf");
                OutputStream out;
                out = response.getOutputStream();
                out.write(bytesPdf, 0, bytesPdf.length);
            }
        } catch (FileNotFoundException fnfe) {
            logger.debug("descargarNotificacion -> FileNotFoundException -> " + fnfe.toString());
        } catch (IOException e) {
            logger.debug("descargarNotificacion -> IOException -> " + e.toString());
        } finally {
            try {
                if (pdfFile != null && pdfFile.exists()) {
                    fis.close();
                }
            } catch (IOException ioe) {
                logger.debug("descargarNotificacion -> IOException: " + ioe.toString());
            }
        }
    }
    
    /**
     * Metodo que invoca las notificaciones de los participantes inscritos al curso.
     * @author Gualberto G./Oscar S.
     * @param model Model
     * @param asignarParticipanteDTO AsignarParticipanteDTO
     * @param request HttpServletRequest
     * @return String
     */
    @RequestMapping
    public String enviarNotificaciones(Model model, AsignarParticipanteDTO asignarParticipanteDTO, HttpServletRequest request) {
        // Consulta a los participantes
        Integer ciclo = Integer.valueOf(super.security().getOperationYear());
        
        Map<String, Object> params = null;
        Map<String, Object> mapaEmpleados = null;
        List<Map<String, Object>> listaMapas = new ArrayList<Map<String, Object>>();
        List<CancelarParticipanteJson> cancelarParticipanteJson = new ArrayList<CancelarParticipanteJson>();
        ObjectMapper mapper = new ObjectMapper();
        
        try {
            cancelarParticipanteJson = (List<CancelarParticipanteJson>)mapper.readValue(asignarParticipanteDTO.getPostDataCancelarParticipante(), mapper.getTypeFactory().constructCollectionType(List.class, CancelarParticipanteJson.class));
        } catch (JsonParseException e) {
            logger.debug("enviarNotificaciones -> JsonParseException -> " + e.toString());
        } catch (JsonMappingException e) {
            logger.debug("enviarNotificaciones -> JsonMappingException -> " + e.toString());
        } catch (IOException e) {
            logger.debug("enviarNotificaciones -> IOException -> " + e.toString());
        }
        
        for (CancelarParticipanteJson participante: cancelarParticipanteJson) {
            if (participante.getSeleccion().equals("True")) {
                logger.debug("enviarNotificaciones -> params -> " + ciclo + "-" + asignarParticipanteDTO.getIdCurso() + "-" + participante.getRfcEmpleado());
                
                params = new HashMap<String, Object>();
                params.put("PAR_CICLO", ciclo);
                params.put("PAR_ID_CURSO", asignarParticipanteDTO.getIdCurso());
                params.put("ID_MODALIDAD", asignarParticipanteDTO.getIdModalidad());
                params.put("PAR_RFC_EMPLEADO", participante.getRfcEmpleado() != null ? participante.getRfcEmpleado() : "");
                
                // TODO: Falta implementacion de notificacion en formato XML
                //ComprobanteCurso notificacionCurso = new ComprobanteCurso();
                //notificacionCurso.setIdCurso(idCurso);
                //File file = new File("C:\\file.xml");
                //JAXBContext jaxbContext = JAXBContext.newInstance(ComprobanteCurso.class);
                //Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
                // output pretty printed
                //jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
                //jaxbMarshaller.marshal(notificacionCurso, file);
                //jaxbMarshaller.marshal(notificacionCurso, System.out);
                
                String fileNameRandom = createReportNotificacion(request, params, asignarParticipanteDTO.getIdModalidad());
                String reportOutputPath = super.configuration().getString("local.temp.dir");
                String destFileName = reportOutputPath + File.separator + fileNameRandom + ".pdf";
                logger.debug("enviarNotificaciones -> destFileName -> " + destFileName);
                
                mapaEmpleados = buildMapa(participante, destFileName);
                listaMapas.add(mapaEmpleados);
            }
        }
        String usuario = super.security().getUserName();
        String rfcSesion = super.identity().get(usuario).getRfc().toUpperCase();
        String operationalYear = super.security().getOperationYear();
        super.getService(CapcerJMSService.class).sendMessages(Integer.valueOf(operationalYear), asignarParticipanteDTO.getIdCurso(), asignarParticipanteDTO.getIdModalidad(), listaMapas, rfcSesion, usuario, true);
        super.saveMessage(model, "sireh.label.spc.capcer.registro.enviarNotificaciones.ok");
        
        return consultaAsignarParticipante(model, new ConsultaCursoDTO());
    }
    
    /**
     * Construye mapa con los datos necesarios para el envío de correo con la notificación
     * @author Gualberto G./Oscar S.
     * @param participante
     * @param destFileName
     * @return mapaEmpleados Map&lt;String, Object&gt;
     */
    private Map<String, Object> buildMapa(CancelarParticipanteJson participante, String destFileName) {
        Map<String, Object> mapaEmpleados = new HashMap<String, Object>();
        
        // Fake Email Address
        String fakeEmailAddress = super.configuration().getString("capcer", "mail.fakeEmailAddress") != null ? super.configuration().getString("capcer", "mail.fakeEmailAddress") : "";
        if (!fakeEmailAddress.equals("")) {
            mapaEmpleados.put("E_MAIL", super.configuration().getString("capcer", "mail.fakeEmailAddress"));
        } else {
            mapaEmpleados.put("E_MAIL", participante.getEmail());
        }
        
        mapaEmpleados.put("RFC_EMPLEADO", participante.getRfcEmpleado() != null ? participante.getRfcEmpleado() : "");
        mapaEmpleados.put("PAR_NOMBRE_EMPLEADO", (participante.getNombre() != null ? participante.getNombre() + " " : "") + (participante.getPrimerApellido() != null ? participante.getPrimerApellido() + " " : "") + (participante.getSegundoApellido() != null ? participante.getSegundoApellido() : ""));
        mapaEmpleados.put("PAR_UNIDAD_EMPLEADO", participante.getUnidad() != null ? participante.getUnidad() : "");
        mapaEmpleados.put("DEST_FILE", destFileName);
        return mapaEmpleados;
    }
    
    /**
     * Metodo que consulta la tabla TC_CAP_NOTIF_CURSO por idModalidad.
     * @author Gualberto G.
     * @param idModalidad String
     * @param response HttpServletResponse
     * @throws IOException
     */
    @RequestMapping
    public void getTcCapNotifCursoCallBack(@RequestParam("idModalidad") String idModalidad, HttpServletResponse response) throws IOException {
        TcCapNotifCursoDTO tcCapNotifCursoDTO = null;
        
        if (idModalidad != null && idModalidad.length() > 0) {
            tcCapNotifCursoDTO = super.getService(RegistroCursoSPCService.class).getTcCapNotifCurso(new Integer(super.security().getOperationYear()), Integer.valueOf(idModalidad));
        }
        
        // Generar respuesta
        response.setHeader("Cache-Control", "no-cache");
        response.setDateHeader("Expires", 0);
        response.setHeader("Pragma", "no-cache");
        response.setContentType("text/plain");
        PrintWriter out = response.getWriter();
        out.print(tcCapNotifCursoDTO != null && idModalidad != null && !idModalidad.equals("") ? "" + tcCapNotifCursoDTO.getCapNotifCursoAsunto() + "|" + tcCapNotifCursoDTO.getCapNotifCursoMsg() : "N/A|N/A");
    }
    
    /******************************************************************************************************************************************************************************/
    
     // TODO: Asignar instructor
    /**
     * Asignar instructor - Consulta.
     * @author Martin C.
     * @param model Model
     * @param consultaCursoDTO ConsultaCursoDTO
     * @return String
     */
    @RequestMapping
    public String consultaAsignarInstructor(Model model, ConsultaCursoDTO consultaCursoDTO) {
        if (consultaCursoDTO.isCancel()) {
            consultaCursoDTO = new ConsultaCursoDTO();
        }
        else if (!consultaCursoDTO.isMuestraRegistros()) {
            consultaCursoDTO = new ConsultaCursoDTO();
        }
        consultaCursoDTO = navegacionAsignarInstructor(consultaCursoDTO);
        model.addAttribute(consultaCursoDTO);
        return super.getViewName("consultaCurso");
    }

    /**
     * Asignar instructor.
     * @author Martin C.
     * @param model Model
     * @param asignarInstructorDTO AsignarInstructorDTO
     * @param idCurso String
     * @return String
     */
    @RequestMapping
    public String asignarInstructor(Model model, AsignarInstructorDTO asignarInstructorDTO, @RequestParam("idCurso") String idCurso) {
        Integer motivoDesasigna = asignarInstructorDTO.getMotivoDesasigna();
        TnCapBitacoraInstDTO tnCapBitacoraInstrDTO = super.getService(RegistroCursoSPCService.class).getDesasignado(new Integer(idCurso));
        
        if (asignarInstructorDTO.isCancelar()) {
            asignarInstructorDTO = new AsignarInstructorDTO();
        }
        
        asignarInstructorDTO = super.getService(RegistroCursoSPCService.class).getAsignarInstructor(idCurso);
        asignarInstructorDTO.setEnCurso(validaEnCurso(asignarInstructorDTO.getFechaInicio(), asignarInstructorDTO.getFechaTermino()));
        
        if (asignarInstructorDTO == null) {
            super.saveWarning(model, "No se encontro informacion asociada a la peticion.");
            return consultaAsignarInstructor(model, new ConsultaCursoDTO());
        } else {
            asignarInstructorDTO.setUrlOrigen("consultaAsignarInstructor.do");
            asignarInstructorDTO.setUrlDestino("saveAsignarInstructor.do"); 
            asignarInstructorDTO.setIdCurso(new Integer(idCurso));
            
            // Rol Administrador de Capacitacion
            if (super.security().isUserAuthorized(SECURITY_ROL_ADM)) {
                asignarInstructorDTO.setRolAdministradorCapacitacion(true);
            } else {
                asignarInstructorDTO.setRolAdministradorCapacitacion(false);
            }
            
            // Rol Operador de Capacitacion
            if (super.security().isUserAuthorized(SECURITY_ROL_OPER)) {
                asignarInstructorDTO.setRolOperadorCapacitacion(true);
            } else {
                asignarInstructorDTO.setRolOperadorCapacitacion(false);
            }
            
            if(tnCapBitacoraInstrDTO.getIdMotivoDesasignaInstr() != null && tnCapBitacoraInstrDTO.getIdInstrSup() == null && asignarInstructorDTO.isEnCurso()){
                asignarInstructorDTO.setDesAsignado(true);
                String instructorDesasignado = tnCapBitacoraInstrDTO.getIdInstrTit() + " - " + super.getService(RegistroCursoSPCService.class).getInstructor(tnCapBitacoraInstrDTO.getIdInstrTit());
                asignarInstructorDTO.setInstructorTitular(instructorDesasignado);
            }
            
            asignarInstructorDTO.setMotivoDesasigna(motivoDesasigna);
            asignarInstructorDTO.setInterior("Asignar Instructor");
            model.addAttribute(asignarInstructorDTO);
            return super.getViewName("asignarInstructor");
        }
    }

    /**
     * Asignar instructor titular.
     * @author Martin C.
     * @param model Model
     * @param asignarInstructorDTO AsignarInstructorDTO
     * @return String
     */
    @RequestMapping
    public String saveAsignarInstructor(Model model, AsignarInstructorDTO asignarInstructorDTO) {
        if (asignarInstructorDTO.isAsignarTitular()) {
            if (asignarInstructorDTO.getIdInstructor().equalsIgnoreCase("0")) {
                super.saveError(model, "Seleccione un instructor de la lista desplegable de instructores; Es obligatorio en la asignacion del instructor titular.");
                return asignarInstructor(model, asignarInstructorDTO, asignarInstructorDTO.getIdCurso().toString());
            } else {
                asignarInstructorDTO.setIdInstructorTitular(asignarInstructorDTO.getIdInstructor());
                super.getService(RegistroCursoSPCService.class).saveAsignarInstructor(asignarInstructorDTO);
                String instructor = super.getService(RegistroCursoSPCService.class).getInstructor(new Integer(asignarInstructorDTO.getIdInstructorTitular()));
                super.saveMessage(model, "<<  " + instructor.toUpperCase() + "  >>  ha sido asignado al curso de << " + asignarInstructorDTO.getNombreCurso().toUpperCase() + " >> como instructor << TITULAR >> exitosamente.");
            }
        } 
        else if (asignarInstructorDTO.isAsignarSuplente()) {
            if (asignarInstructorDTO.getIdInstructor().equalsIgnoreCase("0")) {
                super.saveError(model, "Seleccione un instructor de la lista desplegable de instructores; Es obligatorio en la asignacion del instructor suplente.");
                return asignarInstructor(model, asignarInstructorDTO, asignarInstructorDTO.getIdCurso().toString());
            } else {
                asignarInstructorDTO.setIdInstructorSuplente(asignarInstructorDTO.getIdInstructor());
                super.getService(RegistroCursoSPCService.class).saveAsignarInstructor(asignarInstructorDTO);
                String instructor = super.getService(RegistroCursoSPCService.class).getInstructor(new Integer(asignarInstructorDTO.getIdInstructorSuplente()));
                super.saveMessage(model, "<<  " + instructor.toUpperCase() + "  >>  ha sido asignado al curso de << " + asignarInstructorDTO.getNombreCurso().toUpperCase() + " >> como instructor << SUPLENTE >> exitosamente.");
            }
        }
        /***** DESASIGNAR TITULAR *****/
        else if (asignarInstructorDTO.isDesasignarTitular()) {
            if(asignarInstructorDTO.isEnCurso()){
                if(asignarInstructorDTO.isRolAdministradorCapacitacion()){
                    if(asignarInstructorDTO.getMotivoDesasigna().equals("0")){
                        super.saveError(model, "Para desasigar el instructor Titular debe seleccionar un motivo; Seleccione la causa de la lista del campo Causas de desasignacion.");
                        return asignarInstructor(model, asignarInstructorDTO, asignarInstructorDTO.getIdCurso().toString());
                    }
                    else if (asignarInstructorDTO.getMotivoDesasigna() == 1) {
                        super.getService(RegistroCursoSPCService.class).saveAsignarInstructor(asignarInstructorDTO);
                        String instructor = super.getService(RegistroCursoSPCService.class).getInstructor(new Integer(asignarInstructorDTO.getInstructorTitular().split(" - ")[0]));
                        super.saveMessage(model, "El instructor titular <<  " + instructor.toUpperCase() + "  >> ha sido desasignado del curso de << " + asignarInstructorDTO.getNombreCurso().toUpperCase() + " >> y betado de la lista de instructore exitosamente.");
                    }
                    else {
                        super.getService(RegistroCursoSPCService.class).saveAsignarInstructor(asignarInstructorDTO);
                        String instructor = super.getService(RegistroCursoSPCService.class).getInstructor(new Integer(asignarInstructorDTO.getInstructorTitular().split(" - ")[0]));
                        super.saveMessage(model, "El instructor titular <<  " + instructor.toUpperCase() + "  >> ha sido desasignado del curso de << " + asignarInstructorDTO.getNombreCurso().toUpperCase() + " >> exitosamente.");
                    }
                }
                else {
                    super.saveError(model, "Para cursos que ya iniciaron, solo el administrador de capacitacion puede desasignar al instructor titular");
                    return asignarInstructor(model, asignarInstructorDTO, asignarInstructorDTO.getIdCurso().toString());
                }
            }
            else {
                if(asignarInstructorDTO.getMotivoDesasigna().equals("0")){
                    super.saveError(model, "Para desasigar el instructor Titular debe seleccionar un motivo; Seleccione la causa de la lista del campo Causas de desasignacion.");
                    return asignarInstructor(model, asignarInstructorDTO, asignarInstructorDTO.getIdCurso().toString());
                }
                else {
                    super.getService(RegistroCursoSPCService.class).saveAsignarInstructor(asignarInstructorDTO);
                    String instructor = super.getService(RegistroCursoSPCService.class).getInstructor(new Integer(asignarInstructorDTO.getInstructorTitular().split(" - ")[0]));
                    super.saveMessage(model, "El instructor titular <<  " + instructor.toUpperCase() + "  >> ha sido desasignado del curso de << " + asignarInstructorDTO.getNombreCurso().toUpperCase() + " >> exitosamente.");
                }
            }
        }
    else if (asignarInstructorDTO.isDesasignarSuplente()) {
            if(asignarInstructorDTO.isEnCurso() && asignarInstructorDTO.getMotivoDesasigna().equals("0") && asignarInstructorDTO.isRolAdministradorCapacitacion()){
                super.saveError(model, "Para desasigar el instructor Suplente debe seleccionar un motivo; Seleccione la causa de la lista del campo Causas de desasignacion.");
                return asignarInstructor(model, asignarInstructorDTO, asignarInstructorDTO.getIdCurso().toString());
            }
            super.getService(RegistroCursoSPCService.class).saveAsignarInstructor(asignarInstructorDTO);
            String instructor = super.getService(RegistroCursoSPCService.class).getInstructor(new Integer(asignarInstructorDTO.getInstructorSuplente().split(" - ")[0]));
            super.saveMessage(model, "\"El instructor suplente <<  " + instructor.toUpperCase() + "  >> ha sido desasignado del curso de << " + asignarInstructorDTO.getNombreCurso().toUpperCase() + " >> exitosamente.");
        }
        return asignarInstructor(model, asignarInstructorDTO, asignarInstructorDTO.getIdCurso().toString());
    }

    /**
     * Asignar instructor - Navegacion
     * @author Martin C.
     * @param consultaCursoDTO ConsultaCursoDTO
     * @return consultaCursoDTO ConsultaCursoDTO
     */
    private ConsultaCursoDTO navegacionAsignarInstructor(ConsultaCursoDTO consultaCursoDTO) {
        // Interior 
        consultaCursoDTO.setInterior("Asignar Instructor");
        consultaCursoDTO.setControl(ASIGNAR_INSTRUCTOR);

        // Navegacion
        consultaCursoDTO.setUrlOrigen("consultaAsignarInstructor.do");
        consultaCursoDTO.setUrlDestino("consultaAsignarInstructor.do");
        consultaCursoDTO.setUrlRegistroCurso("registrarCurso");
        consultaCursoDTO.setUrlDeleteRegistroCurso("deleteRegistroCurso");
        consultaCursoDTO.setLinkDestino("asignarInstructor.do");
        consultaCursoDTO.setParamIdDestino("idCurso");
        consultaCursoDTO.setPropertyDestino("idCursos");

        // PagedList
         consultaCursoDTO.setBeanName("consultaCurso-asignarInstructor");
        
        // Obtener roles
        List roles = super.security().getRoles();
        for (Object rol: roles) {
            logger.debug("navegacionAsignarInstructor -> Roles -> " + (String)rol);
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
        
        //consultaCursoDTO.setMuestraRegistros(true);
        
        // Filtros tipo de curso
        
        List<String> estatusCursos = new ArrayList<String>();
        estatusCursos.add("CON");
        estatusCursos.add("PRO");
        estatusCursos.add("CUR");
        estatusCursos.add("EVR");
        estatusCursos.add("EVP");
        estatusCursos.add("CER");
        estatusCursos.add("CAN");
        estatusCursos.add("ENV");
        consultaCursoDTO.setEstatusCursos(estatusCursos);
        
        return consultaCursoDTO;
    }

    /**
     * valida si la fecha actual esta en el periodo del curso
     * @author Martin C.
     * @param fechaIniCurso Date
     * @param fechaFinCurso Date
     * @return boolean
     */
    public boolean validaEnCurso(Date fechaIniCurso, Date fechaFinCurso) {
        Date hoy = new Date();
        if (hoy.before(fechaFinCurso) && hoy.after(fechaIniCurso)) {
            return true;
        } else {
            return false;
        }
    }
    
    /******************************************************************************************************************************************************************************/
    
     // TODO: Alta contrato
    /**
     * Alta contrato - Consulta.
     * @author Oscar S.
     * @param model Model
     * @param consultaContratoDTO ConsultaContratoDTO
     * @return String
     */
    @RequestMapping
    public String consultaContrato(Model model, ConsultaContratoDTO consultaContratoDTO) {
        // Limpiar objeto
        if (consultaContratoDTO.isCancel()) {
            consultaContratoDTO = new ConsultaContratoDTO();
        } else if (!consultaContratoDTO.isMuestraRegistros()) {
            consultaContratoDTO = new ConsultaContratoDTO();
        }

        // Parametros iniciales
        consultaContratoDTO = navegacionConsultaContrato(consultaContratoDTO);

        model.addAttribute(consultaContratoDTO);
        return super.getViewName("consultaContrato");
    }
    
    /**
     * Alta contrato - Metodo generico de navegacion.
     * @author Oscar S.
     * @param consultaContratoDTO ConsultaContratoDTO
     * @return consultaContratoDTO ConsultaContratoDTO
     */
    private ConsultaContratoDTO navegacionConsultaContrato(ConsultaContratoDTO consultaContratoDTO) {
        // Navegacion
        consultaContratoDTO.setUrlOrigen("consultaContrato");
        consultaContratoDTO.setUrlDestino("consultaContrato");
        consultaContratoDTO.setUrlAltaContrato("altaContrato");
        consultaContratoDTO.setUrlEditContrato("editContrato");
        consultaContratoDTO.setUrlDeleteContrato("deleteContrato");

        // PagedList
        consultaContratoDTO.setBeanName("consultaContrato-altaContrato");

        // Obtener roles
        List roles = super.security().getRoles();
        for (Object rol: roles) {
            logger.debug("navegacionAsignarContrato -> Roles -> " + (String)rol);
        }

        // Rol Administrador de Capacitacion
        if (super.security().isUserAuthorized(SECURITY_ROL_ADM)) {
            consultaContratoDTO.setRolAdministradorCapacitacion(true);
        } else {
            consultaContratoDTO.setRolAdministradorCapacitacion(false);
        }

        // Rol Ejecutivo de contratacion
        if (super.security().isUserAuthorized(SECURITY_ROL_EJE)) {
            consultaContratoDTO.setRolEjecutivoContratacion(true);
        } else {
            consultaContratoDTO.setRolEjecutivoContratacion(false);
        }

        // Filtros situacion de contrato
        List<String> estatusContratos = new ArrayList<String>();
        estatusContratos.add("REG");
        estatusContratos.add("PRO");
        estatusContratos.add("CUR");
        consultaContratoDTO.setEstatusContratos(estatusContratos);
        
        return consultaContratoDTO;
    }
    
    /**
     * Alta contrato.
     * @author Oscar S.
     * @param model Model
     * @param altaContratoDTO AltaContratoDTO
     * @return String
     */
    @RequestMapping
    public String altaContrato(Model model, AltaContratoDTO altaContratoDTO) {
        // Vista
        altaContratoDTO.setRegistrar(true);
        altaContratoDTO.setEditar(false);
        altaContratoDTO.setViewName("saveContrato");
        
        // Bloquear edicion de contrato
        altaContratoDTO.setBloquearEdicionContrato(false);
        
        // Año de operacion
        altaContratoDTO.setContratoCursoCiclo(new Integer(super.security().getOperationYear()));

        // Presupuesto
        altaContratoDTO.setContratoCursoMonto(new Double(0));
        
        // Obtener roles
        List roles = super.security().getRoles();
        for (Object rol: roles) {
            logger.debug("altaContrato -> Roles -> " + (String)rol);
        }

        // Rol Administrador de Capacitacion
        if (super.security().isUserAuthorized(SECURITY_ROL_ADM)) {
            altaContratoDTO.setRolAdministradorCapacitacion(true);
        } else {
            altaContratoDTO.setRolAdministradorCapacitacion(false);
        }

        // Rol Ejecutivo de contratacion
        if (super.security().isUserAuthorized(SECURITY_ROL_EJE)) {
            altaContratoDTO.setRolEjecutivoContratacion(true);
        } else {
            altaContratoDTO.setRolEjecutivoContratacion(false);
        }
        
        // Estatus contratos
        List<String> estatusContratos = new ArrayList<String>();
        estatusContratos.add("1"); // REGISTRADO
        altaContratoDTO.setEstatusContratos(estatusContratos);
        
        model.addAttribute(altaContratoDTO);
        return super.getViewName("altaContrato");
    }
    
    /**
     * Solicitud asincrona para validar si un número de contrato está duplicado.
     * @author Oscar S.
     * @param numeroContrato String
     * @param response HttpServletResponse
     */
    @RequestMapping
    public void getValidaContratoDuplicadoCallback(@RequestParam("idContrato") Integer idContrato, @RequestParam("numeroContrato") String numeroContrato, HttpServletResponse response) throws IOException {
        boolean duplicado = false;
        logger.debug("RegistroCursoSPCController -> getValidaContratoDuplicadoCallback -> idContrato -> " + idContrato);
        logger.debug("RegistroCursoSPCController -> getValidaContratoDuplicadoCallback -> numeroContrato -> " + numeroContrato);
        
        try {
            if (idContrato != null && idContrato > 0) {
                duplicado = false;
            } else {
                duplicado = super.getService(RegistroCursoSPCService.class).getContratoCursoNumero(numeroContrato, new Integer(super.security().getOperationYear()));
            }
        } catch (Exception e) {
            duplicado = false;
        }
        logger.debug("RegistroCursoSPCController -> getValidaContratoDuplicadoCallback -> duplicado -> " + duplicado);

        // Generar respuesta
        response.setHeader("Cache-Control", "no-cache");
        response.setDateHeader("Expires", 0);
        response.setHeader("Pragma", "no-cache");
        response.setContentType("text/plain");
        PrintWriter out = response.getWriter();
        out.print(duplicado);
    }
    
    /**
     * Alta contrato - Guardar.
     * @author Oscar S.
     * @param model Model
     * @param altaContratoDTO AltaContratoDTO
     * @return String
     */
    @RequestMapping
    public String saveContrato(Model model, AltaContratoDTO altaContratoDTO) {
        ConsultaContratoDTO consultaContratoDTO = new ConsultaContratoDTO();
        boolean duplicado = false;
        TnCapContratoCurDTO tnCapContratoCursoDTO = new TnCapContratoCurDTO();
        
        try {
            duplicado = super.getService(RegistroCursoSPCService.class).getContratoCursoNumero(altaContratoDTO.getContratoCursoNumero(), new Integer(super.security().getOperationYear()));
            
            if (duplicado) {
                super.saveError(model, "El número de contrato ya ha sido registrado.");
            } else {
                tnCapContratoCursoDTO.setIdTipoContratacion(altaContratoDTO.getIdTipoContratacion());
                tnCapContratoCursoDTO.setContratoCursoCiclo(new Integer(super.security().getOperationYear()));
                tnCapContratoCursoDTO.setContratoCursoNumero(altaContratoDTO.getContratoCursoNumero());
                tnCapContratoCursoDTO.setContratoCursoDesc(altaContratoDTO.getContratoCursoDesc() != null ? altaContratoDTO.getContratoCursoDesc() : "");
                tnCapContratoCursoDTO.setContratoCursoRep1(altaContratoDTO.getContratoCursoRep1());
                tnCapContratoCursoDTO.setContratoCursoRep2(altaContratoDTO.getContratoCursoRep2() );
                tnCapContratoCursoDTO.setContratoCursoRep3(altaContratoDTO.getContratoCursoRep3() );
                tnCapContratoCursoDTO.setContratoCursoAdministrador(altaContratoDTO.getContratoCursoAdministrador());
                tnCapContratoCursoDTO.setContratoCursoMonto(altaContratoDTO.getContratoCursoMonto() != null ? altaContratoDTO.getContratoCursoMonto()  : 0);
                tnCapContratoCursoDTO.setContratoCursoFechaAdjud(altaContratoDTO.getContratoCursoFechaAdjud());
                tnCapContratoCursoDTO.setContratoCursoFechaContr(altaContratoDTO.getContratoCursoFechaContr() );
                tnCapContratoCursoDTO.setUsuario(super.security().getUserName());
                tnCapContratoCursoDTO.setFecModifico(new Date());
                
                // Situacion del contrato
                tnCapContratoCursoDTO.setIdSituacionContrato(1); // REGISTRADO
                 
                // Guardar registro
                super.getService(RegistroCursoSPCService.class).saveContrato(tnCapContratoCursoDTO);
            }

            // Reiniciar consultaContratoDTO
            consultaContratoDTO = new ConsultaContratoDTO();
            tnCapContratoCursoDTO = new TnCapContratoCurDTO();

            // Parametros iniciales
            consultaContratoDTO = navegacionConsultaContrato(consultaContratoDTO);
            
            // Mensaje de exito
            super.saveMessage(model, "sireh.label.spc.capcer.registro.altaContrato.ok");
        } catch (Exception e) {
            logger.debug("saveContrato -> Exception -> " + e.toString());
            // Mensaje de error
            super.saveError(model, "sireh.label.spc.capcer.registro.altaContrato.error");
        }
        model.addAttribute(consultaContratoDTO);
        return consultaContrato(model, consultaContratoDTO);
    }
    
    /**
     * Alta contrato - Consulta el contrato a editar mediante el objeto customAltaContratoDTO.
     * @author Oscar S.
     * @param model Model
     * @param idContrato Integer
     * @return String
     */
    @RequestMapping
    public String editContrato(Model model, @RequestParam("idContrato") Integer idContrato) {
        // Obtener el contrato
        CustomAltaContratoDTO customAltaContratoDTO = super.getService(RegistroCursoSPCService.class).getContratoCustom(idContrato);
        
        // Inicializar Objeto
        AltaContratoDTO altaContratoDTO = new AltaContratoDTO();
        
        altaContratoDTO.setIdContratoCurso(customAltaContratoDTO.getIdContratoCurso());
        altaContratoDTO.setIdTipoContratacion(customAltaContratoDTO.getIdTipoContratacion());
        altaContratoDTO.setContratoCursoCiclo(customAltaContratoDTO.getContratoCursoCiclo());
        altaContratoDTO.setContratoCursoNumero(customAltaContratoDTO.getContratoCursoNumero());
        altaContratoDTO.setContratoCursoDesc(customAltaContratoDTO.getContratoCursoDesc() != null ? customAltaContratoDTO.getContratoCursoDesc() : "");
        altaContratoDTO.setContratoCursoRep1(customAltaContratoDTO.getContratoCursoRep1() != null ? customAltaContratoDTO.getContratoCursoRep1() : "");
        altaContratoDTO.setContratoCursoRep2(customAltaContratoDTO.getContratoCursoRep2() != null ? customAltaContratoDTO.getContratoCursoRep2() : "");
        altaContratoDTO.setContratoCursoRep3(customAltaContratoDTO.getContratoCursoRep3() != null ? customAltaContratoDTO.getContratoCursoRep3() : "");
        altaContratoDTO.setContratoCursoAdministrador(customAltaContratoDTO.getContratoCursoAdministrador() != null ? customAltaContratoDTO.getContratoCursoAdministrador() : "");
        altaContratoDTO.setContratoCursoMonto(customAltaContratoDTO.getContratoCursoMonto() != null ? customAltaContratoDTO.getContratoCursoMonto() : 0);
        altaContratoDTO.setContratoCursoFechaAdjud(customAltaContratoDTO.getContratoCursoFechaAdjud());
        altaContratoDTO.setContratoCursoFechaContr(customAltaContratoDTO.getContratoCursoFechaContr());
        altaContratoDTO.setIdSituacionContrato(customAltaContratoDTO.getIdSituacionContrato());
        
        List<String> estatusContratos = new ArrayList<String>();
        
        if (customAltaContratoDTO.getIdSituacionContrato() == 1) { // REGISTRADO
            altaContratoDTO.setRegistrar(false);
            altaContratoDTO.setEditar(true);
            
            // Bloquear edicion de contrato
            altaContratoDTO.setBloquearEdicionContrato(false);
            
            // Estatus contratos
            estatusContratos.add("1"); // REGISTRADO
            estatusContratos.add("2"); // ADECUACION EXPEDIENTE
            
            // Facturas
            altaContratoDTO.setMostrarCursosFacturas(false);
            altaContratoDTO.setRegistrarCursos(false);
            altaContratoDTO.setRegistrarFacturas(false);
            
            // Seccion
            altaContratoDTO.setSeccion("Asignar Cursos");
            
        } else if (customAltaContratoDTO.getIdSituacionContrato() == 2) {
            altaContratoDTO.setRegistrar(false);
            altaContratoDTO.setEditar(true);
            
            // Bloquear edicion de contrato
            altaContratoDTO.setBloquearEdicionContrato(false);
            
            // Estatus contratos
            estatusContratos.add("2"); // ADECUACION EXPEDIENTE
            estatusContratos.add("3"); // ESTUDIO DE MERCADO
            
            // Facturas
            altaContratoDTO.setMostrarCursosFacturas(true);
            altaContratoDTO.setRegistrarCursos(true);
            altaContratoDTO.setRegistrarFacturas(false);
            
            // Seccion
            altaContratoDTO.setSeccion("Asignar Cursos");
            
        } else if (customAltaContratoDTO.getIdSituacionContrato() == 3) {
            altaContratoDTO.setRegistrar(false);
            altaContratoDTO.setEditar(true);
            
            // Bloquear edicion de contrato
            altaContratoDTO.setBloquearEdicionContrato(false);
            
            // Estatus contratos
            estatusContratos.add("3"); // ESTUDIO DE MERCADO
            estatusContratos.add("4"); // INTEGRACIÓN DE EXPEDIENTE
            
            // Facturas
            altaContratoDTO.setMostrarCursosFacturas(true);
            altaContratoDTO.setRegistrarCursos(true);
            altaContratoDTO.setRegistrarFacturas(false);
            
            // Seccion
            altaContratoDTO.setSeccion("Asignar Cursos");
            
        } else if (customAltaContratoDTO.getIdSituacionContrato() == 4) {
            altaContratoDTO.setRegistrar(false);
            altaContratoDTO.setEditar(true);
            
            // Bloquear edicion de contrato
            altaContratoDTO.setBloquearEdicionContrato(false);
            
            // Estatus contratos
            estatusContratos.add("4"); // INTEGRACIÓN DE EXPEDIENTE
            estatusContratos.add("5"); // EN ESPERA DEL PROYECTO PARA FIRMA DEL PROVEEDOR Y DEL ÁREA
            
            // Facturas
            altaContratoDTO.setMostrarCursosFacturas(true);
            altaContratoDTO.setRegistrarCursos(true);
            altaContratoDTO.setRegistrarFacturas(false);
            
            // Seccion
            altaContratoDTO.setSeccion("Asignar Cursos");
             
        } else if (customAltaContratoDTO.getIdSituacionContrato() == 5) {
            altaContratoDTO.setRegistrar(false);
            altaContratoDTO.setEditar(true);
            
            // Bloquear edicion de contrato
            altaContratoDTO.setBloquearEdicionContrato(false);
            
            // Estatus contratos
            estatusContratos.add("5"); // EN ESPERA DEL PROYECTO PARA FIRMA DEL PROVEEDOR Y DEL ÁREA
            estatusContratos.add("6"); // EN FIRMA DE LA DGRMOPYSG
            
             // Facturas
             altaContratoDTO.setMostrarCursosFacturas(true);
             altaContratoDTO.setRegistrarCursos(true);
             altaContratoDTO.setRegistrarFacturas(false);
             
             // Seccion
             altaContratoDTO.setSeccion("Asignar Cursos");
            
        } else if (customAltaContratoDTO.getIdSituacionContrato() == 6) {
            altaContratoDTO.setRegistrar(false);
            altaContratoDTO.setEditar(true);
            
            // Bloquear edicion de contrato
            altaContratoDTO.setBloquearEdicionContrato(true);
            
            // Estatus contratos
            estatusContratos.add("6"); // EN FIRMA DE LA DGRMOPYSG
            estatusContratos.add("7"); // EN PROCESO DE INVITACIÓN A CUANDO MENOS TRES PERSONAS
            
            // Facturas
            altaContratoDTO.setMostrarCursosFacturas(true);
            altaContratoDTO.setRegistrarCursos(false);
            altaContratoDTO.setRegistrarFacturas(true);
            
            // Seccion
            altaContratoDTO.setSeccion("Asignar Cursos");
            
        } else if (customAltaContratoDTO.getIdSituacionContrato() == 7) {
            altaContratoDTO.setRegistrar(false);
            altaContratoDTO.setEditar(true);
            
            // Bloquear edicion de contrato
            altaContratoDTO.setBloquearEdicionContrato(true);
            
            // Estatus contratos
            estatusContratos.add("7"); // EN PROCESO DE INVITACIÓN A CUANDO MENOS TRES PERSONAS
            estatusContratos.add("8"); // ADECUACIÓN DE EXPEDIENTE
            
            // Facturas
            altaContratoDTO.setMostrarCursosFacturas(true);
            altaContratoDTO.setRegistrarCursos(false);
            altaContratoDTO.setRegistrarFacturas(true);
            
            // Seccion
            altaContratoDTO.setSeccion("Asignar Facturas");
            
        } else if (customAltaContratoDTO.getIdSituacionContrato() == 8) {
            altaContratoDTO.setRegistrar(false);
            altaContratoDTO.setEditar(true);
            
            // Bloquear edicion de contrato
            altaContratoDTO.setBloquearEdicionContrato(true);
            
            // Estatus contratos
            estatusContratos.add("8"); // ADECUACIÓN DE EXPEDIENTE
            estatusContratos.add("9"); // EN FIRMA DEL PROVEEDOR
            
            // Facturas
            altaContratoDTO.setMostrarCursosFacturas(true);
            altaContratoDTO.setRegistrarCursos(false);
            altaContratoDTO.setRegistrarFacturas(true);
            
            // Seccion
            altaContratoDTO.setSeccion("Asignar Facturas");
            
        } else if (customAltaContratoDTO.getIdSituacionContrato() == 9) {
            altaContratoDTO.setRegistrar(false);
            altaContratoDTO.setEditar(true);
            
            // Bloquear edicion de contrato
            altaContratoDTO.setBloquearEdicionContrato(true);
            
            // Estatus contratos
            estatusContratos.add("9"); // EN FIRMA DEL PROVEEDOR
            estatusContratos.add("10"); // PROYECTO DE CONTRATO EN REVISIÓN DEL PROVEEDOR.
            
            // Facturas
            altaContratoDTO.setMostrarCursosFacturas(true);
            altaContratoDTO.setRegistrarCursos(false);
            altaContratoDTO.setRegistrarFacturas(true);
            
            // Seccion
            altaContratoDTO.setSeccion("Asignar Facturas");
            
        } else if (customAltaContratoDTO.getIdSituacionContrato() == 10) {
            altaContratoDTO.setRegistrar(false);
            altaContratoDTO.setEditar(true);
            
            // Bloquear edicion de contrato
            altaContratoDTO.setBloquearEdicionContrato(true);
            
            // Estatus contratos
            estatusContratos.add("10"); // PROYECTO DE CONTRATO EN REVISIÓN DEL PROVEEDOR.
            estatusContratos.add("11"); // TERMINADO EL PROCESO DE CONTRATACIÓN
            
            // Facturas
            altaContratoDTO.setMostrarCursosFacturas(true);
            altaContratoDTO.setRegistrarCursos(false);
            altaContratoDTO.setRegistrarFacturas(true);
            
        } else if (customAltaContratoDTO.getIdSituacionContrato() == 11) {
            altaContratoDTO.setRegistrar(false);
            altaContratoDTO.setEditar(true);
            
            // Bloquear edicion de contrato
            altaContratoDTO.setBloquearEdicionContrato(true);
            
            // Estatus contratos
            estatusContratos.add("11"); // TERMINADO EL PROCESO DE CONTRATACIÓN
            estatusContratos.add("12"); // TERMINADO EL PROCESO DE CONTRATACIÓN Y EL SERVICIO
            
            // Facturas
            altaContratoDTO.setMostrarCursosFacturas(true);
            altaContratoDTO.setRegistrarCursos(false);
            altaContratoDTO.setRegistrarFacturas(true);
            
            // Seccion
            altaContratoDTO.setSeccion("Asignar Facturas");
            
        } else if (customAltaContratoDTO.getIdSituacionContrato() == 12) {
            altaContratoDTO.setRegistrar(false);
            altaContratoDTO.setEditar(true);
            
            // Bloquear edicion de contrato
            altaContratoDTO.setBloquearEdicionContrato(true);
            
            // Estatus contratos
            estatusContratos.add("12"); // TERMINADO EL PROCESO DE CONTRATACIÓN Y EL SERVICIO
            
            // Facturas
            altaContratoDTO.setMostrarCursosFacturas(true);
            altaContratoDTO.setRegistrarCursos(false);
            altaContratoDTO.setRegistrarFacturas(true);
            
            // Seccion
            altaContratoDTO.setSeccion("Asignar Facturas");
            
        } else {
            altaContratoDTO.setRegistrar(false);
            altaContratoDTO.setEditar(true);            
            
            // Bloquear edicion de contrato
            altaContratoDTO.setBloquearEdicionContrato(true);
            
            // Estatus contratos
            estatusContratos.add("13"); // CANCELADO
            
            // Facturas
            altaContratoDTO.setMostrarCursosFacturas(false);
            altaContratoDTO.setRegistrarCursos(false);
            altaContratoDTO.setRegistrarFacturas(true);
            
            // Seccion
            altaContratoDTO.setSeccion("Asignar Facturas");
        }
        altaContratoDTO.setEstatusContratos(estatusContratos);
        
        // Vista
        altaContratoDTO.setViewName("updateContrato");
        
        // Obtener roles
        List roles = super.security().getRoles();
        for (Object rol: roles) {
            logger.debug("editContrato -> Roles -> " + (String)rol);
        }

        // Rol Administrador de Capacitacion
        if (super.security().isUserAuthorized(SECURITY_ROL_ADM)) {
            altaContratoDTO.setRolAdministradorCapacitacion(true);
        } else {
            altaContratoDTO.setRolAdministradorCapacitacion(false);
        }

        // Rol Ejecutivo de contratacion
        if (super.security().isUserAuthorized(SECURITY_ROL_EJE)) {
            altaContratoDTO.setRolEjecutivoContratacion(true);
        } else {
            altaContratoDTO.setRolEjecutivoContratacion(false);
        }
        model.addAttribute(altaContratoDTO);
        return super.getViewName("altaContrato");
    }
    
    /**
     * Alta contrato - Actualiza el contrato mediante el objeto altaContratoDTO.
     * @author Oscar S.
     * @param model Model
     * @param altaContratoDTO AltaContratoDTO
     * @return String
     */
    @RequestMapping
    public String updateContrato(Model model, AltaContratoDTO altaContratoDTO) {
        ConsultaContratoDTO consultaContratoDTO = new ConsultaContratoDTO();
        boolean duplicado = false;
        TnCapContratoCurDTO tnCapContratoCursoDTO = new TnCapContratoCurDTO();
        List<CustomCursosFacturasDTO> cursosAsignados = new ArrayList<CustomCursosFacturasDTO>();
        
        try {
            // Numero de contrato
            String numeroContrato = altaContratoDTO.getContratoCursoNumero();
            
            // Obtener registro
            tnCapContratoCursoDTO = super.getService(RegistroCursoSPCService.class).getContrato(altaContratoDTO.getIdContratoCurso());
            logger.debug("RegistroCursoSPCController -> updateContrato -> idContratoCurso -> " + tnCapContratoCursoDTO.getIdContratoCurso());
            logger.debug("RegistroCursoSPCController -> updateContrato -> " + altaContratoDTO.getIdContratoCurso() + "-" + numeroContrato + "-" + altaContratoDTO.getContratoCursoCiclo());
            
            java.util.Date fechaOriginalAdjud = tnCapContratoCursoDTO.getContratoCursoFechaAdjud();
            java.util.Date fechaNuevaAdjud = altaContratoDTO.getContratoCursoFechaAdjud();            
            logger.debug("RegistroCursoSPCController -> updateContrato -> fechaNuevaContrato -> " + fechaNuevaAdjud);
            logger.debug("RegistroCursoSPCController -> updateContrato -> fechaOriginalContrato -> " + fechaOriginalAdjud);
            
            // Validar cambio de fechas
            int cambioFechas = fechaNuevaAdjud.compareTo(fechaOriginalAdjud);
            logger.debug("RegistroCursoSPCController -> updateContrato -> cambioFechas: " + cambioFechas);
            // 0 - iguales
            // 1 - fechaNuevaContrato es mayor
            //-1 - fechaNuevaContrato es menor
            
            // Mismo contrato
            if ((tnCapContratoCursoDTO.getIdContratoCurso().intValue() == altaContratoDTO.getIdContratoCurso().intValue()) && 
                (tnCapContratoCursoDTO.getContratoCursoNumero().equals(numeroContrato)) && 
                (tnCapContratoCursoDTO.getContratoCursoCiclo() == altaContratoDTO.getContratoCursoCiclo().intValue())) {
                logger.debug("RegistroCursoSPCController -> updateContrato -> Mismo contrato");

                // Preparar objeto
                tnCapContratoCursoDTO = initObjetoContrato(numeroContrato, tnCapContratoCursoDTO, altaContratoDTO);
                
                // Situacion del contrato
                tnCapContratoCursoDTO.setIdSituacionContrato(altaContratoDTO.getIdSituacionContrato());

                // Movimiento
                int idMovimiento = super.configuration().getNumber("movCapCode", "ACT_ASIGNAR_CONTRATO").intValue();
                
                // Situacion del contrato 6 - EN FIRMA DE LA DGRMOPYSG
                if (altaContratoDTO.getIdSituacionContrato() == 6) {
                    logger.debug("RegistroCursoSPCController -> updateContrato -> Mismo contrato -> Situacion contrato == 6");
                    
                    // Cursos asignados
                    cursosAsignados = super.getService(RegistroCursoSPCService.class).getCursosFacturas(tnCapContratoCursoDTO.getContratoCursoCiclo(), tnCapContratoCursoDTO.getIdContratoCurso(), "", true);
                    
                    if (numeroContrato.toLowerCase().contains("CONT-TEMP".toLowerCase())) {
                        // Validar el numero de contrato, no debe ser temporal
                        logger.debug("RegistroCursoSPCController -> updateContrato -> Mismo contrato -> Situacion contrato == 6, Error: tiene contrato temporal");
                        super.saveError(model, "Debe ingresar un número de contrato válido para el cambio de situación de contrato: 6 - EN FIRMA DE LA DGRMOPYSG");
                        initConsultaContrato(model, consultaContratoDTO);
                        
                    } else if (cursosAsignados.size() == 0) {
                        // Validar que tenga cursos asignados
                        logger.debug("RegistroCursoSPCController -> updateContrato -> Mismo contrato -> Situacion contrato == 6, Error: mo tiene cursos asignados");
                        super.saveError(model, "No existen cursos asignados. Favor de verificar.");
                        initConsultaContrato(model, consultaContratoDTO);
                     
                    } else {
                    
                        if (cambioFechas == 1) {
                            // Cambio de fecha, 1 - fechaNuevaContrato es mayor
                            logger.debug("RegistroCursoSPCController -> updateContrato -> Mismo contrato -> Situacion contrato == 6 -> Cambio de fechas");
                            
                            List<CustomCursosFacturasDTO> cursosAfectados = new ArrayList<CustomCursosFacturasDTO>();
                            for (CustomCursosFacturasDTO cursoAsignado : cursosAsignados) {
                                // 0 - iguales
                                // 1 - fechaNuevaContrato es mayor
                                //-1 - fechaNuevaContrato es menor
                                int cambio = fechaNuevaAdjud.compareTo(cursoAsignado.getCursoFecIni());
                                logger.debug("RegistroCursoSPCController -> updateContrato -> Mismo contrato -> Situacion contrato == 6 -> Cambio de fechas -> " + cambio + " curso: " + cursoAsignado.getIdCurso());
                                 
                                if (cambio == 1) {
                                    cursosAfectados.add(cursoAsignado);
                                }
                            }
                            
                            // Cambio de fecha - desasignar cursos afectados
                            super.getService(RegistroCursoSPCService.class).desasignaCursosPorCambioFecha(cursosAfectados);
                            
                            // Actualizar registro
                            super.getService(RegistroCursoSPCService.class).updateContrato(tnCapContratoCursoDTO, idMovimiento);
                            
                            // Mensaje exito
                            super.saveMessage(model, "Se desasignaron " + cursosAfectados.size() + " curso(s) al contrato: " + tnCapContratoCursoDTO.getContratoCursoNumero());
                            
                            initConsultaContrato(model, consultaContratoDTO);
                            
                        } else {
                            // Actualizacion normal
                            logger.debug("RegistroCursoSPCController -> updateContrato -> Mismo contrato -> Situacion contrato == 6, Ok: No tiene contrato temporal");
                            // Actualizar registro
                            super.getService(RegistroCursoSPCService.class).updateContrato(tnCapContratoCursoDTO, idMovimiento);
                        }
                    }
                } else {
                    if (cambioFechas == 1) {
                        // Cambio de fecha, 1 - fechaNuevaContrato es mayor
                        logger.debug("RegistroCursoSPCController -> updateContrato -> Mismo contrato -> Situacion contrato != 6 -> Cambio de fechas");
                        
                        List<CustomCursosFacturasDTO> cursosAfectados = new ArrayList<CustomCursosFacturasDTO>();
                        for (CustomCursosFacturasDTO cursoAsignado : cursosAsignados) {
                            // 0 - iguales
                            // 1 - fechaNuevaContrato es mayor
                            //-1 - fechaNuevaContrato es menor
                            int cambio = fechaNuevaAdjud.compareTo(cursoAsignado.getCursoFecIni());
                            logger.debug("RegistroCursoSPCController -> updateContrato -> Mismo contrato -> Situacion contrato != 6 -> Cambio de fechas -> " + cambio + " curso: " + cursoAsignado.getIdCurso());
                             
                            if (cambio == 1) {
                                cursosAfectados.add(cursoAsignado);
                            }
                        }
                        
                        // Cambio de fecha - desasignar cursos afectados
                        super.getService(RegistroCursoSPCService.class).desasignaCursosPorCambioFecha(cursosAfectados);
                        
                        // Actualizar registro
                        super.getService(RegistroCursoSPCService.class).updateContrato(tnCapContratoCursoDTO, idMovimiento);
                        
                        // Mensaje exito
                        super.saveMessage(model, "Se desasignaron " + cursosAfectados.size() + " curso(s) al contrato: " + tnCapContratoCursoDTO.getContratoCursoNumero());
                        
                        initConsultaContrato(model, consultaContratoDTO);
                        
                    } else {
                        // Actualizacion normal
                        logger.debug("RegistroCursoSPCController -> updateContrato -> Mismo contrato -> Situacion contrato != 6");
                        // Actualizar registro
                        super.getService(RegistroCursoSPCService.class).updateContrato(tnCapContratoCursoDTO, idMovimiento);
                    }
                }
            } else {
                // Contrato Diferente
                logger.debug("RegistroCursoSPCController -> updateContrato -> Diferente contrato");
                
                // Validar duplicidad
                duplicado = super.getService(RegistroCursoSPCService.class).getContratoCursoNumero(numeroContrato, new Integer(super.security().getOperationYear()));
                logger.debug("RegistroCursoSPCController -> updateContrato -> duplicado -> " + duplicado);
                
                if (duplicado) {
                    super.saveError(model, "El número de contrato ya ha sido registrado.");
                } else {
                    // Preparar objeto                    
                    tnCapContratoCursoDTO = initObjetoContrato(numeroContrato, tnCapContratoCursoDTO, altaContratoDTO);
                    
                    // Situacion del contrato
                    tnCapContratoCursoDTO.setIdSituacionContrato(altaContratoDTO.getIdSituacionContrato());
                    
                    // Movimiento
                    int idMovimiento = super.configuration().getNumber("movCapCode", "ACT_ASIGNAR_CONTRATO").intValue();
                    
                    // Situacion del contrato 5 - EN FIRMA DE LA DGRMOPYSG
                    if (altaContratoDTO.getIdSituacionContrato() == 6) {
                        logger.debug("RegistroCursoSPCController -> updateContrato -> Diferente contrato -> Situacion contrato == 6");
                        
                        // Cursos asignados
                        cursosAsignados = super.getService(RegistroCursoSPCService.class).getCursosFacturas(tnCapContratoCursoDTO.getContratoCursoCiclo(), tnCapContratoCursoDTO.getIdContratoCurso(), "", true);
                            
                        // Validar el numero de contrato, no debe ser temporal
                        if (numeroContrato.toLowerCase().contains("CONT-TEMP".toLowerCase())) {
                            logger.debug("RegistroCursoSPCController -> updateContrato -> Diferente contrato -> Situacion contrato == 6, Error: tiene contrato temporal");
                            super.saveError(model, "Debe ingresar un número de contrato válido para el cambio de situación de contrato: 6 - EN FIRMA DE LA DGRMOPYSG");
                            initConsultaContrato(model, consultaContratoDTO);
                            
                        } else if (cursosAsignados.size() == 0) {
                            // Validar que tenga cursos asignados
                            logger.debug("RegistroCursoSPCController -> updateContrato -> Mismo contrato -> Situacion contrato == 6, Error: mo tiene cursos asignados");
                            super.saveError(model, "No existen cursos asignados. Favor de verificar.");
                            initConsultaContrato(model, consultaContratoDTO);
                            
                        } else {
                            if (cambioFechas == 1) {
                                // Cambio de fecha, 1 - fechaNuevaContrato es mayor
                                logger.debug("RegistroCursoSPCController -> updateContrato -> Diferente contrato -> Situacion contrato == 6 -> Cambio de fechas");
                                
                                List<CustomCursosFacturasDTO> cursosAfectados = new ArrayList<CustomCursosFacturasDTO>();
                                for (CustomCursosFacturasDTO cursoAsignado : cursosAsignados) {
                                    // 0 - iguales
                                    // 1 - fechaNuevaContrato es mayor
                                    //-1 - fechaNuevaContrato es menor
                                    int cambio = fechaNuevaAdjud.compareTo(cursoAsignado.getCursoFecIni());
                                    logger.debug("RegistroCursoSPCController -> updateContrato -> Diferente contrato -> Situacion contrato == 6 -> Cambio de fechas -> " + cambio + " curso: " + cursoAsignado.getIdCurso());
                                     
                                    if (cambio == 1) {
                                        cursosAfectados.add(cursoAsignado);
                                    }
                                }
                                
                                // Cambio de fecha - desasignar cursos afectados
                                super.getService(RegistroCursoSPCService.class).desasignaCursosPorCambioFecha(cursosAfectados);
                                
                                // Actualizar registro
                                super.getService(RegistroCursoSPCService.class).updateContrato(tnCapContratoCursoDTO, idMovimiento);
                                
                                // Mensaje exito
                                super.saveMessage(model, "Se desasignaron " + cursosAfectados.size() + " curso(s) al contrato: " + tnCapContratoCursoDTO.getContratoCursoNumero());
                                
                                initConsultaContrato(model, consultaContratoDTO);
                                
                            } else {
                                // Actualizacion normal
                                logger.debug("RegistroCursoSPCController -> updateContrato -> Diferente contrato -> Situacion contrato == 6, Ok: No tiene contrato temporal");
                                // Actualizar registro
                                super.getService(RegistroCursoSPCService.class).updateContrato(tnCapContratoCursoDTO, idMovimiento);
                            }
                        }
                    } else {
                        if (cambioFechas == 1) {
                            // Cambio de fecha, 1 - fechaNuevaContrato es mayor
                            logger.debug("RegistroCursoSPCController -> updateContrato -> Diferente contrato -> Situacion contrato == 6 -> Cambio de fechas");
                            
                            List<CustomCursosFacturasDTO> cursosAfectados = new ArrayList<CustomCursosFacturasDTO>();
                            for (CustomCursosFacturasDTO cursoAsignado : cursosAsignados) {
                                // 0 - iguales
                                // 1 - fechaNuevaContrato es mayor
                                //-1 - fechaNuevaContrato es menor
                                int cambio = fechaNuevaAdjud.compareTo(cursoAsignado.getCursoFecIni());
                                logger.debug("RegistroCursoSPCController -> updateContrato -> Diferente contrato -> Situacion contrato == 6 -> Cambio de fechas -> " + cambio + " curso: " + cursoAsignado.getIdCurso());
                                 
                                if (cambio == 1) {
                                    cursosAfectados.add(cursoAsignado);
                                }
                            }
                            
                            // Cambio de fecha - desasignar cursos afectados
                            super.getService(RegistroCursoSPCService.class).desasignaCursosPorCambioFecha(cursosAfectados);
                            
                            // Actualizar registro
                            super.getService(RegistroCursoSPCService.class).updateContrato(tnCapContratoCursoDTO, idMovimiento);
                            
                            // Mensaje exito
                            super.saveMessage(model, "Se desasignaron " + cursosAfectados.size() + " curso(s) al contrato: " + tnCapContratoCursoDTO.getContratoCursoNumero());
                            
                            initConsultaContrato(model, consultaContratoDTO);
                            
                        } else {
                            // Actualizacion normal
                            logger.debug("RegistroCursoSPCController -> updateContrato -> Diferente contrato -> Situacion contrato != 6");
                            // Actualizar registro
                            super.getService(RegistroCursoSPCService.class).updateContrato(tnCapContratoCursoDTO, idMovimiento);
                        }
                    }
                }
            }
            
            // Reiniciar consultaContratoDTO
            consultaContratoDTO = new ConsultaContratoDTO();
            
            // Parametros iniciales
            consultaContratoDTO = navegacionConsultaContrato(consultaContratoDTO);
            
            // Mensaje de exito
            super.saveMessage(model, "sireh.label.spc.capcer.registro.updateContrato.ok");
        } catch (Exception e) {
            logger.debug("updateContrato -> Exception -> " + e.toString());
            // Mensaje de error
            super.saveError(model, "sireh.label.spc.capcer.registro.updateContrato.error");
        }
        model.addAttribute(consultaContratoDTO);
        return consultaContrato(model, consultaContratoDTO);
    }
    
    /**
     * Alta contrato - Inicializa objeto tnCapContratoCursoDTO
     * @author Oscar S.
     * @param numeroContrato String
     * @param tnCapContratoCursoDTO TnCapContratoCursoDTO
     * @param altaContratoDTO AltaContratoDTO
     * @return tnCapContratoCursoDTO TnCapContratoCursoDTO
     */
    private TnCapContratoCurDTO initObjetoContrato(String numeroContrato, TnCapContratoCurDTO tnCapContratoCursoDTO, AltaContratoDTO altaContratoDTO) {
        tnCapContratoCursoDTO.setContratoCursoNumero(numeroContrato);
        tnCapContratoCursoDTO.setContratoCursoDesc(altaContratoDTO.getContratoCursoDesc() != null ? altaContratoDTO.getContratoCursoDesc() : "");
        tnCapContratoCursoDTO.setIdTipoContratacion(altaContratoDTO.getIdTipoContratacion());
        tnCapContratoCursoDTO.setContratoCursoRep1(altaContratoDTO.getContratoCursoRep1());
        tnCapContratoCursoDTO.setContratoCursoRep2(altaContratoDTO.getContratoCursoRep2());
        tnCapContratoCursoDTO.setContratoCursoRep3(altaContratoDTO.getContratoCursoRep3());
        tnCapContratoCursoDTO.setContratoCursoAdministrador(altaContratoDTO.getContratoCursoAdministrador());
        tnCapContratoCursoDTO.setContratoCursoMonto(altaContratoDTO.getContratoCursoMonto() != null ? altaContratoDTO.getContratoCursoMonto()  : 0);
        tnCapContratoCursoDTO.setContratoCursoFechaAdjud(altaContratoDTO.getContratoCursoFechaAdjud());
        tnCapContratoCursoDTO.setContratoCursoFechaContr(altaContratoDTO.getContratoCursoFechaContr());
        tnCapContratoCursoDTO.setUsuario(super.security().getUserName());
        tnCapContratoCursoDTO.setFecModifico(new Date());
        return tnCapContratoCursoDTO;
    }
    
    /**
     * Alta contrato - Redirecciona a la vista consultaContrato.
     * @author Oscar S.
     * @param model Model
     * @param consultaContratoDTO consultaContratoDTO
     * @return Stgring
     */
    private String initConsultaContrato(Model model, ConsultaContratoDTO consultaContratoDTO) {
        // Reiniciar consultaContratoDTO
        consultaContratoDTO = new ConsultaContratoDTO();
        
        // Parametros iniciales
        consultaContratoDTO = navegacionConsultaContrato(consultaContratoDTO);
        
        model.addAttribute(consultaContratoDTO);
        return consultaContrato(model, consultaContratoDTO);
    }
    
    /**
     * Alta contrato - Elimina el/los contrato(s) seleccionado(s) en la pantalla de consulta.
     * @author Oscar S.
     * @param model Model
     * @param consultaContratoDTO ConsultaContratoDTO
     * @return String
     */
    @RequestMapping
    public String deleteContrato(Model model, ConsultaContratoDTO consultaContratoDTO) {
        Integer[] idContratos = consultaContratoDTO.getIdContratos();
        
        try {            
            // Eliminar contratos
            super.getService(RegistroCursoSPCService.class).deleteContrato(idContratos);

            // Mensaje de exito
            super.saveMessage(model, "sireh.label.spc.capcer.registro.eliminarContrato.ok");
        } catch (Exception e) {
            logger.debug("deleteContrato -> Exception -> " + e.toString());
            // Mensaje de error
            super.saveError(model, "sireh.label.spc.capcer.registro.eliminarContrato.error");
        }

        // Reiniciar consultaContratoDTO
        consultaContratoDTO = new ConsultaContratoDTO();

        // Parametros iniciales
        consultaContratoDTO = navegacionConsultaContrato(consultaContratoDTO);

        model.addAttribute(consultaContratoDTO);
        return consultaContrato(model, consultaContratoDTO);
    }
    
    /**
     * Alta contrato - Metodo encargado de obtener el listado de facturas por curso.
     * @author Oscar S.
     * @param response HttpServletResponse
     * @param contrato Integer
     * @param situacionContrato Integer
     * @param fechaContrato String
     * @throws IOException
     */
    @RequestMapping
    public void jsonCallbackCursosFacturas(HttpServletResponse response, 
                                           @RequestParam("contrato") Integer contrato, 
                                           @RequestParam("situacionContrato") Integer situacionContrato,
                                           @RequestParam("fechaContrato") String fechaContrato) throws IOException {
        
        // Cadena JSON
        List<CustomCursosFacturasDTO> customCursosFacturasDTO = new ArrayList<CustomCursosFacturasDTO>();
        
        if (situacionContrato == 2 || situacionContrato == 3 || situacionContrato == 4 || situacionContrato == 5) {
            customCursosFacturasDTO = super.getService(RegistroCursoSPCService.class).getCursosFacturas(Integer.valueOf(super.security().getOperationYear()), contrato, fechaContrato, false);
            logger.debug("jsonCallbackCursosFacturas -> Cursos-Facturas-Contrato");
        }
        
        if (situacionContrato > 5) { // EN ESPERA DEL PROYECTO PARA FIRMA DEL PROVEEDOR Y DEL ÁREA
            customCursosFacturasDTO = super.getService(RegistroCursoSPCService.class).getCursosFacturas(Integer.valueOf(super.security().getOperationYear()), contrato, fechaContrato, true);
            logger.debug("jsonCallbackCursosFacturas -> Cursos-Facturas");
        }
        logger.debug("jsonCallbackCursosFacturas ->customCursosFacturasDTO -> " + customCursosFacturasDTO.size());
        
        // Genera cadena JSON
        String jsonDataString = generateJSONStringCursosFacturas(customCursosFacturasDTO);
        
        response.setHeader("Cache-Control", "no-cache");
        response.setDateHeader("Expires", 0);
        response.setHeader("Pragma", "no-cache");
        response.setContentType("text/plain");
        PrintWriter out = response.getWriter();
        out.print(jsonDataString);
    }

    /** 
     * Alta contrato - Metodo encargado de construir cadenas de tipo json con base en listas de objetos de tipo CustomCursosFacturasDTO.
     * @author Oscar S.
     * @param customCursosFacturasDTO List&lt;CustomCursosFacturasDTO&gt;
     * @throws IOException, JsonGenerationException, JsonMappingException 
     * @return String
     */
    public String generateJSONStringCursosFacturas(List<CustomCursosFacturasDTO> customCursosFacturasDTO ) throws IOException, JsonGenerationException, JsonMappingException {
        ObjectMapper mapper = new ObjectMapper();

        // jsonMap Nivel 1
        HashMap<String, Object> jsonMapCursosFacturas1 = new HashMap<String, Object>();

        // jsonMap Nivel 2
        List jsonMapCursosFacturas2 = new ArrayList();
        HashMap<String, Object> idCellJsonMap;

        // jsonMap Nivel 3
        HashMap<String, Object> jsonCursosFacturas;

        int counter = 1;

        for (CustomCursosFacturasDTO cursosFacturas : customCursosFacturasDTO) {
            jsonCursosFacturas = new HashMap<String, Object>();
            SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
            
            jsonCursosFacturas.put("num", counter);
            jsonCursosFacturas.put("seleccion", "");
            jsonCursosFacturas.put("no", counter);
            jsonCursosFacturas.put("idCurso", cursosFacturas.getIdCurso() != null ? String.valueOf(cursosFacturas.getIdCurso()) : "");
            
            jsonCursosFacturas.put("coordinacion", cursosFacturas.getDescCoordinacion() != null ? String.valueOf(cursosFacturas.getDescCoordinacion()) : "");
            jsonCursosFacturas.put("curso", cursosFacturas.getDescCursoPrincipal() != null ? String.valueOf(cursosFacturas.getDescCursoPrincipal()) : "");
            
            String idContrato = cursosFacturas.getIdContratoCurso() != null ? String.valueOf(cursosFacturas.getIdContratoCurso()) : "";
            String contratoNumero = cursosFacturas.getContratoCursoNumero() != null ? String.valueOf(cursosFacturas.getContratoCursoNumero()) : "";
            jsonCursosFacturas.put("contrato", (!idContrato.equals("") && !contratoNumero.equals("")) ? (idContrato + " - " + contratoNumero) : "");
            
            jsonCursosFacturas.put("periodo", cursosFacturas.getDescPeriodo() != null ? String.valueOf(cursosFacturas.getDescPeriodo()) : "");
            
            jsonCursosFacturas.put("ejeTematico", cursosFacturas.getDescEjeTematico() != null ? String.valueOf(cursosFacturas.getDescEjeTematico()) : "");
            jsonCursosFacturas.put("subprograma", cursosFacturas.getDescSubprograma() != null ? String.valueOf(cursosFacturas.getDescSubprograma()) : "");
            jsonCursosFacturas.put("duracion", cursosFacturas.getCursoDuracion() != null ? String.valueOf(cursosFacturas.getCursoDuracion()) : "");
            jsonCursosFacturas.put("modalidad", cursosFacturas.getDescModalidad() != null ? String.valueOf(cursosFacturas.getDescModalidad()) : "");
            jsonCursosFacturas.put("finalidad", cursosFacturas.getDescFinalidad() != null ? String.valueOf(cursosFacturas.getDescFinalidad()) : "");
            jsonCursosFacturas.put("estatusCurso", cursosFacturas.getDescControlCurso() != null ? String.valueOf(cursosFacturas.getDescControlCurso()) : "");
            
            jsonCursosFacturas.put("facturaFolio", cursosFacturas.getFacturaFolio() != null ? cursosFacturas.getFacturaFolio() : "");
            jsonCursosFacturas.put("facturaMonto", cursosFacturas.getFacturaMonto() != null ? String.valueOf(cursosFacturas.getFacturaMonto()) : "0.0");
            jsonCursosFacturas.put("facturaFecha", cursosFacturas.getFacturaFecha() != null ? df.format(cursosFacturas.getFacturaFecha()) : "");
            jsonCursosFacturas.put("facturaAtentaNotaNumero", cursosFacturas.getFacturaAtentaNotaNumero() != null ? cursosFacturas.getFacturaAtentaNotaNumero() : "");
            jsonCursosFacturas.put("facturaAtentaNotaFecha", cursosFacturas.getFacturaAtentaNotaFecha() != null ? df.format(cursosFacturas.getFacturaAtentaNotaFecha()) : "");
            jsonCursosFacturas.put("facturaEstatus", cursosFacturas.getDescSituacionFactura() != null ? String.valueOf(cursosFacturas.getDescSituacionFactura()) : "");

            // jsonMap Nivel 2
            idCellJsonMap = new HashMap<String, Object>();
            idCellJsonMap.put("id", String.valueOf(counter));
            idCellJsonMap.put("cell", jsonCursosFacturas);
            jsonMapCursosFacturas2.add(idCellJsonMap);
            counter++;
        }
        jsonMapCursosFacturas1.put("page", "1");
        jsonMapCursosFacturas1.put("total", 1);
        jsonMapCursosFacturas1.put("records", counter > 0 ? counter - 1 : 0);
        jsonMapCursosFacturas1.put("rows", (Object) jsonMapCursosFacturas2);

        return mapper.writeValueAsString(jsonMapCursosFacturas1);
    }
    
    /** 
     * Alta contrato - Metodo encargado de asignar cursos al contrato.
     * @author Oscar S.
     * @param model Model
     * @param altaContratoDTO AltaContratoDTO
     * @return String
     */
    @RequestMapping
    public String saveCursosContratos(Model model, AltaContratoDTO altaContratoDTO) {
        List<CursosContratosFacturasJson> cursosContratosFacturasJson = new ArrayList<CursosContratosFacturasJson>();
        ObjectMapper mapper = new ObjectMapper();
        
        try {
            // Cadena JSON
            cursosContratosFacturasJson = (List<CursosContratosFacturasJson>)mapper.readValue(altaContratoDTO.getPostDataCursosContrato(), mapper.getTypeFactory().constructCollectionType(List.class, CursosContratosFacturasJson.class));
            
            for (CursosContratosFacturasJson cursos : cursosContratosFacturasJson) {
                if (cursos.getSeleccion().equals("True")) {
                    logger.debug("saveCursosContratos -> idCurso -> " + cursos.getIdCurso());
                    
                    // Obtener el curso
                    TnCapCursoDTO tnCapCursoDTO = super.getService(RegistroCursoSPCService.class).getCursoRegistro(new Integer(cursos.getIdCurso()));
                    tnCapCursoDTO.setIdContratoCurso(altaContratoDTO.getIdContratoCurso());
                    
                    // Movimiento
                    int idMovimiento = super.configuration().getNumber("movCapCode", "ASIGNAR_CURSO_CONTRATO").intValue();
                    
                    tnCapCursoDTO.setUsuario(super.security().getUserName());
                    tnCapCursoDTO.setFecModifico(new Date());
                    
                    // Asignar contrato al curso
                    super.getService(RegistroCursoSPCService.class).saveAsignarCursoContrato(tnCapCursoDTO, altaContratoDTO.getIdContratoCurso(), idMovimiento, false);
                }
            }
            
            // Mensaje de exito
            super.saveMessage(model, "sireh.label.spc.capcer.registro.saveCursosContratos.ok");
        } catch (Exception e) {
            logger.debug("saveCursosContratos -> Exception -> " + e.toString());
            
            // Mensaje de error
            super.saveError(model, "sireh.label.spc.capcer.registro.saveCursosContratos.error");
        }
        model.addAttribute(altaContratoDTO);
        return editContrato(model, altaContratoDTO.getIdContratoCurso());
    }
    
    /** 
     * Alta contrato - Metodo encargado de desasignar cursos al contrato.
     * @author Oscar S.
     * @param model Model
     * @param altaContratoDTO AltaContratoDTO
     * @return String
     */
    @RequestMapping
    public String deleteCursosContratos(Model model, AltaContratoDTO altaContratoDTO) {
        List<CursosContratosFacturasJson> cursosContratosFacturasJson = new ArrayList<CursosContratosFacturasJson>();
        ObjectMapper mapper = new ObjectMapper();
        
        try {
            // Cadena JSON
            cursosContratosFacturasJson = (List<CursosContratosFacturasJson>)mapper.readValue(altaContratoDTO.getPostDataCursosContrato(), mapper.getTypeFactory().constructCollectionType(List.class, CursosContratosFacturasJson.class));
            
            for (CursosContratosFacturasJson cursos : cursosContratosFacturasJson) {
                if (cursos.getSeleccion().equals("True")) {
                    logger.debug("deleteCursosContratos -> idCurso -> " + cursos.getIdCurso());
                    
                    // Obtener el curso
                    TnCapCursoDTO tnCapCursoDTO = super.getService(RegistroCursoSPCService.class).getCursoRegistro(new Integer(cursos.getIdCurso()));
                    tnCapCursoDTO.setIdContratoCurso(null);
                    
                    // Movimiento
                    int idMovimiento = super.configuration().getNumber("movCapCode", "ELIMINAR_CURSO_CONTRATO").intValue();
                    
                    tnCapCursoDTO.setUsuario(super.security().getUserName());
                    tnCapCursoDTO.setFecModifico(new Date());
                    
                    // Desasignar contrato al curso
                    super.getService(RegistroCursoSPCService.class).saveAsignarCursoContrato(tnCapCursoDTO, altaContratoDTO.getIdContratoCurso(), idMovimiento, true);
                }
            }
            
            // Mensaje de exito
            super.saveMessage(model, "sireh.label.spc.capcer.registro.deleteCursosContratos.ok");
        } catch (Exception e) {
            logger.debug("deleteCursosContratos -> Exception -> " + e.toString());
            
            // Mensaje de error
            super.saveError(model, "sireh.label.spc.capcer.registro.deleteCursosContratos.error");
        }
        
        model.addAttribute(altaContratoDTO); 
        return editContrato(model, altaContratoDTO.getIdContratoCurso());
    }
    
    /**
     * Alta contrato - Metodo encargado de obtener el listado de situaciones validas de facturas por curso.
     * @author Oscar S.
     * @param response HttpServletResponse
     * @param idCurso Integer
     * @param idContratoCurso Integer
     * @param facturaFolio String
     * @throws IOException
     */
    @RequestMapping
    public void jsonCallbackDynamicEstatusFacturas(HttpServletResponse response, 
                                                   @RequestParam("idCurso") Integer idCurso, 
                                                   @RequestParam("idContratoCurso") Integer idContratoCurso, 
                                                   @RequestParam("facturaFolio") String facturaFolio) throws IOException {
        
        boolean administrador = false;
        
        // Rol Administrador de Capacitacion
        if (super.security().isUserAuthorized(SECURITY_ROL_ADM)) {
            administrador = true;
        } else {
            administrador = false;
        }
        logger.debug("jsonCallbackDynamicEstatusFacturas -> administrador -> " + administrador);
        
        // Listado de estatus
        List<ItemDTO> estatusFacturasList = super.getService(RegistroCursoSPCService.class).getDynamicEstatusFacturas(idCurso, idContratoCurso, facturaFolio, administrador);
        
        // Genera cadena JSON
        String jsonDataString = "{}";
        
        try {
            jsonDataString = generateJSONStringDynamicEstatusFacturas(estatusFacturasList);
            logger.debug("jsonCallbackDynamicEstatusFacturas -> jsonDataString -> " + jsonDataString);
        } catch (Exception e) {
            logger.debug("jsonCallbackDynamicEstatusFacturas -> Exception -> " + e.toString());
        }
        
        response.setHeader("Cache-Control", "no-cache");
        response.setDateHeader("Expires", 0);
        response.setHeader("Pragma", "no-cache");
        response.setContentType("text/plain");
        PrintWriter out = response.getWriter();
        out.print(jsonDataString);
    }
    
    /** 
     * Alta contrato - Metodo encargado de construir cadenas de tipo json con base en listas de objetos de tipo estatusFacturasList.
     * @author Oscar S.
     * @param estatusFacturasList List<ItemDTO>
     * @throws IOException, JsonGenerationException, JsonMappingException 
     * @return String
     */
    private String generateJSONStringDynamicEstatusFacturas(List<ItemDTO> estatusFacturasList) throws IOException, JsonGenerationException, JsonMappingException {
        ObjectMapper mapper = new ObjectMapper();

        // jsonMap Nivel 1
        List<Object> jsonMapCursosFacturas1 = new ArrayList<Object>();

        // jsonMap Nivel 3
        HashMap<String, Object> jsonCursosFacturas = new HashMap<String, Object>();

        for (ItemDTO item : estatusFacturasList) {
            jsonCursosFacturas = new HashMap<String, Object>();
            
            jsonCursosFacturas.put("idSituacionFactura", item.getClave());
            jsonCursosFacturas.put("descSituacionFactura", item.getValor());
            
            jsonMapCursosFacturas1.add(jsonCursosFacturas);
        }

        return mapper.writeValueAsString(jsonMapCursosFacturas1);
    }
    
    /** 
     * Alta contrato - Metodo encargado de asignar facturas al contrato.
     * @author Oscar S.
     * @param model Model
     * @param altaContratoDTO AltaContratoDTO
     * @return String
     */
    @RequestMapping
    public String saveFacturasContratos(Model model, AltaContratoDTO altaContratoDTO) {
        List<CursosContratosFacturasJson> cursosContratosFacturasJson = new ArrayList<CursosContratosFacturasJson>();
        ObjectMapper mapper = new ObjectMapper();
        
        try {
            // Cadena JSON
            cursosContratosFacturasJson = (List<CursosContratosFacturasJson>)mapper.readValue(altaContratoDTO.getPostDataFacturasContrato(), mapper.getTypeFactory().constructCollectionType(List.class, CursosContratosFacturasJson.class));
            int contador = 0;
            
            for (CursosContratosFacturasJson facturas : cursosContratosFacturasJson) {
                if (facturas.getSeleccion().equals("True")) {
                    contador++;
                }
            }
            
            if (contador > 0) {
                for (CursosContratosFacturasJson facturas : cursosContratosFacturasJson) {
                    if (facturas.getSeleccion().equals("True")) {
                        logger.debug("saveFacturasContratos -> idCurso -> " + facturas.getIdCurso());
                        
                        // Obtener datos de la factura
                        TnCapFacturaCursoDTO tnCapFacturaCursoDTO = new TnCapFacturaCursoDTO();
                        tnCapFacturaCursoDTO.setIdCurso(new Integer(facturas.getIdCurso()));
                        tnCapFacturaCursoDTO.setIdContratoCurso(altaContratoDTO.getIdContratoCurso());
                        tnCapFacturaCursoDTO.setFacturaFolio(facturas.getFacturaFolio() != null ? facturas.getFacturaFolio() : "");
                        tnCapFacturaCursoDTO.setFacturaMonto(facturas.getFacturaMonto() != null ? new Double(facturas.getFacturaMonto()) : 0.0);
                        
                        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
                        Date facturaFecha = formatter.parse(facturas.getFacturaFecha());
                        tnCapFacturaCursoDTO.setFacturaFecha(facturaFecha);
                        
                        // Atenta nota
                        tnCapFacturaCursoDTO.setFacturaAtentaNotaNumero(facturas.getFacturaAtentaNotaNumero() != null ? facturas.getFacturaAtentaNotaNumero() : "");
                        Date facturaAtentaNotaFecha = formatter.parse(facturas.getFacturaAtentaNotaFecha());
                        tnCapFacturaCursoDTO.setFacturaAtentaNotaFecha(facturaAtentaNotaFecha);
                        
                        tnCapFacturaCursoDTO.setUsuario(super.security().getUserName());
                        tnCapFacturaCursoDTO.setFecModifico(new Date());
                        
                        // Situacion factura
                        tnCapFacturaCursoDTO.setIdSituacionFactura(facturas.getFacturaEstatusDinamica() != null && !facturas.getFacturaEstatusDinamica().equals("-- SELECCIONE --") ? Integer.parseInt(facturas.getFacturaEstatusDinamica().substring(0,1)) : 
                        facturas.getFacturaEstatus() != null && !facturas.getFacturaEstatus().trim().equals("-") ? Integer.parseInt(facturas.getFacturaEstatus().substring(0,1)) : 0 ); // 1 - FACTURA RECIBIDA
                        
                        // Movimiento
                        int idMovimiento = super.configuration().getNumber("movCapCode", "ASIGNAR_FACTURA_CONTRATO").intValue();
                        
                        // Asignar contrato al curso
                        super.getService(RegistroCursoSPCService.class).saveAsignarFacturaContrato(tnCapFacturaCursoDTO, altaContratoDTO.getIdContratoCurso(), idMovimiento, false);
                    }
                }
                // Mensaje de exito
                super.saveMessage(model, "sireh.label.spc.capcer.registro.saveFacturasContratos.ok");
            } else {
                // Mensaje de error
                super.saveWarning(model, "Es necesario seleccionar los cursos a los cuales desea asignar facturas.");
            }
        } catch (Exception e) {
            logger.debug("saveCursosContratos -> Exception -> " + e.toString());
            
            // Mensaje de error
            super.saveError(model, "sireh.label.spc.capcer.registro.saveFacturasContratos.error");
        }
        model.addAttribute(altaContratoDTO);
        return editContrato(model, altaContratoDTO.getIdContratoCurso());
    }
    
    /** 
     * Alta contrato - Metodo encargado de desasignar facturas al contrato.
     * @author Oscar S.
     * @param model Model
     * @param altaContratoDTO AltaContratoDTO
     * @return String
     */
    @RequestMapping
    public String deleteFacturasContratos(Model model, AltaContratoDTO altaContratoDTO) {
        List<CursosContratosFacturasJson> cursosContratosFacturasJson = new ArrayList<CursosContratosFacturasJson>();
        ObjectMapper mapper = new ObjectMapper();
        
        try {
            // Cadena JSON
            cursosContratosFacturasJson = (List<CursosContratosFacturasJson>)mapper.readValue(altaContratoDTO.getPostDataFacturasContrato(), mapper.getTypeFactory().constructCollectionType(List.class, CursosContratosFacturasJson.class));
            int contador = 0;
            
            for (CursosContratosFacturasJson facturas : cursosContratosFacturasJson) {
                if (facturas.getSeleccion().equals("True")) {
                    contador++;
                }
            }
            
            if (contador > 0) {
                for (CursosContratosFacturasJson facturas : cursosContratosFacturasJson) {
                    if (facturas.getSeleccion().equals("True")) {
                        logger.debug("deleteFacturasContratos -> idCurso -> " + facturas.getIdCurso());
                        
                        // Obtener datos de la factura
                        TnCapFacturaCursoDTO tnCapFacturaCursoDTO = new TnCapFacturaCursoDTO();
                        tnCapFacturaCursoDTO.setIdCurso(new Integer(facturas.getIdCurso()));
                        tnCapFacturaCursoDTO.setIdContratoCurso(altaContratoDTO.getIdContratoCurso());
                        tnCapFacturaCursoDTO.setFacturaFolio(facturas.getFacturaFolio() != null ? facturas.getFacturaFolio() : "");
                        tnCapFacturaCursoDTO.setFacturaMonto(facturas.getFacturaMonto() != null ? new Double(facturas.getFacturaMonto()) : 0.0);
                        
                        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
                        Date facturaFecha = formatter.parse(facturas.getFacturaFecha());
                        tnCapFacturaCursoDTO.setFacturaFecha(facturaFecha);
                        
                        tnCapFacturaCursoDTO.setUsuario(super.security().getUserName());
                        tnCapFacturaCursoDTO.setFecModifico(new Date());
                        tnCapFacturaCursoDTO.setIdSituacionFactura(1); // 1 - FACTURA RECIBIDA
                        
                        // Movimiento
                        int idMovimiento = super.configuration().getNumber("movCapCode", "ELIMINAR_FACTURA_CONTRATO").intValue();
                        
                        // Asignar contrato al curso
                        super.getService(RegistroCursoSPCService.class).saveAsignarFacturaContrato(tnCapFacturaCursoDTO, altaContratoDTO.getIdContratoCurso(), idMovimiento, true);
                    }
                }
                // Mensaje de exito
                super.saveMessage(model, "sireh.label.spc.capcer.registro.deleteFacturasContratos.ok");
            } else {
                // Mensaje de error
                super.saveWarning(model, "Es necesario seleccionar los cursos a los cuales desea desasignar facturas.");
            }
        } catch (Exception e) {
            logger.debug("deleteFacturasContratos -> Exception -> " + e.toString());
            
            // Mensaje de error
            super.saveError(model, "sireh.label.spc.capcer.registro.deleteFacturasContratos.error");
        }
        model.addAttribute(altaContratoDTO);
        return editContrato(model, altaContratoDTO.getIdContratoCurso());
    }
    
    /******************************************************************************************************************************************************************************/
    
}