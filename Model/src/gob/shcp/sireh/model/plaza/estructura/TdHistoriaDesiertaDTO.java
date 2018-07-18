package gob.shcp.sireh.model.plaza.estructura;

import gob.shcp.fsn.model.Model;

import org.springmodules.validation.bean.conf.loader.annotation.handler.NotNull;
import org.springmodules.validation.bean.conf.loader.annotation.handler.NotBlank;
import org.springmodules.validation.bean.conf.loader.annotation.handler.MaxLength;

/**
 * Model object for transporting TdHistoriaDesierta data.
 */
public class TdHistoriaDesiertaDTO  implements java.io.Serializable, Model {    

    private java.util.Date fechaDesierta;
    private java.lang.Integer tdPlaza;
    @NotNull
    private java.util.Date fecModifico;
    @NotBlank(errorCode="not.null")
    @NotNull
    @MaxLength(30)    
    private java.lang.String usuario;

    /**
     * Constructor for TdHistoriaDesiertaDTO class.
     */
    public TdHistoriaDesiertaDTO() { }    

                    
    /**
     * Constructor for TdHistoriaDesiertaDTO class.
     *
     * @param fechaDesierta java.util.Date
     * @param tdPlaza java.lang.Integer
     * @param fecModifico java.util.Date
     * @param usuario java.lang.String
     */
    public TdHistoriaDesiertaDTO( java.util.Date fechaDesierta, java.lang.Integer tdPlaza, java.util.Date fecModifico, java.lang.String usuario){    
        this.fechaDesierta = fechaDesierta;
        this.tdPlaza = tdPlaza;
        this.fecModifico = fecModifico;
        this.usuario = usuario;
    }    

    
    /**
     * Set fechaDesierta value.
     *
     * @param fechaDesierta java.util.Date
     */
    public void setFechaDesierta(java.util.Date fechaDesierta){
        this.fechaDesierta = fechaDesierta;
    }
    
    /**
     * Get fechaDesierta value.
     *
     * @return java.util.Date
     */
    public java.util.Date getFechaDesierta() {
        return this.fechaDesierta;    
    }
    
    /**
     * Set tdPlaza value.
     *
     * @param tdPlaza java.lang.Integer
     */
    public void setTdPlaza(java.lang.Integer tdPlaza){
        this.tdPlaza = tdPlaza;
    }
    
    /**
     * Get tdPlaza value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getTdPlaza() {
        return this.tdPlaza;    
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