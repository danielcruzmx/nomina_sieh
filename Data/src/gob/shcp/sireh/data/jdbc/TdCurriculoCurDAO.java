package gob.shcp.sireh.data.jdbc;

import gob.shcp.fsn.data.annotation.Delete;
import gob.shcp.fsn.data.annotation.FindAll;
import gob.shcp.fsn.data.annotation.FindByCondition;
import gob.shcp.fsn.data.annotation.FindById;
import gob.shcp.fsn.data.annotation.Save;
import gob.shcp.fsn.service.data.orm.JdbcDataService;

import java.util.List;

import gob.shcp.sireh.domain.jdbc.TdCurriculoCur;


/**
 * Data access interface for TdCurriculoCur.
 */
public interface TdCurriculoCurDAO extends JdbcDataService {
    /**
     * Find TdCurriculoCur entity by its identifier or primary key value.
     *
     * @param id identifier or primary key
     * @return TdCurriculoCur
     */
    @FindById(TdCurriculoCur.class)
    TdCurriculoCur getById(java.lang.String id);
    
    /**
     * Get all TdCurriculoCur entities limited by a maximum number of elements.
     *
     * @return Collection of TdCurriculoCur
     */
    @FindAll(TdCurriculoCur.class)
    List<TdCurriculoCur> findAll();
    
    /**
     * Make persistence of TdCurriculoCur entities. If its identifier or primary key is null then create else update.
     *
     * @param entity TdCurriculoCur
     */
    @Save
    void save(TdCurriculoCur entity);
    
    /**
     * Remove TdCurriculoCur entities.
     *
     * @param entity TdCurriculoCur
     */
    @Delete
    void delete(TdCurriculoCur entity);


    /**
     * Find the first TdCurriculoCur entity that matches the condition 'where fecModifico is equals to'.
     *
     * @param fecModifico java.util.Date
     * @return TdCurriculoCur
     */
    @FindByCondition(value=TdCurriculoCur.class, condition="FEC_MODIFICO=?")
    TdCurriculoCur getByFecModifico(java.util.Date fecModifico);

    /**
     * Find all TdCurriculoCur entities that matches the condition 'where fecModifico is equals to'.
     *
     * @param fecModifico java.util.Date
     * @return Collection of TdCurriculoCur
     */
    @FindByCondition(value=TdCurriculoCur.class, condition="FEC_MODIFICO=?")
    List<TdCurriculoCur> findByFecModifico(java.util.Date fecModifico);

    /**
     * Find the first TdCurriculoCur entity that matches the condition 'where usuario is equals to'.
     *
     * @param usuario java.lang.String
     * @return TdCurriculoCur
     */
    @FindByCondition(value=TdCurriculoCur.class, condition="USUARIO=?")
    TdCurriculoCur getByUsuario(java.lang.String usuario);

    /**
     * Find all TdCurriculoCur entities that matches the condition 'where usuario is equals to'.
     *
     * @param usuario java.lang.String
     * @return Collection of TdCurriculoCur
     */
    @FindByCondition(value=TdCurriculoCur.class, condition="USUARIO=?")
    List<TdCurriculoCur> findByUsuario(java.lang.String usuario);

    /**
     * Find the first TdCurriculoCur entity that matches the condition 'where curriccCurso1 is equals to'.
     *
     * @param curriccCurso1 java.lang.String
     * @return TdCurriculoCur
     */
    @FindByCondition(value=TdCurriculoCur.class, condition="CURRICC_CURSO1=?")
    TdCurriculoCur getByCurriccCurso1(java.lang.String curriccCurso1);

    /**
     * Find all TdCurriculoCur entities that matches the condition 'where curriccCurso1 is equals to'.
     *
     * @param curriccCurso1 java.lang.String
     * @return Collection of TdCurriculoCur
     */
    @FindByCondition(value=TdCurriculoCur.class, condition="CURRICC_CURSO1=?")
    List<TdCurriculoCur> findByCurriccCurso1(java.lang.String curriccCurso1);

