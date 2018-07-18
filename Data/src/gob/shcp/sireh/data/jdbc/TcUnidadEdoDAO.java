package gob.shcp.sireh.data.jdbc;

import gob.shcp.fsn.data.annotation.Delete;
import gob.shcp.fsn.data.annotation.FindAll;
import gob.shcp.fsn.data.annotation.FindByCondition;
import gob.shcp.fsn.data.annotation.FindById;
import gob.shcp.fsn.data.annotation.Save;
import gob.shcp.fsn.service.data.orm.JdbcDataService;

import java.util.List;

import gob.shcp.sireh.domain.jdbc.TcUnidadEdo;


/**
 * Data access interface for TcUnidadEdo.
 */
public interface TcUnidadEdoDAO extends JdbcDataService {
    /**
     * Find TcUnidadEdo entity by its identifier or primary key value.
     *
     * @param id identifier or primary key
     * @return TcUnidadEdo
     */
    @FindById(TcUnidadEdo.class)
    TcUnidadEdo getById(gob.shcp.sireh.domain.jdbc.TcUnidadEdoPK id);

    /**
     * Get all TcUnidadEdo entities limited by a maximum number of elements.
     *
     * @return Collection of TcUnidadEdo
     */
    @FindAll(TcUnidadEdo.class)
    List<TcUnidadEdo> findAll();

    /**
     * Make persistence of TcUnidadEdo entities. If its identifier or primary key is null then create else update.
     *
     * @param entity TcUnidadEdo
     */
    @Save
    void save(TcUnidadEdo entity);

    /**
     * Remove TcUnidadEdo entities.
     *
     * @param entity TcUnidadEdo
     */
    @Delete
    void delete(TcUnidadEdo entity);


    /**
     * Find the first TcUnidadEdo entity that matches the condition 'where fecModifico is equals to'.
     *
     * @param fecModifico java.util.Date
     * @return TcUnidadEdo
     */
    @FindByCondition(value = TcUnidadEdo.class, condition = "FEC_MODIFICO=?")
    TcUnidadEdo getByFecModifico(java.util.Date fecModifico);

    /**
     * Find all TcUnidadEdo entities that matches the condition 'where fecModifico is equals to'.
     *
     * @param fecModifico java.util.Date
     * @return Collection of TcUnidadEdo
     */
    @FindByCondition(value = TcUnidadEdo.class, condition = "FEC_MODIFICO=?")
    List<TcUnidadEdo> findByFecModifico(java.util.Date fecModifico);

    /**
     * Find the first TcUnidadEdo entity that matches the condition 'where usuario is equals to'.
     *
     * @param usuario java.lang.String
     * @return TcUnidadEdo
     */
    @FindByCondition(value = TcUnidadEdo.class, condition = "USUARIO=?")
    TcUnidadEdo getByUsuario(java.lang.String usuario);

    /**
     * Find all TcUnidadEdo entities that matches the condition 'where usuario is equals to'.
     *
     * @param usuario java.lang.String
     * @return Collection of TcUnidadEdo
     */
    @FindByCondition(value = TcUnidadEdo.class, condition = "USUARIO=?")
    List<TcUnidadEdo> findByUsuario(java.lang.String usuario);
}
