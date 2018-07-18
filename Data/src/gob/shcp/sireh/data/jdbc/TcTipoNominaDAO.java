package gob.shcp.sireh.data.jdbc;

import gob.shcp.fsn.data.annotation.Delete;
import gob.shcp.fsn.data.annotation.FindAll;
import gob.shcp.fsn.data.annotation.FindByCondition;
import gob.shcp.fsn.data.annotation.FindById;
import gob.shcp.fsn.data.annotation.Save;
import gob.shcp.fsn.service.data.orm.JdbcDataService;

import java.util.List;

import gob.shcp.sireh.domain.jdbc.TcTipoNomina;

/**
 * Data access interface for TcTipoNomina.
 */
public interface TcTipoNominaDAO extends JdbcDataService {

    /**
     * Find TcTipoNomina entity by its identifier or primary key value.
     *
     * @param id identifier or primary key
     * @return TcTipoNomina
     */
    @FindById(TcTipoNomina.class)
    TcTipoNomina getById(java.lang.String id);

    /**
     * Get all TcTipoNomina entities limited by a maximum number of elements.
     *
     * @return Collection of TcTipoNomina
     */
    @FindAll(TcTipoNomina.class)
    List<TcTipoNomina> findAll();

    /**
     * Make persistence of TcTipoNomina entities. If its identifier or primary key is null then create else update.
     *
     * @param entity TcTipoNomina
     */
    @Save
    void save(TcTipoNomina entity);

    /**
     * Remove TcTipoNomina entities.
     *
     * @param entity TcTipoNomina
     */
    @Delete
    void delete(TcTipoNomina entity);


    /**
     * Find the first TcTipoNomina entity that matches the condition 'where fecModifico is equals to'.
     *
     * @param fecModifico java.util.Date
     * @return TcTipoNomina
     */
    @FindByCondition(value = TcTipoNomina.class, condition = "FEC_MODIFICO=?")
    TcTipoNomina getByFecModifico(java.util.Date fecModifico);

    /**
     * Find all TcTipoNomina entities that matches the condition 'where fecModifico is equals to'.
     *
     * @param fecModifico java.util.Date
     * @return Collection of TcTipoNomina
     */
    @FindByCondition(value = TcTipoNomina.class, condition = "FEC_MODIFICO=?")
    List<TcTipoNomina> findByFecModifico(java.util.Date fecModifico);

    /**
     * Find the first TcTipoNomina entity that matches the condition 'where usuario is equals to'.
     *
     * @param usuario java.lang.String
     * @return TcTipoNomina
     */
    @FindByCondition(value = TcTipoNomina.class, condition = "USUARIO=?")
    TcTipoNomina getByUsuario(java.lang.String usuario);

    /**
     * Find all TcTipoNomina entities that matches the condition 'where usuario is equals to'.
     *
     * @param usuario java.lang.String
     * @return Collection of TcTipoNomina
     */
    @FindByCondition(value = TcTipoNomina.class, condition = "USUARIO=?")
    List<TcTipoNomina> findByUsuario(java.lang.String usuario);

    /**
     * Find the first TcTipoNomina entity that matches the condition 'where cptosNominaClc is equals to'.
     *
     * @param cptosNominaClc java.lang.String
     * @return TcTipoNomina
     */
    @FindByCondition(value = TcTipoNomina.class, condition = "CPTOS_NOMINA_CLC=?")
    TcTipoNomina getByCptosNominaClc(java.lang.String cptosNominaClc);

    /**
     * Find all TcTipoNomina entities that matches the condition 'where cptosNominaClc is equals to'.
     *
     * @param cptosNominaClc java.lang.String
     * @return Collection of TcTipoNomina
     */
    @FindByCondition(value = TcTipoNomina.class, condition = "CPTOS_NOMINA_CLC=?")
    List<TcTipoNomina> findByCptosNominaClc(java.lang.String cptosNominaClc);

    /**
     * Find the first TcTipoNomina entity that matches the condition 'where descTipoNomina is equals to'.
     *
     * @param descTipoNomina java.lang.String
     * @return TcTipoNomina
     */
    @FindByCondition(value = TcTipoNomina.class, condition = "DESC_TIPO_NOMINA=?")
    TcTipoNomina getByDescTipoNomina(java.lang.String descTipoNomina);

