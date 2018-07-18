package gob.shcp.sireh.model;

import gob.shcp.fsn.model.Model;

import org.springmodules.validation.bean.conf.loader.annotation.handler.NotNull;
import org.springmodules.validation.bean.conf.loader.annotation.handler.NotBlank;
import org.springmodules.validation.bean.conf.loader.annotation.handler.MaxLength;

/**
 * Model object for transporting TdExpDoctosSinDato data.
 */
public class TdExpDoctosSinDatoDTO  implements java.io.Serializable, Model {    

    private java.lang.Integer dsdSecuencia;
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
    private java.lang.String dsdDoctoRef;
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
    private java.lang.String dsdDescripDocto;
    private java.lang.String auxdsdDescripDocto=" ";    
    private java.lang.Integer dsdAxoDocto;

    /**
     * Constructor for TdExpDoctosSinDatoDTO class.
     */
    public TdExpDoctosSinDatoDTO() { }    

                                    
    /**
     * Constructor for TdExpDoctosSinDatoDTO class.
     *
     * @param dsdSecuencia java.lang.Integer
     * @param idDocto java.lang.String
     * @param rfcEmpleado java.lang.String
     * @param idExpRechazo int
     * @param dsdDoctoRef java.lang.String
     * @param fecModifico java.util.Date
     * @param idStatus java.lang.String
     * @param usuario java.lang.String
     * @param dsdDescripDocto java.lang.String
     * @param dsdAxoDocto java.lang.Integer
     */
    public TdExpDoctosSinDatoDTO( java.lang.Integer dsdSecuencia, java.lang.String idDocto, java.lang.String rfcEmpleado, int idExpRechazo, java.lang.String dsdDoctoRef, java.util.Date fecModifico, java.lang.String idStatus, java.lang.String usuario, java.lang.String dsdDescripDocto, java.lang.Integer dsdAxoDocto){    
        this.dsdSecuencia = dsdSecuencia;
        this.idDocto = idDocto;
        this.rfcEmpleado = rfcEmpleado;
        this.idExpRechazo = idExpRechazo;
        this.dsdDoctoRef = dsdDoctoRef;
        this.fecModifico = fecModifico;
        this.idStatus = idStatus;
        this.usuario = usuario;
        this.dsdDescripDocto = dsdDescripDocto;
        this.dsdAxoDocto = dsdAxoDocto;
    }    

    
    /**
     * Set dsdSecuencia value.
     *
     * @param dsdSecuencia java.lang.Integer
     */
    public void setDsdSecuencia(java.lang.Integer dsdSecuencia){
        this.dsdSecuencia = dsdSecuencia;
    }
    
    /**
     * Get dsdSecuencia value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getDsdSecuencia() {
        return this.dsdSecuencia;    
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
     * Set dsdDoctoRef value.
     *
     * @param dsdDoctoRef java.lang.String
     */
    public void setDsdDoctoRef(java.lang.String dsdDoctoRef){
        this.dsdDoctoRef = dsdDoctoRef;
    }
    
    /**
     * Get dsdDoctoRef value.
     *
     * @return java.lang.String
     */
    public java.lang.String getDsdDoctoRef() {
        return this.dsdDoctoRef;    
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
     * Set dsdDescripDocto value.
     *
     * @param dsdDescripDocto java.lang.String
     */
    public void setDsdDescripDocto(String dsdDescripDocto) {
        this.dsdDescripDocto = dsdDescripDocto;
    }
    
    /**
     * Get dsdAnioDocto value.
     *
     * @return java.lang.String
     */
    public String getDsdDescripDocto() {
        return dsdDescripDocto;
    }
    
    /**
     * Set dsdAxoDocto value.
     *
     * @param dsdAxoDocto java.lang.Integer
     */
    public void setDsdAxoDocto(Integer dsdAxoDocto) {
        this.dsdAxoDocto = dsdAxoDocto;
    }
    
    /**
     * Get dsdAxoDocto value.
     *
     * @return java.lang.String
     */
    public Integer getDsdAxoDocto() {
        return dsdAxoDocto;
    }

    public void setAuxdsdDescripDocto(String auxdsdDescripDocto) {
        this.auxdsdDescripDocto = auxdsdDescripDocto;
    }

    public String getAuxdsdDescripDocto() {
        return auxdsdDescripDocto;
    }
}
