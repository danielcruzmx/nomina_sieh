package gob.shcp.sireh.data.jdbc;

import gob.shcp.fsn.data.annotation.Delete;
import gob.shcp.fsn.data.annotation.FindAll;
import gob.shcp.fsn.data.annotation.FindByCondition;
import gob.shcp.fsn.data.annotation.FindById;
import gob.shcp.fsn.data.annotation.Save;
import gob.shcp.fsn.service.data.orm.JdbcDataService;

import java.util.List;

import gob.shcp.sireh.domain.jdbc.TnCapturaPagoCanc;


/**
 * Data access interface for TnCapturaPagoCanc.
 */
public interface TnCapturaPagoCancDAO extends JdbcDataService {
    /**
     * Find TnCapturaPagoCanc entity by its identifier or primary key value.
     *
     * @param id identifier or primary key
     * @return TnCapturaPagoCanc
     */
    @FindById(TnCapturaPagoCanc.class)
    TnCapturaPagoCanc getById(gob.shcp.sireh.domain.jdbc.TnCapturaPagoCancPK id);
    
    /**
     * Get all TnCapturaPagoCanc entities limited by a maximum number of elements.
     *
     * @return Collection of TnCapturaPagoCanc
     */
    @FindAll(TnCapturaPagoCanc.class)
    List<TnCapturaPagoCanc> findAll();
    
    /**
     * Make persistence of TnCapturaPagoCanc entities. If its identifier or primary key is null then create else update.
     *
     * @param entity TnCapturaPagoCanc
     */
    @Save
    void save(TnCapturaPagoCanc entity);
    
    /**
     * Remove TnCapturaPagoCanc entities.
     *
     * @param entity TnCapturaPagoCanc
     */
    @Delete
    void delete(TnCapturaPagoCanc entity);


    /**
     * Find the first TnCapturaPagoCanc entity that matches the condition 'where cpcAtentaNota is equals to'.
     *
     * @param cpcAtentaNota java.lang.String
     * @return TnCapturaPagoCanc
     */
    @FindByCondition(value=TnCapturaPagoCanc.class, condition="CPC_ATENTA_NOTA=?")
    TnCapturaPagoCanc getByCpcAtentaNota(java.lang.String cpcAtentaNota);

    /**
     * Find all TnCapturaPagoCanc entities that matches the condition 'where cpcAtentaNota is equals to'.
     *
     * @param cpcAtentaNota java.lang.String
     * @return Collection of TnCapturaPagoCanc
     */
    @FindByCondition(value=TnCapturaPagoCanc.class, condition="CPC_ATENTA_NOTA=?")
    List<TnCapturaPagoCanc> findByCpcAtentaNota(java.lang.String cpcAtentaNota);

    /**
     * Find the first TnCapturaPagoCanc entity that matches the condition 'where cpcNumCxlcDgap is equals to'.
     *
     * @param cpcNumCxlcDgap java.lang.Integer
     * @return TnCapturaPagoCanc
     */
    @FindByCondition(value=TnCapturaPagoCanc.class, condition="CPC_NUM_CXLC_DGAP=?")
    TnCapturaPagoCanc getByCpcNumCxlcDgap(java.lang.Integer cpcNumCxlcDgap);

    /**
     * Find all TnCapturaPagoCanc entities that matches the condition 'where cpcNumCxlcDgap is equals to'.
     *
     * @param cpcNumCxlcDgap java.lang.Integer
     * @return Collection of TnCapturaPagoCanc
     */
    @FindByCondition(value=TnCapturaPagoCanc.class, condition="CPC_NUM_CXLC_DGAP=?")
    List<TnCapturaPagoCanc> findByCpcNumCxlcDgap(java.lang.Integer cpcNumCxlcDgap);

    /**
     * Find the first TnCapturaPagoCanc entity that matches the condition 'where cpcQnaAplica is equals to'.
     *
     * @param cpcQnaAplica java.lang.Integer
     * @return TnCapturaPagoCanc
     */
    @FindByCondition(value=TnCapturaPagoCanc.class, condition="CPC_QNA_APLICA=?")
    TnCapturaPagoCanc getByCpcQnaAplica(java.lang.Integer cpcQnaAplica);

