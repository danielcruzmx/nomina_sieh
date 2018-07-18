package gob.shcp.sireh.data.jdbc;

import gob.shcp.fsn.data.annotation.Delete;
import gob.shcp.fsn.data.annotation.FindAll;
import gob.shcp.fsn.data.annotation.FindByCondition;
import gob.shcp.fsn.data.annotation.FindById;
import gob.shcp.fsn.data.annotation.Save;
import gob.shcp.fsn.service.data.orm.JdbcDataService;

import java.util.List;

import gob.shcp.sireh.domain.jdbc.TnHusMovtos;


/**
 * Data access interface for TnHusMovto.
 */
public interface TnHusMovtoDAO extends JdbcDataService {
    /**
     * Find TnHusMovto entity by its identifier or primary key value.
     *
     * @param id identifier or primary key
     * @return TnHusMovto
     */
    @FindById(TnHusMovtos.class)
    TnHusMovtos getById(gob.shcp.sireh.domain.jdbc.TnHusMovtoPK id);
    
    /**
     * Get all TnHusMovtos entities limited by a maximum number of elements.
     *
     * @return Collection of TnHusMovtos
     */
    @FindAll(TnHusMovtos.class)
    List<TnHusMovtos> findAll();
    
    /**
     * Make persistence of TnHusMovtos entities. If its identifier or primary key is null then create else update.
     *
     * @param entity TnHusMovtos
     */
    @Save
    void save(TnHusMovtos entity);
    
    /**
     * Remove TnHusMovtos entities.
     *
     * @param entity TnHusMovtos
     */
    @Delete
    void delete(TnHusMovtos entity);


    /**
     * Find the first TnHusMovtos entity that matches the condition 'where fecModifico is equals to'.
     *
     * @param fecModifico java.util.Date
     * @return TnHusMovtos
     */
    @FindByCondition(value=TnHusMovtos.class, condition="FEC_MODIFICO=?")
    TnHusMovtos getByFecModifico(java.util.Date fecModifico);

    /**
     * Find all TnHusMovtos entities that matches the condition 'where fecModifico is equals to'.
     *
     * @param fecModifico java.util.Date
     * @return Collection of TnHusMovtos
     */
    @FindByCondition(value=TnHusMovtos.class, condition="FEC_MODIFICO=?")
    List<TnHusMovtos> findByFecModifico(java.util.Date fecModifico);

    /**
     * Find the first TnHusMovtos entity that matches the condition 'where husmovComp is equals to'.
     *
     * @param husmovComp float
     * @return TnHusMovtos
     */
    @FindByCondition(value=TnHusMovtos.class, condition="HUSMOV_COMP=?")
    TnHusMovtos getByHusmovComp(float husmovComp);

    /**
     * Find all TnHusMovtos entities that matches the condition 'where husmovComp is equals to'.
     *
     * @param husmovComp float
     * @return Collection of TnHusMovtos
     */
    @FindByCondition(value=TnHusMovtos.class, condition="HUSMOV_COMP=?")
    List<TnHusMovtos> findByHusmovComp(float husmovComp);

    /**
     * Find the first TnHusMovtos entity that matches the condition 'where husmovMotivo is equals to'.
     *
     * @param husmovMotivo int
     * @return TnHusMovtos
     */
    @FindByCondition(value=TnHusMovtos.class, condition="HUSMOV_MOTIVO=?")
    TnHusMovtos getByHusmovMotivo(int husmovMotivo);

    /**
     * Find all TnHusMovtos entities that matches the condition 'where husmovMotivo is equals to'.
     *
     * @param husmovMotivo int
     * @return Collection of TnHusMovtos
     */
    @FindByCondition(value=TnHusMovtos.class, condition="HUSMOV_MOTIVO=?")
    List<TnHusMovtos> findByHusmovMotivo(int husmovMotivo);

    /**
     * Find the first TnHusMovtos entity that matches the condition 'where husmovNivPto is equals to'.
     *
     * @param husmovNivPto java.lang.String
     * @return TnHusMovtos
     */
    @FindByCondition(value=TnHusMovtos.class, condition="HUSMOV_NIV_PTO=?")
    TnHusMovtos getByHusmovNivPto(java.lang.String husmovNivPto);

    /**
     * Find all TnHusMovtos entities that matches the condition 'where husmovNivPto is equals to'.
     *
     * @param husmovNivPto java.lang.String
     * @return Collection of TnHusMovtos
     */
    @FindByCondition(value=TnHusMovtos.class, condition="HUSMOV_NIV_PTO=?")
    List<TnHusMovtos> findByHusmovNivPto(java.lang.String husmovNivPto);

