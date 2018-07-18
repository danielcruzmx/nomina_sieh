package gob.shcp.sireh.data.jdbc;

import gob.shcp.fsn.data.annotation.Delete;
import gob.shcp.fsn.data.annotation.FindAll;
import gob.shcp.fsn.data.annotation.FindByCondition;
import gob.shcp.fsn.data.annotation.FindById;
import gob.shcp.fsn.data.annotation.Save;
import gob.shcp.fsn.service.data.orm.JdbcDataService;

import java.util.List;

import gob.shcp.sireh.domain.jdbc.TnCxlcCancelados;

/**
 * Data access interface for TnCxlcCancelado.
 */
public interface TnCxlcCanceladosDAO extends JdbcDataService {
    /**
     * Find TnCxlcCancelado entity by its identifier or primary key value.
     *
     * @param id identifier or primary key
     * @return TnCxlcCancelado
     */
    @FindById(TnCxlcCancelados.class)
    TnCxlcCancelados getById(gob.shcp.sireh.domain.jdbc.TnCxlcCanceladoPK id);
    
    /**
     * Get all TnCxlcCancelado entities limited by a maximum number of elements.
     *
     * @return Collection of TnCxlcCancelado
     */
    @FindAll(TnCxlcCancelados.class)
    List<TnCxlcCancelados> findAll();
    
    /**
     * Make persistence of TnCxlcCancelado entities. If its identifier or primary key is null then create else update.
     *
     * @param entity TnCxlcCancelado
     */
    @Save
    void save(TnCxlcCancelados entity);
    
    /**
     * Remove TnCxlcCancelado entities.
     *
     * @param entity TnCxlcCancelado
     */
    @Delete
    void delete(TnCxlcCancelados entity);


    /**
     * Find the first TnCxlcCancelado entity that matches the condition 'where fecModifico is equals to'.
     *
     * @param fecModifico java.util.Date
     * @return TnCxlcCancelado
     */
    @FindByCondition(value=TnCxlcCancelados.class, condition="FEC_MODIFICO=?")
    TnCxlcCancelados getByFecModifico(java.util.Date fecModifico);

    /**
     * Find all TnCxlcCancelado entities that matches the condition 'where fecModifico is equals to'.
     *
     * @param fecModifico java.util.Date
     * @return Collection of TnCxlcCancelado
     */
    @FindByCondition(value=TnCxlcCancelados.class, condition="FEC_MODIFICO=?")
    List<TnCxlcCancelados> findByFecModifico(java.util.Date fecModifico);

    /**
     * Find the first TnCxlcCancelado entity that matches the condition 'where usuario is equals to'.
     *
     * @param usuario java.lang.String
     * @return TnCxlcCancelado
     */
    @FindByCondition(value=TnCxlcCancelados.class, condition="USUARIO=?")
    TnCxlcCancelados getByUsuario(java.lang.String usuario);

    /**
     * Find all TnCxlcCancelado entities that matches the condition 'where usuario is equals to'.
     *
     * @param usuario java.lang.String
     * @return Collection of TnCxlcCancelado
     */
    @FindByCondition(value=TnCxlcCancelados.class, condition="USUARIO=?")
    List<TnCxlcCancelados> findByUsuario(java.lang.String usuario);

    /**
     * Find the first TnCxlcCancelado entity that matches the condition 'where aplicado is equals to'.
     *
     * @param aplicado java.lang.String
     * @return TnCxlcCancelado
     */
    @FindByCondition(value=TnCxlcCancelados.class, condition="APLICADO=?")
    TnCxlcCancelados getByAplicado(java.lang.String aplicado);

    /**
     * Find all TnCxlcCancelado entities that matches the condition 'where aplicado is equals to'.
     *
     * @param aplicado java.lang.String
     * @return Collection of TnCxlcCancelado
     */
    @FindByCondition(value=TnCxlcCancelados.class, condition="APLICADO=?")
    List<TnCxlcCancelados> findByAplicado(java.lang.String aplicado);

    /**
     * Find the first TnCxlcCancelado entity that matches the condition 'where cxlccEdoAplica is equals to'.
     *
     * @param cxlccEdoAplica java.lang.Integer
     * @return TnCxlcCancelado
     */
    @FindByCondition(value=TnCxlcCancelados.class, condition="CXLCC_EDO_APLICA=?")
    TnCxlcCancelados getByCxlccEdoAplica(java.lang.Integer cxlccEdoAplica);

    /**
     * Find all TnCxlcCancelado entities that matches the condition 'where cxlccEdoAplica is equals to'.
     *
     * @param cxlccEdoAplica java.lang.Integer
     * @return Collection of TnCxlcCancelado
     */
    @FindByCondition(value=TnCxlcCancelados.class, condition="CXLCC_EDO_APLICA=?")
    List<TnCxlcCancelados> findByCxlccEdoAplica(java.lang.Integer cxlccEdoAplica);

    /**
     * Find the first TnCxlcCancelado entity that matches the condition 'where cxlccMonto is equals to'.
     *
     * @param cxlccMonto java.lang.Double
     * @return TnCxlcCancelado
     */
    @FindByCondition(value=TnCxlcCancelados.class, condition="CXLCC_MONTO=?")
    TnCxlcCancelados getByCxlccMonto(java.lang.Double cxlccMonto);

