package gob.shcp.sireh.data.jdbc;

import gob.shcp.fsn.data.annotation.Delete;
import gob.shcp.fsn.data.annotation.FindAll;
import gob.shcp.fsn.data.annotation.FindByCondition;
import gob.shcp.fsn.data.annotation.FindById;
import gob.shcp.fsn.data.annotation.Save;
import gob.shcp.fsn.service.data.orm.JdbcDataService;

import java.util.List;

import gob.shcp.sireh.domain.jdbc.TnMovtoConceptoPago;


/**
 * Data access interface for TnMovtoConceptoPago.
 */
public interface TnMovtoConceptoPagoDAO extends JdbcDataService {
    /**
     * Find TnMovtoConceptoPago entity by its identifier or primary key value.
     *
     * @param id identifier or primary key
     * @return TnMovtoConceptoPago
     */
    @FindById(TnMovtoConceptoPago.class)
    TnMovtoConceptoPago getById(java.lang.Long id);
    
    /**
     * Get all TnMovtoConceptoPago entities limited by a maximum number of elements.
     *
     * @return Collection of TnMovtoConceptoPago
     */
    @FindAll(TnMovtoConceptoPago.class)
    List<TnMovtoConceptoPago> findAll();
    
    /**
     * Make persistence of TnMovtoConceptoPago entities. If its identifier or primary key is null then create else update.
     *
     * @param entity TnMovtoConceptoPago
     */
    @Save
    void save(TnMovtoConceptoPago entity);
    
    /**
     * Remove TnMovtoConceptoPago entities.
     *
     * @param entity TnMovtoConceptoPago
     */
    @Delete
    void delete(TnMovtoConceptoPago entity);


    /**
     * Find the first TnMovtoConceptoPago entity that matches the condition 'where fecFinAdeudo is equals to'.
     *
     * @param fecFinAdeudo java.util.Date
     * @return TnMovtoConceptoPago
     */
    @FindByCondition(value=TnMovtoConceptoPago.class, condition="FEC_FIN_ADEUDO=?")
    TnMovtoConceptoPago getByFecFinAdeudo(java.util.Date fecFinAdeudo);

    /**
     * Find all TnMovtoConceptoPago entities that matches the condition 'where fecFinAdeudo is equals to'.
     *
     * @param fecFinAdeudo java.util.Date
     * @return Collection of TnMovtoConceptoPago
     */
    @FindByCondition(value=TnMovtoConceptoPago.class, condition="FEC_FIN_ADEUDO=?")
    List<TnMovtoConceptoPago> findByFecFinAdeudo(java.util.Date fecFinAdeudo);

    /**
     * Find the first TnMovtoConceptoPago entity that matches the condition 'where fecIncidencia is equals to'.
     *
     * @param fecIncidencia java.util.Date
     * @return TnMovtoConceptoPago
     */
    @FindByCondition(value=TnMovtoConceptoPago.class, condition="FEC_INCIDENCIA=?")
    TnMovtoConceptoPago getByFecIncidencia(java.util.Date fecIncidencia);

    /**
     * Find all TnMovtoConceptoPago entities that matches the condition 'where fecIncidencia is equals to'.
     *
     * @param fecIncidencia java.util.Date
     * @return Collection of TnMovtoConceptoPago
     */
    @FindByCondition(value=TnMovtoConceptoPago.class, condition="FEC_INCIDENCIA=?")
    List<TnMovtoConceptoPago> findByFecIncidencia(java.util.Date fecIncidencia);

    /**
     * Find the first TnMovtoConceptoPago entity that matches the condition 'where fecIniAdeudo is equals to'.
     *
     * @param fecIniAdeudo java.util.Date
     * @return TnMovtoConceptoPago
     */
    @FindByCondition(value=TnMovtoConceptoPago.class, condition="FEC_INI_ADEUDO=?")
    TnMovtoConceptoPago getByFecIniAdeudo(java.util.Date fecIniAdeudo);

    /**
     * Find all TnMovtoConceptoPago entities that matches the condition 'where fecIniAdeudo is equals to'.
     *
     * @param fecIniAdeudo java.util.Date
     * @return Collection of TnMovtoConceptoPago
     */
    @FindByCondition(value=TnMovtoConceptoPago.class, condition="FEC_INI_ADEUDO=?")
    List<TnMovtoConceptoPago> findByFecIniAdeudo(java.util.Date fecIniAdeudo);

