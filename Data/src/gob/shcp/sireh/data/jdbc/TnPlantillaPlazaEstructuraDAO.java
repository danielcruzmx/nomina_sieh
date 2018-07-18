package gob.shcp.sireh.data.jdbc;

import gob.shcp.fsn.data.annotation.Delete;
import gob.shcp.fsn.data.annotation.FindAll;
import gob.shcp.fsn.data.annotation.FindByCondition;
import gob.shcp.fsn.data.annotation.FindById;
import gob.shcp.fsn.data.annotation.Save;
import gob.shcp.fsn.service.data.orm.JdbcDataService;

import java.util.List;

import gob.shcp.sireh.domain.jdbc.TnPlantillaPlazaEstructura;


/**
 * Data access interface for TnPlantillaPlazaEstructura.
 */
public interface TnPlantillaPlazaEstructuraDAO extends JdbcDataService {
    /**
     * Find TnPlantillaPlazaEstructura entity by its identifier or primary key value.
     *
     * @param id identifier or primary key
     * @return TnPlantillaPlazaEstructura
     */
    @FindById(TnPlantillaPlazaEstructura.class)
    TnPlantillaPlazaEstructura getById(java.lang.Integer id);
    
    /**
     * Get all TnPlantillaPlazaEstructura entities limited by a maximum number of elements.
     *
     * @return Collection of TnPlantillaPlazaEstructura
     */
    @FindAll(TnPlantillaPlazaEstructura.class)
    List<TnPlantillaPlazaEstructura> findAll();
    
    /**
     * Make persistence of TnPlantillaPlazaEstructura entities. If its identifier or primary key is null then create else update.
     *
     * @param entity TnPlantillaPlazaEstructura
     */
    @Save
    void save(TnPlantillaPlazaEstructura entity);
    
    /**
     * Remove TnPlantillaPlazaEstructura entities.
     *
     * @param entity TnPlantillaPlazaEstructura
     */
    @Delete
    void delete(TnPlantillaPlazaEstructura entity);


    /**
     * Find the first TnPlantillaPlazaEstructura entity that matches the condition 'where fecModifico is equals to'.
     *
     * @param fecModifico java.util.Date
     * @return TnPlantillaPlazaEstructura
     */
    @FindByCondition(value=TnPlantillaPlazaEstructura.class, condition="FEC_MODIFICO=?")
    TnPlantillaPlazaEstructura getByFecModifico(java.util.Date fecModifico);

    /**
     * Find all TnPlantillaPlazaEstructura entities that matches the condition 'where fecModifico is equals to'.
     *
     * @param fecModifico java.util.Date
     * @return Collection of TnPlantillaPlazaEstructura
     */
    @FindByCondition(value=TnPlantillaPlazaEstructura.class, condition="FEC_MODIFICO=?")
    List<TnPlantillaPlazaEstructura> findByFecModifico(java.util.Date fecModifico);

    /**
     * Find the first TnPlantillaPlazaEstructura entity that matches the condition 'where usuario is equals to'.
     *
     * @param usuario java.lang.String
     * @return TnPlantillaPlazaEstructura
     */
    @FindByCondition(value=TnPlantillaPlazaEstructura.class, condition="USUARIO=?")
    TnPlantillaPlazaEstructura getByUsuario(java.lang.String usuario);

    /**
     * Find all TnPlantillaPlazaEstructura entities that matches the condition 'where usuario is equals to'.
     *
     * @param usuario java.lang.String
     * @return Collection of TnPlantillaPlazaEstructura
     */
    @FindByCondition(value=TnPlantillaPlazaEstructura.class, condition="USUARIO=?")
    List<TnPlantillaPlazaEstructura> findByUsuario(java.lang.String usuario);

    /**
     * Find the first TnPlantillaPlazaEstructura entity that matches the condition 'where idNivel is equals to'.
     *
     * @param idNivel java.lang.String
     * @return TnPlantillaPlazaEstructura
     */
    @FindByCondition(value=TnPlantillaPlazaEstructura.class, condition="ID_NIVEL=?")
    TnPlantillaPlazaEstructura getByIdNivel(java.lang.String idNivel);

