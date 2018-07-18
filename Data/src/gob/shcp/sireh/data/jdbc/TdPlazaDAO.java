package gob.shcp.sireh.data.jdbc;

import gob.shcp.fsn.data.annotation.Delete;
import gob.shcp.fsn.data.annotation.FindAll;
import gob.shcp.fsn.data.annotation.FindByCondition;
import gob.shcp.fsn.data.annotation.FindById;
import gob.shcp.fsn.data.annotation.Save;
import gob.shcp.fsn.service.data.orm.JdbcDataService;

import java.util.List;

import gob.shcp.sireh.domain.jdbc.TdPlaza;


/**
 * Data access interface for TdPlaza.
 */
public interface TdPlazaDAO extends JdbcDataService {
    /**
     * Find TdPlaza entity by its identifier or primary key value.
     *
     * @param id identifier or primary key
     * @return TdPlaza
     */
    @FindById(TdPlaza.class)
    TdPlaza getById(java.lang.Integer id);
    
    /**
     * Get all TdPlaza entities limited by a maximum number of elements.
     *
     * @return Collection of TdPlaza
     */
    @FindAll(TdPlaza.class)
    List<TdPlaza> findAll();
    
    /**
     * Make persistence of TdPlaza entities. If its identifier or primary key is null then create else update.
     *
     * @param entity TdPlaza
     */
    @Save
    void save(TdPlaza entity);
    
    /**
     * Remove TdPlaza entities.
     *
     * @param entity TdPlaza
     */
    @Delete
    void delete(TdPlaza entity);


    /**
     * Find the first TdPlaza entity that matches the condition 'where fecModifico is equals to'.
     *
     * @param fecModifico java.util.Date
     * @return TdPlaza
     */
    @FindByCondition(value=TdPlaza.class, condition="FEC_MODIFICO=?")
    TdPlaza getByFecModifico(java.util.Date fecModifico);

    /**
     * Find all TdPlaza entities that matches the condition 'where fecModifico is equals to'.
     *
     * @param fecModifico java.util.Date
     * @return Collection of TdPlaza
     */
    @FindByCondition(value=TdPlaza.class, condition="FEC_MODIFICO=?")
    List<TdPlaza> findByFecModifico(java.util.Date fecModifico);

    /**
     * Find the first TdPlaza entity that matches the condition 'where usuario is equals to'.
     *
     * @param usuario java.lang.String
     * @return TdPlaza
     */
    @FindByCondition(value=TdPlaza.class, condition="USUARIO=?")
    TdPlaza getByUsuario(java.lang.String usuario);

    /**
     * Find all TdPlaza entities that matches the condition 'where usuario is equals to'.
     *
     * @param usuario java.lang.String
     * @return Collection of TdPlaza
     */
    @FindByCondition(value=TdPlaza.class, condition="USUARIO=?")
    List<TdPlaza> findByUsuario(java.lang.String usuario);

    /**
     * Find the first TdPlaza entity that matches the condition 'where idEdoNom is equals to'.
     *
     * @param idEdoNom java.lang.Integer
     * @return TdPlaza
     */
    @FindByCondition(value=TdPlaza.class, condition="ID_EDO_NOM=?")
    TdPlaza getByIdEdoNom(java.lang.Integer idEdoNom);

    /**
     * Find all TdPlaza entities that matches the condition 'where idEdoNom is equals to'.
     *
     * @param idEdoNom java.lang.Integer
     * @return Collection of TdPlaza
     */
    @FindByCondition(value=TdPlaza.class, condition="ID_EDO_NOM=?")
    List<TdPlaza> findByIdEdoNom(java.lang.Integer idEdoNom);

    /**
     * Find the first TdPlaza entity that matches the condition 'where idEdoPre is equals to'.
     *
     * @param idEdoPre java.lang.Integer
     * @return TdPlaza
     */
    @FindByCondition(value=TdPlaza.class, condition="ID_EDO_PRE=?")
    TdPlaza getByIdEdoPre(java.lang.Integer idEdoPre);

