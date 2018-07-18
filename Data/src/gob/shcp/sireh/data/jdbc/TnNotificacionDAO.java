package gob.shcp.sireh.data.jdbc;

import gob.shcp.fsn.data.annotation.Delete;
import gob.shcp.fsn.data.annotation.FindAll;
import gob.shcp.fsn.data.annotation.FindByCondition;
import gob.shcp.fsn.data.annotation.FindById;
import gob.shcp.fsn.data.annotation.Save;
import gob.shcp.fsn.service.data.orm.JdbcDataService;

import java.util.List;

import gob.shcp.sireh.domain.jdbc.TnNotificacion;

/**
 * Data access interface for TnNotificacion.
 */
public interface TnNotificacionDAO extends JdbcDataService {
    /**
     * Find TnNotificacion entity by its identifier or primary key value.
     *
     * @param id identifier or primary key
     * @return TnNotificacion
     */
    @FindById(TnNotificacion.class)
    TnNotificacion getById(java.lang.Integer id);

    /**
     * Get all TnNotificacion entities limited by a maximum number of elements.
     *
     * @return Collection of TnNotificacion
     */
    @FindAll(TnNotificacion.class)
    List<TnNotificacion> findAll();

    /**
     * Make persistence of TnNotificacion entities. If its identifier or primary key is null then create else update.
     *
     * @param entity TnNotificacion
     */
    @Save
    void save(TnNotificacion entity);

    /**
     * Remove TnNotificacion entities.
     *
     * @param entity TnNotificacion
     */
    @Delete
    void delete(TnNotificacion entity);


    /**
     * Find the first TnNotificacion entity that matches the condition 'where fecModifico is equals to'.
     *
     * @param fecModifico java.util.Date
     * @return TnNotificacion
     */
    @FindByCondition(value = TnNotificacion.class, condition = "FEC_MODIFICO=?")
    TnNotificacion getByFecModifico(java.util.Date fecModifico);

    /**
     * Find all TnNotificacion entities that matches the condition 'where fecModifico is equals to'.
     *
     * @param fecModifico java.util.Date
     * @return Collection of TnNotificacion
     */
    @FindByCondition(value = TnNotificacion.class, condition = "FEC_MODIFICO=?")
    List<TnNotificacion> findByFecModifico(java.util.Date fecModifico);

    /**
     * Find the first TnNotificacion entity that matches the condition 'where fromRfcNotificacion is equals to'.
     *
     * @param fromRfcNotificacion java.lang.String
     * @return TnNotificacion
     */
    @FindByCondition(value = TnNotificacion.class, condition = "FROM_RFC_NOTIFICACION=?")
    TnNotificacion getByFromRfcNotificacion(java.lang.String fromRfcNotificacion);

    /**
     * Find all TnNotificacion entities that matches the condition 'where fromRfcNotificacion is equals to'.
     *
     * @param fromRfcNotificacion java.lang.String
     * @return Collection of TnNotificacion
     */
    @FindByCondition(value = TnNotificacion.class, condition = "FROM_RFC_NOTIFICACION=?")
    List<TnNotificacion> findByFromRfcNotificacion(java.lang.String fromRfcNotificacion);

    /**
     * Find the first TnNotificacion entity that matches the condition 'where msgNotificacion is equals to'.
     *
     * @param msgNotificacion java.lang.String
     * @return TnNotificacion
     */
    @FindByCondition(value = TnNotificacion.class, condition = "MSG_NOTIFICACION=?")
    TnNotificacion getByMsgNotificacion(java.lang.String msgNotificacion);

    /**
     * Find all TnNotificacion entities that matches the condition 'where msgNotificacion is equals to'.
     *
     * @param msgNotificacion java.lang.String
     * @return Collection of TnNotificacion
     */
    @FindByCondition(value = TnNotificacion.class, condition = "MSG_NOTIFICACION=?")
    List<TnNotificacion> findByMsgNotificacion(java.lang.String msgNotificacion);

