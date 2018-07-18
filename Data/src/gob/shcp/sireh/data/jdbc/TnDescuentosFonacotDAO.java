package gob.shcp.sireh.data.jdbc;

import gob.shcp.fsn.data.annotation.Delete;
import gob.shcp.fsn.data.annotation.FindAll;
import gob.shcp.fsn.data.annotation.FindByCondition;
import gob.shcp.fsn.data.annotation.FindById;
import gob.shcp.fsn.data.annotation.Save;
import gob.shcp.fsn.service.data.orm.JdbcDataService;

import java.util.List;

import gob.shcp.sireh.domain.jdbc.TnDescuentosFonacot;


/**
 * Data access interface for TnDescuentosFonacot.
 */
public interface TnDescuentosFonacotDAO extends JdbcDataService {
    /** 
     * Find TnDescuentosFonacot entity by its identifier or primary key value.
     *
     * @param id identifier or primary key
     * @return TnDescuentosFonacot
     */
    @FindById(TnDescuentosFonacot.class)
    TnDescuentosFonacot getById(java.lang.Integer id);
    
    /**
     * Get all TnDescuentosFonacot entities limited by a maximum number of elements.
     *
     * @return Collection of TnDescuentosFonacot
     */
    @FindAll(TnDescuentosFonacot.class)
    List<TnDescuentosFonacot> findAll();
    
    /**
     * Make persistence of TnDescuentosFonacot entities. If its identifier or primary key is null then create else update.
     *
     * @param entity TnDescuentosFonacot
     */
    @Save
    void save(TnDescuentosFonacot entity);
    
    /**
     * Remove TnDescuentosFonacot entities.
     *
     * @param entity TnDescuentosFonacot
     */
    @Delete
    void delete(TnDescuentosFonacot entity);


    /**
     * Find the first TnDescuentosFonacot entity that matches the condition 'where fonacotCiclo is equals to'.
     *
     * @param fonacotCiclo int
     * @return TnDescuentosFonacot
     */
    @FindByCondition(value=TnDescuentosFonacot.class, condition="FONACOT_CICLO=?")
    TnDescuentosFonacot getByFonacotCiclo(int fonacotCiclo);

    /**
     * Find all TnDescuentosFonacot entities that matches the condition 'where fonacotCiclo is equals to'.
     *
     * @param fonacotCiclo int
     * @return Collection of TnDescuentosFonacot
     */
    @FindByCondition(value=TnDescuentosFonacot.class, condition="FONACOT_CICLO=?")
    List<TnDescuentosFonacot> findByFonacotCiclo(int fonacotCiclo);

    /**
     * Find the first TnDescuentosFonacot entity that matches the condition 'where fonacotMes is equals to'.
     *
     * @param fonacotMes int
     * @return TnDescuentosFonacot
     */
    @FindByCondition(value=TnDescuentosFonacot.class, condition="FONACOT_MES=?")
    TnDescuentosFonacot getByFonacotMes(int fonacotMes);

    /**
     * Find all TnDescuentosFonacot entities that matches the condition 'where fonacotMes is equals to'.
     *
     * @param fonacotMes int
     * @return Collection of TnDescuentosFonacot
     */
    @FindByCondition(value=TnDescuentosFonacot.class, condition="FONACOT_MES=?")
    List<TnDescuentosFonacot> findByFonacotMes(int fonacotMes);

    /**
     * Find the first TnDescuentosFonacot entity that matches the condition 'where fonacotClave is equals to'.
     *
     * @param fonacotClave java.lang.String
     * @return TnDescuentosFonacot
     */
    @FindByCondition(value=TnDescuentosFonacot.class, condition="FONACOT_CLAVE=?")
    TnDescuentosFonacot getByFonacotClave(java.lang.String fonacotClave);

    /**
     * Find all TnDescuentosFonacot entities that matches the condition 'where fonacotClave is equals to'.
     *
     * @param fonacotClave java.lang.String
     * @return Collection of TnDescuentosFonacot
     */
    @FindByCondition(value=TnDescuentosFonacot.class, condition="FONACOT_CLAVE=?")
    List<TnDescuentosFonacot> findByFonacotClave(java.lang.String fonacotClave);

    /**
     * Find the first TnDescuentosFonacot entity that matches the condition 'where fonacotCredito is equals to'.
     *
     * @param fonacotCredito java.lang.Long
     * @return TnDescuentosFonacot
     */
    @FindByCondition(value=TnDescuentosFonacot.class, condition="FONACOT_CREDITO=?")
    TnDescuentosFonacot getByFonacotCredito(java.lang.Long fonacotCredito);

