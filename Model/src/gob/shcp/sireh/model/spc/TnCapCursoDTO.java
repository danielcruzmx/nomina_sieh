package gob.shcp.sireh.model.spc;

import gob.shcp.fsn.model.Model;

import org.springmodules.validation.bean.conf.loader.annotation.handler.NotNull;
import org.springmodules.validation.bean.conf.loader.annotation.handler.NotBlank;
import org.springmodules.validation.bean.conf.loader.annotation.handler.MaxLength;

/**
 * Model object for transporting TnCapCurso data.
 */
public class TnCapCursoDTO  implements java.io.Serializable, Model {    

    private java.lang.Integer idCurso;
    @MaxLength(40)    
    private java.lang.String idAula;
    private java.lang.Integer idContratoCurso;
    @NotBlank(errorCode="not.null")
    @NotNull
    @MaxLength(12)    
    private java.lang.String idControlCurso;
    @NotBlank(errorCode="not.null")
    @NotNull
    @MaxLength(12)    
    private java.lang.String idCoordinacion;
    @NotNull
    private java.lang.Integer idNivelCurso;
    @NotBlank(errorCode="not.null")
    @NotNull
    @MaxLength(28)    
    private java.lang.String idProveedor;
    @MaxLength(16)    
    private java.lang.String idSede;
    @MaxLength(12)    
    private java.lang.String idSituacionCurso;
    @NotNull
    private java.lang.Integer idSituacionProveedor;
    @NotBlank(errorCode="not.null")
    @NotNull
    @MaxLength(8)    
    private java.lang.String idSubprograma;
    @MaxLength(16)    
    private java.lang.String idTipoCapacidad;
    @NotBlank(errorCode="not.null")
    @NotNull
    @MaxLength(52)    
    private java.lang.String rfcOperDgrh;
    @NotNull
    private java.lang.Integer cicloEjeTematico;
    @NotBlank(errorCode="not.null")
    @NotNull
    @MaxLength(60)    
    private java.lang.String cursoClave;
    @NotNull
    private double cursoPresupuesto;
    @NotNull
    private java.util.Date fecModifico;
    @NotBlank(errorCode="not.null")
    @NotNull
    @MaxLength(80)    
    private java.lang.String idCursoPrincipal;
    @NotBlank(errorCode="not.null")
    @NotNull
    @MaxLength(16)    
    private java.lang.String idEjeTematico;
    @NotBlank(errorCode="not.null")
    @NotNull
    @MaxLength(12)    
    private java.lang.String idTipoCurso;
    @NotBlank(errorCode="not.null")
    @NotNull
    @MaxLength(120)    
    private java.lang.String usuario;
    @MaxLength(240)    
    private java.lang.String cursoClaveCertificacion;
    @MaxLength(6)    
    private java.lang.Float cursoDuracion;
    private java.util.Date cursoFecFin;
    private java.util.Date cursoFecIni;
    private java.lang.Integer cursoMinimoParticipantes;
    private java.lang.Integer cursoParticipantes;
    @MaxLength(80)    
    private java.lang.String cursoSupervisorInst;
    private java.lang.Integer idInstructorSuplente;
    private java.lang.Integer idInstructorTitular;