    /**
     * Find all TcTipoNomina entities that matches the condition 'where descTipoNomina is equals to'.
     *
     * @param descTipoNomina java.lang.String
     * @return Collection of TcTipoNomina
     */
    @FindByCondition(value = TcTipoNomina.class, condition = "DESC_TIPO_NOMINA=?")
    List<TcTipoNomina> findByDescTipoNomina(java.lang.String descTipoNomina);

    /**
     * Find the first TcTipoNomina entity that matches the condition 'where guiaContableClc is equals to'.
     *
     * @param guiaContableClc java.lang.String
     * @return TcTipoNomina
     */
    @FindByCondition(value = TcTipoNomina.class, condition = "GUIA_CONTABLE_CLC=?")
    TcTipoNomina getByGuiaContableClc(java.lang.String guiaContableClc);

    /**
     * Find all TcTipoNomina entities that matches the condition 'where guiaContableClc is equals to'.
     *
     * @param guiaContableClc java.lang.String
     * @return Collection of TcTipoNomina
     */
    @FindByCondition(value = TcTipoNomina.class, condition = "GUIA_CONTABLE_CLC=?")
    List<TcTipoNomina> findByGuiaContableClc(java.lang.String guiaContableClc);

    /**
     * Find the first TcTipoNomina entity that matches the condition 'where parametrosClc is equals to'.
     *
     * @param parametrosClc java.lang.String
     * @return TcTipoNomina
     */
    @FindByCondition(value = TcTipoNomina.class, condition = "PARAMETROS_CLC=?")
    TcTipoNomina getByParametrosClc(java.lang.String parametrosClc);

    /**
     * Find all TcTipoNomina entities that matches the condition 'where parametrosClc is equals to'.
     *
     * @param parametrosClc java.lang.String
     * @return Collection of TcTipoNomina
     */
    @FindByCondition(value = TcTipoNomina.class, condition = "PARAMETROS_CLC=?")
    List<TcTipoNomina> findByParametrosClc(java.lang.String parametrosClc);

    /**
     * Find the first TcTipoNomina entity that matches the condition 'where periodoClc is equals to'.
     *
     * @param periodoClc java.lang.String
     * @return TcTipoNomina
     */
    @FindByCondition(value = TcTipoNomina.class, condition = "PERIODO_CLC=?")
    TcTipoNomina getByPeriodoClc(java.lang.String periodoClc);

    /**
     * Find all TcTipoNomina entities that matches the condition 'where periodoClc is equals to'.
     *
     * @param periodoClc java.lang.String
     * @return Collection of TcTipoNomina
     */
    @FindByCondition(value = TcTipoNomina.class, condition = "PERIODO_CLC=?")
    List<TcTipoNomina> findByPeriodoClc(java.lang.String periodoClc);

    /**
     * Find the first TcTipoNomina entity that matches the condition 'where tipoClc is equals to'.
     *
     * @param tipoClc java.lang.String
     * @return TcTipoNomina
     */
    @FindByCondition(value = TcTipoNomina.class, condition = "TIPO_CLC=?")
    TcTipoNomina getByTipoClc(java.lang.String tipoClc);

    /**
     * Find all TcTipoNomina entities that matches the condition 'where tipoClc is equals to'.
     *
     * @param tipoClc java.lang.String
     * @return Collection of TcTipoNomina
     */
    @FindByCondition(value = TcTipoNomina.class, condition = "TIPO_CLC=?")
    List<TcTipoNomina> findByTipoClc(java.lang.String tipoClc);

    /**
     * Find the first TcTipoNomina entity that matches the condition 'where tipoNomAviFrAct is equals to'.
     *
     * @param tipoNomAviFrAct java.lang.String
     * @return TcTipoNomina
     */
    @FindByCondition(value = TcTipoNomina.class, condition = "TIPO_NOM_AVI_FR_ACT=?")
    TcTipoNomina getByTipoNomAviFrAct(java.lang.String tipoNomAviFrAct);

    /**
     * Find all TcTipoNomina entities that matches the condition 'where tipoNomAviFrAct is equals to'.
     *
     * @param tipoNomAviFrAct java.lang.String
     * @return Collection of TcTipoNomina
     */
    @FindByCondition(value = TcTipoNomina.class, condition = "TIPO_NOM_AVI_FR_ACT=?")
    List<TcTipoNomina> findByTipoNomAviFrAct(java.lang.String tipoNomAviFrAct);

