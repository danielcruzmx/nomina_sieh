package gob.shcp.sireh.model;

import gob.shcp.fsn.model.Model;

import org.springmodules.validation.bean.conf.loader.annotation.handler.NotNull;
import org.springmodules.validation.bean.conf.loader.annotation.handler.NotBlank;
import org.springmodules.validation.bean.conf.loader.annotation.handler.MaxLength;

/**
 * Model object for transporting TdExpLab data.
 */
public class TdExpLabDTO  implements java.io.Serializable, Model {    

    @NotBlank(errorCode="not.null")
    @MaxLength(150)    
    private java.lang.String elActPrin;
    @NotBlank(errorCode="not.null")
    @MaxLength(160)    
    private java.lang.String elEmpresa;
    @NotBlank(errorCode="not.null")
    @MaxLength(100)    
    private java.lang.String elNivelCargo;
    @NotBlank(errorCode="not.null")
    @MaxLength(13)    
    private java.lang.String idTdExpLab;
    private java.util.Date elFecFin;
    private java.util.Date elFecIng;
    private java.util.Date fecModifico;
    @MaxLength(13)    
    private java.lang.String usuario;

    /**
     * Constructor for TdExpLabDTO class.
     */
    public TdExpLabDTO() { }    

                                    
    /**
     * Constructor for TdExpLabDTO class.
     *
     * @param elActPrin java.lang.String
     * @param elEmpresa java.lang.String
     * @param elNivelCargo java.lang.String
     * @param idTdExpLab java.lang.String
     * @param elFecFin java.util.Date
     * @param elFecIng java.util.Date
     * @param fecModifico java.util.Date
     * @param usuario java.lang.String
     */
    public TdExpLabDTO( java.lang.String elActPrin, java.lang.String elEmpresa, java.lang.String elNivelCargo, java.lang.String idTdExpLab, java.util.Date elFecFin, java.util.Date elFecIng, java.util.Date fecModifico, java.lang.String usuario){    
        this.elActPrin = elActPrin;
        this.elEmpresa = elEmpresa;
        this.elNivelCargo = elNivelCargo;
        this.idTdExpLab = idTdExpLab;
        this.elFecFin = elFecFin;
        this.elFecIng = elFecIng;
        this.fecModifico = fecModifico;
        this.usuario = usuario;
    }    

    
    /**
     * Set elActPrin value.
     *
     * @param elActPrin java.lang.String
     */
    public void setElActPrin(java.lang.String elActPrin){
        this.elActPrin = elActPrin;
    }
    
    /**
     * Get elActPrin value.
     *
     * @return java.lang.String
     */
    public java.lang.String getElActPrin() {
        return this.elActPrin;    
    }
    
    /**
     * Set elEmpresa value.
     *
     * @param elEmpresa java.lang.String
     */
    public void setElEmpresa(java.lang.String elEmpresa){
        this.elEmpresa = elEmpresa;
    }
    
    /**
     * Get elEmpresa value.
     *
     * @return java.lang.String
     */
    public java.lang.String getElEmpresa() {
        return this.elEmpresa;    
    }
    
    /**
     * Set elNivelCargo value.
     *
     * @param elNivelCargo java.lang.String
     */
    public void setElNivelCargo(java.lang.String elNivelCargo){
        this.elNivelCargo = elNivelCargo;
    }
    
    /**
     * Get elNivelCargo value.
     *
     * @return java.lang.String
     */
    public java.lang.String getElNivelCargo() {
        return this.elNivelCargo;    
    }
    
    /**
     * Set idTdExpLab value.
     *
     * @param idTdExpLab java.lang.String
     */
    public void setIdTdExpLab(java.lang.String idTdExpLab){
        this.idTdExpLab = idTdExpLab;
    }
    
    /**
     * Get idTdExpLab value.
     *
     * @return java.lang.String
     */
    public java.lang.String getIdTdExpLab() {
        return this.idTdExpLab;    
    }
    
    /**
     * Set elFecFin value.
     *
     * @param elFecFin java.util.Date
     */
    public void setElFecFin(java.util.Date elFecFin){
        this.elFecFin = elFecFin;
    }
    
    /**
     * Get elFecFin value.
     *
     * @return java.util.Date
     */
    public java.util.Date getElFecFin() {
        return this.elFecFin;    
    }
    
    /**
     * Set elFecIng value.
     *
     * @param elFecIng java.util.Date
     */
    public void setElFecIng(java.util.Date elFecIng){
        this.elFecIng = elFecIng;
    }
    
    /**
     * Get elFecIng value.
     *
     * @return java.util.Date
     */
    public java.util.Date getElFecIng() {
        return this.elFecIng;    
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