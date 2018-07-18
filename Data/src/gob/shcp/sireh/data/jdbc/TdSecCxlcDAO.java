package gob.shcp.sireh.data.jdbc;

import gob.shcp.fsn.data.annotation.Delete;
import gob.shcp.fsn.data.annotation.FindAll;
import gob.shcp.fsn.data.annotation.FindByCondition;
import gob.shcp.fsn.data.annotation.FindById;
import gob.shcp.fsn.data.annotation.Save;
import gob.shcp.fsn.service.data.orm.JdbcDataService;

import java.util.List;

import gob.shcp.sireh.domain.jdbc.TdSecCxlc;

/**
 * Data access interface for TdSecCxlc.
 */
public interface TdSecCxlcDAO extends JdbcDataService {

    /**
     * Find TdSecCxlc entity by its identifier or primary key value.
     *
     * @param id identifier or primary key
     * @return TdSecCxlc
     */
    @FindById(TdSecCxlc.class)
    TdSecCxlc getById(gob.shcp.sireh.domain.jdbc.TdSecCxlcPK id);

    /**
     * Get all TdSecCxlc entities limited by a maximum number of elements.
     *
     * @return Collection of TdSecCxlc
     */
    @FindAll(TdSecCxlc.class)
    List<TdSecCxlc> findAll();

    /**
     * Make persistence of TdSecCxlc entities. If its identifier or primary key is null then create else update.
     *
     * @param entity TdSecCxlc
     */
    @Save
    void save(TdSecCxlc entity);

    /**
     * Remove TdSecCxlc entities.
     *
     * @param entity TdSecCxlc
     */
    @Delete
    void delete(TdSecCxlc entity);


    /**
     * Find the first TdSecCxlc entity that matches the condition 'where fecModifico is equals to'.
     *
     * @param fecModifico java.util.Date
     * @return TdSecCxlc
     */
    @FindByCondition(value = TdSecCxlc.class, condition = "FEC_MODIFICO=?")
    TdSecCxlc getByFecModifico(java.util.Date fecModifico);

    /**
     * Find all TdSecCxlc entities that matches the condition 'where fecModifico is equals to'.
     *
     * @param fecModifico java.util.Date
     * @return Collection of TdSecCxlc
     */
    @FindByCondition(value = TdSecCxlc.class, condition = "FEC_MODIFICO=?")
    List<TdSecCxlc> findByFecModifico(java.util.Date fecModifico);

    /**
     * Find the first TdSecCxlc entity that matches the condition 'where usuario is equals to'.
     *
     * @param usuario java.lang.String
     * @return TdSecCxlc
     */
    @FindByCondition(value = TdSecCxlc.class, condition = "USUARIO=?")
    TdSecCxlc getByUsuario(java.lang.String usuario);

    /**
     * Find all TdSecCxlc entities that matches the condition 'where usuario is equals to'.
     *
     * @param usuario java.lang.String
     * @return Collection of TdSecCxlc
     */
    @FindByCondition(value = TdSecCxlc.class, condition = "USUARIO=?")
    List<TdSecCxlc> findByUsuario(java.lang.String usuario);

    /**
     * Find the first TdSecCxlc entity that matches the condition 'where idFuenteFinan is equals to'.
     *
     * @param idFuenteFinan java.lang.Boolean
     * @return TdSecCxlc
     */
    @FindByCondition(value = TdSecCxlc.class, condition = "ID_FUENTE_FINAN=?")
    TdSecCxlc getByIdFuenteFinan(java.lang.Boolean idFuenteFinan);

    /**
     * Find all TdSecCxlc entities that matches the condition 'where idFuenteFinan is equals to'.
     *
     * @param idFuenteFinan java.lang.Boolean
     * @return Collection of TdSecCxlc
     */
    @FindByCondition(value = TdSecCxlc.class, condition = "ID_FUENTE_FINAN=?")
    List<TdSecCxlc> findByIdFuenteFinan(java.lang.Boolean idFuenteFinan);

    /**
     * Find the first TdSecCxlc entity that matches the condition 'where idGrupopago is equals to'.
     *
     * @param idGrupopago java.lang.String
     * @return TdSecCxlc
     */
    @FindByCondition(value = TdSecCxlc.class, condition = "ID_GRUPOPAGO=?")
    TdSecCxlc getByIdGrupopago(java.lang.String idGrupopago);

