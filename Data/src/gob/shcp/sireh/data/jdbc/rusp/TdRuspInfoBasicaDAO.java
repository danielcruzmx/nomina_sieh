package gob.shcp.sireh.data.jdbc.rusp;

import gob.shcp.fsn.data.annotation.Delete;
import gob.shcp.fsn.data.annotation.FindAll;
import gob.shcp.fsn.data.annotation.FindByCondition;
import gob.shcp.fsn.data.annotation.FindById;
import gob.shcp.fsn.data.annotation.Save;
import gob.shcp.fsn.service.data.orm.JdbcDataService;

import java.util.List;

import gob.shcp.sireh.domain.jdbc.rusp.TdRuspInfoBasica;

/**
 * Data access interface for TdRuspInfoBasica.
 */
public interface TdRuspInfoBasicaDAO extends JdbcDataService {
    
    /**
     * Find TdRuspInfoBasica entity by its identifier or primary key value.
     *
     * @param id identifier or primary key
     * @return TdRuspInfoBasica
     */
    @FindById(TdRuspInfoBasica.class)
    TdRuspInfoBasica getById(gob.shcp.sireh.domain.jdbc.rusp.TdRuspInfoBasicaPK id);

    /**
     * Get all TdRuspInfoBasica entities limited by a maximum number of elements.
     *
     * @return Collection of TdRuspInfoBasica
     */
    @FindAll(TdRuspInfoBasica.class)
    List<TdRuspInfoBasica> findAll();

    /**
     * Make persistence of TdRuspInfoBasica entities. If its identifier or primary key is null then create else update.
     *
     * @param entity TdRuspInfoBasica
     */
    @Save
    void save(TdRuspInfoBasica entity);

    /**
     * Remove TdRuspInfoBasica entities.
     *
     * @param entity TdRuspInfoBasica
     */
    @Delete
    void delete(TdRuspInfoBasica entity);


    /**
     * Find the first TdRuspInfoBasica entity that matches the condition 'where fecModifico is equals to'.
     *
     * @param fecModifico java.util.Date
     * @return TdRuspInfoBasica
     */
    @FindByCondition(value = TdRuspInfoBasica.class, condition = "FEC_MODIFICO=?")
    TdRuspInfoBasica getByFecModifico(java.util.Date fecModifico);

    /**
     * Find all TdRuspInfoBasica entities that matches the condition 'where fecModifico is equals to'.
     *
     * @param fecModifico java.util.Date
     * @return Collection of TdRuspInfoBasica
     */
    @FindByCondition(value = TdRuspInfoBasica.class, condition = "FEC_MODIFICO=?")
    List<TdRuspInfoBasica> findByFecModifico(java.util.Date fecModifico);

    /**
     * Find the first TdRuspInfoBasica entity that matches the condition 'where usuario is equals to'.
     *
     * @param usuario java.lang.String
     * @return TdRuspInfoBasica
     */
    @FindByCondition(value = TdRuspInfoBasica.class, condition = "USUARIO=?")
    TdRuspInfoBasica getByUsuario(java.lang.String usuario);

    /**
     * Find all TdRuspInfoBasica entities that matches the condition 'where usuario is equals to'.
     *
     * @param usuario java.lang.String
     * @return Collection of TdRuspInfoBasica
     */
    @FindByCondition(value = TdRuspInfoBasica.class, condition = "USUARIO=?")
    List<TdRuspInfoBasica> findByUsuario(java.lang.String usuario);

    /**
     * Find the first TdRuspInfoBasica entity that matches the condition 'where idEdo is equals to'.
     *
     * @param idEdo java.lang.Integer
     * @return TdRuspInfoBasica
     */
    @FindByCondition(value = TdRuspInfoBasica.class, condition = "ID_EDO=?")
    TdRuspInfoBasica getByIdEdo(java.lang.Integer idEdo);

    /**
     * Find all TdRuspInfoBasica entities that matches the condition 'where idEdo is equals to'.
     *
     * @param idEdo java.lang.Integer
     * @return Collection of TdRuspInfoBasica
     */
    @FindByCondition(value = TdRuspInfoBasica.class, condition = "ID_EDO=?")
    List<TdRuspInfoBasica> findByIdEdo(java.lang.Integer idEdo);

    /**
     * Find the first TdRuspInfoBasica entity that matches the condition 'where idEdoNac is equals to'.
     *
     * @param idEdoNac java.lang.Integer
     * @return TdRuspInfoBasica
     */
    @FindByCondition(value = TdRuspInfoBasica.class, condition = "ID_EDO_NAC=?")
    TdRuspInfoBasica getByIdEdoNac(java.lang.Integer idEdoNac);

    /**
     * Find all TdRuspInfoBasica entities that matches the condition 'where idEdoNac is equals to'.
     *
     * @param idEdoNac java.lang.Integer
     * @return Collection of TdRuspInfoBasica
     */
    @FindByCondition(value = TdRuspInfoBasica.class, condition = "ID_EDO_NAC=?")
    List<TdRuspInfoBasica> findByIdEdoNac(java.lang.Integer idEdoNac);

