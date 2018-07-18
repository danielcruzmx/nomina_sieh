package gob.shcp.sireh.domain.jdbc;

import java.io.Serializable;

/**
 * Composed primary object for TnHistoricoPago data.
 */
public class TnHistoricoPagoPK implements Serializable {
    private java.lang.Integer hpDifFolio;
    private java.lang.Long hpFolio;

    /**
     * Constructor for TnHistoricoPagoPK class.
     */
    public TnHistoricoPagoPK() {
    }

    /**
     * Constructor for TnHistoricoPagoPK class.
     *
     * @param hpDifFolio java.lang.Integer
     * @param hpFolio java.lang.Long
     */
    public TnHistoricoPagoPK(java.lang.Integer hpDifFolio, 
                             java.lang.Long hpFolio) {
        this.hpDifFolio = hpDifFolio;
        this.hpFolio = hpFolio;
    }

    /**
     * Get hpDifFolio value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getHpDifFolio() {
        return this.hpDifFolio;
    }

    /**
     * Set hpDifFolio value.
     *
     * @param hpDifFolio java.lang.Integer
     */
    public void setHpDifFolio(java.lang.Integer hpDifFolio) {
        this.hpDifFolio = hpDifFolio;
    }

    /**
     * Get hpFolio value.
     *
     * @return java.lang.Long
     */
    public java.lang.Long getHpFolio() {
        return this.hpFolio;
    }

    /**
     * Set hpFolio value.
     *
     * @param hpFolio java.lang.Long
     */
    public void setHpFolio(java.lang.Long hpFolio) {
        this.hpFolio = hpFolio;
    }

}
