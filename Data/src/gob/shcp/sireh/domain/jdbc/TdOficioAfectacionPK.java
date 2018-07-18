package gob.shcp.sireh.domain.jdbc;

import java.io.Serializable;

/**
 * Composed primary object for TdOficioAfectacion data.
 */
public class TdOficioAfectacionPK implements Serializable {
    private java.lang.Long idOficioAfecta;
    private java.lang.Integer ofacCiclo;

    /**
     * Constructor for TdOficioAfectacionPK class.
     */
    public TdOficioAfectacionPK() {
    }

    /**
     * Constructor for TdOficioAfectacionPK class.
     *
     * @param idOficioAfecta java.lang.Long
     * @param ofacCiclo java.lang.Integer
     */
    public TdOficioAfectacionPK(java.lang.Long idOficioAfecta, 
                                java.lang.Integer ofacCiclo) {
        this.idOficioAfecta = idOficioAfecta;
        this.ofacCiclo = ofacCiclo;

    }

    /**
     * Get idOficioAfecta value.
     *
     * @return java.lang.Long
     */
    public java.lang.Long getIdOficioAfecta() {
        return this.idOficioAfecta;
    }

    /**
     * Set idOficioAfecta value.
     *
     * @param idOficioAfecta java.lang.Long
     */
    public void setIdOficioAfecta(java.lang.Long idOficioAfecta) {
        this.idOficioAfecta = idOficioAfecta;
    }

    /**
     * Get ofacCiclo value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getOfacCiclo() {
        return this.ofacCiclo;
    }

    /**
     * Set ofacCiclo value.
     *
     * @param ofacCiclo java.lang.Integer
     */
    public void setOfacCiclo(java.lang.Integer ofacCiclo) {
        this.ofacCiclo = ofacCiclo;
    }

}
