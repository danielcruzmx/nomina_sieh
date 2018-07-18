package gob.shcp.sireh.control.nomina.terceros.enteros;

import gob.shcp.fsn.control.AbstractController;
import gob.shcp.fsn.control.support.AnnotatedController;

import gob.shcp.sireh.model.SelectStringDTO;
import gob.shcp.sireh.model.TnHistoricoPagoDTO;
import gob.shcp.sireh.model.nomina.calculo.GeneracionCecobanDTO;
import gob.shcp.sireh.model.nomina.terceros.CargaArchivoDTO;

import gob.shcp.sireh.model.nomina.terceros.ReportesTercerosDTO;
import gob.shcp.sireh.model.nomina.terceros.enteros.EnterosDTO;
import gob.shcp.sireh.model.nomina.terceros.enteros.GenerarEnteroDTO;

import gob.shcp.sireh.service.nomina.terceros.enteros.EnterosNominaService;
import gob.shcp.sireh.service.nomina.terceros.TercerosNominaService;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import org.apache.commons.io.IOUtils;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EnterosNominaController extends AbstractController implements AnnotatedController {
  
    @RequestMapping
    public String generacionEnteros(Model model,GenerarEnteroDTO generarEnteroDTO) {
        model.addAttribute(new GenerarEnteroDTO());
        return super.getViewName("cargarEnteros");
    }  
    
    @RequestMapping
    public String cargarComplementos(Model model,GenerarEnteroDTO generarEnteroDTO) {
        if (generarEnteroDTO.getTipoNomina()!= null && !generarEnteroDTO.getTipoNomina().equals("0")  && 
             generarEnteroDTO.getQnaPago() != null && ! generarEnteroDTO.getQnaPago().equals("0")) {
            List<TnHistoricoPagoDTO> lista=null;
             if(generarEnteroDTO.getTipoNomina().equalsIgnoreCase(super.configuration().getString("enteros", "ORDINARIO"))){
                  lista= super.getService(EnterosNominaService.class).getComplemetoOR(generarEnteroDTO.getQnaPago(),generarEnteroDTO.getTipoNomina());
             }else{
                 generarEnteroDTO.setTipoNomina(super.configuration().getString("enteros", "ORDINARIO"));
                 lista= super.getService(EnterosNominaService.class).getComplemetoEX(generarEnteroDTO.getQnaPago(),generarEnteroDTO.getTipoNomina());
                 generarEnteroDTO.setTipoNomina(super.configuration().getString("enteros", "EXTRAORDINARIA"));
             }
            generarEnteroDTO.setListaComplemento(lista);
            generarEnteroDTO.setListaProceso(null);
        }else{
            generarEnteroDTO.setListaComplemento(null);
            generarEnteroDTO.setListaProceso(null);  
        }
        model.addAttribute(generarEnteroDTO);
        return super.getViewName("cargarEnteros");
    }  
    
    @RequestMapping
    public String iniciaProceso(Model model,GenerarEnteroDTO generarEnteroDTO) {
        boolean flag=true;
        generarEnteroDTO.setListaProceso(null);  
        if (generarEnteroDTO.getQnaPago() == null || generarEnteroDTO.getQnaPago().equals("0")) {
            super.saveError(model, "error.generarEnteroDTO.qnaPago");
            flag=false;
        } 
        if (generarEnteroDTO.getTercero() == null || generarEnteroDTO.getTercero().equals("0")) {
            super.saveError(model, "error.generarEnteroDTO.tercero");
            flag=false;
        } 
        if (generarEnteroDTO.getTipoNomina() == null || generarEnteroDTO.getTipoNomina().equals("0") ) {
            super.saveError(model, "error.generarEnteroDTO.tipoNomina");
            flag=false;
        } else{
            List<TnHistoricoPagoDTO> lista=null;
             if(generarEnteroDTO.getTipoNomina().equalsIgnoreCase(super.configuration().getString("enteros", "ORDINARIO"))){
                  lista= super.getService(EnterosNominaService.class).getComplemetoOR(generarEnteroDTO.getQnaPago(),generarEnteroDTO.getTipoNomina());
             }else{
                 generarEnteroDTO.setTipoNomina(super.configuration().getString("enteros", "ORDINARIO"));
                 lista= super.getService(EnterosNominaService.class).getComplemetoEX(generarEnteroDTO.getQnaPago(),generarEnteroDTO.getTipoNomina());
                 generarEnteroDTO.setTipoNomina(super.configuration().getString("enteros", "EXTRAORDINARIA"));
             }
            generarEnteroDTO.setListaComplemento(lista);
            //valida si selecciono algun complemento
             if (generarEnteroDTO.getCheckComplemento().length==0) {
                 super.saveError(model, "error.generarEnteroDTO.complementos");
                 flag=false;
             }
        }
        
        if(flag){
            GenerarEnteroDTO  enterosDTO=super.getService(EnterosNominaService.class).procesoEnteros(generarEnteroDTO.getQnaPago(),generarEnteroDTO.getCheckComplemento(),generarEnteroDTO.getTercero());
            generarEnteroDTO.setListaProceso(enterosDTO.getListaProceso());  
            generarEnteroDTO.setTotalEntero(enterosDTO.getTotalEntero());
            generarEnteroDTO.setImporteEntero(enterosDTO.getImporteEntero());
            generarEnteroDTO.setTotalRecuperacion(enterosDTO.getTotalRecuperacion()==null?"0":enterosDTO.getTotalRecuperacion());
            generarEnteroDTO.setImporteRecuperacion(enterosDTO.getImporteRecuperacion()==null?"0.0":enterosDTO.getImporteRecuperacion());
        }
        
        model.addAttribute(generarEnteroDTO);
        return super.getViewName("cargarEnteros");
    }  
    
    @RequestMapping
    public String generaArchivoTexto(Model model,GenerarEnteroDTO generarEnteroDTO, HttpServletResponse response) {
        //creando el archivo de enteros
        super.getService(EnterosNominaService.class).createFileTxt(generarEnteroDTO);
        
        //descargando aechivos 
        FileInputStream fs = null;
        File f = null;
        String nombreArchivoConRuta =  super.configuration().getString("local.temp.dir") +  File.separator + super.configuration().getString("enteros", "ENTEROS_METLIFE_FILE") ;
            
        try {
            f = new File(nombreArchivoConRuta);
            if (f.exists()) {
                fs = new FileInputStream(f);
                byte[] bytes = IOUtils.toByteArray(fs);
                response.setContentType("text/plain");
                response.setContentLength(bytes.length);
                response.setHeader("Content-Disposition",  "attachment; filename=\"" +  super.configuration().getString("enteros", "ENTEROS_METLIFE_FILE")+"\"");
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
