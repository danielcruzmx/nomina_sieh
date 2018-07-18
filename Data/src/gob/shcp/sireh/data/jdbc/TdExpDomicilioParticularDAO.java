package gob.shcp.sireh.data.jdbc;

import gob.shcp.fsn.data.annotation.Delete;
import gob.shcp.fsn.data.annotation.FindAll;
import gob.shcp.fsn.data.annotation.FindByCondition;
import gob.shcp.fsn.data.annotation.FindById;
import gob.shcp.fsn.data.annotation.Save;
import gob.shcp.fsn.service.data.orm.JdbcDataService;

import java.util.List;

import gob.shcp.sireh.domain.jdbc.TdExpDomicilioParticular;

/**
 * Data access interface for TdExpDomicilioParticular.
 */
public interface TdExpDomicilioParticularDAO extends JdbcDataService {
    /**
     * Find TdExpDomicilioParticular entity by its identifier or primary key value.
     *
     * @param id identifier or primary key
     * @return TdExpDomicilioParticular
     */
    @FindById(TdExpDomicilioParticular.class)
    TdExpDomicilioParticular getById(gob.shcp.sireh.domain.jdbc.TdExpDomicilioParticularPK id);

    /**
     * Get all TdExpDomicilioParticular entities limited by a maximum number of elements.
     *
     * @return Collection of TdExpDomicilioParticular
     */
    @FindAll(TdExpDomicilioParticular.class)
    List<TdExpDomicilioParticular> findAll();

    /**
     * Make persistence of TdExpDomicilioParticular entities. If its identifier or primary key is null then create else update.
     *
     * @param entity TdExpDomicilioParticular
     */
    @Save
    void save(TdExpDomicilioParticular entity);

    /**
     * Remove TdExpDomicilioParticular entities.
     *
     * @param entity TdExpDomicilioParticular
     */
    @Delete
    void delete(TdExpDomicilioParticular entity);


    /**
     * Find the first TdExpDomicilioParticular entity that matches the condition 'where domCalle is equals to'.
     *
     * @param domCalle java.lang.String
     * @return TdExpDomicilioParticular
     */
    @FindByCondition(value = TdExpDomicilioParticular.class, condition = "DOM_CALLE=?")
    TdExpDomicilioParticular getByDomCalle(java.lang.String domCalle);

    /**
     * Find all TdExpDomicilioParticular entities that matches the condition 'where domCalle is equals to'.
     *
     * @param domCalle java.lang.String
     * @return Collection of TdExpDomicilioParticular
     */
    @FindByCondition(value = TdExpDomicilioParticular.class, condition = "DOM_CALLE=?")
    List<TdExpDomicilioParticular> findByDomCalle(java.lang.String domCalle);

    /**
     * Find the first TdExpDomicilioParticular entity that matches the condition 'where domDoctoRef is equals to'.
     *
     * @param domDoctoRef java.lang.String
     * @return TdExpDomicilioParticular
     */
    @FindByCondition(value = TdExpDomicilioParticular.class, condition = "DOM_DOCTO_REF=?")
    TdExpDomicilioParticular getByDomDoctoRef(java.lang.String domDoctoRef);

    /**
     * Find all TdExpDomicilioParticular entities that matches the condition 'where domDoctoRef is equals to'.
     *
     * @param domDoctoRef java.lang.String
     * @return Collection of TdExpDomicilioParticular
     */
    @FindByCondition(value = TdExpDomicilioParticular.class, condition = "DOM_DOCTO_REF=?")
    List<TdExpDomicilioParticular> findByDomDoctoRef(java.lang.String domDoctoRef);

    /**
     * Find the first TdExpDomicilioParticular entity that matches the condition 'where fecModifico is equals to'.
     *
     * @param fecModifico java.util.Date
     * @return TdExpDomicilioParticular
     */
    @FindByCondition(value = TdExpDomicilioParticular.class, condition = "FEC_MODIFICO=?")
    TdExpDomicilioParticular getByFecModifico(java.util.Date fecModifico);

