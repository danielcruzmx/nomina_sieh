package gob.shcp.sireh.service.expediente;

import gob.shcp.fsn.service.BusinessService;
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

@Local
public interface GestionDocumentosService extends BusinessService {

    public String saveFileTest(JcrDataGestionDocumentosDTO jcrDataDTO, boolean rollback);
    public String saveFileExpediente(FsnResource fsnResource, boolean rollback);

    /**
     * Obtiene datos del empleado con base en su rfc
     * @author Oscar S.
     * @param rfcEmpleado String
     * @return TdEmpleadoDTO
     */
    public TdEmpleadoDTO getEmpleado(String rfcEmpleado);

    /**
     * Elimina documento
     * @author Oscar S.
     * @param id String
     */
    public void deleteFileExpediente(String id);

    /******************************************************************************************************************************************************************************/

    /**
     * Obtiene datos del rfc - Alta de registro federal de contribuyentes
     * @author Oscar S.
     * @param rfcEmpleado String
     * @param rfcSecuencia Integer
     * @param idDocto String
     * @return TdExpRfcDTO
     */
    public TdExpRfcDTO getExpedienteCRRFC(String rfcEmpleado, Integer rfcSecuencia, String idDocto);

    /**
     * Guarda registro - Alta de registro federal de contribuyentes
     * @author Oscar S.
     * @param tdExpRfcDTO TdExpRfcDTO
     */
    public void saveExpedienteCRRFC(TdExpRfcDTO tdExpRfcDTO);

    /**
     * Elimina registro - Alta de registro federal de contribuyentes
     * @author Oscar S.
     * @param tdExpRfcDTO TdExpRfcDTO
     */
    public void deleteExpedienteCRRFC(TdExpRfcDTO tdExpRfcDTO);

    /**
     * Autoriza/Rechaza registro - Alta de registro federal de contribuyentes
     * @author Oscar S.
     * @param tdExpRfcDTO TdExpRfcDTO
     */
    public void saveAutorizaRechazaExpedienteCRRFC(TdExpRfcDTO tdExpRfcDTO);

    /**
     * Obtiene total de registrados/rechazados - Alta de registro federal de contribuyentes
     * @author Oscar S.
     * @param rfcEmpleado String
     * @param tipo String
     * @return Integer
     */
    public Integer getTotalExpedienteCRRFC(String rfcEmpleado, String tipo);

    /**
     * Actualiza registros activos a historico - Alta de registro federal de contribuyentes
     * @author Oscar S.
     * @param rfcEmpleado String
     */
    public void updateActivosToHistoricoExpedienteCRRFC(String rfcEmpleado);

    /******************************************************************************************************************************************************************************/

    /**
     * Obtiene datos del beneficiario - Designación - Búsqueda de familiares, dependientes o beneficiarios
     * @author Oscar S.
     * @param rfcEmpleado String
     * @param benSecuencia Integer
     * @param idDocto String
     * @return TdExpBeneficiarioDTO
     */
    public TdExpBeneficiarioDTO getExpedienteDepBenef(String rfcEmpleado, Integer benSecuencia, String idDocto);

    /**
     * Guarda registro - Designación - Búsqueda de familiares, dependientes o beneficiarios
     * @author Oscar S.
     * @param tdExpBeneficiarioDTO TdExpBeneficiarioDTO
     */
    public void saveExpedienteDepBenef(TdExpBeneficiarioDTO tdExpBeneficiarioDTO);

    /**
     * Elimina registro - Designación - Búsqueda de familiares, dependientes o beneficiarios
     * @author Oscar S.
     * @param tdExpBeneficiarioDTO TdExpBeneficiarioDTO
     */
    public void deleteExpedienteDepBenef(TdExpBeneficiarioDTO tdExpBeneficiarioDTO);

    /**
     * Obtiene total de registrados - Designación - Búsqueda de familiares, dependientes o beneficiarios
     * @author Oscar S.
     * @param rfcEmpleado String
     * @return Integer
     */
    public Integer getTotalRegistradosExpedienteDepBenef(String rfcEmpleado);

