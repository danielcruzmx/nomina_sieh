package gob.shcp.sireh.data.jdbc.spc;

import gob.shcp.fsn.data.annotation.Delete;
import gob.shcp.fsn.data.annotation.FindAll;
import gob.shcp.fsn.data.annotation.FindByCondition;
import gob.shcp.fsn.data.annotation.FindById;
import gob.shcp.fsn.data.annotation.Save;
import gob.shcp.fsn.service.data.orm.JdbcDataService;

import java.util.List;

import gob.shcp.sireh.domain.jdbc.spc.TnCapBitacoraCont;

/**
 * Data access interface for TnCapBitacoraContrato.
 */
public interface TnCapBitacoraContDAO extends JdbcDataService {
    /**
     * Find TnCapBitacoraContrato entity by its identifier or primary key value.
     *
     * @param id identifier or primary key
     * @return TnCapBitacoraContrato
     */
    @FindById(TnCapBitacoraCont.class)
    TnCapBitacoraCont getById(java.lang.Long id);

    /**
     * Get all TnCapBitacoraContrato entities limited by a maximum number of elements.
     *
     * @return Collection of TnCapBitacoraContrato
     */
    @FindAll(TnCapBitacoraCont.class)
    List<TnCapBitacoraCont> findAll();

    /**
     * Make persistence of TnCapBitacoraContrato entities. If its identifier or primary key is null then create else update.
     *
     * @param entity TnCapBitacoraContrato
     */
    @Save
    void save(TnCapBitacoraCont entity);

    /**
     * Remove TnCapBitacoraContrato entities.
     *
     * @param entity TnCapBitacoraContrato
     */
    @Delete
    void delete(TnCapBitacoraCont entity);


    /**
     * Find the first TnCapBitacoraContrato entity that matches the condition 'where contratoCursoAdministrador is equals to'.
     *
     * @param contratoCursoAdministrador java.lang.String
     * @return TnCapBitacoraContrato
     */
    @FindByCondition(value = TnCapBitacoraCont.class, condition = "CONTRATO_CURSO_ADMINISTRADOR=?")
    TnCapBitacoraCont getByContratoCursoAdministrador(java.lang.String contratoCursoAdministrador);

    /**
     * Find all TnCapBitacoraContrato entities that matches the condition 'where contratoCursoAdministrador is equals to'.
     *
     * @param contratoCursoAdministrador java.lang.String
     * @return Collection of TnCapBitacoraContrato
     */
    @FindByCondition(value = TnCapBitacoraCont.class, condition = "CONTRATO_CURSO_ADMINISTRADOR=?")
    List<TnCapBitacoraCont> findByContratoCursoAdministrador(java.lang.String contratoCursoAdministrador);

    /**
     * Find the first TnCapBitacoraContrato entity that matches the condition 'where contratoCursoCiclo is equals to'.
     *
     * @param contratoCursoCiclo int
     * @return TnCapBitacoraContrato
     */
    @FindByCondition(value = TnCapBitacoraCont.class, condition = "CONTRATO_CURSO_CICLO=?")
    TnCapBitacoraCont getByContratoCursoCiclo(int contratoCursoCiclo);

    /**
     * Find all TnCapBitacoraContrato entities that matches the condition 'where contratoCursoCiclo is equals to'.
     *
     * @param contratoCursoCiclo int
     * @return Collection of TnCapBitacoraContrato
     */
    @FindByCondition(value = TnCapBitacoraCont.class, condition = "CONTRATO_CURSO_CICLO=?")
    List<TnCapBitacoraCont> findByContratoCursoCiclo(int contratoCursoCiclo);

    /**
     * Find the first TnCapBitacoraContrato entity that matches the condition 'where contratoCursoFecha is equals to'.
     *
     * @param contratoCursoFecha java.util.Date
     * @return TnCapBitacoraContrato
     */
    @FindByCondition(value = TnCapBitacoraCont.class, condition = "CONTRATO_CURSO_FECHA=?")
    TnCapBitacoraCont getByContratoCursoFecha(java.util.Date contratoCursoFecha);

    /**
     * Find all TnCapBitacoraContrato entities that matches the condition 'where contratoCursoFecha is equals to'.
     *
     * @param contratoCursoFecha java.util.Date
     * @return Collection of TnCapBitacoraContrato
     */
    @FindByCondition(value = TnCapBitacoraCont.class, condition = "CONTRATO_CURSO_FECHA=?")
    List<TnCapBitacoraCont> findByContratoCursoFecha(java.util.Date contratoCursoFecha);

