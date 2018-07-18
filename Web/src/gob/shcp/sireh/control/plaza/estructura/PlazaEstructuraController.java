package gob.shcp.sireh.control.plaza.estructura;

import gob.shcp.fsn.control.AbstractController;
import gob.shcp.fsn.control.support.AnnotatedController;

import gob.shcp.sireh.model.ItemDTO;
import gob.shcp.sireh.model.plaza.ConsultaPlazaDTO;

import gob.shcp.sireh.model.plaza.estructura.AsignaPlazaSoporteDTO;
import gob.shcp.sireh.model.plaza.estructura.CambioURFisicaPlazaDTO;
import gob.shcp.sireh.model.plaza.estructura.CambioPtoFisicoPlazaDTO;
import gob.shcp.sireh.model.plaza.estructura.CambioSitPlazaDTO;
import gob.shcp.sireh.model.plaza.estructura.DenominacionFuncionalDTO;
import gob.shcp.sireh.model.plaza.estructura.LiberaPlazaDTO;
import gob.shcp.sireh.model.plaza.estructura.ModificaDatosPresupuestalesDTO;
import gob.shcp.sireh.model.plaza.estructura.ModificaTipoSPDTO;
import gob.shcp.sireh.model.plaza.estructura.ObservacionesPlazaDTO;
import gob.shcp.sireh.model.plaza.estructura.PlazaEnConcursoDTO;
import gob.shcp.sireh.model.plaza.estructura.PromocionPermutaDTO;
import gob.shcp.sireh.model.plaza.estructura.ProrrogaArt34DTO;

import gob.shcp.sireh.service.SirehUtils;
import gob.shcp.sireh.service.nomina.calculo.CalculoNominaService;
import gob.shcp.sireh.service.plaza.estructura.PlazaEstructuraService;

import java.io.IOException;
import java.io.PrintWriter;

