package gob.shcp.sireh.control.spc.capcer;

import gob.shcp.fsn.control.AbstractController;
import gob.shcp.fsn.control.support.AnnotatedController;

import gob.shcp.sireh.model.nomina.ConsultaEmpleadoDTO;
import gob.shcp.sireh.model.spc.ConsultaCursoDTO;
import gob.shcp.sireh.model.spc.consulta.ConsultaCalendarioDTO;
import gob.shcp.sireh.model.spc.consulta.ConsultaPACSHCPDTO;
import gob.shcp.sireh.model.spc.consulta.ConsultaPresupuestoDTO;
import gob.shcp.sireh.model.spc.consulta.CustomCalendarioDTO;
import gob.shcp.sireh.model.spc.consulta.CustomPACDTO;
import gob.shcp.sireh.model.spc.consulta.CustomPresupuestoDTO;
import gob.shcp.sireh.model.spc.consulta.LayoutRhnetDTO;

import gob.shcp.sireh.model.spc.consulta.SecuenciaEmpleadoDTO;
import gob.shcp.sireh.model.spc.consulta.SecuenciaInstructorDTO;
import gob.shcp.sireh.service.spc.capcer.consulta.ConsultaSPCService;

import java.io.IOException;
import java.io.OutputStream;

import java.text.SimpleDateFormat;

import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang.StringUtils;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Controlador encargado de atender solicitudes del modulo Consultas
 */
@Controller
public class ConsultaCursoSPCController extends AbstractController implements AnnotatedController {

    /**
     * Calendario
     * @author Josue Torres (Tomado del PAC de Armando)
     * @param model Model
     * @param consultaCalendarioDTO ConsultaCalendarioDTO
     * @return String
     */
    @RequestMapping
    public String consultaCalendario(Model model, ConsultaCalendarioDTO consultaCalendarioDTO) {
        if (consultaCalendarioDTO.isCancel()) {
            consultaCalendarioDTO = new ConsultaCalendarioDTO();
        }
        
        model.addAttribute(consultaCalendarioDTO);
        return super.getViewName("consultaCalendario");
    }