    /**
     * Find all TnDescuentosFonacot entities that matches the condition 'where fonacotCredito is equals to'.
     *
     * @param fonacotCredito java.lang.Long
     * @return Collection of TnDescuentosFonacot
     */
    @FindByCondition(value=TnDescuentosFonacot.class, condition="FONACOT_CREDITO=?")
    List<TnDescuentosFonacot> findByFonacotCredito(java.lang.Long fonacotCredito);

    /**
     * Find the first TnDescuentosFonacot entity that matches the condition 'where fonacotFin is equals to'.
     *
     * @param fonacotFin java.lang.String
     * @return TnDescuentosFonacot
     */
    @FindByCondition(value=TnDescuentosFonacot.class, condition="FONACOT_FIN=?")
    TnDescuentosFonacot getByFonacotFin(java.lang.String fonacotFin);

    /**
     * Find all TnDescuentosFonacot entities that matches the condition 'where fonacotFin is equals to'.
     *
     * @param fonacotFin java.lang.String
     * @return Collection of TnDescuentosFonacot
     */
    @FindByCondition(value=TnDescuentosFonacot.class, condition="FONACOT_FIN=?")
    List<TnDescuentosFonacot> findByFonacotFin(java.lang.String fonacotFin);

    /**
     * Find the first TnDescuentosFonacot entity that matches the condition 'where fonacotIncidencia is equals to'.
     *
     * @param fonacotIncidencia java.lang.Boolean
     * @return TnDescuentosFonacot
     */
    @FindByCondition(value=TnDescuentosFonacot.class, condition="FONACOT_INCIDENCIA=?")
    TnDescuentosFonacot getByFonacotIncidencia(java.lang.Boolean fonacotIncidencia);

    /**
     * Find all TnDescuentosFonacot entities that matches the condition 'where fonacotIncidencia is equals to'.
     *
     * @param fonacotIncidencia java.lang.Boolean
     * @return Collection of TnDescuentosFonacot
     */
    @FindByCondition(value=TnDescuentosFonacot.class, condition="FONACOT_INCIDENCIA=?")
    List<TnDescuentosFonacot> findByFonacotIncidencia(java.lang.Boolean fonacotIncidencia);

    /**
     * Find the first TnDescuentosFonacot entity that matches the condition 'where fonacotIniBaja is equals to'.
     *
     * @param fonacotIniBaja java.lang.String
     * @return TnDescuentosFonacot
     */
    @FindByCondition(value=TnDescuentosFonacot.class, condition="FONACOT_INI_BAJA=?")
    TnDescuentosFonacot getByFonacotIniBaja(java.lang.String fonacotIniBaja);

    /**
     * Find all TnDescuentosFonacot entities that matches the condition 'where fonacotIniBaja is equals to'.
     *
     * @param fonacotIniBaja java.lang.String
     * @return Collection of TnDescuentosFonacot
     */
    @FindByCondition(value=TnDescuentosFonacot.class, condition="FONACOT_INI_BAJA=?")
    List<TnDescuentosFonacot> findByFonacotIniBaja(java.lang.String fonacotIniBaja);

    /**
     * Find the first TnDescuentosFonacot entity that matches the condition 'where fonacotMeses is equals to'.
     *
     * @param fonacotMeses java.lang.Integer
     * @return TnDescuentosFonacot
     */
    @FindByCondition(value=TnDescuentosFonacot.class, condition="FONACOT_MESES=?")
    TnDescuentosFonacot getByFonacotMeses(java.lang.Integer fonacotMeses);

    /**
     * Find all TnDescuentosFonacot entities that matches the condition 'where fonacotMeses is equals to'.
     *
     * @param fonacotMeses java.lang.Integer
     * @return Collection of TnDescuentosFonacot
     */
    @FindByCondition(value=TnDescuentosFonacot.class, condition="FONACOT_MESES=?")
    List<TnDescuentosFonacot> findByFonacotMeses(java.lang.Integer fonacotMeses);

    /**
     * Find the first TnDescuentosFonacot entity that matches the condition 'where fonacotNombre is equals to'.
     *
     * @param fonacotNombre java.lang.String
     * @return TnDescuentosFonacot
     */
    @FindByCondition(value=TnDescuentosFonacot.class, condition="FONACOT_NOMBRE=?")
    TnDescuentosFonacot getByFonacotNombre(java.lang.String fonacotNombre);

    /**
     * Find all TnDescuentosFonacot entities that matches the condition 'where fonacotNombre is equals to'.
     *
     * @param fonacotNombre java.lang.String
     * @return Collection of TnDescuentosFonacot
     */
    @FindByCondition(value=TnDescuentosFonacot.class, condition="FONACOT_NOMBRE=?")
    List<TnDescuentosFonacot> findByFonacotNombre(java.lang.String fonacotNombre);

