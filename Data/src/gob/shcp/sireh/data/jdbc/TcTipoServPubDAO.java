package gob.shcp.sireh.data.jdbc;

import gob.shcp.fsn.data.annotation.Delete;
import gob.shcp.fsn.data.annotation.FindAll;
import gob.shcp.fsn.data.annotation.FindByCondition;
import gob.shcp.fsn.data.annotation.FindById;
import gob.shcp.fsn.data.annotation.Save;
import gob.shcp.fsn.service.data.orm.JdbcDataService;

import java.util.List;

import gob.shcp.sireh.domain.jdbc.TcTipoServPub;


/**
 * Data access interface for TcTipoServPub.
 */
public interface TcTipoServPubDAO extends JdbcDataService {
    /**
     * Find TcTipoServPub entity by its identifier or primary key value.
     *
     * @param id identifier or primary key
     * @return TcTipoServPub
     */
    @FindById(TcTipoServPub.class)
    TcTipoServPub getById(java.lang.String id);
    
    /**
     * Get all TcTipoServPub entities limited by a maximum number of elements.
     *
     * @return Collection of TcTipoServPub
     */
    @FindAll(TcTipoServPub.class)
    List<TcTipoServPub> findAll();
    
    /**
     * Make persistence of TcTipoServPub entities. If its identifier or primary key is null then create else update.
     *
     * @param entity TcTipoServPub
     */
    @Save
    void save(TcTipoServPub entity);
    
    /**
     * Remove TcTipoServPub entities.
     *
     * @param entity TcTipoServPub
     */
    @Delete
    void delete(TcTipoServPub entity);


    /**
     * Find the first TcTipoServPub entity that matches the condition 'where descTipoServPub is equals to'.
     *
     * @param descTipoServPub java.lang.String
     * @return TcTipoServPub
     */
    @FindByCondition(value=TcTipoServPub.class, condition="DESC_TIPO_SERV_PUB=?")
    TcTipoServPub getByDescTipoServPub(java.lang.String descTipoServPub);

    /**
     * Find all TcTipoServPub entities that matches the condition 'where descTipoServPub is equals to'.
     *
     * @param descTipoServPub java.lang.String
     * @return Collection of TcTipoServPub
     */
    @FindByCondition(value=TcTipoServPub.class, condition="DESC_TIPO_SERV_PUB=?")
    List<TcTipoServPub> findByDescTipoServPub(java.lang.String descTipoServPub);

    /**
     * Find the first TcTipoServPub entity that matches the condition 'where fecModifico is equals to'.
     *
     * @param fecModifico java.util.Date
     * @return TcTipoServPub
     */
    @FindByCondition(value=TcTipoServPub.class, condition="FEC_MODIFICO=?")
    TcTipoServPub getByFecModifico(java.util.Date fecModifico);

    /**
     * Find all TcTipoServPub entities that matches the condition 'where fecModifico is equals to'.
     *
     * @param fecModifico java.util.Date
     * @return Collection of TcTipoServPub
     */
    @FindByCondition(value=TcTipoServPub.class, condition="FEC_MODIFICO=?")
    List<TcTipoServPub> findByFecModifico(java.util.Date fecModifico);

    /**
     * Find the first TcTipoServPub entity that matches the condition 'where tspCveNomb is equals to'.
     *
     * @param tspCveNomb java.lang.String
     * @return TcTipoServPub
     */
    @FindByCondition(value=TcTipoServPub.class, condition="TSP_CVE_NOMB=?")
    TcTipoServPub getByTspCveNomb(java.lang.String tspCveNomb);

    /**
     * Find all TcTipoServPub entities that matches the condition 'where tspCveNomb is equals to'.
     *
     * @param tspCveNomb java.lang.String
     * @return Collection of TcTipoServPub
     */
    @FindByCondition(value=TcTipoServPub.class, condition="TSP_CVE_NOMB=?")
    List<TcTipoServPub> findByTspCveNomb(java.lang.String tspCveNomb);

    /**
     * Find the first TcTipoServPub entity that matches the condition 'where tspNiveles is equals to'.
     *
     * @param tspNiveles java.lang.String
     * @return TcTipoServPub
     */
    @FindByCondition(value=TcTipoServPub.class, condition="TSP_NIVELES=?")
    TcTipoServPub getByTspNiveles(java.lang.String tspNiveles);

    /**
     * Find all TcTipoServPub entities that matches the condition 'where tspNiveles is equals to'.
     *
     * @param tspNiveles java.lang.String
     * @return Collection of TcTipoServPub
     */
    @FindByCondition(value=TcTipoServPub.class, condition="TSP_NIVELES=?")
    List<TcTipoServPub> findByTspNiveles(java.lang.String tspNiveles);

    /**
     * Find the first TcTipoServPub entity that matches the condition 'where tspTipoPlaza is equals to'.
     *
     * @param tspTipoPlaza java.lang.String
     * @return TcTipoServPub
     */
    @FindByCondition(value=TcTipoServPub.class, condition="TSP_TIPO_PLAZA=?")
    TcTipoServPub getByTspTipoPlaza(java.lang.String tspTipoPlaza);

    /**
     * Find all TcTipoServPub entities that matches the condition 'where tspTipoPlaza is equals to'.
     *
     * @param tspTipoPlaza java.lang.String
     * @return Collection of TcTipoServPub
     */
    @FindByCondition(value=TcTipoServPub.class, condition="TSP_TIPO_PLAZA=?")
    List<TcTipoServPub> findByTspTipoPlaza(java.lang.String tspTipoPlaza);

    /**
     * Find the first TcTipoServPub entity that matches the condition 'where usuario is equals to'.
     *
     * @param usuario java.lang.String
     * @return TcTipoServPub
     */
    @FindByCondition(value=TcTipoServPub.class, condition="USUARIO=?")
    TcTipoServPub getByUsuario(java.lang.String usuario);

    /**
     * Find all TcTipoServPub entities that matches the condition 'where usuario is equals to'.
     *
     * @param usuario java.lang.String
     * @return Collection of TcTipoServPub
     */
    @FindByCondition(value=TcTipoServPub.class, condition="USUARIO=?")
    List<TcTipoServPub> findByUsuario(java.lang.String usuario);
}