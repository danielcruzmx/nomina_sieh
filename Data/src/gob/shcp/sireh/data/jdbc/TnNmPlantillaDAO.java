package gob.shcp.sireh.data.jdbc;

import gob.shcp.fsn.data.annotation.Delete;
import gob.shcp.fsn.data.annotation.FindAll;
import gob.shcp.fsn.data.annotation.FindByCondition;
import gob.shcp.fsn.data.annotation.FindById;
import gob.shcp.fsn.data.annotation.Save;
import gob.shcp.fsn.service.data.orm.JdbcDataService;

import java.util.List;

import gob.shcp.sireh.domain.jdbc.TnNmPlantilla;


/**
 * Data access interface for TnNmPlantilla.
 */
public interface TnNmPlantillaDAO extends JdbcDataService {
    /**
     * Find TnNmPlantilla entity by its identifier or primary key value.
     *
     * @param id identifier or primary key
     * @return TnNmPlantilla
     */
    @FindById(TnNmPlantilla.class)
    TnNmPlantilla getById(java.lang.String id);
    
    /**
     * Get all TnNmPlantilla entities limited by a maximum number of elements.
     *
     * @return Collection of TnNmPlantilla
     */
    @FindAll(TnNmPlantilla.class)
    List<TnNmPlantilla> findAll();
    
    /**
     * Make persistence of TnNmPlantilla entities. If its identifier or primary key is null then create else update.
     *
     * @param entity TnNmPlantilla
     */
    @Save
    void save(TnNmPlantilla entity);
    
    /**
     * Remove TnNmPlantilla entities.
     *
     * @param entity TnNmPlantilla
     */
    @Delete
    void delete(TnNmPlantilla entity);


    /**
     * Find the first TnNmPlantilla entity that matches the condition 'where tnNmpCurso is equals to'.
     *
     * @param tnNmpCurso java.lang.String
     * @return TnNmPlantilla
     */
    @FindByCondition(value=TnNmPlantilla.class, condition="TN_NMP_CURSO=?")
    TnNmPlantilla getByTnNmpCurso(java.lang.String tnNmpCurso);

    /**
     * Find all TnNmPlantilla entities that matches the condition 'where tnNmpCurso is equals to'.
     *
     * @param tnNmpCurso java.lang.String
     * @return Collection of TnNmPlantilla
     */
    @FindByCondition(value=TnNmPlantilla.class, condition="TN_NMP_CURSO=?")
    List<TnNmPlantilla> findByTnNmpCurso(java.lang.String tnNmpCurso);

    /**
     * Find the first TnNmPlantilla entity that matches the condition 'where tnNmpDenominacion is equals to'.
     *
     * @param tnNmpDenominacion java.lang.String
     * @return TnNmPlantilla
     */
    @FindByCondition(value=TnNmPlantilla.class, condition="TN_NMP_DENOMINACION=?")
    TnNmPlantilla getByTnNmpDenominacion(java.lang.String tnNmpDenominacion);

    /**
     * Find all TnNmPlantilla entities that matches the condition 'where tnNmpDenominacion is equals to'.
     *
     * @param tnNmpDenominacion java.lang.String
     * @return Collection of TnNmPlantilla
     */
    @FindByCondition(value=TnNmPlantilla.class, condition="TN_NMP_DENOMINACION=?")
    List<TnNmPlantilla> findByTnNmpDenominacion(java.lang.String tnNmpDenominacion);

    /**
     * Find the first TnNmPlantilla entity that matches the condition 'where tnNmpDuracion is equals to'.
     *
     * @param tnNmpDuracion java.lang.Integer
     * @return TnNmPlantilla
     */
    @FindByCondition(value=TnNmPlantilla.class, condition="TN_NMP_DURACION=?")
    TnNmPlantilla getByTnNmpDuracion(java.lang.Integer tnNmpDuracion);

    /**
     * Find all TnNmPlantilla entities that matches the condition 'where tnNmpDuracion is equals to'.
     *
     * @param tnNmpDuracion java.lang.Integer
     * @return Collection of TnNmPlantilla
     */
    @FindByCondition(value=TnNmPlantilla.class, condition="TN_NMP_DURACION=?")
    List<TnNmPlantilla> findByTnNmpDuracion(java.lang.Integer tnNmpDuracion);

