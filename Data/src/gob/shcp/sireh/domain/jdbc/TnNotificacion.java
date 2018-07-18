package gob.shcp.sireh.domain.jdbc;

import gob.shcp.fsn.data.Domain;
import gob.shcp.fsn.data.annotation.PrimaryKey;

import java.io.Serializable;

/**
 * Domain object for persistent TnNotificacion data.
 */
public class TnNotificacion implements Domain, Serializable {
    
    @PrimaryKey
    private java.lang.Integer idNotificacion;
    private java.lang.String idSituacionNotificacion;
    private java.lang.String idTipoNotificacion;
    private java.util.Date fecModifico;
    private java.lang.String fromRfcNotificacion;
    private java.lang.String msgNotificacion;
    private java.lang.String tituloNotificacion;
    private java.lang.String toRfcNotificacion;
    private java.lang.String usuario;
    private java.lang.String adjuntoNotificacion;
    private java.lang.String ccRfcNotificacion;

    /**
     * Constructor for TnNotificacion class.
     */
    public TnNotificacion() {
    }

    /**
     * Constructor for TnNotificacion class.
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
    public TnNotificacion(java.lang.Integer idNotificacion, java.lang.String idSituacionNotificacion, 
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
     * Get idNotificacion value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getIdNotificacion() {
        return this.idNotificacion;
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
     * Get idTipoNotificacion value.
     *
     * @return java.lang.String
     */
    public java.lang.String getIdTipoNotificacion() {
        return this.idTipoNotificacion;
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
     * Get fromRfcNotificacion value.
     *
     * @return java.lang.String
     */
    public java.lang.String getFromRfcNotificacion() {
        return this.fromRfcNotificacion;
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
     * Get tituloNotificacion value.
     *
     * @return java.lang.String
     */
    public java.lang.String getTituloNotificacion() {
        return this.tituloNotificacion;
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
     * Get usuario value.
     *
     * @return java.lang.String
     */
    public java.lang.String getUsuario() {
        return this.usuario;
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
     * Get ccRfcNotificacion value.
     *
     * @return java.lang.String
     */
    public java.lang.String getCcRfcNotificacion() {
        return this.ccRfcNotificacion;
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
     * Set idSituacionNotificacion value.
     *
     * @param idSituacionNotificacion java.lang.String
     */
    public void setIdSituacionNotificacion(java.lang.String idSituacionNotificacion) {
        this.idSituacionNotificacion = idSituacionNotificacion;
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
     * Set fecModifico value.
     *
     * @param fecModifico java.util.Date
     */
    public void setFecModifico(java.util.Date fecModifico) {
        this.fecModifico = fecModifico;
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
     * Set msgNotificacion value.
     *
     * @param msgNotificacion java.lang.String
     */
    public void setMsgNotificacion(java.lang.String msgNotificacion) {
        this.msgNotificacion = msgNotificacion;
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
     * Set toRfcNotificacion value.
     *
     * @param toRfcNotificacion java.lang.String
     */
    public void setToRfcNotificacion(java.lang.String toRfcNotificacion) {
        this.toRfcNotificacion = toRfcNotificacion;
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
     * Set adjuntoNotificacion value.
     *
     * @param adjuntoNotificacion java.lang.String
     */
    public void setAdjuntoNotificacion(java.lang.String adjuntoNotificacion) {
        this.adjuntoNotificacion = adjuntoNotificacion;
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
     * Set identity value.
     *
     * @param idNotificacion Serializable
     */
    public void setIdentity(Serializable idNotificacion) {
        this.idNotificacion = (java.lang.Integer)idNotificacion;
    }

    /**
     * Get identity value.
     *
     * @return Serializable
     */
    public Serializable getIdentity() {
        return this.idNotificacion;
    }
}
