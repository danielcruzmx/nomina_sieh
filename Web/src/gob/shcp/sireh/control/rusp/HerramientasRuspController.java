package gob.shcp.sireh.control.rusp;

import gob.shcp.fsn.control.AbstractController;
import gob.shcp.fsn.control.support.AnnotatedController;

import gob.shcp.sireh.model.nomina.TdEmpleadoDTO;
import gob.shcp.sireh.model.plaza.TdPlazaDTO;
import gob.shcp.sireh.model.rusp.ConsultaEmpleadoRuspDTO;
import gob.shcp.sireh.model.rusp.CustomEmpleadoPlazaRuspDTO;
import gob.shcp.sireh.model.rusp.NivelesRespRuspDTO;
import gob.shcp.sireh.model.rusp.PadronObligadosRuspDTO;
import gob.shcp.sireh.model.rusp.TipoDiscapacidadRuspDTO;

import gob.shcp.sireh.service.rusp.RuspService;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Controlador encargado de atender solicitudes del modulo RUSP.
 */
@Controller
public class HerramientasRuspController extends AbstractController implements AnnotatedController {

    /**
     * RUSP - Consulta padron de obligados.
     * @author Oscar S.
     * @param model Model
     * @param consultaEmpleadoRuspDTO ConsultaEmpleadoRuspDTO
     * @return String
     */
    @RequestMapping
    public String consultaPadronObligados(Model model, ConsultaEmpleadoRuspDTO consultaEmpleadoRuspDTO) {
        // Limpiar objeto
        if (consultaEmpleadoRuspDTO.isCancel()) {
            consultaEmpleadoRuspDTO = new ConsultaEmpleadoRuspDTO();
        } else if (!consultaEmpleadoRuspDTO.isMuestraRegistros()) {
            consultaEmpleadoRuspDTO = new ConsultaEmpleadoRuspDTO();
        }
        
        // Interior 
        consultaEmpleadoRuspDTO.setInterior("Padrón de obligados");
        
        // Navegacion
        consultaEmpleadoRuspDTO.setUrlOrigen("consultaPadronObligados");
        consultaEmpleadoRuspDTO.setUrlDestino("padronObligados");
        consultaEmpleadoRuspDTO.setLinkDestino("padronObligados.do");
        consultaEmpleadoRuspDTO.setParamIdDestino("idPlaza");
        consultaEmpleadoRuspDTO.setPropertyDestino("idPlaza");
        
        // PagedList
        consultaEmpleadoRuspDTO.setBeanName("tdPlaza-consultaEmpleadoRusp");
        
        model.addAttribute(consultaEmpleadoRuspDTO);
        return super.getViewName("consultaPadronObligados");
    }
    
