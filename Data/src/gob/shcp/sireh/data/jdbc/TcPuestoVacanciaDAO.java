package gob.shcp.sireh.data.jdbc;

import gob.shcp.fsn.data.annotation.Delete;
import gob.shcp.fsn.data.annotation.FindAll;
import gob.shcp.fsn.data.annotation.FindByCondition;
import gob.shcp.fsn.data.annotation.FindById;
import gob.shcp.fsn.data.annotation.Save;
import gob.shcp.fsn.service.data.orm.JdbcDataService;

import java.util.List;

import gob.shcp.sireh.domain.jdbc.TcPuestoVacancia;


/**
 * Data access interface for TcPuestoVacancia.
 */
public interface TcPuestoVacanciaDAO extends JdbcDataService {
    /**
     * Find TcPuestoVacancia entity by its identifier or primary key value.
     *
     * @param id identifier or primary key
     * @return TcPuestoVacancia
     */
    @FindById(TcPuestoVacancia.class)
    TcPuestoVacancia getById(gob.shcp.sireh.domain.jdbc.TcPuestoVacanciaPK id);
    
    /**
     * Get all TcPuestoVacancia entities limited by a maximum number of elements.
     *
     * @return Collection of TcPuestoVacancia
     */
    @FindAll(TcPuestoVacancia.class)
    List<TcPuestoVacancia> findAll();
    
    /**
     * Make persistence of TcPuestoVacancia entities. If its identifier or primary key is null then create else update.
     *
     * @param entity TcPuestoVacancia
     */
    @Save
    void save(TcPuestoVacancia entity);
    
    /**
     * Remove TcPuestoVacancia entities.
     *
     * @param entity TcPuestoVacancia
     */
    @Delete
    void delete(TcPuestoVacancia entity);


    /**
     * Find the first TcPuestoVacancia entity that matches the condition 'where fecModifico is equals to'.
     *
     * @param fecModifico java.util.Date
     * @return TcPuestoVacancia
     */
    @FindByCondition(value=TcPuestoVacancia.class, condition="FEC_MODIFICO=?")
    TcPuestoVacancia getByFecModifico(java.util.Date fecModifico);

    /**
     * Find all TcPuestoVacancia entities that matches the condition 'where fecModifico is equals to'.
     *
     * @param fecModifico java.util.Date
     * @return Collection of TcPuestoVacancia
     */
    @FindByCondition(value=TcPuestoVacancia.class, condition="FEC_MODIFICO=?")
    List<TcPuestoVacancia> findByFecModifico(java.util.Date fecModifico);

    /**
     * Find the first TcPuestoVacancia entity that matches the condition 'where usuario is equals to'.
     *
     * @param usuario java.lang.String
     * @return TcPuestoVacancia
     */
    @FindByCondition(value=TcPuestoVacancia.class, condition="USUARIO=?")
    TcPuestoVacancia getByUsuario(java.lang.String usuario);

    /**
     * Find all TcPuestoVacancia entities that matches the condition 'where usuario is equals to'.
     *
     * @param usuario java.lang.String
     * @return Collection of TcPuestoVacancia
     */
    @FindByCondition(value=TcPuestoVacancia.class, condition="USUARIO=?")
    List<TcPuestoVacancia> findByUsuario(java.lang.String usuario);
}