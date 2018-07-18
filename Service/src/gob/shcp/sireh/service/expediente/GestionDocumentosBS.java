package gob.shcp.sireh.service.expediente;

import gob.shcp.fsn.service.AbstractService;
import gob.shcp.fsn.service.ServiceException;
import gob.shcp.jcr.node.FsnResource;
import gob.shcp.jcr.service.JcrService;

import gob.shcp.sireh.data.jdbc.QueryExpedienteDAO;
import gob.shcp.sireh.data.jdbc.QueryTdExpAntecedentesAcademicoDAO;
import gob.shcp.sireh.data.jdbc.QueryTdExpAvisoAccidenteDAO;
import gob.shcp.sireh.data.jdbc.QueryTdExpBeneficiariosDAO;
import gob.shcp.sireh.data.jdbc.QueryTdExpCapacitacionCursosDAO;
import gob.shcp.sireh.data.jdbc.QueryTdExpCartillaMilitarDAO;
import gob.shcp.sireh.data.jdbc.QueryTdExpCuentasBancariasDAO;
import gob.shcp.sireh.data.jdbc.QueryTdExpCurpDAO;
import gob.shcp.sireh.data.jdbc.QueryTdExpDatosNacimientoDAO;
import gob.shcp.sireh.data.jdbc.QueryTdExpDoctosSinDatoDAO;
import gob.shcp.sireh.data.jdbc.QueryTdExpDomicilioParticularDAO;
import gob.shcp.sireh.data.jdbc.QueryTdExpExperienciaLaboralDAO;
import gob.shcp.sireh.data.jdbc.QueryTdExpFamiliarDepsBenefDAO;
import gob.shcp.sireh.data.jdbc.QueryTdExpFechasLaboralesDAO;
import gob.shcp.sireh.data.jdbc.QueryTdExpRfcDAO;

import gob.shcp.sireh.data.jdbc.TdEmpleadoDAO;

import gob.shcp.sireh.data.jdbc.TdExpAntecedentesAcademicoDAO;
import gob.shcp.sireh.data.jdbc.TdExpAvisoAccidenteDAO;
import gob.shcp.sireh.data.jdbc.TdExpBeneficiariosDAO;
import gob.shcp.sireh.data.jdbc.TdExpCapacitacionDAO;
import gob.shcp.sireh.data.jdbc.TdExpCartillaMilitarDAO;
import gob.shcp.sireh.data.jdbc.TdExpCuentasBancariaDAO;
import gob.shcp.sireh.data.jdbc.TdExpCurpDAO;
import gob.shcp.sireh.data.jdbc.TdExpDatosComplementariosDAO;
import gob.shcp.sireh.data.jdbc.TdExpDatosNacimientoDAO;
import gob.shcp.sireh.data.jdbc.TdExpDoctosSinDatoDAO;
import gob.shcp.sireh.data.jdbc.TdExpDomicilioParticularDAO;
import gob.shcp.sireh.data.jdbc.TdExpExperienciaLaboralDAO;
import gob.shcp.sireh.data.jdbc.TdExpFamiliarDepsBenefDAO;
import gob.shcp.sireh.data.jdbc.TdExpFechasLaboralesDAO;
import gob.shcp.sireh.data.jdbc.TdExpRfcDAO;

import gob.shcp.sireh.data.jdbc.support.CustomDocExpedienteDAO;

import gob.shcp.sireh.data.jdbc.support.CustomTnNominaDao;
import gob.shcp.sireh.domain.jdbc.ExpedienteEliminaDocumentos;
import gob.shcp.sireh.domain.jdbc.TcCodigoPostal;
import gob.shcp.sireh.domain.jdbc.TcMunicipio;
import gob.shcp.sireh.domain.jdbc.TcTipoDocExpAux;
import gob.shcp.sireh.domain.jdbc.TdEmpleado;
import gob.shcp.sireh.domain.jdbc.TdExpAntecedentesAcademicoPK;
import gob.shcp.sireh.domain.jdbc.TdExpAntecedentesAcademicos;
import gob.shcp.sireh.domain.jdbc.TdExpAvisoAccidente;
import gob.shcp.sireh.domain.jdbc.TdExpBeneficiarios;
import gob.shcp.sireh.domain.jdbc.TdExpBeneficiariosPK;
import gob.shcp.sireh.domain.jdbc.TdExpCapacitacion;
import gob.shcp.sireh.domain.jdbc.TdExpCapacitacionPK;
import gob.shcp.sireh.domain.jdbc.TdExpCartillaMilitar;
import gob.shcp.sireh.domain.jdbc.TdExpCartillaMilitarPK;
import gob.shcp.sireh.domain.jdbc.TdExpCuentasBancariaPK;
import gob.shcp.sireh.domain.jdbc.TdExpCuentasBancarias;
import gob.shcp.sireh.domain.jdbc.TdExpCurp;
import gob.shcp.sireh.domain.jdbc.TdExpCurpPK;
import gob.shcp.sireh.domain.jdbc.TdExpDatosComplementarios;
import gob.shcp.sireh.domain.jdbc.TdExpDatosNacimiento;
import gob.shcp.sireh.domain.jdbc.TdExpDatosNacimientoPK;
import gob.shcp.sireh.domain.jdbc.TdExpDoctosSinDatoPK;
import gob.shcp.sireh.domain.jdbc.TdExpDoctosSinDatos;
import gob.shcp.sireh.domain.jdbc.TdExpDomicilioParticular;
import gob.shcp.sireh.domain.jdbc.TdExpDomicilioParticularPK;
import gob.shcp.sireh.domain.jdbc.TdExpExperienciaLaboral;
import gob.shcp.sireh.domain.jdbc.TdExpExperienciaLaboralPK;
import gob.shcp.sireh.domain.jdbc.TdExpFamiliarDepsBenef;
import gob.shcp.sireh.domain.jdbc.TdExpFamiliarDepsBenefPK;
import gob.shcp.sireh.domain.jdbc.TdExpFechasLaborales;
import gob.shcp.sireh.domain.jdbc.TdExpFechasLaboralesPK;
import gob.shcp.sireh.domain.jdbc.TdExpRfc;
import gob.shcp.sireh.domain.jdbc.TdExpRfcPK;
import gob.shcp.sireh.domain.jdbc.TotalRegistrosExpediente;

import gob.shcp.sireh.model.TdExpAntecedentesAcademicoDTO;
import gob.shcp.sireh.model.TdExpAvisoAccidenteDTO;
import gob.shcp.sireh.model.TdExpBeneficiarioDTO;
import gob.shcp.sireh.model.TdExpCapacitacionDTO;
import gob.shcp.sireh.model.TdExpCartillaMilitarDTO;
import gob.shcp.sireh.model.TdExpCuentasBancariaDTO;
import gob.shcp.sireh.model.TdExpCurpDTO;
import gob.shcp.sireh.model.TdExpDatosComplementariosDTO;
import gob.shcp.sireh.model.TdExpDatosNacimientoDTO;
import gob.shcp.sireh.model.TdExpDoctosSinDatoDTO;
import gob.shcp.sireh.model.TdExpDomicilioParticularDTO;
import gob.shcp.sireh.model.TdExpExperienciaLaboralDTO;
import gob.shcp.sireh.model.TdExpFamiliarDepsBenefDTO;
import gob.shcp.sireh.model.TdExpFechasLaboralesDTO;
import gob.shcp.sireh.model.TdExpRfcDTO;

import gob.shcp.sireh.model.expediente.JcrDataGestionDocumentosDTO;
import gob.shcp.sireh.model.expediente.gestion.documentos.ExpedienteDocumentosSinCapturaDTO;
import gob.shcp.sireh.model.expediente.gestion.documentos.ExpedienteEliminaDocumentosDTO;
import gob.shcp.sireh.model.expediente.gestion.documentos.ExpedienteModificacionDescripcionDTO;
import gob.shcp.sireh.model.nomina.TdEmpleadoDTO;

import java.lang.reflect.Method;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Map;

public class GestionDocumentosBS extends AbstractService implements GestionDocumentosService {
    
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
    
    // Documentos no validos para cambio de estatus
    private List<String> DOCUMENTOS_SIN_CAMBIO_ESTATUS = Arrays.asList("CARMI", "CTABA", "CCURP", "ACNAC", "CODOM", "FECLA", "CRRFC");
    
    // Se permiten varios documentos con estatus registrado
    private List<String> DOCUMENTOS_VARIOS_REGISTRADOS = Arrays.asList("SOEMP", "CURRV", "CERME", "IDOFI", "DCLFD", "MBPDV", "CNISF", "CILAB", "SOCEM", "ABMIS", 
                                                                "CIFON", "INSAR", "AHOSO", "CSGMM", "SEGUR", "OFIDO", "CONNO", "ACSPF", "PSPAS", "DOSPF", 
                                                                "COSER", "HUSER", "CONES", "ACTAD", "RNOIC", "AEOIC", "ACTAT", "MEDDI", "CONHE", "CAISS", 
                                                                "DEMAN", "LAUEJ", "BECAS", "ACDEF", "OFIRE", "OFISU", "ACUBA", "DMINC",
                                                                "COEST", "DESBE", "CCTDE", "DFDBE",  "EXPLA", "DESBE", "LICIS");
    
    public String saveFileTest(JcrDataGestionDocumentosDTO jcrDataDTO, boolean rollback) {
        String idfile = saveFileExp(jcrDataDTO);
        if (rollback) {
            throw new RuntimeException("Probando rollback al archivo con id: " + idfile);
        }
        return idfile;
    }

    public String saveFileExpediente(FsnResource fsnResource, boolean rollback) {
        String idfile = saveFileExp(fsnResource);
        if (rollback) {
            throw new RuntimeException("Rollback al archivo con id: " + idfile);
        }
        return idfile;
    }

    public String saveFileExp(FsnResource fsnResource) {
        JcrService service = super.getService(JcrService.class);
        return service.saveFile(fsnResource);
    }

    /**
     * Obtiene datos del empleado con base en su rfc
     * @author Oscar S.
     * @param rfcEmpleado String
     * @return TdEmpleadoDTO
     */
    public TdEmpleadoDTO getEmpleado(String rfcEmpleado) {
        TdEmpleado empleado = super.persistence().get(TdEmpleadoDAO.class).getById(rfcEmpleado);
        return super.transformation().map(empleado, TdEmpleadoDTO.class);
    }

    /**
     * Elimina documento
     * @author Oscar S.
     * @param id String
     */
    public void deleteFileExpediente(String id) {
        JcrService service = super.getService(JcrService.class);
        service.deleteFile(id);
    }

    /******************************************************************************************************************************************************************************/

    /**
     * Obtiene datos del rfc - Alta de registro federal de contribuyentes
     * @author Oscar S.
     * @param rfcEmpleado String
     * @param rfcSecuencia Integer
     * @param idDocto String
     * @return TdEmpleadoDTO
     */
    public TdExpRfcDTO getExpedienteCRRFC(String rfcEmpleado, Integer rfcSecuencia, String idDocto) {
        TdExpRfcPK pk = new TdExpRfcPK();
        pk.setRfcEmpleado(rfcEmpleado);
        pk.setRfcSecuencia(rfcSecuencia);
        pk.setIdDocto(idDocto);

        TdExpRfc tdExpRfc = super.persistence().get(TdExpRfcDAO.class).getById(pk);
        return super.transformation().map(tdExpRfc, TdExpRfcDTO.class);
    }

    /**
     * Guarda registro - Alta de registro federal de contribuyentes
     * @author Oscar S.
     * @param tdExpRfcDTO TdExpRfcDTO
     */
    public void saveExpedienteCRRFC(TdExpRfcDTO tdExpRfcDTO) {
        // Paso 1) Obtener la secuencia
        List<TdExpRfc> tdExpRfcList = super.persistence().get(QueryTdExpRfcDAO.class).getSequenceAltaRfc();
        TdExpRfc sequence = tdExpRfcList.get(0);
        tdExpRfcDTO.setRfcSecuencia(sequence.getRfcSecuencia());

        // Paso 2) Formar la llave
        TdExpRfc tdExpRfc = super.transformation().map(tdExpRfcDTO, TdExpRfc.class);
        TdExpRfcPK pk = new TdExpRfcPK();
        pk.setIdDocto(tdExpRfcDTO.getIdDocto());
        pk.setRfcEmpleado(tdExpRfcDTO.getRfcEmpleado());
        pk.setRfcSecuencia(sequence.getRfcSecuencia());
        tdExpRfc.setIdentity(pk);

        // Paso 3) Guardar registro
        super.persistence().get(TdExpRfcDAO.class).save(tdExpRfc);
    }

    /**
     * Autoriza/Rechaza registro - Alta de registro federal de contribuyentes
     * @author Oscar S.
     * @param tdExpRfcDTO TdExpRfcDTO
     */
    public void saveAutorizaRechazaExpedienteCRRFC(TdExpRfcDTO tdExpRfcDTO) {
        // Paso 1) Obtener datos del rfc
        TdExpRfc tdExpRfc = super.transformation().map(tdExpRfcDTO, TdExpRfc.class);

        // Paso 2) Actualiza registro
        super.persistence().get(TdExpRfcDAO.class).save(tdExpRfc);
    }

    /**
     * Obtiene total de registrados/rechazados - Alta de registro federal de contribuyentes
     * @author Oscar S.
     * @param rfcEmpleado String
     * @param tipo String
     * @return Integer
     */
    public Integer getTotalExpedienteCRRFC(String rfcEmpleado, String tipo) {
        Integer total = 0;
        
        if (tipo.equals("REG")) {
            List<TotalRegistrosExpediente> tdExpRfcList = super.persistence().get(QueryTdExpRfcDAO.class).getTotalRegistradosExpedienteRfc(rfcEmpleado);
            TotalRegistrosExpediente totalRegistrados = tdExpRfcList.get(0);
            total = totalRegistrados.getTotalRegistrados();
        } else {
            List<TotalRegistrosExpediente> tdExpRfcList = super.persistence().get(QueryTdExpRfcDAO.class).getTotalRechazadosExpedienteRfc(rfcEmpleado);
            TotalRegistrosExpediente totalRechazados = tdExpRfcList.get(0);
            total = totalRechazados.getTotalRechazados();
        }
        return total;
    }
    
    /**
     * Obtiene total de registrados/rechazados - Alta de registro federal de contribuyentes
     * @author Oscar S.
     * @param rfcEmpleado String
     * @param tipo String
     * @param idDocto Integer
     * @return Integer
     */
    public Integer getTotalExpedienteModEstatusCRRFC(String rfcEmpleado, String tipo, Integer idDocto) {
        Integer total = 0;
        
        if (tipo.equals("REG")) {
            List<TotalRegistrosExpediente> tdExpRfcList = super.persistence().get(QueryTdExpRfcDAO.class).getTotalRegistradosExpModEstatusRfc(rfcEmpleado, idDocto);
            TotalRegistrosExpediente totalRegistrados = tdExpRfcList.get(0);
            total = totalRegistrados.getTotalRegistrados();
        } else {
            List<TotalRegistrosExpediente> tdExpRfcList = super.persistence().get(QueryTdExpRfcDAO.class).getTotalRechazadosExpModEstatusRfc(rfcEmpleado, idDocto);
            TotalRegistrosExpediente totalRechazados = tdExpRfcList.get(0);
            total = totalRechazados.getTotalRechazados();
        }
        return total;
    }

    /**
     * Actualiza registros activos a historico - Alta de registro federal de contribuyentes
     * @author Oscar S.
     * @param rfcEmpleado String
     */
    public void updateActivosToHistoricoExpedienteCRRFC(String rfcEmpleado) {
        super.persistence().get(CustomDocExpedienteDAO.class).updateActivosToHistoricoExpedienteRfc(rfcEmpleado);
    }

    /**
     * Elimina registro - Alta de registro federal de contribuyentes
     * @author Gualberto G.
     * @param tdExpRfcDTO TdExpRfcDTO
     */
    public void deleteExpedienteCRRFC(TdExpRfcDTO tdExpRfcDTO) {
        TdExpRfcPK tdExpRfcPK = new TdExpRfcPK();
        tdExpRfcPK.setIdDocto(tdExpRfcDTO.getIdDocto());
        tdExpRfcPK.setRfcEmpleado(tdExpRfcDTO.getRfcEmpleado());
        tdExpRfcPK.setRfcSecuencia(tdExpRfcDTO.getRfcSecuencia());
        TdExpRfc tdExpRfc = super.persistence().get(TdExpRfcDAO.class).getById(tdExpRfcPK);
        super.persistence().get(TdExpRfcDAO.class).delete(tdExpRfc);
    }

    /**
     * Actualiza el registro historico mas reciente a activo - Alta de registro federal de contribuyentes
     * @author Oscar S.
     * @param rfcEmpleado String
     * @param usuario String
     */
    public void updateHistoricoToActivoExpedienteCRRFC(String rfcEmpleado, String usuario) {
        List<TdExpRfc> tdExpRfcList = super.persistence().get(QueryTdExpRfcDAO.class).getHistoricosExpedienteRfc(rfcEmpleado);
        if (tdExpRfcList.size() > 0) {
            TdExpRfc docHistorico = tdExpRfcList.get(0);
            docHistorico.setIdExpRechazo(6); // SIN RECHAZO
            docHistorico.setUsuario(usuario);
            docHistorico.setFecModifico(new Date());
            docHistorico.setIdStatus("ACT");
            super.persistence().get(TdExpRfcDAO.class).save(docHistorico);
        }
    }
    
    /**
     * Actualiza el documneto con estaus de registrado a inactivo - Alta de registro federal de contribuyentes
     * @author Oscar S.
     * @param rfcEmpleado String
     * @param usuario String
     */
    public void updateRegistroToInactivoExpedienteCRRFC(String rfcEmpleado, String usuario) {
        List<TdExpRfc> tdExpRfcList = super.persistence().get(QueryTdExpRfcDAO.class).getRegistroExpedienteRfc(rfcEmpleado);
        if (tdExpRfcList.size() > 0) {
            TdExpRfc docRegistrado = tdExpRfcList.get(0);
            docRegistrado.setIdExpRechazo(6); // SIN RECHAZO
            docRegistrado.setUsuario(usuario);
            docRegistrado.setFecModifico(new Date());
            docRegistrado.setIdStatus("INA");
            super.persistence().get(TdExpRfcDAO.class).save(docRegistrado);
        }
    }

    /******************************************************************************************************************************************************************************/

