package gob.shcp.sireh.domain.jdbc.spc;

import gob.shcp.fsn.data.Domain;
import gob.shcp.fsn.data.annotation.PrimaryKey;

import java.io.Serializable;

/**
 * Domain object for persistent TnCapParticipante data.
 */
public class TnCapParticipante implements Domain, Serializable {
    private TnCapParticipantePK idComposite;
    private int idSituacionParticipante;
    private java.util.Date fecModifico;
    private java.lang.String idGenero;
    private java.lang.String idNivelPto;
    private java.lang.String idPuestoNom;
    private java.lang.String idUnidad;
    private int participanteAsistencia;
    private float participanteCalificacionFin;
    private float participanteCalificacionIni;
    private java.lang.String participanteCurp;
    private java.lang.String participanteIdRusp;
    private java.lang.String participanteNombre;
    private java.lang.String usuario;
    private java.lang.String participanteAcuse;
    private java.lang.String participanteAcuseFirmado;
    private java.sql.Clob participanteAcuseXml;
    private java.sql.Clob participanteAcuseXmlFirmado;
    private java.lang.String participanteCategoriaRusp;
    private java.lang.String participanteCerEvaCalif1;
    private java.lang.String participanteCerEvaCalif2;
    private java.util.Date participanteCerEvaFecha1;
    private java.util.Date participanteCerEvaFecha2;
    private java.lang.String participanteClasifRusp;
    private java.lang.Integer participanteDg;
    private java.lang.String participanteEmail;
    private java.util.Date participanteNotificacion;
    private java.lang.String participanteObservaciones;
    private java.lang.String participantePrimerApellido;
    private java.lang.String participantePtoRusp;
    private java.lang.String participanteSegundoApellido;
    private java.lang.Integer participanteUrRepoOm;

    /**
     * Constructor for TnCapParticipante class.
     */
    public TnCapParticipante() {
    }

    /**
     * Constructor for TnCapParticipante class.
     *
     * @param idCurso java.lang.Integer
     * @param rfcEmpleado java.lang.String
     * @param idSituacionParticipante int
     * @param fecModifico java.util.Date
     * @param idGenero java.lang.String
     * @param idNivelPto java.lang.String
     * @param idPuestoNom java.lang.String
     * @param idUnidad java.lang.String
     * @param participanteAsistencia int
     * @param participanteCalificacionFin float
     * @param participanteCalificacionIni float
     * @param participanteCurp java.lang.String
     * @param participanteIdRusp java.lang.String
     * @param participanteNombre java.lang.String
     * @param usuario java.lang.String
     * @param participanteAcuse java.lang.String
     * @param participanteAcuseFirmado java.lang.String
     * @param participanteAcuseXml java.sql.Clob
     * @param participanteAcuseXmlFirmado java.sql.Clob
     * @param participanteCategoriaRusp java.lang.String
     * @param participanteCerEvaCalif1 java.lang.String
     * @param participanteCerEvaCalif2 java.lang.String
     * @param participanteCerEvaFecha1 java.util.Date
     * @param participanteCerEvaFecha2 java.util.Date
     * @param participanteClasifRusp java.lang.String
     * @param participanteDg java.lang.Integer
     * @param participanteEmail java.lang.String
     * @param participanteNotificacion java.util.Date
     * @param participanteObservaciones java.lang.String
     * @param participantePrimerApellido java.lang.String
     * @param participantePtoRusp java.lang.String
     * @param participanteSegundoApellido java.lang.String
     * @param participanteUrRepoOm java.lang.Integer
     */
    public TnCapParticipante(TnCapParticipantePK idComposite, int idSituacionParticipante, java.util.Date fecModifico, 
                             java.lang.String idGenero, java.lang.String idNivelPto, java.lang.String idPuestoNom, 
                             java.lang.String idUnidad, int participanteAsistencia, float participanteCalificacionFin, 
                             float participanteCalificacionIni, java.lang.String participanteCurp, 
                             java.lang.String participanteIdRusp, java.lang.String participanteNombre, 
                             java.lang.String usuario, java.lang.String participanteAcuse, 
                             java.lang.String participanteAcuseFirmado, java.sql.Clob participanteAcuseXml, 
                             java.sql.Clob participanteAcuseXmlFirmado, java.lang.String participanteCategoriaRusp, 
                             java.lang.String participanteCerEvaCalif1, java.lang.String participanteCerEvaCalif2, 
                             java.util.Date participanteCerEvaFecha1, java.util.Date participanteCerEvaFecha2, 
                             java.lang.String participanteClasifRusp, java.lang.Integer participanteDg, 
                             java.lang.String participanteEmail, java.util.Date participanteNotificacion, 
                             java.lang.String participanteObservaciones, java.lang.String participantePrimerApellido, 
                             java.lang.String participantePtoRusp, java.lang.String participanteSegundoApellido, 
                             java.lang.Integer participanteUrRepoOm) {
        this.idComposite = idComposite;
        this.idSituacionParticipante = idSituacionParticipante;
        this.fecModifico = fecModifico;
        this.idGenero = idGenero;
        this.idNivelPto = idNivelPto;
        this.idPuestoNom = idPuestoNom;
        this.idUnidad = idUnidad;
        this.participanteAsistencia = participanteAsistencia;
        this.participanteCalificacionFin = participanteCalificacionFin;
        this.participanteCalificacionIni = participanteCalificacionIni;
        this.participanteCurp = participanteCurp;
        this.participanteIdRusp = participanteIdRusp;
        this.participanteNombre = participanteNombre;
        this.usuario = usuario;
        this.participanteAcuse = participanteAcuse;
        this.participanteAcuseFirmado = participanteAcuseFirmado;
        this.participanteAcuseXml = participanteAcuseXml;
        this.participanteAcuseXmlFirmado = participanteAcuseXmlFirmado;
        this.participanteCategoriaRusp = participanteCategoriaRusp;
        this.participanteCerEvaCalif1 = participanteCerEvaCalif1;
        this.participanteCerEvaCalif2 = participanteCerEvaCalif2;
        this.participanteCerEvaFecha1 = participanteCerEvaFecha1;
        this.participanteCerEvaFecha2 = participanteCerEvaFecha2;
        this.participanteClasifRusp = participanteClasifRusp;
        this.participanteDg = participanteDg;
        this.participanteEmail = participanteEmail;
        this.participanteNotificacion = participanteNotificacion;
        this.participanteObservaciones = participanteObservaciones;
        this.participantePrimerApellido = participantePrimerApellido;
        this.participantePtoRusp = participantePtoRusp;
        this.participanteSegundoApellido = participanteSegundoApellido;
        this.participanteUrRepoOm = participanteUrRepoOm;
    }
    
