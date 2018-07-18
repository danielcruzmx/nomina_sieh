package gob.shcp.sireh.domain.jdbc;

import gob.shcp.fsn.data.Domain;

import java.io.Serializable;

/**
 * Domain object for persistent TdExpCapacitacion data.
 */
public class TdExpCapacitacion implements Domain, Serializable {
    private TdExpCapacitacionPK idComposite;
    private int idExpRechazo;
    private java.lang.String capDescCapacitacion;
    private java.lang.String capDoctoRef;
    private java.lang.String capEstConcluidos;
    private java.util.Date fecModifico;
    private java.lang.String idCapacitacion;
    private int idInstEducat;
    private java.lang.String idStatus;
    private java.lang.String usuario;
    private Double capPromedio;

    /**
     * Constructor for TdExpCapacitacion class.
     */
    public TdExpCapacitacion() {
    }

    /**
     * Constructor for TdExpCapacitacion class.
     *
     * @param capSecuencia java.lang.Integer
     * @param idDocto java.lang.String
     * @param rfcEmpleado java.lang.String
     * @param idExpRechazo int
     * @param capDescCapacitacion java.lang.String
     * @param capDoctoRef java.lang.String
     * @param capEstConcluidos java.lang.String
     * @param fecModifico java.util.Date
     * @param idCapacitacion java.lang.String
     * @param idInstEducat int
     * @param idStatus java.lang.String
     * @param usuario java.lang.String
     * @param capPromedio Double
     */
    public TdExpCapacitacion(TdExpCapacitacionPK idComposite, int idExpRechazo, 
                             java.lang.String capDescCapacitacion, 
                             java.lang.String capDoctoRef, 
                             java.lang.String capEstConcluidos, 
                             java.util.Date fecModifico, 
                             java.lang.String idCapacitacion, int idInstEducat, 
                             java.lang.String idStatus, 
                             java.lang.String usuario, Double capPromedio) {
        this.idComposite = idComposite;
        this.idExpRechazo = idExpRechazo;
        this.capDescCapacitacion = capDescCapacitacion;
        this.capDoctoRef = capDoctoRef;
        this.capEstConcluidos = capEstConcluidos;
        this.fecModifico = fecModifico;
        this.idCapacitacion = idCapacitacion;
        this.idInstEducat = idInstEducat;
        this.idStatus = idStatus;
        this.usuario = usuario;
        this.capPromedio = capPromedio;
    }

    /**
     * Get capSecuencia value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getCapSecuencia() {
        if (idComposite == null) {
            return null;
        }
        return this.idComposite.getCapSecuencia();
    }

    /**
     * Get idDocto value.
     *
     * @return java.lang.String
     */
    public java.lang.String getIdDocto() {
        if (idComposite == null) {
            return null;
        }
        return this.idComposite.getIdDocto();
    }

    /**
     * Get rfcEmpleado value.
     *
     * @return java.lang.String
     */
    public java.lang.String getRfcEmpleado() {
        if (idComposite == null) {
            return null;
        }
        return this.idComposite.getRfcEmpleado();
    }

    /**
     * Get idExpRechazo value.
     *
     * @return int
     */
    public int getIdExpRechazo() {
        return this.idExpRechazo;
    }

    /**
     * Get capDescCapacitacion value.
     *
     * @return java.lang.String
     */
    public java.lang.String getCapDescCapacitacion() {
        return this.capDescCapacitacion;
    }

    /**
     * Get capDoctoRef value.
     *
     * @return java.lang.String
     */
    public java.lang.String getCapDoctoRef() {
        return this.capDoctoRef;
    }

    /**
     * Get capEstConcluidos value.
     *
     * @return java.lang.String
     */
    public java.lang.String getCapEstConcluidos() {
        return this.capEstConcluidos;
    }

    /**
     * Get fecModifico value.
     *
     * @return java.util.Date
     */
    public java.util.Date getFecModifico() {
        return this.fecModifico;
    }

    /**
     * Get idCapacitacion value.
     *
     * @return java.lang.String
     */
    public java.lang.String getIdCapacitacion() {
        return this.idCapacitacion;
    }

