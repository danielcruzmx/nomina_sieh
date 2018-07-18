package gob.shcp.sireh.data.jdbc;

import gob.shcp.fsn.data.annotation.Delete;
import gob.shcp.fsn.data.annotation.FindAll;
import gob.shcp.fsn.data.annotation.FindByCondition;
import gob.shcp.fsn.data.annotation.FindById;
import gob.shcp.fsn.data.annotation.Save;
import gob.shcp.fsn.service.data.orm.JdbcDataService;

import java.util.List;

import gob.shcp.sireh.domain.jdbc.TdExpDatosNacimiento;

/**
 * Data access interface for TdExpDatosNacimiento.
 */
public interface TdExpDatosNacimientoDAO extends JdbcDataService {
    /**
     * Find TdExpDatosNacimiento entity by its identifier or primary key value.
     *
     * @param id identifier or primary key
     * @return TdExpDatosNacimiento
     */
    @FindById(TdExpDatosNacimiento.class)
    TdExpDatosNacimiento getById(gob.shcp.sireh.domain.jdbc.TdExpDatosNacimientoPK id);

    /**
     * Get all TdExpDatosNacimiento entities limited by a maximum number of elements.
     *
     * @return Collection of TdExpDatosNacimiento
     */
    @FindAll(TdExpDatosNacimiento.class)
    List<TdExpDatosNacimiento> findAll();

    /**
     * Make persistence of TdExpDatosNacimiento entities. If its identifier or primary key is null then create else update.
     *
     * @param entity TdExpDatosNacimiento
     */
    @Save
    void save(TdExpDatosNacimiento entity);

    /**
     * Remove TdExpDatosNacimiento entities.
     *
     * @param entity TdExpDatosNacimiento
     */
    @Delete
    void delete(TdExpDatosNacimiento entity);


    /**
     * Find the first TdExpDatosNacimiento entity that matches the condition 'where dnaDoctoRef is equals to'.
     *
     * @param dnaDoctoRef java.lang.String
     * @return TdExpDatosNacimiento
     */
    @FindByCondition(value = TdExpDatosNacimiento.class, condition = "DNA_DOCTO_REF=?")
    TdExpDatosNacimiento getByDnaDoctoRef(java.lang.String dnaDoctoRef);

    /**
     * Find all TdExpDatosNacimiento entities that matches the condition 'where dnaDoctoRef is equals to'.
     *
     * @param dnaDoctoRef java.lang.String
     * @return Collection of TdExpDatosNacimiento
     */
    @FindByCondition(value = TdExpDatosNacimiento.class, condition = "DNA_DOCTO_REF=?")
    List<TdExpDatosNacimiento> findByDnaDoctoRef(java.lang.String dnaDoctoRef);

    /**
     * Find the first TdExpDatosNacimiento entity that matches the condition 'where dnaFecNacimiento is equals to'.
     *
     * @param dnaFecNacimiento java.util.Date
     * @return TdExpDatosNacimiento
     */
    @FindByCondition(value = TdExpDatosNacimiento.class, condition = "DNA_FEC_NACIMIENTO=?")
    TdExpDatosNacimiento getByDnaFecNacimiento(java.util.Date dnaFecNacimiento);

    /**
     * Find all TdExpDatosNacimiento entities that matches the condition 'where dnaFecNacimiento is equals to'.
     *
     * @param dnaFecNacimiento java.util.Date
     * @return Collection of TdExpDatosNacimiento
     */
    @FindByCondition(value = TdExpDatosNacimiento.class, condition = "DNA_FEC_NACIMIENTO=?")
    List<TdExpDatosNacimiento> findByDnaFecNacimiento(java.util.Date dnaFecNacimiento);

    /**
     * Find the first TdExpDatosNacimiento entity that matches the condition 'where dnaNombreEmpleado is equals to'.
     *
     * @param dnaNombreEmpleado java.lang.String
     * @return TdExpDatosNacimiento
     */
    @FindByCondition(value = TdExpDatosNacimiento.class, condition = "DNA_NOMBRE_EMPLEADO=?")
    TdExpDatosNacimiento getByDnaNombreEmpleado(java.lang.String dnaNombreEmpleado);

