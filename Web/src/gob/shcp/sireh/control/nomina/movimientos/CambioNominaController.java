package gob.shcp.sireh.control.nomina.movimientos;

import gob.shcp.fsn.control.AbstractController;
import gob.shcp.fsn.control.support.AnnotatedController;

import gob.shcp.sireh.model.nomina.CambioBancariosDTO;
import gob.shcp.sireh.model.nomina.CambioComplementariosDTO;
import gob.shcp.sireh.model.nomina.CambioDomicilioDTO;
import gob.shcp.sireh.model.nomina.CambioNombreCurpDTO;
import gob.shcp.sireh.model.nomina.CambioRfcDTO;
import gob.shcp.sireh.model.nomina.ConsultaEmpleadoDTO;

import gob.shcp.sireh.service.nomina.movimientos.CambioNominaService;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Controlador encargado de atender solicitudes correspondientes a Cambios de datos.
 */
@Controller
public class CambioNominaController extends AbstractController implements AnnotatedController {
    
    /**
     * Metodo encargado de consultar Empleados para el cambio de RFC.
     * @param model Model
     * @param consultaEmpleadoDTO ConsultaEmpleadoDTO
     */
    @RequestMapping
    public String consultarRfc(Model model,ConsultaEmpleadoDTO consultaEmpleadoDTO) {
        if(consultaEmpleadoDTO.isCancel()) {
            consultaEmpleadoDTO = new ConsultaEmpleadoDTO();
        }
        consultaEmpleadoDTO.setUrlOrigen("consultarRfc");
        consultaEmpleadoDTO.setUrlDestino("cambioRfc");
        consultaEmpleadoDTO.setMenuTitle("De filiación");
        
        model.addAttribute(consultaEmpleadoDTO);
        return super.getViewName("consultarEmpleados");
    }
    
    /**
     * Metodo encargado de obtener el rfc del Empleado para el cambio de RFC.
     * @param model Model
     * @param rfcEmpleado String
     */
    @RequestMapping
    public String cambioRfc(Model model, @RequestParam("rfcEmpleado") String rfcEmpleado) {      
        // Obtener Empleado - Plaza
        CambioRfcDTO cambioRfcDTO = super.getService(CambioNominaService.class).getEmpleadoPlaza(rfcEmpleado);
        
        model.addAttribute(cambioRfcDTO);
        return super.getViewName("cambioRfc");
    }
    
    /**
     * Metodo encargado de actualizar rfc del Empleado con base en el objeto CambioRfcDTO.
     * @param model Model
     * @param cambioRfc CambioRfcDTO
     */
    @RequestMapping
    public String updateEmpleadoPlazaRfc(Model model, CambioRfcDTO cambioRfc) {
        String rfcNuevo = cambioRfc.getRfcNuevo();
        if( cambioRfc.getRfcEmpleado().equals( rfcNuevo ) ) {
            super.saveError(model,"nomina.cambiodatos.rfc.error");
            return super.getViewName("cambioRfc");
        }
        
        CambioNominaService service = super.getService(CambioNominaService.class);
        CambioRfcDTO cambioRfcDTO = service.getEmpleadoPlaza(rfcNuevo);
        if( cambioRfcDTO != null ) {
            super.saveError(model,"nomina.cambiodatos.rfc.error.yaexiste");
            return super.getViewName("cambioRfc");
        }
    
        service.updateEmpleadoPlazaRfc(cambioRfc, super.security().getUserName());
        
        ConsultaEmpleadoDTO newDTO = new ConsultaEmpleadoDTO();
        newDTO.setUrlOrigen("consultarRfc");
        newDTO.setUrlDestino("cambioRfc");
        newDTO.setMenuTitle("De filiación");
        model.addAttribute(newDTO);
        super.saveMessage(model, "nomina.cambiodatos.rfc.ok");
        return super.getViewName("consultarEmpleados");
    }
    
    
    /**
     * Método encargado de consultar Empleados para el cambio de CURP
     * @param model Model
     * @param consultaEmpleadoDTO ConsultaEmpleadoDTO
     * @return
     */
    @RequestMapping
    public String consultarCurp(Model model,ConsultaEmpleadoDTO consultaEmpleadoDTO) {
        if(consultaEmpleadoDTO.isCancel()) {
            consultaEmpleadoDTO = new ConsultaEmpleadoDTO();
        }
        consultaEmpleadoDTO.setUrlOrigen("consultarCurp");
        consultaEmpleadoDTO.setUrlDestino("cambioNombreCurp");
        consultaEmpleadoDTO.setMenuTitle("De nombre y CURP");
        
        model.addAttribute(consultaEmpleadoDTO);
        return super.getViewName("consultarEmpleados");
    }
    
    /**
     * Método encargado de obtener el los datos del empleado seleccionado para el cambio de CURP
     * @param model Model
     * @param rfcEmpleado String
     * @return
     */
    @RequestMapping
    public String cambioNombreCurp(Model model, @RequestParam("rfcEmpleado") String rfcEmpleado) {      
        // Obtener Empleado - Plaza Vigente
        CambioNombreCurpDTO cambioNombreCurpDTO = super.getService(CambioNominaService.class).getEmpleadoCambioNombreCurp(rfcEmpleado);
        
        model.addAttribute(cambioNombreCurpDTO);
        return super.getViewName("cambioNombreCurp");
    }
    
