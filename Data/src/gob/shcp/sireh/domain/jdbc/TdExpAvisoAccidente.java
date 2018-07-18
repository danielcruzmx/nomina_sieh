package gob.shcp.sireh.domain.jdbc;

import gob.shcp.fsn.data.Domain;

import gob.shcp.fsn.data.annotation.PrimaryKey;

import java.io.Serializable;

/**
 * Domain object for persistent TdExpAvisoAccidente data.
 */
public class TdExpAvisoAccidente implements Domain, Serializable {
    @PrimaryKey
    private java.lang.String rfcEmpleado;
    private java.lang.String accNombreEmpleado;
    private int accSecuencia;
    private java.lang.String accTelefono1;
    private java.lang.String accTelefono2;
    private java.util.Date fecModifico;
    private int idParentesco;
    private java.lang.String usuario;
    private java.lang.String accPrimerApellido;
    private java.lang.String accSegundoApellido;

    /**
     * Constructor for TdExpAvisoAccidente class.
     */
    public TdExpAvisoAccidente() {
    }

    /**
     * Constructor for TdExpAvisoAccidente class.
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
    public TdExpAvisoAccidente(java.lang.String rfcEmpleado, 
                               java.lang.String accNombreEmpleado, 
                               int accSecuencia, java.lang.String accTelefono1, 
                               java.lang.String accTelefono2, 
                               java.util.Date fecModifico, int idParentesco, 
                               java.lang.String usuario, 
                               java.lang.String accPrimerApellido, 
                               java.lang.String accSegundoApellido) {
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
     * Get rfcEmpleado value.
     *
     * @return java.lang.String
     */
    public java.lang.String getRfcEmpleado() {
        return this.rfcEmpleado;
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
     * Get accSecuencia value.
     *
     * @return int
     */
    public int getAccSecuencia() {
        return this.accSecuencia;
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
     * Get accTelefono2 value.
     *
     * @return java.lang.String
     */
    public java.lang.String getAccTelefono2() {
        return this.accTelefono2;
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
     * Get idParentesco value.
     *
     * @return int
     */
    public int getIdParentesco() {
        return this.idParentesco;
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
     * Get accPrimerApellido value.
     *
     * @return java.lang.String
     */
    public java.lang.String getAccPrimerApellido() {
        return this.accPrimerApellido;
    }

    /**
     * Get accSegundoApellido value.
     *
     * @return java.lang.String
     */
    public java.lang.String getAccSegundoApellido() {
        return this.accSegundoApellido;
    }

    /**
     * Set rfcEmpleado value.
     *
     * @param rfcEmpleado java.lang.String
     */
    public void setRfcEmpleado(java.lang.String rfcEmpleado) {
        this.rfcEmpleado = rfcEmpleado;
    }

    /**
     * Set accNombreEmpleado value.
     *
     * @param accNombreEmpleado java.lang.String
     */
    public void setAccNombreEmpleado(java.lang.String accNombreEmpleado) {
        this.accNombreEmpleado = accNombreEmpleado;
    }

    /**
     * Set accSecuencia value.
     *
     * @param accSecuencia int
     */
    public void setAccSecuencia(int accSecuencia) {
        this.accSecuencia = accSecuencia;
    }

    /**
     * Set accTelefono1 value.
     *
     * @param accTelefono1 java.lang.String
     */
    public void setAccTelefono1(java.lang.String accTelefono1) {
        this.accTelefono1 = accTelefono1;
    }

    /**
     * Set accTelefono2 value.
     *
     * @param accTelefono2 java.lang.String
     */
    public void setAccTelefono2(java.lang.String accTelefono2) {
        this.accTelefono2 = accTelefono2;
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
     * Set idParentesco value.
     *
     * @param idParentesco int
     */
    public void setIdParentesco(int idParentesco) {
        this.idParentesco = idParentesco;
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
     * Set accPrimerApellido value.
     *
     * @param accPrimerApellido java.lang.String
     */
    public void setAccPrimerApellido(java.lang.String accPrimerApellido) {
        this.accPrimerApellido = accPrimerApellido;
    }

    /**
     * Set accSegundoApellido value.
     *
     * @param accSegundoApellido java.lang.String
     */
    public void setAccSegundoApellido(java.lang.String accSegundoApellido) {
        this.accSegundoApellido = accSegundoApellido;
    }

    /**
     * Set identity value.
     *
     * @param rfcEmpleado Serializable
     */
    public void setIdentity(Serializable rfcEmpleado) {
        this.rfcEmpleado = (java.lang.String)rfcEmpleado;
    }

    /**
     * Get identity value.
     *
     * @return Serializable
     */
    public Serializable getIdentity() {
        return this.rfcEmpleado;
    }
}
