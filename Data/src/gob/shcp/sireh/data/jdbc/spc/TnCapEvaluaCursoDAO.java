package gob.shcp.sireh.data.jdbc.spc;

import gob.shcp.fsn.data.annotation.Delete;
import gob.shcp.fsn.data.annotation.FindAll;
import gob.shcp.fsn.data.annotation.FindByCondition;
import gob.shcp.fsn.data.annotation.FindById;
import gob.shcp.fsn.data.annotation.Save;
import gob.shcp.fsn.service.data.orm.JdbcDataService;

import java.util.List;

import gob.shcp.sireh.domain.jdbc.spc.TnCapEvaluaCurso;

/**
 * Data access interface for TnCapEvaluacionCurso.
 */
public interface TnCapEvaluaCursoDAO extends JdbcDataService {
    /**
     * Find TnCapEvaluacionCurso entity by its identifier or primary key value.
     *
     * @param id identifier or primary key
     * @return TnCapEvaluacionCurso
     */
    @FindById(TnCapEvaluaCurso.class)
    TnCapEvaluaCurso getById(java.lang.Integer id);

    /**
     * Get all TnCapEvaluacionCurso entities limited by a maximum number of elements.
     *
     * @return Collection of TnCapEvaluacionCurso
     */
    @FindAll(TnCapEvaluaCurso.class)
    List<TnCapEvaluaCurso> findAll();

    /**
     * Make persistence of TnCapEvaluacionCurso entities. If its identifier or primary key is null then create else update.
     *
     * @param entity TnCapEvaluacionCurso
     */
    @Save
    void save(TnCapEvaluaCurso entity);

    /**
     * Remove TnCapEvaluacionCurso entities.
     *
     * @param entity TnCapEvaluacionCurso
     */
    @Delete
    void delete(TnCapEvaluaCurso entity);


    /**
     * Find the first TnCapEvaluacionCurso entity that matches the condition 'where fecModifico is equals to'.
     *
     * @param fecModifico java.util.Date
     * @return TnCapEvaluacionCurso
     */
    @FindByCondition(value = TnCapEvaluaCurso.class, condition = "FEC_MODIFICO=?")
    TnCapEvaluaCurso getByFecModifico(java.util.Date fecModifico);

    /**
     * Find all TnCapEvaluacionCurso entities that matches the condition 'where fecModifico is equals to'.
     *
     * @param fecModifico java.util.Date
     * @return Collection of TnCapEvaluacionCurso
     */
    @FindByCondition(value = TnCapEvaluaCurso.class, condition = "FEC_MODIFICO=?")
    List<TnCapEvaluaCurso> findByFecModifico(java.util.Date fecModifico);

    /**
     * Find the first TnCapEvaluacionCurso entity that matches the condition 'where usuario is equals to'.
     *
     * @param usuario java.lang.String
     * @return TnCapEvaluacionCurso
     */
    @FindByCondition(value = TnCapEvaluaCurso.class, condition = "USUARIO=?")
    TnCapEvaluaCurso getByUsuario(java.lang.String usuario);

    /**
     * Find all TnCapEvaluacionCurso entities that matches the condition 'where usuario is equals to'.
     *
     * @param usuario java.lang.String
     * @return Collection of TnCapEvaluacionCurso
     */
    @FindByCondition(value = TnCapEvaluaCurso.class, condition = "USUARIO=?")
    List<TnCapEvaluaCurso> findByUsuario(java.lang.String usuario);

    /**
     * Find the first TnCapEvaluacionCurso entity that matches the condition 'where evaluacionCursoP1 is equals to'.
     *
     * @param evaluacionCursoP1 java.lang.Float
     * @return TnCapEvaluacionCurso
     */
    @FindByCondition(value = TnCapEvaluaCurso.class, condition = "EVALUACION_CURSO_P1=?")
    TnCapEvaluaCurso getByEvaluacionCursoP1(java.lang.Float evaluacionCursoP1);

    /**
     * Find all TnCapEvaluacionCurso entities that matches the condition 'where evaluacionCursoP1 is equals to'.
     *
     * @param evaluacionCursoP1 java.lang.Float
     * @return Collection of TnCapEvaluacionCurso
     */
    @FindByCondition(value = TnCapEvaluaCurso.class, condition = "EVALUACION_CURSO_P1=?")
    List<TnCapEvaluaCurso> findByEvaluacionCursoP1(java.lang.Float evaluacionCursoP1);

