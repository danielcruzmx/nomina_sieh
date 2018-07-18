package gob.shcp.sireh.data.jdbc;

import gob.shcp.fsn.data.annotation.Delete;
import gob.shcp.fsn.data.annotation.FindAll;
import gob.shcp.fsn.data.annotation.FindByCondition;
import gob.shcp.fsn.data.annotation.FindById;
import gob.shcp.fsn.data.annotation.Save;
import gob.shcp.fsn.service.data.orm.JdbcDataService;

import java.util.List;

import gob.shcp.sireh.domain.jdbc.TdCxlc;

/**
 * Data access interface for TdCxlc.
 */
public interface TdCxlcDAO extends JdbcDataService {
    /**
     * Find TdCxlc entity by its identifier or primary key value.
     *
     * @param id identifier or primary key
     * @return TdCxlc
     */
    @FindById(TdCxlc.class)
    TdCxlc getById(gob.shcp.sireh.domain.jdbc.TdCxlcPK id);
    
    /**
     * Get all TdCxlc entities limited by a maximum number of elements.
     *
     * @return Collection of TdCxlc
     */
    @FindAll(TdCxlc.class)
    List<TdCxlc> findAll();
    
    /**
     * Make persistence of TdCxlc entities. If its identifier or primary key is null then create else update.
     *
     * @param entity TdCxlc
     */
    @Save
    void save(TdCxlc entity);
    
    /**
     * Remove TdCxlc entities.
     *
     * @param entity TdCxlc
     */
    @Delete
    void delete(TdCxlc entity);


    /**
     * Find the first TdCxlc entity that matches the condition 'where cxlcComplemento is equals to'.
     *
     * @param cxlcComplemento int
     * @return TdCxlc
     */
    @FindByCondition(value=TdCxlc.class, condition="CXLC_COMPLEMENTO=?")
    TdCxlc getByCxlcComplemento(int cxlcComplemento);

    /**
     * Find all TdCxlc entities that matches the condition 'where cxlcComplemento is equals to'.
     *
     * @param cxlcComplemento int
     * @return Collection of TdCxlc
     */
    @FindByCondition(value=TdCxlc.class, condition="CXLC_COMPLEMENTO=?")
    List<TdCxlc> findByCxlcComplemento(int cxlcComplemento);

    /**
     * Find the first TdCxlc entity that matches the condition 'where cxlcMonto is equals to'.
     *
     * @param cxlcMonto double
     * @return TdCxlc
     */
    @FindByCondition(value=TdCxlc.class, condition="CXLC_MONTO=?")
    TdCxlc getByCxlcMonto(double cxlcMonto);

    /**
     * Find all TdCxlc entities that matches the condition 'where cxlcMonto is equals to'.
     *
     * @param cxlcMonto double
     * @return Collection of TdCxlc
     */
    @FindByCondition(value=TdCxlc.class, condition="CXLC_MONTO=?")
    List<TdCxlc> findByCxlcMonto(double cxlcMonto);

    /**
     * Find the first TdCxlc entity that matches the condition 'where cxlcQnaPago is equals to'.
     *
     * @param cxlcQnaPago int
     * @return TdCxlc
     */
    @FindByCondition(value=TdCxlc.class, condition="CXLC_QNA_PAGO=?")
    TdCxlc getByCxlcQnaPago(int cxlcQnaPago);

    /**
     * Find all TdCxlc entities that matches the condition 'where cxlcQnaPago is equals to'.
     *
     * @param cxlcQnaPago int
     * @return Collection of TdCxlc
     */
    @FindByCondition(value=TdCxlc.class, condition="CXLC_QNA_PAGO=?")
    List<TdCxlc> findByCxlcQnaPago(int cxlcQnaPago);

    /**
     * Find the first TdCxlc entity that matches the condition 'where cxlcSiaff is equals to'.
     *
     * @param cxlcSiaff int
     * @return TdCxlc
     */
    @FindByCondition(value=TdCxlc.class, condition="CXLC_SIAFF=?")
    TdCxlc getByCxlcSiaff(int cxlcSiaff);

    /**
     * Find all TdCxlc entities that matches the condition 'where cxlcSiaff is equals to'.
     *
     * @param cxlcSiaff int
     * @return Collection of TdCxlc
     */
    @FindByCondition(value=TdCxlc.class, condition="CXLC_SIAFF=?")
    List<TdCxlc> findByCxlcSiaff(int cxlcSiaff);

