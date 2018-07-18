package gob.shcp.sireh.model.sat.config;


import com.google.zxing.EncodeHintType;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;

import gob.shcp.sireh.model.CfdiDTO;


import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;


import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class ProductReport {

    protected final Log logger = LogFactory.getLog(getClass());
    
    private static final String JAXP_SCHEMA_LANGUAGE = "http://java.sun.com/xml/jaxp/properties/schemaLanguage";
    private static final String W3C_XML_SCHEMA = "http://www.w3.org/2001/XMLSchema";
    
    public String writePDF(CfdiDTO cfdiDTO, String localTempDirSireh, String rootPathAplication) {
        List<CfdiDTO> talon = new ArrayList<CfdiDTO>();
        boolean r = false;
        
        String pathDocs             = rootPathAplication + "WEB-INF/docs" + File.separator;
        
        String reportBasePath       = pathDocs + "reportBase/jasper/n12a32/";
        String jasperReportFile     = "";
        if(cfdiDTO.getPuesto() != null && cfdiDTO.getPuesto().equals("HONORAR")){
            jasperReportFile += "comprobanteHonorarios.jasper";
        } else {
            jasperReportFile += "comprobante.jasper";
        }
        String imagesPath   = pathDocs + "reportBase/images/";
        String qrPNG        = localTempDirSireh + File.separator +  cfdiDTO.getCompFolio() + ".png";
        cfdiDTO.setCompCodeQr(qrPNG);
        String pathNamePDF = localTempDirSireh + File.separator + cfdiDTO.getCompFolio() + ".pdf";
        
        logger.debug("rootPathAplication: " + reportBasePath + "comprobante.jasper");
        logger.debug("pathDocs: " + pathDocs);
        logger.debug("reportBasePath: " + reportBasePath);
        logger.debug("imagesPath: " + imagesPath);
        logger.debug("qrPNG: " + qrPNG);
        logger.debug("pathAndNameDestinoPdf: " + pathNamePDF);
        
        logger.debug("STOP");
        
        talon.add(cfdiDTO);
        

        try {
            printQR(cfdiDTO.getEmisorRfc(), cfdiDTO.getReceptorRfc(), cfdiDTO.getCompTotal(), cfdiDTO.getTimbreFiscalDigitalUuid(), qrPNG);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        Map<String, Object> parametros = new HashMap<String, Object>();
        parametros.put("IMAGES_URI", imagesPath);
        parametros.put("SUBREPORT_DIR", reportBasePath);
        parametros.put("subreportePercepcion", reportBasePath + "subreportePercepcion.jasper");
        parametros.put("percepciones", cfdiDTO.getPercepciones());
        parametros.put("subreporteDeduccion", reportBasePath + "subreporteDeduccion.jasper");
        parametros.put("deducciones", cfdiDTO.getDeducciones());
        
        ConfiguracionReporte configuracionReporte = new ConfiguracionReporte();
        configuracionReporte.setDatos(talon);
        configuracionReporte.setParametros(parametros);
        configuracionReporte.setSalidaReporte(pathNamePDF);
        configuracionReporte.setPathJasper(reportBasePath);
        configuracionReporte.setJasperReportFile(jasperReportFile);
        
        
        try {
            r = ReporteHelper.generarPDF(configuracionReporte);
        } catch(Exception e) { e.printStackTrace(); }
        
        if(r) return pathNamePDF;
        else return null;
    }
    
    
    /**
     * Metodo encargado de generar el codigo QR para el comprobante de pago
     * @author Oscar S.
     */
    private void printQR(String rfcPatron, String rfcEmpleado, String importeTotal, String uuid, String filePath) throws UnsupportedEncodingException {
        Charset charset = Charset.forName("UTF-8");
        CharsetEncoder encoder = charset.newEncoder();
        byte[] b = null;

        try {
            // Convert a string to UTF-8 bytes in a ByteBuffer
            String quickReference = "?re=" + rfcPatron + "&rr=" + rfcEmpleado + "&tt=" + importeTotal + "&id=" + uuid;
            ByteBuffer bbuf = encoder.encode(CharBuffer.wrap(quickReference));
            b = bbuf.array();
        } catch (CharacterCodingException e) { logger.debug(e.getMessage()); }

        String data;
        try {
            data = new String(b, "UTF-8");
            // get a byte matrix for the data
            BitMatrix matrix = null;
            int h = 140;
            int w = 140;
            com.google.zxing.Writer writer = new MultiFormatWriter();

            try {
                Hashtable<EncodeHintType, String> hints = new Hashtable<EncodeHintType, String>(2);
                hints.put(EncodeHintType.CHARACTER_SET, "UTF-8");
                matrix = writer.encode(data, com.google.zxing.BarcodeFormat.QR_CODE, w, h, hints);
            } catch (com.google.zxing.WriterException e) {
                logger.debug("printQR - WriterException" + e.getMessage());
            }

            File file = new File(filePath);
            try {
                MatrixToImageWriter.writeToFile(matrix, "PNG", file);
                logger.debug("printQR - file.getAbsolutePath: " + file.getAbsolutePath());
            } catch (IOException e) {
                logger.debug("printQR - IOException" + e.getMessage());
            }
        } catch (UnsupportedEncodingException e) {
            logger.debug(e.getMessage());
        }
    }
}
