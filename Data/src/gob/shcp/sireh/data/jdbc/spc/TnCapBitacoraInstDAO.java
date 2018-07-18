package gob.shcp.sireh.data.jdbc.spc;

import gob.shcp.fsn.data.annotation.Delete;
import gob.shcp.fsn.data.annotation.FindAll;
import gob.shcp.fsn.data.annotation.FindByCondition;
import gob.shcp.fsn.data.annotation.FindById;
import gob.shcp.fsn.data.annotation.Save;
import gob.shcp.fsn.service.data.orm.JdbcDataService;

import java.util.List;

import gob.shcp.sireh.domain.jdbc.spc.TnCapBitacoraInst;


/**
 * Data access interface for TnCapBitacoraInstr.
 */
public interface TnCapBitacoraInstDAO extends JdbcDataService {
    /**
     * Find TnCapBitacoraInstr entity by its identifier or primary key value.
     *
     * @param id identifier or primary key
     * @return TnCapBitacoraInstr
     */
    @FindById(TnCapBitacoraInst.class)
    TnCapBitacoraInst getById(java.lang.Long id);

    /**
     * Get all TnCapBitacoraInstr entities limited by a maximum number of elements.
     *
     * @return Collection of TnCapBitacoraInstr
     */
    @FindAll(TnCapBitacoraInst.class)
    List<TnCapBitacoraInst> findAll();

    /**
     * Make persistence of TnCapBitacoraInstr entities. If its identifier or primary key is null then create else update.
     *
     * @param entity TnCapBitacoraInstr
     */
    @Save
    void save(TnCapBitacoraInst entity);

    /**
     * Remove TnCapBitacoraInstr entities.
     *
     * @param entity TnCapBitacoraInstr
     */
    @Delete
    void delete(TnCapBitacoraInst entity);


    /**
     * Find the first TnCapBitacoraInstr entity that matches the condition 'where fecModifico is equals to'.
     *
     * @param fecModifico java.util.Date
     * @return TnCapBitacoraInstr
     */
    @FindByCondition(value = TnCapBitacoraInst.class, condition = "FEC_MODIFICO=?")
    TnCapBitacoraInst getByFecModifico(java.util.Date fecModifico);

    /**
     * Find all TnCapBitacoraInstr entities that matches the condition 'where fecModifico is equals to'.
     *
     * @param fecModifico java.util.Date
     * @return Collection of TnCapBitacoraInstr
     */
    @FindByCondition(value = TnCapBitacoraInst.class, condition = "FEC_MODIFICO=?")
    List<TnCapBitacoraInst> findByFecModifico(java.util.Date fecModifico);

    /**
     * Find the first TnCapBitacoraInstr entity that matches the condition 'where usuario is equals to'.
     *
     * @param usuario java.lang.String
     * @return TnCapBitacoraInstr
     */
    @FindByCondition(value = TnCapBitacoraInst.class, condition = "USUARIO=?")
    TnCapBitacoraInst getByUsuario(java.lang.String usuario);

    /**
     * Find all TnCapBitacoraInstr entities that matches the condition 'where usuario is equals to'.
     *
     * @param usuario java.lang.String
     * @return Collection of TnCapBitacoraInstr
     */
    @FindByCondition(value = TnCapBitacoraInst.class, condition = "USUARIO=?")
    List<TnCapBitacoraInst> findByUsuario(java.lang.String usuario);

    /**
     * Find the first TnCapBitacoraInstr entity that matches the condition 'where idCurso is equals to'.
     *
     * @param idCurso java.lang.Integer
     * @return TnCapBitacoraInstr
     */
    @FindByCondition(value = TnCapBitacoraInst.class, condition = "ID_CURSO=?")
    TnCapBitacoraInst getByIdCurso(java.lang.Integer idCurso);

    /**
     * Find all TnCapBitacoraInstr entities that matches the condition 'where idCurso is equals to'.
     *
     * @param idCurso java.lang.Integer
     * @return Collection of TnCapBitacoraInstr
     */
    @FindByCondition(value = TnCapBitacoraInst.class, condition = "ID_CURSO=?")
    List<TnCapBitacoraInst> findByIdCurso(java.lang.Integer idCurso);

    /**
     * Find the first TnCapBitacoraInstr entity that matches the condition 'where idInstrSup is equals to'.
     *
     * @param idInstrSup java.lang.Integer
     * @return TnCapBitacoraInstr
     */
    @FindByCondition(value = TnCapBitacoraInst.class, condition = "ID_INSTR_SUP=?")
    TnCapBitacoraInst getByIdInstrSup(java.lang.Integer idInstrSup);

    /**
     * Find all TnCapBitacoraInstr entities that matches the condition 'where idInstrSup is equals to'.
     *
     * @param idInstrSup java.lang.Integer
     * @return Collection of TnCapBitacoraInstr
     */
    @FindByCondition(value = TnCapBitacoraInst.class, condition = "ID_INSTR_SUP=?")
    List<TnCapBitacoraInst> findByIdInstrSup(java.lang.Integer idInstrSup);

    /**
     * Find the first TnCapBitacoraInstr entity that matches the condition 'where idInstrTit is equals to'.
     *
     * @param idInstrTit java.lang.Integer
     * @return TnCapBitacoraInstr
     */
    @FindByCondition(value = TnCapBitacoraInst.class, condition = "ID_INSTR_TIT=?")
    TnCapBitacoraInst getByIdInstrTit(java.lang.Integer idInstrTit);

    /**
     * Find all TnCapBitacoraInstr entities that matches the condition 'where idInstrTit is equals to'.
     *
     * @param idInstrTit java.lang.Integer
     * @return Collection of TnCapBitacoraInstr
     */
    @FindByCondition(value = TnCapBitacoraInst.class, condition = "ID_INSTR_TIT=?")
    List<TnCapBitacoraInst> findByIdInstrTit(java.lang.Integer idInstrTit);
}
