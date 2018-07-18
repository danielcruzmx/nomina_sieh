package gob.shcp.sireh.data.jdbc.rusp;

import gob.shcp.fsn.data.annotation.Delete;
import gob.shcp.fsn.data.annotation.FindAll;
import gob.shcp.fsn.data.annotation.FindByCondition;
import gob.shcp.fsn.data.annotation.FindById;
import gob.shcp.fsn.data.annotation.FindByNamedQuery;
import gob.shcp.fsn.data.annotation.Save;
import gob.shcp.fsn.service.data.orm.JdbcDataService;

import gob.shcp.sireh.domain.jdbc.CustomOutputFile;

import java.util.List;

import gob.shcp.sireh.domain.jdbc.rusp.TdRuspBaja;

import java.util.Map;

/**
 * Data access interface for TdRuspBaja.
 */
public interface TdRuspBajaDAO extends JdbcDataService {
    
    /**
     * Find TdRuspBaja entity by its identifier or primary key value.
     *
     * @param id identifier or primary key
     * @return TdRuspBaja
     */
    @FindById(TdRuspBaja.class)
    TdRuspBaja getById(gob.shcp.sireh.domain.jdbc.rusp.TdRuspBajaPK id);

    /**
     * Get all TdRuspBaja entities limited by a maximum number of elements.
     *
     * @return Collection of TdRuspBaja
     */
    @FindAll(TdRuspBaja.class)
    List<TdRuspBaja> findAll();

    /**
     * Make persistence of TdRuspBaja entities. If its identifier or primary key is null then create else update.
     *
     * @param entity TdRuspBaja
     */
    @Save
    void save(TdRuspBaja entity);

    /**
     * Remove TdRuspBaja entities.
     *
     * @param entity TdRuspBaja
     */
    @Delete
    void delete(TdRuspBaja entity);


    /**
     * Find the first TdRuspBaja entity that matches the condition 'where fecModifico is equals to'.
     *
     * @param fecModifico java.util.Date
     * @return TdRuspBaja
     */
    @FindByCondition(value = TdRuspBaja.class, condition = "FEC_MODIFICO=?")
    TdRuspBaja getByFecModifico(java.util.Date fecModifico);

    /**
     * Find all TdRuspBaja entities that matches the condition 'where fecModifico is equals to'.
     *
     * @param fecModifico java.util.Date
     * @return Collection of TdRuspBaja
     */
    @FindByCondition(value = TdRuspBaja.class, condition = "FEC_MODIFICO=?")
    List<TdRuspBaja> findByFecModifico(java.util.Date fecModifico);

    /**
     * Find the first TdRuspBaja entity that matches the condition 'where usuario is equals to'.
     *
     * @param usuario java.lang.String
     * @return TdRuspBaja
     */
    @FindByCondition(value = TdRuspBaja.class, condition = "USUARIO=?")
    TdRuspBaja getByUsuario(java.lang.String usuario);

    /**
     * Find all TdRuspBaja entities that matches the condition 'where usuario is equals to'.
     *
     * @param usuario java.lang.String
     * @return Collection of TdRuspBaja
     */
    @FindByCondition(value = TdRuspBaja.class, condition = "USUARIO=?")
    List<TdRuspBaja> findByUsuario(java.lang.String usuario);

    /**
     * Find the first TdRuspBaja entity that matches the condition 'where idUnidad is equals to'.
     *
     * @param idUnidad java.lang.String
     * @return TdRuspBaja
     */
    @FindByCondition(value = TdRuspBaja.class, condition = "ID_UNIDAD=?")
    TdRuspBaja getByIdUnidad(java.lang.String idUnidad);

    /**
     * Find all TdRuspBaja entities that matches the condition 'where idUnidad is equals to'.
     *
     * @param idUnidad java.lang.String
     * @return Collection of TdRuspBaja
     */
    @FindByCondition(value = TdRuspBaja.class, condition = "ID_UNIDAD=?")
    List<TdRuspBaja> findByIdUnidad(java.lang.String idUnidad);

    /**
     * Find the first TdRuspBaja entity that matches the condition 'where rbCurp is equals to'.
     *
     * @param rbCurp java.lang.String
     * @return TdRuspBaja
     */
    @FindByCondition(value = TdRuspBaja.class, condition = "RB_CURP=?")
    TdRuspBaja getByRbCurp(java.lang.String rbCurp);

    /**
     * Find all TdRuspBaja entities that matches the condition 'where rbCurp is equals to'.
     *
     * @param rbCurp java.lang.String
     * @return Collection of TdRuspBaja
     */
    @FindByCondition(value = TdRuspBaja.class, condition = "RB_CURP=?")
    List<TdRuspBaja> findByRbCurp(java.lang.String rbCurp);

    /**
     * Find the first TdRuspBaja entity that matches the condition 'where rbFechaBaja is equals to'.
     *
     * @param rbFechaBaja java.util.Date
     * @return TdRuspBaja
     */
    @FindByCondition(value = TdRuspBaja.class, condition = "RB_FECHA_BAJA=?")
    TdRuspBaja getByRbFechaBaja(java.util.Date rbFechaBaja);

