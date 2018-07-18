package gob.shcp.sireh.data.jdbc.spc;

import gob.shcp.fsn.data.annotation.Delete;
import gob.shcp.fsn.data.annotation.FindAll;
import gob.shcp.fsn.data.annotation.FindByCondition;
import gob.shcp.fsn.data.annotation.FindById;
import gob.shcp.fsn.data.annotation.Save;
import gob.shcp.fsn.service.data.orm.JdbcDataService;

import java.util.List;

import gob.shcp.sireh.domain.jdbc.spc.TcCapMotivoDesasignaInstr;

/**
 * Data access interface for TcCapMotivoDesasignaInstr.
 */
public interface TcCapMotivoDesasignaInstrDAO extends JdbcDataService {
    /**
     * Find TcCapMotivoDesasignaInstr entity by its identifier or primary key value.
     *
     * @param id identifier or primary key
     * @return TcCapMotivoDesasignaInstr
     */
    @FindById(TcCapMotivoDesasignaInstr.class)
    TcCapMotivoDesasignaInstr getById(java.lang.Integer id);

    /**
     * Get all TcCapMotivoDesasignaInstr entities limited by a maximum number of elements.
     *
     * @return Collection of TcCapMotivoDesasignaInstr
     */
    @FindAll(TcCapMotivoDesasignaInstr.class)
    List<TcCapMotivoDesasignaInstr> findAll();

    /**
     * Make persistence of TcCapMotivoDesasignaInstr entities. If its identifier or primary key is null then create else update.
     *
     * @param entity TcCapMotivoDesasignaInstr
     */
    @Save
    void save(TcCapMotivoDesasignaInstr entity);

    /**
     * Remove TcCapMotivoDesasignaInstr entities.
     *
     * @param entity TcCapMotivoDesasignaInstr
     */
    @Delete
    void delete(TcCapMotivoDesasignaInstr entity);


    /**
     * Find the first TcCapMotivoDesasignaInstr entity that matches the condition 'where descMotivoDesasignaInstr is equals to'.
     *
     * @param descMotivoDesasignaInstr java.lang.String
     * @return TcCapMotivoDesasignaInstr
     */
    @FindByCondition(value = TcCapMotivoDesasignaInstr.class, condition = "DESC_MOTIVO_DESASIGNA_INSTR=?")
    TcCapMotivoDesasignaInstr getByDescMotivoDesasignaInstr(java.lang.String descMotivoDesasignaInstr);

    /**
     * Find all TcCapMotivoDesasignaInstr entities that matches the condition 'where descMotivoDesasignaInstr is equals to'.
     *
     * @param descMotivoDesasignaInstr java.lang.String
     * @return Collection of TcCapMotivoDesasignaInstr
     */
    @FindByCondition(value = TcCapMotivoDesasignaInstr.class, condition = "DESC_MOTIVO_DESASIGNA_INSTR=?")
    List<TcCapMotivoDesasignaInstr> findByDescMotivoDesasignaInstr(java.lang.String descMotivoDesasignaInstr);

    /**
     * Find the first TcCapMotivoDesasignaInstr entity that matches the condition 'where fecModifico is equals to'.
     *
     * @param fecModifico java.util.Date
     * @return TcCapMotivoDesasignaInstr
     */
    @FindByCondition(value = TcCapMotivoDesasignaInstr.class, condition = "FEC_MODIFICO=?")
    TcCapMotivoDesasignaInstr getByFecModifico(java.util.Date fecModifico);

    /**
     * Find all TcCapMotivoDesasignaInstr entities that matches the condition 'where fecModifico is equals to'.
     *
     * @param fecModifico java.util.Date
     * @return Collection of TcCapMotivoDesasignaInstr
     */
    @FindByCondition(value = TcCapMotivoDesasignaInstr.class, condition = "FEC_MODIFICO=?")
    List<TcCapMotivoDesasignaInstr> findByFecModifico(java.util.Date fecModifico);

    /**
     * Find the first TcCapMotivoDesasignaInstr entity that matches the condition 'where idStatus is equals to'.
     *
     * @param idStatus java.lang.String
     * @return TcCapMotivoDesasignaInstr
     */
    @FindByCondition(value = TcCapMotivoDesasignaInstr.class, condition = "ID_STATUS=?")
    TcCapMotivoDesasignaInstr getByIdStatus(java.lang.String idStatus);

    /**
     * Find all TcCapMotivoDesasignaInstr entities that matches the condition 'where idStatus is equals to'.
     *
     * @param idStatus java.lang.String
     * @return Collection of TcCapMotivoDesasignaInstr
     */
    @FindByCondition(value = TcCapMotivoDesasignaInstr.class, condition = "ID_STATUS=?")
    List<TcCapMotivoDesasignaInstr> findByIdStatus(java.lang.String idStatus);

    /**
     * Find the first TcCapMotivoDesasignaInstr entity that matches the condition 'where usuario is equals to'.
     *
     * @param usuario java.lang.String
     * @return TcCapMotivoDesasignaInstr
     */
    @FindByCondition(value = TcCapMotivoDesasignaInstr.class, condition = "USUARIO=?")
    TcCapMotivoDesasignaInstr getByUsuario(java.lang.String usuario);

    /**
     * Find all TcCapMotivoDesasignaInstr entities that matches the condition 'where usuario is equals to'.
     *
     * @param usuario java.lang.String
     * @return Collection of TcCapMotivoDesasignaInstr
     */
    @FindByCondition(value = TcCapMotivoDesasignaInstr.class, condition = "USUARIO=?")
    List<TcCapMotivoDesasignaInstr> findByUsuario(java.lang.String usuario);
}
