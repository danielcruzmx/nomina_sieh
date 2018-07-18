package gob.shcp.sireh.model.spc;

import gob.shcp.fsn.model.Model;

import org.springmodules.validation.bean.conf.loader.annotation.handler.NotNull;
import org.springmodules.validation.bean.conf.loader.annotation.handler.NotBlank;
import org.springmodules.validation.bean.conf.loader.annotation.handler.MaxLength;

/**
 * Model object for transporting TnCapBitacoraCurso data.
 */
public class TnCapBitacoraCurDTO implements java.io.Serializable, Model {

    @NotNull
    private int idCapMovto;
    @NotNull
    private java.util.Date fecModifico;
    @NotNull
    private long idCapBitacoraCurso;
    @NotBlank(errorCode = "not.null")
    @NotNull
    @MaxLength(80)
    private java.lang.String usuario;
    private java.lang.Integer cicloEjeTematico;
    @MaxLength(60)
    private java.lang.String cursoClave;
    @MaxLength(240)
    private java.lang.String cursoClaveCertificacion;
    @MaxLength(600)
    private java.lang.Float cursoDuracion;
    private java.util.Date cursoFecFin;
    private java.util.Date cursoFecIni;
    @MaxLength(600)
    private java.lang.String cursoHorarioObser;
    private java.lang.Integer cursoMinimoParticipantes;
    private java.lang.Integer cursoParticipantes;
    private java.lang.Double cursoPresupuesto;
    @MaxLength(80)
    private java.lang.String cursoSupervisorInst;
    @MaxLength(40)
    private java.lang.String idAula;
    private java.lang.Integer idContratoCurso;
    @MaxLength(12)
    private java.lang.String idControlCurso;
    @MaxLength(12)
    private java.lang.String idCoordinacion;
    private java.lang.Integer idCurso;
    @MaxLength(80)
    private java.lang.String idCursoPrincipal;
    @MaxLength(16)
    private java.lang.String idEjeTematico;
    @MaxLength(4)
    private java.lang.String idGenero;
    @MaxLength(12)
    private java.lang.String idHorarioCurso;
    private java.lang.Integer idInstructorSuplente;
    private java.lang.Integer idInstructorTitular;
    private java.lang.Integer idMotivoDesasigna;
    private java.lang.Integer idNivelCurso;
    @MaxLength(16)
    private java.lang.String idNivelPto;
    @MaxLength(24)
    private java.lang.String idProveedor;
    @MaxLength(28)
    private java.lang.String idPuestoNom;
    @MaxLength(16)
    private java.lang.String idSede;
    @MaxLength(12)
    private java.lang.String idSituacionCurso;
    private java.lang.Integer idSituacionParticipante;
    private java.lang.Integer idSituacionProveedor;
    @MaxLength(8)
    private java.lang.String idSubprograma;
    @MaxLength(16)
    private java.lang.String idTipoCapacidad;
    @MaxLength(12)
    private java.lang.String idTipoCurso;
    @MaxLength(12)
    private java.lang.String idUnidad;
    private java.lang.Integer participanteAsistencia;
    private java.lang.Float participanteCalificacionFin;
    private java.lang.Float participanteCalificacionIni;
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
    @MaxLength(72)
    private java.lang.String participanteCurp;
    private java.lang.Integer participanteDg;
    @MaxLength(400)
    private java.lang.String participanteEmail;
    @MaxLength(44)
    private java.lang.String participanteIdRusp;
    @MaxLength(160)
    private java.lang.String participanteNombre;
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
    @MaxLength(52)
    private java.lang.String rfcEmpleado;
    @MaxLength(52)
    private java.lang.String rfcOperDgrh;

    /**
     * Constructor for TnCapBitacoraCursoDTO class.
     */
    public TnCapBitacoraCurDTO() {
    }

