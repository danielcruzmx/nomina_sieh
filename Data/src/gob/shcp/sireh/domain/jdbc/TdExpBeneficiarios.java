package gob.shcp.sireh.domain.jdbc;

import gob.shcp.fsn.data.Domain;

import java.io.Serializable;

/**
 * Domain object for persistent TdExpBeneficiario data.
 */
public class TdExpBeneficiarios implements Domain, Serializable {
    private TdExpBeneficiariosPK idComposite;
    private int idExpRechazo;
    private java.lang.String benDoctoRef;
    private java.lang.String benNombreEmpleado;
    private java.util.Date fecModifico;
    private int idParentesco;
    private java.lang.String idStatus;
    private java.lang.String idTipoBeneficio;
    private java.lang.String usuario;
    private double benImporte;
    private double benPorcentaje;
    private java.lang.String benPrimerApellido;
    private java.lang.String benSegundoApellido;

    /**
     * Constructor for TdExpBeneficiario class.
     */
    public TdExpBeneficiarios() {
    }

    /**
     * Constructor for TdExpBeneficiario class.
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
    public TdExpBeneficiarios(TdExpBeneficiariosPK idComposite, 
                              int idExpRechazo, java.lang.String benDoctoRef, 
                              java.lang.String benNombreEmpleado, 
                              java.util.Date fecModifico, int idParentesco, 
                              java.lang.String idStatus, 
                              java.lang.String idTipoBeneficio, 
                              java.lang.String usuario, double benImporte, 
                              double benPorcentaje, 
                              java.lang.String benPrimerApellido, 
                              java.lang.String benSegundoApellido) {
        this.idComposite = idComposite;
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
     * Get benSecuencia value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getBenSecuencia() {
        if (idComposite == null) {
            return null;
        }
        return this.idComposite.getBenSecuencia();
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
     * Get benDoctoRef value.
     *
     * @return java.lang.String
     */
    public java.lang.String getBenDoctoRef() {
        return this.benDoctoRef;
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
     * Get idStatus value.
     *
     * @return java.lang.String
     */
    public java.lang.String getIdStatus() {
        return this.idStatus;
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
     * Get usuario value.
     *
     * @return java.lang.String
     */
    public java.lang.String getUsuario() {
        return this.usuario;
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
     * Get benPorcentaje value.
     *
     * @return double
     */
    public double getBenPorcentaje() {
        return this.benPorcentaje;
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
     * Get benSegundoApellido value.
     *
     * @return java.lang.String
     */
    public java.lang.String getBenSegundoApellido() {
        return this.benSegundoApellido;
    }

    /**
     * Set benSecuencia value.
     *
     * @param benSecuencia java.lang.Integer
     */
    public void setBenSecuencia(java.lang.Integer benSecuencia) {
        if (idComposite == null) {
            idComposite = new TdExpBeneficiariosPK();
        }
        this.idComposite.setBenSecuencia(benSecuencia);
    }

    /**
     * Set idDocto value.
     *
     * @param idDocto java.lang.String
     */
    public void setIdDocto(java.lang.String idDocto) {
        if (idComposite == null) {
            idComposite = new TdExpBeneficiariosPK();
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
            idComposite = new TdExpBeneficiariosPK();
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
     * Set benDoctoRef value.
     *
     * @param benDoctoRef java.lang.String
     */
    public void setBenDoctoRef(java.lang.String benDoctoRef) {
        this.benDoctoRef = benDoctoRef;
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
     * Set idStatus value.
     *
     * @param idStatus java.lang.String
     */
    public void setIdStatus(java.lang.String idStatus) {
        this.idStatus = idStatus;
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
     * Set usuario value.
     *
     * @param usuario java.lang.String
     */
    public void setUsuario(java.lang.String usuario) {
        this.usuario = usuario;
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
     * Set benPorcentaje value.
     *
     * @param benPorcentaje double
     */
    public void setBenPorcentaje(double benPorcentaje) {
        this.benPorcentaje = benPorcentaje;
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
     * Set benSegundoApellido value.
     *
     * @param benSegundoApellido java.lang.String
     */
    public void setBenSegundoApellido(java.lang.String benSegundoApellido) {
        this.benSegundoApellido = benSegundoApellido;
    }

    /**
     * Set identity value.
     *
     * @param idComposite Serializable
     */
    public void setIdentity(Serializable idComposite) {
        this.idComposite = (TdExpBeneficiariosPK)idComposite;
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
