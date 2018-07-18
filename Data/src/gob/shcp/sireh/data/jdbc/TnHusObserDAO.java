package gob.shcp.sireh.data.jdbc;

import gob.shcp.fsn.data.annotation.Delete;
import gob.shcp.fsn.data.annotation.FindAll;
import gob.shcp.fsn.data.annotation.FindByCondition;
import gob.shcp.fsn.data.annotation.FindById;
import gob.shcp.fsn.data.annotation.Save;
import gob.shcp.fsn.service.data.orm.JdbcDataService;

import java.util.List;

import gob.shcp.sireh.domain.jdbc.TnHusObser;


/**
 * Data access interface for TnHusObser.
 */
public interface TnHusObserDAO extends JdbcDataService {
    /**
     * Find TnHusObser entity by its identifier or primary key value.
     *
     * @param id identifier or primary key
     * @return TnHusObser
     */
    @FindById(TnHusObser.class)
    TnHusObser getById(gob.shcp.sireh.domain.jdbc.TnHusObserPK id);
    
    /**
     * Get all TnHusObser entities limited by a maximum number of elements.
     *
     * @return Collection of TnHusObser
     */
    @FindAll(TnHusObser.class)
    List<TnHusObser> findAll();
    
    /**
     * Make persistence of TnHusObser entities. If its identifier or primary key is null then create else update.
     *
     * @param entity TnHusObser
     */
    @Save
    void save(TnHusObser entity);
    
    /**
     * Remove TnHusObser entities.
     *
     * @param entity TnHusObser
     */
    @Delete
    void delete(TnHusObser entity);


    /**
     * Find the first TnHusObser entity that matches the condition 'where fecModifico is equals to'.
     *
     * @param fecModifico java.util.Date
     * @return TnHusObser
     */
    @FindByCondition(value=TnHusObser.class, condition="FEC_MODIFICO=?")
    TnHusObser getByFecModifico(java.util.Date fecModifico);

    /**
     * Find all TnHusObser entities that matches the condition 'where fecModifico is equals to'.
     *
     * @param fecModifico java.util.Date
     * @return Collection of TnHusObser
     */
    @FindByCondition(value=TnHusObser.class, condition="FEC_MODIFICO=?")
    List<TnHusObser> findByFecModifico(java.util.Date fecModifico);

    /**
     * Find the first TnHusObser entity that matches the condition 'where usuario is equals to'.
     *
     * @param usuario java.lang.String
     * @return TnHusObser
     */
    @FindByCondition(value=TnHusObser.class, condition="USUARIO=?")
    TnHusObser getByUsuario(java.lang.String usuario);

    /**
     * Find all TnHusObser entities that matches the condition 'where usuario is equals to'.
     *
     * @param usuario java.lang.String
     * @return Collection of TnHusObser
     */
    @FindByCondition(value=TnHusObser.class, condition="USUARIO=?")
    List<TnHusObser> findByUsuario(java.lang.String usuario);
}