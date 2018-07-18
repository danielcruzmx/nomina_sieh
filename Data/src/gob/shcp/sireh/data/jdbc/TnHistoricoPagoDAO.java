package gob.shcp.sireh.data.jdbc;

import gob.shcp.fsn.data.annotation.Delete;
import gob.shcp.fsn.data.annotation.FindAll;
import gob.shcp.fsn.data.annotation.FindByCondition;
import gob.shcp.fsn.data.annotation.FindById;
import gob.shcp.fsn.data.annotation.Save;
import gob.shcp.fsn.service.data.orm.JdbcDataService;

import java.util.List;

import gob.shcp.sireh.domain.jdbc.TnHistoricoPago;


/**
 * Data access interface for TnHistoricoPago.
 */
public interface TnHistoricoPagoDAO extends JdbcDataService {
    /**
     * Find TnHistoricoPago entity by its identifier or primary key value.
     *
     * @param id identifier or primary key
     * @return TnHistoricoPago
     */
    @FindById(TnHistoricoPago.class)
    TnHistoricoPago getById(gob.shcp.sireh.domain.jdbc.TnHistoricoPagoPK id);
    
    /**
     * Get all TnHistoricoPago entities limited by a maximum number of elements.
     *
     * @return Collection of TnHistoricoPago
     */
    @FindAll(TnHistoricoPago.class)
    List<TnHistoricoPago> findAll();
    
    /**
     * Make persistence of TnHistoricoPago entities. If its identifier or primary key is null then create else update.
     *
     * @param entity TnHistoricoPago
     */
    @Save
    void save(TnHistoricoPago entity);
    
    /**
     * Remove TnHistoricoPago entities.
     *
     * @param entity TnHistoricoPago
     */
    @Delete
    void delete(TnHistoricoPago entity);


    /**
     * Find the first TnHistoricoPago entity that matches the condition 'where hpCicloUnidad is equals to'.
     *
     * @param hpCicloUnidad java.lang.Integer
     * @return TnHistoricoPago
     */
    @FindByCondition(value=TnHistoricoPago.class, condition="HP_CICLO_UNIDAD=?")
    TnHistoricoPago getByHpCicloUnidad(java.lang.Integer hpCicloUnidad);

    /**
     * Find all TnHistoricoPago entities that matches the condition 'where hpCicloUnidad is equals to'.
     *
     * @param hpCicloUnidad java.lang.Integer
     * @return Collection of TnHistoricoPago
     */
    @FindByCondition(value=TnHistoricoPago.class, condition="HP_CICLO_UNIDAD=?")
    List<TnHistoricoPago> findByHpCicloUnidad(java.lang.Integer hpCicloUnidad);

    /**
     * Find the first TnHistoricoPago entity that matches the condition 'where hpClabe is equals to'.
     *
     * @param hpClabe java.lang.String
     * @return TnHistoricoPago
     */
    @FindByCondition(value=TnHistoricoPago.class, condition="HP_CLABE=?")
    TnHistoricoPago getByHpClabe(java.lang.String hpClabe);

    /**
     * Find all TnHistoricoPago entities that matches the condition 'where hpClabe is equals to'.
     *
     * @param hpClabe java.lang.String
     * @return Collection of TnHistoricoPago
     */
    @FindByCondition(value=TnHistoricoPago.class, condition="HP_CLABE=?")
    List<TnHistoricoPago> findByHpClabe(java.lang.String hpClabe);

    /**
     * Find the first TnHistoricoPago entity that matches the condition 'where hpConsecNomina is equals to'.
     *
     * @param hpConsecNomina java.lang.Integer
     * @return TnHistoricoPago
     */
    @FindByCondition(value=TnHistoricoPago.class, condition="HP_CONSEC_NOMINA=?")
    TnHistoricoPago getByHpConsecNomina(java.lang.Integer hpConsecNomina);

    /**
     * Find all TnHistoricoPago entities that matches the condition 'where hpConsecNomina is equals to'.
     *
     * @param hpConsecNomina java.lang.Integer
     * @return Collection of TnHistoricoPago
     */
    @FindByCondition(value=TnHistoricoPago.class, condition="HP_CONSEC_NOMINA=?")
    List<TnHistoricoPago> findByHpConsecNomina(java.lang.Integer hpConsecNomina);

