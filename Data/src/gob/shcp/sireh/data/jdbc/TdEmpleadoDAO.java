package gob.shcp.sireh.data.jdbc;

import gob.shcp.fsn.data.annotation.Delete;
import gob.shcp.fsn.data.annotation.FindAll;
import gob.shcp.fsn.data.annotation.FindByCondition;
import gob.shcp.fsn.data.annotation.FindById;
import gob.shcp.fsn.data.annotation.Save;
import gob.shcp.fsn.service.data.orm.JdbcDataService;

import java.util.List;

import gob.shcp.sireh.domain.jdbc.TdEmpleado;
import gob.shcp.sireh.domain.jdbc.TdPlaza;


/**
 * Data access interface for TdEmpleado.
 */
public interface TdEmpleadoDAO extends JdbcDataService {
    /**
     * Find TdEmpleado entity by its identifier or primary key value.
     *
     * @param id identifier or primary key
     * @return TdEmpleado
     */
    @FindById(TdEmpleado.class)
    TdEmpleado getById(java.lang.String id);
        
    /**
     * Get all TdEmpleado entities limited by a maximum number of elements.
     *
     * @return Collection of TdEmpleado
     */
    @FindAll(TdEmpleado.class)
    List<TdEmpleado> findAll();
    
    /**
     * Make persistence of TdEmpleado entities. If its identifier or primary key is null then create else update.
     *
     * @param entity TdEmpleado
     */
    @Save
    void save(TdEmpleado entity);
    
    /**
     * Remove TdEmpleado entities.
     *
     * @param entity TdEmpleado
     */
    @Delete
    void delete(TdEmpleado entity);


    /**
     * Find the first TdEmpleado entity that matches the condition 'where fecModifico is equals to'.
     *
     * @param fecModifico java.util.Date
     * @return TdEmpleado
     */
    @FindByCondition(value=TdEmpleado.class, condition="FEC_MODIFICO=?")
    TdEmpleado getByFecModifico(java.util.Date fecModifico);

    /**
     * Find all TdEmpleado entities that matches the condition 'where fecModifico is equals to'.
     *
     * @param fecModifico java.util.Date
     * @return Collection of TdEmpleado
     */
    @FindByCondition(value=TdEmpleado.class, condition="FEC_MODIFICO=?")
    List<TdEmpleado> findByFecModifico(java.util.Date fecModifico);

    /**
     * Find the first TdEmpleado entity that matches the condition 'where usuario is equals to'.
     *
     * @param usuario java.lang.String
     * @return TdEmpleado
     */
    @FindByCondition(value=TdEmpleado.class, condition="USUARIO=?")
    TdEmpleado getByUsuario(java.lang.String usuario);

    /**
     * Find all TdEmpleado entities that matches the condition 'where usuario is equals to'.
     *
     * @param usuario java.lang.String
     * @return Collection of TdEmpleado
     */
    @FindByCondition(value=TdEmpleado.class, condition="USUARIO=?")
    List<TdEmpleado> findByUsuario(java.lang.String usuario);

    /**
     * Find the first TdEmpleado entity that matches the condition 'where calleParticular is equals to'.
     *
     * @param calleParticular java.lang.String
     * @return TdEmpleado
     */
    @FindByCondition(value=TdEmpleado.class, condition="CALLE_PARTICULAR=?")
    TdEmpleado getByCalleParticular(java.lang.String calleParticular);

    /**
     * Find all TdEmpleado entities that matches the condition 'where calleParticular is equals to'.
     *
     * @param calleParticular java.lang.String
     * @return Collection of TdEmpleado
     */
    @FindByCondition(value=TdEmpleado.class, condition="CALLE_PARTICULAR=?")
    List<TdEmpleado> findByCalleParticular(java.lang.String calleParticular);

    /**
     * Find the first TdEmpleado entity that matches the condition 'where casoMuestra is equals to'.
     *
     * @param casoMuestra java.lang.String
     * @return TdEmpleado
     */
    @FindByCondition(value=TdEmpleado.class, condition="CASO_MUESTRA=?")
    TdEmpleado getByCasoMuestra(java.lang.String casoMuestra);

