package gob.shcp.sireh.model;

import gob.shcp.fsn.model.Model;

import org.springmodules.validation.bean.conf.loader.annotation.handler.NotNull;
import org.springmodules.validation.bean.conf.loader.annotation.handler.NotBlank;
import org.springmodules.validation.bean.conf.loader.annotation.handler.MaxLength;

/**
 * Model object for transporting TdExpAntecedentesAcademico data.
 */
public class TdExpAntecedentesAcademicoDTO  implements java.io.Serializable, Model {    

    private java.lang.Integer aacSecuencia;
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
    private java.lang.String aacDoctoRef;
    @NotBlank(errorCode="not.null")
    @NotNull
    @MaxLength(8)    
    private java.lang.String aacEstConcluidos;
    @NotNull
    private java.util.Date fecModifico;
    @NotNull
    private int idInstEducat;
    @NotNull
    private int idNivelEscolar;
    @NotNull
    private float idProfCarrera;
    @NotBlank(errorCode="not.null")
    @NotNull
    @MaxLength(12)    
    private java.lang.String idStatus;
    @NotBlank(errorCode="not.null")
    @NotNull
    @MaxLength(120)    
    private java.lang.String usuario;
    private java.lang.Integer aacCedProfesional;
    private java.lang.Float aacPromedio;

    /**
     * Constructor for TdExpAntecedentesAcademicoDTO class.
     */
    public TdExpAntecedentesAcademicoDTO() { }    

                                                            
    /**
     * Constructor for TdExpAntecedentesAcademicoDTO class.
     *
     * @param aacSecuencia java.lang.Integer
     * @param idDocto java.lang.String
     * @param rfcEmpleado java.lang.String
     * @param idExpRechazo int
     * @param aacDoctoRef java.lang.String
     * @param aacEstConcluidos java.lang.String
     * @param fecModifico java.util.Date
     * @param idInstEducat int
     * @param idNivelEscolar int
     * @param idProfCarrera float
     * @param idStatus java.lang.String
     * @param usuario java.lang.String
     * @param aacCedProfesional java.lang.Integer
     * @param aacPromedio java.lang.Float
     */
    public TdExpAntecedentesAcademicoDTO( java.lang.Integer aacSecuencia, java.lang.String idDocto, java.lang.String rfcEmpleado, int idExpRechazo, java.lang.String aacDoctoRef, java.lang.String aacEstConcluidos, java.util.Date fecModifico, int idInstEducat, int idNivelEscolar, float idProfCarrera, java.lang.String idStatus, java.lang.String usuario, java.lang.Integer aacCedProfesional, java.lang.Float aacPromedio){    
        this.aacSecuencia = aacSecuencia;
        this.idDocto = idDocto;
        this.rfcEmpleado = rfcEmpleado;
        this.idExpRechazo = idExpRechazo;
        this.aacDoctoRef = aacDoctoRef;
        this.aacEstConcluidos = aacEstConcluidos;
        this.fecModifico = fecModifico;
        this.idInstEducat = idInstEducat;
        this.idNivelEscolar = idNivelEscolar;
        this.idProfCarrera = idProfCarrera;
        this.idStatus = idStatus;
        this.usuario = usuario;
        this.aacCedProfesional = aacCedProfesional;
        this.aacPromedio = aacPromedio;
    }    

    
    /**
     * Set aacSecuencia value.
     *
     * @param aacSecuencia java.lang.Integer
     */
    public void setAacSecuencia(java.lang.Integer aacSecuencia){
        this.aacSecuencia = aacSecuencia;
    }
    
    /**
     * Get aacSecuencia value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getAacSecuencia() {
        return this.aacSecuencia;    
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
     * Set aacDoctoRef value.
     *
     * @param aacDoctoRef java.lang.String
     */
    public void setAacDoctoRef(java.lang.String aacDoctoRef){
        this.aacDoctoRef = aacDoctoRef;
    }
    
    /**
     * Get aacDoctoRef value.
     *
     * @return java.lang.String
     */
    public java.lang.String getAacDoctoRef() {
        return this.aacDoctoRef;    
    }
    
    /**
     * Set aacEstConcluidos value.
     *
     * @param aacEstConcluidos java.lang.String
     */
    public void setAacEstConcluidos(java.lang.String aacEstConcluidos){
        this.aacEstConcluidos = aacEstConcluidos;
    }
    
    /**
     * Get aacEstConcluidos value.
     *
     * @return java.lang.String
     */
    public java.lang.String getAacEstConcluidos() {
        return this.aacEstConcluidos;    
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
     * Set idInstEducat value.
     *
     * @param idInstEducat int
     */
    public void setIdInstEducat(int idInstEducat){
        this.idInstEducat = idInstEducat;
    }
    
    /**
     * Get idInstEducat value.
     *
     * @return int
     */
    public int getIdInstEducat() {
        return this.idInstEducat;    
    }
    
    /**
     * Set idNivelEscolar value.
     *
     * @param idNivelEscolar int
     */
    public void setIdNivelEscolar(int idNivelEscolar){
        this.idNivelEscolar = idNivelEscolar;
    }
    
    /**
     * Get idNivelEscolar value.
     *
     * @return int
     */
    public int getIdNivelEscolar() {
        return this.idNivelEscolar;    
    }
    
    /**
     * Set idProfCarrera value.
     *
     * @param idProfCarrera float
     */
    public void setIdProfCarrera(float idProfCarrera){
        this.idProfCarrera = idProfCarrera;
    }
    
    /**
     * Get idProfCarrera value.
     *
     * @return float
     */
    public float getIdProfCarrera() {
        return this.idProfCarrera;    
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
     * Set aacCedProfesional value.
     *
     * @param aacCedProfesional java.lang.Integer
     */
    public void setAacCedProfesional(java.lang.Integer aacCedProfesional){
        this.aacCedProfesional = aacCedProfesional;
    }
    
    /**
     * Get aacCedProfesional value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getAacCedProfesional() {
        return this.aacCedProfesional;    
    }
    
    /**
     * Set aacPromedio value.
     *
     * @param aacPromedio java.lang.Float
     */
    public void setAacPromedio(java.lang.Float aacPromedio){
        this.aacPromedio = aacPromedio;
    }
    
    /**
     * Get aacPromedio value.
     *
     * @return java.lang.Float
     */
    public java.lang.Float getAacPromedio() {
        return this.aacPromedio;    
    }


}