    /**
     * Find the first TnCapBitacoraContrato entity that matches the condition 'where contratoCursoMonto is equals to'.
     *
     * @param contratoCursoMonto double
     * @return TnCapBitacoraContrato
     */
    @FindByCondition(value = TnCapBitacoraCont.class, condition = "CONTRATO_CURSO_MONTO=?")
    TnCapBitacoraCont getByContratoCursoMonto(double contratoCursoMonto);

    /**
     * Find all TnCapBitacoraContrato entities that matches the condition 'where contratoCursoMonto is equals to'.
     *
     * @param contratoCursoMonto double
     * @return Collection of TnCapBitacoraContrato
     */
    @FindByCondition(value = TnCapBitacoraCont.class, condition = "CONTRATO_CURSO_MONTO=?")
    List<TnCapBitacoraCont> findByContratoCursoMonto(double contratoCursoMonto);

    /**
     * Find the first TnCapBitacoraContrato entity that matches the condition 'where contratoCursoNumero is equals to'.
     *
     * @param contratoCursoNumero java.lang.String
     * @return TnCapBitacoraContrato
     */
    @FindByCondition(value = TnCapBitacoraCont.class, condition = "CONTRATO_CURSO_NUMERO=?")
    TnCapBitacoraCont getByContratoCursoNumero(java.lang.String contratoCursoNumero);

    @FindByCondition(value = TnCapBitacoraCont.class, condition = "CONTRATO_CURSO_DESC=?")
    TnCapBitacoraCont getByContratoCursoDesc(java.lang.String contratoCursoDesc);

    /**
     * Find all TnCapBitacoraContrato entities that matches the condition 'where contratoCursoNumero is equals to'.
     *
     * @param contratoCursoNumero java.lang.String
     * @return Collection of TnCapBitacoraContrato
     */
    @FindByCondition(value = TnCapBitacoraCont.class, condition = "CONTRATO_CURSO_NUMERO=?")
    List<TnCapBitacoraCont> findByContratoCursoNumero(java.lang.String contratoCursoNumero);

    /**
     * Find the first TnCapBitacoraContrato entity that matches the condition 'where contratoCursoRepresentante is equals to'.
     *
     * @param contratoCursoRepresentante java.lang.String
     * @return TnCapBitacoraContrato
     */
    @FindByCondition(value = TnCapBitacoraCont.class, condition = "CONTRATO_CURSO_REPRESENTANTE=?")
    TnCapBitacoraCont getByContratoCursoRepresentante(java.lang.String contratoCursoRepresentante);

    /**
     * Find all TnCapBitacoraContrato entities that matches the condition 'where contratoCursoRepresentante is equals to'.
     *
     * @param contratoCursoRepresentante java.lang.String
     * @return Collection of TnCapBitacoraContrato
     */
    @FindByCondition(value = TnCapBitacoraCont.class, condition = "CONTRATO_CURSO_REPRESENTANTE=?")
    List<TnCapBitacoraCont> findByContratoCursoRepresentante(java.lang.String contratoCursoRepresentante);

    /**
     * Find the first TnCapBitacoraContrato entity that matches the condition 'where facturaFecha is equals to'.
     *
     * @param facturaFecha java.util.Date
     * @return TnCapBitacoraContrato
     */
    @FindByCondition(value = TnCapBitacoraCont.class, condition = "FACTURA_FECHA=?")
    TnCapBitacoraCont getByFacturaFecha(java.util.Date facturaFecha);

    /**
     * Find all TnCapBitacoraContrato entities that matches the condition 'where facturaFecha is equals to'.
     *
     * @param facturaFecha java.util.Date
     * @return Collection of TnCapBitacoraContrato
     */
    @FindByCondition(value = TnCapBitacoraCont.class, condition = "FACTURA_FECHA=?")
    List<TnCapBitacoraCont> findByFacturaFecha(java.util.Date facturaFecha);

    /**
     * Find the first TnCapBitacoraContrato entity that matches the condition 'where facturaFolio is equals to'.
     *
     * @param facturaFolio java.lang.String
     * @return TnCapBitacoraContrato
     */
    @FindByCondition(value = TnCapBitacoraCont.class, condition = "FACTURA_FOLIO=?")
    TnCapBitacoraCont getByFacturaFolio(java.lang.String facturaFolio);

