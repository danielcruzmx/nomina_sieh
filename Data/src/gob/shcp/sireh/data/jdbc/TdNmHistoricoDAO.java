package gob.shcp.sireh.data.jdbc;

import gob.shcp.fsn.data.annotation.Delete;
import gob.shcp.fsn.data.annotation.FindAll;
import gob.shcp.fsn.data.annotation.FindByCondition;
import gob.shcp.fsn.data.annotation.FindById;
import gob.shcp.fsn.data.annotation.Save;
import gob.shcp.fsn.service.data.orm.JdbcDataService;

import java.util.List;

import gob.shcp.sireh.domain.jdbc.TdNmHistorico;


/**
 * Data access interface for TdNmHistorico.
 */
public interface TdNmHistoricoDAO extends JdbcDataService {
    /**
     * Find TdNmHistorico entity by its identifier or primary key value.
     *
     * @param id identifier or primary key
     * @return TdNmHistorico
     */
    @FindById(TdNmHistorico.class)
    TdNmHistorico getById(gob.shcp.sireh.domain.jdbc.TdNmHistoricoPK id);
    
    /**
     * Get all TdNmHistorico entities limited by a maximum number of elements.
     *
     * @return Collection of TdNmHistorico
     */
    @FindAll(TdNmHistorico.class)
    List<TdNmHistorico> findAll();
    
    /**
     * Make persistence of TdNmHistorico entities. If its identifier or primary key is null then create else update.
     *
     * @param entity TdNmHistorico
     */
    @Save
    void save(TdNmHistorico entity);
    
    /**
     * Remove TdNmHistorico entities.
     *
     * @param entity TdNmHistorico
     */
    @Delete
    void delete(TdNmHistorico entity);


    /**
     * Find the first TdNmHistorico entity that matches the condition 'where fecModifico is equals to'.
     *
     * @param fecModifico java.util.Date
     * @return TdNmHistorico
     */
    @FindByCondition(value=TdNmHistorico.class, condition="FEC_MODIFICO=?")
    TdNmHistorico getByFecModifico(java.util.Date fecModifico);

    /**
     * Find all TdNmHistorico entities that matches the condition 'where fecModifico is equals to'.
     *
     * @param fecModifico java.util.Date
     * @return Collection of TdNmHistorico
     */
    @FindByCondition(value=TdNmHistorico.class, condition="FEC_MODIFICO=?")
    List<TdNmHistorico> findByFecModifico(java.util.Date fecModifico);

    /**
     * Find the first TdNmHistorico entity that matches the condition 'where idUnidad is equals to'.
     *
     * @param idUnidad java.lang.String
     * @return TdNmHistorico
     */
    @FindByCondition(value=TdNmHistorico.class, condition="ID_UNIDAD=?")
    TdNmHistorico getByIdUnidad(java.lang.String idUnidad);

    /**
     * Find all TdNmHistorico entities that matches the condition 'where idUnidad is equals to'.
     *
     * @param idUnidad java.lang.String
     * @return Collection of TdNmHistorico
     */
    @FindByCondition(value=TdNmHistorico.class, condition="ID_UNIDAD=?")
    List<TdNmHistorico> findByIdUnidad(java.lang.String idUnidad);

    /**
     * Find the first TdNmHistorico entity that matches the condition 'where usuario is equals to'.
     *
     * @param usuario java.lang.String
     * @return TdNmHistorico
     */
    @FindByCondition(value=TdNmHistorico.class, condition="USUARIO=?")
    TdNmHistorico getByUsuario(java.lang.String usuario);

    /**
     * Find all TdNmHistorico entities that matches the condition 'where usuario is equals to'.
     *
     * @param usuario java.lang.String
     * @return Collection of TdNmHistorico
     */
    @FindByCondition(value=TdNmHistorico.class, condition="USUARIO=?")
    List<TdNmHistorico> findByUsuario(java.lang.String usuario);

    /**
     * Find the first TdNmHistorico entity that matches the condition 'where idGenero is equals to'.
     *
     * @param idGenero java.lang.String
     * @return TdNmHistorico
     */
    @FindByCondition(value=TdNmHistorico.class, condition="ID_GENERO=?")
    TdNmHistorico getByIdGenero(java.lang.String idGenero);

