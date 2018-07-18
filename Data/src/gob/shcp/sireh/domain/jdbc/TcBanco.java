package gob.shcp.sireh.domain.jdbc;

import gob.shcp.fsn.data.Domain;

import gob.shcp.fsn.data.annotation.PrimaryKey;

import java.io.Serializable;

/**
 * Domain object for persistent TcBanco data.
 */
public class TcBanco implements Domain, Serializable {
    @PrimaryKey
    private java.lang.String idBanco;
    private java.util.Date fecModifico;
    private java.lang.String usuario;
    private java.lang.String descBancos;
    private java.lang.String idReceptor;

    /**
     * Constructor for TcBanco class.
     */
    public TcBanco() {
    }

    /**
     * Constructor for TcBanco class.
     *
     * @param idBanco java.lang.String
     * @param fecModifico java.util.Date
     * @param usuario java.lang.String
     * @param descBancos java.lang.String
     * @param idReceptor java.lang.String
     */
    public TcBanco(java.lang.String idBanco, java.util.Date fecModifico, 
                   java.lang.String usuario, java.lang.String descBancos, 
                   java.lang.String idReceptor) {
        this.idBanco = idBanco;
        this.fecModifico = fecModifico;
        this.usuario = usuario;
        this.descBancos = descBancos;
        this.idReceptor = idReceptor;
    }

    /**
     * Get idBanco value.
     *
     * @return java.lang.String
     */
    public java.lang.String getIdBanco() {
        return this.idBanco;
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
     * Get descBancos value.
     *
     * @return java.lang.String
     */
    public java.lang.String getDescBancos() {
        return this.descBancos;
    }

    /**
     * Get idReceptor value.
     *
     * @return java.lang.String
     */
    public java.lang.String getIdReceptor() {
        return this.idReceptor;
    }

    /**
     * Set idBanco value.
     *
     * @param idBanco java.lang.String
     */
    public void setIdBanco(java.lang.String idBanco) {
        this.idBanco = idBanco;
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
     * Set descBancos value.
     *
     * @param descBancos java.lang.String
     */
    public void setDescBancos(java.lang.String descBancos) {
        this.descBancos = descBancos;
    }

    /**
     * Set idReceptor value.
     *
     * @param idReceptor java.lang.String
     */
    public void setIdReceptor(java.lang.String idReceptor) {
        this.idReceptor = idReceptor;
    }


    /**
     * Set identity value.
     *
     * @param idBanco Serializable
     */
    public void setIdentity(Serializable idBanco) {
        this.idBanco = (java.lang.String)idBanco;
    }

    /**
     * Get identity value.
     *
     * @return Serializable
     */
    public Serializable getIdentity() {
        return this.idBanco;
    }
}