    /**
     * Constructor for TnCapBitacoraCursoDTO class.
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
     * @param cursoHorarioObser java.lang.String
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
     * @param idHorarioCurso java.lang.String
     * @param idInstructorSuplente java.lang.Integer
     * @param idInstructorTitular java.lang.Integer
     * @param idMotivoDesasigna java.lang.Integer
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
    public TnCapBitacoraCurDTO(int idCapMovto, java.util.Date fecModifico, long idCapBitacoraCurso, 
                                 java.lang.String usuario, java.lang.Integer cicloEjeTematico, 
                                 java.lang.String cursoClave, java.lang.String cursoClaveCertificacion, 
                                 java.lang.Float cursoDuracion, java.util.Date cursoFecFin, 
                                 java.util.Date cursoFecIni, java.lang.String cursoHorarioObser, 
                                 java.lang.Integer cursoMinimoParticipantes, java.lang.Integer cursoParticipantes, 
                                 java.lang.Double cursoPresupuesto, java.lang.String cursoSupervisorInst, 
                                 java.lang.String idAula, java.lang.Integer idContratoCurso, 
                                 java.lang.String idControlCurso, java.lang.String idCoordinacion, 
                                 java.lang.Integer idCurso, java.lang.String idCursoPrincipal, 
                                 java.lang.String idEjeTematico, java.lang.String idGenero, 
                                 java.lang.String idHorarioCurso, java.lang.Integer idInstructorSuplente, 
                                 java.lang.Integer idInstructorTitular, java.lang.Integer idMotivoDesasigna, 
                                 java.lang.Integer idNivelCurso, java.lang.String idNivelPto, 
                                 java.lang.String idProveedor, java.lang.String idPuestoNom, java.lang.String idSede, 
                                 java.lang.String idSituacionCurso, java.lang.Integer idSituacionParticipante, 
                                 java.lang.Integer idSituacionProveedor, java.lang.String idSubprograma, 
                                 java.lang.String idTipoCapacidad, java.lang.String idTipoCurso, 
                                 java.lang.String idUnidad, java.lang.Integer participanteAsistencia, 
                                 java.lang.Float participanteCalificacionFin, 
                                 java.lang.Float participanteCalificacionIni, 
                                 java.lang.String participanteCategoriaRusp, java.lang.String participanteCerEvaCalif1, 
                                 java.lang.String participanteCerEvaCalif2, java.util.Date participanteCerEvaFecha1, 
                                 java.util.Date participanteCerEvaFecha2, java.lang.String participanteClasifRusp, 
                                 java.lang.String participanteCurp, java.lang.Integer participanteDg, 
                                 java.lang.String participanteEmail, java.lang.String participanteIdRusp, 
                                 java.lang.String participanteNombre, java.util.Date participanteNotificacion, 
                                 java.lang.String participanteObservaciones, 
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
        this.cursoHorarioObser = cursoHorarioObser;
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
        this.idHorarioCurso = idHorarioCurso;
        this.idInstructorSuplente = idInstructorSuplente;
        this.idInstructorTitular = idInstructorTitular;
        this.idMotivoDesasigna = idMotivoDesasigna;
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
     * Set idCapMovto value.
     *
     * @param idCapMovto int
     */
    public void setIdCapMovto(int idCapMovto) {
        this.idCapMovto = idCapMovto;
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
     * Set idCapBitacoraCurso value.
     *
     * @param idCapBitacoraCurso long
     */
    public void setIdCapBitacoraCurso(long idCapBitacoraCurso) {
        this.idCapBitacoraCurso = idCapBitacoraCurso;
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
     * Set cicloEjeTematico value.
     *
     * @param cicloEjeTematico java.lang.Integer
     */
    public void setCicloEjeTematico(java.lang.Integer cicloEjeTematico) {
        this.cicloEjeTematico = cicloEjeTematico;
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
     * Set cursoClave value.
     *
     * @param cursoClave java.lang.String
     */
    public void setCursoClave(java.lang.String cursoClave) {
        this.cursoClave = cursoClave;
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
     * Set cursoClaveCertificacion value.
     *
     * @param cursoClaveCertificacion java.lang.String
     */
    public void setCursoClaveCertificacion(java.lang.String cursoClaveCertificacion) {
        this.cursoClaveCertificacion = cursoClaveCertificacion;
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
     * Set cursoDuracion value.
     *
     * @param cursoDuracion java.lang.Float
     */
    public void setCursoDuracion(java.lang.Float cursoDuracion) {
        this.cursoDuracion = cursoDuracion;
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
     * Set cursoFecFin value.
     *
     * @param cursoFecFin java.util.Date
     */
    public void setCursoFecFin(java.util.Date cursoFecFin) {
        this.cursoFecFin = cursoFecFin;
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
     * Set cursoFecIni value.
     *
     * @param cursoFecIni java.util.Date
     */
    public void setCursoFecIni(java.util.Date cursoFecIni) {
        this.cursoFecIni = cursoFecIni;
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
     * Set cursoHorarioObser value.
     *
     * @param cursoHorarioObser java.lang.String
     */
    public void setCursoHorarioObser(java.lang.String cursoHorarioObser) {
        this.cursoHorarioObser = cursoHorarioObser;
    }

    /**
     * Get cursoHorarioObser value.
     *
     * @return java.lang.String
     */
    public java.lang.String getCursoHorarioObser() {
        return this.cursoHorarioObser;
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
     * Get cursoMinimoParticipantes value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getCursoMinimoParticipantes() {
        return this.cursoMinimoParticipantes;
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
     * Get cursoParticipantes value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getCursoParticipantes() {
        return this.cursoParticipantes;
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
     * Get cursoPresupuesto value.
     *
     * @return java.lang.Double
     */
    public java.lang.Double getCursoPresupuesto() {
        return this.cursoPresupuesto;
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
     * Get cursoSupervisorInst value.
     *
     * @return java.lang.String
     */
    public java.lang.String getCursoSupervisorInst() {
        return this.cursoSupervisorInst;
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
     * Get idAula value.
     *
     * @return java.lang.String
     */
    public java.lang.String getIdAula() {
        return this.idAula;
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
     * Get idContratoCurso value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getIdContratoCurso() {
        return this.idContratoCurso;
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
     * Get idControlCurso value.
     *
     * @return java.lang.String
     */
    public java.lang.String getIdControlCurso() {
        return this.idControlCurso;
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
     * Get idCoordinacion value.
     *
     * @return java.lang.String
     */
    public java.lang.String getIdCoordinacion() {
        return this.idCoordinacion;
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
     * Set idCursoPrincipal value.
     *
     * @param idCursoPrincipal java.lang.String
     */
    public void setIdCursoPrincipal(java.lang.String idCursoPrincipal) {
        this.idCursoPrincipal = idCursoPrincipal;
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
     * Set idEjeTematico value.
     *
     * @param idEjeTematico java.lang.String
     */
    public void setIdEjeTematico(java.lang.String idEjeTematico) {
        this.idEjeTematico = idEjeTematico;
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
     * Set idHorarioCurso value.
     *
     * @param idHorarioCurso java.lang.String
     */
    public void setIdHorarioCurso(java.lang.String idHorarioCurso) {
        this.idHorarioCurso = idHorarioCurso;
    }

    /**
     * Get idHorarioCurso value.
     *
     * @return java.lang.String
     */
    public java.lang.String getIdHorarioCurso() {
        return this.idHorarioCurso;
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
     * Get idInstructorSuplente value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getIdInstructorSuplente() {
        return this.idInstructorSuplente;
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
     * Get idInstructorTitular value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getIdInstructorTitular() {
        return this.idInstructorTitular;
    }

    /**
     * Set idMotivoDesasigna value.
     *
     * @param idMotivoDesasigna java.lang.Integer
     */
    public void setIdMotivoDesasigna(java.lang.Integer idMotivoDesasigna) {
        this.idMotivoDesasigna = idMotivoDesasigna;
    }

    /**
     * Get idMotivoDesasigna value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getIdMotivoDesasigna() {
        return this.idMotivoDesasigna;
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
     * Get idNivelCurso value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getIdNivelCurso() {
        return this.idNivelCurso;
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
     * Set idProveedor value.
     *
     * @param idProveedor java.lang.String
     */
    public void setIdProveedor(java.lang.String idProveedor) {
        this.idProveedor = idProveedor;
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
     * Set idSede value.
     *
     * @param idSede java.lang.String
     */
    public void setIdSede(java.lang.String idSede) {
        this.idSede = idSede;
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
     * Set idSituacionCurso value.
     *
     * @param idSituacionCurso java.lang.String
     */
    public void setIdSituacionCurso(java.lang.String idSituacionCurso) {
        this.idSituacionCurso = idSituacionCurso;
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
     * Set idSituacionParticipante value.
     *
     * @param idSituacionParticipante java.lang.Integer
     */
    public void setIdSituacionParticipante(java.lang.Integer idSituacionParticipante) {
        this.idSituacionParticipante = idSituacionParticipante;
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
     * Set idSituacionProveedor value.
     *
     * @param idSituacionProveedor java.lang.Integer
     */
    public void setIdSituacionProveedor(java.lang.Integer idSituacionProveedor) {
        this.idSituacionProveedor = idSituacionProveedor;
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
     * Set idSubprograma value.
     *
     * @param idSubprograma java.lang.String
     */
    public void setIdSubprograma(java.lang.String idSubprograma) {
        this.idSubprograma = idSubprograma;
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
     * Set idTipoCapacidad value.
     *
     * @param idTipoCapacidad java.lang.String
     */
    public void setIdTipoCapacidad(java.lang.String idTipoCapacidad) {
        this.idTipoCapacidad = idTipoCapacidad;
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
     * Set idTipoCurso value.
     *
     * @param idTipoCurso java.lang.String
     */
    public void setIdTipoCurso(java.lang.String idTipoCurso) {
        this.idTipoCurso = idTipoCurso;
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
     * @param participanteAsistencia java.lang.Integer
     */
    public void setParticipanteAsistencia(java.lang.Integer participanteAsistencia) {
        this.participanteAsistencia = participanteAsistencia;
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
     * Set participanteCalificacionFin value.
     *
     * @param participanteCalificacionFin java.lang.Float
     */
    public void setParticipanteCalificacionFin(java.lang.Float participanteCalificacionFin) {
        this.participanteCalificacionFin = participanteCalificacionFin;
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
     * Set participanteCalificacionIni value.
     *
     * @param participanteCalificacionIni java.lang.Float
     */
    public void setParticipanteCalificacionIni(java.lang.Float participanteCalificacionIni) {
        this.participanteCalificacionIni = participanteCalificacionIni;
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
     * Set rfcOperDgrh value.
     *
     * @param rfcOperDgrh java.lang.String
     */
    public void setRfcOperDgrh(java.lang.String rfcOperDgrh) {
        this.rfcOperDgrh = rfcOperDgrh;
    }

    /**
     * Get rfcOperDgrh value.
     *
     * @return java.lang.String
     */
    public java.lang.String getRfcOperDgrh() {
        return this.rfcOperDgrh;
    }
}