    /**
     * Find all TdEmpleado entities that matches the condition 'where casoMuestra is equals to'.
     *
     * @param casoMuestra java.lang.String
     * @return Collection of TdEmpleado
     */
    @FindByCondition(value=TdEmpleado.class, condition="CASO_MUESTRA=?")
    List<TdEmpleado> findByCasoMuestra(java.lang.String casoMuestra);

    /**
     * Find the first TdEmpleado entity that matches the condition 'where clabeEmpleado is equals to'.
     *
     * @param clabeEmpleado java.lang.String
     * @return TdEmpleado
     */
    @FindByCondition(value=TdEmpleado.class, condition="CLABE_EMPLEADO=?")
    TdEmpleado getByClabeEmpleado(java.lang.String clabeEmpleado);

    /**
     * Find all TdEmpleado entities that matches the condition 'where clabeEmpleado is equals to'.
     *
     * @param clabeEmpleado java.lang.String
     * @return Collection of TdEmpleado
     */
    @FindByCondition(value=TdEmpleado.class, condition="CLABE_EMPLEADO=?")
    List<TdEmpleado> findByClabeEmpleado(java.lang.String clabeEmpleado);

    /**
     * Find the first TdEmpleado entity that matches the condition 'where codpostParticular is equals to'.
     *
     * @param codpostParticular java.lang.String
     * @return TdEmpleado
     */
    @FindByCondition(value=TdEmpleado.class, condition="CODPOST_PARTICULAR=?")
    TdEmpleado getByCodpostParticular(java.lang.String codpostParticular);

    /**
     * Find all TdEmpleado entities that matches the condition 'where codpostParticular is equals to'.
     *
     * @param codpostParticular java.lang.String
     * @return Collection of TdEmpleado
     */
    @FindByCondition(value=TdEmpleado.class, condition="CODPOST_PARTICULAR=?")
    List<TdEmpleado> findByCodpostParticular(java.lang.String codpostParticular);

    /**
     * Find the first TdEmpleado entity that matches the condition 'where coloniaParticular is equals to'.
     *
     * @param coloniaParticular java.lang.String
     * @return TdEmpleado
     */
    @FindByCondition(value=TdEmpleado.class, condition="COLONIA_PARTICULAR=?")
    TdEmpleado getByColoniaParticular(java.lang.String coloniaParticular);

    /**
     * Find all TdEmpleado entities that matches the condition 'where coloniaParticular is equals to'.
     *
     * @param coloniaParticular java.lang.String
     * @return Collection of TdEmpleado
     */
    @FindByCondition(value=TdEmpleado.class, condition="COLONIA_PARTICULAR=?")
    List<TdEmpleado> findByColoniaParticular(java.lang.String coloniaParticular);

    /**
     * Find the first TdEmpleado entity that matches the condition 'where compatEmpleo is equals to'.
     *
     * @param compatEmpleo java.lang.String
     * @return TdEmpleado
     */
    @FindByCondition(value=TdEmpleado.class, condition="COMPAT_EMPLEO=?")
    TdEmpleado getByCompatEmpleo(java.lang.String compatEmpleo);

    /**
     * Find all TdEmpleado entities that matches the condition 'where compatEmpleo is equals to'.
     *
     * @param compatEmpleo java.lang.String
     * @return Collection of TdEmpleado
     */
    @FindByCondition(value=TdEmpleado.class, condition="COMPAT_EMPLEO=?")
    List<TdEmpleado> findByCompatEmpleo(java.lang.String compatEmpleo);

    /**
     * Find the first TdEmpleado entity that matches the condition 'where curpEmpleado is equals to'.
     *
     * @param curpEmpleado java.lang.String
     * @return TdEmpleado
     */
    @FindByCondition(value=TdEmpleado.class, condition="CURP_EMPLEADO=?")
    TdEmpleado getByCurpEmpleado(java.lang.String curpEmpleado);

    /**
     * Find all TdEmpleado entities that matches the condition 'where curpEmpleado is equals to'.
     *
     * @param curpEmpleado java.lang.String
     * @return Collection of TdEmpleado
     */
    @FindByCondition(value=TdEmpleado.class, condition="CURP_EMPLEADO=?")
    List<TdEmpleado> findByCurpEmpleado(java.lang.String curpEmpleado);

