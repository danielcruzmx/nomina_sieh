package gob.shcp.sireh.model;

import gob.shcp.fsn.model.Model;

import org.springmodules.validation.bean.conf.loader.annotation.handler.NotNull;
import org.springmodules.validation.bean.conf.loader.annotation.handler.NotBlank;
import org.springmodules.validation.bean.conf.loader.annotation.handler.MaxLength;

/**
 * Model object for transporting TcTipoPlaza data.
 */
public class TcTipoPlazaDTO  implements java.io.Serializable, Model {    

    @NotBlank(errorCode="not.null")
    @MaxLength(1)    
    private java.lang.String idTipoPlaza;
    @NotNull
    private java.util.Date fecModifico;
    @NotBlank(errorCode="not.null")
    @NotNull
    @MaxLength(13)    
    private java.lang.String usuario;
    @MaxLength(75)    
    private java.lang.String descTipoPlaza;

    /**
     * Constructor for TcTipoPlazaDTO class.
     */
    public TcTipoPlazaDTO() { }    

                    
    /**
     * Constructor for TcTipoPlazaDTO class.
     *
     * @param idTipoPlaza java.lang.String
     * @param fecModifico java.util.Date
     * @param usuario java.lang.String
     * @param descTipoPlaza java.lang.String
     */
    public TcTipoPlazaDTO( java.lang.String idTipoPlaza, java.util.Date fecModifico, java.lang.String usuario, java.lang.String descTipoPlaza){    
        this.idTipoPlaza = idTipoPlaza;
        this.fecModifico = fecModifico;
        this.usuario = usuario;
        this.descTipoPlaza = descTipoPlaza;
    }    

    
    /**
     * Set idTipoPlaza value.
     *
     * @param idTipoPlaza java.lang.String
     */
    public void setIdTipoPlaza(java.lang.String idTipoPlaza){
        this.idTipoPlaza = idTipoPlaza;
    }
    
    /**
     * Get idTipoPlaza value.
     *
     * @return java.lang.String
     */
    public java.lang.String getIdTipoPlaza() {
        return this.idTipoPlaza;    
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
    
    /**
     * Set descTipoPlaza value.
     *
     * @param descTipoPlaza java.lang.String
     */
    public void setDescTipoPlaza(java.lang.String descTipoPlaza){
        this.descTipoPlaza = descTipoPlaza;
    }
    
    /**
     * Get descTipoPlaza value.
     *
     * @return java.lang.String
     */
    public java.lang.String getDescTipoPlaza() {
        return this.descTipoPlaza;    
    }


}