package gob.shcp.sireh.data.jdbc;

import gob.shcp.fsn.data.annotation.Delete;
import gob.shcp.fsn.data.annotation.FindAll;
import gob.shcp.fsn.data.annotation.FindByCondition;
import gob.shcp.fsn.data.annotation.FindById;
import gob.shcp.fsn.data.annotation.Save;
import gob.shcp.fsn.service.data.orm.JdbcDataService;

import java.util.List;

import gob.shcp.sireh.domain.jdbc.TdExpCurp;


/**
 * Data access interface for TdExpCurp.
 */
public interface TdExpCurpDAO extends JdbcDataService {
    /**
     * Find TdExpCurp entity by its identifier or primary key value.
     *
     * @param id identifier or primary key
     * @return TdExpCurp
     */
    @FindById(TdExpCurp.class)
    TdExpCurp getById(gob.shcp.sireh.domain.jdbc.TdExpCurpPK id);
    
    /**
     * Get all TdExpCurp entities limited by a maximum number of elements.
     *
     * @return Collection of TdExpCurp
     */
    @FindAll(TdExpCurp.class)
    List<TdExpCurp> findAll();
    
    /**
     * Make persistence of TdExpCurp entities. If its identifier or primary key is null then create else update.
     *
     * @param entity TdExpCurp
     */
    @Save
    void save(TdExpCurp entity);
    
    /**
     * Remove TdExpCurp entities.
     *
     * @param entity TdExpCurp
     */
    @Delete
    void delete(TdExpCurp entity);


    /**
     * Find the first TdExpCurp entity that matches the condition 'where curpCve is equals to'.
     *
     * @param curpCve java.lang.String
     * @return TdExpCurp
     */
    @FindByCondition(value=TdExpCurp.class, condition="CURP_CVE=?")
    TdExpCurp getByCurpCve(java.lang.String curpCve);

    /**
     * Find all TdExpCurp entities that matches the condition 'where curpCve is equals to'.
     *
     * @param curpCve java.lang.String
     * @return Collection of TdExpCurp
     */
    @FindByCondition(value=TdExpCurp.class, condition="CURP_CVE=?")
    List<TdExpCurp> findByCurpCve(java.lang.String curpCve);

    /**
     * Find the first TdExpCurp entity that matches the condition 'where curpDoctoRef is equals to'.
     *
     * @param curpDoctoRef java.lang.String
     * @return TdExpCurp
     */
    @FindByCondition(value=TdExpCurp.class, condition="CURP_DOCTO_REF=?")
    TdExpCurp getByCurpDoctoRef(java.lang.String curpDoctoRef);

    /**
     * Find all TdExpCurp entities that matches the condition 'where curpDoctoRef is equals to'.
     *
     * @param curpDoctoRef java.lang.String
     * @return Collection of TdExpCurp
     */
    @FindByCondition(value=TdExpCurp.class, condition="CURP_DOCTO_REF=?")
    List<TdExpCurp> findByCurpDoctoRef(java.lang.String curpDoctoRef);

    /**
     * Find the first TdExpCurp entity that matches the condition 'where fecModifico is equals to'.
     *
     * @param fecModifico java.util.Date
     * @return TdExpCurp
     */
    @FindByCondition(value=TdExpCurp.class, condition="FEC_MODIFICO=?")
    TdExpCurp getByFecModifico(java.util.Date fecModifico);

    /**
     * Find all TdExpCurp entities that matches the condition 'where fecModifico is equals to'.
     *
     * @param fecModifico java.util.Date
     * @return Collection of TdExpCurp
     */
    @FindByCondition(value=TdExpCurp.class, condition="FEC_MODIFICO=?")
    List<TdExpCurp> findByFecModifico(java.util.Date fecModifico);

    /**
     * Find the first TdExpCurp entity that matches the condition 'where idStatus is equals to'.
     *
     * @param idStatus java.lang.String
     * @return TdExpCurp
     */
    @FindByCondition(value=TdExpCurp.class, condition="ID_STATUS=?")
    TdExpCurp getByIdStatus(java.lang.String idStatus);

    /**
     * Find all TdExpCurp entities that matches the condition 'where idStatus is equals to'.
     *
     * @param idStatus java.lang.String
     * @return Collection of TdExpCurp
     */
    @FindByCondition(value=TdExpCurp.class, condition="ID_STATUS=?")
    List<TdExpCurp> findByIdStatus(java.lang.String idStatus);

    /**
     * Find the first TdExpCurp entity that matches the condition 'where usuario is equals to'.
     *
     * @param usuario java.lang.String
     * @return TdExpCurp
     */
    @FindByCondition(value=TdExpCurp.class, condition="USUARIO=?")
    TdExpCurp getByUsuario(java.lang.String usuario);

    /**
     * Find all TdExpCurp entities that matches the condition 'where usuario is equals to'.
     *
     * @param usuario java.lang.String
     * @return Collection of TdExpCurp
     */
    @FindByCondition(value=TdExpCurp.class, condition="USUARIO=?")
    List<TdExpCurp> findByUsuario(java.lang.String usuario);

    /**
     * Find the first TdExpCurp entity that matches the condition 'where curpFolio is equals to'.
     *
     * @param curpFolio java.lang.String
     * @return TdExpCurp
     */
    @FindByCondition(value=TdExpCurp.class, condition="CURP_FOLIO=?")
    TdExpCurp getByCurpFolio(java.lang.String curpFolio);

    /**
     * Find all TdExpCurp entities that matches the condition 'where curpFolio is equals to'.
     *
     * @param curpFolio java.lang.String
     * @return Collection of TdExpCurp
     */
    @FindByCondition(value=TdExpCurp.class, condition="CURP_FOLIO=?")
    List<TdExpCurp> findByCurpFolio(java.lang.String curpFolio);
}