    /**
     * Find the first TnHistoricoPago entity that matches the condition 'where hpDepositoSN is equals to'.
     *
     * @param hpDepositoSN java.lang.String
     * @return TnHistoricoPago
     */
    @FindByCondition(value=TnHistoricoPago.class, condition="HP_DEPOSITO_S_N=?")
    TnHistoricoPago getByHpDepositoSN(java.lang.String hpDepositoSN);

    /**
     * Find all TnHistoricoPago entities that matches the condition 'where hpDepositoSN is equals to'.
     *
     * @param hpDepositoSN java.lang.String
     * @return Collection of TnHistoricoPago
     */
    @FindByCondition(value=TnHistoricoPago.class, condition="HP_DEPOSITO_S_N=?")
    List<TnHistoricoPago> findByHpDepositoSN(java.lang.String hpDepositoSN);

    /**
     * Find the first TnHistoricoPago entity that matches the condition 'where hpDiasPago is equals to'.
     *
     * @param hpDiasPago java.math.BigDecimal
     * @return TnHistoricoPago
     */
    @FindByCondition(value=TnHistoricoPago.class, condition="HP_DIAS_PAGO=?")
    TnHistoricoPago getByHpDiasPago(java.math.BigDecimal hpDiasPago);

    /**
     * Find all TnHistoricoPago entities that matches the condition 'where hpDiasPago is equals to'.
     *
     * @param hpDiasPago java.math.BigDecimal
     * @return Collection of TnHistoricoPago
     */
    @FindByCondition(value=TnHistoricoPago.class, condition="HP_DIAS_PAGO=?")
    List<TnHistoricoPago> findByHpDiasPago(java.math.BigDecimal hpDiasPago);

    /**
     * Find the first TnHistoricoPago entity that matches the condition 'where hpEjerFiscal is equals to'.
     *
     * @param hpEjerFiscal java.lang.Integer
     * @return TnHistoricoPago
     */
    @FindByCondition(value=TnHistoricoPago.class, condition="HP_EJER_FISCAL=?")
    TnHistoricoPago getByHpEjerFiscal(java.lang.Integer hpEjerFiscal);

    /**
     * Find all TnHistoricoPago entities that matches the condition 'where hpEjerFiscal is equals to'.
     *
     * @param hpEjerFiscal java.lang.Integer
     * @return Collection of TnHistoricoPago
     */
    @FindByCondition(value=TnHistoricoPago.class, condition="HP_EJER_FISCAL=?")
    List<TnHistoricoPago> findByHpEjerFiscal(java.lang.Integer hpEjerFiscal);

    /**
     * Find the first TnHistoricoPago entity that matches the condition 'where hpFinPago is equals to'.
     *
     * @param hpFinPago java.util.Date
     * @return TnHistoricoPago
     */
    @FindByCondition(value=TnHistoricoPago.class, condition="HP_FIN_PAGO=?")
    TnHistoricoPago getByHpFinPago(java.util.Date hpFinPago);

    /**
     * Find all TnHistoricoPago entities that matches the condition 'where hpFinPago is equals to'.
     *
     * @param hpFinPago java.util.Date
     * @return Collection of TnHistoricoPago
     */
    @FindByCondition(value=TnHistoricoPago.class, condition="HP_FIN_PAGO=?")
    List<TnHistoricoPago> findByHpFinPago(java.util.Date hpFinPago);

    /**
     * Find the first TnHistoricoPago entity that matches the condition 'where hpIniPago is equals to'.
     *
     * @param hpIniPago java.util.Date
     * @return TnHistoricoPago
     */
    @FindByCondition(value=TnHistoricoPago.class, condition="HP_INI_PAGO=?")
    TnHistoricoPago getByHpIniPago(java.util.Date hpIniPago);

    /**
     * Find all TnHistoricoPago entities that matches the condition 'where hpIniPago is equals to'.
     *
     * @param hpIniPago java.util.Date
     * @return Collection of TnHistoricoPago
     */
    @FindByCondition(value=TnHistoricoPago.class, condition="HP_INI_PAGO=?")
    List<TnHistoricoPago> findByHpIniPago(java.util.Date hpIniPago);