    /**
     * Find all TdPlaza entities that matches the condition 'where idEdoPre is equals to'.
     *
     * @param idEdoPre java.lang.Integer
     * @return Collection of TdPlaza
     */
    @FindByCondition(value=TdPlaza.class, condition="ID_EDO_PRE=?")
    List<TdPlaza> findByIdEdoPre(java.lang.Integer idEdoPre);

    /**
     * Find the first TdPlaza entity that matches the condition 'where idInmueble is equals to'.
     *
     * @param idInmueble java.lang.Integer
     * @return TdPlaza
     */
    @FindByCondition(value=TdPlaza.class, condition="ID_INMUEBLE=?")
    TdPlaza getByIdInmueble(java.lang.Integer idInmueble);

    /**
     * Find all TdPlaza entities that matches the condition 'where idInmueble is equals to'.
     *
     * @param idInmueble java.lang.Integer
     * @return Collection of TdPlaza
     */
    @FindByCondition(value=TdPlaza.class, condition="ID_INMUEBLE=?")
    List<TdPlaza> findByIdInmueble(java.lang.Integer idInmueble);

    /**
     * Find the first TdPlaza entity that matches the condition 'where idMovtoPersona is equals to'.
     *
     * @param idMovtoPersona java.lang.Integer
     * @return TdPlaza
     */
    @FindByCondition(value=TdPlaza.class, condition="ID_MOVTO_PERSONA=?")
    TdPlaza getByIdMovtoPersona(java.lang.Integer idMovtoPersona);

    /**
     * Find all TdPlaza entities that matches the condition 'where idMovtoPersona is equals to'.
     *
     * @param idMovtoPersona java.lang.Integer
     * @return Collection of TdPlaza
     */
    @FindByCondition(value=TdPlaza.class, condition="ID_MOVTO_PERSONA=?")
    List<TdPlaza> findByIdMovtoPersona(java.lang.Integer idMovtoPersona);

    /**
     * Find the first TdPlaza entity that matches the condition 'where idMuniNom is equals to'.
     *
     * @param idMuniNom java.lang.Integer
     * @return TdPlaza
     */
    @FindByCondition(value=TdPlaza.class, condition="ID_MUNI_NOM=?")
    TdPlaza getByIdMuniNom(java.lang.Integer idMuniNom);

    /**
     * Find all TdPlaza entities that matches the condition 'where idMuniNom is equals to'.
     *
     * @param idMuniNom java.lang.Integer
     * @return Collection of TdPlaza
     */
    @FindByCondition(value=TdPlaza.class, condition="ID_MUNI_NOM=?")
    List<TdPlaza> findByIdMuniNom(java.lang.Integer idMuniNom);

    /**
     * Find the first TdPlaza entity that matches the condition 'where idNodo is equals to'.
     *
     * @param idNodo java.lang.String
     * @return TdPlaza
     */
    @FindByCondition(value=TdPlaza.class, condition="ID_NODO=?")
    TdPlaza getByIdNodo(java.lang.String idNodo);

    /**
     * Find all TdPlaza entities that matches the condition 'where idNodo is equals to'.
     *
     * @param idNodo java.lang.String
     * @return Collection of TdPlaza
     */
    @FindByCondition(value=TdPlaza.class, condition="ID_NODO=?")
    List<TdPlaza> findByIdNodo(java.lang.String idNodo);

    /**
     * Find the first TdPlaza entity that matches the condition 'where idProyAmpliaPre is equals to'.
     *
     * @param idProyAmpliaPre java.lang.String
     * @return TdPlaza
     */
    @FindByCondition(value=TdPlaza.class, condition="ID_PROY_AMPLIA_PRE=?")
    TdPlaza getByIdProyAmpliaPre(java.lang.String idProyAmpliaPre);

    /**
     * Find all TdPlaza entities that matches the condition 'where idProyAmpliaPre is equals to'.
     *
     * @param idProyAmpliaPre java.lang.String
     * @return Collection of TdPlaza
     */
    @FindByCondition(value=TdPlaza.class, condition="ID_PROY_AMPLIA_PRE=?")
    List<TdPlaza> findByIdProyAmpliaPre(java.lang.String idProyAmpliaPre);

