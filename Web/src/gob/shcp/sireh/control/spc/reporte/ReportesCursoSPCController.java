package gob.shcp.sireh.control.spc.reporte;

import gob.shcp.fsn.control.AbstractController;
import gob.shcp.fsn.control.support.AnnotatedController;

import gob.shcp.sireh.model.spc.TcCapCursoPrincpDTO;
import gob.shcp.sireh.model.spc.TnCapCursoDTO;
import gob.shcp.sireh.model.spc.TnCapParticipanteDTO;
import gob.shcp.sireh.model.spc.reportes.ReportesCapcerDTO;

import gob.shcp.sireh.service.spc.capcer.reporte.ReporteSPCService;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.OutputStream;

import java.math.BigDecimal;

import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import javax.servlet.http.HttpServletResponse;

import org.apache.commons.io.IOUtils;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFFont;
import org.apache.poi.hssf.usermodel.HSSFPalette;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.hssf.util.CellReference;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Controlador encargado de atender solicitudes del modulo Reportes
 */
@Controller
public class ReportesCursoSPCController extends AbstractController implements AnnotatedController {

    private static final String SECURITY_ROL_ADM = "SIREH_CAP_ADM";
    private static final String SECURITY_ROL_OPER = "SIREH_CAP_OPERADOR";

    /**
     * Lista de asistencia
     * @author Cesar B./Oscar S.
     * @param model Model
     * @param reportesCapcerDTO ReportesCapcerDTO
     * @return String
     */
    @RequestMapping
    public String listaAsistencia(Model model, ReportesCapcerDTO reportesCapcerDTO) {
        // Obtener roles
        List roles = super.security().getRoles();
        for (Object rol: roles) {
            logger.debug("navegacionRegistroCurso -> Roles ---------->" + (String)rol);
        }

        // Obtener roles
        reportesCapcerDTO = getRol(reportesCapcerDTO);

        if (reportesCapcerDTO.isMuestraReporte()) {
            if (reportesCapcerDTO.getTipoBusqueda() != null && !reportesCapcerDTO.getTipoBusqueda().equals("")) {
                logger.debug("ReportesCursoSPCController -> listaAsistencia -> tipoBusqueda --------->" + reportesCapcerDTO.getTipoBusqueda());

                if (reportesCapcerDTO.getTipoBusqueda().equals("CURSO")) {
                    // Opcion 1
                    if (reportesCapcerDTO.getCicloEjeTematico() == null || 
                        reportesCapcerDTO.getCicloEjeTematico() == 0) {
                        super.saveError(model, "sireh.label.spc.capcer.reportes.error.cicloEjeTematico");

                        reportesCapcerDTO.setCicloEjeTematicoBusqueda(0);
                        reportesCapcerDTO.setIdCursoBusqueda(0);
                        reportesCapcerDTO.setValidacion(true);

                        model.addAttribute(reportesCapcerDTO);
                        return super.getViewName("listaAsistencia");
                    } else if (reportesCapcerDTO.getIdCurso() == null || reportesCapcerDTO.getIdCurso() == 0) {
                        super.saveError(model, "sireh.label.spc.capcer.reportes.error.idCurso");

                        reportesCapcerDTO.setCicloEjeTematicoBusqueda(0);
                        reportesCapcerDTO.setIdCursoBusqueda(0);
                        reportesCapcerDTO.setValidacion(true);

                        model.addAttribute(reportesCapcerDTO);
                        return super.getViewName("listaAsistencia");
                    } else {
                        reportesCapcerDTO.setCicloEjeTematicoBusqueda(reportesCapcerDTO.getCicloEjeTematico());
                        reportesCapcerDTO.setIdCursoBusqueda(reportesCapcerDTO.getIdCurso());
                        reportesCapcerDTO.setValidacion(true);

                        TnCapCursoDTO tnCapCursoDTO = super.getService(ReporteSPCService.class).getById(reportesCapcerDTO.getIdCurso());
                        Integer sc = sesionesCurso(new java.sql.Date(tnCapCursoDTO.getCursoFecIni().getTime()), new java.sql.Date(tnCapCursoDTO.getCursoFecFin().getTime()));
                        reportesCapcerDTO.setSesionesCurso(sc);

                        model.addAttribute(reportesCapcerDTO);
                        return super.getViewName("listaAsistencia");
                    }
                } else {
                    // Opcion 2
                    if (reportesCapcerDTO.getCursoClave() == null || reportesCapcerDTO.getCursoClave().equals("")) {
                        super.saveError(model, "sireh.label.spc.capcer.reportes.error.cursoClave");

                        reportesCapcerDTO.setCicloEjeTematicoBusqueda(0);
                        reportesCapcerDTO.setIdCursoBusqueda(0);
                        reportesCapcerDTO.setValidacion(true);

                        model.addAttribute(reportesCapcerDTO);
                        return super.getViewName("listaAsistencia");
                    } else {

                        // Obtener id Curso
                        TnCapCursoDTO tnCapCursoDTO = super.getService(ReporteSPCService.class).getCursoByClave(reportesCapcerDTO.getCursoClave());

                        if (tnCapCursoDTO == null) {
                            super.saveError(model, "Error: Proporcione una clave de curso valida");

                            reportesCapcerDTO.setCicloEjeTematicoBusqueda(0);
                            reportesCapcerDTO.setIdCursoBusqueda(0);
                            reportesCapcerDTO.setValidacion(true);

                            model.addAttribute(reportesCapcerDTO);
                            return super.getViewName("listaAsistencia");
                        } else {
                            logger.debug("ReportesCursoSPCController -> listaAsistencia -> idCurso --------->" + tnCapCursoDTO.getIdCurso());
                            reportesCapcerDTO.setIdCursoBusqueda(tnCapCursoDTO.getIdCurso());
                            reportesCapcerDTO.setCicloEjeTematicoBusqueda(tnCapCursoDTO.getCicloEjeTematico());
                            reportesCapcerDTO.setValidacion(true);

                            Integer sc = sesionesCurso(new java.sql.Date(tnCapCursoDTO.getCursoFecIni().getTime()), new java.sql.Date(tnCapCursoDTO.getCursoFecFin().getTime()));
                            reportesCapcerDTO.setSesionesCurso(sc);

                            model.addAttribute(reportesCapcerDTO);
                            return super.getViewName("listaAsistencia");
                        }
                    }
                }
            } else {
                // No selecciono tipo de busqueda
                super.saveError(model, "sireh.label.spc.capcer.reportes.error.tipoBusqueda");

                model.addAttribute(reportesCapcerDTO);
                return super.getViewName("listaAsistencia");
            }
        } else {
            // Cancelar
            reportesCapcerDTO = new ReportesCapcerDTO();

            // Obtener roles
            reportesCapcerDTO = getRol(reportesCapcerDTO);
        }

        model.addAttribute(reportesCapcerDTO);
        return super.getViewName("listaAsistencia");
    }

    /**
     * Calcula el numero de sesiones del curso
     * dadas las fechas incial y final
     * @author Martin C.
     * @param fecIni Date
     * @param fecFin Date
     * @return Integer
     */
    private Integer sesionesCurso(Date fecIni, Date fecFin) {
        Integer sesionesCurso = 0;
        Calendar fi = Calendar.getInstance();
        Calendar ff = Calendar.getInstance();

        fi.setTime(fecIni);
        ff.setTime(fecFin);

        while (fi.before(ff) || fi.equals(ff)) {
            if (fi.get(Calendar.DAY_OF_WEEK) != Calendar.SUNDAY && fi.get(Calendar.DAY_OF_WEEK) != Calendar.SATURDAY) {
                sesionesCurso += 1;
            }
            fi.add(Calendar.DATE, 1);
        }
        return sesionesCurso;
    }

    /******************************************************************************************************************************************************************************/

