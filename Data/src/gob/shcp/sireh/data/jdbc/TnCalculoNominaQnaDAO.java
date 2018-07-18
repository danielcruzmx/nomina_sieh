package gob.shcp.sireh.data.jdbc;

import gob.shcp.fsn.data.annotation.Delete;
import gob.shcp.fsn.data.annotation.FindAll;
import gob.shcp.fsn.data.annotation.FindByCondition;
import gob.shcp.fsn.data.annotation.FindById;
import gob.shcp.fsn.data.annotation.Save;
import gob.shcp.fsn.service.data.orm.JdbcDataService;

import java.util.List;

import gob.shcp.sireh.domain.jdbc.TnCalculoNominaQna;


/**
 * Data access interface for TnCalculoNominaQna.
 */
public interface TnCalculoNominaQnaDAO extends JdbcDataService {
    /**
     * Find TnCalculoNominaQna entity by its identifier or primary key value.
     *
     * @param id identifier or primary key
     * @return TnCalculoNominaQna
     */
    @FindById(TnCalculoNominaQna.class)
    TnCalculoNominaQna getById(gob.shcp.sireh.domain.jdbc.TnCalculoNominaQnaPK id);
    
    /**
     * Get all TnCalculoNominaQna entities limited by a maximum number of elements.
     *
     * @return Collection of TnCalculoNominaQna
     */
    @FindAll(TnCalculoNominaQna.class)
    List<TnCalculoNominaQna> findAll();
    
    /**
     * Make persistence of TnCalculoNominaQna entities. If its identifier or primary key is null then create else update.
     *
     * @param entity TnCalculoNominaQna
     */
    @Save
    void save(TnCalculoNominaQna entity);
    
    /**
     * Remove TnCalculoNominaQna entities.
     *
     * @param entity TnCalculoNominaQna
     */
    @Delete
    void delete(TnCalculoNominaQna entity);


    /**
     * Find the first TnCalculoNominaQna entity that matches the condition 'where fecModifico is equals to'.
     *
     * @param fecModifico java.util.Date
     * @return TnCalculoNominaQna
     */
    @FindByCondition(value=TnCalculoNominaQna.class, condition="FEC_MODIFICO=?")
    TnCalculoNominaQna getByFecModifico(java.util.Date fecModifico);

    /**
     * Find all TnCalculoNominaQna entities that matches the condition 'where fecModifico is equals to'.
     *
     * @param fecModifico java.util.Date
     * @return Collection of TnCalculoNominaQna
     */
    @FindByCondition(value=TnCalculoNominaQna.class, condition="FEC_MODIFICO=?")
    List<TnCalculoNominaQna> findByFecModifico(java.util.Date fecModifico);

    /**
     * Find the first TnCalculoNominaQna entity that matches the condition 'where usuario is equals to'.
     *
     * @param usuario java.lang.String
     * @return TnCalculoNominaQna
     */
    @FindByCondition(value=TnCalculoNominaQna.class, condition="USUARIO=?")
    TnCalculoNominaQna getByUsuario(java.lang.String usuario);

    /**
     * Find all TnCalculoNominaQna entities that matches the condition 'where usuario is equals to'.
     *
     * @param usuario java.lang.String
     * @return Collection of TnCalculoNominaQna
     */
    @FindByCondition(value=TnCalculoNominaQna.class, condition="USUARIO=?")
    List<TnCalculoNominaQna> findByUsuario(java.lang.String usuario);

    /**
     * Find the first TnCalculoNominaQna entity that matches the condition 'where cnqCptos is equals to'.
     *
     * @param cnqCptos java.lang.String
     * @return TnCalculoNominaQna
     */
    @FindByCondition(value=TnCalculoNominaQna.class, condition="CNQ_CPTOS=?")
    TnCalculoNominaQna getByCnqCptos(java.lang.String cnqCptos);

    /**
     * Find all TnCalculoNominaQna entities that matches the condition 'where cnqCptos is equals to'.
     *
     * @param cnqCptos java.lang.String
     * @return Collection of TnCalculoNominaQna
     */
    @FindByCondition(value=TnCalculoNominaQna.class, condition="CNQ_CPTOS=?")
    List<TnCalculoNominaQna> findByCnqCptos(java.lang.String cnqCptos);

    /**
     * Find the first TnCalculoNominaQna entity that matches the condition 'where cnqFinPago is equals to'.
     *
     * @param cnqFinPago java.util.Date
     * @return TnCalculoNominaQna
     */
    @FindByCondition(value=TnCalculoNominaQna.class, condition="CNQ_FIN_PAGO=?")
    TnCalculoNominaQna getByCnqFinPago(java.util.Date cnqFinPago);

    /**
     * Find all TnCalculoNominaQna entities that matches the condition 'where cnqFinPago is equals to'.
     *
     * @param cnqFinPago java.util.Date
     * @return Collection of TnCalculoNominaQna
     */
    @FindByCondition(value=TnCalculoNominaQna.class, condition="CNQ_FIN_PAGO=?")
    List<TnCalculoNominaQna> findByCnqFinPago(java.util.Date cnqFinPago);

    /**
     * Find the first TnCalculoNominaQna entity that matches the condition 'where cnqLiquido is equals to'.
     *
     * @param cnqLiquido java.lang.Double
     * @return TnCalculoNominaQna
     */
    @FindByCondition(value=TnCalculoNominaQna.class, condition="CNQ_LIQUIDO=?")
    TnCalculoNominaQna getByCnqLiquido(java.lang.Double cnqLiquido);

    /**
     * Find all TnCalculoNominaQna entities that matches the condition 'where cnqLiquido is equals to'.
     *
     * @param cnqLiquido java.lang.Double
     * @return Collection of TnCalculoNominaQna
     */
    @FindByCondition(value=TnCalculoNominaQna.class, condition="CNQ_LIQUIDO=?")
    List<TnCalculoNominaQna> findByCnqLiquido(java.lang.Double cnqLiquido);
}