    /**
     * Metodo encargado de ejecutar la generacion de archivos para calendario
     * @author Josue Torres
     * @param model Model
     * @param consultaCalendarioDTO ConsultaCalendarioDTO
     * @return String
     */
    @RequestMapping
    public String createFileCalendario(Model model, ConsultaCalendarioDTO consultaCalendarioDTO, HttpServletResponse response) throws IOException {
        String fechaIni = "";
        String fechaFin= "";
        String trime = "";
        Integer cicloCalendario = consultaCalendarioDTO.getCicloEjeTematico();

        if (consultaCalendarioDTO.getTrimestre() == 0) { // ENE-DIC
            fechaIni = "01/01/" + consultaCalendarioDTO.getCicloEjeTematico();
            fechaFin = "01/01/" + (consultaCalendarioDTO.getCicloEjeTematico() + 1);
            trime = "-Completo";
        } else if (consultaCalendarioDTO.getTrimestre() == 1) { //ENE-MAR
            fechaIni = "01/01/" + consultaCalendarioDTO.getCicloEjeTematico();
            fechaFin = "01/04/" + consultaCalendarioDTO.getCicloEjeTematico();
            trime = "-1er Trimestre";
        } else if (consultaCalendarioDTO.getTrimestre() == 2) { // ABR-JUN
            fechaIni = "01/04/" + consultaCalendarioDTO.getCicloEjeTematico();
            fechaFin = "01/07/" + consultaCalendarioDTO.getCicloEjeTematico();
            trime = "-2do Trimestre";
        } else if (consultaCalendarioDTO.getTrimestre() == 3) { // JUL-SEP
            fechaIni = "01/07/" + consultaCalendarioDTO.getCicloEjeTematico();
            fechaFin = "01/10/" + consultaCalendarioDTO.getCicloEjeTematico();
            trime = "-3er Trimestre";
        } else if (consultaCalendarioDTO.getTrimestre() == 4) { // OCT-DIC
            fechaIni = "01/10/" + consultaCalendarioDTO.getCicloEjeTematico();
            fechaFin = "01/01/" + (consultaCalendarioDTO.getCicloEjeTematico() + 1);
            trime = "-4to Trimestre";
        }       
        logger.debug("cicloCalendario -> " + cicloCalendario);

        List<CustomCalendarioDTO> customCalendarioDTOList = super.getService(ConsultaSPCService.class).getConsultaCalendario(cicloCalendario, fechaIni, fechaFin);
        logger.debug("ConsultaCursoSPCController -> createFileCalendario -> customCalendarioDTOList.size() -> " +  customCalendarioDTOList.size());
        
        StringBuilder strCsv = new StringBuilder();
        
        if (customCalendarioDTOList.isEmpty()) {
            super.saveWarning(model, "warn.empty.list");
            return consultaCalendario(model, consultaCalendarioDTO);
        }
        
        strCsv.append("ID_CURSO");
        strCsv.append(",");
        strCsv.append("CURSO_CICLO");
        strCsv.append(",");
        strCsv.append("DESC_COORDINACION");
        strCsv.append(",");
        strCsv.append("DESC_SUBPROGRAMA");
        strCsv.append(",");
        strCsv.append("DESC_MODALIDAD");
        strCsv.append(",");
        strCsv.append("ID_EJE_TEMATICO");
        strCsv.append(",");
        strCsv.append("CURSO_CLAVE");
        strCsv.append(",");
        strCsv.append("DESC_EJE_TEMATICO");
        strCsv.append(",");
        strCsv.append("DESC_CURSO_PRINCIPAL");
        strCsv.append(",");
        strCsv.append("DESC_FINALIDAD");
        strCsv.append(",");
        strCsv.append("DESC_SEDE");
        strCsv.append(",");
        strCsv.append("DESC_DURACION");
        strCsv.append(",");
        strCsv.append("DESC_AULA");
        strCsv.append(",");
        strCsv.append("CURSO_FEC_INI");
        strCsv.append(",");
        strCsv.append("CURSO_FEC_FIN");
        strCsv.append(",");
        strCsv.append("DESC_HORARIO_CURSO");
        strCsv.append(",");
        strCsv.append("DESC_PROVEEDOR");
        strCsv.append(",");
        strCsv.append("DESC_TIPO_INST_EDUCAT");
        strCsv.append(",");
        strCsv.append("CURSO_PRESUPUESTO");
        strCsv.append(",");
        strCsv.append("CURSO_MINIMO_PARTICIPANTES");
        strCsv.append(",");
        strCsv.append("CURSO_MAXIMO_PARTICIPANTES");
        strCsv.append(",");
        strCsv.append("DESC_SITUACION_PROVEEDOR");
        strCsv.append(",");
        strCsv.append("INSTRUCTOR");
        strCsv.append(",");
        strCsv.append("DESC_SITUACION_CURSO");
        strCsv.append(",");
        strCsv.append("CURSO_CLAVE_CERTIFICACION");
        strCsv.append(",");
        strCsv.append("DESC_TIPO_CAPACIDAD");
        strCsv.append(",");
        strCsv.append("DESC_TIPO_CURSO");
        strCsv.append(",");
        strCsv.append("DESC_NIVEL_CURSO");
        strCsv.append(",");
        strCsv.append("CAPACIDAD_AULA");
        strCsv.append(",");
        strCsv.append("CURSO_PARTICIPANTES");
        strCsv.append(",");
        strCsv.append("CURSO_ACREDITADOS");
        strCsv.append(",");
        strCsv.append("COSTO_COSTO_PARTICIPANTE");
        strCsv.append(",");
        strCsv.append("CURSO_EVALUACION_REACCION");
        strCsv.append("\r\n");        
        
        for (CustomCalendarioDTO customCalendarioDTO : customCalendarioDTOList) {
            logger.debug("customCalendarioDTO -> " + customCalendarioDTO.getIdCurso());
            strCsv.append(customCalendarioDTO.getIdCurso());
            strCsv.append(",");
            strCsv.append(customCalendarioDTO.getCicloEjeTematico());
            strCsv.append(",");
            strCsv.append(customCalendarioDTO.getIdCoordinacion());
            strCsv.append(",");
            strCsv.append(customCalendarioDTO.getDescSubprograma());
            strCsv.append(",");
            strCsv.append(customCalendarioDTO.getDescModalidad());
            strCsv.append(",");
            strCsv.append(customCalendarioDTO.getIdEjeTematico());
            strCsv.append(",");
            strCsv.append(customCalendarioDTO.getCursoClave());
            strCsv.append(",");
            strCsv.append(customCalendarioDTO.getDescEjeTematico());
            strCsv.append(",");
            strCsv.append(customCalendarioDTO.getDescCursoPrincipal().replace(","," "));
            strCsv.append(",");
            strCsv.append(customCalendarioDTO.getDescFinalidad());
            strCsv.append(",");
            strCsv.append(customCalendarioDTO.getDescSede() != null ? customCalendarioDTO.getDescSede() : "");
            strCsv.append(",");
            strCsv.append(customCalendarioDTO.getCursoDuracion());
            strCsv.append(",");
            strCsv.append(customCalendarioDTO.getDescCursoPrincipal().replace(",","-"));
            strCsv.append(",");
            strCsv.append(new SimpleDateFormat("dd/MM/yyyy").format(customCalendarioDTO.getCursoFecIni()));
            strCsv.append(",");
            strCsv.append(new SimpleDateFormat("dd/MM/yyyy").format(customCalendarioDTO.getCursoFecFin()));
            strCsv.append(",");
            strCsv.append(customCalendarioDTO.getDescHorarioCurso().replace(",","-"));
            strCsv.append(",");
            strCsv.append(customCalendarioDTO.getDescProveedor().replace(",","-"));
            strCsv.append(",");
            strCsv.append(customCalendarioDTO.getDescTipoInstEducat());
            strCsv.append(",");
            strCsv.append(customCalendarioDTO.getCursoPresupuesto());
            strCsv.append(",");
            strCsv.append(customCalendarioDTO.getCursoMinimoParticipantes());
            strCsv.append(",");
            strCsv.append(customCalendarioDTO.getCupoMaximoAula());
            strCsv.append(",");
            strCsv.append(customCalendarioDTO.getDescSituacionProveedor() != null ? customCalendarioDTO.getDescSituacionProveedor() : "");
            strCsv.append(",");
            strCsv.append(customCalendarioDTO.getInstructor());
            strCsv.append(",");
            strCsv.append(customCalendarioDTO.getDescSituacionCurso());
            strCsv.append(",");
            strCsv.append(customCalendarioDTO.getCursoClaveCertificacion() != null ? customCalendarioDTO.getCursoClaveCertificacion() : "");
            strCsv.append(",");
            strCsv.append(customCalendarioDTO.getDescTipoCapacidad() != null ? customCalendarioDTO.getDescTipoCapacidad() : "");
            strCsv.append(",");
            strCsv.append(customCalendarioDTO.getDescTipoCurso());
            strCsv.append(",");
            strCsv.append(customCalendarioDTO.getDescNivelCurso());
            strCsv.append(",");
            strCsv.append(customCalendarioDTO.getCupoMaximoAula());
            strCsv.append(",");
            strCsv.append(customCalendarioDTO.getParticipantesTotal() != null ? customCalendarioDTO.getParticipantesTotal() : 0);
            strCsv.append(",");
            strCsv.append(customCalendarioDTO.getParticipantesAprobados() != null ? customCalendarioDTO.getParticipantesAprobados() : 0);
            strCsv.append(",");
            strCsv.append(customCalendarioDTO.getCostoParticipantes());
            strCsv.append(",");
            strCsv.append(customCalendarioDTO.getEvaluacionReaccion() != null ? customCalendarioDTO.getEvaluacionReaccion() : 0);
            strCsv.append(",");
            strCsv.append("\r\n");
        }

        byte[] bytes = strCsv.toString().getBytes();
        response.setContentType("text/plain");
        response.setContentLength(bytes.length);
        response.setHeader("Content-Disposition", "attachment; filename=\"" + "Calendario_" + cicloCalendario + trime + ".csv" + "\"");
        OutputStream out = response.getOutputStream();
        out.write(bytes, 0, bytes.length);
        return null;
                
    }