    /**
     * Obtiene total de rechazados - Designación - Búsqueda de familiares, dependientes o beneficiarios
     * @author Oscar S.
     * @param rfcEmpleado String
     * @return Integer
     */
    public Integer getTotalRechazadosExpedienteDepBenef(String rfcEmpleado);

    /**
     * Actualiza registros activos a historico - Designación - Búsqueda de familiares, dependientes o beneficiarios
     * @author Oscar S.
     * @param rfcEmpleado String
     */
    public void updateActivosToHistoricoExpedienteDepBenef(String rfcEmpleado);

    /**
     * Autoriza/Rechaza registro - Designación - Búsqueda de familiares, dependientes o beneficiarios
     * @author Oscar S.
     * @param tdExpBeneficiarioDTO TdExpBeneficiarioDTO
     */
    public void saveAutorizaRechazaExpedienteDepBenef(TdExpBeneficiarioDTO tdExpBeneficiarioDTO);

    /******************************************************************************************************************************************************************************/

    /**
     * Obtiene datos del beneficiario - Alta y/o modificación de familiares, dependientes o beneficiarios
     * @author Oscar S.
     * @param rfcEmpleado String
     * @param fdbSecuencia Integer
     * @param idDocto String
     * @return TdExpFamiliarDepsBenefDTO
     */
    public TdExpFamiliarDepsBenefDTO getExpedienteDependientes(String rfcEmpleado, Integer fdbSecuencia, String idDocto);

    /**
     * Guarda registro - Alta y/o modificación de familiares, dependientes o beneficiarios
     * @author Oscar S.
     * @param tdExpFamiliarDepsBenefDTO TdExpFamiliarDepsBenefDTO
     */
    public void saveExpedienteDependientes(TdExpFamiliarDepsBenefDTO tdExpFamiliarDepsBenefDTO);

    /**
     * Elimina registro - Alta y/o modificación de familiares, dependientes o beneficiarios
     * @author Oscar S.
     * @param tdExpFamiliarDepsBenefDTO TdExpFamiliarDepsBenefDTO
     */
    public void deleteExpedienteDependientes(TdExpFamiliarDepsBenefDTO tdExpFamiliarDepsBenefDTO);

    /**
     * Obtiene total de registrados/rechazados - Alta y/o modificación de familiares, dependientes o beneficiarios
     * @author Oscar S.
     * @param rfcEmpleado String
     * @param tipo String
     * @return Integer
     */
    public Integer getTotalExpedienteDependientes(String rfcEmpleado, String tipo);

    /**
     * Actualiza registros activos a historico - Alta y/o modificación de familiares, dependientes o beneficiarios
     * @author Oscar S.
     * @param rfcEmpleado String
     */
    public void updateActivosToHistoricoExpedienteDependientes(String rfcEmpleado);

    /**
     * Autoriza/Rechaza registro - Alta y/o modificación de familiares, dependientes o beneficiarios
     * @author Oscar S.
     * @param tdExpFamiliarDepsBenefDTO TdExpFamiliarDepsBenefDTO
     */
    public void saveAutorizaRechazaExpedienteDependientes(TdExpFamiliarDepsBenefDTO tdExpFamiliarDepsBenefDTO);
    
    public Integer verificaParentescoExpedienteDependientes(String rfcEmpleado, Integer idParentesco);

    /******************************************************************************************************************************************************************************/

    /**
     * Obtiene total de autorizados/rechazados - Alta de clave única de registro de población
     * @author Carolina H.
     * @param rfcEmpleado String
     * @param tipo String
     * @return Integer
     */
    public Integer getTotalExpedienteCurp(String rfcEmpleado, String tipo);

    /**
     * Elimina registro - Alta de clave única de registro de población
     * @author Carolina H.
     * @param tdExpCurpDTO TdExpCurpDTO
     */
    public void deleteExpedienteCurp(TdExpCurpDTO tdExpCurpDTO);

