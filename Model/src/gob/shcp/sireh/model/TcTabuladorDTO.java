package gob.shcp.sireh.model;

import gob.shcp.fsn.model.Model;

import org.springmodules.validation.bean.conf.loader.annotation.handler.NotNull;
import org.springmodules.validation.bean.conf.loader.annotation.handler.NotBlank;
import org.springmodules.validation.bean.conf.loader.annotation.handler.MaxLength;

/**
 * Model object for transporting TcTabulador data.
 */
public class TcTabuladorDTO  implements java.io.Serializable, Model {    

    @NotBlank(errorCode="not.null")
    @MaxLength(4)    
    private java.lang.String idNivelPto;
    private java.lang.Integer idRango;
    private java.lang.Integer idZonaEcon;
    private java.util.Date tabFin;
    @NotNull
    private java.util.Date fecModifico;
    @NotNull
    private double tabCompensacion;
    @NotNull
    private java.util.Date tabIni;
    @NotNull
    private double tabSueldo;
    @NotBlank(errorCode="not.null")
    @NotNull
    @MaxLength(8)    
    private java.lang.String usuario;

    /**
     * Constructor for TcTabuladorDTO class.
     */
    public TcTabuladorDTO() { }    

                                        
    /**
     * Constructor for TcTabuladorDTO class.
     *
     * @param idNivelPto java.lang.String
     * @param idRango java.lang.Integer
     * @param idZonaEcon java.lang.Integer
     * @param tabFin java.util.Date
     * @param fecModifico java.util.Date
     * @param tabCompensacion double
     * @param tabIni java.util.Date
     * @param tabSueldo double
     * @param usuario java.lang.String
     */
    public TcTabuladorDTO( java.lang.String idNivelPto, java.lang.Integer idRango, java.lang.Integer idZonaEcon, java.util.Date tabFin, java.util.Date fecModifico, double tabCompensacion, java.util.Date tabIni, double tabSueldo, java.lang.String usuario){    
        this.idNivelPto = idNivelPto;
        this.idRango = idRango;
        this.idZonaEcon = idZonaEcon;
        this.tabFin = tabFin;
        this.fecModifico = fecModifico;
        this.tabCompensacion = tabCompensacion;
        this.tabIni = tabIni;
        this.tabSueldo = tabSueldo;
        this.usuario = usuario;
    }    

    
    /**
     * Set idNivelPto value.
     *
     * @param idNivelPto java.lang.String
     */
    public void setIdNivelPto(java.lang.String idNivelPto){
        this.idNivelPto = idNivelPto;
    }
    
    /**
     * Get idNivelPto value.
     *
     * @return java.lang.String
     */
    public java.lang.String getIdNivelPto() {
        return this.idNivelPto;    
    }
    
    /**
     * Set idRango value.
     *
     * @param idRango java.lang.Integer
     */
    public void setIdRango(java.lang.Integer idRango){
        this.idRango = idRango;
    }
    
    /**
     * Get idRango value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getIdRango() {
        return this.idRango;    
    }
    
    /**
     * Set idZonaEcon value.
     *
     * @param idZonaEcon java.lang.Integer
     */
    public void setIdZonaEcon(java.lang.Integer idZonaEcon){
        this.idZonaEcon = idZonaEcon;
    }
    
    /**
     * Get idZonaEcon value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getIdZonaEcon() {
        return this.idZonaEcon;    
    }
    
    /**
     * Set tabFin value.
     *
     * @param tabFin java.util.Date
     */
    public void setTabFin(java.util.Date tabFin){
        this.tabFin = tabFin;
    }
    
    /**
     * Get tabFin value.
     *
     * @return java.util.Date
     */
    public java.util.Date getTabFin() {
        return this.tabFin;    
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
     * Set tabCompensacion value.
     *
     * @param tabCompensacion double
     */
    public void setTabCompensacion(double tabCompensacion){
        this.tabCompensacion = tabCompensacion;
    }
    
    /**
     * Get tabCompensacion value.
     *
     * @return double
     */
    public double getTabCompensacion() {
        return this.tabCompensacion;    
    }
    
    /**
     * Set tabIni value.
     *
     * @param tabIni java.util.Date
     */
    public void setTabIni(java.util.Date tabIni){
        this.tabIni = tabIni;
    }
    
    /**
     * Get tabIni value.
     *
     * @return java.util.Date
     */
    public java.util.Date getTabIni() {
        return this.tabIni;    
    }
    
    /**
     * Set tabSueldo value.
     *
     * @param tabSueldo double
     */
    public void setTabSueldo(double tabSueldo){
        this.tabSueldo = tabSueldo;
    }
    
    /**
     * Get tabSueldo value.
     *
     * @return double
     */
    public double getTabSueldo() {
        return this.tabSueldo;    
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