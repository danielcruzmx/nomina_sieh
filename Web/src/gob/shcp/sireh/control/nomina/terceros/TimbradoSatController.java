package gob.shcp.sireh.control.nomina.terceros;




import gob.shcp.fsn.control.AbstractController;
import gob.shcp.fsn.control.support.AnnotatedController;



import gob.shcp.sireh.model.nomina.gestion.ConsultaNominaDTO;
import gob.shcp.sireh.model.nomina.gestion.NominaDTO;

import gob.shcp.sireh.model.nomina.terceros.timbradosat.CancelPagosCanDTO;
import gob.shcp.sireh.model.nomina.terceros.timbradosat.CancelPagosNoCanDTO;
import gob.shcp.sireh.model.nomina.terceros.timbradosat.ComprobanteFiscalDTO;
import gob.shcp.sireh.model.nomina.terceros.timbradosat.CorreoElectronicDTO;

import gob.shcp.sireh.model.nomina.terceros.timbradosat.NominaEstatusDTO;
import gob.shcp.sireh.model.nomina.terceros.timbradosat.ReenvioPagosDTO;
import gob.shcp.sireh.model.nomina.terceros.timbradosat.TimbradoSatDTO;


import gob.shcp.sireh.model.nomina.terceros.timbradosat.TnComprobanteDigDTO;
import gob.shcp.sireh.service.SirehUtils;
import gob.shcp.sireh.service.jms.NominaJMSService;

import gob.shcp.sireh.service.jms.TimbradoJMSService;
import gob.shcp.sireh.service.nomina.gestion.GestionNominaService;

import gob.shcp.sireh.service.nomina.terceros.TercerosNominaService;

import gob.shcp.sireh.service.nomina.terceros.timbrado.TimbradoSatService;
import java.io.File;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;


import java.sql.Blob;
import java.sql.SQLException;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import java.util.UUID;

import org.apache.commons.io.IOUtils;

import javax.servlet.ServletContext;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import javax.xml.bind.DatatypeConverter;



