package gob.shcp.sireh.service.expediente;

import gob.shcp.fsn.service.AbstractBean;
import gob.shcp.jcr.node.FsnResource;

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
import gob.shcp.sireh.model.expediente.gestion.documentos.ExpedienteEliminaDocumentosDTO;
import gob.shcp.sireh.model.expediente.gestion.documentos.ExpedienteModificacionDescripcionDTO;
import gob.shcp.sireh.model.nomina.TdEmpleadoDTO;

import java.util.List;
import java.util.Map;

import javax.ejb.Local;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;

@Stateless(name = "gestionDocumentos")
@TransactionManagement(TransactionManagementType.CONTAINER)
@TransactionAttribute(value = TransactionAttributeType.SUPPORTS)
@Local( { GestionDocumentosService.class })
public class GestionDocumentosBean extends AbstractBean implements GestionDocumentosService {

    public String saveFileTest(JcrDataGestionDocumentosDTO jcrDataDTO, boolean rollback) {
        return super.getService(GestionDocumentosService.class).saveFileTest(jcrDataDTO, rollback);
    }

    public String saveFileExpediente(FsnResource fsnResource, boolean rollback) {
        return super.getService(GestionDocumentosService.class).saveFileExpediente(fsnResource, rollback);
    }

    /**
     * Obtiene datos del empleado con base en su rfc
     * @author Oscar S.
     * @param rfcEmpleado String
     * @return TdEmpleadoDTO
     */
    public TdEmpleadoDTO getEmpleado(String rfcEmpleado) {
        return super.getService(GestionDocumentosService.class).getEmpleado(rfcEmpleado);
    }

    /**
     * Elimina documento
     * @author Oscar S.
     * @param id String
     */
    public void deleteFileExpediente(String id) {
        super.getService(GestionDocumentosService.class).deleteFileExpediente(id);
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
        return super.getService(GestionDocumentosService.class).getExpedienteCRRFC(rfcEmpleado, rfcSecuencia, idDocto);
    }

    /**
     * Guarda registro - Alta de registro federal de contribuyentes
     * @author Oscar S.
     * @param tdExpRfcDTO TdExpRfcDTO
     */
    public void saveExpedienteCRRFC(TdExpRfcDTO tdExpRfcDTO) {
        super.getService(GestionDocumentosService.class).saveExpedienteCRRFC(tdExpRfcDTO);
    }

    /**
     * Autoriza/Rechaza registro - Alta de registro federal de contribuyentes
     * @author Oscar S.
     * @param tdExpRfcDTO TdExpRfcDTO
     */
    public void saveAutorizaRechazaExpedienteCRRFC(TdExpRfcDTO tdExpRfcDTO) {
        super.getService(GestionDocumentosService.class).saveAutorizaRechazaExpedienteCRRFC(tdExpRfcDTO);
    }

    /**
     * Obtiene total de registrados/rechazados - Alta de registro federal de contribuyentes
     * @author Oscar S.
     * @param rfcEmpleado String
     * @param tipo String
     * @return Integer
     */
    public Integer getTotalExpedienteCRRFC(String rfcEmpleado, String tipo) {
        return super.getService(GestionDocumentosService.class).getTotalExpedienteCRRFC(rfcEmpleado, tipo);
    }

    /**
     * Actualiza registros activos a historico - Alta de registro federal de contribuyentes
     * @author Oscar S.
     * @param rfcEmpleado String
     */
    public void updateActivosToHistoricoExpedienteCRRFC(String rfcEmpleado) {
        super.getService(GestionDocumentosService.class).updateActivosToHistoricoExpedienteCRRFC(rfcEmpleado);
    }

    /**
     * Elimina registro - Alta de registro federal de contribuyentes
     * @author Gualberto G.
     * @param tdExpRfcDTO TdExpRfcDTO
     */
    public void deleteExpedienteCRRFC(TdExpRfcDTO tdExpRfcDTO) {
        super.getService(GestionDocumentosService.class).deleteExpedienteCRRFC(tdExpRfcDTO);
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
        return super.getService(GestionDocumentosService.class).getExpedienteDepBenef(rfcEmpleado, benSecuencia, idDocto);
    }

    /**
     * Guarda registro - Designación - Búsqueda de familiares, dependientes o beneficiarios
     * @author Oscar S.
     * @param tdExpBeneficiarioDTO TdExpBeneficiarioDTO
     */
    public void saveExpedienteDepBenef(TdExpBeneficiarioDTO tdExpBeneficiarioDTO) {
        super.getService(GestionDocumentosService.class).saveExpedienteDepBenef(tdExpBeneficiarioDTO);
    }

