package gob.shcp.sireh.data.jdbc.spc;

import gob.shcp.fsn.data.annotation.Delete;
import gob.shcp.fsn.data.annotation.FindAll;
import gob.shcp.fsn.data.annotation.FindByCondition;
import gob.shcp.fsn.data.annotation.FindById;
import gob.shcp.fsn.data.annotation.Save;
import gob.shcp.fsn.service.data.orm.JdbcDataService;

import java.util.List;

import gob.shcp.sireh.domain.jdbc.spc.TcCapNotifCurso;


/**
 * Data access interface for TcCapNotifCurso.
 */
public interface TcCapNotifCursoDAO extends JdbcDataService {
    /**
     * Find TcCapNotifCurso entity by its identifier or primary key value.
     *
     * @param id identifier or primary key
     * @return TcCapNotifCurso
     */
    @FindById(TcCapNotifCurso.class)
    TcCapNotifCurso getById(gob.shcp.sireh.domain.jdbc.spc.TcCapNotifCursoPK id);
    
    /**
     * Get all TcCapNotifCurso entities limited by a maximum number of elements.
     *
     * @return Collection of TcCapNotifCurso
     */
    @FindAll(TcCapNotifCurso.class)
    List<TcCapNotifCurso> findAll();
    
    /**
     * Make persistence of TcCapNotifCurso entities. If its identifier or primary key is null then create else update.
     *
     * @param entity TcCapNotifCurso
     */
    @Save
    void save(TcCapNotifCurso entity);
    
    /**
     * Remove TcCapNotifCurso entities.
     *
     * @param entity TcCapNotifCurso
     */
    @Delete
    void delete(TcCapNotifCurso entity);


    /**
     * Find the first TcCapNotifCurso entity that matches the condition 'where capNotifCursoAsunto is equals to'.
     *
     * @param capNotifCursoAsunto java.lang.String
     * @return TcCapNotifCurso
     */
    @FindByCondition(value=TcCapNotifCurso.class, condition="CAP_NOTIF_CURSO_ASUNTO=?")
    TcCapNotifCurso getByCapNotifCursoAsunto(java.lang.String capNotifCursoAsunto);

    /**
     * Find all TcCapNotifCurso entities that matches the condition 'where capNotifCursoAsunto is equals to'.
     *
     * @param capNotifCursoAsunto java.lang.String
     * @return Collection of TcCapNotifCurso
     */
    @FindByCondition(value=TcCapNotifCurso.class, condition="CAP_NOTIF_CURSO_ASUNTO=?")
    List<TcCapNotifCurso> findByCapNotifCursoAsunto(java.lang.String capNotifCursoAsunto);

    /**
     * Find the first TcCapNotifCurso entity that matches the condition 'where capNotifCursoMsg is equals to'.
     *
     * @param capNotifCursoMsg java.lang.String
     * @return TcCapNotifCurso
     */
    @FindByCondition(value=TcCapNotifCurso.class, condition="CAP_NOTIF_CURSO_MSG=?")
    TcCapNotifCurso getByCapNotifCursoMsg(java.lang.String capNotifCursoMsg);

    /**
     * Find all TcCapNotifCurso entities that matches the condition 'where capNotifCursoMsg is equals to'.
     *
     * @param capNotifCursoMsg java.lang.String
     * @return Collection of TcCapNotifCurso
     */
    @FindByCondition(value=TcCapNotifCurso.class, condition="CAP_NOTIF_CURSO_MSG=?")
    List<TcCapNotifCurso> findByCapNotifCursoMsg(java.lang.String capNotifCursoMsg);

    /**
     * Find the first TcCapNotifCurso entity that matches the condition 'where fecModifico is equals to'.
     *
     * @param fecModifico java.util.Date
     * @return TcCapNotifCurso
     */
    @FindByCondition(value=TcCapNotifCurso.class, condition="FEC_MODIFICO=?")
    TcCapNotifCurso getByFecModifico(java.util.Date fecModifico);

    /**
     * Find all TcCapNotifCurso entities that matches the condition 'where fecModifico is equals to'.
     *
     * @param fecModifico java.util.Date
     * @return Collection of TcCapNotifCurso
     */
    @FindByCondition(value=TcCapNotifCurso.class, condition="FEC_MODIFICO=?")
    List<TcCapNotifCurso> findByFecModifico(java.util.Date fecModifico);

    /**
     * Find the first TcCapNotifCurso entity that matches the condition 'where idStatus is equals to'.
     *
     * @param idStatus java.lang.String
     * @return TcCapNotifCurso
     */
    @FindByCondition(value=TcCapNotifCurso.class, condition="ID_STATUS=?")
    TcCapNotifCurso getByIdStatus(java.lang.String idStatus);

    /**
     * Find all TcCapNotifCurso entities that matches the condition 'where idStatus is equals to'.
     *
     * @param idStatus java.lang.String
     * @return Collection of TcCapNotifCurso
     */
    @FindByCondition(value=TcCapNotifCurso.class, condition="ID_STATUS=?")
    List<TcCapNotifCurso> findByIdStatus(java.lang.String idStatus);

    /**
     * Find the first TcCapNotifCurso entity that matches the condition 'where usuario is equals to'.
     *
     * @param usuario java.lang.String
     * @return TcCapNotifCurso
     */
    @FindByCondition(value=TcCapNotifCurso.class, condition="USUARIO=?")
    TcCapNotifCurso getByUsuario(java.lang.String usuario);

    /**
     * Find all TcCapNotifCurso entities that matches the condition 'where usuario is equals to'.
     *
     * @param usuario java.lang.String
     * @return Collection of TcCapNotifCurso
     */
    @FindByCondition(value=TcCapNotifCurso.class, condition="USUARIO=?")
    List<TcCapNotifCurso> findByUsuario(java.lang.String usuario);
}