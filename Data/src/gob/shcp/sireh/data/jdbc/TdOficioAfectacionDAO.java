package gob.shcp.sireh.data.jdbc;

import gob.shcp.fsn.data.annotation.Delete;
import gob.shcp.fsn.data.annotation.FindAll;
import gob.shcp.fsn.data.annotation.FindByCondition;
import gob.shcp.fsn.data.annotation.FindById;
import gob.shcp.fsn.data.annotation.Save;
import gob.shcp.fsn.service.data.orm.JdbcDataService;

import java.util.List;

import gob.shcp.sireh.domain.jdbc.TdOficioAfectacion;


/**
 * Data access interface for TdOficioAfectacion.
 */
public interface TdOficioAfectacionDAO extends JdbcDataService {
    /**
     * Find TdOficioAfectacion entity by its identifier or primary key value.
     *
     * @param id identifier or primary key
     * @return TdOficioAfectacion
     */
    @FindById(TdOficioAfectacion.class)
    TdOficioAfectacion getById(gob.shcp.sireh.domain.jdbc.TdOficioAfectacionPK id);
    
    /**
     * Get all TdOficioAfectacion entities limited by a maximum number of elements.
     *
     * @return Collection of TdOficioAfectacion
     */
    @FindAll(TdOficioAfectacion.class)
    List<TdOficioAfectacion> findAll();
    
    /**
     * Make persistence of TdOficioAfectacion entities. If its identifier or primary key is null then create else update.
     *
     * @param entity TdOficioAfectacion
     */
    @Save
    void save(TdOficioAfectacion entity);
    
    /**
     * Remove TdOficioAfectacion entities.
     *
     * @param entity TdOficioAfectacion
     */
    @Delete
    void delete(TdOficioAfectacion entity);


    /**
     * Find the first TdOficioAfectacion entity that matches the condition 'where fecModifico is equals to'.
     *
     * @param fecModifico java.util.Date
     * @return TdOficioAfectacion
     */
    @FindByCondition(value=TdOficioAfectacion.class, condition="FEC_MODIFICO=?")
    TdOficioAfectacion getByFecModifico(java.util.Date fecModifico);

    /**
     * Find all TdOficioAfectacion entities that matches the condition 'where fecModifico is equals to'.
     *
     * @param fecModifico java.util.Date
     * @return Collection of TdOficioAfectacion
     */
    @FindByCondition(value=TdOficioAfectacion.class, condition="FEC_MODIFICO=?")
    List<TdOficioAfectacion> findByFecModifico(java.util.Date fecModifico);

    /**
     * Find the first TdOficioAfectacion entity that matches the condition 'where ofacAplicaOficio is equals to'.
     *
     * @param ofacAplicaOficio java.lang.String
     * @return TdOficioAfectacion
     */
    @FindByCondition(value=TdOficioAfectacion.class, condition="OFAC_APLICA_OFICIO=?")
    TdOficioAfectacion getByOfacAplicaOficio(java.lang.String ofacAplicaOficio);

    /**
     * Find all TdOficioAfectacion entities that matches the condition 'where ofacAplicaOficio is equals to'.
     *
     * @param ofacAplicaOficio java.lang.String
     * @return Collection of TdOficioAfectacion
     */
    @FindByCondition(value=TdOficioAfectacion.class, condition="OFAC_APLICA_OFICIO=?")
    List<TdOficioAfectacion> findByOfacAplicaOficio(java.lang.String ofacAplicaOficio);

    /**
     * Find the first TdOficioAfectacion entity that matches the condition 'where ofacFecAprobacion is equals to'.
     *
     * @param ofacFecAprobacion java.util.Date
     * @return TdOficioAfectacion
     */
    @FindByCondition(value=TdOficioAfectacion.class, condition="OFAC_FEC_APROBACION=?")
    TdOficioAfectacion getByOfacFecAprobacion(java.util.Date ofacFecAprobacion);

    /**
     * Find all TdOficioAfectacion entities that matches the condition 'where ofacFecAprobacion is equals to'.
     *
     * @param ofacFecAprobacion java.util.Date
     * @return Collection of TdOficioAfectacion
     */
    @FindByCondition(value=TdOficioAfectacion.class, condition="OFAC_FEC_APROBACION=?")
    List<TdOficioAfectacion> findByOfacFecAprobacion(java.util.Date ofacFecAprobacion);

    /**
     * Find the first TdOficioAfectacion entity that matches the condition 'where ofacFecModAprob is equals to'.
     *
     * @param ofacFecModAprob java.util.Date
     * @return TdOficioAfectacion
     */
    @FindByCondition(value=TdOficioAfectacion.class, condition="OFAC_FEC_MOD_APROB=?")
    TdOficioAfectacion getByOfacFecModAprob(java.util.Date ofacFecModAprob);

