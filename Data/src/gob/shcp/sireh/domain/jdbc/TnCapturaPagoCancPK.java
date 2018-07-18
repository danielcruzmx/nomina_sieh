package gob.shcp.sireh.domain.jdbc;

import java.io.Serializable;

/**
 * Composed primary object for TnCapturaPagoCanc data.
 */
public class TnCapturaPagoCancPK implements Serializable {
    private java.lang.Long cpcChequeOComproban;
    private java.lang.Integer cpcDifFolio;
    private java.lang.String idSitPago;

    /**
     * Constructor for TnCapturaPagoCancPK class.
     */
    public TnCapturaPagoCancPK() {
    }

    /**
     * Constructor for TnCapturaPagoCancPK class.
     *
     * @param cpcChequeOComproban java.lang.Long
     * @param cpcDifFolio java.lang.Integer
     * @param idSitPago java.lang.String
     */
    public TnCapturaPagoCancPK(java.lang.Long cpcChequeOComproban, 
                               java.lang.Integer cpcDifFolio, 
                               java.lang.String idSitPago) {
        this.cpcChequeOComproban = cpcChequeOComproban;
        this.cpcDifFolio = cpcDifFolio;
        this.idSitPago = idSitPago;
    }

    /**
     * Get cpcChequeOComproban value.
     *
     * @return java.lang.Long
     */
    public java.lang.Long getCpcChequeOComproban() {
        return this.cpcChequeOComproban;
    }

    /**
     * Set cpcChequeOComproban value.
     *
     * @param cpcChequeOComproban java.lang.Long
     */
    public void setCpcChequeOComproban(java.lang.Long cpcChequeOComproban) {
        this.cpcChequeOComproban = cpcChequeOComproban;
    }

    /**
     * Get cpcDifFolio value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getCpcDifFolio() {
        return this.cpcDifFolio;
    }

    /**
     * Set cpcDifFolio value.
     *
     * @param cpcDifFolio java.lang.Integer
     */
    public void setCpcDifFolio(java.lang.Integer cpcDifFolio) {
        this.cpcDifFolio = cpcDifFolio;
    }

    /**
     * Get idSitPago value.
     *
     * @return java.lang.String
     */
    public java.lang.String getIdSitPago() {
        return this.idSitPago;
    }

    /**
     * Set idSitPago value.
     *
     * @param idSitPago java.lang.String
     */
    public void setIdSitPago(java.lang.String idSitPago) {
        this.idSitPago = idSitPago;
    }

}
