package gob.shcp.sireh.model.plaza.estructura;

import gob.shcp.fsn.model.Model;

import org.springmodules.validation.bean.conf.loader.annotation.handler.NotNull;
import org.springmodules.validation.bean.conf.loader.annotation.handler.NotBlank;
import org.springmodules.validation.bean.conf.loader.annotation.handler.MaxLength;

/**
 * Model object for transporting TdPlazaConcurso data.
 */
public class TdPlazaConcursoDTO  implements java.io.Serializable, Model {    

    private java.lang.Integer idEstatus;
    private java.lang.Integer idPlaza;
    @NotNull
    private java.util.Date fecModifico;
    @NotBlank(errorCode="not.null")
    @NotNull
    @MaxLength(30)    
    private java.lang.String usuario;
    private java.util.Date fechaDesierta;

    /**
     * Constructor for TdPlazaConcursoDTO class.
     */
    public TdPlazaConcursoDTO() { }    

                        
    /**
     * Constructor for TdPlazaConcursoDTO class.
     *
     * @param idEstatus java.lang.Integer
     * @param idPlaza java.lang.Integer
     * @param fecModifico java.util.Date
     * @param usuario java.lang.String
     * @param fechaDesierta java.util.Date
     */
    public TdPlazaConcursoDTO( java.lang.Integer idEstatus, java.lang.Integer idPlaza, java.util.Date fecModifico, java.lang.String usuario, java.util.Date fechaDesierta){    
        this.idEstatus = idEstatus;
        this.idPlaza = idPlaza;
        this.fecModifico = fecModifico;
        this.usuario = usuario;
        this.fechaDesierta = fechaDesierta;
    }    

    
    /**
     * Set idEstatus value.
     *
     * @param idEstatus java.lang.Integer
     */
    public void setIdEstatus(java.lang.Integer idEstatus){
        this.idEstatus = idEstatus;
    }
    
    /**
     * Get idEstatus value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getIdEstatus() {
        return this.idEstatus;    
    }
    
    /**
     * Set idPlaza value.
     *
     * @param idPlaza java.lang.Integer
     */
    public void setIdPlaza(java.lang.Integer idPlaza){
        this.idPlaza = idPlaza;
    }
    
    /**
     * Get idPlaza value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getIdPlaza() {
        return this.idPlaza;    
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


}