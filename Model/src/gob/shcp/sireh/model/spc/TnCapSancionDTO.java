package gob.shcp.sireh.model.spc;

import gob.shcp.fsn.model.Model;

import org.springmodules.validation.bean.conf.loader.annotation.handler.NotNull;
import org.springmodules.validation.bean.conf.loader.annotation.handler.NotBlank;
import org.springmodules.validation.bean.conf.loader.annotation.handler.MaxLength;

/**
 * Model object for transporting TnCapSancion data.
 */
public class TnCapSancionDTO implements java.io.Serializable, Model {

    private java.lang.Long idSancion;
    @NotNull
    private int idCurso;
    @NotBlank(errorCode = "not.null")
    @NotNull
    @MaxLength(52)
    private java.lang.String rfcEmpleado;
    @NotNull
    private java.util.Date fecModifico;
    @NotNull
    private java.util.Date sancionVigenciaFecFin;
    @NotNull
    private java.util.Date sancionVigenciaFecIni;
    @NotBlank(errorCode = "not.null")
    @NotNull
    @MaxLength(80)
    private java.lang.String usuario;

    /**
     * Constructor for TnCapSancionDTO class.
     */
    public TnCapSancionDTO() {
    }

    /**
     * Constructor for TnCapSancionDTO class.
     *
     * @param idSancion java.lang.Long
     * @param idCurso int
     * @param rfcEmpleado java.lang.String
     * @param fecModifico java.util.Date
     * @param sancionVigenciaFecFin java.util.Date
     * @param sancionVigenciaFecIni java.util.Date
     * @param usuario java.lang.String
     */
    public TnCapSancionDTO(java.lang.Long idSancion, int idCurso, java.lang.String rfcEmpleado, 
                           java.util.Date fecModifico, java.util.Date sancionVigenciaFecFin, 
                           java.util.Date sancionVigenciaFecIni, java.lang.String usuario) {
        this.idSancion = idSancion;
        this.idCurso = idCurso;
        this.rfcEmpleado = rfcEmpleado;
        this.fecModifico = fecModifico;
        this.sancionVigenciaFecFin = sancionVigenciaFecFin;
        this.sancionVigenciaFecIni = sancionVigenciaFecIni;
        this.usuario = usuario;
    }
    
    /**
     * Set idSancion value.
     *
     * @param idSancion java.lang.Long
     */
    public void setIdSancion(java.lang.Long idSancion) {
        this.idSancion = idSancion;
    }

    /**
     * Get idSancion value.
     *
     * @return java.lang.Long
     */
    public java.lang.Long getIdSancion() {
        return this.idSancion;
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
     * Set sancionVigenciaFecFin value.
     *
     * @param sancionVigenciaFecFin java.util.Date
     */
    public void setSancionVigenciaFecFin(java.util.Date sancionVigenciaFecFin) {
        this.sancionVigenciaFecFin = sancionVigenciaFecFin;
    }

    /**
     * Get sancionVigenciaFecFin value.
     *
     * @return java.util.Date
     */
    public java.util.Date getSancionVigenciaFecFin() {
        return this.sancionVigenciaFecFin;
    }

    /**
     * Set sancionVigenciaFecIni value.
     *
     * @param sancionVigenciaFecIni java.util.Date
     */
    public void setSancionVigenciaFecIni(java.util.Date sancionVigenciaFecIni) {
        this.sancionVigenciaFecIni = sancionVigenciaFecIni;
    }

    /**
     * Get sancionVigenciaFecIni value.
     *
     * @return java.util.Date
     */
    public java.util.Date getSancionVigenciaFecIni() {
        return this.sancionVigenciaFecIni;
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
