package gob.shcp.sireh.data.jdbc;

import gob.shcp.fsn.data.annotation.Delete;
import gob.shcp.fsn.data.annotation.FindAll;
import gob.shcp.fsn.data.annotation.FindByCondition;
import gob.shcp.fsn.data.annotation.FindById;
import gob.shcp.fsn.data.annotation.Save;
import gob.shcp.fsn.service.data.orm.JdbcDataService;

import java.util.List;

import gob.shcp.sireh.domain.jdbc.TnComprobanteDig;



/**
 * Data access interface for TnComprobanteDig.
 */
public interface TnComprobanteDigDAO extends JdbcDataService {
    /**
     * Find TnComprobanteDig entity by its identifier or primary key value.
     *
     * @param id identifier or primary key
     * @return TnComprobanteDig
     */
    @FindById(TnComprobanteDig.class)
    TnComprobanteDig getById(gob.shcp.sireh.domain.jdbc.TnComprobanteDigPK id);
    
    /**
     * Get all TnComprobanteDig entities limited by a maximum number of elements.
     *
     * @return Collection of TnComprobanteDig
     */
    @FindAll(TnComprobanteDig.class)
    List<TnComprobanteDig> findAll();
    
    /**
     * Make persistence of TnComprobanteDig entities. If its identifier or primary key is null then create else update.
     *
     * @param entity TnComprobanteDig
     */
    @Save
    void save(TnComprobanteDig entity);
    
    /**
     * Remove TnComprobanteDig entities.
     *
     * @param entity TnComprobanteDig
     */
    @Delete
    void delete(TnComprobanteDig entity);


    /**
     * Find the first TnComprobanteDig entity that matches the condition 'where fecModifico is equals to'.
     *
     * @param fecModifico java.util.Date
     * @return TnComprobanteDig
     */
    @FindByCondition(value=TnComprobanteDig.class, condition="FEC_MODIFICO=?")
    TnComprobanteDig getByFecModifico(java.util.Date fecModifico);

    /**
     * Find all TnComprobanteDig entities that matches the condition 'where fecModifico is equals to'.
     *
     * @param fecModifico java.util.Date
     * @return Collection of TnComprobanteDig
     */
    @FindByCondition(value=TnComprobanteDig.class, condition="FEC_MODIFICO=?")
    List<TnComprobanteDig> findByFecModifico(java.util.Date fecModifico);

    /**
     * Find the first TnComprobanteDig entity that matches the condition 'where usuario is equals to'.
     *
     * @param usuario java.lang.String
     * @return TnComprobanteDig
     */
    @FindByCondition(value=TnComprobanteDig.class, condition="USUARIO=?")
    TnComprobanteDig getByUsuario(java.lang.String usuario);

    /**
     * Find all TnComprobanteDig entities that matches the condition 'where usuario is equals to'.
     *
     * @param usuario java.lang.String
     * @return Collection of TnComprobanteDig
     */
    @FindByCondition(value=TnComprobanteDig.class, condition="USUARIO=?")
    List<TnComprobanteDig> findByUsuario(java.lang.String usuario);

    /**
     * Find the first TnComprobanteDig entity that matches the condition 'where cnCadenaOriginal is equals to'.
     *
     * @param cnCadenaOriginal java.lang.String
     * @return TnComprobanteDig
     */
    @FindByCondition(value=TnComprobanteDig.class, condition="CN_CADENA_ORIGINAL=?")
    TnComprobanteDig getByCnCadenaOriginal(java.lang.String cnCadenaOriginal);

    /**
     * Find all TnComprobanteDig entities that matches the condition 'where cnCadenaOriginal is equals to'.
     *
     * @param cnCadenaOriginal java.lang.String
     * @return Collection of TnComprobanteDig
     */
    @FindByCondition(value=TnComprobanteDig.class, condition="CN_CADENA_ORIGINAL=?")
    List<TnComprobanteDig> findByCnCadenaOriginal(java.lang.String cnCadenaOriginal);