    /**
     * Get idCurso value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getIdCurso() {
        if (idComposite == null) {
            return null;
        }
        return this.idComposite.getIdCurso();
    }

    /**
     * Get rfcEmpleado value.
     *
     * @return java.lang.String
     */
    public java.lang.String getRfcEmpleado() {
        if (idComposite == null) {
            return null;
        }
        return this.idComposite.getRfcEmpleado();
    }

    /**
     * Get idSituacionParticipante value.
     *
     * @return int
     */
    public int getIdSituacionParticipante() {
        return this.idSituacionParticipante;
    }

    /**
     * Get fecModifico value.
     *
     * @return java.util.Date
     */
    public java.util.Date getFecModifico() {
        return this.fecModifico;
    }

    /**
     * Get idGenero value.
     *
     * @return java.lang.String
     */
    public java.lang.String getIdGenero() {
        return this.idGenero;
    }

    /**
     * Get idNivelPto value.
     *
     * @return java.lang.String
     */
    public java.lang.String getIdNivelPto() {
        return this.idNivelPto;
    }

    /**
     * Get idPuestoNom value.
     *
     * @return java.lang.String
     */
    public java.lang.String getIdPuestoNom() {
        return this.idPuestoNom;
    }

    /**
     * Get idUnidad value.
     *
     * @return java.lang.String
     */
    public java.lang.String getIdUnidad() {
        return this.idUnidad;
    }

    /**
     * Get participanteAsistencia value.
     *
     * @return int
     */
    public int getParticipanteAsistencia() {
        return this.participanteAsistencia;
    }

    /**
     * Get participanteCalificacionFin value.
     *
     * @return float
     */
    public float getParticipanteCalificacionFin() {
        return this.participanteCalificacionFin;
    }

    /**
     * Get participanteCalificacionIni value.
     *
     * @return float
     */
    public float getParticipanteCalificacionIni() {
        return this.participanteCalificacionIni;
    }

