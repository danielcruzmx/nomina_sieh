package gob.shcp.sireh.data.jdbc;

import gob.shcp.fsn.data.annotation.Delete;
import gob.shcp.fsn.data.annotation.FindAll;
import gob.shcp.fsn.data.annotation.FindByCondition;
import gob.shcp.fsn.data.annotation.FindById;
import gob.shcp.fsn.data.annotation.Save;
import gob.shcp.fsn.service.data.orm.JdbcDataService;

import java.util.List;

import gob.shcp.sireh.domain.jdbc.TdCurriculoExpl;


/**
 * Data access interface for TdCurriculoExpl.
 */
public interface TdCurriculoExplDAO extends JdbcDataService {
    /**
     * Find TdCurriculoExpl entity by its identifier or primary key value.
     *
     * @param id identifier or primary key
     * @return TdCurriculoExpl
     */
    @FindById(TdCurriculoExpl.class)
    TdCurriculoExpl getById(java.lang.String id);
    
    /**
     * Get all TdCurriculoExpl entities limited by a maximum number of elements.
     *
     * @return Collection of TdCurriculoExpl
     */
    @FindAll(TdCurriculoExpl.class)
    List<TdCurriculoExpl> findAll();
    
    /**
     * Make persistence of TdCurriculoExpl entities. If its identifier or primary key is null then create else update.
     *
     * @param entity TdCurriculoExpl
     */
    @Save
    void save(TdCurriculoExpl entity);
    
    /**
     * Remove TdCurriculoExpl entities.
     *
     * @param entity TdCurriculoExpl
     */
    @Delete
    void delete(TdCurriculoExpl entity);


    /**
     * Find the first TdCurriculoExpl entity that matches the condition 'where fecModifico is equals to'.
     *
     * @param fecModifico java.util.Date
     * @return TdCurriculoExpl
     */
    @FindByCondition(value=TdCurriculoExpl.class, condition="FEC_MODIFICO=?")
    TdCurriculoExpl getByFecModifico(java.util.Date fecModifico);

    /**
     * Find all TdCurriculoExpl entities that matches the condition 'where fecModifico is equals to'.
     *
     * @param fecModifico java.util.Date
     * @return Collection of TdCurriculoExpl
     */
    @FindByCondition(value=TdCurriculoExpl.class, condition="FEC_MODIFICO=?")
    List<TdCurriculoExpl> findByFecModifico(java.util.Date fecModifico);

    /**
     * Find the first TdCurriculoExpl entity that matches the condition 'where usuario is equals to'.
     *
     * @param usuario java.lang.String
     * @return TdCurriculoExpl
     */
    @FindByCondition(value=TdCurriculoExpl.class, condition="USUARIO=?")
    TdCurriculoExpl getByUsuario(java.lang.String usuario);

    /**
     * Find all TdCurriculoExpl entities that matches the condition 'where usuario is equals to'.
     *
     * @param usuario java.lang.String
     * @return Collection of TdCurriculoExpl
     */
    @FindByCondition(value=TdCurriculoExpl.class, condition="USUARIO=?")
    List<TdCurriculoExpl> findByUsuario(java.lang.String usuario);

    /**
     * Find the first TdCurriculoExpl entity that matches the condition 'where curriclArea1 is equals to'.
     *
     * @param curriclArea1 java.lang.String
     * @return TdCurriculoExpl
     */
    @FindByCondition(value=TdCurriculoExpl.class, condition="CURRICL_AREA1=?")
    TdCurriculoExpl getByCurriclArea1(java.lang.String curriclArea1);

    /**
     * Find all TdCurriculoExpl entities that matches the condition 'where curriclArea1 is equals to'.
     *
     * @param curriclArea1 java.lang.String
     * @return Collection of TdCurriculoExpl
     */
    @FindByCondition(value=TdCurriculoExpl.class, condition="CURRICL_AREA1=?")
    List<TdCurriculoExpl> findByCurriclArea1(java.lang.String curriclArea1);

    /**
     * Find the first TdCurriculoExpl entity that matches the condition 'where curriclArea2 is equals to'.
     *
     * @param curriclArea2 java.lang.String
     * @return TdCurriculoExpl
     */
    @FindByCondition(value=TdCurriculoExpl.class, condition="CURRICL_AREA2=?")
    TdCurriculoExpl getByCurriclArea2(java.lang.String curriclArea2);

