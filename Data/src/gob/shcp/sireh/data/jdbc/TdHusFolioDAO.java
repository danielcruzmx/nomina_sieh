package gob.shcp.sireh.data.jdbc;

import gob.shcp.fsn.data.annotation.Delete;
import gob.shcp.fsn.data.annotation.FindAll;
import gob.shcp.fsn.data.annotation.FindByCondition;
import gob.shcp.fsn.data.annotation.FindById;
import gob.shcp.fsn.data.annotation.Save;
import gob.shcp.fsn.service.data.orm.JdbcDataService;

import java.util.List;

import gob.shcp.sireh.domain.jdbc.TdHusFolio;


/**
 * Data access interface for TdHusFolio.
 */
public interface TdHusFolioDAO extends JdbcDataService {
    /**
     * Find TdHusFolio entity by its identifier or primary key value.
     *
     * @param id identifier or primary key
     * @return TdHusFolio
     */
    @FindById(TdHusFolio.class)
    TdHusFolio getById(java.lang.String id);
    
    /**
     * Get all TdHusFolio entities limited by a maximum number of elements.
     *
     * @return Collection of TdHusFolio
     */
    @FindAll(TdHusFolio.class)
    List<TdHusFolio> findAll();
    
    /**
     * Make persistence of TdHusFolio entities. If its identifier or primary key is null then create else update.
     *
     * @param entity TdHusFolio
     */
    @Save
    void save(TdHusFolio entity);
    
    /**
     * Remove TdHusFolio entities.
     *
     * @param entity TdHusFolio
     */
    @Delete
    void delete(TdHusFolio entity);


    /**
     * Find the first TdHusFolio entity that matches the condition 'where fecModifico is equals to'.
     *
     * @param fecModifico java.util.Date
     * @return TdHusFolio
     */
    @FindByCondition(value=TdHusFolio.class, condition="FEC_MODIFICO=?")
    TdHusFolio getByFecModifico(java.util.Date fecModifico);

    /**
     * Find all TdHusFolio entities that matches the condition 'where fecModifico is equals to'.
     *
     * @param fecModifico java.util.Date
     * @return Collection of TdHusFolio
     */
    @FindByCondition(value=TdHusFolio.class, condition="FEC_MODIFICO=?")
    List<TdHusFolio> findByFecModifico(java.util.Date fecModifico);

    /**
     * Find the first TdHusFolio entity that matches the condition 'where husfolFecIng is equals to'.
     *
     * @param husfolFecIng java.util.Date
     * @return TdHusFolio
     */
    @FindByCondition(value=TdHusFolio.class, condition="HUSFOL_FEC_ING=?")
    TdHusFolio getByHusfolFecIng(java.util.Date husfolFecIng);

    /**
     * Find all TdHusFolio entities that matches the condition 'where husfolFecIng is equals to'.
     *
     * @param husfolFecIng java.util.Date
     * @return Collection of TdHusFolio
     */
    @FindByCondition(value=TdHusFolio.class, condition="HUSFOL_FEC_ING=?")
    List<TdHusFolio> findByHusfolFecIng(java.util.Date husfolFecIng);

    /**
     * Find the first TdHusFolio entity that matches the condition 'where usuario is equals to'.
     *
     * @param usuario java.lang.String
     * @return TdHusFolio
     */
    @FindByCondition(value=TdHusFolio.class, condition="USUARIO=?")
    TdHusFolio getByUsuario(java.lang.String usuario);

    /**
     * Find all TdHusFolio entities that matches the condition 'where usuario is equals to'.
     *
     * @param usuario java.lang.String
     * @return Collection of TdHusFolio
     */
    @FindByCondition(value=TdHusFolio.class, condition="USUARIO=?")
    List<TdHusFolio> findByUsuario(java.lang.String usuario);

    /**
     * Find the first TdHusFolio entity that matches the condition 'where husfolCallePar is equals to'.
     *
     * @param husfolCallePar java.lang.String
     * @return TdHusFolio
     */
    @FindByCondition(value=TdHusFolio.class, condition="HUSFOL_CALLE_PAR=?")
    TdHusFolio getByHusfolCallePar(java.lang.String husfolCallePar);

    /**
     * Find all TdHusFolio entities that matches the condition 'where husfolCallePar is equals to'.
     *
     * @param husfolCallePar java.lang.String
     * @return Collection of TdHusFolio
     */
    @FindByCondition(value=TdHusFolio.class, condition="HUSFOL_CALLE_PAR=?")
    List<TdHusFolio> findByHusfolCallePar(java.lang.String husfolCallePar);

    /**
     * Find the first TdHusFolio entity that matches the condition 'where husfolCodpostPar is equals to'.
     *
     * @param husfolCodpostPar java.lang.Integer
     * @return TdHusFolio
     */
    @FindByCondition(value=TdHusFolio.class, condition="HUSFOL_CODPOST_PAR=?")
    TdHusFolio getByHusfolCodpostPar(java.lang.Integer husfolCodpostPar);

