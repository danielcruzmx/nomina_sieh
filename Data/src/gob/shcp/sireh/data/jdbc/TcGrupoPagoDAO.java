package gob.shcp.sireh.data.jdbc;

import gob.shcp.fsn.data.annotation.Delete;
import gob.shcp.fsn.data.annotation.FindAll;
import gob.shcp.fsn.data.annotation.FindByCondition;
import gob.shcp.fsn.data.annotation.FindById;
import gob.shcp.fsn.data.annotation.Save;
import gob.shcp.fsn.service.data.orm.JdbcDataService;

import java.util.List;

import gob.shcp.sireh.domain.jdbc.TcGrupoPago;


/**
 * Data access interface for TcGrupoPago.
 */
public interface TcGrupoPagoDAO extends JdbcDataService {
    /**
     * Find TcGrupoPago entity by its identifier or primary key value.
     *
     * @param id identifier or primary key
     * @return TcGrupoPago
     */
    @FindById(TcGrupoPago.class)
    TcGrupoPago getById(java.lang.String id);
    
    /**
     * Get all TcGrupoPago entities limited by a maximum number of elements.
     *
     * @return Collection of TcGrupoPago
     */
    @FindAll(TcGrupoPago.class)
    List<TcGrupoPago> findAll();
    
    /**
     * Make persistence of TcGrupoPago entities. If its identifier or primary key is null then create else update.
     *
     * @param entity TcGrupoPago
     */
    @Save
    void save(TcGrupoPago entity);
    
    /**
     * Remove TcGrupoPago entities.
     *
     * @param entity TcGrupoPago
     */
    @Delete
    void delete(TcGrupoPago entity);


    /**
     * Find the first TcGrupoPago entity that matches the condition 'where descGrupoPago is equals to'.
     *
     * @param descGrupoPago java.lang.String
     * @return TcGrupoPago
     */
    @FindByCondition(value=TcGrupoPago.class, condition="DESC_GRUPO_PAGO=?")
    TcGrupoPago getByDescGrupoPago(java.lang.String descGrupoPago);

    /**
     * Find all TcGrupoPago entities that matches the condition 'where descGrupoPago is equals to'.
     *
     * @param descGrupoPago java.lang.String
     * @return Collection of TcGrupoPago
     */
    @FindByCondition(value=TcGrupoPago.class, condition="DESC_GRUPO_PAGO=?")
    List<TcGrupoPago> findByDescGrupoPago(java.lang.String descGrupoPago);

    /**
     * Find the first TcGrupoPago entity that matches the condition 'where fecModifico is equals to'.
     *
     * @param fecModifico java.util.Date
     * @return TcGrupoPago
     */
    @FindByCondition(value=TcGrupoPago.class, condition="FEC_MODIFICO=?")
    TcGrupoPago getByFecModifico(java.util.Date fecModifico);

    /**
     * Find all TcGrupoPago entities that matches the condition 'where fecModifico is equals to'.
     *
     * @param fecModifico java.util.Date
     * @return Collection of TcGrupoPago
     */
    @FindByCondition(value=TcGrupoPago.class, condition="FEC_MODIFICO=?")
    List<TcGrupoPago> findByFecModifico(java.util.Date fecModifico);

    /**
     * Find the first TcGrupoPago entity that matches the condition 'where usuario is equals to'.
     *
     * @param usuario java.lang.String
     * @return TcGrupoPago
     */
    @FindByCondition(value=TcGrupoPago.class, condition="USUARIO=?")
    TcGrupoPago getByUsuario(java.lang.String usuario);

    /**
     * Find all TcGrupoPago entities that matches the condition 'where usuario is equals to'.
     *
     * @param usuario java.lang.String
     * @return Collection of TcGrupoPago
     */
    @FindByCondition(value=TcGrupoPago.class, condition="USUARIO=?")
    List<TcGrupoPago> findByUsuario(java.lang.String usuario);
}