package gob.shcp.sireh.control.clc;

import gob.shcp.fsn.control.AbstractController;
import gob.shcp.fsn.control.support.AnnotatedController;

import gob.shcp.sireh.model.TcTipoNominaDTO;
import gob.shcp.sireh.model.clc.interfaz.DetalleBeneficiarioDTO;
import gob.shcp.sireh.model.clc.interfaz.GestionBeneficiariosDTO;
import gob.shcp.sireh.model.clc.interfaz.SolicitudCLCDTO;
import gob.shcp.sireh.model.clc.interfaz.SolicitudCompromisoDTO;
import gob.shcp.sireh.model.clc.interfaz.SolicitudPagoDTO;

import gob.shcp.sireh.service.clc.interfaz.BeneficiariosCLCService;
import gob.shcp.sireh.service.clc.interfaz.SolicitudCLCService;
import gob.shcp.sireh.service.clc.interfaz.SolicitudCompromisoService;
import gob.shcp.sireh.service.clc.interfaz.SolicitudPagoService;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

import javax.servlet.http.HttpServletResponse;

import org.apache.commons.io.IOUtils;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ClcInterfazSICOPController extends AbstractController implements AnnotatedController{

    private static final String SEPARATOR = ",";
    private static final String NEW_LINE = "\n";
    
    private static final String regexCharEspace = "^[a-zA-Z\\s]*$";
    private static final String regexChar = "^[a-zA-Z]*$";
    private static final String regexTipoNomina = "^[a-zA-Z0-9]*$";
    private static final String regexNumber = "^[0-9]*$";
    private static final String regexNoEspChar = "^[A-Z0-9a-z\\s]*$";
    private static final String regexDecimal = "[0-9]+(\\.[0-9][0-9]?)?";
    
    /**
     * Metodo encargado de la solicitud de compromiso.
     * @author Oscar S.
     * @param model Model
     * @return String
     */
    @RequestMapping
    public String solicitudCompromiso(Model model) {
        SolicitudCompromisoDTO solicitudCompromisoDTO = new SolicitudCompromisoDTO();
        solicitudCompromisoDTO.setTipoCambio("0.00000");
        
        // Obtener nominas validas
        List<TcTipoNominaDTO> nominasValidasBenefComodin = super.getService(SolicitudCompromisoService.class).getNominasValidasBenefComodin();
        StringBuffer sb = new StringBuffer();
        
        for (TcTipoNominaDTO nominasValidas : nominasValidasBenefComodin) {
            sb.append( "'" ).append(nominasValidas.getIdTipoNomina()).append( "'," );
        }
        if (sb.length() > 0) {
            sb.delete( sb.length()-1, sb.length());
        }
        solicitudCompromisoDTO.setIdTipoNominaTodas(sb.toString());
        
        model.addAttribute(solicitudCompromisoDTO);
        return super.getViewName("solicitudCompromiso");
    }
    
    /**
     * Metodo encargado de consultar cxlc a comprometer.
     * @author Oscar S.
     * @param model Model
     * @param solicitudCompromisoDTO SolicitudCompromisoDTO
     * @return String
     */
    @RequestMapping
    public String buscaCxlc(Model model, SolicitudCompromisoDTO solicitudCompromisoDTO) {
        if (solicitudCompromisoDTO.isCancelBuscaCxlc()) {
            solicitudCompromisoDTO.setCxlcCiclo(new Integer(0));
            solicitudCompromisoDTO.setCxlcQnaPagoMultiple("");
            solicitudCompromisoDTO.setIdTipoNomina("");
        }
        
        // Genera Lista de quincenas            
        solicitudCompromisoDTO.setQuincenasList(splitAsIntegerList(solicitudCompromisoDTO.getCxlcQnaPagoMultiple(), ","));
        
        List<String> idTipoNominaList = new ArrayList<String>();
        
        // Verificar si se ha seleccionado el beneficiario
        if (solicitudCompromisoDTO.getIdBeneSicop() != null && !solicitudCompromisoDTO.getIdBeneSicop().equals("")) {
            String nominasValidas = solicitudCompromisoDTO.getBsTipoNom();
            logger.debug("buscaCxlc -> idBeneSicop --------------------> " + solicitudCompromisoDTO.getIdBeneSicop());
            logger.debug("buscaCxlc -> nominasValidas -----------------> " + nominasValidas);
            
            // Nominas Validas
            String[] temp = nominasValidas.split(",");
            for(int i =0; i < temp.length; i++) {
                idTipoNominaList.add(temp[i].replaceAll("'",""));
                logger.debug(temp[i].replaceAll("'",""));
            }
        }
        solicitudCompromisoDTO.setIdTipoNominaList(idTipoNominaList);
        
        model.addAttribute(solicitudCompromisoDTO);
        return super.getViewName("solicitudCompromiso");
    }
    
    /**
     * Metodo encargado de generar la solicitud de compromiso manualmente.
     * @author Oscar S.
     * @param model Model
     * @param solicitudCompromisoDTO SolicitudCompromisoDTO
     * @return String
     */
    @RequestMapping
    public String genSolCompManual(Model model, SolicitudCompromisoDTO solicitudCompromisoDTO) {
        try {
            //if (solicitudCompromisoDTO.getIdBeneSicop() == null || solicitudCompromisoDTO.getIdBeneSicop().equals("") || !Pattern.matches(regexNumber, solicitudCompromisoDTO.getIdBeneSicop())) {
            if (solicitudCompromisoDTO.getIdBeneSicop() == null || solicitudCompromisoDTO.getIdBeneSicop().equals("")) {
                super.saveError(model, "clc.interfaz.solicitudCompromiso.error.idBeneSicop");

            } else if (solicitudCompromisoDTO.getTemporalidad().equals("SI") && (solicitudCompromisoDTO.getAprobPla() == null || solicitudCompromisoDTO.getAprobPla().trim().equals("") )) {
                    super.saveError(model, "clc.interfaz.solicitudCompromiso.error.aprobPla");
                
            } else if (solicitudCompromisoDTO.getConcepto() == null || solicitudCompromisoDTO.getConcepto().equals("") || !Pattern.matches(regexNoEspChar, solicitudCompromisoDTO.getConcepto())) {
                super.saveError(model, "clc.interfaz.solicitudCompromiso.error.concepto");
                
            } else if (solicitudCompromisoDTO.getCxlcCiclo() == null || solicitudCompromisoDTO.getCxlcCiclo() == 0 || !Pattern.matches(regexNumber, solicitudCompromisoDTO.getCxlcCiclo().toString())) {
                super.saveError(model, "clc.interfaz.solicitudCompromiso.error.cxlcCiclo");
                
            } else if (solicitudCompromisoDTO.getCxlcQnaPagoMultiple() == null || solicitudCompromisoDTO.getCxlcQnaPagoMultiple().equals("")) {
                super.saveError(model, "clc.interfaz.solicitudCompromiso.error.cxlcQnaPago");
                
            } else if (solicitudCompromisoDTO.getCxlcGrupo() == null || solicitudCompromisoDTO.getCxlcGrupo().length == 0) {
                super.saveError(model, "clc.interfaz.solicitudCompromiso.error.cxlcGrupo");
                
            } else if (solicitudCompromisoDTO.getFechaExp() == null) {
                super.saveError(model, "clc.interfaz.solicitudCompromiso.error.fechaExp");
                
            } else if (solicitudCompromisoDTO.getFechaApli() == null) {
                super.saveError(model, "clc.interfaz.solicitudCompromiso.error.fechaApli");
                
            } else if (solicitudCompromisoDTO.getFechaIni() == null) {
                super.saveError(model, "clc.interfaz.solicitudCompromiso.error.fechaIni");
                
            } else if (solicitudCompromisoDTO.getFechaFin() == null) {
                super.saveError(model, "clc.interfaz.solicitudCompromiso.error.fechaFin");
            
            } else if (solicitudCompromisoDTO.getFechaIni().compareTo(solicitudCompromisoDTO.getFechaFin()) > 0) {
                super.saveError(model, "clc.interfaz.solicitudCompromiso.error.fechaIniFin");
                
            } else if (solicitudCompromisoDTO.getFechaComp() == null) {
                super.saveError(model, "clc.interfaz.solicitudCompromiso.error.fechaComp");
                
            } else if (solicitudCompromisoDTO.getDoctoRef() == null || solicitudCompromisoDTO.getDoctoRef().equals("") || !Pattern.matches(regexNoEspChar, solicitudCompromisoDTO.getDoctoRef())) {
                super.saveError(model, "clc.interfaz.solicitudCompromiso.error.doctoRef");
                
            } else if (solicitudCompromisoDTO.getMes() == null || solicitudCompromisoDTO.getMes().equals("") || solicitudCompromisoDTO.getMes().equals("0") || !Pattern.matches(regexNumber, solicitudCompromisoDTO.getMes())) {
                super.saveError(model, "clc.interfaz.solicitudCompromiso.error.mes");

            } else if (solicitudCompromisoDTO.getBsTipoMoneda().equals("USD") && solicitudCompromisoDTO.getTipoCambio() != null) {
                    super.saveError(model, "clc.interfaz.solicitudCompromiso.error.tipoCambio");
                    
            } else {
                solicitudCompromisoDTO = super.getService(SolicitudCompromisoService.class).updateGenSolCompManual(solicitudCompromisoDTO);
                super.saveMessage(model, "clc.interfaz.solicitudCompromiso.ok");
            }
        } catch (IOException e) {
            e.printStackTrace();
            super.saveError(model, "clc.interfaz.solicitudCompromiso.error");
        }
        model.addAttribute(solicitudCompromisoDTO);
        return super.getViewName("solicitudCompromiso");
    }
    
    /**
     * Metodo encargado de generar la solicitud de compromiso mediante Web Service.
     * @author Oscar S.
     * @param model Model
     * @param solicitudCompromisoDTO SolicitudCompromisoDTO
     * @return String
     */
    @RequestMapping
    public String genSolCompWS(Model model, SolicitudCompromisoDTO solicitudCompromisoDTO) {
        solicitudCompromisoDTO = new SolicitudCompromisoDTO();
        
        super.saveMessage(model, "clc.interfaz.solicitudCompromiso.ok");
        
        model.addAttribute(solicitudCompromisoDTO);
        return super.getViewName("solicitudCompromiso");
    }
    
    /**
     * Metodo encargado de descargar el archivo generado para la solictud de compromiso con base el objeto solicitudCompromisoDTO.
     * @author Oscar S.
     * @param model Model
     * @param solicitudCompromisoDTO SolicitudCompromisoDTO
     * @param response HttpServletResponse
     */
    @RequestMapping
    public String downloadFile(Model model, SolicitudCompromisoDTO solicitudCompromisoDTO, HttpServletResponse response) {
        FileInputStream fs = null;
        File f = null;
        
        String nombreArchivoConRuta = super.configuration().getString("local.temp.dir") + File.separator + solicitudCompromisoDTO.getCsvFileName();
        try {
            f = new File(nombreArchivoConRuta);
            if (f.exists()) {
                fs = new FileInputStream(f);
                byte[] bytes = IOUtils.toByteArray(fs);
                
                response.setContentType("text/plain");
                response.setContentLength(bytes.length);
                response.setHeader("Content-Disposition", "attachment; filename=\"" + solicitudCompromisoDTO.getCsvFileName() + "\"");
                
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
    
    /**
     * Metodo encargado de descargar el archivo generado para la solictud de compromiso con base el objeto genSolCompDTO en formato ZIP.
     * @author Oscar S.
     * @param model Model
     * @param solicitudCompromisoDTO SolicitudCompromisoDTO
     * @param response HttpServletResponse
     */
     @RequestMapping
    public String downloadZipFile(Model model, SolicitudCompromisoDTO solicitudCompromisoDTO, HttpServletResponse response) {
        FileInputStream fs = null;
        File f = null;

        try {
            //String nombreArchivoConRuta = super.configuration().getString("local.temp.dir") + File.separator + solicitudCompromisoDTO.getZipFileName();
            String nombreArchivoConRuta = super.configuration().getString("local.temp.dir") + File.separator + solicitudCompromisoDTO.getCsvFileName();
            f = new File(nombreArchivoConRuta);
            if (f.exists()) {
                fs = new FileInputStream(f);
                byte[] bytes = IOUtils.toByteArray(fs);

                //response.setContentType("application/zip");
                //response.setContentType("application/zip; charset=ISO-8859-1");
                response.setContentType("text/csv");
                response.setContentLength(bytes.length);
                response.setHeader("Content-Disposition", "attachment; filename=\"" + solicitudCompromisoDTO.getFileName() + "\"");

                OutputStream out = response.getOutputStream();
                out.write(bytes, 0, bytes.length);
            }
        } catch (Exception e) {
            super.saveError(model, "clc.interfaz.file.error");
        } finally {
            try {
                fs.close();
            } catch (Exception e) {
                super.saveError(model, "clc.interfaz.file.error");
            }
        }
        return null;
    }
    
    
    
    
    /**
     * Metodo encargado de la solicitud de pago.
     * @author Oscar S.
     * @param model Model
     * @return String
     */
    @RequestMapping
    public String solicitudPago(Model model) {
        SolicitudPagoDTO solicitudPagoDTO = new SolicitudPagoDTO();
        
        solicitudPagoDTO.setTipoCambio(0.00);
        
        // Obtener nominas validas
        List<TcTipoNominaDTO> nominasValidasBenefComodin = super.getService(SolicitudCompromisoService.class).getNominasValidasBenefComodin();
        StringBuffer sb = new StringBuffer();
        
        for (TcTipoNominaDTO nominasValidas : nominasValidasBenefComodin) {
            sb.append( "'" ).append(nominasValidas.getIdTipoNomina()).append( "'," );
        }
        if (sb.length() > 0) {
            sb.delete( sb.length()-1, sb.length());
        }
        solicitudPagoDTO.setIdTipoNominaTodas(sb.toString());
        
        model.addAttribute(solicitudPagoDTO);
        return super.getViewName("solicitudPago");
    }
    
    /**
     * Metodo encargado de consultar cxlc - Solicitud de pago.
     * @author Oscar S.
     * @param model Model
     * @param solicitudPagoDTO SolicitudPagoDTO
     * @return String
     */
    @RequestMapping
    public String buscaCxlcSolicitudPago(Model model, SolicitudPagoDTO solicitudPagoDTO) {
        if (solicitudPagoDTO.isCancelBuscaCxlc()) {
            solicitudPagoDTO.setCxlcCiclo(new Integer(0));
            solicitudPagoDTO.setCxlcQnaPagoMultiple("");
            solicitudPagoDTO.setIdTipoNomina("");
        }
        
        // Genera Lista de quincenas            
        solicitudPagoDTO.setQuincenasList(splitAsIntegerList(solicitudPagoDTO.getCxlcQnaPagoMultiple(), ","));
        
        List<String> idTipoNominaList = new ArrayList<String>();
        
        // Verificar si se ha seleccionado el beneficiario
        if (solicitudPagoDTO.getIdBeneSicop() != null && !solicitudPagoDTO.getIdBeneSicop().equals("")) {
            String nominasValidas = solicitudPagoDTO.getBsTipoNom();
            logger.debug("buscaCxlcSolicitudPago -> idBeneSicop --------------------> " + solicitudPagoDTO.getIdBeneSicop());
            logger.debug("buscaCxlcSolicitudPago -> nominasValidas -----------------> " + nominasValidas);
            
            // Nominas Validas
            String[] temp = nominasValidas.split(",");
            for(int i =0; i < temp.length; i++) {
                idTipoNominaList.add(temp[i].replaceAll("'",""));
                logger.debug(temp[i].replaceAll("'",""));
            }
        }
        solicitudPagoDTO.setIdTipoNominaList(idTipoNominaList);
        
        model.addAttribute(solicitudPagoDTO);
        return super.getViewName("solicitudPago");
    }
    
    /**
     * Metodo encargado de generar la solicitud de pago manualmente.
     * @author Oscar S.
     * @param model Model
     * @param solicitudPagoDTO SolicitudPagoDTO
     * @return String
     */
    @RequestMapping
    public String genSolPagoManual(Model model, SolicitudPagoDTO solicitudPagoDTO) {
        try {
            //if (solicitudPagoDTO.getIdBeneSicop() == null || solicitudPagoDTO.getIdBeneSicop().equals("") || !Pattern.matches(regexNumber, solicitudPagoDTO.getIdBeneSicop())) {
            if (solicitudPagoDTO.getIdBeneSicop() == null || solicitudPagoDTO.getIdBeneSicop().equals("")) {
                super.saveError(model, "clc.interfaz.solicitudPago.error.idBeneSicop");
                
            } else if (solicitudPagoDTO.getConcepto() == null || solicitudPagoDTO.getConcepto().equals("") || !Pattern.matches(regexNoEspChar, solicitudPagoDTO.getConcepto())) {
                super.saveError(model, "clc.interfaz.solicitudPago.error.concepto");
                
            } else if (solicitudPagoDTO.getCxlcCiclo() == null || solicitudPagoDTO.getCxlcCiclo() == 0 || !Pattern.matches(regexNumber, solicitudPagoDTO.getCxlcCiclo().toString())) {
                super.saveError(model, "clc.interfaz.solicitudPago.error.cxlcCiclo");
            
            } else if (solicitudPagoDTO.getCxlcQnaPagoMultiple() == null || solicitudPagoDTO.getCxlcQnaPagoMultiple().equals("")) {
                super.saveError(model, "clc.interfaz.solicitudPago.error.cxlcQnaPago");
                
            } else if (solicitudPagoDTO.getCxlcGrupo() == null) {
                super.saveError(model, "clc.interfaz.solicitudPago.error.cxlcGrupo");
                
            } else if (solicitudPagoDTO.getFechaExp() == null) {
                super.saveError(model, "clc.interfaz.solicitudPago.error.fechaExp");
                
            } else if (solicitudPagoDTO.getFechaApli() == null) {
                super.saveError(model, "clc.interfaz.solicitudPago.error.fechaApli");
                
            } else if (solicitudPagoDTO.getFechaComp() == null) {
                super.saveError(model, "clc.interfaz.solicitudPago.error.fechaComp");
                
            } else if (solicitudPagoDTO.getDoctoRef() == null || solicitudPagoDTO.getDoctoRef().equals("") || !Pattern.matches(regexNoEspChar, solicitudPagoDTO.getDoctoRef())) {
                super.saveError(model, "clc.interfaz.solicitudPago.error.doctoRef");
                
            } else if (solicitudPagoDTO.getMes() == null || solicitudPagoDTO.getMes().equals("") || solicitudPagoDTO.getMes().equals("0") || !Pattern.matches(regexNumber, solicitudPagoDTO.getMes())) {
                super.saveError(model, "clc.interfaz.solicitudPago.error.mes");
                
            } else if (solicitudPagoDTO.getBsTipoMoneda().equals("USD") && !Pattern.matches(regexDecimal, String.valueOf(solicitudPagoDTO.getTipoCambio()))) {
                super.saveError(model, "clc.interfaz.solicitudPago.error.tipoCambio");
                
            } else {
                solicitudPagoDTO = super.getService(SolicitudPagoService.class).updateGenSolPagoManual(solicitudPagoDTO);
                super.saveMessage(model, "clc.interfaz.solicitudPago.ok");
            }
        } catch (IOException e) {
            e.printStackTrace();
            super.saveError(model, "clc.interfaz.solicitudPago.error");
        }
        model.addAttribute(solicitudPagoDTO);
        return super.getViewName("solicitudPago");
    }
    
    /**
     * Metodo encargado de descargar el archivo generado para la solictud de compromiso con base el objeto solicitudPagoDTO en formato ZIP.
     * @author Oscar S.
     * @param model Model
     * @param solicitudPagoDTO SolicitudPagoDTO
     * @param response HttpServletResponse
     */
    @RequestMapping
    public String downloadZipFilePago(Model model, SolicitudPagoDTO solicitudPagoDTO, HttpServletResponse response) {
        FileInputStream fs = null;
        File f = null;

        try {
            //String nombreArchivoConRuta = super.configuration().getString("local.temp.dir") + File.separator + solicitudPagoDTO.getZipFileName();
            String nombreArchivoConRuta = super.configuration().getString("local.temp.dir") + File.separator + solicitudPagoDTO.getCsvFileName();
            f = new File(nombreArchivoConRuta);
            if (f.exists()) {
                fs = new FileInputStream(f);
                byte[] bytes = IOUtils.toByteArray(fs);

                //response.setContentType("application/zip");
                response.setContentType("text/csv");
                response.setContentLength(bytes.length);
                response.setHeader("Content-Disposition", "attachment; filename=\"" + solicitudPagoDTO.getFileName() + "\"");

                OutputStream out = response.getOutputStream();
                out.write(bytes, 0, bytes.length);
            }
        } catch (Exception e) {
            super.saveError(model, "clc.interfaz.file.error");
        } finally {
            try {
                fs.close();
            } catch (Exception e) {
                super.saveError(model, "clc.interfaz.file.error");
            }
        }
        return null;
    }
    
    
    
    
    
    /**
     * Metodo encargado de la solicitud de CLC.
     * @author Oscar S.
     * @param model Model
     * @return String
     */
    @RequestMapping
    public String solicitudCLC(Model model) {
        SolicitudCLCDTO solicitudCLCDTO = new SolicitudCLCDTO();
        
        solicitudCLCDTO.setTipoCambio(0.00);
        
        // Obtener nominas validas
        List<TcTipoNominaDTO> nominasValidasBenefComodin = super.getService(SolicitudCompromisoService.class).getNominasValidasBenefComodin();
        StringBuffer sb = new StringBuffer();
        
        for (TcTipoNominaDTO nominasValidas : nominasValidasBenefComodin) {
            sb.append( "'" ).append(nominasValidas.getIdTipoNomina()).append( "'," );
        }
        if (sb.length() > 0) {
            sb.delete( sb.length()-1, sb.length());
        }
        solicitudCLCDTO.setIdTipoNominaTodas(sb.toString());
        
        model.addAttribute(solicitudCLCDTO);
        return super.getViewName("solicitudCLC");
    }
    
    /**
     * Metodo encargado de consultar cxlc - Solicitud de CLC.
     * @author Oscar S.
     * @param model Model
     * @param solicitudCLCDTO SolicitudCLCDTO
     * @return String
     */
    @RequestMapping
    public String buscaCxlcSolicitudCLC(Model model, SolicitudCLCDTO solicitudCLCDTO) {
        if (solicitudCLCDTO.isCancelBuscaCxlc()) {
            solicitudCLCDTO.setCxlcCiclo(new Integer(0));
            solicitudCLCDTO.setCxlcQnaPagoMultiple("");
            solicitudCLCDTO.setIdTipoNomina("");
        }
        
        // Genera Lista de quincenas            
        solicitudCLCDTO.setQuincenasList(splitAsIntegerList(solicitudCLCDTO.getCxlcQnaPagoMultiple(), ","));
        
        List<String> idTipoNominaList = new ArrayList<String>();
        
        // Verificar si se ha seleccionado el beneficiario
        if (solicitudCLCDTO.getIdBeneSicop() != null && !solicitudCLCDTO.getIdBeneSicop().equals("")) {
            String nominasValidas = solicitudCLCDTO.getBsTipoNom();
            logger.debug("buscaCxlcSolicitudCLC -> idBeneSicop --------------------> " + solicitudCLCDTO.getIdBeneSicop());
            logger.debug("buscaCxlcSolicitudCLC -> nominasValidas -----------------> " + nominasValidas);
            
            // Nominas Validas
            String[] temp = nominasValidas.split(",");
            for(int i =0; i < temp.length; i++) {
                idTipoNominaList.add(temp[i].replaceAll("'",""));
                logger.debug(temp[i].replaceAll("'",""));
            }
        }
        solicitudCLCDTO.setIdTipoNominaList(idTipoNominaList);
        
        model.addAttribute(solicitudCLCDTO);
        return super.getViewName("solicitudCLC");
    }
    
    /**
     * Metodo encargado de generar la solicitud de CLC manualmente.
     * @author Oscar S.
     * @param model Model
     * @param solicitudCLCDTO SolicitudCLCDTO
     * @return String
     */
    @RequestMapping
    public String genSolCLCManual(Model model, SolicitudCLCDTO solicitudCLCDTO) {
        try {
            //if (solicitudCLCDTO.getIdBeneSicop() == null || solicitudCLCDTO.getIdBeneSicop().equals("") || !Pattern.matches(regexNumber, solicitudCLCDTO.getIdBeneSicop())) {
            if (solicitudCLCDTO.getIdBeneSicop() == null || solicitudCLCDTO.getIdBeneSicop().equals("")) {
                super.saveError(model, "clc.interfaz.solicitudCLC.error.idBeneSicop");
                
            } else if (solicitudCLCDTO.getConcepto() == null || solicitudCLCDTO.getConcepto().equals("") || !Pattern.matches(regexNoEspChar, solicitudCLCDTO.getConcepto())) {
                super.saveError(model, "clc.interfaz.solicitudCLC.error.concepto");
                
            } else if (solicitudCLCDTO.getCxlcCiclo() == null || solicitudCLCDTO.getCxlcCiclo() == 0 || !Pattern.matches(regexNumber, solicitudCLCDTO.getCxlcCiclo().toString())) {
                super.saveError(model, "clc.interfaz.solicitudCLC.error.cxlcCiclo");
            
            } else if (solicitudCLCDTO.getCxlcQnaPagoMultiple() == null || solicitudCLCDTO.getCxlcQnaPagoMultiple().equals("")) {
                super.saveError(model, "clc.interfaz.solicitudCLC.error.cxlcQnaPago");
                
            } else if (solicitudCLCDTO.getCxlcGrupo() == null || solicitudCLCDTO.getCxlcGrupo().length == 0) {
                super.saveError(model, "clc.interfaz.solicitudCLC.error.cxlcGrupo");
                
            } else if (solicitudCLCDTO.getFechaExp() == null) {
                super.saveError(model, "clc.interfaz.solicitudCLC.error.fechaExp");
                
            } else if (solicitudCLCDTO.getFechaApli() == null) {
                super.saveError(model, "clc.interfaz.solicitudCLC.error.fechaApli");
                
            } else if (solicitudCLCDTO.getFechaComp() == null) {
                super.saveError(model, "clc.interfaz.solicitudCLC.error.fechaComp");
                
            } else if (solicitudCLCDTO.getDoctoRef() == null || solicitudCLCDTO.getDoctoRef().equals("") || !Pattern.matches(regexNoEspChar, solicitudCLCDTO.getDoctoRef())) {
                super.saveError(model, "clc.interfaz.solicitudCLC.error.doctoRef");
                
            } else if (solicitudCLCDTO.getMes() == null || solicitudCLCDTO.getMes().equals("") || solicitudCLCDTO.getMes().equals("0") || !Pattern.matches(regexNumber, solicitudCLCDTO.getMes())) {
                super.saveError(model, "clc.interfaz.solicitudCLC.error.mes");
                
            } else if (solicitudCLCDTO.getBsTipoMoneda().equals("USD") && !Pattern.matches(regexDecimal, String.valueOf(solicitudCLCDTO.getTipoCambio()))) {
                super.saveError(model, "clc.interfaz.solicitudCLC.error.tipoCambio");
                
            } else {
                solicitudCLCDTO = super.getService(SolicitudCLCService.class).genSolCLCManual(solicitudCLCDTO);
                super.saveMessage(model, "clc.interfaz.solicitudCLC.ok");
            }
        } catch (IOException e) {
            e.printStackTrace();
            super.saveError(model, "clc.interfaz.solicitudCLC.error");
        }
        model.addAttribute(solicitudCLCDTO);
        return super.getViewName("solicitudCLC");
    }
    
    /**
     * Metodo encargado de descargar el archivo generado para la solictud de compromiso con base el objeto solicitudCLCDTO en formato ZIP.
     * @author Oscar S.
     * @param model Model
     * @param solicitudCLCDTO SolicitudCLCDTO
     * @param response HttpServletResponse
     */
    @RequestMapping
    public String downloadZipFileCLC(Model model, SolicitudCLCDTO solicitudCLCDTO, HttpServletResponse response) {
        FileInputStream fs = null;
        File f = null;

        try {
            //String nombreArchivoConRuta = super.configuration().getString("local.temp.dir") + File.separator + solicitudCLCDTO.getZipFileName();
            String nombreArchivoConRuta = super.configuration().getString("local.temp.dir") + File.separator + solicitudCLCDTO.getCsvFileName();
            f = new File(nombreArchivoConRuta);
            if (f.exists()) {
                fs = new FileInputStream(f);
                byte[] bytes = IOUtils.toByteArray(fs);

                //response.setContentType("application/zip");
                response.setContentType("text/csv");
                response.setContentLength(bytes.length);
                response.setHeader("Content-Disposition", "attachment; filename=\"" + solicitudCLCDTO.getFileName() + "\"");

                OutputStream out = response.getOutputStream();
                out.write(bytes, 0, bytes.length);
            }
        } catch (Exception e) {
            super.saveError(model, "clc.interfaz.file.error");
        } finally {
            try {
                fs.close();
            } catch (Exception e) {
                super.saveError(model, "clc.interfaz.file.error");
            }
        }
        return null;
    }
    
    /**
     * Lista Beneficiarios 
     * @author Josue L. Torres.
     * @param model Model
     * @param gestionBeneficiariosDTO GestionBeneficiariosDTO
     * @return String
     */
    @RequestMapping
    public String gestionBeneficiarios(Model model, GestionBeneficiariosDTO gestionBeneficiariosDTO) {
        if (gestionBeneficiariosDTO.isCancel()) {
            gestionBeneficiariosDTO = new GestionBeneficiariosDTO();
        }
        model.addAttribute(gestionBeneficiariosDTO);
        return super.getViewName("gestionBeneficiarios"); //Va el nombre de la JSP o del Servlet 
    }
    
    /**
     * Metodo encargado de armar la llave y consultar Beneficiarios 1 a 1 de CLC.
     * @author Josue L. Torres.
     * @param model Model
     * @param bsCtaBancaria String
     * @param bsLeyenda String
     * @param bsTipoPago String
     * @param idBeneSicop String
     * @return String
     */
    @RequestMapping
    public String detalleBeneficiario(Model model, 
                                      @RequestParam("bsCtaBancaria") String bsCtaBancaria, 
                                      @RequestParam("bsLeyenda") String bsLeyenda,
                                      @RequestParam("bsTipoPago") String bsTipoPago,
                                      @RequestParam("idBeneSicop") String idBeneSicop)  {
                     
        DetalleBeneficiarioDTO benefSicopDTO = super.getService(BeneficiariosCLCService.class).getBeneficiario(bsCtaBancaria, bsLeyenda, bsTipoPago, idBeneSicop);
        
        // Obtener cadenas de nominas
        String nominas = benefSicopDTO.getBsTipoNom();
        
        // Transformar cadena de nomina en Lista de String
        List<String> tipoNomina = splitAsList(nominas.replaceAll("\\'", ""), ",");
        
        // set de la lista de string
        benefSicopDTO.setTipoNomina(tipoNomina);
        
        model.addAttribute("benefSicopDTO", benefSicopDTO);
        return super.getViewName("detalleBeneficiario"); //Va el nombre de la JSP o del Servlet 
    }
    
     /**
     * Metodo encargado de actualizar Beneficiarios.
     * @author Josue L. Torres.
     * @param model Model
     * @param detalleBeneficiarioDTO DetalleBeneficiarioDTO
     * @return String
     */
    @RequestMapping
    public String updateBeneficiario(Model model, DetalleBeneficiarioDTO detalleBeneficiarioDTO) {
        String  vista = null;
        if (detalleBeneficiarioDTO.isCancel()) {     
            model.addAttribute(detalleBeneficiarioDTO);    
            vista = super.getViewName("detalleBeneficiario");
        } else {
    
            // Recuperar Lista de nominas
            List<String> tipoNomina = detalleBeneficiarioDTO.getTipoNomina();
            StringBuffer sb = new StringBuffer();
            
            // Genera cadena separada por comas
            for (String nomina : tipoNomina) {
                sb.append("'").append(nomina).append("'").append(",");
            }
            if (sb.length() > 0) {
                sb.delete(sb.length() - 1, sb.length());
            }
            
            // Set de cadena separada por comas
            detalleBeneficiarioDTO.setBsTipoNom(sb.toString());
            
            // Guadar beneficiario
            super.getService(BeneficiariosCLCService.class).updateBeneficiario(detalleBeneficiarioDTO);
            
            GestionBeneficiariosDTO gestionBeneficiariosDTO = new GestionBeneficiariosDTO();
            
            model.addAttribute(gestionBeneficiariosDTO);
            vista = super.getViewName("gestionBeneficiarios");
        }
        
        return vista;
    }

    private List<String> splitAsList(String cadena, String separatorSplit) {
        if (cadena == null || cadena.length() == 0)
            return null;
        String arreglo[] = cadena.split(separatorSplit);
        return Arrays.asList(arreglo);
    }
    
    private List<Integer> splitAsIntegerList(String cadena, String separatorSplit) {
        if (cadena == null || cadena.length() == 0)
            return null;
        String arreglo[] = cadena.split(separatorSplit);

        Integer[] numbers = new Integer[arreglo.length];
        for (int i = 0; i < arreglo.length; i++) {
            numbers[i] = new Integer(arreglo[i]);
        }
        return Arrays.asList(numbers);
    }
}