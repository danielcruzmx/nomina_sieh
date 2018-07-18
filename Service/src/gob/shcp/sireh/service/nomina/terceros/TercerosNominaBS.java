package gob.shcp.sireh.service.nomina.terceros;

import com.blackbear.flatworm.ConfigurationReader;
import com.blackbear.flatworm.FileFormat;
import com.blackbear.flatworm.errors.FlatwormConfigurationValueException;
import com.blackbear.flatworm.errors.FlatwormUnsetFieldValueException;



import gob.shcp.fsn.service.ServiceException;
import gob.shcp.sireh.model.nomina.gestion.NominaDTO;


import gob.shcp.sireh.data.jdbc.QueryTdEmpleadoDAO;
import gob.shcp.sireh.data.jdbc.QueryTdPlazaDAO;
import gob.shcp.sireh.data.jdbc.QueryTnComprobanteDigDAO;
import gob.shcp.sireh.data.jdbc.QueryTnHistoricoPagoDAO;
import gob.shcp.sireh.data.jdbc.QueryTnMovtoConceptoPagoDAO;
import gob.shcp.sireh.data.jdbc.TcTerceroDAO;
import gob.shcp.sireh.data.jdbc.TdCaptCptoErrDAO;

import gob.shcp.sireh.data.jdbc.TnDescuentosFonacotDAO;
import gob.shcp.sireh.data.jdbc.TnMovtoConceptoPagoDAO;
import gob.shcp.sireh.data.jdbc.TnNominaDAO;
import gob.shcp.sireh.data.jdbc.nomina.terceros.TnComprobantePdfDAO;
import gob.shcp.sireh.data.jdbc.support.CustoTnComprobanteDigDAO;
import gob.shcp.sireh.data.jdbc.support.CustomTnComprobantePdfDAO;
import gob.shcp.sireh.data.jdbc.support.CustomTnNominaDao;


import gob.shcp.sireh.domain.jdbc.CustomOutputFile;
import gob.shcp.sireh.domain.jdbc.CustomTnComprobanteDig;
import gob.shcp.sireh.domain.jdbc.CustomTnConceptoPagadoXML;
import gob.shcp.sireh.domain.jdbc.CustomTnHistoricoPagoXML;
import gob.shcp.sireh.domain.jdbc.TcTercero;
import gob.shcp.sireh.domain.jdbc.TdCaptCptoErr;
import gob.shcp.sireh.domain.jdbc.TdEmpleado;
import gob.shcp.sireh.domain.jdbc.TdPlaza;

import gob.shcp.sireh.domain.jdbc.TnComprobanteDig;
import gob.shcp.sireh.domain.jdbc.TnDescuentosFonacot;
import gob.shcp.sireh.domain.jdbc.TnMovtoConceptoPago;
import gob.shcp.sireh.domain.jdbc.TnNomina;

import gob.shcp.sireh.domain.jdbc.nomina.terceros.TnComprobantePdf;
import gob.shcp.sireh.domain.jdbc.nomina.terceros.TnComprobantePdfBlob;

import gob.shcp.sireh.model.CustomOutputFileDTO;

import gob.shcp.sireh.model.TcTerceroDTO;
import gob.shcp.sireh.model.TdCaptCptoErrDTO;

import gob.shcp.sireh.model.TnDescuentosFonacotDTO;
import gob.shcp.sireh.model.nomina.QnaCapturaDTO;
import gob.shcp.sireh.model.nomina.TnMovtoConceptoPagoDTO;
import gob.shcp.sireh.model.nomina.terceros.ArchivosTimbrePdfDTO;
import gob.shcp.sireh.model.nomina.terceros.CargaArchivoDTO;
import gob.shcp.sireh.model.nomina.terceros.ComponenteXmlDTO;
import gob.shcp.sireh.model.nomina.terceros.ConstTerceroDTO;
import gob.shcp.sireh.model.nomina.terceros.DatosArchivoDTO;
import gob.shcp.sireh.model.nomina.terceros.FonacotDTO;
import gob.shcp.sireh.model.nomina.terceros.ResultadoDTO;
import gob.shcp.sireh.model.nomina.terceros.TnComprobantePdfDTO;

import gob.shcp.sireh.model.nomina.terceros.timbradosat.ConceptoPagoXMLAnexo20DTO;
import gob.shcp.sireh.model.nomina.terceros.timbradosat.CustomTnConceptoPagadoXMLDTO;
import gob.shcp.sireh.model.nomina.terceros.timbradosat.CustomTnHistoricoPagoXMLDTO;
import gob.shcp.sireh.model.nomina.terceros.timbradosat.DatosXMLAnexo20DTO;
import gob.shcp.sireh.model.nomina.terceros.timbradosat.DependenciaDTO;


import gob.shcp.sireh.model.nomina.terceros.timbradosat.TnComprobanteDigDTO;
import gob.shcp.sireh.model.sat.cfdi.v32.CfdiNsMap;
import gob.shcp.sireh.model.sat.cfdi.v33.CMetodoPago;
import gob.shcp.sireh.model.sat.cfdi.v33.CTipoDeComprobante;
import gob.shcp.sireh.model.sat.nomina.v12.COrigenRecurso;
import gob.shcp.sireh.model.sat.nomina.v12.Nomina;

import gob.shcp.sireh.service.AbstractSirehService;
import gob.shcp.sireh.service.SirehUtils;
import gob.shcp.sireh.service.nomina.gestion.GestionNominaService;

import gob.shcp.sireh.service.parser.ParserFlatFile;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;

import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
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

import java.security.GeneralSecurityException;

import java.security.InvalidKeyException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.Provider;

import java.security.Signature;


import java.security.UnrecoverableKeyException;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;

import java.security.cert.X509Certificate;

import java.sql.Blob;


import java.sql.SQLException;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.UUID;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;





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
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;

import javax.xml.validation.Validator;

import org.apache.commons.io.IOUtils;

import org.w3c.dom.CDATASection;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import org.xml.sax.InputSource;

import org.xml.sax.SAXException;

import sun.misc.BASE64Encoder;



import javax.xml.crypto.dsig.CanonicalizationMethod;
import javax.xml.crypto.dsig.DigestMethod;
import javax.xml.crypto.dsig.Reference;
import javax.xml.crypto.dsig.SignatureMethod;
import javax.xml.crypto.dsig.SignedInfo;
import javax.xml.crypto.dsig.Transform;
import javax.xml.crypto.dsig.XMLSignatureFactory;
import javax.xml.crypto.dsig.dom.DOMSignContext;

import javax.xml.crypto.dsig.keyinfo.KeyInfoFactory;
import javax.xml.crypto.dsig.keyinfo.X509Data;
import javax.xml.crypto.dsig.keyinfo.X509IssuerSerial;
import javax.xml.crypto.dsig.spec.C14NMethodParameterSpec;
import javax.xml.crypto.dsig.spec.TransformParameterSpec;

import org.apache.commons.io.FileUtils;


public class TercerosNominaBS extends AbstractSirehService implements TercerosNominaService {
    public static final String  diagonal=File.separator;
    private static final int BUFFER_SIZE = 4096; 
    private static final String HEADER_ARCHIVO_CANCELACION_1 = "<Cancelacion xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" Fecha=\"";
    private static final String HEADER_ARCHIVO_CANCELACION_2 = "\" RfcEmisor=\"SHC850101U37\" xmlns=\"http://cancelacfd.sat.gob.mx\">";
    private static final String FOOTER_ARCHIVO_CANCELACION = "</Cancelacion>";
                     
            
   
    /**
     * realiza el parseo de los archivos planos de terceros
     * @param cargaArchivoDTO
     * @return  List
     */
    public List<DatosArchivoDTO> parseFile(CargaArchivoDTO cargaArchivoDTO) {
        List<DatosArchivoDTO> datosDTO = new ArrayList<DatosArchivoDTO>();
        //FileFormat ff = null;
        String rutaTemp = super.configuration().getString("local.temp.dir");
        //String extension =  super.configuration().getString("terceros", "EXTENSION_XML");
        //guardar archivo en repositorio
        File file =  new File(rutaTemp + diagonal+cargaArchivoDTO.getFileName());
        file.delete();
        if (!file.exists()) {
            try {
                OutputStream salida = new FileOutputStream(file);
                byte[] buf = new byte[256];
                int len;
                InputStream in = cargaArchivoDTO.getFile().getInputStream();
                while ((len = in.read(buf)) > 0) {
                    salida.write(buf, 0, len);
                }
                salida.close();
            } catch (IOException e) {
                cargaArchivoDTO.setError(e.getMessage());
                file = null;
                file.delete();
                return null;
            }
        }

        List<DatosArchivoDTO> listaDatosDTO = obtenerListaDatosDTO(cargaArchivoDTO,cargaArchivoDTO.getFile().getInputStream());
        
        //si no se hubo parseo en metlif simple aplicamos ML
        if(listaDatosDTO==null && cargaArchivoDTO.getIdTercero().equalsIgnoreCase( super.configuration().getString("terceros", "METLIFE") )){
            //validar tipo de archivo METLIFE_51_57
            cargaArchivoDTO.setDescTercero("METLIFE_51_57");
            listaDatosDTO = obtenerListaDatosDTO(cargaArchivoDTO,cargaArchivoDTO.getFile().getInputStream());
            if(listaDatosDTO==null){
                //validar tipo de archivo METLIFE ML
                cargaArchivoDTO.setDescTercero( super.configuration().getString("terceros", "METLIFE_ML"));
                listaDatosDTO = obtenerListaDatosDTO(cargaArchivoDTO,cargaArchivoDTO.getFile().getInputStream());
            }
        }
 
        String fonacot=   super.configuration().getString("terceros", "FONACOT") ;
        if(cargaArchivoDTO.getDescTercero().equalsIgnoreCase(fonacot)){
            datosDTO = convertFonacotDTOToDatosArchivoDTO(listaDatosDTO);
            return datosDTO;
        }

        return listaDatosDTO;
    }


    private List<DatosArchivoDTO> obtenerListaDatosDTO(CargaArchivoDTO cargaArchivoDTO,InputStream inputStream){
        List<DatosArchivoDTO> listaDatosDTO =  null;
        ParserFlatFile parserFlatFile; 
            String rutaTemplate = super.configuration().getString("terceros.templates.dir");
        String extension =  super.configuration().getString("terceros", "EXTENSION_XML") ;
        try {
           
            String templateFileXml =  rutaTemplate +diagonal+ cargaArchivoDTO.getDescTercero() +extension;
            ConfigurationReader parser = new ConfigurationReader();
            FileFormat ff = parser.loadConfigurationFile(templateFileXml);
            parserFlatFile = new ParserFlatFile();
            parserFlatFile.setFf(ff);
            parserFlatFile.setFormat(cargaArchivoDTO.getDescTercero());
            listaDatosDTO =   parserFlatFile.parseFile(inputStream, DatosArchivoDTO.class);
        } catch (FlatwormConfigurationValueException e) {
            cargaArchivoDTO.setError(e.getMessage());
            return null;
        } catch (FlatwormUnsetFieldValueException e) {
            cargaArchivoDTO.setError(e.getMessage());
             return null;
        }  catch (Exception e) {
            cargaArchivoDTO.setError(e.getMessage());
             return null;
        }
        
        if(listaDatosDTO == null){   cargaArchivoDTO.setError("  Error en el parseo del archivo: listaDatosDTO = null;  TercerosNominaBS.obtenerListaDatosDTO():125");    }
        
        return  listaDatosDTO;
    }

    /**
     * carga el catoalogo de terceros
     * @return  List
     */
    public List<TcTerceroDTO> getAll() {
        List<TcTercero> tcTercero = super.persistence().get(TcTerceroDAO.class).findAll();
        List<TcTerceroDTO> listaTerceros = super.transformation().map(tcTercero, TcTerceroDTO.class);
        return listaTerceros;
    }
    
    
    
    private  List<DatosArchivoDTO> parserArchivo(CargaArchivoDTO cargaArchivoDTO){
                      
            InputStream file = null;
            String rutaTemp =  super.configuration().getString("local.temp.dir") ;
            try {
                file = new FileInputStream(rutaTemp + diagonal+cargaArchivoDTO.getFileName());
            } catch (FileNotFoundException e) {
                 file = null;
                 return null;
            }
            
             List<DatosArchivoDTO>   datosDTO = obtenerListaDatosDTO(cargaArchivoDTO,file);
            
            if(datosDTO==null && cargaArchivoDTO.getIdTercero().equalsIgnoreCase( super.configuration().getString("terceros", "METLIFE") )){
                //validar tipo de archivo METLIFE_51_57
                cargaArchivoDTO.setDescTercero("METLIFE_51_57");
            try {
                file = new FileInputStream(rutaTemp + diagonal+cargaArchivoDTO.getFileName());
            } catch (FileNotFoundException e) {
                 file = null;
                 return null;
            }
                datosDTO = obtenerListaDatosDTO(cargaArchivoDTO,file);
                if(datosDTO==null){
                    //validar tipo de archivo METLIFE ML
                    cargaArchivoDTO.setDescTercero( super.configuration().getString("terceros", "METLIFE_ML"));
                    try {
                        file = new FileInputStream(rutaTemp +diagonal+cargaArchivoDTO.getFileName());
                    } catch (FileNotFoundException e) {
                         file = null;
                         return null;
                    }
                    datosDTO = obtenerListaDatosDTO(cargaArchivoDTO,file);
                }
        }
        
        String fonacot=   super.configuration().getString("terceros", "FONACOT");
        if(cargaArchivoDTO.getDescTercero().equalsIgnoreCase(fonacot)){
        //http://www.mkyong.com/spring/spring-jdbctemplate-batchupdate-example/
            TnDescuentosFonacotDTO tnDescuentosFonacotDTO = new TnDescuentosFonacotDTO();
            Integer ciclo  = Integer.parseInt(super.getQuincenaCaptura().getAnio());
            Integer mes = (Integer.parseInt(super.getQuincenaCaptura().getQuincena()) + 1) / 2;
            //List<FonacotDTO> datosFonacot = (List<FonacotDTO>)datosDTO;
            for(DatosArchivoDTO fonacotDTO:datosDTO){
                FonacotDTO dto  = (FonacotDTO)fonacotDTO;
                tnDescuentosFonacotDTO.setFonacotCiclo(ciclo);
                tnDescuentosFonacotDTO.setFonacotMes(mes);
                tnDescuentosFonacotDTO.setFonacotNumero(Long.parseLong(dto.getIdFonacot(), 10));
                tnDescuentosFonacotDTO.setFonacotRfc(dto.getRfc());
                tnDescuentosFonacotDTO.setFonacotNombre(dto.getNombre());
                tnDescuentosFonacotDTO.setFonacotCredito(Long.parseLong(dto.getNoCredito(), 10));
                tnDescuentosFonacotDTO.setFonacotRetReal(dto.getRetencionReal());
                tnDescuentosFonacotDTO.setFonacotRetMensual(dto.getRetencionMes());
                tnDescuentosFonacotDTO.setFonacotRetQnaNon(null);
                tnDescuentosFonacotDTO.setFonacotRetQnaPar(null);
                tnDescuentosFonacotDTO.setFonacotPagoQnaNon(null);
                tnDescuentosFonacotDTO.setFonacotPagoQnaPar(null);
                tnDescuentosFonacotDTO.setFonacotClave(dto.getClaveEmpleado());
                tnDescuentosFonacotDTO.setFonacotPlazo(Integer.parseInt(dto.getPlazo(), 10));
                tnDescuentosFonacotDTO.setFonacotMeses(Integer.parseInt(dto.getCuotasPagadas(), 10));
                tnDescuentosFonacotDTO.setFonacotIncidencia(Integer.parseInt(dto.getIncidencia(), 10));
                tnDescuentosFonacotDTO.setFonacotIniBaja(dto.getFechaIniBaja());
                tnDescuentosFonacotDTO.setFonacotFin(dto.getFechaFin());
                tnDescuentosFonacotDTO.setFonacotReubicado(dto.getReubicado());
                
                TnDescuentosFonacot tnDescuentosFonacot = super.transformation().map(tnDescuentosFonacotDTO, TnDescuentosFonacot.class);
                super.persistence().get(TnDescuentosFonacotDAO.class).save(tnDescuentosFonacot);
            }
            
            datosDTO = convertFonacotDTOToDatosArchivoDTO(datosDTO);
            file = null;
            return datosDTO;
        }
        file = null;
        return datosDTO;
    }
    