    /**
     * Find the first TdCxlc entity that matches the condition 'where cxlcSituacion is equals to'.
     *
     * @param cxlcSituacion java.lang.String
     * @return TdCxlc
     */
    @FindByCondition(value=TdCxlc.class, condition="CXLC_SITUACION=?")
    TdCxlc getByCxlcSituacion(java.lang.String cxlcSituacion);

    /**
     * Find all TdCxlc entities that matches the condition 'where cxlcSituacion is equals to'.
     *
     * @param cxlcSituacion java.lang.String
     * @return Collection of TdCxlc
     */
    @FindByCondition(value=TdCxlc.class, condition="CXLC_SITUACION=?")
    List<TdCxlc> findByCxlcSituacion(java.lang.String cxlcSituacion);

    /**
     * Find the first TdCxlc entity that matches the condition 'where fecModifico is equals to'.
     *
     * @param fecModifico java.util.Date
     * @return TdCxlc
     */
    @FindByCondition(value=TdCxlc.class, condition="FEC_MODIFICO=?")
    TdCxlc getByFecModifico(java.util.Date fecModifico);

    /**
     * Find all TdCxlc entities that matches the condition 'where fecModifico is equals to'.
     *
     * @param fecModifico java.util.Date
     * @return Collection of TdCxlc
     */
    @FindByCondition(value=TdCxlc.class, condition="FEC_MODIFICO=?")
    List<TdCxlc> findByFecModifico(java.util.Date fecModifico);

    /**
     * Find the first TdCxlc entity that matches the condition 'where usuario is equals to'.
     *
     * @param usuario java.lang.String
     * @return TdCxlc
     */
    @FindByCondition(value=TdCxlc.class, condition="USUARIO=?")
    TdCxlc getByUsuario(java.lang.String usuario);

    /**
     * Find all TdCxlc entities that matches the condition 'where usuario is equals to'.
     *
     * @param usuario java.lang.String
     * @return Collection of TdCxlc
     */
    @FindByCondition(value=TdCxlc.class, condition="USUARIO=?")
    List<TdCxlc> findByUsuario(java.lang.String usuario);

    /**
     * Find the first TdCxlc entity that matches the condition 'where cxlcCompromiso is equals to'.
     *
     * @param cxlcCompromiso java.lang.Long
     * @return TdCxlc
     */
    @FindByCondition(value=TdCxlc.class, condition="CXLC_COMPROMISO=?")
    TdCxlc getByCxlcCompromiso(java.lang.Long cxlcCompromiso);

    /**
     * Find all TdCxlc entities that matches the condition 'where cxlcCompromiso is equals to'.
     *
     * @param cxlcCompromiso java.lang.Long
     * @return Collection of TdCxlc
     */
    @FindByCondition(value=TdCxlc.class, condition="CXLC_COMPROMISO=?")
    List<TdCxlc> findByCxlcCompromiso(java.lang.Long cxlcCompromiso);

    /**
     * Find the first TdCxlc entity that matches the condition 'where cxlcConciliaSicop is equals to'.
     *
     * @param cxlcConciliaSicop java.lang.Integer
     * @return TdCxlc
     */
    @FindByCondition(value=TdCxlc.class, condition="CXLC_CONCILIA_SICOP=?")
    TdCxlc getByCxlcConciliaSicop(java.lang.Integer cxlcConciliaSicop);

    /**
     * Find all TdCxlc entities that matches the condition 'where cxlcConciliaSicop is equals to'.
     *
     * @param cxlcConciliaSicop java.lang.Integer
     * @return Collection of TdCxlc
     */
    @FindByCondition(value=TdCxlc.class, condition="CXLC_CONCILIA_SICOP=?")
    List<TdCxlc> findByCxlcConciliaSicop(java.lang.Integer cxlcConciliaSicop);

    /**
     * Find the first TdCxlc entity that matches the condition 'where cxlcDevengado is equals to'.
     *
     * @param cxlcDevengado java.lang.Long
     * @return TdCxlc
     */
    @FindByCondition(value=TdCxlc.class, condition="CXLC_DEVENGADO=?")
    TdCxlc getByCxlcDevengado(java.lang.Long cxlcDevengado);

