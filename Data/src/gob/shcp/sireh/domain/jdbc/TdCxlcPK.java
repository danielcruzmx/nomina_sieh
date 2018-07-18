package gob.shcp.sireh.domain.jdbc;

import java.io.Serializable;

/**
 * Composed primary object for TdCxlc data.
 */
public class TdCxlcPK implements Serializable {
    private java.lang.Integer cxlc;
    private java.lang.Integer cxlcCiclo;

    /**
     * Constructor for TdCxlcPK class.
     */
    public TdCxlcPK() {
    }

    /**
     * Constructor for TdCxlcPK class.
     *
     * @param cxlc java.lang.Integer
     * @param cxlcCiclo java.lang.Integer
     */
    public TdCxlcPK(java.lang.Integer cxlc, java.lang.Integer cxlcCiclo) {
        this.cxlc = cxlc;
        this.cxlcCiclo = cxlcCiclo;
    }

    /**
     * Get cxlc value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getCxlc() {
        return this.cxlc;
    }

    /**
     * Set cxlc value.
     *
     * @param cxlc java.lang.Integer
     */
    public void setCxlc(java.lang.Integer cxlc) {
        this.cxlc = cxlc;
    }

    /**
     * Get cxlcCiclo value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getCxlcCiclo() {
        return this.cxlcCiclo;
    }

    /**
     * Set cxlcCiclo value.
     *
     * @param cxlcCiclo java.lang.Integer
     */
    public void setCxlcCiclo(java.lang.Integer cxlcCiclo) {
        this.cxlcCiclo = cxlcCiclo;
    }

}
