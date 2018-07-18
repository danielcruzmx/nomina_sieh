package gob.shcp.sireh.data.jdbc.spc;

import gob.shcp.fsn.data.annotation.Delete;
import gob.shcp.fsn.data.annotation.FindAll;
import gob.shcp.fsn.data.annotation.FindByCondition;
import gob.shcp.fsn.data.annotation.FindById;
import gob.shcp.fsn.data.annotation.Save;
import gob.shcp.fsn.service.data.orm.JdbcDataService;

import java.util.List;

import gob.shcp.sireh.domain.jdbc.spc.TnCapContratoCur;


/**
 * Data access interface for TnCapContratoCur.
 */
public interface TnCapContratoCurDAO extends JdbcDataService {
    /**
     * Find TnCapContratoCur entity by its identifier or primary key value.
     *
     * @param id identifier or primary key
     * @return TnCapContratoCur
     */
    @FindById(TnCapContratoCur.class)
    TnCapContratoCur getById(java.lang.Integer id);
    
    /**
     * Get all TnCapContratoCur entities limited by a maximum number of elements.
     *
     * @return Collection of TnCapContratoCur
     */
    @FindAll(TnCapContratoCur.class)
    List<TnCapContratoCur> findAll();
    
    /**
     * Make persistence of TnCapContratoCur entities. If its identifier or primary key is null then create else update.
     *
     * @param entity TnCapContratoCur
     */
    @Save
    void save(TnCapContratoCur entity);
    
    /**
     * Remove TnCapContratoCur entities.
     *
     * @param entity TnCapContratoCur
     */
    @Delete
    void delete(TnCapContratoCur entity);


    /**
     * Find the first TnCapContratoCur entity that matches the condition 'where contratoCursoCiclo is equals to'.
     *
     * @param contratoCursoCiclo int
     * @return TnCapContratoCur
     */
    @FindByCondition(value=TnCapContratoCur.class, condition="CONTRATO_CURSO_CICLO=?")
    TnCapContratoCur getByContratoCursoCiclo(int contratoCursoCiclo);

    /**
     * Find all TnCapContratoCur entities that matches the condition 'where contratoCursoCiclo is equals to'.
     *
     * @param contratoCursoCiclo int
     * @return Collection of TnCapContratoCur
     */
    @FindByCondition(value=TnCapContratoCur.class, condition="CONTRATO_CURSO_CICLO=?")
    List<TnCapContratoCur> findByContratoCursoCiclo(int contratoCursoCiclo);

    /**
     * Find the first TnCapContratoCur entity that matches the condition 'where contratoCursoDesc is equals to'.
     *
     * @param contratoCursoDesc java.lang.String
     * @return TnCapContratoCur
     */
    @FindByCondition(value=TnCapContratoCur.class, condition="CONTRATO_CURSO_DESC=?")
    TnCapContratoCur getByContratoCursoDesc(java.lang.String contratoCursoDesc);

    /**
     * Find all TnCapContratoCur entities that matches the condition 'where contratoCursoDesc is equals to'.
     *
     * @param contratoCursoDesc java.lang.String
     * @return Collection of TnCapContratoCur
     */
    @FindByCondition(value=TnCapContratoCur.class, condition="CONTRATO_CURSO_DESC=?")
    List<TnCapContratoCur> findByContratoCursoDesc(java.lang.String contratoCursoDesc);

    /**
     * Find the first TnCapContratoCur entity that matches the condition 'where contratoCursoNumero is equals to'.
     *
     * @param contratoCursoNumero java.lang.String
     * @return TnCapContratoCur
     */
    @FindByCondition(value=TnCapContratoCur.class, condition="CONTRATO_CURSO_NUMERO=?")
    TnCapContratoCur getByContratoCursoNumero(java.lang.String contratoCursoNumero);

    /**
     * Find all TnCapContratoCur entities that matches the condition 'where contratoCursoNumero is equals to'.
     *
     * @param contratoCursoNumero java.lang.String
     * @return Collection of TnCapContratoCur
     */
    @FindByCondition(value=TnCapContratoCur.class, condition="CONTRATO_CURSO_NUMERO=?")
    List<TnCapContratoCur> findByContratoCursoNumero(java.lang.String contratoCursoNumero);

