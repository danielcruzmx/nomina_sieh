package gob.shcp.sireh.model.rusp;

import gob.shcp.fsn.model.Model;

import org.springmodules.validation.bean.conf.loader.annotation.handler.NotNull;
import org.springmodules.validation.bean.conf.loader.annotation.handler.NotBlank;
import org.springmodules.validation.bean.conf.loader.annotation.handler.MaxLength;

/**
 * Model object for transporting TdRuspLengua data.
 */
public class TdRuspLenguaDTO  implements java.io.Serializable, Model {    

    private java.lang.Integer trlLengua;
    @NotBlank(errorCode="not.null")
    @MaxLength(13)    
    private java.lang.String trlRfc;
    @NotNull
    private java.util.Date fecModifico;
    @NotBlank(errorCode="not.null")
    @NotNull
    @MaxLength(13)    
    private java.lang.String trlRfcUnico;
    @NotBlank(errorCode="not.null")
    @NotNull
    @MaxLength(1)    
    private java.lang.String trlTipo;
    @NotBlank(errorCode="not.null")
    @NotNull
    @MaxLength(30)    
    private java.lang.String usuario;

    /**
     * Constructor for TdRuspLenguaDTO class.
     */
    public TdRuspLenguaDTO() { }    

                            
    /**
     * Constructor for TdRuspLenguaDTO class.
     *
     * @param trlLengua java.lang.Integer
     * @param trlRfc java.lang.String
     * @param fecModifico java.util.Date
     * @param trlRfcUnico java.lang.String
     * @param trlTipo java.lang.String
     * @param usuario java.lang.String
     */
    public TdRuspLenguaDTO( java.lang.Integer trlLengua, java.lang.String trlRfc, java.util.Date fecModifico, java.lang.String trlRfcUnico, java.lang.String trlTipo, java.lang.String usuario){    
        this.trlLengua = trlLengua;
        this.trlRfc = trlRfc;
        this.fecModifico = fecModifico;
        this.trlRfcUnico = trlRfcUnico;
        this.trlTipo = trlTipo;
        this.usuario = usuario;
    }    

    
    /**
     * Set trlLengua value.
     *
     * @param trlLengua java.lang.Integer
     */
    public void setTrlLengua(java.lang.Integer trlLengua){
        this.trlLengua = trlLengua;
    }
    
    /**
     * Get trlLengua value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getTrlLengua() {
        return this.trlLengua;    
    }
    
    /**
     * Set trlRfc value.
     *
     * @param trlRfc java.lang.String
     */
    public void setTrlRfc(java.lang.String trlRfc){
        this.trlRfc = trlRfc;
    }
    
    /**
     * Get trlRfc value.
     *
     * @return java.lang.String
     */
    public java.lang.String getTrlRfc() {
        return this.trlRfc;    
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
     * Set trlRfcUnico value.
     *
     * @param trlRfcUnico java.lang.String
     */
    public void setTrlRfcUnico(java.lang.String trlRfcUnico){
        this.trlRfcUnico = trlRfcUnico;
    }
    
    /**
     * Get trlRfcUnico value.
     *
     * @return java.lang.String
     */
    public java.lang.String getTrlRfcUnico() {
        return this.trlRfcUnico;    
    }
    
    /**
     * Set trlTipo value.
     *
     * @param trlTipo java.lang.String
     */
    public void setTrlTipo(java.lang.String trlTipo){
        this.trlTipo = trlTipo;
    }
    
    /**
     * Get trlTipo value.
     *
     * @return java.lang.String
     */
    public java.lang.String getTrlTipo() {
        return this.trlTipo;    
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