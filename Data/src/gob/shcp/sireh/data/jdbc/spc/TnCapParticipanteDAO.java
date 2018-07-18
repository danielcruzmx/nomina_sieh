package gob.shcp.sireh.data.jdbc.spc;

import gob.shcp.fsn.data.annotation.Delete;
import gob.shcp.fsn.data.annotation.FindAll;
import gob.shcp.fsn.data.annotation.FindByCondition;
import gob.shcp.fsn.data.annotation.FindById;
import gob.shcp.fsn.data.annotation.Save;
import gob.shcp.fsn.service.data.orm.JdbcDataService;

import java.util.List;

import gob.shcp.sireh.domain.jdbc.spc.TnCapParticipante;

/**
 * Data access interface for TnCapParticipante.
 */
public interface TnCapParticipanteDAO extends JdbcDataService {
    /**
     * Find TnCapParticipante entity by its identifier or primary key value.
     *
     * @param id identifier or primary key
     * @return TnCapParticipante
     */
    @FindById(TnCapParticipante.class)
    TnCapParticipante getById(gob.shcp.sireh.domain.jdbc.spc.TnCapParticipantePK id);

    /**
     * Get all TnCapParticipante entities limited by a maximum number of elements.
     *
     * @return Collection of TnCapParticipante
     */
    @FindAll(TnCapParticipante.class)
    List<TnCapParticipante> findAll();

    /**
     * Make persistence of TnCapParticipante entities. If its identifier or primary key is null then create else update.
     *
     * @param entity TnCapParticipante
     */
    @Save
    void save(TnCapParticipante entity);

    /**
     * Remove TnCapParticipante entities.
     *
     * @param entity TnCapParticipante
     */
    @Delete
    void delete(TnCapParticipante entity);


    /**
     * Find the first TnCapParticipante entity that matches the condition 'where fecModifico is equals to'.
     *
     * @param fecModifico java.util.Date
     * @return TnCapParticipante
     */
    @FindByCondition(value = TnCapParticipante.class, condition = "FEC_MODIFICO=?")
    TnCapParticipante getByFecModifico(java.util.Date fecModifico);

    /**
     * Find all TnCapParticipante entities that matches the condition 'where fecModifico is equals to'.
     *
     * @param fecModifico java.util.Date
     * @return Collection of TnCapParticipante
     */
    @FindByCondition(value = TnCapParticipante.class, condition = "FEC_MODIFICO=?")
    List<TnCapParticipante> findByFecModifico(java.util.Date fecModifico);

    /**
     * Find the first TnCapParticipante entity that matches the condition 'where idGenero is equals to'.
     *
     * @param idGenero java.lang.String
     * @return TnCapParticipante
     */
    @FindByCondition(value = TnCapParticipante.class, condition = "ID_GENERO=?")
    TnCapParticipante getByIdGenero(java.lang.String idGenero);

    /**
     * Find all TnCapParticipante entities that matches the condition 'where idGenero is equals to'.
     *
     * @param idGenero java.lang.String
     * @return Collection of TnCapParticipante
     */
    @FindByCondition(value = TnCapParticipante.class, condition = "ID_GENERO=?")
    List<TnCapParticipante> findByIdGenero(java.lang.String idGenero);

    /**
     * Find the first TnCapParticipante entity that matches the condition 'where idNivelPto is equals to'.
     *
     * @param idNivelPto java.lang.String
     * @return TnCapParticipante
     */
    @FindByCondition(value = TnCapParticipante.class, condition = "ID_NIVEL_PTO=?")
    TnCapParticipante getByIdNivelPto(java.lang.String idNivelPto);

    /**
     * Find all TnCapParticipante entities that matches the condition 'where idNivelPto is equals to'.
     *
     * @param idNivelPto java.lang.String
     * @return Collection of TnCapParticipante
     */
    @FindByCondition(value = TnCapParticipante.class, condition = "ID_NIVEL_PTO=?")
    List<TnCapParticipante> findByIdNivelPto(java.lang.String idNivelPto);

