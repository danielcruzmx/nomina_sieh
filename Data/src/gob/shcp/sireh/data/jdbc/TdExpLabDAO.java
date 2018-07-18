package gob.shcp.sireh.data.jdbc;

import gob.shcp.fsn.data.annotation.Delete;
import gob.shcp.fsn.data.annotation.FindAll;
import gob.shcp.fsn.data.annotation.FindByCondition;
import gob.shcp.fsn.data.annotation.FindById;
import gob.shcp.fsn.data.annotation.Save;
import gob.shcp.fsn.service.data.orm.JdbcDataService;

import java.util.List;

import gob.shcp.sireh.domain.jdbc.TdExpLab;


/**
 * Data access interface for TdExpLab.
 */
public interface TdExpLabDAO extends JdbcDataService {
    /**
     * Find TdExpLab entity by its identifier or primary key value.
     *
     * @param id identifier or primary key
     * @return TdExpLab
     */
    @FindById(TdExpLab.class)
    TdExpLab getById(gob.shcp.sireh.domain.jdbc.TdExpLabPK id);
    
    /**
     * Get all TdExpLab entities limited by a maximum number of elements.
     *
     * @return Collection of TdExpLab
     */
    @FindAll(TdExpLab.class)
    List<TdExpLab> findAll();
    
    /**
     * Make persistence of TdExpLab entities. If its identifier or primary key is null then create else update.
     *
     * @param entity TdExpLab
     */
    @Save
    void save(TdExpLab entity);
    
    /**
     * Remove TdExpLab entities.
     *
     * @param entity TdExpLab
     */
    @Delete
    void delete(TdExpLab entity);


    /**
     * Find the first TdExpLab entity that matches the condition 'where elFecFin is equals to'.
     *
     * @param elFecFin java.util.Date
     * @return TdExpLab
     */
    @FindByCondition(value=TdExpLab.class, condition="EL_FEC_FIN=?")
    TdExpLab getByElFecFin(java.util.Date elFecFin);

    /**
     * Find all TdExpLab entities that matches the condition 'where elFecFin is equals to'.
     *
     * @param elFecFin java.util.Date
     * @return Collection of TdExpLab
     */
    @FindByCondition(value=TdExpLab.class, condition="EL_FEC_FIN=?")
    List<TdExpLab> findByElFecFin(java.util.Date elFecFin);

    /**
     * Find the first TdExpLab entity that matches the condition 'where elFecIng is equals to'.
     *
     * @param elFecIng java.util.Date
     * @return TdExpLab
     */
    @FindByCondition(value=TdExpLab.class, condition="EL_FEC_ING=?")
    TdExpLab getByElFecIng(java.util.Date elFecIng);

    /**
     * Find all TdExpLab entities that matches the condition 'where elFecIng is equals to'.
     *
     * @param elFecIng java.util.Date
     * @return Collection of TdExpLab
     */
    @FindByCondition(value=TdExpLab.class, condition="EL_FEC_ING=?")
    List<TdExpLab> findByElFecIng(java.util.Date elFecIng);

    /**
     * Find the first TdExpLab entity that matches the condition 'where fecModifico is equals to'.
     *
     * @param fecModifico java.util.Date
     * @return TdExpLab
     */
    @FindByCondition(value=TdExpLab.class, condition="FEC_MODIFICO=?")
    TdExpLab getByFecModifico(java.util.Date fecModifico);

    /**
     * Find all TdExpLab entities that matches the condition 'where fecModifico is equals to'.
     *
     * @param fecModifico java.util.Date
     * @return Collection of TdExpLab
     */
    @FindByCondition(value=TdExpLab.class, condition="FEC_MODIFICO=?")
    List<TdExpLab> findByFecModifico(java.util.Date fecModifico);

    /**
     * Find the first TdExpLab entity that matches the condition 'where usuario is equals to'.
     *
     * @param usuario java.lang.String
     * @return TdExpLab
     */
    @FindByCondition(value=TdExpLab.class, condition="USUARIO=?")
    TdExpLab getByUsuario(java.lang.String usuario);

    /**
     * Find all TdExpLab entities that matches the condition 'where usuario is equals to'.
     *
     * @param usuario java.lang.String
     * @return Collection of TdExpLab
     */
    @FindByCondition(value=TdExpLab.class, condition="USUARIO=?")
    List<TdExpLab> findByUsuario(java.lang.String usuario);
}