    /**
     * Elimina registro - Designación - Búsqueda de familiares, dependientes o beneficiarios
     * @author Oscar S.
     * @param tdExpBeneficiarioDTO TdExpBeneficiarioDTO
     */
    public void deleteExpedienteDepBenef(TdExpBeneficiarioDTO tdExpBeneficiarioDTO) {
        super.getService(GestionDocumentosService.class).deleteExpedienteDepBenef(tdExpBeneficiarioDTO);
    }

    /**
     * Obtiene total de registrados - Designación - Búsqueda de familiares, dependientes o beneficiarios
     * @author Oscar S.
     * @param rfcEmpleado String
     * @return Integer
     */
    public Integer getTotalRegistradosExpedienteDepBenef(String rfcEmpleado) {
        return super.getService(GestionDocumentosService.class).getTotalRegistradosExpedienteDepBenef(rfcEmpleado);
    }

    /**
     * Obtiene total de rechazados - Designación - Búsqueda de familiares, dependientes o beneficiarios
     * @author Oscar S.
     * @param rfcEmpleado String
     * @return Integer
     */
    public Integer getTotalRechazadosExpedienteDepBenef(String rfcEmpleado) {
        return super.getService(GestionDocumentosService.class).getTotalRechazadosExpedienteDepBenef(rfcEmpleado);
    }

    /**
     * Actualiza registros activos a historico - Designación - Búsqueda de familiares, dependientes o beneficiarios
     * @author Oscar S.
     * @param rfcEmpleado String
     */
    public void updateActivosToHistoricoExpedienteDepBenef(String rfcEmpleado) {
        super.getService(GestionDocumentosService.class).updateActivosToHistoricoExpedienteDepBenef(rfcEmpleado);
    }

