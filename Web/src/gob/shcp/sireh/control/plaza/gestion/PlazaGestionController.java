package gob.shcp.sireh.control.plaza.gestion;

import gob.shcp.fsn.control.AbstractController;
import gob.shcp.fsn.control.support.AnnotatedController;

import gob.shcp.sireh.model.plaza.gestion.ConsultaGeneralDTO;
import gob.shcp.sireh.model.plaza.gestion.ConsultaLineaDTO;
import gob.shcp.sireh.model.plaza.gestion.ConsultaMovtosPersonalDTO;
import gob.shcp.sireh.model.plaza.gestion.ConsultaPlazaAdecuacionDTO;
import gob.shcp.sireh.model.plaza.gestion.ConsultaPlazaSoporteDTO;

import gob.shcp.sireh.model.plaza.gestion.ConsultaPlazaSpcDTO;
import gob.shcp.sireh.model.plaza.reporte.ReportePlazaDTO;

import gob.shcp.sireh.service.plaza.gestion.PlazaGestionService;



import java.io.IOException;
import java.io.OutputStream;

import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Controlador encargado de atender solicitudes correspondientes a Gestion de Plazas.
 */
@Controller
public class PlazaGestionController extends AbstractController implements AnnotatedController {

    /**
     * Metodo encargado de consultar plazas.
     * @author Roberto Muñoz.
     * @param model Model
     * @param consultaGeneralDTO ConsultaGeneralDTO
     * @return String
     */
    @RequestMapping
    public String consultaGeneral(Model model, ConsultaGeneralDTO consultaGeneralDTO) {
        if(consultaGeneralDTO.isCancel()) {
            consultaGeneralDTO = new ConsultaGeneralDTO();
        }
        // Bean Name pagedList
        consultaGeneralDTO.setBeanName("consultaGeneral");
        
        // Navegacion
        consultaGeneralDTO.setUrlOrigen("consultaGeneral");
        consultaGeneralDTO.setUrlDestino("consultaLinea");
        
        // Obtener Ciclo
        consultaGeneralDTO.setUniCiclo(super.security().getOperationYear());
        
        model.addAttribute(consultaGeneralDTO);
        return super.getViewName("consultaGeneral");
    }
    
    /**
     * Metodo encargado de obtener el id de la Plaza para mostrar su detalle.
     * @author Roberto Muñoz.
     * @param model Model
     * @param idPlaza Integer
     * @return String
     */
    @RequestMapping
    public String consultaLinea(Model model, @RequestParam("idPlaza") Integer idPlaza) {
        // Obtener Empleado - Plaza
        ConsultaLineaDTO consultaLineaDTO = super.getService(PlazaGestionService.class).getEmpleadoPlaza(idPlaza);    
        
        consultaLineaDTO.setUrlRegreso("consultaGeneral");
        
        model.addAttribute(consultaLineaDTO);
        return super.getViewName("consultaLinea");
    }

    /**
     * Metodo encargado de consultar las plazas soporte.
     * @author Roberto Muñoz.
     * @param model Model
     * @param consultaPlazaSoporteDTO ConsultaPlazaSoporteDTO
     * @return String
     */
    @RequestMapping
    public String consultaPlazaSoporte(Model model, ConsultaPlazaSoporteDTO consultaPlazaSoporteDTO) {
        if (consultaPlazaSoporteDTO.isCancel()) {
            consultaPlazaSoporteDTO = new ConsultaPlazaSoporteDTO();
        }
        // Bean Name pagedList
        consultaPlazaSoporteDTO.setBeanName("consultaGeneral");
        
        // Navegacion
        consultaPlazaSoporteDTO.setUrlOrigen("consultaPlazaSoporte");
        consultaPlazaSoporteDTO.setUrlDestino("consultaLineaSoporte");
        
        // Obtener Ciclo
        consultaPlazaSoporteDTO.setUniCiclo(super.security().getOperationYear());

        model.addAttribute(consultaPlazaSoporteDTO);      
        return super.getViewName("consultaPlazaSoporte");
    }
    
    /**
     * Metodo encargado de obtener el id de la Plaza para mostrar su detalle.
     * @author Roberto Muñoz.
     * @param model Model
     * @param idPlaza Integer
     * @return String
     */
    @RequestMapping
    public String consultaLineaSoporte(Model model, @RequestParam("idPlaza") Integer idPlaza) {
        // Obtener Empleado - Plaza
        ConsultaLineaDTO consultaLineaDTO = super.getService(PlazaGestionService.class).getEmpleadoPlaza(idPlaza);    
        
        consultaLineaDTO.setUrlRegreso("consultaPlazaSoporte");
        
        model.addAttribute(consultaLineaDTO);
        return super.getViewName("consultaLinea");
    }

    /**
     * Metodo encargado de consultar adecuacion de plaza.
     * @author Roberto Muñoz.
     * @param model Model
     * @param consultaPlazaAdecuacionDTO ConsultaPlazaAdecuacionDTO
     * @return String
     */
    @RequestMapping
    public String consultaPlazaAdecuacion(Model model, ConsultaPlazaAdecuacionDTO consultaPlazaAdecuacionDTO) {
        if(consultaPlazaAdecuacionDTO.isCancel()){
            consultaPlazaAdecuacionDTO = new ConsultaPlazaAdecuacionDTO();
        }
        // Bean Name pagedList
        consultaPlazaAdecuacionDTO.setBeanName("consultaPlazaAdecuacion");
        
        // Navegacion
        consultaPlazaAdecuacionDTO.setUrlOrigen("consultaPlazaAdecuacion");
               
        // Obtener Ciclo
        consultaPlazaAdecuacionDTO.setUniCiclo(super.security().getOperationYear());
        
        model.addAttribute(consultaPlazaAdecuacionDTO);
        return super.getViewName("consultaPlazaAdecuacion");
    }

