package gob.shcp.sireh.domain.jdbc;

import java.io.Serializable;

/**
 * Composed primary object for TcDistUnidad data.
 */
public class TcDistUnidadPK implements Serializable {
    private java.lang.Integer idDistUnidad;
    private java.lang.String idUnidad;

    /**
     * Constructor for TcDistUnidadPK class.
     */
    public TcDistUnidadPK() {
    }

    /**
     * Constructor for TcDistUnidadPK class.
     *
     * @param idDistUnidad java.lang.Integer
     * @param idUnidad java.lang.String
     */
    public TcDistUnidadPK(java.lang.Integer idDistUnidad, 
                          java.lang.String idUnidad) {
        this.idDistUnidad = idDistUnidad;
        this.idUnidad = idUnidad;

    }

    /**
     * Get idDistUnidad value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getIdDistUnidad() {
        return this.idDistUnidad;
    }

    /**
     * Set idDistUnidad value.
     *
     * @param idDistUnidad java.lang.Integer
     */
    public void setIdDistUnidad(java.lang.Integer idDistUnidad) {
        this.idDistUnidad = idDistUnidad;
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

}
