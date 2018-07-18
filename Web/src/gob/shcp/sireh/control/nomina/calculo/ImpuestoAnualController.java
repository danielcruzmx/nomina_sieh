package gob.shcp.sireh.control.nomina.calculo;

import gob.shcp.fsn.control.AbstractController;
import gob.shcp.fsn.control.support.AnnotatedController;

import gob.shcp.sireh.model.nomina.conceptos.DatosEmpleadoCptoDTO;
import gob.shcp.sireh.model.nomina.gestion.ConsultaNominaDTO;

import gob.shcp.sireh.model.nomina.gestion.NominaDTO;

import gob.shcp.sireh.model.nomina.impuestoAnual.AdministracionAnualDTO;
import gob.shcp.sireh.model.nomina.impuestoAnual.NominaAnualDTO;
import gob.shcp.sireh.service.nomina.gestion.GestionNominaService;

import gob.shcp.sireh.service.nomina.impuestoAnual.ImpuestoAnualService;

import java.io.IOException;
import java.io.OutputStream;

import java.text.DecimalFormat;

import java.util.List;

import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ImpuestoAnualController extends AbstractController implements AnnotatedController {

    @RequestMapping
    public String definicionNominas(Model model, AdministracionAnualDTO administracionAnualDTO) {
        if (administracionAnualDTO.isCancel()) {   administracionAnualDTO = new AdministracionAnualDTO();   }
        administracionAnualDTO.setUrlOrigen("definicionNominas");
        administracionAnualDTO.setUrlDestino("definicionNominas");
        administracionAnualDTO.setBeanName("listaNominasEjercicioAnual");
        
        model.addAttribute(administracionAnualDTO);
        return super.getViewName("definicionNominas");
    }
    
    @RequestMapping
    public String modificacionNomina(Model model,@RequestParam("idQna") Integer id,
                                    @RequestParam("folio1") String folio1,
                                    @RequestParam("folio2") String folio2,
                                    @RequestParam("folio3") String folio3,
                                    @RequestParam("tcpmonto") String tcpmonto,
                                    @RequestParam("tcdmonto") String tcdmonto,
                                    @RequestParam("tcpisrgmonto") String tcpisrgmonto,
                                    @RequestParam("tcpisremonto") String tcpisremonto,
                                    @RequestParam("tcdisrgmonto") String tcdisrgmonto,
                                    @RequestParam("tcdisremonto") String tcdisremonto,
                                    @RequestParam("ciclo") String ciclo) {
        DecimalFormat decimalFormat = new DecimalFormat("$###,###.###");                                    
        final NominaAnualDTO nominaAnualDTO = super.getService(ImpuestoAnualService.class).getNomina(id);
        nominaAnualDTO.setIdNomina(new Long(id));
        nominaAnualDTO.setCasos(new Integer(folio1));
        nominaAnualDTO.setTrabajadores(new Integer(folio2));
        nominaAnualDTO.setPencionados(new Integer(folio3));
        nominaAnualDTO.setPercepciones(new Double(tcpmonto));
        nominaAnualDTO.setDeducciones(new Double(tcdmonto));
        nominaAnualDTO.setPercepcionesGravables(new Double(tcpisrgmonto));
        nominaAnualDTO.setPercepcionesExcedentes(new Double(tcpisremonto));
        nominaAnualDTO.setDeduccionesGravables(new Double(tcdisrgmonto));
        nominaAnualDTO.setDeduccionesExcedentes(new Double(tcdisremonto));
        nominaAnualDTO.setCiclo(new Integer(ciclo));
        nominaAnualDTO.setTipoMantenimiento("M");
        
        nominaAnualDTO.setPercepcionesLabel(decimalFormat.format(new Double(tcpmonto)));
        nominaAnualDTO.setDeduccionesLabel(decimalFormat.format(new Double(tcdmonto)));
        nominaAnualDTO.setPercepcionesGravablesLabel(decimalFormat.format(new Double(tcpisrgmonto)));
        nominaAnualDTO.setPercepcionesExcedentesLabel(decimalFormat.format(new Double(tcpisremonto)));
        nominaAnualDTO.setDeduccionesGravablesLabel(decimalFormat.format(new Double(tcdisrgmonto)));
        nominaAnualDTO.setDeduccionesExcedentesLabel(decimalFormat.format(new Double(tcdisremonto)));
        model.addAttribute(nominaAnualDTO);
        
        return super.getViewName("modificacionNomina");
    }
    
    @RequestMapping
    public String updateNomina(Model model, NominaAnualDTO nominaAnualDTO){
        super.getService(ImpuestoAnualService.class).updateNomina(nominaAnualDTO.getIdNomina(), nominaAnualDTO.getCiclo());
        super.saveMessage(model, "nomina.ejercicio.fiscal.update.ok", nominaAnualDTO.getIdNomina());
        
        AdministracionAnualDTO administracionAnualDTO = new AdministracionAnualDTO();
        administracionAnualDTO.setUrlOrigen("definicionNominas");
        administracionAnualDTO.setUrlDestino("definicionNominas");
        administracionAnualDTO.setBeanName("listaNominasEjercicioAnual");
        return definicionNominas(model, administracionAnualDTO);
    }

    @RequestMapping
    public String acPerDeduc(Model model, AdministracionAnualDTO administracionAnualDTO, HttpServletResponse response) throws IOException {
        Object campo;
        String unidades = "";
        String[] elements = null;
        String parser = ",";
        List<Map<Integer, Object>> histRevList = null;
        if (administracionAnualDTO.isCancel()) {   administracionAnualDTO = new AdministracionAnualDTO();   }
        if(administracionAnualDTO.getCiclo() != null){
            if( administracionAnualDTO.getOrigen() == null || 
                administracionAnualDTO.getOrigenDep() == null ||
                administracionAnualDTO.getCiclo().equalsIgnoreCase("0")){
                if(administracionAnualDTO.getCiclo().equalsIgnoreCase("0")){   
                    super.saveError(model, "El campo ejercicio fiscal es obligatorio; Seleccione el año de ejercico fiscal");
                }
                if(administracionAnualDTO.getOrigenDep() == null){
                    super.saveError(model, "El campo tipo de concepto es obligatorio; Haga click en el radio boton, shcp o sat");
                }
                if(administracionAnualDTO.getOrigen() == null){
                    super.saveError(model, "El campo origen es obligatorio; Haga click en el radio boton, rfc o unidad");
                }
            }
            else {
                if(administracionAnualDTO.getOrigen().equalsIgnoreCase("r")){
                    if(administracionAnualDTO.getRfcEmpleado().equalsIgnoreCase("")){
                        super.saveError(model, "El campo rfc es obligatorio; Oprima el icono de lupa y seleccione un rfc");
                    }
                }
                else if(administracionAnualDTO.getOrigen().equalsIgnoreCase("u")){
                    if(administracionAnualDTO.getUnidad().equalsIgnoreCase("0")){
                        List<String> dimensiones  = super.security().getDimensionPrimaryLevel("SIREHUNIDAD");
                        StringBuffer sb = new StringBuffer();
                        for (String dim: dimensiones){   sb.append("'").append(dim).append("',");   }
                        if(sb.length()> 0){   sb.delete(sb.length() - 1, sb.length());   }
                        administracionAnualDTO.setUnidad(sb.toString());
                    }
                    else{   elements = administracionAnualDTO.getUnidad().split(parser) ;
                            if(elements.length > 1){ 
                                for(String unidad:elements){
                                    unidades = unidades + "'" + unidad + "'," ;
                                } 
                                unidades = unidades.substring(0, unidades.length()-1);
                                administracionAnualDTO.setUnidad(unidades);
                            } 
                            else {  administracionAnualDTO.setUnidad("'" + administracionAnualDTO.getUnidad() + "'");  }
                    }
                }
                histRevList = super.getService(ImpuestoAnualService.class).getRegsAcumPerDedEjFis(administracionAnualDTO);
                if(histRevList == null || histRevList.isEmpty()){  super.saveWarning(model, "warn.empty.chkolist"); return super.getViewName("acPerDeduc");  }
                else {
                        StringBuilder strCsv = new StringBuilder();
                        for (Map row: histRevList) {
                            for (int i = 1; i <= row.size(); i++) {
                                campo = row.get(i);

                                if (campo == null || campo.toString().equals("null") || campo.toString().length() < 1) {
                                    campo = " ";
                                }
                                strCsv.append(campo);
                                strCsv.append(",");
                            }
                            strCsv.replace(strCsv.length() - 1, strCsv.length(), "\n");
                        }
                        
                        byte[] bytes = strCsv.toString().getBytes();
                        response.setContentType("text/csv");
                        response.setContentLength(bytes.length);
                        response.setHeader("Content-Disposition", "attachment; filename=\"" + "acumuladoPercepcionesDeducciones" + ".csv");
                        OutputStream out = response.getOutputStream();
                        out.write(bytes, 0, bytes.length);
                        return null;
                
                
                        /*
                        StringBuilder strCsv = new StringBuilder();
                        for (String renglon: datos) { strCsv.append(renglon).append("\r\n"); }
                        byte[] bytes = strCsv.toString().getBytes();
                        response.setContentType("text/csv");
                        response.setContentLength(bytes.length);
                        response.setHeader("Content-Disposition", "attachment; filename=\"" + "acumuladoPercepcionesDeducciones" + ".csv");
                        OutputStream out = response.getOutputStream();
                        out.write(bytes, 0, bytes.length);
                        return null;*/
                    }
            }
        }
        administracionAnualDTO.setUrlOrigen("acPerDeduc");
        administracionAnualDTO.setUrlDestino("acPerDeduc");
        //administracionAnualDTO.setBeanName("listaNominasEjercicioAnual");
        
        model.addAttribute(administracionAnualDTO);
        return super.getViewName("acPerDeduc");
    }

    @RequestMapping
    public String impuestoAnual(Model model, AdministracionAnualDTO administracionAnualDTO) {
        return super.getViewName("impuestoAnual");
    }

    @RequestMapping
    public String generaArchivoDIM(Model model, AdministracionAnualDTO administracionAnualDTO) {
        return super.getViewName("generaArchivoDIM");
    }

}