    /**
     * Find the first TdPlaza entity that matches the condition 'where idProyReducePre is equals to'.
     *
     * @param idProyReducePre java.lang.String
     * @return TdPlaza
     */
    @FindByCondition(value=TdPlaza.class, condition="ID_PROY_REDUCE_PRE=?")
    TdPlaza getByIdProyReducePre(java.lang.String idProyReducePre);

    /**
     * Find all TdPlaza entities that matches the condition 'where idProyReducePre is equals to'.
     *
     * @param idProyReducePre java.lang.String
     * @return Collection of TdPlaza
     */
    @FindByCondition(value=TdPlaza.class, condition="ID_PROY_REDUCE_PRE=?")
    List<TdPlaza> findByIdProyReducePre(java.lang.String idProyReducePre);

    /**
     * Find the first TdPlaza entity that matches the condition 'where idPtoEstrategico is equals to'.
     *
     * @param idPtoEstrategico java.lang.String
     * @return TdPlaza
     */
    @FindByCondition(value=TdPlaza.class, condition="ID_PTO_ESTRATEGICO=?")
    TdPlaza getByIdPtoEstrategico(java.lang.String idPtoEstrategico);

    /**
     * Find all TdPlaza entities that matches the condition 'where idPtoEstrategico is equals to'.
     *
     * @param idPtoEstrategico java.lang.String
     * @return Collection of TdPlaza
     */
    @FindByCondition(value=TdPlaza.class, condition="ID_PTO_ESTRATEGICO=?")
    List<TdPlaza> findByIdPtoEstrategico(java.lang.String idPtoEstrategico);

    /**
     * Find the first TdPlaza entity that matches the condition 'where idPuestoPre is equals to'.
     *
     * @param idPuestoPre java.lang.String
     * @return TdPlaza
     */
    @FindByCondition(value=TdPlaza.class, condition="ID_PUESTO_PRE=?")
    TdPlaza getByIdPuestoPre(java.lang.String idPuestoPre);

    /**
     * Find all TdPlaza entities that matches the condition 'where idPuestoPre is equals to'.
     *
     * @param idPuestoPre java.lang.String
     * @return Collection of TdPlaza
     */
    @FindByCondition(value=TdPlaza.class, condition="ID_PUESTO_PRE=?")
    List<TdPlaza> findByIdPuestoPre(java.lang.String idPuestoPre);

    /**
     * Find the first TdPlaza entity that matches the condition 'where idRangoNom is equals to'.
     *
     * @param idRangoNom java.lang.Integer
     * @return TdPlaza
     */
    @FindByCondition(value=TdPlaza.class, condition="ID_RANGO_NOM=?")
    TdPlaza getByIdRangoNom(java.lang.Integer idRangoNom);

    /**
     * Find all TdPlaza entities that matches the condition 'where idRangoNom is equals to'.
     *
     * @param idRangoNom java.lang.Integer
     * @return Collection of TdPlaza
     */
    @FindByCondition(value=TdPlaza.class, condition="ID_RANGO_NOM=?")
    List<TdPlaza> findByIdRangoNom(java.lang.Integer idRangoNom);

    /**
     * Find the first TdPlaza entity that matches the condition 'where idRangoPre is equals to'.
     *
     * @param idRangoPre java.lang.Integer
     * @return TdPlaza
     */
    @FindByCondition(value=TdPlaza.class, condition="ID_RANGO_PRE=?")
    TdPlaza getByIdRangoPre(java.lang.Integer idRangoPre);

    /**
     * Find all TdPlaza entities that matches the condition 'where idRangoPre is equals to'.
     *
     * @param idRangoPre java.lang.Integer
     * @return Collection of TdPlaza
     */
    @FindByCondition(value=TdPlaza.class, condition="ID_RANGO_PRE=?")
    List<TdPlaza> findByIdRangoPre(java.lang.Integer idRangoPre);

    /**
     * Find the first TdPlaza entity that matches the condition 'where idServPub is equals to'.
     *
     * @param idServPub java.lang.String
     * @return TdPlaza
     */
    @FindByCondition(value=TdPlaza.class, condition="ID_SERV_PUB=?")
    TdPlaza getByIdServPub(java.lang.String idServPub);

