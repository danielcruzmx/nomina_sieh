package gob.shcp.sireh.model;

import gob.shcp.fsn.model.Model;

import org.springmodules.validation.bean.conf.loader.annotation.handler.NotNull;
import org.springmodules.validation.bean.conf.loader.annotation.handler.NotBlank;
import org.springmodules.validation.bean.conf.loader.annotation.handler.MaxLength;

/**
 * Model object for transporting TdExpCartillaMilitar data.
 */
public class TdExpCartillaMilitarDTO  implements java.io.Serializable, Model {    

    private java.lang.Integer cmiSecuencia;
    @NotBlank(errorCode="not.null")
    @MaxLength(20)    
    private java.lang.String idDocto;
    @NotBlank(errorCode="not.null")
    @MaxLength(52)    
    private java.lang.String rfcEmpleado;
    @NotNull
    private java.lang.Integer idExpRechazo;
    @NotBlank(errorCode="not.null")
    @NotNull
    @MaxLength(400)    
    private java.lang.String cmiDoctoRef;
    @NotBlank(errorCode="not.null")
    @NotNull
    @MaxLength(160)    
    private java.lang.String cmiNumeroCartilla;
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
    @MaxLength(160)    
    private java.lang.String cmiFechaLiberacion;

    /**
     * Constructor for TdExpCartillaMilitarDTO class.
     */
    public TdExpCartillaMilitarDTO() { }    

                                            
    /**
     * Constructor for TdExpCartillaMilitarDTO class.
     *
     * @param cmiSecuencia java.lang.Integer
     * @param idDocto java.lang.String
     * @param rfcEmpleado java.lang.String
     * @param idExpRechazo java.lang.Integer
     * @param cmiDoctoRef java.lang.String
     * @param cmiNumeroCartilla java.lang.String
     * @param fecModifico java.util.Date
     * @param idStatus java.lang.String
     * @param usuario java.lang.String
     * @param cmiFechaLiberacion java.lang.String
     */
    public TdExpCartillaMilitarDTO(java.lang.Integer cmiSecuencia, java.lang.String idDocto, java.lang.String rfcEmpleado, java.lang.Integer idExpRechazo, java.lang.String cmiDoctoRef, java.lang.String cmiNumeroCartilla, java.util.Date fecModifico, java.lang.String idStatus, java.lang.String usuario, java.lang.String cmiFechaLiberacion){    
        this.cmiSecuencia = cmiSecuencia;
        this.idDocto = idDocto;
        this.rfcEmpleado = rfcEmpleado;
        this.idExpRechazo = idExpRechazo;
        this.cmiDoctoRef = cmiDoctoRef;
        this.cmiNumeroCartilla = cmiNumeroCartilla;
        this.fecModifico = fecModifico;
        this.idStatus = idStatus;
        this.usuario = usuario;
        this.cmiFechaLiberacion = cmiFechaLiberacion;
    }    

    
    /**
     * Set cmiSecuencia value.
     *
     * @param cmiSecuencia java.lang.Integer
     */
    public void setCmiSecuencia(java.lang.Integer cmiSecuencia){
        this.cmiSecuencia = cmiSecuencia;
    }
    
    /**
     * Get cmiSecuencia value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getCmiSecuencia() {
        return this.cmiSecuencia;    
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
     * Set cmiDoctoRef value.
     *
     * @param cmiDoctoRef java.lang.String
     */
    public void setCmiDoctoRef(java.lang.String cmiDoctoRef){
        this.cmiDoctoRef = cmiDoctoRef;
    }
    
    /**
     * Get cmiDoctoRef value.
     *
     * @return java.lang.String
     */
    public java.lang.String getCmiDoctoRef() {
        return this.cmiDoctoRef;    
    }
    
    /**
     * Set cmiNumeroCartilla value.
     *
     * @param cmiNumeroCartilla java.lang.String
     */
    public void setCmiNumeroCartilla(java.lang.String cmiNumeroCartilla){
        this.cmiNumeroCartilla = cmiNumeroCartilla;
    }
    
    /**
     * Get cmiNumeroCartilla value.
     *
     * @return java.lang.String
     */
    public java.lang.String getCmiNumeroCartilla() {
        return this.cmiNumeroCartilla;    
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
    
    public void setIdExpRechazo(Integer idExpRechazo) {
        this.idExpRechazo = idExpRechazo;
    }

    public Integer getIdExpRechazo() {
        return idExpRechazo;
    }
    
    /**
     * Get cmiFechaLiberacion value.
     *
     * @return java.lang.String
     */

    public String getCmiFechaLiberacion() {
        return cmiFechaLiberacion;
    }

    /**
     * Set cmiFechaLiberacion value.
     *
     * @param cmiFechaLiberacion java.lang.String
     */
    public void setCmiFechaLiberacion(String cmiFechaLiberacion) {
        this.cmiFechaLiberacion = cmiFechaLiberacion;
    }
}