    /**
     * PAC SHCP
     * @author Armando Zuñiga
     * @param model Model
     * @param consultaPACSHCPDTO ConsultaPACSHCPDTO
     * @return String
     */
    @RequestMapping
    public String consultaPACSHCP(Model model, ConsultaPACSHCPDTO consultaPACSHCPDTO) {
        if (consultaPACSHCPDTO.isCancel()) {
            consultaPACSHCPDTO = new ConsultaPACSHCPDTO();
        }
        
        model.addAttribute(consultaPACSHCPDTO);
        return super.getViewName("consultaPACSHCP");
    }

    /**
     * Metodo encargado de ejecutar la generacion de archivos para el PAC
     * @author Armando Zuñiga
     * @param model Model
     * @param consultaPACSHCPDTO ConsultaPACSHCPDTO
     * @return String
     */
    @RequestMapping
    public String createFilePAC(Model model, ConsultaPACSHCPDTO consultaPACSHCPDTO, HttpServletResponse response) throws IOException {
        String fechaIni = "";
        String fechaFin= "";
        String trime = "";
        Integer cicloPac = consultaPACSHCPDTO.getCicloEjeTematico();

        if (consultaPACSHCPDTO.getTrimestre() == 0) { // ENE-DIC
            fechaIni = "01/01/" + consultaPACSHCPDTO.getCicloEjeTematico();
            fechaFin = "01/01/" + (consultaPACSHCPDTO.getCicloEjeTematico() + 1);
            trime = "-Completo";
        } else if (consultaPACSHCPDTO.getTrimestre() == 1) { //ENE-MAR
            fechaIni = "01/01/" + consultaPACSHCPDTO.getCicloEjeTematico();
            fechaFin = "01/04/" + consultaPACSHCPDTO.getCicloEjeTematico();
            trime = "-1er Trimestre";
        } else if (consultaPACSHCPDTO.getTrimestre() == 2) { // ABR-JUN
            fechaIni = "01/04/" + consultaPACSHCPDTO.getCicloEjeTematico();
            fechaFin = "01/07/" + consultaPACSHCPDTO.getCicloEjeTematico();
            trime = "-2do Trimestre";
        } else if (consultaPACSHCPDTO.getTrimestre() == 3) { // JUL-SEP
            fechaIni = "01/07/" + consultaPACSHCPDTO.getCicloEjeTematico();
            fechaFin = "01/10/" + consultaPACSHCPDTO.getCicloEjeTematico();
            trime = "-3er Trimestre";
        } else if (consultaPACSHCPDTO.getTrimestre() == 4) { // OCT-DIC
            fechaIni = "01/10/" + consultaPACSHCPDTO.getCicloEjeTematico();
            fechaFin = "01/01/" + (consultaPACSHCPDTO.getCicloEjeTematico() + 1);
            trime = "-4to Trimestre";
        }       
        logger.debug("cicloPac -> " + cicloPac);

        List<CustomPACDTO> customPacDTOList = super.getService(ConsultaSPCService.class).getConsultaPAC(cicloPac, fechaIni, fechaFin);
        logger.debug("ConsultaCursoSPCController -> createFilePac -> customPacDTOList.size() -> " +  customPacDTOList.size());
        
        StringBuilder strCsv = new StringBuilder();
        
        if (customPacDTOList.isEmpty()) {
            super.saveWarning(model, "warn.empty.list");
            return consultaPACSHCP(model, consultaPACSHCPDTO);
        }
        
        strCsv.append("CURSO");
        strCsv.append(",");
        strCsv.append("DESC_CURSO_PRINCIPAL");
        strCsv.append(",");
        strCsv.append("DESC_COORDINACION");
        strCsv.append(",");
        strCsv.append("CURSO_CICLO");
        strCsv.append(",");
        strCsv.append("ID_CURSO_PRINCIPAL");
        strCsv.append(",");
        strCsv.append("CURSO_CLAVE");
        strCsv.append(",");
        strCsv.append("DESC_TIPO_CURSO");
        strCsv.append(",");
        strCsv.append("DESC_NIVEL_CURSO");
        strCsv.append(",");
        strCsv.append("DESC_TIPO_INST_EDUCAT");
        strCsv.append(",");
        strCsv.append("DESC_SITUACION_CURSO");
        strCsv.append(",");
        strCsv.append("CURSO_FEC_INI");
        strCsv.append(",");
        strCsv.append("CURSO_FEC_FIN");
        strCsv.append(",");
        strCsv.append("DESC_HORARIO_CURSO");
        strCsv.append(",");
        strCsv.append("CURSO_DURACION");
        strCsv.append(",");
        strCsv.append("CURSO_COSTO PARTICIPANTE");
        strCsv.append(",");
        strCsv.append("DESC_SUBPROGRAMA");
        strCsv.append(",");
        strCsv.append("DESC_TIPO_CAPACIDAD");
        strCsv.append(",");
        strCsv.append("DESC_SEDE");
        strCsv.append(",");
        strCsv.append("DESC_AULA");
        strCsv.append(",");
        strCsv.append("CURSO_CLAVE_CERTIFICACION");
        strCsv.append(",");
        strCsv.append("DESC_PROVEEDOR");
        strCsv.append(",");
        strCsv.append("DESC_SITUACION_PROVEEDOR");
        strCsv.append(",");
        strCsv.append("CURSO_MINIMO_PARTICIPANTES");
        strCsv.append(",");
        strCsv.append("DESC_CONTROL_CURSO");
        strCsv.append(",");
        strCsv.append("INSTRUCTOR");
        strCsv.append(",");
        strCsv.append("DESC_EJE_TEMATICO");
        strCsv.append(",");
        strCsv.append("CICLO_EJE_TEMATICO");
        strCsv.append(",");
        strCsv.append("RFC_EMPLEADO");
        strCsv.append(",");
        strCsv.append("NOMBRE_EMPLEADO");
        strCsv.append(",");
        strCsv.append("PUESTO");
        strCsv.append(",");
        strCsv.append("NIVEL");
        strCsv.append(",");
        strCsv.append("UR_REPORTES_OM");
        strCsv.append(",");
        strCsv.append("DG");
        strCsv.append(",");
        strCsv.append("SEXO");
        strCsv.append(",");
        strCsv.append("DESC_SITUACION_PARTICIPANTE");
        strCsv.append(",");
        strCsv.append("CALIFICACIÓN FINAL");
        strCsv.append(",");
        strCsv.append("ASISTENCIA");
        strCsv.append(",");
        strCsv.append("ID RUSP");
        strCsv.append(",");
        strCsv.append("CATEGORIA");
        strCsv.append(",");
        strCsv.append("CODIGO PUESTO RUSP");
        strCsv.append(",");
        strCsv.append("CLASIFICACION RUSP");
        strCsv.append(",");
        strCsv.append("FECHA MOVIMIENTO");
        strCsv.append("\r\n");        
        
        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        
        for (CustomPACDTO customPACDTO : customPacDTOList) {
            logger.debug("customPACDTO -> " + customPACDTO.getIdCurso());
            strCsv.append(customPACDTO.getIdCurso());
            strCsv.append(",");
            strCsv.append(customPACDTO.getDescCursoPrincipal().replace(","," "));
            strCsv.append(",");
            strCsv.append(customPACDTO.getDescCoordinacion().replace(","," "));
            strCsv.append(",");
            strCsv.append(customPACDTO.getCicloEjeTematico());
            strCsv.append(",");
            strCsv.append(customPACDTO.getIdCursoPrincipal().replace(","," "));
            strCsv.append(",");
            strCsv.append(customPACDTO.getCursoClave().replace(","," "));
            strCsv.append(",");
            strCsv.append(customPACDTO.getDescTipoCurso().replace(","," "));
            strCsv.append(",");
            strCsv.append(customPACDTO.getDescNivelCurso().replace(","," "));
            strCsv.append(",");
            strCsv.append(customPACDTO.getDescTipoInstEducat().replace(","," "));
            strCsv.append(",");
            strCsv.append(customPACDTO.getDescSituacionCurso().replace(","," "));
            strCsv.append(",");
            strCsv.append(df.format(customPACDTO.getCursoFecIni()));
            strCsv.append(",");
            strCsv.append(df.format(customPACDTO.getCursoFecFin()));
            strCsv.append(",");
            strCsv.append(customPACDTO.getDescHorarioCurso() != null ? customPACDTO.getDescHorarioCurso(): "");
            strCsv.append(",");
            strCsv.append(customPACDTO.getCursoDuracion() != null ? customPACDTO.getCursoDuracion() : 0);
            strCsv.append(",");
            strCsv.append(customPACDTO.getCursoCostoParticipante());
            strCsv.append(",");
            strCsv.append(customPACDTO.getDescSubprograma().replace(","," "));
            strCsv.append(",");
            strCsv.append(customPACDTO.getDescTipoCapacidad().replace(","," "));
            strCsv.append(",");
            strCsv.append(customPACDTO.getDescSede().replace(","," "));
            strCsv.append(",");
            strCsv.append(customPACDTO.getDescAula().replace(","," "));
            strCsv.append(",");
            strCsv.append(customPACDTO.getCursoClaveCertificacion() != null ?  customPACDTO.getCursoClaveCertificacion().replace(","," ") : "");
            strCsv.append(",");
            strCsv.append(customPACDTO.getDescProveedor().replace(","," "));
            strCsv.append(",");
            strCsv.append(customPACDTO.getDescSituacionProveedor().replace(","," "));
            strCsv.append(",");
            strCsv.append(customPACDTO.getCursoMinimoParticipantes());
            strCsv.append(",");
            strCsv.append(customPACDTO.getDescControlCurso().replace(","," "));
            strCsv.append(",");
            strCsv.append(customPACDTO.getInstructor().replace(","," "));
            strCsv.append(",");
            strCsv.append(customPACDTO.getDescEjeTematico().replace(","," "));
            strCsv.append(",");
            strCsv.append(customPACDTO.getCicloEjeTematico());
            strCsv.append(",");
            strCsv.append(customPACDTO.getRfcEmpleado() !=null ? customPACDTO.getRfcEmpleado().replace(","," "): "");
            strCsv.append(",");
            strCsv.append(customPACDTO.getNombreEmpleado() !=null ? customPACDTO.getNombreEmpleado().replace(","," "):"");
            strCsv.append(",");
            strCsv.append(customPACDTO.getIdPuestoNom() !=null ? customPACDTO.getIdPuestoNom().replace(","," "):"");
            strCsv.append(",");
            strCsv.append(customPACDTO.getIdNivelPto() !=null ? customPACDTO.getIdNivelPto().replace(","," "):"");
            strCsv.append(",");
            strCsv.append(customPACDTO.getParticipanteUrRepoOm() != null ? customPACDTO.getParticipanteUrRepoOm() : "");
            strCsv.append(",");
            strCsv.append(customPACDTO.getParticipanteDg() != null ? customPACDTO.getParticipanteDg() : "");
            strCsv.append(",");
            strCsv.append(customPACDTO.getIdGenero() !=null ? customPACDTO.getIdGenero().replace(","," "):"");
            strCsv.append(",");
            strCsv.append(customPACDTO.getDescSituacionParticipante().replace(","," "));
            strCsv.append(",");
            strCsv.append(customPACDTO.getParticipanteCalificacionFin() != null ? customPACDTO.getParticipanteCalificacionFin(): 0);
            strCsv.append(",");
            strCsv.append(customPACDTO.getParticipanteAsistencia() != null ? customPACDTO.getParticipanteAsistencia():0);
            strCsv.append(",");
            strCsv.append(customPACDTO.getParticipanteIdRusp() != null ? customPACDTO.getParticipanteIdRusp() : "");
            strCsv.append(",");
            strCsv.append(customPACDTO.getParticipanteCategoriaRusp() != null ? customPACDTO.getParticipanteCategoriaRusp() :"" );
            strCsv.append(",");
            strCsv.append(customPACDTO.getParticipantePtoRusp() != null ? customPACDTO.getParticipantePtoRusp() : "");
            strCsv.append(",");
            strCsv.append(customPACDTO.getParticipanteClasifRusp() != null ? customPACDTO.getParticipanteClasifRusp() : "");
            strCsv.append(",");
            strCsv.append(df.format(customPACDTO.getFecModifico()));
            strCsv.append("\r\n");
        }
        
        byte[] bytes = strCsv.toString().getBytes();
        response.setContentType("text/plain");
        response.setContentLength(bytes.length);
        response.setHeader("Content-Disposition", "attachment; filename=\"" + "PAC_" + cicloPac + trime + ".csv" + "\"");
        OutputStream out = response.getOutputStream();
        out.write(bytes, 0, bytes.length);
        return null;
    }