    /**
     * Find the first TnNmPlantilla entity that matches the condition 'where tnNmpEstatus is equals to'.
     *
     * @param tnNmpEstatus java.lang.String
     * @return TnNmPlantilla
     */
    @FindByCondition(value=TnNmPlantilla.class, condition="TN_NMP_ESTATUS=?")
    TnNmPlantilla getByTnNmpEstatus(java.lang.String tnNmpEstatus);

    /**
     * Find all TnNmPlantilla entities that matches the condition 'where tnNmpEstatus is equals to'.
     *
     * @param tnNmpEstatus java.lang.String
     * @return Collection of TnNmPlantilla
     */
    @FindByCondition(value=TnNmPlantilla.class, condition="TN_NMP_ESTATUS=?")
    List<TnNmPlantilla> findByTnNmpEstatus(java.lang.String tnNmpEstatus);

    /**
     * Find the first TnNmPlantilla entity that matches the condition 'where tnNmpFechaCarga is equals to'.
     *
     * @param tnNmpFechaCarga java.util.Date
     * @return TnNmPlantilla
     */
    @FindByCondition(value=TnNmPlantilla.class, condition="TN_NMP_FECHA_CARGA=?")
    TnNmPlantilla getByTnNmpFechaCarga(java.util.Date tnNmpFechaCarga);

    /**
     * Find all TnNmPlantilla entities that matches the condition 'where tnNmpFechaCarga is equals to'.
     *
     * @param tnNmpFechaCarga java.util.Date
     * @return Collection of TnNmPlantilla
     */
    @FindByCondition(value=TnNmPlantilla.class, condition="TN_NMP_FECHA_CARGA=?")
    List<TnNmPlantilla> findByTnNmpFechaCarga(java.util.Date tnNmpFechaCarga);

    /**
     * Find the first TnNmPlantilla entity that matches the condition 'where tnNmpGenero is equals to'.
     *
     * @param tnNmpGenero java.lang.String
     * @return TnNmPlantilla
     */
    @FindByCondition(value=TnNmPlantilla.class, condition="TN_NMP_GENERO=?")
    TnNmPlantilla getByTnNmpGenero(java.lang.String tnNmpGenero);

    /**
     * Find all TnNmPlantilla entities that matches the condition 'where tnNmpGenero is equals to'.
     *
     * @param tnNmpGenero java.lang.String
     * @return Collection of TnNmPlantilla
     */
    @FindByCondition(value=TnNmPlantilla.class, condition="TN_NMP_GENERO=?")
    List<TnNmPlantilla> findByTnNmpGenero(java.lang.String tnNmpGenero);

    /**
     * Find the first TnNmPlantilla entity that matches the condition 'where tnNmpInicio is equals to'.
     *
     * @param tnNmpInicio java.util.Date
     * @return TnNmPlantilla
     */
    @FindByCondition(value=TnNmPlantilla.class, condition="TN_NMP_INICIO=?")
    TnNmPlantilla getByTnNmpInicio(java.util.Date tnNmpInicio);

    /**
     * Find all TnNmPlantilla entities that matches the condition 'where tnNmpInicio is equals to'.
     *
     * @param tnNmpInicio java.util.Date
     * @return Collection of TnNmPlantilla
     */
    @FindByCondition(value=TnNmPlantilla.class, condition="TN_NMP_INICIO=?")
    List<TnNmPlantilla> findByTnNmpInicio(java.util.Date tnNmpInicio);

    /**
     * Find the first TnNmPlantilla entity that matches the condition 'where tnNmpMes is equals to'.
     *
     * @param tnNmpMes java.lang.String
     * @return TnNmPlantilla
     */
    @FindByCondition(value=TnNmPlantilla.class, condition="TN_NMP_MES=?")
    TnNmPlantilla getByTnNmpMes(java.lang.String tnNmpMes);

