package gob.shcp.sireh.control.configuracion.movimiento;

import gob.shcp.fsn.control.AbstractController;
import gob.shcp.fsn.control.support.AnnotatedController;


import gob.shcp.sireh.model.configuracion.movimientos.MovimientoPersonalDTO;

import gob.shcp.sireh.service.configuracion.movimiento.MovimientoPersonalService;

import java.util.ArrayList;

import java.util.List;
import java.util.Arrays;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class MovimientoPersonalController extends AbstractController implements AnnotatedController  {

    @RequestMapping
    public String consultaMovimiento(Model model, MovimientoPersonalDTO movimientoPersonalDTO) {
        movimientoPersonalDTO.setUrlOrigen("consultaMovimiento");
        movimientoPersonalDTO.setUrlDestino("editarMovimientoPersonal");
        movimientoPersonalDTO.setUrlNuevo("nuevoMovimientoPersonal");
        movimientoPersonalDTO.inicializaListas();
        model.addAttribute(movimientoPersonalDTO);
        return super.getViewName("movimientoPersonal");
    }
    
    @RequestMapping
    public String nuevoMovimientoPersonal(Model model) {
        MovimientoPersonalDTO movimientoPersonalDTO = new MovimientoPersonalDTO();
        movimientoPersonalDTO.inicializaListas();
        model.addAttribute(movimientoPersonalDTO);
        return super.getViewName("nuevoMovimientoPersonal");
    }
    
    @RequestMapping
    public String insertMovimientoPersonal(Model model, MovimientoPersonalDTO movimientoPersonalDTO) {
        String view="movimientoPersonal";
        MovimientoPersonalDTO movimientoPersonalDTOExistente = super.getService(MovimientoPersonalService.class).getMovimientoPersonal(movimientoPersonalDTO.getIdMovsPersonal());
        if(movimientoPersonalDTOExistente!=null) {
            super.saveError(model, "sireh.label.configuracion.movimientos.personal.error.idExistente");
            view = "nuevoMovimientoPersonal";
            movimientoPersonalDTO.inicializaListas();
            movimientoPersonalDTO.setUrlOrigen("consultaMovimiento");
            model.addAttribute(movimientoPersonalDTO);
        }
        else {
            movimientoPersonalDTO.setMpGrupoPago(movimientoPersonalDTO.getMpGrupoPago().replace(",","|"));
            movimientoPersonalDTO.setMpJerarquia(movimientoPersonalDTO.getMpJerarquia().replace(",","|"));
            movimientoPersonalDTO.setMpNombramiento(movimientoPersonalDTO.getMpNombramiento().replace(",", "|"));
            super.getService(MovimientoPersonalService.class).updateMovimientoPersonal(movimientoPersonalDTO, super.identity().get().getUserID());
            movimientoPersonalDTO = new MovimientoPersonalDTO();
            movimientoPersonalDTO.inicializaListas();
            movimientoPersonalDTO.setUrlOrigen("consultaMovimiento");
            movimientoPersonalDTO.setUrlDestino("editarMovimientoPersonal");
            model.addAttribute(movimientoPersonalDTO);
        }
        return super.getViewName(view);
       
    }
    
    @RequestMapping
    public String updateMovimientoPersonal(Model model, 
                                           MovimientoPersonalDTO movimientoPersonalDTO) {
        String view = "movimientoPersonal";        
        movimientoPersonalDTO.setMpGrupoPago(getStringSepareComas(movimientoPersonalDTO.getIdsGrupoPago()));
        movimientoPersonalDTO.setMpNombramiento(getStringSepareComas(movimientoPersonalDTO.getIdsNombramiento()));
        movimientoPersonalDTO.setMpJerarquia(getStringSepareComas(movimientoPersonalDTO.getIdsJerarquia()));
        super.getService(MovimientoPersonalService.class).updateMovimientoPersonal(movimientoPersonalDTO, 
                                                                                   super.identity().get().getUserID());

        super.saveMessage( model, "sireh.label.configuracion.movimientos.personal.modificacion.ok", movimientoPersonalDTO.getIdMovsPersonal() );

        movimientoPersonalDTO = new MovimientoPersonalDTO();
        movimientoPersonalDTO.inicializaListas();
        movimientoPersonalDTO.setUrlOrigen("consultaMovimiento");
        movimientoPersonalDTO.setUrlDestino("editarMovimientoPersonal");
        model.addAttribute(movimientoPersonalDTO);
        return super.getViewName(view);

    }
    
    private String getStringSepareComas(List<String> lista) {
        StringBuffer buffer = new StringBuffer();
        for(String s: lista) {
            buffer.append(s + "|");
        }
        buffer.delete(buffer.length()-1,buffer.length());
        return buffer.toString();
    }
    
    @RequestMapping
    public String cancelarMovimientoPersonal(Model model) {
        MovimientoPersonalDTO movimientoPersonalDTO = new MovimientoPersonalDTO();
        movimientoPersonalDTO.inicializaListas();
        movimientoPersonalDTO.setUrlOrigen("consultaMovimiento");
        movimientoPersonalDTO.setUrlDestino("editarMovimientoPersonal");
        model.addAttribute(movimientoPersonalDTO);
        return super.getViewName("movimientoPersonal");
    }
    
    @RequestMapping
    public String editarMovimientoPersonal(Model model, @RequestParam("idMovsPersonal") int idMovsPersonal) {
        MovimientoPersonalDTO movimientoPersonalDTO = super.getService(MovimientoPersonalService.class).getMovimientoPersonal(idMovsPersonal);
        movimientoPersonalDTO.inicializaListas();
        
        if (movimientoPersonalDTO.getMpGrupoPago()!=null) {
            movimientoPersonalDTO.setMpGrupoPago(movimientoPersonalDTO.getMpGrupoPago().replace("|",","));
            List<String> elementosGrupoPago = new ArrayList<String>(Arrays.asList(movimientoPersonalDTO.getMpGrupoPago().split(",")));
            movimientoPersonalDTO.setIdsGrupoPago(elementosGrupoPago);    
        } else {
            movimientoPersonalDTO.setIdsGrupoPago(new ArrayList());
        }
        
        if (movimientoPersonalDTO.getMpNombramiento()!=null) {
            movimientoPersonalDTO.setMpNombramiento(movimientoPersonalDTO.getMpNombramiento().replace("|",","));
            List<String> elementosNombramiento = new ArrayList<String>(Arrays.asList(movimientoPersonalDTO.getMpNombramiento().split(",")));
            movimientoPersonalDTO.setIdsNombramiento(elementosNombramiento);  
        } else {
            movimientoPersonalDTO.setIdsNombramiento(new ArrayList());  
        }
        
        if (movimientoPersonalDTO.getMpJerarquia()!=null) {
            movimientoPersonalDTO.setMpJerarquia(movimientoPersonalDTO.getMpJerarquia().replace("|",","));
            List<String> elementosJerarquia= new ArrayList<String>(Arrays.asList(movimientoPersonalDTO.getMpJerarquia().split(",")));
            movimientoPersonalDTO.setIdsJerarquia(elementosJerarquia);    
        } else {
            movimientoPersonalDTO.setIdsJerarquia(new ArrayList());
        }
        
        model.addAttribute(movimientoPersonalDTO);
        return super.getViewName("editarMovimientoPersonal");
    }
    
    
}
