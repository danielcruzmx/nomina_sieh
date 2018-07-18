package gob.shcp.sireh.control.plaza.eventual.masivos;

import gob.shcp.fsn.control.AbstractController;
import gob.shcp.fsn.control.support.AnnotatedController;
import gob.shcp.fsn.service.ServiceException;
import gob.shcp.sireh.model.merito.NotaDeMeritoDTO;
import gob.shcp.sireh.model.plaza.estructura.masivos.AltaMasivaDTO;
import gob.shcp.sireh.model.plaza.estructura.masivos.CreacionPlazaMasivaDTO;
import gob.shcp.sireh.model.plaza.estructura.masivos.PlazaEventualMasivaDTO;
import gob.shcp.sireh.model.plaza.eventual.CambioAdscripcionMasivoDTO;
import gob.shcp.sireh.model.plaza.eventual.PromocionMasivaDTO;
import gob.shcp.sireh.model.plaza.eventual.ProrrogaMasivaDTO;
import gob.shcp.sireh.model.plaza.eventual.ReduccionContratoMasivaDTO;
import gob.shcp.sireh.service.SirehUtils;
import gob.shcp.sireh.service.nomina.calculo.CalculoNominaService;
import gob.shcp.sireh.service.plaza.eventual.masivos.PlazaEventualMasivaService;


import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;

import java.util.Arrays;
import java.util.List;
import java.util.UUID;

import javax.servlet.http.HttpServletResponse;