    /**
     * Find the first TdRuspInfoBasica entity that matches the condition 'where idMunicipio is equals to'.
     *
     * @param idMunicipio java.lang.Integer
     * @return TdRuspInfoBasica
     */
    @FindByCondition(value = TdRuspInfoBasica.class, condition = "ID_MUNICIPIO=?")
    TdRuspInfoBasica getByIdMunicipio(java.lang.Integer idMunicipio);

    /**
     * Find all TdRuspInfoBasica entities that matches the condition 'where idMunicipio is equals to'.
     *
     * @param idMunicipio java.lang.Integer
     * @return Collection of TdRuspInfoBasica
     */
    @FindByCondition(value = TdRuspInfoBasica.class, condition = "ID_MUNICIPIO=?")
    List<TdRuspInfoBasica> findByIdMunicipio(java.lang.Integer idMunicipio);

    /**
     * Find the first TdRuspInfoBasica entity that matches the condition 'where idNivelPto is equals to'.
     *
     * @param idNivelPto java.lang.String
     * @return TdRuspInfoBasica
     */
    @FindByCondition(value = TdRuspInfoBasica.class, condition = "ID_NIVEL_PTO=?")
    TdRuspInfoBasica getByIdNivelPto(java.lang.String idNivelPto);

    /**
     * Find all TdRuspInfoBasica entities that matches the condition 'where idNivelPto is equals to'.
     *
     * @param idNivelPto java.lang.String
     * @return Collection of TdRuspInfoBasica
     */
    @FindByCondition(value = TdRuspInfoBasica.class, condition = "ID_NIVEL_PTO=?")
    List<TdRuspInfoBasica> findByIdNivelPto(java.lang.String idNivelPto);

    /**
     * Find the first TdRuspInfoBasica entity that matches the condition 'where idPuesto is equals to'.
     *
     * @param idPuesto java.lang.String
     * @return TdRuspInfoBasica
     */
    @FindByCondition(value = TdRuspInfoBasica.class, condition = "ID_PUESTO=?")
    TdRuspInfoBasica getByIdPuesto(java.lang.String idPuesto);

    /**
     * Find all TdRuspInfoBasica entities that matches the condition 'where idPuesto is equals to'.
     *
     * @param idPuesto java.lang.String
     * @return Collection of TdRuspInfoBasica
     */
    @FindByCondition(value = TdRuspInfoBasica.class, condition = "ID_PUESTO=?")
    List<TdRuspInfoBasica> findByIdPuesto(java.lang.String idPuesto);

    /**
     * Find the first TdRuspInfoBasica entity that matches the condition 'where idSitPlaza is equals to'.
     *
     * @param idSitPlaza java.lang.String
     * @return TdRuspInfoBasica
     */
    @FindByCondition(value = TdRuspInfoBasica.class, condition = "ID_SIT_PLAZA=?")
    TdRuspInfoBasica getByIdSitPlaza(java.lang.String idSitPlaza);

    /**
     * Find all TdRuspInfoBasica entities that matches the condition 'where idSitPlaza is equals to'.
     *
     * @param idSitPlaza java.lang.String
     * @return Collection of TdRuspInfoBasica
     */
    @FindByCondition(value = TdRuspInfoBasica.class, condition = "ID_SIT_PLAZA=?")
    List<TdRuspInfoBasica> findByIdSitPlaza(java.lang.String idSitPlaza);

    /**
     * Find the first TdRuspInfoBasica entity that matches the condition 'where idUnidad is equals to'.
     *
     * @param idUnidad java.lang.String
     * @return TdRuspInfoBasica
     */
    @FindByCondition(value = TdRuspInfoBasica.class, condition = "ID_UNIDAD=?")
    TdRuspInfoBasica getByIdUnidad(java.lang.String idUnidad);

    /**
     * Find all TdRuspInfoBasica entities that matches the condition 'where idUnidad is equals to'.
     *
     * @param idUnidad java.lang.String
     * @return Collection of TdRuspInfoBasica
     */
    @FindByCondition(value = TdRuspInfoBasica.class, condition = "ID_UNIDAD=?")
    List<TdRuspInfoBasica> findByIdUnidad(java.lang.String idUnidad);

    /**
     * Find the first TdRuspInfoBasica entity that matches the condition 'where idZonaEcon is equals to'.
     *
     * @param idZonaEcon java.lang.Integer
     * @return TdRuspInfoBasica
     */
    @FindByCondition(value = TdRuspInfoBasica.class, condition = "ID_ZONA_ECON=?")
    TdRuspInfoBasica getByIdZonaEcon(java.lang.Integer idZonaEcon);

    /**
     * Find all TdRuspInfoBasica entities that matches the condition 'where idZonaEcon is equals to'.
     *
     * @param idZonaEcon java.lang.Integer
     * @return Collection of TdRuspInfoBasica
     */
    @FindByCondition(value = TdRuspInfoBasica.class, condition = "ID_ZONA_ECON=?")
    List<TdRuspInfoBasica> findByIdZonaEcon(java.lang.Integer idZonaEcon);

    /**
     * Find the first TdRuspInfoBasica entity that matches the condition 'where ribAltaUltimoPuesto is equals to'.
     *
     * @param ribAltaUltimoPuesto java.util.Date
     * @return TdRuspInfoBasica
     */
    @FindByCondition(value = TdRuspInfoBasica.class, condition = "RIB_ALTA_ULTIMO_PUESTO=?")
    TdRuspInfoBasica getByRibAltaUltimoPuesto(java.util.Date ribAltaUltimoPuesto);

