package gob.shcp.sireh.domain.jdbc;

import java.io.Serializable;

/**
 * Composed primary object for TcUnidad data.
 */
public class TcUnidadPK implements Serializable {
    private java.lang.String idUnidad;
    private java.lang.Integer uniCiclo;

    /**
     * Constructor for TcUnidadPK class.
     */
    public TcUnidadPK() {
    }

    /**
     * Constructor for TcUnidadPK class.
     *
     * @param idUnidad java.lang.String
     * @param uniCiclo java.lang.Integer
     */
    public TcUnidadPK(java.lang.String idUnidad, java.lang.Integer uniCiclo) {
        this.idUnidad = idUnidad;
        this.uniCiclo = uniCiclo;
    }

    /**
     * Get idUnidad value.
     *
     * @return java.lang.String
     */
    public java.lang.String getIdUnidad() {
        return this.idUnidad;
    }

    /**
     * Set idUnidad value.
     *
     * @param idUnidad java.lang.String
     */
    public void setIdUnidad(java.lang.String idUnidad) {
        this.idUnidad = idUnidad;
    }

    /**
     * Get uniCiclo value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getUniCiclo() {
        return this.uniCiclo;
    }

    /**
     * Set uniCiclo value.
     *
     * @param uniCiclo java.lang.Integer
     */
    public void setUniCiclo(java.lang.Integer uniCiclo) {
        this.uniCiclo = uniCiclo;
    }

}
