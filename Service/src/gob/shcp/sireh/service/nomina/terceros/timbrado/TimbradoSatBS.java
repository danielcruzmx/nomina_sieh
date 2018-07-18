package gob.shcp.sireh.service.nomina.terceros.timbrado;


import com.lowagie.text.DocumentException;
import com.lowagie.text.pdf.PdfContentByte;
import com.lowagie.text.pdf.PdfImportedPage;
import com.lowagie.text.pdf.PdfReader;
import com.lowagie.text.pdf.PdfWriter;

import gob.shcp.fsn.service.ServiceException;
import gob.shcp.fsn.service.mail.MailParams;
import gob.shcp.sireh.data.jdbc.QueryTnComprobanteDigDAO;
import gob.shcp.sireh.data.jdbc.QueryTdEmpleadoDAO;
import gob.shcp.sireh.data.jdbc.QueryTnHistoricoPagoDAO;
import gob.shcp.sireh.data.jdbc.TdEmpleadoDAO;
import gob.shcp.sireh.data.jdbc.TnComprobanteDigDAO;
import gob.shcp.sireh.domain.jdbc.FolioTnComprobanteDig;
import gob.shcp.sireh.data.jdbc.support.CustoTnComprobanteDigDAO;
import gob.shcp.sireh.data.jdbc.support.CustomTnNominaDao;
import gob.shcp.sireh.domain.jdbc.Cfdi;
import gob.shcp.sireh.domain.jdbc.CorreoElectronic;
import gob.shcp.sireh.domain.jdbc.CustomTnComprobanteDig;
import gob.shcp.sireh.domain.jdbc.CustomTnConceptoPagadoXML;
import gob.shcp.sireh.domain.jdbc.CustomTnHistoricoPagoXML;
import gob.shcp.sireh.domain.jdbc.TdEmpleado;
import gob.shcp.sireh.domain.jdbc.TnComprobanteDig;
import gob.shcp.sireh.domain.jdbc.TnComprobanteDigPK;
import gob.shcp.sireh.domain.jdbc.TnConceptoPagado;
import gob.shcp.sireh.domain.jdbc.nomina.terceros.TnComprobanteDigCorreo;
import gob.shcp.sireh.model.CfdiDTO;
import gob.shcp.sireh.model.ItemKeyDTO;
import gob.shcp.sireh.model.PercepcionesDeduccionesDTO;
import gob.shcp.sireh.model.nomina.gestion.NominaDTO;
import gob.shcp.sireh.model.nomina.terceros.ComponenteXmlDTO;
import gob.shcp.sireh.model.nomina.terceros.timbradosat.ComprobanteFiscalDTO;
import gob.shcp.sireh.model.nomina.terceros.timbradosat.ConceptoPagoXMLAnexo20DTO;
import gob.shcp.sireh.model.nomina.terceros.timbradosat.CorreoElectronicDTO;
import gob.shcp.sireh.model.nomina.terceros.timbradosat.CorreoElectronicoDTO;
import gob.shcp.sireh.model.nomina.terceros.timbradosat.FolioTnComprobanteDigDTO;
import gob.shcp.sireh.model.nomina.terceros.timbradosat.CustomTnConceptoPagadoXMLDTO;
import gob.shcp.sireh.model.nomina.terceros.timbradosat.CustomTnHistoricoPagoXMLDTO;
import gob.shcp.sireh.model.nomina.terceros.timbradosat.DatosXMLAnexo20DTO;
import gob.shcp.sireh.model.nomina.terceros.timbradosat.DependenciaDTO;
import gob.shcp.sireh.model.nomina.terceros.timbradosat.TnComprobanteDigCorreoDTO;
import gob.shcp.sireh.model.nomina.terceros.timbradosat.TnComprobanteDigDTO;
import gob.shcp.sireh.model.nomina.terceros.timbradosat.rest.Respuesta;
import gob.shcp.sireh.model.sat.cfdi.v32.CfdiNsMap;
import gob.shcp.sireh.model.sat.cfdi.v33.CMetodoPago;
import gob.shcp.sireh.model.sat.cfdi.v33.CTipoDeComprobante;
import gob.shcp.sireh.model.sat.config.ProductReport;
import gob.shcp.sireh.model.sat.nomina.v12.COrigenRecurso;
import gob.shcp.sireh.model.sat.nomina.v12.Nomina;

import gob.shcp.sireh.service.AbstractSirehService;
import gob.shcp.sireh.service.SirehUtils;
import gob.shcp.sireh.service.nomina.gestion.GestionNominaService;
import java.io.BufferedWriter;


import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;

import java.io.ByteArrayInputStream;
import java.io.File;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.StringReader;
import java.io.StringWriter;

import java.io.UnsupportedEncodingException;

import java.math.BigDecimal;

import java.math.RoundingMode;

import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;

import java.sql.Blob;
import java.sql.Clob;
import java.sql.SQLException;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Properties;

import java.util.UUID;
import java.util.zip.ZipEntry;

import java.util.zip.ZipOutputStream;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;


import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;

import org.w3c.dom.CDATASection;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import sun.misc.BASE64Encoder;

public class TimbradoSatBS extends AbstractSirehService implements TimbradoSatService {
    public void enviarCorreoElectronico(CorreoElectronicoDTO correoElectronicoDTO){
        
        String archivoTemplateHtml = correoElectronicoDTO.getPlantillaCorreo();
        String uriImg   = null;
        String template = null;
        String cuerpo   = null;
        String redirecion = null;
        
        try {
            template = FileUtils.readFileToString(new File(archivoTemplateHtml));
        } catch (IOException e) {
            throw new ServiceException("IOException-> " + e.toString(), e);
        }
        
        List<CorreoElectronic> lUriImg = super.persistence().get(QueryTnComprobanteDigDAO.class).getImagenTagForEnvioCFDIbyRfc();
            if(lUriImg.size()>0){ uriImg = lUriImg.get(0).getImgTag();  redirecion = lUriImg.get(0).getAncla(); } else{ uriImg = ""; redirecion = ""; }
        
        // Asunto
        cuerpo = template.replace("<!--ASUNTO-->", "&quot;" + correoElectronicoDTO.getAsunto() + "&quot;");
        
        // Mensaje
        //cuerpo = cuerpo.replace("<!--MENSAJE-->", correoElectronicoDTO.getMensaje());
        
        // Nombre del participante
        cuerpo = cuerpo.replace("<!--PARTICIPANTE-->", (String) correoElectronicoDTO.getNombreReceptor());
        
        // imagen de aviso
        if(uriImg != null && !uriImg.equalsIgnoreCase("")){
            cuerpo = cuerpo.replace("<!--imagen-->",  "<img src=" + '"' + uriImg + '"' + "/>");
        }
        
        // redireccionamiento
        if(redirecion != null && !redirecion.equalsIgnoreCase("")){
            cuerpo = cuerpo.replace("<!--ancla-->",  "<a href=" + '"' + redirecion + '"' + ">");
        }
        
        Map<String, String> adjuntos = new HashMap<String, String>();
        adjuntos.put(correoElectronicoDTO.getAdjuntosPath() + File.separator + correoElectronicoDTO.getFileXML(), correoElectronicoDTO.getFileXML());
        adjuntos.put(correoElectronicoDTO.getAdjuntosPath() + File.separator + correoElectronicoDTO.getFilePDF(), correoElectronicoDTO.getFilePDF());
        
        MailParams mailParams = new MailParams();
        mailParams.setTemplateProperties(mail().getTemplateParams("simple-mail"));
        mailParams.addRecipient((String) correoElectronicoDTO.getCorreoReceptor());
        mailParams.setAttachments(adjuntos);

        mailParams.setText(cuerpo != null ? cuerpo.toString() : "");

        mailParams.setSubject(correoElectronicoDTO.getAsunto());
        mailParams.setFrom(correoElectronicoDTO.getCorreoEmisor());
        
        Properties messageProps = new Properties();
        messageProps.setProperty("dia", (new SimpleDateFormat("dd/MM/yyyy")).format(new Date()));
        messageProps.setProperty("hora", (new SimpleDateFormat("hh:mm:ss")).format(new Date()));
        messageProps.setProperty("usuario", correoElectronicoDTO.getNombreEmisor());
        mailParams.setPropertyValues(messageProps);
        
        super.mail().send(mailParams);
    
    }
    // **************************************************************************************************************************************************************************
     /**
     * @autor Martin C.
     * @param correoElectronicDTO
     * @param request
     */
     public void generarPDFdelXML(CorreoElectronicDTO correoElectronicDTO, HttpServletRequest request){
         String rfcEmpleado  = correoElectronicDTO.getRfcEmpleado();
         List<String> listaPDF = new ArrayList<String>();
         List<ItemKeyDTO> listAdjuntos = new ArrayList<ItemKeyDTO>();
         ItemKeyDTO itemKeyDTO = null;
         String nomina       = null;
         String folio        = null;
         String difFolio     = null;
         String paquete      = null;
         String pdf          = null;    // C:/sireh/temp\<rfc_empleado>\65647066.pdf
         
         ProductReport productReport = new ProductReport();
         
         String localTempDirSireh = super.configuration().getString("local.temp.dir");  // C:/sireh/temp
         
         String rootPathAplication = request.getSession().getServletContext().getRealPath("/");     // D:\source\sireh\Web\public_html\
         
         String nomFolderRoot = rfcEmpleado; // <rfcEmpleado>
         
         String pathDescarga = localTempDirSireh + File.separator + nomFolderRoot + File.separator + "decarga";
         String pathCorreo   = localTempDirSireh + File.separator + nomFolderRoot + File.separator + "correo";
         
         File folderDescarga = new File(pathDescarga);    // C:\sireh\temp\<rfcEmpleado>\descaga
         File folderCorreo    = new File(pathCorreo);      // C:\sireh\temp\<rfcEmpleado>\correo
         
         if (!folderDescarga.exists()) { folderDescarga.mkdir(); }
         else if(folderDescarga.exists()){ deleteFolder(folderDescarga); }
         
         if (!folderCorreo.exists()) { folderCorreo.mkdir(); }
         else if(folderCorreo.exists()){ deleteFolder(folderCorreo); }
         
         logger.debug("stop");
         
         for(String item : correoElectronicDTO.getIdGrupo()){
             folio = item.split("-")[0];
             difFolio = item.split("-")[1];
             paquete = item.split("-")[2];
             nomina = item.split("-")[3];
             
             TnComprobanteDig tnComprobanteDig = super.persistence().get(TnComprobanteDigDAO.class).getById(new TnComprobanteDigPK(new Integer(difFolio), new Long(folio), new Integer(paquete)));
             TnComprobanteDigDTO tnComprobanteDigDTO = super.transformation().map(tnComprobanteDig, TnComprobanteDigDTO.class);
             
             String stringXML = clobToString(tnComprobanteDigDTO.getCnXmlTimbrado());
             String fileXml   = tnComprobanteDigDTO.getCnFolio() + ".xml";
             
             try {
                 FileUtils.writeStringToFile(new File(pathDescarga + File.separator + fileXml), stringXML, "utf-8");
                 FileUtils.writeStringToFile(new File(pathCorreo   + File.separator + fileXml), stringXML, "utf-8");
             }
             catch (IOException e) { e.getMessage(); }
             
             CfdiDTO cfdiDTO = getCfdiDTOFromComprobante(tnComprobanteDigDTO);
             
             pdf = productReport.writePDF(cfdiDTO, pathCorreo, rootPathAplication);
             pdf = productReport.writePDF(cfdiDTO, pathDescarga, rootPathAplication);
             
             File pdfFile = new File(pdf);
             
             itemKeyDTO = new ItemKeyDTO( pathCorreo + File.separator + fileXml, pathCorreo + File.separator + pdfFile.getName() );
             listAdjuntos.add(itemKeyDTO);
             
             listaPDF.add(pdf);
         }
         
         correoElectronicDTO.setAdjuntos(listAdjuntos);
         correoElectronicDTO.setIdGrupo(null);
         doMegeListaPDF(    listaPDF, 
                            pathDescarga, 
                            correoElectronicDTO);
         String pathAndFileZip = comprimirArchivosEnCarpetaTemp( pathDescarga, 
                                                pathDescarga + File.separator + rfcEmpleado + "_" + correoElectronicDTO.getQnaInicial() + "-" + correoElectronicDTO.getQnaFinal() + ".zip", 
                                                rfcEmpleado + "_" + correoElectronicDTO.getQnaInicial() + "-" + correoElectronicDTO.getQnaFinal() + ".zip");
          
         correoElectronicDTO.setMergedPDF(pathAndFileZip.split("&")[0]);
         correoElectronicDTO.setNameFileZip(pathAndFileZip.split("&")[1]);
         
         // ------------------------- previsualiza correo ----------------------------
         String nombreEmpleado           = null;
         String pathNamePlantillaHTML    = null;
         String correoTemplateDir        = null;
         String plantilla                = null;
         String cuerpo                   = null;
         String uriImg                   = null;
         String redirecion               = null;
         
         correoTemplateDir = super.configuration().getString("correo.template.dir");
         
         pathNamePlantillaHTML = correoTemplateDir + File.separator + "mailTemplateNotificacionCFDI_ImgHref.html";
         
         List<TdEmpleado> listEmpleados = super.getService(TdEmpleadoDAO.class).findByRfcUnico(correoElectronicDTO.getRfcEmpleado());
         if(listEmpleados.size() > 0){ nombreEmpleado = listEmpleados.get(0).getNombreEmpleado() +  " " + listEmpleados.get(0).getPrimerApellido() + " " + listEmpleados.get(0).getSegundoApellido(); }
                 
         try {  plantilla = FileUtils.readFileToString(new File(pathNamePlantillaHTML));  } catch (IOException e) { e.printStackTrace(); }
         
         List<CorreoElectronic> lUriImg = super.persistence().get(QueryTnComprobanteDigDAO.class).getImagenTagForEnvioCFDIbyRfc();
             if(lUriImg.size()>0){ uriImg = lUriImg.get(0).getImgTag();  redirecion = lUriImg.get(0).getAncla(); } else{ uriImg = ""; redirecion = ""; }
         
         // asunto
         cuerpo = plantilla.replace("<!--ASUNTO-->", "&quot;" + "Comprobante CFDI" + "&quot;");
         
         // nombre del participante
         cuerpo = cuerpo.replace("<!--PARTICIPANTE-->", nombreEmpleado);
         
         // imagen de aviso
         if(uriImg != null && !uriImg.equalsIgnoreCase("")){
            cuerpo = cuerpo.replace("<!--imagen-->",  "<img src=" + '"' + uriImg + '"' + "/>");
         }
         
         // redireccionamiento
         if(redirecion != null && !redirecion.equalsIgnoreCase("")){
             cuerpo = cuerpo.replace("<!--ancla-->",  "<a href=" + '"' + redirecion + '"' + ">");
         }
         
         // redireccionamiento
         //cuerpo = cuerpo.replace("<!--ancla-->", "<a href=\"+ correoElectronicDTO.getAncla() + \">");
         
         logger.debug("CUERPO: " + cuerpo);
         
         correoElectronicDTO.setImgTag(cuerpo);
     }
     
    /**
     * @autor Martin C.
     * @param listaPdf
     * @param nomFolder
     * @param correoElectronicDTO
     * @returnString
     */
     public String doMegeListaPDF( List<String> listaPdf,
                                   String nomFolder,
                                   CorreoElectronicDTO correoElectronicDTO ) {
             
         String fileDoMergedPDF =   nomFolder + File.separator +
                                    correoElectronicDTO.getRfcEmpleado() + 
                                    "_" + correoElectronicDTO.getQnaInicial() + 
                                    "-" + correoElectronicDTO.getQnaFinal() + 
                                    ".pdf";
                                
         logger.debug("STOP");
         
         try{
         
             OutputStream outputStream = new FileOutputStream(fileDoMergedPDF);
             
             com.lowagie.text.Document document = new com.lowagie.text.Document();
             PdfWriter writer = PdfWriter.getInstance(document, outputStream);
             document.open();
             PdfContentByte cb = writer.getDirectContent();
             for(String file : listaPdf) {
                 PdfReader reader = new PdfReader(file);
                 for (int i = 1; i <= reader.getNumberOfPages(); i++) {
                     document.newPage();
                     //importa la pagina desde el pdf origen
                     PdfImportedPage page = writer.getImportedPage(reader, i);
                     //Agrega a la pagina al pdf destino
                     cb.addTemplate(page, 0, 0);
                 }
             }
             outputStream.flush();
             document.close();
             outputStream.close();
             
             for(String file : listaPdf) {
                File f = new File(file);
                if(f.exists()){
                    f.delete();
                }
             }
             
         } catch(Exception e){ e. printStackTrace(); }
         return fileDoMergedPDF;
    }
    