    /**
     * RUSP - Metodo encargado de inicializar la forma para la actualización de datos de la plaza relacionados con el de padron de obligados.
     * @author Oscar S.
     * @param model Model
     * @param idPlaza Integer
     * @return String
     */
    @RequestMapping
    public String padronObligados(Model model, @RequestParam("idPlaza") Integer idPlaza) {
        // Obtener datos de la plaza-empleado
        CustomEmpleadoPlazaRuspDTO customEmpleadoPlazaRuspDTO = super.getService(RuspService.class).getDatosEmpleadoPlazaRusp(idPlaza, Integer.valueOf(super.security().getOperationYear()));
        
        // Inicializar objeto
        PadronObligadosRuspDTO padronObligadosRuspDTO = new PadronObligadosRuspDTO();
        
        // Datos del empleado-plaza
        padronObligadosRuspDTO.setPlaza(customEmpleadoPlazaRuspDTO.getIdPlaza());
        padronObligadosRuspDTO.setRfc(customEmpleadoPlazaRuspDTO.getPlazaRfc() != null ? customEmpleadoPlazaRuspDTO.getPlazaRfc() : "");
        padronObligadosRuspDTO.setNombre(customEmpleadoPlazaRuspDTO.getNombreEmpleado() != null ? customEmpleadoPlazaRuspDTO.getNombreEmpleado() : "");
        padronObligadosRuspDTO.setPrimerApellido(customEmpleadoPlazaRuspDTO.getPrimerApellido() != null ? customEmpleadoPlazaRuspDTO.getPrimerApellido() : "");
        padronObligadosRuspDTO.setSegundoApellido(customEmpleadoPlazaRuspDTO.getSegundoApellido() != null ? customEmpleadoPlazaRuspDTO.getSegundoApellido() : "");
        padronObligadosRuspDTO.setPuesto(customEmpleadoPlazaRuspDTO.getDescPuesto() != null ? customEmpleadoPlazaRuspDTO.getDescPuesto() : "");
        padronObligadosRuspDTO.setCodigoPuesto(customEmpleadoPlazaRuspDTO.getCodigoPuesto() != null ? customEmpleadoPlazaRuspDTO.getCodigoPuesto() : "");
        padronObligadosRuspDTO.setUnidad(customEmpleadoPlazaRuspDTO.getDescUnidad() != null ? customEmpleadoPlazaRuspDTO.getDescUnidad() : "");
        padronObligadosRuspDTO.setJerarquia(customEmpleadoPlazaRuspDTO.getDescJerarquia() != null ? customEmpleadoPlazaRuspDTO.getDescJerarquia() : "");
        padronObligadosRuspDTO.setNombramiento(customEmpleadoPlazaRuspDTO.getDescNombramiento() != null ? customEmpleadoPlazaRuspDTO.getDescNombramiento() : "");
        
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        padronObligadosRuspDTO.setEmailOficial(customEmpleadoPlazaRuspDTO.getEmailOficial() != null ? customEmpleadoPlazaRuspDTO.getEmailOficial() : "");
        padronObligadosRuspDTO.setEmailPersonal(customEmpleadoPlazaRuspDTO.getEmailPersonal() != null ? customEmpleadoPlazaRuspDTO.getEmailPersonal() : "");
        padronObligadosRuspDTO.setFecGobiernoFederal(customEmpleadoPlazaRuspDTO.getFecGobiernoFederal() != null ? df.format(customEmpleadoPlazaRuspDTO.getFecGobiernoFederal()) : "");
        padronObligadosRuspDTO.setFecShcp(customEmpleadoPlazaRuspDTO.getFecShcp() != null ? df.format(customEmpleadoPlazaRuspDTO.getFecShcp()) : "");
        padronObligadosRuspDTO.setPlazaUltimoMovto(customEmpleadoPlazaRuspDTO.getPlazaUltimoMovto() != null ? df.format(customEmpleadoPlazaRuspDTO.getPlazaUltimoMovto()) : "");
        padronObligadosRuspDTO.setFecIngSpc(customEmpleadoPlazaRuspDTO.getFecIngSpc() != null ? df.format(customEmpleadoPlazaRuspDTO.getFecIngSpc()) : "");
        padronObligadosRuspDTO.setFecIniDeclPatr(customEmpleadoPlazaRuspDTO.getFecIniDeclPatr() != null ? df.format(customEmpleadoPlazaRuspDTO.getFecIniDeclPatr()) : "");
        
        // Obligado a presentar declaracion
        //padronObligadosRuspDTO.setObligadoPresentar(customEmpleadoPlazaRuspDTO.getIdObligado() != null ? customEmpleadoPlazaRuspDTO.getIdObligado() : "N");
        //padronObligadosRuspDTO.setIdMotivoObligado(customEmpleadoPlazaRuspDTO.getIdMotivoObligado() != null ? customEmpleadoPlazaRuspDTO.getIdMotivoObligado() : 0);
        
        model.addAttribute(padronObligadosRuspDTO);
        return super.getViewName("padronObligados");
    }
    
