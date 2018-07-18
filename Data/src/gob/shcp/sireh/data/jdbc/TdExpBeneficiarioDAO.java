package gob.shcp.sireh.data.jdbc;

import gob.shcp.fsn.data.annotation.Delete;
import gob.shcp.fsn.data.annotation.FindAll;
import gob.shcp.fsn.data.annotation.FindByCondition;
import gob.shcp.fsn.data.annotation.FindById;
import gob.shcp.fsn.data.annotation.Save;
import gob.shcp.fsn.service.data.orm.JdbcDataService;

import java.util.List;

import gob.shcp.sireh.domain.jdbc.TdExpBeneficiario;

/**
 * Data access interface for TdExpBeneficiario.
 */
public interface TdExpBeneficiarioDAO extends JdbcDataService {
    /**
     * Find TdExpBeneficiario entity by its identifier or primary key value.
     *
     * @param id identifier or primary key
     * @return TdExpBeneficiario
     */
    @FindById(TdExpBeneficiario.class)
    TdExpBeneficiario getById(gob.shcp.sireh.domain.jdbc.TdExpBeneficiarioPK id);

    /**
     * Get all TdExpBeneficiario entities limited by a maximum number of elements.
     *
     * @return Collection of TdExpBeneficiario
     */
    @FindAll(TdExpBeneficiario.class)
    List<TdExpBeneficiario> findAll();

    /**
     * Make persistence of TdExpBeneficiario entities. If its identifier or primary key is null then create else update.
     *
     * @param entity TdExpBeneficiario
     */
    @Save
    void save(TdExpBeneficiario entity);

    /**
     * Remove TdExpBeneficiario entities.
     *
     * @param entity TdExpBeneficiario
     */
    @Delete
    void delete(TdExpBeneficiario entity);


    /**
     * Find the first TdExpBeneficiario entity that matches the condition 'where benDoctoRef is equals to'.
     *
     * @param benDoctoRef java.lang.String
     * @return TdExpBeneficiario
     */
    @FindByCondition(value = TdExpBeneficiario.class, condition = "BEN_DOCTO_REF=?")
    TdExpBeneficiario getByBenDoctoRef(java.lang.String benDoctoRef);

    /**
     * Find all TdExpBeneficiario entities that matches the condition 'where benDoctoRef is equals to'.
     *
     * @param benDoctoRef java.lang.String
     * @return Collection of TdExpBeneficiario
     */
    @FindByCondition(value = TdExpBeneficiario.class, condition = "BEN_DOCTO_REF=?")
    List<TdExpBeneficiario> findByBenDoctoRef(java.lang.String benDoctoRef);

    /**
     * Find the first TdExpBeneficiario entity that matches the condition 'where benNombreEmpleado is equals to'.
     *
     * @param benNombreEmpleado java.lang.String
     * @return TdExpBeneficiario
     */
    @FindByCondition(value = TdExpBeneficiario.class, condition = "BEN_NOMBRE_EMPLEADO=?")
    TdExpBeneficiario getByBenNombreEmpleado(java.lang.String benNombreEmpleado);

    /**
     * Find all TdExpBeneficiario entities that matches the condition 'where benNombreEmpleado is equals to'.
     *
     * @param benNombreEmpleado java.lang.String
     * @return Collection of TdExpBeneficiario
     */
    @FindByCondition(value = TdExpBeneficiario.class, condition = "BEN_NOMBRE_EMPLEADO=?")
    List<TdExpBeneficiario> findByBenNombreEmpleado(java.lang.String benNombreEmpleado);

    /**
     * Find the first TdExpBeneficiario entity that matches the condition 'where fecModifico is equals to'.
     *
     * @param fecModifico java.util.Date
     * @return TdExpBeneficiario
     */
    @FindByCondition(value = TdExpBeneficiario.class, condition = "FEC_MODIFICO=?")
    TdExpBeneficiario getByFecModifico(java.util.Date fecModifico);

    /**
     * Find all TdExpBeneficiario entities that matches the condition 'where fecModifico is equals to'.
     *
     * @param fecModifico java.util.Date
     * @return Collection of TdExpBeneficiario
     */
    @FindByCondition(value = TdExpBeneficiario.class, condition = "FEC_MODIFICO=?")
    List<TdExpBeneficiario> findByFecModifico(java.util.Date fecModifico);

    /**
     * Find the first TdExpBeneficiario entity that matches the condition 'where idParentesco is equals to'.
     *
     * @param idParentesco boolean
     * @return TdExpBeneficiario
     */
    @FindByCondition(value = TdExpBeneficiario.class, condition = "ID_PARENTESCO=?")
    TdExpBeneficiario getByIdParentesco(boolean idParentesco);

    /**
     * Find all TdExpBeneficiario entities that matches the condition 'where idParentesco is equals to'.
     *
     * @param idParentesco boolean
     * @return Collection of TdExpBeneficiario
     */
    @FindByCondition(value = TdExpBeneficiario.class, condition = "ID_PARENTESCO=?")
    List<TdExpBeneficiario> findByIdParentesco(boolean idParentesco);

    /**
     * Find the first TdExpBeneficiario entity that matches the condition 'where idStatus is equals to'.
     *
     * @param idStatus java.lang.String
     * @return TdExpBeneficiario
     */
    @FindByCondition(value = TdExpBeneficiario.class, condition = "ID_STATUS=?")
    TdExpBeneficiario getByIdStatus(java.lang.String idStatus);

