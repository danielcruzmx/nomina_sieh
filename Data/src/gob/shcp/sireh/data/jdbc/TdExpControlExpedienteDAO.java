package gob.shcp.sireh.data.jdbc;

import gob.shcp.fsn.data.annotation.Delete;
import gob.shcp.fsn.data.annotation.FindAll;
import gob.shcp.fsn.data.annotation.FindByCondition;
import gob.shcp.fsn.data.annotation.FindById;
import gob.shcp.fsn.data.annotation.Save;
import gob.shcp.fsn.service.data.orm.JdbcDataService;

import java.util.List;

import gob.shcp.sireh.domain.jdbc.TdExpControlExpediente;


/**
 * Data access interface for TdExpControlExpediente.
 */
public interface TdExpControlExpedienteDAO extends JdbcDataService {
    /**
     * Find TdExpControlExpediente entity by its identifier or primary key value.
     *
     * @param id identifier or primary key
     * @return TdExpControlExpediente
     */
    @FindById(TdExpControlExpediente.class)
    TdExpControlExpediente getById(java.lang.String id);
    
    /**
     * Get all TdExpControlExpediente entities limited by a maximum number of elements.
     *
     * @return Collection of TdExpControlExpediente
     */
    @FindAll(TdExpControlExpediente.class)
    List<TdExpControlExpediente> findAll();
    
    /**
     * Make persistence of TdExpControlExpediente entities. If its identifier or primary key is null then create else update.
     *
     * @param entity TdExpControlExpediente
     */
    @Save
    void save(TdExpControlExpediente entity);
    
    /**
     * Remove TdExpControlExpediente entities.
     *
     * @param entity TdExpControlExpediente
     */
    @Delete
    void delete(TdExpControlExpediente entity);


    /**
     * Find the first TdExpControlExpediente entity that matches the condition 'where exeDatosClasificacion is equals to'.
     *
     * @param exeDatosClasificacion java.lang.String
     * @return TdExpControlExpediente
     */
    @FindByCondition(value=TdExpControlExpediente.class, condition="EXE_DATOS_CLASIFICACION=?")
    TdExpControlExpediente getByExeDatosClasificacion(java.lang.String exeDatosClasificacion);

    /**
     * Find all TdExpControlExpediente entities that matches the condition 'where exeDatosClasificacion is equals to'.
     *
     * @param exeDatosClasificacion java.lang.String
     * @return Collection of TdExpControlExpediente
     */
    @FindByCondition(value=TdExpControlExpediente.class, condition="EXE_DATOS_CLASIFICACION=?")
    List<TdExpControlExpediente> findByExeDatosClasificacion(java.lang.String exeDatosClasificacion);

    /**
     * Find the first TdExpControlExpediente entity that matches the condition 'where exeDatosUbicacion is equals to'.
     *
     * @param exeDatosUbicacion java.lang.String
     * @return TdExpControlExpediente
     */
    @FindByCondition(value=TdExpControlExpediente.class, condition="EXE_DATOS_UBICACION=?")
    TdExpControlExpediente getByExeDatosUbicacion(java.lang.String exeDatosUbicacion);

    /**
     * Find all TdExpControlExpediente entities that matches the condition 'where exeDatosUbicacion is equals to'.
     *
     * @param exeDatosUbicacion java.lang.String
     * @return Collection of TdExpControlExpediente
     */
    @FindByCondition(value=TdExpControlExpediente.class, condition="EXE_DATOS_UBICACION=?")
    List<TdExpControlExpediente> findByExeDatosUbicacion(java.lang.String exeDatosUbicacion);

    /**
     * Find the first TdExpControlExpediente entity that matches the condition 'where exePrestado is equals to'.
     *
     * @param exePrestado java.lang.String
     * @return TdExpControlExpediente
     */
    @FindByCondition(value=TdExpControlExpediente.class, condition="EXE_PRESTADO=?")
    TdExpControlExpediente getByExePrestado(java.lang.String exePrestado);

