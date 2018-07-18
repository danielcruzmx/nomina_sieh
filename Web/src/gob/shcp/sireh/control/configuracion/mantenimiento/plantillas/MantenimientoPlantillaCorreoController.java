package gob.shcp.sireh.control.configuracion.mantenimiento.plantillas;

import gob.shcp.fsn.control.AbstractController;
import gob.shcp.fsn.control.support.AnnotatedController;
import gob.shcp.fsn.service.ServiceException;
import gob.shcp.sireh.model.configuracion.mantenimiento.plantillas.EtiquetaDTO;
import gob.shcp.sireh.model.configuracion.mantenimiento.plantillas.PlantillaDTO;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MantenimientoPlantillaCorreoController extends AbstractController implements AnnotatedController  {
    
    @RequestMapping
    public String initListaPlantillaCorreo(Model model) {
        PlantillaDTO plantillaDTO = new PlantillaDTO();
        List<EtiquetaDTO> listaFiles = new ArrayList<EtiquetaDTO>();
        String ruta = super.configuration().getString("correo.template.dir");
        File f = new File(ruta);
        File[] files = f.listFiles();
        
        for (int i = 0; i < files.length; i++) {
            File ff = files[i];
            EtiquetaDTO eitqueta = new EtiquetaDTO(ff.getName());
            listaFiles.add(eitqueta);
        }
        plantillaDTO.setListaFile(listaFiles);
        plantillaDTO.setUrlOrigen("initListaPlantillaCorreo");
        plantillaDTO.setUrlDestino("getFilePlantillaCorreo");
        
        model.addAttribute(plantillaDTO);
        return super.getViewName("initMantoPlantillasCorreo");
    }
    
    @RequestMapping
    public String getFilePlantillaCorreo(Model model, PlantillaDTO plantillaDTO) {
        plantillaDTO.setUrlOrigen("getFilePlantillaCorreo");
        plantillaDTO.setUrlDestino("updateFilePlantillaCorreo");
        
        model.addAttribute(plantillaDTO);
        return super.getViewName("cargaMantoPlantillasCorreo");
    }

    @RequestMapping
    public String updateFilePlantillaCorreo(Model model, PlantillaDTO plantillaDTO) {
        if (plantillaDTO.getFile() == null || 
            !(plantillaDTO.getFile() != null && 
              plantillaDTO.getFile().getName().endsWith("xls") || 
              plantillaDTO.getFile() != null && 
              plantillaDTO.getFile().getName().endsWith("xlsx") || 
              plantillaDTO.getFile() != null && 
              plantillaDTO.getFile().getName().endsWith("xml"))) {
            plantillaDTO.setMensaje(super.configuration().getString("mantenimientoPlantillas", "archivo.no.valido"));
        }
        
        if (plantillaDTO.getEsNuevo()) {
            String ruta = super.configuration().getString("correo.template.dir") + File.separator + plantillaDTO.getFile().getOriginalFilename();
            File file = new File(ruta);
            FileOutputStream fs;
            
            try {
                boolean fCreate = file.createNewFile();
                if (fCreate) {
                    fs = new FileOutputStream(file);
                    byte[] bytes = new byte[1024];
                    int len;
                    InputStream is = plantillaDTO.getFile().getInputStream();
                    len = is.read(bytes);
                    
                    while (len > 0) {
                        fs.write(bytes, 0, len);
                        len = is.read(bytes);
                    }
                    fs.flush();
                    is.close();
                    fs.close();
                }

            } catch (FileNotFoundException e) {
                throw new ServiceException(e.toString(), e);
            } catch (IOException e) {
                throw new ServiceException(e.toString(), e);
            }
        } else {
            String ruta = super.configuration().getString("correo.template.dir") + File.separator + plantillaDTO.getNameFile();
            File file = new File(ruta);
            
            if (file.delete()) {
                file = new File(ruta);
                FileOutputStream fs;
                try {
                    boolean fCreate = file.createNewFile();
                    if (fCreate) {
                        fs = new FileOutputStream(file);
                        byte[] bytes = new byte[1024];
                        int len;
                        InputStream is = 
                            plantillaDTO.getFile().getInputStream();
                        len = is.read(bytes);
                        while (len > 0) {
                            fs.write(bytes, 0, len);
                            len = is.read(bytes);
                        }
                        fs.flush();
                        is.close();
                        fs.close();
                    }
                } catch (FileNotFoundException e) {
                    throw new ServiceException(e.toString(), e);
                } catch (IOException e) {
                    throw new ServiceException(e.toString(), e);
                }
            }
        }
        plantillaDTO.setUrlOrigen("updateFilePlantillaCorreo");
        plantillaDTO.setMensaje(super.configuration().getString("mantenimientoPlantillas", "archivo.cargado.exitosamente"));
        model.addAttribute(plantillaDTO);
        return super.getViewName("resultadoMantoPlantillaCorreo");
    }

    @RequestMapping
    public String eliminarPlantilla(Model model, PlantillaDTO plantillaDTO) {
        List<EtiquetaDTO> listaFiles = new ArrayList<EtiquetaDTO>();
        String ruta = super.configuration().getString("correo.template.dir") + File.separator + plantillaDTO.getNameFile();
        File file = new File(ruta);
        
        if (file.delete()) {
            ruta = super.configuration().getString("correo.template.dir");
            File f = new File(ruta);
            File[] files = f.listFiles();
            
            for (int i = 0; i < files.length; i++) {
                File ff = files[i];
                EtiquetaDTO eitqueta = new EtiquetaDTO(ff.getName());
                listaFiles.add(eitqueta);
            }
            plantillaDTO.setListaFile(listaFiles);
            plantillaDTO.setUrlOrigen("initListaPlantillaCorreo");
            
            plantillaDTO.setUrlDestino("getFilePlantillaCorreo");
            model.addAttribute(plantillaDTO);
        }
        return super.getViewName("initMantoPlantillasCorreo");
    }

    @RequestMapping
    public String altaPlantilla(Model model, PlantillaDTO plantillaDTO) {
        plantillaDTO.setEsNuevo(true);
        plantillaDTO.setUrlOrigen("getFilePlantillaCorreo");
        plantillaDTO.setUrlDestino("updateFilePlantillaCorreo");
        
        model.addAttribute(plantillaDTO);
        return super.getViewName("cargaMantoPlantillasCorreo");
    }
}
