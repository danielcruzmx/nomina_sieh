package gob.shcp.sireh.control.nomina.reporte;

import gob.shcp.fsn.control.AbstractController;
import gob.shcp.fsn.control.support.AnnotatedController;


import gob.shcp.sireh.model.nomina.reportes.AltasBajasSFPDTO;
import gob.shcp.sireh.model.nomina.reportes.CustomAltasBajasSFPDTO;
import gob.shcp.sireh.model.nomina.reportes.ReportesConstanciasDTO;
import gob.shcp.sireh.model.nomina.reportes.ReportesMovtoNominaDTO;

import gob.shcp.sireh.model.plaza.gestion.ConsultaGeneralDTO;

import gob.shcp.sireh.service.nomina.movimientos.MovimientoNominaService;


import gob.shcp.sireh.service.nomina.reportes.MovimientosNominaService;

import java.io.IOException;
import java.io.OutputStream;

import java.text.SimpleDateFormat;

import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ReporteMoviminentosController extends AbstractController implements AnnotatedController {

    @RequestMapping
    public String situacionPlazas(Model model, ReportesMovtoNominaDTO reportesMovtoNominaDTO) {
        if (reportesMovtoNominaDTO.isCancel()) {
            reportesMovtoNominaDTO = new ReportesMovtoNominaDTO();
        }

        reportesMovtoNominaDTO.setIdPlaza(reportesMovtoNominaDTO.getIdPlaza() == null ? null : reportesMovtoNominaDTO.getIdPlaza());
        reportesMovtoNominaDTO.setIdPlazaRequired(Boolean.TRUE);

        model.addAttribute(reportesMovtoNominaDTO);
        return super.getViewName("situacionPlazas");
    }

    @RequestMapping
    public String situacionPlazasRFC(Model model, ReportesMovtoNominaDTO reportesMovtoNominaDTO) {
        if (reportesMovtoNominaDTO.isCancel()) {
            reportesMovtoNominaDTO = new ReportesMovtoNominaDTO();
        }

        reportesMovtoNominaDTO.setRfcEmpleado(reportesMovtoNominaDTO.getRfcEmpleado() == null ? null : reportesMovtoNominaDTO.getRfcEmpleado());
        reportesMovtoNominaDTO.setRfcRequired(Boolean.TRUE);

        model.addAttribute(reportesMovtoNominaDTO);
        return super.getViewName("situacionPlazasRFC");
    }

    @RequestMapping
    public String situacionEmpleados(Model model, ReportesMovtoNominaDTO reportesMovtoNominaDTO) {
        if (reportesMovtoNominaDTO.isCancel()) {
            reportesMovtoNominaDTO = new ReportesMovtoNominaDTO();
        }

        reportesMovtoNominaDTO.setRfcEmpleado(reportesMovtoNominaDTO.getRfcEmpleado() == null ? null : reportesMovtoNominaDTO.getRfcEmpleado());
        reportesMovtoNominaDTO.setRfcRequired(Boolean.TRUE);

        model.addAttribute(reportesMovtoNominaDTO);
        return super.getViewName("situacionEmpleados");
    }

    @RequestMapping
    public String constanciaNombramiento(Model model, ReportesMovtoNominaDTO reportesMovtoNominaDTO) {
        if (reportesMovtoNominaDTO.isCancel()) {
            reportesMovtoNominaDTO = new ReportesMovtoNominaDTO();
        }

        reportesMovtoNominaDTO.setRfcEmpleado(reportesMovtoNominaDTO.getRfcEmpleado() == null ? null : reportesMovtoNominaDTO.getRfcEmpleado());
        reportesMovtoNominaDTO.setRfcRequired(Boolean.TRUE);
        reportesMovtoNominaDTO.setMuestraReporte(false);

        model.addAttribute(reportesMovtoNominaDTO);
        return super.getViewName("constanciaNombramiento");
    }

    /**
     * Contrato Honorarios.
     * @author Oscar S.
     * @param model Model
     * @param reportesMovtoNominaDTO ReportesMovtoNominaDTO
     * @return String
     */
    @RequestMapping
    public String contratoHonorarios(Model model, ReportesMovtoNominaDTO reportesMovtoNominaDTO) {
        if (reportesMovtoNominaDTO.isCancel()) {
            reportesMovtoNominaDTO = new ReportesMovtoNominaDTO();
        }

        reportesMovtoNominaDTO.setRfcEmpleado(reportesMovtoNominaDTO.getRfcEmpleado() == null ? null : reportesMovtoNominaDTO.getRfcEmpleado());
        reportesMovtoNominaDTO.setRfcRequired(Boolean.TRUE);
        reportesMovtoNominaDTO.setMuestraReporte(false);

        model.addAttribute(reportesMovtoNominaDTO);
        return super.getViewName("contratoHonorarios");
    }

    @RequestMapping
    public String constanciaNombramientoObservaciones(Model model, @RequestParam("idMovtoEmpPla") Integer idMovtoEmpPla, @RequestParam("rfcEmpleado") String rfcEmpleado) {
        ReportesMovtoNominaDTO reportesMovtoNominaDTO = new ReportesMovtoNominaDTO();
        
        logger.debug("constanciaNombramientoObservaciones -> idMovtoEmpPla = " + idMovtoEmpPla);
        
        reportesMovtoNominaDTO.setRfcEmpleado(rfcEmpleado);
        reportesMovtoNominaDTO.setIdMovtoEmpPla(idMovtoEmpPla);

        String observaciones = super.getService(MovimientosNominaService.class).getObservacionesDeMovimientoEmpPla(idMovtoEmpPla);
        reportesMovtoNominaDTO.setMepObserva(observaciones);
        reportesMovtoNominaDTO.setMuestraReporte(false);

        model.addAttribute(reportesMovtoNominaDTO);
        return super.getViewName("constanciaNombramiento");
    }

    @RequestMapping
    public String constanciaNombramientoReporte(Model model, ReportesMovtoNominaDTO reportesMovtoNominaDTO) {
        reportesMovtoNominaDTO.setMuestraReporte(true);

        Integer idMovtoEmpPla = reportesMovtoNominaDTO.getIdMovtoEmpPla();
        logger.debug("constanciaNombramientoReporte -> idMovtoEmpPla = " + idMovtoEmpPla);
        
        String observaciones = reportesMovtoNominaDTO.getMepObserva();
        
        if (observaciones != null && observaciones.trim().length() > 0) {
            super.getService(MovimientosNominaService.class).updateObservacionesDeMovimientoEmpPla(idMovtoEmpPla, observaciones);
        }

        model.addAttribute(reportesMovtoNominaDTO);
        return super.getViewName("constanciaNombramiento");
    }

    @RequestMapping
    public String datosPersonales(Model model, ReportesMovtoNominaDTO reportesMovtoNominaDTO) {
        if (reportesMovtoNominaDTO.isCancel()) {
            reportesMovtoNominaDTO = new ReportesMovtoNominaDTO();
        }
        
        reportesMovtoNominaDTO.setRfcEmpleado(reportesMovtoNominaDTO.getRfcEmpleado() == null ? null : reportesMovtoNominaDTO.getRfcEmpleado());

        // Validaciones
        reportesMovtoNominaDTO.setRfcRequired(Boolean.TRUE);

        model.addAttribute(reportesMovtoNominaDTO);
        return super.getViewName("datosPersonales");
    }

    @RequestMapping
    public String datosPersonalesdos(Model model, ReportesMovtoNominaDTO reportesMovtoNominaDTO) {
        if (reportesMovtoNominaDTO.isCancel()) {
            reportesMovtoNominaDTO = new ReportesMovtoNominaDTO();
        }

        reportesMovtoNominaDTO.setUniCiclo(reportesMovtoNominaDTO.getUniCiclo() == null ? "0" : reportesMovtoNominaDTO.getUniCiclo());
        reportesMovtoNominaDTO.setRfcEmpleado(reportesMovtoNominaDTO.getRfcEmpleado() == null ? null : reportesMovtoNominaDTO.getRfcEmpleado());

        // Validaciones
        reportesMovtoNominaDTO.setUniCicloRequired(Boolean.TRUE);
        reportesMovtoNominaDTO.setRfcRequired(Boolean.TRUE);

        model.addAttribute(reportesMovtoNominaDTO);
        return super.getViewName("datosPersonalesdos");
    }

    @RequestMapping
    public String plantillaPersonal(Model model, ReportesMovtoNominaDTO reportesMovtoNominaDTO) {
        if (reportesMovtoNominaDTO.isCancel()) {
            reportesMovtoNominaDTO = new ReportesMovtoNominaDTO();
        }
        
        reportesMovtoNominaDTO.setSituacionPlaza(reportesMovtoNominaDTO.getSituacionPlaza() == null ? "0" : reportesMovtoNominaDTO.getSituacionPlaza());
        
        if (reportesMovtoNominaDTO.getSituacionPlaza().equals("0")) {
            reportesMovtoNominaDTO.setSituacionPlaza(null);
        }
        
        if (reportesMovtoNominaDTO.getIdUnidad() != null) {
            if (reportesMovtoNominaDTO.getIdUnidad().equals("0")) {
                List<String> dimensiones = super.security().getDimensionPrimaryLevel("SIREHUNIDAD");
                StringBuffer sb = new StringBuffer();
                for (String dim: dimensiones) {
                    sb.append("'").append(dim).append("',");
                }
                if (sb.length() > 0) {
                    sb.delete(sb.length() - 1, sb.length());
                }
                reportesMovtoNominaDTO.setUnidades(sb.toString());
            } else {
                reportesMovtoNominaDTO.setUnidades("'" + reportesMovtoNominaDTO.getIdUnidad() + "'");
            }
        }
        
        // Validaciones
        model.addAttribute(reportesMovtoNominaDTO);
        return super.getViewName("plantillaPersonal");
    }

    @RequestMapping
    public String plantillaPersonalx(Model model, ReportesMovtoNominaDTO reportesMovtoNominaDTO) {
        if (reportesMovtoNominaDTO.isCancel()) {
            reportesMovtoNominaDTO = new ReportesMovtoNominaDTO();
        }
        
        reportesMovtoNominaDTO.setSituacionPlaza(reportesMovtoNominaDTO.getSituacionPlaza() == null ? "0" : reportesMovtoNominaDTO.getSituacionPlaza());
        
        if (reportesMovtoNominaDTO.getSituacionPlaza().equals("0")) {
            reportesMovtoNominaDTO.setSituacionPlaza(null);
        }
        
        if (reportesMovtoNominaDTO.getIdUnidad() != null) {
            if (reportesMovtoNominaDTO.getIdUnidad().equals("0")) {
                List<String> dimensiones = super.security().getDimensionPrimaryLevel("SIREHUNIDAD");
                StringBuffer sb = new StringBuffer();
                for (String dim: dimensiones) {
                    sb.append("'").append(dim).append("',");
                }
                if (sb.length() > 0) {
                    sb.delete(sb.length() - 1, sb.length());
                }
                reportesMovtoNominaDTO.setUnidades(sb.toString());
            } else {
                reportesMovtoNominaDTO.setUnidades("'" + reportesMovtoNominaDTO.getIdUnidad() + "'");
            }
        }
        
        // Validaciones
        model.addAttribute(reportesMovtoNominaDTO);
        return super.getViewName("plantillaPersonalx");
    }

    @RequestMapping
    public String conceptosPago(Model model, ReportesMovtoNominaDTO reportesMovtoNominaDTO) {
        if (reportesMovtoNominaDTO.isCancel()) {
            reportesMovtoNominaDTO = new ReportesMovtoNominaDTO();
        }

        reportesMovtoNominaDTO.setTipoCpto(reportesMovtoNominaDTO.getTipoCpto() == null ? "0" : reportesMovtoNominaDTO.getTipoCpto());
        reportesMovtoNominaDTO.setConcepto(reportesMovtoNominaDTO.getConcepto() == null ? "0" : reportesMovtoNominaDTO.getConcepto());
        reportesMovtoNominaDTO.setSituacionCaptura(reportesMovtoNominaDTO.getSituacionCaptura() == null ? null : reportesMovtoNominaDTO.getSituacionCaptura());

        if (reportesMovtoNominaDTO.getQnaIni() != null) {
            reportesMovtoNominaDTO.setQnaIniNumber(reportesMovtoNominaDTO.getQnaIni());
        } else {
            reportesMovtoNominaDTO.setQnaIniNumber("0");
        }
        if (reportesMovtoNominaDTO.getQnaFin() != null) {
            reportesMovtoNominaDTO.setQnaFinNumber(reportesMovtoNominaDTO.getQnaFin());
        } else {
            reportesMovtoNominaDTO.setQnaFinNumber("0");
        }

        if (reportesMovtoNominaDTO.getIdUnidad() != null) {
            if (reportesMovtoNominaDTO.getIdUnidad().equals("0")) {
                List<String> dimensiones = super.security().getDimensionPrimaryLevel("SIREHUNIDAD");
                StringBuffer sb = new StringBuffer();
                for (String dim: dimensiones) {
                    sb.append("'").append(dim).append("',");
                }
                if (sb.length() > 0) {
                    sb.delete(sb.length() - 1, sb.length());
                }
                reportesMovtoNominaDTO.setUnidades(sb.toString());
            } else {
                reportesMovtoNominaDTO.setUnidades("'" + reportesMovtoNominaDTO.getIdUnidad() + "'");
            }
        }

        // Validaciones        
        reportesMovtoNominaDTO.setTipoCptoRequired(Boolean.TRUE);
        reportesMovtoNominaDTO.setQnaIniRequired(Boolean.TRUE);
        reportesMovtoNominaDTO.setQnaFinRequired(Boolean.TRUE);
        reportesMovtoNominaDTO.setConceptoRequired(Boolean.TRUE);

        model.addAttribute(reportesMovtoNominaDTO);
        return super.getViewName("conceptosPago");
    }

    @RequestMapping
    public String movimientosEmpleado(Model model, ReportesMovtoNominaDTO reportesMovtoNominaDTO) {
        if (reportesMovtoNominaDTO.isCancel()) {
            reportesMovtoNominaDTO = new ReportesMovtoNominaDTO();
        }

        reportesMovtoNominaDTO.setFecInicial(reportesMovtoNominaDTO.getFecInicial() == null ? new Date() : reportesMovtoNominaDTO.getFecInicial());
        reportesMovtoNominaDTO.setFecFinal(reportesMovtoNominaDTO.getFecFinal() == null ? new Date() : reportesMovtoNominaDTO.getFecFinal());

        if (reportesMovtoNominaDTO.getIdUnidad() != null) {
            if (reportesMovtoNominaDTO.getIdUnidad().equals("0")) {
                List<String> dimensiones = super.security().getDimensionPrimaryLevel("SIREHUNIDAD");
                StringBuffer sb = new StringBuffer();
                for (String dim: dimensiones) {
                    sb.append("'").append(dim).append("',");
                }
                if (sb.length() > 0) {
                    sb.delete(sb.length() - 1, sb.length());
                }
                reportesMovtoNominaDTO.setUnidades(sb.toString());
            } else {
                reportesMovtoNominaDTO.setUnidades("'" + reportesMovtoNominaDTO.getIdUnidad() + "'");
            }
        }

        // Validaciones        
        reportesMovtoNominaDTO.setFecInicialRequired(Boolean.TRUE);
        reportesMovtoNominaDTO.setFecFinalRequired(Boolean.TRUE);

        model.addAttribute(reportesMovtoNominaDTO);
        return super.getViewName("movimientosEmpleado");
    }
    @RequestMapping
    public String movimientosEmpleadoq(Model model, ReportesMovtoNominaDTO reportesMovtoNominaDTO) {
        if (reportesMovtoNominaDTO.isCancel()) {
            reportesMovtoNominaDTO = new ReportesMovtoNominaDTO();
        }

        //reportesMovtoNominaDTO.setIdUni(reportesMovtoNominaDTO.getIdUni() == null ? "0" : reportesMovtoNominaDTO.getIdUni());
        reportesMovtoNominaDTO.setQnaRep(reportesMovtoNominaDTO.getQnaRep() == null ? "0" : reportesMovtoNominaDTO.getQnaRep());

        if (reportesMovtoNominaDTO.getIdUnidad() != null) {
            if (reportesMovtoNominaDTO.getIdUnidad().equals("0")) {
                List<String> dimensiones = super.security().getDimensionPrimaryLevel("SIREHUNIDAD");
                StringBuffer sb = new StringBuffer();
                for (String dim: dimensiones) {
                    sb.append("'").append(dim).append("',");
                }
                if (sb.length() > 0) {
                    sb.delete(sb.length() - 1, sb.length());
                }
                reportesMovtoNominaDTO.setUnidades(sb.toString());
            } else {
                reportesMovtoNominaDTO.setUnidades("'" + reportesMovtoNominaDTO.getIdUnidad() + "'");
            }
        }
        
        // Validaciones        
        reportesMovtoNominaDTO.setQnaRepRequired(Boolean.TRUE);
        //reportesMovtoNominaDTO.setIdUniRequired(Boolean.TRUE);

        model.addAttribute(reportesMovtoNominaDTO);
        return super.getViewName("movimientosEmpleadoq");
    }
    @RequestMapping
    public String movimientosEmpleadoqE(Model model, ReportesMovtoNominaDTO reportesMovtoNominaDTO) {
        if (reportesMovtoNominaDTO.isCancel()) {
            reportesMovtoNominaDTO = new ReportesMovtoNominaDTO();
        }

        //reportesMovtoNominaDTO.setIdUni(reportesMovtoNominaDTO.getIdUni() == null ? "0" : reportesMovtoNominaDTO.getIdUni());
        reportesMovtoNominaDTO.setQnaRep(reportesMovtoNominaDTO.getQnaRep() == null ? "0" : reportesMovtoNominaDTO.getQnaRep());

        if (reportesMovtoNominaDTO.getIdUnidad() != null) {
            if (reportesMovtoNominaDTO.getIdUnidad().equals("0")) {
                List<String> dimensiones = super.security().getDimensionPrimaryLevel("SIREHUNIDAD");
                StringBuffer sb = new StringBuffer();
                for (String dim: dimensiones) {
                    sb.append("'").append(dim).append("',");
                }
                if (sb.length() > 0) {
                    sb.delete(sb.length() - 1, sb.length());
                }
                reportesMovtoNominaDTO.setUnidades(sb.toString());
            } else {
                reportesMovtoNominaDTO.setUnidades("'" + reportesMovtoNominaDTO.getIdUnidad() + "'");
            }
        }
        
        // Validaciones        
        reportesMovtoNominaDTO.setQnaRepRequired(Boolean.TRUE);
        //reportesMovtoNominaDTO.setIdUniRequired(Boolean.TRUE);

        model.addAttribute(reportesMovtoNominaDTO);
        return super.getViewName("movimientosEmpleadoqE");
    }
    
    @RequestMapping
    public String primaVacacional(Model model, ReportesMovtoNominaDTO reportesMovtoNominaDTO) {
        if (reportesMovtoNominaDTO.isCancel()) {
            reportesMovtoNominaDTO = new ReportesMovtoNominaDTO();
        }

        reportesMovtoNominaDTO.setUniCiclo(reportesMovtoNominaDTO.getUniCiclo() == null ? "0" : reportesMovtoNominaDTO.getUniCiclo());
        reportesMovtoNominaDTO.setMesQna(reportesMovtoNominaDTO.getMesQna() == null ? "0" : reportesMovtoNominaDTO.getMesQna());

        if (reportesMovtoNominaDTO.getMesQna().equals("Mayo")) {
            reportesMovtoNominaDTO.setSemestre("1er. Semestre");
        } else {
            reportesMovtoNominaDTO.setSemestre("2do. Semestre");
        }

        List<String> dimensiones = super.security().getDimensionPrimaryLevel("SIREHUNIDAD");
        StringBuffer sb = new StringBuffer();
        for (String dim: dimensiones) {
            sb.append("'").append(dim).append("',");
        }
        if (sb.length() > 0) {
            sb.delete(sb.length() - 1, sb.length());
        }
        reportesMovtoNominaDTO.setUnidades(sb.toString());
        
        // Validaciones        
        reportesMovtoNominaDTO.setUniCicloRequired(Boolean.TRUE);
        reportesMovtoNominaDTO.setMesQnaRequired(Boolean.TRUE);

        model.addAttribute(reportesMovtoNominaDTO);
        return super.getViewName("primaVacacional");
    }

    @RequestMapping
    public String primaVacacionalNoCon(Model model, ReportesMovtoNominaDTO reportesMovtoNominaDTO) {
        if (reportesMovtoNominaDTO.isCancel()) {
            reportesMovtoNominaDTO = new ReportesMovtoNominaDTO();
        }

        reportesMovtoNominaDTO.setUniCiclo(reportesMovtoNominaDTO.getUniCiclo() == null ? "0" : reportesMovtoNominaDTO.getUniCiclo());
        reportesMovtoNominaDTO.setMesQna(reportesMovtoNominaDTO.getMesQna() == null ? "0" : reportesMovtoNominaDTO.getMesQna());

        if (reportesMovtoNominaDTO.getMesQna().equals("Mayo")) {
            reportesMovtoNominaDTO.setSemestre("1er. Semestre");
        } else {
            reportesMovtoNominaDTO.setSemestre("2do. Semestre");
        }

        List<String> dimensiones = super.security().getDimensionPrimaryLevel("SIREHUNIDAD");
        StringBuffer sb = new StringBuffer();
        for (String dim: dimensiones) {
            sb.append("'").append(dim).append("',");
        }
        if (sb.length() > 0) {
            sb.delete(sb.length() - 1, sb.length());
        }
        reportesMovtoNominaDTO.setUnidades(sb.toString());
        
        // Validaciones        
        reportesMovtoNominaDTO.setUniCicloRequired(Boolean.TRUE);
        reportesMovtoNominaDTO.setMesQnaRequired(Boolean.TRUE);

        model.addAttribute(reportesMovtoNominaDTO);
        return super.getViewName("primaVacacionalNoCon");
    }

    @RequestMapping
    public String diasLaborados(Model model, ReportesMovtoNominaDTO reportesMovtoNominaDTO) {
        if (reportesMovtoNominaDTO.isCancel()) {
            reportesMovtoNominaDTO = new ReportesMovtoNominaDTO();
        } 
        
        // Validaciones
        reportesMovtoNominaDTO.setUniCicloRequired(Boolean.TRUE);
        reportesMovtoNominaDTO.setRfcRequired(Boolean.TRUE);
        
        model.addAttribute(reportesMovtoNominaDTO);
        return super.getViewName("diasLaborados");
    }

    @RequestMapping
    public String diasEconomicos(Model model, ReportesMovtoNominaDTO reportesMovtoNominaDTO) {
        if (reportesMovtoNominaDTO.isCancel()) {
            reportesMovtoNominaDTO = new ReportesMovtoNominaDTO();
        } 
        // Validaciones
        reportesMovtoNominaDTO.setUniCicloRequired(Boolean.TRUE);
        reportesMovtoNominaDTO.setRfcRequired(Boolean.TRUE);
        
        model.addAttribute(reportesMovtoNominaDTO);
        return super.getViewName("diasEconomicos");
    }

    @RequestMapping
    public String beneficiarios(Model model, ReportesMovtoNominaDTO reportesMovtoNominaDTO) {
        if (reportesMovtoNominaDTO.isCancel()) {
            reportesMovtoNominaDTO = new ReportesMovtoNominaDTO();
        } 
        
        // Validaciones    
        reportesMovtoNominaDTO.setUniCicloRequired(Boolean.TRUE);
        reportesMovtoNominaDTO.setRfcRequired(Boolean.TRUE);
        
        model.addAttribute(reportesMovtoNominaDTO);
        return super.getViewName("beneficiarios");
    }

    @RequestMapping
    public String pensionAlimenticia(Model model, ReportesMovtoNominaDTO reportesMovtoNominaDTO) {
        if (reportesMovtoNominaDTO.isCancel()) {
            reportesMovtoNominaDTO = new ReportesMovtoNominaDTO();
        }

        if (reportesMovtoNominaDTO.getIdUnidad() != null) {
            if (reportesMovtoNominaDTO.getIdUnidad().equals("0")) {
                List<String> dimensiones = super.security().getDimensionPrimaryLevel("SIREHUNIDAD");
                StringBuffer sb = new StringBuffer();
                for (String dim: dimensiones) {
                    sb.append("'").append(dim).append("',");
                }
                if (sb.length() > 0) {
                    sb.delete(sb.length() - 1, sb.length());
                }
                reportesMovtoNominaDTO.setUnidades(sb.toString());
            } else {
                reportesMovtoNominaDTO.setUnidades("'" + reportesMovtoNominaDTO.getIdUnidad() + "'");
            }
        }

        // Validaciones
        model.addAttribute(reportesMovtoNominaDTO);
        return super.getViewName("pensionAlimenticia");
    }

    @RequestMapping
    public String terminosContrato(Model model, ReportesMovtoNominaDTO reportesMovtoNominaDTO) {
        if (reportesMovtoNominaDTO.isCancel()) {
            reportesMovtoNominaDTO = new ReportesMovtoNominaDTO();
        }

        reportesMovtoNominaDTO.setQnaCaptura(reportesMovtoNominaDTO.getQnaCaptura() == null ? "0" : reportesMovtoNominaDTO.getQnaCaptura());

        if (reportesMovtoNominaDTO.getIdUnidad() != null) {
            if (reportesMovtoNominaDTO.getIdUnidad().equals("0")) {
                List<String> dimensiones = super.security().getDimensionPrimaryLevel("SIREHUNIDAD");
                StringBuffer sb = new StringBuffer();
                for (String dim: dimensiones) {
                    sb.append("'").append(dim).append("',");
                }
                if (sb.length() > 0) {
                    sb.delete(sb.length() - 1, sb.length());
                }
                reportesMovtoNominaDTO.setUnidades(sb.toString());
            } else {
                reportesMovtoNominaDTO.setUnidades("'" + reportesMovtoNominaDTO.getIdUnidad() + "'");
            }
        }

        // Validaciones
        reportesMovtoNominaDTO.setQnaCapturaRequired(Boolean.TRUE);

        model.addAttribute(reportesMovtoNominaDTO);
        return super.getViewName("terminosContrato");
    }

    @RequestMapping
    public String pagosCancelados(Model model, ReportesMovtoNominaDTO reportesMovtoNominaDTO) {
        if (reportesMovtoNominaDTO.isCancel()) {
            reportesMovtoNominaDTO = new ReportesMovtoNominaDTO();
        }

        if (reportesMovtoNominaDTO.getIdUnidad() != null) {
            if (reportesMovtoNominaDTO.getIdUnidad().equals("0")) {
                List<String> dimensiones = super.security().getDimensionPrimaryLevel("SIREHUNIDAD");
                StringBuffer sb = new StringBuffer();
                for (String dim: dimensiones) {
                    sb.append("'").append(dim).append("',");
                }
                if (sb.length() > 0) {
                    sb.delete(sb.length() - 1, sb.length());
                }
                reportesMovtoNominaDTO.setUnidades(sb.toString());
            } else {
                reportesMovtoNominaDTO.setUnidades("'" + reportesMovtoNominaDTO.getIdUnidad() + "'");
            }
        }

        reportesMovtoNominaDTO.setMesQna(reportesMovtoNominaDTO.getMesQna() == null ? "0" : reportesMovtoNominaDTO.getMesQna());
        reportesMovtoNominaDTO.setTipoNomina(reportesMovtoNominaDTO.getTipoNomina() == null ? "0" : reportesMovtoNominaDTO.getTipoNomina());
        reportesMovtoNominaDTO.setComplemento(reportesMovtoNominaDTO.getComplemento() == null ? null : reportesMovtoNominaDTO.getComplemento());

        // Validaciones        
        reportesMovtoNominaDTO.setMesQnaRequired(Boolean.TRUE);
        reportesMovtoNominaDTO.setTipoNominaRequired(Boolean.TRUE);

        model.addAttribute(reportesMovtoNominaDTO);
        return super.getViewName("pagosCancelados");
    }

    @RequestMapping
    public String plantillaVigente(Model model, ConsultaGeneralDTO consultaGeneralDTO, HttpServletResponse response) throws IOException{
        List<String> datos = null;
        if (consultaGeneralDTO.isCancel()) {   consultaGeneralDTO = new ConsultaGeneralDTO();   }
        if(consultaGeneralDTO.getIdGrupoPago() != null){
            if (consultaGeneralDTO.getIdGrupoPago() != null) {
                if(consultaGeneralDTO.getIdGrupoPago().equalsIgnoreCase("0")){
                    String jerarquias = "'E','V','H','S','J'";
                    datos = super.getService(MovimientoNominaService.class).plantillaVigente(jerarquias);
                    
                    if (datos.isEmpty()) {
                        super.saveWarning(model, "warn.empty.chkolist");
                        return super.getViewName("plantillaVigente");
                    } else {
                    
                            StringBuilder strCsv = new StringBuilder();
                            for (String renglon: datos) {
                                strCsv.append(renglon).append("\r\n");
                                 }
        
                                consultaGeneralDTO.setMuestraRegistros(false);
                                byte[] bytes = strCsv.toString().getBytes();
                                response.setContentType("text/csv");
                                response.setContentLength(bytes.length);
                                response.setHeader("Content-Disposition", "attachment; filename=\"" + "movimientos_" + "plantilla.csv");
                                OutputStream out = response.getOutputStream();
                                out.write(bytes, 0, bytes.length);
                                return null;
                       }
                } else {   datos = super.getService(MovimientoNominaService.class).plantillaVigente("'"+consultaGeneralDTO.getIdGrupoPago()+"'");   
                        if (datos.isEmpty()) { super.saveWarning(model, "warn.empty.chkolist"); return super.getViewName("plantillaVigente"); } 
                        else {
                                StringBuilder strCsv = new StringBuilder();
                                for (String renglon: datos) { strCsv.append(renglon).append("\r\n"); }
                                consultaGeneralDTO.setMuestraRegistros(false);
                                byte[] bytes = strCsv.toString().getBytes();
                                response.setContentType("text/csv");
                                response.setContentLength(bytes.length);
                                response.setHeader("Content-Disposition", "attachment; filename=\"" + "movimientos_" + "plantilla.csv");
                                OutputStream out = response.getOutputStream();
                                out.write(bytes, 0, bytes.length);
                                return null;
                            }

                        }
           }
        }
        model.addAttribute(consultaGeneralDTO);
        return super.getViewName("plantillaVigente");
     
    }
    
    @RequestMapping
    public String movimientosABC(Model model, ReportesMovtoNominaDTO reportesMovtoNominaDTO, HttpServletResponse response) throws IOException{
        List<String> datos = null;
        if (reportesMovtoNominaDTO.isCancel()) {   reportesMovtoNominaDTO = new ReportesMovtoNominaDTO();   }

        if ((reportesMovtoNominaDTO.getIdUnidad() != null) && (reportesMovtoNominaDTO.getQnaIni() != null) && 
            (reportesMovtoNominaDTO.getQnaFin() != null) && (reportesMovtoNominaDTO.getTipoEntero() != null)) {
            
            if (reportesMovtoNominaDTO.getIdUnidad().equals("0")) {
                List<String> dimensiones = super.security().getDimensionPrimaryLevel("SIREHUNIDAD");
                StringBuffer sb = new StringBuffer();
                for (String dim: dimensiones) {
                    sb.append("'").append(dim).append("',");
                }
                if (sb.length() > 0) {
                    sb.delete(sb.length() - 1, sb.length());
                }
                reportesMovtoNominaDTO.setUnidades(sb.toString());
            } else { reportesMovtoNominaDTO.setUnidades("'" + reportesMovtoNominaDTO.getIdUnidad() + "'");  }
            
            if (reportesMovtoNominaDTO.getQnaIni().equalsIgnoreCase("0")) {
                 super.saveError(model, "error.reportes.movimientosNomina.movimientosABC.qi");
                 return super.getViewName("movimientosABC");
             }
             
             if (reportesMovtoNominaDTO.getQnaFin().equalsIgnoreCase("0")) {
                 super.saveError(model, "error.reportes.movimientosNomina.movimientosABC.qf");
                 return super.getViewName("movimientosABC");
             } 

             if (reportesMovtoNominaDTO.getTipoEntero().equalsIgnoreCase("0")){
                 super.saveError(model, "error.reportes.movimientosNomina.movimientosABC.ta");
                 return super.getViewName("movimientosABC");
             }
             
            if (reportesMovtoNominaDTO.getTipoEntero().equalsIgnoreCase("a")){
                datos = super.getService(MovimientoNominaService.class).movimientosA(reportesMovtoNominaDTO);
                if (datos.isEmpty()) { super.saveWarning(model, "warn.empty.chkolist"); return super.getViewName("movimientosABC"); } 
                else {
                        StringBuilder strCsv = new StringBuilder();
                        for (String renglon: datos) { strCsv.append(renglon).append("\r\n"); }
                        byte[] bytes = strCsv.toString().getBytes();
                        response.setContentType("text/csv");
                        response.setContentLength(bytes.length);
                        response.setHeader("Content-Disposition", "attachment; filename=\"" + "movimientosABC_" + "altas.csv");
                        OutputStream out = response.getOutputStream();
                        out.write(bytes, 0, bytes.length);
                        return null;
                    }
            }
            else if (reportesMovtoNominaDTO.getTipoEntero().equalsIgnoreCase("b")){
                datos = super.getService(MovimientoNominaService.class).movimientosB(reportesMovtoNominaDTO);
                if (datos.isEmpty()) { super.saveWarning(model, "warn.empty.chkolist"); return super.getViewName("movimientosABC"); } 
                else {
                        StringBuilder strCsv = new StringBuilder();
                        for (String renglon: datos) { strCsv.append(renglon).append("\r\n"); }
                        byte[] bytes = strCsv.toString().getBytes();
                        response.setContentType("text/csv");
                        response.setContentLength(bytes.length);
                        response.setHeader("Content-Disposition", "attachment; filename=\"" + "movimientosABC_" + "bajas.csv");
                        OutputStream out = response.getOutputStream();
                        out.write(bytes, 0, bytes.length);
                        return null;
                      }
            }
            else if (reportesMovtoNominaDTO.getTipoEntero().equalsIgnoreCase("m")){
                datos = super.getService(MovimientoNominaService.class).movimientosM(reportesMovtoNominaDTO);
                if (datos.isEmpty()) { super.saveWarning(model, "warn.empty.chkolist"); return super.getViewName("movimientosABC"); } 
                else {
                        StringBuilder strCsv = new StringBuilder();
                        for (String renglon: datos) { strCsv.append(renglon).append("\r\n"); }
                        byte[] bytes = strCsv.toString().getBytes();
                        response.setContentType("text/csv");
                        response.setContentLength(bytes.length);
                        response.setHeader("Content-Disposition", "attachment; filename=\"" + "movimientosABC_" + "movimientos.csv");
                        OutputStream out = response.getOutputStream();
                        out.write(bytes, 0, bytes.length);
                        return null;
                      }
            }            

        }

        model.addAttribute(reportesMovtoNominaDTO);
        return super.getViewName("movimientosABC");
    }
    @RequestMapping
    public String credencializacion(Model model, ReportesConstanciasDTO reportesConstanciasDTO, HttpServletResponse response) throws IOException{
        List<String> datos = null;
        String delimits=",";
        String rfcs=null;
        if (reportesConstanciasDTO.isCancel()) {   reportesConstanciasDTO = new ReportesConstanciasDTO();   }
        if ((reportesConstanciasDTO.getQnaIni()!= null) && (reportesConstanciasDTO.getRfcEmpleado()!= null)){
            if (reportesConstanciasDTO.getOrigen()==null) {
                super.saveError(model,"Seleccione el origen de datos...");
                return super.getViewName("credencializacion");
            }
            else{
        
                if (reportesConstanciasDTO.getOrigen().equalsIgnoreCase("r")){
                    if (reportesConstanciasDTO.getRfcEmpleado().equalsIgnoreCase("")){

                        super.saveError(model,"Seleccione un RFC...");
                        return super.getViewName("credencializacion");
                    }
                    else {
                        String [] registros=null;
                        rfcs=reportesConstanciasDTO.getRfcEmpleado()+",";
                        registros=rfcs.split(delimits);
                        String salRfc= "";
                        for (String rfcT:registros){
                                if (rfcT != null) {
                                    if (salRfc != null); {
                                        salRfc = salRfc + "'" + rfcT + "',";
                                    }
                                }
                        }
                        salRfc=salRfc.substring(0,salRfc.length()-1);
                        
                        reportesConstanciasDTO.setRfcEmpleado(salRfc);
                        
                        datos = super.getService(MovimientoNominaService.class).credencializacionR(reportesConstanciasDTO);

                        if (datos.isEmpty()) { super.saveWarning(model, "warn.empty.chkolist"); return super.getViewName("credencializacion"); } 
                        else {
                                StringBuilder strCsv = new StringBuilder();
                                for (String renglon: datos) { strCsv.append(renglon).append("\r\n"); }
                                byte[] bytes = strCsv.toString().getBytes();
                                response.setContentType("text/csv");
                                response.setContentLength(bytes.length);
                                response.setHeader("Content-Disposition", "attachment; filename=\"" + "archivorfc_"+"_paracredenciales.csv");
                                OutputStream out = response.getOutputStream();
                                out.write(bytes, 0, bytes.length);
                                return null;
                              } 
                        
                    }
                }
                else if (reportesConstanciasDTO.getOrigen().equalsIgnoreCase("m")){
                    if (reportesConstanciasDTO.getQnaIni().equalsIgnoreCase("0")){
                    
                        super.saveError(model,"Seleccione un Quincena...");
                        return super.getViewName("credencializacion");
                     }
                    else{
                        datos = super.getService(MovimientoNominaService.class).credencializacionM(reportesConstanciasDTO);
                        if (datos.isEmpty()) { super.saveWarning(model, "warn.empty.chkolist"); return super.getViewName("credencializacion"); } 
                        else {
                                StringBuilder strCsv = new StringBuilder();
                                for (String renglon: datos) { strCsv.append(renglon).append("\r\n"); }
                                byte[] bytes = strCsv.toString().getBytes();
                                response.setContentType("text/csv");
                                response.setContentLength(bytes.length);
                                response.setHeader("Content-Disposition", "attachment; filename=\"" + "archivoQna_" +reportesConstanciasDTO.getQnaIni() +"_paracredenciales.csv");
                                OutputStream out = response.getOutputStream();
                                out.write(bytes, 0, bytes.length);
                                return null;
                              }                         
                    }
                }

                else if (reportesConstanciasDTO.getOrigen().equalsIgnoreCase("b")){
                    if (reportesConstanciasDTO.getQnaFin().equalsIgnoreCase("0")){
                    
                        super.saveError(model,"Seleccione un Quincena...");
                        return super.getViewName("credencializacion");
                     }
                    else{
                        datos = super.getService(MovimientoNominaService.class).credencializacionB(reportesConstanciasDTO);
                        if (datos.isEmpty()) { super.saveWarning(model, "warn.empty.chkolist"); return super.getViewName("credencializacion"); } 
                        else {
                                StringBuilder strCsv = new StringBuilder();
                                for (String renglon: datos) { strCsv.append(renglon).append("\r\n"); }
                                byte[] bytes = strCsv.toString().getBytes();
                                response.setContentType("text/csv");
                                response.setContentLength(bytes.length);
                                response.setHeader("Content-Disposition", "attachment; filename=\"" + "archivobaja_" +reportesConstanciasDTO.getQnaIni() +"_paracredenciales.csv");
                                OutputStream out = response.getOutputStream();
                                out.write(bytes, 0, bytes.length);
                                return null;
                              }                         
                    }
                }

            }
        }
        model.addAttribute(reportesConstanciasDTO);
        return super.getViewName("credencializacion");

    }
    
    @RequestMapping
    public String pagosCanceladosA(Model model, ReportesConstanciasDTO reportesConstanciasDTO) {
        if (reportesConstanciasDTO.isCancel()) {reportesConstanciasDTO = new ReportesConstanciasDTO(); }
        
        if ( (reportesConstanciasDTO.getQnaIni()!= null) && (reportesConstanciasDTO.getQnaFin() != null) ){
            if (reportesConstanciasDTO.getQnaIni().equalsIgnoreCase("0")) {
            
                 super.saveError(model, "error.reportes.movimientosNomina.pagosCanceladosA.qi");
                 return super.getViewName("pagosCanceladosA");
             }
             if (reportesConstanciasDTO.getQnaFin().equalsIgnoreCase("0")) {
                 super.saveError(model, "error.reportes.movimientosNomina.pagosCanceladosA.qf");
                 return super.getViewName("pagosCanceladosA");
             }
        }
        model.addAttribute(reportesConstanciasDTO);
        return super.getViewName("pagosCanceladosA");
    }

    @RequestMapping
    public String altasbajasSFP(Model model, AltasBajasSFPDTO altasBajasSFPDTO) {
        if (altasBajasSFPDTO.isCancel()) {
            altasBajasSFPDTO = new AltasBajasSFPDTO();
        }
        
        model.addAttribute(altasBajasSFPDTO);
        return super.getViewName("altasbajasSFP");
    }

    @RequestMapping
    public String listaaltasbajasSFP(Model model, AltasBajasSFPDTO altasBajasSFPDTO, HttpServletResponse response) throws IOException {
        String quincena = altasBajasSFPDTO.getQnaRep();
        
        if (altasBajasSFPDTO.getQnaRep().equalsIgnoreCase("0")) {
            super.saveError(model, "El campo quincena debe especificarse ");
            return super.getViewName("altasbajasSFP");
         }

        logger.debug("Quincena -> " + quincena);

        List<CustomAltasBajasSFPDTO> customAltasBajasSFPDTOList = super.getService(MovimientosNominaService.class).getAltasBajasSFP(quincena);
        logger.debug("AltasBajasSFPController -> listaAltasBajasSFP -> customAltasBajasSFPDTOList.size() -> " +  customAltasBajasSFPDTOList.size());
        
        StringBuilder strCsv = new StringBuilder();
        
        if (customAltasBajasSFPDTOList.isEmpty()) {
            super.saveWarning(model, "warn.empty.list");
            return altasbajasSFP(model, altasBajasSFPDTO);
        }
        
        strCsv.append("QUINCENA");
        strCsv.append(",");
        strCsv.append("UNIDAD");
        strCsv.append(",");
        strCsv.append("DESCRIPCION UNIDAD");
        strCsv.append(",");
        strCsv.append("MOVTO");
        strCsv.append(",");
        strCsv.append("DESCRIPCION MOVIMIENTO");
        strCsv.append(",");
        strCsv.append("RFC");
        strCsv.append(",");
        strCsv.append("NOMBRE");
        strCsv.append(",");
        strCsv.append("CURP");
        strCsv.append(",");
        strCsv.append("PLAZA");
        strCsv.append(",");
        strCsv.append("PUESTO");
        strCsv.append(",");
        strCsv.append("NIVEL");
        strCsv.append(",");
        strCsv.append("ULTIMO MOVIMIENTO");
        strCsv.append(",");
        strCsv.append("TIPO CONTRATACION");
        strCsv.append("\r\n");        
        
        for (CustomAltasBajasSFPDTO customAltasBajasSFPDTO : customAltasBajasSFPDTOList) {
            logger.debug("customAltasBajasSFPDTO -> " + customAltasBajasSFPDTO.getMepQnaCaptura());
            strCsv.append(customAltasBajasSFPDTO.getMepQnaCaptura());
            strCsv.append(",");
            strCsv.append(customAltasBajasSFPDTO.getIdUnidadNom());
            strCsv.append(",");
            strCsv.append(customAltasBajasSFPDTO.getDescUnidad());
            strCsv.append(",");
            strCsv.append(customAltasBajasSFPDTO.getIdMovtoPersona());
            strCsv.append(",");
            strCsv.append(customAltasBajasSFPDTO.getDescMovsPersonal().replace(","," "));
            strCsv.append(",");
            strCsv.append(customAltasBajasSFPDTO.getMepRfc());
            strCsv.append(",");
            strCsv.append(customAltasBajasSFPDTO.getNombre());
            strCsv.append(",");
            strCsv.append(customAltasBajasSFPDTO.getCurpEmpleado());
            strCsv.append(",");
            strCsv.append(customAltasBajasSFPDTO.getIdPlaza());
            strCsv.append(",");
            strCsv.append(customAltasBajasSFPDTO.getIdPuestoNom());
            strCsv.append(",");
            strCsv.append(customAltasBajasSFPDTO.getIdNivelPto());
            strCsv.append(",");
            strCsv.append(new SimpleDateFormat("dd/MM/yyyy").format(customAltasBajasSFPDTO.getMepUltimoMovto()));
            strCsv.append(",");
            strCsv.append(customAltasBajasSFPDTO.getDescGrupoPago());
            strCsv.append(",");
            strCsv.append("\r\n");
        }

        byte[] bytes = strCsv.toString().getBytes();
        response.setContentType("text/plain");
        response.setContentLength(bytes.length);
        response.setHeader("Content-Disposition", "attachment; filename=\"" + "AltasBajasSFP_" + quincena + ".csv" + "\"");
        OutputStream out = response.getOutputStream();
        out.write(bytes, 0, bytes.length);
        return null;
                
    }
    
    @RequestMapping
    public String avisoCambio(Model model, ReportesMovtoNominaDTO reportesMovtoNominaDTO) {
        if (reportesMovtoNominaDTO.isCancel()) {
            reportesMovtoNominaDTO = new ReportesMovtoNominaDTO();
        }

        reportesMovtoNominaDTO.setRfcEmpleado(reportesMovtoNominaDTO.getRfcEmpleado() == null ? null : reportesMovtoNominaDTO.getRfcEmpleado());
        reportesMovtoNominaDTO.setRfcRequired(Boolean.TRUE);
        reportesMovtoNominaDTO.setMuestraReporte(false);

        model.addAttribute(reportesMovtoNominaDTO);
        return super.getViewName("avisoCambio");
    }

    @RequestMapping
    public String avisoCambioObservaciones(Model model, @RequestParam("idMovtoEmpPla") Integer idMovtoEmpPla, @RequestParam("rfcEmpleado") String rfcEmpleado) {
        ReportesMovtoNominaDTO reportesMovtoNominaDTO = new ReportesMovtoNominaDTO();
        
        logger.debug("avisoCambioObservaciones -> idMovtoEmpPla = " + idMovtoEmpPla);
        
        reportesMovtoNominaDTO.setRfcEmpleado(rfcEmpleado);
        reportesMovtoNominaDTO.setIdMovtoEmpPla(idMovtoEmpPla);

        String observaciones = super.getService(MovimientosNominaService.class).getObservacionesDeMovimientoEmpPla(idMovtoEmpPla);
        reportesMovtoNominaDTO.setMepObserva(observaciones);
        reportesMovtoNominaDTO.setMuestraReporte(false);

        model.addAttribute(reportesMovtoNominaDTO);
        return super.getViewName("avisoCambio");
    }

    @RequestMapping
    public String avisoCambioReporte(Model model, ReportesMovtoNominaDTO reportesMovtoNominaDTO) {
        reportesMovtoNominaDTO.setMuestraReporte(true);

        Integer idMovtoEmpPla = reportesMovtoNominaDTO.getIdMovtoEmpPla();
        logger.debug("avisoCambioReporte -> idMovtoEmpPla = " + idMovtoEmpPla);
        
        String observaciones = reportesMovtoNominaDTO.getMepObserva();
        
        if (observaciones != null && observaciones.trim().length() > 0) {
            super.getService(MovimientosNominaService.class).updateObservacionesDeMovimientoEmpPla(idMovtoEmpPla, observaciones);
        }

        model.addAttribute(reportesMovtoNominaDTO);
        return super.getViewName("avisoCambio");
    }

}


                
                