    /**
     * Find the first TdEmpleado entity that matches the condition 'where discapacidad is equals to'.
     *
     * @param discapacidad java.lang.String
     * @return TdEmpleado
     */
    @FindByCondition(value=TdEmpleado.class, condition="DISCAPACIDAD=?")
    TdEmpleado getByDiscapacidad(java.lang.String discapacidad);

    /**
     * Find all TdEmpleado entities that matches the condition 'where discapacidad is equals to'.
     *
     * @param discapacidad java.lang.String
     * @return Collection of TdEmpleado
     */
    @FindByCondition(value=TdEmpleado.class, condition="DISCAPACIDAD=?")
    List<TdEmpleado> findByDiscapacidad(java.lang.String discapacidad);

    /**
     * Find the first TdEmpleado entity that matches the condition 'where empQnaCaptura is equals to'.
     *
     * @param empQnaCaptura java.lang.Integer
     * @return TdEmpleado
     */
    @FindByCondition(value=TdEmpleado.class, condition="EMP_QNA_CAPTURA=?")
    TdEmpleado getByEmpQnaCaptura(java.lang.Integer empQnaCaptura);

    /**
     * Find all TdEmpleado entities that matches the condition 'where empQnaCaptura is equals to'.
     *
     * @param empQnaCaptura java.lang.Integer
     * @return Collection of TdEmpleado
     */
    @FindByCondition(value=TdEmpleado.class, condition="EMP_QNA_CAPTURA=?")
    List<TdEmpleado> findByEmpQnaCaptura(java.lang.Integer empQnaCaptura);

    /**
     * Find the first TdEmpleado entity that matches the condition 'where estudiaSiNo is equals to'.
     *
     * @param estudiaSiNo java.lang.String
     * @return TdEmpleado
     */
    @FindByCondition(value=TdEmpleado.class, condition="ESTUDIA_SI_NO=?")
    TdEmpleado getByEstudiaSiNo(java.lang.String estudiaSiNo);

    /**
     * Find all TdEmpleado entities that matches the condition 'where estudiaSiNo is equals to'.
     *
     * @param estudiaSiNo java.lang.String
     * @return Collection of TdEmpleado
     */
    @FindByCondition(value=TdEmpleado.class, condition="ESTUDIA_SI_NO=?")
    List<TdEmpleado> findByEstudiaSiNo(java.lang.String estudiaSiNo);

    /**
     * Find the first TdEmpleado entity that matches the condition 'where EMailOficial is equals to'.
     *
     * @param EMailOficial java.lang.String
     * @return TdEmpleado
     */
    @FindByCondition(value=TdEmpleado.class, condition="E_MAIL_OFICIAL=?")
    TdEmpleado getByEMailOficial(java.lang.String EMailOficial);

    /**
     * Find all TdEmpleado entities that matches the condition 'where EMailOficial is equals to'.
     *
     * @param EMailOficial java.lang.String
     * @return Collection of TdEmpleado
     */
    @FindByCondition(value=TdEmpleado.class, condition="E_MAIL_OFICIAL=?")
    List<TdEmpleado> findByEMailOficial(java.lang.String EMailOficial);

    /**
     * Find the first TdEmpleado entity that matches the condition 'where EMailPersonal is equals to'.
     *
     * @param EMailPersonal java.lang.String
     * @return TdEmpleado
     */
    @FindByCondition(value=TdEmpleado.class, condition="E_MAIL_PERSONAL=?")
    TdEmpleado getByEMailPersonal(java.lang.String EMailPersonal);

    /**
     * Find all TdEmpleado entities that matches the condition 'where EMailPersonal is equals to'.
     *
     * @param EMailPersonal java.lang.String
     * @return Collection of TdEmpleado
     */
    @FindByCondition(value=TdEmpleado.class, condition="E_MAIL_PERSONAL=?")
    List<TdEmpleado> findByEMailPersonal(java.lang.String EMailPersonal);

    /**
     * Find the first TdEmpleado entity that matches the condition 'where fecIngSpc is equals to'.
     *
     * @param fecIngSpc java.util.Date
     * @return TdEmpleado
     */
    @FindByCondition(value=TdEmpleado.class, condition="FEC_ING_SPC=?")
    TdEmpleado getByFecIngSpc(java.util.Date fecIngSpc);

