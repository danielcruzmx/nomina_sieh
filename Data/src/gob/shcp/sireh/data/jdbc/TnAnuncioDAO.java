package gob.shcp.sireh.data.jdbc;

import gob.shcp.fsn.data.annotation.Delete;
import gob.shcp.fsn.data.annotation.FindAll;
import gob.shcp.fsn.data.annotation.FindByCondition;
import gob.shcp.fsn.data.annotation.FindById;
import gob.shcp.fsn.data.annotation.Save;
import gob.shcp.fsn.service.data.orm.JdbcDataService;

import java.util.List;

import gob.shcp.sireh.domain.jdbc.TnAnuncio;


/**
 * Data access interface for TnAnuncio.
 */
public interface TnAnuncioDAO extends JdbcDataService {
    /**
     * Find TnAnuncio entity by its identifier or primary key value.
     *
     * @param id identifier or primary key
     * @return TnAnuncio
     */
    @FindById(TnAnuncio.class)
    TnAnuncio getById(java.lang.Integer id);
    
    /**
     * Get all TnAnuncio entities limited by a maximum number of elements.
     *
     * @return Collection of TnAnuncio
     */
    @FindAll(TnAnuncio.class)
    List<TnAnuncio> findAll();
    
    /**
     * Make persistence of TnAnuncio entities. If its identifier or primary key is null then create else update.
     *
     * @param entity TnAnuncio
     */
    @Save
    void save(TnAnuncio entity);
    
    /**
     * Remove TnAnuncio entities.
     *
     * @param entity TnAnuncio
     */
    @Delete
    void delete(TnAnuncio entity);


    /**
     * Find the first TnAnuncio entity that matches the condition 'where fecModifico is equals to'.
     *
     * @param fecModifico java.util.Date
     * @return TnAnuncio
     */
    @FindByCondition(value=TnAnuncio.class, condition="FEC_MODIFICO=?")
    TnAnuncio getByFecModifico(java.util.Date fecModifico);

    /**
     * Find all TnAnuncio entities that matches the condition 'where fecModifico is equals to'.
     *
     * @param fecModifico java.util.Date
     * @return Collection of TnAnuncio
     */
    @FindByCondition(value=TnAnuncio.class, condition="FEC_MODIFICO=?")
    List<TnAnuncio> findByFecModifico(java.util.Date fecModifico);

    /**
     * Find the first TnAnuncio entity that matches the condition 'where idStatus is equals to'.
     *
     * @param idStatus java.lang.String
     * @return TnAnuncio
     */
    @FindByCondition(value=TnAnuncio.class, condition="ID_STATUS=?")
    TnAnuncio getByIdStatus(java.lang.String idStatus);

    /**
     * Find all TnAnuncio entities that matches the condition 'where idStatus is equals to'.
     *
     * @param idStatus java.lang.String
     * @return Collection of TnAnuncio
     */
    @FindByCondition(value=TnAnuncio.class, condition="ID_STATUS=?")
    List<TnAnuncio> findByIdStatus(java.lang.String idStatus);

    /**
     * Find the first TnAnuncio entity that matches the condition 'where msgAnuncio is equals to'.
     *
     * @param msgAnuncio java.lang.String
     * @return TnAnuncio
     */
    @FindByCondition(value=TnAnuncio.class, condition="MSG_ANUNCIO=?")
    TnAnuncio getByMsgAnuncio(java.lang.String msgAnuncio);

    /**
     * Find all TnAnuncio entities that matches the condition 'where msgAnuncio is equals to'.
     *
     * @param msgAnuncio java.lang.String
     * @return Collection of TnAnuncio
     */
    @FindByCondition(value=TnAnuncio.class, condition="MSG_ANUNCIO=?")
    List<TnAnuncio> findByMsgAnuncio(java.lang.String msgAnuncio);

    /**
     * Find the first TnAnuncio entity that matches the condition 'where tituloAnuncio is equals to'.
     *
     * @param tituloAnuncio java.lang.String
     * @return TnAnuncio
     */
    @FindByCondition(value=TnAnuncio.class, condition="TITULO_ANUNCIO=?")
    TnAnuncio getByTituloAnuncio(java.lang.String tituloAnuncio);

    /**
     * Find all TnAnuncio entities that matches the condition 'where tituloAnuncio is equals to'.
     *
     * @param tituloAnuncio java.lang.String
     * @return Collection of TnAnuncio
     */
    @FindByCondition(value=TnAnuncio.class, condition="TITULO_ANUNCIO=?")
    List<TnAnuncio> findByTituloAnuncio(java.lang.String tituloAnuncio);

    /**
     * Find the first TnAnuncio entity that matches the condition 'where usuario is equals to'.
     *
     * @param usuario java.lang.String
     * @return TnAnuncio
     */
    @FindByCondition(value=TnAnuncio.class, condition="USUARIO=?")
    TnAnuncio getByUsuario(java.lang.String usuario);

    /**
     * Find all TnAnuncio entities that matches the condition 'where usuario is equals to'.
     *
     * @param usuario java.lang.String
     * @return Collection of TnAnuncio
     */
    @FindByCondition(value=TnAnuncio.class, condition="USUARIO=?")
    List<TnAnuncio> findByUsuario(java.lang.String usuario);
}