package gob.shcp.sireh.domain.jdbc.spc;

import gob.shcp.fsn.data.Domain;
import gob.shcp.fsn.data.annotation.PrimaryKey;

import java.io.Serializable;

/**
 * Domain object for persistent TnCapSancion data.
 */
public class TnCapSancion implements Domain, Serializable {
    @PrimaryKey
    private java.lang.Long idSancion;
    private int idCurso;
    private java.lang.String rfcEmpleado;
    private java.util.Date fecModifico;
    private java.util.Date sancionVigenciaFecFin;
    private java.util.Date sancionVigenciaFecIni;
    private java.lang.String usuario;

    /**
     * Constructor for TnCapSancion class.
     */
    public TnCapSancion() {
    }

    /**
     * Constructor for TnCapSancion class.
     *
     * @param idSancion java.lang.Long
     * @param idCurso int
     * @param rfcEmpleado java.lang.String
     * @param fecModifico java.util.Date
     * @param sancionVigenciaFecFin java.util.Date
     * @param sancionVigenciaFecIni java.util.Date
     * @param usuario java.lang.String
     */
    public TnCapSancion(java.lang.Long idSancion, int idCurso, java.lang.String rfcEmpleado, 
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
     * Get idSancion value.
     *
     * @return java.lang.Long
     */
    public java.lang.Long getIdSancion() {
        return this.idSancion;
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
     * Get fecModifico value.
     *
     * @return java.util.Date
     */
    public java.util.Date getFecModifico() {
        return this.fecModifico;
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
     * Get sancionVigenciaFecIni value.
     *
     * @return java.util.Date
     */
    public java.util.Date getSancionVigenciaFecIni() {
        return this.sancionVigenciaFecIni;
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
     * Set idSancion value.
     *
     * @param idSancion java.lang.Long
     */
    public void setIdSancion(java.lang.Long idSancion) {
        this.idSancion = idSancion;
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
     * Set fecModifico value.
     *
     * @param fecModifico java.util.Date
     */
    public void setFecModifico(java.util.Date fecModifico) {
        this.fecModifico = fecModifico;
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
     * Set sancionVigenciaFecIni value.
     *
     * @param sancionVigenciaFecIni java.util.Date
     */
    public void setSancionVigenciaFecIni(java.util.Date sancionVigenciaFecIni) {
        this.sancionVigenciaFecIni = sancionVigenciaFecIni;
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
     * @param idSancion Serializable
     */
    public void setIdentity(Serializable idSancion) {
        this.idSancion = (java.lang.Long)idSancion;
    }

    /**
     * Get identity value.
     *
     * @return Serializable
     */
    public Serializable getIdentity() {
        return this.idSancion;
    }
}
