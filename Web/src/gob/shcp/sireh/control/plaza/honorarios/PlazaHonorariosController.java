package gob.shcp.sireh.control.plaza.honorarios;

import gob.shcp.fsn.control.AbstractController;
import gob.shcp.fsn.control.support.AnnotatedController;

import gob.shcp.sireh.model.plaza.ConsultaPlazaDTO;
import gob.shcp.sireh.model.plaza.honorarios.ModificaImporteDTO;
import gob.shcp.sireh.model.plaza.honorarios.ProrrogaContratoDTO;
import gob.shcp.sireh.model.plaza.honorarios.CreacionPlazaDTO;
import gob.shcp.sireh.model.plaza.honorarios.CambioSitPlazaDTO;
import gob.shcp.sireh.model.plaza.honorarios.LiberaPlazaDTO;

import gob.shcp.sireh.service.SirehUtils;
import gob.shcp.sireh.service.nomina.calculo.CalculoNominaService;
import gob.shcp.sireh.service.plaza.honorarios.PlazaHonorariosService;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PlazaHonorariosController extends AbstractController implements AnnotatedController {

    /**
     * Metodo encargado de preparar el Formulario de Captura para la Creacion de Plazas de Tipo Honorarios.
     * @author Oscar S.
     * @param model Model
     * @return String
     */
    @RequestMapping
    public String creacionPlaza(Model model) {
        CreacionPlazaDTO creacionPlazaDTO = new CreacionPlazaDTO();

        // Obtener Ciclo
        creacionPlazaDTO.setUniCiclo(super.security().getOperationYear());
        creacionPlazaDTO.setIdCiclo(super.security().getOperationYear());
        creacionPlazaDTO.setIdRango(new Integer(0));
        
        // Rango de fechas - quincena de captura
        Integer quincenaCaptura = super.getService(CalculoNominaService.class).getQuincenaCapturaasInteger();
        creacionPlazaDTO.setInicioQuincenaCaptura(SirehUtils.getQuincenaCapturaAsDate(quincenaCaptura, 'I'));
        creacionPlazaDTO.setFinQuincenaCaptura(SirehUtils.getQuincenaCapturaAsDate(quincenaCaptura, 'F'));
        
        model.addAttribute(creacionPlazaDTO);
        return super.getViewName("creacionPlaza");
    }

    /** 
     * Metodo encargado de Crear Plazas de Tipo Honorarios.
     * @author Oscar S.
     * @param model Model
     * @param creacionPlazaDTO CreacionPlazaDTO
     * @return String
     */
    @RequestMapping
    public String saveCreacionPlaza(Model model, CreacionPlazaDTO creacionPlazaDTO) {
        //Importe Honorario
        String importe = creacionPlazaDTO.getImporteHonorarioString().replaceAll(",", "");
        creacionPlazaDTO.setImporteHonorario(new Double(importe));
        
        String nuevoIdPlaza = super.getService(PlazaHonorariosService.class).createPlaza(creacionPlazaDTO, super.security().getUserName());

        creacionPlazaDTO = new CreacionPlazaDTO();
        
        // Obtener Ciclo
        creacionPlazaDTO.setUniCiclo(super.security().getOperationYear());
        creacionPlazaDTO.setIdCiclo(super.security().getOperationYear());
        creacionPlazaDTO.setIdRango(new Integer(0));
        
        model.addAttribute(creacionPlazaDTO);
        super.saveMessage(model, "plaza.consulta.creacionPlaza.ok", nuevoIdPlaza);
        return super.getViewName("creacionPlaza");
    }

    /**
     * Metodo encargado de consultar plazas de tipo honorarios para su Liberación.
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
        consultaPlazaDTO.setSeccion(" - Libera honorarios");
        // Bean Name selectList
        consultaPlazaDTO.setBeanNameSituacion("tcSitPlazaLibera");
        // Bean Name selectList - Unidad
        consultaPlazaDTO.setBeanNameUnidad("tcUnidadBusqueda");
        // Bean Name pagedList
        consultaPlazaDTO.setBeanName("liberaPlazasHonorarios");

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
        LiberaPlazaDTO liberaPlazaDTO = super.getService(PlazaHonorariosService.class).getLiberaPlaza(idPlaza);

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
            
            // Obtener importe honorario
            //liberaPlazaDTO.setImporteHonorarioString(String.valueOf(liberaPlazaDTO.getPlazaImpHono()));
            
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
        // Importe Honorario
        String importe = liberaPlazaDTO.getImporteHonorarioString().replaceAll(",", "");
        liberaPlazaDTO.setPlazaImpHono(new Double(importe));
        
        super.getService(PlazaHonorariosService.class).updateLiberaPlaza(liberaPlazaDTO, super.security().getUserName());

        ConsultaPlazaDTO consultaPlazaDTO = new ConsultaPlazaDTO();

        // Seccion
        consultaPlazaDTO.setSeccion(" - Libera honorarios");
        // Bean Name selectList
        consultaPlazaDTO.setBeanNameSituacion("tcSitPlazaLibera");
        // Bean Name selectList - Unidad
        consultaPlazaDTO.setBeanNameUnidad("tcUnidadBusqueda");
        // Bean Name pagedList
        consultaPlazaDTO.setBeanName("liberaPlazasHonorarios");

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
        consultaPlazaDTO.setBeanName("cambioSitPlazasHonorarios");

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
        CambioSitPlazaDTO cambioSitPlazaDTO = super.getService(PlazaHonorariosService.class).getCambioSitPlaza(idPlaza);

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
        super.getService(PlazaHonorariosService.class).updateCambioSitPlazaPlaza(cambioSitPlazaDTO, super.security().getUserName());

        ConsultaPlazaDTO consultaPlazaDTO = new ConsultaPlazaDTO();

        // Seccion
        consultaPlazaDTO.setSeccion(" - Modifica situación");
        // Bean Name selectList
        consultaPlazaDTO.setBeanNameSituacion("tcCambioSitPlaza");
        // Bean Name selectList - Unidad
        consultaPlazaDTO.setBeanNameUnidad("tcUnidadBusquedaNotLike");
        // Bean Name pagedList
        consultaPlazaDTO.setBeanName("cambioSitPlazas");

        consultaPlazaDTO.setUrlOrigen("consultaCambioSitPlaza");
        consultaPlazaDTO.setUrlDestino("cambioSitPlazasHonorarios");

        model.addAttribute(consultaPlazaDTO);

        super.saveMessage(model, "plaza.consulta.cambioSitPlaza.ok");
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
        consultaPlazaDTO.setSeccion(" - Prórroga contrato honorarios");
        // Bean Name pagedList
        consultaPlazaDTO.setBeanName("prorrogaContratoPlazasHonorarios");
        // Bean Name selectList - Unidad
        consultaPlazaDTO.setBeanNameUnidad("tcUnidadBusquedaNotLike");
        // Prorroga Contrato Honorarios
        consultaPlazaDTO.setProrrogaContratoHonorarios(true);
        
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
        ProrrogaContratoDTO prorrogaContratoDTO = super.getService(PlazaHonorariosService.class).getProrrogaContrato(idPlaza);

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
            
            // Obtener importe honorario
            prorrogaContratoDTO.setImporteHonorarioString(String.valueOf(prorrogaContratoDTO.getPlazaImpHono()));
            
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
        // Importe Honorario
        String importe = prorrogaContratoDTO.getImporteHonorarioString().replaceAll(",", "");
        prorrogaContratoDTO.setPlazaImpHono(new Double(importe));
        
        super.getService(PlazaHonorariosService.class).updateProrrogaContrato(prorrogaContratoDTO, super.security().getUserName());
        super.saveMessage(model, "plaza.consulta.prorrogaContrato.ok");

        return consultaProrrogaContrato( model, new ConsultaPlazaDTO());
    }

    /**
     * Metodo encargado de consultar plazas para Modificación de Importe.
     * @author Oscar S.
     * @param model Model
     * @param consultaPlazaDTO ConsultaPlazaDTO
     * @return String
     */
    @RequestMapping
    public String consultaModificaImporte(Model model, ConsultaPlazaDTO consultaPlazaDTO) {
        if (consultaPlazaDTO.isCancel()) {
            consultaPlazaDTO = new ConsultaPlazaDTO();
        }
        // Seccion
        consultaPlazaDTO.setSeccion(" - Modifica importe");
        // Bean Name selectList
        consultaPlazaDTO.setBeanNameSituacion("tcSitModificaImportePlaza");
        // Bean Name selectList - Unidad
        consultaPlazaDTO.setBeanNameUnidad("tcUnidadBusquedaNotLike");
        // Bean Name pagedList
        consultaPlazaDTO.setBeanName("modificaImportePlazasHonorarios");

        consultaPlazaDTO.setUrlOrigen("consultaModificaImporte");
        consultaPlazaDTO.setUrlDestino("modificaImporte");

        // Obtener Ciclo
        consultaPlazaDTO.setUniCiclo(super.security().getOperationYear());

        model.addAttribute(consultaPlazaDTO);
        return super.getViewName("consultaPlaza");
    }

    /**
     * Metodo encargado de modificar el Importe Honorarios de la Plaza con base en el objeto modificaImporteDTO.
     * @author Oscar S.
     * @param model Model
     * @param idPlaza Integer
     * @return String
     */
    @RequestMapping
    public String modificaImporte(Model model, @RequestParam("idPlaza") Integer idPlaza) {
        String viewName;

        // Obtener Plaza
        ModificaImporteDTO modificaImporteDTO = super.getService(PlazaHonorariosService.class).getModificaImporte(idPlaza);

        // Obtener Ciclo
        modificaImporteDTO.setUniCiclo(super.security().getOperationYear());
        modificaImporteDTO.setIdCiclo(super.security().getOperationYear());

        // Valida Situacion de la Plaza
        if (modificaImporteDTO.getIdSitPlaza().equals("INVALIDA")) {
            super.saveError(model, "operacion.no.permitida");
            ConsultaPlazaDTO consultaPlazaDTO = new ConsultaPlazaDTO();

            viewName = consultaModificaImporte(model, consultaPlazaDTO);
            model.addAttribute(consultaPlazaDTO);
        } else {
            viewName = super.getViewName("modificaImporte");
            
            // Obtener importe honorario
            modificaImporteDTO.setImporteHonorarioString(String.valueOf(modificaImporteDTO.getPlazaImpHono()));
            
            model.addAttribute(modificaImporteDTO);
        }
        return viewName;
    }

    @RequestMapping
    public String updateModificaImporte(Model model, ModificaImporteDTO modificaImporteDTO) {
        // Importe Honorario
        String importe = modificaImporteDTO.getImporteHonorarioString().replaceAll(",", "");
        modificaImporteDTO.setPlazaImpHono(new Double(importe));
        
        super.getService(PlazaHonorariosService.class).updateModificaImporte(modificaImporteDTO, super.security().getUserName());

        ConsultaPlazaDTO consultaPlazaDTO = new ConsultaPlazaDTO();

        // Seccion
        consultaPlazaDTO.setSeccion(" - Modifica importe");
        // Bean Name selectList
        consultaPlazaDTO.setBeanNameSituacion("tcSitModificaImportePlaza");
        // Bean Name selectList - Unidad
        consultaPlazaDTO.setBeanNameUnidad("tcUnidadBusquedaNotLike");
        // Bean Name pagedList
        consultaPlazaDTO.setBeanName("modificaImportePlazasHonorarios");

        consultaPlazaDTO.setUrlOrigen("consultaModificaImporte");
        consultaPlazaDTO.setUrlDestino("modificaImporte");

        model.addAttribute(consultaPlazaDTO);

        super.saveMessage(model, "plaza.consulta.modificaImporte.ok");
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
        consultaPlazaDTO.setBeanNameSituacion("tcSitPlazaDepuraHonorarios");
        // Bean Name selectList - Unidad
        consultaPlazaDTO.setBeanNameUnidad("tcUnidadBusquedaNotLike");
        // Bean Name pagedList
        consultaPlazaDTO.setBeanName("depuraPlazasHonorarios");
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
     * Metodo encargado de eliminar Plazas de Tipo Honorarios.
     * @author Oscar S.
     * @param model Model
     * @param consultaPlazaDTO ConsultaPlazaDTO
     * @return String
     */
    @RequestMapping
    public String depuraPlazas(Model model, ConsultaPlazaDTO consultaPlazaDTO) {
        Integer[] idPlazas = consultaPlazaDTO.getIdPlazas();
        String observaciones = consultaPlazaDTO.getObservaciones() != null ? consultaPlazaDTO.getObservaciones() : "";
        
        super.getService(PlazaHonorariosService.class).depuraPlazas(idPlazas, super.security().getUserName(), observaciones);

        // Seccion
        consultaPlazaDTO.setSeccion(" - Depura");
        // Bean Name selectList
        consultaPlazaDTO.setBeanNameSituacion("tcSitPlazaDepuraHonorarios");
        // Bean Name selectList - Unidad
        consultaPlazaDTO.setBeanNameUnidad("tcUnidadBusquedaNotLike");
        // Bean Name pagedList
        consultaPlazaDTO.setBeanName("depuraPlazasHonorarios");
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
