package gob.shcp.sireh.domain.jdbc;

import java.io.Serializable;

/**
 * Composed primary object for TcConceptoPagoCaptura data.
 */
public class TcConceptoPagoCapturaPK implements Serializable {
    private java.lang.String idCptoPago;
    private java.lang.String idTipoCpto;

    /**
     * Constructor for TcConceptoPagoCapturaPK class.
     */
    public TcConceptoPagoCapturaPK() {
    }

    /**
     * Constructor for TcConceptoPagoCapturaPK class.
     *
     * @param idCptoPago java.lang.String
     * @param idTipoCpto java.lang.String
     */
    public TcConceptoPagoCapturaPK(java.lang.String idCptoPago, 
                                   java.lang.String idTipoCpto) {
        this.idCptoPago = idCptoPago;
        this.idTipoCpto = idTipoCpto;

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
     * Set idCptoPago value.
     *
     * @param idCptoPago java.lang.String
     */
    public void setIdCptoPago(java.lang.String idCptoPago) {
        this.idCptoPago = idCptoPago;
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
     * Set idTipoCpto value.
     *
     * @param idTipoCpto java.lang.String
     */
    public void setIdTipoCpto(java.lang.String idTipoCpto) {
        this.idTipoCpto = idTipoCpto;
    }

}
