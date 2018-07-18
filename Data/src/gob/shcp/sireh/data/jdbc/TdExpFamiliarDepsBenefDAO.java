package gob.shcp.sireh.data.jdbc;

import gob.shcp.fsn.data.annotation.Delete;
import gob.shcp.fsn.data.annotation.FindAll;
import gob.shcp.fsn.data.annotation.FindByCondition;
import gob.shcp.fsn.data.annotation.FindById;
import gob.shcp.fsn.data.annotation.Save;
import gob.shcp.fsn.service.data.orm.JdbcDataService;

import java.util.List;

import gob.shcp.sireh.domain.jdbc.TdExpFamiliarDepsBenef;


/**
 * Data access interface for TdExpFamiliarDepsBenef.
 */
public interface TdExpFamiliarDepsBenefDAO extends JdbcDataService {
    /**
     * Find TdExpFamiliarDepsBenef entity by its identifier or primary key value.
     *
     * @param id identifier or primary key
     * @return TdExpFamiliarDepsBenef
     */
    @FindById(TdExpFamiliarDepsBenef.class)
    TdExpFamiliarDepsBenef getById(gob.shcp.sireh.domain.jdbc.TdExpFamiliarDepsBenefPK id);
    
    /**
     * Get all TdExpFamiliarDepsBenef entities limited by a maximum number of elements.
     *
     * @return Collection of TdExpFamiliarDepsBenef
     */
    @FindAll(TdExpFamiliarDepsBenef.class)
    List<TdExpFamiliarDepsBenef> findAll();
    
    /**
     * Make persistence of TdExpFamiliarDepsBenef entities. If its identifier or primary key is null then create else update.
     *
     * @param entity TdExpFamiliarDepsBenef
     */
    @Save
    void save(TdExpFamiliarDepsBenef entity);
    
    /**
     * Remove TdExpFamiliarDepsBenef entities.
     *
     * @param entity TdExpFamiliarDepsBenef
     */
    @Delete
    void delete(TdExpFamiliarDepsBenef entity);


    /**
     * Find the first TdExpFamiliarDepsBenef entity that matches the condition 'where fdbFechaNacimiento is equals to'.
     *
     * @param fdbFechaNacimiento java.util.Date
     * @return TdExpFamiliarDepsBenef
     */
    @FindByCondition(value=TdExpFamiliarDepsBenef.class, condition="FDB_FECHA_NACIMIENTO=?")
    TdExpFamiliarDepsBenef getByFdbFechaNacimiento(java.util.Date fdbFechaNacimiento);

    /**
     * Find all TdExpFamiliarDepsBenef entities that matches the condition 'where fdbFechaNacimiento is equals to'.
     *
     * @param fdbFechaNacimiento java.util.Date
     * @return Collection of TdExpFamiliarDepsBenef
     */
    @FindByCondition(value=TdExpFamiliarDepsBenef.class, condition="FDB_FECHA_NACIMIENTO=?")
    List<TdExpFamiliarDepsBenef> findByFdbFechaNacimiento(java.util.Date fdbFechaNacimiento);

    /**
     * Find the first TdExpFamiliarDepsBenef entity that matches the condition 'where fdbNombreEmpleado is equals to'.
     *
     * @param fdbNombreEmpleado java.lang.String
     * @return TdExpFamiliarDepsBenef
     */
    @FindByCondition(value=TdExpFamiliarDepsBenef.class, condition="FDB_NOMBRE_EMPLEADO=?")
    TdExpFamiliarDepsBenef getByFdbNombreEmpleado(java.lang.String fdbNombreEmpleado);

    /**
     * Find all TdExpFamiliarDepsBenef entities that matches the condition 'where fdbNombreEmpleado is equals to'.
     *
     * @param fdbNombreEmpleado java.lang.String
     * @return Collection of TdExpFamiliarDepsBenef
     */
    @FindByCondition(value=TdExpFamiliarDepsBenef.class, condition="FDB_NOMBRE_EMPLEADO=?")
    List<TdExpFamiliarDepsBenef> findByFdbNombreEmpleado(java.lang.String fdbNombreEmpleado);

    /**
     * Find the first TdExpFamiliarDepsBenef entity that matches the condition 'where fecModifico is equals to'.
     *
     * @param fecModifico java.util.Date
     * @return TdExpFamiliarDepsBenef
     */
    @FindByCondition(value=TdExpFamiliarDepsBenef.class, condition="FEC_MODIFICO=?")
    TdExpFamiliarDepsBenef getByFecModifico(java.util.Date fecModifico);

