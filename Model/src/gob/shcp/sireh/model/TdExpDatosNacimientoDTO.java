package gob.shcp.sireh.model;

import gob.shcp.fsn.model.Model;

import org.springmodules.validation.bean.conf.loader.annotation.handler.NotNull;
import org.springmodules.validation.bean.conf.loader.annotation.handler.NotBlank;
import org.springmodules.validation.bean.conf.loader.annotation.handler.MaxLength;

/**
 * Model object for transporting TdExpDatosNacimiento data.
 */
public class TdExpDatosNacimientoDTO  implements java.io.Serializable, Model {    

    private java.lang.Integer dnaSecuencia;
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
    private java.lang.String dnaDoctoRef;
    @NotNull
    private java.util.Date dnaFecNacimiento;
    @NotBlank(errorCode="not.null")
    @NotNull
    @MaxLength(160)    
    private java.lang.String dnaNombreEmpleado;
    @NotNull
    private java.util.Date fecModifico;
    @NotNull
    private int idEdo;
    @NotNull
    private String idNacionalidad;
    @NotBlank(errorCode="not.null")
    @NotNull
    @MaxLength(12)    
    private java.lang.String idPais;
    @NotBlank(errorCode="not.null")
    @NotNull
    @MaxLength(12)    
    private java.lang.String idStatus;
    @NotBlank(errorCode="not.null")
    @NotNull
    @MaxLength(120)    
    private java.lang.String usuario;
    @MaxLength(120)    
    private java.lang.String dnaExtranjerosFm3;
    @MaxLength(160)    
    private java.lang.String dnaPrimerApellido;
    @MaxLength(160)    
    private java.lang.String dnaSegundoApellido;

    /**
     * Constructor for TdExpDatosNacimientoDTO class.
     */
    public TdExpDatosNacimientoDTO() { }    

                                                                    
    /**
     * Constructor for TdExpDatosNacimientoDTO class.
     *
     * @param dnaSecuencia java.lang.Integer
     * @param idDocto java.lang.String
     * @param rfcEmpleado java.lang.String
     * @param idExpRechazo int
     * @param dnaDoctoRef java.lang.String
     * @param dnaFecNacimiento java.util.Date
     * @param dnaNombreEmpleado java.lang.String
     * @param fecModifico java.util.Date
     * @param idEdo int
     * @param idNacionalidad String
     * @param idPais java.lang.String
     * @param idStatus java.lang.String
     * @param usuario java.lang.String
     * @param dnaExtranjerosFm3 java.lang.String
     * @param dnaPrimerApellido java.lang.String
     * @param dnaSegundoApellido java.lang.String
     */
    public TdExpDatosNacimientoDTO( java.lang.Integer dnaSecuencia, java.lang.String idDocto, java.lang.String rfcEmpleado, int idExpRechazo, java.lang.String dnaDoctoRef, java.util.Date dnaFecNacimiento, java.lang.String dnaNombreEmpleado, java.util.Date fecModifico, int idEdo, String idNacionalidad, java.lang.String idPais, java.lang.String idStatus, java.lang.String usuario, java.lang.String dnaExtranjerosFm3, java.lang.String dnaPrimerApellido, java.lang.String dnaSegundoApellido){    
        this.dnaSecuencia = dnaSecuencia;
        this.idDocto = idDocto;
        this.rfcEmpleado = rfcEmpleado;
        this.idExpRechazo = idExpRechazo;
        this.dnaDoctoRef = dnaDoctoRef;
        this.dnaFecNacimiento = dnaFecNacimiento;
        this.dnaNombreEmpleado = dnaNombreEmpleado;
        this.fecModifico = fecModifico;
        this.idEdo = idEdo;
        this.idNacionalidad = idNacionalidad;
        this.idPais = idPais;
        this.idStatus = idStatus;
        this.usuario = usuario;
        this.dnaExtranjerosFm3 = dnaExtranjerosFm3;
        this.dnaPrimerApellido = dnaPrimerApellido;
        this.dnaSegundoApellido = dnaSegundoApellido;
    }    

    
    /**
     * Set dnaSecuencia value.
     *
     * @param dnaSecuencia java.lang.Integer
     */
    public void setDnaSecuencia(java.lang.Integer dnaSecuencia){
        this.dnaSecuencia = dnaSecuencia;
    }
    
