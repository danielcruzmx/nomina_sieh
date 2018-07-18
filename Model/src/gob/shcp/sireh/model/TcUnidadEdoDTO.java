package gob.shcp.sireh.model;

import gob.shcp.fsn.model.Model;

import org.springmodules.validation.bean.conf.loader.annotation.handler.NotNull;
import org.springmodules.validation.bean.conf.loader.annotation.handler.NotBlank;
import org.springmodules.validation.bean.conf.loader.annotation.handler.MaxLength;

/**
 * Model object for transporting TcUnidadEdo data.
 */
public class TcUnidadEdoDTO implements java.io.Serializable, Model {

    private java.lang.Integer idEdo;
    @NotBlank(errorCode = "not.null")
    @MaxLength(12)
    private java.lang.String idUnidad;
    private java.lang.Integer uniEdoCiclo;
    @NotNull
    private java.util.Date fecModifico;
    @NotBlank(errorCode = "not.null")
    @NotNull
    @MaxLength(120)
    private java.lang.String usuario;

    /**
     * Constructor for TcUnidadEdoDTO class.
     */
    public TcUnidadEdoDTO() {
    }


    /**
     * Constructor for TcUnidadEdoDTO class.
     *
     * @param idEdo java.lang.Integer
     * @param idUnidad java.lang.String
     * @param uniEdoCiclo java.lang.Integer
     * @param fecModifico java.util.Date
     * @param usuario java.lang.String
     */
    public TcUnidadEdoDTO(java.lang.Integer idEdo, java.lang.String idUnidad, java.lang.Integer uniEdoCiclo, 
                          java.util.Date fecModifico, java.lang.String usuario) {
        this.idEdo = idEdo;
        this.idUnidad = idUnidad;
        this.uniEdoCiclo = uniEdoCiclo;
        this.fecModifico = fecModifico;
        this.usuario = usuario;
    }


    /**
     * Set idEdo value.
     *
     * @param idEdo java.lang.Integer
     */
    public void setIdEdo(java.lang.Integer idEdo) {
        this.idEdo = idEdo;
    }

    /**
     * Get idEdo value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getIdEdo() {
        return this.idEdo;
    }

    /**
     * Set idUnidad value.
     *
     * @param idUnidad java.lang.String
     */
    public void setIdUnidad(java.lang.String idUnidad) {
        this.idUnidad = idUnidad;
    }

    /**
     * Get idUnidad value.
     *
     * @return java.lang.String
     */
    public java.lang.String getIdUnidad() {
        return this.idUnidad;
    }

    /**
     * Set uniEdoCiclo value.
     *
     * @param uniEdoCiclo java.lang.Integer
     */
    public void setUniEdoCiclo(java.lang.Integer uniEdoCiclo) {
        this.uniEdoCiclo = uniEdoCiclo;
    }

    /**
     * Get uniEdoCiclo value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getUniEdoCiclo() {
        return this.uniEdoCiclo;
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
