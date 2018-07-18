package gob.shcp.sireh.domain.jdbc;

import java.io.Serializable;

/**
 * Composed primary object for TnRegControl data.
 */
public class TnRegControlPK implements Serializable {
    private java.lang.String rcCveTipoNom;
    private java.lang.String rcNumComplemento;
    private java.lang.Integer rcQnaCaptura;

    /**
     * Constructor for TnRegControlPK class.
     */
    public TnRegControlPK() {
    }

    /**
     * Constructor for TnRegControlPK class.
     *
     * @param rcCveTipoNom java.lang.String
     * @param rcNumComplemento java.lang.String
     * @param rcQnaCaptura java.lang.Integer
     */
    public TnRegControlPK(java.lang.String rcCveTipoNom, 
                          java.lang.String rcNumComplemento, 
                          java.lang.Integer rcQnaCaptura) {
        this.rcCveTipoNom = rcCveTipoNom;
        this.rcNumComplemento = rcNumComplemento;
        this.rcQnaCaptura = rcQnaCaptura;

    }

    /**
     * Get rcCveTipoNom value.
     *
     * @return java.lang.String
     */
    public java.lang.String getRcCveTipoNom() {
        return this.rcCveTipoNom;
    }

    /**
     * Set rcCveTipoNom value.
     *
     * @param rcCveTipoNom java.lang.String
     */
    public void setRcCveTipoNom(java.lang.String rcCveTipoNom) {
        this.rcCveTipoNom = rcCveTipoNom;
    }

    /**
     * Get rcNumComplemento value.
     *
     * @return java.lang.String
     */
    public java.lang.String getRcNumComplemento() {
        return this.rcNumComplemento;
    }

    /**
     * Set rcNumComplemento value.
     *
     * @param rcNumComplemento java.lang.String
     */
    public void setRcNumComplemento(java.lang.String rcNumComplemento) {
        this.rcNumComplemento = rcNumComplemento;
    }

    /**
     * Get rcQnaCaptura value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getRcQnaCaptura() {
        return this.rcQnaCaptura;
    }

    /**
     * Set rcQnaCaptura value.
     *
     * @param rcQnaCaptura java.lang.Integer
     */
    public void setRcQnaCaptura(java.lang.Integer rcQnaCaptura) {
        this.rcQnaCaptura = rcQnaCaptura;
    }

}