    /**
     * Find the first TnCapContratoCur entity that matches the condition 'where contratoCursoRep1 is equals to'.
     *
     * @param contratoCursoRep1 java.lang.String
     * @return TnCapContratoCur
     */
    @FindByCondition(value=TnCapContratoCur.class, condition="CONTRATO_CURSO_REP1=?")
    TnCapContratoCur getByContratoCursoRep1(java.lang.String contratoCursoRep1);

    /**
     * Find all TnCapContratoCur entities that matches the condition 'where contratoCursoRep1 is equals to'.
     *
     * @param contratoCursoRep1 java.lang.String
     * @return Collection of TnCapContratoCur
     */
    @FindByCondition(value=TnCapContratoCur.class, condition="CONTRATO_CURSO_REP1=?")
    List<TnCapContratoCur> findByContratoCursoRep1(java.lang.String contratoCursoRep1);

    /**
     * Find the first TnCapContratoCur entity that matches the condition 'where fecModifico is equals to'.
     *
     * @param fecModifico java.util.Date
     * @return TnCapContratoCur
     */
    @FindByCondition(value=TnCapContratoCur.class, condition="FEC_MODIFICO=?")
    TnCapContratoCur getByFecModifico(java.util.Date fecModifico);

    /**
     * Find all TnCapContratoCur entities that matches the condition 'where fecModifico is equals to'.
     *
     * @param fecModifico java.util.Date
     * @return Collection of TnCapContratoCur
     */
    @FindByCondition(value=TnCapContratoCur.class, condition="FEC_MODIFICO=?")
    List<TnCapContratoCur> findByFecModifico(java.util.Date fecModifico);

    /**
     * Find the first TnCapContratoCur entity that matches the condition 'where usuario is equals to'.
     *
     * @param usuario java.lang.String
     * @return TnCapContratoCur
     */
    @FindByCondition(value=TnCapContratoCur.class, condition="USUARIO=?")
    TnCapContratoCur getByUsuario(java.lang.String usuario);

    /**
     * Find all TnCapContratoCur entities that matches the condition 'where usuario is equals to'.
     *
     * @param usuario java.lang.String
     * @return Collection of TnCapContratoCur
     */
    @FindByCondition(value=TnCapContratoCur.class, condition="USUARIO=?")
    List<TnCapContratoCur> findByUsuario(java.lang.String usuario);

    /**
     * Find the first TnCapContratoCur entity that matches the condition 'where contratoCursoAdministrador is equals to'.
     *
     * @param contratoCursoAdministrador java.lang.String
     * @return TnCapContratoCur
     */
    @FindByCondition(value=TnCapContratoCur.class, condition="CONTRATO_CURSO_ADMINISTRADOR=?")
    TnCapContratoCur getByContratoCursoAdministrador(java.lang.String contratoCursoAdministrador);

    /**
     * Find all TnCapContratoCur entities that matches the condition 'where contratoCursoAdministrador is equals to'.
     *
     * @param contratoCursoAdministrador java.lang.String
     * @return Collection of TnCapContratoCur
     */
    @FindByCondition(value=TnCapContratoCur.class, condition="CONTRATO_CURSO_ADMINISTRADOR=?")
    List<TnCapContratoCur> findByContratoCursoAdministrador(java.lang.String contratoCursoAdministrador);

    /**
     * Find the first TnCapContratoCur entity that matches the condition 'where contratoCursoFechaAdjud is equals to'.
     *
     * @param contratoCursoFechaAdjud java.util.Date
     * @return TnCapContratoCur
     */
    @FindByCondition(value=TnCapContratoCur.class, condition="CONTRATO_CURSO_FECHA_ADJUD=?")
    TnCapContratoCur getByContratoCursoFechaAdjud(java.util.Date contratoCursoFechaAdjud);

