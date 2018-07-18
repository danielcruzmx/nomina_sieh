package gob.shcp.sireh.control.spc.reporte;

import gob.shcp.fsn.control.AbstractController;
import gob.shcp.fsn.control.support.AnnotatedController;



import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class ReporteSpcController extends AbstractController implements AnnotatedController {

    
    @RequestMapping
    public String bajas(Model model) {

        return "";
    }
    
    @RequestMapping
    public String promociones(Model model) {

        return "";
    }
}