    /**
     * Find all TdSecCxlc entities that matches the condition 'where idGrupopago is equals to'.
     *
     * @param idGrupopago java.lang.String
     * @return Collection of TdSecCxlc
     */
    @FindByCondition(value = TdSecCxlc.class, condition = "ID_GRUPOPAGO=?")
    List<TdSecCxlc> findByIdGrupopago(java.lang.String idGrupopago);

    /**
     * Find the first TdSecCxlc entity that matches the condition 'where idPartida is equals to'.
     *
     * @param idPartida java.lang.String
     * @return TdSecCxlc
     */
    @FindByCondition(value = TdSecCxlc.class, condition = "ID_PARTIDA=?")
    TdSecCxlc getByIdPartida(java.lang.String idPartida);

    /**
     * Find all TdSecCxlc entities that matches the condition 'where idPartida is equals to'.
     *
     * @param idPartida java.lang.String
     * @return Collection of TdSecCxlc
     */
    @FindByCondition(value = TdSecCxlc.class, condition = "ID_PARTIDA=?")
    List<TdSecCxlc> findByIdPartida(java.lang.String idPartida);

    /**
     * Find the first TdSecCxlc entity that matches the condition 'where idSindicato is equals to'.
     *
     * @param idSindicato java.lang.Integer
     * @return TdSecCxlc
     */
    @FindByCondition(value = TdSecCxlc.class, condition = "ID_SINDICATO=?")
    TdSecCxlc getByIdSindicato(java.lang.Integer idSindicato);

    /**
     * Find all TdSecCxlc entities that matches the condition 'where idSindicato is equals to'.
     *
     * @param idSindicato java.lang.Integer
     * @return Collection of TdSecCxlc
     */
    @FindByCondition(value = TdSecCxlc.class, condition = "ID_SINDICATO=?")
    List<TdSecCxlc> findByIdSindicato(java.lang.Integer idSindicato);

    /**
     * Find the first TdSecCxlc entity that matches the condition 'where idTipoGasto is equals to'.
     *
     * @param idTipoGasto java.lang.Boolean
     * @return TdSecCxlc
     */
    @FindByCondition(value = TdSecCxlc.class, condition = "ID_TIPO_GASTO=?")
    TdSecCxlc getByIdTipoGasto(java.lang.Boolean idTipoGasto);

    /**
     * Find all TdSecCxlc entities that matches the condition 'where idTipoGasto is equals to'.
     *
     * @param idTipoGasto java.lang.Boolean
     * @return Collection of TdSecCxlc
     */
    @FindByCondition(value = TdSecCxlc.class, condition = "ID_TIPO_GASTO=?")
    List<TdSecCxlc> findByIdTipoGasto(java.lang.Boolean idTipoGasto);

    /**
     * Find the first TdSecCxlc entity that matches the condition 'where secClaveMov is equals to'.
     *
     * @param secClaveMov java.lang.String
     * @return TdSecCxlc
     */
    @FindByCondition(value = TdSecCxlc.class, condition = "SEC_CLAVE_MOV=?")
    TdSecCxlc getBySecClaveMov(java.lang.String secClaveMov);

    /**
     * Find all TdSecCxlc entities that matches the condition 'where secClaveMov is equals to'.
     *
     * @param secClaveMov java.lang.String
     * @return Collection of TdSecCxlc
     */
    @FindByCondition(value = TdSecCxlc.class, condition = "SEC_CLAVE_MOV=?")
    List<TdSecCxlc> findBySecClaveMov(java.lang.String secClaveMov);

    /**
     * Find the first TdSecCxlc entity that matches the condition 'where secCompromiso is equals to'.
     *
     * @param secCompromiso java.lang.String
     * @return TdSecCxlc
     */
    @FindByCondition(value = TdSecCxlc.class, condition = "SEC_COMPROMISO=?")
    TdSecCxlc getBySecCompromiso(java.lang.String secCompromiso);

    /**
     * Find all TdSecCxlc entities that matches the condition 'where secCompromiso is equals to'.
     *
     * @param secCompromiso java.lang.String
     * @return Collection of TdSecCxlc
     */
    @FindByCondition(value = TdSecCxlc.class, condition = "SEC_COMPROMISO=?")
    List<TdSecCxlc> findBySecCompromiso(java.lang.String secCompromiso);

