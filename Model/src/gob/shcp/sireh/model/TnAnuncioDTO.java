package gob.shcp.sireh.model;

import gob.shcp.fsn.model.Model;

import org.springmodules.validation.bean.conf.loader.annotation.handler.NotNull;
import org.springmodules.validation.bean.conf.loader.annotation.handler.NotBlank;
import org.springmodules.validation.bean.conf.loader.annotation.handler.MaxLength;

/**
 * Model object for transporting TnAnuncio data.
 */
public class TnAnuncioDTO implements java.io.Serializable, Model {

    private java.lang.Integer idAnuncio;
    @NotNull
    private java.util.Date fecModifico;
    @NotBlank(errorCode = "not.null")
    @NotNull
    @MaxLength(12)
    private java.lang.String idStatus;
    @NotBlank(errorCode = "not.null")
    @NotNull
    @MaxLength(600)
    private java.lang.String msgAnuncio;
    @NotBlank(errorCode = "not.null")
    @NotNull
    @MaxLength(80)
    private java.lang.String tituloAnuncio;
    @NotBlank(errorCode = "not.null")
    @NotNull
    @MaxLength(80)
    private java.lang.String usuario;

    /**
     * Constructor for TnAnuncioDTO class.
     */
    public TnAnuncioDTO() {
    }


    /**
     * Constructor for TnAnuncioDTO class.
     *
     * @param idAnuncio java.lang.Integer
     * @param fecModifico java.util.Date
     * @param idStatus java.lang.String
     * @param msgAnuncio java.lang.String
     * @param tituloAnuncio java.lang.String
     * @param usuario java.lang.String
     */
    public TnAnuncioDTO(java.lang.Integer idAnuncio, java.util.Date fecModifico, java.lang.String idStatus, 
                        java.lang.String msgAnuncio, java.lang.String tituloAnuncio, java.lang.String usuario) {
        this.idAnuncio = idAnuncio;
        this.fecModifico = fecModifico;
        this.idStatus = idStatus;
        this.msgAnuncio = msgAnuncio;
        this.tituloAnuncio = tituloAnuncio;
        this.usuario = usuario;
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
     * Get idAnuncio value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getIdAnuncio() {
        return this.idAnuncio;
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
     * Get fecModifico value.
     *
     * @return java.util.Date
     */
    public java.util.Date getFecModifico() {
        return this.fecModifico;
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
     * Get idStatus value.
     *
     * @return java.lang.String
     */
    public java.lang.String getIdStatus() {
        return this.idStatus;
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
     * Get msgAnuncio value.
     *
     * @return java.lang.String
     */
    public java.lang.String getMsgAnuncio() {
        return this.msgAnuncio;
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
     * Get tituloAnuncio value.
     *
     * @return java.lang.String
     */
    public java.lang.String getTituloAnuncio() {
        return this.tituloAnuncio;
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
     * Get usuario value.
     *
     * @return java.lang.String
     */
    public java.lang.String getUsuario() {
        return this.usuario;
    }
}
