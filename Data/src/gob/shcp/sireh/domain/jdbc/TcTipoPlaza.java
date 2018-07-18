package gob.shcp.sireh.domain.jdbc;

import gob.shcp.fsn.data.Domain;

import gob.shcp.fsn.data.annotation.PrimaryKey;

import java.io.Serializable;

/**
 * Domain object for persistent TcTipoPlaza data.
 */
public class TcTipoPlaza implements Domain, Serializable {
    @PrimaryKey
    private java.lang.String idTipoPlaza;
    private java.util.Date fecModifico;
    private java.lang.String usuario;
    private java.lang.String descTipoPlaza;

    /**
     * Constructor for TcTipoPlaza class.
     */
    public TcTipoPlaza() {
    }

    /**
     * Constructor for TcTipoPlaza class.
     *
     * @param idTipoPlaza java.lang.String
     * @param fecModifico java.util.Date
     * @param usuario java.lang.String
     * @param descTipoPlaza java.lang.String
     */
    public TcTipoPlaza(java.lang.String idTipoPlaza, 
                       java.util.Date fecModifico, java.lang.String usuario, 
                       java.lang.String descTipoPlaza) {
        this.idTipoPlaza = idTipoPlaza;
        this.fecModifico = fecModifico;
        this.usuario = usuario;
        this.descTipoPlaza = descTipoPlaza;
    }

    /**
     * Get idTipoPlaza value.
     *
     * @return java.lang.String
     */
    public java.lang.String getIdTipoPlaza() {
        return this.idTipoPlaza;
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
     * Get descTipoPlaza value.
     *
     * @return java.lang.String
     */
    public java.lang.String getDescTipoPlaza() {
        return this.descTipoPlaza;
    }

    /**
     * Set idTipoPlaza value.
     *
     * @param idTipoPlaza java.lang.String
     */
    public void setIdTipoPlaza(java.lang.String idTipoPlaza) {
        this.idTipoPlaza = idTipoPlaza;
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
     * Set descTipoPlaza value.
     *
     * @param descTipoPlaza java.lang.String
     */
    public void setDescTipoPlaza(java.lang.String descTipoPlaza) {
        this.descTipoPlaza = descTipoPlaza;
    }

    /**
     * Set identity value.
     *
     * @param idTipoPlaza Serializable
     */
    public void setIdentity(Serializable idTipoPlaza) {
        this.idTipoPlaza = (java.lang.String)idTipoPlaza;
    }

    /**
     * Get identity value.
     *
     * @return Serializable
     */
    public Serializable getIdentity() {
        return this.idTipoPlaza;
    }
}
