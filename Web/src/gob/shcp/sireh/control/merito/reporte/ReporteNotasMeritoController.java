package gob.shcp.sireh.control.merito.reporte;

import gob.shcp.fsn.control.AbstractController;
import gob.shcp.fsn.control.support.AnnotatedController;

import gob.shcp.sireh.model.merito.reporte.ReporteNotasDeMeritoDTO;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ReporteNotasMeritoController extends AbstractController implements AnnotatedController {

    @RequestMapping
    public String repHistoNM(Model model, ReporteNotasDeMeritoDTO reporteNotasDeMeritoDTOl) {
        if (reporteNotasDeMeritoDTOl.isCancel()) {
            reporteNotasDeMeritoDTOl = new ReporteNotasDeMeritoDTO();
        }
        // Validaciones
        reporteNotasDeMeritoDTOl.setUniCicloRequired(Boolean.TRUE);

        model.addAttribute(reporteNotasDeMeritoDTOl);
        return super.getViewName("repHistoNM");
    }

    @RequestMapping
    public String repNMPersonalAct(Model model, ReporteNotasDeMeritoDTO reporteNotasDeMeritoDTOl) {
        if (reporteNotasDeMeritoDTOl.isCancel()) {
            reporteNotasDeMeritoDTOl = new ReporteNotasDeMeritoDTO();
        }

        reporteNotasDeMeritoDTOl.setRfcEmpleado(reporteNotasDeMeritoDTOl.getRfcEmpleado() == null ? null : reporteNotasDeMeritoDTOl.getRfcEmpleado());

        model.addAttribute(reporteNotasDeMeritoDTOl);
        return super.getViewName("repNMPersonalAct");
    }

    @RequestMapping
    public String repNMEmpleado(Model model, ReporteNotasDeMeritoDTO reporteNotasDeMeritoDTOl) {
        if (reporteNotasDeMeritoDTOl.isCancel()) {
            reporteNotasDeMeritoDTOl = new ReporteNotasDeMeritoDTO();
        }
        // Validaciones
        reporteNotasDeMeritoDTOl.setRfcRequired(Boolean.TRUE);

        model.addAttribute(reporteNotasDeMeritoDTOl);
        return super.getViewName("repNMEmpleado");
    }

    @RequestMapping
    public String repNMGenero(Model model, ReporteNotasDeMeritoDTO reporteNotasDeMeritoDTOl) {
        if (reporteNotasDeMeritoDTOl.isCancel()) {
            reporteNotasDeMeritoDTOl = new ReporteNotasDeMeritoDTO();
        }
        // Validaciones
        reporteNotasDeMeritoDTOl.setUniCicloRequired(Boolean.TRUE);

        model.addAttribute(reporteNotasDeMeritoDTOl);
        return super.getViewName("repNMGenero");
    }

    @RequestMapping
    public String repNMMensual(Model model, ReporteNotasDeMeritoDTO reporteNotasDeMeritoDTOl) {
        if (reporteNotasDeMeritoDTOl.isCancel()) {
            reporteNotasDeMeritoDTOl = new ReporteNotasDeMeritoDTO();
        }

        reporteNotasDeMeritoDTOl.setFecInicio(reporteNotasDeMeritoDTOl.getFecInicio() == null ? null : reporteNotasDeMeritoDTOl.getFecInicio());
        reporteNotasDeMeritoDTOl.setFecFin(reporteNotasDeMeritoDTOl.getFecFin() == null ? null : reporteNotasDeMeritoDTOl.getFecFin());

        // Validaciones
        reporteNotasDeMeritoDTOl.setFecInicioRequired(Boolean.TRUE);
        reporteNotasDeMeritoDTOl.setFecFinRequired(Boolean.TRUE);

        model.addAttribute(reporteNotasDeMeritoDTOl);
        return super.getViewName("repNMMensual");
    }

    @RequestMapping
    public String repPagosSoliRemesa(Model model, ReporteNotasDeMeritoDTO reporteNotasDeMeritoDTOl) {
        if (reporteNotasDeMeritoDTOl.isCancel()) {
            reporteNotasDeMeritoDTOl = new ReporteNotasDeMeritoDTO();
        }

        reporteNotasDeMeritoDTOl.setUniCiclo(reporteNotasDeMeritoDTOl.getUniCiclo() == null ? "0" : reporteNotasDeMeritoDTOl.getUniCiclo());
        reporteNotasDeMeritoDTOl.setRemesa(reporteNotasDeMeritoDTOl.getRemesa() == null ? "0" : reporteNotasDeMeritoDTOl.getRemesa());
        reporteNotasDeMeritoDTOl.setRemesa2(reporteNotasDeMeritoDTOl.getRemesa2() == null ? "0" : reporteNotasDeMeritoDTOl.getRemesa2());

        // Validaciones
        reporteNotasDeMeritoDTOl.setUniCicloRequired(Boolean.TRUE);
        reporteNotasDeMeritoDTOl.setRemesaRequired(Boolean.TRUE);
        reporteNotasDeMeritoDTOl.setRemesa2Required(Boolean.TRUE);

        model.addAttribute(reporteNotasDeMeritoDTOl);
        return super.getViewName("repPagosSoliRemesa");
    }

    @RequestMapping
    public String repImprimirNM(Model model, ReporteNotasDeMeritoDTO reporteNotasDeMeritoDTOl) {
        if (reporteNotasDeMeritoDTOl.isCancel()) {
            reporteNotasDeMeritoDTOl = new ReporteNotasDeMeritoDTO();
        }

        reporteNotasDeMeritoDTOl.setUniCiclo(reporteNotasDeMeritoDTOl.getUniCiclo() == null ? "0" : reporteNotasDeMeritoDTOl.getUniCiclo());
        reporteNotasDeMeritoDTOl.setRemesa(reporteNotasDeMeritoDTOl.getRemesa() == null ? "0" : reporteNotasDeMeritoDTOl.getRemesa());
        reporteNotasDeMeritoDTOl.setCveCausal(reporteNotasDeMeritoDTOl.getCveCausal() == null ? "0" : reporteNotasDeMeritoDTOl.getCveCausal());

        // Validaciones
        reporteNotasDeMeritoDTOl.setUniCicloRequired(Boolean.TRUE);
        reporteNotasDeMeritoDTOl.setRemesaRequired(Boolean.TRUE);
        reporteNotasDeMeritoDTOl.setCveCausalRequired(Boolean.TRUE);

        model.addAttribute(reporteNotasDeMeritoDTOl);
        return super.getViewName("repImprimirNM");
    }
}