    /**
     * Find all TdRuspInfoBasica entities that matches the condition 'where ribAltaUltimoPuesto is equals to'.
     *
     * @param ribAltaUltimoPuesto java.util.Date
     * @return Collection of TdRuspInfoBasica
     */
    @FindByCondition(value = TdRuspInfoBasica.class, condition = "RIB_ALTA_ULTIMO_PUESTO=?")
    List<TdRuspInfoBasica> findByRibAltaUltimoPuesto(java.util.Date ribAltaUltimoPuesto);

    /**
     * Find the first TdRuspInfoBasica entity that matches the condition 'where ribClaveSep is equals to'.
     *
     * @param ribClaveSep java.lang.String
     * @return TdRuspInfoBasica
     */
    @FindByCondition(value = TdRuspInfoBasica.class, condition = "RIB_CLAVE_SEP=?")
    TdRuspInfoBasica getByRibClaveSep(java.lang.String ribClaveSep);

    /**
     * Find all TdRuspInfoBasica entities that matches the condition 'where ribClaveSep is equals to'.
     *
     * @param ribClaveSep java.lang.String
     * @return Collection of TdRuspInfoBasica
     */
    @FindByCondition(value = TdRuspInfoBasica.class, condition = "RIB_CLAVE_SEP=?")
    List<TdRuspInfoBasica> findByRibClaveSep(java.lang.String ribClaveSep);

    /**
     * Find the first TdRuspInfoBasica entity that matches the condition 'where ribCodigoPuesto is equals to'.
     *
     * @param ribCodigoPuesto java.lang.String
     * @return TdRuspInfoBasica
     */
    @FindByCondition(value = TdRuspInfoBasica.class, condition = "RIB_CODIGO_PUESTO=?")
    TdRuspInfoBasica getByRibCodigoPuesto(java.lang.String ribCodigoPuesto);

    /**
     * Find all TdRuspInfoBasica entities that matches the condition 'where ribCodigoPuesto is equals to'.
     *
     * @param ribCodigoPuesto java.lang.String
     * @return Collection of TdRuspInfoBasica
     */
    @FindByCondition(value = TdRuspInfoBasica.class, condition = "RIB_CODIGO_PUESTO=?")
    List<TdRuspInfoBasica> findByRibCodigoPuesto(java.lang.String ribCodigoPuesto);

    /**
     * Find the first TdRuspInfoBasica entity that matches the condition 'where ribCompensacion is equals to'.
     *
     * @param ribCompensacion java.lang.Double
     * @return TdRuspInfoBasica
     */
    @FindByCondition(value = TdRuspInfoBasica.class, condition = "RIB_COMPENSACION=?")
    TdRuspInfoBasica getByRibCompensacion(java.lang.Double ribCompensacion);

    /**
     * Find all TdRuspInfoBasica entities that matches the condition 'where ribCompensacion is equals to'.
     *
     * @param ribCompensacion java.lang.Double
     * @return Collection of TdRuspInfoBasica
     */
    @FindByCondition(value = TdRuspInfoBasica.class, condition = "RIB_COMPENSACION=?")
    List<TdRuspInfoBasica> findByRibCompensacion(java.lang.Double ribCompensacion);

    /**
     * Find the first TdRuspInfoBasica entity that matches the condition 'where ribConsPto is equals to'.
     *
     * @param ribConsPto java.lang.Integer
     * @return TdRuspInfoBasica
     */
    @FindByCondition(value = TdRuspInfoBasica.class, condition = "RIB_CONS_PTO=?")
    TdRuspInfoBasica getByRibConsPto(java.lang.Integer ribConsPto);

    /**
     * Find all TdRuspInfoBasica entities that matches the condition 'where ribConsPto is equals to'.
     *
     * @param ribConsPto java.lang.Integer
     * @return Collection of TdRuspInfoBasica
     */
    @FindByCondition(value = TdRuspInfoBasica.class, condition = "RIB_CONS_PTO=?")
    List<TdRuspInfoBasica> findByRibConsPto(java.lang.Integer ribConsPto);

    /**
     * Find the first TdRuspInfoBasica entity that matches the condition 'where ribConsPtoJefe is equals to'.
     *
     * @param ribConsPtoJefe java.lang.Integer
     * @return TdRuspInfoBasica
     */
    @FindByCondition(value = TdRuspInfoBasica.class, condition = "RIB_CONS_PTO_JEFE=?")
    TdRuspInfoBasica getByRibConsPtoJefe(java.lang.Integer ribConsPtoJefe);

    /**
     * Find all TdRuspInfoBasica entities that matches the condition 'where ribConsPtoJefe is equals to'.
     *
     * @param ribConsPtoJefe java.lang.Integer
     * @return Collection of TdRuspInfoBasica
     */
    @FindByCondition(value = TdRuspInfoBasica.class, condition = "RIB_CONS_PTO_JEFE=?")
    List<TdRuspInfoBasica> findByRibConsPtoJefe(java.lang.Integer ribConsPtoJefe);