    /**
     * Guarda registro - Alta de clave única de registro de población
     * @author Carolina H.
     * @param tdExpCurpDTO TdExpCurpDTO
     */
    public void saveExpedienteCurp(TdExpCurpDTO tdExpCurpDTO);

    /**
     * Actualiza registros activos a historico - Alta de clave única de registro de población
     * @author Carolina H.
     * @param rfcEmpleado String
     */
    public void updateActivosToHistoricoExpedienteCurp(String rfcEmpleado);

    /**
     * Obtiene datos - Alta de clave única de registro de población
     * @author Carolina H.
     * @param rfcEmpleado String
     * @param curpSecuencia Integer
     * @param idDocto String
     * @return TdExpCurpDTO
     */
    public TdExpCurpDTO getExpedienteCurp(String rfcEmpleado, Integer curpSecuencia, String idDocto);

    /**
     * Autoriza/Rechaza registro - Alta de clave única de registro de población
     * @author Carolina H.
     * @param tdExpCurpDTO TdExpCurpDTO
     */
    public void saveAutorizaRechazaExpedienteCurp(TdExpCurpDTO tdExpCurpDTO);

    /******************************************************************************************************************************************************************************/

    /**
     * Total Registrados/Rechazados - Alta de documentos sin captura de datos
     * @author Armando Zuñiga
     * @param rfcEmpleado string
     * @param tipo String
     * @return total Integer
     */
    public Integer getTotalExpedienteDocumentosSinCaptura(String rfcEmpleado, String tipo, String idDocto);

    /**
     * Borra Expediente - Alta de documentos sin captura de datos
     * @author Armando Zuñiga
     * @param tdExpDoctosSinDatoDTO TdExpDoctosSinDatoDTO
     */
    public void deleteExpedienteDocumentosSinCaptura(TdExpDoctosSinDatoDTO tdExpDoctosSinDatoDTO);

    /**
     * Guarda Expediente - Alta de documentos sin captura de datos
     * @author Armando Zuñiga
     * @param tdExpDoctosSinDatoDTO TdExpDoctosSinDatoDTO
     */
    public void saveExpedienteDocumentosSinCaptura(TdExpDoctosSinDatoDTO tdExpDoctosSinDatoDTO);

    /**
     * Actualiza registros activos a historico - Alta de documentos sin captura de datos
     * @author Armando Zuñiga
     * @param rfcEmpleado String
     * @param idDocto String
     */
    public void updateActivosToHistoricoExpedienteDocumentosSinCaptura(String rfcEmpleado, String idDocto);

    /**
     * Obtiene datos - Alta de documentos sin captura de datos
     * @author Armando Zuñiga
     * @param rfcEmpleado String
     * @param documentosSinCapturaSecuencia Integer
     * @param idDocto String
     * @return TdExpDoctosSinDatoDTO
     */
    public TdExpDoctosSinDatoDTO getExpedienteDocumentosSinCaptura(String rfcEmpleado, Integer documentosSinCapturaSecuencia, String idDocto);

    /**
     * Autoriza/Rechaza registro - Alta de documentos sin captura de datos
     * @author Armando Zuñiga
     * @param tdExpDoctosSinDatoDTO TdExpDoctosSinDatoDTO
     */
    public void saveAutorizaRechazaExpedienteDocumentosSinCaptura(TdExpDoctosSinDatoDTO tdExpDoctosSinDatoDTO);
    
    /**
     * Obtiene la lista de descripciones auxiliares de documento
     * @author Roberto Muñoz
     * @param idDocto String
     */
     public List<String> getTcDescripcionAux(String idDocto);    
     
    /******************************************************************************************************************************************************************************/

    /**
     * Guarda registro - Aviso en caso de accidente
     * @author Carolina H.
     * @param tdExpAvisoAccidenteDTO TdExpAvisoAccidenteDTO
     */
    public void saveExpedienteAvisoAccidente(TdExpAvisoAccidenteDTO tdExpAvisoAccidenteDTO);
    
