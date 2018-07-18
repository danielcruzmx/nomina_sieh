package gob.shcp.sireh.data.jdbc.spc;

import gob.shcp.fsn.data.annotation.Delete;
import gob.shcp.fsn.data.annotation.FindAll;
import gob.shcp.fsn.data.annotation.FindByCondition;
import gob.shcp.fsn.data.annotation.FindById;
import gob.shcp.fsn.data.annotation.Save;
import gob.shcp.fsn.service.data.orm.JdbcDataService;

import java.util.List;

import gob.shcp.sireh.domain.jdbc.spc.TnCapSancion;


/**
 * Data access interface for TnCapSancion.
 */
public interface TnCapSancionDAO extends JdbcDataService {
    /**
     * Find TnCapSancion entity by its identifier or primary key value.
     *
     * @param id identifier or primary key
     * @return TnCapSancion
     */
    @FindById(TnCapSancion.class)
    TnCapSancion getById(java.lang.Long id);

    /**
     * Get all TnCapSancion entities limited by a maximum number of elements.
     *
     * @return Collection of TnCapSancion
     */
    @FindAll(TnCapSancion.class)
    List<TnCapSancion> findAll();

    /**
     * Make persistence of TnCapSancion entities. If its identifier or primary key is null then create else update.
     *
     * @param entity TnCapSancion
     */
    @Save
    void save(TnCapSancion entity);

    /**
     * Remove TnCapSancion entities.
     *
     * @param entity TnCapSancion
     */
    @Delete
    void delete(TnCapSancion entity);


    /**
     * Find the first TnCapSancion entity that matches the condition 'where fecModifico is equals to'.
     *
     * @param fecModifico java.util.Date
     * @return TnCapSancion
     */
    @FindByCondition(value = TnCapSancion.class, condition = "FEC_MODIFICO=?")
    TnCapSancion getByFecModifico(java.util.Date fecModifico);

    /**
     * Find all TnCapSancion entities that matches the condition 'where fecModifico is equals to'.
     *
     * @param fecModifico java.util.Date
     * @return Collection of TnCapSancion
     */
    @FindByCondition(value = TnCapSancion.class, condition = "FEC_MODIFICO=?")
    List<TnCapSancion> findByFecModifico(java.util.Date fecModifico);

    /**
     * Find the first TnCapSancion entity that matches the condition 'where sancionVigenciaFecFin is equals to'.
     *
     * @param sancionVigenciaFecFin java.util.Date
     * @return TnCapSancion
     */
    @FindByCondition(value = TnCapSancion.class, condition = "SANCION_VIGENCIA_FEC_FIN=?")
    TnCapSancion getBySancionVigenciaFecFin(java.util.Date sancionVigenciaFecFin);

    /**
     * Find all TnCapSancion entities that matches the condition 'where sancionVigenciaFecFin is equals to'.
     *
     * @param sancionVigenciaFecFin java.util.Date
     * @return Collection of TnCapSancion
     */
    @FindByCondition(value = TnCapSancion.class, condition = "SANCION_VIGENCIA_FEC_FIN=?")
    List<TnCapSancion> findBySancionVigenciaFecFin(java.util.Date sancionVigenciaFecFin);

    /**
     * Find the first TnCapSancion entity that matches the condition 'where sancionVigenciaFecIni is equals to'.
     *
     * @param sancionVigenciaFecIni java.util.Date
     * @return TnCapSancion
     */
    @FindByCondition(value = TnCapSancion.class, condition = "SANCION_VIGENCIA_FEC_INI=?")
    TnCapSancion getBySancionVigenciaFecIni(java.util.Date sancionVigenciaFecIni);

    /**
     * Find all TnCapSancion entities that matches the condition 'where sancionVigenciaFecIni is equals to'.
     *
     * @param sancionVigenciaFecIni java.util.Date
     * @return Collection of TnCapSancion
     */
    @FindByCondition(value = TnCapSancion.class, condition = "SANCION_VIGENCIA_FEC_INI=?")
    List<TnCapSancion> findBySancionVigenciaFecIni(java.util.Date sancionVigenciaFecIni);

    /**
     * Find the first TnCapSancion entity that matches the condition 'where usuario is equals to'.
     *
     * @param usuario java.lang.String
     * @return TnCapSancion
     */
    @FindByCondition(value = TnCapSancion.class, condition = "USUARIO=?")
    TnCapSancion getByUsuario(java.lang.String usuario);

    /**
     * Find all TnCapSancion entities that matches the condition 'where usuario is equals to'.
     *
     * @param usuario java.lang.String
     * @return Collection of TnCapSancion
     */
    @FindByCondition(value = TnCapSancion.class, condition = "USUARIO=?")
    List<TnCapSancion> findByUsuario(java.lang.String usuario);
}