    /**
     * Find all TdExpFamiliarDepsBenef entities that matches the condition 'where fecModifico is equals to'.
     *
     * @param fecModifico java.util.Date
     * @return Collection of TdExpFamiliarDepsBenef
     */
    @FindByCondition(value=TdExpFamiliarDepsBenef.class, condition="FEC_MODIFICO=?")
    List<TdExpFamiliarDepsBenef> findByFecModifico(java.util.Date fecModifico);

    /**
     * Find the first TdExpFamiliarDepsBenef entity that matches the condition 'where idGenero is equals to'.
     *
     * @param idGenero java.lang.String
     * @return TdExpFamiliarDepsBenef
     */
    @FindByCondition(value=TdExpFamiliarDepsBenef.class, condition="ID_GENERO=?")
    TdExpFamiliarDepsBenef getByIdGenero(java.lang.String idGenero);

    /**
     * Find all TdExpFamiliarDepsBenef entities that matches the condition 'where idGenero is equals to'.
     *
     * @param idGenero java.lang.String
     * @return Collection of TdExpFamiliarDepsBenef
     */
    @FindByCondition(value=TdExpFamiliarDepsBenef.class, condition="ID_GENERO=?")
    List<TdExpFamiliarDepsBenef> findByIdGenero(java.lang.String idGenero);

    /**
     * Find the first TdExpFamiliarDepsBenef entity that matches the condition 'where idNivelEscolar is equals to'.
     *
     * @param idNivelEscolar int
     * @return TdExpFamiliarDepsBenef
     */
    @FindByCondition(value=TdExpFamiliarDepsBenef.class, condition="ID_NIVEL_ESCOLAR=?")
    TdExpFamiliarDepsBenef getByIdNivelEscolar(int idNivelEscolar);

    /**
     * Find all TdExpFamiliarDepsBenef entities that matches the condition 'where idNivelEscolar is equals to'.
     *
     * @param idNivelEscolar int
     * @return Collection of TdExpFamiliarDepsBenef
     */
    @FindByCondition(value=TdExpFamiliarDepsBenef.class, condition="ID_NIVEL_ESCOLAR=?")
    List<TdExpFamiliarDepsBenef> findByIdNivelEscolar(int idNivelEscolar);

    /**
     * Find the first TdExpFamiliarDepsBenef entity that matches the condition 'where idParentesco is equals to'.
     *
     * @param idParentesco boolean
     * @return TdExpFamiliarDepsBenef
     */
    @FindByCondition(value=TdExpFamiliarDepsBenef.class, condition="ID_PARENTESCO=?")
    TdExpFamiliarDepsBenef getByIdParentesco(boolean idParentesco);

    /**
     * Find all TdExpFamiliarDepsBenef entities that matches the condition 'where idParentesco is equals to'.
     *
     * @param idParentesco boolean
     * @return Collection of TdExpFamiliarDepsBenef
     */
    @FindByCondition(value=TdExpFamiliarDepsBenef.class, condition="ID_PARENTESCO=?")
    List<TdExpFamiliarDepsBenef> findByIdParentesco(boolean idParentesco);

    /**
     * Find the first TdExpFamiliarDepsBenef entity that matches the condition 'where idStatus is equals to'.
     *
     * @param idStatus java.lang.String
     * @return TdExpFamiliarDepsBenef
     */
    @FindByCondition(value=TdExpFamiliarDepsBenef.class, condition="ID_STATUS=?")
    TdExpFamiliarDepsBenef getByIdStatus(java.lang.String idStatus);

    /**
     * Find all TdExpFamiliarDepsBenef entities that matches the condition 'where idStatus is equals to'.
     *
     * @param idStatus java.lang.String
     * @return Collection of TdExpFamiliarDepsBenef
     */
    @FindByCondition(value=TdExpFamiliarDepsBenef.class, condition="ID_STATUS=?")
    List<TdExpFamiliarDepsBenef> findByIdStatus(java.lang.String idStatus);

    /**
     * Find the first TdExpFamiliarDepsBenef entity that matches the condition 'where usuario is equals to'.
     *
     * @param usuario java.lang.String
     * @return TdExpFamiliarDepsBenef
     */
    @FindByCondition(value=TdExpFamiliarDepsBenef.class, condition="USUARIO=?")
    TdExpFamiliarDepsBenef getByUsuario(java.lang.String usuario);

