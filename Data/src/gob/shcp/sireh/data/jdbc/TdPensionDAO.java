package gob.shcp.sireh.data.jdbc;

import gob.shcp.fsn.data.annotation.Delete;
import gob.shcp.fsn.data.annotation.FindAll;
import gob.shcp.fsn.data.annotation.FindByCondition;
import gob.shcp.fsn.data.annotation.FindById;
import gob.shcp.fsn.data.annotation.Save;
import gob.shcp.fsn.service.data.orm.JdbcDataService;

import java.util.List;

import gob.shcp.sireh.domain.jdbc.TdPension;


/**
 * Data access interface for TdPension.
 */
public interface TdPensionDAO extends JdbcDataService {
    /**
     * Find TdPension entity by its identifier or primary key value.
     *
     * @param id identifier or primary key
     * @return TdPension
     */
    @FindById(TdPension.class)
    TdPension getById(java.lang.Integer id);
    
    /**
     * Get all TdPension entities limited by a maximum number of elements.
     *
     * @return Collection of TdPension
     */
    @FindAll(TdPension.class)
    List<TdPension> findAll();
    
    /**
     * Make persistence of TdPension entities. If its identifier or primary key is null then create else update.
     *
     * @param entity TdPension
     */
    @Save
    void save(TdPension entity);
    
    /**
     * Remove TdPension entities.
     *
     * @param entity TdPension
     */
    @Delete
    void delete(TdPension entity);


    /**
     * Find the first TdPension entity that matches the condition 'where numPension is equals to'.
     *
     * @param numPension int
     * @return TdPension
     */
    @FindByCondition(value=TdPension.class, condition="NUM_PENSION=?")
    TdPension getByNumPension(int numPension);

    /**
     * Find all TdPension entities that matches the condition 'where numPension is equals to'.
     *
     * @param numPension int
     * @return Collection of TdPension
     */
    @FindByCondition(value=TdPension.class, condition="NUM_PENSION=?")
    List<TdPension> findByNumPension(int numPension);

    /**
     * Find the first TdPension entity that matches the condition 'where beneficiariaPension is equals to'.
     *
     * @param beneficiariaPension java.lang.String
     * @return TdPension
     */
    @FindByCondition(value=TdPension.class, condition="BENEFICIARIA_PENSION=?")
    TdPension getByBeneficiariaPension(java.lang.String beneficiariaPension);

    /**
     * Find all TdPension entities that matches the condition 'where beneficiariaPension is equals to'.
     *
     * @param beneficiariaPension java.lang.String
     * @return Collection of TdPension
     */
    @FindByCondition(value=TdPension.class, condition="BENEFICIARIA_PENSION=?")
    List<TdPension> findByBeneficiariaPension(java.lang.String beneficiariaPension);

    /**
     * Find the first TdPension entity that matches the condition 'where clabePension is equals to'.
     *
     * @param clabePension java.lang.String
     * @return TdPension
     */
    @FindByCondition(value=TdPension.class, condition="CLABE_PENSION=?")
    TdPension getByClabePension(java.lang.String clabePension);

    /**
     * Find all TdPension entities that matches the condition 'where clabePension is equals to'.
     *
     * @param clabePension java.lang.String
     * @return Collection of TdPension
     */
    @FindByCondition(value=TdPension.class, condition="CLABE_PENSION=?")
    List<TdPension> findByClabePension(java.lang.String clabePension);

    /**
     * Find the first TdPension entity that matches the condition 'where cptosPorcentaje is equals to'.
     *
     * @param cptosPorcentaje java.lang.String
     * @return TdPension
     */
    @FindByCondition(value=TdPension.class, condition="CPTOS_PORCENTAJE=?")
    TdPension getByCptosPorcentaje(java.lang.String cptosPorcentaje);

    /**
     * Find all TdPension entities that matches the condition 'where cptosPorcentaje is equals to'.
     *
     * @param cptosPorcentaje java.lang.String
     * @return Collection of TdPension
     */
    @FindByCondition(value=TdPension.class, condition="CPTOS_PORCENTAJE=?")
    List<TdPension> findByCptosPorcentaje(java.lang.String cptosPorcentaje);

    /**
     * Find the first TdPension entity that matches the condition 'where fecModifico is equals to'.
     *
     * @param fecModifico java.util.Date
     * @return TdPension
     */
    @FindByCondition(value=TdPension.class, condition="FEC_MODIFICO=?")
    TdPension getByFecModifico(java.util.Date fecModifico);

    /**
     * Find all TdPension entities that matches the condition 'where fecModifico is equals to'.
     *
     * @param fecModifico java.util.Date
     * @return Collection of TdPension
     */
    @FindByCondition(value=TdPension.class, condition="FEC_MODIFICO=?")
    List<TdPension> findByFecModifico(java.util.Date fecModifico);

    /**
     * Find the first TdPension entity that matches the condition 'where idZonaDist is equals to'.
     *
     * @param idZonaDist java.lang.Integer
     * @return TdPension
     */
    @FindByCondition(value=TdPension.class, condition="ID_ZONA_DIST=?")
    TdPension getByIdZonaDist(java.lang.Integer idZonaDist);

