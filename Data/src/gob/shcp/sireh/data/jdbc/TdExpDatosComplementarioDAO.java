package gob.shcp.sireh.data.jdbc;

import gob.shcp.fsn.data.annotation.Delete;
import gob.shcp.fsn.data.annotation.FindAll;
import gob.shcp.fsn.data.annotation.FindByCondition;
import gob.shcp.fsn.data.annotation.FindById;
import gob.shcp.fsn.data.annotation.Save;
import gob.shcp.fsn.service.data.orm.JdbcDataService;
import gob.shcp.sireh.domain.jdbc.TdExpDatosComplementarios;

import java.util.List;


/**
 * Data access interface for TdExpDatosComplementario.
 */
public interface TdExpDatosComplementarioDAO extends JdbcDataService {
    /**
     * Find TdExpDatosComplementario entity by its identifier or primary key value.
     *
     * @param id identifier or primary key
     * @return TdExpDatosComplementario
     */
    @FindById(TdExpDatosComplementarios.class)
    TdExpDatosComplementarios getById(java.lang.String id);
    
    /**
     * Get all TdExpDatosComplementario entities limited by a maximum number of elements.
     *
     * @return Collection of TdExpDatosComplementario
     */
    @FindAll(TdExpDatosComplementarios.class)
    List<TdExpDatosComplementarios> findAll();
    
    /**
     * Make persistence of TdExpDatosComplementario entities. If its identifier or primary key is null then create else update.
     *
     * @param entity TdExpDatosComplementario
     */

    @Save
    void save(TdExpDatosComplementarios entity);
    
    /**
     * Remove TdExpDatosComplementario entities.
     *
     * @param entity TdExpDatosComplementario
     */
    @Delete
    void delete(TdExpDatosComplementarios entity);


    /**
     * Find the first TdExpDatosComplementario entity that matches the condition 'where fecModifico is equals to'.
     *
     * @param fecModifico java.util.Date
     * @return TdExpDatosComplementario
     */
    @FindByCondition(value=TdExpDatosComplementarios.class, condition="FEC_MODIFICO=?")
    TdExpDatosComplementarios getByFecModifico(java.util.Date fecModifico);

    /**
     * Find all TdExpDatosComplementario entities that matches the condition 'where fecModifico is equals to'.
     *
     * @param fecModifico java.util.Date
     * @return Collection of TdExpDatosComplementario
     */
    @FindByCondition(value=TdExpDatosComplementarios.class, condition="FEC_MODIFICO=?")
    List<TdExpDatosComplementarios> findByFecModifico(java.util.Date fecModifico);

    /**
     * Find the first TdExpDatosComplementario entity that matches the condition 'where idGenero is equals to'.
     *
     * @param idGenero java.lang.String
     * @return TdExpDatosComplementario
     */
    @FindByCondition(value=TdExpDatosComplementarios.class, condition="ID_GENERO=?")
    TdExpDatosComplementarios getByIdGenero(java.lang.String idGenero);

    /**
     * Find all TdExpDatosComplementario entities that matches the condition 'where idGenero is equals to'.
     *
     * @param idGenero java.lang.String
     * @return Collection of TdExpDatosComplementario
     */
    @FindByCondition(value=TdExpDatosComplementarios.class, condition="ID_GENERO=?")
    List<TdExpDatosComplementarios> findByIdGenero(java.lang.String idGenero);

    /**
     * Find the first TdExpDatosComplementario entity that matches the condition 'where usuario is equals to'.
     *
     * @param usuario java.lang.String
     * @return TdExpDatosComplementario
     */
    @FindByCondition(value=TdExpDatosComplementarios.class, condition="USUARIO=?")
    TdExpDatosComplementarios getByUsuario(java.lang.String usuario);