    /**
     * Find the first TnMovtoConceptoPago entity that matches the condition 'where fecModifico is equals to'.
     *
     * @param fecModifico java.util.Date
     * @return TnMovtoConceptoPago
     */
    @FindByCondition(value=TnMovtoConceptoPago.class, condition="FEC_MODIFICO=?")
    TnMovtoConceptoPago getByFecModifico(java.util.Date fecModifico);

    /**
     * Find all TnMovtoConceptoPago entities that matches the condition 'where fecModifico is equals to'.
     *
     * @param fecModifico java.util.Date
     * @return Collection of TnMovtoConceptoPago
     */
    @FindByCondition(value=TnMovtoConceptoPago.class, condition="FEC_MODIFICO=?")
    List<TnMovtoConceptoPago> findByFecModifico(java.util.Date fecModifico);

    /**
     * Find the first TnMovtoConceptoPago entity that matches the condition 'where horasDias is equals to'.
     *
     * @param horasDias java.math.BigDecimal
     * @return TnMovtoConceptoPago
     */
    @FindByCondition(value=TnMovtoConceptoPago.class, condition="HORAS_DIAS=?")
    TnMovtoConceptoPago getByHorasDias(java.math.BigDecimal horasDias);

    /**
     * Find all TnMovtoConceptoPago entities that matches the condition 'where horasDias is equals to'.
     *
     * @param horasDias java.math.BigDecimal
     * @return Collection of TnMovtoConceptoPago
     */
    @FindByCondition(value=TnMovtoConceptoPago.class, condition="HORAS_DIAS=?")
    List<TnMovtoConceptoPago> findByHorasDias(java.math.BigDecimal horasDias);

    /**
     * Find the first TnMovtoConceptoPago entity that matches the condition 'where idConcepto is equals to'.
     *
     * @param idConcepto java.lang.String
     * @return TnMovtoConceptoPago
     */
    @FindByCondition(value=TnMovtoConceptoPago.class, condition="ID_CONCEPTO=?")
    TnMovtoConceptoPago getByIdConcepto(java.lang.String idConcepto);

    /**
     * Find all TnMovtoConceptoPago entities that matches the condition 'where idConcepto is equals to'.
     *
     * @param idConcepto java.lang.String
     * @return Collection of TnMovtoConceptoPago
     */
    @FindByCondition(value=TnMovtoConceptoPago.class, condition="ID_CONCEPTO=?")
    List<TnMovtoConceptoPago> findByIdConcepto(java.lang.String idConcepto);

    /**
     * Find the first TnMovtoConceptoPago entity that matches the condition 'where idSitCaptura is equals to'.
     *
     * @param idSitCaptura java.lang.String
     * @return TnMovtoConceptoPago
     */
    @FindByCondition(value=TnMovtoConceptoPago.class, condition="ID_SIT_CAPTURA=?")
    TnMovtoConceptoPago getByIdSitCaptura(java.lang.String idSitCaptura);

    /**
     * Find all TnMovtoConceptoPago entities that matches the condition 'where idSitCaptura is equals to'.
     *
     * @param idSitCaptura java.lang.String
     * @return Collection of TnMovtoConceptoPago
     */
    @FindByCondition(value=TnMovtoConceptoPago.class, condition="ID_SIT_CAPTURA=?")
    List<TnMovtoConceptoPago> findByIdSitCaptura(java.lang.String idSitCaptura);

    /**
     * Find the first TnMovtoConceptoPago entity that matches the condition 'where idTercero is equals to'.
     *
     * @param idTercero java.lang.String
     * @return TnMovtoConceptoPago
     */
    @FindByCondition(value=TnMovtoConceptoPago.class, condition="ID_TERCERO=?")
    TnMovtoConceptoPago getByIdTercero(java.lang.String idTercero);

    /**
     * Find all TnMovtoConceptoPago entities that matches the condition 'where idTercero is equals to'.
     *
     * @param idTercero java.lang.String
     * @return Collection of TnMovtoConceptoPago
     */
    @FindByCondition(value=TnMovtoConceptoPago.class, condition="ID_TERCERO=?")
    List<TnMovtoConceptoPago> findByIdTercero(java.lang.String idTercero);

    /**
     * Find the first TnMovtoConceptoPago entity that matches the condition 'where idTipoCpto is equals to'.
     *
     * @param idTipoCpto java.lang.String
     * @return TnMovtoConceptoPago
     */
    @FindByCondition(value=TnMovtoConceptoPago.class, condition="ID_TIPO_CPTO=?")
    TnMovtoConceptoPago getByIdTipoCpto(java.lang.String idTipoCpto);