    /**
     * Find all TdPension entities that matches the condition 'where idZonaDist is equals to'.
     *
     * @param idZonaDist java.lang.Integer
     * @return Collection of TdPension
     */
    @FindByCondition(value=TdPension.class, condition="ID_ZONA_DIST=?")
    List<TdPension> findByIdZonaDist(java.lang.Integer idZonaDist);

    /**
     * Find the first TdPension entity that matches the condition 'where montoAdeudo is equals to'.
     *
     * @param montoAdeudo java.lang.Double
     * @return TdPension
     */
    @FindByCondition(value=TdPension.class, condition="MONTO_ADEUDO=?")
    TdPension getByMontoAdeudo(java.lang.Double montoAdeudo);

    /**
     * Find all TdPension entities that matches the condition 'where montoAdeudo is equals to'.
     *
     * @param montoAdeudo java.lang.Double
     * @return Collection of TdPension
     */
    @FindByCondition(value=TdPension.class, condition="MONTO_ADEUDO=?")
    List<TdPension> findByMontoAdeudo(java.lang.Double montoAdeudo);

    /**
     * Find the first TdPension entity that matches the condition 'where montoPension is equals to'.
     *
     * @param montoPension java.lang.Double
     * @return TdPension
     */
    @FindByCondition(value=TdPension.class, condition="MONTO_PENSION=?")
    TdPension getByMontoPension(java.lang.Double montoPension);

    /**
     * Find all TdPension entities that matches the condition 'where montoPension is equals to'.
     *
     * @param montoPension java.lang.Double
     * @return Collection of TdPension
     */
    @FindByCondition(value=TdPension.class, condition="MONTO_PENSION=?")
    List<TdPension> findByMontoPension(java.lang.Double montoPension);

    /**
     * Find the first TdPension entity that matches the condition 'where porcentajePension is equals to'.
     *
     * @param porcentajePension java.lang.Float
     * @return TdPension
     */
    @FindByCondition(value=TdPension.class, condition="PORCENTAJE_PENSION=?")
    TdPension getByPorcentajePension(java.lang.Float porcentajePension);

    /**
     * Find all TdPension entities that matches the condition 'where porcentajePension is equals to'.
     *
     * @param porcentajePension java.lang.Float
     * @return Collection of TdPension
     */
    @FindByCondition(value=TdPension.class, condition="PORCENTAJE_PENSION=?")
    List<TdPension> findByPorcentajePension(java.lang.Float porcentajePension);

    /**
     * Find the first TdPension entity that matches the condition 'where qnaAplicaAdeudo is equals to'.
     *
     * @param qnaAplicaAdeudo java.lang.Integer
     * @return TdPension
     */
    @FindByCondition(value=TdPension.class, condition="QNA_APLICA_ADEUDO=?")
    TdPension getByQnaAplicaAdeudo(java.lang.Integer qnaAplicaAdeudo);

    /**
     * Find all TdPension entities that matches the condition 'where qnaAplicaAdeudo is equals to'.
     *
     * @param qnaAplicaAdeudo java.lang.Integer
     * @return Collection of TdPension
     */
    @FindByCondition(value=TdPension.class, condition="QNA_APLICA_ADEUDO=?")
    List<TdPension> findByQnaAplicaAdeudo(java.lang.Integer qnaAplicaAdeudo);

    /**
     * Find the first TdPension entity that matches the condition 'where qnaCapturaAdeudo is equals to'.
     *
     * @param qnaCapturaAdeudo java.lang.Integer
     * @return TdPension
     */
    @FindByCondition(value=TdPension.class, condition="QNA_CAPTURA_ADEUDO=?")
    TdPension getByQnaCapturaAdeudo(java.lang.Integer qnaCapturaAdeudo);

    /**
     * Find all TdPension entities that matches the condition 'where qnaCapturaAdeudo is equals to'.
     *
     * @param qnaCapturaAdeudo java.lang.Integer
     * @return Collection of TdPension
     */
    @FindByCondition(value=TdPension.class, condition="QNA_CAPTURA_ADEUDO=?")
    List<TdPension> findByQnaCapturaAdeudo(java.lang.Integer qnaCapturaAdeudo);

    /**
     * Find the first TdPension entity that matches the condition 'where qnaCapturaPension is equals to'.
     *
     * @param qnaCapturaPension java.lang.Integer
     * @return TdPension
     */
    @FindByCondition(value=TdPension.class, condition="QNA_CAPTURA_PENSION=?")
    TdPension getByQnaCapturaPension(java.lang.Integer qnaCapturaPension);

    /**
     * Find all TdPension entities that matches the condition 'where qnaCapturaPension is equals to'.
     *
     * @param qnaCapturaPension java.lang.Integer
     * @return Collection of TdPension
     */
    @FindByCondition(value=TdPension.class, condition="QNA_CAPTURA_PENSION=?")
    List<TdPension> findByQnaCapturaPension(java.lang.Integer qnaCapturaPension);

