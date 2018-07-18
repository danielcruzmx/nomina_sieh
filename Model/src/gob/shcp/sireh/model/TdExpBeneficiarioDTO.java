package gob.shcp.sireh.model;

import gob.shcp.fsn.model.Model;

import org.springmodules.validation.bean.conf.loader.annotation.handler.NotNull;
import org.springmodules.validation.bean.conf.loader.annotation.handler.NotBlank;
import org.springmodules.validation.bean.conf.loader.annotation.handler.MaxLength;

/**
 * Model object for transporting TdExpBeneficiario data.
 */
public class TdExpBeneficiarioDTO implements java.io.Serializable, Model {

    private java.lang.Integer benSecuencia;
    @NotBlank(errorCode = "not.null")
    @MaxLength(20)
    private java.lang.String idDocto;
    @NotBlank(errorCode = "not.null")
    @MaxLength(52)
    private java.lang.String rfcEmpleado;
    @NotNull
    private int idExpRechazo;
    @NotBlank(errorCode = "not.null")
    @NotNull
    @MaxLength(400)
    private java.lang.String benDoctoRef;
    @NotBlank(errorCode = "not.null")
    @NotNull
    @MaxLength(160)
    private java.lang.String benNombreEmpleado;
    @NotNull
    private java.util.Date fecModifico;
    @NotNull
    private int idParentesco;
    @NotBlank(errorCode = "not.null")
    @NotNull
    @MaxLength(12)
    private java.lang.String idStatus;
    @NotBlank(errorCode = "not.null")
    @NotNull
    @MaxLength(8)
    private java.lang.String idTipoBeneficio;
    @NotBlank(errorCode = "not.null")
    @NotNull
    @MaxLength(120)
    private java.lang.String usuario;
    private double benImporte;
    private double benPorcentaje;
    @MaxLength(160)
    private java.lang.String benPrimerApellido;
    @MaxLength(160)
    private java.lang.String benSegundoApellido;

    /**
     * Constructor for TdExpBeneficiarioDTO class.
     */
    public TdExpBeneficiarioDTO() {
    }


    /**
     * Constructor for TdExpBeneficiarioDTO class.
     *
     * @param benSecuencia java.lang.Integer
     * @param idDocto java.lang.String
     * @param rfcEmpleado java.lang.String
     * @param idExpRechazo int
     * @param benDoctoRef java.lang.String
     * @param benNombreEmpleado java.lang.String
     * @param fecModifico java.util.Date
     * @param idParentesco int
     * @param idStatus java.lang.String
     * @param idTipoBeneficio java.lang.String
     * @param usuario java.lang.String
     * @param benImporte double
     * @param benPorcentaje double
     * @param benPrimerApellido java.lang.String
     * @param benSegundoApellido java.lang.String
     */
    public TdExpBeneficiarioDTO(java.lang.Integer benSecuencia, java.lang.String idDocto, java.lang.String rfcEmpleado, 
                                int idExpRechazo, java.lang.String benDoctoRef, java.lang.String benNombreEmpleado, 
                                java.util.Date fecModifico, int idParentesco, java.lang.String idStatus, 
                                java.lang.String idTipoBeneficio, java.lang.String usuario, double benImporte, 
                                double benPorcentaje, java.lang.String benPrimerApellido, 
                                java.lang.String benSegundoApellido) {
        this.benSecuencia = benSecuencia;
        this.idDocto = idDocto;
        this.rfcEmpleado = rfcEmpleado;
        this.idExpRechazo = idExpRechazo;
        this.benDoctoRef = benDoctoRef;
        this.benNombreEmpleado = benNombreEmpleado;
        this.fecModifico = fecModifico;
        this.idParentesco = idParentesco;
        this.idStatus = idStatus;
        this.idTipoBeneficio = idTipoBeneficio;
        this.usuario = usuario;
        this.benImporte = benImporte;
        this.benPorcentaje = benPorcentaje;
        this.benPrimerApellido = benPrimerApellido;
        this.benSegundoApellido = benSegundoApellido;
    }

    /**
     * Set benSecuencia value.
     *
     * @param benSecuencia java.lang.Integer
     */
    public void setBenSecuencia(java.lang.Integer benSecuencia) {
        this.benSecuencia = benSecuencia;
    }

    /**
     * Get benSecuencia value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getBenSecuencia() {
        return this.benSecuencia;
    }

    /**
     * Set idDocto value.
     *
     * @param idDocto java.lang.String
     */
    public void setIdDocto(java.lang.String idDocto) {
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
    public void setRfcEmpleado(java.lang.String rfcEmpleado) {
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
    public void setIdExpRechazo(int idExpRechazo) {
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
     * Set benDoctoRef value.
     *
     * @param benDoctoRef java.lang.String
     */
    public void setBenDoctoRef(java.lang.String benDoctoRef) {
        this.benDoctoRef = benDoctoRef;
    }

    /**
     * Get benDoctoRef value.
     *
     * @return java.lang.String
     */
    public java.lang.String getBenDoctoRef() {
        return this.benDoctoRef;
    }

    /**
     * Set benNombreEmpleado value.
     *
     * @param benNombreEmpleado java.lang.String
     */
    public void setBenNombreEmpleado(java.lang.String benNombreEmpleado) {
        this.benNombreEmpleado = benNombreEmpleado;
    }

    /**
     * Get benNombreEmpleado value.
     *
     * @return java.lang.String
     */
    public java.lang.String getBenNombreEmpleado() {
        return this.benNombreEmpleado;
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
     * Set idParentesco value.
     *
     * @param idParentesco int
     */
    public void setIdParentesco(int idParentesco) {
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
     * Set idTipoBeneficio value.
     *
     * @param idTipoBeneficio java.lang.String
     */
    public void setIdTipoBeneficio(java.lang.String idTipoBeneficio) {
        this.idTipoBeneficio = idTipoBeneficio;
    }

    /**
     * Get idTipoBeneficio value.
     *
     * @return java.lang.String
     */
    public java.lang.String getIdTipoBeneficio() {
        return this.idTipoBeneficio;
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
     * Set benImporte value.
     *
     * @param benImporte double
     */
    public void setBenImporte(double benImporte) {
        this.benImporte = benImporte;
    }

    /**
     * Get benImporte value.
     *
     * @return double
     */
    public double getBenImporte() {
        return this.benImporte;
    }

    /**
     * Set benPorcentaje value.
     *
     * @param benPorcentaje double
     */
    public void setBenPorcentaje(double benPorcentaje) {
        this.benPorcentaje = benPorcentaje;
    }

    /**
     * Get benPorcentaje value.
     *
     * @return double
     */
    public double getBenPorcentaje() {
        return this.benPorcentaje;
    }

    /**
     * Set benPrimerApellido value.
     *
     * @param benPrimerApellido java.lang.String
     */
    public void setBenPrimerApellido(java.lang.String benPrimerApellido) {
        this.benPrimerApellido = benPrimerApellido;
    }

    /**
     * Get benPrimerApellido value.
     *
     * @return java.lang.String
     */
    public java.lang.String getBenPrimerApellido() {
        return this.benPrimerApellido;
    }

    /**
     * Set benSegundoApellido value.
     *
     * @param benSegundoApellido java.lang.String
     */
    public void setBenSegundoApellido(java.lang.String benSegundoApellido) {
        this.benSegundoApellido = benSegundoApellido;
    }

    /**
     * Get benSegundoApellido value.
     *
     * @return java.lang.String
     */
    public java.lang.String getBenSegundoApellido() {
        return this.benSegundoApellido;
    }
}