    /**
     * Find the first TdRuspInfoBasica entity that matches the condition 'where ribCurp is equals to'.
     *
     * @param ribCurp java.lang.String
     * @return TdRuspInfoBasica
     */
    @FindByCondition(value = TdRuspInfoBasica.class, condition = "RIB_CURP=?")
    TdRuspInfoBasica getByRibCurp(java.lang.String ribCurp);

    /**
     * Find all TdRuspInfoBasica entities that matches the condition 'where ribCurp is equals to'.
     *
     * @param ribCurp java.lang.String
     * @return Collection of TdRuspInfoBasica
     */
    @FindByCondition(value = TdRuspInfoBasica.class, condition = "RIB_CURP=?")
    List<TdRuspInfoBasica> findByRibCurp(java.lang.String ribCurp);

    /**
     * Find the first TdRuspInfoBasica entity that matches the condition 'where ribDeclaracionPatrimonial is equals to'.
     *
     * @param ribDeclaracionPatrimonial java.lang.String
     * @return TdRuspInfoBasica
     */
    @FindByCondition(value = TdRuspInfoBasica.class, condition = "RIB_DECLARACION_PATRIMONIAL=?")
    TdRuspInfoBasica getByRibDeclaracionPatrimonial(java.lang.String ribDeclaracionPatrimonial);

    /**
     * Find all TdRuspInfoBasica entities that matches the condition 'where ribDeclaracionPatrimonial is equals to'.
     *
     * @param ribDeclaracionPatrimonial java.lang.String
     * @return Collection of TdRuspInfoBasica
     */
    @FindByCondition(value = TdRuspInfoBasica.class, condition = "RIB_DECLARACION_PATRIMONIAL=?")
    List<TdRuspInfoBasica> findByRibDeclaracionPatrimonial(java.lang.String ribDeclaracionPatrimonial);

    /**
     * Find the first TdRuspInfoBasica entity that matches the condition 'where ribEstatusOcupacional is equals to'.
     *
     * @param ribEstatusOcupacional java.lang.Boolean
     * @return TdRuspInfoBasica
     */
    @FindByCondition(value = TdRuspInfoBasica.class, condition = "RIB_ESTATUS_OCUPACIONAL=?")
    TdRuspInfoBasica getByRibEstatusOcupacional(java.lang.Boolean ribEstatusOcupacional);

    /**
     * Find all TdRuspInfoBasica entities that matches the condition 'where ribEstatusOcupacional is equals to'.
     *
     * @param ribEstatusOcupacional java.lang.Boolean
     * @return Collection of TdRuspInfoBasica
     */
    @FindByCondition(value = TdRuspInfoBasica.class, condition = "RIB_ESTATUS_OCUPACIONAL=?")
    List<TdRuspInfoBasica> findByRibEstatusOcupacional(java.lang.Boolean ribEstatusOcupacional);

    /**
     * Find the first TdRuspInfoBasica entity that matches the condition 'where ribEMail is equals to'.
     *
     * @param ribEMail java.lang.String
     * @return TdRuspInfoBasica
     */
    @FindByCondition(value = TdRuspInfoBasica.class, condition = "RIB_E_MAIL=?")
    TdRuspInfoBasica getByRibEMail(java.lang.String ribEMail);

    /**
     * Find all TdRuspInfoBasica entities that matches the condition 'where ribEMail is equals to'.
     *
     * @param ribEMail java.lang.String
     * @return Collection of TdRuspInfoBasica
     */
    @FindByCondition(value = TdRuspInfoBasica.class, condition = "RIB_E_MAIL=?")
    List<TdRuspInfoBasica> findByRibEMail(java.lang.String ribEMail);

    /**
     * Find the first TdRuspInfoBasica entity that matches the condition 'where ribFechaNacimiento is equals to'.
     *
     * @param ribFechaNacimiento java.util.Date
     * @return TdRuspInfoBasica
     */
    @FindByCondition(value = TdRuspInfoBasica.class, condition = "RIB_FECHA_NACIMIENTO=?")
    TdRuspInfoBasica getByRibFechaNacimiento(java.util.Date ribFechaNacimiento);

    /**
     * Find all TdRuspInfoBasica entities that matches the condition 'where ribFechaNacimiento is equals to'.
     *
     * @param ribFechaNacimiento java.util.Date
     * @return Collection of TdRuspInfoBasica
     */
    @FindByCondition(value = TdRuspInfoBasica.class, condition = "RIB_FECHA_NACIMIENTO=?")
    List<TdRuspInfoBasica> findByRibFechaNacimiento(java.util.Date ribFechaNacimiento);

    /**
     * Find the first TdRuspInfoBasica entity that matches the condition 'where ribFuncionPuesto is equals to'.
     *
     * @param ribFuncionPuesto java.lang.Boolean
     * @return TdRuspInfoBasica
     */
    @FindByCondition(value = TdRuspInfoBasica.class, condition = "RIB_FUNCION_PUESTO=?")
    TdRuspInfoBasica getByRibFuncionPuesto(java.lang.Boolean ribFuncionPuesto);

    /**
     * Find all TdRuspInfoBasica entities that matches the condition 'where ribFuncionPuesto is equals to'.
     *
     * @param ribFuncionPuesto java.lang.Boolean
     * @return Collection of TdRuspInfoBasica
     */
    @FindByCondition(value = TdRuspInfoBasica.class, condition = "RIB_FUNCION_PUESTO=?")
    List<TdRuspInfoBasica> findByRibFuncionPuesto(java.lang.Boolean ribFuncionPuesto);

