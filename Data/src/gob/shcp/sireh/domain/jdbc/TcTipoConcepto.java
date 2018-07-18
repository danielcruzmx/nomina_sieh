package gob.shcp.sireh.domain.jdbc;

import gob.shcp.fsn.data.Domain;

import java.io.Serializable;

/**
 * Domain object for persistent TcTipoConcepto data.
 */
public class TcTipoConcepto implements Domain, Serializable {
    private java.lang.String idTipoConcepto;
    private java.lang.String descTipoConcepto;
    private java.util.Date fecModifico;
    private java.lang.String usuario;

    /**
     * Constructor for TcTipoConcepto class.
     */
    public TcTipoConcepto() {
    }

    /**
     * Constructor for TcTipoConcepto class.
     *
     * @param idTipoConcepto java.lang.String
     * @param descTipoConcepto java.lang.String
     * @param fecModifico java.util.Date
     * @param usuario java.lang.String
     */
    public TcTipoConcepto(java.lang.String idTipoConcepto, 
                          java.lang.String descTipoConcepto, 
                          java.util.Date fecModifico, 
                          java.lang.String usuario) {
        this.idTipoConcepto = idTipoConcepto;
        this.descTipoConcepto = descTipoConcepto;
        this.fecModifico = fecModifico;
        this.usuario = usuario;
    }

    /**
     * Get idTipoConcepto value.
     *
     * @return java.lang.String
     */
    public java.lang.String getIdTipoConcepto() {
        return this.idTipoConcepto;
    }

    /**
     * Get descTipoConcepto value.
     *
     * @return java.lang.String
     */
    public java.lang.String getDescTipoConcepto() {
        return this.descTipoConcepto;
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
     * Set idTipoConcepto value.
     *
     * @param idTipoConcepto java.lang.String
     */
    public void setIdTipoConcepto(java.lang.String idTipoConcepto) {
        this.idTipoConcepto = idTipoConcepto;
    }

    /**
     * Set descTipoConcepto value.
     *
     * @param descTipoConcepto java.lang.String
     */
    public void setDescTipoConcepto(java.lang.String descTipoConcepto) {
        this.descTipoConcepto = descTipoConcepto;
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
     * @param idTipoConcepto Serializable
     */
    public void setIdentity(Serializable idTipoConcepto) {
        this.idTipoConcepto = (java.lang.String)idTipoConcepto;
    }

    /**
     * Get identity value.
     *
     * @return Serializable
     */
    public Serializable getIdentity() {
        return this.idTipoConcepto;
    }
}