    /**
     * Find the first TnCapEvaluacionCurso entity that matches the condition 'where evaluacionCursoP10 is equals to'.
     *
     * @param evaluacionCursoP10 java.lang.Float
     * @return TnCapEvaluacionCurso
     */
    @FindByCondition(value = TnCapEvaluaCurso.class, condition = "EVALUACION_CURSO_P10=?")
    TnCapEvaluaCurso getByEvaluacionCursoP10(java.lang.Float evaluacionCursoP10);

    /**
     * Find all TnCapEvaluacionCurso entities that matches the condition 'where evaluacionCursoP10 is equals to'.
     *
     * @param evaluacionCursoP10 java.lang.Float
     * @return Collection of TnCapEvaluacionCurso
     */
    @FindByCondition(value = TnCapEvaluaCurso.class, condition = "EVALUACION_CURSO_P10=?")
    List<TnCapEvaluaCurso> findByEvaluacionCursoP10(java.lang.Float evaluacionCursoP10);

    /**
     * Find the first TnCapEvaluacionCurso entity that matches the condition 'where evaluacionCursoP2 is equals to'.
     *
     * @param evaluacionCursoP2 java.lang.Float
     * @return TnCapEvaluacionCurso
     */
    @FindByCondition(value = TnCapEvaluaCurso.class, condition = "EVALUACION_CURSO_P2=?")
    TnCapEvaluaCurso getByEvaluacionCursoP2(java.lang.Float evaluacionCursoP2);

    /**
     * Find all TnCapEvaluacionCurso entities that matches the condition 'where evaluacionCursoP2 is equals to'.
     *
     * @param evaluacionCursoP2 java.lang.Float
     * @return Collection of TnCapEvaluacionCurso
     */
    @FindByCondition(value = TnCapEvaluaCurso.class, condition = "EVALUACION_CURSO_P2=?")
    List<TnCapEvaluaCurso> findByEvaluacionCursoP2(java.lang.Float evaluacionCursoP2);

    /**
     * Find the first TnCapEvaluacionCurso entity that matches the condition 'where evaluacionCursoP3 is equals to'.
     *
     * @param evaluacionCursoP3 java.lang.Float
     * @return TnCapEvaluacionCurso
     */
    @FindByCondition(value = TnCapEvaluaCurso.class, condition = "EVALUACION_CURSO_P3=?")
    TnCapEvaluaCurso getByEvaluacionCursoP3(java.lang.Float evaluacionCursoP3);

    /**
     * Find all TnCapEvaluacionCurso entities that matches the condition 'where evaluacionCursoP3 is equals to'.
     *
     * @param evaluacionCursoP3 java.lang.Float
     * @return Collection of TnCapEvaluacionCurso
     */
    @FindByCondition(value = TnCapEvaluaCurso.class, condition = "EVALUACION_CURSO_P3=?")
    List<TnCapEvaluaCurso> findByEvaluacionCursoP3(java.lang.Float evaluacionCursoP3);

    /**
     * Find the first TnCapEvaluacionCurso entity that matches the condition 'where evaluacionCursoP4 is equals to'.
     *
     * @param evaluacionCursoP4 java.lang.Float
     * @return TnCapEvaluacionCurso
     */
    @FindByCondition(value = TnCapEvaluaCurso.class, condition = "EVALUACION_CURSO_P4=?")
    TnCapEvaluaCurso getByEvaluacionCursoP4(java.lang.Float evaluacionCursoP4);

    /**
     * Find all TnCapEvaluacionCurso entities that matches the condition 'where evaluacionCursoP4 is equals to'.
     *
     * @param evaluacionCursoP4 java.lang.Float
     * @return Collection of TnCapEvaluacionCurso
     */
    @FindByCondition(value = TnCapEvaluaCurso.class, condition = "EVALUACION_CURSO_P4=?")
    List<TnCapEvaluaCurso> findByEvaluacionCursoP4(java.lang.Float evaluacionCursoP4);

    /**
     * Find the first TnCapEvaluacionCurso entity that matches the condition 'where evaluacionCursoP5 is equals to'.
     *
     * @param evaluacionCursoP5 java.lang.Float
     * @return TnCapEvaluacionCurso
     */
    @FindByCondition(value = TnCapEvaluaCurso.class, condition = "EVALUACION_CURSO_P5=?")
    TnCapEvaluaCurso getByEvaluacionCursoP5(java.lang.Float evaluacionCursoP5);