    /**
     * Find all TnNmPlantilla entities that matches the condition 'where tnNmpMes is equals to'.
     *
     * @param tnNmpMes java.lang.String
     * @return Collection of TnNmPlantilla
     */
    @FindByCondition(value=TnNmPlantilla.class, condition="TN_NMP_MES=?")
    List<TnNmPlantilla> findByTnNmpMes(java.lang.String tnNmpMes);

    /**
     * Find the first TnNmPlantilla entity that matches the condition 'where tnNmpNivel is equals to'.
     *
     * @param tnNmpNivel java.lang.String
     * @return TnNmPlantilla
     */
    @FindByCondition(value=TnNmPlantilla.class, condition="TN_NMP_NIVEL=?")
    TnNmPlantilla getByTnNmpNivel(java.lang.String tnNmpNivel);

    /**
     * Find all TnNmPlantilla entities that matches the condition 'where tnNmpNivel is equals to'.
     *
     * @param tnNmpNivel java.lang.String
     * @return Collection of TnNmPlantilla
     */
    @FindByCondition(value=TnNmPlantilla.class, condition="TN_NMP_NIVEL=?")
    List<TnNmPlantilla> findByTnNmpNivel(java.lang.String tnNmpNivel);

    /**
     * Find the first TnNmPlantilla entity that matches the condition 'where tnNmpNombre is equals to'.
     *
     * @param tnNmpNombre java.lang.String
     * @return TnNmPlantilla
     */
    @FindByCondition(value=TnNmPlantilla.class, condition="TN_NMP_NOMBRE=?")
    TnNmPlantilla getByTnNmpNombre(java.lang.String tnNmpNombre);

    /**
     * Find all TnNmPlantilla entities that matches the condition 'where tnNmpNombre is equals to'.
     *
     * @param tnNmpNombre java.lang.String
     * @return Collection of TnNmPlantilla
     */
    @FindByCondition(value=TnNmPlantilla.class, condition="TN_NMP_NOMBRE=?")
    List<TnNmPlantilla> findByTnNmpNombre(java.lang.String tnNmpNombre);

    /**
     * Find the first TnNmPlantilla entity that matches the condition 'where tnNmpPlaza is equals to'.
     *
     * @param tnNmpPlaza java.lang.Integer
     * @return TnNmPlantilla
     */
    @FindByCondition(value=TnNmPlantilla.class, condition="TN_NMP_PLAZA=?")
    TnNmPlantilla getByTnNmpPlaza(java.lang.Integer tnNmpPlaza);

    /**
     * Find all TnNmPlantilla entities that matches the condition 'where tnNmpPlaza is equals to'.
     *
     * @param tnNmpPlaza java.lang.Integer
     * @return Collection of TnNmPlantilla
     */
    @FindByCondition(value=TnNmPlantilla.class, condition="TN_NMP_PLAZA=?")
    List<TnNmPlantilla> findByTnNmpPlaza(java.lang.Integer tnNmpPlaza);

    /**
     * Find the first TnNmPlantilla entity that matches the condition 'where tnNmpPuesto is equals to'.
     *
     * @param tnNmpPuesto java.lang.String
     * @return TnNmPlantilla
     */
    @FindByCondition(value=TnNmPlantilla.class, condition="TN_NMP_PUESTO=?")
    TnNmPlantilla getByTnNmpPuesto(java.lang.String tnNmpPuesto);

    /**
     * Find all TnNmPlantilla entities that matches the condition 'where tnNmpPuesto is equals to'.
     *
     * @param tnNmpPuesto java.lang.String
     * @return Collection of TnNmPlantilla
     */
    @FindByCondition(value=TnNmPlantilla.class, condition="TN_NMP_PUESTO=?")
    List<TnNmPlantilla> findByTnNmpPuesto(java.lang.String tnNmpPuesto);

    /**
     * Find the first TnNmPlantilla entity that matches the condition 'where tnNmpRfc is equals to'.
     *
     * @param tnNmpRfc java.lang.String
     * @return TnNmPlantilla
     */
    @FindByCondition(value=TnNmPlantilla.class, condition="TN_NMP_RFC=?")
    TnNmPlantilla getByTnNmpRfc(java.lang.String tnNmpRfc);