    /**
     * Find the first TnHusMovtos entity that matches the condition 'where husmovNivTab is equals to'.
     *
     * @param husmovNivTab boolean
     * @return TnHusMovtos
     */
    @FindByCondition(value=TnHusMovtos.class, condition="HUSMOV_NIV_TAB=?")
    TnHusMovtos getByHusmovNivTab(boolean husmovNivTab);

    /**
     * Find all TnHusMovtos entities that matches the condition 'where husmovNivTab is equals to'.
     *
     * @param husmovNivTab boolean
     * @return Collection of TnHusMovtos
     */
    @FindByCondition(value=TnHusMovtos.class, condition="HUSMOV_NIV_TAB=?")
    List<TnHusMovtos> findByHusmovNivTab(boolean husmovNivTab);

    /**
     * Find the first TnHusMovtos entity that matches the condition 'where husmovOtrasPer is equals to'.
     *
     * @param husmovOtrasPer float
     * @return TnHusMovtos
     */
    @FindByCondition(value=TnHusMovtos.class, condition="HUSMOV_OTRAS_PER=?")
    TnHusMovtos getByHusmovOtrasPer(float husmovOtrasPer);

    /**
     * Find all TnHusMovtos entities that matches the condition 'where husmovOtrasPer is equals to'.
     *
     * @param husmovOtrasPer float
     * @return Collection of TnHusMovtos
     */
    @FindByCondition(value=TnHusMovtos.class, condition="HUSMOV_OTRAS_PER=?")
    List<TnHusMovtos> findByHusmovOtrasPer(float husmovOtrasPer);

    /**
     * Find the first TnHusMovtos entity that matches the condition 'where husmovPtda is equals to'.
     *
     * @param husmovPtda int
     * @return TnHusMovtos
     */
    @FindByCondition(value=TnHusMovtos.class, condition="HUSMOV_PTDA=?")
    TnHusMovtos getByHusmovPtda(int husmovPtda);

    /**
     * Find all TnHusMovtos entities that matches the condition 'where husmovPtda is equals to'.
     *
     * @param husmovPtda int
     * @return Collection of TnHusMovtos
     */
    @FindByCondition(value=TnHusMovtos.class, condition="HUSMOV_PTDA=?")
    List<TnHusMovtos> findByHusmovPtda(int husmovPtda);

    /**
     * Find the first TnHusMovtos entity that matches the condition 'where husmovQuinq is equals to'.
     *
     * @param husmovQuinq float
     * @return TnHusMovtos
     */
    @FindByCondition(value=TnHusMovtos.class, condition="HUSMOV_QUINQ=?")
    TnHusMovtos getByHusmovQuinq(float husmovQuinq);

    /**
     * Find all TnHusMovtos entities that matches the condition 'where husmovQuinq is equals to'.
     *
     * @param husmovQuinq float
     * @return Collection of TnHusMovtos
     */
    @FindByCondition(value=TnHusMovtos.class, condition="HUSMOV_QUINQ=?")
    List<TnHusMovtos> findByHusmovQuinq(float husmovQuinq);

    /**
     * Find the first TnHusMovtos entity that matches the condition 'where husmovSalMin is equals to'.
     *
     * @param husmovSalMin float
     * @return TnHusMovtos
     */
    @FindByCondition(value=TnHusMovtos.class, condition="HUSMOV_SAL_MIN=?")
    TnHusMovtos getByHusmovSalMin(float husmovSalMin);

    /**
     * Find all TnHusMovtos entities that matches the condition 'where husmovSalMin is equals to'.
     *
     * @param husmovSalMin float
     * @return Collection of TnHusMovtos
     */
    @FindByCondition(value=TnHusMovtos.class, condition="HUSMOV_SAL_MIN=?")
    List<TnHusMovtos> findByHusmovSalMin(float husmovSalMin);

    /**
     * Find the first TnHusMovtos entity that matches the condition 'where husmovSobresdo is equals to'.
     *
     * @param husmovSobresdo float
     * @return TnHusMovtos
     */
    @FindByCondition(value=TnHusMovtos.class, condition="HUSMOV_SOBRESDO=?")
    TnHusMovtos getByHusmovSobresdo(float husmovSobresdo);

    /**
     * Find all TnHusMovtos entities that matches the condition 'where husmovSobresdo is equals to'.
     *
     * @param husmovSobresdo float
     * @return Collection of TnHusMovtos
     */
    @FindByCondition(value=TnHusMovtos.class, condition="HUSMOV_SOBRESDO=?")
    List<TnHusMovtos> findByHusmovSobresdo(float husmovSobresdo);

    /**
     * Find the first TnHusMovtos entity that matches the condition 'where husmovSueldo is equals to'.
     *
     * @param husmovSueldo float
     * @return TnHusMovtos
     */
    @FindByCondition(value=TnHusMovtos.class, condition="HUSMOV_SUELDO=?")
    TnHusMovtos getByHusmovSueldo(float husmovSueldo);

