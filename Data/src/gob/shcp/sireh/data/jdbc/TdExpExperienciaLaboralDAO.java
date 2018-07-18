package gob.shcp.sireh.data.jdbc;

import gob.shcp.fsn.data.annotation.Delete;
import gob.shcp.fsn.data.annotation.FindAll;
import gob.shcp.fsn.data.annotation.FindByCondition;
import gob.shcp.fsn.data.annotation.FindById;
import gob.shcp.fsn.data.annotation.Save;
import gob.shcp.fsn.service.data.orm.JdbcDataService;

import java.util.List;

import gob.shcp.sireh.domain.jdbc.TdExpExperienciaLaboral;


/**
 * Data access interface for TdExpExperienciaLaboral.
 */
public interface TdExpExperienciaLaboralDAO extends JdbcDataService {
    /**
     * Find TdExpExperienciaLaboral entity by its identifier or primary key value.
     *
     * @param id identifier or primary key
     * @return TdExpExperienciaLaboral
     */
    @FindById(TdExpExperienciaLaboral.class)
    TdExpExperienciaLaboral getById(gob.shcp.sireh.domain.jdbc.TdExpExperienciaLaboralPK id);
    
    /**
     * Get all TdExpExperienciaLaboral entities limited by a maximum number of elements.
     *
     * @return Collection of TdExpExperienciaLaboral
     */
    @FindAll(TdExpExperienciaLaboral.class)
    List<TdExpExperienciaLaboral> findAll();
    
    /**
     * Make persistence of TdExpExperienciaLaboral entities. If its identifier or primary key is null then create else update.
     *
     * @param entity TdExpExperienciaLaboral
     */
    @Save
    void save(TdExpExperienciaLaboral entity);
    
    /**
     * Remove TdExpExperienciaLaboral entities.
     *
     * @param entity TdExpExperienciaLaboral
     */
    @Delete
    void delete(TdExpExperienciaLaboral entity);


    /**
     * Find the first TdExpExperienciaLaboral entity that matches the condition 'where expFecFinal is equals to'.
     *
     * @param expFecFinal java.util.Date
     * @return TdExpExperienciaLaboral
     */
    @FindByCondition(value=TdExpExperienciaLaboral.class, condition="EXP_FEC_FINAL=?")
    TdExpExperienciaLaboral getByExpFecFinal(java.util.Date expFecFinal);

    /**
     * Find all TdExpExperienciaLaboral entities that matches the condition 'where expFecFinal is equals to'.
     *
     * @param expFecFinal java.util.Date
     * @return Collection of TdExpExperienciaLaboral
     */
    @FindByCondition(value=TdExpExperienciaLaboral.class, condition="EXP_FEC_FINAL=?")
    List<TdExpExperienciaLaboral> findByExpFecFinal(java.util.Date expFecFinal);

    /**
     * Find the first TdExpExperienciaLaboral entity that matches the condition 'where expFecInicial is equals to'.
     *
     * @param expFecInicial java.util.Date
     * @return TdExpExperienciaLaboral
     */
    @FindByCondition(value=TdExpExperienciaLaboral.class, condition="EXP_FEC_INICIAL=?")
    TdExpExperienciaLaboral getByExpFecInicial(java.util.Date expFecInicial);

    /**
     * Find all TdExpExperienciaLaboral entities that matches the condition 'where expFecInicial is equals to'.
     *
     * @param expFecInicial java.util.Date
     * @return Collection of TdExpExperienciaLaboral
     */
    @FindByCondition(value=TdExpExperienciaLaboral.class, condition="EXP_FEC_INICIAL=?")
    List<TdExpExperienciaLaboral> findByExpFecInicial(java.util.Date expFecInicial);

    /**
     * Find the first TdExpExperienciaLaboral entity that matches the condition 'where expOrganizacion is equals to'.
     *
     * @param expOrganizacion java.lang.String
     * @return TdExpExperienciaLaboral
     */
    @FindByCondition(value=TdExpExperienciaLaboral.class, condition="EXP_ORGANIZACION=?")
    TdExpExperienciaLaboral getByExpOrganizacion(java.lang.String expOrganizacion);

    /**
     * Find all TdExpExperienciaLaboral entities that matches the condition 'where expOrganizacion is equals to'.
     *
     * @param expOrganizacion java.lang.String
     * @return Collection of TdExpExperienciaLaboral
     */
    @FindByCondition(value=TdExpExperienciaLaboral.class, condition="EXP_ORGANIZACION=?")
    List<TdExpExperienciaLaboral> findByExpOrganizacion(java.lang.String expOrganizacion);

    /**
     * Find the first TdExpExperienciaLaboral entity that matches the condition 'where fecModifico is equals to'.
     *
     * @param fecModifico java.util.Date
     * @return TdExpExperienciaLaboral
     */
    @FindByCondition(value=TdExpExperienciaLaboral.class, condition="FEC_MODIFICO=?")
    TdExpExperienciaLaboral getByFecModifico(java.util.Date fecModifico);

    /**
     * Find all TdExpExperienciaLaboral entities that matches the condition 'where fecModifico is equals to'.
     *
     * @param fecModifico java.util.Date
     * @return Collection of TdExpExperienciaLaboral
     */
    @FindByCondition(value=TdExpExperienciaLaboral.class, condition="FEC_MODIFICO=?")
    List<TdExpExperienciaLaboral> findByFecModifico(java.util.Date fecModifico);

    /**
     * Find the first TdExpExperienciaLaboral entity that matches the condition 'where idActPrinc is equals to'.
     *
     * @param idActPrinc java.lang.String
     * @return TdExpExperienciaLaboral
     */
    @FindByCondition(value=TdExpExperienciaLaboral.class, condition="ID_ACT_PRINC=?")
    TdExpExperienciaLaboral getByIdActPrinc(java.lang.String idActPrinc);

