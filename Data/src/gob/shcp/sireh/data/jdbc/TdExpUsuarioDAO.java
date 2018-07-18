package gob.shcp.sireh.data.jdbc;

import gob.shcp.fsn.data.annotation.Delete;
import gob.shcp.fsn.data.annotation.FindAll;
import gob.shcp.fsn.data.annotation.FindByCondition;
import gob.shcp.fsn.data.annotation.FindById;
import gob.shcp.fsn.data.annotation.Save;
import gob.shcp.fsn.service.data.orm.JdbcDataService;

import java.util.List;

import gob.shcp.sireh.domain.jdbc.TdExpUsuarios;


/**
 * Data access interface for TdExpUsuario.
 */
public interface TdExpUsuarioDAO extends JdbcDataService {
    /**
     * Find TdExpUsuario entity by its identifier or primary key value.
     *
     * @param id identifier or primary key
     * @return TdExpUsuario
     */
    @FindById(TdExpUsuarios.class)
    TdExpUsuarios getById(java.lang.String id);
    
    /**
     * Get all TdExpUsuario entities limited by a maximum number of elements.
     *
     * @return Collection of TdExpUsuario
     */
    @FindAll(TdExpUsuarios.class)
    List<TdExpUsuarios> findAll();
    
    /**
     * Make persistence of TdExpUsuario entities. If its identifier or primary key is null then create else update.
     *
     * @param entity TdExpUsuario
     */
    @Save
    void save(TdExpUsuarios entity);
    
    /**
     * Remove TdExpUsuarios entities.
     *
     * @param entity TdExpUsuarios
     */
    @Delete
    void delete(TdExpUsuarios entity);


    /**
     * Find the first TdExpUsuarios entity that matches the condition 'where fecModifico is equals to'.
     *
     * @param fecModifico java.util.Date
     * @return TdExpUsuarios
     */
    @FindByCondition(value=TdExpUsuarios.class, condition="FEC_MODIFICO=?")
    TdExpUsuarios getByFecModifico(java.util.Date fecModifico);

    /**
     * Find all TdExpUsuarios entities that matches the condition 'where fecModifico is equals to'.
     *
     * @param fecModifico java.util.Date
     * @return Collection of TdExpUsuarios
     */
    @FindByCondition(value=TdExpUsuarios.class, condition="FEC_MODIFICO=?")
    List<TdExpUsuarios> findByFecModifico(java.util.Date fecModifico);

    /**
     * Find the first TdExpUsuarios entity that matches the condition 'where idStatus is equals to'.
     *
     * @param idStatus java.lang.String
     * @return TdExpUsuarios
     */
    @FindByCondition(value=TdExpUsuarios.class, condition="ID_STATUS=?")
    TdExpUsuarios getByIdStatus(java.lang.String idStatus);

    /**
     * Find all TdExpUsuarios entities that matches the condition 'where idStatus is equals to'.
     *
     * @param idStatus java.lang.String
     * @return Collection of TdExpUsuarios
     */
    @FindByCondition(value=TdExpUsuarios.class, condition="ID_STATUS=?")
    List<TdExpUsuarios> findByIdStatus(java.lang.String idStatus);

    /**
     * Find the first TdExpUsuarios entity that matches the condition 'where usuario is equals to'.
     *
     * @param usuario java.lang.String
     * @return TdExpUsuarios
     */
    @FindByCondition(value=TdExpUsuarios.class, condition="USUARIO=?")
    TdExpUsuarios getByUsuario(java.lang.String usuario);

    /**
     * Find all TdExpUsuarios entities that matches the condition 'where usuario is equals to'.
     *
     * @param usuario java.lang.String
     * @return Collection of TdExpUsuarios
     */
    @FindByCondition(value=TdExpUsuarios.class, condition="USUARIO=?")
    List<TdExpUsuarios> findByUsuario(java.lang.String usuario);

    /**
     * Find the first TdExpUsuarios entity that matches the condition 'where usuDoctoAutorizacion is equals to'.
     *
     * @param usuDoctoAutorizacion java.lang.String
     * @return TdExpUsuarios
     */
    @FindByCondition(value=TdExpUsuarios.class, condition="USU_DOCTO_AUTORIZACION=?")
    TdExpUsuarios getByUsuDoctoAutorizacion(java.lang.String usuDoctoAutorizacion);

    /**
     * Find all TdExpUsuarios entities that matches the condition 'where usuDoctoAutorizacion is equals to'.
     *
     * @param usuDoctoAutorizacion java.lang.String
     * @return Collection of TdExpUsuarios
     */
    @FindByCondition(value=TdExpUsuarios.class, condition="USU_DOCTO_AUTORIZACION=?")
    List<TdExpUsuarios> findByUsuDoctoAutorizacion(java.lang.String usuDoctoAutorizacion);

    /**
     * Find the first TdExpUsuarios entity that matches the condition 'where usuFechaAutorizacion is equals to'.
     *
     * @param usuFechaAutorizacion java.util.Date
     * @return TdExpUsuarios
     */
    @FindByCondition(value=TdExpUsuarios.class, condition="USU_FECHA_AUTORIZACION=?")
    TdExpUsuarios getByUsuFechaAutorizacion(java.util.Date usuFechaAutorizacion);

    /**
     * Find all TdExpUsuarios entities that matches the condition 'where usuFechaAutorizacion is equals to'.
     *
     * @param usuFechaAutorizacion java.util.Date
     * @return Collection of TdExpUsuarios
     */
    @FindByCondition(value=TdExpUsuarios.class, condition="USU_FECHA_AUTORIZACION=?")
    List<TdExpUsuarios> findByUsuFechaAutorizacion(java.util.Date usuFechaAutorizacion);

    /**
     * Find the first TdExpUsuarios entity that matches the condition 'where usuTelefono is equals to'.
     *
     * @param usuTelefono java.lang.String
     * @return TdExpUsuarios
     */
    @FindByCondition(value=TdExpUsuarios.class, condition="USU_TELEFONO=?")
    TdExpUsuarios getByUsuTelefono(java.lang.String usuTelefono);

    /**
     * Find all TdExpUsuarios entities that matches the condition 'where usuTelefono is equals to'.
     *
     * @param usuTelefono java.lang.String
     * @return Collection of TdExpUsuarios
     */
    @FindByCondition(value=TdExpUsuarios.class, condition="USU_TELEFONO=?")
    List<TdExpUsuarios> findByUsuTelefono(java.lang.String usuTelefono);
}