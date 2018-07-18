package gob.shcp.sireh.data.jdbc.spc;

import gob.shcp.fsn.data.annotation.Delete;
import gob.shcp.fsn.data.annotation.FindAll;
import gob.shcp.fsn.data.annotation.FindByCondition;
import gob.shcp.fsn.data.annotation.FindById;
import gob.shcp.fsn.data.annotation.Save;
import gob.shcp.fsn.service.data.orm.JdbcDataService;

import java.util.List;

import gob.shcp.sireh.domain.jdbc.spc.TcCapInstructor;


/**
 * Data access interface for TcCapInstructor.
 */
public interface TcCapInstructorDAO extends JdbcDataService {
    /**
     * Find TcCapInstructor entity by its identifier or primary key value.
     *
     * @param id identifier or primary key
     * @return TcCapInstructor
     */
    @FindById(TcCapInstructor.class)
    TcCapInstructor getById(java.lang.Integer id);

    /**
     * Get all TcCapInstructor entities limited by a maximum number of elements.
     *
     * @return Collection of TcCapInstructor
     */
    @FindAll(TcCapInstructor.class)
    List<TcCapInstructor> findAll();

    /**
     * Make persistence of TcCapInstructor entities. If its identifier or primary key is null then create else update.
     *
     * @param entity TcCapInstructor
     */
    @Save
    void save(TcCapInstructor entity);

    /**
     * Remove TcCapInstructor entities.
     *
     * @param entity TcCapInstructor
     */
    @Delete
    void delete(TcCapInstructor entity);


    /**
     * Find the first TcCapInstructor entity that matches the condition 'where fecModifico is equals to'.
     *
     * @param fecModifico java.util.Date
     * @return TcCapInstructor
     */
    @FindByCondition(value = TcCapInstructor.class, condition = "FEC_MODIFICO=?")
    TcCapInstructor getByFecModifico(java.util.Date fecModifico);

    /**
     * Find all TcCapInstructor entities that matches the condition 'where fecModifico is equals to'.
     *
     * @param fecModifico java.util.Date
     * @return Collection of TcCapInstructor
     */
    @FindByCondition(value = TcCapInstructor.class, condition = "FEC_MODIFICO=?")
    List<TcCapInstructor> findByFecModifico(java.util.Date fecModifico);

    /**
     * Find the first TcCapInstructor entity that matches the condition 'where idStatus is equals to'.
     *
     * @param idStatus java.lang.String
     * @return TcCapInstructor
     */
    @FindByCondition(value = TcCapInstructor.class, condition = "ID_STATUS=?")
    TcCapInstructor getByIdStatus(java.lang.String idStatus);

    /**
     * Find all TcCapInstructor entities that matches the condition 'where idStatus is equals to'.
     *
     * @param idStatus java.lang.String
     * @return Collection of TcCapInstructor
     */
    @FindByCondition(value = TcCapInstructor.class, condition = "ID_STATUS=?")
    List<TcCapInstructor> findByIdStatus(java.lang.String idStatus);

    /**
     * Find the first TcCapInstructor entity that matches the condition 'where nombreInstructor is equals to'.
     *
     * @param nombreInstructor java.lang.String
     * @return TcCapInstructor
     */
    @FindByCondition(value = TcCapInstructor.class, condition = "NOMBRE_INSTRUCTOR=?")
    TcCapInstructor getByNombreInstructor(java.lang.String nombreInstructor);

    /**
     * Find all TcCapInstructor entities that matches the condition 'where nombreInstructor is equals to'.
     *
     * @param nombreInstructor java.lang.String
     * @return Collection of TcCapInstructor
     */
    @FindByCondition(value = TcCapInstructor.class, condition = "NOMBRE_INSTRUCTOR=?")
    List<TcCapInstructor> findByNombreInstructor(java.lang.String nombreInstructor);

    /**
     * Find the first TcCapInstructor entity that matches the condition 'where usuario is equals to'.
     *
     * @param usuario java.lang.String
     * @return TcCapInstructor
     */
    @FindByCondition(value = TcCapInstructor.class, condition = "USUARIO=?")
    TcCapInstructor getByUsuario(java.lang.String usuario);

    /**
     * Find all TcCapInstructor entities that matches the condition 'where usuario is equals to'.
     *
     * @param usuario java.lang.String
     * @return Collection of TcCapInstructor
     */
    @FindByCondition(value = TcCapInstructor.class, condition = "USUARIO=?")
    List<TcCapInstructor> findByUsuario(java.lang.String usuario);

    /**
     * Find the first TcCapInstructor entity that matches the condition 'where cargoInstructor is equals to'.
     *
     * @param cargoInstructor java.lang.String
     * @return TcCapInstructor
     */
    @FindByCondition(value = TcCapInstructor.class, condition = "CARGO_INSTRUCTOR=?")
    TcCapInstructor getByCargoInstructor(java.lang.String cargoInstructor);

    /**
     * Find all TcCapInstructor entities that matches the condition 'where cargoInstructor is equals to'.
     *
     * @param cargoInstructor java.lang.String
     * @return Collection of TcCapInstructor
     */
    @FindByCondition(value = TcCapInstructor.class, condition = "CARGO_INSTRUCTOR=?")
    List<TcCapInstructor> findByCargoInstructor(java.lang.String cargoInstructor);

    /**
     * Find the first TcCapInstructor entity that matches the condition 'where primerApellido is equals to'.
     *
     * @param primerApellido java.lang.String
     * @return TcCapInstructor
     */
    @FindByCondition(value = TcCapInstructor.class, condition = "PRIMER_APELLIDO=?")
    TcCapInstructor getByPrimerApellido(java.lang.String primerApellido);

    /**
     * Find all TcCapInstructor entities that matches the condition 'where primerApellido is equals to'.
     *
     * @param primerApellido java.lang.String
     * @return Collection of TcCapInstructor
     */
    @FindByCondition(value = TcCapInstructor.class, condition = "PRIMER_APELLIDO=?")
    List<TcCapInstructor> findByPrimerApellido(java.lang.String primerApellido);

    /**
     * Find the first TcCapInstructor entity that matches the condition 'where segundoApellido is equals to'.
     *
     * @param segundoApellido java.lang.String
     * @return TcCapInstructor
     */
    @FindByCondition(value = TcCapInstructor.class, condition = "SEGUNDO_APELLIDO=?")
    TcCapInstructor getBySegundoApellido(java.lang.String segundoApellido);

    /**
     * Find all TcCapInstructor entities that matches the condition 'where segundoApellido is equals to'.
     *
     * @param segundoApellido java.lang.String
     * @return Collection of TcCapInstructor
     */
    @FindByCondition(value = TcCapInstructor.class, condition = "SEGUNDO_APELLIDO=?")
    List<TcCapInstructor> findBySegundoApellido(java.lang.String segundoApellido);
}
