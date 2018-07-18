package gob.shcp.sireh.control.expediente;

import gob.shcp.fsn.control.AbstractController;
import gob.shcp.fsn.control.support.AnnotatedController;

import gob.shcp.jcr.node.FsnResource;


import gob.shcp.sireh.model.TdExpAntecedentesAcademicoDTO;
import gob.shcp.sireh.model.TdExpAvisoAccidenteDTO;
import gob.shcp.sireh.model.TdExpBeneficiarioDTO;
import gob.shcp.sireh.model.TdExpCapacitacionDTO;
import gob.shcp.sireh.model.TdExpDatosComplementariosDTO;
import gob.shcp.sireh.model.TdExpCurpDTO;
import gob.shcp.sireh.model.TdExpDatosNacimientoDTO;
import gob.shcp.sireh.model.TdExpCartillaMilitarDTO;
import gob.shcp.sireh.model.TdExpDoctosSinDatoDTO;
import gob.shcp.sireh.model.TdExpDomicilioParticularDTO;
import gob.shcp.sireh.model.TdExpExperienciaLaboralDTO;
import gob.shcp.sireh.model.TdExpFamiliarDepsBenefDTO;
import gob.shcp.sireh.model.TdExpFechasLaboralesDTO;
import gob.shcp.sireh.model.TdExpRfcDTO;
import gob.shcp.sireh.model.TdExpCuentasBancariaDTO;

import gob.shcp.sireh.model.expediente.JcrDataGestionDocumentosDTO;
import gob.shcp.sireh.model.expediente.gestion.documentos.ExpedienteAvisoAccidenteDTO;
import gob.shcp.sireh.model.expediente.gestion.documentos.ExpedienteBusquedaModificacionDTO;
import gob.shcp.sireh.model.expediente.gestion.documentos.ExpedienteCapacitacionCursosDTO;
import gob.shcp.sireh.model.expediente.gestion.documentos.ExpedienteCartillaMilitarDTO;
import gob.shcp.sireh.model.expediente.gestion.documentos.ExpedienteCuentasBancariasDTO;
import gob.shcp.sireh.model.expediente.gestion.documentos.ExpedienteCurpDTO;
import gob.shcp.sireh.model.expediente.gestion.documentos.ExpedienteDatosAcademicosDTO;
import gob.shcp.sireh.model.expediente.gestion.documentos.ExpedienteDatosComplementariosDTO;
import gob.shcp.sireh.model.expediente.gestion.documentos.ExpedienteDatosNacimientoDTO;
import gob.shcp.sireh.model.expediente.gestion.documentos.ExpedienteDepBenefDTO;
import gob.shcp.sireh.model.expediente.gestion.documentos.ExpedienteDependientesDTO;
import gob.shcp.sireh.model.expediente.gestion.documentos.ExpedienteDocEmpleadoDTO;
import gob.shcp.sireh.model.expediente.gestion.documentos.ExpedienteDocumentosSinCapturaDTO;
import gob.shcp.sireh.model.expediente.gestion.documentos.ExpedienteDomicilioDTO;
import gob.shcp.sireh.model.expediente.gestion.documentos.ExpedienteExperienciaLaboralDTO;
import gob.shcp.sireh.model.expediente.gestion.documentos.ExpedienteFechasLaboralesDTO;
import gob.shcp.sireh.model.expediente.gestion.documentos.ExpedienteModificacionDescripcionDTO;
import gob.shcp.sireh.model.expediente.gestion.documentos.ExpedienteModificacionEstatusDTO;
import gob.shcp.sireh.model.expediente.gestion.documentos.ExpedienteRfcDTO;
import gob.shcp.sireh.model.expediente.gestion.control.ControlExpedientesDTO;
import gob.shcp.sireh.model.expediente.gestion.documentos.ExpedienteEliminaDocumentosDTO;
import gob.shcp.sireh.model.expediente.gestion.documentos.ExpedienteModDescripcionMasivaDTO;
import gob.shcp.sireh.model.nomina.TdEmpleadoDTO;

import gob.shcp.sireh.service.expediente.GestionDocumentosService;
import gob.shcp.sireh.service.expediente.TestJcrService;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;

import java.math.BigDecimal;

import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Controlador encargado de atender solicitudes de gestion de documentos del expediente de personal 
 */
@Controller
public class GestionDocumentosController extends AbstractController implements AnnotatedController {

    // Alta de registro federal de contribuyentes
    private static final String COD_RFC = "CRRFC";
    // Búsqueda de familiares, dependientes o beneficiarios
    private static final String COD_FAM = "DFDBE";
    // Alta y/o modificación de familiares, dependientes o beneficiarios - BENEFICIARIOS
    private static final String COD_BEN = "DESBE";
    // Alta de clave única de registro de población
    private static final String COD_CURP = "CCURP";
    // Aviso en caso de accidente
    private static final String COD_ACC = "AVIAC";
    // Alta experiencia laboral
    private static final String COD_EXPLA = "EXPLA";
    // Alta de domicilio particular
    private static final String COD_DOM = "CODOM";
    // Alta de Acta de nacimiento
    private static final String COD_ACN = "ACNAC";
    // Alta de antecedentes academicos
    private static final String COD_COEST = "COEST";
    // Alta de capacitacion y cursos
    private static final String COD_CAC = "CCTDE";
    // Alta de cuentas bancarias
    private static final String COD_CTA = "CTABA";
    // Alta de cartilla miltar nacional
    private static final String COD_CARMI = "CARMI";
    // Alta de datos complementarios
    private static final String COD_DATCO = "DATCO";
    // Alta de documentos sin captura de datos
    private List<String> DOCUMENTOS_SIN_CAPTURA = Arrays.asList("SOEMP", "CURRV", "CERME", "IDOFI", "DCLFD", "MBPDV", "CNISF", "CILAB", "SOCEM", "ABMIS", 
                                                                "CIFON", "INSAR", "AHOSO", "CSGMM", "SEGUR", "OFIDO", "CONNO", "ACSPF", "PSPAS", "DOSPF", 
                                                                "COSER", "HUSER", "CONES", "ACTAD", "RNOIC", "AEOIC", "ACTAT", "MEDDI", "CONHE", "CAISS", 
                                                                "DEMAN", "LAUEJ", "BECAS", "ACDEF", "OFIRE", "OFISU", "ACUBA", "DMINC", "DESBE", "LICIS");
    // Fechas laborales
    private static final String COD_FLAB = "FECLA";
    
    // Roles
    private static final String SECURITY_ROL_ADMIN = "AUTH_USERS";
    //private static final String SECURITY_ROL_ADMIN = "SIREH_ADMIN";
    private static final String SECURITY_ROL_REG = "SIREH_EXP_REGISTRAR";
    private static final String SECURITY_ROL_AUT = "SIREH_EXP_AUTORIZAR";
    
    private static final String ID_STATUS_REGISTRADO = "REG";
    private static final Integer STATUS_SIN_RECHAZO = 6;

    @RequestMapping
    public String initSaveFileTest(Model model, JcrDataGestionDocumentosDTO jcrDataGestionDocumentosDTO) {
        return super.getViewName("uploadFileTest");
    }

    @RequestMapping
    public String saveFileTest(Model model, JcrDataGestionDocumentosDTO jcrDataGestionDocumentosDTO) {
        String idFile = null;
        jcrDataGestionDocumentosDTO.setName(jcrDataGestionDocumentosDTO.getFile().getOriginalFilename());
        jcrDataGestionDocumentosDTO.setData(jcrDataGestionDocumentosDTO.getFile().getInputStream());
        idFile = super.getService(GestionDocumentosService.class).saveFileTest(jcrDataGestionDocumentosDTO, jcrDataGestionDocumentosDTO.isRollback());

        super.saveMessage(model, "jcr.file.save.ok", idFile);
        return super.getViewName("uploadFileTest");
    }

    /**
     * Descarga de documentos desde el filesystem del componenete FSN-JCR
     * @author Oscar S.
     * @param uuid String
     * @param response HttpServletResponse
     * @return String
     */
    @RequestMapping
    public String downloadFile(@RequestParam("uuid")
        String uuid, HttpServletResponse response) throws IOException {
        FsnResource fsnResource = super.getService(TestJcrService.class).getFile(uuid);

        String mimetype = fsnResource.getMimeType();
        response.setContentType(mimetype);
        fsnResource.getDataSize();
        FileCopyUtils.copy(fsnResource.getData(), response.getOutputStream());
        return null;
    }
    
    // TODO: Faltantes obligatorios
    /**
     * Búsqueda de empleados con documentos faltantes obligatorios
     * @author Oscar S.
     * @param model Model
     * @param controlExpedientesDTO ControlExpedientesDTO
     * @return String
     */
    @RequestMapping
    public String faltantesObligatorios(Model model, ControlExpedientesDTO controlExpedientesDTO) {
        if (controlExpedientesDTO.isCancel()) {
            controlExpedientesDTO = new ControlExpedientesDTO();
        }
        controlExpedientesDTO.setUrlOrigen("faltantesObligatorios");
        controlExpedientesDTO.setUrlDestino("faltantesObligatorios");
        controlExpedientesDTO.setBeanName("busquedaEmpleado-controlExpedientes");

        model.addAttribute(controlExpedientesDTO);
        return super.getViewName("faltantesObligatorios");
    }

    /**
     * Búsqueda de empleados con documentos faltantes obligatorios - detalle
     * @author Oscar S.
     * @param model Model
     * @param controlExpedientesDTO ControlExpedientesDTO
     * @param rfcEmpleado String
     * @return String
     */
    @RequestMapping
    public String faltantesObligatoriosBusqueda(Model model, ControlExpedientesDTO controlExpedientesDTO, @RequestParam("rfcEmpleado") String rfcEmpleado) {
        if (controlExpedientesDTO.isCancel()) {
            controlExpedientesDTO = new ControlExpedientesDTO();
        }
        controlExpedientesDTO.setUrlOrigen("faltantesObligatorios");
        controlExpedientesDTO.setUrlDestino("faltantesObligatorios");
        controlExpedientesDTO.setBeanName("busquedaEmpleado-controlExpedientes");

        controlExpedientesDTO.setRfcEmpleadoBusqueda(rfcEmpleado);
        controlExpedientesDTO.setMuestraRegistros(true);

        model.addAttribute(controlExpedientesDTO);
        return faltantesObligatorios(model, controlExpedientesDTO);
    }
    
    /**
     * Búsqueda de empleados con documentos faltantes obligatorios - Informe
     * @author Oscar S.
     * @param model Model
     * @param controlExpedientesDTO ControlExpedientesDTO
     * @param response HttpServletResponse
     * @return String
     */
    @RequestMapping
    public String informeFaltantesObligatorios(Model model, ControlExpedientesDTO controlExpedientesDTO, HttpServletResponse response) {
        try {
            String tipoArchivo = "FaltantesObligatorios";
            return createFile(model, controlExpedientesDTO, response, tipoArchivo);
        } catch (Exception e) {
            super.saveWarning(model, "warn.data.list.informeFaltantes");
            model.addAttribute(controlExpedientesDTO);
            return faltantesObligatorios(model, controlExpedientesDTO);
        }
    }
    
    private String createFile(Model model, ControlExpedientesDTO controlExpedientesDTO, HttpServletResponse response, String tipoArchivo) throws IOException {
        StringBuilder strCsv = new StringBuilder();
        Object campo;
        List<Map<Integer, Object>> histRevList = super.getService(GestionDocumentosService.class).getInformeFaltantesObligatorios(controlExpedientesDTO.getRfcEmpleado(), controlExpedientesDTO.getIdUnidadNom());

        if (histRevList.isEmpty()) {
            super.saveWarning(model, "warn.data.list.informeFaltantes");
            model.addAttribute(controlExpedientesDTO);
            return faltantesObligatorios(model, controlExpedientesDTO);
        }

        for (Map row: histRevList) {
            for (int i = 1; i <= row.size(); i++) {
                campo = row.get(i).toString().replace(",","");

                if (campo == null || campo.toString().equals("null") || campo.toString().length() < 1) {
                    campo = " ";
                }
                strCsv.append(campo);
                strCsv.append(",");
            }
            strCsv.replace(strCsv.length() - 1, strCsv.length(), "\n");
        }
        
        byte[] bytes = strCsv.toString().getBytes();
        response.setContentType("text/plain");
        response.setContentLength(bytes.length);
        response.setHeader("Content-Disposition", "attachment; filename=" + tipoArchivo + ".csv");
        OutputStream out = response.getOutputStream();
        out.write(bytes, 0, bytes.length);
        return null;
    }
    
    // TODO: Faltantes laborales
    /**
     * Búsqueda de empleados con documentos faltantes laborales
     * @author Oscar S.
     * @param model Model
     * @param controlExpedientesDTO ControlExpedientesDTO
     * @return String
     */
    @RequestMapping
    public String faltantesLaborales(Model model, ControlExpedientesDTO controlExpedientesDTO) {
        if (controlExpedientesDTO.isCancel()) {
            controlExpedientesDTO = new ControlExpedientesDTO();
        }
        controlExpedientesDTO.setUrlOrigen("faltantesLaborales");
        controlExpedientesDTO.setUrlDestino("faltantesLaborales");
        controlExpedientesDTO.setBeanName("busquedaEmpleado-controlExpedientes");

        model.addAttribute(controlExpedientesDTO);
        return super.getViewName("faltantesLaborales");
    }

    /**
     * Búsqueda de empleados con documentos faltantes laborales - detalle
     * @author Oscar S.
     * @param model Model
     * @param controlExpedientesDTO ControlExpedientesDTO
     * @param rfcEmpleado String
     * @return String
     */
    @RequestMapping
    public String faltantesLaboralesBusqueda(Model model, ControlExpedientesDTO controlExpedientesDTO, @RequestParam("rfcEmpleado") String rfcEmpleado) {
        if (controlExpedientesDTO.isCancel()) {
            controlExpedientesDTO = new ControlExpedientesDTO();
        }
        controlExpedientesDTO.setUrlOrigen("faltantesLaborales");
        controlExpedientesDTO.setUrlDestino("faltantesLaborales");
        controlExpedientesDTO.setBeanName("busquedaEmpleado-controlExpedientes");

        controlExpedientesDTO.setRfcEmpleadoBusqueda(rfcEmpleado);
        controlExpedientesDTO.setMuestraRegistros(true);

        model.addAttribute(controlExpedientesDTO);
        return super.getViewName("faltantesLaborales");
    }

    /**
     * Búsqueda de documentos y/o empleados
     * @author Oscar S.
     * @param model Model
     * @param expedienteDocEmpleadoDTO ExpedienteDocEmpleadoDTO
     * @return String
     */
    @RequestMapping
    public String busquedaDocEmpleado(Model model, ExpedienteDocEmpleadoDTO expedienteDocEmpleadoDTO) {
        if (expedienteDocEmpleadoDTO.isCancel()) {
            expedienteDocEmpleadoDTO = new ExpedienteDocEmpleadoDTO();
        }
        expedienteDocEmpleadoDTO.setUrlOrigen("busquedaDocEmpleado");
        expedienteDocEmpleadoDTO.setUrlDestino("gestorBusquedaDoc");
        
        // Si el estatus es null, se quitan del query DATOS COMPLEMENTARIOS y AVISO EN CASO DE ACCIDENTE los que no contienen documentos
        if(expedienteDocEmpleadoDTO.getStatus() != null && !expedienteDocEmpleadoDTO.getStatus().equals("")){
            expedienteDocEmpleadoDTO.setBeanName("busquedaDocEmpleadoSinEstatus");
        }else{
            expedienteDocEmpleadoDTO.setBeanName("busquedaDocEmpleado2");
        }
        model.addAttribute(expedienteDocEmpleadoDTO);
        return super.getViewName("busquedaDocEmpleado");
    }

    // TODO: Gestor
    /**
     * Gestor de busquedas
     * @author Oscar S.
     * @param model Model
     * @param expedienteDocEmpleadoDTO ExpedienteDocEmpleadoDTO
     * @param idDocto String
     * @param idDoctoFiltro String
     * @param rfcEmpleado String
     * @return String
     */
    @RequestMapping
    public String gestorBusquedaDoc(Model model, 
                                    ExpedienteDocEmpleadoDTO expedienteDocEmpleadoDTO, 
                                    @RequestParam("idDocto") String idDocto, 
                                    @RequestParam("idDoctoFiltro") String idDoctoFiltro, 
                                    @RequestParam("rfcEmpleado") String rfcEmpleado) {
        String viewName = null;

        if (idDocto != null && !idDocto.equals("")) {
            idDoctoFiltro = idDocto;
        }
        if (idDoctoFiltro != null && !idDoctoFiltro.equals("")) {
            idDocto = idDoctoFiltro;
        }

        if (idDocto.equals(COD_RFC) || idDoctoFiltro.equals(COD_RFC)) {
            viewName = altaRfc(model, new ExpedienteRfcDTO(), rfcEmpleado);
            
//        } else if (idDocto.equals(COD_BEN) || idDoctoFiltro.equals(COD_BEN)) {
//            viewName = altaDepBenef(model, new ExpedienteDepBenefDTO(), rfcEmpleado);

        } else if (idDocto.equals(COD_FAM) || idDoctoFiltro.equals(COD_FAM)) {
            viewName = altaDependientes(model, new ExpedienteDependientesDTO(), rfcEmpleado);
            
        } else if (idDocto.equals(COD_CURP) || idDoctoFiltro.equals(COD_CURP)) {
            viewName = altaCurp(model, new ExpedienteCurpDTO(), rfcEmpleado);

        } else if (DOCUMENTOS_SIN_CAPTURA.contains(idDocto) || DOCUMENTOS_SIN_CAPTURA.contains(idDoctoFiltro)) {
            viewName = altaDocumentosSinCaptura(model, new ExpedienteDocumentosSinCapturaDTO(), rfcEmpleado, idDoctoFiltro);

        } else if (idDocto.equals(COD_ACC) || idDoctoFiltro.equals(COD_ACC)) {
            viewName = altaAvisoAccidente(model, new ExpedienteAvisoAccidenteDTO(), rfcEmpleado);

        } else if (idDocto.equals(COD_EXPLA) || idDoctoFiltro.equals(COD_EXPLA)) {
            viewName = altaExperienciaLaboral(model, new ExpedienteExperienciaLaboralDTO(), rfcEmpleado);

        } else if (idDocto.equals(COD_DOM) || idDoctoFiltro.equals(COD_DOM)) {
            viewName = altaDomicilio(model, new ExpedienteDomicilioDTO(), rfcEmpleado);

        } else if (idDocto.equals(COD_ACN) || idDoctoFiltro.equals(COD_ACN)) {
            viewName = altaDatosNacimiento(model, new ExpedienteDatosNacimientoDTO(), rfcEmpleado);

        } else if (idDocto.equals(COD_COEST) || idDoctoFiltro.equals(COD_COEST)) {
            viewName = altaAntecedentesAcademicos(model, new ExpedienteDatosAcademicosDTO(), rfcEmpleado);

        } else if (idDocto.equals(COD_FLAB) || idDoctoFiltro.equals(COD_FLAB)) {
            viewName = altaFechasLaborales(model, new ExpedienteFechasLaboralesDTO(), rfcEmpleado);

        } else if (idDocto.equals(COD_CAC) || idDoctoFiltro.equals(COD_CAC)) {
            viewName = altaCapacitacionCursos(model, new ExpedienteCapacitacionCursosDTO(), rfcEmpleado);

        } else if (idDocto.equals(COD_CTA) || idDoctoFiltro.equals(COD_CTA)) {
            viewName = altaCuentasBancarias(model, new ExpedienteCuentasBancariasDTO(), rfcEmpleado);

        } else if (idDocto.equals(COD_CARMI) || idDoctoFiltro.equals(COD_CARMI)) {
            viewName = altaCartillaMilitar(model, new ExpedienteCartillaMilitarDTO(), rfcEmpleado);

        } else if (idDocto.equals(COD_DATCO) || idDoctoFiltro.equals(COD_DATCO)) {
            viewName = altaDatosComplementarios(model, new ExpedienteDatosComplementariosDTO(), rfcEmpleado);

        } else {
            super.saveError(model, "Selecione el tipo de documento.");
            expedienteDocEmpleadoDTO.setRfcEmpleado("");
            viewName = busquedaDocEmpleado(model, expedienteDocEmpleadoDTO);
        }
        return viewName;
    }

    /******************************************************************************************************************************************************************************/

    // TODO: Documentos sin captura
    /**
     * Alta de documentos sin captura de datos
     * @author Armando Zuñiga|Oscar S.
     * @param model Model
     * @param expedienteDocumentosSinCapturaDTO ExpedienteDocumentosSinCapturaDTO
     * @param idDoctoFiltro String
     * @return String
     */
    @RequestMapping
    public String altaDocumentosSinCaptura(Model model, ExpedienteDocumentosSinCapturaDTO expedienteDocumentosSinCapturaDTO, @RequestParam("rfcEmpleado") String rfcEmpleado, String idDoctoFiltro) {
        if (expedienteDocumentosSinCapturaDTO.isCancel()) {
            expedienteDocumentosSinCapturaDTO = new ExpedienteDocumentosSinCapturaDTO();
        }
        
        if (rfcEmpleado != null && !rfcEmpleado.equals("")) {
            // Datos del empleado
            TdEmpleadoDTO tdEmpleadoDTO = super.getService(GestionDocumentosService.class).getEmpleado(rfcEmpleado);
            expedienteDocumentosSinCapturaDTO.setNombreEmpleadoCompleto(tdEmpleadoDTO.getNombreEmpleado() + " " + 
                                                                       (tdEmpleadoDTO.getPrimerApellido() == null ? "" : tdEmpleadoDTO.getPrimerApellido()) + " " + 
                                                                       (tdEmpleadoDTO.getSegundoApellido() == null ? "" : tdEmpleadoDTO.getSegundoApellido()));

            // Navegacion
            expedienteDocumentosSinCapturaDTO.setUrlOrigen("altaDocumentosSinCaptura");
            expedienteDocumentosSinCapturaDTO.setUrlDestino("saveDocumentosSinCaptura");
            expedienteDocumentosSinCapturaDTO.setBeanName("busqueda-altaDocumentosSinCaptura");
            expedienteDocumentosSinCapturaDTO.setRfcEmpleadoBusqueda(rfcEmpleado);
            expedienteDocumentosSinCapturaDTO.setDocumento(idDoctoFiltro);

            List roles = super.security().getRoles();
            for (Object rol: roles) {
                logger.debug("Roles ---------->" + (String)rol);
            }

            // Verificar si existen previamente documentos registrados
            Integer docRegistrados = super.getService(GestionDocumentosService.class).getTotalExpedienteDocumentosSinCaptura(rfcEmpleado, "REG", expedienteDocumentosSinCapturaDTO.getDocumento());
            logger.debug("Documentos registrados ---------->" + docRegistrados);
            expedienteDocumentosSinCapturaDTO.setTotalRegistrados(docRegistrados);

            Integer docRechazados = super.getService(GestionDocumentosService.class).getTotalExpedienteDocumentosSinCaptura(rfcEmpleado, "REC", expedienteDocumentosSinCapturaDTO.getDocumento());
            logger.debug("Documentos rechazados ---------->" + docRechazados);
            expedienteDocumentosSinCapturaDTO.setTotalRechazados(docRechazados);

            // Dimensiones Registrar
            if (super.security().isUserAuthorized(SECURITY_ROL_REG) ) {
                expedienteDocumentosSinCapturaDTO.setRolRegistrar(true);
            } else {
                expedienteDocumentosSinCapturaDTO.setRolRegistrar(false);
            }

            // Dimensiones Autorizar/Rechazar
            if (super.security().isUserAuthorized(SECURITY_ROL_AUT)) {
                expedienteDocumentosSinCapturaDTO.setRolAutorizar(true);
                expedienteDocumentosSinCapturaDTO.setRolRechazar(true);
            } else {
                expedienteDocumentosSinCapturaDTO.setRolAutorizar(false);
                expedienteDocumentosSinCapturaDTO.setRolRechazar(false);
            }
        } else {
            super.saveError(model, "No se encontró el empleado solicitado. Por favor verifique.");
            ExpedienteDocEmpleadoDTO expedienteDocEmpleadoDTO = new ExpedienteDocEmpleadoDTO();
            expedienteDocEmpleadoDTO.setRfcEmpleado("");
            return busquedaDocEmpleado(model, expedienteDocEmpleadoDTO);
        }
        
        model.addAttribute(expedienteDocumentosSinCapturaDTO);
        return super.getViewName("altaDocumentosSinCaptura");
    }

    /**
     * Registro - Alta de documentos sin captura de datos
     * @author Armando Zuñiga 
     * @param model Model
     * @param expedienteDocumentosSinCapturaDTO ExpedienteDocumentosSinCapturaDTO
     * @return String
     */
    @RequestMapping
    public String saveDocumentosSinCaptura(Model model, ExpedienteDocumentosSinCapturaDTO expedienteDocumentosSinCapturaDTO) {
        String idDoctoRef = expedienteDocumentosSinCapturaDTO.getDocumento();
        // Datos del empleado
        TdEmpleadoDTO tdEmpleadoDTO = super.getService(GestionDocumentosService.class).getEmpleado(expedienteDocumentosSinCapturaDTO.getRfcEmpleadoBusqueda());

        if (expedienteDocumentosSinCapturaDTO.isClean()) {
            expedienteDocumentosSinCapturaDTO = new ExpedienteDocumentosSinCapturaDTO();
        } else {
            try {
                // Inicializa datos del documento
                String idFile = null;
                expedienteDocumentosSinCapturaDTO.setName(expedienteDocumentosSinCapturaDTO.getDocumentoSoporte().getOriginalFilename());
                expedienteDocumentosSinCapturaDTO.setData(expedienteDocumentosSinCapturaDTO.getDocumentoSoporte().getInputStream());
                // META-INDEX
                expedienteDocumentosSinCapturaDTO.setRfcMeta(expedienteDocumentosSinCapturaDTO.getRfcEmpleadoBusqueda());
                expedienteDocumentosSinCapturaDTO.setDocMeta(expedienteDocumentosSinCapturaDTO.getDocumento());
                // Descripcion del archivo
                expedienteDocumentosSinCapturaDTO.setDescripcion(expedienteDocumentosSinCapturaDTO.getRfcEmpleadoBusqueda() + " - Alta de documento sin captura de datos");

                String[] datosExpedienteDocumentosSinCapturaDTO = expedienteDocumentosSinCapturaDTO.getDocGrupo();
                String DocumentosSinCapturaEmpleado = null;
                String idDocto = null;
                Integer documentosSinCapturaSecuencia = 0;

                String leypaso1 = expedienteDocumentosSinCapturaDTO.getDsdDescripDocto();
                String leypaso2 = expedienteDocumentosSinCapturaDTO.getAuxdsdDescripDoctoLista();
                String leypaso3 = expedienteDocumentosSinCapturaDTO.getAuxdsdDescripDoctoTexto();
                
                if(leypaso1.equalsIgnoreCase("ACUSE DE DECLARACION DE SITUACION PATRIMONIAL Y DE INTERESES")){
                    if(leypaso2.equalsIgnoreCase("0")){  expedienteDocumentosSinCapturaDTO.setDsdDescripDocto(leypaso1 + "-" + "");  }
                    else{  expedienteDocumentosSinCapturaDTO.setDsdDescripDocto(leypaso1 + "-" + leypaso2);  }
                } 
                else{
                    if(leypaso3 == null){  expedienteDocumentosSinCapturaDTO.setDsdDescripDocto(leypaso1 + "-" + "");  }
                    else{  expedienteDocumentosSinCapturaDTO.setDsdDescripDocto(leypaso1 + "-" + leypaso3);  }
                }

                // Actualizar el documento
                if (datosExpedienteDocumentosSinCapturaDTO != null && 
                    datosExpedienteDocumentosSinCapturaDTO.length > 0) {
                    String expedienteDocumentosSinCaptura = datosExpedienteDocumentosSinCapturaDTO[0];

                    if (expedienteDocumentosSinCaptura != null && !expedienteDocumentosSinCaptura.equals("")) {
                        String[] result = expedienteDocumentosSinCaptura.split("\\|");
                        DocumentosSinCapturaEmpleado = result[0];
                        idDocto = result[1];
                        documentosSinCapturaSecuencia = new Integer(result[2]);

                        super.getService(GestionDocumentosService.class).deleteFileExpediente(result[3]);

                        TdExpDoctosSinDatoDTO tdExpDoctosSinDatoDTO = new TdExpDoctosSinDatoDTO();
                        tdExpDoctosSinDatoDTO.setRfcEmpleado(DocumentosSinCapturaEmpleado);
                        tdExpDoctosSinDatoDTO.setDsdSecuencia(documentosSinCapturaSecuencia);
                        tdExpDoctosSinDatoDTO.setIdDocto(idDocto);
                        super.getService(GestionDocumentosService.class).deleteExpedienteDocumentosSinCaptura(tdExpDoctosSinDatoDTO);
                    }
                }

                // Guardar documento
                idFile = super.getService(GestionDocumentosService.class).saveFileExpediente(expedienteDocumentosSinCapturaDTO, expedienteDocumentosSinCapturaDTO.isRollback());

                // Guardar registro
                TdExpDoctosSinDatoDTO tdExpDoctosSinDatoDTO = new TdExpDoctosSinDatoDTO();
                tdExpDoctosSinDatoDTO.setRfcEmpleado(expedienteDocumentosSinCapturaDTO.getRfcEmpleadoBusqueda());
                tdExpDoctosSinDatoDTO.setIdDocto(expedienteDocumentosSinCapturaDTO.getDocumento());
                
                tdExpDoctosSinDatoDTO.setDsdDoctoRef(idFile);
                tdExpDoctosSinDatoDTO.setIdStatus("REG");
                tdExpDoctosSinDatoDTO.setIdExpRechazo(STATUS_SIN_RECHAZO);
                tdExpDoctosSinDatoDTO.setUsuario(super.security().getUserName());
                tdExpDoctosSinDatoDTO.setFecModifico(new Date());
                tdExpDoctosSinDatoDTO.setDsdDescripDocto(expedienteDocumentosSinCapturaDTO.getDsdDescripDocto());
                tdExpDoctosSinDatoDTO.setDsdAxoDocto(expedienteDocumentosSinCapturaDTO.getDsdAxoDocto());
                super.getService(GestionDocumentosService.class).saveExpedienteDocumentosSinCaptura(tdExpDoctosSinDatoDTO);

                // Reiniciar expedienteDocumentosSinCapturaDTO
                expedienteDocumentosSinCapturaDTO = new ExpedienteDocumentosSinCapturaDTO();
                expedienteDocumentosSinCapturaDTO.setNombreEmpleadoCompleto(tdEmpleadoDTO.getNombreEmpleado() + " " + tdEmpleadoDTO.getPrimerApellido() + " " + tdEmpleadoDTO.getSegundoApellido());

                // Navegacion
                expedienteDocumentosSinCapturaDTO.setUrlOrigen("altaDocumentosSinCaptura");
                expedienteDocumentosSinCapturaDTO.setUrlDestino("saveDocumentosSinCaptura");
                expedienteDocumentosSinCapturaDTO.setBeanName("busqueda-altaDocumentosSinCaptura");
                expedienteDocumentosSinCapturaDTO.setRfcEmpleadoBusqueda(tdEmpleadoDTO.getRfcEmpleado());
                
                super.saveMessage(model, "sireh.msg.oficinaVirtual.gestionDocumentos.altaDocumentosSinCaptura.ok");
            } catch (Exception e) {
                logger.debug("Exception --------->" + e.toString());
                super.saveError(model, "sireh.msg.oficinaVirtual.gestionDocumentos.altaDocumentosSinCaptura.error");
            }
        }
        model.addAttribute(expedienteDocumentosSinCapturaDTO);
        return altaDocumentosSinCaptura(model, expedienteDocumentosSinCapturaDTO, tdEmpleadoDTO.getRfcEmpleado(), idDoctoRef);
    }

    /**
     * Autorizacion - Alta de documentos sin captura de datos
     * @author Armando Zuñiga
     * @param model Model
     * @param expedienteDocumentosSinCapturaDTO ExpedienteDocumentosSinCapturaDTO
     * @return String
     */
    @RequestMapping
    public String autorizaAltaDocumentosSinCaptura(Model model, ExpedienteDocumentosSinCapturaDTO expedienteDocumentosSinCapturaDTO) {
        String idDocRef = expedienteDocumentosSinCapturaDTO.getDocumento();
        // Datos del empleado
        TdEmpleadoDTO tdEmpleadoDTO = super.getService(GestionDocumentosService.class).getEmpleado(expedienteDocumentosSinCapturaDTO.getRfcEmpleadoBusqueda());

        try {
            // Obtener datos del registro seleccionado
            String[] datosExpedienteDocumentosSinCaptura = expedienteDocumentosSinCapturaDTO.getDocGrupo();
            String rfcEmpleado = null;
            String idDocto = null;
            Integer documentosSinCapturaSecuencia = 0;

            if (datosExpedienteDocumentosSinCaptura.length > 0) {
                for (String expedienteDocumentosSinCaptura: datosExpedienteDocumentosSinCaptura) {
                    if (expedienteDocumentosSinCaptura != null && !expedienteDocumentosSinCaptura.equals("")) {
                        String[] result = expedienteDocumentosSinCaptura.split("\\|");
                        rfcEmpleado = result[0];
                        idDocto = result[1];
                        documentosSinCapturaSecuencia = new Integer(result[2]);
                    }
                }
            }

            // Obtener datos del rfc
            TdExpDoctosSinDatoDTO tdExpDoctosSinDatoDTO = super.getService(GestionDocumentosService.class).getExpedienteDocumentosSinCaptura(rfcEmpleado, documentosSinCapturaSecuencia, idDocto);

            // Documentos activos-historico
            //super.getService(GestionDocumentosService.class).updateActivosToHistoricoExpedienteDocumentosSinCaptura(rfcEmpleado, tdExpDoctosSinDatoDTO.getIdDocto());

            // Actualiza registro
            tdExpDoctosSinDatoDTO.setIdExpRechazo(STATUS_SIN_RECHAZO);
            tdExpDoctosSinDatoDTO.setIdStatus("ACT");
            tdExpDoctosSinDatoDTO.setUsuario(super.security().getUserName());
            tdExpDoctosSinDatoDTO.setFecModifico(new Date());
            super.getService(GestionDocumentosService.class).saveAutorizaRechazaExpedienteDocumentosSinCaptura(tdExpDoctosSinDatoDTO);

            super.saveMessage(model, "sireh.msg.oficinaVirtual.gestionDocumentos.altaDocumentosSinCaptura.autorizacion.ok");
        } catch (Exception e) {
            logger.debug("Exception --------->" + e.toString());
            super.saveError(model, "sireh.msg.oficinaVirtual.gestionDocumentos.altaDocumentosSinCaptura.autorizacion.error");
        }

        model.addAttribute(expedienteDocumentosSinCapturaDTO);
        return altaDocumentosSinCaptura(model, expedienteDocumentosSinCapturaDTO, tdEmpleadoDTO.getRfcEmpleado(), idDocRef);
    }

