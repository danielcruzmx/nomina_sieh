package gob.shcp.sireh.domain.jdbc;

import gob.shcp.fsn.data.Domain;

import java.io.Serializable;

/**
 * Domain object for persistent TdExpCurp data.
 */
public class TdExpCurp implements Domain, Serializable {
    private TdExpCurpPK idComposite;
    private int idExpRechazo;
    private java.lang.String curpCve;
    private java.lang.String curpDoctoRef;
    private java.util.Date fecModifico;
    private java.lang.String idStatus;
    private java.lang.String usuario;
    private java.lang.String curpFolio;

    /**
     * Constructor for TdExpCurp class.
     */
    public TdExpCurp() {
    }

    /**
     * Constructor for TdExpCurp class.
     *
     * @param curpSecuencia java.lang.Integer
     * @param idDocto java.lang.String
     * @param rfcEmpleado java.lang.String
     * @param idExpRechazo int
     * @param curpCve java.lang.String
     * @param curpDoctoRef java.lang.String
     * @param fecModifico java.util.Date
     * @param idStatus java.lang.String
     * @param usuario java.lang.String
     * @param curpFolio java.lang.String
     */
    public TdExpCurp(TdExpCurpPK idComposite, int idExpRechazo, 
                     java.lang.String curpCve, java.lang.String curpDoctoRef, 
                     java.util.Date fecModifico, java.lang.String idStatus, 
                     java.lang.String usuario, java.lang.String curpFolio) {
        this.idComposite = idComposite;
        this.idExpRechazo = idExpRechazo;
        this.curpCve = curpCve;
        this.curpDoctoRef = curpDoctoRef;
        this.fecModifico = fecModifico;
        this.idStatus = idStatus;
        this.usuario = usuario;
        this.curpFolio = curpFolio;
    }

    /**
     * Get curpSecuencia value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getCurpSecuencia() {
        if (idComposite == null) {
            return null;
        }
        return this.idComposite.getCurpSecuencia();
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
     * Get curpCve value.
     *
     * @return java.lang.String
     */
    public java.lang.String getCurpCve() {
        return this.curpCve;
    }

    /**
     * Get curpDoctoRef value.
     *
     * @return java.lang.String
     */
    public java.lang.String getCurpDoctoRef() {
        return this.curpDoctoRef;
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
     * Get curpFolio value.
     *
     * @return java.lang.String
     */
    public java.lang.String getCurpFolio() {
        return this.curpFolio;
    }

    /**
     * Set curpSecuencia value.
     *
     * @param curpSecuencia java.lang.Integer
     */
    public void setCurpSecuencia(java.lang.Integer curpSecuencia) {
        if (idComposite == null) {
            idComposite = new TdExpCurpPK();
        }
        this.idComposite.setCurpSecuencia(curpSecuencia);
    }

    /**
     * Set idDocto value.
     *
     * @param idDocto java.lang.String
     */
    public void setIdDocto(java.lang.String idDocto) {
        if (idComposite == null) {
            idComposite = new TdExpCurpPK();
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
            idComposite = new TdExpCurpPK();
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
     * Set curpCve value.
     *
     * @param curpCve java.lang.String
     */
    public void setCurpCve(java.lang.String curpCve) {
        this.curpCve = curpCve;
    }

    /**
     * Set curpDoctoRef value.
     *
     * @param curpDoctoRef java.lang.String
     */
    public void setCurpDoctoRef(java.lang.String curpDoctoRef) {
        this.curpDoctoRef = curpDoctoRef;
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
     * Set curpFolio value.
     *
     * @param curpFolio java.lang.String
     */
    public void setCurpFolio(java.lang.String curpFolio) {
        this.curpFolio = curpFolio;
    }

    /**
     * Set identity value.
     *
     * @param idComposite Serializable
     */
    public void setIdentity(Serializable idComposite) {
        this.idComposite = (TdExpCurpPK)idComposite;
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
