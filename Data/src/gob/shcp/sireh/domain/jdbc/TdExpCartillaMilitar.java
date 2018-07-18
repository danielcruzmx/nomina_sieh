package gob.shcp.sireh.domain.jdbc;

import gob.shcp.fsn.data.Domain;

import java.io.Serializable;

/**
 * Domain object for persistent TdExpCartillaMilitar data.
 */
public class TdExpCartillaMilitar implements Domain, Serializable {
    private TdExpCartillaMilitarPK idComposite;
    private java.lang.Integer idExpRechazo;
    private java.lang.String cmiDoctoRef;
    private java.lang.String cmiNumeroCartilla;
    private java.util.Date fecModifico;
    private java.lang.String idStatus;
    private java.lang.String usuario;
    private java.lang.String cmiFechaLiberacion;

    /**
     * Constructor for TdExpCartillaMilitar class.
     */
    public TdExpCartillaMilitar() {
    }

    /**
     * Constructor for TdExpCartillaMilitar class.
     *
     * @param cmiSecuencia java.lang.Integer
     * @param idDocto java.lang.String
     * @param rfcEmpleado java.lang.String
     * @param idExpRechazo java.lang.Integer
     * @param cmiDoctoRef java.lang.String
     * @param cmiNumeroCartilla java.lang.String
     * @param fecModifico java.util.Date
     * @param idStatus java.lang.String
     * @param usuario java.lang.String
     * @param cmiFechaLiberacion java.lang.String
     */
    public TdExpCartillaMilitar(TdExpCartillaMilitarPK idComposite, 
                                java.lang.Integer idExpRechazo, 
                                java.lang.String cmiDoctoRef, 
                                java.lang.String cmiNumeroCartilla, 
                                java.util.Date fecModifico, 
                                java.lang.String idStatus, 
                                java.lang.String usuario, 
                                java.lang.String cmiFechaLiberacion) {
        this.idComposite = idComposite;
        this.idExpRechazo = idExpRechazo;
        this.cmiDoctoRef = cmiDoctoRef;
        this.cmiNumeroCartilla = cmiNumeroCartilla;
        this.fecModifico = fecModifico;
        this.idStatus = idStatus;
        this.usuario = usuario;
        this.cmiFechaLiberacion = cmiFechaLiberacion;
    }

    /**
     * Get cmiSecuencia value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getCmiSecuencia() {
        if (idComposite == null) {
            return null;
        }
        return this.idComposite.getCmiSecuencia();
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
     * Get cmiDoctoRef value.
     *
     * @return java.lang.String
     */
    public java.lang.String getCmiDoctoRef() {
        return this.cmiDoctoRef;
    }

    /**
     * Get cmiNumeroCartilla value.
     *
     * @return java.lang.String
     */
    public java.lang.String getCmiNumeroCartilla() {
        return this.cmiNumeroCartilla;
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
     * Get usuario value.
     *
     * @return java.lang.String
     */
    public java.lang.String getUsuario() {
        return this.usuario;
    }

    /**
     * Get cmiFechaLiberacion value.
     *
     * @return java.lang.String
     */
    public java.lang.String getCmiFechaLiberacion() {
        return this.cmiFechaLiberacion;
    }

    /**
     * Set cmiSecuencia value.
     *
     * @param cmiSecuencia java.lang.Integer
     */
    public void setCmiSecuencia(java.lang.Integer cmiSecuencia) {
        if (idComposite == null) {
            idComposite = new TdExpCartillaMilitarPK();
        }
        this.idComposite.setCmiSecuencia(cmiSecuencia);
    }

    /**
     * Set idDocto value.
     *
     * @param idDocto java.lang.String
     */
    public void setIdDocto(java.lang.String idDocto) {
        if (idComposite == null) {
            idComposite = new TdExpCartillaMilitarPK();
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
            idComposite = new TdExpCartillaMilitarPK();
        }
        this.idComposite.setRfcEmpleado(rfcEmpleado);
    }

    /**
     * Set cmiDoctoRef value.
     *
     * @param cmiDoctoRef java.lang.String
     */
    public void setCmiDoctoRef(java.lang.String cmiDoctoRef) {
        this.cmiDoctoRef = cmiDoctoRef;
    }

    /**
     * Set cmiNumeroCartilla value.
     *
     * @param cmiNumeroCartilla java.lang.String
     */
    public void setCmiNumeroCartilla(java.lang.String cmiNumeroCartilla) {
        this.cmiNumeroCartilla = cmiNumeroCartilla;
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
     * Set usuario value.
     *
     * @param usuario java.lang.String
     */
    public void setUsuario(java.lang.String usuario) {
        this.usuario = usuario;
    }

    /**
     * Set cmiFechaLiberacion value.
     *
     * @param cmiFechaLiberacion java.lang.String
     */
    public void setCmiFechaLiberacion(java.lang.String cmiFechaLiberacion) {
        this.cmiFechaLiberacion = cmiFechaLiberacion;
    }

    /**
     * Set identity value.
     *
     * @param idComposite Serializable
     */
    public void setIdentity(Serializable idComposite) {
        this.idComposite = (TdExpCartillaMilitarPK)idComposite;
    }

    /**
     * Get identity value.
     *
     * @return Serializable
     */
    public Serializable getIdentity() {
        return this.idComposite;
    }

    /**
     * Set idExpRechazo value.
     *
     * @param idExpRechazo java.lang.Integer
     */
    public

    void setIdExpRechazo(java.lang.Integer idExpRechazo) {
        this.idExpRechazo = idExpRechazo;
    }

    /**
     * Get idExpRechazo value.
     *
     * @return idExpRechazo java.lang.Integer
     */
    public int getIdExpRechazo() {
        return idExpRechazo;
    }
}