    /**
     * Find the first TnCapParticipante entity that matches the condition 'where idPuestoNom is equals to'.
     *
     * @param idPuestoNom java.lang.String
     * @return TnCapParticipante
     */
    @FindByCondition(value = TnCapParticipante.class, condition = "ID_PUESTO_NOM=?")
    TnCapParticipante getByIdPuestoNom(java.lang.String idPuestoNom);

    /**
     * Find all TnCapParticipante entities that matches the condition 'where idPuestoNom is equals to'.
     *
     * @param idPuestoNom java.lang.String
     * @return Collection of TnCapParticipante
     */
    @FindByCondition(value = TnCapParticipante.class, condition = "ID_PUESTO_NOM=?")
    List<TnCapParticipante> findByIdPuestoNom(java.lang.String idPuestoNom);

    /**
     * Find the first TnCapParticipante entity that matches the condition 'where idUnidad is equals to'.
     *
     * @param idUnidad java.lang.String
     * @return TnCapParticipante
     */
    @FindByCondition(value = TnCapParticipante.class, condition = "ID_UNIDAD=?")
    TnCapParticipante getByIdUnidad(java.lang.String idUnidad);

    /**
     * Find all TnCapParticipante entities that matches the condition 'where idUnidad is equals to'.
     *
     * @param idUnidad java.lang.String
     * @return Collection of TnCapParticipante
     */
    @FindByCondition(value = TnCapParticipante.class, condition = "ID_UNIDAD=?")
    List<TnCapParticipante> findByIdUnidad(java.lang.String idUnidad);

    /**
     * Find the first TnCapParticipante entity that matches the condition 'where participanteAsistencia is equals to'.
     *
     * @param participanteAsistencia int
     * @return TnCapParticipante
     */
    @FindByCondition(value = TnCapParticipante.class, condition = "PARTICIPANTE_ASISTENCIA=?")
    TnCapParticipante getByParticipanteAsistencia(int participanteAsistencia);

    /**
     * Find all TnCapParticipante entities that matches the condition 'where participanteAsistencia is equals to'.
     *
     * @param participanteAsistencia int
     * @return Collection of TnCapParticipante
     */
    @FindByCondition(value = TnCapParticipante.class, condition = "PARTICIPANTE_ASISTENCIA=?")
    List<TnCapParticipante> findByParticipanteAsistencia(int participanteAsistencia);

    /**
     * Find the first TnCapParticipante entity that matches the condition 'where participanteCalificacionFin is equals to'.
     *
     * @param participanteCalificacionFin float
     * @return TnCapParticipante
     */
    @FindByCondition(value = TnCapParticipante.class, condition = "PARTICIPANTE_CALIFICACION_FIN=?")
    TnCapParticipante getByParticipanteCalificacionFin(float participanteCalificacionFin);

    /**
     * Find all TnCapParticipante entities that matches the condition 'where participanteCalificacionFin is equals to'.
     *
     * @param participanteCalificacionFin float
     * @return Collection of TnCapParticipante
     */
    @FindByCondition(value = TnCapParticipante.class, condition = "PARTICIPANTE_CALIFICACION_FIN=?")
    List<TnCapParticipante> findByParticipanteCalificacionFin(float participanteCalificacionFin);

    /**
     * Find the first TnCapParticipante entity that matches the condition 'where participanteCalificacionIni is equals to'.
     *
     * @param participanteCalificacionIni float
     * @return TnCapParticipante
     */
    @FindByCondition(value = TnCapParticipante.class, condition = "PARTICIPANTE_CALIFICACION_INI=?")
    TnCapParticipante getByParticipanteCalificacionIni(float participanteCalificacionIni);

    /**
     * Find all TnCapParticipante entities that matches the condition 'where participanteCalificacionIni is equals to'.
     *
     * @param participanteCalificacionIni float
     * @return Collection of TnCapParticipante
     */
    @FindByCondition(value = TnCapParticipante.class, condition = "PARTICIPANTE_CALIFICACION_INI=?")
    List<TnCapParticipante> findByParticipanteCalificacionIni(float participanteCalificacionIni);