    /**
     * Find all TnMovtoConceptoPago entities that matches the condition 'where idTipoCpto is equals to'.
     *
     * @param idTipoCpto java.lang.String
     * @return Collection of TnMovtoConceptoPago
     */
    @FindByCondition(value=TnMovtoConceptoPago.class, condition="ID_TIPO_CPTO=?")
    List<TnMovtoConceptoPago> findByIdTipoCpto(java.lang.String idTipoCpto);

    /**
     * Find the first TnMovtoConceptoPago entity that matches the condition 'where mcpQnaCaptura is equals to'.
     *
     * @param mcpQnaCaptura java.math.BigDecimal
     * @return TnMovtoConceptoPago
     */
    @FindByCondition(value=TnMovtoConceptoPago.class, condition="MCP_QNA_CAPTURA=?")
    TnMovtoConceptoPago getByMcpQnaCaptura(java.math.BigDecimal mcpQnaCaptura);

    /**
     * Find all TnMovtoConceptoPago entities that matches the condition 'where mcpQnaCaptura is equals to'.
     *
     * @param mcpQnaCaptura java.math.BigDecimal
     * @return Collection of TnMovtoConceptoPago
     */
    @FindByCondition(value=TnMovtoConceptoPago.class, condition="MCP_QNA_CAPTURA=?")
    List<TnMovtoConceptoPago> findByMcpQnaCaptura(java.math.BigDecimal mcpQnaCaptura);

    /**
     * Find the first TnMovtoConceptoPago entity that matches the condition 'where mcpRefCancela is equals to'.
     *
     * @param mcpRefCancela java.lang.String
     * @return TnMovtoConceptoPago
     */
    @FindByCondition(value=TnMovtoConceptoPago.class, condition="MCP_REF_CANCELA=?")
    TnMovtoConceptoPago getByMcpRefCancela(java.lang.String mcpRefCancela);

    /**
     * Find all TnMovtoConceptoPago entities that matches the condition 'where mcpRefCancela is equals to'.
     *
     * @param mcpRefCancela java.lang.String
     * @return Collection of TnMovtoConceptoPago
     */
    @FindByCondition(value=TnMovtoConceptoPago.class, condition="MCP_REF_CANCELA=?")
    List<TnMovtoConceptoPago> findByMcpRefCancela(java.lang.String mcpRefCancela);

    /**
     * Find the first TnMovtoConceptoPago entity that matches the condition 'where mcpRefCaptura is equals to'.
     *
     * @param mcpRefCaptura java.lang.String
     * @return TnMovtoConceptoPago
     */
    @FindByCondition(value=TnMovtoConceptoPago.class, condition="MCP_REF_CAPTURA=?")
    TnMovtoConceptoPago getByMcpRefCaptura(java.lang.String mcpRefCaptura);

    /**
     * Find all TnMovtoConceptoPago entities that matches the condition 'where mcpRefCaptura is equals to'.
     *
     * @param mcpRefCaptura java.lang.String
     * @return Collection of TnMovtoConceptoPago
     */
    @FindByCondition(value=TnMovtoConceptoPago.class, condition="MCP_REF_CAPTURA=?")
    List<TnMovtoConceptoPago> findByMcpRefCaptura(java.lang.String mcpRefCaptura);

    /**
     * Find the first TnMovtoConceptoPago entity that matches the condition 'where mcpRfc is equals to'.
     *
     * @param mcpRfc java.lang.String
     * @return TnMovtoConceptoPago
     */
    @FindByCondition(value=TnMovtoConceptoPago.class, condition="MCP_RFC=?")
    TnMovtoConceptoPago getByMcpRfc(java.lang.String mcpRfc);

    /**
     * Find all TnMovtoConceptoPago entities that matches the condition 'where mcpRfc is equals to'.
     *
     * @param mcpRfc java.lang.String
     * @return Collection of TnMovtoConceptoPago
     */
    @FindByCondition(value=TnMovtoConceptoPago.class, condition="MCP_RFC=?")
    List<TnMovtoConceptoPago> findByMcpRfc(java.lang.String mcpRfc);

    /**
     * Find the first TnMovtoConceptoPago entity that matches the condition 'where monto is equals to'.
     *
     * @param monto java.lang.Double
     * @return TnMovtoConceptoPago
     */
    @FindByCondition(value=TnMovtoConceptoPago.class, condition="MONTO=?")
    TnMovtoConceptoPago getByMonto(java.lang.Double monto);

