package gob.shcp.sireh.data.jdbc.spc;

import gob.shcp.fsn.data.annotation.Delete;
import gob.shcp.fsn.data.annotation.FindAll;
import gob.shcp.fsn.data.annotation.FindByCondition;
import gob.shcp.fsn.data.annotation.FindById;
import gob.shcp.fsn.data.annotation.Save;
import gob.shcp.fsn.service.data.orm.JdbcDataService;

import java.util.List;

import gob.shcp.sireh.domain.jdbc.spc.TcCapAula;


/**
 * Data access interface for TcCapAula.
 */
public interface TcCapAulaDAO extends JdbcDataService {
    /**
     * Find TcCapAula entity by its identifier or primary key value.
     *
     * @param id identifier or primary key
     * @return TcCapAula
     */
    @FindById(TcCapAula.class)
    TcCapAula getById(java.lang.String id);

    /**
     * Get all TcCapAula entities limited by a maximum number of elements.
     *
     * @return Collection of TcCapAula
     */
    @FindAll(TcCapAula.class)
    List<TcCapAula> findAll();

    /**
     * Make persistence of TcCapAula entities. If its identifier or primary key is null then create else update.
     *
     * @param entity TcCapAula
     */
    @Save
    void save(TcCapAula entity);

    /**
     * Remove TcCapAula entities.
     *
     * @param entity TcCapAula
     */
    @Delete
    void delete(TcCapAula entity);


    /**
     * Find the first TcCapAula entity that matches the condition 'where cupoMaximoAula is equals to'.
     *
     * @param cupoMaximoAula int
     * @return TcCapAula
     */
    @FindByCondition(value = TcCapAula.class, condition = "CUPO_MAXIMO_AULA=?")
    TcCapAula getByCupoMaximoAula(int cupoMaximoAula);

    /**
     * Find all TcCapAula entities that matches the condition 'where cupoMaximoAula is equals to'.
     *
     * @param cupoMaximoAula int
     * @return Collection of TcCapAula
     */
    @FindByCondition(value = TcCapAula.class, condition = "CUPO_MAXIMO_AULA=?")
    List<TcCapAula> findByCupoMaximoAula(int cupoMaximoAula);

    /**
     * Find the first TcCapAula entity that matches the condition 'where descAula is equals to'.
     *
     * @param descAula java.lang.String
     * @return TcCapAula
     */
    @FindByCondition(value = TcCapAula.class, condition = "DESC_AULA=?")
    TcCapAula getByDescAula(java.lang.String descAula);

    /**
     * Find all TcCapAula entities that matches the condition 'where descAula is equals to'.
     *
     * @param descAula java.lang.String
     * @return Collection of TcCapAula
     */
    @FindByCondition(value = TcCapAula.class, condition = "DESC_AULA=?")
    List<TcCapAula> findByDescAula(java.lang.String descAula);

    /**
     * Find the first TcCapAula entity that matches the condition 'where fecModifico is equals to'.
     *
     * @param fecModifico java.util.Date
     * @return TcCapAula
     */
    @FindByCondition(value = TcCapAula.class, condition = "FEC_MODIFICO=?")
    TcCapAula getByFecModifico(java.util.Date fecModifico);

    /**
     * Find all TcCapAula entities that matches the condition 'where fecModifico is equals to'.
     *
     * @param fecModifico java.util.Date
     * @return Collection of TcCapAula
     */
    @FindByCondition(value = TcCapAula.class, condition = "FEC_MODIFICO=?")
    List<TcCapAula> findByFecModifico(java.util.Date fecModifico);

    /**
     * Find the first TcCapAula entity that matches the condition 'where idStatus is equals to'.
     *
     * @param idStatus java.lang.String
     * @return TcCapAula
     */
    @FindByCondition(value = TcCapAula.class, condition = "ID_STATUS=?")
    TcCapAula getByIdStatus(java.lang.String idStatus);

    /**
     * Find all TcCapAula entities that matches the condition 'where idStatus is equals to'.
     *
     * @param idStatus java.lang.String
     * @return Collection of TcCapAula
     */
    @FindByCondition(value = TcCapAula.class, condition = "ID_STATUS=?")
    List<TcCapAula> findByIdStatus(java.lang.String idStatus);

    /**
     * Find the first TcCapAula entity that matches the condition 'where usuario is equals to'.
     *
     * @param usuario java.lang.String
     * @return TcCapAula
     */
    @FindByCondition(value = TcCapAula.class, condition = "USUARIO=?")
    TcCapAula getByUsuario(java.lang.String usuario);

    /**
     * Find all TcCapAula entities that matches the condition 'where usuario is equals to'.
     *
     * @param usuario java.lang.String
     * @return Collection of TcCapAula
     */
    @FindByCondition(value = TcCapAula.class, condition = "USUARIO=?")
    List<TcCapAula> findByUsuario(java.lang.String usuario);
}
