package gob.shcp.sireh.data.jdbc;

import gob.shcp.fsn.data.annotation.Delete;
import gob.shcp.fsn.data.annotation.FindAll;
import gob.shcp.fsn.data.annotation.FindByCondition;
import gob.shcp.fsn.data.annotation.FindById;
import gob.shcp.fsn.data.annotation.Save;
import gob.shcp.fsn.service.data.orm.JdbcDataService;

import gob.shcp.sireh.domain.jdbc.TdExpCurp;

import java.util.List;

import gob.shcp.sireh.domain.jdbc.TdExpCartillaMilitar;


/**
 * Data access interface for TdExpCartillaMilitar.
 */
public interface TdExpCartillaMilitarDAO extends JdbcDataService {
    /**
     * Find TdExpCartillaMilitar entity by its identifier or primary key value.
     *
     * @param id identifier or primary key
     * @return TdExpCartillaMilitar
     */
    @FindById(TdExpCartillaMilitar.class)
    TdExpCartillaMilitar getById(gob.shcp.sireh.domain.jdbc.TdExpCartillaMilitarPK id);
    
    /**
     * Get all TdExpCartillaMilitar entities limited by a maximum number of elements.
     *
     * @return Collection of TdExpCartillaMilitar
     */
    @FindAll(TdExpCartillaMilitar.class)
    List<TdExpCartillaMilitar> findAll();
    
    /**
     * Make persistence of TdExpCartillaMilitar entities. If its identifier or primary key is null then create else update.
     *
     * @param entity TdExpCartillaMilitar
     */
    @Save
    void save(TdExpCartillaMilitar entity);
    
    /**
     * Remove TdExpCartillaMilitar entities.
     *
     * @param entity TdExpCartillaMilitar
     */
    @Delete
    void delete(TdExpCartillaMilitar entity);


    /**
     * Find the first TdExpCartillaMilitar entity that matches the condition 'where cmiDoctoRef is equals to'.
     *
     * @param cmiDoctoRef java.lang.String
     * @return TdExpCartillaMilitar
     */
    @FindByCondition(value=TdExpCartillaMilitar.class, condition="CMI_DOCTO_REF=?")
    TdExpCartillaMilitar getByCmiDoctoRef(java.lang.String cmiDoctoRef);

    /**
     * Find all TdExpCartillaMilitar entities that matches the condition 'where cmiDoctoRef is equals to'.
     *
     * @param cmiDoctoRef java.lang.String
     * @return Collection of TdExpCartillaMilitar
     */
    @FindByCondition(value=TdExpCartillaMilitar.class, condition="CMI_DOCTO_REF=?")
    List<TdExpCartillaMilitar> findByCmiDoctoRef(java.lang.String cmiDoctoRef);

    /**
     * Find the first TdExpCartillaMilitar entity that matches the condition 'where cmiNumeroCartilla is equals to'.
     *
     * @param cmiNumeroCartilla java.lang.String
     * @return TdExpCartillaMilitar
     */
    @FindByCondition(value=TdExpCartillaMilitar.class, condition="CMI_NUMERO_CARTILLA=?")
    TdExpCartillaMilitar getByCmiNumeroCartilla(java.lang.String cmiNumeroCartilla);

    /**
     * Find all TdExpCartillaMilitar entities that matches the condition 'where cmiNumeroCartilla is equals to'.
     *
     * @param cmiNumeroCartilla java.lang.String
     * @return Collection of TdExpCartillaMilitar
     */
    @FindByCondition(value=TdExpCartillaMilitar.class, condition="CMI_NUMERO_CARTILLA=?")
    List<TdExpCartillaMilitar> findByCmiNumeroCartilla(java.lang.String cmiNumeroCartilla);

    /**
     * Find the first TdExpCartillaMilitar entity that matches the condition 'where fecModifico is equals to'.
     *
     * @param fecModifico java.util.Date
     * @return TdExpCartillaMilitar
     */
    @FindByCondition(value=TdExpCartillaMilitar.class, condition="FEC_MODIFICO=?")
    TdExpCartillaMilitar getByFecModifico(java.util.Date fecModifico);

    /**
     * Find all TdExpCartillaMilitar entities that matches the condition 'where fecModifico is equals to'.
     *
     * @param fecModifico java.util.Date
     * @return Collection of TdExpCartillaMilitar
     */
    @FindByCondition(value=TdExpCartillaMilitar.class, condition="FEC_MODIFICO=?")
    List<TdExpCartillaMilitar> findByFecModifico(java.util.Date fecModifico);

    /**
     * Find the first TdExpCartillaMilitar entity that matches the condition 'where idStatus is equals to'.
     *
     * @param idStatus java.lang.String
     * @return TdExpCartillaMilitar
     */
    @FindByCondition(value=TdExpCartillaMilitar.class, condition="ID_STATUS=?")
    TdExpCartillaMilitar getByIdStatus(java.lang.String idStatus);

    /**
     * Find all TdExpCartillaMilitar entities that matches the condition 'where idStatus is equals to'.
     *
     * @param idStatus java.lang.String
     * @return Collection of TdExpCartillaMilitar
     */
    @FindByCondition(value=TdExpCartillaMilitar.class, condition="ID_STATUS=?")
    List<TdExpCartillaMilitar> findByIdStatus(java.lang.String idStatus);

    /**
     * Find the first TdExpCartillaMilitar entity that matches the condition 'where usuario is equals to'.
     *
     * @param usuario java.lang.String
     * @return TdExpCartillaMilitar
     */
    @FindByCondition(value=TdExpCartillaMilitar.class, condition="USUARIO=?")
    TdExpCartillaMilitar getByUsuario(java.lang.String usuario);

    /**
     * Find all TdExpCartillaMilitar entities that matches the condition 'where usuario is equals to'.
     *
     * @param usuario java.lang.String
     * @return Collection of TdExpCartillaMilitar
     */
    @FindByCondition(value=TdExpCartillaMilitar.class, condition="USUARIO=?")
    List<TdExpCartillaMilitar> findByUsuario(java.lang.String usuario);

    /**
     * Find the first TdExpCartillaMilitar entity that matches the condition 'where cmiFechaLiberacion is equals to'.
     *
     * @param cmiFechaLiberacion java.lang.String
     * @return TdExpCartillaMilitar
     */
    @FindByCondition(value=TdExpCartillaMilitar.class, condition="CMI_FECHA_LIBERACION=?")
    TdExpCartillaMilitar getByCmiFechaLiberacion(java.lang.String cmiFechaLiberacion);

    /**
     * Find all TdExpCartillaMilitar entities that matches the condition 'where cmiFechaLiberacion is equals to'.
     *
     * @param cmiFechaLiberacion java.lang.String
     * @return Collection of TdExpCartillaMilitar
     */
    @FindByCondition(value=TdExpCartillaMilitar.class, condition="CMI_FECHA_LIBERACION=?")
    List<TdExpCartillaMilitar> findByCmiFechaLiberacion(java.lang.String cmiFechaLiberacion);
  
}
