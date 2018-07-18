package gob.shcp.sireh.domain.jdbc.spc;

import gob.shcp.fsn.data.Domain;
import gob.shcp.fsn.data.annotation.PrimaryKey;

import java.io.Serializable;

/**
 * Domain object for persistent TnCapBitacoraInstr data.
 */
public class TnCapBitacoraInst implements Domain, Serializable {
    @PrimaryKey
    private java.lang.Long idCapBitacInstr;
    private java.lang.Integer idMotivoDesasignaInstr;
    private java.util.Date fecModifico;
    private java.lang.String usuario;
    private java.lang.Integer idCurso;
    private java.lang.Integer idInstrSup;
    private java.lang.Integer idInstrTit;

    /**
     * Constructor for TnCapBitacoraInstr class.
     */
    public TnCapBitacoraInst() {
    }

    /**
     * Constructor for TnCapBitacoraInstr class.
     *
     * @param idCapBitacInstr java.lang.Long
     * @param idMotivoDesasignaInstr java.lang.Integer
     * @param fecModifico java.util.Date
     * @param usuario java.lang.String
     * @param idCurso java.lang.Integer
     * @param idInstrSup java.lang.Integer
     * @param idInstrTit java.lang.Integer
     */
    public TnCapBitacoraInst(java.lang.Long idCapBitacInstr, java.lang.Integer idMotivoDesasignaInstr, 
                             java.util.Date fecModifico, java.lang.String usuario, java.lang.Integer idCurso, 
                             java.lang.Integer idInstrSup, java.lang.Integer idInstrTit) {
        this.idCapBitacInstr = idCapBitacInstr;
        this.idMotivoDesasignaInstr = idMotivoDesasignaInstr;
        this.fecModifico = fecModifico;
        this.usuario = usuario;
        this.idCurso = idCurso;
        this.idInstrSup = idInstrSup;
        this.idInstrTit = idInstrTit;
    }

    /**
     * Get idCapBitacInstr value.
     *
     * @return java.lang.Long
     */
    public java.lang.Long getIdCapBitacInstr() {
        return this.idCapBitacInstr;
    }

    /**
     * Get idMotivoDesasignaInstr value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getIdMotivoDesasignaInstr() {
        return this.idMotivoDesasignaInstr;
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
     * Get usuario value.
     *
     * @return java.lang.String
     */
    public java.lang.String getUsuario() {
        return this.usuario;
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
     * Get idInstrSup value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getIdInstrSup() {
        return this.idInstrSup;
    }

    /**
     * Get idInstrTit value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getIdInstrTit() {
        return this.idInstrTit;
    }


    /**
     * Set idCapBitacInstr value.
     *
     * @param idCapBitacInstr java.lang.Long
     */
    public void setIdCapBitacInstr(java.lang.Long idCapBitacInstr) {
        this.idCapBitacInstr = idCapBitacInstr;
    }

    /**
     * Set idMotivoDesasignaInstr value.
     *
     * @param idMotivoDesasignaInstr java.lang.Integer
     */
    public void setIdMotivoDesasignaInstr(java.lang.Integer idMotivoDesasignaInstr) {
        this.idMotivoDesasignaInstr = idMotivoDesasignaInstr;
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
     * Set usuario value.
     *
     * @param usuario java.lang.String
     */
    public void setUsuario(java.lang.String usuario) {
        this.usuario = usuario;
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
     * Set idInstrSup value.
     *
     * @param idInstrSup java.lang.Integer
     */
    public void setIdInstrSup(java.lang.Integer idInstrSup) {
        this.idInstrSup = idInstrSup;
    }

    /**
     * Set idInstrTit value.
     *
     * @param idInstrTit java.lang.Integer
     */
    public void setIdInstrTit(java.lang.Integer idInstrTit) {
        this.idInstrTit = idInstrTit;
    }

    /**
     * Set identity value.
     *
     * @param idCapBitacInstr Serializable
     */
    public void setIdentity(Serializable idCapBitacInstr) {
        this.idCapBitacInstr = (java.lang.Long)idCapBitacInstr;
    }

    /**
     * Get identity value.
     *
     * @return Serializable
     */
    public Serializable getIdentity() {
        return this.idCapBitacInstr;
    }
}
