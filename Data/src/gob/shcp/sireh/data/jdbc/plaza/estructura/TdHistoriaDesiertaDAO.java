package gob.shcp.sireh.data.jdbc.plaza.estructura;

import gob.shcp.fsn.data.annotation.Delete;
import gob.shcp.fsn.data.annotation.FindAll;
import gob.shcp.fsn.data.annotation.FindByCondition;
import gob.shcp.fsn.data.annotation.FindById;
import gob.shcp.fsn.data.annotation.Save;
import gob.shcp.fsn.service.data.orm.JdbcDataService;

import java.util.List;

import gob.shcp.sireh.domain.jdbc.plaza.estructura.TdHistoriaDesierta;


/**
 * Data access interface for TdHistoriaDesierta.
 */
public interface TdHistoriaDesiertaDAO extends JdbcDataService {
    /**
     * Find TdHistoriaDesierta entity by its identifier or primary key value.
     *
     * @param id identifier or primary key
     * @return TdHistoriaDesierta
     */
    @FindById(TdHistoriaDesierta.class)
    TdHistoriaDesierta getById(gob.shcp.sireh.domain.jdbc.plaza.estructura.TdHistoriaDesiertaPK id);
    
    /**
     * Get all TdHistoriaDesierta entities limited by a maximum number of elements.
     *
     * @return Collection of TdHistoriaDesierta
     */
    @FindAll(TdHistoriaDesierta.class)
    List<TdHistoriaDesierta> findAll();
    
    /**
     * Make persistence of TdHistoriaDesierta entities. If its identifier or primary key is null then create else update.
     *
     * @param entity TdHistoriaDesierta
     */
    @Save
    void save(TdHistoriaDesierta entity);
    
    /**
     * Remove TdHistoriaDesierta entities.
     *
     * @param entity TdHistoriaDesierta
     */
    @Delete
    void delete(TdHistoriaDesierta entity);


    /**
     * Find the first TdHistoriaDesierta entity that matches the condition 'where fecModifico is equals to'.
     *
     * @param fecModifico java.util.Date
     * @return TdHistoriaDesierta
     */
    @FindByCondition(value=TdHistoriaDesierta.class, condition="FEC_MODIFICO=?")
    TdHistoriaDesierta getByFecModifico(java.util.Date fecModifico);

    /**
     * Find all TdHistoriaDesierta entities that matches the condition 'where fecModifico is equals to'.
     *
     * @param fecModifico java.util.Date
     * @return Collection of TdHistoriaDesierta
     */
    @FindByCondition(value=TdHistoriaDesierta.class, condition="FEC_MODIFICO=?")
    List<TdHistoriaDesierta> findByFecModifico(java.util.Date fecModifico);

    /**
     * Find the first TdHistoriaDesierta entity that matches the condition 'where usuario is equals to'.
     *
     * @param usuario java.lang.String
     * @return TdHistoriaDesierta
     */
    @FindByCondition(value=TdHistoriaDesierta.class, condition="USUARIO=?")
    TdHistoriaDesierta getByUsuario(java.lang.String usuario);

    /**
     * Find all TdHistoriaDesierta entities that matches the condition 'where usuario is equals to'.
     *
     * @param usuario java.lang.String
     * @return Collection of TdHistoriaDesierta
     */
    @FindByCondition(value=TdHistoriaDesierta.class, condition="USUARIO=?")
    List<TdHistoriaDesierta> findByUsuario(java.lang.String usuario);
}