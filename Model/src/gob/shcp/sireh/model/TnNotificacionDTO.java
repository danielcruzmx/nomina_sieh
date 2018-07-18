package gob.shcp.sireh.model;

import gob.shcp.fsn.model.Model;

import org.springmodules.validation.bean.conf.loader.annotation.handler.NotNull;
import org.springmodules.validation.bean.conf.loader.annotation.handler.NotBlank;
import org.springmodules.validation.bean.conf.loader.annotation.handler.MaxLength;

/**
 * Model object for transporting TnNotificacion data.
 */
public class TnNotificacionDTO implements java.io.Serializable, Model {

    private java.lang.Integer idNotificacion;
    @NotBlank(errorCode = "not.null")
    @NotNull
    @MaxLength(12)
    private java.lang.String idSituacionNotificacion;
    @NotBlank(errorCode = "not.null")
    @NotNull
    @MaxLength(12)
    private java.lang.String idTipoNotificacion;
    @NotNull
    private java.util.Date fecModifico;
    @NotBlank(errorCode = "not.null")
    @NotNull
    @MaxLength(52)
    private java.lang.String fromRfcNotificacion;
    @NotBlank(errorCode = "not.null")
    @NotNull
    @MaxLength(2000)
    private java.lang.String msgNotificacion;
    @NotBlank(errorCode = "not.null")
    @NotNull
    @MaxLength(240)
    private java.lang.String tituloNotificacion;
    @NotBlank(errorCode = "not.null")
    @NotNull
    @MaxLength(52)
    private java.lang.String toRfcNotificacion;
    @NotBlank(errorCode = "not.null")
    @NotNull
    @MaxLength(120)
    private java.lang.String usuario;
    @MaxLength(600)
    private java.lang.String adjuntoNotificacion;
    @MaxLength(52)
    private java.lang.String ccRfcNotificacion;

    /**
     * Constructor for TnNotificacionDTO class.
     */
    public TnNotificacionDTO() {
    }


    /**
     * Constructor for TnNotificacionDTO class.
     *
     * @param idNotificacion java.lang.Integer
     * @param idSituacionNotificacion java.lang.String
     * @param idTipoNotificacion java.lang.String
     * @param fecModifico java.util.Date
     * @param fromRfcNotificacion java.lang.String
     * @param msgNotificacion java.lang.String
     * @param tituloNotificacion java.lang.String
     * @param toRfcNotificacion java.lang.String
     * @param usuario java.lang.String
     * @param adjuntoNotificacion java.lang.String
     * @param ccRfcNotificacion java.lang.String
     */
    public TnNotificacionDTO(java.lang.Integer idNotificacion, java.lang.String idSituacionNotificacion, 
                             java.lang.String idTipoNotificacion, java.util.Date fecModifico, 
                             java.lang.String fromRfcNotificacion, java.lang.String msgNotificacion, 
                             java.lang.String tituloNotificacion, java.lang.String toRfcNotificacion, 
                             java.lang.String usuario, java.lang.String adjuntoNotificacion, 
                             java.lang.String ccRfcNotificacion) {
        this.idNotificacion = idNotificacion;
        this.idSituacionNotificacion = idSituacionNotificacion;
        this.idTipoNotificacion = idTipoNotificacion;
        this.fecModifico = fecModifico;
        this.fromRfcNotificacion = fromRfcNotificacion;
        this.msgNotificacion = msgNotificacion;
        this.tituloNotificacion = tituloNotificacion;
        this.toRfcNotificacion = toRfcNotificacion;
        this.usuario = usuario;
        this.adjuntoNotificacion = adjuntoNotificacion;
        this.ccRfcNotificacion = ccRfcNotificacion;
    }
    
    /**
     * Set idNotificacion value.
     *
     * @param idNotificacion java.lang.Integer
     */
    public void setIdNotificacion(java.lang.Integer idNotificacion) {
        this.idNotificacion = idNotificacion;
    }

    /**
     * Get idNotificacion value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getIdNotificacion() {
        return this.idNotificacion;
    }

    /**
     * Set idSituacionNotificacion value.
     *
     * @param idSituacionNotificacion java.lang.String
     */
    public void setIdSituacionNotificacion(java.lang.String idSituacionNotificacion) {
        this.idSituacionNotificacion = idSituacionNotificacion;
    }

    /**
     * Get idSituacionNotificacion value.
     *
     * @return java.lang.String
     */
    public java.lang.String getIdSituacionNotificacion() {
        return this.idSituacionNotificacion;
    }

    /**
     * Set idTipoNotificacion value.
     *
     * @param idTipoNotificacion java.lang.String
     */
    public void setIdTipoNotificacion(java.lang.String idTipoNotificacion) {
        this.idTipoNotificacion = idTipoNotificacion;
    }

    /**
     * Get idTipoNotificacion value.
     *
     * @return java.lang.String
     */
    public java.lang.String getIdTipoNotificacion() {
        return this.idTipoNotificacion;
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
     * Set fromRfcNotificacion value.
     *
     * @param fromRfcNotificacion java.lang.String
     */
    public void setFromRfcNotificacion(java.lang.String fromRfcNotificacion) {
        this.fromRfcNotificacion = fromRfcNotificacion;
    }

    /**
     * Get fromRfcNotificacion value.
     *
     * @return java.lang.String
     */
    public java.lang.String getFromRfcNotificacion() {
        return this.fromRfcNotificacion;
    }

    /**
     * Set msgNotificacion value.
     *
     * @param msgNotificacion java.lang.String
     */
    public void setMsgNotificacion(java.lang.String msgNotificacion) {
        this.msgNotificacion = msgNotificacion;
    }

    /**
     * Get msgNotificacion value.
     *
     * @return java.lang.String
     */
    public java.lang.String getMsgNotificacion() {
        return this.msgNotificacion;
    }

    /**
     * Set tituloNotificacion value.
     *
     * @param tituloNotificacion java.lang.String
     */
    public void setTituloNotificacion(java.lang.String tituloNotificacion) {
        this.tituloNotificacion = tituloNotificacion;
    }

    /**
     * Get tituloNotificacion value.
     *
     * @return java.lang.String
     */
    public java.lang.String getTituloNotificacion() {
        return this.tituloNotificacion;
    }

    /**
     * Set toRfcNotificacion value.
     *
     * @param toRfcNotificacion java.lang.String
     */
    public void setToRfcNotificacion(java.lang.String toRfcNotificacion) {
        this.toRfcNotificacion = toRfcNotificacion;
    }

    /**
     * Get toRfcNotificacion value.
     *
     * @return java.lang.String
     */
    public java.lang.String getToRfcNotificacion() {
        return this.toRfcNotificacion;
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

    /**
     * Set adjuntoNotificacion value.
     *
     * @param adjuntoNotificacion java.lang.String
     */
    public void setAdjuntoNotificacion(java.lang.String adjuntoNotificacion) {
        this.adjuntoNotificacion = adjuntoNotificacion;
    }

    /**
     * Get adjuntoNotificacion value.
     *
     * @return java.lang.String
     */
    public java.lang.String getAdjuntoNotificacion() {
        return this.adjuntoNotificacion;
    }

    /**
     * Set ccRfcNotificacion value.
     *
     * @param ccRfcNotificacion java.lang.String
     */
    public void setCcRfcNotificacion(java.lang.String ccRfcNotificacion) {
        this.ccRfcNotificacion = ccRfcNotificacion;
    }

    /**
     * Get ccRfcNotificacion value.
     *
     * @return java.lang.String
     */
    public java.lang.String getCcRfcNotificacion() {
        return this.ccRfcNotificacion;
    }
    
}