    /**
     * Find the first TdCurriculoCur entity that matches the condition 'where curriccCurso2 is equals to'.
     *
     * @param curriccCurso2 java.lang.String
     * @return TdCurriculoCur
     */
    @FindByCondition(value=TdCurriculoCur.class, condition="CURRICC_CURSO2=?")
    TdCurriculoCur getByCurriccCurso2(java.lang.String curriccCurso2);

    /**
     * Find all TdCurriculoCur entities that matches the condition 'where curriccCurso2 is equals to'.
     *
     * @param curriccCurso2 java.lang.String
     * @return Collection of TdCurriculoCur
     */
    @FindByCondition(value=TdCurriculoCur.class, condition="CURRICC_CURSO2=?")
    List<TdCurriculoCur> findByCurriccCurso2(java.lang.String curriccCurso2);

    /**
     * Find the first TdCurriculoCur entity that matches the condition 'where curriccCurso3 is equals to'.
     *
     * @param curriccCurso3 java.lang.String
     * @return TdCurriculoCur
     */
    @FindByCondition(value=TdCurriculoCur.class, condition="CURRICC_CURSO3=?")
    TdCurriculoCur getByCurriccCurso3(java.lang.String curriccCurso3);

    /**
     * Find all TdCurriculoCur entities that matches the condition 'where curriccCurso3 is equals to'.
     *
     * @param curriccCurso3 java.lang.String
     * @return Collection of TdCurriculoCur
     */
    @FindByCondition(value=TdCurriculoCur.class, condition="CURRICC_CURSO3=?")
    List<TdCurriculoCur> findByCurriccCurso3(java.lang.String curriccCurso3);

    /**
     * Find the first TdCurriculoCur entity that matches the condition 'where curriccDocto1 is equals to'.
     *
     * @param curriccDocto1 java.lang.String
     * @return TdCurriculoCur
     */
    @FindByCondition(value=TdCurriculoCur.class, condition="CURRICC_DOCTO1=?")
    TdCurriculoCur getByCurriccDocto1(java.lang.String curriccDocto1);

    /**
     * Find all TdCurriculoCur entities that matches the condition 'where curriccDocto1 is equals to'.
     *
     * @param curriccDocto1 java.lang.String
     * @return Collection of TdCurriculoCur
     */
    @FindByCondition(value=TdCurriculoCur.class, condition="CURRICC_DOCTO1=?")
    List<TdCurriculoCur> findByCurriccDocto1(java.lang.String curriccDocto1);

    /**
     * Find the first TdCurriculoCur entity that matches the condition 'where curriccDocto2 is equals to'.
     *
     * @param curriccDocto2 java.lang.String
     * @return TdCurriculoCur
     */
    @FindByCondition(value=TdCurriculoCur.class, condition="CURRICC_DOCTO2=?")
    TdCurriculoCur getByCurriccDocto2(java.lang.String curriccDocto2);

    /**
     * Find all TdCurriculoCur entities that matches the condition 'where curriccDocto2 is equals to'.
     *
     * @param curriccDocto2 java.lang.String
     * @return Collection of TdCurriculoCur
     */
    @FindByCondition(value=TdCurriculoCur.class, condition="CURRICC_DOCTO2=?")
    List<TdCurriculoCur> findByCurriccDocto2(java.lang.String curriccDocto2);

    /**
     * Find the first TdCurriculoCur entity that matches the condition 'where curriccDocto3 is equals to'.
     *
     * @param curriccDocto3 java.lang.String
     * @return TdCurriculoCur
     */
    @FindByCondition(value=TdCurriculoCur.class, condition="CURRICC_DOCTO3=?")
    TdCurriculoCur getByCurriccDocto3(java.lang.String curriccDocto3);

