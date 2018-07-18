package gob.shcp.sireh.model.plaza;

import gob.shcp.fsn.model.Model;

import org.springmodules.validation.bean.conf.loader.annotation.handler.NotNull;
import org.springmodules.validation.bean.conf.loader.annotation.handler.NotBlank;
import org.springmodules.validation.bean.conf.loader.annotation.handler.MaxLength;

/**
 * Model object for transporting TcProyRegulariza data.
 */
public class TcProyRegularizaDTO  implements java.io.Serializable, Model {    

    @NotBlank(errorCode="not.null")
    @MaxLength(24)    
    private java.lang.String idProyRegul;
    private java.lang.Integer prCiclo;
    @NotBlank(errorCode="not.null")
    @NotNull
    @MaxLength(160)    
    private java.lang.String descProyRegul;
    @NotNull
    private java.util.Date fecModifico;
    @NotBlank(errorCode="not.null")
    @NotNull
    @MaxLength(120)    
    private java.lang.String usuario;

    /**
     * Constructor for TcProyRegularizaDTO class.
     */
    public TcProyRegularizaDTO() { }    

                        
    /**
     * Constructor for TcProyRegularizaDTO class.
     *
     * @param idProyRegul java.lang.String
     * @param prCiclo java.lang.Integer
     * @param descProyRegul java.lang.String
     * @param fecModifico java.util.Date
     * @param usuario java.lang.String
     */
    public TcProyRegularizaDTO( java.lang.String idProyRegul, java.lang.Integer prCiclo, java.lang.String descProyRegul, java.util.Date fecModifico, java.lang.String usuario){    
        this.idProyRegul = idProyRegul;
        this.prCiclo = prCiclo;
        this.descProyRegul = descProyRegul;
        this.fecModifico = fecModifico;
        this.usuario = usuario;
    }    

    
    /**
     * Set idProyRegul value.
     *
     * @param idProyRegul java.lang.String
     */
    public void setIdProyRegul(java.lang.String idProyRegul){
        this.idProyRegul = idProyRegul;
    }
    
    /**
     * Get idProyRegul value.
     *
     * @return java.lang.String
     */
    public java.lang.String getIdProyRegul() {
        return this.idProyRegul;    
    }
    
    /**
     * Set prCiclo value.
     *
     * @param prCiclo java.lang.Integer
     */
    public void setPrCiclo(java.lang.Integer prCiclo){
        this.prCiclo = prCiclo;
    }
    
    /**
     * Get prCiclo value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getPrCiclo() {
        return this.prCiclo;    
    }
    
    /**
     * Set descProyRegul value.
     *
     * @param descProyRegul java.lang.String
     */
    public void setDescProyRegul(java.lang.String descProyRegul){
        this.descProyRegul = descProyRegul;
    }
    
    /**
     * Get descProyRegul value.
     *
     * @return java.lang.String
     */
    public java.lang.String getDescProyRegul() {
        return this.descProyRegul;    
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