    /**
     * Find the first TnComprobanteDig entity that matches the condition 'where cnConsecNomina is equals to'.
     *
     * @param cnConsecNomina java.lang.Integer
     * @return TnComprobanteDig
     */
    @FindByCondition(value=TnComprobanteDig.class, condition="CN_CONSEC_NOMINA=?")
    TnComprobanteDig getByCnConsecNomina(java.lang.Integer cnConsecNomina);

    /**
     * Find all TnComprobanteDig entities that matches the condition 'where cnConsecNomina is equals to'.
     *
     * @param cnConsecNomina java.lang.Integer
     * @return Collection of TnComprobanteDig
     */
    @FindByCondition(value=TnComprobanteDig.class, condition="CN_CONSEC_NOMINA=?")
    List<TnComprobanteDig> findByCnConsecNomina(java.lang.Integer cnConsecNomina);

    /**
     * Find the first TnComprobanteDig entity that matches the condition 'where cnEjercicio is equals to'.
     *
     * @param cnEjercicio java.lang.Integer
     * @return TnComprobanteDig
     */
    @FindByCondition(value=TnComprobanteDig.class, condition="CN_EJERCICIO=?")
    TnComprobanteDig getByCnEjercicio(java.lang.Integer cnEjercicio);

    /**
     * Find all TnComprobanteDig entities that matches the condition 'where cnEjercicio is equals to'.
     *
     * @param cnEjercicio java.lang.Integer
     * @return Collection of TnComprobanteDig
     */
    @FindByCondition(value=TnComprobanteDig.class, condition="CN_EJERCICIO=?")
    List<TnComprobanteDig> findByCnEjercicio(java.lang.Integer cnEjercicio);

    /**
     * Find the first TnComprobanteDig entity that matches the condition 'where cnFechaGenerado is equals to'.
     *
     * @param cnFechaGenerado java.util.Date
     * @return TnComprobanteDig
     */
    @FindByCondition(value=TnComprobanteDig.class, condition="CN_FECHA_GENERADO=?")
    TnComprobanteDig getByCnFechaGenerado(java.util.Date cnFechaGenerado);

    /**
     * Find all TnComprobanteDig entities that matches the condition 'where cnFechaGenerado is equals to'.
     *
     * @param cnFechaGenerado java.util.Date
     * @return Collection of TnComprobanteDig
     */
    @FindByCondition(value=TnComprobanteDig.class, condition="CN_FECHA_GENERADO=?")
    List<TnComprobanteDig> findByCnFechaGenerado(java.util.Date cnFechaGenerado);

    /**
     * Find the first TnComprobanteDig entity that matches the condition 'where cnFecCanc is equals to'.
     *
     * @param cnFecCanc java.util.Date
     * @return TnComprobanteDig
     */
    @FindByCondition(value=TnComprobanteDig.class, condition="CN_FEC_CANC=?")
    TnComprobanteDig getByCnFecCanc(java.util.Date cnFecCanc);

    /**
     * Find all TnComprobanteDig entities that matches the condition 'where cnFecCanc is equals to'.
     *
     * @param cnFecCanc java.util.Date
     * @return Collection of TnComprobanteDig
     */
    @FindByCondition(value=TnComprobanteDig.class, condition="CN_FEC_CANC=?")
    List<TnComprobanteDig> findByCnFecCanc(java.util.Date cnFecCanc);

    /**
     * Find the first TnComprobanteDig entity that matches the condition 'where cnFecEnvio is equals to'.
     *
     * @param cnFecEnvio java.util.Date
     * @return TnComprobanteDig
     */
    @FindByCondition(value=TnComprobanteDig.class, condition="CN_FEC_ENVIO=?")
    TnComprobanteDig getByCnFecEnvio(java.util.Date cnFecEnvio);

    /**
     * Find all TnComprobanteDig entities that matches the condition 'where cnFecEnvio is equals to'.
     *
     * @param cnFecEnvio java.util.Date
     * @return Collection of TnComprobanteDig
     */
    @FindByCondition(value=TnComprobanteDig.class, condition="CN_FEC_ENVIO=?")
    List<TnComprobanteDig> findByCnFecEnvio(java.util.Date cnFecEnvio);

