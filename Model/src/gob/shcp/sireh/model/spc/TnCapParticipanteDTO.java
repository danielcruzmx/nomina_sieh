package gob.shcp.sireh.model.spc;

import gob.shcp.fsn.model.Model;

import org.springmodules.validation.bean.conf.loader.annotation.handler.NotNull;
import org.springmodules.validation.bean.conf.loader.annotation.handler.NotBlank;
import org.springmodules.validation.bean.conf.loader.annotation.handler.MaxLength;

/**
 * Model object for transporting TnCapParticipante data.
 */
public class TnCapParticipanteDTO implements java.io.Serializable, Model {

    private java.lang.Integer idCurso;
    @NotBlank(errorCode = "not.null")
    @MaxLength(52)
    private java.lang.String rfcEmpleado;
    @NotNull
    private int idSituacionParticipante;
    @NotNull
    private java.util.Date fecModifico;
    @NotBlank(errorCode = "not.null")
    @NotNull
    @MaxLength(4)
    private java.lang.String idGenero;
    @NotBlank(errorCode = "not.null")
    @NotNull
    @MaxLength(16)
    private java.lang.String idNivelPto;
    @NotBlank(errorCode = "not.null")
    @NotNull
    @MaxLength(28)
    private java.lang.String idPuestoNom;
    @NotBlank(errorCode = "not.null")
    @NotNull
    @MaxLength(12)
    private java.lang.String idUnidad;
    @NotNull
    private int participanteAsistencia;
    @NotNull
    private float participanteCalificacionFin;
    @NotNull
    private float participanteCalificacionIni;
    @NotBlank(errorCode = "not.null")
    @NotNull
    @MaxLength(72)
    private java.lang.String participanteCurp;
    @NotBlank(errorCode = "not.null")
    @NotNull
    @MaxLength(44)
    private java.lang.String participanteIdRusp;
    @NotBlank(errorCode = "not.null")
    @NotNull
    @MaxLength(160)
    private java.lang.String participanteNombre;
    @NotBlank(errorCode = "not.null")
    @NotNull
    @MaxLength(80)
    private java.lang.String usuario;
    @MaxLength(400)
    private java.lang.String participanteAcuse;
    @MaxLength(400)
    private java.lang.String participanteAcuseFirmado;
    private java.lang.String participanteAcuseXml;
    private java.lang.String participanteAcuseXmlFirmado;
    @MaxLength(80)
    private java.lang.String participanteCategoriaRusp;
    @MaxLength(80)
    private java.lang.String participanteCerEvaCalif1;
    @MaxLength(80)
    private java.lang.String participanteCerEvaCalif2;
    private java.util.Date participanteCerEvaFecha1;
    private java.util.Date participanteCerEvaFecha2;
    @MaxLength(1200)
    private java.lang.String participanteClasifRusp;
    private java.lang.Integer participanteDg;
    @MaxLength(400)
    private java.lang.String participanteEmail;
    private java.util.Date participanteNotificacion;
    @MaxLength(400)
    private java.lang.String participanteObservaciones;
    @MaxLength(160)
    private java.lang.String participantePrimerApellido;
    @MaxLength(160)
    private java.lang.String participantePtoRusp;
    @MaxLength(160)
    private java.lang.String participanteSegundoApellido;
    private java.lang.Integer participanteUrRepoOm;
    private java.util.List<TnCapSancionDTO> tnCapSancions;

    /**
     * Constructor for TnCapParticipanteDTO class.
     */
    public TnCapParticipanteDTO() {
    }

