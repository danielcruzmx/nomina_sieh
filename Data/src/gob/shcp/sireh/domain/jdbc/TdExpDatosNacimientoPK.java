package gob.shcp.sireh.domain.jdbc;

import java.io.Serializable;

/**
 * Composed primary object for TdExpDatosNacimiento data.
 */
public class TdExpDatosNacimientoPK implements Serializable {
    private java.lang.Integer dnaSecuencia;
    private java.lang.String idDocto;
    private java.lang.String rfcEmpleado;

    /**
     * Constructor for TdExpDatosNacimientoPK class.
     */
    public TdExpDatosNacimientoPK() {
    }

    /**
     * Constructor for TdExpDatosNacimientoPK class.
     *
     * @param dnaSecuencia java.lang.Integer
     * @param idDocto java.lang.String
     * @param rfcEmpleado java.lang.String
     */
    public TdExpDatosNacimientoPK(java.lang.Integer dnaSecuencia, 
                                  java.lang.String idDocto, 
                                  java.lang.String rfcEmpleado) {
        this.dnaSecuencia = dnaSecuencia;
        this.idDocto = idDocto;
        this.rfcEmpleado = rfcEmpleado;

    }

    /**
     * Get dnaSecuencia value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getDnaSecuencia() {
        return this.dnaSecuencia;
    }

    /**
     * Set dnaSecuencia value.
     *
     * @param dnaSecuencia java.lang.Integer
     */
    public void setDnaSecuencia(java.lang.Integer dnaSecuencia) {
        this.dnaSecuencia = dnaSecuencia;
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
