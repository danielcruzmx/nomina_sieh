package gob.shcp.sireh.domain.jdbc.spc;

import gob.shcp.fsn.data.Domain;
import gob.shcp.fsn.data.annotation.PrimaryKey;

import java.io.Serializable;

/**
 * Domain object for persistent TcCapInstructor data.
 */
public class TcCapInstructor implements Domain, Serializable {
    @PrimaryKey
    private java.lang.Integer idInstructor;
    private java.lang.String idProveedor;
    private java.util.Date fecModifico;
    private java.lang.String idStatus;
    private java.lang.String nombreInstructor;
    private java.lang.String usuario;
    private java.lang.String cargoInstructor;
    private java.lang.String primerApellido;
    private java.lang.String segundoApellido;

    /**
     * Constructor for TcCapInstructor class.
     */
    public TcCapInstructor() {
    }

    /**
     * Constructor for TcCapInstructor class.
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
    public TcCapInstructor(java.lang.Integer idInstructor, java.lang.String idProveedor, java.util.Date fecModifico, 
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
     * Get idInstructor value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getIdInstructor() {
        return this.idInstructor;
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
     * Get fecModifico value.
     *
     * @return java.util.Date
     */
    public java.util.Date getFecModifico() {
        return this.fecModifico;
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
     * Get nombreInstructor value.
     *
     * @return java.lang.String
     */
    public java.lang.String getNombreInstructor() {
        return this.nombreInstructor;
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
     * Get cargoInstructor value.
     *
     * @return java.lang.String
     */
    public java.lang.String getCargoInstructor() {
        return this.cargoInstructor;
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
     * Get segundoApellido value.
     *
     * @return java.lang.String
     */
    public java.lang.String getSegundoApellido() {
        return this.segundoApellido;
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
     * Set idProveedor value.
     *
     * @param idProveedor java.lang.String
     */
    public void setIdProveedor(java.lang.String idProveedor) {
        this.idProveedor = idProveedor;
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
     * Set idStatus value.
     *
     * @param idStatus java.lang.String
     */
    public void setIdStatus(java.lang.String idStatus) {
        this.idStatus = idStatus;
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
     * Set usuario value.
     *
     * @param usuario java.lang.String
     */
    public void setUsuario(java.lang.String usuario) {
        this.usuario = usuario;
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
     * Set primerApellido value.
     *
     * @param primerApellido java.lang.String
     */
    public void setPrimerApellido(java.lang.String primerApellido) {
        this.primerApellido = primerApellido;
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
     * Set identity value.
     *
     * @param idInstructor Serializable
     */
    public void setIdentity(Serializable idInstructor) {
        this.idInstructor = (java.lang.Integer)idInstructor;
    }

    /**
     * Get identity value.
     *
     * @return Serializable
     */
    public Serializable getIdentity() {
        return this.idInstructor;
    }
}
