package gob.shcp.sireh.domain.jdbc;

import java.io.Serializable;

/**
 * Composed primary object for TnComprobante data.
 */
public class TnComprobantePK implements Serializable {

    private java.lang.String compRfc;
    private java.lang.Long idComprobante;
    private java.lang.Integer idPaquete;

    /**
     * Constructor for TnComprobantePK class.
     */
    public TnComprobantePK() {
    }

    /**
     * Constructor for TnComprobantePK class.
     *
     * @param compRfc java.lang.String
     * @param idComprobante java.lang.Long
     * @param idPaquete java.lang.Integer
     */
    public TnComprobantePK(java.lang.String compRfc, 
                           java.lang.Long idComprobante, 
                           java.lang.Integer idPaquete) {
        this.compRfc = compRfc;
        this.idComprobante = idComprobante;
        this.idPaquete = idPaquete;
    }

    /**
     * Get compRfc value.
     *
     * @return java.lang.String
     */
    public java.lang.String getCompRfc() {
        return this.compRfc;
    }

    /**
     * Set compRfc value.
     *
     * @param compRfc java.lang.String
     */
    public void setCompRfc(java.lang.String compRfc) {
        this.compRfc = compRfc;
    }

    /**
     * Get idComprobante value.
     *
     * @return java.lang.Long
     */
    public java.lang.Long getIdComprobante() {
        return this.idComprobante;
    }

    /**
     * Set idComprobante value.
     *
     * @param idComprobante java.lang.Long
     */
    public void setIdComprobante(java.lang.Long idComprobante) {
        this.idComprobante = idComprobante;
    }

    /**
     * Get idPaquete value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getIdPaquete() {
        return this.idPaquete;
    }

    /**
     * Set idPaquete value.
     *
     * @param idPaquete java.lang.Integer
     */
    public void setIdPaquete(java.lang.Integer idPaquete) {
        this.idPaquete = idPaquete;
    }
}
