package gob.shcp.sireh.domain.jdbc;

import gob.shcp.fsn.data.Domain;

import java.io.Serializable;

/**
 * Domain object for persistent TcEstadoComprobante data.
 */
public class TcEstadoComprobante implements Domain, Serializable {

    private java.lang.Integer idEdoComprobante;
    private java.util.Date fecModifico;
    private java.lang.String usuario;
    private java.lang.String descEdoComp;

    /**
     * Constructor for TcEstadoComprobante class.
     */
    public TcEstadoComprobante() {
    }

    /**
     * Constructor for TcEstadoComprobante class.
     *
     * @param idEdoComprobante java.lang.Integer
     * @param fecModifico java.util.Date
     * @param usuario java.lang.String
     * @param descEdoComp java.lang.String
     */
    public TcEstadoComprobante(java.lang.Integer idEdoComprobante, 
                               java.util.Date fecModifico, 
                               java.lang.String usuario, 
                               java.lang.String descEdoComp) {
        this.idEdoComprobante = idEdoComprobante;
        this.fecModifico = fecModifico;
        this.usuario = usuario;
        this.descEdoComp = descEdoComp;
    }

    /**
     * Get idEdoComprobante value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getIdEdoComprobante() {
        return this.idEdoComprobante;
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
     * Get descEdoComp value.
     *
     * @return java.lang.String
     */
    public java.lang.String getDescEdoComp() {
        return this.descEdoComp;
    }

    /**
     * Set idEdoComprobante value.
     *
     * @param idEdoComprobante java.lang.Integer
     */
    public void setIdEdoComprobante(java.lang.Integer idEdoComprobante) {
        this.idEdoComprobante = idEdoComprobante;
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
     * Set descEdoComp value.
     *
     * @param descEdoComp java.lang.String
     */
    public void setDescEdoComp(java.lang.String descEdoComp) {
        this.descEdoComp = descEdoComp;
    }

    /**
     * Set identity value.
     *
     * @param idEdoComprobante Serializable
     */
    public void setIdentity(Serializable idEdoComprobante) {
        this.idEdoComprobante = (java.lang.Integer)idEdoComprobante;
    }

    /**
     * Get identity value.
     *
     * @return Serializable
     */
    public Serializable getIdentity() {
        return this.idEdoComprobante;
    }
}
