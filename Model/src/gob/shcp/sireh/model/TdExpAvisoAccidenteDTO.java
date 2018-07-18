package gob.shcp.sireh.model;

import gob.shcp.fsn.model.Model;

import org.springmodules.validation.bean.conf.loader.annotation.handler.NotNull;
import org.springmodules.validation.bean.conf.loader.annotation.handler.NotBlank;
import org.springmodules.validation.bean.conf.loader.annotation.handler.MaxLength;

/**
 * Model object for transporting TdExpAvisoAccidente data.
 */
public class TdExpAvisoAccidenteDTO  implements java.io.Serializable, Model {    

    @NotBlank(errorCode="not.null")
    @MaxLength(52)    
    private java.lang.String rfcEmpleado;
    @NotBlank(errorCode="not.null")
    @NotNull
    @MaxLength(160)    
    private java.lang.String accNombreEmpleado;
    @NotNull
    private int accSecuencia;
    @NotBlank(errorCode="not.null")
    @NotNull
    @MaxLength(60)    
    private java.lang.String accTelefono1;
    @NotBlank(errorCode="not.null")
    @NotNull
    @MaxLength(60)    
    private java.lang.String accTelefono2;
    @NotNull
    private java.util.Date fecModifico;
    @NotNull
    private int idParentesco;
    @NotBlank(errorCode="not.null")
    @NotNull
    @MaxLength(120)    
    private java.lang.String usuario;
    @MaxLength(160)    
    private java.lang.String accPrimerApellido;
    @MaxLength(160)    
    private java.lang.String accSegundoApellido;

    /**
     * Constructor for TdExpAvisoAccidenteDTO class.
     */
    public TdExpAvisoAccidenteDTO() { }    

                                            
    /**
     * Constructor for TdExpAvisoAccidenteDTO class.
     *
     * @param rfcEmpleado java.lang.String
     * @param accNombreEmpleado java.lang.String
     * @param accSecuencia int
     * @param accTelefono1 java.lang.String
     * @param accTelefono2 java.lang.String
     * @param fecModifico java.util.Date
     * @param idParentesco int
     * @param usuario java.lang.String
     * @param accPrimerApellido java.lang.String
     * @param accSegundoApellido java.lang.String
     */
    public TdExpAvisoAccidenteDTO( java.lang.String rfcEmpleado, java.lang.String accNombreEmpleado, int accSecuencia, java.lang.String accTelefono1, java.lang.String accTelefono2, java.util.Date fecModifico, int idParentesco, java.lang.String usuario, java.lang.String accPrimerApellido, java.lang.String accSegundoApellido){    
        this.rfcEmpleado = rfcEmpleado;
        this.accNombreEmpleado = accNombreEmpleado;
        this.accSecuencia = accSecuencia;
        this.accTelefono1 = accTelefono1;
        this.accTelefono2 = accTelefono2;
        this.fecModifico = fecModifico;
        this.idParentesco = idParentesco;
        this.usuario = usuario;
        this.accPrimerApellido = accPrimerApellido;
        this.accSegundoApellido = accSegundoApellido;
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
     * Set accNombreEmpleado value.
     *
     * @param accNombreEmpleado java.lang.String
     */
    public void setAccNombreEmpleado(java.lang.String accNombreEmpleado){
        this.accNombreEmpleado = accNombreEmpleado;
    }
    
    /**
     * Get accNombreEmpleado value.
     *
     * @return java.lang.String
     */
    public java.lang.String getAccNombreEmpleado() {
        return this.accNombreEmpleado;    
    }
    
    /**
     * Set accSecuencia value.
     *
     * @param accSecuencia int
     */
    public void setAccSecuencia(int accSecuencia){
        this.accSecuencia = accSecuencia;
    }
    
    /**
     * Get accSecuencia value.
     *
     * @return int
     */
    public int getAccSecuencia() {
        return this.accSecuencia;    
    }
    
    /**
     * Set accTelefono1 value.
     *
     * @param accTelefono1 java.lang.String
     */
    public void setAccTelefono1(java.lang.String accTelefono1){
        this.accTelefono1 = accTelefono1;
    }
    
    /**
     * Get accTelefono1 value.
     *
     * @return java.lang.String
     */
    public java.lang.String getAccTelefono1() {
        return this.accTelefono1;    
    }
    
    /**
     * Set accTelefono2 value.
     *
     * @param accTelefono2 java.lang.String
     */
    public void setAccTelefono2(java.lang.String accTelefono2){
        this.accTelefono2 = accTelefono2;
    }
    
    /**
     * Get accTelefono2 value.
     *
     * @return java.lang.String
     */
    public java.lang.String getAccTelefono2() {
        return this.accTelefono2;    
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
     * Set idParentesco value.
     *
     * @param idParentesco int
     */
    public void setIdParentesco(int idParentesco){
        this.idParentesco = idParentesco;
    }
    
    /**
     * Get idParentesco value.
     *
     * @return int
     */
    public int getIdParentesco() {
        return this.idParentesco;    
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
     * Set accPrimerApellido value.
     *
     * @param accPrimerApellido java.lang.String
     */
    public void setAccPrimerApellido(java.lang.String accPrimerApellido){
        this.accPrimerApellido = accPrimerApellido;
    }
    
    /**
     * Get accPrimerApellido value.
     *
     * @return java.lang.String
     */
    public java.lang.String getAccPrimerApellido() {
        return this.accPrimerApellido;    
    }
    
    /**
     * Set accSegundoApellido value.
     *
     * @param accSegundoApellido java.lang.String
     */
    public void setAccSegundoApellido(java.lang.String accSegundoApellido){
        this.accSegundoApellido = accSegundoApellido;
    }
    
    /**
     * Get accSegundoApellido value.
     *
     * @return java.lang.String
     */
    public java.lang.String getAccSegundoApellido() {
        return this.accSegundoApellido;    
    }


}