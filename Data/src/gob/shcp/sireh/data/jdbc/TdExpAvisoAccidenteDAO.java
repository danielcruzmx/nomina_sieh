package gob.shcp.sireh.data.jdbc;

import gob.shcp.fsn.data.annotation.Delete;
import gob.shcp.fsn.data.annotation.FindAll;
import gob.shcp.fsn.data.annotation.FindByCondition;
import gob.shcp.fsn.data.annotation.FindById;
import gob.shcp.fsn.data.annotation.Save;
import gob.shcp.fsn.service.data.orm.JdbcDataService;

import java.util.List;

import gob.shcp.sireh.domain.jdbc.TdExpAvisoAccidente;


/**
 * Data access interface for TdExpAvisoAccidente.
 */
public interface TdExpAvisoAccidenteDAO extends JdbcDataService {
    /**
     * Find TdExpAvisoAccidente entity by its identifier or primary key value.
     *
     * @param id identifier or primary key
     * @return TdExpAvisoAccidente
     */
    @FindById(TdExpAvisoAccidente.class)
    TdExpAvisoAccidente getById(java.lang.String id);
    
    /**
     * Get all TdExpAvisoAccidente entities limited by a maximum number of elements.
     *
     * @return Collection of TdExpAvisoAccidente
     */
    @FindAll(TdExpAvisoAccidente.class)
    List<TdExpAvisoAccidente> findAll();
    
    /**
     * Make persistence of TdExpAvisoAccidente entities. If its identifier or primary key is null then create else update.
     *
     * @param entity TdExpAvisoAccidente
     */
    @Save
    void save(TdExpAvisoAccidente entity);
    
    /**
     * Remove TdExpAvisoAccidente entities.
     *
     * @param entity TdExpAvisoAccidente
     */
    @Delete
    void delete(TdExpAvisoAccidente entity);


    /**
     * Find the first TdExpAvisoAccidente entity that matches the condition 'where accNombreEmpleado is equals to'.
     *
     * @param accNombreEmpleado java.lang.String
     * @return TdExpAvisoAccidente
     */
    @FindByCondition(value=TdExpAvisoAccidente.class, condition="ACC_NOMBRE_EMPLEADO=?")
    TdExpAvisoAccidente getByAccNombreEmpleado(java.lang.String accNombreEmpleado);

    /**
     * Find all TdExpAvisoAccidente entities that matches the condition 'where accNombreEmpleado is equals to'.
     *
     * @param accNombreEmpleado java.lang.String
     * @return Collection of TdExpAvisoAccidente
     */
    @FindByCondition(value=TdExpAvisoAccidente.class, condition="ACC_NOMBRE_EMPLEADO=?")
    List<TdExpAvisoAccidente> findByAccNombreEmpleado(java.lang.String accNombreEmpleado);

    /**
     * Find the first TdExpAvisoAccidente entity that matches the condition 'where accSecuencia is equals to'.
     *
     * @param accSecuencia int
     * @return TdExpAvisoAccidente
     */
    @FindByCondition(value=TdExpAvisoAccidente.class, condition="ACC_SECUENCIA=?")
    TdExpAvisoAccidente getByAccSecuencia(int accSecuencia);

    /**
     * Find all TdExpAvisoAccidente entities that matches the condition 'where accSecuencia is equals to'.
     *
     * @param accSecuencia int
     * @return Collection of TdExpAvisoAccidente
     */
    @FindByCondition(value=TdExpAvisoAccidente.class, condition="ACC_SECUENCIA=?")
    List<TdExpAvisoAccidente> findByAccSecuencia(int accSecuencia);

    /**
     * Find the first TdExpAvisoAccidente entity that matches the condition 'where accTelefono1 is equals to'.
     *
     * @param accTelefono1 java.lang.String
     * @return TdExpAvisoAccidente
     */
    @FindByCondition(value=TdExpAvisoAccidente.class, condition="ACC_TELEFONO1=?")
    TdExpAvisoAccidente getByAccTelefono1(java.lang.String accTelefono1);

    /**
     * Find all TdExpAvisoAccidente entities that matches the condition 'where accTelefono1 is equals to'.
     *
     * @param accTelefono1 java.lang.String
     * @return Collection of TdExpAvisoAccidente
     */
    @FindByCondition(value=TdExpAvisoAccidente.class, condition="ACC_TELEFONO1=?")
    List<TdExpAvisoAccidente> findByAccTelefono1(java.lang.String accTelefono1);

    /**
     * Find the first TdExpAvisoAccidente entity that matches the condition 'where accTelefono2 is equals to'.
     *
     * @param accTelefono2 java.lang.String
     * @return TdExpAvisoAccidente
     */
    @FindByCondition(value=TdExpAvisoAccidente.class, condition="ACC_TELEFONO2=?")
    TdExpAvisoAccidente getByAccTelefono2(java.lang.String accTelefono2);