    /**
     * Find all TdCurriculoExpl entities that matches the condition 'where curriclArea2 is equals to'.
     *
     * @param curriclArea2 java.lang.String
     * @return Collection of TdCurriculoExpl
     */
    @FindByCondition(value=TdCurriculoExpl.class, condition="CURRICL_AREA2=?")
    List<TdCurriculoExpl> findByCurriclArea2(java.lang.String curriclArea2);

    /**
     * Find the first TdCurriculoExpl entity that matches the condition 'where curriclArea3 is equals to'.
     *
     * @param curriclArea3 java.lang.String
     * @return TdCurriculoExpl
     */
    @FindByCondition(value=TdCurriculoExpl.class, condition="CURRICL_AREA3=?")
    TdCurriculoExpl getByCurriclArea3(java.lang.String curriclArea3);

    /**
     * Find all TdCurriculoExpl entities that matches the condition 'where curriclArea3 is equals to'.
     *
     * @param curriclArea3 java.lang.String
     * @return Collection of TdCurriculoExpl
     */
    @FindByCondition(value=TdCurriculoExpl.class, condition="CURRICL_AREA3=?")
    List<TdCurriculoExpl> findByCurriclArea3(java.lang.String curriclArea3);

    /**
     * Find the first TdCurriculoExpl entity that matches the condition 'where curriclFecFin1 is equals to'.
     *
     * @param curriclFecFin1 java.lang.String
     * @return TdCurriculoExpl
     */
    @FindByCondition(value=TdCurriculoExpl.class, condition="CURRICL_FEC_FIN1=?")
    TdCurriculoExpl getByCurriclFecFin1(java.lang.String curriclFecFin1);

    /**
     * Find all TdCurriculoExpl entities that matches the condition 'where curriclFecFin1 is equals to'.
     *
     * @param curriclFecFin1 java.lang.String
     * @return Collection of TdCurriculoExpl
     */
    @FindByCondition(value=TdCurriculoExpl.class, condition="CURRICL_FEC_FIN1=?")
    List<TdCurriculoExpl> findByCurriclFecFin1(java.lang.String curriclFecFin1);

    /**
     * Find the first TdCurriculoExpl entity that matches the condition 'where curriclFecFin2 is equals to'.
     *
     * @param curriclFecFin2 java.lang.String
     * @return TdCurriculoExpl
     */
    @FindByCondition(value=TdCurriculoExpl.class, condition="CURRICL_FEC_FIN2=?")
    TdCurriculoExpl getByCurriclFecFin2(java.lang.String curriclFecFin2);

    /**
     * Find all TdCurriculoExpl entities that matches the condition 'where curriclFecFin2 is equals to'.
     *
     * @param curriclFecFin2 java.lang.String
     * @return Collection of TdCurriculoExpl
     */
    @FindByCondition(value=TdCurriculoExpl.class, condition="CURRICL_FEC_FIN2=?")
    List<TdCurriculoExpl> findByCurriclFecFin2(java.lang.String curriclFecFin2);

    /**
     * Find the first TdCurriculoExpl entity that matches the condition 'where curriclFecFin3 is equals to'.
     *
     * @param curriclFecFin3 java.lang.String
     * @return TdCurriculoExpl
     */
    @FindByCondition(value=TdCurriculoExpl.class, condition="CURRICL_FEC_FIN3=?")
    TdCurriculoExpl getByCurriclFecFin3(java.lang.String curriclFecFin3);

    /**
     * Find all TdCurriculoExpl entities that matches the condition 'where curriclFecFin3 is equals to'.
     *
     * @param curriclFecFin3 java.lang.String
     * @return Collection of TdCurriculoExpl
     */
    @FindByCondition(value=TdCurriculoExpl.class, condition="CURRICL_FEC_FIN3=?")
    List<TdCurriculoExpl> findByCurriclFecFin3(java.lang.String curriclFecFin3);