    /**
     * Find all TnPlantillaPlazaEstructura entities that matches the condition 'where idNivel is equals to'.
     *
     * @param idNivel java.lang.String
     * @return Collection of TnPlantillaPlazaEstructura
     */
    @FindByCondition(value=TnPlantillaPlazaEstructura.class, condition="ID_NIVEL=?")
    List<TnPlantillaPlazaEstructura> findByIdNivel(java.lang.String idNivel);

    /**
     * Find the first TnPlantillaPlazaEstructura entity that matches the condition 'where idPlaza is equals to'.
     *
     * @param idPlaza java.lang.Integer
     * @return TnPlantillaPlazaEstructura
     */
    @FindByCondition(value=TnPlantillaPlazaEstructura.class, condition="ID_PLAZA=?")
    TnPlantillaPlazaEstructura getByIdPlaza(java.lang.Integer idPlaza);

    /**
     * Find all TnPlantillaPlazaEstructura entities that matches the condition 'where idPlaza is equals to'.
     *
     * @param idPlaza java.lang.Integer
     * @return Collection of TnPlantillaPlazaEstructura
     */
    @FindByCondition(value=TnPlantillaPlazaEstructura.class, condition="ID_PLAZA=?")
    List<TnPlantillaPlazaEstructura> findByIdPlaza(java.lang.Integer idPlaza);

    /**
     * Find the first TnPlantillaPlazaEstructura entity that matches the condition 'where idPuesto is equals to'.
     *
     * @param idPuesto java.lang.String
     * @return TnPlantillaPlazaEstructura
     */
    @FindByCondition(value=TnPlantillaPlazaEstructura.class, condition="ID_PUESTO=?")
    TnPlantillaPlazaEstructura getByIdPuesto(java.lang.String idPuesto);

    /**
     * Find all TnPlantillaPlazaEstructura entities that matches the condition 'where idPuesto is equals to'.
     *
     * @param idPuesto java.lang.String
     * @return Collection of TnPlantillaPlazaEstructura
     */
    @FindByCondition(value=TnPlantillaPlazaEstructura.class, condition="ID_PUESTO=?")
    List<TnPlantillaPlazaEstructura> findByIdPuesto(java.lang.String idPuesto);

    /**
     * Find the first TnPlantillaPlazaEstructura entity that matches the condition 'where idServPub is equals to'.
     *
     * @param idServPub java.lang.String
     * @return TnPlantillaPlazaEstructura
     */
    @FindByCondition(value=TnPlantillaPlazaEstructura.class, condition="ID_SERV_PUB=?")
    TnPlantillaPlazaEstructura getByIdServPub(java.lang.String idServPub);

    /**
     * Find all TnPlantillaPlazaEstructura entities that matches the condition 'where idServPub is equals to'.
     *
     * @param idServPub java.lang.String
     * @return Collection of TnPlantillaPlazaEstructura
     */
    @FindByCondition(value=TnPlantillaPlazaEstructura.class, condition="ID_SERV_PUB=?")
    List<TnPlantillaPlazaEstructura> findByIdServPub(java.lang.String idServPub);

    /**
     * Find the first TnPlantillaPlazaEstructura entity that matches the condition 'where idUnidad is equals to'.
     *
     * @param idUnidad java.lang.String
     * @return TnPlantillaPlazaEstructura
     */
    @FindByCondition(value=TnPlantillaPlazaEstructura.class, condition="ID_UNIDAD=?")
    TnPlantillaPlazaEstructura getByIdUnidad(java.lang.String idUnidad);

    /**
     * Find all TnPlantillaPlazaEstructura entities that matches the condition 'where idUnidad is equals to'.
     *
     * @param idUnidad java.lang.String
     * @return Collection of TnPlantillaPlazaEstructura
     */
    @FindByCondition(value=TnPlantillaPlazaEstructura.class, condition="ID_UNIDAD=?")
    List<TnPlantillaPlazaEstructura> findByIdUnidad(java.lang.String idUnidad);

    /**
     * Find the first TnPlantillaPlazaEstructura entity that matches the condition 'where idZona is equals to'.
     *
     * @param idZona java.lang.Boolean
     * @return TnPlantillaPlazaEstructura
     */
    @FindByCondition(value=TnPlantillaPlazaEstructura.class, condition="ID_ZONA=?")
    TnPlantillaPlazaEstructura getByIdZona(java.lang.Boolean idZona);

