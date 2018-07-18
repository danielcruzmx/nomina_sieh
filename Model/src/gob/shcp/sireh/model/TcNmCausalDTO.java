package gob.shcp.sireh.model;

import gob.shcp.fsn.model.Model;

import org.springmodules.validation.bean.conf.loader.annotation.handler.MaxLength;

/**
 * Model object for transporting TcNmCausal data.
 */
public class TcNmCausalDTO  implements java.io.Serializable, Model {    

    private java.lang.Integer idNmCausal;
    @MaxLength(120)    
    private java.lang.String descNmCausal;
    @MaxLength(1200)    
    private java.lang.String descNmCausalBase;
    @MaxLength(1200)    
    private java.lang.String descNmCausalConf;
    private java.util.Date fecModifico;
    @MaxLength(52)    
    private java.lang.String usuario;

    /**
     * Constructor for TcNmCausalDTO class.
     */
    public TcNmCausalDTO() { }    

                            
    /**
     * Constructor for TcNmCausalDTO class.
     *
     * @param idNmCausal java.lang.Integer
     * @param descNmCausal java.lang.String
     * @param descNmCausalBase java.lang.String
     * @param descNmCausalConf java.lang.String
     * @param fecModifico java.util.Date
     * @param usuario java.lang.String
     */
    public TcNmCausalDTO( java.lang.Integer idNmCausal, java.lang.String descNmCausal, java.lang.String descNmCausalBase, java.lang.String descNmCausalConf, java.util.Date fecModifico, java.lang.String usuario){    
        this.idNmCausal = idNmCausal;
        this.descNmCausal = descNmCausal;
        this.descNmCausalBase = descNmCausalBase;
        this.descNmCausalConf = descNmCausalConf;
        this.fecModifico = fecModifico;
        this.usuario = usuario;
    }    

    
    /**
     * Set idNmCausal value.
     *
     * @param idNmCausal java.lang.Integer
     */
    public void setIdNmCausal(java.lang.Integer idNmCausal){
        this.idNmCausal = idNmCausal;
    }
    
    /**
     * Get idNmCausal value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getIdNmCausal() {
        return this.idNmCausal;    
    }
    
    /**
     * Set descNmCausal value.
     *
     * @param descNmCausal java.lang.String
     */
    public void setDescNmCausal(java.lang.String descNmCausal){
        this.descNmCausal = descNmCausal;
    }
    
    /**
     * Get descNmCausal value.
     *
     * @return java.lang.String
     */
    public java.lang.String getDescNmCausal() {
        return this.descNmCausal;    
    }
    
    /**
     * Set descNmCausalBase value.
     *
     * @param descNmCausalBase java.lang.String
     */
    public void setDescNmCausalBase(java.lang.String descNmCausalBase){
        this.descNmCausalBase = descNmCausalBase;
    }
    
    /**
     * Get descNmCausalBase value.
     *
     * @return java.lang.String
     */
    public java.lang.String getDescNmCausalBase() {
        return this.descNmCausalBase;    
    }
    
    /**
     * Set descNmCausalConf value.
     *
     * @param descNmCausalConf java.lang.String
     */
    public void setDescNmCausalConf(java.lang.String descNmCausalConf){
        this.descNmCausalConf = descNmCausalConf;
    }
    
    /**
     * Get descNmCausalConf value.
     *
     * @return java.lang.String
     */
    public java.lang.String getDescNmCausalConf() {
        return this.descNmCausalConf;    
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