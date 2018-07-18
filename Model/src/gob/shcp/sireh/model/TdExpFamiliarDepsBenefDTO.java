package gob.shcp.sireh.model;

import gob.shcp.fsn.model.Model;

import org.springmodules.validation.bean.conf.loader.annotation.handler.NotNull;
import org.springmodules.validation.bean.conf.loader.annotation.handler.NotBlank;
import org.springmodules.validation.bean.conf.loader.annotation.handler.MaxLength;

/**
 * Model object for transporting TdExpFamiliarDepsBenef data.
 */
public class TdExpFamiliarDepsBenefDTO implements java.io.Serializable, Model {

    private java.lang.Integer fdbSecuencia;
    @NotBlank(errorCode = "not.null")
    @MaxLength(20)
    private java.lang.String idDocto;
    @NotBlank(errorCode = "not.null")
    @MaxLength(52)
    private java.lang.String rfcEmpleado;
    @NotNull
    private int idExpRechazo;
    @NotNull
    private java.util.Date fdbFechaNacimiento;
    @NotBlank(errorCode = "not.null")
    @NotNull
    @MaxLength(160)
    private java.lang.String fdbNombreEmpleado;
    @NotNull
    private java.util.Date fecModifico;
    @NotBlank(errorCode = "not.null")
    @NotNull
    @MaxLength(4)
    private java.lang.String idGenero;
    @NotNull
    private int idNivelEscolar;
    @NotNull
    private int idParentesco;
    @NotBlank(errorCode = "not.null")
    @NotNull
    @MaxLength(12)
    private java.lang.String idStatus;
    @NotBlank(errorCode = "not.null")
    @NotNull
    @MaxLength(120)
    private java.lang.String usuario;
    @MaxLength(400)
    private java.lang.String fdbDoctoRef;
    @MaxLength(160)
    private java.lang.String fdbPrimerApellido;
    private Double fdbPromedio;
    @MaxLength(160)
    private java.lang.String fdbSegundoApellido;

    /**
     * Constructor for TdExpFamiliarDepsBenefDTO class.
     */
    public TdExpFamiliarDepsBenefDTO() {
    }

    /**
     * Constructor for TdExpFamiliarDepsBenefDTO class.
     *
     * @param fdbSecuencia java.lang.Integer
     * @param idDocto java.lang.String
     * @param rfcEmpleado java.lang.String
     * @param idExpRechazo int
     * @param fdbFechaNacimiento java.util.Date
     * @param fdbNombreEmpleado java.lang.String
     * @param fecModifico java.util.Date
     * @param idGenero java.lang.String
     * @param idNivelEscolar int
     * @param idParentesco int
     * @param idStatus java.lang.String
     * @param usuario java.lang.String
     * @param fdbDoctoRef java.lang.String
     * @param fdbPrimerApellido java.lang.String
     * @param fdbPromedio Double
     * @param fdbSegundoApellido java.lang.String
     */
    public TdExpFamiliarDepsBenefDTO(java.lang.Integer fdbSecuencia, java.lang.String idDocto, 
                                     java.lang.String rfcEmpleado, int idExpRechazo, java.util.Date fdbFechaNacimiento, 
                                     java.lang.String fdbNombreEmpleado, java.util.Date fecModifico, 
                                     java.lang.String idGenero, int idNivelEscolar, int idParentesco, 
                                     java.lang.String idStatus, java.lang.String usuario, java.lang.String fdbDoctoRef, 
                                     java.lang.String fdbPrimerApellido, Double fdbPromedio, 
                                     java.lang.String fdbSegundoApellido) {
        this.fdbSecuencia = fdbSecuencia;
        this.idDocto = idDocto;
        this.rfcEmpleado = rfcEmpleado;
        this.idExpRechazo = idExpRechazo;
        this.fdbFechaNacimiento = fdbFechaNacimiento;
        this.fdbNombreEmpleado = fdbNombreEmpleado;
        this.fecModifico = fecModifico;
        this.idGenero = idGenero;
        this.idNivelEscolar = idNivelEscolar;
        this.idParentesco = idParentesco;
        this.idStatus = idStatus;
        this.usuario = usuario;
        this.fdbDoctoRef = fdbDoctoRef;
        this.fdbPrimerApellido = fdbPrimerApellido;
        this.fdbPromedio = fdbPromedio;
        this.fdbSegundoApellido = fdbSegundoApellido;
    }

