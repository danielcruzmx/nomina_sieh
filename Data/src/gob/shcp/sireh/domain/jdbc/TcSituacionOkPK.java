package gob.shcp.sireh.domain.jdbc;

import java.io.Serializable;

/**
 * Composed primary object for TcSituacionOk data.
 */
public class TcSituacionOkPK implements Serializable {
    private java.lang.String idSitPlazaDestino;
    private java.lang.String idSitPlazaOrigen;

    /**
     * Constructor for TcSituacionOkPK class.
     */
    public TcSituacionOkPK() {
    }

    /**
     * Constructor for TcSituacionOkPK class.
     *
     * @param idSitPlazaDestino java.lang.String
     * @param idSitPlazaOrigen java.lang.String
     */
    public TcSituacionOkPK(java.lang.String idSitPlazaDestino, 
                           java.lang.String idSitPlazaOrigen) {
        this.idSitPlazaDestino = idSitPlazaDestino;
        this.idSitPlazaOrigen = idSitPlazaOrigen;

    }

    /**
     * Get idSitPlazaDestino value.
     *
     * @return java.lang.String
     */
    public java.lang.String getIdSitPlazaDestino() {
        return this.idSitPlazaDestino;
    }

    /**
     * Set idSitPlazaDestino value.
     *
     * @param idSitPlazaDestino java.lang.String
     */
    public void setIdSitPlazaDestino(java.lang.String idSitPlazaDestino) {
        this.idSitPlazaDestino = idSitPlazaDestino;
    }

    /**
     * Get idSitPlazaOrigen value.
     *
     * @return java.lang.String
     */
    public java.lang.String getIdSitPlazaOrigen() {
        return this.idSitPlazaOrigen;
    }

    /**
     * Set idSitPlazaOrigen value.
     *
     * @param idSitPlazaOrigen java.lang.String
     */
    public void setIdSitPlazaOrigen(java.lang.String idSitPlazaOrigen) {
        this.idSitPlazaOrigen = idSitPlazaOrigen;
    }

}