    /**
     * Find all TdExpBeneficiario entities that matches the condition 'where idStatus is equals to'.
     *
     * @param idStatus java.lang.String
     * @return Collection of TdExpBeneficiario
     */
    @FindByCondition(value = TdExpBeneficiario.class, condition = "ID_STATUS=?")
    List<TdExpBeneficiario> findByIdStatus(java.lang.String idStatus);

    /**
     * Find the first TdExpBeneficiario entity that matches the condition 'where idTipoBeneficio is equals to'.
     *
     * @param idTipoBeneficio java.lang.String
     * @return TdExpBeneficiario
     */
    @FindByCondition(value = TdExpBeneficiario.class, condition = "ID_TIPO_BENEFICIO=?")
    TdExpBeneficiario getByIdTipoBeneficio(java.lang.String idTipoBeneficio);

    /**
     * Find all TdExpBeneficiario entities that matches the condition 'where idTipoBeneficio is equals to'.
     *
     * @param idTipoBeneficio java.lang.String
     * @return Collection of TdExpBeneficiario
     */
    @FindByCondition(value = TdExpBeneficiario.class, condition = "ID_TIPO_BENEFICIO=?")
    List<TdExpBeneficiario> findByIdTipoBeneficio(java.lang.String idTipoBeneficio);

    /**
     * Find the first TdExpBeneficiario entity that matches the condition 'where usuario is equals to'.
     *
     * @param usuario java.lang.String
     * @return TdExpBeneficiario
     */
    @FindByCondition(value = TdExpBeneficiario.class, condition = "USUARIO=?")
    TdExpBeneficiario getByUsuario(java.lang.String usuario);

    /**
     * Find all TdExpBeneficiario entities that matches the condition 'where usuario is equals to'.
     *
     * @param usuario java.lang.String
     * @return Collection of TdExpBeneficiario
     */
    @FindByCondition(value = TdExpBeneficiario.class, condition = "USUARIO=?")
    List<TdExpBeneficiario> findByUsuario(java.lang.String usuario);

    /**
     * Find the first TdExpBeneficiario entity that matches the condition 'where benImporte is equals to'.
     *
     * @param benImporte java.lang.Float
     * @return TdExpBeneficiario
     */
    @FindByCondition(value = TdExpBeneficiario.class, condition = "BEN_IMPORTE=?")
    TdExpBeneficiario getByBenImporte(java.lang.Float benImporte);

    /**
     * Find all TdExpBeneficiario entities that matches the condition 'where benImporte is equals to'.
     *
     * @param benImporte java.lang.Float
     * @return Collection of TdExpBeneficiario
     */
    @FindByCondition(value = TdExpBeneficiario.class, condition = "BEN_IMPORTE=?")
    List<TdExpBeneficiario> findByBenImporte(java.lang.Float benImporte);

    /**
     * Find the first TdExpBeneficiario entity that matches the condition 'where benPorcentaje is equals to'.
     *
     * @param benPorcentaje java.lang.Float
     * @return TdExpBeneficiario
     */
    @FindByCondition(value = TdExpBeneficiario.class, condition = "BEN_PORCENTAJE=?")
    TdExpBeneficiario getByBenPorcentaje(java.lang.Float benPorcentaje);

    /**
     * Find all TdExpBeneficiario entities that matches the condition 'where benPorcentaje is equals to'.
     *
     * @param benPorcentaje java.lang.Float
     * @return Collection of TdExpBeneficiario
     */
    @FindByCondition(value = TdExpBeneficiario.class, condition = "BEN_PORCENTAJE=?")
    List<TdExpBeneficiario> findByBenPorcentaje(java.lang.Float benPorcentaje);

    /**
     * Find the first TdExpBeneficiario entity that matches the condition 'where benPrimerApellido is equals to'.
     *
     * @param benPrimerApellido java.lang.String
     * @return TdExpBeneficiario
     */
    @FindByCondition(value = TdExpBeneficiario.class, condition = "BEN_PRIMER_APELLIDO=?")
    TdExpBeneficiario getByBenPrimerApellido(java.lang.String benPrimerApellido);

    /**
     * Find all TdExpBeneficiario entities that matches the condition 'where benPrimerApellido is equals to'.
     *
     * @param benPrimerApellido java.lang.String
     * @return Collection of TdExpBeneficiario
     */
    @FindByCondition(value = TdExpBeneficiario.class, condition = "BEN_PRIMER_APELLIDO=?")
    List<TdExpBeneficiario> findByBenPrimerApellido(java.lang.String benPrimerApellido);

    /**
     * Find the first TdExpBeneficiario entity that matches the condition 'where benSegundoApellido is equals to'.
     *
     * @param benSegundoApellido java.lang.String
     * @return TdExpBeneficiario
     */
    @FindByCondition(value = TdExpBeneficiario.class, condition = "BEN_SEGUNDO_APELLIDO=?")
    TdExpBeneficiario getByBenSegundoApellido(java.lang.String benSegundoApellido);

    /**
     * Find all TdExpBeneficiario entities that matches the condition 'where benSegundoApellido is equals to'.
     *
     * @param benSegundoApellido java.lang.String
     * @return Collection of TdExpBeneficiario
     */
    @FindByCondition(value = TdExpBeneficiario.class, condition = "BEN_SEGUNDO_APELLIDO=?")
    List<TdExpBeneficiario> findByBenSegundoApellido(java.lang.String benSegundoApellido);
}
