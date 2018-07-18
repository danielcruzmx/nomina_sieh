package gob.shcp.sireh.domain.jdbc.spc;

import gob.shcp.fsn.data.Domain;
import gob.shcp.fsn.data.annotation.PrimaryKey;

import java.io.Serializable;

/**
 * Domain object for persistent TnCapBitacoraCurso data.
 */
public class TnCapBitacoraCur implements Domain, Serializable {
    @PrimaryKey(sequenceName = "SN_CAP_BITACORA_CURSO_SEC")
    private java.lang.Long idCapBitacoraCurso;
    private int idCapMovto;
    private java.util.Date fecModifico;
    private java.lang.String usuario;
    private java.lang.Integer cicloEjeTematico;
    private java.lang.String cursoClave;
    private java.lang.String cursoClaveCertificacion;
    private java.lang.Float cursoDuracion;
    private java.util.Date cursoFecFin;
    private java.util.Date cursoFecIni;
    private java.lang.Integer cursoMinimoParticipantes;
    private java.lang.Integer cursoParticipantes;
    private java.lang.Double cursoPresupuesto;
    private java.lang.String cursoSupervisorInst;
    private java.lang.String idAula;
    private java.lang.Integer idContratoCurso;
    private java.lang.String idControlCurso;
    private java.lang.String idCoordinacion;
    private java.lang.Integer idCurso;
    private java.lang.String idCursoPrincipal;
    private java.lang.String idEjeTematico;
    private java.lang.String idGenero;
    private java.lang.Integer idInstructorSuplente;
    private java.lang.Integer idInstructorTitular;
    private java.lang.Integer idNivelCurso;
    private java.lang.String idNivelPto;
    private java.lang.String idProveedor;
    private java.lang.String idPuestoNom;
    private java.lang.String idSede;
    private java.lang.String idSituacionCurso;
    private java.lang.Integer idSituacionParticipante;
    private java.lang.Integer idSituacionProveedor;
    private java.lang.String idSubprograma;
    private java.lang.String idTipoCapacidad;
    private java.lang.String idTipoCurso;
    private java.lang.String idUnidad;
    private java.lang.Integer participanteAsistencia;
    private java.lang.Float participanteCalificacionFin;
    private java.lang.Float participanteCalificacionIni;
    private java.lang.String participanteCategoriaRusp;
    private java.lang.String participanteCerEvaCalif1;
    private java.lang.String participanteCerEvaCalif2;
    private java.util.Date participanteCerEvaFecha1;
    private java.util.Date participanteCerEvaFecha2;
    private java.lang.String participanteClasifRusp;
    private java.lang.String participanteCurp;
    private java.lang.Integer participanteDg;
    private java.lang.String participanteEmail;
    private java.lang.String participanteIdRusp;
    private java.lang.String participanteNombre;
    private java.util.Date participanteNotificacion;
    private java.lang.String participanteObservaciones;
    private java.lang.String participantePrimerApellido;
    private java.lang.String participantePtoRusp;
    private java.lang.String participanteSegundoApellido;
    private java.lang.Integer participanteUrRepoOm;
    private java.lang.String rfcEmpleado;
    private java.lang.String rfcOperDgrh;
    private java.lang.Integer idMotivoDesasignaPartic;

    /**
     * Constructor for TnCapBitacoraCurso class.
     */
    public TnCapBitacoraCur() {
    }

