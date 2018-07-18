package gob.shcp.sireh.model;

import gob.shcp.fsn.model.Model;

import org.springmodules.validation.bean.conf.loader.annotation.handler.NotNull;
import org.springmodules.validation.bean.conf.loader.annotation.handler.NotBlank;
import org.springmodules.validation.bean.conf.loader.annotation.handler.MaxLength;

/**
 * Model object for transporting TcDistUnidad data.
 */
public class TcDistUnidadDTO  implements java.io.Serializable, Model {    

    private java.lang.Integer idDistUnidad;
    @NotBlank(errorCode="not.null")
    @MaxLength(12)    
    private java.lang.String idUnidad;
    @NotNull
    private java.util.Date fecModifico;
    @NotBlank(errorCode="not.null")
    @NotNull
    @MaxLength(120)    
    private java.lang.String usuario;

    /**
     * Constructor for TcDistUnidadDTO class.
     */
    public TcDistUnidadDTO() { }    

                    
    /**
     * Constructor for TcDistUnidadDTO class.
     *
     * @param idDistUnidad java.lang.Integer
     * @param idUnidad java.lang.String
     * @param fecModifico java.util.Date
     * @param usuario java.lang.String
     */
    public TcDistUnidadDTO( java.lang.Integer idDistUnidad, java.lang.String idUnidad, java.util.Date fecModifico, java.lang.String usuario){    
        this.idDistUnidad = idDistUnidad;
        this.idUnidad = idUnidad;
        this.fecModifico = fecModifico;
        this.usuario = usuario;
    }    

    
    /**
     * Set idDistUnidad value.
     *
     * @param idDistUnidad java.lang.Integer
     */
    public void setIdDistUnidad(java.lang.Integer idDistUnidad){
        this.idDistUnidad = idDistUnidad;
    }
    
    /**
     * Get idDistUnidad value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getIdDistUnidad() {
        return this.idDistUnidad;    
    }
    
    /**
     * Set idUnidad value.
     *
     * @param idUnidad java.lang.String
     */
    public void setIdUnidad(java.lang.String idUnidad){
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