    /**
     * Find the first TcTipoNomina entity that matches the condition 'where tipoNomAviFrAnt is equals to'.
     *
     * @param tipoNomAviFrAnt java.lang.String
     * @return TcTipoNomina
     */
    @FindByCondition(value = TcTipoNomina.class, condition = "TIPO_NOM_AVI_FR_ANT=?")
    TcTipoNomina getByTipoNomAviFrAnt(java.lang.String tipoNomAviFrAnt);

    /**
     * Find all TcTipoNomina entities that matches the condition 'where tipoNomAviFrAnt is equals to'.
     *
     * @param tipoNomAviFrAnt java.lang.String
     * @return Collection of TcTipoNomina
     */
    @FindByCondition(value = TcTipoNomina.class, condition = "TIPO_NOM_AVI_FR_ANT=?")
    List<TcTipoNomina> findByTipoNomAviFrAnt(java.lang.String tipoNomAviFrAnt);

    /**
     * Find the first TcTipoNomina entity that matches the condition 'where tipoNomAviRei is equals to'.
     *
     * @param tipoNomAviRei java.lang.String
     * @return TcTipoNomina
     */
    @FindByCondition(value = TcTipoNomina.class, condition = "TIPO_NOM_AVI_REI=?")
    TcTipoNomina getByTipoNomAviRei(java.lang.String tipoNomAviRei);

    /**
     * Find all TcTipoNomina entities that matches the condition 'where tipoNomAviRei is equals to'.
     *
     * @param tipoNomAviRei java.lang.String
     * @return Collection of TcTipoNomina
     */
    @FindByCondition(value = TcTipoNomina.class, condition = "TIPO_NOM_AVI_REI=?")
    List<TcTipoNomina> findByTipoNomAviRei(java.lang.String tipoNomAviRei);

    /**
     * Find the first TcTipoNomina entity that matches the condition 'where tipoNomAviReiAnt is equals to'.
     *
     * @param tipoNomAviReiAnt java.lang.String
     * @return TcTipoNomina
     */
    @FindByCondition(value = TcTipoNomina.class, condition = "TIPO_NOM_AVI_REI_ANT=?")
    TcTipoNomina getByTipoNomAviReiAnt(java.lang.String tipoNomAviReiAnt);

    /**
     * Find all TcTipoNomina entities that matches the condition 'where tipoNomAviReiAnt is equals to'.
     *
     * @param tipoNomAviReiAnt java.lang.String
     * @return Collection of TcTipoNomina
     */
    @FindByCondition(value = TcTipoNomina.class, condition = "TIPO_NOM_AVI_REI_ANT=?")
    List<TcTipoNomina> findByTipoNomAviReiAnt(java.lang.String tipoNomAviReiAnt);

    /**
     * Find the first TcTipoNomina entity that matches the condition 'where tipoNomCpto is equals to'.
     *
     * @param tipoNomCpto java.lang.String
     * @return TcTipoNomina
     */
    @FindByCondition(value = TcTipoNomina.class, condition = "TIPO_NOM_CPTO=?")
    TcTipoNomina getByTipoNomCpto(java.lang.String tipoNomCpto);

    /**
     * Find all TcTipoNomina entities that matches the condition 'where tipoNomCpto is equals to'.
     *
     * @param tipoNomCpto java.lang.String
     * @return Collection of TcTipoNomina
     */
    @FindByCondition(value = TcTipoNomina.class, condition = "TIPO_NOM_CPTO=?")
    List<TcTipoNomina> findByTipoNomCpto(java.lang.String tipoNomCpto);

    /**
     * Find the first TcTipoNomina entity that matches the condition 'where tipoNomCptosCancela is equals to'.
     *
     * @param tipoNomCptosCancela java.lang.String
     * @return TcTipoNomina
     */
    @FindByCondition(value = TcTipoNomina.class, condition = "TIPO_NOM_CPTOS_CANCELA=?")
    TcTipoNomina getByTipoNomCptosCancela(java.lang.String tipoNomCptosCancela);

    /**
     * Find all TcTipoNomina entities that matches the condition 'where tipoNomCptosCancela is equals to'.
     *
     * @param tipoNomCptosCancela java.lang.String
     * @return Collection of TcTipoNomina
     */
    @FindByCondition(value = TcTipoNomina.class, condition = "TIPO_NOM_CPTOS_CANCELA=?")
    List<TcTipoNomina> findByTipoNomCptosCancela(java.lang.String tipoNomCptosCancela);

