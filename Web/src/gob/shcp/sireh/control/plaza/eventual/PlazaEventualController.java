package gob.shcp.sireh.control.plaza.eventual;

import gob.shcp.fsn.control.AbstractController;
import gob.shcp.fsn.control.support.AnnotatedController;

import gob.shcp.sireh.model.plaza.ConsultaPlazaDTO;

import gob.shcp.sireh.model.plaza.eventual.CambioPtoFisicoPlazaDTO;
import gob.shcp.sireh.model.plaza.eventual.CambioSitPlazaDTO;
import gob.shcp.sireh.model.plaza.eventual.CambioURFisicaPlazaDTO;
import gob.shcp.sireh.model.plaza.eventual.CreacionPlazaDTO;
import gob.shcp.sireh.model.plaza.eventual.LiberaPlazaDTO;
import gob.shcp.sireh.model.plaza.eventual.ModificaTipoSPDTO;
import gob.shcp.sireh.model.plaza.eventual.ProrrogaContratoDTO;

import gob.shcp.sireh.service.SirehUtils;
import gob.shcp.sireh.service.nomina.calculo.CalculoNominaService;
import gob.shcp.sireh.service.plaza.eventual.PlazaEventualService;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PlazaEventualController extends AbstractController implements AnnotatedController {

    /**
     * Metodo encargado de preparar el Formulario de Captura para la Creacion de Plazas de Tipo Eventual.
     * @author Oscar S.
     * @param model Model
     * @return String
     */
    @RequestMapping
    public String creacionPlaza(Model model) {
        CreacionPlazaDTO creacionPlazaDTO = new CreacionPlazaDTO();

        // Obtener Ciclo
        creacionPlazaDTO.setUniCiclo(super.security().getOperationYear());
        creacionPlazaDTO.setUniEdoCiclo(super.security().getOperationYear());
        creacionPlazaDTO.setIdRango(new Integer(0));
        
        // Rango de fechas - quincena de captura
        Integer quincenaCaptura = super.getService(CalculoNominaService.class).getQuincenaCapturaasInteger();
        creacionPlazaDTO.setInicioQuincenaCaptura(SirehUtils.getQuincenaCapturaAsDate(quincenaCaptura, 'I'));
        creacionPlazaDTO.setFinQuincenaCaptura(SirehUtils.getQuincenaCapturaAsDate(quincenaCaptura, 'F'));
        
        model.addAttribute(creacionPlazaDTO);
        return super.getViewName("creacionPlaza");
    }

    /** 
     * Metodo encargado de Crear Plazas de Tipo Eventual.
     * @author Oscar S.
     * @param model Model
     * @param creacionPlazaDTO CreacionPlazaDTO
     * @return String
     */
    @RequestMapping
    public String saveCreacionPlaza(Model model, CreacionPlazaDTO creacionPlazaDTO) {
        String nuevoIdPlaza = super.getService(PlazaEventualService.class).createPlaza(creacionPlazaDTO, super.security().getUserName());

        creacionPlazaDTO = new CreacionPlazaDTO();
        
        // Obtener Ciclo
        creacionPlazaDTO.setUniCiclo(super.security().getOperationYear());
        creacionPlazaDTO.setUniEdoCiclo(super.security().getOperationYear());
        creacionPlazaDTO.setIdRango(new Integer(0));
        
        model.addAttribute(creacionPlazaDTO);
        super.saveMessage(model, "plaza.consulta.creacionPlaza.ok", nuevoIdPlaza);
        return super.getViewName("creacionPlaza");
    }

    /**
     * Metodo encargado de consultar plazas de tipo eventual para su Liberación.
     * @author Oscar S.
     * @param model Model
     * @param consultaPlazaDTO ConsultaPlazaDTO
     * @return String
     */
    @RequestMapping
    public String consultaLiberaPlaza(Model model, ConsultaPlazaDTO consultaPlazaDTO) {
        if (consultaPlazaDTO.isCancel()) {
            consultaPlazaDTO = new ConsultaPlazaDTO();
        }
        // Seccion
        consultaPlazaDTO.setSeccion(" - Libera eventual");
        // Bean Name selectList
        consultaPlazaDTO.setBeanNameSituacion("tcSitPlazaLibera");
        // Bean Name selectList - Unidad
        consultaPlazaDTO.setBeanNameUnidad("tcUnidadBusqueda");
        // Bean Name pagedList
        consultaPlazaDTO.setBeanName("liberaPlazasEventual");

        consultaPlazaDTO.setUrlOrigen("consultaLiberaPlaza");
        consultaPlazaDTO.setUrlDestino("liberaPlaza");

        // Obtener Ciclo
        consultaPlazaDTO.setUniCiclo(super.security().getOperationYear());

        model.addAttribute(consultaPlazaDTO);
        return super.getViewName("consultaPlaza");
    }

    /**
     * Metodo encargado de obtener el id e la Plaza para su liberación.
     * @author Oscar S.
     * @param model Model
     * @param idPlaza Integer
     * @return String
     */
    @RequestMapping
    public String liberaPlaza(Model model, @RequestParam("idPlaza") Integer idPlaza) {
        String viewName;

        // Obtener Plaza
        LiberaPlazaDTO liberaPlazaDTO = super.getService(PlazaEventualService.class).getLiberaPlaza(idPlaza);

        // Obtener Ciclo
        liberaPlazaDTO.setUniCiclo(super.security().getOperationYear());
        liberaPlazaDTO.setIdCiclo(super.security().getOperationYear());
        
        // Rango de fechas - quincena de cpatura
        Integer quincenaCaptura = super.getService(CalculoNominaService.class).getQuincenaCapturaasInteger();
        liberaPlazaDTO.setInicioQuincenaCaptura(SirehUtils.getQuincenaCapturaAsDate(quincenaCaptura, 'I'));
        liberaPlazaDTO.setFinQuincenaCaptura(SirehUtils.getQuincenaCapturaAsDate(quincenaCaptura, 'F'));
        
        // Valida Situacion de la Plaza
        if (liberaPlazaDTO.getIdSitPlaza().equals("INVALIDA")) {
            super.saveError(model, "operacion.no.permitida");
            ConsultaPlazaDTO consultaPlazaDTO = new ConsultaPlazaDTO();

            viewName = consultaLiberaPlaza(model, consultaPlazaDTO);
            model.addAttribute(consultaPlazaDTO);
        } else {
            viewName = super.getViewName("liberaPlaza");
            model.addAttribute(liberaPlazaDTO);
        }
        return viewName;
    }

    /**
     * Metodo encargado de liberar Plaza con base en el objeto LiberaPlazaDTO.
     * @author Oscar S.
     * @param model Model
     * @param liberaPlazaDTO LiberaPlazaDTO
     * @return String
     */
    @RequestMapping
    public String updateLiberaPlaza(Model model, LiberaPlazaDTO liberaPlazaDTO) {
        super.getService(PlazaEventualService.class).updateLiberaPlaza(liberaPlazaDTO, super.security().getUserName());

        ConsultaPlazaDTO consultaPlazaDTO = new ConsultaPlazaDTO();

        // Seccion
        consultaPlazaDTO.setSeccion(" - Libera eventual");
        // Bean Name selectList
        consultaPlazaDTO.setBeanNameSituacion("tcSitPlazaLibera");
        // Bean Name selectList - Unidad
        consultaPlazaDTO.setBeanNameUnidad("tcUnidadBusqueda");
        // Bean Name pagedList
        consultaPlazaDTO.setBeanName("liberaPlazasEventual");

        consultaPlazaDTO.setUrlOrigen("consultaLiberaPlaza");
        consultaPlazaDTO.setUrlDestino("liberaPlaza");

        model.addAttribute(consultaPlazaDTO);

        super.saveMessage(model, "plaza.consulta.liberaPlaza.ok");
        return super.getViewName("consultaPlaza");
    }

    /**
     * Metodo encargado de consultar plazas para su Cambio de Situación.
     * @author Oscar S.
     * @param model Model
     * @param consultaPlazaDTO ConsultaPlazaDTO
     * @return String
     */
    @RequestMapping
    public String consultaCambioSitPlaza(Model model, ConsultaPlazaDTO consultaPlazaDTO) {
        if (consultaPlazaDTO.isCancel()) {
            consultaPlazaDTO = new ConsultaPlazaDTO();
        }
        // Seccion
        consultaPlazaDTO.setSeccion(" - Modifica situación");
        // Bean Name selectList
        consultaPlazaDTO.setBeanNameSituacion("tcCambioSitPlaza");
        // Bean Name selectList - Unidad
        consultaPlazaDTO.setBeanNameUnidad("tcUnidadBusquedaNotLike");
        // Bean Name pagedList
        consultaPlazaDTO.setBeanName("cambioSitPlazasEventual");

        consultaPlazaDTO.setUrlOrigen("consultaCambioSitPlaza");
        consultaPlazaDTO.setUrlDestino("cambioSitPlaza");

        // Obtener Ciclo
        consultaPlazaDTO.setUniCiclo(super.security().getOperationYear());

        model.addAttribute(consultaPlazaDTO);
        return super.getViewName("consultaPlaza");
    }

    /**
     * Metodo encargado de obtener el id e la Plaza para su Cambio de Situación.
     * @author Oscar S.
     * @param model Model
     * @param idPlaza Integer
     * @return String
     */
    @RequestMapping
    public String cambioSitPlaza(Model model, @RequestParam("idPlaza") Integer idPlaza) {
        String viewName;

        // Obtener Plaza
        CambioSitPlazaDTO cambioSitPlazaDTO = super.getService(PlazaEventualService.class).getCambioSitPlaza(idPlaza);

        // Obtener Ciclo
        cambioSitPlazaDTO.setUniCiclo(super.security().getOperationYear());
        cambioSitPlazaDTO.setIdCiclo(super.security().getOperationYear());

        // Valida Situacion de la Plaza
        if (cambioSitPlazaDTO.getIdSitPlaza().equals("INVALIDA")) {
            super.saveError(model, "operacion.no.permitida");
            ConsultaPlazaDTO consultaPlazaDTO = new ConsultaPlazaDTO();

            viewName = consultaCambioSitPlaza(model, consultaPlazaDTO);
            model.addAttribute(consultaPlazaDTO);
        } else {
            viewName = super.getViewName("cambioSitPlaza");
            model.addAttribute(cambioSitPlazaDTO);
        }
        return viewName;
    }

    /**
     * Metodo encargado de cambiar la situación de la Plaza con base en el objeto CambioSitPlazaDTO.
     * @author Oscar S.
     * @param model Model
     * @param cambioSitPlazaDTO CambioSitPlazaDTO
     * @return String
     */
    @RequestMapping
    public String updateCambioSitPlaza(Model model, CambioSitPlazaDTO cambioSitPlazaDTO) {
        super.getService(PlazaEventualService.class).updateCambioSitPlazaPlaza(cambioSitPlazaDTO, super.security().getUserName());

        ConsultaPlazaDTO consultaPlazaDTO = new ConsultaPlazaDTO();

        // Seccion
        consultaPlazaDTO.setSeccion(" - Modifica situación");
        // Bean Name selectList
        consultaPlazaDTO.setBeanNameSituacion("tcCambioSitPlaza");
        // Bean Name selectList - Unidad
        consultaPlazaDTO.setBeanNameUnidad("tcUnidadBusquedaNotLike");
        // Bean Name pagedList
        consultaPlazaDTO.setBeanName("cambioSitPlazasEventual");

        consultaPlazaDTO.setUrlOrigen("consultaCambioSitPlaza");
        consultaPlazaDTO.setUrlDestino("cambioSitPlaza");

        model.addAttribute(consultaPlazaDTO);

        super.saveMessage(model, "plaza.consulta.cambioSitPlaza.ok");
        return super.getViewName("consultaPlaza");
    }

    /**
     * Metodo encargado de consultar plazas para su Cambio de Puesto Fisico.
     * @author Oscar S.
     * @param model Model
     * @param consultaPlazaDTO ConsultaPlazaDTO
     * @return String
     */
    @RequestMapping
    public String consCambioPtoFisicoPlaza(Model model, ConsultaPlazaDTO consultaPlazaDTO) {
        if (consultaPlazaDTO.isCancel()) {
            consultaPlazaDTO = new ConsultaPlazaDTO();
        }
        // Seccion
        consultaPlazaDTO.setSeccion(" - Modifica puesto nómina");
        // Bean Name selectList
        consultaPlazaDTO.setBeanNameSituacion("tcCambioPtoFisicoPlaza");
        // Bean Name selectList - Unidad
        consultaPlazaDTO.setBeanNameUnidad("tcUnidadBusquedaNotLike");
        // Bean Name pagedList
        consultaPlazaDTO.setBeanName("cambioPtoFisicoPlazasEventual");

        consultaPlazaDTO.setUrlOrigen("consCambioPtoFisicoPlaza");
        consultaPlazaDTO.setUrlDestino("cambioPtoFisicoPlaza");

        // Obtener Ciclo
        consultaPlazaDTO.setUniCiclo(super.security().getOperationYear());

        model.addAttribute(consultaPlazaDTO);
        return super.getViewName("consultaPlaza");
    }

    /**
     * Metodo encargado de obtener el id e la Plaza para su Cambio de Puesto Fisico.
     * @author Oscar S.
     * @param model Model
     * @param idPlaza Integer
     * @return String
     */
    @RequestMapping
    public String cambioPtoFisicoPlaza(Model model, @RequestParam("idPlaza") Integer idPlaza) {
        String viewName;

        // Obtener Plaza
        CambioPtoFisicoPlazaDTO cambioPtoFisicoPlazaDTO = super.getService(PlazaEventualService.class).getCambioPtoFisicoPlaza(idPlaza);

        // Obtener Ciclo
        cambioPtoFisicoPlazaDTO.setUniCiclo(super.security().getOperationYear());
        cambioPtoFisicoPlazaDTO.setIdCiclo(super.security().getOperationYear());

        // Valida Situacion de la Plaza
        if (cambioPtoFisicoPlazaDTO.getIdSitPlaza().equals("INVALIDA")) {
            super.saveError(model, "operacion.no.permitida");
            ConsultaPlazaDTO consultaPlazaDTO = new ConsultaPlazaDTO();

            viewName = consCambioPtoFisicoPlaza(model, consultaPlazaDTO);
            model.addAttribute(consultaPlazaDTO);
        } else {
            viewName = super.getViewName("cambioPtoFisicoPlaza");
            model.addAttribute(cambioPtoFisicoPlazaDTO);
        }
        return viewName;
    }

    /**
     * Metodo encargado de cambiar el Puesto Fisico de la Plaza con base en el objeto cambioPtoFisicoPlazaDTO.
     * @author Oscar S.
     * @param model Model
     * @param cambioPtoFisicoPlazaDTO CambioPtoFisicoPlazaDTO
     * @return String
     */
    @RequestMapping
    public String updateCambioPtoFisicoPlaza(Model model, CambioPtoFisicoPlazaDTO cambioPtoFisicoPlazaDTO) {
        super.getService(PlazaEventualService.class).updateCambioPtoFisicoPlaza(cambioPtoFisicoPlazaDTO, super.security().getUserName());

        ConsultaPlazaDTO consultaPlazaDTO = new ConsultaPlazaDTO();

        // Seccion
        consultaPlazaDTO.setSeccion(" - Modifica puesto nómina");
        // Bean Name selectList
        consultaPlazaDTO.setBeanNameSituacion("tcCambioPtoFisicoPlaza");
        // Bean Name selectList - Unidad
        consultaPlazaDTO.setBeanNameUnidad("tcUnidadBusquedaNotLike");
        // Bean Name pagedList
        consultaPlazaDTO.setBeanName("cambioPtoFisicoPlazasEventual");

        consultaPlazaDTO.setUrlOrigen("consCambioPtoFisicoPlaza");
        consultaPlazaDTO.setUrlDestino("cambioPtoFisicoPlaza");

        model.addAttribute(consultaPlazaDTO);

        super.saveMessage(model, "plaza.consulta.cambioPtoFisicoPlaza.ok");
        return super.getViewName("consultaPlaza");
    }

    /**
     * Metodo encargado de verificar si un Código de puesto está sobrevaluado.
     * @author Oscar S.
     * @param cambioPtoFisicoPlazaDTO CambioPtoFisicoPlazaDTO
     * @return String
     */
    @RequestMapping
    public String verificaCambioPtoFisicoPlaza(Model model, CambioPtoFisicoPlazaDTO cambioPtoFisicoPlazaDTO) {
        boolean puestoSobrevaluado = super.getService(PlazaEventualService.class).verificaCambioPtoFisicoPlaza(cambioPtoFisicoPlazaDTO);

        if (puestoSobrevaluado) {
            cambioPtoFisicoPlazaDTO.setPuestoSobrevaluado(true);
            super.saveWarning(model, "plaza.consulta.cambioPtoFisicoPlaza.sobrevaluado");
        }

        // Obtener Ciclo
        cambioPtoFisicoPlazaDTO.setUniCiclo(super.security().getOperationYear());
        cambioPtoFisicoPlazaDTO.setIdCiclo(super.security().getOperationYear());

        model.addAttribute(cambioPtoFisicoPlazaDTO);

        return super.getViewName("cambioPtoFisicoPlaza");
    }

    /**
     * Metodo encargado de consultar plazas para su Cambio de Unidad Responsable.
     * @author Oscar S.
     * @param model Model
     * @param consultaPlazaDTO ConsultaPlazaDTO
     * @return String
     */
    @RequestMapping
    public String consultaCambioURFisicaPlaza(Model model, ConsultaPlazaDTO consultaPlazaDTO) {
        if (consultaPlazaDTO.isCancel()) {
            consultaPlazaDTO = new ConsultaPlazaDTO();
        }
        // Seccion
        consultaPlazaDTO.setSeccion(" - Modifica adscripción nómina");
        // Bean Name selectList
        consultaPlazaDTO.setBeanNameSituacion("tcCambioURFisicaPlaza");
        // Bean Name selectList - Unidad
        consultaPlazaDTO.setBeanNameUnidad("tcUnidadBusquedaNotLike");
        // Bean Name pagedList
        consultaPlazaDTO.setBeanName("cambioURFisicaPlazasEventual");

        consultaPlazaDTO.setUrlOrigen("consultaCambioURFisicaPlaza");
        consultaPlazaDTO.setUrlDestino("cambioURFisicaPlaza");

        // Obtener Ciclo
        consultaPlazaDTO.setUniCiclo(super.security().getOperationYear());

        model.addAttribute(consultaPlazaDTO);
        return super.getViewName("consultaPlaza");
    }

    /**
     * Metodo encargado de cambiar la Unidad Responsable de la Plaza con base en el objeto cambiURFisicaPlazaDTO.
     * @author Oscar S.
     * @param model Model
     * @param idPlaza Integer
     * @return String
     */
    @RequestMapping
    public String cambioURFisicaPlaza(Model model, @RequestParam("idPlaza") Integer idPlaza) {
        String viewName;

        // Obtener Plaza
        CambioURFisicaPlazaDTO cambioURFisicaPlazaDTO = super.getService(PlazaEventualService.class).getCambioURFisicaPlaza(idPlaza);

        // Obtener Ciclo
        cambioURFisicaPlazaDTO.setUniCiclo(super.security().getOperationYear());
        cambioURFisicaPlazaDTO.setIdCiclo(super.security().getOperationYear());

        // Valida Situacion de la Plaza
        if (cambioURFisicaPlazaDTO.getIdSitPlaza().equals("INVALIDA")) {
            super.saveError(model, "operacion.no.permitida");
            ConsultaPlazaDTO consultaPlazaDTO = new ConsultaPlazaDTO();

            viewName = consultaCambioURFisicaPlaza(model, consultaPlazaDTO);
            model.addAttribute(consultaPlazaDTO);
        } else {
            viewName = super.getViewName("cambioURFisicaPlaza");
            model.addAttribute(cambioURFisicaPlazaDTO);
        }
        return viewName;
    }

    /**
     * Metodo encargado de cambiar la Unidad Responsable de la Plaza con base en el objeto cambioURFisicaPlazaDTO.
     * @author Oscar S.
     * @param model Model
     * @param cambioURFisicaPlazaDTO CambioURFisicaPlazaDTO
     * @return String
     */
    @RequestMapping
    public String updateCambioURFisicaPlaza(Model model, CambioURFisicaPlazaDTO cambioURFisicaPlazaDTO) {
        super.getService(PlazaEventualService.class).updateCambioURFisicaPlaza(cambioURFisicaPlazaDTO, super.security().getUserName());

        ConsultaPlazaDTO consultaPlazaDTO = new ConsultaPlazaDTO();

        // Seccion
        consultaPlazaDTO.setSeccion(" - Modifica adscripción nómina");
        // Bean Name selectList
        consultaPlazaDTO.setBeanNameSituacion("tcCambioURFisicaPlaza");
        // Bean Name selectList - Unidad
        consultaPlazaDTO.setBeanNameUnidad("tcUnidadBusquedaNotLike");
        // Bean Name pagedList
        consultaPlazaDTO.setBeanName("cambioURFisicaPlazasEventual");

        consultaPlazaDTO.setUrlOrigen("consultaCambioURFisicaPlaza");
        consultaPlazaDTO.setUrlDestino("cambioURFisicaPlaza");

        model.addAttribute(consultaPlazaDTO);

        super.saveMessage(model, "plaza.consulta.cambioAdscripcionPlaza.ok");
        return super.getViewName("consultaPlaza");
    }

    /**
     * Metodo encargado de consultar plazas para Modificación del Tipo de SP.
     * @author Oscar S.
     * @param model Model
     * @param consultaPlazaDTO ConsultaPlazaDTO
     * @return String
     */
    @RequestMapping
    public String consultaModificaTipoSP(Model model, ConsultaPlazaDTO consultaPlazaDTO) {
        if (consultaPlazaDTO.isCancel()) {
            consultaPlazaDTO = new ConsultaPlazaDTO();
        }
        // Seccion
        consultaPlazaDTO.setSeccion(" - Modifica tipo servidor público");
        // Bean Name selectList
        consultaPlazaDTO.setBeanNameSituacion("tcSitModificaTipoSP");
        // Bean Name selectList - Unidad
        consultaPlazaDTO.setBeanNameUnidad("tcUnidadBusquedaNotLike");
        // Bean Name pagedList
        consultaPlazaDTO.setBeanName("modificaTipoSPPlazasEventual");

        consultaPlazaDTO.setUrlOrigen("consultaModificaTipoSP");
        consultaPlazaDTO.setUrlDestino("modificaTipoSP");

        // Obtener Ciclo
        consultaPlazaDTO.setUniCiclo(super.security().getOperationYear());

        model.addAttribute(consultaPlazaDTO);
        return super.getViewName("consultaPlaza");
    }
    
    /**
     * Metodo encargado de obtener el id e la Plaza para su Modificación del Tipo de SP.
     * @author Oscar S.
     * @param model Model
     * @param idPlaza Integer
     * @return String
     */
    @RequestMapping
    public String modificaTipoSP(Model model, @RequestParam("idPlaza") Integer idPlaza) {
        String viewName;

        // Obtener Plaza
        ModificaTipoSPDTO modificaTipoServidorDTO = super.getService(PlazaEventualService.class).getModificaTipoSP(idPlaza);

        // Obtener Ciclo
        modificaTipoServidorDTO.setUniCiclo(super.security().getOperationYear());
        modificaTipoServidorDTO.setIdCiclo(super.security().getOperationYear());

        // Valida Situacion de la Plaza
        if (modificaTipoServidorDTO.getIdSitPlaza().equals("INVALIDA")) {
            super.saveError(model, "operacion.no.permitida");
            ConsultaPlazaDTO consultaPlazaDTO = new ConsultaPlazaDTO();

            viewName = consultaModificaTipoSP(model, consultaPlazaDTO);
            model.addAttribute(consultaPlazaDTO);
        } else {
            viewName = super.getViewName("modificaTipoSP");
            model.addAttribute(modificaTipoServidorDTO);
        }
        return viewName;
    }

    /**
     * Metodo encargado de Modificar el Tipo de SP de la Plaza con base en el objeto modificaTipoSPDTO.
     * @author Oscar S.
     * @param model Model
     * @param modificaTipoSPDTO ModificaTipoSPDTO
     * @return String
     */
    @RequestMapping
    public String updateModificaTipoSP(Model model, ModificaTipoSPDTO modificaTipoSPDTO) {
        super.getService(PlazaEventualService.class).updateModificaTipoSP(modificaTipoSPDTO, super.security().getUserName());

        ConsultaPlazaDTO consultaPlazaDTO = new ConsultaPlazaDTO();

        // Seccion
        consultaPlazaDTO.setSeccion(" - Modifica tipo servidor público");
        // Bean Name selectList
        consultaPlazaDTO.setBeanNameSituacion("tcSitModificaTipoSP");
        // Bean Name selectList - Unidad
        consultaPlazaDTO.setBeanNameUnidad("tcUnidadBusquedaNotLike");
        // Bean Name pagedList
        consultaPlazaDTO.setBeanName("modificaTipoSPPlazasEventual");

        consultaPlazaDTO.setUrlOrigen("consultaModificaTipoSP");
        consultaPlazaDTO.setUrlDestino("modificaTipoSP");

        model.addAttribute(consultaPlazaDTO);

        super.saveMessage(model, "plaza.consulta.modificaTipoSP.ok");
        return super.getViewName("consultaPlaza");
    }

    /**
     * Metodo encargado de consultar plazas para Prorroga de Contrato
     * @author Oscar S.
     * @param model Model
     * @param consultaPlazaDTO ConsultaPlazaDTO
     * @return String
     */
    @RequestMapping
    public String consultaProrrogaContrato(Model model, ConsultaPlazaDTO consultaPlazaDTO) {
        if (consultaPlazaDTO.isCancel()) {
            consultaPlazaDTO = new ConsultaPlazaDTO();
        }
        // Seccion
        consultaPlazaDTO.setSeccion(" - Prórroga contrato eventual");
        // Bean Name pagedList
        consultaPlazaDTO.setBeanName("prorrogaContratoPlazasEventual");
        // Bean Name selectList - Unidad
        consultaPlazaDTO.setBeanNameUnidad("tcUnidadBusquedaNotLike");
        // Prorroga Contrato Eventual
        consultaPlazaDTO.setProrrogaContratoEventual(true);
         
        consultaPlazaDTO.setUrlOrigen("consultaProrrogaContrato");
        consultaPlazaDTO.setUrlDestino("prorrogaContrato");

        // Obtener Ciclo
        consultaPlazaDTO.setUniCiclo(super.security().getOperationYear());

        model.addAttribute(consultaPlazaDTO);
        return super.getViewName("consultaPlaza");
    }

    /**
     * Metodo encargado de cambiar datos del Contrato de la Plaza con base en el objeto prorrogaContratoDTO.
     * @author Oscar S.
     * @param model Model
     * @param idPlaza Integer
     * @return String
     */
    @RequestMapping
    public String prorrogaContrato(Model model, @RequestParam("idPlaza") Integer idPlaza) {
        String viewName;

        // Obtener Plaza
        ProrrogaContratoDTO prorrogaContratoDTO = super.getService(PlazaEventualService.class).getProrrogaContrato(idPlaza);

        // Obtener Ciclo
        prorrogaContratoDTO.setUniCiclo(super.security().getOperationYear());
        prorrogaContratoDTO.setIdCiclo(super.security().getOperationYear());

        // Valida Situacion de la Plaza
        if (prorrogaContratoDTO.getIdSitPlaza().equals("INVALIDA")) {
            super.saveError(model, "operacion.no.permitida");
            ConsultaPlazaDTO consultaPlazaDTO = new ConsultaPlazaDTO();

            viewName = consultaProrrogaContrato(model, consultaPlazaDTO);
            model.addAttribute(consultaPlazaDTO);
        } else {
            viewName = super.getViewName("prorrogaContrato");
            model.addAttribute(prorrogaContratoDTO);
        }
        return viewName;
    }

    /**
     * Metodo encargado de cambiar la Prorroga de Contrato de la Plaza con base en el objeto prorrogaContratoDTO.
     * @author Oscar S.
     * @param model Model
     * @param prorrogaContratoDTO ProrrogaContratoDTO
     * @return String
     */
    @RequestMapping
    public String updateProrrogaContrato(Model model, ProrrogaContratoDTO prorrogaContratoDTO) {
        super.getService(PlazaEventualService.class).updateProrrogaContrato(prorrogaContratoDTO, super.security().getUserName());

        ConsultaPlazaDTO consultaPlazaDTO = new ConsultaPlazaDTO();

        // Seccion
        consultaPlazaDTO.setSeccion(" - Prórroga contrato eventual");
        // Bean Name selectList - Unidad
        consultaPlazaDTO.setBeanNameUnidad("tcUnidadBusquedaNotLike");
        // Bean Name pagedList
        consultaPlazaDTO.setBeanName("prorrogaContratoPlazasEventual");
        // Prorroga Contrato Eventual
        consultaPlazaDTO.setProrrogaContratoEventual(true);

        consultaPlazaDTO.setUrlOrigen("consultaProrrogaContrato");
        consultaPlazaDTO.setUrlDestino("prorrogaContrato");
        
        // Obtener Ciclo
        consultaPlazaDTO.setUniCiclo(super.security().getOperationYear());
        
        model.addAttribute(consultaPlazaDTO);

        super.saveMessage(model, "plaza.consulta.prorrogaContrato.ok");
        return super.getViewName("consultaPlaza");
    }

    /**
     * Metodo encargado de consultar plazas para su Eliminación.
     * @author Oscar S.
     * @param model Model
     * @param consultaPlazaDTO ConsultaPlazaDTO
     * @return String
     */
    @RequestMapping
    public String consultaDepuraPlazas(Model model, ConsultaPlazaDTO consultaPlazaDTO) {
        if (consultaPlazaDTO.isCancel()) {
            consultaPlazaDTO = new ConsultaPlazaDTO();
        }
        // Seccion
        consultaPlazaDTO.setSeccion(" - Depura");
        // Bean Name selectList
        consultaPlazaDTO.setBeanNameSituacion("tcSitPlazaDepuraEventuales");
        // Bean Name selectList - Unidad
        consultaPlazaDTO.setBeanNameUnidad("tcUnidadBusquedaNotLike");
        // Bean Name pagedList
        consultaPlazaDTO.setBeanName("depuraPlazasEventuales");
        // Depuracion
        consultaPlazaDTO.setDepura(true);
        consultaPlazaDTO.setUrlOrigenDepura("depuraPlazas");

        consultaPlazaDTO.setUrlOrigen("consultaDepuraPlazas");
        consultaPlazaDTO.setUrlDestino("depuraPlazasDetalle");

        // Obtener Ciclo
        consultaPlazaDTO.setUniCiclo(super.security().getOperationYear());

        model.addAttribute(consultaPlazaDTO);
        return super.getViewName("consultaPlaza");
    }

    /**
     * Metodo encargado de eliminar Plazas de Tipo Eventual.
     * @author Oscar S.
     * @param model Model
     * @param consultaPlazaDTO ConsultaPlazaDTO
     * @return String
     */
    @RequestMapping
    public String depuraPlazas(Model model, ConsultaPlazaDTO consultaPlazaDTO) {
        Integer[] idPlazas = consultaPlazaDTO.getIdPlazas();

        super.getService(PlazaEventualService.class).depuraPlazas(idPlazas, super.security().getUserName());

        // Seccion
        consultaPlazaDTO.setSeccion(" - Depura");
        // Bean Name selectList
        consultaPlazaDTO.setBeanNameSituacion("tcSitPlazaDepuraEventuales");
        // Bean Name selectList - Unidad
        consultaPlazaDTO.setBeanNameUnidad("tcUnidadBusquedaNotLike");
        // Bean Name pagedList
        consultaPlazaDTO.setBeanName("depuraPlazasEventuales");
        // Depuracion
        consultaPlazaDTO.setDepura(true);
        consultaPlazaDTO.setUrlOrigenDepura("depuraPlazas");

        consultaPlazaDTO.setUrlOrigen("consultaDepuraPlazas");
        consultaPlazaDTO.setUrlDestino("depuraPlazasDetalle");

        // Obtener Ciclo
        consultaPlazaDTO.setUniCiclo(super.security().getOperationYear());

        model.addAttribute(consultaPlazaDTO);

        super.saveMessage(model, "plaza.consulta.depuraPlaza.ok");
        return super.getViewName("consultaPlaza");
    }
}