    /**
     * Find all TdExpDatosComplementario entities that matches the condition 'where usuario is equals to'.
     *
     * @param usuario java.lang.String
     * @return Collection of TdExpDatosComplementario
     */
    @FindByCondition(value=TdExpDatosComplementarios.class, condition="USUARIO=?")
    List<TdExpDatosComplementarios> findByUsuario(java.lang.String usuario);

    /**
     * Find the first TdExpDatosComplementario entity that matches the condition 'where comCelPart is equals to'.
     *
     * @param comCelPart java.lang.String
     * @return TdExpDatosComplementario
     */
    @FindByCondition(value=TdExpDatosComplementarios.class, condition="COM_CEL_PART=?")
    TdExpDatosComplementarios getByComCelPart(java.lang.String comCelPart);

    /**
     * Find all TdExpDatosComplementario entities that matches the condition 'where comCelPart is equals to'.
     *
     * @param comCelPart java.lang.String
     * @return Collection of TdExpDatosComplementario
     */
    @FindByCondition(value=TdExpDatosComplementarios.class, condition="COM_CEL_PART=?")
    List<TdExpDatosComplementarios> findByComCelPart(java.lang.String comCelPart);

    /**
     * Find the first TdExpDatosComplementario entity that matches the condition 'where comEmailPart is equals to'.
     *
     * @param comEmailPart java.lang.String
     * @return TdExpDatosComplementario
     */
    @FindByCondition(value=TdExpDatosComplementarios.class, condition="COM_EMAIL_PART=?")
    TdExpDatosComplementarios getByComEmailPart(java.lang.String comEmailPart);

    /**
     * Find all TdExpDatosComplementario entities that matches the condition 'where comEmailPart is equals to'.
     *
     * @param comEmailPart java.lang.String
     * @return Collection of TdExpDatosComplementario
     */
    @FindByCondition(value=TdExpDatosComplementarios.class, condition="COM_EMAIL_PART=?")
    List<TdExpDatosComplementarios> findByComEmailPart(java.lang.String comEmailPart);

    /**
     * Find the first TdExpDatosComplementario entity that matches the condition 'where comEsPadreMadre is equals to'.
     *
     * @param comEsPadreMadre java.lang.String
     * @return TdExpDatosComplementario
     */
    @FindByCondition(value=TdExpDatosComplementarios.class, condition="COM_ES_PADRE_MADRE=?")
    TdExpDatosComplementarios getByComEsPadreMadre(java.lang.String comEsPadreMadre);

    /**
     * Find all TdExpDatosComplementario entities that matches the condition 'where comEsPadreMadre is equals to'.
     *
     * @param comEsPadreMadre java.lang.String
     * @return Collection of TdExpDatosComplementario
     */
    @FindByCondition(value=TdExpDatosComplementarios.class, condition="COM_ES_PADRE_MADRE=?")
    List<TdExpDatosComplementarios> findByComEsPadreMadre(java.lang.String comEsPadreMadre);

    /**
     * Find the first TdExpDatosComplementario entity that matches the condition 'where comNumRusp is equals to'.
     *
     * @param comNumRusp java.lang.Integer
     * @return TdExpDatosComplementario
     */
    @FindByCondition(value=TdExpDatosComplementarios.class, condition="COM_NUM_RUSP=?")
    TdExpDatosComplementarios getByComNumRusp(java.lang.Integer comNumRusp);

    /**
     * Find all TdExpDatosComplementario entities that matches the condition 'where comNumRusp is equals to'.
     *
     * @param comNumRusp java.lang.Integer
     * @return Collection of TdExpDatosComplementario
     */
    @FindByCondition(value=TdExpDatosComplementarios.class, condition="COM_NUM_RUSP=?")
    List<TdExpDatosComplementarios> findByComNumRusp(java.lang.Integer comNumRusp);

    /**
     * Find the first TdExpDatosComplementario entity that matches the condition 'where comNumSegSoc is equals to'.
     *
     * @param comNumSegSoc java.lang.String
     * @return TdExpDatosComplementario
     */
    @FindByCondition(value=TdExpDatosComplementarios.class, condition="COM_NUM_SEG_SOC=?")
    TdExpDatosComplementarios getByComNumSegSoc(java.lang.String comNumSegSoc);