    public static String truncateToNDecimalsPlaces(String stringIn, String trunk){
        String parteEntera  = "";
        String parteDecimal = "";
        StringBuffer buffer = new StringBuffer();
                        
        if(stringIn.length() > 0){
            int i, j;
            for(i = 0; i < stringIn.length(); i++){
            if(stringIn.charAt(i) != '.'){ buffer.append(stringIn.charAt(i)); } else break; }
            parteEntera = buffer.toString();
            buffer = new StringBuffer();
            for(j = i+1; j < stringIn.length(); j++){ buffer.append(stringIn.charAt(j)); }
            parteDecimal = buffer.toString();
            if(parteEntera.length() == 0){ parteEntera = "0"; }
            if(parteDecimal.length() > 0){
                if(parteDecimal.length() > Integer.parseInt(trunk)){ parteDecimal = parteDecimal.substring(0, Integer.parseInt(trunk)); }
                if(parteDecimal.length() < Integer.parseInt(trunk)){ for(int t = parteDecimal.length(); t < Integer.parseInt(trunk); t++){ parteDecimal = parteDecimal + "0"; } }
            }else{ for(int r=0; r< Integer.parseInt(trunk); r++){ parteDecimal = parteDecimal + "0"; } }
        }
        return parteEntera + "." + parteDecimal;
    }
    
    
    /**
     * @Autor Martin C.
     * Carga los registros del archivo de texto plano del control de asistencia.
     * @param cargaArchivoDTO cargaArchivoDTO
     * @return ResultadoDTO
     */
    public ResultadoDTO insertMovtoCptoPagoCtrAsistencia(CargaArchivoDTO cargaArchivoDTO){
        ResultadoDTO resultadoDTO = new ResultadoDTO();
        List<DatosArchivoDTO> datosDTO = null;
        boolean result = false;
        int countError = 0;
        int countReg = 0;
        
        datosDTO = parserArchivo(cargaArchivoDTO);          // ------ parsea archivo
        resultadoDTO.setTotalRegistros(datosDTO.size());
        ConstTerceroDTO constTerceroDTO = cargaCosntanates();
        
        if(datosDTO.size() > 0){
            try{
                for (DatosArchivoDTO datosArchivoDTO: datosDTO) {
                    datosArchivoDTO.setTipoConcepto(cargaArchivoDTO.getTipoConcepto());
                    datosArchivoDTO.setIdTercero(cargaArchivoDTO.getIdTercero());
                    if(datosArchivoDTO.getRfc().length() >= 10){
                        /** **** Paso 1 :  Buscar el Empleado **** **/
                        List<TdEmpleado> listaEmpleado =   super.persistence().get(QueryTdEmpleadoDAO.class).findEmpleadoByRfc (datosArchivoDTO.getRfc());
                        if (listaEmpleado.size() != 0){
                            /** PASO 2 : Buscar situacion del empleado **/
                            List<TdPlaza> listaPlaza =  super.persistence().get(QueryTdPlazaDAO.class).findRFCTo10(datosArchivoDTO.getRfc());
                            if(listaPlaza.size() == 1){
                                datosArchivoDTO.setRfc(listaPlaza.get(0).getPlazaRfc());
                                TdPlaza plaza = listaPlaza.get(0);
                                String idSitPlaza = plaza.getIdSitPlaza();
                                idSitPlaza = idSitPlaza.substring(0,1);
                                /** valida la situacion de la plaza **/
                                 if (idSitPlaza.equalsIgnoreCase(constTerceroDTO.getVigente())) {
                                    
                                    TnMovtoConceptoPagoDTO tnMovtoConceptoPagoDTO =  convertToTnMovtoCptoPagoDTO(datosArchivoDTO);
                                     
                                    /**** PASO 4 :  Inserción del concepto ****/
                                                                     /** Buscar la situación de captura del concepto **/
                                    List<TnMovtoConceptoPago> listaSituacion = super.persistence().get(QueryTnMovtoConceptoPagoDAO.class).
                                                                                findSituacionCptoPagoCtrAsist(  tnMovtoConceptoPagoDTO.getMcpRfc(),
                                                                                                        tnMovtoConceptoPagoDTO.getIdTipoCpto(),
                                                                                                        tnMovtoConceptoPagoDTO.getIdConcepto(),
                                                                                                        tnMovtoConceptoPagoDTO.getMcpFecIncidencia());
                                     
                                     if(listaSituacion.size() == 0){
                                            /** NO SE TIENE REGISTRADO EL CONCEPTO Y SE QUIERE DAR DE ALTA --> success **/
                                            if(datosArchivoDTO.getTipoMovimiento().equalsIgnoreCase(constTerceroDTO.getAltaTipoMovto())){
                                                TnMovtoConceptoPago tnMovtoConceptoPago = super.transformation().map(tnMovtoConceptoPagoDTO,TnMovtoConceptoPago.class);
                                                tnMovtoConceptoPago.setIdSitCaptura(constTerceroDTO.getAlta());
                                                tnMovtoConceptoPago.setIdMovtoConceptoPago(null);
                                                super.persistence().get(TnMovtoConceptoPagoDAO.class).save(tnMovtoConceptoPago);
                                                countReg++;
                                            }
                                            
                                            /** NO SE ENCONTRO EL REGISTRO Y SE QUIERE DAR DE BAJA --> ERROR 4 concepto no vigente **/
                                            else if(datosArchivoDTO.getTipoMovimiento().equalsIgnoreCase(constTerceroDTO.getCambioTipoMovto())){
                                                TdCaptCptoErrDTO tdCaptCptoErrDTO = convertToTdCaptCptoErrDTO(4, datosArchivoDTO, cargaArchivoDTO.getIdTercero());
                                                TdCaptCptoErr tdCaptCptoErr = super.transformation().map(tdCaptCptoErrDTO, TdCaptCptoErr.class);
                                                super.persistence().get(TdCaptCptoErrDAO.class).save(tdCaptCptoErr);
                                                countError++;
                                            }
                                            
                                            /** NO SE ENCONTRO EL REGISTRO Y SE QUIERE MODIFICAR --> ERROR 4 concepto no vigente **/
                                            else if(datosArchivoDTO.getTipoMovimiento().equalsIgnoreCase(constTerceroDTO.getCambio())){
                                                TdCaptCptoErrDTO tdCaptCptoErrDTO = convertToTdCaptCptoErrDTO(4, datosArchivoDTO, cargaArchivoDTO.getIdTercero());
                                                TdCaptCptoErr tdCaptCptoErr = super.transformation().map(tdCaptCptoErrDTO, TdCaptCptoErr.class);
                                                super.persistence().get(TdCaptCptoErrDAO.class).save(tdCaptCptoErr);
                                                countError++;
                                            }
                                     }
                                     else if (listaSituacion.size() != 0){
                                            if(listaSituacion.get(0).getIdSitCaptura().equalsIgnoreCase(constTerceroDTO.getAlta())){ // Concepto = V
                                                    /** EL RCONCEPTO ESTA VIGENTE, SE QUIERE DAR DE ALTA --> ERROR 3 Tiene vigente ese concepto **/
                                                    if(datosArchivoDTO.getTipoMovimiento().equalsIgnoreCase(constTerceroDTO.getAltaTipoMovto())){
                                                        TdCaptCptoErrDTO tdCaptCptoErrDTO = convertToTdCaptCptoErrDTO(3, datosArchivoDTO, cargaArchivoDTO.getIdTercero());
                                                        TdCaptCptoErr tdCaptCptoErr = super.transformation().map(tdCaptCptoErrDTO, TdCaptCptoErr.class);
                                                        super.persistence().get(TdCaptCptoErrDAO.class).save(tdCaptCptoErr);
                                                        countError++;
                                                    }
                                                    
                                                    /** EL RCONCEPTO ESTA VIGENTE, SE QUIERE DAR DE BAJA --> SUCCESS **/
                                                    else if(datosArchivoDTO.getTipoMovimiento().equalsIgnoreCase(constTerceroDTO.getBaja())){
                                                        TnMovtoConceptoPago tnMovtoConceptoPago = super.transformation().map(tnMovtoConceptoPagoDTO, TnMovtoConceptoPago.class);
                                                        //hacer update al registro actual
                                                        tnMovtoConceptoPago.setIdSitCaptura(constTerceroDTO.getBaja());
                                                        tnMovtoConceptoPago.setIdMovtoConceptoPago(listaSituacion.get(0).getIdMovtoConceptoPago());
                                                        super.persistence().get(TnMovtoConceptoPagoDAO.class).save(tnMovtoConceptoPago);
                                                        countReg++; 
                                                    }
                                                    
                                                    /** EL RCONCEPTO ESTA VIGENTE, SE QUIERE MODIFICAR --> SUCCESS **/
                                                    else if(datosArchivoDTO.getTipoMovimiento().equalsIgnoreCase(constTerceroDTO.getCambio())){
                                                        TnMovtoConceptoPago tnMovtoConceptoPago = super.transformation().map(tnMovtoConceptoPagoDTO,TnMovtoConceptoPago.class);
                                                        //*** hace update al registro actual
                                                        tnMovtoConceptoPago.setIdSitCaptura(constTerceroDTO.getCambio());
                                                        tnMovtoConceptoPago.setIdMovtoConceptoPago(listaSituacion.get(0).getIdMovtoConceptoPago());
                                                        super.persistence().get(TnMovtoConceptoPagoDAO.class).save(tnMovtoConceptoPago);
                                                        //*** inserta nuevo registro
                                                        tnMovtoConceptoPago.setIdSitCaptura(constTerceroDTO.getAlta());
                                                        tnMovtoConceptoPago.setIdMovtoConceptoPago(null);
                                                        super.persistence().get(TnMovtoConceptoPagoDAO.class).save(tnMovtoConceptoPago);
                                                        countReg++;
                                                    }
                                                    else { /** ERROR DESCONOCIDO  **/
                                                        TdCaptCptoErrDTO tdCaptCptoErrDTO =  convertToTdCaptCptoErrDTO(1, datosArchivoDTO, cargaArchivoDTO.getIdTercero());
                                                        TdCaptCptoErr tdCaptCptoErr = super.transformation().map(tdCaptCptoErrDTO, TdCaptCptoErr.class);
                                                        super.persistence().get(TdCaptCptoErrDAO.class).save(tdCaptCptoErr);
                                                        countError++; }
                                            }
                                            else if(listaSituacion.get(0).getIdSitCaptura().equalsIgnoreCase(constTerceroDTO.getBaja())){ // Concepto = B
                                                    /** EL RCONCEPTO ESTA DADO DE BAJA, SE QUIERE DAR DE ALTA --> SUCESS **/
                                                    if(datosArchivoDTO.getTipoMovimiento().equalsIgnoreCase(constTerceroDTO.getAltaTipoMovto())){
                                                        TnMovtoConceptoPago tnMovtoConceptoPago = super.transformation().map(tnMovtoConceptoPagoDTO,TnMovtoConceptoPago.class);
                                                        tnMovtoConceptoPago.setIdSitCaptura(constTerceroDTO.getAlta());
                                                        tnMovtoConceptoPago.setIdMovtoConceptoPago(null);
                                                        super.persistence().get(TnMovtoConceptoPagoDAO.class).save(tnMovtoConceptoPago);
                                                        countReg++;
                                                     }
                                                     
                                                    /** EL RCONCEPTO ESTA DADO DE BAJA, SE QUIERE DAR DE BAJA --> ERROR 4 concepto no vigente **/
                                                    else if(datosArchivoDTO.getTipoMovimiento().equalsIgnoreCase(constTerceroDTO.getBaja())){
                                                        TdCaptCptoErrDTO tdCaptCptoErrDTO = convertToTdCaptCptoErrDTO(4, datosArchivoDTO, cargaArchivoDTO.getIdTercero());
                                                        TdCaptCptoErr tdCaptCptoErr = super.transformation().map(tdCaptCptoErrDTO, TdCaptCptoErr.class);
                                                        super.persistence().get(TdCaptCptoErrDAO.class).save(tdCaptCptoErr);
                                                        countError++;
                                                    }
                                                     
                                                    /** EL RCONCEPTO ESTA DADO DE BAJA, SE QUIERE MODIFICAR --> ERROR 4 concepto no vigente **/
                                                    else if(datosArchivoDTO.getTipoMovimiento().equalsIgnoreCase(constTerceroDTO.getCambio())){
                                                        TdCaptCptoErrDTO tdCaptCptoErrDTO = convertToTdCaptCptoErrDTO(4, datosArchivoDTO, cargaArchivoDTO.getIdTercero());
                                                        TdCaptCptoErr tdCaptCptoErr = super.transformation().map(tdCaptCptoErrDTO, TdCaptCptoErr.class);
                                                        super.persistence().get(TdCaptCptoErrDAO.class).save(tdCaptCptoErr);
                                                        countError++;
                                                    }
                                                    else { /** ERROR DESCONOCIDO  **/
                                                            TdCaptCptoErrDTO tdCaptCptoErrDTO = convertToTdCaptCptoErrDTO(17, datosArchivoDTO, cargaArchivoDTO.getIdTercero());
                                                            TdCaptCptoErr tdCaptCptoErr = super.transformation().map(tdCaptCptoErrDTO, TdCaptCptoErr.class);
                                                            super.persistence().get(TdCaptCptoErrDAO.class).save(tdCaptCptoErr);
                                                            countError++; }
                                            }   else { /** ERROR DESCONOCIDO  **/
                                                TdCaptCptoErrDTO tdCaptCptoErrDTO =  convertToTdCaptCptoErrDTO(17, datosArchivoDTO, cargaArchivoDTO.getIdTercero());
                                                TdCaptCptoErr tdCaptCptoErr = super.transformation().map(tdCaptCptoErrDTO, TdCaptCptoErr.class);
                                                super.persistence().get(TdCaptCptoErrDAO.class).save(tdCaptCptoErr);
                                                countError++; }
                                     } else { /** ERROR DESCONOCIDO  **/
                                        TdCaptCptoErrDTO tdCaptCptoErrDTO =  convertToTdCaptCptoErrDTO(17, datosArchivoDTO, cargaArchivoDTO.getIdTercero());
                                        TdCaptCptoErr tdCaptCptoErr = super.transformation().map(tdCaptCptoErrDTO, TdCaptCptoErr.class);
                                        super.persistence().get(TdCaptCptoErrDAO.class).save(tdCaptCptoErr);
                                        countError++; }
                                 } else {   logger.debug(" La plaza del empleado no esta vigente "); 
                                            TdCaptCptoErrDTO tdCaptCptoErrDTO =  convertToTdCaptCptoErrDTO(2, datosArchivoDTO, cargaArchivoDTO.getIdTercero());
                                            TdCaptCptoErr tdCaptCptoErr = super.transformation().map(tdCaptCptoErrDTO, TdCaptCptoErr.class);
                                            super.persistence().get(TdCaptCptoErrDAO.class).save(tdCaptCptoErr);
                                            countError++; }
                            } else {logger.debug(" ********************* No se encontro la plaza del empleado -- >> DADO DE BAJA ");  
                                    TdCaptCptoErrDTO tdCaptCptoErrDTO =  convertToTdCaptCptoErrDTO(1, datosArchivoDTO, cargaArchivoDTO.getIdTercero());
                                    TdCaptCptoErr tdCaptCptoErr = super.transformation().map(tdCaptCptoErrDTO, TdCaptCptoErr.class);
                                    super.persistence().get(TdCaptCptoErrDAO.class).save(tdCaptCptoErr);
                                    countError++; } 
                        } else {    logger.debug(" ********************* El rfc no se encontro  "); 
                                    TdCaptCptoErrDTO tdCaptCptoErrDTO =  convertToTdCaptCptoErrDTO(1, datosArchivoDTO, cargaArchivoDTO.getIdTercero());
                                    TdCaptCptoErr tdCaptCptoErr = super.transformation().map(tdCaptCptoErrDTO, TdCaptCptoErr.class);
                                    super.persistence().get(TdCaptCptoErrDAO.class).save(tdCaptCptoErr);
                                    countError++; }
                    } else {    logger.debug(" ********************* El rfc en el archivo de carga no es >= 10 "); 
                                TdCaptCptoErrDTO tdCaptCptoErrDTO =  convertToTdCaptCptoErrDTO(1, datosArchivoDTO, cargaArchivoDTO.getIdTercero());
                                TdCaptCptoErr tdCaptCptoErr = super.transformation().map(tdCaptCptoErrDTO, TdCaptCptoErr.class);
                                super.persistence().get(TdCaptCptoErrDAO.class).save(tdCaptCptoErr);
                                countError++; }
                } //fin-for
            } catch(Exception e){   cargaArchivoDTO.setError(e.getMessage()); e.printStackTrace(); result = false;   }
        }
        if(countReg > 0 || countError > 0){ result = true; }
        resultadoDTO.setTotalReg(countReg);
        resultadoDTO.setTotalError(countError);
        resultadoDTO.setResult(result);
        deleteFlatFile(cargaArchivoDTO);
        return resultadoDTO;
    } //fin-metodo
    