    /**
     * Find the first TdCurriculoExpl entity that matches the condition 'where curriclFecIni1 is equals to'.
     *
     * @param curriclFecIni1 java.lang.String
     * @return TdCurriculoExpl
     */
    @FindByCondition(value=TdCurriculoExpl.class, condition="CURRICL_FEC_INI1=?")
    TdCurriculoExpl getByCurriclFecIni1(java.lang.String curriclFecIni1);

    /**
     * Find all TdCurriculoExpl entities that matches the condition 'where curriclFecIni1 is equals to'.
     *
     * @param curriclFecIni1 java.lang.String
     * @return Collection of TdCurriculoExpl
     */
    @FindByCondition(value=TdCurriculoExpl.class, condition="CURRICL_FEC_INI1=?")
    List<TdCurriculoExpl> findByCurriclFecIni1(java.lang.String curriclFecIni1);

    /**
     * Find the first TdCurriculoExpl entity that matches the condition 'where curriclFecIni2 is equals to'.
     *
     * @param curriclFecIni2 java.lang.String
     * @return TdCurriculoExpl
     */
    @FindByCondition(value=TdCurriculoExpl.class, condition="CURRICL_FEC_INI2=?")
    TdCurriculoExpl getByCurriclFecIni2(java.lang.String curriclFecIni2);

    /**
     * Find all TdCurriculoExpl entities that matches the condition 'where curriclFecIni2 is equals to'.
     *
     * @param curriclFecIni2 java.lang.String
     * @return Collection of TdCurriculoExpl
     */
    @FindByCondition(value=TdCurriculoExpl.class, condition="CURRICL_FEC_INI2=?")
    List<TdCurriculoExpl> findByCurriclFecIni2(java.lang.String curriclFecIni2);

    /**
     * Find the first TdCurriculoExpl entity that matches the condition 'where curriclFecIni3 is equals to'.
     *
     * @param curriclFecIni3 java.lang.String
     * @return TdCurriculoExpl
     */
    @FindByCondition(value=TdCurriculoExpl.class, condition="CURRICL_FEC_INI3=?")
    TdCurriculoExpl getByCurriclFecIni3(java.lang.String curriclFecIni3);

    /**
     * Find all TdCurriculoExpl entities that matches the condition 'where curriclFecIni3 is equals to'.
     *
     * @param curriclFecIni3 java.lang.String
     * @return Collection of TdCurriculoExpl
     */
    @FindByCondition(value=TdCurriculoExpl.class, condition="CURRICL_FEC_INI3=?")
    List<TdCurriculoExpl> findByCurriclFecIni3(java.lang.String curriclFecIni3);

    /**
     * Find the first TdCurriculoExpl entity that matches the condition 'where curriclFuncion1 is equals to'.
     *
     * @param curriclFuncion1 java.lang.String
     * @return TdCurriculoExpl
     */
    @FindByCondition(value=TdCurriculoExpl.class, condition="CURRICL_FUNCION1=?")
    TdCurriculoExpl getByCurriclFuncion1(java.lang.String curriclFuncion1);

    /**
     * Find all TdCurriculoExpl entities that matches the condition 'where curriclFuncion1 is equals to'.
     *
     * @param curriclFuncion1 java.lang.String
     * @return Collection of TdCurriculoExpl
     */
    @FindByCondition(value=TdCurriculoExpl.class, condition="CURRICL_FUNCION1=?")
    List<TdCurriculoExpl> findByCurriclFuncion1(java.lang.String curriclFuncion1);

    /**
     * Find the first TdCurriculoExpl entity that matches the condition 'where curriclFuncion2 is equals to'.
     *
     * @param curriclFuncion2 java.lang.String
     * @return TdCurriculoExpl
     */
    @FindByCondition(value=TdCurriculoExpl.class, condition="CURRICL_FUNCION2=?")
    TdCurriculoExpl getByCurriclFuncion2(java.lang.String curriclFuncion2);

    /**
     * Find all TdCurriculoExpl entities that matches the condition 'where curriclFuncion2 is equals to'.
     *
     * @param curriclFuncion2 java.lang.String
     * @return Collection of TdCurriculoExpl
     */
    @FindByCondition(value=TdCurriculoExpl.class, condition="CURRICL_FUNCION2=?")
    List<TdCurriculoExpl> findByCurriclFuncion2(java.lang.String curriclFuncion2);

