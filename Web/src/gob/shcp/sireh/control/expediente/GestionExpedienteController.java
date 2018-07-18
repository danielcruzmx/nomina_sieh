package gob.shcp.sireh.control.expediente;

import gob.shcp.fsn.control.AbstractController;
import gob.shcp.fsn.control.support.AnnotatedController;
import gob.shcp.sireh.model.TdExpControlExpedienteDTO;
import gob.shcp.sireh.model.expediente.UsuariosAutorizadosDTO;
import gob.shcp.sireh.model.expediente.gestion.control.BusquedaExpedientesDTO;
import gob.shcp.sireh.model.expediente.gestion.control.ControlExpedientesDTO;
import gob.shcp.sireh.model.expediente.gestion.control.GeneraHusDTO;
import gob.shcp.sireh.service.expediente.GestionExpedientesService;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class GestionExpedienteController extends AbstractController implements AnnotatedController {

    /**
     * Metodo encargado de responder al punto de menu Busqueda de usuarios autorizados
     * @author Gualberto G.
     * @param model
     * @param usuariosAutorizadosDTO
     * @return String
     */
    @RequestMapping
    public String buscarUsuarios(Model model, UsuariosAutorizadosDTO usuariosAutorizadosDTO) {
        if (usuariosAutorizadosDTO.isCancel()) {
            usuariosAutorizadosDTO = new UsuariosAutorizadosDTO();
        }
        usuariosAutorizadosDTO.setUrlOrigen("buscarUsuarios");
        usuariosAutorizadosDTO.setUrlDestino("buscarUsuarios");
        usuariosAutorizadosDTO.setBeanName("consultar-usuariosAutorizados");

        model.addAttribute(usuariosAutorizadosDTO);
        return super.getViewName("busquedaUsuarios");
    }

    /**
     * Metodo encargado de responder al punto de menu Mantenimiento de usuarios autorizados
     * @author Gualberto G.
     * @param model
     * @param usuariosAutorizadosDTO
     * @return String
     */
    @RequestMapping
    public String editarUsuarios(Model model, UsuariosAutorizadosDTO usuariosAutorizadosDTO) {
        if (usuariosAutorizadosDTO.isCancelar()) {
            usuariosAutorizadosDTO = new UsuariosAutorizadosDTO();
        }
        usuariosAutorizadosDTO.setUrlOrigen("editarUsuarios");
        usuariosAutorizadosDTO.setUrlDestino("saveUsuario");
        usuariosAutorizadosDTO.setBeanName("busqueda-usuariosAutorizados");
        usuariosAutorizadosDTO.setUsuDoctoAutorizacion(null);
        usuariosAutorizadosDTO.setUsuNombreEmpleado(null);
        usuariosAutorizadosDTO.setUsuPrimerApellido(null);
        usuariosAutorizadosDTO.setUsuSegundoApellido(null);
        usuariosAutorizadosDTO.setUsuTelefono(null);
        usuariosAutorizadosDTO.setIdStatus(null);
        model.addAttribute(usuariosAutorizadosDTO);
        return super.getViewName("edicionUsuarios");
    }

    /**
     * Metodo encargado de tomar un usuario autorizado para su edicion
     * @author Gualberto G.
     * @param model
     * @param usuariosAutorizadosDTO
     * @param rfcEmpleado
     * @return String
     */
    @RequestMapping
    public String editarUsuariosRfc(Model model, UsuariosAutorizadosDTO usuariosAutorizadosDTO, @RequestParam("rfcEmpleado") String rfcEmpleado) {
        if (usuariosAutorizadosDTO.isCancel()) {
            usuariosAutorizadosDTO = new UsuariosAutorizadosDTO();
        }
        usuariosAutorizadosDTO.setUrlOrigen("editarUsuarios");
        usuariosAutorizadosDTO.setUrlDestino("saveUsuario");
        usuariosAutorizadosDTO.setBeanName("busqueda-usuariosAutorizados");
        usuariosAutorizadosDTO.setRfcEmpleado(rfcEmpleado);
        usuariosAutorizadosDTO.setMuestraRegistros(true);
        usuariosAutorizadosDTO.setConsultar(true);
        if (rfcEmpleado != null && rfcEmpleado.length() > 0) {
            super.getService(GestionExpedientesService.class).getUsuario(usuariosAutorizadosDTO);
        }

        model.addAttribute(usuariosAutorizadosDTO);
        return super.getViewName("edicionUsuarios");
    }

    /**
     * Metodo encardado de enviar un usuario autorizado a guardar
     * @author Gualberto G.
     * @param model
     * @param usuariosAutorizadosDTO
     * @return String
     */
    @RequestMapping
    public String saveUsuario(Model model, UsuariosAutorizadosDTO usuariosAutorizadosDTO) {
        if (usuariosAutorizadosDTO.isCancel()) {
            usuariosAutorizadosDTO = new UsuariosAutorizadosDTO();
        }
        super.getService(GestionExpedientesService.class).saveUsuario(usuariosAutorizadosDTO);
        usuariosAutorizadosDTO = new UsuariosAutorizadosDTO();
        usuariosAutorizadosDTO.setUrlOrigen("editarUsuarios");
        usuariosAutorizadosDTO.setUrlDestino("saveUsuario");
        usuariosAutorizadosDTO.setBeanName("busqueda-usuariosAutorizados");

        super.saveMessage(model, "sireh.msg.oficinaVirtual.gestionExpedientes.save.usuariosAutorizados.ok");
        model.addAttribute(usuariosAutorizadosDTO);
        return super.getViewName("edicionUsuarios");
    }

    /**
     * Busqueda de expedientes en prestamo
     * @author Oscar S.
     * @param model Model
     * @param busquedaExpedientesDTO BusquedaExpedientesDTO
     * @return String
     */
    @RequestMapping
    public String busquedaExpedientes(Model model, BusquedaExpedientesDTO busquedaExpedientesDTO) {
        if (busquedaExpedientesDTO.isCancel()) {
            busquedaExpedientesDTO = new BusquedaExpedientesDTO();
        }
        busquedaExpedientesDTO.setUrlOrigen("busquedaExpedientes");
        busquedaExpedientesDTO.setUrlDestino("busquedaExpedientes");
        busquedaExpedientesDTO.setBeanName("busquedaExpedientesPrestamo");
        model.addAttribute(busquedaExpedientesDTO);
        return super.getViewName("busquedaExpedientes");
    }

    /**
     * Control del expediente
     * @author Oscar S.
     * @param model Model
     * @param controlExpedientesDTO ControlExpedientesDTO
     * @return String
     */
    @RequestMapping
    public String controlExpedientes(Model model, ControlExpedientesDTO controlExpedientesDTO) {
        if (controlExpedientesDTO.isCancelar() || controlExpedientesDTO.isCancel()) {
            controlExpedientesDTO = new ControlExpedientesDTO();
        }
        controlExpedientesDTO.setUrlOrigen("controlExpedientes");
        controlExpedientesDTO.setUrlDestino("controlExpedientes");
        controlExpedientesDTO.setBeanName("datosControlExpediente");
        controlExpedientesDTO.setShowPagedList(controlExpedientesDTO.isMuestraRegistros());
        model.addAttribute(controlExpedientesDTO);
        return super.getViewName("controlExpedientes");
    }

    /**
     * Registro - Control del expediente
     * @author Oscar S.
     * @param model Model
     * @param controlExpedientesDTO ControlExpedientesDTO
     * @return String
     */
    @RequestMapping
    public String saveControlExpedientes(Model model, ControlExpedientesDTO controlExpedientesDTO) {
        try {
            // Guardar registro
            TdExpControlExpedienteDTO tdExpControlExpedienteDTO = new TdExpControlExpedienteDTO();
            tdExpControlExpedienteDTO.setRfcEmpleado(controlExpedientesDTO.getUsuRfcEmpleado());
            tdExpControlExpedienteDTO.setExePrestado(controlExpedientesDTO.getExePrestado());
            tdExpControlExpedienteDTO.setExeRfcUsuarioPrestamo(controlExpedientesDTO.getExeRfcUsuarioPrestamo());
            tdExpControlExpedienteDTO.setExeFechaPrestamo(controlExpedientesDTO.getExeFechaPrestamo());
            tdExpControlExpedienteDTO.setExeDatosClasificacion(controlExpedientesDTO.getExeDatosClasificacion());
            tdExpControlExpedienteDTO.setExeDatosUbicacion(controlExpedientesDTO.getExeDatosUbicacion());
            tdExpControlExpedienteDTO.setUsuario(super.security().getUserName());
            tdExpControlExpedienteDTO.setFecModifico(new Date());
            super.getService(GestionExpedientesService.class).saveExpedienteControlExpediente(tdExpControlExpedienteDTO);

            // Reiniciar controlExpedientesDTO
            controlExpedientesDTO = new ControlExpedientesDTO();

            // Navegacion
            controlExpedientesDTO.setUrlOrigen("controlExpedientes");
            controlExpedientesDTO.setUrlDestino("controlExpedientes");
            controlExpedientesDTO.setBeanName("busquedaEmpleado-controlExpedientes");

            super.saveMessage(model, "sireh.msg.oficinaVirtual.gestionExpedientes.controlExpedientes.ok");
        } catch (Exception e) {
            logger.debug("Exception --------->" + e.toString());
            super.saveError(model, "sireh.msg.oficinaVirtual.gestionExpedientes.controlExpedientes.error");
        }
        model.addAttribute(controlExpedientesDTO);
        return controlExpedientes(model, controlExpedientesDTO);
    }
    
    /**
     * Metodo encargado de generar la caratula de la HUS
     * @author Equipo de Desarrollo.
     * @param model Model
     * @param generaHusDTO GeneraHusDTO
     * @return String
     */
    @RequestMapping
    public String husCaratula(Model model, GeneraHusDTO generaHusDTO) {
        // despues de String va el nombre del elemento .Do del menu es el nombre del metodo del controlador definido en el menu-config
        if (generaHusDTO.isCancel()) {
            generaHusDTO = new GeneraHusDTO();
        }
        
        //  nuevos
        generaHusDTO.setRfcEmpleado(generaHusDTO.getRfcEmpleado() == null ? null : generaHusDTO.getRfcEmpleado());
        generaHusDTO.setRfcRequired(Boolean.TRUE);
        generaHusDTO.setHojadRequired(Boolean.TRUE);
        generaHusDTO.setHojahRequired(Boolean.TRUE);
        generaHusDTO.setComplementoRequired(Boolean.TRUE);

        model.addAttribute(generaHusDTO);
        return super.getViewName("husCaratula"); //Va el nombre de la JSP o del Servlet 
        }

         /**
          * Metodo encargado de generar los movimientos de la HUS
          * @author Equipo de Desarrollo.
          * @param model Model
          * @param generaHusDTO GeneraHusDTO
          * @return String
          */
         @RequestMapping
         public String husDetalle(Model model, GeneraHusDTO generaHusDTO) {
             // despues de String va el nombre del elemento .Do del menu es el nombre del metodo del controlador definido en el menu-config
             if (generaHusDTO.isCancel()) {
                 generaHusDTO = new GeneraHusDTO();
             }

             //  nuevos
              generaHusDTO.setRfcEmpleado(generaHusDTO.getRfcEmpleado() == null ? null : generaHusDTO.getRfcEmpleado());
              generaHusDTO.setRfcRequired(Boolean.TRUE);
              generaHusDTO.setHojadRequired(Boolean.TRUE);
              generaHusDTO.setHojahRequired(Boolean.TRUE);
              generaHusDTO.setComplementoRequired(Boolean.TRUE);

             model.addAttribute(generaHusDTO);
             return super.getViewName("husDetalle");
         }
    

}