    /**
     * Obtiene datos del beneficiario - Designación - Búsqueda de familiares, dependientes o beneficiarios
     * @author Oscar S.
     * @param rfcEmpleado String
     * @param benSecuencia Integer
     * @param idDocto String
     * @return TdExpBeneficiarioDTO
     */
    public TdExpBeneficiarioDTO getExpedienteDepBenef(String rfcEmpleado, Integer benSecuencia, String idDocto) {
        TdExpBeneficiariosPK pk = new TdExpBeneficiariosPK();
        pk.setRfcEmpleado(rfcEmpleado);
        pk.setBenSecuencia(benSecuencia);
        pk.setIdDocto(idDocto);

        TdExpBeneficiarios tdExpBeneficiario = super.persistence().get(TdExpBeneficiariosDAO.class).getById(pk);
        return super.transformation().map(tdExpBeneficiario, TdExpBeneficiarioDTO.class);
    }

    /**
     * Guarda registro - Designación - Búsqueda de familiares, dependientes o beneficiarios
     * @author Oscar S.
     * @param tdExpBeneficiarioDTO TdExpBeneficiarioDTO
     */
    public void saveExpedienteDepBenef(TdExpBeneficiarioDTO tdExpBeneficiarioDTO) {
        // Paso 1) Obtener la secuencia
        List<TdExpBeneficiarios> tdExpBeneficiarioList = super.persistence().get(QueryTdExpBeneficiariosDAO.class).getSequenceAltaDepBenef();
        TdExpBeneficiarios sequence = tdExpBeneficiarioList.get(0);
        tdExpBeneficiarioDTO.setBenSecuencia(sequence.getBenSecuencia());

        // Paso 2) Formar la llave
        TdExpBeneficiarios tdExpBeneficiario = super.transformation().map(tdExpBeneficiarioDTO, TdExpBeneficiarios.class);
        TdExpBeneficiariosPK pk = new TdExpBeneficiariosPK();
        pk.setIdDocto(tdExpBeneficiarioDTO.getIdDocto());
        pk.setRfcEmpleado(tdExpBeneficiarioDTO.getRfcEmpleado());
        pk.setBenSecuencia(sequence.getBenSecuencia());
        tdExpBeneficiario.setIdentity(pk);

        // Paso 3) Guardar registro
        super.persistence().get(TdExpBeneficiariosDAO.class).save(tdExpBeneficiario);
    }

    /**
     * Elimina registro - Designación - Búsqueda de familiares, dependientes o beneficiarios
     * @author Oscar S.
     * @param tdExpBeneficiarioDTO TdExpBeneficiarioDTO
     */
    public void deleteExpedienteDepBenef(TdExpBeneficiarioDTO tdExpBeneficiarioDTO) {
        TdExpBeneficiariosPK tdExpBeneficiarioPK = new TdExpBeneficiariosPK();
        tdExpBeneficiarioPK.setIdDocto(tdExpBeneficiarioDTO.getIdDocto());
        tdExpBeneficiarioPK.setRfcEmpleado(tdExpBeneficiarioDTO.getRfcEmpleado());
        tdExpBeneficiarioPK.setBenSecuencia(tdExpBeneficiarioDTO.getBenSecuencia());

        TdExpBeneficiarios tdExpBeneficiario = super.persistence().get(TdExpBeneficiariosDAO.class).getById(tdExpBeneficiarioPK);
        super.persistence().get(TdExpBeneficiariosDAO.class).delete(tdExpBeneficiario);
    }

    /**
     * Obtiene total de registrados - Designación - Búsqueda de familiares, dependientes o beneficiarios
     * @author Oscar S.
     * @param rfcEmpleado String
     * @return Integer
     */
    public Integer getTotalRegistradosExpedienteDepBenef(String rfcEmpleado) {
        List<TotalRegistrosExpediente> tdExpDepBenefList = super.persistence().get(QueryTdExpBeneficiariosDAO.class).getTotalRegistradosExpedienteDepBenef(rfcEmpleado);
        TotalRegistrosExpediente totalRegistrados = tdExpDepBenefList.get(0);
        return totalRegistrados.getTotalRegistrados();
    }

    /**
     * Obtiene total de rechazados - Designación - Búsqueda de familiares, dependientes o beneficiarios
     * @author Oscar S.
     * @param rfcEmpleado String
     * @return Integer
     */
    public Integer getTotalRechazadosExpedienteDepBenef(String rfcEmpleado) {
        List<TotalRegistrosExpediente> tdExpDepBenefList = super.persistence().get(QueryTdExpBeneficiariosDAO.class).getTotalRechazadosExpedienteDepBenef(rfcEmpleado);
        TotalRegistrosExpediente totalRegistrados = tdExpDepBenefList.get(0);
        return totalRegistrados.getTotalRechazados();
    }

    /**
     * Actualiza registros activos a historico - Designación - Búsqueda de familiares, dependientes o beneficiarios
     * @author Oscar S.
     * @param rfcEmpleado String
     */
    public void updateActivosToHistoricoExpedienteDepBenef(String rfcEmpleado) {
        super.persistence().get(CustomDocExpedienteDAO.class).updateActivosToHistoricoExpedienteDepBenef(rfcEmpleado);
    }

    /**
     * Autoriza/Rechaza registro - Designación - Búsqueda de familiares, dependientes o beneficiarios
     * @author Oscar S.
     * @param tdExpBeneficiarioDTO TdExpBeneficiarioDTO
     */
    public void saveAutorizaRechazaExpedienteDepBenef(TdExpBeneficiarioDTO tdExpBeneficiarioDTO) {
        // Paso 1) Obtener datos del rfc
        TdExpBeneficiarios tdExpBeneficiario = super.transformation().map(tdExpBeneficiarioDTO, TdExpBeneficiarios.class);

        // Paso 2) Actualiza registro
        super.persistence().get(TdExpBeneficiariosDAO.class).save(tdExpBeneficiario);
    }

    /******************************************************************************************************************************************************************************/

    /**
     * Obtiene datos del beneficiario - Alta y/o modificación de familiares, dependientes o beneficiarios
     * @author Oscar S.
     * @param rfcEmpleado String
     * @param fdbSecuencia Integer
     * @param idDocto String
     * @return TdExpFamiliarDepsBenefDTO
     */
    public TdExpFamiliarDepsBenefDTO getExpedienteDependientes(String rfcEmpleado, Integer fdbSecuencia, 
                                                               String idDocto) {
        TdExpFamiliarDepsBenefPK pk = new TdExpFamiliarDepsBenefPK();
        pk.setRfcEmpleado(rfcEmpleado);
        pk.setFdbSecuencia(fdbSecuencia);
        pk.setIdDocto(idDocto);

        TdExpFamiliarDepsBenef tdExpFamiliarDepsBenef = super.persistence().get(TdExpFamiliarDepsBenefDAO.class).getById(pk);
        return super.transformation().map(tdExpFamiliarDepsBenef, TdExpFamiliarDepsBenefDTO.class);
    }

    /**
     * Guarda registro - Alta y/o modificación de familiares, dependientes o beneficiarios
     * @author Oscar S.
     * @param tdExpFamiliarDepsBenefDTO TdExpFamiliarDepsBenefDTO
     */
    public void saveExpedienteDependientes(TdExpFamiliarDepsBenefDTO tdExpFamiliarDepsBenefDTO) {
        // Paso 1) Obtener la secuencia
        List<TdExpFamiliarDepsBenef> tdExpFamiliarDepsBenefList = super.persistence().get(QueryTdExpFamiliarDepsBenefDAO.class).getSequenceAltaDependientes();
        TdExpFamiliarDepsBenef sequence = tdExpFamiliarDepsBenefList.get(0);
        tdExpFamiliarDepsBenefDTO.setFdbSecuencia(sequence.getFdbSecuencia());

        // Paso 2) Formar la llave
        TdExpFamiliarDepsBenef tdExpFamiliarDepsBenef = super.transformation().map(tdExpFamiliarDepsBenefDTO, TdExpFamiliarDepsBenef.class);
        TdExpFamiliarDepsBenefPK pk = new TdExpFamiliarDepsBenefPK();
        pk.setIdDocto(tdExpFamiliarDepsBenefDTO.getIdDocto());
        pk.setRfcEmpleado(tdExpFamiliarDepsBenefDTO.getRfcEmpleado());
        pk.setFdbSecuencia(sequence.getFdbSecuencia());
        tdExpFamiliarDepsBenef.setIdentity(pk);

        // Paso 3) Guardar registro
        super.persistence().get(TdExpFamiliarDepsBenefDAO.class).save(tdExpFamiliarDepsBenef);
    }

    /**
     * Elimina registro - Alta y/o modificación de familiares, dependientes o beneficiarios
     * @author Oscar S.
     * @param tdExpFamiliarDepsBenefDTO TdExpFamiliarDepsBenefDTO
     */
    public void deleteExpedienteDependientes(TdExpFamiliarDepsBenefDTO tdExpFamiliarDepsBenefDTO) {
        TdExpFamiliarDepsBenefPK tdExpFamiliarDepsBenefPK = new TdExpFamiliarDepsBenefPK();
        tdExpFamiliarDepsBenefPK.setIdDocto(tdExpFamiliarDepsBenefDTO.getIdDocto());
        tdExpFamiliarDepsBenefPK.setRfcEmpleado(tdExpFamiliarDepsBenefDTO.getRfcEmpleado());
        tdExpFamiliarDepsBenefPK.setFdbSecuencia(tdExpFamiliarDepsBenefDTO.getFdbSecuencia());

        TdExpFamiliarDepsBenef tdExpFamiliarDepsBenef = super.persistence().get(TdExpFamiliarDepsBenefDAO.class).getById(tdExpFamiliarDepsBenefPK);
        super.persistence().get(TdExpFamiliarDepsBenefDAO.class).delete(tdExpFamiliarDepsBenef);
    }

    /**
     * Obtiene total de registrados/rechazados - Alta y/o modificación de familiares, dependientes o beneficiarios
     * @author Oscar S.
     * @param rfcEmpleado String
     * @param tipo String
     * @return Integer
     */
    public Integer getTotalExpedienteDependientes(String rfcEmpleado, String tipo) {
        Integer total = 0;

        if (tipo.equals("REG")) {
            List<TotalRegistrosExpediente> tdExpDependientesList = super.persistence().get(QueryTdExpFamiliarDepsBenefDAO.class).getTotalRegistradosExpedienteDependientes(rfcEmpleado);
            TotalRegistrosExpediente totalRegistrados = tdExpDependientesList.get(0);
            total = totalRegistrados.getTotalRegistrados();
        } else {
            List<TotalRegistrosExpediente> tdExpDependientesList = super.persistence().get(QueryTdExpFamiliarDepsBenefDAO.class).getTotalRechazadosExpedienteDependientes(rfcEmpleado);
            TotalRegistrosExpediente totalRechazados = tdExpDependientesList.get(0);
            total = totalRechazados.getTotalRechazados();
        }
        return total;
    }

    /**
     * Actualiza registros activos a historico - Alta y/o modificación de familiares, dependientes o beneficiarios
     * @author Oscar S.
     * @param rfcEmpleado String
     */
    public void updateActivosToHistoricoExpedienteDependientes(String rfcEmpleado) {
        super.persistence().get(CustomDocExpedienteDAO.class).updateActivosToHistoricoExpedienteDependientes(rfcEmpleado);
    }

    /**
     * Autoriza/Rechaza registro - Alta y/o modificación de familiares, dependientes o beneficiarios
     * @author Oscar S.
     * @param tdExpFamiliarDepsBenefDTO TdExpFamiliarDepsBenefDTO
     */
    public void saveAutorizaRechazaExpedienteDependientes(TdExpFamiliarDepsBenefDTO tdExpFamiliarDepsBenefDTO) {
        // Paso 1) Obtener datos del rfc
        TdExpFamiliarDepsBenef tdExpFamiliarDepsBenef = super.transformation().map(tdExpFamiliarDepsBenefDTO, TdExpFamiliarDepsBenef.class);

        // Paso 2) Actualiza registro
        super.persistence().get(TdExpFamiliarDepsBenefDAO.class).save(tdExpFamiliarDepsBenef);
    }
    
    public Integer verificaParentescoExpedienteDependientes(String rfcEmpleado, Integer idParentesco) {        
        List<TotalRegistrosExpediente> tdExpDependientesList = super.persistence().get(QueryTdExpFamiliarDepsBenefDAO.class).verificaParentescoExpedienteDependientes(rfcEmpleado, idParentesco);
        TotalRegistrosExpediente parentesco = tdExpDependientesList.get(0);
        return parentesco.getTotalParentesco();
    }

    /******************************************************************************************************************************************************************************/

    /**
     * Guarda registro - Alta de clave única de registro de población
     * @author Carolina H.
     * @param tdExpCurpDTO TdExpCurpDTO
     */
    public void saveExpedienteCurp(TdExpCurpDTO tdExpCurpDTO) {
        // Paso 1) Obtener la secuencia
        List<TdExpCurp> tdExpCurpList = super.persistence().get(QueryTdExpCurpDAO.class).getSequenceAltaCurp();
        TdExpCurp sequence = tdExpCurpList.get(0);
        tdExpCurpDTO.setCurpSecuencia(sequence.getCurpSecuencia());

        // Paso 2) Formar la llave
        TdExpCurp tdExpCurp = super.transformation().map(tdExpCurpDTO, TdExpCurp.class);
        TdExpCurpPK pk = new TdExpCurpPK();
        pk.setIdDocto(tdExpCurpDTO.getIdDocto());
        pk.setRfcEmpleado(tdExpCurpDTO.getRfcEmpleado());
        pk.setCurpSecuencia(sequence.getCurpSecuencia());
        tdExpCurp.setIdentity(pk);

        // Paso 3) Guardar registro
        super.persistence().get(TdExpCurpDAO.class).save(tdExpCurp);
    }

    /**
     * Elimina registro - Alta de clave única de registro de población
     * @author Carolina H.
     * @param tdExpCurpDTO TdExpCurpDTO
     */
    public void deleteExpedienteCurp(TdExpCurpDTO tdExpCurpDTO) {
        // Paso 1) Formar la llave
        TdExpCurpPK tdExpCurpPK = new TdExpCurpPK();
        tdExpCurpPK.setIdDocto(tdExpCurpDTO.getIdDocto());
        tdExpCurpPK.setRfcEmpleado(tdExpCurpDTO.getRfcEmpleado());
        tdExpCurpPK.setCurpSecuencia(tdExpCurpDTO.getCurpSecuencia());

        // Paso 2) Obtiene registro
        TdExpCurp tdExpCurp = super.persistence().get(TdExpCurpDAO.class).getById(tdExpCurpPK);

        // Paso 3) Elimina registro
        super.persistence().get(TdExpCurpDAO.class).delete(tdExpCurp);
    }

    /**
     * Obtiene total de autorizados/rechazados - Alta de clave única de registro de población
     * @author Carolina H.
     * @param rfcEmpleado String
     * @param tipo String
     * @return Integer
     */
    public Integer getTotalExpedienteCurp(String rfcEmpleado, String tipo) {
        Integer total = 0;

        if (tipo.equals("REG")) {
            List<TotalRegistrosExpediente> tdExpCurpList = super.persistence().get(QueryTdExpCurpDAO.class).getTotalRegistradosExpedienteCurp(rfcEmpleado);
            TotalRegistrosExpediente totalRegistrados = tdExpCurpList.get(0);
            total = totalRegistrados.getTotalRegistrados();
        } else {
            List<TotalRegistrosExpediente> tdExpCurpList = super.persistence().get(QueryTdExpCurpDAO.class).getTotalRechazadosExpedienteCurp(rfcEmpleado);
            TotalRegistrosExpediente totalRechazados = tdExpCurpList.get(0);
            total = totalRechazados.getTotalRechazados();
        }
        return total;
    }

    /**
     * Actualiza registros activos a historico - Alta de clave única de registro de población
     * @author Carolina H.
     * @param rfcEmpleado String
     */
    public void updateActivosToHistoricoExpedienteCurp(String rfcEmpleado) {
        super.persistence().get(CustomDocExpedienteDAO.class).updateActivosToHistoricoExpedienteCurp(rfcEmpleado);
    }

    /**
     * Obtiene datos del rfc - Alta de clave única de registro de población
     * @author Carolina H.
     * @param rfcEmpleado String
     * @param CurpSecuencia Integer
     * @param idDocto String
     * @return TdEmpleadoDTO
     */
    public TdExpCurpDTO getExpedienteCurp(String rfcEmpleado, Integer CurpSecuencia, String idDocto) {
        TdExpCurpPK pk = new TdExpCurpPK();
        pk.setRfcEmpleado(rfcEmpleado);
        pk.setCurpSecuencia(CurpSecuencia);
        pk.setIdDocto(idDocto);

        TdExpCurp tdExpCurp = super.persistence().get(TdExpCurpDAO.class).getById(pk);
        return super.transformation().map(tdExpCurp, TdExpCurpDTO.class);
    }

    /**
     * Autoriza/Rechaza registro - Alta de clave única de registro de población
     * @author Carolina H.
     * @param tdExpCurpDTO TdExpCurpDTO
     */
    public void saveAutorizaRechazaExpedienteCurp(TdExpCurpDTO tdExpCurpDTO) {
        // Paso 1) Obtener datos del rfc
        TdExpCurp tdExpCurp = super.transformation().map(tdExpCurpDTO, TdExpCurp.class);

        // Paso 2) Actualiza registro
        super.persistence().get(TdExpCurpDAO.class).save(tdExpCurp);
    }

    /******************************************************************************************************************************************************************************/

    /**
     * Total Registrados/Rechazados - Alta de documentos sin captura de datos
     * @author Armando Zuñiga
     * @param rfcEmpleado string
     * @param tipo String
     * @return total Integer
     */
    public Integer getTotalExpedienteDocumentosSinCaptura(String rfcEmpleado, String tipo, String idDocto) {
        Integer total = 0;

        if (tipo.equals("REG")) {
            List<TotalRegistrosExpediente> tdExpCurpList = super.persistence().get(QueryTdExpDoctosSinDatoDAO.class).getTotalRegistradosExpedienteDocumentosSinCaptura(rfcEmpleado, idDocto);
            TotalRegistrosExpediente totalRegistrados = tdExpCurpList.get(0);
            total = totalRegistrados.getTotalRegistrados();
        } else {
            List<TotalRegistrosExpediente> tdExpCurpList = super.persistence().get(QueryTdExpDoctosSinDatoDAO.class).getTotalRechazadosExpedienteDocumentosSinCaptura(rfcEmpleado, idDocto);
            TotalRegistrosExpediente totalRechazados = tdExpCurpList.get(0);
            total = totalRechazados.getTotalRechazados();
        }
        return total;
    }

