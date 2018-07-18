package gob.shcp.sireh.model.rusp;

import gob.shcp.fsn.model.Model;

import org.springmodules.validation.bean.conf.loader.annotation.handler.NotNull;
import org.springmodules.validation.bean.conf.loader.annotation.handler.NotBlank;
import org.springmodules.validation.bean.conf.loader.annotation.handler.MaxLength;

/**
 * Model object for transporting TdRuspHijo data.
 */
public class TdRuspHijoDTO  implements java.io.Serializable, Model {    

    @NotBlank(errorCode="not.null")
    @MaxLength(18)    
    private java.lang.String trhCurp;
    @NotBlank(errorCode="not.null")
    @MaxLength(13)    
    private java.lang.String trhRfc;
    @NotNull
    private java.util.Date fecModifico;
    @NotBlank(errorCode="not.null")
    @NotNull
    @MaxLength(13)    
    private java.lang.String trhRfcUnico;
    @NotBlank(errorCode="not.null")
    @NotNull
    @MaxLength(30)    
    private java.lang.String usuario;
    @MaxLength(40)    
    private java.lang.String trhNombre;
    @MaxLength(40)    
    private java.lang.String trhPrimer;
    @MaxLength(40)    
    private java.lang.String trhSegundo;

    /**
     * Constructor for TdRuspHijoDTO class.
     */
    public TdRuspHijoDTO() { }    

                                    
    /**
     * Constructor for TdRuspHijoDTO class.
     *
     * @param trhCurp java.lang.String
     * @param trhRfc java.lang.String
     * @param fecModifico java.util.Date
     * @param trhRfcUnico java.lang.String
     * @param usuario java.lang.String
     * @param trhNombre java.lang.String
     * @param trhPrimer java.lang.String
     * @param trhSegundo java.lang.String
     */
    public TdRuspHijoDTO( java.lang.String trhCurp, java.lang.String trhRfc, java.util.Date fecModifico, java.lang.String trhRfcUnico, java.lang.String usuario, java.lang.String trhNombre, java.lang.String trhPrimer, java.lang.String trhSegundo){    
        this.trhCurp = trhCurp;
        this.trhRfc = trhRfc;
        this.fecModifico = fecModifico;
        this.trhRfcUnico = trhRfcUnico;
        this.usuario = usuario;
        this.trhNombre = trhNombre;
        this.trhPrimer = trhPrimer;
        this.trhSegundo = trhSegundo;
    }    

    
    /**
     * Set trhCurp value.
     *
     * @param trhCurp java.lang.String
     */
    public void setTrhCurp(java.lang.String trhCurp){
        this.trhCurp = trhCurp;
    }
    
    /**
     * Get trhCurp value.
     *
     * @return java.lang.String
     */
    public java.lang.String getTrhCurp() {
        return this.trhCurp;    
    }
    
    /**
     * Set trhRfc value.
     *
     * @param trhRfc java.lang.String
     */
    public void setTrhRfc(java.lang.String trhRfc){
        this.trhRfc = trhRfc;
    }
    
    /**
     * Get trhRfc value.
     *
     * @return java.lang.String
     */
    public java.lang.String getTrhRfc() {
        return this.trhRfc;    
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
     * Set trhRfcUnico value.
     *
     * @param trhRfcUnico java.lang.String
     */
    public void setTrhRfcUnico(java.lang.String trhRfcUnico){
        this.trhRfcUnico = trhRfcUnico;
    }
    
    /**
     * Get trhRfcUnico value.
     *
     * @return java.lang.String
     */
    public java.lang.String getTrhRfcUnico() {
        return this.trhRfcUnico;    
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
     * Set trhNombre value.
     *
     * @param trhNombre java.lang.String
     */
    public void setTrhNombre(java.lang.String trhNombre){
        this.trhNombre = trhNombre;
    }
    
    /**
     * Get trhNombre value.
     *
     * @return java.lang.String
     */
    public java.lang.String getTrhNombre() {
        return this.trhNombre;    
    }
    
    /**
     * Set trhPrimer value.
     *
     * @param trhPrimer java.lang.String
     */
    public void setTrhPrimer(java.lang.String trhPrimer){
        this.trhPrimer = trhPrimer;
    }
    
    /**
     * Get trhPrimer value.
     *
     * @return java.lang.String
     */
    public java.lang.String getTrhPrimer() {
        return this.trhPrimer;    
    }
    
    /**
     * Set trhSegundo value.
     *
     * @param trhSegundo java.lang.String
     */
    public void setTrhSegundo(java.lang.String trhSegundo){
        this.trhSegundo = trhSegundo;
    }
    
    /**
     * Get trhSegundo value.
     *
     * @return java.lang.String
     */
    public java.lang.String getTrhSegundo() {
        return this.trhSegundo;    
    }


}