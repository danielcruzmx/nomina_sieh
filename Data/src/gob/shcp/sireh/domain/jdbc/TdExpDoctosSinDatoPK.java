package gob.shcp.sireh.domain.jdbc;

import java.io.Serializable;

/**
 * Composed primary object for TdExpDoctosSinDato data.
 */
public class TdExpDoctosSinDatoPK implements Serializable {
    private java.lang.Integer dsdSecuencia;
    private java.lang.String idDocto;
    private java.lang.String rfcEmpleado;

    /**
     * Constructor for TdExpDoctosSinDatoPK class.
     */
    public TdExpDoctosSinDatoPK() {
    }

    /**
     * Constructor for TdExpDoctosSinDatoPK class.
     *
     * @param dsdSecuencia java.lang.Integer
     * @param idDocto java.lang.String
     * @param rfcEmpleado java.lang.String
     */
    public TdExpDoctosSinDatoPK(java.lang.Integer dsdSecuencia, 
                                java.lang.String idDocto, 
                                java.lang.String rfcEmpleado) {
        this.dsdSecuencia = dsdSecuencia;
        this.idDocto = idDocto;
        this.rfcEmpleado = rfcEmpleado;

    }

    /**
     * Get dsdSecuencia value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getDsdSecuencia() {
        return this.dsdSecuencia;
    }

    /**
     * Set dsdSecuencia value.
     *
     * @param dsdSecuencia java.lang.Integer
     */
    public void setDsdSecuencia(java.lang.Integer dsdSecuencia) {
        this.dsdSecuencia = dsdSecuencia;
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