    /**
     * Rechazo - Alta de documentos sin captura de datos
     * @author Armando Zuñiga
     * @param model Model
     * @param expedienteDocumentosSinCapturaDTO ExpedienteDocumentosSinCapturaDTO
     * @return String
     */
    @RequestMapping
    public String rechazaAltaDocumentosSinCaptura(Model model, ExpedienteDocumentosSinCapturaDTO expedienteDocumentosSinCapturaDTO) {
        String idDocRef = expedienteDocumentosSinCapturaDTO.getDocumento();
        // Datos del empleado
        TdEmpleadoDTO tdEmpleadoDTO = super.getService(GestionDocumentosService.class).getEmpleado(expedienteDocumentosSinCapturaDTO.getRfcEmpleadoBusqueda());

        try {
            // Obtener datos del registro seleccionado
            String[] datosExpedienteDocumentosSinCaptura = expedienteDocumentosSinCapturaDTO.getDocGrupo();
            String rfcEmpleado = null;
            String idDocto = null;
            Integer documentosSinCapturaSecuencia = 0;

            if (datosExpedienteDocumentosSinCaptura.length > 0) {
                for (String expedienteDocumentosSinCaptura: datosExpedienteDocumentosSinCaptura) {
                    if (expedienteDocumentosSinCaptura != null && !expedienteDocumentosSinCaptura.equals("")) {
                        String[] result = expedienteDocumentosSinCaptura.split("\\|");
                        rfcEmpleado = result[0];
                        idDocto = result[1];
                        documentosSinCapturaSecuencia = new Integer(result[2]);
                    }
                }
            }

            // Obtener datos del rfc
            TdExpDoctosSinDatoDTO tdExpDoctosSinDatoDTO = super.getService(GestionDocumentosService.class).getExpedienteDocumentosSinCaptura(rfcEmpleado, documentosSinCapturaSecuencia, idDocto);

            // Actualiza registro
            tdExpDoctosSinDatoDTO.setIdExpRechazo(expedienteDocumentosSinCapturaDTO.getRechazo());
            tdExpDoctosSinDatoDTO.setIdStatus("REC");
            tdExpDoctosSinDatoDTO.setUsuario(super.security().getUserName());
            tdExpDoctosSinDatoDTO.setFecModifico(new Date());
            super.getService(GestionDocumentosService.class).saveAutorizaRechazaExpedienteDocumentosSinCaptura(tdExpDoctosSinDatoDTO);
            
            super.saveMessage(model, "sireh.msg.oficinaVirtual.gestionDocumentos.altaDocumentosSinCaptura.rechazo.ok");
        } catch (Exception e) {
            logger.debug("Exception --------->" + e.toString());
            super.saveError(model, "sireh.msg.oficinaVirtual.gestionDocumentos.altaDomicilio.rechazo.error");
        }

        model.addAttribute(expedienteDocumentosSinCapturaDTO);
        return altaDocumentosSinCaptura(model, expedienteDocumentosSinCapturaDTO, tdEmpleadoDTO.getRfcEmpleado(), idDocRef);
    }

    /**
     * Eliminar - Documentos sin captura
     * @author Gualberto G.
     * @param model Model
     * @param expedienteDocumentosSinCapturaDTO ExpedienteDocumentosSinCapturaDTO
     * @return String
     */
    @RequestMapping
    public String eliminarDocumentosSinCaptura(Model model, ExpedienteDocumentosSinCapturaDTO expedienteDocumentosSinCapturaDTO){
         String[] datosExpedienteSinCaptura = expedienteDocumentosSinCapturaDTO.getDocGrupo();
         String rfcEmpleado = null;
         String idDocto = null;
         Integer rfcSecuencia = 0;

         if (datosExpedienteSinCaptura != null && datosExpedienteSinCaptura.length > 0) {
             String expedienteSinCaptura = datosExpedienteSinCaptura[0];

             if (expedienteSinCaptura != null && !expedienteSinCaptura.equals("")) {
                 String[] result = expedienteSinCaptura.split("\\|");
                 rfcEmpleado = result[0];
                 idDocto = result[1];
                 rfcSecuencia = new Integer(result[2]);

                super.getService(GestionDocumentosService.class).deleteFileExpediente(result[3]);

                TdExpDoctosSinDatoDTO tdExpDoctosSinDatoDTO = new TdExpDoctosSinDatoDTO();
                tdExpDoctosSinDatoDTO.setRfcEmpleado(rfcEmpleado);
                tdExpDoctosSinDatoDTO.setDsdSecuencia(rfcSecuencia);
                tdExpDoctosSinDatoDTO.setIdDocto(idDocto);
                super.getService(GestionDocumentosService.class).deleteExpedienteDocumentosSinCaptura(tdExpDoctosSinDatoDTO);
                super.saveMessage(model, "sireh.msg.oficinaVirtual.gestionDocumentos.altaDocumentosSinCaptura.eliminacion.ok", result[3]);
             }
         }
         
        model.addAttribute(expedienteDocumentosSinCapturaDTO);
        return altaDocumentosSinCaptura(model, expedienteDocumentosSinCapturaDTO, rfcEmpleado, expedienteDocumentosSinCapturaDTO.getDocumento());

    }

    /**
     * Obtiene la lista de descripciones auxiliares de documentos
     * @author Roberto Muñoz
     * @param idDocto String
     * @param response HttpServletResponse
     */
    @RequestMapping
    public void getDescripAuxDocto(@RequestParam("idDocto") String idDocto, HttpServletResponse response) throws IOException {
        StringBuffer daux = new StringBuffer();

        List<String> lDescripAux = super.getService(GestionDocumentosService.class).getTcDescripcionAux(idDocto);
        logger.debug("getDescripAuxDocto -> " + lDescripAux);
        daux.append("<option value=''>SELECCIONE...</option>");
        
        if (lDescripAux.size() > 0) {
            for (String descDocto: lDescripAux) {
                daux.append("<option value='" + descDocto + "'>" + descDocto + "</option>");
                logger.debug("getDescripAuxDocto -> " +  "*" + descDocto + "*" + daux);
            }
        }
        response.setHeader("Cache-Control", "no-cache");
        response.setDateHeader("Expires", 0);
        response.setHeader("Pragma", "no-cache");
        response.setContentType("text/plain");
        PrintWriter out = response.getWriter();
        out.print(daux.toString());
    }
    
    /******************************************************************************************************************************************************************************/

    // TODO: Datos de nacimiento
    /**
     * Alta de datos de nacimiento
     * @author Armando Zuñiga
     * @param model Model
     * @param expedienteDatosNacimientoDTO ExpedienteDatosNacimientoDTO
     * @return String
     */
    @RequestMapping
    public String altaDatosNacimiento(Model model, ExpedienteDatosNacimientoDTO expedienteDatosNacimientoDTO, @RequestParam("rfcEmpleado") String rfcEmpleado) {
        if (expedienteDatosNacimientoDTO.isCancel()) {
            expedienteDatosNacimientoDTO = new ExpedienteDatosNacimientoDTO();
        }
        
        if (rfcEmpleado != null && !rfcEmpleado.equals("")) {
            // Datos del empleado
            TdEmpleadoDTO tdEmpleadoDTO = super.getService(GestionDocumentosService.class).getEmpleado(rfcEmpleado);
            expedienteDatosNacimientoDTO.setNombreEmpleadoCompleto(tdEmpleadoDTO.getNombreEmpleado() + " " + 
                                                                  (tdEmpleadoDTO.getPrimerApellido() == null ? "" : tdEmpleadoDTO.getPrimerApellido()) + " " + 
                                                                  (tdEmpleadoDTO.getSegundoApellido() == null ? "" : tdEmpleadoDTO.getSegundoApellido()));

            // Navehacion
            expedienteDatosNacimientoDTO.setUrlOrigen("altaDatosNacimiento");
            expedienteDatosNacimientoDTO.setUrlDestino("saveDatosNacimiento");
            expedienteDatosNacimientoDTO.setBeanName("busqueda-altaDatosNacimiento");
            expedienteDatosNacimientoDTO.setRfcEmpleadoBusqueda(rfcEmpleado);

            List roles = super.security().getRoles();
            for (Object rol: roles) {
                logger.debug("Roles ---------->" + (String)rol);
            }

            // Verificar si existen previamente documentos registrados
            Integer docRegistrados = super.getService(GestionDocumentosService.class).getTotalExpedienteDatosNacimiento(rfcEmpleado, "REG");
            logger.debug("Documentos registrados ---------->" + docRegistrados);
            expedienteDatosNacimientoDTO.setTotalRegistrados(docRegistrados);

            Integer docRechazados = super.getService(GestionDocumentosService.class).getTotalExpedienteDatosNacimiento(rfcEmpleado, "REC");
            logger.debug("Documentos rechazados ---------->" + docRechazados);
            expedienteDatosNacimientoDTO.setTotalRechazados(docRechazados);

            // Dimensiones Registrar
            if (super.security().isUserAuthorized(SECURITY_ROL_REG)) {
                expedienteDatosNacimientoDTO.setRolRegistrar(true);
            } else {
                expedienteDatosNacimientoDTO.setRolRegistrar(false);
            }

            // Dimensiones Autorizar/Rechazar
            if (super.security().isUserAuthorized(SECURITY_ROL_AUT)) {
                expedienteDatosNacimientoDTO.setRolAutorizar(true);
                expedienteDatosNacimientoDTO.setRolRechazar(true);
            } else {
                expedienteDatosNacimientoDTO.setRolAutorizar(false);
                expedienteDatosNacimientoDTO.setRolRechazar(false);
            }
        } else {
            super.saveError(model, "No se encontró el empleado solicitado. Por favor verifique.");
            ExpedienteDocEmpleadoDTO expedienteDocEmpleadoDTO = new ExpedienteDocEmpleadoDTO();
            expedienteDocEmpleadoDTO.setRfcEmpleado("");
            return busquedaDocEmpleado(model, expedienteDocEmpleadoDTO);
        }
        model.addAttribute(expedienteDatosNacimientoDTO);
        return super.getViewName("altaDatosNacimiento");
    }

    /**
     * Registro - Alta de datos de nacimiento
     * @author Armando Zuñiga
     * @param model Model
     * @param expedienteDatosNacimientoDTO ExpedienteDatosNacimientoDTO
     * @return String
     */
    @RequestMapping
    public String saveDatosNacimiento(Model model, ExpedienteDatosNacimientoDTO expedienteDatosNacimientoDTO) {
        // Datos del empleado
        TdEmpleadoDTO tdEmpleadoDTO = super.getService(GestionDocumentosService.class).getEmpleado(expedienteDatosNacimientoDTO.getRfcEmpleadoBusqueda());

        if (expedienteDatosNacimientoDTO.isClean()) {
            expedienteDatosNacimientoDTO = new ExpedienteDatosNacimientoDTO();
        } else {
            try {
                // Inicializa datos del documento
                String idFile = null;
                expedienteDatosNacimientoDTO.setName(expedienteDatosNacimientoDTO.getDocumentoSoporte().getOriginalFilename());
                expedienteDatosNacimientoDTO.setData(expedienteDatosNacimientoDTO.getDocumentoSoporte().getInputStream());
                // META-INDEX
                expedienteDatosNacimientoDTO.setRfcMeta(expedienteDatosNacimientoDTO.getRfcEmpleadoBusqueda());
                expedienteDatosNacimientoDTO.setDocMeta(COD_ACN);
                // Descripcion del archivo
                expedienteDatosNacimientoDTO.setDescripcion(expedienteDatosNacimientoDTO.getRfcEmpleadoBusqueda() + " - Alta de datos de nacimiento");

                String[] datosExpedienteNacimiento = expedienteDatosNacimientoDTO.getDocGrupo();
                String rfcEmpleado = null;
                String idDocto = null;
                Integer rfcSecuencia = 0;

                // Actualizar el documento
                if (datosExpedienteNacimiento != null && datosExpedienteNacimiento.length > 0) {
                    String expedienteNacimiento = datosExpedienteNacimiento[0];

                    if (expedienteNacimiento != null && !expedienteNacimiento.equals("")) {
                        String[] result = expedienteNacimiento.split("\\|");
                        rfcEmpleado = result[0];
                        idDocto = result[1];
                        rfcSecuencia = new Integer(result[2]);

                        super.getService(GestionDocumentosService.class).deleteFileExpediente(result[3]);

                        TdExpDatosNacimientoDTO tdExpDatosNacimientoDTO = new TdExpDatosNacimientoDTO();
                        tdExpDatosNacimientoDTO.setRfcEmpleado(rfcEmpleado);
                        tdExpDatosNacimientoDTO.setDnaSecuencia(rfcSecuencia);
                        tdExpDatosNacimientoDTO.setIdDocto(idDocto);
                        super.getService(GestionDocumentosService.class).deleteExpedienteDatosNacimiento(tdExpDatosNacimientoDTO);
                    }
                }

                // Guardar documento
                idFile = super.getService(GestionDocumentosService.class).saveFileExpediente(expedienteDatosNacimientoDTO, expedienteDatosNacimientoDTO.isRollback());

                // Guardar registro
                TdExpDatosNacimientoDTO tdExpDatosNacimientoDTO = new TdExpDatosNacimientoDTO();
                tdExpDatosNacimientoDTO.setRfcEmpleado(expedienteDatosNacimientoDTO.getRfcEmpleadoBusqueda());
                tdExpDatosNacimientoDTO.setIdDocto(COD_ACN);

                tdExpDatosNacimientoDTO.setDnaNombreEmpleado(expedienteDatosNacimientoDTO.getNombreEmpleado());
                tdExpDatosNacimientoDTO.setDnaPrimerApellido(expedienteDatosNacimientoDTO.getPrimerApellido());
                tdExpDatosNacimientoDTO.setDnaSegundoApellido(expedienteDatosNacimientoDTO.getSegundoApellido());
                tdExpDatosNacimientoDTO.setIdNacionalidad(expedienteDatosNacimientoDTO.getNacionalidad());
                tdExpDatosNacimientoDTO.setDnaFecNacimiento(expedienteDatosNacimientoDTO.getFecNacimiento());
                tdExpDatosNacimientoDTO.setIdEdo(expedienteDatosNacimientoDTO.getEntidadFederativa());
                tdExpDatosNacimientoDTO.setIdPais(expedienteDatosNacimientoDTO.getPais());
                tdExpDatosNacimientoDTO.setDnaExtranjerosFm3(expedienteDatosNacimientoDTO.getFormaFM3() == null ? "" : expedienteDatosNacimientoDTO.getFormaFM3());

                tdExpDatosNacimientoDTO.setDnaDoctoRef(idFile);
                tdExpDatosNacimientoDTO.setIdStatus("REG");
                tdExpDatosNacimientoDTO.setIdExpRechazo(STATUS_SIN_RECHAZO);
                tdExpDatosNacimientoDTO.setUsuario(super.security().getUserName());
                tdExpDatosNacimientoDTO.setFecModifico(new Date());
                super.getService(GestionDocumentosService.class).saveExpedienteDatosNacimiento(tdExpDatosNacimientoDTO);

                // Reiniciar expedienteDatosNacimientoDTO
                expedienteDatosNacimientoDTO = new ExpedienteDatosNacimientoDTO();
                expedienteDatosNacimientoDTO.setNombreEmpleadoCompleto(tdEmpleadoDTO.getNombreEmpleado() + " " + tdEmpleadoDTO.getPrimerApellido() + " " + tdEmpleadoDTO.getSegundoApellido());

                // Navegacion
                expedienteDatosNacimientoDTO.setUrlOrigen("altaDatosNacimiento");
                expedienteDatosNacimientoDTO.setUrlDestino("saveDatosNacimiento");
                expedienteDatosNacimientoDTO.setBeanName("busqueda-altaDatosNacimiento");
                expedienteDatosNacimientoDTO.setRfcEmpleadoBusqueda(tdEmpleadoDTO.getRfcEmpleado());

                super.saveMessage(model, "sireh.msg.oficinaVirtual.gestionDocumentos.DatosNacimiento.ok", idFile);
            } catch (Exception e) {
                logger.debug("Exception --------->" + e.toString());
                super.saveError(model, "sireh.msg.oficinaVirtual.gestionDocumentos.DatosNacimiento.error");
            }
        }
        model.addAttribute(expedienteDatosNacimientoDTO);
        return altaDatosNacimiento(model, expedienteDatosNacimientoDTO, tdEmpleadoDTO.getRfcEmpleado());
    }

    /**
     * Autorizacion - Alta de datos de nacimiento
     * @author Armando Zuñiga
     * @param model Model
     * @param expedienteDatosNacimientoDTO ExpedienteDatosNacimientoDTO
     * @return String
     */
    @RequestMapping
    public String autorizaAltaDatosNacimiento(Model model, ExpedienteDatosNacimientoDTO expedienteDatosNacimientoDTO) {
        // Datos del empleado
        TdEmpleadoDTO tdEmpleadoDTO = super.getService(GestionDocumentosService.class).getEmpleado(expedienteDatosNacimientoDTO.getRfcEmpleadoBusqueda());

        try {
            // Obtener datos del registro seleccionado
            String[] datosExpedienteRfc = expedienteDatosNacimientoDTO.getDocGrupo();
            String rfcEmpleado = null;
            String idDocto = null;
            Integer domSecuencia = 0;

            if (datosExpedienteRfc.length > 0) {
                for (String expedienteRfc: datosExpedienteRfc) {
                    if (expedienteRfc != null && !expedienteRfc.equals("")) {
                        String[] result = expedienteRfc.split("\\|");
                        rfcEmpleado = result[0];
                        idDocto = result[1];
                        domSecuencia = new Integer(result[2]);
                    }
                }
            }

            // Documentos activos-historico
            super.getService(GestionDocumentosService.class).updateActivosToHistoricoExpedienteDatosNacimiento(rfcEmpleado);

            // Obtener datos del acta de nac
            TdExpDatosNacimientoDTO tdExpDatosNacimientoDTO = super.getService(GestionDocumentosService.class).getExpedienteDatosNacimiento(rfcEmpleado, domSecuencia, idDocto);

            // Actualiza registro
            tdExpDatosNacimientoDTO.setIdExpRechazo(STATUS_SIN_RECHAZO);
            tdExpDatosNacimientoDTO.setIdStatus("ACT");
            tdExpDatosNacimientoDTO.setUsuario(super.security().getUserName());
            tdExpDatosNacimientoDTO.setFecModifico(new Date());
            super.getService(GestionDocumentosService.class).saveAutorizaRechazaExpedienteDatosNacimiento(tdExpDatosNacimientoDTO);
            expedienteDatosNacimientoDTO.setFecNacimiento(null);
            super.saveMessage(model, "sireh.msg.oficinaVirtual.gestionDocumentos.DatosNacimiento.autorizacion.ok");
        } catch (Exception e) {
            logger.debug("Exception --------->" + e.toString());
            super.saveError(model, "sireh.msg.oficinaVirtual.gestionDocumentos.DatosNacimiento.autorizacion.error");
        }

        model.addAttribute(expedienteDatosNacimientoDTO);
        return altaDatosNacimiento(model, expedienteDatosNacimientoDTO, tdEmpleadoDTO.getRfcEmpleado());
    }

    /**
     * Rechazo - Alta de datos de nacimiento
     * @author Armando Zuñiga
     * @param model Model
     * @param expedienteDatosNacimientoDTO ExpedienteDatosNacimientoDTO
     * @return String
     */
    @RequestMapping
    public String rechazaAltaDatosNacimiento(Model model, ExpedienteDatosNacimientoDTO expedienteDatosNacimientoDTO) {
        // Datos del empleado
        TdEmpleadoDTO tdEmpleadoDTO = super.getService(GestionDocumentosService.class).getEmpleado(expedienteDatosNacimientoDTO.getRfcEmpleadoBusqueda());

        try {
            // Obtener datos del registro seleccionado
            String[] datosExpedienteDatosNacimiento = expedienteDatosNacimientoDTO.getDocGrupo();
            String rfcEmpleado = null;
            String idDocto = null;
            Integer domSecuencia = 0;

            if (datosExpedienteDatosNacimiento.length > 0) {
                for (String expedienteDatosNacimiento: datosExpedienteDatosNacimiento) {
                    if (expedienteDatosNacimiento != null && !expedienteDatosNacimiento.equals("")) {
                        String[] result = expedienteDatosNacimiento.split("\\|");
                        rfcEmpleado = result[0];
                        idDocto = result[1];
                        domSecuencia = new Integer(result[2]);
                    }
                }
            }

            // Obtener datos del rfc
            TdExpDatosNacimientoDTO tdExpDatosNacimientoDTO = super.getService(GestionDocumentosService.class).getExpedienteDatosNacimiento(rfcEmpleado, domSecuencia, idDocto);

            // Actualiza registro
            tdExpDatosNacimientoDTO.setIdExpRechazo(expedienteDatosNacimientoDTO.getRechazo());
            tdExpDatosNacimientoDTO.setIdStatus("REC");
            tdExpDatosNacimientoDTO.setUsuario(super.security().getUserName());
            tdExpDatosNacimientoDTO.setFecModifico(new Date());
            super.getService(GestionDocumentosService.class).saveAutorizaRechazaExpedienteDatosNacimiento(tdExpDatosNacimientoDTO);

            super.saveMessage(model, "sireh.msg.oficinaVirtual.gestionDocumentos.DatosNacimiento.rechazo.ok");
        } catch (Exception e) {
            logger.debug("Exception --------->" + e.toString());
            super.saveError(model, "sireh.msg.oficinaVirtual.gestionDocumentos.DatosNacimiento.rechazo.error");
        }

        model.addAttribute(expedienteDatosNacimientoDTO);
        return altaDatosNacimiento(model, expedienteDatosNacimientoDTO, tdEmpleadoDTO.getRfcEmpleado());
    }

    /**
     * Eliminar - Alta de datos de nacimiento
     * @author Gualberto G.
     * @param model Model
     * @param expedienteDatosNacimientoDTO ExpedienteDatosNacimientoDTO
     * @return String
     */
    @RequestMapping
    public String eliminarDatosNacimiento(Model model, ExpedienteDatosNacimientoDTO expedienteDatosNacimientoDTO){
         String[] datosExpedienteNacimiento = expedienteDatosNacimientoDTO.getDocGrupo();
         String rfcEmpleado = null;
         String idDocto = null;
         Integer rfcSecuencia = 0;


         if (datosExpedienteNacimiento != null && datosExpedienteNacimiento.length > 0) {
             String expedienteNacimiento = datosExpedienteNacimiento[0];

             if (expedienteNacimiento != null && !expedienteNacimiento.equals("")) {
                 String[] result = expedienteNacimiento.split("\\|");
                 rfcEmpleado = result[0];
                 idDocto = result[1];
                 rfcSecuencia = new Integer(result[2]);



                super.getService(GestionDocumentosService.class).deleteFileExpediente(result[3]);

                TdExpDatosNacimientoDTO tdExpDatosNacimientoDTO = new TdExpDatosNacimientoDTO();
                tdExpDatosNacimientoDTO.setRfcEmpleado(rfcEmpleado);
                tdExpDatosNacimientoDTO.setDnaSecuencia(rfcSecuencia);
                tdExpDatosNacimientoDTO.setIdDocto(idDocto);
                super.getService(GestionDocumentosService.class).deleteExpedienteDatosNacimiento(tdExpDatosNacimientoDTO);
                super.saveMessage(model, "sireh.msg.oficinaVirtual.gestionDocumentos.DatosNacimiento.eliminacion.ok", result[3]);
             }
         }
         
        model.addAttribute(expedienteDatosNacimientoDTO);
        return altaDatosNacimiento(model, expedienteDatosNacimientoDTO, rfcEmpleado);

    }

    /******************************************************************************************************************************************************************************/

    // TODO: Datos academicos
    /**
     * Alta y/o modificación de datos académicos
     * @author Gualberto G.
     * @param model Model
     * @param expedienteDatosAcademicosDTO ExpedienteDatosAcademicosDTO
     * @return String
     */
    @RequestMapping
    public String altaAntecedentesAcademicos(Model model, ExpedienteDatosAcademicosDTO expedienteDatosAcademicosDTO, @RequestParam("rfcEmpleado") String rfcEmpleado) {
        if (expedienteDatosAcademicosDTO.isCancel()) {
            expedienteDatosAcademicosDTO = new ExpedienteDatosAcademicosDTO();
        }
        
        if (rfcEmpleado != null && !rfcEmpleado.equals("")) {
            // Datos del empleado
            TdEmpleadoDTO tdEmpleadoDTO = super.getService(GestionDocumentosService.class).getEmpleado(rfcEmpleado);
            expedienteDatosAcademicosDTO.setNombreEmpleadoCompleto(tdEmpleadoDTO.getNombreEmpleado() + " " + 
                                                                  (tdEmpleadoDTO.getPrimerApellido() == null ? "" : tdEmpleadoDTO.getPrimerApellido()) + " " + 
                                                                  (tdEmpleadoDTO.getSegundoApellido() == null ? "" : tdEmpleadoDTO.getSegundoApellido()));

            expedienteDatosAcademicosDTO.setUrlOrigen("altaAntecedentesAcademicos");
            expedienteDatosAcademicosDTO.setUrlDestino("saveAntecedentesAcademicos");
            expedienteDatosAcademicosDTO.setBeanName("busqueda-altaAntecedentesAcademicos");
            expedienteDatosAcademicosDTO.setRfcEmpleadoBusqueda(rfcEmpleado);

            List roles = super.security().getRoles();
            for (Object rol: roles) {
                logger.debug("Roles ---------->" + (String)rol);
            }

            // Verificar si existen previamente documentos registrados
            Integer docRegistrados = super.getService(GestionDocumentosService.class).getTotalExpedienteAntecedentesAcademicos(rfcEmpleado, "REG");
            expedienteDatosAcademicosDTO.setTotalRegistrados(docRegistrados);
            logger.debug("Documentos registrados ---------->" + docRegistrados);

            Integer docRechazados = super.getService(GestionDocumentosService.class).getTotalExpedienteAntecedentesAcademicos(rfcEmpleado, "REC");
            expedienteDatosAcademicosDTO.setTotalRechazados(docRechazados);
            logger.debug("Documentos rechazados ---------->" + docRechazados);

            // Dimensiones Registrar
            if (super.security().isUserAuthorized(SECURITY_ROL_REG)) {
                expedienteDatosAcademicosDTO.setRolRegistrar(true);
            } else {
                expedienteDatosAcademicosDTO.setRolRegistrar(false);
            }

            // Dimensiones Autorizar/Rechazar
            if (super.security().isUserAuthorized(SECURITY_ROL_AUT)) {
                expedienteDatosAcademicosDTO.setRolAutorizar(true);
                expedienteDatosAcademicosDTO.setRolRechazar(true);
            } else {
                expedienteDatosAcademicosDTO.setRolAutorizar(false);
                expedienteDatosAcademicosDTO.setRolRechazar(false);
            }
        } else {
            super.saveError(model, "No se encontró el empleado solicitado. Por favor verifique.");
            ExpedienteDocEmpleadoDTO expedienteDocEmpleadoDTO = new ExpedienteDocEmpleadoDTO();
            expedienteDocEmpleadoDTO.setRfcEmpleado("");
            return busquedaDocEmpleado(model, expedienteDocEmpleadoDTO);
        }
        model.addAttribute(expedienteDatosAcademicosDTO);
        return super.getViewName("altaAntecedentesAcademicos");
    }

    /**
     * Registro - Alta de antecedentes academicas
     * @author Gualberto G.
     * @param model Model
     * @param expedienteDatosAcademicosDTO ExpedienteDatosAcademicosDTO
     * @return String
     */
    @RequestMapping
    public String saveAntecedentesAcademicos(Model model, ExpedienteDatosAcademicosDTO expedienteDatosAcademicosDTO) {
        // Datos del empleado
        TdEmpleadoDTO tdEmpleadoDTO = super.getService(GestionDocumentosService.class).getEmpleado(expedienteDatosAcademicosDTO.getRfcEmpleadoBusqueda());

        if (expedienteDatosAcademicosDTO.isClean()) {
            expedienteDatosAcademicosDTO = new ExpedienteDatosAcademicosDTO();
        } else {
            try {
                // Inicializa datos del documento
                String idFile = null;
                expedienteDatosAcademicosDTO.setName(expedienteDatosAcademicosDTO.getDocumentoSoporte().getOriginalFilename());
                expedienteDatosAcademicosDTO.setData(expedienteDatosAcademicosDTO.getDocumentoSoporte().getInputStream());
                // META-INDEX
                expedienteDatosAcademicosDTO.setRfcMeta(expedienteDatosAcademicosDTO.getRfcEmpleadoBusqueda());
                expedienteDatosAcademicosDTO.setDocMeta(COD_COEST);
                // Descripcion del archivo
                expedienteDatosAcademicosDTO.setDescripcion(expedienteDatosAcademicosDTO.getRfcEmpleadoBusqueda() + " - Alta de antecedentes académicos");

                String[] datosExpedienteAntecedentesAcademicos = expedienteDatosAcademicosDTO.getDocGrupo();
                String rfcEmpleado = null;
                String idDocto = null;
                Integer rfcSecuencia = 0;

                // Actualizar el documento
                if (datosExpedienteAntecedentesAcademicos != null && 
                    datosExpedienteAntecedentesAcademicos.length > 0) {
                    String expedienteAntecedentesAcademicos = datosExpedienteAntecedentesAcademicos[0];

                    if (expedienteAntecedentesAcademicos != null && !expedienteAntecedentesAcademicos.equals("")) {
                        String[] result = expedienteAntecedentesAcademicos.split("\\|");
                        rfcEmpleado = result[0];
                        idDocto = result[1];
                        rfcSecuencia = new Integer(result[2]);

                        super.getService(GestionDocumentosService.class).deleteFileExpediente(result[3]);

                        TdExpAntecedentesAcademicoDTO tdExpAntecedentesAcademicoDTO = new TdExpAntecedentesAcademicoDTO();
                        tdExpAntecedentesAcademicoDTO.setRfcEmpleado(rfcEmpleado);
                        tdExpAntecedentesAcademicoDTO.setAacSecuencia(rfcSecuencia);
                        tdExpAntecedentesAcademicoDTO.setIdDocto(idDocto);
                        super.getService(GestionDocumentosService.class).deleteExpedienteAntecedentesAcademicos(tdExpAntecedentesAcademicoDTO);
                    }
                }

                // Guardar documento
                idFile = super.getService(GestionDocumentosService.class).saveFileExpediente(expedienteDatosAcademicosDTO, expedienteDatosAcademicosDTO.isRollback());

                // Guardar registro
                TdExpAntecedentesAcademicoDTO tdExpAntecedentesAcademicoDTO = new TdExpAntecedentesAcademicoDTO();
                tdExpAntecedentesAcademicoDTO.setRfcEmpleado(expedienteDatosAcademicosDTO.getRfcEmpleadoBusqueda());
                tdExpAntecedentesAcademicoDTO.setAacCedProfesional(expedienteDatosAcademicosDTO.getCedulaProfesional() !=  null ? Integer.parseInt(expedienteDatosAcademicosDTO.getCedulaProfesional()) : 0);
                tdExpAntecedentesAcademicoDTO.setAacEstConcluidos(expedienteDatosAcademicosDTO.getEstudiosConcluidos());
                tdExpAntecedentesAcademicoDTO.setAacPromedio(expedienteDatosAcademicosDTO.getPromedioEscolar() != null ? expedienteDatosAcademicosDTO.getPromedioEscolar().floatValue() : 0);
                tdExpAntecedentesAcademicoDTO.setIdInstEducat(expedienteDatosAcademicosDTO.getInstEducat());
                tdExpAntecedentesAcademicoDTO.setIdNivelEscolar(expedienteDatosAcademicosDTO.getNivelEscolar());
                tdExpAntecedentesAcademicoDTO.setIdProfCarrera(expedienteDatosAcademicosDTO.getCarrera().floatValue());
                tdExpAntecedentesAcademicoDTO.setIdDocto(COD_COEST);

                tdExpAntecedentesAcademicoDTO.setAacDoctoRef(idFile);
                tdExpAntecedentesAcademicoDTO.setIdStatus("REG");
                tdExpAntecedentesAcademicoDTO.setIdExpRechazo(STATUS_SIN_RECHAZO);
                tdExpAntecedentesAcademicoDTO.setUsuario(super.security().getUserName());
                tdExpAntecedentesAcademicoDTO.setFecModifico(new Date());
                super.getService(GestionDocumentosService.class).saveExpedienteAntecedentesAcademicos(tdExpAntecedentesAcademicoDTO);

                // Reiniciar expedienteRfcDTO
                expedienteDatosAcademicosDTO = new ExpedienteDatosAcademicosDTO();
                expedienteDatosAcademicosDTO.setNombreEmpleadoCompleto(tdEmpleadoDTO.getNombreEmpleado() + " " + tdEmpleadoDTO.getPrimerApellido() + " " + tdEmpleadoDTO.getSegundoApellido());
                expedienteDatosAcademicosDTO.setRfcMeta(tdEmpleadoDTO.getRfcEmpleado());

                // Navegacion
                expedienteDatosAcademicosDTO.setUrlOrigen("altaAntecedentesAcademicos");
                expedienteDatosAcademicosDTO.setUrlDestino("saveAntecedentesAcademicos");
                expedienteDatosAcademicosDTO.setBeanName("busqueda-altaAntecedentesAcademicos");
                expedienteDatosAcademicosDTO.setRfcEmpleadoBusqueda(tdEmpleadoDTO.getRfcEmpleado());

                super.saveMessage(model, "sireh.msg.oficinaVirtual.gestionDocumentos.altaAntecedentesAcademicos.ok", idFile);
            } catch (Exception e) {
                logger.debug("Exception --------->" + e.toString());
                super.saveError(model, "sireh.msg.oficinaVirtual.gestionDocumentos.altaAntecedentesAcademicos.error");
            }
        }
        model.addAttribute(expedienteDatosAcademicosDTO);
        return altaAntecedentesAcademicos(model, expedienteDatosAcademicosDTO, tdEmpleadoDTO.getRfcEmpleado());
    }