    /**
     * Find the first TnCapParticipante entity that matches the condition 'where participanteCurp is equals to'.
     *
     * @param participanteCurp java.lang.String
     * @return TnCapParticipante
     */
    @FindByCondition(value = TnCapParticipante.class, condition = "PARTICIPANTE_CURP=?")
    TnCapParticipante getByParticipanteCurp(java.lang.String participanteCurp);

    /**
     * Find all TnCapParticipante entities that matches the condition 'where participanteCurp is equals to'.
     *
     * @param participanteCurp java.lang.String
     * @return Collection of TnCapParticipante
     */
    @FindByCondition(value = TnCapParticipante.class, condition = "PARTICIPANTE_CURP=?")
    List<TnCapParticipante> findByParticipanteCurp(java.lang.String participanteCurp);

    /**
     * Find the first TnCapParticipante entity that matches the condition 'where participanteIdRusp is equals to'.
     *
     * @param participanteIdRusp java.lang.String
     * @return TnCapParticipante
     */
    @FindByCondition(value = TnCapParticipante.class, condition = "PARTICIPANTE_ID_RUSP=?")
    TnCapParticipante getByParticipanteIdRusp(java.lang.String participanteIdRusp);

    /**
     * Find all TnCapParticipante entities that matches the condition 'where participanteIdRusp is equals to'.
     *
     * @param participanteIdRusp java.lang.String
     * @return Collection of TnCapParticipante
     */
    @FindByCondition(value = TnCapParticipante.class, condition = "PARTICIPANTE_ID_RUSP=?")
    List<TnCapParticipante> findByParticipanteIdRusp(java.lang.String participanteIdRusp);

    /**
     * Find the first TnCapParticipante entity that matches the condition 'where participanteNombre is equals to'.
     *
     * @param participanteNombre java.lang.String
     * @return TnCapParticipante
     */
    @FindByCondition(value = TnCapParticipante.class, condition = "PARTICIPANTE_NOMBRE=?")
    TnCapParticipante getByParticipanteNombre(java.lang.String participanteNombre);

    /**
     * Find all TnCapParticipante entities that matches the condition 'where participanteNombre is equals to'.
     *
     * @param participanteNombre java.lang.String
     * @return Collection of TnCapParticipante
     */
    @FindByCondition(value = TnCapParticipante.class, condition = "PARTICIPANTE_NOMBRE=?")
    List<TnCapParticipante> findByParticipanteNombre(java.lang.String participanteNombre);

    /**
     * Find the first TnCapParticipante entity that matches the condition 'where usuario is equals to'.
     *
     * @param usuario java.lang.String
     * @return TnCapParticipante
     */
    @FindByCondition(value = TnCapParticipante.class, condition = "USUARIO=?")
    TnCapParticipante getByUsuario(java.lang.String usuario);

    /**
     * Find all TnCapParticipante entities that matches the condition 'where usuario is equals to'.
     *
     * @param usuario java.lang.String
     * @return Collection of TnCapParticipante
     */
    @FindByCondition(value = TnCapParticipante.class, condition = "USUARIO=?")
    List<TnCapParticipante> findByUsuario(java.lang.String usuario);

    /**
     * Find the first TnCapParticipante entity that matches the condition 'where participanteAcuse is equals to'.
     *
     * @param participanteAcuse java.lang.String
     * @return TnCapParticipante
     */
    @FindByCondition(value = TnCapParticipante.class, condition = "PARTICIPANTE_ACUSE=?")
    TnCapParticipante getByParticipanteAcuse(java.lang.String participanteAcuse);

