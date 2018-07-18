package gob.shcp.sireh.data.jdbc;

import gob.shcp.fsn.data.annotation.Delete;
import gob.shcp.fsn.data.annotation.FindAll;
import gob.shcp.fsn.data.annotation.FindByCondition;
import gob.shcp.fsn.data.annotation.FindById;
import gob.shcp.fsn.data.annotation.Save;
import gob.shcp.fsn.service.data.orm.JdbcDataService;

import java.util.List;

import gob.shcp.sireh.domain.jdbc.TcEstadoComprobante;

/**
 * Data access interface for TcEstadoComprobante.
 */
public interface TcEstadoComprobanteDAO extends JdbcDataService {
    /**
     * Find TcEstadoComprobante entity by its identifier or primary key value.
     *
     * @param id identifier or primary key
     * @return TcEstadoComprobante
     */
    @FindById(TcEstadoComprobante.class)
    TcEstadoComprobante getById(java.lang.Integer id);

    /**
     * Get all TcEstadoComprobante entities limited by a maximum number of elements.
     *
     * @return Collection of TcEstadoComprobante
     */
    @FindAll(TcEstadoComprobante.class)
    List<TcEstadoComprobante> findAll();

    /**
     * Make persistence of TcEstadoComprobante entities. If its identifier or primary key is null then create else update.
     *
     * @param entity TcEstadoComprobante
     */
    @Save
    void save(TcEstadoComprobante entity);

    /**
     * Remove TcEstadoComprobante entities.
     *
     * @param entity TcEstadoComprobante
     */
    @Delete
    void delete(TcEstadoComprobante entity);


    /**
     * Find the first TcEstadoComprobante entity that matches the condition 'where fecModifico is equals to'.
     *
     * @param fecModifico java.util.Date
     * @return TcEstadoComprobante
     */
    @FindByCondition(value = TcEstadoComprobante.class, condition = "FEC_MODIFICO=?")
    TcEstadoComprobante getByFecModifico(java.util.Date fecModifico);

    /**
     * Find all TcEstadoComprobante entities that matches the condition 'where fecModifico is equals to'.
     *
     * @param fecModifico java.util.Date
     * @return Collection of TcEstadoComprobante
     */
    @FindByCondition(value = TcEstadoComprobante.class, condition = "FEC_MODIFICO=?")
    List<TcEstadoComprobante> findByFecModifico(java.util.Date fecModifico);

    /**
     * Find the first TcEstadoComprobante entity that matches the condition 'where usuario is equals to'.
     *
     * @param usuario java.lang.String
     * @return TcEstadoComprobante
     */
    @FindByCondition(value = TcEstadoComprobante.class, condition = "USUARIO=?")
    TcEstadoComprobante getByUsuario(java.lang.String usuario);

    /**
     * Find all TcEstadoComprobante entities that matches the condition 'where usuario is equals to'.
     *
     * @param usuario java.lang.String
     * @return Collection of TcEstadoComprobante
     */
    @FindByCondition(value = TcEstadoComprobante.class, condition = "USUARIO=?")
    List<TcEstadoComprobante> findByUsuario(java.lang.String usuario);

    /**
     * Find the first TcEstadoComprobante entity that matches the condition 'where descEdoComp is equals to'.
     *
     * @param descEdoComp java.lang.String
     * @return TcEstadoComprobante
     */
    @FindByCondition(value = TcEstadoComprobante.class, condition = "DESC_EDO_COMP=?")
    TcEstadoComprobante getByDescEdoComp(java.lang.String descEdoComp);

    /**
     * Find all TcEstadoComprobante entities that matches the condition 'where descEdoComp is equals to'.
     *
     * @param descEdoComp java.lang.String
     * @return Collection of TcEstadoComprobante
     */
    @FindByCondition(value = TcEstadoComprobante.class, condition = "DESC_EDO_COMP=?")
    List<TcEstadoComprobante> findByDescEdoComp(java.lang.String descEdoComp);
}