    /**
     * Find all TdEmpleado entities that matches the condition 'where fecIngSpc is equals to'.
     *
     * @param fecIngSpc java.util.Date
     * @return Collection of TdEmpleado
     */
    @FindByCondition(value=TdEmpleado.class, condition="FEC_ING_SPC=?")
    List<TdEmpleado> findByFecIngSpc(java.util.Date fecIngSpc);

    /**
     * Find the first TdEmpleado entity that matches the condition 'where fecIniDeclPatr is equals to'.
     *
     * @param fecIniDeclPatr java.util.Date
     * @return TdEmpleado
     */
    @FindByCondition(value=TdEmpleado.class, condition="FEC_INI_DECL_PATR=?")
    TdEmpleado getByFecIniDeclPatr(java.util.Date fecIniDeclPatr);

    /**
     * Find all TdEmpleado entities that matches the condition 'where fecIniDeclPatr is equals to'.
     *
     * @param fecIniDeclPatr java.util.Date
     * @return Collection of TdEmpleado
     */
    @FindByCondition(value=TdEmpleado.class, condition="FEC_INI_DECL_PATR=?")
    List<TdEmpleado> findByFecIniDeclPatr(java.util.Date fecIniDeclPatr);

    /**
     * Find the first TdEmpleado entity that matches the condition 'where fecNacimiento is equals to'.
     *
     * @param fecNacimiento java.util.Date
     * @return TdEmpleado
     */
    @FindByCondition(value=TdEmpleado.class, condition="FEC_NACIMIENTO=?")
    TdEmpleado getByFecNacimiento(java.util.Date fecNacimiento);

    /**
     * Find all TdEmpleado entities that matches the condition 'where fecNacimiento is equals to'.
     *
     * @param fecNacimiento java.util.Date
     * @return Collection of TdEmpleado
     */
    @FindByCondition(value=TdEmpleado.class, condition="FEC_NACIMIENTO=?")
    List<TdEmpleado> findByFecNacimiento(java.util.Date fecNacimiento);

    /**
     * Find the first TdEmpleado entity that matches the condition 'where fecNotDecPatr is equals to'.
     *
     * @param fecNotDecPatr java.util.Date
     * @return TdEmpleado
     */
    @FindByCondition(value=TdEmpleado.class, condition="FEC_NOT_DEC_PATR=?")
    TdEmpleado getByFecNotDecPatr(java.util.Date fecNotDecPatr);

    /**
     * Find all TdEmpleado entities that matches the condition 'where fecNotDecPatr is equals to'.
     *
     * @param fecNotDecPatr java.util.Date
     * @return Collection of TdEmpleado
     */
    @FindByCondition(value=TdEmpleado.class, condition="FEC_NOT_DEC_PATR=?")
    List<TdEmpleado> findByFecNotDecPatr(java.util.Date fecNotDecPatr);

    /**
     * Find the first TdEmpleado entity that matches the condition 'where fecUltimoMovto is equals to'.
     *
     * @param fecUltimoMovto java.util.Date
     * @return TdEmpleado
     */
    @FindByCondition(value=TdEmpleado.class, condition="FEC_ULTIMO_MOVTO=?")
    TdEmpleado getByFecUltimoMovto(java.util.Date fecUltimoMovto);

    /**
     * Find all TdEmpleado entities that matches the condition 'where fecUltimoMovto is equals to'.
     *
     * @param fecUltimoMovto java.util.Date
     * @return Collection of TdEmpleado
     */
    @FindByCondition(value=TdEmpleado.class, condition="FEC_ULTIMO_MOVTO=?")
    List<TdEmpleado> findByFecUltimoMovto(java.util.Date fecUltimoMovto);

    /**
     * Find the first TdEmpleado entity that matches the condition 'where idEdoNac is equals to'.
     *
     * @param idEdoNac java.lang.Integer
     * @return TdEmpleado
     */
    @FindByCondition(value=TdEmpleado.class, condition="ID_EDO_NAC=?")
    TdEmpleado getByIdEdoNac(java.lang.Integer idEdoNac);