    /**
     * Autorizacion - Alta de antecedentes academicos
     * @author Gualberto G.
     * @param model Model
     * @param expedienteDatosAcademicosDTO ExpedienteDatosAcademicosDTO
     * @return String
     */
    @RequestMapping
    public String autorizaAltaAntecedentesAcademicos(Model model, ExpedienteDatosAcademicosDTO expedienteDatosAcademicosDTO) {
        // Datos del empleado
        TdEmpleadoDTO tdEmpleadoDTO = super.getService(GestionDocumentosService.class).getEmpleado(expedienteDatosAcademicosDTO.getRfcEmpleadoBusqueda());

        try {
            // Obtener datos del registro seleccionado
            String[] datosExpedienteDatosAcademicos = expedienteDatosAcademicosDTO.getDocGrupo();
            String rfcEmpleado = null;
            String idDocto = null;
            Integer rfcSecuencia = 0;

            if (datosExpedienteDatosAcademicos.length > 0) {
                for (String expedienteDatosAcademicos: datosExpedienteDatosAcademicos) {
                    if (expedienteDatosAcademicos != null && !expedienteDatosAcademicos.equals("")) {
                        String[] result = expedienteDatosAcademicos.split("\\|");
                        rfcEmpleado = result[0];
                        idDocto = result[1];
                        rfcSecuencia = new Integer(result[2]);
                    }
                }
            }

            // Documentos activos-historico
            //super.getService(GestionDocumentosService.class).updateActivosToHistoricoExpedienteAntecedentesAcademicos(rfcEmpleado);

            // Obtener datos del rfc
            TdExpAntecedentesAcademicoDTO tdExpAntecedentesAcademicoDTO = super.getService(GestionDocumentosService.class).getExpedienteAntecedentesAcademicos(rfcEmpleado, rfcSecuencia, idDocto);

            // Actualiza registro
            tdExpAntecedentesAcademicoDTO.setIdExpRechazo(STATUS_SIN_RECHAZO);
            tdExpAntecedentesAcademicoDTO.setIdStatus("ACT");
            tdExpAntecedentesAcademicoDTO.setUsuario(super.security().getUserName());
            tdExpAntecedentesAcademicoDTO.setFecModifico(new Date());
            super.getService(GestionDocumentosService.class).saveAutorizaRechazaExpedienteAntecedentesAcademicos(tdExpAntecedentesAcademicoDTO);

            super.saveMessage(model, "sireh.msg.oficinaVirtual.gestionDocumentos.altaAntecedentesAcademicos.autorizacion.ok");
        } catch (Exception e) {
            logger.debug("Exception --------->" + e.toString());
            super.saveError(model, "sireh.msg.oficinaVirtual.gestionDocumentos.altaAntecedentesAcademicos.autorizacion.error");
        }

        model.addAttribute(expedienteDatosAcademicosDTO);
        return altaAntecedentesAcademicos(model, expedienteDatosAcademicosDTO, tdEmpleadoDTO.getRfcEmpleado());
    }

    /**
     * Rechazo - Alta de antecedentes academicos
     * @author Gualberto G.
     * @param model Model
     * @param expedienteDatosAcademicosDTO ExpedienteDatosAcademicosDTO
     * @return String
     */
    @RequestMapping
    public String rechazaAltaAntecedentesAcademicos(Model model, ExpedienteDatosAcademicosDTO expedienteDatosAcademicosDTO) {
        // Datos del empleado
        TdEmpleadoDTO tdEmpleadoDTO = super.getService(GestionDocumentosService.class).getEmpleado(expedienteDatosAcademicosDTO.getRfcEmpleadoBusqueda());

        try {
            // Obtener datos del registro seleccionado
            String[] datosExpedienteAntecedentesAcademicos = expedienteDatosAcademicosDTO.getDocGrupo();
            String rfcEmpleado = null;
            String idDocto = null;
            Integer rfcSecuencia = 0;

            if (datosExpedienteAntecedentesAcademicos.length > 0) {
                for (String expedienteAntecedentesAcademicos: datosExpedienteAntecedentesAcademicos) {
                    if (expedienteAntecedentesAcademicos != null && !expedienteAntecedentesAcademicos.equals("")) {
                        String[] result = expedienteAntecedentesAcademicos.split("\\|");
                        rfcEmpleado = result[0];
                        idDocto = result[1];
                        rfcSecuencia = new Integer(result[2]);
                    }
                }
            }

            // Obtener datos del rfc
            TdExpAntecedentesAcademicoDTO tdExpAntecedentesAcademicoDTO = super.getService(GestionDocumentosService.class).getExpedienteAntecedentesAcademicos(rfcEmpleado, rfcSecuencia, idDocto);

            // Actualiza registro
            tdExpAntecedentesAcademicoDTO.setIdExpRechazo(expedienteDatosAcademicosDTO.getRechazo());
            tdExpAntecedentesAcademicoDTO.setIdStatus("REC");
            tdExpAntecedentesAcademicoDTO.setUsuario(super.security().getUserName());
            tdExpAntecedentesAcademicoDTO.setFecModifico(new Date());
            super.getService(GestionDocumentosService.class).saveAutorizaRechazaExpedienteAntecedentesAcademicos(tdExpAntecedentesAcademicoDTO);

            super.saveMessage(model, "sireh.msg.oficinaVirtual.gestionDocumentos.altaAntecedentesAcademicos.rechazo.ok");
        } catch (Exception e) {
            logger.debug("Exception --------->" + e.toString());
            super.saveError(model, "sireh.msg.oficinaVirtual.gestionDocumentos.altaAntecedentesAcademicos.rechazo.error");
        }

        model.addAttribute(expedienteDatosAcademicosDTO);
        return altaAntecedentesAcademicos(model, expedienteDatosAcademicosDTO, tdEmpleadoDTO.getRfcEmpleado());
    }

        /**
     * Eliminar - Antecedentes academicos
     * @author Gualberto G.
     * @param model Model
     * @param expedienteDatosAcademicosDTO ExpedienteDatosAcademicosDTO
     * @return String
     */
    @RequestMapping
    public String eliminarAntecedentesAcademicos(Model model, ExpedienteDatosAcademicosDTO expedienteDatosAcademicosDTO){
         String[] datosExpedienteAcademicos = expedienteDatosAcademicosDTO.getDocGrupo();
         String rfcEmpleado = null;
         String idDocto = null;
         Integer rfcSecuencia = 0;


         if (datosExpedienteAcademicos != null && datosExpedienteAcademicos.length > 0) {
             String expedienteAcademicos = datosExpedienteAcademicos[0];

             if (expedienteAcademicos != null && !expedienteAcademicos.equals("")) {
                 String[] result = expedienteAcademicos.split("\\|");
                 rfcEmpleado = result[0];
                 idDocto = result[1];
                 rfcSecuencia = new Integer(result[2]);

                 super.getService(GestionDocumentosService.class).deleteFileExpediente(result[3]);                     

                 TdExpAntecedentesAcademicoDTO tdExpAntecedentesAcademicosDTO = new TdExpAntecedentesAcademicoDTO();
                 tdExpAntecedentesAcademicosDTO.setRfcEmpleado(rfcEmpleado);
                 tdExpAntecedentesAcademicosDTO.setAacSecuencia(rfcSecuencia);
                 tdExpAntecedentesAcademicosDTO.setIdDocto(idDocto);
                 super.getService(GestionDocumentosService.class).deleteExpedienteAntecedentesAcademicos(tdExpAntecedentesAcademicosDTO);
                 super.saveMessage(model, "sireh.msg.oficinaVirtual.gestionDocumentos.altaAntecedentesAcademicos.eliminacion.ok", result[3]);
             }
         }
         
        model.addAttribute(expedienteDatosAcademicosDTO);
        return altaAntecedentesAcademicos(model, expedienteDatosAcademicosDTO, rfcEmpleado);

    }

    /******************************************************************************************************************************************************************************/

    // TODO: CURP
    /**
     * Alta de clave única de registro de población
     * @author Carolina H.
     * @param model Model
     * @param expedienteCurpDTO ExpedienteCurpDTO
     * @param rfcEmpleado String
     * @return String
     */
    @RequestMapping
    public String altaCurp(Model model, ExpedienteCurpDTO expedienteCurpDTO, @RequestParam("rfcEmpleado") String rfcEmpleado) {
        if (expedienteCurpDTO.isCancel()) {
            expedienteCurpDTO = new ExpedienteCurpDTO();
        }
        
        if (rfcEmpleado != null && !rfcEmpleado.equals("")) {
            // Datos del empleado
            TdEmpleadoDTO tdEmpleadoDTO = super.getService(GestionDocumentosService.class).getEmpleado(rfcEmpleado);
            expedienteCurpDTO.setNombreEmpleadoCompleto(tdEmpleadoDTO.getNombreEmpleado() + " " + 
                                                       (tdEmpleadoDTO.getPrimerApellido() == null ? "" : tdEmpleadoDTO.getPrimerApellido()) + " " + 
                                                       (tdEmpleadoDTO.getSegundoApellido() == null ? "" : tdEmpleadoDTO.getSegundoApellido()));

            // Navegacion
            expedienteCurpDTO.setUrlOrigen("altaCurp");
            expedienteCurpDTO.setUrlDestino("saveCurp");
            expedienteCurpDTO.setBeanName("busqueda-altaCurp");
            expedienteCurpDTO.setRfcEmpleadoBusqueda(rfcEmpleado);

            List roles = super.security().getRoles();
            for (Object rol: roles) {
                logger.debug("Roles ---------->" + (String)rol);
            }

            // Verificar si existen previamente documentos registrados
            Integer docRegistrados = super.getService(GestionDocumentosService.class).getTotalExpedienteCurp(rfcEmpleado, "REG");
            logger.debug("Documentos registrados ---------->" + docRegistrados);
            expedienteCurpDTO.setTotalRegistrados(docRegistrados);

            Integer docRechazados = super.getService(GestionDocumentosService.class).getTotalExpedienteCurp(rfcEmpleado, "REC");
            logger.debug("Documentos rechazados ---------->" + docRechazados);
            expedienteCurpDTO.setTotalRechazados(docRechazados);

            // Dimensiones Registrar
            if (super.security().isUserAuthorized(SECURITY_ROL_REG)) {
                expedienteCurpDTO.setRolRegistrar(true);
            } else {
                expedienteCurpDTO.setRolRegistrar(false);
            }

            // Dimensiones Autorizar/Rechazar
            if (super.security().isUserAuthorized(SECURITY_ROL_AUT)) {
                expedienteCurpDTO.setRolAutorizar(true);
                expedienteCurpDTO.setRolRechazar(true);
            } else {
                expedienteCurpDTO.setRolAutorizar(false);
                expedienteCurpDTO.setRolRechazar(false);
            }
        } else {
            super.saveError(model, "No se encontró el empleado solicitado. Por favor verifique.");
            ExpedienteDocEmpleadoDTO expedienteDocEmpleadoDTO = new ExpedienteDocEmpleadoDTO();
            expedienteDocEmpleadoDTO.setRfcEmpleado("");
            return busquedaDocEmpleado(model, expedienteDocEmpleadoDTO);
        }
        model.addAttribute(expedienteCurpDTO);
        return super.getViewName("altaCurp");
    }

    /**
     * Registro - Alta de clave única de registro de población
     * @author Carolina H.
     * @param model Model
     * @param expedienteCurpDTO ExpedienteCurpDTO
     * @return String
     */
    @RequestMapping
    public String saveCurp(Model model, ExpedienteCurpDTO expedienteCurpDTO) {
        // Datos del empleado
        TdEmpleadoDTO tdEmpleadoDTO = super.getService(GestionDocumentosService.class).getEmpleado(expedienteCurpDTO.getRfcEmpleadoBusqueda());

        if (expedienteCurpDTO.isClean()) {
            expedienteCurpDTO = new ExpedienteCurpDTO();
        } else {
            try {
                // Inicializa datos del documento
                String idFile = null;
                expedienteCurpDTO.setName(expedienteCurpDTO.getDocumentoSoporte().getOriginalFilename());
                expedienteCurpDTO.setData(expedienteCurpDTO.getDocumentoSoporte().getInputStream());
                // META-INDEX
                expedienteCurpDTO.setRfcMeta(expedienteCurpDTO.getRfcEmpleadoBusqueda());
                expedienteCurpDTO.setDocMeta(COD_CURP);
                // Descripcion del archivo
                expedienteCurpDTO.setDescripcion(expedienteCurpDTO.getRfcEmpleadoBusqueda() + " - Alta de clave única de registro de población");

                String[] datosExpedienteCurp = expedienteCurpDTO.getDocGrupo();
                String curpEmpleado = null;
                String idDocto = null;
                Integer curpSecuencia = 0;

                // Actualizar el documento
                if (datosExpedienteCurp != null && datosExpedienteCurp.length > 0) {
                    String expedienteCurp = datosExpedienteCurp[0];

                    if (expedienteCurp != null && !expedienteCurp.equals("")) {
                        String[] result = expedienteCurp.split("\\|");
                        curpEmpleado = result[0];
                        idDocto = result[1];
                        curpSecuencia = new Integer(result[2]);

                        super.getService(GestionDocumentosService.class).deleteFileExpediente(result[3]);

                        TdExpCurpDTO tdExpCurpDTO = new TdExpCurpDTO();
                        tdExpCurpDTO.setRfcEmpleado(curpEmpleado);
                        tdExpCurpDTO.setCurpSecuencia(curpSecuencia);
                        tdExpCurpDTO.setIdDocto(idDocto);
                        super.getService(GestionDocumentosService.class).deleteExpedienteCurp(tdExpCurpDTO);
                    }
                }

                // Guardar documento
                idFile = super.getService(GestionDocumentosService.class).saveFileExpediente(expedienteCurpDTO, expedienteCurpDTO.isRollback());

                // Guardar registro
                TdExpCurpDTO tdExpCurpDTO = new TdExpCurpDTO();
                tdExpCurpDTO.setRfcEmpleado(expedienteCurpDTO.getRfcEmpleadoBusqueda());
                tdExpCurpDTO.setCurpCve(expedienteCurpDTO.getCurp());
                tdExpCurpDTO.setCurpFolio(expedienteCurpDTO.getFolio());
                tdExpCurpDTO.setIdDocto(COD_CURP);
                
                tdExpCurpDTO.setCurpDoctoRef(idFile);
                tdExpCurpDTO.setIdStatus("REG");
                tdExpCurpDTO.setIdExpRechazo(STATUS_SIN_RECHAZO);
                tdExpCurpDTO.setUsuario(super.security().getUserName());
                tdExpCurpDTO.setFecModifico(new Date());
                super.getService(GestionDocumentosService.class).saveExpedienteCurp(tdExpCurpDTO);

                // Reiniciar expedienteCurpDTO
                expedienteCurpDTO = new ExpedienteCurpDTO();
                expedienteCurpDTO.setNombreEmpleadoCompleto(tdEmpleadoDTO.getNombreEmpleado() + " " + tdEmpleadoDTO.getPrimerApellido() + " " + tdEmpleadoDTO.getSegundoApellido());
                expedienteCurpDTO.setCurp(tdEmpleadoDTO.getRfcEmpleado());

                // Navegacion
                expedienteCurpDTO.setUrlOrigen("altaCurp");
                expedienteCurpDTO.setUrlDestino("saveCurp");
                expedienteCurpDTO.setBeanName("busqueda-altaCurp");
                expedienteCurpDTO.setRfcEmpleadoBusqueda(tdEmpleadoDTO.getRfcEmpleado());

                super.saveMessage(model, "sireh.msg.oficinaVirtual.gestionDocumentos.altaCurp.curp.ok", idFile);
            } catch (Exception e) {
                logger.debug("Exception --------->" + e.toString());
                super.saveError(model, "sireh.msg.oficinaVirtual.gestionDocumentos.altaCurp.curp.error");
            }
        }
        model.addAttribute(expedienteCurpDTO);
        return altaCurp(model, expedienteCurpDTO, tdEmpleadoDTO.getRfcEmpleado());
    }

    /**
     * Autorizacion - Alta de clave única de registro de población
     * @author Carolina H.
     * @param model Model
     * @param expedienteCurpDTO ExpedienteCurpDTO
     * @return String
     */
    @RequestMapping
    public String autorizaAltaCurp(Model model, ExpedienteCurpDTO expedienteCurpDTO) {
        // Datos del empleado
        TdEmpleadoDTO tdEmpleadoDTO = super.getService(GestionDocumentosService.class).getEmpleado(expedienteCurpDTO.getRfcEmpleadoBusqueda());

        try {
            // Obtener datos del registro seleccionado
            String[] datosExpedienteCurp = expedienteCurpDTO.getDocGrupo();
            String rfcEmpleado = null;
            String idDocto = null;
            Integer curpSecuencia = 0;

            if (datosExpedienteCurp.length > 0) {
                for (String expedienteCurp: datosExpedienteCurp) {
                    if (expedienteCurp != null && !expedienteCurp.equals("")) {
                        String[] result = expedienteCurp.split("\\|");
                        rfcEmpleado = result[0];
                        idDocto = result[1];
                        curpSecuencia = new Integer(result[2]);
                    }
                }
            }

            // Documentos activos-historico
            super.getService(GestionDocumentosService.class).updateActivosToHistoricoExpedienteCurp(rfcEmpleado);

            // Obtener datos del rfc
            TdExpCurpDTO tdExpCurpDTO = super.getService(GestionDocumentosService.class).getExpedienteCurp(rfcEmpleado, curpSecuencia, idDocto);

            // Actualiza registro
            tdExpCurpDTO.setIdExpRechazo(STATUS_SIN_RECHAZO);
            tdExpCurpDTO.setIdStatus("ACT");
            tdExpCurpDTO.setUsuario(super.security().getUserName());
            tdExpCurpDTO.setFecModifico(new Date());
            super.getService(GestionDocumentosService.class).saveAutorizaRechazaExpedienteCurp(tdExpCurpDTO);

            super.saveMessage(model, "sireh.msg.oficinaVirtual.gestionDocumentos.altaCurp.curp.autorizacion.ok");
        } catch (Exception e) {
            logger.debug("Exception --------->" + e.toString());
            super.saveError(model, "sireh.msg.oficinaVirtual.gestionDocumentos.altaCurp.curp.autorizacion.error");
        }

        model.addAttribute(expedienteCurpDTO);
        return altaCurp(model, expedienteCurpDTO, tdEmpleadoDTO.getRfcEmpleado());
    }

    /**
     * Rechazo - Alta de clave única de registro de población
     * @author Carolina H.
     * @param model Model
     * @param expedienteCurpDTO ExpedienteCurpDTO
     * @return String
     */
    @RequestMapping
    public String rechazaAltaCurp(Model model, ExpedienteCurpDTO expedienteCurpDTO) {
        // Datos del empleado
        TdEmpleadoDTO tdEmpleadoDTO = super.getService(GestionDocumentosService.class).getEmpleado(expedienteCurpDTO.getRfcEmpleadoBusqueda());

        try {
            // Obtener datos del registro seleccionado
            String[] datosExpedienteCurp = expedienteCurpDTO.getDocGrupo();
            String rfcEmpleado = null;
            String idDocto = null;
            Integer curpSecuencia = 0;

            if (datosExpedienteCurp.length > 0) {
                for (String expedienteCurp: datosExpedienteCurp) {
                    if (expedienteCurp != null && !expedienteCurp.equals("")) {
                        String[] result = expedienteCurp.split("\\|");
                        rfcEmpleado = result[0];
                        idDocto = result[1];
                        curpSecuencia = new Integer(result[2]);
                    }
                }
            }

            // Obtener datos del rfc
            TdExpCurpDTO tdExpCurpDTO = super.getService(GestionDocumentosService.class).getExpedienteCurp(rfcEmpleado, curpSecuencia, idDocto);

            // Actualiza registro
            tdExpCurpDTO.setIdExpRechazo(expedienteCurpDTO.getRechazo());
            tdExpCurpDTO.setIdStatus("REC");
            tdExpCurpDTO.setUsuario(super.security().getUserName());
            tdExpCurpDTO.setFecModifico(new Date());
            super.getService(GestionDocumentosService.class).saveAutorizaRechazaExpedienteCurp(tdExpCurpDTO);

            super.saveMessage(model, "sireh.msg.oficinaVirtual.gestionDocumentos.altaCurp.curp.rechazo.ok");
        } catch (Exception e) {
            logger.debug("Exception --------->" + e.toString());
            super.saveError(model, "sireh.msg.oficinaVirtual.gestionDocumentos.altaCurp.curp.rechazo.error");
        }

        model.addAttribute(expedienteCurpDTO);
        return altaCurp(model, expedienteCurpDTO, tdEmpleadoDTO.getRfcEmpleado());
    }

        /**
     * Eliminar - Curp
     * @author Gualberto G.
     * @param model Model
     * @param expedienteCurpDTO ExpedienteCurpDTO
     * @return String
     */
    @RequestMapping
    public String eliminarCurp(Model model, ExpedienteCurpDTO expedienteCurpDTO){
         String[] datosExpedienteCurp = expedienteCurpDTO.getDocGrupo();
         String rfcEmpleado = null;
         String idDocto = null;
         Integer rfcSecuencia = 0;


         if (datosExpedienteCurp != null && datosExpedienteCurp.length > 0) {
             String expedienteCurp = datosExpedienteCurp[0];

             if (expedienteCurp != null && !expedienteCurp.equals("")) {
                 String[] result = expedienteCurp.split("\\|");
                 rfcEmpleado = result[0];
                 idDocto = result[1];
                 rfcSecuencia = new Integer(result[2]);

                super.getService(GestionDocumentosService.class).deleteFileExpediente(result[3]);
                
                TdExpCurpDTO tdExpCurpDTO = new TdExpCurpDTO();
                tdExpCurpDTO.setRfcEmpleado(rfcEmpleado);
                tdExpCurpDTO.setCurpSecuencia(rfcSecuencia);
                tdExpCurpDTO.setIdDocto(idDocto);
                super.getService(GestionDocumentosService.class).deleteExpedienteCurp(tdExpCurpDTO);
                super.saveMessage(model, "sireh.msg.oficinaVirtual.gestionDocumentos.altaCurp.curp.eliminacion.ok", result[3]);
             }
         }
         
        model.addAttribute(expedienteCurpDTO);
        return altaCurp(model, expedienteCurpDTO, rfcEmpleado);

    }
    
    /******************************************************************************************************************************************************************************/

    // TODO: RFC
    /**
     * Alta de registro federal de contribuyentes
     * @author Oscar S.
     * @param model Model
     * @param expedienteRfcDTO ExpedienteRfcDTO
     * @param rfcEmpleado String
     * @return String
     */
    @RequestMapping
    public String altaRfc(Model model, ExpedienteRfcDTO expedienteRfcDTO, @RequestParam("rfcEmpleado") String rfcEmpleado) {
        if (expedienteRfcDTO.isClean()) {
            expedienteRfcDTO = new ExpedienteRfcDTO();
        }
        
        if (rfcEmpleado != null && !rfcEmpleado.equals("")) {
            // Datos del empleado
            TdEmpleadoDTO tdEmpleadoDTO = super.getService(GestionDocumentosService.class).getEmpleado(rfcEmpleado);
            expedienteRfcDTO.setNombreEmpleadoCompleto(tdEmpleadoDTO.getNombreEmpleado() + " " + 
                                                      (tdEmpleadoDTO.getPrimerApellido() == null ? "" : tdEmpleadoDTO.getPrimerApellido()) + " " + 
                                                      (tdEmpleadoDTO.getSegundoApellido() == null ? "" : tdEmpleadoDTO.getSegundoApellido()));
            expedienteRfcDTO.setRfc(rfcEmpleado);

            // Navegacion
            expedienteRfcDTO.setUrlOrigen("altaRfc");
            expedienteRfcDTO.setUrlDestino("saveRfc");
            expedienteRfcDTO.setBeanName("busqueda-altaRfc");
            expedienteRfcDTO.setRfcEmpleadoBusqueda(rfcEmpleado);

            List roles = super.security().getRoles();
            for (Object rol: roles) {
                logger.debug("Roles ---------->" + (String)rol);
            }

            // Verificar si existen previamente documentos registrados
            Integer docRegistrados = super.getService(GestionDocumentosService.class).getTotalExpedienteCRRFC(rfcEmpleado, "REG");
            logger.debug("Documentos registrados ---------->" + docRegistrados);
            expedienteRfcDTO.setTotalRegistrados(docRegistrados);

            Integer docRechazados = super.getService(GestionDocumentosService.class).getTotalExpedienteCRRFC(rfcEmpleado, "REC");
            logger.debug("Documentos rechazados ---------->" + docRechazados);
            expedienteRfcDTO.setTotalRechazados(docRechazados);

            // Dimensiones Registrar
            //if (super.security().isUserAuthorized(SECURITY_ROL_REG) && (docRegistrados == 0 || docRechazados > 0)) {
            if (super.security().isUserAuthorized(SECURITY_ROL_REG)) {
                expedienteRfcDTO.setRegistrar(true);
            } else {
                expedienteRfcDTO.setRegistrar(false);
            }

            // Dimensiones Autorizar/Rechazar
            //if (super.security().isUserAuthorized(SECURITY_ROL_AUT) && (docRegistrados > 0)) {
            if (super.security().isUserAuthorized(SECURITY_ROL_AUT)) {
                expedienteRfcDTO.setAutorizar(true);
                expedienteRfcDTO.setRechazar(true);
            } else {
                expedienteRfcDTO.setAutorizar(false);
                expedienteRfcDTO.setRechazar(false);
            }
        } else {
            super.saveError(model, "No se encontró el empleado solicitado. Por favor verifique.");
            ExpedienteDocEmpleadoDTO expedienteDocEmpleadoDTO = new ExpedienteDocEmpleadoDTO();
            expedienteDocEmpleadoDTO.setRfcEmpleado("");
            return busquedaDocEmpleado(model, expedienteDocEmpleadoDTO);
        }
        model.addAttribute(expedienteRfcDTO);
        return super.getViewName("altaRfc");
    }

    /**
     * Registro - Alta de registro federal de contribuyentes
     * @author Oscar S.
     * @param model Model
     * @param expedienteRfcDTO ExpedienteRfcDTO
     * @return String
     */
    @RequestMapping
    public String saveRfc(Model model, ExpedienteRfcDTO expedienteRfcDTO) {
        // Datos del empleado
        TdEmpleadoDTO tdEmpleadoDTO = super.getService(GestionDocumentosService.class).getEmpleado(expedienteRfcDTO.getRfcEmpleadoBusqueda());

        if (expedienteRfcDTO.isClean()) {
            expedienteRfcDTO = new ExpedienteRfcDTO();
        } else {
            try {
                // Inicializa datos del documento
                String idFile = null;
                expedienteRfcDTO.setName(expedienteRfcDTO.getDocumentoSoporte().getOriginalFilename());
                expedienteRfcDTO.setData(expedienteRfcDTO.getDocumentoSoporte().getInputStream());
                // META-INDEX
                expedienteRfcDTO.setRfcMeta(expedienteRfcDTO.getRfc());
                expedienteRfcDTO.setDocMeta(COD_RFC);
                // Descripcion del archivo
                expedienteRfcDTO.setDescripcion(expedienteRfcDTO.getRfc() + " - Alta de registro federal de contribuyentes");

                String[] datosExpedienteRfc = expedienteRfcDTO.getDocGrupo();
                String rfcEmpleado = null;
                String idDocto = null;
                Integer rfcSecuencia = 0;

                // Actualizar el documento
                if (datosExpedienteRfc != null && datosExpedienteRfc.length > 0) {
                    String expedienteRfc = datosExpedienteRfc[0];

                    if (expedienteRfc != null && !expedienteRfc.equals("")) {
                        String[] result = expedienteRfc.split("\\|");
                        rfcEmpleado = result[0];
                        idDocto = result[1];
                        rfcSecuencia = new Integer(result[2]);

                        super.getService(GestionDocumentosService.class).deleteFileExpediente(result[3]);

                        TdExpRfcDTO tdExpRfcDTO = new TdExpRfcDTO();
                        tdExpRfcDTO.setRfcEmpleado(rfcEmpleado);
                        tdExpRfcDTO.setRfcSecuencia(rfcSecuencia);
                        tdExpRfcDTO.setIdDocto(idDocto);
                        super.getService(GestionDocumentosService.class).deleteExpedienteCRRFC(tdExpRfcDTO);
                    }
                }

                // Guardar documento
                idFile = super.getService(GestionDocumentosService.class).saveFileExpediente(expedienteRfcDTO, expedienteRfcDTO.isRollback());

                // Guardar registro
                TdExpRfcDTO tdExpRfcDTO = new TdExpRfcDTO();
                tdExpRfcDTO.setRfcEmpleado(expedienteRfcDTO.getRfcEmpleadoBusqueda());
                tdExpRfcDTO.setRfcClave(expedienteRfcDTO.getRfc());
                tdExpRfcDTO.setRfcFolio(expedienteRfcDTO.getFolio());
                tdExpRfcDTO.setIdDocto(COD_RFC);

                tdExpRfcDTO.setRfcDoctoRef(idFile);
                tdExpRfcDTO.setIdStatus("REG");
                tdExpRfcDTO.setIdExpRechazo(STATUS_SIN_RECHAZO);
                tdExpRfcDTO.setUsuario(super.security().getUserName());
                tdExpRfcDTO.setFecModifico(new Date());
                super.getService(GestionDocumentosService.class).saveExpedienteCRRFC(tdExpRfcDTO);

                // Reiniciar expedienteRfcDTO
                expedienteRfcDTO = new ExpedienteRfcDTO();
                expedienteRfcDTO.setNombreEmpleadoCompleto(tdEmpleadoDTO.getNombreEmpleado() + " " + tdEmpleadoDTO.getPrimerApellido() + " " + tdEmpleadoDTO.getSegundoApellido());
                expedienteRfcDTO.setRfc(tdEmpleadoDTO.getRfcEmpleado());

                // Navegacion
                expedienteRfcDTO.setUrlOrigen("altaRfc");
                expedienteRfcDTO.setUrlDestino("saveRfc");
                expedienteRfcDTO.setBeanName("busqueda-altaRfc");
                expedienteRfcDTO.setRfcEmpleadoBusqueda(tdEmpleadoDTO.getRfcEmpleado());

                super.saveMessage(model, "sireh.msg.oficinaVirtual.gestionDocumentos.altaRFC.rfc.ok", idFile);
            } catch (Exception e) {
                logger.debug("Exception --------->" + e.toString());
                super.saveError(model, "sireh.msg.oficinaVirtual.gestionDocumentos.altaRFC.rfc.error");
            }
        }
        model.addAttribute(expedienteRfcDTO);
        return altaRfc(model, expedienteRfcDTO, tdEmpleadoDTO.getRfcEmpleado());
    }

    /**
     * Autorizacion - Alta de registro federal de contribuyentes
     * @author Oscar S.
     * @param model Model
     * @param expedienteRfcDTO ExpedienteRfcDTO
     * @return String
     */
    @RequestMapping
    public String autorizaAltaRfc(Model model, ExpedienteRfcDTO expedienteRfcDTO) {
        // Datos del empleado
        TdEmpleadoDTO tdEmpleadoDTO = super.getService(GestionDocumentosService.class).getEmpleado(expedienteRfcDTO.getRfcEmpleadoBusqueda());

        try {
            // Obtener datos del registro seleccionado
            String[] datosExpedienteRfc = expedienteRfcDTO.getDocGrupo();
            String rfcEmpleado = null;
            String idDocto = null;
            Integer rfcSecuencia = 0;

            if (datosExpedienteRfc.length > 0) {
                for (String expedienteRfc: datosExpedienteRfc) {
                    if (expedienteRfc != null && !expedienteRfc.equals("")) {
                        String[] result = expedienteRfc.split("\\|");
                        rfcEmpleado = result[0];
                        idDocto = result[1];
                        rfcSecuencia = new Integer(result[2]);
                    }
                }
            }

            // Documentos activos-historico
            super.getService(GestionDocumentosService.class).updateActivosToHistoricoExpedienteCRRFC(rfcEmpleado);

            // Obtener datos del rfc
            TdExpRfcDTO tdExpRfcDTO = super.getService(GestionDocumentosService.class).getExpedienteCRRFC(rfcEmpleado, rfcSecuencia, idDocto);

            // Actualiza registro
            tdExpRfcDTO.setIdExpRechazo(STATUS_SIN_RECHAZO);
            tdExpRfcDTO.setIdStatus("ACT");
            tdExpRfcDTO.setUsuario(super.security().getUserName());
            tdExpRfcDTO.setFecModifico(new Date());
            super.getService(GestionDocumentosService.class).saveAutorizaRechazaExpedienteCRRFC(tdExpRfcDTO);

            super.saveMessage(model, "sireh.msg.oficinaVirtual.gestionDocumentos.altaRFC.rfc.autorizacion.ok");
        } catch (Exception e) {
            logger.debug("Exception --------->" + e.toString());
            super.saveError(model, "sireh.msg.oficinaVirtual.gestionDocumentos.altaRFC.rfc.autorizacion.error");
        }

        model.addAttribute(expedienteRfcDTO);
        return altaRfc(model, expedienteRfcDTO, tdEmpleadoDTO.getRfcEmpleado());
    }

    /**
     * Rechazo - Alta de registro federal de contribuyentes
     * @author Oscar S.
     * @param model Model
     * @param expedienteRfcDTO ExpedienteRfcDTO
     * @return String
     */
    @RequestMapping
    public String rechazaAltaRfc(Model model, ExpedienteRfcDTO expedienteRfcDTO) {
        // Datos del empleado
        TdEmpleadoDTO tdEmpleadoDTO = super.getService(GestionDocumentosService.class).getEmpleado(expedienteRfcDTO.getRfcEmpleadoBusqueda());

        try {
            // Obtener datos del registro seleccionado
            String[] datosExpedienteRfc = expedienteRfcDTO.getDocGrupo();
            String rfcEmpleado = null;
            String idDocto = null;
            Integer rfcSecuencia = 0;

            if (datosExpedienteRfc.length > 0) {
                for (String expedienteRfc: datosExpedienteRfc) {
                    if (expedienteRfc != null && !expedienteRfc.equals("")) {
                        String[] result = expedienteRfc.split("\\|");
                        rfcEmpleado = result[0];
                        idDocto = result[1];
                        rfcSecuencia = new Integer(result[2]);
                    }
                }
            }

            // Obtener datos del rfc
            TdExpRfcDTO tdExpRfcDTO = super.getService(GestionDocumentosService.class).getExpedienteCRRFC(rfcEmpleado, rfcSecuencia, idDocto);

            // Actualiza registro
            tdExpRfcDTO.setIdExpRechazo(expedienteRfcDTO.getRechazo());
            tdExpRfcDTO.setIdStatus("REC");
            tdExpRfcDTO.setUsuario(super.security().getUserName());
            tdExpRfcDTO.setFecModifico(new Date());
            super.getService(GestionDocumentosService.class).saveAutorizaRechazaExpedienteCRRFC(tdExpRfcDTO);

            super.saveMessage(model, "sireh.msg.oficinaVirtual.gestionDocumentos.altaRFC.rfc.rechazo.ok");
        } catch (Exception e) {
            logger.debug("Exception --------->" + e.toString());
            super.saveError(model, "sireh.msg.oficinaVirtual.gestionDocumentos.altaRFC.rfc.rechazo.error");
        }

        model.addAttribute(expedienteRfcDTO);
        return altaRfc(model, expedienteRfcDTO, tdEmpleadoDTO.getRfcEmpleado());
    }