    /**
     * Find all TdExpDomicilioParticular entities that matches the condition 'where fecModifico is equals to'.
     *
     * @param fecModifico java.util.Date
     * @return Collection of TdExpDomicilioParticular
     */
    @FindByCondition(value = TdExpDomicilioParticular.class, condition = "FEC_MODIFICO=?")
    List<TdExpDomicilioParticular> findByFecModifico(java.util.Date fecModifico);

    /**
     * Find the first TdExpDomicilioParticular entity that matches the condition 'where idPais is equals to'.
     *
     * @param idPais java.lang.String
     * @return TdExpDomicilioParticular
     */
    @FindByCondition(value = TdExpDomicilioParticular.class, condition = "ID_PAIS=?")
    TdExpDomicilioParticular getByIdPais(java.lang.String idPais);

    /**
     * Find all TdExpDomicilioParticular entities that matches the condition 'where idPais is equals to'.
     *
     * @param idPais java.lang.String
     * @return Collection of TdExpDomicilioParticular
     */
    @FindByCondition(value = TdExpDomicilioParticular.class, condition = "ID_PAIS=?")
    List<TdExpDomicilioParticular> findByIdPais(java.lang.String idPais);

    /**
     * Find the first TdExpDomicilioParticular entity that matches the condition 'where idStatus is equals to'.
     *
     * @param idStatus java.lang.String
     * @return TdExpDomicilioParticular
     */
    @FindByCondition(value = TdExpDomicilioParticular.class, condition = "ID_STATUS=?")
    TdExpDomicilioParticular getByIdStatus(java.lang.String idStatus);

    /**
     * Find all TdExpDomicilioParticular entities that matches the condition 'where idStatus is equals to'.
     *
     * @param idStatus java.lang.String
     * @return Collection of TdExpDomicilioParticular
     */
    @FindByCondition(value = TdExpDomicilioParticular.class, condition = "ID_STATUS=?")
    List<TdExpDomicilioParticular> findByIdStatus(java.lang.String idStatus);

    /**
     * Find the first TdExpDomicilioParticular entity that matches the condition 'where usuario is equals to'.
     *
     * @param usuario java.lang.String
     * @return TdExpDomicilioParticular
     */
    @FindByCondition(value = TdExpDomicilioParticular.class, condition = "USUARIO=?")
    TdExpDomicilioParticular getByUsuario(java.lang.String usuario);

    /**
     * Find all TdExpDomicilioParticular entities that matches the condition 'where usuario is equals to'.
     *
     * @param usuario java.lang.String
     * @return Collection of TdExpDomicilioParticular
     */
    @FindByCondition(value = TdExpDomicilioParticular.class, condition = "USUARIO=?")
    List<TdExpDomicilioParticular> findByUsuario(java.lang.String usuario);

    /**
     * Find the first TdExpDomicilioParticular entity that matches the condition 'where domColonia is equals to'.
     *
     * @param domColonia java.lang.String
     * @return TdExpDomicilioParticular
     */
    @FindByCondition(value = TdExpDomicilioParticular.class, condition = "DOM_COLONIA=?")
    TdExpDomicilioParticular getByDomColonia(java.lang.String domColonia);

    /**
     * Find all TdExpDomicilioParticular entities that matches the condition 'where domColonia is equals to'.
     *
     * @param domColonia java.lang.String
     * @return Collection of TdExpDomicilioParticular
     */
    @FindByCondition(value = TdExpDomicilioParticular.class, condition = "DOM_COLONIA=?")
    List<TdExpDomicilioParticular> findByDomColonia(java.lang.String domColonia);

    /**
     * Find the first TdExpDomicilioParticular entity that matches the condition 'where domNumExt is equals to'.
     *
     * @param domNumExt java.lang.String
     * @return TdExpDomicilioParticular
     */
    @FindByCondition(value = TdExpDomicilioParticular.class, condition = "DOM_NUM_EXT=?")
    TdExpDomicilioParticular getByDomNumExt(java.lang.String domNumExt);

