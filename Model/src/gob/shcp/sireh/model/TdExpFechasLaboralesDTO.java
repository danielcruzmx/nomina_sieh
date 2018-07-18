package gob.shcp.sireh.model;

import gob.shcp.fsn.model.Model;

import org.springmodules.validation.bean.conf.loader.annotation.handler.NotNull;
import org.springmodules.validation.bean.conf.loader.annotation.handler.NotBlank;
import org.springmodules.validation.bean.conf.loader.annotation.handler.MaxLength;

/**
 * Model object for transporting TdExpFechasLaborale data.
 */
public class TdExpFechasLaboralesDTO  implements java.io.Serializable, Model {    

    private java.lang.Integer felSecuencia;
    @NotBlank(errorCode="not.null")
    @MaxLength(20)    
    private java.lang.String idDocto;
    @NotBlank(errorCode="not.null")
    @MaxLength(52)    
    private java.lang.String rfcEmpleado;
    @NotNull
    private int idExpRechazo;
    @NotBlank(errorCode="not.null")
    @NotNull
    @MaxLength(400)    
    private java.util.Date fecModifico;
    @NotNull
    private java.util.Date felFechaLaboral;
    @NotBlank(errorCode="not.null")
    @NotNull
    @MaxLength(20)    
    private java.lang.String idFecLab;
    @NotBlank(errorCode="not.null")
    @NotNull
    @MaxLength(12)    
    private java.lang.String idStatus;
    @NotBlank(errorCode="not.null")
    @NotNull
    @MaxLength(120)    
    private java.lang.String usuario;
    @MaxLength(100)    
    private java.lang.String felDoctoRef;

    /**
     * Constructor for TdExpFechasLaboraleDTO class.
     */
    public TdExpFechasLaboralesDTO() { }    

                                            
    /**
     * Constructor for TdExpFechasLaboraleDTO class.
     *
     * @param felSecuencia java.lang.Integer
     * @param idDocto java.lang.String
     * @param rfcEmpleado java.lang.String
     * @param idExpRechazo int
     * @param fecModifico java.util.Date
     * @param felFechaLaboral java.util.Date
     * @param idFecLab java.lang.String
     * @param idStatus java.lang.String
     * @param usuario java.lang.String
     * @param felDoctoRef java.lang.String
     */
    public TdExpFechasLaboralesDTO( java.lang.Integer felSecuencia, java.lang.String idDocto, java.lang.String rfcEmpleado, int idExpRechazo, java.util.Date fecModifico, java.util.Date felFechaLaboral, java.lang.String idFecLab, java.lang.String idStatus, java.lang.String usuario, java.lang.String felDoctoRef){    
        this.felSecuencia = felSecuencia;
        this.idDocto = idDocto;
        this.rfcEmpleado = rfcEmpleado;
        this.idExpRechazo = idExpRechazo;
        this.fecModifico = fecModifico;
        this.felFechaLaboral = felFechaLaboral;
        this.idFecLab = idFecLab;
        this.idStatus = idStatus;
        this.usuario = usuario;
        this.felDoctoRef = felDoctoRef;
    }    

    
    /**
     * Set felSecuencia value.
     *
     * @param felSecuencia java.lang.Integer
     */
    public void setFelSecuencia(java.lang.Integer felSecuencia){
        this.felSecuencia = felSecuencia;
    }
    
    /**
     * Get felSecuencia value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getFelSecuencia() {
        return this.felSecuencia;    
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
     * Set felFechaLaboral value.
     *
     * @param felFechaLaboral java.util.Date
     */
    public void setFelFechaLaboral(java.util.Date felFechaLaboral){
        this.felFechaLaboral = felFechaLaboral;
    }
    
    /**
     * Get felFechaLaboral value.
     *
     * @return java.util.Date
     */
    public java.util.Date getFelFechaLaboral() {
        return this.felFechaLaboral;    
    }
    
    /**
     * Set idFecLab value.
     *
     * @param idFecLab java.lang.String
     */
    public void setIdFecLab(java.lang.String idFecLab){
        this.idFecLab = idFecLab;
    }
    
    /**
     * Get idFecLab value.
     *
     * @return java.lang.String
     */
    public java.lang.String getIdFecLab() {
        return this.idFecLab;    
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
     * Set felDoctoRef value.
     *
     * @param felDoctoRef java.lang.String
     */
    public void setFelDoctoRef(java.lang.String felDoctoRef){
        this.felDoctoRef = felDoctoRef;
    }
    
    /**
     * Get felDoctoRef value.
     *
     * @return java.lang.String
     */
    public java.lang.String getFelDoctoRef() {
        return this.felDoctoRef;    
    }
}
