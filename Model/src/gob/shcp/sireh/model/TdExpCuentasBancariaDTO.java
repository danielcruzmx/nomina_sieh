package gob.shcp.sireh.model;

import gob.shcp.fsn.model.Model;

import org.springmodules.validation.bean.conf.loader.annotation.handler.NotNull;
import org.springmodules.validation.bean.conf.loader.annotation.handler.NotBlank;
import org.springmodules.validation.bean.conf.loader.annotation.handler.MaxLength;

/**
 * Model object for transporting TdExpCuentasBancaria data.
 */
public class TdExpCuentasBancariaDTO  implements java.io.Serializable, Model {    

    private java.lang.Integer ctaSecuencia;
    @NotBlank(errorCode="not.null")
    @MaxLength(20)    
    private java.lang.String idDocto;
    @NotBlank(errorCode="not.null")
    @MaxLength(52)    
    private java.lang.String rfcEmpleado;
    @NotNull
    private int idExpRechazo;
    @NotBlank(errorCode="not.null")
    @NotNull
    @MaxLength(12)    
    private java.lang.String ctaTipo;
    @NotNull
    private java.util.Date fecModifico;
    @NotBlank(errorCode="not.null")
    @NotNull
    @MaxLength(12)    
    private java.lang.String idBanco;
    @NotBlank(errorCode="not.null")
    @NotNull
    @MaxLength(12)    
    private java.lang.String idStatus;
    @NotBlank(errorCode="not.null")
    @NotNull
    @MaxLength(120)    
    private java.lang.String usuario;
    @MaxLength(72)    
    private java.lang.String ctaClabe;
    @MaxLength(400)    
    private java.lang.String ctaDoctoRef;
    private java.math.BigDecimal ctaNumero;

    /**
     * Constructor for TdExpCuentasBancariaDTO class.
     */
    public TdExpCuentasBancariaDTO() { }    

                                                    
    /**
     * Constructor for TdExpCuentasBancariaDTO class.
     *
     * @param ctaSecuencia java.lang.Integer
     * @param idDocto java.lang.String
     * @param rfcEmpleado java.lang.String
     * @param idExpRechazo int
     * @param ctaTipo java.lang.String
     * @param fecModifico java.util.Date
     * @param idBanco java.lang.String
     * @param idStatus java.lang.String
     * @param usuario java.lang.String
     * @param ctaClabe java.lang.String
     * @param ctaDoctoRef java.lang.String
     * @param ctaNumero java.math.BigDecimal
     */
    public TdExpCuentasBancariaDTO( java.lang.Integer ctaSecuencia, java.lang.String idDocto, java.lang.String rfcEmpleado, int idExpRechazo, java.lang.String ctaTipo, java.util.Date fecModifico, java.lang.String idBanco, java.lang.String idStatus, java.lang.String usuario, java.lang.String ctaClabe, java.lang.String ctaDoctoRef, java.math.BigDecimal ctaNumero){    
        this.ctaSecuencia = ctaSecuencia;
        this.idDocto = idDocto;
        this.rfcEmpleado = rfcEmpleado;
        this.idExpRechazo = idExpRechazo;
        this.ctaTipo = ctaTipo;
        this.fecModifico = fecModifico;
        this.idBanco = idBanco;
        this.idStatus = idStatus;
        this.usuario = usuario;
        this.ctaClabe = ctaClabe;
        this.ctaDoctoRef = ctaDoctoRef;
        this.ctaNumero = ctaNumero;
    }    

    
    /**
     * Set ctaSecuencia value.
     *
     * @param ctaSecuencia java.lang.Integer
     */
    public void setCtaSecuencia(java.lang.Integer ctaSecuencia){
        this.ctaSecuencia = ctaSecuencia;
    }
    
    /**
     * Get ctaSecuencia value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getCtaSecuencia() {
        return this.ctaSecuencia;    
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
     * Set ctaTipo value.
     *
     * @param ctaTipo java.lang.String
     */
    public void setCtaTipo(java.lang.String ctaTipo){
        this.ctaTipo = ctaTipo;
    }
    
    /**
     * Get ctaTipo value.
     *
     * @return java.lang.String
     */
    public java.lang.String getCtaTipo() {
        return this.ctaTipo;    
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
     * Set idBanco value.
     *
     * @param idBanco java.lang.String
     */
    public void setIdBanco(java.lang.String idBanco){
        this.idBanco = idBanco;
    }
    
    /**
     * Get idBanco value.
     *
     * @return java.lang.String
     */
    public java.lang.String getIdBanco() {
        return this.idBanco;    
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
     * Set ctaClabe value.
     *
     * @param ctaClabe java.lang.String
     */
    public void setCtaClabe(java.lang.String ctaClabe){
        this.ctaClabe = ctaClabe;
    }
    
    /**
     * Get ctaClabe value.
     *
     * @return java.lang.String
     */
    public java.lang.String getCtaClabe() {
        return this.ctaClabe;    
    }
    
    /**
     * Set ctaDoctoRef value.
     *
     * @param ctaDoctoRef java.lang.String
     */
    public void setCtaDoctoRef(java.lang.String ctaDoctoRef){
        this.ctaDoctoRef = ctaDoctoRef;
    }
    
    /**
     * Get ctaDoctoRef value.
     *
     * @return java.lang.String
     */
    public java.lang.String getCtaDoctoRef() {
        return this.ctaDoctoRef;    
    }
    
    /**
     * Set ctaNumero value.
     *
     * @param ctaNumero java.math.BigDecimal
     */
    public void setCtaNumero(java.math.BigDecimal ctaNumero){
        this.ctaNumero = ctaNumero;
    }
    
    /**
     * Get ctaNumero value.
     *
     * @return java.math.BigDecimal
     */
    public java.math.BigDecimal getCtaNumero() {
        return this.ctaNumero;    
    }


}