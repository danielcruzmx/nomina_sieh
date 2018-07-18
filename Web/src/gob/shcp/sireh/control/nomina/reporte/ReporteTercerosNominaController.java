package gob.shcp.sireh.control.nomina.reporte;

import gob.shcp.fsn.control.AbstractController;
import gob.shcp.fsn.control.support.AnnotatedController;

import gob.shcp.sireh.model.nomina.reportes.ReportesConstanciasDTO;
import gob.shcp.sireh.model.nomina.terceros.GeneraArchivosTercerosDTO;
import gob.shcp.sireh.model.nomina.terceros.GnpDTO;
import gob.shcp.sireh.model.nomina.terceros.ReportesTercerosDTO;


import gob.shcp.sireh.model.nomina.terceros.timbradosat.RepComprobanteFiscalDTO;
import gob.shcp.sireh.model.rusp.RuspBajaDTO;
import gob.shcp.sireh.service.SirehUtils;

import gob.shcp.sireh.service.nomina.movimientos.MovimientoNominaService;

import gob.shcp.sireh.service.nomina.terceros.aportaciones.SarFovisssteService;
import gob.shcp.sireh.service.terceros.TercerosService;

import gob.shcp.sireh.service.terceros.sat.ReporteTercerosNominaService;

import java.io.IOException;

import java.io.OutputStream;

