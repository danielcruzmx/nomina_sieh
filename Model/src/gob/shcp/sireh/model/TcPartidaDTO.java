package gob.shcp.sireh.model;

import gob.shcp.fsn.model.Model;

import org.springmodules.validation.bean.conf.loader.annotation.handler.NotNull;
import org.springmodules.validation.bean.conf.loader.annotation.handler.NotBlank;
import org.springmodules.validation.bean.conf.loader.annotation.handler.MaxLength;

/**
 * Model object for transporting TcPartida data.
 */
public class TcPartidaDTO  implements java.io.Serializable, Model {    

    @NotBlank(errorCode="not.null")
    @MaxLength(20)    
    private java.lang.String idPartida;
    @NotBlank(errorCode="not.null")
    @NotNull
    @MaxLength(300)    
    private java.lang.String descPartida;
    @NotNull
    private java.util.Date fecModifico;
    @NotBlank(errorCode="not.null")
    @NotNull
    @MaxLength(4)    
    private java.lang.String ptdaInfoCpto;
    @NotBlank(errorCode="not.null")
    @NotNull
    @MaxLength(120)    
    private java.lang.String usuario;

    /**
     * Constructor for TcPartidaDTO class.
     */
    public TcPartidaDTO() { }    

                        
    /**
     * Constructor for TcPartidaDTO class.
     *
     * @param idPartida java.lang.String
     * @param descPartida java.lang.String
     * @param fecModifico java.util.Date
     * @param ptdaInfoCpto java.lang.String
     * @param usuario java.lang.String
     */
    public TcPartidaDTO( java.lang.String idPartida, java.lang.String descPartida, java.util.Date fecModifico, java.lang.String ptdaInfoCpto, java.lang.String usuario){    
        this.idPartida = idPartida;
        this.descPartida = descPartida;
        this.fecModifico = fecModifico;
        this.ptdaInfoCpto = ptdaInfoCpto;
        this.usuario = usuario;
    }    

    
    /**
     * Set idPartida value.
     *
     * @param idPartida java.lang.String
     */
    public void setIdPartida(java.lang.String idPartida){
        this.idPartida = idPartida;
    }
    
    /**
     * Get idPartida value.
     *
     * @return java.lang.String
     */
    public java.lang.String getIdPartida() {
        return this.idPartida;    
    }
    
    /**
     * Set descPartida value.
     *
     * @param descPartida java.lang.String
     */
    public void setDescPartida(java.lang.String descPartida){
        this.descPartida = descPartida;
    }
    
    /**
     * Get descPartida value.
     *
     * @return java.lang.String
     */
    public java.lang.String getDescPartida() {
        return this.descPartida;    
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
     * Set ptdaInfoCpto value.
     *
     * @param ptdaInfoCpto java.lang.String
     */
    public void setPtdaInfoCpto(java.lang.String ptdaInfoCpto){
        this.ptdaInfoCpto = ptdaInfoCpto;
    }
    
    /**
     * Get ptdaInfoCpto value.
     *
     * @return java.lang.String
     */
    public java.lang.String getPtdaInfoCpto() {
        return this.ptdaInfoCpto;    
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