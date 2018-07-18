package gob.shcp.sireh.data.jdbc;

import gob.shcp.fsn.data.annotation.Delete;
import gob.shcp.fsn.data.annotation.FindAll;
import gob.shcp.fsn.data.annotation.FindByCondition;
import gob.shcp.fsn.data.annotation.FindById;
import gob.shcp.fsn.data.annotation.Save;
import gob.shcp.fsn.service.data.orm.JdbcDataService;

import java.util.List;

import gob.shcp.sireh.domain.jdbc.TdExpFechasLaborales;


/**
 * Data access interface for TdExpFechasLaborale.
 */
public interface TdExpFechasLaboralesDAO extends JdbcDataService {
    /**
     * Find TdExpFechasLaborale entity by its identifier or primary key value.
     *
     * @param id identifier or primary key
     * @return TdExpFechasLaborale
     */
    @FindById(TdExpFechasLaborales.class)
    TdExpFechasLaborales getById(gob.shcp.sireh.domain.jdbc.TdExpFechasLaboralesPK id);

    /**
     * Get all TdExpFechasLaborale entities limited by a maximum number of elements.
     *
     * @return Collection of TdExpFechasLaborale
     */
    @FindAll(TdExpFechasLaborales.class)
    List<TdExpFechasLaborales> findAll();

    /**
     * Make persistence of TdExpFechasLaborale entities. If its identifier or primary key is null then create else update.
     *
     * @param entity TdExpFechasLaborale
     */
    @Save
    void save(TdExpFechasLaborales entity);

    /**
     * Remove TdExpFechasLaborale entities.
     *
     * @param entity TdExpFechasLaborale
     */
    @Delete
    void delete(TdExpFechasLaborales entity);


    /**
     * Find the first TdExpFechasLaborale entity that matches the condition 'where fecModifico is equals to'.
     *
     * @param fecModifico java.util.Date
     * @return TdExpFechasLaborale
     */
    @FindByCondition(value = TdExpFechasLaborales.class, condition = "FEC_MODIFICO=?")
    TdExpFechasLaborales getByFecModifico(java.util.Date fecModifico);

    /**
     * Find all TdExpFechasLaborale entities that matches the condition 'where fecModifico is equals to'.
     *
     * @param fecModifico java.util.Date
     * @return Collection of TdExpFechasLaborale
     */
    @FindByCondition(value = TdExpFechasLaborales.class, condition = "FEC_MODIFICO=?")
    List<TdExpFechasLaborales> findByFecModifico(java.util.Date fecModifico);

    /**
     * Find the first TdExpFechasLaborale entity that matches the condition 'where felFechaLaboral is equals to'.
     *
     * @param felFechaLaboral java.util.Date
     * @return TdExpFechasLaborale
     */
    @FindByCondition(value = TdExpFechasLaborales.class, condition = "FEL_FECHA_LABORAL=?")
    TdExpFechasLaborales getByFelFechaLaboral(java.util.Date felFechaLaboral);

    /**
     * Find all TdExpFechasLaborale entities that matches the condition 'where felFechaLaboral is equals to'.
     *
     * @param felFechaLaboral java.util.Date
     * @return Collection of TdExpFechasLaborale
     */
    @FindByCondition(value = TdExpFechasLaborales.class, condition = "FEL_FECHA_LABORAL=?")
    List<TdExpFechasLaborales> findByFelFechaLaboral(java.util.Date felFechaLaboral);

    /**
     * Find the first TdExpFechasLaborale entity that matches the condition 'where idFecLab is equals to'.
     *
     * @param idFecLab java.lang.String
     * @return TdExpFechasLaborale
     */
    @FindByCondition(value = TdExpFechasLaborales.class, condition = "ID_FEC_LAB=?")
    TdExpFechasLaborales getByIdFecLab(java.lang.String idFecLab);

    /**
     * Find all TdExpFechasLaborale entities that matches the condition 'where idFecLab is equals to'.
     *
     * @param idFecLab java.lang.String
     * @return Collection of TdExpFechasLaborale
     */
    @FindByCondition(value = TdExpFechasLaborales.class, condition = "ID_FEC_LAB=?")
    List<TdExpFechasLaborales> findByIdFecLab(java.lang.String idFecLab);

    /**
     * Find the first TdExpFechasLaborale entity that matches the condition 'where idStatus is equals to'.
     *
     * @param idStatus java.lang.String
     * @return TdExpFechasLaborale
     */
    @FindByCondition(value = TdExpFechasLaborales.class, condition = "ID_STATUS=?")
    TdExpFechasLaborales getByIdStatus(java.lang.String idStatus);

    /**
     * Find all TdExpFechasLaborale entities that matches the condition 'where idStatus is equals to'.
     *
     * @param idStatus java.lang.String
     * @return Collection of TdExpFechasLaborale
     */
    @FindByCondition(value = TdExpFechasLaborales.class, condition = "ID_STATUS=?")
    List<TdExpFechasLaborales> findByIdStatus(java.lang.String idStatus);

    /**
     * Find the first TdExpFechasLaborale entity that matches the condition 'where usuario is equals to'.
     *
     * @param usuario java.lang.String
     * @return TdExpFechasLaborale
     */
    @FindByCondition(value = TdExpFechasLaborales.class, condition = "USUARIO=?")
    TdExpFechasLaborales getByUsuario(java.lang.String usuario);

    /**
     * Find all TdExpFechasLaborale entities that matches the condition 'where usuario is equals to'.
     *
     * @param usuario java.lang.String
     * @return Collection of TdExpFechasLaborale
     */
    @FindByCondition(value = TdExpFechasLaborales.class, condition = "USUARIO=?")
    List<TdExpFechasLaborales> findByUsuario(java.lang.String usuario);

    /**
     * Find the first TdExpFechasLaborale entity that matches the condition 'where felDoctoRef is equals to'.
     *
     * @param felDoctoRef java.lang.String
     * @return TdExpFechasLaborale
     */
    @FindByCondition(value = TdExpFechasLaborales.class, condition = "FEL_DOCTO_REF=?")
    TdExpFechasLaborales getByFelDoctoRef(java.lang.String felDoctoRef);

    /**
     * Find all TdExpFechasLaborale entities that matches the condition 'where felDoctoRef is equals to'.
     *
     * @param felDoctoRef java.lang.String
     * @return Collection of TdExpFechasLaborale
     */
    @FindByCondition(value = TdExpFechasLaborales.class, condition = "FEL_DOCTO_REF=?")
    List<TdExpFechasLaborales> findByFelDoctoRef(java.lang.String felDoctoRef);
}