    /**
    * @autor Martin C.
    * @param correoElectronicDTO
    */ 
    public void previsualizaCorreoByRfc(CorreoElectronicDTO correoElectronicDTO){
        String nombreEmpleado           = null;
        String pathNamePlantillaHTML    = null;
        String correoTemplateDir        = null;
        String uriImg                   = null;
        String plantilla                = null;
        String cuerpo                   = null;
        String redirecion               = null;
        
        correoTemplateDir = super.configuration().getString("correo.template.dir");
        
        List<TdEmpleado> listEmpleados = super.getService(TdEmpleadoDAO.class).findByRfcUnico(correoElectronicDTO.getRfcEmpleado());
        if(listEmpleados.size() > 0){ nombreEmpleado = listEmpleados.get(0).getNombreEmpleado() +  " " + listEmpleados.get(0).getPrimerApellido() + " " + listEmpleados.get(0).getSegundoApellido(); }
        
        pathNamePlantillaHTML = correoTemplateDir + File.separator + "mailTemplateNotificacionCFDI_ImgHref.html";
        try {  plantilla = FileUtils.readFileToString(new File(pathNamePlantillaHTML));  } catch (IOException e) { e.printStackTrace(); }
        
        List<CorreoElectronic> lUriImg = super.persistence().get(QueryTnComprobanteDigDAO.class).getImagenTagForEnvioCFDIbyRfc();
        if(lUriImg.size()>0){ uriImg = lUriImg.get(0).getImgTag();  redirecion = lUriImg.get(0).getAncla(); } else{ uriImg = ""; redirecion = ""; }
        
        // asunto
        cuerpo = plantilla.replace("<!--ASUNTO-->", "&quot;" + "Comprobante CFDI" + "&quot;");
        
        // nombre del participante
        cuerpo = cuerpo.replace("<!--PARTICIPANTE-->", nombreEmpleado);
        
        // imagen de aviso
        if(uriImg != null && !uriImg.equalsIgnoreCase("")){
            cuerpo = cuerpo.replace("<!--imagen-->",  "<img src=" + '"' + uriImg + '"' + "/>");
        }
        
        // redireccionamiento
        if(redirecion != null && !redirecion.equalsIgnoreCase("")){
            cuerpo = cuerpo.replace("<!--ancla-->",  "<a href=" + '"' + redirecion + '"' + ">");
        }
        
        logger.debug("CUERPO: " + cuerpo);
        
        correoElectronicDTO.setPlantillaCorreo(cuerpo);
        
        logger.debug("STOP");
    }
    
     
     /**
     * @autor Martin C.
     * @param correoElectronicDTO
     */
    public void enviarCorreoElectronicoByEmpleado(CorreoElectronicDTO correoElectronicDTO) {
        String nombreEmpleado           = null;
        Map<String, String> adjuntos    = null;
        String pathNamePlantillaHTML    = null;
        String correoTemplateDir        = null;
        String plantilla                = null;
        String cuerpo                   = null;
        String uriImg                   = null;
        String redirecion               = null;
        
        correoTemplateDir = super.configuration().getString("correo.template.dir");
        
        pathNamePlantillaHTML = correoTemplateDir + File.separator + "mailTemplateNotificacionCFDI_ImgHref.html";
        
        List<CorreoElectronic> lUriImg = super.persistence().get(QueryTnComprobanteDigDAO.class).getImagenTagForEnvioCFDIbyRfc();
            if(lUriImg.size()>0){ uriImg = lUriImg.get(0).getImgTag();  redirecion = lUriImg.get(0).getAncla(); } else{ uriImg = ""; redirecion = ""; }
        
        List<TdEmpleado> listEmpleados = super.getService(TdEmpleadoDAO.class).findByRfcUnico(correoElectronicDTO.getRfcEmpleado());
        if(listEmpleados.size() > 0){ nombreEmpleado = listEmpleados.get(0).getNombreEmpleado() +  " " + listEmpleados.get(0).getPrimerApellido() + " " + listEmpleados.get(0).getSegundoApellido(); }
                
        try {  plantilla = FileUtils.readFileToString(new File(pathNamePlantillaHTML));  } catch (IOException e) { e.printStackTrace(); }
        
        // asunto
        cuerpo = plantilla.replace("<!--ASUNTO-->", "&quot;" + "Comprobante CFDI" + "&quot;");
        
        // nombre del participante
        cuerpo = cuerpo.replace("<!--PARTICIPANTE-->", nombreEmpleado);
        
        // imagen de aviso
        if(uriImg != null && !uriImg.equalsIgnoreCase("")){
            cuerpo = cuerpo.replace("<!--imagen-->",  "<img src=" + '"' + uriImg + '"' + "/>");
        }
        
        // redireccionamiento
        if(redirecion != null && !redirecion.equalsIgnoreCase("")){
            cuerpo = cuerpo.replace("<!--ancla-->",  "<a href=" + '"' + redirecion + '"' + ">");
        }
        
        logger.debug("CUERPO: " + cuerpo);
        
        correoElectronicDTO.setImgTag(cuerpo);
        
        for(ItemKeyDTO item : correoElectronicDTO.getAdjuntos() ){
            adjuntos = new HashMap<String, String>();
            
            File xmlFile = new File((String)item.getKey());
            File pdfFile = new File((String)item.getValue());
                        
            adjuntos.put(xmlFile.getAbsolutePath(), xmlFile.getName());
            adjuntos.put(pdfFile.getAbsolutePath(), pdfFile.getName());
            
            Properties messageProps = new Properties();
            messageProps.setProperty("dia", (new SimpleDateFormat("dd/MM/yyyy")).format(new Date()));
            messageProps.setProperty("hora", (new SimpleDateFormat("hh:mm:ss")).format(new Date()));
            messageProps.setProperty("usuario", "SHCP");
            
            MailParams mailParams = new MailParams();
            mailParams.setTemplateProperties(mail().getTemplateParams("simple-mail"));
            mailParams.addRecipient((String) correoElectronicDTO.getCorreoReceptor());
            mailParams.setFrom("comprobante_depago@hacienda.gob.mx");
            mailParams.setSubject("Comprobante CFDI");
            mailParams.setAttachments(adjuntos);
            mailParams.setText(cuerpo != null ? cuerpo.toString() : "");
            
            super.mail().send(mailParams);
        }
    }
    
    /**
    * @autor Martin C.
    * @param folder
    * @param pathNameZipFile
    * @param nameZipFile
    * 
    */
    public String comprimirArchivosEnCarpetaTemp(String folder, String pathNameZipFile, String nameZipFile){
        File fFolder = new File(folder);
        File[] ficheros = fFolder.listFiles();
        
        /*
        ArrayList<File> filesToAdd = new ArrayList<File>();
        
        try {
            net.lingala.zip4j.core.ZipFile zipFile = new net.lingala.zip4j.core.ZipFile(pathNameZipFile);
            
            for(File fichero : ficheros){  filesToAdd.add(new File(fichero.getAbsolutePath())); }
            
            ZipParameters parameters = new ZipParameters();
            parameters.setCompressionMethod(Zip4jConstants.COMP_DEFLATE);
            parameters.setCompressionLevel(Zip4jConstants.DEFLATE_LEVEL_NORMAL);
            parameters.setEncryptFiles(true);
            parameters.setEncryptionMethod(Zip4jConstants.ENC_METHOD_AES);
            parameters.setAesKeyStrength(Zip4jConstants.AES_STRENGTH_256);
            parameters.setPassword("M@Rt1nC@#053GuRa");
            zipFile.addFiles(filesToAdd, parameters);
        }
        catch (Exception e) { e.printStackTrace(); }
        return pathNameZipFile + "&" + nameZipFile;
        *************************************************************************************************** */
        
        FileOutputStream dest = null;
        BufferedInputStream origen = null;
        ZipOutputStream out = null;
        FileInputStream fileInputStream = null;
        byte data[] = new byte[2048];
        
        try { dest = new FileOutputStream(pathNameZipFile); 
              out = new ZipOutputStream(new BufferedOutputStream(dest));
        
            for(File fichero : ficheros){
                try {
                    fileInputStream = new FileInputStream(fichero);
                }  catch (FileNotFoundException e) { e.getMessage(); }
                origen = new BufferedInputStream(fileInputStream, 2048);
                ZipEntry zipEntry = new ZipEntry(fichero.getName());
                out.putNextEntry(zipEntry);
                
                int count;
                while ((count = origen.read(data, 0, 2048)) != -1) {
                    out.write(data, 0, count);
                }
                origen.close();
            }
            out.close();
            dest.close();
        } catch (Exception e) { e.getMessage(); }
        return pathNameZipFile + "&" + nameZipFile; 
    }
    
    /**
    * @autor Martin C.
    * @param folder
    */
    public void deleteFolder(File folder){
        File[] ficheros = folder.listFiles();
        for(File fichero : ficheros){
            if(fichero.isDirectory()){
                deleteFolder(fichero);
            } else { fichero.delete(); }
        }
        folder.delete();
    }
    
    /**
    * @autor Martin C.
    * @param clob
    */
    private String clobToString(java.sql.Clob clob) {
        try {
            if (clob != null) {
                InputStream is;
                is = clob.getAsciiStream();
                StringWriter sw = new StringWriter();
                IOUtils.copy(is, sw);
                return sw.toString();
            }
        } catch (SQLException e) {
            throw new ServiceException("Error: " + e.getMessage());
        } catch (IOException e) {
            throw new ServiceException("Error: " + e.getMessage());
        }
    return null;

    }
    
    /**
    * @autor Martin C.
    * @param correoElectronicDTO
    */
    public void getListaFoliosByRfcAndQnaDesdeHasta(CorreoElectronicDTO correoElectronicDTO){
        List<FolioTnComprobanteDig>     listFoliosDataBaseDomain    = new ArrayList<FolioTnComprobanteDig>();
        List<FolioTnComprobanteDig>     listFoliosDataBaseDomainAux = new ArrayList<FolioTnComprobanteDig>();
        List<FolioTnComprobanteDigDTO>  listFoliosDataBaseModel     = new ArrayList<FolioTnComprobanteDigDTO>();
        
        List<TnConceptoPagado> lisTnConceptoPagado0A = new ArrayList<TnConceptoPagado>();
        List<TnConceptoPagado> lisTnConceptoPagadoP37 = new ArrayList<TnConceptoPagado>();
        
        listFoliosDataBaseDomain = super.persistence().get(QueryTnComprobanteDigDAO.class).getFoliosByRfcAndQnaDesdeHasta(correoElectronicDTO.getRfcEmpleado(),correoElectronicDTO.getQnaInicial(), correoElectronicDTO.getQnaFinal());
        
        if(listFoliosDataBaseDomain.size() > 0){
            for(FolioTnComprobanteDig folioDataBaseDomain : listFoliosDataBaseDomain){
                if(folioDataBaseDomain.getGrupoPago().equalsIgnoreCase("H")){
                    lisTnConceptoPagado0A = super.persistence().get(QueryTnComprobanteDigDAO.class).getFoliosByRfcAndQnaDesdeHastaCpto0A(folioDataBaseDomain.getFolio());
                    if(lisTnConceptoPagado0A.size() > 0){  listFoliosDataBaseDomainAux.add(folioDataBaseDomain);  }
                }
                else {
                    lisTnConceptoPagadoP37 = super.persistence().get(QueryTnComprobanteDigDAO.class).getFoliosByRfcAndQnaDesdeHastaCptoP37(folioDataBaseDomain.getFolio());
                    if(lisTnConceptoPagadoP37.size() == 0){  listFoliosDataBaseDomainAux.add(folioDataBaseDomain);  }
                }
            }
            listFoliosDataBaseModel =  super.transformation().map(listFoliosDataBaseDomainAux, FolioTnComprobanteDigDTO.class);
            correoElectronicDTO.setListFoliosTnComprobanteDigDTO(listFoliosDataBaseModel);
        } else {  correoElectronicDTO.setListFoliosTnComprobanteDigDTO(new ArrayList<FolioTnComprobanteDigDTO>());  }
    }

    public List<TnComprobanteDigDTO> getCadenaOriginalByIdNomina(Integer idNomina) {
        List<TnComprobanteDig> lista = super.persistence().get(CustoTnComprobanteDigDAO.class).getCadenaOriginalByIdNomina(idNomina);
        List<TnComprobanteDigDTO> listaTnComprobanteDigDTO = super.transformation().map(lista, TnComprobanteDigDTO.class );
        return listaTnComprobanteDigDTO;
    }
    
    public TnComprobanteDigDTO getTnComprobanteDigById(Integer cnFolio, Integer cnDifFolio, Integer cnPaqute) {
        TnComprobanteDig tnComprobanteDig = super.persistence().get(CustoTnComprobanteDigDAO.class).getTnComprobanteDigById(cnFolio, cnDifFolio, cnPaqute);
        TnComprobanteDigDTO tnComprobanteDigDTO = super.transformation().map(tnComprobanteDig, TnComprobanteDigDTO.class );
        return tnComprobanteDigDTO;
    }

    /**
     * GENERAR EL PAQUETE XML PARA SU ENVIO AL SAT
     * @Autor MARTIN C.
     */
    public void processSatGenerarCadenas(String roothPath, int idNomina, String usuario) {
        NominaDTO nominaDTO = super.getService(GestionNominaService.class).getNominaById(idNomina);

        /* Genero la lista de pagos por nomina */
        List<DatosXMLAnexo20DTO> listaPagos = pagosPorNomina(new Integer(idNomina), null);
        //Lista de comprobantes
        List<gob.shcp.sireh.model.sat.cfdi.v33.Comprobante> listaComprobantes = getListaComprobantes(listaPagos);
        // Se genera lista  de comprobantes para guardar en base de datos y listaCadenasOriginales para archivo
        List<String> listCadenaOriginal = new ArrayList<String>();
        List<CustomTnComprobanteDig> listCustomComprobantes = getlistCustomComprobantes(roothPath, nominaDTO.getCnPaquete(), listaComprobantes, listCadenaOriginal, usuario);
        listaComprobantes = null;

        String urlNombreFolder = super.configuration().getString("local.temp.dir") + File.separator + idNomina;
            
        File folder = null;
        folder = new File(urlNombreFolder);
        folder.mkdir();
        // Se genera zip para guardarlo en base de datos
        String nomArchCadOriginalZip = getZipCadenas(Integer.valueOf(idNomina), listCadenaOriginal, nominaDTO.getNomQnaCaptura());
        File fileArchCadOriginalZip = new File(urlNombreFolder + File.separator + nomArchCadOriginalZip);

        try {
            byte[] byteCadOriginalTxtZip = org.apache.commons.io.FileUtils.readFileToByteArray(fileArchCadOriginalZip);

            nominaDTO.setNomFecCreacion(new Date());
            nominaDTO.setNomArchCreacion(byteCadOriginalTxtZip);
            nominaDTO.setNomFecAnexo20(new Date());

        } catch (IOException e) {
            throw new ServiceException("Error: " + e.getMessage());
        }
        //Inserta comprobantes
        super.persistence().get(CustoTnComprobanteDigDAO.class).insertTnComprobanteDig(listCustomComprobantes);
        nominaDTO.setNomRefTimbrado("E");
        //actualiza nomina
        super.getService(GestionNominaService.class).updateNominaCompleta(nominaDTO);
    }
    