    /**
     * Find the first TnHistoricoPago entity that matches the condition 'where hpJerarquia is equals to'.
     *
     * @param hpJerarquia java.lang.String
     * @return TnHistoricoPago
     */
    @FindByCondition(value=TnHistoricoPago.class, condition="HP_JERARQUIA=?")
    TnHistoricoPago getByHpJerarquia(java.lang.String hpJerarquia);

    /**
     * Find all TnHistoricoPago entities that matches the condition 'where hpJerarquia is equals to'.
     *
     * @param hpJerarquia java.lang.String
     * @return Collection of TnHistoricoPago
     */
    @FindByCondition(value=TnHistoricoPago.class, condition="HP_JERARQUIA=?")
    List<TnHistoricoPago> findByHpJerarquia(java.lang.String hpJerarquia);

    /**
     * Find the first TnHistoricoPago entity that matches the condition 'where hpNetoPago is equals to'.
     *
     * @param hpNetoPago java.math.BigDecimal
     * @return TnHistoricoPago
     */
    @FindByCondition(value=TnHistoricoPago.class, condition="HP_NETO_PAGO=?")
    TnHistoricoPago getByHpNetoPago(java.math.BigDecimal hpNetoPago);

    /**
     * Find all TnHistoricoPago entities that matches the condition 'where hpNetoPago is equals to'.
     *
     * @param hpNetoPago java.math.BigDecimal
     * @return Collection of TnHistoricoPago
     */
    @FindByCondition(value=TnHistoricoPago.class, condition="HP_NETO_PAGO=?")
    List<TnHistoricoPago> findByHpNetoPago(java.math.BigDecimal hpNetoPago);

    /**
     * Find the first TnHistoricoPago entity that matches the condition 'where hpNivel is equals to'.
     *
     * @param hpNivel java.lang.String
     * @return TnHistoricoPago
     */
    @FindByCondition(value=TnHistoricoPago.class, condition="HP_NIVEL=?")
    TnHistoricoPago getByHpNivel(java.lang.String hpNivel);

    /**
     * Find all TnHistoricoPago entities that matches the condition 'where hpNivel is equals to'.
     *
     * @param hpNivel java.lang.String
     * @return Collection of TnHistoricoPago
     */
    @FindByCondition(value=TnHistoricoPago.class, condition="HP_NIVEL=?")
    List<TnHistoricoPago> findByHpNivel(java.lang.String hpNivel);

    /**
     * Find the first TnHistoricoPago entity that matches the condition 'where hpNombramiento is equals to'.
     *
     * @param hpNombramiento java.lang.String
     * @return TnHistoricoPago
     */
    @FindByCondition(value=TnHistoricoPago.class, condition="HP_NOMBRAMIENTO=?")
    TnHistoricoPago getByHpNombramiento(java.lang.String hpNombramiento);

    /**
     * Find all TnHistoricoPago entities that matches the condition 'where hpNombramiento is equals to'.
     *
     * @param hpNombramiento java.lang.String
     * @return Collection of TnHistoricoPago
     */
    @FindByCondition(value=TnHistoricoPago.class, condition="HP_NOMBRAMIENTO=?")
    List<TnHistoricoPago> findByHpNombramiento(java.lang.String hpNombramiento);

    /**
     * Find the first TnHistoricoPago entity that matches the condition 'where hpNumComplem is equals to'.
     *
     * @param hpNumComplem java.lang.String
     * @return TnHistoricoPago
     */
    @FindByCondition(value=TnHistoricoPago.class, condition="HP_NUM_COMPLEM=?")
    TnHistoricoPago getByHpNumComplem(java.lang.String hpNumComplem);

    /**
     * Find all TnHistoricoPago entities that matches the condition 'where hpNumComplem is equals to'.
     *
     * @param hpNumComplem java.lang.String
     * @return Collection of TnHistoricoPago
     */
    @FindByCondition(value=TnHistoricoPago.class, condition="HP_NUM_COMPLEM=?")
    List<TnHistoricoPago> findByHpNumComplem(java.lang.String hpNumComplem);