    /******************************************************************************************************************************************************************************/

    // TODO: Domicilio particular
    /**
     * Alta de domicilio particular
     * @author Oscar S.
     * @param model Model
     * @param expedienteDomicilioDTO ExpedienteDomicilioDTO
     * @param rfcEmpleado String
     * @return String
     */
    @RequestMapping
    public String altaDomicilio(Model model, ExpedienteDomicilioDTO expedienteDomicilioDTO, @RequestParam("rfcEmpleado") String rfcEmpleado) {
        if (expedienteDomicilioDTO.isCancel()) {
            expedienteDomicilioDTO = new ExpedienteDomicilioDTO();
        }
        
        if (rfcEmpleado != null && !rfcEmpleado.equals("")) {
            // Datos del empleado
            TdEmpleadoDTO tdEmpleadoDTO = super.getService(GestionDocumentosService.class).getEmpleado(rfcEmpleado);
            expedienteDomicilioDTO.setNombreEmpleadoCompleto(tdEmpleadoDTO.getNombreEmpleado() + " " + 
                                                            (tdEmpleadoDTO.getPrimerApellido() == null ? "" : tdEmpleadoDTO.getPrimerApellido()) + " " + 
                                                            (tdEmpleadoDTO.getSegundoApellido() == null ? "" : tdEmpleadoDTO.getSegundoApellido()));

            // Navegacion
            expedienteDomicilioDTO.setUrlOrigen("altaDomicilio");
            expedienteDomicilioDTO.setUrlDestino("saveDomicilio");
            expedienteDomicilioDTO.setBeanName("busqueda-altaDomicilio");
            expedienteDomicilioDTO.setRfcEmpleadoBusqueda(rfcEmpleado);

            List roles = super.security().getRoles();
            for (Object rol: roles) {
                logger.debug("Roles ---------->" + (String)rol);
            }

            // Verificar si existen previamente documentos registrados
            Integer docRegistrados = super.getService(GestionDocumentosService.class).getTotalExpedienteDomicilio(rfcEmpleado, "REG");
            logger.debug("Documentos registrados ---------->" + docRegistrados);
            expedienteDomicilioDTO.setTotalRegistrados(docRegistrados);
            
            Integer docRechazados = super.getService(GestionDocumentosService.class).getTotalExpedienteDomicilio(rfcEmpleado, "REC");
            logger.debug("Documentos rechazados ---------->" + docRechazados);
            expedienteDomicilioDTO.setTotalRechazados(docRechazados);
            
            // Dimensiones Registrar
            if (super.security().isUserAuthorized(SECURITY_ROL_REG)) {
                expedienteDomicilioDTO.setRolRegistrar(true);
            } else {
                expedienteDomicilioDTO.setRolRegistrar(false);
            }

            // Dimensiones Autorizar/Rechazar
            if (super.security().isUserAuthorized(SECURITY_ROL_AUT)) {
                expedienteDomicilioDTO.setRolAutorizar(true);
                expedienteDomicilioDTO.setRolRechazar(true);
            } else {
                expedienteDomicilioDTO.setRolAutorizar(false);
                expedienteDomicilioDTO.setRolRechazar(false);
            }
        } else {
            super.saveError(model, "No se encontró el empleado solicitado. Por favor verifique.");
            ExpedienteDocEmpleadoDTO expedienteDocEmpleadoDTO = new ExpedienteDocEmpleadoDTO();
            expedienteDocEmpleadoDTO.setRfcEmpleado("");
            return busquedaDocEmpleado(model, expedienteDocEmpleadoDTO);
        }
        model.addAttribute(expedienteDomicilioDTO);
        return super.getViewName("altaDomicilio");
    }
    
    /**
     * Procesa Municipio - Metodo encargado de obtener el munucipio de captura con base en la entidadFederativa seleccionada.
     * @author MCS
     * @param entidadFederativa Integer
     * @param response HttpServletResponse
     */
    @RequestMapping
    public void getMunicipiosCallback(@RequestParam("entidadFederativa") Integer entidadFederativa, HttpServletResponse response) throws IOException {
        StringBuffer sb = new StringBuffer();
        List<String> lMunicipios = super.getService(GestionDocumentosService.class).getMunicipiosByEntidadFederativa(entidadFederativa);
        sb.append("<option value=''>SELECCIONE...</option>");
        if(lMunicipios.size() > 0){
           for(String elemento : lMunicipios){
            logger.debug("lMunicipios: " + elemento.split("-")[0].trim());
            logger.debug("elemento: " + elemento);
            sb.append("<option value='" + elemento.split("-")[0].trim() + "'>" + elemento + "</option>");
           } 
        }
        response.setHeader("Cache-Control","no-cache"); 
        response.setDateHeader("Expires", 0);
        response.setHeader("Pragma","no-cache");
        response.setContentType("text/plain");
        PrintWriter out = response.getWriter();
        out.print(sb.toString());
    }
    
     /**
      * Obtiene la lista de Codigos postales del municipio en la entidad federativa
      * @author MCS
      * @param entidadMunicipio String
      */
    @RequestMapping
    public void getCpsCallback(@RequestParam("entidadMunicipio") String entidadMunicipio, HttpServletResponse response) throws IOException {
        StringBuffer sb = new StringBuffer();
        Integer entidadFederativa   = new Integer(entidadMunicipio.split("-")[0].trim());
        Integer municipio           = new Integer(entidadMunicipio.split("-")[1].trim());
        
        List<String> lCodigosPostales = super.getService(GestionDocumentosService.class).getCpsByEntidadFederativaAndMunicipios(entidadFederativa, municipio);
        sb.append("<option value=''>SELECCIONE...</option>");
        if(lCodigosPostales.size() > 0){
           for(String cp : lCodigosPostales){
            sb.append("<option value='" + cp.trim() + "'>" + cp + "</option>");
           } 
        }
        response.setHeader("Cache-Control","no-cache"); 
        response.setDateHeader("Expires", 0);
        response.setHeader("Pragma","no-cache");
        response.setContentType("text/plain");
        PrintWriter out = response.getWriter();
        out.print(sb.toString());
    }
    
    /**
     * Obtiene la lista de Colonias del codigo postal
     * @author MCS
     * @param codigoPostal Integer
     */
    @RequestMapping
    public void getColoniasCallback(@RequestParam("codigoPostal") String codigoPostal, HttpServletResponse response) throws IOException {
       StringBuffer sb = new StringBuffer();
       
       List<String> lColonias = super.getService(GestionDocumentosService.class).getColoniasByCodigoPostal(codigoPostal);
       sb.append("<option value=''>SELECCIONE...</option>");
       if(lColonias.size() > 0){
          for(String colonia : lColonias){
           sb.append("<option value='" + colonia.split(" - ")[1] + "'>" + colonia + "</option>");
           logger.debug(colonia.split(" - ")[1]);
          } 
       }
       response.setHeader("Cache-Control","no-cache"); 
       response.setDateHeader("Expires", 0);
       response.setHeader("Pragma","no-cache");
       response.setContentType("text/plain");
       PrintWriter out = response.getWriter();
       out.print(sb.toString());
    }

    /**
     * Registro - Alta de domicilio particular
     * @author Oscar S.
     * @param model Model
     * @param expedienteDomicilioDTO ExpedienteDomicilioDTO
     * @return String
     */
    @RequestMapping
    public String saveDomicilio(Model model, ExpedienteDomicilioDTO expedienteDomicilioDTO) {
        // Datos del empleado
        TdEmpleadoDTO tdEmpleadoDTO = super.getService(GestionDocumentosService.class).getEmpleado(expedienteDomicilioDTO.getRfcEmpleadoBusqueda());

        if (expedienteDomicilioDTO.isClean()) {
            expedienteDomicilioDTO = new ExpedienteDomicilioDTO();
        } else {
            try {
                // Inicializa datos del documento
                String idFile = null;
                expedienteDomicilioDTO.setName(expedienteDomicilioDTO.getDocumentoSoporte().getOriginalFilename());
                expedienteDomicilioDTO.setData(expedienteDomicilioDTO.getDocumentoSoporte().getInputStream());
                // META-INDEX
                expedienteDomicilioDTO.setRfcMeta(expedienteDomicilioDTO.getRfcEmpleadoBusqueda());
                expedienteDomicilioDTO.setDocMeta(COD_DOM);
                // Descripcion del archivo
                expedienteDomicilioDTO.setDescripcion(expedienteDomicilioDTO.getRfcEmpleadoBusqueda() + " - Alta de domicilio particular");

                String[] datosExpedienteDomicilio = expedienteDomicilioDTO.getDocGrupo();
                String rfcEmpleado = null;
                String idDocto = null;
                Integer rfcSecuencia = 0;

                // Actualizar el documento
                if (datosExpedienteDomicilio != null && datosExpedienteDomicilio.length > 0) {
                    String expedienteDomicilio = datosExpedienteDomicilio[0];

                    if (expedienteDomicilio != null && !expedienteDomicilio.equals("")) {
                        String[] result = expedienteDomicilio.split("\\|");
                        rfcEmpleado = result[0];
                        idDocto = result[1];
                        rfcSecuencia = new Integer(result[2]);

                        super.getService(GestionDocumentosService.class).deleteFileExpediente(result[3]);

                        TdExpDomicilioParticularDTO tdExpDomicilioParticularDTO = new TdExpDomicilioParticularDTO();
                        tdExpDomicilioParticularDTO.setRfcEmpleado(rfcEmpleado);
                        tdExpDomicilioParticularDTO.setDomSecuencia(rfcSecuencia);
                        tdExpDomicilioParticularDTO.setIdDocto(idDocto);
                        super.getService(GestionDocumentosService.class).deleteExpedienteDomicilio(tdExpDomicilioParticularDTO);
                    }
                }

                // Guardar documento
                idFile = super.getService(GestionDocumentosService.class).saveFileExpediente(expedienteDomicilioDTO, expedienteDomicilioDTO.isRollback());

                // Guardar registro
                TdExpDomicilioParticularDTO tdExpDomicilioParticularDTO = new TdExpDomicilioParticularDTO();
                tdExpDomicilioParticularDTO.setRfcEmpleado(expedienteDomicilioDTO.getRfcEmpleadoBusqueda());
                tdExpDomicilioParticularDTO.setIdDocto(COD_DOM);

                tdExpDomicilioParticularDTO.setDomCalle(expedienteDomicilioDTO.getCalle());
                tdExpDomicilioParticularDTO.setDomNumExt(expedienteDomicilioDTO.getNumExt());
                tdExpDomicilioParticularDTO.setDomNumInt(expedienteDomicilioDTO.getNumInt());
                tdExpDomicilioParticularDTO.setIdCodPost(expedienteDomicilioDTO.getCp());
                tdExpDomicilioParticularDTO.setDomColonia(expedienteDomicilioDTO.getColonia());
                tdExpDomicilioParticularDTO.setIdMun(expedienteDomicilioDTO.getMunicipio());
                tdExpDomicilioParticularDTO.setIdEdo(expedienteDomicilioDTO.getEntidadFederativa());
                tdExpDomicilioParticularDTO.setIdPais(expedienteDomicilioDTO.getPais());

                tdExpDomicilioParticularDTO.setDomDoctoRef(idFile);
                tdExpDomicilioParticularDTO.setIdStatus("REG");
                tdExpDomicilioParticularDTO.setIdExpRechazo(STATUS_SIN_RECHAZO);
                tdExpDomicilioParticularDTO.setUsuario(super.security().getUserName());
                tdExpDomicilioParticularDTO.setFecModifico(new Date());
                super.getService(GestionDocumentosService.class).saveExpedienteDomicilio(tdExpDomicilioParticularDTO);

                // Reiniciar expedienteDomicilioDTO
                expedienteDomicilioDTO = new ExpedienteDomicilioDTO();
                expedienteDomicilioDTO.setNombreEmpleadoCompleto(tdEmpleadoDTO.getNombreEmpleado() + " " + tdEmpleadoDTO.getPrimerApellido() + " " + tdEmpleadoDTO.getSegundoApellido());

                // Navegacion
                expedienteDomicilioDTO.setUrlOrigen("altaDomicilio");
                expedienteDomicilioDTO.setUrlDestino("saveDomicilio");
                expedienteDomicilioDTO.setBeanName("busqueda-altaDomicilio");
                expedienteDomicilioDTO.setRfcEmpleadoBusqueda(tdEmpleadoDTO.getRfcEmpleado());

                super.saveMessage(model, "sireh.msg.oficinaVirtual.gestionDocumentos.altaDomicilio.ok", idFile);
            } catch (Exception e) {
                logger.debug("Exception --------->" + e.toString());
                super.saveError(model, "sireh.msg.oficinaVirtual.gestionDocumentos.altaDomicilio.error");
            }
        }
        model.addAttribute(expedienteDomicilioDTO);
        return altaDomicilio(model, expedienteDomicilioDTO, tdEmpleadoDTO.getRfcEmpleado());
    }

    /**
     * Autorizacion - Alta de domicilio particular
     * @author Oscar S.
     * @param model Model
     * @param expedienteDomicilioDTO ExpedienteDomicilioDTO
     * @return String
     */
    @RequestMapping
    public String autorizaAltaDomicilio(Model model, ExpedienteDomicilioDTO expedienteDomicilioDTO) {
        // Datos del empleado
        TdEmpleadoDTO tdEmpleadoDTO = super.getService(GestionDocumentosService.class).getEmpleado(expedienteDomicilioDTO.getRfcEmpleadoBusqueda());

        try {
            // Obtener datos del registro seleccionado
            String[] datosExpedienteRfc = expedienteDomicilioDTO.getDocGrupo();
            String rfcEmpleado = null;
            String idDocto = null;
            Integer domSecuencia = 0;

            if (datosExpedienteRfc.length > 0) {
                for (String expedienteRfc: datosExpedienteRfc) {
                    if (expedienteRfc != null && !expedienteRfc.equals("")) {
                        String[] result = expedienteRfc.split("\\|");
                        rfcEmpleado = result[0];
                        idDocto = result[1];
                        domSecuencia = new Integer(result[2]);
                    }
                }
            }

            // Documentos activos-historico
            super.getService(GestionDocumentosService.class).updateActivosToHistoricoExpedienteDomicilio(rfcEmpleado);

            // Obtener datos del domicilio
            TdExpDomicilioParticularDTO tdExpDomicilioParticularDTO = super.getService(GestionDocumentosService.class).getExpedienteDomicilio(rfcEmpleado, domSecuencia, idDocto);

            // Actualiza registro
            tdExpDomicilioParticularDTO.setIdExpRechazo(STATUS_SIN_RECHAZO);
            tdExpDomicilioParticularDTO.setIdStatus("ACT");
            tdExpDomicilioParticularDTO.setUsuario(super.security().getUserName());
            tdExpDomicilioParticularDTO.setFecModifico(new Date());
            super.getService(GestionDocumentosService.class).saveAutorizaRechazaExpedienteDomicilio(tdExpDomicilioParticularDTO);

            super.saveMessage(model, "sireh.msg.oficinaVirtual.gestionDocumentos.altaDomicilio.autorizacion.ok");
        } catch (Exception e) {
            logger.debug("Exception --------->" + e.toString());
            super.saveError(model, "sireh.msg.oficinaVirtual.gestionDocumentos.altaDomicilio.autorizacion.error");
        }

        model.addAttribute(expedienteDomicilioDTO);
        return altaDomicilio(model, expedienteDomicilioDTO, tdEmpleadoDTO.getRfcEmpleado());
    }

    /**
     * Rechazo - Alta de domicilio particular
     * @author Oscar S.
     * @param model Model
     * @param expedienteDomicilioDTO ExpedienteDomicilioDTO
     * @return String
     */
    @RequestMapping
    public String rechazaAltaDomicilio(Model model, ExpedienteDomicilioDTO expedienteDomicilioDTO) {
        // Datos del empleado
        TdEmpleadoDTO tdEmpleadoDTO = super.getService(GestionDocumentosService.class).getEmpleado(expedienteDomicilioDTO.getRfcEmpleadoBusqueda());

        try {
            // Obtener datos del registro seleccionado
            String[] datosExpedienteDomicilio = expedienteDomicilioDTO.getDocGrupo();
            String rfcEmpleado = null;
            String idDocto = null;
            Integer domSecuencia = 0;

            if (datosExpedienteDomicilio.length > 0) {
                for (String expedienteDomicilio: datosExpedienteDomicilio) {
                    if (expedienteDomicilio != null && !expedienteDomicilio.equals("")) {
                        String[] result = expedienteDomicilio.split("\\|");
                        rfcEmpleado = result[0];
                        idDocto = result[1];
                        domSecuencia = new Integer(result[2]);
                    }
                }
            }

            // Obtener datos del rfc
            TdExpDomicilioParticularDTO tdExpDomicilioParticularDTO = super.getService(GestionDocumentosService.class).getExpedienteDomicilio(rfcEmpleado, domSecuencia, idDocto);

            // Actualiza registro
            tdExpDomicilioParticularDTO.setIdExpRechazo(expedienteDomicilioDTO.getRechazo());
            tdExpDomicilioParticularDTO.setIdStatus("REC");
            tdExpDomicilioParticularDTO.setUsuario(super.security().getUserName());
            tdExpDomicilioParticularDTO.setFecModifico(new Date());
            super.getService(GestionDocumentosService.class).saveAutorizaRechazaExpedienteDomicilio(tdExpDomicilioParticularDTO);

            super.saveMessage(model, "sireh.msg.oficinaVirtual.gestionDocumentos.altaDomicilio.rechazo.ok");
        } catch (Exception e) {
            logger.debug("Exception --------->" + e.toString());
            super.saveError(model, "sireh.msg.oficinaVirtual.gestionDocumentos.altaDomicilio.rechazo.error");
        }

        model.addAttribute(expedienteDomicilioDTO);
        return altaDomicilio(model, expedienteDomicilioDTO, tdEmpleadoDTO.getRfcEmpleado());
    }

        /**
     * Eliminar - Datos de domicilio
     * @author Gualberto G.
     * @param model Model
     * @param expedienteDomicilioDTO ExpedienteDomicilioDTO
     * @return String
     */
    @RequestMapping
    public String eliminarDomicilio(Model model, ExpedienteDomicilioDTO expedienteDomicilioDTO){
         String[] datosExpedienteDomicilio = expedienteDomicilioDTO.getDocGrupo();
         String rfcEmpleado = null;
         String idDocto = null;
         Integer rfcSecuencia = 0;


         if (datosExpedienteDomicilio != null && datosExpedienteDomicilio.length > 0) {
             String expedienteDomicilio = datosExpedienteDomicilio[0];

             if (expedienteDomicilio != null && !expedienteDomicilio.equals("")) {
                 String[] result = expedienteDomicilio.split("\\|");
                 rfcEmpleado = result[0];
                 idDocto = result[1];
                 rfcSecuencia = new Integer(result[2]);

                super.getService(GestionDocumentosService.class).deleteFileExpediente(result[3]);
                
                TdExpDomicilioParticularDTO tdExpDomicilioParticularDTO = new TdExpDomicilioParticularDTO();
                tdExpDomicilioParticularDTO.setRfcEmpleado(rfcEmpleado);
                tdExpDomicilioParticularDTO.setDomSecuencia(rfcSecuencia);
                tdExpDomicilioParticularDTO.setIdDocto(idDocto);
                super.getService(GestionDocumentosService.class).deleteExpedienteDomicilio(tdExpDomicilioParticularDTO);
                super.saveMessage(model, "sireh.msg.oficinaVirtual.gestionDocumentos.altaDomicilio.eliminacion.ok", result[3]);
             }
         }
         
        model.addAttribute(expedienteDomicilioDTO);
        return altaDomicilio(model, expedienteDomicilioDTO, rfcEmpleado);

    }

    /******************************************************************************************************************************************************************************/

    // TODO: Dependientes economicos
    /**
     * Alta y/o modificación de familiares, dependientes o beneficiarios
     * @author Oscar S.
     * @param model Model
     * @param expedienteDependientesDTO ExpedienteDependientesDTO
     * @param rfcEmpleado String
     * @return String
     */
    @RequestMapping
    public String altaDependientes(Model model, ExpedienteDependientesDTO expedienteDependientesDTO, @RequestParam("rfcEmpleado") String rfcEmpleado) {
        if (expedienteDependientesDTO.isCancel()) {
            expedienteDependientesDTO = new ExpedienteDependientesDTO();
        }
        
        if (rfcEmpleado != null && !rfcEmpleado.equals("")) {
            // Datos del empleado
            TdEmpleadoDTO tdEmpleadoDTO = super.getService(GestionDocumentosService.class).getEmpleado(rfcEmpleado);
            expedienteDependientesDTO.setNombreEmpleadoCompleto(tdEmpleadoDTO.getNombreEmpleado() + " " + 
                                                               (tdEmpleadoDTO.getPrimerApellido() == null ? "" : tdEmpleadoDTO.getPrimerApellido()) + " " + 
                                                               (tdEmpleadoDTO.getSegundoApellido() == null ? "" : tdEmpleadoDTO.getSegundoApellido()));

            // Navegacion
            expedienteDependientesDTO.setUrlOrigen("altaDependientes");
            expedienteDependientesDTO.setUrlDestino("saveDependientes");
            expedienteDependientesDTO.setBeanName("busqueda-altaDependientes");
            expedienteDependientesDTO.setRfcEmpleadoBusqueda(rfcEmpleado);

            List roles = super.security().getRoles();
            for (Object rol: roles) {
                logger.debug("Roles ---------->" + (String)rol);
            }

            // Verificar si existen previamente documentos registrados
            Integer docRegistrados = super.getService(GestionDocumentosService.class).getTotalExpedienteDependientes(rfcEmpleado, "REG");
            logger.debug("Documentos registrados ---------->" + docRegistrados);
            expedienteDependientesDTO.setTotalRegistrados(docRegistrados);

            Integer docRechazados = super.getService(GestionDocumentosService.class).getTotalExpedienteDependientes(rfcEmpleado, "REC");
            logger.debug("Documentos rechazados ---------->" + docRechazados);
            expedienteDependientesDTO.setTotalRechazados(docRechazados);

            // Dimensiones Registrar
            if (super.security().isUserAuthorized(SECURITY_ROL_REG)) {
                expedienteDependientesDTO.setRolRegistrar(true);
            } else {
                expedienteDependientesDTO.setRolRegistrar(false);
            }

            // Dimensiones Autorizar/Rechazar
            if (super.security().isUserAuthorized(SECURITY_ROL_AUT)) {
                expedienteDependientesDTO.setRolAutorizar(true);
                expedienteDependientesDTO.setRolRechazar(true);
            } else {
                expedienteDependientesDTO.setRolAutorizar(false);
                expedienteDependientesDTO.setRolRechazar(false);
            }
        } else {
            super.saveError(model, "No se encontró el empleado solicitado. Por favor verifique.");
            ExpedienteDocEmpleadoDTO expedienteDocEmpleadoDTO = new ExpedienteDocEmpleadoDTO();
            expedienteDocEmpleadoDTO.setRfcEmpleado("");
            return busquedaDocEmpleado(model, expedienteDocEmpleadoDTO);
        }
        model.addAttribute(expedienteDependientesDTO);
        return super.getViewName("altaDependientes");
    }

    /**
     * Registro - Alta y/o modificación de familiares, dependientes o beneficiarios
     * @author Oscar S.
     * @param model Model
     * @param expedienteDependientesDTO ExpedienteDependientesDTO
     * @return String
     */
    @RequestMapping
    public String saveDependientes(Model model, ExpedienteDependientesDTO expedienteDependientesDTO) {
        // Datos del empleado
        TdEmpleadoDTO tdEmpleadoDTO = super.getService(GestionDocumentosService.class).getEmpleado(expedienteDependientesDTO.getRfcEmpleadoBusqueda());

        try {
            Integer parentesco = super.getService(GestionDocumentosService.class).verificaParentescoExpedienteDependientes(expedienteDependientesDTO.getRfcEmpleadoBusqueda(), expedienteDependientesDTO.getParentesco());
            logger.debug("parentesco --------->" + parentesco);

            /*if (parentesco > 0) {
                super.saveWarning(model, "sireh.msg.oficinaVirtual.gestionDocumentos.altaDependientes.verificaParentesco");
            } else {*/
            // Inicializa datos del documento
            String idFile = null;
            expedienteDependientesDTO.setName(expedienteDependientesDTO.getDocumentoSoporte().getOriginalFilename());
            expedienteDependientesDTO.setData(expedienteDependientesDTO.getDocumentoSoporte().getInputStream());
            // META-INDEX
            expedienteDependientesDTO.setRfcMeta(expedienteDependientesDTO.getRfcEmpleadoBusqueda());
            expedienteDependientesDTO.setDocMeta(COD_FAM);
            // Descripcion del archivo
            expedienteDependientesDTO.setDescripcion(expedienteDependientesDTO.getRfcEmpleadoBusqueda() + " - Alta y/o modificación de familiares, dependientes o beneficiarios");

            String[] datosExpedienteDependientes = expedienteDependientesDTO.getDocGrupo();
            String rfcEmpleado = null;
            String idDocto = null;
            Integer fdbSecuencia = 0;

            // Actualizar registro
            if (datosExpedienteDependientes != null && datosExpedienteDependientes.length > 0) {
                String expedienteDependientes = datosExpedienteDependientes[0];

                if (expedienteDependientes != null && !expedienteDependientes.equals("")) {
                    String[] result = expedienteDependientes.split("\\|");
                    rfcEmpleado = result[0];
                    idDocto = result[1];
                    fdbSecuencia = new Integer(result[2]);

                    super.getService(GestionDocumentosService.class).deleteFileExpediente(result[3]);

                    TdExpFamiliarDepsBenefDTO tdExpFamiliarDepsBenefDTO = new TdExpFamiliarDepsBenefDTO();
                    tdExpFamiliarDepsBenefDTO.setRfcEmpleado(rfcEmpleado);
                    tdExpFamiliarDepsBenefDTO.setFdbSecuencia(fdbSecuencia);
                    tdExpFamiliarDepsBenefDTO.setIdDocto(idDocto);
                    super.getService(GestionDocumentosService.class).deleteExpedienteDependientes(tdExpFamiliarDepsBenefDTO);
                }
            }

            // Guardar documento
            idFile = super.getService(GestionDocumentosService.class).saveFileExpediente(expedienteDependientesDTO, expedienteDependientesDTO.isRollback());
            logger.debug("Documento --------->" + idFile);

            // Guardar registro
            TdExpFamiliarDepsBenefDTO tdExpFamiliarDepsBenefDTO = new TdExpFamiliarDepsBenefDTO();
            tdExpFamiliarDepsBenefDTO.setRfcEmpleado(expedienteDependientesDTO.getRfcEmpleadoBusqueda());
            tdExpFamiliarDepsBenefDTO.setIdDocto(COD_FAM);
            
            tdExpFamiliarDepsBenefDTO.setFdbNombreEmpleado(expedienteDependientesDTO.getNombreEmpleado());
            tdExpFamiliarDepsBenefDTO.setFdbPrimerApellido(expedienteDependientesDTO.getPrimerApellido());
            tdExpFamiliarDepsBenefDTO.setFdbSegundoApellido(expedienteDependientesDTO.getSegundoApellido());
            tdExpFamiliarDepsBenefDTO.setFdbFechaNacimiento(expedienteDependientesDTO.getFecNacimiento());
            tdExpFamiliarDepsBenefDTO.setIdParentesco(expedienteDependientesDTO.getParentesco());
            tdExpFamiliarDepsBenefDTO.setIdNivelEscolar(expedienteDependientesDTO.getNivelEscolar());
            tdExpFamiliarDepsBenefDTO.setFdbPromedio(expedienteDependientesDTO.getPromedioEscolar());
            tdExpFamiliarDepsBenefDTO.setIdGenero(expedienteDependientesDTO.getGenero());

            tdExpFamiliarDepsBenefDTO.setFdbDoctoRef(idFile);
            tdExpFamiliarDepsBenefDTO.setIdStatus("REG");
            tdExpFamiliarDepsBenefDTO.setIdExpRechazo(STATUS_SIN_RECHAZO);
            tdExpFamiliarDepsBenefDTO.setUsuario(super.security().getUserName());
            tdExpFamiliarDepsBenefDTO.setFecModifico(new Date());
            super.getService(GestionDocumentosService.class).saveExpedienteDependientes(tdExpFamiliarDepsBenefDTO);

            // Reiniciar expedienteDependientesDTO
            expedienteDependientesDTO = new ExpedienteDependientesDTO();
            expedienteDependientesDTO.setNombreEmpleadoCompleto(tdEmpleadoDTO.getNombreEmpleado() + " " + tdEmpleadoDTO.getPrimerApellido() + " " + tdEmpleadoDTO.getSegundoApellido());

            // Navegacion
            expedienteDependientesDTO.setUrlOrigen("altaDependientes");
            expedienteDependientesDTO.setUrlDestino("saveDependientes");
            expedienteDependientesDTO.setBeanName("busqueda-altaDependientes");
            expedienteDependientesDTO.setRfcEmpleadoBusqueda(tdEmpleadoDTO.getRfcEmpleado());

            super.saveMessage(model, "sireh.msg.oficinaVirtual.gestionDocumentos.altaDependientes.ok");

        } catch (Exception e) {
            logger.debug("Exception --------->" + e.toString());
            super.saveError(model, "sireh.msg.oficinaVirtual.gestionDocumentos.altaDependientes.error");
        }

        model.addAttribute(expedienteDependientesDTO);
        return altaDependientes(model, expedienteDependientesDTO, tdEmpleadoDTO.getRfcEmpleado());
    }

    /**
     * Autorizacion - Alta y/o modificación de familiares, dependientes o beneficiarios
     * @author Oscar S.
     * @param model Model
     * @param expedienteDependientesDTO ExpedienteDependientesDTO
     * @return String
     */
    @RequestMapping
    public String autorizaAltaDependientes(Model model, ExpedienteDependientesDTO expedienteDependientesDTO) {
        // Datos del empleado
        TdEmpleadoDTO tdEmpleadoDTO = super.getService(GestionDocumentosService.class).getEmpleado(expedienteDependientesDTO.getRfcEmpleadoBusqueda());

        try {
            // Obtener datos del registro seleccionado
            String[] datosExpedienteDependientes = expedienteDependientesDTO.getDocGrupo();
            String rfcEmpleado = null;
            String idDocto = null;
            Integer rfcSecuencia = 0;

            if (datosExpedienteDependientes.length > 0) {
                for (String expedienteDependientes: datosExpedienteDependientes) {
                    if (expedienteDependientes != null && !expedienteDependientes.equals("")) {
                        String[] result = expedienteDependientes.split("\\|");
                        rfcEmpleado = result[0];
                        idDocto = result[1];
                        rfcSecuencia = new Integer(result[2]);
                    }
                }
            }

            // Documentos activos-historico
            //super.getService(GestionDocumentosService.class).updateActivosToHistoricoExpedienteDependientes(rfcEmpleado);

            // Obtener datos del depediente
            TdExpFamiliarDepsBenefDTO tdExpFamiliarDepsBenefDTO = super.getService(GestionDocumentosService.class).getExpedienteDependientes(rfcEmpleado, rfcSecuencia, idDocto);

            // Actualiza registro
            tdExpFamiliarDepsBenefDTO.setIdExpRechazo(STATUS_SIN_RECHAZO);
            tdExpFamiliarDepsBenefDTO.setIdStatus("ACT");
            tdExpFamiliarDepsBenefDTO.setUsuario(super.security().getUserName());
            tdExpFamiliarDepsBenefDTO.setFecModifico(new Date());
            super.getService(GestionDocumentosService.class).saveAutorizaRechazaExpedienteDependientes(tdExpFamiliarDepsBenefDTO);

            super.saveMessage(model, "sireh.msg.oficinaVirtual.gestionDocumentos.altaDependientes.autorizacion.ok");
        } catch (Exception e) {
            logger.debug("Exception --------->" + e.toString());
            super.saveError(model, "sireh.msg.oficinaVirtual.gestionDocumentos.altaDependientes.autorizacion.error");
        }

        model.addAttribute(expedienteDependientesDTO);
        return altaDependientes(model, expedienteDependientesDTO, tdEmpleadoDTO.getRfcEmpleado());
    }

    /**
     * Rechazo - Alta y/o modificación de familiares, dependientes o beneficiarios
     * @author Oscar S.
     * @param model Model
     * @param expedienteDependientesDTO ExpedienteDependientesDTO
     * @return String
     */
    @RequestMapping
    public String rechazaAltaDependientes(Model model, ExpedienteDependientesDTO expedienteDependientesDTO) {
        // Datos del empleado
        TdEmpleadoDTO tdEmpleadoDTO = super.getService(GestionDocumentosService.class).getEmpleado(expedienteDependientesDTO.getRfcEmpleadoBusqueda());

        try {
            // Obtener datos del registro seleccionado
            String[] datosExpedienteDependientes = expedienteDependientesDTO.getDocGrupo();
            String rfcEmpleado = null;
            String idDocto = null;
            Integer rfcSecuencia = 0;

            if (datosExpedienteDependientes.length > 0) {
                for (String expedienteDependientes: datosExpedienteDependientes) {
                    if (expedienteDependientes != null && !expedienteDependientes.equals("")) {
                        String[] result = expedienteDependientes.split("\\|");
                        rfcEmpleado = result[0];
                        idDocto = result[1];
                        rfcSecuencia = new Integer(result[2]);
                    }
                }
            }

            // Obtener datos del depediente
            TdExpFamiliarDepsBenefDTO tdExpFamiliarDepsBenefDTO = super.getService(GestionDocumentosService.class).getExpedienteDependientes(rfcEmpleado, rfcSecuencia, idDocto);

            // Actualiza registro
            tdExpFamiliarDepsBenefDTO.setIdExpRechazo(expedienteDependientesDTO.getRechazo());
            tdExpFamiliarDepsBenefDTO.setIdStatus("REC");
            tdExpFamiliarDepsBenefDTO.setUsuario(super.security().getUserName());
            tdExpFamiliarDepsBenefDTO.setFecModifico(new Date());
            super.getService(GestionDocumentosService.class).saveAutorizaRechazaExpedienteDependientes(tdExpFamiliarDepsBenefDTO);

            super.saveMessage(model, "sireh.msg.oficinaVirtual.gestionDocumentos.altaDependientes.rechazo.ok");
        } catch (Exception e) {
            logger.debug("Exception --------->" + e.toString());
            super.saveError(model, "sireh.msg.oficinaVirtual.gestionDocumentos.altaDependientes.rechazo.error");
        }

        model.addAttribute(expedienteDependientesDTO);
        return altaDependientes(model, expedienteDependientesDTO, tdEmpleadoDTO.getRfcEmpleado());
    }

