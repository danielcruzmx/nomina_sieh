package gob.shcp.sireh.data.jdbc;

import gob.shcp.fsn.data.annotation.Delete;
import gob.shcp.fsn.data.annotation.FindAll;
import gob.shcp.fsn.data.annotation.FindByCondition;
import gob.shcp.fsn.data.annotation.FindById;
import gob.shcp.fsn.data.annotation.Save;
import gob.shcp.fsn.service.data.orm.JdbcDataService;

import java.util.List;

import gob.shcp.sireh.domain.jdbc.TnMovtosEmpPla;


/**
 * Data access interface for TnMovtosEmpPla.
 */
public interface TnMovtosEmpPlaDAO extends JdbcDataService {
    /**
     * Find TnMovtosEmpPla entity by its identifier or primary key value.
     *
     * @param id identifier or primary key
     * @return TnMovtosEmpPla
     */
    @FindById(TnMovtosEmpPla.class)
    TnMovtosEmpPla getById(java.lang.Integer id);
    
    /**
     * Get all TnMovtosEmpPla entities limited by a maximum number of elements.
     *
     * @return Collection of TnMovtosEmpPla
     */
    @FindAll(TnMovtosEmpPla.class)
    List<TnMovtosEmpPla> findAll();
    
    /**
     * Make persistence of TnMovtosEmpPla entities. If its identifier or primary key is null then create else update.
     *
     * @param entity TnMovtosEmpPla
     */
    @Save
    void save(TnMovtosEmpPla entity);
    
    /**
     * Remove TnMovtosEmpPla entities.
     *
     * @param entity TnMovtosEmpPla
     */
    @Delete
    void delete(TnMovtosEmpPla entity);


    /**
     * Find the first TnMovtosEmpPla entity that matches the condition 'where idPlaza is equals to'.
     *
     * @param idPlaza int
     * @return TnMovtosEmpPla
     */
    @FindByCondition(value=TnMovtosEmpPla.class, condition="ID_PLAZA=?")
    TnMovtosEmpPla getByIdPlaza(int idPlaza);

    /**
     * Find all TnMovtosEmpPla entities that matches the condition 'where idPlaza is equals to'.
     *
     * @param idPlaza int
     * @return Collection of TnMovtosEmpPla
     */
    @FindByCondition(value=TnMovtosEmpPla.class, condition="ID_PLAZA=?")
    List<TnMovtosEmpPla> findByIdPlaza(int idPlaza);

    /**
     * Find the first TnMovtosEmpPla entity that matches the condition 'where fecModifico is equals to'.
     *
     * @param fecModifico java.util.Date
     * @return TnMovtosEmpPla
     */
    @FindByCondition(value=TnMovtosEmpPla.class, condition="FEC_MODIFICO=?")
    TnMovtosEmpPla getByFecModifico(java.util.Date fecModifico);

    /**
     * Find all TnMovtosEmpPla entities that matches the condition 'where fecModifico is equals to'.
     *
     * @param fecModifico java.util.Date
     * @return Collection of TnMovtosEmpPla
     */
    @FindByCondition(value=TnMovtosEmpPla.class, condition="FEC_MODIFICO=?")
    List<TnMovtosEmpPla> findByFecModifico(java.util.Date fecModifico);

    /**
     * Find the first TnMovtosEmpPla entity that matches the condition 'where idBancoSar is equals to'.
     *
     * @param idBancoSar java.lang.String
     * @return TnMovtosEmpPla
     */
    @FindByCondition(value=TnMovtosEmpPla.class, condition="ID_BANCO_SAR=?")
    TnMovtosEmpPla getByIdBancoSar(java.lang.String idBancoSar);

    /**
     * Find all TnMovtosEmpPla entities that matches the condition 'where idBancoSar is equals to'.
     *
     * @param idBancoSar java.lang.String
     * @return Collection of TnMovtosEmpPla
     */
    @FindByCondition(value=TnMovtosEmpPla.class, condition="ID_BANCO_SAR=?")
    List<TnMovtosEmpPla> findByIdBancoSar(java.lang.String idBancoSar);

    /**
     * Find the first TnMovtosEmpPla entity that matches the condition 'where idEdoCivil is equals to'.
     *
     * @param idEdoCivil java.lang.String
     * @return TnMovtosEmpPla
     */
    @FindByCondition(value=TnMovtosEmpPla.class, condition="ID_EDO_CIVIL=?")
    TnMovtosEmpPla getByIdEdoCivil(java.lang.String idEdoCivil);

    /**
     * Find all TnMovtosEmpPla entities that matches the condition 'where idEdoCivil is equals to'.
     *
     * @param idEdoCivil java.lang.String
     * @return Collection of TnMovtosEmpPla
     */
    @FindByCondition(value=TnMovtosEmpPla.class, condition="ID_EDO_CIVIL=?")
    List<TnMovtosEmpPla> findByIdEdoCivil(java.lang.String idEdoCivil);

    /**
     * Find the first TnMovtosEmpPla entity that matches the condition 'where idEdoNom is equals to'.
     *
     * @param idEdoNom java.lang.Integer
     * @return TnMovtosEmpPla
     */
    @FindByCondition(value=TnMovtosEmpPla.class, condition="ID_EDO_NOM=?")
    TnMovtosEmpPla getByIdEdoNom(java.lang.Integer idEdoNom);

    /**
     * Find all TnMovtosEmpPla entities that matches the condition 'where idEdoNom is equals to'.
     *
     * @param idEdoNom java.lang.Integer
     * @return Collection of TnMovtosEmpPla
     */
    @FindByCondition(value=TnMovtosEmpPla.class, condition="ID_EDO_NOM=?")
    List<TnMovtosEmpPla> findByIdEdoNom(java.lang.Integer idEdoNom);

    /**
     * Find the first TnMovtosEmpPla entity that matches the condition 'where idEdoNomAnt is equals to'.
     *
     * @param idEdoNomAnt java.lang.Integer
     * @return TnMovtosEmpPla
     */
    @FindByCondition(value=TnMovtosEmpPla.class, condition="ID_EDO_NOM_ANT=?")
    TnMovtosEmpPla getByIdEdoNomAnt(java.lang.Integer idEdoNomAnt);

    /**
     * Find all TnMovtosEmpPla entities that matches the condition 'where idEdoNomAnt is equals to'.
     *
     * @param idEdoNomAnt java.lang.Integer
     * @return Collection of TnMovtosEmpPla
     */
    @FindByCondition(value=TnMovtosEmpPla.class, condition="ID_EDO_NOM_ANT=?")
    List<TnMovtosEmpPla> findByIdEdoNomAnt(java.lang.Integer idEdoNomAnt);

    /**
     * Find the first TnMovtosEmpPla entity that matches the condition 'where idEdoPre is equals to'.
     *
     * @param idEdoPre java.lang.Integer
     * @return TnMovtosEmpPla
     */
    @FindByCondition(value=TnMovtosEmpPla.class, condition="ID_EDO_PRE=?")
    TnMovtosEmpPla getByIdEdoPre(java.lang.Integer idEdoPre);

    /**
     * Find all TnMovtosEmpPla entities that matches the condition 'where idEdoPre is equals to'.
     *
     * @param idEdoPre java.lang.Integer
     * @return Collection of TnMovtosEmpPla
     */
    @FindByCondition(value=TnMovtosEmpPla.class, condition="ID_EDO_PRE=?")
    List<TnMovtosEmpPla> findByIdEdoPre(java.lang.Integer idEdoPre);

    /**
     * Find the first TnMovtosEmpPla entity that matches the condition 'where idEspProtcivil is equals to'.
     *
     * @param idEspProtcivil java.lang.Integer
     * @return TnMovtosEmpPla
     */
    @FindByCondition(value=TnMovtosEmpPla.class, condition="ID_ESP_PROTCIVIL=?")
    TnMovtosEmpPla getByIdEspProtcivil(java.lang.Integer idEspProtcivil);

    /**
     * Find all TnMovtosEmpPla entities that matches the condition 'where idEspProtcivil is equals to'.
     *
     * @param idEspProtcivil java.lang.Integer
     * @return Collection of TnMovtosEmpPla
     */
    @FindByCondition(value=TnMovtosEmpPla.class, condition="ID_ESP_PROTCIVIL=?")
    List<TnMovtosEmpPla> findByIdEspProtcivil(java.lang.Integer idEspProtcivil);

    /**
     * Find the first TnMovtosEmpPla entity that matches the condition 'where idGenero is equals to'.
     *
     * @param idGenero java.lang.String
     * @return TnMovtosEmpPla
     */
    @FindByCondition(value=TnMovtosEmpPla.class, condition="ID_GENERO=?")
    TnMovtosEmpPla getByIdGenero(java.lang.String idGenero);

    /**
     * Find all TnMovtosEmpPla entities that matches the condition 'where idGenero is equals to'.
     *
     * @param idGenero java.lang.String
     * @return Collection of TnMovtosEmpPla
     */
    @FindByCondition(value=TnMovtosEmpPla.class, condition="ID_GENERO=?")
    List<TnMovtosEmpPla> findByIdGenero(java.lang.String idGenero);

    /**
     * Find the first TnMovtosEmpPla entity that matches the condition 'where idGrupoPago is equals to'.
     *
     * @param idGrupoPago java.lang.String
     * @return TnMovtosEmpPla
     */
    @FindByCondition(value=TnMovtosEmpPla.class, condition="ID_GRUPO_PAGO=?")
    TnMovtosEmpPla getByIdGrupoPago(java.lang.String idGrupoPago);

    /**
     * Find all TnMovtosEmpPla entities that matches the condition 'where idGrupoPago is equals to'.
     *
     * @param idGrupoPago java.lang.String
     * @return Collection of TnMovtosEmpPla
     */
    @FindByCondition(value=TnMovtosEmpPla.class, condition="ID_GRUPO_PAGO=?")
    List<TnMovtosEmpPla> findByIdGrupoPago(java.lang.String idGrupoPago);

    /**
     * Find the first TnMovtosEmpPla entity that matches the condition 'where idInmueble is equals to'.
     *
     * @param idInmueble java.lang.Integer
     * @return TnMovtosEmpPla
     */
    @FindByCondition(value=TnMovtosEmpPla.class, condition="ID_INMUEBLE=?")
    TnMovtosEmpPla getByIdInmueble(java.lang.Integer idInmueble);