    /**
     * Find all TdPlaza entities that matches the condition 'where idServPub is equals to'.
     *
     * @param idServPub java.lang.String
     * @return Collection of TdPlaza
     */
    @FindByCondition(value=TdPlaza.class, condition="ID_SERV_PUB=?")
    List<TdPlaza> findByIdServPub(java.lang.String idServPub);

    /**
     * Find the first TdPlaza entity that matches the condition 'where idUnidadPre is equals to'.
     *
     * @param idUnidadPre java.lang.String
     * @return TdPlaza
     */
    @FindByCondition(value=TdPlaza.class, condition="ID_UNIDAD_PRE=?")
    TdPlaza getByIdUnidadPre(java.lang.String idUnidadPre);

    /**
     * Find all TdPlaza entities that matches the condition 'where idUnidadPre is equals to'.
     *
     * @param idUnidadPre java.lang.String
     * @return Collection of TdPlaza
     */
    @FindByCondition(value=TdPlaza.class, condition="ID_UNIDAD_PRE=?")
    List<TdPlaza> findByIdUnidadPre(java.lang.String idUnidadPre);

    /**
     * Find the first TdPlaza entity that matches the condition 'where idZonaDistNom is equals to'.
     *
     * @param idZonaDistNom java.lang.Integer
     * @return TdPlaza
     */
    @FindByCondition(value=TdPlaza.class, condition="ID_ZONA_DIST_NOM=?")
    TdPlaza getByIdZonaDistNom(java.lang.Integer idZonaDistNom);

    /**
     * Find all TdPlaza entities that matches the condition 'where idZonaDistNom is equals to'.
     *
     * @param idZonaDistNom java.lang.Integer
     * @return Collection of TdPlaza
     */
    @FindByCondition(value=TdPlaza.class, condition="ID_ZONA_DIST_NOM=?")
    List<TdPlaza> findByIdZonaDistNom(java.lang.Integer idZonaDistNom);

    /**
     * Find the first TdPlaza entity that matches the condition 'where plazaAla is equals to'.
     *
     * @param plazaAla java.lang.String
     * @return TdPlaza
     */
    @FindByCondition(value=TdPlaza.class, condition="PLAZA_ALA=?")
    TdPlaza getByPlazaAla(java.lang.String plazaAla);

    /**
     * Find all TdPlaza entities that matches the condition 'where plazaAla is equals to'.
     *
     * @param plazaAla java.lang.String
     * @return Collection of TdPlaza
     */
    @FindByCondition(value=TdPlaza.class, condition="PLAZA_ALA=?")
    List<TdPlaza> findByPlazaAla(java.lang.String plazaAla);

    /**
     * Find the first TdPlaza entity that matches the condition 'where plazaConmut is equals to'.
     *
     * @param plazaConmut java.lang.String
     * @return TdPlaza
     */
    @FindByCondition(value=TdPlaza.class, condition="PLAZA_CONMUT=?")
    TdPlaza getByPlazaConmut(java.lang.String plazaConmut);

    /**
     * Find all TdPlaza entities that matches the condition 'where plazaConmut is equals to'.
     *
     * @param plazaConmut java.lang.String
     * @return Collection of TdPlaza
     */
    @FindByCondition(value=TdPlaza.class, condition="PLAZA_CONMUT=?")
    List<TdPlaza> findByPlazaConmut(java.lang.String plazaConmut);

    /**
     * Find the first TdPlaza entity that matches the condition 'where plazaEdif is equals to'.
     *
     * @param plazaEdif java.lang.String
     * @return TdPlaza
     */
    @FindByCondition(value=TdPlaza.class, condition="PLAZA_EDIF=?")
    TdPlaza getByPlazaEdif(java.lang.String plazaEdif);

    /**
     * Find all TdPlaza entities that matches the condition 'where plazaEdif is equals to'.
     *
     * @param plazaEdif java.lang.String
     * @return Collection of TdPlaza
     */
    @FindByCondition(value=TdPlaza.class, condition="PLAZA_EDIF=?")
    List<TdPlaza> findByPlazaEdif(java.lang.String plazaEdif);