    /**
     * Borra Expediente - Alta de documentos sin captura de datos
     * @author Armando Zuñiga
     * @param tdExpDoctosSinDatoDTO TdExpDoctosSinDatoDTO
     */
    public void deleteExpedienteDocumentosSinCaptura(TdExpDoctosSinDatoDTO tdExpDoctosSinDatoDTO) {
        // Paso 1) Formar la llave
        TdExpDoctosSinDatoPK tdExpDoctosSinDatoPK = new TdExpDoctosSinDatoPK();
        tdExpDoctosSinDatoPK.setIdDocto(tdExpDoctosSinDatoDTO.getIdDocto());
        tdExpDoctosSinDatoPK.setRfcEmpleado(tdExpDoctosSinDatoDTO.getRfcEmpleado());
        tdExpDoctosSinDatoPK.setDsdSecuencia(tdExpDoctosSinDatoDTO.getDsdSecuencia());

        // Paso 2) Obtiene registro
        TdExpDoctosSinDatos tdExpDocumentosSinDatos = super.persistence().get(TdExpDoctosSinDatoDAO.class).getById(tdExpDoctosSinDatoPK);

        // Paso 3) Elimina registro
        super.persistence().get(TdExpDoctosSinDatoDAO.class).delete(tdExpDocumentosSinDatos);
    }

    /**
     * Guarda Archivo Expediente - Alta de documentos sin captura de datos
     * @author Armando Zuñiga
     * @param expedienteDocumentosSinCapturaDTO TdExpDoctosSinDatoDTO
     * @return String
     */
    public String saveFileExpedienteDocumentosSinCaptura(ExpedienteDocumentosSinCapturaDTO expedienteDocumentosSinCapturaDTO, boolean rollback) {
        String idfile = saveFileExp(expedienteDocumentosSinCapturaDTO);
        if (rollback) {
            throw new RuntimeException("Rollback al archivo con id: " + idfile);
        }
        return idfile;
    }

    /**
     * Guarda Expediente - Alta de documentos sin captura de datos
     * @author Armando Zuñiga
     * @param tdExpDoctosSinDatoDTO TdExpDoctosSinDatoDTO
     */
    public void saveExpedienteDocumentosSinCaptura(TdExpDoctosSinDatoDTO tdExpDoctosSinDatoDTO) {
        // Paso 1) Obtener la secuencia
        List<TdExpDoctosSinDatos> tdExpDocumentosSinDatosList = super.persistence().get(QueryTdExpDoctosSinDatoDAO.class).getSequenceAltaDoctosSinDatos();
        TdExpDoctosSinDatos sequence = tdExpDocumentosSinDatosList.get(0);
        tdExpDoctosSinDatoDTO.setDsdSecuencia(sequence.getDsdSecuencia());

        // Paso 2) Formar la llave
        TdExpDoctosSinDatos tdExpDoctosSinDatos = super.transformation().map(tdExpDoctosSinDatoDTO, TdExpDoctosSinDatos.class);
        TdExpDoctosSinDatoPK pk = new TdExpDoctosSinDatoPK();
        pk.setIdDocto(tdExpDoctosSinDatoDTO.getIdDocto());
        pk.setRfcEmpleado(tdExpDoctosSinDatoDTO.getRfcEmpleado());
        pk.setDsdSecuencia(sequence.getDsdSecuencia());
        tdExpDoctosSinDatos.setIdentity(pk);

        // Paso 3) Guardar registro
        super.persistence().get(TdExpDoctosSinDatoDAO.class).save(tdExpDoctosSinDatos);
    }

    /**
     * Actualiza registros activos a historico - Alta de documentos sin captura de datos
     * @author Armando Zuñiga
     * @param rfcEmpleado String
     * @param idDocto String
     */
    public void updateActivosToHistoricoExpedienteDocumentosSinCaptura(String rfcEmpleado, String idDocto) {
        super.persistence().get(CustomDocExpedienteDAO.class).updateActivosToHistoricoExpedienteDoctosSinDato(rfcEmpleado, idDocto);
    }

    /**
     * Autoriza/Rechaza registro - Alta de documentos sin captura de datos
     * @author Armando Zuñiga
     * @param tdExpDoctosSinDatoDTO TdExpDoctosSinDatoDTO
     */
    public void saveAutorizaRechazaExpedienteDocumentosSinCaptura(TdExpDoctosSinDatoDTO tdExpDoctosSinDatoDTO) {
        // Paso 1) Obtener datos del rfc
        TdExpDoctosSinDatos tdExpDoctosSinDatos = super.transformation().map(tdExpDoctosSinDatoDTO, TdExpDoctosSinDatos.class);

        // Paso 2) Actualiza registro
        super.persistence().get(TdExpDoctosSinDatoDAO.class).save(tdExpDoctosSinDatos);
    }

    /**
     * Obtiene datos - Alta de documentos sin captura de datos
     * @author Armando Zuñiga
     * @param rfcEmpleado String
     * @param documentosSinCapturaSecuencia Integer
     * @param idDocto String
     * @return TdExpDoctosSinDatoDTO
     */
    public TdExpDoctosSinDatoDTO getExpedienteDocumentosSinCaptura(String rfcEmpleado, Integer documentosSinCapturaSecuencia, String idDocto) {
        TdExpDoctosSinDatoPK pk = new TdExpDoctosSinDatoPK();
        pk.setRfcEmpleado(rfcEmpleado);
        pk.setDsdSecuencia(documentosSinCapturaSecuencia);
        pk.setIdDocto(idDocto);

        TdExpDoctosSinDatos tdExpDoctosSinDatos = super.persistence().get(TdExpDoctosSinDatoDAO.class).getById(pk);
        return super.transformation().map(tdExpDoctosSinDatos, TdExpDoctosSinDatoDTO.class);
    }

    /**
     * Obtiene la lista de descripciones auxiliares de documentos
     * @author Roberto Muñoz
     * @param idDocto String
     */
    public List<String> getTcDescripcionAux(String idDocto) {
        List<String> lDescripAuxDocto = new ArrayList<String>();
        List<TcTipoDocExpAux> lTcDescripcionAuxMod = super.persistence().get(QueryTdExpDoctosSinDatoDAO.class).getTcDescripcionAux(idDocto);

        for (TcTipoDocExpAux daux: lTcDescripcionAuxMod) {
            lDescripAuxDocto.add(daux.getDescDocto());
        }
        return lDescripAuxDocto;
    }

    /******************************************************************************************************************************************************************************/

    /**
     * Guarda registro - Aviso en caso de accidente
     * @author Carolina H.
     * @param tdExpAvisoAccidenteDTO TdExpAvisoAccidenteDTO
     */
    public void saveExpedienteAvisoAccidente(TdExpAvisoAccidenteDTO tdExpAvisoAccidenteDTO) {
        // Paso 1) Obtener la secuencia
        List<TdExpAvisoAccidente> tdExpAvisoAccidenteList = super.persistence().get(QueryTdExpAvisoAccidenteDAO.class).getSequenceAltaAvisoAccidente();
        TdExpAvisoAccidente sequence = tdExpAvisoAccidenteList.get(0);
        tdExpAvisoAccidenteDTO.setAccSecuencia(sequence.getAccSecuencia());

        TdExpAvisoAccidente tdExpAvisoAccidente = super.transformation().map(tdExpAvisoAccidenteDTO, TdExpAvisoAccidente.class);

        // Paso 3) Guardar registro
        super.persistence().get(TdExpAvisoAccidenteDAO.class).save(tdExpAvisoAccidente);
    }
    
    /**
     * Obtirne registro - Aviso en caso de accidente
     * @author Martin C.
     * @param  rfc String
     */
     public TdExpAvisoAccidenteDTO getExpedienteAvisoAccidente(String rfc){
         List<TdExpAvisoAccidente> tdExpAvisoAccidente = super.persistence().get(QueryTdExpAvisoAccidenteDAO.class).getAvisoAccidente(rfc);
         if(tdExpAvisoAccidente.size() > 0){  return super.transformation().map(tdExpAvisoAccidente.get(0), TdExpAvisoAccidenteDTO.class);  }
         else { return null; }
     }

    /******************************************************************************************************************************************************************************/
    
     /**
      * Obtiene total de registrados/rechazados - Alta de experiencia laboral
      * @author Gualberto G.
      * @param rfcEmpleado
      * @return Integer
      */
    public Integer getTotalRegistradosExpedienteExperienciaLaboral(String rfcEmpleado) {
        List<TotalRegistrosExpediente> tdExpExperienciaLaboralList = super.persistence().get(QueryTdExpExperienciaLaboralDAO.class).getTotalRegistradosExperienciaLaboral(rfcEmpleado);
        TotalRegistrosExpediente totalRegistrados = tdExpExperienciaLaboralList.get(0);
        return totalRegistrados.getTotalRegistrados();
    }
    
    /**
     * Obtiene total de rechazados - Alta de experiencia laboral
     * @author Gualberto G.
     * @param rfcEmpleado
     * @return Integer
     */
    public Integer getTotalRechazadosExpedienteExperienciaLaboral(String rfcEmpleado) {
        List<TotalRegistrosExpediente> tdExpExperienciaLaboralList = super.persistence().get(QueryTdExpExperienciaLaboralDAO.class).getTotalRechazadosExperienciaLaboral(rfcEmpleado);
        TotalRegistrosExpediente totalRechazados = tdExpExperienciaLaboralList.get(0);
        return totalRechazados.getTotalRechazados();
    }
    
    /**
     * Elimina registro - Alta de experiencia laboral
     * @author Gualberto G.
     * @param tdExpExperienciaLaboralDTO
     */
    public void deleteExpedienteExperienciaLaboral(TdExpExperienciaLaboralDTO tdExpExperienciaLaboralDTO) {
        // Paso 1) Formar la llave
        TdExpExperienciaLaboralPK tdExpExperienciaLaboralPK = new TdExpExperienciaLaboralPK();

        tdExpExperienciaLaboralPK.setIdDocto(tdExpExperienciaLaboralDTO.getIdDocto());
        tdExpExperienciaLaboralPK.setRfcEmpleado(tdExpExperienciaLaboralDTO.getRfcEmpleado());
        tdExpExperienciaLaboralPK.setExpSecuencia(tdExpExperienciaLaboralDTO.getExpSecuencia());

        // Paso 2) Obtiene registro
        TdExpExperienciaLaboral tdExpExperienciaLaboral = super.persistence().get(TdExpExperienciaLaboralDAO.class).getById(tdExpExperienciaLaboralPK);

        // Paso 3) Elimina registro
        super.persistence().get(TdExpExperienciaLaboralDAO.class).delete(tdExpExperienciaLaboral);
    }
    
    /**
     * Obtiene datos del empleado - Alta de experiencia laboral
     * @author Gualberto G.
     * @param rfcEmpleado
     * @param expSecuencia
     * @param idDocto
     * @return TdExpExperienciaLaboralDTO
     */
    public TdExpExperienciaLaboralDTO getExpedienteExperienciaLaboral(String rfcEmpleado, Integer expSecuencia, String idDocto) {
        TdExpExperienciaLaboralPK pk = new TdExpExperienciaLaboralPK();
        pk.setIdDocto(idDocto);
        pk.setRfcEmpleado(rfcEmpleado);
        pk.setExpSecuencia(expSecuencia);

        TdExpExperienciaLaboral tdExpExperienciaLaboral = super.persistence().get(TdExpExperienciaLaboralDAO.class).getById(pk);
        return super.transformation().map(tdExpExperienciaLaboral, TdExpExperienciaLaboralDTO.class);
    }
    
    /**
     * Guarda registro - Alta de experiencia laboral
     * @author Gualberto G.
     * @param tdExpExperienciaLaboralDTO
     */
    public void saveExpedienteExperienciaLaboral(TdExpExperienciaLaboralDTO tdExpExperienciaLaboralDTO) {
        // Paso 1) Obtener la secuencia
        List<TdExpExperienciaLaboral> tdExpExperienciaLaboralList = super.persistence().get(QueryTdExpExperienciaLaboralDAO.class).getSequenceAltaExperienciaLaboral();
        TdExpExperienciaLaboral sequence = tdExpExperienciaLaboralList.get(0);
        tdExpExperienciaLaboralDTO.setExpSecuencia(sequence.getExpSecuencia());

        // Paso 2) Formar la llave
        TdExpExperienciaLaboral tdExpExperienciaLaboral = super.transformation().map(tdExpExperienciaLaboralDTO, TdExpExperienciaLaboral.class);
        TdExpExperienciaLaboralPK pk = new TdExpExperienciaLaboralPK();
        pk.setIdDocto(tdExpExperienciaLaboralDTO.getIdDocto());
        pk.setRfcEmpleado(tdExpExperienciaLaboralDTO.getRfcEmpleado());
        pk.setExpSecuencia(tdExpExperienciaLaboralDTO.getExpSecuencia());
        tdExpExperienciaLaboral.setIdentity(pk);

        // Paso 3) Guardar registro
        super.persistence().get(TdExpExperienciaLaboralDAO.class).save(tdExpExperienciaLaboral);
    }
    
    /**
     * Autoriza/Rechaza registro - Alta de experiencia laboral
     * @author Gualberto G.
     * @param tdExpExperienciaLaboralDTO
     */
    public void saveAutorizaRechazaExpedienteExperienciaLaboral(TdExpExperienciaLaboralDTO tdExpExperienciaLaboralDTO) {
        // Paso 1) Obtener datos del rfc
        TdExpExperienciaLaboral tdExpExperienciaLaboral = super.transformation().map(tdExpExperienciaLaboralDTO, TdExpExperienciaLaboral.class);

        // Paso 2) Actualiza registro
        super.persistence().get(TdExpExperienciaLaboralDAO.class).save(tdExpExperienciaLaboral);
    }
    
    /**
     * Actualiza registros activos a historico - Alta de experiencia laboral
     * @author Gualberto G.
     * @param rfcEmpleado
     */
    public void updateActivosToHistoricoExpedienteExperienciaLaboral(String rfcEmpleado) {
        super.persistence().get(CustomDocExpedienteDAO.class).updateActivosToHistoricoExpedienteExperienciaLaboral(rfcEmpleado);
    }

    /******************************************************************************************************************************************************************************/

    /**
     * Total Registrados/Rechazados - Alta de domicilio particular
     * @author Oscar S.
     * @param rfcEmpleado string
     * @param tipo String
     * @return total Integer
     */
    public Integer getTotalExpedienteDomicilio(String rfcEmpleado, String tipo) {
        Integer total = 0;

        if (tipo.equals("REG")) {
            List<TotalRegistrosExpediente> tdExpDomicilioList = super.persistence().get(QueryTdExpDomicilioParticularDAO.class).getTotalRegistradosExpedienteDomicilio(rfcEmpleado);
            TotalRegistrosExpediente totalRegistrados = tdExpDomicilioList.get(0);
            total = totalRegistrados.getTotalRegistrados();
        } else {
            List<TotalRegistrosExpediente> tdExpDomicilioList = super.persistence().get(QueryTdExpDomicilioParticularDAO.class).getTotalRechazadosExpedienteDomicilio(rfcEmpleado);
            TotalRegistrosExpediente totalRechazados = tdExpDomicilioList.get(0);
            total = totalRechazados.getTotalRechazados();
        }
        return total;
    }

    /**
     * Guarda Expediente - Alta de domicilio particular
     * @author Oscar S.
     * @param tdExpDomicilioDTO TdExpDomicilioParticularDTO
     */
    public void saveExpedienteDomicilio(TdExpDomicilioParticularDTO tdExpDomicilioDTO) {
        // Paso 1) Obtener la secuencia
        List<TdExpDomicilioParticular> tdExpDomicilioParticularList = super.persistence().get(QueryTdExpDomicilioParticularDAO.class).getSequenceAltaDomicilio();
        TdExpDomicilioParticular sequence = tdExpDomicilioParticularList.get(0);
        tdExpDomicilioDTO.setDomSecuencia(sequence.getDomSecuencia());

        // Paso 2) Formar la llave
        TdExpDomicilioParticular tdExpDomicilioParticular = super.transformation().map(tdExpDomicilioDTO, TdExpDomicilioParticular.class);
        TdExpDomicilioParticularPK pk = new TdExpDomicilioParticularPK();
        pk.setIdDocto(tdExpDomicilioDTO.getIdDocto());
        pk.setRfcEmpleado(tdExpDomicilioDTO.getRfcEmpleado());
        pk.setDomSecuencia(tdExpDomicilioDTO.getDomSecuencia());
        tdExpDomicilioParticular.setIdentity(pk);

        // Paso 3) Guardar registro
        super.persistence().get(TdExpDomicilioParticularDAO.class).save(tdExpDomicilioParticular);
    }

    /**
     * Borra Expediente - Alta de domicilio particular
     * @author Oscar S.
     * @param tdExpDomicilioDTO TdExpDomicilioParticularDTO
     */
    public void deleteExpedienteDomicilio(TdExpDomicilioParticularDTO tdExpDomicilioDTO) {
        // Paso 1) Formar la llave
        TdExpDomicilioParticularPK tdExpDomicilioParticularPK = new TdExpDomicilioParticularPK();
        tdExpDomicilioParticularPK.setIdDocto(tdExpDomicilioDTO.getIdDocto());
        tdExpDomicilioParticularPK.setRfcEmpleado(tdExpDomicilioDTO.getRfcEmpleado());
        tdExpDomicilioParticularPK.setDomSecuencia(tdExpDomicilioDTO.getDomSecuencia());

        // Paso 2) Obtiene registro
        TdExpDomicilioParticular tdExpDomicilioParticular = super.persistence().get(TdExpDomicilioParticularDAO.class).getById(tdExpDomicilioParticularPK);

        // Paso 3) Elimina registro
        super.persistence().get(TdExpDomicilioParticularDAO.class).delete(tdExpDomicilioParticular);
    }

    /**
     * Actualiza registros activos a historico - Alta de domicilio particular
     * @author Oscar S.
     * @param rfcEmpleado String
     */
    public void updateActivosToHistoricoExpedienteDomicilio(String rfcEmpleado) {
        super.persistence().get(CustomDocExpedienteDAO.class).updateActivosToHistoricoExpedienteDomicilio(rfcEmpleado);
    }