    /**
     * Find all TnMovtoConceptoPago entities that matches the condition 'where monto is equals to'.
     *
     * @param monto java.lang.Double
     * @return Collection of TnMovtoConceptoPago
     */
    @FindByCondition(value=TnMovtoConceptoPago.class, condition="MONTO=?")
    List<TnMovtoConceptoPago> findByMonto(java.lang.Double monto);

    /**
     * Find the first TnMovtoConceptoPago entity that matches the condition 'where montoAdeudo is equals to'.
     *
     * @param montoAdeudo java.lang.Double
     * @return TnMovtoConceptoPago
     */
    @FindByCondition(value=TnMovtoConceptoPago.class, condition="MONTO_ADEUDO=?")
    TnMovtoConceptoPago getByMontoAdeudo(java.lang.Double montoAdeudo);

    /**
     * Find all TnMovtoConceptoPago entities that matches the condition 'where montoAdeudo is equals to'.
     *
     * @param montoAdeudo java.lang.Double
     * @return Collection of TnMovtoConceptoPago
     */
    @FindByCondition(value=TnMovtoConceptoPago.class, condition="MONTO_ADEUDO=?")
    List<TnMovtoConceptoPago> findByMontoAdeudo(java.lang.Double montoAdeudo);

    /**
     * Find the first TnMovtoConceptoPago entity that matches the condition 'where porcentaje is equals to'.
     *
     * @param porcentaje java.lang.Float
     * @return TnMovtoConceptoPago
     */
    @FindByCondition(value=TnMovtoConceptoPago.class, condition="PORCENTAJE=?")
    TnMovtoConceptoPago getByPorcentaje(java.lang.Float porcentaje);

    /**
     * Find all TnMovtoConceptoPago entities that matches the condition 'where porcentaje is equals to'.
     *
     * @param porcentaje java.lang.Float
     * @return Collection of TnMovtoConceptoPago
     */
    @FindByCondition(value=TnMovtoConceptoPago.class, condition="PORCENTAJE=?")
    List<TnMovtoConceptoPago> findByPorcentaje(java.lang.Float porcentaje);

    /**
     * Find the first TnMovtoConceptoPago entity that matches the condition 'where qnasAdeudo is equals to'.
     *
     * @param qnasAdeudo java.math.BigDecimal
     * @return TnMovtoConceptoPago
     */
    @FindByCondition(value=TnMovtoConceptoPago.class, condition="QNAS_ADEUDO=?")
    TnMovtoConceptoPago getByQnasAdeudo(java.math.BigDecimal qnasAdeudo);

    /**
     * Find all TnMovtoConceptoPago entities that matches the condition 'where qnasAdeudo is equals to'.
     *
     * @param qnasAdeudo java.math.BigDecimal
     * @return Collection of TnMovtoConceptoPago
     */
    @FindByCondition(value=TnMovtoConceptoPago.class, condition="QNAS_ADEUDO=?")
    List<TnMovtoConceptoPago> findByQnasAdeudo(java.math.BigDecimal qnasAdeudo);

    /**
     * Find the first TnMovtoConceptoPago entity that matches the condition 'where qnaAplicadas is equals to'.
     *
     * @param qnaAplicadas java.math.BigDecimal
     * @return TnMovtoConceptoPago
     */
    @FindByCondition(value=TnMovtoConceptoPago.class, condition="QNA_APLICADAS=?")
    TnMovtoConceptoPago getByQnaAplicadas(java.math.BigDecimal qnaAplicadas);

    /**
     * Find all TnMovtoConceptoPago entities that matches the condition 'where qnaAplicadas is equals to'.
     *
     * @param qnaAplicadas java.math.BigDecimal
     * @return Collection of TnMovtoConceptoPago
     */
    @FindByCondition(value=TnMovtoConceptoPago.class, condition="QNA_APLICADAS=?")
    List<TnMovtoConceptoPago> findByQnaAplicadas(java.math.BigDecimal qnaAplicadas);

    /**
     * Find the first TnMovtoConceptoPago entity that matches the condition 'where qnaADescontar is equals to'.
     *
     * @param qnaADescontar java.math.BigDecimal
     * @return TnMovtoConceptoPago
     */
    @FindByCondition(value=TnMovtoConceptoPago.class, condition="QNA_A_DESCONTAR=?")
    TnMovtoConceptoPago getByQnaADescontar(java.math.BigDecimal qnaADescontar);

    /**
     * Find all TnMovtoConceptoPago entities that matches the condition 'where qnaADescontar is equals to'.
     *
     * @param qnaADescontar java.math.BigDecimal
     * @return Collection of TnMovtoConceptoPago
     */
    @FindByCondition(value=TnMovtoConceptoPago.class, condition="QNA_A_DESCONTAR=?")
    List<TnMovtoConceptoPago> findByQnaADescontar(java.math.BigDecimal qnaADescontar);

