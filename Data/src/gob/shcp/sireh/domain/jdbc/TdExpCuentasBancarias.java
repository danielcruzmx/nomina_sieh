package gob.shcp.sireh.domain.jdbc;

import gob.shcp.fsn.data.Domain;

import java.io.Serializable;

/**
 * Domain object for persistent TdExpCuentasBancaria data.
 */
public class TdExpCuentasBancarias implements Domain, Serializable {
    private TdExpCuentasBancariaPK idComposite;
    private int idExpRechazo;
    private java.lang.String ctaTipo;
    private java.util.Date fecModifico;
    private java.lang.String idBanco;
    private java.lang.String idStatus;
    private java.lang.String usuario;
    private java.lang.String ctaClabe;
    private java.lang.String ctaDoctoRef;
    private java.math.BigDecimal ctaNumero;

    /**
     * Constructor for TdExpCuentasBancaria class.
     */
    public TdExpCuentasBancarias() {
    }

    /**
     * Constructor for TdExpCuentasBancaria class.
     *
     * @param ctaSecuencia java.lang.Integer
     * @param idDocto java.lang.String
     * @param rfcEmpleado java.lang.String
     * @param idExpRechazo int
     * @param ctaTipo java.lang.String
     * @param fecModifico java.util.Date
     * @param idBanco java.lang.String
     * @param idStatus java.lang.String
     * @param usuario java.lang.String
     * @param ctaClabe java.lang.String
     * @param ctaDoctoRef java.lang.String
     * @param ctaNumero java.math.BigDecimal
     */
    public TdExpCuentasBancarias(TdExpCuentasBancariaPK idComposite, 
                                 int idExpRechazo, java.lang.String ctaTipo, 
                                 java.util.Date fecModifico, 
                                 java.lang.String idBanco, 
                                 java.lang.String idStatus, 
                                 java.lang.String usuario, 
                                 java.lang.String ctaClabe, 
                                 java.lang.String ctaDoctoRef, 
                                 java.math.BigDecimal ctaNumero) {
        this.idComposite = idComposite;
        this.idExpRechazo = idExpRechazo;
        this.ctaTipo = ctaTipo;
        this.fecModifico = fecModifico;
        this.idBanco = idBanco;
        this.idStatus = idStatus;
        this.usuario = usuario;
        this.ctaClabe = ctaClabe;
        this.ctaDoctoRef = ctaDoctoRef;
        this.ctaNumero = ctaNumero;
    }

    /**
     * Get ctaSecuencia value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getCtaSecuencia() {
        if (idComposite == null) {
            return null;
        }
        return this.idComposite.getCtaSecuencia();
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
     * Get ctaTipo value.
     *
     * @return java.lang.String
     */
    public java.lang.String getCtaTipo() {
        return this.ctaTipo;
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
     * Get idBanco value.
     *
     * @return java.lang.String
     */
    public java.lang.String getIdBanco() {
        return this.idBanco;
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
     * Get ctaClabe value.
     *
     * @return java.lang.String
     */
    public java.lang.String getCtaClabe() {
        return this.ctaClabe;
    }

    /**
     * Get ctaDoctoRef value.
     *
     * @return java.lang.String
     */
    public java.lang.String getCtaDoctoRef() {
        return this.ctaDoctoRef;
    }

    /**
     * Get ctaNumero value.
     *
     * @return java.math.BigDecimal
     */
    public java.math.BigDecimal getCtaNumero() {
        return this.ctaNumero;
    }

    /**
     * Set ctaSecuencia value.
     *
     * @param ctaSecuencia java.lang.Integer
     */
    public void setCtaSecuencia(java.lang.Integer ctaSecuencia) {
        if (idComposite == null) {
            idComposite = new TdExpCuentasBancariaPK();
        }
        this.idComposite.setCtaSecuencia(ctaSecuencia);
    }

    /**
     * Set idDocto value.
     *
     * @param idDocto java.lang.String
     */
    public void setIdDocto(java.lang.String idDocto) {
        if (idComposite == null) {
            idComposite = new TdExpCuentasBancariaPK();
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
            idComposite = new TdExpCuentasBancariaPK();
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
     * Set ctaTipo value.
     *
     * @param ctaTipo java.lang.String
     */
    public void setCtaTipo(java.lang.String ctaTipo) {
        this.ctaTipo = ctaTipo;
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
     * Set idBanco value.
     *
     * @param idBanco java.lang.String
     */
    public void setIdBanco(java.lang.String idBanco) {
        this.idBanco = idBanco;
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
     * Set ctaClabe value.
     *
     * @param ctaClabe java.lang.String
     */
    public void setCtaClabe(java.lang.String ctaClabe) {
        this.ctaClabe = ctaClabe;
    }

    /**
     * Set ctaDoctoRef value.
     *
     * @param ctaDoctoRef java.lang.String
     */
    public void setCtaDoctoRef(java.lang.String ctaDoctoRef) {
        this.ctaDoctoRef = ctaDoctoRef;
    }

    /**
     * Set ctaNumero value.
     *
     * @param ctaNumero java.math.BigDecimal
     */
    public void setCtaNumero(java.math.BigDecimal ctaNumero) {
        this.ctaNumero = ctaNumero;
    }

    /**
     * Set identity value.
     *
     * @param idComposite Serializable
     */
    public void setIdentity(Serializable idComposite) {
        this.idComposite = (TdExpCuentasBancariaPK)idComposite;
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