    /**
     * Método encargado de validar los campos de la pantalla de actualización de datos de CURP
     * @param model Model
     * @param cambioNombreCurpDTO CambioNombreCurpDTO
     * @author Oscar S.
     * @return String
     */
    @RequestMapping
    public String verificarCurp(Model model, CambioNombreCurpDTO cambioNombreCurpDTO) {
        model.addAttribute(cambioNombreCurpDTO);
        return super.getViewName("cambioNombreCurp");
    }
    
    /**
     * Método encargado de actualizar los datos de CURP del empleado
     * @param model Model
     * @param cambioNombreCurpDTO CambioNombreCurpDTO
     * @author Oscar S.
     * @return String
     */
    @RequestMapping
    public String updateEmpleadoNombreCurp(Model model, CambioNombreCurpDTO cambioNombreCurpDTO) {        
        super.getService(CambioNominaService.class).updateEmpleadoNombreCurp(cambioNombreCurpDTO, super.security().getUserName());
        
        ConsultaEmpleadoDTO newDTO = new ConsultaEmpleadoDTO();
        newDTO.setUrlOrigen("consultarCurp");
        newDTO.setUrlDestino("cambioNombreCurp");
        newDTO.setMenuTitle("De nombre y CURP");
        model.addAttribute(newDTO);
        super.saveMessage(model, "nomina.cambiodatos.curp.ok");
        return super.getViewName("consultarEmpleados");
    }

    @RequestMapping
    public String cambioPersonales(Model model) {
        return super.getViewName("cambioPersonales");
    }

    /**
     * Método encargado de obtener los datos del empleado para el cambio de domicilio
     * @param model
     * @param rfcEmpleado
     * @return
     */
    @RequestMapping
    public String cambioDomicilio(Model model, @RequestParam("rfcEmpleado") String rfcEmpleado) {
        CambioDomicilioDTO cambioDomicilioDTO = super.getService(CambioNominaService.class).getEmpleadoCambioDomicilio(rfcEmpleado);
        
        model.addAttribute(cambioDomicilioDTO);
        return super.getViewName("cambioDomicilio");
    }
    
    /**
     * Método encargado de consultar y listar los empleados para cambio de domicilio
     * @param model Model
     * @param consultaEmpleadoDTO ConsultaEmpleadoDTO
     * @return
     */
    @RequestMapping
    public String consultarDomicilio(Model model,ConsultaEmpleadoDTO consultaEmpleadoDTO) {
        if(consultaEmpleadoDTO.isCancel()) {
            consultaEmpleadoDTO = new ConsultaEmpleadoDTO();
        }
        consultaEmpleadoDTO.setUrlOrigen("consultarDomicilio");
        consultaEmpleadoDTO.setUrlDestino("cambioDomicilio");
        consultaEmpleadoDTO.setMenuTitle("De domicilio");
        
        model.addAttribute(consultaEmpleadoDTO);
        return super.getViewName("consultarEmpleados");
    }
    
    /**
     * Método encargado de actualizar el domicilio del empleado
     * @param model Model
     * @param cambioDomicilioDTO CambioDomicilioDTO
     * @return
     */
    @RequestMapping
    public String updateEmpleadoCambioDomicilio(Model model, CambioDomicilioDTO cambioDomicilioDTO) {
        
        super.getService(CambioNominaService.class).updateEmpleadoCambioDomicilio(cambioDomicilioDTO, super.security().getUserName());
        
        ConsultaEmpleadoDTO consultaEmpleadoDTO = new ConsultaEmpleadoDTO();
        consultaEmpleadoDTO.setUrlOrigen("consultarDomicilio");
        consultaEmpleadoDTO.setUrlDestino("cambioDomicilio");
        consultaEmpleadoDTO.setMenuTitle("De domicilio");
        
        model.addAttribute(consultaEmpleadoDTO);
        super.saveMessage(model, "nomina.cambiodatos.domicilio.ok");
        return super.getViewName("consultarEmpleados");
    }
    
     /**
     * Método encargado de obtener los datos del empleado seleccionado para el cambio de datos de banco
     * @param model Model
     * @param rfcEmpleado String
     * @return
     */
   @RequestMapping
    public String cambioBancarios(Model model, @RequestParam("rfcEmpleado") String rfcEmpleado) {
        // Obtener Empleado - Plaza
        CambioBancariosDTO cambioBancariosDTO = super.getService(CambioNominaService.class).getEmpleadoCambioBancarios(rfcEmpleado);
        
        model.addAttribute(cambioBancariosDTO);
        return super.getViewName("cambioBancarios");
    }