        /**
     * Eliminar - Alta de datos de nacimiento
     * @author Gualberto G.
     * @param model Model
     * @param expedienteDependientesDTO ExpedienteDependientesDTO
     * @return String
     */
    @RequestMapping
    public String eliminarDependientes(Model model, ExpedienteDependientesDTO expedienteDependientesDTO){
         String[] datosExpedienteDependientes = expedienteDependientesDTO.getDocGrupo();
         String rfcEmpleado = null;
         String idDocto = null;
         Integer rfcSecuencia = 0;


         if (datosExpedienteDependientes != null && datosExpedienteDependientes.length > 0) {
             String expedienteDependientes = datosExpedienteDependientes[0];

             if (expedienteDependientes != null && !expedienteDependientes.equals("")) {
                 String[] result = expedienteDependientes.split("\\|");
                 rfcEmpleado = result[0];
                 idDocto = result[1];
                 rfcSecuencia = new Integer(result[2]);

                super.getService(GestionDocumentosService.class).deleteFileExpediente(result[3]);

                TdExpFamiliarDepsBenefDTO tdExpFamiliarDepsBenefDTO = new TdExpFamiliarDepsBenefDTO();
                tdExpFamiliarDepsBenefDTO.setRfcEmpleado(rfcEmpleado);
                tdExpFamiliarDepsBenefDTO.setFdbSecuencia(rfcSecuencia);
                tdExpFamiliarDepsBenefDTO.setIdDocto(idDocto);
                super.getService(GestionDocumentosService.class).deleteExpedienteDependientes(tdExpFamiliarDepsBenefDTO);
                super.saveMessage(model, "sireh.msg.oficinaVirtual.gestionDocumentos.altaDependientes.eliminacion.ok", result[3]);
             }
         }
         
        model.addAttribute(expedienteDependientesDTO);
        return altaDependientes(model, expedienteDependientesDTO, rfcEmpleado);

    }

    /******************************************************************************************************************************************************************************/

    // TODO: Designacion beneficiarios
    /**
     * Designación - Búsqueda de familiares, dependientes o beneficiarios
     * @author Oscar S.
     * @param model Model
     * @param expedienteDepBenefDTO ExpedienteDepBenefDTO
     * @param rfcEmpleado String
     * @return String
     */
    @RequestMapping
    public String altaDepBenef(Model model, ExpedienteDepBenefDTO expedienteDepBenefDTO, @RequestParam("rfcEmpleado") String rfcEmpleado) {
        if (expedienteDepBenefDTO.isClean()) {
            expedienteDepBenefDTO = new ExpedienteDepBenefDTO();
        }
        
        if (rfcEmpleado != null && !rfcEmpleado.equals("")) {
            // Datos del empleado
            TdEmpleadoDTO tdEmpleadoDTO = super.getService(GestionDocumentosService.class).getEmpleado(rfcEmpleado);
            expedienteDepBenefDTO.setNombreEmpleadoCompleto(tdEmpleadoDTO.getNombreEmpleado() + " " + 
                                                           (tdEmpleadoDTO.getPrimerApellido() == null ? "" : tdEmpleadoDTO.getPrimerApellido()) + " " + 
                                                           (tdEmpleadoDTO.getSegundoApellido() == null ? "" : tdEmpleadoDTO.getSegundoApellido()));

            // Navegacion
            expedienteDepBenefDTO.setUrlOrigen("altaDepBenef");
            expedienteDepBenefDTO.setUrlDestino("saveDepBenef");
            expedienteDepBenefDTO.setBeanName1("busqueda-altaDependientesActivos");
            expedienteDepBenefDTO.setBeanName2("busqueda-altaDepBenef");
            expedienteDepBenefDTO.setRfcEmpleadoBusqueda(rfcEmpleado);

            List roles = super.security().getRoles();
            for (Object rol: roles) {
                logger.debug("Roles ---------->" + (String)rol);
            }

            // Verificar si existen previamente documentos registrados
            Integer docRegistrados = super.getService(GestionDocumentosService.class).getTotalRegistradosExpedienteDepBenef(rfcEmpleado);
            expedienteDepBenefDTO.setTotalRegistrados(docRegistrados);
            logger.debug("Documentos registrados ---------->" + docRegistrados);
            Integer docRechazados = super.getService(GestionDocumentosService.class).getTotalRechazadosExpedienteDepBenef(rfcEmpleado);
            expedienteDepBenefDTO.setTotalRechazados(docRechazados);
            logger.debug("Documentos rechazados ---------->" + docRechazados);

            // Dimensiones Registrar
            if (super.security().isUserAuthorized(SECURITY_ROL_REG)) {
                expedienteDepBenefDTO.setRegistrar(true);
            } else {
                expedienteDepBenefDTO.setRegistrar(false);
            }

            // Dimensiones Autorizar/Rechazar
            if ((super.security().isUserAuthorized(SECURITY_ROL_AUT))) {
                expedienteDepBenefDTO.setAutorizar(true);
                expedienteDepBenefDTO.setRechazar(true);
            } else {
                expedienteDepBenefDTO.setAutorizar(false);
                expedienteDepBenefDTO.setRechazar(false);
            }
        } else {
            super.saveError(model, "No se encontró el empleado solicitado. Por favor verifique.");
            ExpedienteDocEmpleadoDTO expedienteDocEmpleadoDTO = new ExpedienteDocEmpleadoDTO();
            expedienteDocEmpleadoDTO.setRfcEmpleado("");
            return busquedaDocEmpleado(model, expedienteDocEmpleadoDTO);
        }
        model.addAttribute(expedienteDepBenefDTO);
        return super.getViewName("altaDepBenef");
    }

    /**
     * Registro - Designación - Búsqueda de familiares, dependientes o beneficiarios
     * @author Oscar S.
     * @param model Model
     * @param expedienteDepBenefDTO ExpedienteDepBenefDTO
     * @return String
     */
    @RequestMapping
    public String saveDepBenef(Model model, ExpedienteDepBenefDTO expedienteDepBenefDTO) {
        // Datos del empleado
        TdEmpleadoDTO tdEmpleadoDTO = super.getService(GestionDocumentosService.class).getEmpleado(expedienteDepBenefDTO.getRfcEmpleadoBusqueda());

        try {
            // Inicializa datos del documento
            String idFile = null;
            expedienteDepBenefDTO.setName(expedienteDepBenefDTO.getDocumentoSoporte().getOriginalFilename());
            expedienteDepBenefDTO.setData(expedienteDepBenefDTO.getDocumentoSoporte().getInputStream());
            // META-INDEX
            expedienteDepBenefDTO.setRfcMeta(expedienteDepBenefDTO.getRfcEmpleadoBusqueda());
            expedienteDepBenefDTO.setDocMeta(COD_BEN);
            // Descripcion del archivo
            expedienteDepBenefDTO.setDescripcion(expedienteDepBenefDTO.getRfcEmpleadoBusqueda() + " - Busqueda de familiares, dependientes o beneficiarios");
            String[] datosExpedienteDependientes = null;
            TdExpFamiliarDepsBenefDTO tdExpFamiliarDepsBenefDTO = null;
            
            if(!(expedienteDepBenefDTO.getEstado() != null && expedienteDepBenefDTO.getEstado().equals("RECHAZADO"))){
                // Obtener datos del dependiente seleccionado
                datosExpedienteDependientes = expedienteDepBenefDTO.getDocGrupo1();
                String rfcEmpleado1 = null;
                String idDocto1 = null;
                Integer rfcSecuencia1 = 0;
    
                if (datosExpedienteDependientes.length > 0) {
                    for (String expedienteDependientes: datosExpedienteDependientes) {
                        if (expedienteDependientes != null && !expedienteDependientes.equals("")) {
                            String[] result = expedienteDependientes.split("\\|");
                            rfcEmpleado1 = result[0];
                            idDocto1 = result[1];
                            rfcSecuencia1 = new Integer(result[2]);
                        }
                    }
                }
    
                // Obtener datos del depediente
                tdExpFamiliarDepsBenefDTO = super.getService(GestionDocumentosService.class).getExpedienteDependientes(rfcEmpleado1, rfcSecuencia1, idDocto1);
            }
            // Obtener datos del beneficiario seleccionado
            String[] datosExpedienteDepBenef = expedienteDepBenefDTO.getDocGrupo2();
            String rfcEmpleado2 = null;
            String idDocto2 = null;
            Integer benSecuencia2 = 0;
            String benNombreEmpleado = null;
            String benPrimerApellido = null;
            String benSegundoApellido = null;
            Integer benIdParentesco = null;
            // Actualizar registro
            if (datosExpedienteDepBenef != null && datosExpedienteDepBenef.length > 0) {
                String expedienteDepBenef = datosExpedienteDepBenef[0];

                if (expedienteDepBenef != null && !expedienteDepBenef.equals("")) {
                    String[] result = expedienteDepBenef.split("\\|");
                    rfcEmpleado2 = result[0];
                    idDocto2 = result[1];
                    benSecuencia2 = new Integer(result[2]);
                    benNombreEmpleado = result[4];
                    benPrimerApellido = result[5];
                    benSegundoApellido = result[6];
                    benIdParentesco = Integer.valueOf(result[7]);

                    super.getService(GestionDocumentosService.class).deleteFileExpediente(result[3]);

                    TdExpBeneficiarioDTO tdExpBeneficiarioDTO = new TdExpBeneficiarioDTO();
                    tdExpBeneficiarioDTO.setRfcEmpleado(rfcEmpleado2);
                    tdExpBeneficiarioDTO.setBenSecuencia(benSecuencia2);
                    tdExpBeneficiarioDTO.setIdDocto(idDocto2);
                    super.getService(GestionDocumentosService.class).deleteExpedienteDepBenef(tdExpBeneficiarioDTO);
                }
            }

            // Guardar documento
            idFile = super.getService(GestionDocumentosService.class).saveFileExpediente(expedienteDepBenefDTO, expedienteDepBenefDTO.isRollback());

            // Guardar registro
            TdExpBeneficiarioDTO tdExpBeneficiarioDTO = new TdExpBeneficiarioDTO();
            tdExpBeneficiarioDTO.setRfcEmpleado(expedienteDepBenefDTO.getRfcEmpleadoBusqueda());
            tdExpBeneficiarioDTO.setIdDocto(COD_BEN);
            
            if(expedienteDepBenefDTO.getEstado() != null && expedienteDepBenefDTO.getEstado().equals("RECHAZADO")){
                tdExpBeneficiarioDTO.setBenNombreEmpleado(benNombreEmpleado);
                tdExpBeneficiarioDTO.setBenPrimerApellido(benPrimerApellido );
                tdExpBeneficiarioDTO.setBenSegundoApellido(benSegundoApellido );
                tdExpBeneficiarioDTO.setIdParentesco(benIdParentesco);
            } else {
                tdExpBeneficiarioDTO.setBenNombreEmpleado(tdExpFamiliarDepsBenefDTO.getFdbNombreEmpleado());
                tdExpBeneficiarioDTO.setBenPrimerApellido(tdExpFamiliarDepsBenefDTO.getFdbPrimerApellido());
                tdExpBeneficiarioDTO.setBenSegundoApellido(tdExpFamiliarDepsBenefDTO.getFdbSegundoApellido());
                tdExpBeneficiarioDTO.setIdParentesco(tdExpFamiliarDepsBenefDTO.getIdParentesco());

            }
            tdExpBeneficiarioDTO.setIdTipoBeneficio(expedienteDepBenefDTO.getTipoBeneficiario());
            tdExpBeneficiarioDTO.setBenPorcentaje(expedienteDepBenefDTO.getPorcentaje());
            tdExpBeneficiarioDTO.setBenImporte(expedienteDepBenefDTO.getImporte());

            tdExpBeneficiarioDTO.setBenDoctoRef(idFile);
            tdExpBeneficiarioDTO.setIdStatus("REG");
            tdExpBeneficiarioDTO.setIdExpRechazo(STATUS_SIN_RECHAZO);
            tdExpBeneficiarioDTO.setUsuario(super.security().getUserName());
            tdExpBeneficiarioDTO.setFecModifico(new Date());
            super.getService(GestionDocumentosService.class).saveExpedienteDepBenef(tdExpBeneficiarioDTO);

            // Reiniciar expedienteRfcDTO
            expedienteDepBenefDTO = new ExpedienteDepBenefDTO();
            expedienteDepBenefDTO.setNombreEmpleadoCompleto(tdEmpleadoDTO.getNombreEmpleado() + " " + tdEmpleadoDTO.getPrimerApellido() + " " + tdEmpleadoDTO.getSegundoApellido());

            // Navegacion
            expedienteDepBenefDTO.setUrlOrigen("altaDepBenef");
            expedienteDepBenefDTO.setUrlDestino("saveDepBenef");
            expedienteDepBenefDTO.setBeanName1("busqueda-altaDependientesActivos");
            expedienteDepBenefDTO.setBeanName2("busqueda-altaDepBenef");
            expedienteDepBenefDTO.setRfcEmpleadoBusqueda(tdEmpleadoDTO.getRfcEmpleado());

            super.saveMessage(model, "sireh.msg.oficinaVirtual.gestionDocumentos.altaDepBenef.ok", idFile);
        } catch (Exception e) {
            logger.debug("Exception --------->" + e.toString());
            super.saveError(model, "sireh.msg.oficinaVirtual.gestionDocumentos.altaDepBenef.error");
        }

        model.addAttribute(expedienteDepBenefDTO);
        return altaDepBenef(model, expedienteDepBenefDTO, tdEmpleadoDTO.getRfcEmpleado());
    }

    /**
     * Autorizacion - Designación - Búsqueda de familiares, dependientes o beneficiarios
     * @author Oscar S.
     * @param model Model
     * @param expedienteDepBenefDTO ExpedienteDepBenefDTO
     * @return String
     */
    @RequestMapping
    public String autorizaAltaDepBenef(Model model, ExpedienteDepBenefDTO expedienteDepBenefDTO) {
        // Datos del empleado
        TdEmpleadoDTO tdEmpleadoDTO = super.getService(GestionDocumentosService.class).getEmpleado(expedienteDepBenefDTO.getRfcEmpleadoBusqueda());

        try {
            // Obtener datos del registro seleccionado
            String[] datosExpedienteDependientes = expedienteDepBenefDTO.getDocGrupo2();
            String rfcEmpleado = null;
            String idDocto = null;
            Integer rfcSecuencia = 0;

            if (datosExpedienteDependientes.length > 0) {
                for (String expedienteDependientes: datosExpedienteDependientes) {
                    if (expedienteDependientes != null && !expedienteDependientes.equals("")) {
                        String[] result = expedienteDependientes.split("\\|");
                        rfcEmpleado = result[0];
                        idDocto = result[1];
                        rfcSecuencia = new Integer(result[2]);
                    }
                }
            }

            // Documentos activos-historico
            //super.getService(GestionDocumentosService.class).updateActivosToHistoricoExpedienteDepBenef(rfcEmpleado);

            // Obtener datos del depediente
            TdExpBeneficiarioDTO tdExpBeneficiarioDTO = super.getService(GestionDocumentosService.class).getExpedienteDepBenef(rfcEmpleado, rfcSecuencia, idDocto);

            // Actualiza registro
            tdExpBeneficiarioDTO.setIdExpRechazo(STATUS_SIN_RECHAZO);
            tdExpBeneficiarioDTO.setIdStatus("ACT");
            tdExpBeneficiarioDTO.setUsuario(super.security().getUserName());
            tdExpBeneficiarioDTO.setFecModifico(new Date());
            super.getService(GestionDocumentosService.class).saveAutorizaRechazaExpedienteDepBenef(tdExpBeneficiarioDTO);

            super.saveMessage(model, "sireh.msg.oficinaVirtual.gestionDocumentos.altaDepBenef.autorizacion.ok");
        } catch (Exception e) {
            logger.debug("Exception --------->" + e.toString());
            super.saveError(model, "sireh.msg.oficinaVirtual.gestionDocumentos.altaDepBenef.autorizacion.error");
        }

        model.addAttribute(expedienteDepBenefDTO);
        return altaDepBenef(model, expedienteDepBenefDTO, tdEmpleadoDTO.getRfcEmpleado());
    }

    /**
     * Rechazo - Designación - Búsqueda de familiares, dependientes o beneficiarios
     * @author Oscar S.
     * @param model Model
     * @param expedienteDepBenefDTO ExpedienteDepBenefDTO
     * @return String
     */
    @RequestMapping
    public String rechazaAltaDepBenef(Model model, ExpedienteDepBenefDTO expedienteDepBenefDTO) {
        // Datos del empleado
        TdEmpleadoDTO tdEmpleadoDTO = super.getService(GestionDocumentosService.class).getEmpleado(expedienteDepBenefDTO.getRfcEmpleadoBusqueda());

        try {
            // Obtener datos del registro seleccionado
            String[] datosExpedienteDependientes = expedienteDepBenefDTO.getDocGrupo2();
            String rfcEmpleado = null;
            String idDocto = null;
            Integer rfcSecuencia = 0;

            if (datosExpedienteDependientes.length > 0) {
                for (String expedienteDependientes: datosExpedienteDependientes) {
                    if (expedienteDependientes != null && !expedienteDependientes.equals("")) {
                        String[] result = expedienteDependientes.split("\\|");
                        rfcEmpleado = result[0];
                        idDocto = result[1];
                        rfcSecuencia = new Integer(result[2]);
                    }
                }
            }

            // Obtener datos del depediente
            TdExpBeneficiarioDTO tdExpBeneficiarioDTO = super.getService(GestionDocumentosService.class).getExpedienteDepBenef(rfcEmpleado, rfcSecuencia, idDocto);

            // Actualiza registro
            tdExpBeneficiarioDTO.setIdExpRechazo(expedienteDepBenefDTO.getRechazo());
            tdExpBeneficiarioDTO.setIdStatus("REC");
            tdExpBeneficiarioDTO.setUsuario(super.security().getUserName());
            tdExpBeneficiarioDTO.setFecModifico(new Date());
            super.getService(GestionDocumentosService.class).saveAutorizaRechazaExpedienteDepBenef(tdExpBeneficiarioDTO);

            super.saveMessage(model, "sireh.msg.oficinaVirtual.gestionDocumentos.altaDepBenef.rechazo.ok");
        } catch (Exception e) {
            logger.debug("Exception --------->" + e.toString());
            super.saveError(model, "sireh.msg.oficinaVirtual.gestionDocumentos.altaDepBenef.rechazo.error");
        }

        model.addAttribute(expedienteDepBenefDTO);
        return altaDepBenef(model, expedienteDepBenefDTO, tdEmpleadoDTO.getRfcEmpleado());
    }

    /******************************************************************************************************************************************************************************/

    // TODO: Cuentas bancarias
    /**
     * Alta de cuentas bancarias
     * @author Cesar B.
     * @param model Model
     * @param expedienteCuentasBancariasDTO ExpedienteCuentasBancariasDTO
     * @param rfcEmpleado String
     * @return String
     */
    @RequestMapping
    public String altaCuentasBancarias(Model model, ExpedienteCuentasBancariasDTO expedienteCuentasBancariasDTO, @RequestParam("rfcEmpleado") String rfcEmpleado) {
        if (expedienteCuentasBancariasDTO.isCancel()) {
            expedienteCuentasBancariasDTO = new ExpedienteCuentasBancariasDTO();
        }
        
        if (rfcEmpleado != null && !rfcEmpleado.equals("")) {
            // Datos del empleado
            TdEmpleadoDTO tdEmpleadoDTO = super.getService(GestionDocumentosService.class).getEmpleado(rfcEmpleado);
            expedienteCuentasBancariasDTO.setNombreEmpleadoCompleto(tdEmpleadoDTO.getNombreEmpleado() + " " + 
                                                                   (tdEmpleadoDTO.getPrimerApellido() == null ? "" : tdEmpleadoDTO.getPrimerApellido()) + " " + 
                                                                   (tdEmpleadoDTO.getSegundoApellido() == null ? "" : tdEmpleadoDTO.getSegundoApellido()));

            // Navegacion
            expedienteCuentasBancariasDTO.setUrlOrigen("altaCuentasBancarias");
            expedienteCuentasBancariasDTO.setUrlDestino("saveCuentasBancarias");
            expedienteCuentasBancariasDTO.setBeanName("busqueda-altaCuentasBancarias");
            expedienteCuentasBancariasDTO.setRfcEmpleadoBusqueda(rfcEmpleado);

            List roles = super.security().getRoles();
            for (Object rol: roles) {
                logger.debug("Roles ---------->" + (String)rol);
            }

            // Verificar si existen previamente documentos registrados
            Integer docRegistrados = super.getService(GestionDocumentosService.class).getTotalExpedienteCuentasBancarias(rfcEmpleado, "REG");
            logger.debug("Documentos registrados ---------->" + docRegistrados);
            expedienteCuentasBancariasDTO.setTotalRegistrados(docRegistrados);

            Integer docRechazados = super.getService(GestionDocumentosService.class).getTotalExpedienteCuentasBancarias(rfcEmpleado, "REC");
            logger.debug("Documentos rechazados ---------->" + docRechazados);
            expedienteCuentasBancariasDTO.setTotalRechazados(docRechazados);
            
            // Dimensiones Registrar
            if (super.security().isUserAuthorized(SECURITY_ROL_REG)) {
                expedienteCuentasBancariasDTO.setRolRegistrar(true);
            } else {
                expedienteCuentasBancariasDTO.setRolRegistrar(false);
            }

            // Dimensiones Autorizar/Rechazar
            if (super.security().isUserAuthorized(SECURITY_ROL_AUT)) {
                expedienteCuentasBancariasDTO.setRolAutorizar(true);
                expedienteCuentasBancariasDTO.setRolRechazar(true);
            } else {
                expedienteCuentasBancariasDTO.setRolAutorizar(false);
                expedienteCuentasBancariasDTO.setRolRechazar(false);
            }
        } else {
            super.saveError(model, "No se encontró el empleado solicitado. Por favor verifique.");
            ExpedienteDocEmpleadoDTO expedienteDocEmpleadoDTO = new ExpedienteDocEmpleadoDTO();
            expedienteDocEmpleadoDTO.setRfcEmpleado("");
            return busquedaDocEmpleado(model, expedienteDocEmpleadoDTO);
        }
        model.addAttribute(expedienteCuentasBancariasDTO);
        return super.getViewName("altaCuentasBancarias");
    }

    /**
     * Registro - Alta de cuentas bancarias
     * @author Cesar B.
     * @param model Model
     * @param expedienteCuentasBancariasDTO ExpedienteCuentasBancariasDTO
     * @return String
     */
    @RequestMapping
    public String saveCuentasBancarias(Model model, ExpedienteCuentasBancariasDTO expedienteCuentasBancariasDTO) {
        // Datos del empleado
        TdEmpleadoDTO tdEmpleadoDTO = super.getService(GestionDocumentosService.class).getEmpleado(expedienteCuentasBancariasDTO.getRfcEmpleadoBusqueda());

        if (expedienteCuentasBancariasDTO.isClean()) {
            expedienteCuentasBancariasDTO = new ExpedienteCuentasBancariasDTO();
        } else {
            try {
                // Inicializa datos del documento
                String idFile = null;
                expedienteCuentasBancariasDTO.setName(expedienteCuentasBancariasDTO.getDocumentoSoporte().getOriginalFilename());
                expedienteCuentasBancariasDTO.setData(expedienteCuentasBancariasDTO.getDocumentoSoporte().getInputStream());
                // META-INDEX
                expedienteCuentasBancariasDTO.setRfcMeta(expedienteCuentasBancariasDTO.getRfcEmpleadoBusqueda());
                expedienteCuentasBancariasDTO.setDocMeta(COD_CTA);
                // Descripcion del archivo
                expedienteCuentasBancariasDTO.setDescripcion(expedienteCuentasBancariasDTO.getRfcEmpleadoBusqueda() + " - Alta de cuentas bancarias");

                String[] datosExpedienteCuentasBancarias = expedienteCuentasBancariasDTO.getDocGrupo();
                String rfcEmpleado = null;
                String idDocto = null;
                Integer rfcSecuencia = 0;

                // Actualizar el documento
                if (datosExpedienteCuentasBancarias != null && datosExpedienteCuentasBancarias.length > 0) {
                    String expedienteCuentasBancarias = datosExpedienteCuentasBancarias[0];

                    if (expedienteCuentasBancarias != null && !expedienteCuentasBancarias.equals("")) {
                        String[] result = expedienteCuentasBancarias.split("\\|");
                        rfcEmpleado = result[0];
                        idDocto = result[1];
                        rfcSecuencia = new Integer(result[2]);

                        super.getService(GestionDocumentosService.class).deleteFileExpediente(result[3]);

                        TdExpCuentasBancariaDTO tdExpCuentasBancariaDTO = new TdExpCuentasBancariaDTO();
                        tdExpCuentasBancariaDTO.setRfcEmpleado(rfcEmpleado);
                        tdExpCuentasBancariaDTO.setCtaSecuencia(rfcSecuencia);
                        tdExpCuentasBancariaDTO.setIdDocto(idDocto);
                        super.getService(GestionDocumentosService.class).deleteExpedienteCuentasBancarias(tdExpCuentasBancariaDTO);
                    }
                }

                // Guardar documento
                idFile = super.getService(GestionDocumentosService.class).saveFileExpediente(expedienteCuentasBancariasDTO, expedienteCuentasBancariasDTO.isRollback());

                // Guardar registro
                TdExpCuentasBancariaDTO tdExpCuentasBancariaDTO = new TdExpCuentasBancariaDTO();
                tdExpCuentasBancariaDTO.setRfcEmpleado(expedienteCuentasBancariasDTO.getRfcEmpleadoBusqueda());
                tdExpCuentasBancariaDTO.setIdDocto(COD_CTA);
                
                tdExpCuentasBancariaDTO.setCtaTipo(expedienteCuentasBancariasDTO.getTipoCta());
                tdExpCuentasBancariaDTO.setIdBanco(expedienteCuentasBancariasDTO.getBanco());
                tdExpCuentasBancariaDTO.setCtaNumero(expedienteCuentasBancariasDTO.getNumCta() != null ? new BigDecimal(expedienteCuentasBancariasDTO.getNumCta()) : null);
                tdExpCuentasBancariaDTO.setCtaClabe(expedienteCuentasBancariasDTO.getClabe());

                tdExpCuentasBancariaDTO.setCtaDoctoRef(idFile);
                tdExpCuentasBancariaDTO.setIdStatus("REG");
                tdExpCuentasBancariaDTO.setIdExpRechazo(STATUS_SIN_RECHAZO);
                tdExpCuentasBancariaDTO.setUsuario(super.security().getUserName());
                tdExpCuentasBancariaDTO.setFecModifico(new Date());
                super.getService(GestionDocumentosService.class).saveExpedienteCuentasBancarias(tdExpCuentasBancariaDTO);

                // Reiniciar expedienteCuentasBancariasDTO
                expedienteCuentasBancariasDTO = new ExpedienteCuentasBancariasDTO();
                expedienteCuentasBancariasDTO.setNombreEmpleadoCompleto(tdEmpleadoDTO.getNombreEmpleado() + " " + tdEmpleadoDTO.getPrimerApellido() + " " + tdEmpleadoDTO.getSegundoApellido());

                // Navegacion
                expedienteCuentasBancariasDTO.setUrlOrigen("altaCuentasBancarias");
                expedienteCuentasBancariasDTO.setUrlDestino("saveCuentasBancarias");
                expedienteCuentasBancariasDTO.setBeanName("busqueda-altaCuentasBancarias");
                expedienteCuentasBancariasDTO.setRfcEmpleadoBusqueda(tdEmpleadoDTO.getRfcEmpleado());

                super.saveMessage(model, "sireh.msg.oficinaVirtual.gestionDocumentos.altaCuentasBancarias.ok", idFile);
            } catch (Exception e) {
                logger.debug("Exception --------->" + e.toString());
                super.saveError(model, "sireh.msg.oficinaVirtual.gestionDocumentos.altaCuentasBancarias.error");
            }
        }
        model.addAttribute(expedienteCuentasBancariasDTO);
        return altaCuentasBancarias(model, expedienteCuentasBancariasDTO, tdEmpleadoDTO.getRfcEmpleado());
    }

    /**
     * Autorizacion - Alta de cuentas bancarias
     * @author Cesar B.
     * @param model Model
     * @param expedienteCuentasBancariasDTO ExpedienteCuentasBancariasDTO
     * @return String
     */
    @RequestMapping
    public String autorizaAltaCuentasBancarias(Model model, ExpedienteCuentasBancariasDTO expedienteCuentasBancariasDTO) {
        // Datos del empleado
        TdEmpleadoDTO tdEmpleadoDTO = super.getService(GestionDocumentosService.class).getEmpleado(expedienteCuentasBancariasDTO.getRfcEmpleadoBusqueda());

        try {
            // Obtener datos del registro seleccionado
            String[] datosExpedienteRfc = expedienteCuentasBancariasDTO.getDocGrupo();
            String rfcEmpleado = null;
            String idDocto = null;
            Integer domSecuencia = 0;

            if (datosExpedienteRfc.length > 0) {
                for (String expedienteRfc: datosExpedienteRfc) {
                    if (expedienteRfc != null && !expedienteRfc.equals("")) {
                        String[] result = expedienteRfc.split("\\|");
                        rfcEmpleado = result[0];
                        idDocto = result[1];
                        domSecuencia = new Integer(result[2]);
                    }
                }
            }

            // Documentos activos-historico
            super.getService(GestionDocumentosService.class).updateActivosToHistoricoExpedienteCuentasBancarias(rfcEmpleado);

            // Obtener datos del domicilio
            TdExpCuentasBancariaDTO tdExpCuentasBancariaDTO = super.getService(GestionDocumentosService.class).getExpedienteCuentasBancarias(rfcEmpleado, domSecuencia, idDocto);

            // Actualiza registro
            tdExpCuentasBancariaDTO.setIdExpRechazo(STATUS_SIN_RECHAZO);
            tdExpCuentasBancariaDTO.setIdStatus("ACT");
            tdExpCuentasBancariaDTO.setUsuario(super.security().getUserName());
            tdExpCuentasBancariaDTO.setFecModifico(new Date());
            super.getService(GestionDocumentosService.class).saveAutorizaRechazaExpedienteCuentasBancarias(tdExpCuentasBancariaDTO);

            super.saveMessage(model, "sireh.msg.oficinaVirtual.gestionDocumentos.altaCuentasBancarias.autorizacion.ok");
        } catch (Exception e) {
            logger.debug("Exception --------->" + e.toString());
            super.saveError(model, "sireh.msg.oficinaVirtual.gestionDocumentos.altaCuentasBancarias.autorizacion.error");
        }

        model.addAttribute(expedienteCuentasBancariasDTO);
        return altaCuentasBancarias(model, expedienteCuentasBancariasDTO, tdEmpleadoDTO.getRfcEmpleado());
    }

    /**
     * Rechazo - Alta de cuentas bancarias
     * @author Cesar B.
     * @param model Model
     * @param expedienteCuentasBancariasDTO ExpedienteCuentasBancariasDTO
     * @return String
     */
    @RequestMapping
    public String rechazaAltaCuentasBancarias(Model model, ExpedienteCuentasBancariasDTO expedienteCuentasBancariasDTO) {
        // Datos del empleado
        TdEmpleadoDTO tdEmpleadoDTO = super.getService(GestionDocumentosService.class).getEmpleado(expedienteCuentasBancariasDTO.getRfcEmpleadoBusqueda());

        try {
            // Obtener datos del registro seleccionado
            String[] datosExpedienteCuentasBancarias = expedienteCuentasBancariasDTO.getDocGrupo();
            String rfcEmpleado = null;
            String idDocto = null;
            Integer domSecuencia = 0;

            if (datosExpedienteCuentasBancarias.length > 0) {
                for (String expedienteCuentasBancarias: datosExpedienteCuentasBancarias) {
                    if (expedienteCuentasBancarias != null && !expedienteCuentasBancarias.equals("")) {
                        String[] result = expedienteCuentasBancarias.split("\\|");
                        rfcEmpleado = result[0];
                        idDocto = result[1];
                        domSecuencia = new Integer(result[2]);
                    }
                }
            }

            // Obtener datos del rfc
            TdExpCuentasBancariaDTO tdExpCuentasBancariaDTO = super.getService(GestionDocumentosService.class).getExpedienteCuentasBancarias(rfcEmpleado, domSecuencia, idDocto);

            // Actualiza registro
            tdExpCuentasBancariaDTO.setIdExpRechazo(expedienteCuentasBancariasDTO.getRechazo());
            tdExpCuentasBancariaDTO.setIdStatus("REC");
            tdExpCuentasBancariaDTO.setUsuario(super.security().getUserName());
            tdExpCuentasBancariaDTO.setFecModifico(new Date());
            super.getService(GestionDocumentosService.class).saveAutorizaRechazaExpedienteCuentasBancarias(tdExpCuentasBancariaDTO);

            super.saveMessage(model, "sireh.msg.oficinaVirtual.gestionDocumentos.altaCuentasBancarias.rechazo.ok");
        } catch (Exception e) {
            logger.debug("Exception --------->" + e.toString());
            super.saveError(model, "sireh.msg.oficinaVirtual.gestionDocumentos.altaCuentasBancarias.rechazo.error");
        }

        model.addAttribute(expedienteCuentasBancariasDTO);
        return altaCuentasBancarias(model, expedienteCuentasBancariasDTO, tdEmpleadoDTO.getRfcEmpleado());
    }