    /**
     * Incerta los registros del archivo de texto plano, del FONACOT
     * @param cargaArchivoDTO
     * @return ResultadoDTO
     */
    public ResultadoDTO insertMovtoConceptoPagoFonacot(CargaArchivoDTO cargaArchivoDTO){
        ResultadoDTO resultadoDTO=new ResultadoDTO();
        boolean result = false;            
        int countReg=0;
        int countError=0;
        List<DatosArchivoDTO> datosDTO=null;
        List<TnMovtoConceptoPago> lTnMovtoConceptoPago = null;
        Double montoQnal        = null;
        Double adeudo           = null;
        Double montoAux         = null;
        Double montoMensual     = null;
        int cifrasPresicion = (int) Math.pow(10, 2); 
        
        try {
            datosDTO = parserArchivo(cargaArchivoDTO);
            ConstTerceroDTO constTerceroDTO=cargaCosntanates();
            resultadoDTO.setTotalRegistros(datosDTO.size());
            
            // situacionCaptura baja en todos los registros donde situacionCaptura este vigente
            lTnMovtoConceptoPago = super.persistence().get(TnMovtoConceptoPagoDAO.class).findByIdTercero(cargaArchivoDTO.getIdTercero());
            
            for(TnMovtoConceptoPago ltTnMovtoConceptoPago: lTnMovtoConceptoPago) {
                if(ltTnMovtoConceptoPago.getIdSitCaptura().equalsIgnoreCase(constTerceroDTO.getAlta())) {
                    ltTnMovtoConceptoPago.setIdSitCaptura(constTerceroDTO.getBaja());
                    super.persistence().get(TnMovtoConceptoPagoDAO.class).save(ltTnMovtoConceptoPago);
                }
            }
            
            for (DatosArchivoDTO datosArchivoDTO: datosDTO) {
                datosArchivoDTO.setIdTercero(cargaArchivoDTO.getIdTercero());
                datosArchivoDTO.setTipoConcepto(cargaArchivoDTO.getTipoConcepto());
                if(datosArchivoDTO.getRfc().length() >= 10){
                    //Busca el empleado.
                    List<TdEmpleado> listaEmpleado =   super.persistence().get(QueryTdEmpleadoDAO.class).findEmpleadoByRfc (datosArchivoDTO.getRfc());
                    if (listaEmpleado.size() != 0) {
                        datosArchivoDTO.setRfc(listaEmpleado.get(0).getRfcUnico());     //agrega rf_unico al objeto datosArchivoDTO
                        List<TdPlaza> listaPlaza =  super.persistence().get(QueryTdPlazaDAO.class).findRFCTo10(datosArchivoDTO.getRfc());       //Buscar situacion del empleado
                         if(listaPlaza.size() == 1){
                             TdPlaza plaza=listaPlaza.get(0);
                             String idSitPlaza=plaza.getIdSitPlaza();
                             idSitPlaza = idSitPlaza.substring(0,1);
                             //valida la situacion de plaza si esta vigente 'O'
                             if (idSitPlaza.equalsIgnoreCase(constTerceroDTO.getVigente())) {
                                //pasa DatosArchivoDTO a TnMovtoConceptoPagoDTO
                                TnMovtoConceptoPagoDTO tnMovtoConceptoPagoDTO = convertToTnMovtoCptoPagoDTO(datosArchivoDTO);
                                TnMovtoConceptoPago tnMovtoConceptoPago = super.transformation().map(tnMovtoConceptoPagoDTO,TnMovtoConceptoPago.class);
                                
                                montoMensual    = Math.rint(tnMovtoConceptoPago.getMcpMonto()*cifrasPresicion) / cifrasPresicion;
                                montoQnal       = Math.rint( (montoMensual / 2) * cifrasPresicion ) / cifrasPresicion;
                                montoAux        = Math.rint( (montoQnal * 2) * cifrasPresicion ) / cifrasPresicion;
                                adeudo          = Math.rint( (montoMensual - montoAux) * cifrasPresicion ) / cifrasPresicion;
                                
                                tnMovtoConceptoPago.setMcpMonto(montoQnal);
                                
                                if(adeudo.doubleValue() != 0.00){
                                    tnMovtoConceptoPago.setMcpMontoAdeudo(adeudo);
                                    tnMovtoConceptoPago.setMcpFecIniAdeudo(new Date());
                                    tnMovtoConceptoPago.setMcpFecFinAdeudo(new Date());
                                    tnMovtoConceptoPago.setMcpQnasAdeudo(new Integer(tnMovtoConceptoPago.getMcpQnaIni()));
                                }
                                
                                tnMovtoConceptoPago.setIdSitCaptura(constTerceroDTO.getAlta());
                                tnMovtoConceptoPago.setIdMovtoConceptoPago(null);
                                super.persistence().get(TnMovtoConceptoPagoDAO.class).save(tnMovtoConceptoPago);
                                countReg++;
                               
                             } else if (plaza.getIdSitPlaza().equalsIgnoreCase(constTerceroDTO.getLicencia()) || plaza.getIdSitPlaza().equalsIgnoreCase(constTerceroDTO.getPreventiva())) {
                                    // insertar ERROR 2 Personal con licencia o preventiva de pa
                                    TdCaptCptoErrDTO tdCaptCptoErrDTO =  convertToTdCaptCptoErrDTO(2, datosArchivoDTO, cargaArchivoDTO.getIdTercero());
                                    TdCaptCptoErr tdCaptCptoErr = super.transformation().map(tdCaptCptoErrDTO, TdCaptCptoErr.class);
                                    super.persistence().get(TdCaptCptoErrDAO.class).save(tdCaptCptoErr);
                                    countError++; }
                                else{
                                    TdCaptCptoErrDTO tdCaptCptoErrDTO =  convertToTdCaptCptoErrDTO(6, datosArchivoDTO, cargaArchivoDTO.getIdTercero());
                                    TdCaptCptoErr tdCaptCptoErr = super.transformation().map(tdCaptCptoErrDTO, TdCaptCptoErr.class);
                                    super.persistence().get(TdCaptCptoErrDAO.class).save(tdCaptCptoErr);
                                    countError++; }
                         } else if(listaPlaza.size()==0){ //PLAZA NO ENCONTRADA
                               TdCaptCptoErrDTO tdCaptCptoErrDTO =  convertToTdCaptCptoErrDTO(1, datosArchivoDTO, cargaArchivoDTO.getIdTercero());
                               TdCaptCptoErr tdCaptCptoErr = super.transformation().map(tdCaptCptoErrDTO, TdCaptCptoErr.class);
                               super.persistence().get(TdCaptCptoErrDAO.class).save(tdCaptCptoErr);
                               countError++; }
                           else  if(listaPlaza.size() > 1){ 
                                // insertar ERROR 1  Personal dado de baja en nomina 
                                TdCaptCptoErrDTO tdCaptCptoErrDTO =  convertToTdCaptCptoErrDTO(17, datosArchivoDTO, cargaArchivoDTO.getIdTercero());
                                TdCaptCptoErr tdCaptCptoErr = super.transformation().map(tdCaptCptoErrDTO, TdCaptCptoErr.class);
                                super.persistence().get(TdCaptCptoErrDAO.class).save(tdCaptCptoErr);
                                countError++; }
                    } else {
                        // insertar ERROR 8   Personal no encontrado en nomina;
                        TdCaptCptoErrDTO tdCaptCptoErrDTO =  convertToTdCaptCptoErrDTO(8, datosArchivoDTO, cargaArchivoDTO.getIdTercero());
                        TdCaptCptoErr tdCaptCptoErr = super.transformation().map(tdCaptCptoErrDTO, TdCaptCptoErr.class);
                        super.persistence().get(TdCaptCptoErrDAO.class).save(tdCaptCptoErr);
                        countError++; }
                } else { // RFC NO EXISTE
                        TdCaptCptoErrDTO tdCaptCptoErrDTO =  convertToTdCaptCptoErrDTO(8, datosArchivoDTO, cargaArchivoDTO.getIdTercero());
                        TdCaptCptoErr tdCaptCptoErr = super.transformation().map(tdCaptCptoErrDTO, TdCaptCptoErr.class);
                        super.persistence().get(TdCaptCptoErrDAO.class).save(tdCaptCptoErr);
                        countError++; }
                result = true;
            }
        } catch(Exception e) {   e.printStackTrace(); result = false;   }
        resultadoDTO.setTotalReg(countReg);
        resultadoDTO.setTotalError(countError);
        resultadoDTO.setResult(result);
        deleteFlatFile(cargaArchivoDTO);
        return resultadoDTO;
    }
    