    /**
     * Find all TdCxlc entities that matches the condition 'where cxlcDevengado is equals to'.
     *
     * @param cxlcDevengado java.lang.Long
     * @return Collection of TdCxlc
     */
    @FindByCondition(value=TdCxlc.class, condition="CXLC_DEVENGADO=?")
    List<TdCxlc> findByCxlcDevengado(java.lang.Long cxlcDevengado);

    /**
     * Find the first TdCxlc entity that matches the condition 'where cxlcIva is equals to'.
     *
     * @param cxlcIva java.lang.Double
     * @return TdCxlc
     */
    @FindByCondition(value=TdCxlc.class, condition="CXLC_IVA=?")
    TdCxlc getByCxlcIva(java.lang.Double cxlcIva);

    /**
     * Find all TdCxlc entities that matches the condition 'where cxlcIva is equals to'.
     *
     * @param cxlcIva java.lang.Double
     * @return Collection of TdCxlc
     */
    @FindByCondition(value=TdCxlc.class, condition="CXLC_IVA=?")
    List<TdCxlc> findByCxlcIva(java.lang.Double cxlcIva);

    /**
     * Find the first TdCxlc entity that matches the condition 'where cxlcMaestroPto is equals to'.
     *
     * @param cxlcMaestroPto java.lang.Integer
     * @return TdCxlc
     */
    @FindByCondition(value=TdCxlc.class, condition="CXLC_MAESTRO_PTO=?")
    TdCxlc getByCxlcMaestroPto(java.lang.Integer cxlcMaestroPto);

    /**
     * Find all TdCxlc entities that matches the condition 'where cxlcMaestroPto is equals to'.
     *
     * @param cxlcMaestroPto java.lang.Integer
     * @return Collection of TdCxlc
     */
    @FindByCondition(value=TdCxlc.class, condition="CXLC_MAESTRO_PTO=?")
    List<TdCxlc> findByCxlcMaestroPto(java.lang.Integer cxlcMaestroPto);

    /**
     * Find the first TdCxlc entity that matches the condition 'where cxlcNota is equals to'.
     *
     * @param cxlcNota java.lang.String
     * @return TdCxlc
     */
    @FindByCondition(value=TdCxlc.class, condition="CXLC_NOTA=?")
    TdCxlc getByCxlcNota(java.lang.String cxlcNota);

    /**
     * Find all TdCxlc entities that matches the condition 'where cxlcNota is equals to'.
     *
     * @param cxlcNota java.lang.String
     * @return Collection of TdCxlc
     */
    @FindByCondition(value=TdCxlc.class, condition="CXLC_NOTA=?")
    List<TdCxlc> findByCxlcNota(java.lang.String cxlcNota);

    /**
     * Find the first TdCxlc entity that matches the condition 'where cxlcRectifica is equals to'.
     *
     * @param cxlcRectifica java.lang.Integer
     * @return TdCxlc
     */
    @FindByCondition(value=TdCxlc.class, condition="CXLC_RECTIFICA=?")
    TdCxlc getByCxlcRectifica(java.lang.Integer cxlcRectifica);

    /**
     * Find all TdCxlc entities that matches the condition 'where cxlcRectifica is equals to'.
     *
     * @param cxlcRectifica java.lang.Integer
     * @return Collection of TdCxlc
     */
    @FindByCondition(value=TdCxlc.class, condition="CXLC_RECTIFICA=?")
    List<TdCxlc> findByCxlcRectifica(java.lang.Integer cxlcRectifica);

    /**
     * Find the first TdCxlc entity that matches the condition 'where cxlcTipoProceso is equals to'.
     *
     * @param cxlcTipoProceso java.lang.String
     * @return TdCxlc
     */
    @FindByCondition(value=TdCxlc.class, condition="CXLC_TIPO_PROCESO=?")
    TdCxlc getByCxlcTipoProceso(java.lang.String cxlcTipoProceso);

    /**
     * Find all TdCxlc entities that matches the condition 'where cxlcTipoProceso is equals to'.
     *
     * @param cxlcTipoProceso java.lang.String
     * @return Collection of TdCxlc
     */
    @FindByCondition(value=TdCxlc.class, condition="CXLC_TIPO_PROCESO=?")
    List<TdCxlc> findByCxlcTipoProceso(java.lang.String cxlcTipoProceso);
}