    /**
     * Find the first TdRuspInfoBasica entity that matches the condition 'where ribGenero is equals to'.
     *
     * @param ribGenero java.lang.Boolean
     * @return TdRuspInfoBasica
     */
    @FindByCondition(value = TdRuspInfoBasica.class, condition = "RIB_GENERO=?")
    TdRuspInfoBasica getByRibGenero(java.lang.Boolean ribGenero);

    /**
     * Find all TdRuspInfoBasica entities that matches the condition 'where ribGenero is equals to'.
     *
     * @param ribGenero java.lang.Boolean
     * @return Collection of TdRuspInfoBasica
     */
    @FindByCondition(value = TdRuspInfoBasica.class, condition = "RIB_GENERO=?")
    List<TdRuspInfoBasica> findByRibGenero(java.lang.Boolean ribGenero);

    /**
     * Find the first TdRuspInfoBasica entity that matches the condition 'where ribIngresoApf is equals to'.
     *
     * @param ribIngresoApf java.util.Date
     * @return TdRuspInfoBasica
     */
    @FindByCondition(value = TdRuspInfoBasica.class, condition = "RIB_INGRESO_APF=?")
    TdRuspInfoBasica getByRibIngresoApf(java.util.Date ribIngresoApf);

    /**
     * Find all TdRuspInfoBasica entities that matches the condition 'where ribIngresoApf is equals to'.
     *
     * @param ribIngresoApf java.util.Date
     * @return Collection of TdRuspInfoBasica
     */
    @FindByCondition(value = TdRuspInfoBasica.class, condition = "RIB_INGRESO_APF=?")
    List<TdRuspInfoBasica> findByRibIngresoApf(java.util.Date ribIngresoApf);

    /**
     * Find the first TdRuspInfoBasica entity that matches the condition 'where ribIngresoInstitucion is equals to'.
     *
     * @param ribIngresoInstitucion java.util.Date
     * @return TdRuspInfoBasica
     */
    @FindByCondition(value = TdRuspInfoBasica.class, condition = "RIB_INGRESO_INSTITUCION=?")
    TdRuspInfoBasica getByRibIngresoInstitucion(java.util.Date ribIngresoInstitucion);

    /**
     * Find all TdRuspInfoBasica entities that matches the condition 'where ribIngresoInstitucion is equals to'.
     *
     * @param ribIngresoInstitucion java.util.Date
     * @return Collection of TdRuspInfoBasica
     */
    @FindByCondition(value = TdRuspInfoBasica.class, condition = "RIB_INGRESO_INSTITUCION=?")
    List<TdRuspInfoBasica> findByRibIngresoInstitucion(java.util.Date ribIngresoInstitucion);

    /**
     * Find the first TdRuspInfoBasica entity that matches the condition 'where ribIngresoSpc is equals to'.
     *
     * @param ribIngresoSpc java.util.Date
     * @return TdRuspInfoBasica
     */
    @FindByCondition(value = TdRuspInfoBasica.class, condition = "RIB_INGRESO_SPC=?")
    TdRuspInfoBasica getByRibIngresoSpc(java.util.Date ribIngresoSpc);

    /**
     * Find all TdRuspInfoBasica entities that matches the condition 'where ribIngresoSpc is equals to'.
     *
     * @param ribIngresoSpc java.util.Date
     * @return Collection of TdRuspInfoBasica
     */
    @FindByCondition(value = TdRuspInfoBasica.class, condition = "RIB_INGRESO_SPC=?")
    List<TdRuspInfoBasica> findByRibIngresoSpc(java.util.Date ribIngresoSpc);

    /**
     * Find the first TdRuspInfoBasica entity that matches the condition 'where ribInstSegSocial is equals to'.
     *
     * @param ribInstSegSocial java.lang.Boolean
     * @return TdRuspInfoBasica
     */
    @FindByCondition(value = TdRuspInfoBasica.class, condition = "RIB_INST_SEG_SOCIAL=?")
    TdRuspInfoBasica getByRibInstSegSocial(java.lang.Boolean ribInstSegSocial);

    /**
     * Find all TdRuspInfoBasica entities that matches the condition 'where ribInstSegSocial is equals to'.
     *
     * @param ribInstSegSocial java.lang.Boolean
     * @return Collection of TdRuspInfoBasica
     */
    @FindByCondition(value = TdRuspInfoBasica.class, condition = "RIB_INST_SEG_SOCIAL=?")
    List<TdRuspInfoBasica> findByRibInstSegSocial(java.lang.Boolean ribInstSegSocial);

    /**
     * Find the first TdRuspInfoBasica entity that matches the condition 'where ribMotivoDeclaracion is equals to'.
     *
     * @param ribMotivoDeclaracion java.lang.Boolean
     * @return TdRuspInfoBasica
     */
    @FindByCondition(value = TdRuspInfoBasica.class, condition = "RIB_MOTIVO_DECLARACION=?")
    TdRuspInfoBasica getByRibMotivoDeclaracion(java.lang.Boolean ribMotivoDeclaracion);