    /**
     * Find all TnMovtosEmpPla entities that matches the condition 'where idInmueble is equals to'.
     *
     * @param idInmueble java.lang.Integer
     * @return Collection of TnMovtosEmpPla
     */
    @FindByCondition(value=TnMovtosEmpPla.class, condition="ID_INMUEBLE=?")
    List<TnMovtosEmpPla> findByIdInmueble(java.lang.Integer idInmueble);

    /**
     * Find the first TnMovtosEmpPla entity that matches the condition 'where idInstEducativa is equals to'.
     *
     * @param idInstEducativa java.lang.Integer
     * @return TnMovtosEmpPla
     */
    @FindByCondition(value=TnMovtosEmpPla.class, condition="ID_INST_EDUCATIVA=?")
    TnMovtosEmpPla getByIdInstEducativa(java.lang.Integer idInstEducativa);

    /**
     * Find all TnMovtosEmpPla entities that matches the condition 'where idInstEducativa is equals to'.
     *
     * @param idInstEducativa java.lang.Integer
     * @return Collection of TnMovtosEmpPla
     */
    @FindByCondition(value=TnMovtosEmpPla.class, condition="ID_INST_EDUCATIVA=?")
    List<TnMovtosEmpPla> findByIdInstEducativa(java.lang.Integer idInstEducativa);

    /**
     * Find the first TnMovtosEmpPla entity that matches the condition 'where idInstProtcivil is equals to'.
     *
     * @param idInstProtcivil java.lang.Integer
     * @return TnMovtosEmpPla
     */
    @FindByCondition(value=TnMovtosEmpPla.class, condition="ID_INST_PROTCIVIL=?")
    TnMovtosEmpPla getByIdInstProtcivil(java.lang.Integer idInstProtcivil);

    /**
     * Find all TnMovtosEmpPla entities that matches the condition 'where idInstProtcivil is equals to'.
     *
     * @param idInstProtcivil java.lang.Integer
     * @return Collection of TnMovtosEmpPla
     */
    @FindByCondition(value=TnMovtosEmpPla.class, condition="ID_INST_PROTCIVIL=?")
    List<TnMovtosEmpPla> findByIdInstProtcivil(java.lang.Integer idInstProtcivil);

    /**
     * Find the first TnMovtosEmpPla entity that matches the condition 'where idJerarquiaAnt is equals to'.
     *
     * @param idJerarquiaAnt java.lang.String
     * @return TnMovtosEmpPla
     */
    @FindByCondition(value=TnMovtosEmpPla.class, condition="ID_JERARQUIA_ANT=?")
    TnMovtosEmpPla getByIdJerarquiaAnt(java.lang.String idJerarquiaAnt);

    /**
     * Find all TnMovtosEmpPla entities that matches the condition 'where idJerarquiaAnt is equals to'.
     *
     * @param idJerarquiaAnt java.lang.String
     * @return Collection of TnMovtosEmpPla
     */
    @FindByCondition(value=TnMovtosEmpPla.class, condition="ID_JERARQUIA_ANT=?")
    List<TnMovtosEmpPla> findByIdJerarquiaAnt(java.lang.String idJerarquiaAnt);

    /**
     * Find the first TnMovtosEmpPla entity that matches the condition 'where idJerarquiaNom is equals to'.
     *
     * @param idJerarquiaNom java.lang.String
     * @return TnMovtosEmpPla
     */
    @FindByCondition(value=TnMovtosEmpPla.class, condition="ID_JERARQUIA_NOM=?")
    TnMovtosEmpPla getByIdJerarquiaNom(java.lang.String idJerarquiaNom);

    /**
     * Find all TnMovtosEmpPla entities that matches the condition 'where idJerarquiaNom is equals to'.
     *
     * @param idJerarquiaNom java.lang.String
     * @return Collection of TnMovtosEmpPla
     */
    @FindByCondition(value=TnMovtosEmpPla.class, condition="ID_JERARQUIA_NOM=?")
    List<TnMovtosEmpPla> findByIdJerarquiaNom(java.lang.String idJerarquiaNom);

    /**
     * Find the first TnMovtosEmpPla entity that matches the condition 'where idMovtoPersona is equals to'.
     *
     * @param idMovtoPersona java.lang.Integer
     * @return TnMovtosEmpPla
     */
    @FindByCondition(value=TnMovtosEmpPla.class, condition="ID_MOVTO_PERSONA=?")
    TnMovtosEmpPla getByIdMovtoPersona(java.lang.Integer idMovtoPersona);

    /**
     * Find all TnMovtosEmpPla entities that matches the condition 'where idMovtoPersona is equals to'.
     *
     * @param idMovtoPersona java.lang.Integer
     * @return Collection of TnMovtosEmpPla
     */
    @FindByCondition(value=TnMovtosEmpPla.class, condition="ID_MOVTO_PERSONA=?")
    List<TnMovtosEmpPla> findByIdMovtoPersona(java.lang.Integer idMovtoPersona);

    /**
     * Find the first TnMovtosEmpPla entity that matches the condition 'where idMuniNom is equals to'.
     *
     * @param idMuniNom java.lang.Integer
     * @return TnMovtosEmpPla
     */
    @FindByCondition(value=TnMovtosEmpPla.class, condition="ID_MUNI_NOM=?")
    TnMovtosEmpPla getByIdMuniNom(java.lang.Integer idMuniNom);

    /**
     * Find all TnMovtosEmpPla entities that matches the condition 'where idMuniNom is equals to'.
     *
     * @param idMuniNom java.lang.Integer
     * @return Collection of TnMovtosEmpPla
     */
    @FindByCondition(value=TnMovtosEmpPla.class, condition="ID_MUNI_NOM=?")
    List<TnMovtosEmpPla> findByIdMuniNom(java.lang.Integer idMuniNom);

    /**
     * Find the first TnMovtosEmpPla entity that matches the condition 'where idMuniNomAnt is equals to'.
     *
     * @param idMuniNomAnt java.lang.Integer
     * @return TnMovtosEmpPla
     */
    @FindByCondition(value=TnMovtosEmpPla.class, condition="ID_MUNI_NOM_ANT=?")
    TnMovtosEmpPla getByIdMuniNomAnt(java.lang.Integer idMuniNomAnt);

    /**
     * Find all TnMovtosEmpPla entities that matches the condition 'where idMuniNomAnt is equals to'.
     *
     * @param idMuniNomAnt java.lang.Integer
     * @return Collection of TnMovtosEmpPla
     */
    @FindByCondition(value=TnMovtosEmpPla.class, condition="ID_MUNI_NOM_ANT=?")
    List<TnMovtosEmpPla> findByIdMuniNomAnt(java.lang.Integer idMuniNomAnt);

    /**
     * Find the first TnMovtosEmpPla entity that matches the condition 'where idNacionalidad is equals to'.
     *
     * @param idNacionalidad java.lang.String
     * @return TnMovtosEmpPla
     */
    @FindByCondition(value=TnMovtosEmpPla.class, condition="ID_NACIONALIDAD=?")
    TnMovtosEmpPla getByIdNacionalidad(java.lang.String idNacionalidad);

    /**
     * Find all TnMovtosEmpPla entities that matches the condition 'where idNacionalidad is equals to'.
     *
     * @param idNacionalidad java.lang.String
     * @return Collection of TnMovtosEmpPla
     */
    @FindByCondition(value=TnMovtosEmpPla.class, condition="ID_NACIONALIDAD=?")
    List<TnMovtosEmpPla> findByIdNacionalidad(java.lang.String idNacionalidad);

    /**
     * Find the first TnMovtosEmpPla entity that matches the condition 'where idNivelEscolar is equals to'.
     *
     * @param idNivelEscolar java.lang.Integer
     * @return TnMovtosEmpPla
     */
    @FindByCondition(value=TnMovtosEmpPla.class, condition="ID_NIVEL_ESCOLAR=?")
    TnMovtosEmpPla getByIdNivelEscolar(java.lang.Integer idNivelEscolar);

    /**
     * Find all TnMovtosEmpPla entities that matches the condition 'where idNivelEscolar is equals to'.
     *
     * @param idNivelEscolar java.lang.Integer
     * @return Collection of TnMovtosEmpPla
     */
    @FindByCondition(value=TnMovtosEmpPla.class, condition="ID_NIVEL_ESCOLAR=?")
    List<TnMovtosEmpPla> findByIdNivelEscolar(java.lang.Integer idNivelEscolar);

    /**
     * Find the first TnMovtosEmpPla entity that matches the condition 'where idNivelPtoAnt is equals to'.
     *
     * @param idNivelPtoAnt java.lang.String
     * @return TnMovtosEmpPla
     */
    @FindByCondition(value=TnMovtosEmpPla.class, condition="ID_NIVEL_PTO_ANT=?")
    TnMovtosEmpPla getByIdNivelPtoAnt(java.lang.String idNivelPtoAnt);

    /**
     * Find all TnMovtosEmpPla entities that matches the condition 'where idNivelPtoAnt is equals to'.
     *
     * @param idNivelPtoAnt java.lang.String
     * @return Collection of TnMovtosEmpPla
     */
    @FindByCondition(value=TnMovtosEmpPla.class, condition="ID_NIVEL_PTO_ANT=?")
    List<TnMovtosEmpPla> findByIdNivelPtoAnt(java.lang.String idNivelPtoAnt);

    /**
     * Find the first TnMovtosEmpPla entity that matches the condition 'where idNivelPtoNom is equals to'.
     *
     * @param idNivelPtoNom java.lang.String
     * @return TnMovtosEmpPla
     */
    @FindByCondition(value=TnMovtosEmpPla.class, condition="ID_NIVEL_PTO_NOM=?")
    TnMovtosEmpPla getByIdNivelPtoNom(java.lang.String idNivelPtoNom);

    /**
     * Find all TnMovtosEmpPla entities that matches the condition 'where idNivelPtoNom is equals to'.
     *
     * @param idNivelPtoNom java.lang.String
     * @return Collection of TnMovtosEmpPla
     */
    @FindByCondition(value=TnMovtosEmpPla.class, condition="ID_NIVEL_PTO_NOM=?")
    List<TnMovtosEmpPla> findByIdNivelPtoNom(java.lang.String idNivelPtoNom);

    /**
     * Find the first TnMovtosEmpPla entity that matches the condition 'where idNombramientoAnt is equals to'.
     *
     * @param idNombramientoAnt java.lang.String
     * @return TnMovtosEmpPla
     */
    @FindByCondition(value=TnMovtosEmpPla.class, condition="ID_NOMBRAMIENTO_ANT=?")
    TnMovtosEmpPla getByIdNombramientoAnt(java.lang.String idNombramientoAnt);