    /**
     * Find the first TnDescuentosFonacot entity that matches the condition 'where fonacotNumero is equals to'.
     *
     * @param fonacotNumero java.lang.Long
     * @return TnDescuentosFonacot
     */
    @FindByCondition(value=TnDescuentosFonacot.class, condition="FONACOT_NUMERO=?")
    TnDescuentosFonacot getByFonacotNumero(java.lang.Long fonacotNumero);

    /**
     * Find all TnDescuentosFonacot entities that matches the condition 'where fonacotNumero is equals to'.
     *
     * @param fonacotNumero java.lang.Long
     * @return Collection of TnDescuentosFonacot
     */
    @FindByCondition(value=TnDescuentosFonacot.class, condition="FONACOT_NUMERO=?")
    List<TnDescuentosFonacot> findByFonacotNumero(java.lang.Long fonacotNumero);

    /**
     * Find the first TnDescuentosFonacot entity that matches the condition 'where fonacotPagoQnaNon is equals to'.
     *
     * @param fonacotPagoQnaNon java.lang.Double
     * @return TnDescuentosFonacot
     */
    @FindByCondition(value=TnDescuentosFonacot.class, condition="FONACOT_PAGO_QNA_NON=?")
    TnDescuentosFonacot getByFonacotPagoQnaNon(java.lang.Double fonacotPagoQnaNon);

    /**
     * Find all TnDescuentosFonacot entities that matches the condition 'where fonacotPagoQnaNon is equals to'.
     *
     * @param fonacotPagoQnaNon java.lang.Double
     * @return Collection of TnDescuentosFonacot
     */
    @FindByCondition(value=TnDescuentosFonacot.class, condition="FONACOT_PAGO_QNA_NON=?")
    List<TnDescuentosFonacot> findByFonacotPagoQnaNon(java.lang.Double fonacotPagoQnaNon);

    /**
     * Find the first TnDescuentosFonacot entity that matches the condition 'where fonacotPagoQnaPar is equals to'.
     *
     * @param fonacotPagoQnaPar java.lang.Double
     * @return TnDescuentosFonacot
     */
    @FindByCondition(value=TnDescuentosFonacot.class, condition="FONACOT_PAGO_QNA_PAR=?")
    TnDescuentosFonacot getByFonacotPagoQnaPar(java.lang.Double fonacotPagoQnaPar);

    /**
     * Find all TnDescuentosFonacot entities that matches the condition 'where fonacotPagoQnaPar is equals to'.
     *
     * @param fonacotPagoQnaPar java.lang.Double
     * @return Collection of TnDescuentosFonacot
     */
    @FindByCondition(value=TnDescuentosFonacot.class, condition="FONACOT_PAGO_QNA_PAR=?")
    List<TnDescuentosFonacot> findByFonacotPagoQnaPar(java.lang.Double fonacotPagoQnaPar);

    /**
     * Find the first TnDescuentosFonacot entity that matches the condition 'where fonacotPlazo is equals to'.
     *
     * @param fonacotPlazo java.lang.Integer
     * @return TnDescuentosFonacot
     */
    @FindByCondition(value=TnDescuentosFonacot.class, condition="FONACOT_PLAZO=?")
    TnDescuentosFonacot getByFonacotPlazo(java.lang.Integer fonacotPlazo);

    /**
     * Find all TnDescuentosFonacot entities that matches the condition 'where fonacotPlazo is equals to'.
     *
     * @param fonacotPlazo java.lang.Integer
     * @return Collection of TnDescuentosFonacot
     */
    @FindByCondition(value=TnDescuentosFonacot.class, condition="FONACOT_PLAZO=?")
    List<TnDescuentosFonacot> findByFonacotPlazo(java.lang.Integer fonacotPlazo);

    /**
     * Find the first TnDescuentosFonacot entity that matches the condition 'where fonacotRetMensual is equals to'.
     *
     * @param fonacotRetMensual java.lang.Double
     * @return TnDescuentosFonacot
     */
    @FindByCondition(value=TnDescuentosFonacot.class, condition="FONACOT_RET_MENSUAL=?")
    TnDescuentosFonacot getByFonacotRetMensual(java.lang.Double fonacotRetMensual);

    /**
     * Find all TnDescuentosFonacot entities that matches the condition 'where fonacotRetMensual is equals to'.
     *
     * @param fonacotRetMensual java.lang.Double
     * @return Collection of TnDescuentosFonacot
     */
    @FindByCondition(value=TnDescuentosFonacot.class, condition="FONACOT_RET_MENSUAL=?")
    List<TnDescuentosFonacot> findByFonacotRetMensual(java.lang.Double fonacotRetMensual);