    /**
     * Find all TdRuspInfoBasica entities that matches the condition 'where ribMotivoDeclaracion is equals to'.
     *
     * @param ribMotivoDeclaracion java.lang.Boolean
     * @return Collection of TdRuspInfoBasica
     */
    @FindByCondition(value = TdRuspInfoBasica.class, condition = "RIB_MOTIVO_DECLARACION=?")
    List<TdRuspInfoBasica> findByRibMotivoDeclaracion(java.lang.Boolean ribMotivoDeclaracion);

    /**
     * Find the first TdRuspInfoBasica entity that matches the condition 'where ribNivelTabularPagado is equals to'.
     *
     * @param ribNivelTabularPagado java.lang.String
     * @return TdRuspInfoBasica
     */
    @FindByCondition(value = TdRuspInfoBasica.class, condition = "RIB_NIVEL_TABULAR_PAGADO=?")
    TdRuspInfoBasica getByRibNivelTabularPagado(java.lang.String ribNivelTabularPagado);

    /**
     * Find all TdRuspInfoBasica entities that matches the condition 'where ribNivelTabularPagado is equals to'.
     *
     * @param ribNivelTabularPagado java.lang.String
     * @return Collection of TdRuspInfoBasica
     */
    @FindByCondition(value = TdRuspInfoBasica.class, condition = "RIB_NIVEL_TABULAR_PAGADO=?")
    List<TdRuspInfoBasica> findByRibNivelTabularPagado(java.lang.String ribNivelTabularPagado);

    /**
     * Find the first TdRuspInfoBasica entity that matches the condition 'where ribNombre is equals to'.
     *
     * @param ribNombre java.lang.String
     * @return TdRuspInfoBasica
     */
    @FindByCondition(value = TdRuspInfoBasica.class, condition = "RIB_NOMBRE=?")
    TdRuspInfoBasica getByRibNombre(java.lang.String ribNombre);

    /**
     * Find all TdRuspInfoBasica entities that matches the condition 'where ribNombre is equals to'.
     *
     * @param ribNombre java.lang.String
     * @return Collection of TdRuspInfoBasica
     */
    @FindByCondition(value = TdRuspInfoBasica.class, condition = "RIB_NOMBRE=?")
    List<TdRuspInfoBasica> findByRibNombre(java.lang.String ribNombre);

    /**
     * Find the first TdRuspInfoBasica entity that matches the condition 'where ribNombrePuesto is equals to'.
     *
     * @param ribNombrePuesto java.lang.String
     * @return TdRuspInfoBasica
     */
    @FindByCondition(value = TdRuspInfoBasica.class, condition = "RIB_NOMBRE_PUESTO=?")
    TdRuspInfoBasica getByRibNombrePuesto(java.lang.String ribNombrePuesto);

    /**
     * Find all TdRuspInfoBasica entities that matches the condition 'where ribNombrePuesto is equals to'.
     *
     * @param ribNombrePuesto java.lang.String
     * @return Collection of TdRuspInfoBasica
     */
    @FindByCondition(value = TdRuspInfoBasica.class, condition = "RIB_NOMBRE_PUESTO=?")
    List<TdRuspInfoBasica> findByRibNombrePuesto(java.lang.String ribNombrePuesto);

    /**
     * Find the first TdRuspInfoBasica entity that matches the condition 'where ribNumeroEmpleado is equals to'.
     *
     * @param ribNumeroEmpleado java.lang.String
     * @return TdRuspInfoBasica
     */
    @FindByCondition(value = TdRuspInfoBasica.class, condition = "RIB_NUMERO_EMPLEADO=?")
    TdRuspInfoBasica getByRibNumeroEmpleado(java.lang.String ribNumeroEmpleado);

    /**
     * Find all TdRuspInfoBasica entities that matches the condition 'where ribNumeroEmpleado is equals to'.
     *
     * @param ribNumeroEmpleado java.lang.String
     * @return Collection of TdRuspInfoBasica
     */
    @FindByCondition(value = TdRuspInfoBasica.class, condition = "RIB_NUMERO_EMPLEADO=?")
    List<TdRuspInfoBasica> findByRibNumeroEmpleado(java.lang.String ribNumeroEmpleado);

    /**
     * Find the first TdRuspInfoBasica entity that matches the condition 'where ribNumSegSocial is equals to'.
     *
     * @param ribNumSegSocial java.lang.String
     * @return TdRuspInfoBasica
     */
    @FindByCondition(value = TdRuspInfoBasica.class, condition = "RIB_NUM_SEG_SOCIAL=?")
    TdRuspInfoBasica getByRibNumSegSocial(java.lang.String ribNumSegSocial);

    /**
     * Find all TdRuspInfoBasica entities that matches the condition 'where ribNumSegSocial is equals to'.
     *
     * @param ribNumSegSocial java.lang.String
     * @return Collection of TdRuspInfoBasica
     */
    @FindByCondition(value = TdRuspInfoBasica.class, condition = "RIB_NUM_SEG_SOCIAL=?")
    List<TdRuspInfoBasica> findByRibNumSegSocial(java.lang.String ribNumSegSocial);

    /**
     * Find the first TdRuspInfoBasica entity that matches the condition 'where ribObligacionDeclPat is equals to'.
     *
     * @param ribObligacionDeclPat java.util.Date
     * @return TdRuspInfoBasica
     */
    @FindByCondition(value = TdRuspInfoBasica.class, condition = "RIB_OBLIGACION_DECL_PAT=?")
    TdRuspInfoBasica getByRibObligacionDeclPat(java.util.Date ribObligacionDeclPat);

