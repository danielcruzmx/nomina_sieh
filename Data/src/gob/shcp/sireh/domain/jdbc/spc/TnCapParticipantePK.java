package gob.shcp.sireh.domain.jdbc.spc;

import java.io.Serializable;

/**
 * Composed primary object for TnCapParticipante data.
 */
public class TnCapParticipantePK implements Serializable {
    private java.lang.Integer idCurso;
    private java.lang.String rfcEmpleado;

    /**
     * Constructor for TnCapParticipantePK class.
     */
    public TnCapParticipantePK() {
    }

    /**
     * Constructor for TnCapParticipantePK class.
     *
     * @param idCurso java.lang.Integer
     * @param rfcEmpleado java.lang.String
     */
    public TnCapParticipantePK(java.lang.Integer idCurso, java.lang.String rfcEmpleado) {
        this.idCurso = idCurso;
        this.rfcEmpleado = rfcEmpleado;
    }

    /**
     * Get idCurso value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getIdCurso() {
        return this.idCurso;
    }

    /**
     * Set idCurso value.
     *
     * @param idCurso java.lang.Integer
     */
    public void setIdCurso(java.lang.Integer idCurso) {
        this.idCurso = idCurso;
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
