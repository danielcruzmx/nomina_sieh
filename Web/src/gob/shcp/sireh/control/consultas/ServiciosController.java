package gob.shcp.sireh.control.consultas;

import gob.shcp.fsn.control.AbstractController;
import gob.shcp.fsn.control.support.AnnotatedController;
import gob.shcp.sireh.model.nomina.TdEmpleadoDTO;
import gob.shcp.sireh.model.nomina.TnMovtosEmpPlaDTO;
import gob.shcp.sireh.model.nomina.reportes.ReportesConstanciasDTO;

import gob.shcp.sireh.model.plaza.TdPlazaDTO;
import gob.shcp.sireh.model.servicios.ExpLabCVDTO;
import gob.shcp.sireh.model.servicios.TablaDTO;
import gob.shcp.sireh.service.SirehUtils;

import gob.shcp.sireh.service.consultas.ConsultasService;

import gob.shcp.sireh.service.servicios.ServiciosService;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class ServiciosController extends AbstractController implements AnnotatedController {
    
    /**
     * Consulta los datos de la constancia de sueldo del trabajador
     * @author Martin C.
     * @param model Model
     * @param reportesConstanciasDTO ReportesConstanciasDTO
     * @return String
     */
    @RequestMapping
    public String constanciaSueldos(Model model, ReportesConstanciasDTO reportesConstanciasDTO){
        String userRfc = super.identity().get(super.security().getUserName()).getRfc().toUpperCase();
        String nombreEmpleado = super.getService(ConsultasService.class).getNombreEmpleado(userRfc);
        
        if(!nombreEmpleado.equalsIgnoreCase("")){
            reportesConstanciasDTO.setNombreEmpleado(nombreEmpleado);
            reportesConstanciasDTO.setRfcEmpleado(userRfc);
            reportesConstanciasDTO.setCiclo(SirehUtils.getCurrentYear()-1);
            reportesConstanciasDTO. setBeanName("listadoConstanciaDeSueldo");
        } else {    reportesConstanciasDTO.setMuestraReporte(false);     
                    super.saveMessage(model, "No se encontro informacion asociada a la peticion. Intente nuevamente con otros parametros. ");   }
                    
        model.addAttribute(reportesConstanciasDTO);
        return super.getViewName("constanciaDeSueldo");
    }
    
    @RequestMapping
    public String constanciaSueldosReporte(Model model, ReportesConstanciasDTO reportesConstanciasDTO, @RequestParam("ciclo") Integer ciclo, @RequestParam("rfcEmpleado") String rfcEmpleado, @RequestParam("nombreEmpleado") String nombreEmpleado){
        reportesConstanciasDTO.setMuestraReporte(true);
        reportesConstanciasDTO.setRfcEmpleado(rfcEmpleado);
        reportesConstanciasDTO.setNombreEmpleado(nombreEmpleado);
        
        model.addAttribute(reportesConstanciasDTO);
        return super.getViewName("constanciaDeSueldo");
    }
    
    @RequestMapping
    public String expLabCV(Model model, ExpLabCVDTO expLabCVDTO){
        
        String userRfc = super.identity().get(super.security().getUserName()).getRfc().toUpperCase();
        //String userRfc = "ROHG9102088T4";
        expLabCVDTO.setCiclo(SirehUtils.getCurrentYear() - 1); 
        expLabCVDTO.setRfcEmpleado(userRfc);
        
        String nombreUsuario = super.getService(ConsultasService.class).getNombreEmpleado(userRfc);
        
        if(!nombreUsuario.equalsIgnoreCase("")){
            expLabCVDTO.setNombreEmpleado(nombreUsuario);
            expLabCVDTO.setMuestraReporte(true);
        } else {   super.saveWarning(model, "No se encontro informacion asociada a la peticion. Intente nuevamente con otros parametros.");   }
        
        model.addAttribute(expLabCVDTO);
        return super.getViewName("curriculumVitae");
    }
    
    
    /**
     * Actualizacion de tablas TD_PLAZA 
     * @autor Martin C.
     * @param model
     * @param tablaDTO
     * @return
     */
    @RequestMapping
    public String updateTdPlaza(Model model, TablaDTO tablaDTO, HttpServletRequest request){
        TdPlazaDTO antesTdPlazaDTO = null;
        TdPlazaDTO despuesTdPlazaDTO = null;
        String ip = request.getRemoteAddr();
        
        if(tablaDTO.isBuscar()){
            if(tablaDTO.getIdPlaza() != null){
                antesTdPlazaDTO = super.getService(ServiciosService.class).getByIdTdPlaza(tablaDTO.getIdPlaza());
                if(antesTdPlazaDTO != null){
                    tablaDTO.setPlazaUltimoMovto(antesTdPlazaDTO.getPlazaUltimoMovto());
                    tablaDTO.setPlazaIniCont(antesTdPlazaDTO.getPlazaIniCont());
                    tablaDTO.setPlazaFinCont(antesTdPlazaDTO.getPlazaFinCont());
                    tablaDTO.setPlazaIniLic(antesTdPlazaDTO.getPlazaIniLic());
                    tablaDTO.setPlazaFinLic(antesTdPlazaDTO.getPlazaFinLic());
                    tablaDTO.setTdPlazaDTO(antesTdPlazaDTO);
                    tablaDTO.setNombre(super.getService(ServiciosService.class).FindByRfc(antesTdPlazaDTO.getPlazaRfc()));
                } else {  super.saveError(model, "La plaza [" + tablaDTO.getIdPlaza() + "] no existe o no se encontro informacion asociada a la plaza." ); tablaDTO.setBuscar(false); }
            } else { super.saveError(model, "El numero de plaza es un campo requerido; Proporcione el numero de plaza."); tablaDTO.setBuscar(false); }
        }
        else if(tablaDTO.isSalvar()){
            if(!tablaDTO.getMotivoModifica().equalsIgnoreCase("")){
                despuesTdPlazaDTO = tablaDTO.getTdPlazaDTO();
                despuesTdPlazaDTO.setIdPlaza(tablaDTO.getIdPlaza());
                
                despuesTdPlazaDTO.setUsuario(super.security().getUserName());
                despuesTdPlazaDTO.setFecModifico(new Date());
                
                despuesTdPlazaDTO.setPlazaUltimoMovto(tablaDTO.getPlazaUltimoMovto());
                despuesTdPlazaDTO.setPlazaIniCont(tablaDTO.getPlazaIniCont());
                despuesTdPlazaDTO.setPlazaFinCont(tablaDTO.getPlazaFinCont());
                despuesTdPlazaDTO.setPlazaIniLic(tablaDTO.getPlazaIniLic());
                despuesTdPlazaDTO.setPlazaFinLic(tablaDTO.getPlazaFinLic());
                
                antesTdPlazaDTO = super.getService(ServiciosService.class).getByIdTdPlaza(tablaDTO.getIdPlaza());
                
                super.getService(ServiciosService.class).salvarRegistroTdPlaza(antesTdPlazaDTO, despuesTdPlazaDTO, tablaDTO, ip);
                super.saveMessage(model, "Los datos de la plaza ["  + tablaDTO.getIdPlaza() + "] han sido actualizados con exito.");
                tablaDTO.setIdPlaza(null);
            }
            else{
                if(tablaDTO.getMotivoModifica().equalsIgnoreCase("")){
                    super.saveError(model, "Debe proporcionar el motivo que por el cual se hace la modificacion al registro de la plaza");
                    tablaDTO.setBuscar(true);
                    tablaDTO.setSalvar(false);
                }
            }
        }
        model.addAttribute(tablaDTO);
        return super.getViewName("updateTdPlaza");
    }
    
    /**
     * Actualizacion de tablas TN_MOVTOS_EMP_PLAZA 
     * @autor Martin C.
     * @param model
     * @param tablaDTO
     * @return
     */
    @RequestMapping
    public String updateTnMovtosEmplPlaza(Model model, TablaDTO tablaDTO, HttpServletRequest request){
        TnMovtosEmpPlaDTO antesTnMovtosEmpPlaDTO = null;
        TnMovtosEmpPlaDTO despuesTnMovtosEmpPlaDTO = null;
        String ip = request.getRemoteAddr();
        
        
        
        if(tablaDTO.isBuscar()){
            if(tablaDTO.getIdMovtosEmpPla() != null){
                antesTnMovtosEmpPlaDTO = super.getService(ServiciosService.class).getByIdTnMovtosEmpPlaza(tablaDTO.getIdMovtosEmpPla());
                if(antesTnMovtosEmpPlaDTO != null){
                    tablaDTO.setCiclo(super.security().getOperationYear());
                    tablaDTO.setMepUltimoMovto(antesTnMovtosEmpPlaDTO.getMepUltimoMovto());
                    tablaDTO.setMepIniCont(antesTnMovtosEmpPlaDTO.getMepIniCont());
                    tablaDTO.setMepFinCont(antesTnMovtosEmpPlaDTO.getMepFinCont());
                    tablaDTO.setMepIniLic(antesTnMovtosEmpPlaDTO.getMepIniLic());
                    tablaDTO.setMepFinLic(antesTnMovtosEmpPlaDTO.getMepFinLic());
                    tablaDTO.setMepFecNacimiento(antesTnMovtosEmpPlaDTO.getMepFecNacimiento());
                    tablaDTO.setMepIngresoGobFed(antesTnMovtosEmpPlaDTO.getMepIngresoGobFed());
                    tablaDTO.setMepIngresoDependencia(antesTnMovtosEmpPlaDTO.getMepIngresoDependencia());
                    tablaDTO.setMepTerminoCargoSind(antesTnMovtosEmpPlaDTO.getMepTerminoCargoSind());
                    tablaDTO.setMepFecNotDecPatr(antesTnMovtosEmpPlaDTO.getMepFecNotDecPatr());
                    tablaDTO.setMepFecIniDeclPatr(antesTnMovtosEmpPlaDTO.getMepFecIniDeclPatr());
                    tablaDTO.setMepFecIngSpc(antesTnMovtosEmpPlaDTO.getMepFecIngSpc());
                    tablaDTO.setMepFechaCancela(antesTnMovtosEmpPlaDTO.getMepFechaCancela());
                    tablaDTO.setTnMovtosEmpPlaDTO(antesTnMovtosEmpPlaDTO);
                    tablaDTO.setNombre(super.getService(ServiciosService.class).FindByRfc(antesTnMovtosEmpPlaDTO.getMepRfcUnico()));
                } else {  super.saveError(model, "El id de movimiento empleado plaza [" + tablaDTO.getIdMovtosEmpPla() + "] no existe o no se encontro informacion asociada." ); tablaDTO.setBuscar(false); }
            } else { super.saveError(model, "El id de movimiento empleado plaza es un campo requerido; Proporcione el numero de movimiento enpleado plaza."); tablaDTO.setBuscar(false); }
        }
        else if(tablaDTO.isSalvar()){
            if(!tablaDTO.getMotivoModifica().equalsIgnoreCase("")){
                despuesTnMovtosEmpPlaDTO = tablaDTO.getTnMovtosEmpPlaDTO();
                despuesTnMovtosEmpPlaDTO.setIdMovtosEmpPla(tablaDTO.getIdMovtosEmpPla());
                
                despuesTnMovtosEmpPlaDTO.setUsuario(super.security().getUserName());
                despuesTnMovtosEmpPlaDTO.setFecModifico(new Date());
                
                despuesTnMovtosEmpPlaDTO.setMepUltimoMovto(tablaDTO.getMepUltimoMovto());
                despuesTnMovtosEmpPlaDTO.setMepIniCont(tablaDTO.getMepIniCont());
                despuesTnMovtosEmpPlaDTO.setMepFinCont(tablaDTO.getMepFinCont());
                despuesTnMovtosEmpPlaDTO.setMepIniLic(tablaDTO.getMepIniLic());
                despuesTnMovtosEmpPlaDTO.setMepFinLic(tablaDTO.getMepFinLic());
                despuesTnMovtosEmpPlaDTO.setMepFecNacimiento(tablaDTO.getMepFecNacimiento());
                despuesTnMovtosEmpPlaDTO.setMepIngresoGobFed(tablaDTO.getMepIngresoGobFed());
                despuesTnMovtosEmpPlaDTO.setMepIngresoDependencia(tablaDTO.getMepIngresoDependencia());
                despuesTnMovtosEmpPlaDTO.setMepTerminoCargoSind(tablaDTO.getMepTerminoCargoSind());
                despuesTnMovtosEmpPlaDTO.setMepFecNotDecPatr(tablaDTO.getMepFecNotDecPatr());
                despuesTnMovtosEmpPlaDTO.setMepFecIniDeclPatr(tablaDTO.getMepFecIniDeclPatr());
                despuesTnMovtosEmpPlaDTO.setMepFecIngSpc(tablaDTO.getMepFecIngSpc());
                despuesTnMovtosEmpPlaDTO.setMepFechaCancela(tablaDTO.getMepFechaCancela());
                
                antesTnMovtosEmpPlaDTO = super.getService(ServiciosService.class).getByIdTnMovtosEmpPlaza(tablaDTO.getIdMovtosEmpPla());
                antesTnMovtosEmpPlaDTO.setIdMovtosEmpPla(tablaDTO.getIdMovtosEmpPla());
                
                super.getService(ServiciosService.class).salvarRegistroTnMovtosEmpPlaza(antesTnMovtosEmpPlaDTO, despuesTnMovtosEmpPlaDTO, tablaDTO, ip);
                super.saveMessage(model, "Los datos de la plaza ["  + tablaDTO.getIdMovtosEmpPla() + "] han sido actualizados con exito.");
                tablaDTO.setIdMovtosEmpPla(null);
            }
            else{
                if(tablaDTO.getMotivoModifica().equalsIgnoreCase("")){
                    super.saveError(model, "Debe proporcionar el motivo que por el cual se hace la modificacion al registro de la plaza");
                    tablaDTO.setBuscar(true);
                    tablaDTO.setSalvar(false);
                }
            }
        }
        model.addAttribute(tablaDTO);
        return super.getViewName("updateTnMovtosEmplPlaza");
    }
    
    /**
     * Actualizacion de tablas TD_EMPLEADO 
     * @autor Martin C.
     * @param model
     * @param tablaDTO
     * @return
     */
    @RequestMapping
    public String updateTdEmpleado(Model model, TablaDTO tablaDTO, HttpServletRequest request){
        TdEmpleadoDTO antesTdEmpleadoDTO = null;
        TdEmpleadoDTO despuesTdEmpleadoDTO = null;
        String ip = request.getRemoteAddr();
        
        if(tablaDTO.isBuscar()){
            if(tablaDTO.getRfcEmpleado() != null){
                antesTdEmpleadoDTO = super.getService(ServiciosService.class).getByIdTdEmpleadoDTO(tablaDTO.getRfcEmpleado());
                if(antesTdEmpleadoDTO != null){
                    tablaDTO.setFecUltimoMovto(antesTdEmpleadoDTO.getFecUltimoMovto());
                    tablaDTO.setFecNacimiento(antesTdEmpleadoDTO.getFecNacimiento());
                    tablaDTO.setIngresoGobFed(antesTdEmpleadoDTO.getIngresoGobFed());
                    tablaDTO.setIngresoDependencia(antesTdEmpleadoDTO.getIngresoDependencia());
                    tablaDTO.setTerminoCargoSind(antesTdEmpleadoDTO.getTerminoCargoSind());
                    tablaDTO.setFecNotDecPatr(antesTdEmpleadoDTO.getFecNotDecPatr());
                    tablaDTO.setFecIniDeclPatr(antesTdEmpleadoDTO.getFecIniDeclPatr());
                    tablaDTO.setFecIngSpc(antesTdEmpleadoDTO.getFecIngSpc());
                    tablaDTO.setFecModifico(antesTdEmpleadoDTO.getFecModifico());
                    tablaDTO.setTdEmpleadoDTO(antesTdEmpleadoDTO);
                    tablaDTO.setNombre(super.getService(ServiciosService.class).FindByRfc(antesTdEmpleadoDTO.getRfcEmpleado()));
                } else {  super.saveError(model, "El empleado  con rfc [" + tablaDTO.getRfcEmpleado() + "] no existe o no se encontro informacion asociada al rfc proporcionado." ); tablaDTO.setBuscar(false); }
            } else { super.saveError(model, "El rfc del empleado es un campo requerido; Proporcione el rfc del empleado."); tablaDTO.setBuscar(false); }
        }
        else if(tablaDTO.isSalvar()){
            if(!tablaDTO.getMotivoModifica().equalsIgnoreCase("")){
                despuesTdEmpleadoDTO = tablaDTO.getTdEmpleadoDTO();
                despuesTdEmpleadoDTO.setRfcUnico(tablaDTO.getRfcEmpleado());
                
                despuesTdEmpleadoDTO.setUsuario(super.security().getUserName());
                despuesTdEmpleadoDTO.setFecModifico(new Date());
                
                despuesTdEmpleadoDTO.setFecUltimoMovto(tablaDTO.getFecUltimoMovto());
                despuesTdEmpleadoDTO.setFecNacimiento(tablaDTO.getFecNacimiento());
                despuesTdEmpleadoDTO.setIngresoGobFed(tablaDTO.getIngresoGobFed());
                despuesTdEmpleadoDTO.setIngresoDependencia(tablaDTO.getIngresoDependencia());
                despuesTdEmpleadoDTO.setTerminoCargoSind(tablaDTO.getTerminoCargoSind());
                despuesTdEmpleadoDTO.setFecNotDecPatr(tablaDTO.getFecNotDecPatr());
                despuesTdEmpleadoDTO.setFecIniDeclPatr(tablaDTO.getFecIniDeclPatr());
                despuesTdEmpleadoDTO.setFecIngSpc(tablaDTO.getFecIngSpc());
                
                antesTdEmpleadoDTO = super.getService(ServiciosService.class).getByIdTdEmpleadoDTO(tablaDTO.getRfcEmpleado());
                
                super.getService(ServiciosService.class).salvarRegistroTdEmpleado(antesTdEmpleadoDTO, despuesTdEmpleadoDTO, tablaDTO, ip);
                super.saveMessage(model, "Los datos del empleado ["  + tablaDTO.getRfcEmpleado() + "] han sido actualizados con exito.");
                tablaDTO.setIdPlaza(null);
            }
            else{
                if(tablaDTO.getMotivoModifica().equalsIgnoreCase("")){
                    super.saveError(model, "Debe proporcionar el motivo que por el cual se hace la modificacion al registro de la plaza");
                    tablaDTO.setBuscar(true);
                    tablaDTO.setSalvar(false);
                }
            }
        }
        model.addAttribute(tablaDTO);
        return super.getViewName("updateTdEmpleado");
    }
}