    /**
     * RUSP - Metodo encargado de actualizar datos de la plaza relacionados con el padron de obligados.
     * @author Oscar S.
     * @param model Model
     * @param padronObligadosRuspDTO PadronObligadosRuspDTO
     * @return String
     */
    @RequestMapping
    public String savePadronObligados(Model model, PadronObligadosRuspDTO padronObligadosRuspDTO) {
        ConsultaEmpleadoRuspDTO consultaEmpleadoRuspDTO = new ConsultaEmpleadoRuspDTO();
        boolean actualizarPadron = false;
        
        try {
            // Obtener datos de la plaza
            TdPlazaDTO tdPlazaDTO = super.getService(RuspService.class).getPlaza(padronObligadosRuspDTO.getPlaza());
            
            // Obtener datos de la plaza-empleado
            CustomEmpleadoPlazaRuspDTO customEmpleadoPlazaRuspDTO = super.getService(RuspService.class).getDatosEmpleadoPlazaRusp(padronObligadosRuspDTO.getPlaza(), Integer.valueOf(super.security().getOperationYear()));
            
            if ((customEmpleadoPlazaRuspDTO.getIdGrupoPago().equals("E") || customEmpleadoPlazaRuspDTO.getIdGrupoPago().equals("J") || customEmpleadoPlazaRuspDTO.getIdGrupoPago().equals("V")) && 
                (customEmpleadoPlazaRuspDTO.getIdJerarquia().equals("1") || customEmpleadoPlazaRuspDTO.getIdJerarquia().equals("2") || customEmpleadoPlazaRuspDTO.getIdJerarquia().equals("3") || 
                 customEmpleadoPlazaRuspDTO.getIdJerarquia().equals("4")) && customEmpleadoPlazaRuspDTO.getIdNombramiento().equals("C")) {
                // Personal de plaza presupuestal y eventuales con nombramiento de confianza de nivel de jefe de departamento a secretario quedan obligados a presentar declaración 
                // de situación patrimonial, en esta opción lo único que podrían modificar seria el motivo, no podrían quitar la obligación.

                // Motivo
                //tdPlazaDTO.setIdMotivoObligado(padronObligadosRuspDTO.getIdMotivoObligado());
                // Obligacion
                //tdPlazaDTO.setIdObligado("S");
                
                actualizarPadron = true;
            } else if (customEmpleadoPlazaRuspDTO.getIdGrupoPago().equals("H") && 
                      (customEmpleadoPlazaRuspDTO.getIdJerarquia().equals("1") || customEmpleadoPlazaRuspDTO.getIdJerarquia().equals("2") || customEmpleadoPlazaRuspDTO.getIdJerarquia().equals("3") || 
                       customEmpleadoPlazaRuspDTO.getIdJerarquia().equals("4"))) {
                // Personal de honorarios, únicamente aquellos con puesto homologado en el nivel comprendido de jefe de departamento a secretario
                
                // Motivo
                //tdPlazaDTO.setIdMotivoObligado(padronObligadosRuspDTO.getIdMotivoObligado());
                // Obligacion
                //tdPlazaDTO.setIdObligado("S");
                
                actualizarPadron = true;
            } else if (customEmpleadoPlazaRuspDTO.getIdJerarquia().equals("7") && customEmpleadoPlazaRuspDTO.getIdNombramiento().equals("B")) {
                // Personal operativo con nombramiento de base está excluido, obligado N motivo NULL
                
                // Motivo
                //tdPlazaDTO.setIdMotivoObligado(null);
                // Obligacion
                //tdPlazaDTO.setIdObligado(null);
                
                actualizarPadron = true;
            } else if ((customEmpleadoPlazaRuspDTO.getIdJerarquia().equals("7") || customEmpleadoPlazaRuspDTO.getIdJerarquia().equals("5")) && customEmpleadoPlazaRuspDTO.getIdNombramiento().equals("C")) {
                // Personal operativo de confianza y personal de enlace si puede estar obligado de acuerdo a sus funciones
                
                // Motivo
                //tdPlazaDTO.setIdMotivoObligado(padronObligadosRuspDTO.getIdMotivoObligado());
                // Obligacion
                //tdPlazaDTO.setIdObligado("S");
                
                actualizarPadron = true;
            } else {
                actualizarPadron = false;
            }
            tdPlazaDTO.setUsuario(super.security().getUserName());
            tdPlazaDTO.setFecModifico(new Date());
            
            if (actualizarPadron) {
                // Actualizar registro
                super.getService(RuspService.class).savePadronObligados(tdPlazaDTO);
                
                // Mensaje de exito
                super.saveMessage(model, "sireh.label.rusp.herramientas.padronObligados.ok");
            } else {
                // Mensaje de alerta
                super.saveWarning(model, "sireh.label.rusp.herramientas.padronObligados.warning");
            }
        } catch (Exception e) {
            logger.debug("savePadronObligados -> Exception -> " + e.toString());
            // Mensaje de error
            super.saveError(model, "sireh.label.rusp.herramientas.padronObligados.error");
        }
        return consultaPadronObligados(model, consultaEmpleadoRuspDTO);
    }
    
