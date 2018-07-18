package gob.shcp.sireh.model;

import gob.shcp.fsn.model.Model;

import org.springmodules.validation.bean.conf.loader.annotation.handler.NotNull;
import org.springmodules.validation.bean.conf.loader.annotation.handler.NotBlank;
import org.springmodules.validation.bean.conf.loader.annotation.handler.MaxLength;

/**
 * Model object for transporting TdExpRfc data.
 */
public class TdExpRfcDTO  implements java.io.Serializable, Model {    

    @NotBlank(errorCode="not.null")
    @MaxLength(20)    
    private java.lang.String idDocto;
    @NotBlank(errorCode="not.null")
    @MaxLength(52)    
    private java.lang.String rfcEmpleado;
    private java.lang.Integer rfcSecuencia;
    @NotNull
    private int idExpRechazo;
    @NotNull
    private java.util.Date fecModifico;
    @NotBlank(errorCode="not.null")
    @NotNull
    @MaxLength(12)    
    private java.lang.String idStatus;
    @NotBlank(errorCode="not.null")
    @NotNull
    @MaxLength(52)    
    private java.lang.String rfcClave;
    @NotBlank(errorCode="not.null")
    @NotNull
    @MaxLength(400)    
    private java.lang.String rfcDoctoRef;
    @NotBlank(errorCode="not.null")
    @NotNull
    @MaxLength(120)    
    private java.lang.String usuario;
    @MaxLength(80)    
    private java.lang.String rfcFolio;

    /**
     * Constructor for TdExpRfcDTO class.
     */
    public TdExpRfcDTO() { }    

                                            
    /**
     * Constructor for TdExpRfcDTO class.
     *
     * @param idDocto java.lang.String
     * @param rfcEmpleado java.lang.String
     * @param rfcSecuencia java.lang.Integer
     * @param idExpRechazo int
     * @param fecModifico java.util.Date
     * @param idStatus java.lang.String
     * @param rfcClave java.lang.String
     * @param rfcDoctoRef java.lang.String
     * @param usuario java.lang.String
     * @param rfcFolio java.lang.String
     */
    public TdExpRfcDTO( java.lang.String idDocto, java.lang.String rfcEmpleado, java.lang.Integer rfcSecuencia, int idExpRechazo, java.util.Date fecModifico, java.lang.String idStatus, java.lang.String rfcClave, java.lang.String rfcDoctoRef, java.lang.String usuario, java.lang.String rfcFolio){    
        this.idDocto = idDocto;
        this.rfcEmpleado = rfcEmpleado;
        this.rfcSecuencia = rfcSecuencia;
        this.idExpRechazo = idExpRechazo;
        this.fecModifico = fecModifico;
        this.idStatus = idStatus;
        this.rfcClave = rfcClave;
        this.rfcDoctoRef = rfcDoctoRef;
        this.usuario = usuario;
        this.rfcFolio = rfcFolio;
    }    

    
    /**
     * Set idDocto value.
     *
     * @param idDocto java.lang.String
     */
    public void setIdDocto(java.lang.String idDocto){
        this.idDocto = idDocto;
    }
    
    /**
     * Get idDocto value.
     *
     * @return java.lang.String
     */
    public java.lang.String getIdDocto() {
        return this.idDocto;    
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
     * Set rfcSecuencia value.
     *
     * @param rfcSecuencia java.lang.Integer
     */
    public void setRfcSecuencia(java.lang.Integer rfcSecuencia){
        this.rfcSecuencia = rfcSecuencia;
    }
    
    /**
     * Get rfcSecuencia value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getRfcSecuencia() {
        return this.rfcSecuencia;    
    }
    
    /**
     * Set idExpRechazo value.
     *
     * @param idExpRechazo int
     */
    public void setIdExpRechazo(int idExpRechazo){
        this.idExpRechazo = idExpRechazo;
    }
    
    /**
     * Get idExpRechazo value.
     *
     * @return int
     */
    public int getIdExpRechazo() {
        return this.idExpRechazo;    
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
     * Set rfcClave value.
     *
     * @param rfcClave java.lang.String
     */
    public void setRfcClave(java.lang.String rfcClave){
        this.rfcClave = rfcClave;
    }
    
    /**
     * Get rfcClave value.
     *
     * @return java.lang.String
     */
    public java.lang.String getRfcClave() {
        return this.rfcClave;    
    }
    
    /**
     * Set rfcDoctoRef value.
     *
     * @param rfcDoctoRef java.lang.String
     */
    public void setRfcDoctoRef(java.lang.String rfcDoctoRef){
        this.rfcDoctoRef = rfcDoctoRef;
    }
    
    /**
     * Get rfcDoctoRef value.
     *
     * @return java.lang.String
     */
    public java.lang.String getRfcDoctoRef() {
        return this.rfcDoctoRef;    
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
     * Set rfcFolio value.
     *
     * @param rfcFolio java.lang.String
     */
    public void setRfcFolio(java.lang.String rfcFolio){
        this.rfcFolio = rfcFolio;
    }
    
    /**
     * Get rfcFolio value.
     *
     * @return java.lang.String
     */
    public java.lang.String getRfcFolio() {
        return this.rfcFolio;    
    }


}