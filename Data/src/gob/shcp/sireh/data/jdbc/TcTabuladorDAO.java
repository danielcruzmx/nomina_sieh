package gob.shcp.sireh.data.jdbc;

import gob.shcp.fsn.data.annotation.Delete;
import gob.shcp.fsn.data.annotation.FindAll;
import gob.shcp.fsn.data.annotation.FindByCondition;
import gob.shcp.fsn.data.annotation.FindById;
import gob.shcp.fsn.data.annotation.Save;
import gob.shcp.fsn.service.data.orm.JdbcDataService;

import java.util.List;

import gob.shcp.sireh.domain.jdbc.TcTabulador;


/**
 * Data access interface for TcTabulador.
 */
public interface TcTabuladorDAO extends JdbcDataService {
    /**
     * Find TcTabulador entity by its identifier or primary key value.
     *
     * @param id identifier or primary key
     * @return TcTabulador
     */
    @FindById(TcTabulador.class)
    TcTabulador getById(gob.shcp.sireh.domain.jdbc.TcTabuladorPK id);
    
    /**
     * Get all TcTabulador entities limited by a maximum number of elements.
     *
     * @return Collection of TcTabulador
     */
    @FindAll(TcTabulador.class)
    List<TcTabulador> findAll();
    
    /**
     * Make persistence of TcTabulador entities. If its identifier or primary key is null then create else update.
     *
     * @param entity TcTabulador
     */
    @Save
    void save(TcTabulador entity);
    
    /**
     * Remove TcTabulador entities.
     *
     * @param entity TcTabulador
     */
    @Delete
    void delete(TcTabulador entity);


    /**
     * Find the first TcTabulador entity that matches the condition 'where fecModifico is equals to'.
     *
     * @param fecModifico java.util.Date
     * @return TcTabulador
     */
    @FindByCondition(value=TcTabulador.class, condition="FEC_MODIFICO=?")
    TcTabulador getByFecModifico(java.util.Date fecModifico);

    /**
     * Find all TcTabulador entities that matches the condition 'where fecModifico is equals to'.
     *
     * @param fecModifico java.util.Date
     * @return Collection of TcTabulador
     */
    @FindByCondition(value=TcTabulador.class, condition="FEC_MODIFICO=?")
    List<TcTabulador> findByFecModifico(java.util.Date fecModifico);

    /**
     * Find the first TcTabulador entity that matches the condition 'where tabCompensacion is equals to'.
     *
     * @param tabCompensacion double
     * @return TcTabulador
     */
    @FindByCondition(value=TcTabulador.class, condition="TAB_COMPENSACION=?")
    TcTabulador getByTabCompensacion(double tabCompensacion);

    /**
     * Find all TcTabulador entities that matches the condition 'where tabCompensacion is equals to'.
     *
     * @param tabCompensacion double
     * @return Collection of TcTabulador
     */
    @FindByCondition(value=TcTabulador.class, condition="TAB_COMPENSACION=?")
    List<TcTabulador> findByTabCompensacion(double tabCompensacion);

    /**
     * Find the first TcTabulador entity that matches the condition 'where tabIni is equals to'.
     *
     * @param tabIni java.util.Date
     * @return TcTabulador
     */
    @FindByCondition(value=TcTabulador.class, condition="TAB_INI=?")
    TcTabulador getByTabIni(java.util.Date tabIni);

    /**
     * Find all TcTabulador entities that matches the condition 'where tabIni is equals to'.
     *
     * @param tabIni java.util.Date
     * @return Collection of TcTabulador
     */
    @FindByCondition(value=TcTabulador.class, condition="TAB_INI=?")
    List<TcTabulador> findByTabIni(java.util.Date tabIni);

    /**
     * Find the first TcTabulador entity that matches the condition 'where tabSueldo is equals to'.
     *
     * @param tabSueldo double
     * @return TcTabulador
     */
    @FindByCondition(value=TcTabulador.class, condition="TAB_SUELDO=?")
    TcTabulador getByTabSueldo(double tabSueldo);

    /**
     * Find all TcTabulador entities that matches the condition 'where tabSueldo is equals to'.
     *
     * @param tabSueldo double
     * @return Collection of TcTabulador
     */
    @FindByCondition(value=TcTabulador.class, condition="TAB_SUELDO=?")
    List<TcTabulador> findByTabSueldo(double tabSueldo);

    /**
     * Find the first TcTabulador entity that matches the condition 'where usuario is equals to'.
     *
     * @param usuario java.lang.String
     * @return TcTabulador
     */
    @FindByCondition(value=TcTabulador.class, condition="USUARIO=?")
    TcTabulador getByUsuario(java.lang.String usuario);

    /**
     * Find all TcTabulador entities that matches the condition 'where usuario is equals to'.
     *
     * @param usuario java.lang.String
     * @return Collection of TcTabulador
     */
    @FindByCondition(value=TcTabulador.class, condition="USUARIO=?")
    List<TcTabulador> findByUsuario(java.lang.String usuario);
}