    /**
     * Find all TnCapParticipante entities that matches the condition 'where participanteAcuse is equals to'.
     *
     * @param participanteAcuse java.lang.String
     * @return Collection of TnCapParticipante
     */
    @FindByCondition(value = TnCapParticipante.class, condition = "PARTICIPANTE_ACUSE=?")
    List<TnCapParticipante> findByParticipanteAcuse(java.lang.String participanteAcuse);

    /**
     * Find the first TnCapParticipante entity that matches the condition 'where participanteAcuseFirmado is equals to'.
     *
     * @param participanteAcuseFirmado java.lang.String
     * @return TnCapParticipante
     */
    @FindByCondition(value = TnCapParticipante.class, condition = "PARTICIPANTE_ACUSE_FIRMADO=?")
    TnCapParticipante getByParticipanteAcuseFirmado(java.lang.String participanteAcuseFirmado);

    /**
     * Find all TnCapParticipante entities that matches the condition 'where participanteAcuseFirmado is equals to'.
     *
     * @param participanteAcuseFirmado java.lang.String
     * @return Collection of TnCapParticipante
     */
    @FindByCondition(value = TnCapParticipante.class, condition = "PARTICIPANTE_ACUSE_FIRMADO=?")
    List<TnCapParticipante> findByParticipanteAcuseFirmado(java.lang.String participanteAcuseFirmado);

    /**
     * Find the first TnCapParticipante entity that matches the condition 'where participanteAcuseXml is equals to'.
     *
     * @param participanteAcuseXml java.sql.Clob
     * @return TnCapParticipante
     */
    @FindByCondition(value = TnCapParticipante.class, condition = "PARTICIPANTE_ACUSE_XML=?")
    TnCapParticipante getByParticipanteAcuseXml(java.sql.Clob participanteAcuseXml);

    /**
     * Find all TnCapParticipante entities that matches the condition 'where participanteAcuseXml is equals to'.
     *
     * @param participanteAcuseXml java.sql.Clob
     * @return Collection of TnCapParticipante
     */
    @FindByCondition(value = TnCapParticipante.class, condition = "PARTICIPANTE_ACUSE_XML=?")
    List<TnCapParticipante> findByParticipanteAcuseXml(java.sql.Clob participanteAcuseXml);

    /**
     * Find the first TnCapParticipante entity that matches the condition 'where participanteAcuseXmlFirmado is equals to'.
     *
     * @param participanteAcuseXmlFirmado java.sql.Clob
     * @return TnCapParticipante
     */
    @FindByCondition(value = TnCapParticipante.class, condition = "PARTICIPANTE_ACUSE_XML_FIRMADO=?")
    TnCapParticipante getByParticipanteAcuseXmlFirmado(java.sql.Clob participanteAcuseXmlFirmado);

    /**
     * Find all TnCapParticipante entities that matches the condition 'where participanteAcuseXmlFirmado is equals to'.
     *
     * @param participanteAcuseXmlFirmado java.sql.Clob
     * @return Collection of TnCapParticipante
     */
    @FindByCondition(value = TnCapParticipante.class, condition = "PARTICIPANTE_ACUSE_XML_FIRMADO=?")
    List<TnCapParticipante> findByParticipanteAcuseXmlFirmado(java.sql.Clob participanteAcuseXmlFirmado);

    /**
     * Find the first TnCapParticipante entity that matches the condition 'where participanteCategoriaRusp is equals to'.
     *
     * @param participanteCategoriaRusp java.lang.String
     * @return TnCapParticipante
     */
    @FindByCondition(value = TnCapParticipante.class, condition = "PARTICIPANTE_CATEGORIA_RUSP=?")
    TnCapParticipante getByParticipanteCategoriaRusp(java.lang.String participanteCategoriaRusp);

    /**
     * Find all TnCapParticipante entities that matches the condition 'where participanteCategoriaRusp is equals to'.
     *
     * @param participanteCategoriaRusp java.lang.String
     * @return Collection of TnCapParticipante
     */
    @FindByCondition(value = TnCapParticipante.class, condition = "PARTICIPANTE_CATEGORIA_RUSP=?")
    List<TnCapParticipante> findByParticipanteCategoriaRusp(java.lang.String participanteCategoriaRusp);