    /**
     * Find the first TdSecCxlc entity that matches the condition 'where secCptoMovto is equals to'.
     *
     * @param secCptoMovto java.lang.String
     * @return TdSecCxlc
     */
    @FindByCondition(value = TdSecCxlc.class, condition = "SEC_CPTO_MOVTO=?")
    TdSecCxlc getBySecCptoMovto(java.lang.String secCptoMovto);

    /**
     * Find all TdSecCxlc entities that matches the condition 'where secCptoMovto is equals to'.
     *
     * @param secCptoMovto java.lang.String
     * @return Collection of TdSecCxlc
     */
    @FindByCondition(value = TdSecCxlc.class, condition = "SEC_CPTO_MOVTO=?")
    List<TdSecCxlc> findBySecCptoMovto(java.lang.String secCptoMovto);

    /**
     * Find the first TdSecCxlc entity that matches the condition 'where secCtaClabe is equals to'.
     *
     * @param secCtaClabe java.lang.String
     * @return TdSecCxlc
     */
    @FindByCondition(value = TdSecCxlc.class, condition = "SEC_CTA_CLABE=?")
    TdSecCxlc getBySecCtaClabe(java.lang.String secCtaClabe);

    /**
     * Find all TdSecCxlc entities that matches the condition 'where secCtaClabe is equals to'.
     *
     * @param secCtaClabe java.lang.String
     * @return Collection of TdSecCxlc
     */
    @FindByCondition(value = TdSecCxlc.class, condition = "SEC_CTA_CLABE=?")
    List<TdSecCxlc> findBySecCtaClabe(java.lang.String secCtaClabe);

    /**
     * Find the first TdSecCxlc entity that matches the condition 'where secCxlcSiaff is equals to'.
     *
     * @param secCxlcSiaff java.lang.Long
     * @return TdSecCxlc
     */
    @FindByCondition(value = TdSecCxlc.class, condition = "SEC_CXLC_SIAFF=?")
    TdSecCxlc getBySecCxlcSiaff(java.lang.Long secCxlcSiaff);

    /**
     * Find all TdSecCxlc entities that matches the condition 'where secCxlcSiaff is equals to'.
     *
     * @param secCxlcSiaff java.lang.Long
     * @return Collection of TdSecCxlc
     */
    @FindByCondition(value = TdSecCxlc.class, condition = "SEC_CXLC_SIAFF=?")
    List<TdSecCxlc> findBySecCxlcSiaff(java.lang.Long secCxlcSiaff);

    /**
     * Find the first TdSecCxlc entity that matches the condition 'where secCxlcTerceros is equals to'.
     *
     * @param secCxlcTerceros java.lang.Integer
     * @return TdSecCxlc
     */
    @FindByCondition(value = TdSecCxlc.class, 
                     condition = "SEC_CXLC_TERCEROS=?")
    TdSecCxlc getBySecCxlcTerceros(java.lang.Integer secCxlcTerceros);

    /**
     * Find all TdSecCxlc entities that matches the condition 'where secCxlcTerceros is equals to'.
     *
     * @param secCxlcTerceros java.lang.Integer
     * @return Collection of TdSecCxlc
     */
    @FindByCondition(value = TdSecCxlc.class, 
                     condition = "SEC_CXLC_TERCEROS=?")
    List<TdSecCxlc> findBySecCxlcTerceros(java.lang.Integer secCxlcTerceros);

    /**
     * Find the first TdSecCxlc entity that matches the condition 'where secDevengado is equals to'.
     *
     * @param secDevengado java.lang.Long
     * @return TdSecCxlc
     */
    @FindByCondition(value = TdSecCxlc.class, condition = "SEC_DEVENGADO=?")
    TdSecCxlc getBySecDevengado(java.lang.Long secDevengado);

    /**
     * Find all TdSecCxlc entities that matches the condition 'where secDevengado is equals to'.
     *
     * @param secDevengado java.lang.Long
     * @return Collection of TdSecCxlc
     */
    @FindByCondition(value = TdSecCxlc.class, condition = "SEC_DEVENGADO=?")
    List<TdSecCxlc> findBySecDevengado(java.lang.Long secDevengado);

    /**
     * Find the first TdSecCxlc entity that matches the condition 'where secFecExtraSicop is equals to'.
     *
     * @param secFecExtraSicop java.util.Date
     * @return TdSecCxlc
     */
    @FindByCondition(value = TdSecCxlc.class, 
                     condition = "SEC_FEC_EXTRA_SICOP=?")
    TdSecCxlc getBySecFecExtraSicop(java.util.Date secFecExtraSicop);