    /**
     * Constructor for TnCapBitacoraCurso class.
     *
     * @param idCapMovto int
     * @param fecModifico java.util.Date
     * @param idCapBitacoraCurso long
     * @param usuario java.lang.String
     * @param cicloEjeTematico java.lang.Integer
     * @param cursoClave java.lang.String
     * @param cursoClaveCertificacion java.lang.String
     * @param cursoDuracion java.lang.Float
     * @param cursoFecFin java.util.Date
     * @param cursoFecIni java.util.Date
     * @param cursoMinimoParticipantes java.lang.Integer
     * @param cursoParticipantes java.lang.Integer
     * @param cursoPresupuesto java.lang.Double
     * @param cursoSupervisorInst java.lang.String
     * @param idAula java.lang.String
     * @param idContratoCurso java.lang.Integer
     * @param idControlCurso java.lang.String
     * @param idCoordinacion java.lang.String
     * @param idCurso java.lang.Integer
     * @param idCursoPrincipal java.lang.String
     * @param idEjeTematico java.lang.String
     * @param idGenero java.lang.String
     * @param idInstructorSuplente java.lang.Integer
     * @param idInstructorTitular java.lang.Integer
     * @param idMotivoDesasignaPartic java.lang.Integer
     * @param idNivelCurso java.lang.Integer
     * @param idNivelPto java.lang.String
     * @param idProveedor java.lang.String
     * @param idPuestoNom java.lang.String
     * @param idSede java.lang.String
     * @param idSituacionCurso java.lang.String
     * @param idSituacionParticipante java.lang.Integer
     * @param idSituacionProveedor java.lang.Integer
     * @param idSubprograma java.lang.String
     * @param idTipoCapacidad java.lang.String
     * @param idTipoCurso java.lang.String
     * @param idUnidad java.lang.String
     * @param participanteAsistencia java.lang.Integer
     * @param participanteCalificacionFin java.lang.Float
     * @param participanteCalificacionIni java.lang.Float
     * @param participanteCategoriaRusp java.lang.String
     * @param participanteCerEvaCalif1 java.lang.String
     * @param participanteCerEvaCalif2 java.lang.String
     * @param participanteCerEvaFecha1 java.util.Date
     * @param participanteCerEvaFecha2 java.util.Date
     * @param participanteClasifRusp java.lang.String
     * @param participanteCurp java.lang.String
     * @param participanteDg java.lang.Integer
     * @param participanteEmail java.lang.String
     * @param participanteIdRusp java.lang.String
     * @param participanteNombre java.lang.String
     * @param participanteNotificacion java.util.Date
     * @param participanteObservaciones java.lang.String
     * @param participantePrimerApellido java.lang.String
     * @param participantePtoRusp java.lang.String
     * @param participanteSegundoApellido java.lang.String
     * @param participanteUrRepoOm java.lang.Integer
     * @param rfcEmpleado java.lang.String
     * @param rfcOperDgrh java.lang.String
     */
    public TnCapBitacoraCur(int idCapMovto, java.util.Date fecModifico, long idCapBitacoraCurso, 
                            java.lang.String usuario, java.lang.Integer cicloEjeTematico, java.lang.String cursoClave, 
                            java.lang.String cursoClaveCertificacion, java.lang.Float cursoDuracion, 
                            java.util.Date cursoFecFin, java.util.Date cursoFecIni, 
                            java.lang.Integer cursoMinimoParticipantes, java.lang.Integer cursoParticipantes, 
                            java.lang.Double cursoPresupuesto, java.lang.String cursoSupervisorInst, 
                            java.lang.String idAula, java.lang.Integer idContratoCurso, 
                            java.lang.String idControlCurso, java.lang.String idCoordinacion, 
                            java.lang.Integer idCurso, java.lang.String idCursoPrincipal, 
                            java.lang.String idEjeTematico, java.lang.String idGenero, 
                            java.lang.Integer idInstructorSuplente, java.lang.Integer idInstructorTitular, 
                            java.lang.Integer idMotivoDesasignaPartic, java.lang.Integer idNivelCurso, 
                            java.lang.String idNivelPto, java.lang.String idProveedor, java.lang.String idPuestoNom, 
                            java.lang.String idSede, java.lang.String idSituacionCurso, 
                            java.lang.Integer idSituacionParticipante, java.lang.Integer idSituacionProveedor, 
                            java.lang.String idSubprograma, java.lang.String idTipoCapacidad, 
                            java.lang.String idTipoCurso, java.lang.String idUnidad, 
                            java.lang.Integer participanteAsistencia, java.lang.Float participanteCalificacionFin, 
                            java.lang.Float participanteCalificacionIni, java.lang.String participanteCategoriaRusp, 
                            java.lang.String participanteCerEvaCalif1, java.lang.String participanteCerEvaCalif2, 
                            java.util.Date participanteCerEvaFecha1, java.util.Date participanteCerEvaFecha2, 
                            java.lang.String participanteClasifRusp, java.lang.String participanteCurp, 
                            java.lang.Integer participanteDg, java.lang.String participanteEmail, 
                            java.lang.String participanteIdRusp, java.lang.String participanteNombre, 
                            java.util.Date participanteNotificacion, java.lang.String participanteObservaciones, 
                            java.lang.String participantePrimerApellido, java.lang.String participantePtoRusp, 
                            java.lang.String participanteSegundoApellido, java.lang.Integer participanteUrRepoOm, 
                            java.lang.String rfcEmpleado, java.lang.String rfcOperDgrh) {
        this.idCapMovto = idCapMovto;
        this.fecModifico = fecModifico;
        this.idCapBitacoraCurso = idCapBitacoraCurso;
        this.usuario = usuario;
        this.cicloEjeTematico = cicloEjeTematico;
        this.cursoClave = cursoClave;
        this.cursoClaveCertificacion = cursoClaveCertificacion;
        this.cursoDuracion = cursoDuracion;
        this.cursoFecFin = cursoFecFin;
        this.cursoFecIni = cursoFecIni;
        this.cursoMinimoParticipantes = cursoMinimoParticipantes;
        this.cursoParticipantes = cursoParticipantes;
        this.cursoPresupuesto = cursoPresupuesto;
        this.cursoSupervisorInst = cursoSupervisorInst;
        this.idAula = idAula;
        this.idContratoCurso = idContratoCurso;
        this.idControlCurso = idControlCurso;
        this.idCoordinacion = idCoordinacion;
        this.idCurso = idCurso;
        this.idCursoPrincipal = idCursoPrincipal;
        this.idEjeTematico = idEjeTematico;
        this.idGenero = idGenero;
        this.idInstructorSuplente = idInstructorSuplente;
        this.idInstructorTitular = idInstructorTitular;
        this.idMotivoDesasignaPartic = idMotivoDesasignaPartic;
        this.idNivelCurso = idNivelCurso;
        this.idNivelPto = idNivelPto;
        this.idProveedor = idProveedor;
        this.idPuestoNom = idPuestoNom;
        this.idSede = idSede;
        this.idSituacionCurso = idSituacionCurso;
        this.idSituacionParticipante = idSituacionParticipante;
        this.idSituacionProveedor = idSituacionProveedor;
        this.idSubprograma = idSubprograma;
        this.idTipoCapacidad = idTipoCapacidad;
        this.idTipoCurso = idTipoCurso;
        this.idUnidad = idUnidad;
        this.participanteAsistencia = participanteAsistencia;
        this.participanteCalificacionFin = participanteCalificacionFin;
        this.participanteCalificacionIni = participanteCalificacionIni;
        this.participanteCategoriaRusp = participanteCategoriaRusp;
        this.participanteCerEvaCalif1 = participanteCerEvaCalif1;
        this.participanteCerEvaCalif2 = participanteCerEvaCalif2;
        this.participanteCerEvaFecha1 = participanteCerEvaFecha1;
        this.participanteCerEvaFecha2 = participanteCerEvaFecha2;
        this.participanteClasifRusp = participanteClasifRusp;
        this.participanteCurp = participanteCurp;
        this.participanteDg = participanteDg;
        this.participanteEmail = participanteEmail;
        this.participanteIdRusp = participanteIdRusp;
        this.participanteNombre = participanteNombre;
        this.participanteNotificacion = participanteNotificacion;
        this.participanteObservaciones = participanteObservaciones;
        this.participantePrimerApellido = participantePrimerApellido;
        this.participantePtoRusp = participantePtoRusp;
        this.participanteSegundoApellido = participanteSegundoApellido;
        this.participanteUrRepoOm = participanteUrRepoOm;
        this.rfcEmpleado = rfcEmpleado;
        this.rfcOperDgrh = rfcOperDgrh;
    }