    /**
     * Obtiene datos - Alta de domicilio particular
     * @author Oscar S.
     * @param rfcEmpleado String
     * @param domSecuencia Integer
     * @param idDocto String
     * @return TdExpDoctosSinDatoDTO
     */
    public TdExpDomicilioParticularDTO getExpedienteDomicilio(String rfcEmpleado, Integer domSecuencia, String idDocto) {
        TdExpDomicilioParticularPK pk = new TdExpDomicilioParticularPK();
        pk.setIdDocto(idDocto);
        pk.setRfcEmpleado(rfcEmpleado);
        pk.setDomSecuencia(domSecuencia);

        TdExpDomicilioParticular tdExpDomicilioParticular = super.persistence().get(TdExpDomicilioParticularDAO.class).getById(pk);
        return super.transformation().map(tdExpDomicilioParticular, TdExpDomicilioParticularDTO.class);
    }

    /**
     * Autoriza/Rechaza registro - Alta de domicilio particular
     * @author Oscar S.
     * @param tdExpDomicilioParticularDTO TdExpDomicilioParticularDTO
     */
    public void saveAutorizaRechazaExpedienteDomicilio(TdExpDomicilioParticularDTO tdExpDomicilioParticularDTO) {
        // Paso 1) Obtener datos del rfc
        TdExpDomicilioParticular tdExpDomicilioParticular = super.transformation().map(tdExpDomicilioParticularDTO, TdExpDomicilioParticular.class);

        // Paso 2) Actualiza registro
        super.persistence().get(TdExpDomicilioParticularDAO.class).save(tdExpDomicilioParticular);
    }

    /**
     * Obtiene la lista de municipios de la entidad federativa
     * @author MCS
     * @param entidadFederativa Integer
     */
    public List<String> getMunicipiosByEntidadFederativa(Integer entidadFederativa){
        List<String> lMunicipios = new ArrayList<String>();
        List<TcMunicipio> lTcMunicipio = super.persistence().get(QueryTdExpDomicilioParticularDAO.class).getMunicipiosByEntidadFederativa(entidadFederativa);
        
        for(TcMunicipio elemento : lTcMunicipio){
            lMunicipios.add(elemento.getIdMunicipio() + " - " + elemento.getDescMunicipio());
        }
        return lMunicipios;
    }
    
    /**
     * Obtiene la lista de Codogos postales del municipio en la entidad federativa
     * @author MCS
     * @param entidadFederativa Integer
     * @param municipio Integer
     */
    public List<String> getCpsByEntidadFederativaAndMunicipios(Integer entidadFederativa, Integer municipio){
        List<String> lCodigosPostales = new ArrayList<String>();
        List<TcCodigoPostal> lTcCodigoPostal = super.persistence().get(QueryTdExpDomicilioParticularDAO.class).getCpsByEntidadFederativaAndMunicipios(entidadFederativa, municipio);
        
        for(TcCodigoPostal cp : lTcCodigoPostal){
            lCodigosPostales.add(cp.getIdCodPost());
        }
        return lCodigosPostales;
    }
    
     /**
      * Obtiene la lista de colonias del codigo postal
      * @author MCS
      * @param codigoPostal Integer
      */
    public List<String> getColoniasByCodigoPostal(String codigoPostal){
        List<String> lColonias = new ArrayList<String>();
        List<TcCodigoPostal> lTcCodigoPostal = super.persistence().get(QueryTdExpDomicilioParticularDAO.class).getColoniasByCodigoPostal(codigoPostal);
        
        for(TcCodigoPostal cp : lTcCodigoPostal){
            lColonias.add(codigoPostal + " - " + cp.getColonia());
        }
        return lColonias;
    }
    /******************************************************************************************************************************************************************************/

    /**
     * Obtiene datos - Alta de Acta de nacimiento
     * @author Armando Zuñiga
     * @param rfcEmpleado String
     * @param tipo String
     * @return TdExpDoctosSinDatoDTO
     */
    public Integer getTotalExpedienteDatosNacimiento(String rfcEmpleado, String tipo) {
        Integer total = 0;

        if (tipo.equals("REG")) {
            List<TotalRegistrosExpediente> tdExpDatosNacimientoList = super.persistence().get(QueryTdExpDatosNacimientoDAO.class).getTotalRegistradosExpedienteDatosNacimiento(rfcEmpleado);
            TotalRegistrosExpediente totalRegistrados = tdExpDatosNacimientoList.get(0);
            total = totalRegistrados.getTotalRegistrados();
        } else {
            List<TotalRegistrosExpediente> tdExpDatosNacimientoList = super.persistence().get(QueryTdExpDatosNacimientoDAO.class).getTotalRechazadosExpedienteDatosNacimiento(rfcEmpleado);
            TotalRegistrosExpediente totalRechazados = tdExpDatosNacimientoList.get(0);
            total = totalRechazados.getTotalRechazados();
        }
        return total;
    }

    /**
     * Borra Expediente - Alta de Acta de nacimiento
     * @author Armando Zuñiga
     * @param tdExpDatosNacimientoDTO TdExpDatosNacimientoDTO
     */
    public void deleteExpedienteDatosNacimiento(TdExpDatosNacimientoDTO tdExpDatosNacimientoDTO) {
        // Paso 1) Formar la llave
        TdExpDatosNacimientoPK tdExpDatosNacimientoPK = new TdExpDatosNacimientoPK();
        tdExpDatosNacimientoPK.setIdDocto(tdExpDatosNacimientoDTO.getIdDocto());
        tdExpDatosNacimientoPK.setRfcEmpleado(tdExpDatosNacimientoDTO.getRfcEmpleado());
        tdExpDatosNacimientoPK.setDnaSecuencia(tdExpDatosNacimientoDTO.getDnaSecuencia());

        // Paso 2) Obtiene registro
        TdExpDatosNacimiento tdExpDatosNacimiento = super.persistence().get(TdExpDatosNacimientoDAO.class).getById(tdExpDatosNacimientoPK);

        // Paso 3) Elimina registro
        super.persistence().get(TdExpDatosNacimientoDAO.class).delete(tdExpDatosNacimiento);
    }

    /**
     * Guarda Expediente - Alta de Acta de nacimiento
     * @author Armando Zuñiga
     * @param tdExpDatosNacimientoDTO TdExpDatosNacimientoDTO
     */
    public void saveExpedienteDatosNacimiento(TdExpDatosNacimientoDTO tdExpDatosNacimientoDTO) {
        // Paso 1) Obtener la secuencia
        List<TdExpDatosNacimiento> tdExpDatosNacimientoList = super.persistence().get(QueryTdExpDatosNacimientoDAO.class).getSequenceAltaDatosNacimiento();
        TdExpDatosNacimiento sequence = tdExpDatosNacimientoList.get(0);
        tdExpDatosNacimientoDTO.setDnaSecuencia(sequence.getDnaSecuencia());

        // Paso 2) Formar la llave
        TdExpDatosNacimiento tdExpDatosNacimiento = super.transformation().map(tdExpDatosNacimientoDTO, TdExpDatosNacimiento.class);
        TdExpDatosNacimientoPK pk = new TdExpDatosNacimientoPK();
        pk.setIdDocto(tdExpDatosNacimientoDTO.getIdDocto());
        pk.setRfcEmpleado(tdExpDatosNacimientoDTO.getRfcEmpleado());
        pk.setDnaSecuencia(tdExpDatosNacimientoDTO.getDnaSecuencia());
        tdExpDatosNacimiento.setIdentity(pk);

        // Paso 3) Guardar registro
        super.persistence().get(TdExpDatosNacimientoDAO.class).save(tdExpDatosNacimiento);
    }

    /**
     * Actualiza registros activos a historico - Alta de Acta de nacimiento
     * @author Armando Zuñiga
     * @param rfcEmpleado String
     */
    public void updateActivosToHistoricoExpedienteDatosNacimiento(String rfcEmpleado) {
        super.persistence().get(CustomDocExpedienteDAO.class).updateActivosToHistoricoExpedienteDatosNacimiento(rfcEmpleado);
    }

    /**
     * Obtiene datos - Alta de Acta de nacimiento
     * @author Armando Zuñiga
     * @param rfcEmpleado String
     * @param domSecuencia Integer
     * @param idDocto String
     * @return TdExpDatosNacimientoDTO
     */
    public TdExpDatosNacimientoDTO getExpedienteDatosNacimiento(String rfcEmpleado, Integer domSecuencia, String idDocto) {
        TdExpDatosNacimientoPK pk = new TdExpDatosNacimientoPK();
        pk.setIdDocto(idDocto);
        pk.setRfcEmpleado(rfcEmpleado);
        pk.setDnaSecuencia(domSecuencia);

        TdExpDatosNacimiento tdExpDatosNacimiento = super.persistence().get(TdExpDatosNacimientoDAO.class).getById(pk);
        return super.transformation().map(tdExpDatosNacimiento, TdExpDatosNacimientoDTO.class);
    }

    /**
     * Autoriza/Rechaza registro - Alta de Acta de nacimiento
     * @author Armando Zuñiga
     * @param tdExpDatosNacimientoDTO TdExpDatosNacimientoDTO
     */
    public void saveAutorizaRechazaExpedienteDatosNacimiento(TdExpDatosNacimientoDTO tdExpDatosNacimientoDTO) {
        // Paso 1) Obtener datos del rfc
        TdExpDatosNacimiento tdExpDatosNacimiento = super.transformation().map(tdExpDatosNacimientoDTO, TdExpDatosNacimiento.class);

        // Paso 2) Actualiza registro
        super.persistence().get(TdExpDatosNacimientoDAO.class).save(tdExpDatosNacimiento);
    }

    /******************************************************************************************************************************************************************************/

    /**
     * Obtiene datos del empleado - Alta de antecedentes academicos
     * @author Gualberto G.
     * @param rfcEmpleado String
     * @param aacSecuencia Integer
     * @param idDocto String
     * @return TdExpAntecedentesAcademicoDTO
     */
    public TdExpAntecedentesAcademicoDTO getExpedienteAntecedentesAcademicos(String rfcEmpleado, Integer aacSecuencia, String idDocto) {
        TdExpAntecedentesAcademicoPK pk = new TdExpAntecedentesAcademicoPK();
        pk.setRfcEmpleado(rfcEmpleado);
        pk.setAacSecuencia(aacSecuencia);
        pk.setIdDocto(idDocto);

        TdExpAntecedentesAcademicos tdExpAntecedentesAcademico = super.persistence().get(TdExpAntecedentesAcademicoDAO.class).getById(pk);
        return super.transformation().map(tdExpAntecedentesAcademico, TdExpAntecedentesAcademicoDTO.class);
    }
    
    /**
     * Guarda registro - Alta de antecedentes acedemicos
     * @author Gualberto G.
     * @param tdExpAntecedentesAcademicoDTO TdExpAntecedentesAcademicoDTO
     */
    public void saveExpedienteAntecedentesAcademicos(TdExpAntecedentesAcademicoDTO tdExpAntecedentesAcademicoDTO) {
        // Paso 1) Obtener la secuencia
        List<TdExpAntecedentesAcademicos> tdExpAntecedentesAcademicoList = super.persistence().get(QueryTdExpAntecedentesAcademicoDAO.class).getSequenceAltaAntecedentesAcademicos();
        TdExpAntecedentesAcademicos sequence = tdExpAntecedentesAcademicoList.get(0);
        tdExpAntecedentesAcademicoDTO.setAacSecuencia(sequence.getAacSecuencia());

        // Paso 2) Formar la llave
        TdExpAntecedentesAcademicos tdExpAntecedentesAcademico = super.transformation().map(tdExpAntecedentesAcademicoDTO, TdExpAntecedentesAcademicos.class);
        TdExpAntecedentesAcademicoPK pk = new TdExpAntecedentesAcademicoPK();
        pk.setIdDocto(tdExpAntecedentesAcademicoDTO.getIdDocto());
        pk.setRfcEmpleado(tdExpAntecedentesAcademicoDTO.getRfcEmpleado());
        pk.setAacSecuencia(sequence.getAacSecuencia());
        tdExpAntecedentesAcademico.setIdentity(pk);

        // Paso 3) Guardar registro
        super.persistence().get(TdExpAntecedentesAcademicoDAO.class).save(tdExpAntecedentesAcademico);
    }
    
    /**
     * Elimina registro - Alta de antecedentes acedemicos
     * @author Gualberto G.
     * @param tdExpAntecedentesAcademicoDTO TdExpAntecedentesAcademicoDTO
     */
    public void deleteExpedienteAntecedentesAcademicos(TdExpAntecedentesAcademicoDTO tdExpAntecedentesAcademicoDTO) {
        TdExpAntecedentesAcademicoPK pk = new TdExpAntecedentesAcademicoPK();
        pk.setIdDocto(tdExpAntecedentesAcademicoDTO.getIdDocto());
        pk.setRfcEmpleado(tdExpAntecedentesAcademicoDTO.getRfcEmpleado());
        pk.setAacSecuencia(tdExpAntecedentesAcademicoDTO.getAacSecuencia());
        TdExpAntecedentesAcademicos tdExpAntecedentesAcademico = super.persistence().get(TdExpAntecedentesAcademicoDAO.class).getById(pk);
        super.persistence().get(TdExpAntecedentesAcademicoDAO.class).delete(tdExpAntecedentesAcademico);
    }
    
    /**
     * Autoriza/Rechaza registro - Alta de antecedentes acedemicos
     * @author Gualberto G.
     * @param tdExpAntecedentesAcademicoDTO TdExpAntecedentesAcademicoDTO
     */
    public void saveAutorizaRechazaExpedienteAntecedentesAcademicos(TdExpAntecedentesAcademicoDTO tdExpAntecedentesAcademicoDTO) {
        // Paso 1) Obtener datos del registro
        TdExpAntecedentesAcademicos tdExpAntecedentesAcademico = super.transformation().map(tdExpAntecedentesAcademicoDTO, TdExpAntecedentesAcademicos.class);

        // Paso 2) Actualiza registro
        super.persistence().get(TdExpAntecedentesAcademicoDAO.class).save(tdExpAntecedentesAcademico);
    }
    
    /**
     * Obtiene total de registrados/rechazados - Alta de antecedentes acedemicos
     * @author Gualberto G.
     * @param rfcEmpleado String
     * @param tipo String
     * @return Integer
     */
    public Integer getTotalExpedienteAntecedentesAcademicos(String rfcEmpleado, String tipo) {
        Integer total = 0;

        if (tipo.equals("REG")) {
            List<TotalRegistrosExpediente> tdExpAntecedentesAcademicosList = super.persistence().get(QueryTdExpAntecedentesAcademicoDAO.class).getTotalRegistradosExpedienteAntecedentesAcademicos(rfcEmpleado);
            TotalRegistrosExpediente totalRegistrados = tdExpAntecedentesAcademicosList.get(0);
            total = totalRegistrados.getTotalRegistrados();
        } else {
            List<TotalRegistrosExpediente> tdExpAntecedentesAcademicosList = super.persistence().get(QueryTdExpAntecedentesAcademicoDAO.class).getTotalRechazadosExpedienteAntecedentesAcademicos(rfcEmpleado);
            TotalRegistrosExpediente totalRechazados = tdExpAntecedentesAcademicosList.get(0);
            total = totalRechazados.getTotalRechazados();
        }
        return total;
    }
    
    /**
     * Actualiza registros activos a historico - Alta de antecedentes acedemicos
     * @author Gualberto G.
     * @param rfcEmpleado String
     */
    public void updateActivosToHistoricoExpedienteAntecedentesAcademicos(String rfcEmpleado) {
        super.persistence().get(CustomDocExpedienteDAO.class).updateActivosToHistoricoExpedienteAntecedentesAcademicos(rfcEmpleado);
    }

    /******************************************************************************************************************************************************************************/

    /**
     * Borra Expediente - Alta de fechas laborales
     * @author Carolina H.
     * @param tdExpFechasLaboralesDTO TdExpFechasLaboralesDTO
     */
    public void deleteExpedienteFechasLaborales(TdExpFechasLaboralesDTO tdExpFechasLaboralesDTO) {
        // Paso 1) Formar la llave
        TdExpFechasLaboralesPK tdExpFechasLaboralesPK = new TdExpFechasLaboralesPK();
        tdExpFechasLaboralesPK.setIdDocto(tdExpFechasLaboralesDTO.getIdDocto());
        tdExpFechasLaboralesPK.setRfcEmpleado(tdExpFechasLaboralesDTO.getRfcEmpleado());
        tdExpFechasLaboralesPK.setFelSecuencia(tdExpFechasLaboralesDTO.getFelSecuencia());

        // Paso 2) Obtiene registro
        TdExpFechasLaborales tdExpFechasLaborales = super.persistence().get(TdExpFechasLaboralesDAO.class).getById(tdExpFechasLaboralesPK);

        // Paso 3) Elimina registro
        super.persistence().get(TdExpFechasLaboralesDAO.class).delete(tdExpFechasLaborales);
    }

    /**
     * Guarda  - Fechas Laborales
     * @author 
     * @param tdExpFechasLaboralesDTO TdExpFechasLaboralesDTO
     */
    public void saveExpedienteFechasLaborales(TdExpFechasLaboralesDTO tdExpFechasLaboralesDTO) {
        // Paso 1) Obtener la secuencia
        List<TdExpFechasLaborales> tdExpFechasLaboralesList = super.persistence().get(QueryTdExpFechasLaboralesDAO.class).getSequenceAltaFechasLaborales();
        TdExpFechasLaborales sequence = tdExpFechasLaboralesList.get(0);
        tdExpFechasLaboralesDTO.setFelSecuencia(sequence.getFelSecuencia());

        // Paso 2) Formar la llave
        TdExpFechasLaborales tdExpFechasLaborales = super.transformation().map(tdExpFechasLaboralesDTO, TdExpFechasLaborales.class);
        TdExpFechasLaboralesPK pk = new TdExpFechasLaboralesPK();
        pk.setIdDocto(tdExpFechasLaboralesDTO.getIdDocto());
        pk.setRfcEmpleado(tdExpFechasLaborales.getRfcEmpleado());
        pk.setFelSecuencia(tdExpFechasLaboralesDTO.getFelSecuencia());
        tdExpFechasLaborales.setIdentity(pk);

        // Paso 3) Guardar registro
        super.persistence().get(TdExpFechasLaboralesDAO.class).save(tdExpFechasLaborales);
    }

