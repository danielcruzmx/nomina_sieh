package gob.shcp.sireh.model;

import gob.shcp.fsn.model.Model;

import org.springmodules.validation.bean.conf.loader.annotation.handler.NotNull;
import org.springmodules.validation.bean.conf.loader.annotation.handler.NotBlank;
import org.springmodules.validation.bean.conf.loader.annotation.handler.MaxLength;

/**
 * Model object for transporting TcBanco data.
 */
public class TcBancoDTO implements java.io.Serializable, Model {

    @NotBlank(errorCode = "not.null")
    @MaxLength(12)
    private java.lang.String idBanco;
    @NotNull
    private java.util.Date fecModifico;
    @NotBlank(errorCode = "not.null")
    @NotNull
    @MaxLength(120)
    private java.lang.String usuario;
    @MaxLength(200)
    private java.lang.String descBancos;
    @MaxLength(12)
    private java.lang.String idReceptor;

    /**
     * Constructor for TcBancoDTO class.
     */
    public TcBancoDTO() {
    }


    /**
     * Constructor for TcBancoDTO class.
     *
     * @param idBanco java.lang.String
     * @param fecModifico java.util.Date
     * @param usuario java.lang.String
     * @param descBancos java.lang.String
     * @param idReceptor java.lang.String
     */
    public TcBancoDTO(java.lang.String idBanco, java.util.Date fecModifico, java.lang.String usuario, 
                      java.lang.String descBancos, java.lang.String idReceptor) {
        this.idBanco = idBanco;
        this.fecModifico = fecModifico;
        this.usuario = usuario;
        this.descBancos = descBancos;
        this.idReceptor = idReceptor;
    }


    /**
     * Set idBanco value.
     *
     * @param idBanco java.lang.String
     */
    public void setIdBanco(java.lang.String idBanco) {
        this.idBanco = idBanco;
    }

    /**
     * Get idBanco value.
     *
     * @return java.lang.String
     */
    public java.lang.String getIdBanco() {
        return this.idBanco;
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

    /**
     * Set descBancos value.
     *
     * @param descBancos java.lang.String
     */
    public void setDescBancos(java.lang.String descBancos) {
        this.descBancos = descBancos;
    }

    /**
     * Get descBancos value.
     *
     * @return java.lang.String
     */
    public java.lang.String getDescBancos() {
        return this.descBancos;
    }

    /**
     * Set idReceptor value.
     *
     * @param idReceptor java.lang.String
     */
    public void setIdReceptor(java.lang.String idReceptor) {
        this.idReceptor = idReceptor;
    }

    /**
     * Get idReceptor value.
     *
     * @return java.lang.String
     */
    public java.lang.String getIdReceptor() {
        return this.idReceptor;
    }
}
