package gob.shcp.sireh.domain.jdbc;

import gob.shcp.fsn.data.Domain;
import gob.shcp.fsn.data.annotation.PrimaryKey;

import java.io.Serializable;

/**
 * Domain object for persistent TdExpUsuarios data.
 */
public class TdExpUsuarios implements Domain, Serializable {
    @PrimaryKey
    private java.lang.String rfcEmpleado;
    private java.util.Date fecModifico;
    private java.lang.String idStatus;
    private java.lang.String usuario;
    private java.lang.String usuDoctoAutorizacion;
    private java.util.Date usuFechaAutorizacion;
    private java.lang.String usuTelefono;

    /**
     * Constructor for TdExpUsuarios class.
     */
    public TdExpUsuarios() {
    }

    /**
     * Constructor for TdExpUsuarios class.
     *
     * @param rfcEmpleado java.lang.String
     * @param fecModifico java.util.Date
     * @param idStatus java.lang.String
     * @param usuario java.lang.String
     * @param usuDoctoAutorizacion java.lang.String
     * @param usuFechaAutorizacion java.util.Date
     * @param usuTelefono java.lang.String
     */
    public TdExpUsuarios(java.lang.String rfcEmpleado, 
                         java.util.Date fecModifico, java.lang.String idStatus, 
                         java.lang.String usuario, 
                         java.lang.String usuDoctoAutorizacion, 
                         java.util.Date usuFechaAutorizacion, 
                         java.lang.String usuTelefono) {
        this.rfcEmpleado = rfcEmpleado;
        this.fecModifico = fecModifico;
        this.idStatus = idStatus;
        this.usuario = usuario;
        this.usuDoctoAutorizacion = usuDoctoAutorizacion;
        this.usuFechaAutorizacion = usuFechaAutorizacion;
        this.usuTelefono = usuTelefono;
    }

    /**
     * Get rfcEmpleado value.
     *
     * @return java.lang.String
     */
    public java.lang.String getRfcEmpleado() {
        return this.rfcEmpleado;
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
     * Get usuario value.
     *
     * @return java.lang.String
     */
    public java.lang.String getUsuario() {
        return this.usuario;
    }

    /**
     * Get usuDoctoAutorizacion value.
     *
     * @return java.lang.String
     */
    public java.lang.String getUsuDoctoAutorizacion() {
        return this.usuDoctoAutorizacion;
    }

    /**
     * Get usuFechaAutorizacion value.
     *
     * @return java.util.Date
     */
    public java.util.Date getUsuFechaAutorizacion() {
        return this.usuFechaAutorizacion;
    }

    /**
     * Get usuTelefono value.
     *
     * @return java.lang.String
     */
    public java.lang.String getUsuTelefono() {
        return this.usuTelefono;
    }

    /**
     * Set rfcEmpleado value.
     *
     * @param rfcEmpleado java.lang.String
     */
    public void setRfcEmpleado(java.lang.String rfcEmpleado) {
        this.rfcEmpleado = rfcEmpleado;
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
     * Set usuario value.
     *
     * @param usuario java.lang.String
     */
    public void setUsuario(java.lang.String usuario) {
        this.usuario = usuario;
    }

    /**
     * Set usuDoctoAutorizacion value.
     *
     * @param usuDoctoAutorizacion java.lang.String
     */
    public void setUsuDoctoAutorizacion(java.lang.String usuDoctoAutorizacion) {
        this.usuDoctoAutorizacion = usuDoctoAutorizacion;
    }

    /**
     * Set usuFechaAutorizacion value.
     *
     * @param usuFechaAutorizacion java.util.Date
     */
    public void setUsuFechaAutorizacion(java.util.Date usuFechaAutorizacion) {
        this.usuFechaAutorizacion = usuFechaAutorizacion;
    }

    /**
     * Set usuTelefono value.
     *
     * @param usuTelefono java.lang.String
     */
    public void setUsuTelefono(java.lang.String usuTelefono) {
        this.usuTelefono = usuTelefono;
    }

    /**
     * Set identity value.
     *
     * @param rfcEmpleado Serializable
     */
    public void setIdentity(Serializable rfcEmpleado) {
        this.rfcEmpleado = (java.lang.String)rfcEmpleado;
    }

    /**
     * Get identity value.
     *
     * @return Serializable
     */
    public Serializable getIdentity() {
        return this.rfcEmpleado;
    }
}
