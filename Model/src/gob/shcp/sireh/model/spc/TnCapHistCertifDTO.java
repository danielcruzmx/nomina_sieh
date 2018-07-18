package gob.shcp.sireh.model.spc;

import gob.shcp.fsn.model.Model;

import org.springmodules.validation.bean.conf.loader.annotation.handler.NotNull;
import org.springmodules.validation.bean.conf.loader.annotation.handler.NotBlank;
import org.springmodules.validation.bean.conf.loader.annotation.handler.MaxLength;

/**
 * Model object for transporting TnCapHistoricoCertificacion data.
 */
public class TnCapHistCertifDTO implements java.io.Serializable, Model {

    private java.lang.Long idHistoricoCertificacion;
    @NotNull
    private int idCurso;
    @NotBlank(errorCode = "not.null")
    @NotNull
    @MaxLength(52)
    private java.lang.String rfcEmpleado;
    @NotNull
    private java.util.Date certVigenciaFecFin;
    @NotNull
    private java.util.Date certVigenciaFecIni;
    @NotNull
    private java.util.Date fecModifico;
    @NotBlank(errorCode = "not.null")
    @NotNull
    @MaxLength(80)
    private java.lang.String usuario;

    /**
     * Constructor for TnCapHistoricoCertificacionDTO class.
     */
    public TnCapHistCertifDTO() {
    }

    /**
     * Constructor for TnCapHistoricoCertificacionDTO class.
     *
     * @param idHistoricoCertificacion java.lang.Long
     * @param idCurso int
     * @param rfcEmpleado java.lang.String
     * @param certVigenciaFecFin java.util.Date
     * @param certVigenciaFecIni java.util.Date
     * @param fecModifico java.util.Date
     * @param usuario java.lang.String
     */
    public TnCapHistCertifDTO(java.lang.Long idHistoricoCertificacion, int idCurso, 
                                          java.lang.String rfcEmpleado, java.util.Date certVigenciaFecFin, 
                                          java.util.Date certVigenciaFecIni, java.util.Date fecModifico, 
                                          java.lang.String usuario) {
        this.idHistoricoCertificacion = idHistoricoCertificacion;
        this.idCurso = idCurso;
        this.rfcEmpleado = rfcEmpleado;
        this.certVigenciaFecFin = certVigenciaFecFin;
        this.certVigenciaFecIni = certVigenciaFecIni;
        this.fecModifico = fecModifico;
        this.usuario = usuario;
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
     * Get idHistoricoCertificacion value.
     *
     * @return java.lang.Long
     */
    public java.lang.Long getIdHistoricoCertificacion() {
        return this.idHistoricoCertificacion;
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
     * Get idCurso value.
     *
     * @return int
     */
    public int getIdCurso() {
        return this.idCurso;
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
     * Get rfcEmpleado value.
     *
     * @return java.lang.String
     */
    public java.lang.String getRfcEmpleado() {
        return this.rfcEmpleado;
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
     * Get certVigenciaFecFin value.
     *
     * @return java.util.Date
     */
    public java.util.Date getCertVigenciaFecFin() {
        return this.certVigenciaFecFin;
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
     * Get certVigenciaFecIni value.
     *
     * @return java.util.Date
     */
    public java.util.Date getCertVigenciaFecIni() {
        return this.certVigenciaFecIni;
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
     * Get fecModifico value.
     *
     * @return java.util.Date
     */
    public java.util.Date getFecModifico() {
        return this.fecModifico;
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
     * Get usuario value.
     *
     * @return java.lang.String
     */
    public java.lang.String getUsuario() {
        return this.usuario;
    }
}