    /**
     * Get participanteCurp value.
     *
     * @return java.lang.String
     */
    public java.lang.String getParticipanteCurp() {
        return this.participanteCurp;
    }

    /**
     * Get participanteIdRusp value.
     *
     * @return java.lang.String
     */
    public java.lang.String getParticipanteIdRusp() {
        return this.participanteIdRusp;
    }

    /**
     * Get participanteNombre value.
     *
     * @return java.lang.String
     */
    public java.lang.String getParticipanteNombre() {
        return this.participanteNombre;
    }

    /**
     * Get usuario value.
     *
     * @return java.lang.String
     */
    public java.lang.String getUsuario() {
        return this.usuario;
    }

    /**
     * Get participanteAcuse value.
     *
     * @return java.lang.String
     */
    public java.lang.String getParticipanteAcuse() {
        return this.participanteAcuse;
    }

    /**
     * Get participanteAcuseFirmado value.
     *
     * @return java.lang.String
     */
    public java.lang.String getParticipanteAcuseFirmado() {
        return this.participanteAcuseFirmado;
    }

    /**
     * Get participanteAcuseXml value.
     *
     * @return java.sql.Clob
     */
    public java.sql.Clob getParticipanteAcuseXml() {
        return this.participanteAcuseXml;
    }

    /**
     * Get participanteAcuseXmlFirmado value.
     *
     * @return java.sql.Clob
     */
    public java.sql.Clob getParticipanteAcuseXmlFirmado() {
        return this.participanteAcuseXmlFirmado;
    }

    /**
     * Get participanteCategoriaRusp value.
     *
     * @return java.lang.String
     */
    public java.lang.String getParticipanteCategoriaRusp() {
        return this.participanteCategoriaRusp;
    }

    /**
     * Get participanteCerEvaCalif1 value.
     *
     * @return java.lang.String
     */
    public java.lang.String getParticipanteCerEvaCalif1() {
        return this.participanteCerEvaCalif1;
    }

    /**
     * Get participanteCerEvaCalif2 value.
     *
     * @return java.lang.String
     */
    public java.lang.String getParticipanteCerEvaCalif2() {
        return this.participanteCerEvaCalif2;
    }

    /**
     * Get participanteCerEvaFecha1 value.
     *
     * @return java.util.Date
     */
    public java.util.Date getParticipanteCerEvaFecha1() {
        return this.participanteCerEvaFecha1;
    }

    /**
     * Get participanteCerEvaFecha2 value.
     *
     * @return java.util.Date
     */
    public java.util.Date getParticipanteCerEvaFecha2() {
        return this.participanteCerEvaFecha2;
    }

    /**
     * Get participanteClasifRusp value.
     *
     * @return java.lang.String
     */
    public java.lang.String getParticipanteClasifRusp() {
        return this.participanteClasifRusp;
    }

    /**
     * Get participanteDg value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getParticipanteDg() {
        return this.participanteDg;
    }

    /**
     * Get participanteEmail value.
     *
     * @return java.lang.String
     */
    public java.lang.String getParticipanteEmail() {
        return this.participanteEmail;
    }

    /**
     * Get participanteNotificacion value.
     *
     * @return java.util.Date
     */
    public java.util.Date getParticipanteNotificacion() {
        return this.participanteNotificacion;
    }

    /**
     * Get participanteObservaciones value.
     *
     * @return java.lang.String
     */
    public java.lang.String getParticipanteObservaciones() {
        return this.participanteObservaciones;
    }

    /**
     * Get participantePrimerApellido value.
     *
     * @return java.lang.String
     */
    public java.lang.String getParticipantePrimerApellido() {
        return this.participantePrimerApellido;
    }

    /**
     * Get participantePtoRusp value.
     *
     * @return java.lang.String
     */
    public java.lang.String getParticipantePtoRusp() {
        return this.participantePtoRusp;
    }

    /**
     * Get participanteSegundoApellido value.
     *
     * @return java.lang.String
     */
    public java.lang.String getParticipanteSegundoApellido() {
        return this.participanteSegundoApellido;
    }

    /**
     * Get participanteUrRepoOm value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getParticipanteUrRepoOm() {
        return this.participanteUrRepoOm;
    }


    /**
     * Set idCurso value.
     *
     * @param idCurso java.lang.Integer
     */
    public void setIdCurso(java.lang.Integer idCurso) {
        if (idComposite == null) {
            idComposite = new TnCapParticipantePK();
        }
        this.idComposite.setIdCurso(idCurso);
    }