    /**
     * Método encargado de consultar Empleados para el cambio de datos de banco
     * @param model Model
     * @param consultaEmpleadoDTO ConsultaEmpleadoDTO
     * @return String
     */
    @RequestMapping
    public String consultarBancarios(Model model,ConsultaEmpleadoDTO consultaEmpleadoDTO) {
        if(consultaEmpleadoDTO.isCancel()) {
            consultaEmpleadoDTO = new ConsultaEmpleadoDTO();
        }
        consultaEmpleadoDTO.setUrlOrigen("consultarBancarios");
        consultaEmpleadoDTO.setUrlDestino("cambioBancarios");
        consultaEmpleadoDTO.setMenuTitle("De cuenta bancaria y zona de pago");
        
        model.addAttribute(consultaEmpleadoDTO);
        return super.getViewName("consultarEmpleados");
    }
    
    /**
     * Método encargado de actualizar los datos de banco del empleado modificado
     * @param model Model
     * @param cambioBancariosDTO CambioBancariosDTO
     * @return
     */
    @RequestMapping
    public String updateEmpleadoBancarios(Model model, CambioBancariosDTO cambioBancariosDTO) {
        super.getService(CambioNominaService.class).updateEmpleadoBancarios(cambioBancariosDTO, super.security().getUserName());
        
        ConsultaEmpleadoDTO consultaEmpleadoDTO = new ConsultaEmpleadoDTO();
        consultaEmpleadoDTO.setUrlOrigen("consultarBancarios");
        consultaEmpleadoDTO.setUrlDestino("cambioBancarios");
        consultaEmpleadoDTO.setMenuTitle("De cuenta bancaria y zona de pago");
        
        model.addAttribute(consultaEmpleadoDTO);
        super.saveMessage(model, "nomina.cambiodatos.banco.ok");
        return super.getViewName("consultarEmpleados");
    }
    
    @RequestMapping
    public String consultarComplementarios(Model model, ConsultaEmpleadoDTO consultaEmpleadoDTO) {
        if(consultaEmpleadoDTO.isCancel()) {
            consultaEmpleadoDTO = new ConsultaEmpleadoDTO();
        }
        consultaEmpleadoDTO.setUrlOrigen("consultarComplementarios");
        consultaEmpleadoDTO.setUrlDestino("cambioComplementarios");
        consultaEmpleadoDTO.setMenuTitle("Que no afectan el pago");

        model.addAttribute(consultaEmpleadoDTO);
        return super.getViewName("consultarEmpleados");
    }  
   
    @RequestMapping
    public String cambioComplementarios(Model model, @RequestParam("rfcEmpleado") String rfcEmpleado) {
        CambioComplementariosDTO cambioComplementariosDTO = super.getService(CambioNominaService.class).getEmpleadoCambioComplementarios(rfcEmpleado);
      
        if (cambioComplementariosDTO.getTerminoCargoSind() == null) { cambioComplementariosDTO.setTerminoCargoSind(cambioComplementariosDTO.getIngresoDependencia()); }
        if (cambioComplementariosDTO.getFecNotDecPatr() == null) { cambioComplementariosDTO.setFecNotDecPatr(cambioComplementariosDTO.getIngresoDependencia()); }
        if (cambioComplementariosDTO.getFecIniDeclPatr() == null) { cambioComplementariosDTO.setFecIniDeclPatr(cambioComplementariosDTO.getIngresoDependencia()); }
       // if (cambioComplementariosDTO.getFecIngSpc() == null) { cambioComplementariosDTO.setFecIngSpc(cambioComplementariosDTO.getIngresoDependencia());}
       
        if (cambioComplementariosDTO.getCasoMuestra() == null) { cambioComplementariosDTO.setCasoMuestra("0"); }
        if (cambioComplementariosDTO.getDiscapacidad() == null) { cambioComplementariosDTO.setDiscapacidad("0"); }
        if (cambioComplementariosDTO.getEstudiaSiNo() == null) { cambioComplementariosDTO.setEstudiaSiNo("0"); }
        if (cambioComplementariosDTO.getPadreMadre() == null) { cambioComplementariosDTO.setPadreMadre("0"); }
        if (cambioComplementariosDTO.getCompatEmpleo() == null) { cambioComplementariosDTO.setCompatEmpleo("0"); }
                
        model.addAttribute(cambioComplementariosDTO);
        return super.getViewName("cambioComplementarios");
    }
    
    
    @RequestMapping
    public String updateEmpleadoCambioComplementarios(Model model, CambioComplementariosDTO cambioComplementariosDTO) {
        super.getService(CambioNominaService.class).updateEmpleadoCambioComplementarios(cambioComplementariosDTO, super.security().getUserName());
        
        ConsultaEmpleadoDTO consultaEmpleadoDTO = new ConsultaEmpleadoDTO();
        consultaEmpleadoDTO.setUrlOrigen("consultarComplementarios");
        consultaEmpleadoDTO.setUrlDestino("cambioComplementarios");
        consultaEmpleadoDTO.setMenuTitle("Que no afectan el pago");
        
        model.addAttribute(consultaEmpleadoDTO);
        super.saveMessage(model, "Los cambios se efectuaron.");
        return super.getViewName("consultarEmpleados");
    }
}