    /**
     * Genera y actualiza la cadena original por folio
     * @Autor Gualberto G.
     */
    public void updateCadenaOriginal(String roothPath, int idNomina, int cnFolio, int cnDifFolio, int cnPaquete, String usuario) {
        NominaDTO nominaDTO = super.getService(GestionNominaService.class).getNominaById(idNomina);
        TnComprobanteDigPK tnComprobanteDigPK = new TnComprobanteDigPK();
        tnComprobanteDigPK.setCnFolio(Long.valueOf( cnFolio ));
        tnComprobanteDigPK.setCnDifFolio(cnDifFolio);
        tnComprobanteDigPK.setCnPaquete(cnPaquete);
        
        TnComprobanteDig tnComprobanteDig = super.persistence().get(TnComprobanteDigDAO.class).getById(tnComprobanteDigPK);
        CustomTnComprobanteDig customTnComprobanteDig = new CustomTnComprobanteDig();
        SirehUtils.copyProperties(customTnComprobanteDig, tnComprobanteDig);
        /* Genero la lista de pagos por nomina */
        List<DatosXMLAnexo20DTO> listaPagos = pagosPorNomina(idNomina, cnFolio);
        //Lista de comprobantes
        List<gob.shcp.sireh.model.sat.cfdi.v33.Comprobante> listaComprobantes = getListaComprobantes(listaPagos);
        // Se genera lista  de comprobantes para guardar en base de datos y listaCadenasOriginales para archivo
        List<String> listCadenaOriginal = new ArrayList<String>();
        List<CustomTnComprobanteDig> listCustomComprobantes = getlistCustomComprobantes(roothPath, nominaDTO.getCnPaquete(), listaComprobantes, listCadenaOriginal, usuario);
        listaComprobantes = null;

        String urlNombreFolder = super.configuration().getString("local.temp.dir") + File.separator + idNomina;
            
        File folder = null;
        folder = new File(urlNombreFolder);
        folder.mkdir();
        // Se genera zip para guardarlo en base de datos
        String nomArchCadOriginalZip = getZipCadenas(Integer.valueOf(idNomina), listCadenaOriginal, nominaDTO.getNomQnaCaptura());
        File fileArchCadOriginalZip = new File(urlNombreFolder + File.separator + nomArchCadOriginalZip);

        try {
            byte[] byteCadOriginalTxtZip = org.apache.commons.io.FileUtils.readFileToByteArray(fileArchCadOriginalZip);
            customTnComprobanteDig.setCnArchCreacion(byteCadOriginalTxtZip);
            customTnComprobanteDig.setCnCadenaOriginal(listCadenaOriginal != null && !listCadenaOriginal.isEmpty() ? listCadenaOriginal.get(0) : null);
            customTnComprobanteDig.setCnXmlGenerado(listCustomComprobantes != null && !listCustomComprobantes.isEmpty() ? listCustomComprobantes.get(0).getCnXmlGenerado() : null );
            customTnComprobanteDig.setCnRefTimbrado("E");

        } catch (IOException e) {
            throw new ServiceException("Error: " + e.getMessage());
        }
        
        super.persistence().get(CustoTnComprobanteDigDAO.class).updateTnComprobanteDig(customTnComprobanteDig);
        
    }
    
    /**
     * CONSULTA LOS CONCEPTOS PAGADOS A CADA EMPLEADO EN LA NOMINA
     * @Autor MARTIN C.
     */
    public List<DatosXMLAnexo20DTO> pagosPorNomina(Integer idNomina, Integer hpFolio){
        List<CustomTnHistoricoPagoXML>      historicoPagoDomain;
        List<CustomTnConceptoPagadoXML>     conceptosPagadosDomain;
        List<DatosXMLAnexo20DTO>            listaXML    = new ArrayList<DatosXMLAnexo20DTO>();
        DependenciaDTO                      patron      = new DependenciaDTO();
        DatosXMLAnexo20DTO                  pago        = null;
        
        if(hpFolio != null){
            historicoPagoDomain     =  super.persistence().get(QueryTnComprobanteDigDAO.class).getHistoricoAnexo20ByIdNominaAndFolio(idNomina, hpFolio);
            conceptosPagadosDomain  =  super.persistence().get(QueryTnComprobanteDigDAO.class).getConceptosAnexo20ByIdNominaAndFolio(idNomina, hpFolio);
        } else {
            historicoPagoDomain     =  super.persistence().get(QueryTnComprobanteDigDAO.class).getHistoricoPagoAnexo20ByIdNomina(idNomina);
            conceptosPagadosDomain  =  super.persistence().get(QueryTnComprobanteDigDAO.class).getConceptosPagadosAnexo20ByIdNomina(idNomina);
        }
        List<CustomTnHistoricoPagoXMLDTO>    historicoPago      = super.transformation().map(historicoPagoDomain, CustomTnHistoricoPagoXMLDTO.class);
        List<CustomTnConceptoPagadoXMLDTO>   conceptosPagados   = super.transformation().map(conceptosPagadosDomain, CustomTnConceptoPagadoXMLDTO.class);
        
        for(CustomTnHistoricoPagoXMLDTO dato : historicoPago){
            pago = new DatosXMLAnexo20DTO();
            
            pago.setVersion( "3.3" );
            pago.setSerie(dato.getIdNomina().toString());
            pago.setFolio(dato.getFolio());
            pago.setDifFolio(dato.getHpDifFolio());
            pago.setFecha(new Date());
            
            if(dato.getBanco().equals("000")){
                pago.setFormaPago("02");
            } else {
                pago.setFormaPago("03");
            }
            
            pago.setNoCertificado(super.configuration().getString("timbrado", "SIREH_TIMBRADO_NUM_CERTIFICADO"));
            pago.setMoneda("MXN");
            pago.setTipoDeComprobante("N");
            pago.setMetodoDePago(patron.getMetodoPago());
            pago.setLugarExpedicion(patron.getLugar());
            pago.setRfcEmisor(super.configuration().getString("timbrado", "SIREH_TIMBRADO_RFC_SHCP"));
            pago.setNombreEmisor(patron.getNombre());
            pago.setRegimen(patron.getRegimenFiscal());
            pago.setRfcReceptor(dato.getRfcEmpleado());
            pago.setNombreReceptor(this.nombre(dato));
            pago.setUsoCfdi(patron.getUsoCfdi());
            pago.setCantidad(patron.getCantidad());
            pago.setClaveProdServ(patron.getCveProdServ());
            pago.setCveUnidad(patron.getCveUnidad());
            pago.setUnidad(patron.getUnidad());
            pago.setCertificado(patron.getCertificado());
            pago.setDescripcionConcepto(patron.getDescripcionConcepto());
            pago.setRegistroPatronal(patron.getRegistroPatronal());
            
            pago.setVersionNomina(patron.getVersionNomina());
            pago.setFechaPago(dato.getFecPago());
            pago.setFechaInicial(dato.getFecIniPago());
            pago.setFechaFinal(dato.getFecFinPago());
            pago.setNumDiasPagados(dato.getDiasPagados());
            pago.setCurp(dato.getCurpEmpleado());
            pago.setNss(dato.getNssEmpleado());
            pago.setFechaInicioRelLab(dato.getFecIngreso());
            pago.setAntiguedad(getAntiguedad(pago));
            pago.setTipoContrato(dato.getTipoContrata());
            pago.setTipoJornada(dato.getJornada());
            pago.setTipoRegimen("0" + dato.getTipoReg().toString());
            pago.setNumEmpleado(Integer.toString(dato.getFolio()));
            pago.setDepartamento(dato.getDepto());
            pago.setPuesto(dato.getPuesto1().toUpperCase());
            pago.setRiesgoPuesto(dato.getRiesgo().toString());
            //pago.setTipoNomina(dato.getTipoNomina().equalsIgnoreCase("E") ? "O" : dato.getTipoNomina());
            pago.setTipoNomina(dato.getTipoNomina());
            pago.setPeriodicidadPago(dato.getPeriodicidad());
            pago.setCuentaBancaria(dato.getClabe());
            pago.setSindicalizado(dato.getHpNombramiento() != null && dato.getHpNombramiento().equals("B") ? "Sí" : null);
            List<ConceptoPagoXMLAnexo20DTO> cptos = obtieneCptos(dato.getFolio(),dato.getHpDifFolio(), conceptosPagados);
            //conceptosPagadosDomain  =  super.persistence().get(QueryTdEmpleadoDAO.class).getConceptosPagadosAnexo20ByIdNominaAndFolio(idNomina,dato.getFolio());
            //List<ConceptoPagoXMLAnexo20DTO> cptos = transformCptos(conceptosPagadosDomain);
            // calcula salario diario integrado
            //pago.setSdoDiarioIntegrado(this.salarioDiario(cptos, pago.getNumDiasPagados()));
            pago.setSdoDiarioIntegrado(BigDecimal.ZERO);
            
            calculaTotales(pago, cptos);
            listaXML.add(pago);
            
        }
        return listaXML;
    }
    
    public void calculaTotales(DatosXMLAnexo20DTO pago, List<ConceptoPagoXMLAnexo20DTO> cptos){
        BigDecimal totPer = new BigDecimal(0);
        BigDecimal totDed = new BigDecimal(0);
        BigDecimal totImp = new BigDecimal(0);
        BigDecimal totGra = new BigDecimal(0);
        BigDecimal totExe = new BigDecimal(0);
        BigDecimal totOtp = new BigDecimal(0);        
        List <ConceptoPagoXMLAnexo20DTO> per = new ArrayList<ConceptoPagoXMLAnexo20DTO>();
        List <ConceptoPagoXMLAnexo20DTO> ded = new ArrayList<ConceptoPagoXMLAnexo20DTO>();
        List <ConceptoPagoXMLAnexo20DTO> otp = new ArrayList<ConceptoPagoXMLAnexo20DTO>();
        
        if (!cptos.isEmpty()) {
            for (ConceptoPagoXMLAnexo20DTO c: cptos) {
                if (c.getTipoCptoNom().equals("P")) {
                    if (c.getCveCptoTimbrado() != null && (c.getCveCptoTimbrado().equals("999") || c.getCveCptoTimbrado().equals("004"))) {
                        totOtp = totOtp.add(c.getMontoCpto());
                        otp.add(c);
                    } else {
                        totPer = totPer.add(c.getMontoCpto());

                        // impuesto
                        if (c.getTieneIsr().equals("I")) {
                            totImp = totImp.subtract(c.getMontoCpto());
                        }
                        // gravado
                        if (c.getTieneIsr().equals("S")) {
                            totGra = totGra.add(c.getMontoCpto());
                            c.setMontoGravado(c.getMontoCpto());
                        }
                        // exento
                        if (c.getTieneIsr().equals("E")) {
                            totExe = totExe.add(c.getMontoCpto());
                            c.setMontoExento(c.getMontoCpto());
                        }
                        per.add(c);
                    }
                } 
                else {
                    // impuesto
                    if(c.getTieneIsr().equals("I")) {
                        totImp = totImp.add(c.getMontoCpto());
                    } else {
                        totDed = totDed.add(c.getMontoCpto());
                    } ded.add(c);
                }
            }
        }
        
        pago.setSubTotal(totPer.add(totOtp));
        pago.setDescuento(totDed.add(totImp));
        pago.setTotal(totPer.subtract(totDed).subtract(totImp).add(totOtp));
        pago.setValorUnitario(totPer.add(totOtp));
        pago.setImporte(totPer.add(totOtp));
        pago.setTotalPercepciones(totPer );
        pago.setTotalDeducciones(totDed.add(totImp));
        //pago.setTotalSueldos(totPer);
        pago.setTotalGravado(totGra);
        pago.setTotalExento(totExe);
        pago.setTotalSueldos(totExe.add(totGra));
        pago.setTotalOtrasDeducciones(totDed);
        pago.setTotalImpuestosRetenidos(totImp);
        pago.setDeducciones(ded);
        pago.setPercepciones(per);
        pago.setTotalOtrosPagos(totOtp);
        pago.setOtrosPagos(otp);
    }
    
    /**
     * CONSULTA LOS CONCEPTOS DE PAGO DE UN FOLIO
     * @Autor MARTIN C.
     */
    public List<ConceptoPagoXMLAnexo20DTO> obtieneCptos(Integer folio, Integer difFolio, List<CustomTnConceptoPagadoXMLDTO> conceptosPagados){
        List<ConceptoPagoXMLAnexo20DTO> cptos = new ArrayList<ConceptoPagoXMLAnexo20DTO>();
        ListIterator<CustomTnConceptoPagadoXMLDTO> iter = conceptosPagados.listIterator();
        while(iter.hasNext()){
            CustomTnConceptoPagadoXMLDTO conceptoPagadoXMLDTO = iter.next();
            if(conceptoPagadoXMLDTO.getFolio().compareTo(folio) == 0 && conceptoPagadoXMLDTO.getDifFolio().compareTo(difFolio) == 0){
                ConceptoPagoXMLAnexo20DTO cpto = new ConceptoPagoXMLAnexo20DTO();
                cpto.setCveCptoNom(conceptoPagadoXMLDTO.getIdCptoPago() );
                cpto.setCveCptoTimbrado(conceptoPagadoXMLDTO.getCveSat());
                cpto.setDescripcionCpto(conceptoPagadoXMLDTO.getDescripcion());
                cpto.setMontoCpto(conceptoPagadoXMLDTO.getMonto().setScale(2, RoundingMode.CEILING));
                cpto.setNumCpto(conceptoPagadoXMLDTO.getNumConcepto());
                cpto.setTieneIsr(conceptoPagadoXMLDTO.getTieneIsr());
                cpto.setTipoCptoNom(conceptoPagadoXMLDTO.getTipoCpto().trim());
                cpto.setMontoGravado(new BigDecimal(0));
                cpto.setMontoExento(new BigDecimal(0));
                cptos.add(cpto);
                iter.remove();
            }
            conceptoPagadoXMLDTO = null;
        }
    /*        for(CustomTnConceptoPagadoXMLDTO cptoPagado : conceptosPagados){
            if((cptoPagado.getFolio().compareTo(folio) == 0  ) && (cptoPagado.getDifFolio().compareTo(difFolio) == 0 )){
                ConceptoPagoXMLAnexo20DTO cpto = new ConceptoPagoXMLAnexo20DTO();
                cpto.setCveCptoNom(cptoPagado.getIdCptoPago() );
                cpto.setCveCptoTimbrado(cptoPagado.getCveSat());
                cpto.setDescripcionCpto(cptoPagado.getDescripcion());
                cpto.setMontoCpto(cptoPagado.getMonto().setScale(2, RoundingMode.CEILING));
                cpto.setNumCpto(cptoPagado.getNumConcepto());
                cpto.setTieneIsr(cptoPagado.getTieneIsr());
                cpto.setTipoCptoNom(cptoPagado.getTipoCpto().trim());
                cpto.setMontoGravado(new BigDecimal(0));
                cpto.setMontoExento(new BigDecimal(0));
                cptos.add(cpto);
                conceptosPagados.remove(cptoPagado);
            } 
        }*/
        return cptos;
    }

    
    private List<gob.shcp.sireh.model.sat.cfdi.v33.Comprobante> getListaComprobantes(List<DatosXMLAnexo20DTO> listaPagos){
        List<gob.shcp.sireh.model.sat.cfdi.v33.Comprobante> listaComprobantes = new ArrayList<gob.shcp.sireh.model.sat.cfdi.v33.Comprobante>();
        String certificado = getCertificado();
        gob.shcp.sireh.model.sat.cfdi.v33.Comprobante comprobante = null;
        for (DatosXMLAnexo20DTO pago: listaPagos) {
            comprobante = getComprobante(pago, certificado);
            listaComprobantes.add(comprobante);
        }
        listaPagos = null;
        return listaComprobantes;
    }
    