    /**
     * Find the first TnCapParticipante entity that matches the condition 'where participanteCerEvaCalif1 is equals to'.
     *
     * @param participanteCerEvaCalif1 java.lang.String
     * @return TnCapParticipante
     */
    @FindByCondition(value = TnCapParticipante.class, condition = "PARTICIPANTE_CER_EVA_CALIF1=?")
    TnCapParticipante getByParticipanteCerEvaCalif1(java.lang.String participanteCerEvaCalif1);

    /**
     * Find all TnCapParticipante entities that matches the condition 'where participanteCerEvaCalif1 is equals to'.
     *
     * @param participanteCerEvaCalif1 java.lang.String
     * @return Collection of TnCapParticipante
     */
    @FindByCondition(value = TnCapParticipante.class, condition = "PARTICIPANTE_CER_EVA_CALIF1=?")
    List<TnCapParticipante> findByParticipanteCerEvaCalif1(java.lang.String participanteCerEvaCalif1);

    /**
     * Find the first TnCapParticipante entity that matches the condition 'where participanteCerEvaCalif2 is equals to'.
     *
     * @param participanteCerEvaCalif2 java.lang.String
     * @return TnCapParticipante
     */
    @FindByCondition(value = TnCapParticipante.class, condition = "PARTICIPANTE_CER_EVA_CALIF2=?")
    TnCapParticipante getByParticipanteCerEvaCalif2(java.lang.String participanteCerEvaCalif2);

    /**
     * Find all TnCapParticipante entities that matches the condition 'where participanteCerEvaCalif2 is equals to'.
     *
     * @param participanteCerEvaCalif2 java.lang.String
     * @return Collection of TnCapParticipante
     */
    @FindByCondition(value = TnCapParticipante.class, condition = "PARTICIPANTE_CER_EVA_CALIF2=?")
    List<TnCapParticipante> findByParticipanteCerEvaCalif2(java.lang.String participanteCerEvaCalif2);

    /**
     * Find the first TnCapParticipante entity that matches the condition 'where participanteCerEvaFecha1 is equals to'.
     *
     * @param participanteCerEvaFecha1 java.util.Date
     * @return TnCapParticipante
     */
    @FindByCondition(value = TnCapParticipante.class, condition = "PARTICIPANTE_CER_EVA_FECHA1=?")
    TnCapParticipante getByParticipanteCerEvaFecha1(java.util.Date participanteCerEvaFecha1);

    /**
     * Find all TnCapParticipante entities that matches the condition 'where participanteCerEvaFecha1 is equals to'.
     *
     * @param participanteCerEvaFecha1 java.util.Date
     * @return Collection of TnCapParticipante
     */
    @FindByCondition(value = TnCapParticipante.class, condition = "PARTICIPANTE_CER_EVA_FECHA1=?")
    List<TnCapParticipante> findByParticipanteCerEvaFecha1(java.util.Date participanteCerEvaFecha1);

    /**
     * Find the first TnCapParticipante entity that matches the condition 'where participanteCerEvaFecha2 is equals to'.
     *
     * @param participanteCerEvaFecha2 java.util.Date
     * @return TnCapParticipante
     */
    @FindByCondition(value = TnCapParticipante.class, condition = "PARTICIPANTE_CER_EVA_FECHA2=?")
    TnCapParticipante getByParticipanteCerEvaFecha2(java.util.Date participanteCerEvaFecha2);

    /**
     * Find all TnCapParticipante entities that matches the condition 'where participanteCerEvaFecha2 is equals to'.
     *
     * @param participanteCerEvaFecha2 java.util.Date
     * @return Collection of TnCapParticipante
     */
    @FindByCondition(value = TnCapParticipante.class, condition = "PARTICIPANTE_CER_EVA_FECHA2=?")
    List<TnCapParticipante> findByParticipanteCerEvaFecha2(java.util.Date participanteCerEvaFecha2);