    /**
     * Find the first TnComprobanteDig entity that matches the condition 'where cnFecEnvCanc is equals to'.
     *
     * @param cnFecEnvCanc java.util.Date
     * @return TnComprobanteDig
     */
    @FindByCondition(value=TnComprobanteDig.class, condition="CN_FEC_ENV_CANC=?")
    TnComprobanteDig getByCnFecEnvCanc(java.util.Date cnFecEnvCanc);

    /**
     * Find all TnComprobanteDig entities that matches the condition 'where cnFecEnvCanc is equals to'.
     *
     * @param cnFecEnvCanc java.util.Date
     * @return Collection of TnComprobanteDig
     */
    @FindByCondition(value=TnComprobanteDig.class, condition="CN_FEC_ENV_CANC=?")
    List<TnComprobanteDig> findByCnFecEnvCanc(java.util.Date cnFecEnvCanc);

    /**
     * Find the first TnComprobanteDig entity that matches the condition 'where cnFecFirmaRec is equals to'.
     *
     * @param cnFecFirmaRec java.util.Date
     * @return TnComprobanteDig
     */
    @FindByCondition(value=TnComprobanteDig.class, condition="CN_FEC_FIRMA_REC=?")
    TnComprobanteDig getByCnFecFirmaRec(java.util.Date cnFecFirmaRec);

    /**
     * Find all TnComprobanteDig entities that matches the condition 'where cnFecFirmaRec is equals to'.
     *
     * @param cnFecFirmaRec java.util.Date
     * @return Collection of TnComprobanteDig
     */
    @FindByCondition(value=TnComprobanteDig.class, condition="CN_FEC_FIRMA_REC=?")
    List<TnComprobanteDig> findByCnFecFirmaRec(java.util.Date cnFecFirmaRec);

    /**
     * Find the first TnComprobanteDig entity that matches the condition 'where cnFecRespuesta is equals to'.
     *
     * @param cnFecRespuesta java.util.Date
     * @return TnComprobanteDig
     */
    @FindByCondition(value=TnComprobanteDig.class, condition="CN_FEC_RESPUESTA=?")
    TnComprobanteDig getByCnFecRespuesta(java.util.Date cnFecRespuesta);

    /**
     * Find all TnComprobanteDig entities that matches the condition 'where cnFecRespuesta is equals to'.
     *
     * @param cnFecRespuesta java.util.Date
     * @return Collection of TnComprobanteDig
     */
    @FindByCondition(value=TnComprobanteDig.class, condition="CN_FEC_RESPUESTA=?")
    List<TnComprobanteDig> findByCnFecRespuesta(java.util.Date cnFecRespuesta);

    /**
     * Find the first TnComprobanteDig entity that matches the condition 'where cnFolioFiscal is equals to'.
     *
     * @param cnFolioFiscal java.lang.String
     * @return TnComprobanteDig
     */
    @FindByCondition(value=TnComprobanteDig.class, condition="CN_FOLIO_FISCAL=?")
    TnComprobanteDig getByCnFolioFiscal(java.lang.String cnFolioFiscal);

    /**
     * Find all TnComprobanteDig entities that matches the condition 'where cnFolioFiscal is equals to'.
     *
     * @param cnFolioFiscal java.lang.String
     * @return Collection of TnComprobanteDig
     */
    @FindByCondition(value=TnComprobanteDig.class, condition="CN_FOLIO_FISCAL=?")
    List<TnComprobanteDig> findByCnFolioFiscal(java.lang.String cnFolioFiscal);

    /**
     * Find the first TnComprobanteDig entity that matches the condition 'where cnFolioRecibo is equals to'.
     *
     * @param cnFolioRecibo java.lang.String
     * @return TnComprobanteDig
     */
    @FindByCondition(value=TnComprobanteDig.class, condition="CN_FOLIO_RECIBO=?")
    TnComprobanteDig getByCnFolioRecibo(java.lang.String cnFolioRecibo);

