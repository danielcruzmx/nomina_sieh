package gob.shcp.sireh.control.plaza.reporte;

import gob.shcp.fsn.control.AbstractController;
import gob.shcp.fsn.control.support.AnnotatedController;

import gob.shcp.sireh.model.expediente.ExpedienteDTO;
import gob.shcp.sireh.model.plaza.reporte.ReportePlazaDTO;

import gob.shcp.sireh.model.servicios.ExpLabCVDTO;
import gob.shcp.sireh.service.SirehUtils;
import gob.shcp.sireh.service.consultas.ConsultasService;
import gob.shcp.sireh.service.plaza.gestion.PlazaGestionService;

import java.io.IOException;

import java.io.OutputStream;

import java.text.SimpleDateFormat;

import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ReportePlazaController extends AbstractController implements AnnotatedController {
    
    private SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm");
    
    /**
     * Reporte D10.
     * @author Oscar S.
     * @param model Model
     * @param reportePlazaDTO ReportePlazaDTO
     * @return String
     */
    @RequestMapping
    public String dDiez(Model model, ReportePlazaDTO reportePlazaDTO) {
        if (reportePlazaDTO.isCancel()) {
            reportePlazaDTO = new ReportePlazaDTO();
        }
        // Validaciones
        reportePlazaDTO.setUniCicloRequired(Boolean.TRUE);
        reportePlazaDTO.setMesQnaRequired(Boolean.TRUE);
        
        model.addAttribute(reportePlazaDTO);
        return super.getViewName("dDiez");
    }
    
    /**
     * Reporte D10 (detalle).
     * @author Oscar S.
     * @param model Model
     * @param reportePlazaDTO ReportePlazaDTO
     * @return String
     */
    @RequestMapping
    public String dDiezDetalle(Model model, ReportePlazaDTO reportePlazaDTO) {
        if (reportePlazaDTO.isCancel()) {
            reportePlazaDTO = new ReportePlazaDTO();
        }
        // Validaciones
        reportePlazaDTO.setUniCicloRequired(Boolean.TRUE);
        reportePlazaDTO.setMesQnaRequired(Boolean.TRUE);
        
        model.addAttribute(reportePlazaDTO);
        return super.getViewName("dDiezDetalle");
    }
    
    /**
     * Reporte D10 (agrupado).
     * @author Oscar S.
     * @param model Model
     * @param reportePlazaDTO ReportePlazaDTO
     * @return String
     */
    @RequestMapping
    public String dDiezAgrupado(Model model, ReportePlazaDTO reportePlazaDTO) {
        if (reportePlazaDTO.isCancel()) {
            reportePlazaDTO = new ReportePlazaDTO();
        }
        // Validaciones
        reportePlazaDTO.setUniCicloRequired(Boolean.TRUE);
        reportePlazaDTO.setMesQnaRequired(Boolean.TRUE);
        
        model.addAttribute(reportePlazaDTO);
        return super.getViewName("dDiezAgrupado");
    }
    
    /**
     * Reporte INEGI.
     * @author Oscar S.
     * @param model Model
     * @param reportePlazaDTO ReportePlazaDTO
     * @return String
     */
    @RequestMapping
    public String inegi(Model model, ReportePlazaDTO reportePlazaDTO) {
        if (reportePlazaDTO.isCancel()) {
            reportePlazaDTO = new ReportePlazaDTO();
        }
        // Validaciones
        reportePlazaDTO.setMesQnaRequired(Boolean.TRUE);
        
        model.addAttribute(reportePlazaDTO);
        return super.getViewName("inegi");
    }
    
    /**
     * Reporte Plantilla de plazas de estructura.
     * @author Oscar S.
     * @param model Model
     * @param reportePlazaDTO ReportePlazaDTO
     * @return String
     */
    @RequestMapping
    public String plantillaEstructura(Model model, ReportePlazaDTO reportePlazaDTO) {
        if (reportePlazaDTO.isCancel()) {
            reportePlazaDTO = new ReportePlazaDTO();
        }
        // Validaciones
        reportePlazaDTO.setUniCicloRequired(Boolean.TRUE);
        reportePlazaDTO.setFileName("PlantillaEstructura_" + dateFormat.format(new Date()));
        
        model.addAttribute(reportePlazaDTO);
        return super.getViewName("plantillaEstructura");
    }
    
    /**
     * Reporte Plantilla de plazas eventuales.
     * @author Oscar S.
     * @param model Model
     * @param reportePlazaDTO ReportePlazaDTO
     * @return String
     */
    @RequestMapping
    public String plantillaEventual(Model model, ReportePlazaDTO reportePlazaDTO) {
        if (reportePlazaDTO.isCancel()) {
            reportePlazaDTO = new ReportePlazaDTO();
        }
        // Validaciones
        reportePlazaDTO.setUniCicloRequired(Boolean.TRUE);
        reportePlazaDTO.setFileName("PlantillaEventual_" + dateFormat.format(new Date()));
        
        model.addAttribute(reportePlazaDTO);
        return super.getViewName("plantillaEventual");
    }
    
    /**
     * Reporte Plantilla de plazas eventuales (especial).
     * @author Oscar S.
     * @param model Model
     * @param reportePlazaDTO ReportePlazaDTO
     * @return String
     */
    @RequestMapping
    public String plantillaEventualEsp(Model model, ReportePlazaDTO reportePlazaDTO) {
        if (reportePlazaDTO.isCancel()) {
            reportePlazaDTO = new ReportePlazaDTO();
        }
        // Validaciones
        reportePlazaDTO.setUniCicloRequired(Boolean.TRUE);
        reportePlazaDTO.setFileName("PlantillaEventualEsp_" + dateFormat.format(new Date()));
        
        model.addAttribute(reportePlazaDTO);
        return super.getViewName("plantillaEventualEsp");
    }
    
    /**
     * Reporte Plantilla de plazas de honorarios.
     * @author Oscar S.
     * @param model Model
     * @param reportePlazaDTO ReportePlazaDTO
     * @return String
     */
    @RequestMapping
    public String plantillaHonorarios(Model model, ReportePlazaDTO reportePlazaDTO) {
        if (reportePlazaDTO.isCancel()) {
            reportePlazaDTO = new ReportePlazaDTO();
        }
        // Validaciones
        reportePlazaDTO.setUniCicloRequired(Boolean.TRUE);
        reportePlazaDTO.setFileName("PlantillaHonorario_" + dateFormat.format(new Date()));
        
        model.addAttribute(reportePlazaDTO);
        return super.getViewName("plantillaHonorarios");
    }
    
    /**
     * Reporte Plazas vigentes x estructura, eventual y honorarios.
     * @author Oscar S.
     * @param model Model
     * @param reportePlazaDTO ReportePlazaDTO
     * @return String
     */
    @RequestMapping
    public String plazasVigentes(Model model, ReportePlazaDTO reportePlazaDTO) {
        if (reportePlazaDTO.isCancel()) {
            reportePlazaDTO = new ReportePlazaDTO();
        }
        // Validaciones
        reportePlazaDTO.setUniCicloRequired(Boolean.TRUE);
        reportePlazaDTO.setFileName("plazasVigentes_" + dateFormat.format(new Date()));
        
        model.addAttribute(reportePlazaDTO);
        return super.getViewName("plazasVigentes");
    }
    
    /**
     * Reporte Plazas vigentes x eventual.
     * @author Armando Zuñiga.
     * @param model Model
     * @param reportePlazaDTO ReportePlazaDTO
     * @return String
     */
    @RequestMapping
    public String plazasVigentesEve(Model model, ReportePlazaDTO reportePlazaDTO) {
        if (reportePlazaDTO.isCancel()) {
            reportePlazaDTO = new ReportePlazaDTO();
        }
        // Validaciones
        reportePlazaDTO.setUniCicloRequired(Boolean.TRUE);
        reportePlazaDTO.setFileName("plazasVigentesEve_" + dateFormat.format(new Date()));
        
        model.addAttribute(reportePlazaDTO);
        return super.getViewName("plazasVigentesEve");
    }
    
    /**
     * Reporte Plazas vigentes x Honorario.
     * @author Armando Zuñiga.
     * @param model Model
     * @param reportePlazaDTO ReportePlazaDTO
     * @return String
     */
    @RequestMapping
    public String plazasVigentesHon(Model model, ReportePlazaDTO reportePlazaDTO) {
        if (reportePlazaDTO.isCancel()) {
            reportePlazaDTO = new ReportePlazaDTO();
        }
        // Validaciones
        reportePlazaDTO.setUniCicloRequired(Boolean.TRUE);
        reportePlazaDTO.setFileName("plazasVigentesHon_" + dateFormat.format(new Date()));
        
        model.addAttribute(reportePlazaDTO);
        return super.getViewName("plazasVigentesHon");
    }
    
    /**
     * Reporte AC02 autorizado x jerarquía
     * @author Oscar S.
     * @param model Model
     * @param reportePlazaDTO ReportePlazaDTO
     * @return String
     */
    @RequestMapping
    public String acJerarquia(Model model, ReportePlazaDTO reportePlazaDTO) {
        if (reportePlazaDTO.isCancel()) {
            reportePlazaDTO = new ReportePlazaDTO();
        }
        // Validaciones
        reportePlazaDTO.setUniCicloRequired(Boolean.TRUE);
        
        model.addAttribute(reportePlazaDTO);
        return super.getViewName("acJerarquia");
    }
    
    /**
     * Reporte AC02 autorizado x nivel.
     * @author Oscar S.
     * @param model Model
     * @param reportePlazaDTO ReportePlazaDTO
     * @return String
     */
    @RequestMapping
    public String acNivel(Model model, ReportePlazaDTO reportePlazaDTO) {
        if (reportePlazaDTO.isCancel()) {
            reportePlazaDTO = new ReportePlazaDTO();
        }
        // Validaciones
        reportePlazaDTO.setUniCicloRequired(Boolean.TRUE);
        
        model.addAttribute(reportePlazaDTO);
        return super.getViewName("acNivel");
    }
    
    /**
     * Reporte Ocupación de plazas (vacante, ocupada).
     * @author Oscar S.
     * @param model Model
     * @param reportePlazaDTO ReportePlazaDTO
     * @return String
     */
    @RequestMapping
    public String ocupacionPlazas(Model model, ReportePlazaDTO reportePlazaDTO) {
        if (reportePlazaDTO.isCancel()) {
            reportePlazaDTO = new ReportePlazaDTO();
        }
        // Validaciones
        reportePlazaDTO.setUniCicloRequired(Boolean.TRUE);
        
        model.addAttribute(reportePlazaDTO);
        return super.getViewName("ocupacionPlazas");
    }
    
    /**
     * Reporte Ocupación de plazas reserva (vacante, ocupada, reserva).
     * @author Oscar S.
     * @param model Model
     * @param reportePlazaDTO ReportePlazaDTO
     * @return String
     */
    @RequestMapping
    public String ocupacionPlazasReserva(Model model, ReportePlazaDTO reportePlazaDTO) {
        if (reportePlazaDTO.isCancel()) {
            reportePlazaDTO = new ReportePlazaDTO();
        }
        // Validaciones
        reportePlazaDTO.setUniCicloRequired(Boolean.TRUE);
        
        model.addAttribute(reportePlazaDTO);
        return super.getViewName("ocupacionPlazasReserva");
    }
    
    /**
     * Reporte División escenario.
     * @author Oscar S.
     * @param model Model
     * @param reportePlazaDTO ReportePlazaDTO
     * @return String
     */
    @RequestMapping
    public String escenario(Model model, ReportePlazaDTO reportePlazaDTO) {
        if (reportePlazaDTO.isCancel()) {
            reportePlazaDTO = new ReportePlazaDTO();
        }
        // Validaciones
        reportePlazaDTO.setUniCicloRequired(Boolean.TRUE);
                
        model.addAttribute(reportePlazaDTO);
        return super.getViewName("escenario");
    }
    
    /**
     * Reporte División escenario situación.
     * @author Oscar S.
     * @param model Model
     * @param reportePlazaDTO ReportePlazaDTO
     * @return String
     */
    @RequestMapping
    public String escenarioSituacion(Model model, ReportePlazaDTO reportePlazaDTO) {
        if (reportePlazaDTO.isCancel()) {
            reportePlazaDTO = new ReportePlazaDTO();
        }
        // Validaciones
        reportePlazaDTO.setUniCicloRequired(Boolean.TRUE);
        
        model.addAttribute(reportePlazaDTO);
        return super.getViewName("escenarioSituacion");
    }
    
    /**
     * Reporte Vacancia x nivel.
     * @author Oscar S.
     * @param model Model
     * @param reportePlazaDTO ReportePlazaDTO
     * @return String
     */
    @RequestMapping
    public String vacanciaNivel(Model model, ReportePlazaDTO reportePlazaDTO) {
        if (reportePlazaDTO.isCancel()) {
            reportePlazaDTO = new ReportePlazaDTO();
        }
        // Validaciones
        reportePlazaDTO.setUniCicloRequired(Boolean.TRUE);
        
        model.addAttribute(reportePlazaDTO);
        return super.getViewName("vacanciaNivel");
    }
    
    /**
     * Reporte Reserva x UR nivel.
     * @author Oscar S.
     * @param model Model
     * @param reportePlazaDTO ReportePlazaDTO
     * @return String
     */
    @RequestMapping
    public String reservaUrNivel(Model model, ReportePlazaDTO reportePlazaDTO) {
        if (reportePlazaDTO.isCancel()) {
            reportePlazaDTO = new ReportePlazaDTO();
        }
        // Validaciones
        reportePlazaDTO.setUniCicloRequired(Boolean.TRUE);
        reportePlazaDTO.setIdUnidadRequired(Boolean.TRUE);

        List<String> dimensiones = super.security().getDimensionPrimaryLevel( "SIREHUNIDAD" );
        StringBuffer sb = new StringBuffer();
        for( String dim : dimensiones ) {
            sb.append( "'" ).append( dim ).append( "'," );
        }
        if( sb.length() > 0 ) {
            sb.delete( sb.length()-1, sb.length() );
        }
        reportePlazaDTO.setUnidades( sb.toString() );
        
        model.addAttribute(reportePlazaDTO);
        return super.getViewName("reservaUrNivel");
    }
    
    /**
     * Reporte Movimientos de personal (alta, baja, preventiva, promoción).
     * @author Oscar S.
     * @param model Model
     * @param reportePlazaDTO ReportePlazaDTO
     * @return String
     */
    @RequestMapping
    public String resumenMovPersonal(Model model, ReportePlazaDTO reportePlazaDTO) {
        if (reportePlazaDTO.isCancel()) {
            reportePlazaDTO = new ReportePlazaDTO();
        }
        // Validaciones
        reportePlazaDTO.setUniCicloRequired(Boolean.TRUE);
        reportePlazaDTO.setMesQnaRequired(Boolean.TRUE);
        
        model.addAttribute(reportePlazaDTO);
        return super.getViewName("resumenMovPersonal");
    }
    
    /**
     * Reporte Movimientos de personal detalle.
     * @author Oscar S.
     * @param model Model
     * @param reportePlazaDTO ReportePlazaDTO
     * @return String
     */
    @RequestMapping
    public String detalleMovPersonal(Model model, ReportePlazaDTO reportePlazaDTO) {
        if (reportePlazaDTO.isCancel()) {
            reportePlazaDTO = new ReportePlazaDTO();
        }
        // Validaciones
        reportePlazaDTO.setUniCicloRequired(Boolean.TRUE);
        reportePlazaDTO.setMesQnaRequired(Boolean.TRUE);
        
        model.addAttribute(reportePlazaDTO);
        return super.getViewName("detalleMovPersonal");
    }
    
    /**
     * Reporte Formato 542 personal ocupado y remuneración.
     * @author Oscar S.
     * @param model Model
     * @param reportePlazaDTO ReportePlazaDTO
     * @return String
     */
    @RequestMapping
    public String formato(Model model, ReportePlazaDTO reportePlazaDTO) {
        if (reportePlazaDTO.isCancel()) {
            reportePlazaDTO = new ReportePlazaDTO();
        }
        // Validaciones
        reportePlazaDTO.setUniCicloRequired(Boolean.TRUE);
        reportePlazaDTO.setMesQnaRequired(Boolean.TRUE);
        
        model.addAttribute(reportePlazaDTO);
        return super.getViewName("formato");
    }
    
    /**
     * Reporte POT.
     * @author Oscar S.
     * @param model Model
     * @param reportePlazaDTO ReportePlazaDTO
     * @return String
     */
    @RequestMapping
    public String pot(Model model, ReportePlazaDTO reportePlazaDTO, HttpServletResponse response) throws IOException {
    
        List<String> datos = null;
    
        if(reportePlazaDTO.getQnaCaptura() != null){
        
            if(reportePlazaDTO.getQnaCaptura().equals("0")){
                 super.saveError(model, "Falta seleccionar la quincena a procesar");
                 reportePlazaDTO.setMuestraReporte(false);
                 //return super.getViewName("pot");
            }
            
            if(reportePlazaDTO.getOrigen() == null){
                super.saveError(model, "Seleccione el tipo de archivo");
                reportePlazaDTO.setMuestraReporte(false);
                //return super.getViewName("pot");
            }
            
            if( !(reportePlazaDTO.getQnaCaptura().equals("0") ) && (reportePlazaDTO.getOrigen() != null) ){
                
                datos = super.getService(PlazaGestionService.class).pot(reportePlazaDTO);
                
                if (datos.isEmpty()) {
                    super.saveWarning(model, "warn.empty.chkolist");
                    return super.getViewName("pot");
                }
                else {
                    
                    StringBuilder strCsv = new StringBuilder();
                    for (String renglon: datos) {
                        strCsv.append(renglon).append("\r\n");
                         }
                    
                        reportePlazaDTO.setMuestraReporte(false);
                        byte[] bytes = strCsv.toString().getBytes();
                        response.setContentType("text/csv");
                        response.setContentLength(bytes.length);
                        
                        if (reportePlazaDTO.getOrigen().equalsIgnoreCase("e")) {
                            response.setHeader("Content-Disposition", "attachment; filename=\"" + "POT_ESCENARIO_" + reportePlazaDTO.getQnaCaptura() + ".csv");
                        }
                        else if (reportePlazaDTO.getOrigen().equalsIgnoreCase("i")){
                            response.setHeader("Content-Disposition", "attachment; filename=\"" + "POT_INMUEBLES_" + reportePlazaDTO.getQnaCaptura() + ".csv");
                        }
                        else if (reportePlazaDTO.getOrigen().equalsIgnoreCase("a")){
                            response.setHeader("Content-Disposition", "attachment; filename=\"" + "POT_ALTAS_" + reportePlazaDTO.getQnaCaptura() + ".csv");
                        }
                        else if (reportePlazaDTO.getOrigen().equalsIgnoreCase("b")){
                            response.setHeader("Content-Disposition", "attachment; filename=\"" + "POT_BAJAS_" + reportePlazaDTO.getQnaCaptura() + ".csv");
                        }
                        else if (reportePlazaDTO.getOrigen().equalsIgnoreCase("d")){
                            response.setHeader("Content-Disposition", "attachment; filename=\"" + "POT_DIRECTORIO_" + reportePlazaDTO.getQnaCaptura() + ".csv");
                        }
                        else if (reportePlazaDTO.getOrigen().equalsIgnoreCase("r")){
                            response.setHeader("Content-Disposition", "attachment; filename=\"" + "POT_REMUNERACIONES_" + reportePlazaDTO.getQnaCaptura() + ".csv");
                        }
                        else if (reportePlazaDTO.getOrigen().equalsIgnoreCase("f")){
                            response.setHeader("Content-Disposition", "attachment; filename=\"" + "POT_FUNCIONES_" + reportePlazaDTO.getQnaCaptura() + ".csv");
                        }
                        else if (reportePlazaDTO.getOrigen().equalsIgnoreCase("s")){
                            response.setHeader("Content-Disposition", "attachment; filename=\"" + "POT_ESTADISTICO_" + reportePlazaDTO.getQnaCaptura() + ".csv");
                        }


                        OutputStream out = response.getOutputStream();
                        out.write(bytes, 0, bytes.length);
                        return null;
                }
                
            }            
            
        }
            
        model.addAttribute(reportePlazaDTO);
        return super.getViewName("pot");
    }
    
    /**
     * Reporte POT (eventual).
     * @author Oscar S.
     * @param model Model
     * @param reportePlazaDTO ReportePlazaDTO
     * @return String
     */
    @RequestMapping
    public String potEventual(Model model, ReportePlazaDTO reportePlazaDTO) {
        if (reportePlazaDTO.isCancel()) {
            reportePlazaDTO = new ReportePlazaDTO();
        }
        // Validaciones
        //reportePlazaDTO.setUniCicloRequired(Boolean.TRUE);
        reportePlazaDTO.setMesQnaRequired(Boolean.TRUE);
        
        model.addAttribute(reportePlazaDTO);
        return super.getViewName("potEventual");
    }
    
    /**
     * Reporte POT (honorarios).
     * @author Oscar S.
     * @param model Model
     * @param reportePlazaDTO ReportePlazaDTO
     * @return String
     */
    @RequestMapping
    public String potHonorarios(Model model, ReportePlazaDTO reportePlazaDTO) {
        if (reportePlazaDTO.isCancel()) {
            reportePlazaDTO = new ReportePlazaDTO();
        }
        // Validaciones
        //reportePlazaDTO.setUniCicloRequired(Boolean.TRUE);
        reportePlazaDTO.setMesQnaRequired(Boolean.TRUE);
        
        model.addAttribute(reportePlazaDTO);
        return super.getViewName("potHonorarios");
    }
    
    /**
     * Reporte POT (ocupada).
     * @author Oscar S.
     * @param model Model
     * @param reportePlazaDTO ReportePlazaDTO
     * @return String
     */
    @RequestMapping
    public String potOcupada(Model model, ReportePlazaDTO reportePlazaDTO) {
        if (reportePlazaDTO.isCancel()) {
            reportePlazaDTO = new ReportePlazaDTO();
        }
        // Validaciones
        //reportePlazaDTO.setUniCicloRequired(Boolean.TRUE);
        reportePlazaDTO.setMesQnaRequired(Boolean.TRUE);
        
        if (reportePlazaDTO.isMuestraReporte()) {
            sacaQnas(reportePlazaDTO);
        }        
        model.addAttribute(reportePlazaDTO);
        return super.getViewName("potOcupada");
    }
    
    /**
     * Reporte POT (vacante).
     * @author Oscar S.
     * @param model Model
     * @param reportePlazaDTO ReportePlazaDTO
     * @return String
     */
    @RequestMapping
    public String potVacante(Model model, ReportePlazaDTO reportePlazaDTO) {
        if (reportePlazaDTO.isCancel()) {
            reportePlazaDTO = new ReportePlazaDTO();
        }
        // Validaciones
        //reportePlazaDTO.setUniCicloRequired(Boolean.TRUE);
        reportePlazaDTO.setMesQnaRequired(Boolean.TRUE);
        
        if (reportePlazaDTO.isMuestraReporte()) {
            sacaQnas(reportePlazaDTO);
        }
        model.addAttribute(reportePlazaDTO);
        return super.getViewName("potVacante");
    }
    
    /**
     * Reporte MEG.
     * @author Oscar S.
     * @param model Model
     * @param reportePlazaDTO ReportePlazaDTO
     * @return String
     */
    @RequestMapping
    public String meg(Model model, ReportePlazaDTO reportePlazaDTO) {
        if (reportePlazaDTO.isCancel()) {
            reportePlazaDTO = new ReportePlazaDTO();
        }
        // Validaciones
        reportePlazaDTO.setUniCicloRequired(Boolean.TRUE);
        reportePlazaDTO.setMesQnaRequired(Boolean.TRUE);
        
        model.addAttribute(reportePlazaDTO);
        return super.getViewName("meg");
    }

    @RequestMapping
    public String sefupu(Model model) {
        return super.getViewName("sefupu");
    }
    
    public void sacaQnas(ReportePlazaDTO reportePlazaDTO){
        String qna=reportePlazaDTO.getMesQna().substring(4,6);
        reportePlazaDTO.setQnaCaptura2(reportePlazaDTO.getMesQna());       
        if(qna.equals("02") || qna.equals("04")||qna.equals("06") || qna.equals("08") || qna.equals("10"))
            { 
            reportePlazaDTO.setQnaCaptura2(reportePlazaDTO.getMesQna().substring(0,4)+"0"+(Integer.parseInt(qna)-1));
            }
        if(qna.equals("12") || qna.equals("14")||qna.equals("16") || qna.equals("18") || qna.equals("20") || qna.equals("22"))
            { 
            reportePlazaDTO.setQnaCaptura2(reportePlazaDTO.getMesQna().substring(0,4)+(Integer.parseInt(qna)-1));
            }        
    }
    
    /**
     * Reporte PNT ESTRUCTURA
     * @author Oscar S.
     * @param model Model
     * @param reportePlazaDTO ReportePlazaDTO
     * @return String
     */
    @RequestMapping
    public String pntestructura(Model model, ReportePlazaDTO reportePlazaDTO, HttpServletResponse response) throws IOException {
    
        List<String> datos = null;
    
        if(reportePlazaDTO.getQnaCaptura() != null){
        
            if(reportePlazaDTO.getQnaCaptura().equals("0")){
                 super.saveError(model, "Falta seleccionar la quincena a procesar");
                 reportePlazaDTO.setMuestraReporte(false);
                 //return super.getViewName("pot");
            }
            
            if( !(reportePlazaDTO.getQnaCaptura().equals("0")) ){
                
                datos = super.getService(PlazaGestionService.class).pntestructura(reportePlazaDTO);
                
                if (datos.isEmpty()) {
                    super.saveWarning(model, "warn.empty.chkolist");
                    return super.getViewName("pntestructura");
                }
                else {
                    
                    StringBuilder strCsv = new StringBuilder();
                    for (String renglon: datos) {
                        strCsv.append(renglon).append("\r\n");
                         }
                    
                        reportePlazaDTO.setMuestraReporte(false);
                        byte[] bytes = strCsv.toString().getBytes();
                        response.setContentType("text/csv");
                        response.setContentLength(bytes.length);
                        response.setHeader("Content-Disposition", "attachment; filename=\"" + "PNT_ESCENARIO_" + reportePlazaDTO.getQnaCaptura() + ".csv");
                        OutputStream out = response.getOutputStream();
                        out.write(bytes, 0, bytes.length);
                        return null;
                }
                
            }            
            
        }
            
        model.addAttribute(reportePlazaDTO);
        return super.getViewName("pntestructura");
    }

    /**
     * Reporte PNT DIRECTORIO.
     * @author Oscar S.
     * @param model Model
     * @param reportePlazaDTO ReportePlazaDTO
     * @return String
     */
    @RequestMapping
    public String pntdirectorio(Model model, ReportePlazaDTO reportePlazaDTO, HttpServletResponse response) throws IOException {
    
        List<String> datos = null;
    
        if(reportePlazaDTO.getQnaCaptura() != null){
        
            if(reportePlazaDTO.getQnaCaptura().equals("0")){
                 super.saveError(model, "Falta seleccionar la quincena a procesar");
                 reportePlazaDTO.setMuestraReporte(false);
                 //return super.getViewName("pot");
            }
            
            if( !(reportePlazaDTO.getQnaCaptura().equals("0") ) ){
                
                datos = super.getService(PlazaGestionService.class).pntdirectorio(reportePlazaDTO);
                
                if (datos.isEmpty()) {
                    super.saveWarning(model, "warn.empty.chkolist");
                    return super.getViewName("pntdirectorio");
                }
                else {
                    
                    StringBuilder strCsv = new StringBuilder();
                    for (String renglon: datos) {
                        strCsv.append(renglon).append("\r\n");
                         }
                    
                        reportePlazaDTO.setMuestraReporte(false);
                        byte[] bytes = strCsv.toString().getBytes();
                        response.setContentType("text/csv");
                        response.setContentLength(bytes.length);
                        response.setHeader("Content-Disposition", "attachment; filename=\"" + "PNT_DIRECTORIO_" + reportePlazaDTO.getQnaCaptura() + ".csv");
                        OutputStream out = response.getOutputStream();
                        out.write(bytes, 0, bytes.length);
                        return null;
                }
                
            }            
            
        }
            
        model.addAttribute(reportePlazaDTO);
        return super.getViewName("pntdirectorio");
    }

    /**
     * Reporte PNT REMUNERACION.
     * @author Oscar S.
     * @param model Model
     * @param reportePlazaDTO ReportePlazaDTO
     * @return String
     */
    @RequestMapping
    public String pntremuneracion(Model model, ReportePlazaDTO reportePlazaDTO, HttpServletResponse response) throws IOException {
    
        model.addAttribute(reportePlazaDTO);
        return super.getViewName("pntremuneracion");
    }
    
    @RequestMapping
    public String descargaPntremuneracion(Model model, ReportePlazaDTO reportePlazaDTO, HttpServletResponse response) throws IOException {
        List<String> datos = null;
        
        if(reportePlazaDTO.getQnaCaptura() != null){
        
            if(reportePlazaDTO.getQnaCaptura().equals("0")){
                 super.saveError(model, "Falta seleccionar la quincena a procesar");
                 reportePlazaDTO.setMuestraReporte(false);
                 //return super.getViewName("pot");
            }
            
            if( !(reportePlazaDTO.getQnaCaptura().equals("0") ) ){
                
                datos = super.getService(PlazaGestionService.class).pntremuneracion(reportePlazaDTO);
                
                if (datos.isEmpty()) {
                    super.saveWarning(model, "warn.empty.chkolist");
                    return super.getViewName("pntremuneracion");
                }
                else {
                    
                    StringBuilder strCsv = new StringBuilder();
                    for (String renglon: datos) {
                        strCsv.append(renglon).append("\r\n");
                         }
                    
                        reportePlazaDTO.setMuestraReporte(false);
                        byte[] bytes = strCsv.toString().getBytes();
                        response.setContentType("text/csv");
                        response.setContentLength(bytes.length);
                        response.setHeader("Content-Disposition", "attachment; filename=\"" + "PNT_REMUNERACIO_" + reportePlazaDTO.getQnaCaptura() + ".csv");
                        OutputStream out = response.getOutputStream();
                        out.write(bytes, 0, bytes.length);

                }
                
            }            
            
        }
        return null;
    }
    
    
    

    /**
     * Reporte PNT ESTADISTICO.
     * @author Oscar S.
     * @param model Model
     * @param reportePlazaDTO ReportePlazaDTO
     * @return String
     */
    @RequestMapping
    public String pnttotalplazas(Model model, ReportePlazaDTO reportePlazaDTO, HttpServletResponse response) throws IOException {
    
        List<String> datos = null;
    
        if(reportePlazaDTO.getQnaCaptura() != null){
        
            if(reportePlazaDTO.getQnaCaptura().equals("0")){
                 super.saveError(model, "Falta seleccionar la quincena a procesar");
                 reportePlazaDTO.setMuestraReporte(false);
                 //return super.getViewName("pot");
            }
            
            if( !(reportePlazaDTO.getQnaCaptura().equals("0") ) ){
                
                datos = super.getService(PlazaGestionService.class).pntestadistico(reportePlazaDTO);
                
                if (datos.isEmpty()) {
                    super.saveWarning(model, "warn.empty.chkolist");
                    return super.getViewName("pnttotalplazas");
                }
                else {
                    
                    StringBuilder strCsv = new StringBuilder();
                    for (String renglon: datos) {
                        strCsv.append(renglon).append("\r\n");
                         }
                    
                        reportePlazaDTO.setMuestraReporte(false);
                        byte[] bytes = strCsv.toString().getBytes();
                        response.setContentType("text/csv");
                        response.setContentLength(bytes.length);
                       response.setHeader("Content-Disposition", "attachment; filename=\"" + "PNT_ESTADISTICO_" + reportePlazaDTO.getQnaCaptura() + ".csv");
                        OutputStream out = response.getOutputStream();
                        out.write(bytes, 0, bytes.length);
                        return null;
                }
                
            }            
            
        }
            
        model.addAttribute(reportePlazaDTO);
        return super.getViewName("pnttotalplazas");
    }

    /**
     * Reporte PNT FACULTADES.
     * @author Oscar S.
     * @param model Model
     * @param reportePlazaDTO ReportePlazaDTO
     * @return String
     */
    @RequestMapping
    public String pntfacultadesarea(Model model, ReportePlazaDTO reportePlazaDTO, HttpServletResponse response) throws IOException {
    
        List<String> datos = null;
    
        if(reportePlazaDTO.getQnaCaptura() != null){
        
            if(reportePlazaDTO.getQnaCaptura().equals("0")){
                 super.saveError(model, "Falta seleccionar la quincena a procesar");
                 reportePlazaDTO.setMuestraReporte(false);
                 //return super.getViewName("pot");
            }
            
            if( !(reportePlazaDTO.getQnaCaptura().equals("0") ) ){
                
                datos = super.getService(PlazaGestionService.class).pntfuncion(reportePlazaDTO);
                
                if (datos.isEmpty()) {
                    super.saveWarning(model, "warn.empty.chkolist");
                    return super.getViewName("pntfacultadesarea");
                }
                else {
                    
                    StringBuilder strCsv = new StringBuilder();
                    for (String renglon: datos) {
                        strCsv.append(renglon).append("\r\n");
                         }
                    
                        reportePlazaDTO.setMuestraReporte(false);
                        byte[] bytes = strCsv.toString().getBytes();
                        response.setContentType("text/csv");
                        response.setContentLength(bytes.length);
                        response.setHeader("Content-Disposition", "attachment; filename=\"" + "PNT_FACULTADES_" + reportePlazaDTO.getQnaCaptura() + ".csv");
                        OutputStream out = response.getOutputStream();
                        out.write(bytes, 0, bytes.length);
                        return null;
                }
                
            }            
            
        }
            
        model.addAttribute(reportePlazaDTO);
        return super.getViewName("pntfacultadesarea");
    }

    /**
     * Reporte PNT INMUEBLES.
     * @author Oscar S.
     * @param model Model
     * @param reportePlazaDTO ReportePlazaDTO
     * @return String
     */
    @RequestMapping
    public String pntinmueble(Model model, ReportePlazaDTO reportePlazaDTO, HttpServletResponse response) throws IOException {
    
        List<String> datos = null;
    
        if(reportePlazaDTO.getQnaCaptura() != null){
        
            if(reportePlazaDTO.getQnaCaptura().equals("0")){
                 super.saveError(model, "Falta seleccionar la quincena a procesar");
                 reportePlazaDTO.setMuestraReporte(false);
                 //return super.getViewName("pot");
            }
            
            if( !(reportePlazaDTO.getQnaCaptura().equals("0") ) ){
                
                datos = super.getService(PlazaGestionService.class).pntinmueble(reportePlazaDTO);
                
                if (datos.isEmpty()) {
                    super.saveWarning(model, "warn.empty.chkolist");
                    return super.getViewName("pntinmueble");
                }
                else {
                    
                    StringBuilder strCsv = new StringBuilder();
                    for (String renglon: datos) {
                        strCsv.append(renglon).append("\r\n");
                         }
                    
                        reportePlazaDTO.setMuestraReporte(false);
                        byte[] bytes = strCsv.toString().getBytes();
                        response.setContentType("text/csv");
                        response.setContentLength(bytes.length);
                        response.setHeader("Content-Disposition", "attachment; filename=\"" + "PNT_INMUEBLES_" + reportePlazaDTO.getQnaCaptura() + ".csv");
                        OutputStream out = response.getOutputStream();
                        out.write(bytes, 0, bytes.length);
                        return null;
                }
                
            }            
            
        }
            
        model.addAttribute(reportePlazaDTO);
        return super.getViewName("pntinmueble");
    }

    /**
     * Reporte PNT ALTAS.
     * @author Oscar S.
     * @param model Model
     * @param reportePlazaDTO ReportePlazaDTO
     * @return String
     */
    @RequestMapping
    public String pntaltas(Model model, ReportePlazaDTO reportePlazaDTO, HttpServletResponse response) throws IOException {
    
        List<String> datos = null;
    
        if(reportePlazaDTO.getQnaCaptura() != null){
        
            if(reportePlazaDTO.getQnaCaptura().equals("0")){
                 super.saveError(model, "Falta seleccionar la quincena a procesar");
                 reportePlazaDTO.setMuestraReporte(false);
                 //return super.getViewName("pot");
            }
            
            if( !(reportePlazaDTO.getQnaCaptura().equals("0") ) ){
                
                datos = super.getService(PlazaGestionService.class).pntaltas(reportePlazaDTO);
                
                if (datos.isEmpty()) {
                    super.saveWarning(model, "warn.empty.chkolist");
                    return super.getViewName("pntaltas");
                }
                else {
                    
                    StringBuilder strCsv = new StringBuilder();
                    for (String renglon: datos) {
                        strCsv.append(renglon).append("\r\n");
                         }
                    
                        reportePlazaDTO.setMuestraReporte(false);
                        byte[] bytes = strCsv.toString().getBytes();
                        response.setContentType("text/csv");
                        response.setContentLength(bytes.length);
                        response.setHeader("Content-Disposition", "attachment; filename=\"" + "PNT_ALTAS_" + reportePlazaDTO.getQnaCaptura() + ".csv");
                        OutputStream out = response.getOutputStream();
                        out.write(bytes, 0, bytes.length);
                        return null;
                }
                
            }            
            
        }
            
        model.addAttribute(reportePlazaDTO);
        return super.getViewName("pntaltas");
    }

    /**
     * Reporte PNT BAJAS.
     * @author Oscar S.
     * @param model Model
     * @param reportePlazaDTO ReportePlazaDTO
     * @return String
     */
    @RequestMapping
    public String pntbajas(Model model, ReportePlazaDTO reportePlazaDTO, HttpServletResponse response) throws IOException {
    
        List<String> datos = null;
    
        if(reportePlazaDTO.getQnaCaptura() != null){
        
            if(reportePlazaDTO.getQnaCaptura().equals("0")){
                 super.saveError(model, "Falta seleccionar la quincena a procesar");
                 reportePlazaDTO.setMuestraReporte(false);
                 //return super.getViewName("pot");
            }
            
            if( !(reportePlazaDTO.getQnaCaptura().equals("0") ) ){
                
                datos = super.getService(PlazaGestionService.class).pntbajas(reportePlazaDTO);
                
                if (datos.isEmpty()) {
                    super.saveWarning(model, "warn.empty.chkolist");
                    return super.getViewName("pntbajas");
                }
                else {
                    
                    StringBuilder strCsv = new StringBuilder();
                    for (String renglon: datos) {
                        strCsv.append(renglon).append("\r\n");
                         }
                    
                        reportePlazaDTO.setMuestraReporte(false);
                        byte[] bytes = strCsv.toString().getBytes();
                        response.setContentType("text/csv");
                        response.setContentLength(bytes.length);
                        response.setHeader("Content-Disposition", "attachment; filename=\"" + "PNT_BAJAS_" + reportePlazaDTO.getQnaCaptura() + ".csv");
                        OutputStream out = response.getOutputStream();
                        out.write(bytes, 0, bytes.length);
                        return null;
                }
                
            }            
            
        }
            
        model.addAttribute(reportePlazaDTO);
        return super.getViewName("pntbajas");
    }

    /**
     * Reporte PNT CONTRATACION HONORARIOS.
     * @author Cesar Bautista.
     * @param model Model
     * @param reportePlazaDTO ReportePlazaDTO
     * @return String
     */
    @RequestMapping
    public String pntcontratacionhonorarios(Model model, ReportePlazaDTO reportePlazaDTO, HttpServletResponse response) throws IOException {
    
        List<String> datos = null;
    
        if(reportePlazaDTO.getQnaCaptura() != null){
        
            if(reportePlazaDTO.getQnaCaptura().equals("0")){
                 super.saveError(model, "Falta seleccionar la quincena a procesar");
                 reportePlazaDTO.setMuestraReporte(false);
                 //return super.getViewName("pot");
            }
            
            if( !(reportePlazaDTO.getQnaCaptura().equals("0") ) ){
                
                datos = super.getService(PlazaGestionService.class).pntcontratacionhonorarios(reportePlazaDTO);
                
                if (datos.isEmpty()) {
                    super.saveWarning(model, "warn.empty.chkolist");
                    return super.getViewName("pntcontratacionhonorarios");
                }
                else {
                    
                    StringBuilder strCsv = new StringBuilder();
                    for (String renglon: datos) {
                        strCsv.append(renglon).append("\r\n");
                         }
                    
                        reportePlazaDTO.setMuestraReporte(false);
                        byte[] bytes = strCsv.toString().getBytes();
                        response.setContentType("text/csv");
                        response.setContentLength(bytes.length);
                        response.setHeader("Content-Disposition", "attachment; filename=\"" + "PNT_CONTRATACION_HONORARIOS_" + reportePlazaDTO.getQnaCaptura() + ".csv");
                        OutputStream out = response.getOutputStream();
                        out.write(bytes, 0, bytes.length);
                        return null;
                }
                
            }            
            
        }
            
        model.addAttribute(reportePlazaDTO);
        return super.getViewName("pntcontratacionhonorarios");
    }

    @RequestMapping
    public String expLabCV(Model model, ExpLabCVDTO expLabCVDTO){
        if((expLabCVDTO.getRfcEmpleado() != null) && (expLabCVDTO.getCiclo() != null)){
            if(expLabCVDTO.isLimpiar()){
                expLabCVDTO = new ExpLabCVDTO();
            }
            else {
                String nombreEmpleado = super.getService(ConsultasService.class).getNombreEmpleado(expLabCVDTO.getRfcEmpleado());
                if(!nombreEmpleado.equalsIgnoreCase("")){
                    expLabCVDTO.setNombreEmpleado(nombreEmpleado);
                    expLabCVDTO.setMuestraReporte(true);
                } else {  expLabCVDTO.setMuestraReporte(false); super.saveWarning(model, "No se encontro informacion asociada a la peticion. Intente nuevamente con otros parametros. ");   }
            }
        }
        model.addAttribute(expLabCVDTO);
        return super.getViewName("curriculumVitae");
    }

}
