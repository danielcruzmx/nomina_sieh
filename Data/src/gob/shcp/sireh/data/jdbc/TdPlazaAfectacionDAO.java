package gob.shcp.sireh.data.jdbc;

import gob.shcp.fsn.data.annotation.Delete;
import gob.shcp.fsn.data.annotation.FindAll;
import gob.shcp.fsn.data.annotation.FindByCondition;
import gob.shcp.fsn.data.annotation.FindById;
import gob.shcp.fsn.data.annotation.Save;
import gob.shcp.fsn.service.data.orm.JdbcDataService;

import java.util.List;

import gob.shcp.sireh.domain.jdbc.TdPlazaAfectacion;


/**
 * Data access interface for TdPlazaAfectacion.
 */
public interface TdPlazaAfectacionDAO extends JdbcDataService {
    /**
     * Find TdPlazaAfectacion entity by its identifier or primary key value.
     *
     * @param id identifier or primary key
     * @return TdPlazaAfectacion
     */
    @FindById(TdPlazaAfectacion.class)
    TdPlazaAfectacion getById(gob.shcp.sireh.domain.jdbc.TdPlazaAfectacionPK id);
    
    /**
     * Get all TdPlazaAfectacion entities limited by a maximum number of elements.
     *
     * @return Collection of TdPlazaAfectacion
     */
    @FindAll(TdPlazaAfectacion.class)
    List<TdPlazaAfectacion> findAll();
    
    /**
     * Make persistence of TdPlazaAfectacion entities. If its identifier or primary key is null then create else update.
     *
     * @param entity TdPlazaAfectacion
     */
    @Save
    void save(TdPlazaAfectacion entity);
    
    /**
     * Remove TdPlazaAfectacion entities.
     *
     * @param entity TdPlazaAfectacion
     */
    @Delete
    void delete(TdPlazaAfectacion entity);


    /**
     * Find the first TdPlazaAfectacion entity that matches the condition 'where fecModifico is equals to'.
     *
     * @param fecModifico java.util.Date
     * @return TdPlazaAfectacion
     */
    @FindByCondition(value=TdPlazaAfectacion.class, condition="FEC_MODIFICO=?")
    TdPlazaAfectacion getByFecModifico(java.util.Date fecModifico);

    /**
     * Find all TdPlazaAfectacion entities that matches the condition 'where fecModifico is equals to'.
     *
     * @param fecModifico java.util.Date
     * @return Collection of TdPlazaAfectacion
     */
    @FindByCondition(value=TdPlazaAfectacion.class, condition="FEC_MODIFICO=?")
    List<TdPlazaAfectacion> findByFecModifico(java.util.Date fecModifico);

    /**
     * Find the first TdPlazaAfectacion entity that matches the condition 'where idEdo is equals to'.
     *
     * @param idEdo java.lang.Integer
     * @return TdPlazaAfectacion
     */
    @FindByCondition(value=TdPlazaAfectacion.class, condition="ID_EDO=?")
    TdPlazaAfectacion getByIdEdo(java.lang.Integer idEdo);

    /**
     * Find all TdPlazaAfectacion entities that matches the condition 'where idEdo is equals to'.
     *
     * @param idEdo java.lang.Integer
     * @return Collection of TdPlazaAfectacion
     */
    @FindByCondition(value=TdPlazaAfectacion.class, condition="ID_EDO=?")
    List<TdPlazaAfectacion> findByIdEdo(java.lang.Integer idEdo);

    /**
     * Find the first TdPlazaAfectacion entity that matches the condition 'where idJustificacion is equals to'.
     *
     * @param idJustificacion java.lang.String
     * @return TdPlazaAfectacion
     */
    @FindByCondition(value=TdPlazaAfectacion.class, condition="ID_JUSTIFICACION=?")
    TdPlazaAfectacion getByIdJustificacion(java.lang.String idJustificacion);

    /**
     * Find all TdPlazaAfectacion entities that matches the condition 'where idJustificacion is equals to'.
     *
     * @param idJustificacion java.lang.String
     * @return Collection of TdPlazaAfectacion
     */
    @FindByCondition(value=TdPlazaAfectacion.class, condition="ID_JUSTIFICACION=?")
    List<TdPlazaAfectacion> findByIdJustificacion(java.lang.String idJustificacion);

