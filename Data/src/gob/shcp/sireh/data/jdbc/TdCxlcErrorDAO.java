package gob.shcp.sireh.data.jdbc;

import gob.shcp.fsn.data.annotation.Delete;
import gob.shcp.fsn.data.annotation.FindAll;
import gob.shcp.fsn.data.annotation.FindByCondition;
import gob.shcp.fsn.data.annotation.FindById;
import gob.shcp.fsn.data.annotation.Save;
import gob.shcp.fsn.service.data.orm.JdbcDataService;

import java.util.List;

import gob.shcp.sireh.domain.jdbc.TdCxlcError;


/**
 * Data access interface for TdCxlcError.
 */
public interface TdCxlcErrorDAO extends JdbcDataService {
    /**
     * Find TdCxlcError entity by its identifier or primary key value.
     *
     * @param id identifier or primary key
     * @return TdCxlcError
     */
    @FindById(TdCxlcError.class)
    TdCxlcError getById(gob.shcp.sireh.domain.jdbc.TdCxlcErrorPK id);
    
    /**
     * Get all TdCxlcError entities limited by a maximum number of elements.
     *
     * @return Collection of TdCxlcError
     */
    @FindAll(TdCxlcError.class)
    List<TdCxlcError> findAll();
    
    /**
     * Make persistence of TdCxlcError entities. If its identifier or primary key is null then create else update.
     *
     * @param entity TdCxlcError
     */
    @Save
    void save(TdCxlcError entity);
    
    /**
     * Remove TdCxlcError entities.
     *
     * @param entity TdCxlcError
     */
    @Delete
    void delete(TdCxlcError entity);


    /**
     * Find the first TdCxlcError entity that matches the condition 'where fecModifico is equals to'.
     *
     * @param fecModifico java.util.Date
     * @return TdCxlcError
     */
    @FindByCondition(value=TdCxlcError.class, condition="FEC_MODIFICO=?")
    TdCxlcError getByFecModifico(java.util.Date fecModifico);

    /**
     * Find all TdCxlcError entities that matches the condition 'where fecModifico is equals to'.
     *
     * @param fecModifico java.util.Date
     * @return Collection of TdCxlcError
     */
    @FindByCondition(value=TdCxlcError.class, condition="FEC_MODIFICO=?")
    List<TdCxlcError> findByFecModifico(java.util.Date fecModifico);

    /**
     * Find the first TdCxlcError entity that matches the condition 'where usuario is equals to'.
     *
     * @param usuario java.lang.String
     * @return TdCxlcError
     */
    @FindByCondition(value=TdCxlcError.class, condition="USUARIO=?")
    TdCxlcError getByUsuario(java.lang.String usuario);

    /**
     * Find all TdCxlcError entities that matches the condition 'where usuario is equals to'.
     *
     * @param usuario java.lang.String
     * @return Collection of TdCxlcError
     */
    @FindByCondition(value=TdCxlcError.class, condition="USUARIO=?")
    List<TdCxlcError> findByUsuario(java.lang.String usuario);

    /**
     * Find the first TdCxlcError entity that matches the condition 'where ceMonto is equals to'.
     *
     * @param ceMonto java.lang.Double
     * @return TdCxlcError
     */
    @FindByCondition(value=TdCxlcError.class, condition="CE_MONTO=?")
    TdCxlcError getByCeMonto(java.lang.Double ceMonto);

    /**
     * Find all TdCxlcError entities that matches the condition 'where ceMonto is equals to'.
     *
     * @param ceMonto java.lang.Double
     * @return Collection of TdCxlcError
     */
    @FindByCondition(value=TdCxlcError.class, condition="CE_MONTO=?")
    List<TdCxlcError> findByCeMonto(java.lang.Double ceMonto);

    /**
     * Find the first TdCxlcError entity that matches the condition 'where ceRevisado is equals to'.
     *
     * @param ceRevisado java.lang.Boolean
     * @return TdCxlcError
     */
    @FindByCondition(value=TdCxlcError.class, condition="CE_REVISADO=?")
    TdCxlcError getByCeRevisado(java.lang.Boolean ceRevisado);

    /**
     * Find all TdCxlcError entities that matches the condition 'where ceRevisado is equals to'.
     *
     * @param ceRevisado java.lang.Boolean
     * @return Collection of TdCxlcError
     */
    @FindByCondition(value=TdCxlcError.class, condition="CE_REVISADO=?")
    List<TdCxlcError> findByCeRevisado(java.lang.Boolean ceRevisado);
}