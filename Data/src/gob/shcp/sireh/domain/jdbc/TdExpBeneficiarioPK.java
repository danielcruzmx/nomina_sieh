package gob.shcp.sireh.domain.jdbc;

import java.io.Serializable;

/**
 * Composed primary object for TdExpBeneficiario data.
 */
public class TdExpBeneficiarioPK implements Serializable {
    private java.lang.Integer benSecuencia;
    private java.lang.String idDocto;
    private java.lang.String rfcEmpleado;

    /**
     * Constructor for TdExpBeneficiarioPK class.
     */
    public TdExpBeneficiarioPK() {
    }

    /**
     * Constructor for TdExpBeneficiarioPK class.
     *
     * @param benSecuencia java.lang.Integer
     * @param idDocto java.lang.String
     * @param rfcEmpleado java.lang.String
     */
    public TdExpBeneficiarioPK(java.lang.Integer benSecuencia, 
                               java.lang.String idDocto, 
                               java.lang.String rfcEmpleado) {
        this.benSecuencia = benSecuencia;
        this.idDocto = idDocto;
        this.rfcEmpleado = rfcEmpleado;
    }

    /**
     * Get benSecuencia value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getBenSecuencia() {
        return this.benSecuencia;
    }

    /**
     * Set benSecuencia value.
     *
     * @param benSecuencia java.lang.Integer
     */
    public void setBenSecuencia(java.lang.Integer benSecuencia) {
        this.benSecuencia = benSecuencia;
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
