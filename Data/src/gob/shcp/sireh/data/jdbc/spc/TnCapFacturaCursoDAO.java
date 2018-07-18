package gob.shcp.sireh.data.jdbc.spc;

import gob.shcp.fsn.data.annotation.Delete;
import gob.shcp.fsn.data.annotation.FindAll;
import gob.shcp.fsn.data.annotation.FindByCondition;
import gob.shcp.fsn.data.annotation.FindById;
import gob.shcp.fsn.data.annotation.Save;
import gob.shcp.fsn.service.data.orm.JdbcDataService;

import java.util.List;

import gob.shcp.sireh.domain.jdbc.spc.TnCapFacturaCurso;
import gob.shcp.sireh.domain.jdbc.spc.TnCapFacturaCursoPK;

/**
 * Data access interface for TnCapFacturaCurso.
 */
public interface TnCapFacturaCursoDAO extends JdbcDataService {
    /**
     * Find TnCapFacturaCurso entity by its identifier or primary key value.
     *
     * @param id identifier or primary key
     * @return TnCapFacturaCurso
     */
    @FindById(TnCapFacturaCurso.class)
    TnCapFacturaCurso getById(TnCapFacturaCursoPK id);

    /**
     * Get all TnCapFacturaCurso entities limited by a maximum number of elements.
     *
     * @return Collection of TnCapFacturaCurso
     */
    @FindAll(TnCapFacturaCurso.class)
    List<TnCapFacturaCurso> findAll();

    /**
     * Make persistence of TnCapFacturaCurso entities. If its identifier or primary key is null then create else update.
     *
     * @param entity TnCapFacturaCurso
     */
    @Save
    void save(TnCapFacturaCurso entity);

    /**
     * Remove TnCapFacturaCurso entities.
     *
     * @param entity TnCapFacturaCurso
     */
    @Delete
    void delete(TnCapFacturaCurso entity);


    /**
     * Find the first TnCapFacturaCurso entity that matches the condition 'where facturaFecha is equals to'.
     *
     * @param facturaFecha java.util.Date
     * @return TnCapFacturaCurso
     */
    @FindByCondition(value = TnCapFacturaCurso.class, condition = "FACTURA_FECHA=?")
    TnCapFacturaCurso getByFacturaFecha(java.util.Date facturaFecha);

    /**
     * Find all TnCapFacturaCurso entities that matches the condition 'where facturaFecha is equals to'.
     *
     * @param facturaFecha java.util.Date
     * @return Collection of TnCapFacturaCurso
     */
    @FindByCondition(value = TnCapFacturaCurso.class, condition = "FACTURA_FECHA=?")
    List<TnCapFacturaCurso> findByFacturaFecha(java.util.Date facturaFecha);

    /**
     * Find the first TnCapFacturaCurso entity that matches the condition 'where facturaMonto is equals to'.
     *
     * @param facturaMonto double
     * @return TnCapFacturaCurso
     */
    @FindByCondition(value = TnCapFacturaCurso.class, condition = "FACTURA_MONTO=?")
    TnCapFacturaCurso getByFacturaMonto(double facturaMonto);

    /**
     * Find all TnCapFacturaCurso entities that matches the condition 'where facturaMonto is equals to'.
     *
     * @param facturaMonto double
     * @return Collection of TnCapFacturaCurso
     */
    @FindByCondition(value = TnCapFacturaCurso.class, condition = "FACTURA_MONTO=?")
    List<TnCapFacturaCurso> findByFacturaMonto(double facturaMonto);

    /**
     * Find the first TnCapFacturaCurso entity that matches the condition 'where fecModifico is equals to'.
     *
     * @param fecModifico java.util.Date
     * @return TnCapFacturaCurso
     */
    @FindByCondition(value = TnCapFacturaCurso.class, condition = "FEC_MODIFICO=?")
    TnCapFacturaCurso getByFecModifico(java.util.Date fecModifico);

    /**
     * Find all TnCapFacturaCurso entities that matches the condition 'where fecModifico is equals to'.
     *
     * @param fecModifico java.util.Date
     * @return Collection of TnCapFacturaCurso
     */
    @FindByCondition(value = TnCapFacturaCurso.class, condition = "FEC_MODIFICO=?")
    List<TnCapFacturaCurso> findByFecModifico(java.util.Date fecModifico);

    /**
     * Find the first TnCapFacturaCurso entity that matches the condition 'where idSituacionFactura is equals to'.
     *
     * @param idSituacionFactura int
     * @return TnCapFacturaCurso
     */
    @FindByCondition(value = TnCapFacturaCurso.class, condition = "ID_SITUACION_FACTURA=?")
    TnCapFacturaCurso getByIdSituacionFactura(int idSituacionFactura);

