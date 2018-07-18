package gob.shcp.sireh.control.oficinaVirtual;

import gob.shcp.fsn.control.AbstractController;
import gob.shcp.fsn.control.support.AnnotatedController;
import gob.shcp.sireh.model.ItemDTO;
import gob.shcp.sireh.model.oficinaVirtual.PeriodoVacacionalDTO;
import gob.shcp.sireh.service.oficinaVirtual.TramitesService;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class TramitesController extends AbstractController implements AnnotatedController {
    /**
     * Proceso para la Autorizacion de la Solicitud Individual de Vacaciones
     * @author Martin C.
     * @param model Model
     * @param periodoVacacionalDTO PeriodoVacacionalDTO
     * @return String
     */
    @RequestMapping
    public String autIndivVacs(Model model, PeriodoVacacionalDTO periodoVacacionalDTO) {
        if(periodoVacacionalDTO.isCancel()){
            periodoVacacionalDTO = new PeriodoVacacionalDTO();
        }
        else {
            List<ItemDTO> lista = super.getService(TramitesService.class).getStatatusVacaciciones();
        
            periodoVacacionalDTO.setListStatus(lista);
            periodoVacacionalDTO.setBeanName("tdVacaciones-paginador-autorizar");
        }
        periodoVacacionalDTO.setUrlOrigen("autIndivVacs.do");
        
        model.addAttribute(periodoVacacionalDTO);
        return super.getViewName("autorizacionIndividualVacaciones");
    }
    
    /**
     * Proceso para solicitud Individual de Vacaciones
     * @author Martin C.
     * @param model Model
     * @param periodoVacacionalDTO PeriodoVacacionalDTO
     * @return String
     */
    @RequestMapping
    public String solIndivVacs(Model model, PeriodoVacacionalDTO periodoVacacionalDTO) {
        String userName = super.security().getUserName();
        String userRfc = super.identity().get(userName).getRfc().toUpperCase();
        
        logger.debug("*************************USUARIO: " + userRfc);
        
        periodoVacacionalDTO.setRfcEmpleado(userRfc);
        //periodoVacacionalDTO = super.getService(TramitesService.class).getDatosUsuario(rfc);
        periodoVacacionalDTO = super.getService(TramitesService.class).getDatosUsuario("CASM660617U77");
        
        periodoVacacionalDTO.setBeanName("tdVacaciones-paginador-solicitar");
        
        model.addAttribute(periodoVacacionalDTO);
        return super.getViewName("solicitudIndividualVacaciones");
    }
    
    
}