    /**
     * Constructor for TnCapParticipanteDTO class.
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
     * @param participanteAcuseXml java.lang.String
     * @param participanteAcuseXmlFirmado java.lang.String
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
    public TnCapParticipanteDTO(java.lang.Integer idCurso, java.lang.String rfcEmpleado, int idSituacionParticipante, 
                                java.util.Date fecModifico, java.lang.String idGenero, java.lang.String idNivelPto, 
                                java.lang.String idPuestoNom, java.lang.String idUnidad, int participanteAsistencia, 
                                float participanteCalificacionFin, float participanteCalificacionIni, 
                                java.lang.String participanteCurp, java.lang.String participanteIdRusp, 
                                java.lang.String participanteNombre, java.lang.String usuario, 
                                java.lang.String participanteAcuse, java.lang.String participanteAcuseFirmado, 
                                java.lang.String participanteAcuseXml, java.lang.String participanteAcuseXmlFirmado, 
                                java.lang.String participanteCategoriaRusp, java.lang.String participanteCerEvaCalif1, 
                                java.lang.String participanteCerEvaCalif2, java.util.Date participanteCerEvaFecha1, 
                                java.util.Date participanteCerEvaFecha2, java.lang.String participanteClasifRusp, 
                                java.lang.Integer participanteDg, java.lang.String participanteEmail, 
                                java.util.Date participanteNotificacion, java.lang.String participanteObservaciones, 
                                java.lang.String participantePrimerApellido, java.lang.String participantePtoRusp, 
                                java.lang.String participanteSegundoApellido, java.lang.Integer participanteUrRepoOm, 
                                java.util.List<TnCapSancionDTO> tnCapSancions) {
        this.idCurso = idCurso;
        this.rfcEmpleado = rfcEmpleado;
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
        this.tnCapSancions = tnCapSancions;
    }
    
    /**
     * Set idCurso value.
     *
     * @param idCurso java.lang.Integer
     */
    public void setIdCurso(java.lang.Integer idCurso) {
        this.idCurso = idCurso;
    }

    /**
     * Get idCurso value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getIdCurso() {
        return this.idCurso;
    }

    /**
     * Set rfcEmpleado value.
     *
     * @param rfcEmpleado java.lang.String
     */
    public void setRfcEmpleado(java.lang.String rfcEmpleado) {
        this.rfcEmpleado = rfcEmpleado;
    }

