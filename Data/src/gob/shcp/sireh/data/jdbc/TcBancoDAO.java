package gob.shcp.sireh.data.jdbc;

import gob.shcp.fsn.data.annotation.Delete;
import gob.shcp.fsn.data.annotation.FindAll;
import gob.shcp.fsn.data.annotation.FindByCondition;
import gob.shcp.fsn.data.annotation.FindById;
import gob.shcp.fsn.data.annotation.Save;
import gob.shcp.fsn.service.data.orm.JdbcDataService;

import java.util.List;

import gob.shcp.sireh.domain.jdbc.TcBanco;

/**
 * Data access interface for TcBanco.
 */
public interface TcBancoDAO extends JdbcDataService {
    /**
     * Find TcBanco entity by its identifier or primary key value.
     *
     * @param id identifier or primary key
     * @return TcBanco
     */
    @FindById(TcBanco.class)
    TcBanco getById(java.lang.String id);

    /**
     * Get all TcBanco entities limited by a maximum number of elements.
     *
     * @return Collection of TcBanco
     */
    @FindAll(TcBanco.class)
    List<TcBanco> findAll();

    /**
     * Make persistence of TcBanco entities. If its identifier or primary key is null then create else update.
     *
     * @param entity TcBanco
     */
    @Save
    void save(TcBanco entity);

    /**
     * Remove TcBanco entities.
     *
     * @param entity TcBanco
     */
    @Delete
    void delete(TcBanco entity);


    /**
     * Find the first TcBanco entity that matches the condition 'where fecModifico is equals to'.
     *
     * @param fecModifico java.util.Date
     * @return TcBanco
     */
    @FindByCondition(value = TcBanco.class, condition = "FEC_MODIFICO=?")
    TcBanco getByFecModifico(java.util.Date fecModifico);

    /**
     * Find all TcBanco entities that matches the condition 'where fecModifico is equals to'.
     *
     * @param fecModifico java.util.Date
     * @return Collection of TcBanco
     */
    @FindByCondition(value = TcBanco.class, condition = "FEC_MODIFICO=?")
    List<TcBanco> findByFecModifico(java.util.Date fecModifico);

    /**
     * Find the first TcBanco entity that matches the condition 'where usuario is equals to'.
     *
     * @param usuario java.lang.String
     * @return TcBanco
     */
    @FindByCondition(value = TcBanco.class, condition = "USUARIO=?")
    TcBanco getByUsuario(java.lang.String usuario);

    /**
     * Find all TcBanco entities that matches the condition 'where usuario is equals to'.
     *
     * @param usuario java.lang.String
     * @return Collection of TcBanco
     */
    @FindByCondition(value = TcBanco.class, condition = "USUARIO=?")
    List<TcBanco> findByUsuario(java.lang.String usuario);

    /**
     * Find the first TcBanco entity that matches the condition 'where descBancos is equals to'.
     *
     * @param descBancos java.lang.String
     * @return TcBanco
     */
    @FindByCondition(value = TcBanco.class, condition = "DESC_BANCOS=?")
    TcBanco getByDescBancos(java.lang.String descBancos);

    /**
     * Find all TcBanco entities that matches the condition 'where descBancos is equals to'.
     *
     * @param descBancos java.lang.String
     * @return Collection of TcBanco
     */
    @FindByCondition(value = TcBanco.class, condition = "DESC_BANCOS=?")
    List<TcBanco> findByDescBancos(java.lang.String descBancos);

    /**
     * Find the first TcBanco entity that matches the condition 'where idReceptor is equals to'.
     *
     * @param idReceptor java.lang.String
     * @return TcBanco
     */
    @FindByCondition(value = TcBanco.class, condition = "ID_RECEPTOR=?")
    TcBanco getByIdReceptor(java.lang.String idReceptor);

    /**
     * Find all TcBanco entities that matches the condition 'where idReceptor is equals to'.
     *
     * @param idReceptor java.lang.String
     * @return Collection of TcBanco
     */
    @FindByCondition(value = TcBanco.class, condition = "ID_RECEPTOR=?")
    List<TcBanco> findByIdReceptor(java.lang.String idReceptor);
}
