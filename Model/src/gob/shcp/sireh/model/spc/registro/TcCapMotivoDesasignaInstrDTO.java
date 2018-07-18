package gob.shcp.sireh.model.spc.registro;

import gob.shcp.fsn.model.Model;

import org.springmodules.validation.bean.conf.loader.annotation.handler.NotNull;
import org.springmodules.validation.bean.conf.loader.annotation.handler.NotBlank;
import org.springmodules.validation.bean.conf.loader.annotation.handler.MaxLength;

/**
 * Model object for transporting TcCapMotivoDesasignaInstr data.
 */
public class TcCapMotivoDesasignaInstrDTO  implements java.io.Serializable, Model {    

    private java.lang.Integer idMotivoDesasignaInstr;
    @NotBlank(errorCode="not.null")
    @NotNull
    @MaxLength(200)    
    private java.lang.String descMotivoDesasignaInstr;
    @NotNull
    private java.util.Date fecModifico;
    @NotBlank(errorCode="not.null")
    @NotNull
    @MaxLength(600)    
    private java.lang.String idStatus;
    @NotBlank(errorCode="not.null")
    @NotNull
    @MaxLength(120)    
    private java.lang.String usuario;

    /**
     * Constructor for TcCapMotivoDesasignaInstrDTO class.
     */
    public TcCapMotivoDesasignaInstrDTO() { }    

                        
    /**
     * Constructor for TcCapMotivoDesasignaInstrDTO class.
     *
     * @param idMotivoDesasignaInstr java.lang.Integer
     * @param descMotivoDesasignaInstr java.lang.String
     * @param fecModifico java.util.Date
     * @param idStatus java.lang.String
     * @param usuario java.lang.String
     */
    public TcCapMotivoDesasignaInstrDTO( java.lang.Integer idMotivoDesasignaInstr, java.lang.String descMotivoDesasignaInstr, java.util.Date fecModifico, java.lang.String idStatus, java.lang.String usuario){    
        this.idMotivoDesasignaInstr = idMotivoDesasignaInstr;
        this.descMotivoDesasignaInstr = descMotivoDesasignaInstr;
        this.fecModifico = fecModifico;
        this.idStatus = idStatus;
        this.usuario = usuario;
    }    

    
    /**
     * Set idMotivoDesasignaInstr value.
     *
     * @param idMotivoDesasignaInstr java.lang.Integer
     */
    public void setIdMotivoDesasignaInstr(java.lang.Integer idMotivoDesasignaInstr){
        this.idMotivoDesasignaInstr = idMotivoDesasignaInstr;
    }
    
    /**
     * Get idMotivoDesasignaInstr value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getIdMotivoDesasignaInstr() {
        return this.idMotivoDesasignaInstr;    
    }
    
    /**
     * Set descMotivoDesasignaInstr value.
     *
     * @param descMotivoDesasignaInstr java.lang.String
     */
    public void setDescMotivoDesasignaInstr(java.lang.String descMotivoDesasignaInstr){
        this.descMotivoDesasignaInstr = descMotivoDesasignaInstr;
    }
    
    /**
     * Get descMotivoDesasignaInstr value.
     *
     * @return java.lang.String
     */
    public java.lang.String getDescMotivoDesasignaInstr() {
        return this.descMotivoDesasignaInstr;    
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
     * Set idStatus value.
     *
     * @param idStatus java.lang.String
     */
    public void setIdStatus(java.lang.String idStatus){
        this.idStatus = idStatus;
    }
    
    /**
     * Get idStatus value.
     *
     * @return java.lang.String
     */
    public java.lang.String getIdStatus() {
        return this.idStatus;    
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