    /**
     * Get rfcEmpleado value.
     *
     * @return java.lang.String
     */
    public java.lang.String getRfcEmpleado() {
        return this.rfcEmpleado;
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
     * Get idSituacionParticipante value.
     *
     * @return int
     */
    public int getIdSituacionParticipante() {
        return this.idSituacionParticipante;
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
     * Get fecModifico value.
     *
     * @return java.util.Date
     */
    public java.util.Date getFecModifico() {
        return this.fecModifico;
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
     * Get idGenero value.
     *
     * @return java.lang.String
     */
    public java.lang.String getIdGenero() {
        return this.idGenero;
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
     * Get idNivelPto value.
     *
     * @return java.lang.String
     */
    public java.lang.String getIdNivelPto() {
        return this.idNivelPto;
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
     * Get idPuestoNom value.
     *
     * @return java.lang.String
     */
    public java.lang.String getIdPuestoNom() {
        return this.idPuestoNom;
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
     * Get idUnidad value.
     *
     * @return java.lang.String
     */
    public java.lang.String getIdUnidad() {
        return this.idUnidad;
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
     * Get participanteAsistencia value.
     *
     * @return int
     */
    public int getParticipanteAsistencia() {
        return this.participanteAsistencia;
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
     * Get participanteCalificacionFin value.
     *
     * @return float
     */
    public float getParticipanteCalificacionFin() {
        return this.participanteCalificacionFin;
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
     * Get participanteCalificacionIni value.
     *
     * @return float
     */
    public float getParticipanteCalificacionIni() {
        return this.participanteCalificacionIni;
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
     * Get participanteCurp value.
     *
     * @return java.lang.String
     */
    public java.lang.String getParticipanteCurp() {
        return this.participanteCurp;
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
     * Get participanteIdRusp value.
     *
     * @return java.lang.String
     */
    public java.lang.String getParticipanteIdRusp() {
        return this.participanteIdRusp;
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
     * Get participanteNombre value.
     *
     * @return java.lang.String
     */
    public java.lang.String getParticipanteNombre() {
        return this.participanteNombre;
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
     * Get usuario value.
     *
     * @return java.lang.String
     */
    public java.lang.String getUsuario() {
        return this.usuario;
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
     * Get participanteAcuse value.
     *
     * @return java.lang.String
     */
    public java.lang.String getParticipanteAcuse() {
        return this.participanteAcuse;
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
     * Get participanteAcuseFirmado value.
     *
     * @return java.lang.String
     */
    public java.lang.String getParticipanteAcuseFirmado() {
        return this.participanteAcuseFirmado;
    }

    /**
     * Set participanteAcuseXml value.
     *
     * @param participanteAcuseXml java.lang.String
     */
    public void setParticipanteAcuseXml(java.lang.String participanteAcuseXml) {
        this.participanteAcuseXml = participanteAcuseXml;
    }

    /**
     * Get participanteAcuseXml value.
     *
     * @return java.lang.String
     */
    public java.lang.String getParticipanteAcuseXml() {
        return this.participanteAcuseXml;
    }

    /**
     * Set participanteAcuseXmlFirmado value.
     *
     * @param participanteAcuseXmlFirmado java.lang.String
     */
    public void setParticipanteAcuseXmlFirmado(java.lang.String participanteAcuseXmlFirmado) {
        this.participanteAcuseXmlFirmado = participanteAcuseXmlFirmado;
    }

    /**
     * Get participanteAcuseXmlFirmado value.
     *
     * @return java.lang.String
     */
    public java.lang.String getParticipanteAcuseXmlFirmado() {
        return this.participanteAcuseXmlFirmado;
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
     * Get participanteCategoriaRusp value.
     *
     * @return java.lang.String
     */
    public java.lang.String getParticipanteCategoriaRusp() {
        return this.participanteCategoriaRusp;
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
     * Get participanteCerEvaCalif1 value.
     *
     * @return java.lang.String
     */
    public java.lang.String getParticipanteCerEvaCalif1() {
        return this.participanteCerEvaCalif1;
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
     * Get participanteCerEvaCalif2 value.
     *
     * @return java.lang.String
     */
    public java.lang.String getParticipanteCerEvaCalif2() {
        return this.participanteCerEvaCalif2;
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
     * Get participanteCerEvaFecha1 value.
     *
     * @return java.util.Date
     */
    public java.util.Date getParticipanteCerEvaFecha1() {
        return this.participanteCerEvaFecha1;
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
     * Get participanteCerEvaFecha2 value.
     *
     * @return java.util.Date
     */
    public java.util.Date getParticipanteCerEvaFecha2() {
        return this.participanteCerEvaFecha2;
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
     * Get participanteClasifRusp value.
     *
     * @return java.lang.String
     */
    public java.lang.String getParticipanteClasifRusp() {
        return this.participanteClasifRusp;
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
     * Get participanteDg value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getParticipanteDg() {
        return this.participanteDg;
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
     * Get participanteEmail value.
     *
     * @return java.lang.String
     */
    public java.lang.String getParticipanteEmail() {
        return this.participanteEmail;
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
     * Get participanteNotificacion value.
     *
     * @return java.util.Date
     */
    public java.util.Date getParticipanteNotificacion() {
        return this.participanteNotificacion;
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
     * Get participanteObservaciones value.
     *
     * @return java.lang.String
     */
    public java.lang.String getParticipanteObservaciones() {
        return this.participanteObservaciones;
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
     * Get participantePrimerApellido value.
     *
     * @return java.lang.String
     */
    public java.lang.String getParticipantePrimerApellido() {
        return this.participantePrimerApellido;
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
     * Get participantePtoRusp value.
     *
     * @return java.lang.String
     */
    public java.lang.String getParticipantePtoRusp() {
        return this.participantePtoRusp;
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
     * Get participanteSegundoApellido value.
     *
     * @return java.lang.String
     */
    public java.lang.String getParticipanteSegundoApellido() {
        return this.participanteSegundoApellido;
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
     * Get participanteUrRepoOm value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getParticipanteUrRepoOm() {
        return this.participanteUrRepoOm;
    }

    /**
     * Set tnCapSancions value.
     *
     * @param tnCapSancions java.util.List
     */
    public void setTnCapSancions(java.util.List<TnCapSancionDTO> tnCapSancions) {
        this.tnCapSancions = tnCapSancions;
    }

    /**
     * Get tnCapSancions value.
     *
     * @return java.util.List
     */
    public java.util.List getTnCapSancions() {
        return this.tnCapSancions;
    }
}