    /**
     * Find all TdEmpleado entities that matches the condition 'where idEdoNac is equals to'.
     *
     * @param idEdoNac java.lang.Integer
     * @return Collection of TdEmpleado
     */
    @FindByCondition(value=TdEmpleado.class, condition="ID_EDO_NAC=?")
    List<TdEmpleado> findByIdEdoNac(java.lang.Integer idEdoNac);

    /**
     * Find the first TdEmpleado entity that matches the condition 'where idEdoParticular is equals to'.
     *
     * @param idEdoParticular java.lang.Integer
     * @return TdEmpleado
     */
    @FindByCondition(value=TdEmpleado.class, condition="ID_EDO_PARTICULAR=?")
    TdEmpleado getByIdEdoParticular(java.lang.Integer idEdoParticular);

    /**
     * Find all TdEmpleado entities that matches the condition 'where idEdoParticular is equals to'.
     *
     * @param idEdoParticular java.lang.Integer
     * @return Collection of TdEmpleado
     */
    @FindByCondition(value=TdEmpleado.class, condition="ID_EDO_PARTICULAR=?")
    List<TdEmpleado> findByIdEdoParticular(java.lang.Integer idEdoParticular);

    /**
     * Find the first TdEmpleado entity that matches the condition 'where idEspProtCivil is equals to'.
     *
     * @param idEspProtCivil java.lang.Integer
     * @return TdEmpleado
     */
    @FindByCondition(value=TdEmpleado.class, condition="ID_ESP_PROT_CIVIL=?")
    TdEmpleado getByIdEspProtCivil(java.lang.Integer idEspProtCivil);

    /**
     * Find all TdEmpleado entities that matches the condition 'where idEspProtCivil is equals to'.
     *
     * @param idEspProtCivil java.lang.Integer
     * @return Collection of TdEmpleado
     */
    @FindByCondition(value=TdEmpleado.class, condition="ID_ESP_PROT_CIVIL=?")
    List<TdEmpleado> findByIdEspProtCivil(java.lang.Integer idEspProtCivil);

    /**
     * Find the first TdEmpleado entity that matches the condition 'where idInstProtcivil is equals to'.
     *
     * @param idInstProtcivil java.lang.Integer
     * @return TdEmpleado
     */
    @FindByCondition(value=TdEmpleado.class, condition="ID_INST_PROTCIVIL=?")
    TdEmpleado getByIdInstProtcivil(java.lang.Integer idInstProtcivil);

    /**
     * Find all TdEmpleado entities that matches the condition 'where idInstProtcivil is equals to'.
     *
     * @param idInstProtcivil java.lang.Integer
     * @return Collection of TdEmpleado
     */
    @FindByCondition(value=TdEmpleado.class, condition="ID_INST_PROTCIVIL=?")
    List<TdEmpleado> findByIdInstProtcivil(java.lang.Integer idInstProtcivil);

    /**
     * Find the first TdEmpleado entity that matches the condition 'where idMuniParticular is equals to'.
     *
     * @param idMuniParticular java.lang.Integer
     * @return TdEmpleado
     */
    @FindByCondition(value=TdEmpleado.class, condition="ID_MUNI_PARTICULAR=?")
    TdEmpleado getByIdMuniParticular(java.lang.Integer idMuniParticular);

    /**
     * Find all TdEmpleado entities that matches the condition 'where idMuniParticular is equals to'.
     *
     * @param idMuniParticular java.lang.Integer
     * @return Collection of TdEmpleado
     */
    @FindByCondition(value=TdEmpleado.class, condition="ID_MUNI_PARTICULAR=?")
    List<TdEmpleado> findByIdMuniParticular(java.lang.Integer idMuniParticular);

    /**
     * Find the first TdEmpleado entity that matches the condition 'where idNacionalidad is equals to'.
     *
     * @param idNacionalidad java.lang.String
     * @return TdEmpleado
     */
    @FindByCondition(value=TdEmpleado.class, condition="ID_NACIONALIDAD=?")
    TdEmpleado getByIdNacionalidad(java.lang.String idNacionalidad);

