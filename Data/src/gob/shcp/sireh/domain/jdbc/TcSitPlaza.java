package gob.shcp.sireh.domain.jdbc;

import gob.shcp.fsn.data.Domain;
import gob.shcp.fsn.data.annotation.PrimaryKey;

import java.io.Serializable;

/**
 * Domain object for persistent TcSitPlaza data.
 */
public class TcSitPlaza implements Domain, Serializable {
    @PrimaryKey
    private java.lang.String idSitPlaza;
    private java.lang.String descSitPlaza;
    private java.util.Date fecModifico;
    private java.lang.String usuario;

    /**
     * Constructor for TcSitPlaza class.
     */
    public TcSitPlaza() {
    }

    /**
     * Constructor for TcSitPlaza class.
     *
     * @param idSitPlaza java.lang.String
     * @param descSitPlaza java.lang.String
     * @param fecModifico java.util.Date
     * @param usuario java.lang.String
     */
    public TcSitPlaza(java.lang.String idSitPlaza, 
                      java.lang.String descSitPlaza, 
                      java.util.Date fecModifico, java.lang.String usuario) {
        this.idSitPlaza = idSitPlaza;
        this.descSitPlaza = descSitPlaza;
        this.fecModifico = fecModifico;
        this.usuario = usuario;
    }

    /**
     * Get idSitPlaza value.
     *
     * @return java.lang.String
     */
    public java.lang.String getIdSitPlaza() {
        return this.idSitPlaza;
    }

    /**
     * Get descSitPlaza value.
     *
     * @return java.lang.String
     */
    public java.lang.String getDescSitPlaza() {
        return this.descSitPlaza;
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
     * Set idSitPlaza value.
     *
     * @param idSitPlaza java.lang.String
     */
    public void setIdSitPlaza(java.lang.String idSitPlaza) {
        this.idSitPlaza = idSitPlaza;
    }

    /**
     * Set descSitPlaza value.
     *
     * @param descSitPlaza java.lang.String
     */
    public void setDescSitPlaza(java.lang.String descSitPlaza) {
        this.descSitPlaza = descSitPlaza;
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
     * Set identity value.
     *
     * @param idSitPlaza Serializable
     */
    public void setIdentity(Serializable idSitPlaza) {
        this.idSitPlaza = (java.lang.String)idSitPlaza;
    }

    /**
     * Get identity value.
     *
     * @return Serializable
     */
    public Serializable getIdentity() {
        return this.idSitPlaza;
    }
}