    /**
     * Autoriza/Rechaza registro - Designación - Búsqueda de familiares, dependientes o beneficiarios
     * @author Oscar S.
     * @param tdExpBeneficiarioDTO TdExpBeneficiarioDTO
     */
    public void saveAutorizaRechazaExpedienteDepBenef(TdExpBeneficiarioDTO tdExpBeneficiarioDTO) {
        super.getService(GestionDocumentosService.class).saveAutorizaRechazaExpedienteDepBenef(tdExpBeneficiarioDTO);
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
    public TdExpFamiliarDepsBenefDTO getExpedienteDependientes(String rfcEmpleado, Integer fdbSecuencia, String idDocto) {
        return super.getService(GestionDocumentosService.class).getExpedienteDependientes(rfcEmpleado, fdbSecuencia, idDocto);
    }

    /**
     * Guarda registro - Alta y/o modificación de familiares, dependientes o beneficiarios
     * @author Oscar S.
     * @param tdExpFamiliarDepsBenefDTO TdExpFamiliarDepsBenefDTO
     */
    public void saveExpedienteDependientes(TdExpFamiliarDepsBenefDTO tdExpFamiliarDepsBenefDTO) {
        super.getService(GestionDocumentosService.class).saveExpedienteDependientes(tdExpFamiliarDepsBenefDTO);
    }

    /**
     * Elimina registro - Alta y/o modificación de familiares, dependientes o beneficiarios
     * @author Oscar S.
     * @param tdExpFamiliarDepsBenefDTO TdExpFamiliarDepsBenefDTO
     */
    public void deleteExpedienteDependientes(TdExpFamiliarDepsBenefDTO tdExpFamiliarDepsBenefDTO) {
        super.getService(GestionDocumentosService.class).deleteExpedienteDependientes(tdExpFamiliarDepsBenefDTO);
    }

    /**
     * Obtiene total de registrados/rechazados - Alta y/o modificación de familiares, dependientes o beneficiarios
     * @author Oscar S.
     * @param rfcEmpleado String
     * @param tipo String
     * @return Integer
     */
    public Integer getTotalExpedienteDependientes(String rfcEmpleado, String tipo) {
        return super.getService(GestionDocumentosService.class).getTotalExpedienteDependientes(rfcEmpleado, tipo);
    }

    /**
     * Actualiza registros activos a historico - Alta y/o modificación de familiares, dependientes o beneficiarios
     * @author Oscar S.
     * @param rfcEmpleado String
     */
    public void updateActivosToHistoricoExpedienteDependientes(String rfcEmpleado) {
        super.getService(GestionDocumentosService.class).updateActivosToHistoricoExpedienteDependientes(rfcEmpleado);
    }

    /**
     * Autoriza/Rechaza registro - Alta y/o modificación de familiares, dependientes o beneficiarios
     * @author Oscar S.
     * @param tdExpFamiliarDepsBenefDTO TdExpFamiliarDepsBenefDTO
     */
    public void saveAutorizaRechazaExpedienteDependientes(TdExpFamiliarDepsBenefDTO tdExpFamiliarDepsBenefDTO) {
        super.getService(GestionDocumentosService.class).saveAutorizaRechazaExpedienteDependientes(tdExpFamiliarDepsBenefDTO);
    }
    
    public Integer verificaParentescoExpedienteDependientes(String rfcEmpleado, Integer idParentesco) {
        return super.getService(GestionDocumentosService.class).verificaParentescoExpedienteDependientes(rfcEmpleado, idParentesco);
    }

    /******************************************************************************************************************************************************************************/

    /**
     * Obtiene total de autorizados/rechazados - Alta de clave única de registro de población
     * @author Carolina H.
     * @param rfcEmpleado String
     * @param tipo String
     * @return Integer
     */
    public Integer getTotalExpedienteCurp(String rfcEmpleado, String tipo) {
        return super.getService(GestionDocumentosService.class).getTotalExpedienteCurp(rfcEmpleado, tipo);
    }

    /**
     * Elimina registro - Alta de clave única de registro de población
     * @author Carolina H.
     * @param tdExpCurpDTO TdExpCurpDTO
     */
    public void deleteExpedienteCurp(TdExpCurpDTO tdExpCurpDTO) {
        super.getService(GestionDocumentosService.class).deleteExpedienteCurp(tdExpCurpDTO);
    }

    /**
     * Guarda registro - Alta de clave única de registro de población
     * @author Carolina H
     * @param tdExpCurpDTO TdExpCurpDTO
     */
    public void saveExpedienteCurp(TdExpCurpDTO tdExpCurpDTO) {
        super.getService(GestionDocumentosService.class).saveExpedienteCurp(tdExpCurpDTO);
    }

    /**
     * Actualiza registros activos a historico - Alta de clave única de registro de población
     * @author Carolina H
     * @param rfcEmpleado String
     */
    public void updateActivosToHistoricoExpedienteCurp(String rfcEmpleado) {
        super.getService(GestionDocumentosService.class).updateActivosToHistoricoExpedienteCurp(rfcEmpleado);
    }

    /**
     * Obtiene datos del rfc - Alta de clave única de registro de población
     * @author Carolina H.
     * @param rfcEmpleado String
     * @param curpSecuencia Integer
     * @param idDocto String
     * @return TdExpCurpDTO
     */
    public TdExpCurpDTO getExpedienteCurp(String rfcEmpleado, Integer curpSecuencia, String idDocto) {
        return super.getService(GestionDocumentosService.class).getExpedienteCurp(rfcEmpleado, curpSecuencia, idDocto);
    }

    /**
     * Autoriza/Rechaza registro - Alta de clave única de registro de población
     * @author Carolina H.
     * @param tdExpCurpDTO TdExpCurpDTO
     */
    public void saveAutorizaRechazaExpedienteCurp(TdExpCurpDTO tdExpCurpDTO) {
        super.getService(GestionDocumentosService.class).saveAutorizaRechazaExpedienteCurp(tdExpCurpDTO);
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
        return super.getService(GestionDocumentosService.class).getTotalExpedienteDocumentosSinCaptura(rfcEmpleado, tipo, idDocto);
    }

    /**
     * Borra Expediente - Alta de documentos sin captura de datos
     * @author Armando Zuñiga
     * @param tdExpDoctosSinDatoDTO TdExpDoctosSinDatoDTO
     */
    public void deleteExpedienteDocumentosSinCaptura(TdExpDoctosSinDatoDTO tdExpDoctosSinDatoDTO) {
        super.getService(GestionDocumentosService.class).deleteExpedienteDocumentosSinCaptura(tdExpDoctosSinDatoDTO);
    }

    /**
     * Guarda Expediente - Alta de documentos sin captura de datos
     * @author Armando Zuñiga
     * @param tdExpDoctosSinDatoDTO TdExpDoctosSinDatoDTO
     */
    public void saveExpedienteDocumentosSinCaptura(TdExpDoctosSinDatoDTO tdExpDoctosSinDatoDTO) {
        super.getService(GestionDocumentosService.class).saveExpedienteDocumentosSinCaptura(tdExpDoctosSinDatoDTO);
    }

    /**
     * Actualiza registros activos a historico - Alta de documentos sin captura de datos
     * @author Armando Zuñiga
     * @param rfcEmpleado String
     * @param idDocto String
     */
    public void updateActivosToHistoricoExpedienteDocumentosSinCaptura(String rfcEmpleado, String idDocto) {
        super.getService(GestionDocumentosService.class).updateActivosToHistoricoExpedienteDocumentosSinCaptura(rfcEmpleado, idDocto);
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
        return super.getService(GestionDocumentosService.class).getExpedienteDocumentosSinCaptura(rfcEmpleado, documentosSinCapturaSecuencia, idDocto);
    }

    /**
     * Autoriza/Rechaza registro - Alta de documentos sin captura de datos
     * @author Armando Zuñiga
     * @param tdExpDoctosSinDatoDTO TdExpDoctosSinDatoDTO
     */
    public void saveAutorizaRechazaExpedienteDocumentosSinCaptura(TdExpDoctosSinDatoDTO tdExpDoctosSinDatoDTO) {
        super.getService(GestionDocumentosService.class).saveAutorizaRechazaExpedienteDocumentosSinCaptura(tdExpDoctosSinDatoDTO);
    }
    
    /**
     * Obtiene la lista de descripciones auxliares de documento
     * @author Roberto Muñoz
     * @param idDocto String
     */
    public List<String> getTcDescripcionAux(String idDocto){
       return super.getService(GestionDocumentosService.class).getTcDescripcionAux(idDocto);
    }
    
    /******************************************************************************************************************************************************************************/

    /**
     * Guarda registro - Aviso en caso de accidente
     * @author Carolina H.
     * @param tdExpAvisoAccidenteDTO TdExpAvisoAccidenteDTO
     */
    public void saveExpedienteAvisoAccidente(TdExpAvisoAccidenteDTO tdExpAvisoAccidenteDTO) {
        super.getService(GestionDocumentosService.class).saveExpedienteAvisoAccidente(tdExpAvisoAccidenteDTO);
    }

    /**
     * Obtiene registro - Aviso en caso de accidente
     * @author Martin C.
     * @param rfc String
     */
    public TdExpAvisoAccidenteDTO getExpedienteAvisoAccidente(String rfc) {
         return super.getService(GestionDocumentosService.class).getExpedienteAvisoAccidente(rfc);
    }
    
    /******************************************************************************************************************************************************************************/
    
    public Integer getTotalRegistradosExpedienteExperienciaLaboral(String rfcEmpleado) {
        return super.getService(GestionDocumentosService.class).getTotalRegistradosExpedienteExperienciaLaboral(rfcEmpleado);
    }

    public Integer getTotalRechazadosExpedienteExperienciaLaboral(String rfcEmpleado) {
        return super.getService(GestionDocumentosService.class).getTotalRechazadosExpedienteExperienciaLaboral(rfcEmpleado);
    }

    public void deleteExpedienteExperienciaLaboral(TdExpExperienciaLaboralDTO tdExpExperienciaLaboralDTO) {
        super.getService(GestionDocumentosService.class).deleteExpedienteExperienciaLaboral(tdExpExperienciaLaboralDTO);
    }

    public void saveExpedienteExperienciaLaboral(TdExpExperienciaLaboralDTO tdExpExperienciaLaboralDTO) {
        super.getService(GestionDocumentosService.class).saveExpedienteExperienciaLaboral(tdExpExperienciaLaboralDTO);
    }

    public TdExpExperienciaLaboralDTO getExpedienteExperienciaLaboral(String rfcEmpleado, Integer expSecuencia, String idDocto) {
        return super.getService(GestionDocumentosService.class).getExpedienteExperienciaLaboral(rfcEmpleado, expSecuencia, idDocto);
    }

    public void saveAutorizaRechazaExpedienteExperienciaLaboral(TdExpExperienciaLaboralDTO tdExpExperienciaLaboralDTO) {
        super.getService(GestionDocumentosService.class).saveAutorizaRechazaExpedienteExperienciaLaboral(tdExpExperienciaLaboralDTO);
    }

    public void updateActivosToHistoricoExpedienteExperienciaLaboral(String rfcEmpleado) {
        super.getService(GestionDocumentosService.class).updateActivosToHistoricoExpedienteExperienciaLaboral(rfcEmpleado);
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
        return super.getService(GestionDocumentosService.class).getTotalExpedienteDomicilio(rfcEmpleado, tipo);
    }

    /**
     * Guarda Expediente - Alta de domicilio particular
     * @author Oscar S.
     * @param tdExpDomicilioDTO TdExpDomicilioParticularDTO
     */
    public void saveExpedienteDomicilio(TdExpDomicilioParticularDTO tdExpDomicilioDTO) {
        super.getService(GestionDocumentosService.class).saveExpedienteDomicilio(tdExpDomicilioDTO);
    }

    /**
     * Borra Expediente - Alta de domicilio particular
     * @author Oscar S.
     * @param tdExpDomicilioDTO TdExpDomicilioParticularDTO
     */
    public void deleteExpedienteDomicilio(TdExpDomicilioParticularDTO tdExpDomicilioDTO) {
        super.getService(GestionDocumentosService.class).deleteExpedienteDomicilio(tdExpDomicilioDTO);
    }

    /**
     * Actualiza registros activos a historico - Alta de domicilio particular
     * @author Oscar S.
     * @param rfcEmpleado String
     */
    public void updateActivosToHistoricoExpedienteDomicilio(String rfcEmpleado) {
        super.getService(GestionDocumentosService.class).updateActivosToHistoricoExpedienteDomicilio(rfcEmpleado);
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
        return super.getService(GestionDocumentosService.class).getExpedienteDomicilio(rfcEmpleado, domSecuencia, idDocto);
    }

    /**
     * Autoriza/Rechaza registro - Alta de domicilio particular
     * @author Oscar S.
     * @param tdExpDomicilioParticularDTO TdExpDomicilioParticularDTO
     */
    public void saveAutorizaRechazaExpedienteDomicilio(TdExpDomicilioParticularDTO tdExpDomicilioParticularDTO) {
        super.getService(GestionDocumentosService.class).saveAutorizaRechazaExpedienteDomicilio(tdExpDomicilioParticularDTO);
    }
    
    /**
     * Obtiene la lista de municipios de la entidad federativa
     * @author MCS
     * @param entidadFederativa Integer
     */
    public List<String> getMunicipiosByEntidadFederativa(Integer entidadFederativa){
        return super.getService(GestionDocumentosService.class).getMunicipiosByEntidadFederativa(entidadFederativa);
    }
    
     /**
      * Obtiene la lista de codigos postales del  municipios en la entidad federativa
      * @author MCS
      * @param entidadFederativa Integer
      * @param municipio Integer
      */
     public List<String> getCpsByEntidadFederativaAndMunicipios(Integer entidadFederativa, Integer municipio){
         return super.getService(GestionDocumentosService.class).getCpsByEntidadFederativaAndMunicipios(entidadFederativa, municipio);
     }
     
      /**
       * Obtiene la lista de colonias por codigo postal
       * @author MCS
       * @param codigoPostal String
       */
     public List<String> getColoniasByCodigoPostal(String codigoPostal){
         return super.getService(GestionDocumentosService.class).getColoniasByCodigoPostal(codigoPostal);
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
        return super.getService(GestionDocumentosService.class).getTotalExpedienteDatosNacimiento(rfcEmpleado, tipo);
    }

    /**
     * Borra Expediente - Alta de Acta de nacimiento
     * @author Armando Zuñiga
     * @param tdExpDatosNacimientoDTO TdExpDatosNacimientoDTO
     */
    public void deleteExpedienteDatosNacimiento(TdExpDatosNacimientoDTO tdExpDatosNacimientoDTO) {
        super.getService(GestionDocumentosService.class).deleteExpedienteDatosNacimiento(tdExpDatosNacimientoDTO);
    }

    /**
     * Guarda Expediente - Alta de Acta de nacimiento
     * @author Armando Zuñiga
     * @param tdExpDatosNacimientoDTO TdExpDatosNacimientoDTO
     */
    public void saveExpedienteDatosNacimiento(TdExpDatosNacimientoDTO tdExpDatosNacimientoDTO) {
        super.getService(GestionDocumentosService.class).saveExpedienteDatosNacimiento(tdExpDatosNacimientoDTO);
    }

    /**
     * Actualiza registros activos a historico - Alta de Acta de nacimiento
     * @author Armando Zuñiga
     * @param rfcEmpleado String
     */
    public void updateActivosToHistoricoExpedienteDatosNacimiento(String rfcEmpleado) {
        super.getService(GestionDocumentosService.class).updateActivosToHistoricoExpedienteDatosNacimiento(rfcEmpleado);
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
        return super.getService(GestionDocumentosService.class).getExpedienteDatosNacimiento(rfcEmpleado, domSecuencia, idDocto);
    }

    /**
     * Autoriza/Rechaza registro - Alta de Acta de nacimiento
     * @author Armando Zuñiga
     * @param tdExpDatosNacimientoDTO TdExpDatosNacimientoDTO
     */
    public void saveAutorizaRechazaExpedienteDatosNacimiento(TdExpDatosNacimientoDTO tdExpDatosNacimientoDTO) {
        super.getService(GestionDocumentosService.class).saveAutorizaRechazaExpedienteDatosNacimiento(tdExpDatosNacimientoDTO);
    }

    /******************************************************************************************************************************************************************************/
    
    public TdExpAntecedentesAcademicoDTO getExpedienteAntecedentesAcademicos(String rfcEmpleado, Integer aacSecuencia, String idDocto) {
        return super.getService(GestionDocumentosService.class).getExpedienteAntecedentesAcademicos(rfcEmpleado, aacSecuencia, idDocto);
    }

    public void saveExpedienteAntecedentesAcademicos(TdExpAntecedentesAcademicoDTO tdExpAntecedentesAcademicoDTO) {
        super.getService(GestionDocumentosService.class).saveExpedienteAntecedentesAcademicos(tdExpAntecedentesAcademicoDTO);
    }

    public void deleteExpedienteAntecedentesAcademicos(TdExpAntecedentesAcademicoDTO tdExpAntecedentesAcademicoDTO) {
        super.getService(GestionDocumentosService.class).deleteExpedienteAntecedentesAcademicos(tdExpAntecedentesAcademicoDTO);
    }

    public void saveAutorizaRechazaExpedienteAntecedentesAcademicos(TdExpAntecedentesAcademicoDTO tdExpAntecedentesAcademicoDTO) {
        super.getService(GestionDocumentosService.class).saveAutorizaRechazaExpedienteAntecedentesAcademicos(tdExpAntecedentesAcademicoDTO);
    }

    public Integer getTotalExpedienteAntecedentesAcademicos(String rfcEmpleado, String tipo) {
        return super.getService(GestionDocumentosService.class).getTotalExpedienteAntecedentesAcademicos(rfcEmpleado, tipo);
    }

    public void updateActivosToHistoricoExpedienteAntecedentesAcademicos(String rfcEmpleado) {
        super.getService(GestionDocumentosService.class).updateActivosToHistoricoExpedienteAntecedentesAcademicos(rfcEmpleado);
    }

    /******************************************************************************************************************************************************************************/

    /**
     * Borra  - Fechas Laborales
     * @author 
     * @param tdExpFechasLaboraleDTO TdExpFechasLaboraleDTO
     */
    public void deleteExpedienteFechasLaborales(TdExpFechasLaboralesDTO tdExpFechasLaboraleDTO) {
        super.getService(GestionDocumentosService.class).deleteExpedienteFechasLaborales(tdExpFechasLaboraleDTO);
    }

    /**
     * Guarda - Fechas Laborales
     * @author 
     * @param tdExpFechasLaboraleDTO TdExpFechasLaboraleDTO
     */
    public void saveExpedienteFechasLaborales(TdExpFechasLaboralesDTO tdExpFechasLaboraleDTO) {
        super.getService(GestionDocumentosService.class).saveExpedienteFechasLaborales(tdExpFechasLaboraleDTO);
    }

    /**
     * Actualiza registros activos a historico - Fechas laborales
     * @author Carolina H.
     * @param rfcEmpleado String
     */
    public void updateActivosToHistoricoExpedienteFechasLaborales(String rfcEmpleado) {
        super.getService(GestionDocumentosService.class).updateActivosToHistoricoExpedienteFechasLaborales(rfcEmpleado);
    }

    /**
     * Obtiene datos - Alta de domicilio particular
     * @author Oscar S.
     * @param rfcEmpleado String
     * @param felSecuencia Integer
     * @param idDocto String
     * @return TdExpFechasLaboralesDTO
     */
    public TdExpFechasLaboralesDTO getExpedienteFechasLaborales(String rfcEmpleado, Integer felSecuencia, String idDocto) {
        return super.getService(GestionDocumentosService.class).getExpedienteFechasLaborales(rfcEmpleado, felSecuencia, idDocto);
    }

    /**
     * Autoriza/Rechaza registro - Alta de domicilio particular
     * @author Oscar S.
     * @param tdExpFechasLaboralesDTO TdExpFechasLaboraleDTO
     */
    public void saveAutorizaRechazaExpedienteFechasLaborales(TdExpFechasLaboralesDTO tdExpFechasLaboralesDTO) {
        super.getService(GestionDocumentosService.class).saveAutorizaRechazaExpedienteFechasLaborales(tdExpFechasLaboralesDTO);
    }

    /**
     * Obtiene total de autorizados/rechazados - Fechas Laborales
     * @author Carolina H.
     * @param rfcEmpleado String
     * @param tipo String
     * @return Integer
     */
    public Integer getTotalExpedienteFechasLaborales(String rfcEmpleado, String tipo) {
        return super.getService(GestionDocumentosService.class).getTotalExpedienteFechasLaborales(rfcEmpleado, tipo);
    }

    /******************************************************************************************************************************************************************************/

    /**
     * Obtiene datos - Alta de capacitacion y cursos
     * @author Armando Z
     * @param rfcEmpleado String      
     * @return TdExpDoctosSinDatoDTO
     */
    public Integer getTotalExpedienteCapacitacionCursos(String rfcEmpleado, String string) {
        return super.getService(GestionDocumentosService.class).getTotalExpedienteCapacitacionCursos(rfcEmpleado, string);
    }
    
    /**
     * Borra Expediente - Alta de de capacitación y cursos
     * @author Armando Z
     * @param tdExpCapacitacionDTO TdExpCapacitacionDTO
     */
    public void deleteExpedienteCapacitacionCursos(TdExpCapacitacionDTO tdExpCapacitacionDTO) {
        super.getService(GestionDocumentosService.class).deleteExpedienteCapacitacionCursos(tdExpCapacitacionDTO);
    }
    
    /**
     * Guarda Expediente - Alta de de capacitación y cursos
     * @author Armando Z
     * @param tdExpCapacitacionDTO TdExpCapacitacionDTO
     */
    public void saveExpedienteCapacitacionCursos(TdExpCapacitacionDTO tdExpCapacitacionDTO) {
        super.getService(GestionDocumentosService.class).saveExpedienteCapacitacionCursos(tdExpCapacitacionDTO);
    }

    /**
     * Actualiza registros activos a historico - Alta de de capacitación y cursos
     * @author Armando Z
     * @param rfcEmpleado String
     */
    public void updateActivosToHistoricoExpedienteCapacitacionCursos(String rfcEmpleado) {
        super.getService(GestionDocumentosService.class).updateActivosToHistoricoExpedienteCapacitacionCursos(rfcEmpleado);
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
        return super.getService(GestionDocumentosService.class).getExpedienteCapacitacionCursos(rfcEmpleado, domSecuencia, idDocto);
    }

    /**
     * Autoriza/Rechaza registro - Alta de cuentas bancarias
     * @author Armando Z
     * @param tdExpCapacitacionDTO saveAutorizaRechazaExpedienteCapacitacionCursos
     */
    public void saveAutorizaRechazaExpedienteCapacitacionCursos(TdExpCapacitacionDTO tdExpCapacitacionDTO) {
        super.getService(GestionDocumentosService.class).saveAutorizaRechazaExpedienteCapacitacionCursos(tdExpCapacitacionDTO);
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
        return super.getService(GestionDocumentosService.class).getTotalExpedienteCuentasBancarias(rfcEmpleado, tipo);
    }

    /**
     * Guarda Expediente - Alta de cuentas bancarias
     * @author Cesar B.
     * @param tdExpCuentasBancariaDTO TdExpCuentasBancariaDTO
     */
    public void saveExpedienteCuentasBancarias(TdExpCuentasBancariaDTO tdExpCuentasBancariaDTO) {
        super.getService(GestionDocumentosService.class).saveExpedienteCuentasBancarias(tdExpCuentasBancariaDTO);
    }

    /**
     * Borra Expediente - Alta de cuentas bancarias
     * @author Cesar B.
     * @param tdExpCuentasBancariaDTO TdExpCuentasBancariaDTO
     */
    public void deleteExpedienteCuentasBancarias(TdExpCuentasBancariaDTO tdExpCuentasBancariaDTO) {
        super.getService(GestionDocumentosService.class).deleteExpedienteCuentasBancarias(tdExpCuentasBancariaDTO);
    }
    
    /**
     * Actualiza registros activos a historico - Alta de cuentas bancarias
     * @author Cesar b.
     * @param rfcEmpleado String
     */
    public void updateActivosToHistoricoExpedienteCuentasBancarias(String rfcEmpleado) {
        super.getService(GestionDocumentosService.class).updateActivosToHistoricoExpedienteCuentasBancarias(rfcEmpleado);
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
        return  super.getService(GestionDocumentosService.class).getExpedienteCuentasBancarias(rfcEmpleado, ctaSecuencia, idDocto);
    }
    
    /**
     * Autoriza/Rechaza registro - Alta de cuentas bancarias
     * @author Cesar B.
     * @param tdExpCuentasBancariaDTO TdExpCuentasBancariasDTO
     */
    public void saveAutorizaRechazaExpedienteCuentasBancarias(TdExpCuentasBancariaDTO tdExpCuentasBancariaDTO) {
        super.getService(GestionDocumentosService.class).saveAutorizaRechazaExpedienteCuentasBancarias(tdExpCuentasBancariaDTO);
    }
    
    /******************************************************************************************************************************************************************************/

    /**
     * Obtiene total de autorizados/rechazados - Cartilla Militar Nacional
     * @author Ricardo León.
     * @param rfcEmpleado String
     * @param tipo String
     * @return Integer
     */
    public Integer getTotalExpedienteCartillaMilitar(String rfcEmpleado, String tipo) {
        return super.getService(GestionDocumentosService.class).getTotalExpedienteCartillaMilitar(rfcEmpleado, tipo);
    }

    /**
     * Guarda registro - Cartilla Militar Nacional
     * @author Ricardo León.
     * @param tdExpCartillaMilitarDTO TdExpCartillaMilitarDTO
     */
    public void saveExpedienteCartillaMilitar(TdExpCartillaMilitarDTO tdExpCartillaMilitarDTO) {
        super.getService(GestionDocumentosService.class).saveExpedienteCartillaMilitar(tdExpCartillaMilitarDTO);
    }

    /**
     * Actualiza registros activos a historico - Cartilla Militar Nacional 
     * @author Ricardo León.
     * @param rfcEmpleado String
     */
    public void updateActivosToHistoricoExpedienteCartillaMilitar(String rfcEmpleado) {
        super.getService(GestionDocumentosService.class).updateActivosToHistoricoExpedienteCartillaMilitar(rfcEmpleado);
    }

    /**
     * Obtiene datos del rfc - Cartilla Militar Nacional
     * @author Ricardo León.
     * @param rfcEmpleado String
     * @param cmiSecuencia Integer
     * @param idDocto String
     * @return TdExpCartillaMilitarDTO
     */
    public TdExpCartillaMilitarDTO getExpedienteCartillaMilitar(String rfcEmpleado, Integer cmiSecuencia, String idDocto) {
        return super.getService(GestionDocumentosService.class).getExpedienteCartillaMilitar(rfcEmpleado, cmiSecuencia, idDocto);
    }

    /**
     * Elimina registro - Alta de cartilla militar nacional
     * @author Ricardo León.
     * @param tdExpCartillaMilitarDTO TdExpCartillaMilitarDTO
     */
    public void deleteExpedienteCartillaMilitar(TdExpCartillaMilitarDTO tdExpCartillaMilitarDTO) {
        super.getService(GestionDocumentosService.class).deleteExpedienteCartillaMilitar(tdExpCartillaMilitarDTO);
    }

    /**
     * Autoriza / Rechaza registro - Cartilla Militar Nacional
     * @author Ricardo León.
     * @param tdExpCartillaMilitarDTO tdExpCartillaMilitarDTO
     */
    public void saveAutorizaRechazaExpedienteCartillaMilitar(TdExpCartillaMilitarDTO tdExpCartillaMilitarDTO) {
        super.getService(GestionDocumentosService.class).saveAutorizaRechazaExpedienteCartillaMilitar(tdExpCartillaMilitarDTO);
    }
    
    /******************************************************************************************************************************************************************************/
    
    /**
     * Guarda registro - Datos complementarios
     * @author Ricardo León.
     * @param tdExpDatosComplementariosDTO TdExpDatosComplementariosDTO
     */
    public void saveExpedienteDatosComplementarios(TdExpDatosComplementariosDTO tdExpDatosComplementariosDTO) {
        super.getService(GestionDocumentosService.class).saveExpedienteDatosComplementarios(tdExpDatosComplementariosDTO);
    }
    
    /**
     * Obtiene datos - Datos Complementarios
     * @author Oscar S.
     * @param rfcEmpleado String
     * @return TdExpDatosComplementariosDTO
     */
    public TdExpDatosComplementariosDTO getExpedienteDatosComplementarios(String rfcEmpleado) {
        return super.getService(GestionDocumentosService.class).getExpedienteDatosComplementarios(rfcEmpleado);
    }
    
    /******************************************************************************************************************************************************************************/

    /**
     * Búsqueda de empleados con documentos faltantes obligatorios - Informe
     * @author Oscar S.
     * @param rfcEmpleado String
     * @param idUnidad String
     * @return List<Map<Integer, Object>>
     */
    public List<Map<Integer, Object>> getInformeFaltantesObligatorios(String rfcEmpleado, String idUnidad) {
        return super.getService(GestionDocumentosService.class).getInformeFaltantesObligatorios(rfcEmpleado, idUnidad);
    }
    
    /******************************************************************************************************************************************************************************/

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
        return super.getService(GestionDocumentosService.class).saveExpModificacion(rfcEmpleado, idTipoDocto, idDocto, idStatus, usuario);
    }
    