    /**
     * inserta los registros del archivo plano
     * @param cargaArchivoDTO
     * @return true si los registros del archivo se guardaron con exito, de lo conterario false
     */
    public ResultadoDTO insertMovtoConceptoPago(CargaArchivoDTO cargaArchivoDTO) {
        ResultadoDTO resultadoDTO = new ResultadoDTO();
        List<DatosArchivoDTO> datosDTO = null;
        boolean result = false;
        int countError = 0;
        int countReg = 0;
        
        try{
            datosDTO = parserArchivo(cargaArchivoDTO);          //  parsea archivo
            resultadoDTO.setTotalRegistros(datosDTO.size());
            ConstTerceroDTO constTerceroDTO = cargaCosntanates();
            
            for (DatosArchivoDTO datosArchivoDTO: datosDTO) {
                datosArchivoDTO.setTipoConcepto(cargaArchivoDTO.getTipoConcepto());
                datosArchivoDTO.setIdTercero(cargaArchivoDTO.getIdTercero());
                if(datosArchivoDTO.getRfc().length() >= 10){
                    /** **** Paso 1 :  Buscar el Empleado **** **/
                    List<TdEmpleado> listaEmpleado =   super.persistence().get(QueryTdEmpleadoDAO.class).findEmpleadoByRfc (datosArchivoDTO.getRfc());
                    if (listaEmpleado.size() != 0){
                        /** PASO 2 : Buscar situacion del empleado **/
                        List<TdPlaza> listaPlaza =  super.persistence().get(QueryTdPlazaDAO.class).findRFCTo10(datosArchivoDTO.getRfc());
                        if(listaPlaza.size() == 1){
                            datosArchivoDTO.setRfc(listaPlaza.get(0).getPlazaRfc());
                            TdPlaza plaza=listaPlaza.get(0);
                            String idSitPlaza=plaza.getIdSitPlaza();
                            idSitPlaza = idSitPlaza.substring(0,1);
                            /** valida la situacion de la plaza **/
                             if (idSitPlaza.equalsIgnoreCase(constTerceroDTO.getVigente())) {
                                TnMovtoConceptoPagoDTO tnMovtoConceptoPagoDTO =  convertToTnMovtoCptoPagoDTO(datosArchivoDTO);
                                
                                /** PASO  3 : Validaciones adicionales **/
                                if (cargaArchivoDTO.getDescTercero().equalsIgnoreCase(constTerceroDTO.getDescFovissste())) {
                                    // QnaCapturaDTO quincenaCaptura =  getQuincenaCaptura();
                                    //se obtiene la quincena actual de captura
                                    Integer quincena = getQuincenaCaptura().intValue();
                                    //obtiene el nombre del archivo para tomarlo como referencia
                                    tnMovtoConceptoPagoDTO.setMcpRefCaptura(getReferenciaFovi(cargaArchivoDTO.getFileName()));
                                    //Si la quincena de Inicio o aplicación del concepto 
                                    //es mayor a la quincena de captura que maneja el sistema ERROR 18
                                    Integer qnaInicio=datosArchivoDTO.getQna()==null?0:Integer.parseInt(datosArchivoDTO.getQna().substring(4,6));
                                    if( qnaInicio >  quincena) {
                                        TdCaptCptoErrDTO tdCaptCptoErrDTO =  convertToTdCaptCptoErrDTO(16, datosArchivoDTO, cargaArchivoDTO.getIdTercero());
                                        TdCaptCptoErr tdCaptCptoErr = super.transformation().map(tdCaptCptoErrDTO, TdCaptCptoErr.class);
                                        super.persistence().get(TdCaptCptoErrDAO.class).save(tdCaptCptoErr);
                                        countError++;  
                                        continue;
                                    }
                                }
                                
                                /**** PASO 4 :  Inserción del concepto ****/
                                /** Buscar la situación de captura del concepto **/
                                List<TnMovtoConceptoPago> listaSituacion = super.persistence().get(QueryTnMovtoConceptoPagoDAO.class).
                                findSituacionCptoPago(  tnMovtoConceptoPagoDTO.getMcpRfc(),
                                                        tnMovtoConceptoPagoDTO.getIdTipoCpto(),
                                                        tnMovtoConceptoPagoDTO.getIdConcepto());
                                 
                                if (listaSituacion.size() != 0){    /** Cncepto VIGENTE **/
                                    TnMovtoConceptoPago  situacion = listaSituacion.get(0);
                                    if (datosArchivoDTO.getIdTercero().equalsIgnoreCase(constTerceroDTO.getIdIssste())) {
                                        if (datosArchivoDTO.getTipoMovimiento().equalsIgnoreCase(constTerceroDTO.getAltaIssste())){
                                            /*** EL CONCEPTO ESTA ASIGNADO Y QUIERE VOLVER A ASIGNAR --> Error ***/
                                            TdCaptCptoErrDTO tdCaptCptoErrDTO =  convertToTdCaptCptoErrDTO(3, datosArchivoDTO, cargaArchivoDTO.getIdTercero());
                                            TdCaptCptoErr tdCaptCptoErr = super.transformation().map(tdCaptCptoErrDTO, TdCaptCptoErr.class);
                                            super.persistence().get(TdCaptCptoErrDAO.class).save(tdCaptCptoErr);
                                            countError++;   }
                                        else if (datosArchivoDTO.getTipoMovimiento().equalsIgnoreCase(constTerceroDTO.getBajaIssste())){
                                            /** EL CONCEPTO ESTA ASIGNADO Y SE QUIERE DAR DE BAJA --> Correcto **/
                                            TnMovtoConceptoPago tnMovtoConceptoPago = super.transformation().map(tnMovtoConceptoPagoDTO, TnMovtoConceptoPago.class);
                                            //hacer update al registro actual
                                            tnMovtoConceptoPago.setIdSitCaptura(constTerceroDTO.getBaja());
                                            tnMovtoConceptoPago.setIdMovtoConceptoPago(situacion.getIdMovtoConceptoPago());
                                            super.persistence().get(TnMovtoConceptoPagoDAO.class).save(tnMovtoConceptoPago);
                                            countReg++;   }
                                        else if(datosArchivoDTO.getTipoMovimiento().equalsIgnoreCase(constTerceroDTO.getCambioIssste())){
                                            /** EL CONCEPTO ESTA ASIGNADO Y SE QUIERE MODIFICAR --> Correcto **/
                                            TnMovtoConceptoPago tnMovtoConceptoPago =super.transformation().map(tnMovtoConceptoPagoDTO,TnMovtoConceptoPago.class);
                                            //*** hace update al registro actual
                                            tnMovtoConceptoPago.setIdSitCaptura(constTerceroDTO.getCambio());
                                            tnMovtoConceptoPago.setIdMovtoConceptoPago(situacion.getIdMovtoConceptoPago());
                                            super.persistence().get(TnMovtoConceptoPagoDAO.class).save(tnMovtoConceptoPago);
                                            //*** inserta nuevo registro
                                            tnMovtoConceptoPago.setIdSitCaptura(constTerceroDTO.getAlta());
                                            tnMovtoConceptoPago.setIdMovtoConceptoPago(null);
                                            super.persistence().get(TnMovtoConceptoPagoDAO.class).save(tnMovtoConceptoPago);
                                            countReg++;   }
                                    } else{ /** Cncepto VIGENTE **/
                                        /** O T R O S   C O N C E P T O S **/
                                        /** NOTA.- Esta condicion puede parecer extraña porque se utiliza nomenclatura issste.
                                         *  pero la razon es porque hay terceros que no utilizan nomenclatura A= 'ALTA'; B= 'BAJA'; C= 'CAMBIOS'
                                         *  sino que utilizan 1= 'alta'; 2= 'baja'; 3= 'cambios' y mas raro ahun las operaciones de baja y cambios
                                         *  son contrarias a las del issste.  POR LO TANTO ES VALIDO USARLAS.
                                         **/
                                        if (datosArchivoDTO.getTipoMovimiento().equalsIgnoreCase(constTerceroDTO.getAltaTipoMovto()) ||
                                            datosArchivoDTO.getTipoMovimiento().equalsIgnoreCase(constTerceroDTO.getAltaIssste()) ){
                                            /*** EL CONCEPTO ESTA ASIGNADO Y QUIERE VOLVER A ASIGNAR --> correcto ***/
                                            TdCaptCptoErrDTO tdCaptCptoErrDTO =  convertToTdCaptCptoErrDTO(3, datosArchivoDTO, cargaArchivoDTO.getIdTercero());
                                            TdCaptCptoErr tdCaptCptoErr = super.transformation().map(tdCaptCptoErrDTO, TdCaptCptoErr.class);
                                            super.persistence().get(TdCaptCptoErrDAO.class).save(tdCaptCptoErr);
                                            countError++;   }
                                        else if(datosArchivoDTO.getTipoMovimiento().equalsIgnoreCase(constTerceroDTO.getModTipoMovto()) ||
                                                datosArchivoDTO.getTipoMovimiento().equalsIgnoreCase(constTerceroDTO.getBajaIssste()) ){
                                                    /*** EL CONCEPTO ESTA ASIGNADO Y SE QUIERE MODIFICAR --> correcto ***/
                                                    TnMovtoConceptoPago tnMovtoConceptoPago = super.transformation().map(tnMovtoConceptoPagoDTO,TnMovtoConceptoPago.class);
                                                    // hacer update al registro actual
                                                    tnMovtoConceptoPago.setIdSitCaptura(constTerceroDTO.getCambio());
                                                    tnMovtoConceptoPago.setIdMovtoConceptoPago(situacion.getIdMovtoConceptoPago());
                                                    super.persistence().get(TnMovtoConceptoPagoDAO.class).save(tnMovtoConceptoPago);
                                                    // insertar nuevo registro
                                                    tnMovtoConceptoPago.setIdSitCaptura(constTerceroDTO.getAlta());
                                                    tnMovtoConceptoPago.setIdMovtoConceptoPago(situacion.getIdMovtoConceptoPago());
                                                    tnMovtoConceptoPago.setIdMovtoConceptoPago(null);
                                                    super.persistence().get(TnMovtoConceptoPagoDAO.class).save(tnMovtoConceptoPago);
                                                    countReg++;   }
                                        else if(datosArchivoDTO.getTipoMovimiento().equalsIgnoreCase(constTerceroDTO.getCambioTipoMovto()) ||
                                                datosArchivoDTO.getTipoMovimiento().equalsIgnoreCase(constTerceroDTO.getCambioIssste())){
                                                    /*** EL CONCEPTO ESTA ASIGNADO Y SE QUIERE HACER LA BAJA DEL CONCEPTO --> CORRECTO ***/
                                                    TnMovtoConceptoPago tnMovtoConceptoPago = super.transformation().map(tnMovtoConceptoPagoDTO,  TnMovtoConceptoPago.class);
                                                    // hacer update al registro actual
                                                    tnMovtoConceptoPago.setIdSitCaptura(constTerceroDTO.getBaja());
                                                    tnMovtoConceptoPago.setIdMovtoConceptoPago(situacion.getIdMovtoConceptoPago());
                                                    super.persistence().get(TnMovtoConceptoPagoDAO.class).save(tnMovtoConceptoPago);
                                                    countReg++;   }
                                     }
                                } else{ /** Concepto NO VIGENTE**/
                                        if(datosArchivoDTO.getIdTercero().equalsIgnoreCase(constTerceroDTO.getIdIssste())){
                                            if (datosArchivoDTO.getTipoMovimiento().equalsIgnoreCase(constTerceroDTO.getAltaIssste())){
                                            /** EL CONCEPTO NO ESTA VIGENTE Y SE QUIERE DAR DE ALTA --> CORECTO **/
                                            // si movimiento es alta insertar registro
                                            TnMovtoConceptoPago tnMovtoConceptoPago =  super.transformation().map(tnMovtoConceptoPagoDTO,TnMovtoConceptoPago.class);
                                            tnMovtoConceptoPago.setIdSitCaptura(constTerceroDTO.getAlta());
                                            tnMovtoConceptoPago.setIdMovtoConceptoPago(null);
                                            super.persistence().get(TnMovtoConceptoPagoDAO.class).save(tnMovtoConceptoPago);
                                            countReg++;   }
                                            else if(datosArchivoDTO.getTipoMovimiento().equalsIgnoreCase(constTerceroDTO.getBajaIssste())){
                                                /** EL CONCEPTO NO ESTA VIGENTE Y SE QUIERE DAR DE BAJA --> ERROR **/
                                                //insert Error 4 concepto no vigente
                                                TdCaptCptoErrDTO tdCaptCptoErrDTO =  convertToTdCaptCptoErrDTO(4, datosArchivoDTO, cargaArchivoDTO.getIdTercero());
                                                TdCaptCptoErr tdCaptCptoErr = super.transformation().map(tdCaptCptoErrDTO, TdCaptCptoErr.class);
                                                super.persistence().get(TdCaptCptoErrDAO.class).save(tdCaptCptoErr);
                                                countError++;   }
                                            else if(datosArchivoDTO.getTipoMovimiento().equalsIgnoreCase(constTerceroDTO.getCambioIssste())){
                                                /** EL CONCEPTO NO ESTA VIGENTE Y SE QUIERE MODIFICAR --> ERROR **/
                                                TdCaptCptoErrDTO tdCaptCptoErrDTO =  convertToTdCaptCptoErrDTO(4, datosArchivoDTO, cargaArchivoDTO.getIdTercero());
                                                TdCaptCptoErr tdCaptCptoErr = super.transformation().map(tdCaptCptoErrDTO, TdCaptCptoErr.class);
                                                super.persistence().get(TdCaptCptoErrDAO.class).save(tdCaptCptoErr);
                                                countError++;   }
                                        } else{ /** Concepto no vigente **/ /** O T R O S  C O N C E P T O S **/
                                                if( datosArchivoDTO.getTipoMovimiento().equalsIgnoreCase(constTerceroDTO.getAltaTipoMovto()) ||
                                                    datosArchivoDTO.getTipoMovimiento().equalsIgnoreCase(constTerceroDTO.getAltaIssste())){
                                                        /*** EL CONCEPTO NO ES VIGENTE Y SE QUIERE ASIGNAR --> CORECTO ****/
                                                        TnMovtoConceptoPago tnMovtoConceptoPago = super.transformation().map(tnMovtoConceptoPagoDTO,TnMovtoConceptoPago.class);
                                                        tnMovtoConceptoPago.setIdSitCaptura(constTerceroDTO.getAlta());
                                                        tnMovtoConceptoPago.setIdMovtoConceptoPago(null);
                                                        super.persistence().get(TnMovtoConceptoPagoDAO.class).save(tnMovtoConceptoPago);
                                                        countReg++;   }
                                                else if(datosArchivoDTO.getTipoMovimiento().equalsIgnoreCase(constTerceroDTO.getModTipoMovto()) ||
                                                        datosArchivoDTO.getTipoMovimiento().equalsIgnoreCase(constTerceroDTO.getCambioIssste())){
                                                            /*** EL CONCEPTO NO VIGENTE Y SE QUIERE MODIFICAR - ERROR 4 concepto no vigente ***/
                                                            TdCaptCptoErrDTO tdCaptCptoErrDTO =  convertToTdCaptCptoErrDTO(4, datosArchivoDTO, cargaArchivoDTO.getIdTercero());
                                                            TdCaptCptoErr tdCaptCptoErr = super.transformation().map(tdCaptCptoErrDTO, TdCaptCptoErr.class);
                                                            super.persistence().get(TdCaptCptoErrDAO.class).save(tdCaptCptoErr);
                                                            countError++;   }
                                                else if(datosArchivoDTO.getTipoMovimiento().equalsIgnoreCase(constTerceroDTO.getCambioTipoMovto()) ||
                                                        datosArchivoDTO.getTipoMovimiento().equalsIgnoreCase(constTerceroDTO.getBajaIssste())){
                                                            /*** EL CONCEPTO NO ESTA ASIGNADO Y SE QUIERE ELIMINAR - insertar ERROR 4 concepto no vigente ***/
                                                            TdCaptCptoErrDTO tdCaptCptoErrDTO =  convertToTdCaptCptoErrDTO(4, datosArchivoDTO, cargaArchivoDTO.getIdTercero());
                                                            TdCaptCptoErr tdCaptCptoErr = super.transformation().map(tdCaptCptoErrDTO, TdCaptCptoErr.class);
                                                            super.persistence().get(TdCaptCptoErrDAO.class).save(tdCaptCptoErr);
                                                            countError++;   }
                                          }
                                  }
                             } else if (plaza.getIdSitPlaza().equalsIgnoreCase(constTerceroDTO.getLicencia()) || 
                                        plaza.getIdSitPlaza().equalsIgnoreCase(constTerceroDTO.getPreventiva())) {
                                    /**  insertar ERROR 2 Personal con licencia o preventiva de pa **/
                                    TdCaptCptoErrDTO tdCaptCptoErrDTO =  convertToTdCaptCptoErrDTO(2, datosArchivoDTO, cargaArchivoDTO.getIdTercero());
                                    TdCaptCptoErr tdCaptCptoErr = super.transformation().map(tdCaptCptoErrDTO, TdCaptCptoErr.class);
                                    super.persistence().get(TdCaptCptoErrDAO.class).save(tdCaptCptoErr);
                                    countError++;   }
                                else {  /** insertar ERROR 2 : Personal con licencia o preventiva de pa **/
                                        TdCaptCptoErrDTO tdCaptCptoErrDTO =  convertToTdCaptCptoErrDTO(2, datosArchivoDTO, cargaArchivoDTO.getIdTercero());
                                        TdCaptCptoErr tdCaptCptoErr = super.transformation().map(tdCaptCptoErrDTO, TdCaptCptoErr.class);
                                        super.persistence().get(TdCaptCptoErrDAO.class).save(tdCaptCptoErr);
                                        countError++;   }
                        } else if(listaPlaza.size() == 0){  /** Insertar ERROR 1  Personal dado de baja en nomina **/
                                                            TdCaptCptoErrDTO tdCaptCptoErrDTO =  convertToTdCaptCptoErrDTO(1, datosArchivoDTO, cargaArchivoDTO.getIdTercero());
                                                            TdCaptCptoErr tdCaptCptoErr = super.transformation().map(tdCaptCptoErrDTO, TdCaptCptoErr.class);
                                                            super.persistence().get(TdCaptCptoErrDAO.class).save(tdCaptCptoErr);
                                                            countError++;   }
                          else if(listaPlaza.size() > 1){   /** Insertar ERROR 1  prueba **/
                                                            TdCaptCptoErrDTO tdCaptCptoErrDTO =  convertToTdCaptCptoErrDTO(17, datosArchivoDTO, cargaArchivoDTO.getIdTercero());
                                                            TdCaptCptoErr tdCaptCptoErr = super.transformation().map(tdCaptCptoErrDTO, TdCaptCptoErr.class);
                                                            super.persistence().get(TdCaptCptoErrDAO.class).save(tdCaptCptoErr);
                                                            countError++;   }
                    } else{   /** insertar ERROR 8   Personal no encontrado en nomina; **/
                              TdCaptCptoErrDTO tdCaptCptoErrDTO =  convertToTdCaptCptoErrDTO(8, datosArchivoDTO, cargaArchivoDTO.getIdTercero());
                              TdCaptCptoErr tdCaptCptoErr = super.transformation().map(tdCaptCptoErrDTO, TdCaptCptoErr.class);
                              super.persistence().get(TdCaptCptoErrDAO.class).save(tdCaptCptoErr);
                              countError++;   }
                } else{   /** Error 8 - Personal no encontrado en nomina **/
                          TdCaptCptoErrDTO tdCaptCptoErrDTO =  convertToTdCaptCptoErrDTO(8, datosArchivoDTO, cargaArchivoDTO.getIdTercero());
                          TdCaptCptoErr tdCaptCptoErr = super.transformation().map(tdCaptCptoErrDTO, TdCaptCptoErr.class);
                          super.persistence().get(TdCaptCptoErrDAO.class).save(tdCaptCptoErr);
                          countError++;   }
                result = true;
            }
        } catch(Exception e){   cargaArchivoDTO.setError(e.getMessage()); e.printStackTrace(); result = false;   }
        
        resultadoDTO.setTotalReg(countReg);
        resultadoDTO.setTotalError(countError);
        resultadoDTO.setResult(result);
        deleteFlatFile(cargaArchivoDTO);
        return resultadoDTO;
    }


/**
     * Valida que exista la plantilla XML para el parseo de archivos planos
     * @param idTercero
     * @return true si existe el archiv, de lo contrario false
     */
    public boolean existsFileXML(String idTercero) {
        String templateFileXml = super.configuration().getString("terceros.templates.dir") +  diagonal + idTercero + "-config.xml";
        boolean flag = false;
        File file = new File(templateFileXml);
        if (file.exists())
            flag = true;
        return flag;
    }


/**
     * convierte DatosArchivoDTO a TnMovtoConceptoPagoDTO
     * @param datosArchivoDTO
     * @return TnMovtoConceptoPagoDTO
     */
    private TnMovtoConceptoPagoDTO convertToTnMovtoCptoPagoDTO(DatosArchivoDTO datosArchivoDTO) {
        String tipoConcepto = "";
        Date fechaIncidencia = new Date();
        
        if(datosArchivoDTO.getFechaIncidencia() != null){
            Calendar calendar = Calendar.getInstance();
            calendar.set(new Integer(datosArchivoDTO.getFechaIncidencia().substring(0,4)), 
                         new Integer(datosArchivoDTO.getFechaIncidencia().substring(4, 6)) - 1, 
                         new Integer(datosArchivoDTO.getFechaIncidencia().substring(6, 8)),
                         new Integer(0), new Integer(0), new Integer(0));
            fechaIncidencia = calendar.getTime();
            
            
            logger.debug("---------->> FECHA: " + fechaIncidencia);
        }
        
        
        if(datosArchivoDTO.getTipoConcepto().equalsIgnoreCase("P")){   tipoConcepto= super.configuration().getString("terceros", "TIPO_CONCEPTO_PERCEPCION");           }
        else if(datosArchivoDTO.getTipoConcepto().equalsIgnoreCase("D")) {   tipoConcepto= super.configuration().getString("terceros", "ID_TIPO_CONCEPTO_DEDUCCION");   }
        else if(datosArchivoDTO.getTipoConcepto().equalsIgnoreCase("C")) {   tipoConcepto= super.configuration().getString("terceros", "ID_TIPO_CONCEPTO_CONTROL");     }
        else if(datosArchivoDTO.getTipoConcepto().equalsIgnoreCase("U")) {   tipoConcepto= super.configuration().getString("terceros", "ID_TIPO_CONCEPTO_REFERENCIA_CALCULO");      }
        
        TnMovtoConceptoPagoDTO tnMovtoConceptoPagoDTO =  new TnMovtoConceptoPagoDTO();
        tnMovtoConceptoPagoDTO.setMcpRfc(datosArchivoDTO.getRfc());
        tnMovtoConceptoPagoDTO.setIdTercero(datosArchivoDTO.getIdTercero());
        tnMovtoConceptoPagoDTO.setIdConcepto( datosArchivoDTO.getConcepto().equalsIgnoreCase("65") ? "68" : datosArchivoDTO.getConcepto() );
        tnMovtoConceptoPagoDTO.setMcpRefCaptura(datosArchivoDTO.getReferencia());
        //tnMovtoConceptoPagoDTO.setMcpFecIncidencia(new Date(datosArchivoDTO.getFechaIncidencia() ) );
        tnMovtoConceptoPagoDTO.setMcpFecIncidencia(datosArchivoDTO.getFechaIncidencia() == null ? new Date() : fechaIncidencia );
        //tnMovtoConceptoPagoDTO.setMcpMonto(datosArchivoDTO.getImporte());
         tnMovtoConceptoPagoDTO.setMcpMonto( datosArchivoDTO.getImporte() == null ? new Double(0) : datosArchivoDTO.getImporte() );
        double porcent=datosArchivoDTO.getPorcentaje()==null?0:datosArchivoDTO.getPorcentaje();
        tnMovtoConceptoPagoDTO.setMcpPorcentaje((float)porcent);
        Integer qnaCaptura =  datosArchivoDTO.getQna() == null ? getQuincenaCaptura().intValue() : Integer.valueOf(datosArchivoDTO.getQna());
        tnMovtoConceptoPagoDTO.setMcpQnaIni(qnaCaptura);
        tnMovtoConceptoPagoDTO.setMcpQnaFin(Integer.parseInt(datosArchivoDTO.getQnaFin() == null ? "0" : datosArchivoDTO.getQnaFin()));
        tnMovtoConceptoPagoDTO.setMcpQnaADescontar(Integer.parseInt(datosArchivoDTO.getNumQuincenas() == null ? "0" : datosArchivoDTO.getNumQuincenas()));
        tnMovtoConceptoPagoDTO.setIdTipoCpto(tipoConcepto);
        tnMovtoConceptoPagoDTO.setMcpUltQnaProcesa(Integer.valueOf(0));
        tnMovtoConceptoPagoDTO.setMcpQnaAplicadas(Integer.valueOf(0));
        tnMovtoConceptoPagoDTO.setMcpQnaCancelo(null);
        tnMovtoConceptoPagoDTO.setMcpMontoAdeudo(0.0);
        tnMovtoConceptoPagoDTO.setMcpFecIniAdeudo(null);
        tnMovtoConceptoPagoDTO.setMcpFecFinAdeudo(null);
        tnMovtoConceptoPagoDTO.setMcpQnasAdeudo(null);
        tnMovtoConceptoPagoDTO.setFecModifico(new Date());
        tnMovtoConceptoPagoDTO.setMcpQnaCaptura(getQuincenaCaptura().intValue());
        tnMovtoConceptoPagoDTO.setUsuario(super.identity().get().getUserID());
        return tnMovtoConceptoPagoDTO;
    }