    /**
     * Get dnaSecuencia value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getDnaSecuencia() {
        return this.dnaSecuencia;    
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
     * Set dnaDoctoRef value.
     *
     * @param dnaDoctoRef java.lang.String
     */
    public void setDnaDoctoRef(java.lang.String dnaDoctoRef){
        this.dnaDoctoRef = dnaDoctoRef;
    }
    
    /**
     * Get dnaDoctoRef value.
     *
     * @return java.lang.String
     */
    public java.lang.String getDnaDoctoRef() {
        return this.dnaDoctoRef;    
    }
    
    /**
     * Set dnaFecNacimiento value.
     *
     * @param dnaFecNacimiento java.util.Date
     */
    public void setDnaFecNacimiento(java.util.Date dnaFecNacimiento){
        this.dnaFecNacimiento = dnaFecNacimiento;
    }
    
    /**
     * Get dnaFecNacimiento value.
     *
     * @return java.util.Date
     */
    public java.util.Date getDnaFecNacimiento() {
        return this.dnaFecNacimiento;    
    }
    
    /**
     * Set dnaNombreEmpleado value.
     *
     * @param dnaNombreEmpleado java.lang.String
     */
    public void setDnaNombreEmpleado(java.lang.String dnaNombreEmpleado){
        this.dnaNombreEmpleado = dnaNombreEmpleado;
    }
    
    /**
     * Get dnaNombreEmpleado value.
     *
     * @return java.lang.String
     */
    public java.lang.String getDnaNombreEmpleado() {
        return this.dnaNombreEmpleado;    
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
     * Set idEdo value.
     *
     * @param idEdo int
     */
    public void setIdEdo(int idEdo){
        this.idEdo = idEdo;
    }
    
    /**
     * Get idEdo value.
     *
     * @return int
     */
    public int getIdEdo() {
        return this.idEdo;    
    }
    
    
    /**
     * Set idPais value.
     *
     * @param idPais java.lang.String
     */
    public void setIdPais(java.lang.String idPais){
        this.idPais = idPais;
    }
    
    /**
     * Get idPais value.
     *
     * @return java.lang.String
     */
    public java.lang.String getIdPais() {
        return this.idPais;    
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
     * Set dnaExtranjerosFm3 value.
     *
     * @param dnaExtranjerosFm3 java.lang.String
     */
    public void setDnaExtranjerosFm3(java.lang.String dnaExtranjerosFm3){
        this.dnaExtranjerosFm3 = dnaExtranjerosFm3;
    }
    
    /**
     * Get dnaExtranjerosFm3 value.
     *
     * @return java.lang.String
     */
    public java.lang.String getDnaExtranjerosFm3() {
        return this.dnaExtranjerosFm3;    
    }
    
    /**
     * Set dnaPrimerApellido value.
     *
     * @param dnaPrimerApellido java.lang.String
     */
    public void setDnaPrimerApellido(java.lang.String dnaPrimerApellido){
        this.dnaPrimerApellido = dnaPrimerApellido;
    }
    
    /**
     * Get dnaPrimerApellido value.
     *
     * @return java.lang.String
     */
    public java.lang.String getDnaPrimerApellido() {
        return this.dnaPrimerApellido;    
    }
    
    /**
     * Set dnaSegundoApellido value.
     *
     * @param dnaSegundoApellido java.lang.String
     */
    public void setDnaSegundoApellido(java.lang.String dnaSegundoApellido){
        this.dnaSegundoApellido = dnaSegundoApellido;
    }
    
    /**
     * Get dnaSegundoApellido value.
     *
     * @return java.lang.String
     */
    public java.lang.String getDnaSegundoApellido() {
        return this.dnaSegundoApellido;    
    }


    public void setIdNacionalidad(String idNacionalidad) {
        this.idNacionalidad = idNacionalidad;
    }

    public String getIdNacionalidad() {
        return idNacionalidad;
    }
}