    /**
     * Constructor for TnCapCursoDTO class.
     */
    public TnCapCursoDTO() { }    

                                                                                                                            
    /**
     * Constructor for TnCapCursoDTO class.
     *
     * @param idCurso java.lang.Integer
     * @param idAula java.lang.String
     * @param idContratoCurso java.lang.Integer
     * @param idControlCurso java.lang.String
     * @param idCoordinacion java.lang.String
     * @param idNivelCurso java.lang.Integer
     * @param idProveedor java.lang.String
     * @param idSede java.lang.String
     * @param idSituacionCurso java.lang.String
     * @param idSituacionProveedor java.lang.Integer
     * @param idSubprograma java.lang.String
     * @param idTipoCapacidad java.lang.String
     * @param rfcOperDgrh java.lang.String
     * @param cicloEjeTematico java.lang.Integer
     * @param cursoClave java.lang.String
     * @param cursoPresupuesto double
     * @param fecModifico java.util.Date
     * @param idCursoPrincipal java.lang.String
     * @param idEjeTematico java.lang.String
     * @param idTipoCurso java.lang.String
     * @param usuario java.lang.String
     * @param cursoClaveCertificacion java.lang.String
     * @param cursoDuracion java.lang.Float
     * @param cursoFecFin java.util.Date
     * @param cursoFecIni java.util.Date
     * @param cursoMinimoParticipantes java.lang.Integer
     * @param cursoParticipantes java.lang.Integer
     * @param cursoSupervisorInst java.lang.String
     * @param idInstructorSuplente java.lang.Integer
     * @param idInstructorTitular java.lang.Integer
     */
    public TnCapCursoDTO( java.lang.Integer idCurso, java.lang.String idAula, java.lang.Integer idContratoCurso, java.lang.String idControlCurso, java.lang.String idCoordinacion, java.lang.Integer idNivelCurso, java.lang.String idProveedor, java.lang.String idSede, java.lang.String idSituacionCurso, java.lang.Integer idSituacionProveedor, java.lang.String idSubprograma, java.lang.String idTipoCapacidad, java.lang.String rfcOperDgrh, java.lang.Integer cicloEjeTematico, java.lang.String cursoClave, double cursoPresupuesto, java.util.Date fecModifico, java.lang.String idCursoPrincipal, java.lang.String idEjeTematico, java.lang.String idTipoCurso, java.lang.String usuario, java.lang.String cursoClaveCertificacion, java.lang.Float cursoDuracion, java.util.Date cursoFecFin, java.util.Date cursoFecIni, java.lang.Integer cursoMinimoParticipantes, java.lang.Integer cursoParticipantes, java.lang.String cursoSupervisorInst, java.lang.Integer idInstructorSuplente, java.lang.Integer idInstructorTitular){    
        this.idCurso = idCurso;
        this.idAula = idAula;
        this.idContratoCurso = idContratoCurso;
        this.idControlCurso = idControlCurso;
        this.idCoordinacion = idCoordinacion;
        this.idNivelCurso = idNivelCurso;
        this.idProveedor = idProveedor;
        this.idSede = idSede;
        this.idSituacionCurso = idSituacionCurso;
        this.idSituacionProveedor = idSituacionProveedor;
        this.idSubprograma = idSubprograma;
        this.idTipoCapacidad = idTipoCapacidad;
        this.rfcOperDgrh = rfcOperDgrh;
        this.cicloEjeTematico = cicloEjeTematico;
        this.cursoClave = cursoClave;
        this.cursoPresupuesto = cursoPresupuesto;
        this.fecModifico = fecModifico;
        this.idCursoPrincipal = idCursoPrincipal;
        this.idEjeTematico = idEjeTematico;
        this.idTipoCurso = idTipoCurso;
        this.usuario = usuario;
        this.cursoClaveCertificacion = cursoClaveCertificacion;
        this.cursoDuracion = cursoDuracion;
        this.cursoFecFin = cursoFecFin;
        this.cursoFecIni = cursoFecIni;
        this.cursoMinimoParticipantes = cursoMinimoParticipantes;
        this.cursoParticipantes = cursoParticipantes;
        this.cursoSupervisorInst = cursoSupervisorInst;
        this.idInstructorSuplente = idInstructorSuplente;
        this.idInstructorTitular = idInstructorTitular;
    }    

    
    /**
     * Set idCurso value.
     *
     * @param idCurso java.lang.Integer
     */
    public void setIdCurso(java.lang.Integer idCurso){
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
     * Set idAula value.
     *
     * @param idAula java.lang.String
     */
    public void setIdAula(java.lang.String idAula){
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
    public void setIdContratoCurso(java.lang.Integer idContratoCurso){
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
    public void setIdControlCurso(java.lang.String idControlCurso){
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
    public void setIdCoordinacion(java.lang.String idCoordinacion){
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
     * Set idNivelCurso value.
     *
     * @param idNivelCurso java.lang.Integer
     */
    public void setIdNivelCurso(java.lang.Integer idNivelCurso){
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
     * Set idProveedor value.
     *
     * @param idProveedor java.lang.String
     */
    public void setIdProveedor(java.lang.String idProveedor){
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
     * Set idSede value.
     *
     * @param idSede java.lang.String
     */
    public void setIdSede(java.lang.String idSede){
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
    public void setIdSituacionCurso(java.lang.String idSituacionCurso){
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
     * Set idSituacionProveedor value.
     *
     * @param idSituacionProveedor java.lang.Integer
     */
    public void setIdSituacionProveedor(java.lang.Integer idSituacionProveedor){
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
    public void setIdSubprograma(java.lang.String idSubprograma){
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
    public void setIdTipoCapacidad(java.lang.String idTipoCapacidad){
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
     * Set rfcOperDgrh value.
     *
     * @param rfcOperDgrh java.lang.String
     */
    public void setRfcOperDgrh(java.lang.String rfcOperDgrh){
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
    
    /**
     * Set cicloEjeTematico value.
     *
     * @param cicloEjeTematico java.lang.Integer
     */
    public void setCicloEjeTematico(java.lang.Integer cicloEjeTematico){
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
    public void setCursoClave(java.lang.String cursoClave){
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
     * Set cursoPresupuesto value.
     *
     * @param cursoPresupuesto double
     */
    public void setCursoPresupuesto(double cursoPresupuesto){
        this.cursoPresupuesto = cursoPresupuesto;
    }
    
    /**
     * Get cursoPresupuesto value.
     *
     * @return double
     */
    public double getCursoPresupuesto() {
        return this.cursoPresupuesto;    
    }
    
    /**
     * Set fecModifico value.
     *
     * @param fecModifico java.util.Date
     */
    public void setFecModifico(java.util.Date fecModifico){
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
     * Set idCursoPrincipal value.
     *
     * @param idCursoPrincipal java.lang.String
     */
    public void setIdCursoPrincipal(java.lang.String idCursoPrincipal){
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
    public void setIdEjeTematico(java.lang.String idEjeTematico){
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
     * Set idTipoCurso value.
     *
     * @param idTipoCurso java.lang.String
     */
    public void setIdTipoCurso(java.lang.String idTipoCurso){
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
     * Set usuario value.
     *
     * @param usuario java.lang.String
     */
    public void setUsuario(java.lang.String usuario){
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
     * Set cursoClaveCertificacion value.
     *
     * @param cursoClaveCertificacion java.lang.String
     */
    public void setCursoClaveCertificacion(java.lang.String cursoClaveCertificacion){
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
    public void setCursoDuracion(java.lang.Float cursoDuracion){
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
    public void setCursoFecFin(java.util.Date cursoFecFin){
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
    public void setCursoFecIni(java.util.Date cursoFecIni){
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
     * Set cursoMinimoParticipantes value.
     *
     * @param cursoMinimoParticipantes java.lang.Integer
     */
    public void setCursoMinimoParticipantes(java.lang.Integer cursoMinimoParticipantes){
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
    public void setCursoParticipantes(java.lang.Integer cursoParticipantes){
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
     * Set cursoSupervisorInst value.
     *
     * @param cursoSupervisorInst java.lang.String
     */
    public void setCursoSupervisorInst(java.lang.String cursoSupervisorInst){
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
     * Set idInstructorSuplente value.
     *
     * @param idInstructorSuplente java.lang.Integer
     */
    public void setIdInstructorSuplente(java.lang.Integer idInstructorSuplente){
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
    public void setIdInstructorTitular(java.lang.Integer idInstructorTitular){
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


}