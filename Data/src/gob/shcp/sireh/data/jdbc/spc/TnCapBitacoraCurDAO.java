package gob.shcp.sireh.data.jdbc.spc;

import gob.shcp.fsn.data.annotation.Delete;
import gob.shcp.fsn.data.annotation.FindAll;
import gob.shcp.fsn.data.annotation.FindByCondition;
import gob.shcp.fsn.data.annotation.FindById;
import gob.shcp.fsn.data.annotation.Save;
import gob.shcp.fsn.service.data.orm.JdbcDataService;

import java.util.List;

import gob.shcp.sireh.domain.jdbc.spc.TnCapBitacoraCur;

/**
 * Data access interface for TnCapBitacoraCurso.
 */
public interface TnCapBitacoraCurDAO extends JdbcDataService {
    /**
     * Find TnCapBitacoraCurso entity by its identifier or primary key value.
     *
     * @param id identifier or primary key
     * @return TnCapBitacoraCurso
     */
    @FindById(TnCapBitacoraCur.class)
    TnCapBitacoraCur getById(java.lang.Long id);

    /**
     * Get all TnCapBitacoraCurso entities limited by a maximum number of elements.
     *
     * @return Collection of TnCapBitacoraCurso
     */
    @FindAll(TnCapBitacoraCur.class)
    List<TnCapBitacoraCur> findAll();

    /**
     * Make persistence of TnCapBitacoraCurso entities. If its identifier or primary key is null then create else update.
     *
     * @param entity TnCapBitacoraCurso
     */
    @Save
    void save(TnCapBitacoraCur entity);

    /**
     * Remove TnCapBitacoraCurso entities.
     *
     * @param entity TnCapBitacoraCurso
     */
    @Delete
    void delete(TnCapBitacoraCur entity);

}
