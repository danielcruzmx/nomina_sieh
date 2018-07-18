package gob.shcp.sireh.domain.jdbc;

import gob.shcp.fsn.data.Domain;

import java.io.Serializable;

/**
 * Domain object for persistent TnConceptoPagado data.
 */
public class TnConceptoPagado implements Domain, Serializable {
    private TnConceptoPagadoPK idComposite;
    private java.lang.Double cpMonto;
    private java.lang.String idCptoPago;
    private java.lang.String idTipoCpto;

    /**
     * Constructor for TnConceptoPagado class.
     */
    public TnConceptoPagado() {
    }

    /**
     * Constructor for TnConceptoPagado class.
     *
     * @param cpDifFolio java.lang.Integer
     * @param cpFolio java.lang.Long
     * @param cpNumConcepto java.lang.Integer
     * @param cpMonto java.lang.Double
     * @param idCptoPago java.lang.String
     * @param idTipoCpto java.lang.String
     */
    public TnConceptoPagado(TnConceptoPagadoPK idComposite, 
                            java.lang.Double cpMonto, 
                            java.lang.String idCptoPago, 
                            java.lang.String idTipoCpto) {
        this.idComposite = idComposite;
        this.cpMonto = cpMonto;
        this.idCptoPago = idCptoPago;
        this.idTipoCpto = idTipoCpto;
    }

    /**
     * Get cpDifFolio value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getCpDifFolio() {
        if (idComposite == null) {
            return null;
        }
        return this.idComposite.getCpDifFolio();
    }

    /**
     * Get cpFolio value.
     *
     * @return java.lang.Long
     */
    public java.lang.Long getCpFolio() {
        if (idComposite == null) {
            return null;
        }
        return this.idComposite.getCpFolio();
    }

    /**
     * Get cpNumConcepto value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getCpNumConcepto() {
        if (idComposite == null) {
            return null;
        }
        return this.idComposite.getCpNumConcepto();
    }

    /**
     * Get cpMonto value.
     *
     * @return java.lang.Double
     */
    public java.lang.Double getCpMonto() {
        return this.cpMonto;
    }

    /**
     * Get idCptoPago value.
     *
     * @return java.lang.String
     */
    public java.lang.String getIdCptoPago() {
        return this.idCptoPago;
    }

    /**
     * Get idTipoCpto value.
     *
     * @return java.lang.String
     */
    public java.lang.String getIdTipoCpto() {
        return this.idTipoCpto;
    }

    /**
     * Set cpDifFolio value.
     *
     * @param cpDifFolio java.lang.Integer
     */
    public void setCpDifFolio(java.lang.Integer cpDifFolio) {
        if (idComposite == null) {
            idComposite = new TnConceptoPagadoPK();
        }
        this.idComposite.setCpDifFolio(cpDifFolio);
    }

    /**
     * Set cpFolio value.
     *
     * @param cpFolio java.lang.Long
     */
    public void setCpFolio(java.lang.Long cpFolio) {
        if (idComposite == null) {
            idComposite = new TnConceptoPagadoPK();
        }
        this.idComposite.setCpFolio(cpFolio);
    }

    /**
     * Set cpNumConcepto value.
     *
     * @param cpNumConcepto java.lang.Integer
     */
    public void setCpNumConcepto(java.lang.Integer cpNumConcepto) {
        if (idComposite == null) {
            idComposite = new TnConceptoPagadoPK();
        }
        this.idComposite.setCpNumConcepto(cpNumConcepto);
    }

    /**
     * Set cpMonto value.
     *
     * @param cpMonto java.lang.Double
     */
    public void setCpMonto(java.lang.Double cpMonto) {
        this.cpMonto = cpMonto;
    }

    /**
     * Set idCptoPago value.
     *
     * @param idCptoPago java.lang.String
     */
    public void setIdCptoPago(java.lang.String idCptoPago) {
        this.idCptoPago = idCptoPago;
    }

    /**
     * Set idTipoCpto value.
     *
     * @param idTipoCpto java.lang.String
     */
    public void setIdTipoCpto(java.lang.String idTipoCpto) {
        this.idTipoCpto = idTipoCpto;
    }

    /**
     * Set identity value.
     *
     * @param idComposite Serializable
     */
    public void setIdentity(Serializable idComposite) {
        this.idComposite = (TnConceptoPagadoPK)idComposite;
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