    /**
     * Set rfcEmpleado value.
     *
     * @param rfcEmpleado java.lang.String
     */
    public void setRfcEmpleado(java.lang.String rfcEmpleado) {
        if (idComposite == null) {
            idComposite = new TnCapParticipantePK();
        }
        this.idComposite.setRfcEmpleado(rfcEmpleado);
    }

    /**
     * Set idSituacionParticipante value.
     *
     * @param idSituacionParticipante int
     */
    public void setIdSituacionParticipante(int idSituacionParticipante) {
        this.idSituacionParticipante = idSituacionParticipante;
    }

    /**
     * Set fecModifico value.
     *
     * @param fecModifico java.util.Date
     */
    public void setFecModifico(java.util.Date fecModifico) {
        this.fecModifico = fecModifico;
    }

    /**
     * Set idGenero value.
     *
     * @param idGenero java.lang.String
     */
    public void setIdGenero(java.lang.String idGenero) {
        this.idGenero = idGenero;
    }

    /**
     * Set idNivelPto value.
     *
     * @param idNivelPto java.lang.String
     */
    public void setIdNivelPto(java.lang.String idNivelPto) {
        this.idNivelPto = idNivelPto;
    }

    /**
     * Set idPuestoNom value.
     *
     * @param idPuestoNom java.lang.String
     */
    public void setIdPuestoNom(java.lang.String idPuestoNom) {
        this.idPuestoNom = idPuestoNom;
    }

    /**
     * Set idUnidad value.
     *
     * @param idUnidad java.lang.String
     */
    public void setIdUnidad(java.lang.String idUnidad) {
        this.idUnidad = idUnidad;
    }

    /**
     * Set participanteAsistencia value.
     *
     * @param participanteAsistencia int
     */
    public void setParticipanteAsistencia(int participanteAsistencia) {
        this.participanteAsistencia = participanteAsistencia;
    }

    /**
     * Set participanteCalificacionFin value.
     *
     * @param participanteCalificacionFin float
     */
    public void setParticipanteCalificacionFin(float participanteCalificacionFin) {
        this.participanteCalificacionFin = participanteCalificacionFin;
    }

    /**
     * Set participanteCalificacionIni value.
     *
     * @param participanteCalificacionIni float
     */
    public void setParticipanteCalificacionIni(float participanteCalificacionIni) {
        this.participanteCalificacionIni = participanteCalificacionIni;
    }

    /**
     * Set participanteCurp value.
     *
     * @param participanteCurp java.lang.String
     */
    public void setParticipanteCurp(java.lang.String participanteCurp) {
        this.participanteCurp = participanteCurp;
    }

    /**
     * Set participanteIdRusp value.
     *
     * @param participanteIdRusp java.lang.String
     */
    public void setParticipanteIdRusp(java.lang.String participanteIdRusp) {
        this.participanteIdRusp = participanteIdRusp;
    }

    /**
     * Set participanteNombre value.
     *
     * @param participanteNombre java.lang.String
     */
    public void setParticipanteNombre(java.lang.String participanteNombre) {
        this.participanteNombre = participanteNombre;
    }

    /**
     * Set usuario value.
     *
     * @param usuario java.lang.String
     */
    public void setUsuario(java.lang.String usuario) {
        this.usuario = usuario;
    }

    /**
     * Set participanteAcuse value.
     *
     * @param participanteAcuse java.lang.String
     */
    public void setParticipanteAcuse(java.lang.String participanteAcuse) {
        this.participanteAcuse = participanteAcuse;
    }

    /**
     * Set participanteAcuseFirmado value.
     *
     * @param participanteAcuseFirmado java.lang.String
     */
    public void setParticipanteAcuseFirmado(java.lang.String participanteAcuseFirmado) {
        this.participanteAcuseFirmado = participanteAcuseFirmado;
    }

    /**
     * Set participanteAcuseXml value.
     *
     * @param participanteAcuseXml java.sql.Clob
     */
    public void setParticipanteAcuseXml(java.sql.Clob participanteAcuseXml) {
        this.participanteAcuseXml = participanteAcuseXml;
    }

    /**
     * Set participanteAcuseXmlFirmado value.
     *
     * @param participanteAcuseXmlFirmado java.sql.Clob
     */
    public void setParticipanteAcuseXmlFirmado(java.sql.Clob participanteAcuseXmlFirmado) {
        this.participanteAcuseXmlFirmado = participanteAcuseXmlFirmado;
    }

