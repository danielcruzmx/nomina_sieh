package gob.shcp.sireh.domain.jdbc;

import java.io.Serializable;

/**
 * Composed primary object for TdExpAntecedentesAcademico data.
 */
public class TdExpAntecedentesAcademicoPK implements Serializable {
    private java.lang.Integer aacSecuencia;
    private java.lang.String idDocto;
    private java.lang.String rfcEmpleado;

    /**
     * Constructor for TdExpAntecedentesAcademicoPK class.
     */
    public TdExpAntecedentesAcademicoPK() {
    }

    /**
     * Constructor for TdExpAntecedentesAcademicoPK class.
     *
     * @param aacSecuencia java.lang.Integer
     * @param idDocto java.lang.String
     * @param rfcEmpleado java.lang.String
     */
    public TdExpAntecedentesAcademicoPK(java.lang.Integer aacSecuencia, 
                                        java.lang.String idDocto, 
                                        java.lang.String rfcEmpleado) {
        this.aacSecuencia = aacSecuencia;
        this.idDocto = idDocto;
        this.rfcEmpleado = rfcEmpleado;

    }

    /**
     * Get aacSecuencia value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getAacSecuencia() {
        return this.aacSecuencia;
    }

    /**
     * Set aacSecuencia value.
     *
     * @param aacSecuencia java.lang.Integer
     */
    public void setAacSecuencia(java.lang.Integer aacSecuencia) {
        this.aacSecuencia = aacSecuencia;
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