    /**
     * Find all TdEmpleado entities that matches the condition 'where idNacionalidad is equals to'.
     *
     * @param idNacionalidad java.lang.String
     * @return Collection of TdEmpleado
     */
    @FindByCondition(value=TdEmpleado.class, condition="ID_NACIONALIDAD=?")
    List<TdEmpleado> findByIdNacionalidad(java.lang.String idNacionalidad);

    /**
     * Find the first TdEmpleado entity that matches the condition 'where idPlazaVigente is equals to'.
     *
     * @param idPlazaVigente java.lang.Integer
     * @return TdEmpleado
     */
    @FindByCondition(value=TdEmpleado.class, condition="ID_PLAZA_VIGENTE=?")
    TdEmpleado getByIdPlazaVigente(java.lang.Integer idPlazaVigente);

    /**
     * Find all TdEmpleado entities that matches the condition 'where idPlazaVigente is equals to'.
     *
     * @param idPlazaVigente java.lang.Integer
     * @return Collection of TdEmpleado
     */
    @FindByCondition(value=TdEmpleado.class, condition="ID_PLAZA_VIGENTE=?")
    List<TdEmpleado> findByIdPlazaVigente(java.lang.Integer idPlazaVigente);

    /**
     * Find the first TdEmpleado entity that matches the condition 'where idRusp is equals to'.
     *
     * @param idRusp java.lang.Integer
     * @return TdEmpleado
     */
    @FindByCondition(value=TdEmpleado.class, condition="ID_RUSP=?")
    TdEmpleado getByIdRusp(java.lang.Integer idRusp);

    /**
     * Find all TdEmpleado entities that matches the condition 'where idRusp is equals to'.
     *
     * @param idRusp java.lang.Integer
     * @return Collection of TdEmpleado
     */
    @FindByCondition(value=TdEmpleado.class, condition="ID_RUSP=?")
    List<TdEmpleado> findByIdRusp(java.lang.Integer idRusp);

    /**
     * Find the first TdEmpleado entity that matches the condition 'where idUltimoMovto is equals to'.
     *
     * @param idUltimoMovto java.lang.Integer
     * @return TdEmpleado
     */
    @FindByCondition(value=TdEmpleado.class, condition="ID_ULTIMO_MOVTO=?")
    TdEmpleado getByIdUltimoMovto(java.lang.Integer idUltimoMovto);

    /**
     * Find all TdEmpleado entities that matches the condition 'where idUltimoMovto is equals to'.
     *
     * @param idUltimoMovto java.lang.Integer
     * @return Collection of TdEmpleado
     */
    @FindByCondition(value=TdEmpleado.class, condition="ID_ULTIMO_MOVTO=?")
    List<TdEmpleado> findByIdUltimoMovto(java.lang.Integer idUltimoMovto);

    /**
     * Find the first TdEmpleado entity that matches the condition 'where imssIssste is equals to'.
     *
     * @param imssIssste java.lang.String
     * @return TdEmpleado
     */
    @FindByCondition(value=TdEmpleado.class, condition="IMSS_ISSSTE=?")
    TdEmpleado getByImssIssste(java.lang.String imssIssste);

    /**
     * Find all TdEmpleado entities that matches the condition 'where imssIssste is equals to'.
     *
     * @param imssIssste java.lang.String
     * @return Collection of TdEmpleado
     */
    @FindByCondition(value=TdEmpleado.class, condition="IMSS_ISSSTE=?")
    List<TdEmpleado> findByImssIssste(java.lang.String imssIssste);

    /**
     * Find the first TdEmpleado entity that matches the condition 'where ingresoDependencia is equals to'.
     *
     * @param ingresoDependencia java.util.Date
     * @return TdEmpleado
     */
    @FindByCondition(value=TdEmpleado.class, condition="INGRESO_DEPENDENCIA=?")
    TdEmpleado getByIngresoDependencia(java.util.Date ingresoDependencia);

    /**
     * Find all TdEmpleado entities that matches the condition 'where ingresoDependencia is equals to'.
     *
     * @param ingresoDependencia java.util.Date
     * @return Collection of TdEmpleado
     */
    @FindByCondition(value=TdEmpleado.class, condition="INGRESO_DEPENDENCIA=?")
    List<TdEmpleado> findByIngresoDependencia(java.util.Date ingresoDependencia);