    /**
     * Reporte RHNet
     * @author 
     * @param model Model
     * @param consultaPresupuestoDTO ConsultaPresupuestoDTO
     * @return String
     * Utiliza el mismo DTO que el calendario ya que solo es para mostrar los parametros Año y Trimestre
     */
    @RequestMapping
    public String consultaReporteRHNet(Model model, ConsultaPresupuestoDTO consultaPresupuestoDTO) {
        StringBuilder strCsv = new StringBuilder();

            if (consultaPresupuestoDTO.isCancel()) {
                consultaPresupuestoDTO = new ConsultaPresupuestoDTO();
            }
            
            model.addAttribute(consultaPresupuestoDTO);
        return super.getViewName("consultaReporteRHNet");
        
    }

    /**
     * Reporte RHNet
     * @author
     * @param model Model
     * @param consultaPresupuestoDTO ConsultaPresupuestoDTO
     * @return String
     */
    @RequestMapping
    public String generaReporteRhNet(Model model, ConsultaPresupuestoDTO consultaPresupuestoDTO, HttpServletResponse response) throws IOException {

        //List<String> datos = super.getService(ConsultaSPCService.class).generaArchivoIntercambio(consultaPresupuestoDTO.getTipoArchivo());
        String fileName = null;
        Integer trimestre = consultaPresupuestoDTO.getTrimestre();
        Integer ciclo = consultaPresupuestoDTO.getCicloEjeTematico();
        StringBuilder strCsv = new StringBuilder();

        if (consultaPresupuestoDTO.getCicloEjeTematico() != null) { 
            List<String> datos = super.getService(ConsultaSPCService.class).getReporteRhnet(ciclo, trimestre);
             for (String renglon: datos) {
                 strCsv.append(renglon).append("\r\n");
             }
 
        }       
         byte[] bytes = strCsv.toString().getBytes();
         response.setContentType("text/plain");
         response.setContentLength(bytes.length);
         response.setHeader("Content-Disposition", "attachment; filename=\"" + "Reporte_RHNet" + ".csv");
         OutputStream out = response.getOutputStream();
         out.write(bytes, 0, bytes.length);
        
        return super.getViewName("consultaReporteRHNet");
    }