    /**
     * Find all TnCapFacturaCurso entities that matches the condition 'where idSituacionFactura is equals to'.
     *
     * @param idSituacionFactura int
     * @return Collection of TnCapFacturaCurso
     */
    @FindByCondition(value = TnCapFacturaCurso.class, condition = "ID_SITUACION_FACTURA=?")
    List<TnCapFacturaCurso> findByIdSituacionFactura(int idSituacionFactura);

    /**
     * Find the first TnCapFacturaCurso entity that matches the condition 'where usuario is equals to'.
     *
     * @param usuario java.lang.String
     * @return TnCapFacturaCurso
     */
    @FindByCondition(value = TnCapFacturaCurso.class, condition = "USUARIO=?")
    TnCapFacturaCurso getByUsuario(java.lang.String usuario);

    /**
     * Find all TnCapFacturaCurso entities that matches the condition 'where usuario is equals to'.
     *
     * @param usuario java.lang.String
     * @return Collection of TnCapFacturaCurso
     */
    @FindByCondition(value = TnCapFacturaCurso.class, condition = "USUARIO=?")
    List<TnCapFacturaCurso> findByUsuario(java.lang.String usuario);

    /**
     * Find the first TnCapFacturaCurso entity that matches the condition 'where facturaAtentaNotaFecha is equals to'.
     *
     * @param facturaAtentaNotaFecha java.util.Date
     * @return TnCapFacturaCurso
     */
    @FindByCondition(value = TnCapFacturaCurso.class, condition = "FACTURA_ATENTA_NOTA_FECHA=?")
    TnCapFacturaCurso getByFacturaAtentaNotaFecha(java.util.Date facturaAtentaNotaFecha);

    /**
     * Find all TnCapFacturaCurso entities that matches the condition 'where facturaAtentaNotaFecha is equals to'.
     *
     * @param facturaAtentaNotaFecha java.util.Date
     * @return Collection of TnCapFacturaCurso
     */
    @FindByCondition(value = TnCapFacturaCurso.class, condition = "FACTURA_ATENTA_NOTA_FECHA=?")
    List<TnCapFacturaCurso> findByFacturaAtentaNotaFecha(java.util.Date facturaAtentaNotaFecha);

    /**
     * Find the first TnCapFacturaCurso entity that matches the condition 'where facturaAtentaNotaNumero is equals to'.
     *
     * @param facturaAtentaNotaNumero java.lang.String
     * @return TnCapFacturaCurso
     */
    @FindByCondition(value = TnCapFacturaCurso.class, condition = "FACTURA_ATENTA_NOTA_NUMERO=?")
    TnCapFacturaCurso getByFacturaAtentaNotaNumero(java.lang.String facturaAtentaNotaNumero);

    /**
     * Find all TnCapFacturaCurso entities that matches the condition 'where facturaAtentaNotaNumero is equals to'.
     *
     * @param facturaAtentaNotaNumero java.lang.String
     * @return Collection of TnCapFacturaCurso
     */
    @FindByCondition(value = TnCapFacturaCurso.class, condition = "FACTURA_ATENTA_NOTA_NUMERO=?")
    List<TnCapFacturaCurso> findByFacturaAtentaNotaNumero(java.lang.String facturaAtentaNotaNumero);

    /**
     * Find the first TnCapFacturaCurso entity that matches the condition 'where facturaXml is equals to'.
     *
     * @param facturaXml java.sql.Clob
     * @return TnCapFacturaCurso
     */
    @FindByCondition(value = TnCapFacturaCurso.class, condition = "FACTURA_XML=?")
    TnCapFacturaCurso getByFacturaXml(java.sql.Clob facturaXml);

    /**
     * Find all TnCapFacturaCurso entities that matches the condition 'where facturaXml is equals to'.
     *
     * @param facturaXml java.sql.Clob
     * @return Collection of TnCapFacturaCurso
     */
    @FindByCondition(value = TnCapFacturaCurso.class, condition = "FACTURA_XML=?")
    List<TnCapFacturaCurso> findByFacturaXml(java.sql.Clob facturaXml);

    /**
     * Find the first TnCapFacturaCurso entity that matches the condition 'where facturaXmlFirmado is equals to'.
     *
     * @param facturaXmlFirmado java.sql.Clob
     * @return TnCapFacturaCurso
     */
    @FindByCondition(value = TnCapFacturaCurso.class, condition = "FACTURA_XML_FIRMADO=?")
    TnCapFacturaCurso getByFacturaXmlFirmado(java.sql.Clob facturaXmlFirmado);

    /**
     * Find all TnCapFacturaCurso entities that matches the condition 'where facturaXmlFirmado is equals to'.
     *
     * @param facturaXmlFirmado java.sql.Clob
     * @return Collection of TnCapFacturaCurso
     */
    @FindByCondition(value = TnCapFacturaCurso.class, condition = "FACTURA_XML_FIRMADO=?")
    List<TnCapFacturaCurso> findByFacturaXmlFirmado(java.sql.Clob facturaXmlFirmado);
}