        /**
     * Eliminar - Datos de cuentas bancarias
     * @author Gualberto G.
     * @param model Model
     * @param expedienteCuentasBancariasDTO ExpedienteCuentasBancariasDTO
     * @return String
     */
    @RequestMapping
    public String eliminarCuentasBancarias(Model model, ExpedienteCuentasBancariasDTO expedienteCuentasBancariasDTO){
         String[] datosExpedienteCuentasBancarias = expedienteCuentasBancariasDTO.getDocGrupo();
         String rfcEmpleado = null;
         String idDocto = null;
         Integer rfcSecuencia = 0;


         if (datosExpedienteCuentasBancarias != null && datosExpedienteCuentasBancarias.length > 0) {
             String expedienteCuentasBancarias = datosExpedienteCuentasBancarias[0];

             if (expedienteCuentasBancarias != null && !expedienteCuentasBancarias.equals("")) {
                 String[] result = expedienteCuentasBancarias.split("\\|");
                 rfcEmpleado = result[0];
                 idDocto = result[1];
                 rfcSecuencia = new Integer(result[2]);

                super.getService(GestionDocumentosService.class).deleteFileExpediente(result[3]);

                TdExpCuentasBancariaDTO tdExpCuentasBancariaDTO = new TdExpCuentasBancariaDTO();
                tdExpCuentasBancariaDTO.setRfcEmpleado(rfcEmpleado);
                tdExpCuentasBancariaDTO.setCtaSecuencia(rfcSecuencia);
                tdExpCuentasBancariaDTO.setIdDocto(idDocto);
                super.getService(GestionDocumentosService.class).deleteExpedienteCuentasBancarias (tdExpCuentasBancariaDTO);
                super.saveMessage(model, "sireh.msg.oficinaVirtual.gestionDocumentos.altaCuentasBancarias.eliminacion.ok", result[3]);
             }
         }
        model.addAttribute(expedienteCuentasBancariasDTO);
        return altaCuentasBancarias(model, expedienteCuentasBancariasDTO, rfcEmpleado);
    }

    /******************************************************************************************************************************************************************************/

    // TODO: Aviso en caso de accidente
    /**
     * Aviso en caso de accidente
     * @author Carolina H.
     * @param model Model
     * @param expedienteAvisoAccidenteDTO ExpedienteAvisoAccidenteDTO
     * @param rfcEmpleado String
     * @return String
     */
    @RequestMapping
    public String altaAvisoAccidente(Model model, ExpedienteAvisoAccidenteDTO expedienteAvisoAccidenteDTO, @RequestParam("rfcEmpleado") String rfcEmpleado) {
        if (expedienteAvisoAccidenteDTO.isCancel()) {
            expedienteAvisoAccidenteDTO = new ExpedienteAvisoAccidenteDTO();
        }
        
        if (rfcEmpleado != null && !rfcEmpleado.equals("")) {
            // Datos del empleado
            TdEmpleadoDTO tdEmpleadoDTO = super.getService(GestionDocumentosService.class).getEmpleado(rfcEmpleado);
            expedienteAvisoAccidenteDTO.setNombreEmpleadoCompleto(tdEmpleadoDTO.getNombreEmpleado() + " " + 
                                                                 (tdEmpleadoDTO.getPrimerApellido() == null ? "" : tdEmpleadoDTO.getPrimerApellido()) + " " + 
                                                                 (tdEmpleadoDTO.getSegundoApellido() == null ? "" : tdEmpleadoDTO.getSegundoApellido()));

            // Navegacion
            expedienteAvisoAccidenteDTO.setUrlOrigen("altaAvisoAccidente");
            expedienteAvisoAccidenteDTO.setUrlDestino("saveAvisoAccidente");
            expedienteAvisoAccidenteDTO.setBeanName("busqueda-altaAvisoAccidente");
            expedienteAvisoAccidenteDTO.setRfcEmpleadoBusqueda(rfcEmpleado);
            
            // Obtiene 
            TdExpAvisoAccidenteDTO tdExpAvisoAccidenteDTO = super.getService(GestionDocumentosService.class).getExpedienteAvisoAccidente(rfcEmpleado);
            if (tdExpAvisoAccidenteDTO != null){
                expedienteAvisoAccidenteDTO.setNombre(tdExpAvisoAccidenteDTO.getAccNombreEmpleado());
                expedienteAvisoAccidenteDTO.setPrimerApellido(tdExpAvisoAccidenteDTO.getAccPrimerApellido());
                expedienteAvisoAccidenteDTO.setSegundoApellido(tdExpAvisoAccidenteDTO.getAccSegundoApellido());
                expedienteAvisoAccidenteDTO.setTelefono1(tdExpAvisoAccidenteDTO.getAccTelefono1());
                expedienteAvisoAccidenteDTO.setTelefono2(tdExpAvisoAccidenteDTO.getAccTelefono2());
                expedienteAvisoAccidenteDTO.setParentesco(tdExpAvisoAccidenteDTO.getIdParentesco());
                expedienteAvisoAccidenteDTO.setDescripcion(tdExpAvisoAccidenteDTO.getUsuario());
            }
            
            List roles = super.security().getRoles();
            for (Object rol: roles) {
                logger.debug("Roles ---------->" + (String)rol);
            }

            // Dimensiones Registrar
            if (super.security().isUserAuthorized(SECURITY_ROL_REG)) {
                expedienteAvisoAccidenteDTO.setRegistrar(true);
            } else {
                expedienteAvisoAccidenteDTO.setRegistrar(false);
            }
        } else {
            super.saveError(model, "No se encontró el empleado solicitado. Por favor verifique.");
            ExpedienteDocEmpleadoDTO expedienteDocEmpleadoDTO = new ExpedienteDocEmpleadoDTO();
            expedienteDocEmpleadoDTO.setRfcEmpleado("");
            return busquedaDocEmpleado(model, expedienteDocEmpleadoDTO);
        }
        model.addAttribute(expedienteAvisoAccidenteDTO);
        return super.getViewName("altaAvisoAccidente");
    }

    /**
     * Registro - Aviso en caso de accidente
     * @author Carolina H.
     * @param model Model
     * @param expedienteAvisoAccidenteDTO ExpedienteAvisoAccidenteDTO
     * @return String
     */
    @RequestMapping
    public String saveAvisoAccidente(Model model, ExpedienteAvisoAccidenteDTO expedienteAvisoAccidenteDTO) {
        // Datos del empleado
        TdEmpleadoDTO tdEmpleadoDTO = super.getService(GestionDocumentosService.class).getEmpleado(expedienteAvisoAccidenteDTO.getRfcEmpleadoBusqueda());

        try {
            // Guardar registro
            TdExpAvisoAccidenteDTO tdExpAvisoAccidenteDTO = new TdExpAvisoAccidenteDTO();
            tdExpAvisoAccidenteDTO.setRfcEmpleado(expedienteAvisoAccidenteDTO.getRfcEmpleadoBusqueda());
            //tdExpAvisoAccidenteDTO.setAccSecuencia(1);
            tdExpAvisoAccidenteDTO.setAccNombreEmpleado(expedienteAvisoAccidenteDTO.getNombre());
            tdExpAvisoAccidenteDTO.setAccPrimerApellido(expedienteAvisoAccidenteDTO.getPrimerApellido());
            tdExpAvisoAccidenteDTO.setAccSegundoApellido(expedienteAvisoAccidenteDTO.getSegundoApellido());
            tdExpAvisoAccidenteDTO.setAccTelefono1(expedienteAvisoAccidenteDTO.getTelefono1());
            tdExpAvisoAccidenteDTO.setAccTelefono2(expedienteAvisoAccidenteDTO.getTelefono2());
            tdExpAvisoAccidenteDTO.setIdParentesco(expedienteAvisoAccidenteDTO.getParentesco());

            tdExpAvisoAccidenteDTO.setUsuario(super.security().getUserName());
            tdExpAvisoAccidenteDTO.setFecModifico(new Date());
            super.getService(GestionDocumentosService.class).saveExpedienteAvisoAccidente(tdExpAvisoAccidenteDTO);

            // Reiniciar expedienteDependientesDTO
            expedienteAvisoAccidenteDTO = new ExpedienteAvisoAccidenteDTO();
            expedienteAvisoAccidenteDTO.setNombreEmpleadoCompleto(tdEmpleadoDTO.getNombreEmpleado() + " " + tdEmpleadoDTO.getPrimerApellido() + " " + tdEmpleadoDTO.getSegundoApellido());

            // Navegacion
            expedienteAvisoAccidenteDTO.setUrlOrigen("altaAvisoAccidente");
            expedienteAvisoAccidenteDTO.setUrlDestino("saveAvisoAccidente");
            expedienteAvisoAccidenteDTO.setBeanName("busqueda-altaAvisoAccidente");
            expedienteAvisoAccidenteDTO.setRfcEmpleadoBusqueda(expedienteAvisoAccidenteDTO.getRfcEmpleadoBusqueda());

            super.saveMessage(model, "sireh.msg.oficinaVirtual.gestionDocumentos.altaAvisoAccidente.ok");
        } catch (Exception e) {
            logger.debug("Exception --------->" + e.toString());
            super.saveError(model, "sireh.msg.oficinaVirtual.gestionDocumentos.altaAvisoAccidente.error");
        }

        model.addAttribute(expedienteAvisoAccidenteDTO);
        return altaAvisoAccidente(model, expedienteAvisoAccidenteDTO, tdEmpleadoDTO.getRfcEmpleado());
    }

    /******************************************************************************************************************************************************************************/

    // TODO: Experiencia laboral
    /**
     * Alta experiencia laboral
     * @author Gualberto G.
     * @param model Model
     * @param expedienteExperienciaLaboralDTO ExpedienteExperienciaLaboralDTO
     * @return String
     */
    @RequestMapping
    public String altaExperienciaLaboral(Model model, ExpedienteExperienciaLaboralDTO expedienteExperienciaLaboralDTO, @RequestParam("rfcEmpleado") String rfcEmpleado) {
        if (expedienteExperienciaLaboralDTO.isCancel()) {
            expedienteExperienciaLaboralDTO = new ExpedienteExperienciaLaboralDTO();
        }
        
        if (rfcEmpleado != null && !rfcEmpleado.equals("")) {
            // Datos del empleado
            TdEmpleadoDTO tdEmpleadoDTO = super.getService(GestionDocumentosService.class).getEmpleado(rfcEmpleado);
            expedienteExperienciaLaboralDTO.setNombreEmpleadoCompleto(tdEmpleadoDTO.getNombreEmpleado() + " " + 
                                                                     (tdEmpleadoDTO.getPrimerApellido() == null ? "" : tdEmpleadoDTO.getPrimerApellido()) + " " + 
                                                                     (tdEmpleadoDTO.getSegundoApellido() == null ? "" : tdEmpleadoDTO.getSegundoApellido()));
            
            // Navegacion
            expedienteExperienciaLaboralDTO.setUrlOrigen("altaExperienciaLaboral");
            expedienteExperienciaLaboralDTO.setUrlDestino("saveExperienciaLaboral");
            expedienteExperienciaLaboralDTO.setBeanName("busqueda-altaExperienciaLaboral");
            expedienteExperienciaLaboralDTO.setRfcEmpleadoBusqueda(rfcEmpleado);

            List roles = super.security().getRoles();
            for (Object rol: roles) {
                logger.debug("Roles ---------->" + (String)rol);
            }

            // Verificar si existen previamente documentos registrados
            Integer docRegistrados = super.getService(GestionDocumentosService.class).getTotalRegistradosExpedienteExperienciaLaboral(rfcEmpleado);
            logger.debug("Documentos registrados ---------->" + docRegistrados);
            expedienteExperienciaLaboralDTO.setTotalRegistrados(docRegistrados);

            Integer docRechazados = super.getService(GestionDocumentosService.class).getTotalRechazadosExpedienteExperienciaLaboral(rfcEmpleado);
            logger.debug("Documentos rechazados ---------->" + docRechazados);
            expedienteExperienciaLaboralDTO.setTotalRechazados(docRechazados);

            // Dimensiones Registrar
            if (super.security().isUserAuthorized(SECURITY_ROL_REG)) {
                expedienteExperienciaLaboralDTO.setRolRegistrar(true);
            } else {
                expedienteExperienciaLaboralDTO.setRolRegistrar(false);
            }

            // Dimensiones Autorizar/Rechazar
            if (super.security().isUserAuthorized(SECURITY_ROL_AUT)) {
                expedienteExperienciaLaboralDTO.setRolAutorizar(true);
                expedienteExperienciaLaboralDTO.setRolRechazar(true);
            } else {
                expedienteExperienciaLaboralDTO.setRolAutorizar(false);
                expedienteExperienciaLaboralDTO.setRolRechazar(false);
            }
        } else {
            super.saveError(model, "No se encontró el empleado solicitado. Por favor verifique.");
            ExpedienteDocEmpleadoDTO expedienteDocEmpleadoDTO = new ExpedienteDocEmpleadoDTO();
            expedienteDocEmpleadoDTO.setRfcEmpleado("");
            return busquedaDocEmpleado(model, expedienteDocEmpleadoDTO);
        }
        model.addAttribute(expedienteExperienciaLaboralDTO);
        return super.getViewName("altaExperienciaLaboral");
    }

    /**
     * Registro - Alta de experiencia laboral
     * @author Gualberto G.
     * @param model Model
     * @param expedienteExperienciaLaboralDTO ExpedienteExperienciaLaboralDTO
     * @return String
     */
    @RequestMapping
    public String saveExperienciaLaboral(Model model, ExpedienteExperienciaLaboralDTO expedienteExperienciaLaboralDTO) {
        // Datos del empleado
        TdEmpleadoDTO tdEmpleadoDTO = super.getService(GestionDocumentosService.class).getEmpleado(expedienteExperienciaLaboralDTO.getRfcEmpleadoBusqueda());

        if (expedienteExperienciaLaboralDTO.isClean()) {
            expedienteExperienciaLaboralDTO = new ExpedienteExperienciaLaboralDTO();
        } else {
            try {
                // Inicializa datos del documento
                String idFile = null;
                expedienteExperienciaLaboralDTO.setName(expedienteExperienciaLaboralDTO.getDocumentoSoporte().getOriginalFilename());
                expedienteExperienciaLaboralDTO.setData(expedienteExperienciaLaboralDTO.getDocumentoSoporte().getInputStream());
                // META-INDEX
                expedienteExperienciaLaboralDTO.setRfcMeta(expedienteExperienciaLaboralDTO.getRfcEmpleadoBusqueda());
                expedienteExperienciaLaboralDTO.setDocMeta(COD_EXPLA);
                // Descripcion del archivo
                expedienteExperienciaLaboralDTO.setDescripcion(expedienteExperienciaLaboralDTO.getRfcEmpleadoBusqueda() + " - Alta de experiencia laboral");

                String[] datosExpedienteExperienciaLaboral = expedienteExperienciaLaboralDTO.getDocGrupo();
                String rfcEmpleado = null;
                String idDocto = null;
                Integer expSecuencia = 0;

                // Actualizar el documento
                if (datosExpedienteExperienciaLaboral != null && datosExpedienteExperienciaLaboral.length > 0) {
                    String expedienteExperienciaLaboral = datosExpedienteExperienciaLaboral[0];

                    if (expedienteExperienciaLaboral != null && !expedienteExperienciaLaboral.equals("")) {
                        String[] result = expedienteExperienciaLaboral.split("\\|");
                        rfcEmpleado = result[0];
                        idDocto = result[1];
                        expSecuencia = new Integer(result[2]);

                        super.getService(GestionDocumentosService.class).deleteFileExpediente(result[3]);

                        TdExpExperienciaLaboralDTO tdExpExperienciaLaboralDTO = new TdExpExperienciaLaboralDTO();
                        tdExpExperienciaLaboralDTO.setRfcEmpleado(rfcEmpleado);
                        tdExpExperienciaLaboralDTO.setExpSecuencia(expSecuencia);
                        tdExpExperienciaLaboralDTO.setIdDocto(idDocto);
                        super.getService(GestionDocumentosService.class).deleteExpedienteExperienciaLaboral(tdExpExperienciaLaboralDTO);
                    }
                }

                // Guardar documento
                idFile = super.getService(GestionDocumentosService.class).saveFileExpediente(expedienteExperienciaLaboralDTO, expedienteExperienciaLaboralDTO.isRollback());
				
				
                // Guardar registro
                TdExpExperienciaLaboralDTO tdExpExperienciaLaboralDTO = new TdExpExperienciaLaboralDTO();
                tdExpExperienciaLaboralDTO.setRfcEmpleado(expedienteExperienciaLaboralDTO.getRfcEmpleadoBusqueda());
                tdExpExperienciaLaboralDTO.setExpSector(expedienteExperienciaLaboralDTO.getSector());
                tdExpExperienciaLaboralDTO.setIdPais(expedienteExperienciaLaboralDTO.getPais());
                tdExpExperienciaLaboralDTO.setExpFecInicial(expedienteExperienciaLaboralDTO.getFecInicial());
                tdExpExperienciaLaboralDTO.setExpFecFinal(expedienteExperienciaLaboralDTO.getFecFinal());
                tdExpExperienciaLaboralDTO.setIdNivelCargo(expedienteExperienciaLaboralDTO.getPuestoOcupado());
                tdExpExperienciaLaboralDTO.setIdActPrinc(expedienteExperienciaLaboralDTO.getActividadPrincipal());
                tdExpExperienciaLaboralDTO.setExpOrganizacion(expedienteExperienciaLaboralDTO.getOrganizacion());
                tdExpExperienciaLaboralDTO.setExpDoctoRef(idFile);
                tdExpExperienciaLaboralDTO.setIdDocto(COD_EXPLA);
                tdExpExperienciaLaboralDTO.setIdStatus(ID_STATUS_REGISTRADO);
                tdExpExperienciaLaboralDTO.setIdExpRechazo(STATUS_SIN_RECHAZO);
                tdExpExperienciaLaboralDTO.setUsuario(super.security().getUserName());
                tdExpExperienciaLaboralDTO.setFecModifico(new Date());

                super.getService(GestionDocumentosService.class).saveExpedienteExperienciaLaboral(tdExpExperienciaLaboralDTO);

                // Reiniciar expedienteExperienciaLaboralDTO
                expedienteExperienciaLaboralDTO = new ExpedienteExperienciaLaboralDTO();
                expedienteExperienciaLaboralDTO.setNombreEmpleadoCompleto(tdEmpleadoDTO.getNombreEmpleado() + " " + tdEmpleadoDTO.getPrimerApellido() + " " + tdEmpleadoDTO.getSegundoApellido());

                // Navegacion
                expedienteExperienciaLaboralDTO.setUrlOrigen("altaExperienciaLaboral");
                expedienteExperienciaLaboralDTO.setUrlDestino("saveExperienciaLaboral");
                expedienteExperienciaLaboralDTO.setBeanName("busqueda-experienciaLaboral");
                expedienteExperienciaLaboralDTO.setRfcEmpleadoBusqueda(tdEmpleadoDTO.getRfcEmpleado());

                super.saveMessage(model, "sireh.msg.oficinaVirtual.gestionDocumentos.altaExperienciaLaboral.ok");
            } catch (Exception e) {
                logger.debug("Exception --------->" + e.toString());
                super.saveError(model, "sireh.msg.oficinaVirtual.gestionDocumentos.altaExperienciaLaboral.error");
            }
        }
        model.addAttribute(expedienteExperienciaLaboralDTO);
        return altaExperienciaLaboral(model, expedienteExperienciaLaboralDTO, tdEmpleadoDTO.getRfcEmpleado());
    }

    /**
     * Autorizar - Alta de experiencia laboral
     * @author Gualberto G.
     * @param model Model
     * @param expedienteExperienciaLaboralDTO ExpedienteExperienciaLaboralDTO
     * @return String
     */
    @RequestMapping
    public String autorizaAltaExperienciaLaboral(Model model, ExpedienteExperienciaLaboralDTO expedienteExperienciaLaboralDTO) {
        // Datos del empleado
        TdEmpleadoDTO tdEmpleadoDTO = super.getService(GestionDocumentosService.class).getEmpleado(expedienteExperienciaLaboralDTO.getRfcEmpleadoBusqueda());

        try {
            // Obtener datos del registro seleccionado
            String[] datosExpedienteExperienciaLaboral = expedienteExperienciaLaboralDTO.getDocGrupo();
            String rfcEmpleado = null;
            String idDocto = null;
            Integer expSecuencia = 0;

            if (datosExpedienteExperienciaLaboral.length > 0) {
                for (String expedienteDependientes: datosExpedienteExperienciaLaboral) {
                    if (expedienteDependientes != null && !expedienteDependientes.equals("")) {
                        String[] result = expedienteDependientes.split("\\|");
                        rfcEmpleado = result[0];
                        idDocto = result[1];
                        expSecuencia = new Integer(result[2]);
                    }
                }
            }

            // Documentos activos-historico
            //super.getService(GestionDocumentosService.class).updateActivosToHistoricoExpedienteDependientes(rfcEmpleado);

            // Obtener datos del depediente
            TdExpExperienciaLaboralDTO tdExpExperienciaLaboralDTO = super.getService(GestionDocumentosService.class).getExpedienteExperienciaLaboral(rfcEmpleado, expSecuencia, idDocto);

            // Actualiza registro
            tdExpExperienciaLaboralDTO.setIdExpRechazo(STATUS_SIN_RECHAZO);
            tdExpExperienciaLaboralDTO.setIdStatus("ACT");
            tdExpExperienciaLaboralDTO.setUsuario(super.security().getUserName());
            tdExpExperienciaLaboralDTO.setFecModifico(new Date());
            super.getService(GestionDocumentosService.class).saveAutorizaRechazaExpedienteExperienciaLaboral(tdExpExperienciaLaboralDTO);

            super.saveMessage(model, "sireh.msg.oficinaVirtual.gestionDocumentos.altaExperienciaLaboral.autorizacion.ok");
        } catch (Exception e) {
            logger.debug("Exception --------->" + e.toString());
            super.saveError(model, "sireh.msg.oficinaVirtual.gestionDocumentos.altaExperienciaLaboral.autorizacion.error");
        }

        model.addAttribute(expedienteExperienciaLaboralDTO);
        return altaExperienciaLaboral(model, expedienteExperienciaLaboralDTO, tdEmpleadoDTO.getRfcEmpleado());
    }

    /**
     * Rechazar - Alta y/o modificación de experiencia laboral
     * @author Gualberto G.
     * @param model Model
     * @param expedienteExperienciaLaboralDTO ExpedienteExperienciaLaboralDTO
     * @return String
     */
    @RequestMapping
    public String rechazaAltaExperienciaLaboral(Model model, ExpedienteExperienciaLaboralDTO expedienteExperienciaLaboralDTO) {
        // Datos del empleado
        TdEmpleadoDTO tdEmpleadoDTO = super.getService(GestionDocumentosService.class).getEmpleado(expedienteExperienciaLaboralDTO.getRfcEmpleadoBusqueda());

        try {
            // Obtener datos del registro seleccionado
            String[] datosExpedienteExperienciaLaboral = expedienteExperienciaLaboralDTO.getDocGrupo();
            String rfcEmpleado = null;
            String idDocto = null;
            Integer expSecuencia = 0;

            if (datosExpedienteExperienciaLaboral.length > 0) {
                for (String expedienteDependientes: datosExpedienteExperienciaLaboral) {
                    if (expedienteDependientes != null && !expedienteDependientes.equals("")) {
                        String[] result = expedienteDependientes.split("\\|");
                        rfcEmpleado = result[0];
                        idDocto = result[1];
                        expSecuencia = new Integer(result[2]);
                    }
                }
            }

            // Obtener datos del depediente
            TdExpExperienciaLaboralDTO tdExpExperienciaLaboralDTO = super.getService(GestionDocumentosService.class).getExpedienteExperienciaLaboral(rfcEmpleado, expSecuencia, idDocto);

            // Actualiza registro
            tdExpExperienciaLaboralDTO.setIdExpRechazo(expedienteExperienciaLaboralDTO.getRechazo());
            tdExpExperienciaLaboralDTO.setIdStatus("REC");
            tdExpExperienciaLaboralDTO.setUsuario(super.security().getUserName());
            tdExpExperienciaLaboralDTO.setFecModifico(new Date());
            super.getService(GestionDocumentosService.class).saveAutorizaRechazaExpedienteExperienciaLaboral(tdExpExperienciaLaboralDTO);

            super.saveMessage(model, "sireh.msg.oficinaVirtual.gestionDocumentos.altaExperienciaLaboral.rechazo.ok");
        } catch (Exception e) {
            logger.debug("Exception --------->" + e.toString());
            super.saveError(model, "sireh.msg.oficinaVirtual.gestionDocumentos.altaExperienciaLaboral.rechazo.error");
        }

        model.addAttribute(expedienteExperienciaLaboralDTO);
        return altaExperienciaLaboral(model, expedienteExperienciaLaboralDTO, tdEmpleadoDTO.getRfcEmpleado());
    }

        /**
     * Eliminar - Datos de experiencia laboral
     * @author Gualberto G.
     * @param model Model
     * @param expedienteExperienciaLaboralDTO ExpedienteExperienciaLaboralDTO
     * @return String
     */
    @RequestMapping
    public String eliminarExperienciaLaboral(Model model, ExpedienteExperienciaLaboralDTO expedienteExperienciaLaboralDTO){
         String[] datosExpedienteExperienciaLaboral = expedienteExperienciaLaboralDTO.getDocGrupo();
         String rfcEmpleado = null;
         String idDocto = null;
         Integer rfcSecuencia = 0;

         if (datosExpedienteExperienciaLaboral != null && datosExpedienteExperienciaLaboral.length > 0) {
             String expedienteLaboral = datosExpedienteExperienciaLaboral[0];

             if (expedienteLaboral != null && !expedienteLaboral.equals("")) {
                 String[] result = expedienteLaboral.split("\\|");
                 rfcEmpleado = result[0];
                 idDocto = result[1];
                 rfcSecuencia = new Integer(result[2]);

                super.getService(GestionDocumentosService.class).deleteFileExpediente(result[3]);
                
                TdExpExperienciaLaboralDTO tdExpExperienciaLaboralDTO = new TdExpExperienciaLaboralDTO();
                tdExpExperienciaLaboralDTO.setRfcEmpleado(rfcEmpleado);
                tdExpExperienciaLaboralDTO.setExpSecuencia(rfcSecuencia);
                tdExpExperienciaLaboralDTO.setIdDocto(idDocto);
                super.getService(GestionDocumentosService.class).deleteExpedienteExperienciaLaboral(tdExpExperienciaLaboralDTO);
                super.saveMessage(model, "sireh.msg.oficinaVirtual.gestionDocumentos.altaExperienciaLaboral.eliminacion.ok", result[3]);
             }
         }
         
        model.addAttribute(expedienteExperienciaLaboralDTO);
        return altaExperienciaLaboral(model, expedienteExperienciaLaboralDTO, rfcEmpleado);
    }

    /******************************************************************************************************************************************************************************/

    // TODO: Fechas laborales
    /**
     * Alta de fechas laborales personales
     * @author Carolina H.
     * @param model Model
     * @param expedienteFechasLaboralesDTO ExpedienteFechasLaboralesDTO
     * @param rfcEmpleado String
     * @return String
     */
    @RequestMapping
    public String altaFechasLaborales(Model model, ExpedienteFechasLaboralesDTO expedienteFechasLaboralesDTO, @RequestParam("rfcEmpleado") String rfcEmpleado) {
        if (expedienteFechasLaboralesDTO.isCancel()) {
            expedienteFechasLaboralesDTO = new ExpedienteFechasLaboralesDTO();
        }
        
        if (rfcEmpleado != null && !rfcEmpleado.equals("")) {
            // Datos del empleado
            TdEmpleadoDTO tdEmpleadoDTO = super.getService(GestionDocumentosService.class).getEmpleado(rfcEmpleado);
            expedienteFechasLaboralesDTO.setNombreEmpleadoCompleto(tdEmpleadoDTO.getNombreEmpleado() + " " + 
                                                                  (tdEmpleadoDTO.getPrimerApellido() == null ? "" : tdEmpleadoDTO.getPrimerApellido()) + " " + 
                                                                  (tdEmpleadoDTO.getSegundoApellido() == null ? "" : tdEmpleadoDTO.getSegundoApellido()));

            // Navegacion
            expedienteFechasLaboralesDTO.setUrlOrigen("altaFechasLaborales");
            expedienteFechasLaboralesDTO.setUrlDestino("saveFechasLaborales");
            expedienteFechasLaboralesDTO.setBeanName("busqueda-altaFechasLaborales");
            expedienteFechasLaboralesDTO.setRfcEmpleadoBusqueda(rfcEmpleado);

            List roles = super.security().getRoles();
            for (Object rol: roles) {
                logger.debug("Roles ---------->" + (String)rol);
            }

            // Verificar si existen previamente documentos registrados
            Integer docRegistrados = super.getService(GestionDocumentosService.class).getTotalExpedienteFechasLaborales(rfcEmpleado, "REG");
            logger.debug("Documentos registrados ---------->" + docRegistrados);
            expedienteFechasLaboralesDTO.setTotalRegistrados(docRegistrados);

            Integer docRechazados = super.getService(GestionDocumentosService.class).getTotalExpedienteFechasLaborales(rfcEmpleado, "REC");
            logger.debug("Documentos rechazados ---------->" + docRechazados);
            expedienteFechasLaboralesDTO.setTotalRechazados(docRechazados);
            // Dimensiones Registrar
            if (super.security().isUserAuthorized(SECURITY_ROL_REG)) {
                expedienteFechasLaboralesDTO.setRolRegistrar(true);
            } else {
                expedienteFechasLaboralesDTO.setRolRegistrar(false);
            }

            // Dimensiones Autorizar/Rechazar
            if (super.security().isUserAuthorized(SECURITY_ROL_AUT)) {
                expedienteFechasLaboralesDTO.setRolAutorizar(true);
                expedienteFechasLaboralesDTO.setRolRechazar(true);
            } else {
                expedienteFechasLaboralesDTO.setRolAutorizar(false);
                expedienteFechasLaboralesDTO.setRolRechazar(false);
            }
        } else {
            super.saveError(model, "No se encontró el empleado solicitado. Por favor verifique.");
            ExpedienteDocEmpleadoDTO expedienteDocEmpleadoDTO = new ExpedienteDocEmpleadoDTO();
            expedienteDocEmpleadoDTO.setRfcEmpleado("");
            return busquedaDocEmpleado(model, expedienteDocEmpleadoDTO);
        }
        model.addAttribute(expedienteFechasLaboralesDTO);
        return super.getViewName("altaFechasLaborales");
    }

    /**
     * Registro - de fechas laborales personales
     * @author Carolina H.
     * @param model Model
     * @param expedienteFechasLaboralesDTO ExpedienteFechasLaboralesDTO
     * @return String
     */
    @RequestMapping
    public String saveFechasLaborales(Model model, ExpedienteFechasLaboralesDTO expedienteFechasLaboralesDTO) {
        // Datos del empleado
        TdEmpleadoDTO tdEmpleadoDTO = super.getService(GestionDocumentosService.class).getEmpleado(expedienteFechasLaboralesDTO.getRfcEmpleadoBusqueda());

        if (expedienteFechasLaboralesDTO.isClean()) {
            expedienteFechasLaboralesDTO = new ExpedienteFechasLaboralesDTO();
        } else {
            try {
                // Inicializa datos del documento
                String idFile = null;
                expedienteFechasLaboralesDTO.setName(expedienteFechasLaboralesDTO.getDocumentoSoporte().getOriginalFilename());
                expedienteFechasLaboralesDTO.setData(expedienteFechasLaboralesDTO.getDocumentoSoporte().getInputStream());
                // META-INDEX
                expedienteFechasLaboralesDTO.setRfcMeta(expedienteFechasLaboralesDTO.getRfcEmpleadoBusqueda());
                expedienteFechasLaboralesDTO.setDocMeta(COD_FLAB);
                // Descripcion del archivo
                expedienteFechasLaboralesDTO.setDescripcion(expedienteFechasLaboralesDTO.getRfcEmpleadoBusqueda() + " - Alta de fechas laborales");

                String[] datosExpedienteFechasLaborales = expedienteFechasLaboralesDTO.getDocGrupo();
                String rfcEmpleado = null;
                String idDocto = null;
                Integer felSecuencia = 0;

                // Actualizar el documento
                if (datosExpedienteFechasLaborales != null && datosExpedienteFechasLaborales.length > 0) {
                    String expedienteFechasLaborales = datosExpedienteFechasLaborales[0];

                    if (expedienteFechasLaborales != null && !expedienteFechasLaborales.equals("")) {
                        String[] result = expedienteFechasLaborales.split("\\|");
                        rfcEmpleado = result[0];
                        idDocto = result[1];
                        felSecuencia = new Integer(result[2]);

                        super.getService(GestionDocumentosService.class).deleteFileExpediente(result[3]);

                        TdExpFechasLaboralesDTO tdExpFechasLaboraleDTO = new TdExpFechasLaboralesDTO();
                        tdExpFechasLaboraleDTO.setRfcEmpleado(rfcEmpleado);
                        tdExpFechasLaboraleDTO.setFelSecuencia(felSecuencia);
                        tdExpFechasLaboraleDTO.setIdDocto(idDocto);
                        super.getService(GestionDocumentosService.class).deleteExpedienteFechasLaborales(tdExpFechasLaboraleDTO);
                    }
                }

                // Guardar documento
                idFile = super.getService(GestionDocumentosService.class).saveFileExpediente(expedienteFechasLaboralesDTO, expedienteFechasLaboralesDTO.isRollback());

                // Guardar registro
                TdExpFechasLaboralesDTO tdExpFechasLaboraleDTO = new TdExpFechasLaboralesDTO();
                tdExpFechasLaboraleDTO.setRfcEmpleado(expedienteFechasLaboralesDTO.getRfcEmpleadoBusqueda());
                tdExpFechasLaboraleDTO.setIdDocto(COD_FLAB);

                tdExpFechasLaboraleDTO.setIdFecLab(expedienteFechasLaboralesDTO.getTipoFecha());
                tdExpFechasLaboraleDTO.setFelFechaLaboral(expedienteFechasLaboralesDTO.getFecLaboral());
                tdExpFechasLaboraleDTO.setFelDoctoRef(idFile);
                tdExpFechasLaboraleDTO.setIdStatus("REG");
                tdExpFechasLaboraleDTO.setIdExpRechazo(STATUS_SIN_RECHAZO);
                tdExpFechasLaboraleDTO.setUsuario(super.security().getUserName());
                tdExpFechasLaboraleDTO.setFecModifico(new Date());
                super.getService(GestionDocumentosService.class).saveExpedienteFechasLaborales(tdExpFechasLaboraleDTO);

                // Reiniciar expedienteDomicilioDTO
                expedienteFechasLaboralesDTO = new ExpedienteFechasLaboralesDTO();
                expedienteFechasLaboralesDTO.setNombreEmpleadoCompleto(tdEmpleadoDTO.getNombreEmpleado() + " " + tdEmpleadoDTO.getPrimerApellido() + " " + tdEmpleadoDTO.getSegundoApellido());

                // Navegacion
                expedienteFechasLaboralesDTO.setUrlOrigen("altaFechasLaborales");
                expedienteFechasLaboralesDTO.setUrlDestino("saveFechasLaborales");
                expedienteFechasLaboralesDTO.setBeanName("busqueda-altaFechasLaborales");
                expedienteFechasLaboralesDTO.setRfcEmpleadoBusqueda(tdEmpleadoDTO.getRfcEmpleado());

                super.saveMessage(model, "sireh.msg.oficinaVirtual.gestionDocumentos.altaFechasLaborales.ok", idFile);
            } catch (Exception e) {
                logger.debug("Exception --------->" + e.toString());
                super.saveError(model, "sireh.msg.oficinaVirtual.gestionDocumentos.altaFechasLaborales.error");
            }
        }
        model.addAttribute(expedienteFechasLaboralesDTO);
        return altaFechasLaborales(model, expedienteFechasLaboralesDTO, tdEmpleadoDTO.getRfcEmpleado());
    }