    /**
     * Find all TdCurriculoCur entities that matches the condition 'where curriccDocto3 is equals to'.
     *
     * @param curriccDocto3 java.lang.String
     * @return Collection of TdCurriculoCur
     */
    @FindByCondition(value=TdCurriculoCur.class, condition="CURRICC_DOCTO3=?")
    List<TdCurriculoCur> findByCurriccDocto3(java.lang.String curriccDocto3);

    /**
     * Find the first TdCurriculoCur entity that matches the condition 'where curriccDuracion1 is equals to'.
     *
     * @param curriccDuracion1 java.lang.String
     * @return TdCurriculoCur
     */
    @FindByCondition(value=TdCurriculoCur.class, condition="CURRICC_DURACION1=?")
    TdCurriculoCur getByCurriccDuracion1(java.lang.String curriccDuracion1);

    /**
     * Find all TdCurriculoCur entities that matches the condition 'where curriccDuracion1 is equals to'.
     *
     * @param curriccDuracion1 java.lang.String
     * @return Collection of TdCurriculoCur
     */
    @FindByCondition(value=TdCurriculoCur.class, condition="CURRICC_DURACION1=?")
    List<TdCurriculoCur> findByCurriccDuracion1(java.lang.String curriccDuracion1);

    /**
     * Find the first TdCurriculoCur entity that matches the condition 'where curriccDuracion2 is equals to'.
     *
     * @param curriccDuracion2 java.lang.String
     * @return TdCurriculoCur
     */
    @FindByCondition(value=TdCurriculoCur.class, condition="CURRICC_DURACION2=?")
    TdCurriculoCur getByCurriccDuracion2(java.lang.String curriccDuracion2);

    /**
     * Find all TdCurriculoCur entities that matches the condition 'where curriccDuracion2 is equals to'.
     *
     * @param curriccDuracion2 java.lang.String
     * @return Collection of TdCurriculoCur
     */
    @FindByCondition(value=TdCurriculoCur.class, condition="CURRICC_DURACION2=?")
    List<TdCurriculoCur> findByCurriccDuracion2(java.lang.String curriccDuracion2);

    /**
     * Find the first TdCurriculoCur entity that matches the condition 'where curriccDuracion3 is equals to'.
     *
     * @param curriccDuracion3 java.lang.String
     * @return TdCurriculoCur
     */
    @FindByCondition(value=TdCurriculoCur.class, condition="CURRICC_DURACION3=?")
    TdCurriculoCur getByCurriccDuracion3(java.lang.String curriccDuracion3);

    /**
     * Find all TdCurriculoCur entities that matches the condition 'where curriccDuracion3 is equals to'.
     *
     * @param curriccDuracion3 java.lang.String
     * @return Collection of TdCurriculoCur
     */
    @FindByCondition(value=TdCurriculoCur.class, condition="CURRICC_DURACION3=?")
    List<TdCurriculoCur> findByCurriccDuracion3(java.lang.String curriccDuracion3);

    /**
     * Find the first TdCurriculoCur entity that matches the condition 'where curriccGradoa1 is equals to'.
     *
     * @param curriccGradoa1 java.lang.String
     * @return TdCurriculoCur
     */
    @FindByCondition(value=TdCurriculoCur.class, condition="CURRICC_GRADOA1=?")
    TdCurriculoCur getByCurriccGradoa1(java.lang.String curriccGradoa1);

    /**
     * Find all TdCurriculoCur entities that matches the condition 'where curriccGradoa1 is equals to'.
     *
     * @param curriccGradoa1 java.lang.String
     * @return Collection of TdCurriculoCur
     */
    @FindByCondition(value=TdCurriculoCur.class, condition="CURRICC_GRADOA1=?")
    List<TdCurriculoCur> findByCurriccGradoa1(java.lang.String curriccGradoa1);

    /**
     * Find the first TdCurriculoCur entity that matches the condition 'where curriccGradoa2 is equals to'.
     *
     * @param curriccGradoa2 java.lang.String
     * @return TdCurriculoCur
     */
    @FindByCondition(value=TdCurriculoCur.class, condition="CURRICC_GRADOA2=?")
    TdCurriculoCur getByCurriccGradoa2(java.lang.String curriccGradoa2);