    /**
     * Find the first TnHistoricoPago entity that matches the condition 'where hpNumPension is equals to'.
     *
     * @param hpNumPension java.math.BigDecimal
     * @return TnHistoricoPago
     */
    @FindByCondition(value=TnHistoricoPago.class, condition="HP_NUM_PENSION=?")
    TnHistoricoPago getByHpNumPension(java.math.BigDecimal hpNumPension);

    /**
     * Find all TnHistoricoPago entities that matches the condition 'where hpNumPension is equals to'.
     *
     * @param hpNumPension java.math.BigDecimal
     * @return Collection of TnHistoricoPago
     */
    @FindByCondition(value=TnHistoricoPago.class, condition="HP_NUM_PENSION=?")
    List<TnHistoricoPago> findByHpNumPension(java.math.BigDecimal hpNumPension);

    /**
     * Find the first TnHistoricoPago entity that matches the condition 'where hpPcpPagados is equals to'.
     *
     * @param hpPcpPagados java.math.BigDecimal
     * @return TnHistoricoPago
     */
    @FindByCondition(value=TnHistoricoPago.class, condition="HP_PCP_PAGADOS=?")
    TnHistoricoPago getByHpPcpPagados(java.math.BigDecimal hpPcpPagados);

    /**
     * Find all TnHistoricoPago entities that matches the condition 'where hpPcpPagados is equals to'.
     *
     * @param hpPcpPagados java.math.BigDecimal
     * @return Collection of TnHistoricoPago
     */
    @FindByCondition(value=TnHistoricoPago.class, condition="HP_PCP_PAGADOS=?")
    List<TnHistoricoPago> findByHpPcpPagados(java.math.BigDecimal hpPcpPagados);

    /**
     * Find the first TnHistoricoPago entity that matches the condition 'where hpPcpPorPagar is equals to'.
     *
     * @param hpPcpPorPagar java.math.BigDecimal
     * @return TnHistoricoPago
     */
    @FindByCondition(value=TnHistoricoPago.class, condition="HP_PCP_POR_PAGAR=?")
    TnHistoricoPago getByHpPcpPorPagar(java.math.BigDecimal hpPcpPorPagar);

    /**
     * Find all TnHistoricoPago entities that matches the condition 'where hpPcpPorPagar is equals to'.
     *
     * @param hpPcpPorPagar java.math.BigDecimal
     * @return Collection of TnHistoricoPago
     */
    @FindByCondition(value=TnHistoricoPago.class, condition="HP_PCP_POR_PAGAR=?")
    List<TnHistoricoPago> findByHpPcpPorPagar(java.math.BigDecimal hpPcpPorPagar);

    /**
     * Find the first TnHistoricoPago entity that matches the condition 'where hpQnaPago is equals to'.
     *
     * @param hpQnaPago java.lang.Integer
     * @return TnHistoricoPago
     */
    @FindByCondition(value=TnHistoricoPago.class, condition="HP_QNA_PAGO=?")
    TnHistoricoPago getByHpQnaPago(java.lang.Integer hpQnaPago);

    /**
     * Find all TnHistoricoPago entities that matches the condition 'where hpQnaPago is equals to'.
     *
     * @param hpQnaPago java.lang.Integer
     * @return Collection of TnHistoricoPago
     */
    @FindByCondition(value=TnHistoricoPago.class, condition="HP_QNA_PAGO=?")
    List<TnHistoricoPago> findByHpQnaPago(java.lang.Integer hpQnaPago);

    /**
     * Find the first TnHistoricoPago entity that matches the condition 'where hpRfc is equals to'.
     *
     * @param hpRfc java.lang.String
     * @return TnHistoricoPago
     */
    @FindByCondition(value=TnHistoricoPago.class, condition="HP_RFC=?")
    TnHistoricoPago getByHpRfc(java.lang.String hpRfc);

    /**
     * Find all TnHistoricoPago entities that matches the condition 'where hpRfc is equals to'.
     *
     * @param hpRfc java.lang.String
     * @return Collection of TnHistoricoPago
     */
    @FindByCondition(value=TnHistoricoPago.class, condition="HP_RFC=?")
    List<TnHistoricoPago> findByHpRfc(java.lang.String hpRfc);

