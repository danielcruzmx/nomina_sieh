package gob.shcp.sireh.domain.jdbc;

import gob.shcp.fsn.data.Domain;
import gob.shcp.fsn.data.annotation.PrimaryKey;

import java.io.Serializable;

/**
 * Domain object for persistent TcGrupoPago data.
 */
public class TcGrupoPago implements Domain, Serializable {

    @PrimaryKey
    private java.lang.String idGrupoPago;
    private java.lang.String descGrupoPago;
    private java.util.Date fecModifico;
    private java.lang.String usuario;

    /**
     * Constructor for TcGrupoPago class.
     */
    public TcGrupoPago() {
    }

    /**
     * Constructor for TcGrupoPago class.
     *
     * @param idGrupoPago java.lang.String
     * @param descGrupoPago java.lang.String
     * @param fecModifico java.util.Date
     * @param usuario java.lang.String
     */
    public TcGrupoPago(java.lang.String idGrupoPago, 
                       java.lang.String descGrupoPago, 
                       java.util.Date fecModifico, java.lang.String usuario) {
        this.idGrupoPago = idGrupoPago;
        this.descGrupoPago = descGrupoPago;
        this.fecModifico = fecModifico;
        this.usuario = usuario;
    }

    /**
     * Get idGrupoPago value.
     *
     * @return java.lang.String
     */
    public java.lang.String getIdGrupoPago() {
        return this.idGrupoPago;
    }

    /**
     * Get descGrupoPago value.
     *
     * @return java.lang.String
     */
    public java.lang.String getDescGrupoPago() {
        return this.descGrupoPago;
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
     * Set idGrupoPago value.
     *
     * @param idGrupoPago java.lang.String
     */
    public void setIdGrupoPago(java.lang.String idGrupoPago) {
        this.idGrupoPago = idGrupoPago;
    }

    /**
     * Set descGrupoPago value.
     *
     * @param descGrupoPago java.lang.String
     */
    public void setDescGrupoPago(java.lang.String descGrupoPago) {
        this.descGrupoPago = descGrupoPago;
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
     * @param idGrupoPago Serializable
     */
    public void setIdentity(Serializable idGrupoPago) {
        this.idGrupoPago = (java.lang.String)idGrupoPago;
    }

    /**
     * Get identity value.
     *
     * @return Serializable
     */
    public Serializable getIdentity() {
        return this.idGrupoPago;
    }
}