    /**
     * Find all TdHusFolio entities that matches the condition 'where husfolCodpostPar is equals to'.
     *
     * @param husfolCodpostPar java.lang.Integer
     * @return Collection of TdHusFolio
     */
    @FindByCondition(value=TdHusFolio.class, condition="HUSFOL_CODPOST_PAR=?")
    List<TdHusFolio> findByHusfolCodpostPar(java.lang.Integer husfolCodpostPar);

    /**
     * Find the first TdHusFolio entity that matches the condition 'where husfolColoniaPar is equals to'.
     *
     * @param husfolColoniaPar java.lang.String
     * @return TdHusFolio
     */
    @FindByCondition(value=TdHusFolio.class, condition="HUSFOL_COLONIA_PAR=?")
    TdHusFolio getByHusfolColoniaPar(java.lang.String husfolColoniaPar);

    /**
     * Find all TdHusFolio entities that matches the condition 'where husfolColoniaPar is equals to'.
     *
     * @param husfolColoniaPar java.lang.String
     * @return Collection of TdHusFolio
     */
    @FindByCondition(value=TdHusFolio.class, condition="HUSFOL_COLONIA_PAR=?")
    List<TdHusFolio> findByHusfolColoniaPar(java.lang.String husfolColoniaPar);

    /**
     * Find the first TdHusFolio entity that matches the condition 'where husfolCurp is equals to'.
     *
     * @param husfolCurp java.lang.String
     * @return TdHusFolio
     */
    @FindByCondition(value=TdHusFolio.class, condition="HUSFOL_CURP=?")
    TdHusFolio getByHusfolCurp(java.lang.String husfolCurp);

    /**
     * Find all TdHusFolio entities that matches the condition 'where husfolCurp is equals to'.
     *
     * @param husfolCurp java.lang.String
     * @return Collection of TdHusFolio
     */
    @FindByCondition(value=TdHusFolio.class, condition="HUSFOL_CURP=?")
    List<TdHusFolio> findByHusfolCurp(java.lang.String husfolCurp);

    /**
     * Find the first TdHusFolio entity that matches the condition 'where husfolNombre is equals to'.
     *
     * @param husfolNombre java.lang.String
     * @return TdHusFolio
     */
    @FindByCondition(value=TdHusFolio.class, condition="HUSFOL_NOMBRE=?")
    TdHusFolio getByHusfolNombre(java.lang.String husfolNombre);

    /**
     * Find all TdHusFolio entities that matches the condition 'where husfolNombre is equals to'.
     *
     * @param husfolNombre java.lang.String
     * @return Collection of TdHusFolio
     */
    @FindByCondition(value=TdHusFolio.class, condition="HUSFOL_NOMBRE=?")
    List<TdHusFolio> findByHusfolNombre(java.lang.String husfolNombre);

    /**
     * Find the first TdHusFolio entity that matches the condition 'where husfolNumextPar is equals to'.
     *
     * @param husfolNumextPar java.lang.String
     * @return TdHusFolio
     */
    @FindByCondition(value=TdHusFolio.class, condition="HUSFOL_NUMEXT_PAR=?")
    TdHusFolio getByHusfolNumextPar(java.lang.String husfolNumextPar);

    /**
     * Find all TdHusFolio entities that matches the condition 'where husfolNumextPar is equals to'.
     *
     * @param husfolNumextPar java.lang.String
     * @return Collection of TdHusFolio
     */
    @FindByCondition(value=TdHusFolio.class, condition="HUSFOL_NUMEXT_PAR=?")
    List<TdHusFolio> findByHusfolNumextPar(java.lang.String husfolNumextPar);

    /**
     * Find the first TdHusFolio entity that matches the condition 'where husfolNumintPar is equals to'.
     *
     * @param husfolNumintPar java.lang.String
     * @return TdHusFolio
     */
    @FindByCondition(value=TdHusFolio.class, condition="HUSFOL_NUMINT_PAR=?")
    TdHusFolio getByHusfolNumintPar(java.lang.String husfolNumintPar);

    /**
     * Find all TdHusFolio entities that matches the condition 'where husfolNumintPar is equals to'.
     *
     * @param husfolNumintPar java.lang.String
     * @return Collection of TdHusFolio
     */
    @FindByCondition(value=TdHusFolio.class, condition="HUSFOL_NUMINT_PAR=?")
    List<TdHusFolio> findByHusfolNumintPar(java.lang.String husfolNumintPar);

