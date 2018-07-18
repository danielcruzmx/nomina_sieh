package gob.shcp.sireh.domain.jdbc;

import java.io.Serializable;


/**
 * Composed primary object for TdExpRfc data.
 */
public class TdExpRfcPK implements Serializable {
    private java.lang.String idDocto;
    private java.lang.String rfcEmpleado;
    private java.lang.Integer rfcSecuencia;

    /**
     * Constructor for TdExpRfcPK class.
     */
    public TdExpRfcPK() {
    }

    /**
     * Constructor for TdExpRfcPK class.
     *
     * @param idDocto java.lang.String
     * @param rfcEmpleado java.lang.String
     * @param rfcSecuencia java.lang.Integer
     */
    public TdExpRfcPK(java.lang.String idDocto, java.lang.String rfcEmpleado, 
                      java.lang.Integer rfcSecuencia) {
        this.idDocto = idDocto;
        this.rfcEmpleado = rfcEmpleado;
        this.rfcSecuencia = rfcSecuencia;
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

    /**
     * Get rfcSecuencia value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getRfcSecuencia() {
        return this.rfcSecuencia;
    }

    /**
     * Set rfcSecuencia value.
     *
     * @param rfcSecuencia java.lang.Integer
     */
    public void setRfcSecuencia(java.lang.Integer rfcSecuencia) {
        this.rfcSecuencia = rfcSecuencia;
    }

}