    /**
     * Get idCapMovto value.
     *
     * @return int
     */
    public int getIdCapMovto() {
        return this.idCapMovto;
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
     * Get idCapBitacoraCurso value.
     *
     * @return long
     */
    public long getIdCapBitacoraCurso() {
        return this.idCapBitacoraCurso;
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
     * Get cicloEjeTematico value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getCicloEjeTematico() {
        return this.cicloEjeTematico;
    }

    /**
     * Get cursoClave value.
     *
     * @return java.lang.String
     */
    public java.lang.String getCursoClave() {
        return this.cursoClave;
    }

    /**
     * Get cursoClaveCertificacion value.
     *
     * @return java.lang.String
     */
    public java.lang.String getCursoClaveCertificacion() {
        return this.cursoClaveCertificacion;
    }

    /**
     * Get cursoDuracion value.
     *
     * @return java.lang.Float
     */
    public java.lang.Float getCursoDuracion() {
        return this.cursoDuracion;
    }

    /**
     * Get cursoFecFin value.
     *
     * @return java.util.Date
     */
    public java.util.Date getCursoFecFin() {
        return this.cursoFecFin;
    }

    /**
     * Get cursoFecIni value.
     *
     * @return java.util.Date
     */
    public java.util.Date getCursoFecIni() {
        return this.cursoFecIni;
    }

    /**
     * Get cursoMinimoParticipantes value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getCursoMinimoParticipantes() {
        return this.cursoMinimoParticipantes;
    }

    /**
     * Get cursoParticipantes value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getCursoParticipantes() {
        return this.cursoParticipantes;
    }

    /**
     * Get cursoPresupuesto value.
     *
     * @return java.lang.Double
     */
    public java.lang.Double getCursoPresupuesto() {
        return this.cursoPresupuesto;
    }

    /**
     * Get cursoSupervisorInst value.
     *
     * @return java.lang.String
     */
    public java.lang.String getCursoSupervisorInst() {
        return this.cursoSupervisorInst;
    }

    /**
     * Get idAula value.
     *
     * @return java.lang.String
     */
    public java.lang.String getIdAula() {
        return this.idAula;
    }

    /**
     * Get idContratoCurso value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getIdContratoCurso() {
        return this.idContratoCurso;
    }

    /**
     * Get idControlCurso value.
     *
     * @return java.lang.String
     */
    public java.lang.String getIdControlCurso() {
        return this.idControlCurso;
    }

    /**
     * Get idCoordinacion value.
     *
     * @return java.lang.String
     */
    public java.lang.String getIdCoordinacion() {
        return this.idCoordinacion;
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
     * Get idCursoPrincipal value.
     *
     * @return java.lang.String
     */
    public java.lang.String getIdCursoPrincipal() {
        return this.idCursoPrincipal;
    }

    /**
     * Get idEjeTematico value.
     *
     * @return java.lang.String
     */
    public java.lang.String getIdEjeTematico() {
        return this.idEjeTematico;
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
     * Get idInstructorSuplente value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getIdInstructorSuplente() {
        return this.idInstructorSuplente;
    }

    /**
     * Get idInstructorTitular value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getIdInstructorTitular() {
        return this.idInstructorTitular;
    }

    /**
     * Get idNivelCurso value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getIdNivelCurso() {
        return this.idNivelCurso;
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
     * Get idProveedor value.
     *
     * @return java.lang.String
     */
    public java.lang.String getIdProveedor() {
        return this.idProveedor;
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
     * Get idSede value.
     *
     * @return java.lang.String
     */
    public java.lang.String getIdSede() {
        return this.idSede;
    }

    /**
     * Get idSituacionCurso value.
     *
     * @return java.lang.String
     */
    public java.lang.String getIdSituacionCurso() {
        return this.idSituacionCurso;
    }

    /**
     * Get idSituacionParticipante value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getIdSituacionParticipante() {
        return this.idSituacionParticipante;
    }

    /**
     * Get idSituacionProveedor value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getIdSituacionProveedor() {
        return this.idSituacionProveedor;
    }

    /**
     * Get idSubprograma value.
     *
     * @return java.lang.String
     */
    public java.lang.String getIdSubprograma() {
        return this.idSubprograma;
    }

    /**
     * Get idTipoCapacidad value.
     *
     * @return java.lang.String
     */
    public java.lang.String getIdTipoCapacidad() {
        return this.idTipoCapacidad;
    }

    /**
     * Get idTipoCurso value.
     *
     * @return java.lang.String
     */
    public java.lang.String getIdTipoCurso() {
        return this.idTipoCurso;
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
     * @return java.lang.Integer
     */
    public java.lang.Integer getParticipanteAsistencia() {
        return this.participanteAsistencia;
    }

    /**
     * Get participanteCalificacionFin value.
     *
     * @return java.lang.Float
     */
    public java.lang.Float getParticipanteCalificacionFin() {
        return this.participanteCalificacionFin;
    }

    /**
     * Get participanteCalificacionIni value.
     *
     * @return java.lang.Float
     */
    public java.lang.Float getParticipanteCalificacionIni() {
        return this.participanteCalificacionIni;
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
     * Get participanteCurp value.
     *
     * @return java.lang.String
     */
    public java.lang.String getParticipanteCurp() {
        return this.participanteCurp;
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
     * Get rfcEmpleado value.
     *
     * @return java.lang.String
     */
    public java.lang.String getRfcEmpleado() {
        return this.rfcEmpleado;
    }

    /**
     * Get rfcOperDgrh value.
     *
     * @return java.lang.String
     */
    public java.lang.String getRfcOperDgrh() {
        return this.rfcOperDgrh;
    }


    /**
     * Set idCapMovto value.
     *
     * @param idCapMovto int
     */
    public void setIdCapMovto(int idCapMovto) {
        this.idCapMovto = idCapMovto;
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
     * Set idCapBitacoraCurso value.
     *
     * @param idCapBitacoraCurso long
     */
    public void setIdCapBitacoraCurso(long idCapBitacoraCurso) {
        this.idCapBitacoraCurso = idCapBitacoraCurso;
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
     * Set cicloEjeTematico value.
     *
     * @param cicloEjeTematico java.lang.Integer
     */
    public void setCicloEjeTematico(java.lang.Integer cicloEjeTematico) {
        this.cicloEjeTematico = cicloEjeTematico;
    }

    /**
     * Set cursoClave value.
     *
     * @param cursoClave java.lang.String
     */
    public void setCursoClave(java.lang.String cursoClave) {
        this.cursoClave = cursoClave;
    }

    /**
     * Set cursoClaveCertificacion value.
     *
     * @param cursoClaveCertificacion java.lang.String
     */
    public void setCursoClaveCertificacion(java.lang.String cursoClaveCertificacion) {
        this.cursoClaveCertificacion = cursoClaveCertificacion;
    }

    /**
     * Set cursoDuracion value.
     *
     * @param cursoDuracion java.lang.Float
     */
    public void setCursoDuracion(java.lang.Float cursoDuracion) {
        this.cursoDuracion = cursoDuracion;
    }

    /**
     * Set cursoFecFin value.
     *
     * @param cursoFecFin java.util.Date
     */
    public void setCursoFecFin(java.util.Date cursoFecFin) {
        this.cursoFecFin = cursoFecFin;
    }

    /**
     * Set cursoFecIni value.
     *
     * @param cursoFecIni java.util.Date
     */
    public void setCursoFecIni(java.util.Date cursoFecIni) {
        this.cursoFecIni = cursoFecIni;
    }

    /**
     * Set cursoMinimoParticipantes value.
     *
     * @param cursoMinimoParticipantes java.lang.Integer
     */
    public void setCursoMinimoParticipantes(java.lang.Integer cursoMinimoParticipantes) {
        this.cursoMinimoParticipantes = cursoMinimoParticipantes;
    }

    /**
     * Set cursoParticipantes value.
     *
     * @param cursoParticipantes java.lang.Integer
     */
    public void setCursoParticipantes(java.lang.Integer cursoParticipantes) {
        this.cursoParticipantes = cursoParticipantes;
    }

    /**
     * Set cursoPresupuesto value.
     *
     * @param cursoPresupuesto java.lang.Double
     */
    public void setCursoPresupuesto(java.lang.Double cursoPresupuesto) {
        this.cursoPresupuesto = cursoPresupuesto;
    }

    /**
     * Set cursoSupervisorInst value.
     *
     * @param cursoSupervisorInst java.lang.String
     */
    public void setCursoSupervisorInst(java.lang.String cursoSupervisorInst) {
        this.cursoSupervisorInst = cursoSupervisorInst;
    }

    /**
     * Set idAula value.
     *
     * @param idAula java.lang.String
     */
    public void setIdAula(java.lang.String idAula) {
        this.idAula = idAula;
    }

    /**
     * Set idContratoCurso value.
     *
     * @param idContratoCurso java.lang.Integer
     */
    public void setIdContratoCurso(java.lang.Integer idContratoCurso) {
        this.idContratoCurso = idContratoCurso;
    }

    /**
     * Set idControlCurso value.
     *
     * @param idControlCurso java.lang.String
     */
    public void setIdControlCurso(java.lang.String idControlCurso) {
        this.idControlCurso = idControlCurso;
    }

    /**
     * Set idCoordinacion value.
     *
     * @param idCoordinacion java.lang.String
     */
    public void setIdCoordinacion(java.lang.String idCoordinacion) {
        this.idCoordinacion = idCoordinacion;
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
     * Set idCursoPrincipal value.
     *
     * @param idCursoPrincipal java.lang.String
     */
    public void setIdCursoPrincipal(java.lang.String idCursoPrincipal) {
        this.idCursoPrincipal = idCursoPrincipal;
    }

    /**
     * Set idEjeTematico value.
     *
     * @param idEjeTematico java.lang.String
     */
    public void setIdEjeTematico(java.lang.String idEjeTematico) {
        this.idEjeTematico = idEjeTematico;
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
     * Set idInstructorSuplente value.
     *
     * @param idInstructorSuplente java.lang.Integer
     */
    public void setIdInstructorSuplente(java.lang.Integer idInstructorSuplente) {
        this.idInstructorSuplente = idInstructorSuplente;
    }

    /**
     * Set idInstructorTitular value.
     *
     * @param idInstructorTitular java.lang.Integer
     */
    public void setIdInstructorTitular(java.lang.Integer idInstructorTitular) {
        this.idInstructorTitular = idInstructorTitular;
    }

    /**
     * Get idMotivoDesasignaPartic value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getIdMotivoDesasignaPartic() {
        return this.idMotivoDesasignaPartic;
    }

    /**
     * Set idMotivoDesasignaPartic value.
     *
     * @param idMotivoDesasignaPartic java.lang.Integer
     */
    public void setIdMotivoDesasignaPartic(java.lang.Integer idMotivoDesasignaPartic) {
        this.idMotivoDesasignaPartic = idMotivoDesasignaPartic;
    }

    /**
     * Set idNivelCurso value.
     *
     * @param idNivelCurso java.lang.Integer
     */
    public void setIdNivelCurso(java.lang.Integer idNivelCurso) {
        this.idNivelCurso = idNivelCurso;
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
     * Set idProveedor value.
     *
     * @param idProveedor java.lang.String
     */
    public void setIdProveedor(java.lang.String idProveedor) {
        this.idProveedor = idProveedor;
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
     * Set idSede value.
     *
     * @param idSede java.lang.String
     */
    public void setIdSede(java.lang.String idSede) {
        this.idSede = idSede;
    }

    /**
     * Set idSituacionCurso value.
     *
     * @param idSituacionCurso java.lang.String
     */
    public void setIdSituacionCurso(java.lang.String idSituacionCurso) {
        this.idSituacionCurso = idSituacionCurso;
    }

    /**
     * Set idSituacionParticipante value.
     *
     * @param idSituacionParticipante java.lang.Integer
     */
    public void setIdSituacionParticipante(java.lang.Integer idSituacionParticipante) {
        this.idSituacionParticipante = idSituacionParticipante;
    }

    /**
     * Set idSituacionProveedor value.
     *
     * @param idSituacionProveedor java.lang.Integer
     */
    public void setIdSituacionProveedor(java.lang.Integer idSituacionProveedor) {
        this.idSituacionProveedor = idSituacionProveedor;
    }

    /**
     * Set idSubprograma value.
     *
     * @param idSubprograma java.lang.String
     */
    public void setIdSubprograma(java.lang.String idSubprograma) {
        this.idSubprograma = idSubprograma;
    }

    /**
     * Set idTipoCapacidad value.
     *
     * @param idTipoCapacidad java.lang.String
     */
    public void setIdTipoCapacidad(java.lang.String idTipoCapacidad) {
        this.idTipoCapacidad = idTipoCapacidad;
    }

    /**
     * Set idTipoCurso value.
     *
     * @param idTipoCurso java.lang.String
     */
    public void setIdTipoCurso(java.lang.String idTipoCurso) {
        this.idTipoCurso = idTipoCurso;
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
     * @param participanteAsistencia java.lang.Integer
     */
    public void setParticipanteAsistencia(java.lang.Integer participanteAsistencia) {
        this.participanteAsistencia = participanteAsistencia;
    }

    /**
     * Set participanteCalificacionFin value.
     *
     * @param participanteCalificacionFin java.lang.Float
     */
    public void setParticipanteCalificacionFin(java.lang.Float participanteCalificacionFin) {
        this.participanteCalificacionFin = participanteCalificacionFin;
    }

    /**
     * Set participanteCalificacionIni value.
     *
     * @param participanteCalificacionIni java.lang.Float
     */
    public void setParticipanteCalificacionIni(java.lang.Float participanteCalificacionIni) {
        this.participanteCalificacionIni = participanteCalificacionIni;
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
     * Set participanteCurp value.
     *
     * @param participanteCurp java.lang.String
     */
    public void setParticipanteCurp(java.lang.String participanteCurp) {
        this.participanteCurp = participanteCurp;
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
     * Set rfcEmpleado value.
     *
     * @param rfcEmpleado java.lang.String
     */
    public void setRfcEmpleado(java.lang.String rfcEmpleado) {
        this.rfcEmpleado = rfcEmpleado;
    }

    /**
     * Set rfcOperDgrh value.
     *
     * @param rfcOperDgrh java.lang.String
     */
    public void setRfcOperDgrh(java.lang.String rfcOperDgrh) {
        this.rfcOperDgrh = rfcOperDgrh;
    }


    /**
     * Set identity value.
     *
     * @param idCapBitacoraCurso Serializable
     */
    public void setIdentity(Serializable idCapBitacoraCurso) {
        this.idCapBitacoraCurso = (java.lang.Long)idCapBitacoraCurso;
    }

    /**
     * Get identity value.
     *
     * @return Serializable
     */
    public Serializable getIdentity() {
        return this.idCapBitacoraCurso;
    }
}