    /******************************************************************************************************************************************************************************/

    /**
     * RUSP - Consulta empleados por tipo de discapacidad.
     * @author Oscar S.
     * @param model Model
     * @param consultaEmpleadoRuspDTO ConsultaEmpleadoRuspDTO
     * @return String
     */
    @RequestMapping
    public String consultaTipoDiscapacidad(Model model, ConsultaEmpleadoRuspDTO consultaEmpleadoRuspDTO) {
        // Limpiar objeto
        if (consultaEmpleadoRuspDTO.isCancel()) {
            consultaEmpleadoRuspDTO = new ConsultaEmpleadoRuspDTO();
        } else if (!consultaEmpleadoRuspDTO.isMuestraRegistros()) {
            consultaEmpleadoRuspDTO = new ConsultaEmpleadoRuspDTO();
        }
        
        // Interior 
        consultaEmpleadoRuspDTO.setInterior("Tipo de discapacidad");
        
        // Navegacion
        consultaEmpleadoRuspDTO.setUrlOrigen("consultaTipoDiscapacidad");
        consultaEmpleadoRuspDTO.setUrlDestino("tipoDiscapacidad");
        consultaEmpleadoRuspDTO.setLinkDestino("tipoDiscapacidad.do");
        consultaEmpleadoRuspDTO.setParamIdDestino("idPlaza");
        consultaEmpleadoRuspDTO.setPropertyDestino("idPlaza");
        
        // PagedList
        consultaEmpleadoRuspDTO.setBeanName("tdPlaza-consultaEmpleadoRusp");
        
        model.addAttribute(consultaEmpleadoRuspDTO);
        return super.getViewName("consultaTipoDiscapacidad");
    }