    /**
     * Find all TdRuspBaja entities that matches the condition 'where rbFechaBaja is equals to'.
     *
     * @param rbFechaBaja java.util.Date
     * @return Collection of TdRuspBaja
     */
    @FindByCondition(value = TdRuspBaja.class, condition = "RB_FECHA_BAJA=?")
    List<TdRuspBaja> findByRbFechaBaja(java.util.Date rbFechaBaja);

    /**
     * Find the first TdRuspBaja entity that matches the condition 'where rbMotivoBaja is equals to'.
     *
     * @param rbMotivoBaja java.lang.Integer
     * @return TdRuspBaja
     */
    @FindByCondition(value = TdRuspBaja.class, condition = "RB_MOTIVO_BAJA=?")
    TdRuspBaja getByRbMotivoBaja(java.lang.Integer rbMotivoBaja);

    /**
     * Find all TdRuspBaja entities that matches the condition 'where rbMotivoBaja is equals to'.
     *
     * @param rbMotivoBaja java.lang.Integer
     * @return Collection of TdRuspBaja
     */
    @FindByCondition(value = TdRuspBaja.class, condition = "RB_MOTIVO_BAJA=?")
    List<TdRuspBaja> findByRbMotivoBaja(java.lang.Integer rbMotivoBaja);

    /**
     * Find the first TdRuspBaja entity that matches the condition 'where rbNombre is equals to'.
     *
     * @param rbNombre java.lang.String
     * @return TdRuspBaja
     */
    @FindByCondition(value = TdRuspBaja.class, condition = "RB_NOMBRE=?")
    TdRuspBaja getByRbNombre(java.lang.String rbNombre);

    /**
     * Find all TdRuspBaja entities that matches the condition 'where rbNombre is equals to'.
     *
     * @param rbNombre java.lang.String
     * @return Collection of TdRuspBaja
     */
    @FindByCondition(value = TdRuspBaja.class, condition = "RB_NOMBRE=?")
    List<TdRuspBaja> findByRbNombre(java.lang.String rbNombre);

    /**
     * Find the first TdRuspBaja entity that matches the condition 'where rbNumEmpleado is equals to'.
     *
     * @param rbNumEmpleado java.lang.String
     * @return TdRuspBaja
     */
    @FindByCondition(value = TdRuspBaja.class, condition = "RB_NUM_EMPLEADO=?")
    TdRuspBaja getByRbNumEmpleado(java.lang.String rbNumEmpleado);

    /**
     * Find all TdRuspBaja entities that matches the condition 'where rbNumEmpleado is equals to'.
     *
     * @param rbNumEmpleado java.lang.String
     * @return Collection of TdRuspBaja
     */
    @FindByCondition(value = TdRuspBaja.class, condition = "RB_NUM_EMPLEADO=?")
    List<TdRuspBaja> findByRbNumEmpleado(java.lang.String rbNumEmpleado);

    /**
     * Find the first TdRuspBaja entity that matches the condition 'where rbPrimerApellido is equals to'.
     *
     * @param rbPrimerApellido java.lang.String
     * @return TdRuspBaja
     */
    @FindByCondition(value = TdRuspBaja.class, condition = "RB_PRIMER_APELLIDO=?")
    TdRuspBaja getByRbPrimerApellido(java.lang.String rbPrimerApellido);

    /**
     * Find all TdRuspBaja entities that matches the condition 'where rbPrimerApellido is equals to'.
     *
     * @param rbPrimerApellido java.lang.String
     * @return Collection of TdRuspBaja
     */
    @FindByCondition(value = TdRuspBaja.class, condition = "RB_PRIMER_APELLIDO=?")
    List<TdRuspBaja> findByRbPrimerApellido(java.lang.String rbPrimerApellido);

    /**
     * Find the first TdRuspBaja entity that matches the condition 'where rbRamo is equals to'.
     *
     * @param rbRamo java.lang.Integer
     * @return TdRuspBaja
     */
    @FindByCondition(value = TdRuspBaja.class, condition = "RB_RAMO=?")
    TdRuspBaja getByRbRamo(java.lang.Integer rbRamo);

    /**
     * Find all TdRuspBaja entities that matches the condition 'where rbRamo is equals to'.
     *
     * @param rbRamo java.lang.Integer
     * @return Collection of TdRuspBaja
     */
    @FindByCondition(value = TdRuspBaja.class, condition = "RB_RAMO=?")
    List<TdRuspBaja> findByRbRamo(java.lang.Integer rbRamo);

    /**
     * Find the first TdRuspBaja entity that matches the condition 'where rbSegundoApellido is equals to'.
     *
     * @param rbSegundoApellido java.lang.String
     * @return TdRuspBaja
     */
    @FindByCondition(value = TdRuspBaja.class, condition = "RB_SEGUNDO_APELLIDO=?")
    TdRuspBaja getByRbSegundoApellido(java.lang.String rbSegundoApellido);

    /**
     * Find all TdRuspBaja entities that matches the condition 'where rbSegundoApellido is equals to'.
     *
     * @param rbSegundoApellido java.lang.String
     * @return Collection of TdRuspBaja
     */
    @FindByCondition(value = TdRuspBaja.class, condition = "RB_SEGUNDO_APELLIDO=?")
    List<TdRuspBaja> findByRbSegundoApellido(java.lang.String rbSegundoApellido);

}