    /**
     * Find the first TdCurriculoExpl entity that matches the condition 'where curriclFuncion3 is equals to'.
     *
     * @param curriclFuncion3 java.lang.String
     * @return TdCurriculoExpl
     */
    @FindByCondition(value=TdCurriculoExpl.class, condition="CURRICL_FUNCION3=?")
    TdCurriculoExpl getByCurriclFuncion3(java.lang.String curriclFuncion3);

    /**
     * Find all TdCurriculoExpl entities that matches the condition 'where curriclFuncion3 is equals to'.
     *
     * @param curriclFuncion3 java.lang.String
     * @return Collection of TdCurriculoExpl
     */
    @FindByCondition(value=TdCurriculoExpl.class, condition="CURRICL_FUNCION3=?")
    List<TdCurriculoExpl> findByCurriclFuncion3(java.lang.String curriclFuncion3);

    /**
     * Find the first TdCurriculoExpl entity that matches the condition 'where curriclLugar1 is equals to'.
     *
     * @param curriclLugar1 java.lang.String
     * @return TdCurriculoExpl
     */
    @FindByCondition(value=TdCurriculoExpl.class, condition="CURRICL_LUGAR1=?")
    TdCurriculoExpl getByCurriclLugar1(java.lang.String curriclLugar1);

    /**
     * Find all TdCurriculoExpl entities that matches the condition 'where curriclLugar1 is equals to'.
     *
     * @param curriclLugar1 java.lang.String
     * @return Collection of TdCurriculoExpl
     */
    @FindByCondition(value=TdCurriculoExpl.class, condition="CURRICL_LUGAR1=?")
    List<TdCurriculoExpl> findByCurriclLugar1(java.lang.String curriclLugar1);

    /**
     * Find the first TdCurriculoExpl entity that matches the condition 'where curriclLugar2 is equals to'.
     *
     * @param curriclLugar2 java.lang.String
     * @return TdCurriculoExpl
     */
    @FindByCondition(value=TdCurriculoExpl.class, condition="CURRICL_LUGAR2=?")
    TdCurriculoExpl getByCurriclLugar2(java.lang.String curriclLugar2);

    /**
     * Find all TdCurriculoExpl entities that matches the condition 'where curriclLugar2 is equals to'.
     *
     * @param curriclLugar2 java.lang.String
     * @return Collection of TdCurriculoExpl
     */
    @FindByCondition(value=TdCurriculoExpl.class, condition="CURRICL_LUGAR2=?")
    List<TdCurriculoExpl> findByCurriclLugar2(java.lang.String curriclLugar2);

    /**
     * Find the first TdCurriculoExpl entity that matches the condition 'where curriclLugar3 is equals to'.
     *
     * @param curriclLugar3 java.lang.String
     * @return TdCurriculoExpl
     */
    @FindByCondition(value=TdCurriculoExpl.class, condition="CURRICL_LUGAR3=?")
    TdCurriculoExpl getByCurriclLugar3(java.lang.String curriclLugar3);

    /**
     * Find all TdCurriculoExpl entities that matches the condition 'where curriclLugar3 is equals to'.
     *
     * @param curriclLugar3 java.lang.String
     * @return Collection of TdCurriculoExpl
     */
    @FindByCondition(value=TdCurriculoExpl.class, condition="CURRICL_LUGAR3=?")
    List<TdCurriculoExpl> findByCurriclLugar3(java.lang.String curriclLugar3);

    /**
     * Find the first TdCurriculoExpl entity that matches the condition 'where curriclPuesto1 is equals to'.
     *
     * @param curriclPuesto1 java.lang.String
     * @return TdCurriculoExpl
     */
    @FindByCondition(value=TdCurriculoExpl.class, condition="CURRICL_PUESTO1=?")
    TdCurriculoExpl getByCurriclPuesto1(java.lang.String curriclPuesto1);

    /**
     * Find all TdCurriculoExpl entities that matches the condition 'where curriclPuesto1 is equals to'.
     *
     * @param curriclPuesto1 java.lang.String
     * @return Collection of TdCurriculoExpl
     */
    @FindByCondition(value=TdCurriculoExpl.class, condition="CURRICL_PUESTO1=?")
    List<TdCurriculoExpl> findByCurriclPuesto1(java.lang.String curriclPuesto1);

