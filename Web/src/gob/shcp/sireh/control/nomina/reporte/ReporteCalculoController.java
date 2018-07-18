package gob.shcp.sireh.control.nomina.reporte;

import gob.shcp.fsn.control.AbstractController;
import gob.shcp.fsn.control.support.AnnotatedController;

import gob.shcp.sireh.model.nomina.reportes.ReportesCalculoNominaDTO;

import gob.shcp.sireh.model.nomina.reportes.ReportesConstanciasDTO;
import gob.shcp.sireh.model.nomina.terceros.GeneraArchivosTercerosDTO;
import gob.shcp.sireh.service.nomina.movimientos.MovimientoNominaService;
import gob.shcp.sireh.service.nomina.reportes.ReporteCalculoService;

import java.io.IOException;

import java.io.OutputStream;

import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ReporteCalculoController extends AbstractController implements AnnotatedController {

    @RequestMapping
    public String historico(Model model, ReportesCalculoNominaDTO reportesCalculoNominaDTO) {
        if (reportesCalculoNominaDTO.isCancel()) {
            reportesCalculoNominaDTO = new ReportesCalculoNominaDTO();
        }

        reportesCalculoNominaDTO.setRfcUnico(reportesCalculoNominaDTO.getRfcUnico() == null ? null : reportesCalculoNominaDTO.getRfcUnico());
        reportesCalculoNominaDTO.setQnaIni(reportesCalculoNominaDTO.getQnaIni() == null ? "0" : reportesCalculoNominaDTO.getQnaIni());
        reportesCalculoNominaDTO.setQnaFin(reportesCalculoNominaDTO.getQnaFin() == null ? "0" : reportesCalculoNominaDTO.getQnaFin());

        String rfcEmpleado = null;
        String qnaIni = null;
        String qnaFin = null;

        if ((rfcEmpleado = reportesCalculoNominaDTO.getRfcUnico()) != null && 
            (qnaIni = reportesCalculoNominaDTO.getQnaIni()) != null && 
            (qnaFin = reportesCalculoNominaDTO.getQnaFin()) != null) {
            reportesCalculoNominaDTO.setMaxPag(super.getService(ReporteCalculoService.class).getHistoricoMaxPag(rfcEmpleado, qnaIni, qnaFin));
        }
        logger.debug("--> maxPag = " + reportesCalculoNominaDTO.getMaxPag());

        // Validaciones        
        reportesCalculoNominaDTO.setRfcUnicoRequired(Boolean.TRUE);
        reportesCalculoNominaDTO.setQnaIniRequired(Boolean.TRUE);
        reportesCalculoNominaDTO.setQnaFinRequired(Boolean.TRUE);

        model.addAttribute(reportesCalculoNominaDTO);
        return super.getViewName("historico");
    }

    @RequestMapping
    public String historicoTipo(Model model, ReportesCalculoNominaDTO reportesCalculoNominaDTO) {
        if (reportesCalculoNominaDTO.isCancel()) {
            reportesCalculoNominaDTO = new ReportesCalculoNominaDTO();
        }

        reportesCalculoNominaDTO.setRfcUnico(reportesCalculoNominaDTO.getRfcUnico() == null ? null : reportesCalculoNominaDTO.getRfcUnico());
        reportesCalculoNominaDTO.setQnaIni(reportesCalculoNominaDTO.getQnaIni() == null ? "0" : reportesCalculoNominaDTO.getQnaIni());
        reportesCalculoNominaDTO.setQnaFin(reportesCalculoNominaDTO.getQnaFin() == null ? "0" : reportesCalculoNominaDTO.getQnaFin());

        String rfcEmpleado = null;
        String qnaIni = null;
        String qnaFin = null;

        if ((rfcEmpleado = reportesCalculoNominaDTO.getRfcUnico()) != null && 
            (qnaIni = reportesCalculoNominaDTO.getQnaIni()) != null && 
            (qnaFin = reportesCalculoNominaDTO.getQnaFin()) != null) {
            reportesCalculoNominaDTO.setMaxPag(super.getService(ReporteCalculoService.class).getHistoricoMaxPag(rfcEmpleado, qnaIni, qnaFin));
        }
        logger.debug("--> maxPag = " + reportesCalculoNominaDTO.getMaxPag());

        // Validaciones        
        reportesCalculoNominaDTO.setRfcUnicoRequired(Boolean.TRUE);
        reportesCalculoNominaDTO.setQnaIniRequired(Boolean.TRUE);
        reportesCalculoNominaDTO.setQnaFinRequired(Boolean.TRUE);

        model.addAttribute(reportesCalculoNominaDTO);
        return super.getViewName("historicoTipo");
    }

    @RequestMapping
    public String historicoqna(Model model, ReportesCalculoNominaDTO reportesCalculoNominaDTO) {
        if (reportesCalculoNominaDTO.isCancel()) {
            reportesCalculoNominaDTO = new ReportesCalculoNominaDTO();
        }

        reportesCalculoNominaDTO.setRfcEmpleado(reportesCalculoNominaDTO.getRfcEmpleado() == null ? null : reportesCalculoNominaDTO.getRfcEmpleado());
        reportesCalculoNominaDTO.setQnaPago(reportesCalculoNominaDTO.getQnaPago() == null ? "0" : reportesCalculoNominaDTO.getQnaPago());

        // Validaciones        
        reportesCalculoNominaDTO.setRfcRequired(Boolean.TRUE);
        reportesCalculoNominaDTO.setQnaPagoRequired(Boolean.TRUE);

        model.addAttribute(reportesCalculoNominaDTO);
        return super.getViewName("historicoqna");
    }

    /**
     * Reporte Impresión de comprobantes.
     * @author Oscar S.
     * @param model Model
     * @param reportesCalculoNominaDTO ReportesCalculoNominaDTO
     * @return String
     */
    @RequestMapping
    public String impresion(Model model, ReportesCalculoNominaDTO reportesCalculoNominaDTO) {
        if (reportesCalculoNominaDTO.isCancel()) {
            reportesCalculoNominaDTO = new ReportesCalculoNominaDTO();
        }

        reportesCalculoNominaDTO.setComplemento(reportesCalculoNominaDTO.getComplemento() == null ? null : reportesCalculoNominaDTO.getComplemento());
        reportesCalculoNominaDTO.setMesQna(reportesCalculoNominaDTO.getMesQna() == null ? "0" : reportesCalculoNominaDTO.getMesQna());
        reportesCalculoNominaDTO.setTipoNomina(reportesCalculoNominaDTO.getTipoNomina() == null ? "0" : reportesCalculoNominaDTO.getTipoNomina());

        // Unidades
        if (reportesCalculoNominaDTO.getIdUnidad() != null) {
            if (reportesCalculoNominaDTO.getIdUnidad().equals("0")) {
                List<String> dimensiones = super.security().getDimensionPrimaryLevel("SIREHUNIDAD");
                StringBuffer sb = new StringBuffer();

                for (String dim: dimensiones) {
                    sb.append("'").append(dim).append("',");
                }
                if (sb.length() > 0) {
                    sb.delete(sb.length() - 1, sb.length());
                }
                reportesCalculoNominaDTO.setUnidades(sb.toString());
            } else {
                reportesCalculoNominaDTO.setUnidades("'" + reportesCalculoNominaDTO.getIdUnidad() + "'");
            }
        }
        reportesCalculoNominaDTO.setSubReport("impresion_sub_subreport1.jasper");

        // Validaciones        
        reportesCalculoNominaDTO.setComplementoRequired(Boolean.TRUE);
        reportesCalculoNominaDTO.setMesQnaRequired(Boolean.TRUE);
        reportesCalculoNominaDTO.setTipoNominaRequired(Boolean.TRUE);
        reportesCalculoNominaDTO.setIdUnidadRequired(Boolean.FALSE);

        model.addAttribute(reportesCalculoNominaDTO);
        return super.getViewName("impresion");
    }

    /**
     * Reporte Firmas.
     * @author
     * @param model Model
     * @param reportesCalculoNominaDTO ReportesCalculoNominaDTO
     * @return String
     */
    @RequestMapping
    public String firmas(Model model, ReportesCalculoNominaDTO reportesCalculoNominaDTO) {
        if (reportesCalculoNominaDTO.isCancel()) {
            reportesCalculoNominaDTO = new ReportesCalculoNominaDTO();
        }

        reportesCalculoNominaDTO.setComplemento(reportesCalculoNominaDTO.getComplemento() == null ? null : reportesCalculoNominaDTO.getComplemento());
        reportesCalculoNominaDTO.setMesQna(reportesCalculoNominaDTO.getMesQna() == null ? "0" : reportesCalculoNominaDTO.getMesQna());
        reportesCalculoNominaDTO.setTipoNomina(reportesCalculoNominaDTO.getTipoNomina() == null ? "0" : reportesCalculoNominaDTO.getTipoNomina());

        // Unidades
        if (reportesCalculoNominaDTO.getIdUnidad() != null) {
            if (reportesCalculoNominaDTO.getIdUnidad().equals("0")) {
                List<String> dimensiones = super.security().getDimensionPrimaryLevel("SIREHUNIDAD");
                StringBuffer sb = new StringBuffer();

                for (String dim: dimensiones) {
                    sb.append("'").append(dim).append("',");
                }
                if (sb.length() > 0) {
                    sb.delete(sb.length() - 1, sb.length());
                }
                reportesCalculoNominaDTO.setUnidades(sb.toString());
            } else {
                reportesCalculoNominaDTO.setUnidades("'" + reportesCalculoNominaDTO.getIdUnidad() + "'");
            }
        }

        // Validaciones        
        reportesCalculoNominaDTO.setComplementoRequired(Boolean.TRUE);
        reportesCalculoNominaDTO.setMesQnaRequired(Boolean.TRUE);
        reportesCalculoNominaDTO.setTipoNominaRequired(Boolean.TRUE);
        reportesCalculoNominaDTO.setIdUnidadRequired(Boolean.FALSE);

        model.addAttribute(reportesCalculoNominaDTO);
        return super.getViewName("firmas");
    }

    @RequestMapping
    public String concentrado(Model model, ReportesCalculoNominaDTO reportesCalculoNominaDTO) {
        if (reportesCalculoNominaDTO.isCancel()) {
            reportesCalculoNominaDTO = new ReportesCalculoNominaDTO();
        }

        reportesCalculoNominaDTO.setComplemento(reportesCalculoNominaDTO.getComplemento() == null ? null : reportesCalculoNominaDTO.getComplemento());
        reportesCalculoNominaDTO.setMesQna(reportesCalculoNominaDTO.getMesQna() == null ? "0" : reportesCalculoNominaDTO.getMesQna());
        reportesCalculoNominaDTO.setTipoNomina(reportesCalculoNominaDTO.getTipoNomina() == null ? "0" : reportesCalculoNominaDTO.getTipoNomina());
        reportesCalculoNominaDTO.setLeyenda(reportesCalculoNominaDTO.getLeyenda() == null ? null : reportesCalculoNominaDTO.getLeyenda());

        // Unidades
        if (reportesCalculoNominaDTO.getIdUnidad() != null) {
            if (reportesCalculoNominaDTO.getIdUnidad().equals("0")) {
                List<String> dimensiones = super.security().getDimensionPrimaryLevel("SIREHUNIDAD");
                StringBuffer sb = new StringBuffer();
                for (String dim: dimensiones) {
                    sb.append("'").append(dim).append("',");
                }
                if (sb.length() > 0) {
                    sb.delete(sb.length() - 1, sb.length());
                }
                reportesCalculoNominaDTO.setUnidades(sb.toString());
            } else {
                reportesCalculoNominaDTO.setUnidades("'" + reportesCalculoNominaDTO.getIdUnidad() + "'");
            }
        }

        // Validaciones        
        reportesCalculoNominaDTO.setComplementoRequired(Boolean.TRUE);
        reportesCalculoNominaDTO.setMesQnaRequired(Boolean.TRUE);
        reportesCalculoNominaDTO.setTipoNominaRequired(Boolean.TRUE);
        reportesCalculoNominaDTO.setIdUnidadRequired(Boolean.FALSE);
        reportesCalculoNominaDTO.setLeyendaRequired(Boolean.TRUE);

        model.addAttribute(reportesCalculoNominaDTO);
        return super.getViewName("concentrado");
    }

    @RequestMapping
    public String concentradoef(Model model, ReportesCalculoNominaDTO reportesCalculoNominaDTO) {
        if (reportesCalculoNominaDTO.isCancel()) {
            reportesCalculoNominaDTO = new ReportesCalculoNominaDTO();
        }
        
        reportesCalculoNominaDTO.setComplemento(reportesCalculoNominaDTO.getComplemento() == null ? null : reportesCalculoNominaDTO.getComplemento());
        reportesCalculoNominaDTO.setMesQna(reportesCalculoNominaDTO.getMesQna() == null ? "0" : reportesCalculoNominaDTO.getMesQna());
        reportesCalculoNominaDTO.setTipoNomina(reportesCalculoNominaDTO.getTipoNomina() == null ? "0" : reportesCalculoNominaDTO.getTipoNomina());
        reportesCalculoNominaDTO.setLeyenda(reportesCalculoNominaDTO.getLeyenda() == null ? null : reportesCalculoNominaDTO.getLeyenda());
        
        // Entidades
        if (reportesCalculoNominaDTO.getIdUnidad() != null) {
            if (reportesCalculoNominaDTO.getIdUnidad().equals("0")) {
                StringBuffer sb = new StringBuffer();
                for (int i = 1; i <= 33; i++) {
                    sb.append("'").append(i).append("',");
                }
                if (sb.length() > 0) {
                    sb.delete(sb.length() - 1, sb.length());
                }
                reportesCalculoNominaDTO.setUnidades(sb.toString());
            } else {
                reportesCalculoNominaDTO.setUnidades("'" + reportesCalculoNominaDTO.getIdUnidad() + "'");
            }
        }

        // Validaciones        
        reportesCalculoNominaDTO.setComplementoRequired(Boolean.TRUE);
        reportesCalculoNominaDTO.setMesQnaRequired(Boolean.TRUE);
        reportesCalculoNominaDTO.setTipoNominaRequired(Boolean.TRUE);
        reportesCalculoNominaDTO.setIdUnidadRequired(Boolean.FALSE);
        reportesCalculoNominaDTO.setLeyendaRequired(Boolean.TRUE);

        model.addAttribute(reportesCalculoNominaDTO);
        return super.getViewName("concentradoef");
    }

    @RequestMapping
    public String seguro(Model model, ReportesCalculoNominaDTO reportesCalculoNominaDTO) {
        if (reportesCalculoNominaDTO.isCancel()) {
            reportesCalculoNominaDTO = new ReportesCalculoNominaDTO();
        }

        reportesCalculoNominaDTO.setComplemento(reportesCalculoNominaDTO.getComplemento() == null ? null : reportesCalculoNominaDTO.getComplemento());
        reportesCalculoNominaDTO.setMesQna(reportesCalculoNominaDTO.getMesQna() == null ? "0" : reportesCalculoNominaDTO.getMesQna());
        reportesCalculoNominaDTO.setTipoNomina(reportesCalculoNominaDTO.getTipoNomina() == null ? "0" : reportesCalculoNominaDTO.getTipoNomina());
        reportesCalculoNominaDTO.setConcepto(reportesCalculoNominaDTO.getConcepto() == null ? "0" : reportesCalculoNominaDTO.getConcepto());

        // Validaciones
        reportesCalculoNominaDTO.setMesQnaRequired(Boolean.TRUE);
        reportesCalculoNominaDTO.setTipoNominaRequired(Boolean.TRUE);
        reportesCalculoNominaDTO.setConceptoRequired(Boolean.TRUE);

        model.addAttribute(reportesCalculoNominaDTO);
        return super.getViewName("seguro");
    }

    @RequestMapping
    public String seguroP(Model model, ReportesCalculoNominaDTO reportesCalculoNominaDTO) {
        if (reportesCalculoNominaDTO.isCancel()) {
            reportesCalculoNominaDTO = new ReportesCalculoNominaDTO();
        }

        reportesCalculoNominaDTO.setComplemento(reportesCalculoNominaDTO.getComplemento() == null ? null : reportesCalculoNominaDTO.getComplemento());
        reportesCalculoNominaDTO.setMesQna(reportesCalculoNominaDTO.getMesQna() == null ? "0" : reportesCalculoNominaDTO.getMesQna());
        reportesCalculoNominaDTO.setTipoNomina(reportesCalculoNominaDTO.getTipoNomina() == null ? "0" : reportesCalculoNominaDTO.getTipoNomina());
        reportesCalculoNominaDTO.setConcepto(reportesCalculoNominaDTO.getConcepto() == null ? "0" : reportesCalculoNominaDTO.getConcepto());

        // Validaciones        
        reportesCalculoNominaDTO.setMesQnaRequired(Boolean.TRUE);
        reportesCalculoNominaDTO.setTipoNominaRequired(Boolean.TRUE);
        reportesCalculoNominaDTO.setConceptoRequired(Boolean.TRUE);

        model.addAttribute(reportesCalculoNominaDTO);
        return super.getViewName("seguroP");
    }

    @RequestMapping
    public String detalle(Model model, ReportesCalculoNominaDTO reportesCalculoNominaDTO) {
        if (reportesCalculoNominaDTO.isCancel()) {
            reportesCalculoNominaDTO = new ReportesCalculoNominaDTO();
        }

        reportesCalculoNominaDTO.setUniCiclo(reportesCalculoNominaDTO.getUniCiclo() == null ? "0" : reportesCalculoNominaDTO.getUniCiclo());
        reportesCalculoNominaDTO.setComplemento(reportesCalculoNominaDTO.getComplemento() == null ? null : reportesCalculoNominaDTO.getComplemento());
        reportesCalculoNominaDTO.setMesQna(reportesCalculoNominaDTO.getMesQna() == null ? "0" : reportesCalculoNominaDTO.getMesQna());
        reportesCalculoNominaDTO.setTipoNomina(reportesCalculoNominaDTO.getTipoNomina() == null ? "0" : reportesCalculoNominaDTO.getTipoNomina());
        reportesCalculoNominaDTO.setIdUnidad(reportesCalculoNominaDTO.getIdUnidad() == null ? "0" : reportesCalculoNominaDTO.getIdUnidad());

        // Validaciones        
        reportesCalculoNominaDTO.setUniCicloRequired(Boolean.TRUE);
        reportesCalculoNominaDTO.setComplementoRequired(Boolean.TRUE);
        reportesCalculoNominaDTO.setMesQnaRequired(Boolean.TRUE);
        reportesCalculoNominaDTO.setTipoNominaRequired(Boolean.TRUE);
        reportesCalculoNominaDTO.setIdUnidadRequired(Boolean.TRUE);

        model.addAttribute(reportesCalculoNominaDTO);
        return super.getViewName("detalle");
    }

    @RequestMapping
    public String conceptoPago(Model model, ReportesCalculoNominaDTO reportesCalculoNominaDTO) {
        if (reportesCalculoNominaDTO.isCancel()) {
            reportesCalculoNominaDTO = new ReportesCalculoNominaDTO();
        }

        reportesCalculoNominaDTO.setComplemento(reportesCalculoNominaDTO.getComplemento() == null ? null : reportesCalculoNominaDTO.getComplemento());
        reportesCalculoNominaDTO.setMesQna(reportesCalculoNominaDTO.getMesQna() == null ? "0" : reportesCalculoNominaDTO.getMesQna());
        reportesCalculoNominaDTO.setTipoNomina(reportesCalculoNominaDTO.getTipoNomina() == null ? "0" : reportesCalculoNominaDTO.getTipoNomina());
        reportesCalculoNominaDTO.setConcepto(reportesCalculoNominaDTO.getConcepto() == null ? "0" : reportesCalculoNominaDTO.getConcepto());

        if (reportesCalculoNominaDTO.getTipoCpto() == null || reportesCalculoNominaDTO.getTipoCpto().equals("0")) {
            reportesCalculoNominaDTO.setTipoCpto("'C','D','P','U'");
        }

        // Unidades
        if (reportesCalculoNominaDTO.getIdUnidad() != null) {
            if (reportesCalculoNominaDTO.getIdUnidad().equals("0")) {
                List<String> dimensiones = super.security().getDimensionPrimaryLevel("SIREHUNIDAD");
                StringBuffer sb = new StringBuffer();
                for (String dim: dimensiones) {
                    sb.append("'").append(dim).append("',");
                }
                if (sb.length() > 0) {
                    sb.delete(sb.length() - 1, sb.length());
                }
                reportesCalculoNominaDTO.setUnidades(sb.toString());
            } else {
                reportesCalculoNominaDTO.setUnidades("'" + reportesCalculoNominaDTO.getIdUnidad() + "'");
            }
        }

        // Validaciones
        reportesCalculoNominaDTO.setMesQnaRequired(Boolean.TRUE);
        reportesCalculoNominaDTO.setTipoNominaRequired(Boolean.TRUE);
        reportesCalculoNominaDTO.setConceptoRequired(Boolean.FALSE);
        reportesCalculoNominaDTO.setTipoCptoRequired(Boolean.TRUE);
        reportesCalculoNominaDTO.setIdUnidadRequired(Boolean.FALSE);

        model.addAttribute(reportesCalculoNominaDTO);
        return super.getViewName("conceptoPago");
    }

    @RequestMapping
    public String acumulado(Model model, ReportesCalculoNominaDTO reportesCalculoNominaDTO) {
        if (reportesCalculoNominaDTO.isCancel()) {
            reportesCalculoNominaDTO = new ReportesCalculoNominaDTO();
        }

        reportesCalculoNominaDTO.setRfcEmpleado(reportesCalculoNominaDTO.getRfcEmpleado() == null ? null : reportesCalculoNominaDTO.getRfcEmpleado());
        reportesCalculoNominaDTO.setQnaIni(reportesCalculoNominaDTO.getQnaIni() == null ? "0" : reportesCalculoNominaDTO.getQnaIni());
        reportesCalculoNominaDTO.setQnaFin(reportesCalculoNominaDTO.getQnaFin() == null ? "0" : reportesCalculoNominaDTO.getQnaFin());
        reportesCalculoNominaDTO.setConcepto(reportesCalculoNominaDTO.getConcepto() == null ? "0" : reportesCalculoNominaDTO.getConcepto());
        reportesCalculoNominaDTO.setTipoCpto(reportesCalculoNominaDTO.getTipoCpto() == null ? "0" : reportesCalculoNominaDTO.getTipoCpto());

        // Validaciones        
        reportesCalculoNominaDTO.setRfcRequired(Boolean.TRUE);
        reportesCalculoNominaDTO.setQnaIniRequired(Boolean.TRUE);
        reportesCalculoNominaDTO.setQnaFinRequired(Boolean.TRUE);
        reportesCalculoNominaDTO.setConceptoRequired(Boolean.TRUE);
        reportesCalculoNominaDTO.setTipoCptoRequired(Boolean.TRUE);

        model.addAttribute(reportesCalculoNominaDTO);
        return super.getViewName("acumulado");
    }

    @RequestMapping
    public String historicoPlaza(Model model, ReportesCalculoNominaDTO reportesCalculoNominaDTO) {
        if (reportesCalculoNominaDTO.isCancel()) {
            reportesCalculoNominaDTO = new ReportesCalculoNominaDTO();
        }

        reportesCalculoNominaDTO.setRfcEmpleado(reportesCalculoNominaDTO.getRfcEmpleado() == null ? null : reportesCalculoNominaDTO.getRfcEmpleado());
        reportesCalculoNominaDTO.setIdPlaza(reportesCalculoNominaDTO.getIdPlaza() == null ? null : reportesCalculoNominaDTO.getIdPlaza());

        // Validaciones
        reportesCalculoNominaDTO.setIdPlazaOrRfcRequired(Boolean.TRUE);

        model.addAttribute(reportesCalculoNominaDTO);
        return super.getViewName("historicoPlaza");
    }

    @RequestMapping
    public String comparaCasos(Model model, ReportesCalculoNominaDTO reportesCalculoNominaDTO) {
        if (reportesCalculoNominaDTO.isCancel()) {
            reportesCalculoNominaDTO = new ReportesCalculoNominaDTO();
        }

        reportesCalculoNominaDTO.setQnaIni(reportesCalculoNominaDTO.getQnaIni() == null ? "0" : reportesCalculoNominaDTO.getQnaIni());
        reportesCalculoNominaDTO.setQnaFin(reportesCalculoNominaDTO.getQnaFin() == null ? "0" : reportesCalculoNominaDTO.getQnaFin());
        reportesCalculoNominaDTO.setTipoNomina(reportesCalculoNominaDTO.getTipoNomina() == null ? "0" : reportesCalculoNominaDTO.getTipoNomina());
        reportesCalculoNominaDTO.setConcepto(reportesCalculoNominaDTO.getConcepto() == null ? "0" : reportesCalculoNominaDTO.getConcepto());
        reportesCalculoNominaDTO.setTipoCpto(reportesCalculoNominaDTO.getTipoCpto() == null ? "0" : reportesCalculoNominaDTO.getTipoCpto());

        // Unidades
        if (reportesCalculoNominaDTO.getIdUnidad() != null) {
            if (reportesCalculoNominaDTO.getIdUnidad().equals("0")) {
                List<String> dimensiones = super.security().getDimensionPrimaryLevel("SIREHUNIDAD");
                StringBuffer sb = new StringBuffer();
                for (String dim: dimensiones) {
                    sb.append("'").append(dim).append("',");
                }
                if (sb.length() > 0) {
                    sb.delete(sb.length() - 1, sb.length());
                }
                reportesCalculoNominaDTO.setUnidades(sb.toString());
            } else {
                reportesCalculoNominaDTO.setUnidades("'" + reportesCalculoNominaDTO.getIdUnidad() + "'");
            }
        }

        // Validaciones        
        reportesCalculoNominaDTO.setQnaIniRequired(Boolean.TRUE);
        reportesCalculoNominaDTO.setQnaFinRequired(Boolean.TRUE);
        reportesCalculoNominaDTO.setTipoNominaRequired(Boolean.TRUE);
        reportesCalculoNominaDTO.setConceptoRequired(Boolean.TRUE);
        reportesCalculoNominaDTO.setTipoCptoRequired(Boolean.TRUE);

        model.addAttribute(reportesCalculoNominaDTO);
        return super.getViewName("comparaCasos");
    }

    @RequestMapping
    public String comparaMontos(Model model, ReportesCalculoNominaDTO reportesCalculoNominaDTO) {
        if (reportesCalculoNominaDTO.isCancel()) {
            reportesCalculoNominaDTO = new ReportesCalculoNominaDTO();
        }

        reportesCalculoNominaDTO.setQnaIni(reportesCalculoNominaDTO.getQnaIni() == null ? "0" : reportesCalculoNominaDTO.getQnaIni());
        reportesCalculoNominaDTO.setQnaFin(reportesCalculoNominaDTO.getQnaFin() == null ? "0" : reportesCalculoNominaDTO.getQnaFin());
        reportesCalculoNominaDTO.setTipoNomina(reportesCalculoNominaDTO.getTipoNomina() == null ? "0" : reportesCalculoNominaDTO.getTipoNomina());
        reportesCalculoNominaDTO.setConcepto(reportesCalculoNominaDTO.getConcepto() == null ? "0" : reportesCalculoNominaDTO.getConcepto());
        reportesCalculoNominaDTO.setTipoCpto(reportesCalculoNominaDTO.getTipoCpto() == null ? "0" : reportesCalculoNominaDTO.getTipoCpto());

        // Unidades
        if (reportesCalculoNominaDTO.getIdUnidad() != null) {
            if (reportesCalculoNominaDTO.getIdUnidad().equals("0")) {
                List<String> dimensiones = super.security().getDimensionPrimaryLevel("SIREHUNIDAD");
                StringBuffer sb = new StringBuffer();
                for (String dim: dimensiones) {
                    sb.append("'").append(dim).append("',");
                }
                if (sb.length() > 0) {
                    sb.delete(sb.length() - 1, sb.length());
                }
                reportesCalculoNominaDTO.setUnidades(sb.toString());
            } else {
                reportesCalculoNominaDTO.setUnidades("'" + reportesCalculoNominaDTO.getIdUnidad() + "'");
            }
        }

        // Validaciones        
        reportesCalculoNominaDTO.setQnaIniRequired(Boolean.TRUE);
        reportesCalculoNominaDTO.setQnaFinRequired(Boolean.TRUE);
        reportesCalculoNominaDTO.setTipoNominaRequired(Boolean.TRUE);
        reportesCalculoNominaDTO.setConceptoRequired(Boolean.TRUE);
        reportesCalculoNominaDTO.setTipoCptoRequired(Boolean.TRUE);

        model.addAttribute(reportesCalculoNominaDTO);
        return super.getViewName("comparaMontos");
    }

    /**
     * Reporte Impresión de comprobantes para distribución 9200.
     * @author Oscar S.
     * Modificado por Josue Torres para adecuarlo al parametro de distribución
     * @param model Model
     * @param reportesCalculoNominaDTO ReportesCalculoNominaDTO
     * @return String
     */
    @RequestMapping
    public String impresionuni(Model model, ReportesCalculoNominaDTO reportesCalculoNominaDTO) {
        if (reportesCalculoNominaDTO.isCancel()) {
            reportesCalculoNominaDTO = new ReportesCalculoNominaDTO();
        }

        reportesCalculoNominaDTO.setComplemento(reportesCalculoNominaDTO.getComplemento() == null ? null : reportesCalculoNominaDTO.getComplemento());
        reportesCalculoNominaDTO.setMesQna(reportesCalculoNominaDTO.getMesQna() == null ? "0" : reportesCalculoNominaDTO.getMesQna());
        reportesCalculoNominaDTO.setTipoNomina(reportesCalculoNominaDTO.getTipoNomina() == null ? "0" : reportesCalculoNominaDTO.getTipoNomina());
        reportesCalculoNominaDTO.setSubReport("impresion_sub_subreport1.jasper");

        // Validaciones        
        reportesCalculoNominaDTO.setComplementoRequired(Boolean.TRUE);
        reportesCalculoNominaDTO.setMesQnaRequired(Boolean.TRUE);
        reportesCalculoNominaDTO.setTipoNominaRequired(Boolean.TRUE);

        model.addAttribute(reportesCalculoNominaDTO);
        return super.getViewName("impresionuni");
    }

    /**
     * Reporte Firmas.
     * @author
     * Modificado por Josue Torres para adecuarlo al parametro de distribución 9200
     * @param model Model
     * @param reportesCalculoNominaDTO ReportesCalculoNominaDTO
     * @return String
     */
    @RequestMapping
    public String firmasuni(Model model, ReportesCalculoNominaDTO reportesCalculoNominaDTO) {
        if (reportesCalculoNominaDTO.isCancel()) {
            reportesCalculoNominaDTO = new ReportesCalculoNominaDTO();
        }

        reportesCalculoNominaDTO.setComplemento(reportesCalculoNominaDTO.getComplemento() == null ? null : reportesCalculoNominaDTO.getComplemento());
        reportesCalculoNominaDTO.setMesQna(reportesCalculoNominaDTO.getMesQna() == null ? "0" : reportesCalculoNominaDTO.getMesQna());
        reportesCalculoNominaDTO.setTipoNomina(reportesCalculoNominaDTO.getTipoNomina() == null ? "0" : reportesCalculoNominaDTO.getTipoNomina());

        // Validaciones        
        reportesCalculoNominaDTO.setComplementoRequired(Boolean.TRUE);
        reportesCalculoNominaDTO.setMesQnaRequired(Boolean.TRUE);
        reportesCalculoNominaDTO.setTipoNominaRequired(Boolean.TRUE);

        model.addAttribute(reportesCalculoNominaDTO);
        return super.getViewName("firmasuni");
    }
    
    @RequestMapping
    public String archivofaltas(Model model, ReportesCalculoNominaDTO reportesCalculoNominaDTO) {
        if (reportesCalculoNominaDTO.isCancel()) {
            reportesCalculoNominaDTO = new ReportesCalculoNominaDTO();
        }

        //if (reportesMovtoNominaDTO.getQnaIni() != null) {
        //    reportesMovtoNominaDTO.setQnaIniNumber(reportesMovtoNominaDTO.getQnaIni());
        //} else {
        //    reportesMovtoNominaDTO.setQnaIniNumber("0");
        //}

        // Validaciones        
        reportesCalculoNominaDTO.setQnaIniRequired(Boolean.TRUE);

        model.addAttribute(reportesCalculoNominaDTO);
        return super.getViewName("archivoFaltas");
    }
        
    @RequestMapping
    public String constanciaSueldos(Model model, ReportesConstanciasDTO reportesConstanciasDTO){
        if(reportesConstanciasDTO.isCancel()){   reportesConstanciasDTO = new ReportesConstanciasDTO();   }
        
        model.addAttribute(reportesConstanciasDTO);
        return super.getViewName("constanciaSueldos"); 
    }
    
    @RequestMapping
    public String constanciaSueldosReporte(Model model, ReportesConstanciasDTO reportesConstanciasDTO){
    
        reportesConstanciasDTO.setMuestraReporte(false);
        
        if(reportesConstanciasDTO.getCiclo() == 0){
            reportesConstanciasDTO.setMuestraReporte(false);
            super.saveError(model, "El ciclo es campo obligatorio.");  }
        
        if(reportesConstanciasDTO.getFirmado().equalsIgnoreCase("0")){
            reportesConstanciasDTO.setMuestraReporte(false);
            super.saveError(model, "El firmado es campo obligatorio.");  }
        
        if(reportesConstanciasDTO.getOrigen() != null ) {
            if(reportesConstanciasDTO.getOrigen().equalsIgnoreCase("r")){
                if(reportesConstanciasDTO.getRfcEmpleado().equalsIgnoreCase("")){
                    reportesConstanciasDTO.setMuestraReporte(false);
                    super.saveError(model, "El campo rfc es campo obligatorio.");
                } 
                else {
                    if( reportesConstanciasDTO.getFirmado().equalsIgnoreCase("S") ){
                        reportesConstanciasDTO.setMuestraReporte(true);
                        reportesConstanciasDTO.setTipoReporte("RCF"); }
                    else {  reportesConstanciasDTO.setMuestraReporte(true); 
                            reportesConstanciasDTO.setTipoReporte("RSF");   }
                }
            }
            else if(reportesConstanciasDTO.getOrigen().equalsIgnoreCase("u")){
                if(reportesConstanciasDTO.getUnidad().equalsIgnoreCase("0")){
                    reportesConstanciasDTO.setMuestraReporte(false);
                    super.saveError(model, "La Unidad es campo obligatorio.");
                } 
                else {
                    if(reportesConstanciasDTO.getFirmado().equalsIgnoreCase("S")){
                        reportesConstanciasDTO.setMuestraReporte(true);
                        reportesConstanciasDTO.setTipoReporte("UCF");   }
                    else {  reportesConstanciasDTO.setMuestraReporte(true); 
                            reportesConstanciasDTO.setTipoReporte("USF");   }
                }
            }
        } else {   reportesConstanciasDTO.setMuestraReporte(false);
                   super.saveError(model, "El origen es campo obligatorio.");   }
            
        
        model.addAttribute(reportesConstanciasDTO);
        return super.getViewName("constanciaSueldos"); 
    }
    

    @RequestMapping
    public String movsInternosIncidencias(Model model, ReportesConstanciasDTO reportesConstanciasDTO){
        if (reportesConstanciasDTO.isCancel()) {   reportesConstanciasDTO = new ReportesConstanciasDTO();   }
        if((reportesConstanciasDTO.getQnaIni() != null) || (reportesConstanciasDTO.getQnaFin() != null)){
            if((reportesConstanciasDTO.getQnaIni().equalsIgnoreCase("0")) || (reportesConstanciasDTO.getQnaFin().equalsIgnoreCase("0"))){
                if(reportesConstanciasDTO.getQnaIni().equalsIgnoreCase("0")){   
                    reportesConstanciasDTO.setMuestraReporte(false);
                    super.saveError(model, "Seleccione la quincena inicial.");   
                }
                if(reportesConstanciasDTO.getQnaFin().equalsIgnoreCase("0")){
                    reportesConstanciasDTO.setMuestraReporte(false);
                    super.saveError(model, "Seleccione la quincena final.");     
                }
                if(reportesConstanciasDTO.getOrigen() == null){
                    reportesConstanciasDTO.setMuestraReporte(false);
                    super.saveError(model, "Seleccione un origen de datos (Unidad ó RFC).");
                }
                else{
                    if((reportesConstanciasDTO.getRfcEmpleado().equalsIgnoreCase("")) || (reportesConstanciasDTO.getUnidad().equalsIgnoreCase("0"))){   
                        if(reportesConstanciasDTO.getOrigen().equalsIgnoreCase("r")){
                            if(reportesConstanciasDTO.getRfcEmpleado().equalsIgnoreCase("")){
                                reportesConstanciasDTO.setMuestraReporte(false);
                                super.saveError(model, "El rfc es campo requerido.");
                            }
                        }
                        else if(reportesConstanciasDTO.getOrigen().equalsIgnoreCase("u")){
                            if(reportesConstanciasDTO.getUnidad().equalsIgnoreCase("0")){
                                List<String> dimensiones  = super.security().getDimensionPrimaryLevel("SIREHUNIDAD");
                                StringBuffer sb = new StringBuffer();
                                for (String dim: dimensiones){
                                    sb.append("'").append(dim).append("',");
                                }
                                if(sb.length()> 0){
                                    sb.delete(sb.length() - 1, sb.length());
                                }
                                reportesConstanciasDTO.setUnidad(sb.toString());
                            }
                            else{   reportesConstanciasDTO.setUnidad("'" + reportesConstanciasDTO.getUnidad() + "'");   }
                        }
                    }
                }
            }
            else{
                if(reportesConstanciasDTO.getOrigen() == null){
                    reportesConstanciasDTO.setMuestraReporte(false);
                    super.saveError(model, "Seleccione un origen de datos (Unidad ó RFC).");
                }
                else{
                    if((reportesConstanciasDTO.getRfcEmpleado().equalsIgnoreCase(""))){   
                        if(reportesConstanciasDTO.getOrigen().equalsIgnoreCase("r")){
                            if(reportesConstanciasDTO.getRfcEmpleado().equalsIgnoreCase("")){
                                reportesConstanciasDTO.setMuestraReporte(false);
                                super.saveError(model, "El rfc es campo requerido.");  
                            }     
                        }
                        else if(reportesConstanciasDTO.getOrigen().equalsIgnoreCase("u")){
                            if(reportesConstanciasDTO.getUnidad().equalsIgnoreCase("0")){
                                List<String> dimensiones  = super.security().getDimensionPrimaryLevel("SIREHUNIDAD");
                                StringBuffer sb = new StringBuffer();
                                for (String dim: dimensiones){
                                    sb.append("'").append(dim).append("',");
                                }
                                if(sb.length()> 0){
                                    sb.delete(sb.length() - 1, sb.length());
                                }
                                reportesConstanciasDTO.setUnidad(sb.toString());
                            }
                            else{   reportesConstanciasDTO.setUnidad("'" + reportesConstanciasDTO.getUnidad() + "'");   }
                        }
                    }
                }
            }
        }
        
        model.addAttribute(reportesConstanciasDTO);
        return super.getViewName("movsIntInc"); 
    }
    
    @RequestMapping
    public String incidenciasQ(Model model, ReportesConstanciasDTO reportesConstanciasDTO){
            if (reportesConstanciasDTO.isCancel()) {   reportesConstanciasDTO = new ReportesConstanciasDTO();   }
            if((reportesConstanciasDTO.getQnaIni() != null) || (reportesConstanciasDTO.getQnaFin() != null)){
                if((reportesConstanciasDTO.getQnaIni().equalsIgnoreCase("0")) || (reportesConstanciasDTO.getQnaFin().equalsIgnoreCase("0"))){
                    if(reportesConstanciasDTO.getQnaIni().equalsIgnoreCase("0")){   
                        reportesConstanciasDTO.setMuestraReporte(false);
                        super.saveError(model, "Seleccione la quincena inicial.");   
                    }
                    if(reportesConstanciasDTO.getQnaFin().equalsIgnoreCase("0")){
                        reportesConstanciasDTO.setMuestraReporte(false);
                        super.saveError(model, "Seleccione la quincena final.");     
                    }
                    if(reportesConstanciasDTO.getOrigen() == null){
                        reportesConstanciasDTO.setMuestraReporte(false);
                        super.saveError(model, "Seleccione un origen de datos (Unidad ó RFC).");
                    }
                    else{
                        if((reportesConstanciasDTO.getRfcEmpleado().equalsIgnoreCase("")) || (reportesConstanciasDTO.getUnidad().equalsIgnoreCase("0"))){   
                            if(reportesConstanciasDTO.getOrigen().equalsIgnoreCase("r")){
                                if(reportesConstanciasDTO.getRfcEmpleado().equalsIgnoreCase("")){
                                    reportesConstanciasDTO.setMuestraReporte(false);
                                    super.saveError(model, "El rfc es campo requerido.");
                                }
                            }
                            else if(reportesConstanciasDTO.getOrigen().equalsIgnoreCase("u")){
                                if(reportesConstanciasDTO.getUnidad().equalsIgnoreCase("0")){
                                    List<String> dimensiones  = super.security().getDimensionPrimaryLevel("SIREHUNIDAD");
                                    StringBuffer sb = new StringBuffer();
                                    for (String dim: dimensiones){
                                        sb.append("'").append(dim).append("',");
                                    }
                                    if(sb.length()> 0){
                                        sb.delete(sb.length() - 1, sb.length());
                                    }
                                    reportesConstanciasDTO.setUnidad(sb.toString());
                                }
                                else{   reportesConstanciasDTO.setUnidad("'" + reportesConstanciasDTO.getUnidad() + "'");   }
                            }
                        }
                    }
                }
                else{
                    if(reportesConstanciasDTO.getOrigen() == null){
                        reportesConstanciasDTO.setMuestraReporte(false);
                        super.saveError(model, "Seleccione un origen de datos (Unidad ó RFC).");
                    }
                    else{
                        if((reportesConstanciasDTO.getRfcEmpleado().equalsIgnoreCase(""))){   
                            if(reportesConstanciasDTO.getOrigen().equalsIgnoreCase("r")){
                                if(reportesConstanciasDTO.getRfcEmpleado().equalsIgnoreCase("")){
                                    reportesConstanciasDTO.setMuestraReporte(false);
                                    super.saveError(model, "El rfc es campo requerido.");  
                                }     
                            }
                            else if(reportesConstanciasDTO.getOrigen().equalsIgnoreCase("u")){
                                if(reportesConstanciasDTO.getUnidad().equalsIgnoreCase("0")){
                                    List<String> dimensiones  = super.security().getDimensionPrimaryLevel("SIREHUNIDAD");
                                    StringBuffer sb = new StringBuffer();
                                    for (String dim: dimensiones){
                                        sb.append("'").append(dim).append("',");
                                    }
                                    if(sb.length()> 0){
                                        sb.delete(sb.length() - 1, sb.length());
                                    }
                                    reportesConstanciasDTO.setUnidad(sb.toString());
                                }
                                else{   reportesConstanciasDTO.setUnidad("'" + reportesConstanciasDTO.getUnidad() + "'");   }
                            }
                        }
                    }
                }
            }
        model.addAttribute(reportesConstanciasDTO);
        return super.getViewName("incidenciasQ");
    }
    
    @RequestMapping
    public String validaPeriodoLaborado(Model model, ReportesConstanciasDTO reportesConstanciasDTO, HttpServletResponse response) throws IOException {
        List<String> datos = null;
        reportesConstanciasDTO.setMuestraReporte(false);
        if(reportesConstanciasDTO.isCancel()){   reportesConstanciasDTO = new ReportesConstanciasDTO();   }
        if((reportesConstanciasDTO.getCiclo() != null) & (reportesConstanciasDTO.getRfcEmpleado() != null)){
            if(reportesConstanciasDTO.getOrigen() == null){
                super.saveError(model, "Seleccione el origen de datos...");
                return super.getViewName("periodoLaborado");
            }
            else {
                if(reportesConstanciasDTO.getOrigen().equalsIgnoreCase("r")){
                    if(reportesConstanciasDTO.getRfcEmpleado().equalsIgnoreCase("")){
                        super.saveError(model, "Seleccione el rfc...");
                        return super.getViewName("periodoLaborado");
                    } else{   
                        reportesConstanciasDTO.setMuestraReporte(true);   
                        logger.debug("***********");}
                }
                else if(reportesConstanciasDTO.getOrigen().equalsIgnoreCase("u")){
                    if(reportesConstanciasDTO.getCiclo() == 0){
                        super.saveError(model, "Seleccione el ciclo...");
                        return super.getViewName("periodoLaborado");
                    }
                    datos = super.getService(MovimientoNominaService.class).periodoLaborado(reportesConstanciasDTO);
                    if (datos.isEmpty()) { super.saveWarning(model, "warn.empty.chkolist"); return super.getViewName("periodoLaborado"); } 
                    else {
                            StringBuilder strCsv = new StringBuilder();
                            for (String renglon: datos) { strCsv.append(renglon).append("\r\n"); }
                            byte[] bytes = strCsv.toString().getBytes();
                            response.setContentType("text/csv");
                            response.setContentLength(bytes.length);
                            response.setHeader("Content-Disposition", "attachment; filename=\"" + "periodosLaborados" + "Reporte.csv");
                            OutputStream out = response.getOutputStream();
                            out.write(bytes, 0, bytes.length);
                            return null;
                          }
                }
            }
        }
        model.addAttribute(reportesConstanciasDTO);
        return super.getViewName("periodoLaborado");
    }
    
    
    @RequestMapping
    public String concentradoVales(Model model, GeneraArchivosTercerosDTO generaArchivosTercerosDTO) {
        if(generaArchivosTercerosDTO.isCancel()){   generaArchivosTercerosDTO = new GeneraArchivosTercerosDTO();   }
        if( (generaArchivosTercerosDTO.getQnaIni()) != null || (generaArchivosTercerosDTO.getDescTercero() != null)){
            if( (generaArchivosTercerosDTO.getImporte() == null) || (generaArchivosTercerosDTO.getDescTercero().equalsIgnoreCase("")) || (generaArchivosTercerosDTO.getQnaIni().equalsIgnoreCase("0")) ){
                generaArchivosTercerosDTO.setMuestraReporte(false);
                generaArchivosTercerosDTO.setMuestraRegistros(false);
                if(generaArchivosTercerosDTO.getImporte() == null){  super.saveError(model, "El importe es campo obligatorio.");  }
                if(generaArchivosTercerosDTO.getDescTercero().equalsIgnoreCase("")){  super.saveError(model, "La leyenda es campo obligatorio.");  }
                if(generaArchivosTercerosDTO.getQnaIni().equalsIgnoreCase("0")){  super.saveError(model, "La quincena inicial es campo obligatorio.");  }
                return super.getViewName("concentradoVales");
            }
            else{
                generaArchivosTercerosDTO.setMuestraRegistros(true);
                generaArchivosTercerosDTO.setBeanName("concentradoVales");
                
                if(generaArchivosTercerosDTO.isMuestraReporte()){
                    StringBuffer stringBuffer = new StringBuffer();
                    
                    if(generaArchivosTercerosDTO.getSeleccionConsecNomina() != null){
                        if(generaArchivosTercerosDTO.getSeleccionConsecNomina().length > 0){
                            //stringBuffer.append("'");
                            for(String consecutivoNomina:generaArchivosTercerosDTO.getSeleccionConsecNomina()){
                                stringBuffer.append(consecutivoNomina); stringBuffer.append(",");
                            }
                            String string = stringBuffer.toString(); string = string.substring(0, (string.length() - 1));
                            generaArchivosTercerosDTO.setHpConsecNomina(string);
                        }
                    }
                    else {
                        generaArchivosTercerosDTO.setMuestraReporte(false);
                        super.saveError(model, "Seleccione las nominas que seran consultadas ... ");
                        return super.getViewName("concentradoVales");
                    }
                }
            }
        }
        model.addAttribute(generaArchivosTercerosDTO);
        return super.getViewName("concentradoVales");
    }
    
    @RequestMapping
    public String pensionadasVales(Model model, GeneraArchivosTercerosDTO generaArchivosTercerosDTO) {
        if(generaArchivosTercerosDTO.isCancel()){   generaArchivosTercerosDTO = new GeneraArchivosTercerosDTO();   }
        if( (generaArchivosTercerosDTO.getQnaIni()) != null || (generaArchivosTercerosDTO.getDescTercero() != null)){
            if( (generaArchivosTercerosDTO.getDescTercero().equalsIgnoreCase("")) || (generaArchivosTercerosDTO.getQnaIni().equalsIgnoreCase("0")) ){
                generaArchivosTercerosDTO.setMuestraReporte(false);
                generaArchivosTercerosDTO.setMuestraRegistros(false);
                if(generaArchivosTercerosDTO.getDescTercero().equalsIgnoreCase("")){  super.saveError(model, "La leyenda es campo obligatorio.");  }
                if(generaArchivosTercerosDTO.getQnaIni().equalsIgnoreCase("0")){  super.saveError(model, "La quincena inicial es campo obligatorio.");  }
                return super.getViewName("pensionadasVales");
            }
            else{
                generaArchivosTercerosDTO.setMuestraRegistros(true);
                generaArchivosTercerosDTO.setBeanName("concentradoVales");
                
                if(generaArchivosTercerosDTO.isMuestraReporte()){
                    StringBuffer stringBuffer = new StringBuffer();
                    
                    if(generaArchivosTercerosDTO.getSeleccionConsecNomina() != null){
                        if(generaArchivosTercerosDTO.getSeleccionConsecNomina().length > 0){
                            //stringBuffer.append("'");
                            for(String consecutivoNomina:generaArchivosTercerosDTO.getSeleccionConsecNomina()){
                                stringBuffer.append(consecutivoNomina); stringBuffer.append(",");
                            }
                            String string = stringBuffer.toString(); string = string.substring(0, (string.length() - 1));
                            generaArchivosTercerosDTO.setHpConsecNomina(string);
                        }
                    }
                    else {
                        generaArchivosTercerosDTO.setMuestraReporte(false);
                        super.saveError(model, "Seleccione las nominas que seran consultadas ... ");
                        return super.getViewName("pensionadasVales");
                    }
                }
            }
        }
        model.addAttribute(generaArchivosTercerosDTO);
        return super.getViewName("pensionadasVales");
    }
    
    @RequestMapping
    public String defNomEjercicio(Model model, GeneraArchivosTercerosDTO generaArchivosTercerosDTO, HttpServletResponse response) throws IOException {
        List<String> datos = null;
        if(generaArchivosTercerosDTO.isCancel()){   generaArchivosTercerosDTO = new GeneraArchivosTercerosDTO();   }
        if(generaArchivosTercerosDTO.getQnaIni() != null){
            if(generaArchivosTercerosDTO.getQnaIni().equalsIgnoreCase("0")){
                super.saveError(model, "Seleccione el ciclo...");
                return super.getViewName("defNomEjercicio");
            }
            else {
                generaArchivosTercerosDTO.setMuestraRegistros(true);
                generaArchivosTercerosDTO.setBeanName("defNomEjercicioG");
                
                if(generaArchivosTercerosDTO.isGeneraArchivo()){
                    datos = super.getService(MovimientoNominaService.class).defNomEjercicio(generaArchivosTercerosDTO.getQnaIni());
                    if(datos.isEmpty()){   super.saveWarning(model, "warn.empty.chkolist"); return super.getViewName("defNomEjercicio");   }
                    else {
                        StringBuilder strCsv = new StringBuilder();
                        for (String renglon: datos) { strCsv.append(renglon).append("\r\n"); }
                        byte[] bytes = strCsv.toString().getBytes();
                        response.setContentType("text/csv");
                        response.setContentLength(bytes.length);
                        response.setHeader("Content-Disposition", "attachment; filename=\"" + "DefinicionNóminasEjercicioReporte" + generaArchivosTercerosDTO.getQnaIni() + ".csv");
                        OutputStream out = response.getOutputStream();
                        out.write(bytes, 0, bytes.length);
                        return null;
                    }
                } 
            }
        }
        model.addAttribute(generaArchivosTercerosDTO);
        return super.getViewName("defNomEjercicio");    
    }
    /**
     * Reporte Impresión de comprobantes para unidad G00.
     * @author Cesar Bautista.
     * Creado para sacar la impresion de la unidad G00
     * @param model Model
     * @param reportesCalculoNominaDTO ReportesCalculoNominaDTO
     * @return String
     */
    @RequestMapping
    public String impresionGoo(Model model, ReportesCalculoNominaDTO reportesCalculoNominaDTO) {
        if (reportesCalculoNominaDTO.isCancel()) {
            reportesCalculoNominaDTO = new ReportesCalculoNominaDTO();
        }

        reportesCalculoNominaDTO.setComplemento(reportesCalculoNominaDTO.getComplemento() == null ? null : reportesCalculoNominaDTO.getComplemento());
        reportesCalculoNominaDTO.setMesQna(reportesCalculoNominaDTO.getMesQna() == null ? "0" : reportesCalculoNominaDTO.getMesQna());
        reportesCalculoNominaDTO.setTipoNomina(reportesCalculoNominaDTO.getTipoNomina() == null ? "0" : reportesCalculoNominaDTO.getTipoNomina());
        reportesCalculoNominaDTO.setSubReport("impresion_sub_subreport1.jasper");

        // Validaciones        
        reportesCalculoNominaDTO.setComplementoRequired(Boolean.TRUE);
        reportesCalculoNominaDTO.setMesQnaRequired(Boolean.TRUE);
        reportesCalculoNominaDTO.setTipoNominaRequired(Boolean.TRUE);

        model.addAttribute(reportesCalculoNominaDTO);
        return super.getViewName("impresionGoo");
    }

    /**
     * Reporte Firmas de la unidad G00.
     * @author Cesar Bautista.
     * Creado para sacar la impresion de la unidad G00
     * @param model Model
     * @param reportesCalculoNominaDTO ReportesCalculoNominaDTO
     * @return String
     */
    @RequestMapping
    public String firmasGoo(Model model, ReportesCalculoNominaDTO reportesCalculoNominaDTO) {
        if (reportesCalculoNominaDTO.isCancel()) {
            reportesCalculoNominaDTO = new ReportesCalculoNominaDTO();
        }

        reportesCalculoNominaDTO.setComplemento(reportesCalculoNominaDTO.getComplemento() == null ? null : reportesCalculoNominaDTO.getComplemento());
        reportesCalculoNominaDTO.setMesQna(reportesCalculoNominaDTO.getMesQna() == null ? "0" : reportesCalculoNominaDTO.getMesQna());
        reportesCalculoNominaDTO.setTipoNomina(reportesCalculoNominaDTO.getTipoNomina() == null ? "0" : reportesCalculoNominaDTO.getTipoNomina());

        // Validaciones        
        reportesCalculoNominaDTO.setComplementoRequired(Boolean.TRUE);
        reportesCalculoNominaDTO.setMesQnaRequired(Boolean.TRUE);
        reportesCalculoNominaDTO.setTipoNominaRequired(Boolean.TRUE);

        model.addAttribute(reportesCalculoNominaDTO);
        return super.getViewName("firmasGoo");
    }
}