    /**
     * RUSP - Metodo encargado de inicializa la forma para la actualización de datos de la plaza relacionados con el tipo de discapacidad.
     * @author Oscar S.
     * @param model Model
     * @param idPlaza Integer
     * @return String
     */
    @RequestMapping
    public String tipoDiscapacidad(Model model, @RequestParam("idPlaza") Integer idPlaza) {
        // Obtener datos de la plaza-empleado
        CustomEmpleadoPlazaRuspDTO customEmpleadoPlazaRuspDTO = super.getService(RuspService.class).getDatosEmpleadoPlazaRusp(idPlaza, Integer.valueOf(super.security().getOperationYear()));
        
        // Inicializar objeto
        TipoDiscapacidadRuspDTO tipoDiscapacidadRuspDTO = new TipoDiscapacidadRuspDTO();
        
        // Datos del empleado-plaza
        tipoDiscapacidadRuspDTO.setPlaza(customEmpleadoPlazaRuspDTO.getIdPlaza());
        tipoDiscapacidadRuspDTO.setRfc(customEmpleadoPlazaRuspDTO.getPlazaRfc() != null ? customEmpleadoPlazaRuspDTO.getPlazaRfc() : "");
        tipoDiscapacidadRuspDTO.setNombre(customEmpleadoPlazaRuspDTO.getNombreEmpleado() != null ? customEmpleadoPlazaRuspDTO.getNombreEmpleado() : "");
        tipoDiscapacidadRuspDTO.setPrimerApellido(customEmpleadoPlazaRuspDTO.getPrimerApellido() != null ? customEmpleadoPlazaRuspDTO.getPrimerApellido() : "");
        tipoDiscapacidadRuspDTO.setSegundoApellido(customEmpleadoPlazaRuspDTO.getSegundoApellido() != null ? customEmpleadoPlazaRuspDTO.getSegundoApellido() : "");
        tipoDiscapacidadRuspDTO.setPuesto(customEmpleadoPlazaRuspDTO.getDescPuesto() != null ? customEmpleadoPlazaRuspDTO.getDescPuesto() : "");
        tipoDiscapacidadRuspDTO.setCodigoPuesto(customEmpleadoPlazaRuspDTO.getCodigoPuesto() != null ? customEmpleadoPlazaRuspDTO.getCodigoPuesto() : "");
        tipoDiscapacidadRuspDTO.setUnidad(customEmpleadoPlazaRuspDTO.getDescUnidad() != null ? customEmpleadoPlazaRuspDTO.getDescUnidad() : "");
        tipoDiscapacidadRuspDTO.setJerarquia(customEmpleadoPlazaRuspDTO.getDescJerarquia() != null ? customEmpleadoPlazaRuspDTO.getDescJerarquia() : "");
        tipoDiscapacidadRuspDTO.setNombramiento(customEmpleadoPlazaRuspDTO.getDescNombramiento() != null ? customEmpleadoPlazaRuspDTO.getDescNombramiento() : "");
        
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        tipoDiscapacidadRuspDTO.setEmailOficial(customEmpleadoPlazaRuspDTO.getEmailOficial() != null ? customEmpleadoPlazaRuspDTO.getEmailOficial() : "");
        tipoDiscapacidadRuspDTO.setEmailPersonal(customEmpleadoPlazaRuspDTO.getEmailPersonal() != null ? customEmpleadoPlazaRuspDTO.getEmailPersonal() : "");
        tipoDiscapacidadRuspDTO.setFecGobiernoFederal(customEmpleadoPlazaRuspDTO.getFecGobiernoFederal() != null ? df.format(customEmpleadoPlazaRuspDTO.getFecGobiernoFederal()) : "");
        tipoDiscapacidadRuspDTO.setFecShcp(customEmpleadoPlazaRuspDTO.getFecShcp() != null ? df.format(customEmpleadoPlazaRuspDTO.getFecShcp()) : "");
        tipoDiscapacidadRuspDTO.setPlazaUltimoMovto(customEmpleadoPlazaRuspDTO.getPlazaUltimoMovto() != null ? df.format(customEmpleadoPlazaRuspDTO.getPlazaUltimoMovto()) : "");
        tipoDiscapacidadRuspDTO.setFecIngSpc(customEmpleadoPlazaRuspDTO.getFecIngSpc() != null ? df.format(customEmpleadoPlazaRuspDTO.getFecIngSpc()) : "");
        tipoDiscapacidadRuspDTO.setFecIniDeclPatr(customEmpleadoPlazaRuspDTO.getFecIniDeclPatr() != null ? df.format(customEmpleadoPlazaRuspDTO.getFecIniDeclPatr()) : "");
        
        // Tipo de discapacidad
        tipoDiscapacidadRuspDTO.setIdDiscapacidad(customEmpleadoPlazaRuspDTO.getDiscapacidad() != null ? new Integer(customEmpleadoPlazaRuspDTO.getDiscapacidad()) : 0);
        
        model.addAttribute(tipoDiscapacidadRuspDTO);
        return super.getViewName("tipoDiscapacidad");
    }

    /**
     * RUSP - Metodo encargado de actualizar datos de la plaza relacionados con el tipo de discapacidad.
     * @author Oscar S.
     * @param model Model
     * @param tipoDiscapacidadRuspDTO TipoDiscapacidadRuspDTO
     * @return String
     */
    @RequestMapping
    public String saveTipoDiscapacidad(Model model, TipoDiscapacidadRuspDTO tipoDiscapacidadRuspDTO) {
        ConsultaEmpleadoRuspDTO consultaEmpleadoRuspDTO = new ConsultaEmpleadoRuspDTO();
        
        try {
            // Obtener datos del empleado
            TdEmpleadoDTO tdEmpleadoDTO = super.getService(RuspService.class).getEmpleado(tipoDiscapacidadRuspDTO.getRfc());
            tdEmpleadoDTO.setDiscapacidad(tipoDiscapacidadRuspDTO.getIdDiscapacidad() != null ? String.valueOf(tipoDiscapacidadRuspDTO.getIdDiscapacidad()) : "");
            tdEmpleadoDTO.setUsuario(super.security().getUserName());
            tdEmpleadoDTO.setFecModifico(new Date());
            
            // Actualizar registro
            super.getService(RuspService.class).saveTipoDiscapacidad(tdEmpleadoDTO);
            
            // Mensaje de exito
            super.saveMessage(model, "sireh.label.rusp.herramientas.tipoDiscapacidad.ok");
        } catch (Exception e) {
            logger.debug("saveTipoDiscapacidad -> Exception -> " + e.toString());
            // Mensaje de error
            super.saveError(model, "sireh.label.rusp.herramientas.tipoDiscapacidad.error");
        }
        return consultaTipoDiscapacidad(model, consultaEmpleadoRuspDTO);
    }
    