    /**
     * Carta compromiso
     * @author Cesar B.
     * @param model Model
     * @param reportesCapcerDTO ReportesCapcerDTO
     * @return String
     */
    @RequestMapping
    public String cartaCompromiso(Model model, ReportesCapcerDTO reportesCapcerDTO) {
        // Obtener roles
        List roles = super.security().getRoles();
        for (Object rol: roles) {
            logger.debug("navegacionRegistroCurso -> Roles ---------->" + (String)rol);
        }

        // Obtener roles
        reportesCapcerDTO = getRol(reportesCapcerDTO);

        if (reportesCapcerDTO.isMuestraReporte()) {
            if (reportesCapcerDTO.getTipoBusqueda() != null && !reportesCapcerDTO.getTipoBusqueda().equals("")) {
                logger.debug("ReportesCursoSPCController -> cartaCompromiso -> tipoBusqueda --------->" + reportesCapcerDTO.getTipoBusqueda());

                if (reportesCapcerDTO.getTipoBusqueda().equals("CURSO")) {
                    // Opcion 1
                    if (reportesCapcerDTO.getCicloEjeTematico() == null || 
                        reportesCapcerDTO.getCicloEjeTematico() == 0) {
                        super.saveError(model, "sireh.label.spc.capcer.reportes.error.cicloEjeTematico");

                        reportesCapcerDTO.setCicloEjeTematicoBusqueda(0);
                        reportesCapcerDTO.setIdCursoBusqueda(0);
                        reportesCapcerDTO.setValidacion(true);

                        model.addAttribute(reportesCapcerDTO);
                        return super.getViewName("cartaCompromiso");
                    } else if (reportesCapcerDTO.getIdCurso() == null || reportesCapcerDTO.getIdCurso() == 0) {
                        super.saveError(model, "sireh.label.spc.capcer.reportes.error.idCurso");

                        reportesCapcerDTO.setCicloEjeTematicoBusqueda(0);
                        reportesCapcerDTO.setIdCursoBusqueda(0);
                        reportesCapcerDTO.setValidacion(true);

                        model.addAttribute(reportesCapcerDTO);
                        return super.getViewName("cartaCompromiso");
                    } else {
                        reportesCapcerDTO.setCicloEjeTematicoBusqueda(reportesCapcerDTO.getCicloEjeTematico());
                        reportesCapcerDTO.setIdCursoBusqueda(reportesCapcerDTO.getIdCurso());
                        reportesCapcerDTO.setValidacion(true);

                        model.addAttribute(reportesCapcerDTO);
                        return super.getViewName("cartaCompromiso");
                    }
                } else {
                    // Opcion 2
                    if (reportesCapcerDTO.getCursoClave() == null || reportesCapcerDTO.getCursoClave().equals("")) {
                        super.saveError(model, "sireh.label.spc.capcer.reportes.error.cursoClave");

                        reportesCapcerDTO.setCicloEjeTematicoBusqueda(0);
                        reportesCapcerDTO.setIdCursoBusqueda(0);
                        reportesCapcerDTO.setValidacion(true);

                        model.addAttribute(reportesCapcerDTO);
                        return super.getViewName("cartaCompromiso");
                    } else {

                        // Obtener id Curso
                        TnCapCursoDTO tnCapCursoDTO = super.getService(ReporteSPCService.class).getCursoByClave(reportesCapcerDTO.getCursoClave());

                        if (tnCapCursoDTO == null) {
                            super.saveError(model, "Error: Proporcione una clave de curso valida");

                            reportesCapcerDTO.setCicloEjeTematicoBusqueda(0);
                            reportesCapcerDTO.setIdCursoBusqueda(0);
                            reportesCapcerDTO.setValidacion(true);

                            model.addAttribute(reportesCapcerDTO);
                            return super.getViewName("cartaCompromiso");
                        } else {
                            logger.debug("ReportesCursoSPCController -> cartaCompromiso -> idCurso --------->" + tnCapCursoDTO.getIdCurso());
                            reportesCapcerDTO.setIdCursoBusqueda(tnCapCursoDTO.getIdCurso());
                            reportesCapcerDTO.setCicloEjeTematicoBusqueda(tnCapCursoDTO.getCicloEjeTematico());
                            reportesCapcerDTO.setValidacion(true);

                            model.addAttribute(reportesCapcerDTO);
                            return super.getViewName("cartaCompromiso");
                        }
                    }
                }
            } else {
                // No selecciono tipo de busqueda
                super.saveError(model, "sireh.label.spc.capcer.reportes.error.tipoBusqueda");

                model.addAttribute(reportesCapcerDTO);
                return super.getViewName("cartaCompromiso");
            }
        } else {
            // Cancelar
            reportesCapcerDTO = new ReportesCapcerDTO();

            // Obtener roles
            reportesCapcerDTO = getRol(reportesCapcerDTO);
        }

        model.addAttribute(reportesCapcerDTO);
        return super.getViewName("cartaCompromiso");
    }

    /******************************************************************************************************************************************************************************/

    /**
     * Evaluacion reaccion
     * @author Cesar B.
     * @param model Model
     * @return String
     */
    @RequestMapping
    public String evaluacionReaccion(Model model, ReportesCapcerDTO reportesCapcerDTO) {
        // Obtener roles
        List roles = super.security().getRoles();
        for (Object rol: roles) {
            logger.debug("navegacionRegistroCurso -> Roles ---------->" + (String)rol);
        }

        // Obtener roles
        reportesCapcerDTO = getRol(reportesCapcerDTO);

        if (reportesCapcerDTO.isMuestraReporte()) {
            if (reportesCapcerDTO.getTipoBusqueda() != null && !reportesCapcerDTO.getTipoBusqueda().equals("")) {
                logger.debug("ReportesCursoSPCController -> evaluacionReaccion -> tipoBusqueda --------->" + reportesCapcerDTO.getTipoBusqueda());

                if (reportesCapcerDTO.getTipoBusqueda().equals("CURSO")) {
                    // Opcion 1
                    if (reportesCapcerDTO.getCicloEjeTematico() == null || reportesCapcerDTO.getCicloEjeTematico() == 0) {
                        super.saveError(model, "sireh.label.spc.capcer.reportes.error.cicloEjeTematico");

                        reportesCapcerDTO.setCicloEjeTematicoBusqueda(0);
                        reportesCapcerDTO.setIdCursoBusqueda(0);
                        reportesCapcerDTO.setValidacion(true);

                        model.addAttribute(reportesCapcerDTO);
                        return super.getViewName("evaluacionReaccion");
                    } else if (reportesCapcerDTO.getIdCurso() == null || reportesCapcerDTO.getIdCurso() == 0) {
                        super.saveError(model, "sireh.label.spc.capcer.reportes.error.idCurso");

                        reportesCapcerDTO.setCicloEjeTematicoBusqueda(0);
                        reportesCapcerDTO.setIdCursoBusqueda(0);
                        reportesCapcerDTO.setValidacion(true);

                        model.addAttribute(reportesCapcerDTO);
                        return super.getViewName("evaluacionReaccion");
                    } else {
                        reportesCapcerDTO.setCicloEjeTematicoBusqueda(reportesCapcerDTO.getCicloEjeTematico());
                        reportesCapcerDTO.setIdCursoBusqueda(reportesCapcerDTO.getIdCurso());
                        reportesCapcerDTO.setValidacion(true);

                        model.addAttribute(reportesCapcerDTO);
                        return super.getViewName("evaluacionReaccion");
                    }
                } else {
                    // Opcion 2
                    if (reportesCapcerDTO.getCursoClave() == null || reportesCapcerDTO.getCursoClave().equals("")) {
                        super.saveError(model, "sireh.label.spc.capcer.reportes.error.cursoClave");

                        reportesCapcerDTO.setCicloEjeTematicoBusqueda(0);
                        reportesCapcerDTO.setIdCursoBusqueda(0);
                        reportesCapcerDTO.setValidacion(true);

                        model.addAttribute(reportesCapcerDTO);
                        return super.getViewName("evaluacionReaccion");
                    } else {

                        // Obtener id Curso
                        TnCapCursoDTO tnCapCursoDTO = super.getService(ReporteSPCService.class).getCursoByClave(reportesCapcerDTO.getCursoClave());

                        if (tnCapCursoDTO == null) {
                            super.saveError(model, "Error: Proporcione una clave de curso valida");

                            reportesCapcerDTO.setCicloEjeTematicoBusqueda(0);
                            reportesCapcerDTO.setIdCursoBusqueda(0);
                            reportesCapcerDTO.setValidacion(true);

                            model.addAttribute(reportesCapcerDTO);
                            return super.getViewName("evaluacionReaccion");
                        } else {
                            logger.debug("ReportesCursoSPCController -> evaluacionReaccion -> idCurso --------->" + tnCapCursoDTO.getIdCurso());
                            reportesCapcerDTO.setIdCursoBusqueda(tnCapCursoDTO.getIdCurso());
                            reportesCapcerDTO.setCicloEjeTematicoBusqueda(tnCapCursoDTO.getCicloEjeTematico());
                            reportesCapcerDTO.setValidacion(true);

                            model.addAttribute(reportesCapcerDTO);
                            return super.getViewName("evaluacionReaccion");
                        }
                    }
                }
            } else {
                // No selecciono tipo de busqueda
                super.saveError(model, "sireh.label.spc.capcer.reportes.error.tipoBusqueda");

                model.addAttribute(reportesCapcerDTO);
                return super.getViewName("evaluacionReaccion");
            }
        } else {
            // Cancelar
            reportesCapcerDTO = new ReportesCapcerDTO();

            // Obtener roles
            reportesCapcerDTO = getRol(reportesCapcerDTO);
        }

        model.addAttribute(reportesCapcerDTO);
        return super.getViewName("evaluacionReaccion");
    }

    /******************************************************************************************************************************************************************************/