    /**
     * Get idInstEducat value.
     *
     * @return int
     */
    public int getIdInstEducat() {
        return this.idInstEducat;
    }

    /**
     * Get idStatus value.
     *
     * @return java.lang.String
     */
    public java.lang.String getIdStatus() {
        return this.idStatus;
    }

    /**
     * Get usuario value.
     *
     * @return java.lang.String
     */
    public java.lang.String getUsuario() {
        return this.usuario;
    }

    /**
     * Get capPromedio value.
     *
     * @return Double
     */
    public Double getCapPromedio() {
        return this.capPromedio;
    }

    /**
     * Set capSecuencia value.
     *
     * @param capSecuencia java.lang.Integer
     */
    public void setCapSecuencia(java.lang.Integer capSecuencia) {
        if (idComposite == null) {
            idComposite = new TdExpCapacitacionPK();
        }
        this.idComposite.setCapSecuencia(capSecuencia);
    }

    /**
     * Set idDocto value.
     *
     * @param idDocto java.lang.String
     */
    public void setIdDocto(java.lang.String idDocto) {
        if (idComposite == null) {
            idComposite = new TdExpCapacitacionPK();
        }
        this.idComposite.setIdDocto(idDocto);
    }

    /**
     * Set rfcEmpleado value.
     *
     * @param rfcEmpleado java.lang.String
     */
    public void setRfcEmpleado(java.lang.String rfcEmpleado) {
        if (idComposite == null) {
            idComposite = new TdExpCapacitacionPK();
        }
        this.idComposite.setRfcEmpleado(rfcEmpleado);
    }

    /**
     * Set idExpRechazo value.
     *
     * @param idExpRechazo int
     */
    public void setIdExpRechazo(int idExpRechazo) {
        this.idExpRechazo = idExpRechazo;
    }

    /**
     * Set capDescCapacitacion value.
     *
     * @param capDescCapacitacion java.lang.String
     */
    public void setCapDescCapacitacion(java.lang.String capDescCapacitacion) {
        this.capDescCapacitacion = capDescCapacitacion;
    }

    /**
     * Set capDoctoRef value.
     *
     * @param capDoctoRef java.lang.String
     */
    public void setCapDoctoRef(java.lang.String capDoctoRef) {
        this.capDoctoRef = capDoctoRef;
    }

    /**
     * Set capEstConcluidos value.
     *
     * @param capEstConcluidos java.lang.String
     */
    public void setCapEstConcluidos(java.lang.String capEstConcluidos) {
        this.capEstConcluidos = capEstConcluidos;
    }

    /**
     * Set fecModifico value.
     *
     * @param fecModifico java.util.Date
     */
    public void setFecModifico(java.util.Date fecModifico) {
        this.fecModifico = fecModifico;
    }

    /**
     * Set idCapacitacion value.
     *
     * @param idCapacitacion java.lang.String
     */
    public void setIdCapacitacion(java.lang.String idCapacitacion) {
        this.idCapacitacion = idCapacitacion;
    }

    /**
     * Set idInstEducat value.
     *
     * @param idInstEducat int
     */
    public void setIdInstEducat(int idInstEducat) {
        this.idInstEducat = idInstEducat;
    }

    /**
     * Set idStatus value.
     *
     * @param idStatus java.lang.String
     */
    public void setIdStatus(java.lang.String idStatus) {
        this.idStatus = idStatus;
    }

    /**
     * Set usuario value.
     *
     * @param usuario java.lang.String
     */
    public void setUsuario(java.lang.String usuario) {
        this.usuario = usuario;
    }

    /**
     * Set capPromedio value.
     *
     * @param capPromedio Double
     */
    public void setCapPromedio(Double capPromedio) {
        this.capPromedio = capPromedio;
    }

    /**
     * Set identity value.
     *
     * @param idComposite Serializable
     */
    public void setIdentity(Serializable idComposite) {
        this.idComposite = (TdExpCapacitacionPK)idComposite;
    }

    /**
     * Get identity value.
     *
     * @return Serializable
     */
    public Serializable getIdentity() {
        return this.idComposite;
    }
}