    /**
     * Find the first TdHusFolio entity that matches the condition 'where husfolNumQui is equals to'.
     *
     * @param husfolNumQui java.lang.Boolean
     * @return TdHusFolio
     */
    @FindByCondition(value=TdHusFolio.class, condition="HUSFOL_NUM_QUI=?")
    TdHusFolio getByHusfolNumQui(java.lang.Boolean husfolNumQui);

    /**
     * Find all TdHusFolio entities that matches the condition 'where husfolNumQui is equals to'.
     *
     * @param husfolNumQui java.lang.Boolean
     * @return Collection of TdHusFolio
     */
    @FindByCondition(value=TdHusFolio.class, condition="HUSFOL_NUM_QUI=?")
    List<TdHusFolio> findByHusfolNumQui(java.lang.Boolean husfolNumQui);

    /**
     * Find the first TdHusFolio entity that matches the condition 'where husfolPoblacionPar is equals to'.
     *
     * @param husfolPoblacionPar java.lang.String
     * @return TdHusFolio
     */
    @FindByCondition(value=TdHusFolio.class, condition="HUSFOL_POBLACION_PAR=?")
    TdHusFolio getByHusfolPoblacionPar(java.lang.String husfolPoblacionPar);

    /**
     * Find all TdHusFolio entities that matches the condition 'where husfolPoblacionPar is equals to'.
     *
     * @param husfolPoblacionPar java.lang.String
     * @return Collection of TdHusFolio
     */
    @FindByCondition(value=TdHusFolio.class, condition="HUSFOL_POBLACION_PAR=?")
    List<TdHusFolio> findByHusfolPoblacionPar(java.lang.String husfolPoblacionPar);

    /**
     * Find the first TdHusFolio entity that matches the condition 'where husfolPrimerApellido is equals to'.
     *
     * @param husfolPrimerApellido java.lang.String
     * @return TdHusFolio
     */
    @FindByCondition(value=TdHusFolio.class, condition="HUSFOL_PRIMER_APELLIDO=?")
    TdHusFolio getByHusfolPrimerApellido(java.lang.String husfolPrimerApellido);

    /**
     * Find all TdHusFolio entities that matches the condition 'where husfolPrimerApellido is equals to'.
     *
     * @param husfolPrimerApellido java.lang.String
     * @return Collection of TdHusFolio
     */
    @FindByCondition(value=TdHusFolio.class, condition="HUSFOL_PRIMER_APELLIDO=?")
    List<TdHusFolio> findByHusfolPrimerApellido(java.lang.String husfolPrimerApellido);

    /**
     * Find the first TdHusFolio entity that matches the condition 'where husfolSegundoApellido is equals to'.
     *
     * @param husfolSegundoApellido java.lang.String
     * @return TdHusFolio
     */
    @FindByCondition(value=TdHusFolio.class, condition="HUSFOL_SEGUNDO_APELLIDO=?")
    TdHusFolio getByHusfolSegundoApellido(java.lang.String husfolSegundoApellido);

    /**
     * Find all TdHusFolio entities that matches the condition 'where husfolSegundoApellido is equals to'.
     *
     * @param husfolSegundoApellido java.lang.String
     * @return Collection of TdHusFolio
     */
    @FindByCondition(value=TdHusFolio.class, condition="HUSFOL_SEGUNDO_APELLIDO=?")
    List<TdHusFolio> findByHusfolSegundoApellido(java.lang.String husfolSegundoApellido);

    /**
     * Find the first TdHusFolio entity that matches the condition 'where idEdo is equals to'.
     *
     * @param idEdo java.lang.Integer
     * @return TdHusFolio
     */
    @FindByCondition(value=TdHusFolio.class, condition="ID_EDO=?")
    TdHusFolio getByIdEdo(java.lang.Integer idEdo);

    /**
     * Find all TdHusFolio entities that matches the condition 'where idEdo is equals to'.
     *
     * @param idEdo java.lang.Integer
     * @return Collection of TdHusFolio
     */
    @FindByCondition(value=TdHusFolio.class, condition="ID_EDO=?")
    List<TdHusFolio> findByIdEdo(java.lang.Integer idEdo);

    /**
     * Find the first TdHusFolio entity that matches the condition 'where idMunicipioPar is equals to'.
     *
     * @param idMunicipioPar java.lang.Integer
     * @return TdHusFolio
     */
    @FindByCondition(value=TdHusFolio.class, condition="ID_MUNICIPIO_PAR=?")
    TdHusFolio getByIdMunicipioPar(java.lang.Integer idMunicipioPar);

    /**
     * Find all TdHusFolio entities that matches the condition 'where idMunicipioPar is equals to'.
     *
     * @param idMunicipioPar java.lang.Integer
     * @return Collection of TdHusFolio
     */
    @FindByCondition(value=TdHusFolio.class, condition="ID_MUNICIPIO_PAR=?")
    List<TdHusFolio> findByIdMunicipioPar(java.lang.Integer idMunicipioPar);
}