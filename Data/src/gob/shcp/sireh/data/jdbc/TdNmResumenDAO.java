package gob.shcp.sireh.data.jdbc;

import gob.shcp.fsn.data.annotation.Delete;
import gob.shcp.fsn.data.annotation.FindAll;
import gob.shcp.fsn.data.annotation.FindByCondition;
import gob.shcp.fsn.data.annotation.FindById;
import gob.shcp.fsn.data.annotation.Save;
import gob.shcp.fsn.service.data.orm.JdbcDataService;

import java.util.List;

import gob.shcp.sireh.domain.jdbc.TdNmResumen;


/**
 * Data access interface for TdNmResumen.
 */
public interface TdNmResumenDAO extends JdbcDataService {
    /**
     * Find TdNmResumen entity by its identifier or primary key value.
     *
     * @param id identifier or primary key
     * @return TdNmResumen
     */
    @FindById(TdNmResumen.class)
    TdNmResumen getById(gob.shcp.sireh.domain.jdbc.TdNmResumenPK id);
    
    /**
     * Get all TdNmResumen entities limited by a maximum number of elements.
     *
     * @return Collection of TdNmResumen
     */
    @FindAll(TdNmResumen.class)
    List<TdNmResumen> findAll();
    
    /**
     * Make persistence of TdNmResumen entities. If its identifier or primary key is null then create else update.
     *
     * @param entity TdNmResumen
     */
    @Save
    void save(TdNmResumen entity);
    
    /**
     * Remove TdNmResumen entities.
     *
     * @param entity TdNmResumen
     */
    @Delete
    void delete(TdNmResumen entity);


    /**
     * Find the first TdNmResumen entity that matches the condition 'where fecModifico is equals to'.
     *
     * @param fecModifico java.util.Date
     * @return TdNmResumen
     */
    @FindByCondition(value=TdNmResumen.class, condition="FEC_MODIFICO=?")
    TdNmResumen getByFecModifico(java.util.Date fecModifico);

    /**
     * Find all TdNmResumen entities that matches the condition 'where fecModifico is equals to'.
     *
     * @param fecModifico java.util.Date
     * @return Collection of TdNmResumen
     */
    @FindByCondition(value=TdNmResumen.class, condition="FEC_MODIFICO=?")
    List<TdNmResumen> findByFecModifico(java.util.Date fecModifico);

    /**
     * Find the first TdNmResumen entity that matches the condition 'where nmrCicloFinal is equals to'.
     *
     * @param nmrCicloFinal int
     * @return TdNmResumen
     */
    @FindByCondition(value=TdNmResumen.class, condition="NMR_CICLO_FINAL=?")
    TdNmResumen getByNmrCicloFinal(int nmrCicloFinal);

    /**
     * Find all TdNmResumen entities that matches the condition 'where nmrCicloFinal is equals to'.
     *
     * @param nmrCicloFinal int
     * @return Collection of TdNmResumen
     */
    @FindByCondition(value=TdNmResumen.class, condition="NMR_CICLO_FINAL=?")
    List<TdNmResumen> findByNmrCicloFinal(int nmrCicloFinal);

    /**
     * Find the first TdNmResumen entity that matches the condition 'where nmrCicloInicial is equals to'.
     *
     * @param nmrCicloInicial int
     * @return TdNmResumen
     */
    @FindByCondition(value=TdNmResumen.class, condition="NMR_CICLO_INICIAL=?")
    TdNmResumen getByNmrCicloInicial(int nmrCicloInicial);

    /**
     * Find all TdNmResumen entities that matches the condition 'where nmrCicloInicial is equals to'.
     *
     * @param nmrCicloInicial int
     * @return Collection of TdNmResumen
     */
    @FindByCondition(value=TdNmResumen.class, condition="NMR_CICLO_INICIAL=?")
    List<TdNmResumen> findByNmrCicloInicial(int nmrCicloInicial);

    /**
     * Find the first TdNmResumen entity that matches the condition 'where usuario is equals to'.
     *
     * @param usuario java.lang.String
     * @return TdNmResumen
     */
    @FindByCondition(value=TdNmResumen.class, condition="USUARIO=?")
    TdNmResumen getByUsuario(java.lang.String usuario);

    /**
     * Find all TdNmResumen entities that matches the condition 'where usuario is equals to'.
     *
     * @param usuario java.lang.String
     * @return Collection of TdNmResumen
     */
    @FindByCondition(value=TdNmResumen.class, condition="USUARIO=?")
    List<TdNmResumen> findByUsuario(java.lang.String usuario);

    /**
     * Find the first TdNmResumen entity that matches the condition 'where nmrCausalDes is equals to'.
     *
     * @param nmrCausalDes java.lang.Integer
     * @return TdNmResumen
     */
    @FindByCondition(value=TdNmResumen.class, condition="NMR_CAUSAL_DES=?")
    TdNmResumen getByNmrCausalDes(java.lang.Integer nmrCausalDes);

