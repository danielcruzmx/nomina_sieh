package gob.shcp.sireh.domain.jdbc;

import java.io.Serializable;

/**
 * Composed primary object for TnHusMovto data.
 */
public class TnHusMovtoPK implements Serializable {
    private java.lang.String husmovMovto;
    private java.lang.String husmovPuesto;
    private java.lang.String husmovRfc;
    private java.util.Date husmovVigencia;

    /**
     * Constructor for TnHusMovtoPK class.
     */
    public TnHusMovtoPK() {
    }

    /**
     * Constructor for TnHusMovtoPK class.
     *
     * @param husmovMovto java.lang.String
     * @param husmovPuesto java.lang.String
     * @param husmovRfc java.lang.String
     * @param husmovVigencia java.util.Date
     */
    public TnHusMovtoPK(java.lang.String husmovMovto, 
                        java.lang.String husmovPuesto, 
                        java.lang.String husmovRfc, 
                        java.util.Date husmovVigencia) {
        this.husmovMovto = husmovMovto;
        this.husmovPuesto = husmovPuesto;
        this.husmovRfc = husmovRfc;
        this.husmovVigencia = husmovVigencia;
    }

    /**
     * Get husmovMovto value.
     *
     * @return java.lang.String
     */
    public java.lang.String getHusmovMovto() {
        return this.husmovMovto;
    }

    /**
     * Set husmovMovto value.
     *
     * @param husmovMovto java.lang.String
     */
    public void setHusmovMovto(java.lang.String husmovMovto) {
        this.husmovMovto = husmovMovto;
    }

    /**
     * Get husmovPuesto value.
     *
     * @return java.lang.String
     */
    public java.lang.String getHusmovPuesto() {
        return this.husmovPuesto;
    }

    /**
     * Set husmovPuesto value.
     *
     * @param husmovPuesto java.lang.String
     */
    public void setHusmovPuesto(java.lang.String husmovPuesto) {
        this.husmovPuesto = husmovPuesto;
    }

    /**
     * Get husmovRfc value.
     *
     * @return java.lang.String
     */
    public java.lang.String getHusmovRfc() {
        return this.husmovRfc;
    }

    /**
     * Set husmovRfc value.
     *
     * @param husmovRfc java.lang.String
     */
    public void setHusmovRfc(java.lang.String husmovRfc) {
        this.husmovRfc = husmovRfc;
    }

    /**
     * Get husmovVigencia value.
     *
     * @return java.util.Date
     */
    public java.util.Date getHusmovVigencia() {
        return this.husmovVigencia;
    }

    /**
     * Set husmovVigencia value.
     *
     * @param husmovVigencia java.util.Date
     */
    public void setHusmovVigencia(java.util.Date husmovVigencia) {
        this.husmovVigencia = husmovVigencia;
    }

}