    /**
     * Actualiza registros activos a historico - Fechas laborales
     * @author Carolina H.
     * @param rfcEmpleado String
     */
    public void updateActivosToHistoricoExpedienteFechasLaborales(String rfcEmpleado) {
        super.persistence().get(CustomDocExpedienteDAO.class).updateActivosToHistoricoExpedienteFechasLaborales(rfcEmpleado);
    }

    /**
     * Obtiene datos - Fechas laborales
     * @author Carolina H.
     * @param rfcEmpleado String
     * @param felSecuencia Integer
     * @param idDocto String
     * @return TdExpFechasLaboralesDTO
     */
    public TdExpFechasLaboralesDTO getExpedienteFechasLaborales(String rfcEmpleado, Integer felSecuencia, String idDocto) {
        TdExpFechasLaboralesPK pk = new TdExpFechasLaboralesPK();
        pk.setIdDocto(idDocto);
        pk.setRfcEmpleado(rfcEmpleado);
        pk.setFelSecuencia(felSecuencia);

        TdExpFechasLaborales tdExpFechasLaborales = super.persistence().get(TdExpFechasLaboralesDAO.class).getById(pk);
        return super.transformation().map(tdExpFechasLaborales, TdExpFechasLaboralesDTO.class);
    }

    /**
     * Autoriza/Rechaza registro - Fechas laborales
     * @author 
     * @param tdExpFechasLaboralesDTO TdExpFechasLaboralesDTO
     */
    public void saveAutorizaRechazaExpedienteFechasLaborales(TdExpFechasLaboralesDTO tdExpFechasLaboralesDTO) {
        // Paso 1) Obtener datos del rfc
        TdExpFechasLaborales tdExpFechasLaborales = super.transformation().map(tdExpFechasLaboralesDTO, TdExpFechasLaborales.class);

        // Paso 2) Actualiza registro
        super.persistence().get(TdExpFechasLaboralesDAO.class).save(tdExpFechasLaborales);
    }

    /**
     * Obtiene total de autorizados/rechazados - Fechas laborales
     * @author Carolina H.
     * @param rfcEmpleado String
     * @param tipo String
     * @return Integer
     */
    public Integer getTotalExpedienteFechasLaborales(String rfcEmpleado, String tipo) {
        Integer total = 0;

        if (tipo.equals("REG")) {
            List<TotalRegistrosExpediente> tdExpFechasLaboralesList = super.persistence().get(QueryTdExpFechasLaboralesDAO.class).getTotalRegistradosExpedienteFechasLaborales(rfcEmpleado);
            TotalRegistrosExpediente totalRegistrados = tdExpFechasLaboralesList.get(0);
            total = totalRegistrados.getTotalRegistrados();
        } else {
            List<TotalRegistrosExpediente> tdExpFechasLaboralesList = super.persistence().get(QueryTdExpFechasLaboralesDAO.class).getTotalRechazadosExpedienteFechasLaborales(rfcEmpleado);
            TotalRegistrosExpediente totalRechazados = tdExpFechasLaboralesList.get(0);
            total = totalRechazados.getTotalRechazados();
        }
        return total;
    }

    /******************************************************************************************************************************************************************************/

    /**
     * Obtiene datos - Alta de capaticacion y cursos
     * @author Armando Z
     * @param rfcEmpleado String      
     * @return TdExpDoctosSinDatoDTO
     */
    public Integer getTotalExpedienteCapacitacionCursos(String rfcEmpleado, String string) {
        Integer total = 0;

        if (string.equals("REG")) {
            List<TotalRegistrosExpediente> tdExpCapacitacionCursosList = super.persistence().get(QueryTdExpCapacitacionCursosDAO.class).getTotalRegistradosExpedienteCapacitacionCursos(rfcEmpleado);
            TotalRegistrosExpediente totalRegistrados = tdExpCapacitacionCursosList.get(0);
            total = totalRegistrados.getTotalRegistrados();
        } else {
            List<TotalRegistrosExpediente> tdExpCapacitacionCursosList = 
                super.persistence().get(QueryTdExpCapacitacionCursosDAO.class).getTotalRechazadosExpedienteCapacitacionCursos(rfcEmpleado);
            TotalRegistrosExpediente totalRechazados = tdExpCapacitacionCursosList.get(0);
            total = totalRechazados.getTotalRechazados();
        }
        return total;
    }
    
    /**
     * Borra Expediente - Alta de de capacitación y cursos
     * @author Armando Z
     * @param tdExpCapacitacionDTO TdExpCapacitacionDTO
     */
    public void deleteExpedienteCapacitacionCursos(TdExpCapacitacionDTO tdExpCapacitacionDTO) {
        // Paso 1) Formar la llave
        TdExpCapacitacionPK tdExpCapacitacionPK = new TdExpCapacitacionPK();
        tdExpCapacitacionPK.setIdDocto(tdExpCapacitacionDTO.getIdDocto());
        tdExpCapacitacionPK.setRfcEmpleado(tdExpCapacitacionDTO.getRfcEmpleado());
        tdExpCapacitacionPK.setCapSecuencia(tdExpCapacitacionDTO.getCapSecuencia());

        // Paso 2) Obtiene registro
        TdExpCapacitacion tdExpCapacitacion = super.persistence().get(TdExpCapacitacionDAO.class).getById(tdExpCapacitacionPK);

        // Paso 3) Elimina registro
        super.persistence().get(TdExpCapacitacionDAO.class).delete(tdExpCapacitacion);
    }
    
    /**
     * Guarda Expediente - Alta de de capacitación y cursos
     * @author Armando Z
     * @param tdExpCapacitacionDTO TdExpCapacitacionDTO
     */
    public void saveExpedienteCapacitacionCursos(TdExpCapacitacionDTO tdExpCapacitacionDTO) {
        // Paso 1) Obtener la secuencia
        List<TdExpCapacitacion> tdExpCapacitacionList = super.persistence().get(QueryTdExpCapacitacionCursosDAO.class).getSequenceAltaCapacitacionCursos();
        TdExpCapacitacion sequence = tdExpCapacitacionList.get(0);
        tdExpCapacitacionDTO.setCapSecuencia(sequence.getCapSecuencia());

        // Paso 2) Formar la llave
        TdExpCapacitacion tdExpCapacitacion = super.transformation().map(tdExpCapacitacionDTO, TdExpCapacitacion.class);
        TdExpCapacitacionPK pk = new TdExpCapacitacionPK();
        pk.setIdDocto(tdExpCapacitacionDTO.getIdDocto());
        pk.setRfcEmpleado(tdExpCapacitacionDTO.getRfcEmpleado());
        pk.setCapSecuencia(tdExpCapacitacionDTO.getCapSecuencia());
        tdExpCapacitacion.setIdentity(pk);

        // Paso 3) Guardar registro
        super.persistence().get(TdExpCapacitacionDAO.class).save(tdExpCapacitacion);
    }
    
    /**
     * Actualiza registros activos a historico - Alta de de capacitación y cursos
     * @author Armando Z
     * @param rfcEmpleado String
     */
    public void updateActivosToHistoricoExpedienteCapacitacionCursos(String rfcEmpleado) {
        super.persistence().get(CustomDocExpedienteDAO.class).updateActivosToHistoricoExpedienteCapacitacionCursos(rfcEmpleado);
    }
    
    /**
     * Obtiene datos - Alta de de capacitación y cursos
     * @author Armando Z
     * @param rfcEmpleado String
     * @param domSecuencia Integer
     * @param idDocto String
     * @return TdExpCapacitacionDTO
     */
    public TdExpCapacitacionDTO getExpedienteCapacitacionCursos(String rfcEmpleado, Integer domSecuencia, String idDocto) {
        TdExpCapacitacionPK pk = new TdExpCapacitacionPK();
        pk.setIdDocto(idDocto);
        pk.setRfcEmpleado(rfcEmpleado);
        pk.setCapSecuencia(domSecuencia);

        TdExpCapacitacion tdExpCapacitacion = super.persistence().get(TdExpCapacitacionDAO.class).getById(pk);
        return super.transformation().map(tdExpCapacitacion, TdExpCapacitacionDTO.class);
    }
    
    /**
     * Autoriza/Rechaza registro - Alta de cuentas bancarias
     * @author Armando Z
     * @param tdExpCapacitacionDTO saveAutorizaRechazaExpedienteCapacitacionCursos
     */
    public void saveAutorizaRechazaExpedienteCapacitacionCursos(TdExpCapacitacionDTO tdExpCapacitacionDTO) {
        // Paso 1) Obtener datos del rfc
        TdExpCapacitacion tdExpCapacitacion = super.transformation().map(tdExpCapacitacionDTO, TdExpCapacitacion.class);

        // Paso 2) Actualiza registro
        super.persistence().get(TdExpCapacitacionDAO.class).save(tdExpCapacitacion);
    }

    /******************************************************************************************************************************************************************************/

    /**
     * Total Registrados/Rechazados - Alta de cuentas bancarias
     * @author Cesar B.
     * @param rfcEmpleado string
     * @param tipo String
     * @return total Integer
     */
    public Integer getTotalExpedienteCuentasBancarias(String rfcEmpleado, String tipo) {
        Integer total = 0;

        if (tipo.equals("REG")) {
            List<TotalRegistrosExpediente> tdExpCuentasBancariasList = super.persistence().get(QueryTdExpCuentasBancariasDAO.class).getTotalRegistradosExpedienteCuentasBancarias(rfcEmpleado);
            TotalRegistrosExpediente totalRegistrados = tdExpCuentasBancariasList.get(0);
            total = totalRegistrados.getTotalRegistrados();
        } else {
            List<TotalRegistrosExpediente> tdExpCuentasBancariasList = super.persistence().get(QueryTdExpCuentasBancariasDAO.class).getTotalRechazadosExpedienteCuentasBancarias(rfcEmpleado);
            TotalRegistrosExpediente totalRechazados = tdExpCuentasBancariasList.get(0);
            total = totalRechazados.getTotalRechazados();
        }
        return total;
    }

    /**
     * Guarda Expediente - Alta de cuentas bancarias
     * @author Cesar B.
     * @param tdExpCuentasBancariaDTO TdExpCuentasBancariaDTO
     */
    public void saveExpedienteCuentasBancarias(TdExpCuentasBancariaDTO tdExpCuentasBancariaDTO) {
        // Paso 1) Obtener la secuencia
        List<TdExpCuentasBancarias> tdExpCuentasBancariaList = super.persistence().get(QueryTdExpCuentasBancariasDAO.class).getSequenceAltaCuentasBancarias();
        TdExpCuentasBancarias sequence = tdExpCuentasBancariaList.get(0);
        tdExpCuentasBancariaDTO.setCtaSecuencia(sequence.getCtaSecuencia());

        // Paso 2) Formar la llave
        TdExpCuentasBancarias tdExpCuentasBancarias = super.transformation().map(tdExpCuentasBancariaDTO, TdExpCuentasBancarias.class);
        TdExpCuentasBancariaPK pk = new TdExpCuentasBancariaPK();
        pk.setIdDocto(tdExpCuentasBancariaDTO.getIdDocto());
        pk.setRfcEmpleado(tdExpCuentasBancariaDTO.getRfcEmpleado());
        pk.setCtaSecuencia(tdExpCuentasBancariaDTO.getCtaSecuencia());
        tdExpCuentasBancarias.setIdentity(pk);

        // Paso 3) Guardar registro
        super.persistence().get(TdExpCuentasBancariaDAO.class).save(tdExpCuentasBancarias);
    }

    /**
     * Borra Expediente - Alta de cuentas bancarias
     * @author Cesar B.
     * @param tdExpCuentasBancariaDTO TdExpCuentaBancariaDTO
     */
    public void deleteExpedienteCuentasBancarias(TdExpCuentasBancariaDTO tdExpCuentasBancariaDTO) {
        // Paso 1) Formar la llave
        TdExpCuentasBancariaPK tdExpCuentasBancariaPK = new TdExpCuentasBancariaPK();
        tdExpCuentasBancariaPK.setIdDocto(tdExpCuentasBancariaDTO.getIdDocto());
        tdExpCuentasBancariaPK.setRfcEmpleado(tdExpCuentasBancariaDTO.getRfcEmpleado());
        tdExpCuentasBancariaPK.setCtaSecuencia(tdExpCuentasBancariaDTO.getCtaSecuencia());

        // Paso 2) Obtiene registro
        TdExpCuentasBancarias tdExpCuentasBancarias = super.persistence().get(TdExpCuentasBancariaDAO.class).getById(tdExpCuentasBancariaPK);

        // Paso 3) Elimina registro
        super.persistence().get(TdExpCuentasBancariaDAO.class).delete(tdExpCuentasBancarias);
    }

    /**
     * Actualiza registros activos a historico - Alta de cuentas bancarias
     * @author Cesar b.
     * @param rfcEmpleado String
     */
    public void updateActivosToHistoricoExpedienteCuentasBancarias(String rfcEmpleado) {
        super.persistence().get(CustomDocExpedienteDAO.class).updateActivosToHistoricoExpedienteCuentasBancarias(rfcEmpleado);
    }

    /**
     * Obtiene datos - Alta de cuentas bancarias
     * @author Cesar B.
     * @param rfcEmpleado String
     * @param ctaSecuencia Integer
     * @param idDocto String
     * @return TdExpDoctosSinDatoDTO
     */
    public TdExpCuentasBancariaDTO getExpedienteCuentasBancarias(String rfcEmpleado, Integer ctaSecuencia, String idDocto) {
        TdExpCuentasBancariaPK pk = new TdExpCuentasBancariaPK();
        pk.setIdDocto(idDocto);
        pk.setRfcEmpleado(rfcEmpleado);
        pk.setCtaSecuencia(ctaSecuencia);

        TdExpCuentasBancarias tdExpCuentasBancarias = super.persistence().get(TdExpCuentasBancariaDAO.class).getById(pk);
        return super.transformation().map(tdExpCuentasBancarias, TdExpCuentasBancariaDTO.class);
    }

    /**
     * Autoriza/Rechaza registro - Alta de cuentas bancarias
     * @author Cesar B.
     * @param tdExpCuentasBancariaDTO TdExpCuentaBancariasDTO
     */
    public void saveAutorizaRechazaExpedienteCuentasBancarias(TdExpCuentasBancariaDTO tdExpCuentasBancariaDTO) {
        // Paso 1) Obtener datos del rfc
        TdExpCuentasBancarias tdExpCuentasBancarias = super.transformation().map(tdExpCuentasBancariaDTO, TdExpCuentasBancarias.class);

        // Paso 2) Actualiza registro
        super.persistence().get(TdExpCuentasBancariaDAO.class).save(tdExpCuentasBancarias);
    }

    /******************************************************************************************************************************************************************************/

    /**
     * Guarda registro - Alta de Cartilla Militar Nacional
     * @author Ricardo León.
     * @param tdExpCartillaMilitarDTO TdExpCartillaMilitarDTO
     */
    public void saveExpedienteCartillaMilitar(TdExpCartillaMilitarDTO tdExpCartillaMilitarDTO) {
        // Paso 1) Obtener la secuencia
        List<TdExpCartillaMilitar> tdExpCartillaMilitarList = super.persistence().get(QueryTdExpCartillaMilitarDAO.class).getSequenceAltaCartillaMilitar();
        TdExpCartillaMilitar sequence = tdExpCartillaMilitarList.get(0);
        tdExpCartillaMilitarDTO.setCmiSecuencia(sequence.getCmiSecuencia());

        // Paso 2) Formar la llave
        TdExpCartillaMilitar tdExpCartillaMilitar = super.transformation().map(tdExpCartillaMilitarDTO, TdExpCartillaMilitar.class);
        TdExpCartillaMilitarPK pk = new TdExpCartillaMilitarPK();
        pk.setIdDocto(tdExpCartillaMilitarDTO.getIdDocto());
        pk.setRfcEmpleado(tdExpCartillaMilitarDTO.getRfcEmpleado());
        pk.setCmiSecuencia(sequence.getCmiSecuencia());
        tdExpCartillaMilitar.setIdentity(pk);

        // Paso 3) Guardar registro
        super.persistence().get(TdExpCartillaMilitarDAO.class).save(tdExpCartillaMilitar);
    }

     /**
      * Obtiene total de autorizados / rechazados - Alta de Cartilla Militar Nacional
      * @author Ricardo León.
      * @param rfcEmpleado String
      * @param tipo String
      * @return Integer
      */
     public Integer getTotalExpedienteCartillaMilitar(String rfcEmpleado, String tipo) {
         Integer total = 0;

         if (tipo.equals("REG")) {
             List<TotalRegistrosExpediente> tdExpCartillaMilitarList = super.persistence().get(QueryTdExpCartillaMilitarDAO.class).getTotalRegistradosExpedienteCartillaMilitar(rfcEmpleado);
             TotalRegistrosExpediente totalRegistrados = tdExpCartillaMilitarList.get(0);
             total = totalRegistrados.getTotalRegistrados();
         } else {
             List<TotalRegistrosExpediente> tdExpCartillaMilitarList = super.persistence().get(QueryTdExpCartillaMilitarDAO.class).getTotalRechazadosExpedienteCartillaMilitar(rfcEmpleado);
             TotalRegistrosExpediente totalRechazados = tdExpCartillaMilitarList.get(0);
             total = totalRechazados.getTotalRechazados();
         }
         return total;
     }

     /**
      * Actualiza registros activos a historico - Alta de Cartilla Militar Nacional
      * @author Ricardo León.
      * @param rfcEmpleado String
      */
     public void updateActivosToHistoricoExpedienteCartillaMilitar(String rfcEmpleado) {
         super.persistence().get(CustomDocExpedienteDAO.class).updateActivosToHistoricoExpedienteCartillaMilitar(rfcEmpleado);
     }

     /**
      * Obtiene datos del rfc - Alta de Cartilla Militar Nacional
      * @author Ricardo León.
      * @param rfcEmpleado String
      * @param CmiSecuencia Integer
      * @param idDocto String
      * @return TdEmpleadoDTO
      */
     public TdExpCartillaMilitarDTO getExpedienteCartillaMilitar(String rfcEmpleado, Integer CmiSecuencia, String idDocto) {
         TdExpCartillaMilitarPK pk = new TdExpCartillaMilitarPK();
         pk.setRfcEmpleado(rfcEmpleado);
         pk.setCmiSecuencia(CmiSecuencia);
         pk.setIdDocto(idDocto);

         TdExpCartillaMilitar tdExpCartillaMilitar = super.persistence().get(TdExpCartillaMilitarDAO.class).getById(pk);
         return super.transformation().map(tdExpCartillaMilitar, TdExpCartillaMilitarDTO.class);
     }