    /**
     * Find the first TnCapParticipante entity that matches the condition 'where participanteClasifRusp is equals to'.
     *
     * @param participanteClasifRusp java.lang.String
     * @return TnCapParticipante
     */
    @FindByCondition(value = TnCapParticipante.class, condition = "PARTICIPANTE_CLASIF_RUSP=?")
    TnCapParticipante getByParticipanteClasifRusp(java.lang.String participanteClasifRusp);

    /**
     * Find all TnCapParticipante entities that matches the condition 'where participanteClasifRusp is equals to'.
     *
     * @param participanteClasifRusp java.lang.String
     * @return Collection of TnCapParticipante
     */
    @FindByCondition(value = TnCapParticipante.class, condition = "PARTICIPANTE_CLASIF_RUSP=?")
    List<TnCapParticipante> findByParticipanteClasifRusp(java.lang.String participanteClasifRusp);

    /**
     * Find the first TnCapParticipante entity that matches the condition 'where participanteDg is equals to'.
     *
     * @param participanteDg java.lang.Integer
     * @return TnCapParticipante
     */
    @FindByCondition(value = TnCapParticipante.class, condition = "PARTICIPANTE_DG=?")
    TnCapParticipante getByParticipanteDg(java.lang.Integer participanteDg);

    /**
     * Find all TnCapParticipante entities that matches the condition 'where participanteDg is equals to'.
     *
     * @param participanteDg java.lang.Integer
     * @return Collection of TnCapParticipante
     */
    @FindByCondition(value = TnCapParticipante.class, condition = "PARTICIPANTE_DG=?")
    List<TnCapParticipante> findByParticipanteDg(java.lang.Integer participanteDg);

    /**
     * Find the first TnCapParticipante entity that matches the condition 'where participanteEmail is equals to'.
     *
     * @param participanteEmail java.lang.String
     * @return TnCapParticipante
     */
    @FindByCondition(value = TnCapParticipante.class, condition = "PARTICIPANTE_EMAIL=?")
    TnCapParticipante getByParticipanteEmail(java.lang.String participanteEmail);

    /**
     * Find all TnCapParticipante entities that matches the condition 'where participanteEmail is equals to'.
     *
     * @param participanteEmail java.lang.String
     * @return Collection of TnCapParticipante
     */
    @FindByCondition(value = TnCapParticipante.class, condition = "PARTICIPANTE_EMAIL=?")
    List<TnCapParticipante> findByParticipanteEmail(java.lang.String participanteEmail);

    /**
     * Find the first TnCapParticipante entity that matches the condition 'where participanteNotificacion is equals to'.
     *
     * @param participanteNotificacion java.util.Date
     * @return TnCapParticipante
     */
    @FindByCondition(value = TnCapParticipante.class, condition = "PARTICIPANTE_NOTIFICACION=?")
    TnCapParticipante getByParticipanteNotificacion(java.util.Date participanteNotificacion);

    /**
     * Find all TnCapParticipante entities that matches the condition 'where participanteNotificacion is equals to'.
     *
     * @param participanteNotificacion java.util.Date
     * @return Collection of TnCapParticipante
     */
    @FindByCondition(value = TnCapParticipante.class, condition = "PARTICIPANTE_NOTIFICACION=?")
    List<TnCapParticipante> findByParticipanteNotificacion(java.util.Date participanteNotificacion);

    /**
     * Find the first TnCapParticipante entity that matches the condition 'where participanteObservaciones is equals to'.
     *
     * @param participanteObservaciones java.lang.String
     * @return TnCapParticipante
     */
    @FindByCondition(value = TnCapParticipante.class, condition = "PARTICIPANTE_OBSERVACIONES=?")
    TnCapParticipante getByParticipanteObservaciones(java.lang.String participanteObservaciones);

