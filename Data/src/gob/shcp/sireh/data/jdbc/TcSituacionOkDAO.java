package gob.shcp.sireh.data.jdbc;

import gob.shcp.fsn.data.annotation.Delete;
import gob.shcp.fsn.data.annotation.FindAll;
import gob.shcp.fsn.data.annotation.FindByCondition;
import gob.shcp.fsn.data.annotation.FindById;
import gob.shcp.fsn.data.annotation.Save;
import gob.shcp.fsn.service.data.orm.JdbcDataService;

import java.util.List;

import gob.shcp.sireh.domain.jdbc.TcSituacionOk;


/**
 * Data access interface for TcSituacionOk.
 */
public interface TcSituacionOkDAO extends JdbcDataService {
    /**
     * Find TcSituacionOk entity by its identifier or primary key value.
     *
     * @param id identifier or primary key
     * @return TcSituacionOk
     */
    @FindById(TcSituacionOk.class)
    TcSituacionOk getById(gob.shcp.sireh.domain.jdbc.TcSituacionOkPK id);
    
    /**
     * Get all TcSituacionOk entities limited by a maximum number of elements.
     *
     * @return Collection of TcSituacionOk
     */
    @FindAll(TcSituacionOk.class)
    List<TcSituacionOk> findAll();
    
    /**
     * Make persistence of TcSituacionOk entities. If its identifier or primary key is null then create else update.
     *
     * @param entity TcSituacionOk
     */
    @Save
    void save(TcSituacionOk entity);
    
    /**
     * Remove TcSituacionOk entities.
     *
     * @param entity TcSituacionOk
     */
    @Delete
    void delete(TcSituacionOk entity);


    /**
     * Find the first TcSituacionOk entity that matches the condition 'where fecModifico is equals to'.
     *
     * @param fecModifico java.util.Date
     * @return TcSituacionOk
     */
    @FindByCondition(value=TcSituacionOk.class, condition="FEC_MODIFICO=?")
    TcSituacionOk getByFecModifico(java.util.Date fecModifico);

    /**
     * Find all TcSituacionOk entities that matches the condition 'where fecModifico is equals to'.
     *
     * @param fecModifico java.util.Date
     * @return Collection of TcSituacionOk
     */
    @FindByCondition(value=TcSituacionOk.class, condition="FEC_MODIFICO=?")
    List<TcSituacionOk> findByFecModifico(java.util.Date fecModifico);

    /**
     * Find the first TcSituacionOk entity that matches the condition 'where usuario is equals to'.
     *
     * @param usuario java.lang.String
     * @return TcSituacionOk
     */
    @FindByCondition(value=TcSituacionOk.class, condition="USUARIO=?")
    TcSituacionOk getByUsuario(java.lang.String usuario);

    /**
     * Find all TcSituacionOk entities that matches the condition 'where usuario is equals to'.
     *
     * @param usuario java.lang.String
     * @return Collection of TcSituacionOk
     */
    @FindByCondition(value=TcSituacionOk.class, condition="USUARIO=?")
    List<TcSituacionOk> findByUsuario(java.lang.String usuario);
}