    /**
     * Find all TdSecCxlc entities that matches the condition 'where secFecExtraSicop is equals to'.
     *
     * @param secFecExtraSicop java.util.Date
     * @return Collection of TdSecCxlc
     */
    @FindByCondition(value = TdSecCxlc.class, condition = "SEC_FEC_EXTRA_SICOP=?")
    List<TdSecCxlc> findBySecFecExtraSicop(java.util.Date secFecExtraSicop);

    /**
     * Find the first TdSecCxlc entity that matches the condition 'where secMonto is equals to'.
     *
     * @param secMonto java.lang.Double
     * @return TdSecCxlc
     */
    @FindByCondition(value = TdSecCxlc.class, condition = "SEC_MONTO=?")
    TdSecCxlc getBySecMonto(java.lang.Double secMonto);

    /**
     * Find all TdSecCxlc entities that matches the condition 'where secMonto is equals to'.
     *
     * @param secMonto java.lang.Double
     * @return Collection of TdSecCxlc
     */
    @FindByCondition(value = TdSecCxlc.class, condition = "SEC_MONTO=?")
    List<TdSecCxlc> findBySecMonto(java.lang.Double secMonto);

    /**
     * Find the first TdSecCxlc entity that matches the condition 'where secQnaApli is equals to'.
     *
     * @param secQnaApli java.lang.Integer
     * @return TdSecCxlc
     */
    @FindByCondition(value = TdSecCxlc.class, condition = "SEC_QNA_APLI=?")
    TdSecCxlc getBySecQnaApli(java.lang.Integer secQnaApli);

    /**
     * Find all TdSecCxlc entities that matches the condition 'where secQnaApli is equals to'.
     *
     * @param secQnaApli java.lang.Integer
     * @return Collection of TdSecCxlc
     */
    @FindByCondition(value = TdSecCxlc.class, condition = "SEC_QNA_APLI=?")
    List<TdSecCxlc> findBySecQnaApli(java.lang.Integer secQnaApli);

    /**
     * Find the first TdSecCxlc entity that matches the condition 'where secSiaff is equals to'.
     *
     * @param secSiaff java.lang.Integer
     * @return TdSecCxlc
     */
    @FindByCondition(value = TdSecCxlc.class, condition = "SEC_SIAFF=?")
    TdSecCxlc getBySecSiaff(java.lang.Integer secSiaff);

    /**
     * Find all TdSecCxlc entities that matches the condition 'where secSiaff is equals to'.
     *
     * @param secSiaff java.lang.Integer
     * @return Collection of TdSecCxlc
     */
    @FindByCondition(value = TdSecCxlc.class, condition = "SEC_SIAFF=?")
    List<TdSecCxlc> findBySecSiaff(java.lang.Integer secSiaff);

    /**
     * Find the first TdSecCxlc entity that matches the condition 'where secTerceros is equals to'.
     *
     * @param secTerceros java.lang.Integer
     * @return TdSecCxlc
     */
    @FindByCondition(value = TdSecCxlc.class, condition = "SEC_TERCEROS=?")
    TdSecCxlc getBySecTerceros(java.lang.Integer secTerceros);

    /**
     * Find all TdSecCxlc entities that matches the condition 'where secTerceros is equals to'.
     *
     * @param secTerceros java.lang.Integer
     * @return Collection of TdSecCxlc
     */
    @FindByCondition(value = TdSecCxlc.class, condition = "SEC_TERCEROS=?")
    List<TdSecCxlc> findBySecTerceros(java.lang.Integer secTerceros);

    /**
     * Find the first TdSecCxlc entity that matches the condition 'where secTipoCpto is equals to'.
     *
     * @param secTipoCpto java.lang.String
     * @return TdSecCxlc
     */
    @FindByCondition(value = TdSecCxlc.class, condition = "SEC_TIPO_CPTO=?")
    TdSecCxlc getBySecTipoCpto(java.lang.String secTipoCpto);

    /**
     * Find all TdSecCxlc entities that matches the condition 'where secTipoCpto is equals to'.
     *
     * @param secTipoCpto java.lang.String
     * @return Collection of TdSecCxlc
     */
    @FindByCondition(value = TdSecCxlc.class, condition = "SEC_TIPO_CPTO=?")
    List<TdSecCxlc> findBySecTipoCpto(java.lang.String secTipoCpto);
}
