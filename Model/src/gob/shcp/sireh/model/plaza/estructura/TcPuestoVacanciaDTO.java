package gob.shcp.sireh.model.plaza.estructura;

import gob.shcp.fsn.model.Model;

import org.springmodules.validation.bean.conf.loader.annotation.handler.NotNull;
import org.springmodules.validation.bean.conf.loader.annotation.handler.NotBlank;
import org.springmodules.validation.bean.conf.loader.annotation.handler.MaxLength;

/**
 * Model object for transporting TcPuestoVacancia data.
 */
public class TcPuestoVacanciaDTO  implements java.io.Serializable, Model {    

    @NotBlank(errorCode="not.null")
    @MaxLength(10)    
    private java.lang.String idPtoDestino;
    @NotBlank(errorCode="not.null")
    @MaxLength(10)    
    private java.lang.String idPtoOrigen;
    @NotNull
    private java.util.Date fecModifico;
    @NotBlank(errorCode="not.null")
    @NotNull
    @MaxLength(30)    
    private java.lang.String usuario;

    /**
     * Constructor for TcPuestoVacanciaDTO class.
     */
    public TcPuestoVacanciaDTO() { }    

                    
    /**
     * Constructor for TcPuestoVacanciaDTO class.
     *
     * @param idPtoDestino java.lang.String
     * @param idPtoOrigen java.lang.String
     * @param fecModifico java.util.Date
     * @param usuario java.lang.String
     */
    public TcPuestoVacanciaDTO( java.lang.String idPtoDestino, java.lang.String idPtoOrigen, java.util.Date fecModifico, java.lang.String usuario){    
        this.idPtoDestino = idPtoDestino;
        this.idPtoOrigen = idPtoOrigen;
        this.fecModifico = fecModifico;
        this.usuario = usuario;
    }    

    
    /**
     * Set idPtoDestino value.
     *
     * @param idPtoDestino java.lang.String
     */
    public void setIdPtoDestino(java.lang.String idPtoDestino){
        this.idPtoDestino = idPtoDestino;
    }
    
    /**
     * Get idPtoDestino value.
     *
     * @return java.lang.String
     */
    public java.lang.String getIdPtoDestino() {
        return this.idPtoDestino;    
    }
    
    /**
     * Set idPtoOrigen value.
     *
     * @param idPtoOrigen java.lang.String
     */
    public void setIdPtoOrigen(java.lang.String idPtoOrigen){
        this.idPtoOrigen = idPtoOrigen;
    }
    
    /**
     * Get idPtoOrigen value.
     *
     * @return java.lang.String
     */
    public java.lang.String getIdPtoOrigen() {
        return this.idPtoOrigen;    
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