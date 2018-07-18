package gob.shcp.sireh.control.configuracion.mantenimiento.plantillas;

import gob.shcp.fsn.control.AbstractController;
import gob.shcp.fsn.control.support.AnnotatedController;

import gob.shcp.sireh.model.SelectStringDTO;
import gob.shcp.sireh.model.configuracion.mantenimiento.plantillas.DatosPlantillaDTO;

import gob.shcp.sireh.service.configuracion.mantenimiento.MantenimientoPlantillasService;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MantenimientoPlantillasController extends AbstractController implements AnnotatedController {
    @RequestMapping
    public String mantoPlantillas(Model model, DatosPlantillaDTO datosPlantillaDTO) {
        List<SelectStringDTO> listaPlantillas = super.getService(MantenimientoPlantillasService.class).getListaPlantillas();
        datosPlantillaDTO.setListaPlantillas(listaPlantillas);
        
        model.addAttribute(datosPlantillaDTO);
        return super.getViewName("mantoPlantillas");
    }

    @RequestMapping
    public String crearPlantillas(Model model, DatosPlantillaDTO datosPlantillaDTO) {
        List<SelectStringDTO> listaTipos = super.getService(MantenimientoPlantillasService.class).getListaTipos();
        datosPlantillaDTO.setListaTipos(listaTipos);
        
        model.addAttribute(datosPlantillaDTO);
        return super.getViewName("crearPlantillas");
    }

    @RequestMapping
    public String editarPlantillas(Model model, DatosPlantillaDTO datosPlantillaDTO, @RequestParam("plantilla") String plantilla) {
        datosPlantillaDTO = super.getService(MantenimientoPlantillasService.class).getDatosPlantilla(plantilla);
        List<SelectStringDTO> listaTipos = super.getService(MantenimientoPlantillasService.class).getListaTipos();

        datosPlantillaDTO.setListaTipos(listaTipos);
        model.addAttribute(datosPlantillaDTO);
        return super.getViewName("editarPlantillas");
    }

    @RequestMapping
    public String eliminarPlantillas(Model model, DatosPlantillaDTO datosPlantillaDTO) {
        super.getService(MantenimientoPlantillasService.class).delete(datosPlantillaDTO);
        List<SelectStringDTO> listaPlantillas = super.getService(MantenimientoPlantillasService.class).getListaPlantillas();
        datosPlantillaDTO.setListaPlantillas(listaPlantillas);
        
        model.addAttribute(datosPlantillaDTO);
        return super.getViewName("mantoPlantillas");
    }

    @RequestMapping
    public String savePlantillas(Model model, DatosPlantillaDTO datosPlantillaDTO) {
        super.getService(MantenimientoPlantillasService.class).create(datosPlantillaDTO);
        List<SelectStringDTO> listaPlantillas = super.getService(MantenimientoPlantillasService.class).getListaPlantillas();
        datosPlantillaDTO.setListaPlantillas(listaPlantillas);
        
        model.addAttribute(datosPlantillaDTO);
        return super.getViewName("mantoPlantillas");
    }

    @RequestMapping
    public String updatePlantillas(Model model, DatosPlantillaDTO datosPlantillaDTO) {
        super.getService(MantenimientoPlantillasService.class).update(datosPlantillaDTO);
        super.saveMessage(model, "configuracion.plantillas,update.ok");
        datosPlantillaDTO = super.getService(MantenimientoPlantillasService.class).getDatosPlantilla(datosPlantillaDTO.getNomPlantilla());
        List<SelectStringDTO> listaTipos = super.getService(MantenimientoPlantillasService.class).getListaTipos();
        datosPlantillaDTO.setListaTipos(listaTipos);
        
        model.addAttribute(datosPlantillaDTO);
        return super.getViewName("editarPlantillas");
    }
}