    /**
     * Find the first TdPension entity that matches the condition 'where qnaDescAdeudo is equals to'.
     *
     * @param qnaDescAdeudo java.lang.Integer
     * @return TdPension
     */
    @FindByCondition(value=TdPension.class, condition="QNA_DESC_ADEUDO=?")
    TdPension getByQnaDescAdeudo(java.lang.Integer qnaDescAdeudo);

    /**
     * Find all TdPension entities that matches the condition 'where qnaDescAdeudo is equals to'.
     *
     * @param qnaDescAdeudo java.lang.Integer
     * @return Collection of TdPension
     */
    @FindByCondition(value=TdPension.class, condition="QNA_DESC_ADEUDO=?")
    List<TdPension> findByQnaDescAdeudo(java.lang.Integer qnaDescAdeudo);

    /**
     * Find the first TdPension entity that matches the condition 'where referenciaPension is equals to'.
     *
     * @param referenciaPension java.lang.String
     * @return TdPension
     */
    @FindByCondition(value=TdPension.class, condition="REFERENCIA_PENSION=?")
    TdPension getByReferenciaPension(java.lang.String referenciaPension);

    /**
     * Find all TdPension entities that matches the condition 'where referenciaPension is equals to'.
     *
     * @param referenciaPension java.lang.String
     * @return Collection of TdPension
     */
    @FindByCondition(value=TdPension.class, condition="REFERENCIA_PENSION=?")
    List<TdPension> findByReferenciaPension(java.lang.String referenciaPension);

    /**
     * Find the first TdPension entity that matches the condition 'where refAdeudoPension is equals to'.
     *
     * @param refAdeudoPension java.lang.String
     * @return TdPension
     */
    @FindByCondition(value=TdPension.class, condition="REF_ADEUDO_PENSION=?")
    TdPension getByRefAdeudoPension(java.lang.String refAdeudoPension);

    /**
     * Find all TdPension entities that matches the condition 'where refAdeudoPension is equals to'.
     *
     * @param refAdeudoPension java.lang.String
     * @return Collection of TdPension
     */
    @FindByCondition(value=TdPension.class, condition="REF_ADEUDO_PENSION=?")
    List<TdPension> findByRefAdeudoPension(java.lang.String refAdeudoPension);

    /**
     * Find the first TdPension entity that matches the condition 'where rfcPension is equals to'.
     *
     * @param rfcPension java.lang.String
     * @return TdPension
     */
    @FindByCondition(value=TdPension.class, condition="RFC_PENSION=?")
    TdPension getByRfcPension(java.lang.String rfcPension);

    /**
     * Find all TdPension entities that matches the condition 'where rfcPension is equals to'.
     *
     * @param rfcPension java.lang.String
     * @return Collection of TdPension
     */
    @FindByCondition(value=TdPension.class, condition="RFC_PENSION=?")
    List<TdPension> findByRfcPension(java.lang.String rfcPension);

    /**
     * Find the first TdPension entity that matches the condition 'where statusPension is equals to'.
     *
     * @param statusPension java.lang.String
     * @return TdPension
     */
    @FindByCondition(value=TdPension.class, condition="STATUS_PENSION=?")
    TdPension getByStatusPension(java.lang.String statusPension);

    /**
     * Find all TdPension entities that matches the condition 'where statusPension is equals to'.
     *
     * @param statusPension java.lang.String
     * @return Collection of TdPension
     */
    @FindByCondition(value=TdPension.class, condition="STATUS_PENSION=?")
    List<TdPension> findByStatusPension(java.lang.String statusPension);

    /**
     * Find the first TdPension entity that matches the condition 'where ultQnaProcesaAdeudo is equals to'.
     *
     * @param ultQnaProcesaAdeudo java.lang.Integer
     * @return TdPension
     */
    @FindByCondition(value=TdPension.class, condition="ULT_QNA_PROCESA_ADEUDO=?")
    TdPension getByUltQnaProcesaAdeudo(java.lang.Integer ultQnaProcesaAdeudo);

    /**
     * Find all TdPension entities that matches the condition 'where ultQnaProcesaAdeudo is equals to'.
     *
     * @param ultQnaProcesaAdeudo java.lang.Integer
     * @return Collection of TdPension
     */
    @FindByCondition(value=TdPension.class, condition="ULT_QNA_PROCESA_ADEUDO=?")
    List<TdPension> findByUltQnaProcesaAdeudo(java.lang.Integer ultQnaProcesaAdeudo);

    /**
     * Find the first TdPension entity that matches the condition 'where usuario is equals to'.
     *
     * @param usuario java.lang.String
     * @return TdPension
     */
    @FindByCondition(value=TdPension.class, condition="USUARIO=?")
    TdPension getByUsuario(java.lang.String usuario);

    /**
     * Find all TdPension entities that matches the condition 'where usuario is equals to'.
     *
     * @param usuario java.lang.String
     * @return Collection of TdPension
     */
    @FindByCondition(value=TdPension.class, condition="USUARIO=?")
    List<TdPension> findByUsuario(java.lang.String usuario);
}