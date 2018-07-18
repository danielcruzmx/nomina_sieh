package gob.shcp.sireh.domain.jdbc;

import gob.shcp.fsn.data.Domain;

import java.io.Serializable;

/**
 * Domain object for persistent TdExpDoctosSinDato data.
 */
public class TdExpDoctosSinDatos implements Domain, Serializable {
    private TdExpDoctosSinDatoPK idComposite;
    private int idExpRechazo;
    private java.lang.String dsdDoctoRef;
    private java.util.Date fecModifico;
    private java.lang.String idStatus;
    private java.lang.String usuario;
    private java.lang.String dsdDescripDocto;
    private java.lang.Integer dsdAxoDocto;

    /**
     * Constructor for TdExpDoctosSinDato class.
     */
    public TdExpDoctosSinDatos() {
    }

    /**
     * Constructor for TdExpDoctosSinDato class.
     *
     * @param dsdSecuencia java.lang.Integer
     * @param idDocto java.lang.String
     * @param rfcEmpleado java.lang.String
     * @param idExpRechazo int
     * @param dsdDoctoRef java.lang.String
     * @param fecModifico java.util.Date
     * @param idStatus java.lang.String
     * @param usuario java.lang.String
     * @param dsdDescripDocto java.lang.String
     * @param dsdAxoDocto java.lang.Integer
     */
    public TdExpDoctosSinDatos(TdExpDoctosSinDatoPK idComposite, 
                               int idExpRechazo, java.lang.String dsdDoctoRef, 
                               java.util.Date fecModifico, 
                               java.lang.String idStatus, 
                               java.lang.String usuario,
                               java.lang.String dsdDescripDocto,
                               java.lang.Integer dsdAxoDocto) {
        this.idComposite = idComposite;
        this.idExpRechazo = idExpRechazo;
        this.dsdDoctoRef = dsdDoctoRef;
        this.fecModifico = fecModifico;
        this.idStatus = idStatus;
        this.usuario = usuario;
        this.dsdDescripDocto = dsdDescripDocto;
        this.dsdAxoDocto = dsdAxoDocto;
    }

    /**
     * Get dsdSecuencia value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getDsdSecuencia() {
        if (idComposite == null) {
            return null;
        }
        return this.idComposite.getDsdSecuencia();
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
     * Get dsdDoctoRef value.
     *
     * @return java.lang.String
     */
    public java.lang.String getDsdDoctoRef() {
        return this.dsdDoctoRef;
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
     * Set dsdSecuencia value.
     *
     * @param dsdSecuencia java.lang.Integer
     */
    public void setDsdSecuencia(java.lang.Integer dsdSecuencia) {
        if (idComposite == null) {
            idComposite = new TdExpDoctosSinDatoPK();
        }
        this.idComposite.setDsdSecuencia(dsdSecuencia);
    }

    /**
     * Set idDocto value.
     *
     * @param idDocto java.lang.String
     */
    public void setIdDocto(java.lang.String idDocto) {
        if (idComposite == null) {
            idComposite = new TdExpDoctosSinDatoPK();
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
            idComposite = new TdExpDoctosSinDatoPK();
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
     * Set dsdDoctoRef value.
     *
     * @param dsdDoctoRef java.lang.String
     */
    public void setDsdDoctoRef(java.lang.String dsdDoctoRef) {
        this.dsdDoctoRef = dsdDoctoRef;
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
     * Set identity value.
     *
     * @param idComposite Serializable
     */
    public void setIdentity(Serializable idComposite) {
        this.idComposite = (TdExpDoctosSinDatoPK)idComposite;
    }

    /**
     * Get identity value.
     *
     * @return Serializable
     */
    public Serializable getIdentity() {
        return this.idComposite;
    }
    
    /**
     * Set dsdDescripDocto value.
     *
     * @param dsdDescripDocto String
     */
    public void setDsdDescripDocto(String dsdDescripDocto) {
        this.dsdDescripDocto = dsdDescripDocto;
    }
    
    /**
     * Get dsdDescripDocto value.
     *
     * @return String
     */
    public String getDsdDescripDocto() {
        return dsdDescripDocto;
    }
    
    /**
     * Set dsdxoDocto value.
     *
     * @param dsdAxoDocto Integer
     */
    public void setDsdAxoDocto(Integer dsdAxoDocto) {
        this.dsdAxoDocto = dsdAxoDocto;
    }
    
    /**
     * Get dsdxoDocto value.
     *
     * @return Integer
     */
    public Integer getDsdAxoDocto() {
        return dsdAxoDocto;
    }
}