    /**
     * Find all TnCapBitacoraContrato entities that matches the condition 'where facturaFolio is equals to'.
     *
     * @param facturaFolio java.lang.String
     * @return Collection of TnCapBitacoraContrato
     */
    @FindByCondition(value = TnCapBitacoraCont.class, condition = "FACTURA_FOLIO=?")
    List<TnCapBitacoraCont> findByFacturaFolio(java.lang.String facturaFolio);

    /**
     * Find the first TnCapBitacoraContrato entity that matches the condition 'where facturaMonto is equals to'.
     *
     * @param facturaMonto double
     * @return TnCapBitacoraContrato
     */
    @FindByCondition(value = TnCapBitacoraCont.class, condition = "FACTURA_MONTO=?")
    TnCapBitacoraCont getByFacturaMonto(double facturaMonto);

    /**
     * Find all TnCapBitacoraContrato entities that matches the condition 'where facturaMonto is equals to'.
     *
     * @param facturaMonto double
     * @return Collection of TnCapBitacoraContrato
     */
    @FindByCondition(value = TnCapBitacoraCont.class, condition = "FACTURA_MONTO=?")
    List<TnCapBitacoraCont> findByFacturaMonto(double facturaMonto);

    /**
     * Find the first TnCapBitacoraContrato entity that matches the condition 'where fecModifico is equals to'.
     *
     * @param fecModifico java.util.Date
     * @return TnCapBitacoraContrato
     */
    @FindByCondition(value = TnCapBitacoraCont.class, condition = "FEC_MODIFICO=?")
    TnCapBitacoraCont getByFecModifico(java.util.Date fecModifico);

    /**
     * Find all TnCapBitacoraContrato entities that matches the condition 'where fecModifico is equals to'.
     *
     * @param fecModifico java.util.Date
     * @return Collection of TnCapBitacoraContrato
     */
    @FindByCondition(value = TnCapBitacoraCont.class, condition = "FEC_MODIFICO=?")
    List<TnCapBitacoraCont> findByFecModifico(java.util.Date fecModifico);

    /**
     * Find the first TnCapBitacoraContrato entity that matches the condition 'where idContratoCurso is equals to'.
     *
     * @param idContratoCurso int
     * @return TnCapBitacoraContrato
     */
    @FindByCondition(value = TnCapBitacoraCont.class, condition = "ID_CONTRATO_CURSO=?")
    TnCapBitacoraCont getByIdContratoCurso(int idContratoCurso);

    /**
     * Find all TnCapBitacoraContrato entities that matches the condition 'where idContratoCurso is equals to'.
     *
     * @param idContratoCurso int
     * @return Collection of TnCapBitacoraContrato
     */
    @FindByCondition(value = TnCapBitacoraCont.class, condition = "ID_CONTRATO_CURSO=?")
    List<TnCapBitacoraCont> findByIdContratoCurso(int idContratoCurso);

    /**
     * Find the first TnCapBitacoraContrato entity that matches the condition 'where idCurso is equals to'.
     *
     * @param idCurso int
     * @return TnCapBitacoraContrato
     */
    @FindByCondition(value = TnCapBitacoraCont.class, condition = "ID_CURSO=?")
    TnCapBitacoraCont getByIdCurso(int idCurso);

    /**
     * Find all TnCapBitacoraContrato entities that matches the condition 'where idCurso is equals to'.
     *
     * @param idCurso int
     * @return Collection of TnCapBitacoraContrato
     */
    @FindByCondition(value = TnCapBitacoraCont.class, condition = "ID_CURSO=?")
    List<TnCapBitacoraCont> findByIdCurso(int idCurso);

    /**
     * Find the first TnCapBitacoraContrato entity that matches the condition 'where idSituacionContrato is equals to'.
     *
     * @param idSituacionContrato int
     * @return TnCapBitacoraContrato
     */
    @FindByCondition(value = TnCapBitacoraCont.class, condition = "ID_SITUACION_CONTRATO=?")
    TnCapBitacoraCont getByIdSituacionContrato(int idSituacionContrato);

    /**
     * Find all TnCapBitacoraContrato entities that matches the condition 'where idSituacionContrato is equals to'.
     *
     * @param idSituacionContrato int
     * @return Collection of TnCapBitacoraContrato
     */
    @FindByCondition(value = TnCapBitacoraCont.class, condition = "ID_SITUACION_CONTRATO=?")
    List<TnCapBitacoraCont> findByIdSituacionContrato(int idSituacionContrato);

