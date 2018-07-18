package gob.shcp.sireh.domain.jdbc;

import gob.shcp.fsn.data.Domain;

import gob.shcp.fsn.data.annotation.PrimaryKey;

import java.io.Serializable;

/**
 * Domain object for persistent TcTipoServPub data.
 */
public class TcTipoServPub implements Domain, Serializable {
    @PrimaryKey
    private java.lang.String idServPub;
    private java.lang.String descTipoServPub;
    private java.util.Date fecModifico;
    private java.lang.String tspCveNomb;
    private java.lang.String tspNiveles;
    private java.lang.String tspTipoPlaza;
    private java.lang.String usuario;

    /**
     * Constructor for TcTipoServPub class.
     */
    public TcTipoServPub() {
    }

    /**
     * Constructor for TcTipoServPub class.
     *
     * @param idServPub java.lang.String
     * @param descTipoServPub java.lang.String
     * @param fecModifico java.util.Date
     * @param tspCveNomb java.lang.String
     * @param tspNiveles java.lang.String
     * @param tspTipoPlaza java.lang.String
     * @param usuario java.lang.String
     */
    public TcTipoServPub(java.lang.String idServPub, 
                         java.lang.String descTipoServPub, 
                         java.util.Date fecModifico, 
                         java.lang.String tspCveNomb, 
                         java.lang.String tspNiveles, 
                         java.lang.String tspTipoPlaza, 
                         java.lang.String usuario) {
        this.idServPub = idServPub;
        this.descTipoServPub = descTipoServPub;
        this.fecModifico = fecModifico;
        this.tspCveNomb = tspCveNomb;
        this.tspNiveles = tspNiveles;
        this.tspTipoPlaza = tspTipoPlaza;
        this.usuario = usuario;
    }

    /**
     * Get idServPub value.
     *
     * @return java.lang.String
     */
    public java.lang.String getIdServPub() {
        return this.idServPub;
    }

    /**
     * Get descTipoServPub value.
     *
     * @return java.lang.String
     */
    public java.lang.String getDescTipoServPub() {
        return this.descTipoServPub;
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
     * Get tspCveNomb value.
     *
     * @return java.lang.String
     */
    public java.lang.String getTspCveNomb() {
        return this.tspCveNomb;
    }

    /**
     * Get tspNiveles value.
     *
     * @return java.lang.String
     */
    public java.lang.String getTspNiveles() {
        return this.tspNiveles;
    }

    /**
     * Get tspTipoPlaza value.
     *
     * @return java.lang.String
     */
    public java.lang.String getTspTipoPlaza() {
        return this.tspTipoPlaza;
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
     * Set idServPub value.
     *
     * @param idServPub java.lang.String
     */
    public void setIdServPub(java.lang.String idServPub) {
        this.idServPub = idServPub;
    }

    /**
     * Set descTipoServPub value.
     *
     * @param descTipoServPub java.lang.String
     */
    public void setDescTipoServPub(java.lang.String descTipoServPub) {
        this.descTipoServPub = descTipoServPub;
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
     * Set tspCveNomb value.
     *
     * @param tspCveNomb java.lang.String
     */
    public void setTspCveNomb(java.lang.String tspCveNomb) {
        this.tspCveNomb = tspCveNomb;
    }

    /**
     * Set tspNiveles value.
     *
     * @param tspNiveles java.lang.String
     */
    public void setTspNiveles(java.lang.String tspNiveles) {
        this.tspNiveles = tspNiveles;
    }

    /**
     * Set tspTipoPlaza value.
     *
     * @param tspTipoPlaza java.lang.String
     */
    public void setTspTipoPlaza(java.lang.String tspTipoPlaza) {
        this.tspTipoPlaza = tspTipoPlaza;
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
     * @param idServPub Serializable
     */
    public void setIdentity(Serializable idServPub) {
        this.idServPub = (java.lang.String)idServPub;
    }

    /**
     * Get identity value.
     *
     * @return Serializable
     */
    public Serializable getIdentity() {
        return this.idServPub;
    }
}
