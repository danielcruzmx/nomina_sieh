package gob.shcp.sireh.control.nomina.movimientos;

import gob.shcp.fsn.control.AbstractController;
import gob.shcp.fsn.control.support.AnnotatedController;

import gob.shcp.sireh.model.nomina.ConsultaEmpleadoDTO;
import gob.shcp.sireh.model.nomina.incidencias.GestionIncidenciasPersonalDTO;

import gob.shcp.sireh.service.nomina.movimientos.MovimientoNominaService;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class IncidenciasNominaController extends AbstractController implements AnnotatedController {

    @RequestMapping
    public String faltaDev(Model model) {
        return super.getViewName("faltaDev");
    }

    @RequestMapping
    public String gestionLicenciasMedicas(Model model, ConsultaEmpleadoDTO consultaEmpleadoDTO) {
        if (consultaEmpleadoDTO.isCancel()) {
            consultaEmpleadoDTO = new ConsultaEmpleadoDTO();
        }
        consultaEmpleadoDTO.setUrlController("incidenciasNomina");
        consultaEmpleadoDTO.setUrlOrigen("gestionLicenciasMedicas");
        consultaEmpleadoDTO.setUrlDestino("getIncidenciasMedicas");
        consultaEmpleadoDTO.setMenuTitle("Licencias médicas");
        consultaEmpleadoDTO.setNombrePantalla("incidenciaNomina");
        model.addAttribute(consultaEmpleadoDTO);
        return super.getViewName("consultaEmpleados");
    }

    @RequestMapping
    public String getIncidenciasMedicas(Model model, @RequestParam("rfcEmpleado") String rfcEmpleado) {
        GestionIncidenciasPersonalDTO gestionIncidenciasPersonalDTO = new GestionIncidenciasPersonalDTO();
        gestionIncidenciasPersonalDTO.setTipoIncidencia("L");
        gestionIncidenciasPersonalDTO.setRfcEmpleado(rfcEmpleado);
        gestionIncidenciasPersonalDTO = super.getService(MovimientoNominaService.class).getIncidenciasPersonal(gestionIncidenciasPersonalDTO);
        model.addAttribute(gestionIncidenciasPersonalDTO);
        return super.getViewName("cambioIncidenciasPersonal");
    }

    @RequestMapping
    public String getIncidenciasPersonalButton(Model model, GestionIncidenciasPersonalDTO gestionIncidenciasPersonalDTO) {
        gestionIncidenciasPersonalDTO = super.getService(MovimientoNominaService.class).getIncidenciasPersonal(gestionIncidenciasPersonalDTO);
        model.addAttribute(gestionIncidenciasPersonalDTO);
        return super.getViewName("cambioIncidenciasPersonal");
    }

    @RequestMapping
    public String updateIncidencias(Model model, GestionIncidenciasPersonalDTO gestionIncidenciasPersonalDTO) {
        super.getService(MovimientoNominaService.class).updateIncidenciasPersonal(gestionIncidenciasPersonalDTO);
        if (gestionIncidenciasPersonalDTO.getTipoIncidencia() != null && gestionIncidenciasPersonalDTO.getTipoIncidencia().equals("L")) {
            super.saveMessage(model, "nomina.updateIncidencias.ok");
            model.addAttribute(gestionIncidenciasPersonalDTO);
            return gestionLicenciasMedicas(model, new ConsultaEmpleadoDTO());
        } else if (gestionIncidenciasPersonalDTO.getTipoIncidencia() != null && gestionIncidenciasPersonalDTO.getTipoIncidencia().equals("F")) {
            super.saveMessage(model, "nomina.updateFaltas.ok");
            model.addAttribute(gestionIncidenciasPersonalDTO);
            return gestionFaltas(model, new ConsultaEmpleadoDTO());
        } else if (gestionIncidenciasPersonalDTO.getTipoIncidencia() != null && gestionIncidenciasPersonalDTO.getTipoIncidencia().equals("D")) {
            super.saveMessage(model, "nomina.updateDiasEconomicos.ok");
            model.addAttribute(gestionIncidenciasPersonalDTO);
            return gestionDiasEconomicos(model, new ConsultaEmpleadoDTO());
        }
        return "";
    }

    @RequestMapping
    public String addIncidencia(Model model, GestionIncidenciasPersonalDTO gestionIncidenciasPersonalDTO) {
        super.getService(MovimientoNominaService.class).addIncidenciaPersonal(gestionIncidenciasPersonalDTO);
        model.addAttribute(gestionIncidenciasPersonalDTO);
        return getIncidenciasPersonalButton(model, gestionIncidenciasPersonalDTO);
    }

    @RequestMapping
    public String deleteIncidencias(Model model, GestionIncidenciasPersonalDTO gestionIncidenciasPersonalDTO) {
        Long[] ids = gestionIncidenciasPersonalDTO.getIdMovimientos();
        // Enviar a borrar id's seleccionadas
        if (ids != null && ids.length > 0) {
            super.getService(MovimientoNominaService.class).deleteIncidenciasPersonal(gestionIncidenciasPersonalDTO.getListaIncidenciasPersonal(), 
                                                                                      gestionIncidenciasPersonalDTO.getTipoIncidencia(), 
                                                                                      ids);
        }
        model.addAttribute(gestionIncidenciasPersonalDTO);
        return getIncidenciasPersonalButton(model, gestionIncidenciasPersonalDTO);
    }

    @RequestMapping
    public String calcularIncidencias(Model model, GestionIncidenciasPersonalDTO gestionIncidenciasPersonalDTO) {
        super.getService(MovimientoNominaService.class).calcularIncidenciasPersonal(gestionIncidenciasPersonalDTO);
        model.addAttribute(gestionIncidenciasPersonalDTO);
        return getIncidenciasPersonalButton(model, gestionIncidenciasPersonalDTO);
    }

    @RequestMapping
    public String gestionFaltas(Model model, ConsultaEmpleadoDTO consultaEmpleadoDTO) {
        if (consultaEmpleadoDTO.isCancel()) {
            consultaEmpleadoDTO = new ConsultaEmpleadoDTO();
        }
        consultaEmpleadoDTO.setUrlController("incidenciasNomina");
        consultaEmpleadoDTO.setUrlOrigen("gestionFaltas");
        consultaEmpleadoDTO.setUrlDestino("getFaltas");
        consultaEmpleadoDTO.setMenuTitle("Faltas");
        consultaEmpleadoDTO.setNombrePantalla("incidenciaNomina");
        model.addAttribute(consultaEmpleadoDTO);
        return super.getViewName("consultaEmpleados");
    }

    public String getFaltasEmpleadoButton(Model model, GestionIncidenciasPersonalDTO gestionIncidenciasPersonalDTO) {
        gestionIncidenciasPersonalDTO = super.getService(MovimientoNominaService.class).getIncidenciasPersonal(gestionIncidenciasPersonalDTO);
        model.addAttribute(gestionIncidenciasPersonalDTO);
        return super.getViewName("cambioIncidenciasMedicas");
    }

    @RequestMapping
    public String getFaltas(Model model, @RequestParam("rfcEmpleado")
        String rfcEmpleado) {
        GestionIncidenciasPersonalDTO gestionIncidenciasPersonalDTO = new GestionIncidenciasPersonalDTO();
        gestionIncidenciasPersonalDTO.setRfcEmpleado(rfcEmpleado);
        gestionIncidenciasPersonalDTO.setTipoIncidencia("F");
        gestionIncidenciasPersonalDTO = super.getService(MovimientoNominaService.class).getIncidenciasPersonal(gestionIncidenciasPersonalDTO);
        model.addAttribute(gestionIncidenciasPersonalDTO);
        return super.getViewName("cambioIncidenciasPersonal");
    }
    
    @RequestMapping
    public String diaEco(Model model) {
        return super.getViewName("diaEco");
    }
    
    @RequestMapping
    public String gestionDiasEconomicos(Model model, ConsultaEmpleadoDTO consultaEmpleadoDTO) {
        if (consultaEmpleadoDTO.isCancel()) {
            consultaEmpleadoDTO = new ConsultaEmpleadoDTO();
        }
        consultaEmpleadoDTO.setUrlController("incidenciasNomina");
        consultaEmpleadoDTO.setUrlOrigen("gestionDiasEconomicos");
        consultaEmpleadoDTO.setUrlDestino("getDiasEconomicos");
        consultaEmpleadoDTO.setMenuTitle("Días económicos");
        consultaEmpleadoDTO.setNombrePantalla("incidenciaNomina");
        model.addAttribute(consultaEmpleadoDTO);
        return super.getViewName("consultaEmpleados");
    }

    @RequestMapping
    public String getDiasEconomicos(Model model, @RequestParam("rfcEmpleado")
        String rfcEmpleado) {
        GestionIncidenciasPersonalDTO gestionIncidenciasPersonalDTO = new GestionIncidenciasPersonalDTO();
        gestionIncidenciasPersonalDTO.setTipoIncidencia("D");
        gestionIncidenciasPersonalDTO.setRfcEmpleado(rfcEmpleado);
        gestionIncidenciasPersonalDTO = super.getService(MovimientoNominaService.class).getIncidenciasPersonal(gestionIncidenciasPersonalDTO);
        model.addAttribute(gestionIncidenciasPersonalDTO);
        return super.getViewName("cambioIncidenciasPersonal");
    }
}