    /**
     * Obtiene registro - Aviso en caso de accidente
     * @author Martin C.
     * @param rfc String
     */
     public TdExpAvisoAccidenteDTO getExpedienteAvisoAccidente(String rfc);
     
    /******************************************************************************************************************************************************************************/

    /**
     * Obtiene total de registrados/rechazados - Alta de experiencia laboral
     * @author Gualberto G.
     * @param rfcEmpleado
     * @return Integer
     */
    public Integer getTotalRegistradosExpedienteExperienciaLaboral(String rfcEmpleado);

    /**
     * Obtiene total de rechazados - Alta de experiencia laboral
     * @author Gualberto G.
     * @param rfcEmpleado
     * @return Integer
     */
    public Integer getTotalRechazadosExpedienteExperienciaLaboral(String rfcEmpleado);

    /**
     * Elimina registro - Alta de experiencia laboral
     * @author Gualberto G.
     * @param tdExpExperienciaLaboralDTO
     */
    public void deleteExpedienteExperienciaLaboral(TdExpExperienciaLaboralDTO tdExpExperienciaLaboralDTO);

    /**
     * Guarda registro - Alta de experiencia laboral
     * @author Gualberto G.
     * @param tdExpExperienciaLaboralDTO
     */
    public void saveExpedienteExperienciaLaboral(TdExpExperienciaLaboralDTO tdExpExperienciaLaboralDTO);

    /**
     * Obtiene datos del empleado - Alta de experiencia laboral
     * @author Gualberto G.
     * @param rfcEmpleado
     * @param expSecuencia
     * @param idDocto
     * @return TdExpExperienciaLaboralDTO
     */
    public TdExpExperienciaLaboralDTO getExpedienteExperienciaLaboral(String rfcEmpleado, Integer expSecuencia, String idDocto);

    /**
     * Autoriza/Rechaza registro - Alta de experiencia laboral
     * @author Gualberto G.
     * @param tdExpExperienciaLaboralDTO
     */
    public void saveAutorizaRechazaExpedienteExperienciaLaboral(TdExpExperienciaLaboralDTO tdExpExperienciaLaboralDTO);

    /**
     * Actualiza registros activos a historico - Alta de experiencia laboral
     * @author Gualberto G.
     * @param rfcEmpleado
     */
    public void updateActivosToHistoricoExpedienteExperienciaLaboral(String rfcEmpleado);
    
    /******************************************************************************************************************************************************************************/

    /**
     * Total Registrados/Rechazados - Alta de domicilio particular
     * @author Oscar S.
     * @param rfcEmpleado string
     * @param tipo String
     * @return total Integer
     */
    public Integer getTotalExpedienteDomicilio(String rfcEmpleado, String tipo);

    /**
     * Guarda Expediente - Alta de domicilio particular
     * @author Oscar S.
     * @param tdExpDomicilioDTO TdExpDomicilioParticularDTO
     */
    public void saveExpedienteDomicilio(TdExpDomicilioParticularDTO tdExpDomicilioDTO);

    /**
     * Borra Expediente - Alta de domicilio particular
     * @author Oscar S.
     * @param tdExpDomicilioDTO TdExpDomicilioParticularDTO
     */
    public void deleteExpedienteDomicilio(TdExpDomicilioParticularDTO tdExpDomicilioDTO);

    /**
     * Actualiza registros activos a historico - Alta de domicilio particular
     * @author Oscar S.
     * @param rfcEmpleado String
     */
    public void updateActivosToHistoricoExpedienteDomicilio(String rfcEmpleado);

    /**
     * Obtiene datos - Alta de domicilio particular
     * @author Oscar S.
     * @param rfcEmpleado String
     * @param domSecuencia Integer
     * @param idDocto String
     * @return TdExpDoctosSinDatoDTO
     */
    public TdExpDomicilioParticularDTO getExpedienteDomicilio(String rfcEmpleado, Integer domSecuencia, String idDocto);