    /**
     * Find the first TnDescuentosFonacot entity that matches the condition 'where fonacotRetQnaNon is equals to'.
     *
     * @param fonacotRetQnaNon java.lang.Double
     * @return TnDescuentosFonacot
     */
    @FindByCondition(value=TnDescuentosFonacot.class, condition="FONACOT_RET_QNA_NON=?")
    TnDescuentosFonacot getByFonacotRetQnaNon(java.lang.Double fonacotRetQnaNon);

    /**
     * Find all TnDescuentosFonacot entities that matches the condition 'where fonacotRetQnaNon is equals to'.
     *
     * @param fonacotRetQnaNon java.lang.Double
     * @return Collection of TnDescuentosFonacot
     */
    @FindByCondition(value=TnDescuentosFonacot.class, condition="FONACOT_RET_QNA_NON=?")
    List<TnDescuentosFonacot> findByFonacotRetQnaNon(java.lang.Double fonacotRetQnaNon);

    /**
     * Find the first TnDescuentosFonacot entity that matches the condition 'where fonacotRetQnaPar is equals to'.
     *
     * @param fonacotRetQnaPar java.lang.Double
     * @return TnDescuentosFonacot
     */
    @FindByCondition(value=TnDescuentosFonacot.class, condition="FONACOT_RET_QNA_PAR=?")
    TnDescuentosFonacot getByFonacotRetQnaPar(java.lang.Double fonacotRetQnaPar);

    /**
     * Find all TnDescuentosFonacot entities that matches the condition 'where fonacotRetQnaPar is equals to'.
     *
     * @param fonacotRetQnaPar java.lang.Double
     * @return Collection of TnDescuentosFonacot
     */
    @FindByCondition(value=TnDescuentosFonacot.class, condition="FONACOT_RET_QNA_PAR=?")
    List<TnDescuentosFonacot> findByFonacotRetQnaPar(java.lang.Double fonacotRetQnaPar);

    /**
     * Find the first TnDescuentosFonacot entity that matches the condition 'where fonacotRetReal is equals to'.
     *
     * @param fonacotRetReal java.lang.Double
     * @return TnDescuentosFonacot
     */
    @FindByCondition(value=TnDescuentosFonacot.class, condition="FONACOT_RET_REAL=?")
    TnDescuentosFonacot getByFonacotRetReal(java.lang.Double fonacotRetReal);

    /**
     * Find all TnDescuentosFonacot entities that matches the condition 'where fonacotRetReal is equals to'.
     *
     * @param fonacotRetReal java.lang.Double
     * @return Collection of TnDescuentosFonacot
     */
    @FindByCondition(value=TnDescuentosFonacot.class, condition="FONACOT_RET_REAL=?")
    List<TnDescuentosFonacot> findByFonacotRetReal(java.lang.Double fonacotRetReal);

    /**
     * Find the first TnDescuentosFonacot entity that matches the condition 'where fonacotReubicado is equals to'.
     *
     * @param fonacotReubicado java.lang.String
     * @return TnDescuentosFonacot
     */
    @FindByCondition(value=TnDescuentosFonacot.class, condition="FONACOT_REUBICADO=?")
    TnDescuentosFonacot getByFonacotReubicado(java.lang.String fonacotReubicado);

    /**
     * Find all TnDescuentosFonacot entities that matches the condition 'where fonacotReubicado is equals to'.
     *
     * @param fonacotReubicado java.lang.String
     * @return Collection of TnDescuentosFonacot
     */
    @FindByCondition(value=TnDescuentosFonacot.class, condition="FONACOT_REUBICADO=?")
    List<TnDescuentosFonacot> findByFonacotReubicado(java.lang.String fonacotReubicado);

    /**
     * Find the first TnDescuentosFonacot entity that matches the condition 'where fonacotRfc is equals to'.
     *
     * @param fonacotRfc java.lang.String
     * @return TnDescuentosFonacot
     */
    @FindByCondition(value=TnDescuentosFonacot.class, condition="FONACOT_RFC=?")
    TnDescuentosFonacot getByFonacotRfc(java.lang.String fonacotRfc);

    /**
     * Find all TnDescuentosFonacot entities that matches the condition 'where fonacotRfc is equals to'.
     *
     * @param fonacotRfc java.lang.String
     * @return Collection of TnDescuentosFonacot
     */
    @FindByCondition(value=TnDescuentosFonacot.class, condition="FONACOT_RFC=?")
    List<TnDescuentosFonacot> findByFonacotRfc(java.lang.String fonacotRfc);
}