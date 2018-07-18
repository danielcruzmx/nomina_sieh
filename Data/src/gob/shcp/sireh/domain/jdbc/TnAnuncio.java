package gob.shcp.sireh.domain.jdbc;

import gob.shcp.fsn.data.Domain;
import gob.shcp.fsn.data.annotation.PrimaryKey;

import java.io.Serializable;

/**
 * Domain object for persistent TnAnuncio data.
 */
public class TnAnuncio implements Domain, Serializable {
    @PrimaryKey
    private java.lang.Integer idAnuncio;
    private java.util.Date fecModifico;
    private java.lang.String idStatus;
    private java.lang.String msgAnuncio;
    private java.lang.String tituloAnuncio;
    private java.lang.String usuario;

    /**
     * Constructor for TnAnuncio class.
     */
    public TnAnuncio() {
    }

    /**
     * Constructor for TnAnuncio class.
     *
     * @param idAnuncio java.lang.Integer
     * @param fecModifico java.util.Date
     * @param idStatus java.lang.String
     * @param msgAnuncio java.lang.String
     * @param tituloAnuncio java.lang.String
     * @param usuario java.lang.String
     */
    public TnAnuncio(java.lang.Integer idAnuncio, java.util.Date fecModifico, java.lang.String idStatus, 
                     java.lang.String msgAnuncio, java.lang.String tituloAnuncio, java.lang.String usuario) {
        this.idAnuncio = idAnuncio;
        this.fecModifico = fecModifico;
        this.idStatus = idStatus;
        this.msgAnuncio = msgAnuncio;
        this.tituloAnuncio = tituloAnuncio;
        this.usuario = usuario;
    }


    /**
     * Get idAnuncio value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getIdAnuncio() {
        return this.idAnuncio;
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
     * Get idStatus value.
     *
     * @return java.lang.String
     */
    public java.lang.String getIdStatus() {
        return this.idStatus;
    }

    /**
     * Get msgAnuncio value.
     *
     * @return java.lang.String
     */
    public java.lang.String getMsgAnuncio() {
        return this.msgAnuncio;
    }

    /**
     * Get tituloAnuncio value.
     *
     * @return java.lang.String
     */
    public java.lang.String getTituloAnuncio() {
        return this.tituloAnuncio;
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
     * Set idAnuncio value.
     *
     * @param idAnuncio java.lang.Integer
     */
    public void setIdAnuncio(java.lang.Integer idAnuncio) {
        this.idAnuncio = idAnuncio;
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
     * Set idStatus value.
     *
     * @param idStatus java.lang.String
     */
    public void setIdStatus(java.lang.String idStatus) {
        this.idStatus = idStatus;
    }

    /**
     * Set msgAnuncio value.
     *
     * @param msgAnuncio java.lang.String
     */
    public void setMsgAnuncio(java.lang.String msgAnuncio) {
        this.msgAnuncio = msgAnuncio;
    }

    /**
     * Set tituloAnuncio value.
     *
     * @param tituloAnuncio java.lang.String
     */
    public void setTituloAnuncio(java.lang.String tituloAnuncio) {
        this.tituloAnuncio = tituloAnuncio;
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
     * @param idAnuncio Serializable
     */
    public void setIdentity(Serializable idAnuncio) {
        this.idAnuncio = (java.lang.Integer)idAnuncio;
    }

    /**
     * Get identity value.
     *
     * @return Serializable
     */
    public Serializable getIdentity() {
        return this.idAnuncio;
    }
}