     /**
      * Autoriza / Rechaza registro - Alta de Cartilla Militar Nacional
      * @author Ricardo León.
      * @param tdExpCartillaMilitarDTO TdExpCartillaMilitarDTO
      */        
     public void saveAutorizaRechazaExpedienteCartillaMilitar(TdExpCartillaMilitarDTO tdExpCartillaMilitarDTO) {
         // Paso 1) Obtener datos del rfc
         TdExpCartillaMilitar tdExpCartillaMilitar = super.transformation().map(tdExpCartillaMilitarDTO, TdExpCartillaMilitar.class);

         // Paso 2) Actualiza registro
         super.persistence().get(TdExpCartillaMilitarDAO.class).save(tdExpCartillaMilitar);
     }
     
    /**
     * Elimina registro - Alta de cartilla militar nacional
     * @author Ricardo León.
     * @param tdExpCartillaMilitarDTO TdExpCartillaMilitarpDTO
     */
    public void deleteExpedienteCartillaMilitar(TdExpCartillaMilitarDTO tdExpCartillaMilitarDTO) {
        // Paso 1) Formar la llave
        TdExpCartillaMilitarPK tdExpCartillaMilitarPK = new TdExpCartillaMilitarPK();
        tdExpCartillaMilitarPK.setIdDocto(tdExpCartillaMilitarDTO.getIdDocto());
        tdExpCartillaMilitarPK.setRfcEmpleado(tdExpCartillaMilitarDTO.getRfcEmpleado());
        tdExpCartillaMilitarPK.setCmiSecuencia(tdExpCartillaMilitarDTO.getCmiSecuencia());

        // Paso 2) Obtiene registro
        TdExpCartillaMilitar tdExpCartillaMilitar = super.persistence().get(TdExpCartillaMilitarDAO.class).getById(tdExpCartillaMilitarPK);

        // Paso 3) Elimina registro
        super.persistence().get(TdExpCartillaMilitarDAO.class).delete(tdExpCartillaMilitar);
    }
    
    /******************************************************************************************************************************************************************************/
    
    /**
     * Guarda registro - Datos Complementarios
     * @author Ricardo León.
     * @param tdExpDatosComplementariosDTO TdExpDatosComplementariosDTO
     */
    public void saveExpedienteDatosComplementarios(TdExpDatosComplementariosDTO tdExpDatosComplementariosDTO) {
        // Paso 1) Obtener la secuencia
        TdExpDatosComplementarios tdExpDatosComplementarios = super.transformation().map(tdExpDatosComplementariosDTO, TdExpDatosComplementarios.class);

        // Paso 3) Guardar registro
        TdExpDatosComplementariosDAO tdExpDatosComplementarioDAO = super.persistence().get(TdExpDatosComplementariosDAO.class);
        tdExpDatosComplementarioDAO.save(tdExpDatosComplementarios);
    }
    
    /**
     * Obtiene datos - Datos Complementarios
     * @author Oscar S.
     * @param rfcEmpleado String
     * @return TdExpDatosComplementariosDTO
     */
    public TdExpDatosComplementariosDTO getExpedienteDatosComplementarios(String rfcEmpleado) {
        TdExpDatosComplementarios tdExpDatosComplementarios = super.persistence().get(TdExpDatosComplementariosDAO.class).getById(rfcEmpleado);
        return super.transformation().map(tdExpDatosComplementarios, TdExpDatosComplementariosDTO.class);
    }
    
    /******************************************************************************************************************************************************************************/
    
    /**
     * Búsqueda de empleados con documentos faltantes obligatorios - Informe
     * @author Oscar S.
     * @param rfcEmpleado String
     * @param idUnidad String
     * @return List&lt;Map&lt;Integer, Object&gt;&gt;
     */
    public List<Map<Integer, Object>> getInformeFaltantesObligatorios(String rfcEmpleado, String idUnidad) {
        try {
            return super.persistence().get(CustomDocExpedienteDAO.class).getInformeFaltantesObligatorios(rfcEmpleado, idUnidad);
        } catch (Exception e) {
            e.printStackTrace();
            throw new ServiceException("No se encuentra información con los parámetros proporcionados. Revise e intente de nuevo.");
        }
    }
    
    /******************************************************************************************************************************************************************************/

    /**
     * Metodo encargado de verificar si el cambio de estatus es valido
     * @author Oscar S.
     * @param idStatusOriginal String
     * @param idStatus String
     * @param rfcEmpleado String
     * @param usuario String
     * @param idTipoDocto String
     */
    private boolean verificaCambioEstatus(String idStatusOriginal, String idStatus, String rfcEmpleado, String usuario, String idTipoDocto, Integer idDocto) {
        boolean cambio = false;
        Integer totalRegistrados = 0;
        Integer totalRechazados = 0;
        
        if (idStatus.equals("INA")) {
            logger.debug("saveExpModEstatus -> cambio estatus -> Inactivo");
            cambio = true;
        } else {
            try {
                // load the GestionDocumentosBS at runtime
                Class cls = Class.forName("gob.shcp.sireh.service.expediente.GestionDocumentosBS");
                
                // Verificar total registrados
                Method method = cls.getMethod("getTotalExpedienteModEstatus" + idTipoDocto, String.class, String.class, Integer.class);
                totalRegistrados = (Integer)method.invoke(this, rfcEmpleado, "REG", idDocto);
                // Verificar total rechazados
                Method method2 = cls.getMethod("getTotalExpedienteModEstatus" + idTipoDocto, String.class, String.class, Integer.class);
                totalRechazados = (Integer)method2.invoke(this, rfcEmpleado, "REC", idDocto);
                
                if (idStatusOriginal.equals("ACT") && idStatus.equals("REG")) {
                    // Verificar el documento historico de fecha mas reciente
                    Method method4 = cls.getDeclaredMethod("updateHistoricoToActivoExpediente" + idTipoDocto, String.class, String.class);
                    method4.invoke(this, rfcEmpleado, usuario);
                    
                    // TODO: Sí no se permiten varios registrados
                    if (!DOCUMENTOS_VARIOS_REGISTRADOS.contains(idTipoDocto)) {
                        // Cambio de estatus del documento registrado a inactivo
                        Method method5 = cls.getDeclaredMethod("updateRegistroToInactivoExpediente" + idTipoDocto, String.class, String.class);
                        method5.invoke(this, rfcEmpleado, usuario);
                    }
                    
                    // TODO: Cualquier tabla
                    cambio = true;
                } else if (idStatusOriginal.equals("ACT") && idStatus.equals("ACT")) {
                    logger.debug("saveExpModEstatus -> cambio estatus -> sin modificacion");
                    cambio = false;
                } else if (idStatusOriginal.equals("ACT") && idStatus.equals("INA")) {
                    // TODO: Cualquier tabla
                    cambio = true;
                    
                } else if (idStatusOriginal.equals("REG") && idStatus.equals("REG")) {      
                    logger.debug("saveExpModEstatus -> cambio estatus -> sin modificacion");
                    cambio = false;
                } else if (idStatusOriginal.equals("REG") && idStatus.equals("INA")) {
                    // TODO: Cualquier tabla
                    cambio = true;
                    
                } else if (idStatusOriginal.equals("HIS") && idStatus.equals("REG")) {
                    // TODO: Documentos no validos para cambio de estatus
                    if (DOCUMENTOS_SIN_CAMBIO_ESTATUS.contains(idTipoDocto)) {
                        cambio = false;
                    } else {
                        if (totalRegistrados > 0 || totalRechazados > 0) {
                            cambio = false;
                        } else {
                            cambio = true;
                        }
                    }
                } else if (idStatusOriginal.equals("HIS") && idStatus.equals("HIS")) {
                    logger.debug("saveExpModEstatus -> cambio estatus -> sin modificacion");
                    cambio = false;
                } else if (idStatusOriginal.equals("HIS") && idStatus.equals("INA")) {
                    // TODO: Cualquier tabla
                    cambio = true;
                    
                } else if (idStatusOriginal.equals("REC") && idStatus.equals("REG")) {
                    // TODO: Documentos no validos para cambio de estatus
                    if (DOCUMENTOS_SIN_CAMBIO_ESTATUS.contains(idTipoDocto)) {
                        cambio = false;
                    } else {
                        if (totalRegistrados > 0 || totalRechazados > 0) {
                            cambio = false;
                        } else {
                            cambio = true;
                        }
                    }
                } else if (idStatusOriginal.equals("REC") && idStatus.equals("REC")) {
                    logger.debug("saveExpModEstatus -> cambio estatus -> sin modificacion");
                    cambio = false;
                } else if (idStatusOriginal.equals("REC") && idStatus.equals("INA")) {
                    // TODO: Cualquier tabla
                    cambio = true;
                    
                } else if (idStatusOriginal.equals("INA") && idStatus.equals("REG")) {
                    // TODO: Documentos no validos para cambio de estatus
                    if (DOCUMENTOS_SIN_CAMBIO_ESTATUS.contains(idTipoDocto)) {
                        cambio = false;
                    } else {
                        if (totalRegistrados > 0 || totalRechazados > 0) {
                            cambio = false;
                        } else {
                            cambio = true;
                        }
                    }
                } else {
                    logger.debug("saveExpModEstatus -> cambio estatus -> sin modificacion");
                    cambio = false;
                }
            } catch (Exception e) {
                cambio = false;
            }
        }
        return cambio;
    }
    
    /**
     * Metodo encargado actualizar el documento seleccionado
     * @author Oscar S.
     * @param rfcEmpleado String
     * @param idTipoDocto String
     * @param idDocto String
     * @param idStatus String
     * @param usuario String
     */
    public String saveExpModificacion(String rfcEmpleado, String idTipoDocto, Integer idDocto, String idStatus, String usuario) {
        logger.debug("saveExpModificacion -> idTipoDocto -> " + idTipoDocto);
        logger.debug("saveExpModificacion -> idStatus -> " + idStatus);
        boolean cambio = false;
        String resultMsg = "";
        
        if (idTipoDocto.equals(COD_RFC)) {
            TdExpRfcDTO tdExpRfcDTO = getExpedienteCRRFC(rfcEmpleado, idDocto, idTipoDocto);
            
            // Estatus original
            String idStatusOriginal = tdExpRfcDTO.getIdStatus();
            logger.debug("saveExpModificacion -> idStatusOriginal -> " + idStatusOriginal);
            
            tdExpRfcDTO.setIdExpRechazo(6); // SIN RECHAZO
            tdExpRfcDTO.setUsuario(usuario);
            tdExpRfcDTO.setFecModifico(new Date());
            tdExpRfcDTO.setIdStatus(idStatus);
            TdExpRfc tdExpRfc = super.transformation().map(tdExpRfcDTO, TdExpRfc.class);
            
            // Cambio de estatus
            cambio = verificaCambioEstatus(idStatusOriginal, idStatus, rfcEmpleado, usuario, idTipoDocto, idDocto);
            
            // Actualizar registro
            if (cambio) {
                super.persistence().get(TdExpRfcDAO.class).save(tdExpRfc);
                resultMsg = "conModificacion";
            } else {
                resultMsg = "sinModificacion";
            }
        } else if (idTipoDocto.equals(COD_FAM)) {
            TdExpFamiliarDepsBenefDTO tdExpFamiliarDepsBenefDTO = getExpedienteDependientes(rfcEmpleado, idDocto, idTipoDocto);
            
            // Estatus original
            String idStatusOriginal = tdExpFamiliarDepsBenefDTO.getIdStatus();
            logger.debug("saveExpModificacion -> idStatusOriginal -> " + idStatusOriginal);
            
            tdExpFamiliarDepsBenefDTO.setIdExpRechazo(6); // SIN RECHAZO
            tdExpFamiliarDepsBenefDTO.setUsuario(usuario);
            tdExpFamiliarDepsBenefDTO.setFecModifico(new Date());
            tdExpFamiliarDepsBenefDTO.setIdStatus(idStatus);
            TdExpFamiliarDepsBenef tdExpFamiliarDepsBenef = super.transformation().map(tdExpFamiliarDepsBenefDTO, TdExpFamiliarDepsBenef.class);
            
            // Actualizar registro
            if (cambio) {
                super.persistence().get(TdExpFamiliarDepsBenefDAO.class).save(tdExpFamiliarDepsBenef);
                resultMsg = "conModificacion";
            } else {
                resultMsg = "sinModificacion";
            }
        } else if (idTipoDocto.equals(COD_BEN)) {
            TdExpBeneficiarioDTO tdExpBeneficiarioDTO = getExpedienteDepBenef(rfcEmpleado, idDocto, idTipoDocto);
            
            // Estatus original
            String idStatusOriginal = tdExpBeneficiarioDTO.getIdStatus();
            logger.debug("saveExpModificacion -> idStatusOriginal -> " + idStatusOriginal);
            
            tdExpBeneficiarioDTO.setIdExpRechazo(6); // SIN RECHAZO
            tdExpBeneficiarioDTO.setUsuario(usuario);
            tdExpBeneficiarioDTO.setFecModifico(new Date());
            tdExpBeneficiarioDTO.setIdStatus(idStatus);
            TdExpBeneficiarios tdExpBeneficiario = super.transformation().map(tdExpBeneficiarioDTO, TdExpBeneficiarios.class);
            
            // Actualizar registro
            if (cambio) {
                super.persistence().get(TdExpBeneficiariosDAO.class).save(tdExpBeneficiario);
                resultMsg = "conModificacion";
            } else {
                resultMsg = "sinModificacion";
            }
        } else if (idTipoDocto.equals(COD_CURP)) {
            TdExpCurpDTO tdExpCurpDTO = getExpedienteCurp(rfcEmpleado, idDocto, idTipoDocto);
            
            // Estatus original
            String idStatusOriginal = tdExpCurpDTO.getIdStatus();
            logger.debug("saveExpModificacion -> idStatusOriginal -> " + idStatusOriginal);
            
            tdExpCurpDTO.setIdExpRechazo(6); // SIN RECHAZO
            tdExpCurpDTO.setUsuario(usuario);
            tdExpCurpDTO.setFecModifico(new Date());
            tdExpCurpDTO.setIdStatus(idStatus);
            TdExpCurp tdExpCurp = super.transformation().map(tdExpCurpDTO, TdExpCurp.class);
            
            // Actualizar registro
            if (cambio) {
                super.persistence().get(TdExpCurpDAO.class).save(tdExpCurp);
                resultMsg = "conModificacion";
            } else {
                resultMsg = "sinModificacion";
            }
        } else if (idTipoDocto.equals(COD_ACC)) {
            logger.debug("saveExpModEstatus -> sin modificacion");
            
        } else if (idTipoDocto.equals(COD_EXPLA)) {
            TdExpExperienciaLaboralDTO tdExpExperienciaLaboralDTO = getExpedienteExperienciaLaboral(rfcEmpleado, idDocto, idTipoDocto);
            
            // Estatus original
            String idStatusOriginal = tdExpExperienciaLaboralDTO.getIdStatus();
            logger.debug("saveExpModificacion -> idStatusOriginal -> " + idStatusOriginal);
            
            tdExpExperienciaLaboralDTO.setIdExpRechazo(6); // SIN RECHAZO
            tdExpExperienciaLaboralDTO.setUsuario(usuario);
            tdExpExperienciaLaboralDTO.setFecModifico(new Date());
            tdExpExperienciaLaboralDTO.setIdStatus(idStatus);
            TdExpExperienciaLaboral tdExpExperienciaLaboral = super.transformation().map(tdExpExperienciaLaboralDTO, TdExpExperienciaLaboral.class);
            
            // Actualizar registro
            if (cambio) {
                super.persistence().get(TdExpExperienciaLaboralDAO.class).save(tdExpExperienciaLaboral);
                resultMsg = "conModificacion";
            } else {
                resultMsg = "sinModificacion";
            }
        } else if (idTipoDocto.equals(COD_DOM)) {
            TdExpDomicilioParticularDTO tdExpDomicilioParticularDTO = getExpedienteDomicilio(rfcEmpleado, idDocto, idTipoDocto);
            
            // Estatus original
            String idStatusOriginal = tdExpDomicilioParticularDTO.getIdStatus();
            logger.debug("saveExpModificacion -> idStatusOriginal -> " + idStatusOriginal);
            
            tdExpDomicilioParticularDTO.setIdExpRechazo(6); // SIN RECHAZO
            tdExpDomicilioParticularDTO.setUsuario(usuario);
            tdExpDomicilioParticularDTO.setFecModifico(new Date());
            tdExpDomicilioParticularDTO.setIdStatus(idStatus);
            TdExpDomicilioParticular tdExpDomicilio = super.transformation().map(tdExpDomicilioParticularDTO, TdExpDomicilioParticular.class);
            
            // Actualizar registro
            if (cambio) {
                super.persistence().get(TdExpDomicilioParticularDAO.class).save(tdExpDomicilio);
                resultMsg = "conModificacion";
            } else {
                resultMsg = "sinModificacion";
            }
        } else if (idTipoDocto.equals(COD_ACN)) {
            TdExpDatosNacimientoDTO tdExpDatosNacimientoDTO = getExpedienteDatosNacimiento(rfcEmpleado, idDocto, idTipoDocto);
            
            // Estatus original
            String idStatusOriginal = tdExpDatosNacimientoDTO.getIdStatus();
            logger.debug("saveExpModificacion -> idStatusOriginal -> " + idStatusOriginal);
            
            tdExpDatosNacimientoDTO.setIdExpRechazo(6); // SIN RECHAZO
            tdExpDatosNacimientoDTO.setUsuario(usuario);
            tdExpDatosNacimientoDTO.setFecModifico(new Date());
            tdExpDatosNacimientoDTO.setIdStatus(idStatus);
            TdExpDatosNacimiento tdExpDatosNacimiento = super.transformation().map(tdExpDatosNacimientoDTO, TdExpDatosNacimiento.class);
            
            // Actualizar registro
            if (cambio) {
                super.persistence().get(TdExpDatosNacimientoDAO.class).save(tdExpDatosNacimiento);
                resultMsg = "conModificacion";
            } else {
                resultMsg = "sinModificacion";
            }
        } else if (idTipoDocto.equals(COD_COEST)) {
            TdExpAntecedentesAcademicoDTO tdExpAntecedentesAcademicoDTO = getExpedienteAntecedentesAcademicos(rfcEmpleado, idDocto, idTipoDocto);
            
            // Estatus original
            String idStatusOriginal = tdExpAntecedentesAcademicoDTO.getIdStatus();
            logger.debug("saveExpModificacion -> idStatusOriginal -> " + idStatusOriginal);
            
            tdExpAntecedentesAcademicoDTO.setIdExpRechazo(6); // SIN RECHAZO
            tdExpAntecedentesAcademicoDTO.setUsuario(usuario);
            tdExpAntecedentesAcademicoDTO.setFecModifico(new Date());
            tdExpAntecedentesAcademicoDTO.setIdStatus(idStatus);
            TdExpAntecedentesAcademicos tdExpAntecedentesAcademico = super.transformation().map(tdExpAntecedentesAcademicoDTO, TdExpAntecedentesAcademicos.class);
            
            // Actualizar registro
            if (cambio) {
                super.persistence().get(TdExpAntecedentesAcademicoDAO.class).save(tdExpAntecedentesAcademico);
                resultMsg = "conModificacion";
            } else {
                resultMsg = "sinModificacion";
            }
        } else if (idTipoDocto.equals(COD_CAC)) {
            TdExpCapacitacionDTO tdExpCapacitacionDTO = getExpedienteCapacitacionCursos(rfcEmpleado, idDocto, idTipoDocto);
            
            // Estatus original
            String idStatusOriginal = tdExpCapacitacionDTO.getIdStatus();
            logger.debug("saveExpModificacion -> idStatusOriginal -> " + idStatusOriginal);
            
            tdExpCapacitacionDTO.setIdExpRechazo(6); // SIN RECHAZO
            tdExpCapacitacionDTO.setUsuario(usuario);
            tdExpCapacitacionDTO.setFecModifico(new Date());
            tdExpCapacitacionDTO.setIdStatus(idStatus);
            TdExpCapacitacion tdExpCapacitacion = super.transformation().map(tdExpCapacitacionDTO, TdExpCapacitacion.class);
            
            // Actualizar registro
            if (cambio) {
                super.persistence().get(TdExpCapacitacionDAO.class).save(tdExpCapacitacion);
                resultMsg = "conModificacion";
            } else {
                resultMsg = "sinModificacion";
            }
        } else if (idTipoDocto.equals(COD_CTA)) {
            TdExpCuentasBancariaDTO tdExpCuentasBancariaDTO = getExpedienteCuentasBancarias(rfcEmpleado, idDocto, idTipoDocto);
            
            // Estatus original
            String idStatusOriginal = tdExpCuentasBancariaDTO.getIdStatus();
            logger.debug("saveExpModificacion -> idStatusOriginal -> " + idStatusOriginal);
            
            tdExpCuentasBancariaDTO.setIdExpRechazo(6); // SIN RECHAZO
            tdExpCuentasBancariaDTO.setUsuario(usuario);
            tdExpCuentasBancariaDTO.setFecModifico(new Date());
            tdExpCuentasBancariaDTO.setIdStatus(idStatus);
            TdExpCuentasBancarias tdExpCuentasBancarias = super.transformation().map(tdExpCuentasBancariaDTO, TdExpCuentasBancarias.class);
            
            // Actualizar registro
            if (cambio) {
                super.persistence().get(TdExpCuentasBancariaDAO.class).save(tdExpCuentasBancarias);
                resultMsg = "conModificacion";
            } else {
                resultMsg = "sinModificacion";
            }
        } else if (idTipoDocto.equals(COD_CARMI)) {
            TdExpCartillaMilitarDTO tdExpCartillaMilitarDTO = getExpedienteCartillaMilitar(rfcEmpleado, idDocto, idTipoDocto);
            
            // Estatus original
            String idStatusOriginal = tdExpCartillaMilitarDTO.getIdStatus();
            logger.debug("saveExpModificacion -> idStatusOriginal -> " + idStatusOriginal);
            
            tdExpCartillaMilitarDTO.setIdExpRechazo(6); // SIN RECHAZO
            tdExpCartillaMilitarDTO.setUsuario(usuario);
            tdExpCartillaMilitarDTO.setFecModifico(new Date());
            tdExpCartillaMilitarDTO.setIdStatus(idStatus);
            TdExpCartillaMilitar tdExpCartillaMilitar = super.transformation().map(tdExpCartillaMilitarDTO, TdExpCartillaMilitar.class);
            
            // Actualizar registro
            if (cambio) {
                super.persistence().get(TdExpCartillaMilitarDAO.class).save(tdExpCartillaMilitar);
                resultMsg = "conModificacion";
            } else {
                resultMsg = "sinModificacion";
            }
        } else if (idTipoDocto.equals(COD_DATCO)) {
            logger.debug("saveExpModEstatus -> sin modificacion");
        
        } else if (DOCUMENTOS_SIN_CAPTURA.contains(idTipoDocto)) {
            TdExpDoctosSinDatoDTO tdExpDoctosSinDatoDTO = getExpedienteDocumentosSinCaptura(rfcEmpleado, idDocto, idTipoDocto);
            
            // Estatus original
            String idStatusOriginal = tdExpDoctosSinDatoDTO.getIdStatus();
            logger.debug("saveExpModificacion -> idStatusOriginal -> " + idStatusOriginal);
            
            tdExpDoctosSinDatoDTO.setIdExpRechazo(6); // SIN RECHAZO
            tdExpDoctosSinDatoDTO.setUsuario(usuario);
            tdExpDoctosSinDatoDTO.setFecModifico(new Date());
            tdExpDoctosSinDatoDTO.setIdStatus(idStatus);
            TdExpDoctosSinDatos tdExpDoctosSinDatos = super.transformation().map(tdExpDoctosSinDatoDTO, TdExpDoctosSinDatos.class);
            
            // Actualizar registro
            if (cambio) {
                super.persistence().get(TdExpDoctosSinDatoDAO.class).save(tdExpDoctosSinDatos);
                resultMsg = "conModificacion";
            } else {
                resultMsg = "sinModificacion";
            }
        } else {
            logger.debug("saveExpModEstatus -> sin modificacion");
        }
        return resultMsg;
    }
    