    /**
     * Find all TdOficioAfectacion entities that matches the condition 'where ofacFecModAprob is equals to'.
     *
     * @param ofacFecModAprob java.util.Date
     * @return Collection of TdOficioAfectacion
     */
    @FindByCondition(value=TdOficioAfectacion.class, condition="OFAC_FEC_MOD_APROB=?")
    List<TdOficioAfectacion> findByOfacFecModAprob(java.util.Date ofacFecModAprob);

    /**
     * Find the first TdOficioAfectacion entity that matches the condition 'where ofacFecOfic is equals to'.
     *
     * @param ofacFecOfic java.util.Date
     * @return TdOficioAfectacion
     */
    @FindByCondition(value=TdOficioAfectacion.class, condition="OFAC_FEC_OFIC=?")
    TdOficioAfectacion getByOfacFecOfic(java.util.Date ofacFecOfic);

    /**
     * Find all TdOficioAfectacion entities that matches the condition 'where ofacFecOfic is equals to'.
     *
     * @param ofacFecOfic java.util.Date
     * @return Collection of TdOficioAfectacion
     */
    @FindByCondition(value=TdOficioAfectacion.class, condition="OFAC_FEC_OFIC=?")
    List<TdOficioAfectacion> findByOfacFecOfic(java.util.Date ofacFecOfic);

    /**
     * Find the first TdOficioAfectacion entity that matches the condition 'where ofacLeyendaJustif is equals to'.
     *
     * @param ofacLeyendaJustif java.lang.String
     * @return TdOficioAfectacion
     */
    @FindByCondition(value=TdOficioAfectacion.class, condition="OFAC_LEYENDA_JUSTIF=?")
    TdOficioAfectacion getByOfacLeyendaJustif(java.lang.String ofacLeyendaJustif);

    /**
     * Find all TdOficioAfectacion entities that matches the condition 'where ofacLeyendaJustif is equals to'.
     *
     * @param ofacLeyendaJustif java.lang.String
     * @return Collection of TdOficioAfectacion
     */
    @FindByCondition(value=TdOficioAfectacion.class, condition="OFAC_LEYENDA_JUSTIF=?")
    List<TdOficioAfectacion> findByOfacLeyendaJustif(java.lang.String ofacLeyendaJustif);

    /**
     * Find the first TdOficioAfectacion entity that matches the condition 'where ofacNumAutoriza is equals to'.
     *
     * @param ofacNumAutoriza java.lang.String
     * @return TdOficioAfectacion
     */
    @FindByCondition(value=TdOficioAfectacion.class, condition="OFAC_NUM_AUTORIZA=?")
    TdOficioAfectacion getByOfacNumAutoriza(java.lang.String ofacNumAutoriza);

    /**
     * Find all TdOficioAfectacion entities that matches the condition 'where ofacNumAutoriza is equals to'.
     *
     * @param ofacNumAutoriza java.lang.String
     * @return Collection of TdOficioAfectacion
     */
    @FindByCondition(value=TdOficioAfectacion.class, condition="OFAC_NUM_AUTORIZA=?")
    List<TdOficioAfectacion> findByOfacNumAutoriza(java.lang.String ofacNumAutoriza);

    /**
     * Find the first TdOficioAfectacion entity that matches the condition 'where ofacProyRegulA is equals to'.
     *
     * @param ofacProyRegulA java.lang.String
     * @return TdOficioAfectacion
     */
    @FindByCondition(value=TdOficioAfectacion.class, condition="OFAC_PROY_REGUL_A=?")
    TdOficioAfectacion getByOfacProyRegulA(java.lang.String ofacProyRegulA);

    /**
     * Find all TdOficioAfectacion entities that matches the condition 'where ofacProyRegulA is equals to'.
     *
     * @param ofacProyRegulA java.lang.String
     * @return Collection of TdOficioAfectacion
     */
    @FindByCondition(value=TdOficioAfectacion.class, condition="OFAC_PROY_REGUL_A=?")
    List<TdOficioAfectacion> findByOfacProyRegulA(java.lang.String ofacProyRegulA);

    /**
     * Find the first TdOficioAfectacion entity that matches the condition 'where ofacProyRegulR is equals to'.
     *
     * @param ofacProyRegulR java.lang.String
     * @return TdOficioAfectacion
     */
    @FindByCondition(value=TdOficioAfectacion.class, condition="OFAC_PROY_REGUL_R=?")
    TdOficioAfectacion getByOfacProyRegulR(java.lang.String ofacProyRegulR);

    /**
     * Find all TdOficioAfectacion entities that matches the condition 'where ofacProyRegulR is equals to'.
     *
     * @param ofacProyRegulR java.lang.String
     * @return Collection of TdOficioAfectacion
     */
    @FindByCondition(value=TdOficioAfectacion.class, condition="OFAC_PROY_REGUL_R=?")
    List<TdOficioAfectacion> findByOfacProyRegulR(java.lang.String ofacProyRegulR);

    /**
     * Find the first TdOficioAfectacion entity that matches the condition 'where ofacTotalAmpliacion is equals to'.
     *
     * @param ofacTotalAmpliacion double
     * @return TdOficioAfectacion
     */
    @FindByCondition(value=TdOficioAfectacion.class, condition="OFAC_TOTAL_AMPLIACION=?")
    TdOficioAfectacion getByOfacTotalAmpliacion(double ofacTotalAmpliacion);