    /**
     * Autoriza/Rechaza registro - Alta de domicilio particular
     * @author Oscar S.
     * @param tdExpDomicilioParticularDTO TdExpDomicilioParticularDTO
     */
    public void saveAutorizaRechazaExpedienteDomicilio(TdExpDomicilioParticularDTO tdExpDomicilioParticularDTO);

    /**
     * Obtiene la lista de municipios de la entidad federativa
     * @author MCS
     * @param entidadFederativa Integer
     */
    public List<String> getMunicipiosByEntidadFederativa(Integer entidadFederativa);

    /**
     * Obtiene la lista de codigos postales del  municipios en la entidad federativa
     * @author MCS
     * @param entidadFederativa Integer
     * @param municipio Integer
     */
    public List<String> getCpsByEntidadFederativaAndMunicipios(Integer entidadFederativa, Integer municipio);

    /**
     * Obtiene la lista de colonias por codigo postal
     * @author MCS
     * @param codigoPostal String
     */
    public List<String> getColoniasByCodigoPostal(String codigoPostal);

    /******************************************************************************************************************************************************************************/

    /**
     * Obtiene datos - Alta de Acta de nacimiento
     * @author Armando Zuñiga
     * @param rfcEmpleado String
     * @param tipo String
     * @return TdExpDoctosSinDatoDTO
     */
    public Integer getTotalExpedienteDatosNacimiento(String rfcEmpleado, String tipo);

    /**
     * Borra Expediente - Alta de Acta de nacimiento
     * @author Armando Zuñiga
     * @param tdExpDatosNacimientoDTO TdExpDatosNacimientoDTO
     */
    public void deleteExpedienteDatosNacimiento(TdExpDatosNacimientoDTO tdExpDatosNacimientoDTO);

    /**
     * Guarda Expediente - Alta de Acta de nacimiento
     * @author Armando Zuñiga
     * @param tdExpDatosNacimientoDTO TdExpDatosNacimientoDTO
     */
    public void saveExpedienteDatosNacimiento(TdExpDatosNacimientoDTO tdExpDatosNacimientoDTO);

    /**
     * Actualiza registros activos a historico - Alta de Acta de nacimiento
     * @author Armando Zuñiga
     * @param rfcEmpleado String
     */
    public void updateActivosToHistoricoExpedienteDatosNacimiento(String rfcEmpleado);

    /**
     * Obtiene datos - Alta de Acta de nacimiento
     * @author Armando Zuñiga
     * @param rfcEmpleado String
     * @param domSecuencia Integer
     * @param idDocto String
     * @return TdExpDatosNacimientoDTO
     */
    public TdExpDatosNacimientoDTO getExpedienteDatosNacimiento(String rfcEmpleado, Integer domSecuencia, String idDocto);

    /**
     * Autoriza/Rechaza registro - Alta de Acta de nacimiento
     * @author Armando Zuñiga
     * @param tdExpDatosNacimientoDTO TdExpDatosNacimientoDTO
     */
    public void saveAutorizaRechazaExpedienteDatosNacimiento(TdExpDatosNacimientoDTO tdExpDatosNacimientoDTO);

    /******************************************************************************************************************************************************************************/

    /**
     * Obtiene datos del empleado - Alta de antecedentes academicos
     * @author Gualberto G.
     * @param rfcEmpleado String
     * @param aacSecuencia Integer
     * @param idDocto String
     * @return TdExpAntecedentesAcademicoDTO
     */
    public TdExpAntecedentesAcademicoDTO getExpedienteAntecedentesAcademicos(String rfcEmpleado, Integer aacSecuencia, String idDocto);

    /**
     * Guarda registro - Alta de antecedentes acedemicos
     * @author Gualberto G.
     * @param tdExpAntecedentesAcademicoDTO TdExpAntecedentesAcademicoDTO
     */
    public void saveExpedienteAntecedentesAcademicos(TdExpAntecedentesAcademicoDTO tdExpAntecedentesAcademicoDTO);

