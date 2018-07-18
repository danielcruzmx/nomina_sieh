package gob.shcp.sireh.model;

import gob.shcp.fsn.model.Model;

import org.springmodules.validation.bean.conf.loader.annotation.handler.NotNull;
import org.springmodules.validation.bean.conf.loader.annotation.handler.NotBlank;
import org.springmodules.validation.bean.conf.loader.annotation.handler.MaxLength;

/**
 * Model object for transporting TdExpUsuarios data.
 */
public class TdExpUsuarioDTO  implements java.io.Serializable, Model {    

    @NotBlank(errorCode="not.null")
    @MaxLength(52)    
    private java.lang.String rfcEmpleado;
    @NotNull
    private java.util.Date fecModifico;
    @NotBlank(errorCode="not.null")
    @NotNull
    @MaxLength(12)    
    private java.lang.String idStatus;
    @NotBlank(errorCode="not.null")
    @NotNull
    @MaxLength(120)    
    private java.lang.String usuario;
    @NotBlank(errorCode="not.null")
    @NotNull
    @MaxLength(400)    
    private java.lang.String usuDoctoAutorizacion;
    @NotNull
    private java.util.Date usuFechaAutorizacion;
    @NotBlank(errorCode="not.null")
    @NotNull
    @MaxLength(100)    
    private java.lang.String usuTelefono;

    /**
     * Constructor for TdExpUsuarioDTO class.
     */
    public TdExpUsuarioDTO() { }    

                                
    /**
     * Constructor for TdExpUsuarioDTO class.
     *
     * @param rfcEmpleado java.lang.String
     * @param fecModifico java.util.Date
     * @param idStatus java.lang.String
     * @param usuario java.lang.String
     * @param usuDoctoAutorizacion java.lang.String
     * @param usuFechaAutorizacion java.util.Date
     * @param usuTelefono java.lang.String
     */
    public TdExpUsuarioDTO( java.lang.String rfcEmpleado, java.util.Date fecModifico, java.lang.String idStatus, java.lang.String usuario, java.lang.String usuDoctoAutorizacion, java.util.Date usuFechaAutorizacion, java.lang.String usuTelefono){    
        this.rfcEmpleado = rfcEmpleado;
        this.fecModifico = fecModifico;
        this.idStatus = idStatus;
        this.usuario = usuario;
        this.usuDoctoAutorizacion = usuDoctoAutorizacion;
        this.usuFechaAutorizacion = usuFechaAutorizacion;
        this.usuTelefono = usuTelefono;
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
     * Set idStatus value.
     *
     * @param idStatus java.lang.String
     */
    public void setIdStatus(java.lang.String idStatus){
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
     * Set usuDoctoAutorizacion value.
     *
     * @param usuDoctoAutorizacion java.lang.String
     */
    public void setUsuDoctoAutorizacion(java.lang.String usuDoctoAutorizacion){
        this.usuDoctoAutorizacion = usuDoctoAutorizacion;
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
     * Set usuFechaAutorizacion value.
     *
     * @param usuFechaAutorizacion java.util.Date
     */
    public void setUsuFechaAutorizacion(java.util.Date usuFechaAutorizacion){
        this.usuFechaAutorizacion = usuFechaAutorizacion;
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
     * Set usuTelefono value.
     *
     * @param usuTelefono java.lang.String
     */
    public void setUsuTelefono(java.lang.String usuTelefono){
        this.usuTelefono = usuTelefono;
    }
    
    /**
     * Get usuTelefono value.
     *
     * @return java.lang.String
     */
    public java.lang.String getUsuTelefono() {
        return this.usuTelefono;    
    }


}