    /**
     * Find all TdNmResumen entities that matches the condition 'where nmrCausalDes is equals to'.
     *
     * @param nmrCausalDes java.lang.Integer
     * @return Collection of TdNmResumen
     */
    @FindByCondition(value=TdNmResumen.class, condition="NMR_CAUSAL_DES=?")
    List<TdNmResumen> findByNmrCausalDes(java.lang.Integer nmrCausalDes);

    /**
     * Find the first TdNmResumen entity that matches the condition 'where nmrCausalOri is equals to'.
     *
     * @param nmrCausalOri java.lang.Boolean
     * @return TdNmResumen
     */
    @FindByCondition(value=TdNmResumen.class, condition="NMR_CAUSAL_ORI=?")
    TdNmResumen getByNmrCausalOri(java.lang.Boolean nmrCausalOri);

    /**
     * Find all TdNmResumen entities that matches the condition 'where nmrCausalOri is equals to'.
     *
     * @param nmrCausalOri java.lang.Boolean
     * @return Collection of TdNmResumen
     */
    @FindByCondition(value=TdNmResumen.class, condition="NMR_CAUSAL_ORI=?")
    List<TdNmResumen> findByNmrCausalOri(java.lang.Boolean nmrCausalOri);

    /**
     * Find the first TdNmResumen entity that matches the condition 'where nmrDiasPagados is equals to'.
     *
     * @param nmrDiasPagados java.lang.Integer
     * @return TdNmResumen
     */
    @FindByCondition(value=TdNmResumen.class, condition="NMR_DIAS_PAGADOS=?")
    TdNmResumen getByNmrDiasPagados(java.lang.Integer nmrDiasPagados);

    /**
     * Find all TdNmResumen entities that matches the condition 'where nmrDiasPagados is equals to'.
     *
     * @param nmrDiasPagados java.lang.Integer
     * @return Collection of TdNmResumen
     */
    @FindByCondition(value=TdNmResumen.class, condition="NMR_DIAS_PAGADOS=?")
    List<TdNmResumen> findByNmrDiasPagados(java.lang.Integer nmrDiasPagados);

    /**
     * Find the first TdNmResumen entity that matches the condition 'where nmrFecDeposito is equals to'.
     *
     * @param nmrFecDeposito java.util.Date
     * @return TdNmResumen
     */
    @FindByCondition(value=TdNmResumen.class, condition="NMR_FEC_DEPOSITO=?")
    TdNmResumen getByNmrFecDeposito(java.util.Date nmrFecDeposito);

    /**
     * Find all TdNmResumen entities that matches the condition 'where nmrFecDeposito is equals to'.
     *
     * @param nmrFecDeposito java.util.Date
     * @return Collection of TdNmResumen
     */
    @FindByCondition(value=TdNmResumen.class, condition="NMR_FEC_DEPOSITO=?")
    List<TdNmResumen> findByNmrFecDeposito(java.util.Date nmrFecDeposito);

    /**
     * Find the first TdNmResumen entity that matches the condition 'where nmrFecEnvio is equals to'.
     *
     * @param nmrFecEnvio java.util.Date
     * @return TdNmResumen
     */
    @FindByCondition(value=TdNmResumen.class, condition="NMR_FEC_ENVIO=?")
    TdNmResumen getByNmrFecEnvio(java.util.Date nmrFecEnvio);

    /**
     * Find all TdNmResumen entities that matches the condition 'where nmrFecEnvio is equals to'.
     *
     * @param nmrFecEnvio java.util.Date
     * @return Collection of TdNmResumen
     */
    @FindByCondition(value=TdNmResumen.class, condition="NMR_FEC_ENVIO=?")
    List<TdNmResumen> findByNmrFecEnvio(java.util.Date nmrFecEnvio);

    /**
     * Find the first TdNmResumen entity that matches the condition 'where nmrImpteBruto is equals to'.
     *
     * @param nmrImpteBruto java.lang.Double
     * @return TdNmResumen
     */
    @FindByCondition(value=TdNmResumen.class, condition="NMR_IMPTE_BRUTO=?")
    TdNmResumen getByNmrImpteBruto(java.lang.Double nmrImpteBruto);

    /**
     * Find all TdNmResumen entities that matches the condition 'where nmrImpteBruto is equals to'.
     *
     * @param nmrImpteBruto java.lang.Double
     * @return Collection of TdNmResumen
     */
    @FindByCondition(value=TdNmResumen.class, condition="NMR_IMPTE_BRUTO=?")
    List<TdNmResumen> findByNmrImpteBruto(java.lang.Double nmrImpteBruto);

    /**
     * Find the first TdNmResumen entity that matches the condition 'where nmrImpteIsr is equals to'.
     *
     * @param nmrImpteIsr java.lang.Double
     * @return TdNmResumen
     */
    @FindByCondition(value=TdNmResumen.class, condition="NMR_IMPTE_ISR=?")
    TdNmResumen getByNmrImpteIsr(java.lang.Double nmrImpteIsr);

