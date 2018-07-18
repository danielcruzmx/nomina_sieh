package gob.shcp.sireh.model;

import gob.shcp.fsn.model.Model;

import org.springmodules.validation.bean.conf.loader.annotation.handler.NotBlank;
import org.springmodules.validation.bean.conf.loader.annotation.handler.MaxLength;

/**
 * Model object for transporting TcTercero data.
 */
public class TcTerceroDTO  implements java.io.Serializable, Model {    

    @NotBlank(errorCode="not.null")
    @MaxLength(2)    
    private java.lang.String idTercero;
    @MaxLength(40)    
    private java.lang.String descTercero;
    private java.util.Date fecModifico;
    @MaxLength(13)    
    private java.lang.String usuario;

    /**
     * Constructor for TcTerceroDTO class.
     */
    public TcTerceroDTO() { }    

                    
    /**
     * Constructor for TcTerceroDTO class.
     *
     * @param idTercero java.lang.String
     * @param descTercero java.lang.String
     * @param fecModifico java.util.Date
     * @param usuario java.lang.String
     */
    public TcTerceroDTO( java.lang.String idTercero, java.lang.String descTercero, java.util.Date fecModifico, java.lang.String usuario){    
        this.idTercero = idTercero;
        this.descTercero = descTercero;
        this.fecModifico = fecModifico;
        this.usuario = usuario;
    }    

    
    /**
     * Set idTercero value.
     *
     * @param idTercero java.lang.String
     */
    public void setIdTercero(java.lang.String idTercero){
        this.idTercero = idTercero;
    }
    
    /**
     * Get idTercero value.
     *
     * @return java.lang.String
     */
    public java.lang.String getIdTercero() {
        return this.idTercero;    
    }
    
    /**
     * Set descTercero value.
     *
     * @param descTercero java.lang.String
     */
    public void setDescTercero(java.lang.String descTercero){
        this.descTercero = descTercero;
    }
    
    /**
     * Get descTercero value.
     *
     * @return java.lang.String
     */
    public java.lang.String getDescTercero() {
        return this.descTercero;    
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