    /******************************************************************************************************************************************************************************/
    
    /**
     * RUSP - Consulta empleados por niveles de responsabilidad.
     * @author Oscar S.
     * @param model Model
     * @param consultaEmpleadoRuspDTO ConsultaEmpleadoRuspDTO
     * @return String
     */
    @RequestMapping
    public String consultaNivelesResp(Model model, ConsultaEmpleadoRuspDTO consultaEmpleadoRuspDTO) {
        // Limpiar objeto
        if (consultaEmpleadoRuspDTO.isCancel()) {
            consultaEmpleadoRuspDTO = new ConsultaEmpleadoRuspDTO();
        } else if (!consultaEmpleadoRuspDTO.isMuestraRegistros()) {
            consultaEmpleadoRuspDTO = new ConsultaEmpleadoRuspDTO();
        }
        
        // Interior 
        consultaEmpleadoRuspDTO.setInterior("Niveles de responsabilidad");
        
        // Navegacion
        consultaEmpleadoRuspDTO.setUrlOrigen("consultaNivelesResp");
        consultaEmpleadoRuspDTO.setUrlDestino("nivelesResp");
        consultaEmpleadoRuspDTO.setLinkDestino("nivelesResp.do");
        consultaEmpleadoRuspDTO.setParamIdDestino("idPlaza");
        consultaEmpleadoRuspDTO.setPropertyDestino("idPlaza");
        
        // PagedList
        consultaEmpleadoRuspDTO.setBeanName("tdPlaza-consultaEmpleadoRusp");
        
        model.addAttribute(consultaEmpleadoRuspDTO);
        return super.getViewName("consultaNivelesResp");
    }
    