    /**
     * Find all TnPlantillaPlazaEstructura entities that matches the condition 'where idZona is equals to'.
     *
     * @param idZona java.lang.Boolean
     * @return Collection of TnPlantillaPlazaEstructura
     */
    @FindByCondition(value=TnPlantillaPlazaEstructura.class, condition="ID_ZONA=?")
    List<TnPlantillaPlazaEstructura> findByIdZona(java.lang.Boolean idZona);

    /**
     * Find the first TnPlantillaPlazaEstructura entity that matches the condition 'where ppeAdecuacionActual is equals to'.
     *
     * @param ppeAdecuacionActual java.lang.String
     * @return TnPlantillaPlazaEstructura
     */
    @FindByCondition(value=TnPlantillaPlazaEstructura.class, condition="PPE_ADECUACION_ACTUAL=?")
    TnPlantillaPlazaEstructura getByPpeAdecuacionActual(java.lang.String ppeAdecuacionActual);

    /**
     * Find all TnPlantillaPlazaEstructura entities that matches the condition 'where ppeAdecuacionActual is equals to'.
     *
     * @param ppeAdecuacionActual java.lang.String
     * @return Collection of TnPlantillaPlazaEstructura
     */
    @FindByCondition(value=TnPlantillaPlazaEstructura.class, condition="PPE_ADECUACION_ACTUAL=?")
    List<TnPlantillaPlazaEstructura> findByPpeAdecuacionActual(java.lang.String ppeAdecuacionActual);

    /**
     * Find the first TnPlantillaPlazaEstructura entity that matches the condition 'where ppeAdecuacionAnterior is equals to'.
     *
     * @param ppeAdecuacionAnterior java.lang.String
     * @return TnPlantillaPlazaEstructura
     */
    @FindByCondition(value=TnPlantillaPlazaEstructura.class, condition="PPE_ADECUACION_ANTERIOR=?")
    TnPlantillaPlazaEstructura getByPpeAdecuacionAnterior(java.lang.String ppeAdecuacionAnterior);

    /**
     * Find all TnPlantillaPlazaEstructura entities that matches the condition 'where ppeAdecuacionAnterior is equals to'.
     *
     * @param ppeAdecuacionAnterior java.lang.String
     * @return Collection of TnPlantillaPlazaEstructura
     */
    @FindByCondition(value=TnPlantillaPlazaEstructura.class, condition="PPE_ADECUACION_ANTERIOR=?")
    List<TnPlantillaPlazaEstructura> findByPpeAdecuacionAnterior(java.lang.String ppeAdecuacionAnterior);

    /**
     * Find the first TnPlantillaPlazaEstructura entity that matches the condition 'where ppeCancelada is equals to'.
     *
     * @param ppeCancelada java.lang.String
     * @return TnPlantillaPlazaEstructura
     */
    @FindByCondition(value=TnPlantillaPlazaEstructura.class, condition="PPE_CANCELADA=?")
    TnPlantillaPlazaEstructura getByPpeCancelada(java.lang.String ppeCancelada);

    /**
     * Find all TnPlantillaPlazaEstructura entities that matches the condition 'where ppeCancelada is equals to'.
     *
     * @param ppeCancelada java.lang.String
     * @return Collection of TnPlantillaPlazaEstructura
     */
    @FindByCondition(value=TnPlantillaPlazaEstructura.class, condition="PPE_CANCELADA=?")
    List<TnPlantillaPlazaEstructura> findByPpeCancelada(java.lang.String ppeCancelada);

    /**
     * Find the first TnPlantillaPlazaEstructura entity that matches the condition 'where ppeCasos is equals to'.
     *
     * @param ppeCasos java.lang.Integer
     * @return TnPlantillaPlazaEstructura
     */
    @FindByCondition(value=TnPlantillaPlazaEstructura.class, condition="PPE_CASOS=?")
    TnPlantillaPlazaEstructura getByPpeCasos(java.lang.Integer ppeCasos);

    /**
     * Find all TnPlantillaPlazaEstructura entities that matches the condition 'where ppeCasos is equals to'.
     *
     * @param ppeCasos java.lang.Integer
     * @return Collection of TnPlantillaPlazaEstructura
     */
    @FindByCondition(value=TnPlantillaPlazaEstructura.class, condition="PPE_CASOS=?")
    List<TnPlantillaPlazaEstructura> findByPpeCasos(java.lang.Integer ppeCasos);