    /**
     * Find the first TnHistoricoPago entity that matches the condition 'where idEdoNom is equals to'.
     *
     * @param idEdoNom java.math.BigDecimal
     * @return TnHistoricoPago
     */
    @FindByCondition(value=TnHistoricoPago.class, condition="ID_EDO_NOM=?")
    TnHistoricoPago getByIdEdoNom(java.math.BigDecimal idEdoNom);

    /**
     * Find all TnHistoricoPago entities that matches the condition 'where idEdoNom is equals to'.
     *
     * @param idEdoNom java.math.BigDecimal
     * @return Collection of TnHistoricoPago
     */
    @FindByCondition(value=TnHistoricoPago.class, condition="ID_EDO_NOM=?")
    List<TnHistoricoPago> findByIdEdoNom(java.math.BigDecimal idEdoNom);

    /**
     * Find the first TnHistoricoPago entity that matches the condition 'where idEdoPre is equals to'.
     *
     * @param idEdoPre java.lang.Integer
     * @return TnHistoricoPago
     */
    @FindByCondition(value=TnHistoricoPago.class, condition="ID_EDO_PRE=?")
    TnHistoricoPago getByIdEdoPre(java.lang.Integer idEdoPre);

    /**
     * Find all TnHistoricoPago entities that matches the condition 'where idEdoPre is equals to'.
     *
     * @param idEdoPre java.lang.Integer
     * @return Collection of TnHistoricoPago
     */
    @FindByCondition(value=TnHistoricoPago.class, condition="ID_EDO_PRE=?")
    List<TnHistoricoPago> findByIdEdoPre(java.lang.Integer idEdoPre);

    /**
     * Find the first TnHistoricoPago entity that matches the condition 'where idGrupopagoNom is equals to'.
     *
     * @param idGrupopagoNom java.lang.String
     * @return TnHistoricoPago
     */
    @FindByCondition(value=TnHistoricoPago.class, condition="ID_GRUPOPAGO_NOM=?")
    TnHistoricoPago getByIdGrupopagoNom(java.lang.String idGrupopagoNom);

    /**
     * Find all TnHistoricoPago entities that matches the condition 'where idGrupopagoNom is equals to'.
     *
     * @param idGrupopagoNom java.lang.String
     * @return Collection of TnHistoricoPago
     */
    @FindByCondition(value=TnHistoricoPago.class, condition="ID_GRUPOPAGO_NOM=?")
    List<TnHistoricoPago> findByIdGrupopagoNom(java.lang.String idGrupopagoNom);

    /**
     * Find the first TnHistoricoPago entity that matches the condition 'where idMuniNom is equals to'.
     *
     * @param idMuniNom java.math.BigDecimal
     * @return TnHistoricoPago
     */
    @FindByCondition(value=TnHistoricoPago.class, condition="ID_MUNI_NOM=?")
    TnHistoricoPago getByIdMuniNom(java.math.BigDecimal idMuniNom);

    /**
     * Find all TnHistoricoPago entities that matches the condition 'where idMuniNom is equals to'.
     *
     * @param idMuniNom java.math.BigDecimal
     * @return Collection of TnHistoricoPago
     */
    @FindByCondition(value=TnHistoricoPago.class, condition="ID_MUNI_NOM=?")
    List<TnHistoricoPago> findByIdMuniNom(java.math.BigDecimal idMuniNom);

    /**
     * Find the first TnHistoricoPago entity that matches the condition 'where idPlaza is equals to'.
     *
     * @param idPlaza java.lang.Integer
     * @return TnHistoricoPago
     */
    @FindByCondition(value=TnHistoricoPago.class, condition="ID_PLAZA=?")
    TnHistoricoPago getByIdPlaza(java.lang.Integer idPlaza);

    /**
     * Find all TnHistoricoPago entities that matches the condition 'where idPlaza is equals to'.
     *
     * @param idPlaza java.lang.Integer
     * @return Collection of TnHistoricoPago
     */
    @FindByCondition(value=TnHistoricoPago.class, condition="ID_PLAZA=?")
    List<TnHistoricoPago> findByIdPlaza(java.lang.Integer idPlaza);