    /**
     * Find the first TdPlazaAfectacion entity that matches the condition 'where idPuesto is equals to'.
     *
     * @param idPuesto java.lang.String
     * @return TdPlazaAfectacion
     */
    @FindByCondition(value=TdPlazaAfectacion.class, condition="ID_PUESTO=?")
    TdPlazaAfectacion getByIdPuesto(java.lang.String idPuesto);

    /**
     * Find all TdPlazaAfectacion entities that matches the condition 'where idPuesto is equals to'.
     *
     * @param idPuesto java.lang.String
     * @return Collection of TdPlazaAfectacion
     */
    @FindByCondition(value=TdPlazaAfectacion.class, condition="ID_PUESTO=?")
    List<TdPlazaAfectacion> findByIdPuesto(java.lang.String idPuesto);

    /**
     * Find the first TdPlazaAfectacion entity that matches the condition 'where idRegularizable is equals to'.
     *
     * @param idRegularizable java.lang.String
     * @return TdPlazaAfectacion
     */
    @FindByCondition(value=TdPlazaAfectacion.class, condition="ID_REGULARIZABLE=?")
    TdPlazaAfectacion getByIdRegularizable(java.lang.String idRegularizable);

    /**
     * Find all TdPlazaAfectacion entities that matches the condition 'where idRegularizable is equals to'.
     *
     * @param idRegularizable java.lang.String
     * @return Collection of TdPlazaAfectacion
     */
    @FindByCondition(value=TdPlazaAfectacion.class, condition="ID_REGULARIZABLE=?")
    List<TdPlazaAfectacion> findByIdRegularizable(java.lang.String idRegularizable);

    /**
     * Find the first TdPlazaAfectacion entity that matches the condition 'where idZonaEcon is equals to'.
     *
     * @param idZonaEcon java.lang.Boolean
     * @return TdPlazaAfectacion
     */
    @FindByCondition(value=TdPlazaAfectacion.class, condition="ID_ZONA_ECON=?")
    TdPlazaAfectacion getByIdZonaEcon(java.lang.Boolean idZonaEcon);

    /**
     * Find all TdPlazaAfectacion entities that matches the condition 'where idZonaEcon is equals to'.
     *
     * @param idZonaEcon java.lang.Boolean
     * @return Collection of TdPlazaAfectacion
     */
    @FindByCondition(value=TdPlazaAfectacion.class, condition="ID_ZONA_ECON=?")
    List<TdPlazaAfectacion> findByIdZonaEcon(java.lang.Boolean idZonaEcon);

    /**
     * Find the first TdPlazaAfectacion entity that matches the condition 'where plafDiasAguinaldo is equals to'.
     *
     * @param plafDiasAguinaldo java.lang.Integer
     * @return TdPlazaAfectacion
     */
    @FindByCondition(value=TdPlazaAfectacion.class, condition="PLAF_DIAS_AGUINALDO=?")
    TdPlazaAfectacion getByPlafDiasAguinaldo(java.lang.Integer plafDiasAguinaldo);

    /**
     * Find all TdPlazaAfectacion entities that matches the condition 'where plafDiasAguinaldo is equals to'.
     *
     * @param plafDiasAguinaldo java.lang.Integer
     * @return Collection of TdPlazaAfectacion
     */
    @FindByCondition(value=TdPlazaAfectacion.class, condition="PLAF_DIAS_AGUINALDO=?")
    List<TdPlazaAfectacion> findByPlafDiasAguinaldo(java.lang.Integer plafDiasAguinaldo);

    /**
     * Find the first TdPlazaAfectacion entity that matches the condition 'where plafDiasPrima is equals to'.
     *
     * @param plafDiasPrima java.lang.Integer
     * @return TdPlazaAfectacion
     */
    @FindByCondition(value=TdPlazaAfectacion.class, condition="PLAF_DIAS_PRIMA=?")
    TdPlazaAfectacion getByPlafDiasPrima(java.lang.Integer plafDiasPrima);

    /**
     * Find all TdPlazaAfectacion entities that matches the condition 'where plafDiasPrima is equals to'.
     *
     * @param plafDiasPrima java.lang.Integer
     * @return Collection of TdPlazaAfectacion
     */
    @FindByCondition(value=TdPlazaAfectacion.class, condition="PLAF_DIAS_PRIMA=?")
    List<TdPlazaAfectacion> findByPlafDiasPrima(java.lang.Integer plafDiasPrima);

