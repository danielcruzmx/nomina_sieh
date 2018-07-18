package gob.shcp.sireh.comprobante.init;

import com.google.zxing.EncodeHintType;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;

import gob.shcp.sireh.comprobante.jaxb.Comprobante;
import gob.shcp.sireh.model.CfdiDTO;

import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

import java.math.BigDecimal;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;

import net.sf.jasperreports.engine.JRDataSource;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRExporter;
import net.sf.jasperreports.engine.JRExporterParameter;
import net.sf.jasperreports.engine.JRParameter;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.JasperRunManager;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.engine.data.JRXmlDataSource;
import net.sf.jasperreports.engine.export.JRPdfExporter;
import net.sf.jasperreports.engine.util.JRLoader;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import org.w3c.dom.Document;

import org.xml.sax.SAXException;


public class ProductReport {

    protected final Log logger = LogFactory.getLog(getClass());
    
    private static final String JAXP_SCHEMA_LANGUAGE = "http://java.sun.com/xml/jaxp/properties/schemaLanguage";
    private static final String W3C_XML_SCHEMA = "http://www.w3.org/2001/XMLSchema";
    
    public String writePDFvN12A32(CfdiDTO cfdiDTO, String localTempDirSireh, HttpServletRequest request) {
        List<CfdiDTO> talon = new ArrayList<CfdiDTO>();
        boolean r = false;
        
        HttpSession     session         = request.getSession();
        ServletContext  servletContext  = session.getServletContext();
        
        String rootPathAplication   = servletContext.getRealPath("/");
        String pathDocs             = rootPathAplication + "WEB-INF/docs" + File.separator;
        
        String reportBasePath       = pathDocs + "reportBase/jasper/n12a32/";
        
        String imagesPath   = pathDocs + "reportBase/images/";
        String qrPNG        = imagesPath + "/qr_png.png";
        
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
        } catch(Exception e){ e.printStackTrace(); }
        
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
        
        
        try {
            r = ReporteHelper.generarPDF(configuracionReporte);
        } catch(Exception e) { e.printStackTrace(); }
        
