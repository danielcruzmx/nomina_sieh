package gob.shcp.sireh.model;

import gob.shcp.fsn.model.Model;

import org.springmodules.validation.bean.conf.loader.annotation.handler.NotNull;
import org.springmodules.validation.bean.conf.loader.annotation.handler.NotBlank;
import org.springmodules.validation.bean.conf.loader.annotation.handler.MaxLength;

/**
 * Model object for transporting TdExpControlExpediente data.
 */
public class TdExpControlExpedienteDTO  implements java.io.Serializable, Model {    

    @NotBlank(errorCode="not.null")
    @MaxLength(52)    
    private java.lang.String rfcEmpleado;
    @NotBlank(errorCode="not.null")
    @NotNull
    @MaxLength(200)    
    private java.lang.String exeDatosClasificacion;
    @NotBlank(errorCode="not.null")
    @NotNull
    @MaxLength(200)    
    private java.lang.String exeDatosUbicacion;
    @NotBlank(errorCode="not.null")
    @NotNull
    @MaxLength(8)    
    private java.lang.String exePrestado;
    @NotNull
    private java.util.Date fecModifico;
    @NotBlank(errorCode="not.null")
    @NotNull
    @MaxLength(120)    
    private java.lang.String usuario;
    private java.util.Date exeFechaPrestamo;
    @MaxLength(52)    
    private java.lang.String exeRfcUsuarioPrestamo;

    /**
     * Constructor for TdExpControlExpedienteDTO class.
     */
    public TdExpControlExpedienteDTO() { }    

                                    
    /**
     * Constructor for TdExpControlExpedienteDTO class.
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
    public TdExpControlExpedienteDTO( java.lang.String rfcEmpleado, java.lang.String exeDatosClasificacion, java.lang.String exeDatosUbicacion, java.lang.String exePrestado, java.util.Date fecModifico, java.lang.String usuario, java.util.Date exeFechaPrestamo, java.lang.String exeRfcUsuarioPrestamo){    
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
     * Set rfcEmpleado value.
     *
     * @param rfcEmpleado java.lang.String
     */
    public void setRfcEmpleado(java.lang.String rfcEmpleado){
        this.rfcEmpleado = rfcEmpleado;
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
     * Set exeDatosClasificacion value.
     *
     * @param exeDatosClasificacion java.lang.String
     */
    public void setExeDatosClasificacion(java.lang.String exeDatosClasificacion){
        this.exeDatosClasificacion = exeDatosClasificacion;
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
     * Set exeDatosUbicacion value.
     *
     * @param exeDatosUbicacion java.lang.String
     */
    public void setExeDatosUbicacion(java.lang.String exeDatosUbicacion){
        this.exeDatosUbicacion = exeDatosUbicacion;
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
     * Set exePrestado value.
     *
     * @param exePrestado java.lang.String
     */
    public void setExePrestado(java.lang.String exePrestado){
        this.exePrestado = exePrestado;
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
     * Set fecModifico value.
     *
     * @param fecModifico java.util.Date
     */
    public void setFecModifico(java.util.Date fecModifico){
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
     * Set usuario value.
     *
     * @param usuario java.lang.String
     */
    public void setUsuario(java.lang.String usuario){
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
     * Set exeFechaPrestamo value.
     *
     * @param exeFechaPrestamo java.util.Date
     */
    public void setExeFechaPrestamo(java.util.Date exeFechaPrestamo){
        this.exeFechaPrestamo = exeFechaPrestamo;
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
     * Set exeRfcUsuarioPrestamo value.
     *
     * @param exeRfcUsuarioPrestamo java.lang.String
     */
    public void setExeRfcUsuarioPrestamo(java.lang.String exeRfcUsuarioPrestamo){
        this.exeRfcUsuarioPrestamo = exeRfcUsuarioPrestamo;
    }
    
    /**
     * Get exeRfcUsuarioPrestamo value.
     *
     * @return java.lang.String
     */
    public java.lang.String getExeRfcUsuarioPrestamo() {
        return this.exeRfcUsuarioPrestamo;    
    }


}