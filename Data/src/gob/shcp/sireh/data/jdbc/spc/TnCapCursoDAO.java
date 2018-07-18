package gob.shcp.sireh.data.jdbc.spc;

import gob.shcp.fsn.data.annotation.Delete;
import gob.shcp.fsn.data.annotation.FindAll;
import gob.shcp.fsn.data.annotation.FindByCondition;
import gob.shcp.fsn.data.annotation.FindById;
import gob.shcp.fsn.data.annotation.Save;
import gob.shcp.fsn.service.data.orm.JdbcDataService;

import java.util.List;

import gob.shcp.sireh.domain.jdbc.spc.TnCapCurso;

/**
 * Data access interface for TnCapCurso.
 */
public interface TnCapCursoDAO extends JdbcDataService {
    /**
     * Find TnCapCurso entity by its identifier or primary key value.
     *
     * @param id identifier or primary key
     * @return TnCapCurso
     */
    @FindById(TnCapCurso.class)
    TnCapCurso getById(java.lang.Integer id);
    
    /**
     * Get all TnCapCurso entities limited by a maximum number of elements.
     *
     * @return Collection of TnCapCurso
     */
    @FindAll(TnCapCurso.class)
    List<TnCapCurso> findAll();
    
    /**
     * Make persistence of TnCapCurso entities. If its identifier or primary key is null then create else update.
     *
     * @param entity TnCapCurso
     */
    @Save
    void save(TnCapCurso entity);
    
    /**
     * Remove TnCapCurso entities.
     *
     * @param entity TnCapCurso
     */
    @Delete
    void delete(TnCapCurso entity);


    /**
     * Find the first TnCapCurso entity that matches the condition 'where cicloEjeTematico is equals to'.
     *
     * @param cicloEjeTematico int
     * @return TnCapCurso
     */
    @FindByCondition(value=TnCapCurso.class, condition="CICLO_EJE_TEMATICO=?")
    TnCapCurso getByCicloEjeTematico(int cicloEjeTematico);

    /**
     * Find all TnCapCurso entities that matches the condition 'where cicloEjeTematico is equals to'.
     *
     * @param cicloEjeTematico int
     * @return Collection of TnCapCurso
     */
    @FindByCondition(value=TnCapCurso.class, condition="CICLO_EJE_TEMATICO=?")
    List<TnCapCurso> findByCicloEjeTematico(int cicloEjeTematico);

    /**
     * Find the first TnCapCurso entity that matches the condition 'where cursoClave is equals to'.
     *
     * @param cursoClave java.lang.String
     * @return TnCapCurso
     */
    @FindByCondition(value=TnCapCurso.class, condition="CURSO_CLAVE=?")
    TnCapCurso getByCursoClave(java.lang.String cursoClave);

    /**
     * Find all TnCapCurso entities that matches the condition 'where cursoClave is equals to'.
     *
     * @param cursoClave java.lang.String
     * @return Collection of TnCapCurso
     */
    @FindByCondition(value=TnCapCurso.class, condition="CURSO_CLAVE=?")
    List<TnCapCurso> findByCursoClave(java.lang.String cursoClave);

    /**
     * Find the first TnCapCurso entity that matches the condition 'where cursoPresupuesto is equals to'.
     *
     * @param cursoPresupuesto double
     * @return TnCapCurso
     */
    @FindByCondition(value=TnCapCurso.class, condition="CURSO_PRESUPUESTO=?")
    TnCapCurso getByCursoPresupuesto(double cursoPresupuesto);

    /**
     * Find all TnCapCurso entities that matches the condition 'where cursoPresupuesto is equals to'.
     *
     * @param cursoPresupuesto double
     * @return Collection of TnCapCurso
     */
    @FindByCondition(value=TnCapCurso.class, condition="CURSO_PRESUPUESTO=?")
    List<TnCapCurso> findByCursoPresupuesto(double cursoPresupuesto);

    /**
     * Find the first TnCapCurso entity that matches the condition 'where fecModifico is equals to'.
     *
     * @param fecModifico java.util.Date
     * @return TnCapCurso
     */
    @FindByCondition(value=TnCapCurso.class, condition="FEC_MODIFICO=?")
    TnCapCurso getByFecModifico(java.util.Date fecModifico);

    /**
     * Find all TnCapCurso entities that matches the condition 'where fecModifico is equals to'.
     *
     * @param fecModifico java.util.Date
     * @return Collection of TnCapCurso
     */
    @FindByCondition(value=TnCapCurso.class, condition="FEC_MODIFICO=?")
    List<TnCapCurso> findByFecModifico(java.util.Date fecModifico);

    /**
     * Find the first TnCapCurso entity that matches the condition 'where idCursoPrincipal is equals to'.
     *
     * @param idCursoPrincipal java.lang.String
     * @return TnCapCurso
     */
    @FindByCondition(value=TnCapCurso.class, condition="ID_CURSO_PRINCIPAL=?")
    TnCapCurso getByIdCursoPrincipal(java.lang.String idCursoPrincipal);