    /**
     * Find all TdExpDomicilioParticular entities that matches the condition 'where domNumExt is equals to'.
     *
     * @param domNumExt java.lang.String
     * @return Collection of TdExpDomicilioParticular
     */
    @FindByCondition(value = TdExpDomicilioParticular.class, condition = "DOM_NUM_EXT=?")
    List<TdExpDomicilioParticular> findByDomNumExt(java.lang.String domNumExt);

    /**
     * Find the first TdExpDomicilioParticular entity that matches the condition 'where domNumInt is equals to'.
     *
     * @param domNumInt java.lang.String
     * @return TdExpDomicilioParticular
     */
    @FindByCondition(value = TdExpDomicilioParticular.class, condition = "DOM_NUM_INT=?")
    TdExpDomicilioParticular getByDomNumInt(java.lang.String domNumInt);

    /**
     * Find all TdExpDomicilioParticular entities that matches the condition 'where domNumInt is equals to'.
     *
     * @param domNumInt java.lang.String
     * @return Collection of TdExpDomicilioParticular
     */
    @FindByCondition(value = TdExpDomicilioParticular.class, condition = "DOM_NUM_INT=?")
    List<TdExpDomicilioParticular> findByDomNumInt(java.lang.String domNumInt);

    /**
     * Find the first TdExpDomicilioParticular entity that matches the condition 'where idCodPost is equals to'.
     *
     * @param idCodPost java.lang.String
     * @return TdExpDomicilioParticular
     */
    @FindByCondition(value = TdExpDomicilioParticular.class, condition = "ID_COD_POST=?")
    TdExpDomicilioParticular getByIdCodPost(java.lang.String idCodPost);

    /**
     * Find all TdExpDomicilioParticular entities that matches the condition 'where idCodPost is equals to'.
     *
     * @param idCodPost java.lang.String
     * @return Collection of TdExpDomicilioParticular
     */
    @FindByCondition(value = TdExpDomicilioParticular.class, condition = "ID_COD_POST=?")
    List<TdExpDomicilioParticular> findByIdCodPost(java.lang.String idCodPost);

    /**
     * Find the first TdExpDomicilioParticular entity that matches the condition 'where idEdo is equals to'.
     *
     * @param idEdo java.lang.Integer
     * @return TdExpDomicilioParticular
     */
    @FindByCondition(value = TdExpDomicilioParticular.class, condition = "ID_EDO=?")
    TdExpDomicilioParticular getByIdEdo(java.lang.Integer idEdo);

    /**
     * Find all TdExpDomicilioParticular entities that matches the condition 'where idEdo is equals to'.
     *
     * @param idEdo java.lang.Integer
     * @return Collection of TdExpDomicilioParticular
     */
    @FindByCondition(value = TdExpDomicilioParticular.class, condition = "ID_EDO=?")
    List<TdExpDomicilioParticular> findByIdEdo(java.lang.Integer idEdo);

    /**
     * Find the first TdExpDomicilioParticular entity that matches the condition 'where idMun is equals to'.
     *
     * @param idMun java.lang.Integer
     * @return TdExpDomicilioParticular
     */
    @FindByCondition(value = TdExpDomicilioParticular.class, condition = "ID_MUN=?")
    TdExpDomicilioParticular getByIdMun(java.lang.Integer idMun);

    /**
     * Find all TdExpDomicilioParticular entities that matches the condition 'where idMun is equals to'.
     *
     * @param idMun java.lang.Integer
     * @return Collection of TdExpDomicilioParticular
     */
    @FindByCondition(value = TdExpDomicilioParticular.class, condition = "ID_MUN=?")
    List<TdExpDomicilioParticular> findByIdMun(java.lang.Integer idMun);
}