    /**
     * Find all TnMovtosEmpPla entities that matches the condition 'where idNombramientoAnt is equals to'.
     *
     * @param idNombramientoAnt java.lang.String
     * @return Collection of TnMovtosEmpPla
     */
    @FindByCondition(value=TnMovtosEmpPla.class, condition="ID_NOMBRAMIENTO_ANT=?")
    List<TnMovtosEmpPla> findByIdNombramientoAnt(java.lang.String idNombramientoAnt);

    /**
     * Find the first TnMovtosEmpPla entity that matches the condition 'where idNombramientoNom is equals to'.
     *
     * @param idNombramientoNom java.lang.String
     * @return TnMovtosEmpPla
     */
    @FindByCondition(value=TnMovtosEmpPla.class, condition="ID_NOMBRAMIENTO_NOM=?")
    TnMovtosEmpPla getByIdNombramientoNom(java.lang.String idNombramientoNom);

    /**
     * Find all TnMovtosEmpPla entities that matches the condition 'where idNombramientoNom is equals to'.
     *
     * @param idNombramientoNom java.lang.String
     * @return Collection of TnMovtosEmpPla
     */
    @FindByCondition(value=TnMovtosEmpPla.class, condition="ID_NOMBRAMIENTO_NOM=?")
    List<TnMovtosEmpPla> findByIdNombramientoNom(java.lang.String idNombramientoNom);

    /**
     * Find the first TnMovtosEmpPla entity that matches the condition 'where idProfnCarrera is equals to'.
     *
     * @param idProfnCarrera java.lang.Float
     * @return TnMovtosEmpPla
     */
    @FindByCondition(value=TnMovtosEmpPla.class, condition="ID_PROFN_CARRERA=?")
    TnMovtosEmpPla getByIdProfnCarrera(java.lang.Float idProfnCarrera);

    /**
     * Find all TnMovtosEmpPla entities that matches the condition 'where idProfnCarrera is equals to'.
     *
     * @param idProfnCarrera java.lang.Float
     * @return Collection of TnMovtosEmpPla
     */
    @FindByCondition(value=TnMovtosEmpPla.class, condition="ID_PROFN_CARRERA=?")
    List<TnMovtosEmpPla> findByIdProfnCarrera(java.lang.Float idProfnCarrera);

    /**
     * Find the first TnMovtosEmpPla entity that matches the condition 'where idPtoEstrategico is equals to'.
     *
     * @param idPtoEstrategico java.lang.String
     * @return TnMovtosEmpPla
     */
    @FindByCondition(value=TnMovtosEmpPla.class, condition="ID_PTO_ESTRATEGICO=?")
    TnMovtosEmpPla getByIdPtoEstrategico(java.lang.String idPtoEstrategico);

    /**
     * Find all TnMovtosEmpPla entities that matches the condition 'where idPtoEstrategico is equals to'.
     *
     * @param idPtoEstrategico java.lang.String
     * @return Collection of TnMovtosEmpPla
     */
    @FindByCondition(value=TnMovtosEmpPla.class, condition="ID_PTO_ESTRATEGICO=?")
    List<TnMovtosEmpPla> findByIdPtoEstrategico(java.lang.String idPtoEstrategico);

    /**
     * Find the first TnMovtosEmpPla entity that matches the condition 'where idPuestoNom is equals to'.
     *
     * @param idPuestoNom java.lang.String
     * @return TnMovtosEmpPla
     */
    @FindByCondition(value=TnMovtosEmpPla.class, condition="ID_PUESTO_NOM=?")
    TnMovtosEmpPla getByIdPuestoNom(java.lang.String idPuestoNom);

    /**
     * Find all TnMovtosEmpPla entities that matches the condition 'where idPuestoNom is equals to'.
     *
     * @param idPuestoNom java.lang.String
     * @return Collection of TnMovtosEmpPla
     */
    @FindByCondition(value=TnMovtosEmpPla.class, condition="ID_PUESTO_NOM=?")
    List<TnMovtosEmpPla> findByIdPuestoNom(java.lang.String idPuestoNom);

    /**
     * Find the first TnMovtosEmpPla entity that matches the condition 'where idPuestoNomAnt is equals to'.
     *
     * @param idPuestoNomAnt java.lang.String
     * @return TnMovtosEmpPla
     */
    @FindByCondition(value=TnMovtosEmpPla.class, condition="ID_PUESTO_NOM_ANT=?")
    TnMovtosEmpPla getByIdPuestoNomAnt(java.lang.String idPuestoNomAnt);

    /**
     * Find all TnMovtosEmpPla entities that matches the condition 'where idPuestoNomAnt is equals to'.
     *
     * @param idPuestoNomAnt java.lang.String
     * @return Collection of TnMovtosEmpPla
     */
    @FindByCondition(value=TnMovtosEmpPla.class, condition="ID_PUESTO_NOM_ANT=?")
    List<TnMovtosEmpPla> findByIdPuestoNomAnt(java.lang.String idPuestoNomAnt);

    /**
     * Find the first TnMovtosEmpPla entity that matches the condition 'where idPuestoPre is equals to'.
     *
     * @param idPuestoPre java.lang.String
     * @return TnMovtosEmpPla
     */
    @FindByCondition(value=TnMovtosEmpPla.class, condition="ID_PUESTO_PRE=?")
    TnMovtosEmpPla getByIdPuestoPre(java.lang.String idPuestoPre);

    /**
     * Find all TnMovtosEmpPla entities that matches the condition 'where idPuestoPre is equals to'.
     *
     * @param idPuestoPre java.lang.String
     * @return Collection of TnMovtosEmpPla
     */
    @FindByCondition(value=TnMovtosEmpPla.class, condition="ID_PUESTO_PRE=?")
    List<TnMovtosEmpPla> findByIdPuestoPre(java.lang.String idPuestoPre);

    /**
     * Find the first TnMovtosEmpPla entity that matches the condition 'where idRangoNom is equals to'.
     *
     * @param idRangoNom java.lang.Integer
     * @return TnMovtosEmpPla
     */
    @FindByCondition(value=TnMovtosEmpPla.class, condition="ID_RANGO_NOM=?")
    TnMovtosEmpPla getByIdRangoNom(java.lang.Integer idRangoNom);

    /**
     * Find all TnMovtosEmpPla entities that matches the condition 'where idRangoNom is equals to'.
     *
     * @param idRangoNom java.lang.Integer
     * @return Collection of TnMovtosEmpPla
     */
    @FindByCondition(value=TnMovtosEmpPla.class, condition="ID_RANGO_NOM=?")
    List<TnMovtosEmpPla> findByIdRangoNom(java.lang.Integer idRangoNom);

    /**
     * Find the first TnMovtosEmpPla entity that matches the condition 'where idRangoNomAnt is equals to'.
     *
     * @param idRangoNomAnt java.lang.Integer
     * @return TnMovtosEmpPla
     */
    @FindByCondition(value=TnMovtosEmpPla.class, condition="ID_RANGO_NOM_ANT=?")
    TnMovtosEmpPla getByIdRangoNomAnt(java.lang.Integer idRangoNomAnt);

    /**
     * Find all TnMovtosEmpPla entities that matches the condition 'where idRangoNomAnt is equals to'.
     *
     * @param idRangoNomAnt java.lang.Integer
     * @return Collection of TnMovtosEmpPla
     */
    @FindByCondition(value=TnMovtosEmpPla.class, condition="ID_RANGO_NOM_ANT=?")
    List<TnMovtosEmpPla> findByIdRangoNomAnt(java.lang.Integer idRangoNomAnt);

    /**
     * Find the first TnMovtosEmpPla entity that matches the condition 'where idRangoPre is equals to'.
     *
     * @param idRangoPre java.lang.Integer
     * @return TnMovtosEmpPla
     */
    @FindByCondition(value=TnMovtosEmpPla.class, condition="ID_RANGO_PRE=?")
    TnMovtosEmpPla getByIdRangoPre(java.lang.Integer idRangoPre);

    /**
     * Find all TnMovtosEmpPla entities that matches the condition 'where idRangoPre is equals to'.
     *
     * @param idRangoPre java.lang.Integer
     * @return Collection of TnMovtosEmpPla
     */
    @FindByCondition(value=TnMovtosEmpPla.class, condition="ID_RANGO_PRE=?")
    List<TnMovtosEmpPla> findByIdRangoPre(java.lang.Integer idRangoPre);

    /**
     * Find the first TnMovtosEmpPla entity that matches the condition 'where idRusp is equals to'.
     *
     * @param idRusp java.lang.Integer
     * @return TnMovtosEmpPla
     */
    @FindByCondition(value=TnMovtosEmpPla.class, condition="ID_RUSP=?")
    TnMovtosEmpPla getByIdRusp(java.lang.Integer idRusp);

    /**
     * Find all TnMovtosEmpPla entities that matches the condition 'where idRusp is equals to'.
     *
     * @param idRusp java.lang.Integer
     * @return Collection of TnMovtosEmpPla
     */
    @FindByCondition(value=TnMovtosEmpPla.class, condition="ID_RUSP=?")
    List<TnMovtosEmpPla> findByIdRusp(java.lang.Integer idRusp);

    /**
     * Find the first TnMovtosEmpPla entity that matches the condition 'where idServPub is equals to'.
     *
     * @param idServPub java.lang.String
     * @return TnMovtosEmpPla
     */
    @FindByCondition(value=TnMovtosEmpPla.class, condition="ID_SERV_PUB=?")
    TnMovtosEmpPla getByIdServPub(java.lang.String idServPub);

    /**
     * Find all TnMovtosEmpPla entities that matches the condition 'where idServPub is equals to'.
     *
     * @param idServPub java.lang.String
     * @return Collection of TnMovtosEmpPla
     */
    @FindByCondition(value=TnMovtosEmpPla.class, condition="ID_SERV_PUB=?")
    List<TnMovtosEmpPla> findByIdServPub(java.lang.String idServPub);

    /**
     * Find the first TnMovtosEmpPla entity that matches the condition 'where idSituacionPlaza is equals to'.
     *
     * @param idSituacionPlaza java.lang.String
     * @return TnMovtosEmpPla
     */
    @FindByCondition(value=TnMovtosEmpPla.class, condition="ID_SITUACION_PLAZA=?")
    TnMovtosEmpPla getByIdSituacionPlaza(java.lang.String idSituacionPlaza);

