package gob.shcp.sireh.domain.jdbc;

import java.io.Serializable;

/**
 * Composed primary object for TdNmHistorico data.
 */
public class TdNmHistoricoPK implements Serializable {
    private java.lang.Integer nmhCausal;
    private java.lang.Integer nmhCiclo;
    private java.lang.String nmhNumDocto;
    private java.lang.String nmhRfc;
    private java.lang.String nmhRfcUnico;

    /**
     * Constructor for TdNmHistoricoPK class.
     */
    public TdNmHistoricoPK() {
    }

    /**
     * Constructor for TdNmHistoricoPK class.
     *
     * @param nmhCausal java.lang.Integer
     * @param nmhCiclo java.lang.Integer
     * @param nmhNumDocto java.lang.String
     * @param nmhRfc java.lang.String
     * @param nmhRfcUnico java.lang.String
     */
    public TdNmHistoricoPK(java.lang.Integer nmhCausal, 
                           java.lang.Integer nmhCiclo, 
                           java.lang.String nmhNumDocto, 
                           java.lang.String nmhRfc, 
                           java.lang.String nmhRfcUnico) {
        this.nmhCausal = nmhCausal;
        this.nmhCiclo = nmhCiclo;
        this.nmhNumDocto = nmhNumDocto;
        this.nmhRfc = nmhRfc;
        this.nmhRfcUnico = nmhRfcUnico;

    }

    /**
     * Get nmhCausal value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getNmhCausal() {
        return this.nmhCausal;
    }

    /**
     * Set nmhCausal value.
     *
     * @param nmhCausal java.lang.Integer
     */
    public void setNmhCausal(java.lang.Integer nmhCausal) {
        this.nmhCausal = nmhCausal;
    }

    /**
     * Get nmhCiclo value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getNmhCiclo() {
        return this.nmhCiclo;
    }

    /**
     * Set nmhCiclo value.
     *
     * @param nmhCiclo java.lang.Integer
     */
    public void setNmhCiclo(java.lang.Integer nmhCiclo) {
        this.nmhCiclo = nmhCiclo;
    }

    /**
     * Get nmhNumDocto value.
     *
     * @return java.lang.String
     */
    public java.lang.String getNmhNumDocto() {
        return this.nmhNumDocto;
    }

    /**
     * Set nmhNumDocto value.
     *
     * @param nmhNumDocto java.lang.String
     */
    public void setNmhNumDocto(java.lang.String nmhNumDocto) {
        this.nmhNumDocto = nmhNumDocto;
    }

    /**
     * Get nmhRfc value.
     *
     * @return java.lang.String
     */
    public java.lang.String getNmhRfc() {
        return this.nmhRfc;
    }

    /**
     * Set nmhRfc value.
     *
     * @param nmhRfc java.lang.String
     */
    public void setNmhRfc(java.lang.String nmhRfc) {
        this.nmhRfc = nmhRfc;
    }

    /**
     * Get nmhRfcUnico value.
     *
     * @return java.lang.String
     */
    public java.lang.String getNmhRfcUnico() {
        return this.nmhRfcUnico;
    }

    /**
     * Set nmhRfcUnico value.
     *
     * @param nmhRfcUnico java.lang.String
     */
    public void setNmhRfcUnico(java.lang.String nmhRfcUnico) {
        this.nmhRfcUnico = nmhRfcUnico;
    }

}