    /**
     * Find the first TnMovtoConceptoPago entity that matches the condition 'where qnaCancelo is equals to'.
     *
     * @param qnaCancelo java.math.BigDecimal
     * @return TnMovtoConceptoPago
     */
    @FindByCondition(value=TnMovtoConceptoPago.class, condition="QNA_CANCELO=?")
    TnMovtoConceptoPago getByQnaCancelo(java.math.BigDecimal qnaCancelo);

    /**
     * Find all TnMovtoConceptoPago entities that matches the condition 'where qnaCancelo is equals to'.
     *
     * @param qnaCancelo java.math.BigDecimal
     * @return Collection of TnMovtoConceptoPago
     */
    @FindByCondition(value=TnMovtoConceptoPago.class, condition="QNA_CANCELO=?")
    List<TnMovtoConceptoPago> findByQnaCancelo(java.math.BigDecimal qnaCancelo);

    /**
     * Find the first TnMovtoConceptoPago entity that matches the condition 'where qnaFin is equals to'.
     *
     * @param qnaFin java.math.BigDecimal
     * @return TnMovtoConceptoPago
     */
    @FindByCondition(value=TnMovtoConceptoPago.class, condition="QNA_FIN=?")
    TnMovtoConceptoPago getByQnaFin(java.math.BigDecimal qnaFin);

    /**
     * Find all TnMovtoConceptoPago entities that matches the condition 'where qnaFin is equals to'.
     *
     * @param qnaFin java.math.BigDecimal
     * @return Collection of TnMovtoConceptoPago
     */
    @FindByCondition(value=TnMovtoConceptoPago.class, condition="QNA_FIN=?")
    List<TnMovtoConceptoPago> findByQnaFin(java.math.BigDecimal qnaFin);

    /**
     * Find the first TnMovtoConceptoPago entity that matches the condition 'where qnaIni is equals to'.
     *
     * @param qnaIni java.math.BigDecimal
     * @return TnMovtoConceptoPago
     */
    @FindByCondition(value=TnMovtoConceptoPago.class, condition="QNA_INI=?")
    TnMovtoConceptoPago getByQnaIni(java.math.BigDecimal qnaIni);

    /**
     * Find all TnMovtoConceptoPago entities that matches the condition 'where qnaIni is equals to'.
     *
     * @param qnaIni java.math.BigDecimal
     * @return Collection of TnMovtoConceptoPago
     */
    @FindByCondition(value=TnMovtoConceptoPago.class, condition="QNA_INI=?")
    List<TnMovtoConceptoPago> findByQnaIni(java.math.BigDecimal qnaIni);

    /**
     * Find the first TnMovtoConceptoPago entity that matches the condition 'where ultimaQnaProcesa is equals to'.
     *
     * @param ultimaQnaProcesa java.math.BigDecimal
     * @return TnMovtoConceptoPago
     */
    @FindByCondition(value=TnMovtoConceptoPago.class, condition="ULTIMA_QNA_PROCESA=?")
    TnMovtoConceptoPago getByUltimaQnaProcesa(java.math.BigDecimal ultimaQnaProcesa);

    /**
     * Find all TnMovtoConceptoPago entities that matches the condition 'where ultimaQnaProcesa is equals to'.
     *
     * @param ultimaQnaProcesa java.math.BigDecimal
     * @return Collection of TnMovtoConceptoPago
     */
    @FindByCondition(value=TnMovtoConceptoPago.class, condition="ULTIMA_QNA_PROCESA=?")
    List<TnMovtoConceptoPago> findByUltimaQnaProcesa(java.math.BigDecimal ultimaQnaProcesa);

    /**
     * Find the first TnMovtoConceptoPago entity that matches the condition 'where usuario is equals to'.
     *
     * @param usuario java.lang.String
     * @return TnMovtoConceptoPago
     */
    @FindByCondition(value=TnMovtoConceptoPago.class, condition="USUARIO=?")
    TnMovtoConceptoPago getByUsuario(java.lang.String usuario);

    /**
     * Find all TnMovtoConceptoPago entities that matches the condition 'where usuario is equals to'.
     *
     * @param usuario java.lang.String
     * @return Collection of TnMovtoConceptoPago
     */
    @FindByCondition(value=TnMovtoConceptoPago.class, condition="USUARIO=?")
    List<TnMovtoConceptoPago> findByUsuario(java.lang.String usuario);
}