    /**
     * Find the first TdEmpleado entity that matches the condition 'where ingresoGobFed is equals to'.
     *
     * @param ingresoGobFed java.util.Date
     * @return TdEmpleado
     */
    @FindByCondition(value=TdEmpleado.class, condition="INGRESO_GOB_FED=?")
    TdEmpleado getByIngresoGobFed(java.util.Date ingresoGobFed);

    /**
     * Find all TdEmpleado entities that matches the condition 'where ingresoGobFed is equals to'.
     *
     * @param ingresoGobFed java.util.Date
     * @return Collection of TdEmpleado
     */
    @FindByCondition(value=TdEmpleado.class, condition="INGRESO_GOB_FED=?")
    List<TdEmpleado> findByIngresoGobFed(java.util.Date ingresoGobFed);

    /**
     * Find the first TdEmpleado entity that matches the condition 'where nombreEmpleado is equals to'.
     *
     * @param nombreEmpleado java.lang.String
     * @return TdEmpleado
     */
    @FindByCondition(value=TdEmpleado.class, condition="NOMBRE_EMPLEADO=?")
    TdEmpleado getByNombreEmpleado(java.lang.String nombreEmpleado);

    /**
     * Find all TdEmpleado entities that matches the condition 'where nombreEmpleado is equals to'.
     *
     * @param nombreEmpleado java.lang.String
     * @return Collection of TdEmpleado
     */
    @FindByCondition(value=TdEmpleado.class, condition="NOMBRE_EMPLEADO=?")
    List<TdEmpleado> findByNombreEmpleado(java.lang.String nombreEmpleado);

    /**
     * Find the first TdEmpleado entity that matches the condition 'where numIssste is equals to'.
     *
     * @param numIssste java.lang.String
     * @return TdEmpleado
     */
    @FindByCondition(value=TdEmpleado.class, condition="NUM_ISSSTE=?")
    TdEmpleado getByNumIssste(java.lang.String numIssste);

    /**
     * Find all TdEmpleado entities that matches the condition 'where numIssste is equals to'.
     *
     * @param numIssste java.lang.String
     * @return Collection of TdEmpleado
     */
    @FindByCondition(value=TdEmpleado.class, condition="NUM_ISSSTE=?")
    List<TdEmpleado> findByNumIssste(java.lang.String numIssste);

    /**
     * Find the first TdEmpleado entity that matches the condition 'where padreMadre is equals to'.
     *
     * @param padreMadre java.lang.String
     * @return TdEmpleado
     */
    @FindByCondition(value=TdEmpleado.class, condition="PADRE_MADRE=?")
    TdEmpleado getByPadreMadre(java.lang.String padreMadre);

    /**
     * Find all TdEmpleado entities that matches the condition 'where padreMadre is equals to'.
     *
     * @param padreMadre java.lang.String
     * @return Collection of TdEmpleado
     */
    @FindByCondition(value=TdEmpleado.class, condition="PADRE_MADRE=?")
    List<TdEmpleado> findByPadreMadre(java.lang.String padreMadre);

    /**
     * Find the first TdEmpleado entity that matches the condition 'where primerApellido is equals to'.
     *
     * @param primerApellido java.lang.String
     * @return TdEmpleado
     */
    @FindByCondition(value=TdEmpleado.class, condition="PRIMER_APELLIDO=?")
    TdEmpleado getByPrimerApellido(java.lang.String primerApellido);

    /**
     * Find all TdEmpleado entities that matches the condition 'where primerApellido is equals to'.
     *
     * @param primerApellido java.lang.String
     * @return Collection of TdEmpleado
     */
    @FindByCondition(value=TdEmpleado.class, condition="PRIMER_APELLIDO=?")
    List<TdEmpleado> findByPrimerApellido(java.lang.String primerApellido);

    /**
     * Find the first TdEmpleado entity that matches the condition 'where referenciaOficio is equals to'.
     *
     * @param referenciaOficio java.lang.String
     * @return TdEmpleado
     */
    @FindByCondition(value=TdEmpleado.class, condition="REFERENCIA_OFICIO=?")
    TdEmpleado getByReferenciaOficio(java.lang.String referenciaOficio);