    /**
     * Find the first TdCurriculoExpl entity that matches the condition 'where curriclPuesto2 is equals to'.
     *
     * @param curriclPuesto2 java.lang.String
     * @return TdCurriculoExpl
     */
    @FindByCondition(value=TdCurriculoExpl.class, condition="CURRICL_PUESTO2=?")
    TdCurriculoExpl getByCurriclPuesto2(java.lang.String curriclPuesto2);

    /**
     * Find all TdCurriculoExpl entities that matches the condition 'where curriclPuesto2 is equals to'.
     *
     * @param curriclPuesto2 java.lang.String
     * @return Collection of TdCurriculoExpl
     */
    @FindByCondition(value=TdCurriculoExpl.class, condition="CURRICL_PUESTO2=?")
    List<TdCurriculoExpl> findByCurriclPuesto2(java.lang.String curriclPuesto2);

    /**
     * Find the first TdCurriculoExpl entity that matches the condition 'where curriclPuesto3 is equals to'.
     *
     * @param curriclPuesto3 java.lang.String
     * @return TdCurriculoExpl
     */
    @FindByCondition(value=TdCurriculoExpl.class, condition="CURRICL_PUESTO3=?")
    TdCurriculoExpl getByCurriclPuesto3(java.lang.String curriclPuesto3);

    /**
     * Find all TdCurriculoExpl entities that matches the condition 'where curriclPuesto3 is equals to'.
     *
     * @param curriclPuesto3 java.lang.String
     * @return Collection of TdCurriculoExpl
     */
    @FindByCondition(value=TdCurriculoExpl.class, condition="CURRICL_PUESTO3=?")
    List<TdCurriculoExpl> findByCurriclPuesto3(java.lang.String curriclPuesto3);

    /**
     * Find the first TdCurriculoExpl entity that matches the condition 'where curriclSector1 is equals to'.
     *
     * @param curriclSector1 java.lang.String
     * @return TdCurriculoExpl
     */
    @FindByCondition(value=TdCurriculoExpl.class, condition="CURRICL_SECTOR1=?")
    TdCurriculoExpl getByCurriclSector1(java.lang.String curriclSector1);

    /**
     * Find all TdCurriculoExpl entities that matches the condition 'where curriclSector1 is equals to'.
     *
     * @param curriclSector1 java.lang.String
     * @return Collection of TdCurriculoExpl
     */
    @FindByCondition(value=TdCurriculoExpl.class, condition="CURRICL_SECTOR1=?")
    List<TdCurriculoExpl> findByCurriclSector1(java.lang.String curriclSector1);

    /**
     * Find the first TdCurriculoExpl entity that matches the condition 'where curriclSector2 is equals to'.
     *
     * @param curriclSector2 java.lang.String
     * @return TdCurriculoExpl
     */
    @FindByCondition(value=TdCurriculoExpl.class, condition="CURRICL_SECTOR2=?")
    TdCurriculoExpl getByCurriclSector2(java.lang.String curriclSector2);

    /**
     * Find all TdCurriculoExpl entities that matches the condition 'where curriclSector2 is equals to'.
     *
     * @param curriclSector2 java.lang.String
     * @return Collection of TdCurriculoExpl
     */
    @FindByCondition(value=TdCurriculoExpl.class, condition="CURRICL_SECTOR2=?")
    List<TdCurriculoExpl> findByCurriclSector2(java.lang.String curriclSector2);

    /**
     * Find the first TdCurriculoExpl entity that matches the condition 'where curriclSector3 is equals to'.
     *
     * @param curriclSector3 java.lang.String
     * @return TdCurriculoExpl
     */
    @FindByCondition(value=TdCurriculoExpl.class, condition="CURRICL_SECTOR3=?")
    TdCurriculoExpl getByCurriclSector3(java.lang.String curriclSector3);

    /**
     * Find all TdCurriculoExpl entities that matches the condition 'where curriclSector3 is equals to'.
     *
     * @param curriclSector3 java.lang.String
     * @return Collection of TdCurriculoExpl
     */
    @FindByCondition(value=TdCurriculoExpl.class, condition="CURRICL_SECTOR3=?")
    List<TdCurriculoExpl> findByCurriclSector3(java.lang.String curriclSector3);
}