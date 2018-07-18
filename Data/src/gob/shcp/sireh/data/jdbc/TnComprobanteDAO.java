package gob.shcp.sireh.data.jdbc;

import gob.shcp.fsn.data.annotation.Delete;
import gob.shcp.fsn.data.annotation.FindAll;
import gob.shcp.fsn.data.annotation.FindByCondition;
import gob.shcp.fsn.data.annotation.FindById;
import gob.shcp.fsn.data.annotation.Save;
import gob.shcp.fsn.service.data.orm.JdbcDataService;

import java.util.List;

import gob.shcp.sireh.domain.jdbc.TnComprobante;

/**
 * Data access interface for TnComprobante.
 */
public interface TnComprobanteDAO extends JdbcDataService {
    /**
     * Find TnComprobante entity by its identifier or primary key value.
     *
     * @param id identifier or primary key
     * @return TnComprobante
     */
    @FindById(TnComprobante.class)
    TnComprobante getById(gob.shcp.sireh.domain.jdbc.TnComprobantePK id);

    /**
     * Get all TnComprobante entities limited by a maximum number of elements.
     *
     * @return Collection of TnComprobante
     */
    @FindAll(TnComprobante.class)
    List<TnComprobante> findAll();

    /**
     * Make persistence of TnComprobante entities. If its identifier or primary key is null then create else update.
     *
     * @param entity TnComprobante
     */
    @Save
    void save(TnComprobante entity);

    /**
     * Remove TnComprobante entities.
     *
     * @param entity TnComprobante
     */
    @Delete
    void delete(TnComprobante entity);


    /**
     * Find the first TnComprobante entity that matches the condition 'where fecModifico is equals to'.
     *
     * @param fecModifico java.util.Date
     * @return TnComprobante
     */
    @FindByCondition(value = TnComprobante.class, condition = "FEC_MODIFICO=?")
    TnComprobante getByFecModifico(java.util.Date fecModifico);

    /**
     * Find all TnComprobante entities that matches the condition 'where fecModifico is equals to'.
     *
     * @param fecModifico java.util.Date
     * @return Collection of TnComprobante
     */
    @FindByCondition(value = TnComprobante.class, condition = "FEC_MODIFICO=?")
    List<TnComprobante> findByFecModifico(java.util.Date fecModifico);

    /**
     * Find the first TnComprobante entity that matches the condition 'where usuario is equals to'.
     *
     * @param usuario java.lang.String
     * @return TnComprobante
     */
    @FindByCondition(value = TnComprobante.class, condition = "USUARIO=?")
    TnComprobante getByUsuario(java.lang.String usuario);

    /**
     * Find all TnComprobante entities that matches the condition 'where usuario is equals to'.
     *
     * @param usuario java.lang.String
     * @return Collection of TnComprobante
     */
    @FindByCondition(value = TnComprobante.class, condition = "USUARIO=?")
    List<TnComprobante> findByUsuario(java.lang.String usuario);

    /**
     * Find the first TnComprobante entity that matches the condition 'where compFechaCancela is equals to'.
     *
     * @param compFechaCancela java.util.Date
     * @return TnComprobante
     */
    @FindByCondition(value = TnComprobante.class, condition = "COMP_FECHA_CANCELA=?")
    TnComprobante getByCompFechaCancela(java.util.Date compFechaCancela);

    /**
     * Find all TnComprobante entities that matches the condition 'where compFechaCancela is equals to'.
     *
     * @param compFechaCancela java.util.Date
     * @return Collection of TnComprobante
     */
    @FindByCondition(value = TnComprobante.class, condition = "COMP_FECHA_CANCELA=?")
    List<TnComprobante> findByCompFechaCancela(java.util.Date compFechaCancela);

    /**
     * Find the first TnComprobante entity that matches the condition 'where compFechaEmision is equals to'.
     *
     * @param compFechaEmision java.util.Date
     * @return TnComprobante
     */
    @FindByCondition(value = TnComprobante.class, condition = "COMP_FECHA_EMISION=?")
    TnComprobante getByCompFechaEmision(java.util.Date compFechaEmision);

    /**
     * Find all TnComprobante entities that matches the condition 'where compFechaEmision is equals to'.
     *
     * @param compFechaEmision java.util.Date
     * @return Collection of TnComprobante
     */
    @FindByCondition(value = TnComprobante.class, condition = "COMP_FECHA_EMISION=?")
    List<TnComprobante> findByCompFechaEmision(java.util.Date compFechaEmision);

    /**
     * Find the first TnComprobante entity that matches the condition 'where compFolioCancelado is equals to'.
     *
     * @param compFolioCancelado java.lang.String
     * @return TnComprobante
     */
    @FindByCondition(value = TnComprobante.class, condition = "COMP_FOLIO_CANCELADO=?")
    TnComprobante getByCompFolioCancelado(java.lang.String compFolioCancelado);