    /**
     * Find all TnNmPlantilla entities that matches the condition 'where tnNmpRfc is equals to'.
     *
     * @param tnNmpRfc java.lang.String
     * @return Collection of TnNmPlantilla
     */
    @FindByCondition(value=TnNmPlantilla.class, condition="TN_NMP_RFC=?")
    List<TnNmPlantilla> findByTnNmpRfc(java.lang.String tnNmpRfc);

    /**
     * Find the first TnNmPlantilla entity that matches the condition 'where tnNmpTermino is equals to'.
     *
     * @param tnNmpTermino java.util.Date
     * @return TnNmPlantilla
     */
    @FindByCondition(value=TnNmPlantilla.class, condition="TN_NMP_TERMINO=?")
    TnNmPlantilla getByTnNmpTermino(java.util.Date tnNmpTermino);

    /**
     * Find all TnNmPlantilla entities that matches the condition 'where tnNmpTermino is equals to'.
     *
     * @param tnNmpTermino java.util.Date
     * @return Collection of TnNmPlantilla
     */
    @FindByCondition(value=TnNmPlantilla.class, condition="TN_NMP_TERMINO=?")
    List<TnNmPlantilla> findByTnNmpTermino(java.util.Date tnNmpTermino);

    /**
     * Find the first TnNmPlantilla entity that matches the condition 'where tnNmpTipoCarga is equals to'.
     *
     * @param tnNmpTipoCarga java.lang.String
     * @return TnNmPlantilla
     */
    @FindByCondition(value=TnNmPlantilla.class, condition="TN_NMP_TIPO_CARGA=?")
    TnNmPlantilla getByTnNmpTipoCarga(java.lang.String tnNmpTipoCarga);

    /**
     * Find all TnNmPlantilla entities that matches the condition 'where tnNmpTipoCarga is equals to'.
     *
     * @param tnNmpTipoCarga java.lang.String
     * @return Collection of TnNmPlantilla
     */
    @FindByCondition(value=TnNmPlantilla.class, condition="TN_NMP_TIPO_CARGA=?")
    List<TnNmPlantilla> findByTnNmpTipoCarga(java.lang.String tnNmpTipoCarga);

    /**
     * Find the first TnNmPlantilla entity that matches the condition 'where tnNmpTipoPuesto is equals to'.
     *
     * @param tnNmpTipoPuesto java.lang.String
     * @return TnNmPlantilla
     */
    @FindByCondition(value=TnNmPlantilla.class, condition="TN_NMP_TIPO_PUESTO=?")
    TnNmPlantilla getByTnNmpTipoPuesto(java.lang.String tnNmpTipoPuesto);

    /**
     * Find all TnNmPlantilla entities that matches the condition 'where tnNmpTipoPuesto is equals to'.
     *
     * @param tnNmpTipoPuesto java.lang.String
     * @return Collection of TnNmPlantilla
     */
    @FindByCondition(value=TnNmPlantilla.class, condition="TN_NMP_TIPO_PUESTO=?")
    List<TnNmPlantilla> findByTnNmpTipoPuesto(java.lang.String tnNmpTipoPuesto);

    /**
     * Find the first TnNmPlantilla entity that matches the condition 'where tnNmpUnidad is equals to'.
     *
     * @param tnNmpUnidad java.lang.String
     * @return TnNmPlantilla
     */
    @FindByCondition(value=TnNmPlantilla.class, condition="TN_NMP_UNIDAD=?")
    TnNmPlantilla getByTnNmpUnidad(java.lang.String tnNmpUnidad);

    /**
     * Find all TnNmPlantilla entities that matches the condition 'where tnNmpUnidad is equals to'.
     *
     * @param tnNmpUnidad java.lang.String
     * @return Collection of TnNmPlantilla
     */
    @FindByCondition(value=TnNmPlantilla.class, condition="TN_NMP_UNIDAD=?")
    List<TnNmPlantilla> findByTnNmpUnidad(java.lang.String tnNmpUnidad);
}