    /**
     * Find all TdExpControlExpediente entities that matches the condition 'where exePrestado is equals to'.
     *
     * @param exePrestado java.lang.String
     * @return Collection of TdExpControlExpediente
     */
    @FindByCondition(value=TdExpControlExpediente.class, condition="EXE_PRESTADO=?")
    List<TdExpControlExpediente> findByExePrestado(java.lang.String exePrestado);

    /**
     * Find the first TdExpControlExpediente entity that matches the condition 'where fecModifico is equals to'.
     *
     * @param fecModifico java.util.Date
     * @return TdExpControlExpediente
     */
    @FindByCondition(value=TdExpControlExpediente.class, condition="FEC_MODIFICO=?")
    TdExpControlExpediente getByFecModifico(java.util.Date fecModifico);

    /**
     * Find all TdExpControlExpediente entities that matches the condition 'where fecModifico is equals to'.
     *
     * @param fecModifico java.util.Date
     * @return Collection of TdExpControlExpediente
     */
    @FindByCondition(value=TdExpControlExpediente.class, condition="FEC_MODIFICO=?")
    List<TdExpControlExpediente> findByFecModifico(java.util.Date fecModifico);

    /**
     * Find the first TdExpControlExpediente entity that matches the condition 'where usuario is equals to'.
     *
     * @param usuario java.lang.String
     * @return TdExpControlExpediente
     */
    @FindByCondition(value=TdExpControlExpediente.class, condition="USUARIO=?")
    TdExpControlExpediente getByUsuario(java.lang.String usuario);

    /**
     * Find all TdExpControlExpediente entities that matches the condition 'where usuario is equals to'.
     *
     * @param usuario java.lang.String
     * @return Collection of TdExpControlExpediente
     */
    @FindByCondition(value=TdExpControlExpediente.class, condition="USUARIO=?")
    List<TdExpControlExpediente> findByUsuario(java.lang.String usuario);

    /**
     * Find the first TdExpControlExpediente entity that matches the condition 'where exeFechaPrestamo is equals to'.
     *
     * @param exeFechaPrestamo java.util.Date
     * @return TdExpControlExpediente
     */
    @FindByCondition(value=TdExpControlExpediente.class, condition="EXE_FECHA_PRESTAMO=?")
    TdExpControlExpediente getByExeFechaPrestamo(java.util.Date exeFechaPrestamo);

    /**
     * Find all TdExpControlExpediente entities that matches the condition 'where exeFechaPrestamo is equals to'.
     *
     * @param exeFechaPrestamo java.util.Date
     * @return Collection of TdExpControlExpediente
     */
    @FindByCondition(value=TdExpControlExpediente.class, condition="EXE_FECHA_PRESTAMO=?")
    List<TdExpControlExpediente> findByExeFechaPrestamo(java.util.Date exeFechaPrestamo);

    /**
     * Find the first TdExpControlExpediente entity that matches the condition 'where exeRfcUsuarioPrestamo is equals to'.
     *
     * @param exeRfcUsuarioPrestamo java.lang.String
     * @return TdExpControlExpediente
     */
    @FindByCondition(value=TdExpControlExpediente.class, condition="EXE_RFC_USUARIO_PRESTAMO=?")
    TdExpControlExpediente getByExeRfcUsuarioPrestamo(java.lang.String exeRfcUsuarioPrestamo);

    /**
     * Find all TdExpControlExpediente entities that matches the condition 'where exeRfcUsuarioPrestamo is equals to'.
     *
     * @param exeRfcUsuarioPrestamo java.lang.String
     * @return Collection of TdExpControlExpediente
     */
    @FindByCondition(value=TdExpControlExpediente.class, condition="EXE_RFC_USUARIO_PRESTAMO=?")
    List<TdExpControlExpediente> findByExeRfcUsuarioPrestamo(java.lang.String exeRfcUsuarioPrestamo);
}