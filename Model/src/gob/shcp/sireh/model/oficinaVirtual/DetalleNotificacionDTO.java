package gob.shcp.sireh.model.oficinaVirtual;

import gob.shcp.fsn.model.Model;

import java.util.Date;

public class DetalleNotificacionDTO implements java.io.Serializable, Model {

    // Detalle notificacion
    private java.lang.Integer idNotificacion;
    private java.lang.String idTipoNotificacion;
    private String descTipoNotificacion;
    private java.lang.String tituloNotificacion;
    private java.lang.String msgNotificacion;
    private java.lang.String fromRfcNotificacion;
    private java.lang.String toRfcNotificacion;
    private java.lang.String ccRfcNotificacion;
    private java.lang.String adjuntoNotificacion;
    private java.lang.String usuario;
    private java.util.Date fecModifico;
    private java.lang.String idSituacionNotificacion;
    private String descSituacionNotificacion;
    
    // Control
    private boolean requiereAcuse;
    private String urlRegresar;

    public void setIdNotificacion(Integer idNotificacion) {
        this.idNotificacion = idNotificacion;
    }

    public Integer getIdNotificacion() {
        return idNotificacion;
    }

    public void setIdTipoNotificacion(String idTipoNotificacion) {
        this.idTipoNotificacion = idTipoNotificacion;
    }

    public String getIdTipoNotificacion() {
        return idTipoNotificacion;
    }

    public void setDescTipoNotificacion(String descTipoNotificacion) {
        this.descTipoNotificacion = descTipoNotificacion;
    }

    public String getDescTipoNotificacion() {
        return descTipoNotificacion;
    }

    public void setTituloNotificacion(String tituloNotificacion) {
        this.tituloNotificacion = tituloNotificacion;
    }

    public String getTituloNotificacion() {
        return tituloNotificacion;
    }

    public void setMsgNotificacion(String msgNotificacion) {
        this.msgNotificacion = msgNotificacion;
    }

    public String getMsgNotificacion() {
        return msgNotificacion;
    }

    public void setFromRfcNotificacion(String fromRfcNotificacion) {
        this.fromRfcNotificacion = fromRfcNotificacion;
    }

    public String getFromRfcNotificacion() {
        return fromRfcNotificacion;
    }

    public void setToRfcNotificacion(String toRfcNotificacion) {
        this.toRfcNotificacion = toRfcNotificacion;
    }

    public String getToRfcNotificacion() {
        return toRfcNotificacion;
    }

    public void setCcRfcNotificacion(String ccRfcNotificacion) {
        this.ccRfcNotificacion = ccRfcNotificacion;
    }

    public String getCcRfcNotificacion() {
        return ccRfcNotificacion;
    }

    public void setAdjuntoNotificacion(String adjuntoNotificacion) {
        this.adjuntoNotificacion = adjuntoNotificacion;
    }

    public String getAdjuntoNotificacion() {
        return adjuntoNotificacion;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setFecModifico(Date fecModifico) {
        this.fecModifico = fecModifico;
    }

    public Date getFecModifico() {
        return fecModifico;
    }

    public void setIdSituacionNotificacion(String idSituacionNotificacion) {
        this.idSituacionNotificacion = idSituacionNotificacion;
    }

    public String getIdSituacionNotificacion() {
        return idSituacionNotificacion;
    }

    public void setDescSituacionNotificacion(String descSituacionNotificacion) {
        this.descSituacionNotificacion = descSituacionNotificacion;
    }

    public String getDescSituacionNotificacion() {
        return descSituacionNotificacion;
    }

    public void setRequiereAcuse(boolean requiereAcuse) {
        this.requiereAcuse = requiereAcuse;
    }

    public boolean isRequiereAcuse() {
        return requiereAcuse;
    }
    
    public void setUrlRegresar(String urlRegresar) {
        this.urlRegresar = urlRegresar;
    }

    public String getUrlRegresar() {
        return urlRegresar;
    }
}