    /**
     * RUSP - Metodo encargado de inicializar la forma para la actualización datos de la plaza relacionados con el nivel de responsabilidad.
     * @author Oscar S.
     * @param model Model
     * @param idPlaza Integer
     * @return String
     */
    @RequestMapping
    public String nivelesResp(Model model, @RequestParam("idPlaza") Integer idPlaza) {
        // Obtener datos de la plaza-empleado
        CustomEmpleadoPlazaRuspDTO customEmpleadoPlazaRuspDTO = super.getService(RuspService.class).getDatosEmpleadoPlazaRusp(idPlaza, Integer.valueOf(super.security().getOperationYear()));
        
        // Inicializar objeto
        NivelesRespRuspDTO nivelesRespRuspDTO = new NivelesRespRuspDTO();
        
        // Datos del empleado-plaza
        nivelesRespRuspDTO.setPlaza(customEmpleadoPlazaRuspDTO.getIdPlaza());
        nivelesRespRuspDTO.setRfc(customEmpleadoPlazaRuspDTO.getPlazaRfc() != null ? customEmpleadoPlazaRuspDTO.getPlazaRfc() : "");
        nivelesRespRuspDTO.setNombre(customEmpleadoPlazaRuspDTO.getNombreEmpleado() != null ? customEmpleadoPlazaRuspDTO.getNombreEmpleado() : "");
        nivelesRespRuspDTO.setPrimerApellido(customEmpleadoPlazaRuspDTO.getPrimerApellido() != null ? customEmpleadoPlazaRuspDTO.getPrimerApellido() : "");
        nivelesRespRuspDTO.setSegundoApellido(customEmpleadoPlazaRuspDTO.getSegundoApellido() != null ? customEmpleadoPlazaRuspDTO.getSegundoApellido() : "");
        nivelesRespRuspDTO.setPuesto(customEmpleadoPlazaRuspDTO.getDescPuesto() != null ? customEmpleadoPlazaRuspDTO.getDescPuesto() : "");
        nivelesRespRuspDTO.setCodigoPuesto(customEmpleadoPlazaRuspDTO.getCodigoPuesto() != null ? customEmpleadoPlazaRuspDTO.getCodigoPuesto() : "");
        nivelesRespRuspDTO.setUnidad(customEmpleadoPlazaRuspDTO.getDescUnidad() != null ? customEmpleadoPlazaRuspDTO.getDescUnidad() : "");
        nivelesRespRuspDTO.setJerarquia(customEmpleadoPlazaRuspDTO.getDescJerarquia() != null ? customEmpleadoPlazaRuspDTO.getDescJerarquia() : "");
        nivelesRespRuspDTO.setNombramiento(customEmpleadoPlazaRuspDTO.getDescNombramiento() != null ? customEmpleadoPlazaRuspDTO.getDescNombramiento() : "");
        
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        nivelesRespRuspDTO.setEmailOficial(customEmpleadoPlazaRuspDTO.getEmailOficial() != null ? customEmpleadoPlazaRuspDTO.getEmailOficial() : "");
        nivelesRespRuspDTO.setEmailPersonal(customEmpleadoPlazaRuspDTO.getEmailPersonal() != null ? customEmpleadoPlazaRuspDTO.getEmailPersonal() : "");
        nivelesRespRuspDTO.setFecGobiernoFederal(customEmpleadoPlazaRuspDTO.getFecGobiernoFederal() != null ? df.format(customEmpleadoPlazaRuspDTO.getFecGobiernoFederal()) : "");
        nivelesRespRuspDTO.setFecShcp(customEmpleadoPlazaRuspDTO.getFecShcp() != null ? df.format(customEmpleadoPlazaRuspDTO.getFecShcp()) : "");
        nivelesRespRuspDTO.setPlazaUltimoMovto(customEmpleadoPlazaRuspDTO.getPlazaUltimoMovto() != null ? df.format(customEmpleadoPlazaRuspDTO.getPlazaUltimoMovto()) : "");
        nivelesRespRuspDTO.setFecIngSpc(customEmpleadoPlazaRuspDTO.getFecIngSpc() != null ? df.format(customEmpleadoPlazaRuspDTO.getFecIngSpc()) : "");
        nivelesRespRuspDTO.setFecIniDeclPatr(customEmpleadoPlazaRuspDTO.getFecIniDeclPatr() != null ? df.format(customEmpleadoPlazaRuspDTO.getFecIniDeclPatr()) : "");
        
        // Nivel de responsabilidad
        //nivelesRespRuspDTO.setNivelesResp(customEmpleadoPlazaRuspDTO.getIdObligado() != null ? customEmpleadoPlazaRuspDTO.getIdObligado() : "");
        
        model.addAttribute(nivelesRespRuspDTO);
        return super.getViewName("nivelesResp");
    }
    
    /**
     * RUSP - Metodo encargado de actualizar datos de la plaza relacionados con el nivel de responsabilidad.
     * @author Oscar S.
     * @param model Model
     * @param nivelesRespRuspDTO NivelesRespRuspDTO
     * @return String
     */
    @RequestMapping
    public String saveNivelesResp(Model model, NivelesRespRuspDTO nivelesRespRuspDTO) {
        ConsultaEmpleadoRuspDTO consultaEmpleadoRuspDTO = new ConsultaEmpleadoRuspDTO();
        
        try {
            // Obtener datos de la plaza
            TdPlazaDTO tdPlazaDTO = super.getService(RuspService.class).getPlaza(nivelesRespRuspDTO.getPlaza());
            
            // TODO: PENDIENTE
            //tdPlazaDTO.setIdObligado(nivelesRespRuspDTO.getNivelesResp() != null ? nivelesRespRuspDTO.getNivelesResp() : "N");
            tdPlazaDTO.setUsuario(super.security().getUserName());
            tdPlazaDTO.setFecModifico(new Date());
            
            // Actualizar registro
            super.getService(RuspService.class).saveNivelesResp(tdPlazaDTO);
            
            // Mensaje de exito
            super.saveMessage(model, "sireh.label.rusp.herramientas.nivelesResp.ok");
        } catch (Exception e) {
            logger.debug("saveNivelesResp -> Exception -> " + e.toString());
            // Mensaje de error
            super.saveError(model, "sireh.label.rusp.herramientas.nivelesResp.error");
        }
        return consultaNivelesResp(model, consultaEmpleadoRuspDTO);
    }
}