    /**
     * Autorizacion - Fechas Laborales
     * @author Carolina H.
     * @param model Model
     * @param expedienteFechasLaboralesDTO ExpedienteFechasLaboralesDTO
     * @return String
     */
    @RequestMapping
    public String autorizaAltaFechasLaborales(Model model, ExpedienteFechasLaboralesDTO expedienteFechasLaboralesDTO) {
        // Datos del empleado
        TdEmpleadoDTO tdEmpleadoDTO = super.getService(GestionDocumentosService.class).getEmpleado(expedienteFechasLaboralesDTO.getRfcEmpleadoBusqueda());

        try {
            // Obtener datos del registro seleccionado
            String[] datosExpedienteFechasLaborales = expedienteFechasLaboralesDTO.getDocGrupo();
            String rfcEmpleado = null;
            String idDocto = null;
            Integer felSecuencia = 0;

            if (datosExpedienteFechasLaborales.length > 0) {
                for (String expedienteFechasLaborales: datosExpedienteFechasLaborales) {
                    if (expedienteFechasLaborales != null && !expedienteFechasLaborales.equals("")) {
                        String[] result = expedienteFechasLaborales.split("\\|");
                        rfcEmpleado = result[0];
                        idDocto = result[1];
                        felSecuencia = new Integer(result[2]);
                    }
                }
            }

            // Documentos activos-historico
            super.getService(GestionDocumentosService.class).updateActivosToHistoricoExpedienteFechasLaborales(rfcEmpleado);

            // Obtener datos del rfc
            TdExpFechasLaboralesDTO tdExpFechasLaboralesDTO = super.getService(GestionDocumentosService.class).getExpedienteFechasLaborales(rfcEmpleado, felSecuencia, idDocto);

            // Actualiza registro
            tdExpFechasLaboralesDTO.setIdExpRechazo(STATUS_SIN_RECHAZO);
            tdExpFechasLaboralesDTO.setIdStatus("ACT");
            tdExpFechasLaboralesDTO.setUsuario(super.security().getUserName());
            tdExpFechasLaboralesDTO.setFecModifico(new Date());
            super.getService(GestionDocumentosService.class).saveAutorizaRechazaExpedienteFechasLaborales(tdExpFechasLaboralesDTO);

            super.saveMessage(model, "sireh.msg.oficinaVirtual.gestionDocumentos.altaFechasLaborales.autorizacion.ok");
        } catch (Exception e) {
            logger.debug("Exception --------->" + e.toString());
            super.saveError(model, "sireh.msg.oficinaVirtual.gestionDocumentos.altaFechasLaborales.autorizacion.error");
        }

        model.addAttribute(expedienteFechasLaboralesDTO);
        return altaFechasLaborales(model, expedienteFechasLaboralesDTO, tdEmpleadoDTO.getRfcEmpleado());
    }

    /**
     * Rechazo - Fechas laborales
     * @author Carolina H.
     * @param model Model
     * @param expedienteFechasLaboralesDTO ExpedienteFechasLaboralesDTO
     * @return String
     */
    @RequestMapping
    public String rechazaAltaFechasLaborales(Model model, ExpedienteFechasLaboralesDTO expedienteFechasLaboralesDTO) {
        // Datos del empleado
        TdEmpleadoDTO tdEmpleadoDTO = super.getService(GestionDocumentosService.class).getEmpleado(expedienteFechasLaboralesDTO.getRfcEmpleadoBusqueda());

        try {
            // Obtener datos del registro seleccionado
            String[] datosExpedienteFechasLaborales = expedienteFechasLaboralesDTO.getDocGrupo();
            String rfcEmpleado = null;
            String idDocto = null;
            Integer felSecuencia = 0;

            if (datosExpedienteFechasLaborales.length > 0) {
                for (String expedienteFechasLaborales: datosExpedienteFechasLaborales) {
                    if (expedienteFechasLaborales != null && !expedienteFechasLaborales.equals("")) {
                        String[] result = expedienteFechasLaborales.split("\\|");
                        rfcEmpleado = result[0];
                        idDocto = result[1];
                        felSecuencia = new Integer(result[2]);
                    }
                }
            }

            // Obtener datos del rfc
            TdExpFechasLaboralesDTO tdExpFechasLaboralesDTO = super.getService(GestionDocumentosService.class).getExpedienteFechasLaborales(rfcEmpleado, felSecuencia, idDocto);

            // Actualiza registro
            tdExpFechasLaboralesDTO.setIdExpRechazo(expedienteFechasLaboralesDTO.getRechazo());
            tdExpFechasLaboralesDTO.setIdStatus("REC");
            tdExpFechasLaboralesDTO.setUsuario(super.security().getUserName());
            tdExpFechasLaboralesDTO.setFecModifico(new Date());
            super.getService(GestionDocumentosService.class).saveAutorizaRechazaExpedienteFechasLaborales(tdExpFechasLaboralesDTO);

            super.saveMessage(model, "sireh.msg.oficinaVirtual.gestionDocumentos.altaFechasLaborales.rechazo.ok");
        } catch (Exception e) {
            logger.debug("Exception --------->" + e.toString());
            super.saveError(model, "sireh.msg.oficinaVirtual.gestionDocumentos.altaFechasLaborales.rechazo.error");
        }

        model.addAttribute(expedienteFechasLaboralesDTO);
        return altaFechasLaborales(model, expedienteFechasLaboralesDTO, tdEmpleadoDTO.getRfcEmpleado());
    }

    /**
     * Eliminar - Datos de fechas laborales
     * @author Gualberto G.
     * @param model Model
     * @param expedienteFechasLaboralesDTO ExpedienteFechasLaboralesDTO
     * @return String
     */
    @RequestMapping
    public String eliminarFechasLaborales(Model model, ExpedienteFechasLaboralesDTO expedienteFechasLaboralesDTO){
         String[] datosExpedienteFechasLaborales = expedienteFechasLaboralesDTO.getDocGrupo();
         String rfcEmpleado = null;
         String idDocto = null;
         Integer rfcSecuencia = 0;


         if (datosExpedienteFechasLaborales != null && datosExpedienteFechasLaborales.length > 0) {
             String expedienteFechasLaborales = datosExpedienteFechasLaborales[0];

             if (expedienteFechasLaborales != null && !expedienteFechasLaborales.equals("")) {
                 String[] result = expedienteFechasLaborales.split("\\|");
                 rfcEmpleado = result[0];
                 idDocto = result[1];
                 rfcSecuencia = new Integer(result[2]);

                super.getService(GestionDocumentosService.class).deleteFileExpediente(result[3]);

                TdExpFechasLaboralesDTO tdExpFechasLaboralesDTO = new TdExpFechasLaboralesDTO();
                tdExpFechasLaboralesDTO.setRfcEmpleado(rfcEmpleado);
                tdExpFechasLaboralesDTO.setFelSecuencia(rfcSecuencia);
                tdExpFechasLaboralesDTO.setIdDocto(idDocto);
                super.getService(GestionDocumentosService.class).deleteExpedienteFechasLaborales(tdExpFechasLaboralesDTO);
                super.saveMessage(model, "sireh.msg.oficinaVirtual.gestionDocumentos.altaFechasLaborales.eliminacion.ok", result[3]);
             }
         }
         
        model.addAttribute(expedienteFechasLaboralesDTO);
        return altaFechasLaborales(model, expedienteFechasLaboralesDTO, rfcEmpleado);

    }

    /******************************************************************************************************************************************************************************/

    // TODO: Capacitacion y cursos
    /**
     * Alta y/o modificación de capacitación y cursos
     * @author Armando Zuñiga
     * @param model Model
     * @param expedienteCapacitacionCursosDTO ExpedienteCapacitacionCursosDTO
     * @param rfcEmpleado String
     * @return String
     */
    @RequestMapping
    public String altaCapacitacionCursos(Model model, ExpedienteCapacitacionCursosDTO expedienteCapacitacionCursosDTO, @RequestParam("rfcEmpleado")String rfcEmpleado) {
        if (expedienteCapacitacionCursosDTO.isCancel()) {
            expedienteCapacitacionCursosDTO = new ExpedienteCapacitacionCursosDTO();
        }
        
        if (rfcEmpleado != null && !rfcEmpleado.equals("")) {
            // Datos del empleado
            TdEmpleadoDTO tdEmpleadoDTO = super.getService(GestionDocumentosService.class).getEmpleado(rfcEmpleado);
            expedienteCapacitacionCursosDTO.setNombreEmpleadoCompleto(tdEmpleadoDTO.getNombreEmpleado() + " " + 
                                                                     (tdEmpleadoDTO.getPrimerApellido() == null ? "" : tdEmpleadoDTO.getPrimerApellido()) + " " + 
                                                                     (tdEmpleadoDTO.getSegundoApellido() == null ? "" : tdEmpleadoDTO.getSegundoApellido()));

            // Navegacion
            expedienteCapacitacionCursosDTO.setUrlOrigen("altaCapacitacionCursos");
            expedienteCapacitacionCursosDTO.setUrlDestino("saveCapacitacionCursos");
            expedienteCapacitacionCursosDTO.setBeanName("busqueda-altaCapacitacionCursos");
            expedienteCapacitacionCursosDTO.setRfcEmpleadoBusqueda(rfcEmpleado);

            List roles = super.security().getRoles();
            for (Object rol: roles) {
                logger.debug("Roles ---------->" + (String)rol);
            }

            // Verificar si existen previamente documentos registrados
            Integer docRegistrados = super.getService(GestionDocumentosService.class).getTotalExpedienteCapacitacionCursos(rfcEmpleado, "REG");
            logger.debug("Documentos registrados ---------->" + docRegistrados);
            expedienteCapacitacionCursosDTO.setTotalRegistrados(docRegistrados);

            Integer docRechazados = super.getService(GestionDocumentosService.class).getTotalExpedienteCapacitacionCursos(rfcEmpleado, "REC");
            logger.debug("Documentos rechazados ---------->" + docRechazados);
            expedienteCapacitacionCursosDTO.setTotalRechazados(docRechazados);

            // Dimensiones Registrar
            if (super.security().isUserAuthorized(SECURITY_ROL_REG)) {
                expedienteCapacitacionCursosDTO.setRolRegistrar(true);
            } else {
                expedienteCapacitacionCursosDTO.setRolRegistrar(false);
            }

            // Dimensiones Autorizar/Rechazar
            if (super.security().isUserAuthorized(SECURITY_ROL_AUT)) {
                expedienteCapacitacionCursosDTO.setRolAutorizar(true);
                expedienteCapacitacionCursosDTO.setRolRechazar(true);
            } else {
                expedienteCapacitacionCursosDTO.setRolAutorizar(false);
                expedienteCapacitacionCursosDTO.setRolRechazar(false);
            }
        } else {
            super.saveError(model, "No se encontró el empleado solicitado. Por favor verifique.");
            ExpedienteDocEmpleadoDTO expedienteDocEmpleadoDTO = new ExpedienteDocEmpleadoDTO();
            expedienteDocEmpleadoDTO.setRfcEmpleado("");
            return busquedaDocEmpleado(model, expedienteDocEmpleadoDTO);
        }
        model.addAttribute(expedienteCapacitacionCursosDTO);
        return super.getViewName("altaCapacitacionCursos");
    }

    /**
     * Registro y/o modificación de capacitación y cursos
     * @author Armando Z
     * @param model Model     
     * @param expedienteCapacitacionCursosDTO ExpedienteCapacitacionCursosDTO
     * @return String
     */
    @RequestMapping
    public String saveCapacitacionCursos(Model model, ExpedienteCapacitacionCursosDTO expedienteCapacitacionCursosDTO) {
        // Datos del empleado
        TdEmpleadoDTO tdEmpleadoDTO = super.getService(GestionDocumentosService.class).getEmpleado(expedienteCapacitacionCursosDTO.getRfcEmpleadoBusqueda());

        if (expedienteCapacitacionCursosDTO.isClean()) {
            expedienteCapacitacionCursosDTO = new ExpedienteCapacitacionCursosDTO();
        } else {
            try {
                // Inicializa datos del documento
                String idFile = null;
                expedienteCapacitacionCursosDTO.setName(expedienteCapacitacionCursosDTO.getDocumentoSoporte().getOriginalFilename());
                expedienteCapacitacionCursosDTO.setData(expedienteCapacitacionCursosDTO.getDocumentoSoporte().getInputStream());
                // META-INDEX
                expedienteCapacitacionCursosDTO.setRfcMeta(expedienteCapacitacionCursosDTO.getRfcEmpleadoBusqueda());
                expedienteCapacitacionCursosDTO.setDocMeta(COD_CAC);
                // Descripcion del archivo
                expedienteCapacitacionCursosDTO.setDescripcion(expedienteCapacitacionCursosDTO.getRfcEmpleadoBusqueda() + " - Alta de capacitacion y cursos");

                String[] datosExpedienteCapacitacionCursos = expedienteCapacitacionCursosDTO.getDocGrupo();
                String rfcEmpleado = null;
                String idDocto = null;
                Integer rfcSecuencia = 0;

                // Actualizar el documento
                if (datosExpedienteCapacitacionCursos != null && datosExpedienteCapacitacionCursos.length > 0) {
                    String expedienteCapacitacionCursos = datosExpedienteCapacitacionCursos[0];

                    if (expedienteCapacitacionCursos != null && !expedienteCapacitacionCursos.equals("")) {
                        String[] result = expedienteCapacitacionCursos.split("\\|");
                        rfcEmpleado = result[0];
                        idDocto = result[1];
                        rfcSecuencia = new Integer(result[2]);

                        super.getService(GestionDocumentosService.class).deleteFileExpediente(result[3]);

                        TdExpCapacitacionDTO tdExpCapacitacionDTO = new TdExpCapacitacionDTO();
                        tdExpCapacitacionDTO.setRfcEmpleado(rfcEmpleado);
                        tdExpCapacitacionDTO.setCapSecuencia(rfcSecuencia);
                        tdExpCapacitacionDTO.setIdDocto(idDocto);
                        super.getService(GestionDocumentosService.class).deleteExpedienteCapacitacionCursos(tdExpCapacitacionDTO);
                    }
                }

                // Guardar documento
                idFile = super.getService(GestionDocumentosService.class).saveFileExpediente(expedienteCapacitacionCursosDTO, expedienteCapacitacionCursosDTO.isRollback());

                // Guardar registro
                TdExpCapacitacionDTO tdExpCapacitacionDTO = new TdExpCapacitacionDTO();
                tdExpCapacitacionDTO.setRfcEmpleado(expedienteCapacitacionCursosDTO.getRfcEmpleadoBusqueda());
                tdExpCapacitacionDTO.setIdDocto(COD_CAC);
                
                tdExpCapacitacionDTO.setIdCapacitacion(expedienteCapacitacionCursosDTO.getNivelCapacitacion());
                tdExpCapacitacionDTO.setCapDescCapacitacion(expedienteCapacitacionCursosDTO.getDescCapacitacion());
                tdExpCapacitacionDTO.setIdInstEducat(expedienteCapacitacionCursosDTO.getInstEducat());
                tdExpCapacitacionDTO.setCapPromedio(expedienteCapacitacionCursosDTO.getPromedioFinal());
                tdExpCapacitacionDTO.setCapEstConcluidos(expedienteCapacitacionCursosDTO.getEstudiosConcluidos());

                tdExpCapacitacionDTO.setCapDoctoRef(idFile);
                tdExpCapacitacionDTO.setIdStatus("REG");
                tdExpCapacitacionDTO.setIdExpRechazo(STATUS_SIN_RECHAZO);
                tdExpCapacitacionDTO.setUsuario(super.security().getUserName());
                tdExpCapacitacionDTO.setFecModifico(new Date());
                super.getService(GestionDocumentosService.class).saveExpedienteCapacitacionCursos(tdExpCapacitacionDTO);

                // Reiniciar expedienteCapacitacionCursosDTO
                expedienteCapacitacionCursosDTO = new ExpedienteCapacitacionCursosDTO();
                expedienteCapacitacionCursosDTO.setNombreEmpleadoCompleto(tdEmpleadoDTO.getNombreEmpleado() + " " + tdEmpleadoDTO.getPrimerApellido() + " " + tdEmpleadoDTO.getSegundoApellido());

                // Navegacion
                expedienteCapacitacionCursosDTO.setUrlOrigen("altaCapacitacionCursos");
                expedienteCapacitacionCursosDTO.setUrlDestino("saveCapacitacionCursos");
                expedienteCapacitacionCursosDTO.setBeanName("busqueda-altaCapacitacionCursos");
                expedienteCapacitacionCursosDTO.setRfcEmpleadoBusqueda(tdEmpleadoDTO.getRfcEmpleado());

                super.saveMessage(model, "sireh.msg.oficinaVirtual.gestionDocumentos.CapacitacionCursos.ok");
            } catch (Exception e) {
                logger.debug("Exception --------->" + e.toString());
                super.saveError(model, "sireh.msg.oficinaVirtual.gestionDocumentos.CapacitacionCursos.error");
            }
        }
        model.addAttribute(expedienteCapacitacionCursosDTO);
        return altaCapacitacionCursos(model, expedienteCapacitacionCursosDTO, tdEmpleadoDTO.getRfcEmpleado());
    }

    /**
     * Autorizacion - Alta de Capacitacion y Cursos
     * @author Armando Zuñiga
     * @param model Model
     * @param expedienteCapacitacionCursosDTO ExpedienteCapacitacionCursosDTO
     * @return String
     */
    @RequestMapping
    public String autorizaAltaCapacitacionCursos(Model model, ExpedienteCapacitacionCursosDTO expedienteCapacitacionCursosDTO) {
        // Datos del empleado
        TdEmpleadoDTO tdEmpleadoDTO = super.getService(GestionDocumentosService.class).getEmpleado(expedienteCapacitacionCursosDTO.getRfcEmpleadoBusqueda());

        try {
            // Obtener datos del registro seleccionado
            String[] datosExpedienteRfc = expedienteCapacitacionCursosDTO.getDocGrupo();
            String rfcEmpleado = null;
            String idDocto = null;
            Integer domSecuencia = 0;

            if (datosExpedienteRfc.length > 0) {
                for (String expedienteRfc: datosExpedienteRfc) {
                    if (expedienteRfc != null && !expedienteRfc.equals("")) {
                        String[] result = expedienteRfc.split("\\|");
                        rfcEmpleado = result[0];
                        idDocto = result[1];
                        domSecuencia = new Integer(result[2]);
                    }
                }
            }

            // Documentos activos-historico
            //super.getService(GestionDocumentosService.class).updateActivosToHistoricoExpedienteCapacitacionCursos(rfcEmpleado);

            // Obtener datos del domicilio
            TdExpCapacitacionDTO tdExpCapacitacionDTO = super.getService(GestionDocumentosService.class).getExpedienteCapacitacionCursos(rfcEmpleado, domSecuencia, idDocto);

            // Actualiza registro
            tdExpCapacitacionDTO.setIdExpRechazo(STATUS_SIN_RECHAZO);
            tdExpCapacitacionDTO.setIdStatus("ACT");
            tdExpCapacitacionDTO.setUsuario(super.security().getUserName());
            tdExpCapacitacionDTO.setFecModifico(new Date());
            super.getService(GestionDocumentosService.class).saveAutorizaRechazaExpedienteCapacitacionCursos(tdExpCapacitacionDTO);

            super.saveMessage(model, "sireh.msg.oficinaVirtual.gestionDocumentos.CapacitacionCursos.autorizacion.ok");
        } catch (Exception e) {
            logger.debug("Exception --------->" + e.toString());
            super.saveError(model, "sireh.msg.oficinaVirtual.gestionDocumentos.CapacitacionCursos.autorizacion.error");
        }

        model.addAttribute(expedienteCapacitacionCursosDTO);
        return altaCapacitacionCursos(model, expedienteCapacitacionCursosDTO, tdEmpleadoDTO.getRfcEmpleado());
    }

    /**
     * Rechazo - Alta de de capacitación y cursos
     * @author Armando Zuñiga
     * @param model Model
     * @param expedienteCapacitacionCursosDTO ExpedienteCapacitacionCursosDTO
     * @return String
     */
    @RequestMapping
    public String rechazaAltaCapacitacionCursos(Model model, ExpedienteCapacitacionCursosDTO expedienteCapacitacionCursosDTO) {
        // Datos del empleado
        TdEmpleadoDTO tdEmpleadoDTO = super.getService(GestionDocumentosService.class).getEmpleado(expedienteCapacitacionCursosDTO.getRfcEmpleadoBusqueda());

        try {
            // Obtener datos del registro seleccionado
            String[] datosExpedienteCapacitacionCursos = expedienteCapacitacionCursosDTO.getDocGrupo();
            String rfcEmpleado = null;
            String idDocto = null;
            Integer domSecuencia = 0;

            if (datosExpedienteCapacitacionCursos.length > 0) {
                for (String expedienteCapacitacionCursos: datosExpedienteCapacitacionCursos) {
                    if (expedienteCapacitacionCursos != null && !expedienteCapacitacionCursos.equals("")) {
                        String[] result = expedienteCapacitacionCursos.split("\\|");
                        rfcEmpleado = result[0];
                        idDocto = result[1];
                        domSecuencia = new Integer(result[2]);
                    }
                }
            }

            // Obtener datos del rfc
            TdExpCapacitacionDTO tdExpCapacitacionDTO = super.getService(GestionDocumentosService.class).getExpedienteCapacitacionCursos(rfcEmpleado, domSecuencia, idDocto);

            // Actualiza registro
            tdExpCapacitacionDTO.setIdExpRechazo(expedienteCapacitacionCursosDTO.getRechazo());
            tdExpCapacitacionDTO.setIdStatus("REC");
            tdExpCapacitacionDTO.setUsuario(super.security().getUserName());
            tdExpCapacitacionDTO.setFecModifico(new Date());
            super.getService(GestionDocumentosService.class).saveAutorizaRechazaExpedienteCapacitacionCursos(tdExpCapacitacionDTO);

            super.saveMessage(model, "sireh.msg.oficinaVirtual.gestionDocumentos.CapacitacionCursos.rechazo.ok");
        } catch (Exception e) {
            logger.debug("Exception --------->" + e.toString());
            super.saveError(model, "sireh.msg.oficinaVirtual.gestionDocumentos.CapacitacionCursos.rechazo.error");
        }

        model.addAttribute(expedienteCapacitacionCursosDTO);
        return altaCapacitacionCursos(model, expedienteCapacitacionCursosDTO, tdEmpleadoDTO.getRfcEmpleado());
    }

        /**
     * Eliminar - Datos de capacitacion y cursos
     * @author Gualberto G.
     * @param model Model
     * @param expedienteCapacitacionCursosDTO ExpedienteCapacitacionCursosDTO
     * @return String
     */
    @RequestMapping
    public String eliminarCapacitacionCursos(Model model, ExpedienteCapacitacionCursosDTO expedienteCapacitacionCursosDTO){
         String[] datosExpedienteCapacitacionCursos = expedienteCapacitacionCursosDTO.getDocGrupo();
         String rfcEmpleado = null;
         String idDocto = null;
         Integer rfcSecuencia = 0;

         if (datosExpedienteCapacitacionCursos != null && datosExpedienteCapacitacionCursos.length > 0) {
             String expedienteCapacitacionursos = datosExpedienteCapacitacionCursos[0];

             if (expedienteCapacitacionursos != null && !expedienteCapacitacionursos.equals("")) {
                 String[] result = expedienteCapacitacionursos.split("\\|");
                 rfcEmpleado = result[0];
                 idDocto = result[1];
                 rfcSecuencia = new Integer(result[2]);

                super.getService(GestionDocumentosService.class).deleteFileExpediente(result[3]);

                TdExpCapacitacionDTO tdExpCapacitacionDTO = new TdExpCapacitacionDTO();
                tdExpCapacitacionDTO.setRfcEmpleado(rfcEmpleado);
                tdExpCapacitacionDTO.setCapSecuencia(rfcSecuencia);
                tdExpCapacitacionDTO.setIdDocto(idDocto);
                super.getService(GestionDocumentosService.class).deleteExpedienteCapacitacionCursos(tdExpCapacitacionDTO);
                super.saveMessage(model, "sireh.msg.oficinaVirtual.gestionDocumentos.CapacitacionCursos.eliminacion.ok", result[3]);
             }
         }
        model.addAttribute(expedienteCapacitacionCursosDTO);
        return altaCapacitacionCursos(model, expedienteCapacitacionCursosDTO, rfcEmpleado);
    }

    /******************************************************************************************************************************************************************************/

    // TODO: Cartilla militar
     /**
      * Alta de cartilla militar nacional
      * @author Ricardo León.
      * @param model Model
      * @param expedienteCartillaMilitarDTO ExpedienteCartillaMilitarDTO
      * @param rfcEmpleado String
      * @return String
      */
     @RequestMapping
     public String altaCartillaMilitar(Model model, ExpedienteCartillaMilitarDTO expedienteCartillaMilitarDTO, @RequestParam("rfcEmpleado") String rfcEmpleado) {
        if (expedienteCartillaMilitarDTO.isCancel()) {
            expedienteCartillaMilitarDTO = new ExpedienteCartillaMilitarDTO();
        }

        if (rfcEmpleado != null && !rfcEmpleado.equals("")) {
            // Datos del empleado
            TdEmpleadoDTO tdEmpleadoDTO = super.getService(GestionDocumentosService.class).getEmpleado(rfcEmpleado);
            expedienteCartillaMilitarDTO.setNombreEmpleadoCompleto(tdEmpleadoDTO.getNombreEmpleado() + " " + 
                                                                  (tdEmpleadoDTO.getPrimerApellido() == null ? "" : tdEmpleadoDTO.getPrimerApellido()) + " " + 
                                                                  (tdEmpleadoDTO.getSegundoApellido() == null ? "" : tdEmpleadoDTO.getSegundoApellido()));

            // Navegacion
            expedienteCartillaMilitarDTO.setUrlOrigen("altaCartillaMilitar");
            expedienteCartillaMilitarDTO.setUrlDestino("saveCartillaMilitar");
            expedienteCartillaMilitarDTO.setBeanName("busqueda-altaCartillaMilitar");
            expedienteCartillaMilitarDTO.setRfcEmpleadoBusqueda(rfcEmpleado);

            List roles = super.security().getRoles();
            for (Object rol: roles) {
                logger.debug("Roles ---------->" + (String)rol);
            }

            // Verificar si existen previamente documentos registrados
            Integer docRegistrados = super.getService(GestionDocumentosService.class).getTotalExpedienteCartillaMilitar(rfcEmpleado, "REG");
            expedienteCartillaMilitarDTO.setTotalRegistrados(docRegistrados);
            logger.debug("Documentos registrados ---------->" + docRegistrados);

            Integer docRechazados = super.getService(GestionDocumentosService.class).getTotalExpedienteCartillaMilitar(rfcEmpleado, "REC");
            expedienteCartillaMilitarDTO.setTotalRechazados(docRechazados);
            logger.debug("Documentos rechazados ---------->" + docRechazados);
            
            // Dimensiones Registrar
            if (super.security().isUserAuthorized(SECURITY_ROL_REG)) {
                expedienteCartillaMilitarDTO.setRolRegistrar(true);
            } else {
                expedienteCartillaMilitarDTO.setRolRegistrar(false);
            }

            // Dimensiones Autorizar/Rechazar
            if (super.security().isUserAuthorized(SECURITY_ROL_AUT)) {
                expedienteCartillaMilitarDTO.setRolAutorizar(true);
                expedienteCartillaMilitarDTO.setRolRechazar(true);
            } else {
                expedienteCartillaMilitarDTO.setRolAutorizar(false);
                expedienteCartillaMilitarDTO.setRolRechazar(false);
            }
        } else {
            super.saveError(model, "No se encontró el empleado solicitado. Por favor verifique.");
            ExpedienteDocEmpleadoDTO expedienteDocEmpleadoDTO = new ExpedienteDocEmpleadoDTO();
            expedienteDocEmpleadoDTO.setRfcEmpleado("");
            return busquedaDocEmpleado(model, expedienteDocEmpleadoDTO);
        }
        model.addAttribute(expedienteCartillaMilitarDTO);
        return super.getViewName("altaCartillaMilitar");
     }

    /**
     * Registro - Alta de cartilla militar nacional
     * @author Ricardo León.
     * @param model Model
     * @param expedienteCartillaMilitarDTO ExpedienteCartillaMilitarDTO
     * @return String
     */
    @RequestMapping
    public String saveCartillaMilitar(Model model, ExpedienteCartillaMilitarDTO expedienteCartillaMilitarDTO) {
        // Datos del empleado
        TdEmpleadoDTO tdEmpleadoDTO = super.getService(GestionDocumentosService.class).getEmpleado(expedienteCartillaMilitarDTO.getRfcEmpleadoBusqueda());
        
        if (expedienteCartillaMilitarDTO.isClean()) {
            expedienteCartillaMilitarDTO = new ExpedienteCartillaMilitarDTO();
        } else {
            try {
                // Inicializa datos del documento
                String idFile = null;
                expedienteCartillaMilitarDTO.setName(expedienteCartillaMilitarDTO.getDocumentoSoporte().getOriginalFilename());
                expedienteCartillaMilitarDTO.setData(expedienteCartillaMilitarDTO.getDocumentoSoporte().getInputStream());
                // META-INDEX
                expedienteCartillaMilitarDTO.setRfcMeta(expedienteCartillaMilitarDTO.getRfcEmpleadoBusqueda());
                expedienteCartillaMilitarDTO.setDocMeta(COD_CARMI);
                // Descripcion del archivo
                expedienteCartillaMilitarDTO.setDescripcion(expedienteCartillaMilitarDTO.getRfcEmpleadoBusqueda() + " - Alta de cartilla militar");
                
                String[] datosExpedienteCartillaMilitar = expedienteCartillaMilitarDTO.getDocGrupo();
                String rfcEmpleado = null;
                String idDocto = null;
                Integer cmiSecuencia = 0;
                
                // Actualizar el documento
                if (datosExpedienteCartillaMilitar != null && datosExpedienteCartillaMilitar.length > 0) {
                    String expedienteCartillaMilitar = datosExpedienteCartillaMilitar[0];
                    
                    if (expedienteCartillaMilitar != null && !expedienteCartillaMilitar.equals("")) {
                        String[] result = expedienteCartillaMilitar.split("\\|");
                        rfcEmpleado = result[0];
                        idDocto = result[1];
                        cmiSecuencia = new Integer(result[2]);
                        
                        super.getService(GestionDocumentosService.class).deleteFileExpediente(result[3]);
                        
                        TdExpCartillaMilitarDTO tdExpCartillaMilitarDTO = new TdExpCartillaMilitarDTO();
                        tdExpCartillaMilitarDTO.setRfcEmpleado(rfcEmpleado);
                        tdExpCartillaMilitarDTO.setCmiSecuencia(cmiSecuencia);
                        tdExpCartillaMilitarDTO.setIdDocto(idDocto);
                        super.getService(GestionDocumentosService.class).deleteExpedienteCartillaMilitar(tdExpCartillaMilitarDTO);
                    }
                }
                
                // Guardar documento
                idFile = super.getService(GestionDocumentosService.class).saveFileExpediente(expedienteCartillaMilitarDTO, expedienteCartillaMilitarDTO.isRollback());
                
                // Guardar registro
                TdExpCartillaMilitarDTO tdExpCartillaMilitarDTO = new TdExpCartillaMilitarDTO();
                expedienteCartillaMilitarDTO.setIdStatus("REG");
                expedienteCartillaMilitarDTO.setCmiDoctoRef(idFile);
                expedienteCartillaMilitarDTO.setIdDocto("CARMI");
                expedienteCartillaMilitarDTO.setIdExpRechazo(STATUS_SIN_RECHAZO);
                expedienteCartillaMilitarDTO.setUsuario(super.security().getUserName());
                expedienteCartillaMilitarDTO.setFecModifico(new Date());
                
                tdExpCartillaMilitarDTO.setRfcEmpleado(expedienteCartillaMilitarDTO.getRfcEmpleadoBusqueda());
                tdExpCartillaMilitarDTO.setCmiNumeroCartilla(expedienteCartillaMilitarDTO.getNumCartilla());
                tdExpCartillaMilitarDTO.setCmiFechaLiberacion(expedienteCartillaMilitarDTO.getFecLiberacion());
                tdExpCartillaMilitarDTO.setIdDocto(expedienteCartillaMilitarDTO.getIdDocto());
                tdExpCartillaMilitarDTO.setCmiDoctoRef(expedienteCartillaMilitarDTO.getCmiDoctoRef());
                tdExpCartillaMilitarDTO.setIdStatus(expedienteCartillaMilitarDTO.getIdStatus());
                tdExpCartillaMilitarDTO.setIdExpRechazo(expedienteCartillaMilitarDTO.getIdExpRechazo());
                tdExpCartillaMilitarDTO.setFecModifico(new Date());
                tdExpCartillaMilitarDTO.setUsuario(super.security().getUserName());

                super.getService(GestionDocumentosService.class).saveExpedienteCartillaMilitar(tdExpCartillaMilitarDTO);
                
                // Reiniciar expedienteCartillaMilitarDTO
                expedienteCartillaMilitarDTO = new ExpedienteCartillaMilitarDTO();
                expedienteCartillaMilitarDTO.setNombreEmpleadoCompleto(tdEmpleadoDTO.getNombreEmpleado() + " " + tdEmpleadoDTO.getPrimerApellido() + " " + tdEmpleadoDTO.getSegundoApellido());
                
                // Navegacion
                expedienteCartillaMilitarDTO.setUrlOrigen("altaCartillaMilitar");
                expedienteCartillaMilitarDTO.setUrlDestino("saveCartillaMilitar");
                expedienteCartillaMilitarDTO.setBeanName("busqueda-altaCartillaMilitar");
                expedienteCartillaMilitarDTO.setRfcEmpleadoBusqueda(tdEmpleadoDTO.getRfcEmpleado());
                
                super.saveMessage(model, "sireh.msg.oficinaVirtual.gestionDocumentos.altaCartillaMilitar.ok", idFile);
            } catch (Exception e) {
                logger.debug("Exception --------->" + e.toString());
                super.saveError(model, "sireh.msg.oficinaVirtual.gestionDocumentos.altaCartillaMilitar.error");
            }
        }
        model.addAttribute(expedienteCartillaMilitarDTO);
        return altaCartillaMilitar(model, expedienteCartillaMilitarDTO, tdEmpleadoDTO.getRfcEmpleado());
    }

