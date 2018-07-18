package gob.shcp.sireh.domain.jdbc;

import java.io.Serializable;

/**
 * Composed primary object for TcProyRegulariza data.
 */
public class TcProyRegularizaPK implements Serializable {
    private java.lang.String idProyRegul;
    private java.lang.Integer prCiclo;

    /**
     * Constructor for TcProyRegularizaPK class.
     */
    public TcProyRegularizaPK() {
    }

    /**
     * Constructor for TcProyRegularizaPK class.
     *
     * @param idProyRegul java.lang.String
     * @param prCiclo java.lang.Integer
     */
    public TcProyRegularizaPK(java.lang.String idProyRegul, 
                              java.lang.Integer prCiclo) {
        this.idProyRegul = idProyRegul;
        this.prCiclo = prCiclo;

    }

    /**
     * Get idProyRegul value.
     *
     * @return java.lang.String
     */
    public java.lang.String getIdProyRegul() {
        return this.idProyRegul;
    }

    /**
     * Set idProyRegul value.
     *
     * @param idProyRegul java.lang.String
     */
    public void setIdProyRegul(java.lang.String idProyRegul) {
        this.idProyRegul = idProyRegul;
    }

    /**
     * Get prCiclo value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getPrCiclo() {
        return this.prCiclo;
    }

    /**
     * Set prCiclo value.
     *
     * @param prCiclo java.lang.Integer
     */
    public void setPrCiclo(java.lang.Integer prCiclo) {
        this.prCiclo = prCiclo;
    }

}