    /**
     * Find all TnMovtosEmpPla entities that matches the condition 'where idSituacionPlaza is equals to'.
     *
     * @param idSituacionPlaza java.lang.String
     * @return Collection of TnMovtosEmpPla
     */
    @FindByCondition(value=TnMovtosEmpPla.class, condition="ID_SITUACION_PLAZA=?")
    List<TnMovtosEmpPla> findByIdSituacionPlaza(java.lang.String idSituacionPlaza);

    /**
     * Find the first TnMovtosEmpPla entity that matches the condition 'where idTipoPago is equals to'.
     *
     * @param idTipoPago java.lang.String
     * @return TnMovtosEmpPla
     */
    @FindByCondition(value=TnMovtosEmpPla.class, condition="ID_TIPO_PAGO=?")
    TnMovtosEmpPla getByIdTipoPago(java.lang.String idTipoPago);

    /**
     * Find all TnMovtosEmpPla entities that matches the condition 'where idTipoPago is equals to'.
     *
     * @param idTipoPago java.lang.String
     * @return Collection of TnMovtosEmpPla
     */
    @FindByCondition(value=TnMovtosEmpPla.class, condition="ID_TIPO_PAGO=?")
    List<TnMovtosEmpPla> findByIdTipoPago(java.lang.String idTipoPago);

    /**
     * Find the first TnMovtosEmpPla entity that matches the condition 'where idTipoPlaza is equals to'.
     *
     * @param idTipoPlaza java.lang.String
     * @return TnMovtosEmpPla
     */
    @FindByCondition(value=TnMovtosEmpPla.class, condition="ID_TIPO_PLAZA=?")
    TnMovtosEmpPla getByIdTipoPlaza(java.lang.String idTipoPlaza);

    /**
     * Find all TnMovtosEmpPla entities that matches the condition 'where idTipoPlaza is equals to'.
     *
     * @param idTipoPlaza java.lang.String
     * @return Collection of TnMovtosEmpPla
     */
    @FindByCondition(value=TnMovtosEmpPla.class, condition="ID_TIPO_PLAZA=?")
    List<TnMovtosEmpPla> findByIdTipoPlaza(java.lang.String idTipoPlaza);

    /**
     * Find the first TnMovtosEmpPla entity that matches the condition 'where idUnidadNom is equals to'.
     *
     * @param idUnidadNom java.lang.String
     * @return TnMovtosEmpPla
     */
    @FindByCondition(value=TnMovtosEmpPla.class, condition="ID_UNIDAD_NOM=?")
    TnMovtosEmpPla getByIdUnidadNom(java.lang.String idUnidadNom);

    /**
     * Find all TnMovtosEmpPla entities that matches the condition 'where idUnidadNom is equals to'.
     *
     * @param idUnidadNom java.lang.String
     * @return Collection of TnMovtosEmpPla
     */
    @FindByCondition(value=TnMovtosEmpPla.class, condition="ID_UNIDAD_NOM=?")
    List<TnMovtosEmpPla> findByIdUnidadNom(java.lang.String idUnidadNom);

    /**
     * Find the first TnMovtosEmpPla entity that matches the condition 'where idUnidadNomAnt is equals to'.
     *
     * @param idUnidadNomAnt java.lang.String
     * @return TnMovtosEmpPla
     */
    @FindByCondition(value=TnMovtosEmpPla.class, condition="ID_UNIDAD_NOM_ANT=?")
    TnMovtosEmpPla getByIdUnidadNomAnt(java.lang.String idUnidadNomAnt);

    /**
     * Find all TnMovtosEmpPla entities that matches the condition 'where idUnidadNomAnt is equals to'.
     *
     * @param idUnidadNomAnt java.lang.String
     * @return Collection of TnMovtosEmpPla
     */
    @FindByCondition(value=TnMovtosEmpPla.class, condition="ID_UNIDAD_NOM_ANT=?")
    List<TnMovtosEmpPla> findByIdUnidadNomAnt(java.lang.String idUnidadNomAnt);

    /**
     * Find the first TnMovtosEmpPla entity that matches the condition 'where idUnidadPre is equals to'.
     *
     * @param idUnidadPre java.lang.String
     * @return TnMovtosEmpPla
     */
    @FindByCondition(value=TnMovtosEmpPla.class, condition="ID_UNIDAD_PRE=?")
    TnMovtosEmpPla getByIdUnidadPre(java.lang.String idUnidadPre);

    /**
     * Find all TnMovtosEmpPla entities that matches the condition 'where idUnidadPre is equals to'.
     *
     * @param idUnidadPre java.lang.String
     * @return Collection of TnMovtosEmpPla
     */
    @FindByCondition(value=TnMovtosEmpPla.class, condition="ID_UNIDAD_PRE=?")
    List<TnMovtosEmpPla> findByIdUnidadPre(java.lang.String idUnidadPre);

    /**
     * Find the first TnMovtosEmpPla entity that matches the condition 'where idZonaDistNom is equals to'.
     *
     * @param idZonaDistNom java.lang.Integer
     * @return TnMovtosEmpPla
     */
    @FindByCondition(value=TnMovtosEmpPla.class, condition="ID_ZONA_DIST_NOM=?")
    TnMovtosEmpPla getByIdZonaDistNom(java.lang.Integer idZonaDistNom);

    /**
     * Find all TnMovtosEmpPla entities that matches the condition 'where idZonaDistNom is equals to'.
     *
     * @param idZonaDistNom java.lang.Integer
     * @return Collection of TnMovtosEmpPla
     */
    @FindByCondition(value=TnMovtosEmpPla.class, condition="ID_ZONA_DIST_NOM=?")
    List<TnMovtosEmpPla> findByIdZonaDistNom(java.lang.Integer idZonaDistNom);

    /**
     * Find the first TnMovtosEmpPla entity that matches the condition 'where idZonaEcoNom is equals to'.
     *
     * @param idZonaEcoNom java.lang.Boolean
     * @return TnMovtosEmpPla
     */
    @FindByCondition(value=TnMovtosEmpPla.class, condition="ID_ZONA_ECO_NOM=?")
    TnMovtosEmpPla getByIdZonaEcoNom(java.lang.Boolean idZonaEcoNom);

    /**
     * Find all TnMovtosEmpPla entities that matches the condition 'where idZonaEcoNom is equals to'.
     *
     * @param idZonaEcoNom java.lang.Boolean
     * @return Collection of TnMovtosEmpPla
     */
    @FindByCondition(value=TnMovtosEmpPla.class, condition="ID_ZONA_ECO_NOM=?")
    List<TnMovtosEmpPla> findByIdZonaEcoNom(java.lang.Boolean idZonaEcoNom);

    /**
     * Find the first TnMovtosEmpPla entity that matches the condition 'where idZonaEcoNomAnt is equals to'.
     *
     * @param idZonaEcoNomAnt java.lang.Boolean
     * @return TnMovtosEmpPla
     */
    @FindByCondition(value=TnMovtosEmpPla.class, condition="ID_ZONA_ECO_NOM_ANT=?")
    TnMovtosEmpPla getByIdZonaEcoNomAnt(java.lang.Boolean idZonaEcoNomAnt);

    /**
     * Find all TnMovtosEmpPla entities that matches the condition 'where idZonaEcoNomAnt is equals to'.
     *
     * @param idZonaEcoNomAnt java.lang.Boolean
     * @return Collection of TnMovtosEmpPla
     */
    @FindByCondition(value=TnMovtosEmpPla.class, condition="ID_ZONA_ECO_NOM_ANT=?")
    List<TnMovtosEmpPla> findByIdZonaEcoNomAnt(java.lang.Boolean idZonaEcoNomAnt);

    /**
     * Find the first TnMovtosEmpPla entity that matches the condition 'where idZonaEcoPre is equals to'.
     *
     * @param idZonaEcoPre java.lang.Boolean
     * @return TnMovtosEmpPla
     */
    @FindByCondition(value=TnMovtosEmpPla.class, condition="ID_ZONA_ECO_PRE=?")
    TnMovtosEmpPla getByIdZonaEcoPre(java.lang.Boolean idZonaEcoPre);

    /**
     * Find all TnMovtosEmpPla entities that matches the condition 'where idZonaEcoPre is equals to'.
     *
     * @param idZonaEcoPre java.lang.Boolean
     * @return Collection of TnMovtosEmpPla
     */
    @FindByCondition(value=TnMovtosEmpPla.class, condition="ID_ZONA_ECO_PRE=?")
    List<TnMovtosEmpPla> findByIdZonaEcoPre(java.lang.Boolean idZonaEcoPre);

    /**
     * Find the first TnMovtosEmpPla entity that matches the condition 'where mepAla is equals to'.
     *
     * @param mepAla java.lang.String
     * @return TnMovtosEmpPla
     */
    @FindByCondition(value=TnMovtosEmpPla.class, condition="MEP_ALA=?")
    TnMovtosEmpPla getByMepAla(java.lang.String mepAla);

    /**
     * Find all TnMovtosEmpPla entities that matches the condition 'where mepAla is equals to'.
     *
     * @param mepAla java.lang.String
     * @return Collection of TnMovtosEmpPla
     */
    @FindByCondition(value=TnMovtosEmpPla.class, condition="MEP_ALA=?")
    List<TnMovtosEmpPla> findByMepAla(java.lang.String mepAla);

    /**
     * Find the first TnMovtosEmpPla entity that matches the condition 'where mepCalleParticular is equals to'.
     *
     * @param mepCalleParticular java.lang.String
     * @return TnMovtosEmpPla
     */
    @FindByCondition(value=TnMovtosEmpPla.class, condition="MEP_CALLE_PARTICULAR=?")
    TnMovtosEmpPla getByMepCalleParticular(java.lang.String mepCalleParticular);

    /**
     * Find all TnMovtosEmpPla entities that matches the condition 'where mepCalleParticular is equals to'.
     *
     * @param mepCalleParticular java.lang.String
     * @return Collection of TnMovtosEmpPla
     */
    @FindByCondition(value=TnMovtosEmpPla.class, condition="MEP_CALLE_PARTICULAR=?")
    List<TnMovtosEmpPla> findByMepCalleParticular(java.lang.String mepCalleParticular);

    /**
     * Find the first TnMovtosEmpPla entity that matches the condition 'where mepCasoMuestra is equals to'.
     *
     * @param mepCasoMuestra java.lang.String
     * @return TnMovtosEmpPla
     */
    @FindByCondition(value=TnMovtosEmpPla.class, condition="MEP_CASO_MUESTRA=?")
    TnMovtosEmpPla getByMepCasoMuestra(java.lang.String mepCasoMuestra);