    /**
     * Find all TdExpDatosNacimiento entities that matches the condition 'where dnaNombreEmpleado is equals to'.
     *
     * @param dnaNombreEmpleado java.lang.String
     * @return Collection of TdExpDatosNacimiento
     */
    @FindByCondition(value = TdExpDatosNacimiento.class, condition = "DNA_NOMBRE_EMPLEADO=?")
    List<TdExpDatosNacimiento> findByDnaNombreEmpleado(java.lang.String dnaNombreEmpleado);

    /**
     * Find the first TdExpDatosNacimiento entity that matches the condition 'where fecModifico is equals to'.
     *
     * @param fecModifico java.util.Date
     * @return TdExpDatosNacimiento
     */
    @FindByCondition(value = TdExpDatosNacimiento.class, condition = "FEC_MODIFICO=?")
    TdExpDatosNacimiento getByFecModifico(java.util.Date fecModifico);

    /**
     * Find all TdExpDatosNacimiento entities that matches the condition 'where fecModifico is equals to'.
     *
     * @param fecModifico java.util.Date
     * @return Collection of TdExpDatosNacimiento
     */
    @FindByCondition(value = TdExpDatosNacimiento.class, condition = "FEC_MODIFICO=?")
    List<TdExpDatosNacimiento> findByFecModifico(java.util.Date fecModifico);

    /**
     * Find the first TdExpDatosNacimiento entity that matches the condition 'where idEdo is equals to'.
     *
     * @param idEdo int
     * @return TdExpDatosNacimiento
     */
    @FindByCondition(value = TdExpDatosNacimiento.class, condition = "ID_EDO=?")
    TdExpDatosNacimiento getByIdEdo(int idEdo);

    /**
     * Find all TdExpDatosNacimiento entities that matches the condition 'where idEdo is equals to'.
     *
     * @param idEdo int
     * @return Collection of TdExpDatosNacimiento
     */
    @FindByCondition(value = TdExpDatosNacimiento.class, condition = "ID_EDO=?")
    List<TdExpDatosNacimiento> findByIdEdo(int idEdo);

    /**
     * Find the first TdExpDatosNacimiento entity that matches the condition 'where idNacionalidad is equals to'.
     *
     * @param idNacionalidad Strinh
     * @return TdExpDatosNacimiento
     */
    @FindByCondition(value = TdExpDatosNacimiento.class, condition = "ID_NACIONALIDAD=?")
    TdExpDatosNacimiento getByIdNacionalidad(String idNacionalidad);

    /**
     * Find all TdExpDatosNacimiento entities that matches the condition 'where idNacionalidad is equals to'.
     *
     * @param idNacionalidad String
     * @return Collection of TdExpDatosNacimiento
     */
    @FindByCondition(value = TdExpDatosNacimiento.class, condition = "ID_NACIONALIDAD=?")
    List<TdExpDatosNacimiento> findByIdNacionalidad(String idNacionalidad);

    /**
     * Find the first TdExpDatosNacimiento entity that matches the condition 'where idPais is equals to'.
     *
     * @param idPais java.lang.String
     * @return TdExpDatosNacimiento
     */
    @FindByCondition(value = TdExpDatosNacimiento.class, condition = "ID_PAIS=?")
    TdExpDatosNacimiento getByIdPais(java.lang.String idPais);

    /**
     * Find all TdExpDatosNacimiento entities that matches the condition 'where idPais is equals to'.
     *
     * @param idPais java.lang.String
     * @return Collection of TdExpDatosNacimiento
     */
    @FindByCondition(value = TdExpDatosNacimiento.class, condition = "ID_PAIS=?")
    List<TdExpDatosNacimiento> findByIdPais(java.lang.String idPais);

    /**
     * Find the first TdExpDatosNacimiento entity that matches the condition 'where idStatus is equals to'.
     *
     * @param idStatus java.lang.String
     * @return TdExpDatosNacimiento
     */
    @FindByCondition(value = TdExpDatosNacimiento.class, condition = "ID_STATUS=?")
    TdExpDatosNacimiento getByIdStatus(java.lang.String idStatus);

