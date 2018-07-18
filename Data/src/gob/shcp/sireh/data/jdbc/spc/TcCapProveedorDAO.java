package gob.shcp.sireh.data.jdbc.spc;

import gob.shcp.fsn.data.annotation.Delete;
import gob.shcp.fsn.data.annotation.FindAll;
import gob.shcp.fsn.data.annotation.FindByCondition;
import gob.shcp.fsn.data.annotation.FindById;
import gob.shcp.fsn.data.annotation.Save;
import gob.shcp.fsn.service.data.orm.JdbcDataService;

import java.util.List;

import gob.shcp.sireh.domain.jdbc.spc.TcCapProveedor;

/**
 * Data access interface for TcCapProveedor.
 */
public interface TcCapProveedorDAO extends JdbcDataService {
    /**
     * Find TcCapProveedor entity by its identifier or primary key value.
     *
     * @param id identifier or primary key
     * @return TcCapProveedor
     */
    @FindById(TcCapProveedor.class)
    TcCapProveedor getById(java.lang.String id);

    /**
     * Get all TcCapProveedor entities limited by a maximum number of elements.
     *
     * @return Collection of TcCapProveedor
     */
    @FindAll(TcCapProveedor.class)
    List<TcCapProveedor> findAll();

    /**
     * Make persistence of TcCapProveedor entities. If its identifier or primary key is null then create else update.
     *
     * @param entity TcCapProveedor
     */
    @Save
    void save(TcCapProveedor entity);

    /**
     * Remove TcCapProveedor entities.
     *
     * @param entity TcCapProveedor
     */
    @Delete
    void delete(TcCapProveedor entity);


    /**
     * Find the first TcCapProveedor entity that matches the condition 'where coordinadorProveedor is equals to'.
     *
     * @param coordinadorProveedor java.lang.String
     * @return TcCapProveedor
     */
    @FindByCondition(value = TcCapProveedor.class, condition = "COORDINADOR_PROVEEDOR=?")
    TcCapProveedor getByCoordinadorProveedor(java.lang.String coordinadorProveedor);

    /**
     * Find all TcCapProveedor entities that matches the condition 'where coordinadorProveedor is equals to'.
     *
     * @param coordinadorProveedor java.lang.String
     * @return Collection of TcCapProveedor
     */
    @FindByCondition(value = TcCapProveedor.class, condition = "COORDINADOR_PROVEEDOR=?")
    List<TcCapProveedor> findByCoordinadorProveedor(java.lang.String coordinadorProveedor);

    /**
     * Find the first TcCapProveedor entity that matches the condition 'where descProveedor is equals to'.
     *
     * @param descProveedor java.lang.String
     * @return TcCapProveedor
     */
    @FindByCondition(value = TcCapProveedor.class, condition = "DESC_PROVEEDOR=?")
    TcCapProveedor getByDescProveedor(java.lang.String descProveedor);

    /**
     * Find all TcCapProveedor entities that matches the condition 'where descProveedor is equals to'.
     *
     * @param descProveedor java.lang.String
     * @return Collection of TcCapProveedor
     */
    @FindByCondition(value = TcCapProveedor.class, condition = "DESC_PROVEEDOR=?")
    List<TcCapProveedor> findByDescProveedor(java.lang.String descProveedor);

    /**
     * Find the first TcCapProveedor entity that matches the condition 'where fecModifico is equals to'.
     *
     * @param fecModifico java.util.Date
     * @return TcCapProveedor
     */
    @FindByCondition(value = TcCapProveedor.class, condition = "FEC_MODIFICO=?")
    TcCapProveedor getByFecModifico(java.util.Date fecModifico);

    /**
     * Find all TcCapProveedor entities that matches the condition 'where fecModifico is equals to'.
     *
     * @param fecModifico java.util.Date
     * @return Collection of TcCapProveedor
     */
    @FindByCondition(value = TcCapProveedor.class, condition = "FEC_MODIFICO=?")
    List<TcCapProveedor> findByFecModifico(java.util.Date fecModifico);

    /**
     * Find the first TcCapProveedor entity that matches the condition 'where idStatus is equals to'.
     *
     * @param idStatus java.lang.String
     * @return TcCapProveedor
     */
    @FindByCondition(value = TcCapProveedor.class, condition = "ID_STATUS=?")
    TcCapProveedor getByIdStatus(java.lang.String idStatus);

    /**
     * Find all TcCapProveedor entities that matches the condition 'where idStatus is equals to'.
     *
     * @param idStatus java.lang.String
     * @return Collection of TcCapProveedor
     */
    @FindByCondition(value = TcCapProveedor.class, condition = "ID_STATUS=?")
    List<TcCapProveedor> findByIdStatus(java.lang.String idStatus);

    /**
     * Find the first TcCapProveedor entity that matches the condition 'where usuario is equals to'.
     *
     * @param usuario java.lang.String
     * @return TcCapProveedor
     */
    @FindByCondition(value = TcCapProveedor.class, condition = "USUARIO=?")
    TcCapProveedor getByUsuario(java.lang.String usuario);

    /**
     * Find all TcCapProveedor entities that matches the condition 'where usuario is equals to'.
     *
     * @param usuario java.lang.String
     * @return Collection of TcCapProveedor
     */
    @FindByCondition(value = TcCapProveedor.class, condition = "USUARIO=?")
    List<TcCapProveedor> findByUsuario(java.lang.String usuario);
}
