package gob.shcp.sireh.domain.jdbc;

import java.io.Serializable;

/**
 * Composed primary object for TnConceptoPagado data.
 */
public class TnConceptoPagadoPK implements Serializable {
    private java.lang.Integer cpDifFolio;
    private java.lang.Long cpFolio;
    private java.lang.Integer cpNumConcepto;

    /**
     * Constructor for TnConceptoPagadoPK class.
     */
    public TnConceptoPagadoPK() {
    }

    /**
     * Constructor for TnConceptoPagadoPK class.
     *
     * @param cpDifFolio java.lang.Integer
     * @param cpFolio java.lang.Long
     * @param cpNumConcepto java.lang.Integer
     */
    public TnConceptoPagadoPK(java.lang.Integer cpDifFolio, 
                              java.lang.Long cpFolio, 
                              java.lang.Integer cpNumConcepto) {
        this.cpDifFolio = cpDifFolio;
        this.cpFolio = cpFolio;
        this.cpNumConcepto = cpNumConcepto;
    }

    /**
     * Get cpDifFolio value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getCpDifFolio() {
        return this.cpDifFolio;
    }

    /**
     * Set cpDifFolio value.
     *
     * @param cpDifFolio java.lang.Integer
     */
    public void setCpDifFolio(java.lang.Integer cpDifFolio) {
        this.cpDifFolio = cpDifFolio;
    }

    /**
     * Get cpFolio value.
     *
     * @return java.lang.Long
     */
    public java.lang.Long getCpFolio() {
        return this.cpFolio;
    }

    /**
     * Set cpFolio value.
     *
     * @param cpFolio java.lang.Long
     */
    public void setCpFolio(java.lang.Long cpFolio) {
        this.cpFolio = cpFolio;
    }

    /**
     * Get cpNumConcepto value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getCpNumConcepto() {
        return this.cpNumConcepto;
    }

    /**
     * Set cpNumConcepto value.
     *
     * @param cpNumConcepto java.lang.Integer
     */
    public void setCpNumConcepto(java.lang.Integer cpNumConcepto) {
        this.cpNumConcepto = cpNumConcepto;
    }

}
