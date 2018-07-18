package gob.shcp.sireh.model;

import gob.shcp.fsn.model.Model;

import org.springmodules.validation.bean.conf.loader.annotation.handler.NotBlank;
import org.springmodules.validation.bean.conf.loader.annotation.handler.MaxLength;

/**
 * Model object for transporting TcTipoServPub data.
 */
public class TcTipoServPubDTO  implements java.io.Serializable, Model {    

    @NotBlank(errorCode="not.null")
    @MaxLength(5)    
    private java.lang.String idServPub;
    @MaxLength(250)    
    private java.lang.String descTipoServPub;
    private java.util.Date fecModifico;
    @MaxLength(1)    
    private java.lang.String tspCveNomb;
    @MaxLength(14)    
    private java.lang.String tspNiveles;
    @MaxLength(2)    
    private java.lang.String tspTipoPlaza;
    @MaxLength(13)    
    private java.lang.String usuario;

    /**
     * Constructor for TcTipoServPubDTO class.
     */
    public TcTipoServPubDTO() { }    

                                
    /**
     * Constructor for TcTipoServPubDTO class.
     *
     * @param idServPub java.lang.String
     * @param descTipoServPub java.lang.String
     * @param fecModifico java.util.Date
     * @param tspCveNomb java.lang.String
     * @param tspNiveles java.lang.String
     * @param tspTipoPlaza java.lang.String
     * @param usuario java.lang.String
     */
    public TcTipoServPubDTO( java.lang.String idServPub, java.lang.String descTipoServPub, java.util.Date fecModifico, java.lang.String tspCveNomb, java.lang.String tspNiveles, java.lang.String tspTipoPlaza, java.lang.String usuario){    
        this.idServPub = idServPub;
        this.descTipoServPub = descTipoServPub;
        this.fecModifico = fecModifico;
        this.tspCveNomb = tspCveNomb;
        this.tspNiveles = tspNiveles;
        this.tspTipoPlaza = tspTipoPlaza;
        this.usuario = usuario;
    }    

    
    /**
     * Set idServPub value.
     *
     * @param idServPub java.lang.String
     */
    public void setIdServPub(java.lang.String idServPub){
        this.idServPub = idServPub;
    }
    
    /**
     * Get idServPub value.
     *
     * @return java.lang.String
     */
    public java.lang.String getIdServPub() {
        return this.idServPub;    
    }
    
    /**
     * Set descTipoServPub value.
     *
     * @param descTipoServPub java.lang.String
     */
    public void setDescTipoServPub(java.lang.String descTipoServPub){
        this.descTipoServPub = descTipoServPub;
    }
    
    /**
     * Get descTipoServPub value.
     *
     * @return java.lang.String
     */
    public java.lang.String getDescTipoServPub() {
        return this.descTipoServPub;    
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
     * Set tspCveNomb value.
     *
     * @param tspCveNomb java.lang.String
     */
    public void setTspCveNomb(java.lang.String tspCveNomb){
        this.tspCveNomb = tspCveNomb;
    }
    
    /**
     * Get tspCveNomb value.
     *
     * @return java.lang.String
     */
    public java.lang.String getTspCveNomb() {
        return this.tspCveNomb;    
    }
    
    /**
     * Set tspNiveles value.
     *
     * @param tspNiveles java.lang.String
     */
    public void setTspNiveles(java.lang.String tspNiveles){
        this.tspNiveles = tspNiveles;
    }
    
    /**
     * Get tspNiveles value.
     *
     * @return java.lang.String
     */
    public java.lang.String getTspNiveles() {
        return this.tspNiveles;    
    }
    
    /**
     * Set tspTipoPlaza value.
     *
     * @param tspTipoPlaza java.lang.String
     */
    public void setTspTipoPlaza(java.lang.String tspTipoPlaza){
        this.tspTipoPlaza = tspTipoPlaza;
    }
    
    /**
     * Get tspTipoPlaza value.
     *
     * @return java.lang.String
     */
    public java.lang.String getTspTipoPlaza() {
        return this.tspTipoPlaza;    
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