    /******************************************************************************************************************************************************************************/
    
    /**
     * Metodo encargado actualizar la descripcion del documento seleccionado
     * @author Gualberto G.
     * @param expedienteModificacionDescripcionDTO ExpedienteModificacionDescripcionDTO
     * @param usuario String
     */
    public void saveExpModDescripcion(ExpedienteModificacionDescripcionDTO expedienteModificacionDescripcionDTO, String usuario) {
        logger.debug("saveExpModDescripcion -> idTipoDocto -> " + expedienteModificacionDescripcionDTO.getIdTipoDoctoBusqueda() );
        // Capacitacion    
        if (expedienteModificacionDescripcionDTO.getIdTipoDoctoBusqueda() != null && expedienteModificacionDescripcionDTO.getIdTipoDoctoBusqueda().equals("CCTDE")) {
            TdExpCapacitacionDTO tdExpCapacitacionDTO = getExpedienteCapacitacionCursos(expedienteModificacionDescripcionDTO.getRfcEmpleadoBusqueda(), expedienteModificacionDescripcionDTO.getIdDocto(), expedienteModificacionDescripcionDTO.getIdTipoDoctoBusqueda());
            tdExpCapacitacionDTO.setUsuario(usuario);
            tdExpCapacitacionDTO.setFecModifico(new Date());
            tdExpCapacitacionDTO.setCapDescCapacitacion(expedienteModificacionDescripcionDTO.getAuxDescripcionDocto() );
            tdExpCapacitacionDTO.setIdStatus(expedienteModificacionDescripcionDTO.getAuxEstadoDocto());
            TdExpCapacitacion tdExpCapacitacion = super.transformation().map(tdExpCapacitacionDTO, TdExpCapacitacion.class);
            super.persistence().get(TdExpCapacitacionDAO.class).save(tdExpCapacitacion);
        }
        // ACTA DE NACIMIENTO  -  La tabla TD_EXP_DATOS_NACIMIENTO no cuenta con un campo para guardar una descripcion y un ciclo
        else if(expedienteModificacionDescripcionDTO.getIdTipoDoctoBusqueda() != null && expedienteModificacionDescripcionDTO.getIdTipoDoctoBusqueda().equals("ACNAC")){
            TdExpDatosNacimiento tdExpDatosNacimiento = super.persistence().get(TdExpDatosNacimientoDAO.class).getById(
                new TdExpDatosNacimientoPK( expedienteModificacionDescripcionDTO.getIdDocto(),
                                            expedienteModificacionDescripcionDTO.getHiddenIdDocto().split(",")[0],
                                            expedienteModificacionDescripcionDTO.getRfcEmpleadoBusqueda()));
            tdExpDatosNacimiento.setUsuario(usuario);
            tdExpDatosNacimiento.setFecModifico(new Date());
            tdExpDatosNacimiento.setIdStatus(expedienteModificacionDescripcionDTO.getAuxEstadoDocto());
            super.persistence().get(TdExpDatosNacimientoDAO.class).save(tdExpDatosNacimiento);
        }
        // CARTILLA LIBERADA DEL SMN
        else if(expedienteModificacionDescripcionDTO.getIdTipoDoctoBusqueda() != null && expedienteModificacionDescripcionDTO.getIdTipoDoctoBusqueda().equals("CARMI")){
            TdExpCartillaMilitar tdExpCartillaMilitar = super.persistence().get(TdExpCartillaMilitarDAO.class).getById(
                new  TdExpCartillaMilitarPK(expedienteModificacionDescripcionDTO.getIdDocto(), 
                                            expedienteModificacionDescripcionDTO.getHiddenIdDocto().split(",")[0],
                                            expedienteModificacionDescripcionDTO.getRfcEmpleadoBusqueda()));
            tdExpCartillaMilitar.setUsuario(usuario);
            tdExpCartillaMilitar.setFecModifico(new Date());
            tdExpCartillaMilitar.setIdStatus(expedienteModificacionDescripcionDTO.getAuxEstadoDocto());
            super.persistence().get(TdExpCartillaMilitarDAO.class).save(tdExpCartillaMilitar);
        }
        // COMPROBANTE DE ESTUDIOS
        else if(expedienteModificacionDescripcionDTO.getIdTipoDoctoBusqueda() != null && expedienteModificacionDescripcionDTO.getIdTipoDoctoBusqueda().equals("COEST")){
            TdExpAntecedentesAcademicos tdExpAntecedentesAcademicos = super.persistence().get(TdExpAntecedentesAcademicoDAO.class).getById(
            new TdExpAntecedentesAcademicoPK(expedienteModificacionDescripcionDTO.getIdDocto(),
                                             expedienteModificacionDescripcionDTO.getHiddenIdDocto().split(",")[0],
                                             expedienteModificacionDescripcionDTO.getRfcEmpleadoBusqueda()));
            tdExpAntecedentesAcademicos.setUsuario(usuario);
            tdExpAntecedentesAcademicos.setFecModifico(new Date());
            tdExpAntecedentesAcademicos.setIdStatus(expedienteModificacionDescripcionDTO.getAuxEstadoDocto());
            super.persistence().get(TdExpAntecedentesAcademicoDAO.class).save(tdExpAntecedentesAcademicos);
        }
        // CURP
        else if(expedienteModificacionDescripcionDTO.getIdTipoDoctoBusqueda() != null && expedienteModificacionDescripcionDTO.getIdTipoDoctoBusqueda().equals("CCURP")){
            TdExpCurp tdExpCurp = super.persistence().get(TdExpCurpDAO.class).getById(
                new TdExpCurpPK(expedienteModificacionDescripcionDTO.getIdDocto(),
                                expedienteModificacionDescripcionDTO.getHiddenIdDocto().split(",")[0],
                                expedienteModificacionDescripcionDTO.getRfcEmpleadoBusqueda()));
            tdExpCurp.setUsuario(usuario);
            tdExpCurp.setFecModifico(new Date());
            tdExpCurp.setIdStatus(expedienteModificacionDescripcionDTO.getAuxEstadoDocto());
            super.persistence().get(TdExpCurpDAO.class).save(tdExpCurp);
        }
        // DOCUMENTO BANCARIO PARA NOMINA
        else if(expedienteModificacionDescripcionDTO.getIdTipoDoctoBusqueda() != null && expedienteModificacionDescripcionDTO.getIdTipoDoctoBusqueda().equals("CTABA")){
            TdExpCuentasBancarias tdExpCuentasBancarias = super.persistence().get(TdExpCuentasBancariaDAO.class).getById(
            new TdExpCuentasBancariaPK(expedienteModificacionDescripcionDTO.getIdDocto(),
                                        expedienteModificacionDescripcionDTO.getHiddenIdDocto().split(",")[0],
                                        expedienteModificacionDescripcionDTO.getRfcEmpleadoBusqueda()));
            tdExpCuentasBancarias.setUsuario(usuario);
            tdExpCuentasBancarias.setFecModifico(new Date());
            tdExpCuentasBancarias.setIdStatus(expedienteModificacionDescripcionDTO.getAuxEstadoDocto());
            super.persistence().get(TdExpCuentasBancariaDAO.class).save(tdExpCuentasBancarias);
        }
        // DOMICILIO PART / FORMATO ACTUA
        else if(expedienteModificacionDescripcionDTO.getIdTipoDoctoBusqueda() != null && expedienteModificacionDescripcionDTO.getIdTipoDoctoBusqueda().equals("CODOM")){
            TdExpDomicilioParticular tdExpDomicilioParticular = super.persistence().get(TdExpDomicilioParticularDAO.class).getById(
                new TdExpDomicilioParticularPK(expedienteModificacionDescripcionDTO.getIdDocto(),
                                                expedienteModificacionDescripcionDTO.getHiddenIdDocto().split(",")[0],
                                                expedienteModificacionDescripcionDTO.getRfcEmpleadoBusqueda()));
            tdExpDomicilioParticular.setUsuario(usuario);
            tdExpDomicilioParticular.setFecModifico(new Date());
            tdExpDomicilioParticular.setIdStatus(expedienteModificacionDescripcionDTO.getAuxEstadoDocto());
            super.persistence().get(TdExpDomicilioParticularDAO.class).save(tdExpDomicilioParticular);
        }
        // EXPERIENCIA LABORAL
        else if(expedienteModificacionDescripcionDTO.getIdTipoDoctoBusqueda() != null && expedienteModificacionDescripcionDTO.getIdTipoDoctoBusqueda().equals("EXPLA")){
            TdExpExperienciaLaboral tdExpExperienciaLaboral = super.persistence().get(TdExpExperienciaLaboralDAO.class).getById(
                new TdExpExperienciaLaboralPK(expedienteModificacionDescripcionDTO.getIdDocto(),
                                                expedienteModificacionDescripcionDTO.getHiddenIdDocto().split(",")[0],
                                                expedienteModificacionDescripcionDTO.getRfcEmpleadoBusqueda()));
            tdExpExperienciaLaboral.setUsuario(usuario);
            tdExpExperienciaLaboral.setFecModifico(new Date());
            tdExpExperienciaLaboral.setIdStatus(expedienteModificacionDescripcionDTO.getAuxEstadoDocto());
            super.persistence().get(TdExpExperienciaLaboralDAO.class).save(tdExpExperienciaLaboral);
        }
        // FAMILIARES, DEPENDS Y BENEFS
        else if(expedienteModificacionDescripcionDTO.getIdTipoDoctoBusqueda() != null && expedienteModificacionDescripcionDTO.getIdTipoDoctoBusqueda().equals("DFDBE")){
            TdExpFamiliarDepsBenef tdExpFamiliarDepsBenef = super.persistence().get(TdExpFamiliarDepsBenefDAO.class).getById(
                new TdExpFamiliarDepsBenefPK(expedienteModificacionDescripcionDTO.getIdDocto(),
                                                expedienteModificacionDescripcionDTO.getHiddenIdDocto().split(",")[0],
                                                expedienteModificacionDescripcionDTO.getRfcEmpleadoBusqueda()));
            tdExpFamiliarDepsBenef.setUsuario(usuario);
            tdExpFamiliarDepsBenef.setFecModifico(new Date());
            tdExpFamiliarDepsBenef.setIdStatus(expedienteModificacionDescripcionDTO.getAuxEstadoDocto());
            super.persistence().get(TdExpFamiliarDepsBenefDAO.class).save(tdExpFamiliarDepsBenef);
        }
        // FECHAS LABORALES
        else if(expedienteModificacionDescripcionDTO.getIdTipoDoctoBusqueda() != null && expedienteModificacionDescripcionDTO.getIdTipoDoctoBusqueda().equals("FECLA")){
            TdExpFechasLaborales tdExpFechasLaborales = super.persistence().get(TdExpFechasLaboralesDAO.class).getById(
                new TdExpFechasLaboralesPK(expedienteModificacionDescripcionDTO.getIdDocto(),
                                            expedienteModificacionDescripcionDTO.getHiddenIdDocto().split(",")[0],
                                            expedienteModificacionDescripcionDTO.getRfcEmpleadoBusqueda()));
            tdExpFechasLaborales.setUsuario(usuario);
            tdExpFechasLaborales.setFecModifico(new Date());
            tdExpFechasLaborales.setIdStatus(expedienteModificacionDescripcionDTO.getAuxEstadoDocto());
            super.persistence().get(TdExpFechasLaboralesDAO.class).save(tdExpFechasLaborales);
        }
        // RFC EXPEDIDO POR EL SAT
        else if(expedienteModificacionDescripcionDTO.getIdTipoDoctoBusqueda() != null && expedienteModificacionDescripcionDTO.getIdTipoDoctoBusqueda().equals("CRRFC")){
            TdExpRfc tdExpRfc = super.persistence().get(TdExpRfcDAO.class).getById(
                new TdExpRfcPK( expedienteModificacionDescripcionDTO.getHiddenIdDocto().split(",")[0],
                                expedienteModificacionDescripcionDTO.getRfcEmpleadoBusqueda(),
                                expedienteModificacionDescripcionDTO.getIdDocto()));
            tdExpRfc.setUsuario(usuario);
            tdExpRfc.setFecModifico(new Date());
            tdExpRfc.setIdStatus(expedienteModificacionDescripcionDTO.getAuxEstadoDocto());
            super.persistence().get(TdExpRfcDAO.class).save(tdExpRfc);
                
        } else if (DOCUMENTOS_SIN_CAPTURA.contains(expedienteModificacionDescripcionDTO.getIdTipoDoctoBusqueda())) {
            TdExpDoctosSinDatoDTO tdExpDoctosSinDatoDTO = getExpedienteDocumentosSinCaptura(expedienteModificacionDescripcionDTO.getRfcEmpleadoBusqueda(), expedienteModificacionDescripcionDTO.getIdDocto(), expedienteModificacionDescripcionDTO.getIdTipoDoctoBusqueda());
            tdExpDoctosSinDatoDTO.setUsuario(usuario);
            tdExpDoctosSinDatoDTO.setFecModifico(new Date());
            tdExpDoctosSinDatoDTO.setDsdDescripDocto(expedienteModificacionDescripcionDTO.getAuxDescripcionDocto());
            tdExpDoctosSinDatoDTO.setIdStatus(expedienteModificacionDescripcionDTO.getAuxEstadoDocto());
            tdExpDoctosSinDatoDTO.setDsdAxoDocto(expedienteModificacionDescripcionDTO.getAuxAnioDocto() );
            TdExpDoctosSinDatos tdExpDoctosSinDatos = super.transformation().map(tdExpDoctosSinDatoDTO, TdExpDoctosSinDatos.class);
            super.persistence().get(TdExpDoctosSinDatoDAO.class).save(tdExpDoctosSinDatos);
        } else {
            logger.debug("saveExpModEstatus -> sin modificacion");
        }
    }