    /**
     * Find all TnCapturaPagoCanc entities that matches the condition 'where cpcQnaAplica is equals to'.
     *
     * @param cpcQnaAplica java.lang.Integer
     * @return Collection of TnCapturaPagoCanc
     */
    @FindByCondition(value=TnCapturaPagoCanc.class, condition="CPC_QNA_APLICA=?")
    List<TnCapturaPagoCanc> findByCpcQnaAplica(java.lang.Integer cpcQnaAplica);

    /**
     * Find the first TnCapturaPagoCanc entity that matches the condition 'where cpcQnaCaptura is equals to'.
     *
     * @param cpcQnaCaptura java.lang.Integer
     * @return TnCapturaPagoCanc
     */
    @FindByCondition(value=TnCapturaPagoCanc.class, condition="CPC_QNA_CAPTURA=?")
    TnCapturaPagoCanc getByCpcQnaCaptura(java.lang.Integer cpcQnaCaptura);

    /**
     * Find all TnCapturaPagoCanc entities that matches the condition 'where cpcQnaCaptura is equals to'.
     *
     * @param cpcQnaCaptura java.lang.Integer
     * @return Collection of TnCapturaPagoCanc
     */
    @FindByCondition(value=TnCapturaPagoCanc.class, condition="CPC_QNA_CAPTURA=?")
    List<TnCapturaPagoCanc> findByCpcQnaCaptura(java.lang.Integer cpcQnaCaptura);

    /**
     * Find the first TnCapturaPagoCanc entity that matches the condition 'where cpcReferencia is equals to'.
     *
     * @param cpcReferencia java.lang.String
     * @return TnCapturaPagoCanc
     */
    @FindByCondition(value=TnCapturaPagoCanc.class, condition="CPC_REFERENCIA=?")
    TnCapturaPagoCanc getByCpcReferencia(java.lang.String cpcReferencia);

    /**
     * Find all TnCapturaPagoCanc entities that matches the condition 'where cpcReferencia is equals to'.
     *
     * @param cpcReferencia java.lang.String
     * @return Collection of TnCapturaPagoCanc
     */
    @FindByCondition(value=TnCapturaPagoCanc.class, condition="CPC_REFERENCIA=?")
    List<TnCapturaPagoCanc> findByCpcReferencia(java.lang.String cpcReferencia);

    /**
     * Find the first TnCapturaPagoCanc entity that matches the condition 'where fecModifico is equals to'.
     *
     * @param fecModifico java.util.Date
     * @return TnCapturaPagoCanc
     */
    @FindByCondition(value=TnCapturaPagoCanc.class, condition="FEC_MODIFICO=?")
    TnCapturaPagoCanc getByFecModifico(java.util.Date fecModifico);

    /**
     * Find all TnCapturaPagoCanc entities that matches the condition 'where fecModifico is equals to'.
     *
     * @param fecModifico java.util.Date
     * @return Collection of TnCapturaPagoCanc
     */
    @FindByCondition(value=TnCapturaPagoCanc.class, condition="FEC_MODIFICO=?")
    List<TnCapturaPagoCanc> findByFecModifico(java.util.Date fecModifico);

    /**
     * Find the first TnCapturaPagoCanc entity that matches the condition 'where usuario is equals to'.
     *
     * @param usuario java.lang.String
     * @return TnCapturaPagoCanc
     */
    @FindByCondition(value=TnCapturaPagoCanc.class, condition="USUARIO=?")
    TnCapturaPagoCanc getByUsuario(java.lang.String usuario);

    /**
     * Find all TnCapturaPagoCanc entities that matches the condition 'where usuario is equals to'.
     *
     * @param usuario java.lang.String
     * @return Collection of TnCapturaPagoCanc
     */
    @FindByCondition(value=TnCapturaPagoCanc.class, condition="USUARIO=?")
    List<TnCapturaPagoCanc> findByUsuario(java.lang.String usuario);
}