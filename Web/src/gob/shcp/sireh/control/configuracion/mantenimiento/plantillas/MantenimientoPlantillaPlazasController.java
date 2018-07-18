package gob.shcp.sireh.control.configuracion.mantenimiento.plantillas;

import gob.shcp.fsn.control.AbstractController;
import gob.shcp.fsn.control.support.AnnotatedController;

import gob.shcp.fsn.service.ServiceException;

import gob.shcp.sireh.model.configuracion.mantenimiento.plantillas.EtiquetaDTO;
import gob.shcp.sireh.model.configuracion.mantenimiento.plantillas.PlantillaDTO;





import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

import java.io.OutputStream;

import java.util.ArrayList;
import java.util.List;


import javax.servlet.http.HttpServletResponse;

import org.apache.commons.io.FilenameUtils;
import org.apache.commons.io.IOUtils;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MantenimientoPlantillaPlazasController extends AbstractController implements AnnotatedController {

    @RequestMapping
    public String initListaPlantillaPlazas(Model model) {
        PlantillaDTO plantillaDTO = new PlantillaDTO();
        List<EtiquetaDTO> listaFiles = new ArrayList<EtiquetaDTO>();
        String ruta = super.configuration().getString("plazaMasiva.templates.dir");
        File f = new File(ruta);
        File[] files = f.listFiles();
        
        for (int i = 0; i < files.length; i++) {
            File ff = files[i];
            EtiquetaDTO eitqueta = new EtiquetaDTO(ff.getName());
            listaFiles.add(eitqueta);
        }
        plantillaDTO.setListaFile(listaFiles);
        plantillaDTO.setUrlOrigen("initListaPlantillaPlazas");
        plantillaDTO.setUrlDestino("getFilePlantillaPlazas");
        
        model.addAttribute(plantillaDTO);
        return super.getViewName("initMantoPlantillasPlazas");
    }
    
    @RequestMapping
    public String getFilePlantillaPlazas(Model model, PlantillaDTO plantillaDTO) {
        plantillaDTO.setUrlOrigen("getFilePlantillaPlazas");
        plantillaDTO.setUrlDestino("updateFilePlantillaPlazas");

        model.addAttribute(plantillaDTO);
        return super.getViewName("cargaMantoPlantillasPlazas");
    }

    @RequestMapping
    public String updateFilePlantillaPlazas(Model model, PlantillaDTO plantillaDTO) {
        if (plantillaDTO.getFile() == null || 
            !(plantillaDTO.getFile().getOriginalFilename() != null && 
              plantillaDTO.getFile().getOriginalFilename().endsWith("xls") || 
              plantillaDTO.getFile() != null && 
              plantillaDTO.getFile().getOriginalFilename().endsWith("xlsx") || 
              plantillaDTO.getFile() != null && 
              plantillaDTO.getFile().getOriginalFilename().endsWith("xml"))) {
            //plantillaDTO.setMensaje(super.configuration().getString("mantenimientoPlantillas", "archivo.no.valido"));
            super.saveError(model, "error.configuracionyparametrizacion.mantenimientoplantillas.plazas.archivo.invalido");
            model.addAttribute(plantillaDTO);
            return getFilePlantillaPlazas(model, plantillaDTO);
        }
        
        if (plantillaDTO.getEsNuevo()) {
            String ruta = super.configuration().getString("plazaMasiva.templates.dir") + File.separator + plantillaDTO.getFile().getOriginalFilename();
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
            String ruta = super.configuration().getString("plazaMasiva.templates.dir") + File.separator + plantillaDTO.getNameFile();
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
        plantillaDTO.setUrlOrigen("updateFilePlantillaPlazas");
        plantillaDTO.setMensaje(super.configuration().getString("mantenimientoPlantillas", "archivo.cargado.exitosamente"));
        model.addAttribute(plantillaDTO);
        return super.getViewName("resultadoMantoPlantillaPlazas");
    }

    @RequestMapping
    public String eliminarPlantilla(Model model, PlantillaDTO plantillaDTO) {
        List<EtiquetaDTO> listaFiles = new ArrayList<EtiquetaDTO>();
        String ruta = super.configuration().getString("plazaMasiva.templates.dir") + File.separator + plantillaDTO.getNameFile();
        File file = new File(ruta);
        
        if (file.delete()) {
            ruta = super.configuration().getString("plazaMasiva.templates.dir");
            File f = new File(ruta);
            File[] files = f.listFiles();
            
            for (int i = 0; i < files.length; i++) {
                File ff = files[i];
                EtiquetaDTO eitqueta = new EtiquetaDTO(ff.getName());
                listaFiles.add(eitqueta);
            }
            plantillaDTO.setListaFile(listaFiles);
            plantillaDTO.setUrlOrigen("initListaPlantillaPlazas");
            
            plantillaDTO.setUrlDestino("getFilePlantillaPlazas");
            model.addAttribute(plantillaDTO);
        }
        return super.getViewName("initMantoPlantillasPlazas");
    }

    @RequestMapping
    public String altaPlantilla(Model model, PlantillaDTO plantillaDTO) {
        plantillaDTO.setEsNuevo(true);
        plantillaDTO.setUrlOrigen("getFilePlantillaPlazas");
        plantillaDTO.setUrlDestino("updateFilePlantillaPlazas");
        
        model.addAttribute(plantillaDTO);
        return super.getViewName("cargaMantoPlantillasPlazas");
    }

    @RequestMapping
    public String downloadFile(Model model, @RequestParam("nombreArchivoDescarga")
        String nombreArchivoDescarga, HttpServletResponse response) {
        FileInputStream fs = null;
        File f = null;
        String rutaCompletaArchivo = 
            super.configuration().getString("plazaMasiva.templates.dir") + 
            File.separator + nombreArchivoDescarga;

        String ext = FilenameUtils.getExtension(rutaCompletaArchivo);

        try {
            PlantillaDTO plantillaDTO = new PlantillaDTO();
            plantillaDTO.setNameFile(nombreArchivoDescarga);
            plantillaDTO.setRutaFile(rutaCompletaArchivo);
            f = new File(plantillaDTO.getRutaFile());

            if (f.exists()) {
                fs = new FileInputStream(f);
                byte[] bytes = IOUtils.toByteArray(fs);
                response.setContentType("application/" + ext);
                response.setContentLength(bytes.length);
                response.setHeader("Content-Disposition", "attachment; filename=\"" + plantillaDTO.getNameFile() + "\"");
                OutputStream out = response.getOutputStream();
                out.write(bytes, 0, bytes.length);
            }
        } catch (Exception e) {
            logger.debug(e.getMessage());
        } finally {
            try {
                fs.close();
            } catch (IOException e) {
                logger.debug(e.getMessage());
            }
        }
        return null;
    }
}