    /**
     * Find all TnMovtosEmpPla entities that matches the condition 'where mepCasoMuestra is equals to'.
     *
     * @param mepCasoMuestra java.lang.String
     * @return Collection of TnMovtosEmpPla
     */
    @FindByCondition(value=TnMovtosEmpPla.class, condition="MEP_CASO_MUESTRA=?")
    List<TnMovtosEmpPla> findByMepCasoMuestra(java.lang.String mepCasoMuestra);

    /**
     * Find the first TnMovtosEmpPla entity that matches the condition 'where mepClabe is equals to'.
     *
     * @param mepClabe java.lang.String
     * @return TnMovtosEmpPla
     */
    @FindByCondition(value=TnMovtosEmpPla.class, condition="MEP_CLABE=?")
    TnMovtosEmpPla getByMepClabe(java.lang.String mepClabe);

    /**
     * Find all TnMovtosEmpPla entities that matches the condition 'where mepClabe is equals to'.
     *
     * @param mepClabe java.lang.String
     * @return Collection of TnMovtosEmpPla
     */
    @FindByCondition(value=TnMovtosEmpPla.class, condition="MEP_CLABE=?")
    List<TnMovtosEmpPla> findByMepClabe(java.lang.String mepClabe);

    /**
     * Find the first TnMovtosEmpPla entity that matches the condition 'where mepCodpostParticular is equals to'.
     *
     * @param mepCodpostParticular java.lang.String
     * @return TnMovtosEmpPla
     */
    @FindByCondition(value=TnMovtosEmpPla.class, condition="MEP_CODPOST_PARTICULAR=?")
    TnMovtosEmpPla getByMepCodpostParticular(java.lang.String mepCodpostParticular);

    /**
     * Find all TnMovtosEmpPla entities that matches the condition 'where mepCodpostParticular is equals to'.
     *
     * @param mepCodpostParticular java.lang.String
     * @return Collection of TnMovtosEmpPla
     */
    @FindByCondition(value=TnMovtosEmpPla.class, condition="MEP_CODPOST_PARTICULAR=?")
    List<TnMovtosEmpPla> findByMepCodpostParticular(java.lang.String mepCodpostParticular);

    /**
     * Find the first TnMovtosEmpPla entity that matches the condition 'where mepColoniaParticular is equals to'.
     *
     * @param mepColoniaParticular java.lang.String
     * @return TnMovtosEmpPla
     */
    @FindByCondition(value=TnMovtosEmpPla.class, condition="MEP_COLONIA_PARTICULAR=?")
    TnMovtosEmpPla getByMepColoniaParticular(java.lang.String mepColoniaParticular);

    /**
     * Find all TnMovtosEmpPla entities that matches the condition 'where mepColoniaParticular is equals to'.
     *
     * @param mepColoniaParticular java.lang.String
     * @return Collection of TnMovtosEmpPla
     */
    @FindByCondition(value=TnMovtosEmpPla.class, condition="MEP_COLONIA_PARTICULAR=?")
    List<TnMovtosEmpPla> findByMepColoniaParticular(java.lang.String mepColoniaParticular);

    /**
     * Find the first TnMovtosEmpPla entity that matches the condition 'where mepCompatEmpleo is equals to'.
     *
     * @param mepCompatEmpleo java.lang.String
     * @return TnMovtosEmpPla
     */
    @FindByCondition(value=TnMovtosEmpPla.class, condition="MEP_COMPAT_EMPLEO=?")
    TnMovtosEmpPla getByMepCompatEmpleo(java.lang.String mepCompatEmpleo);

    /**
     * Find all TnMovtosEmpPla entities that matches the condition 'where mepCompatEmpleo is equals to'.
     *
     * @param mepCompatEmpleo java.lang.String
     * @return Collection of TnMovtosEmpPla
     */
    @FindByCondition(value=TnMovtosEmpPla.class, condition="MEP_COMPAT_EMPLEO=?")
    List<TnMovtosEmpPla> findByMepCompatEmpleo(java.lang.String mepCompatEmpleo);

    /**
     * Find the first TnMovtosEmpPla entity that matches the condition 'where mepConmut is equals to'.
     *
     * @param mepConmut java.lang.String
     * @return TnMovtosEmpPla
     */
    @FindByCondition(value=TnMovtosEmpPla.class, condition="MEP_CONMUT=?")
    TnMovtosEmpPla getByMepConmut(java.lang.String mepConmut);

    /**
     * Find all TnMovtosEmpPla entities that matches the condition 'where mepConmut is equals to'.
     *
     * @param mepConmut java.lang.String
     * @return Collection of TnMovtosEmpPla
     */
    @FindByCondition(value=TnMovtosEmpPla.class, condition="MEP_CONMUT=?")
    List<TnMovtosEmpPla> findByMepConmut(java.lang.String mepConmut);

    /**
     * Find the first TnMovtosEmpPla entity that matches the condition 'where mepCurp is equals to'.
     *
     * @param mepCurp java.lang.String
     * @return TnMovtosEmpPla
     */
    @FindByCondition(value=TnMovtosEmpPla.class, condition="MEP_CURP=?")
    TnMovtosEmpPla getByMepCurp(java.lang.String mepCurp);

    /**
     * Find all TnMovtosEmpPla entities that matches the condition 'where mepCurp is equals to'.
     *
     * @param mepCurp java.lang.String
     * @return Collection of TnMovtosEmpPla
     */
    @FindByCondition(value=TnMovtosEmpPla.class, condition="MEP_CURP=?")
    List<TnMovtosEmpPla> findByMepCurp(java.lang.String mepCurp);

    /**
     * Find the first TnMovtosEmpPla entity that matches the condition 'where mepCveEdoNac is equals to'.
     *
     * @param mepCveEdoNac java.lang.Integer
     * @return TnMovtosEmpPla
     */
    @FindByCondition(value=TnMovtosEmpPla.class, condition="MEP_CVE_EDO_NAC=?")
    TnMovtosEmpPla getByMepCveEdoNac(java.lang.Integer mepCveEdoNac);

    /**
     * Find all TnMovtosEmpPla entities that matches the condition 'where mepCveEdoNac is equals to'.
     *
     * @param mepCveEdoNac java.lang.Integer
     * @return Collection of TnMovtosEmpPla
     */
    @FindByCondition(value=TnMovtosEmpPla.class, condition="MEP_CVE_EDO_NAC=?")
    List<TnMovtosEmpPla> findByMepCveEdoNac(java.lang.Integer mepCveEdoNac);

    /**
     * Find the first TnMovtosEmpPla entity that matches the condition 'where mepCveEdoParticular is equals to'.
     *
     * @param mepCveEdoParticular java.lang.Integer
     * @return TnMovtosEmpPla
     */
    @FindByCondition(value=TnMovtosEmpPla.class, condition="MEP_CVE_EDO_PARTICULAR=?")
    TnMovtosEmpPla getByMepCveEdoParticular(java.lang.Integer mepCveEdoParticular);

    /**
     * Find all TnMovtosEmpPla entities that matches the condition 'where mepCveEdoParticular is equals to'.
     *
     * @param mepCveEdoParticular java.lang.Integer
     * @return Collection of TnMovtosEmpPla
     */
    @FindByCondition(value=TnMovtosEmpPla.class, condition="MEP_CVE_EDO_PARTICULAR=?")
    List<TnMovtosEmpPla> findByMepCveEdoParticular(java.lang.Integer mepCveEdoParticular);

    /**
     * Find the first TnMovtosEmpPla entity that matches the condition 'where mepCveMuniParticular is equals to'.
     *
     * @param mepCveMuniParticular java.lang.Integer
     * @return TnMovtosEmpPla
     */
    @FindByCondition(value=TnMovtosEmpPla.class, condition="MEP_CVE_MUNI_PARTICULAR=?")
    TnMovtosEmpPla getByMepCveMuniParticular(java.lang.Integer mepCveMuniParticular);

    /**
     * Find all TnMovtosEmpPla entities that matches the condition 'where mepCveMuniParticular is equals to'.
     *
     * @param mepCveMuniParticular java.lang.Integer
     * @return Collection of TnMovtosEmpPla
     */
    @FindByCondition(value=TnMovtosEmpPla.class, condition="MEP_CVE_MUNI_PARTICULAR=?")
    List<TnMovtosEmpPla> findByMepCveMuniParticular(java.lang.Integer mepCveMuniParticular);

    /**
     * Find the first TnMovtosEmpPla entity that matches the condition 'where mepDiscapacidad is equals to'.
     *
     * @param mepDiscapacidad java.lang.String
     * @return TnMovtosEmpPla
     */
    @FindByCondition(value=TnMovtosEmpPla.class, condition="MEP_DISCAPACIDAD=?")
    TnMovtosEmpPla getByMepDiscapacidad(java.lang.String mepDiscapacidad);

    /**
     * Find all TnMovtosEmpPla entities that matches the condition 'where mepDiscapacidad is equals to'.
     *
     * @param mepDiscapacidad java.lang.String
     * @return Collection of TnMovtosEmpPla
     */
    @FindByCondition(value=TnMovtosEmpPla.class, condition="MEP_DISCAPACIDAD=?")
    List<TnMovtosEmpPla> findByMepDiscapacidad(java.lang.String mepDiscapacidad);

    /**
     * Find the first TnMovtosEmpPla entity that matches the condition 'where mepEdif is equals to'.
     *
     * @param mepEdif java.lang.String
     * @return TnMovtosEmpPla
     */
    @FindByCondition(value=TnMovtosEmpPla.class, condition="MEP_EDIF=?")
    TnMovtosEmpPla getByMepEdif(java.lang.String mepEdif);

    /**
     * Find all TnMovtosEmpPla entities that matches the condition 'where mepEdif is equals to'.
     *
     * @param mepEdif java.lang.String
     * @return Collection of TnMovtosEmpPla
     */
    @FindByCondition(value=TnMovtosEmpPla.class, condition="MEP_EDIF=?")
    List<TnMovtosEmpPla> findByMepEdif(java.lang.String mepEdif);

    /**
     * Find the first TnMovtosEmpPla entity that matches the condition 'where mepEstudiaSiNo is equals to'.
     *
     * @param mepEstudiaSiNo java.lang.String
     * @return TnMovtosEmpPla
     */
    @FindByCondition(value=TnMovtosEmpPla.class, condition="MEP_ESTUDIA_SI_NO=?")
    TnMovtosEmpPla getByMepEstudiaSiNo(java.lang.String mepEstudiaSiNo);

