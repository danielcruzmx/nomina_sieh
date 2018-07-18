package gob.shcp.sireh.data.jdbc;

import gob.shcp.fsn.data.annotation.Delete;
import gob.shcp.fsn.data.annotation.FindAll;
import gob.shcp.fsn.data.annotation.FindByCondition;
import gob.shcp.fsn.data.annotation.FindById;
import gob.shcp.fsn.data.annotation.Save;
import gob.shcp.fsn.service.data.orm.JdbcDataService;

import java.util.List;

import gob.shcp.sireh.domain.jdbc.TcMovsPersonal;


/**
 * Data access interface for TcMovsPersonal.
 */
public interface TcMovsPersonalDAO extends JdbcDataService {
    /**
     * Find TcMovsPersonal entity by its identifier or primary key value.
     *
     * @param id identifier or primary key
     * @return TcMovsPersonal
     */
    @FindById(TcMovsPersonal.class)
    TcMovsPersonal getById(java.lang.Integer id);
    
    /**
     * Get all TcMovsPersonal entities limited by a maximum number of elements.
     *
     * @return Collection of TcMovsPersonal
     */
    @FindAll(TcMovsPersonal.class)
    List<TcMovsPersonal> findAll();
    
    /**
     * Make persistence of TcMovsPersonal entities. If its identifier or primary key is null then create else update.
     *
     * @param entity TcMovsPersonal
     */
    @Save
    void save(TcMovsPersonal entity);
    
    /**
     * Remove TcMovsPersonal entities.
     *
     * @param entity TcMovsPersonal
     */
    @Delete
    void delete(TcMovsPersonal entity);


    /**
     * Find the first TcMovsPersonal entity that matches the condition 'where fecModifico is equals to'.
     *
     * @param fecModifico java.util.Date
     * @return TcMovsPersonal
     */
    @FindByCondition(value=TcMovsPersonal.class, condition="FEC_MODIFICO=?")
    TcMovsPersonal getByFecModifico(java.util.Date fecModifico);

    /**
     * Find all TcMovsPersonal entities that matches the condition 'where fecModifico is equals to'.
     *
     * @param fecModifico java.util.Date
     * @return Collection of TcMovsPersonal
     */
    @FindByCondition(value=TcMovsPersonal.class, condition="FEC_MODIFICO=?")
    List<TcMovsPersonal> findByFecModifico(java.util.Date fecModifico);

    /**
     * Find the first TcMovsPersonal entity that matches the condition 'where usuario is equals to'.
     *
     * @param usuario java.lang.String
     * @return TcMovsPersonal
     */
    @FindByCondition(value=TcMovsPersonal.class, condition="USUARIO=?")
    TcMovsPersonal getByUsuario(java.lang.String usuario);

    /**
     * Find all TcMovsPersonal entities that matches the condition 'where usuario is equals to'.
     *
     * @param usuario java.lang.String
     * @return Collection of TcMovsPersonal
     */
    @FindByCondition(value=TcMovsPersonal.class, condition="USUARIO=?")
    List<TcMovsPersonal> findByUsuario(java.lang.String usuario);

    /**
     * Find the first TcMovsPersonal entity that matches the condition 'where descMovsPersonal is equals to'.
     *
     * @param descMovsPersonal java.lang.String
     * @return TcMovsPersonal
     */
    @FindByCondition(value=TcMovsPersonal.class, condition="DESC_MOVS_PERSONAL=?")
    TcMovsPersonal getByDescMovsPersonal(java.lang.String descMovsPersonal);

    /**
     * Find all TcMovsPersonal entities that matches the condition 'where descMovsPersonal is equals to'.
     *
     * @param descMovsPersonal java.lang.String
     * @return Collection of TcMovsPersonal
     */
    @FindByCondition(value=TcMovsPersonal.class, condition="DESC_MOVS_PERSONAL=?")
    List<TcMovsPersonal> findByDescMovsPersonal(java.lang.String descMovsPersonal);

    /**
     * Find the first TcMovsPersonal entity that matches the condition 'where idSitPlaAnt is equals to'.
     *
     * @param idSitPlaAnt java.lang.String
     * @return TcMovsPersonal
     */
    @FindByCondition(value=TcMovsPersonal.class, condition="ID_SIT_PLA_ANT=?")
    TcMovsPersonal getByIdSitPlaAnt(java.lang.String idSitPlaAnt);