    /**
     * Autorizacion - Alta de cartilla militar nacional
     * @author Ricardo León.
     * @param model Model
     * @param expedienteCartillaMilitarDTO ExpedienteCartillaMilitarDTO
     * @return String
     */
    @RequestMapping
    public String autorizaAltaCartillaMilitar(Model model, ExpedienteCartillaMilitarDTO expedienteCartillaMilitarDTO) {
        // Datos del empleado
        TdEmpleadoDTO tdEmpleadoDTO = super.getService(GestionDocumentosService.class).getEmpleado(expedienteCartillaMilitarDTO.getRfcEmpleadoBusqueda());

        try {
            // Obtener datos del registro seleccionado
            String[] datosExpedienteCartillaMilitar = expedienteCartillaMilitarDTO.getDocGrupo();
            String rfcEmpleado;
            rfcEmpleado = null;
            String idDocto = null;
            Integer cmiSecuencia;
            cmiSecuencia = 0;

            if (datosExpedienteCartillaMilitar.length > 0) {
                for (String expedienteCartillaMilitar : datosExpedienteCartillaMilitar) {
                    if (expedienteCartillaMilitar != null && !expedienteCartillaMilitar.equals("")) {
                        String[] result = expedienteCartillaMilitar.split("\\|");
                        rfcEmpleado = result[0];
                        idDocto = result[1];
                        cmiSecuencia = new Integer(result[2]);
                    }
                }
            }
            
            // Documentos activos-historico
            super.getService(GestionDocumentosService.class).updateActivosToHistoricoExpedienteCartillaMilitar(rfcEmpleado);
             
            // Obtener datos del rfc
            TdExpCartillaMilitarDTO tdExpCartillaMilitarDTO = super.getService(GestionDocumentosService.class).getExpedienteCartillaMilitar(rfcEmpleado, cmiSecuencia, idDocto);

            // Actualiza registro
            tdExpCartillaMilitarDTO.setIdExpRechazo(STATUS_SIN_RECHAZO);
            tdExpCartillaMilitarDTO.setIdStatus("ACT");
            tdExpCartillaMilitarDTO.setUsuario(super.security().getUserName());
            tdExpCartillaMilitarDTO.setFecModifico(new Date());
            super.getService(GestionDocumentosService.class).saveAutorizaRechazaExpedienteCartillaMilitar(tdExpCartillaMilitarDTO);
            
            super.saveMessage(model, "sireh.msg.oficinaVirtual.gestionDocumentos.altaCartillaMilitar.autorizacion.ok");
        } catch (Exception e) {
            logger.debug("Exception --------->" + e.toString());
            super.saveError(model, "sireh.msg.oficinaVirtual.gestionDocumentos.altaCartillaMilitar.autorizacion.error");
        }
        
        model.addAttribute(expedienteCartillaMilitarDTO);
        return altaCartillaMilitar(model, expedienteCartillaMilitarDTO, tdEmpleadoDTO.getRfcEmpleado());
    }
    
    /**
     * Rechazo - Alta de cartilla militar nacional
     * @author Ricardo León.
     * @param model Model
     * @param expedienteCartillaMilitarDTO ExpedienteCartillaMilitarDTO
     * @return String
     */
    @RequestMapping
    public String rechazaAltaCartillaMilitar(Model model, ExpedienteCartillaMilitarDTO expedienteCartillaMilitarDTO) {
        // Datos del empleado
        TdEmpleadoDTO tdEmpleadoDTO = super.getService(GestionDocumentosService.class).getEmpleado(expedienteCartillaMilitarDTO.getRfcEmpleadoBusqueda());
        
        try {
            // Obtener datos del registro seleccionado
            String[] datosExpedienteCartillaMilitar = expedienteCartillaMilitarDTO.getDocGrupo();
            String rfcEmpleado;
            rfcEmpleado = null;
            String idDocto = null;
            Integer cmiSecuencia;
            cmiSecuencia = 0;

            if (datosExpedienteCartillaMilitar.length > 0) {
                for (String expedienteCartillaMilitar : datosExpedienteCartillaMilitar) {
                    if (expedienteCartillaMilitar != null && !expedienteCartillaMilitar.equals("")) {
                        String[] result = expedienteCartillaMilitar.split("\\|");
                        rfcEmpleado = result[0];
                        idDocto = result[1];
                        cmiSecuencia = new Integer(result[2]);
                    }
                }
            }
            
            // Documentos activos-historico
            // super.getService(GestionDocumentosService.class).updateActivosToHistoricoExpedienteCartillaMilitar(rfcEmpleado);
             
            // Obtener datos de la cartilla militar
            TdExpCartillaMilitarDTO tdExpCartillaMilitarDTO = super.getService(GestionDocumentosService.class).getExpedienteCartillaMilitar(rfcEmpleado, cmiSecuencia, idDocto);

            // Actualiza registro
            tdExpCartillaMilitarDTO.setIdExpRechazo(expedienteCartillaMilitarDTO.getIdExpRechazo());
            tdExpCartillaMilitarDTO.setIdStatus("REC");
            tdExpCartillaMilitarDTO.setUsuario(super.security().getUserName());
            tdExpCartillaMilitarDTO.setFecModifico(new Date());
            super.getService(GestionDocumentosService.class).saveAutorizaRechazaExpedienteCartillaMilitar(tdExpCartillaMilitarDTO);
            
            super.saveMessage(model, "sireh.msg.oficinaVirtual.gestionDocumentos.altaCartillaMilitar.rechazo.ok");
        } catch (Exception e) {
            logger.debug("Exception --------->" + e.toString());
            super.saveError(model, "sireh.msg.oficinaVirtual.gestionDocumentos.altaCartillaMilitar.rechazo.error");
        }
        
        model.addAttribute(expedienteCartillaMilitarDTO);
        return altaCartillaMilitar(model, expedienteCartillaMilitarDTO, tdEmpleadoDTO.getRfcEmpleado());
    }

    /**
     * Eliminar - Datos de cartilla militar
     * @author Gualberto G.
     * @param model Model
     * @param expedienteCartillaMilitarDTO ExpedienteCartillaMilitarDTO
     * @return String
     */
    @RequestMapping
    public String eliminarCartillaMilitar(Model model, ExpedienteCartillaMilitarDTO expedienteCartillaMilitarDTO){
         String[] datosExpedienteCartillaMilitar = expedienteCartillaMilitarDTO.getDocGrupo();
         String rfcEmpleado = null;
         String idDocto = null;
         Integer rfcSecuencia = 0;


         if (datosExpedienteCartillaMilitar != null && datosExpedienteCartillaMilitar.length > 0) {
             String expedienteCartillaMilitar = datosExpedienteCartillaMilitar[0];

             if (expedienteCartillaMilitar != null && !expedienteCartillaMilitar.equals("")) {
                 String[] result = expedienteCartillaMilitar.split("\\|");
                 rfcEmpleado = result[0];
                 idDocto = result[1];
                 rfcSecuencia = new Integer(result[2]);

                super.getService(GestionDocumentosService.class).deleteFileExpediente(result[3]);

                TdExpCartillaMilitarDTO tdExpCartillaMilitarDTO = new TdExpCartillaMilitarDTO();
                tdExpCartillaMilitarDTO.setRfcEmpleado(rfcEmpleado);
                tdExpCartillaMilitarDTO.setCmiSecuencia(rfcSecuencia);
                tdExpCartillaMilitarDTO.setIdDocto(idDocto);
                super.getService(GestionDocumentosService.class).deleteExpedienteCartillaMilitar(tdExpCartillaMilitarDTO);
                super.saveMessage(model, "sireh.msg.oficinaVirtual.gestionDocumentos.altaCartillaMilitar.eliminacion.ok", result[3]);
             }
         }
         
        model.addAttribute(expedienteCartillaMilitarDTO);
        return altaCartillaMilitar(model, expedienteCartillaMilitarDTO, rfcEmpleado);

    }

    /******************************************************************************************************************************************************************************/
     
     // TODO: Datos Complementarios
     /**
     * Datos Complementarios
     * @author Ricardo León
     * @param model Model
     * @param expedienteDatosComplementariosDTO ExpedienteDatosComplementariosDTO
     * @param rfcEmpleado String
     * @return String
     */
     @RequestMapping
     public String altaDatosComplementarios(Model model, ExpedienteDatosComplementariosDTO expedienteDatosComplementariosDTO, @RequestParam("rfcEmpleado") String rfcEmpleado) {
        if (expedienteDatosComplementariosDTO.isCancel()) {
            expedienteDatosComplementariosDTO = new ExpedienteDatosComplementariosDTO();
        }

        if (rfcEmpleado != null && !rfcEmpleado.equals("")) {
            // Datos del empleado
            TdEmpleadoDTO tdEmpleadoDTO = super.getService(GestionDocumentosService.class).getEmpleado(rfcEmpleado);
            expedienteDatosComplementariosDTO.setNombreEmpleadoCompleto(tdEmpleadoDTO.getNombreEmpleado() + " " + 
                                                                       (tdEmpleadoDTO.getPrimerApellido() == null ? "" : tdEmpleadoDTO.getPrimerApellido()) + " " + 
                                                                       (tdEmpleadoDTO.getSegundoApellido() == null ? "" : tdEmpleadoDTO.getSegundoApellido()));
            
            // Datos del expediente
            TdExpDatosComplementariosDTO tdExpDatosComplementariosDTO = super.getService(GestionDocumentosService.class).getExpedienteDatosComplementarios(rfcEmpleado);
            
            if (tdExpDatosComplementariosDTO != null) {
                expedienteDatosComplementariosDTO.setTelParticular(tdExpDatosComplementariosDTO.getComTelPart());
                expedienteDatosComplementariosDTO.setCelParticular(tdExpDatosComplementariosDTO.getComCelPart());
                expedienteDatosComplementariosDTO.setEmailParticular(tdExpDatosComplementariosDTO.getComEmailPart());
                expedienteDatosComplementariosDTO.setTipoSangre(tdExpDatosComplementariosDTO.getIdTipoSangre());
                expedienteDatosComplementariosDTO.setGenero(tdExpDatosComplementariosDTO.getIdGenero());
                expedienteDatosComplementariosDTO.setPadreMadre(tdExpDatosComplementariosDTO.getComEsPadreMadre());
                expedienteDatosComplementariosDTO.setEdoCivil(tdExpDatosComplementariosDTO.getIdEdoCivil());
                expedienteDatosComplementariosDTO.setTipoDiscapacidad(tdExpDatosComplementariosDTO.getIdDiscapacidad());
                expedienteDatosComplementariosDTO.setNumRusp(tdExpDatosComplementariosDTO.getComNumRusp());
                expedienteDatosComplementariosDTO.setNumSegSoc(tdExpDatosComplementariosDTO.getComNumSegSoc());
                expedienteDatosComplementariosDTO.setHablaIdioma(tdExpDatosComplementariosDTO.getIdIdioma());
                expedienteDatosComplementariosDTO.setDominioIdioma(tdExpDatosComplementariosDTO.getIdDominioIdioma());
                expedienteDatosComplementariosDTO.setInstProtecCivil(tdExpDatosComplementariosDTO.getIdInstProtCiv());
                expedienteDatosComplementariosDTO.setEspProtecCivil(tdExpDatosComplementariosDTO.getIdEspProtCivil());
            }
            
            // Navegacion
            expedienteDatosComplementariosDTO.setUrlOrigen("altaDatosComplementarios");
            expedienteDatosComplementariosDTO.setUrlDestino("saveDatosComplementarios");
            expedienteDatosComplementariosDTO.setBeanName("busqueda-altaDatosComplementarios");
            expedienteDatosComplementariosDTO.setRfcEmpleadoBusqueda(rfcEmpleado);

            List roles = super.security().getRoles();
            for (Object rol: roles) {
                logger.debug("Roles ---------->" + (String)rol);
            }
            
            // Dimensiones Registrar
            if (super.security().isUserAuthorized(SECURITY_ROL_REG)) {
                expedienteDatosComplementariosDTO.setRegistrar(true);
            } else {
                expedienteDatosComplementariosDTO.setRegistrar(false);
            }
        } else {
            super.saveError(model, "No se encontró el empleado solicitado. Por favor verifique.");
            ExpedienteDocEmpleadoDTO expedienteDocEmpleadoDTO = new ExpedienteDocEmpleadoDTO();
            expedienteDocEmpleadoDTO.setRfcEmpleado("");
            return busquedaDocEmpleado(model, expedienteDocEmpleadoDTO);
        }
        model.addAttribute(expedienteDatosComplementariosDTO);
        return super.getViewName("altaDatosComplementarios");
     }

     /**
      * Registro - Datos Complementarios
      * @author Ricardo León
      * @param model Model
      * @param expedienteDatosComplementariosDTO ExpedienteDatosComplementariosDTO
      * @return String
      */
     @RequestMapping
     public String saveDatosComplementarios(Model model, ExpedienteDatosComplementariosDTO expedienteDatosComplementariosDTO) {
         // Datos del empleado
         TdEmpleadoDTO tdEmpleadoDTO = super.getService(GestionDocumentosService.class).getEmpleado(expedienteDatosComplementariosDTO.getRfcEmpleadoBusqueda());
         
         try {            
             // Guardar registro
             TdExpDatosComplementariosDTO tdExpDatosComplementariosDTO;
             tdExpDatosComplementariosDTO = new TdExpDatosComplementariosDTO();
             tdExpDatosComplementariosDTO.setRfcEmpleado(expedienteDatosComplementariosDTO.getRfcEmpleadoBusqueda());
             tdExpDatosComplementariosDTO.setComTelPart(expedienteDatosComplementariosDTO.getTelParticular());
             tdExpDatosComplementariosDTO.setComCelPart(expedienteDatosComplementariosDTO.getCelParticular());
             tdExpDatosComplementariosDTO.setComEmailPart(expedienteDatosComplementariosDTO.getEmailParticular());
             tdExpDatosComplementariosDTO.setIdTipoSangre(expedienteDatosComplementariosDTO.getTipoSangre());
             tdExpDatosComplementariosDTO.setIdGenero(expedienteDatosComplementariosDTO.getGenero());
             tdExpDatosComplementariosDTO.setComEsPadreMadre(expedienteDatosComplementariosDTO.getPadreMadre());
             tdExpDatosComplementariosDTO.setIdEdoCivil(expedienteDatosComplementariosDTO.getEdoCivil());
             tdExpDatosComplementariosDTO.setIdDiscapacidad(expedienteDatosComplementariosDTO.getTipoDiscapacidad());
             tdExpDatosComplementariosDTO.setComNumRusp(expedienteDatosComplementariosDTO.getNumRusp());
             tdExpDatosComplementariosDTO.setComNumSegSoc(expedienteDatosComplementariosDTO.getNumSegSoc());
             tdExpDatosComplementariosDTO.setIdIdioma(expedienteDatosComplementariosDTO.getHablaIdioma());
             tdExpDatosComplementariosDTO.setIdDominioIdioma(expedienteDatosComplementariosDTO.getDominioIdioma());
             tdExpDatosComplementariosDTO.setIdInstProtCiv(expedienteDatosComplementariosDTO.getInstProtecCivil());
             tdExpDatosComplementariosDTO.setIdEspProtCivil(expedienteDatosComplementariosDTO.getEspProtecCivil());
             
             tdExpDatosComplementariosDTO.setUsuario(super.security().getUserName());
             tdExpDatosComplementariosDTO.setFecModifico(new Date());

             super.getService(GestionDocumentosService.class).saveExpedienteDatosComplementarios(tdExpDatosComplementariosDTO);

             // Reiniciar expedienteDependientesDTO
             expedienteDatosComplementariosDTO = new ExpedienteDatosComplementariosDTO();
             expedienteDatosComplementariosDTO.setNombreEmpleadoCompleto(tdEmpleadoDTO.getNombreEmpleado() + " " + tdEmpleadoDTO.getPrimerApellido() + " " + tdEmpleadoDTO.getSegundoApellido());
             
             // Navegacion
             expedienteDatosComplementariosDTO.setUrlOrigen("altaDatosComplementarios");
             expedienteDatosComplementariosDTO.setUrlDestino("saveDatosComplementarios");
             expedienteDatosComplementariosDTO.setBeanName("busqueda-altaDatosComplementarios");
             expedienteDatosComplementariosDTO.setRfcEmpleadoBusqueda(expedienteDatosComplementariosDTO.getRfcEmpleadoBusqueda());
             
             super.saveMessage(model, "sireh.msg.oficinaVirtual.gestionDocumentos.altaDatosComplementarios.ok");
         } catch (Exception e) {
             logger.debug("Exception --------->" + e.toString());
             super.saveError(model, "sireh.msg.oficinaVirtual.gestionDocumentos.altaDatosComplementarios.error");
         }
         
         model.addAttribute(expedienteDatosComplementariosDTO);
         return altaDatosComplementarios(model, expedienteDatosComplementariosDTO, tdEmpleadoDTO.getRfcEmpleado());
    }
    
    /******************************************************************************************************************************************************************************/
    
    /**
     * Metodo encargado de buscar documentos del expediente para la modificacion de descripcion
     * @author Gualberto G.
     * @param model Model
     * @param expedienteBusquedaModificacionDTO ExpedienteBusquedaModificacionDTO
     * @return String
     */
    @RequestMapping
    public String busquedaModDescripcion(Model model, ExpedienteBusquedaModificacionDTO expedienteBusquedaModificacionDTO) {

        if (expedienteBusquedaModificacionDTO.isCancel()) {
            expedienteBusquedaModificacionDTO = new ExpedienteBusquedaModificacionDTO();
        }
        
        expedienteBusquedaModificacionDTO.setInterior("Modificacion de descripción");
        expedienteBusquedaModificacionDTO.setUrlOrigen("busquedaModDescripcion");
        expedienteBusquedaModificacionDTO.setUrlDestino("expModDescripcion");
        expedienteBusquedaModificacionDTO.setBeanName("busquedaModDescripcion");
        expedienteBusquedaModificacionDTO.setBeanNameTipoDocto("tcTipoDoctosExpediente-busquedaModDescripcion");

        model.addAttribute(expedienteBusquedaModificacionDTO);
        return super.getViewName("busquedaModDescripcion");
    }

    /**
     * Metodo encargado de mostrar los documetos por empleado para la modificación de descripción
     * @author Gualberto G.
     * @param model Model
     * @param expedienteModificacionDescripcionDTO ExpedienteModificacionDescripcionDTO
     * @param idTipoDocto String
     * @param rfcEmpleado String
     * @return String
     */
    @RequestMapping
    public String expModDescripcion(Model model, ExpedienteModificacionDescripcionDTO expedienteModificacionDescripcionDTO, @RequestParam("idTipoDocto") String idTipoDocto, @RequestParam("rfcEmpleado") String rfcEmpleado) {
    
        // Datos del empleado
        TdEmpleadoDTO tdEmpleadoDTO = super.getService(GestionDocumentosService.class).getEmpleado(rfcEmpleado);
        expedienteModificacionDescripcionDTO.setNombreEmpleadoCompleto(tdEmpleadoDTO.getNombreEmpleado() + " " + 
                                                                  (tdEmpleadoDTO.getPrimerApellido() == null ? "" : tdEmpleadoDTO.getPrimerApellido()) + " " + 
                                                                  (tdEmpleadoDTO.getSegundoApellido() == null ? "" : tdEmpleadoDTO.getSegundoApellido()));
        // Navegacion
        expedienteModificacionDescripcionDTO.setUrlOrigen("busquedaModDescripcion");
        expedienteModificacionDescripcionDTO.setUrlDestino("saveExpModDescripcion");
        expedienteModificacionDescripcionDTO.setBeanName("busqueda-expModDescripcion");
        
        expedienteModificacionDescripcionDTO.setIdTipoDoctoBusqueda(!idTipoDocto.equals("") ? idTipoDocto : "");
        expedienteModificacionDescripcionDTO.setRfcEmpleadoBusqueda(rfcEmpleado);

        model.addAttribute(expedienteModificacionDescripcionDTO);
    
        model.addAttribute(expedienteModificacionDescripcionDTO);
        return super.getViewName("expModDescripcion");
    }

    /**
     * Metodo encargado de modificar la descripcion del registro seleccionado en base de datos
     * @author Gualberto G.
     * @param model Model
     * @param expedienteModificacionDescripcionDTO ExpedienteModificacionDescripcionDTO
     * @return String
     */
    @RequestMapping
    public String saveExpModDescripcion(Model model, ExpedienteModificacionDescripcionDTO expedienteModificacionDescripcionDTO) {
        String rfcEmpleadoBusqueda = expedienteModificacionDescripcionDTO.getRfcEmpleadoBusqueda();
        String idTipoDoctoBusqueda = expedienteModificacionDescripcionDTO.getIdTipoDoctoBusqueda();

        String descripcion = null;
        if(expedienteModificacionDescripcionDTO.getHiddenIdDocto() != null && expedienteModificacionDescripcionDTO.getHiddenIdDocto().equals("CCTDE,CAPACITACION") ){
            descripcion = expedienteModificacionDescripcionDTO.getAuxdsdDescripDocto();
        }
        else{
            if(expedienteModificacionDescripcionDTO.getAuxdsdDescripDocto() != null && expedienteModificacionDescripcionDTO.getAuxdsdDescripDocto().length() > 0){
                descripcion = expedienteModificacionDescripcionDTO.getAuxDescripcionDocto() + "-" + expedienteModificacionDescripcionDTO.getAuxdsdDescripDocto();
            }
            else{
                descripcion = expedienteModificacionDescripcionDTO.getAuxDescripcionDocto();
            }
        }
        
        // Obtener datos del registro seleccionado
        String[] datosExpedienteRfc = expedienteModificacionDescripcionDTO.getDocGrupo();

        if (datosExpedienteRfc.length > 0) {
            for (String expedienteRfc: datosExpedienteRfc) {
                if (expedienteRfc != null && !expedienteRfc.equals("")) {
                    String[] result = expedienteRfc.split("\\|");
                    expedienteModificacionDescripcionDTO.setRfcEmpleadoBusqueda(result[0]);
                    expedienteModificacionDescripcionDTO.setIdDocto(Integer.valueOf(result[1]));
                    expedienteModificacionDescripcionDTO.setIdTipoDoctoBusqueda(result[2]);
                }
            }
        }

        logger.debug("saveExpModEstatus -> rfcEmpleado -> " + expedienteModificacionDescripcionDTO.getRfcEmpleadoBusqueda() );
        logger.debug("saveExpModEstatus -> idDocto -> " + expedienteModificacionDescripcionDTO.getIdDocto() );
        logger.debug("saveExpModEstatus -> idTipoDocto -> " + expedienteModificacionDescripcionDTO.getIdTipoDoctoBusqueda() );
        logger.debug("saveExpModEstatus -> idStatus -> " + expedienteModificacionDescripcionDTO.getAuxEstadoDocto());
        

        expedienteModificacionDescripcionDTO.setAuxDescripcionDocto(descripcion);
        

        // Actualizar objeto
        super.getService(GestionDocumentosService.class).saveExpModDescripcion(expedienteModificacionDescripcionDTO, super.security().getUserName());
        
        // Reiniciar expedienteModificacionDescripcionDTO
        expedienteModificacionDescripcionDTO = new ExpedienteModificacionDescripcionDTO();
        
        // Mensaje de exito
        super.saveMessage(model, "sireh.msg.oficinaVirtual.gestionDocumentos.expModEstatus.ok");

        return expModDescripcion(model, expedienteModificacionDescripcionDTO, idTipoDoctoBusqueda, rfcEmpleadoBusqueda);
    }
    
    /******************************************************************************************************************************************************************************/
    
    /**
     * Metodo encargado de buscar documentos del expédiente para la modificación de estatus
     * @author Gualberto G.
     * @param model Model
     * @param expedienteBusquedaModificacionDTO ExpedienteBusquedaModificacionDTO
     * @return String
     */
    @RequestMapping
    public String busquedaModEstatus(Model model, ExpedienteBusquedaModificacionDTO expedienteBusquedaModificacionDTO) {
        if (expedienteBusquedaModificacionDTO.isCancel()) {
            expedienteBusquedaModificacionDTO = new ExpedienteBusquedaModificacionDTO();
        }
        
        expedienteBusquedaModificacionDTO.setInterior("Modificacion de estatus"); // Torito
        expedienteBusquedaModificacionDTO.setUrlOrigen("busquedaModEstatus");
        expedienteBusquedaModificacionDTO.setUrlDestino("expModEstatus");
        expedienteBusquedaModificacionDTO.setBeanName("busquedaModEstatus");
        expedienteBusquedaModificacionDTO.setBeanNameTipoDocto("tcTipoDoctosExpediente-busquedaModEstatus");

        model.addAttribute(expedienteBusquedaModificacionDTO);
        return super.getViewName("busquedaModEstatus");
    }

    /**
     * Metodo encargado de mostrar los documentos del expediente por empleado para la modificación de estatus
     * @author Oscar S.
     * @param model Model
     * @param expedienteModificacionEstatusDTO ExpedienteModificacionEstatusDTO
     * @param idTipoDocto String
     * @param rfcEmpleado String
     * @return String
     */
    @RequestMapping
    public String expModEstatus(Model model, ExpedienteModificacionEstatusDTO expedienteModificacionEstatusDTO, @RequestParam("idTipoDocto") String idTipoDocto, @RequestParam("rfcEmpleado") String rfcEmpleado) { 
        // Datos del empleado
        TdEmpleadoDTO tdEmpleadoDTO = super.getService(GestionDocumentosService.class).getEmpleado(rfcEmpleado);
        expedienteModificacionEstatusDTO.setNombreEmpleadoCompleto(tdEmpleadoDTO.getNombreEmpleado() + " " + 
                                                                  (tdEmpleadoDTO.getPrimerApellido() == null ? "" : tdEmpleadoDTO.getPrimerApellido()) + " " + 
                                                                  (tdEmpleadoDTO.getSegundoApellido() == null ? "" : tdEmpleadoDTO.getSegundoApellido()));
        // Navegacion
        expedienteModificacionEstatusDTO.setUrlOrigen("expModEstatus");
        expedienteModificacionEstatusDTO.setUrlDestino("saveExpModEstatus");
        expedienteModificacionEstatusDTO.setBeanName("busqueda-expModEstatus");
        
        expedienteModificacionEstatusDTO.setIdTipoDoctoBusqueda(!idTipoDocto.equals("") ? idTipoDocto : "");
        expedienteModificacionEstatusDTO.setRfcEmpleadoBusqueda(rfcEmpleado);

        model.addAttribute(expedienteModificacionEstatusDTO);
        return super.getViewName("expModEstatus");
    }
    
    /**
     * Metodo encargado de actualizar el documento seleccionado
     * @author Oscar S.
     * @param model Model
     * @param expedienteModificacionEstatusDTO ExpedienteModificacionEstatusDTO
     * @return String
     */
    @RequestMapping
    public String saveExpModEstatus(Model model, ExpedienteModificacionEstatusDTO expedienteModificacionEstatusDTO) {
        String rfcEmpleadoBusqueda = expedienteModificacionEstatusDTO.getRfcEmpleadoBusqueda();
        String idTipoDoctoBusqueda = expedienteModificacionEstatusDTO.getIdTipoDoctoBusqueda();
        
        String rfcEmpleado = null;
        String idTipoDocto = null;
        Integer idDocto = 0;
        String idStatus = expedienteModificacionEstatusDTO.getAuxEstadoDocto();
        
        try {
            // Obtener datos del registro seleccionado
            String[] datosExpedienteRfc = expedienteModificacionEstatusDTO.getDocGrupo();

            if (datosExpedienteRfc.length > 0) {
                for (String expedienteRfc: datosExpedienteRfc) {
                    if (expedienteRfc != null && !expedienteRfc.equals("")) {
                        String[] result = expedienteRfc.split("\\|");
                        rfcEmpleado = result[0];
                        idDocto = new Integer(result[1]);
                        idTipoDocto = result[2];
                    }
                }
            }
            logger.debug("saveExpModEstatus -> rfcEmpleado -> " + rfcEmpleado);
            logger.debug("saveExpModEstatus -> idTipoDocto -> " + idTipoDocto);
            logger.debug("saveExpModEstatus -> idDocto -> " + idDocto);
            logger.debug("saveExpModEstatus -> idStatus -> " + idStatus);
            
            // Actualizar objeto
            String resultMsg = super.getService(GestionDocumentosService.class).saveExpModificacion(rfcEmpleado, idTipoDocto, idDocto, idStatus, super.security().getUserName());

            // Reiniciar expedienteModificacionEstatusDTO
            expedienteModificacionEstatusDTO = new ExpedienteModificacionEstatusDTO();
            
            // Mensaje de exito
            if (resultMsg.equals("conModificacion")) {
                super.saveMessage(model, "sireh.msg.oficinaVirtual.gestionDocumentos.expModEstatus.ok");
            } else {
                super.saveWarning(model, "sireh.msg.oficinaVirtual.gestionDocumentos.expModEstatus.warning");
            }
        } catch (Exception e) {
            logger.debug("saveExpModEstatus -> Exception -> " + e.toString());
            // Mensaje de error
            super.saveError(model, "sireh.msg.oficinaVirtual.gestionDocumentos.expModEstatus.error");            
        }
        return expModEstatus(model, expedienteModificacionEstatusDTO, idTipoDoctoBusqueda, rfcEmpleadoBusqueda);
    }
    
    /**
     * Metodo encargado de mostrar la pantalla de modificacion masiva de descirpcion para documentos sin captura
     * @author Gualberto G.
     * @param model Model
     * @return String
     */
    @RequestMapping
    public String modDescripcionMasiva(Model model){
        ExpedienteModDescripcionMasivaDTO expedienteModDescripcionMasivaDTO = new ExpedienteModDescripcionMasivaDTO();
        expedienteModDescripcionMasivaDTO.setUrlOrigen("modDescripcionMasiva");
        expedienteModDescripcionMasivaDTO.setUrlDestino("saveDescripcionMasiva");
        model.addAttribute(expedienteModDescripcionMasivaDTO);
        return super.getViewName("modDescripcionMasiva");
    }
    
    /**
     * Metodo encargado de responder al boton guardar de la pantalla y llamar al servicio correspondiente
     * @author Gualberto G.
     * @param model Model
     * @return String
     */
    @RequestMapping
    public String saveDescripcionMasiva(Model model, ExpedienteModDescripcionMasivaDTO expedienteModDescripcionMasivaDTO){
        if(expedienteModDescripcionMasivaDTO.getDescripcionComplementaria() != null &&expedienteModDescripcionMasivaDTO.getDescripcionComplementaria().length() > 0){
            expedienteModDescripcionMasivaDTO.setDsdDescripDocto(expedienteModDescripcionMasivaDTO.getDsdDescripDocto() + "-" + expedienteModDescripcionMasivaDTO.getDescripcionComplementaria());
        }
        int modificados =
        super.getService(GestionDocumentosService.class).saveModDescripcionMasiva(expedienteModDescripcionMasivaDTO.getDsdDescripDocto(), expedienteModDescripcionMasivaDTO.getDescripcionDice());
        if (modificados > 0){
            super.saveMessage(model, "sireh.msg.oficinaVirtual.gestionDocumentos.expModDescripcionMasiva.ok", modificados);
        }else{
            super.saveError(model,"sireh.msg.oficinaVirtual.gestionDocumentos.expModDescripcionMasiva.error");
        }
        return modDescripcionMasiva(model); 
    }
    
    /**
     * Metodo encargado de buscar los documentos con estatus 9 - "DOCUMENTO UBICADO ERRONEAMENTE (PARA ELIMINAR)" de todo el  EXPEDIENTE
     * @author Martin C.
     * @param model Model
     * @return String
     */
    @RequestMapping
    public String buscaDocumentosExpediente(Model model, ExpedienteEliminaDocumentosDTO expedienteEliminaDocumentosDTO){
        
        if(!expedienteEliminaDocumentosDTO.isProcesar()){
            expedienteEliminaDocumentosDTO = super.getService(GestionDocumentosService.class).numDocumentosEliminar(9);
        }
        else if(expedienteEliminaDocumentosDTO.isProcesar()){
            Integer errores = super.getService(GestionDocumentosService.class).eliminarDocumentos(expedienteEliminaDocumentosDTO);
            if(errores  > 0){
                if(errores == 1){   super.saveWarning(model, " Un documento no fue eliminado, contacte a su administrador del modulo para mas informacion. ");  } 
                else{    super.saveWarning(model, errores + " Documentos no fueron eliminados, contacte a su administrador del modulo para mas informacion. ");   }
            } else {  super.saveMessage(model, "El proceso de eliminacion termino satisfactoriamente. ");   }
        }
        if(expedienteEliminaDocumentosDTO.getNumDocumentos() == 0){
            super.saveMessage(model, "No se encontraron documentos para eliminar");
        }
        model.addAttribute(expedienteEliminaDocumentosDTO);
        return super.getViewName("buscaDocumentosExpediente");
    }
}