    /**
     * Find all TnCxlcCancelado entities that matches the condition 'where cxlccMonto is equals to'.
     *
     * @param cxlccMonto java.lang.Double
     * @return Collection of TnCxlcCancelado
     */
    @FindByCondition(value=TnCxlcCancelados.class, condition="CXLCC_MONTO=?")
    List<TnCxlcCancelados> findByCxlccMonto(java.lang.Double cxlccMonto);

    /**
     * Find the first TnCxlcCancelado entity that matches the condition 'where cxlccTipoProceso is equals to'.
     *
     * @param cxlccTipoProceso java.lang.String
     * @return TnCxlcCancelado
     */
    @FindByCondition(value=TnCxlcCancelados.class, condition="CXLCC_TIPO_PROCESO=?")
    TnCxlcCancelados getByCxlccTipoProceso(java.lang.String cxlccTipoProceso);

    /**
     * Find all TnCxlcCancelado entities that matches the condition 'where cxlccTipoProceso is equals to'.
     *
     * @param cxlccTipoProceso java.lang.String
     * @return Collection of TnCxlcCancelado
     */
    @FindByCondition(value=TnCxlcCancelados.class, condition="CXLCC_TIPO_PROCESO=?")
    List<TnCxlcCancelados> findByCxlccTipoProceso(java.lang.String cxlccTipoProceso);

    /**
     * Find the first TnCxlcCancelado entity that matches the condition 'where cxlccUniAplica is equals to'.
     *
     * @param cxlccUniAplica java.lang.String
     * @return TnCxlcCancelado
     */
    @FindByCondition(value=TnCxlcCancelados.class, condition="CXLCC_UNI_APLICA=?")
    TnCxlcCancelados getByCxlccUniAplica(java.lang.String cxlccUniAplica);

    /**
     * Find all TnCxlcCancelado entities that matches the condition 'where cxlccUniAplica is equals to'.
     *
     * @param cxlccUniAplica java.lang.String
     * @return Collection of TnCxlcCancelado
     */
    @FindByCondition(value=TnCxlcCancelados.class, condition="CXLCC_UNI_APLICA=?")
    List<TnCxlcCancelados> findByCxlccUniAplica(java.lang.String cxlccUniAplica);

    /**
     * Find the first TnCxlcCancelado entity that matches the condition 'where idEdo is equals to'.
     *
     * @param idEdo java.lang.Integer
     * @return TnCxlcCancelado
     */
    @FindByCondition(value=TnCxlcCancelados.class, condition="ID_EDO=?")
    TnCxlcCancelados getByIdEdo(java.lang.Integer idEdo);

    /**
     * Find all TnCxlcCancelado entities that matches the condition 'where idEdo is equals to'.
     *
     * @param idEdo java.lang.Integer
     * @return Collection of TnCxlcCancelado
     */
    @FindByCondition(value=TnCxlcCancelados.class, condition="ID_EDO=?")
    List<TnCxlcCancelados> findByIdEdo(java.lang.Integer idEdo);

    /**
     * Find the first TnCxlcCancelado entity that matches the condition 'where idGrupoPago is equals to'.
     *
     * @param idGrupoPago java.lang.String
     * @return TnCxlcCancelado
     */
    @FindByCondition(value=TnCxlcCancelados.class, condition="ID_GRUPO_PAGO=?")
    TnCxlcCancelados getByIdGrupoPago(java.lang.String idGrupoPago);

    /**
     * Find all TnCxlcCancelado entities that matches the condition 'where idGrupoPago is equals to'.
     *
     * @param idGrupoPago java.lang.String
     * @return Collection of TnCxlcCancelado
     */
    @FindByCondition(value=TnCxlcCancelados.class, condition="ID_GRUPO_PAGO=?")
    List<TnCxlcCancelados> findByIdGrupoPago(java.lang.String idGrupoPago);

    /**
     * Find the first TnCxlcCancelado entity that matches the condition 'where idTipoNomina is equals to'.
     *
     * @param idTipoNomina java.lang.String
     * @return TnCxlcCancelado
     */
    @FindByCondition(value=TnCxlcCancelados.class, condition="ID_TIPO_NOMINA=?")
    TnCxlcCancelados getByIdTipoNomina(java.lang.String idTipoNomina);

    /**
     * Find all TnCxlcCancelado entities that matches the condition 'where idTipoNomina is equals to'.
     *
     * @param idTipoNomina java.lang.String
     * @return Collection of TnCxlcCancelado
     */
    @FindByCondition(value=TnCxlcCancelados.class, condition="ID_TIPO_NOMINA=?")
    List<TnCxlcCancelados> findByIdTipoNomina(java.lang.String idTipoNomina);

    /**
     * Find the first TnCxlcCancelado entity that matches the condition 'where idUnidad is equals to'.
     *
     * @param idUnidad java.lang.String
     * @return TnCxlcCancelado
     */
    @FindByCondition(value=TnCxlcCancelados.class, condition="ID_UNIDAD=?")
    TnCxlcCancelados getByIdUnidad(java.lang.String idUnidad);

    /**
     * Find all TnCxlcCancelado entities that matches the condition 'where idUnidad is equals to'.
     *
     * @param idUnidad java.lang.String
     * @return Collection of TnCxlcCancelado
     */
    @FindByCondition(value=TnCxlcCancelados.class, condition="ID_UNIDAD=?")
    List<TnCxlcCancelados> findByIdUnidad(java.lang.String idUnidad);
}