    /**
     * Informe del curso
     * @author Cesar B.
     * @param model Model
     * @param reportesCapcerDTO ReportesCapcerDTO
     * @return String
     */
    @RequestMapping
    public String informeCurso(Model model, ReportesCapcerDTO reportesCapcerDTO) {
        // Obtener roles
        List roles = super.security().getRoles();
        for (Object rol: roles) {
            logger.debug("navegacionRegistroCurso -> Roles ---------->" + (String)rol);
        }

        // Obtener roles
        reportesCapcerDTO = getRol(reportesCapcerDTO);

        if (reportesCapcerDTO.isMuestraReporte()) {
            if (reportesCapcerDTO.getTipoBusqueda() != null && !reportesCapcerDTO.getTipoBusqueda().equals("")) {
                logger.debug("ReportesCursoSPCController -> informeCurso -> tipoBusqueda --------->" + reportesCapcerDTO.getTipoBusqueda());

                if (reportesCapcerDTO.getTipoBusqueda().equals("CURSO")) {
                    // Opcion 1
                    if (reportesCapcerDTO.getCicloEjeTematico() == null || reportesCapcerDTO.getCicloEjeTematico() == 0) {
                        super.saveError(model, "sireh.label.spc.capcer.reportes.error.cicloEjeTematico");

                        reportesCapcerDTO.setCicloEjeTematicoBusqueda(0);
                        reportesCapcerDTO.setIdCursoBusqueda(0);
                        reportesCapcerDTO.setValidacion(true);

                        model.addAttribute(reportesCapcerDTO);
                        return super.getViewName("informeCurso");
                    } else if (reportesCapcerDTO.getIdCurso() == null || reportesCapcerDTO.getIdCurso() == 0) {
                        super.saveError(model, "sireh.label.spc.capcer.reportes.error.idCurso");

                        reportesCapcerDTO.setCicloEjeTematicoBusqueda(0);
                        reportesCapcerDTO.setIdCursoBusqueda(0);
                        reportesCapcerDTO.setValidacion(true);

                        model.addAttribute(reportesCapcerDTO);
                        return super.getViewName("informeCurso");
                    } else {
                        reportesCapcerDTO.setCicloEjeTematicoBusqueda(reportesCapcerDTO.getCicloEjeTematico());
                        reportesCapcerDTO.setIdCursoBusqueda(reportesCapcerDTO.getIdCurso());
                        reportesCapcerDTO.setValidacion(true);

                        model.addAttribute(reportesCapcerDTO);
                        return super.getViewName("informeCurso");
                    }
                } else {
                    // Opcion 2
                    if (reportesCapcerDTO.getCursoClave() == null || reportesCapcerDTO.getCursoClave().equals("")) {
                        super.saveError(model, "sireh.label.spc.capcer.reportes.error.cursoClave");

                        reportesCapcerDTO.setCicloEjeTematicoBusqueda(0);
                        reportesCapcerDTO.setIdCursoBusqueda(0);
                        reportesCapcerDTO.setValidacion(true);

                        model.addAttribute(reportesCapcerDTO);
                        return super.getViewName("informeCurso");
                    } else {

                        // Obtener id Curso
                        TnCapCursoDTO tnCapCursoDTO = super.getService(ReporteSPCService.class).getCursoByClave(reportesCapcerDTO.getCursoClave());

                        if (tnCapCursoDTO == null) {
                            super.saveError(model, "Error: Proporcione una clave de curso valida");

                            reportesCapcerDTO.setCicloEjeTematicoBusqueda(0);
                            reportesCapcerDTO.setIdCursoBusqueda(0);
                            reportesCapcerDTO.setValidacion(true);

                            model.addAttribute(reportesCapcerDTO);
                            return super.getViewName("informeCurso");
                        } else {
                            logger.debug("ReportesCursoSPCController -> informeCurso -> idCurso --------->" + tnCapCursoDTO.getIdCurso());
                            reportesCapcerDTO.setIdCursoBusqueda(tnCapCursoDTO.getIdCurso());
                            reportesCapcerDTO.setCicloEjeTematicoBusqueda(tnCapCursoDTO.getCicloEjeTematico());
                            reportesCapcerDTO.setValidacion(true);

                            model.addAttribute(reportesCapcerDTO);
                            return super.getViewName("informeCurso");
                        }
                    }
                }
            } else {
                // No selecciono tipo de busqueda
                super.saveError(model, "sireh.label.spc.capcer.reportes.error.tipoBusqueda");

                model.addAttribute(reportesCapcerDTO);
                return super.getViewName("informeCurso");
            }
        } else {
            // Cancelar
            reportesCapcerDTO = new ReportesCapcerDTO();

            // Obtener roles
            reportesCapcerDTO = getRol(reportesCapcerDTO);
        }

        model.addAttribute(reportesCapcerDTO);
        return super.getViewName("informeCurso");
    }

    /******************************************************************************************************************************************************************************/

    /**
     * Evaluaciones de reaccion
     * @author Armando Zuñiga
     * @param model Model
     * @param reportesCapcerDTO ReportesCapcerDTO
     * @return String
     */
    @RequestMapping
    public String reporteEvaluaciones(Model model, ReportesCapcerDTO reportesCapcerDTO) {
        // Obtener roles
        List roles = super.security().getRoles();
        for (Object rol: roles) {
            logger.debug("navegacionRegistroCurso -> Roles ---------->" + (String)rol);
        }

        // Obtener roles
        reportesCapcerDTO = getRol(reportesCapcerDTO);

        if (reportesCapcerDTO.isMuestraReporte()) {
            if (reportesCapcerDTO.getTipoBusqueda() != null && !reportesCapcerDTO.getTipoBusqueda().equals("")) {
                logger.debug("ReportesCursoSPCController -> reporteEvaluaciones -> tipoBusqueda --------->" + reportesCapcerDTO.getTipoBusqueda());

                if (reportesCapcerDTO.getTipoBusqueda().equals("CURSO")) {
                    // Opcion 1
                    if (reportesCapcerDTO.getCicloEjeTematico() == null || reportesCapcerDTO.getCicloEjeTematico() == 0) {
                        super.saveError(model, "sireh.label.spc.capcer.reportes.error.cicloEjeTematico");

                        reportesCapcerDTO.setCicloEjeTematicoBusqueda(0);
                        reportesCapcerDTO.setIdCursoBusqueda(0);
                        reportesCapcerDTO.setValidacion(true);

                        model.addAttribute(reportesCapcerDTO);
                        return super.getViewName("reporteEvaluaciones");
                    } else if (reportesCapcerDTO.getIdCurso() == null || reportesCapcerDTO.getIdCurso() == 0) {
                        super.saveError(model, "sireh.label.spc.capcer.reportes.error.idCurso");

                        reportesCapcerDTO.setCicloEjeTematicoBusqueda(0);
                        reportesCapcerDTO.setIdCursoBusqueda(0);
                        reportesCapcerDTO.setValidacion(true);

                        model.addAttribute(reportesCapcerDTO);
                        return super.getViewName("reporteEvaluaciones");
                    } else {
                        reportesCapcerDTO.setCicloEjeTematicoBusqueda(reportesCapcerDTO.getCicloEjeTematico());
                        reportesCapcerDTO.setIdCursoBusqueda(reportesCapcerDTO.getIdCurso());
                        reportesCapcerDTO.setValidacion(true);

                        model.addAttribute(reportesCapcerDTO);
                        return super.getViewName("reporteEvaluaciones");
                    }
                } else {
                    // Opcion 2
                    if (reportesCapcerDTO.getCursoClave() == null || reportesCapcerDTO.getCursoClave().equals("")) {
                        super.saveError(model, "sireh.label.spc.capcer.reportes.error.cursoClave");

                        reportesCapcerDTO.setCicloEjeTematicoBusqueda(0);
                        reportesCapcerDTO.setIdCursoBusqueda(0);
                        reportesCapcerDTO.setValidacion(true);

                        model.addAttribute(reportesCapcerDTO);
                        return super.getViewName("reporteEvaluaciones");
                    } else {

                        // Obtener id Curso
                        TnCapCursoDTO tnCapCursoDTO = super.getService(ReporteSPCService.class).getCursoByClave(reportesCapcerDTO.getCursoClave());

                        if (tnCapCursoDTO == null) {
                            super.saveError(model, "Error: Proporcione una clave de curso valida");

                            reportesCapcerDTO.setCicloEjeTematicoBusqueda(0);
                            reportesCapcerDTO.setIdCursoBusqueda(0);
                            reportesCapcerDTO.setValidacion(true);

                            model.addAttribute(reportesCapcerDTO);
                            return super.getViewName("reporteEvaluaciones");
                        } else {
                            logger.debug("ReportesCursoSPCController -> evaluacionReaccion -> idCurso --------->" + tnCapCursoDTO.getIdCurso());
                            reportesCapcerDTO.setIdCursoBusqueda(tnCapCursoDTO.getIdCurso());
                            reportesCapcerDTO.setCicloEjeTematicoBusqueda(tnCapCursoDTO.getCicloEjeTematico());
                            reportesCapcerDTO.setValidacion(true);

                            model.addAttribute(reportesCapcerDTO);
                            return super.getViewName("reporteEvaluaciones");
                        }
                    }
                }
            } else {
                // No selecciono tipo de busqueda
                super.saveError(model, "sireh.label.spc.capcer.reportes.error.tipoBusqueda");

                model.addAttribute(reportesCapcerDTO);
                return super.getViewName("reporteEvaluaciones");
            }
        } else {
            // Cancelar
            reportesCapcerDTO = new ReportesCapcerDTO();

            // Obtener roles
            reportesCapcerDTO = getRol(reportesCapcerDTO);
        }

        model.addAttribute(reportesCapcerDTO);
        return super.getViewName("reporteEvaluaciones");
    }

    /**
     * Método encargado de obtener los roles disponibles para el Módulo: Reportes
     * @author Oscar S.
     * @param reportesCapcerDTO ReportesCapcerDTO
     * @return reportesCapcerDTO ReportesCapcerDTO
     */
    private ReportesCapcerDTO getRol(ReportesCapcerDTO reportesCapcerDTO) {
        // Rol Administrador de Capacitacion
        if (super.security().isUserAuthorized(SECURITY_ROL_ADM)) {
            reportesCapcerDTO.setRolAdministradorCapacitacion(true);
        } else {
            reportesCapcerDTO.setRolAdministradorCapacitacion(false);
        }

        // Rol Operador de Capacitacion
        if (super.security().isUserAuthorized(SECURITY_ROL_OPER)) {
            reportesCapcerDTO.setRolOperadorCapacitacion(true);
        } else {
            reportesCapcerDTO.setRolOperadorCapacitacion(false);
        }
        return reportesCapcerDTO;
    }