    private gob.shcp.sireh.model.sat.cfdi.v33.Comprobante getComprobante(DatosXMLAnexo20DTO pago, String certificado){
        gob.shcp.sireh.model.sat.cfdi.v33.ObjectFactory c = new gob.shcp.sireh.model.sat.cfdi.v33.ObjectFactory();
        
        /*** DEFINE COMPROBANTE ***/
        gob.shcp.sireh.model.sat.cfdi.v33.Comprobante                      comprobante  = c.createComprobante();
        gob.shcp.sireh.model.sat.cfdi.v33.Comprobante.Emisor               cEmisor      = c.createComprobanteEmisor();
        gob.shcp.sireh.model.sat.cfdi.v33.Comprobante.Receptor             cReceptor    = c.createComprobanteReceptor();
        gob.shcp.sireh.model.sat.cfdi.v33.Comprobante.Complemento          cComplemento = c.createComprobanteComplemento();
        gob.shcp.sireh.model.sat.cfdi.v33.Comprobante.Conceptos            cConceptos   = c.createComprobanteConceptos();
        gob.shcp.sireh.model.sat.cfdi.v33.Comprobante.Conceptos.Concepto   cConcepto    = c.createComprobanteConceptosConcepto();
        gob.shcp.sireh.model.sat.cfdi.v33.Comprobante.Impuestos            cImpuestos   = c.createComprobanteImpuestos();

        
        /***** ATRIBUTOS DE COMPROBANTE *****/
        comprobante.setVersion(pago.getVersion());
        comprobante.setSerie(pago.getSerie());              
        comprobante.setFolio(Integer.toString(pago.getFolio()));
        comprobante.setFecha(getXMLGregorianCalendarNow());
        //System.out.println("Fecha " + comprobante.getFecha().getHour() + ":" + comprobante.getFecha().getMinute()  + ":" + comprobante.getFecha().getSecond() );
        comprobante.setSubTotal(pago.getSubTotal().setScale(2, RoundingMode.CEILING));
        comprobante.setDescuento(pago.getDescuento().setScale(2, RoundingMode.CEILING)); 
        comprobante.setMoneda(gob.shcp.sireh.model.sat.cfdi.v33.CMoneda.MXN);
        comprobante.setTotal(pago.getTotal().setScale(2, RoundingMode.CEILING));
        
        comprobante.setTipoDeComprobante(CTipoDeComprobante.N);
        
        comprobante.setFormaPago("99");
        
        if(pago.getMetodoDePago().trim().equalsIgnoreCase("PUE")){
            comprobante.setMetodoPago(CMetodoPago.PUE);
        } else if(pago.getMetodoDePago().trim().equalsIgnoreCase("PIP")){
            comprobante.setMetodoPago(CMetodoPago.PIP);
        } else if(pago.getMetodoDePago().trim().equalsIgnoreCase("PPD")){
            comprobante.setMetodoPago(CMetodoPago.PPD);
        }
        
        comprobante.setLugarExpedicion(pago.getLugarExpedicion());
        comprobante.setNoCertificado(pago.getNoCertificado());
        // TODO VERIFICAR CERTIFICADO
        //comprobante.setCertificado(certificado);
        
        /*** NODO EMISOR ***/
        cEmisor.setRfc(pago.getRfcEmisor());
        cEmisor.setNombre(pago.getNombreEmisor());
        cEmisor.setRegimenFiscal(pago.getRegimen());
        
        /*** NODO RECEPTOR ***/
        cReceptor.setNombre(pago.getNombreReceptor());
        cReceptor.setRfc(pago.getRfcReceptor());
        
        logger.debug("CUsoCFDI: " + pago.getUsoCfdi());
        cReceptor.setUsoCFDI(gob.shcp.sireh.model.sat.cfdi.v33.CUsoCFDI.P_01);
        
        /*** NODO CONCEPTO ***/
        cConcepto.setClaveProdServ(pago.getClaveProdServ());
        cConcepto.setCantidad(new BigDecimal(pago.getCantidad()).setScale(0, RoundingMode.CEILING));
        cConcepto.setClaveUnidad(pago.getCveUnidad());
        cConcepto.setDescripcion(pago.getDescripcionConcepto() );
        cConcepto.setValorUnitario(pago.getValorUnitario().setScale(2, RoundingMode.CEILING)); 
        cConcepto.setImporte(pago.getImporte().setScale(2, RoundingMode.CEILING));
        cConcepto.setDescuento(pago.getTotalDeducciones().setScale(2, RoundingMode.CEILING));
        cConceptos.getConcepto().add(cConcepto);
        
         /** DEFINE COMPLEMENTO NOMINA **/
         //gob.shcp.sireh.model.sat.nomina.v12.Nomina nomina = new gob.shcp.sireh.model.sat.nomina.v12.Nomina();
        gob.shcp.sireh.model.sat.nomina.v12.ObjectFactory n = new gob.shcp.sireh.model.sat.nomina.v12.ObjectFactory();
        gob.shcp.sireh.model.sat.nomina.v12.Nomina nomina = n.createNomina();
         Nomina.OtrosPagos otrosPagos = n.createNominaOtrosPagos();
         List<Nomina.OtrosPagos.OtroPago> listOtroPago = otrosPagos.getOtroPago();
         gob.shcp.sireh.model.sat.nomina.v12.Nomina.Incapacidades incapacidades = n.createNominaIncapacidades();
         List<Nomina.Incapacidades.Incapacidad> listIncapacidades = incapacidades.getIncapacidad();
         nomina.setVersion(pago.getVersionNomina());
         nomina.setFechaPago(getXMLGregorianCalendarFecha(pago.getFechaPago()));
         nomina.setFechaInicialPago(getXMLGregorianCalendarFecha(pago.getFechaInicial()));
         nomina.setFechaFinalPago(getXMLGregorianCalendarFecha(pago.getFechaFinal()));
         nomina.setNumDiasPagados(new BigDecimal(pago.getNumDiasPagados()));
         if(pago.getTipoNomina().equals("O")) { nomina.setTipoNomina(gob.shcp.sireh.model.sat.nomina.v12.CTipoNomina.O); }
         else { nomina.setTipoNomina( gob.shcp.sireh.model.sat.nomina.v12.CTipoNomina.E); }
         nomina.setTotalDeducciones(pago.getTotalDeducciones().compareTo(BigDecimal.ZERO) > 0 ? pago.getTotalDeducciones().setScale(2, RoundingMode.CEILING) : null);
         nomina.setTotalPercepciones(pago.getTotalPercepciones().setScale(2, RoundingMode.CEILING));
         nomina.setTotalOtrosPagos(pago.getTotalOtrosPagos() != null && pago.getTotalOtrosPagos().compareTo(BigDecimal.ZERO) > 0 ? pago.getTotalOtrosPagos().setScale(2, RoundingMode.CEILING) : null);
        
        /*** EMISOR NOMINA ***/
        gob.shcp.sireh.model.sat.nomina.v12.Nomina.Emisor emisornomina = new gob.shcp.sireh.model.sat.nomina.v12.Nomina.Emisor();
        emisornomina.setRegistroPatronal(pago.getRegistroPatronal());
        Nomina.Emisor.EntidadSNCF entidadSNCF = n.createNominaEmisorEntidadSNCF();
        entidadSNCF.setOrigenRecurso(COrigenRecurso.IF);
        //emisornomina.setEntidadSNCF(entidadSNCF);
        
        /*** RECEPTOR NOMINA ***/
        gob.shcp.sireh.model.sat.nomina.v12.Nomina.Receptor receptornomina = new gob.shcp.sireh.model.sat.nomina.v12.Nomina.Receptor();
        receptornomina.setCurp(pago.getCurp());
        receptornomina.setTipoContrato(pago.getTipoContrato());
        
        receptornomina.setNumSeguridadSocial(pago.getNss());
        receptornomina.setFechaInicioRelLaboral(getXMLGregorianCalendarFecha(pago.getFechaInicioRelLab()));
        receptornomina.setCurp(pago.getCurp());
        receptornomina.setTipoRegimen(pago.getTipoRegimen());
        receptornomina.setNumEmpleado(pago.getNumEmpleado());
        receptornomina.setPeriodicidadPago(pago.getPeriodicidadPago());
        receptornomina.setClaveEntFed( gob.shcp.sireh.model.sat.nomina.v12.CEstado.DIF);
        receptornomina.setNumSeguridadSocial(pago.getNss());
        if(pago.getCuentaBancaria() != null && Long.valueOf( pago.getCuentaBancaria()).longValue() != 0 ){
            receptornomina.setCuentaBancaria(pago.getCuentaBancaria());
        }

        
        receptornomina.setFechaInicioRelLaboral(getXMLGregorianCalendarFecha(pago.getFechaInicioRelLab()));
        receptornomina.setAntigüedad(getAntiguedad(pago) );
        receptornomina.setPuesto(pago.getPuesto());
        receptornomina.setSalarioBaseCotApor(pago.getSdoBaseCotApor()); // Opcional en el anexo20
        receptornomina.setRiesgoPuesto(pago.getRiesgoPuesto());
        receptornomina.setSalarioDiarioIntegrado(pago.getSdoDiarioIntegrado());
        receptornomina.setTipoJornada(pago.getTipoJornada());
        //receptornomina.setDepartamento(pago.getDepartamento());
        if(pago.getSindicalizado() != null){
            receptornomina.setSindicalizado(pago.getSindicalizado());
        }
        
        /** PERCEPCIONES NOMINA **/
        gob.shcp.sireh.model.sat.nomina.v12.Nomina.Percepciones percnomina = new gob.shcp.sireh.model.sat.nomina.v12.Nomina.Percepciones();
        
        percnomina.setTotalGravado(pago.getTotalGravado().setScale(2, RoundingMode.CEILING));
        percnomina.setTotalExento(pago.getTotalExento().setScale(2, RoundingMode.CEILING));
        percnomina.setTotalSueldos(pago.getTotalSueldos().setScale(2, RoundingMode.CEILING));
        
        /** DEDUCCIONES NOMINA **/
        gob.shcp.sireh.model.sat.nomina.v12.Nomina.Deducciones deducnomina = new gob.shcp.sireh.model.sat.nomina.v12.Nomina.Deducciones();
        deducnomina.setTotalOtrasDeducciones(pago.getTotalOtrasDeducciones().setScale(2, RoundingMode.CEILING));
        deducnomina.setTotalImpuestosRetenidos(pago.getTotalImpuestosRetenidos().setScale(2, RoundingMode.CEILING));
        
        /** CICLO DE PERCEPCIONES Y DEDUCCIONES **/
        for(ConceptoPagoXMLAnexo20DTO pag:  pago.getPercepciones()){
            gob.shcp.sireh.model.sat.nomina.v12.Nomina.Percepciones.Percepcion p = new gob.shcp.sireh.model.sat.nomina.v12.Nomina.Percepciones.Percepcion();
            p.setTipoPercepcion(pag.getCveCptoTimbrado());
            p.setClave(pag.getCveCptoNom());
            p.setConcepto(normalizeDesc(pag.getDescripcionCpto()));
            p.setImporteGravado(pag.getMontoGravado().setScale(2, RoundingMode.CEILING));
            p.setImporteExento(pag.getMontoExento().setScale(2, RoundingMode.CEILING));
            if(pag.getCveCptoTimbrado() != null && pag.getCveCptoTimbrado().equals("019") ){
                Nomina.Percepciones.Percepcion.HorasExtra horasExtra = new Nomina.Percepciones.Percepcion.HorasExtra();
                horasExtra.setDias(1);
                horasExtra.setTipoHoras("03");
                horasExtra.setImportePagado(pag.getMontoGravado().setScale(2, RoundingMode.CEILING));
                horasExtra.setHorasExtra(3);
                p.getHorasExtra().add(horasExtra);
            }
            percnomina.getPercepcion().add(p);
        }
        
        for(ConceptoPagoXMLAnexo20DTO pag:  pago.getDeducciones()){
            
            gob.shcp.sireh.model.sat.nomina.v12.Nomina.Deducciones.Deduccion d = new gob.shcp.sireh.model.sat.nomina.v12.Nomina.Deducciones.Deduccion();
            if(pag.getCveCptoTimbrado() != null && pag.getCveCptoTimbrado().equals("006")){
                Nomina.Incapacidades.Incapacidad incapacidad = n.createNominaIncapacidadesIncapacidad();
                incapacidad.setDiasIncapacidad(1);
                incapacidad.setTipoIncapacidad("02");
                incapacidad.setImporteMonetario(pag.getMontoCpto().setScale(2, RoundingMode.CEILING));
                listIncapacidades.add(incapacidad);
            }
            d.setTipoDeduccion(pag.getCveCptoTimbrado());
            d.setClave(pag.getCveCptoNom());
            d.setConcepto(normalizeDesc(pag.getDescripcionCpto()));
            d.setImporte(pag.getMontoCpto().setScale(2, RoundingMode.CEILING));
            deducnomina.getDeduccion().add(d);
        }
                
        for (ConceptoPagoXMLAnexo20DTO pag: pago.getOtrosPagos()) {
            Nomina.OtrosPagos.OtroPago otroPago = n.createNominaOtrosPagosOtroPago();
            otroPago.setClave(pag.getCveCptoNom());
            otroPago.setConcepto(normalizeDesc(pag.getDescripcionCpto()));
            otroPago.setImporte(pag.getMontoCpto());
            otroPago.setTipoOtroPago(pag.getCveCptoTimbrado());
            listOtroPago.add(otroPago);
        }
        
        /** DATOS DEL COMPLEMENTO NOMINA **/
        nomina.setEmisor(emisornomina);
        nomina.setReceptor(receptornomina);
        nomina.setPercepciones(percnomina);
        nomina.setDeducciones(!deducnomina.getDeduccion().isEmpty() ? deducnomina : null );
        nomina.setOtrosPagos(!listOtroPago.isEmpty() ? otrosPagos : null);
        nomina.setIncapacidades(!listIncapacidades.isEmpty() ? incapacidades : null);
        /** AGREGA NOMINA A COMPLEMENTO **/
        cComplemento.getAny().add(nomina);
        
        /** INSERTA ELEMENTOS DEL COMPROBANTE **/
        comprobante.setEmisor(cEmisor);
        comprobante.setReceptor(cReceptor);
        comprobante.setConceptos(cConceptos);
        //comprobante.setImpuestos(cImpuestos);
        comprobante.getComplemento().add(cComplemento);

        return comprobante;
    }

    
    private List <CustomTnComprobanteDig> getlistCustomComprobantes( String roothPath,Integer cnPaquete, List<gob.shcp.sireh.model.sat.cfdi.v33.Comprobante> listaComprobantes, List<String> listCadenaOriginal, String usuario){
        List <CustomTnComprobanteDig> listaCustomTnComprobanteDig = new ArrayList<CustomTnComprobanteDig>();
        try{
            int contador = 1;
            
            String ruta = roothPath + "WEB-INF/docs" + File.separator + "esquemas" + File.separator + "n12a33" + File.separator + "cadenaoriginal_3_3.xslt";                
            File xslt = new File(ruta);
            StreamSource sourceXSL = new StreamSource(xslt);
            TransformerFactory tFactory = TransformerFactory.newInstance();
            Transformer transformerElement = tFactory.newTransformer(sourceXSL);


            JAXBContext jaxbContext = JAXBContext.newInstance(gob.shcp.sireh.model.sat.cfdi.v33.Comprobante.class, Nomina.class);
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
            jaxbMarshaller.setProperty("com.sun.xml.bind.namespacePrefixMapper", new CfdiNsMap());
            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            jaxbMarshaller.setProperty(Marshaller.JAXB_SCHEMA_LOCATION, 
                                       "http://www.sat.gob.mx/cfd/3 http://www.sat.gob.mx/sitio_internet/cfd/3/cfdv33.xsd " + 
                                       "http://www.sat.gob.mx/nomina12 http://www.sat.gob.mx/sitio_internet/cfd/nomina/nomina12.xsd");

            StringWriter xmlCmp = new StringWriter();

            System.out.println("Generando xml por lista de pago");
            for (gob.shcp.sireh.model.sat.cfdi.v33.Comprobante comprobante: listaComprobantes) {

                // Transformo para obtener StringWriter a partir del objeto comprobante
                jaxbMarshaller.marshal(comprobante, xmlCmp);

                // obtengo la cadenaOriginal a partir de stringWriter
                String cadenaOriginal =null;
                cadenaOriginal = getCadenaOriginal(cadenaOriginal,xmlCmp,transformerElement );

                listCadenaOriginal.add(cadenaOriginal);

                CustomTnComprobanteDig customTnComprobanteDig = getComprobanteDigital(comprobante, cadenaOriginal,xmlCmp.toString(),  cnPaquete,  usuario);
                listaCustomTnComprobanteDig.add(customTnComprobanteDig);

                xmlCmp.getBuffer().setLength(0);
                xmlCmp.getBuffer().trimToSize();

                contador++;
                comprobante=null;
            }    
            System.out.println("Finaliza generacion xml por lista de pago");
            
        } catch (JAXBException e) {
            throw new ServiceException("Error: " + e.getMessage());
        } catch (TransformerException e) {
            throw new ServiceException("Error: " + e.getMessage());
        }
        return listaCustomTnComprobanteDig;
    }
    
    private String getCadenaOriginal(String cadenaOriginal,StringWriter xml, Transformer transformer) {
            StringWriter outWriter = new StringWriter();
            StreamResult resulCadenaOriginal = new StreamResult(outWriter);
     
            StringReader reader = new StringReader(xml.toString());
            StreamSource sourceXML = new StreamSource(reader);
     
            // crear el procesador XSLT que nos ayudaria generar la cadena original
            // con base en las reglas del archivo XSLT
            try {

                    //aplicar las reglas del XSLT con los datos del CFDI 
                    transformer.transform(sourceXML, resulCadenaOriginal);                    
                    cadenaOriginal =  outWriter.getBuffer().toString();

            } catch (TransformerException e) {
                throw new ServiceException("Error: " + e.getMessage());
            }finally{
                outWriter= null;
                resulCadenaOriginal= null;
                reader =null;
                sourceXML=null;
            }
            return cadenaOriginal;
        }
    
