package gob.shcp.sireh.domain.jdbc;

import gob.shcp.fsn.data.Domain;

import java.io.Serializable;

/**
 * Domain object for persistent TdExpFamiliarDepsBenef data.
 */
public class TdExpFamiliarDepsBenef implements Domain, Serializable {
    private TdExpFamiliarDepsBenefPK idComposite;
    private int idExpRechazo;
    private java.util.Date fdbFechaNacimiento;
    private java.lang.String fdbNombreEmpleado;
    private java.util.Date fecModifico;
    private java.lang.String idGenero;
    private Integer idNivelEscolar;
    private int idParentesco;
    private java.lang.String idStatus;
    private java.lang.String usuario;
    private java.lang.String fdbDoctoRef;
    private java.lang.String fdbPrimerApellido;
    private double fdbPromedio;
    private java.lang.String fdbSegundoApellido;

    /**
     * Constructor for TdExpFamiliarDepsBenef class.
     */
    public TdExpFamiliarDepsBenef() {
    }

    /**
     * Constructor for TdExpFamiliarDepsBenef class.
     *
     * @param fdbSecuencia java.lang.Integer
     * @param idDocto java.lang.String
     * @param rfcEmpleado java.lang.String
     * @param idExpRechazo int
     * @param fdbFechaNacimiento java.util.Date
     * @param fdbNombreEmpleado java.lang.String
     * @param fecModifico java.util.Date
     * @param idGenero java.lang.String
     * @param idNivelEscolar Integer
     * @param idParentesco int
     * @param idStatus java.lang.String
     * @param usuario java.lang.String
     * @param fdbDoctoRef java.lang.String
     * @param fdbPrimerApellido java.lang.String
     * @param fdbPromedio double
     * @param fdbSegundoApellido java.lang.String
     */
    public TdExpFamiliarDepsBenef(TdExpFamiliarDepsBenefPK idComposite, 
                                  int idExpRechazo, 
                                  java.util.Date fdbFechaNacimiento, 
                                  java.lang.String fdbNombreEmpleado, 
                                  java.util.Date fecModifico, 
                                  java.lang.String idGenero, 
                                  Integer idNivelEscolar, int idParentesco, 
                                  java.lang.String idStatus, 
                                  java.lang.String usuario, 
                                  java.lang.String fdbDoctoRef, 
                                  java.lang.String fdbPrimerApellido, 
                                  double fdbPromedio, 
                                  java.lang.String fdbSegundoApellido) {
        this.idComposite = idComposite;
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
     * Get fdbSecuencia value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getFdbSecuencia() {
        if (idComposite == null) {
            return null;
        }
        return this.idComposite.getFdbSecuencia();
    }

    /**
     * Get idDocto value.
     *
     * @return java.lang.String
     */
    public java.lang.String getIdDocto() {
        if (idComposite == null) {
            return null;
        }
        return this.idComposite.getIdDocto();
    }

    /**
     * Get rfcEmpleado value.
     *
     * @return java.lang.String
     */
    public java.lang.String getRfcEmpleado() {
        if (idComposite == null) {
            return null;
        }
        return this.idComposite.getRfcEmpleado();
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
     * Get fdbFechaNacimiento value.
     *
     * @return java.util.Date
     */
    public java.util.Date getFdbFechaNacimiento() {
        return this.fdbFechaNacimiento;
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
     * Get fecModifico value.
     *
     * @return java.util.Date
     */
    public java.util.Date getFecModifico() {
        return this.fecModifico;
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
     * Get idNivelEscolar value.
     *
     * @return Integer
     */
    public Integer getIdNivelEscolar() {
        return this.idNivelEscolar;
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
     * Get idStatus value.
     *
     * @return java.lang.String
     */
    public java.lang.String getIdStatus() {
        return this.idStatus;
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
     * Get fdbDoctoRef value.
     *
     * @return java.lang.String
     */
    public java.lang.String getFdbDoctoRef() {
        return this.fdbDoctoRef;
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
     * Get fdbPromedio value.
     *
     * @return double
     */
    public double getFdbPromedio() {
        return this.fdbPromedio;
    }

    /**
     * Get fdbSegundoApellido value.
     *
     * @return java.lang.String
     */
    public java.lang.String getFdbSegundoApellido() {
        return this.fdbSegundoApellido;
    }

    /**
     * Set fdbSecuencia value.
     *
     * @param fdbSecuencia java.lang.Integer
     */
    public void setFdbSecuencia(java.lang.Integer fdbSecuencia) {
        if (idComposite == null) {
            idComposite = new TdExpFamiliarDepsBenefPK();
        }
        this.idComposite.setFdbSecuencia(fdbSecuencia);
    }

    /**
     * Set idDocto value.
     *
     * @param idDocto java.lang.String
     */
    public void setIdDocto(java.lang.String idDocto) {
        if (idComposite == null) {
            idComposite = new TdExpFamiliarDepsBenefPK();
        }
        this.idComposite.setIdDocto(idDocto);
    }

    /**
     * Set rfcEmpleado value.
     *
     * @param rfcEmpleado java.lang.String
     */
    public void setRfcEmpleado(java.lang.String rfcEmpleado) {
        if (idComposite == null) {
            idComposite = new TdExpFamiliarDepsBenefPK();
        }
        this.idComposite.setRfcEmpleado(rfcEmpleado);
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
     * Set fdbFechaNacimiento value.
     *
     * @param fdbFechaNacimiento java.util.Date
     */
    public void setFdbFechaNacimiento(java.util.Date fdbFechaNacimiento) {
        this.fdbFechaNacimiento = fdbFechaNacimiento;
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
     * Set fecModifico value.
     *
     * @param fecModifico java.util.Date
     */
    public void setFecModifico(java.util.Date fecModifico) {
        this.fecModifico = fecModifico;
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
     * Set idNivelEscolar value.
     *
     * @param idNivelEscolar Integer
     */
    public void setIdNivelEscolar(Integer idNivelEscolar) {
        this.idNivelEscolar = idNivelEscolar;
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
     * Set idStatus value.
     *
     * @param idStatus java.lang.String
     */
    public void setIdStatus(java.lang.String idStatus) {
        this.idStatus = idStatus;
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
     * Set fdbDoctoRef value.
     *
     * @param fdbDoctoRef java.lang.String
     */
    public void setFdbDoctoRef(java.lang.String fdbDoctoRef) {
        this.fdbDoctoRef = fdbDoctoRef;
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
     * Set fdbPromedio value.
     *
     * @param fdbPromedio double
     */
    public void setFdbPromedio(double fdbPromedio) {
        this.fdbPromedio = fdbPromedio;
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
     * Set identity value.
     *
     * @param idComposite Serializable
     */
    public void setIdentity(Serializable idComposite) {
        this.idComposite = (TdExpFamiliarDepsBenefPK)idComposite;
    }

    /**
     * Get identity value.
     *
     * @return Serializable
     */
    public Serializable getIdentity() {
        return this.idComposite;
    }
}
