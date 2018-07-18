package gob.shcp.sireh.domain.jdbc;

import java.io.Serializable;

/**
 * Composed primary object for TcUnidadEdo data.
 */
public class TcUnidadEdoPK implements Serializable {
    private java.lang.Integer idEdo;
    private java.lang.String idUnidad;
    private java.lang.Integer uniEdoCiclo;

    /**
     * Constructor for TcUnidadEdoPK class.
     */
    public TcUnidadEdoPK() {
    }

    /**
     * Constructor for TcUnidadEdoPK class.
     *
     * @param idEdo java.lang.Integer
     * @param idUnidad java.lang.String
     * @param uniEdoCiclo java.lang.Integer
     */
    public TcUnidadEdoPK(java.lang.Integer idEdo, java.lang.String idUnidad, 
                         java.lang.Integer uniEdoCiclo) {
        this.idEdo = idEdo;
        this.idUnidad = idUnidad;
        this.uniEdoCiclo = uniEdoCiclo;
    }

    /**
     * Get idEdo value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getIdEdo() {
        return this.idEdo;
    }

    /**
     * Set idEdo value.
     *
     * @param idEdo java.lang.Integer
     */
    public void setIdEdo(java.lang.Integer idEdo) {
        this.idEdo = idEdo;
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
     * Get uniEdoCiclo value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getUniEdoCiclo() {
        return this.uniEdoCiclo;
    }

    /**
     * Set uniEdoCiclo value.
     *
     * @param uniEdoCiclo java.lang.Integer
     */
    public void setUniEdoCiclo(java.lang.Integer uniEdoCiclo) {
        this.uniEdoCiclo = uniEdoCiclo;
    }

}