    /**
     * Find all TdOficioAfectacion entities that matches the condition 'where ofacTotalAmpliacion is equals to'.
     *
     * @param ofacTotalAmpliacion double
     * @return Collection of TdOficioAfectacion
     */
    @FindByCondition(value=TdOficioAfectacion.class, condition="OFAC_TOTAL_AMPLIACION=?")
    List<TdOficioAfectacion> findByOfacTotalAmpliacion(double ofacTotalAmpliacion);

    /**
     * Find the first TdOficioAfectacion entity that matches the condition 'where ofacTotalReduccion is equals to'.
     *
     * @param ofacTotalReduccion double
     * @return TdOficioAfectacion
     */
    @FindByCondition(value=TdOficioAfectacion.class, condition="OFAC_TOTAL_REDUCCION=?")
    TdOficioAfectacion getByOfacTotalReduccion(double ofacTotalReduccion);

    /**
     * Find all TdOficioAfectacion entities that matches the condition 'where ofacTotalReduccion is equals to'.
     *
     * @param ofacTotalReduccion double
     * @return Collection of TdOficioAfectacion
     */
    @FindByCondition(value=TdOficioAfectacion.class, condition="OFAC_TOTAL_REDUCCION=?")
    List<TdOficioAfectacion> findByOfacTotalReduccion(double ofacTotalReduccion);

    /**
     * Find the first TdOficioAfectacion entity that matches the condition 'where ofacTotalSecuencia is equals to'.
     *
     * @param ofacTotalSecuencia boolean
     * @return TdOficioAfectacion
     */
    @FindByCondition(value=TdOficioAfectacion.class, condition="OFAC_TOTAL_SECUENCIA=?")
    TdOficioAfectacion getByOfacTotalSecuencia(boolean ofacTotalSecuencia);

    /**
     * Find all TdOficioAfectacion entities that matches the condition 'where ofacTotalSecuencia is equals to'.
     *
     * @param ofacTotalSecuencia boolean
     * @return Collection of TdOficioAfectacion
     */
    @FindByCondition(value=TdOficioAfectacion.class, condition="OFAC_TOTAL_SECUENCIA=?")
    List<TdOficioAfectacion> findByOfacTotalSecuencia(boolean ofacTotalSecuencia);

    /**
     * Find the first TdOficioAfectacion entity that matches the condition 'where ofacTotalSecSiaff is equals to'.
     *
     * @param ofacTotalSecSiaff boolean
     * @return TdOficioAfectacion
     */
    @FindByCondition(value=TdOficioAfectacion.class, condition="OFAC_TOTAL_SEC_SIAFF=?")
    TdOficioAfectacion getByOfacTotalSecSiaff(boolean ofacTotalSecSiaff);

    /**
     * Find all TdOficioAfectacion entities that matches the condition 'where ofacTotalSecSiaff is equals to'.
     *
     * @param ofacTotalSecSiaff boolean
     * @return Collection of TdOficioAfectacion
     */
    @FindByCondition(value=TdOficioAfectacion.class, condition="OFAC_TOTAL_SEC_SIAFF=?")
    List<TdOficioAfectacion> findByOfacTotalSecSiaff(boolean ofacTotalSecSiaff);

    /**
     * Find the first TdOficioAfectacion entity that matches the condition 'where ofacUsrAprobacion is equals to'.
     *
     * @param ofacUsrAprobacion java.lang.String
     * @return TdOficioAfectacion
     */
    @FindByCondition(value=TdOficioAfectacion.class, condition="OFAC_USR_APROBACION=?")
    TdOficioAfectacion getByOfacUsrAprobacion(java.lang.String ofacUsrAprobacion);

    /**
     * Find all TdOficioAfectacion entities that matches the condition 'where ofacUsrAprobacion is equals to'.
     *
     * @param ofacUsrAprobacion java.lang.String
     * @return Collection of TdOficioAfectacion
     */
    @FindByCondition(value=TdOficioAfectacion.class, condition="OFAC_USR_APROBACION=?")
    List<TdOficioAfectacion> findByOfacUsrAprobacion(java.lang.String ofacUsrAprobacion);

    /**
     * Find the first TdOficioAfectacion entity that matches the condition 'where usuario is equals to'.
     *
     * @param usuario java.lang.String
     * @return TdOficioAfectacion
     */
    @FindByCondition(value=TdOficioAfectacion.class, condition="USUARIO=?")
    TdOficioAfectacion getByUsuario(java.lang.String usuario);

    /**
     * Find all TdOficioAfectacion entities that matches the condition 'where usuario is equals to'.
     *
     * @param usuario java.lang.String
     * @return Collection of TdOficioAfectacion
     */
    @FindByCondition(value=TdOficioAfectacion.class, condition="USUARIO=?")
    List<TdOficioAfectacion> findByUsuario(java.lang.String usuario);
}