    /**
     * Find all TnMovtosEmpPla entities that matches the condition 'where mepEstudiaSiNo is equals to'.
     *
     * @param mepEstudiaSiNo java.lang.String
     * @return Collection of TnMovtosEmpPla
     */
    @FindByCondition(value=TnMovtosEmpPla.class, condition="MEP_ESTUDIA_SI_NO=?")
    List<TnMovtosEmpPla> findByMepEstudiaSiNo(java.lang.String mepEstudiaSiNo);

    /**
     * Find the first TnMovtosEmpPla entity that matches the condition 'where mepExt1 is equals to'.
     *
     * @param mepExt1 java.lang.String
     * @return TnMovtosEmpPla
     */
    @FindByCondition(value=TnMovtosEmpPla.class, condition="MEP_EXT1=?")
    TnMovtosEmpPla getByMepExt1(java.lang.String mepExt1);

    /**
     * Find all TnMovtosEmpPla entities that matches the condition 'where mepExt1 is equals to'.
     *
     * @param mepExt1 java.lang.String
     * @return Collection of TnMovtosEmpPla
     */
    @FindByCondition(value=TnMovtosEmpPla.class, condition="MEP_EXT1=?")
    List<TnMovtosEmpPla> findByMepExt1(java.lang.String mepExt1);

    /**
     * Find the first TnMovtosEmpPla entity that matches the condition 'where mepExt2 is equals to'.
     *
     * @param mepExt2 java.lang.String
     * @return TnMovtosEmpPla
     */
    @FindByCondition(value=TnMovtosEmpPla.class, condition="MEP_EXT2=?")
    TnMovtosEmpPla getByMepExt2(java.lang.String mepExt2);

    /**
     * Find all TnMovtosEmpPla entities that matches the condition 'where mepExt2 is equals to'.
     *
     * @param mepExt2 java.lang.String
     * @return Collection of TnMovtosEmpPla
     */
    @FindByCondition(value=TnMovtosEmpPla.class, condition="MEP_EXT2=?")
    List<TnMovtosEmpPla> findByMepExt2(java.lang.String mepExt2);

    /**
     * Find the first TnMovtosEmpPla entity that matches the condition 'where mepEMailOficial is equals to'.
     *
     * @param mepEMailOficial java.lang.String
     * @return TnMovtosEmpPla
     */
    @FindByCondition(value=TnMovtosEmpPla.class, condition="MEP_E_MAIL_OFICIAL=?")
    TnMovtosEmpPla getByMepEMailOficial(java.lang.String mepEMailOficial);

    /**
     * Find all TnMovtosEmpPla entities that matches the condition 'where mepEMailOficial is equals to'.
     *
     * @param mepEMailOficial java.lang.String
     * @return Collection of TnMovtosEmpPla
     */
    @FindByCondition(value=TnMovtosEmpPla.class, condition="MEP_E_MAIL_OFICIAL=?")
    List<TnMovtosEmpPla> findByMepEMailOficial(java.lang.String mepEMailOficial);

    /**
     * Find the first TnMovtosEmpPla entity that matches the condition 'where mepEMailPersonal is equals to'.
     *
     * @param mepEMailPersonal java.lang.String
     * @return TnMovtosEmpPla
     */
    @FindByCondition(value=TnMovtosEmpPla.class, condition="MEP_E_MAIL_PERSONAL=?")
    TnMovtosEmpPla getByMepEMailPersonal(java.lang.String mepEMailPersonal);

    /**
     * Find all TnMovtosEmpPla entities that matches the condition 'where mepEMailPersonal is equals to'.
     *
     * @param mepEMailPersonal java.lang.String
     * @return Collection of TnMovtosEmpPla
     */
    @FindByCondition(value=TnMovtosEmpPla.class, condition="MEP_E_MAIL_PERSONAL=?")
    List<TnMovtosEmpPla> findByMepEMailPersonal(java.lang.String mepEMailPersonal);

    /**
     * Find the first TnMovtosEmpPla entity that matches the condition 'where mepFecIngSpc is equals to'.
     *
     * @param mepFecIngSpc java.util.Date
     * @return TnMovtosEmpPla
     */
    @FindByCondition(value=TnMovtosEmpPla.class, condition="MEP_FEC_ING_SPC=?")
    TnMovtosEmpPla getByMepFecIngSpc(java.util.Date mepFecIngSpc);

    /**
     * Find all TnMovtosEmpPla entities that matches the condition 'where mepFecIngSpc is equals to'.
     *
     * @param mepFecIngSpc java.util.Date
     * @return Collection of TnMovtosEmpPla
     */
    @FindByCondition(value=TnMovtosEmpPla.class, condition="MEP_FEC_ING_SPC=?")
    List<TnMovtosEmpPla> findByMepFecIngSpc(java.util.Date mepFecIngSpc);

    /**
     * Find the first TnMovtosEmpPla entity that matches the condition 'where mepFecIniDeclPatr is equals to'.
     *
     * @param mepFecIniDeclPatr java.util.Date
     * @return TnMovtosEmpPla
     */
    @FindByCondition(value=TnMovtosEmpPla.class, condition="MEP_FEC_INI_DECL_PATR=?")
    TnMovtosEmpPla getByMepFecIniDeclPatr(java.util.Date mepFecIniDeclPatr);

    /**
     * Find all TnMovtosEmpPla entities that matches the condition 'where mepFecIniDeclPatr is equals to'.
     *
     * @param mepFecIniDeclPatr java.util.Date
     * @return Collection of TnMovtosEmpPla
     */
    @FindByCondition(value=TnMovtosEmpPla.class, condition="MEP_FEC_INI_DECL_PATR=?")
    List<TnMovtosEmpPla> findByMepFecIniDeclPatr(java.util.Date mepFecIniDeclPatr);

    /**
     * Find the first TnMovtosEmpPla entity that matches the condition 'where mepFecNacimiento is equals to'.
     *
     * @param mepFecNacimiento java.util.Date
     * @return TnMovtosEmpPla
     */
    @FindByCondition(value=TnMovtosEmpPla.class, condition="MEP_FEC_NACIMIENTO=?")
    TnMovtosEmpPla getByMepFecNacimiento(java.util.Date mepFecNacimiento);

    /**
     * Find all TnMovtosEmpPla entities that matches the condition 'where mepFecNacimiento is equals to'.
     *
     * @param mepFecNacimiento java.util.Date
     * @return Collection of TnMovtosEmpPla
     */
    @FindByCondition(value=TnMovtosEmpPla.class, condition="MEP_FEC_NACIMIENTO=?")
    List<TnMovtosEmpPla> findByMepFecNacimiento(java.util.Date mepFecNacimiento);

    /**
     * Find the first TnMovtosEmpPla entity that matches the condition 'where mepFecNotDecPatr is equals to'.
     *
     * @param mepFecNotDecPatr java.util.Date
     * @return TnMovtosEmpPla
     */
    @FindByCondition(value=TnMovtosEmpPla.class, condition="MEP_FEC_NOT_DEC_PATR=?")
    TnMovtosEmpPla getByMepFecNotDecPatr(java.util.Date mepFecNotDecPatr);

    /**
     * Find all TnMovtosEmpPla entities that matches the condition 'where mepFecNotDecPatr is equals to'.
     *
     * @param mepFecNotDecPatr java.util.Date
     * @return Collection of TnMovtosEmpPla
     */
    @FindByCondition(value=TnMovtosEmpPla.class, condition="MEP_FEC_NOT_DEC_PATR=?")
    List<TnMovtosEmpPla> findByMepFecNotDecPatr(java.util.Date mepFecNotDecPatr);

    /**
     * Find the first TnMovtosEmpPla entity that matches the condition 'where mepFinCont is equals to'.
     *
     * @param mepFinCont java.util.Date
     * @return TnMovtosEmpPla
     */
    @FindByCondition(value=TnMovtosEmpPla.class, condition="MEP_FIN_CONT=?")
    TnMovtosEmpPla getByMepFinCont(java.util.Date mepFinCont);

    /**
     * Find all TnMovtosEmpPla entities that matches the condition 'where mepFinCont is equals to'.
     *
     * @param mepFinCont java.util.Date
     * @return Collection of TnMovtosEmpPla
     */
    @FindByCondition(value=TnMovtosEmpPla.class, condition="MEP_FIN_CONT=?")
    List<TnMovtosEmpPla> findByMepFinCont(java.util.Date mepFinCont);

    /**
     * Find the first TnMovtosEmpPla entity that matches the condition 'where mepFinLic is equals to'.
     *
     * @param mepFinLic java.util.Date
     * @return TnMovtosEmpPla
     */
    @FindByCondition(value=TnMovtosEmpPla.class, condition="MEP_FIN_LIC=?")
    TnMovtosEmpPla getByMepFinLic(java.util.Date mepFinLic);

    /**
     * Find all TnMovtosEmpPla entities that matches the condition 'where mepFinLic is equals to'.
     *
     * @param mepFinLic java.util.Date
     * @return Collection of TnMovtosEmpPla
     */
    @FindByCondition(value=TnMovtosEmpPla.class, condition="MEP_FIN_LIC=?")
    List<TnMovtosEmpPla> findByMepFinLic(java.util.Date mepFinLic);

    /**
     * Find the first TnMovtosEmpPla entity that matches the condition 'where mepImporteHonorario is equals to'.
     *
     * @param mepImporteHonorario java.lang.Double
     * @return TnMovtosEmpPla
     */
    @FindByCondition(value=TnMovtosEmpPla.class, condition="MEP_IMPORTE_HONORARIO=?")
    TnMovtosEmpPla getByMepImporteHonorario(java.lang.Double mepImporteHonorario);

    /**
     * Find all TnMovtosEmpPla entities that matches the condition 'where mepImporteHonorario is equals to'.
     *
     * @param mepImporteHonorario java.lang.Double
     * @return Collection of TnMovtosEmpPla
     */
    @FindByCondition(value=TnMovtosEmpPla.class, condition="MEP_IMPORTE_HONORARIO=?")
    List<TnMovtosEmpPla> findByMepImporteHonorario(java.lang.Double mepImporteHonorario);

    /**
     * Find the first TnMovtosEmpPla entity that matches the condition 'where mepImssIssste is equals to'.
     *
     * @param mepImssIssste java.lang.String
     * @return TnMovtosEmpPla
     */
    @FindByCondition(value=TnMovtosEmpPla.class, condition="MEP_IMSS_ISSSTE=?")
    TnMovtosEmpPla getByMepImssIssste(java.lang.String mepImssIssste);

