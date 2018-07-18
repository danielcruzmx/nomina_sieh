package gob.shcp.sireh.data.jdbc.nomina.terceros;

import gob.shcp.fsn.data.annotation.Delete;
import gob.shcp.fsn.data.annotation.FindAll;

import gob.shcp.fsn.data.annotation.FindById;
import gob.shcp.fsn.data.annotation.Save;
import gob.shcp.fsn.service.data.orm.JdbcDataService;

import java.util.List;


import gob.shcp.sireh.domain.jdbc.nomina.terceros.TnComprobantePdf;


/**
 * Data access interface for TnComprobantePdf.
 */
public interface TnComprobantePdfDAO extends JdbcDataService {
    /**
     * Find TnComprobantePdf entity by its identifier or primary key value.
     *
     * @param id identifier or primary key
     * @return TnComprobantePdf
     */
    @FindById(TnComprobantePdf.class)
    TnComprobantePdf getById(gob.shcp.sireh.domain.jdbc.nomina.terceros.TnComprobantePdfPK id);
    
    /**
     * Get all TnComprobantePdf entities limited by a maximum number of elements.
     *
     * @return Collection of TnComprobantePdf
     */
    @FindAll(TnComprobantePdf.class)
    List<TnComprobantePdf> findAll();
    
    /**
     * Make persistence of TnComprobantePdf entities. If its identifier or primary key is null then create else update.
     *
     * @param entity TnComprobantePdf
     */
    @Save
    void save(TnComprobantePdf entity);
    
    /**
     * Remove TnComprobantePdf entities.
     *
     * @param entity TnComprobantePdf
     */
    @Delete
    void delete(TnComprobantePdf entity);

}