    @RequestMapping
    public String consultaAdecuacionPlaza(Model model) {
        return super.getViewName("consultaAdecuacionPlaza");
    }

    /**
     * Metodo encargado de consultar movimientos de personal.
     * @author Roberto Muñoz.
     * @param model Model
     * @param consultaMovtosPersonalDTO ConsultaMovtosPersonalDTO
     * @return String
     */
    @RequestMapping
    public String consultaMovtosPersonal(Model model, ConsultaMovtosPersonalDTO consultaMovtosPersonalDTO) {
        if(consultaMovtosPersonalDTO.isCancel()){
            consultaMovtosPersonalDTO = new ConsultaMovtosPersonalDTO();
        }
        // Bean Name pagedList
        consultaMovtosPersonalDTO.setBeanName("consultaMovtosPersonal");
        
        // Navegacion
        consultaMovtosPersonalDTO.setUrlOrigen("consultaMovtosPersonal");
        
        // Obtener Ciclo
        consultaMovtosPersonalDTO.setUniCiclo(super.security().getOperationYear());
        
        model.addAttribute(consultaMovtosPersonalDTO);
        return super.getViewName("consultaMovtosPersonal");
    }
    
    @RequestMapping
    public String cargaInicio(Model model) {
        return super.getViewName("cargaInicio");
    }
    
    /**
     * Archivo dinámico de plazas vigentes
     * @author Ricardo L.
     * @param model Model
     * @param reportePlazaDTO ReportePlazaDTO
     * @return String
     */
    @RequestMapping
    public String consultaVigentesDinamico(Model model, ReportePlazaDTO reportePlazaDTO, HttpServletResponse response) throws IOException {
        String fileName;
        String nombre;
        fileName = null;
        nombre = null;
        String uniCiclo = super.security().getOperationYear();
        //String ciclo = ruspBajaDTO.getRbCiclo();
        StringBuilder strCsv = new StringBuilder();

        // Aqui va el codigo de lo que hace el metodo....    :-)
         nombre = "ArchivoplazasVigentes";
                       
        List<String> datos = super.getService(PlazaGestionService.class).getConsultaPlazasVigentes(reportePlazaDTO);

        for (String renglon: datos) {
             strCsv.append(renglon).append("\r\n");
        }
                
        byte[] bytes = strCsv.toString().getBytes();
        response.setContentType("text/plain");
        response.setContentLength(bytes.length);
        response.setHeader("Content-Disposition", "attachment; filename=\"" + nombre + ".csv");
        OutputStream out = response.getOutputStream();
        out.write(bytes, 0, bytes.length);

        return null;
    }

    @RequestMapping
    public String consultaPlazaSpc(Model model, ConsultaPlazaSpcDTO consultaPlazaSpcDTO) {
        if(consultaPlazaSpcDTO.isCancel() ){
            consultaPlazaSpcDTO = new ConsultaPlazaSpcDTO();
        }
        consultaPlazaSpcDTO.setBeanName("consultaPlazaSpc");
        consultaPlazaSpcDTO.setFilter("translate(es.nombre_puesto, 'ÁÉÍÓÚ', 'AEIOU')");
        if(consultaPlazaSpcDTO.getNombrePuesto() != null ){
            String nombrePuesto = consultaPlazaSpcDTO.getNombrePuesto();
            nombrePuesto = nombrePuesto.replace('Á', 'A');
            nombrePuesto = nombrePuesto.replace('É', 'E');
            nombrePuesto = nombrePuesto.replace('Í', 'I');
            nombrePuesto = nombrePuesto.replace('Ó', 'O');
            nombrePuesto = nombrePuesto.replace('Ú', 'U');
            consultaPlazaSpcDTO.setNombrePuesto(nombrePuesto);
        }
        consultaPlazaSpcDTO.setUrlOrigen("consultaPlazaSpc"); 
        model.addAttribute(consultaPlazaSpcDTO);
        return super.getViewName("consultaPlazaSpc");
    }
    
    @RequestMapping
    public String consultaPlazaSpcByRfcPlaza(Model model, @RequestParam("rfcEmpleado") String rfcEmpleado, @RequestParam("idPlaza") String idPlaza, ConsultaPlazaSpcDTO consultaPlazaSpcDTO) {
        consultaPlazaSpcDTO.setBeanName("consultaPlazaSpc");
        consultaPlazaSpcDTO.setPlazaRfc(rfcEmpleado);
        consultaPlazaSpcDTO.setIdPlaza(idPlaza);
        consultaPlazaSpcDTO.setMuestraRegistros(true);
        consultaPlazaSpcDTO.setMuestraReporte(true);
        consultaPlazaSpcDTO.setParIdPlaza(idPlaza);
        consultaPlazaSpcDTO.setParPlazaRfc(rfcEmpleado);
        consultaPlazaSpcDTO.setUrlOrigen("consultaPlazaSpc"); 
        model.addAttribute(consultaPlazaSpcDTO);
        return super.getViewName("consultaPlazaSpc");
    }

}