    /**
     * Find all TdExpExperienciaLaboral entities that matches the condition 'where idActPrinc is equals to'.
     *
     * @param idActPrinc java.lang.String
     * @return Collection of TdExpExperienciaLaboral
     */
    @FindByCondition(value=TdExpExperienciaLaboral.class, condition="ID_ACT_PRINC=?")
    List<TdExpExperienciaLaboral> findByIdActPrinc(java.lang.String idActPrinc);

    /**
     * Find the first TdExpExperienciaLaboral entity that matches the condition 'where idNivelCargo is equals to'.
     *
     * @param idNivelCargo java.lang.String
     * @return TdExpExperienciaLaboral
     */
    @FindByCondition(value=TdExpExperienciaLaboral.class, condition="ID_NIVEL_CARGO=?")
    TdExpExperienciaLaboral getByIdNivelCargo(java.lang.String idNivelCargo);

    /**
     * Find all TdExpExperienciaLaboral entities that matches the condition 'where idNivelCargo is equals to'.
     *
     * @param idNivelCargo java.lang.String
     * @return Collection of TdExpExperienciaLaboral
     */
    @FindByCondition(value=TdExpExperienciaLaboral.class, condition="ID_NIVEL_CARGO=?")
    List<TdExpExperienciaLaboral> findByIdNivelCargo(java.lang.String idNivelCargo);

    /**
     * Find the first TdExpExperienciaLaboral entity that matches the condition 'where idPais is equals to'.
     *
     * @param idPais java.lang.String
     * @return TdExpExperienciaLaboral
     */
    @FindByCondition(value=TdExpExperienciaLaboral.class, condition="ID_PAIS=?")
    TdExpExperienciaLaboral getByIdPais(java.lang.String idPais);

    /**
     * Find all TdExpExperienciaLaboral entities that matches the condition 'where idPais is equals to'.
     *
     * @param idPais java.lang.String
     * @return Collection of TdExpExperienciaLaboral
     */
    @FindByCondition(value=TdExpExperienciaLaboral.class, condition="ID_PAIS=?")
    List<TdExpExperienciaLaboral> findByIdPais(java.lang.String idPais);

    /**
     * Find the first TdExpExperienciaLaboral entity that matches the condition 'where idStatus is equals to'.
     *
     * @param idStatus java.lang.String
     * @return TdExpExperienciaLaboral
     */
    @FindByCondition(value=TdExpExperienciaLaboral.class, condition="ID_STATUS=?")
    TdExpExperienciaLaboral getByIdStatus(java.lang.String idStatus);

    /**
     * Find all TdExpExperienciaLaboral entities that matches the condition 'where idStatus is equals to'.
     *
     * @param idStatus java.lang.String
     * @return Collection of TdExpExperienciaLaboral
     */
    @FindByCondition(value=TdExpExperienciaLaboral.class, condition="ID_STATUS=?")
    List<TdExpExperienciaLaboral> findByIdStatus(java.lang.String idStatus);

    /**
     * Find the first TdExpExperienciaLaboral entity that matches the condition 'where usuario is equals to'.
     *
     * @param usuario java.lang.String
     * @return TdExpExperienciaLaboral
     */
    @FindByCondition(value=TdExpExperienciaLaboral.class, condition="USUARIO=?")
    TdExpExperienciaLaboral getByUsuario(java.lang.String usuario);

    /**
     * Find all TdExpExperienciaLaboral entities that matches the condition 'where usuario is equals to'.
     *
     * @param usuario java.lang.String
     * @return Collection of TdExpExperienciaLaboral
     */
    @FindByCondition(value=TdExpExperienciaLaboral.class, condition="USUARIO=?")
    List<TdExpExperienciaLaboral> findByUsuario(java.lang.String usuario);

    /**
     * Find the first TdExpExperienciaLaboral entity that matches the condition 'where expDoctoRef is equals to'.
     *
     * @param expDoctoRef java.lang.String
     * @return TdExpExperienciaLaboral
     */
    @FindByCondition(value=TdExpExperienciaLaboral.class, condition="EXP_DOCTO_REF=?")
    TdExpExperienciaLaboral getByExpDoctoRef(java.lang.String expDoctoRef);

    /**
     * Find all TdExpExperienciaLaboral entities that matches the condition 'where expDoctoRef is equals to'.
     *
     * @param expDoctoRef java.lang.String
     * @return Collection of TdExpExperienciaLaboral
     */
    @FindByCondition(value=TdExpExperienciaLaboral.class, condition="EXP_DOCTO_REF=?")
    List<TdExpExperienciaLaboral> findByExpDoctoRef(java.lang.String expDoctoRef);

    /**
     * Find the first TdExpExperienciaLaboral entity that matches the condition 'where expSector is equals to'.
     *
     * @param expSector java.lang.String
     * @return TdExpExperienciaLaboral
     */
    @FindByCondition(value=TdExpExperienciaLaboral.class, condition="EXP_SECTOR=?")
    TdExpExperienciaLaboral getByExpSector(java.lang.String expSector);

    /**
     * Find all TdExpExperienciaLaboral entities that matches the condition 'where expSector is equals to'.
     *
     * @param expSector java.lang.String
     * @return Collection of TdExpExperienciaLaboral
     */
    @FindByCondition(value=TdExpExperienciaLaboral.class, condition="EXP_SECTOR=?")
    List<TdExpExperienciaLaboral> findByExpSector(java.lang.String expSector);
}