package gob.shcp.sireh.data.jdbc;

import gob.shcp.fsn.data.annotation.Delete;
import gob.shcp.fsn.data.annotation.FindAll;
import gob.shcp.fsn.data.annotation.FindByCondition;
import gob.shcp.fsn.data.annotation.FindById;
import gob.shcp.fsn.data.annotation.Save;
import gob.shcp.fsn.service.data.orm.JdbcDataService;

import java.util.List;

import gob.shcp.sireh.domain.jdbc.TcConceptoPago;


/**
 * Data access interface for TcConceptoPago.
 */
public interface TcConceptoPagoDAO extends JdbcDataService {
    /**
     * Find TcConceptoPago entity by its identifier or primary key value.
     *
     * @param id identifier or primary key
     * @return TcConceptoPago
     */
    @FindById(TcConceptoPago.class)
    TcConceptoPago getById(gob.shcp.sireh.domain.jdbc.TcConceptoPagoPK id);
    
    /**
     * Get all TcConceptoPago entities limited by a maximum number of elements.
     *
     * @return Collection of TcConceptoPago
     */
    @FindAll(TcConceptoPago.class)
    List<TcConceptoPago> findAll();
    
    /**
     * Make persistence of TcConceptoPago entities. If its identifier or primary key is null then create else update.
     *
     * @param entity TcConceptoPago
     */
    @Save
    void save(TcConceptoPago entity);
    
    /**
     * Remove TcConceptoPago entities.
     *
     * @param entity TcConceptoPago
     */
    @Delete
    void delete(TcConceptoPago entity);


    /**
     * Find the first TcConceptoPago entity that matches the condition 'where fecModifico is equals to'.
     *
     * @param fecModifico java.util.Date
     * @return TcConceptoPago
     */
    @FindByCondition(value=TcConceptoPago.class, condition="FEC_MODIFICO=?")
    TcConceptoPago getByFecModifico(java.util.Date fecModifico);

    /**
     * Find all TcConceptoPago entities that matches the condition 'where fecModifico is equals to'.
     *
     * @param fecModifico java.util.Date
     * @return Collection of TcConceptoPago
     */
    @FindByCondition(value=TcConceptoPago.class, condition="FEC_MODIFICO=?")
    List<TcConceptoPago> findByFecModifico(java.util.Date fecModifico);

    /**
     * Find the first TcConceptoPago entity that matches the condition 'where usuario is equals to'.
     *
     * @param usuario java.lang.String
     * @return TcConceptoPago
     */
    @FindByCondition(value=TcConceptoPago.class, condition="USUARIO=?")
    TcConceptoPago getByUsuario(java.lang.String usuario);

    /**
     * Find all TcConceptoPago entities that matches the condition 'where usuario is equals to'.
     *
     * @param usuario java.lang.String
     * @return Collection of TcConceptoPago
     */
    @FindByCondition(value=TcConceptoPago.class, condition="USUARIO=?")
    List<TcConceptoPago> findByUsuario(java.lang.String usuario);

    /**
     * Find the first TcConceptoPago entity that matches the condition 'where cpActivo is equals to'.
     *
     * @param cpActivo java.lang.Boolean
     * @return TcConceptoPago
     */
    @FindByCondition(value=TcConceptoPago.class, condition="CP_ACTIVO=?")
    TcConceptoPago getByCpActivo(java.lang.Boolean cpActivo);

    /**
     * Find all TcConceptoPago entities that matches the condition 'where cpActivo is equals to'.
     *
     * @param cpActivo java.lang.Boolean
     * @return Collection of TcConceptoPago
     */
    @FindByCondition(value=TcConceptoPago.class, condition="CP_ACTIVO=?")
    List<TcConceptoPago> findByCpActivo(java.lang.Boolean cpActivo);

    /**
     * Find the first TcConceptoPago entity that matches the condition 'where cpConPension is equals to'.
     *
     * @param cpConPension java.lang.String
     * @return TcConceptoPago
     */
    @FindByCondition(value=TcConceptoPago.class, condition="CP_CON_PENSION=?")
    TcConceptoPago getByCpConPension(java.lang.String cpConPension);

    /**
     * Find all TcConceptoPago entities that matches the condition 'where cpConPension is equals to'.
     *
     * @param cpConPension java.lang.String
     * @return Collection of TcConceptoPago
     */
    @FindByCondition(value=TcConceptoPago.class, condition="CP_CON_PENSION=?")
    List<TcConceptoPago> findByCpConPension(java.lang.String cpConPension);

    /**
     * Find the first TcConceptoPago entity that matches the condition 'where cpIsr is equals to'.
     *
     * @param cpIsr java.lang.String
     * @return TcConceptoPago
     */
    @FindByCondition(value=TcConceptoPago.class, condition="CP_ISR=?")
    TcConceptoPago getByCpIsr(java.lang.String cpIsr);

    /**
     * Find all TcConceptoPago entities that matches the condition 'where cpIsr is equals to'.
     *
     * @param cpIsr java.lang.String
     * @return Collection of TcConceptoPago
     */
    @FindByCondition(value=TcConceptoPago.class, condition="CP_ISR=?")
    List<TcConceptoPago> findByCpIsr(java.lang.String cpIsr);

    /**
     * Find the first TcConceptoPago entity that matches the condition 'where cpPrioridad is equals to'.
     *
     * @param cpPrioridad java.lang.String
     * @return TcConceptoPago
     */
    @FindByCondition(value=TcConceptoPago.class, condition="CP_PRIORIDAD=?")
    TcConceptoPago getByCpPrioridad(java.lang.String cpPrioridad);

    /**
     * Find all TcConceptoPago entities that matches the condition 'where cpPrioridad is equals to'.
     *
     * @param cpPrioridad java.lang.String
     * @return Collection of TcConceptoPago
     */
    @FindByCondition(value=TcConceptoPago.class, condition="CP_PRIORIDAD=?")
    List<TcConceptoPago> findByCpPrioridad(java.lang.String cpPrioridad);

    /**
     * Find the first TcConceptoPago entity that matches the condition 'where descConPag is equals to'.
     *
     * @param descConPag java.lang.String
     * @return TcConceptoPago
     */
    @FindByCondition(value=TcConceptoPago.class, condition="DESC_CON_PAG=?")
    TcConceptoPago getByDescConPag(java.lang.String descConPag);

    /**
     * Find all TcConceptoPago entities that matches the condition 'where descConPag is equals to'.
     *
     * @param descConPag java.lang.String
     * @return Collection of TcConceptoPago
     */
    @FindByCondition(value=TcConceptoPago.class, condition="DESC_CON_PAG=?")
    List<TcConceptoPago> findByDescConPag(java.lang.String descConPag);
}