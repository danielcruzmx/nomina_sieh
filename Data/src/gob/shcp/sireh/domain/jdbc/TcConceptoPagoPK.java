package gob.shcp.sireh.domain.jdbc;

import java.io.Serializable;

/**
 * Composed primary object for TcConceptoPago data.
 */
public class TcConceptoPagoPK implements Serializable {
    private java.lang.String idConcepto;
    private java.lang.String idTipoCpto;

    /**
     * Constructor for TcConceptoPagoPK class.
     */
    public TcConceptoPagoPK() {
    }

    /**
     * Constructor for TcConceptoPagoPK class.
     *
     * @param idConcepto java.lang.String
     * @param idTipoCpto java.lang.String
     */
    public TcConceptoPagoPK(java.lang.String idConcepto, 
                            java.lang.String idTipoCpto) {
        this.idConcepto = idConcepto;
        this.idTipoCpto = idTipoCpto;

    }

    /**
     * Get idConcepto value.
     *
     * @return java.lang.String
     */
    public java.lang.String getIdConcepto() {
        return this.idConcepto;
    }

    /**
     * Set idConcepto value.
     *
     * @param idConcepto java.lang.String
     */
    public void setIdConcepto(java.lang.String idConcepto) {
        this.idConcepto = idConcepto;
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
