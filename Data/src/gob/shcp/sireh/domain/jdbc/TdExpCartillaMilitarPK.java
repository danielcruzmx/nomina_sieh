package gob.shcp.sireh.domain.jdbc;

import java.io.Serializable;

/**
 * Composed primary object for TdExpCartillaMilitar data.
 */
public class TdExpCartillaMilitarPK implements Serializable {
    private java.lang.Integer cmiSecuencia;
    private java.lang.String idDocto;
    private java.lang.String rfcEmpleado;

    /**
     * Constructor for TdExpCartillaMilitarPK class.
     */
    public TdExpCartillaMilitarPK() {
    }

    /**
     * Constructor for TdExpCartillaMilitarPK class.
     *
     * @param cmiSecuencia java.lang.Integer
     * @param idDocto java.lang.String
     * @param rfcEmpleado java.lang.String
     */
    public TdExpCartillaMilitarPK(java.lang.Integer cmiSecuencia, 
                                  java.lang.String idDocto, 
                                  java.lang.String rfcEmpleado) {
        this.cmiSecuencia = cmiSecuencia;
        this.idDocto = idDocto;
        this.rfcEmpleado = rfcEmpleado;
    }

    /**
     * Get cmiSecuencia value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getCmiSecuencia() {
        return this.cmiSecuencia;
    }

    /**
     * Set cmiSecuencia value.
     *
     * @param cmiSecuencia java.lang.Integer
     */
    public void setCmiSecuencia(java.lang.Integer cmiSecuencia) {
        this.cmiSecuencia = cmiSecuencia;
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
