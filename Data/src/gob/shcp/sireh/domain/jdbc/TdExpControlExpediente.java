package gob.shcp.sireh.domain.jdbc;

import gob.shcp.fsn.data.Domain;

import gob.shcp.fsn.data.annotation.PrimaryKey;

import java.io.Serializable;

/**
 * Domain object for persistent TdExpControlExpediente data.
 */
public class TdExpControlExpediente implements Domain, Serializable {
    @PrimaryKey
    private java.lang.String rfcEmpleado;
    private java.lang.String exeDatosClasificacion;
    private java.lang.String exeDatosUbicacion;
    private java.lang.String exePrestado;
    private java.util.Date fecModifico;
    private java.lang.String usuario;
    private java.util.Date exeFechaPrestamo;
    private java.lang.String exeRfcUsuarioPrestamo;

    /**
     * Constructor for TdExpControlExpediente class.
     */
    public TdExpControlExpediente() {
    }

    /**
     * Constructor for TdExpControlExpediente class.
     *
     * @param rfcEmpleado java.lang.String
     * @param exeDatosClasificacion java.lang.String
     * @param exeDatosUbicacion java.lang.String
     * @param exePrestado java.lang.String
     * @param fecModifico java.util.Date
     * @param usuario java.lang.String
     * @param exeFechaPrestamo java.util.Date
     * @param exeRfcUsuarioPrestamo java.lang.String
     */
    public TdExpControlExpediente(java.lang.String rfcEmpleado, 
                                  java.lang.String exeDatosClasificacion, 
                                  java.lang.String exeDatosUbicacion, 
                                  java.lang.String exePrestado, 
                                  java.util.Date fecModifico, 
                                  java.lang.String usuario, 
                                  java.util.Date exeFechaPrestamo, 
                                  java.lang.String exeRfcUsuarioPrestamo) {
        this.rfcEmpleado = rfcEmpleado;
        this.exeDatosClasificacion = exeDatosClasificacion;
        this.exeDatosUbicacion = exeDatosUbicacion;
        this.exePrestado = exePrestado;
        this.fecModifico = fecModifico;
        this.usuario = usuario;
        this.exeFechaPrestamo = exeFechaPrestamo;
        this.exeRfcUsuarioPrestamo = exeRfcUsuarioPrestamo;
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
     * Get exeDatosClasificacion value.
     *
     * @return java.lang.String
     */
    public java.lang.String getExeDatosClasificacion() {
        return this.exeDatosClasificacion;
    }

    /**
     * Get exeDatosUbicacion value.
     *
     * @return java.lang.String
     */
    public java.lang.String getExeDatosUbicacion() {
        return this.exeDatosUbicacion;
    }

    /**
     * Get exePrestado value.
     *
     * @return java.lang.String
     */
    public java.lang.String getExePrestado() {
        return this.exePrestado;
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
     * Get exeFechaPrestamo value.
     *
     * @return java.util.Date
     */
    public java.util.Date getExeFechaPrestamo() {
        return this.exeFechaPrestamo;
    }

    /**
     * Get exeRfcUsuarioPrestamo value.
     *
     * @return java.lang.String
     */
    public java.lang.String getExeRfcUsuarioPrestamo() {
        return this.exeRfcUsuarioPrestamo;
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
     * Set exeDatosClasificacion value.
     *
     * @param exeDatosClasificacion java.lang.String
     */
    public void setExeDatosClasificacion(java.lang.String exeDatosClasificacion) {
        this.exeDatosClasificacion = exeDatosClasificacion;
    }

    /**
     * Set exeDatosUbicacion value.
     *
     * @param exeDatosUbicacion java.lang.String
     */
    public void setExeDatosUbicacion(java.lang.String exeDatosUbicacion) {
        this.exeDatosUbicacion = exeDatosUbicacion;
    }

    /**
     * Set exePrestado value.
     *
     * @param exePrestado java.lang.String
     */
    public void setExePrestado(java.lang.String exePrestado) {
        this.exePrestado = exePrestado;
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
     * Set exeFechaPrestamo value.
     *
     * @param exeFechaPrestamo java.util.Date
     */
    public void setExeFechaPrestamo(java.util.Date exeFechaPrestamo) {
        this.exeFechaPrestamo = exeFechaPrestamo;
    }

    /**
     * Set exeRfcUsuarioPrestamo value.
     *
     * @param exeRfcUsuarioPrestamo java.lang.String
     */
    public void setExeRfcUsuarioPrestamo(java.lang.String exeRfcUsuarioPrestamo) {
        this.exeRfcUsuarioPrestamo = exeRfcUsuarioPrestamo;
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
