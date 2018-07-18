package gob.shcp.sireh.control.nomina.terceros;

import gob.shcp.fsn.control.AbstractController;
import gob.shcp.fsn.control.support.AnnotatedController;

import gob.shcp.sireh.model.nomina.ConsultaEmpleadoDTO;

import gob.shcp.sireh.model.nomina.QnaCapturaDTO;
import gob.shcp.sireh.model.nomina.terceros.enteros.fonac.PadronFonacDTO;

import gob.shcp.sireh.service.SirehUtils;
import gob.shcp.sireh.service.nomina.movimientos.ActualizacionNominaService;
import gob.shcp.sireh.service.nomina.movimientos.MovimientoNominaService;
import gob.shcp.sireh.service.terceros.TercerosService;

import java.io.IOException;
import java.io.OutputStream;

import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FonacNominaController extends AbstractController implements AnnotatedController {
    
    @RequestMapping
    public String liquidacionAnual(Model model) {
        return super.getViewName("liquidacionAnual");
    }
    @RequestMapping
    public String liquidacionAnticipada(Model model) {
        return super.getViewName("liquidacionAnticipada");
    }
    @RequestMapping
    public String aportacionesOrdinario(Model model) {
        return super.getViewName("aportacionesOrdinario");
    }
    @RequestMapping
    public String aportacionesExtraordinario(Model model) {
        return super.getViewName("aportacionesExtraordinario");
    }
    
    @RequestMapping
    public String cargaPadronFonac(Model model, PadronFonacDTO padronFonacDTO){
        padronFonacDTO.setNumRegistros(super.getService(TercerosService.class).getNumRegistrosPadronFonac());
        QnaCapturaDTO qnaCapturaDTO = super.getService(MovimientoNominaService.class).getQuincenaCaptura();
        String qnaCapturaStr  = qnaCapturaDTO.getQuincena();
        
        padronFonacDTO.setQnaCaptura(qnaCapturaDTO.toString());
        
        String ordianria      = "13";//"14";
        String extraOrdinaria = "02";//""2";
         
        Integer auxCiclo =Integer.valueOf(qnaCapturaDTO.getAnio());
        String ciclo = auxCiclo.toString() + "14";
        padronFonacDTO.setQnaInicioCiclo(ciclo);
        
        if(padronFonacDTO.isCancel()){  padronFonacDTO = new PadronFonacDTO();  }
        else if(padronFonacDTO.isProcesar()){
            if(padronFonacDTO.getPeriodo() == null || padronFonacDTO.getImporte() == null || padronFonacDTO.getReferencia() == null){
                if(padronFonacDTO.getPeriodo() == null){
                    super.saveError(model, "El campo periodo es un dato obligatorio, debe seleccionar el tipo de periodo");
                }
                if(padronFonacDTO.getImporte() == null){
                    super.saveError(model, "El campo importe es un dato obligatorio, debe proporcionar un importe");
                }
                if(padronFonacDTO.getReferencia() == null){
                    super.saveError(model, "El campo referencia es un dato obligatorio, debe proporcionar ua referencia");
                }
            }
            else if(padronFonacDTO.getPeriodo() != null && padronFonacDTO.getImporte() != null && padronFonacDTO.getReferencia() != null){
                if(qnaCapturaStr.equals(extraOrdinaria) && padronFonacDTO.getPeriodo().equalsIgnoreCase("E") && padronFonacDTO.isProcesar()){
                    super.getService(TercerosService.class).padronFonacExtraOrdinario(padronFonacDTO);
                    super.saveMessage(model,"El padrón fue cargado exitosamente.");
                }
                else if(qnaCapturaStr.equals(ordianria) && padronFonacDTO.getPeriodo().equalsIgnoreCase("O") && padronFonacDTO.isProcesar()){
                    super.getService(TercerosService.class).bajaPadronFonac(padronFonacDTO);
                    super.getService(TercerosService.class).padronFonacOrdinario(padronFonacDTO);
                    super.saveMessage(model, "El padrón fue cargado exitosamente.");
                }
                else 
                    if(padronFonacDTO.getPeriodo().equalsIgnoreCase("O")){
                        super.saveMessage(model,    "La operacion que selecciono no se puede aplicar en la quincena actual; " +
                                                    "Para periodo ordinario solo se puede aplicar en la quincena 14");
                     }
                    else if(padronFonacDTO.getPeriodo().equalsIgnoreCase("E")){
                        super.saveMessage(model,    "La operacion que selecciono no se puede aplicar en la quincena actual; " +
                                                    "Para periodo extraordinario solo se puede aplicar en la quincena 02");
                     }
            }
        }
        model.addAttribute(padronFonacDTO);
        return super.getViewName("cargaPadronFonac");
    }
    
    @RequestMapping
    public String emisionChequesFonac(Model model, PadronFonacDTO padronFonacDTO, HttpServletResponse response) throws IOException {
        List<String> datos = null;
        if(padronFonacDTO.isCancel()){
            padronFonacDTO = new PadronFonacDTO();
        }
        if(padronFonacDTO.getCicloEmision() != null){
            if(padronFonacDTO.getCicloEmision().equalsIgnoreCase("0")){
                super.saveError(model, "Proporcione el ciclo es un dato requerido");
            }
            if(padronFonacDTO.getCicloRemesa() == null){
                super.saveError(model, "Proporcione el ciclo de la remesa es un dato obligatorio");
            }
            if(padronFonacDTO.getRemesa() == null){
                super.saveError(model, "Proporcione la remesa es un dato obligatorio");
            }
            else {
                datos = super.getService(TercerosService.class).getEmisionChequesFonac(padronFonacDTO);
                
                if (datos == null) {
                    super.saveWarning(model,"No se encontro información asociada a la petición");
                    return super.getViewName("emisionChequesFonac");
                }
                if (datos.size() <= 0){   
                    super.saveWarning(model,"No se encontro información asociada a la petición");
                    return super.getViewName("emisionChequesFonac");
                }
                else {
                    StringBuilder strCsv = new StringBuilder();
                    
                    strCsv.append("IMPORTE NUMÉRICO,IMPORTE CON LETRA,BENEFICIARIO,DEPENDENCIA");
                    strCsv.append("\r\n");
                    for (String renglon : datos) {
                        strCsv.append(renglon).append("\r\n");
                    }
                    
                    byte[] bytes = strCsv.toString().getBytes();
                    response.setContentType("text/csv");
                    response.setContentLength(bytes.length);
                    response.setHeader("Content-Disposition", "attachment; filename=\"" + "ChequesFONAC.csv");
                    OutputStream out = response.getOutputStream();
                    out.write(bytes, 0, bytes.length);
                    return null;
                }
            }
        } 
        model.addAttribute(padronFonacDTO);
        return super.getViewName("emisionChequesFonac");
    }
    
    @RequestMapping
    public String liquidaCifrasFonac(Model model, PadronFonacDTO padronFonacDTO, HttpServletResponse response) throws IOException {
        List<String> datos = null;
        if(padronFonacDTO.isCancel()){padronFonacDTO = new PadronFonacDTO();}
        if(padronFonacDTO.getCicloEmision() != null || padronFonacDTO.getCicloRemesa() != null || padronFonacDTO.getRemesa() != null){
            if(padronFonacDTO.getCicloEmision().equalsIgnoreCase("0")){   
                super.saveError(model, "Proporcione el ciclo es un dato requerido"); 
            }
            if(padronFonacDTO.getCicloRemesa() == null){
                super.saveError(model, "Proporcione el ciclo de la remesa es un dato obligatorio");
            }
            if(padronFonacDTO.getRemesa() == null){
                super.saveError(model, "Proporcione la remesa es un dato obligatorio");
            }
            else {
                datos = super.getService(TercerosService.class).getliquidaCifrasFonac(padronFonacDTO);
                
                if (datos.isEmpty()){   
                    super.saveWarning(model,"No se encontro información asociada a la petición");
                    return super.getViewName("liquidaCifrasFonac");
                }
                else {
                    StringBuilder strCsv = new StringBuilder();
                    
                    strCsv.append("Liquidacion,Tipo,Num. Casos,Trabajador,Sindicato,Gobierno,Rendimientos,Total");
                    strCsv.append("\r\n");
                    for (String renglon : datos) {
                        strCsv.append(renglon).append("\r\n");
                    }
                    
                    byte[] bytes = strCsv.toString().getBytes();
                    response.setContentType("text/csv");
                    response.setContentLength(bytes.length);
                    response.setHeader("Content-Disposition", "attachment; filename=\"" + "Liquidacion_FONAC.csv");
                    OutputStream out = response.getOutputStream();
                    out.write(bytes, 0, bytes.length);
                    return null;
                }
            }
        } 
        model.addAttribute(padronFonacDTO);
        return super.getViewName("liquidaCifrasFonac");
        }
    
    @RequestMapping
    public String chequesFonac(Model model, PadronFonacDTO padronFonacDTO, HttpServletResponse response) throws IOException {
        List<String> datos = null;
        
        if(padronFonacDTO.isCancel()){
            padronFonacDTO = new PadronFonacDTO();
        }
        else if(padronFonacDTO.isAceptar()){
            if(padronFonacDTO.getCicloEmision() == null || padronFonacDTO.getCicloRemesa() == null || padronFonacDTO.getRemesa() == null){
                if(padronFonacDTO.getCicloEmision().equalsIgnoreCase("0")){
                    super.saveError(model, "Proporcione el ciclo es un dato requerido");
                }
                if(padronFonacDTO.getCicloRemesa() == null){
                    super.saveError(model,"Proporcione el ciclo de la remesa es un dato obligatorio");
                }
                if(padronFonacDTO.getRemesa() == null){
                    super.saveError(model, "Proporcione la remesa es un dato obligatorio");
                }
            }
            else{                
                 datos = super.getService(TercerosService.class).getChequesFonac(padronFonacDTO);

                 if (datos == null){
                     super.saveWarning(model,"No se encontro información asociada a la petición");
                     return super.getViewName("chequesFonac");
                 }
                 if (datos.size() <= 0){
                     super.saveWarning(model,"No se encontro información asociada a la petición");
                     return super.getViewName("chequesFonac");
                 }
                 else {
                     StringBuilder strCsv = new StringBuilder();
                     
                     strCsv.append("IMPORTE NUMÉRICO,IMPORTE CON LETRA,BENEFICIARIO,DEPENDENCIA");
                     strCsv.append("\r\n");
                     for (String renglon : datos) {
                         strCsv.append(renglon).append("\r\n");
                     }
                     
                     byte[] bytes = strCsv.toString().getBytes();
                     response.setContentType("text/csv");
                     response.setContentLength(bytes.length);
                     response.setHeader("Content-Disposition", "attachment; filename=\"" + "ChequesFONAC_desincorporado.csv");
                     OutputStream out = response.getOutputStream();
                     out.write(bytes, 0, bytes.length);
                     return null;
                 }
            }
        }
        
        model.addAttribute(padronFonacDTO);
        return super.getViewName("chequesFonac");
    }

    @RequestMapping
    public String cifrasFonac(Model model, PadronFonacDTO padronFonacDTO, HttpServletResponse response) throws IOException {
        List<String> datos = null;
        
        if(padronFonacDTO.isCancel()){
            padronFonacDTO = new PadronFonacDTO();
        }
        else if(padronFonacDTO.isAceptar()){
            if(padronFonacDTO.getCicloEmision() == null || padronFonacDTO.getRemesa() == null || padronFonacDTO.getRemesa() == null){
                if(padronFonacDTO.getCicloEmision().equalsIgnoreCase("0")){
                    super.saveError(model, "Proporcione el ciclo es un dato requerido"); 
                }
                if(padronFonacDTO.getCicloRemesa() == null){
                    super.saveError(model, "Proporcione el ciclo de la remesa es un dato obligatorio");
                }
                if(padronFonacDTO.getRemesa() == null){
                    super.saveError(model, "Proporcione la remesa es un dato obligatorio");
                }
            }
            else {
                datos = super.getService(TercerosService.class).getCifrasFonac(padronFonacDTO);
                
                if (datos.isEmpty()){
                    super.saveWarning(model,"No se encontro información asociada a la petición");
                    return super.getViewName("cifrasFonac");
                }
                else {
                    StringBuilder strCsv = new StringBuilder();
                    
                    strCsv.append("Liquidacion,Tipo,Num. Casos,Trabajador,Sindicato,Gobierno,Rendimientos,Total");
                    strCsv.append("\r\n");
                    for (String renglon : datos) {
                        strCsv.append(renglon).append("\r\n");
                    }
                    
                    byte[] bytes = strCsv.toString().getBytes();
                    response.setContentType("text/csv");
                    response.setContentLength(bytes.length);
                    response.setHeader("Content-Disposition", "attachment; filename=\"" + "Liquidacion_FONAC_desincorporados.csv");
                    OutputStream out = response.getOutputStream();
                    out.write(bytes, 0, bytes.length);
                    return null;
                    }
                }
            } 
            model.addAttribute(padronFonacDTO);
            return super.getViewName("cifrasFonac");
        }

    /**
     * Genera el archivo de aportaciones del personal en base a la quincena inicial y final seleccionadas
     * @author  Ricardo León E.
     * @param   model Model
     * @param   padronFonacDTO PadronFonacDTO
     * @return  String
     */ 

     @RequestMapping
     public String aportacionesFonac(Model model, PadronFonacDTO padronFonacDTO, HttpServletResponse response) throws IOException {
         String nombre;
         //String quincena = null;
         //Integer qna = 0;
         //String quincenafinal = null;
         //Integer axofinal;
         List<String> datos = null;
         if(padronFonacDTO.isCancel()){
             padronFonacDTO = new PadronFonacDTO();
         }
         if(padronFonacDTO.getQnaInicio() != null){
            if(padronFonacDTO.getQnaInicio().equalsIgnoreCase("0")){
                  super.saveError(model, "Proporcione la quincena inicial es campo requerido");
            }
            //quincena = padronFonacDTO.getQnaInicio().substring(1,6);
            //qna = Integer.parseInt(padronFonacDTO.getQnaInicio().substring(1,6));
            //if (qna < 13) {
            //    quincenafinal = padronFonacDTO.getQnaInicio().substring(1,4) + 13;
            // } else {
            //    axofinal = Integer.parseInt(padronFonacDTO.getQnaInicio().substring(1,4)) + 1;
            //    quincenafinal = Integer.toString(axofinal) + 13;
            //}
            if(padronFonacDTO.getQnaInicio().equalsIgnoreCase("0")){
                 super.saveError(model, "Proporcione la quincena inicial es campo requerido");
             }
             if(padronFonacDTO.getQnaFinal() == null){
                 super.saveError(model, "Proporcione la quincena final es un dato obligatorio");
             }
             else {
                 datos = super.getService(TercerosService.class).getAportacionesFonac(padronFonacDTO);
                 
                 if (datos == null) {
                     super.saveWarning(model,"No se encontro información asociada a la petición");
                     return super.getViewName("aportacionesFonac");
                 }
                 if (datos.size() <= 0){   
                     super.saveWarning(model,"No se encontro información asociada a la petición");
                     return super.getViewName("aportacionesFonac");
                 }
                 else {
                     nombre = "ArchivoAportaciones" + padronFonacDTO.getQnaInicio() + "a" + padronFonacDTO.getQnaFinal();
                     StringBuilder strCsv = new StringBuilder();
                     
                     for (String renglon : datos) {
                         strCsv.append(renglon).append("\r\n");
                     }
                     
                     byte[] bytes = strCsv.toString().getBytes();
                     response.setContentType("text/csv");
                     response.setContentLength(bytes.length);
                     response.setHeader("Content-Disposition", "attachment; filename=\"" + nombre + ".csv");
                     OutputStream out = response.getOutputStream();
                     out.write(bytes, 0, bytes.length);
                     return null;
                 }
             }
           }
         model.addAttribute(padronFonacDTO);
         return super.getViewName("aportacionesFonac");
     }
 
}