package gob.shcp.sireh.model.spc.registro;

import gob.shcp.fsn.model.Model;

import org.springmodules.validation.bean.conf.loader.annotation.handler.NotNull;
import org.springmodules.validation.bean.conf.loader.annotation.handler.NotBlank;
import org.springmodules.validation.bean.conf.loader.annotation.handler.MaxLength;

/**
 * Model object for transporting TcCapInstructor data.
 */
public class TcCapInstructorDTO implements java.io.Serializable, Model {

    private java.lang.Integer idInstructor;
    @NotBlank(errorCode = "not.null")
    @NotNull
    @MaxLength(24)
    private java.lang.String idProveedor;
    @NotNull
    private java.util.Date fecModifico;
    @NotBlank(errorCode = "not.null")
    @NotNull
    @MaxLength(12)
    private java.lang.String idStatus;
    @NotBlank(errorCode = "not.null")
    @NotNull
    @MaxLength(240)
    private java.lang.String nombreInstructor;
    @NotBlank(errorCode = "not.null")
    @NotNull
    @MaxLength(120)
    private java.lang.String usuario;
    @MaxLength(400)
    private java.lang.String cargoInstructor;
    @MaxLength(240)
    private java.lang.String primerApellido;
    @MaxLength(240)
    private java.lang.String segundoApellido;

    /**
     * Constructor for TcCapInstructorDTO class.
     */
    public TcCapInstructorDTO() {
    }
    
    /**
     * Constructor for TcCapInstructorDTO class.
     *
     * @param idInstructor java.lang.Integer
     * @param idProveedor java.lang.String
     * @param fecModifico java.util.Date
     * @param idStatus java.lang.String
     * @param nombreInstructor java.lang.String
     * @param usuario java.lang.String
     * @param cargoInstructor java.lang.String
     * @param primerApellido java.lang.String
     * @param segundoApellido java.lang.String
     */
    public TcCapInstructorDTO(java.lang.Integer idInstructor, java.lang.String idProveedor, java.util.Date fecModifico, 
                              java.lang.String idStatus, java.lang.String nombreInstructor, java.lang.String usuario, 
                              java.lang.String cargoInstructor, java.lang.String primerApellido, 
                              java.lang.String segundoApellido) {
        this.idInstructor = idInstructor;
        this.idProveedor = idProveedor;
        this.fecModifico = fecModifico;
        this.idStatus = idStatus;
        this.nombreInstructor = nombreInstructor;
        this.usuario = usuario;
        this.cargoInstructor = cargoInstructor;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
    }
    
    /**
     * Set idInstructor value.
     *
     * @param idInstructor java.lang.Integer
     */
    public void setIdInstructor(java.lang.Integer idInstructor) {
        this.idInstructor = idInstructor;
    }

    /**
     * Get idInstructor value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getIdInstructor() {
        return this.idInstructor;
    }

    /**
     * Set idProveedor value.
     *
     * @param idProveedor java.lang.String
     */
    public void setIdProveedor(java.lang.String idProveedor) {
        this.idProveedor = idProveedor;
    }

    /**
     * Get idProveedor value.
     *
     * @return java.lang.String
     */
    public java.lang.String getIdProveedor() {
        return this.idProveedor;
    }

    /**
     * Set fecModifico value.
     *
     * @param fecModifico java.util.Date
     */
    public void setFecModifico(java.util.Date fecModifico) {
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
    public void setIdStatus(java.lang.String idStatus) {
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
     * Set nombreInstructor value.
     *
     * @param nombreInstructor java.lang.String
     */
    public void setNombreInstructor(java.lang.String nombreInstructor) {
        this.nombreInstructor = nombreInstructor;
    }

    /**
     * Get nombreInstructor value.
     *
     * @return java.lang.String
     */
    public java.lang.String getNombreInstructor() {
        return this.nombreInstructor;
    }

    /**
     * Set usuario value.
     *
     * @param usuario java.lang.String
     */
    public void setUsuario(java.lang.String usuario) {
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
     * Set cargoInstructor value.
     *
     * @param cargoInstructor java.lang.String
     */
    public void setCargoInstructor(java.lang.String cargoInstructor) {
        this.cargoInstructor = cargoInstructor;
    }

    /**
     * Get cargoInstructor value.
     *
     * @return java.lang.String
     */
    public java.lang.String getCargoInstructor() {
        return this.cargoInstructor;
    }

    /**
     * Set primerApellido value.
     *
     * @param primerApellido java.lang.String
     */
    public void setPrimerApellido(java.lang.String primerApellido) {
        this.primerApellido = primerApellido;
    }

    /**
     * Get primerApellido value.
     *
     * @return java.lang.String
     */
    public java.lang.String getPrimerApellido() {
        return this.primerApellido;
    }

    /**
     * Set segundoApellido value.
     *
     * @param segundoApellido java.lang.String
     */
    public void setSegundoApellido(java.lang.String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }

    /**
     * Get segundoApellido value.
     *
     * @return java.lang.String
     */
    public java.lang.String getSegundoApellido() {
        return this.segundoApellido;
    }
}