    /**
     * Find all TdNmResumen entities that matches the condition 'where nmrImpteIsr is equals to'.
     *
     * @param nmrImpteIsr java.lang.Double
     * @return Collection of TdNmResumen
     */
    @FindByCondition(value=TdNmResumen.class, condition="NMR_IMPTE_ISR=?")
    List<TdNmResumen> findByNmrImpteIsr(java.lang.Double nmrImpteIsr);

    /**
     * Find the first TdNmResumen entity that matches the condition 'where nmrImpteNeto is equals to'.
     *
     * @param nmrImpteNeto java.lang.Double
     * @return TdNmResumen
     */
    @FindByCondition(value=TdNmResumen.class, condition="NMR_IMPTE_NETO=?")
    TdNmResumen getByNmrImpteNeto(java.lang.Double nmrImpteNeto);

    /**
     * Find all TdNmResumen entities that matches the condition 'where nmrImpteNeto is equals to'.
     *
     * @param nmrImpteNeto java.lang.Double
     * @return Collection of TdNmResumen
     */
    @FindByCondition(value=TdNmResumen.class, condition="NMR_IMPTE_NETO=?")
    List<TdNmResumen> findByNmrImpteNeto(java.lang.Double nmrImpteNeto);

    /**
     * Find the first TdNmResumen entity that matches the condition 'where nmrImptePension is equals to'.
     *
     * @param nmrImptePension java.lang.Double
     * @return TdNmResumen
     */
    @FindByCondition(value=TdNmResumen.class, condition="NMR_IMPTE_PENSION=?")
    TdNmResumen getByNmrImptePension(java.lang.Double nmrImptePension);

    /**
     * Find all TdNmResumen entities that matches the condition 'where nmrImptePension is equals to'.
     *
     * @param nmrImptePension java.lang.Double
     * @return Collection of TdNmResumen
     */
    @FindByCondition(value=TdNmResumen.class, condition="NMR_IMPTE_PENSION=?")
    List<TdNmResumen> findByNmrImptePension(java.lang.Double nmrImptePension);

    /**
     * Find the first TdNmResumen entity that matches the condition 'where nmrOficEnvio is equals to'.
     *
     * @param nmrOficEnvio java.lang.String
     * @return TdNmResumen
     */
    @FindByCondition(value=TdNmResumen.class, condition="NMR_OFIC_ENVIO=?")
    TdNmResumen getByNmrOficEnvio(java.lang.String nmrOficEnvio);

    /**
     * Find all TdNmResumen entities that matches the condition 'where nmrOficEnvio is equals to'.
     *
     * @param nmrOficEnvio java.lang.String
     * @return Collection of TdNmResumen
     */
    @FindByCondition(value=TdNmResumen.class, condition="NMR_OFIC_ENVIO=?")
    List<TdNmResumen> findByNmrOficEnvio(java.lang.String nmrOficEnvio);

    /**
     * Find the first TdNmResumen entity that matches the condition 'where nmrOp is equals to'.
     *
     * @param nmrOp java.lang.String
     * @return TdNmResumen
     */
    @FindByCondition(value=TdNmResumen.class, condition="NMR_OP=?")
    TdNmResumen getByNmrOp(java.lang.String nmrOp);

    /**
     * Find all TdNmResumen entities that matches the condition 'where nmrOp is equals to'.
     *
     * @param nmrOp java.lang.String
     * @return Collection of TdNmResumen
     */
    @FindByCondition(value=TdNmResumen.class, condition="NMR_OP=?")
    List<TdNmResumen> findByNmrOp(java.lang.String nmrOp);

    /**
     * Find the first TdNmResumen entity that matches the condition 'where nmrReferencia is equals to'.
     *
     * @param nmrReferencia java.lang.String
     * @return TdNmResumen
     */
    @FindByCondition(value=TdNmResumen.class, condition="NMR_REFERENCIA=?")
    TdNmResumen getByNmrReferencia(java.lang.String nmrReferencia);

    /**
     * Find all TdNmResumen entities that matches the condition 'where nmrReferencia is equals to'.
     *
     * @param nmrReferencia java.lang.String
     * @return Collection of TdNmResumen
     */
    @FindByCondition(value=TdNmResumen.class, condition="NMR_REFERENCIA=?")
    List<TdNmResumen> findByNmrReferencia(java.lang.String nmrReferencia);

    /**
     * Find the first TdNmResumen entity that matches the condition 'where nmrRemesaInterna is equals to'.
     *
     * @param nmrRemesaInterna java.lang.String
     * @return TdNmResumen
     */
    @FindByCondition(value=TdNmResumen.class, condition="NMR_REMESA_INTERNA=?")
    TdNmResumen getByNmrRemesaInterna(java.lang.String nmrRemesaInterna);

    /**
     * Find all TdNmResumen entities that matches the condition 'where nmrRemesaInterna is equals to'.
     *
     * @param nmrRemesaInterna java.lang.String
     * @return Collection of TdNmResumen
     */
    @FindByCondition(value=TdNmResumen.class, condition="NMR_REMESA_INTERNA=?")
    List<TdNmResumen> findByNmrRemesaInterna(java.lang.String nmrRemesaInterna);
}