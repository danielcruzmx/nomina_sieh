package gob.shcp.sireh.model;

import gob.shcp.fsn.model.Model;

import org.springmodules.validation.bean.conf.loader.annotation.handler.NotNull;
import org.springmodules.validation.bean.conf.loader.annotation.handler.NotBlank;
import org.springmodules.validation.bean.conf.loader.annotation.handler.MaxLength;

/**
 * Model object for transporting TcNombramiento data.
 */
public class TcNombramientoDTO  implements java.io.Serializable, Model {    

    @NotBlank(errorCode="not.null")
    @MaxLength(4)    
    private java.lang.String idNombramiento;
    @NotNull
    private java.util.Date fecModifico;
    @NotBlank(errorCode="not.null")
    @NotNull
    @MaxLength(120)    
    private java.lang.String usuario;
    @MaxLength(160)    
    private java.lang.String descNombramiento;
    private java.util.List <TcAtributoPuestoDTO> tcAtributoPuestos;

    /**
     * Constructor for TcNombramientoDTO class.
     */
    public TcNombramientoDTO() { }    

                    
    /**
     * Constructor for TcNombramientoDTO class.
     *
     * @param idNombramiento java.lang.String
     * @param fecModifico java.util.Date
     * @param usuario java.lang.String
     * @param descNombramiento java.lang.String
     */
    public TcNombramientoDTO( java.lang.String idNombramiento, java.util.Date fecModifico, java.lang.String usuario, java.lang.String descNombramiento, java.util.List <TcAtributoPuestoDTO> tcAtributoPuestos){    
        this.idNombramiento = idNombramiento;
        this.fecModifico = fecModifico;
        this.usuario = usuario;
        this.descNombramiento = descNombramiento;
        this.tcAtributoPuestos = tcAtributoPuestos;
    }    

    
    /**
     * Set idNombramiento value.
     *
     * @param idNombramiento java.lang.String
     */
    public void setIdNombramiento(java.lang.String idNombramiento){
        this.idNombramiento = idNombramiento;
    }
    
    /**
     * Get idNombramiento value.
     *
     * @return java.lang.String
     */
    public java.lang.String getIdNombramiento() {
        return this.idNombramiento;    
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
     * Set descNombramiento value.
     *
     * @param descNombramiento java.lang.String
     */
    public void setDescNombramiento(java.lang.String descNombramiento){
        this.descNombramiento = descNombramiento;
    }
    
    /**
     * Get descNombramiento value.
     *
     * @return java.lang.String
     */
    public java.lang.String getDescNombramiento() {
        return this.descNombramiento;    
    }
    /**
     * Set tcAtributoPuestos value.
     *
     * @param tcAtributoPuestos java.util.List
     */
    public void setTcAtributoPuestos(java.util.List <TcAtributoPuestoDTO> tcAtributoPuestos ){
        this.tcAtributoPuestos = tcAtributoPuestos;
    }
    
    /**
     * Get tcAtributoPuestos value.
     *
     * @return java.util.List
     */
    public java.util.List getTcAtributoPuestos() {    
        return this.tcAtributoPuestos;
    }


}