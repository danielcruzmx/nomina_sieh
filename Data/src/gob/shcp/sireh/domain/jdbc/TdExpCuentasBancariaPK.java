package gob.shcp.sireh.domain.jdbc;

import java.io.Serializable;

/**
 * Composed primary object for TdExpCuentasBancaria data.
 */
public class TdExpCuentasBancariaPK implements Serializable {
    private java.lang.Integer ctaSecuencia;
    private java.lang.String idDocto;
    private java.lang.String rfcEmpleado;

    /**
     * Constructor for TdExpCuentasBancariaPK class.
     */
    public TdExpCuentasBancariaPK() {
    }


    /**
     * Constructor for TdExpCuentasBancariaPK class.
     *
     * @param ctaSecuencia java.lang.Integer
     * @param idDocto java.lang.String
     * @param rfcEmpleado java.lang.String
     */
    public TdExpCuentasBancariaPK(java.lang.Integer ctaSecuencia, 
                                  java.lang.String idDocto, 
                                  java.lang.String rfcEmpleado) {
        this.ctaSecuencia = ctaSecuencia;
        this.idDocto = idDocto;
        this.rfcEmpleado = rfcEmpleado;

    }


    /**
     * Get ctaSecuencia value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getCtaSecuencia() {
        return this.ctaSecuencia;
    }

    /**
     * Set ctaSecuencia value.
     *
     * @param ctaSecuencia java.lang.Integer
     */
    public void setCtaSecuencia(java.lang.Integer ctaSecuencia) {
        this.ctaSecuencia = ctaSecuencia;
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
