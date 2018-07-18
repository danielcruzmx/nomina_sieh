package gob.shcp.sireh.domain.jdbc;

import java.io.Serializable;

/**
 * Composed primary object for TdPlazaAfectacion data.
 */
public class TdPlazaAfectacionPK implements Serializable {
    private java.lang.Long idOficioAfecta;
    private java.lang.String idOperacion;
    private java.lang.Integer idPlaza;
    private java.lang.Integer plafCiclo;

    /**
     * Constructor for TdPlazaAfectacionPK class.
     */
    public TdPlazaAfectacionPK() {
    }

    /**
     * Constructor for TdPlazaAfectacionPK class.
     *
     * @param idOficioAfecta java.lang.Long
     * @param idOperacion java.lang.String
     * @param idPlaza java.lang.Integer
     * @param plafCiclo java.lang.Integer
     */
    public TdPlazaAfectacionPK(java.lang.Long idOficioAfecta, 
                               java.lang.String idOperacion, 
                               java.lang.Integer idPlaza, 
                               java.lang.Integer plafCiclo) {
        this.idOficioAfecta = idOficioAfecta;
        this.idOperacion = idOperacion;
        this.idPlaza = idPlaza;
        this.plafCiclo = plafCiclo;
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
     * Get idOperacion value.
     *
     * @return java.lang.String
     */
    public java.lang.String getIdOperacion() {
        return this.idOperacion;
    }

    /**
     * Set idOperacion value.
     *
     * @param idOperacion java.lang.String
     */
    public void setIdOperacion(java.lang.String idOperacion) {
        this.idOperacion = idOperacion;
    }

    /**
     * Get idPlaza value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getIdPlaza() {
        return this.idPlaza;
    }

    /**
     * Set idPlaza value.
     *
     * @param idPlaza java.lang.Integer
     */
    public void setIdPlaza(java.lang.Integer idPlaza) {
        this.idPlaza = idPlaza;
    }

    /**
     * Get plafCiclo value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getPlafCiclo() {
        return this.plafCiclo;
    }

    /**
     * Set plafCiclo value.
     *
     * @param plafCiclo java.lang.Integer
     */
    public void setPlafCiclo(java.lang.Integer plafCiclo) {
        this.plafCiclo = plafCiclo;
    }

}