    /**
     * Layout RHNet
     * @author Josue Torres (Tomado del PAC de Armando)
     * @param model Model
     * @param consultaCalendarioDTO ConsultaCalendarioDTO
     * @return String
     * Utiliza el mismo DTO que el calendario ya que solo es para mostrar los parametros Año y Trimestre
     */
    @RequestMapping
    public String consultaLayoutRHNet(Model model, ConsultaCalendarioDTO consultaCalendarioDTO) {
        if (consultaCalendarioDTO.isCancel()) {
            consultaCalendarioDTO = new ConsultaCalendarioDTO();
        }
        
        model.addAttribute(consultaCalendarioDTO);
        return super.getViewName("consultaLayoutRHNet");
    }

    /**
     * Metodo encargado de ejecutar la generacion de layout de RHNET
     * @author Josue Torres
     * @param model Model
     * @param consultaCalendarioDTO ConsultaCalendarioDTO
     * @return String
     */
    @RequestMapping
    public String createRhnet(Model model, ConsultaCalendarioDTO consultaCalendarioDTO, HttpServletResponse response) throws IOException {
        String fechaIni = "";
        String fechaFin = "";
        String trime = "";
        Integer cicloCalendario = consultaCalendarioDTO.getCicloEjeTematico();

        if (consultaCalendarioDTO.getTrimestre() == 0) { // ENE-DIC
            fechaIni = "01/01/" + consultaCalendarioDTO.getCicloEjeTematico();
            fechaFin = "01/01/" + (consultaCalendarioDTO.getCicloEjeTematico() + 1);
            trime = "-Completo";
        } else if (consultaCalendarioDTO.getTrimestre() == 1) { //ENE-MAR
            fechaIni = "01/01/" + consultaCalendarioDTO.getCicloEjeTematico();
            fechaFin = "01/04/" + consultaCalendarioDTO.getCicloEjeTematico();
            trime = "-1er Trimestre";
        } else if (consultaCalendarioDTO.getTrimestre() == 2) { // ABR-JUN
            fechaIni = "01/04/" + consultaCalendarioDTO.getCicloEjeTematico();
            fechaFin = "01/07/" + consultaCalendarioDTO.getCicloEjeTematico();
            trime = "-2do Trimestre";
        } else if (consultaCalendarioDTO.getTrimestre() == 3) { // JUL-SEP
            fechaIni = "01/07/" + consultaCalendarioDTO.getCicloEjeTematico();
            fechaFin = "01/10/" + consultaCalendarioDTO.getCicloEjeTematico();
            trime = "-3er Trimestre";
        } else if (consultaCalendarioDTO.getTrimestre() == 4) { // OCT-DIC
            fechaIni = "01/10/" + consultaCalendarioDTO.getCicloEjeTematico();
            fechaFin = "01/01/" + (consultaCalendarioDTO.getCicloEjeTematico() + 1);
            trime = "-4to Trimestre";
        }       
        logger.debug("cicloCalendario -> " + cicloCalendario);

        List<LayoutRhnetDTO> layoutRhnetDTOList = super.getService(ConsultaSPCService.class).getLayoutRhnet(cicloCalendario, fechaIni, fechaFin);
        logger.debug("ConsultaCursoSPCController -> createFileCalendario -> layoutRhnetDTOList.size() -> " +  layoutRhnetDTOList.size());
        
        StringBuilder strCsv = new StringBuilder();
        
        if (layoutRhnetDTOList.isEmpty()) {
            super.saveWarning(model, "warn.empty.list");
            return consultaLayoutRHNet(model, consultaCalendarioDTO);
        }
        
        strCsv.append("ID_ORGANIZACION");
        strCsv.append(",");
        strCsv.append("ID_UR");
        strCsv.append(",");
        strCsv.append("CME_ID_ANIO");
        strCsv.append(",");
        strCsv.append("ID_TRIMESTRE");
        strCsv.append(",");
        strCsv.append("STD_ID_HR");
        strCsv.append(",");
        strCsv.append("NEC_CAP_DETECTADA");
        strCsv.append(",");
        strCsv.append("NEC_CAP_CUBRIR");
        strCsv.append(",");
        strCsv.append("CME_PRP_COSTO");
        strCsv.append(",");
        strCsv.append("ID_MEDIO_IMP");
        strCsv.append(",");
        strCsv.append("TIPO_ACCION");
        strCsv.append(",");
        strCsv.append("ACCION_OBLIGATORIA");
        strCsv.append(",");
        strCsv.append("HORAS_REALIZADAS");
        strCsv.append(",");
        strCsv.append("CME_ID_FINALIDAD");
        strCsv.append(",");
        strCsv.append("SCO_NM_EXT_KNESP");
        strCsv.append(",");
        strCsv.append("SCO_ID_EXTD_KN");
        strCsv.append(",");
        strCsv.append("CALIFICACION");
        strCsv.append(",");
        strCsv.append("RESULTADO_ACCION");
        strCsv.append(",");
        strCsv.append("FECHA_INICIO_ACC");
        strCsv.append(",");
        strCsv.append("FECHA_FIN_ACC");
        strCsv.append(",");
        strCsv.append("NUM_VECES");
        strCsv.append(",");
        strCsv.append("TOMADO_EN_CAMPUS");
        strCsv.append("\r\n");        
        
        for (LayoutRhnetDTO layoutRhnetDTO : layoutRhnetDTOList) {
            logger.debug("layoutRhnetDTO -> " + layoutRhnetDTO.getIdCurso());
            strCsv.append(layoutRhnetDTO.getIdRamo());
            strCsv.append(",");
            strCsv.append(layoutRhnetDTO.getIdUnidad());
            strCsv.append(",");
            strCsv.append(layoutRhnetDTO.getCicloEjeTematico());
            strCsv.append(",");
            strCsv.append(consultaCalendarioDTO.getTrimestre());
            strCsv.append(",");
            strCsv.append(StringUtils.leftPad(layoutRhnetDTO.getParticipanteIdRusp(), 9, "0"));
            strCsv.append(",");
            strCsv.append(layoutRhnetDTO.getCapDetectada());
            strCsv.append(",");
            strCsv.append(layoutRhnetDTO.getDescCursoPrincipal().replace(","," "));
            strCsv.append(",");
            strCsv.append(layoutRhnetDTO.getCmePrpCostoUnit());
            strCsv.append(",");
            strCsv.append(layoutRhnetDTO.getDescModalidad());
            strCsv.append(",");
            strCsv.append(layoutRhnetDTO.getDescTipoAccion().replace(","," "));
            strCsv.append(",");
            strCsv.append(layoutRhnetDTO.getDescCaracter());
            strCsv.append(",");
            strCsv.append(layoutRhnetDTO.getCursoDuracion());
            strCsv.append(",");
            strCsv.append(layoutRhnetDTO.getDescFinalidad());
            strCsv.append(",");
            strCsv.append(layoutRhnetDTO.getDescCapacidadCert());
            strCsv.append(",");
            strCsv.append(layoutRhnetDTO.getCodigoUnicoCapacidadCert());
            strCsv.append(",");
            strCsv.append(layoutRhnetDTO.getParticipanteCalificacionFin());
            strCsv.append(",");
            strCsv.append(layoutRhnetDTO.getSituacionParticipante());
            strCsv.append(",");
/*            strCsv.append(new SimpleDateFormat("dd/MM/yyyy").format(layoutRhnetDTO.getFecIni()));*/
            strCsv.append(layoutRhnetDTO.getFecIni());
            strCsv.append(",");
/*            strCsv.append(new SimpleDateFormat("dd/MM/yyyy").format(layoutRhnetDTO.getFecFin()));*/
            strCsv.append(layoutRhnetDTO.getFecFin());
            strCsv.append(",");
            strCsv.append(layoutRhnetDTO.getVeces());
            strCsv.append(",");
            strCsv.append(layoutRhnetDTO.getCampus());
            strCsv.append(",");
            strCsv.append("\r\n");
        }

        byte[] bytes = strCsv.toString().getBytes();
        response.setContentType("text/plain");
        response.setContentLength(bytes.length);
        response.setHeader("Content-Disposition", "attachment; filename=\"" + "LayoutRhnet_" + cicloCalendario + trime + ".csv" + "\"");
        OutputStream out = response.getOutputStream();
        out.write(bytes, 0, bytes.length);
        return null;
                
    }

