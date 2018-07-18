package gob.shcp.sireh.data.jdbc;

import gob.shcp.fsn.data.annotation.Delete;
import gob.shcp.fsn.data.annotation.FindAll;
import gob.shcp.fsn.data.annotation.FindByCondition;
import gob.shcp.fsn.data.annotation.FindById;
import gob.shcp.fsn.data.annotation.Save;
import gob.shcp.fsn.service.data.orm.JdbcDataService;

import java.util.List;

import gob.shcp.sireh.domain.jdbc.TcNmCausal;


/**
 * Data access interface for TcNmCausal.
 */
public interface TcNmCausalDAO extends JdbcDataService {
    /**
     * Find TcNmCausal entity by its identifier or primary key value.
     *
     * @param id identifier or primary key
     * @return TcNmCausal
     */
    @FindById(TcNmCausal.class)
    TcNmCausal getById(java.lang.Integer id);
    
    /**
     * Get all TcNmCausal entities limited by a maximum number of elements.
     *
     * @return Collection of TcNmCausal
     */
    @FindAll(TcNmCausal.class)
    List<TcNmCausal> findAll();
    
    /**
     * Make persistence of TcNmCausal entities. If its identifier or primary key is null then create else update.
     *
     * @param entity TcNmCausal
     */
    @Save
    void save(TcNmCausal entity);
    
    /**
     * Remove TcNmCausal entities.
     *
     * @param entity TcNmCausal
     */
    @Delete
    void delete(TcNmCausal entity);


    /**
     * Find the first TcNmCausal entity that matches the condition 'where descNmCausal is equals to'.
     *
     * @param descNmCausal java.lang.String
     * @return TcNmCausal
     */
    @FindByCondition(value=TcNmCausal.class, condition="DESC_NM_CAUSAL=?")
    TcNmCausal getByDescNmCausal(java.lang.String descNmCausal);

    /**
     * Find all TcNmCausal entities that matches the condition 'where descNmCausal is equals to'.
     *
     * @param descNmCausal java.lang.String
     * @return Collection of TcNmCausal
     */
    @FindByCondition(value=TcNmCausal.class, condition="DESC_NM_CAUSAL=?")
    List<TcNmCausal> findByDescNmCausal(java.lang.String descNmCausal);

    /**
     * Find the first TcNmCausal entity that matches the condition 'where descNmCausalBase is equals to'.
     *
     * @param descNmCausalBase java.lang.String
     * @return TcNmCausal
     */
    @FindByCondition(value=TcNmCausal.class, condition="DESC_NM_CAUSAL_BASE=?")
    TcNmCausal getByDescNmCausalBase(java.lang.String descNmCausalBase);

    /**
     * Find all TcNmCausal entities that matches the condition 'where descNmCausalBase is equals to'.
     *
     * @param descNmCausalBase java.lang.String
     * @return Collection of TcNmCausal
     */
    @FindByCondition(value=TcNmCausal.class, condition="DESC_NM_CAUSAL_BASE=?")
    List<TcNmCausal> findByDescNmCausalBase(java.lang.String descNmCausalBase);

    /**
     * Find the first TcNmCausal entity that matches the condition 'where descNmCausalConf is equals to'.
     *
     * @param descNmCausalConf java.lang.String
     * @return TcNmCausal
     */
    @FindByCondition(value=TcNmCausal.class, condition="DESC_NM_CAUSAL_CONF=?")
    TcNmCausal getByDescNmCausalConf(java.lang.String descNmCausalConf);

    /**
     * Find all TcNmCausal entities that matches the condition 'where descNmCausalConf is equals to'.
     *
     * @param descNmCausalConf java.lang.String
     * @return Collection of TcNmCausal
     */
    @FindByCondition(value=TcNmCausal.class, condition="DESC_NM_CAUSAL_CONF=?")
    List<TcNmCausal> findByDescNmCausalConf(java.lang.String descNmCausalConf);

    /**
     * Find the first TcNmCausal entity that matches the condition 'where fecModifico is equals to'.
     *
     * @param fecModifico java.util.Date
     * @return TcNmCausal
     */
    @FindByCondition(value=TcNmCausal.class, condition="FEC_MODIFICO=?")
    TcNmCausal getByFecModifico(java.util.Date fecModifico);

    /**
     * Find all TcNmCausal entities that matches the condition 'where fecModifico is equals to'.
     *
     * @param fecModifico java.util.Date
     * @return Collection of TcNmCausal
     */
    @FindByCondition(value=TcNmCausal.class, condition="FEC_MODIFICO=?")
    List<TcNmCausal> findByFecModifico(java.util.Date fecModifico);

    /**
     * Find the first TcNmCausal entity that matches the condition 'where usuario is equals to'.
     *
     * @param usuario java.lang.String
     * @return TcNmCausal
     */
    @FindByCondition(value=TcNmCausal.class, condition="USUARIO=?")
    TcNmCausal getByUsuario(java.lang.String usuario);

    /**
     * Find all TcNmCausal entities that matches the condition 'where usuario is equals to'.
     *
     * @param usuario java.lang.String
     * @return Collection of TcNmCausal
     */
    @FindByCondition(value=TcNmCausal.class, condition="USUARIO=?")
    List<TcNmCausal> findByUsuario(java.lang.String usuario);
}