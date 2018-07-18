package gob.shcp.sireh.domain.jdbc.spc;

import gob.shcp.fsn.data.Domain;
import gob.shcp.fsn.data.annotation.PrimaryKey;

import java.io.Serializable;

/**
 * Domain object for persistent TcCapMotivoDesasignaInstr data.
 */
public class TcCapMotivoDesasignaInstr implements Domain, Serializable {
    @PrimaryKey
    private java.lang.Integer idMotivoDesasignaInstr;
    private java.lang.String descMotivoDesasignaInstr;
    private java.util.Date fecModifico;
    private java.lang.String idStatus;
    private java.lang.String usuario;

    /**
     * Constructor for TcCapMotivoDesasignaInstr class.
     */
    public TcCapMotivoDesasignaInstr() {
    }

    /**
     * Constructor for TcCapMotivoDesasignaInstr class.
     *
     * @param idMotivoDesasignaInstr java.lang.Integer
     * @param descMotivoDesasignaInstr java.lang.String
     * @param fecModifico java.util.Date
     * @param idStatus java.lang.String
     * @param usuario java.lang.String
     */
    public TcCapMotivoDesasignaInstr(java.lang.Integer idMotivoDesasignaInstr, 
                                     java.lang.String descMotivoDesasignaInstr, java.util.Date fecModifico, 
                                     java.lang.String idStatus, java.lang.String usuario) {
        this.idMotivoDesasignaInstr = idMotivoDesasignaInstr;
        this.descMotivoDesasignaInstr = descMotivoDesasignaInstr;
        this.fecModifico = fecModifico;
        this.idStatus = idStatus;
        this.usuario = usuario;
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
     * Get descMotivoDesasignaInstr value.
     *
     * @return java.lang.String
     */
    public java.lang.String getDescMotivoDesasignaInstr() {
        return this.descMotivoDesasignaInstr;
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
     * Get idStatus value.
     *
     * @return java.lang.String
     */
    public java.lang.String getIdStatus() {
        return this.idStatus;
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
     * Set idMotivoDesasignaInstr value.
     *
     * @param idMotivoDesasignaInstr java.lang.Integer
     */
    public void setIdMotivoDesasignaInstr(java.lang.Integer idMotivoDesasignaInstr) {
        this.idMotivoDesasignaInstr = idMotivoDesasignaInstr;
    }

    /**
     * Set descMotivoDesasignaInstr value.
     *
     * @param descMotivoDesasignaInstr java.lang.String
     */
    public void setDescMotivoDesasignaInstr(java.lang.String descMotivoDesasignaInstr) {
        this.descMotivoDesasignaInstr = descMotivoDesasignaInstr;
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
     * Set idStatus value.
     *
     * @param idStatus java.lang.String
     */
    public void setIdStatus(java.lang.String idStatus) {
        this.idStatus = idStatus;
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
     * Set identity value.
     *
     * @param idMotivoDesasignaInstr Serializable
     */
    public void setIdentity(Serializable idMotivoDesasignaInstr) {
        this.idMotivoDesasignaInstr = (java.lang.Integer)idMotivoDesasignaInstr;
    }

    /**
     * Get identity value.
     *
     * @return Serializable
     */
    public Serializable getIdentity() {
        return this.idMotivoDesasignaInstr;
    }
}
