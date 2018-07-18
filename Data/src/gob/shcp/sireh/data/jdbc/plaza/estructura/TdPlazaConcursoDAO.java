package gob.shcp.sireh.data.jdbc.plaza.estructura;

import gob.shcp.fsn.data.annotation.Delete;
import gob.shcp.fsn.data.annotation.FindAll;
import gob.shcp.fsn.data.annotation.FindByCondition;
import gob.shcp.fsn.data.annotation.FindById;
import gob.shcp.fsn.data.annotation.Save;
import gob.shcp.fsn.service.data.orm.JdbcDataService;

import java.util.List;

import gob.shcp.sireh.domain.jdbc.plaza.estructura.TdPlazaConcurso;


/**
 * Data access interface for TdPlazaConcurso.
 */
public interface TdPlazaConcursoDAO extends JdbcDataService {
    /**
     * Find TdPlazaConcurso entity by its identifier or primary key value.
     *
     * @param id identifier or primary key
     * @return TdPlazaConcurso
     */
    @FindById(TdPlazaConcurso.class)
    TdPlazaConcurso getById(gob.shcp.sireh.domain.jdbc.plaza.estructura.TdPlazaConcursoPK id);
    
    /**
     * Get all TdPlazaConcurso entities limited by a maximum number of elements.
     *
     * @return Collection of TdPlazaConcurso
     */
    @FindAll(TdPlazaConcurso.class)
    List<TdPlazaConcurso> findAll();
    
    /**
     * Make persistence of TdPlazaConcurso entities. If its identifier or primary key is null then create else update.
     *
     * @param entity TdPlazaConcurso
     */
    @Save
    void save(TdPlazaConcurso entity);
    
    /**
     * Remove TdPlazaConcurso entities.
     *
     * @param entity TdPlazaConcurso
     */
    @Delete
    void delete(TdPlazaConcurso entity);


    /**
     * Find the first TdPlazaConcurso entity that matches the condition 'where fecModifico is equals to'.
     *
     * @param fecModifico java.util.Date
     * @return TdPlazaConcurso
     */
    @FindByCondition(value=TdPlazaConcurso.class, condition="FEC_MODIFICO=?")
    TdPlazaConcurso getByFecModifico(java.util.Date fecModifico);

    /**
     * Find all TdPlazaConcurso entities that matches the condition 'where fecModifico is equals to'.
     *
     * @param fecModifico java.util.Date
     * @return Collection of TdPlazaConcurso
     */
    @FindByCondition(value=TdPlazaConcurso.class, condition="FEC_MODIFICO=?")
    List<TdPlazaConcurso> findByFecModifico(java.util.Date fecModifico);

    /**
     * Find the first TdPlazaConcurso entity that matches the condition 'where usuario is equals to'.
     *
     * @param usuario java.lang.String
     * @return TdPlazaConcurso
     */
    @FindByCondition(value=TdPlazaConcurso.class, condition="USUARIO=?")
    TdPlazaConcurso getByUsuario(java.lang.String usuario);

    /**
     * Find all TdPlazaConcurso entities that matches the condition 'where usuario is equals to'.
     *
     * @param usuario java.lang.String
     * @return Collection of TdPlazaConcurso
     */
    @FindByCondition(value=TdPlazaConcurso.class, condition="USUARIO=?")
    List<TdPlazaConcurso> findByUsuario(java.lang.String usuario);

    /**
     * Find the first TdPlazaConcurso entity that matches the condition 'where fechaDesierta is equals to'.
     *
     * @param fechaDesierta java.util.Date
     * @return TdPlazaConcurso
     */
    @FindByCondition(value=TdPlazaConcurso.class, condition="FECHA_DESIERTA=?")
    TdPlazaConcurso getByFechaDesierta(java.util.Date fechaDesierta);

    /**
     * Find all TdPlazaConcurso entities that matches the condition 'where fechaDesierta is equals to'.
     *
     * @param fechaDesierta java.util.Date
     * @return Collection of TdPlazaConcurso
     */
    @FindByCondition(value=TdPlazaConcurso.class, condition="FECHA_DESIERTA=?")
    List<TdPlazaConcurso> findByFechaDesierta(java.util.Date fechaDesierta);
}