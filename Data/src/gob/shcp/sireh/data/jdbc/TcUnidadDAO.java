package gob.shcp.sireh.data.jdbc;

import gob.shcp.fsn.data.annotation.Delete;
import gob.shcp.fsn.data.annotation.FindAll;
import gob.shcp.fsn.data.annotation.FindByCondition;
import gob.shcp.fsn.data.annotation.FindById;
import gob.shcp.fsn.data.annotation.Save;
import gob.shcp.fsn.service.data.orm.JdbcDataService;

import java.util.List;

import gob.shcp.sireh.domain.jdbc.TcUnidad;


/**
 * Data access interface for TcUnidad.
 */
public interface TcUnidadDAO extends JdbcDataService {
    /**
     * Find TcUnidad entity by its identifier or primary key value.
     *
     * @param id identifier or primary key
     * @return TcUnidad
     */
    @FindById(TcUnidad.class)
    TcUnidad getById(gob.shcp.sireh.domain.jdbc.TcUnidadPK id);
    
    /**
     * Get all TcUnidad entities limited by a maximum number of elements.
     *
     * @return Collection of TcUnidad
     */
    @FindAll(TcUnidad.class)
    List<TcUnidad> findAll();
    
    /**
     * Make persistence of TcUnidad entities. If its identifier or primary key is null then create else update.
     *
     * @param entity TcUnidad
     */
    @Save
    void save(TcUnidad entity);
    
    /**
     * Remove TcUnidad entities.
     *
     * @param entity TcUnidad
     */
    @Delete
    void delete(TcUnidad entity);


    /**
     * Find the first TcUnidad entity that matches the condition 'where fecModifico is equals to'.
     *
     * @param fecModifico java.util.Date
     * @return TcUnidad
     */
    @FindByCondition(value=TcUnidad.class, condition="FEC_MODIFICO=?")
    TcUnidad getByFecModifico(java.util.Date fecModifico);

    /**
     * Find all TcUnidad entities that matches the condition 'where fecModifico is equals to'.
     *
     * @param fecModifico java.util.Date
     * @return Collection of TcUnidad
     */
    @FindByCondition(value=TcUnidad.class, condition="FEC_MODIFICO=?")
    List<TcUnidad> findByFecModifico(java.util.Date fecModifico);

    /**
     * Find the first TcUnidad entity that matches the condition 'where usuario is equals to'.
     *
     * @param usuario java.lang.String
     * @return TcUnidad
     */
    @FindByCondition(value=TcUnidad.class, condition="USUARIO=?")
    TcUnidad getByUsuario(java.lang.String usuario);

    /**
     * Find all TcUnidad entities that matches the condition 'where usuario is equals to'.
     *
     * @param usuario java.lang.String
     * @return Collection of TcUnidad
     */
    @FindByCondition(value=TcUnidad.class, condition="USUARIO=?")
    List<TcUnidad> findByUsuario(java.lang.String usuario);

    /**
     * Find the first TcUnidad entity that matches the condition 'where descUnidad is equals to'.
     *
     * @param descUnidad java.lang.String
     * @return TcUnidad
     */
    @FindByCondition(value=TcUnidad.class, condition="DESC_UNIDAD=?")
    TcUnidad getByDescUnidad(java.lang.String descUnidad);

    /**
     * Find all TcUnidad entities that matches the condition 'where descUnidad is equals to'.
     *
     * @param descUnidad java.lang.String
     * @return Collection of TcUnidad
     */
    @FindByCondition(value=TcUnidad.class, condition="DESC_UNIDAD=?")
    List<TcUnidad> findByDescUnidad(java.lang.String descUnidad);

    /**
     * Find the first TcUnidad entity that matches the condition 'where descUnidadAbrev is equals to'.
     *
     * @param descUnidadAbrev java.lang.String
     * @return TcUnidad
     */
    @FindByCondition(value=TcUnidad.class, condition="DESC_UNIDAD_ABREV=?")
    TcUnidad getByDescUnidadAbrev(java.lang.String descUnidadAbrev);

    /**
     * Find all TcUnidad entities that matches the condition 'where descUnidadAbrev is equals to'.
     *
     * @param descUnidadAbrev java.lang.String
     * @return Collection of TcUnidad
     */
    @FindByCondition(value=TcUnidad.class, condition="DESC_UNIDAD_ABREV=?")
    List<TcUnidad> findByDescUnidadAbrev(java.lang.String descUnidadAbrev);

    /**
     * Find the first TcUnidad entity that matches the condition 'where idUnidadSubse is equals to'.
     *
     * @param idUnidadSubse java.lang.String
     * @return TcUnidad
     */
    @FindByCondition(value=TcUnidad.class, condition="ID_UNIDAD_SUBSE=?")
    TcUnidad getByIdUnidadSubse(java.lang.String idUnidadSubse);

    /**
     * Find all TcUnidad entities that matches the condition 'where idUnidadSubse is equals to'.
     *
     * @param idUnidadSubse java.lang.String
     * @return Collection of TcUnidad
     */
    @FindByCondition(value=TcUnidad.class, condition="ID_UNIDAD_SUBSE=?")
    List<TcUnidad> findByIdUnidadSubse(java.lang.String idUnidadSubse);

    /**
     * Find the first TcUnidad entity that matches the condition 'where uniCentralForanea is equals to'.
     *
     * @param uniCentralForanea java.lang.String
     * @return TcUnidad
     */
    @FindByCondition(value=TcUnidad.class, condition="UNI_CENTRAL_FORANEA=?")
    TcUnidad getByUniCentralForanea(java.lang.String uniCentralForanea);

    /**
     * Find all TcUnidad entities that matches the condition 'where uniCentralForanea is equals to'.
     *
     * @param uniCentralForanea java.lang.String
     * @return Collection of TcUnidad
     */
    @FindByCondition(value=TcUnidad.class, condition="UNI_CENTRAL_FORANEA=?")
    List<TcUnidad> findByUniCentralForanea(java.lang.String uniCentralForanea);
}