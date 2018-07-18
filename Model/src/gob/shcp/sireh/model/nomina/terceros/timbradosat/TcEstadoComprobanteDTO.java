package gob.shcp.sireh.model.nomina.terceros.timbradosat;

import gob.shcp.fsn.model.Model;

import org.springmodules.validation.bean.conf.loader.annotation.handler.NotNull;
import org.springmodules.validation.bean.conf.loader.annotation.handler.NotBlank;
import org.springmodules.validation.bean.conf.loader.annotation.handler.MaxLength;

/**
 * Model object for transporting TcEstadoComprobante data.
 */
public class TcEstadoComprobanteDTO implements java.io.Serializable, Model {

    private java.lang.Integer idEdoComprobante;
    @NotNull
    private java.util.Date fecModifico;
    @NotBlank(errorCode = "not.null")
    @NotNull
    @MaxLength(120)
    private java.lang.String usuario;
    @MaxLength(160)
    private java.lang.String descEdoComp;

    /**
     * Constructor for TcEstadoComprobanteDTO class.
     */
    public TcEstadoComprobanteDTO() {
    }


    /**
     * Constructor for TcEstadoComprobanteDTO class.
     *
     * @param idEdoComprobante java.lang.Integer
     * @param fecModifico java.util.Date
     * @param usuario java.lang.String
     * @param descEdoComp java.lang.String
     */
    public TcEstadoComprobanteDTO(java.lang.Integer idEdoComprobante, java.util.Date fecModifico, 
                                  java.lang.String usuario, java.lang.String descEdoComp) {
        this.idEdoComprobante = idEdoComprobante;
        this.fecModifico = fecModifico;
        this.usuario = usuario;
        this.descEdoComp = descEdoComp;
    }

    /**
     * Set idEdoComprobante value.
     *
     * @param idEdoComprobante java.lang.Integer
     */
    public void setIdEdoComprobante(java.lang.Integer idEdoComprobante) {
        this.idEdoComprobante = idEdoComprobante;
    }

    /**
     * Get idEdoComprobante value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getIdEdoComprobante() {
        return this.idEdoComprobante;
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
     * Set descEdoComp value.
     *
     * @param descEdoComp java.lang.String
     */
    public void setDescEdoComp(java.lang.String descEdoComp) {
        this.descEdoComp = descEdoComp;
    }

    /**
     * Get descEdoComp value.
     *
     * @return java.lang.String
     */
    public java.lang.String getDescEdoComp() {
        return this.descEdoComp;
    }
}