    /**
     * convierte DatosArchivoDTO a TdCaptCptoErrDTO
     * @param numError
     * @param datosArchivoDTO
     * @param IdTercero
     * @return TdCaptCptoErrDTO
     */ 
    private TdCaptCptoErrDTO convertToTdCaptCptoErrDTO(int numError, DatosArchivoDTO datosArchivoDTO, String IdTercero) {
        String tipoConcepto = null;
        if(datosArchivoDTO.getTipoConcepto().equalsIgnoreCase("P")){ tipoConcepto = super.configuration().getString("terceros", "TIPO_CONCEPTO_PERCEPCION");      }
        else if(datosArchivoDTO.getTipoConcepto().equalsIgnoreCase("D")) {   tipoConcepto= super.configuration().getString("terceros", "ID_TIPO_CONCEPTO_DEDUCCION");   }
        else if(datosArchivoDTO.getTipoConcepto().equalsIgnoreCase("C")) {   tipoConcepto= super.configuration().getString("terceros", "ID_TIPO_CONCEPTO_CONTROL");     }
        else if(datosArchivoDTO.getTipoConcepto().equalsIgnoreCase("U")) {   tipoConcepto= super.configuration().getString("terceros", "ID_TIPO_CONCEPTO_REFERENCIA_CALCULO");      }
        
        
        QnaCapturaDTO quincenaCaptura = getQuincenaCaptura();
        
        TdCaptCptoErrDTO tdCaptCptoErrDTO = new TdCaptCptoErrDTO();
        tdCaptCptoErrDTO.setIdDepEnv(IdTercero);
        tdCaptCptoErrDTO.setIdError(numError);
        tdCaptCptoErrDTO.setCceRfc(datosArchivoDTO.getRfc());
        tdCaptCptoErrDTO.setIdTipoCpto(tipoConcepto);
        tdCaptCptoErrDTO.setIdConcepto(datosArchivoDTO.getConcepto());
       
        tdCaptCptoErrDTO.setCceQnaCapt(quincenaCaptura.intValue());
        tdCaptCptoErrDTO.setCceReferen(datosArchivoDTO.getReferencia());
        tdCaptCptoErrDTO.setCceMonto(datosArchivoDTO.getImporte());
        double pporcentaje=datosArchivoDTO.getPorcentaje() == null ? 0.0 : datosArchivoDTO.getPorcentaje();
        tdCaptCptoErrDTO.setCcePorcen((float)pporcentaje);
        tdCaptCptoErrDTO.setCceQnaIni(datosArchivoDTO.getQna() == null? quincenaCaptura.intValue():Integer.valueOf(datosArchivoDTO.getQna()) );
        tdCaptCptoErrDTO.setCceQnaFin(Integer.parseInt(datosArchivoDTO.getQnaFin() == null ? "0" : datosArchivoDTO.getQnaFin()));
        tdCaptCptoErrDTO.setCceNombre(null);
        tdCaptCptoErrDTO.setUsuario(super.identity().get().getUserID());
        tdCaptCptoErrDTO.setFecModifico(new Date());

        return tdCaptCptoErrDTO;
    }

    /**
     * pasa informacion de FonacotDTO a DatosArchivoDTO
     * @param pDatosDTO lista de datos FonacotDTO
     * @return una lista de DatosArchivoDTO
     */
    public  List<DatosArchivoDTO>  convertFonacotDTOToDatosArchivoDTO( List pDatosDTO){
        //List<FonacotDTO> listaFonacotDTO = ( List<FonacotDTO>)pDatosDTO;
         List<FonacotDTO> listaFonacotDTO =  super.transformation().map(pDatosDTO,FonacotDTO.class);
        List<DatosArchivoDTO> listaDatosDTO = new ArrayList<DatosArchivoDTO>();
        DatosArchivoDTO datosDTO = null;
        String rfc="";
        double monto=0.0;
        String cptoFonacot=super.configuration().getString("terceros", "CPTO_FONACOT") ;
        String tipoMovtoFonavot=super.configuration().getString("terceros", "TIPO_MOVTO_FONACOT") ;
        QnaCapturaDTO quincenaCaptura = getQuincenaCaptura();
        Integer anio = Integer.valueOf(quincenaCaptura.getAnio());
        Integer quincena =  Integer.valueOf(quincenaCaptura.getQuincena());
        QnaCapturaDTO quincenaFin = new QnaCapturaDTO(quincena==24?anio+1:anio,quincena==24?1:quincena+1);
        
        int tama = listaFonacotDTO.size() - 1;
        String frc = listaFonacotDTO.get(tama).getRfc();
        
        if(listaFonacotDTO.size() > 0){
            if(listaFonacotDTO.size() == 1){
                    int cifras = (int) Math.pow(10,2); monto = Math.rint(monto*cifras)/cifras; 
                    datosDTO = new DatosArchivoDTO(); datosDTO.setRfc(listaFonacotDTO.get(0).getRfc()); 
                    datosDTO.setImporte(listaFonacotDTO.get(0).getRetencionMes()); datosDTO.setReferencia(listaFonacotDTO.get(0).getNoCredito());
                    datosDTO.setQna(quincenaCaptura.toString()); datosDTO.setQnaFin(quincenaFin.toString()); 
                    datosDTO.setConcepto(cptoFonacot); datosDTO.setTipoMovimiento(tipoMovtoFonavot); 
                    listaDatosDTO.add(datosDTO); }
                    
            if(listaFonacotDTO.size() > 1){
                rfc = listaFonacotDTO.get(0).getRfc();
                monto = listaFonacotDTO.get(0).getRetencionMes();
                for(int i = 1; i < listaFonacotDTO.size(); i++){
                    if(listaFonacotDTO.get(i).getRfc().equalsIgnoreCase(rfc) && i < listaFonacotDTO.size() - 1){ 
                        monto += listaFonacotDTO.get(i).getRetencionMes(); rfc = listaFonacotDTO.get(i).getRfc(); }
                        
                    if(listaFonacotDTO.get(i).getRfc().equalsIgnoreCase(rfc) && i == listaFonacotDTO.size() - 1){ 
                        monto += listaFonacotDTO.get(i).getRetencionMes(); int cifras = (int) Math.pow(10,2); 
                        monto = Math.rint(monto*cifras)/cifras; datosDTO = new DatosArchivoDTO(); datosDTO.setRfc(rfc); 
                        datosDTO.setImporte(monto); datosDTO.setReferencia(listaFonacotDTO.get(i).getNoCredito()); 
                        datosDTO.setQna(quincenaCaptura.toString()); datosDTO.setQnaFin(quincenaFin.toString()); 
                        datosDTO.setConcepto(cptoFonacot); datosDTO.setTipoMovimiento(tipoMovtoFonavot); 
                        listaDatosDTO.add(datosDTO); }
                        
                    if(!listaFonacotDTO.get(i).getRfc().equalsIgnoreCase(rfc) && i < listaFonacotDTO.size() - 1){
                        int cifras = (int) Math.pow(10,2);monto = Math.rint(monto*cifras)/cifras;
                        datosDTO = new DatosArchivoDTO(); datosDTO.setRfc(rfc); datosDTO.setImporte(monto); 
                        datosDTO.setReferencia(listaFonacotDTO.get(i).getNoCredito()); datosDTO.setQna(quincenaCaptura.toString()); 
                        datosDTO.setQnaFin(quincenaFin.toString()); datosDTO.setConcepto(cptoFonacot); datosDTO.setTipoMovimiento(tipoMovtoFonavot); 
                        listaDatosDTO.add(datosDTO); rfc = listaFonacotDTO.get(i).getRfc(); monto = listaFonacotDTO.get(i).getRetencionMes(); }
                        
                    if(!listaFonacotDTO.get(i).getRfc().equalsIgnoreCase(rfc) && i == listaFonacotDTO.size() - 1){
                        int cifras = (int) Math.pow(10,2);monto = Math.rint(monto*cifras)/cifras;
                        datosDTO = new DatosArchivoDTO(); datosDTO.setRfc(rfc); datosDTO.setImporte(monto); 
                        datosDTO.setReferencia(listaFonacotDTO.get(i).getNoCredito()); datosDTO.setQna(quincenaCaptura.toString()); 
                        datosDTO.setQnaFin(quincenaFin.toString()); datosDTO.setConcepto(cptoFonacot); datosDTO.setTipoMovimiento(tipoMovtoFonavot); 
                        listaDatosDTO.add(datosDTO); 
                        
                        datosDTO = new DatosArchivoDTO(); datosDTO.setRfc(listaFonacotDTO.get(listaFonacotDTO.size()-1).getRfc());
                        datosDTO.setImporte(Math.rint(((listaFonacotDTO.get(listaFonacotDTO.size()-1).getRetencionMes())*cifras) / cifras ));
                        datosDTO.setReferencia(listaFonacotDTO.get(listaFonacotDTO.size()-1).getNoCredito());
                        datosDTO.setQna(quincenaCaptura.toString()); datosDTO.setQnaFin(quincenaFin.toString());
                        datosDTO.setConcepto(cptoFonacot); datosDTO.setTipoMovimiento(tipoMovtoFonavot); 
                        listaDatosDTO.add(datosDTO); }
                }
            }
        }
        return listaDatosDTO;
    }
    


    /**
     * Inserta registro de concepto en la tabla de errores
     * @param numError
     * @param datosArchivoDTO
     * @param IdTercero
     */
/*    public void saveCptoError(int numError, DatosArchivoDTO datosArchivoDTO, 
                               String IdTercero) {
        TdCaptCptoErrDTO tdCaptCptoErrDTO =  convertToTdCaptCptoErrDTO(numError, datosArchivoDTO, IdTercero);
        TdCaptCptoErr tdCaptCptoErr = super.transformation().map(tdCaptCptoErrDTO, TdCaptCptoErr.class);
       // super.persistence().get(TdCaptCptoErrDAO.class).save(tdCaptCptoErr);

    }*/

    /**
     * Consulta por idTercero
     * @param IdTercero
     * @return  TcTerceroDTO
     */
    public TcTerceroDTO getByIdTercero(String IdTercero) {
        TcTercero tercero = super.persistence().get(TcTerceroDAO.class).getById(IdTercero);
        TcTerceroDTO tcTerceroDTO = super.transformation().map(tercero, TcTerceroDTO.class);
        return tcTerceroDTO;
    }
    
    
    
    /**
     * borra el archivo temporal del repositorio
     * @param cargaArchivoDTO
     */
    private void deleteFlatFile(CargaArchivoDTO cargaArchivoDTO){
        String ruta =  super.configuration().getString("local.temp.dir") ;
        File file = null;
        try {
            file = new File(ruta + diagonal+cargaArchivoDTO.getFileName());
        } catch (Exception e) {
             e.printStackTrace();
        }
        if(file.exists()){
            file.delete();
        }
    }

/**
     * valida si el numero de quincena sea non
     * @return true si el numero de quincena es non , de lo contrario false
     */
    public  boolean isQuincenaNon() {
        QnaCapturaDTO quincenaCaptura = getQuincenaCaptura();
        if (Integer.valueOf(quincenaCaptura.getQuincena())%2==0){
            return false;
        }else{
            return true;
     }
    }
    
    
    /**
     * carga las constantes en ConstTerceroDTO
     * @return ConstTerceroDTO
     */
    public ConstTerceroDTO cargaCosntanates(){
        ConstTerceroDTO constTerceroDTO=new ConstTerceroDTO( super.configuration().getString("terceros", "FOVISSSTE") ,
                super.configuration().getString("terceros", "ID_ISSSTE") ,
                super.configuration().getString("terceros", "VIGENTE") ,
                super.configuration().getString("terceros", "LICENCIA") ,
               super.configuration().getString("terceros", "PREVENTIVA") ,
               super.configuration().getString("terceros", "ALTA") ,
               super.configuration().getString("terceros", "CAMBIO") ,
               super.configuration().getString("terceros", "BAJA") ,
               super.configuration().getString("terceros", "ALTA_TIPO_MOVTO") ,
               super.configuration().getString("terceros", "CAMBIO_TIPO_MOVTO") ,
               super.configuration().getString("terceros", "MOD_TIPO_MOVTO") ,
               super.configuration().getString("terceros", "ALTA_ISSSTE") ,
                super.configuration().getString("terceros", "CAMBIO_ISSSTE") ,
               super.configuration().getString("terceros", "MOD_ISSSTE")
        );
        return constTerceroDTO;
    }
    
    /**
     * obtiene el nombre del archivo de fovissste para usarlo como referencia
     * @param fileName
     * @return  nombre del archivo
     */
    private String getReferenciaFovi(String fileName){
        String[] array;
        String numero="";
        if(fileName.indexOf("_")!=-1){
                array = fileName.split("_");
        }else{
                array= fileName.split("\\.");
        }
        numero=array[0].replaceFirst("e", "e ");
        numero=numero.replaceFirst("l", "L");
        return numero;
    }