    /**
     * Find all TdNmHistorico entities that matches the condition 'where idGenero is equals to'.
     *
     * @param idGenero java.lang.String
     * @return Collection of TdNmHistorico
     */
    @FindByCondition(value=TdNmHistorico.class, condition="ID_GENERO=?")
    List<TdNmHistorico> findByIdGenero(java.lang.String idGenero);

    /**
     * Find the first TdNmHistorico entity that matches the condition 'where idNivelPto is equals to'.
     *
     * @param idNivelPto java.lang.String
     * @return TdNmHistorico
     */
    @FindByCondition(value=TdNmHistorico.class, condition="ID_NIVEL_PTO=?")
    TdNmHistorico getByIdNivelPto(java.lang.String idNivelPto);

    /**
     * Find all TdNmHistorico entities that matches the condition 'where idNivelPto is equals to'.
     *
     * @param idNivelPto java.lang.String
     * @return Collection of TdNmHistorico
     */
    @FindByCondition(value=TdNmHistorico.class, condition="ID_NIVEL_PTO=?")
    List<TdNmHistorico> findByIdNivelPto(java.lang.String idNivelPto);

    /**
     * Find the first TdNmHistorico entity that matches the condition 'where idPlaza is equals to'.
     *
     * @param idPlaza java.lang.Integer
     * @return TdNmHistorico
     */
    @FindByCondition(value=TdNmHistorico.class, condition="ID_PLAZA=?")
    TdNmHistorico getByIdPlaza(java.lang.Integer idPlaza);

    /**
     * Find all TdNmHistorico entities that matches the condition 'where idPlaza is equals to'.
     *
     * @param idPlaza java.lang.Integer
     * @return Collection of TdNmHistorico
     */
    @FindByCondition(value=TdNmHistorico.class, condition="ID_PLAZA=?")
    List<TdNmHistorico> findByIdPlaza(java.lang.Integer idPlaza);

    /**
     * Find the first TdNmHistorico entity that matches the condition 'where idPuesto is equals to'.
     *
     * @param idPuesto java.lang.String
     * @return TdNmHistorico
     */
    @FindByCondition(value=TdNmHistorico.class, condition="ID_PUESTO=?")
    TdNmHistorico getByIdPuesto(java.lang.String idPuesto);

    /**
     * Find all TdNmHistorico entities that matches the condition 'where idPuesto is equals to'.
     *
     * @param idPuesto java.lang.String
     * @return Collection of TdNmHistorico
     */
    @FindByCondition(value=TdNmHistorico.class, condition="ID_PUESTO=?")
    List<TdNmHistorico> findByIdPuesto(java.lang.String idPuesto);

    /**
     * Find the first TdNmHistorico entity that matches the condition 'where nmhCicloPago is equals to'.
     *
     * @param nmhCicloPago java.lang.Integer
     * @return TdNmHistorico
     */
    @FindByCondition(value=TdNmHistorico.class, condition="NMH_CICLO_PAGO=?")
    TdNmHistorico getByNmhCicloPago(java.lang.Integer nmhCicloPago);

    /**
     * Find all TdNmHistorico entities that matches the condition 'where nmhCicloPago is equals to'.
     *
     * @param nmhCicloPago java.lang.Integer
     * @return Collection of TdNmHistorico
     */
    @FindByCondition(value=TdNmHistorico.class, condition="NMH_CICLO_PAGO=?")
    List<TdNmHistorico> findByNmhCicloPago(java.lang.Integer nmhCicloPago);

    /**
     * Find the first TdNmHistorico entity that matches the condition 'where nmhFechaAgre is equals to'.
     *
     * @param nmhFechaAgre java.util.Date
     * @return TdNmHistorico
     */
    @FindByCondition(value=TdNmHistorico.class, condition="NMH_FECHA_AGRE=?")
    TdNmHistorico getByNmhFechaAgre(java.util.Date nmhFechaAgre);

    /**
     * Find all TdNmHistorico entities that matches the condition 'where nmhFechaAgre is equals to'.
     *
     * @param nmhFechaAgre java.util.Date
     * @return Collection of TdNmHistorico
     */
    @FindByCondition(value=TdNmHistorico.class, condition="NMH_FECHA_AGRE=?")
    List<TdNmHistorico> findByNmhFechaAgre(java.util.Date nmhFechaAgre);

