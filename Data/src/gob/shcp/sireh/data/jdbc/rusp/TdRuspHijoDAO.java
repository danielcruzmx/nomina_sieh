package gob.shcp.sireh.data.jdbc.rusp;

import gob.shcp.fsn.data.annotation.Delete;
import gob.shcp.fsn.data.annotation.FindAll;
import gob.shcp.fsn.data.annotation.FindByCondition;
import gob.shcp.fsn.data.annotation.FindById;
import gob.shcp.fsn.data.annotation.Save;
import gob.shcp.fsn.service.data.orm.JdbcDataService;

import java.util.List;

import gob.shcp.sireh.domain.jdbc.rusp.TdRuspHijo;


/**
 * Data access interface for TdRuspHijo.
 */
public interface TdRuspHijoDAO extends JdbcDataService {
    /**
     * Find TdRuspHijo entity by its identifier or primary key value.
     *
     * @param id identifier or primary key
     * @return TdRuspHijo
     */
    @FindById(TdRuspHijo.class)
    TdRuspHijo getById(gob.shcp.sireh.domain.jdbc.rusp.TdRuspHijoPK id);
    
    /**
     * Get all TdRuspHijo entities limited by a maximum number of elements.
     *
     * @return Collection of TdRuspHijo
     */
    @FindAll(TdRuspHijo.class)
    List<TdRuspHijo> findAll();
    
    /**
     * Make persistence of TdRuspHijo entities. If its identifier or primary key is null then create else update.
     *
     * @param entity TdRuspHijo
     */
    @Save
    void save(TdRuspHijo entity);
    
    /**
     * Remove TdRuspHijo entities.
     *
     * @param entity TdRuspHijo
     */
    @Delete
    void delete(TdRuspHijo entity);


    /**
     * Find the first TdRuspHijo entity that matches the condition 'where fecModifico is equals to'.
     *
     * @param fecModifico java.util.Date
     * @return TdRuspHijo
     */
    @FindByCondition(value=TdRuspHijo.class, condition="FEC_MODIFICO=?")
    TdRuspHijo getByFecModifico(java.util.Date fecModifico);

    /**
     * Find all TdRuspHijo entities that matches the condition 'where fecModifico is equals to'.
     *
     * @param fecModifico java.util.Date
     * @return Collection of TdRuspHijo
     */
    @FindByCondition(value=TdRuspHijo.class, condition="FEC_MODIFICO=?")
    List<TdRuspHijo> findByFecModifico(java.util.Date fecModifico);

    /**
     * Find the first TdRuspHijo entity that matches the condition 'where trhRfcUnico is equals to'.
     *
     * @param trhRfcUnico java.lang.String
     * @return TdRuspHijo
     */
    @FindByCondition(value=TdRuspHijo.class, condition="TRH_RFC_UNICO=?")
    TdRuspHijo getByTrhRfcUnico(java.lang.String trhRfcUnico);

    /**
     * Find all TdRuspHijo entities that matches the condition 'where trhRfcUnico is equals to'.
     *
     * @param trhRfcUnico java.lang.String
     * @return Collection of TdRuspHijo
     */
    @FindByCondition(value=TdRuspHijo.class, condition="TRH_RFC_UNICO=?")
    List<TdRuspHijo> findByTrhRfcUnico(java.lang.String trhRfcUnico);

    /**
     * Find the first TdRuspHijo entity that matches the condition 'where usuario is equals to'.
     *
     * @param usuario java.lang.String
     * @return TdRuspHijo
     */
    @FindByCondition(value=TdRuspHijo.class, condition="USUARIO=?")
    TdRuspHijo getByUsuario(java.lang.String usuario);

    /**
     * Find all TdRuspHijo entities that matches the condition 'where usuario is equals to'.
     *
     * @param usuario java.lang.String
     * @return Collection of TdRuspHijo
     */
    @FindByCondition(value=TdRuspHijo.class, condition="USUARIO=?")
    List<TdRuspHijo> findByUsuario(java.lang.String usuario);

    /**
     * Find the first TdRuspHijo entity that matches the condition 'where trhNombre is equals to'.
     *
     * @param trhNombre java.lang.String
     * @return TdRuspHijo
     */
    @FindByCondition(value=TdRuspHijo.class, condition="TRH_NOMBRE=?")
    TdRuspHijo getByTrhNombre(java.lang.String trhNombre);

    /**
     * Find all TdRuspHijo entities that matches the condition 'where trhNombre is equals to'.
     *
     * @param trhNombre java.lang.String
     * @return Collection of TdRuspHijo
     */
    @FindByCondition(value=TdRuspHijo.class, condition="TRH_NOMBRE=?")
    List<TdRuspHijo> findByTrhNombre(java.lang.String trhNombre);

    /**
     * Find the first TdRuspHijo entity that matches the condition 'where trhPrimer is equals to'.
     *
     * @param trhPrimer java.lang.String
     * @return TdRuspHijo
     */
    @FindByCondition(value=TdRuspHijo.class, condition="TRH_PRIMER=?")
    TdRuspHijo getByTrhPrimer(java.lang.String trhPrimer);

    /**
     * Find all TdRuspHijo entities that matches the condition 'where trhPrimer is equals to'.
     *
     * @param trhPrimer java.lang.String
     * @return Collection of TdRuspHijo
     */
    @FindByCondition(value=TdRuspHijo.class, condition="TRH_PRIMER=?")
    List<TdRuspHijo> findByTrhPrimer(java.lang.String trhPrimer);

    /**
     * Find the first TdRuspHijo entity that matches the condition 'where trhSegundo is equals to'.
     *
     * @param trhSegundo java.lang.String
     * @return TdRuspHijo
     */
    @FindByCondition(value=TdRuspHijo.class, condition="TRH_SEGUNDO=?")
    TdRuspHijo getByTrhSegundo(java.lang.String trhSegundo);

    /**
     * Find all TdRuspHijo entities that matches the condition 'where trhSegundo is equals to'.
     *
     * @param trhSegundo java.lang.String
     * @return Collection of TdRuspHijo
     */
    @FindByCondition(value=TdRuspHijo.class, condition="TRH_SEGUNDO=?")
    List<TdRuspHijo> findByTrhSegundo(java.lang.String trhSegundo);
}