    /******************************************************************************************************************************************************************************/

    /**
     * Acuerdo por Unidad Administrativa
     * @author Armando Zuñiga
     * @param model Model
     * @param reportesCapcerDTO ReportesCapcerDTO
     * @return String
     */
    @RequestMapping
    public String acuerdos(Model model, ReportesCapcerDTO reportesCapcerDTO) {
        // Obtener roles
        List roles = super.security().getRoles();
        for (Object rol: roles) {
            logger.debug("navegacionRegistroCurso -> Roles ---------->" + (String)rol);
        }

        if (reportesCapcerDTO.isMuestraReporte()) {
            if (reportesCapcerDTO.getCicloEjeTematico() == null || reportesCapcerDTO.getCicloEjeTematico() == 0) {
                super.saveError(model, "sireh.label.spc.capcer.reportes.error.cicloEjeTematico");

                reportesCapcerDTO.setCicloEjeTematicoBusqueda(0);
                reportesCapcerDTO.setIdCursoBusqueda(0);
                reportesCapcerDTO.setValidacion(true);

                model.addAttribute(reportesCapcerDTO);
                return super.getViewName("acuerdos");
            } else {
                reportesCapcerDTO.setCicloEjeTematicoBusqueda(reportesCapcerDTO.getCicloEjeTematico());
                reportesCapcerDTO.setIdCursoBusqueda(reportesCapcerDTO.getIdCurso());
                reportesCapcerDTO.setValidacion(true);

                model.addAttribute(reportesCapcerDTO);
                return super.getViewName("acuerdos");
            }
        } else {
            reportesCapcerDTO = new ReportesCapcerDTO();
        }

        // Rol Administrador de Capacitacion
        if (super.security().isUserAuthorized(SECURITY_ROL_ADM)) {
            reportesCapcerDTO.setRolAdministradorCapacitacion(true);
        } else {
            reportesCapcerDTO.setRolAdministradorCapacitacion(false);
        }

        // Rol Operador de Capacitacion
        if (super.security().isUserAuthorized(SECURITY_ROL_OPER)) {
            reportesCapcerDTO.setRolOperadorCapacitacion(true);
        } else {
            reportesCapcerDTO.setRolOperadorCapacitacion(false);
        }

        model.addAttribute(reportesCapcerDTO);
        return super.getViewName("acuerdos");
    }

    /**
     * Metodo encargado de generar archivo xls de Acuerdos CAPCER
     * @author Armando Zuñiga.
     * @param model Model
     * @param reportesCapcerDTO ReportesCapcerDTO
     * @param response HttpServletResponse
     */
    @RequestMapping
    public void generaExcelAcuerdos(Model model, ReportesCapcerDTO reportesCapcerDTO, HttpServletResponse response) {
        BufferedWriter bw = null;

        try {
            if (reportesCapcerDTO.getCicloEjeTematico() == null || reportesCapcerDTO.getCicloEjeTematico().equals("")) {
                super.saveError(model, "sireh.label.spc.capcer.reportes.error.cicloEjeTematico");
            } else {

                String fechaIni = "";
                String fechaFin = "";
                String trime = "";
                Integer cicloAcuedo = reportesCapcerDTO.getCicloEjeTematico();

                if (reportesCapcerDTO.getTrimestre() == 0) { // ENE-DIC
                    fechaIni = "01/01/" + reportesCapcerDTO.getCicloEjeTematico();
                    fechaFin = "01/01/" + (reportesCapcerDTO.getCicloEjeTematico() + 1);
                    trime = "-Completo";
                } else if (reportesCapcerDTO.getTrimestre() == 1) { //ENE-MAR
                    fechaIni = "01/01/" + reportesCapcerDTO.getCicloEjeTematico();
                    fechaFin = "01/04/" + reportesCapcerDTO.getCicloEjeTematico();
                    trime = "-1er Trimestre";
                } else if (reportesCapcerDTO.getTrimestre() == 2) { // ABR-JUN
                    fechaIni = "01/04/" + reportesCapcerDTO.getCicloEjeTematico();
                    fechaFin = "01/07/" + reportesCapcerDTO.getCicloEjeTematico();
                    trime = "-2do Trimestre";
                } else if (reportesCapcerDTO.getTrimestre() == 3) { // JUL-SEP
                    fechaIni = "01/07/" + reportesCapcerDTO.getCicloEjeTematico();
                    fechaFin = "01/10/" + reportesCapcerDTO.getCicloEjeTematico();
                    trime = "-3er Trimestre";
                } else if (reportesCapcerDTO.getTrimestre() == 4) { // OCT-DIC
                    fechaIni = "01/10/" + reportesCapcerDTO.getCicloEjeTematico();
                    fechaFin = "01/01/" + (reportesCapcerDTO.getCicloEjeTematico() + 1);
                    trime = "-4to Trimestre";
                }
                logger.debug("cicloAcuerdos -> " + cicloAcuedo);

                // Genera archivo temporal xls
                String fileNameRandom = UUID.randomUUID().toString();
                String fileNameTemp = fileNameRandom + ".xls";
                File file = new File(super.configuration().getString("local.temp.dir") + File.separator + fileNameTemp);

                // Genera xls
                HSSFWorkbook libro = new HSSFWorkbook();
                FileOutputStream archivo = new FileOutputStream(super.configuration().getString("local.temp.dir") + File.separator + fileNameTemp);
                Sheet hoja1 = libro.createSheet("Acuerdo Unidad Admin");
                Sheet hoja2 = libro.createSheet("Acuerdo Modalidad");
                Sheet hoja3 = libro.createSheet("Acuerdo Insti Educ");
                bw = new BufferedWriter(new FileWriter(file, true));

                // Hoja 1
                libro = generaHoja1(libro, hoja1, cicloAcuedo, fechaIni, fechaFin);
                // Hoja 2
                libro = generaHoja2(libro, hoja2, cicloAcuedo, fechaIni, fechaFin);
                // Hoja 3
                libro = generaHoja3(libro, hoja3, cicloAcuedo, fechaIni, fechaFin);

                // Escribir archivo
                libro.write(archivo);

                // Descarga archivo xls
                byte[] bytes = IOUtils.toByteArray(new FileInputStream(file));
                response.setContentType("application/vnd.ms-excel");
                response.setContentLength(bytes.length);
                response.setHeader("Content-Disposition", "attachment; filename=ReporteAcuerdos_" + cicloAcuedo + trime + ".xls");
                OutputStream out = response.getOutputStream();
                out.write(bytes, 0, bytes.length);
            }
        } catch (Exception e) {
            e.getStackTrace();
            e.getMessage();
            logger.debug("*****");
            logger.debug(e.getMessage());
            super.saveError(model, "sireh.label.spc.capcer.reportes.error.cicloEjeTematico");
        }
    }

    /**
     * Metodo encargado de generar la hoja 1 del archivo de Acuerdos CAPCER.
     * @author Armando Zuñiga.
     * @param libro HSSFWorkbook
     * @param hoja1 Sheet
     * @param fechaIni String
     * @param fechaFin String
     * @param ciclo Integer
     * @return libro HSSFWorkbook
     */
    private HSSFWorkbook generaHoja1(HSSFWorkbook libro, Sheet hoja1, Integer ciclo, String fechaIni, String fechaFin) {
        Integer x;
        Integer y;

        Integer colum;
        Integer x2;
        String titulo;
        x2 = 0;
        HSSFFont font = libro.createFont();
        HSSFCellStyle style = libro.createCellStyle();
        HSSFCellStyle style2 = libro.createCellStyle();
        HSSFCellStyle style3 = libro.createCellStyle();
        HSSFCellStyle style_T = libro.createCellStyle();
        HSSFPalette palette = libro.getCustomPalette();

        // Formato
        palette.setColorAtIndex(new Byte((byte)41), new Byte((byte)146), new Byte((byte)208), new Byte((byte)80));
        font.setBoldweight(HSSFFont.BOLDWEIGHT_BOLD);
        style.setFont(font);
        style.setAlignment(style.ALIGN_CENTER);
        style.setFillForegroundColor(palette.getColor(41).getIndex());
        style.setFillPattern(style.SOLID_FOREGROUND);

        style2.setAlignment(style2.ALIGN_RIGHT);
        style2.setDataFormat(libro.getCreationHelper().createDataFormat().getFormat("_-* #,##0.00_-;-* #,##0.00_-;_-* \"-\"??_-;_-@_-"));

        style3.setAlignment(style3.ALIGN_RIGHT);
        style3.setDataFormat(libro.getCreationHelper().createDataFormat().getFormat("_-* #,##0_-;-* #,##0_-;_-* \"-\"_-;_-@_-"));

        style_T.setFont(font);
        style_T.setFillPattern(style_T.SOLID_FOREGROUND);
        style_T.setDataFormat(libro.getCreationHelper().createDataFormat().getFormat("_-* #,##0.00_-;-* #,##0.00_-;_-* \"-\"??_-;_-@_-"));
        style_T.setAlignment(style_T.ALIGN_RIGHT);

        // Llamada a servicio - Hoja 1
        List<Map<Integer, Object>> peList = super.getService(ReporteSPCService.class).generaAcuerdoUnidad(ciclo, fechaIni, fechaFin);

        // Hoja 1 - Escribir en archivo
        palette.setColorAtIndex(new Byte((byte)41), new Byte((byte)146), new Byte((byte)208), new Byte((byte)80));
        font.setBoldweight(HSSFFont.BOLDWEIGHT_BOLD);
        style.setFont(font);
        style.setAlignment(style.ALIGN_CENTER);

        x = 0;
        colum = 0;
        titulo = "";
        for (Map rowMap: peList) {
            Row fila02 = hoja1.createRow(x);
            y = 0;

            for (int columna = 1; columna <= rowMap.size(); columna++) {
                logger.debug("cicloAcuerdos -> Map-> " + rowMap.get(columna));
                Cell celda_2 = fila02.createCell(y);

                if (columna == 1) {
                    titulo = (String)rowMap.get(columna);
                }

                if (x > 0 && y > 0) {
                    if (titulo.equals("Total Inscritos")) {
                        celda_2.setCellType(celda_2.CELL_TYPE_FORMULA);
                        celda_2.setCellFormula("SUM(" + CellReference.convertNumToColString(y) + "2" + ":" + 
                                               CellReference.convertNumToColString(y) + x + ")");
                    } else if (titulo.equals("Total Acreditados") && columna == (rowMap.size() - 2)) {
                        //logger.debug("BREAK");
                        break;
                    } else {
                        celda_2.setCellValue(((BigDecimal)rowMap.get(columna)).doubleValue());
                    }
                } else {
                    celda_2.setCellValue((String)rowMap.get(columna));
                }
                y++;
            }
            x++;
        }

        // Resize
        HSSFRow row = libro.getSheetAt(0).getRow(1);
        for (int colNum = 0; colNum < row.getLastCellNum(); colNum++) {
            libro.getSheetAt(0).autoSizeColumn(colNum);
        }
        return libro;
    }

