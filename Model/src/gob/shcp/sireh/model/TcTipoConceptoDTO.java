package gob.shcp.sireh.model;

import gob.shcp.fsn.model.Model;

import org.springmodules.validation.bean.conf.loader.annotation.handler.NotNull;
import org.springmodules.validation.bean.conf.loader.annotation.handler.NotBlank;
import org.springmodules.validation.bean.conf.loader.annotation.handler.MaxLength;

/**
 * Model object for transporting TcTipoConcepto data.
 */
public class TcTipoConceptoDTO  implements java.io.Serializable, Model {    

    @NotBlank(errorCode="not.null")
    @MaxLength(1)    
    private java.lang.String idTipoConcepto;
    @NotBlank(errorCode="not.null")
    @NotNull
    @MaxLength(40)    
    private java.lang.String descTipoConcepto;
    @NotNull
    private java.util.Date fecModifico;
    @NotBlank(errorCode="not.null")
    @NotNull
    @MaxLength(13)    
    private java.lang.String usuario;

    /**
     * Constructor for TcTipoConceptoDTO class.
     */
    public TcTipoConceptoDTO() { }    

                    
    /**
     * Constructor for TcTipoConceptoDTO class.
     *
     * @param idTipoConcepto java.lang.String
     * @param descTipoConcepto java.lang.String
     * @param fecModifico java.util.Date
     * @param usuario java.lang.String
     */
    public TcTipoConceptoDTO( java.lang.String idTipoConcepto, java.lang.String descTipoConcepto, java.util.Date fecModifico, java.lang.String usuario){    
        this.idTipoConcepto = idTipoConcepto;
        this.descTipoConcepto = descTipoConcepto;
        this.fecModifico = fecModifico;
        this.usuario = usuario;
    }    

    
    /**
     * Set idTipoConcepto value.
     *
     * @param idTipoConcepto java.lang.String
     */
    public void setIdTipoConcepto(java.lang.String idTipoConcepto){
        this.idTipoConcepto = idTipoConcepto;
    }
    
    /**
     * Get idTipoConcepto value.
     *
     * @return java.lang.String
     */
    public java.lang.String getIdTipoConcepto() {
        return this.idTipoConcepto;    
    }
    
    /**
     * Set descTipoConcepto value.
     *
     * @param descTipoConcepto java.lang.String
     */
    public void setDescTipoConcepto(java.lang.String descTipoConcepto){
        this.descTipoConcepto = descTipoConcepto;
    }
    
    /**
     * Get descTipoConcepto value.
     *
     * @return java.lang.String
     */
    public java.lang.String getDescTipoConcepto() {
        return this.descTipoConcepto;    
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