    /**
     * Find the first TcTipoNomina entity that matches the condition 'where tipoNomCxlc is equals to'.
     *
     * @param tipoNomCxlc java.lang.String
     * @return TcTipoNomina
     */
    @FindByCondition(value = TcTipoNomina.class, condition = "TIPO_NOM_CXLC=?")
    TcTipoNomina getByTipoNomCxlc(java.lang.String tipoNomCxlc);

    /**
     * Find all TcTipoNomina entities that matches the condition 'where tipoNomCxlc is equals to'.
     *
     * @param tipoNomCxlc java.lang.String
     * @return Collection of TcTipoNomina
     */
    @FindByCondition(value = TcTipoNomina.class, condition = "TIPO_NOM_CXLC=?")
    List<TcTipoNomina> findByTipoNomCxlc(java.lang.String tipoNomCxlc);

    /**
     * Find the first TcTipoNomina entity that matches the condition 'where tipoNomMovto is equals to'.
     *
     * @param tipoNomMovto java.lang.String
     * @return TcTipoNomina
     */
    @FindByCondition(value = TcTipoNomina.class, condition = "TIPO_NOM_MOVTO=?")
    TcTipoNomina getByTipoNomMovto(java.lang.String tipoNomMovto);

    /**
     * Find all TcTipoNomina entities that matches the condition 'where tipoNomMovto is equals to'.
     *
     * @param tipoNomMovto java.lang.String
     * @return Collection of TcTipoNomina
     */
    @FindByCondition(value = TcTipoNomina.class, condition = "TIPO_NOM_MOVTO=?")
    List<TcTipoNomina> findByTipoNomMovto(java.lang.String tipoNomMovto);

    /**
     * Find the first TcTipoNomina entity that matches the condition 'where tipoNomOfiRec is equals to'.
     *
     * @param tipoNomOfiRec java.lang.String
     * @return TcTipoNomina
     */
    @FindByCondition(value = TcTipoNomina.class, condition = "TIPO_NOM_OFI_REC=?")
    TcTipoNomina getByTipoNomOfiRec(java.lang.String tipoNomOfiRec);

    /**
     * Find all TcTipoNomina entities that matches the condition 'where tipoNomOfiRec is equals to'.
     *
     * @param tipoNomOfiRec java.lang.String
     * @return Collection of TcTipoNomina
     */
    @FindByCondition(value = TcTipoNomina.class, condition = "TIPO_NOM_OFI_REC=?")
    List<TcTipoNomina> findByTipoNomOfiRec(java.lang.String tipoNomOfiRec);

    /**
     * Find the first TcTipoNomina entity that matches the condition 'where tipoNomPresupuestal is equals to'.
     *
     * @param tipoNomPresupuestal java.lang.String
     * @return TcTipoNomina
     */
    @FindByCondition(value = TcTipoNomina.class, condition = "TIPO_NOM_PRESUPUESTAL=?")
    TcTipoNomina getByTipoNomPresupuestal(java.lang.String tipoNomPresupuestal);

    /**
     * Find all TcTipoNomina entities that matches the condition 'where tipoNomPresupuestal is equals to'.
     *
     * @param tipoNomPresupuestal java.lang.String
     * @return Collection of TcTipoNomina
     */
    @FindByCondition(value = TcTipoNomina.class, condition = "TIPO_NOM_PRESUPUESTAL=?")
    List<TcTipoNomina> findByTipoNomPresupuestal(java.lang.String tipoNomPresupuestal);

    /**
     * Find the first TcTipoNomina entity that matches the condition 'where tipoNomSnScan is equals to'.
     *
     * @param tipoNomSnScan java.lang.String
     * @return TcTipoNomina
     */
    @FindByCondition(value = TcTipoNomina.class, condition = "TIPO_NOM_SN_SCAN=?")
    TcTipoNomina getByTipoNomSnScan(java.lang.String tipoNomSnScan);

    /**
     * Find all TcTipoNomina entities that matches the condition 'where tipoNomSnScan is equals to'.
     *
     * @param tipoNomSnScan java.lang.String
     * @return Collection of TcTipoNomina
     */
    @FindByCondition(value = TcTipoNomina.class, condition = "TIPO_NOM_SN_SCAN=?")
    List<TcTipoNomina> findByTipoNomSnScan(java.lang.String tipoNomSnScan);
}