    /**
     * Find all TnMovtosEmpPla entities that matches the condition 'where mepImssIssste is equals to'.
     *
     * @param mepImssIssste java.lang.String
     * @return Collection of TnMovtosEmpPla
     */
    @FindByCondition(value=TnMovtosEmpPla.class, condition="MEP_IMSS_ISSSTE=?")
    List<TnMovtosEmpPla> findByMepImssIssste(java.lang.String mepImssIssste);

    /**
     * Find the first TnMovtosEmpPla entity that matches the condition 'where mepIngresoDependencia is equals to'.
     *
     * @param mepIngresoDependencia java.util.Date
     * @return TnMovtosEmpPla
     */
    @FindByCondition(value=TnMovtosEmpPla.class, condition="MEP_INGRESO_DEPENDENCIA=?")
    TnMovtosEmpPla getByMepIngresoDependencia(java.util.Date mepIngresoDependencia);

    /**
     * Find all TnMovtosEmpPla entities that matches the condition 'where mepIngresoDependencia is equals to'.
     *
     * @param mepIngresoDependencia java.util.Date
     * @return Collection of TnMovtosEmpPla
     */
    @FindByCondition(value=TnMovtosEmpPla.class, condition="MEP_INGRESO_DEPENDENCIA=?")
    List<TnMovtosEmpPla> findByMepIngresoDependencia(java.util.Date mepIngresoDependencia);

    /**
     * Find the first TnMovtosEmpPla entity that matches the condition 'where mepIngresoGobFed is equals to'.
     *
     * @param mepIngresoGobFed java.util.Date
     * @return TnMovtosEmpPla
     */
    @FindByCondition(value=TnMovtosEmpPla.class, condition="MEP_INGRESO_GOB_FED=?")
    TnMovtosEmpPla getByMepIngresoGobFed(java.util.Date mepIngresoGobFed);

    /**
     * Find all TnMovtosEmpPla entities that matches the condition 'where mepIngresoGobFed is equals to'.
     *
     * @param mepIngresoGobFed java.util.Date
     * @return Collection of TnMovtosEmpPla
     */
    @FindByCondition(value=TnMovtosEmpPla.class, condition="MEP_INGRESO_GOB_FED=?")
    List<TnMovtosEmpPla> findByMepIngresoGobFed(java.util.Date mepIngresoGobFed);

    /**
     * Find the first TnMovtosEmpPla entity that matches the condition 'where mepIniCont is equals to'.
     *
     * @param mepIniCont java.util.Date
     * @return TnMovtosEmpPla
     */
    @FindByCondition(value=TnMovtosEmpPla.class, condition="MEP_INI_CONT=?")
    TnMovtosEmpPla getByMepIniCont(java.util.Date mepIniCont);

    /**
     * Find all TnMovtosEmpPla entities that matches the condition 'where mepIniCont is equals to'.
     *
     * @param mepIniCont java.util.Date
     * @return Collection of TnMovtosEmpPla
     */
    @FindByCondition(value=TnMovtosEmpPla.class, condition="MEP_INI_CONT=?")
    List<TnMovtosEmpPla> findByMepIniCont(java.util.Date mepIniCont);

    /**
     * Find the first TnMovtosEmpPla entity that matches the condition 'where mepIniLic is equals to'.
     *
     * @param mepIniLic java.util.Date
     * @return TnMovtosEmpPla
     */
    @FindByCondition(value=TnMovtosEmpPla.class, condition="MEP_INI_LIC=?")
    TnMovtosEmpPla getByMepIniLic(java.util.Date mepIniLic);

    /**
     * Find all TnMovtosEmpPla entities that matches the condition 'where mepIniLic is equals to'.
     *
     * @param mepIniLic java.util.Date
     * @return Collection of TnMovtosEmpPla
     */
    @FindByCondition(value=TnMovtosEmpPla.class, condition="MEP_INI_LIC=?")
    List<TnMovtosEmpPla> findByMepIniLic(java.util.Date mepIniLic);

    /**
     * Find the first TnMovtosEmpPla entity that matches the condition 'where mepNombre is equals to'.
     *
     * @param mepNombre java.lang.String
     * @return TnMovtosEmpPla
     */
    @FindByCondition(value=TnMovtosEmpPla.class, condition="MEP_NOMBRE=?")
    TnMovtosEmpPla getByMepNombre(java.lang.String mepNombre);

    /**
     * Find all TnMovtosEmpPla entities that matches the condition 'where mepNombre is equals to'.
     *
     * @param mepNombre java.lang.String
     * @return Collection of TnMovtosEmpPla
     */
    @FindByCondition(value=TnMovtosEmpPla.class, condition="MEP_NOMBRE=?")
    List<TnMovtosEmpPla> findByMepNombre(java.lang.String mepNombre);

    /**
     * Find the first TnMovtosEmpPla entity that matches the condition 'where mepOfna is equals to'.
     *
     * @param mepOfna java.lang.String
     * @return TnMovtosEmpPla
     */
    @FindByCondition(value=TnMovtosEmpPla.class, condition="MEP_OFNA=?")
    TnMovtosEmpPla getByMepOfna(java.lang.String mepOfna);

    /**
     * Find all TnMovtosEmpPla entities that matches the condition 'where mepOfna is equals to'.
     *
     * @param mepOfna java.lang.String
     * @return Collection of TnMovtosEmpPla
     */
    @FindByCondition(value=TnMovtosEmpPla.class, condition="MEP_OFNA=?")
    List<TnMovtosEmpPla> findByMepOfna(java.lang.String mepOfna);

    /**
     * Find the first TnMovtosEmpPla entity that matches the condition 'where mepPadreMadre is equals to'.
     *
     * @param mepPadreMadre java.lang.String
     * @return TnMovtosEmpPla
     */
    @FindByCondition(value=TnMovtosEmpPla.class, condition="MEP_PADRE_MADRE=?")
    TnMovtosEmpPla getByMepPadreMadre(java.lang.String mepPadreMadre);

    /**
     * Find all TnMovtosEmpPla entities that matches the condition 'where mepPadreMadre is equals to'.
     *
     * @param mepPadreMadre java.lang.String
     * @return Collection of TnMovtosEmpPla
     */
    @FindByCondition(value=TnMovtosEmpPla.class, condition="MEP_PADRE_MADRE=?")
    List<TnMovtosEmpPla> findByMepPadreMadre(java.lang.String mepPadreMadre);

    /**
     * Find the first TnMovtosEmpPla entity that matches the condition 'where mepPiso is equals to'.
     *
     * @param mepPiso java.lang.String
     * @return TnMovtosEmpPla
     */
    @FindByCondition(value=TnMovtosEmpPla.class, condition="MEP_PISO=?")
    TnMovtosEmpPla getByMepPiso(java.lang.String mepPiso);

    /**
     * Find all TnMovtosEmpPla entities that matches the condition 'where mepPiso is equals to'.
     *
     * @param mepPiso java.lang.String
     * @return Collection of TnMovtosEmpPla
     */
    @FindByCondition(value=TnMovtosEmpPla.class, condition="MEP_PISO=?")
    List<TnMovtosEmpPla> findByMepPiso(java.lang.String mepPiso);

    /**
     * Find the first TnMovtosEmpPla entity that matches the condition 'where mepPlazaAnt is equals to'.
     *
     * @param mepPlazaAnt java.lang.Integer
     * @return TnMovtosEmpPla
     */
    @FindByCondition(value=TnMovtosEmpPla.class, condition="MEP_PLAZA_ANT=?")
    TnMovtosEmpPla getByMepPlazaAnt(java.lang.Integer mepPlazaAnt);

    /**
     * Find all TnMovtosEmpPla entities that matches the condition 'where mepPlazaAnt is equals to'.
     *
     * @param mepPlazaAnt java.lang.Integer
     * @return Collection of TnMovtosEmpPla
     */
    @FindByCondition(value=TnMovtosEmpPla.class, condition="MEP_PLAZA_ANT=?")
    List<TnMovtosEmpPla> findByMepPlazaAnt(java.lang.Integer mepPlazaAnt);

    /**
     * Find the first TnMovtosEmpPla entity that matches the condition 'where mepPlazaRespaldo is equals to'.
     *
     * @param mepPlazaRespaldo java.lang.Integer
     * @return TnMovtosEmpPla
     */
    @FindByCondition(value=TnMovtosEmpPla.class, condition="MEP_PLAZA_RESPALDO=?")
    TnMovtosEmpPla getByMepPlazaRespaldo(java.lang.Integer mepPlazaRespaldo);

    /**
     * Find all TnMovtosEmpPla entities that matches the condition 'where mepPlazaRespaldo is equals to'.
     *
     * @param mepPlazaRespaldo java.lang.Integer
     * @return Collection of TnMovtosEmpPla
     */
    @FindByCondition(value=TnMovtosEmpPla.class, condition="MEP_PLAZA_RESPALDO=?")
    List<TnMovtosEmpPla> findByMepPlazaRespaldo(java.lang.Integer mepPlazaRespaldo);

    /**
     * Find the first TnMovtosEmpPla entity that matches the condition 'where mepPrimerApellido is equals to'.
     *
     * @param mepPrimerApellido java.lang.String
     * @return TnMovtosEmpPla
     */
    @FindByCondition(value=TnMovtosEmpPla.class, condition="MEP_PRIMER_APELLIDO=?")
    TnMovtosEmpPla getByMepPrimerApellido(java.lang.String mepPrimerApellido);

    /**
     * Find all TnMovtosEmpPla entities that matches the condition 'where mepPrimerApellido is equals to'.
     *
     * @param mepPrimerApellido java.lang.String
     * @return Collection of TnMovtosEmpPla
     */
    @FindByCondition(value=TnMovtosEmpPla.class, condition="MEP_PRIMER_APELLIDO=?")
    List<TnMovtosEmpPla> findByMepPrimerApellido(java.lang.String mepPrimerApellido);

    /**
     * Find the first TnMovtosEmpPla entity that matches the condition 'where mepQnaCaptura is equals to'.
     *
     * @param mepQnaCaptura java.lang.Integer
     * @return TnMovtosEmpPla
     */
    @FindByCondition(value=TnMovtosEmpPla.class, condition="MEP_QNA_CAPTURA=?")
    TnMovtosEmpPla getByMepQnaCaptura(java.lang.Integer mepQnaCaptura);

    /**
     * Find all TnMovtosEmpPla entities that matches the condition 'where mepQnaCaptura is equals to'.
     *
     * @param mepQnaCaptura java.lang.Integer
     * @return Collection of TnMovtosEmpPla
     */
    @FindByCondition(value=TnMovtosEmpPla.class, condition="MEP_QNA_CAPTURA=?")
    List<TnMovtosEmpPla> findByMepQnaCaptura(java.lang.Integer mepQnaCaptura);