    /**
     * Find the first TnHistoricoPago entity that matches the condition 'where idPuestoNom is equals to'.
     *
     * @param idPuestoNom java.lang.String
     * @return TnHistoricoPago
     */
    @FindByCondition(value=TnHistoricoPago.class, condition="ID_PUESTO_NOM=?")
    TnHistoricoPago getByIdPuestoNom(java.lang.String idPuestoNom);

    /**
     * Find all TnHistoricoPago entities that matches the condition 'where idPuestoNom is equals to'.
     *
     * @param idPuestoNom java.lang.String
     * @return Collection of TnHistoricoPago
     */
    @FindByCondition(value=TnHistoricoPago.class, condition="ID_PUESTO_NOM=?")
    List<TnHistoricoPago> findByIdPuestoNom(java.lang.String idPuestoNom);

    /**
     * Find the first TnHistoricoPago entity that matches the condition 'where idPuestoPre is equals to'.
     *
     * @param idPuestoPre java.lang.String
     * @return TnHistoricoPago
     */
    @FindByCondition(value=TnHistoricoPago.class, condition="ID_PUESTO_PRE=?")
    TnHistoricoPago getByIdPuestoPre(java.lang.String idPuestoPre);

    /**
     * Find all TnHistoricoPago entities that matches the condition 'where idPuestoPre is equals to'.
     *
     * @param idPuestoPre java.lang.String
     * @return Collection of TnHistoricoPago
     */
    @FindByCondition(value=TnHistoricoPago.class, condition="ID_PUESTO_PRE=?")
    List<TnHistoricoPago> findByIdPuestoPre(java.lang.String idPuestoPre);

    /**
     * Find the first TnHistoricoPago entity that matches the condition 'where idRangoNom is equals to'.
     *
     * @param idRangoNom java.math.BigDecimal
     * @return TnHistoricoPago
     */
    @FindByCondition(value=TnHistoricoPago.class, condition="ID_RANGO_NOM=?")
    TnHistoricoPago getByIdRangoNom(java.math.BigDecimal idRangoNom);

    /**
     * Find all TnHistoricoPago entities that matches the condition 'where idRangoNom is equals to'.
     *
     * @param idRangoNom java.math.BigDecimal
     * @return Collection of TnHistoricoPago
     */
    @FindByCondition(value=TnHistoricoPago.class, condition="ID_RANGO_NOM=?")
    List<TnHistoricoPago> findByIdRangoNom(java.math.BigDecimal idRangoNom);

    /**
     * Find the first TnHistoricoPago entity that matches the condition 'where idSitPago is equals to'.
     *
     * @param idSitPago java.lang.String
     * @return TnHistoricoPago
     */
    @FindByCondition(value=TnHistoricoPago.class, condition="ID_SIT_PAGO=?")
    TnHistoricoPago getByIdSitPago(java.lang.String idSitPago);

    /**
     * Find all TnHistoricoPago entities that matches the condition 'where idSitPago is equals to'.
     *
     * @param idSitPago java.lang.String
     * @return Collection of TnHistoricoPago
     */
    @FindByCondition(value=TnHistoricoPago.class, condition="ID_SIT_PAGO=?")
    List<TnHistoricoPago> findByIdSitPago(java.lang.String idSitPago);

    /**
     * Find the first TnHistoricoPago entity that matches the condition 'where idTipoNomina is equals to'.
     *
     * @param idTipoNomina java.lang.String
     * @return TnHistoricoPago
     */
    @FindByCondition(value=TnHistoricoPago.class, condition="ID_TIPO_NOMINA=?")
    TnHistoricoPago getByIdTipoNomina(java.lang.String idTipoNomina);

    /**
     * Find all TnHistoricoPago entities that matches the condition 'where idTipoNomina is equals to'.
     *
     * @param idTipoNomina java.lang.String
     * @return Collection of TnHistoricoPago
     */
    @FindByCondition(value=TnHistoricoPago.class, condition="ID_TIPO_NOMINA=?")
    List<TnHistoricoPago> findByIdTipoNomina(java.lang.String idTipoNomina);

