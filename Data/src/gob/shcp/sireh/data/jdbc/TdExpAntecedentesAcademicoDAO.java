package gob.shcp.sireh.data.jdbc;

import gob.shcp.fsn.data.annotation.Delete;
import gob.shcp.fsn.data.annotation.FindAll;
import gob.shcp.fsn.data.annotation.FindByCondition;
import gob.shcp.fsn.data.annotation.FindById;
import gob.shcp.fsn.data.annotation.Save;
import gob.shcp.fsn.service.data.orm.JdbcDataService;

import java.util.List;

import gob.shcp.sireh.domain.jdbc.TdExpAntecedentesAcademicos;

/**
 * Data access interface for TdExpAntecedentesAcademico.
 */
public interface TdExpAntecedentesAcademicoDAO extends JdbcDataService {
    /**
     * Find TdExpAntecedentesAcademico entity by its identifier or primary key value.
     *
     * @param id identifier or primary key
     * @return TdExpAntecedentesAcademico
     */
    @FindById(TdExpAntecedentesAcademicos.class)
    TdExpAntecedentesAcademicos getById(gob.shcp.sireh.domain.jdbc.TdExpAntecedentesAcademicoPK id);
    
    /**
     * Get all TdExpAntecedentesAcademico entities limited by a maximum number of elements.
     *
     * @return Collection of TdExpAntecedentesAcademico
     */
    @FindAll(TdExpAntecedentesAcademicos.class)
    List<TdExpAntecedentesAcademicos> findAll();
    
    /**
     * Make persistence of TdExpAntecedentesAcademico entities. If its identifier or primary key is null then create else update.
     *
     * @param entity TdExpAntecedentesAcademico
     */
    @Save
    void save(TdExpAntecedentesAcademicos entity);
    
    /**
     * Remove TdExpAntecedentesAcademico entities.
     *
     * @param entity TdExpAntecedentesAcademico
     */
    @Delete
    void delete(TdExpAntecedentesAcademicos entity);


    /**
     * Find the first TdExpAntecedentesAcademico entity that matches the condition 'where aacDoctoRef is equals to'.
     *
     * @param aacDoctoRef java.lang.String
     * @return TdExpAntecedentesAcademico
     */
    @FindByCondition(value=TdExpAntecedentesAcademicos.class, condition="AAC_DOCTO_REF=?")
    TdExpAntecedentesAcademicos getByAacDoctoRef(java.lang.String aacDoctoRef);

    /**
     * Find all TdExpAntecedentesAcademico entities that matches the condition 'where aacDoctoRef is equals to'.
     *
     * @param aacDoctoRef java.lang.String
     * @return Collection of TdExpAntecedentesAcademico
     */
    @FindByCondition(value=TdExpAntecedentesAcademicos.class, condition="AAC_DOCTO_REF=?")
    List<TdExpAntecedentesAcademicos> findByAacDoctoRef(java.lang.String aacDoctoRef);

    /**
     * Find the first TdExpAntecedentesAcademico entity that matches the condition 'where aacEstConcluidos is equals to'.
     *
     * @param aacEstConcluidos java.lang.String
     * @return TdExpAntecedentesAcademico
     */
    @FindByCondition(value=TdExpAntecedentesAcademicos.class, condition="AAC_EST_CONCLUIDOS=?")
    TdExpAntecedentesAcademicos getByAacEstConcluidos(java.lang.String aacEstConcluidos);

    /**
     * Find all TdExpAntecedentesAcademico entities that matches the condition 'where aacEstConcluidos is equals to'.
     *
     * @param aacEstConcluidos java.lang.String
     * @return Collection of TdExpAntecedentesAcademico
     */
    @FindByCondition(value=TdExpAntecedentesAcademicos.class, condition="AAC_EST_CONCLUIDOS=?")
    List<TdExpAntecedentesAcademicos> findByAacEstConcluidos(java.lang.String aacEstConcluidos);

    /**
     * Find the first TdExpAntecedentesAcademico entity that matches the condition 'where fecModifico is equals to'.
     *
     * @param fecModifico java.util.Date
     * @return TdExpAntecedentesAcademico
     */
    @FindByCondition(value=TdExpAntecedentesAcademicos.class, condition="FEC_MODIFICO=?")
    TdExpAntecedentesAcademicos getByFecModifico(java.util.Date fecModifico);

    /**
     * Find all TdExpAntecedentesAcademico entities that matches the condition 'where fecModifico is equals to'.
     *
     * @param fecModifico java.util.Date
     * @return Collection of TdExpAntecedentesAcademico
     */
    @FindByCondition(value=TdExpAntecedentesAcademicos.class, condition="FEC_MODIFICO=?")
    List<TdExpAntecedentesAcademicos> findByFecModifico(java.util.Date fecModifico);

    /**
     * Find the first TdExpAntecedentesAcademico entity that matches the condition 'where idInstEducat is equals to'.
     *
     * @param idInstEducat int
     * @return TdExpAntecedentesAcademico
     */
    @FindByCondition(value=TdExpAntecedentesAcademicos.class, condition="ID_INST_EDUCAT=?")
    TdExpAntecedentesAcademicos getByIdInstEducat(int idInstEducat);

    /**
     * Find all TdExpAntecedentesAcademico entities that matches the condition 'where idInstEducat is equals to'.
     *
     * @param idInstEducat int
     * @return Collection of TdExpAntecedentesAcademico
     */
    @FindByCondition(value=TdExpAntecedentesAcademicos.class, condition="ID_INST_EDUCAT=?")
    List<TdExpAntecedentesAcademicos> findByIdInstEducat(int idInstEducat);