    /**
     * Presupuesto
     * @author Cesar B.
     * @param model Model
     * @param consultaPresupuestoDTO ConsultaPresupuestoDTO
     * @return String
     */
    @RequestMapping
    public String consultaPresupuesto(Model model, ConsultaPresupuestoDTO consultaPresupuestoDTO) {
        if (consultaPresupuestoDTO.isCancel()) {
            consultaPresupuestoDTO = new ConsultaPresupuestoDTO();
        }
        
        model.addAttribute(consultaPresupuestoDTO);
        return super.getViewName("consultaPresupuesto");
    }

    /**
     * Metodo encargado de ejecutar la generacion de archivos para el Presupuesto
     * @author Cesar B.
     * @param model Model
     * @param consultaPresupuestoDTO ConsultaPresupuestoDTO
     * @return String
     */
    @RequestMapping
    public String createFilePresupuesto(Model model, ConsultaPresupuestoDTO consultaPresupuestoDTO, HttpServletResponse response) throws IOException {
        String fechaIni = "";
        String fechaFin= "";
        String trime = "";
        Integer cicloPresupuesto = consultaPresupuestoDTO.getCicloEjeTematico();

        if (consultaPresupuestoDTO.getTrimestre() == 0) { // ENE-DIC
            fechaIni = "01/01/" + consultaPresupuestoDTO.getCicloEjeTematico();
            fechaFin = "31/12/" + consultaPresupuestoDTO.getCicloEjeTematico();
            trime = "-Completo";
        } else if (consultaPresupuestoDTO.getTrimestre() == 1) { //ENE-MAR
            fechaIni = "01/01/" + consultaPresupuestoDTO.getCicloEjeTematico();
            fechaFin = "01/04/" + consultaPresupuestoDTO.getCicloEjeTematico();
            trime = "-1er Trimestre";
        } else if (consultaPresupuestoDTO.getTrimestre() == 2) { // ABR-JUN
            fechaIni = "01/04/" + consultaPresupuestoDTO.getCicloEjeTematico();
            fechaFin = "01/07/" + consultaPresupuestoDTO.getCicloEjeTematico();
            trime = "-2do Trimestre";
        } else if (consultaPresupuestoDTO.getTrimestre() == 3) { // JUL-SEP
            fechaIni = "01/07/" + consultaPresupuestoDTO.getCicloEjeTematico();
            fechaFin = "01/10/" + consultaPresupuestoDTO.getCicloEjeTematico();
            trime = "-3er Trimestre";
        } else if (consultaPresupuestoDTO.getTrimestre() == 4) { // OCT-DIC
            fechaIni = "01/10/" + consultaPresupuestoDTO.getCicloEjeTematico();
            fechaFin = "01/01/" + (consultaPresupuestoDTO.getCicloEjeTematico() + 1);
            trime = "-4to Trimestre";
        }       
        logger.debug("cicloPresupuesto -> " + cicloPresupuesto);

        List<CustomPresupuestoDTO> customPresupuestoDTOList = super.getService(ConsultaSPCService.class).getConsultaPresupuesto(cicloPresupuesto, fechaIni, fechaFin);
        logger.debug("ConsultaCursoSPCController -> createFilePresupuesto -> customPresupuestoDTOList.size() -> " +  customPresupuestoDTOList.size());
        
        StringBuilder strCsv = new StringBuilder();
        
        if (customPresupuestoDTOList.isEmpty()) {
            super.saveWarning(model, "warn.empty.list");
            return consultaPresupuesto(model, consultaPresupuestoDTO);
        }
        
        strCsv.append("Proveedor");
        strCsv.append(",");
        strCsv.append("Servicio");
        strCsv.append(",");
        strCsv.append("Monto_Estimado");
        strCsv.append(",");
        strCsv.append("Contrato_Curso_Numero");
        strCsv.append(",");
        strCsv.append("Cursos");
        strCsv.append("\r\n");        
        
        for (CustomPresupuestoDTO customPresupuestoDTO : customPresupuestoDTOList) {
            logger.debug("customPresupuestoDTO -> " + customPresupuestoDTO.getDescProveedor());
            strCsv.append(customPresupuestoDTO.getDescProveedor());
            strCsv.append(",");
            strCsv.append(customPresupuestoDTO.getServicio());
            strCsv.append(",");
            strCsv.append(customPresupuestoDTO.getMontoEstimado());
            strCsv.append(",");
            strCsv.append(customPresupuestoDTO.getContratoCursoNumero());
            strCsv.append(",");
            strCsv.append(customPresupuestoDTO.getCursos());
            strCsv.append("\r\n");
        }
        
        byte[] bytes = strCsv.toString().getBytes();
        response.setContentType("text/plain");
        response.setContentLength(bytes.length);
        response.setHeader("Content-Disposition", "attachment; filename=\"" + "Presupuesto_" + cicloPresupuesto + trime + ".csv" + "\"");
        OutputStream out = response.getOutputStream();
        out.write(bytes, 0, bytes.length);
        return null;
    }