    /**
     * Find the first TnPlantillaPlazaEstructura entity that matches the condition 'where ppeEntidadFederativa is equals to'.
     *
     * @param ppeEntidadFederativa java.lang.Integer
     * @return TnPlantillaPlazaEstructura
     */
    @FindByCondition(value=TnPlantillaPlazaEstructura.class, condition="PPE_ENTIDAD_FEDERATIVA=?")
    TnPlantillaPlazaEstructura getByPpeEntidadFederativa(java.lang.Integer ppeEntidadFederativa);

    /**
     * Find all TnPlantillaPlazaEstructura entities that matches the condition 'where ppeEntidadFederativa is equals to'.
     *
     * @param ppeEntidadFederativa java.lang.Integer
     * @return Collection of TnPlantillaPlazaEstructura
     */
    @FindByCondition(value=TnPlantillaPlazaEstructura.class, condition="PPE_ENTIDAD_FEDERATIVA=?")
    List<TnPlantillaPlazaEstructura> findByPpeEntidadFederativa(java.lang.Integer ppeEntidadFederativa);

    /**
     * Find the first TnPlantillaPlazaEstructura entity that matches the condition 'where ppeEstauts is equals to'.
     *
     * @param ppeEstauts java.lang.String
     * @return TnPlantillaPlazaEstructura
     */
    @FindByCondition(value=TnPlantillaPlazaEstructura.class, condition="PPE_ESTAUTS=?")
    TnPlantillaPlazaEstructura getByPpeEstauts(java.lang.String ppeEstauts);

    /**
     * Find all TnPlantillaPlazaEstructura entities that matches the condition 'where ppeEstauts is equals to'.
     *
     * @param ppeEstauts java.lang.String
     * @return Collection of TnPlantillaPlazaEstructura
     */
    @FindByCondition(value=TnPlantillaPlazaEstructura.class, condition="PPE_ESTAUTS=?")
    List<TnPlantillaPlazaEstructura> findByPpeEstauts(java.lang.String ppeEstauts);

    /**
     * Find the first TnPlantillaPlazaEstructura entity that matches the condition 'where ppeFinVigencia is equals to'.
     *
     * @param ppeFinVigencia java.util.Date
     * @return TnPlantillaPlazaEstructura
     */
    @FindByCondition(value=TnPlantillaPlazaEstructura.class, condition="PPE_FIN_VIGENCIA=?")
    TnPlantillaPlazaEstructura getByPpeFinVigencia(java.util.Date ppeFinVigencia);

    /**
     * Find all TnPlantillaPlazaEstructura entities that matches the condition 'where ppeFinVigencia is equals to'.
     *
     * @param ppeFinVigencia java.util.Date
     * @return Collection of TnPlantillaPlazaEstructura
     */
    @FindByCondition(value=TnPlantillaPlazaEstructura.class, condition="PPE_FIN_VIGENCIA=?")
    List<TnPlantillaPlazaEstructura> findByPpeFinVigencia(java.util.Date ppeFinVigencia);

    /**
     * Find the first TnPlantillaPlazaEstructura entity that matches the condition 'where ppeImpHono is equals to'.
     *
     * @param ppeImpHono java.lang.Double
     * @return TnPlantillaPlazaEstructura
     */
    @FindByCondition(value=TnPlantillaPlazaEstructura.class, condition="PPE_IMP_HONO=?")
    TnPlantillaPlazaEstructura getByPpeImpHono(java.lang.Double ppeImpHono);

    /**
     * Find all TnPlantillaPlazaEstructura entities that matches the condition 'where ppeImpHono is equals to'.
     *
     * @param ppeImpHono java.lang.Double
     * @return Collection of TnPlantillaPlazaEstructura
     */
    @FindByCondition(value=TnPlantillaPlazaEstructura.class, condition="PPE_IMP_HONO=?")
    List<TnPlantillaPlazaEstructura> findByPpeImpHono(java.lang.Double ppeImpHono);

    /**
     * Find the first TnPlantillaPlazaEstructura entity that matches the condition 'where ppeInicioVigencia is equals to'.
     *
     * @param ppeInicioVigencia java.util.Date
     * @return TnPlantillaPlazaEstructura
     */
    @FindByCondition(value=TnPlantillaPlazaEstructura.class, condition="PPE_INICIO_VIGENCIA=?")
    TnPlantillaPlazaEstructura getByPpeInicioVigencia(java.util.Date ppeInicioVigencia);

