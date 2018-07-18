package gob.shcp.sireh.domain.jdbc;

import java.io.Serializable;

/**
 * Composed primary object for TdExpFamiliarDepsBenef data.
 */
public class TdExpFamiliarDepsBenefPK implements Serializable {
    private java.lang.Integer fdbSecuencia;
    private java.lang.String idDocto;
    private java.lang.String rfcEmpleado;

    /**
     * Constructor for TdExpFamiliarDepsBenefPK class.
     */
    public TdExpFamiliarDepsBenefPK() {
    }

    /**
     * Constructor for TdExpFamiliarDepsBenefPK class.
     *
     * @param fdbSecuencia java.lang.Integer
     * @param idDocto java.lang.String
     * @param rfcEmpleado java.lang.String
     */
    public TdExpFamiliarDepsBenefPK(java.lang.Integer fdbSecuencia, 
                                    java.lang.String idDocto, 
                                    java.lang.String rfcEmpleado) {
        this.fdbSecuencia = fdbSecuencia;
        this.idDocto = idDocto;
        this.rfcEmpleado = rfcEmpleado;
    }

    /**
     * Get fdbSecuencia value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getFdbSecuencia() {
        return this.fdbSecuencia;
    }

    /**
     * Set fdbSecuencia value.
     *
     * @param fdbSecuencia java.lang.Integer
     */
    public void setFdbSecuencia(java.lang.Integer fdbSecuencia) {
        this.fdbSecuencia = fdbSecuencia;
    }

    /**
     * Get idDocto value.
     *
     * @return java.lang.String
     */
    public java.lang.String getIdDocto() {
        return this.idDocto;
    }

    /**
     * Set idDocto value.
     *
     * @param idDocto java.lang.String
     */
    public void setIdDocto(java.lang.String idDocto) {
        this.idDocto = idDocto;
    }

    /**
     * Get rfcEmpleado value.
     *
     * @return java.lang.String
     */
    public java.lang.String getRfcEmpleado() {
        return this.rfcEmpleado;
    }

    /**
     * Set rfcEmpleado value.
     *
     * @param rfcEmpleado java.lang.String
     */
    public void setRfcEmpleado(java.lang.String rfcEmpleado) {
        this.rfcEmpleado = rfcEmpleado;
    }

}