    /**
     * Find the first TdPlaza entity that matches the condition 'where plazaExt1 is equals to'.
     *
     * @param plazaExt1 java.lang.String
     * @return TdPlaza
     */
    @FindByCondition(value=TdPlaza.class, condition="PLAZA_EXT1=?")
    TdPlaza getByPlazaExt1(java.lang.String plazaExt1);

    /**
     * Find all TdPlaza entities that matches the condition 'where plazaExt1 is equals to'.
     *
     * @param plazaExt1 java.lang.String
     * @return Collection of TdPlaza
     */
    @FindByCondition(value=TdPlaza.class, condition="PLAZA_EXT1=?")
    List<TdPlaza> findByPlazaExt1(java.lang.String plazaExt1);

    /**
     * Find the first TdPlaza entity that matches the condition 'where plazaExt2 is equals to'.
     *
     * @param plazaExt2 java.lang.String
     * @return TdPlaza
     */
    @FindByCondition(value=TdPlaza.class, condition="PLAZA_EXT2=?")
    TdPlaza getByPlazaExt2(java.lang.String plazaExt2);

    /**
     * Find all TdPlaza entities that matches the condition 'where plazaExt2 is equals to'.
     *
     * @param plazaExt2 java.lang.String
     * @return Collection of TdPlaza
     */
    @FindByCondition(value=TdPlaza.class, condition="PLAZA_EXT2=?")
    List<TdPlaza> findByPlazaExt2(java.lang.String plazaExt2);

    /**
     * Find the first TdPlaza entity that matches the condition 'where plazaFinCont is equals to'.
     *
     * @param plazaFinCont java.util.Date
     * @return TdPlaza
     */
    @FindByCondition(value=TdPlaza.class, condition="PLAZA_FIN_CONT=?")
    TdPlaza getByPlazaFinCont(java.util.Date plazaFinCont);

    /**
     * Find all TdPlaza entities that matches the condition 'where plazaFinCont is equals to'.
     *
     * @param plazaFinCont java.util.Date
     * @return Collection of TdPlaza
     */
    @FindByCondition(value=TdPlaza.class, condition="PLAZA_FIN_CONT=?")
    List<TdPlaza> findByPlazaFinCont(java.util.Date plazaFinCont);

    /**
     * Find the first TdPlaza entity that matches the condition 'where plazaFinLic is equals to'.
     *
     * @param plazaFinLic java.util.Date
     * @return TdPlaza
     */
    @FindByCondition(value=TdPlaza.class, condition="PLAZA_FIN_LIC=?")
    TdPlaza getByPlazaFinLic(java.util.Date plazaFinLic);

    /**
     * Find all TdPlaza entities that matches the condition 'where plazaFinLic is equals to'.
     *
     * @param plazaFinLic java.util.Date
     * @return Collection of TdPlaza
     */
    @FindByCondition(value=TdPlaza.class, condition="PLAZA_FIN_LIC=?")
    List<TdPlaza> findByPlazaFinLic(java.util.Date plazaFinLic);

    /**
     * Find the first TdPlaza entity that matches the condition 'where plazaImpHono is equals to'.
     *
     * @param plazaImpHono java.lang.Double
     * @return TdPlaza
     */
    @FindByCondition(value=TdPlaza.class, condition="PLAZA_IMP_HONO=?")
    TdPlaza getByPlazaImpHono(java.lang.Double plazaImpHono);

    /**
     * Find all TdPlaza entities that matches the condition 'where plazaImpHono is equals to'.
     *
     * @param plazaImpHono java.lang.Double
     * @return Collection of TdPlaza
     */
    @FindByCondition(value=TdPlaza.class, condition="PLAZA_IMP_HONO=?")
    List<TdPlaza> findByPlazaImpHono(java.lang.Double plazaImpHono);

    /**
     * Find the first TdPlaza entity that matches the condition 'where plazaIniCont is equals to'.
     *
     * @param plazaIniCont java.util.Date
     * @return TdPlaza
     */
    @FindByCondition(value=TdPlaza.class, condition="PLAZA_INI_CONT=?")
    TdPlaza getByPlazaIniCont(java.util.Date plazaIniCont);

