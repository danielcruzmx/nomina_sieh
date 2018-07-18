package gob.shcp.sireh.domain.jdbc.rusp;

import java.io.Serializable;

/**
 * Composed primary object for TdRuspBaja data.
 */
public class TdRuspBajaPK implements Serializable {
    
    private java.lang.Integer rbCiclo;
    private java.lang.Integer rbQnaPago;
    private java.lang.String rbRfc;

    /**
     * Constructor for TdRuspBajaPK class.
     */
    public TdRuspBajaPK() {
    }

    /**
     * Constructor for TdRuspBajaPK class.
     *
     * @param rbCiclo java.lang.Integer
     * @param rbQnaPago java.lang.Integer
     * @param rbRfc java.lang.String
     */
    public TdRuspBajaPK(java.lang.Integer rbCiclo, java.lang.Integer rbQnaPago, java.lang.String rbRfc) {
        this.rbCiclo = rbCiclo;
        this.rbQnaPago = rbQnaPago;
        this.rbRfc = rbRfc;
    }

    /**
     * Get rbCiclo value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getRbCiclo() {
        return this.rbCiclo;
    }

    /**
     * Set rbCiclo value.
     *
     * @param rbCiclo java.lang.Integer
     */
    public void setRbCiclo(java.lang.Integer rbCiclo) {
        this.rbCiclo = rbCiclo;
    }

    /**
     * Get rbQnaPago value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getRbQnaPago() {
        return this.rbQnaPago;
    }

    /**
     * Set rbQnaPago value.
     *
     * @param rbQnaPago java.lang.Integer
     */
    public void setRbQnaPago(java.lang.Integer rbQnaPago) {
        this.rbQnaPago = rbQnaPago;
    }

    /**
     * Get rbRfc value.
     *
     * @return java.lang.String
     */
    public java.lang.String getRbRfc() {
        return this.rbRfc;
    }

    /**
     * Set rbRfc value.
     *
     * @param rbRfc java.lang.String
     */
    public void setRbRfc(java.lang.String rbRfc) {
        this.rbRfc = rbRfc;
    }
}