    /**
     * Find all TnCapCurso entities that matches the condition 'where idCursoPrincipal is equals to'.
     *
     * @param idCursoPrincipal java.lang.String
     * @return Collection of TnCapCurso
     */
    @FindByCondition(value=TnCapCurso.class, condition="ID_CURSO_PRINCIPAL=?")
    List<TnCapCurso> findByIdCursoPrincipal(java.lang.String idCursoPrincipal);

    /**
     * Find the first TnCapCurso entity that matches the condition 'where idEjeTematico is equals to'.
     *
     * @param idEjeTematico java.lang.String
     * @return TnCapCurso
     */
    @FindByCondition(value=TnCapCurso.class, condition="ID_EJE_TEMATICO=?")
    TnCapCurso getByIdEjeTematico(java.lang.String idEjeTematico);

    /**
     * Find all TnCapCurso entities that matches the condition 'where idEjeTematico is equals to'.
     *
     * @param idEjeTematico java.lang.String
     * @return Collection of TnCapCurso
     */
    @FindByCondition(value=TnCapCurso.class, condition="ID_EJE_TEMATICO=?")
    List<TnCapCurso> findByIdEjeTematico(java.lang.String idEjeTematico);

    /**
     * Find the first TnCapCurso entity that matches the condition 'where idTipoCurso is equals to'.
     *
     * @param idTipoCurso java.lang.String
     * @return TnCapCurso
     */
    @FindByCondition(value=TnCapCurso.class, condition="ID_TIPO_CURSO=?")
    TnCapCurso getByIdTipoCurso(java.lang.String idTipoCurso);

    /**
     * Find all TnCapCurso entities that matches the condition 'where idTipoCurso is equals to'.
     *
     * @param idTipoCurso java.lang.String
     * @return Collection of TnCapCurso
     */
    @FindByCondition(value=TnCapCurso.class, condition="ID_TIPO_CURSO=?")
    List<TnCapCurso> findByIdTipoCurso(java.lang.String idTipoCurso);

    /**
     * Find the first TnCapCurso entity that matches the condition 'where usuario is equals to'.
     *
     * @param usuario java.lang.String
     * @return TnCapCurso
     */
    @FindByCondition(value=TnCapCurso.class, condition="USUARIO=?")
    TnCapCurso getByUsuario(java.lang.String usuario);

    /**
     * Find all TnCapCurso entities that matches the condition 'where usuario is equals to'.
     *
     * @param usuario java.lang.String
     * @return Collection of TnCapCurso
     */
    @FindByCondition(value=TnCapCurso.class, condition="USUARIO=?")
    List<TnCapCurso> findByUsuario(java.lang.String usuario);

    /**
     * Find the first TnCapCurso entity that matches the condition 'where cursoClaveCertificacion is equals to'.
     *
     * @param cursoClaveCertificacion java.lang.String
     * @return TnCapCurso
     */
    @FindByCondition(value=TnCapCurso.class, condition="CURSO_CLAVE_CERTIFICACION=?")
    TnCapCurso getByCursoClaveCertificacion(java.lang.String cursoClaveCertificacion);

    /**
     * Find all TnCapCurso entities that matches the condition 'where cursoClaveCertificacion is equals to'.
     *
     * @param cursoClaveCertificacion java.lang.String
     * @return Collection of TnCapCurso
     */
    @FindByCondition(value=TnCapCurso.class, condition="CURSO_CLAVE_CERTIFICACION=?")
    List<TnCapCurso> findByCursoClaveCertificacion(java.lang.String cursoClaveCertificacion);

    /**
     * Find the first TnCapCurso entity that matches the condition 'where cursoDuracion is equals to'.
     *
     * @param cursoDuracion java.lang.Float
     * @return TnCapCurso
     */
    @FindByCondition(value=TnCapCurso.class, condition="CURSO_DURACION=?")
    TnCapCurso getByCursoDuracion(java.lang.Float cursoDuracion);

    /**
     * Find all TnCapCurso entities that matches the condition 'where cursoDuracion is equals to'.
     *
     * @param cursoDuracion java.lang.Float
     * @return Collection of TnCapCurso
     */
    @FindByCondition(value=TnCapCurso.class, condition="CURSO_DURACION=?")
    List<TnCapCurso> findByCursoDuracion(java.lang.Float cursoDuracion);

    /**
     * Find the first TnCapCurso entity that matches the condition 'where cursoFecFin is equals to'.
     *
     * @param cursoFecFin java.util.Date
     * @return TnCapCurso
     */
    @FindByCondition(value=TnCapCurso.class, condition="CURSO_FEC_FIN=?")
    TnCapCurso getByCursoFecFin(java.util.Date cursoFecFin);

    /**
     * Find all TnCapCurso entities that matches the condition 'where cursoFecFin is equals to'.
     *
     * @param cursoFecFin java.util.Date
     * @return Collection of TnCapCurso
     */
    @FindByCondition(value=TnCapCurso.class, condition="CURSO_FEC_FIN=?")
    List<TnCapCurso> findByCursoFecFin(java.util.Date cursoFecFin);

