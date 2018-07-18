package gob.shcp.sireh.model.plaza.estructura;

import gob.shcp.fsn.model.Model;

import org.springmodules.validation.bean.conf.loader.annotation.handler.NotNull;
import org.springmodules.validation.bean.conf.loader.annotation.handler.NotBlank;
import org.springmodules.validation.bean.conf.loader.annotation.handler.MaxLength;

/**
 * Model object for transporting TcVacancia data.
 */
public class TcVacanciaDTO  implements java.io.Serializable, Model {    

    @NotBlank(errorCode="not.null")
    private Integer idVacancia;
    private java.lang.String descVacancia;
    @NotNull
    private java.util.Date fecModifico;
    @NotBlank(errorCode="not.null")
    @NotNull
    @MaxLength(30)    
    private java.lang.String usuario;

    /**
     * Constructor for TcVacanciaDTO class.
     */
    public TcVacanciaDTO() { }    

                    
    /**
     * Constructor for TcVacanciaDTO class.
     *
     * @param idVacancia java.lang.String
     * @param descVacancia java.lang.String
     * @param fecModifico java.util.Date
     * @param usuario java.lang.String
     */
    public TcVacanciaDTO( Integer idVacancia, java.lang.String descVacancia, java.util.Date fecModifico, java.lang.String usuario){    
        this.idVacancia = idVacancia;
        this.descVacancia = descVacancia;
        this.fecModifico = fecModifico;
        this.usuario = usuario;
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