    /**
     * Metodo que invoca la consulta de archivos en la tabla TN_NOMINA por idNomina
     * @author Gualberto G.
     * @param idNomina
     * @param file
     * @return
     */
    public Blob getFile(int idNomina, String file) {
        Map<String, Object> blobs = super.persistence().get(CustomTnNominaDao.class).getTnNominaBlobById(idNomina);
        Blob blob = (Blob) blobs.get(file) ;
        return blob;
    }
    
    

    /**
     * GENERAR EL PAQUETE XML PARA SU ENVIO AL SAT
     * @Autor MARTIN C.
     */
     
    public void processSatGenerarPaquteXml(String roothPath, String idQna, Integer hpQnaPago, String version, String usuario){
        NominaDTO nominaDTO = super.getService(GestionNominaService.class).getNominaById(Integer.valueOf(idQna));
        nominaDTO.setCnPaquete(nominaDTO.getCnPaquete() != null ? nominaDTO.getCnPaquete() + 1 : 1);
        
        List<DatosXMLAnexo20DTO> listaPagos = pagosPorNomina(new Integer(idQna));
        List<String> listCadenaOriginal = new ArrayList<String>(listaPagos.size());
        String urlNombreFolder = super.configuration().getString("local.temp.dir") + File.separator + idQna;
        
        File folder = null;


        try {
            folder = new File(urlNombreFolder);
            folder.mkdir();
        } catch (Exception e) {
            throw new ServiceException("Error: " + e.getMessage());
        }

       String zipPackXmlAnexo20 = processSatEmpaquetarXmlAnexo20(idQna, hpQnaPago,listaPagos,usuario ,roothPath, nominaDTO.getCnPaquete(), listCadenaOriginal,getSellador());
       //saveFilesCadenas(zipPackXmlAnexo20, new Integer(idQna), listCadenaOriginal, hpQnaPago, nominaDTO);
       nominaDTO.setNomRefTimbrado("V");
       super.getService(GestionNominaService.class).updateNominaCompleta(nominaDTO);
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
        comprobante.setCertificado(certificado);
        
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
    

    private Signature getSellador(){
        File p12File = new File(super.configuration().getString("timbrado.dir") + File.separator + super.configuration().getString("timbrado", "SIREH_TIMBRADO_CSD_FILENAME_P12"));
        Signature firma = null;
        java.security.KeyStore keyStore = null;

        try {
            String pass = super.configuration().getString("timbrado", "SIREH_TIMBRADO_CSD_PASS");
            String keyAlias = "";

            FileInputStream fis;
            fis = new FileInputStream(p12File);
            BufferedInputStream bis = new BufferedInputStream(fis);

            keyStore = getKeyStore(bis);
            Enumeration aliases;
            aliases = keyStore.aliases();

            while (aliases.hasMoreElements()) {
                keyAlias = (String)aliases.nextElement();
            }
            PrivateKey pk = (PrivateKey) keyStore.getKey(keyAlias, pass.toCharArray()); 
            firma = Signature.getInstance("SHA256withRSA"); 
            firma.initSign(pk); 
            bis.close();
        } catch (KeyStoreException e) {
            throw new ServiceException("Error: " + e.getMessage());
        } catch (NoSuchAlgorithmException e) {
            throw new ServiceException("Error: " + e.getMessage());
        } catch (UnrecoverableKeyException e) {
            throw new ServiceException("Error: " + e.getMessage());
        } catch (InvalidKeyException e) {
            throw new ServiceException("Error: " + e.getMessage());
        } catch (FileNotFoundException e) {
            throw new ServiceException("Error: " + e.getMessage());
        } catch (IOException e) {
            throw new ServiceException("Error: " + e.getMessage());
        }
        return firma;
    }
    
    

    String getComprobanteXML(gob.shcp.sireh.model.sat.cfdi.v33.Comprobante comprobante, 
                             String roothPath, int idNomina) {

        try {
            String urlNombreFolder = super.configuration().getString("local.temp.dir") + File.separator + idNomina;
            String docsPath = roothPath + "WEB-INF/docs/esquemas/n12a33/";

            File folder = new File(urlNombreFolder);
            if (!folder.exists()) {
                folder.mkdir();
            }
            String sFile = urlNombreFolder + File.separator + comprobante.getFolio() + ".xml";
            File file = new File(sFile);
            OutputStream os = new FileOutputStream(urlNombreFolder + File.separator + comprobante.getFolio() + ".xml");

            JAXBContext jaxbContext = JAXBContext.newInstance(gob.shcp.sireh.model.sat.cfdi.v33.Comprobante.class, gob.shcp.sireh.model.sat.nomina.v12.Nomina.class);
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
            jaxbMarshaller.setProperty("com.sun.xml.bind.namespacePrefixMapper", new CfdiNsMap());
            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            jaxbMarshaller.setProperty(Marshaller.JAXB_SCHEMA_LOCATION, "http://www.sat.gob.mx/cfd/3 http://www.sat.gob.mx/sitio_internet/cfd/3/cfdv33.xsd" + 
                                       " http://www.sat.gob.mx/nomina12 http://www.sat.gob.mx/sitio_internet/cfd/nomina/nomina12.xsd");

            jaxbMarshaller.marshal(comprobante, os);
            //jaxbMarshaller.marshal(comprobante, System.out);

            FileInputStream fis = new FileInputStream(file);
            String xml = IOUtils.toString(fis);

            os.flush();
            os.close();
            fis.close();
            return sFile;
        } catch (JAXBException e) {
            throw new ServiceException("Error: " + e.getMessage());
        } catch (FileNotFoundException fe) {
            throw new ServiceException("Error: " + fe.getMessage());
        } catch (IOException io) {
            throw new ServiceException("Error: " + io.getMessage());
        }

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
    
    public boolean valida(String cfdv_xsd, String nom_xsd, String xmlFile){
        boolean correcto = false;
        File cfdvXsd1File = new File(cfdv_xsd);
        File nomXsdFile   = new File(nom_xsd);
        
        try {
            //SchemaFactory factory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
            SchemaFactory factory = SchemaFactory.newInstance("http://www.w3.org/2001/XMLSchema");
            Schema schema = factory.newSchema(new Source[] { new StreamSource(cfdvXsd1File), new StreamSource(nomXsdFile) } );
            Validator validator = schema.newValidator();
            validator.validate(new StreamSource(xmlFile));
            correcto = true;
       }
       catch(Exception ex){
          ex.printStackTrace();
           correcto = false;
       }
       return correcto;
   }
    
    
    /**
     * CONSULTA LOS CONCEPTOS PAGADOS A CADA EMPLEADO EN LA NOMINA
     * @Autor MARTIN C.
     */
    public List<DatosXMLAnexo20DTO> pagosPorNomina(Integer idNomina){
        List<CustomTnHistoricoPagoXML>      historicoPagoDomain;
        List<CustomTnConceptoPagadoXML>     conceptosPagadosDomain;
        List<DatosXMLAnexo20DTO>            listaXML    = new ArrayList<DatosXMLAnexo20DTO>();
        DependenciaDTO                      patron      = new DependenciaDTO();
        DatosXMLAnexo20DTO                  pago        = null;
        
        historicoPagoDomain     =  super.persistence().get(QueryTnComprobanteDigDAO.class).getHistoricoPagoAnexo20ByIdNomina(idNomina);
        conceptosPagadosDomain  =  super.persistence().get(QueryTnComprobanteDigDAO.class).getConceptosPagadosAnexo20ByIdNomina(idNomina);
        
        List<CustomTnHistoricoPagoXMLDTO>    historicoPago      = super.transformation().map(historicoPagoDomain, CustomTnHistoricoPagoXMLDTO.class);
        List<CustomTnConceptoPagadoXMLDTO>   conceptosPagados   = super.transformation().map(conceptosPagadosDomain, CustomTnConceptoPagadoXMLDTO.class);
        
        for(CustomTnHistoricoPagoXMLDTO dato : historicoPago){
            pago = new DatosXMLAnexo20DTO();
            
            pago.setVersion( patron.getVersion33() );
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
     
    public CustomTnComprobanteDig getComprobanteDigital(gob.shcp.sireh.model.sat.cfdi.v33.Comprobante comprobante, String cadenaOriginal, String xmlGenerado, Integer cnPaquete, String usuario) {
        CustomTnComprobanteDig customTnComprobanteDig = new CustomTnComprobanteDig();
        
        customTnComprobanteDig.setCnPaquete(cnPaquete);
        customTnComprobanteDig.setCnFolio( new Long(comprobante.getFolio()));
        customTnComprobanteDig.setCnDifFolio(9);
        customTnComprobanteDig.setCnConsecNomina(new Integer(comprobante.getSerie()));
        customTnComprobanteDig.setCnEjercicio(SirehUtils.getCurrentYear());
        customTnComprobanteDig.setCnRfc(comprobante.getReceptor().getRfc());
//        customTnComprobanteDig.setCnSituacion("V");
        customTnComprobanteDig.setCnFechaGenerado(new Date());
        customTnComprobanteDig.setUsuario(usuario);
        customTnComprobanteDig.setFecModifico(new Date());
        customTnComprobanteDig.setCnCadenaOriginal(cadenaOriginal);
        customTnComprobanteDig.setCnXmlGenerado(xmlGenerado);

        return customTnComprobanteDig;
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
    
    private List<ConceptoPagoXMLAnexo20DTO> transformCptos(List<CustomTnConceptoPagadoXML> listcpto ){
        List<ConceptoPagoXMLAnexo20DTO> list = new ArrayList<ConceptoPagoXMLAnexo20DTO>();
        for(CustomTnConceptoPagadoXML dao: listcpto){
            ConceptoPagoXMLAnexo20DTO cpto = new ConceptoPagoXMLAnexo20DTO();
            cpto.setCveCptoNom(dao.getIdCptoPago() );
            cpto.setCveCptoTimbrado(dao.getCveSat());
            cpto.setDescripcionCpto(dao.getDescripcion());
            cpto.setMontoCpto(dao.getMonto().setScale(2, RoundingMode.CEILING));
            cpto.setNumCpto(dao.getNumConcepto());
            cpto.setTieneIsr(dao.getTieneIsr());
            cpto.setTipoCptoNom(dao.getTipoCpto().trim());
            cpto.setMontoGravado(new BigDecimal(0));
            cpto.setMontoExento(new BigDecimal(0));
            list.add(cpto);
        }
        
        return list;
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
    
    public String getSelloDigital(String cadenaOriginal, Signature firma) {
        String selloDigital = null;
        try {

            firma.update(cadenaOriginal.getBytes("UTF-8"));
            BASE64Encoder b64 = new BASE64Encoder();
            selloDigital = b64.encode(firma.sign());
        } catch (UnsupportedEncodingException e) {
            selloDigital = " ";
            throw new ServiceException("Error: " + e.getMessage());
        } catch (GeneralSecurityException e) {
            selloDigital = " ";
            throw new ServiceException("Error: " + e.getMessage());
        }
        return selloDigital.replaceAll("[\n\r]", "");
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
    
    public static XMLGregorianCalendar getXMLGregorianCalendarNow() {
        DateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
        XMLGregorianCalendar now = null;
        Date date = new Date();

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
    
    private String nombre(CustomTnHistoricoPagoXMLDTO emp){
        return emp.getPrimerApellido().trim().replace(".", " ") + " " + 
            emp.getSegundoApellido().trim().replace(".", " ") + " " + 
            emp.getNombreEmpleado().trim().replace(".", " ");  
    }
    
    public BigDecimal salarioDiario(List<ConceptoPagoXMLAnexo20DTO> cptos, Integer diasPagados ){
        BigDecimal valor  = new BigDecimal(0);
        BigDecimal totPer = new BigDecimal(0);
        if(!cptos.isEmpty()){
            for(ConceptoPagoXMLAnexo20DTO c :  cptos){
                if(c.getTipoCptoNom().equals("P")) {
                    if(c.getCveCptoNom().equals("007") || c.getCveCptoNom().equals("002") || c.getCveCptoNom().equals("005") || c.getCveCptoNom().equals("077")){
                        totPer = totPer.add(c.getMontoCpto());
                    }
                }
            }
            valor = totPer.divide(new BigDecimal(diasPagados),2,RoundingMode.CEILING);
        }
        return valor;
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
    
    
    private String processSatEmpaquetarXmlAnexo20( String idNomina, Integer hpQnaPago,List<DatosXMLAnexo20DTO> listaPagos,String usuario, String roothPath,Integer cnPaquete, List<String> listCadenaOriginal,Signature sellador){
        String folder       = idNomina;
        String rootPath     = super.configuration().getString("local.temp.dir") + File.separator + folder;
        
        String fileXmlFinal = rootPath + File.separator + hpQnaPago + "_paqueteXmlAnexo20_" + idNomina + ".xml";
        
        String nameFileXml = hpQnaPago + "_paqueteXmlAnexo20_" + idNomina + ".xml";
        String nameFileZip = rootPath + File.separator + hpQnaPago + "_paqueteXmlAnexo20_" + idNomina + ".zip";
        
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

            String encoding = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>";
            String certificado = getCertificado();
            gob.shcp.sireh.model.sat.cfdi.v33.Comprobante comprobante = null;
            StringWriter xmlCmp = new StringWriter();
            List<ComponenteXmlDTO> listComponent = new ArrayList<ComponenteXmlDTO>(listaPagos.size());
            List <CustomTnComprobanteDig> listaCustomTnComprobanteDig = new ArrayList<CustomTnComprobanteDig>(50);
            
            System.out.println("Generando xml por lista de pago");
            for (DatosXMLAnexo20DTO pago: listaPagos) {
                comprobante = getComprobante(pago, certificado);

                jaxbMarshaller.marshal(comprobante, xmlCmp);


                String cadenaOriginal =null;
                cadenaOriginal = getCadenaOriginal(cadenaOriginal,xmlCmp,transformerElement );

                listCadenaOriginal.add(cadenaOriginal);
                 // genera sello digital 
                 comprobante.setSello(getSelloDigital(cadenaOriginal, sellador));

                 xmlCmp.getBuffer().setLength(0);
                 xmlCmp.getBuffer().trimToSize();
                jaxbMarshaller.marshal(comprobante, xmlCmp);

                CustomTnComprobanteDig customTnComprobanteDig= getComprobanteDigital(comprobante, cadenaOriginal,xmlCmp.toString(),  cnPaquete,  usuario);
                listaCustomTnComprobanteDig.add(customTnComprobanteDig);
                if ((listaCustomTnComprobanteDig.size() % 50) == 0 || listaPagos.size() == contador) {
                    super.persistence().get(CustoTnComprobanteDigDAO.class).insertTnComprobanteDig(listaCustomTnComprobanteDig);
                    listaCustomTnComprobanteDig.removeAll(listaCustomTnComprobanteDig);
                    listaCustomTnComprobanteDig = null;
                    listaCustomTnComprobanteDig = new ArrayList<CustomTnComprobanteDig>(50);
                }

                listComponent.add(new ComponenteXmlDTO(new Long(pago.getFolio()),xmlCmp.toString().replace(encoding,"")));
                xmlCmp.getBuffer().setLength(0);
                xmlCmp.getBuffer().trimToSize();

                contador++;
                comprobante=null;
            }    
            System.out.println("Finaliza generacion xml por lista de pago");
            
            System.out.println("Empaquetando en xml");
            contador = 1;
            DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
            Document doc= docBuilder.newDocument();
            
            Element rootElement = doc.createElement("PaqueteNomina");
            rootElement.setAttribute("xmlns", "http://www.sat.gob.mx/Nomina/Paquete");
            rootElement.setAttribute("id", super.configuration().getString("timbrado", "SIREH_TIMBRADO_RFC_SHCP") + "_" + hpQnaPago.toString().substring(0,4) + "_NOMID_" + idNomina);
            rootElement.setAttribute("totalregs", String.valueOf(listaPagos.size() ));
            doc.appendChild(rootElement);
            
            for(ComponenteXmlDTO xmlSCdata: listComponent){
                 Element paquete = doc.createElement("ControlComprobante");
                 paquete.setAttribute("Num", String.valueOf(contador));
                 paquete.setAttribute("id", idNomina + "_" +  xmlSCdata.getCnFolio()  );
                 rootElement.appendChild(paquete);
                
                 Element xml = doc.createElement("xmlComp");
                
                 CDATASection cdata =  doc.createCDATASection(xmlSCdata.getXml());
                 
                 xml.appendChild(cdata);
                 paquete.appendChild(xml);
                xmlSCdata = null;
                 contador++;
            }
            System.out.println("Finaliza Empaquetado en xml");
            
                TransformerFactory transformerFactory = TransformerFactory.newInstance();
                
                Transformer transformer = transformerFactory.newTransformer();
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
            throw new ServiceException("Error: " + e.getMessage());
        } catch (JAXBException e) {
            throw new ServiceException("Error: " + e.getMessage());
        } catch (TransformerException e) {
            throw new ServiceException("Error: " + e.getMessage());
        }
        return nameFileZip;
    }
    
    
    public void saveFilesZipOnTnNomina(String zipPackXmlAnexo20, Integer idNomina, List<String> listCadenaOriginal, Integer hpQnaPago, NominaDTO nominaDTO){
        String folder = idNomina.toString() ;
        String roothPath = super.configuration().getString("local.temp.dir");
        
        String nomArchCadOriginalTxt = hpQnaPago + "_cadenaOriginal_" + idNomina + ".txt";
        String nomArchCadOriginalZip = hpQnaPago + "_cadenaOriginal_" + idNomina + ".zip";
        
        BufferedWriter bw = null;
        String fileNameRandomCadOrig = UUID.randomUUID().toString();
        String auxCdTxt =  fileNameRandomCadOrig;
        String cdTxt =  auxCdTxt + ".txt";
        
        logger.debug(" ********* creacion del archivo txt de validacion  ********* ");

        try {
            bw = new BufferedWriter(new FileWriter(new File(roothPath + File.separator +
                                            folder + File.separator +
                                            nomArchCadOriginalTxt), true));

            for (String cadenaOriginal: listCadenaOriginal) {
                bw.write(cadenaOriginal);
                bw.newLine();
            }
        } catch (IOException e) {
            throw new ServiceException("Error: " + e.getMessage());
        } finally {
            try {
                bw.close();
            } catch (Exception e) {
                throw new ServiceException("Error: " + e.getMessage());
            }
        }

            // Salvar el archivo cadena original en la base de datos
        logger.debug(" ********** compresion del archivo txt de validacion ********** ");
        
        Map<String, String> map = new HashMap<String, String>();
        map.put(roothPath + File.separator + folder + File.separator + nomArchCadOriginalTxt, nomArchCadOriginalTxt);
        zipFile(map, roothPath + File.separator + folder + File.separator + nomArchCadOriginalZip);
        
        logger.debug("*************  salvar los zip (validacion y anexo20) en la tabla tn_nomina  ************");
        
        File fileXmlAnexo20Zip = new File(roothPath + File.separator + folder + File.separator + nomArchCadOriginalZip);
//        File fileCadenaOrigZip = new File(zipPackXmlAnexo20);
        
        try{
            byte[] byteCadOriginalTxtZip  = org.apache.commons.io.FileUtils.readFileToByteArray(fileXmlAnexo20Zip);
//            byte[] bytePaqXmlAnexo20Zip   = org.apache.commons.io.FileUtils.readFileToByteArray(fileCadenaOrigZip);
            nominaDTO.setNomFecCreacion(new Date());
            nominaDTO.setNomArchCreacion(byteCadOriginalTxtZip);
            nominaDTO.setNomFecAnexo20(new Date());
//            nominaDTO.setNomArchAnexo20(bytePaqXmlAnexo20Zip);
        } catch (IOException e) {
             throw new ServiceException("Error: " + e.getMessage());
        }
    }
    
    
    public void eliminaArchCarpetaTemporal(String roothPathCarpeta){
        File folder = new File(roothPathCarpeta);
        File[] archivos = folder.listFiles();
        for(File archivo : archivos){ 
            archivo.delete();
        }
        folder.delete();
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
    
    
    public List<String> descargaDescomprimeZipTimbrado(long idNomina, List<byte[]> listaArchivosZip, String localTempDir){
        
        List<String> listaNombreArchivos = new ArrayList<String>();
        String nomFolder = "" + idNomina;
        File folder = new File(localTempDir + File.separator + nomFolder);
        localTempDir = localTempDir + File.separator + nomFolder;
        for(byte[] file : listaArchivosZip){
        
        String nameZip = UUID.randomUUID().toString() + ".zip";
                
        String fileZip = localTempDir + File.separator + nameZip;

            if (!folder.exists()) {
                folder.mkdir();
            }

        byte[] buffer = new byte[4096];
        
        logger.debug("--------- DESCARGA EL ARCHIVO TIMBRADO -----------");
        
        try{
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            FileOutputStream fos = new FileOutputStream(new File(fileZip));
             
            baos.write(file);
            baos.writeTo(fos);
            
            baos.close();
            fos.close();

            } catch (IOException e) {
                throw new ServiceException("Error: " + e.getMessage());
            }

            logger.debug("------------ DESCOMPRME EL ARCHIVO TIMBRADO -----------");
        
        BufferedOutputStream bos = null;
        
        
        try{
            ZipEntry entry;
            ZipInputStream zis = new ZipInputStream(new BufferedInputStream(new FileInputStream(fileZip)));
            
            while((entry = zis.getNextEntry()) != null) {
                listaNombreArchivos.add(entry.getName());
                
                int count;
                // write the files to the disk
                FileOutputStream fos = new FileOutputStream(localTempDir + File.separator + entry.getName());
                bos = new BufferedOutputStream(fos);

                    while ((count = zis.read(buffer)) > 0) {
                        bos.write(buffer, 0, count);
                    }
                    bos.flush();
                }
            } catch (IOException e) {
                throw new ServiceException("Error: " + e.getMessage());
            }

            finally {
                try {
                    bos.flush();
                    bos.close();
                } catch (Exception e) {
                    throw new ServiceException("Error: " + e.getMessage());
                }
            }
        }
        

        return listaNombreArchivos;
    }
    
    
    public Map<String,byte[]> processSatPaqueteTimbradoSAT(String archivoPaquete, String archivoReporte, String archivoCancela, Integer idNomina, Integer cnPaquete, Integer cnPaqueteRv, String localTempDir, String usuario){
        Map<String,byte[]> mapaReportes = new HashMap<String,byte[]>();
        byte[] reporteBytes = null;
        byte[] reporteBytesZip = null;
        byte[] cencelaBytes = null;
        byte[] cencelaBytesZip = null;
        File fileCancela = new File(localTempDir + File.separator + "respuestaCancelacion.xml");
        String fileNameRandom = "informe" + ".txt";
        
        //NominaDTO nominaDTO = super.getService(GestionNominaService.class).getNominaById(Integer.valueOf(idNomina) );
        if(archivoReporte != null && archivoReporte.length() > 0 ){
            reporteBytes = procesarArchivoReporte(archivoReporte, idNomina, cnPaquete, cnPaqueteRv, usuario, localTempDir);
            if(reporteBytes != null){
                //Envía a zipear el archivo
                try {
                    reporteBytesZip = zipBytes(fileNameRandom, reporteBytes);
                    mapaReportes.put("archivoInforme", reporteBytesZip);
                } catch (IOException e) {
                     throw new ServiceException("Error: " + e.getMessage());
                }
                //nominaDTO.setNomArchTimbrado(reporteBytesZip);
            }
        }
        if(archivoPaquete != null && archivoPaquete.length() > 0){
            processSatArchivoPaquete(archivoPaquete, idNomina, cnPaquete, usuario, localTempDir);
            //nominaDTO.setNomRefTimbrado("T");
            //super.getService(GestionNominaService.class).updateNominaCompleta(nominaDTO);
        }
        
        if(archivoCancela != null && archivoCancela.length() > 0){
            FileInputStream fis;
            try {
                fis = new FileInputStream(fileCancela);
                cencelaBytes = IOUtils.toByteArray(fis);
                cencelaBytesZip = zipBytes("respuestaCancelacion.xml", cencelaBytes);
                //nominaDTO.setNomArchCanc(cencelaBytesZip);
                procesarArchivoCancela(archivoCancela, usuario, idNomina, localTempDir);
            } catch (FileNotFoundException e) {
                 throw new ServiceException("Error: " + e.getMessage());
            } catch (IOException e) {
                 throw new ServiceException("Error: " + e.getMessage());
            }
                 //nominaDTO.setNomRefTimbrado(null);
                 //super.getService(GestionNominaService.class).updateNominaCompleta(nominaDTO);
        }
        
        return mapaReportes;
    }

    private byte[] zipBytes(String filename, byte[] input) throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ZipOutputStream zos = new ZipOutputStream(baos);
        ZipEntry entry = new ZipEntry(filename);
        entry.setSize(input.length);
        zos.putNextEntry(entry);
        zos.write(input);
        zos.closeEntry();
        zos.close();
        return baos.toByteArray();
    }
    
    private byte[] procesarArchivoReporte(String reporte, Integer idNomina, Integer cnPaquete, Integer cnPaqueteRv, String usuario, String localTempDir){
        List<String> listaRechazados = new ArrayList<String>();
        StringBuilder stringBuilder = new StringBuilder();
        String FORMATO_FECHA = super.configuration().getString("utils", "FORMATO_FECHA") ;
        SimpleDateFormat dt = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat dm = new SimpleDateFormat(FORMATO_FECHA); 
        List<TnComprobanteDig> lista = new ArrayList<TnComprobanteDig>();
        try {
        String file = localTempDir + File.separator + idNomina + File.separator + reporte;
        DocumentBuilderFactory  dbFactory   = DocumentBuilderFactory.newInstance();
        DocumentBuilder         dBuilder    = dbFactory.newDocumentBuilder();
        org.w3c.dom.Document                doc         = dBuilder.parse(file);
        doc.getDocumentElement().normalize();
        NodeList nListRespuestaNomina = doc.getElementsByTagName("RespuestaNomina");
        for(int contador = 0; contador < nListRespuestaNomina.getLength(); contador++){
            Node nNode = nListRespuestaNomina.item(contador);
            if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                Element element = (Element) nNode;
                stringBuilder.append("****   I N F O R M E     D E     T I M B R A D O   ****").append(System.getProperty("line.separator")).append(System.getProperty("line.separator"));
                stringBuilder.append("Paquete: ").append(element.getAttribute("id")).append(System.getProperty("line.separator"));
                stringBuilder.append("Fecha: ").append( element.getAttribute("fecha") != null ? dm.format( dt.parse(element.getAttribute("fecha").substring(0, 10) )): "").append(System.getProperty("line.separator"));
            }
        }
        
        int rechazados = 0;
        int aceptados = 0;
        NodeList nListComprobante = doc.getElementsByTagName("Comprobante");
        
        for(int contador = 0; contador < nListComprobante.getLength(); contador++){
            Node nNode = nListComprobante.item(contador);
            if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                Element element = (Element) nNode;
                String estatus =element.getAttribute("estatus");
                if(estatus != null && !estatus.equals("0")){
                    
                    NodeList nListDetalles = element.getChildNodes();
                    String idIncidencia = null;
                    for(int i = 0; i < nListDetalles.getLength(); i++){
                        Node nNodeDetalle = nListDetalles.item(i);
                        if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                        Element elementDetalle = (Element) nNodeDetalle;
                            idIncidencia = elementDetalle.getAttribute("idIncidencia");
                        }
                    }
                    rechazados++;
                    listaRechazados.add("RFC: " + element.getAttribute("rfcReceptor") + " Detalle: " + element.getAttribute("detalle") + " IdIncidencia: " + idIncidencia + System.getProperty("line.separator"));
                    TnComprobanteDig tnComprobanteDig = new TnComprobanteDig();
                    tnComprobanteDig.setCnFolio(new Long( element.getAttribute("folio")));
                    tnComprobanteDig.setCnDifFolio(9);
                    tnComprobanteDig.setUsuario(usuario);
                    tnComprobanteDig.setFecModifico(new Date());
                    tnComprobanteDig.setCnPaquete(cnPaquete);
                    tnComprobanteDig.setCnIncidencia(idIncidencia);
                    
                    if(cnPaqueteRv != null){
                        tnComprobanteDig.setCnPaqueteRv(cnPaqueteRv + 1);
                    }
                    lista.add(tnComprobanteDig);
                } else {
                    aceptados++;
                }
            }
        }
        stringBuilder.append("Procesados: ").append(nListComprobante.getLength()).append(System.getProperty("line.separator"));
        stringBuilder.append("Aceptados ").append(aceptados).append(System.getProperty("line.separator"));
        stringBuilder.append("Rechazados ").append(rechazados).append(System.getProperty("line.separator"));
        if(listaRechazados.size() > 0){
            stringBuilder.append(System.getProperty("line.separator"));
            for(String rechazado : listaRechazados){
                stringBuilder.append(rechazado);
            }
        }
        
        } catch (ParseException e) {
            throw new ServiceException("Error: " + e.getMessage());
        } catch (ParserConfigurationException e) {
            throw new ServiceException("Error: " + e.getMessage());
        } catch (SAXException e) {
            throw new ServiceException("Error: " + e.getMessage());
        } catch (IOException e) {
            throw new ServiceException("Error: " + e.getMessage());
        }
        if(cnPaqueteRv != null){
            super.persistence().get(CustoTnComprobanteDigDAO.class).updateSituacionAndPaqueteRv(lista,"Z");
        } else {
            super.persistence().get(CustoTnComprobanteDigDAO.class).updateSituacionTnComprobanteDig(lista,"Z" );
        }
        return stringBuilder.toString().getBytes();
    }

    private void procesarArchivoCancela(String cancela, String usuario, 
                                        Integer idNomina, String localTempDir) {
        cancela = localTempDir + File.separator + idNomina + File.separator + cancela;
        TnNomina tnNomina = 
            super.persistence().get(TnNominaDAO.class).getById(Integer.valueOf(idNomina));
        try {
            DocumentBuilderFactory dbFactory = 
                DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder;

            dBuilder = dbFactory.newDocumentBuilder();

            Document doc;

            doc = dBuilder.parse(cancela);
            NodeList nList = doc.getElementsByTagName("Folios");
            Element eElement = null;
            Node nNode = null;
            String uuid = null;
            String estatusUUID = null;
            for (int contador = 0; contador < nList.getLength(); contador++) {
                nNode = nList.item(contador);

                if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                    eElement = (Element)nNode;

                    uuid = eElement.getElementsByTagName("UUID").item(0).getFirstChild().getNodeValue();
                    estatusUUID = eElement.getElementsByTagName("EstatusUUID").item(0).getFirstChild().getNodeValue();

                    if (estatusUUID != null && estatusUUID.equals("201")) {
                        List<CustomTnComprobanteDig> listaCustomTnComprobanteDig = null; //super.persistence().get(CustoTnComprobanteDigDAO.class).getTnComprobanteDigByUuid("F7233A5C-03C4-4E8F-AAED-5827C92B2AF1", tnNomina.getCnPaquete());
                        if (listaCustomTnComprobanteDig != null && !listaCustomTnComprobanteDig.isEmpty()) {
                            CustomTnComprobanteDig customTnComprobanteDig = listaCustomTnComprobanteDig.get(0);
//                            customTnComprobanteDig.setCnSituacion("C");
//                            super.persistence().get(CustoTnComprobanteDigDAO.class).save(customTnComprobanteDig);
                        }
                    }
                }
            }
        } catch (ParserConfigurationException e) {
             throw new ServiceException("Error: " + e.getMessage());
        } catch (SAXException e) {
             throw new ServiceException("Error: " + e.getMessage());
        } catch (IOException e) {
             throw new ServiceException("Error: " + e.getMessage());
        }
    }

    private void processSatArchivoPaquete(String archivoPaquete, Integer idNomina, Integer cnPaquete, String usuario, String localTempDir){
        
        Integer cnDifFolio   = 9;
        archivoPaquete = localTempDir + File.separator + idNomina + File.separator + archivoPaquete;
        
        String  folio           = null;
        String  rfc             = null;
        String  fechaTimbrado   = null;
        String  version         = null;
        String uuid = null;
        
        //NominaDTO nominaDTO = super.getService(GestionNominaService.class).getNomina(Integer.valueOf(idNomina));
        List<CustomTnComprobanteDig> listaCustomTnComprobanteDig = new ArrayList<CustomTnComprobanteDig>();
        logger.debug("----------------------------- Extrae al filesystem los xml del paquete ------------------------------- ");
        try {
            DocumentBuilderFactory  dbFactory   = DocumentBuilderFactory.newInstance();
            DocumentBuilder         dBuilder;
           
            dBuilder = dbFactory.newDocumentBuilder();
           
            Document                doc         = dBuilder.parse(archivoPaquete);
            doc.getDocumentElement().normalize();
            
            NodeList nList = doc.getElementsByTagName("ControlComprobante");
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer;
            transformer = transformerFactory.newTransformer();
            transformer.setOutputProperty(OutputKeys.OMIT_XML_DECLARATION, "yes");
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
            transformer.setOutputProperty(OutputKeys.ENCODING, "ISO-8859-1"); 
            transformer.setOutputProperty(OutputKeys.STANDALONE, "no");

            for(int contador = 0; contador < nList.getLength(); contador++){
                CustomTnComprobanteDig customTnComprobanteDig = new CustomTnComprobanteDig();
                Node nNode = nList.item(contador);
                
                if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                    Element eElement = (Element) nNode;
                                            
                    // -------------- Nodo comprobante sellado por el SAT -------------- /
                    Document comprobante;

                    comprobante = dBuilder.parse(new InputSource( new StringReader( eElement.getElementsByTagName("xmlComp").item(0).getFirstChild().getNodeValue())));
                
                comprobante.getDocumentElement().normalize();
                    
                    // --------------  Nodo principal ------------- /
                    NodeList rootNodes = comprobante.getElementsByTagName("cfdi:Comprobante");
                    Node rootNode = rootNodes.item(0);
                    Element rootElement = (Element) rootNode;
                        if(!rootElement.getAttribute("version").equals("")) 
                            version = rootElement.getAttribute("version");
                        if(!rootElement.getAttribute("Version").equals("")) 
                            version = rootElement.getAttribute("Version");
                        
                        if(!rootElement.getAttribute("Folio").equals(""))
                            folio = rootElement.getAttribute("Folio");
                        if(!rootElement.getAttribute("folio").equals(""))
                            folio = rootElement.getAttribute("folio");
                    
                    NodeList nListReceptor = rootElement.getElementsByTagName("cfdi:Receptor");
                    Node nReceptor = nListReceptor.item(0);
                    Element eReceptor = (Element) nReceptor;
                        if(!eReceptor.getAttribute("Rfc").equals(""))
                            rfc = eReceptor.getAttribute("Rfc");
                        if(!eReceptor.getAttribute("rfc").equals(""))
                            rfc = eReceptor.getAttribute("rfc");
                    
                    NodeList nListTimbre = comprobante.getElementsByTagName("tfd:TimbreFiscalDigital");
                    Node nNodeTimbre = nListTimbre.item(0);
                    if (nNodeTimbre.getNodeType() == Node.ELEMENT_NODE) {
                        Element eElementTimbre = (Element) nNodeTimbre;
                        fechaTimbrado = eElementTimbre.getAttribute("FechaTimbrado");
                        uuid = eElementTimbre.getAttribute("UUID");
                    }
                    //saveXmlCFDITimbrToTnComprDig(comprobante, folio, fechaTimbrado, usuario);
                    
                    // Document xml to File xml                    
                    DOMSource domSource = new DOMSource(comprobante);
                    StringWriter xmlCmp = new StringWriter();
                    
                    StreamResult result = new StreamResult(xmlCmp);
                        
                    transformer.transform(domSource, result);

                    if( uuid != null && uuid.length() > 0){
                        customTnComprobanteDig.setCnSituacion("T");
                        customTnComprobanteDig.setCnRefTimbrado(null);
                    } else {
                        customTnComprobanteDig.setCnPaqueteRv(customTnComprobanteDig.getCnPaqueteRv() != null ? customTnComprobanteDig.getCnPaqueteRv() + 1 : 1);
                        customTnComprobanteDig.setCnSituacion("Z");
                        customTnComprobanteDig.setCnRefTimbrado(null);
                    }
                    customTnComprobanteDig.setCnFolio(new Long( folio));
                    customTnComprobanteDig.setCnDifFolio(cnDifFolio);
                    customTnComprobanteDig.setCnPaquete(cnPaquete );
                    
                    customTnComprobanteDig.setCnFolioFiscal(uuid);
                    customTnComprobanteDig.setCnFolioRecibo(folio);
                    customTnComprobanteDig.setCnXmlTimbrado(xmlCmp != null ? xmlCmp.toString() : null );
                    SimpleDateFormat formatoEntrada = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
                    fechaTimbrado = fechaTimbrado.replace('T', ' ');

                        Date date;
                    try {
                        date = formatoEntrada.parse(fechaTimbrado);
                    } catch (ParseException e) {
                         throw new ServiceException("Error: " + e.getMessage());
                    }
                    customTnComprobanteDig.setCnFecRespuesta(date);

                    customTnComprobanteDig.setFecModifico(new Date());
                    customTnComprobanteDig.setUsuario(usuario);
                    listaCustomTnComprobanteDig.add(customTnComprobanteDig);
                }
            }
        } catch (SAXException e) {
            throw new ServiceException("Error: " + e.getMessage());
        } catch (IOException e) {
            throw new ServiceException("Error: " + e.getMessage());
        } catch (ParserConfigurationException e) {
            throw new ServiceException("Error: " + e.getMessage());
        } catch (TransformerConfigurationException e) {
            throw new ServiceException("Error: " + e.getMessage());
        } catch (TransformerException e) {
            throw new ServiceException("Error: " + e.getMessage());
        }

             // --------------- actualiza campos clob de tn_comprobante_dig ------------------
             super.persistence().get(CustoTnComprobanteDigDAO.class).updateTimbradoTnComprobanteDig(listaCustomTnComprobanteDig);
        listaCustomTnComprobanteDig = null;
        // Aviso de terminacion del proceso
        
    }
    
    
    
    
    

    
    public String numeroDePagosByNomina(String idNomina){
//        return super.persistence().get(QueryTdEmpleadoDAO.class).numeroDePagosByNomina(idNomina).get(0).getCptoPago();
return null;
    }

    
    private String getAntiguedad(DatosXMLAnexo20DTO datos){
        SimpleDateFormat format = new   SimpleDateFormat("dd/MM/yyyy");
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
    
    public List<TnComprobantePdfDTO> findTnComprobantePdfById(List<Integer> listFolios, Integer cnDfifFolio) {

        List<TnComprobantePdfBlob> listaTnComprobantePdf = super.persistence().get(CustomTnComprobantePdfDAO.class).getTnComprobantePdfById(listFolios, cnDfifFolio);
        List<TnComprobantePdfDTO> listaTnComprobantePdfDTO = super.transformation().map(listaTnComprobantePdf, TnComprobantePdfDTO.class);
        
        return listaTnComprobantePdfDTO;
    }

    public void processSatTnComprobantesPdf(ArchivosTimbrePdfDTO archivosTimbrePdfDTO) {
        Integer ciclo = Integer.valueOf( super.security().getOperationYear());
        String usuario = super.identity().get().getUserID();
        InputStream input = new ByteArrayInputStream(archivosTimbrePdfDTO.getNomArchPdfsFile().getBytes());
        ZipInputStream zipIn = new ZipInputStream(input);
        List<TnComprobantePdfDTO> lista = new ArrayList<TnComprobantePdfDTO>();
        try {
            byte[] blob = null;
            ZipEntry entry = null;
            // iterates over entries in the zip file

            entry = zipIn.getNextEntry();

            while (entry != null) {
                String name = entry.getName();
                String[] tokens = name.split("_");
                String unidad = tokens[0];
                String rfc = tokens[1];
                String folio = tokens[2];
                folio = folio.substring(0, 8);

                //extractFile(zipIn, URLFinalPDF);

                ByteArrayOutputStream baos = new ByteArrayOutputStream();
                byte[] bytesIn = new byte[BUFFER_SIZE];
                int read = 0;
                while ((read = zipIn.read(bytesIn)) != -1) {
                    baos.write(bytesIn, 0, read);
                }
                baos.close();
                zipIn.closeEntry();
                entry = zipIn.getNextEntry();
                
                TnComprobantePdfDTO tnComprobantePdfDTO = new TnComprobantePdfDTO();
                tnComprobantePdfDTO.setCnArchivoPdf(baos.toByteArray());
                tnComprobantePdfDTO.setCnConsecNomina(archivosTimbrePdfDTO.getIdNomina().intValue() );
                tnComprobantePdfDTO.setCnFolio(new Long(folio));
                tnComprobantePdfDTO.setCnDifFolio(9);
                tnComprobantePdfDTO.setCnEjercicio(ciclo);
                tnComprobantePdfDTO.setCnRfc(rfc);
                tnComprobantePdfDTO.setFecModifico(new Date());
                tnComprobantePdfDTO.setUsuario(usuario);
                lista.add(tnComprobantePdfDTO);
            }
            zipIn.close();

        } catch (IOException e) {
             throw new ServiceException("Error: " + e.getMessage());
        }


        List<TnComprobantePdf> listaTnComprobantes = super.transformation().map(lista, TnComprobantePdf.class);
        for (TnComprobantePdf tnComprobantePdf: listaTnComprobantes) {
            super.persistence().get(TnComprobantePdfDAO.class).save(tnComprobantePdf);
        }

    }
    
    public byte[] generarArchivoCancelacion(Integer idNomina, Integer cnPaquete){
        StringBuilder strBuilder = new StringBuilder();
        strBuilder.append(HEADER_ARCHIVO_CANCELACION_1);
        SimpleDateFormat date_format = new SimpleDateFormat(super.configuration().getString("utils", "FORMATO_FECHA_LARGA"));
        strBuilder.append(date_format.format(new Date()) );
        strBuilder.append(HEADER_ARCHIVO_CANCELACION_2);
        List<CustomOutputFile> lista = null;
            lista = super.persistence().get(QueryTnHistoricoPagoDAO.class).findFoliosPorQuincena(idNomina, cnPaquete);
            List<CustomOutputFileDTO> datos = super.transformation().map(lista, CustomOutputFileDTO.class);
        for (CustomOutputFileDTO renglon: datos) {
            strBuilder.append(renglon.getRegistro());
        }
        strBuilder.append(FOOTER_ARCHIVO_CANCELACION);

        try {
            return zipBytes(UUID.randomUUID().toString() + ".xml", sign(strBuilder.toString())) ;
        } catch (Exception e) {
             throw new ServiceException("Error: " + e.getMessage());
        }
    }
    
    public byte[] sign(String file) throws Exception {
    
     //   log.info("Begin signing document");
     //   log.info(XMLUtils.document2String((Document) result.getNode(), true));
        // Create a DOM XMLSignatureFactory that will be used to
        // generate the enveloped signature.
        String providerName = System.getProperty("jsr105Provider", "org.jcp.xml.dsig.internal.dom.XMLDSigRI");
            XMLSignatureFactory fac = XMLSignatureFactory.getInstance("DOM",
                 (Provider) Class.forName(providerName).newInstance());
        // Create a Reference to the enveloped document (in this case,
        // you are signing the whole document, so a URI of "" signifies
        // that, and also specify the SHA1 digest algorithm and
        // the ENVELOPED Transform.
        Reference ref = fac.newReference("", fac.newDigestMethod(DigestMethod.SHA1, null), Collections.singletonList(fac.newTransform(Transform.ENVELOPED, (TransformParameterSpec) null)), null, null);
        // Create the SignedInfo.
        SignedInfo si = fac.newSignedInfo(fac.newCanonicalizationMethod(CanonicalizationMethod.INCLUSIVE, (C14NMethodParameterSpec) null), fac.newSignatureMethod(SignatureMethod.RSA_SHA1, null), Collections.singletonList(ref));
        // Load the KeyStore and get the signing key and certificate.
        KeyStore ks = KeyStore.getInstance(super.configuration().getString("timbrado", "JKS_KEYSTORE_TYPE"));
        ks.load(new FileInputStream(super.configuration().getString("timbrado.dir") + File.separator + super.configuration().getString("timbrado", "JKS_CSD_FILE")), super.configuration().getString("timbrado", "JKS_CSD_KEYSTORE_PASSWORD").toCharArray());
        // Get alias from key store
        Enumeration<String> aliases = ks.aliases();
        String alias = aliases.nextElement();
        KeyStore.PrivateKeyEntry keyEntry = (KeyStore.PrivateKeyEntry) ks.getEntry(alias, new KeyStore.PasswordProtection( super.configuration().getString("timbrado", "JKS_CSD_PRIVATE_KEY_PASSWORD").toCharArray()));
        X509Certificate cert = (X509Certificate) keyEntry.getCertificate();
        // Create the KeyInfo containing the X509Data.

        KeyInfoFactory kif = fac.getKeyInfoFactory();
        List<Object> x509Content = new ArrayList<Object>();
        X509IssuerSerial x509IssuerSerial = kif.newX509IssuerSerial(cert.getIssuerX500Principal().getName(), cert.getSerialNumber());
        x509Content.add(x509IssuerSerial);
        //x509Content.add(cert.getSubjectX500Principal().getName());
        x509Content.add(cert);
        X509Data xd = kif.newX509Data(x509Content);
        javax.xml.crypto.dsig.keyinfo.KeyInfo ki = kif.newKeyInfo(Collections.singletonList(xd));
        //Sign xml document
        //Document doc = (Document) result.getNode();
         // Instantiate the document to be signed
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            dbf.setNamespaceAware(true);
            Document doc = 
                dbf.newDocumentBuilder().parse(new ByteArrayInputStream(file.getBytes()));


        DOMSignContext dsc = new DOMSignContext(keyEntry.getPrivateKey(), doc.getDocumentElement());
            javax.xml.crypto.dsig.XMLSignature signature = fac.newXMLSignature(si, ki);
        signature.sign(dsc);
        //File        signatureFile = new File("D:\\signature2.xml");             
        //outputDocToFile(doc, signatureFile);
        byte[] signedFile = outPutDocToByteArray(doc);
        return signedFile;
    }

    public void outputDocToFile(Document doc, File file) {
    
        FileOutputStream f = null;
        try {
            f = new FileOutputStream(file);

            TransformerFactory factory = TransformerFactory.newInstance();
            Transformer transformer;
            transformer = factory.newTransformer();
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
            transformer.setOutputProperty(OutputKeys.OMIT_XML_DECLARATION, 
                                          "yes");
            transformer.transform(new DOMSource(doc), new StreamResult(f));
            f.close();
        } catch (FileNotFoundException e) {
             throw new ServiceException("Error: " + e.getMessage());
        } catch (TransformerConfigurationException e) {
             throw new ServiceException("Error: " + e.getMessage());
        } catch (TransformerException e) {
             throw new ServiceException("Error: " + e.getMessage());
        } catch (IOException e) {
             throw new ServiceException("Error: " + e.getMessage());
        } finally {
            try {
                f.close();
            } catch (IOException e) {
                throw new ServiceException("Error: " + e.getMessage());
            }
        }
    }

    private byte[] outPutDocToByteArray(Document doc) {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        try {
            
            StreamResult result = new StreamResult(bos);
            TransformerFactory factory = TransformerFactory.newInstance();
            Transformer transformer;
            transformer = factory.newTransformer();
            transformer.setOutputProperty(OutputKeys.OMIT_XML_DECLARATION, "yes");
            transformer.setOutputProperty(OutputKeys.METHOD, "xml");
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
            transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "4");
            transformer.transform(new DOMSource(doc), result);


        } catch (TransformerConfigurationException e) {
             throw new ServiceException("Error: " + e.getMessage());
        } catch (TransformerException e) {
             throw new ServiceException("Error: " + e.getMessage());
        }
        return bos.toByteArray();
    }

    
}
