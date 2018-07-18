package gob.shcp.sireh.model;

import gob.shcp.fsn.model.Model;

import org.springmodules.validation.bean.conf.loader.annotation.handler.NotNull;
import org.springmodules.validation.bean.conf.loader.annotation.handler.NotBlank;
import org.springmodules.validation.bean.conf.loader.annotation.handler.MaxLength;

/**
 * Model object for transporting TdExpExperienciaLaboral data.
 */
public class TdExpExperienciaLaboralDTO  implements java.io.Serializable, Model {    

    private java.lang.Integer expSecuencia;
    @NotBlank(errorCode="not.null")
    @MaxLength(20)    
    private java.lang.String idDocto;
    @NotBlank(errorCode="not.null")
    @MaxLength(52)    
    private java.lang.String rfcEmpleado;
    @NotNull
    private int idExpRechazo;
    @NotNull
    private java.util.Date expFecFinal;
    @NotNull
    private java.util.Date expFecInicial;
    @NotBlank(errorCode="not.null")
    @NotNull
    @MaxLength(160)    
    private java.lang.String expOrganizacion;
    @NotNull
    private java.util.Date fecModifico;
    @NotBlank(errorCode="not.null")
    @NotNull
    @MaxLength(20)    
    private java.lang.String idActPrinc;
    @NotBlank(errorCode="not.null")
    @NotNull
    @MaxLength(20)    
    private java.lang.String idNivelCargo;
    @NotBlank(errorCode="not.null")
    @NotNull
    @MaxLength(12)    
    private java.lang.String idPais;
    @NotBlank(errorCode="not.null")
    @NotNull
    @MaxLength(12)    
    private java.lang.String idStatus;
    @NotBlank(errorCode="not.null")
    @NotNull
    @MaxLength(120)    
    private java.lang.String usuario;
    @MaxLength(400)    
    private java.lang.String expDoctoRef;
    @MaxLength(12)    
    private java.lang.String expSector;

    /**
     * Constructor for TdExpExperienciaLaboralDTO class.
     */
    public TdExpExperienciaLaboralDTO() { }    

                                                                
    /**
     * Constructor for TdExpExperienciaLaboralDTO class.
     *
     * @param expSecuencia java.lang.Integer
     * @param idDocto java.lang.String
     * @param rfcEmpleado java.lang.String
     * @param idExpRechazo int
     * @param expFecFinal java.util.Date
     * @param expFecInicial java.util.Date
     * @param expOrganizacion java.lang.String
     * @param fecModifico java.util.Date
     * @param idActPrinc java.lang.String
     * @param idNivelCargo java.lang.String
     * @param idPais java.lang.String
     * @param idStatus java.lang.String
     * @param usuario java.lang.String
     * @param expDoctoRef java.lang.String
     * @param expSector java.lang.String
     */
    public TdExpExperienciaLaboralDTO( java.lang.Integer expSecuencia, java.lang.String idDocto, java.lang.String rfcEmpleado, int idExpRechazo, java.util.Date expFecFinal, java.util.Date expFecInicial, java.lang.String expOrganizacion, java.util.Date fecModifico, java.lang.String idActPrinc, java.lang.String idNivelCargo, java.lang.String idPais, java.lang.String idStatus, java.lang.String usuario, java.lang.String expDoctoRef, java.lang.String expSector){    
        this.expSecuencia = expSecuencia;
        this.idDocto = idDocto;
        this.rfcEmpleado = rfcEmpleado;
        this.idExpRechazo = idExpRechazo;
        this.expFecFinal = expFecFinal;
        this.expFecInicial = expFecInicial;
        this.expOrganizacion = expOrganizacion;
        this.fecModifico = fecModifico;
        this.idActPrinc = idActPrinc;
        this.idNivelCargo = idNivelCargo;
        this.idPais = idPais;
        this.idStatus = idStatus;
        this.usuario = usuario;
        this.expDoctoRef = expDoctoRef;
        this.expSector = expSector;
    }    

    
    /**
     * Set expSecuencia value.
     *
     * @param expSecuencia java.lang.Integer
     */
    public void setExpSecuencia(java.lang.Integer expSecuencia){
        this.expSecuencia = expSecuencia;
    }
    