    /**
     * Find all TdExpFamiliarDepsBenef entities that matches the condition 'where usuario is equals to'.
     *
     * @param usuario java.lang.String
     * @return Collection of TdExpFamiliarDepsBenef
     */
    @FindByCondition(value=TdExpFamiliarDepsBenef.class, condition="USUARIO=?")
    List<TdExpFamiliarDepsBenef> findByUsuario(java.lang.String usuario);

    /**
     * Find the first TdExpFamiliarDepsBenef entity that matches the condition 'where fdbDoctoRef is equals to'.
     *
     * @param fdbDoctoRef java.lang.String
     * @return TdExpFamiliarDepsBenef
     */
    @FindByCondition(value=TdExpFamiliarDepsBenef.class, condition="FDB_DOCTO_REF=?")
    TdExpFamiliarDepsBenef getByFdbDoctoRef(java.lang.String fdbDoctoRef);

    /**
     * Find all TdExpFamiliarDepsBenef entities that matches the condition 'where fdbDoctoRef is equals to'.
     *
     * @param fdbDoctoRef java.lang.String
     * @return Collection of TdExpFamiliarDepsBenef
     */
    @FindByCondition(value=TdExpFamiliarDepsBenef.class, condition="FDB_DOCTO_REF=?")
    List<TdExpFamiliarDepsBenef> findByFdbDoctoRef(java.lang.String fdbDoctoRef);

    /**
     * Find the first TdExpFamiliarDepsBenef entity that matches the condition 'where fdbPrimerApellido is equals to'.
     *
     * @param fdbPrimerApellido java.lang.String
     * @return TdExpFamiliarDepsBenef
     */
    @FindByCondition(value=TdExpFamiliarDepsBenef.class, condition="FDB_PRIMER_APELLIDO=?")
    TdExpFamiliarDepsBenef getByFdbPrimerApellido(java.lang.String fdbPrimerApellido);

    /**
     * Find all TdExpFamiliarDepsBenef entities that matches the condition 'where fdbPrimerApellido is equals to'.
     *
     * @param fdbPrimerApellido java.lang.String
     * @return Collection of TdExpFamiliarDepsBenef
     */
    @FindByCondition(value=TdExpFamiliarDepsBenef.class, condition="FDB_PRIMER_APELLIDO=?")
    List<TdExpFamiliarDepsBenef> findByFdbPrimerApellido(java.lang.String fdbPrimerApellido);

    /**
     * Find the first TdExpFamiliarDepsBenef entity that matches the condition 'where fdbPromedio is equals to'.
     *
     * @param fdbPromedio java.lang.Float
     * @return TdExpFamiliarDepsBenef
     */
    @FindByCondition(value=TdExpFamiliarDepsBenef.class, condition="FDB_PROMEDIO=?")
    TdExpFamiliarDepsBenef getByFdbPromedio(java.lang.Float fdbPromedio);

    /**
     * Find all TdExpFamiliarDepsBenef entities that matches the condition 'where fdbPromedio is equals to'.
     *
     * @param fdbPromedio java.lang.Float
     * @return Collection of TdExpFamiliarDepsBenef
     */
    @FindByCondition(value=TdExpFamiliarDepsBenef.class, condition="FDB_PROMEDIO=?")
    List<TdExpFamiliarDepsBenef> findByFdbPromedio(java.lang.Float fdbPromedio);

    /**
     * Find the first TdExpFamiliarDepsBenef entity that matches the condition 'where fdbSegundoApellido is equals to'.
     *
     * @param fdbSegundoApellido java.lang.String
     * @return TdExpFamiliarDepsBenef
     */
    @FindByCondition(value=TdExpFamiliarDepsBenef.class, condition="FDB_SEGUNDO_APELLIDO=?")
    TdExpFamiliarDepsBenef getByFdbSegundoApellido(java.lang.String fdbSegundoApellido);

    /**
     * Find all TdExpFamiliarDepsBenef entities that matches the condition 'where fdbSegundoApellido is equals to'.
     *
     * @param fdbSegundoApellido java.lang.String
     * @return Collection of TdExpFamiliarDepsBenef
     */
    @FindByCondition(value=TdExpFamiliarDepsBenef.class, condition="FDB_SEGUNDO_APELLIDO=?")
    List<TdExpFamiliarDepsBenef> findByFdbSegundoApellido(java.lang.String fdbSegundoApellido);
}