    /**
     * Elimina registro - Alta de antecedentes acedemicos
     * @author Gualberto G.
     * @param tdExpAntecedentesAcademicoDTO TdExpAntecedentesAcademicoDTO
     */
    public void deleteExpedienteAntecedentesAcademicos(TdExpAntecedentesAcademicoDTO tdExpAntecedentesAcademicoDTO);

    /**
     * Autoriza/Rechaza registro - Alta de antecedentes acedemicos
     * @author Gualberto G.
     * @param tdExpAntecedentesAcademicoDTO TdExpAntecedentesAcademicoDTO
     */
    public void saveAutorizaRechazaExpedienteAntecedentesAcademicos(TdExpAntecedentesAcademicoDTO tdExpAntecedentesAcademicoDTO);

    /**
     * Obtiene total de registrados/rechazados - Alta de antecedentes acedemicos
     * @author Gualberto G.
     * @param rfcEmpleado String
     * @param tipo String
     * @return Integer
     */
    public Integer getTotalExpedienteAntecedentesAcademicos(String rfcEmpleado, String tipo);

    /**
     * Actualiza registros activos a historico - Alta de antecedentes acedemicos
     * @author Gualberto G.
     * @param rfcEmpleado String
     */
    public void updateActivosToHistoricoExpedienteAntecedentesAcademicos(String rfcEmpleado);

    /******************************************************************************************************************************************************************************/

    /**
     * Actualiza registros activos a historico - Alta de fechas laborales
     * @author Carolina H.
     * @param rfcEmpleado String
     */
    public void updateActivosToHistoricoExpedienteFechasLaborales(String rfcEmpleado);

    /**
     * Obtiene datos - Fechas laborales
     * @author Carolina H.
     * @param rfcEmpleado String
     * @param felSecuencia Integer
     * @param idDocto String
     * @return TdExpFechasLaboralesDTO
     */
    public TdExpFechasLaboralesDTO getExpedienteFechasLaborales(String rfcEmpleado, Integer felSecuencia, String idDocto);

    /**
     * Autoriza/Rechaza registro - Fechas laborales
     * @author Carolina H.
     * @param tdExpFechasLaboralesDTO TdExpFechasLaboralesDTO
     */
    public void saveAutorizaRechazaExpedienteFechasLaborales(TdExpFechasLaboralesDTO tdExpFechasLaboralesDTO);

    /**
     * Obtiene total de registrados/rechazados - Fechas laborales
     * @author 
     * @param rfcEmpleado String
     * @param tipo String
     * @return Integer
     */
    public Integer getTotalExpedienteFechasLaborales(String rfcEmpleado, String tipo);

    /**
     * Guarda - Fechas Laborales
     * @author 
     * @param tdExpFechasLaboraleDTO TdExpFechasLaboraleDTO
     */
    void saveExpedienteFechasLaborales(TdExpFechasLaboralesDTO tdExpFechasLaboraleDTO);

    /**
     * Borra  - Fechas Laborales
     * @author 
     * @param tdExpFechasLaboraleDTO TdExpFechasLaboraleDTO
     */
    void deleteExpedienteFechasLaborales(TdExpFechasLaboralesDTO tdExpFechasLaboraleDTO);

    /******************************************************************************************************************************************************************************/

    /**
     * Obtiene datos - Alta de de capacitación y cursos
     * @author Armando Z
     * @param rfcEmpleado String      
     * @return TdExpCapacitacionCursosDTO
     */
    public Integer getTotalExpedienteCapacitacionCursos(String rfcEmpleado, String string);

    /**
     * Borra Expediente - Alta de de capacitación y cursos
     * @author Armando Z
     * @param tdExpCapacitacionDTO TdExpCapacitacionDTO
     */
    public void deleteExpedienteCapacitacionCursos(TdExpCapacitacionDTO tdExpCapacitacionDTO);
    
