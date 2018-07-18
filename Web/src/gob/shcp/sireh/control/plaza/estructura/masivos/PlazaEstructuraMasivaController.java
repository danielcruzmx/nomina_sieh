package gob.shcp.sireh.control.plaza.estructura.masivos;

import gob.shcp.fsn.control.AbstractController;
import gob.shcp.fsn.control.support.AnnotatedController;
import gob.shcp.fsn.service.ServiceException;



import org.springframework.ui.Model;
import gob.shcp.sireh.model.plaza.estructura.masivos.CreacionPlazaMasivaDTO;

import gob.shcp.sireh.service.plaza.estructura.masivos.PlazaEstructuraMasivaService;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;

import java.util.UUID;

import javax.servlet.http.HttpServletResponse;

import org.apache.commons.io.IOUtils;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PlazaEstructuraMasivaController extends AbstractController implements AnnotatedController {
    
    
    @RequestMapping
    public String initCreacion(Model model) {
        CreacionPlazaMasivaDTO creacionPlazaMasivaDTO = new CreacionPlazaMasivaDTO();
        creacionPlazaMasivaDTO.setTipoProceso("CR");
        creacionPlazaMasivaDTO.setUrlOrigen("initCreacion");
        creacionPlazaMasivaDTO.setUrlDestino("validCreacion");
        creacionPlazaMasivaDTO.setInicio(true);
        model.addAttribute(creacionPlazaMasivaDTO);
        return super.getViewName("initPlazaEstructuraMasiva");
    }
    
    @RequestMapping
    public String initConversion(Model model) {
        CreacionPlazaMasivaDTO creacionPlazaMasivaDTO = new CreacionPlazaMasivaDTO();
        creacionPlazaMasivaDTO.setTipoProceso("C");
        creacionPlazaMasivaDTO.setUrlOrigen("initConversion");
        creacionPlazaMasivaDTO.setUrlDestino("validConversion");
        creacionPlazaMasivaDTO.setInicio(true);
        model.addAttribute(creacionPlazaMasivaDTO);
        return super.getViewName("initPlazaEstructuraMasiva");
    }


    @RequestMapping
    public String initReubicacion(Model model) {
        CreacionPlazaMasivaDTO creacionPlazaMasivaDTO = new CreacionPlazaMasivaDTO();
        creacionPlazaMasivaDTO.setTipoProceso("R");
        creacionPlazaMasivaDTO.setUrlOrigen("initReubicacion");
        creacionPlazaMasivaDTO.setUrlDestino("validReubicacion");
        creacionPlazaMasivaDTO.setInicio(true);
        model.addAttribute(creacionPlazaMasivaDTO);
        return super.getViewName("initPlazaEstructuraMasiva");
    }
    
    @RequestMapping
    public String initCancelacion(Model model) {
        CreacionPlazaMasivaDTO creacionPlazaMasivaDTO = new CreacionPlazaMasivaDTO();
        creacionPlazaMasivaDTO.setTipoProceso("CA");
        creacionPlazaMasivaDTO.setUrlOrigen("initCancelacion");
        creacionPlazaMasivaDTO.setUrlDestino("validCancelacion");
        creacionPlazaMasivaDTO.setInicio(true);
        model.addAttribute(creacionPlazaMasivaDTO);
        return super.getViewName("initPlazaEstructuraMasiva");
    }
    
    @RequestMapping
    public String initTransferencia(Model model) {
        CreacionPlazaMasivaDTO creacionPlazaMasivaDTO = new CreacionPlazaMasivaDTO();
        creacionPlazaMasivaDTO.setTipoProceso("TR");
        creacionPlazaMasivaDTO.setUrlOrigen("initTransferencia");
        creacionPlazaMasivaDTO.setUrlDestino("validTransferencia");
        creacionPlazaMasivaDTO.setInicio(true);
        model.addAttribute(creacionPlazaMasivaDTO);
        return super.getViewName("initPlazaEstructuraMasiva");
    }
    
    @RequestMapping
    public String validCreacion(Model model, CreacionPlazaMasivaDTO creacionPlazaMasivaDTO) {
        creacionPlazaMasivaDTO.setUrlOrigen("initCreacion");
        creacionPlazaMasivaDTO.setUrlDestino("processCreacion");
        creacionPlazaMasivaDTO.setInicio(false);
        creacionPlazaMasivaDTO.setTipoProceso("CR");

            String nameFileXls = UUID.randomUUID().toString() + ".xlsx";
            creacionPlazaMasivaDTO.setNombreArchivoErrores(nameFileXls);
            creacionPlazaMasivaDTO = 
                    super.getService(PlazaEstructuraMasivaService.class).processPMFilePlazaEstructuraMasiva(creacionPlazaMasivaDTO);
            if (creacionPlazaMasivaDTO.getPlantillaErronea()) {
                creacionPlazaMasivaDTO.setMensaje(super.configuration().getString("plazaMasivaEstructura", 
                                                                                  "carga.plaza.masiva.estructura.creacion.mensaje.plantilla.erronea") + 
                                                  " " + creacionPlazaMasivaDTO.getMensaje() != null ? creacionPlazaMasivaDTO.getMensaje() : "");
            } else {
                if (creacionPlazaMasivaDTO.getArchivoValido()) {
                    creacionPlazaMasivaDTO.setMensaje(super.configuration().getString("plazaMasivaEstructura", 
                                                                                      "carga.plaza.masiva.estructura.creacion.mensaje.archivo.valido"));
                } else {
                    creacionPlazaMasivaDTO.setMensaje(super.configuration().getString("plazaMasivaEstructura", 
                                                                                      "carga.plaza.masiva.estructura.creacion.mensaje.archivo.invalido"));
                }
            }

        model.addAttribute(creacionPlazaMasivaDTO);
        return super.getViewName("validPlazaEstructuraMasiva");
    }

    @RequestMapping
    public String validConversion(Model model, CreacionPlazaMasivaDTO creacionPlazaMasivaDTO) {
        creacionPlazaMasivaDTO.setUrlOrigen("initConversion");
        creacionPlazaMasivaDTO.setUrlDestino("processConversion");
        creacionPlazaMasivaDTO.setInicio(false);
        try{
          String nameFileXls = UUID.randomUUID().toString() + ".xlsx";
          creacionPlazaMasivaDTO.setNombreArchivoErrores(nameFileXls);
            creacionPlazaMasivaDTO.setTipoProceso("C");
            creacionPlazaMasivaDTO = 
                    super.getService(PlazaEstructuraMasivaService.class).processPMFileConversionReubicacion(creacionPlazaMasivaDTO);
            if (creacionPlazaMasivaDTO.getPlantillaErronea() != null && creacionPlazaMasivaDTO.getPlantillaErronea()) {
                creacionPlazaMasivaDTO.setMensaje(super.configuration().getString("plazaMasivaEstructura", 
                                                                                  "carga.plaza.masiva.estructura.creacion.mensaje.plantilla.erronea"));

            } else {
                if (creacionPlazaMasivaDTO.getArchivoValido()) {
                    creacionPlazaMasivaDTO.setMensaje(super.configuration().getString("plazaMasivaEstructura", 
                                                                                      "carga.plaza.masiva.estructura.creacion.mensaje.archivo.valido"));
                }else{
                creacionPlazaMasivaDTO.setMensaje(super.configuration().getString("plazaMasivaEstructura", 
                                                                                  "carga.plaza.masiva.estructura.creacion.mensaje.archivo.invalido"));
                }
            }


        } catch (ServiceException e) {
          creacionPlazaMasivaDTO.setMensaje(super.configuration().getString("plazaMasivaEstructura", 
                                                                               "jxls.service.cargaPlazaMasivaEstructura"));
          creacionPlazaMasivaDTO.setArchivoValido(false);   
          creacionPlazaMasivaDTO.setNombreArchivoErrores("");
        }
        model.addAttribute(creacionPlazaMasivaDTO);
        return super.getViewName("validPlazaEstructuraMasiva");
    }


    @RequestMapping
    public String validReubicacion(Model model, CreacionPlazaMasivaDTO creacionPlazaMasivaDTO) {
        creacionPlazaMasivaDTO.setUrlOrigen("initReubicacion");
        creacionPlazaMasivaDTO.setUrlDestino("processReubicacion");
        creacionPlazaMasivaDTO.setInicio(false);
        try{
          String nameFileXls = UUID.randomUUID().toString() + ".xlsx";
          creacionPlazaMasivaDTO.setNombreArchivoErrores(nameFileXls);
            creacionPlazaMasivaDTO.setTipoProceso("R");
          creacionPlazaMasivaDTO = super.getService(PlazaEstructuraMasivaService.class).processPMFileConversionReubicacion(creacionPlazaMasivaDTO);
            if (creacionPlazaMasivaDTO.getPlantillaErronea() != null && creacionPlazaMasivaDTO.getPlantillaErronea()) {
                creacionPlazaMasivaDTO.setMensaje(super.configuration().getString("plazaMasivaEstructura", 
                                                                                  "carga.plaza.masiva.estructura.creacion.mensaje.plantilla.erronea"));

            } else {
                if (creacionPlazaMasivaDTO.getArchivoValido()) {
                    creacionPlazaMasivaDTO.setMensaje(super.configuration().getString("plazaMasivaEstructura", 
                                                                                      "carga.plaza.masiva.estructura.creacion.mensaje.archivo.valido"));
                }else{
                creacionPlazaMasivaDTO.setMensaje(super.configuration().getString("plazaMasivaEstructura", 
                                                                                  "carga.plaza.masiva.estructura.creacion.mensaje.archivo.invalido"));
                }
            }
          
            
        } catch (ServiceException e) {
          creacionPlazaMasivaDTO.setMensaje(super.configuration().getString("plazaMasivaEstructura", 
                                                                               "jxls.service.cargaPlazaMasivaEstructura"));
          creacionPlazaMasivaDTO.setArchivoValido(false);   
          creacionPlazaMasivaDTO.setNombreArchivoErrores("");
        }
        model.addAttribute(creacionPlazaMasivaDTO);
        return super.getViewName("validPlazaEstructuraMasiva");
    }
    
    @RequestMapping
    public String validCancelacion(Model model, CreacionPlazaMasivaDTO creacionPlazaMasivaDTO) {
        creacionPlazaMasivaDTO.setUrlOrigen("initCancelacion");
        creacionPlazaMasivaDTO.setUrlDestino("processCancelacion");
        creacionPlazaMasivaDTO.setTipoProceso("CA");
        creacionPlazaMasivaDTO.setInicio(false);
        try{
          String nameFileXls = UUID.randomUUID().toString() + ".xlsx";
          creacionPlazaMasivaDTO.setNombreArchivoErrores(nameFileXls);
          creacionPlazaMasivaDTO = super.getService(PlazaEstructuraMasivaService.class).processPMFilePlazaEstructuraMasivaCancelacion(creacionPlazaMasivaDTO);
          if(creacionPlazaMasivaDTO.getPlantillaErronea()) {
              creacionPlazaMasivaDTO.setMensaje(super.configuration().getString("plazaMasivaEstructura", 
                                                                                 "carga.plaza.masiva.estructura.creacion.mensaje.plantilla.erronea"));
          }
          else {
              if(creacionPlazaMasivaDTO.getArchivoValido()) {
                  creacionPlazaMasivaDTO.setMensaje(super.configuration().getString("plazaMasivaEstructura", 
                                                                                   "carga.plaza.masiva.estructura.creacion.mensaje.archivo.valido"));
              }
              else{
                  creacionPlazaMasivaDTO.setMensaje(super.configuration().getString("plazaMasivaEstructura", 
                                                                                   "carga.plaza.masiva.estructura.creacion.mensaje.archivo.invalido"));
              }
          }
            
      } catch (ServiceException e) {
          creacionPlazaMasivaDTO.setMensaje(super.configuration().getString("plazaMasivaEstructura", 
                                                                               "jxls.service.cargaPlazaMasivaEstructura"));
          creacionPlazaMasivaDTO.setArchivoValido(false);   
          creacionPlazaMasivaDTO.setNombreArchivoErrores("");
      }
        model.addAttribute(creacionPlazaMasivaDTO);
        return super.getViewName("validPlazaEstructuraMasiva");
    }
    
    @RequestMapping
    public String validTransferencia(Model model, CreacionPlazaMasivaDTO creacionPlazaMasivaDTO) {
        creacionPlazaMasivaDTO.setUrlOrigen("initTransferencia");
        creacionPlazaMasivaDTO.setUrlDestino("processTransferencia");
        creacionPlazaMasivaDTO.setInicio(false);
        creacionPlazaMasivaDTO.setTipoProceso("TR");
        try{
          String nameFileXls = UUID.randomUUID().toString() + ".xlsx";
          creacionPlazaMasivaDTO.setNombreArchivoErrores(nameFileXls);
          creacionPlazaMasivaDTO = super.getService(PlazaEstructuraMasivaService.class).processPMFilePlazaEstructuraMasivaTransferencia(creacionPlazaMasivaDTO);
          if(creacionPlazaMasivaDTO.getPlantillaErronea()) {
              creacionPlazaMasivaDTO.setMensaje(super.configuration().getString("plazaMasivaEstructura", 
                                                                                 "carga.plaza.masiva.estructura.creacion.mensaje.plantilla.erronea"));
          }
          else {
              if(creacionPlazaMasivaDTO.getArchivoValido()) {
                  creacionPlazaMasivaDTO.setMensaje(super.configuration().getString("plazaMasivaEstructura", 
                                                                                   "carga.plaza.masiva.estructura.creacion.mensaje.archivo.valido"));
              }
              else{
                  creacionPlazaMasivaDTO.setMensaje(super.configuration().getString("plazaMasivaEstructura", 
                                                                                   "carga.plaza.masiva.estructura.creacion.mensaje.archivo.invalido"));
              }
          }
            
      } catch (ServiceException e) {
          creacionPlazaMasivaDTO.setMensaje(super.configuration().getString("plazaMasivaEstructura", 
                                                                               "jxls.service.cargaPlazaMasivaEstructura"));
          creacionPlazaMasivaDTO.setArchivoValido(false);   
          creacionPlazaMasivaDTO.setNombreArchivoErrores("");
      }
        model.addAttribute(creacionPlazaMasivaDTO);
        return super.getViewName("validPlazaEstructuraMasiva");
    }
    
    @RequestMapping
    public String processCreacion(Model model, CreacionPlazaMasivaDTO creacionPlazaMasivaDTO) {
        try{
           creacionPlazaMasivaDTO.setTipoProceso("CR");
           creacionPlazaMasivaDTO = super.getService(PlazaEstructuraMasivaService.class).updatePMPlazaEstructuraMasiva(creacionPlazaMasivaDTO);
           creacionPlazaMasivaDTO.setMensaje(super.configuration().getString("plazaMasivaEstructura", 
                                                                                "carga.plaza.masiva.estructura.creacion.mensaje.update.exito"));
           model.addAttribute(creacionPlazaMasivaDTO);
       } catch (ServiceException e) {
           creacionPlazaMasivaDTO.setMensaje(super.configuration().getString("plazaMasivaEstructura", 
                                                                                "carga.plaza.masiva.estructura.creacion.mensaje.update.error"));
           model.addAttribute(creacionPlazaMasivaDTO);                                                                                 
       }
        
        return super.getViewName("resultPlazaEstructuraMasiva");
    }

    @RequestMapping
    public String processConversion(Model model, CreacionPlazaMasivaDTO creacionPlazaMasivaDTO) {
        creacionPlazaMasivaDTO.setTipoProceso("C");
        creacionPlazaMasivaDTO = super.getService(PlazaEstructuraMasivaService.class).updatePMConversion(creacionPlazaMasivaDTO);
        model.addAttribute(creacionPlazaMasivaDTO);
        return super.getViewName("resultPlazaEstructuraMasiva");
    }

    @RequestMapping
    public String processReubicacion(Model model, CreacionPlazaMasivaDTO creacionPlazaMasivaDTO) {

        creacionPlazaMasivaDTO.setTipoProceso("R");
        creacionPlazaMasivaDTO = super.getService(PlazaEstructuraMasivaService.class).updatePMReubicacion(creacionPlazaMasivaDTO);
        model.addAttribute(creacionPlazaMasivaDTO);

        return super.getViewName("resultPlazaEstructuraMasiva");
    }

    @RequestMapping
    public String processCancelacion(Model model, CreacionPlazaMasivaDTO creacionPlazaMasivaDTO) {
        try{
           creacionPlazaMasivaDTO.setTipoProceso("CA"); 
           creacionPlazaMasivaDTO = super.getService(PlazaEstructuraMasivaService.class).updatePMPlazaEstructuraMasivaCancelacion(creacionPlazaMasivaDTO);
           creacionPlazaMasivaDTO.setMensaje(super.configuration().getString("plazaMasivaEstructura", 
                                                                                "carga.plaza.masiva.estructura.cancelacion.mensaje.update.exito"));
           model.addAttribute(creacionPlazaMasivaDTO);
       } catch (ServiceException e) {
           creacionPlazaMasivaDTO.setMensaje(super.configuration().getString("plazaMasivaEstructura", 
                                                                                "carga.plaza.masiva.estructura.cancelacion.mensaje.update.error"));
           model.addAttribute(creacionPlazaMasivaDTO);                                                                                 
       }
        
        return super.getViewName("resultPlazaEstructuraMasiva");
    }
    
    @RequestMapping
    public String processTransferencia(Model model, CreacionPlazaMasivaDTO creacionPlazaMasivaDTO) {
        try{
           creacionPlazaMasivaDTO.setTipoProceso("TR"); 
           creacionPlazaMasivaDTO = super.getService(PlazaEstructuraMasivaService.class).updatePMPlazaEstructuraMasivaTransferencia(creacionPlazaMasivaDTO);
           creacionPlazaMasivaDTO.setMensaje(super.configuration().getString("plazaMasivaEstructura", 
                                                                                "carga.plaza.masiva.estructura.transferencia.mensaje.update.exito"));
           model.addAttribute(creacionPlazaMasivaDTO);
       } catch (ServiceException e) {
           creacionPlazaMasivaDTO.setMensaje(super.configuration().getString("plazaMasivaEstructura", 
                                                                                "carga.plaza.masiva.estructura.transferencia.mensaje.update.error"));
           model.addAttribute(creacionPlazaMasivaDTO);                                                                                 
       }
        
        return super.getViewName("resultPlazaEstructuraMasiva");
    }
    
    
    @RequestMapping
    public String downloadFile(Model model,  @RequestParam("nombreArchivoErrores") String nombreArchivoErrores,  
                               HttpServletResponse response) {
        FileInputStream fs = null;
        File f = null;
        String nombreArchivoXls = 
            super.configuration().getString("local.temp.dir") + 
            File.separator + nombreArchivoErrores;
            
        try {
            
             CreacionPlazaMasivaDTO creacionPlazaMasivaDTO = new CreacionPlazaMasivaDTO();
            creacionPlazaMasivaDTO.setNombreArchivoErrores(nombreArchivoErrores);
            creacionPlazaMasivaDTO.setRutaArchivoErrores(nombreArchivoXls);
            f = new File(creacionPlazaMasivaDTO.getRutaArchivoErrores());
            if (f.exists()) {
                fs = new FileInputStream(f);
                byte[] bytes = IOUtils.toByteArray(fs);
                response.setContentType("application/xls");
                response.setContentLength(bytes.length);
                response.setHeader("Content-Disposition", 
                                   "attachment; filename=\"" + 
                                   creacionPlazaMasivaDTO.getNombreArchivoErrores()+"\"");
                OutputStream out = response.getOutputStream();
                out.write(bytes, 0, bytes.length);
            }

        } catch (Exception e) {

        } finally {
        try{
             fs.close();
        } catch(IOException e){
            
            }
        }

        return null;
    }
}