    /**
     * Find all TdCurriculoCur entities that matches the condition 'where curriccGradoa2 is equals to'.
     *
     * @param curriccGradoa2 java.lang.String
     * @return Collection of TdCurriculoCur
     */
    @FindByCondition(value=TdCurriculoCur.class, condition="CURRICC_GRADOA2=?")
    List<TdCurriculoCur> findByCurriccGradoa2(java.lang.String curriccGradoa2);

    /**
     * Find the first TdCurriculoCur entity that matches the condition 'where curriccGradoa3 is equals to'.
     *
     * @param curriccGradoa3 java.lang.String
     * @return TdCurriculoCur
     */
    @FindByCondition(value=TdCurriculoCur.class, condition="CURRICC_GRADOA3=?")
    TdCurriculoCur getByCurriccGradoa3(java.lang.String curriccGradoa3);

    /**
     * Find all TdCurriculoCur entities that matches the condition 'where curriccGradoa3 is equals to'.
     *
     * @param curriccGradoa3 java.lang.String
     * @return Collection of TdCurriculoCur
     */
    @FindByCondition(value=TdCurriculoCur.class, condition="CURRICC_GRADOA3=?")
    List<TdCurriculoCur> findByCurriccGradoa3(java.lang.String curriccGradoa3);

    /**
     * Find the first TdCurriculoCur entity that matches the condition 'where curriccInstituto1 is equals to'.
     *
     * @param curriccInstituto1 java.lang.String
     * @return TdCurriculoCur
     */
    @FindByCondition(value=TdCurriculoCur.class, condition="CURRICC_INSTITUTO1=?")
    TdCurriculoCur getByCurriccInstituto1(java.lang.String curriccInstituto1);

    /**
     * Find all TdCurriculoCur entities that matches the condition 'where curriccInstituto1 is equals to'.
     *
     * @param curriccInstituto1 java.lang.String
     * @return Collection of TdCurriculoCur
     */
    @FindByCondition(value=TdCurriculoCur.class, condition="CURRICC_INSTITUTO1=?")
    List<TdCurriculoCur> findByCurriccInstituto1(java.lang.String curriccInstituto1);

    /**
     * Find the first TdCurriculoCur entity that matches the condition 'where curriccInstituto2 is equals to'.
     *
     * @param curriccInstituto2 java.lang.String
     * @return TdCurriculoCur
     */
    @FindByCondition(value=TdCurriculoCur.class, condition="CURRICC_INSTITUTO2=?")
    TdCurriculoCur getByCurriccInstituto2(java.lang.String curriccInstituto2);

    /**
     * Find all TdCurriculoCur entities that matches the condition 'where curriccInstituto2 is equals to'.
     *
     * @param curriccInstituto2 java.lang.String
     * @return Collection of TdCurriculoCur
     */
    @FindByCondition(value=TdCurriculoCur.class, condition="CURRICC_INSTITUTO2=?")
    List<TdCurriculoCur> findByCurriccInstituto2(java.lang.String curriccInstituto2);

    /**
     * Find the first TdCurriculoCur entity that matches the condition 'where curriccInstituto3 is equals to'.
     *
     * @param curriccInstituto3 java.lang.String
     * @return TdCurriculoCur
     */
    @FindByCondition(value=TdCurriculoCur.class, condition="CURRICC_INSTITUTO3=?")
    TdCurriculoCur getByCurriccInstituto3(java.lang.String curriccInstituto3);

    /**
     * Find all TdCurriculoCur entities that matches the condition 'where curriccInstituto3 is equals to'.
     *
     * @param curriccInstituto3 java.lang.String
     * @return Collection of TdCurriculoCur
     */
    @FindByCondition(value=TdCurriculoCur.class, condition="CURRICC_INSTITUTO3=?")
    List<TdCurriculoCur> findByCurriccInstituto3(java.lang.String curriccInstituto3);
}