    /**
     * Avance del PAC
     * @author Martin C.
     * @param model Model
     * @return String
     */
    @RequestMapping
    public String consultaAvancePAC(Model model) {
        return super.getViewName("consultaAvancePAC");
    }

    /**
     * Avance de certificacion
     * @author Martin C.
     * @param model Model
     * @return String
     */
    @RequestMapping
    public String consultaAvanceCertificacion(Model model) {
        return super.getViewName("consultaAvanceCertificacion");
    }
    
    /**
     * secuenciaEmpleados: 
     * @author Martin C.
     * @param model Model
     * @return String
     */
    @RequestMapping
    public String consultaCursoSPCBuscaEmpl(Model model, ConsultaEmpleadoDTO consultaEmpleadoDTO) {
        if (consultaEmpleadoDTO.isCancel()) {
            consultaEmpleadoDTO = new ConsultaEmpleadoDTO();
        }
        consultaEmpleadoDTO.setUrlController("consultaCursoSPC");
        consultaEmpleadoDTO.setUrlOrigen("consultaCursoSPCBuscaEmpl");
        consultaEmpleadoDTO.setUrlDestino("secuenciaEmpleadoCursos");
        consultaEmpleadoDTO.setNombrePantalla("secuenciaEmpleados");

        model.addAttribute(consultaEmpleadoDTO);
        return super.getViewName("consultaEmpleados");
    }
    
    /**
     * secuenciaEmpleados: 
     * @author Martin C.
     * @param model Model
     * @param rfcEmpleado String
     * @param secuenciaEmpleadoDTO SecuenciaEmpleadoDTO
     * @return String
     */
    @RequestMapping
    public String secuenciaEmpleadoCursos(Model  model, 
                                            SecuenciaEmpleadoDTO secuenciaEmpleadoDTO, 
                                            @RequestParam("rfcEmpleado") String rfcEmpleado ) {
                                            
        
        secuenciaEmpleadoDTO.setParticipanteNombre(super.getService(ConsultaSPCService.class).getNombreEmpleado(rfcEmpleado) );
        secuenciaEmpleadoDTO.setParticipanteRfc(rfcEmpleado);
        secuenciaEmpleadoDTO.setMuestraRegistros(true);
        model.addAttribute(secuenciaEmpleadoDTO);
        return super.getViewName("secuenciaEmpleados");
    }
    
