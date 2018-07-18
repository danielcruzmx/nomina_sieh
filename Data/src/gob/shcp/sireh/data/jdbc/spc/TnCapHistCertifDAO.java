package gob.shcp.sireh.data.jdbc.spc;

import gob.shcp.fsn.data.annotation.Delete;
import gob.shcp.fsn.data.annotation.FindAll;
import gob.shcp.fsn.data.annotation.FindByCondition;
import gob.shcp.fsn.data.annotation.FindById;
import gob.shcp.fsn.data.annotation.Save;
import gob.shcp.fsn.service.data.orm.JdbcDataService;

import java.util.List;

import gob.shcp.sireh.domain.jdbc.spc.TnCapHistCertif;

/**
 * Data access interface for TnCapHistoricoCertificacion.
 */
public interface TnCapHistCertifDAO extends JdbcDataService {
    /**
     * Find TnCapHistoricoCertificacion entity by its identifier or primary key value.
     *
     * @param id identifier or primary key
     * @return TnCapHistoricoCertificacion
     */
    @FindById(TnCapHistCertif.class)
    TnCapHistCertif getById(java.lang.Long id);

    /**
     * Get all TnCapHistoricoCertificacion entities limited by a maximum number of elements.
     *
     * @return Collection of TnCapHistoricoCertificacion
     */
    @FindAll(TnCapHistCertif.class)
    List<TnCapHistCertif> findAll();

    /**
     * Make persistence of TnCapHistoricoCertificacion entities. If its identifier or primary key is null then create else update.
     *
     * @param entity TnCapHistoricoCertificacion
     */
    @Save
    void save(TnCapHistCertif entity);

    /**
     * Remove TnCapHistoricoCertificacion entities.
     *
     * @param entity TnCapHistoricoCertificacion
     */
    @Delete
    void delete(TnCapHistCertif entity);


    /**
     * Find the first TnCapHistoricoCertificacion entity that matches the condition 'where certVigenciaFecFin is equals to'.
     *
     * @param certVigenciaFecFin java.util.Date
     * @return TnCapHistoricoCertificacion
     */
    @FindByCondition(value = TnCapHistCertif.class, condition = "CERT_VIGENCIA_FEC_FIN=?")
    TnCapHistCertif getByCertVigenciaFecFin(java.util.Date certVigenciaFecFin);

    /**
     * Find all TnCapHistoricoCertificacion entities that matches the condition 'where certVigenciaFecFin is equals to'.
     *
     * @param certVigenciaFecFin java.util.Date
     * @return Collection of TnCapHistoricoCertificacion
     */
    @FindByCondition(value = TnCapHistCertif.class, condition = "CERT_VIGENCIA_FEC_FIN=?")
    List<TnCapHistCertif> findByCertVigenciaFecFin(java.util.Date certVigenciaFecFin);

    /**
     * Find the first TnCapHistoricoCertificacion entity that matches the condition 'where certVigenciaFecIni is equals to'.
     *
     * @param certVigenciaFecIni java.util.Date
     * @return TnCapHistoricoCertificacion
     */
    @FindByCondition(value = TnCapHistCertif.class, condition = "CERT_VIGENCIA_FEC_INI=?")
    TnCapHistCertif getByCertVigenciaFecIni(java.util.Date certVigenciaFecIni);

    /**
     * Find all TnCapHistoricoCertificacion entities that matches the condition 'where certVigenciaFecIni is equals to'.
     *
     * @param certVigenciaFecIni java.util.Date
     * @return Collection of TnCapHistoricoCertificacion
     */
    @FindByCondition(value = TnCapHistCertif.class, condition = "CERT_VIGENCIA_FEC_INI=?")
    List<TnCapHistCertif> findByCertVigenciaFecIni(java.util.Date certVigenciaFecIni);

    /**
     * Find the first TnCapHistoricoCertificacion entity that matches the condition 'where fecModifico is equals to'.
     *
     * @param fecModifico java.util.Date
     * @return TnCapHistoricoCertificacion
     */
    @FindByCondition(value = TnCapHistCertif.class, condition = "FEC_MODIFICO=?")
    TnCapHistCertif getByFecModifico(java.util.Date fecModifico);

    /**
     * Find all TnCapHistoricoCertificacion entities that matches the condition 'where fecModifico is equals to'.
     *
     * @param fecModifico java.util.Date
     * @return Collection of TnCapHistoricoCertificacion
     */
    @FindByCondition(value = TnCapHistCertif.class, condition = "FEC_MODIFICO=?")
    List<TnCapHistCertif> findByFecModifico(java.util.Date fecModifico);

    /**
     * Find the first TnCapHistoricoCertificacion entity that matches the condition 'where usuario is equals to'.
     *
     * @param usuario java.lang.String
     * @return TnCapHistoricoCertificacion
     */
    @FindByCondition(value = TnCapHistCertif.class, condition = "USUARIO=?")
    TnCapHistCertif getByUsuario(java.lang.String usuario);

    /**
     * Find all TnCapHistoricoCertificacion entities that matches the condition 'where usuario is equals to'.
     *
     * @param usuario java.lang.String
     * @return Collection of TnCapHistoricoCertificacion
     */
    @FindByCondition(value = TnCapHistCertif.class, condition = "USUARIO=?")
    List<TnCapHistCertif> findByUsuario(java.lang.String usuario);
}
