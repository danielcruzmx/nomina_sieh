package gob.shcp.sireh.domain.jdbc.spc;

import gob.shcp.fsn.data.Domain;
import gob.shcp.fsn.data.annotation.PrimaryKey;

import java.io.Serializable;

/**
 * Domain object for persistent TnCapHistoricoCertificacion data.
 */
public class TnCapHistCertif implements Domain, Serializable {
    @PrimaryKey
    private java.lang.Long idHistoricoCertificacion;
    private int idCurso;
    private java.lang.String rfcEmpleado;
    private java.util.Date certVigenciaFecFin;
    private java.util.Date certVigenciaFecIni;
    private java.util.Date fecModifico;
    private java.lang.String usuario;

    /**
     * Constructor for TnCapHistoricoCertificacion class.
     */
    public TnCapHistCertif() {
    }

    /**
     * Constructor for TnCapHistoricoCertificacion class.
     *
     * @param idHistoricoCertificacion java.lang.Long
     * @param idCurso int
     * @param rfcEmpleado java.lang.String
     * @param certVigenciaFecFin java.util.Date
     * @param certVigenciaFecIni java.util.Date
     * @param fecModifico java.util.Date
     * @param usuario java.lang.String
     */
    public TnCapHistCertif(java.lang.Long idHistoricoCertificacion, int idCurso, java.lang.String rfcEmpleado, 
                           java.util.Date certVigenciaFecFin, java.util.Date certVigenciaFecIni, 
                           java.util.Date fecModifico, java.lang.String usuario) {
        this.idHistoricoCertificacion = idHistoricoCertificacion;
        this.idCurso = idCurso;
        this.rfcEmpleado = rfcEmpleado;
        this.certVigenciaFecFin = certVigenciaFecFin;
        this.certVigenciaFecIni = certVigenciaFecIni;
        this.fecModifico = fecModifico;
        this.usuario = usuario;
    }
    
    /**
     * Get idHistoricoCertificacion value.
     *
     * @return java.lang.Long
     */
    public java.lang.Long getIdHistoricoCertificacion() {
        return this.idHistoricoCertificacion;
    }

    /**
     * Get idCurso value.
     *
     * @return int
     */
    public int getIdCurso() {
        return this.idCurso;
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
     * Get certVigenciaFecFin value.
     *
     * @return java.util.Date
     */
    public java.util.Date getCertVigenciaFecFin() {
        return this.certVigenciaFecFin;
    }

    /**
     * Get certVigenciaFecIni value.
     *
     * @return java.util.Date
     */
    public java.util.Date getCertVigenciaFecIni() {
        return this.certVigenciaFecIni;
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
     * Get usuario value.
     *
     * @return java.lang.String
     */
    public java.lang.String getUsuario() {
        return this.usuario;
    }


    /**
     * Set idHistoricoCertificacion value.
     *
     * @param idHistoricoCertificacion java.lang.Long
     */
    public void setIdHistoricoCertificacion(java.lang.Long idHistoricoCertificacion) {
        this.idHistoricoCertificacion = idHistoricoCertificacion;
    }

    /**
     * Set idCurso value.
     *
     * @param idCurso int
     */
    public void setIdCurso(int idCurso) {
        this.idCurso = idCurso;
    }

    /**
     * Set rfcEmpleado value.
     *
     * @param rfcEmpleado java.lang.String
     */
    public void setRfcEmpleado(java.lang.String rfcEmpleado) {
        this.rfcEmpleado = rfcEmpleado;
    }

    /**
     * Set certVigenciaFecFin value.
     *
     * @param certVigenciaFecFin java.util.Date
     */
    public void setCertVigenciaFecFin(java.util.Date certVigenciaFecFin) {
        this.certVigenciaFecFin = certVigenciaFecFin;
    }

    /**
     * Set certVigenciaFecIni value.
     *
     * @param certVigenciaFecIni java.util.Date
     */
    public void setCertVigenciaFecIni(java.util.Date certVigenciaFecIni) {
        this.certVigenciaFecIni = certVigenciaFecIni;
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
     * @param idHistoricoCertificacion Serializable
     */
    public void setIdentity(Serializable idHistoricoCertificacion) {
        this.idHistoricoCertificacion = (java.lang.Long)idHistoricoCertificacion;
    }

    /**
     * Get identity value.
     *
     * @return Serializable
     */
    public Serializable getIdentity() {
        return this.idHistoricoCertificacion;
    }
}