    /**
     * Find the first TnCapCurso entity that matches the condition 'where cursoFecIni is equals to'.
     *
     * @param cursoFecIni java.util.Date
     * @return TnCapCurso
     */
    @FindByCondition(value=TnCapCurso.class, condition="CURSO_FEC_INI=?")
    TnCapCurso getByCursoFecIni(java.util.Date cursoFecIni);

    /**
     * Find all TnCapCurso entities that matches the condition 'where cursoFecIni is equals to'.
     *
     * @param cursoFecIni java.util.Date
     * @return Collection of TnCapCurso
     */
    @FindByCondition(value=TnCapCurso.class, condition="CURSO_FEC_INI=?")
    List<TnCapCurso> findByCursoFecIni(java.util.Date cursoFecIni);

    /**
     * Find the first TnCapCurso entity that matches the condition 'where cursoMinimoParticipantes is equals to'.
     *
     * @param cursoMinimoParticipantes java.lang.Integer
     * @return TnCapCurso
     */
    @FindByCondition(value=TnCapCurso.class, condition="CURSO_MINIMO_PARTICIPANTES=?")
    TnCapCurso getByCursoMinimoParticipantes(java.lang.Integer cursoMinimoParticipantes);

    /**
     * Find all TnCapCurso entities that matches the condition 'where cursoMinimoParticipantes is equals to'.
     *
     * @param cursoMinimoParticipantes java.lang.Integer
     * @return Collection of TnCapCurso
     */
    @FindByCondition(value=TnCapCurso.class, condition="CURSO_MINIMO_PARTICIPANTES=?")
    List<TnCapCurso> findByCursoMinimoParticipantes(java.lang.Integer cursoMinimoParticipantes);

    /**
     * Find the first TnCapCurso entity that matches the condition 'where cursoParticipantes is equals to'.
     *
     * @param cursoParticipantes java.lang.Integer
     * @return TnCapCurso
     */
    @FindByCondition(value=TnCapCurso.class, condition="CURSO_PARTICIPANTES=?")
    TnCapCurso getByCursoParticipantes(java.lang.Integer cursoParticipantes);

    /**
     * Find all TnCapCurso entities that matches the condition 'where cursoParticipantes is equals to'.
     *
     * @param cursoParticipantes java.lang.Integer
     * @return Collection of TnCapCurso
     */
    @FindByCondition(value=TnCapCurso.class, condition="CURSO_PARTICIPANTES=?")
    List<TnCapCurso> findByCursoParticipantes(java.lang.Integer cursoParticipantes);

    /**
     * Find the first TnCapCurso entity that matches the condition 'where cursoSupervisorInst is equals to'.
     *
     * @param cursoSupervisorInst java.lang.String
     * @return TnCapCurso
     */
    @FindByCondition(value=TnCapCurso.class, condition="CURSO_SUPERVISOR_INST=?")
    TnCapCurso getByCursoSupervisorInst(java.lang.String cursoSupervisorInst);

    /**
     * Find all TnCapCurso entities that matches the condition 'where cursoSupervisorInst is equals to'.
     *
     * @param cursoSupervisorInst java.lang.String
     * @return Collection of TnCapCurso
     */
    @FindByCondition(value=TnCapCurso.class, condition="CURSO_SUPERVISOR_INST=?")
    List<TnCapCurso> findByCursoSupervisorInst(java.lang.String cursoSupervisorInst);

    /**
     * Find the first TnCapCurso entity that matches the condition 'where idInstructorSuplente is equals to'.
     *
     * @param idInstructorSuplente java.lang.Integer
     * @return TnCapCurso
     */
    @FindByCondition(value=TnCapCurso.class, condition="ID_INSTRUCTOR_SUPLENTE=?")
    TnCapCurso getByIdInstructorSuplente(java.lang.Integer idInstructorSuplente);

    /**
     * Find all TnCapCurso entities that matches the condition 'where idInstructorSuplente is equals to'.
     *
     * @param idInstructorSuplente java.lang.Integer
     * @return Collection of TnCapCurso
     */
    @FindByCondition(value=TnCapCurso.class, condition="ID_INSTRUCTOR_SUPLENTE=?")
    List<TnCapCurso> findByIdInstructorSuplente(java.lang.Integer idInstructorSuplente);

    /**
     * Find the first TnCapCurso entity that matches the condition 'where idInstructorTitular is equals to'.
     *
     * @param idInstructorTitular java.lang.Integer
     * @return TnCapCurso
     */
    @FindByCondition(value=TnCapCurso.class, condition="ID_INSTRUCTOR_TITULAR=?")
    TnCapCurso getByIdInstructorTitular(java.lang.Integer idInstructorTitular);

    /**
     * Find all TnCapCurso entities that matches the condition 'where idInstructorTitular is equals to'.
     *
     * @param idInstructorTitular java.lang.Integer
     * @return Collection of TnCapCurso
     */
    @FindByCondition(value=TnCapCurso.class, condition="ID_INSTRUCTOR_TITULAR=?")
    List<TnCapCurso> findByIdInstructorTitular(java.lang.Integer idInstructorTitular);
}