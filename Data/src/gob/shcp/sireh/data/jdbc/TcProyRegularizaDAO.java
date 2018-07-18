package gob.shcp.sireh.data.jdbc;

import gob.shcp.fsn.data.annotation.Delete;
import gob.shcp.fsn.data.annotation.FindAll;
import gob.shcp.fsn.data.annotation.FindByCondition;
import gob.shcp.fsn.data.annotation.FindById;
import gob.shcp.fsn.data.annotation.Save;
import gob.shcp.fsn.service.data.orm.JdbcDataService;

import java.util.List;

import gob.shcp.sireh.domain.jdbc.TcProyRegulariza;


/**
 * Data access interface for TcProyRegulariza.
 */
public interface TcProyRegularizaDAO extends JdbcDataService {
    /**
     * Find TcProyRegulariza entity by its identifier or primary key value.
     *
     * @param id identifier or primary key
     * @return TcProyRegulariza
     */
    @FindById(TcProyRegulariza.class)
    TcProyRegulariza getById(gob.shcp.sireh.domain.jdbc.TcProyRegularizaPK id);
    
    /**
     * Get all TcProyRegulariza entities limited by a maximum number of elements.
     *
     * @return Collection of TcProyRegulariza
     */
    @FindAll(TcProyRegulariza.class)
    List<TcProyRegulariza> findAll();
    
    /**
     * Make persistence of TcProyRegulariza entities. If its identifier or primary key is null then create else update.
     *
     * @param entity TcProyRegulariza
     */
    @Save
    void save(TcProyRegulariza entity);
    
    /**
     * Remove TcProyRegulariza entities.
     *
     * @param entity TcProyRegulariza
     */
    @Delete
    void delete(TcProyRegulariza entity);


    /**
     * Find the first TcProyRegulariza entity that matches the condition 'where descProyRegul is equals to'.
     *
     * @param descProyRegul java.lang.String
     * @return TcProyRegulariza
     */
    @FindByCondition(value=TcProyRegulariza.class, condition="DESC_PROY_REGUL=?")
    TcProyRegulariza getByDescProyRegul(java.lang.String descProyRegul);

    /**
     * Find all TcProyRegulariza entities that matches the condition 'where descProyRegul is equals to'.
     *
     * @param descProyRegul java.lang.String
     * @return Collection of TcProyRegulariza
     */
    @FindByCondition(value=TcProyRegulariza.class, condition="DESC_PROY_REGUL=?")
    List<TcProyRegulariza> findByDescProyRegul(java.lang.String descProyRegul);

    /**
     * Find the first TcProyRegulariza entity that matches the condition 'where fecModifico is equals to'.
     *
     * @param fecModifico java.util.Date
     * @return TcProyRegulariza
     */
    @FindByCondition(value=TcProyRegulariza.class, condition="FEC_MODIFICO=?")
    TcProyRegulariza getByFecModifico(java.util.Date fecModifico);

    /**
     * Find all TcProyRegulariza entities that matches the condition 'where fecModifico is equals to'.
     *
     * @param fecModifico java.util.Date
     * @return Collection of TcProyRegulariza
     */
    @FindByCondition(value=TcProyRegulariza.class, condition="FEC_MODIFICO=?")
    List<TcProyRegulariza> findByFecModifico(java.util.Date fecModifico);

    /**
     * Find the first TcProyRegulariza entity that matches the condition 'where usuario is equals to'.
     *
     * @param usuario java.lang.String
     * @return TcProyRegulariza
     */
    @FindByCondition(value=TcProyRegulariza.class, condition="USUARIO=?")
    TcProyRegulariza getByUsuario(java.lang.String usuario);

    /**
     * Find all TcProyRegulariza entities that matches the condition 'where usuario is equals to'.
     *
     * @param usuario java.lang.String
     * @return Collection of TcProyRegulariza
     */
    @FindByCondition(value=TcProyRegulariza.class, condition="USUARIO=?")
    List<TcProyRegulariza> findByUsuario(java.lang.String usuario);
}