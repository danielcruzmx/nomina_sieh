package gob.shcp.sireh.domain.jdbc;

import gob.shcp.fsn.data.Domain;

import java.io.Serializable;

/**
 * Domain object for persistent TcNombramiento data.
 */
public class TcNombramiento implements Domain, Serializable {
    private java.lang.String idNombramiento;
    private java.util.Date fecModifico;
    private java.lang.String usuario;
    private java.lang.String descNombramiento;

    /**
     * Constructor for TcNombramiento class.
     */
    public TcNombramiento() {
    }

    /**
     * Constructor for TcNombramiento class.
     *
     * @param idNombramiento java.lang.String
     * @param fecModifico java.util.Date
     * @param usuario java.lang.String
     * @param descNombramiento java.lang.String
     */
    public TcNombramiento(java.lang.String idNombramiento, 
                          java.util.Date fecModifico, java.lang.String usuario, 
                          java.lang.String descNombramiento) {
        this.idNombramiento = idNombramiento;
        this.fecModifico = fecModifico;
        this.usuario = usuario;
        this.descNombramiento = descNombramiento;
    }

    /**
     * Get idNombramiento value.
     *
     * @return java.lang.String
     */
    public java.lang.String getIdNombramiento() {
        return this.idNombramiento;
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
     * Get descNombramiento value.
     *
     * @return java.lang.String
     */
    public java.lang.String getDescNombramiento() {
        return this.descNombramiento;
    }

    /**
     * Set idNombramiento value.
     *
     * @param idNombramiento java.lang.String
     */
    public void setIdNombramiento(java.lang.String idNombramiento) {
        this.idNombramiento = idNombramiento;
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
     * Set descNombramiento value.
     *
     * @param descNombramiento java.lang.String
     */
    public void setDescNombramiento(java.lang.String descNombramiento) {
        this.descNombramiento = descNombramiento;
    }

    /**
     * Set identity value.
     *
     * @param idNombramiento Serializable
     */
    public void setIdentity(Serializable idNombramiento) {
        this.idNombramiento = (java.lang.String)idNombramiento;
    }

    /**
     * Get identity value.
     *
     * @return Serializable
     */
    public Serializable getIdentity() {
        return this.idNombramiento;
    }
}