    public String getCertificado() {
        X509Certificate val = null;
        String keyAlias = "";
        File p12File = new File(super.configuration().getString("timbrado.dir") + File.separator + super.configuration().getString("timbrado", "SIREH_TIMBRADO_CSD_FILENAME_P12"));
        Enumeration aliases;
        java.security.KeyStore keyStore = null;
        try {
            FileInputStream fis;
            fis = new FileInputStream(p12File);
            BufferedInputStream bis = new BufferedInputStream(fis);


            keyStore = getKeyStore(bis);

        
            aliases = keyStore.aliases();

            while (aliases.hasMoreElements()) {
                keyAlias = (String)aliases.nextElement();
            }
            val = (X509Certificate)keyStore.getCertificate(keyAlias);
            BASE64Encoder b64 = new BASE64Encoder(); 
            String certificado = new String(b64.encode(val.getEncoded()));
            bis.close();
            certificado = certificado.replace("" + (char)13 + (char)10, "");
            certificado = certificado.replace("\r", "");
            certificado = certificado.replace("\n","");
            return certificado;
        } catch (KeyStoreException e) {
            throw new ServiceException("Error: " + e.getMessage());
        } catch (CertificateEncodingException e) {
            throw new ServiceException("Error: " + e.getMessage());
        } catch (FileNotFoundException e) {
            throw new ServiceException("Error: " + e.getMessage());
        } catch (IOException e) {
            throw new ServiceException("Error: " + e.getMessage());
        }
    } 
    
    public CustomTnComprobanteDig getComprobanteDigital(gob.shcp.sireh.model.sat.cfdi.v33.Comprobante comprobante, String cadenaOriginal, String xmlGenerado, Integer cnPaquete, String usuario) {
        CustomTnComprobanteDig customTnComprobanteDig = new CustomTnComprobanteDig();
        
        customTnComprobanteDig.setCnPaquete(cnPaquete);
        customTnComprobanteDig.setCnFolio( new Long(comprobante.getFolio()));
        customTnComprobanteDig.setCnDifFolio(9);
        customTnComprobanteDig.setCnConsecNomina(new Integer(comprobante.getSerie()));
        customTnComprobanteDig.setCnEjercicio(SirehUtils.getCurrentYear());
        customTnComprobanteDig.setCnRfc(comprobante.getReceptor().getRfc());
//        customTnComprobanteDig.setCnSituacion("E");
        customTnComprobanteDig.setCnFechaGenerado(new Date());
        customTnComprobanteDig.setUsuario(usuario);
        customTnComprobanteDig.setFecModifico(new Date());
        customTnComprobanteDig.setCnCadenaOriginal(cadenaOriginal);
        customTnComprobanteDig.setCnXmlGenerado(xmlGenerado);

        return customTnComprobanteDig;
    }

    
    public java.security.KeyStore getKeyStore(BufferedInputStream bis){
        java.security.KeyStore keyStore = null;
        try {
            String pass = super.configuration().getString("timbrado", "SIREH_TIMBRADO_CSD_PASS");
            keyStore = java.security.KeyStore.getInstance("PKCS12");
            keyStore.load(bis, pass.toCharArray());
        } catch (KeyStoreException e) {
            throw new ServiceException("Error: " + e.getMessage());
        } catch (FileNotFoundException e) {
            throw new ServiceException("Error: " + e.getMessage());
        } catch (NoSuchAlgorithmException e) {
            throw new ServiceException("Error: " + e.getMessage());
        } catch (CertificateException e) {
            throw new ServiceException("Error: " + e.getMessage());
        } catch (IOException e) {
            throw new ServiceException("Error: " + e.getMessage());
        }
        return keyStore;
    }
    private String getZipCadenas(Integer idNomina, List<String> listCadenaOriginal, Integer hpQnaPago){
        String folder = idNomina.toString() ;
        String roothPath = super.configuration().getString("local.temp.dir");
        
        String nomArchCadOriginalTxt = hpQnaPago + "_cadenaOriginal_" + idNomina + ".txt";
        String nomArchCadOriginalZip = hpQnaPago + "_cadenaOriginal_" + idNomina + ".zip";
        
        BufferedWriter bw = null;

        logger.debug(" ********* creacion del archivo txt de validacion  ********* ");
        
        FileWriter writer = null;
        try {
            writer = new FileWriter(roothPath + File.separator + folder + File.separator +  nomArchCadOriginalTxt);    

            for (String cadenaOriginal: listCadenaOriginal) {
                writer.write(cadenaOriginal);
                writer.write(System.getProperty("line.separator"));
            }
        } catch (IOException e) {
            throw new ServiceException("Error: " + e.getMessage());
        } finally {
            try {
                writer.close();
            } catch (Exception e) {
                throw new ServiceException("Error: " + e.getMessage());
            }
        }


        logger.debug(" ********** compresion del archivo txt de validacion ********** ");
        
        Map<String, String> map = new HashMap<String, String>();
        map.put(roothPath + File.separator + folder + File.separator + nomArchCadOriginalTxt, nomArchCadOriginalTxt);
        zipFile(map, roothPath + File.separator + folder + File.separator + nomArchCadOriginalZip);
        map = null;
        return nomArchCadOriginalZip;
    }
    
    private String nombre(CustomTnHistoricoPagoXMLDTO emp){
        return emp.getPrimerApellido().trim().replace(".", " ") + " " + 
            emp.getSegundoApellido().trim().replace(".", " ") + " " + 
            emp.getNombreEmpleado().trim().replace(".", " ");  
    }
    
    private String getAntiguedad(DatosXMLAnexo20DTO datos){

        String campoantiguedad = "P";
        
        Calendar fechaingreso = Calendar.getInstance();
        fechaingreso.setTime(datos.getFechaInicioRelLab());
        
        Calendar fechaactual = Calendar.getInstance();
        fechaactual.setTime(new Date());
        
        String valor =  calculaantiguedad(datos.getFechaInicioRelLab(),datos.getFechaPago());
        
        String[] antiguedadarray = valor.split(",");
        
        if(Long.valueOf(antiguedadarray[0])> 0L){
            campoantiguedad = campoantiguedad+antiguedadarray[0]+"Y";
        }
        if(Long.valueOf(antiguedadarray[1])> 0L){
            campoantiguedad = campoantiguedad+antiguedadarray[1]+"M";
        }
        if(Long.valueOf(antiguedadarray[2])> 0L){
            campoantiguedad = campoantiguedad+antiguedadarray[2]+"D";
        }
        return campoantiguedad;
    }
    
    public static String calculaantiguedad(Date from, Date to) {
        Calendar fromDate = Calendar.getInstance();
        Calendar toDate = Calendar.getInstance();
        fromDate.setTime(from);
        toDate.setTime(to);
        int year, month, day;
        
        if (toDate.get(Calendar.DAY_OF_MONTH) > fromDate.get(Calendar.DAY_OF_MONTH)) {
            day = toDate.get(Calendar.DAY_OF_MONTH) - fromDate.get(Calendar.DAY_OF_MONTH);
        } 
        else {
            toDate.add(Calendar.MONTH, -01);
            day = fromDate.getActualMaximum(Calendar.DAY_OF_MONTH) + toDate.get(Calendar.DAY_OF_MONTH) - fromDate.get(Calendar.DAY_OF_MONTH);
        }
        
        if (toDate.get(Calendar.MONTH) > fromDate.get(Calendar.MONTH)) {
            month = toDate.get(Calendar.MONTH) - fromDate.get(Calendar.MONTH);
        } 
        else {
            toDate.add(Calendar.YEAR, -01);
            month = 12 + toDate.get(Calendar.MONTH) - fromDate.get(Calendar.MONTH);
        }
        year = toDate.get(Calendar.YEAR) - fromDate.get(Calendar.YEAR);
        return String.valueOf(year) + "," + String.valueOf(month) + "," + String.valueOf(day);
    }
    
    public static XMLGregorianCalendar getXMLGregorianCalendarNow() {
        DateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
        XMLGregorianCalendar now = null;
        Date date = new Date();
        date.setTime(date.getTime());
        try {
            DatatypeFactory datatypeFactory = DatatypeFactory.newInstance();
            now = datatypeFactory.newXMLGregorianCalendar(sdf.format(date));
        } catch (DatatypeConfigurationException e) {
            throw new ServiceException("Error: " + e.getMessage());
        }  return now;
    }
    
    public static XMLGregorianCalendar getXMLGregorianCalendarFecha(Date fecha) {
        DateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        XMLGregorianCalendar now = null;
        Date date = fecha;
        try {
            DatatypeFactory datatypeFactory = DatatypeFactory.newInstance();
            now = datatypeFactory.newXMLGregorianCalendar(sdf.format(date));
        } catch (DatatypeConfigurationException e) {
            throw new ServiceException("Error: " + e.getMessage());
        } return now;
    }

    public String normalizeDesc(String descripcion){
        String aux = descripcion.toUpperCase();
        aux=aux.replace('Á', 'A');
        aux=aux.replace('É', 'E');
        aux=aux.replace('Í', 'I');
        aux=aux.replace('Ó', 'O');
        aux=aux.replace('Ú', 'U');
        aux=aux.replace('Ñ', 'N');
        aux=aux.replace('Ü', 'U');
        aux=aux.replace('À', 'A');
        aux=aux.replace('È', 'E');
        aux=aux.replace('Ì', 'I');
        aux=aux.replace('Ò', 'O');
        aux=aux.replace('Ù', 'U');
        aux=aux.replace('.', ' ');
        aux=aux.replace(',', ' ');
        aux=aux.replace('(', ' ');
        aux=aux.replace(')', ' ');
        
        return aux.trim().replaceAll(" +", " ");
    }
    public void zipFile(Map<String,String> filesMap, String zipFile) {
        try {
            BufferedInputStream origen = null;
            FileOutputStream dest = new FileOutputStream(zipFile);
            ZipOutputStream out = new ZipOutputStream(new BufferedOutputStream(dest));
            byte data[] = new byte[2048];
            // get a list of files from current directory
            
             for(Map.Entry<String, String> entry : filesMap.entrySet()){
                FileInputStream fi = new FileInputStream(entry.getKey());
                origen = new BufferedInputStream(fi, 2048);
                ZipEntry zipEntry = new ZipEntry(entry.getValue());
                out.putNextEntry(zipEntry);
                int count;
                while ((count = origen.read(data, 0, 2048)) != -1) {
                    out.write(data, 0, count);
                }
                origen.close();
            }
            out.close();
            dest.close();
        } catch (FileNotFoundException e) {
            throw new ServiceException("Error: " + e.getMessage());
        } catch (IOException e) {
            throw new ServiceException("Error: " + e.getMessage());
        } finally {

        }
    }


    public void processSatSelloTnComprobanteDig(int idNomina, List<ComponenteXmlDTO> listaComponenteXmlDTO, boolean valido) {
        NominaDTO nominaDTO = super.getService(GestionNominaService.class).getNominaById(idNomina);
        if (valido) {
            nominaDTO.setNomRefTimbrado("F");
            List<TnComprobanteDig> listaTnComprobanteDig = super.transformation().map(listaComponenteXmlDTO, TnComprobanteDig.class);
            super.persistence().get(CustoTnComprobanteDigDAO.class).updateSelloTnComprobanteDig(idNomina, listaTnComprobanteDig);
        } else {
            nominaDTO.setNomRefTimbrado("E");
        }
        super.getService(GestionNominaService.class).updateNominaCompleta(nominaDTO);
    }

    public void processSatIntegrarXmlFirma(String roothPath, int idNomina, String usuario){
        NominaDTO nominaDTO = super.getService(GestionNominaService.class).getNominaById(Integer.valueOf(idNomina));

        // Consultar los comprobantes
         List<TnComprobanteDig> lista = super.persistence().get(CustoTnComprobanteDigDAO.class).getXmlSelloByIdNomina(Integer.valueOf(idNomina));
        List<ComponenteXmlDTO> listaComponenteXmlDTO = new ArrayList<ComponenteXmlDTO>();
        List<CustomTnComprobanteDig> listaCustomTnComprobanteDig = new ArrayList<CustomTnComprobanteDig>();
        for(TnComprobanteDig tnComprobanteDig : lista ){
            ComponenteXmlDTO componenteXmlDTO = new ComponenteXmlDTO();
            componenteXmlDTO.setCnCadenaSello( tnComprobanteDig.getCnCadenaSello() );
            componenteXmlDTO.setXml(clobToString(tnComprobanteDig.getCnXmlGenerado()));
            componenteXmlDTO.setCnFolio(tnComprobanteDig.getCnFolio() );
            listaComponenteXmlDTO.add(componenteXmlDTO);
        }
      
            // Se integra la firma a cada uno de los componentes
         integrarFirma( listaComponenteXmlDTO);
        CustomTnComprobanteDig customTnComprobanteDig = null;
        for(ComponenteXmlDTO componenteXmlDTO : listaComponenteXmlDTO) {
            customTnComprobanteDig = new CustomTnComprobanteDig();
            customTnComprobanteDig.setCnFolio(componenteXmlDTO.getCnFolio() );
            customTnComprobanteDig.setCnDifFolio(9);
            customTnComprobanteDig.setCnSituacion("V");
            customTnComprobanteDig.setCnXmlGenerado(componenteXmlDTO.getXml() );
            customTnComprobanteDig.setFecModifico(new Date());
            customTnComprobanteDig.setUsuario(usuario);
            listaCustomTnComprobanteDig.add(customTnComprobanteDig);
        }

        
         String zipPackXmlAnexo20 = generarPaqueteEnvioSat( listaComponenteXmlDTO,  idNomina,  nominaDTO.getNomQnaCaptura());
        listaComponenteXmlDTO = null;
        File fileXmlAnexo20Zip = new File(zipPackXmlAnexo20);
        byte[] bytePaqXmlAnexo20Zip = null;
        try {
            bytePaqXmlAnexo20Zip = org.apache.commons.io.FileUtils.readFileToByteArray(fileXmlAnexo20Zip);
        } catch (IOException e) {
             throw new ServiceException("Error: " + e.getMessage());
        }
        nominaDTO.setNomArchAnexo20(bytePaqXmlAnexo20Zip);
        nominaDTO.setNomRefTimbrado("V");
        super.getService(GestionNominaService.class).updateNominaCompleta(nominaDTO);
        super.persistence().get(CustoTnComprobanteDigDAO.class).updateXmlGeneradoTnComprobanteDig(listaCustomTnComprobanteDig);
    }
    
    public void updateIntegrarXmlFirmaFolio(int idNomina, int cnFolio, int cnDifFolio, int cnPaquete, String usuario){
        NominaDTO nominaDTO = super.getService(GestionNominaService.class).getNominaById(Integer.valueOf(idNomina));
        TnComprobanteDigDTO tnComprobanteDigDTO = getTnComprobanteDigById( cnFolio,  cnDifFolio,  cnPaquete);
        CustomTnComprobanteDig customTnComprobanteDig = new CustomTnComprobanteDig();
        SirehUtils.copyProperties(customTnComprobanteDig, tnComprobanteDigDTO);
        // Consultar los comprobantes
         //List<TnComprobanteDig> lista = super.persistence().get(CustoTnComprobanteDigDAO.class).getXmlSelloByIdNomina(Integer.valueOf(idNomina));
          
        
        List<ComponenteXmlDTO> listaComponenteXmlDTO = new ArrayList<ComponenteXmlDTO>();
        //List<CustomTnComprobanteDig> listaCustomTnComprobanteDig = new ArrayList<CustomTnComprobanteDig>();
        {
            ComponenteXmlDTO componenteXmlDTO = new ComponenteXmlDTO();
            componenteXmlDTO.setCnCadenaSello( tnComprobanteDigDTO.getCnCadenaSello() );
            componenteXmlDTO.setXml(clobToString(tnComprobanteDigDTO.getCnXmlGenerado()));
            componenteXmlDTO.setCnFolio(tnComprobanteDigDTO.getCnFolio() );
           listaComponenteXmlDTO.add(componenteXmlDTO);
        }
      
            // Se integra la firma a cada uno de los componentes
         integrarFirma( listaComponenteXmlDTO);
        
        for(ComponenteXmlDTO componenteXmlDTO : listaComponenteXmlDTO) {

            //customTnComprobanteDig.setCnFolio(componenteXmlDTO.getCnFolio() );
            //customTnComprobanteDig.setCnDifFolio(9);
            customTnComprobanteDig.setCnRefTimbrado("V");
            customTnComprobanteDig.setCnXmlGenerado( componenteXmlDTO.getXml() );
            //customTnComprobanteDig.setFecModifico(new Date());
            //customTnComprobanteDig.setUsuario(usuario);
        }

        
         String zipPackXmlAnexo20 = generarPaqueteEnvioSat( listaComponenteXmlDTO,  idNomina,  nominaDTO.getNomQnaCaptura());
        listaComponenteXmlDTO = null;
        File fileXmlAnexo20Zip = new File(zipPackXmlAnexo20);
        byte[] bytePaqXmlAnexo20Zip = null;
        try {
            bytePaqXmlAnexo20Zip = org.apache.commons.io.FileUtils.readFileToByteArray(fileXmlAnexo20Zip);
        } catch (IOException e) {
             throw new ServiceException("Error: " + e.getMessage());
        }
        
        //nominaDTO.setNomArchAnexo20(bytePaqXmlAnexo20Zip);
        //nominaDTO.setNomRefTimbrado("V");
         customTnComprobanteDig.setCnArchAnexo20(bytePaqXmlAnexo20Zip);
        //super.getService(GestionNominaService.class).updateNominaCompleta(nominaDTO);
        //super.persistence().get(CustoTnComprobanteDigDAO.class).updateXmlGeneradoTnComprobanteDig(listaCustomTnComprobanteDig);
        updateCustomTnComprobanteDig(customTnComprobanteDig);
    }