    /**
     * Find all TdRuspInfoBasica entities that matches the condition 'where ribObligacionDeclPat is equals to'.
     *
     * @param ribObligacionDeclPat java.util.Date
     * @return Collection of TdRuspInfoBasica
     */
    @FindByCondition(value = TdRuspInfoBasica.class, condition = "RIB_OBLIGACION_DECL_PAT=?")
    List<TdRuspInfoBasica> findByRibObligacionDeclPat(java.util.Date ribObligacionDeclPat);

    /**
     * Find the first TdRuspInfoBasica entity that matches the condition 'where ribPaisNac is equals to'.
     *
     * @param ribPaisNac java.lang.Integer
     * @return TdRuspInfoBasica
     */
    @FindByCondition(value = TdRuspInfoBasica.class, condition = "RIB_PAIS_NAC=?")
    TdRuspInfoBasica getByRibPaisNac(java.lang.Integer ribPaisNac);

    /**
     * Find all TdRuspInfoBasica entities that matches the condition 'where ribPaisNac is equals to'.
     *
     * @param ribPaisNac java.lang.Integer
     * @return Collection of TdRuspInfoBasica
     */
    @FindByCondition(value = TdRuspInfoBasica.class, condition = "RIB_PAIS_NAC=?")
    List<TdRuspInfoBasica> findByRibPaisNac(java.lang.Integer ribPaisNac);

    /**
     * Find the first TdRuspInfoBasica entity that matches the condition 'where ribPaisPlaza is equals to'.
     *
     * @param ribPaisPlaza java.lang.Integer
     * @return TdRuspInfoBasica
     */
    @FindByCondition(value = TdRuspInfoBasica.class, condition = "RIB_PAIS_PLAZA=?")
    TdRuspInfoBasica getByRibPaisPlaza(java.lang.Integer ribPaisPlaza);

    /**
     * Find all TdRuspInfoBasica entities that matches the condition 'where ribPaisPlaza is equals to'.
     *
     * @param ribPaisPlaza java.lang.Integer
     * @return Collection of TdRuspInfoBasica
     */
    @FindByCondition(value = TdRuspInfoBasica.class, condition = "RIB_PAIS_PLAZA=?")
    List<TdRuspInfoBasica> findByRibPaisPlaza(java.lang.Integer ribPaisPlaza);

    /**
     * Find the first TdRuspInfoBasica entity that matches the condition 'where ribPrimerApellido is equals to'.
     *
     * @param ribPrimerApellido java.lang.String
     * @return TdRuspInfoBasica
     */
    @FindByCondition(value = TdRuspInfoBasica.class, condition = "RIB_PRIMER_APELLIDO=?")
    TdRuspInfoBasica getByRibPrimerApellido(java.lang.String ribPrimerApellido);

    /**
     * Find all TdRuspInfoBasica entities that matches the condition 'where ribPrimerApellido is equals to'.
     *
     * @param ribPrimerApellido java.lang.String
     * @return Collection of TdRuspInfoBasica
     */
    @FindByCondition(value = TdRuspInfoBasica.class, condition = "RIB_PRIMER_APELLIDO=?")
    List<TdRuspInfoBasica> findByRibPrimerApellido(java.lang.String ribPrimerApellido);

    /**
     * Find the first TdRuspInfoBasica entity that matches the condition 'where ribPuestoEstr is equals to'.
     *
     * @param ribPuestoEstr java.lang.Integer
     * @return TdRuspInfoBasica
     */
    @FindByCondition(value = TdRuspInfoBasica.class, condition = "RIB_PUESTO_ESTR=?")
    TdRuspInfoBasica getByRibPuestoEstr(java.lang.Integer ribPuestoEstr);

    /**
     * Find all TdRuspInfoBasica entities that matches the condition 'where ribPuestoEstr is equals to'.
     *
     * @param ribPuestoEstr java.lang.Integer
     * @return Collection of TdRuspInfoBasica
     */
    @FindByCondition(value = TdRuspInfoBasica.class, condition = "RIB_PUESTO_ESTR=?")
    List<TdRuspInfoBasica> findByRibPuestoEstr(java.lang.Integer ribPuestoEstr);

    /**
     * Find the first TdRuspInfoBasica entity that matches the condition 'where ribRamo is equals to'.
     *
     * @param ribRamo java.lang.Integer
     * @return TdRuspInfoBasica
     */
    @FindByCondition(value = TdRuspInfoBasica.class, condition = "RIB_RAMO=?")
    TdRuspInfoBasica getByRibRamo(java.lang.Integer ribRamo);

    /**
     * Find all TdRuspInfoBasica entities that matches the condition 'where ribRamo is equals to'.
     *
     * @param ribRamo java.lang.Integer
     * @return Collection of TdRuspInfoBasica
     */
    @FindByCondition(value = TdRuspInfoBasica.class, condition = "RIB_RAMO=?")
    List<TdRuspInfoBasica> findByRibRamo(java.lang.Integer ribRamo);