    /**
     * Metodo encargado de generar la hoja 2 del archivo de Acuerdos CAPCER.
     * @author Armando Zuñiga.
     * @param libro HSSFWorkbook
     * @param hoja2 Sheet
     * @param fechaIni String
     * @param fechaFin String
     * @param ciclo Integer
     * @return libro HSSFWorkbook
     */
    private HSSFWorkbook generaHoja2(HSSFWorkbook libro, Sheet hoja2, Integer ciclo, String fechaIni, String fechaFin) {
        Integer x;
        Integer y;

        Integer colum;
        Integer x2;
        String titulo;
        x2 = 0;
        HSSFFont font = libro.createFont();
        HSSFCellStyle style = libro.createCellStyle();
        HSSFCellStyle style2 = libro.createCellStyle();
        HSSFCellStyle style3 = libro.createCellStyle();
        HSSFCellStyle style_T = libro.createCellStyle();
        HSSFPalette palette = libro.getCustomPalette();

        // Formato
        palette.setColorAtIndex(new Byte((byte)41), new Byte((byte)146), new Byte((byte)208), new Byte((byte)80));
        font.setBoldweight(HSSFFont.BOLDWEIGHT_BOLD);
        style.setFont(font);
        style.setAlignment(style.ALIGN_CENTER);
        style.setFillForegroundColor(palette.getColor(41).getIndex());
        style.setFillPattern(style.SOLID_FOREGROUND);

        style2.setAlignment(style2.ALIGN_RIGHT);
        style2.setDataFormat(libro.getCreationHelper().createDataFormat().getFormat("_-* #,##0.00_-;-* #,##0.00_-;_-* \"-\"??_-;_-@_-"));

        style3.setAlignment(style3.ALIGN_RIGHT);
        style3.setDataFormat(libro.getCreationHelper().createDataFormat().getFormat("_-* #,##0_-;-* #,##0_-;_-* \"-\"_-;_-@_-"));

        style_T.setFont(font);
        style_T.setFillPattern(style_T.SOLID_FOREGROUND);
        style_T.setDataFormat(libro.getCreationHelper().createDataFormat().getFormat("_-* #,##0.00_-;-* #,##0.00_-;_-* \"-\"??_-;_-@_-"));
        style_T.setAlignment(style_T.ALIGN_RIGHT);

        // Llamada a servicio - Hoja 2
        List<Map<Integer, Object>> peList = super.getService(ReporteSPCService.class).generaAcuerdoModalidad(ciclo, fechaIni, fechaFin);

        // Hoja 1 - Escribir en archivo
        palette.setColorAtIndex(new Byte((byte)41), new Byte((byte)146), new Byte((byte)208), new Byte((byte)80));
        font.setBoldweight(HSSFFont.BOLDWEIGHT_BOLD);
        style.setFont(font);
        style.setAlignment(style.ALIGN_CENTER);

        x = 0;
        colum = 0;
        titulo = "";
        for (Map rowMap: peList) {
            Row fila02 = hoja2.createRow(x);
            y = 0;

            for (int columna = 1; columna <= rowMap.size(); columna++) {
                logger.debug("cicloAcuerdos -> Map-> " + rowMap.get(columna));
                Cell celda_2 = fila02.createCell(y);

                if (x > 0 && y > 0) {
                    celda_2.setCellValue(((BigDecimal)rowMap.get(columna)).doubleValue());
                } else {
                    celda_2.setCellValue((String)rowMap.get(columna));
                }

                y++;
            }
            x++;
        }

        Row fila02 = hoja2.createRow(x);
        Cell celda_2 = fila02.createCell(0);
        celda_2.setCellValue((String)"Total General");

        Cell celda_3 = fila02.createCell(1);
        celda_3.setCellType(celda_3.CELL_TYPE_FORMULA);
        celda_3.setCellFormula("SUM(" + CellReference.convertNumToColString(1) + "2" + ":" + CellReference.convertNumToColString(1) + x + ")");

        Cell celda_4 = fila02.createCell(2);
        celda_4.setCellType(celda_4.CELL_TYPE_FORMULA);
        celda_4.setCellFormula("SUM(" + CellReference.convertNumToColString(2) + "2" + ":" + CellReference.convertNumToColString(2) + x + ")");

        Cell celda_4_1 = fila02.createCell(3);
        celda_4_1.setCellType(celda_4_1.CELL_TYPE_FORMULA);
        celda_4_1.setCellFormula("SUM(" + CellReference.convertNumToColString(3) + "2" + ":" + CellReference.convertNumToColString(3) + x + ")");

        // Resize
        HSSFRow row = libro.getSheetAt(1).getRow(1);
        for (int colNum = 0; colNum < row.getLastCellNum(); colNum++) {
            libro.getSheetAt(1).autoSizeColumn(colNum);
        }
        return libro;
    }