    /**
     * Find all TcMovsPersonal entities that matches the condition 'where idSitPlaAnt is equals to'.
     *
     * @param idSitPlaAnt java.lang.String
     * @return Collection of TcMovsPersonal
     */
    @FindByCondition(value=TcMovsPersonal.class, condition="ID_SIT_PLA_ANT=?")
    List<TcMovsPersonal> findByIdSitPlaAnt(java.lang.String idSitPlaAnt);

    /**
     * Find the first TcMovsPersonal entity that matches the condition 'where mpConstancia is equals to'.
     *
     * @param mpConstancia java.lang.String
     * @return TcMovsPersonal
     */
    @FindByCondition(value=TcMovsPersonal.class, condition="MP_CONSTANCIA=?")
    TcMovsPersonal getByMpConstancia(java.lang.String mpConstancia);

    /**
     * Find all TcMovsPersonal entities that matches the condition 'where mpConstancia is equals to'.
     *
     * @param mpConstancia java.lang.String
     * @return Collection of TcMovsPersonal
     */
    @FindByCondition(value=TcMovsPersonal.class, condition="MP_CONSTANCIA=?")
    List<TcMovsPersonal> findByMpConstancia(java.lang.String mpConstancia);

    /**
     * Find the first TcMovsPersonal entity that matches the condition 'where mpGrupoPago is equals to'.
     *
     * @param mpGrupoPago java.lang.String
     * @return TcMovsPersonal
     */
    @FindByCondition(value=TcMovsPersonal.class, condition="MP_GRUPO_PAGO=?")
    TcMovsPersonal getByMpGrupoPago(java.lang.String mpGrupoPago);

    /**
     * Find all TcMovsPersonal entities that matches the condition 'where mpGrupoPago is equals to'.
     *
     * @param mpGrupoPago java.lang.String
     * @return Collection of TcMovsPersonal
     */
    @FindByCondition(value=TcMovsPersonal.class, condition="MP_GRUPO_PAGO=?")
    List<TcMovsPersonal> findByMpGrupoPago(java.lang.String mpGrupoPago);

    /**
     * Find the first TcMovsPersonal entity that matches the condition 'where mpJerarquia is equals to'.
     *
     * @param mpJerarquia java.lang.String
     * @return TcMovsPersonal
     */
    @FindByCondition(value=TcMovsPersonal.class, condition="MP_JERARQUIA=?")
    TcMovsPersonal getByMpJerarquia(java.lang.String mpJerarquia);

    /**
     * Find all TcMovsPersonal entities that matches the condition 'where mpJerarquia is equals to'.
     *
     * @param mpJerarquia java.lang.String
     * @return Collection of TcMovsPersonal
     */
    @FindByCondition(value=TcMovsPersonal.class, condition="MP_JERARQUIA=?")
    List<TcMovsPersonal> findByMpJerarquia(java.lang.String mpJerarquia);

    /**
     * Find the first TcMovsPersonal entity that matches the condition 'where mpNombramiento is equals to'.
     *
     * @param mpNombramiento java.lang.String
     * @return TcMovsPersonal
     */
    @FindByCondition(value=TcMovsPersonal.class, condition="MP_NOMBRAMIENTO=?")
    TcMovsPersonal getByMpNombramiento(java.lang.String mpNombramiento);

    /**
     * Find all TcMovsPersonal entities that matches the condition 'where mpNombramiento is equals to'.
     *
     * @param mpNombramiento java.lang.String
     * @return Collection of TcMovsPersonal
     */
    @FindByCondition(value=TcMovsPersonal.class, condition="MP_NOMBRAMIENTO=?")
    List<TcMovsPersonal> findByMpNombramiento(java.lang.String mpNombramiento);

    /**
     * Find the first TcMovsPersonal entity that matches the condition 'where mpTipoMovMenu is equals to'.
     *
     * @param mpTipoMovMenu java.lang.String
     * @return TcMovsPersonal
     */
    @FindByCondition(value=TcMovsPersonal.class, condition="MP_TIPO_MOV_MENU=?")
    TcMovsPersonal getByMpTipoMovMenu(java.lang.String mpTipoMovMenu);

    /**
     * Find all TcMovsPersonal entities that matches the condition 'where mpTipoMovMenu is equals to'.
     *
     * @param mpTipoMovMenu java.lang.String
     * @return Collection of TcMovsPersonal
     */
    @FindByCondition(value=TcMovsPersonal.class, condition="MP_TIPO_MOV_MENU=?")
    List<TcMovsPersonal> findByMpTipoMovMenu(java.lang.String mpTipoMovMenu);
}