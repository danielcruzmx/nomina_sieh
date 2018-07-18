package gob.shcp.sireh.model.expediente;

import gob.shcp.fsn.model.Model;

import org.springmodules.validation.bean.conf.loader.annotation.handler.NotNull;
import org.springmodules.validation.bean.conf.loader.annotation.handler.NotBlank;
import org.springmodules.validation.bean.conf.loader.annotation.handler.MaxLength;

/**
 * Model object for transporting TdCurriculoEsc data.
 */
public class TdCurriculoEscDTO  implements java.io.Serializable, Model {    

    @NotBlank(errorCode="not.null")
    @MaxLength(13)    
    private java.lang.String curriceRfc;
    @NotNull
    private java.util.Date fecModifico;
    @NotBlank(errorCode="not.null")
    @NotNull
    @MaxLength(30)    
    private java.lang.String usuario;
    @MaxLength(20)    
    private java.lang.String curriceDocto;
    @MaxLength(20)    
    private java.lang.String curriceEscolaridad;
    @MaxLength(20)    
    private java.lang.String curriceGradoAvance;
    @MaxLength(100)    
    private java.lang.String curriceInstEduc;
    @MaxLength(100)    
    private java.lang.String curriceCarrera;

    /**
     * Constructor for TdCurriculoEscDTO class.
     */
    public TdCurriculoEscDTO() { }    

                                
    /**
     * Constructor for TdCurriculoEscDTO class.
     *
     * @param curriceRfc java.lang.String
     * @param fecModifico java.util.Date
     * @param usuario java.lang.String
     * @param curriceDocto java.lang.String
     * @param curriceEscolaridad java.lang.String
     * @param curriceGradoAvance java.lang.String
     * @param curriceInstEduc java.lang.String
     */
    public TdCurriculoEscDTO( java.lang.String curriceRfc, java.util.Date fecModifico, java.lang.String usuario, java.lang.String curriceDocto, java.lang.String curriceEscolaridad, java.lang.String curriceGradoAvance, java.lang.String curriceInstEduc, java.lang.String curriceCarrera) {    
        this.curriceRfc = curriceRfc;
        this.fecModifico = fecModifico;
        this.usuario = usuario;
        this.curriceDocto = curriceDocto;
        this.curriceEscolaridad = curriceEscolaridad;
        this.curriceGradoAvance = curriceGradoAvance;
        this.curriceInstEduc = curriceInstEduc;
        this.curriceCarrera = curriceCarrera;
    }    

    
    /**
     * Set curriceRfc value.
     *
     * @param curriceRfc java.lang.String
     */
    public void setCurriceRfc(java.lang.String curriceRfc){
        this.curriceRfc = curriceRfc;
    }
    
    /**
     * Get curriceRfc value.
     *
     * @return java.lang.String
     */
    public java.lang.String getCurriceRfc() {
        return this.curriceRfc;    
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
     * Set curriceDocto value.
     *
     * @param curriceDocto java.lang.String
     */
    public void setCurriceDocto(java.lang.String curriceDocto){
        this.curriceDocto = curriceDocto;
    }
    
    /**
     * Get curriceDocto value.
     *
     * @return java.lang.String
     */
    public java.lang.String getCurriceDocto() {
        return this.curriceDocto;    
    }
    
    /**
     * Set curriceEscolaridad value.
     *
     * @param curriceEscolaridad java.lang.String
     */
    public void setCurriceEscolaridad(java.lang.String curriceEscolaridad){
        this.curriceEscolaridad = curriceEscolaridad;
    }
    
    /**
     * Get curriceEscolaridad value.
     *
     * @return java.lang.String
     */
    public java.lang.String getCurriceEscolaridad() {
        return this.curriceEscolaridad;    
    }
    
    /**
     * Set curriceGradoAvance value.
     *
     * @param curriceGradoAvance java.lang.String
     */
    public void setCurriceGradoAvance(java.lang.String curriceGradoAvance){
        this.curriceGradoAvance = curriceGradoAvance;
    }
    
    /**
     * Get curriceGradoAvance value.
     *
     * @return java.lang.String
     */
    public java.lang.String getCurriceGradoAvance() {
        return this.curriceGradoAvance;    
    }
    
    /**
     * Set curriceInstEduc value.
     *
     * @param curriceInstEduc java.lang.String
     */
    public void setCurriceInstEduc(java.lang.String curriceInstEduc){
        this.curriceInstEduc = curriceInstEduc;
    }
    
    /**
     * Get curriceInstEduc value.
     *
     * @return java.lang.String
     */
    public java.lang.String getCurriceInstEduc() {
        return this.curriceInstEduc;    
    }

    /**
     * Set curriceCarrera value.
     *
     * @param curriceCarrera java.lang.String
     */
    public void setCurriceCarrera(java.lang.String curriceCarrera){
        this.curriceCarrera = curriceCarrera;
    }
    
    /**
     * Get curriceCarrera value.
     *
     * @return java.lang.String
     */
    public java.lang.String getCurriceCarrera() {
        return this.curriceCarrera;    
    }


}