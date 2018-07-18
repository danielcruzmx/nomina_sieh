package gob.shcp.sireh.model;

import gob.shcp.fsn.model.Model;

import org.springmodules.validation.bean.conf.loader.annotation.handler.NotNull;
import org.springmodules.validation.bean.conf.loader.annotation.handler.NotBlank;
import org.springmodules.validation.bean.conf.loader.annotation.handler.MaxLength;

/**
 * Model object for transporting TcMovsPersonal data.
 */
public class TcMovsPersonalDTO  implements java.io.Serializable, Model {    

    private java.lang.Integer idMovsPersonal;
    @MaxLength(8)    
    private java.lang.String idSitPlaNva;
    @NotNull
    private java.util.Date fecModifico;
    @NotBlank(errorCode="not.null")
    @NotNull
    @MaxLength(120)    
    private java.lang.String usuario;
    @MaxLength(800)    
    private java.lang.String descMovsPersonal;
    @MaxLength(8)    
    private java.lang.String idSitPlaAnt;
    @MaxLength(4)    
    private java.lang.String mpConstancia;
    @MaxLength(60)    
    private java.lang.String mpGrupoPago;
    @MaxLength(60)    
    private java.lang.String mpJerarquia;
    @MaxLength(80)    
    private java.lang.String mpNombramiento;
    @MaxLength(60)    
    private java.lang.String mpTipoMovMenu;

    /**
     * Constructor for TcMovsPersonalDTO class.
     */
    public TcMovsPersonalDTO() { }    

                                                
    /**
     * Constructor for TcMovsPersonalDTO class.
     *
     * @param idMovsPersonal java.lang.Integer
     * @param idSitPlaNva java.lang.String
     * @param fecModifico java.util.Date
     * @param usuario java.lang.String
     * @param descMovsPersonal java.lang.String
     * @param idSitPlaAnt java.lang.String
     * @param mpConstancia java.lang.String
     * @param mpGrupoPago java.lang.String
     * @param mpJerarquia java.lang.String
     * @param mpNombramiento java.lang.String
     * @param mpTipoMovMenu java.lang.String
     */
    public TcMovsPersonalDTO( java.lang.Integer idMovsPersonal, java.lang.String idSitPlaNva, java.util.Date fecModifico, java.lang.String usuario, java.lang.String descMovsPersonal, java.lang.String idSitPlaAnt, java.lang.String mpConstancia, java.lang.String mpGrupoPago, java.lang.String mpJerarquia, java.lang.String mpNombramiento, java.lang.String mpTipoMovMenu){    
        this.idMovsPersonal = idMovsPersonal;
        this.idSitPlaNva = idSitPlaNva;
        this.fecModifico = fecModifico;
        this.usuario = usuario;
        this.descMovsPersonal = descMovsPersonal;
        this.idSitPlaAnt = idSitPlaAnt;
        this.mpConstancia = mpConstancia;
        this.mpGrupoPago = mpGrupoPago;
        this.mpJerarquia = mpJerarquia;
        this.mpNombramiento = mpNombramiento;
        this.mpTipoMovMenu = mpTipoMovMenu;
    }    

    
    /**
     * Set idMovsPersonal value.
     *
     * @param idMovsPersonal java.lang.Integer
     */
    public void setIdMovsPersonal(java.lang.Integer idMovsPersonal){
        this.idMovsPersonal = idMovsPersonal;
    }
    
    /**
     * Get idMovsPersonal value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getIdMovsPersonal() {
        return this.idMovsPersonal;    
    }
    
    /**
     * Set idSitPlaNva value.
     *
     * @param idSitPlaNva java.lang.String
     */
    public void setIdSitPlaNva(java.lang.String idSitPlaNva){
        this.idSitPlaNva = idSitPlaNva;
    }
    
    /**
     * Get idSitPlaNva value.
     *
     * @return java.lang.String
     */
    public java.lang.String getIdSitPlaNva() {
        return this.idSitPlaNva;    
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
     * Set descMovsPersonal value.
     *
     * @param descMovsPersonal java.lang.String
     */
    public void setDescMovsPersonal(java.lang.String descMovsPersonal){
        this.descMovsPersonal = descMovsPersonal;
    }
    
    /**
     * Get descMovsPersonal value.
     *
     * @return java.lang.String
     */
    public java.lang.String getDescMovsPersonal() {
        return this.descMovsPersonal;    
    }
    
    /**
     * Set idSitPlaAnt value.
     *
     * @param idSitPlaAnt java.lang.String
     */
    public void setIdSitPlaAnt(java.lang.String idSitPlaAnt){
        this.idSitPlaAnt = idSitPlaAnt;
    }
    
    /**
     * Get idSitPlaAnt value.
     *
     * @return java.lang.String
     */
    public java.lang.String getIdSitPlaAnt() {
        return this.idSitPlaAnt;    
    }
    
    /**
     * Set mpConstancia value.
     *
     * @param mpConstancia java.lang.String
     */
    public void setMpConstancia(java.lang.String mpConstancia){
        this.mpConstancia = mpConstancia;
    }
    
    /**
     * Get mpConstancia value.
     *
     * @return java.lang.String
     */
    public java.lang.String getMpConstancia() {
        return this.mpConstancia;    
    }
    
    /**
     * Set mpGrupoPago value.
     *
     * @param mpGrupoPago java.lang.String
     */
    public void setMpGrupoPago(java.lang.String mpGrupoPago){
        this.mpGrupoPago = mpGrupoPago;
    }
    
    /**
     * Get mpGrupoPago value.
     *
     * @return java.lang.String
     */
    public java.lang.String getMpGrupoPago() {
        return this.mpGrupoPago;    
    }
    
    /**
     * Set mpJerarquia value.
     *
     * @param mpJerarquia java.lang.String
     */
    public void setMpJerarquia(java.lang.String mpJerarquia){
        this.mpJerarquia = mpJerarquia;
    }
    
    /**
     * Get mpJerarquia value.
     *
     * @return java.lang.String
     */
    public java.lang.String getMpJerarquia() {
        return this.mpJerarquia;    
    }
    
    /**
     * Set mpNombramiento value.
     *
     * @param mpNombramiento java.lang.String
     */
    public void setMpNombramiento(java.lang.String mpNombramiento){
        this.mpNombramiento = mpNombramiento;
    }
    
    /**
     * Get mpNombramiento value.
     *
     * @return java.lang.String
     */
    public java.lang.String getMpNombramiento() {
        return this.mpNombramiento;    
    }
    
    /**
     * Set mpTipoMovMenu value.
     *
     * @param mpTipoMovMenu java.lang.String
     */
    public void setMpTipoMovMenu(java.lang.String mpTipoMovMenu){
        this.mpTipoMovMenu = mpTipoMovMenu;
    }
    
    /**
     * Get mpTipoMovMenu value.
     *
     * @return java.lang.String
     */
    public java.lang.String getMpTipoMovMenu() {
        return this.mpTipoMovMenu;    
    }


}