    /**
     * Find all TdExpAvisoAccidente entities that matches the condition 'where accTelefono2 is equals to'.
     *
     * @param accTelefono2 java.lang.String
     * @return Collection of TdExpAvisoAccidente
     */
    @FindByCondition(value=TdExpAvisoAccidente.class, condition="ACC_TELEFONO2=?")
    List<TdExpAvisoAccidente> findByAccTelefono2(java.lang.String accTelefono2);

    /**
     * Find the first TdExpAvisoAccidente entity that matches the condition 'where fecModifico is equals to'.
     *
     * @param fecModifico java.util.Date
     * @return TdExpAvisoAccidente
     */
    @FindByCondition(value=TdExpAvisoAccidente.class, condition="FEC_MODIFICO=?")
    TdExpAvisoAccidente getByFecModifico(java.util.Date fecModifico);

    /**
     * Find all TdExpAvisoAccidente entities that matches the condition 'where fecModifico is equals to'.
     *
     * @param fecModifico java.util.Date
     * @return Collection of TdExpAvisoAccidente
     */
    @FindByCondition(value=TdExpAvisoAccidente.class, condition="FEC_MODIFICO=?")
    List<TdExpAvisoAccidente> findByFecModifico(java.util.Date fecModifico);

    /**
     * Find the first TdExpAvisoAccidente entity that matches the condition 'where idParentesco is equals to'.
     *
     * @param idParentesco boolean
     * @return TdExpAvisoAccidente
     */
    @FindByCondition(value=TdExpAvisoAccidente.class, condition="ID_PARENTESCO=?")
    TdExpAvisoAccidente getByIdParentesco(boolean idParentesco);

    /**
     * Find all TdExpAvisoAccidente entities that matches the condition 'where idParentesco is equals to'.
     *
     * @param idParentesco boolean
     * @return Collection of TdExpAvisoAccidente
     */
    @FindByCondition(value=TdExpAvisoAccidente.class, condition="ID_PARENTESCO=?")
    List<TdExpAvisoAccidente> findByIdParentesco(boolean idParentesco);

    /**
     * Find the first TdExpAvisoAccidente entity that matches the condition 'where usuario is equals to'.
     *
     * @param usuario java.lang.String
     * @return TdExpAvisoAccidente
     */
    @FindByCondition(value=TdExpAvisoAccidente.class, condition="USUARIO=?")
    TdExpAvisoAccidente getByUsuario(java.lang.String usuario);

    /**
     * Find all TdExpAvisoAccidente entities that matches the condition 'where usuario is equals to'.
     *
     * @param usuario java.lang.String
     * @return Collection of TdExpAvisoAccidente
     */
    @FindByCondition(value=TdExpAvisoAccidente.class, condition="USUARIO=?")
    List<TdExpAvisoAccidente> findByUsuario(java.lang.String usuario);

    /**
     * Find the first TdExpAvisoAccidente entity that matches the condition 'where accPrimerApellido is equals to'.
     *
     * @param accPrimerApellido java.lang.String
     * @return TdExpAvisoAccidente
     */
    @FindByCondition(value=TdExpAvisoAccidente.class, condition="ACC_PRIMER_APELLIDO=?")
    TdExpAvisoAccidente getByAccPrimerApellido(java.lang.String accPrimerApellido);

    /**
     * Find all TdExpAvisoAccidente entities that matches the condition 'where accPrimerApellido is equals to'.
     *
     * @param accPrimerApellido java.lang.String
     * @return Collection of TdExpAvisoAccidente
     */
    @FindByCondition(value=TdExpAvisoAccidente.class, condition="ACC_PRIMER_APELLIDO=?")
    List<TdExpAvisoAccidente> findByAccPrimerApellido(java.lang.String accPrimerApellido);

    /**
     * Find the first TdExpAvisoAccidente entity that matches the condition 'where accSegundoApellido is equals to'.
     *
     * @param accSegundoApellido java.lang.String
     * @return TdExpAvisoAccidente
     */
    @FindByCondition(value=TdExpAvisoAccidente.class, condition="ACC_SEGUNDO_APELLIDO=?")
    TdExpAvisoAccidente getByAccSegundoApellido(java.lang.String accSegundoApellido);

    /**
     * Find all TdExpAvisoAccidente entities that matches the condition 'where accSegundoApellido is equals to'.
     *
     * @param accSegundoApellido java.lang.String
     * @return Collection of TdExpAvisoAccidente
     */
    @FindByCondition(value=TdExpAvisoAccidente.class, condition="ACC_SEGUNDO_APELLIDO=?")
    List<TdExpAvisoAccidente> findByAccSegundoApellido(java.lang.String accSegundoApellido);
}