    /**
     * Metodo encargado de generar la hoja 3 del archivo de Acuerdos CAPCER.
     * @param libro HSSFWorkbook
     * @param hoja3 Sheet
     * @param fechaIni String
     * @param fechaFin String
     * @param ciclo Integer
     * @author Armando Zuñiga.
     * @return libro HSSFWorkbook
     */
    private HSSFWorkbook generaHoja3(HSSFWorkbook libro, Sheet hoja3, Integer ciclo, String fechaIni, String fechaFin) {
        Integer x;
        Integer y;

        Integer colum;
        Integer x2;
        String orden;
        Integer xT1;
        Integer xT2;
        Integer totalCasos;
        Integer xTotalGeneral;

        x2 = 0;
        HSSFFont font = libro.createFont();
        HSSFCellStyle style = libro.createCellStyle();
        HSSFCellStyle style2 = libro.createCellStyle();
        HSSFCellStyle style3 = libro.createCellStyle();
        HSSFCellStyle style_T = libro.createCellStyle();
        HSSFCellStyle style_Porce = libro.createCellStyle();
        HSSFPalette palette = libro.getCustomPalette();

        // Formato
        palette.setColorAtIndex(new Byte((byte)41), new Byte((byte)146), new Byte((byte)208), new Byte((byte)80));
        font.setBoldweight(HSSFFont.BOLDWEIGHT_BOLD);
        style.setFont(font);
        style.setAlignment(style.ALIGN_CENTER);
        style.setFillForegroundColor(palette.getColor(41).getIndex());
        style.setFillPattern(style.SOLID_FOREGROUND);

        style2.setAlignment(style2.ALIGN_RIGHT);
        style2.setDataFormat(libro.getCreationHelper().createDataFormat().getFormat("_-* #,##0.00_-;-* #,##0.00_-;_-* \"-\"??_-;_-@_-"));

        style3.setAlignment(style3.ALIGN_RIGHT);
        style3.setDataFormat(libro.getCreationHelper().createDataFormat().getFormat("_-* #,##0_-;-* #,##0_-;_-* \"-\"_-;_-@_-"));

        style_T.setFont(font);
        style_T.setFillPattern(style_T.SOLID_FOREGROUND);
        style_T.setDataFormat(libro.getCreationHelper().createDataFormat().getFormat("_-* #,##0.00_-;-* #,##0.00_-;_-* \"-\"??_-;_-@_-"));
        style_T.setAlignment(style_T.ALIGN_RIGHT);

        style_Porce.setDataFormat(libro.getCreationHelper().createDataFormat().getFormat("0%"));

        // Llamada a servicio - Hoja 3
        List<Map<Integer, Object>> peList = super.getService(ReporteSPCService.class).generaAcuerdoInsEdu(ciclo, fechaIni, fechaFin);

        // Hoja 3 - Escribir en archivo
        palette.setColorAtIndex(new Byte((byte)41), new Byte((byte)146), new Byte((byte)208), new Byte((byte)80));
        font.setBoldweight(HSSFFont.BOLDWEIGHT_BOLD);
        style.setFont(font);
        style.setAlignment(style.ALIGN_CENTER);

        x = 0;
        colum = 0;
        orden = "";
        xT1 = 0;
        xT2 = 0;
        xTotalGeneral = 0;
        totalCasos = peList.size();

        for (Map rowMap: peList) {
            Row fila02 = hoja3.createRow(x);
            y = 0;

            for (int columna = 1; columna <= rowMap.size(); columna++) {
                logger.debug("cicloAcuerdos -> Map-> " + rowMap.get(columna));

                if (columna == 1) {
                    if (x > 0) {
                        orden = rowMap.get(columna).toString();
                    }
                    y++;
                    continue;
                }

                Cell celda_2 = fila02.createCell(y - 1);

                if (x > 0 && y > 2) {
                    if (orden.equals("3") && y == 3) {
                        celda_2.setCellType(celda_2.CELL_TYPE_FORMULA);
                        celda_2.setCellFormula("SUM(" + CellReference.convertNumToColString(y - 1) + "2" + ":" + CellReference.convertNumToColString(y - 1) + x + ")");
                        xT1 = x + 1;
                    } else if (orden.equals("3") && y == 5) {
                        celda_2.setCellType(celda_2.CELL_TYPE_FORMULA);
                        celda_2.setCellFormula("SUM(" + CellReference.convertNumToColString(y - 1) + "2" + ":" + CellReference.convertNumToColString(y - 1) + x + ")");

                    } else if (orden.equals("5") && y == 3) {
                        celda_2.setCellType(celda_2.CELL_TYPE_FORMULA);
                        celda_2.setCellFormula("SUM(" + CellReference.convertNumToColString(y - 1) + (xT1 + 1) + ":" + CellReference.convertNumToColString(y - 1) + x + ")");
                        xT2 = x + 1;
                    } else if (orden.equals("5") && y == 5) {
                        celda_2.setCellType(celda_2.CELL_TYPE_FORMULA);
                        celda_2.setCellFormula("SUM(" + CellReference.convertNumToColString(y - 1) + (xT1 + 1) + ":" + CellReference.convertNumToColString(y - 1) + x + ")");
                    } else {
                        celda_2.setCellValue(((BigDecimal)rowMap.get(columna)).doubleValue());
                    }
                } else {
                    celda_2.setCellValue((String)rowMap.get(columna));
                }
                y++;
            }
            x++;
        }

        Row fila02 = hoja3.createRow(x);
        Cell celda_2 = fila02.createCell(1);
        celda_2.setCellValue((String)"Total General");
        xTotalGeneral = x + 1;

        Cell celda_3 = fila02.createCell(2);
        celda_3.setCellType(celda_3.CELL_TYPE_FORMULA);
        celda_3.setCellFormula(CellReference.convertNumToColString(2) + xT1 + "+" + CellReference.convertNumToColString(2) + xT2);

        Cell celda_4 = fila02.createCell(4);
        celda_4.setCellType(celda_4.CELL_TYPE_FORMULA);
        celda_4.setCellFormula(CellReference.convertNumToColString(4) + xT1 + "+" + CellReference.convertNumToColString(4) + xT2);

        Cell celda_4_1 = fila02.createCell(3);
        celda_4_1.setCellStyle(style_Porce);
        celda_4_1.setCellType(celda_4_1.CELL_TYPE_FORMULA);
        celda_4_1.setCellFormula(CellReference.convertNumToColString(3) + xT1 + "+" + CellReference.convertNumToColString(3) + xT2);

        for (x = 1; x < xT1 - 1; x++) {
            Row fila05 = hoja3.getRow(x);
            Cell celda_5 = fila05.createCell(3);
            celda_5.setCellStyle(style_Porce);
            celda_5.setCellType(celda_5.CELL_TYPE_FORMULA);
            celda_5.setCellFormula(CellReference.convertNumToColString(2) + (x + 1) + "/" + CellReference.convertNumToColString(2) + xT1);
        }

        Row fila05 = hoja3.getRow(xT1 - 1);
        Cell celda_5 = fila05.createCell(3);
        celda_5.setCellStyle(style_Porce);
        celda_5.setCellType(celda_5.CELL_TYPE_FORMULA);
        celda_5.setCellFormula(CellReference.convertNumToColString(2) + xT1 + "/" + CellReference.convertNumToColString(2) + xTotalGeneral);

        for (x = xT1; x < xT2 - 1; x++) {
            Row fila06 = hoja3.getRow(x);
            Cell celda_6 = fila06.createCell(3);
            celda_6.setCellStyle(style_Porce);
            celda_6.setCellType(celda_6.CELL_TYPE_FORMULA);
            celda_6.setCellFormula(CellReference.convertNumToColString(2) + (x + 1) + "/" + CellReference.convertNumToColString(2) + xT2);
        }

        Row fila06 = hoja3.getRow(xT2 - 1);
        Cell celda_6 = fila06.createCell(3);
        celda_6.setCellStyle(style_Porce);
        celda_6.setCellType(celda_6.CELL_TYPE_FORMULA);
        celda_6.setCellFormula(CellReference.convertNumToColString(2) + xT2 + "/" + CellReference.convertNumToColString(2) + xTotalGeneral);

        for (x = 1; x <= totalCasos; x++) {
            Row fila07 = hoja3.getRow(x);
            Cell celda_7 = fila07.createCell(5);
            celda_7.setCellStyle(style_Porce);
            celda_7.setCellType(celda_7.CELL_TYPE_FORMULA);
            celda_7.setCellFormula(CellReference.convertNumToColString(4) + (x + 1) + "/" + CellReference.convertNumToColString(2) + (x + 1));
        }

        // Resize getSheetAt(1) para la pestaña 2 indice comienza del 0 al 2
        HSSFRow row = libro.getSheetAt(2).getRow(1);
        for (int colNum = 0; colNum < row.getLastCellNum(); colNum++) {
            libro.getSheetAt(2).autoSizeColumn(colNum);
        }
        return libro;
    }

    /******************************************************************************************************************************************************************************/