    /**
     * Find the first TnNotificacion entity that matches the condition 'where tituloNotificacion is equals to'.
     *
     * @param tituloNotificacion java.lang.String
     * @return TnNotificacion
     */
    @FindByCondition(value = TnNotificacion.class, condition = "TITULO_NOTIFICACION=?")
    TnNotificacion getByTituloNotificacion(java.lang.String tituloNotificacion);

    /**
     * Find all TnNotificacion entities that matches the condition 'where tituloNotificacion is equals to'.
     *
     * @param tituloNotificacion java.lang.String
     * @return Collection of TnNotificacion
     */
    @FindByCondition(value = TnNotificacion.class, condition = "TITULO_NOTIFICACION=?")
    List<TnNotificacion> findByTituloNotificacion(java.lang.String tituloNotificacion);

    /**
     * Find the first TnNotificacion entity that matches the condition 'where toRfcNotificacion is equals to'.
     *
     * @param toRfcNotificacion java.lang.String
     * @return TnNotificacion
     */
    @FindByCondition(value = TnNotificacion.class, condition = "TO_RFC_NOTIFICACION=?")
    TnNotificacion getByToRfcNotificacion(java.lang.String toRfcNotificacion);

    /**
     * Find all TnNotificacion entities that matches the condition 'where toRfcNotificacion is equals to'.
     *
     * @param toRfcNotificacion java.lang.String
     * @return Collection of TnNotificacion
     */
    @FindByCondition(value = TnNotificacion.class, condition = "TO_RFC_NOTIFICACION=?")
    List<TnNotificacion> findByToRfcNotificacion(java.lang.String toRfcNotificacion);

    /**
     * Find the first TnNotificacion entity that matches the condition 'where usuario is equals to'.
     *
     * @param usuario java.lang.String
     * @return TnNotificacion
     */
    @FindByCondition(value = TnNotificacion.class, condition = "USUARIO=?")
    TnNotificacion getByUsuario(java.lang.String usuario);

    /**
     * Find all TnNotificacion entities that matches the condition 'where usuario is equals to'.
     *
     * @param usuario java.lang.String
     * @return Collection of TnNotificacion
     */
    @FindByCondition(value = TnNotificacion.class, condition = "USUARIO=?")
    List<TnNotificacion> findByUsuario(java.lang.String usuario);

    /**
     * Find the first TnNotificacion entity that matches the condition 'where adjuntoNotificacion is equals to'.
     *
     * @param adjuntoNotificacion java.lang.String
     * @return TnNotificacion
     */
    @FindByCondition(value = TnNotificacion.class, condition = "ADJUNTO_NOTIFICACION=?")
    TnNotificacion getByAdjuntoNotificacion(java.lang.String adjuntoNotificacion);

    /**
     * Find all TnNotificacion entities that matches the condition 'where adjuntoNotificacion is equals to'.
     *
     * @param adjuntoNotificacion java.lang.String
     * @return Collection of TnNotificacion
     */
    @FindByCondition(value = TnNotificacion.class, condition = "ADJUNTO_NOTIFICACION=?")
    List<TnNotificacion> findByAdjuntoNotificacion(java.lang.String adjuntoNotificacion);

    /**
     * Find the first TnNotificacion entity that matches the condition 'where ccRfcNotificacion is equals to'.
     *
     * @param ccRfcNotificacion java.lang.String
     * @return TnNotificacion
     */
    @FindByCondition(value = TnNotificacion.class, condition = "CC_RFC_NOTIFICACION=?")
    TnNotificacion getByCcRfcNotificacion(java.lang.String ccRfcNotificacion);

    /**
     * Find all TnNotificacion entities that matches the condition 'where ccRfcNotificacion is equals to'.
     *
     * @param ccRfcNotificacion java.lang.String
     * @return Collection of TnNotificacion
     */
    @FindByCondition(value = TnNotificacion.class, condition = "CC_RFC_NOTIFICACION=?")
    List<TnNotificacion> findByCcRfcNotificacion(java.lang.String ccRfcNotificacion);
}
