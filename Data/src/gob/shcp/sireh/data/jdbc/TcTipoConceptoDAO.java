package gob.shcp.sireh.data.jdbc;

import gob.shcp.fsn.data.annotation.Delete;
import gob.shcp.fsn.data.annotation.FindAll;
import gob.shcp.fsn.data.annotation.FindByCondition;
import gob.shcp.fsn.data.annotation.FindById;
import gob.shcp.fsn.data.annotation.Save;
import gob.shcp.fsn.service.data.orm.JdbcDataService;

import java.util.List;

import gob.shcp.sireh.domain.jdbc.TcTipoConcepto;


/**
 * Data access interface for TcTipoConcepto.
 */
public interface TcTipoConceptoDAO extends JdbcDataService {
    /**
     * Find TcTipoConcepto entity by its identifier or primary key value.
     *
     * @param id identifier or primary key
     * @return TcTipoConcepto
     */
    @FindById(TcTipoConcepto.class)
    TcTipoConcepto getById(java.lang.String id);
    
    /**
     * Get all TcTipoConcepto entities limited by a maximum number of elements.
     *
     * @return Collection of TcTipoConcepto
     */
    @FindAll(TcTipoConcepto.class)
    List<TcTipoConcepto> findAll();
    
    /**
     * Make persistence of TcTipoConcepto entities. If its identifier or primary key is null then create else update.
     *
     * @param entity TcTipoConcepto
     */
    @Save
    void save(TcTipoConcepto entity);
    
    /**
     * Remove TcTipoConcepto entities.
     *
     * @param entity TcTipoConcepto
     */
    @Delete
    void delete(TcTipoConcepto entity);


    /**
     * Find the first TcTipoConcepto entity that matches the condition 'where descTipoConcepto is equals to'.
     *
     * @param descTipoConcepto java.lang.String
     * @return TcTipoConcepto
     */
    @FindByCondition(value=TcTipoConcepto.class, condition="DESC_TIPO_CONCEPTO=?")
    TcTipoConcepto getByDescTipoConcepto(java.lang.String descTipoConcepto);

    /**
     * Find all TcTipoConcepto entities that matches the condition 'where descTipoConcepto is equals to'.
     *
     * @param descTipoConcepto java.lang.String
     * @return Collection of TcTipoConcepto
     */
    @FindByCondition(value=TcTipoConcepto.class, condition="DESC_TIPO_CONCEPTO=?")
    List<TcTipoConcepto> findByDescTipoConcepto(java.lang.String descTipoConcepto);

    /**
     * Find the first TcTipoConcepto entity that matches the condition 'where fecModifico is equals to'.
     *
     * @param fecModifico java.util.Date
     * @return TcTipoConcepto
     */
    @FindByCondition(value=TcTipoConcepto.class, condition="FEC_MODIFICO=?")
    TcTipoConcepto getByFecModifico(java.util.Date fecModifico);

    /**
     * Find all TcTipoConcepto entities that matches the condition 'where fecModifico is equals to'.
     *
     * @param fecModifico java.util.Date
     * @return Collection of TcTipoConcepto
     */
    @FindByCondition(value=TcTipoConcepto.class, condition="FEC_MODIFICO=?")
    List<TcTipoConcepto> findByFecModifico(java.util.Date fecModifico);

    /**
     * Find the first TcTipoConcepto entity that matches the condition 'where usuario is equals to'.
     *
     * @param usuario java.lang.String
     * @return TcTipoConcepto
     */
    @FindByCondition(value=TcTipoConcepto.class, condition="USUARIO=?")
    TcTipoConcepto getByUsuario(java.lang.String usuario);

    /**
     * Find all TcTipoConcepto entities that matches the condition 'where usuario is equals to'.
     *
     * @param usuario java.lang.String
     * @return Collection of TcTipoConcepto
     */
    @FindByCondition(value=TcTipoConcepto.class, condition="USUARIO=?")
    List<TcTipoConcepto> findByUsuario(java.lang.String usuario);
}