import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PlazaEstructuraController extends AbstractController implements AnnotatedController {

    @RequestMapping
    public String creacion(Model model) {
        return super.getViewName("creacion");
    }

    @RequestMapping
    public String conversion(Model model) {
        return super.getViewName("conversion");
    }

    @RequestMapping
    public String reubicacion(Model model) {
        return super.getViewName("reubicacion");
    }

    @RequestMapping
    public String cancelacion(Model model) {
        return super.getViewName("cancelacion");
    }

    @RequestMapping
    public String transferencia(Model model) {
        return super.getViewName("transferencia");
    }

    /**
     * Metodo encargado de consultar plazas para su Liberación.
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
        consultaPlazaDTO.setSeccion(" - Libera");
        // Bean Name selectList
        consultaPlazaDTO.setBeanNameSituacion("tcSitPlazaLibera");
        // Bean Name pagedList
        consultaPlazaDTO.setBeanName("liberaPlazas");
        
        consultaPlazaDTO.setUrlOrigen("consultaLiberaPlaza");
        consultaPlazaDTO.setUrlDestino("liberaPlaza");
        
        // Obtener Ciclo
        consultaPlazaDTO.setUniCiclo(super.security().getOperationYear());
        
        model.addAttribute(consultaPlazaDTO);
        return super.getViewName("consultaPlaza");
    }
    
    /**
     * Metodo encargado de obtener el id de la Plaza para su liberación.
     * @author Oscar S.
     * @param model Model
     * @param idPlaza Integer
     * @return String
     */
    @RequestMapping
    public String liberaPlaza(Model model, @RequestParam("idPlaza") Integer idPlaza) {
        String viewName;
        
        // Obtener Plaza
        LiberaPlazaDTO liberaPlazaDTO = super.getService(PlazaEstructuraService.class).getLiberaPlaza(idPlaza);
        
        // Obtener Ciclo
        liberaPlazaDTO.setUniCiclo(super.security().getOperationYear());
        liberaPlazaDTO.setIdCiclo(super.security().getOperationYear());
        
        // Rango de fechas - quincena de cpatura
        Integer quincenaCaptura = super.getService(CalculoNominaService.class).getQuincenaCapturaasInteger();
        liberaPlazaDTO.setInicioQuincenaCaptura(SirehUtils.getQuincenaCapturaAsDate(quincenaCaptura, 'I'));
        liberaPlazaDTO.setFinQuincenaCaptura(SirehUtils.getQuincenaCapturaAsDate(quincenaCaptura, 'F'));
        
        liberaPlazaDTO.setRadioAutorizacion(Integer.valueOf(0));
        
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
        super.getService(PlazaEstructuraService.class).updateLiberaPlaza(liberaPlazaDTO, super.security().getUserName());

        ConsultaPlazaDTO consultaPlazaDTO = new ConsultaPlazaDTO();

        // Seccion
        consultaPlazaDTO.setSeccion(" - Libera");
        // Bean Name selectList
        consultaPlazaDTO.setBeanNameSituacion("tcSitPlazaLibera");
        // Bean Name pagedList
        consultaPlazaDTO.setBeanName("liberaPlazas");

        consultaPlazaDTO.setUrlOrigen("consultaLiberaPlaza");
        consultaPlazaDTO.setUrlDestino("liberaPlaza");

        model.addAttribute(consultaPlazaDTO);

        super.saveMessage(model, "plaza.consulta.liberaPlaza.ok");
        return super.getViewName("consultaPlaza");
    }
    
    /**
     * Solicitud asincrona para obtener el catalogo de ejes tematicos.
     * @author Gualberto G
     * @param ptoExcepcion Integer
     * @param response HttpServletResponse
     */
     
    @RequestMapping
    public void getTcPuestoVacanciaCallback(@RequestParam("ptoExcepcion") Integer ptoExcepcion, @RequestParam("idPtoOrigen") String idPtoOrigen, HttpServletResponse response) throws IOException {
        StringBuffer sb = new StringBuffer();
        
        try {
            List<ItemDTO> items = super.getService(PlazaEstructuraService.class).findPuestoVacanciaByIdPtoOrigenPtoExcepcion( idPtoOrigen,  ptoExcepcion);
            sb.append("<option value=''>SELECCIONE...</option>");

            for (ItemDTO item: items) {
                sb.append("<option value='" + item.getClave() + "'>" + item.getClave() + " - " + item.getValor() + "</option>");
            }
        } catch (Exception e) {
            sb.append("<option value=''>SELECCIONE...</option>");
        }

        // Generar respuesta
        response.setHeader("Cache-Control", "no-cache");
        response.setDateHeader("Expires", 0);
        response.setHeader("Pragma", "no-cache");
        response.setContentType("text/plain");
        PrintWriter out = response.getWriter();
        out.print(sb.toString());
    }
    
    @RequestMapping
    public void getTcVacanciaCallback(@RequestParam("ptoExcepcion") Integer ptoExcepcion, HttpServletResponse response) throws IOException {
        StringBuffer sb = new StringBuffer();
        
        try {
           String labelVacancia = super.getService(PlazaEstructuraService.class).getTcVacanciaById(ptoExcepcion);
            sb.append(labelVacancia);

        } catch (Exception e) {
            sb.append("");
        }

        // Generar respuesta
        response.setHeader("Cache-Control", "no-cache");
        response.setDateHeader("Expires", 0);
        response.setHeader("Pragma", "no-cache");
        response.setContentType("text/plain");
        PrintWriter out = response.getWriter();
        out.print(sb.toString());
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
        // Bean Name pagedList
        consultaPlazaDTO.setBeanName("cambioSitPlazas");

        consultaPlazaDTO.setUrlOrigen("consultaCambioSitPlaza");
        consultaPlazaDTO.setUrlDestino("cambioSitPlaza");

        // Obtener Ciclo
        consultaPlazaDTO.setUniCiclo(super.security().getOperationYear());

        model.addAttribute(consultaPlazaDTO);
        return super.getViewName("consultaPlaza");
    }

    /**
     * Metodo encargado de obtener el id de la Plaza para su Cambio de Situación.
     * @author Oscar S.
     * @param model Model
     * @param idPlaza Integer
     * @return String
     */
    @RequestMapping
    public String cambioSitPlaza(Model model, @RequestParam("idPlaza") Integer idPlaza) {
        String viewName;

        // Obtener Plaza
        CambioSitPlazaDTO cambioSitPlazaDTO = super.getService(PlazaEstructuraService.class).getCambioSitPlaza(idPlaza);

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
        super.getService(PlazaEstructuraService.class).updateCambioSitPlazaPlaza(cambioSitPlazaDTO, super.security().getUserName());

        ConsultaPlazaDTO consultaPlazaDTO = new ConsultaPlazaDTO();

        // Seccion
        consultaPlazaDTO.setSeccion(" - Modifica situación");
        // Bean Name selectList
        consultaPlazaDTO.setBeanNameSituacion("tcCambioSitPlaza");
        // Bean Name pagedList
        consultaPlazaDTO.setBeanName("cambioSitPlazas");

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
        // Bean Name pagedList
        consultaPlazaDTO.setBeanName("cambioPtoFisicoPlazas");

        consultaPlazaDTO.setUrlOrigen("consCambioPtoFisicoPlaza");
        consultaPlazaDTO.setUrlDestino("cambioPtoFisicoPlaza");

        // Obtener Ciclo
        consultaPlazaDTO.setUniCiclo(super.security().getOperationYear());

        model.addAttribute(consultaPlazaDTO);
        return super.getViewName("consultaPlaza");
    }

    /**
     * Metodo encargado de obtener el id de la Plaza para su Cambio de Puesto Fisico.
     * @author Oscar S.
     * @param model Model
     * @param idPlaza Integer
     * @return String
     */
    @RequestMapping
    public String cambioPtoFisicoPlaza(Model model, @RequestParam("idPlaza") Integer idPlaza) {
        String viewName;

        // Obtener Plaza
        CambioPtoFisicoPlazaDTO cambioPtoFisicoPlazaDTO = super.getService(PlazaEstructuraService.class).getCambioPtoFisicoPlaza(idPlaza);

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
        super.getService(PlazaEstructuraService.class).updateCambioPtoFisicoPlaza(cambioPtoFisicoPlazaDTO, super.security().getUserName());

        ConsultaPlazaDTO consultaPlazaDTO = new ConsultaPlazaDTO();

        // Seccion
        consultaPlazaDTO.setSeccion(" - Modifica puesto físico");
        // Bean Name selectList
        consultaPlazaDTO.setBeanNameSituacion("tcCambioPtoFisicoPlaza");
        // Bean Name pagedList
        consultaPlazaDTO.setBeanName("cambioPtoFisicoPlazas");

        consultaPlazaDTO.setUrlOrigen("consultaCambioPtoFisicoPlaza");
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
        boolean puestoSobrevaluado = super.getService(PlazaEstructuraService.class).verificaCambioPtoFisicoPlaza(cambioPtoFisicoPlazaDTO);

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
        consultaPlazaDTO.setSeccion(" - Modifica unidad responsable");
        // Bean Name selectList
        consultaPlazaDTO.setBeanNameSituacion("tcCambioURFisicaPlaza");
        // Bean Name pagedList
        consultaPlazaDTO.setBeanName("cambioURFisicaPlazas");

        consultaPlazaDTO.setUrlOrigen("consultaCambioURFisicaPlaza");
        consultaPlazaDTO.setUrlDestino("cambioURFisicaPlaza");

        // Obtener Ciclo
        consultaPlazaDTO.setUniCiclo(super.security().getOperationYear());

        model.addAttribute(consultaPlazaDTO);
        return super.getViewName("consultaPlaza");
    }
    
    /**
     * Metodo encargado de obtener el id de la Plaza para su Cambio de Unidad Responsable.
     * @author Oscar S.
     * @param model Model
     * @param idPlaza Integer
     * @return String
     */
    @RequestMapping
    public String cambioURFisicaPlaza(Model model, @RequestParam("idPlaza") Integer idPlaza) {
        String viewName;

        // Obtener Plaza
        CambioURFisicaPlazaDTO cambioURFisicaPlazaDTO = super.getService(PlazaEstructuraService.class).getCambioURFisicaPlaza(idPlaza);

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
        super.getService(PlazaEstructuraService.class).updateCambioURFisicaPlaza(cambioURFisicaPlazaDTO, super.security().getUserName());

        ConsultaPlazaDTO consultaPlazaDTO = new ConsultaPlazaDTO();

        // Seccion
        consultaPlazaDTO.setSeccion(" - Modifica unidad responsable");
        // Bean Name selectList
        consultaPlazaDTO.setBeanNameSituacion("tcCambioURFisicaPlaza");
        // Bean Name pagedList
        consultaPlazaDTO.setBeanName("cambioURFisicaPlazas");

        consultaPlazaDTO.setUrlOrigen("consultaCambioURFisicaPlaza");
        consultaPlazaDTO.setUrlDestino("cambioURFisicaPlaza");

        model.addAttribute(consultaPlazaDTO);

        super.saveMessage(model, "plaza.consulta.cambioURFisicaPlaza.ok");
        return super.getViewName("consultaPlaza");
    }
    
    /**
     * Metodo encargado de consultar plazas para Modificación de Denominación Funcional.
     * @author Oscar S.
     * @param model Model
     * @param consultaPlazaDTO ConsultaPlazaDTO
     * @return String
     */
    @RequestMapping
    public String consMoDenominacionFuncional(Model model, ConsultaPlazaDTO consultaPlazaDTO) {
        if (consultaPlazaDTO.isCancel()) {
            consultaPlazaDTO = new ConsultaPlazaDTO();
        }
        // Seccion
        consultaPlazaDTO.setSeccion(" - Modifica denominación funcional");
        // Bean Name pagedList
        consultaPlazaDTO.setBeanName("modificaDenomFunc_PE");
        // Denominacion Funcional
        consultaPlazaDTO.setDenominacionFuncional(true);

        consultaPlazaDTO.setUrlOrigen("consMoDenominacionFuncional");
        consultaPlazaDTO.setUrlDestino("modificaDenominacionFuncional");

        // Obtener Ciclo
        consultaPlazaDTO.setUniCiclo(super.security().getOperationYear());

        model.addAttribute(consultaPlazaDTO);
        return super.getViewName("consultaPlaza");
    }
    
    /**
     * Metodo encargado de obtener el id de la Plaza para su Modificación de Denominación Funcional.
     * @author Oscar S.
     * @param model Model
     * @param idPlaza Integer
     * @return String
     */
    @RequestMapping
    public String modificaDenominacionFuncional(Model model, @RequestParam("idPlaza") Integer idPlaza) {
        String viewName;

        // Obtener Plaza
        DenominacionFuncionalDTO denominacionFuncionalDTO = super.getService(PlazaEstructuraService.class).getModificaDenominacionFuncional(idPlaza);

        // Obtener Ciclo
        denominacionFuncionalDTO.setUniCiclo(super.security().getOperationYear());
        denominacionFuncionalDTO.setIdCiclo(super.security().getOperationYear());

        // Valida Situacion de la Plaza
        if (denominacionFuncionalDTO.getIdSitPlaza().equals("INVALIDA")) {
            super.saveError(model, "operacion.no.permitida");
            ConsultaPlazaDTO consultaPlazaDTO = new ConsultaPlazaDTO();

            viewName = consMoDenominacionFuncional(model, consultaPlazaDTO);
            model.addAttribute(consultaPlazaDTO);
        } else {
            viewName = super.getViewName("modificaDenominacionFuncional");
            model.addAttribute(denominacionFuncionalDTO);
        }
        return viewName;
    }
    
    /**
     * Metodo encargado de modificar Denominación Funcional de la Plaza con base en el objeto denominacionFuncionalDTO.
     * @author Oscar S.
     * @param model Model
     * @param denominacionFuncionalDTO DenominacionFuncionalDTO
     * @return String
     */
    @RequestMapping
    public String updateModificaDenominacionFuncional(Model model, DenominacionFuncionalDTO denominacionFuncionalDTO) {
        super.getService(PlazaEstructuraService.class).updateModificaDenominacionFuncional(denominacionFuncionalDTO, super.security().getUserName());

        ConsultaPlazaDTO consultaPlazaDTO = new ConsultaPlazaDTO();

        // Seccion
        consultaPlazaDTO.setSeccion(" - Modifica denominación funcional");
        // Bean Name pagedList
        consultaPlazaDTO.setBeanName("modificaDenomFunc_PE");
        // Denominacion Funcional
        consultaPlazaDTO.setDenominacionFuncional(true);

        consultaPlazaDTO.setUrlOrigen("consMoDenominacionFuncional");
        consultaPlazaDTO.setUrlDestino("modificaDenominacionFuncional");

        model.addAttribute(consultaPlazaDTO);

        super.saveMessage(model, "plaza.consulta.denominacionFuncional.ok");
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
        consultaPlazaDTO.setBeanNameSituacion("tcSitModificaTipoSP_PE");
        // Bean Name pagedList
        consultaPlazaDTO.setBeanName("modificaTipoSP_PE");
        
        consultaPlazaDTO.setUrlOrigen("consultaModificaTipoSP");
        consultaPlazaDTO.setUrlDestino("modificaTipoSP");
        
        // Obtener Ciclo
        consultaPlazaDTO.setUniCiclo(super.security().getOperationYear());
        
        model.addAttribute(consultaPlazaDTO);
        return super.getViewName("consultaPlaza");
    }
    
    /**
     * Metodo encargado de obtener el id de la Plaza para su Modificación del Tipo de SP.
     * @author Oscar S.
     * @param model Model
     * @param idPlaza Integer
     * @return String
     */
    @RequestMapping
    public String modificaTipoSP(Model model, @RequestParam("idPlaza") Integer idPlaza) {
        String viewName;

        // Obtener Plaza
        ModificaTipoSPDTO modificaTipoServidorDTO = super.getService(PlazaEstructuraService.class).getModificaTipoSP(idPlaza);

        // Obtener Ciclo
        modificaTipoServidorDTO.setUniCiclo(super.security().getOperationYear());
        modificaTipoServidorDTO.setIdCiclo(super.security().getOperationYear());
        modificaTipoServidorDTO.setBeanNamePuesto("tcPuestoLibera");
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
        super.getService(PlazaEstructuraService.class).updateModificaTipoSP(modificaTipoSPDTO, super.security().getUserName());

        ConsultaPlazaDTO consultaPlazaDTO = new ConsultaPlazaDTO();

        // Seccion
        consultaPlazaDTO.setSeccion(" - Modifica tipo servidor público");
        // Bean Name selectList
        consultaPlazaDTO.setBeanNameSituacion("tcSitModificaTipoSP_PE");
        // Bean Name pagedList
        consultaPlazaDTO.setBeanName("modificaTipoSP_PE");
        
        consultaPlazaDTO.setUrlOrigen("consultaModificaTipoSP");
        consultaPlazaDTO.setUrlDestino("modificaTipoSP");

        consultaPlazaDTO.setUrlOrigen("consultaModificaTipoSP");
        consultaPlazaDTO.setUrlDestino("modificaTipoSP");

        model.addAttribute(consultaPlazaDTO);

        super.saveMessage(model, "plaza.consulta.modificaTipoSP.ok");
        return super.getViewName("consultaPlaza");
    }
    
    /**
     * Metodo encargado de consultar plazas para Asignación de Plaza Soporte.
     * @author Oscar S.
     * @param model Model
     * @param consultaPlazaDTO ConsultaPlazaDTO
     * @return String
     */
    @RequestMapping
    public String consultaAsignaPlazaSoporte(Model model, ConsultaPlazaDTO consultaPlazaDTO) {
        if (consultaPlazaDTO.isCancel()) {
            consultaPlazaDTO = new ConsultaPlazaDTO();
        }
        // Seccion
        consultaPlazaDTO.setSeccion(" - Asigna soporte");
        // Bean Name pagedList
        consultaPlazaDTO.setBeanName("asignaPlazaSoporte");
        // Asigna Plaza Soporte
         consultaPlazaDTO.setAsignaPlazaSoporte(true);

        consultaPlazaDTO.setUrlOrigen("consultaAsignaPlazaSoporte");
        consultaPlazaDTO.setUrlDestino("asignaPlazaSoporte");

        // Obtener Ciclo
        consultaPlazaDTO.setUniCiclo(super.security().getOperationYear());

        model.addAttribute(consultaPlazaDTO);
        return super.getViewName("consultaPlaza");
    }
    
    /**
     * Metodo encargado de obtener el id de la Plaza para su Asignación de Plaza Soporte.
     * @author Oscar S.
     * @param model Model
     * @param idPlaza Integer
     * @return String
     */
    @RequestMapping
    public String asignaPlazaSoporte(Model model, @RequestParam("idPlaza") Integer idPlaza) {
        String viewName;

        // Obtener Plaza
        AsignaPlazaSoporteDTO asignaPlazaSoporteDTO = super.getService(PlazaEstructuraService.class).getAsignaPlazaSoporte(idPlaza);

        // Obtener Ciclo
        asignaPlazaSoporteDTO.setUniCiclo(super.security().getOperationYear());
        asignaPlazaSoporteDTO.setIdCiclo(super.security().getOperationYear());

        // Valida Situacion de la Plaza
        if (asignaPlazaSoporteDTO.getIdSitPlaza().equals("INVALIDA")) {
            super.saveError(model, "operacion.no.permitida");
            ConsultaPlazaDTO consultaPlazaDTO = new ConsultaPlazaDTO();

            viewName = consultaAsignaPlazaSoporte(model, consultaPlazaDTO);
            model.addAttribute(consultaPlazaDTO);
        } else {
            viewName = super.getViewName("asignaPlazaSoporte");
            model.addAttribute(asignaPlazaSoporteDTO);
        }
        return viewName;
    }
    
    /**
     * Metodo encargado de Asignar Plaza Soporte a una Plaza Eventual con base en el objeto asignaPlazaSoporteDTO.
     * @author Oscar S.
     * @param model Model
     * @param asignaPlazaSoporteDTO AsignaPlazaSoporteDTO
     * @return String
     */
    @RequestMapping
    public String updateAsignaPlazaSoporte(Model model, AsignaPlazaSoporteDTO asignaPlazaSoporteDTO) {
        super.getService(PlazaEstructuraService.class).updateAsignaPlazaSoporte(asignaPlazaSoporteDTO, super.security().getUserName());

        ConsultaPlazaDTO consultaPlazaDTO = new ConsultaPlazaDTO();

        // Seccion
        consultaPlazaDTO.setSeccion(" - Asigna soporte");
        // Bean Name selectList
        consultaPlazaDTO.setBeanNameSituacion("tcSitAsignaPlazaSoporte");
        // Bean Name pagedList
        consultaPlazaDTO.setBeanName("asignaPlazaSoporte");

        consultaPlazaDTO.setUrlOrigen("consultaAsignaPlazaSoporte");
        consultaPlazaDTO.setUrlDestino("asignaPlazaSoporte");

        model.addAttribute(consultaPlazaDTO);

        super.saveMessage(model, "plaza.consulta.asignaPlazaSoporte.ok");
        return super.getViewName("consultaPlaza");
    }
    
    /**
     * Metodo encargado de consultar plazas para Eliminación de Plaza Soporte.
     * @author Oscar S.
     * @param model Model
     * @param consultaPlazaDTO ConsultaPlazaDTO
     * @return String
     */
    @RequestMapping
    public String consultaEliminaPlazaSoporte(Model model, ConsultaPlazaDTO consultaPlazaDTO) {
        if (consultaPlazaDTO.isCancel()) {
            consultaPlazaDTO = new ConsultaPlazaDTO();
        }
        // Seccion
        consultaPlazaDTO.setSeccion(" - Eliminación de plaza soporte");
        // Bean Name pagedList
        consultaPlazaDTO.setBeanName("eliminaPlazaSoporte");
        // Elimina Plaza Soporte
        consultaPlazaDTO.setEliminaPlazaSoporte(true);
        consultaPlazaDTO.setUrlOrigenEliminaPlaza("eliminaPlazaSoporte");
        
        consultaPlazaDTO.setUrlOrigen("consultaEliminaPlazaSoporte");
        consultaPlazaDTO.setUrlDestino("eliminaPlazaSoporte");

        // Obtener Ciclo
        consultaPlazaDTO.setUniCiclo(super.security().getOperationYear());

        model.addAttribute(consultaPlazaDTO);
        return super.getViewName("consultaPlaza");
    }
    
    /**
     * Metodo encargado de eliminar Plaza Soporte a Plazas de Tipo Eventual.
     * @author Oscar S.
     * @param model Model
     * @param consultaPlazaDTO ConsultaPlazaDTO
     * @return String
     */
    @RequestMapping
    public String eliminaPlazaSoporte(Model model, ConsultaPlazaDTO consultaPlazaDTO) {
        Integer[] idPlazas = consultaPlazaDTO.getIdPlazasSoporte();

        super.getService(PlazaEstructuraService.class).eliminaPlazaSoporte(idPlazas, super.security().getUserName());

        // Seccion
        consultaPlazaDTO.setSeccion(" - Eliminación de plaza soporte");
        // Bean Name pagedList
        consultaPlazaDTO.setBeanName("eliminaPlazaSoporte");
        // Elimina Plaza Soporte
        consultaPlazaDTO.setEliminaPlazaSoporte(true);
        consultaPlazaDTO.setUrlOrigenEliminaPlaza("eliminaPlazaSoporte");

        consultaPlazaDTO.setUrlOrigen("consultaEliminaPlazaSoporte");
        consultaPlazaDTO.setUrlDestino("eliminaPlazaSoporteDetalle");

        // Obtener Ciclo
        consultaPlazaDTO.setUniCiclo(super.security().getOperationYear());

        model.addAttribute(consultaPlazaDTO);

        super.saveMessage(model, "plaza.consulta.eliminaPlazaSoporte.ok");
        return super.getViewName("consultaPlaza");
    }

    @RequestMapping
    public String etiPlazaArt34(Model model) {
        return super.getViewName("etiPlazaArt34");
    }
    
    /**
     * Metodo encargado de consultar plazas para Prorroga de Art.34.
     * @author Oscar S.
     * @param model Model
     * @param consultaPlazaDTO ConsultaPlazaDTO
     * @return String
     */
    @RequestMapping
    public String consultaProrrogaArt(Model model, ConsultaPlazaDTO consultaPlazaDTO) {
        if (consultaPlazaDTO.isCancel()) {
            consultaPlazaDTO = new ConsultaPlazaDTO();
        }
        // Seccion
        consultaPlazaDTO.setSeccion(" - Prórroga Art.34");
        // Bean Name pagedList
        consultaPlazaDTO.setBeanName("prorrogaArt34_PE");
        // Prorroga Art.34
        consultaPlazaDTO.setProrrogaArt34(true);

        consultaPlazaDTO.setUrlOrigen("consultaProrrogaArt");
        consultaPlazaDTO.setUrlDestino("prorrogaArt34");

        // Obtener Ciclo
        consultaPlazaDTO.setUniCiclo(super.security().getOperationYear());

        model.addAttribute(consultaPlazaDTO);
        return super.getViewName("consultaPlaza");
    }
    
    /**
     * Metodo encargado de obtener el id de la Plaza para Prorroga de Art.34.
     * @author Oscar S.
     * @param model Model
     * @param idPlaza Integer
     * @return String
     */
    @RequestMapping
    public String prorrogaArt34(Model model, @RequestParam("idPlaza") Integer idPlaza) {
        String viewName;

        // Obtener Plaza
        ProrrogaArt34DTO prorrogaArt34DTO = super.getService(PlazaEstructuraService.class).getProrrogaArt34(idPlaza);

        // Obtener Ciclo
        prorrogaArt34DTO.setUniCiclo(super.security().getOperationYear());
        prorrogaArt34DTO.setIdCiclo(super.security().getOperationYear());

        // Valida Situacion de la Plaza
        if (prorrogaArt34DTO.getIdSitPlaza().equals("INVALIDA")) {
            super.saveError(model, "operacion.no.permitida");
            ConsultaPlazaDTO consultaPlazaDTO = new ConsultaPlazaDTO();

            viewName = consultaProrrogaArt(model, consultaPlazaDTO);
            model.addAttribute(consultaPlazaDTO);
        } else {
            viewName = super.getViewName("prorrogaArt34");
            model.addAttribute(prorrogaArt34DTO);
        }
        return viewName;
    }
    
    /**
     * Metodo encargado de modificar Prorroga de Art.34 de la Plaza con base en el objeto prorrogaArt34DTO.
     * @author Oscar S.
     * @param model Model
     * @param prorrogaArt34DTO ProrrogaArt34DTO
     * @return String
     */
    @RequestMapping
    public String updateProrrogaArt34(Model model, ProrrogaArt34DTO prorrogaArt34DTO) {
        super.getService(PlazaEstructuraService.class).updateProrrogaArt34(prorrogaArt34DTO, super.security().getUserName());

        ConsultaPlazaDTO consultaPlazaDTO = new ConsultaPlazaDTO();

        if (consultaPlazaDTO.isCancel()) {
            consultaPlazaDTO = new ConsultaPlazaDTO();
        }
        // Seccion
        consultaPlazaDTO.setSeccion(" - Prórroga Art.34");
        // Bean Name pagedList
        consultaPlazaDTO.setBeanName("prorrogaArt34_PE");
        // Prorroga Art.34
        consultaPlazaDTO.setProrrogaArt34(true);

        consultaPlazaDTO.setUrlOrigen("consultaProrrogaArt");
        consultaPlazaDTO.setUrlDestino("prorrogaArt34");

        model.addAttribute(consultaPlazaDTO);

        super.saveMessage(model, "plaza.consulta.prorrogaArt34.ok");
        return super.getViewName("consultaPlaza");
    }
    
    /**
     * Metodo encargado de consultar plazas para Modificación de Observaciones.
     * @author Oscar S.
     * @param model Model
     * @param consultaPlazaDTO ConsultaPlazaDTO
     * @return String
     */
    @RequestMapping
    public String consultaObservacionesPlaza(Model model, ConsultaPlazaDTO consultaPlazaDTO) {
        if (consultaPlazaDTO.isCancel()) {
            consultaPlazaDTO = new ConsultaPlazaDTO();
        }
        // Seccion
        consultaPlazaDTO.setSeccion(" - Modifica observaciones");
        // Bean Name pagedList
        consultaPlazaDTO.setBeanName("modificaObservaciones_PE");
        // Observaciones Plaza
        consultaPlazaDTO.setObservacionesPlaza(true);

        consultaPlazaDTO.setUrlOrigen("consultaObservacionesPlaza");
        consultaPlazaDTO.setUrlDestino("modificaObservacionesPlaza");

        // Obtener Ciclo
        consultaPlazaDTO.setUniCiclo(super.security().getOperationYear());

        model.addAttribute(consultaPlazaDTO);
        return super.getViewName("consultaPlaza");
    }
    
    /**
     * Metodo encargado de obtener el id de la Plaza para su Modificación de Observaciones.
     * @author Oscar S.
     * @param model Model
     * @param idPlaza Integer
     * @return String
     */
    @RequestMapping
    public String modificaObservacionesPlaza(Model model, @RequestParam("idPlaza") Integer idPlaza) {
        String viewName;

        // Obtener Plaza
        ObservacionesPlazaDTO observacionesPlazaDTO = super.getService(PlazaEstructuraService.class).getModificaObservacionesPlaza(idPlaza);

        // Obtener Ciclo
        observacionesPlazaDTO.setUniCiclo(super.security().getOperationYear());
        observacionesPlazaDTO.setIdCiclo(super.security().getOperationYear());

        // Valida Situacion de la Plaza
        if (observacionesPlazaDTO.getIdSitPlaza().equals("INVALIDA")) {
            super.saveError(model, "operacion.no.permitida");
            ConsultaPlazaDTO consultaPlazaDTO = new ConsultaPlazaDTO();

            viewName = consultaObservacionesPlaza(model, consultaPlazaDTO);
            model.addAttribute(consultaPlazaDTO);
        } else {
            viewName = super.getViewName("modificaObservacionesPlaza");
            model.addAttribute(observacionesPlazaDTO);
        }
        return viewName;
    }
    
    /**
     * Metodo encargado de modificar Observaciones de la Plaza con base en el objeto observacionesPlazaDTO.
     * @author Oscar S.
     * @param model Model
     * @param observacionesPlazaDTO ObservacionesPlazaDTO
     * @return String
     */
    @RequestMapping
    public String updateObservacionesPlaza(Model model, ObservacionesPlazaDTO observacionesPlazaDTO) {
        super.getService(PlazaEstructuraService.class).updateObservacionesPlaza(observacionesPlazaDTO, super.security().getUserName());

        ConsultaPlazaDTO consultaPlazaDTO = new ConsultaPlazaDTO();

        if (consultaPlazaDTO.isCancel()) {
            consultaPlazaDTO = new ConsultaPlazaDTO();
        }
        // Seccion
        consultaPlazaDTO.setSeccion(" - Modifica observaciones");
        // Bean Name pagedList
        consultaPlazaDTO.setBeanName("modificaObservaciones_PE");
        // Observaciones Plaza
        consultaPlazaDTO.setObservacionesPlaza(true);

        consultaPlazaDTO.setUrlOrigen("consultaObservacionesPlaza");
        consultaPlazaDTO.setUrlDestino("modificaObservacionesPlaza");

        model.addAttribute(consultaPlazaDTO);

        super.saveMessage(model, "plaza.consulta.plazaObservaciones.ok");
        return super.getViewName("consultaPlaza");
    }
    
    /**
     * Metodo encargado d de Intercambiar Datos Presupuestales de dos Plazas.
     * @author Oscar S.
     * @param model Model
     * @return String
     */
    @RequestMapping
    public String intercamDatosPresupuestales(Model model) {
        ModificaDatosPresupuestalesDTO modificaDatosPresupuestalesDTO = new ModificaDatosPresupuestalesDTO();
        
        model.addAttribute(modificaDatosPresupuestalesDTO);
        return super.getViewName("intercambioDatosPresupuestales");
    }
    
    /**
     * Metodo encargado de Intercambiar Datos Presupuestales de dos Plazas con base en el objeto modificaDatosPresupuestalesDTO.
     * @author Oscar S.
     * @param model Model
     * @param modificaDatosPresupuestalesDTO ModificaDatosPresupuestalesDTO
     * @return String
     */
    @RequestMapping
    public String updateIntercambioDatosPresupuestales(Model model, ModificaDatosPresupuestalesDTO modificaDatosPresupuestalesDTO) {
        super.getService(PlazaEstructuraService.class).updateIntercambioDatosPresupuestales(modificaDatosPresupuestalesDTO, super.security().getUserName());
        
        modificaDatosPresupuestalesDTO = new ModificaDatosPresupuestalesDTO();
        model.addAttribute(modificaDatosPresupuestalesDTO);

        super.saveMessage(model, "plaza.consulta.intercambioDatosPresupuestales.ok");
        return super.getViewName("intercambioDatosPresupuestales");
    }
    
    /**
     * Metodo encargado de Intercambiar Datos Nomina de dos Plazas.
     * @author Oscar S.
     * @param model Model
     * @return String
     */
    @RequestMapping
    public String promocionPermuta(Model model) {
        PromocionPermutaDTO promocionPermutaDTO = new PromocionPermutaDTO();
        
        model.addAttribute(promocionPermutaDTO);
        return super.getViewName("promocionPermuta");
    }
    
    /**
     * Metodo encargado de Intercambiar Datos Nomina de dos Plazas con base en el objeto modificaDatosPresupuestalesDTO.
     * @author Oscar S.
     * @param model Model
     * @param promocionPermutaDTO PromocionPermutaDTO
     * @return String
     */
    @RequestMapping
    public String updatePromocionPermuta(Model model, PromocionPermutaDTO promocionPermutaDTO) {
        super.getService(PlazaEstructuraService.class).updatePromocionPermuta(promocionPermutaDTO, super.security().getUserName());
        
        promocionPermutaDTO = new PromocionPermutaDTO();
        model.addAttribute(promocionPermutaDTO);

        super.saveMessage(model, "plaza.consulta.promocionPermuta.ok");
        return super.getViewName("promocionPermuta");
    }
    
    @RequestMapping
    public String plazaConcurso(Model model, PlazaEnConcursoDTO plazaEnConcursoDTO) {
    
        if(plazaEnConcursoDTO.isLimpiar() || plazaEnConcursoDTO.isCancelar()){
            plazaEnConcursoDTO = new PlazaEnConcursoDTO();
        }
        
        plazaEnConcursoDTO.setUrlDestino("savePlazaEnConcurso");
        plazaEnConcursoDTO.setUrlOrigen("plazaConcurso");
        
        if(plazaEnConcursoDTO.isBuscar()){
            
            if(plazaEnConcursoDTO.getIdPlazaBusqueda() == null){
                super.saveError(model, "plaza.estructura.plazaEnconcurso.blanco");
            } else{
                if(plazaEnConcursoDTO.isBuscar()){
                    PlazaEnConcursoDTO plazaEnConcursoDTOBase = super.getService(PlazaEstructuraService.class).getPlazaEnConsurso(plazaEnConcursoDTO.getIdPlazaBusqueda());
                    if(plazaEnConcursoDTOBase != null){
                        plazaEnConcursoDTOBase.setUrlOrigen(plazaEnConcursoDTO.getUrlOrigen());
                        plazaEnConcursoDTOBase.setUrlDestino(plazaEnConcursoDTO.getUrlDestino());
                        plazaEnConcursoDTOBase.setIdPlazaBusqueda(plazaEnConcursoDTO.getIdPlazaBusqueda());
                        plazaEnConcursoDTOBase.setMuestraConcurso(true);
                        if(plazaEnConcursoDTOBase != null && plazaEnConcursoDTOBase.getFechaDesierta() != null){
                           if(plazaEnConcursoDTOBase.getIdEstatus() == 3){ plazaEnConcursoDTOBase.setFechaCancelado(plazaEnConcursoDTOBase.getFechaDesierta()); } 
                        }
                        
                        model.addAttribute(plazaEnConcursoDTOBase);
                    } else{
                        super.saveError(model, "plaza.estructura.plazaEnconcurso.no.existe", plazaEnConcursoDTO.getIdPlazaBusqueda());
                        model.addAttribute(plazaEnConcursoDTO);
                    }
                    return super.getViewName("plazaEnConcurso");
                }
            }
        }
        
        model.addAttribute(plazaEnConcursoDTO);
        return super.getViewName("plazaEnConcurso");
    }
    
    @RequestMapping
    public String savePlazaEnConcurso(Model model, PlazaEnConcursoDTO plazaEnConcursoDTO) {
        PlazaEnConcursoDTO plazaEnConcursoDTOBase = super.getService(PlazaEstructuraService.class).findPlazaConcursoById(plazaEnConcursoDTO);
        
        // PLAZA SIN HISTORIA
        if(plazaEnConcursoDTOBase == null){
            if(plazaEnConcursoDTO.getIdEstatus() == 1){ // SIN HISTORIA --> CONCURSO (IC)
                super.getService(PlazaEstructuraService.class).updatePlazaEnConcurso(plazaEnConcursoDTO, "IC");
            }
            else if(plazaEnConcursoDTO.getIdEstatus() == 2){ // SIN HISTORIA --> DESIERTA (ID)
                super.getService(PlazaEstructuraService.class).updatePlazaEnConcurso(plazaEnConcursoDTO, "ID");
            }
            else if(plazaEnConcursoDTO.getIdEstatus() == 3){ // SIN HISTORIA --> CANCELADA (ICA)
                super.saveError(model, "ERROR: La plaza no se puede iniciar con un estatus de cancelada, solo si la plaza ha estado en concurso, puede ponerse en cancelada.");
            }
            
        }
        else { // PLAZA CON HISTORIA
            // CONCURSO --> CONCURSO  (CC)
            if( (plazaEnConcursoDTOBase.getIdEstatus() == 1) & ( plazaEnConcursoDTO.getIdEstatus() == 1) ){
                if(plazaEnConcursoDTOBase.getFechaEtapa().compareTo(plazaEnConcursoDTO.getFechaEtapa()) > 0){
                    super.saveError(model, "La Fecha Etapa de En proceso de Concurso debe ser postrior a la Fecha Etapa actual");
                    return super.getViewName("plazaEnConcurso");
                }
                else if(plazaEnConcursoDTOBase.getFechaEtapa().compareTo(plazaEnConcursoDTO.getFechaEtapa()) <= 0 ){
                    super.getService(PlazaEstructuraService.class).updatePlazaEnConcurso(plazaEnConcursoDTO, "CC");
                }
            }
            // CONCURSO --> DESIERTA  (CD)
            else if((plazaEnConcursoDTOBase.getIdEstatus() == 1) & ( plazaEnConcursoDTO.getIdEstatus() == 2)){
                if(plazaEnConcursoDTOBase.getFechaEtapa().compareTo(plazaEnConcursoDTO.getFechaDesierta()) > 0){
                    super.saveError(model, "La Fecha Desierta de Concurso Desierto debe ser posterior a la Fecha Etapa de En Proceso de Concurso");
                    return super.getViewName("plazaEnConcurso");
                }
                else if(plazaEnConcursoDTOBase.getFechaEtapa().compareTo(plazaEnConcursoDTO.getFechaDesierta()) <= 0 ){
                    super.getService(PlazaEstructuraService.class).updatePlazaEnConcurso(plazaEnConcursoDTO, "CD");
                }
            }
            // CONCURSO --> CANCELADA (CCA) OK
            else if((plazaEnConcursoDTOBase.getIdEstatus() == 1) && (plazaEnConcursoDTO.getIdEstatus() == 3)){
                if(plazaEnConcursoDTOBase.getFechaEtapa().compareTo(plazaEnConcursoDTO.getFechaCancelado()) > 0 ){
                    super.saveError(model, "La Fecha Cancelacion de Concurso cancelado debe ser posterior a la Fecha Etapa de En Proceso de Concurso");
                    return super.getViewName("plazaEnConcurso");
                }
                else if(plazaEnConcursoDTOBase.getFechaEtapa().compareTo(plazaEnConcursoDTO.getFechaCancelado()) <= 0 ){
                    if(plazaEnConcursoDTOBase.getIdEtapa() <=  plazaEnConcursoDTO.getIdEtapa()){
                        super.getService(PlazaEstructuraService.class).updatePlazaEnConcurso(plazaEnConcursoDTO, "CCA");
                    }
                    else {
                        super.saveError(model, "La Etapa que selecciono es antrior a la etapa de En Proceso de Concurso; Seleccione la misma etapa o alguna de las etapas posteriores a la etapa de En proceso de Concurso.");
                        return super.getViewName("plazaEnConcurso");
                    }
                }
            }
            // DESIERTA --> CONCURSO  (DC)
            else if((plazaEnConcursoDTOBase.getIdEstatus() == 2) & ( plazaEnConcursoDTO.getIdEstatus() == 1)){
                if(plazaEnConcursoDTOBase.getFechaDesierta().compareTo(plazaEnConcursoDTO.getFechaEtapa()) >= 0){
                    super.saveError(model, "La fecha de En Proceso de Concurso debe ser mayor a la fecha de Concurso Desierto");
                    return super.getViewName("plazaEnConcurso");
                }
                else if(plazaEnConcursoDTOBase.getFechaDesierta().compareTo(plazaEnConcursoDTO.getFechaEtapa()) < 0 ){
                    super.getService(PlazaEstructuraService.class).updatePlazaEnConcurso(plazaEnConcursoDTO, "DC");
                }
            }
            // DESIERTA --> DESIERTA (DD)
            else if((plazaEnConcursoDTOBase.getIdEstatus() == 2) & ( plazaEnConcursoDTO.getIdEstatus() == 2)){
                if(plazaEnConcursoDTOBase.getFechaDesierta().compareTo(plazaEnConcursoDTO.getFechaDesierta()) >= 0){
                    super.saveError(model, "La Fecha Desierta debe ser posterior a la Fecha Desierta actual");
                    model.addAttribute(plazaEnConcursoDTO);
                    return super.getViewName("plazaEnConcurso");
                }
                else if(plazaEnConcursoDTOBase.getFechaDesierta().compareTo(plazaEnConcursoDTO.getFechaDesierta()) < 0 ){
                    super.getService(PlazaEstructuraService.class).updatePlazaEnConcurso(plazaEnConcursoDTO, "DD");
                }
            }
            // DESIERTA --> CANCELADA (DCA) - ERROR
            else if((plazaEnConcursoDTOBase.getIdEstatus() == 2) && (plazaEnConcursoDTO.getIdEstatus() == 3)){
                super.saveError(model, "La plaza se encuentra en Concurso Desierto y no es posible Cancelar el Concurso.");
                model.addAttribute(plazaEnConcursoDTO);
                return super.getViewName("plazaEnConcurso");
            }
            // CANCELADA --> CONCURSO(CAC) - OK
            else if((plazaEnConcursoDTOBase.getIdEstatus() == 3) && (plazaEnConcursoDTO.getIdEstatus() == 1)){
                if(plazaEnConcursoDTOBase.getFechaDesierta().compareTo(plazaEnConcursoDTO.getFechaEtapa()) > 0 ){
                    super.saveError(model, "La Fecha Etapa de En Proceso de Concurso debe ser posterior a la Fecha Cancelacion de Concurso Cancelado.");
                    model.addAttribute(plazaEnConcursoDTO);
                    return super.getViewName("plazaEnConcurso");
                }
                if(plazaEnConcursoDTOBase.getFechaDesierta().compareTo(plazaEnConcursoDTO.getFechaEtapa()) <= 0 ){
                    super.getService(PlazaEstructuraService.class).updatePlazaEnConcurso(plazaEnConcursoDTO, "CAC");
                }
            }
            // CANCELADA --> DESIERTO(CAC) - ERROR
             else if((plazaEnConcursoDTOBase.getIdEstatus() == 3) && (plazaEnConcursoDTO.getIdEstatus() == 2)){
                 super.saveError(model, "La Plaza se encuentra en Concurso Cancelado, no se puede cambiar la plaza a Concurso Desierto.");
                 model.addAttribute(plazaEnConcursoDTO);
                 return super.getViewName("plazaEnConcurso");
             }
        }
        
        plazaEnConcursoDTO = new PlazaEnConcursoDTO();
        plazaEnConcursoDTO.setUrlDestino("savePlazaEnConcurso");
        plazaEnConcursoDTO.setUrlOrigen("plazaConcurso");
        
        super.saveMessage(model, "plaza.estructura.plazaEnconcurso.ok");
        model.addAttribute(plazaEnConcursoDTO);
        return super.getViewName("plazaEnConcurso");
    }
}
