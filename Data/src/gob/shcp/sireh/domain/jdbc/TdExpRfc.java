package gob.shcp.sireh.domain.jdbc;

import gob.shcp.fsn.data.Domain;

import java.io.Serializable;

/**
 * Domain object for persistent TdExpRfc data.
 */
public class TdExpRfc implements Domain, Serializable {
    private TdExpRfcPK idComposite;
    private int idExpRechazo;
    private java.util.Date fecModifico;
    private java.lang.String idStatus;
    private java.lang.String rfcClave;
    private java.lang.String rfcDoctoRef;
    private java.lang.String usuario;
    private java.lang.String rfcFolio;

    /**
     * Constructor for TdExpRfc class.
     */
    public TdExpRfc() {
    }

    /**
     * Constructor for TdExpRfc class.
     *
     * @param idDocto java.lang.String
     * @param rfcEmpleado java.lang.String
     * @param rfcSecuencia java.lang.Integer
     * @param idExpRechazo int
     * @param fecModifico java.util.Date
     * @param idStatus java.lang.String
     * @param rfcClave java.lang.String
     * @param rfcDoctoRef java.lang.String
     * @param usuario java.lang.String
     * @param rfcFolio java.lang.String
     */
    public TdExpRfc(TdExpRfcPK idComposite, int idExpRechazo, 
                    java.util.Date fecModifico, java.lang.String idStatus, 
                    java.lang.String rfcClave, java.lang.String rfcDoctoRef, 
                    java.lang.String usuario, java.lang.String rfcFolio) {
        this.idComposite = idComposite;
        this.idExpRechazo = idExpRechazo;
        this.fecModifico = fecModifico;
        this.idStatus = idStatus;
        this.rfcClave = rfcClave;
        this.rfcDoctoRef = rfcDoctoRef;
        this.usuario = usuario;
        this.rfcFolio = rfcFolio;
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
     * Get rfcSecuencia value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getRfcSecuencia() {
        if (idComposite == null) {
            return null;
        }
        return this.idComposite.getRfcSecuencia();
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
     * Get rfcClave value.
     *
     * @return java.lang.String
     */
    public java.lang.String getRfcClave() {
        return this.rfcClave;
    }

    /**
     * Get rfcDoctoRef value.
     *
     * @return java.lang.String
     */
    public java.lang.String getRfcDoctoRef() {
        return this.rfcDoctoRef;
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
     * Get rfcFolio value.
     *
     * @return java.lang.String
     */
    public java.lang.String getRfcFolio() {
        return this.rfcFolio;
    }

    /**
     * Set idDocto value.
     *
     * @param idDocto java.lang.String
     */
    public void setIdDocto(java.lang.String idDocto) {
        if (idComposite == null) {
            idComposite = new TdExpRfcPK();
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
            idComposite = new TdExpRfcPK();
        }
        this.idComposite.setRfcEmpleado(rfcEmpleado);
    }

    /**
     * Set rfcSecuencia value.
     *
     * @param rfcSecuencia java.lang.Integer
     */
    public void setRfcSecuencia(java.lang.Integer rfcSecuencia) {
        if (idComposite == null) {
            idComposite = new TdExpRfcPK();
        }
        this.idComposite.setRfcSecuencia(rfcSecuencia);
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
     * Set rfcClave value.
     *
     * @param rfcClave java.lang.String
     */
    public void setRfcClave(java.lang.String rfcClave) {
        this.rfcClave = rfcClave;
    }

    /**
     * Set rfcDoctoRef value.
     *
     * @param rfcDoctoRef java.lang.String
     */
    public void setRfcDoctoRef(java.lang.String rfcDoctoRef) {
        this.rfcDoctoRef = rfcDoctoRef;
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
     * Set rfcFolio value.
     *
     * @param rfcFolio java.lang.String
     */
    public void setRfcFolio(java.lang.String rfcFolio) {
        this.rfcFolio = rfcFolio;
    }

    /**
     * Set identity value.
     *
     * @param idComposite Serializable
     */
    public void setIdentity(Serializable idComposite) {
        this.idComposite = (TdExpRfcPK)idComposite;
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