import java.text.SimpleDateFormat;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ReporteTercerosNominaController extends AbstractController implements AnnotatedController {

    public static final String formtatoFecha = "dd/MM/yyyy";
    public static final SimpleDateFormat simpleDateFormat = new SimpleDateFormat(formtatoFecha);
    
    @RequestMapping
    public String seguroVidaInstitucional(Model model,ReportesTercerosDTO reportesTercerosDTO) {
        if (reportesTercerosDTO.isCancel()) {
            reportesTercerosDTO = new ReportesTercerosDTO();
        }
        // Validaciones
        reportesTercerosDTO.setUniCicloRequired(Boolean.TRUE);
        reportesTercerosDTO.setQnaCapturaRequired(Boolean.TRUE);
                
        model.addAttribute(reportesTercerosDTO);
        return super.getViewName("seguroVidaInstitucional");
    }
    
    @RequestMapping
    public String seguroColectivoRetiro(Model model, ReportesTercerosDTO reportesTercerosDTO) {
        if (reportesTercerosDTO.isCancel()) {
            reportesTercerosDTO = new ReportesTercerosDTO();
        }
        // Validaciones
        reportesTercerosDTO.setMesQnaRequired(Boolean.TRUE);
                
        model.addAttribute(reportesTercerosDTO);
        return super.getViewName("seguroColectivoRetiro");
    }

    /**
     * Metodo inicial para Genera archivo de pago de Nomina Ordinaria - Extraordonario del Seguro de Vida Institucional
     * @author Ricardo León E.
     * */
     @RequestMapping
     public String seguroVidaPago(Model model,ReportesTercerosDTO reportesTercerosDTO) {
         if (reportesTercerosDTO.isCancel()) {
             reportesTercerosDTO = new ReportesTercerosDTO();
         }

         reportesTercerosDTO.setQnaCapturaRequired(Boolean.TRUE);
         reportesTercerosDTO.setTipoNominaRequired(Boolean.TRUE);

         model.addAttribute(reportesTercerosDTO);
         return super.getViewName("seguroVidaPago");
     }

    /**
     * Genera archivo de pago de Nómina Ordinaria - Extraordinaria del Seguro de Vida Institucional
     * @author Ricardo León E.
     * @param model Model
     /* @param generaArchivosTercerosDTO GeneraArchivosTercerosDTO
     */
     @RequestMapping
     public String generaArchivoSegInsticional(Model model, ReportesTercerosDTO reportesTercerosDTO, 
                                               HttpServletResponse response) throws IOException {

         String quincena = reportesTercerosDTO.getQnaCaptura();
         String fileName = "";
         if (reportesTercerosDTO.getQnaCaptura() == null) {
             // super.saveWarning(model, "warn.empty.selecc.generacionArchivo.ciclo.mes");
             return super.getViewName("generaSegInsticionalOrd");
         }

         reportesTercerosDTO.setQnaCaptura(reportesTercerosDTO.getQnaCaptura());
         reportesTercerosDTO.setTipoNomina(reportesTercerosDTO.getTipoNomina());
         
         StringBuilder strCsv = new StringBuilder();
         if (reportesTercerosDTO.getTipoNomina().equals("O")) {
             List<String> datos = super.getService(TercerosService.class).getSegInstOrdinario(quincena);
             for (String renglon: datos) {
                 strCsv.append(renglon).append("\r\n");
             }
         }
         else {
             List<String> datos = super.getService(TercerosService.class).getSegInstExtraordinario(quincena);
             for (String renglon: datos) {
                 strCsv.append(renglon).append("\r\n");
             }
         }
         
         if (reportesTercerosDTO.getTipoNomina().equals("O")) {
             fileName = "SeguroVidaInstitucionalOrdinaria";
         } else {
             fileName = "SeguroVidaInstitucionalExtraordinaria";
         }

         // reportesTercerosDTO.setMuestraRegistros(true);
         byte[] bytes = strCsv.toString().getBytes();
         response.setContentType("text/csv");
         response.setContentLength(bytes.length);
         response.setHeader("Content-Disposition", 
                            "attachment; filename=\"" + fileName +  quincena +  ".csv");
         OutputStream out = response.getOutputStream();
         out.write(bytes, 0, bytes.length);

         return null;
     }

    /**
     * Metodo inicial para Genera archivo de pago de Anticipado del Seguro de Vida Institucional
     * @author Ricardo León E.
     * */
     @RequestMapping
     public String seguroVidaAnticipado(Model model,ReportesTercerosDTO reportesTercerosDTO) {
         if (reportesTercerosDTO.isCancel()) {
             reportesTercerosDTO = new ReportesTercerosDTO();
         }

         reportesTercerosDTO.setQnaCapturaRequired(Boolean.TRUE);

         model.addAttribute(reportesTercerosDTO);
         return super.getViewName("seguroVidaAnticipado");
     }

    /**
     * Genera archivo de pago de  Ordinaria del Seguro de Vida Institucional
     * @author Ricardo León E.
     * @param model Model
     /* @param generaArchivosTercerosDTO GeneraArchivosTercerosDTO
     */
     @RequestMapping
     public String generaArchivoSegInstAnticipa(Model model, ReportesTercerosDTO reportesTercerosDTO, 
                                               HttpServletResponse response) throws IOException {

         String quincena = reportesTercerosDTO.getQnaCaptura();
         String fileName = "";
         if (reportesTercerosDTO.getQnaCaptura() == null) {
             // super.saveWarning(model, "warn.empty.selecc.generacionArchivo.ciclo.mes");
             return super.getViewName("generaArchivoSegInstAnticipa");
         }

         reportesTercerosDTO.setQnaCaptura(reportesTercerosDTO.getQnaCaptura());
         
         StringBuilder strCsv = new StringBuilder();

         List<String> datos = super.getService(TercerosService.class).getSegInstAnticipado(quincena);
 
         for (String renglon: datos) {
              strCsv.append(renglon).append("\r\n");
         }
         
         fileName = "SeguroVidaInstitucionalAnticipado";

         // reportesTercerosDTO.setMuestraRegistros(true);
         byte[] bytes = strCsv.toString().getBytes();
         response.setContentType("text/csv");
         response.setContentLength(bytes.length);
         response.setHeader("Content-Disposition", 
                            "attachment; filename=\"" + fileName +  quincena +  ".csv");
         OutputStream out = response.getOutputStream();
         out.write(bytes, 0, bytes.length);

         return null;
     }

    @RequestMapping
    public String pagoTrimestralAnticipado(Model model, ReportesTercerosDTO reportesTercerosDTO) {
        if (reportesTercerosDTO.isCancel()) {
            reportesTercerosDTO = new ReportesTercerosDTO();
        }
        // Validaciones
        reportesTercerosDTO.setUniCicloRequired(Boolean.FALSE);
        reportesTercerosDTO.setQnaCapturaRequired(Boolean.TRUE);
                
        model.addAttribute(reportesTercerosDTO);
        return super.getViewName("pagoTrimestralAnticipado");
    }
    
    @RequestMapping
    public String rechazos(Model model, ReportesTercerosDTO reportesTercerosDTO) {
        if (reportesTercerosDTO.isCancel()) {
            reportesTercerosDTO = new ReportesTercerosDTO();
        }
        // Validaciones
        reportesTercerosDTO.setTercerosRequired(Boolean.TRUE);
        reportesTercerosDTO.setQnaCapturaRequired(Boolean.TRUE);

        model.addAttribute(reportesTercerosDTO);
        return super.getViewName("rechazos");
    }
   
    @RequestMapping
    public String cifrasDeControlI(Model model) {
        GeneraArchivosTercerosDTO generaArchivosTercerosDTO = new GeneraArchivosTercerosDTO();
        model.addAttribute(generaArchivosTercerosDTO);
        return super.getViewName("cifrasDeControlI");
    }
    
    @RequestMapping
    public String cifrasDeControlReporte(Model model, GeneraArchivosTercerosDTO generaArchivosTercerosDTO) {
        if (generaArchivosTercerosDTO.getHpQnaPago() == null || generaArchivosTercerosDTO.getHpQnaPago().equals("") || 
            generaArchivosTercerosDTO.getTipoQna() == null || generaArchivosTercerosDTO.getTipoQna().equals("")) {
            generaArchivosTercerosDTO.setMuestraRegistros(false);
            super.saveWarning(model, "warn.empty.selecc");
            return super.getViewName("cifrasDeControlI");
        } 
        else {
            if (generaArchivosTercerosDTO.getTipoEntero() != null && 
            generaArchivosTercerosDTO.getTipoEntero().equals("e")) {
            generaArchivosTercerosDTO.setBeanlista("cifrasControlIsssteEnteros");  }
            if (generaArchivosTercerosDTO.getTipoEntero() != null && 
                generaArchivosTercerosDTO.getTipoEntero().equals("c")) {
                generaArchivosTercerosDTO.setBeanlista("cifrasControlIsssteCancelados");   }
            if (generaArchivosTercerosDTO.getTipoEntero() != null && 
                generaArchivosTercerosDTO.getTipoEntero().equals("d")) {
                generaArchivosTercerosDTO.setBeanlista("cifrasControlIsssteDevoluciones");   }
        
            generaArchivosTercerosDTO.setHpIniPago(simpleDateFormat.format(SirehUtils.getQuincenaCapturaAsDate(generaArchivosTercerosDTO.getHpQnaPago(), 'I')));
            
            generaArchivosTercerosDTO.setMuestraRegistros(true);                                                                                                       
        }
        
        generaArchivosTercerosDTO.setGeneraArchivo(false);
        model.addAttribute(generaArchivosTercerosDTO);
        return super.getViewName("cifrasDeControlI");
    }
    
    @RequestMapping
    public String cifrasDeControlReporteVer(Model model, GeneraArchivosTercerosDTO generaArchivosTercerosDTO) {
        StringBuffer sb = new StringBuffer();
        if (generaArchivosTercerosDTO.getTipoEntero() != null && 
        generaArchivosTercerosDTO.getTipoEntero().equals("e")) {
        generaArchivosTercerosDTO.setBeanlista("cifrasControlIsssteEnteros");  }
        if (generaArchivosTercerosDTO.getTipoEntero() != null && 
            generaArchivosTercerosDTO.getTipoEntero().equals("c")) {
            generaArchivosTercerosDTO.setBeanlista("cifrasControlIsssteCancelados");   }
        if (generaArchivosTercerosDTO.getTipoEntero() != null && 
            generaArchivosTercerosDTO.getTipoEntero().equals("d")) {
            generaArchivosTercerosDTO.setBeanlista("cifrasControlIsssteDevoluciones");   }
        
        
        generaArchivosTercerosDTO.setHpIniPago(simpleDateFormat.format(SirehUtils.getQuincenaCapturaAsDate(generaArchivosTercerosDTO.getHpQnaPago(), 'I')));
        
        generaArchivosTercerosDTO.setMuestraRegistros(true);
        generaArchivosTercerosDTO.setGeneraArchivo(true);
        
        for(String item:generaArchivosTercerosDTO.getSeleccionConsecNomina()){   
            sb.append("'");
            sb.append(item); 
            sb.append("'");
            sb.append(",");  
            
        }
        
        
        generaArchivosTercerosDTO.setHpConsecNomina(sb.toString());
        
        if(generaArchivosTercerosDTO.getHpConsecNomina().length() > 0){
            generaArchivosTercerosDTO.setHpConsecNomina(generaArchivosTercerosDTO.getHpConsecNomina().substring(0, (generaArchivosTercerosDTO.getHpConsecNomina().length()) -1 ));
        }  
        
        if(generaArchivosTercerosDTO.getTipoQna() == 0){
            generaArchivosTercerosDTO.setDescTercero("=");
        }
        else if(generaArchivosTercerosDTO.getTipoQna() == 1){   generaArchivosTercerosDTO.setDescTercero("<>");   }
        
        model.addAttribute(generaArchivosTercerosDTO);
        return super.getViewName("cifrasDeControlI");
    }

    @RequestMapping
    public String cifrasDeControl(Model model, ReportesTercerosDTO reportesTercerosDTO) {
        if (reportesTercerosDTO.isCancel()) {
            reportesTercerosDTO = new ReportesTercerosDTO();
        }
        // Validaciones
        reportesTercerosDTO.setUniCicloRequired(Boolean.FALSE);
        reportesTercerosDTO.setQnaCapturaRequired(Boolean.TRUE);
        reportesTercerosDTO.setTipoNominaRequired(Boolean.TRUE);
        reportesTercerosDTO.setComplementoRequired(Boolean.TRUE);
                
        model.addAttribute(reportesTercerosDTO);
        return super.getViewName("cifrasDeControl");
    }
    
    @RequestMapping
    public String cifrasDeControlF(Model model, ReportesTercerosDTO reportesTercerosDTO) {
        if (reportesTercerosDTO.isCancel()) {
            reportesTercerosDTO = new ReportesTercerosDTO();
        }
        // Validaciones
        reportesTercerosDTO.setUniCicloRequired(Boolean.FALSE);
        reportesTercerosDTO.setQnaCapturaRequired(Boolean.TRUE);
        reportesTercerosDTO.setTipoNominaRequired(Boolean.TRUE);
        reportesTercerosDTO.setComplementoRequired(Boolean.TRUE);
                
        model.addAttribute(reportesTercerosDTO);
        return super.getViewName("cifrasDeControlF");
    }
    
    @RequestMapping
    public String cifrasDeControlA(Model model, ReportesTercerosDTO reportesTercerosDTO) {
        if (reportesTercerosDTO.isCancel()) {
            reportesTercerosDTO = new ReportesTercerosDTO();
        }
        
        // Validaciones
        reportesTercerosDTO.setUniCicloRequired(Boolean.FALSE);
        reportesTercerosDTO.setQnaCapturaRequired(Boolean.TRUE);
        reportesTercerosDTO.setTipoNominaRequired(Boolean.TRUE);
        reportesTercerosDTO.setComplementoRequired(Boolean.TRUE);
                
        model.addAttribute(reportesTercerosDTO);
        return super.getViewName("cifrasDeControlA");
    }   
    /**
     * Metodo inicial para reporte de cifras de control
     * @author Equipo de Desarrollo.
     * @param model Model
     * @param cifrasDeControlC CifrasDeControlC
     */
    @RequestMapping
    public String cifrasDeControlC(Model model, ReportesTercerosDTO reportesTercerosDTO) {
        if (reportesTercerosDTO.isCancel()) {
            reportesTercerosDTO = new ReportesTercerosDTO();
        
        // Validaciones
         reportesTercerosDTO.setQnaCapturaRequired(Boolean.TRUE);
        }
        model.addAttribute(reportesTercerosDTO);
        return super.getViewName("cifrasDeControlC"); //Va el nombre de la JSP o del Servlet 
    }
         /**
          * Metodo inicial para reporte de comprobantes FONAC
          * @author Equipo de Desarrollo.
          * @param model Model
          * @param aportacionesFonac 
          */
         @RequestMapping
         public String aportacionesFonac(Model model, ReportesTercerosDTO reportesTercerosDTO) {
             if (reportesTercerosDTO.isCancel()) {
                 reportesTercerosDTO = new ReportesTercerosDTO();
             }
             // Unidades
             if (reportesTercerosDTO.getIdUnidad() != null) {
                 if (reportesTercerosDTO.getIdUnidad().equals("0")) {
                     List<String> dimensiones = super.security().getDimensionPrimaryLevel("SIREHUNIDAD");
                     StringBuffer sb = new StringBuffer();
                     
                     for (String dim: dimensiones) {
                         sb.append("'").append(dim).append("',");
                     }
                     if (sb.length() > 0) {
                         sb.delete(sb.length() - 1, sb.length());
                     }
                     reportesTercerosDTO.setUnidades(sb.toString());
                 } else {
                     reportesTercerosDTO.setUnidades("'" + reportesTercerosDTO.getIdUnidad() + "'");
                 }
             }

             // Validaciones
              reportesTercerosDTO.setUniCicloRequired(Boolean.TRUE);
              reportesTercerosDTO.setTipoNominaRequired(Boolean.TRUE);
              reportesTercerosDTO.setIdUnidadRequired(Boolean.FALSE);
             
             model.addAttribute(reportesTercerosDTO);
             return super.getViewName("aportacionesFonac"); //Va el nombre de la JSP o del Servlet ?.  Respuesta: JSP
         }
         
    @RequestMapping
    public String terSarFovResumen(Model model, GeneraArchivosTercerosDTO generaArchivosTercerosDTO){
        String formtatoFecha = "dd/MM/yyyy";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(formtatoFecha);
        String  QC          = "";
        String  QI          = "";
        Integer vCiclo      = null;
        Integer vBimestre   = null;
       
        if(generaArchivosTercerosDTO.isCancel()){   generaArchivosTercerosDTO = new GeneraArchivosTercerosDTO();   }
        
        if((generaArchivosTercerosDTO.getCiclo() != null) || generaArchivosTercerosDTO.getBimestre() != null ){
            if((generaArchivosTercerosDTO.getCiclo().equalsIgnoreCase("0")) || (generaArchivosTercerosDTO.getBimestre().equalsIgnoreCase("0"))){
                generaArchivosTercerosDTO.setMuestraReporte(false);
                generaArchivosTercerosDTO.setMuestraRegistros(false);
                super.saveError(model, "El ciclo y el bimestre son campos obligatorios.");
            }
            else { 
                vCiclo      = new Integer(generaArchivosTercerosDTO.getCiclo());
                vBimestre   = new Integer(generaArchivosTercerosDTO.getBimestre());
                
                generaArchivosTercerosDTO.setMuestraRegistros(true);
                generaArchivosTercerosDTO.setBeanName("resumenSar");;
                
                if(vBimestre == 1){       QC = vCiclo + "05";
                                          QI = vCiclo + "01";}
                else if(vBimestre == 2){  QC = vCiclo + "09";
                                          QI = vCiclo + "05";}
                else if(vBimestre == 3){  QC = vCiclo + "13";
                                          QI = vCiclo + "09";}
                else if(vBimestre == 4){  QC = vCiclo + "17";
                                          QI = vCiclo + "13";}
                else if(vBimestre == 5){  QC = vCiclo + "21";
                                          QI = vCiclo + "17";}
                else if(vBimestre == 6){  QC = vCiclo + "24";
                                          QI = vCiclo + "21";}
                
                generaArchivosTercerosDTO.setHpIniPago(simpleDateFormat.format(SirehUtils.getQuincenaCapturaAsDate(new Integer(QC), 'I') ));
                generaArchivosTercerosDTO.setQnaFin(QC);
                generaArchivosTercerosDTO.setQnaIni(QI);
                logger.debug("****");
                
                if(generaArchivosTercerosDTO.isMuestraReporte()){
                    StringBuffer stringBuffer = new StringBuffer();
                    
                    if(generaArchivosTercerosDTO.getSeleccionConsecNomina() != null){
                        if(generaArchivosTercerosDTO.getSeleccionConsecNomina().length > 0){
                            for(String consecutivoNomina:generaArchivosTercerosDTO.getSeleccionConsecNomina()){
                                stringBuffer.append(consecutivoNomina); stringBuffer.append(",");
                            }
                            String string = stringBuffer.toString(); string = string.substring(0, (string.length() - 1));
                            generaArchivosTercerosDTO.setHpConsecNomina(string);
                        }
                    }
                    else {
                        generaArchivosTercerosDTO.setMuestraReporte(false);
                        super.saveError(model, "Seleccione las nominas que seran consultadas ... ");
                        return super.getViewName("terSarFovResumen");
                    }
                }
            }
        }
        model.addAttribute(generaArchivosTercerosDTO);
        return super.getViewName("terSarFovResumen");
    }
    
    @RequestMapping
    public String terSarFovTotalNom(Model model, GeneraArchivosTercerosDTO generaArchivosTercerosDTO){
        String formtatoFecha = "dd/MM/yyyy";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(formtatoFecha);
        String  QC          = "";
        Integer vCiclo      = null;
        Integer vBimestre   = null;
        
        if(generaArchivosTercerosDTO.isCancel()){   generaArchivosTercerosDTO = new GeneraArchivosTercerosDTO();   }
        
        if((generaArchivosTercerosDTO.getCiclo() != null) || generaArchivosTercerosDTO.getBimestre() != null ){
            if((generaArchivosTercerosDTO.getCiclo().equalsIgnoreCase("0")) || (generaArchivosTercerosDTO.getBimestre().equalsIgnoreCase("0"))){
                generaArchivosTercerosDTO.setMuestraReporte(false);
                generaArchivosTercerosDTO.setMuestraRegistros(false);
                super.saveError(model, "El ciclo y el bimestre son campos obligatorios.");
            }
            else { 
                vCiclo      = new Integer(generaArchivosTercerosDTO.getCiclo());
                vBimestre   = new Integer(generaArchivosTercerosDTO.getBimestre());
                
                generaArchivosTercerosDTO.setMuestraRegistros(true);
                generaArchivosTercerosDTO.setBeanName("incidenciasQQ");;
                
                if(vBimestre == 1){       QC = vCiclo + "05";  }
                else if(vBimestre == 2){  QC = vCiclo + "09";  }
                else if(vBimestre == 3){  QC = vCiclo + "13";  }
                else if(vBimestre == 4){  QC = vCiclo + "17";  }
                else if(vBimestre == 5){  QC = vCiclo + "21";  }
                else if(vBimestre == 6){  QC = (vCiclo + 1) + "01";   }
                
                generaArchivosTercerosDTO.setHpIniPago(simpleDateFormat.format(SirehUtils.getQuincenaCapturaAsDate(new Integer(QC), 'I') ));
                generaArchivosTercerosDTO.setQnaIni(QC);
                logger.debug("****");
                
                if(generaArchivosTercerosDTO.isMuestraReporte()){
                    StringBuffer stringBuffer = new StringBuffer();
                    
                    if(generaArchivosTercerosDTO.getSeleccionConsecNomina() != null){
                        if(generaArchivosTercerosDTO.getSeleccionConsecNomina().length > 0){
                            for(String consecutivoNomina:generaArchivosTercerosDTO.getSeleccionConsecNomina()){
                                stringBuffer.append(consecutivoNomina); stringBuffer.append(",");
                            }
                            String string = stringBuffer.toString(); string = string.substring(0, (string.length() - 1));
                            generaArchivosTercerosDTO.setHpConsecNomina(string);
                        }
                    }
                    else {
                        generaArchivosTercerosDTO.setMuestraReporte(false);
                        super.saveError(model, "Seleccione las nominas que seran consultadas ... ");
                        return super.getViewName("terSarFovTotalNom");
                    }
                }
            }
        }
        model.addAttribute(generaArchivosTercerosDTO);
        return super.getViewName("terSarFovTotalNom");
    }
    
    @RequestMapping
    public String terSarFovTotalPagos(Model model, GeneraArchivosTercerosDTO generaArchivosTercerosDTO){
        String formtatoFecha = "dd/MM/yyyy";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(formtatoFecha);
        String  QC          = "";
        Integer vCiclo      = null;
        Integer vBimestre   = null;
        
        if(generaArchivosTercerosDTO.isCancel()){   generaArchivosTercerosDTO = new GeneraArchivosTercerosDTO();   }
        
        if((generaArchivosTercerosDTO.getCiclo() != null) || generaArchivosTercerosDTO.getBimestre() != null ){
            if((generaArchivosTercerosDTO.getCiclo().equalsIgnoreCase("0")) || (generaArchivosTercerosDTO.getBimestre().equalsIgnoreCase("0"))){
                generaArchivosTercerosDTO.setMuestraReporte(false);
                generaArchivosTercerosDTO.setMuestraRegistros(false);
                super.saveError(model, "El ciclo y el bimestre son campos obligatorios.");
            }
            else { 
                vCiclo      = new Integer(generaArchivosTercerosDTO.getCiclo());
                vBimestre   = new Integer(generaArchivosTercerosDTO.getBimestre());
                
                generaArchivosTercerosDTO.setMuestraRegistros(true);
                generaArchivosTercerosDTO.setBeanName("incidenciasQQ");
                
                if(vBimestre == 1){       QC = vCiclo + "05";  }
                else if(vBimestre == 2){  QC = vCiclo + "09";  }
                else if(vBimestre == 3){  QC = vCiclo + "13";  }
                else if(vBimestre == 4){  QC = vCiclo + "17";  }
                else if(vBimestre == 5){  QC = vCiclo + "21";  }
                else if(vBimestre == 6){  QC = (vCiclo + 1) + "01";   }
                
                generaArchivosTercerosDTO.setHpIniPago(simpleDateFormat.format(SirehUtils.getQuincenaCapturaAsDate(new Integer(QC), 'I') ));
                generaArchivosTercerosDTO.setQnaIni(QC);
                logger.debug("****");
                
                if(generaArchivosTercerosDTO.isMuestraReporte()){
                    StringBuffer stringBuffer = new StringBuffer();
                    
                    if(generaArchivosTercerosDTO.getSeleccionConsecNomina() != null){
                        if(generaArchivosTercerosDTO.getSeleccionConsecNomina().length > 0){
                            for(String consecutivoNomina:generaArchivosTercerosDTO.getSeleccionConsecNomina()){
                                stringBuffer.append(consecutivoNomina); stringBuffer.append(",");
                            }
                            String string = stringBuffer.toString(); string = string.substring(0, (string.length() - 1));
                            generaArchivosTercerosDTO.setHpConsecNomina(string);
                        }
                    }
                    else {
                        generaArchivosTercerosDTO.setMuestraReporte(false);
                        super.saveError(model, "Seleccione las nominas que seran consultadas ... ");
                        return super.getViewName("terSarFovTotalPagos");
                    }
                }
            }
        }
        model.addAttribute(generaArchivosTercerosDTO);
        return super.getViewName("terSarFovTotalPagos");
    }
    
    @RequestMapping
    public String aportacionesFonacQna(Model model, GeneraArchivosTercerosDTO generaArchivosTercerosDTO){
        if(generaArchivosTercerosDTO.isCancel()){   generaArchivosTercerosDTO = new GeneraArchivosTercerosDTO();   }
        if(generaArchivosTercerosDTO.getQnaIni() != null){
            if(generaArchivosTercerosDTO.getQnaIni().equalsIgnoreCase("0")){
                generaArchivosTercerosDTO.setMuestraReporte(false);
                generaArchivosTercerosDTO.setMuestraRegistros(false);
                super.saveError(model, "La quincena es campo obligatorio.");
            } else{
                    generaArchivosTercerosDTO.setMuestraRegistros(true);
                    generaArchivosTercerosDTO.setBeanName("aportacionesFonacQna");
                    
                    if(generaArchivosTercerosDTO.isMuestraReporte()){
                        StringBuffer stringBuffer = new StringBuffer();
                        
                        if(generaArchivosTercerosDTO.getSeleccionConsecNomina() != null){
                            if(generaArchivosTercerosDTO.getSeleccionConsecNomina().length > 0){
                                for(String consecutivoNomina:generaArchivosTercerosDTO.getSeleccionConsecNomina()){
                                    stringBuffer.append(consecutivoNomina); stringBuffer.append(",");
                                }
                                String string = stringBuffer.toString(); string = string.substring(0, (string.length() - 1));
                                generaArchivosTercerosDTO.setHpConsecNomina(string);
                            }
                        }
                        else {
                            generaArchivosTercerosDTO.setMuestraReporte(false);
                            super.saveError(model, "Seleccione las nominas que seran consultadas ... ");
                            return super.getViewName("aportacionesFonacQna");
                        }
                    }
                }
        }
        model.addAttribute(generaArchivosTercerosDTO);
        return super.getViewName("aportacionesFonacQna");
    }
    
    @RequestMapping
    public String terSarFovRechazos(Model model, GeneraArchivosTercerosDTO generaArchivosTercerosDTO){
    
        model.addAttribute(generaArchivosTercerosDTO);
        return super.getViewName("terSarFovRechazos"); 
    }

    @RequestMapping
    public String padronSeguros(Model model, GeneraArchivosTercerosDTO generaArchivosTercerosDTO, HttpServletResponse response) throws IOException {
        List<String> datos = null;
        if(generaArchivosTercerosDTO.isCancel()){ generaArchivosTercerosDTO = new GeneraArchivosTercerosDTO(); }
        
        if(generaArchivosTercerosDTO.getQnaIni() != null){
            if(generaArchivosTercerosDTO.getQnaIni().equalsIgnoreCase("0")){
                super.saveError(model, "La quincena es campo obligatorio.");
            } else{
                    datos = super.getService(MovimientoNominaService.class).padronSeguros(generaArchivosTercerosDTO);
                    if (datos.isEmpty()) { super.saveWarning(model, "warn.empty.chkolist"); return super.getViewName("padronSeguros"); } 
                    else {
                            StringBuilder strCsv = new StringBuilder();
                            for (String renglon: datos) { strCsv.append(renglon).append("\r\n"); }
                            byte[] bytes = strCsv.toString().getBytes();
                            response.setContentType("text/csv");
                            response.setContentLength(bytes.length);
                            response.setHeader("Content-Disposition", "attachment; filename=\"" + "padrondelaQna_" +generaArchivosTercerosDTO.getQnaIni() + "seguros.csv");
                            OutputStream out = response.getOutputStream();
                            out.write(bytes, 0, bytes.length);
                            return null;
                        }
                }
        }     
        
        model.addAttribute(generaArchivosTercerosDTO);
        return super.getViewName("padronSeguros"); 
    }

    @RequestMapping
    public String constanciasF(Model model, ReportesConstanciasDTO reportesConstanciasDTO){
        reportesConstanciasDTO.setMuestraReporte(false);
        String datos = null;
        String [] sDatos = null;
        String delimit = "-";
        if(reportesConstanciasDTO.isCancel()){  reportesConstanciasDTO = new ReportesConstanciasDTO();  }
        
        if( (reportesConstanciasDTO.getRfcEmpleado()) != null  && (reportesConstanciasDTO.getRfcEmpleado2() != null) && 
            (reportesConstanciasDTO.getQnaIni() != null)){
                if(reportesConstanciasDTO.getRfcEmpleado().equalsIgnoreCase("")){
                    super.saveError(model, "error.reportes.tercerosNomina.cf.rfc.empl");
                    model.addAttribute(reportesConstanciasDTO);
                    return super.getViewName("constanciasF");
                } 
                if(reportesConstanciasDTO.getRfcEmpleado2().equalsIgnoreCase("")){
                    super.saveError(model, "error.reportes.tercerosNomina.cf.rfc.resp");
                    model.addAttribute(reportesConstanciasDTO);
                    return super.getViewName("constanciasF");
                }
                if(reportesConstanciasDTO.getQnaIni().equalsIgnoreCase("0")){
                    super.saveError(model, "clc.proceso.clcOrdinaria.error.qnaPago");
                    model.addAttribute(reportesConstanciasDTO);
                    return super.getViewName("constanciasF");
                }
                if(reportesConstanciasDTO.getNoOficio() == null){
                    super.saveError(model, "error.reportes.tercerosNomina.cf.certific");
                    model.addAttribute(reportesConstanciasDTO);
                    return super.getViewName("constanciasF");
                }
                
                datos = super.getService(MovimientoNominaService.class).constanciasF(reportesConstanciasDTO);
                if(datos != null){
                    if(datos.length() > 0){
                        sDatos = datos.split(delimit);
                        reportesConstanciasDTO.setNombreResponsable(sDatos[0]);
                        reportesConstanciasDTO.setCargoResponsable(sDatos[1]);
                        reportesConstanciasDTO.setQnaFin(Integer.toString(Integer.parseInt(reportesConstanciasDTO.getQnaIni(), 10)-1));
                        reportesConstanciasDTO.setMuestraReporte(true);
                    }
                    else {
                        super.saveError(model, "error.reportes.tercerosNomina.cf.certific.ne");
                        model.addAttribute(reportesConstanciasDTO);
                        return super.getViewName("constanciasF");
                    }
                } else {  
                      super.saveError(model, "error.reportes.tercerosNomina.cf.certific.nof");
                      model.addAttribute(reportesConstanciasDTO);
                      return super.getViewName("constanciasF");
                  }
        }
        model.addAttribute(reportesConstanciasDTO);
        return super.getViewName("constanciasF");
    }
    
    @RequestMapping
    public String importesGnp(Model model) {GnpDTO gnpDTO = new GnpDTO();
        if (gnpDTO.isCancel()) {
            gnpDTO = new GnpDTO();
        }
        model.addAttribute(gnpDTO);
        return super.getViewName("importesGnp");

    }

    @RequestMapping
    public String generaRepImpGnp(Model model, GnpDTO gnpDTO, HttpServletResponse response) throws IOException {

        if ((gnpDTO.getQnaIni().equalsIgnoreCase("0")) && (gnpDTO.getQnaIni().equalsIgnoreCase("0"))) {
            super.saveError(model, "El campo quincena inicial y quincena final deben especificarse ");
            return super.getViewName("importesGnp");
         }
        if (gnpDTO.getQnaIni().equalsIgnoreCase("0")) {
            super.saveError(model, "El campo quincena inicial debe especificarse ");
            return super.getViewName("importesGnp");
         }
        if (gnpDTO.getQnaFin().equalsIgnoreCase("0")) {
            super.saveError(model, "El campo quincena final debe especificarse ");
            return super.getViewName("importesGnp");
         }

    List<String> datos = super.getService(TercerosService.class).getDatosGnpImp(gnpDTO);
         
    StringBuilder strCsv = new StringBuilder();
    strCsv.append("Tipo Contratacion,Unidad,Estado,Primer Apellido,Segundo Apellido,Nombre,Rfc,CURP,Sexo,Prima Trabajador,Prima Dependencia,Total Pagar,Situacion\n");
    for(String renglon : datos){
        strCsv.append(renglon).append("\r\n");    
    }
        
    byte[] bytes = strCsv.toString().getBytes();
    response.setContentType("text/csv");
    response.setContentLength(bytes.length);
    response.setHeader("Content-Disposition", "attachment; filename=\"" + "Tercero_" + "ImportesGNP.csv");
    OutputStream out = response.getOutputStream();
    out.write(bytes, 0, bytes.length);

    return null;
         
    }   
    
    @RequestMapping
    public String movimientosGnp(Model model) {GnpDTO gnpDTO = new GnpDTO();
        if (gnpDTO.isCancel()) {
            gnpDTO = new GnpDTO();
        }
        model.addAttribute(gnpDTO);
        return super.getViewName("movimientosGnp");

    }

    @RequestMapping
    public String generaMovtosGnp(Model model, GnpDTO gnpDTO, HttpServletResponse response) throws IOException {

        if ((gnpDTO.getQnaIni().equalsIgnoreCase("0")) && (gnpDTO.getQnaIni().equalsIgnoreCase("0"))) {
            super.saveError(model, "El campo quincena inicial y quincena final deben especificarse ");
            return super.getViewName("movimientosGnp");
         }
        if (gnpDTO.getQnaIni().equalsIgnoreCase("0")) {
            super.saveError(model, "El campo quincena inicial debe especificarse ");
            return super.getViewName("movimientosGnp");
         }
        if (gnpDTO.getQnaFin().equalsIgnoreCase("0")) {
            super.saveError(model, "El campo quincena final debe especificarse ");
            return super.getViewName("movimientosGnp");
         }

    List<String> datos = super.getService(TercerosService.class).getDatosGnpMov(gnpDTO);
         
    StringBuilder strCsv = new StringBuilder();
    strCsv.append("Primer Apellido,Segundo Apellido,Nombre,Rfc,CURP,Sexo,Movto,Fecha Movto,Inic Lic,Fin Lic,Estado\n");
    for(String renglon : datos){
        strCsv.append(renglon).append("\r\n");    
    }
        
    byte[] bytes = strCsv.toString().getBytes();
    response.setContentType("text/csv");
    response.setContentLength(bytes.length);
    response.setHeader("Content-Disposition", "attachment; filename=\"" + "Tercero_" + "MovtosGNP.csv");
    OutputStream out = response.getOutputStream();
    out.write(bytes, 0, bytes.length);

    return null;
         
    }   

    /**
     * 
     * @author Ricardo L.
     * @param model Model
     * @param reportesTercerosDTO ReportesTercerosDTO
     * @return String
     */
    @RequestMapping
    public String pensionIssste(Model model, ReportesTercerosDTO reportesTercerosDTO) {
        StringBuilder strCsv = new StringBuilder();

        if (reportesTercerosDTO.isCancel()) {
            reportesTercerosDTO = new ReportesTercerosDTO();
        }
        reportesTercerosDTO.setQnaCapturaRequired(Boolean.TRUE);
            
        model.addAttribute(reportesTercerosDTO);
        return super.getViewName("pensionIssste");        
    }

    /**
     * 
     * @author Ricardo L.
     * @param model Model
     * @param reportesTercerosDTO ReportesTercerosDTO
     * @return String
     */
    @RequestMapping
    public String generapensionIssste(Model model, ReportesTercerosDTO reportesTercerosDTO, HttpServletResponse response) throws IOException {
        String fileName;
        fileName = null;
        String quincena = reportesTercerosDTO.getQnaCaptura();
        StringBuilder strCsv = new StringBuilder();

        if (reportesTercerosDTO.getQnaCaptura() == "0") {
            super.saveError(model, "sireh.label.reportes.terceros.error.qnaCaptura");
        }

        if ((reportesTercerosDTO.getQnaCaptura() != null) && (reportesTercerosDTO.getQnaCaptura() != "0")) {
            List<String> datos = super.getService(TercerosService.class).generaPensionIssste(quincena);

            for (String renglon: datos) {
                 strCsv.append(renglon).append("\r\n");
            }
        }
        reportesTercerosDTO.setQnaCapturaRequired(Boolean.TRUE);
        byte[] bytes = strCsv.toString().getBytes();
        response.setContentType("text/plain");
        response.setContentLength(bytes.length);
        response.setHeader("Content-Disposition", "attachment; filename=\"" + "ArchivoPensionISSSTE" + quincena + ".txt");
        OutputStream out = response.getOutputStream();
        out.write(bytes, 0, bytes.length);
               
        model.addAttribute(reportesTercerosDTO);
        return null;
    }
    
    /**
     * 
     * @author Martin C.
     * @param model Model
     * @param repComprobanteFiscalDTO RepComprobanteFiscalDTO
     * @return String
     */
    @RequestMapping
    public String repComprobanteFiscalCanc(Model model, RepComprobanteFiscalDTO repComprobanteFiscalDTO) {
        if(repComprobanteFiscalDTO.isLimpiar()){
            repComprobanteFiscalDTO = new RepComprobanteFiscalDTO();
        }
        
        List<String> dimensionesList = new ArrayList<String>();
        List<String> tipoNominaList = new ArrayList<String>();
        List<String> quincenasList = new ArrayList<String>();
        List<String> complementosList = new ArrayList<String>();
        if(repComprobanteFiscalDTO.getUnidad() != null && repComprobanteFiscalDTO.getQnaPago() != null && repComprobanteFiscalDTO.getComplemento() != null && repComprobanteFiscalDTO.getTipoNomina() != null){
            if(repComprobanteFiscalDTO.getUnidad().equals("0")){
                dimensionesList = super.security().getDimensionPrimaryLevel("SIREHUNIDAD");
            } else {
                dimensionesList.add(repComprobanteFiscalDTO.getUnidad());
            }
            
            logger.debug("Unidades: " + dimensionesList);
            
            if(repComprobanteFiscalDTO.getTipoNomina().equals("0")){
                tipoNominaList = super.getService(ReporteTercerosNominaService.class).getTiposNominaHistPagoByUnidad(dimensionesList);
            } else {  
                tipoNominaList.add(repComprobanteFiscalDTO.getTipoNomina());
            }
            
            logger.debug("Tipo Nominas: " + repComprobanteFiscalDTO.getTipoNominaList());
            
            if(repComprobanteFiscalDTO.getQnaPago().equals("0")){
                quincenasList = super.getService(ReporteTercerosNominaService.class).getQnasPagoFromHistoricoPago(SirehUtils.getQuincenaCapturaAsInteger(new Date()));
            } else {
                quincenasList.add(repComprobanteFiscalDTO.getQnaPago());
            }
            
            logger.debug("Quincenas Pago: " + quincenasList);
            
            if(repComprobanteFiscalDTO.getComplemento().equals("-1")){
                complementosList = super.getService(ReporteTercerosNominaService.class).getComplementosByUnidadQnaPago(quincenasList, dimensionesList, tipoNominaList);
                //repComprobanteFiscalDTO.setComplementoList(complementosList);
            } else {
                complementosList.add(repComprobanteFiscalDTO.getComplemento());
            }
            
            repComprobanteFiscalDTO.setQnaCaptura(SirehUtils.getQuincenaCapturaAsInteger(new Date()));
            repComprobanteFiscalDTO.setMuestraReporte(true);
            
            StringBuffer sb1 = new StringBuffer();
            StringBuffer sb2 = new StringBuffer();
            StringBuffer sb3 = new StringBuffer();
            StringBuffer sb4 = new StringBuffer();
            for(String item : dimensionesList){
                sb1.append("'").append(item).append("',");
            }
            if(sb1.length() > 0){
                sb1.delete(sb1.length() - 1, sb1.length());
                //repComprobanteFiscalDTO.setUnidad(sb1.toString());
                repComprobanteFiscalDTO.setUnidadList(sb1.toString());
            }
            
            for(String item : tipoNominaList){
                sb2.append("'").append(item).append("',");
            }
            if(sb2.length() > 0){
                sb2.delete(sb2.length() - 1, sb2.length());
                //repComprobanteFiscalDTO.setTipoNomina(sb2.toString());
                 repComprobanteFiscalDTO.setTipoNominaList(sb2.toString());
            }
            
            for(String item : quincenasList){
                sb3.append("'").append(item).append("',");
            }
            if(sb3.length() > 0){
                sb3.delete(sb3.length() - 1, sb3.length());
                //repComprobanteFiscalDTO.setQnaPago(sb3.toString());
                 repComprobanteFiscalDTO.setQnaPagoList(sb3.toString());
            }
            
            for(String item : complementosList){
                sb4.append("'").append(item).append("',");
            }
            if(sb4.length() > 0){
                sb4.delete(sb4.length() - 1, sb4.length());
                //repComprobanteFiscalDTO.setComplemento(sb4.toString());
                 repComprobanteFiscalDTO.setComplementoList(sb4.toString());
            }
        }
        model.addAttribute(repComprobanteFiscalDTO);
        return super.getViewName("comprobanteFiscal");
    }
}