    /**
     * Find the first TdPlazaAfectacion entity that matches the condition 'where plafFinal is equals to'.
     *
     * @param plafFinal java.util.Date
     * @return TdPlazaAfectacion
     */
    @FindByCondition(value=TdPlazaAfectacion.class, condition="PLAF_FINAL=?")
    TdPlazaAfectacion getByPlafFinal(java.util.Date plafFinal);

    /**
     * Find all TdPlazaAfectacion entities that matches the condition 'where plafFinal is equals to'.
     *
     * @param plafFinal java.util.Date
     * @return Collection of TdPlazaAfectacion
     */
    @FindByCondition(value=TdPlazaAfectacion.class, condition="PLAF_FINAL=?")
    List<TdPlazaAfectacion> findByPlafFinal(java.util.Date plafFinal);

    /**
     * Find the first TdPlazaAfectacion entity that matches the condition 'where plafInicio is equals to'.
     *
     * @param plafInicio java.util.Date
     * @return TdPlazaAfectacion
     */
    @FindByCondition(value=TdPlazaAfectacion.class, condition="PLAF_INICIO=?")
    TdPlazaAfectacion getByPlafInicio(java.util.Date plafInicio);

    /**
     * Find all TdPlazaAfectacion entities that matches the condition 'where plafInicio is equals to'.
     *
     * @param plafInicio java.util.Date
     * @return Collection of TdPlazaAfectacion
     */
    @FindByCondition(value=TdPlazaAfectacion.class, condition="PLAF_INICIO=?")
    List<TdPlazaAfectacion> findByPlafInicio(java.util.Date plafInicio);

    /**
     * Find the first TdPlazaAfectacion entity that matches the condition 'where plafProyAmplia is equals to'.
     *
     * @param plafProyAmplia java.lang.String
     * @return TdPlazaAfectacion
     */
    @FindByCondition(value=TdPlazaAfectacion.class, condition="PLAF_PROY_AMPLIA=?")
    TdPlazaAfectacion getByPlafProyAmplia(java.lang.String plafProyAmplia);

    /**
     * Find all TdPlazaAfectacion entities that matches the condition 'where plafProyAmplia is equals to'.
     *
     * @param plafProyAmplia java.lang.String
     * @return Collection of TdPlazaAfectacion
     */
    @FindByCondition(value=TdPlazaAfectacion.class, condition="PLAF_PROY_AMPLIA=?")
    List<TdPlazaAfectacion> findByPlafProyAmplia(java.lang.String plafProyAmplia);

    /**
     * Find the first TdPlazaAfectacion entity that matches the condition 'where plafProyReduce is equals to'.
     *
     * @param plafProyReduce java.lang.String
     * @return TdPlazaAfectacion
     */
    @FindByCondition(value=TdPlazaAfectacion.class, condition="PLAF_PROY_REDUCE=?")
    TdPlazaAfectacion getByPlafProyReduce(java.lang.String plafProyReduce);

    /**
     * Find all TdPlazaAfectacion entities that matches the condition 'where plafProyReduce is equals to'.
     *
     * @param plafProyReduce java.lang.String
     * @return Collection of TdPlazaAfectacion
     */
    @FindByCondition(value=TdPlazaAfectacion.class, condition="PLAF_PROY_REDUCE=?")
    List<TdPlazaAfectacion> findByPlafProyReduce(java.lang.String plafProyReduce);

    /**
     * Find the first TdPlazaAfectacion entity that matches the condition 'where usuario is equals to'.
     *
     * @param usuario java.lang.String
     * @return TdPlazaAfectacion
     */
    @FindByCondition(value=TdPlazaAfectacion.class, condition="USUARIO=?")
    TdPlazaAfectacion getByUsuario(java.lang.String usuario);

    /**
     * Find all TdPlazaAfectacion entities that matches the condition 'where usuario is equals to'.
     *
     * @param usuario java.lang.String
     * @return Collection of TdPlazaAfectacion
     */
    @FindByCondition(value=TdPlazaAfectacion.class, condition="USUARIO=?")
    List<TdPlazaAfectacion> findByUsuario(java.lang.String usuario);
}