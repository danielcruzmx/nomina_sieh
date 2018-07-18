package gob.shcp.sireh.data.jdbc;

import gob.shcp.fsn.data.annotation.Delete;
import gob.shcp.fsn.data.annotation.FindAll;
import gob.shcp.fsn.data.annotation.FindByCondition;
import gob.shcp.fsn.data.annotation.FindById;
import gob.shcp.fsn.data.annotation.Save;
import gob.shcp.fsn.service.data.orm.JdbcDataService;

import java.util.List;

import gob.shcp.sireh.domain.jdbc.TcAtributoPuesto;


/**
 * Data access interface for TcAtributoPuesto.
 */
public interface TcAtributoPuestoDAO extends JdbcDataService {
    /**
     * Find TcAtributoPuesto entity by its identifier or primary key value.
     *
     * @param id identifier or primary key
     * @return TcAtributoPuesto
     */
    @FindById(TcAtributoPuesto.class)
    TcAtributoPuesto getById(gob.shcp.sireh.domain.jdbc.TcAtributoPuestoPK id);
    
    /**
     * Get all TcAtributoPuesto entities limited by a maximum number of elements.
     *
     * @return Collection of TcAtributoPuesto
     */
    @FindAll(TcAtributoPuesto.class)
    List<TcAtributoPuesto> findAll();
    
    /**
     * Make persistence of TcAtributoPuesto entities. If its identifier or primary key is null then create else update.
     *
     * @param entity TcAtributoPuesto
     */
    @Save
    void save(TcAtributoPuesto entity);
    
    /**
     * Remove TcAtributoPuesto entities.
     *
     * @param entity TcAtributoPuesto
     */
    @Delete
    void delete(TcAtributoPuesto entity);


    /**
     * Find the first TcAtributoPuesto entity that matches the condition 'where apErarioFederal is equals to'.
     *
     * @param apErarioFederal java.lang.String
     * @return TcAtributoPuesto
     */
    @FindByCondition(value=TcAtributoPuesto.class, condition="AP_ERARIO_FEDERAL=?")
    TcAtributoPuesto getByApErarioFederal(java.lang.String apErarioFederal);

    /**
     * Find all TcAtributoPuesto entities that matches the condition 'where apErarioFederal is equals to'.
     *
     * @param apErarioFederal java.lang.String
     * @return Collection of TcAtributoPuesto
     */
    @FindByCondition(value=TcAtributoPuesto.class, condition="AP_ERARIO_FEDERAL=?")
    List<TcAtributoPuesto> findByApErarioFederal(java.lang.String apErarioFederal);

    /**
     * Find the first TcAtributoPuesto entity that matches the condition 'where apIncentivo is equals to'.
     *
     * @param apIncentivo double
     * @return TcAtributoPuesto
     */
    @FindByCondition(value=TcAtributoPuesto.class, condition="AP_INCENTIVO=?")
    TcAtributoPuesto getByApIncentivo(double apIncentivo);

    /**
     * Find all TcAtributoPuesto entities that matches the condition 'where apIncentivo is equals to'.
     *
     * @param apIncentivo double
     * @return Collection of TcAtributoPuesto
     */
    @FindByCondition(value=TcAtributoPuesto.class, condition="AP_INCENTIVO=?")
    List<TcAtributoPuesto> findByApIncentivo(double apIncentivo);

    /**
     * Find the first TcAtributoPuesto entity that matches the condition 'where apIni is equals to'.
     *
     * @param apIni java.util.Date
     * @return TcAtributoPuesto
     */
    @FindByCondition(value=TcAtributoPuesto.class, condition="AP_INI=?")
    TcAtributoPuesto getByApIni(java.util.Date apIni);

    /**
     * Find all TcAtributoPuesto entities that matches the condition 'where apIni is equals to'.
     *
     * @param apIni java.util.Date
     * @return Collection of TcAtributoPuesto
     */
    @FindByCondition(value=TcAtributoPuesto.class, condition="AP_INI=?")
    List<TcAtributoPuesto> findByApIni(java.util.Date apIni);

    /**
     * Find the first TcAtributoPuesto entity that matches the condition 'where fecModifico is equals to'.
     *
     * @param fecModifico java.util.Date
     * @return TcAtributoPuesto
     */
    @FindByCondition(value=TcAtributoPuesto.class, condition="FEC_MODIFICO=?")
    TcAtributoPuesto getByFecModifico(java.util.Date fecModifico);

    /**
     * Find all TcAtributoPuesto entities that matches the condition 'where fecModifico is equals to'.
     *
     * @param fecModifico java.util.Date
     * @return Collection of TcAtributoPuesto
     */
    @FindByCondition(value=TcAtributoPuesto.class, condition="FEC_MODIFICO=?")
    List<TcAtributoPuesto> findByFecModifico(java.util.Date fecModifico);

    /**
     * Find the first TcAtributoPuesto entity that matches the condition 'where idNivelPto is equals to'.
     *
     * @param idNivelPto java.lang.String
     * @return TcAtributoPuesto
     */
    @FindByCondition(value=TcAtributoPuesto.class, condition="ID_NIVEL_PTO=?")
    TcAtributoPuesto getByIdNivelPto(java.lang.String idNivelPto);

    /**
     * Find all TcAtributoPuesto entities that matches the condition 'where idNivelPto is equals to'.
     *
     * @param idNivelPto java.lang.String
     * @return Collection of TcAtributoPuesto
     */
    @FindByCondition(value=TcAtributoPuesto.class, condition="ID_NIVEL_PTO=?")
    List<TcAtributoPuesto> findByIdNivelPto(java.lang.String idNivelPto);

    /**
     * Find the first TcAtributoPuesto entity that matches the condition 'where usuario is equals to'.
     *
     * @param usuario java.lang.String
     * @return TcAtributoPuesto
     */
    @FindByCondition(value=TcAtributoPuesto.class, condition="USUARIO=?")
    TcAtributoPuesto getByUsuario(java.lang.String usuario);

    /**
     * Find all TcAtributoPuesto entities that matches the condition 'where usuario is equals to'.
     *
     * @param usuario java.lang.String
     * @return Collection of TcAtributoPuesto
     */
    @FindByCondition(value=TcAtributoPuesto.class, condition="USUARIO=?")
    List<TcAtributoPuesto> findByUsuario(java.lang.String usuario);
}