    /**
     * Find the first TnHistoricoPago entity that matches the condition 'where idUnidadNom is equals to'.
     *
     * @param idUnidadNom java.lang.String
     * @return TnHistoricoPago
     */
    @FindByCondition(value=TnHistoricoPago.class, condition="ID_UNIDAD_NOM=?")
    TnHistoricoPago getByIdUnidadNom(java.lang.String idUnidadNom);

    /**
     * Find all TnHistoricoPago entities that matches the condition 'where idUnidadNom is equals to'.
     *
     * @param idUnidadNom java.lang.String
     * @return Collection of TnHistoricoPago
     */
    @FindByCondition(value=TnHistoricoPago.class, condition="ID_UNIDAD_NOM=?")
    List<TnHistoricoPago> findByIdUnidadNom(java.lang.String idUnidadNom);

    /**
     * Find the first TnHistoricoPago entity that matches the condition 'where idUnidadPre is equals to'.
     *
     * @param idUnidadPre java.lang.String
     * @return TnHistoricoPago
     */
    @FindByCondition(value=TnHistoricoPago.class, condition="ID_UNIDAD_PRE=?")
    TnHistoricoPago getByIdUnidadPre(java.lang.String idUnidadPre);

    /**
     * Find all TnHistoricoPago entities that matches the condition 'where idUnidadPre is equals to'.
     *
     * @param idUnidadPre java.lang.String
     * @return Collection of TnHistoricoPago
     */
    @FindByCondition(value=TnHistoricoPago.class, condition="ID_UNIDAD_PRE=?")
    List<TnHistoricoPago> findByIdUnidadPre(java.lang.String idUnidadPre);

    /**
     * Find the first TnHistoricoPago entity that matches the condition 'where idZonaDistNom is equals to'.
     *
     * @param idZonaDistNom java.math.BigDecimal
     * @return TnHistoricoPago
     */
    @FindByCondition(value=TnHistoricoPago.class, condition="ID_ZONA_DIST_NOM=?")
    TnHistoricoPago getByIdZonaDistNom(java.math.BigDecimal idZonaDistNom);

    /**
     * Find all TnHistoricoPago entities that matches the condition 'where idZonaDistNom is equals to'.
     *
     * @param idZonaDistNom java.math.BigDecimal
     * @return Collection of TnHistoricoPago
     */
    @FindByCondition(value=TnHistoricoPago.class, condition="ID_ZONA_DIST_NOM=?")
    List<TnHistoricoPago> findByIdZonaDistNom(java.math.BigDecimal idZonaDistNom);

    /**
     * Find the first TnHistoricoPago entity that matches the condition 'where idZonaEcoNom is equals to'.
     *
     * @param idZonaEcoNom java.math.BigDecimal
     * @return TnHistoricoPago
     */
    @FindByCondition(value=TnHistoricoPago.class, condition="ID_ZONA_ECO_NOM=?")
    TnHistoricoPago getByIdZonaEcoNom(java.math.BigDecimal idZonaEcoNom);

    /**
     * Find all TnHistoricoPago entities that matches the condition 'where idZonaEcoNom is equals to'.
     *
     * @param idZonaEcoNom java.math.BigDecimal
     * @return Collection of TnHistoricoPago
     */
    @FindByCondition(value=TnHistoricoPago.class, condition="ID_ZONA_ECO_NOM=?")
    List<TnHistoricoPago> findByIdZonaEcoNom(java.math.BigDecimal idZonaEcoNom);

    /**
     * Find the first TnHistoricoPago entity that matches the condition 'where idZonaEcoPre is equals to'.
     *
     * @param idZonaEcoPre java.math.BigDecimal
     * @return TnHistoricoPago
     */
    @FindByCondition(value=TnHistoricoPago.class, condition="ID_ZONA_ECO_PRE=?")
    TnHistoricoPago getByIdZonaEcoPre(java.math.BigDecimal idZonaEcoPre);

    /**
     * Find all TnHistoricoPago entities that matches the condition 'where idZonaEcoPre is equals to'.
     *
     * @param idZonaEcoPre java.math.BigDecimal
     * @return Collection of TnHistoricoPago
     */
    @FindByCondition(value=TnHistoricoPago.class, condition="ID_ZONA_ECO_PRE=?")
    List<TnHistoricoPago> findByIdZonaEcoPre(java.math.BigDecimal idZonaEcoPre);
}