    /**
     * Find all TnComprobante entities that matches the condition 'where compFolioCancelado is equals to'.
     *
     * @param compFolioCancelado java.lang.String
     * @return Collection of TnComprobante
     */
    @FindByCondition(value = TnComprobante.class, condition = "COMP_FOLIO_CANCELADO=?")
    List<TnComprobante> findByCompFolioCancelado(java.lang.String compFolioCancelado);

    /**
     * Find the first TnComprobante entity that matches the condition 'where compFolioFiscal is equals to'.
     *
     * @param compFolioFiscal java.lang.String
     * @return TnComprobante
     */
    @FindByCondition(value = TnComprobante.class, condition = "COMP_FOLIO_FISCAL=?")
    TnComprobante getByCompFolioFiscal(java.lang.String compFolioFiscal);

    /**
     * Find all TnComprobante entities that matches the condition 'where compFolioFiscal is equals to'.
     *
     * @param compFolioFiscal java.lang.String
     * @return Collection of TnComprobante
     */
    @FindByCondition(value = TnComprobante.class, condition = "COMP_FOLIO_FISCAL=?")
    List<TnComprobante> findByCompFolioFiscal(java.lang.String compFolioFiscal);

    /**
     * Find the first TnComprobante entity that matches the condition 'where compFolioRecibo is equals to'.
     *
     * @param compFolioRecibo java.lang.String
     * @return TnComprobante
     */
    @FindByCondition(value = TnComprobante.class, condition = "COMP_FOLIO_RECIBO=?")
    TnComprobante getByCompFolioRecibo(java.lang.String compFolioRecibo);

    /**
     * Find all TnComprobante entities that matches the condition 'where compFolioRecibo is equals to'.
     *
     * @param compFolioRecibo java.lang.String
     * @return Collection of TnComprobante
     */
    @FindByCondition(value = TnComprobante.class, condition = "COMP_FOLIO_RECIBO=?")
    List<TnComprobante> findByCompFolioRecibo(java.lang.String compFolioRecibo);

    /**
     * Find the first TnComprobante entity that matches the condition 'where idPaqueteCancelado is equals to'.
     *
     * @param idPaqueteCancelado java.lang.Integer
     * @return TnComprobante
     */
    @FindByCondition(value = TnComprobante.class, condition = "ID_PAQUETE_CANCELADO=?")
    TnComprobante getByIdPaqueteCancelado(java.lang.Integer idPaqueteCancelado);

    /**
     * Find all TnComprobante entities that matches the condition 'where idPaqueteCancelado is equals to'.
     *
     * @param idPaqueteCancelado java.lang.Integer
     * @return Collection of TnComprobante
     */
    @FindByCondition(value = TnComprobante.class, condition = "ID_PAQUETE_CANCELADO=?")
    List<TnComprobante> findByIdPaqueteCancelado(java.lang.Integer idPaqueteCancelado);

    /**
     * Find the first TnComprobante entity that matches the condition 'where xmlCancelado is equals to'.
     *
     * @param xmlCancelado java.sql.Clob
     * @return TnComprobante
     */
    @FindByCondition(value = TnComprobante.class, condition = "XML_CANCELADO=?")
    TnComprobante getByXmlCancelado(java.sql.Clob xmlCancelado);

    /**
     * Find all TnComprobante entities that matches the condition 'where xmlCancelado is equals to'.
     *
     * @param xmlCancelado java.sql.Clob
     * @return Collection of TnComprobante
     */
    @FindByCondition(value = TnComprobante.class, condition = "XML_CANCELADO=?")
    List<TnComprobante> findByXmlCancelado(java.sql.Clob xmlCancelado);

    /**
     * Find the first TnComprobante entity that matches the condition 'where xmlGenerado is equals to'.
     *
     * @param xmlGenerado java.sql.Clob
     * @return TnComprobante
     */
    @FindByCondition(value = TnComprobante.class, condition = "XML_GENERADO=?")
    TnComprobante getByXmlGenerado(java.sql.Clob xmlGenerado);

    /**
     * Find all TnComprobante entities that matches the condition 'where xmlGenerado is equals to'.
     *
     * @param xmlGenerado java.sql.Clob
     * @return Collection of TnComprobante
     */
    @FindByCondition(value = TnComprobante.class, condition = "XML_GENERADO=?")
    List<TnComprobante> findByXmlGenerado(java.sql.Clob xmlGenerado);

    /**
     * Find the first TnComprobante entity that matches the condition 'where xmlTimbrado is equals to'.
     *
     * @param xmlTimbrado java.sql.Clob
     * @return TnComprobante
     */
    @FindByCondition(value = TnComprobante.class, condition = "XML_TIMBRADO=?")
    TnComprobante getByXmlTimbrado(java.sql.Clob xmlTimbrado);

    /**
     * Find all TnComprobante entities that matches the condition 'where xmlTimbrado is equals to'.
     *
     * @param xmlTimbrado java.sql.Clob
     * @return Collection of TnComprobante
     */
    @FindByCondition(value = TnComprobante.class, condition = "XML_TIMBRADO=?")
    List<TnComprobante> findByXmlTimbrado(java.sql.Clob xmlTimbrado);
}