    /**
     * Find all TdExpDatosComplementario entities that matches the condition 'where comNumSegSoc is equals to'.
     *
     * @param comNumSegSoc java.lang.String
     * @return Collection of TdExpDatosComplementario
     */
    @FindByCondition(value=TdExpDatosComplementarios.class, condition="COM_NUM_SEG_SOC=?")
    List<TdExpDatosComplementarios> findByComNumSegSoc(java.lang.String comNumSegSoc);

    /**
     * Find the first TdExpDatosComplementario entity that matches the condition 'where comTelPart is equals to'.
     *
     * @param comTelPart java.lang.String
     * @return TdExpDatosComplementario
     */
    @FindByCondition(value=TdExpDatosComplementarios.class, condition="COM_TEL_PART=?")
    TdExpDatosComplementarios getByComTelPart(java.lang.String comTelPart);

    /**
     * Find all TdExpDatosComplementario entities that matches the condition 'where comTelPart is equals to'.
     *
     * @param comTelPart java.lang.String
     * @return Collection of TdExpDatosComplementario
     */
    @FindByCondition(value=TdExpDatosComplementarios.class, condition="COM_TEL_PART=?")
    List<TdExpDatosComplementarios> findByComTelPart(java.lang.String comTelPart);

    /**
     * Find the first TdExpDatosComplementario entity that matches the condition 'where idDiscapacidad is equals to'.
     *
     * @param idDiscapacidad java.lang.String
     * @return TdExpDatosComplementario
     */
    @FindByCondition(value=TdExpDatosComplementarios.class, condition="ID_DISCAPACIDAD=?")
    TdExpDatosComplementarios getByIdDiscapacidad(java.lang.String idDiscapacidad);

    /**
     * Find all TdExpDatosComplementario entities that matches the condition 'where idDiscapacidad is equals to'.
     *
     * @param idDiscapacidad java.lang.String
     * @return Collection of TdExpDatosComplementario
     */
    @FindByCondition(value=TdExpDatosComplementarios.class, condition="ID_DISCAPACIDAD=?")
    List<TdExpDatosComplementarios> findByIdDiscapacidad(java.lang.String idDiscapacidad);

    /**
     * Find the first TdExpDatosComplementario entity that matches the condition 'where idDominioIdioma is equals to'.
     *
     * @param idDominioIdioma java.lang.Boolean
     * @return TdExpDatosComplementario
     */
    @FindByCondition(value=TdExpDatosComplementarios.class, condition="ID_DOMINIO_IDIOMA=?")
    TdExpDatosComplementarios getByIdDominioIdioma(java.lang.Boolean idDominioIdioma);

    /**
     * Find all TdExpDatosComplementario entities that matches the condition 'where idDominioIdioma is equals to'.
     *
     * @param idDominioIdioma java.lang.Boolean
     * @return Collection of TdExpDatosComplementario
     */
    @FindByCondition(value=TdExpDatosComplementarios.class, condition="ID_DOMINIO_IDIOMA=?")
    List<TdExpDatosComplementarios> findByIdDominioIdioma(java.lang.Boolean idDominioIdioma);

    /**
     * Find the first TdExpDatosComplementario entity that matches the condition 'where idEdoCivil is equals to'.
     *
     * @param idEdoCivil java.lang.String
     * @return TdExpDatosComplementario
     */
    @FindByCondition(value=TdExpDatosComplementarios.class, condition="ID_EDO_CIVIL=?")
    TdExpDatosComplementarios getByIdEdoCivil(java.lang.String idEdoCivil);