    /**
     * Guarda Expediente - Alta de de capacitación y cursos
     * @author Armando Z
     * @param tdExpCapacitacionDTO TdExpCapacitacionDTO
     */
    public void saveExpedienteCapacitacionCursos(TdExpCapacitacionDTO tdExpCapacitacionDTO);
    
    /**
     * Actualiza registros activos a historico - Alta de de capacitación y cursos
     * @author Armando Z
     * @param rfcEmpleado String
     */
    public void updateActivosToHistoricoExpedienteCapacitacionCursos(String rfcEmpleado);
    
    /**
     * Obtiene datos - Alta de de capacitación y cursos
     * @author Armando Z
     * @param rfcEmpleado String
     * @param domSecuencia Integer
     * @param idDocto String
     * @return TdExpCapacitacionDTO
     */
    public TdExpCapacitacionDTO getExpedienteCapacitacionCursos(String rfcEmpleado, Integer domSecuencia, String idDocto);
    
    /**
     * Autoriza/Rechaza registro - Alta de cuentas bancarias
     * @author Armando Z
     * @param tdExpCapacitacionDTO saveAutorizaRechazaExpedienteCapacitacionCursos
     */
    public void saveAutorizaRechazaExpedienteCapacitacionCursos(TdExpCapacitacionDTO tdExpCapacitacionDTO);

    /******************************************************************************************************************************************************************************/

    /**
     *Obtiene Total de registros - Alta de cuentas bancarias
     * @author Cesar B.
     * @param rfcEmpleado String
     * @return Integer
     */
    public Integer getTotalExpedienteCuentasBancarias(String rfcEmpleado, String string);

    /**
     * Borra Expediente - Alta de cuentas bancarias
     * @author Cesar B.
     * @param tdExpCuentasBancariaDTO TdExpCuentaBancariaDTO
     */
    public void deleteExpedienteCuentasBancarias(TdExpCuentasBancariaDTO tdExpCuentasBancariaDTO);

    /**
     * Guarda Expediente - Alta de cuentas bancarias
     * @author Cesar B.
     * @param tdExpCuentasBancariaDTO TdExpCuentasBancariaDTO
     */
    public void saveExpedienteCuentasBancarias(TdExpCuentasBancariaDTO tdExpCuentasBancariaDTO);

    /**
     * Actualiza registros activos a historico - Alta de cuentas bancarias
     * @author Cesar b.
     * @param rfcEmpleado String
     */
    public void updateActivosToHistoricoExpedienteCuentasBancarias(String rfcEmpleado);

    /**
     * Autoriza/Rechaza registro - Alta de cuentas bancarias
     * @author Cesar B.
     * @param tdExpCuentasBancariaDTO TdExpCuentasBancariasDTO
     */
    public void saveAutorizaRechazaExpedienteCuentasBancarias(TdExpCuentasBancariaDTO tdExpCuentasBancariaDTO);

    /**
     * Obtiene datos - Alta de cuentas bancarias
     * @author Cesar B.
     * @param rfcEmpleado String
     * @param domSecuencia Integer
     * @param idDocto String
     * @return TdExpDoctosSinDatoDTO
     */
    public TdExpCuentasBancariaDTO getExpedienteCuentasBancarias(String rfcEmpleado, Integer domSecuencia, String idDocto);

    /******************************************************************************************************************************************************************************/

    /**
     * Obtiene total de autorizados / rechazados - Alta de Cartilla Militar Nacional
     * @author Ricardo León.
     * @param rfcEmpleado String
     * @param tipo String
     * @return Integer
     */
    public Integer getTotalExpedienteCartillaMilitar(String rfcEmpleado, String tipo);

    /**
     * Actualiza registros activos a historico - Alta de Cartilla Militar Nacional
     * @author Ricardo León.
     * @param rfcEmpleado String
     */
    public void updateActivosToHistoricoExpedienteCartillaMilitar(String rfcEmpleado);