import org.apache.commons.io.FilenameUtils;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TimbradoSatController extends AbstractController implements AnnotatedController{

    private static final int BUFFER_SIZE = 4096;
    private static final String ZIP_EXTENSION = ".zip";
    
    private static final String SERVICIO_FIRMADO = "FIRMADO";

    private String jnlpFileString="PD94bWwgdmVyc2lvbj0iMS4wIiBlbmNvZGluZz0idXRmLTgiPz4KPGpubHAgIHNwZWM9IjEuMCsiIHhtbG5zOmpmeD0iaHR0cDov"+
                                "L2phdmFmeC5jb20iICBocmVmPSJfZG93bmxvYWRlci5qbmxwXyI+CiAgICA8aW5mb3JtYXRpb24+CiAgICAgICAgPHRpdGxlPk5v"+
                                "bWluYVNlcnZpY2U8L3RpdGxlPgogICAgICAgIDx2ZW5kb3I+U0hDUDwvdmVuZG9yPgogICAgICAgIDxkZXNjcmlwdGlvbj5TQ0hQ"+
                                "PC9kZXNjcmlwdGlvbj4KICAgICAgICA8b2ZmbGluZS1hbGxvd2VkLz4KICAgIDwvaW5mb3JtYXRpb24+CiAgICA8cmVzb3VyY2Vz"+
                                "PgogICAgICAgIDxqMnNlIHZlcnNpb249IjEuNysiIGhyZWY9Imh0dHA6Ly9qYXZhLnN1bi5jb20vcHJvZHVjdHMvYXV0b2RsL2oy"+
                                "c2UiLz4KICAgICAgICA8amFyIGhyZWY9Il9yZXFVUkxfL05vbWluYVNlcnZpY2UtMS4wLVNOQVBTSE9ULmphciIgZG93bmxvYWQ9"+
                                "ImVhZ2VyIiBtYWluPSJ0cnVlIiBzaXplPSI1MDAwMDAwIiAvPiAgICAKICAgIDwvcmVzb3VyY2VzPgogICAgPHNlY3VyaXR5Pgog"+
                                "ICAgICAgIDxhbGwtcGVybWlzc2lvbnMvPgogICAgPC9zZWN1cml0eT4KICAgIDxqZng6amF2YWZ4LWRlc2MgIHdpZHRoPSI2MDAi"+
                                "IGhlaWdodD0iMjAwIiBtYWluLWNsYXNzPSJnb2Iuc2hjcC5jZXJ0aWZpY2Fkb3Mubm9taW5hc2VydmljZS5NYWluQXBwIiBuYW1l"+
                                "PSJNYWluQXBwIiA+CiAgICAgICAgPGZ4OnBhcmFtIG5hbWU9InNlcnZpY2UiIHZhbHVlPSJfc2VydmljZV8iLz4KICAgICAgICA8"+
                                "Zng6cGFyYW0gbmFtZT0icmZjIiB2YWx1ZT0iX3JmY18iLz4KICAgICAgICA8Zng6cGFyYW0gbmFtZT0iaWRQYXF1ZXRlIiB2YWx1"+
                                "ZT0iX2lkUGFxdWV0ZV8iLz4KICAgICAgICA8Zng6cGFyYW0gbmFtZT0idXJsQXJjaGl2byIgdmFsdWU9Il91cmxBcmNoaXZvXyIv"+
                                "PjsKICAgICAgICA8Zng6cGFyYW0gbmFtZT0idXJsUmVxdWVzdCIgdmFsdWU9Il91cmxSZXF1ZXN0XyIvPgogICAgICAgIDxmeDpw"+
                                "YXJhbSBuYW1lPSJjb29raWVzIiB2YWx1ZT0iX2Nvb2tpZXNfIi8+CiAgICAgICAgPGZ4OnBhcmFtIG5hbWU9ImlkTm9taW5hIiB2"+
                                "YWx1ZT0iX2lkTm9taW5hXyIvPgogICAgICAgIDxmeDpwYXJhbSBuYW1lPSJjbkZvbGlvIiB2YWx1ZT0iX2NuRm9saW9fIi8+CiAg"+
                                "ICAgICAgPGZ4OnBhcmFtIG5hbWU9ImNuUGFxdWV0ZSIgdmFsdWU9Il9jblBhcXVldGVfIi8+CiAgICA8L2pmeDpqYXZhZngtZGVz"+
                                "Yz4KICAgIDx1cGRhdGUgY2hlY2s9ImFsd2F5cyIgcG9saWN5PSJhbHdheXMiLz4KPC9qbmxwPg==";
                                    
                                    

    /**
     * Metodo inicial para reporte de archivos Sat Timbrado
     * @author Oscar Sánchez
     * @param model Model
     * @param timbradoSatDTO TimbradoSatDTO
     * @return String
     */
    @RequestMapping
    public String satTimbrado(Model model, TimbradoSatDTO timbradoSatDTO) {
        if (timbradoSatDTO.isCancel()) {
            timbradoSatDTO = new TimbradoSatDTO();
        }
        
        if (timbradoSatDTO.isUpdate()) {
            timbradoSatDTO.setMuestraRegistros(true);
        }
        timbradoSatDTO.setUrlOrigen("satTimbrado");
        timbradoSatDTO.setUrlDestino("satTimbrado");
        timbradoSatDTO.setBeanName("SAT_timbradoGrid");
        
        model.addAttribute(timbradoSatDTO);
        return super.getViewName("satTimbrado");
    }
    
    /**
     * Metodo encargado de inicializar la vista encargada de actualizar los archivos del sat relacionados con la nómina.
     * @author Oscar S.
     * @param model Model
     * @param id Integer
     * @return String
     */
    @RequestMapping
    public String satModificacionNomina(Model model, @RequestParam("idQna") Integer id) {
         final NominaDTO nominaDTO = super.getService(GestionNominaService.class).getNominaById(id);
         model.addAttribute(nominaDTO);
        return super.getViewName("satModificacionNomina");
    }
    
    /**
     * GENERAR EL PAQUETE XML PARA SU ENVIO AL SAT
     * @Autor MARTIN C.
     */
    @RequestMapping
    public String generarXml( Model model, 
                            HttpServletRequest request, 
                            @RequestParam("idQna") String idQna
                            ) {
                            String cookieHeader = "";
        javax.servlet.http.Cookie[] cookies = request.getCookies();
        if (cookies != null && cookies.length > 0) {
            for (Cookie cookie: request.getCookies()) {
                cookieHeader += cookie.getName() + "=" + cookie.getValue() + "; ";
            }
        }
        NominaDTO nominaDTO = super.getService(GestionNominaService.class).getNominaById(Integer.valueOf( idQna) );                            
        HttpSession session = request.getSession();
        ServletContext servletContext = session.getServletContext();
        String roothPath = servletContext.getRealPath("/");
        String usuario = super.identity().get().getUserID();
                            
        TimbradoSatDTO timbradoSatDTO = new TimbradoSatDTO();
        nominaDTO.setNomRefTimbrado("X");
        super.getService(GestionNominaService.class).updateNominaCompleta(nominaDTO);
        
        // MODO DE EJECUSION - SINCRONO (NO-ASINCRONO)
        //super.getService(TercerosNominaService.class).generarPaquteXml(roothPath, idQna, hpQnaPago, version);
        
        // MODO DE EJECUSION - ASINCRONO
        //super.getService(NominaJMSService.class).sendGenerarPaqueteXmlTimbrado(roothPath, idQna, hpQnaPago, version, usuario);
         super.getService(NominaJMSService.class).sendGenerarPaqueteXmlTimbrado(roothPath, idQna, nominaDTO.getNomQnaCaptura(), "33", usuario);
        
        timbradoSatDTO.setBeanName("SAT_timbradoGrid");
        timbradoSatDTO.setNomQnaCaptura(nominaDTO.getNomQnaCaptura() );
        timbradoSatDTO.setMuestraRegistros(true);
        timbradoSatDTO.setUrlOrigen("satTimbrado");
        
        // Numero de pagos por nomina
        String numPagos = super.getService(TercerosNominaService.class).numeroDePagosByNomina(idQna);
        //Integer minutos = (new Integer(numPagos.trim()) * 200 ) / 4733;
        
        super.saveMessage(model, "La nomina con ID " + idQna + " sera modificada; La generacion del paquete con  " + numPagos +  " registros ha iniciado; " +
                                " La tarea se ejecutara en segundo plano.");
        
        model.addAttribute(timbradoSatDTO);
        return super.getViewName("satTimbrado");
    }

    /**
     * Metodo encargado de actualizar los archivos del sat relacionados con la nómina.
     * @author Oscar S.
     * @param model Model
     * @return String
     */
/*    @RequestMapping
    public String updateNomina(Model model, NominaDTO nominaDTO) {

        // Archivos
        boolean errorEnExtensiones = false;
        if (nominaDTO.getNomArchCreacionFile() == null || nominaDTO.getNomArchCreacionFile().getSize() == 0 ) {
            nominaDTO.setNomArchCreacion(null);
        } else {
            if (FilenameUtils.getExtension(nominaDTO.getNomArchCreacionFile().getOriginalFilename()).equals("zip")) {
                nominaDTO.setNomArchCreacion(nominaDTO.getNomArchCreacionFile() == null ? null : nominaDTO.getNomArchCreacionFile().getBytes());
            } else {
                errorEnExtensiones = true;
                super.saveError(model, "El archivo " + nominaDTO.getNomArchCreacionFile().getOriginalFilename() + " no cumple con una extensión válida."); 
    //                model.addAttribute(nominaDTO);
    //                return satModificacionNomina(model, nominaDTO.getIdNomina().intValue());
            }
        }
        
        if (nominaDTO.getNomArchAnexo20File() == null || nominaDTO.getNomArchAnexo20File().getSize() == 0) {
            nominaDTO.setNomArchAnexo20(null);
        } else {
            if (FilenameUtils.getExtension(nominaDTO.getNomArchAnexo20File().getOriginalFilename()).equals("zip")) {
                nominaDTO.setNomArchAnexo20(nominaDTO.getNomArchAnexo20File() == null ? null : nominaDTO.getNomArchAnexo20File().getBytes());
            } else {
                errorEnExtensiones = true;
                super.saveError(model, "El archivo " + nominaDTO.getNomArchAnexo20File().getOriginalFilename() + " no cumple con una extensión válida."); 
    //                model.addAttribute(nominaDTO);
    //                return satModificacionNomina(model, nominaDTO.getIdNomina().intValue());
            }
        }

        if (nominaDTO.getNomArchTimbradoFile() == null || nominaDTO.getNomArchTimbradoFile().getSize() == 0 ) {
            nominaDTO.setNomArchTimbrado(null);
        } else {
            if (FilenameUtils.getExtension(nominaDTO.getNomArchTimbradoFile().getOriginalFilename()).equals("zip")) {
                nominaDTO.setNomArchTimbrado(nominaDTO.getNomArchTimbradoFile() == null ? null : nominaDTO.getNomArchTimbradoFile().getBytes());
            } else {
                errorEnExtensiones = true;
                super.saveError(model, "El archivo " + nominaDTO.getNomArchTimbradoFile().getOriginalFilename() + " no cumple con una extensión válida."); 
    //                model.addAttribute(nominaDTO);
    //                return satModificacionNomina(model, nominaDTO.getIdNomina().intValue());
            }
        }

        if (nominaDTO.getNomArchCancFile() == null || nominaDTO.getNomArchCancFile().getSize() == 0 ) {
            nominaDTO.setNomArchCanc(null);
        } else {
            if (FilenameUtils.getExtension(nominaDTO.getNomArchCancFile().getOriginalFilename()).equals("zip")) {
                nominaDTO.setNomArchCanc(nominaDTO.getNomArchCancFile() == null ? null : nominaDTO.getNomArchCancFile().getBytes());
            } else {
                errorEnExtensiones = true;
                super.saveError(model, "El archivo " + nominaDTO.getNomArchCancFile().getOriginalFilename() + " no cumple con una extensión válida."); 
    //              model.addAttribute(nominaDTO);
    //                return satModificacionNomina(model, nominaDTO.getIdNomina().intValue());
            }
        }
        if(errorEnExtensiones){
            model.addAttribute(nominaDTO);
            return satModificacionNomina(model, nominaDTO.getIdNomina().intValue());
        }
        
        String localTempDir = super.configuration().getString("local.temp.dir");
        
        //super.getService(GestionNominaService.class).updateNominaArchivoSat(nominaDTO, super.identity().get().getUserID());
        
        //super.getService(TercerosNominaService.class).setStatusTimbradoOnTnNomina(nominaDTO.getIdNomina().toString() , "L");
        List<byte[]> listaArchivosZip = new ArrayList<byte[]>();
        
        if (nominaDTO.getNomArchTimbradoFile() != null && nominaDTO.getNomArchTimbradoFile().getSize() > 0) {
            listaArchivosZip.add(nominaDTO.getNomArchTimbrado() );
        }
        
        if (nominaDTO.getNomArchCancFile() != null && nominaDTO.getNomArchCancFile().getSize() > 0) {
            listaArchivosZip.add(nominaDTO.getNomArchCanc() );
        }
        
        List<String> listaArchivosRespuestaSat = super.getService(TercerosNominaService.class).descargaDescomprimeZipTimbrado(nominaDTO.getIdNomina(), listaArchivosZip, localTempDir);
        
        String paquete = SirehUtils.getElementFromPattern("^paquete", listaArchivosRespuestaSat);
        String reporte = SirehUtils.getElementFromPattern("^reporte", listaArchivosRespuestaSat);
        String cancelacion = SirehUtils.getElementFromPattern("^respuestaCancelacion", listaArchivosRespuestaSat);
        // ------------------------------------------------ ASYNCRONO -----------------------------------------------------
        localTempDir = super.configuration().getString("local.temp.dir") + File.separator + nominaDTO.getIdNomina();
        super.getService(NominaJMSService.class).sendProcesarPaqueteTimbradoSAT(paquete, reporte, cancelacion, super.identity().get().getUserID(), nominaDTO.getIdNomina().toString(), localTempDir);
        
        
        
        super.saveMessage(model, "nomina.gestion.update.ok", nominaDTO.getIdNomina());
        
        // Eliminar archivos de la carpeta temporal
        File folder = new File(super.configuration().getString("local.temp.dir"));
        File[] archivos = folder.listFiles();
        for(File archivo : archivos){  archivo.delete(); }
        TimbradoSatDTO timbradoSatDTO = new TimbradoSatDTO();
        
        timbradoSatDTO.setUrlOrigen("satTimbrado");
        timbradoSatDTO.setUrlDestino("satTimbrado");
        timbradoSatDTO.setBeanName("SAT_timbradoGrid");
        timbradoSatDTO.setNomQnaCaptura(nominaDTO.getNomQnaCaptura());
        timbradoSatDTO.setMuestraRegistros(true);
        model.addAttribute(timbradoSatDTO);
        return satTimbrado(model, timbradoSatDTO );
    }
    */
    /**
     * Metodo encargado de mostrar el listado de nóminas para su posterior carga de archivos del sat.
     * @author Oscar S.
     * @param model Model
     * @param consultaNominaDTO ConsultaNominaDTO
     * @return String
     */
    @RequestMapping
    public String satListadoNominas(Model model, ConsultaNominaDTO consultaNominaDTO) {
        if (consultaNominaDTO.isCancel()) {
            consultaNominaDTO = new ConsultaNominaDTO();
        }
        consultaNominaDTO.setUrlOrigen("satListadoNominas");
        consultaNominaDTO.setUrlDestino("satListadoNominas");
        consultaNominaDTO.setBeanName("satListadoNominas");
        
        model.addAttribute(consultaNominaDTO);
        return super.getViewName("satListadoNominas");
    }
    

        
        @RequestMapping
        public String cancelarNomina(Model model, NominaDTO nominaDTO) {
            TimbradoSatDTO timbradoSatDTO = new TimbradoSatDTO();
            timbradoSatDTO.setUrlOrigen("satTimbrado");
            timbradoSatDTO.setUrlDestino("satTimbrado");
            timbradoSatDTO.setBeanName("SAT_timbradoGrid");
            timbradoSatDTO.setNomQnaCaptura(nominaDTO.getNomQnaCaptura());
            timbradoSatDTO.setMuestraRegistros(true);
            return satTimbrado(model, timbradoSatDTO);
        }
        
    /**
     * Metodo que descarga el archivo en formato zip cargado en la tabla TN_NOMINA
     * @author Gualberto G.
     * @param model
     * @param idNomina
     * @param file
     * @param response
     * @return String
     */
    @RequestMapping
    public String downloadFile(Model model, @RequestParam("idNomina")
        String idNomina, @RequestParam("file") String file, HttpServletResponse response) {
        String fileName = file + "_" + idNomina + ZIP_EXTENSION;
        OutputStream out = null;
        InputStream in = null;
        try {
            Blob blob = 
                super.getService(TercerosNominaService.class).getFile(Integer.parseInt(idNomina), 
                                                                      file);
            in = blob.getBinaryStream();
            byte[] buff = new byte[BUFFER_SIZE];
            response.setContentType("application/octet-stream");
            response.setContentLength((int)blob.length());
            response.setHeader("Content-Disposition", 
                               "attachment; filename=\"" + fileName + "\"");
            out = response.getOutputStream();
            int len = 0;
            while ((len = in.read(buff)) != -1) {
                out.write(buff, 0, len);
            }
            in.close();
            out.close();
        } catch (IOException e) {

        } catch (SQLException e) {

        } finally {
            try {
                in.close();
                out.close();
            } catch (IOException e) {
            }
        }
        return null;
    }
    
    /**
     * Metodo que descarga el archivo en formato zip cargado en la tabla TN_NOMINA
     * @author Gualberto G.
     * @param model
     * @param idNomina
     * @param file
     * @param response
     * @return String
     */
    @RequestMapping
    public String downloadFileReenvio(Model model, @RequestParam("idNomina")
        String idNomina, @RequestParam("cnFolio") int cnFolio, @RequestParam("cnPaquete") int cnPaquete, @RequestParam("file") String file, HttpServletResponse response) {
        String fileName = file + "_" + idNomina + ZIP_EXTENSION;
        OutputStream out = null;
        byte[] bytes = null;
        try {
            TnComprobanteDigDTO tnComprobanteDigDTO = super.getService(TimbradoSatService.class).getTnComprobanteDigById(cnFolio, 9, cnPaquete);
                                                                      
            if (file != null && file.length() > 0){
                if (file.equals("cnArchCreacion")){
                    bytes = tnComprobanteDigDTO.getCnArchCreacion();
                } else if (file.equals("cnArchAnexo20")){
                    bytes = tnComprobanteDigDTO.getCnArchAnexo20();
                } else if (file.equals("cnArchTimbrado")){
                    bytes = tnComprobanteDigDTO.getCnArchTimbrado();
                } else if (file.equals("cnArchACancelar")){
                    bytes = tnComprobanteDigDTO.getCnArchACancelar();
                } else {
                    bytes = new byte[1];
                }
            }

            response.setContentType("application/octet-stream");
            response.setContentLength(bytes.length );
            response.setHeader("Content-Disposition", "attachment; filename=\"" + fileName + "\"");
            out = response.getOutputStream();
            out.write(bytes, 0, bytes.length);
            out.close();
        } catch (IOException e) {

        } finally {
            try {
                out.close();
            } catch (IOException e) {

            }
        }
        return null;
    }

    @RequestMapping
    public String generarArchivoCancelacion(Model model,  @RequestParam("idNomina")
        int idNomina, @RequestParam("cnPaquete") int cnPaquete,  HttpServletRequest req,HttpServletResponse response) throws IOException {
        byte[] bytes = super.getService(TercerosNominaService.class).generarArchivoCancelacion(idNomina, cnPaquete);
        
        String requestUrl = req.getRequestURL().toString();
        final String contextPath = req.getContextPath();
        requestUrl= requestUrl.substring(0,requestUrl.indexOf(contextPath))+contextPath;
        // Llamar al servicio que envia al sat
        //String nomArchCanc = DatatypeConverter.printBase64Binary(bytes); 
        downloadAppWS(super.configuration().getString("timbrado", 
                                                      "SERVICIO_CANCELACION"), 
                      super.configuration().getString("timbrado", "RFC_SHCP"), 
                      null, requestUrl + "/rest/timbrado/getFile", 
                      requestUrl + "/rest/timbrado/respuesta", 
                      super.configuration().getString("timbrado", 
                                                      "VIRTUAL_BASKET_TIMBRADO_URL"), 
                      idNomina, null, null, req, response);
        /*response.setContentType("text/xml");
        response.setContentLength(bytes.length);
        response.setHeader("Content-Disposition", "attachment; filename=\"" + "archivo_cancelacion.zip");
        OutputStream out = response.getOutputStream();
        out.write(bytes, 0, bytes.length);
*/
        return null;
        
    }
    
    
    /**
     * CFDI POR UNIDAD
     * @author MARTIN C.
     */
    @RequestMapping
    public String impresionCfdiPorQna(Model model, ComprobanteFiscalDTO comprobanteFiscalDTO){
        if(comprobanteFiscalDTO.isLimpiar()){
            comprobanteFiscalDTO = new ComprobanteFiscalDTO();
        }
        
        if(comprobanteFiscalDTO.getUnidad() != null || comprobanteFiscalDTO.getTipoNomina() != null || comprobanteFiscalDTO.getQnaPago() != null || comprobanteFiscalDTO.getComplemento() != null){
            
            if(comprobanteFiscalDTO.getTipoNomina().equals("0")){
                super.saveError(model, "El campo tipo de nomina es obligatorio, seleccione una opcion de la lista");
            }
            if(comprobanteFiscalDTO.getQnaPago() == 0){
                super.saveError(model, "El campo quincena de pago es obligatorio, seleccione una opcion de la lista");
            }

                comprobanteFiscalDTO.setQnaCaptura(SirehUtils.getQuincenaCapturaAsInteger(new Date()));
                comprobanteFiscalDTO.setUrlOrigen("impresionCfdiPorQuincena");
                comprobanteFiscalDTO.setUrlDestino("impresionCfdiPorQuincena");
                comprobanteFiscalDTO.setMuestraRegistros(true);
                comprobanteFiscalDTO.setBeanName("impresionCFDIConsultaFolios");
                comprobanteFiscalDTO.setIdGrupo(null);
       // }
        }
        model.addAttribute(comprobanteFiscalDTO);
        return super.getViewName("comprobanteFiscalUnidad");
    }
    
    /**
     * GENERAR LA REPRESENTACION PDF DEL XML
     * @Autor MARTIN C.
     */
    @RequestMapping
    public String generarPdfDeCfdi(Model model, ComprobanteFiscalDTO comprobanteFiscalDTO, HttpServletRequest request, HttpServletResponse response){
        if(comprobanteFiscalDTO.getIdGrupo() == null){
            super.saveError(model, "Seleccione otros filtros para generar el pdf.");
            model.addAttribute(comprobanteFiscalDTO);
            return impresionCfdiPorQna(model, comprobanteFiscalDTO);
        }
        
        super.getService(TimbradoSatService.class).generarPdfDeCfdi(comprobanteFiscalDTO, request, response, super.configuration().getString("timbrado", "SIREH_TIMBRADO_RFC_SHCP"));
        
        return null;
    }
    
    @RequestMapping
    public String generarCadenaOriginal(Model model, @RequestParam("idNomina")
        int idNomina, HttpServletRequest request) {
        TimbradoSatDTO timbradoSatDTO = new TimbradoSatDTO();        
        
        NominaDTO nominaDTO = super.getService(GestionNominaService.class).getNominaById(idNomina);
        nominaDTO.setCnPaquete(nominaDTO.getCnPaquete() != null ? nominaDTO.getCnPaquete() : 1);
        HttpSession session = request.getSession();
        ServletContext servletContext = session.getServletContext();
        String roothPath = servletContext.getRealPath("/");
        String usuario = super.identity().get().getUserID();
        
        
        nominaDTO.setNomRefTimbrado("D");
        super.getService(TimbradoJMSService.class).sendGenerarCadenas(roothPath, new Integer(idNomina), usuario);
        
        super.saveMessage(model, "nomina.terceros.timbrado.generarCadenas", nominaDTO.getIdNomina());

        timbradoSatDTO.setUrlOrigen("satTimbrado");
        timbradoSatDTO.setUrlDestino("satTimbrado");
        timbradoSatDTO.setBeanName("SAT_timbradoGrid");
        timbradoSatDTO.setNomQnaCaptura(nominaDTO.getNomQnaCaptura());
        timbradoSatDTO.setMuestraRegistros(true);
        model.addAttribute(timbradoSatDTO);
        super.getService(GestionNominaService.class).updateNominaCompleta(nominaDTO);
        return super.getViewName("satTimbrado");
    }
    
    @RequestMapping
    public String generarCadenaByFolio(Model model, @RequestParam("idNomina") int idNomina, @RequestParam("cnFolio") int cnFolio, @RequestParam("cnPaquete") int cnPaquete,  HttpServletRequest request) {
        ReenvioPagosDTO reenvioPagosDTO = new ReenvioPagosDTO();        
        
        HttpSession session = request.getSession();
        ServletContext servletContext = session.getServletContext();
        String roothPath = servletContext.getRealPath("/");
        String usuario = super.identity().get().getUserID();
        
        
        //nominaDTO.setNomRefTimbrado("D");
        super.getService(TimbradoSatService.class).updateCadenaOriginal(roothPath, idNomina, cnFolio, 9,  cnPaquete, usuario);
        
        //super.saveMessage(model, "nomina.terceros.timbrado.generarCadenas", nominaDTO.getIdNomina());

        //timbradoSatDTO.setNomQnaCaptura(nominaDTO.getNomQnaCaptura());

        model.addAttribute(reenvioPagosDTO);
        //super.getService(GestionNominaService.class).updateNominaCompleta(nominaDTO);
        return reenviarPago(model, reenvioPagosDTO);
    }
    
    @RequestMapping
    public String firmarCadenas(Model model, @RequestParam("idNomina")
        int idNomina, HttpServletRequest req,HttpServletResponse response) throws IOException {
        TimbradoSatDTO timbradoSatDTO = new TimbradoSatDTO();        
        NominaDTO nominaDTO = super.getService(GestionNominaService.class).getNominaById(idNomina);
        

        // Llamar al servicio que envia al sat
        String requestUrl = req.getRequestURL().toString();
        final String contextPath = req.getContextPath();
        requestUrl= requestUrl.substring(0,requestUrl.indexOf(contextPath))+contextPath;

        downloadAppWS(SERVICIO_FIRMADO, 
                      super.configuration().getString("timbrado", "SIREH_TIMBRADO_RFC_SHCP"), 
                      null, requestUrl + "/rest/timbrado/guardarCadenas", 
                      requestUrl + "/rest/timbrado/consultarCadenas", 
                      super.configuration().getString("timbrado", "VIRTUAL_BASKET_TIMBRADO_URL"), 
                      idNomina, null, null, req, response);
        nominaDTO.setNomRefTimbrado("H");
        super.getService(GestionNominaService.class).updateNominaCompleta(nominaDTO);

        timbradoSatDTO.setUrlOrigen("satTimbrado");
        timbradoSatDTO.setUrlDestino("satTimbrado");
        timbradoSatDTO.setBeanName("SAT_timbradoGrid");
        timbradoSatDTO.setNomQnaCaptura(nominaDTO.getNomQnaCaptura());
        timbradoSatDTO.setMuestraRegistros(true);
        model.addAttribute(timbradoSatDTO);
        return null;
    }
    
    /**
     * Firma cadena original por folio
     */
    @RequestMapping
    public String firmarCadenaByFolio(Model model, @RequestParam("idNomina")
        int idNomina, @RequestParam("cnFolio") int cnFolio, @RequestParam("cnPaquete") int cnPaquete, HttpServletRequest req,HttpServletResponse response) throws IOException {
        TimbradoSatDTO timbradoSatDTO = new TimbradoSatDTO();        
        //NominaDTO nominaDTO = super.getService(GestionNominaService.class).getNominaById(idNomina);
        

        // Llamar al servicio que envia al sat
        String requestUrl = req.getRequestURL().toString();
        final String contextPath = req.getContextPath();
        requestUrl= requestUrl.substring(0,requestUrl.indexOf(contextPath))+contextPath;

        downloadAppWS(SERVICIO_FIRMADO, 
                      super.configuration().getString("timbrado", 
                                                      "SIREH_TIMBRADO_RFC_SHCP"), 
                      null, requestUrl + "/rest/timbrado/guardarCadenas", 
                      requestUrl + "/rest/timbrado/consultarCadenas", 
                      super.configuration().getString("timbrado", 
                                                      "VIRTUAL_BASKET_TIMBRADO_URL"), 
                      idNomina, cnFolio, cnPaquete, req, response);
        //nominaDTO.setNomRefTimbrado("H");
        //super.getService(GestionNominaService.class).updateNominaCompleta(nominaDTO);

        timbradoSatDTO.setUrlOrigen("satTimbrado");
        timbradoSatDTO.setUrlDestino("satTimbrado");
        timbradoSatDTO.setBeanName("SAT_timbradoGrid");
        //timbradoSatDTO.setNomQnaCaptura(nominaDTO.getNomQnaCaptura());
        timbradoSatDTO.setMuestraRegistros(true);
        model.addAttribute(timbradoSatDTO);
        return null;
    }
    
    
    @RequestMapping
    public String integrarXmlFirma(Model model, @RequestParam("idNomina")
        int idNomina, HttpServletRequest request) {
        TimbradoSatDTO timbradoSatDTO = new TimbradoSatDTO();        
        HttpSession session = request.getSession();
        ServletContext servletContext = session.getServletContext();
        String roothPath = servletContext.getRealPath("/");
        String usuario = super.identity().get().getUserID();
        NominaDTO nominaDTO = super.getService(GestionNominaService.class).getNominaById(idNomina);
        nominaDTO.setNomRefTimbrado("X");
        super.getService(TimbradoJMSService.class).sendIntegrarXmlFirma(roothPath, new Integer( idNomina), usuario);
        super.saveMessage(model, "nomina.terceros.timbrado.generarXML", nominaDTO.getIdNomina());

        timbradoSatDTO.setUrlOrigen("satTimbrado");
        timbradoSatDTO.setUrlDestino("satTimbrado");
        timbradoSatDTO.setBeanName("SAT_timbradoGrid");
        timbradoSatDTO.setNomQnaCaptura(nominaDTO.getNomQnaCaptura());
        timbradoSatDTO.setMuestraRegistros(true);
        model.addAttribute(timbradoSatDTO);
        super.getService(GestionNominaService.class).updateNominaCompleta(nominaDTO);
        return super.getViewName("satTimbrado");
    }
    
    @RequestMapping
    public String integrarXmlFirmaFolio(Model model, @RequestParam("idNomina")
        int idNomina, @RequestParam("cnFolio") int cnFolio, @RequestParam("cnPaquete") int cnPaquete, HttpServletRequest request) {
        ReenvioPagosDTO reenvioPagosDTO = new ReenvioPagosDTO();   
        HttpSession session = request.getSession();
        ServletContext servletContext = session.getServletContext();
        String roothPath = servletContext.getRealPath("/");
        String usuario = super.identity().get().getUserID();
        NominaDTO nominaDTO = super.getService(GestionNominaService.class).getNominaById(idNomina);
        nominaDTO.setNomRefTimbrado("X");
        super.getService(TimbradoSatService.class).updateIntegrarXmlFirmaFolio(idNomina, cnFolio, 9, cnPaquete,usuario);
        super.saveMessage(model, "nomina.terceros.timbrado.generarXML", nominaDTO.getIdNomina());
        return reenviarPago(model, reenvioPagosDTO);
    }
    @RequestMapping
    public String enviarSat(Model model, @RequestParam("idNomina")
        int idNomina,HttpServletRequest req,HttpServletResponse response) throws IOException {
        TimbradoSatDTO timbradoSatDTO = new TimbradoSatDTO();        
        NominaDTO nominaDTO = super.getService(GestionNominaService.class).getNominaById(idNomina);
        

        // Llamar al servicio que envia al sat
        String requestUrl = req.getRequestURL().toString();
        final String contextPath = req.getContextPath();
        requestUrl= requestUrl.substring(0,requestUrl.indexOf(contextPath))+contextPath;

        downloadAppWS("RECEPCION", 
                      super.configuration().getString("timbrado", "SIREH_TIMBRADO_RFC_SHCP"), 
                      null, requestUrl + "/rest/timbrado/getFile", 
                      requestUrl + "/rest/timbrado/respuesta", 
                      super.configuration().getString("timbrado", "VIRTUAL_BASKET_TIMBRADO_URL"), 
                      idNomina, null, null, req, response);
        nominaDTO.setNomRefTimbrado("S");
        super.getService(GestionNominaService.class).updateNominaCompleta(nominaDTO);
        super.saveMessage(model, "nomina.terceros.timbrado.enviado", nominaDTO.getIdNomina());

        timbradoSatDTO.setUrlOrigen("satTimbrado");
        timbradoSatDTO.setUrlDestino("satTimbrado");
        timbradoSatDTO.setBeanName("SAT_timbradoGrid");
        timbradoSatDTO.setNomQnaCaptura(nominaDTO.getNomQnaCaptura());
        timbradoSatDTO.setMuestraRegistros(true);
        model.addAttribute(timbradoSatDTO);
        return null;
    }
    
    @RequestMapping
    public String enviarSatByFolio(Model model, @RequestParam("idNomina")
        int idNomina, @RequestParam("cnFolio") int cnFolio, @RequestParam("cnPaquete") int cnPaquete, HttpServletRequest req,HttpServletResponse response) throws IOException {
        //TimbradoSatDTO timbradoSatDTO = new TimbradoSatDTO();        
        //NominaDTO nominaDTO = super.getService(GestionNominaService.class).getNominaById(idNomina);
         

        // Llamar al servicio que envia al sat
        String requestUrl = req.getRequestURL().toString();
        final String contextPath = req.getContextPath();
        requestUrl= requestUrl.substring(0,requestUrl.indexOf(contextPath))+contextPath;

        downloadAppWS("RECEPCION", 
                      super.configuration().getString("timbrado", "SIREH_TIMBRADO_RFC_SHCP"), 
                      null, requestUrl + "/rest/timbrado/getFile", 
                      requestUrl + "/rest/timbrado/respuesta", 
                      super.configuration().getString("timbrado", "VIRTUAL_BASKET_TIMBRADO_URL"), 
                      idNomina, cnFolio, cnPaquete, req, response);
        //nominaDTO.setNomRefTimbrado("S");
        //super.getService(GestionNominaService.class).updateNominaCompleta(nominaDTO);
        //super.saveMessage(model, "nomina.terceros.timbrado.enviado", nominaDTO.getIdNomina());

        return null;
    }


    @RequestMapping
    public String consultarEnviadoSat(Model model, @RequestParam("idNomina")
        int idNomina, HttpServletRequest req,HttpServletResponse response) throws IOException {
        NominaDTO nominaDTO = super.getService(GestionNominaService.class).getNominaById(idNomina);


        if ((nominaDTO.getNomIdPaqueteSat() != null && nominaDTO.getNomIdPaqueteSat().length() > 0) && 
            nominaDTO.getNomUriblobTimb() == null) {
            String requestUrl = req.getRequestURL().toString();
            final String contextPath = req.getContextPath();
            requestUrl = requestUrl.substring(0, requestUrl.indexOf(contextPath)) + contextPath;
            super.saveMessage(model, "nomina.terceros.timbrado.consulta", nominaDTO.getIdNomina());
            downloadAppWS(super.configuration().getString("timbrado", "SERVICIO_CONSULTA"), 
                          super.configuration().getString("timbrado", "SIREH_TIMBRADO_RFC_SHCP"), 
                          nominaDTO.getNomIdPaqueteSat(), null, 
                          requestUrl + "/rest/timbrado/respConsulta", super.configuration().getString("timbrado", "VIRTUAL_BASKET_TIMBRADO_URL"), 
                          idNomina, null, null, req, response);
            }
        return null;
    }

    @RequestMapping
    public String consultarEnviadoSatByfolio(Model model, @RequestParam("idNomina")
        int idNomina, @RequestParam("cnFolio") int cnFolio, @RequestParam("cnPaquete") int cnPaquete, HttpServletRequest req,HttpServletResponse response) throws IOException {
        TnComprobanteDigDTO tnComprobanteDigDTO = super.getService(TimbradoSatService.class).getTnComprobanteDigById(cnFolio, 9, cnPaquete);
        if ((tnComprobanteDigDTO.getCnIdPaqueteSat() != null && tnComprobanteDigDTO.getCnIdPaqueteSat().length() > 0)) {
            String requestUrl = req.getRequestURL().toString();
            final String contextPath = req.getContextPath();
            requestUrl = requestUrl.substring(0, requestUrl.indexOf(contextPath)) + contextPath;
            //super.saveMessage(model, "nomina.terceros.timbrado.consulta", nominaDTO.getIdNomina());
            downloadAppWS(super.configuration().getString("timbrado", "SERVICIO_CONSULTA"), 
                          super.configuration().getString("timbrado", "SIREH_TIMBRADO_RFC_SHCP"), 
                          tnComprobanteDigDTO.getCnIdPaqueteSat(), null, 
                          requestUrl + "/rest/timbrado/respConsulta", super.configuration().getString("timbrado", "VIRTUAL_BASKET_TIMBRADO_URL"), 
                          idNomina, cnFolio, cnPaquete, req, response);
            }
        return null;
    }
    
    

    @RequestMapping
    public String descargarInforme(Model model, @RequestParam("idNomina")
        int idNomina, HttpServletRequest req, 
        HttpServletResponse response) throws IOException {
        NominaDTO nominaDTO = super.getService(GestionNominaService.class).getNominaById(idNomina);
        if (nominaDTO.getNomUriblobTimb() != null) {
            String requestUrl = req.getRequestURL().toString();
            final String contextPath = req.getContextPath();
            requestUrl = requestUrl.substring(0, requestUrl.indexOf(contextPath)) + contextPath;

            String respuesta = nominaDTO.getNomUriblobTimb();
            downloadAppWS(super.configuration().getString("timbrado", "SERVICIO_DOWNLOAD"), 
                          super.configuration().getString("timbrado", "SIREH_TIMBRADO_RFC_SHCP"), 
                          null, respuesta, 
                          requestUrl + "/rest/timbrado/respDownload", 
                          super.configuration().getString("timbrado", "VIRTUAL_BASKET_TIMBRADO_URL"), 
                          idNomina, null, null, req, response);
        }
        return null;
    }
    
    @RequestMapping
    public String descargarInformeByFolio(Model model, @RequestParam("idNomina")
        int idNomina, @RequestParam("cnFolio") int cnFolio, @RequestParam("cnPaquete") int cnPaquete, HttpServletRequest req, 
        HttpServletResponse response) throws IOException {
        
        TnComprobanteDigDTO tnComprobanteDigDTO = super.getService(TimbradoSatService.class).getTnComprobanteDigById(cnFolio, 9, cnPaquete);
        if (tnComprobanteDigDTO.getCnUriblobTimb() != null) {
            String requestUrl = req.getRequestURL().toString();
            final String contextPath = req.getContextPath();
            requestUrl = requestUrl.substring(0, requestUrl.indexOf(contextPath)) + contextPath;

            String respuesta = tnComprobanteDigDTO.getCnUriblobTimb();
            downloadAppWS(super.configuration().getString("timbrado", "SERVICIO_DOWNLOAD"), 
                          super.configuration().getString("timbrado", "SIREH_TIMBRADO_RFC_SHCP"), 
                          null, respuesta, 
                          requestUrl + "/rest/timbrado/respDownload", 
                          super.configuration().getString("timbrado", "VIRTUAL_BASKET_TIMBRADO_URL"), 
                          idNomina, cnFolio, cnPaquete, req, response);
        }
        return null;
    }

    private void downloadAppWS(String service, String rfc, String idPaquete, String urlArchivo, String urlRest, String urlbasketSIREH, Integer idNomina, Integer cnFolio, Integer cnPaquete, HttpServletRequest req, HttpServletResponse resp){

        String jnlpfile;
        String cookieHeader = "";
        try {
            javax.servlet.http.Cookie[] cookies = req.getCookies();
            if (cookies != null && cookies.length > 0) {
                for (Cookie cookie: req.getCookies()) {
                    cookieHeader += cookie.getName() + "=" + cookie.getValue() + "; ";
                }
            }
            rfc = "CVA0506151X5";
            //final String cH = req.getParameter("cookieHeader") != null? req.getParameter("cookieHeader") : "";
             //cookieHeader = "JSESSIONID=" + cookieHeader;
            final String filename = UUID.randomUUID()+ ".jnlp";
             byte[] decoded =DatatypeConverter.parseBase64Binary(jnlpFileString);
             jnlpfile=new String(decoded, "UTF-8");
            jnlpfile=jnlpfile.replaceAll("_service_",(service!=null)?service:"");
            jnlpfile=jnlpfile.replaceAll("_rfc_",(rfc!=null)?rfc:"");
            //jnlpfile=jnlpfile.replaceAll("_file_",(fileSat!=null)?fileSat:"");
            //jnlpfile=jnlpfile.replaceAll("_fileName_",(fileNameSat!=null)?fileNameSat:"");
            jnlpfile=jnlpfile.replaceAll("_urlArchivo_",(urlArchivo!=null)?urlArchivo:"");
            jnlpfile=jnlpfile.replaceAll("_idPaquete_",(idPaquete!=null)?idPaquete:"");
            jnlpfile=jnlpfile.replaceAll("_idNomina_",idNomina != null ? String.valueOf(idNomina) : "");
            jnlpfile=jnlpfile.replaceAll("_cnFolio_",cnFolio != null ? String.valueOf(cnFolio):"");
            jnlpfile=jnlpfile.replaceAll("_cnPaquete_",cnPaquete != null ? String.valueOf(cnPaquete):"");
            jnlpfile=jnlpfile.replaceAll("_urlRequest_",urlRest);
            //jnlpfile=jnlpfile.replaceAll("_reqURL_",super.configuration().getString("PKI_WEB_RESOURCES_URL"));
             //jnlpfile=jnlpfile.replaceAll("_reqURL_","http://172.22.153.119:7001/TestNominaWeb");
            jnlpfile=jnlpfile.replaceAll("_reqURL_",urlbasketSIREH);
            jnlpfile=jnlpfile.replaceAll("_cookies_",cookieHeader);
            jnlpfile=jnlpfile.replaceAll("_downloader.jnlp_",filename);
            String attachment = "inline; filename=\"" + filename +"\"";
            resp.setContentType("application/x-java-jnlp-file");
            resp.setHeader("Cache-Control", "max-age=30");
            resp.setHeader("Content-disposition", attachment);
            
            byte bytes[] = jnlpfile.getBytes();
            OutputStream out = resp.getOutputStream();
            out.write(bytes, 0, bytes.length);
        } catch (Exception e) {
            super.throwServiceException(e,"Error Servicio Web");
        }
    }


    @RequestMapping
    public String consultarEstatus(Model model, NominaEstatusDTO nominaEstatusDTO){
        if (nominaEstatusDTO.isCancel()) {
            nominaEstatusDTO = new NominaEstatusDTO();
        }
        nominaEstatusDTO.setUrlOrigen("consultarEstatus");
        nominaEstatusDTO.setUrlDestino("consultarEstatus");
        nominaEstatusDTO.setBeanName("listaNominasEstatus");

        if (nominaEstatusDTO.getTipoNomina() != null && !nominaEstatusDTO.getTipoNomina().equals("")) {
            List<String> listIdTipoNomina = new ArrayList<String>();
            listIdTipoNomina.add(nominaEstatusDTO.getTipoNomina());
            if (nominaEstatusDTO.getTipoNomina().equals("DJ")) {
                listIdTipoNomina.add("DE");
            }
            nominaEstatusDTO.setListIdTipoNomina(listIdTipoNomina);
        }
        model.addAttribute(nominaEstatusDTO);
        return super.getViewName("consultarEstatus");
    }
    
    @RequestMapping
    public String modificarEstatus(Model model, @RequestParam("idQna") Integer id) {
        NominaDTO nominaDTO = super.getService(GestionNominaService.class).getNominaById(id);
        NominaEstatusDTO nominaEstatusDTO = super.transformation().map(nominaDTO, NominaEstatusDTO.class);
        model.addAttribute(nominaEstatusDTO);
        return super.getViewName("modificarEstatus");
    }
    
    @RequestMapping
    public String updateEstatus(Model model, NominaEstatusDTO nominaEstatusDTO) {

        super.getService(TimbradoSatService.class).updateEstatus(nominaEstatusDTO.getIdNomina().intValue() );
        super.saveMessage(model, "nomina.terceros.timbrado.saved.status.ok");
        
        
        return consultarEstatus(model, nominaEstatusDTO);
    }
    
    @RequestMapping
    public String cancelPagosCan(Model model, CancelPagosCanDTO cancelPagosCanDTO) {
        cancelPagosCanDTO.setBeanName("tnComprobanteRechazo");
        cancelPagosCanDTO.setMuestraRegistros(true);
        model.addAttribute(cancelPagosCanDTO);
        return super.getViewName("cancelPagosCancelados");
    }
    
    @RequestMapping
    public String cancelPagosNo(Model model, CancelPagosNoCanDTO cancelPagosNoCanDTO) {
        cancelPagosNoCanDTO.setBeanName("tnComprobanteRechazo");
        cancelPagosNoCanDTO.setMuestraRegistros(true);
        model.addAttribute(cancelPagosNoCanDTO);
        return super.getViewName("cancelPagosNoCancelados");
    }
    
    @RequestMapping
    public String reenviarPago(Model model, ReenvioPagosDTO reenvioPagosDTO) {
        reenvioPagosDTO.setBeanName("tnComprobanteRechazo");
        reenvioPagosDTO.setMuestraRegistros(true);
        model.addAttribute(reenvioPagosDTO);
        return super.getViewName("reenvioPagos");
    }
    
    
    

    @RequestMapping
    public String enviarComprobantes(Model model, HttpServletRequest request, @RequestParam("idNomina") Integer idNomina) {
        NominaDTO nominaDTO = super.getService(GestionNominaService.class).getNominaById(idNomina );
        String rootPathAplication =request.getSession().getServletContext().getRealPath("/");
        super.getService(TimbradoJMSService.class).sendComprobantesCFDI(idNomina, rootPathAplication);
        TimbradoSatDTO timbradoSatDTO = new TimbradoSatDTO();
        timbradoSatDTO.setUrlOrigen("satTimbrado");
        timbradoSatDTO.setUrlDestino("satTimbrado");
        timbradoSatDTO.setBeanName("SAT_timbradoGrid");
        timbradoSatDTO.setNomQnaCaptura(nominaDTO.getNomQnaCaptura());
        timbradoSatDTO.setMuestraRegistros(true);
        super.saveMessage(model, "nomina.terceros.timbrado.sent.status.ok");
        return satTimbrado(model, timbradoSatDTO);
    }

    
    /**
     * Enviar los CFDI del Empleado por correo electronico
     * @autor Martin C.
     */
     @RequestMapping
     public String correoElectronico(Model model, HttpServletRequest request, CorreoElectronicDTO correoElectronicDTO) {
         
            if(correoElectronicDTO.isLimpiar()){ 
                correoElectronicDTO = new CorreoElectronicDTO(); 
            }
            
            if(correoElectronicDTO.isBuscar()){
                if(new Integer(correoElectronicDTO.getQnaInicial()) > new Integer(correoElectronicDTO.getQnaFinal())){
                    super.saveError(model, "La quincena inical debe de ser menor que la quincena final.");
                }
                else {  
                    correoElectronicDTO.setDataGrid(true);
                    super.getService(TimbradoSatService.class).getListaFoliosByRfcAndQnaDesdeHasta(correoElectronicDTO);
                    if(correoElectronicDTO.isPanelCorreo()){ correoElectronicDTO.setPanelCorreo(false);}
                }
            }
            
            else if(correoElectronicDTO.isGenerar()){
                if(correoElectronicDTO.getIdGrupo()!= null && correoElectronicDTO.getIdGrupo().length > 0){
                    correoElectronicDTO.setPanelCorreo(true);
                    super.getService(TimbradoSatService.class).getListaFoliosByRfcAndQnaDesdeHasta(correoElectronicDTO);
                    super.getService(TimbradoSatService.class).generarPDFdelXML(correoElectronicDTO, request);
                    super.saveMessage(model, "El archivo de notificación ha sido generado exitosamente.");
                }
            }
            
            else if(correoElectronicDTO.isEnviar()){
                if(correoElectronicDTO.getCorreoReceptor().equalsIgnoreCase(correoElectronicDTO.getCorreoReceptorConfirmar())){
                    super.getService(TimbradoSatService.class).getListaFoliosByRfcAndQnaDesdeHasta(correoElectronicDTO);
                    super.getService(TimbradoSatService.class).enviarCorreoElectronicoByEmpleado(correoElectronicDTO);
                    super.saveMessage(model, "La notificación ha sido enviada.");
                } else { super.saveError(model, "El correo y la confirmacion proporcionados no son iguales."); }
            }
            model.addAttribute(correoElectronicDTO);
            return super.getViewName("correoElectronico");
     }
     
    /**
    * @autor Martin C.
    * @param response 
    * @param correoElectronicDTO
    */
     @RequestMapping
    public String descargarZip(HttpServletResponse response, CorreoElectronicDTO correoElectronicDTO) {
        File f = null;
        FileInputStream fis = null;
        
        logger.debug("destFileName: " + correoElectronicDTO.getMergedPDF());
        
        try {
            f = new File(correoElectronicDTO.getMergedPDF());
            if (f.exists()) {
                fis = new FileInputStream(f);
                byte[] bytes = IOUtils.toByteArray(fis);
                
                response.setContentType("application/zip");
                response.setContentLength(bytes.length);
                response.setHeader("Content-Disposition", "attachment; filename=" + correoElectronicDTO.getNameFileZip());
                
                OutputStream out;
                out = response.getOutputStream();
                out.write(bytes, 0, bytes.length);
            }
        } catch (FileNotFoundException fnfe) {
            logger.debug("descargarNotificacion -> FileNotFoundException -> " + fnfe.toString());
        } catch (IOException e) {
            logger.debug("descargarNotificacion -> IOException -> " + e.toString());
        } finally {
            try { fis.close();
            } catch (IOException ioe) {
                logger.debug("descargarNotificacion -> IOException: " + ioe.toString());
            }
        }
        return null;
    }
    
    /**
     * Enviar los CFDI del Empleado por correo electronico
     * @autor Martin C.
    */
    @RequestMapping
    public String previsualizaCorreoCFDIByRfc(Model model, CorreoElectronicDTO correoElectronicDTO) {
        correoElectronicDTO.setRfcEmpleado("BANL831120967");
        correoElectronicDTO.setCiclo("2018");
        correoElectronicDTO.setQnaInicial("201806");
        correoElectronicDTO.setQnaFinal("201806");
        
        super.getService(TimbradoSatService.class).getListaFoliosByRfcAndQnaDesdeHasta(correoElectronicDTO);
        
        super.getService(TimbradoSatService.class).previsualizaCorreoByRfc(correoElectronicDTO);
        
        model.addAttribute(correoElectronicDTO);
        return super.getViewName("previoCorreoElectronico");
    }
}