    /**
     * Find all TdExpDatosNacimiento entities that matches the condition 'where idStatus is equals to'.
     *
     * @param idStatus java.lang.String
     * @return Collection of TdExpDatosNacimiento
     */
    @FindByCondition(value = TdExpDatosNacimiento.class, condition = "ID_STATUS=?")
    List<TdExpDatosNacimiento> findByIdStatus(java.lang.String idStatus);

    /**
     * Find the first TdExpDatosNacimiento entity that matches the condition 'where usuario is equals to'.
     *
     * @param usuario java.lang.String
     * @return TdExpDatosNacimiento
     */
    @FindByCondition(value = TdExpDatosNacimiento.class, condition = "USUARIO=?")
    TdExpDatosNacimiento getByUsuario(java.lang.String usuario);

    /**
     * Find all TdExpDatosNacimiento entities that matches the condition 'where usuario is equals to'.
     *
     * @param usuario java.lang.String
     * @return Collection of TdExpDatosNacimiento
     */
    @FindByCondition(value = TdExpDatosNacimiento.class, condition = "USUARIO=?")
    List<TdExpDatosNacimiento> findByUsuario(java.lang.String usuario);

    /**
     * Find the first TdExpDatosNacimiento entity that matches the condition 'where dnaExtranjerosFm3 is equals to'.
     *
     * @param dnaExtranjerosFm3 java.lang.String
     * @return TdExpDatosNacimiento
     */
    @FindByCondition(value = TdExpDatosNacimiento.class, condition = "DNA_EXTRANJEROS_FM3=?")
    TdExpDatosNacimiento getByDnaExtranjerosFm3(java.lang.String dnaExtranjerosFm3);

    /**
     * Find all TdExpDatosNacimiento entities that matches the condition 'where dnaExtranjerosFm3 is equals to'.
     *
     * @param dnaExtranjerosFm3 java.lang.String
     * @return Collection of TdExpDatosNacimiento
     */
    @FindByCondition(value = TdExpDatosNacimiento.class, condition = "DNA_EXTRANJEROS_FM3=?")
    List<TdExpDatosNacimiento> findByDnaExtranjerosFm3(java.lang.String dnaExtranjerosFm3);

    /**
     * Find the first TdExpDatosNacimiento entity that matches the condition 'where dnaPrimerApellido is equals to'.
     *
     * @param dnaPrimerApellido java.lang.String
     * @return TdExpDatosNacimiento
     */
    @FindByCondition(value = TdExpDatosNacimiento.class, condition = "DNA_PRIMER_APELLIDO=?")
    TdExpDatosNacimiento getByDnaPrimerApellido(java.lang.String dnaPrimerApellido);

    /**
     * Find all TdExpDatosNacimiento entities that matches the condition 'where dnaPrimerApellido is equals to'.
     *
     * @param dnaPrimerApellido java.lang.String
     * @return Collection of TdExpDatosNacimiento
     */
    @FindByCondition(value = TdExpDatosNacimiento.class, condition = "DNA_PRIMER_APELLIDO=?")
    List<TdExpDatosNacimiento> findByDnaPrimerApellido(java.lang.String dnaPrimerApellido);

    /**
     * Find the first TdExpDatosNacimiento entity that matches the condition 'where dnaSegundoApellido is equals to'.
     *
     * @param dnaSegundoApellido java.lang.String
     * @return TdExpDatosNacimiento
     */
    @FindByCondition(value = TdExpDatosNacimiento.class, condition = "DNA_SEGUNDO_APELLIDO=?")
    TdExpDatosNacimiento getByDnaSegundoApellido(java.lang.String dnaSegundoApellido);

    /**
     * Find all TdExpDatosNacimiento entities that matches the condition 'where dnaSegundoApellido is equals to'.
     *
     * @param dnaSegundoApellido java.lang.String
     * @return Collection of TdExpDatosNacimiento
     */
    @FindByCondition(value = TdExpDatosNacimiento.class, condition = "DNA_SEGUNDO_APELLIDO=?")
    List<TdExpDatosNacimiento> findByDnaSegundoApellido(java.lang.String dnaSegundoApellido);
}
