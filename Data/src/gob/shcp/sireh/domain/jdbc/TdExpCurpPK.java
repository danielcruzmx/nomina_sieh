package gob.shcp.sireh.domain.jdbc;

import java.io.Serializable;

/**
 * Composed primary object for TdExpCurp data.
 */
public class TdExpCurpPK implements Serializable {
    private java.lang.Integer curpSecuencia;
    private java.lang.String idDocto;
    private java.lang.String rfcEmpleado;

    /**
     * Constructor for TdExpCurpPK class.
     */
    public TdExpCurpPK() {
    }

    /**
     * Constructor for TdExpCurpPK class.
     *
     * @param curpSecuencia java.lang.Integer
     * @param idDocto java.lang.String
     * @param rfcEmpleado java.lang.String
     */
    public TdExpCurpPK(java.lang.Integer curpSecuencia, 
                       java.lang.String idDocto, 
                       java.lang.String rfcEmpleado) {
        this.curpSecuencia = curpSecuencia;
        this.idDocto = idDocto;
        this.rfcEmpleado = rfcEmpleado;

    }

    /**
     * Get curpSecuencia value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getCurpSecuencia() {
        return this.curpSecuencia;
    }

    /**
     * Set curpSecuencia value.
     *
     * @param curpSecuencia java.lang.Integer
     */
    public void setCurpSecuencia(java.lang.Integer curpSecuencia) {
        this.curpSecuencia = curpSecuencia;
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
