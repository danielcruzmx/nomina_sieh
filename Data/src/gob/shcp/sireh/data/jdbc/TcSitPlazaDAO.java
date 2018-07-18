package gob.shcp.sireh.data.jdbc;

import gob.shcp.fsn.data.annotation.Delete;
import gob.shcp.fsn.data.annotation.FindAll;
import gob.shcp.fsn.data.annotation.FindByCondition;
import gob.shcp.fsn.data.annotation.FindById;
import gob.shcp.fsn.data.annotation.Save;
import gob.shcp.fsn.service.data.orm.JdbcDataService;

import java.util.List;

import gob.shcp.sireh.domain.jdbc.TcSitPlaza;


/**
 * Data access interface for TcSitPlaza.
 */
public interface TcSitPlazaDAO extends JdbcDataService {
    /**
     * Find TcSitPlaza entity by its identifier or primary key value.
     *
     * @param id identifier or primary key
     * @return TcSitPlaza
     */
    @FindById(TcSitPlaza.class)
    TcSitPlaza getById(java.lang.String id);
    
    /**
     * Get all TcSitPlaza entities limited by a maximum number of elements.
     *
     * @return Collection of TcSitPlaza
     */
    @FindAll(TcSitPlaza.class)
    List<TcSitPlaza> findAll();
    
    /**
     * Make persistence of TcSitPlaza entities. If its identifier or primary key is null then create else update.
     *
     * @param entity TcSitPlaza
     */
    @Save
    void save(TcSitPlaza entity);
    
    /**
     * Remove TcSitPlaza entities.
     *
     * @param entity TcSitPlaza
     */
    @Delete
    void delete(TcSitPlaza entity);


    /**
     * Find the first TcSitPlaza entity that matches the condition 'where descSitPlaza is equals to'.
     *
     * @param descSitPlaza java.lang.String
     * @return TcSitPlaza
     */
    @FindByCondition(value=TcSitPlaza.class, condition="DESC_SIT_PLAZA=?")
    TcSitPlaza getByDescSitPlaza(java.lang.String descSitPlaza);

    /**
     * Find all TcSitPlaza entities that matches the condition 'where descSitPlaza is equals to'.
     *
     * @param descSitPlaza java.lang.String
     * @return Collection of TcSitPlaza
     */
    @FindByCondition(value=TcSitPlaza.class, condition="DESC_SIT_PLAZA=?")
    List<TcSitPlaza> findByDescSitPlaza(java.lang.String descSitPlaza);

    /**
     * Find the first TcSitPlaza entity that matches the condition 'where fecModifico is equals to'.
     *
     * @param fecModifico java.util.Date
     * @return TcSitPlaza
     */
    @FindByCondition(value=TcSitPlaza.class, condition="FEC_MODIFICO=?")
    TcSitPlaza getByFecModifico(java.util.Date fecModifico);

    /**
     * Find all TcSitPlaza entities that matches the condition 'where fecModifico is equals to'.
     *
     * @param fecModifico java.util.Date
     * @return Collection of TcSitPlaza
     */
    @FindByCondition(value=TcSitPlaza.class, condition="FEC_MODIFICO=?")
    List<TcSitPlaza> findByFecModifico(java.util.Date fecModifico);

    /**
     * Find the first TcSitPlaza entity that matches the condition 'where usuario is equals to'.
     *
     * @param usuario java.lang.String
     * @return TcSitPlaza
     */
    @FindByCondition(value=TcSitPlaza.class, condition="USUARIO=?")
    TcSitPlaza getByUsuario(java.lang.String usuario);

    /**
     * Find all TcSitPlaza entities that matches the condition 'where usuario is equals to'.
     *
     * @param usuario java.lang.String
     * @return Collection of TcSitPlaza
     */
    @FindByCondition(value=TcSitPlaza.class, condition="USUARIO=?")
    List<TcSitPlaza> findByUsuario(java.lang.String usuario);
}