    /**
     * Find all TdPlaza entities that matches the condition 'where plazaIniCont is equals to'.
     *
     * @param plazaIniCont java.util.Date
     * @return Collection of TdPlaza
     */
    @FindByCondition(value=TdPlaza.class, condition="PLAZA_INI_CONT=?")
    List<TdPlaza> findByPlazaIniCont(java.util.Date plazaIniCont);

    /**
     * Find the first TdPlaza entity that matches the condition 'where plazaIniLic is equals to'.
     *
     * @param plazaIniLic java.util.Date
     * @return TdPlaza
     */
    @FindByCondition(value=TdPlaza.class, condition="PLAZA_INI_LIC=?")
    TdPlaza getByPlazaIniLic(java.util.Date plazaIniLic);

    /**
     * Find all TdPlaza entities that matches the condition 'where plazaIniLic is equals to'.
     *
     * @param plazaIniLic java.util.Date
     * @return Collection of TdPlaza
     */
    @FindByCondition(value=TdPlaza.class, condition="PLAZA_INI_LIC=?")
    List<TdPlaza> findByPlazaIniLic(java.util.Date plazaIniLic);

    /**
     * Find the first TdPlaza entity that matches the condition 'where plazaOfna is equals to'.
     *
     * @param plazaOfna java.lang.String
     * @return TdPlaza
     */
    @FindByCondition(value=TdPlaza.class, condition="PLAZA_OFNA=?")
    TdPlaza getByPlazaOfna(java.lang.String plazaOfna);

    /**
     * Find all TdPlaza entities that matches the condition 'where plazaOfna is equals to'.
     *
     * @param plazaOfna java.lang.String
     * @return Collection of TdPlaza
     */
    @FindByCondition(value=TdPlaza.class, condition="PLAZA_OFNA=?")
    List<TdPlaza> findByPlazaOfna(java.lang.String plazaOfna);

    /**
     * Find the first TdPlaza entity that matches the condition 'where plazaPiso is equals to'.
     *
     * @param plazaPiso java.lang.String
     * @return TdPlaza
     */
    @FindByCondition(value=TdPlaza.class, condition="PLAZA_PISO=?")
    TdPlaza getByPlazaPiso(java.lang.String plazaPiso);

    /**
     * Find all TdPlaza entities that matches the condition 'where plazaPiso is equals to'.
     *
     * @param plazaPiso java.lang.String
     * @return Collection of TdPlaza
     */
    @FindByCondition(value=TdPlaza.class, condition="PLAZA_PISO=?")
    List<TdPlaza> findByPlazaPiso(java.lang.String plazaPiso);

    /**
     * Find the first TdPlaza entity that matches the condition 'where plazaQnaCaptura is equals to'.
     *
     * @param plazaQnaCaptura java.lang.Integer
     * @return TdPlaza
     */
    @FindByCondition(value=TdPlaza.class, condition="PLAZA_QNA_CAPTURA=?")
    TdPlaza getByPlazaQnaCaptura(java.lang.Integer plazaQnaCaptura);

    /**
     * Find all TdPlaza entities that matches the condition 'where plazaQnaCaptura is equals to'.
     *
     * @param plazaQnaCaptura java.lang.Integer
     * @return Collection of TdPlaza
     */
    @FindByCondition(value=TdPlaza.class, condition="PLAZA_QNA_CAPTURA=?")
    List<TdPlaza> findByPlazaQnaCaptura(java.lang.Integer plazaQnaCaptura);

    /**
     * Find the first TdPlaza entity that matches the condition 'where plazaReferencia is equals to'.
     *
     * @param plazaReferencia java.lang.String
     * @return TdPlaza
     */
    @FindByCondition(value=TdPlaza.class, condition="PLAZA_REFERENCIA=?")
    TdPlaza getByPlazaReferencia(java.lang.String plazaReferencia);

    /**
     * Find all TdPlaza entities that matches the condition 'where plazaReferencia is equals to'.
     *
     * @param plazaReferencia java.lang.String
     * @return Collection of TdPlaza
     */
    @FindByCondition(value=TdPlaza.class, condition="PLAZA_REFERENCIA=?")
    List<TdPlaza> findByPlazaReferencia(java.lang.String plazaReferencia);

