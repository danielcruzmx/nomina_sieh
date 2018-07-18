package gob.shcp.sireh.data.jdbc;

import gob.shcp.fsn.data.annotation.Delete;
import gob.shcp.fsn.data.annotation.FindAll;
import gob.shcp.fsn.data.annotation.FindByCondition;
import gob.shcp.fsn.data.annotation.FindById;
import gob.shcp.fsn.data.annotation.Save;
import gob.shcp.fsn.service.data.orm.JdbcDataService;
import gob.shcp.sireh.domain.jdbc.TnConceptoPagado;

import java.util.List;

/**
 * Data access interface for TnConceptoPagado.
 */
public interface TnConceptoPagadoDAO extends JdbcDataService {
    /**
     * Find TnConceptoPagado entity by its identifier or primary key value.
     *
     * @param id identifier or primary key
     * @return TnConceptoPagado
     */
    @FindById(TnConceptoPagado.class)
    TnConceptoPagado getById(gob.shcp.sireh.domain.jdbc.TnConceptoPagadoPK id);

    /**
     * Get all TnConceptoPagado entities limited by a maximum number of elements.
     *
     * @return Collection of TnConceptoPagado
     */
    @FindAll(TnConceptoPagado.class)
    List<TnConceptoPagado> findAll();

    /**
     * Make persistence of TnConceptoPagado entities. If its identifier or primary key is null then create else update.
     *
     * @param entity TnConceptoPagado
     */
    @Save
    void save(TnConceptoPagado entity);

    /**
     * Remove TnConceptoPagado entities.
     *
     * @param entity TnConceptoPagado
     */
    @Delete
    void delete(TnConceptoPagado entity);


    /**
     * Find the first TnConceptoPagado entity that matches the condition 'where cpMonto is equals to'.
     *
     * @param cpMonto java.lang.Double
     * @return TnConceptoPagado
     */
    @FindByCondition(value = TnConceptoPagado.class, condition = "CP_MONTO=?")
    TnConceptoPagado getByCpMonto(java.lang.Double cpMonto);

    /**
     * Find all TnConceptoPagado entities that matches the condition 'where cpMonto is equals to'.
     *
     * @param cpMonto java.lang.Double
     * @return Collection of TnConceptoPagado
     */
    @FindByCondition(value = TnConceptoPagado.class, condition = "CP_MONTO=?")
    List<TnConceptoPagado> findByCpMonto(java.lang.Double cpMonto);

    /**
     * Find the first TnConceptoPagado entity that matches the condition 'where idCptoPago is equals to'.
     *
     * @param idCptoPago java.lang.String
     * @return TnConceptoPagado
     */
    @FindByCondition(value = TnConceptoPagado.class, condition = "ID_CPTO_PAGO=?")
    TnConceptoPagado getByIdCptoPago(java.lang.String idCptoPago);

    /**
     * Find all TnConceptoPagado entities that matches the condition 'where idCptoPago is equals to'.
     *
     * @param idCptoPago java.lang.String
     * @return Collection of TnConceptoPagado
     */
    @FindByCondition(value = TnConceptoPagado.class, condition = "ID_CPTO_PAGO=?")
    List<TnConceptoPagado> findByIdCptoPago(java.lang.String idCptoPago);

    /**
     * Find the first TnConceptoPagado entity that matches the condition 'where idTipoCpto is equals to'.
     *
     * @param idTipoCpto java.lang.String
     * @return TnConceptoPagado
     */
    @FindByCondition(value = TnConceptoPagado.class, condition = "ID_TIPO_CPTO=?")
    TnConceptoPagado getByIdTipoCpto(java.lang.String idTipoCpto);

    /**
     * Find all TnConceptoPagado entities that matches the condition 'where idTipoCpto is equals to'.
     *
     * @param idTipoCpto java.lang.String
     * @return Collection of TnConceptoPagado
     */
    @FindByCondition(value = TnConceptoPagado.class, condition = "ID_TIPO_CPTO=?")
    List<TnConceptoPagado> findByIdTipoCpto(java.lang.String idTipoCpto);
}
