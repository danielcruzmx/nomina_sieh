package gob.shcp.sireh.domain.jdbc.rusp;

import java.io.Serializable;

/**
 * Composed primary object for TdRuspDatosper data.
 */
public class TdRuspDatosperPK implements Serializable {
    
    private java.lang.Integer rdQnaPago;
    private java.lang.String rdRfcSp;

    /**
     * Constructor for TdRuspDatosperPK class.
     */
    public TdRuspDatosperPK() {
    }
    
    /**
     * Constructor for TdRuspDatosperPK class.
     *
     * @param rdQnaPago java.lang.Integer
     * @param rdRfcSp java.lang.String
     */
    public TdRuspDatosperPK(java.lang.Integer rdQnaPago, java.lang.String rdRfcSp) {
        this.rdQnaPago = rdQnaPago;
        this.rdRfcSp = rdRfcSp;
    }
    
    /**
     * Get rdQnaPago value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getRdQnaPago() {
        return this.rdQnaPago;
    }

    /**
     * Set rdQnaPago value.
     *
     * @param rdQnaPago java.lang.Integer
     */
    public void setRdQnaPago(java.lang.Integer rdQnaPago) {
        this.rdQnaPago = rdQnaPago;
    }

    /**
     * Get rdRfcSp value.
     *
     * @return java.lang.String
     */
    public java.lang.String getRdRfcSp() {
        return this.rdRfcSp;
    }

    /**
     * Set rdRfcSp value.
     *
     * @param rdRfcSp java.lang.String
     */
    public void setRdRfcSp(java.lang.String rdRfcSp) {
        this.rdRfcSp = rdRfcSp;
    }
}
