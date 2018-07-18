package gob.shcp.sireh.control.merito;

import gob.shcp.fsn.control.AbstractController;
import gob.shcp.fsn.control.support.AnnotatedController;

import gob.shcp.fsn.service.ServiceException;

import gob.shcp.sireh.model.clc.consulta.ConsultaRegistroClcDTO;
import gob.shcp.sireh.model.merito.ActImporDepoDTO;
import gob.shcp.sireh.model.merito.HistoricoMeritoDTO;
import gob.shcp.sireh.model.merito.MeritoManualDTO;
import gob.shcp.sireh.model.merito.NotaDeMeritoDTO;
import gob.shcp.sireh.model.merito.PagoMeritoDTO;
import gob.shcp.sireh.model.merito.ProcesoNmDTO;
import gob.shcp.sireh.model.merito.ResumenMeritoDTO;

import gob.shcp.sireh.service.merito.MeritoService;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;

import java.util.Calendar;
import java.util.Date;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.servlet.http.HttpServletResponse;

import org.apache.commons.io.IOUtils;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class NotaDeMeritoController extends AbstractController implements AnnotatedController {

    public static final Integer ID_CAUSAL_PUNTUALIDAD = 3;
    public static final Integer ID_CAUSAL_CAPACITACION = 4;
    public static final Integer ID_CAUSAL_EVALUACION = 1;
    public static final String SUFIX_PU = "PU";
    public static final String SUFIX_CA = "CA";
    public static final String SUFIX_EP = "EP";

    @RequestMapping
    public String ingresarArchivoPuntualidad(Model model) {
        NotaDeMeritoDTO notaDeMeritoDTO = new NotaDeMeritoDTO();
        notaDeMeritoDTO.setUrlOrigen("ingresarArchivoPuntualidad");
        notaDeMeritoDTO.setUrlDestino("procesaArchivoPuntualidad");
        notaDeMeritoDTO.setTdNmhCveCausal(ID_CAUSAL_PUNTUALIDAD);
        Date hoy = new Date();
        Calendar cal = Calendar.getInstance();
        cal.setTime(hoy);
        StringBuffer buffer = new StringBuffer();
        buffer.append(cal.get(Calendar.DAY_OF_MONTH));
        String mes = new Integer(cal.get(Calendar.MONTH) + 1).toString();
        mes = mes.length() == 1 ? "0" + mes : mes;
        buffer.append(mes);
        String anio = new Integer(cal.get(Calendar.YEAR)).toString().substring(2);
        buffer.append(anio);
        buffer.append(SUFIX_PU);
        notaDeMeritoDTO.setTdNmhNumDocto(buffer.toString());
        model.addAttribute(notaDeMeritoDTO);
        return super.getViewName("ingresarArchivosDePuntualidad");
    }

    @RequestMapping
    public String procesaArchivoPuntualidad(Model model, NotaDeMeritoDTO notasDeMeritoDTO) {
        NotaDeMeritoDTO notaDeMeritoDevueltaDTO = new NotaDeMeritoDTO();
        notaDeMeritoDevueltaDTO = super.getService(MeritoService.class).updateNMFilePuntuality(notasDeMeritoDTO);

        if (notaDeMeritoDevueltaDTO.getPlantillaErronea()) {
            notaDeMeritoDevueltaDTO.setMensaje(super.configuration().getString("mensajesErrorPuntualidad", "jxls.templates.puntualidad.error.merito.error.plantilla.incorrecta"));
        }
        model.addAttribute(notasDeMeritoDTO);
        return super.getViewName("resultadoArchivoPuntualidad");
    }

    @RequestMapping
    public String ingresarArchivoCapacitacion(Model model) {
        NotaDeMeritoDTO notaDeMeritoDTO = new NotaDeMeritoDTO();
        notaDeMeritoDTO.setUrlOrigen("ingresarArchivoCapacitacion");
        notaDeMeritoDTO.setUrlDestino("procesaArchivoCapacitacion");
        notaDeMeritoDTO.setTdNmhCveCausal(ID_CAUSAL_CAPACITACION);
        
        Date hoy = new Date();
        Calendar cal = Calendar.getInstance();
        cal.setTime(hoy);
        StringBuffer buffer = new StringBuffer();
        buffer.append(cal.get(Calendar.DAY_OF_MONTH));
        
        String mes = new Integer(cal.get(Calendar.MONTH) + 1).toString();
        mes = mes.length() == 1 ? "0" + mes : mes;
        buffer.append(mes);
        
        String anio = new Integer(cal.get(Calendar.YEAR)).toString().substring(2);
        buffer.append(anio);
        buffer.append(SUFIX_CA);
        notaDeMeritoDTO.setTdNmhNumDocto(buffer.toString());
        
        model.addAttribute(notaDeMeritoDTO);
        return super.getViewName("ingresarArchivosDeCapacitacion");
    }
    
    /** 
     * Metodo para ingresar las notas de mérito en la tabla de Histórico por causal de capacitación generando una remesa
     * @author Victor Pérez, Oscar S.
     * @param model Model
     * @param notaDeMeritoDTO NotaDeMeritoDTO
     * @return String
     */
    @RequestMapping
    public String procesaArchivoCapacitacion(Model model, NotaDeMeritoDTO notasDeMeritoDTO) {
        NotaDeMeritoDTO notaDeMeritoDevueltaDTO = new NotaDeMeritoDTO();
        notaDeMeritoDevueltaDTO = super.getService(MeritoService.class).updateNMFileTraining(notasDeMeritoDTO);

        if (notaDeMeritoDevueltaDTO.getPlantillaErronea()) {
            notaDeMeritoDevueltaDTO.setMensaje(super.configuration().getString("mensajesErrorCapacitacion", "jxls.templates.capacitacion.error.merito.error.plantilla.incorrecta"));
        }
        model.addAttribute(notaDeMeritoDevueltaDTO);
        return super.getViewName("resultadoArchivoCapacitacion");
    }

    @RequestMapping
    public String ingresarArchivoEvaluacion(Model model) {
        NotaDeMeritoDTO notaDeMeritoDTO = new NotaDeMeritoDTO();
        notaDeMeritoDTO.setUrlOrigen("ingresarArchivoEvaluacion");
        notaDeMeritoDTO.setUrlDestino("procesaArchivoEvaluacion");
        notaDeMeritoDTO.setTdNmhCveCausal(ID_CAUSAL_EVALUACION);
        Date hoy = new Date();
        Calendar cal = Calendar.getInstance();
        cal.setTime(hoy);
        StringBuffer buffer = new StringBuffer();
        buffer.append(cal.get(Calendar.DAY_OF_MONTH));
        String mes = new Integer(cal.get(Calendar.MONTH) + 1).toString();
        mes = mes.length() == 1 ? "0" + mes : mes;
        buffer.append(mes);
        String anio = new Integer(cal.get(Calendar.YEAR)).toString().substring(2);
        buffer.append(anio);
        buffer.append(SUFIX_EP);
        notaDeMeritoDTO.setTdNmhNumDocto(buffer.toString());
        model.addAttribute(notaDeMeritoDTO);
        return super.getViewName("ingresarArchivosDeEvaluacionDesempeno");
    }

    @RequestMapping
    public String procesaArchivoEvaluacion(Model model, NotaDeMeritoDTO notasDeMeritoDTO) {
        NotaDeMeritoDTO notaDeMeritoDevueltaDTO = new NotaDeMeritoDTO();
        notaDeMeritoDevueltaDTO = super.getService(MeritoService.class).updateNMFileTestPerformance(notasDeMeritoDTO);

        if (notaDeMeritoDevueltaDTO.getPlantillaErronea()) {
            notaDeMeritoDevueltaDTO.setMensaje(super.configuration().getString("mensajesErrorEvaluacion", "jxls.templates.evaluacion.error.merito.error.plantilla.incorrecta"));
        }
        model.addAttribute(notaDeMeritoDevueltaDTO);
        return super.getViewName("resultadoArchivoEvaluacion");
    }
    
    @RequestMapping
    public String downloadFile(Model model, @RequestParam("nombreArchivoErrores") String nombreArchivoErrores, HttpServletResponse response) {
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
                response.setHeader("Content-Disposition", "attachment; filename=\"" + notasDeMeritoDTO.getNombreArchivoErrores() + "\"");
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

    @RequestMapping //mcs
    public String downloadFileRechazos(Model model, @RequestParam("nombreArchivoRechazos") String nombreArchivoRechazos, HttpServletResponse response) {
        FileInputStream fs = null;
        File f = null;
        String nombreArchivoXlsR = super.configuration().getString("local.temp.dir") + File.separator + nombreArchivoRechazos;

        try {
            NotaDeMeritoDTO notasDeMeritoDTO = new NotaDeMeritoDTO();
            notasDeMeritoDTO.setNombreArchivoRechazos(nombreArchivoRechazos);
            notasDeMeritoDTO.setRutaArchivoRechazos(nombreArchivoXlsR);
            f = new File(notasDeMeritoDTO.getRutaArchivoRechazos());

            if (f.exists()) {
                fs = new FileInputStream(f);
                byte[] bytes = IOUtils.toByteArray(fs);
                response.setContentType("application/xls");
                response.setContentLength(bytes.length);
                response.setHeader("Content-Disposition", "attachment; filename=\"" + notasDeMeritoDTO.getNombreArchivoRechazos() + "\"");
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

    @RequestMapping
    public String downloadFileCon(Model model, @RequestParam("nombreArchivoConcent") String nombreArchivoConcent, HttpServletResponse response) {
        FileInputStream fs = null;
        File f = null;
        String nombreArchivoXls = super.configuration().getString("local.temp.dir") + File.separator + nombreArchivoConcent;

        try {
            NotaDeMeritoDTO notasDeMeritoDTO = new NotaDeMeritoDTO();
            notasDeMeritoDTO.setNombreArchivoConcent(nombreArchivoConcent);
            notasDeMeritoDTO.setRutaArchivoConcent(nombreArchivoXls);
            f = new File(notasDeMeritoDTO.getRutaArchivoConcent());

            if (f.exists()) {
                fs = new FileInputStream(f);
                byte[] bytes = IOUtils.toByteArray(fs);
                response.setContentType("application/xls");
                response.setContentLength(bytes.length);
                response.setHeader("Content-Disposition", "attachment; filename=\"" + notasDeMeritoDTO.getNombreArchivoConcent() + "\"");
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

    @RequestMapping
    public String ingresarManualNotaDeMerito(Model model) {
        MeritoManualDTO meritoManualDTO = new MeritoManualDTO();
        meritoManualDTO.setUrlOrigen("ingresarManualNotaDeMerito");
        meritoManualDTO.setUrlDestino("ingresarManualmenteValCaptura");
        meritoManualDTO.setManual(true);
        model.addAttribute(meritoManualDTO);
        return super.getViewName("ingresarManualmente");
    }

    @RequestMapping
    public String ingresarManualmenteValCaptura(Model model, MeritoManualDTO meritoManualDTO) {
        String view = "";
        boolean cambio = false;
        if(meritoManualDTO.getTdNmhRfcUnico() == null ||  meritoManualDTO.getTdNmhCiclo() == null || meritoManualDTO.getHpQnaPago() == 0){
            if(meritoManualDTO.getTdNmhRfcUnico() == null){
                super.saveError(model, "Proporcione el RFC, es un campo obligatorio");
                view = "ingresarManualmente";
            }
            if(meritoManualDTO.getTdNmhCiclo() == null){
                super.saveError(model, "Seleccione el CICLO, es un campo obligatorio");
                view = "ingresarManualmente";
            }
            if(meritoManualDTO.getHpQnaPago() == 0){
                super.saveError(model, "Seleccione la QUINCENA DE VALIDACION, es un campo obligatorio");
                view = "ingresarManualmente";
            }
        }
        else{
            try {
                meritoManualDTO = super.getService(MeritoService.class).validProcessManually(meritoManualDTO);
                meritoManualDTO.setUrlOrigen("ingresarManualNotaDeMerito");
                meritoManualDTO.setUrlDestino("procesaManualmente");
                cambio = true;
                meritoManualDTO.setManual(true);
                model.addAttribute(meritoManualDTO);
                view = meritoManualDTO.getValidaNotaMeritoManual() ? "resultadoManualmente" : "ingresarManualmenteValCaptura";
            } catch (ServiceException e) {  throw new ServiceException(e.toString(), e);  }
        }
        meritoManualDTO.setUrlOrigen("ingresarManualNotaDeMerito");
        //meritoManualDTO.setUrlDestino("ingresarManualmenteValCaptura");
        meritoManualDTO.setUrlDestino( cambio ? "procesaManualmente" : "ingresarManualmenteValCaptura" );
        meritoManualDTO.setManual(true);
        model.addAttribute(meritoManualDTO);
        return super.getViewName(view);
    }

    @RequestMapping
    public String procesaManualmente(Model model, MeritoManualDTO meritoManualDTO) {
        MeritoManualDTO meritoManualDevueltaDTO = new MeritoManualDTO();
        String view = "";
        if( meritoManualDTO.getTdNmhCveCausal() == 0 || meritoManualDTO.getTdNmhOp().equalsIgnoreCase("0") || meritoManualDTO.getTdNmhNumDocto() == null || meritoManualDTO.getTdNmhNumDocto().equalsIgnoreCase("")){
            if(meritoManualDTO.getTdNmhCveCausal() == 0){
                super.saveError(model, "El campo Causal debe ser especificado, es obligatorio");
                view = "ingresarManualmenteValCaptura";
                model.addAttribute(meritoManualDTO);
            }
            if(meritoManualDTO.getTdNmhOp().equalsIgnoreCase("0")){
                super.saveError(model, "El campo Remesa debe ser especificado, es obligatorio");
                view = "ingresarManualmenteValCaptura";
                model.addAttribute(meritoManualDTO);
            }
            if(meritoManualDTO.getTdNmhNumDocto() == null || meritoManualDTO.getTdNmhNumDocto().equalsIgnoreCase("")){
                super.saveError(model, "El campo Número de Documento debe ser especificado, es obligatorio");
                view = "ingresarManualmenteValCaptura";
                model.addAttribute(meritoManualDTO);
            }
        }
        else if(meritoManualDTO.getTdNmhCveCausal() != 0){
            meritoManualDevueltaDTO = super.getService(MeritoService.class).updateManually(meritoManualDTO);
            model.addAttribute(meritoManualDevueltaDTO);
            view = "resultadoManualmente";
        }
        return super.getViewName(view);
    }

    @RequestMapping
    public String iniciaArchivoPago(Model model) {
        PagoMeritoDTO pagoMeritoDTO = new PagoMeritoDTO();
        pagoMeritoDTO.setUrlOrigen("iniciaArchivoPago");
        pagoMeritoDTO.setUrlDestino("generarArchivoPago");
        pagoMeritoDTO.setTdNmhCiclo((pagoMeritoDTO.getCicloValores().get(0)).getClave());
        pagoMeritoDTO.setTdNmhCveCausal((pagoMeritoDTO.getCausalValores().get(0)).getClave());
        pagoMeritoDTO.setManual(true);
        model.addAttribute(pagoMeritoDTO);
        return super.getViewName("generaArchivoPago");
    }

    @RequestMapping
    public String generarArchivoPago(Model model, PagoMeritoDTO pagoMeritoDTO) {
        PagoMeritoDTO pagoMeritoDTODevuelta = new PagoMeritoDTO();
        pagoMeritoDTODevuelta = super.getService(MeritoService.class).generarArchivoPago(pagoMeritoDTO);
        model.addAttribute(pagoMeritoDTODevuelta);
        return super.getViewName("resultadoArchivoPago");
    }

    @RequestMapping
    public String initHistoricoMerito(Model model, HistoricoMeritoDTO historicoMeritoDTO) {
        if (historicoMeritoDTO.isCancel()) {
            historicoMeritoDTO = new HistoricoMeritoDTO();
        }
        historicoMeritoDTO.setUrlOrigen("initHistoricoMerito");
        historicoMeritoDTO.setUrlDestino("initHistoricoMerito");
        historicoMeritoDTO.setBeanName("tcHistoricoNotasMerito");

        if (historicoMeritoDTO.getTdNmhCiclo() == null || 
            (historicoMeritoDTO.getTdNmhCiclo() != null && historicoMeritoDTO.getTdNmhCiclo() == 0)) {
            historicoMeritoDTO.setTdNmhCiclo(historicoMeritoDTO.getCicloValores().get(0).getClave());
        }
        if (historicoMeritoDTO.getTdNmhCveCausal() == null || 
            (historicoMeritoDTO.getTdNmhCveCausal() != null && historicoMeritoDTO.getTdNmhCveCausal() == 0)) {
            historicoMeritoDTO.setTdNmhCveCausal(historicoMeritoDTO.getCausalValores().get(0).getClave());
        }
        model.addAttribute(historicoMeritoDTO);
        return super.getViewName("historicoMerito");
    }

    @RequestMapping
    public String initResumenMerito(Model model, ResumenMeritoDTO resumenMeritoDTO) {
        if (resumenMeritoDTO.isCancel()) {
            resumenMeritoDTO = new ResumenMeritoDTO();
        }
        resumenMeritoDTO.setUrlOrigen("initResumenMerito");
        resumenMeritoDTO.setUrlDestino("detalleResumenMerito");
        resumenMeritoDTO.setBeanName("tcResumenNotasMerito");

        if (resumenMeritoDTO.getTdNmrCiclo() == null || (resumenMeritoDTO.getTdNmrCiclo() != null && resumenMeritoDTO.getTdNmrCiclo() == 0)) {
            resumenMeritoDTO.setTdNmrCiclo(resumenMeritoDTO.getCicloValores().get(0).getClave());
        }
        /*if (resumenMeritoDTO.getTdNmrCveCausal() == null || (resumenMeritoDTO.getTdNmrCveCausal() != null && resumenMeritoDTO.getTdNmrCveCausal() == 0)) {
            resumenMeritoDTO.setTdNmrCveCausal(resumenMeritoDTO.getCausalValores().get(0).getClave());
        }*/
        model.addAttribute(resumenMeritoDTO);
        return super.getViewName("resumenMerito");
    }

    @RequestMapping
    public String detalleResumenMerito(Model model, ResumenMeritoDTO resumenMeritoDTO) {
        resumenMeritoDTO = super.getService(MeritoService.class).getEmpleadoInfoResumenMerito(resumenMeritoDTO);
        resumenMeritoDTO.setUrlOrigen("initResumenMerito");
        resumenMeritoDTO.setUrlDestino("detalleResumenMerito");
        model.addAttribute(resumenMeritoDTO);
        return super.getViewName("detalleResumenMerito");
    }

    @RequestMapping
    public String detalleResumenGraficaMerito(Model model, ResumenMeritoDTO resumenMeritoDTO) {
        resumenMeritoDTO = super.getService(MeritoService.class).getEmpleadoInfoResumenMerito(resumenMeritoDTO);
        model.addAttribute(resumenMeritoDTO);
        return super.getViewName("detalleResumenGraficaMerito");
    }

    @RequestMapping
    public String initProcesaNm(Model model, ProcesoNmDTO procesoNmDTO) {
        procesoNmDTO.setUrlOrigen("initProcesaNm");
        procesoNmDTO.setUrlDestino("procesaNm");

        if (procesoNmDTO.getTdNmrCiclo() == null || 
            (procesoNmDTO.getTdNmrCiclo() != null && procesoNmDTO.getTdNmrCiclo() == 0)) {
            procesoNmDTO.setTdNmrCiclo(procesoNmDTO.getCicloValores().get(0).getClave());
        }
        if (procesoNmDTO.getTdNmrCveCausal() == null || 
            (procesoNmDTO.getTdNmrCveCausal() != null && procesoNmDTO.getTdNmrCveCausal() == 0)) {
            procesoNmDTO.setTdNmrCveCausal(procesoNmDTO.getCausalValores().get(0).getClave());
        }
        model.addAttribute(procesoNmDTO);
        return super.getViewName("procesarNm");
    }

    @RequestMapping
    public String procesaNm(Model model, ProcesoNmDTO procesoNmDTO) {
        procesoNmDTO.setUrlOrigen("procesaNm");
        ProcesoNmDTO procesoNmDTORegreso = super.getService(MeritoService.class).updateProcesoNM(procesoNmDTO, super.security().getUserName());
        procesoNmDTO.setRegreso(procesoNmDTORegreso.getRegreso());
        model.addAttribute(procesoNmDTO);
        return super.getViewName("procesarNmResultado");
    }
    
    @RequestMapping
    public String actImporDepo(Model model, ActImporDepoDTO actImporDepoDTO){
        
        model.addAttribute(actImporDepoDTO);
        return super.getViewName("actImporDepo");
    }
    
}