    /**
     * Set fdbSecuencia value.
     *
     * @param fdbSecuencia java.lang.Integer
     */
    public void setFdbSecuencia(java.lang.Integer fdbSecuencia) {
        this.fdbSecuencia = fdbSecuencia;
    }

    /**
     * Get fdbSecuencia value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getFdbSecuencia() {
        return this.fdbSecuencia;
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
     * Set fdbFechaNacimiento value.
     *
     * @param fdbFechaNacimiento java.util.Date
     */
    public void setFdbFechaNacimiento(java.util.Date fdbFechaNacimiento) {
        this.fdbFechaNacimiento = fdbFechaNacimiento;
    }

    /**
     * Get fdbFechaNacimiento value.
     *
     * @return java.util.Date
     */
    public java.util.Date getFdbFechaNacimiento() {
        return this.fdbFechaNacimiento;
    }

    /**
     * Set fdbNombreEmpleado value.
     *
     * @param fdbNombreEmpleado java.lang.String
     */
    public void setFdbNombreEmpleado(java.lang.String fdbNombreEmpleado) {
        this.fdbNombreEmpleado = fdbNombreEmpleado;
    }

    /**
     * Get fdbNombreEmpleado value.
     *
     * @return java.lang.String
     */
    public java.lang.String getFdbNombreEmpleado() {
        return this.fdbNombreEmpleado;
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
     * Set idGenero value.
     *
     * @param idGenero java.lang.String
     */
    public void setIdGenero(java.lang.String idGenero) {
        this.idGenero = idGenero;
    }

    /**
     * Get idGenero value.
     *
     * @return java.lang.String
     */
    public java.lang.String getIdGenero() {
        return this.idGenero;
    }

    /**
     * Set idNivelEscolar value.
     *
     * @param idNivelEscolar int
     */
    public void setIdNivelEscolar(int idNivelEscolar) {
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
     * Set fdbDoctoRef value.
     *
     * @param fdbDoctoRef java.lang.String
     */
    public void setFdbDoctoRef(java.lang.String fdbDoctoRef) {
        this.fdbDoctoRef = fdbDoctoRef;
    }

    /**
     * Get fdbDoctoRef value.
     *
     * @return java.lang.String
     */
    public java.lang.String getFdbDoctoRef() {
        return this.fdbDoctoRef;
    }

    /**
     * Set fdbPrimerApellido value.
     *
     * @param fdbPrimerApellido java.lang.String
     */
    public void setFdbPrimerApellido(java.lang.String fdbPrimerApellido) {
        this.fdbPrimerApellido = fdbPrimerApellido;
    }

    /**
     * Get fdbPrimerApellido value.
     *
     * @return java.lang.String
     */
    public java.lang.String getFdbPrimerApellido() {
        return this.fdbPrimerApellido;
    }

    /**
     * Set fdbPromedio value.
     *
     * @param fdbPromedio Double
     */
     public void setFdbPromedio(Double fdbPromedio) {
         this.fdbPromedio = fdbPromedio;
     }

    /**
     * Get fdbPromedio value.
     *
     * @return double
     */
     public Double getFdbPromedio() {
         return fdbPromedio;
     }

    /**
     * Set fdbSegundoApellido value.
     *
     * @param fdbSegundoApellido java.lang.String
     */
    public void setFdbSegundoApellido(java.lang.String fdbSegundoApellido) {
        this.fdbSegundoApellido = fdbSegundoApellido;
    }

    /**
     * Get fdbSegundoApellido value.
     *
     * @return java.lang.String
     */
    public java.lang.String getFdbSegundoApellido() {
        return this.fdbSegundoApellido;
    }


}
