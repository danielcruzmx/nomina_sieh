package gob.shcp.sireh.domain.jdbc;

import java.io.Serializable;

/**
 * Composed primary object for TdNmResumen data.
 */
public class TdNmResumenPK implements Serializable {
    private java.lang.Integer nmrCausal;
    private java.lang.Integer nmrCicloPago;
    private java.lang.String nmrRfc;

    /**
     * Constructor for TdNmResumenPK class.
     */
    public TdNmResumenPK() {
    }

    /**
     * Constructor for TdNmResumenPK class.
     *
     * @param nmrCausal java.lang.Integer
     * @param nmrCicloPago java.lang.Integer
     * @param nmrRfc java.lang.String
     */
    public TdNmResumenPK(java.lang.Integer nmrCausal, 
                         java.lang.Integer nmrCicloPago, 
                         java.lang.String nmrRfc) {
        this.nmrCausal = nmrCausal;
        this.nmrCicloPago = nmrCicloPago;
        this.nmrRfc = nmrRfc;
    }

    /**
     * Get nmrCausal value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getNmrCausal() {
        return this.nmrCausal;
    }

    /**
     * Set nmrCausal value.
     *
     * @param nmrCausal java.lang.Integer
     */
    public void setNmrCausal(java.lang.Integer nmrCausal) {
        this.nmrCausal = nmrCausal;
    }

    /**
     * Get nmrCicloPago value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getNmrCicloPago() {
        return this.nmrCicloPago;
    }

    /**
     * Set nmrCicloPago value.
     *
     * @param nmrCicloPago java.lang.Integer
     */
    public void setNmrCicloPago(java.lang.Integer nmrCicloPago) {
        this.nmrCicloPago = nmrCicloPago;
    }

    /**
     * Get nmrRfc value.
     *
     * @return java.lang.String
     */
    public java.lang.String getNmrRfc() {
        return this.nmrRfc;
    }

    /**
     * Set nmrRfc value.
     *
     * @param nmrRfc java.lang.String
     */
    public void setNmrRfc(java.lang.String nmrRfc) {
        this.nmrRfc = nmrRfc;
    }

}
