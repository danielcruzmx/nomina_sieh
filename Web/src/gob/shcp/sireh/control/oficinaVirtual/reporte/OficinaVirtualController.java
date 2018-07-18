package gob.shcp.sireh.control.oficinaVirtual.reporte;

import gob.shcp.fsn.control.AbstractController;
import gob.shcp.fsn.control.support.AnnotatedController;
import gob.shcp.sireh.model.expediente.gestion.documentos.ExpedienteDocEmpleadoDTO;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class OficinaVirtualController extends AbstractController implements AnnotatedController{

    @RequestMapping
    public String gestionDoctosExpediente(Model model, ExpedienteDocEmpleadoDTO expedienteDocEmpleadoDTO) {

        if (expedienteDocEmpleadoDTO.isCancel()) {
            expedienteDocEmpleadoDTO = new ExpedienteDocEmpleadoDTO();
        }
        if (expedienteDocEmpleadoDTO.isMuestraRegistros()) {
        if (expedienteDocEmpleadoDTO.getIdDocto().equalsIgnoreCase("0")) {
            super.saveError(model, "Error: Debe seleccionar Documento");
            expedienteDocEmpleadoDTO.setMuestraRegistros(false);
        } else {
        if (expedienteDocEmpleadoDTO.getUnidad() == null && 
            expedienteDocEmpleadoDTO.getRfcEmpleado() == null) {
            super.saveError(model, "Error: Debe seleccionar una unidad o un Rfc");
            expedienteDocEmpleadoDTO.setMuestraRegistros(false);
            }
        }    
        }
        model.addAttribute(expedienteDocEmpleadoDTO);
        return super.getViewName("gestionDoctosExpediente");
    
    }
    
}
