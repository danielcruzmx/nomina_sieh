package gob.shcp.sireh.domain.jdbc;

import java.io.Serializable;

/**
 * Composed primary object for TdSecCxlc data.
 */
public class TdSecCxlcPK implements Serializable {

    private java.lang.Integer cxlc;
    private java.lang.Integer secCxlc;
    private java.lang.Integer secCxlcCiclo;

    /**
     * Constructor for TdSecCxlcPK class.
     */
    public TdSecCxlcPK() {
    }

    /**
     * Constructor for TdSecCxlcPK class.
     *
     * @param cxlc java.lang.Integer
     * @param secCxlc java.lang.Integer
     * @param secCxlcCiclo java.lang.Integer
     */
    public TdSecCxlcPK(java.lang.Integer cxlc, java.lang.Integer secCxlc, 
                       java.lang.Integer secCxlcCiclo) {
        this.cxlc = cxlc;
        this.secCxlc = secCxlc;
        this.secCxlcCiclo = secCxlcCiclo;
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
     * Get secCxlc value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getSecCxlc() {
        return this.secCxlc;
    }

    /**
     * Set secCxlc value.
     *
     * @param secCxlc java.lang.Integer
     */
    public void setSecCxlc(java.lang.Integer secCxlc) {
        this.secCxlc = secCxlc;
    }

    /**
     * Get secCxlcCiclo value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getSecCxlcCiclo() {
        return this.secCxlcCiclo;
    }

    /**
     * Set secCxlcCiclo value.
     *
     * @param secCxlcCiclo java.lang.Integer
     */
    public void setSecCxlcCiclo(java.lang.Integer secCxlcCiclo) {
        this.secCxlcCiclo = secCxlcCiclo;
    }
}
