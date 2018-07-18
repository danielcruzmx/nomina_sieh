package gob.shcp.sireh.domain.jdbc;

import gob.shcp.fsn.data.Domain;
import gob.shcp.fsn.data.annotation.PrimaryKey;

import java.io.Serializable;

/**
 * Domain object for persistent TcVacancia data.
 */
public class TcVacancia implements Domain, Serializable {
    @PrimaryKey
    private java.lang.Integer idVacancia;
    private java.lang.String descVacancia;
    private java.util.Date fecModifico;
    private java.lang.String usuario;

    /**
     * Constructor for TcVacancia class.
     */
    public TcVacancia() {
    }

    /**
     * Constructor for TcVacancia class.
     *
     * @param idVacancia java.lang.Integer
     * @param descVacancia java.lang.String
     * @param fecModifico java.util.Date
     * @param usuario java.lang.String
     */
    public TcVacancia(java.lang.Integer idVacancia, 
                      java.lang.String descVacancia, 
                      java.util.Date fecModifico, java.lang.String usuario) {
        this.idVacancia = idVacancia;
        this.descVacancia = descVacancia;
        this.fecModifico = fecModifico;
        this.usuario = usuario;
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
     * @param idVacancia Serializable
     */
    public void setIdentity(Serializable idVacancia) {
        this.idVacancia = (java.lang.Integer)idVacancia;
    }

    /**
     * Get identity value.
     *
     * @return Serializable
     */
    public Serializable getIdentity() {
        return this.idVacancia;
    }

    public void setIdVacancia(Integer idVacancia) {
        this.idVacancia = idVacancia;
    }

    public Integer getIdVacancia() {
        return idVacancia;
    }

    public void setDescVacancia(String descVacancia) {
        this.descVacancia = descVacancia;
    }

    public String getDescVacancia() {
        return descVacancia;
    }
}