    private void integrarFirma(List<ComponenteXmlDTO> listaComponenteXmlDTO) {
        String certificado = getCertificado();
        try {
            for (ComponenteXmlDTO componenteXmlDTO: listaComponenteXmlDTO) {
                DocumentBuilderFactory dbFactory = 
                    DocumentBuilderFactory.newInstance();
                DocumentBuilder dBuilder;

                // transformar de cadena a comprobante

                dBuilder = dbFactory.newDocumentBuilder();

                Document comprobante = null;

                comprobante = dBuilder.parse(new InputSource(new StringReader(componenteXmlDTO.getXml())));
                comprobante.normalize();
                comprobante.getDocumentElement().normalize();
                NodeList rootNodes = comprobante.getElementsByTagName("cfdi:Comprobante");
                Node rootNode = rootNodes.item(0);

                Element rootElement = (Element)rootNode;
                rootElement.setAttribute("Sello", componenteXmlDTO.getCnCadenaSello());
                rootElement.setAttribute("Certificado", certificado);
                DOMSource domSource = new DOMSource(comprobante);
                StringWriter xmlCmp = new StringWriter();
                StreamResult result = new StreamResult(xmlCmp);
                TransformerFactory transformerFactory = TransformerFactory.newInstance();
                Transformer transformer;
                transformer = transformerFactory.newTransformer();
                transformer.setOutputProperty(OutputKeys.OMIT_XML_DECLARATION, "yes");
                transformer.setOutputProperty(OutputKeys.INDENT, "yes");
                transformer.setOutputProperty(OutputKeys.ENCODING, "UTF-8");
                transformer.setOutputProperty(OutputKeys.STANDALONE, "no");
                transformer.transform(domSource, result);
                componenteXmlDTO.setXml(xmlCmp.toString());
                xmlCmp.getBuffer().setLength(0);
                xmlCmp.getBuffer().trimToSize();
            }

        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        } catch (SAXException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (TransformerConfigurationException e) {
            e.printStackTrace();
        } catch (TransformerException e) {
            e.printStackTrace();
        }
    }
    
    private String generarPaqueteEnvioSat(List<ComponenteXmlDTO> listComponent, int idNomina, Integer hpQnaPago){
        String nomFolder       = Integer.valueOf(idNomina).toString() ;
        String rootPath     = super.configuration().getString("local.temp.dir") + File.separator + nomFolder;
        String nameFileZip = rootPath + File.separator + hpQnaPago + "_paqueteXmlAnexo20_" + idNomina + ".zip";
        File folder = new File(rootPath);
        if (!folder.exists()) {
            folder.mkdir();
        }
        
            try {
            int contador = 1;
            
            
            String fileXmlFinal = rootPath + File.separator + hpQnaPago + "_paqueteXmlAnexo20_" + idNomina + ".xml";
            String nameFileXml = hpQnaPago + "_paqueteXmlAnexo20_" + idNomina + ".xml";
            
            DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
            Document doc= docBuilder.newDocument();
            Element rootElement = doc.createElement("PaqueteNomina");
            rootElement.setAttribute("xmlns", "http://www.sat.gob.mx/Nomina/Paquete");
            rootElement.setAttribute("id", super.configuration().getString("timbrado", "SIREH_TIMBRADO_RFC_SHCP") + "_" + hpQnaPago.toString().substring(0,4) + "_NOMID_" + idNomina);
            rootElement.setAttribute("totalregs", String.valueOf(listComponent.size() ));
            doc.appendChild(rootElement);
        for(ComponenteXmlDTO xmlSCdata: listComponent){
             Element paquete = doc.createElement("ControlComprobante");
             paquete.setAttribute("Num", String.valueOf(contador));
             paquete.setAttribute("id", idNomina + "_" +  xmlSCdata.getCnFolio()  );
             rootElement.appendChild(paquete);
            
             Element xml = doc.createElement("xmlComp");
             CDATASection cdata =  doc.createCDATASection(xmlSCdata.getXml().replace("\r", ""));

                xml.appendChild(cdata);
                paquete.appendChild(xml);
                xmlSCdata = null;
                contador++;
        }

                System.out.println("Finaliza Empaquetado en xml");

                TransformerFactory transformerFactory = TransformerFactory.newInstance();

                Transformer transformer;

                transformer = transformerFactory.newTransformer();

                DOMSource source = new DOMSource(doc);
                transformer.setOutputProperty(OutputKeys.OMIT_XML_DECLARATION, "no");
                StreamResult result = new StreamResult(new File(fileXmlFinal));
                transformer.setOutputProperty(OutputKeys.INDENT, "yes");
                transformer.setOutputProperty(OutputKeys.ENCODING, "UTF-8");
                transformer.setOutputProperty(OutputKeys.STANDALONE, "no");
                transformer.transform(source, result);
                
                Map<String, String> map = new HashMap<String, String>();
                map.put(fileXmlFinal, nameFileXml);

                zipFile(map, nameFileZip);

        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        } catch (TransformerConfigurationException e) {
            e.printStackTrace();
        } catch (TransformerException e) {
            e.printStackTrace();
        }
        return nameFileZip;
    }

    public void processSatRespuestaSatRecepcion(Integer idNomina, Respuesta respuestaSat){
        NominaDTO nominaDTO = super.getService(GestionNominaService.class).getNominaById(idNomina);
        if (respuestaSat.getCodRespuesta() != null && respuestaSat.getCodRespuesta().compareTo(200) == 0) {
            nominaDTO.setNomIdPaqueteSat(respuestaSat.getIdPaquete());
            nominaDTO.setNomRefTimbrado("R");
            nominaDTO.setNomUriblobTimb(respuestaSat.getUriSalida());
        } else {
            nominaDTO.setNomRefTimbrado("Q");
        }
        List<TnComprobanteDig> lista = super.persistence().get(CustoTnComprobanteDigDAO.class).getFoliosByIdNomina(idNomina);
        //super.persistence().get(CustoTnComprobanteDigDAO.class).updateSituacionTnComprobanteDig(lista,"V" );
        super.getService(GestionNominaService.class).updateNominaCompleta(nominaDTO);
    }
    
    
    public void processSatRespuestaSatRecepcionByFolio(Integer idNomina, Respuesta respuestaSat){
        TnComprobanteDig tnComprobanteDig = super.persistence().get(CustoTnComprobanteDigDAO.class).getTnComprobanteDigById(respuestaSat.getCnFolio(), 9, respuestaSat.getCnPaquete() );
        if (respuestaSat.getCodRespuesta() != null && respuestaSat.getCodRespuesta().compareTo(200) == 0) {
            tnComprobanteDig.setCnIdPaqueteSat(respuestaSat.getIdPaquete());
            tnComprobanteDig.setCnRefTimbrado("R");
        } else {
            tnComprobanteDig.setCnRefTimbrado("Q");
        }
        super.persistence().get(TnComprobanteDigDAO.class).save(tnComprobanteDig);
    }
    public void processSatRespuestaSatConsulta(Integer idNomina, Respuesta respuestaSat){
        NominaDTO nominaDTO = super.getService(GestionNominaService.class).getNominaById(idNomina);
        
        if(respuestaSat.getCodRespuesta() != null && respuestaSat.getCodRespuesta().intValue() == 3  ){
            nominaDTO.setNomUriblobTimb(respuestaSat.getRespuesta()  );    
            List<TnComprobanteDig> lista = super.persistence().get(CustoTnComprobanteDigDAO.class).getFoliosByIdNomina(idNomina);
            //super.persistence().get(CustoTnComprobanteDigDAO.class).updateSituacionTnComprobanteDig(lista,"R", "P");
            nominaDTO.setNomRefTimbrado("P");
            super.getService(GestionNominaService.class).updateNominaCompleta(nominaDTO);
        }
    }
    
    public void processSatRespuestaSatConsultaByFolio(Integer idNomina, Respuesta respuestaSat){
        TnComprobanteDig tnComprobanteDig = super.persistence().get(CustoTnComprobanteDigDAO.class).getTnComprobanteDigById(respuestaSat.getCnFolio(), 9, respuestaSat.getCnPaquete() );
        
        if(respuestaSat.getCodRespuesta() != null && respuestaSat.getCodRespuesta().intValue() == 3  ){
            tnComprobanteDig.setCnUriblobTimb(respuestaSat.getRespuesta()  );    
            tnComprobanteDig.setCnRefTimbrado("P");
            super.persistence().get(TnComprobanteDigDAO.class).save(tnComprobanteDig);
        }
    }
    
    public void enviarCorreosMasivo(Integer idNomina, String rootPathAplication) {
        List<TnComprobanteDigCorreo> lista = super.persistence().get(CustoTnComprobanteDigDAO.class).getComprobantesByIdNomina(idNomina);
        List<TnComprobanteDigCorreoDTO> listaTnComprobanteDigCorreoDTO = super.transformation().map(lista, TnComprobanteDigCorreoDTO.class);
        List<TnComprobanteDig> listaEnviados = new ArrayList<TnComprobanteDig>();
        System.out.println("Tamaño listaTnComprobanteDigCorreoDTO:  " + listaTnComprobanteDigCorreoDTO.size() );
        if (listaTnComprobanteDigCorreoDTO != null && !listaTnComprobanteDigCorreoDTO.isEmpty()) {
            try {
                String localTempDirSireh = super.configuration().getString("local.temp.dir");
                String nomFolder = idNomina.toString();
                File folder = new File(localTempDirSireh + File.separator + nomFolder);

                if (!folder.exists()) {
                    folder.mkdir();
                }
                
                String mensajeParte1 = "Estimado "; 
                String mensajeParte2 = "\n\r" + "En cumplimiento a lo dispuesto en la fracción V del artículo 29 del Código Fiscal de la Federación, se le hace entrega del archivo XML y representación impresa del Comprobante Fiscal Digital por Internet (CFDI) correspondiente a los conceptos que en el mismo se detallan.";
                for (TnComprobanteDigCorreoDTO tnComprobanteDigCorreoDTO: listaTnComprobanteDigCorreoDTO) {
                    if ((tnComprobanteDigCorreoDTO.getCnEnviadoInst() == null || tnComprobanteDigCorreoDTO.getCnEnviadoPers() == null || 
                        tnComprobanteDigCorreoDTO.getCnEnviadoInst().compareTo(1) != 0 || tnComprobanteDigCorreoDTO.getCnEnviadoPers().compareTo(1) != 0 )&&
                        (tnComprobanteDigCorreoDTO.getEMailOficial() != null || tnComprobanteDigCorreoDTO.getEMailPersonal() != null)) {
                        /** FALTA NOTIFICAR ALGUNO DE LOS DOS CORREOS, SE GENERA COMPROBANTE **/
                        
                         CfdiDTO cfdiDTO = getCfdiDTOFromComprobante((TnComprobanteDigDTO)tnComprobanteDigCorreoDTO);
                         ProductReport productReport = new ProductReport();
                         String fileXml = tnComprobanteDigCorreoDTO.getCnFolio() + ".xml";
                         

                        String stringXML = clobToString(tnComprobanteDigCorreoDTO.getCnXmlTimbrado());

                         FileUtils.writeStringToFile( new File(localTempDirSireh + File.separator + nomFolder + File.separator + fileXml), stringXML, "utf-8");
                         productReport.writePDF(cfdiDTO, localTempDirSireh + File.separator + nomFolder, rootPathAplication);
                         String filePdf = tnComprobanteDigCorreoDTO.getCnFolio() + ".pdf";
                         System.out.println("fileXml " + fileXml);
                         System.out.println("filePdf " + filePdf);      
                         
                        TnComprobanteDig tnComprobanteDig = new TnComprobanteDig();
                        tnComprobanteDig.setCnFolio(tnComprobanteDigCorreoDTO.getCnFolio());
                        tnComprobanteDig.setCnDifFolio(tnComprobanteDigCorreoDTO.getCnDifFolio());
                        tnComprobanteDig.setCnPaquete(tnComprobanteDigCorreoDTO.getCnPaquete());
                        String mensaje = mensajeParte1 + cfdiDTO.getReceptorNombre() + mensajeParte2;
                        String asunto = "Comprobante CFDI";
                        String emisor = "Secretaria de Hacienda y Credito Publico";
                         
                        if (tnComprobanteDigCorreoDTO.getEMailOficial() != null && (tnComprobanteDigCorreoDTO.getCnEnviadoInst() == null || tnComprobanteDigCorreoDTO.getCnEnviadoInst().compareTo(1) != 0 )) {
                            /** TIENE CORREO OFICIAL Y NO SE LE HA NOTIFICADO, SE LE ENVIA COMPROBANTE GENERADO AL CORREO OFICIAL **/
                             CorreoElectronicoDTO correoElectronicoDTO = new CorreoElectronicoDTO();
                             correoElectronicoDTO.setAdjuntosPath(localTempDirSireh + File.separator + nomFolder);
                             correoElectronicoDTO.setPlantillaCorreo(super.configuration().getString("correo.template.dir") + File.separator + "mailTemplateNotificacionCFDI_ImgHref.html");
                             correoElectronicoDTO.setNombreReceptor(cfdiDTO.getReceptorNombre());
                             correoElectronicoDTO.setNombreEmisor(emisor);
                             correoElectronicoDTO.setCorreoReceptor(tnComprobanteDigCorreoDTO.getEMailOficial());
                             correoElectronicoDTO.setCorreoEmisor(super.configuration().getString("mail.fromAddress"));
                             correoElectronicoDTO.setAsunto(asunto);
                             correoElectronicoDTO.setMensaje(mensaje);
                             correoElectronicoDTO.setFileXML(fileXml); 
                             correoElectronicoDTO.setFilePDF(filePdf);
                            // Llamar al servicio de envío de correo     
                             super.getService(TimbradoSatService .class).enviarCorreoElectronico(correoElectronicoDTO);
                             System.out.println("Envio a " + tnComprobanteDigCorreoDTO.getEMailOficial() + " " + cfdiDTO.getReceptorNombre());
                            tnComprobanteDig.setCnEnviadoInst(1);
                        }
                        
                        if (tnComprobanteDigCorreoDTO.getEMailPersonal() != null && (tnComprobanteDigCorreoDTO.getCnEnviadoPers() == null || tnComprobanteDigCorreoDTO.getCnEnviadoPers().compareTo(1) != 0 )) {
                            /** TIENE CORREO PERSONAL Y NO SE LE HA NOTIFICADO, SE LE ENVIA COMPROBANTE GENERADO AL CORREO PERSONAL **/
                             CorreoElectronicoDTO correoElectronicoDTO = new CorreoElectronicoDTO();
                             correoElectronicoDTO.setAdjuntosPath(localTempDirSireh + File.separator + nomFolder);
                             correoElectronicoDTO.setPlantillaCorreo(super.configuration().getString("correo.template.dir") + File.separator + "mailTemplateNotificacionCFDI_ImgHref.html");
                             correoElectronicoDTO.setNombreReceptor(cfdiDTO.getReceptorNombre());
                             correoElectronicoDTO.setNombreEmisor(emisor);
                             correoElectronicoDTO.setCorreoReceptor(tnComprobanteDigCorreoDTO.getEMailPersonal());
                             correoElectronicoDTO.setCorreoEmisor(super.configuration().getString("mail.fromAddress"));
                             correoElectronicoDTO.setAsunto(asunto);
                             correoElectronicoDTO.setMensaje(mensaje);
                             correoElectronicoDTO.setFileXML(fileXml); 
                             correoElectronicoDTO.setFilePDF(filePdf);
                            // Llamar al servicio de envío de correo     
                             //super.getService(TimbradoSatService.class).enviarCorreoElectronico(correoElectronicoDTO);
                             System.out.println("Envio a " + tnComprobanteDigCorreoDTO.getEMailPersonal() + " " + cfdiDTO.getReceptorNombre());
                            tnComprobanteDig.setCnEnviadoPers(1);
                        }
                        if (tnComprobanteDig.getCnEnviadoInst() == null) {
                            tnComprobanteDig.setCnEnviadoInst(0);
                        }
                        if (tnComprobanteDig.getCnEnviadoPers() == null) {
                            tnComprobanteDig.setCnEnviadoPers(0);
                        }
                        listaEnviados.add(tnComprobanteDig);
                    }
                }
            } catch (IOException e) {
                throw new ServiceException("Error: " + e.getMessage());
            } finally {
                System.out.println(listaEnviados.size() + " enviados");
                super.persistence().get(CustoTnComprobanteDigDAO.class).updateEnviadoTnComprobanteDig(listaEnviados);
            }
        }

    }
    
    public CfdiDTO getCfdiDTOFromComprobante(TnComprobanteDigDTO tnComprobanteDigDTO){
            CfdiDTO cfdiDTO = findDatos(tnComprobanteDigDTO.getCnFolio().toString() , tnComprobanteDigDTO.getCnDifFolio().toString() , tnComprobanteDigDTO.getCnRfc() );
    
    try {
            List<PercepcionesDeduccionesDTO> listPercepciones = null;
            List<PercepcionesDeduccionesDTO> listDeducciones = null;
        if(tnComprobanteDigDTO != null && tnComprobanteDigDTO.getCnXmlTimbrado() != null){
            String cnXmlTimbrado = clobToString(tnComprobanteDigDTO.getCnXmlTimbrado());
            
            logger.debug("cnXmlTimbrado: " + tnComprobanteDigDTO.getCnXmlTimbrado());
            
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder;
                
                    dBuilder = dbFactory.newDocumentBuilder();
                
                InputStream inputStream;
                
                    inputStream = new ByteArrayInputStream(cnXmlTimbrado.getBytes("UTF-8"));
                
                org.w3c.dom.Document document;
                
                    document = dBuilder.parse(inputStream);
                
                document.getDocumentElement().normalize();
            
            org.w3c.dom.NodeList rootNodes = document.getElementsByTagName("cfdi:Comprobante");
            org.w3c.dom.Node rootNode = rootNodes.item(0);
            org.w3c.dom.Element rootElement = (org.w3c.dom.Element) rootNode;

                    cfdiDTO.setCompFolio(rootElement.getAttribute("Folio"));
                    cfdiDTO.setCompFecha(rootElement.getAttribute("Fecha"));
                    cfdiDTO.setCompSelloDigital(rootElement.getAttribute("Sello"));
                    switch( Integer.valueOf(rootElement.getAttribute("FormaPago") ) ){
                        case 1:   cfdiDTO.setCompFormaPago("EFECTIVO"); break;
                        case 2:   cfdiDTO.setCompFormaPago("CHEQUE NOMINATIVO");   break;
                        case 3:   cfdiDTO.setCompFormaPago("TRANSFERENCIA ELECTRÓNICA DE FONDOS"); break;
                        case 4:   cfdiDTO.setCompFormaPago("TARJETA DE CRÉADITO"); break;
                        case 5:   cfdiDTO.setCompFormaPago("MONEDERO ELECTRÓNICO"); break;
                        case 6:   cfdiDTO.setCompFormaPago("DINERO ELECTRÓNICO"); break;
                        case 8:   cfdiDTO.setCompFormaPago("VALES DE DESPENSA"); break;
                        case 12:  cfdiDTO.setCompFormaPago("DACIÓN EN PAGO"); break;
                        case 13:  cfdiDTO.setCompFormaPago("PAGO POR SUBROGACIÓN"); break;
                        case 14:  cfdiDTO.setCompFormaPago("PAGO POR CONSIGNACIÓN"); break;
                        case 15:  cfdiDTO.setCompFormaPago("CONDONACIÓN"); break;
                        case 17:  cfdiDTO.setCompFormaPago("COMPENSACIÓN"); break;
                        case 23:  cfdiDTO.setCompFormaPago("NOVACION"); break;
                        case 24:  cfdiDTO.setCompFormaPago("CONFUSIÓN"); break;
                        case 25:  cfdiDTO.setCompFormaPago("REMISIÓN DE DEUDA"); break;
                        case 26:  cfdiDTO.setCompFormaPago("PRESCRIPCION O CADUCIDAD"); break;
                        case 27:  cfdiDTO.setCompFormaPago("A SATISFACCIÓN DEL ACREEDOR"); break;
                        case 28:  cfdiDTO.setCompFormaPago("TARJETA DE DEBITO"); break;
                        case 29:  cfdiDTO.setCompFormaPago("TARJETA DE SERVICIOS"); break;
                        case 99:  cfdiDTO.setCompFormaPago("POR DEFINIR"); break;
                    }
                    
                    cfdiDTO.setCompCertificado(rootElement.getAttribute("Certificado"));
                    cfdiDTO.setCompNoCertificado(rootElement.getAttribute("NoCertificado"));
                    cfdiDTO.setCompSubTotal(rootElement.getAttribute("SubTotal"));
                    cfdiDTO.setCompDescuento(rootElement.getAttribute("Descuento"));
                    cfdiDTO.setCompMoneda(rootElement.getAttribute("Moneda").equalsIgnoreCase("MXN") ? "PESOS" : rootElement.getAttribute("Moneda"));
                    cfdiDTO.setCompTotal(rootElement.getAttribute("Total"));
                    
                    
                        cfdiDTO.setCompTipoComprobante("EGRESO");
                    
                    
                    if(rootElement.getAttribute("MetodoPago").trim().equalsIgnoreCase("PUE")){
                        cfdiDTO.setCompMetodoPago("PAGO EN UNA SOLA EXHIBICIÓN");
                    } else if(rootElement.getAttribute("MetodoPago").trim().equalsIgnoreCase("PIP")){
                        cfdiDTO.setCompMetodoPago("PAGO INICIAL Y PARCIALIDADES");
                    } else if(rootElement.getAttribute("MetodoPago").trim().equalsIgnoreCase("PPD")){
                        cfdiDTO.setCompMetodoPago("PAGO EN PARCIALIDADES O DIFERIDO");
                    }
                    
                    cfdiDTO.setCompLugarExpedicion(rootElement.getAttribute("LugarExpedicion"));
                    
                    org.w3c.dom.NodeList nListEmisor = rootElement.getElementsByTagName("cfdi:Emisor");
                    org.w3c.dom.Node nEmisor = nListEmisor.item(0);
                    org.w3c.dom.Element eNodoEmisor = (org.w3c.dom.Element) nEmisor;
                        cfdiDTO.setEmisorRfc(eNodoEmisor.getAttribute("Rfc"));
                        cfdiDTO.setEmisorNombre(eNodoEmisor.getAttribute("Nombre"));
                        cfdiDTO.setEmisorRegimen(eNodoEmisor.getAttribute("RegimenFiscal"));
                        
                    org.w3c.dom.NodeList nListReceptor = rootElement.getElementsByTagName("cfdi:Receptor");
                    org.w3c.dom.Node nReceptor = nListReceptor.item(0);
                    org.w3c.dom.Element eReceptor = (org.w3c.dom.Element) nReceptor;
                        cfdiDTO.setReceptorRfc(eReceptor.getAttribute("Rfc"));
                        cfdiDTO.setReceptorNombre(eReceptor.getAttribute("Nombre"));
                        cfdiDTO.setReceptorUsoCFDI(eReceptor.getAttribute("UsoCFDI"));
                        
                    org.w3c.dom.NodeList nListConceptos = rootElement.getElementsByTagName("cfdi:Conceptos");
                    org.w3c.dom.Node nConceptos = nListConceptos.item(0);
                    org.w3c.dom.Element eConceptos = (org.w3c.dom.Element) nConceptos;
                    org.w3c.dom.NodeList nListConcepto = eConceptos.getElementsByTagName("cfdi:Concepto");
                    org.w3c.dom.Node nConcepto = nListConcepto.item(0);
                    org.w3c.dom.Element eConcepto = (org.w3c.dom.Element) nConcepto;
                        cfdiDTO.setConceptosConceptoClaveProdServ(eConcepto.getAttribute("ClaveProdServ"));
                        cfdiDTO.setConceptosConceptoClaveUnidad(eConcepto.getAttribute("ClaveUnidad"));
                        cfdiDTO.setConceptosConceptoCantidad(eConcepto.getAttribute("Cantidad"));
                        cfdiDTO.setConceptosConceptoUnidad(eConcepto.getAttribute("Unidad"));
                        cfdiDTO.setConceptosConceptoDescripcion(eConcepto.getAttribute("Descripcion"));
                        cfdiDTO.setConceptosConceptoValorUnitario(eConcepto.getAttribute("ValorUnitario"));
                        cfdiDTO.setConceptosConceptoImporte(eConcepto.getAttribute("Importe"));
                    
                    org.w3c.dom.NodeList nListComplemento = rootElement.getElementsByTagName("cfdi:Complemento");
                    org.w3c.dom.Node nComplemento = nListComplemento.item(0);
                    org.w3c.dom.Element eComplemento = (org.w3c.dom.Element) nComplemento;
                    
                    org.w3c.dom.NodeList nListNomina = eComplemento.getElementsByTagName("nomina12:Nomina");
                    org.w3c.dom.Node nNomina = nListNomina.item(0);
                    org.w3c.dom.Element eNomina = (org.w3c.dom.Element) nNomina;
                        cfdiDTO.setCompNomVersion(eNomina.getAttribute("Version"));
                        //cfdiDTO.setCompNomTipoNomina(eNomina.getAttribute("TipoNomina"));
                        cfdiDTO.setCompNomTipoNomina(cfdiDTO.getNominaPdf());
                        cfdiDTO.setCompNomFechaPago(eNomina.getAttribute("FechaPago"));
                        cfdiDTO.setCompNomFechaInicialPago(eNomina.getAttribute("FechaInicialPago"));
                        cfdiDTO.setCompNomFechaFinalPago(eNomina.getAttribute("FechaFinalPago"));
                        cfdiDTO.setCompNomNumDiasPagados(eNomina.getAttribute("NumDiasPagados"));
                        cfdiDTO.setCompNomTotalPercepciones(eNomina.getAttribute("TotalPercepciones"));
                        cfdiDTO.setCompNomTotalDeducciones(eNomina.getAttribute("TotalDeducciones"));
                        cfdiDTO.setCompNomTotalOtrosPagos(eNomina.getAttribute("TotalOtrosPagos"));
                    
                    org.w3c.dom.NodeList nListNominaEmisor = eNomina.getElementsByTagName("nomina12:Emisor");
                    org.w3c.dom.Node nNominaEmisor = nListNominaEmisor.item(0);
                    org.w3c.dom.Element eNominaEmisor = (org.w3c.dom.Element) nNominaEmisor;
                        cfdiDTO.setComplNomEmiRegistroPatronal(eNominaEmisor.getAttribute("RegistroPatronal"));
                        
                    //org.w3c.dom.NodeList nListNominaEmisorEntidadSNCF = eNominaEmisor.getElementsByTagName("nomina12:EntidadSNCF");
                    //org.w3c.dom.Node nNominaEmisorEntidadSNCF = nListNominaEmisorEntidadSNCF.item(0);
                    //org.w3c.dom.Element eNominaEmisorEntidadSNCF = (org.w3c.dom.Element) nNominaEmisorEntidadSNCF;
                        //cfdiDTO.setComplNomEmiEntidadSNCFOrigenRecurso(eNominaEmisorEntidadSNCF.getAttribute("OrigenRecurso"));
                        
                    org.w3c.dom.NodeList nListNominaReceptor = eNomina.getElementsByTagName("nomina12:Receptor");
                    org.w3c.dom.Node nNominaReceptor = nListNominaReceptor.item(0);
                    org.w3c.dom.Element eNominaReceptor = (org.w3c.dom.Element) nNominaReceptor;
                        cfdiDTO.setComplNomRecCurp(eNominaReceptor.getAttribute("Curp"));
                        cfdiDTO.setComplNomRecNumSeguridadSocial(eNominaReceptor.getAttribute("NumSeguridadSocial"));
                        cfdiDTO.setComplNomRecFechaInicioRelLaboral(eNominaReceptor.getAttribute("FechaInicioRelLaboral"));
                        //cfdiDTO.setComplNomRecAntigüedad(eNominaReceptor.getAttribute("Antigüedad"));
                if (eNominaReceptor.getAttribute("TipoContrato") != null) {
                    if (eNominaReceptor.getAttribute("TipoContrato").equals("01")) {
                        cfdiDTO.setComplNomRecTipoContrato(cfdiDTO.getDescNombramiento());
                    } else if (eNominaReceptor.getAttribute("TipoContrato").equals("03")) {
                        cfdiDTO.setComplNomRecTipoContrato("EVENTUAL");
                    } else {
                        cfdiDTO.setComplNomRecTipoContrato(eNominaReceptor.getAttribute("TipoContrato"));
                    }
                }
                        cfdiDTO.setComplNomRecTipoJornada(eNominaReceptor.getAttribute("TipoJornada"));
                        cfdiDTO.setComplNomRecTipoRegimen(eNominaReceptor.getAttribute("TipoRegimen"));
                        cfdiDTO.setComplNomRecNumEmpleado(eNominaReceptor.getAttribute("NumEmpleado"));
                        cfdiDTO.setComplNomRecPuesto(eNominaReceptor.getAttribute("Puesto"));
                        cfdiDTO.setComplNomRecDepartamento(eNominaReceptor.getAttribute("Departamento"));
                        cfdiDTO.setComplNomRecBanco(eNominaReceptor.getAttribute("Banco"));
                        cfdiDTO.setComplNomRecRiesgoPuesto(eNominaReceptor.getAttribute("RiesgoPuesto"));
                        cfdiDTO.setComplNomRecPeriodicidadPago(eNominaReceptor.getAttribute("PeriodicidadPago"));
                        cfdiDTO.setComplNomRecCuentaBancaria(eNominaReceptor.getAttribute("CuentaBancaria"));
                        cfdiDTO.setComplNomRecSalarioDiarioIntegrado(eNominaReceptor.getAttribute("SalarioDiarioIntegrado"));
                        cfdiDTO.setComplNomRecClaveEntFed(eNominaReceptor.getAttribute("ClaveEntFed"));
                    
                    if(eNominaReceptor.getAttribute("CuentaBancaria") != null && eNominaReceptor.getAttribute("CuentaBancaria").length() == 18 ){
                        cfdiDTO.setCompFormaPago("DEPOSITO " + eNominaReceptor.getAttribute("CuentaBancaria"));
                    } else {
                        cfdiDTO.setCompFormaPago("CHEQUE");
                    }
                    
                    org.w3c.dom.NodeList nListNominaPercepciones = eNomina.getElementsByTagName("nomina12:Percepciones");
                    org.w3c.dom.Node nNominaPercepciones = nListNominaPercepciones.item(0);
                    org.w3c.dom.Element eNominaPercepciones = (org.w3c.dom.Element) nNominaPercepciones;
                        cfdiDTO.setComplNomPercsTotalSueldos(eNominaPercepciones.getAttribute("TotalSueldos"));
                        cfdiDTO.setComplNomPercsTotalGravado(eNominaPercepciones.getAttribute("TotalGravado"));
                        cfdiDTO.setComplNomPercsTotalExento(eNominaPercepciones.getAttribute("TotalExento"));
                        
                    org.w3c.dom.NodeList nListNominaPercepcion = eNominaPercepciones.getElementsByTagName("nomina12:Percepcion");
                    listPercepciones = new ArrayList<PercepcionesDeduccionesDTO>();
                    for(int nodo = 0; nodo < nListNominaPercepcion.getLength(); nodo++){
                        org.w3c.dom.Node nNominaPercepcion = nListNominaPercepcion.item(nodo);
                        org.w3c.dom.Element eNominaPercepcion = (org.w3c.dom.Element) nNominaPercepcion;
                            PercepcionesDeduccionesDTO percepciones = new PercepcionesDeduccionesDTO();
                            percepciones.setComplNomPercTipoPercepcion(eNominaPercepcion.getAttribute("TipoPercepcion"));
                            percepciones.setComplNomPercClave(eNominaPercepcion.getAttribute("Clave"));
                            percepciones.setComplNomPercConcepto(eNominaPercepcion.getAttribute("Concepto"));
                            percepciones.setComplNomPercImporteGravado(eNominaPercepcion.getAttribute("ImporteGravado"));
                            percepciones.setComplNomPercImporteExento(eNominaPercepcion.getAttribute("ImporteExento"));
                            listPercepciones.add(percepciones);
                    } cfdiDTO.setPercepciones(listPercepciones);
                    
                    org.w3c.dom.NodeList nListNominaDeducciones = eNomina.getElementsByTagName("nomina12:Deducciones");
                org.w3c.dom.Node nNominaDeducciones = nListNominaDeducciones.item(0);
                if (nNominaDeducciones != null) {
                    org.w3c.dom.Element eNominaDeducciones = (org.w3c.dom.Element)nNominaDeducciones;
                    cfdiDTO.setComplNomDeducsTotalOtrasDeducciones(eNominaDeducciones.getAttribute("TotalOtrasDeducciones"));
                    cfdiDTO.setComplNomDeducsTotalImpuestosRetenidos(eNominaDeducciones.getAttribute("TotalImpuestosRetenidos"));

                    org.w3c.dom.NodeList nListNominaDeduccion = eNominaDeducciones.getElementsByTagName("nomina12:Deduccion");
                    listDeducciones = new ArrayList<PercepcionesDeduccionesDTO>();
                    for (int nodo = 0; nodo < nListNominaDeduccion.getLength(); nodo++) {
                        org.w3c.dom.Node nNominaDeduccion = nListNominaDeduccion.item(nodo);
                        org.w3c.dom.Element eNominaDeduccion = (org.w3c.dom.Element)nNominaDeduccion;
                        PercepcionesDeduccionesDTO deducciones = new PercepcionesDeduccionesDTO();
                        deducciones.setComplNomDeducTipoDeduccion(eNominaDeduccion.getAttribute("TipoDeduccion"));
                        deducciones.setComplNomDeducClave(eNominaDeduccion.getAttribute("Clave"));
                        deducciones.setComplNomDeducConcepto(eNominaDeduccion.getAttribute("Concepto"));
                        deducciones.setComplNomDeducImporte(eNominaDeduccion.getAttribute("Importe"));
                        listDeducciones.add(deducciones);
                    }
                }
                cfdiDTO.setDeducciones(listDeducciones);

                        org.w3c.dom.NodeList nListTimbreFiscalDigital = eComplemento.getElementsByTagName("tfd:TimbreFiscalDigital");
                        org.w3c.dom.Node nTimbreFiscalDigital = nListTimbreFiscalDigital.item(0);
                        org.w3c.dom.Element eTimbreFiscalDigital = (org.w3c.dom.Element) nTimbreFiscalDigital;
                        cfdiDTO.setTimbreFiscalDigitalVersion(eTimbreFiscalDigital.getAttribute("Version"));
                        cfdiDTO.setTimbreFiscalDigitalUuid(eTimbreFiscalDigital.getAttribute("UUID"));
                        cfdiDTO.setTimbreFiscalDigitalFechaTimbrado(eTimbreFiscalDigital.getAttribute("FechaTimbrado"));
                        cfdiDTO.setTimbreFiscalDigitalSelloCFD(eTimbreFiscalDigital.getAttribute("SelloCFD"));
                        cfdiDTO.setTimbreFiscalDigitalNoCertificadoSAT(eTimbreFiscalDigital.getAttribute("NoCertificadoSAT"));
                        cfdiDTO.setTimbreFiscalDigitalSelloSAT(eTimbreFiscalDigital.getAttribute("SelloSAT"));

                StringBuilder cadenaOriginal = new StringBuilder();
                cadenaOriginal.append("||");
                if (eTimbreFiscalDigital.getAttribute("Version") != null && 
                    eTimbreFiscalDigital.getAttribute("Version").length() > 0) {
                    cadenaOriginal.append(eTimbreFiscalDigital.getAttribute("Version")).append("|");
                }
                if (eTimbreFiscalDigital.getAttribute("UUID") != null && eTimbreFiscalDigital.getAttribute("UUID").length() > 0) {
                    cadenaOriginal.append(eTimbreFiscalDigital.getAttribute("UUID")).append("|");
                }
                if (eTimbreFiscalDigital.getAttribute("FechaTimbrado") !=null && 
                    eTimbreFiscalDigital.getAttribute("FechaTimbrado").length() >0) {
                    cadenaOriginal.append(eTimbreFiscalDigital.getAttribute("FechaTimbrado")).append("|");
                }
                if (eTimbreFiscalDigital.getAttribute("RfcProvCertif") != null && 
                    eTimbreFiscalDigital.getAttribute("RfcProvCertif").length() > 0) {
                    cadenaOriginal.append(eTimbreFiscalDigital.getAttribute("RfcProvCertif")).append("|");
                }
                if (eTimbreFiscalDigital.getAttribute("Leyenda") != null && 
                    eTimbreFiscalDigital.getAttribute("Leyenda").length() > 0) {
                    cadenaOriginal.append(eTimbreFiscalDigital.getAttribute("Leyenda")).append("|");
                }
                if (eTimbreFiscalDigital.getAttribute("SelloCFD") != null && 
                    eTimbreFiscalDigital.getAttribute("SelloCFD").length() >0) {
                    cadenaOriginal.append(eTimbreFiscalDigital.getAttribute("SelloCFD")).append("|");
                }
                if (eTimbreFiscalDigital.getAttribute("NoCertificadoSAT") !=null && 
                    eTimbreFiscalDigital.getAttribute("NoCertificadoSAT").length() > 0) {
                    cadenaOriginal.append(eTimbreFiscalDigital.getAttribute("NoCertificadoSAT")).append("|");
                }
                if (cadenaOriginal.lastIndexOf("|") == cadenaOriginal.length() - 1) {
                    cadenaOriginal.deleteCharAt(cadenaOriginal.length() - 1);
                }
                cadenaOriginal.append("||");
                if (cadenaOriginal.length() > 400) {
                    cfdiDTO.setCadenaOriginal(cadenaOriginal.insert(183, System.getProperty("line.separator")).insert(368, System.getProperty("line.separator")).toString());
                } else if (cadenaOriginal.length() > 2) {
                    cfdiDTO.setCadenaOriginal(cadenaOriginal.toString());
                } else {
                    cfdiDTO.setCadenaOriginal(null);
                }

            }

        } catch (ParserConfigurationException e) {
             throw new ServiceException("Error: " + e.getMessage());
        } catch (UnsupportedEncodingException e) {
             throw new ServiceException("Error: " + e.getMessage());
        } catch (SAXException e) {
             throw new ServiceException("Error: " + e.getMessage());
        } catch (IOException e) {
             throw new ServiceException("Error: " + e.getMessage());
        }
        return cfdiDTO;
    }
    
    public CfdiDTO findDatos(String cnFolio, String cnDifFolio, String rfcEmpleado) {
        CfdiDTO cfdiDTO = new CfdiDTO();
        
        List<Cfdi> listCfdi = super.persistence().get(QueryTnHistoricoPagoDAO.class).findDatos(rfcEmpleado, cnFolio, cnDifFolio);
        if(listCfdi.size() > 0) 
             cfdiDTO = super.transformation().map(listCfdi.get(0), CfdiDTO.class); 
        return cfdiDTO;
    }
    
    public void generarPdfDeCfdi(ComprobanteFiscalDTO comprobanteFiscalDTO, HttpServletRequest request, HttpServletResponse response, String patron){
        SimpleDateFormat format = new   SimpleDateFormat("dd/MM/yyyy");
        String[] arrComprobantes = comprobanteFiscalDTO.getIdGrupo();
        List<InputStream> reportesPDF = new ArrayList<InputStream>();
        String unidad = null;
        String qnaPago = null;
        String idNomina = null;
        
        for(int i=0; i < arrComprobantes.length ; i++){
            String[]    reg         = arrComprobantes[i].split("\\-");
            String      rfcEmpleado = reg[0];
            String      cnFolio     = reg[1];
            String      cnDifFolio  = reg[2];
            Integer      cnPaquete   = reg[3] != null ? Integer.valueOf(reg[3]) : 0 ;

            TnComprobanteDigDTO  tnComprobanteDigDTO = findTnComprobanteDigById(cnFolio, cnDifFolio, cnPaquete);
            
            try {
                
                if(tnComprobanteDigDTO != null && tnComprobanteDigDTO.getCnXmlTimbrado() != null){
                    CfdiDTO cfdiDTO = getCfdiDTOFromComprobante(tnComprobanteDigDTO);
                    unidad = cfdiDTO.getUnidad();
                    qnaPago = cfdiDTO.getQnaPago();
                    idNomina = cfdiDTO.getCnConsecNomina();
                    logger.debug("IMPRESION PDF - CADENA ORIGINAL: " + cfdiDTO.getCadenaOriginal());
                        
                    
                    ProductReport   productReport           = new ProductReport();
                    String          localTempDirSireh       = super.configuration().getString("local.temp.dir");
                    HttpSession     session                 = request.getSession();
                    ServletContext  servletContext          = session.getServletContext();
                    String          rootPathAplication      = servletContext.getRealPath("/");
                    
                    String nomFolder = qnaPago + "_" + idNomina;
                    
                    File folder = new File(localTempDirSireh + File.separator + nomFolder);
                    
                    if(!folder.exists()){
                        folder.mkdir();
                    }
                    
                    localTempDirSireh = localTempDirSireh + File.separator + nomFolder;
                    
                    
                    String file = productReport.writePDF(cfdiDTO, localTempDirSireh, rootPathAplication);
                    
                    logger.debug("file --------->" + file);
                    
                    reportesPDF.add( new FileInputStream( new File(file) )  );

                } // fin - if

            } catch (Exception e) {
                throw new ServiceException("Error: " + e.getMessage());
            }


        } // For - arrComprobantes

        if (reportesPDF.size() > 0) {
            try {
                doMergePDF(reportesPDF, response, patron, unidad, qnaPago, idNomina);
            } catch (FileNotFoundException e) {
                throw new ServiceException("Error: " + e.getMessage());
            } catch (IOException io) {
                throw new ServiceException("Error: " + io.getMessage());
            } catch (DocumentException de) {
                throw new ServiceException("Error: " + de.getMessage());
            }
        }

    }
    
    public void doMergePDF(List<InputStream> list, HttpServletResponse response, String patron, String unidad, String qnaPago, String idNomina) throws DocumentException, IOException {
        String fileNamePdf = UUID.randomUUID().toString() + ".pdf";
        String localTempDir = super.configuration().getString("local.temp.dir");
        
        String nomFolder = qnaPago + "_" + idNomina;
        
        File folder = new File(localTempDir + File.separator + nomFolder);

        if (!folder.exists()) {
            folder.mkdir();
        }


        String filePdf = folder + File.separator + fileNamePdf;
        OutputStream outputStream = new FileOutputStream(filePdf);
        byte[] bytesPdf;
        
        //crear un nuevo documento PDF
        com.lowagie.text.Document document = new com.lowagie.text.Document();
        //crear un escritor del PDF
        PdfWriter writer = PdfWriter.getInstance(document, outputStream);
        document.open();
        PdfContentByte cb = writer.getDirectContent();
        //para cada PDF en la lista, leer su contenido por página e ir agregando cada página en el PDF de la variable document
        for (InputStream in : list) {
            PdfReader reader = new PdfReader(in);
            for (int i = 1; i <= reader.getNumberOfPages(); i++) {
                document.newPage();
                //importa la pagina desde el pdf origen
                PdfImportedPage page = writer.getImportedPage(reader, i);
                //Agrega a la pagina al pdf destino
                cb.addTemplate(page, 0, 0);
            }
        }
        //cerrar streams para liberar recursos
        //y cualquier bloqueo de archivo
        outputStream.flush();
        document.close();
        outputStream.close();
        
        // Descarga archivo pdf
        File pdfFile = new File(filePdf);

        if (pdfFile.exists()) {
            FileInputStream fis = new FileInputStream(pdfFile);
            bytesPdf = IOUtils.toByteArray(fis);
            response.setContentType("application/pdf");
            response.setContentLength(bytesPdf.length);
            response.setHeader("Content-Disposition", "attachment; filename=" + patron + "_" + qnaPago + "_"  + unidad + ".pdf");
            OutputStream out = response.getOutputStream();
            out.write(bytesPdf, 0, bytesPdf.length);
        }
    }
    public TnComprobanteDigDTO findTnComprobanteDigById(String cnFolio, String cnDifFolio, Integer cnPaquete){
        TnComprobanteDig tnComprobanteDig = new TnComprobanteDig();
        TnComprobanteDigDTO tnComprobanteDigDTO = new TnComprobanteDigDTO();
        TnComprobanteDigPK tnComprobanteDigPk = new TnComprobanteDigPK(new Integer(cnDifFolio), new Long( cnFolio ), cnPaquete );
        
        tnComprobanteDig = super.persistence().get(TnComprobanteDigDAO.class).getById(tnComprobanteDigPk);
        //CustomTnComprobanteDig customTnComprobanteDig = super.persistence().get(CustoTnComprobanteDigDAO.class).getTnComprobanteDigById(cnFolio, cnDifFolio, cnPaquete);
        
        if(tnComprobanteDig != null){
            tnComprobanteDigDTO = super.transformation().map(tnComprobanteDig, TnComprobanteDigDTO.class);
            //tnComprobanteDigDTO.setCnXmlTimbrado(customTnComprobanteDig.getCnXmlTimbrado());
        } else { return new TnComprobanteDigDTO(); }
        return tnComprobanteDigDTO;
    }

    public TnComprobanteDigDTO getTnComprobanteDigById(int cnFolio, int cnDifFolio, int cnPaquete){
    
        TnComprobanteDig tnComprobanteDig = super.persistence().get(CustoTnComprobanteDigDAO.class).getTnComprobanteDigById(cnFolio, cnDifFolio, cnPaquete);
        TnComprobanteDigDTO tnComprobanteDigDTO = super.transformation().map(tnComprobanteDig, TnComprobanteDigDTO.class);
        return tnComprobanteDigDTO;
    }

    public void updateEstatus(int idNomina) {
        NominaDTO nominaDTOActual = super.getService(GestionNominaService.class).getNominaById(idNomina);
        
        String estatusActual = nominaDTOActual.getNomRefTimbrado();
        if (estatusActual != null) {
            if (estatusActual.equals("D") || estatusActual.equals("E") || estatusActual.equals("H") || estatusActual.equals("F") || estatusActual.equals("X") || estatusActual.equals("V") || estatusActual.equals("S")) {
                nominaDTOActual.setNomRefTimbrado(null);
                nominaDTOActual.setNomArchAnexo20(null);
                nominaDTOActual.setNomFecAnexo20(null);
                nominaDTOActual.setNomArchCreacion(null);
                nominaDTOActual.setNomArchTimbrado(null);
                nominaDTOActual.setNomFecTimbrado(null);
                nominaDTOActual.setNomArchCanc(null);
                nominaDTOActual.setNomFecCancSireh(null);
                nominaDTOActual.setNomIdPaqueteSat(null);
                nominaDTOActual.setNomUriblobTimb(null);
                nominaDTOActual.setNomUriblobCanc(null);
                super.persistence().get(CustoTnComprobanteDigDAO.class).deleteByCnConsecNomina(idNomina, nominaDTOActual.getCnPaquete() );
            } else if (estatusActual.equals("Q")) {
                nominaDTOActual.setNomRefTimbrado(null);
                nominaDTOActual.setNomArchAnexo20(null);
                nominaDTOActual.setNomFecAnexo20(null);
                nominaDTOActual.setNomArchCreacion(null);
                nominaDTOActual.setNomArchTimbrado(null);
                nominaDTOActual.setNomFecTimbrado(null);
                nominaDTOActual.setNomArchCanc(null);
                nominaDTOActual.setNomFecCancSireh(null);
                nominaDTOActual.setNomIdPaqueteSat(null);
                nominaDTOActual.setNomUriblobTimb(null);
                nominaDTOActual.setNomUriblobCanc(null);
                nominaDTOActual.setCnPaquete(nominaDTOActual.getCnPaquete() != null ? nominaDTOActual.getCnPaquete() + 1 : 1);
                List<TnComprobanteDig> lista = super.persistence().get(CustoTnComprobanteDigDAO.class).getFoliosByIdNomina(idNomina);
//                super.persistence().get(CustoTnComprobanteDigDAO.class).updateSituacionTnComprobanteDig(lista,estatusActual, "I" );
            }
        }
        nominaDTOActual.setNomRefTimbrado(null);
        super.getService(GestionNominaService.class).updateNominaCompleta(nominaDTOActual);
    }

    public void updateCustomTnComprobanteDig(CustomTnComprobanteDig customTnComprobanteDig) {
        super.persistence().get(CustoTnComprobanteDigDAO.class).updateTnComprobanteDig(customTnComprobanteDig);
    }
    
    public void updateTnComprobanteDig(TnComprobanteDigDTO tnComprobanteDigDTO) {
            TnComprobanteDig tnComprobanteDig = super.transformation().map(tnComprobanteDigDTO, TnComprobanteDig.class );
            super.persistence().get(TnComprobanteDigDAO.class).save(tnComprobanteDig);
        }

}
