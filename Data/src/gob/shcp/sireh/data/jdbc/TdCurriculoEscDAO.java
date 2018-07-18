package gob.shcp.sireh.data.jdbc;

import gob.shcp.fsn.data.annotation.Delete;
import gob.shcp.fsn.data.annotation.FindAll;
import gob.shcp.fsn.data.annotation.FindByCondition;
import gob.shcp.fsn.data.annotation.FindById;
import gob.shcp.fsn.data.annotation.Save;
import gob.shcp.fsn.service.data.orm.JdbcDataService;

import java.util.List;

import gob.shcp.sireh.domain.jdbc.TdCurriculoEsc;


/**
 * Data access interface for TdCurriculoEsc.
 */
public interface TdCurriculoEscDAO extends JdbcDataService {
    /**
     * Find TdCurriculoEsc entity by its identifier or primary key value.
     *
     * @param id identifier or primary key
     * @return TdCurriculoEsc
     */
    @FindById(TdCurriculoEsc.class)
    TdCurriculoEsc getById(java.lang.String id);
    
    /**
     * Get all TdCurriculoEsc entities limited by a maximum number of elements.
     *
     * @return Collection of TdCurriculoEsc
     */
    @FindAll(TdCurriculoEsc.class)
    List<TdCurriculoEsc> findAll();
    
    /**
     * Make persistence of TdCurriculoEsc entities. If its identifier or primary key is null then create else update.
     *
     * @param entity TdCurriculoEsc
     */
    @Save
    void save(TdCurriculoEsc entity);
    
    /**
     * Remove TdCurriculoEsc entities.
     *
     * @param entity TdCurriculoEsc
     */
    @Delete
    void delete(TdCurriculoEsc entity);


    /**
     * Find the first TdCurriculoEsc entity that matches the condition 'where fecModifico is equals to'.
     *
     * @param fecModifico java.util.Date
     * @return TdCurriculoEsc
     */
    @FindByCondition(value=TdCurriculoEsc.class, condition="FEC_MODIFICO=?")
    TdCurriculoEsc getByFecModifico(java.util.Date fecModifico);

    /**
     * Find all TdCurriculoEsc entities that matches the condition 'where fecModifico is equals to'.
     *
     * @param fecModifico java.util.Date
     * @return Collection of TdCurriculoEsc
     */
    @FindByCondition(value=TdCurriculoEsc.class, condition="FEC_MODIFICO=?")
    List<TdCurriculoEsc> findByFecModifico(java.util.Date fecModifico);

    /**
     * Find the first TdCurriculoEsc entity that matches the condition 'where usuario is equals to'.
     *
     * @param usuario java.lang.String
     * @return TdCurriculoEsc
     */
    @FindByCondition(value=TdCurriculoEsc.class, condition="USUARIO=?")
    TdCurriculoEsc getByUsuario(java.lang.String usuario);

    /**
     * Find all TdCurriculoEsc entities that matches the condition 'where usuario is equals to'.
     *
     * @param usuario java.lang.String
     * @return Collection of TdCurriculoEsc
     */
    @FindByCondition(value=TdCurriculoEsc.class, condition="USUARIO=?")
    List<TdCurriculoEsc> findByUsuario(java.lang.String usuario);

    /**
     * Find the first TdCurriculoEsc entity that matches the condition 'where curriceDocto is equals to'.
     *
     * @param curriceDocto java.lang.String
     * @return TdCurriculoEsc
     */
    @FindByCondition(value=TdCurriculoEsc.class, condition="CURRICE_DOCTO=?")
    TdCurriculoEsc getByCurriceDocto(java.lang.String curriceDocto);

    /**
     * Find all TdCurriculoEsc entities that matches the condition 'where curriceDocto is equals to'.
     *
     * @param curriceDocto java.lang.String
     * @return Collection of TdCurriculoEsc
     */
    @FindByCondition(value=TdCurriculoEsc.class, condition="CURRICE_DOCTO=?")
    List<TdCurriculoEsc> findByCurriceDocto(java.lang.String curriceDocto);

    /**
     * Find the first TdCurriculoEsc entity that matches the condition 'where curriceEscolaridad is equals to'.
     *
     * @param curriceEscolaridad java.lang.String
     * @return TdCurriculoEsc
     */
    @FindByCondition(value=TdCurriculoEsc.class, condition="CURRICE_ESCOLARIDAD=?")
    TdCurriculoEsc getByCurriceEscolaridad(java.lang.String curriceEscolaridad);

    /**
     * Find all TdCurriculoEsc entities that matches the condition 'where curriceEscolaridad is equals to'.
     *
     * @param curriceEscolaridad java.lang.String
     * @return Collection of TdCurriculoEsc
     */
    @FindByCondition(value=TdCurriculoEsc.class, condition="CURRICE_ESCOLARIDAD=?")
    List<TdCurriculoEsc> findByCurriceEscolaridad(java.lang.String curriceEscolaridad);

    /**
     * Find the first TdCurriculoEsc entity that matches the condition 'where curriceGradoAvance is equals to'.
     *
     * @param curriceGradoAvance java.lang.String
     * @return TdCurriculoEsc
     */
    @FindByCondition(value=TdCurriculoEsc.class, condition="CURRICE_GRADO_AVANCE=?")
    TdCurriculoEsc getByCurriceGradoAvance(java.lang.String curriceGradoAvance);

    /**
     * Find all TdCurriculoEsc entities that matches the condition 'where curriceGradoAvance is equals to'.
     *
     * @param curriceGradoAvance java.lang.String
     * @return Collection of TdCurriculoEsc
     */
    @FindByCondition(value=TdCurriculoEsc.class, condition="CURRICE_GRADO_AVANCE=?")
    List<TdCurriculoEsc> findByCurriceGradoAvance(java.lang.String curriceGradoAvance);

    /**
     * Find the first TdCurriculoEsc entity that matches the condition 'where curriceInstEduc is equals to'.
     *
     * @param curriceInstEduc java.lang.String
     * @return TdCurriculoEsc
     */
    @FindByCondition(value=TdCurriculoEsc.class, condition="CURRICE_INST_EDUC=?")
    TdCurriculoEsc getByCurriceInstEduc(java.lang.String curriceInstEduc);

    /**
     * Find all TdCurriculoEsc entities that matches the condition 'where curriceInstEduc is equals to'.
     *
     * @param curriceInstEduc java.lang.String
     * @return Collection of TdCurriculoEsc
     */
    @FindByCondition(value=TdCurriculoEsc.class, condition="CURRICE_INST_EDUC=?")
    List<TdCurriculoEsc> findByCurriceInstEduc(java.lang.String curriceInstEduc);
    /**
     * Find the first TdCurriculoEsc entity that matches the condition 'where curriceCarrera is equals to'.
     *
     * @param curriceCarrera java.lang.String
     * @return TdCurriculoEsc
     */
    @FindByCondition(value=TdCurriculoEsc.class, condition="CURRICE_CARRERA=?")
    TdCurriculoEsc getByCurriceCarrera(java.lang.String curriceCarrera);

    /**
     * Find all TdCurriculoEsc entities that matches the condition 'where curriceCarrera is equals to'.
     *
     * @param curriceCarrera java.lang.String
     * @return Collection of TdCurriculoEsc
     */
    @FindByCondition(value=TdCurriculoEsc.class, condition="CURRICE_CARRERA=?")
    List<TdCurriculoEsc> findByCurriceCarrera(java.lang.String curriceCarrera);
}