    /**
     * Metodo encargado de actualizr la descripcion de los documentos sin captura de datos de manera masiva
     * @author Gualberto G
     * @param descripcionDebeDecir
     * @param descripcionDice
     */
    public int saveModDescripcionMasiva(String descripcionDebeDecir, String descripcionDice) {
        List<TdExpDoctosSinDatos> lista = super.persistence().get(TdExpDoctosSinDatoDAO.class).findByDsdDescripDocto(descripcionDice);
        
        if(lista != null && !lista.isEmpty()){
            super.persistence().get(CustomDocExpedienteDAO.class).updateTdExpDoctosSinDatosDescrip(descripcionDebeDecir, descripcionDice);
            return lista.size();
        }
        else{
            return 0;
        }
    }
    
    /**
     * Metodo encargado de buscar los documentos con estatus 9 - "DOCUMENTO UBICADO ERRONEAMENTE (PARA ELIMINAR)" de todo el  EXPEDIENTE
     * @author Martin C
     * @param idRechazo Integer
     * @return  ExpedienteEliminaDocumentosDTO
     */
    public ExpedienteEliminaDocumentosDTO numDocumentosEliminar(Integer idRechazo){
        Integer numeroDocumentos = 0;
        List<ExpedienteEliminaDocumentosDTO> listaDocs = new ArrayList<ExpedienteEliminaDocumentosDTO>();
        ExpedienteEliminaDocumentosDTO expedienteEliminaDocumentosDTO = new ExpedienteEliminaDocumentosDTO();
        
        List<ExpedienteEliminaDocumentos> tablas =  super.persistence().get(QueryExpedienteDAO.class).getTablasDatosExpediente();
        
        int i=1;
        for(ExpedienteEliminaDocumentos tabla : tablas){
            logger.debug("TABLA " + i + " : " + tabla.getNombreTabla()); 
            Integer numDocs = super.persistence().get(CustomTnNominaDao.class).getNumDoctosByTableExpediente(tabla.getNombreTabla(), idRechazo);
            if(numDocs > 0){
                ExpedienteEliminaDocumentosDTO elemento = new ExpedienteEliminaDocumentosDTO();
                elemento.setNombreTabla(tabla.getNombreTabla());
                elemento.setNumDocumentos(numDocs);
                elemento.setNumero(i);
                listaDocs.add(elemento);
                numeroDocumentos += numDocs;
                i ++;
            }
        }
        expedienteEliminaDocumentosDTO.setListaDocumentos(listaDocs);
        expedienteEliminaDocumentosDTO.setNumDocumentos(numeroDocumentos);
        
        logger.debug("TOTAL DOCUMENTOS: " + numeroDocumentos);
        return expedienteEliminaDocumentosDTO;
    }
    
    /**
     * Metodo encargado de eliminar los documentos con estatus 9 - "DOCUMENTO UBICADO ERRONEAMENTE (PARA ELIMINAR)" de todo el  EXPEDIENTE
     * @author Martin C
     * @param expedienteEliminaDocumentosDTO ExpedienteEliminaDocumentosDTO
     * @return  ExpedienteEliminaDocumentosDTO
     */
    public Integer eliminarDocumentos(ExpedienteEliminaDocumentosDTO expedienteEliminaDocumentosDTO){
        List<ExpedienteEliminaDocumentos> tablas =  super.persistence().get(QueryExpedienteDAO.class).getTablasDatosExpediente();
        Integer listDocsError = 0;
        
        for(ExpedienteEliminaDocumentos tabla : tablas){
            if(tabla.getNombreTabla().equalsIgnoreCase("TD_EXP_RFC")){
                List<Map<String, Object>> lRs = super.persistence().get(CustomTnNominaDao.class).getDoctosByTableExpediente(tabla.getNombreTabla(), 9);
                if(lRs.size() > 0){
                    for(Map<String, Object> rs : lRs){
                        try{
                            deleteFileExpediente((String)rs.get("referencia"));
                            TdExpRfcDTO tdExpRfcDTO = new TdExpRfcDTO();
                            tdExpRfcDTO.setIdDocto((String)rs.get("idDocto"));
                            tdExpRfcDTO.setRfcEmpleado((String)rs.get("rfcEmpleado"));
                            tdExpRfcDTO.setRfcSecuencia(new Integer(rs.get("secuencia").toString()));
                            deleteExpedienteCRRFC(tdExpRfcDTO);
                        } catch(Exception e){   e.printStackTrace(); listDocsError += 1;    }
                    }
                }
            }
            else if(tabla.getNombreTabla().equalsIgnoreCase("TD_EXP_FECHAS_LABORALES")){
                List<Map<String, Object>> lRs = super.persistence().get(CustomTnNominaDao.class).getDoctosByTableExpediente(tabla.getNombreTabla(), 9);
                if(lRs.size() > 0){
                    for(Map<String, Object> rs : lRs){
                        try{
                            deleteFileExpediente((String)rs.get("referencia"));
                            TdExpFechasLaboralesDTO tdExpFechasLaboralesDTO = new TdExpFechasLaboralesDTO();
                            tdExpFechasLaboralesDTO.setIdDocto((String)rs.get("idDocto"));
                            tdExpFechasLaboralesDTO.setRfcEmpleado((String)rs.get("rfcEmpleado"));
                            tdExpFechasLaboralesDTO.setFelSecuencia(new Integer(rs.get("secuencia").toString()));
                            deleteExpedienteFechasLaborales(tdExpFechasLaboralesDTO);
                        } catch(Exception e){   e.printStackTrace(); listDocsError += 1;    }
                    }
                }
            }
            else if(tabla.getNombreTabla().equalsIgnoreCase("TD_EXP_FAMILIAR_DEPS_BENEF")){
                List<Map<String, Object>> lRs = super.persistence().get(CustomTnNominaDao.class).getDoctosByTableExpediente(tabla.getNombreTabla(), 9);
                if(lRs.size() > 0){
                    for(Map<String, Object> rs : lRs){
                        try{
                            deleteFileExpediente((String)rs.get("referencia"));
                            TdExpFamiliarDepsBenefDTO tdExpFamiliarDepsBenefDTO = new TdExpFamiliarDepsBenefDTO();
                            tdExpFamiliarDepsBenefDTO.setIdDocto((String)rs.get("idDocto"));
                            tdExpFamiliarDepsBenefDTO.setRfcEmpleado((String)rs.get("rfcEmpleado"));
                            tdExpFamiliarDepsBenefDTO.setFdbSecuencia(new Integer(rs.get("secuencia").toString()));
                            deleteExpedienteDependientes(tdExpFamiliarDepsBenefDTO);
                        } catch(Exception e){   e.printStackTrace(); listDocsError += 1;    }
                    }
                }
            }
            else if(tabla.getNombreTabla().equalsIgnoreCase("TD_EXP_EXPERIENCIA_LABORAL")){
                List<Map<String, Object>> lRs = super.persistence().get(CustomTnNominaDao.class).getDoctosByTableExpediente(tabla.getNombreTabla(), 9);
                if(lRs.size() > 0){
                    for(Map<String, Object> rs : lRs){
                        try{
                            deleteFileExpediente((String)rs.get("referencia"));
                            TdExpExperienciaLaboralDTO tdExpExperienciaLaboralDTO = new TdExpExperienciaLaboralDTO();
                            tdExpExperienciaLaboralDTO.setIdDocto((String)rs.get("idDocto"));
                            tdExpExperienciaLaboralDTO.setRfcEmpleado((String)rs.get("rfcEmpleado"));
                            tdExpExperienciaLaboralDTO.setExpSecuencia(new Integer(rs.get("secuencia").toString()));
                            deleteExpedienteExperienciaLaboral(tdExpExperienciaLaboralDTO);
                        } catch(Exception e){   e.printStackTrace(); listDocsError += 1;    }
                    }
                }
            }
            else if(tabla.getNombreTabla().equalsIgnoreCase("TD_EXP_DOMICILIO_PARTICULAR")){
                List<Map<String, Object>> lRs = super.persistence().get(CustomTnNominaDao.class).getDoctosByTableExpediente(tabla.getNombreTabla(), 9);
                if(lRs.size() > 0){
                    for(Map<String, Object> rs : lRs){
                        try{
                            deleteFileExpediente((String)rs.get("referencia"));
                            TdExpDomicilioParticularDTO tdExpDomicilioDTO = new TdExpDomicilioParticularDTO();
                            tdExpDomicilioDTO.setIdDocto((String)rs.get("idDocto"));
                            tdExpDomicilioDTO.setRfcEmpleado((String)rs.get("rfcEmpleado"));
                            tdExpDomicilioDTO.setDomSecuencia(new Integer(rs.get("secuencia").toString()));
                            deleteExpedienteDomicilio(tdExpDomicilioDTO);
                        } catch(Exception e){   e.printStackTrace(); listDocsError += 1;    }
                    }
                }
            }
            else if(tabla.getNombreTabla().equalsIgnoreCase("TD_EXP_DOCTOS_SIN_DATOS")){
                List<Map<String, Object>> lRs = super.persistence().get(CustomTnNominaDao.class).getDoctosByTableExpediente(tabla.getNombreTabla(), 9);
                if(lRs.size() > 0){    
                    for(Map<String, Object> rs : lRs){
                        try{
                            deleteFileExpediente((String)rs.get("referencia"));
                            TdExpDoctosSinDatoDTO tdExpDoctosSinDatoDTO = new TdExpDoctosSinDatoDTO();
                            tdExpDoctosSinDatoDTO.setIdDocto((String)rs.get("idDocto"));
                            tdExpDoctosSinDatoDTO.setRfcEmpleado((String)rs.get("rfcEmpleado"));
                            tdExpDoctosSinDatoDTO.setDsdSecuencia(new Integer(rs.get("secuencia").toString()));
                            deleteExpedienteDocumentosSinCaptura(tdExpDoctosSinDatoDTO);
                        } catch(Exception e){   e.printStackTrace(); listDocsError += 1;    }
                    }
                }
            }
            else if(tabla.getNombreTabla().equalsIgnoreCase("TD_EXP_DATOS_NACIMIENTO")){
                List<Map<String, Object>> lRs = super.persistence().get(CustomTnNominaDao.class).getDoctosByTableExpediente(tabla.getNombreTabla(), 9);
                if(lRs.size() > 0){
                    for(Map<String, Object> rs : lRs){
                        try{
                            deleteFileExpediente((String)rs.get("referencia"));
                            TdExpDatosNacimientoDTO tdExpDatosNacimientoDTO = new TdExpDatosNacimientoDTO();
                            tdExpDatosNacimientoDTO.setIdDocto((String)rs.get("idDocto"));
                            tdExpDatosNacimientoDTO.setRfcEmpleado((String)rs.get("rfcEmpleado"));
                            tdExpDatosNacimientoDTO.setDnaSecuencia(new Integer(rs.get("secuencia").toString()));
                            deleteExpedienteDatosNacimiento(tdExpDatosNacimientoDTO);
                        } catch(Exception e){   e.printStackTrace(); listDocsError += 1;    }
                    }
                }
            }
            else if(tabla.getNombreTabla().equalsIgnoreCase("TD_EXP_CURP")){
                List<Map<String, Object>> lRs = super.persistence().get(CustomTnNominaDao.class).getDoctosByTableExpediente(tabla.getNombreTabla(), 9);
                if(lRs.size() > 0){
                    for(Map<String, Object> rs : lRs){
                        try{
                            deleteFileExpediente((String)rs.get("referencia"));
                            TdExpCurpDTO tdExpCurpDTO = new TdExpCurpDTO();
                            tdExpCurpDTO.setIdDocto((String)rs.get("idDocto"));
                            tdExpCurpDTO.setRfcEmpleado((String)rs.get("rfcEmpleado"));
                            tdExpCurpDTO.setCurpSecuencia(new Integer(rs.get("secuencia").toString()));
                            deleteExpedienteCurp(tdExpCurpDTO);
                        } catch(Exception e){   e.printStackTrace(); listDocsError += 1;    }
                    }
                }
            }
            else if(tabla.getNombreTabla().equalsIgnoreCase("TD_EXP_CUENTAS_BANCARIAS")){
                List<Map<String, Object>> lRs = super.persistence().get(CustomTnNominaDao.class).getDoctosByTableExpediente(tabla.getNombreTabla(), 9);
                if(lRs.size() > 0){
                    for(Map<String, Object> rs : lRs){
                        try{
                            deleteFileExpediente((String)rs.get("referencia"));
                            TdExpCuentasBancariaDTO tdExpCuentasBancariaDTO = new TdExpCuentasBancariaDTO();
                            tdExpCuentasBancariaDTO.setIdDocto((String)rs.get("idDocto"));
                            tdExpCuentasBancariaDTO.setRfcEmpleado((String)rs.get("rfcEmpleado"));
                            tdExpCuentasBancariaDTO.setCtaSecuencia(new Integer(rs.get("secuencia").toString()));
                            deleteExpedienteCuentasBancarias(tdExpCuentasBancariaDTO);
                        } catch(Exception e){   e.printStackTrace(); listDocsError += 1;    }
                    }
                }
            }
            else if(tabla.getNombreTabla().equalsIgnoreCase("TD_EXP_CARTILLA_MILITAR")){
                List<Map<String, Object>> lRs = super.persistence().get(CustomTnNominaDao.class).getDoctosByTableExpediente(tabla.getNombreTabla(), 9);
                if(lRs.size() > 0){
                    for(Map<String, Object> rs : lRs){
                        try{
                            deleteFileExpediente((String)rs.get("referencia"));
                            TdExpCartillaMilitarDTO tdExpCartillaMilitarDTO = new TdExpCartillaMilitarDTO();
                            tdExpCartillaMilitarDTO.setIdDocto((String)rs.get("idDocto"));
                            tdExpCartillaMilitarDTO.setRfcEmpleado((String)rs.get("rfcEmpleado"));
                            tdExpCartillaMilitarDTO.setCmiSecuencia(new Integer(rs.get("secuencia").toString()));
                            deleteExpedienteCartillaMilitar(tdExpCartillaMilitarDTO);
                        } catch(Exception e){   e.printStackTrace(); listDocsError += 1;    }
                    }
                }
            }
            else if(tabla.getNombreTabla().equalsIgnoreCase("TD_EXP_CAPACITACION")){
                List<Map<String, Object>> lRs = super.persistence().get(CustomTnNominaDao.class).getDoctosByTableExpediente(tabla.getNombreTabla(), 9);
                if(lRs.size() > 0){
                    for(Map<String, Object> rs : lRs){
                        try{
                            deleteFileExpediente((String)rs.get("referencia"));
                            TdExpCapacitacionDTO tdExpCapacitacionDTO = new TdExpCapacitacionDTO();
                            tdExpCapacitacionDTO.setIdDocto((String)rs.get("idDocto"));
                            tdExpCapacitacionDTO.setRfcEmpleado((String)rs.get("rfcEmpleado"));
                            tdExpCapacitacionDTO.setCapSecuencia(new Integer(rs.get("secuencia").toString()));
                            deleteExpedienteCapacitacionCursos(tdExpCapacitacionDTO);
                        } catch(Exception e){   e.printStackTrace(); listDocsError += 1;    }
                    }
                }
            }
            else if(tabla.getNombreTabla().equalsIgnoreCase("TD_EXP_BENEFICIARIOS")){
                List<Map<String, Object>> lRs = super.persistence().get(CustomTnNominaDao.class).getDoctosByTableExpediente(tabla.getNombreTabla(), 9);
                if(lRs.size() > 0){    
                    for(Map<String, Object> rs : lRs){
                        try{
                            deleteFileExpediente((String)rs.get("referencia"));
                            TdExpBeneficiarioDTO tdExpBeneficiarioDTO = new TdExpBeneficiarioDTO();
                            tdExpBeneficiarioDTO.setIdDocto((String)rs.get("idDocto"));
                            tdExpBeneficiarioDTO.setRfcEmpleado((String)rs.get("rfcEmpleado"));
                            tdExpBeneficiarioDTO.setBenSecuencia(new Integer(rs.get("secuencia").toString()));
                            deleteExpedienteDepBenef(tdExpBeneficiarioDTO);
                        } catch(Exception e){   e.printStackTrace(); listDocsError += 1;    }
                    }
                }
            }
            else if(tabla.getNombreTabla().equalsIgnoreCase("TD_EXP_ANTECEDENTES_ACADEMICOS")){
                List<Map<String, Object>> lRs = super.persistence().get(CustomTnNominaDao.class).getDoctosByTableExpediente(tabla.getNombreTabla(), 9);
                if(lRs.size() > 0){
                    for(Map<String, Object> rs : lRs){
                        try{
                            deleteFileExpediente((String)rs.get("referencia"));
                            TdExpAntecedentesAcademicoDTO tdExpAntecedentesAcademicoDTO = new TdExpAntecedentesAcademicoDTO();
                            tdExpAntecedentesAcademicoDTO.setIdDocto((String)rs.get("idDocto"));
                            tdExpAntecedentesAcademicoDTO.setRfcEmpleado((String)rs.get("rfcEmpleado"));
                            tdExpAntecedentesAcademicoDTO.setAacSecuencia(new Integer(rs.get("secuencia").toString()));
                            deleteExpedienteAntecedentesAcademicos(tdExpAntecedentesAcademicoDTO);
                        } catch(Exception e){   e.printStackTrace(); listDocsError += 1;    }
                    }
                }
            }
        }
        return listDocsError;
    }
}
