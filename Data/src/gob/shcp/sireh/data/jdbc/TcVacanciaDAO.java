package gob.shcp.sireh.data.jdbc;

import gob.shcp.fsn.data.annotation.Delete;
import gob.shcp.fsn.data.annotation.FindAll;
import gob.shcp.fsn.data.annotation.FindByCondition;
import gob.shcp.fsn.data.annotation.FindById;
import gob.shcp.fsn.data.annotation.Save;
import gob.shcp.fsn.service.data.orm.JdbcDataService;

import java.util.List;

import gob.shcp.sireh.domain.jdbc.TcVacancia;


/**
 * Data access interface for TcVacanciaDAO.
 */
public interface TcVacanciaDAO extends JdbcDataService {
    /**
     * Find TcVacancia entity by its identifier or primary key value.
     *
     * @param id identifier or primary key
     * @return TcVacancia
     */
    @FindById(TcVacancia.class)
    TcVacancia getById(Integer id);
    
    /**
     * Get all TcVacancia entities limited by a maximum number of elements.
     *
     * @return Collection of TcVacancia
     */
    @FindAll(TcVacancia.class)
    List<TcVacancia> findAll();
    
    /**
     * Make persistence of TcVacancia entities. If its identifier or primary key is null then create else update.
     *
     * @param entity TcVacancia
     */
    @Save
    void save(TcVacancia entity);
    
    /**
     * Remove TcVacancia entities.
     *
     * @param entity TcVacancia
     */
    @Delete
    void delete(TcVacancia entity);


    /**
     * Find the first TcVacancia entity that matches the condition 'where fecModifico is equals to'.
     *
     * @param fecModifico java.util.Date
     * @return TcVacancia
     */
    @FindByCondition(value=TcVacancia.class, condition="FEC_MODIFICO=?")
    TcVacancia getByFecModifico(java.util.Date fecModifico);

    /**
     * Find all TcVacancia entities that matches the condition 'where fecModifico is equals to'.
     *
     * @param fecModifico java.util.Date
     * @return Collection of TcVacancia
     */
    @FindByCondition(value=TcVacancia.class, condition="FEC_MODIFICO=?")
    List<TcVacancia> findByFecModifico(java.util.Date fecModifico);

    /**
     * Find the first TcVacancia entity that matches the condition 'where usuario is equals to'.
     *
     * @param usuario java.lang.String
     * @return TcVacancia
     */
    @FindByCondition(value=TcVacancia.class, condition="USUARIO=?")
    TcVacancia getByUsuario(java.lang.String usuario);

    /**
     * Find all TcVacancia entities that matches the condition 'where usuario is equals to'.
     *
     * @param usuario java.lang.String
     * @return Collection of TcVacancia
     */
    @FindByCondition(value=TcVacancia.class, condition="USUARIO=?")
    List<TcVacancia> findByUsuario(java.lang.String usuario);
    
    /**
     * Find all TcVacancia entities that matches the condition 'where usuario is equals to'.
     *
     * @param descVacancia java.lang.String
     * @return Collection of TcVacancia
     */
    @FindByCondition(value=TcVacancia.class, condition="DESC_VACANCIA=?")
    TcVacancia getByDescVacancia(java.lang.String descVacancia);
}