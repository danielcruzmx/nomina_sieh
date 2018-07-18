package gob.shcp.sireh.data.jdbc;

import gob.shcp.fsn.data.annotation.Delete;
import gob.shcp.fsn.data.annotation.FindAll;
import gob.shcp.fsn.data.annotation.FindByCondition;
import gob.shcp.fsn.data.annotation.FindById;
import gob.shcp.fsn.data.annotation.Save;
import gob.shcp.fsn.service.data.orm.JdbcDataService;

import java.util.List;

import gob.shcp.sireh.domain.jdbc.TcPartida;


/**
 * Data access interface for TcPartida.
 */
public interface TcPartidaDAO extends JdbcDataService {
    /**
     * Find TcPartida entity by its identifier or primary key value.
     *
     * @param id identifier or primary key
     * @return TcPartida
     */
    @FindById(TcPartida.class)
    TcPartida getById(java.lang.String id);
    
    /**
     * Get all TcPartida entities limited by a maximum number of elements.
     *
     * @return Collection of TcPartida
     */
    @FindAll(TcPartida.class)
    List<TcPartida> findAll();
    
    /**
     * Make persistence of TcPartida entities. If its identifier or primary key is null then create else update.
     *
     * @param entity TcPartida
     */
    @Save
    void save(TcPartida entity);
    
    /**
     * Remove TcPartida entities.
     *
     * @param entity TcPartida
     */
    @Delete
    void delete(TcPartida entity);


    /**
     * Find the first TcPartida entity that matches the condition 'where descPartida is equals to'.
     *
     * @param descPartida java.lang.String
     * @return TcPartida
     */
    @FindByCondition(value=TcPartida.class, condition="DESC_PARTIDA=?")
    TcPartida getByDescPartida(java.lang.String descPartida);

    /**
     * Find all TcPartida entities that matches the condition 'where descPartida is equals to'.
     *
     * @param descPartida java.lang.String
     * @return Collection of TcPartida
     */
    @FindByCondition(value=TcPartida.class, condition="DESC_PARTIDA=?")
    List<TcPartida> findByDescPartida(java.lang.String descPartida);

    /**
     * Find the first TcPartida entity that matches the condition 'where fecModifico is equals to'.
     *
     * @param fecModifico java.util.Date
     * @return TcPartida
     */
    @FindByCondition(value=TcPartida.class, condition="FEC_MODIFICO=?")
    TcPartida getByFecModifico(java.util.Date fecModifico);

    /**
     * Find all TcPartida entities that matches the condition 'where fecModifico is equals to'.
     *
     * @param fecModifico java.util.Date
     * @return Collection of TcPartida
     */
    @FindByCondition(value=TcPartida.class, condition="FEC_MODIFICO=?")
    List<TcPartida> findByFecModifico(java.util.Date fecModifico);

    /**
     * Find the first TcPartida entity that matches the condition 'where ptdaInfoCpto is equals to'.
     *
     * @param ptdaInfoCpto java.lang.String
     * @return TcPartida
     */
    @FindByCondition(value=TcPartida.class, condition="PTDA_INFO_CPTO=?")
    TcPartida getByPtdaInfoCpto(java.lang.String ptdaInfoCpto);

    /**
     * Find all TcPartida entities that matches the condition 'where ptdaInfoCpto is equals to'.
     *
     * @param ptdaInfoCpto java.lang.String
     * @return Collection of TcPartida
     */
    @FindByCondition(value=TcPartida.class, condition="PTDA_INFO_CPTO=?")
    List<TcPartida> findByPtdaInfoCpto(java.lang.String ptdaInfoCpto);

    /**
     * Find the first TcPartida entity that matches the condition 'where usuario is equals to'.
     *
     * @param usuario java.lang.String
     * @return TcPartida
     */
    @FindByCondition(value=TcPartida.class, condition="USUARIO=?")
    TcPartida getByUsuario(java.lang.String usuario);

    /**
     * Find all TcPartida entities that matches the condition 'where usuario is equals to'.
     *
     * @param usuario java.lang.String
     * @return Collection of TcPartida
     */
    @FindByCondition(value=TcPartida.class, condition="USUARIO=?")
    List<TcPartida> findByUsuario(java.lang.String usuario);
}