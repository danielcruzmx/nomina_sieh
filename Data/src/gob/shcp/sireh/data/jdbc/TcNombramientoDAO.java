package gob.shcp.sireh.data.jdbc;

import gob.shcp.fsn.data.annotation.Delete;
import gob.shcp.fsn.data.annotation.FindAll;
import gob.shcp.fsn.data.annotation.FindByCondition;
import gob.shcp.fsn.data.annotation.FindById;
import gob.shcp.fsn.data.annotation.Save;
import gob.shcp.fsn.service.data.orm.JdbcDataService;

import java.util.List;

import gob.shcp.sireh.domain.jdbc.TcNombramiento;


/**
 * Data access interface for TcNombramiento.
 */
public interface TcNombramientoDAO extends JdbcDataService {
    /**
     * Find TcNombramiento entity by its identifier or primary key value.
     *
     * @param id identifier or primary key
     * @return TcNombramiento
     */
    @FindById(TcNombramiento.class)
    TcNombramiento getById(java.lang.String id);
    
    /**
     * Get all TcNombramiento entities limited by a maximum number of elements.
     *
     * @return Collection of TcNombramiento
     */
    @FindAll(TcNombramiento.class)
    List<TcNombramiento> findAll();
    
    /**
     * Make persistence of TcNombramiento entities. If its identifier or primary key is null then create else update.
     *
     * @param entity TcNombramiento
     */
    @Save
    void save(TcNombramiento entity);
    
    /**
     * Remove TcNombramiento entities.
     *
     * @param entity TcNombramiento
     */
    @Delete
    void delete(TcNombramiento entity);


    /**
     * Find the first TcNombramiento entity that matches the condition 'where fecModifico is equals to'.
     *
     * @param fecModifico java.util.Date
     * @return TcNombramiento
     */
    @FindByCondition(value=TcNombramiento.class, condition="FEC_MODIFICO=?")
    TcNombramiento getByFecModifico(java.util.Date fecModifico);

    /**
     * Find all TcNombramiento entities that matches the condition 'where fecModifico is equals to'.
     *
     * @param fecModifico java.util.Date
     * @return Collection of TcNombramiento
     */
    @FindByCondition(value=TcNombramiento.class, condition="FEC_MODIFICO=?")
    List<TcNombramiento> findByFecModifico(java.util.Date fecModifico);

    /**
     * Find the first TcNombramiento entity that matches the condition 'where usuario is equals to'.
     *
     * @param usuario java.lang.String
     * @return TcNombramiento
     */
    @FindByCondition(value=TcNombramiento.class, condition="USUARIO=?")
    TcNombramiento getByUsuario(java.lang.String usuario);

    /**
     * Find all TcNombramiento entities that matches the condition 'where usuario is equals to'.
     *
     * @param usuario java.lang.String
     * @return Collection of TcNombramiento
     */
    @FindByCondition(value=TcNombramiento.class, condition="USUARIO=?")
    List<TcNombramiento> findByUsuario(java.lang.String usuario);

    /**
     * Find the first TcNombramiento entity that matches the condition 'where descNombramiento is equals to'.
     *
     * @param descNombramiento java.lang.String
     * @return TcNombramiento
     */
    @FindByCondition(value=TcNombramiento.class, condition="DESC_NOMBRAMIENTO=?")
    TcNombramiento getByDescNombramiento(java.lang.String descNombramiento);

    /**
     * Find all TcNombramiento entities that matches the condition 'where descNombramiento is equals to'.
     *
     * @param descNombramiento java.lang.String
     * @return Collection of TcNombramiento
     */
    @FindByCondition(value=TcNombramiento.class, condition="DESC_NOMBRAMIENTO=?")
    List<TcNombramiento> findByDescNombramiento(java.lang.String descNombramiento);
}