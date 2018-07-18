package gob.shcp.sireh.data.jdbc;

import gob.shcp.fsn.data.annotation.Delete;
import gob.shcp.fsn.data.annotation.FindAll;
import gob.shcp.fsn.data.annotation.FindByCondition;
import gob.shcp.fsn.data.annotation.FindById;
import gob.shcp.fsn.data.annotation.Save;
import gob.shcp.fsn.service.data.orm.JdbcDataService;

import java.util.List;

import gob.shcp.sireh.domain.jdbc.TcDistUnidad;


/**
 * Data access interface for TcDistUnidad.
 */
public interface TcDistUnidadDAO extends JdbcDataService {
    /**
     * Find TcDistUnidad entity by its identifier or primary key value.
     *
     * @param id identifier or primary key
     * @return TcDistUnidad
     */
    @FindById(TcDistUnidad.class)
    TcDistUnidad getById(gob.shcp.sireh.domain.jdbc.TcDistUnidadPK id);
    
    /**
     * Get all TcDistUnidad entities limited by a maximum number of elements.
     *
     * @return Collection of TcDistUnidad
     */
    @FindAll(TcDistUnidad.class)
    List<TcDistUnidad> findAll();
    
    /**
     * Make persistence of TcDistUnidad entities. If its identifier or primary key is null then create else update.
     *
     * @param entity TcDistUnidad
     */
    @Save
    void save(TcDistUnidad entity);
    
    /**
     * Remove TcDistUnidad entities.
     *
     * @param entity TcDistUnidad
     */
    @Delete
    void delete(TcDistUnidad entity);


    /**
     * Find the first TcDistUnidad entity that matches the condition 'where fecModifico is equals to'.
     *
     * @param fecModifico java.util.Date
     * @return TcDistUnidad
     */
    @FindByCondition(value=TcDistUnidad.class, condition="FEC_MODIFICO=?")
    TcDistUnidad getByFecModifico(java.util.Date fecModifico);

    /**
     * Find all TcDistUnidad entities that matches the condition 'where fecModifico is equals to'.
     *
     * @param fecModifico java.util.Date
     * @return Collection of TcDistUnidad
     */
    @FindByCondition(value=TcDistUnidad.class, condition="FEC_MODIFICO=?")
    List<TcDistUnidad> findByFecModifico(java.util.Date fecModifico);

    /**
     * Find the first TcDistUnidad entity that matches the condition 'where usuario is equals to'.
     *
     * @param usuario java.lang.String
     * @return TcDistUnidad
     */
    @FindByCondition(value=TcDistUnidad.class, condition="USUARIO=?")
    TcDistUnidad getByUsuario(java.lang.String usuario);

    /**
     * Find all TcDistUnidad entities that matches the condition 'where usuario is equals to'.
     *
     * @param usuario java.lang.String
     * @return Collection of TcDistUnidad
     */
    @FindByCondition(value=TcDistUnidad.class, condition="USUARIO=?")
    List<TcDistUnidad> findByUsuario(java.lang.String usuario);
}