    /**
     * Metodo encargado actualizar la descripcion del documento seleccionado
     * @author Gualberto G.
     * @param expedienteModificacionDescripcionDTO ExpedienteModificacionDescripcionDTO
     * @param usuario String
     */
    public void saveExpModDescripcion(ExpedienteModificacionDescripcionDTO expedienteModificacionDescripcionDTO, String usuario) {
        super.getService(GestionDocumentosService.class).saveExpModDescripcion(expedienteModificacionDescripcionDTO, usuario);
    }

    /**
     * Metodo encargado de actualizr la descripcion de los documentos sin captura de datos de manera masiva
     * @author Gualberto G
     * @param descripcionDebeDecir
     * @param descripcionDice
     */
    public int saveModDescripcionMasiva(String descripcionDebeDecir, String descripcionDice) {
        return super.getService(GestionDocumentosService.class).saveModDescripcionMasiva(descripcionDebeDecir, descripcionDice);
    }
    
    /**
     * Metodo encargado de buscar los documentos con estatus 9 - "DOCUMENTO UBICADO ERRONEAMENTE (PARA ELIMINAR)" de todo el  EXPEDIENTE
     * @author Martin C
     */
    public ExpedienteEliminaDocumentosDTO numDocumentosEliminar(Integer idRechazo){
        return super.getService(GestionDocumentosService.class).numDocumentosEliminar(idRechazo);
    }
    
    /**
     * Metodo encargado de eliminar los documentos con estatus 9 - "DOCUMENTO UBICADO ERRONEAMENTE (PARA ELIMINAR)" de todo el  EXPEDIENTE
     * @author Martin C
     */
    public Integer eliminarDocumentos(ExpedienteEliminaDocumentosDTO expedienteEliminaDocumentosDTO){
        return super.getService(GestionDocumentosService.class).eliminarDocumentos(expedienteEliminaDocumentosDTO);
    }
    
}