    /**
     * Find all TnHusMovtos entities that matches the condition 'where husmovSueldo is equals to'.
     *
     * @param husmovSueldo float
     * @return Collection of TnHusMovtos
     */
    @FindByCondition(value=TnHusMovtos.class, condition="HUSMOV_SUELDO=?")
    List<TnHusMovtos> findByHusmovSueldo(float husmovSueldo);

    /**
     * Find the first TnHusMovtos entity that matches the condition 'where husmovZona is equals to'.
     *
     * @param husmovZona int
     * @return TnHusMovtos
     */
    @FindByCondition(value=TnHusMovtos.class, condition="HUSMOV_ZONA=?")
    TnHusMovtos getByHusmovZona(int husmovZona);

    /**
     * Find all TnHusMovtos entities that matches the condition 'where husmovZona is equals to'.
     *
     * @param husmovZona int
     * @return Collection of TnHusMovtos
     */
    @FindByCondition(value=TnHusMovtos.class, condition="HUSMOV_ZONA=?")
    List<TnHusMovtos> findByHusmovZona(int husmovZona);

    /**
     * Find the first TnHusMovtos entity that matches the condition 'where husmovZonaEco is equals to'.
     *
     * @param husmovZonaEco boolean
     * @return TnHusMovtos
     */
    @FindByCondition(value=TnHusMovtos.class, condition="HUSMOV_ZONA_ECO=?")
    TnHusMovtos getByHusmovZonaEco(boolean husmovZonaEco);

    /**
     * Find all TnHusMovtos entities that matches the condition 'where husmovZonaEco is equals to'.
     *
     * @param husmovZonaEco boolean
     * @return Collection of TnHusMovtos
     */
    @FindByCondition(value=TnHusMovtos.class, condition="HUSMOV_ZONA_ECO=?")
    List<TnHusMovtos> findByHusmovZonaEco(boolean husmovZonaEco);

    /**
     * Find the first TnHusMovtos entity that matches the condition 'where idEdo is equals to'.
     *
     * @param idEdo int
     * @return TnHusMovtos
     */
    @FindByCondition(value=TnHusMovtos.class, condition="ID_EDO=?")
    TnHusMovtos getByIdEdo(int idEdo);

    /**
     * Find all TnHusMovtos entities that matches the condition 'where idEdo is equals to'.
     *
     * @param idEdo int
     * @return Collection of TnHusMovtos
     */
    @FindByCondition(value=TnHusMovtos.class, condition="ID_EDO=?")
    List<TnHusMovtos> findByIdEdo(int idEdo);

    /**
     * Find the first TnHusMovtos entity that matches the condition 'where idMunicipio is equals to'.
     *
     * @param idMunicipio int
     * @return TnHusMovtos
     */
    @FindByCondition(value=TnHusMovtos.class, condition="ID_MUNICIPIO=?")
    TnHusMovtos getByIdMunicipio(int idMunicipio);

    /**
     * Find all TnHusMovtos entities that matches the condition 'where idMunicipio is equals to'.
     *
     * @param idMunicipio int
     * @return Collection of TnHusMovtos
     */
    @FindByCondition(value=TnHusMovtos.class, condition="ID_MUNICIPIO=?")
    List<TnHusMovtos> findByIdMunicipio(int idMunicipio);

    /**
     * Find the first TnHusMovtos entity that matches the condition 'where idUnidad is equals to'.
     *
     * @param idUnidad java.lang.String
     * @return TnHusMovtos
     */
    @FindByCondition(value=TnHusMovtos.class, condition="ID_UNIDAD=?")
    TnHusMovtos getByIdUnidad(java.lang.String idUnidad);

    /**
     * Find all TnHusMovtos entities that matches the condition 'where idUnidad is equals to'.
     *
     * @param idUnidad java.lang.String
     * @return Collection of TnHusMovtos
     */
    @FindByCondition(value=TnHusMovtos.class, condition="ID_UNIDAD=?")
    List<TnHusMovtos> findByIdUnidad(java.lang.String idUnidad);

    /**
     * Find the first TnHusMovtos entity that matches the condition 'where usuario is equals to'.
     *
     * @param usuario java.lang.String
     * @return TnHusMovtos
     */
    @FindByCondition(value=TnHusMovtos.class, condition="USUARIO=?")
    TnHusMovtos getByUsuario(java.lang.String usuario);

    /**
     * Find all TnHusMovtos entities that matches the condition 'where usuario is equals to'.
     *
     * @param usuario java.lang.String
     * @return Collection of TnHusMovtos
     */
    @FindByCondition(value=TnHusMovtos.class, condition="USUARIO=?")
    List<TnHusMovtos> findByUsuario(java.lang.String usuario);

