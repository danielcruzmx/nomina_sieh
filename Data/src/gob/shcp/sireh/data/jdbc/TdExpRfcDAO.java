package gob.shcp.sireh.data.jdbc;

import gob.shcp.fsn.data.annotation.Delete;
import gob.shcp.fsn.data.annotation.FindAll;
import gob.shcp.fsn.data.annotation.FindByCondition;
import gob.shcp.fsn.data.annotation.FindById;
import gob.shcp.fsn.data.annotation.Save;
import gob.shcp.fsn.service.data.orm.JdbcDataService;

import java.util.List;

import gob.shcp.sireh.domain.jdbc.TdExpRfc;


/**
 * Data access interface for TdExpRfc.
 */
public interface TdExpRfcDAO extends JdbcDataService {
    /**
     * Find TdExpRfc entity by its identifier or primary key value.
     *
     * @param id identifier or primary key
     * @return TdExpRfc
     */
    @FindById(TdExpRfc.class)
    TdExpRfc getById(gob.shcp.sireh.domain.jdbc.TdExpRfcPK id);
    
    /**
     * Get all TdExpRfc entities limited by a maximum number of elements.
     *
     * @return Collection of TdExpRfc
     */
    @FindAll(TdExpRfc.class)
    List<TdExpRfc> findAll();
    
    /**
     * Make persistence of TdExpRfc entities. If its identifier or primary key is null then create else update.
     *
     * @param entity TdExpRfc
     */
    @Save
    void save(TdExpRfc entity);
    
    /**
     * Remove TdExpRfc entities.
     *
     * @param entity TdExpRfc
     */
    @Delete
    void delete(TdExpRfc entity);


    /**
     * Find the first TdExpRfc entity that matches the condition 'where fecModifico is equals to'.
     *
     * @param fecModifico java.util.Date
     * @return TdExpRfc
     */
    @FindByCondition(value=TdExpRfc.class, condition="FEC_MODIFICO=?")
    TdExpRfc getByFecModifico(java.util.Date fecModifico);

    /**
     * Find all TdExpRfc entities that matches the condition 'where fecModifico is equals to'.
     *
     * @param fecModifico java.util.Date
     * @return Collection of TdExpRfc
     */
    @FindByCondition(value=TdExpRfc.class, condition="FEC_MODIFICO=?")
    List<TdExpRfc> findByFecModifico(java.util.Date fecModifico);

    /**
     * Find the first TdExpRfc entity that matches the condition 'where idStatus is equals to'.
     *
     * @param idStatus java.lang.String
     * @return TdExpRfc
     */
    @FindByCondition(value=TdExpRfc.class, condition="ID_STATUS=?")
    TdExpRfc getByIdStatus(java.lang.String idStatus);

    /**
     * Find all TdExpRfc entities that matches the condition 'where idStatus is equals to'.
     *
     * @param idStatus java.lang.String
     * @return Collection of TdExpRfc
     */
    @FindByCondition(value=TdExpRfc.class, condition="ID_STATUS=?")
    List<TdExpRfc> findByIdStatus(java.lang.String idStatus);

    /**
     * Find the first TdExpRfc entity that matches the condition 'where rfcClave is equals to'.
     *
     * @param rfcClave java.lang.String
     * @return TdExpRfc
     */
    @FindByCondition(value=TdExpRfc.class, condition="RFC_CLAVE=?")
    TdExpRfc getByRfcClave(java.lang.String rfcClave);

    /**
     * Find all TdExpRfc entities that matches the condition 'where rfcClave is equals to'.
     *
     * @param rfcClave java.lang.String
     * @return Collection of TdExpRfc
     */
    @FindByCondition(value=TdExpRfc.class, condition="RFC_CLAVE=?")
    List<TdExpRfc> findByRfcClave(java.lang.String rfcClave);

    /**
     * Find the first TdExpRfc entity that matches the condition 'where rfcDoctoRef is equals to'.
     *
     * @param rfcDoctoRef java.lang.String
     * @return TdExpRfc
     */
    @FindByCondition(value=TdExpRfc.class, condition="RFC_DOCTO_REF=?")
    TdExpRfc getByRfcDoctoRef(java.lang.String rfcDoctoRef);

    /**
     * Find all TdExpRfc entities that matches the condition 'where rfcDoctoRef is equals to'.
     *
     * @param rfcDoctoRef java.lang.String
     * @return Collection of TdExpRfc
     */
    @FindByCondition(value=TdExpRfc.class, condition="RFC_DOCTO_REF=?")
    List<TdExpRfc> findByRfcDoctoRef(java.lang.String rfcDoctoRef);

    /**
     * Find the first TdExpRfc entity that matches the condition 'where usuario is equals to'.
     *
     * @param usuario java.lang.String
     * @return TdExpRfc
     */
    @FindByCondition(value=TdExpRfc.class, condition="USUARIO=?")
    TdExpRfc getByUsuario(java.lang.String usuario);

    /**
     * Find all TdExpRfc entities that matches the condition 'where usuario is equals to'.
     *
     * @param usuario java.lang.String
     * @return Collection of TdExpRfc
     */
    @FindByCondition(value=TdExpRfc.class, condition="USUARIO=?")
    List<TdExpRfc> findByUsuario(java.lang.String usuario);

    /**
     * Find the first TdExpRfc entity that matches the condition 'where rfcFolio is equals to'.
     *
     * @param rfcFolio java.lang.String
     * @return TdExpRfc
     */
    @FindByCondition(value=TdExpRfc.class, condition="RFC_FOLIO=?")
    TdExpRfc getByRfcFolio(java.lang.String rfcFolio);

    /**
     * Find all TdExpRfc entities that matches the condition 'where rfcFolio is equals to'.
     *
     * @param rfcFolio java.lang.String
     * @return Collection of TdExpRfc
     */
    @FindByCondition(value=TdExpRfc.class, condition="RFC_FOLIO=?")
    List<TdExpRfc> findByRfcFolio(java.lang.String rfcFolio);
}