package gob.shcp.sireh.domain.jdbc.spc;

import gob.shcp.fsn.data.Domain;
import gob.shcp.fsn.data.annotation.PrimaryKey;

import java.io.Serializable;

/**
 * Domain object for persistent TnCapCurso data.
 */
public class TnCapCurso implements Domain, Serializable {
                @PrimaryKey
                private java.lang.Integer idCurso;
                private java.lang.String idAula;
                private java.lang.Integer idContratoCurso;
                private java.lang.String idControlCurso;
                private java.lang.String idCoordinacion;
                private java.lang.Integer idNivelCurso;
                private java.lang.String idProveedor;
                private java.lang.String idSede;
                private java.lang.String idSituacionCurso;
                private java.lang.Integer idSituacionProveedor;
                private java.lang.String idSubprograma;
                private java.lang.String idTipoCapacidad;
                private java.lang.String rfcOperDgrh;
                private java.lang.Integer cicloEjeTematico;
                private java.lang.String cursoClave;
                private java.lang.Double cursoPresupuesto;
                private java.util.Date fecModifico;
                private java.lang.String idCursoPrincipal;
                private java.lang.String idEjeTematico;
                private java.lang.String idTipoCurso;
                private java.lang.String usuario;
                private java.lang.String cursoClaveCertificacion;
                private java.lang.Float cursoDuracion;
                private java.util.Date cursoFecFin;
                private java.util.Date cursoFecIni;
                private java.lang.Integer cursoMinimoParticipantes;
                private java.lang.Integer cursoParticipantes;
                private java.lang.String cursoSupervisorInst;
                private java.lang.Integer idInstructorSuplente;
                private java.lang.Integer idInstructorTitular;
    
    /**
     * Constructor for TnCapCurso class.
     */
    public TnCapCurso() { }
                                                                                                                            
    /**
     * Constructor for TnCapCurso class.
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
     * @param cursoPresupuesto java.lang.Double
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
    public TnCapCurso( java.lang.Integer idCurso, java.lang.String idAula, java.lang.Integer idContratoCurso, java.lang.String idControlCurso, java.lang.String idCoordinacion, java.lang.Integer idNivelCurso, java.lang.String idProveedor, java.lang.String idSede, java.lang.String idSituacionCurso, java.lang.Integer idSituacionProveedor, java.lang.String idSubprograma, java.lang.String idTipoCapacidad, java.lang.String rfcOperDgrh, java.lang.Integer cicloEjeTematico, java.lang.String cursoClave, java.lang.Double cursoPresupuesto, java.util.Date fecModifico, java.lang.String idCursoPrincipal, java.lang.String idEjeTematico, java.lang.String idTipoCurso, java.lang.String usuario, java.lang.String cursoClaveCertificacion, java.lang.Float cursoDuracion, java.util.Date cursoFecFin, java.util.Date cursoFecIni, java.lang.Integer cursoMinimoParticipantes, java.lang.Integer cursoParticipantes, java.lang.String cursoSupervisorInst, java.lang.Integer idInstructorSuplente, java.lang.Integer idInstructorTitular) {
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
     * Get idCurso value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getIdCurso() {
            return this.idCurso;
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
     * Get idNivelCurso value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getIdNivelCurso() {
            return this.idNivelCurso;
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
     * Get rfcOperDgrh value.
     *
     * @return java.lang.String
     */
    public java.lang.String getRfcOperDgrh() {
            return this.rfcOperDgrh;
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
     * Get cursoPresupuesto value.
     *
     * @return java.lang.Double
     */
    public java.lang.Double getCursoPresupuesto() {
            return this.cursoPresupuesto;
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
     * Get idTipoCurso value.
     *
     * @return java.lang.String
     */
    public java.lang.String getIdTipoCurso() {
            return this.idTipoCurso;
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
     * Get cursoSupervisorInst value.
     *
     * @return java.lang.String
     */
    public java.lang.String getCursoSupervisorInst() {
            return this.cursoSupervisorInst;
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
     * Set idCurso value.
     *
     * @param idCurso java.lang.Integer
     */
    public void setIdCurso(java.lang.Integer idCurso) {
            this.idCurso = idCurso;
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
     * Set idNivelCurso value.
     *
     * @param idNivelCurso java.lang.Integer
     */
    public void setIdNivelCurso(java.lang.Integer idNivelCurso) {
            this.idNivelCurso = idNivelCurso;
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
     * Set rfcOperDgrh value.
     *
     * @param rfcOperDgrh java.lang.String
     */
    public void setRfcOperDgrh(java.lang.String rfcOperDgrh) {
            this.rfcOperDgrh = rfcOperDgrh;
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
     * Set cursoPresupuesto value.
     *
     * @param cursoPresupuesto java.lang.Double
     */
    public void setCursoPresupuesto(java.lang.Double cursoPresupuesto) {
            this.cursoPresupuesto = cursoPresupuesto;
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
     * Set idTipoCurso value.
     *
     * @param idTipoCurso java.lang.String
     */
    public void setIdTipoCurso(java.lang.String idTipoCurso) {
            this.idTipoCurso = idTipoCurso;
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
     * Set cursoSupervisorInst value.
     *
     * @param cursoSupervisorInst java.lang.String
     */
    public void setCursoSupervisorInst(java.lang.String cursoSupervisorInst) {
            this.cursoSupervisorInst = cursoSupervisorInst;
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
     * Set identity value.
     *
     * @param idCurso Serializable
     */
    public void setIdentity(Serializable idCurso) {
        this.idCurso = ( java.lang.Integer ) idCurso;
    }

    /**
     * Get identity value.
     *
     * @return Serializable
     */
    public Serializable getIdentity() {
        return this.idCurso;
    }
}
