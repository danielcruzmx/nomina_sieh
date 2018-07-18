package gob.shcp.sireh.domain.jdbc;

import java.io.Serializable;

/**
 * Composed primary object for TdExpExperienciaLaboral data.
 */
public class TdExpExperienciaLaboralPK implements Serializable {
    private java.lang.Integer expSecuencia;
    private java.lang.String idDocto;
    private java.lang.String rfcEmpleado;

    /**
     * Constructor for TdExpExperienciaLaboralPK class.
     */
    public TdExpExperienciaLaboralPK() {
    }

    /**
     * Constructor for TdExpExperienciaLaboralPK class.
     *
     * @param expSecuencia java.lang.Integer
     * @param idDocto java.lang.String
     * @param rfcEmpleado java.lang.String
     */
    public TdExpExperienciaLaboralPK(java.lang.Integer expSecuencia, 
                                     java.lang.String idDocto, 
                                     java.lang.String rfcEmpleado) {
        this.expSecuencia = expSecuencia;
        this.idDocto = idDocto;
        this.rfcEmpleado = rfcEmpleado;

    }

    /**
     * Get expSecuencia value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getExpSecuencia() {
        return this.expSecuencia;
    }

    /**
     * Set expSecuencia value.
     *
     * @param expSecuencia java.lang.Integer
     */
    public void setExpSecuencia(java.lang.Integer expSecuencia) {
        this.expSecuencia = expSecuencia;
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