    /**
     * Find all TnComprobanteDig entities that matches the condition 'where cnFolioRecibo is equals to'.
     *
     * @param cnFolioRecibo java.lang.String
     * @return Collection of TnComprobanteDig
     */
    @FindByCondition(value=TnComprobanteDig.class, condition="CN_FOLIO_RECIBO=?")
    List<TnComprobanteDig> findByCnFolioRecibo(java.lang.String cnFolioRecibo);

    /**
     * Find the first TnComprobanteDig entity that matches the condition 'where cnRfc is equals to'.
     *
     * @param cnRfc java.lang.String
     * @return TnComprobanteDig
     */
    @FindByCondition(value=TnComprobanteDig.class, condition="CN_RFC=?")
    TnComprobanteDig getByCnRfc(java.lang.String cnRfc);

    /**
     * Find all TnComprobanteDig entities that matches the condition 'where cnRfc is equals to'.
     *
     * @param cnRfc java.lang.String
     * @return Collection of TnComprobanteDig
     */
    @FindByCondition(value=TnComprobanteDig.class, condition="CN_RFC=?")
    List<TnComprobanteDig> findByCnRfc(java.lang.String cnRfc);

    /**
     * Find the first TnComprobanteDig entity that matches the condition 'where cnXmlCancelado is equals to'.
     *
     * @param cnXmlCancelado java.sql.Clob
     * @return TnComprobanteDig
     */
    @FindByCondition(value=TnComprobanteDig.class, condition="CN_XML_CANCELADO=?")
    TnComprobanteDig getByCnXmlCancelado(java.sql.Clob cnXmlCancelado);

    /**
     * Find all TnComprobanteDig entities that matches the condition 'where cnXmlCancelado is equals to'.
     *
     * @param cnXmlCancelado java.sql.Clob
     * @return Collection of TnComprobanteDig
     */
    @FindByCondition(value=TnComprobanteDig.class, condition="CN_XML_CANCELADO=?")
    List<TnComprobanteDig> findByCnXmlCancelado(java.sql.Clob cnXmlCancelado);

    /**
     * Find the first TnComprobanteDig entity that matches the condition 'where cnXmlGenerado is equals to'.
     *
     * @param cnXmlGenerado java.sql.Clob
     * @return TnComprobanteDig
     */
    @FindByCondition(value=TnComprobanteDig.class, condition="CN_XML_GENERADO=?")
    TnComprobanteDig getByCnXmlGenerado(java.sql.Clob cnXmlGenerado);

    /**
     * Find all TnComprobanteDig entities that matches the condition 'where cnXmlGenerado is equals to'.
     *
     * @param cnXmlGenerado java.sql.Clob
     * @return Collection of TnComprobanteDig
     */
    @FindByCondition(value=TnComprobanteDig.class, condition="CN_XML_GENERADO=?")
    List<TnComprobanteDig> findByCnXmlGenerado(java.sql.Clob cnXmlGenerado);

    /**
     * Find the first TnComprobanteDig entity that matches the condition 'where cnXmlTimbrado is equals to'.
     *
     * @param cnXmlTimbrado java.sql.Clob
     * @return TnComprobanteDig
     */
    @FindByCondition(value=TnComprobanteDig.class, condition="CN_XML_TIMBRADO=?")
    TnComprobanteDig getByCnXmlTimbrado(java.sql.Clob cnXmlTimbrado);

    /**
     * Find all TnComprobanteDig entities that matches the condition 'where cnXmlTimbrado is equals to'.
     *
     * @param cnXmlTimbrado java.sql.Clob
     * @return Collection of TnComprobanteDig
     */
    @FindByCondition(value=TnComprobanteDig.class, condition="CN_XML_TIMBRADO=?")
    List<TnComprobanteDig> findByCnXmlTimbrado(java.sql.Clob cnXmlTimbrado);
}