    /**
     * Obtiene datos - Alta de Cartilla Militar Nacional
     * @author Ricardo León.
     * @param rfcEmpleado String
     * @param cmiSecuencia Integer
     * @param idDocto String
     * @return TdExpCartillaMilitarDTO
     */
    public TdExpCartillaMilitarDTO getExpedienteCartillaMilitar(String rfcEmpleado, Integer cmiSecuencia, String idDocto);

    /**
     * Autoriza/Rechaza registro - Alta de cartilla militar nacional
     * @author Ricardo León.
     * @param tdExpCartillaMilitarDTO TdExpCartillaMilitarDTO
     */
    public void saveAutorizaRechazaExpedienteCartillaMilitar(TdExpCartillaMilitarDTO tdExpCartillaMilitarDTO);

    /**
     * Autoriza/Rechaza registro - Alta de Cartilla Militar Nacional
     * @author Ricardo León.
     * @param tdExpCartillaMilitarDTO TdExpCartillaMilitarDTO
     */
    public void deleteExpedienteCartillaMilitar(TdExpCartillaMilitarDTO tdExpCartillaMilitarDTO);

    /**
     * Guarda registro - Cartilla Militar Nacional
     * @author Ricardo León.
     * @param tdExpCartillaMilitarDTO TdExpCartillaMilitarDTO
     */
    public void saveExpedienteCartillaMilitar(TdExpCartillaMilitarDTO tdExpCartillaMilitarDTO);

    /******************************************************************************************************************************************************************************/

    /**
     * Guarda registro - Datos Complementarios
     * @author Ricardo León.
     * @param tdExpDatosComplementariosDTO TdExpDatosComplementariosDTO
     */
    public void saveExpedienteDatosComplementarios(TdExpDatosComplementariosDTO tdExpDatosComplementariosDTO);

    /**
     * Obtiene datos - Datos Complementarios
     * @author Oscar S.
     * @param rfcEmpleado String
     * @return TdExpDatosComplementariosDTO
     */
    public TdExpDatosComplementariosDTO getExpedienteDatosComplementarios(String rfcEmpleado);
    
    /******************************************************************************************************************************************************************************/

    /**
     * Búsqueda de empleados con documentos faltantes obligatorios - Informe
     * @author Oscar S.
     * @param rfcEmpleado String
     * @param idUnidad String
     * @return List&lt;Map&lt;Integer, Object&gt;&gt;
     */
    public List<Map<Integer, Object>> getInformeFaltantesObligatorios(String rfcEmpleado, String idUnidad);
    
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
    public String saveExpModificacion(String rfcEmpleado, String idTipoDocto, Integer idDocto, String idStatus, String usuario);
    
    /**
     * Metodo encargado actualizar la descripcion del documento seleccionado
     * @author Gualberto G.
     * @param ExpedienteModificacionDescripcionDTO expedienteModificacionDescripcionDTO
     * @param usuario String
     */
    public void saveExpModDescripcion(ExpedienteModificacionDescripcionDTO expedienteModificacionDescripcionDTO, String usuario);
    
    /**
     * Metodo encargado de actualizr la descripcion de los documentos sin captura de datos de manera masiva
     * @author Gualberto G
     * @param descripcionDebeDecir
     * @param descripcionDice
     */
    public int saveModDescripcionMasiva(String descripcionDebeDecir, String descripcionDice);

    /**
     * Metodo encargado de buscar los documentos con estatus 9 - "DOCUMENTO UBICADO ERRONEAMENTE (PARA ELIMINAR)" de todo el  EXPEDIENTE
     * @author Martin C
     */
    public ExpedienteEliminaDocumentosDTO numDocumentosEliminar(Integer idRechazo);
    
    /**
     * Metodo encargado de eliminar los documentos con estatus 9 - "DOCUMENTO UBICADO ERRONEAMENTE (PARA ELIMINAR)" de todo el  EXPEDIENTE
     * @author Martin C
     */
    public Integer eliminarDocumentos(ExpedienteEliminaDocumentosDTO expedienteEliminaDocumentosDTO);
    
}
