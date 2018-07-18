package gob.shcp.sireh.control.clc.reporte;

import gob.shcp.fsn.control.AbstractController;
import gob.shcp.fsn.control.support.AnnotatedController;
import gob.shcp.sireh.model.clc.EtiquetaClaveValorEntero;
import gob.shcp.sireh.model.clc.reportes.CustomPrestacionesTriOutputFileDTO;
import gob.shcp.sireh.model.clc.reportes.RepTercerosDTO;
import gob.shcp.sireh.model.clc.reportes.ReportesCxlcDTO;
import gob.shcp.sireh.model.plaza.reporte.ReportePlazaDTO;
import gob.shcp.sireh.service.clc.herramientas.ClcHerramientasService;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import javax.servlet.http.HttpServletResponse;

import org.apache.commons.io.IOUtils;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFFont;
import org.apache.poi.hssf.usermodel.HSSFPalette;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.hssf.util.CellReference;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.util.CellRangeAddress;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ReporteCxlcController extends AbstractController implements AnnotatedController {
    
    @RequestMapping
    public String generaExcelTest(Model model, ReportesCxlcDTO reportesCxlcDTO, HttpServletResponse response) {
        BufferedWriter bw = null;
        
        try {
            
            // Genera archivo temporal xls
            String fileNameRandom = UUID.randomUUID().toString();
            String fileNameTemp =  fileNameRandom + ".xls";
            File file = new File(super.configuration().getString("local.temp.dir") + File.separator + fileNameTemp);
            
            // Genera xls
            Workbook libro = new HSSFWorkbook();
            FileOutputStream archivo = new FileOutputStream(super.configuration().getString("local.temp.dir") + File.separator + fileNameTemp);
            Sheet hoja1 = libro.createSheet("Hoja 1");
            Sheet hoja2 = libro.createSheet("Hoja 2");
            Sheet hoja3 = libro.createSheet("Hoja 3");
            bw = new BufferedWriter(new FileWriter(file, true));
            
            // Hoja 1 - Escribir en archivo
            for (int x = 0; x < 20; x++) {
                Row fila = hoja1.createRow(x);
                for (int i = 0; i < 5; i++) {
                    Cell celda = fila.createCell(i);
                    celda.setCellValue("Hola Mundo");
                }
            }
            
            // Hoja 2 - Escribir en archivo
            for (int x = 0; x < 20; x++) {
                Row fila2 = hoja2.createRow(x);
                for (int i = 0; i < 5; i++) {
                    Cell celda2 = fila2.createCell(i);
                    celda2.setCellValue("Hola Mundo 2");
                }
            }
            
            // Hoja 3 - Escribir en archivo
            for (int x = 0; x < 20; x++) {
                Row fila3 = hoja3.createRow(x);
                for (int i = 0; i < 5; i++) {
                    Cell celda3 = fila3.createCell(i);
                    celda3.setCellValue("Hola Mundo 3");
                }
            }
            libro.write(archivo);
            
            // Descarga archivo xls
            byte[] bytes = IOUtils.toByteArray(new FileInputStream(file));
            response.setContentType("application/vnd.ms-excel");
            response.setContentLength(bytes.length);
            response.setHeader("Content-Disposition", "attachment; filename=NombreDelArchivo.xls");
            OutputStream out = response.getOutputStream();
            out.write(bytes, 0, bytes.length);
            
        } catch (Exception e) {
            logger.debug("Exception: " + e);
        } finally {
            try {
                bw.close();
            } catch (Exception e) {
                logger.debug("Exception: " + e);
            }
        }
        return null;
    }
    
    /**
     * Reportes - CLC - Solicitud de suficiencia presupuestaria - Ordinaria 
     * @author Oscar S.
     * @param model Model
     * @param reportesCxlcDTO ReportesCxlcDTO
     * @return String
     */
    @RequestMapping
    public String SolOrdi(Model model, ReportesCxlcDTO reportesCxlcDTO) {
        if (reportesCxlcDTO.isMuestraReporte()) {
            if (reportesCxlcDTO.getUniCiclo() == null || reportesCxlcDTO.getUniCiclo().equals("0")) {
                super.saveError(model, "clc.herramientas.registro.error.cxlcCiclo");
            }
            if (reportesCxlcDTO.getQnaCaptura() == null || 
                reportesCxlcDTO.getQnaCaptura().equals("0")) {
                super.saveError(model, "clc.herramientas.registro.error.cxlcQnaPago");
            }
            if (reportesCxlcDTO.getTipoNomina() == null || 
                reportesCxlcDTO.getTipoNomina().equals("0")) {
                super.saveError(model, "clc.herramientas.registro.error.idTipoNomina");
            }
            if (reportesCxlcDTO.getComplemento().equals("-1")) {
                super.saveError(model, "clc.herramientas.registro.error.cxlcComplemento");
            }
            if (reportesCxlcDTO.getClc() == null || 
                reportesCxlcDTO.getClc().equals("0")) {
                super.saveError(model, "clc.herramientas.registro.error.cxlc");
            }
            
            // Datos Adicionales
            super.getService(ClcHerramientasService.class).updateDatosAdicionalesCLC(reportesCxlcDTO);
        } else {
            reportesCxlcDTO.setUniCiclo(reportesCxlcDTO.getUniCiclo() == null ? "0" : reportesCxlcDTO.getUniCiclo());
            reportesCxlcDTO.setClc(reportesCxlcDTO.getClc() == null ? "0" : reportesCxlcDTO.getClc());
            reportesCxlcDTO.setQnaCaptura(reportesCxlcDTO.getQnaCaptura() == null ? "0" : reportesCxlcDTO.getQnaCaptura());
            reportesCxlcDTO.setComplemento(reportesCxlcDTO.getComplemento() == null ? "-1" : reportesCxlcDTO.getComplemento());
            reportesCxlcDTO.setTipoNomina(reportesCxlcDTO.getTipoNomina() == null ? "0" : reportesCxlcDTO.getTipoNomina());
        }
        
        model.addAttribute(reportesCxlcDTO);
        return super.getViewName("SolOrdi");
    }

    @RequestMapping
    public String SolRecu(Model model, ReportesCxlcDTO reportesCxlcDTO) {
        if (reportesCxlcDTO.isMuestraReporte()) {
            if (reportesCxlcDTO.getUniCiclo() == null || 
                reportesCxlcDTO.getUniCiclo().equals("0")) {
                super.saveError(model, "clc.herramientas.registro.error.cxlcCiclo");
            }
            if (reportesCxlcDTO.getQnaCaptura() == null || 
                reportesCxlcDTO.getQnaCaptura().equals("0")) {
                super.saveError(model, "clc.herramientas.registro.error.cxlcQnaPago");
            }
            if (reportesCxlcDTO.getTipoNomina() == null || 
                reportesCxlcDTO.getTipoNomina().equals("0")) {
                super.saveError(model, "clc.herramientas.registro.error.idTipoNomina");
            }
            if (reportesCxlcDTO.getComplemento().equals("-1")) {
                super.saveError(model, "clc.herramientas.registro.error.cxlcComplemento");
            }
            if (reportesCxlcDTO.getClc() == null || 
                reportesCxlcDTO.getClc().equals("0")) {
                super.saveError(model, "clc.herramientas.registro.error.cxlc");
            }
        } else {
            reportesCxlcDTO.setUniCiclo(reportesCxlcDTO.getUniCiclo() == null ? "0" : reportesCxlcDTO.getUniCiclo());
            reportesCxlcDTO.setClc(reportesCxlcDTO.getClc() == null ? "0" : reportesCxlcDTO.getClc());
            reportesCxlcDTO.setQnaCaptura(reportesCxlcDTO.getQnaCaptura() == null ? "0" : reportesCxlcDTO.getQnaCaptura());
            reportesCxlcDTO.setComplemento(reportesCxlcDTO.getComplemento() == null ? "-1" : reportesCxlcDTO.getComplemento());
            reportesCxlcDTO.setTipoNomina(reportesCxlcDTO.getTipoNomina() == null ? "0" : reportesCxlcDTO.getTipoNomina());
        }

        model.addAttribute(reportesCxlcDTO);
        return super.getViewName("SolRecu");
    }

    @RequestMapping
    public String SolIssste(Model model, ReportesCxlcDTO reportesCxlcDTO) {
        if (reportesCxlcDTO.isMuestraReporte()) {
            if (reportesCxlcDTO.getUniCiclo() == null || 
                reportesCxlcDTO.getUniCiclo().equals("0")) {
                super.saveError(model, "clc.herramientas.registro.error.cxlcCiclo");
            }
            if (reportesCxlcDTO.getQnaCaptura() == null || 
                reportesCxlcDTO.getQnaCaptura().equals("0")) {
                super.saveError(model, "clc.herramientas.registro.error.cxlcQnaPago");
            }
            if (reportesCxlcDTO.getTipoNomina() == null || 
                reportesCxlcDTO.getTipoNomina().equals("0")) {
                super.saveError(model, "clc.herramientas.registro.error.idTipoNomina");
            }
            if (reportesCxlcDTO.getComplemento().equals("-1")) {
                super.saveError(model, "clc.herramientas.registro.error.cxlcComplemento");
            }
            if (reportesCxlcDTO.getClc() == null || 
                reportesCxlcDTO.getClc().equals("0")) {
                super.saveError(model, "clc.herramientas.registro.error.cxlc");
            }
        } else {
            reportesCxlcDTO.setUniCiclo(reportesCxlcDTO.getUniCiclo() == null ? "0" : reportesCxlcDTO.getUniCiclo());
            reportesCxlcDTO.setClc(reportesCxlcDTO.getClc() == null ? "0" : reportesCxlcDTO.getClc());
            reportesCxlcDTO.setQnaCaptura(reportesCxlcDTO.getQnaCaptura() == null ? "0" : reportesCxlcDTO.getQnaCaptura());
            reportesCxlcDTO.setComplemento(reportesCxlcDTO.getComplemento() == null ? "-1" : reportesCxlcDTO.getComplemento());
            reportesCxlcDTO.setTipoNomina(reportesCxlcDTO.getTipoNomina() == null ? "0" : reportesCxlcDTO.getTipoNomina());
        }
        model.addAttribute(reportesCxlcDTO);
        return super.getViewName("SolIssste");
    }
    
    /**
     * Metodo inicial para reporte de terceros
     * @author Equipo de Desarrollo.
     * @param model Model
     * @param repTercerosDTO RepTercerosDTO
     * @return String
     */
    @RequestMapping
    public String repTerceros(Model model, RepTercerosDTO repTercerosDTO) {
        if (repTercerosDTO.isCancel()) {
            repTercerosDTO = new RepTercerosDTO();
        }
        if (repTercerosDTO.isLimpiar()) {
            repTercerosDTO = new RepTercerosDTO();
        }

        if (repTercerosDTO.isBuscar()){
            if (repTercerosDTO.getCiclo() == null || repTercerosDTO.getCiclo() == 0) {
                super.saveError(model, "clc.herramientas.registro.error.cxlcCiclo");   
            }
            if (repTercerosDTO.getQnaIni() == null || repTercerosDTO.getQnaIni() == 0) {
                super.saveError(model, "clc.herramientas.registro.error.cxlcQnaPago");   
            }
            if (repTercerosDTO.getComplemento() == null || repTercerosDTO.getComplemento() == -1) {
                super.saveError(model, "clc.herramientas.registro.error.cxlcComplemento");   
            }
            if (repTercerosDTO.getTiponom() == null || repTercerosDTO.getTiponom().equals("0")) {
                super.saveError(model, "clc.herramientas.registro.error.idTipoNomina");   
            }
        }
        if (repTercerosDTO.isMuestraRegistros()) {
            String primero = "SI";
            Integer bandera = 0;
            String[] consec = null;
            String[] consec1 = null;
            String[] consec2 = null;
            StringBuffer consecs = new StringBuffer();

            if (repTercerosDTO.getSeleccionQuincenal() != null) {
               consec = repTercerosDTO.getSeleccionQuincenal();
               //consecs.append("('");
                consecs.append("'");
               bandera = 1;
               for (String seleccionado: consec) {
                   if (primero == "NO") {
                      consecs.append(",'");
                   }
                primero = "NO";
                consecs.append(seleccionado);
                consecs.append("'");
               }
            }
            if (repTercerosDTO.getSeleccionMensual() != null) {
                consec1 = repTercerosDTO.getSeleccionMensual();
                if (bandera == 0) {
                   //consecs.append("('");
                   consecs.append("'");
                   bandera = 1;
               }
               for (String seleccionado1: consec1) {
                   if (primero == "NO") {
                      consecs.append(",'");
                   }
                   primero = "NO";
                   consecs.append(seleccionado1);
                   consecs.append("'");
               }
            }
            if (repTercerosDTO.getSeleccionBimestral() != null) {
                consec2 = repTercerosDTO.getSeleccionBimestral();
                if (bandera == 0) {
                   //consecs.append("('");
                    consecs.append("'");
                   bandera = 1;
                }
                for (String seleccionado2: consec2) {
                    if (primero == "NO") {
                       consecs.append(",'");
                    }
                    primero = "NO";
                    consecs.append(seleccionado2);
                    consecs.append("'");
                }
            }
            if (bandera > 0) {
                    //consecs.append(")");
                repTercerosDTO.setParametro1(consecs.toString());
            }
        }
        
        // despues de String va el nombre del elemento .Do del menu es el nombre del metodo del controlador definido en el menu-config
        model.addAttribute(repTercerosDTO);
        return super.getViewName("repTerceros"); //Va el nombre de la JSP o del Servlet 
    }

    @RequestMapping
    public String fonacFSTSE(Model model, ReportePlazaDTO reportePlazaDTO) {
        if (reportePlazaDTO.isCancel()) {
            reportePlazaDTO = new ReportePlazaDTO();
        }

        if (reportePlazaDTO.getMesQna() != null) {
            if (reportePlazaDTO.getMesQna().equalsIgnoreCase("0")) {
                reportePlazaDTO.setMuestraReporte(false);
                super.saveError(model, "error.reportes.actualizacionNomina.fonac");
                model.addAttribute(new ReportePlazaDTO());
                return super.getViewName("fonacFSTSE");
            } else {
                reportePlazaDTO.setMuestraReporte(true);
            }
        }
        
        model.addAttribute(reportePlazaDTO);
        return super.getViewName("fonacFSTSE");
    }

    @RequestMapping
    public String prestacionesT(Model model, ReportesCxlcDTO reportesCxlcDTO) {
        if (reportesCxlcDTO.isCancel()) {
            reportesCxlcDTO = new ReportesCxlcDTO();
        }
        
        // Obtener trimestres validos
        ArrayList<EtiquetaClaveValorEntero> trimestresValores = getTrimestreValores();
        // Combo trimestres
        reportesCxlcDTO.setTrimestreValores(trimestresValores);
        
        model.addAttribute(reportesCxlcDTO);
        return super.getViewName("prestacionesT");
    }
    
    /**
     * Metodo encargado de generar la lista de trimestres
     * @author Oscar S.
     * @return trimestreValores ArrayList<EtiquetaClaveValorEntero>
     */
    private ArrayList<EtiquetaClaveValorEntero> getTrimestreValores() {
        // Obtener trimestres validos
        ArrayList<EtiquetaClaveValorEntero> trimestreValores = new ArrayList<EtiquetaClaveValorEntero>();
        
        trimestreValores.add(new EtiquetaClaveValorEntero(new Integer(1), "1er trimestre"));
        trimestreValores.add(new EtiquetaClaveValorEntero(new Integer(2), "2do trimestre"));
        trimestreValores.add(new EtiquetaClaveValorEntero(new Integer(3), "3er trimestre"));
        trimestreValores.add(new EtiquetaClaveValorEntero(new Integer(4), "4to trimestre"));
        
        return trimestreValores;
    }
    
    /**
     * Metodo encargado de generar archivo xls de Prestaciones trimestrales.
     * @param model Model
     * @param reportesCxlcDTO ReportesCxlcDTO
     * @param response HttpServletResponse
     * @author Armando Zuñiga.
     */
    @RequestMapping
    public void generaExcelTrimestre(Model model, ReportesCxlcDTO reportesCxlcDTO, HttpServletResponse response) {
        BufferedWriter bw = null;
        
        try {
            if (reportesCxlcDTO.getUniCiclo() == null || reportesCxlcDTO.getUniCiclo().equals("")) {
                super.saveError(model, "error.reportes.clc.trimestre.ciclo");
            } else if (reportesCxlcDTO.getTrimestre() == null || reportesCxlcDTO.getTrimestre() == 0) {
                super.saveError(model, "error.reportes.clc.trimestre.trimestre");
            } else {
                
                Integer qnaIni;
                Integer qnaFin;
                String ciclo = reportesCxlcDTO.getUniCiclo();
                Integer trimestre = reportesCxlcDTO.getTrimestre();
                String trimestreTxt = "";
                
                if (trimestre == 1) {
                    qnaIni = new Integer(ciclo + "01");
                    qnaFin = new Integer(ciclo + "06");
                    trimestreTxt = "1er Trimestre ";
                } else if (trimestre == 2) {
                    qnaIni = new Integer(ciclo + "07");
                    qnaFin = new Integer(ciclo + "12");
                    trimestreTxt = "2do Trimestre ";
                } else if (trimestre == 3) {
                    qnaIni = new Integer(ciclo + "13");
                    qnaFin = new Integer(ciclo + "18");
                    trimestreTxt = "3er Trimestre ";
                } else {
                    qnaIni = new Integer(ciclo + "19");
                    qnaFin = new Integer(ciclo + "24");
                    trimestreTxt = "4to Trimestre ";
                }
                
                // Genera archivo temporal xls
                String fileNameRandom = UUID.randomUUID().toString();
                String fileNameTemp =  fileNameRandom + ".xls";
                File file = new File(super.configuration().getString("local.temp.dir") + File.separator + fileNameTemp);
                
                // Genera xls
                HSSFWorkbook libro = new HSSFWorkbook();
                FileOutputStream archivo = new FileOutputStream(super.configuration().getString("local.temp.dir") + File.separator + fileNameTemp);
                Sheet hoja1 = libro.createSheet("Resumen");
                Sheet hoja2 = libro.createSheet("Prestaciones Presupuestales");
                Sheet hoja3 = libro.createSheet("Prestaciones Eventuales");
                bw = new BufferedWriter(new FileWriter(file, true));
                
                // Hoja 1
                libro = generaHoja1(libro, hoja1, qnaIni, qnaFin, ciclo, trimestre);
                // Hoja 2
                libro = generaHoja2(libro, hoja2, qnaIni, qnaFin, ciclo);
                // Hoja 3
                libro = generaHoja3(libro, hoja3, qnaIni, qnaFin, ciclo);
                
                // Escribir archivo
                libro.write(archivo);

                // Descarga archivo xls
                byte[] bytes = IOUtils.toByteArray(new FileInputStream(file));
                response.setContentType("application/vnd.ms-excel");
                response.setContentLength(bytes.length);
                response.setHeader("Content-Disposition", "attachment; filename=ReporteTrimestral_" + ciclo + "-T" + trimestre + ".xls");
                OutputStream out = response.getOutputStream();
                out.write(bytes, 0, bytes.length);
            }
        } catch (IOException e) {
            e.getStackTrace();
            e.getMessage();
            logger.debug("*****");
            super.saveError(model, "error.reportes.clc.trimestre.error");
        }
    }
    
    /**
     * Metodo encargado de generar la hoja 1 del archivo de Prestaciones trimestrales.
     * @param libro HSSFWorkbook
     * @param hoja1 Sheet
     * @param qnaIni Integer
     * @param qnaFin Integer
     * @param ciclo String
     * @author Armando Zuñiga.
     * @return libro HSSFWorkbook
     */
    private HSSFWorkbook generaHoja1(HSSFWorkbook libro, Sheet hoja1, Integer qnaIni, Integer qnaFin, String ciclo, Integer trimestre) {
        Integer x;
        Integer y;
        
        // TODO: Llamada a servicio - Hoja 1
        List<CustomPrestacionesTriOutputFileDTO> items = super.getService(ClcHerramientasService.class).generaExcelTrimestre(qnaIni, qnaFin);
        
        // Hoja 1 - Escribir en archivo
        Row filac = hoja1.createRow(0);
        HSSFFont font = libro.createFont();
        HSSFCellStyle style = libro.createCellStyle();
        HSSFPalette palette = libro.getCustomPalette();
        
        // Hoja 1 - Cabecera - formato
        palette.setColorAtIndex(new Byte((byte) 41), new Byte((byte) 146), new Byte((byte) 208), new Byte((byte) 80));
        font.setBoldweight(HSSFFont.BOLDWEIGHT_BOLD);
        style.setFont(font);
        style.setAlignment(style.ALIGN_CENTER);
        
        // Hoja 1 - Cabecera                 
        Cell celdac = filac.createCell(0);                  
        celdac.setCellStyle(style);
        celdac.setCellValue("Prestaciones Trimestrales " + ciclo + ". Trimestre No. " + trimestre);
        hoja1.addMergedRegion(new CellRangeAddress(0, 0, 0,6));
        style.setFillForegroundColor(palette.getColor(41).getIndex());
        style.setFillPattern(style.SOLID_FOREGROUND);
        celdac.setCellStyle(style);
        
        Row fila0 = hoja1.createRow(1);
        Cell celda0 = fila0.createCell(0);                  
        celda0.setCellStyle(style);
        celda0.setCellValue("Descripción Prestación");                
        celda0 = fila0.createCell(1);
        celda0.setCellStyle(style);
        celda0.setCellValue("Estructura Monto");
        celda0 = fila0.createCell(2);
        celda0.setCellStyle(style);
        celda0.setCellValue("Estructura Casos");
        celda0 = fila0.createCell(3);
        celda0.setCellStyle(style);
        celda0.setCellValue("Eventuales Monto");                
        celda0 = fila0.createCell(4);
        celda0.setCellStyle(style);
        celda0.setCellValue("Eventuales Casos");
        celda0 = fila0.createCell(5);
        celda0.setCellStyle(style);
        celda0.setCellValue("Total Monto");
        celda0 = fila0.createCell(6);
        celda0.setCellStyle(style);
        celda0.setCellValue("Total Casos");
         
        x = 2;
        y = 1;
        
        // Hoja 1 - Formato - body
        HSSFCellStyle doubleStyle = libro.createCellStyle();
        HSSFCellStyle numericStyle = libro.createCellStyle();
        doubleStyle.setAlignment(doubleStyle.ALIGN_RIGHT);
        doubleStyle.setDataFormat(libro.getCreationHelper().createDataFormat().getFormat("#,###.##"));
        numericStyle.setAlignment(doubleStyle.ALIGN_RIGHT);
        numericStyle.setDataFormat(libro.getCreationHelper().createDataFormat().getFormat("_-* #,##0_-;-* #,##0_-;_-* \"-\"_-;_-@_-"));
         
        for (CustomPrestacionesTriOutputFileDTO item: items) {
            Row fila = hoja1.createRow(x);
            Cell celda = fila.createCell(0);                  
            celda.setCellValue(item.getDescPrestacion());
            
            Cell celda2 = fila.createCell(1);
            celda2.setCellValue(new Double(item.getEstructuraMonto()));
            celda2.setCellStyle(doubleStyle);
            
            Cell celda3 = fila.createCell(2);
            celda3.setCellValue(new Integer(item.getEstructuraCasos()));                    
            celda3.setCellStyle(numericStyle);
            
            Cell celda4 = fila.createCell(3);
            celda4.setCellValue(new Double(item.getEventualesMonto()));
            celda4.setCellStyle(doubleStyle);
            
            Cell celda5 = fila.createCell(4);
            celda5.setCellValue(new Integer(item.getEventualesCasos()));
            celda5.setCellStyle(numericStyle);
            
            Cell celda6 = fila.createCell(5);
            celda6.setCellValue(new Double(item.getTotalMonto()));
            celda6.setCellStyle(doubleStyle);
            
            Cell celda7 = fila.createCell(6);
            celda7.setCellValue(new Integer(item.getTotalCasos()));
            celda7.setCellStyle(numericStyle);
            x++;
        }
        
        // Hoja 1 - Formato - Footer
        HSSFCellStyle totalStyle = libro.createCellStyle();
        totalStyle.setFont(font);
        totalStyle.setAlignment(totalStyle.ALIGN_LEFT);
        totalStyle.setFillForegroundColor(IndexedColors.YELLOW.getIndex());
        totalStyle.setFillPattern(totalStyle.SOLID_FOREGROUND);
        
        HSSFCellStyle doubleTotalStyle = libro.createCellStyle();
        doubleTotalStyle.setFont(font);
        doubleTotalStyle.setAlignment(doubleStyle.ALIGN_RIGHT);
        doubleTotalStyle.setFillForegroundColor(IndexedColors.YELLOW.getIndex());
        doubleTotalStyle.setFillPattern(totalStyle.SOLID_FOREGROUND);
        doubleTotalStyle.setDataFormat(libro.getCreationHelper().createDataFormat().getFormat("#,###.##"));
        
        HSSFCellStyle numericTotalStyle = libro.createCellStyle();
        numericTotalStyle.setFont(font);
        numericTotalStyle.setAlignment(doubleStyle.ALIGN_RIGHT);
        numericTotalStyle.setFillForegroundColor(IndexedColors.YELLOW.getIndex());
        numericTotalStyle.setFillPattern(totalStyle.SOLID_FOREGROUND);
        
        // Hoja 1 - Footer
        Row filaFooter = hoja1.createRow(x);
        Cell celdaFooter = filaFooter.createCell(0);                  
        celdaFooter.setCellStyle(totalStyle);
        celdaFooter.setCellValue("Total");                
        
        celdaFooter = filaFooter.createCell(1);
        celdaFooter.setCellStyle(doubleTotalStyle);
        celdaFooter.setCellFormula("SUM(B3:B" + x + ")");
        
        celdaFooter = filaFooter.createCell(2);
        celdaFooter.setCellStyle(numericTotalStyle);
        celdaFooter.setCellFormula("SUM(C3:C" + x + ")");
        
        celdaFooter = filaFooter.createCell(3);
        celdaFooter.setCellStyle(doubleTotalStyle);
        celdaFooter.setCellFormula("SUM(D3:D" + x + ")");                
        
        celdaFooter = filaFooter.createCell(4);
        celdaFooter.setCellStyle(numericTotalStyle);
        celdaFooter.setCellFormula("SUM(E3:E" + x + ")");
        
        celdaFooter = filaFooter.createCell(5);
        celdaFooter.setCellStyle(doubleTotalStyle);
        celdaFooter.setCellFormula("SUM(F3:F" + x + ")");
        
        celdaFooter = filaFooter.createCell(6);
        celdaFooter.setCellStyle(numericTotalStyle);
        celdaFooter.setCellFormula("SUM(G3:G" + x + ")");
        
        // Resize
        HSSFRow row = libro.getSheetAt(0).getRow(1);
        for (int colNum = 0; colNum < row.getLastCellNum(); colNum++) {
            libro.getSheetAt(0).autoSizeColumn(colNum);
        }
        return libro;
    }
    
    /**
     * Metodo encargado de generar la hoja 2 del archivo de Prestaciones trimestrales.
     * @param libro HSSFWorkbook
     * @param hoja2 Sheet
     * @param qnaIni Integer
     * @param qnaFin Integer
     * @param ciclo String
     * @author Armando Zuñiga.
     * @return libro HSSFWorkbook
     */
    private HSSFWorkbook generaHoja2(HSSFWorkbook libro, Sheet hoja2, Integer qnaIni, Integer qnaFin, String ciclo) {
        Integer x;
        Integer y;
        
        Integer xx;
        Integer colum;
        Integer x2;
        
        HSSFFont font = libro.createFont();
        HSSFCellStyle style = (HSSFCellStyle)libro.createCellStyle();
        HSSFCellStyle style2 = (HSSFCellStyle)libro.createCellStyle();
        HSSFCellStyle style3 = (HSSFCellStyle)libro.createCellStyle();
        HSSFCellStyle style_T = (HSSFCellStyle)libro.createCellStyle();
        HSSFPalette palette = libro.getCustomPalette();
        HSSFPalette palette2 = libro.getCustomPalette();
        
        // Formato
        palette.setColorAtIndex(new Byte((byte) 41), new Byte((byte) 146), new Byte((byte) 208), new Byte((byte) 80));
        font.setBoldweight(HSSFFont.BOLDWEIGHT_BOLD);
        style.setFont(font);
        style.setAlignment(style.ALIGN_CENTER);
        style.setFillForegroundColor(palette.getColor(41).getIndex());
        style.setFillPattern(style.SOLID_FOREGROUND);
                        
        style2.setAlignment(style2.ALIGN_RIGHT);
        style2.setDataFormat(libro.getCreationHelper().createDataFormat().getFormat("_-* #,##0.00_-;-* #,##0.00_-;_-* \"-\"??_-;_-@_-"));
        
        style3.setAlignment(style3.ALIGN_RIGHT);
        style3.setDataFormat(libro.getCreationHelper().createDataFormat().getFormat("_-* #,##0_-;-* #,##0_-;_-* \"-\"_-;_-@_-"));
        
        palette2.setColorAtIndex(new Byte((byte) 42), new Byte((byte) 255), new Byte((byte) 255), new Byte((byte) 0));                                        
        style_T.setFillForegroundColor(palette2.getColor(42).getIndex());
        style_T.setFont(font);                    
        style_T.setFillPattern(style_T.SOLID_FOREGROUND);
        style_T.setDataFormat(libro.getCreationHelper().createDataFormat().getFormat("_-* #,##0.00_-;-* #,##0.00_-;_-* \"-\"??_-;_-@_-"));
        style_T.setAlignment(style_T.ALIGN_RIGHT);
                         
        // TODO: Llamada a servicio - Hoja 2
        List<Map<Integer, Object>> peList = super.getService(ClcHerramientasService.class).generaPrestTrimByGpoPago(qnaIni, qnaFin, "E", "M");

        // Hoja 2 - Escribir en archivo
        Row filac2 = hoja2.createRow(0);

        palette.setColorAtIndex(new Byte((byte)41), new Byte((byte)146), new Byte((byte)208), new Byte((byte)80));
        font.setBoldweight(HSSFFont.BOLDWEIGHT_BOLD);
        style.setFont(font);
        style.setAlignment(style.ALIGN_CENTER);

        x = 0;
        colum = 0;
        for (Map rowMap: peList) {
            Row fila02 = hoja2.createRow(x);
            y = 0;

            for (int columna = 1; columna <= rowMap.size(); columna++) {

                if (x == 0) {
                    Cell celda_2 = fila02.createCell(y);
                    celda_2.setCellStyle(style);
                    celda_2.setCellValue((String)rowMap.get(columna));
                    colum = rowMap.size();

                    if (columna == colum) {
                        Cell celda_tt = fila02.createCell(y + 1);
                        celda_tt.setCellStyle(style);
                        celda_tt.setCellValue("TOTAL");
                    }

                } else {
                    Cell celda_3 = fila02.createCell(y);
                    if (y > 0) {
                        celda_3.setCellStyle(style2);
                    }

                    if(columna == 1){
                        celda_3.setCellValue(rowMap.get(columna) != null ? (String.valueOf(rowMap.get(columna))) : "");
                    } else {
                        celda_3.setCellValue(rowMap.get(columna) != null ? Double.valueOf((String.valueOf(rowMap.get(columna)))) : 0.0);
                    }

                    if (columna == colum) {
                        Cell celda_tt = fila02.createCell(y + 1);
                        celda_tt.setCellType(celda_tt.CELL_TYPE_FORMULA);
                        celda_tt.setCellStyle(style2);
                        celda_tt.setCellFormula("SUM(" + CellReference.convertNumToColString(1) + Integer.valueOf((x + 1)) + ":" + CellReference.convertNumToColString(y) + Integer.valueOf((x + 1)) + ")");
                    }

                }
                //    logger.debug("Columna: " + rowMap.get(columna));
                y++;
            }

            x++;
        }

        Row fila_02 = hoja2.createRow(x);
        Cell celda2t = fila_02.createCell(0);
        celda2t.setCellStyle(style_T);
        celda2t.setCellValue("TOTAL");
        y = 1;

        for (int z = 1; z <= colum; z++) {
            Cell celda9 = fila_02.createCell(y);
            celda9.setCellType(celda9.CELL_TYPE_FORMULA);
            celda9.setCellStyle(style_T);
            celda9.setCellFormula("SUM(" + CellReference.convertNumToColString(y) + "2:" + CellReference.convertNumToColString(y) + x + ")");
            y++;
        }

        x++;

        // TODO: Llamada a servicio - Hoja 2 parte 2
        List<Map<Integer, Object>> peList2 = super.getService(ClcHerramientasService.class).generaPrestTrimByGpoPago(qnaIni, qnaFin, "E", "C");

        x = x + 3;
        xx = 0;
        x2 = x + 2;
        for (Map rowMap: peList2) {
            Row fila02 = hoja2.createRow(x);
            y = 0;

            for (int columna = 1; columna <= rowMap.size(); columna++) {

                if (xx == 0) {
                    Cell celda_2 = fila02.createCell(y);
                    celda_2.setCellStyle(style);
                    celda_2.setCellValue((String)rowMap.get(columna));
                    colum = rowMap.size();
                    if (columna == colum) {
                        Cell celda_tt = fila02.createCell(y + 1);
                        celda_tt.setCellStyle(style);
                        celda_tt.setCellValue("TOTAL");
                    }

                } else {
                    Cell celda_3 = fila02.createCell(y);
                    if (y > 0) {
                        celda_3.setCellStyle(style3);
                    }
                    // Op Ternarios
                    if(columna == 1){
                        celda_3.setCellValue(rowMap.get(columna) != null ? (String.valueOf(rowMap.get(columna))) : "");
                    } else {
                    celda_3.setCellValue(rowMap.get(columna) != null ? Double.valueOf((String.valueOf(rowMap.get(columna)))) : 0.0);
                    }

                    if (columna == colum) {
                        Cell celda_tt2 = fila02.createCell(y + 1);
                        celda_tt2.setCellType(celda_tt2.CELL_TYPE_FORMULA);
                        celda_tt2.setCellStyle(style2);
                        celda_tt2.setCellFormula("SUM(" + CellReference.convertNumToColString(1) + Integer.valueOf((x + 1)) + ":" + CellReference.convertNumToColString(y) + Integer.valueOf((x + 1)) + ")");
                    }

                }
                //    logger.debug("Columna: " + rowMap.get(columna));
                y++;
            }
            x++;
            xx++;
        }

        Row fila_02_2 = hoja2.createRow(x);
        Cell celda2t_2 = fila_02_2.createCell(0);
        celda2t_2.setCellStyle(style_T);
        celda2t_2.setCellValue("TOTAL");
        y = 1;

        for (int z = 1; z <= colum; z++) {
            Cell celda9 = fila_02_2.createCell(y);
            celda9.setCellType(celda9.CELL_TYPE_FORMULA);
            celda9.setCellStyle(style_T);
            celda9.setCellFormula("SUM(" + CellReference.convertNumToColString(y) + x2 + ":" + CellReference.convertNumToColString(y) + x + ")");
            y++;
        }
        x++;
                        
        // Resize
        HSSFRow row2 = (HSSFRow)libro.getSheetAt(1).getRow(0);
        for (int colNum = 0; colNum < row2.getLastCellNum(); colNum++) {
            libro.getSheetAt(1).autoSizeColumn(colNum);
        }
        return libro;
    }
    
    /**
     * Metodo encargado de generar la hoja 3 del archivo de Prestaciones trimestrales.
     * @param libro HSSFWorkbook
     * @param hoja3 Sheet
     * @param qnaIni Integer
     * @param qnaFin Integer
     * @param ciclo String
     * @author Armando Zuñiga.
     * @return libro HSSFWorkbook
     */
    private HSSFWorkbook generaHoja3(HSSFWorkbook libro, Sheet hoja3, Integer qnaIni, Integer qnaFin, String ciclo) {
        Integer x;
        Integer y;
        
        Integer xx;
        Integer colum;
        Integer x2;
        
        HSSFFont font = (HSSFFont)libro.createFont();
        HSSFCellStyle style = (HSSFCellStyle)libro.createCellStyle();
        HSSFCellStyle style2 = (HSSFCellStyle)libro.createCellStyle();
        HSSFCellStyle style3 = (HSSFCellStyle)libro.createCellStyle();
        HSSFCellStyle style_T = (HSSFCellStyle)libro.createCellStyle();
        HSSFPalette palette = libro.getCustomPalette();
        HSSFPalette palette2 = libro.getCustomPalette();
        
        // Formato
        palette.setColorAtIndex(new Byte((byte) 41), new Byte((byte) 146), new Byte((byte) 208), new Byte((byte) 80));
        font.setBoldweight(HSSFFont.BOLDWEIGHT_BOLD);
        style.setFont(font);
        style.setAlignment(style.ALIGN_CENTER);
        style.setFillForegroundColor(palette.getColor(41).getIndex());
        style.setFillPattern(style.SOLID_FOREGROUND);
                        
        style2.setAlignment(style2.ALIGN_RIGHT);
        style2.setDataFormat(libro.getCreationHelper().createDataFormat().getFormat("_-* #,##0.00_-;-* #,##0.00_-;_-* \"-\"??_-;_-@_-"));
        
        style3.setAlignment(style3.ALIGN_RIGHT);
        style3.setDataFormat(libro.getCreationHelper().createDataFormat().getFormat("_-* #,##0_-;-* #,##0_-;_-* \"-\"_-;_-@_-"));
        
        palette2.setColorAtIndex(new Byte((byte) 42), new Byte((byte) 255), new Byte((byte) 255), new Byte((byte) 0));                                        
        style_T.setFillForegroundColor(palette2.getColor(42).getIndex());
        style_T.setFont(font);                    
        style_T.setFillPattern(style_T.SOLID_FOREGROUND);
        style_T.setDataFormat(libro.getCreationHelper().createDataFormat().getFormat("_-* #,##0.00_-;-* #,##0.00_-;_-* \"-\"??_-;_-@_-"));
        style_T.setAlignment(style_T.ALIGN_RIGHT);
                            
        // TODO: Llamada a servicio - Hoja 3
        List<Map<Integer, Object>> pvList = super.getService(ClcHerramientasService.class).generaPrestTrimByGpoPago(qnaIni, qnaFin, "V", "M");

        // Hoja 3 - Escribir en archivo
        Row filac3 = hoja3.createRow(0);

        palette.setColorAtIndex(new Byte((byte)41), new Byte((byte)146), new Byte((byte)208), new Byte((byte)80));
        font.setBoldweight(HSSFFont.BOLDWEIGHT_BOLD);
        style.setFont(font);
        style.setAlignment(style.ALIGN_CENTER);

        x = 0;
        colum = 0;
        for (Map rowMap: pvList) {
            Row fila03 = hoja3.createRow(x);
            y = 0;

            for (int columna = 1; columna <= rowMap.size(); columna++) {

                if (x == 0) {
                    Cell celda_2 = fila03.createCell(y);
                    celda_2.setCellStyle(style);
                    celda_2.setCellValue((String)rowMap.get(columna));
                    colum = rowMap.size();
                    if (columna == colum) {
                        Cell celda_tt = fila03.createCell(y + 1);
                        celda_tt.setCellStyle(style);
                        celda_tt.setCellValue("TOTAL");
                    }
                } else {
                    Cell celda_3 = fila03.createCell(y);

                    if (y > 0) {
                        celda_3.setCellStyle(style2);
                    }
                    // Op Ternarios
                    if(columna == 1){
                        celda_3.setCellValue(rowMap.get(columna) != null ? (String.valueOf(rowMap.get(columna))) : "");
                    } else {
                        celda_3.setCellValue(rowMap.get(columna) != null ? Double.valueOf((String.valueOf(rowMap.get(columna)))) : 0.0);
                    }

                    if (columna == colum) {
                        Cell celda_tt3 = fila03.createCell(y + 1);
                        celda_tt3.setCellType(celda_tt3.CELL_TYPE_FORMULA);
                        celda_tt3.setCellStyle(style2);
                        celda_tt3.setCellFormula("SUM(" + CellReference.convertNumToColString(1) + Integer.valueOf((x + 1)) + ":" + CellReference.convertNumToColString(y) + Integer.valueOf((x + 1)) + ")");
                    }
                }
                y++;
            }
            x++;
        }

        Row fila_03 = hoja3.createRow(x);
        Cell celda3t = fila_03.createCell(0);
        celda3t.setCellStyle(style_T);
        celda3t.setCellValue("TOTAL");
        y = 1;

        for (int z = 1; z <= colum; z++) {
            Cell celda9 = fila_03.createCell(y);
            celda9.setCellType(celda9.CELL_TYPE_FORMULA);
            celda9.setCellStyle(style_T);
            celda9.setCellFormula("SUM(" + CellReference.convertNumToColString(y) + "2:" + CellReference.convertNumToColString(y) + x + ")");
            y++;
        }
        x++;

        // TODO: Llamada a servicio - Hoja 3 parte 2
        List<Map<Integer, Object>> pvList2 = super.getService(ClcHerramientasService.class).generaPrestTrimByGpoPago(qnaIni, qnaFin, "V", "C");

        x = x + 3;
        xx = 0;
        x2 = x + 2;

        for (Map rowMap: pvList2) {
            Row fila03 = hoja3.createRow(x);
            y = 0;

            for (int columna = 1; columna <= rowMap.size(); columna++) {
                if (xx == 0) {
                    Cell celda_2 = fila03.createCell(y);
                    celda_2.setCellStyle(style);
                    celda_2.setCellValue((String)rowMap.get(columna));
                    colum = rowMap.size();
                    if (columna == colum) {
                        Cell celda_tt = fila03.createCell(y + 1);
                        celda_tt.setCellStyle(style);
                        celda_tt.setCellValue("TOTAL");
                    }
                } else {
                    Cell celda_3 = fila03.createCell(y);
                    if (y > 0) {
                        celda_3.setCellStyle(style3);
                    }
                    // Op Ternarios
                    if(columna == 1){
                        celda_3.setCellValue(rowMap.get(columna) != null ? (String.valueOf(rowMap.get(columna))) : "");
                    } else {
                        celda_3.setCellValue(rowMap.get(columna) != null ? Double.valueOf((String.valueOf(rowMap.get(columna)))) : 0.0);
                    }

                    if (columna == colum) {
                        Cell celda_tt4 = fila03.createCell(y + 1);
                        celda_tt4.setCellType(celda_tt4.CELL_TYPE_FORMULA);
                        celda_tt4.setCellStyle(style2);
                        celda_tt4.setCellFormula("SUM(" + CellReference.convertNumToColString(1) + Integer.valueOf((x + 1)) + ":" + CellReference.convertNumToColString(y) + Integer.valueOf((x + 1)) + ")");
                    }
                }
                y++;
            }
            x++;
            xx++;
        }

        Row fila_03_2 = hoja3.createRow(x);
        Cell celda3t_2 = fila_03_2.createCell(0);
        celda3t_2.setCellStyle(style_T);
        celda3t_2.setCellValue("TOTAL");
        y = 1;

        for (int z = 1; z <= colum; z++) {
            Cell celda9 = fila_03_2.createCell(y);
            celda9.setCellType(celda9.CELL_TYPE_FORMULA);
            celda9.setCellStyle(style_T);
            celda9.setCellFormula("SUM(" + CellReference.convertNumToColString(y) + x2 + ":" + CellReference.convertNumToColString(y) + x + ")");
            y++;
        }
        
        // Resize
        HSSFRow row3 = (HSSFRow)libro.getSheetAt(2).getRow(0);
        for (int colNum = 0; colNum < row3.getLastCellNum(); colNum++) {
            libro.getSheetAt(2).autoSizeColumn(colNum);
        }
        return libro;
    }
}
