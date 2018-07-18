package gob.shcp.sireh.domain.jdbc;

import java.io.Serializable;

/**
 * Composed primary object for TdExpDomicilioParticular data.
 */
public class TdExpDomicilioParticularPK implements Serializable {
    private java.lang.Integer domSecuencia;
    private java.lang.String idDocto;
    private java.lang.String rfcEmpleado;

    /**
     * Constructor for TdExpDomicilioParticularPK class.
     */
    public TdExpDomicilioParticularPK() {
    }

    /**
     * Constructor for TdExpDomicilioParticularPK class.
     *
     * @param domSecuencia java.lang.Integer
     * @param idDocto java.lang.String
     * @param rfcEmpleado java.lang.String
     */
    public TdExpDomicilioParticularPK(java.lang.Integer domSecuencia, 
                                      java.lang.String idDocto, 
                                      java.lang.String rfcEmpleado) {
        this.domSecuencia = domSecuencia;
        this.idDocto = idDocto;
        this.rfcEmpleado = rfcEmpleado;
    }

    /**
     * Get domSecuencia value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getDomSecuencia() {
        return this.domSecuencia;
    }

    /**
     * Set domSecuencia value.
     *
     * @param domSecuencia java.lang.Integer
     */
    public void setDomSecuencia(java.lang.Integer domSecuencia) {
        this.domSecuencia = domSecuencia;
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