    /**
     * Find the first TdExpAntecedentesAcademico entity that matches the condition 'where idNivelEscolar is equals to'.
     *
     * @param idNivelEscolar int
     * @return TdExpAntecedentesAcademico
     */
    @FindByCondition(value=TdExpAntecedentesAcademicos.class, condition="ID_NIVEL_ESCOLAR=?")
    TdExpAntecedentesAcademicos getByIdNivelEscolar(int idNivelEscolar);

    /**
     * Find all TdExpAntecedentesAcademico entities that matches the condition 'where idNivelEscolar is equals to'.
     *
     * @param idNivelEscolar int
     * @return Collection of TdExpAntecedentesAcademico
     */
    @FindByCondition(value=TdExpAntecedentesAcademicos.class, condition="ID_NIVEL_ESCOLAR=?")
    List<TdExpAntecedentesAcademicos> findByIdNivelEscolar(int idNivelEscolar);

    /**
     * Find the first TdExpAntecedentesAcademico entity that matches the condition 'where idProfCarrera is equals to'.
     *
     * @param idProfCarrera float
     * @return TdExpAntecedentesAcademico
     */
    @FindByCondition(value=TdExpAntecedentesAcademicos.class, condition="ID_PROF_CARRERA=?")
    TdExpAntecedentesAcademicos getByIdProfCarrera(float idProfCarrera);

    /**
     * Find all TdExpAntecedentesAcademico entities that matches the condition 'where idProfCarrera is equals to'.
     *
     * @param idProfCarrera float
     * @return Collection of TdExpAntecedentesAcademico
     */
    @FindByCondition(value=TdExpAntecedentesAcademicos.class, condition="ID_PROF_CARRERA=?")
    List<TdExpAntecedentesAcademicos> findByIdProfCarrera(float idProfCarrera);

    /**
     * Find the first TdExpAntecedentesAcademico entity that matches the condition 'where idStatus is equals to'.
     *
     * @param idStatus java.lang.String
     * @return TdExpAntecedentesAcademico
     */
    @FindByCondition(value=TdExpAntecedentesAcademicos.class, condition="ID_STATUS=?")
    TdExpAntecedentesAcademicos getByIdStatus(java.lang.String idStatus);

    /**
     * Find all TdExpAntecedentesAcademico entities that matches the condition 'where idStatus is equals to'.
     *
     * @param idStatus java.lang.String
     * @return Collection of TdExpAntecedentesAcademico
     */
    @FindByCondition(value=TdExpAntecedentesAcademicos.class, condition="ID_STATUS=?")
    List<TdExpAntecedentesAcademicos> findByIdStatus(java.lang.String idStatus);

    /**
     * Find the first TdExpAntecedentesAcademico entity that matches the condition 'where usuario is equals to'.
     *
     * @param usuario java.lang.String
     * @return TdExpAntecedentesAcademico
     */
    @FindByCondition(value=TdExpAntecedentesAcademicos.class, condition="USUARIO=?")
    TdExpAntecedentesAcademicos getByUsuario(java.lang.String usuario);

    /**
     * Find all TdExpAntecedentesAcademico entities that matches the condition 'where usuario is equals to'.
     *
     * @param usuario java.lang.String
     * @return Collection of TdExpAntecedentesAcademico
     */
    @FindByCondition(value=TdExpAntecedentesAcademicos.class, condition="USUARIO=?")
    List<TdExpAntecedentesAcademicos> findByUsuario(java.lang.String usuario);

    /**
     * Find the first TdExpAntecedentesAcademico entity that matches the condition 'where aacCedProfesional is equals to'.
     *
     * @param aacCedProfesional java.lang.Integer
     * @return TdExpAntecedentesAcademico
     */
    @FindByCondition(value=TdExpAntecedentesAcademicos.class, condition="AAC_CED_PROFESIONAL=?")
    TdExpAntecedentesAcademicos getByAacCedProfesional(java.lang.Integer aacCedProfesional);

    /**
     * Find all TdExpAntecedentesAcademico entities that matches the condition 'where aacCedProfesional is equals to'.
     *
     * @param aacCedProfesional java.lang.Integer
     * @return Collection of TdExpAntecedentesAcademico
     */
    @FindByCondition(value=TdExpAntecedentesAcademicos.class, condition="AAC_CED_PROFESIONAL=?")
    List<TdExpAntecedentesAcademicos> findByAacCedProfesional(java.lang.Integer aacCedProfesional);

    /**
     * Find the first TdExpAntecedentesAcademico entity that matches the condition 'where aacPromedio is equals to'.
     *
     * @param aacPromedio java.lang.Float
     * @return TdExpAntecedentesAcademico
     */
    @FindByCondition(value=TdExpAntecedentesAcademicos.class, condition="AAC_PROMEDIO=?")
    TdExpAntecedentesAcademicos getByAacPromedio(java.lang.Float aacPromedio);

    /**
     * Find all TdExpAntecedentesAcademico entities that matches the condition 'where aacPromedio is equals to'.
     *
     * @param aacPromedio java.lang.Float
     * @return Collection of TdExpAntecedentesAcademico
     */
    @FindByCondition(value=TdExpAntecedentesAcademicos.class, condition="AAC_PROMEDIO=?")
    List<TdExpAntecedentesAcademicos> findByAacPromedio(java.lang.Float aacPromedio);
}