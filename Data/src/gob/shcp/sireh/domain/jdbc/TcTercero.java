package gob.shcp.sireh.domain.jdbc;

import gob.shcp.fsn.data.Domain;
import gob.shcp.fsn.data.annotation.PrimaryKey;

import java.io.Serializable;

/**
 * Domain object for persistent TcTercero data.
 */
public class TcTercero implements Domain, Serializable {
    @PrimaryKey
    private java.lang.String idTercero;
    private java.lang.String descTercero;
    private java.util.Date fecModifico;
    private java.lang.String usuario;

    /**
     * Constructor for TcTercero class.
     */
    public TcTercero() {
    }

    /**
     * Constructor for TcTercero class.
     *
     * @param idTercero java.lang.String
     * @param descTercero java.lang.String
     * @param fecModifico java.util.Date
     * @param usuario java.lang.String
     */
    public TcTercero(java.lang.String idTercero, java.lang.String descTercero, 
                     java.util.Date fecModifico, java.lang.String usuario) {
        this.idTercero = idTercero;
        this.descTercero = descTercero;
        this.fecModifico = fecModifico;
        this.usuario = usuario;
    }

    /**
     * Get idTercero value.
     *
     * @return java.lang.String
     */
    public java.lang.String getIdTercero() {
        return this.idTercero;
    }

    /**
     * Get descTercero value.
     *
     * @return java.lang.String
     */
    public java.lang.String getDescTercero() {
        return this.descTercero;
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
     * Set idTercero value.
     *
     * @param idTercero java.lang.String
     */
    public void setIdTercero(java.lang.String idTercero) {
        this.idTercero = idTercero;
    }

    /**
     * Set descTercero value.
     *
     * @param descTercero java.lang.String
     */
    public void setDescTercero(java.lang.String descTercero) {
        this.descTercero = descTercero;
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
     * @param idTercero Serializable
     */
    public void setIdentity(Serializable idTercero) {
        this.idTercero = (java.lang.String)idTercero;
    }

    /**
     * Get identity value.
     *
     * @return Serializable
     */
    public Serializable getIdentity() {
        return this.idTercero;
    }
}