    /**
     * Carta notificacion
     * @author Josue Torres
     * @param model Model
     * @return String
     */
    @RequestMapping
    public String cartaNotificacion(Model model, ReportesCapcerDTO reportesCapcerDTO) {
        if (reportesCapcerDTO.isMuestraReporte()) {

            if (reportesCapcerDTO.getTipoBusqueda() != null && !reportesCapcerDTO.getTipoBusqueda().equals("")) {
                logger.debug("ReportesCursoSPCController -> cartaNotificacion -> tipoBusqueda --------->" + reportesCapcerDTO.getTipoBusqueda());

                if (reportesCapcerDTO.getTipoBusqueda().equals("CURSO")) {
                    // Opcion 1
                    if (reportesCapcerDTO.getCicloEjeTematico() == null || reportesCapcerDTO.getCicloEjeTematico() == 0) {
                        super.saveError(model, "sireh.label.spc.capcer.reportes.error.cicloEjeTematico");

                        reportesCapcerDTO.setCicloEjeTematicoBusqueda(0);
                        reportesCapcerDTO.setIdCursoBusqueda(0);
                        reportesCapcerDTO.setValidacion(true);

                        model.addAttribute(reportesCapcerDTO);
                        return super.getViewName("cartaNotificacion");
                    } else if (reportesCapcerDTO.getIdCurso() == null || reportesCapcerDTO.getIdCurso() == 0) {
                        super.saveError(model, "sireh.label.spc.capcer.reportes.error.idCurso");

                        reportesCapcerDTO.setCicloEjeTematicoBusqueda(0);
                        reportesCapcerDTO.setIdCursoBusqueda(0);
                        reportesCapcerDTO.setValidacion(true);

                        model.addAttribute(reportesCapcerDTO);
                        return super.getViewName("cartaNotificacion");
                    } else {
                        reportesCapcerDTO.setCicloEjeTematicoBusqueda(reportesCapcerDTO.getCicloEjeTematico());
                        reportesCapcerDTO.setIdCursoBusqueda(reportesCapcerDTO.getIdCurso());
                        reportesCapcerDTO.setValidacion(true);
                        
                        model.addAttribute(reportesCapcerDTO);
                        return super.getViewName("cartaNotificacion");
                    }
                } else {
                    // Opcion 2
                    if (reportesCapcerDTO.getCursoClave() == null || reportesCapcerDTO.getCursoClave().equals("")) {
                        super.saveError(model, "Error: Proporcione una clave de curso valida");
                        //super.saveError(model, "sireh.label.spc.capcer.reportes.error.cursoClave");

                        reportesCapcerDTO.setCicloEjeTematicoBusqueda(0);
                        reportesCapcerDTO.setIdCursoBusqueda(0);
                        reportesCapcerDTO.setValidacion(true);

                        model.addAttribute(reportesCapcerDTO);
                        return super.getViewName("cartaNotificacion");
                    } else {
                        reportesCapcerDTO.setCicloEjeTematicoBusqueda(reportesCapcerDTO.getCicloEjeTematico2());

                        // Obtener id Curso
                        TnCapCursoDTO tnCapCursoDTO = super.getService(ReporteSPCService.class).getCursoByClave(reportesCapcerDTO.getCursoClave());
                        TcCapCursoPrincpDTO tcCapCursoPrincpDTO = super.getService(ReporteSPCService.class).getCursoPrincpByClave(reportesCapcerDTO.getCursoClave());
                        
                        if (tnCapCursoDTO != null && tcCapCursoPrincpDTO != null) {
                            TnCapParticipanteDTO tnCapParticipanteDTO = super.getService(ReporteSPCService.class).getRfcParticipanteByIdCurso(tnCapCursoDTO.getCursoClave(), reportesCapcerDTO.getRfcParticipanteInput());
                            
                            if (tnCapCursoDTO != null && tcCapCursoPrincpDTO != null) {
                                if (tnCapParticipanteDTO != null && tnCapParticipanteDTO != null) {
                                    reportesCapcerDTO.setIdCursoBusqueda(tnCapCursoDTO.getIdCurso());
                                    reportesCapcerDTO.setValidacion(true);
                                    reportesCapcerDTO.setIdModalidad(Integer.valueOf(tcCapCursoPrincpDTO.getIdModalidad()).toString());
                                    reportesCapcerDTO.setRfcParticipante(reportesCapcerDTO.getRfcParticipanteInput());
                                } else {
                                    super.saveError(model, "Error: Rfc no existe en el curso seleccionado");
                                    reportesCapcerDTO.setCicloEjeTematicoBusqueda(0);
                                    reportesCapcerDTO.setIdCursoBusqueda(0);
                                    reportesCapcerDTO.setValidacion(true);
                                    model.addAttribute(reportesCapcerDTO);
                                    return super.getViewName("cartaNotificacion");
                                }
                            } else {
                                super.saveError(model, "Error: Proporcione una clave de curso valida");
                                reportesCapcerDTO.setCicloEjeTematicoBusqueda(0);
                                reportesCapcerDTO.setIdCursoBusqueda(0);
                                reportesCapcerDTO.setValidacion(true);
                                model.addAttribute(reportesCapcerDTO);
                                return super.getViewName("cartaNotificacion");
                            }
                        } else {
                            super.saveError(model, "Error: No existe curso con esa clave");
                            reportesCapcerDTO.setCicloEjeTematicoBusqueda(0);
                            reportesCapcerDTO.setIdCursoBusqueda(0);
                            reportesCapcerDTO.setValidacion(true);
                            model.addAttribute(reportesCapcerDTO);
                            return super.getViewName("cartaNotificacion");
                        }
                        model.addAttribute(reportesCapcerDTO);
                        return super.getViewName("cartaNotificacion");
                    }
                }
            } else {
                super.saveError(model, "sireh.label.spc.capcer.reportes.error.tipoBusqueda");

                model.addAttribute(reportesCapcerDTO);
                return super.getViewName("cartaNotificacion");
            }
        } else {
            reportesCapcerDTO = new ReportesCapcerDTO();
        }
        model.addAttribute(reportesCapcerDTO);
        return super.getViewName("cartaNotificacion");
    }

    /******************************************************************************************************************************************************************************/

    /**
     * Relacion de firmas
     * @author Ricardo León E.
     * @param model Model
     * @return String
     */
    @RequestMapping
    public String relacionFirmas(Model model, ReportesCapcerDTO reportesCapcerDTO) {
        if (reportesCapcerDTO.isMuestraReporte()) {

            if (reportesCapcerDTO.getTipoBusqueda() != null && !reportesCapcerDTO.getTipoBusqueda().equals("")) {
                logger.debug("ReportesCursoSPCController -> listaAsistencia -> tipoBusqueda --------->" + reportesCapcerDTO.getTipoBusqueda());

                if (reportesCapcerDTO.getTipoBusqueda().equals("CURSO")) {
                    // Opcion 1
                   if (reportesCapcerDTO.getCicloEjeTematico() == null || reportesCapcerDTO.getCicloEjeTematico() == 0) {
                        super.saveError(model, "sireh.label.spc.capcer.reportes.error.cicloEjeTematico");

                        reportesCapcerDTO.setCicloEjeTematicoBusqueda(0);
                        reportesCapcerDTO.setIdCursoBusqueda(0);
                        reportesCapcerDTO.setValidacion(true);

                        model.addAttribute(reportesCapcerDTO);
                        return super.getViewName("relacionFirmas");
                    } else if (reportesCapcerDTO.getIdCurso() == null || reportesCapcerDTO.getIdCurso() == 0) {
                        super.saveError(model, "sireh.label.spc.capcer.reportes.error.idCurso");

                        reportesCapcerDTO.setCicloEjeTematicoBusqueda(0);
                        reportesCapcerDTO.setIdCursoBusqueda(0);
                        reportesCapcerDTO.setValidacion(true);

                        model.addAttribute(reportesCapcerDTO);
                        return super.getViewName("relacionFirmas");
                    } else {
                        reportesCapcerDTO.setCicloEjeTematicoBusqueda(reportesCapcerDTO.getCicloEjeTematico());
                        reportesCapcerDTO.setIdCursoBusqueda(reportesCapcerDTO.getIdCurso());
                        reportesCapcerDTO.setValidacion(true);
                        
                        model.addAttribute(reportesCapcerDTO);
                        return super.getViewName("relacionFirmas");
                    }
                } else {
                    // Opcion 2
                     if (reportesCapcerDTO.getIdCursoBusqueda() == null || reportesCapcerDTO.getIdCursoBusqueda().equals("")) {
                        //super.saveError(model, "sireh.label.spc.capcer.reportes.error.cicloEjeTematico");

                        reportesCapcerDTO.setCicloEjeTematicoBusqueda(0);
                        reportesCapcerDTO.setIdCursoBusqueda(0);
                        reportesCapcerDTO.setValidacion(false);

                        model.addAttribute(reportesCapcerDTO);
                        return super.getViewName("relacionFirmas");
                    } else if (reportesCapcerDTO.getCursoClave() == null || reportesCapcerDTO.getCursoClave().equals("")) {
                        super.saveError(model, "sireh.label.spc.capcer.reportes.error.cursoClave");

                        reportesCapcerDTO.setCicloEjeTematicoBusqueda(0);
                        reportesCapcerDTO.setIdCursoBusqueda(0);
                        reportesCapcerDTO.setValidacion(true);

                        model.addAttribute(reportesCapcerDTO);
                        return super.getViewName("relacionFirmas");
                    } else {
                        reportesCapcerDTO.setCicloEjeTematicoBusqueda(reportesCapcerDTO.getCicloEjeTematico2());

                        // Obtener id Curso
                        TnCapCursoDTO tnCapCursoDTO = super.getService(ReporteSPCService.class).getCursoByClave(reportesCapcerDTO.getCursoClave());
                        reportesCapcerDTO.setIdCursoBusqueda(tnCapCursoDTO.getIdCurso());
                        reportesCapcerDTO.setValidacion(true);

                        model.addAttribute(reportesCapcerDTO);
                        return super.getViewName("relacionFirmas");
                    }
                }
            } else {
                super.saveError(model, "sireh.label.spc.capcer.reportes.error.tipoBusqueda");

                model.addAttribute(reportesCapcerDTO);
                return super.getViewName("relacionFirmas");
            }
        } else {
            reportesCapcerDTO = new ReportesCapcerDTO();
        }
        model.addAttribute(reportesCapcerDTO);
        return super.getViewName("relacionFirmas");
    }

    /******************************************************************************************************************************************************************************/

