package gob.shcp.sireh.data.jdbc;

import gob.shcp.fsn.data.annotation.Delete;
import gob.shcp.fsn.data.annotation.FindAll;
import gob.shcp.fsn.data.annotation.FindByCondition;
import gob.shcp.fsn.data.annotation.FindById;
import gob.shcp.fsn.data.annotation.Save;
import gob.shcp.fsn.service.data.orm.JdbcDataService;

import java.util.List;

import gob.shcp.sireh.domain.jdbc.TdExpCapacitacion;


/**
 * Data access interface for TdExpCapacitacion.
 */
public interface TdExpCapacitacionDAO extends JdbcDataService {
    /**
     * Find TdExpCapacitacion entity by its identifier or primary key value.
     *
     * @param id identifier or primary key
     * @return TdExpCapacitacion
     */
    @FindById(TdExpCapacitacion.class)
    TdExpCapacitacion getById(gob.shcp.sireh.domain.jdbc.TdExpCapacitacionPK id);
    
    /**
     * Get all TdExpCapacitacion entities limited by a maximum number of elements.
     *
     * @return Collection of TdExpCapacitacion
     */
    @FindAll(TdExpCapacitacion.class)
    List<TdExpCapacitacion> findAll();
    
    /**
     * Make persistence of TdExpCapacitacion entities. If its identifier or primary key is null then create else update.
     *
     * @param entity TdExpCapacitacion
     */
    @Save
    void save(TdExpCapacitacion entity);
    
    /**
     * Remove TdExpCapacitacion entities.
     *
     * @param entity TdExpCapacitacion
     */
    @Delete
    void delete(TdExpCapacitacion entity);


    /**
     * Find the first TdExpCapacitacion entity that matches the condition 'where capDescCapacitacion is equals to'.
     *
     * @param capDescCapacitacion java.lang.String
     * @return TdExpCapacitacion
     */
    @FindByCondition(value=TdExpCapacitacion.class, condition="CAP_DESC_CAPACITACION=?")
    TdExpCapacitacion getByCapDescCapacitacion(java.lang.String capDescCapacitacion);

    /**
     * Find all TdExpCapacitacion entities that matches the condition 'where capDescCapacitacion is equals to'.
     *
     * @param capDescCapacitacion java.lang.String
     * @return Collection of TdExpCapacitacion
     */
    @FindByCondition(value=TdExpCapacitacion.class, condition="CAP_DESC_CAPACITACION=?")
    List<TdExpCapacitacion> findByCapDescCapacitacion(java.lang.String capDescCapacitacion);

    /**
     * Find the first TdExpCapacitacion entity that matches the condition 'where capDoctoRef is equals to'.
     *
     * @param capDoctoRef java.lang.String
     * @return TdExpCapacitacion
     */
    @FindByCondition(value=TdExpCapacitacion.class, condition="CAP_DOCTO_REF=?")
    TdExpCapacitacion getByCapDoctoRef(java.lang.String capDoctoRef);

    /**
     * Find all TdExpCapacitacion entities that matches the condition 'where capDoctoRef is equals to'.
     *
     * @param capDoctoRef java.lang.String
     * @return Collection of TdExpCapacitacion
     */
    @FindByCondition(value=TdExpCapacitacion.class, condition="CAP_DOCTO_REF=?")
    List<TdExpCapacitacion> findByCapDoctoRef(java.lang.String capDoctoRef);

    /**
     * Find the first TdExpCapacitacion entity that matches the condition 'where capEstConcluidos is equals to'.
     *
     * @param capEstConcluidos java.lang.String
     * @return TdExpCapacitacion
     */
    @FindByCondition(value=TdExpCapacitacion.class, condition="CAP_EST_CONCLUIDOS=?")
    TdExpCapacitacion getByCapEstConcluidos(java.lang.String capEstConcluidos);

    /**
     * Find all TdExpCapacitacion entities that matches the condition 'where capEstConcluidos is equals to'.
     *
     * @param capEstConcluidos java.lang.String
     * @return Collection of TdExpCapacitacion
     */
    @FindByCondition(value=TdExpCapacitacion.class, condition="CAP_EST_CONCLUIDOS=?")
    List<TdExpCapacitacion> findByCapEstConcluidos(java.lang.String capEstConcluidos);

    /**
     * Find the first TdExpCapacitacion entity that matches the condition 'where fecModifico is equals to'.
     *
     * @param fecModifico java.util.Date
     * @return TdExpCapacitacion
     */
    @FindByCondition(value=TdExpCapacitacion.class, condition="FEC_MODIFICO=?")
    TdExpCapacitacion getByFecModifico(java.util.Date fecModifico);

