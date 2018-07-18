package gob.shcp.sireh.domain.jdbc;

import gob.shcp.fsn.data.Domain;


import java.io.Serializable;

/**
 * Domain object for persistent TdExpFechasLaborale data.
 */
public class TdExpFechasLaborales implements Domain, Serializable {
    private TdExpFechasLaboralesPK idComposite;
    private int idExpRechazo;
    private java.util.Date fecModifico;
    private java.util.Date felFechaLaboral;
    private java.lang.String idFecLab;
    private java.lang.String idStatus;
    private java.lang.String usuario;
    private java.lang.String felDoctoRef;

    /**
     * Constructor for TdExpFechasLaborale class.
     */
    public TdExpFechasLaborales() {
    }

    /**
     * Constructor for TdExpFechasLaborale class.
     *
     * @param felSecuencia java.lang.Integer
     * @param idDocto java.lang.String
     * @param rfcEmpleado java.lang.String
     * @param idExpRechazo int
     * @param fecModifico java.util.Date
     * @param felFechaLaboral java.util.Date
     * @param idFecLab java.lang.String
     * @param idStatus java.lang.String
     * @param usuario java.lang.String
     * @param felDoctoRef java.lang.String
     */
    public TdExpFechasLaborales(TdExpFechasLaboralesPK idComposite, 
                                int idExpRechazo, java.util.Date fecModifico, 
                                java.util.Date felFechaLaboral, 
                                java.lang.String idFecLab, 
                                java.lang.String idStatus, 
                                java.lang.String usuario, 
                                java.lang.String felDoctoRef) {
        this.idComposite = idComposite;
        this.idExpRechazo = idExpRechazo;
        this.fecModifico = fecModifico;
        this.felFechaLaboral = felFechaLaboral;
        this.idFecLab = idFecLab;
        this.idStatus = idStatus;
        this.usuario = usuario;
        this.felDoctoRef = felDoctoRef;
    }

    /**
     * Get felSecuencia value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getFelSecuencia() {
        if (idComposite == null) {
            return null;
        }
        return this.idComposite.getFelSecuencia();
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
     * Get fecModifico value.
     *
     * @return java.util.Date
     */
    public java.util.Date getFecModifico() {
        return this.fecModifico;
    }

    /**
     * Get felFechaLaboral value.
     *
     * @return java.util.Date
     */
    public java.util.Date getFelFechaLaboral() {
        return this.felFechaLaboral;
    }

    /**
     * Get idFecLab value.
     *
     * @return java.lang.String
     */
    public java.lang.String getIdFecLab() {
        return this.idFecLab;
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
     * Get felDoctoRef value.
     *
     * @return java.lang.String
     */
    public java.lang.String getFelDoctoRef() {
        return this.felDoctoRef;
    }

    /**
     * Set felSecuencia value.
     *
     * @param felSecuencia java.lang.Integer
     */
    public void setFelSecuencia(java.lang.Integer felSecuencia) {
        if (idComposite == null) {
            idComposite = new TdExpFechasLaboralesPK();
        }
        this.idComposite.setFelSecuencia(felSecuencia);
    }

    /**
     * Set idDocto value.
     *
     * @param idDocto java.lang.String
     */
    public void setIdDocto(java.lang.String idDocto) {
        if (idComposite == null) {
            idComposite = new TdExpFechasLaboralesPK();
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
            idComposite = new TdExpFechasLaboralesPK();
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
     * Set fecModifico value.
     *
     * @param fecModifico java.util.Date
     */
    public void setFecModifico(java.util.Date fecModifico) {
        this.fecModifico = fecModifico;
    }

    /**
     * Set felFechaLaboral value.
     *
     * @param felFechaLaboral java.util.Date
     */
    public void setFelFechaLaboral(java.util.Date felFechaLaboral) {
        this.felFechaLaboral = felFechaLaboral;
    }

    /**
     * Set idFecLab value.
     *
     * @param idFecLab java.lang.String
     */
    public void setIdFecLab(java.lang.String idFecLab) {
        this.idFecLab = idFecLab;
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
     * Set felDoctoRef value.
     *
     * @param felDoctoRef java.lang.String
     */
    public void setFelDoctoRef(java.lang.String felDoctoRef) {
        this.felDoctoRef = felDoctoRef;
    }

    /**
     * Set identity value.
     *
     * @param idComposite Serializable
     */
    public void setIdentity(Serializable idComposite) {
        this.idComposite = (TdExpFechasLaboralesPK)idComposite;
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