    /**
     * Set participanteCategoriaRusp value.
     *
     * @param participanteCategoriaRusp java.lang.String
     */
    public void setParticipanteCategoriaRusp(java.lang.String participanteCategoriaRusp) {
        this.participanteCategoriaRusp = participanteCategoriaRusp;
    }

    /**
     * Set participanteCerEvaCalif1 value.
     *
     * @param participanteCerEvaCalif1 java.lang.String
     */
    public void setParticipanteCerEvaCalif1(java.lang.String participanteCerEvaCalif1) {
        this.participanteCerEvaCalif1 = participanteCerEvaCalif1;
    }

    /**
     * Set participanteCerEvaCalif2 value.
     *
     * @param participanteCerEvaCalif2 java.lang.String
     */
    public void setParticipanteCerEvaCalif2(java.lang.String participanteCerEvaCalif2) {
        this.participanteCerEvaCalif2 = participanteCerEvaCalif2;
    }

    /**
     * Set participanteCerEvaFecha1 value.
     *
     * @param participanteCerEvaFecha1 java.util.Date
     */
    public void setParticipanteCerEvaFecha1(java.util.Date participanteCerEvaFecha1) {
        this.participanteCerEvaFecha1 = participanteCerEvaFecha1;
    }

    /**
     * Set participanteCerEvaFecha2 value.
     *
     * @param participanteCerEvaFecha2 java.util.Date
     */
    public void setParticipanteCerEvaFecha2(java.util.Date participanteCerEvaFecha2) {
        this.participanteCerEvaFecha2 = participanteCerEvaFecha2;
    }

    /**
     * Set participanteClasifRusp value.
     *
     * @param participanteClasifRusp java.lang.String
     */
    public void setParticipanteClasifRusp(java.lang.String participanteClasifRusp) {
        this.participanteClasifRusp = participanteClasifRusp;
    }

    /**
     * Set participanteDg value.
     *
     * @param participanteDg java.lang.Integer
     */
    public void setParticipanteDg(java.lang.Integer participanteDg) {
        this.participanteDg = participanteDg;
    }

    /**
     * Set participanteEmail value.
     *
     * @param participanteEmail java.lang.String
     */
    public void setParticipanteEmail(java.lang.String participanteEmail) {
        this.participanteEmail = participanteEmail;
    }

    /**
     * Set participanteNotificacion value.
     *
     * @param participanteNotificacion java.util.Date
     */
    public void setParticipanteNotificacion(java.util.Date participanteNotificacion) {
        this.participanteNotificacion = participanteNotificacion;
    }

    /**
     * Set participanteObservaciones value.
     *
     * @param participanteObservaciones java.lang.String
     */
    public void setParticipanteObservaciones(java.lang.String participanteObservaciones) {
        this.participanteObservaciones = participanteObservaciones;
    }

    /**
     * Set participantePrimerApellido value.
     *
     * @param participantePrimerApellido java.lang.String
     */
    public void setParticipantePrimerApellido(java.lang.String participantePrimerApellido) {
        this.participantePrimerApellido = participantePrimerApellido;
    }

    /**
     * Set participantePtoRusp value.
     *
     * @param participantePtoRusp java.lang.String
     */
    public void setParticipantePtoRusp(java.lang.String participantePtoRusp) {
        this.participantePtoRusp = participantePtoRusp;
    }

    /**
     * Set participanteSegundoApellido value.
     *
     * @param participanteSegundoApellido java.lang.String
     */
    public void setParticipanteSegundoApellido(java.lang.String participanteSegundoApellido) {
        this.participanteSegundoApellido = participanteSegundoApellido;
    }

    /**
     * Set participanteUrRepoOm value.
     *
     * @param participanteUrRepoOm java.lang.Integer
     */
    public void setParticipanteUrRepoOm(java.lang.Integer participanteUrRepoOm) {
        this.participanteUrRepoOm = participanteUrRepoOm;
    }


    /**
     * Set identity value.
     *
     * @param idComposite Serializable
     */
    public void setIdentity(Serializable idComposite) {
        this.idComposite = (TnCapParticipantePK)idComposite;
    }

    /**
     * Get identity value.
     *
     * @return Serializable
     */
    public Serializable getIdentity() {
        return this.idComposite;
    }
}
