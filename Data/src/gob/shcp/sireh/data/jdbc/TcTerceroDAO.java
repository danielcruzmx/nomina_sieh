package gob.shcp.sireh.data.jdbc;

import gob.shcp.fsn.data.annotation.Delete;
import gob.shcp.fsn.data.annotation.FindAll;
import gob.shcp.fsn.data.annotation.FindByCondition;
import gob.shcp.fsn.data.annotation.FindById;
import gob.shcp.fsn.data.annotation.Save;
import gob.shcp.fsn.service.data.orm.JdbcDataService;

import java.util.List;

import gob.shcp.sireh.domain.jdbc.TcTercero;


/**
 * Data access interface for TcTercero.
 */
public interface TcTerceroDAO extends JdbcDataService {
    /**
     * Find TcTercero entity by its identifier or primary key value.
     *
     * @param id identifier or primary key
     * @return TcTercero
     */
    @FindById(TcTercero.class)
    TcTercero getById(java.lang.String id);
    
    /**
     * Get all TcTercero entities limited by a maximum number of elements.
     *
     * @return Collection of TcTercero
     */
    @FindAll(TcTercero.class)
    List<TcTercero> findAll();
    
    /**
     * Make persistence of TcTercero entities. If its identifier or primary key is null then create else update.
     *
     * @param entity TcTercero
     */
    @Save
    void save(TcTercero entity);
    
    /**
     * Remove TcTercero entities.
     *
     * @param entity TcTercero
     */
    @Delete
    void delete(TcTercero entity);


    /**
     * Find the first TcTercero entity that matches the condition 'where descTercero is equals to'.
     *
     * @param descTercero java.lang.String
     * @return TcTercero
     */
    @FindByCondition(value=TcTercero.class, condition="DESC_TERCERO=?")
    TcTercero getByDescTercero(java.lang.String descTercero);

    /**
     * Find all TcTercero entities that matches the condition 'where descTercero is equals to'.
     *
     * @param descTercero java.lang.String
     * @return Collection of TcTercero
     */
    @FindByCondition(value=TcTercero.class, condition="DESC_TERCERO=?")
    List<TcTercero> findByDescTercero(java.lang.String descTercero);

    /**
     * Find the first TcTercero entity that matches the condition 'where fecModifico is equals to'.
     *
     * @param fecModifico java.util.Date
     * @return TcTercero
     */
    @FindByCondition(value=TcTercero.class, condition="FEC_MODIFICO=?")
    TcTercero getByFecModifico(java.util.Date fecModifico);

    /**
     * Find all TcTercero entities that matches the condition 'where fecModifico is equals to'.
     *
     * @param fecModifico java.util.Date
     * @return Collection of TcTercero
     */
    @FindByCondition(value=TcTercero.class, condition="FEC_MODIFICO=?")
    List<TcTercero> findByFecModifico(java.util.Date fecModifico);

    /**
     * Find the first TcTercero entity that matches the condition 'where usuario is equals to'.
     *
     * @param usuario java.lang.String
     * @return TcTercero
     */
    @FindByCondition(value=TcTercero.class, condition="USUARIO=?")
    TcTercero getByUsuario(java.lang.String usuario);

    /**
     * Find all TcTercero entities that matches the condition 'where usuario is equals to'.
     *
     * @param usuario java.lang.String
     * @return Collection of TcTercero
     */
    @FindByCondition(value=TcTercero.class, condition="USUARIO=?")
    List<TcTercero> findByUsuario(java.lang.String usuario);
}