        if(r) return pathNamePDF;
        else return null;
    }
    
    
    /**
     * Metodo encargado de obtener el nombre del comprobante de pago en formato pdf.  **** Nomina v1.2 Anexo20 v3.3
     * @author Martin C
     * @param pathDocs String
     * @param rfcPatron String
     * @param folioRecibo String
     * @param xmlPath String
     * @return String
     */
    public String writePDFvN12A33(String pathDocs, String rfcPatron, 
                           String folioRecibo, 
                           String xmlPath, 
                           String reportOutputPath) throws UnsupportedEncodingException, 
                                                           JAXBException, 
                                                           SAXException, 
                                                           ParserConfigurationException, 
                                                           IOException, 
                                                           JRException {
/*                                                           
        StreamSource nomina12_xsd;
        StreamSource cfdv33_xsd;
        StreamSource tfd_xsd;
        
        String imagesPath;
        String reportBasePath;

        // Se inicializan variables
        String aWorkPath = pathDocs;
        aWorkPath = aWorkPath.replace("\\", "/");

        nomina12_xsd = new StreamSource(aWorkPath + "esquemas/n12a33/nomina12.xsd");
        cfdv33_xsd = new StreamSource(aWorkPath + "esquemas/n12a33/cfdv33.xsd");
        tfd_xsd = new StreamSource(aWorkPath + "esquemas/n12a33/TimbreFiscalDigital.xsd");

        imagesPath = aWorkPath + "reportBase/images/";
        reportBasePath = aWorkPath + "reportBase/jasper/n12a33/";

        // JAXB XML -> Java
        File fileXML = new File(xmlPath);
        logger.debug("fileXML --------->" + fileXML);
        try {
            logger.debug(new SimpleDateFormat("dd/MMM/yyyy", new Locale("es", "MX")).format(new SimpleDateFormat("yyyy-MM-dd").parse("2014-11-03")));
        } catch (ParseException e2) {
            logger.debug("writePDF - ParseException: " + e2.toString());
        }
        
        JAXBContext context = null;
        Unmarshaller unmarshaller = null;
        Schema schema = null;
        gob.shcp.sireh.sat.cfdi.v33.Comprobante comprobante = null;
        try {
            comprobante = new gob.shcp.sireh.sat.cfdi.v33.Comprobante();
        } catch (Exception e) {
            logger.debug("writePDF - Exception: " + e.toString());
        }
        
        StreamSource[] schemasDef = { nomina12_xsd, cfdv33_xsd, tfd_xsd };
        SchemaFactory sf = SchemaFactory.newInstance("http://www.w3.org/2001/XMLSchema");
        try {
            context = JAXBContext.newInstance("mx.gob.sat1233.cfd.v33");
            unmarshaller = context.createUnmarshaller();
            schema = sf.newSchema(schemasDef);
            unmarshaller.setSchema(schema);
            
            comprobante = (gob.shcp.sireh.sat.cfdi.v33.Comprobante)unmarshaller.unmarshal(fileXML);
        } catch (NullPointerException e) {
            logger.debug("writePDF - NullPointerException: " + e.toString());
            return null;
        } catch (JAXBException e) {
            logger.debug("writePDF - JAXBException: " + e.toString());
            return null;
        } catch (SAXException e) {
            logger.debug("writePDF - SAXException: " + e.toString());
            return null;
        }
        logger.debug("Comprobante --------->" + comprobante);

        // Se inicializan variables
        String qrPNG = imagesPath + "/qr_png.png";

        String rfcPatronComprobante = comprobante.getEmisor().getRfc();
        String rfcEmpleadoComprobante = comprobante.getReceptor().getRfc();

        BigDecimal totalGravado = new BigDecimal(0);
        BigDecimal totalExento = new BigDecimal(0);
        String uuid = "";
        
        //List<Object> any = comprobante.getComplemento();
        com.sun.org.apache.xerces.internal.dom.ElementNSImpl node;
        /*
        for (Object o: any) {
            node = (com.sun.org.apache.xerces.internal.dom.ElementNSImpl)o;
            
            if (node.getNodeName().equals("nomina:Nomina")) {
                com.sun.org.apache.xerces.internal.dom.ElementNSImpl nodoPercepciones = (com.sun.org.apache.xerces.internal.dom.ElementNSImpl)node.getElementsByTagName("nomina:Percepciones").item(0);
                if(nodoPercepciones != null){
                    totalGravado = new BigDecimal(nodoPercepciones.getAttribute("TotalGravado") != null ? nodoPercepciones.getAttribute("TotalGravado") : "0.00");
                    logger.debug("TotalGravado --------->" + totalGravado);
                }
            }
            if (node.getNodeName().equals("nomina:Nomina")) {
                com.sun.org.apache.xerces.internal.dom.ElementNSImpl nodoDeducciones = (com.sun.org.apache.xerces.internal.dom.ElementNSImpl)node.getElementsByTagName("nomina:Deducciones").item(0);
                if(nodoDeducciones != null){
                    totalExento = new BigDecimal(nodoDeducciones.getAttribute("TotalExento") != null ? nodoDeducciones.getAttribute("TotalExento") : "0.00");
                    logger.debug("TotalExento --------->" + totalExento);
                }
            }
            if (node.getNodeName().equals("tfd:TimbreFiscalDigital")) {
                uuid = node.getAttribute("UUID");
                logger.debug("uuid --------->" + uuid);
            }
        }
        
        // Importe total
        BigDecimal importeTotal = totalGravado.subtract(totalExento);
        logger.debug("importeTotal --------->" + importeTotal);
        
        // Generar codigo QR
        printQR(rfcPatronComprobante, rfcEmpleadoComprobante, importeTotal.toString(), uuid, qrPNG);

        String destFileName = reportOutputPath + File.separator + rfcPatron + "_" + folioRecibo + ".pdf";
        String sourceFileName = reportBasePath + "comprobante.jasper";

        Map<String, Object> params = new HashMap<String, Object>();
        Locale locale = new Locale("es", "MX");
        params.put(JRParameter.REPORT_LOCALE, locale);
        params.put("IMAGES_URI", imagesPath);
        params.put("SUBREPORT_DIR", reportBasePath);

        DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
        documentBuilderFactory.setNamespaceAware(true);
        documentBuilderFactory.setValidating(true);
        //documentBuilderFactory.setValidating(false);
        documentBuilderFactory.setAttribute(JAXP_SCHEMA_LANGUAGE, W3C_XML_SCHEMA);

        DocumentBuilder builder = documentBuilderFactory.newDocumentBuilder();
        Document doc = builder.parse(fileXML);
        
        org.w3c.dom.Node topNodo = doc.getFirstChild();
        com.sun.org.apache.xerces.internal.dom.ElementNSImpl n = (com.sun.org.apache.xerces.internal.dom.ElementNSImpl)topNodo;
        n.setAttribute("xmlns:tfd", "http://www.sat.gob.mx/TimbreFiscalDigital");
        
        try {
            JasperRunManager.runReportToPdfFile(sourceFileName, destFileName, params, new JRXmlDataSource(doc));
        } catch (Exception e) {
            logger.debug("writePDF - Exception: " + e.toString());
            return null;
        }
        return destFileName;
*/    return null;
    }
    
    /**
     * Metodo encargado de obtener el nombre del comprobante de pago en formato pdf. *** Nomina v1.1  Anexo20 v3.2
     * @author Oscar S.
     * @param pathDocs String
     * @param rfcPatron String
     * @param folioRecibo String
     * @param xmlPath String
     * @return String
     */
    public String writePDF(String pathDocs, String rfcPatron, 
                           String folioRecibo, 
                           String xmlPath, 
                           String reportOutputPath) throws UnsupportedEncodingException, 
                                                           JAXBException, 
                                                           SAXException, 
                                                           ParserConfigurationException, 
                                                           IOException, 
                                                           JRException {
        StreamSource nomina_xsd;
        StreamSource cfdv32_xsd;
        StreamSource tfd_xsd;
        
        String imagesPath;
        String reportBasePath;

        // Se inicializan variables
        String aWorkPath = pathDocs;
        aWorkPath = aWorkPath.replace("\\", "/");
        logger.debug("aWorkPath --------->" + aWorkPath);

        nomina_xsd = new StreamSource(aWorkPath + "esquemas/nomina.xsd");
        cfdv32_xsd = new StreamSource(aWorkPath + "esquemas/cfdv32.xsd");
        tfd_xsd = new StreamSource(aWorkPath + "esquemas/TimbreFiscalDigital.xsd");
        logger.debug("tfd_xsd --------->" + tfd_xsd);

        imagesPath = aWorkPath + "reportBase/images/";
        reportBasePath = aWorkPath + "reportBase/jasper/";
        logger.debug("xmlPath --------->" + xmlPath);

        // JAXB XML -> Java
        File fileXML = new File(xmlPath);
        logger.debug("fileXML --------->" + fileXML);
        try {
            logger.debug(new SimpleDateFormat("dd/MMM/yyyy", new Locale("es", "MX")).format(new SimpleDateFormat("yyyy-MM-dd").parse("2014-11-03")));
        } catch (ParseException e2) {
            logger.debug("writePDF - ParseException: " + e2.toString());
        }
        
        JAXBContext context = null;
        Unmarshaller unmarshaller = null;
        Schema schema = null;
        Comprobante comprobante = null;
        try {
            comprobante = new Comprobante();
        } catch (Exception e) {
            logger.debug("writePDF - Exception: " + e.toString());
        }
        
        StreamSource[] schemasDef = { nomina_xsd, cfdv32_xsd, tfd_xsd };
        SchemaFactory sf = SchemaFactory.newInstance("http://www.w3.org/2001/XMLSchema");
        try {
            context = JAXBContext.newInstance("gob.shcp.sireh.comprobante.jaxb");
            //context = JAXBContext.newInstance(Comprobante.class,Comprobante.Addenda.class,Comprobante.Complemento.class,Comprobante.Conceptos.class,Comprobante.Emisor.class,Comprobante.Impuestos.class,Comprobante.Receptor.class);
            //context = JAXBContext.newInstance(Comprobante.class);
            //context = JAXBContext.newInstance("Comprobante");
            //context = JAXBContext.newInstance(new Class[] {Comprobante.class});
            //context = JAXBContext.newInstance(Comprobante.class);
            unmarshaller = context.createUnmarshaller();
            
            schema = sf.newSchema(schemasDef);
            unmarshaller.setSchema(schema);
            
            comprobante = (Comprobante)unmarshaller.unmarshal(fileXML);
        } catch (NullPointerException e) {
            logger.debug("writePDF - NullPointerException: " + e.toString());
            return null;
        } catch (JAXBException e) {
            logger.debug("writePDF - JAXBException: " + e.toString());
            return null;
        } catch (SAXException e) {
            logger.debug("writePDF - SAXException: " + e.toString());
            return null;
        }
        logger.debug("Comprobante --------->" + comprobante);

        // Se inicializan variables
        String qrPNG = imagesPath + "/qr_png.png";

        String rfcPatronComprobante = comprobante.getEmisor().getRfc();
        String rfcEmpleadoComprobante = comprobante.getReceptor().getRfc();

        BigDecimal totalGravado = new BigDecimal(0);
        BigDecimal totalExento = new BigDecimal(0);
        String uuid = "";
        
        List<Object> any = comprobante.getComplemento().getAny();
        com.sun.org.apache.xerces.internal.dom.ElementNSImpl node;
        //com.sun.org.apache.xerces.internal.dom.ElementNSImpl node = new com.sun.org.apache.xerces.internal.dom.ElementNSImpl();
        
        for (Object o: any) {
            //node = (com.sun.org.apache.xerces.internal.dom.ElementNSImpl)o;
            //node = (ElementNSImpl)o;
            node = (com.sun.org.apache.xerces.internal.dom.ElementNSImpl)o;
            
            if (node.getNodeName().equals("nomina:Nomina")) {
                com.sun.org.apache.xerces.internal.dom.ElementNSImpl nodoPercepciones = (com.sun.org.apache.xerces.internal.dom.ElementNSImpl)node.getElementsByTagName("nomina:Percepciones").item(0);
                if(nodoPercepciones != null){
                    totalGravado = new BigDecimal(nodoPercepciones.getAttribute("TotalGravado") != null ? nodoPercepciones.getAttribute("TotalGravado") : "0.00");
                    logger.debug("TotalGravado --------->" + totalGravado);
                }
            }
            if (node.getNodeName().equals("nomina:Nomina")) {
                com.sun.org.apache.xerces.internal.dom.ElementNSImpl nodoDeducciones = (com.sun.org.apache.xerces.internal.dom.ElementNSImpl)node.getElementsByTagName("nomina:Deducciones").item(0);
                if(nodoDeducciones != null){
                    totalExento = new BigDecimal(nodoDeducciones.getAttribute("TotalExento") != null ? nodoDeducciones.getAttribute("TotalExento") : "0.00");
                    logger.debug("TotalExento --------->" + totalExento);
                }
            }
            if (node.getNodeName().equals("tfd:TimbreFiscalDigital")) {
                uuid = node.getAttribute("UUID");
                logger.debug("uuid --------->" + uuid);
            }
        }
        
        // Importe total
        BigDecimal importeTotal = totalGravado.subtract(totalExento);
        logger.debug("importeTotal --------->" + importeTotal);
        
        // Generar codigo QR
        printQR(rfcPatronComprobante, rfcEmpleadoComprobante, importeTotal.toString(), uuid, qrPNG);

        String destFileName = reportOutputPath + File.separator + rfcPatron + "_" + folioRecibo + ".pdf";
        String sourceFileName = reportBasePath + "comprobante.jasper";

        Map<String, Object> params = new HashMap<String, Object>();
        Locale locale = new Locale("es", "MX");
        params.put(JRParameter.REPORT_LOCALE, locale);
        params.put("IMAGES_URI", imagesPath);
        params.put("SUBREPORT_DIR", reportBasePath);

        DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
        documentBuilderFactory.setNamespaceAware(true);
        documentBuilderFactory.setValidating(true);
        //documentBuilderFactory.setValidating(false);
        documentBuilderFactory.setAttribute(JAXP_SCHEMA_LANGUAGE, W3C_XML_SCHEMA);

        DocumentBuilder builder = documentBuilderFactory.newDocumentBuilder();
        Document doc = builder.parse(fileXML);
        
        org.w3c.dom.Node topNodo = doc.getFirstChild();
        com.sun.org.apache.xerces.internal.dom.ElementNSImpl n = (com.sun.org.apache.xerces.internal.dom.ElementNSImpl)topNodo;
        n.setAttribute("xmlns:tfd", "http://www.sat.gob.mx/TimbreFiscalDigital");
        
        try {
            JasperRunManager.runReportToPdfFile(sourceFileName, destFileName, params, new JRXmlDataSource(doc));
        } catch (Exception e) {
            logger.debug("writePDF - Exception: " + e.toString());
            return null;
        }
        return destFileName;
    }
    
    /**
     * Metodo encargado de generar el codigo QR para el comprobante de pago
     * @author Oscar S.
     * @param rfcPatron String
     * @param rfcEmpleado String
     * @param importeTotal String
     * @param uuid String
     * @param filePath String
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
        } catch (CharacterCodingException e) {
            logger.debug(e.getMessage());
        }

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
