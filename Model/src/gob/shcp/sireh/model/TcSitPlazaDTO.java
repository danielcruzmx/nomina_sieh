package gob.shcp.sireh.model;

import gob.shcp.fsn.model.Model;

import gob.shcp.sireh.model.plaza.TdPlazaDTO;

import org.springmodules.validation.bean.conf.loader.annotation.handler.NotNull;
import org.springmodules.validation.bean.conf.loader.annotation.handler.NotBlank;
import org.springmodules.validation.bean.conf.loader.annotation.handler.MaxLength;

/**
 * Model object for transporting TcSitPlaza data.
 */
public class TcSitPlazaDTO  implements java.io.Serializable, Model {    

    @NotBlank(errorCode="not.null")
    @MaxLength(8)    
    private java.lang.String idSitPlaza;
    @NotBlank(errorCode="not.null")
    @NotNull
    @MaxLength(160)    
    private java.lang.String descSitPlaza;
    @NotNull
    private java.util.Date fecModifico;
    @NotBlank(errorCode="not.null")
    @NotNull
    @MaxLength(120)    
    private java.lang.String usuario;
    private java.util.List <TcMovsPersonalDTO> tcMovsPersonals;
    private java.util.List <TdPlazaDTO> tdPlazas;

    /**
     * Constructor for TcSitPlazaDTO class.
     */
    public TcSitPlazaDTO() { }    

                    
    /**
     * Constructor for TcSitPlazaDTO class.
     *
     * @param idSitPlaza java.lang.String
     * @param descSitPlaza java.lang.String
     * @param fecModifico java.util.Date
     * @param usuario java.lang.String
     */
    public TcSitPlazaDTO( java.lang.String idSitPlaza, java.lang.String descSitPlaza, java.util.Date fecModifico, java.lang.String usuario, java.util.List <TcMovsPersonalDTO> tcMovsPersonals, java.util.List <TdPlazaDTO> tdPlazas){    
        this.idSitPlaza = idSitPlaza;
        this.descSitPlaza = descSitPlaza;
        this.fecModifico = fecModifico;
        this.usuario = usuario;
        this.tcMovsPersonals = tcMovsPersonals;
        this.tdPlazas = tdPlazas;
    }    

    
    /**
     * Set idSitPlaza value.
     *
     * @param idSitPlaza java.lang.String
     */
    public void setIdSitPlaza(java.lang.String idSitPlaza){
        this.idSitPlaza = idSitPlaza;
    }
    
    /**
     * Get idSitPlaza value.
     *
     * @return java.lang.String
     */
    public java.lang.String getIdSitPlaza() {
        return this.idSitPlaza;    
    }
    
    /**
     * Set descSitPlaza value.
     *
     * @param descSitPlaza java.lang.String
     */
    public void setDescSitPlaza(java.lang.String descSitPlaza){
        this.descSitPlaza = descSitPlaza;
    }
    
    /**
     * Get descSitPlaza value.
     *
     * @return java.lang.String
     */
    public java.lang.String getDescSitPlaza() {
        return this.descSitPlaza;    
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
     * Set tcMovsPersonals value.
     *
     * @param tcMovsPersonals java.util.List
     */
    public void setTcMovsPersonals(java.util.List <TcMovsPersonalDTO> tcMovsPersonals ){
        this.tcMovsPersonals = tcMovsPersonals;
    }
    
    /**
     * Get tcMovsPersonals value.
     *
     * @return java.util.List
     */
    public java.util.List getTcMovsPersonals() {    
        return this.tcMovsPersonals;
    }
    /**
     * Set tdPlazas value.
     *
     * @param tdPlazas java.util.List
     */
    public void setTdPlazas(java.util.List <TdPlazaDTO> tdPlazas ){
        this.tdPlazas = tdPlazas;
    }
    
    /**
     * Get tdPlazas value.
     *
     * @return java.util.List
     */
    public java.util.List getTdPlazas() {    
        return this.tdPlazas;
    }


}