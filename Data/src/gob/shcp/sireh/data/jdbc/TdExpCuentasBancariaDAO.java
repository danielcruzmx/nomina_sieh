package gob.shcp.sireh.data.jdbc;

import gob.shcp.fsn.data.annotation.Delete;
import gob.shcp.fsn.data.annotation.FindAll;
import gob.shcp.fsn.data.annotation.FindByCondition;
import gob.shcp.fsn.data.annotation.FindById;
import gob.shcp.fsn.data.annotation.Save;
import gob.shcp.fsn.service.data.orm.JdbcDataService;

import gob.shcp.sireh.domain.jdbc.TdExpCuentasBancarias;

import java.util.List;

import gob.shcp.sireh.domain.jdbc.TdExpCuentasBancarias;


/**
 * Data access interface for TdExpCuentasBancarias.
 */
public interface TdExpCuentasBancariaDAO extends JdbcDataService {
    /**
     * Find TdExpCuentasBancarias entity by its identifier or primary key value.
     *
     * @param id identifier or primary key
     * @return TdExpCuentasBancarias
     */
    @FindById(TdExpCuentasBancarias.class)
    TdExpCuentasBancarias getById(gob.shcp.sireh.domain.jdbc.TdExpCuentasBancariaPK id);
    
    /**
     * Get all TdExpCuentasBancarias entities limited by a maximum number of elements.
     *
     * @return Collection of TdExpCuentasBancarias
     */
    @FindAll(TdExpCuentasBancarias.class)
    List<TdExpCuentasBancarias> findAll();
    
    /**
     * Make persistence of TdExpCuentasBancarias entities. If its identifier or primary key is null then create else update.
     *
     * @param entity TdExpCuentasBancarias
     */
    @Save
    void save(TdExpCuentasBancarias entity);
    
    /**
     * Remove TdExpCuentasBancarias entities.
     *
     * @param entity TdExpCuentasBancarias
     */
    @Delete
    void delete(TdExpCuentasBancarias entity);


    /**
     * Find the first TdExpCuentasBancarias entity that matches the condition 'where ctaTipo is equals to'.
     *
     * @param ctaTipo java.lang.String
     * @return TdExpCuentasBancarias
     */
    @FindByCondition(value=TdExpCuentasBancarias.class, condition="CTA_TIPO=?")
    TdExpCuentasBancarias getByCtaTipo(java.lang.String ctaTipo);

    /**
     * Find all TdExpCuentasBancarias entities that matches the condition 'where ctaTipo is equals to'.
     *
     * @param ctaTipo java.lang.String
     * @return Collection of TdExpCuentasBancarias
     */
    @FindByCondition(value=TdExpCuentasBancarias.class, condition="CTA_TIPO=?")
    List<TdExpCuentasBancarias> findByCtaTipo(java.lang.String ctaTipo);

    /**
     * Find the first TdExpCuentasBancarias entity that matches the condition 'where fecModifico is equals to'.
     *
     * @param fecModifico java.util.Date
     * @return TdExpCuentasBancarias
     */
    @FindByCondition(value=TdExpCuentasBancarias.class, condition="FEC_MODIFICO=?")
    TdExpCuentasBancarias getByFecModifico(java.util.Date fecModifico);

    /**
     * Find all TdExpCuentasBancarias entities that matches the condition 'where fecModifico is equals to'.
     *
     * @param fecModifico java.util.Date
     * @return Collection of TdExpCuentasBancarias
     */
    @FindByCondition(value=TdExpCuentasBancarias.class, condition="FEC_MODIFICO=?")
    List<TdExpCuentasBancarias> findByFecModifico(java.util.Date fecModifico);

    /**
     * Find the first TdExpCuentasBancarias entity that matches the condition 'where idBanco is equals to'.
     *
     * @param idBanco java.lang.String
     * @return TdExpCuentasBancarias
     */
    @FindByCondition(value=TdExpCuentasBancarias.class, condition="ID_BANCO=?")
    TdExpCuentasBancarias getByIdBanco(java.lang.String idBanco);

    /**
     * Find all TdExpCuentasBancarias entities that matches the condition 'where idBanco is equals to'.
     *
     * @param idBanco java.lang.String
     * @return Collection of TdExpCuentasBancarias
     */
    @FindByCondition(value=TdExpCuentasBancarias.class, condition="ID_BANCO=?")
    List<TdExpCuentasBancarias> findByIdBanco(java.lang.String idBanco);

