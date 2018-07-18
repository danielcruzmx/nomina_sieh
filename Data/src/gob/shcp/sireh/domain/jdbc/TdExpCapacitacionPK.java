package gob.shcp.sireh.domain.jdbc;

import java.io.Serializable;

/**
 * Composed primary object for TdExpCapacitacion data.
 */
public class TdExpCapacitacionPK implements Serializable {
    private java.lang.Integer capSecuencia;
    private java.lang.String idDocto;
    private java.lang.String rfcEmpleado;

    /**
     * Constructor for TdExpCapacitacionPK class.
     */
    public TdExpCapacitacionPK() {
    }

    /**
     * Constructor for TdExpCapacitacionPK class.
     *
     * @param capSecuencia java.lang.Integer
     * @param idDocto java.lang.String
     * @param rfcEmpleado java.lang.String
     */
    public TdExpCapacitacionPK(java.lang.Integer capSecuencia, 
                               java.lang.String idDocto, 
                               java.lang.String rfcEmpleado) {
        this.capSecuencia = capSecuencia;
        this.idDocto = idDocto;
        this.rfcEmpleado = rfcEmpleado;
    }

    /**
     * Get capSecuencia value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getCapSecuencia() {
        return this.capSecuencia;
    }

    /**
     * Set capSecuencia value.
     *
     * @param capSecuencia java.lang.Integer
     */
    public void setCapSecuencia(java.lang.Integer capSecuencia) {
        this.capSecuencia = capSecuencia;
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
