package gob.shcp.sireh.data.jdbc.rusp;

import gob.shcp.fsn.data.annotation.Delete;
import gob.shcp.fsn.data.annotation.FindAll;
import gob.shcp.fsn.data.annotation.FindByCondition;
import gob.shcp.fsn.data.annotation.FindById;
import gob.shcp.fsn.data.annotation.Save;
import gob.shcp.fsn.service.data.orm.JdbcDataService;

import java.util.List;

import gob.shcp.sireh.domain.jdbc.rusp.TdRuspLengua;


/**
 * Data access interface for TdRuspLengua.
 */
public interface TdRuspLenguaDAO extends JdbcDataService {
    /**
     * Find TdRuspLengua entity by its identifier or primary key value.
     *
     * @param id identifier or primary key
     * @return TdRuspLengua
     */
    @FindById(TdRuspLengua.class)
    TdRuspLengua getById(gob.shcp.sireh.domain.jdbc.rusp.TdRuspLenguaPK id);
    
    /**
     * Get all TdRuspLengua entities limited by a maximum number of elements.
     *
     * @return Collection of TdRuspLengua
     */
    @FindAll(TdRuspLengua.class)
    List<TdRuspLengua> findAll();
    
    /**
     * Make persistence of TdRuspLengua entities. If its identifier or primary key is null then create else update.
     *
     * @param entity TdRuspLengua
     */
    @Save
    void save(TdRuspLengua entity);
    
    /**
     * Remove TdRuspLengua entities.
     *
     * @param entity TdRuspLengua
     */
    @Delete
    void delete(TdRuspLengua entity);


    /**
     * Find the first TdRuspLengua entity that matches the condition 'where fecModifico is equals to'.
     *
     * @param fecModifico java.util.Date
     * @return TdRuspLengua
     */
    @FindByCondition(value=TdRuspLengua.class, condition="FEC_MODIFICO=?")
    TdRuspLengua getByFecModifico(java.util.Date fecModifico);

    /**
     * Find all TdRuspLengua entities that matches the condition 'where fecModifico is equals to'.
     *
     * @param fecModifico java.util.Date
     * @return Collection of TdRuspLengua
     */
    @FindByCondition(value=TdRuspLengua.class, condition="FEC_MODIFICO=?")
    List<TdRuspLengua> findByFecModifico(java.util.Date fecModifico);

    /**
     * Find the first TdRuspLengua entity that matches the condition 'where trlRfcUnico is equals to'.
     *
     * @param trlRfcUnico java.lang.String
     * @return TdRuspLengua
     */
    @FindByCondition(value=TdRuspLengua.class, condition="TRL_RFC_UNICO=?")
    TdRuspLengua getByTrlRfcUnico(java.lang.String trlRfcUnico);

    /**
     * Find all TdRuspLengua entities that matches the condition 'where trlRfcUnico is equals to'.
     *
     * @param trlRfcUnico java.lang.String
     * @return Collection of TdRuspLengua
     */
    @FindByCondition(value=TdRuspLengua.class, condition="TRL_RFC_UNICO=?")
    List<TdRuspLengua> findByTrlRfcUnico(java.lang.String trlRfcUnico);

    /**
     * Find the first TdRuspLengua entity that matches the condition 'where trlTipo is equals to'.
     *
     * @param trlTipo java.lang.String
     * @return TdRuspLengua
     */
    @FindByCondition(value=TdRuspLengua.class, condition="TRL_TIPO=?")
    TdRuspLengua getByTrlTipo(java.lang.String trlTipo);

    /**
     * Find all TdRuspLengua entities that matches the condition 'where trlTipo is equals to'.
     *
     * @param trlTipo java.lang.String
     * @return Collection of TdRuspLengua
     */
    @FindByCondition(value=TdRuspLengua.class, condition="TRL_TIPO=?")
    List<TdRuspLengua> findByTrlTipo(java.lang.String trlTipo);

    /**
     * Find the first TdRuspLengua entity that matches the condition 'where usuario is equals to'.
     *
     * @param usuario java.lang.String
     * @return TdRuspLengua
     */
    @FindByCondition(value=TdRuspLengua.class, condition="USUARIO=?")
    TdRuspLengua getByUsuario(java.lang.String usuario);

    /**
     * Find all TdRuspLengua entities that matches the condition 'where usuario is equals to'.
     *
     * @param usuario java.lang.String
     * @return Collection of TdRuspLengua
     */
    @FindByCondition(value=TdRuspLengua.class, condition="USUARIO=?")
    List<TdRuspLengua> findByUsuario(java.lang.String usuario);
}