    /**
     * Find all TdEmpleado entities that matches the condition 'where referenciaOficio is equals to'.
     *
     * @param referenciaOficio java.lang.String
     * @return Collection of TdEmpleado
     */
    @FindByCondition(value=TdEmpleado.class, condition="REFERENCIA_OFICIO=?")
    List<TdEmpleado> findByReferenciaOficio(java.lang.String referenciaOficio);

    /**
     * Find the first TdEmpleado entity that matches the condition 'where rfcUnico is equals to'.
     *
     * @param rfcUnico java.lang.String
     * @return TdEmpleado
     */
    @FindByCondition(value=TdEmpleado.class, condition="RFC_UNICO=?")
    TdEmpleado getByRfcUnico(java.lang.String rfcUnico);

    /**
     * Find all TdEmpleado entities that matches the condition 'where rfcUnico is equals to'.
     *
     * @param rfcUnico java.lang.String
     * @return Collection of TdEmpleado
     */
    @FindByCondition(value=TdEmpleado.class, condition="RFC_UNICO=?")
    List<TdEmpleado> findByRfcUnico(java.lang.String rfcUnico);

    /**
     * Find the first TdEmpleado entity that matches the condition 'where segundoApellido is equals to'.
     *
     * @param segundoApellido java.lang.String
     * @return TdEmpleado
     */
    @FindByCondition(value=TdEmpleado.class, condition="SEGUNDO_APELLIDO=?")
    TdEmpleado getBySegundoApellido(java.lang.String segundoApellido);

    /**
     * Find all TdEmpleado entities that matches the condition 'where segundoApellido is equals to'.
     *
     * @param segundoApellido java.lang.String
     * @return Collection of TdEmpleado
     */
    @FindByCondition(value=TdEmpleado.class, condition="SEGUNDO_APELLIDO=?")
    List<TdEmpleado> findBySegundoApellido(java.lang.String segundoApellido);

    /**
     * Find the first TdEmpleado entity that matches the condition 'where sistemaReparto is equals to'.
     *
     * @param sistemaReparto java.lang.String
     * @return TdEmpleado
     */
    @FindByCondition(value=TdEmpleado.class, condition="SISTEMA_REPARTO=?")
    TdEmpleado getBySistemaReparto(java.lang.String sistemaReparto);

    /**
     * Find all TdEmpleado entities that matches the condition 'where sistemaReparto is equals to'.
     *
     * @param sistemaReparto java.lang.String
     * @return Collection of TdEmpleado
     */
    @FindByCondition(value=TdEmpleado.class, condition="SISTEMA_REPARTO=?")
    List<TdEmpleado> findBySistemaReparto(java.lang.String sistemaReparto);

    /**
     * Find the first TdEmpleado entity that matches the condition 'where telParticular is equals to'.
     *
     * @param telParticular java.lang.String
     * @return TdEmpleado
     */
    @FindByCondition(value=TdEmpleado.class, condition="TEL_PARTICULAR=?")
    TdEmpleado getByTelParticular(java.lang.String telParticular);

    /**
     * Find all TdEmpleado entities that matches the condition 'where telParticular is equals to'.
     *
     * @param telParticular java.lang.String
     * @return Collection of TdEmpleado
     */
    @FindByCondition(value=TdEmpleado.class, condition="TEL_PARTICULAR=?")
    List<TdEmpleado> findByTelParticular(java.lang.String telParticular);

    /**
     * Find the first TdEmpleado entity that matches the condition 'where terminoCargoSind is equals to'.
     *
     * @param terminoCargoSind java.util.Date
     * @return TdEmpleado
     */
    @FindByCondition(value=TdEmpleado.class, condition="TERMINO_CARGO_SIND=?")
    TdEmpleado getByTerminoCargoSind(java.util.Date terminoCargoSind);

    /**
     * Find all TdEmpleado entities that matches the condition 'where terminoCargoSind is equals to'.
     *
     * @param terminoCargoSind java.util.Date
     * @return Collection of TdEmpleado
     */
    @FindByCondition(value=TdEmpleado.class, condition="TERMINO_CARGO_SIND=?")
    List<TdEmpleado> findByTerminoCargoSind(java.util.Date terminoCargoSind);
}