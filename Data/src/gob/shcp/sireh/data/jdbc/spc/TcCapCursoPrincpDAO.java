package gob.shcp.sireh.data.jdbc.spc;

import gob.shcp.fsn.data.annotation.Delete;
import gob.shcp.fsn.data.annotation.FindAll;
import gob.shcp.fsn.data.annotation.FindByCondition;
import gob.shcp.fsn.data.annotation.FindById;
import gob.shcp.fsn.data.annotation.Save;
import gob.shcp.fsn.service.data.orm.JdbcDataService;

import gob.shcp.sireh.domain.jdbc.spc.TcCapCursoPrincp;

import java.util.List;

/**
 * Data access interface for TcCapCursoPrincipal.
 */
public interface TcCapCursoPrincpDAO extends JdbcDataService {

    /**
     * Find TcCapCursoPrincipal entity by its identifier or primary key value.
     *
     * @param id identifier or primary key
     * @return TcCapCursoPrincipal
     */
    @FindById(TcCapCursoPrincp.class)
    TcCapCursoPrincp getById(gob.shcp.sireh.domain.jdbc.spc.TcCapCursoPrincplPK id);

    /**
     * Get all TcCapCursoPrincipal entities limited by a maximum number of elements.
     *
     * @return Collection of TcCapCursoPrincipal
     */
    @FindAll(TcCapCursoPrincp.class)
    List<TcCapCursoPrincp> findAll();

    /**
     * Make persistence of TcCapCursoPrincipal entities. If its identifier or primary key is null then create else update.
     *
     * @param entity TcCapCursoPrincipal
     */
    @Save
    void save(TcCapCursoPrincp entity);

    /**
     * Remove TcCapCursoPrincipal entities.
     *
     * @param entity TcCapCursoPrincipal
     */
    @Delete
    void delete(TcCapCursoPrincp entity);


    /**
     * Find the first TcCapCursoPrincipal entity that matches the condition 'where descCursoPrincipal is equals to'.
     *
     * @param descCursoPrincipal java.lang.String
     * @return TcCapCursoPrincipal
     */
    @FindByCondition(value = TcCapCursoPrincp.class, condition = "DESC_CURSO_PRINCIPAL=?")
    TcCapCursoPrincp getByDescCursoPrincipal(java.lang.String descCursoPrincipal);

    /**
     * Find all TcCapCursoPrincipal entities that matches the condition 'where descCursoPrincipal is equals to'.
     *
     * @param descCursoPrincipal java.lang.String
     * @return Collection of TcCapCursoPrincipal
     */
    @FindByCondition(value = TcCapCursoPrincp.class, condition = "DESC_CURSO_PRINCIPAL=?")
    List<TcCapCursoPrincp> findByDescCursoPrincipal(java.lang.String descCursoPrincipal);

    /**
     * Find the first TcCapCursoPrincipal entity that matches the condition 'where fecModifico is equals to'.
     *
     * @param fecModifico java.util.Date
     * @return TcCapCursoPrincipal
     */
    @FindByCondition(value = TcCapCursoPrincp.class, condition = "FEC_MODIFICO=?")
    TcCapCursoPrincp getByFecModifico(java.util.Date fecModifico);

    /**
     * Find all TcCapCursoPrincipal entities that matches the condition 'where fecModifico is equals to'.
     *
     * @param fecModifico java.util.Date
     * @return Collection of TcCapCursoPrincipal
     */
    @FindByCondition(value = TcCapCursoPrincp.class, condition = "FEC_MODIFICO=?")
    List<TcCapCursoPrincp> findByFecModifico(java.util.Date fecModifico);

    /**
     * Find the first TcCapCursoPrincipal entity that matches the condition 'where usuario is equals to'.
     *
     * @param usuario java.lang.String
     * @return TcCapCursoPrincipal
     */
    @FindByCondition(value = TcCapCursoPrincp.class, condition = "USUARIO=?")
    TcCapCursoPrincp getByUsuario(java.lang.String usuario);

    /**
     * Find all TcCapCursoPrincipal entities that matches the condition 'where usuario is equals to'.
     *
     * @param usuario java.lang.String
     * @return Collection of TcCapCursoPrincipal
     */
    @FindByCondition(value = TcCapCursoPrincp.class, condition = "USUARIO=?")
    List<TcCapCursoPrincp> findByUsuario(java.lang.String usuario);
}