    /**
     * Find all TdExpDatosComplementario entities that matches the condition 'where idEdoCivil is equals to'.
     *
     * @param idEdoCivil java.lang.String
     * @return Collection of TdExpDatosComplementario
     */
    @FindByCondition(value=TdExpDatosComplementarios.class, condition="ID_EDO_CIVIL=?")
    List<TdExpDatosComplementarios> findByIdEdoCivil(java.lang.String idEdoCivil);

    /**
     * Find the first TdExpDatosComplementario entity that matches the condition 'where idEspProtCivil is equals to'.
     *
     * @param idEspProtCivil java.lang.Boolean
     * @return TdExpDatosComplementario
     */
    @FindByCondition(value=TdExpDatosComplementarios.class, condition="ID_ESP_PROT_CIVIL=?")
    TdExpDatosComplementarios getByIdEspProtCivil(java.lang.Boolean idEspProtCivil);

    /**
     * Find all TdExpDatosComplementario entities that matches the condition 'where idEspProtCivil is equals to'.
     *
     * @param idEspProtCivil java.lang.Boolean
     * @return Collection of TdExpDatosComplementario
     */
    @FindByCondition(value=TdExpDatosComplementarios.class, condition="ID_ESP_PROT_CIVIL=?")
    List<TdExpDatosComplementarios> findByIdEspProtCivil(java.lang.Boolean idEspProtCivil);

    /**
     * Find the first TdExpDatosComplementario entity that matches the condition 'where idIdioma is equals to'.
     *
     * @param idIdioma java.lang.Integer
     * @return TdExpDatosComplementario
     */
    @FindByCondition(value=TdExpDatosComplementarios.class, condition="ID_IDIOMA=?")
    TdExpDatosComplementarios getByIdIdioma(java.lang.Integer idIdioma);

    /**
     * Find all TdExpDatosComplementario entities that matches the condition 'where idIdioma is equals to'.
     *
     * @param idIdioma java.lang.Integer
     * @return Collection of TdExpDatosComplementario
     */
    @FindByCondition(value=TdExpDatosComplementarios.class, condition="ID_IDIOMA=?")
    List<TdExpDatosComplementarios> findByIdIdioma(java.lang.Integer idIdioma);

    /**
     * Find the first TdExpDatosComplementario entity that matches the condition 'where idInstProtCiv is equals to'.
     *
     * @param idInstProtCiv java.lang.Boolean
     * @return TdExpDatosComplementario
     */
    @FindByCondition(value=TdExpDatosComplementarios.class, condition="ID_INST_PROT_CIV=?")
    TdExpDatosComplementarios getByIdInstProtCiv(java.lang.Boolean idInstProtCiv);

    /**
     * Find all TdExpDatosComplementario entities that matches the condition 'where idInstProtCiv is equals to'.
     *
     * @param idInstProtCiv java.lang.Boolean
     * @return Collection of TdExpDatosComplementario
     */
    @FindByCondition(value=TdExpDatosComplementarios.class, condition="ID_INST_PROT_CIV=?")
    List<TdExpDatosComplementarios> findByIdInstProtCiv(java.lang.Boolean idInstProtCiv);

    /**
     * Find the first TdExpDatosComplementario entity that matches the condition 'where idTipoSangre is equals to'.
     *
     * @param idTipoSangre java.lang.String
     * @return TdExpDatosComplementario
     */
    @FindByCondition(value=TdExpDatosComplementarios.class, condition="ID_TIPO_SANGRE=?")
    TdExpDatosComplementarios getByIdTipoSangre(java.lang.String idTipoSangre);

    /**
     * Find all TdExpDatosComplementario entities that matches the condition 'where idTipoSangre is equals to'.
     *
     * @param idTipoSangre java.lang.String
     * @return Collection of TdExpDatosComplementario
     */
    @FindByCondition(value=TdExpDatosComplementarios.class, condition="ID_TIPO_SANGRE=?")
    List<TdExpDatosComplementarios> findByIdTipoSangre(java.lang.String idTipoSangre);

}