    /**
     * Get expSecuencia value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getExpSecuencia() {
        return this.expSecuencia;    
    }
    
    /**
     * Set idDocto value.
     *
     * @param idDocto java.lang.String
     */
    public void setIdDocto(java.lang.String idDocto){
        this.idDocto = idDocto;
    }
    
    /**
     * Get idDocto value.
     *
     * @return java.lang.String
     */
    public java.lang.String getIdDocto() {
        return this.idDocto;    
    }
    
    /**
     * Set rfcEmpleado value.
     *
     * @param rfcEmpleado java.lang.String
     */
    public void setRfcEmpleado(java.lang.String rfcEmpleado){
        this.rfcEmpleado = rfcEmpleado;
    }
    
    /**
     * Get rfcEmpleado value.
     *
     * @return java.lang.String
     */
    public java.lang.String getRfcEmpleado() {
        return this.rfcEmpleado;    
    }
    
    /**
     * Set idExpRechazo value.
     *
     * @param idExpRechazo int
     */
    public void setIdExpRechazo(int idExpRechazo){
        this.idExpRechazo = idExpRechazo;
    }
    
    /**
     * Get idExpRechazo value.
     *
     * @return int
     */
    public int getIdExpRechazo() {
        return this.idExpRechazo;    
    }
    
    /**
     * Set expFecFinal value.
     *
     * @param expFecFinal java.util.Date
     */
    public void setExpFecFinal(java.util.Date expFecFinal){
        this.expFecFinal = expFecFinal;
    }
    
    /**
     * Get expFecFinal value.
     *
     * @return java.util.Date
     */
    public java.util.Date getExpFecFinal() {
        return this.expFecFinal;    
    }
    
    /**
     * Set expFecInicial value.
     *
     * @param expFecInicial java.util.Date
     */
    public void setExpFecInicial(java.util.Date expFecInicial){
        this.expFecInicial = expFecInicial;
    }
    
    /**
     * Get expFecInicial value.
     *
     * @return java.util.Date
     */
    public java.util.Date getExpFecInicial() {
        return this.expFecInicial;    
    }
    
    /**
     * Set expOrganizacion value.
     *
     * @param expOrganizacion java.lang.String
     */
    public void setExpOrganizacion(java.lang.String expOrganizacion){
        this.expOrganizacion = expOrganizacion;
    }
    
    /**
     * Get expOrganizacion value.
     *
     * @return java.lang.String
     */
    public java.lang.String getExpOrganizacion() {
        return this.expOrganizacion;    
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
     * Set idActPrinc value.
     *
     * @param idActPrinc java.lang.String
     */
    public void setIdActPrinc(java.lang.String idActPrinc){
        this.idActPrinc = idActPrinc;
    }
    
    /**
     * Get idActPrinc value.
     *
     * @return java.lang.String
     */
    public java.lang.String getIdActPrinc() {
        return this.idActPrinc;    
    }
    
    /**
     * Set idNivelCargo value.
     *
     * @param idNivelCargo java.lang.String
     */
    public void setIdNivelCargo(java.lang.String idNivelCargo){
        this.idNivelCargo = idNivelCargo;
    }
    
    /**
     * Get idNivelCargo value.
     *
     * @return java.lang.String
     */
    public java.lang.String getIdNivelCargo() {
        return this.idNivelCargo;    
    }
    
    /**
     * Set idPais value.
     *
     * @param idPais java.lang.String
     */
    public void setIdPais(java.lang.String idPais){
        this.idPais = idPais;
    }
    
    /**
     * Get idPais value.
     *
     * @return java.lang.String
     */
    public java.lang.String getIdPais() {
        return this.idPais;    
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
    
    /**
     * Set expDoctoRef value.
     *
     * @param expDoctoRef java.lang.String
     */
    public void setExpDoctoRef(java.lang.String expDoctoRef){
        this.expDoctoRef = expDoctoRef;
    }
    
    /**
     * Get expDoctoRef value.
     *
     * @return java.lang.String
     */
    public java.lang.String getExpDoctoRef() {
        return this.expDoctoRef;    
    }
    
    /**
     * Set expSector value.
     *
     * @param expSector java.lang.String
     */
    public void setExpSector(java.lang.String expSector){
        this.expSector = expSector;
    }
    
    /**
     * Get expSector value.
     *
     * @return java.lang.String
     */
    public java.lang.String getExpSector() {
        return this.expSector;    
    }


}