    /**
     * Find the first TdRuspInfoBasica entity that matches the condition 'where ribRfc is equals to'.
     *
     * @param ribRfc java.lang.String
     * @return TdRuspInfoBasica
     */
    @FindByCondition(value = TdRuspInfoBasica.class, condition = "RIB_RFC=?")
    TdRuspInfoBasica getByRibRfc(java.lang.String ribRfc);

    /**
     * Find all TdRuspInfoBasica entities that matches the condition 'where ribRfc is equals to'.
     *
     * @param ribRfc java.lang.String
     * @return Collection of TdRuspInfoBasica
     */
    @FindByCondition(value = TdRuspInfoBasica.class, condition = "RIB_RFC=?")
    List<TdRuspInfoBasica> findByRibRfc(java.lang.String ribRfc);

    /**
     * Find the first TdRuspInfoBasica entity that matches the condition 'where ribSegundoApellido is equals to'.
     *
     * @param ribSegundoApellido java.lang.String
     * @return TdRuspInfoBasica
     */
    @FindByCondition(value = TdRuspInfoBasica.class, condition = "RIB_SEGUNDO_APELLIDO=?")
    TdRuspInfoBasica getByRibSegundoApellido(java.lang.String ribSegundoApellido);

    /**
     * Find all TdRuspInfoBasica entities that matches the condition 'where ribSegundoApellido is equals to'.
     *
     * @param ribSegundoApellido java.lang.String
     * @return Collection of TdRuspInfoBasica
     */
    @FindByCondition(value = TdRuspInfoBasica.class, condition = "RIB_SEGUNDO_APELLIDO=?")
    List<TdRuspInfoBasica> findByRibSegundoApellido(java.lang.String ribSegundoApellido);

    /**
     * Find the first TdRuspInfoBasica entity that matches the condition 'where ribSueldo is equals to'.
     *
     * @param ribSueldo java.lang.Double
     * @return TdRuspInfoBasica
     */
    @FindByCondition(value = TdRuspInfoBasica.class, condition = "RIB_SUELDO=?")
    TdRuspInfoBasica getByRibSueldo(java.lang.Double ribSueldo);

    /**
     * Find all TdRuspInfoBasica entities that matches the condition 'where ribSueldo is equals to'.
     *
     * @param ribSueldo java.lang.Double
     * @return Collection of TdRuspInfoBasica
     */
    @FindByCondition(value = TdRuspInfoBasica.class, condition = "RIB_SUELDO=?")
    List<TdRuspInfoBasica> findByRibSueldo(java.lang.Double ribSueldo);

    /**
     * Find the first TdRuspInfoBasica entity that matches the condition 'where ribTipoContratacion is equals to'.
     *
     * @param ribTipoContratacion java.lang.Boolean
     * @return TdRuspInfoBasica
     */
    @FindByCondition(value = TdRuspInfoBasica.class, condition = "RIB_TIPO_CONTRATACION=?")
    TdRuspInfoBasica getByRibTipoContratacion(java.lang.Boolean ribTipoContratacion);

    /**
     * Find all TdRuspInfoBasica entities that matches the condition 'where ribTipoContratacion is equals to'.
     *
     * @param ribTipoContratacion java.lang.Boolean
     * @return Collection of TdRuspInfoBasica
     */
    @FindByCondition(value = TdRuspInfoBasica.class, condition = "RIB_TIPO_CONTRATACION=?")
    List<TdRuspInfoBasica> findByRibTipoContratacion(java.lang.Boolean ribTipoContratacion);

    /**
     * Find the first TdRuspInfoBasica entity that matches the condition 'where ribTipoPersonal is equals to'.
     *
     * @param ribTipoPersonal java.lang.Boolean
     * @return TdRuspInfoBasica
     */
    @FindByCondition(value = TdRuspInfoBasica.class, condition = "RIB_TIPO_PERSONAL=?")
    TdRuspInfoBasica getByRibTipoPersonal(java.lang.Boolean ribTipoPersonal);

    /**
     * Find all TdRuspInfoBasica entities that matches the condition 'where ribTipoPersonal is equals to'.
     *
     * @param ribTipoPersonal java.lang.Boolean
     * @return Collection of TdRuspInfoBasica
     */
    @FindByCondition(value = TdRuspInfoBasica.class, condition = "RIB_TIPO_PERSONAL=?")
    List<TdRuspInfoBasica> findByRibTipoPersonal(java.lang.Boolean ribTipoPersonal);

    /**
     * Find the first TdRuspInfoBasica entity that matches the condition 'where ribTipoPlaza is equals to'.
     *
     * @param ribTipoPlaza java.lang.Boolean
     * @return TdRuspInfoBasica
     */
    @FindByCondition(value = TdRuspInfoBasica.class, condition = "RIB_TIPO_PLAZA=?")
    TdRuspInfoBasica getByRibTipoPlaza(java.lang.Boolean ribTipoPlaza);

    /**
     * Find all TdRuspInfoBasica entities that matches the condition 'where ribTipoPlaza is equals to'.
     *
     * @param ribTipoPlaza java.lang.Boolean
     * @return Collection of TdRuspInfoBasica
     */
    @FindByCondition(value = TdRuspInfoBasica.class, condition = "RIB_TIPO_PLAZA=?")
    List<TdRuspInfoBasica> findByRibTipoPlaza(java.lang.Boolean ribTipoPlaza);
}
