package gob.shcp.sireh.model;

import gob.shcp.fsn.model.Model;

import org.springmodules.validation.bean.conf.loader.annotation.handler.NotNull;
import org.springmodules.validation.bean.conf.loader.annotation.handler.NotBlank;
import org.springmodules.validation.bean.conf.loader.annotation.handler.MaxLength;

/**
 * Model object for transporting TcAtributoPuesto data.
 */
public class TcAtributoPuestoDTO  implements java.io.Serializable, Model {    

    private java.util.Date apFin;
    @NotBlank(errorCode="not.null")
    @MaxLength(28)    
    private java.lang.String idAtributoPuesto;
    @NotBlank(errorCode="not.null")
    @NotNull
    @MaxLength(4)    
    private java.lang.String idJerarquia;
    @NotBlank(errorCode="not.null")
    @NotNull
    @MaxLength(8)    
    private java.lang.String idNombramiento;
    @NotBlank(errorCode="not.null")
    @NotNull
    @MaxLength(4)    
    private java.lang.String apErarioFederal;
    @NotNull
    private double apIncentivo;
    @NotNull
    private java.util.Date apIni;
    @NotNull
    private java.util.Date fecModifico;
    @NotBlank(errorCode="not.null")
    @NotNull
    @MaxLength(16)    
    private java.lang.String idNivelPto;
    @NotBlank(errorCode="not.null")
    @NotNull
    @MaxLength(120)    
    private java.lang.String usuario;

    /**
     * Constructor for TcAtributoPuestoDTO class.
     */
    public TcAtributoPuestoDTO() { }    

                                            
    /**
     * Constructor for TcAtributoPuestoDTO class.
     *
     * @param apFin java.util.Date
     * @param idAtributoPuesto java.lang.String
     * @param idJerarquia java.lang.String
     * @param idNombramiento java.lang.String
     * @param apErarioFederal java.lang.String
     * @param apIncentivo double
     * @param apIni java.util.Date
     * @param fecModifico java.util.Date
     * @param idNivelPto java.lang.String
     * @param usuario java.lang.String
     */
    public TcAtributoPuestoDTO( java.util.Date apFin, java.lang.String idAtributoPuesto, java.lang.String idJerarquia, java.lang.String idNombramiento, java.lang.String apErarioFederal, double apIncentivo, java.util.Date apIni, java.util.Date fecModifico, java.lang.String idNivelPto, java.lang.String usuario){    
        this.apFin = apFin;
        this.idAtributoPuesto = idAtributoPuesto;
        this.idJerarquia = idJerarquia;
        this.idNombramiento = idNombramiento;
        this.apErarioFederal = apErarioFederal;
        this.apIncentivo = apIncentivo;
        this.apIni = apIni;
        this.fecModifico = fecModifico;
        this.idNivelPto = idNivelPto;
        this.usuario = usuario;
    }    

    
    /**
     * Set apFin value.
     *
     * @param apFin java.util.Date
     */
    public void setApFin(java.util.Date apFin){
        this.apFin = apFin;
    }
    
    /**
     * Get apFin value.
     *
     * @return java.util.Date
     */
    public java.util.Date getApFin() {
        return this.apFin;    
    }
    
    /**
     * Set idAtributoPuesto value.
     *
     * @param idAtributoPuesto java.lang.String
     */
    public void setIdAtributoPuesto(java.lang.String idAtributoPuesto){
        this.idAtributoPuesto = idAtributoPuesto;
    }
    
    /**
     * Get idAtributoPuesto value.
     *
     * @return java.lang.String
     */
    public java.lang.String getIdAtributoPuesto() {
        return this.idAtributoPuesto;    
    }
    
    /**
     * Set idJerarquia value.
     *
     * @param idJerarquia java.lang.String
     */
    public void setIdJerarquia(java.lang.String idJerarquia){
        this.idJerarquia = idJerarquia;
    }
    
    /**
     * Get idJerarquia value.
     *
     * @return java.lang.String
     */
    public java.lang.String getIdJerarquia() {
        return this.idJerarquia;    
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
     * Set apErarioFederal value.
     *
     * @param apErarioFederal java.lang.String
     */
    public void setApErarioFederal(java.lang.String apErarioFederal){
        this.apErarioFederal = apErarioFederal;
    }
    
    /**
     * Get apErarioFederal value.
     *
     * @return java.lang.String
     */
    public java.lang.String getApErarioFederal() {
        return this.apErarioFederal;    
    }
    
    /**
     * Set apIncentivo value.
     *
     * @param apIncentivo double
     */
    public void setApIncentivo(double apIncentivo){
        this.apIncentivo = apIncentivo;
    }
    
    /**
     * Get apIncentivo value.
     *
     * @return double
     */
    public double getApIncentivo() {
        return this.apIncentivo;    
    }
    
    /**
     * Set apIni value.
     *
     * @param apIni java.util.Date
     */
    public void setApIni(java.util.Date apIni){
        this.apIni = apIni;
    }
    
    /**
     * Get apIni value.
     *
     * @return java.util.Date
     */
    public java.util.Date getApIni() {
        return this.apIni;    
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