    /**
     * Find the first TdNmHistorico entity that matches the condition 'where nmhFechaReg is equals to'.
     *
     * @param nmhFechaReg java.util.Date
     * @return TdNmHistorico
     */
    @FindByCondition(value=TdNmHistorico.class, condition="NMH_FECHA_REG=?")
    TdNmHistorico getByNmhFechaReg(java.util.Date nmhFechaReg);

    /**
     * Find all TdNmHistorico entities that matches the condition 'where nmhFechaReg is equals to'.
     *
     * @param nmhFechaReg java.util.Date
     * @return Collection of TdNmHistorico
     */
    @FindByCondition(value=TdNmHistorico.class, condition="NMH_FECHA_REG=?")
    List<TdNmHistorico> findByNmhFechaReg(java.util.Date nmhFechaReg);

    /**
     * Find the first TdNmHistorico entity that matches the condition 'where nmhMesCurso is equals to'.
     *
     * @param nmhMesCurso java.lang.String
     * @return TdNmHistorico
     */
    @FindByCondition(value=TdNmHistorico.class, condition="NMH_MES_CURSO=?")
    TdNmHistorico getByNmhMesCurso(java.lang.String nmhMesCurso);

    /**
     * Find all TdNmHistorico entities that matches the condition 'where nmhMesCurso is equals to'.
     *
     * @param nmhMesCurso java.lang.String
     * @return Collection of TdNmHistorico
     */
    @FindByCondition(value=TdNmHistorico.class, condition="NMH_MES_CURSO=?")
    List<TdNmHistorico> findByNmhMesCurso(java.lang.String nmhMesCurso);

    /**
     * Find the first TdNmHistorico entity that matches the condition 'where nmhOp is equals to'.
     *
     * @param nmhOp java.lang.String
     * @return TdNmHistorico
     */
    @FindByCondition(value=TdNmHistorico.class, condition="NMH_OP=?")
    TdNmHistorico getByNmhOp(java.lang.String nmhOp);

    /**
     * Find all TdNmHistorico entities that matches the condition 'where nmhOp is equals to'.
     *
     * @param nmhOp java.lang.String
     * @return Collection of TdNmHistorico
     */
    @FindByCondition(value=TdNmHistorico.class, condition="NMH_OP=?")
    List<TdNmHistorico> findByNmhOp(java.lang.String nmhOp);

    /**
     * Find the first TdNmHistorico entity that matches the condition 'where nmhQnaPagoValidar is equals to'.
     *
     * @param nmhQnaPagoValidar java.lang.Integer
     * @return TdNmHistorico
     */
    @FindByCondition(value=TdNmHistorico.class, condition="NMH_QNA_PAGO_VALIDAR=?")
    TdNmHistorico getByNmhQnaPagoValidar(java.lang.Integer nmhQnaPagoValidar);

    /**
     * Find all TdNmHistorico entities that matches the condition 'where nmhQnaPagoValidar is equals to'.
     *
     * @param nmhQnaPagoValidar java.lang.Integer
     * @return Collection of TdNmHistorico
     */
    @FindByCondition(value=TdNmHistorico.class, condition="NMH_QNA_PAGO_VALIDAR=?")
    List<TdNmHistorico> findByNmhQnaPagoValidar(java.lang.Integer nmhQnaPagoValidar);

    /**
     * Find the first TdNmHistorico entity that matches the condition 'where nmhTipoPlaza is equals to'.
     *
     * @param nmhTipoPlaza java.lang.String
     * @return TdNmHistorico
     */
    @FindByCondition(value=TdNmHistorico.class, condition="NMH_TIPO_PLAZA=?")
    TdNmHistorico getByNmhTipoPlaza(java.lang.String nmhTipoPlaza);

    /**
     * Find all TdNmHistorico entities that matches the condition 'where nmhTipoPlaza is equals to'.
     *
     * @param nmhTipoPlaza java.lang.String
     * @return Collection of TdNmHistorico
     */
    @FindByCondition(value=TdNmHistorico.class, condition="NMH_TIPO_PLAZA=?")
    List<TdNmHistorico> findByNmhTipoPlaza(java.lang.String nmhTipoPlaza);
}