package gob.shcp.sireh.domain.jdbc;

import java.io.Serializable;

/**
 * Composed primary object for TcAtributoPuesto data.
 */
public class TcAtributoPuestoPK implements Serializable {
    private java.util.Date apFin;
    private java.lang.String idAtributoPuesto;

    /**
     * Constructor for TcAtributoPuestoPK class.
     */
    public TcAtributoPuestoPK() {
    }

    /**
     * Constructor for TcAtributoPuestoPK class.
     *
     * @param apFin java.util.Date
     * @param idAtributoPuesto java.lang.String
     */
    public TcAtributoPuestoPK(java.util.Date apFin, 
                              java.lang.String idAtributoPuesto) {
        this.apFin = apFin;
        this.idAtributoPuesto = idAtributoPuesto;

    }

    /**
     * Get apFin value.
     *
     * @return java.util.Date
     */
    public java.util.Date getApFin() {
        return this.apFin;
    }

    /**
     * Set apFin value.
     *
     * @param apFin java.util.Date
     */
    public void setApFin(java.util.Date apFin) {
        this.apFin = apFin;
    }

    /**
     * Get idAtributoPuesto value.
     *
     * @return java.lang.String
     */
    public java.lang.String getIdAtributoPuesto() {
        return this.idAtributoPuesto;
    }

    /**
     * Set idAtributoPuesto value.
     *
     * @param idAtributoPuesto java.lang.String
     */
    public void setIdAtributoPuesto(java.lang.String idAtributoPuesto) {
        this.idAtributoPuesto = idAtributoPuesto;
    }

}