    /**
     * Find all TdExpCapacitacion entities that matches the condition 'where fecModifico is equals to'.
     *
     * @param fecModifico java.util.Date
     * @return Collection of TdExpCapacitacion
     */
    @FindByCondition(value=TdExpCapacitacion.class, condition="FEC_MODIFICO=?")
    List<TdExpCapacitacion> findByFecModifico(java.util.Date fecModifico);

    /**
     * Find the first TdExpCapacitacion entity that matches the condition 'where idCapacitacion is equals to'.
     *
     * @param idCapacitacion java.lang.String
     * @return TdExpCapacitacion
     */
    @FindByCondition(value=TdExpCapacitacion.class, condition="ID_CAPACITACION=?")
    TdExpCapacitacion getByIdCapacitacion(java.lang.String idCapacitacion);

    /**
     * Find all TdExpCapacitacion entities that matches the condition 'where idCapacitacion is equals to'.
     *
     * @param idCapacitacion java.lang.String
     * @return Collection of TdExpCapacitacion
     */
    @FindByCondition(value=TdExpCapacitacion.class, condition="ID_CAPACITACION=?")
    List<TdExpCapacitacion> findByIdCapacitacion(java.lang.String idCapacitacion);

    /**
     * Find the first TdExpCapacitacion entity that matches the condition 'where idInstEducat is equals to'.
     *
     * @param idInstEducat int
     * @return TdExpCapacitacion
     */
    @FindByCondition(value=TdExpCapacitacion.class, condition="ID_INST_EDUCAT=?")
    TdExpCapacitacion getByIdInstEducat(int idInstEducat);

    /**
     * Find all TdExpCapacitacion entities that matches the condition 'where idInstEducat is equals to'.
     *
     * @param idInstEducat int
     * @return Collection of TdExpCapacitacion
     */
    @FindByCondition(value=TdExpCapacitacion.class, condition="ID_INST_EDUCAT=?")
    List<TdExpCapacitacion> findByIdInstEducat(int idInstEducat);

    /**
     * Find the first TdExpCapacitacion entity that matches the condition 'where idStatus is equals to'.
     *
     * @param idStatus java.lang.String
     * @return TdExpCapacitacion
     */
    @FindByCondition(value=TdExpCapacitacion.class, condition="ID_STATUS=?")
    TdExpCapacitacion getByIdStatus(java.lang.String idStatus);

    /**
     * Find all TdExpCapacitacion entities that matches the condition 'where idStatus is equals to'.
     *
     * @param idStatus java.lang.String
     * @return Collection of TdExpCapacitacion
     */
    @FindByCondition(value=TdExpCapacitacion.class, condition="ID_STATUS=?")
    List<TdExpCapacitacion> findByIdStatus(java.lang.String idStatus);

    /**
     * Find the first TdExpCapacitacion entity that matches the condition 'where usuario is equals to'.
     *
     * @param usuario java.lang.String
     * @return TdExpCapacitacion
     */
    @FindByCondition(value=TdExpCapacitacion.class, condition="USUARIO=?")
    TdExpCapacitacion getByUsuario(java.lang.String usuario);

    /**
     * Find all TdExpCapacitacion entities that matches the condition 'where usuario is equals to'.
     *
     * @param usuario java.lang.String
     * @return Collection of TdExpCapacitacion
     */
    @FindByCondition(value=TdExpCapacitacion.class, condition="USUARIO=?")
    List<TdExpCapacitacion> findByUsuario(java.lang.String usuario);

    /**
     * Find the first TdExpCapacitacion entity that matches the condition 'where capPromedio is equals to'.
     *
     * @param capPromedio java.lang.Float
     * @return TdExpCapacitacion
     */
    @FindByCondition(value=TdExpCapacitacion.class, condition="CAP_PROMEDIO=?")
    TdExpCapacitacion getByCapPromedio(java.lang.Float capPromedio);

    /**
     * Find all TdExpCapacitacion entities that matches the condition 'where capPromedio is equals to'.
     *
     * @param capPromedio java.lang.Float
     * @return Collection of TdExpCapacitacion
     */
    @FindByCondition(value=TdExpCapacitacion.class, condition="CAP_PROMEDIO=?")
    List<TdExpCapacitacion> findByCapPromedio(java.lang.Float capPromedio);
}