import org.apache.commons.io.IOUtils;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class PlazaEventualMasivaController extends AbstractController implements AnnotatedController {
    private static final String MEP_OBSERVA_BAJA = "MOVIMIENTO DE BAJA MASIVA";
    private static final String ID_GRUPO_PAGO = "V";


    @RequestMapping
    public String initPromocion(Model model) {
        PromocionMasivaDTO promocionMasivaDTO = new PromocionMasivaDTO();
        promocionMasivaDTO.setTipoProceso("CR");
        promocionMasivaDTO.setUrlOrigen("initPromocion");
        promocionMasivaDTO.setUrlDestino("validatePromocion");
        promocionMasivaDTO.setInicio(true);
        model.addAttribute(promocionMasivaDTO);
        return super.getViewName("initPromocion");
    }
    
    @RequestMapping
    public String validatePromocion(Model model, PromocionMasivaDTO promocionMasivaDTO) {
        promocionMasivaDTO.setUrlOrigen("initPromocion");
        promocionMasivaDTO.setUrlDestino("processPromocion");
        promocionMasivaDTO.setInicio(false);
        promocionMasivaDTO.setTipoProceso("CR");
        try{
          String nameFileXls = UUID.randomUUID().toString() + ".xlsx";
          promocionMasivaDTO.setNombreArchivoErrores(nameFileXls);
          super.getService(PlazaEventualMasivaService.class).validarFilePromocion(promocionMasivaDTO);
          if(promocionMasivaDTO.getPlantillaErronea()) {
              promocionMasivaDTO.setMensaje(super.configuration().getString("plazaMasivaEstructura", 
                                                                                 "carga.plaza.masiva.estructura.creacion.mensaje.plantilla.erronea"));
          }
          else {
              if(promocionMasivaDTO.getArchivoValido()) {
                  promocionMasivaDTO.setMensaje(super.configuration().getString("plazaMasivaEstructura", 
                                                                                   "carga.plaza.masiva.estructura.creacion.mensaje.archivo.valido"));
              }
              else{
                  promocionMasivaDTO.setMensaje(super.configuration().getString("plazaMasivaEstructura", 
                                                                                   "carga.plaza.masiva.estructura.creacion.mensaje.archivo.invalido"));
              }
          }
            
      } catch (ServiceException e) {
          promocionMasivaDTO.setMensaje(super.configuration().getString("plazaMasivaEstructura", 
                                                                               "jxls.service.cargaPlazaMasivaEstructura"));
          promocionMasivaDTO.setArchivoValido(false);   
          promocionMasivaDTO.setNombreArchivoErrores("");
      }
        model.addAttribute(promocionMasivaDTO);
        return super.getViewName("validatePromocion");
    }


    @RequestMapping
    public String processPromocion(Model model, PromocionMasivaDTO promocionMasivaDTO) {
        try{
           promocionMasivaDTO.setTipoProceso("CR");
           super.getService(PlazaEventualMasivaService.class).updateNMPromocion(promocionMasivaDTO);
           promocionMasivaDTO.setMensaje(super.configuration().getString("plazaMasivaEstructura", 
                                                                                "carga.plaza.masiva.estructura.creacion.mensaje.update.exito"));
           model.addAttribute(promocionMasivaDTO);
       } catch (ServiceException e) {
           promocionMasivaDTO.setMensaje(super.configuration().getString("plazaMasivaEstructura", 
                                                                                "carga.plaza.masiva.estructura.creacion.mensaje.update.error"));
           model.addAttribute(promocionMasivaDTO);                                                                                 
       }
        
        return super.getViewName("resultPromocion");
    }


    @RequestMapping
    public String processCambioAdscripcion(Model model, CambioAdscripcionMasivoDTO cambioAdscripcionMasivoDTO){
        if(cambioAdscripcionMasivoDTO.isCancel()){
            cambioAdscripcionMasivoDTO = new CambioAdscripcionMasivoDTO();
        }
        
        super.getService(PlazaEventualMasivaService.class).processCambioAdscripcion(cambioAdscripcionMasivoDTO);
        
        cambioAdscripcionMasivoDTO.setUrlOrigen("processCambioAdscripcion");
        cambioAdscripcionMasivoDTO.setUrlDestino("updateCambioAdscripcion");
    
        
    
        String unidadNom = cambioAdscripcionMasivoDTO.getIdUnidadOrigen();
        cambioAdscripcionMasivoDTO.setIdUnidadNomFilter(unidadNom != null && unidadNom.length() > 0 ? splitAsList(unidadNom, ",") : null);

        cambioAdscripcionMasivoDTO.setMuestraRegistros(cambioAdscripcionMasivoDTO.isBuscar());
        model.addAttribute(cambioAdscripcionMasivoDTO);
        return super.getViewName("processCambioAdscripcion");
    }
    
    @RequestMapping
    public String updateCambioAdscripcion(Model model, CambioAdscripcionMasivoDTO cambioAdscripcionMasivoDTO){
        String nameFileXls = UUID.randomUUID().toString() + ".xlsx";
        cambioAdscripcionMasivoDTO.setNombreArchivoResultados(nameFileXls);
        super.getService(PlazaEventualMasivaService.class).updateNMCambioAdscripcion(cambioAdscripcionMasivoDTO);
        super.saveMessage(model, "plazasMasivas.eventuales.cambio.adscripcion.ok");
        return getViewName("resultCambioAdscripcion");
    }


    @RequestMapping
    public String processProrroga(Model model, ProrrogaMasivaDTO prorrogaMasivaDTO){
        if(prorrogaMasivaDTO.isCancel()){
            prorrogaMasivaDTO = new ProrrogaMasivaDTO();
        }
        prorrogaMasivaDTO.setUrlOrigen("processProrroga");
        prorrogaMasivaDTO.setUrlDestino("updateProrroga");
        
        String unidadNom = prorrogaMasivaDTO.getIdUnidadNom();
        if(unidadNom != null && unidadNom.length() > 0){
            prorrogaMasivaDTO.setIdUnidadNomFilter(splitAsList(unidadNom, ","));    
        }else{
            prorrogaMasivaDTO.setIdUnidadNomFilter(null);
        }
        
        prorrogaMasivaDTO.setPlazaFinContStringHidden(prorrogaMasivaDTO.getPlazaFinContString());
        
        Integer quincenaCaptura = super.getService(CalculoNominaService.class).getQuincenaCapturaasInteger();
        
        int anio =  (int) quincenaCaptura / 100;
        prorrogaMasivaDTO.setInicioQuincenaCaptura(SirehUtils.getQuincenaCapturaAsDate(quincenaCaptura, 'I'));
        prorrogaMasivaDTO.setFinQuincenaCaptura(SirehUtils.getQuincenaCapturaAsDate(quincenaCaptura, 'F'));
        prorrogaMasivaDTO.setAnio(anio);
        prorrogaMasivaDTO.setPlazaFinContYearFilter(new Integer(anio - 1).toString());
        
        prorrogaMasivaDTO.setMuestraRegistros(prorrogaMasivaDTO.getPlazaFinContString() != null && prorrogaMasivaDTO.getPlazaFinContString().length() > 0 );
        model.addAttribute(prorrogaMasivaDTO);
        return super.getViewName("processProrroga");
    }
    
    @RequestMapping
    public String updateProrroga(Model model, ProrrogaMasivaDTO prorrogaMasivaDTO) {
        String nameFileXls = UUID.randomUUID().toString() + ".xlsx";
        prorrogaMasivaDTO.setNombreArchivoResultados(nameFileXls);
        
        super.getService(PlazaEventualMasivaService.class).updateNMProrroga(prorrogaMasivaDTO);
        super.saveMessage(model, "plazasMasivas.eventuales.prorroga.ok");
        return super.getViewName("resultProrroga");
    }

    @RequestMapping
    public String processReduccion(Model model, ReduccionContratoMasivaDTO reduccionContratoMasivaDTO){
        if(reduccionContratoMasivaDTO.isCancel()){
            reduccionContratoMasivaDTO = new ReduccionContratoMasivaDTO();
        }
        reduccionContratoMasivaDTO.setUrlOrigen("processReduccion");
        reduccionContratoMasivaDTO.setUrlDestino("updateReduccion");
        
        String unidadNom = reduccionContratoMasivaDTO.getIdUnidadNom();
        if(unidadNom != null && unidadNom.length() > 0){
            reduccionContratoMasivaDTO.setIdUnidadNomFilter(splitAsList(unidadNom, ","));    
        }else{
            reduccionContratoMasivaDTO.setIdUnidadNomFilter(null);
        }
        
        reduccionContratoMasivaDTO.setPlazaFinContStringHidden(reduccionContratoMasivaDTO.getPlazaFinContString());
        
        Integer quincenaCaptura = super.getService(CalculoNominaService.class).getQuincenaCapturaasInteger();
        int anio =  (int) quincenaCaptura / 100;
        reduccionContratoMasivaDTO.setInicioQuincenaCaptura(SirehUtils.getQuincenaCapturaAsDate(quincenaCaptura, 'I'));
        reduccionContratoMasivaDTO.setAnio(anio);
        reduccionContratoMasivaDTO.setPlazaFinContYearFilter(new Integer(anio - 1).toString());
        
        reduccionContratoMasivaDTO.setMuestraRegistros(reduccionContratoMasivaDTO.getPlazaFinContString() != null && reduccionContratoMasivaDTO.getPlazaFinContString().length() > 0 );
        model.addAttribute(reduccionContratoMasivaDTO);
        return super.getViewName("processReduccion");
    }
    
    @RequestMapping
    public String updateReduccion(Model model, ReduccionContratoMasivaDTO reduccionContratoMasivaDTO) {
        String nameFileXls = UUID.randomUUID().toString() + ".xlsx";
        reduccionContratoMasivaDTO.setNombreArchivoResultados(nameFileXls);
        super.getService(PlazaEventualMasivaService.class).updateNMReduccion(reduccionContratoMasivaDTO);
        super.saveMessage(model, "plazasMasivas.eventuales.reduccion.ok");
        return super.getViewName("resultReduccion");
    }

    @RequestMapping
    public String processAlta(Model model, AltaMasivaDTO altaMasivaDTO){
        if(altaMasivaDTO.isCancel()){
            altaMasivaDTO = new AltaMasivaDTO();
        }
        altaMasivaDTO.setUrlOrigen("processAlta");
        altaMasivaDTO.setUrlDestino("updateAlta");
        
        String unidadNom = altaMasivaDTO.getIdUnidadNom();
        if(unidadNom != null && unidadNom.length() > 0){
            altaMasivaDTO.setIdUnidadNomFilter(splitAsList(unidadNom, ","));    
        }else{
            altaMasivaDTO.setIdUnidadNomFilter(null);
        }
        
        altaMasivaDTO.setPlazaFinContStringHidden(altaMasivaDTO.getPlazaFinContString());
        Integer quincenaCaptura = super.getService(CalculoNominaService.class).getQuincenaCapturaasInteger();
        int anio =  (int) quincenaCaptura / 100;
        
        altaMasivaDTO.setPlazaFinContYearFilter(new Integer(anio - 1).toString());
        altaMasivaDTO.setMepObservaFilter(MEP_OBSERVA_BAJA);
        altaMasivaDTO.setIdGrupoPagoFilter(ID_GRUPO_PAGO);
        
        altaMasivaDTO.setMuestraRegistros(altaMasivaDTO.getPlazaFinContString() != null && altaMasivaDTO.getPlazaFinContString().length() > 0 );
        super.getService(PlazaEventualMasivaService.class).processAlta(altaMasivaDTO);
        model.addAttribute(altaMasivaDTO);
        return super.getViewName("processAlta");
    }
    
    @RequestMapping
    public String updateAlta(Model model, AltaMasivaDTO altaMasivaDTO) {
        String nameFileXls = UUID.randomUUID().toString() + ".xlsx";
        altaMasivaDTO.setNombreArchivoResultados(nameFileXls);
        super.getService(PlazaEventualMasivaService.class).updateNMAlta(altaMasivaDTO);
        super.saveMessage(model, "plazasMasivas.eventuales.altas.ok");
        return super.getViewName("resultAlta");
    }



   
    @RequestMapping
    public String processBaja(Model model, PlazaEventualMasivaDTO plazaEventualMasivaDTO)  {
        if(plazaEventualMasivaDTO.isCancel()){
            plazaEventualMasivaDTO = new PlazaEventualMasivaDTO();
        }
        plazaEventualMasivaDTO.setUrlOrigen("processBaja");
        plazaEventualMasivaDTO.setUrlDestino("updateBaja");

            
        String unidadNom = plazaEventualMasivaDTO.getIdUnidadNom();
        if(unidadNom != null && unidadNom.length() > 0){
            plazaEventualMasivaDTO.setIdUnidadNomFilter(splitAsList(unidadNom, ","));    
        }else{
            plazaEventualMasivaDTO.setIdUnidadNomFilter(null);
        }
        plazaEventualMasivaDTO.setPlazaFinContStringHidden(plazaEventualMasivaDTO.getPlazaFinContString());
        
        Integer quincenaCaptura = super.getService(CalculoNominaService.class).getQuincenaCapturaasInteger();
        int anio =  (int) quincenaCaptura / 100;
        
        plazaEventualMasivaDTO.setPlazaFinContYearFilter(new Integer(anio).toString());
        plazaEventualMasivaDTO.setMuestraRegistros(plazaEventualMasivaDTO.getPlazaFinContString() != null && plazaEventualMasivaDTO.getPlazaFinContString().length() > 0 );
        
        super.getService(PlazaEventualMasivaService.class).processBaja(plazaEventualMasivaDTO);
        
        model.addAttribute(plazaEventualMasivaDTO);
        return super.getViewName("processBaja");
    }
    
    
    
    @RequestMapping
    public String updateBaja(Model model, PlazaEventualMasivaDTO plazaEventualMasivaDTO) {
        String nameFileXls = UUID.randomUUID().toString() + ".xlsx";
        plazaEventualMasivaDTO.setNombreArchivoResultados(nameFileXls);
        super.getService(PlazaEventualMasivaService.class).updateNMBaja(plazaEventualMasivaDTO);
        super.saveMessage(model, "plazasMasivas.eventuales.bajas.ok");
        model.addAttribute(plazaEventualMasivaDTO);
        return super.getViewName("resultBaja");
    }
    
    private List<String> splitAsList(String cadena, String separatorSplit){
        if (cadena == null || cadena.length() == 0) return null;
        String arreglo[] = cadena.split(separatorSplit);
        return Arrays.asList(arreglo);
    }
    
    @RequestMapping
    public String initCreacion(Model model) {
        CreacionPlazaMasivaDTO creacionPlazaMasivaDTO = new CreacionPlazaMasivaDTO();
        creacionPlazaMasivaDTO.setTipoProceso("CR");
        creacionPlazaMasivaDTO.setUrlOrigen("initCreacion");
        creacionPlazaMasivaDTO.setUrlDestino("validCreacion");
        creacionPlazaMasivaDTO.setInicio(true);
        model.addAttribute(creacionPlazaMasivaDTO);
        return super.getViewName("initPlazaEventualesMasiva");
    }
    
    @RequestMapping
    public String validCreacion(Model model, CreacionPlazaMasivaDTO creacionPlazaMasivaDTO) {
        creacionPlazaMasivaDTO.setUrlOrigen("initCreacion");
        creacionPlazaMasivaDTO.setUrlDestino("processCreacion");
        creacionPlazaMasivaDTO.setInicio(false);
        creacionPlazaMasivaDTO.setTipoProceso("CR");
        try{
          String nameFileXls = UUID.randomUUID().toString() + ".xlsx";
          creacionPlazaMasivaDTO.setNombreArchivoErrores(nameFileXls);
          creacionPlazaMasivaDTO = super.getService(PlazaEventualMasivaService.class).validarFileCreacion(creacionPlazaMasivaDTO);
            if (creacionPlazaMasivaDTO.getPlantillaErronea()) {
                creacionPlazaMasivaDTO.setMensaje(super.configuration().getString("plazaMasivaEstructura", 
                                                                                  "carga.plaza.masiva.estructura.creacion.mensaje.plantilla.erronea") + 
                                                  " " + creacionPlazaMasivaDTO.getMensaje() != null ? creacionPlazaMasivaDTO.getMensaje() : "");
            } else {
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
        return super.getViewName("validPlazaEventualesMasiva");
    }
    
    @RequestMapping
    public String processCreacion(Model model, CreacionPlazaMasivaDTO creacionPlazaMasivaDTO) {
        try{
           creacionPlazaMasivaDTO.setTipoProceso("CR");
           creacionPlazaMasivaDTO = super.getService(PlazaEventualMasivaService.class).updateNMCreacion(creacionPlazaMasivaDTO);
           creacionPlazaMasivaDTO.setMensaje(super.configuration().getString("plazaMasivaEstructura", 
                                                                                "carga.plaza.masiva.estructura.creacion.mensaje.update.exito"));
           model.addAttribute(creacionPlazaMasivaDTO);
       } catch (ServiceException e) {
           creacionPlazaMasivaDTO.setMensaje(super.configuration().getString("plazaMasivaEstructura", 
                                                                                "carga.plaza.masiva.estructura.creacion.mensaje.update.error"));
           model.addAttribute(creacionPlazaMasivaDTO);                                                                                 
       }
        
        return super.getViewName("resultPlazaEventualesMasiva");
    }
    
    @RequestMapping
    public String updateCreacion(Model model, PlazaEventualMasivaDTO plazaEventualMasivaDTO) {
        model.addAttribute(plazaEventualMasivaDTO);
        return super.getViewName("updateEventualesCreacion");
    }

    @RequestMapping
    public String downloadFile(Model model, @RequestParam("nombreArchivoErrores")
        String nombreArchivoErrores, HttpServletResponse response) {
        FileInputStream fs = null;
        File f = null;
        String nombreArchivoXls = super.configuration().getString("local.temp.dir") + File.separator + nombreArchivoErrores;

        try {
            NotaDeMeritoDTO notasDeMeritoDTO = new NotaDeMeritoDTO();
            notasDeMeritoDTO.setNombreArchivoErrores(nombreArchivoErrores);
            notasDeMeritoDTO.setRutaArchivoErrores(nombreArchivoXls);
            f = new File(notasDeMeritoDTO.getRutaArchivoErrores());

            if (f.exists()) {
                fs = new FileInputStream(f);
                byte[] bytes = IOUtils.toByteArray(fs);
                response.setContentType("application/xls");
                response.setContentLength(bytes.length);
                response.setHeader("Content-Disposition", 
                                   "attachment; filename=\"" + 
                                   notasDeMeritoDTO.getNombreArchivoErrores() + 
                                   "\"");
                OutputStream out = response.getOutputStream();
                out.write(bytes, 0, bytes.length);
            }
        } catch (Exception e) {
        } finally {
            try {
                fs.close();
            } catch (IOException e) {
            }
        }
        return null;
    }
}
