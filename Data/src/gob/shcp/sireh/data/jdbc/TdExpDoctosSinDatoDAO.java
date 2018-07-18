package gob.shcp.sireh.data.jdbc;

import gob.shcp.fsn.data.annotation.Delete;
import gob.shcp.fsn.data.annotation.FindAll;
import gob.shcp.fsn.data.annotation.FindByCondition;
import gob.shcp.fsn.data.annotation.FindById;
import gob.shcp.fsn.data.annotation.Save;
import gob.shcp.fsn.service.data.orm.JdbcDataService;

import java.util.List;

import gob.shcp.sireh.domain.jdbc.TdExpDoctosSinDatos;


/**
 * Data access interface for TdExpDoctosSinDato.
 */
public interface TdExpDoctosSinDatoDAO extends JdbcDataService {
    /**
     * Find TdExpDoctosSinDato entity by its identifier or primary key value.
     *
     * @param id identifier or primary key
     * @return TdExpDoctosSinDato
     */
    @FindById(TdExpDoctosSinDatos.class)
    TdExpDoctosSinDatos getById(gob.shcp.sireh.domain.jdbc.TdExpDoctosSinDatoPK id);
    
    /**
     * Get all TdExpDoctosSinDato entities limited by a maximum number of elements.
     *
     * @return Collection of TdExpDoctosSinDato
     */
    @FindAll(TdExpDoctosSinDatos.class)
    List<TdExpDoctosSinDatos> findAll();
    
    /**
     * Make persistence of TdExpDoctosSinDato entities. If its identifier or primary key is null then create else update.
     *
     * @param entity TdExpDoctosSinDato
     */
    @Save
    void save(TdExpDoctosSinDatos entity);
    
    /**
     * Remove TdExpDoctosSinDato entities.
     *
     * @param entity TdExpDoctosSinDato
     */
    @Delete
    void delete(TdExpDoctosSinDatos entity);


    /**
     * Find the first TdExpDoctosSinDato entity that matches the condition 'where dsdDoctoRef is equals to'.
     *
     * @param dsdDoctoRef java.lang.String
     * @return TdExpDoctosSinDato
     */
    @FindByCondition(value=TdExpDoctosSinDatos.class, condition="DSD_DOCTO_REF=?")
    TdExpDoctosSinDatos getByDsdDoctoRef(java.lang.String dsdDoctoRef);

    /**
     * Find all TdExpDoctosSinDato entities that matches the condition 'where dsdDoctoRef is equals to'.
     *
     * @param dsdDoctoRef java.lang.String
     * @return Collection of TdExpDoctosSinDato
     */
    @FindByCondition(value=TdExpDoctosSinDatos.class, condition="DSD_DOCTO_REF=?")
    List<TdExpDoctosSinDatos> findByDsdDoctoRef(java.lang.String dsdDoctoRef);

    /**
     * Find the first TdExpDoctosSinDato entity that matches the condition 'where dsdDescripDocto is equals to'.
     *
     * @param dsdDescripDocto java.lang.String
     * @return TdExpDoctosSinDato
     */
    @FindByCondition(value=TdExpDoctosSinDatos.class, condition="DSD_DESCRIP_DOCTO=?")
    TdExpDoctosSinDatos getByDsdDescripDocto(java.lang.String dsdDescripDocto);

    /**
     * Find all TdExpDoctosSinDato entities that matches the condition 'where dsdDescripDocto is equals to'.
     *
     * @param dsdDescripDocto java.lang.String
     * @return Collection of TdExpDoctosSinDato
     */
    @FindByCondition(value=TdExpDoctosSinDatos.class, condition="DSD_DESCRIP_DOCTO=?")
    List<TdExpDoctosSinDatos> findByDsdDescripDocto(java.lang.String dsdDescripDocto);

    /**
     * Find the first TdExpDoctosSinDato entity that matches the condition 'where fecModifico is equals to'.
     *
     * @param fecModifico java.util.Date
     * @return TdExpDoctosSinDato
     */
    @FindByCondition(value=TdExpDoctosSinDatos.class, condition="FEC_MODIFICO=?")
    TdExpDoctosSinDatos getByFecModifico(java.util.Date fecModifico);

    /**
     * Find all TdExpDoctosSinDato entities that matches the condition 'where fecModifico is equals to'.
     *
     * @param fecModifico java.util.Date
     * @return Collection of TdExpDoctosSinDato
     */
    @FindByCondition(value=TdExpDoctosSinDatos.class, condition="FEC_MODIFICO=?")
    List<TdExpDoctosSinDatos> findByFecModifico(java.util.Date fecModifico);

    /**
     * Find the first TdExpDoctosSinDato entity that matches the condition 'where idStatus is equals to'.
     *
     * @param idStatus java.lang.String
     * @return TdExpDoctosSinDato
     */
    @FindByCondition(value=TdExpDoctosSinDatos.class, condition="ID_STATUS=?")
    TdExpDoctosSinDatos getByIdStatus(java.lang.String idStatus);

    /**
     * Find all TdExpDoctosSinDato entities that matches the condition 'where idStatus is equals to'.
     *
     * @param idStatus java.lang.String
     * @return Collection of TdExpDoctosSinDato
     */
    @FindByCondition(value=TdExpDoctosSinDatos.class, condition="ID_STATUS=?")
    List<TdExpDoctosSinDatos> findByIdStatus(java.lang.String idStatus);

    /**
     * Find the first TdExpDoctosSinDato entity that matches the condition 'where usuario is equals to'.
     *
     * @param usuario java.lang.String
     * @return TdExpDoctosSinDato
     */
    @FindByCondition(value=TdExpDoctosSinDatos.class, condition="USUARIO=?")
    TdExpDoctosSinDatos getByUsuario(java.lang.String usuario);

    /**
     * Find all TdExpDoctosSinDato entities that matches the condition 'where usuario is equals to'.
     *
     * @param usuario java.lang.String
     * @return Collection of TdExpDoctosSinDato
     */
    @FindByCondition(value=TdExpDoctosSinDatos.class, condition="USUARIO=?")
    List<TdExpDoctosSinDatos> findByUsuario(java.lang.String usuario);
}