    /**
     * Find all TnPlantillaPlazaEstructura entities that matches the condition 'where ppeInicioVigencia is equals to'.
     *
     * @param ppeInicioVigencia java.util.Date
     * @return Collection of TnPlantillaPlazaEstructura
     */
    @FindByCondition(value=TnPlantillaPlazaEstructura.class, condition="PPE_INICIO_VIGENCIA=?")
    List<TnPlantillaPlazaEstructura> findByPpeInicioVigencia(java.util.Date ppeInicioVigencia);

    /**
     * Find the first TnPlantillaPlazaEstructura entity that matches the condition 'where ppeRegularizable is equals to'.
     *
     * @param ppeRegularizable java.lang.String
     * @return TnPlantillaPlazaEstructura
     */
    @FindByCondition(value=TnPlantillaPlazaEstructura.class, condition="PPE_REGULARIZABLE=?")
    TnPlantillaPlazaEstructura getByPpeRegularizable(java.lang.String ppeRegularizable);

    /**
     * Find all TnPlantillaPlazaEstructura entities that matches the condition 'where ppeRegularizable is equals to'.
     *
     * @param ppeRegularizable java.lang.String
     * @return Collection of TnPlantillaPlazaEstructura
     */
    @FindByCondition(value=TnPlantillaPlazaEstructura.class, condition="PPE_REGULARIZABLE=?")
    List<TnPlantillaPlazaEstructura> findByPpeRegularizable(java.lang.String ppeRegularizable);

    /**
     * Find the first TnPlantillaPlazaEstructura entity that matches the condition 'where ppeTipo is equals to'.
     *
     * @param ppeTipo java.lang.String
     * @return TnPlantillaPlazaEstructura
     */
    @FindByCondition(value=TnPlantillaPlazaEstructura.class, condition="PPE_TIPO=?")
    TnPlantillaPlazaEstructura getByPpeTipo(java.lang.String ppeTipo);

    /**
     * Find all TnPlantillaPlazaEstructura entities that matches the condition 'where ppeTipo is equals to'.
     *
     * @param ppeTipo java.lang.String
     * @return Collection of TnPlantillaPlazaEstructura
     */
    @FindByCondition(value=TnPlantillaPlazaEstructura.class, condition="PPE_TIPO=?")
    List<TnPlantillaPlazaEstructura> findByPpeTipo(java.lang.String ppeTipo);

    /**
     * Find the first TnPlantillaPlazaEstructura entity that matches the condition 'where ppeTipoMov is equals to'.
     *
     * @param ppeTipoMov java.lang.String
     * @return TnPlantillaPlazaEstructura
     */
    @FindByCondition(value=TnPlantillaPlazaEstructura.class, condition="PPE_TIPO_MOV=?")
    TnPlantillaPlazaEstructura getByPpeTipoMov(java.lang.String ppeTipoMov);

    /**
     * Find all TnPlantillaPlazaEstructura entities that matches the condition 'where ppeTipoMov is equals to'.
     *
     * @param ppeTipoMov java.lang.String
     * @return Collection of TnPlantillaPlazaEstructura
     */
    @FindByCondition(value=TnPlantillaPlazaEstructura.class, condition="PPE_TIPO_MOV=?")
    List<TnPlantillaPlazaEstructura> findByPpeTipoMov(java.lang.String ppeTipoMov);

    /**
     * Find the first TnPlantillaPlazaEstructura entity that matches the condition 'where ppeTipoPersonal is equals to'.
     *
     * @param ppeTipoPersonal java.lang.String
     * @return TnPlantillaPlazaEstructura
     */
    @FindByCondition(value=TnPlantillaPlazaEstructura.class, condition="PPE_TIPO_PERSONAL=?")
    TnPlantillaPlazaEstructura getByPpeTipoPersonal(java.lang.String ppeTipoPersonal);

    /**
     * Find all TnPlantillaPlazaEstructura entities that matches the condition 'where ppeTipoPersonal is equals to'.
     *
     * @param ppeTipoPersonal java.lang.String
     * @return Collection of TnPlantillaPlazaEstructura
     */
    @FindByCondition(value=TnPlantillaPlazaEstructura.class, condition="PPE_TIPO_PERSONAL=?")
    List<TnPlantillaPlazaEstructura> findByPpeTipoPersonal(java.lang.String ppeTipoPersonal);
}