    /**
     * Find all TnCapParticipante entities that matches the condition 'where participanteObservaciones is equals to'.
     *
     * @param participanteObservaciones java.lang.String
     * @return Collection of TnCapParticipante
     */
    @FindByCondition(value = TnCapParticipante.class, condition = "PARTICIPANTE_OBSERVACIONES=?")
    List<TnCapParticipante> findByParticipanteObservaciones(java.lang.String participanteObservaciones);

    /**
     * Find the first TnCapParticipante entity that matches the condition 'where participantePrimerApellido is equals to'.
     *
     * @param participantePrimerApellido java.lang.String
     * @return TnCapParticipante
     */
    @FindByCondition(value = TnCapParticipante.class, condition = "PARTICIPANTE_PRIMER_APELLIDO=?")
    TnCapParticipante getByParticipantePrimerApellido(java.lang.String participantePrimerApellido);

    /**
     * Find all TnCapParticipante entities that matches the condition 'where participantePrimerApellido is equals to'.
     *
     * @param participantePrimerApellido java.lang.String
     * @return Collection of TnCapParticipante
     */
    @FindByCondition(value = TnCapParticipante.class, condition = "PARTICIPANTE_PRIMER_APELLIDO=?")
    List<TnCapParticipante> findByParticipantePrimerApellido(java.lang.String participantePrimerApellido);

    /**
     * Find the first TnCapParticipante entity that matches the condition 'where participantePtoRusp is equals to'.
     *
     * @param participantePtoRusp java.lang.String
     * @return TnCapParticipante
     */
    @FindByCondition(value = TnCapParticipante.class, condition = "PARTICIPANTE_PTO_RUSP=?")
    TnCapParticipante getByParticipantePtoRusp(java.lang.String participantePtoRusp);

    /**
     * Find all TnCapParticipante entities that matches the condition 'where participantePtoRusp is equals to'.
     *
     * @param participantePtoRusp java.lang.String
     * @return Collection of TnCapParticipante
     */
    @FindByCondition(value = TnCapParticipante.class, condition = "PARTICIPANTE_PTO_RUSP=?")
    List<TnCapParticipante> findByParticipantePtoRusp(java.lang.String participantePtoRusp);

    /**
     * Find the first TnCapParticipante entity that matches the condition 'where participanteSegundoApellido is equals to'.
     *
     * @param participanteSegundoApellido java.lang.String
     * @return TnCapParticipante
     */
    @FindByCondition(value = TnCapParticipante.class, condition = "PARTICIPANTE_SEGUNDO_APELLIDO=?")
    TnCapParticipante getByParticipanteSegundoApellido(java.lang.String participanteSegundoApellido);

    /**
     * Find all TnCapParticipante entities that matches the condition 'where participanteSegundoApellido is equals to'.
     *
     * @param participanteSegundoApellido java.lang.String
     * @return Collection of TnCapParticipante
     */
    @FindByCondition(value = TnCapParticipante.class, condition = "PARTICIPANTE_SEGUNDO_APELLIDO=?")
    List<TnCapParticipante> findByParticipanteSegundoApellido(java.lang.String participanteSegundoApellido);

    /**
     * Find the first TnCapParticipante entity that matches the condition 'where participanteUrRepoOm is equals to'.
     *
     * @param participanteUrRepoOm java.lang.Integer
     * @return TnCapParticipante
     */
    @FindByCondition(value = TnCapParticipante.class, condition = "PARTICIPANTE_UR_REPO_OM=?")
    TnCapParticipante getByParticipanteUrRepoOm(java.lang.Integer participanteUrRepoOm);

    /**
     * Find all TnCapParticipante entities that matches the condition 'where participanteUrRepoOm is equals to'.
     *
     * @param participanteUrRepoOm java.lang.Integer
     * @return Collection of TnCapParticipante
     */
    @FindByCondition(value = TnCapParticipante.class, condition = "PARTICIPANTE_UR_REPO_OM=?")
    List<TnCapParticipante> findByParticipanteUrRepoOm(java.lang.Integer participanteUrRepoOm);
}