    /**
     * Find the first TdExpCuentasBancarias entity that matches the condition 'where idStatus is equals to'.
     *
     * @param idStatus java.lang.String
     * @return TdExpCuentasBancarias
     */
    @FindByCondition(value=TdExpCuentasBancarias.class, condition="ID_STATUS=?")
    TdExpCuentasBancarias getByIdStatus(java.lang.String idStatus);

    /**
     * Find all TdExpCuentasBancarias entities that matches the condition 'where idStatus is equals to'.
     *
     * @param idStatus java.lang.String
     * @return Collection of TdExpCuentasBancarias
     */
    @FindByCondition(value=TdExpCuentasBancarias.class, condition="ID_STATUS=?")
    List<TdExpCuentasBancarias> findByIdStatus(java.lang.String idStatus);

    /**
     * Find the first TdExpCuentasBancarias entity that matches the condition 'where usuario is equals to'.
     *
     * @param usuario java.lang.String
     * @return TdExpCuentasBancarias
     */
    @FindByCondition(value=TdExpCuentasBancarias.class, condition="USUARIO=?")
    TdExpCuentasBancarias getByUsuario(java.lang.String usuario);

    /**
     * Find all TdExpCuentasBancarias entities that matches the condition 'where usuario is equals to'.
     *
     * @param usuario java.lang.String
     * @return Collection of TdExpCuentasBancarias
     */
    @FindByCondition(value=TdExpCuentasBancarias.class, condition="USUARIO=?")
    List<TdExpCuentasBancarias> findByUsuario(java.lang.String usuario);

    /**
     * Find the first TdExpCuentasBancarias entity that matches the condition 'where ctaClabe is equals to'.
     *
     * @param ctaClabe java.lang.String
     * @return TdExpCuentasBancarias
     */
    @FindByCondition(value=TdExpCuentasBancarias.class, condition="CTA_CLABE=?")
    TdExpCuentasBancarias getByCtaClabe(java.lang.String ctaClabe);

    /**
     * Find all TdExpCuentasBancarias entities that matches the condition 'where ctaClabe is equals to'.
     *
     * @param ctaClabe java.lang.String
     * @return Collection of TdExpCuentasBancarias
     */
    @FindByCondition(value=TdExpCuentasBancarias.class, condition="CTA_CLABE=?")
    List<TdExpCuentasBancarias> findByCtaClabe(java.lang.String ctaClabe);

    /**
     * Find the first TdExpCuentasBancarias entity that matches the condition 'where ctaDoctoRef is equals to'.
     *
     * @param ctaDoctoRef java.lang.String
     * @return TdExpCuentasBancarias
     */
    @FindByCondition(value=TdExpCuentasBancarias.class, condition="CTA_DOCTO_REF=?")
    TdExpCuentasBancarias getByCtaDoctoRef(java.lang.String ctaDoctoRef);

    /**
     * Find all TdExpCuentasBancarias entities that matches the condition 'where ctaDoctoRef is equals to'.
     *
     * @param ctaDoctoRef java.lang.String
     * @return Collection of TdExpCuentasBancarias
     */
    @FindByCondition(value=TdExpCuentasBancarias.class, condition="CTA_DOCTO_REF=?")
    List<TdExpCuentasBancarias> findByCtaDoctoRef(java.lang.String ctaDoctoRef);

    /**
     * Find the first TdExpCuentasBancarias entity that matches the condition 'where ctaNumero is equals to'.
     *
     * @param ctaNumero java.math.BigDecimal
     * @return TdExpCuentasBancarias
     */
    @FindByCondition(value=TdExpCuentasBancarias.class, condition="CTA_NUMERO=?")
    TdExpCuentasBancarias getByCtaNumero(java.math.BigDecimal ctaNumero);

    /**
     * Find all TdExpCuentasBancarias entities that matches the condition 'where ctaNumero is equals to'.
     *
     * @param ctaNumero java.math.BigDecimal
     * @return Collection of TdExpCuentasBancarias
     */
    @FindByCondition(value=TdExpCuentasBancarias.class, condition="CTA_NUMERO=?")
    List<TdExpCuentasBancarias> findByCtaNumero(java.math.BigDecimal ctaNumero);
}