    /**
     * Find the first TnHusMovtos entity that matches the condition 'where husmovCategoria is equals to'.
     *
     * @param husmovCategoria java.lang.String
     * @return TnHusMovtos
     */
    @FindByCondition(value=TnHusMovtos.class, condition="HUSMOV_CATEGORIA=?")
    TnHusMovtos getByHusmovCategoria(java.lang.String husmovCategoria);

    /**
     * Find all TnHusMovtos entities that matches the condition 'where husmovCategoria is equals to'.
     *
     * @param husmovCategoria java.lang.String
     * @return Collection of TnHusMovtos
     */
    @FindByCondition(value=TnHusMovtos.class, condition="HUSMOV_CATEGORIA=?")
    List<TnHusMovtos> findByHusmovCategoria(java.lang.String husmovCategoria);

    /**
     * Find the first TnHusMovtos entity that matches the condition 'where husmovDescripPt is equals to'.
     *
     * @param husmovDescripPt java.lang.String
     * @return TnHusMovtos
     */
    @FindByCondition(value=TnHusMovtos.class, condition="HUSMOV_DESCRIP_PT=?")
    TnHusMovtos getByHusmovDescripPt(java.lang.String husmovDescripPt);

    /**
     * Find all TnHusMovtos entities that matches the condition 'where husmovDescripPt is equals to'.
     *
     * @param husmovDescripPt java.lang.String
     * @return Collection of TnHusMovtos
     */
    @FindByCondition(value=TnHusMovtos.class, condition="HUSMOV_DESCRIP_PT=?")
    List<TnHusMovtos> findByHusmovDescripPt(java.lang.String husmovDescripPt);

    /**
     * Find the first TnHusMovtos entity that matches the condition 'where husmovHasta is equals to'.
     *
     * @param husmovHasta java.util.Date
     * @return TnHusMovtos
     */
    @FindByCondition(value=TnHusMovtos.class, condition="HUSMOV_HASTA=?")
    TnHusMovtos getByHusmovHasta(java.util.Date husmovHasta);

    /**
     * Find all TnHusMovtos entities that matches the condition 'where husmovHasta is equals to'.
     *
     * @param husmovHasta java.util.Date
     * @return Collection of TnHusMovtos
     */
    @FindByCondition(value=TnHusMovtos.class, condition="HUSMOV_HASTA=?")
    List<TnHusMovtos> findByHusmovHasta(java.util.Date husmovHasta);

    /**
     * Find the first TnHusMovtos entity that matches the condition 'where husmovMensaje is equals to'.
     *
     * @param husmovMensaje java.lang.String
     * @return TnHusMovtos
     */
    @FindByCondition(value=TnHusMovtos.class, condition="HUSMOV_MENSAJE=?")
    TnHusMovtos getByHusmovMensaje(java.lang.String husmovMensaje);

    /**
     * Find all TnHusMovtos entities that matches the condition 'where husmovMensaje is equals to'.
     *
     * @param husmovMensaje java.lang.String
     * @return Collection of TnHusMovtos
     */
    @FindByCondition(value=TnHusMovtos.class, condition="HUSMOV_MENSAJE=?")
    List<TnHusMovtos> findByHusmovMensaje(java.lang.String husmovMensaje);

    /**
     * Find the first TnHusMovtos entity that matches the condition 'where husmovSupMedAp is equals to'.
     *
     * @param husmovSupMedAp java.lang.String
     * @return TnHusMovtos
     */
    @FindByCondition(value=TnHusMovtos.class, condition="HUSMOV_SUP_MED_AP=?")
    TnHusMovtos getByHusmovSupMedAp(java.lang.String husmovSupMedAp);

    /**
     * Find all TnHusMovtos entities that matches the condition 'where husmovSupMedAp is equals to'.
     *
     * @param husmovSupMedAp java.lang.String
     * @return Collection of TnHusMovtos
     */
    @FindByCondition(value=TnHusMovtos.class, condition="HUSMOV_SUP_MED_AP=?")
    List<TnHusMovtos> findByHusmovSupMedAp(java.lang.String husmovSupMedAp);

    /**
     * Find the first TnHusMovtos entity that matches the condition 'where husmovTipo is equals to'.
     *
     * @param husmovTipo java.lang.String
     * @return TnHusMovtos
     */
    @FindByCondition(value=TnHusMovtos.class, condition="HUSMOV_TIPO=?")
    TnHusMovtos getByHusmovTipo(java.lang.String husmovTipo);

    /**
     * Find all TnHusMovtos entities that matches the condition 'where husmovTipo is equals to'.
     *
     * @param husmovTipo java.lang.String
     * @return Collection of TnHusMovtos
     */
    @FindByCondition(value=TnHusMovtos.class, condition="HUSMOV_TIPO=?")
    List<TnHusMovtos> findByHusmovTipo(java.lang.String husmovTipo);
}