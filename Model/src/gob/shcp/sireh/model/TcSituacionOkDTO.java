package gob.shcp.sireh.model;

import gob.shcp.fsn.model.Model;

import org.springmodules.validation.bean.conf.loader.annotation.handler.NotBlank;
import org.springmodules.validation.bean.conf.loader.annotation.handler.MaxLength;

/**
 * Model object for transporting TcSituacionOk data.
 */
public class TcSituacionOkDTO  implements java.io.Serializable, Model {    

    @NotBlank(errorCode="not.null")
    @MaxLength(2)    
    private java.lang.String idSitPlazaDestino;
    @NotBlank(errorCode="not.null")
    @MaxLength(2)    
    private java.lang.String idSitPlazaOrigen;
    private java.lang.Integer idMovtoPersona;
    private java.util.Date fecModifico;
    @MaxLength(13)    
    private java.lang.String usuario;

    /**
     * Constructor for TcSituacionOkDTO class.
     */
    public TcSituacionOkDTO() { }    

                        
    /**
     * Constructor for TcSituacionOkDTO class.
     *
     * @param idSitPlazaDestino java.lang.String
     * @param idSitPlazaOrigen java.lang.String
     * @param idMovtoPersona java.lang.Integer
     * @param fecModifico java.util.Date
     * @param usuario java.lang.String
     */
    public TcSituacionOkDTO( java.lang.String idSitPlazaDestino, java.lang.String idSitPlazaOrigen, java.lang.Integer idMovtoPersona, java.util.Date fecModifico, java.lang.String usuario){    
        this.idSitPlazaDestino = idSitPlazaDestino;
        this.idSitPlazaOrigen = idSitPlazaOrigen;
        this.idMovtoPersona = idMovtoPersona;
        this.fecModifico = fecModifico;
        this.usuario = usuario;
    }    

    
    /**
     * Set idSitPlazaDestino value.
     *
     * @param idSitPlazaDestino java.lang.String
     */
    public void setIdSitPlazaDestino(java.lang.String idSitPlazaDestino){
        this.idSitPlazaDestino = idSitPlazaDestino;
    }
    
    /**
     * Get idSitPlazaDestino value.
     *
     * @return java.lang.String
     */
    public java.lang.String getIdSitPlazaDestino() {
        return this.idSitPlazaDestino;    
    }
    
    /**
     * Set idSitPlazaOrigen value.
     *
     * @param idSitPlazaOrigen java.lang.String
     */
    public void setIdSitPlazaOrigen(java.lang.String idSitPlazaOrigen){
        this.idSitPlazaOrigen = idSitPlazaOrigen;
    }
    
    /**
     * Get idSitPlazaOrigen value.
     *
     * @return java.lang.String
     */
    public java.lang.String getIdSitPlazaOrigen() {
        return this.idSitPlazaOrigen;    
    }
    
    /**
     * Set idMovtoPersona value.
     *
     * @param idMovtoPersona java.lang.Integer
     */
    public void setIdMovtoPersona(java.lang.Integer idMovtoPersona){
        this.idMovtoPersona = idMovtoPersona;
    }
    
    /**
     * Get idMovtoPersona value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getIdMovtoPersona() {
        return this.idMovtoPersona;    
    }
    
    /**
     * Set fecModifico value.
     *
     * @param fecModifico java.util.Date
     */
    public void setFecModifico(java.util.Date fecModifico){
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
    public void setUsuario(java.lang.String usuario){
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