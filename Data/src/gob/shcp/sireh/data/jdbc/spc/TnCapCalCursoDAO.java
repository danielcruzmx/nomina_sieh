package gob.shcp.sireh.data.jdbc.spc;

import gob.shcp.fsn.data.annotation.Delete;
import gob.shcp.fsn.data.annotation.FindAll;
import gob.shcp.fsn.data.annotation.FindByCondition;
import gob.shcp.fsn.data.annotation.FindById;
import gob.shcp.fsn.data.annotation.Save;
import gob.shcp.fsn.service.data.orm.JdbcDataService;

import java.util.List;

import gob.shcp.sireh.domain.jdbc.spc.TnCapCalCurso;


/**
 * Data access interface for TnCapCalendarioCurso.
 */
public interface TnCapCalCursoDAO extends JdbcDataService {
    /**
     * Find TnCapCalendarioCurso entity by its identifier or primary key value.
     *
     * @param id identifier or primary key
     * @return TnCapCalendarioCurso
     */
    @FindById(TnCapCalCurso.class)
    TnCapCalCurso getById(gob.shcp.sireh.domain.jdbc.spc.TnCapCalendarioCursoPK id);

    /**
     * Get all TnCapCalendarioCurso entities limited by a maximum number of elements.
     *
     * @return Collection of TnCapCalendarioCurso
     */
    @FindAll(TnCapCalCurso.class)
    List<TnCapCalCurso> findAll();

    /**
     * Make persistence of TnCapCalendarioCurso entities. If its identifier or primary key is null then create else update.
     *
     * @param entity TnCapCalendarioCurso
     */
    @Save
    void save(TnCapCalCurso entity);

    /**
     * Remove TnCapCalendarioCurso entities.
     *
     * @param entity TnCapCalendarioCurso
     */
    @Delete
    void delete(TnCapCalCurso entity);


    /**
     * Find the first TnCapCalendarioCurso entity that matches the condition 'where fecModifico is equals to'.
     *
     * @param fecModifico java.util.Date
     * @return TnCapCalendarioCurso
     */
    @FindByCondition(value = TnCapCalCurso.class, condition = "FEC_MODIFICO=?")
    TnCapCalCurso getByFecModifico(java.util.Date fecModifico);

    /**
     * Find all TnCapCalendarioCurso entities that matches the condition 'where fecModifico is equals to'.
     *
     * @param fecModifico java.util.Date
     * @return Collection of TnCapCalendarioCurso
     */
    @FindByCondition(value = TnCapCalCurso.class, condition = "FEC_MODIFICO=?")
    List<TnCapCalCurso> findByFecModifico(java.util.Date fecModifico);

    /**
     * Find the first TnCapCalendarioCurso entity that matches the condition 'where usuario is equals to'.
     *
     * @param usuario java.lang.String
     * @return TnCapCalendarioCurso
     */
    @FindByCondition(value = TnCapCalCurso.class, condition = "USUARIO=?")
    TnCapCalCurso getByUsuario(java.lang.String usuario);

    /**
     * Find all TnCapCalendarioCurso entities that matches the condition 'where usuario is equals to'.
     *
     * @param usuario java.lang.String
     * @return Collection of TnCapCalendarioCurso
     */
    @FindByCondition(value = TnCapCalCurso.class, condition = "USUARIO=?")
    List<TnCapCalCurso> findByUsuario(java.lang.String usuario);
    
    /**
     * Find all TnCapCalendarioCurso entities that matches the condition 'where idCurso is equals to'.
     *
     * @param idCurso Integer
     * @return TnCapCalendarioCurso
     */
    @FindByCondition(value = TnCapCalCurso.class, condition = "ID_CURSO=?")
    List<TnCapCalCurso> getByIdCurso(Integer idCurso);
}
