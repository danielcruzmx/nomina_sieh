package gob.shcp.sireh.domain.jdbc;

import gob.shcp.fsn.data.Domain;

import java.io.Serializable;

/**
 * Domain object for persistent TnCapturaPagoCanc data.
 */
public class TnCapturaPagoCanc implements Domain, Serializable {
    private TnCapturaPagoCancPK idComposite;
    private java.lang.Integer idMotivoCancela;
    private java.lang.String cpcAtentaNota;
    private java.lang.Integer cpcNumCxlcDgap;
    private java.lang.Integer cpcQnaAplica;
    private java.lang.Integer cpcQnaCaptura;
    private java.lang.String cpcReferencia;
    private java.util.Date fecModifico;
    private java.lang.String usuario;

    /**
     * Constructor for TnCapturaPagoCanc class.
     */
    public TnCapturaPagoCanc() {
    }

    /**
     * Constructor for TnCapturaPagoCanc class.
     *
     * @param cpcChequeOComproban java.lang.Long
     * @param cpcDifFolio java.lang.Integer
     * @param idSitPago java.lang.String
     * @param idMotivoCancela java.lang.Integer
     * @param cpcAtentaNota java.lang.String
     * @param cpcNumCxlcDgap java.lang.Integer
     * @param cpcQnaAplica java.lang.Integer
     * @param cpcQnaCaptura java.lang.Integer
     * @param cpcReferencia java.lang.String
     * @param fecModifico java.util.Date
     * @param usuario java.lang.String
     */
    public TnCapturaPagoCanc(TnCapturaPagoCancPK idComposite, 
                             java.lang.Integer idMotivoCancela, 
                             java.lang.String cpcAtentaNota, 
                             java.lang.Integer cpcNumCxlcDgap, 
                             java.lang.Integer cpcQnaAplica, 
                             java.lang.Integer cpcQnaCaptura, 
                             java.lang.String cpcReferencia, 
                             java.util.Date fecModifico, 
                             java.lang.String usuario) {
        this.idComposite = idComposite;
        this.idMotivoCancela = idMotivoCancela;
        this.cpcAtentaNota = cpcAtentaNota;
        this.cpcNumCxlcDgap = cpcNumCxlcDgap;
        this.cpcQnaAplica = cpcQnaAplica;
        this.cpcQnaCaptura = cpcQnaCaptura;
        this.cpcReferencia = cpcReferencia;
        this.fecModifico = fecModifico;
        this.usuario = usuario;
    }

    /**
     * Get cpcChequeOComproban value.
     *
     * @return java.lang.Long
     */
    public java.lang.Long getCpcChequeOComproban() {
        if (idComposite == null) {
            return null;
        }
        return this.idComposite.getCpcChequeOComproban();
    }

    /**
     * Get cpcDifFolio value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getCpcDifFolio() {
        if (idComposite == null) {
            return null;
        }
        return this.idComposite.getCpcDifFolio();
    }

    /**
     * Get idSitPago value.
     *
     * @return java.lang.String
     */
    public java.lang.String getIdSitPago() {
        if (idComposite == null) {
            return null;
        }
        return this.idComposite.getIdSitPago();
    }

    /**
     * Get idMotivoCancela value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getIdMotivoCancela() {
        return this.idMotivoCancela;
    }

    /**
     * Get cpcAtentaNota value.
     *
     * @return java.lang.String
     */
    public java.lang.String getCpcAtentaNota() {
        return this.cpcAtentaNota;
    }

    /**
     * Get cpcNumCxlcDgap value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getCpcNumCxlcDgap() {
        return this.cpcNumCxlcDgap;
    }

    /**
     * Get cpcQnaAplica value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getCpcQnaAplica() {
        return this.cpcQnaAplica;
    }

    /**
     * Get cpcQnaCaptura value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getCpcQnaCaptura() {
        return this.cpcQnaCaptura;
    }

    /**
     * Get cpcReferencia value.
     *
     * @return java.lang.String
     */
    public java.lang.String getCpcReferencia() {
        return this.cpcReferencia;
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
     * Get usuario value.
     *
     * @return java.lang.String
     */
    public java.lang.String getUsuario() {
        return this.usuario;
    }

    /**
     * Set cpcChequeOComproban value.
     *
     * @param cpcChequeOComproban java.lang.Long
     */
    public void setCpcChequeOComproban(java.lang.Long cpcChequeOComproban) {
        if (idComposite == null) {
            idComposite = new TnCapturaPagoCancPK();
        }
        this.idComposite.setCpcChequeOComproban(cpcChequeOComproban);
    }

    /**
     * Set cpcDifFolio value.
     *
     * @param cpcDifFolio java.lang.Integer
     */
    public void setCpcDifFolio(java.lang.Integer cpcDifFolio) {
        if (idComposite == null) {
            idComposite = new TnCapturaPagoCancPK();
        }
        this.idComposite.setCpcDifFolio(cpcDifFolio);
    }

    /**
     * Set idSitPago value.
     *
     * @param idSitPago java.lang.String
     */
    public void setIdSitPago(java.lang.String idSitPago) {
        if (idComposite == null) {
            idComposite = new TnCapturaPagoCancPK();
        }
        this.idComposite.setIdSitPago(idSitPago);
    }

    /**
     * Set idMotivoCancela value.
     *
     * @param idMotivoCancela java.lang.Integer
     */
    public void setIdMotivoCancela(java.lang.Integer idMotivoCancela) {
        this.idMotivoCancela = idMotivoCancela;
    }

    /**
     * Set cpcAtentaNota value.
     *
     * @param cpcAtentaNota java.lang.String
     */
    public void setCpcAtentaNota(java.lang.String cpcAtentaNota) {
        this.cpcAtentaNota = cpcAtentaNota;
    }

    /**
     * Set cpcNumCxlcDgap value.
     *
     * @param cpcNumCxlcDgap java.lang.Integer
     */
    public void setCpcNumCxlcDgap(java.lang.Integer cpcNumCxlcDgap) {
        this.cpcNumCxlcDgap = cpcNumCxlcDgap;
    }

    /**
     * Set cpcQnaAplica value.
     *
     * @param cpcQnaAplica java.lang.Integer
     */
    public void setCpcQnaAplica(java.lang.Integer cpcQnaAplica) {
        this.cpcQnaAplica = cpcQnaAplica;
    }

    /**
     * Set cpcQnaCaptura value.
     *
     * @param cpcQnaCaptura java.lang.Integer
     */
    public void setCpcQnaCaptura(java.lang.Integer cpcQnaCaptura) {
        this.cpcQnaCaptura = cpcQnaCaptura;
    }

    /**
     * Set cpcReferencia value.
     *
     * @param cpcReferencia java.lang.String
     */
    public void setCpcReferencia(java.lang.String cpcReferencia) {
        this.cpcReferencia = cpcReferencia;
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
     * Set usuario value.
     *
     * @param usuario java.lang.String
     */
    public void setUsuario(java.lang.String usuario) {
        this.usuario = usuario;
    }

    /**
     * Set identity value.
     *
     * @param idComposite Serializable
     */
    public void setIdentity(Serializable idComposite) {
        this.idComposite = (TnCapturaPagoCancPK)idComposite;
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
