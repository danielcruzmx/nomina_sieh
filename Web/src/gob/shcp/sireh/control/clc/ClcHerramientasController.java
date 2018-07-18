package gob.shcp.sireh.control.clc;

import gob.shcp.fsn.control.AbstractController;
import gob.shcp.fsn.control.support.AnnotatedController;

import gob.shcp.sireh.model.TdCxlcDTO;
import gob.shcp.sireh.model.clc.herramientas.BorraClcDTO;
import gob.shcp.sireh.model.clc.herramientas.BusquedaErroresDTO;
import gob.shcp.sireh.model.clc.herramientas.ConsultaClcDTO;
import gob.shcp.sireh.model.clc.herramientas.RegistraClcCompromisoDTO;
import gob.shcp.sireh.model.clc.herramientas.RegistraClcDTO;
import gob.shcp.sireh.model.clc.herramientas.RegistraSolicitudPagoDTO;

import gob.shcp.sireh.service.clc.herramientas.ClcHerramientasService;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ClcHerramientasController extends AbstractController implements AnnotatedController {

    /**
     * Metodo encargado de consultar CLC Compromiso.
     * @author Oscar S.
     * @param model Model
     * @param consultaClcDTO ConsultaClcDTO
     * @return String
     */
    @RequestMapping
    public String consultaClcRegComp(Model model, ConsultaClcDTO consultaClcDTO) {
        if (consultaClcDTO.isCancel()) {
            consultaClcDTO = new ConsultaClcDTO();
        }
        // Seccion
        consultaClcDTO.setSeccion(" - Registra compromiso");
        // Bean Name pagedList
        consultaClcDTO.setBeanName("busquedaRegistraCompromiso");
        
        // Navegacion
        consultaClcDTO.setUrlOrigen("consultaClcRegComp");
        consultaClcDTO.setUrlDestino("registraCompromiso");
        
        // Boton verificar
        consultaClcDTO.setRegistro(true);
        consultaClcDTO.setUrlOrigenRegistro("verificaRelClcComp");
        // Modulo
        consultaClcDTO.setRegistraCompromiso(true);
        
        model.addAttribute(consultaClcDTO);
        return super.getViewName("consultaClc");
    }
    
    /**
     * Metodo encargado de verificar el compromiso de las cxlc seleccionadas.
     * @author Oscar S.
     * @param model Model
     * @param consultaClcDTO ConsultaClcDTO
     * @return String
     */
    @RequestMapping
    public String verificaRelClcComp(Model model, ConsultaClcDTO consultaClcDTO) {
        RegistraClcCompromisoDTO registraClcCompromisoDTO = new RegistraClcCompromisoDTO();
        
        // Paso 1) Obtener cxlc seleccionadas
        String[] cxlcGrupo = consultaClcDTO.getCxlcGrupo();
        
        // Paso 2) Obtener el ciclo
        Integer cxlcCiclo = consultaClcDTO.getCxlcCiclo();
        
        // Paso 3) Obtener compromisos involucrados
        List<Integer> compromisosInvolucrados = new ArrayList<Integer>();
        List<TdCxlcDTO> cxlcSeleccionadas = new ArrayList<TdCxlcDTO>();
        for (String cxlc : cxlcGrupo) { 
            TdCxlcDTO tdCxlcDTO = super.getService(ClcHerramientasService.class).getTdCxlc(new Integer(cxlc), cxlcCiclo);
            cxlcSeleccionadas.add(tdCxlcDTO);
            
            Integer cxlcCompromiso = (int) (long) tdCxlcDTO.getCxlcCompromiso();
            compromisosInvolucrados.add(cxlcCompromiso);
        }
        // Sobrescribir
        if (compromisosInvolucrados.size() > 0) {
            registraClcCompromisoDTO.setSobrescribir(true);
        }
        registraClcCompromisoDTO.setCxlcCiclo(cxlcCiclo);
        registraClcCompromisoDTO.setCxlcSeleccionadas(cxlcSeleccionadas);
        
        // Paso 4) Obtener cxlc involucradas
        List<TdCxlcDTO> listaCxlcInvolucradas = super.getService(ClcHerramientasService.class).getCxlcComprometidas(cxlcCiclo, compromisosInvolucrados);
        registraClcCompromisoDTO.setCxlcInvolucradas(listaCxlcInvolucradas);
        
        // Navegacion
        registraClcCompromisoDTO.setUrlOrigen("consultaClcRegComp");
        registraClcCompromisoDTO.setUrlDestino("registraCompromiso");
        
        model.addAttribute(registraClcCompromisoDTO);
        return super.getViewName("verificaRelClcComp");
    }
    
    /**
     * Metodo encargado de marcar el compromiso de las cxlc seleccionadas.
     * @author Oscar S.
     * @param model Model
     * @param registraClcCompromisoDTO RegistraClcCompromisoDTO
     * @return String
     */
    @RequestMapping
    public String registraCompromiso(Model model, RegistraClcCompromisoDTO registraClcCompromisoDTO) {
        // Paso 1) Obtener el ciclo
        Integer cxlcCiclo = registraClcCompromisoDTO.getCxlcCiclo();
        
        // Paso 2) Obtener el compromiso
        String cxlcCompromiso = registraClcCompromisoDTO.getCompromiso();
        
        // Paso 3) Inicializa lista cxlc
        List<Integer> cxlcActualizar = new ArrayList<Integer>();
        
        // Paso 4) Obtener cxlc seleccionadas
        List<TdCxlcDTO> cxlcSeleccionadas = registraClcCompromisoDTO.getCxlcSeleccionadas();
        
        // Quincena de Aplicacion
        Integer secQnaApli = null;
        
        for (TdCxlcDTO tdCxlcSeleccionadas : cxlcSeleccionadas) {
            cxlcActualizar.add(tdCxlcSeleccionadas.getCxlc());
            secQnaApli = new Integer(tdCxlcSeleccionadas.getCxlcQnaPago());
            logger.debug("registraCompromiso -> secQnaApli -----------------> " + secQnaApli);
        }
        
        // Paso 5) Obtener cxlc involucradas
        List<TdCxlcDTO> cxlcInvolucradas = registraClcCompromisoDTO.getCxlcInvolucradas();
        for (TdCxlcDTO tdCxlcInvolucradas : cxlcInvolucradas) {
            cxlcActualizar.add(tdCxlcInvolucradas.getCxlc());
        }
        
        // Paso 6) Verifica si existe el compromiso
        if (super.getService(ClcHerramientasService.class).existeCompromiso(cxlcCiclo, cxlcCompromiso)) {
            super.saveError(model, "clc.herramientas.registra.compromiso.numero.error");
        } else {
            
            // Paso 7) Update sec_cxlc
            super.getService(ClcHerramientasService.class).updateCxlcCompromiso(cxlcCiclo, cxlcCompromiso, cxlcActualizar, secQnaApli);
            
            super.saveMessage(model, "clc.herramientas.registra.compromiso.ok");
        }
        
        ConsultaClcDTO consultaClcDTO = new ConsultaClcDTO();
        
        // Seccion
        consultaClcDTO.setSeccion(" - Registra compromiso");
        // Bean Name pagedList
        consultaClcDTO.setBeanName("busquedaRegistraCompromiso");
        
        // Navegacion
        consultaClcDTO.setUrlOrigen("consultaClcRegComp");
        consultaClcDTO.setUrlDestino("registraCompromiso");
        
        // Boton verificar
        consultaClcDTO.setRegistro(true);
        consultaClcDTO.setRegistraCompromiso(true);
        // Modulo
        consultaClcDTO.setUrlOrigenRegistro("verificaRelClcComp");
        
        model.addAttribute(consultaClcDTO);
        
        return super.getViewName("consultaClc");
    }
    
    /**
     * Metodo encargado de consultar CLC Solicitudes de pago.
     * @author Oscar S.
     * @param model Model
     * @param consultaClcDTO ConsultaClcDTO
     * @return String
     */
    @RequestMapping
    public String consultaClcRegSolPago(Model model, ConsultaClcDTO consultaClcDTO) {
        if (consultaClcDTO.isCancel()) {
            consultaClcDTO = new ConsultaClcDTO();
        }
        // Seccion
        consultaClcDTO.setSeccion(" - Registra solicitud de pago");
        // Bean Name pagedList
        consultaClcDTO.setBeanName("busquedaRegistraSolicitudPago");
        
        // Navegacion
        consultaClcDTO.setUrlOrigen("consultaClcRegSolPago");
        consultaClcDTO.setUrlDestino("verificaRelSolPago");
        
        // Boton verificar
        consultaClcDTO.setRegistro(true);
        consultaClcDTO.setUrlOrigenRegistro("verificaRelSolPago");
        // Modulo
        consultaClcDTO.setRegistraSolicitudPago(true);
        
        model.addAttribute(consultaClcDTO);
        return super.getViewName("consultaClc");
    }
    
    /**
     * Metodo encargado de verificar la solicitud e pago de las cxlc seleccionadas.
     * @author Oscar S.
     * @param model Model
     * @param consultaClcDTO ConsultaClcDTO
     * @return String
     */
    @RequestMapping
    public String verificaRelSolPago(Model model, ConsultaClcDTO consultaClcDTO) {
        RegistraSolicitudPagoDTO registraSolicitudPagoDTO = new RegistraSolicitudPagoDTO();
        
        // Paso 1) Obtener cxlc seleccionadas
        String[] cxlcGrupo = consultaClcDTO.getCxlcGrupo();
        
        // Paso 2) Obtener el ciclo
        Integer cxlcCiclo = consultaClcDTO.getCxlcCiclo();
        
        // Paso 3) Obtener solicitudes de pago involucradas
        List<Integer> solPagoInvolucrados = new ArrayList<Integer>();
        List<TdCxlcDTO> cxlcSeleccionadas = new ArrayList<TdCxlcDTO>();
        for (String cxlc : cxlcGrupo) { 
            TdCxlcDTO tdCxlcDTO = super.getService(ClcHerramientasService.class).getTdCxlc(new Integer(cxlc), cxlcCiclo);
            cxlcSeleccionadas.add(tdCxlcDTO);
            
            //Integer cxlcDevengado = (int) (long) tdCxlcDTO.getCxlcDevengado();
             Integer cxlcDevengado = (int) (long) tdCxlcDTO.getCxlcCompromiso();
            solPagoInvolucrados.add(cxlcDevengado);
        }
        // Sobrescribir
        if (solPagoInvolucrados.size() > 0) {
            registraSolicitudPagoDTO.setSobrescribir(true);
        }
        registraSolicitudPagoDTO.setCxlcCiclo(cxlcCiclo);
        registraSolicitudPagoDTO.setCxlcSeleccionadas(cxlcSeleccionadas);
        
        // Paso 4) Obtener cxlc involucradas
        List<TdCxlcDTO> listaCxlcInvolucradas = super.getService(ClcHerramientasService.class).getSolicitudesPagoComprometidas(cxlcCiclo, solPagoInvolucrados);
        registraSolicitudPagoDTO.setCxlcInvolucradas(listaCxlcInvolucradas);
        
        // Navegacion
        registraSolicitudPagoDTO.setUrlOrigen("consultaClcRegSolPago");
        registraSolicitudPagoDTO.setUrlDestino("registraSolicitudPago");
        
        model.addAttribute(registraSolicitudPagoDTO);
        return super.getViewName("verificaRelSolPago");
    }
    
    /**
     * Metodo encargado de marcar la solicitud de pago de las cxlc seleccionadas.
     * @author Oscar S.
     * @param model Model
     * @param registraSolicitudPagoDTO RegistraSolicitudPagoDTO
     * @return String
     */
    @RequestMapping
    public String registraSolicitudPago(Model model, RegistraSolicitudPagoDTO registraSolicitudPagoDTO) {        
        // Paso 1) Obtener el ciclo
        Integer cxlcCiclo = registraSolicitudPagoDTO.getCxlcCiclo();
        
        // Paso 2) Obtener la solicitud de pago
        Long cxlcDevengado = registraSolicitudPagoDTO.getSolicitudPago();
        
        // Paso 3) Inicializa lista cxlc
        List<Integer> cxlcActualizar = new ArrayList<Integer>();
        
        // Paso 4) Obtener cxlc seleccionadas
        List<TdCxlcDTO> cxlcSeleccionadas = registraSolicitudPagoDTO.getCxlcSeleccionadas();
        for (TdCxlcDTO tdCxlcSeleccionadas : cxlcSeleccionadas) {
            cxlcActualizar.add(tdCxlcSeleccionadas.getCxlc());
        }
        
        // Paso 5) Obtener cxlc involucradas
        List<TdCxlcDTO> cxlcInvolucradas = registraSolicitudPagoDTO.getCxlcInvolucradas();
        for (TdCxlcDTO tdCxlcInvolucradas : cxlcInvolucradas) {
            cxlcActualizar.add(tdCxlcInvolucradas.getCxlc());
        }
        
        // Paso 6) Verifica si existe el devengado
        if (super.getService(ClcHerramientasService.class).existeDevengado(cxlcCiclo, cxlcDevengado)) {
            super.saveError(model, "clc.herramientas.registra.solicitudPago.numero.error");
        } else {
            
            // Paso 7) Update sec_cxlc
            super.getService(ClcHerramientasService.class).updateCxlcSolicitudPago(cxlcCiclo, cxlcDevengado, cxlcActualizar);
            
            super.saveMessage(model, "clc.herramientas.registra.solicitudPago.ok");
        }
        
        ConsultaClcDTO consultaClcDTO = new ConsultaClcDTO();
        // Seccion
        consultaClcDTO.setSeccion(" - Registra solicitud de pago");
        // Bean Name pagedList
        consultaClcDTO.setBeanName("busquedaRegistraSolicitudPago");
        
        // Navegacion
        consultaClcDTO.setUrlOrigen("consultaClcRegSolPago");
        consultaClcDTO.setUrlDestino("verificaRelSolPago");
        
        // Boton verificar
        consultaClcDTO.setRegistro(true);
        consultaClcDTO.setUrlOrigenRegistro("verificaRelSolPago");
        // Modulo
        consultaClcDTO.setRegistraSolicitudPago(true);
        
        model.addAttribute(consultaClcDTO);
        
        return super.getViewName("consultaClc");
    }
    
    /**
     * Metodo encargado de inicializar el objeto registraClcDTO para el Registro de CLC.
     * @author Oscar S.
     * @param model Model
     */
    @RequestMapping
    public String registraCLC(Model model) {
        RegistraClcDTO registraClcDTO = new RegistraClcDTO();
        
        model.addAttribute(registraClcDTO);
        return super.getViewName("registraCLC");
    }
    
    /**
     * Metodo encargado del Registro de CLC con base el objeto registraClcDTO.
     * @author Oscar S.
     * @param model Model
     * @param registraClcDTO RegistraClcDTO
     */
    @RequestMapping
    public String updateRegistraCLC(Model model, RegistraClcDTO registraClcDTO) {
        if (registraClcDTO.getCxlcCiclo() == null || registraClcDTO.getCxlcCiclo() == 0) {
            super.saveError(model, "clc.herramientas.registro.error.cxlcCiclo");
        } else if (registraClcDTO.getCxlcQnaPago() == null || registraClcDTO.getCxlcQnaPago() == 0) {
            super.saveError(model, "clc.herramientas.registro.error.cxlcQnaPago");
        } else if (registraClcDTO.getIdTipoNomina() == null || registraClcDTO.getIdTipoNomina().equals("") || registraClcDTO.getIdTipoNomina().equals("0")) {
            super.saveError(model, "clc.herramientas.registro.error.idTipoNomina");
        } else if (registraClcDTO.getCxlcComplemento() == null) {
            super.saveError(model, "clc.herramientas.registro.error.cxlcComplemento");
        } else if (registraClcDTO.getCxlc() == null || registraClcDTO.getCxlc() == 0) {
            super.saveError(model, "clc.herramientas.registro.error.cxlc");
        } else if (registraClcDTO.getCxlcSIAFF() == null || registraClcDTO.getCxlcSIAFF() == 0) {
            super.saveError(model, "clc.herramientas.registro.error.cxlcSIAFF");
        } else {
            super.getService(ClcHerramientasService.class).updateRegistraCLC(registraClcDTO.getCxlcCiclo(), registraClcDTO.getCxlc(), registraClcDTO.getCxlcSIAFF());
            
            registraClcDTO =  new RegistraClcDTO();
            
            super.saveMessage(model, "clc.herramientas.registro.ok");
        }
        model.addAttribute(registraClcDTO);
        return super.getViewName("registraCLC");
    }
    
    /**
     * Metodo encargado de consultar CLC - Concilia CLC.
     * @author Oscar S.
     * @param model Model
     * @param consultaClcDTO ConsultaClcDTO
     * @return String
     */
    @RequestMapping
    public String consultaConciliaCLC(Model model, ConsultaClcDTO consultaClcDTO) {
        if (consultaClcDTO.isCancel()) {
            consultaClcDTO = new ConsultaClcDTO();
        }
        // Seccion
        consultaClcDTO.setSeccion(" - Concilia CLC");
        // Bean Name pagedList
        consultaClcDTO.setBeanName("busquedaConciliaCLC");
        
        // Navegacion
        consultaClcDTO.setUrlOrigen("consultaConciliaCLC");
        consultaClcDTO.setUrlDestino("verificaConciliaCLC");
        
        // Modulo
        consultaClcDTO.setConciliaCLC(true);
        
        //consultaClcDTO.setMuestraRegistros(true);
        
        model.addAttribute(consultaClcDTO);
        return super.getViewName("consultaClc");
    }
    
    /**
     * Metodo encargado de conciliar CLC con base en el objeto consultaClcDTO.
     * @author Oscar S.
     * @param model Model
     * @param consultaClcDTO ConsultaClcDTO
     * @return String
     */
    @RequestMapping
    public String conciliaCLC(Model model, ConsultaClcDTO consultaClcDTO) {
        if (consultaClcDTO.getConciliaSICOP() == null || consultaClcDTO.getConciliaSICOP() == 0) {
            super.saveError(model, "clc.herramientas.conciliacion.error.conciliaSICOP");
        } else {
            // Paso 1) Obtener cxlc seleccionadas
            String[] cxlcGrupo = consultaClcDTO.getCxlcGrupo();
            
            // Paso 2) Obtener el ciclo
            Integer cxlcCiclo = consultaClcDTO.getCxlcCiclo();
            
            // Paso 3) Inicializa lista CLC
            List<Integer> cxlcConciliar = new ArrayList<Integer>();
            
            // Paso 4) Obtener cxlc a conciliar
            for (String cxlc : cxlcGrupo) {
                cxlcConciliar.add(new Integer(cxlc));
            }
            
            // Paso 5) Update de CLC
            super.getService(ClcHerramientasService.class).updateCxlcConciliar(cxlcCiclo, consultaClcDTO.getConciliaSICOP(), cxlcConciliar);
            
            consultaClcDTO = new ConsultaClcDTO();
            
            super.saveMessage(model, "clc.herramientas.conciliacion.ok");
        }
        
        // Seccion
        consultaClcDTO.setSeccion(" - Concilia CLC");
        // Bean Name pagedList
        consultaClcDTO.setBeanName("busquedaConciliaCLC");
        
        // Navegacion
        consultaClcDTO.setUrlOrigen("consultaConciliaCLC");
        consultaClcDTO.setUrlDestino("verificaConciliaCLC");
        
        // Modulo
        consultaClcDTO.setConciliaCLC(true);
        
        model.addAttribute(consultaClcDTO);
        return super.getViewName("consultaClc");
    }
    
    /**
     * Metodo encargado de Borrar CLC con base en el objeto borraCLCDTO.
     * @author Oscar S.
     * @param model Model
     * @return String
     */
    @RequestMapping
    public String borraCLC(Model model, BorraClcDTO borraCLCDTO) {
        if (borraCLCDTO.isCancel()) {
            borraCLCDTO = new BorraClcDTO();
        }
        
        // Bean Name pagedList
        borraCLCDTO.setBeanName("busquedaBorraCLC");

        // Navegacion
        borraCLCDTO.setUrlOrigen("borraCLC");
        borraCLCDTO.setUrlDestino("borraCLC");

        model.addAttribute(borraCLCDTO);
        return super.getViewName("borraCLC");
    }
    
    /**
     * Metodo encargado de ejecutar el stored procedure para Borrar CLC con base en el objeto borraCLCDTO.
     * @author Oscar S.
     * @param model Model
     * @param borraCLCDTO BorraClcDTO
     * @return String
     */
    @RequestMapping
    public String executeProcedureBorraClc(Model model, BorraClcDTO borraCLCDTO) {
        if (borraCLCDTO.getCicloUnidad() == null || borraCLCDTO.getCicloUnidad() == 0) {
            super.saveError(model, "clc.herramientas.borraCLC.error.cicloUnidad");
        } else if (borraCLCDTO.getQnaPago() == null || borraCLCDTO.getQnaPago() == 0) {
            super.saveError(model, "clc.herramientas.borraCLC.error.qnaPago");
        } else if (borraCLCDTO.getTipoNomina() == null || borraCLCDTO.getTipoNomina().equals("") || borraCLCDTO.getTipoNomina().equals("0")) {
            super.saveError(model, "clc.herramientas.borraCLC.error.tipoNomina");
        } else if (borraCLCDTO.getNumComplem() == null || borraCLCDTO.getNumComplem().equals("")) {
            super.saveError(model, "clc.herramientas.borraCLC.error.numComplem");
        } else if (borraCLCDTO.getSituacion() == null || borraCLCDTO.getSituacion().equals("")) {
            super.saveError(model, "clc.herramientas.borraCLC.error.situacion");
        } else {
            // Values: situacion C
            // Values: estatus C | D
            // Values: executeError: 0 | OK - 1 | ERROR
            Integer executeError = super.getService(ClcHerramientasService.class).executeProcedureClcOrdinaria(borraCLCDTO);
            
            if (executeError == 0) {
                super.saveMessage(model, "clc.herramientas.borraCLC.ok");
                borraCLCDTO = new BorraClcDTO();
                
                // Bean Name pagedList
                borraCLCDTO.setBeanName("busquedaBorraCLC");

                // Navegacion
                borraCLCDTO.setUrlOrigen("borraCLC");
                borraCLCDTO.setUrlDestino("borraCLC");
            } else {
                super.saveError(model, "clc.herramientas.borraCLC.error");
            }
        }
        model.addAttribute(borraCLCDTO);
        return super.getViewName("borraCLC");
    }
    
    /**
     * Metodo encargado de la busqueda de errores con base en el objeto busquedaErroresDTO.
     * @author Oscar S.
     * @param model Model
     * @param busquedaErroresDTO BusquedaErroresDTO
     * @return String
     */
    @RequestMapping
    public String busquedaErrores(Model model, BusquedaErroresDTO busquedaErroresDTO) {
        if (busquedaErroresDTO.isCancel()) {
            busquedaErroresDTO = new BusquedaErroresDTO();
        }
        
        // Bean Name pagedList
        busquedaErroresDTO.setBeanName("busquedaErrores");

        // Navegacion
        busquedaErroresDTO.setUrlOrigen("busquedaErrores");
        busquedaErroresDTO.setUrlDestino("busquedaErrores");
        
        model.addAttribute(busquedaErroresDTO);
        return super.getViewName("busquedaErrores");
    }
}