    /**
     * Find the first TdPlaza entity that matches the condition 'where plazaRespaldo is equals to'.
     *
     * @param plazaRespaldo java.lang.Integer
     * @return TdPlaza
     */
    @FindByCondition(value=TdPlaza.class, condition="PLAZA_RESPALDO=?")
    TdPlaza getByPlazaRespaldo(java.lang.Integer plazaRespaldo);

    /**
     * Find all TdPlaza entities that matches the condition 'where plazaRespaldo is equals to'.
     *
     * @param plazaRespaldo java.lang.Integer
     * @return Collection of TdPlaza
     */
    @FindByCondition(value=TdPlaza.class, condition="PLAZA_RESPALDO=?")
    List<TdPlaza> findByPlazaRespaldo(java.lang.Integer plazaRespaldo);

    /**
     * Find the first TdPlaza entity that matches the condition 'where plazaRfc is equals to'.
     *
     * @param plazaRfc java.lang.String
     * @return TdPlaza
     */
    @FindByCondition(value=TdPlaza.class, condition="PLAZA_RFC=?")
    TdPlaza getByPlazaRfc(java.lang.String plazaRfc);

    /**
     * Find all TdPlaza entities that matches the condition 'where plazaRfc is equals to'.
     *
     * @param plazaRfc java.lang.String
     * @return Collection of TdPlaza
     */
    @FindByCondition(value=TdPlaza.class, condition="PLAZA_RFC=?")
    List<TdPlaza> findByPlazaRfc(java.lang.String plazaRfc);

    /**
     * Find the first TdPlaza entity that matches the condition 'where plazaTelOf1 is equals to'.
     *
     * @param plazaTelOf1 java.lang.String
     * @return TdPlaza
     */
    @FindByCondition(value=TdPlaza.class, condition="PLAZA_TEL_OF1=?")
    TdPlaza getByPlazaTelOf1(java.lang.String plazaTelOf1);

    /**
     * Find all TdPlaza entities that matches the condition 'where plazaTelOf1 is equals to'.
     *
     * @param plazaTelOf1 java.lang.String
     * @return Collection of TdPlaza
     */
    @FindByCondition(value=TdPlaza.class, condition="PLAZA_TEL_OF1=?")
    List<TdPlaza> findByPlazaTelOf1(java.lang.String plazaTelOf1);

    /**
     * Find the first TdPlaza entity that matches the condition 'where plazaTelOf2 is equals to'.
     *
     * @param plazaTelOf2 java.lang.String
     * @return TdPlaza
     */
    @FindByCondition(value=TdPlaza.class, condition="PLAZA_TEL_OF2=?")
    TdPlaza getByPlazaTelOf2(java.lang.String plazaTelOf2);

    /**
     * Find all TdPlaza entities that matches the condition 'where plazaTelOf2 is equals to'.
     *
     * @param plazaTelOf2 java.lang.String
     * @return Collection of TdPlaza
     */
    @FindByCondition(value=TdPlaza.class, condition="PLAZA_TEL_OF2=?")
    List<TdPlaza> findByPlazaTelOf2(java.lang.String plazaTelOf2);

    /**
     * Find the first TdPlaza entity that matches the condition 'where plazaUltimoMovto is equals to'.
     *
     * @param plazaUltimoMovto java.util.Date
     * @return TdPlaza
     */
    @FindByCondition(value=TdPlaza.class, condition="PLAZA_ULTIMO_MOVTO=?")
    TdPlaza getByPlazaUltimoMovto(java.util.Date plazaUltimoMovto);

    /**
     * Find all TdPlaza entities that matches the condition 'where plazaUltimoMovto is equals to'.
     *
     * @param plazaUltimoMovto java.util.Date
     * @return Collection of TdPlaza
     */
    @FindByCondition(value=TdPlaza.class, condition="PLAZA_ULTIMO_MOVTO=?")
    List<TdPlaza> findByPlazaUltimoMovto(java.util.Date plazaUltimoMovto);
}