    /**
     * secuenciaEmpleados: 
     * @author Martin C.
     * @param model Model
     * @param idCurso Integer
     * @param rfcEmpleado String
     * secuenciaEmpleadoDTO SecuenciaEmpleadoDTO
     * @return String
     */
    @RequestMapping
    public String secuenciaEmpleadoCursoDetalle(Model  model, 
                                            SecuenciaEmpleadoDTO secuenciaEmpleadoDTO, 
                                            @RequestParam("idCurso") Integer idCurso,
                                            @RequestParam("rfcEmpleado") String rfcEmpleado) {
                                            
        SecuenciaEmpleadoDTO detalleCurso = super.getService(ConsultaSPCService.class).secuenciaEmpleadoCursoDetalle(idCurso, rfcEmpleado);
        SecuenciaEmpleadoDTO instructoresByCurso = super.getService(ConsultaSPCService.class).getInstructoresByCurso(idCurso);
        
        detalleCurso.setNombreInstrTitular(instructoresByCurso.getNombreInstrTitular());
        detalleCurso.setNombreInstrSuplente(instructoresByCurso.getNombreInstrSuplente());
        detalleCurso.setCausalDesasignacionTit(instructoresByCurso.getCausalDesasignacionTit());
        detalleCurso.setCausalDesasignacionSup(instructoresByCurso.getCausalDesasignacionSup());
        
        detalleCurso.setRfc(rfcEmpleado);
        model.addAttribute(detalleCurso);
        return super.getViewName("secuenciaEmpleadoDetalle");
    }
    
    /**
     * secuenciaEmpleados: 
     * @author Martin C.
     * @param model Model
     * @param secuenciaInstructorDTO SecuenciaInstructorDTO
     * @return String
     */
    @RequestMapping
    public String consultaCursoSPCBuscaInstr(Model model, SecuenciaInstructorDTO secuenciaInstructorDTO) {
        if (secuenciaInstructorDTO.isCancel()) {
            secuenciaInstructorDTO = new SecuenciaInstructorDTO();
        }
        
        if(secuenciaInstructorDTO.getIdInstructor() != null ){
            SecuenciaInstructorDTO tipoInstructor = super.getService(ConsultaSPCService.class).tipoInstructor(secuenciaInstructorDTO.getIdInstructor());
            
            if(tipoInstructor.getIdInstrTitular() == null & tipoInstructor.getIdInstrSuplente() == null){ ; }
            else if(tipoInstructor.getIdInstrTitular() != null & tipoInstructor.getIdInstrSuplente() != null){
                secuenciaInstructorDTO.setIdInstrTitular(tipoInstructor.getIdInstrTitular());
                secuenciaInstructorDTO.setIdInstrSuplente(tipoInstructor.getIdInstrSuplente());   }
            else if(tipoInstructor.getIdInstrTitular() != null & tipoInstructor.getIdInstrSuplente() == null){
                secuenciaInstructorDTO.setIdInstrTitular(tipoInstructor.getIdInstrTitular());   }
            else if(tipoInstructor.getIdInstrTitular() == null & tipoInstructor.getIdInstrSuplente() != null){
                secuenciaInstructorDTO.setIdInstrSuplente(tipoInstructor.getIdInstrSuplente());
            }
            secuenciaInstructorDTO.setMuestraRegistros(true);
            secuenciaInstructorDTO.setAnterior(secuenciaInstructorDTO.getIdInstructor());
        }
        model.addAttribute(secuenciaInstructorDTO);
        return super.getViewName("secuenciaInstructor");
    }
    
    /**
     * secuenciaEmpleados: 
     * @author Martin C.
     * @param model Model
     * @param secuenciaInstructorDTO SecuenciaInstructorDTO
     * @return String
     */
    @RequestMapping
    public String consultaCursoSPCBuscaInstrDetalle(Model  model, 
                                            SecuenciaInstructorDTO secuenciaInstructorDTO, 
                                            @RequestParam("idCurso") Integer idCurso,
                                            @RequestParam("idInstructor") Integer idInstructor,
                                            @RequestParam("idProveedor") String idProveedor) {
        if (secuenciaInstructorDTO.isCancel()) {
            secuenciaInstructorDTO = new SecuenciaInstructorDTO();
        }
        
        SecuenciaInstructorDTO detalleCurso = super.getService(ConsultaSPCService.class).detallesCursoByInstructor(idCurso, idInstructor);
        SecuenciaInstructorDTO instructores = super.getService(ConsultaSPCService.class).getInstructoresByCurso(idCurso, idInstructor);
        
        SecuenciaInstructorDTO estadisticas = super.getService(ConsultaSPCService.class).getEstadisticasByInstructor(idCurso);
        
        detalleCurso.setNombreInstrTitular(instructores.getNombreInstrTitular());
        detalleCurso.setNombreInstrSuplente(instructores.getNombreInstrSuplente());
        detalleCurso.setCausalDesasigTitular(instructores.getCausalDesasigTitular());
        detalleCurso.setCausalDesasigSuplente(instructores.getCausalDesasigSuplente());
        
        detalleCurso.setParticipanteAsistencia(estadisticas.getParticipanteAsistencia());
        detalleCurso.setParticipanteEvalInicial(estadisticas.getParticipanteEvalInicial());
        detalleCurso.setParticipanteEvalFinal(estadisticas.getParticipanteEvalFinal());
        detalleCurso.setDescSituacionParticipante(estadisticas.getDescSituacionParticipante());
        detalleCurso.setIdProveedor(idProveedor);
        detalleCurso.setIdInstructor(new Long(idInstructor));
        
        model.addAttribute(detalleCurso);
        return super.getViewName("secuenciaInstructorDetalle");
    }
}