    /**
     * Entrega de constancias
     * @author Ricardo León E.
     * @param model Model
     * @return String
     */
    @RequestMapping
    public String entregaConstancias(Model model, ReportesCapcerDTO reportesCapcerDTO) {
        if (reportesCapcerDTO.isMuestraReporte()) {
            if (reportesCapcerDTO.getTipoBusqueda() != null && !reportesCapcerDTO.getTipoBusqueda().equals("")) {
                logger.debug("ReportesCursoSPCController -> entregaConstancias -> tipoBusqueda --------->" + reportesCapcerDTO.getTipoBusqueda());

                if (reportesCapcerDTO.getTipoBusqueda().equals("CURSO")) {
                    // Opcion 1
                    if (reportesCapcerDTO.getCicloEjeTematico() == null || 
                        reportesCapcerDTO.getCicloEjeTematico() == 0) {
                        super.saveError(model, "sireh.label.spc.capcer.reportes.error.cicloEjeTematico");

                        reportesCapcerDTO.setCicloEjeTematicoBusqueda(0);
                        reportesCapcerDTO.setIdCursoBusqueda(0);
                        reportesCapcerDTO.setValidacion(true);

                        model.addAttribute(reportesCapcerDTO);
                        return super.getViewName("entregaConstancias");
                    } else if (reportesCapcerDTO.getIdCurso() == null || reportesCapcerDTO.getIdCurso() == 0) {
                        super.saveError(model, "sireh.label.spc.capcer.reportes.error.idCurso");

                        reportesCapcerDTO.setCicloEjeTematicoBusqueda(0);
                        reportesCapcerDTO.setIdCursoBusqueda(0);
                        reportesCapcerDTO.setValidacion(true);

                        model.addAttribute(reportesCapcerDTO);
                        return super.getViewName("entregaConstancias");
                    } else {
                        reportesCapcerDTO.setCicloEjeTematicoBusqueda(reportesCapcerDTO.getCicloEjeTematico());
                        reportesCapcerDTO.setIdCursoBusqueda(reportesCapcerDTO.getIdCurso());
                        reportesCapcerDTO.setValidacion(true);

                        TnCapCursoDTO tnCapCursoDTO = super.getService(ReporteSPCService.class).getById(reportesCapcerDTO.getIdCurso());
                        Integer sc = sesionesCurso(new java.sql.Date(tnCapCursoDTO.getCursoFecIni().getTime()), new java.sql.Date(tnCapCursoDTO.getCursoFecFin().getTime()));
                        reportesCapcerDTO.setSesionesCurso(sc);

                        model.addAttribute(reportesCapcerDTO);
                        return super.getViewName("entregaConstancias");
                    }
                } else {
                    // Opcion 2
                    if (reportesCapcerDTO.getCursoClave() == null || reportesCapcerDTO.getCursoClave().equals("")) {
                        super.saveError(model, "sireh.label.spc.capcer.reportes.error.cursoClave");

                        reportesCapcerDTO.setCicloEjeTematicoBusqueda(0);
                        reportesCapcerDTO.setIdCursoBusqueda(0);
                        reportesCapcerDTO.setValidacion(true);

                        model.addAttribute(reportesCapcerDTO);
                        return super.getViewName("entregaConstancias");
                    } else {

                        // Obtener id Curso
                        TnCapCursoDTO tnCapCursoDTO = super.getService(ReporteSPCService.class).getCursoByClave(reportesCapcerDTO.getCursoClave());

                        if (tnCapCursoDTO == null) {
                            super.saveError(model, "Error: Proporcione una clave de curso valida");

                            reportesCapcerDTO.setCicloEjeTematicoBusqueda(0);
                            reportesCapcerDTO.setIdCursoBusqueda(0);
                            reportesCapcerDTO.setValidacion(true);

                            model.addAttribute(reportesCapcerDTO);
                            return super.getViewName("entregaConstancias");
                        } else {
                            logger.debug("ReportesCursoSPCController -> entregaConstancias -> idCurso --------->" + tnCapCursoDTO.getIdCurso());
                            reportesCapcerDTO.setIdCursoBusqueda(tnCapCursoDTO.getIdCurso());
                            reportesCapcerDTO.setCicloEjeTematicoBusqueda(tnCapCursoDTO.getCicloEjeTematico());
                            reportesCapcerDTO.setValidacion(true);

                            model.addAttribute(reportesCapcerDTO);
                            return super.getViewName("entregaConstancias");
                        }
                    }
                }
            } else {
                // No selecciono tipo de busqueda
                super.saveError(model, "sireh.label.spc.capcer.reportes.error.tipoBusqueda");

                model.addAttribute(reportesCapcerDTO);
                return super.getViewName("entregaConstancias");
            }
        } else {
            // Cancelar
            reportesCapcerDTO = new ReportesCapcerDTO();

            // Obtener roles
            reportesCapcerDTO = getRol(reportesCapcerDTO);
        }

        model.addAttribute(reportesCapcerDTO);
        return super.getViewName("entregaConstancias");
     }

    /******************************************************************************************************************************************************************************/

    /**
     * Verificación del Servicio
     * @author Ricardo León E.
     * @param model Model
     * @param reportesCapcerDTO ReportesCapcerDTO
     * @return String
     */
    @RequestMapping
    public String verificacionServicio(Model model, ReportesCapcerDTO reportesCapcerDTO) {
        // Obtener roles
        List roles = super.security().getRoles();
        for (Object rol: roles) {
            logger.debug("navegacionRegistroCurso -> Roles ---------->" + (String)rol);
        }

        if (reportesCapcerDTO.isMuestraReporte()) {

            if (reportesCapcerDTO.getCicloEjeTematico() == null || reportesCapcerDTO.getCicloEjeTematico() == 0) {
                super.saveError(model, "sireh.label.spc.capcer.reportes.error.cicloEjeTematico");

                reportesCapcerDTO.setCicloEjeTematicoBusqueda(0);
                reportesCapcerDTO.setIdCursoBusqueda(0);
                reportesCapcerDTO.setValidacion(true);

                model.addAttribute(reportesCapcerDTO);
                return super.getViewName("verificacionServicio");
            } else {
                reportesCapcerDTO.setCicloEjeTematicoBusqueda(reportesCapcerDTO.getCicloEjeTematico());
                reportesCapcerDTO.setIdCursoBusqueda(reportesCapcerDTO.getIdCurso());
                reportesCapcerDTO.setValidacion(true);

                if (reportesCapcerDTO.getTrimestre() == 0) { // ENE-DIC
                    reportesCapcerDTO.setFechaIni("01/01/" + reportesCapcerDTO.getCicloEjeTematico());
                    reportesCapcerDTO.setFechaFin("01/01/" + (reportesCapcerDTO.getCicloEjeTematico() + 1));
                } else if (reportesCapcerDTO.getTrimestre() == 1) { //ENE-MAR
                    reportesCapcerDTO.setFechaIni("01/01/" + reportesCapcerDTO.getCicloEjeTematico());
                    reportesCapcerDTO.setFechaFin("01/04/" + reportesCapcerDTO.getCicloEjeTematico());
                } else if (reportesCapcerDTO.getTrimestre() == 2) { // ABR-JUN
                    reportesCapcerDTO.setFechaIni("01/04/" + reportesCapcerDTO.getCicloEjeTematico());
                    reportesCapcerDTO.setFechaFin("01/07/" + reportesCapcerDTO.getCicloEjeTematico());
                } else if (reportesCapcerDTO.getTrimestre() == 3) { // JUL-SEP
                    reportesCapcerDTO.setFechaIni("01/07/" + reportesCapcerDTO.getCicloEjeTematico());
                    reportesCapcerDTO.setFechaFin("01/10/" + reportesCapcerDTO.getCicloEjeTematico());
                } else if (reportesCapcerDTO.getTrimestre() == 4) { // OCT-DIC
                    reportesCapcerDTO.setFechaIni("01/10/" + reportesCapcerDTO.getCicloEjeTematico());
                    reportesCapcerDTO.setFechaFin("01/01/" + reportesCapcerDTO.getCicloEjeTematico() + 1);
                }
                reportesCapcerDTO.getFechaIni();
                reportesCapcerDTO.getFechaFin();

                model.addAttribute(reportesCapcerDTO);
                return super.getViewName("verificacionServicio");
            }
        } else {
            reportesCapcerDTO = new ReportesCapcerDTO();
        }

        // Rol Administrador de Capacitacion
        if (super.security().isUserAuthorized(SECURITY_ROL_ADM)) {
            reportesCapcerDTO.setRolAdministradorCapacitacion(true);
        } else {
            reportesCapcerDTO.setRolAdministradorCapacitacion(false);
        }

        // Rol Operador de Capacitacion
        if (super.security().isUserAuthorized(SECURITY_ROL_OPER)) {
            reportesCapcerDTO.setRolOperadorCapacitacion(true);
        } else {
            reportesCapcerDTO.setRolOperadorCapacitacion(false);
        }

        model.addAttribute(reportesCapcerDTO);
        return super.getViewName("verificacionServicio");
    }

    /**
     * Verificación del Servicio
     * @author Ricardo León E.
     * @param model Model
     * @param reportesCapcerDTO ReportesCapcerDTO
     * @return String
     */
    @RequestMapping
    public String movtosSpc(Model model, ReportesCapcerDTO reportesCapcerDTO) {
        // Obtener roles
        List roles = super.security().getRoles();
        for (Object rol: roles) {
            logger.debug("navegacionRegistroCurso -> Roles ---------->" + (String)rol);
        }

        if (reportesCapcerDTO.isMuestraReporte()) {

            if (reportesCapcerDTO.getQuincena() == null || reportesCapcerDTO.getQuincena() == "") {
                // super.saveError(model, "sireh.label.spc.capcer.reportes.error.qna");
                reportesCapcerDTO.setQuincena("");
                model.addAttribute(reportesCapcerDTO);
                return super.getViewName("movtosSpc");
            } else {
                reportesCapcerDTO.setQuincena(reportesCapcerDTO.getQuincena());            
                reportesCapcerDTO.setTipo(reportesCapcerDTO.getTipo());            
                // reportesCapcerDTO.getQuincena();
                // reportesCapcerDTO.setValidacion(true);

                model.addAttribute(reportesCapcerDTO);
                return super.getViewName("movtosSpc");
            }
        } else {
            reportesCapcerDTO = new ReportesCapcerDTO();
        }

        // Rol Administrador de Capacitacion
        if (super.security().isUserAuthorized(SECURITY_ROL_ADM)) {
            reportesCapcerDTO.setRolAdministradorCapacitacion(true);
        } else {
            reportesCapcerDTO.setRolAdministradorCapacitacion(false);
        }

        // Rol Operador de Capacitacion
        if (super.security().isUserAuthorized(SECURITY_ROL_OPER)) {
            reportesCapcerDTO.setRolOperadorCapacitacion(true);
        } else {
            reportesCapcerDTO.setRolOperadorCapacitacion(false);
        }
        // reportesCapcerDTO.setQuincena(reportesCapcerDTO.getQuincena());            

        model.addAttribute(reportesCapcerDTO);
        return super.getViewName("movtosSpc");
    }
}