    /**
     * Find all TnCapContratoCur entities that matches the condition 'where contratoCursoFechaAdjud is equals to'.
     *
     * @param contratoCursoFechaAdjud java.util.Date
     * @return Collection of TnCapContratoCur
     */
    @FindByCondition(value=TnCapContratoCur.class, condition="CONTRATO_CURSO_FECHA_ADJUD=?")
    List<TnCapContratoCur> findByContratoCursoFechaAdjud(java.util.Date contratoCursoFechaAdjud);

    /**
     * Find the first TnCapContratoCur entity that matches the condition 'where contratoCursoFechaContr is equals to'.
     *
     * @param contratoCursoFechaContr java.util.Date
     * @return TnCapContratoCur
     */
    @FindByCondition(value=TnCapContratoCur.class, condition="CONTRATO_CURSO_FECHA_CONTR=?")
    TnCapContratoCur getByContratoCursoFechaContr(java.util.Date contratoCursoFechaContr);

    /**
     * Find all TnCapContratoCur entities that matches the condition 'where contratoCursoFechaContr is equals to'.
     *
     * @param contratoCursoFechaContr java.util.Date
     * @return Collection of TnCapContratoCur
     */
    @FindByCondition(value=TnCapContratoCur.class, condition="CONTRATO_CURSO_FECHA_CONTR=?")
    List<TnCapContratoCur> findByContratoCursoFechaContr(java.util.Date contratoCursoFechaContr);

    /**
     * Find the first TnCapContratoCur entity that matches the condition 'where contratoCursoMonto is equals to'.
     *
     * @param contratoCursoMonto java.lang.Double
     * @return TnCapContratoCur
     */
    @FindByCondition(value=TnCapContratoCur.class, condition="CONTRATO_CURSO_MONTO=?")
    TnCapContratoCur getByContratoCursoMonto(java.lang.Double contratoCursoMonto);

    /**
     * Find all TnCapContratoCur entities that matches the condition 'where contratoCursoMonto is equals to'.
     *
     * @param contratoCursoMonto java.lang.Double
     * @return Collection of TnCapContratoCur
     */
    @FindByCondition(value=TnCapContratoCur.class, condition="CONTRATO_CURSO_MONTO=?")
    List<TnCapContratoCur> findByContratoCursoMonto(java.lang.Double contratoCursoMonto);

    /**
     * Find the first TnCapContratoCur entity that matches the condition 'where contratoCursoRep2 is equals to'.
     *
     * @param contratoCursoRep2 java.lang.String
     * @return TnCapContratoCur
     */
    @FindByCondition(value=TnCapContratoCur.class, condition="CONTRATO_CURSO_REP2=?")
    TnCapContratoCur getByContratoCursoRep2(java.lang.String contratoCursoRep2);

    /**
     * Find all TnCapContratoCur entities that matches the condition 'where contratoCursoRep2 is equals to'.
     *
     * @param contratoCursoRep2 java.lang.String
     * @return Collection of TnCapContratoCur
     */
    @FindByCondition(value=TnCapContratoCur.class, condition="CONTRATO_CURSO_REP2=?")
    List<TnCapContratoCur> findByContratoCursoRep2(java.lang.String contratoCursoRep2);

    /**
     * Find the first TnCapContratoCur entity that matches the condition 'where contratoCursoRep3 is equals to'.
     *
     * @param contratoCursoRep3 java.lang.String
     * @return TnCapContratoCur
     */
    @FindByCondition(value=TnCapContratoCur.class, condition="CONTRATO_CURSO_REP3=?")
    TnCapContratoCur getByContratoCursoRep3(java.lang.String contratoCursoRep3);

    /**
     * Find all TnCapContratoCur entities that matches the condition 'where contratoCursoRep3 is equals to'.
     *
     * @param contratoCursoRep3 java.lang.String
     * @return Collection of TnCapContratoCur
     */
    @FindByCondition(value=TnCapContratoCur.class, condition="CONTRATO_CURSO_REP3=?")
    List<TnCapContratoCur> findByContratoCursoRep3(java.lang.String contratoCursoRep3);
}