    /**
     * Find all TnCapEvaluacionCurso entities that matches the condition 'where evaluacionCursoP5 is equals to'.
     *
     * @param evaluacionCursoP5 java.lang.Float
     * @return Collection of TnCapEvaluacionCurso
     */
    @FindByCondition(value = TnCapEvaluaCurso.class, condition = "EVALUACION_CURSO_P5=?")
    List<TnCapEvaluaCurso> findByEvaluacionCursoP5(java.lang.Float evaluacionCursoP5);

    /**
     * Find the first TnCapEvaluacionCurso entity that matches the condition 'where evaluacionCursoP6 is equals to'.
     *
     * @param evaluacionCursoP6 java.lang.Float
     * @return TnCapEvaluacionCurso
     */
    @FindByCondition(value = TnCapEvaluaCurso.class, condition = "EVALUACION_CURSO_P6=?")
    TnCapEvaluaCurso getByEvaluacionCursoP6(java.lang.Float evaluacionCursoP6);

    /**
     * Find all TnCapEvaluacionCurso entities that matches the condition 'where evaluacionCursoP6 is equals to'.
     *
     * @param evaluacionCursoP6 java.lang.Float
     * @return Collection of TnCapEvaluacionCurso
     */
    @FindByCondition(value = TnCapEvaluaCurso.class, condition = "EVALUACION_CURSO_P6=?")
    List<TnCapEvaluaCurso> findByEvaluacionCursoP6(java.lang.Float evaluacionCursoP6);

    /**
     * Find the first TnCapEvaluacionCurso entity that matches the condition 'where evaluacionCursoP7 is equals to'.
     *
     * @param evaluacionCursoP7 java.lang.Float
     * @return TnCapEvaluacionCurso
     */
    @FindByCondition(value = TnCapEvaluaCurso.class, condition = "EVALUACION_CURSO_P7=?")
    TnCapEvaluaCurso getByEvaluacionCursoP7(java.lang.Float evaluacionCursoP7);

    /**
     * Find all TnCapEvaluacionCurso entities that matches the condition 'where evaluacionCursoP7 is equals to'.
     *
     * @param evaluacionCursoP7 java.lang.Float
     * @return Collection of TnCapEvaluacionCurso
     */
    @FindByCondition(value = TnCapEvaluaCurso.class, condition = "EVALUACION_CURSO_P7=?")
    List<TnCapEvaluaCurso> findByEvaluacionCursoP7(java.lang.Float evaluacionCursoP7);

    /**
     * Find the first TnCapEvaluacionCurso entity that matches the condition 'where evaluacionCursoP8 is equals to'.
     *
     * @param evaluacionCursoP8 java.lang.Float
     * @return TnCapEvaluacionCurso
     */
    @FindByCondition(value = TnCapEvaluaCurso.class, condition = "EVALUACION_CURSO_P8=?")
    TnCapEvaluaCurso getByEvaluacionCursoP8(java.lang.Float evaluacionCursoP8);

    /**
     * Find all TnCapEvaluacionCurso entities that matches the condition 'where evaluacionCursoP8 is equals to'.
     *
     * @param evaluacionCursoP8 java.lang.Float
     * @return Collection of TnCapEvaluacionCurso
     */
    @FindByCondition(value = TnCapEvaluaCurso.class, condition = "EVALUACION_CURSO_P8=?")
    List<TnCapEvaluaCurso> findByEvaluacionCursoP8(java.lang.Float evaluacionCursoP8);

    /**
     * Find the first TnCapEvaluacionCurso entity that matches the condition 'where evaluacionCursoP9 is equals to'.
     *
     * @param evaluacionCursoP9 java.lang.Float
     * @return TnCapEvaluacionCurso
     */
    @FindByCondition(value = TnCapEvaluaCurso.class, condition = "EVALUACION_CURSO_P9=?")
    TnCapEvaluaCurso getByEvaluacionCursoP9(java.lang.Float evaluacionCursoP9);

    /**
     * Find all TnCapEvaluacionCurso entities that matches the condition 'where evaluacionCursoP9 is equals to'.
     *
     * @param evaluacionCursoP9 java.lang.Float
     * @return Collection of TnCapEvaluacionCurso
     */
    @FindByCondition(value = TnCapEvaluaCurso.class, condition = "EVALUACION_CURSO_P9=?")
    List<TnCapEvaluaCurso> findByEvaluacionCursoP9(java.lang.Float evaluacionCursoP9);
}