    /**
     * Find the first TnCapBitacoraContrato entity that matches the condition 'where idSituacionFactura is equals to'.
     *
     * @param idSituacionFactura int
     * @return TnCapBitacoraContrato
     */
    @FindByCondition(value = TnCapBitacoraCont.class, condition = "ID_SITUACION_FACTURA=?")
    TnCapBitacoraCont getByIdSituacionFactura(int idSituacionFactura);

    /**
     * Find all TnCapBitacoraContrato entities that matches the condition 'where idSituacionFactura is equals to'.
     *
     * @param idSituacionFactura int
     * @return Collection of TnCapBitacoraContrato
     */
    @FindByCondition(value = TnCapBitacoraCont.class, condition = "ID_SITUACION_FACTURA=?")
    List<TnCapBitacoraCont> findByIdSituacionFactura(int idSituacionFactura);

    /**
     * Find the first TnCapBitacoraContrato entity that matches the condition 'where idTipoContratacion is equals to'.
     *
     * @param idTipoContratacion int
     * @return TnCapBitacoraContrato
     */
    @FindByCondition(value = TnCapBitacoraCont.class, condition = "ID_TIPO_CONTRATACION=?")
    TnCapBitacoraCont getByIdTipoContratacion(int idTipoContratacion);

    /**
     * Find all TnCapBitacoraContrato entities that matches the condition 'where idTipoContratacion is equals to'.
     *
     * @param idTipoContratacion int
     * @return Collection of TnCapBitacoraContrato
     */
    @FindByCondition(value = TnCapBitacoraCont.class, condition = "ID_TIPO_CONTRATACION=?")
    List<TnCapBitacoraCont> findByIdTipoContratacion(int idTipoContratacion);

    /**
     * Find the first TnCapBitacoraContrato entity that matches the condition 'where usuario is equals to'.
     *
     * @param usuario java.lang.String
     * @return TnCapBitacoraContrato
     */
    @FindByCondition(value = TnCapBitacoraCont.class, condition = "USUARIO=?")
    TnCapBitacoraCont getByUsuario(java.lang.String usuario);

    /**
     * Find all TnCapBitacoraContrato entities that matches the condition 'where usuario is equals to'.
     *
     * @param usuario java.lang.String
     * @return Collection of TnCapBitacoraContrato
     */
    @FindByCondition(value = TnCapBitacoraCont.class, condition = "USUARIO=?")
    List<TnCapBitacoraCont> findByUsuario(java.lang.String usuario);

    /**
     * Find the first TnCapBitacoraContrato entity that matches the condition 'where facturaAtentaNotaFecha is equals to'.
     *
     * @param facturaAtentaNotaFecha java.util.Date
     * @return TnCapBitacoraContrato
     */
    @FindByCondition(value = TnCapBitacoraCont.class, condition = "FACTURA_ATENTA_NOTA_FECHA=?")
    TnCapBitacoraCont getByFacturaAtentaNotaFecha(java.util.Date facturaAtentaNotaFecha);

    /**
     * Find all TnCapBitacoraContrato entities that matches the condition 'where facturaAtentaNotaFecha is equals to'.
     *
     * @param facturaAtentaNotaFecha java.util.Date
     * @return Collection of TnCapBitacoraContrato
     */
    @FindByCondition(value = TnCapBitacoraCont.class, condition = "FACTURA_ATENTA_NOTA_FECHA=?")
    List<TnCapBitacoraCont> findByFacturaAtentaNotaFecha(java.util.Date facturaAtentaNotaFecha);

    /**
     * Find the first TnCapBitacoraContrato entity that matches the condition 'where facturaAtentaNotaNumero is equals to'.
     *
     * @param facturaAtentaNotaNumero java.lang.String
     * @return TnCapBitacoraContrato
     */
    @FindByCondition(value = TnCapBitacoraCont.class, condition = "FACTURA_ATENTA_NOTA_NUMERO=?")
    TnCapBitacoraCont getByFacturaAtentaNotaNumero(java.lang.String facturaAtentaNotaNumero);

    /**
     * Find all TnCapBitacoraContrato entities that matches the condition 'where facturaAtentaNotaNumero is equals to'.
     *
     * @param facturaAtentaNotaNumero java.lang.String
     * @return Collection of TnCapBitacoraContrato
     */
    @FindByCondition(value = TnCapBitacoraCont.class, condition = "FACTURA_ATENTA_NOTA_NUMERO=?")
    List<TnCapBitacoraCont> findByFacturaAtentaNotaNumero(java.lang.String facturaAtentaNotaNumero);
}