    /**
     * Find the first TnMovtosEmpPla entity that matches the condition 'where mepReferenciaOficio is equals to'.
     *
     * @param mepReferenciaOficio java.lang.String
     * @return TnMovtosEmpPla
     */
    @FindByCondition(value=TnMovtosEmpPla.class, condition="MEP_REFERENCIA_OFICIO=?")
    TnMovtosEmpPla getByMepReferenciaOficio(java.lang.String mepReferenciaOficio);

    /**
     * Find all TnMovtosEmpPla entities that matches the condition 'where mepReferenciaOficio is equals to'.
     *
     * @param mepReferenciaOficio java.lang.String
     * @return Collection of TnMovtosEmpPla
     */
    @FindByCondition(value=TnMovtosEmpPla.class, condition="MEP_REFERENCIA_OFICIO=?")
    List<TnMovtosEmpPla> findByMepReferenciaOficio(java.lang.String mepReferenciaOficio);

    /**
     * Find the first TnMovtosEmpPla entity that matches the condition 'where mepRfc is equals to'.
     *
     * @param mepRfc java.lang.String
     * @return TnMovtosEmpPla
     */
    @FindByCondition(value=TnMovtosEmpPla.class, condition="MEP_RFC=?")
    TnMovtosEmpPla getByMepRfc(java.lang.String mepRfc);

    /**
     * Find all TnMovtosEmpPla entities that matches the condition 'where mepRfc is equals to'.
     *
     * @param mepRfc java.lang.String
     * @return Collection of TnMovtosEmpPla
     */
    @FindByCondition(value=TnMovtosEmpPla.class, condition="MEP_RFC=?")
    List<TnMovtosEmpPla> findByMepRfc(java.lang.String mepRfc);

    /**
     * Find the first TnMovtosEmpPla entity that matches the condition 'where mepRfcUnico is equals to'.
     *
     * @param mepRfcUnico java.lang.String
     * @return TnMovtosEmpPla
     */
    @FindByCondition(value=TnMovtosEmpPla.class, condition="MEP_RFC_UNICO=?")
    TnMovtosEmpPla getByMepRfcUnico(java.lang.String mepRfcUnico);

    /**
     * Find all TnMovtosEmpPla entities that matches the condition 'where mepRfcUnico is equals to'.
     *
     * @param mepRfcUnico java.lang.String
     * @return Collection of TnMovtosEmpPla
     */
    @FindByCondition(value=TnMovtosEmpPla.class, condition="MEP_RFC_UNICO=?")
    List<TnMovtosEmpPla> findByMepRfcUnico(java.lang.String mepRfcUnico);

    /**
     * Find the first TnMovtosEmpPla entity that matches the condition 'where mepSegundoApellido is equals to'.
     *
     * @param mepSegundoApellido java.lang.String
     * @return TnMovtosEmpPla
     */
    @FindByCondition(value=TnMovtosEmpPla.class, condition="MEP_SEGUNDO_APELLIDO=?")
    TnMovtosEmpPla getByMepSegundoApellido(java.lang.String mepSegundoApellido);

    /**
     * Find all TnMovtosEmpPla entities that matches the condition 'where mepSegundoApellido is equals to'.
     *
     * @param mepSegundoApellido java.lang.String
     * @return Collection of TnMovtosEmpPla
     */
    @FindByCondition(value=TnMovtosEmpPla.class, condition="MEP_SEGUNDO_APELLIDO=?")
    List<TnMovtosEmpPla> findByMepSegundoApellido(java.lang.String mepSegundoApellido);

    /**
     * Find the first TnMovtosEmpPla entity that matches the condition 'where mepSistemaReparto is equals to'.
     *
     * @param mepSistemaReparto java.lang.String
     * @return TnMovtosEmpPla
     */
    @FindByCondition(value=TnMovtosEmpPla.class, condition="MEP_SISTEMA_REPARTO=?")
    TnMovtosEmpPla getByMepSistemaReparto(java.lang.String mepSistemaReparto);

    /**
     * Find all TnMovtosEmpPla entities that matches the condition 'where mepSistemaReparto is equals to'.
     *
     * @param mepSistemaReparto java.lang.String
     * @return Collection of TnMovtosEmpPla
     */
    @FindByCondition(value=TnMovtosEmpPla.class, condition="MEP_SISTEMA_REPARTO=?")
    List<TnMovtosEmpPla> findByMepSistemaReparto(java.lang.String mepSistemaReparto);

    /**
     * Find the first TnMovtosEmpPla entity that matches the condition 'where mepSpcAnioAnt is equals to'.
     *
     * @param mepSpcAnioAnt java.lang.String
     * @return TnMovtosEmpPla
     */
    @FindByCondition(value=TnMovtosEmpPla.class, condition="MEP_SPC_ANIO_ANT=?")
    TnMovtosEmpPla getByMepSpcAnioAnt(java.lang.String mepSpcAnioAnt);

    /**
     * Find all TnMovtosEmpPla entities that matches the condition 'where mepSpcAnioAnt is equals to'.
     *
     * @param mepSpcAnioAnt java.lang.String
     * @return Collection of TnMovtosEmpPla
     */
    @FindByCondition(value=TnMovtosEmpPla.class, condition="MEP_SPC_ANIO_ANT=?")
    List<TnMovtosEmpPla> findByMepSpcAnioAnt(java.lang.String mepSpcAnioAnt);

    /**
     * Find the first TnMovtosEmpPla entity that matches the condition 'where mepTelOf1 is equals to'.
     *
     * @param mepTelOf1 java.lang.String
     * @return TnMovtosEmpPla
     */
    @FindByCondition(value=TnMovtosEmpPla.class, condition="MEP_TEL_OF1=?")
    TnMovtosEmpPla getByMepTelOf1(java.lang.String mepTelOf1);

    /**
     * Find all TnMovtosEmpPla entities that matches the condition 'where mepTelOf1 is equals to'.
     *
     * @param mepTelOf1 java.lang.String
     * @return Collection of TnMovtosEmpPla
     */
    @FindByCondition(value=TnMovtosEmpPla.class, condition="MEP_TEL_OF1=?")
    List<TnMovtosEmpPla> findByMepTelOf1(java.lang.String mepTelOf1);

    /**
     * Find the first TnMovtosEmpPla entity that matches the condition 'where mepTelOf2 is equals to'.
     *
     * @param mepTelOf2 java.lang.String
     * @return TnMovtosEmpPla
     */
    @FindByCondition(value=TnMovtosEmpPla.class, condition="MEP_TEL_OF2=?")
    TnMovtosEmpPla getByMepTelOf2(java.lang.String mepTelOf2);

    /**
     * Find all TnMovtosEmpPla entities that matches the condition 'where mepTelOf2 is equals to'.
     *
     * @param mepTelOf2 java.lang.String
     * @return Collection of TnMovtosEmpPla
     */
    @FindByCondition(value=TnMovtosEmpPla.class, condition="MEP_TEL_OF2=?")
    List<TnMovtosEmpPla> findByMepTelOf2(java.lang.String mepTelOf2);

    /**
     * Find the first TnMovtosEmpPla entity that matches the condition 'where mepTelParticular is equals to'.
     *
     * @param mepTelParticular java.lang.String
     * @return TnMovtosEmpPla
     */
    @FindByCondition(value=TnMovtosEmpPla.class, condition="MEP_TEL_PARTICULAR=?")
    TnMovtosEmpPla getByMepTelParticular(java.lang.String mepTelParticular);

    /**
     * Find all TnMovtosEmpPla entities that matches the condition 'where mepTelParticular is equals to'.
     *
     * @param mepTelParticular java.lang.String
     * @return Collection of TnMovtosEmpPla
     */
    @FindByCondition(value=TnMovtosEmpPla.class, condition="MEP_TEL_PARTICULAR=?")
    List<TnMovtosEmpPla> findByMepTelParticular(java.lang.String mepTelParticular);

    /**
     * Find the first TnMovtosEmpPla entity that matches the condition 'where mepTerminoCargoSind is equals to'.
     *
     * @param mepTerminoCargoSind java.util.Date
     * @return TnMovtosEmpPla
     */
    @FindByCondition(value=TnMovtosEmpPla.class, condition="MEP_TERMINO_CARGO_SIND=?")
    TnMovtosEmpPla getByMepTerminoCargoSind(java.util.Date mepTerminoCargoSind);

    /**
     * Find all TnMovtosEmpPla entities that matches the condition 'where mepTerminoCargoSind is equals to'.
     *
     * @param mepTerminoCargoSind java.util.Date
     * @return Collection of TnMovtosEmpPla
     */
    @FindByCondition(value=TnMovtosEmpPla.class, condition="MEP_TERMINO_CARGO_SIND=?")
    List<TnMovtosEmpPla> findByMepTerminoCargoSind(java.util.Date mepTerminoCargoSind);

    /**
     * Find the first TnMovtosEmpPla entity that matches the condition 'where mepUltimoMovto is equals to'.
     *
     * @param mepUltimoMovto java.util.Date
     * @return TnMovtosEmpPla
     */
    @FindByCondition(value=TnMovtosEmpPla.class, condition="MEP_ULTIMO_MOVTO=?")
    TnMovtosEmpPla getByMepUltimoMovto(java.util.Date mepUltimoMovto);

    /**
     * Find all TnMovtosEmpPla entities that matches the condition 'where mepUltimoMovto is equals to'.
     *
     * @param mepUltimoMovto java.util.Date
     * @return Collection of TnMovtosEmpPla
     */
    @FindByCondition(value=TnMovtosEmpPla.class, condition="MEP_ULTIMO_MOVTO=?")
    List<TnMovtosEmpPla> findByMepUltimoMovto(java.util.Date mepUltimoMovto);

    /**
     * Find the first TnMovtosEmpPla entity that matches the condition 'where usuario is equals to'.
     *
     * @param usuario java.lang.String
     * @return TnMovtosEmpPla
     */
    @FindByCondition(value=TnMovtosEmpPla.class, condition="USUARIO=?")
    TnMovtosEmpPla getByUsuario(java.lang.String usuario);

    /**
     * Find all TnMovtosEmpPla entities that matches the condition 'where usuario is equals to'.
     *
     * @param usuario java.lang.String
     * @return Collection of TnMovtosEmpPla
     */
    @FindByCondition(value=TnMovtosEmpPla.class, condition="USUARIO=?")
    List<TnMovtosEmpPla> findByUsuario(java.lang.String usuario);
}