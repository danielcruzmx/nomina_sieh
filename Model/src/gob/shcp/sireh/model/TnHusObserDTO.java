package gob.shcp.sireh.model;

import gob.shcp.fsn.model.Model;

import org.springmodules.validation.bean.conf.loader.annotation.handler.NotNull;
import org.springmodules.validation.bean.conf.loader.annotation.handler.NotBlank;
import org.springmodules.validation.bean.conf.loader.annotation.handler.MaxLength;

/**
 * Model object for transporting TnHusObser data.
 */
public class TnHusObserDTO  implements java.io.Serializable, Model {    

    private java.lang.Integer husobsReg;
    @NotBlank(errorCode="not.null")
    @MaxLength(52)    
    private java.lang.String husobsRfc;
    @NotBlank(errorCode="not.null")
    @MaxLength(480)    
    private java.lang.String husobsTexto;
    @NotNull
    private java.util.Date fecModifico;
    @NotBlank(errorCode="not.null")
    @NotNull
    @MaxLength(120)    
    private java.lang.String usuario;

    /**
     * Constructor for TnHusObserDTO class.
     */
    public TnHusObserDTO() { }    

                        
    /**
     * Constructor for TnHusObserDTO class.
     *
     * @param husobsReg java.lang.Integer
     * @param husobsRfc java.lang.String
     * @param husobsTexto java.lang.String
     * @param fecModifico java.util.Date
     * @param usuario java.lang.String
     */
    public TnHusObserDTO( java.lang.Integer husobsReg, java.lang.String husobsRfc, java.lang.String husobsTexto, java.util.Date fecModifico, java.lang.String usuario){    
        this.husobsReg = husobsReg;
        this.husobsRfc = husobsRfc;
        this.husobsTexto = husobsTexto;
        this.fecModifico = fecModifico;
        this.usuario = usuario;
    }    

    
    /**
     * Set husobsReg value.
     *
     * @param husobsReg java.lang.Integer
     */
    public void setHusobsReg(java.lang.Integer husobsReg){
        this.husobsReg = husobsReg;
    }
    
    /**
     * Get husobsReg value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getHusobsReg() {
        return this.husobsReg;    
    }
    
    /**
     * Set husobsRfc value.
     *
     * @param husobsRfc java.lang.String
     */
    public void setHusobsRfc(java.lang.String husobsRfc){
        this.husobsRfc = husobsRfc;
    }
    
    /**
     * Get husobsRfc value.
     *
     * @return java.lang.String
     */
    public java.lang.String getHusobsRfc() {
        return this.husobsRfc;    
    }
    
    /**
     * Set husobsTexto value.
     *
     * @param husobsTexto java.lang.String
     */
    public void setHusobsTexto(java.lang.String husobsTexto){
        this.husobsTexto = husobsTexto;
    }
    
    /**
     * Get husobsTexto value.
     *
     * @return java.lang.String
     */
    public java.lang.String getHusobsTexto() {
        return this.husobsTexto;    
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