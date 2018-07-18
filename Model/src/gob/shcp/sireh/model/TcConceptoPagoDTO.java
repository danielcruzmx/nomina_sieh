package gob.shcp.sireh.model;

import gob.shcp.fsn.model.Model;

import org.springmodules.validation.bean.conf.loader.annotation.handler.NotNull;
import org.springmodules.validation.bean.conf.loader.annotation.handler.NotBlank;
import org.springmodules.validation.bean.conf.loader.annotation.handler.MaxLength;

/**
 * Model object for transporting TcConceptoPago data.
 */
public class TcConceptoPagoDTO  implements java.io.Serializable, Model {    

    @NotBlank(errorCode="not.null")
    @MaxLength(12)    
    private java.lang.String idConcepto;
    @NotBlank(errorCode="not.null")
    @MaxLength(8)    
    private java.lang.String idTipoCpto;
    @NotNull
    private java.util.Date fecModifico;
    @NotBlank(errorCode="not.null")
    @NotNull
    @MaxLength(120)    
    private java.lang.String usuario;
    private java.lang.Boolean cpActivo;
    @MaxLength(4)    
    private java.lang.String cpConPension;
    @MaxLength(180)    
    private java.lang.String cpIsr;
    @MaxLength(12)    
    private java.lang.String cpPrioridad;
    @MaxLength(260)    
    private java.lang.String descConPag;

    /**
     * Constructor for TcConceptoPagoDTO class.
     */
    public TcConceptoPagoDTO() { }    

                                        
    /**
     * Constructor for TcConceptoPagoDTO class.
     *
     * @param idConcepto java.lang.String
     * @param idTipoCpto java.lang.String
     * @param fecModifico java.util.Date
     * @param usuario java.lang.String
     * @param cpActivo java.lang.Boolean
     * @param cpConPension java.lang.String
     * @param cpIsr java.lang.String
     * @param cpPrioridad java.lang.String
     * @param descConPag java.lang.String
     */
    public TcConceptoPagoDTO( java.lang.String idConcepto, java.lang.String idTipoCpto, java.util.Date fecModifico, java.lang.String usuario, java.lang.Boolean cpActivo, java.lang.String cpConPension, java.lang.String cpIsr, java.lang.String cpPrioridad, java.lang.String descConPag){    
        this.idConcepto = idConcepto;
        this.idTipoCpto = idTipoCpto;
        this.fecModifico = fecModifico;
        this.usuario = usuario;
        this.cpActivo = cpActivo;
        this.cpConPension = cpConPension;
        this.cpIsr = cpIsr;
        this.cpPrioridad = cpPrioridad;
        this.descConPag = descConPag;
    }    

    
    /**
     * Set idConcepto value.
     *
     * @param idConcepto java.lang.String
     */
    public void setIdConcepto(java.lang.String idConcepto){
        this.idConcepto = idConcepto;
    }
    
    /**
     * Get idConcepto value.
     *
     * @return java.lang.String
     */
    public java.lang.String getIdConcepto() {
        return this.idConcepto;    
    }
    
    /**
     * Set idTipoCpto value.
     *
     * @param idTipoCpto java.lang.String
     */
    public void setIdTipoCpto(java.lang.String idTipoCpto){
        this.idTipoCpto = idTipoCpto;
    }
    
    /**
     * Get idTipoCpto value.
     *
     * @return java.lang.String
     */
    public java.lang.String getIdTipoCpto() {
        return this.idTipoCpto;    
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
     * Set cpActivo value.
     *
     * @param cpActivo java.lang.Boolean
     */
    public void setCpActivo(java.lang.Boolean cpActivo){
        this.cpActivo = cpActivo;
    }
    
    /**
     * Get cpActivo value.
     *
     * @return java.lang.Boolean
     */
    public java.lang.Boolean isCpActivo() {
        return this.cpActivo;    
    }
    
    /**
     * Set cpConPension value.
     *
     * @param cpConPension java.lang.String
     */
    public void setCpConPension(java.lang.String cpConPension){
        this.cpConPension = cpConPension;
    }
    
    /**
     * Get cpConPension value.
     *
     * @return java.lang.String
     */
    public java.lang.String getCpConPension() {
        return this.cpConPension;    
    }
    
    /**
     * Set cpIsr value.
     *
     * @param cpIsr java.lang.String
     */
    public void setCpIsr(java.lang.String cpIsr){
        this.cpIsr = cpIsr;
    }
    
    /**
     * Get cpIsr value.
     *
     * @return java.lang.String
     */
    public java.lang.String getCpIsr() {
        return this.cpIsr;    
    }
    
    /**
     * Set cpPrioridad value.
     *
     * @param cpPrioridad java.lang.String
     */
    public void setCpPrioridad(java.lang.String cpPrioridad){
        this.cpPrioridad = cpPrioridad;
    }
    
    /**
     * Get cpPrioridad value.
     *
     * @return java.lang.String
     */
    public java.lang.String getCpPrioridad() {
        return this.cpPrioridad;    
    }
    
    /**
     * Set descConPag value.
     *
     * @param descConPag java.lang.String
     */
    public void setDescConPag(java.lang.String descConPag){
        this.descConPag = descConPag;
    }
    
    /**
     * Get descConPag value.
     *
     * @return java.lang.String
     */
    public java.lang.String getDescConPag() {
        return this.descConPag;    
    }


}