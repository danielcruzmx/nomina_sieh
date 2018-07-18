package gob.shcp.sireh.model.spc;

import gob.shcp.fsn.model.Model;

import org.springmodules.validation.bean.conf.loader.annotation.handler.NotNull;
import org.springmodules.validation.bean.conf.loader.annotation.handler.NotBlank;
import org.springmodules.validation.bean.conf.loader.annotation.handler.MaxLength;

/**
 * Model object for transporting TcCapNotifCurso data.
 */
public class TcCapNotifCursoDTO  implements java.io.Serializable, Model {    

    private java.lang.Integer capNotifCursoCiclo;
    private java.lang.Integer idModalidad;
    @NotBlank(errorCode="not.null")
    @NotNull
    @MaxLength(400)    
    private java.lang.String capNotifCursoAsunto;
    @NotBlank(errorCode="not.null")
    @NotNull
    @MaxLength(4000)    
    private java.lang.String capNotifCursoMsg;
    @NotNull
    private java.util.Date fecModifico;
    @NotBlank(errorCode="not.null")
    @NotNull
    @MaxLength(12)    
    private java.lang.String idStatus;
    @NotBlank(errorCode="not.null")
    @NotNull
    @MaxLength(120)    
    private java.lang.String usuario;

    /**
     * Constructor for TcCapNotifCursoDTO class.
     */
    public TcCapNotifCursoDTO() { }    

                                
    /**
     * Constructor for TcCapNotifCursoDTO class.
     *
     * @param capNotifCursoCiclo java.lang.Integer
     * @param idModalidad java.lang.Integer
     * @param capNotifCursoAsunto java.lang.String
     * @param capNotifCursoMsg java.lang.String
     * @param fecModifico java.util.Date
     * @param idStatus java.lang.String
     * @param usuario java.lang.String
     */
    public TcCapNotifCursoDTO( java.lang.Integer capNotifCursoCiclo, java.lang.Integer idModalidad, java.lang.String capNotifCursoAsunto, java.lang.String capNotifCursoMsg, java.util.Date fecModifico, java.lang.String idStatus, java.lang.String usuario){    
        this.capNotifCursoCiclo = capNotifCursoCiclo;
        this.idModalidad = idModalidad;
        this.capNotifCursoAsunto = capNotifCursoAsunto;
        this.capNotifCursoMsg = capNotifCursoMsg;
        this.fecModifico = fecModifico;
        this.idStatus = idStatus;
        this.usuario = usuario;
    }    

    
    /**
     * Set capNotifCursoCiclo value.
     *
     * @param capNotifCursoCiclo java.lang.Integer
     */
    public void setCapNotifCursoCiclo(java.lang.Integer capNotifCursoCiclo){
        this.capNotifCursoCiclo = capNotifCursoCiclo;
    }
    
    /**
     * Get capNotifCursoCiclo value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getCapNotifCursoCiclo() {
        return this.capNotifCursoCiclo;    
    }
    
    /**
     * Set idModalidad value.
     *
     * @param idModalidad java.lang.Integer
     */
    public void setIdModalidad(java.lang.Integer idModalidad){
        this.idModalidad = idModalidad;
    }
    
    /**
     * Get idModalidad value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getIdModalidad() {
        return this.idModalidad;    
    }
    
    /**
     * Set capNotifCursoAsunto value.
     *
     * @param capNotifCursoAsunto java.lang.String
     */
    public void setCapNotifCursoAsunto(java.lang.String capNotifCursoAsunto){
        this.capNotifCursoAsunto = capNotifCursoAsunto;
    }
    
    /**
     * Get capNotifCursoAsunto value.
     *
     * @return java.lang.String
     */
    public java.lang.String getCapNotifCursoAsunto() {
        return this.capNotifCursoAsunto;    
    }
    
    /**
     * Set capNotifCursoMsg value.
     *
     * @param capNotifCursoMsg java.lang.String
     */
    public void setCapNotifCursoMsg(java.lang.String capNotifCursoMsg){
        this.capNotifCursoMsg = capNotifCursoMsg;
    }
    
    /**
     * Get capNotifCursoMsg value.
     *
     * @return java.lang.String
     */
    public java.lang.String getCapNotifCursoMsg() {
        return this.capNotifCursoMsg;    
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