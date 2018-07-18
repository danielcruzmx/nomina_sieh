package gob.shcp.sireh.control.plaza.honorarios;

import gob.shcp.fsn.control.AbstractController;
import gob.shcp.fsn.control.support.AnnotatedController;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PlazaHonorariosMasivosController extends AbstractController implements AnnotatedController {
    
    @RequestMapping
    public String creacion(Model model) {
        return super.getViewName("creacion");
    }
    @RequestMapping
    public String altas(Model model) {
        return super.getViewName("altas");
    }
    @RequestMapping
    public String bajas(Model model) {
        return super.getViewName("bajas");
    }
    @RequestMapping
    public String promociones(Model model) {
        return super.getViewName("promociones");
    }
    @RequestMapping
    public String cambiosAdscripcion(Model model) {
        return super.getViewName("cambiosAdscripcion");
    }
    @RequestMapping
    public String prorrogaContrato(Model model) {
        return super.getViewName("prorrogaContrato");
    }
	
   
}