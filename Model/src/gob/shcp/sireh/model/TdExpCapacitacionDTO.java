package gob.shcp.sireh.model;

import gob.shcp.fsn.model.Model;

import org.springmodules.validation.bean.conf.loader.annotation.handler.NotNull;
import org.springmodules.validation.bean.conf.loader.annotation.handler.NotBlank;
import org.springmodules.validation.bean.conf.loader.annotation.handler.MaxLength;

/**
 * Model object for transporting TdExpCapacitacion data.
 */
public class TdExpCapacitacionDTO  implements java.io.Serializable, Model {    

    private java.lang.Integer capSecuencia;
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
    private java.lang.String capDescCapacitacion;
    @NotBlank(errorCode="not.null")
    @NotNull
    @MaxLength(400)    
    private java.lang.String capDoctoRef;
    @NotBlank(errorCode="not.null")
    @NotNull
    @MaxLength(8)    
    private java.lang.String capEstConcluidos;
    @NotNull
    private java.util.Date fecModifico;
    @NotBlank(errorCode="not.null")
    @NotNull
    @MaxLength(12)    
    private java.lang.String idCapacitacion;
    @NotNull
    private int idInstEducat;
    @NotBlank(errorCode="not.null")
    @NotNull
    @MaxLength(12)    
    private java.lang.String idStatus;
    @NotBlank(errorCode="not.null")
    @NotNull
    @MaxLength(120)    
    private java.lang.String usuario;
    private Double capPromedio;

    /**
     * Constructor for TdExpCapacitacionDTO class.
     */
    public TdExpCapacitacionDTO() { }    

                                                        
    /**
     * Constructor for TdExpCapacitacionDTO class.
     *
     * @param capSecuencia java.lang.Integer
     * @param idDocto java.lang.String
     * @param rfcEmpleado java.lang.String
     * @param idExpRechazo int
     * @param capDescCapacitacion java.lang.String
     * @param capDoctoRef java.lang.String
     * @param capEstConcluidos java.lang.String
     * @param fecModifico java.util.Date
     * @param idCapacitacion java.lang.String
     * @param idInstEducat int
     * @param idStatus java.lang.String
     * @param usuario java.lang.String
     * @param capPromedio java.lang.Float
     */
    public TdExpCapacitacionDTO( java.lang.Integer capSecuencia, java.lang.String idDocto, java.lang.String rfcEmpleado, int idExpRechazo, java.lang.String capDescCapacitacion, java.lang.String capDoctoRef, java.lang.String capEstConcluidos, java.util.Date fecModifico, java.lang.String idCapacitacion, int idInstEducat, java.lang.String idStatus, java.lang.String usuario, Double capPromedio){    
        this.capSecuencia = capSecuencia;
        this.idDocto = idDocto;
        this.rfcEmpleado = rfcEmpleado;
        this.idExpRechazo = idExpRechazo;
        this.capDescCapacitacion = capDescCapacitacion;
        this.capDoctoRef = capDoctoRef;
        this.capEstConcluidos = capEstConcluidos;
        this.fecModifico = fecModifico;
        this.idCapacitacion = idCapacitacion;
        this.idInstEducat = idInstEducat;
        this.idStatus = idStatus;
        this.usuario = usuario;
        this.capPromedio = capPromedio;
    }    

    
    /**
     * Set capSecuencia value.
     *
     * @param capSecuencia java.lang.Integer
     */
    public void setCapSecuencia(java.lang.Integer capSecuencia){
        this.capSecuencia = capSecuencia;
    }
    
    /**
     * Get capSecuencia value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getCapSecuencia() {
        return this.capSecuencia;    
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
     * Set capDescCapacitacion value.
     *
     * @param capDescCapacitacion java.lang.String
     */
    public void setCapDescCapacitacion(java.lang.String capDescCapacitacion){
        this.capDescCapacitacion = capDescCapacitacion;
    }
    
    /**
     * Get capDescCapacitacion value.
     *
     * @return java.lang.String
     */
    public java.lang.String getCapDescCapacitacion() {
        return this.capDescCapacitacion;    
    }
    
    /**
     * Set capDoctoRef value.
     *
     * @param capDoctoRef java.lang.String
     */
    public void setCapDoctoRef(java.lang.String capDoctoRef){
        this.capDoctoRef = capDoctoRef;
    }
    
    /**
     * Get capDoctoRef value.
     *
     * @return java.lang.String
     */
    public java.lang.String getCapDoctoRef() {
        return this.capDoctoRef;    
    }
    
    /**
     * Set capEstConcluidos value.
     *
     * @param capEstConcluidos java.lang.String
     */
    public void setCapEstConcluidos(java.lang.String capEstConcluidos){
        this.capEstConcluidos = capEstConcluidos;
    }
    
    /**
     * Get capEstConcluidos value.
     *
     * @return java.lang.String
     */
    public java.lang.String getCapEstConcluidos() {
        return this.capEstConcluidos;    
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
     * Set idCapacitacion value.
     *
     * @param idCapacitacion java.lang.String
     */
    public void setIdCapacitacion(java.lang.String idCapacitacion){
        this.idCapacitacion = idCapacitacion;
    }
    
    /**
     * Get idCapacitacion value.
     *
     * @return java.lang.String
     */
    public java.lang.String getIdCapacitacion() {
        return this.idCapacitacion;    
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


    public void setCapPromedio(Double capPromedio) {
        this.capPromedio = capPromedio;
    }

    public Double getCapPromedio() {
        return capPromedio;
    }
}
