package gob.shcp.sireh.domain.jdbc;

import java.io.Serializable;

/**
 * Composed primary object for TdExpFechasLaborale data.
 */
public class TdExpFechasLaboralesPK implements Serializable {
    private java.lang.Integer felSecuencia;
    private java.lang.String idDocto;
    private java.lang.String rfcEmpleado;

    /**
     * Constructor for TdExpFechasLaboralePK class.
     */
    public TdExpFechasLaboralesPK() {
    }

    /**
     * Constructor for TdExpFechasLaboralePK class.
     *
     * @param felSecuencia java.lang.Integer
     * @param idDocto java.lang.String
     * @param rfcEmpleado java.lang.String
     */
    public TdExpFechasLaboralesPK(java.lang.Integer felSecuencia, 
                                  java.lang.String idDocto, 
                                  java.lang.String rfcEmpleado) {
        this.felSecuencia = felSecuencia;
        this.idDocto = idDocto;
        this.rfcEmpleado = rfcEmpleado;
    }

    /**
     * Get felSecuencia value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getFelSecuencia() {
        return this.felSecuencia;
    }

    /**
     * Set felSecuencia value.
     *
     * @param felSecuencia java.lang.Integer
     */
    public void setFelSecuencia(java.lang.Integer felSecuencia) {
        this.felSecuencia = felSecuencia;
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
