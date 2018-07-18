package gob.shcp.sireh.model;

import gob.shcp.fsn.model.Model;

import org.springmodules.validation.bean.conf.loader.annotation.handler.NotNull;
import org.springmodules.validation.bean.conf.loader.annotation.handler.NotBlank;
import org.springmodules.validation.bean.conf.loader.annotation.handler.MaxLength;

/**
 * Model object for transporting TdCxlcError data.
 */
public class TdCxlcErrorDTO  implements java.io.Serializable, Model {    

    private java.lang.Integer ceCiclo;
    @NotBlank(errorCode="not.null")
    @MaxLength(8)    
    private java.lang.String ceComplemento;
    private java.lang.Integer ceQnaPago;
    private java.lang.Integer idCxlcError;
    private java.lang.Long idFolio;
    @NotBlank(errorCode="not.null")
    @MaxLength(12)    
    private java.lang.String idTipoNomina;
    @MaxLength(12)    
    private java.lang.String idCptoPago;
    private java.lang.Integer idEdo;
    @MaxLength(8)    
    private java.lang.String idTipoCpto;
    @MaxLength(12)    
    private java.lang.String idUnidadNom;
    @NotNull
    private java.util.Date fecModifico;
    @NotBlank(errorCode="not.null")
    @NotNull
    @MaxLength(52)    
    private java.lang.String usuario;
    private java.lang.Double ceMonto;
    private java.lang.Boolean ceRevisado;

    /**
     * Constructor for TdCxlcErrorDTO class.
     */
    public TdCxlcErrorDTO() { }    

                                                            
    /**
     * Constructor for TdCxlcErrorDTO class.
     *
     * @param ceCiclo java.lang.Integer
     * @param ceComplemento java.lang.String
     * @param ceQnaPago java.lang.Integer
     * @param idCxlcError java.lang.Integer
     * @param idFolio java.lang.Long
     * @param idTipoNomina java.lang.String
     * @param idCptoPago java.lang.String
     * @param idEdo java.lang.Integer
     * @param idTipoCpto java.lang.String
     * @param idUnidadNom java.lang.String
     * @param fecModifico java.util.Date
     * @param usuario java.lang.String
     * @param ceMonto java.lang.Double
     * @param ceRevisado java.lang.Boolean
     */
    public TdCxlcErrorDTO( java.lang.Integer ceCiclo, java.lang.String ceComplemento, java.lang.Integer ceQnaPago, java.lang.Integer idCxlcError, java.lang.Long idFolio, java.lang.String idTipoNomina, java.lang.String idCptoPago, java.lang.Integer idEdo, java.lang.String idTipoCpto, java.lang.String idUnidadNom, java.util.Date fecModifico, java.lang.String usuario, java.lang.Double ceMonto, java.lang.Boolean ceRevisado){    
        this.ceCiclo = ceCiclo;
        this.ceComplemento = ceComplemento;
        this.ceQnaPago = ceQnaPago;
        this.idCxlcError = idCxlcError;
        this.idFolio = idFolio;
        this.idTipoNomina = idTipoNomina;
        this.idCptoPago = idCptoPago;
        this.idEdo = idEdo;
        this.idTipoCpto = idTipoCpto;
        this.idUnidadNom = idUnidadNom;
        this.fecModifico = fecModifico;
        this.usuario = usuario;
        this.ceMonto = ceMonto;
        this.ceRevisado = ceRevisado;
    }    

    
    /**
     * Set ceCiclo value.
     *
     * @param ceCiclo java.lang.Integer
     */
    public void setCeCiclo(java.lang.Integer ceCiclo){
        this.ceCiclo = ceCiclo;
    }
    
    /**
     * Get ceCiclo value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getCeCiclo() {
        return this.ceCiclo;    
    }
    
    /**
     * Set ceComplemento value.
     *
     * @param ceComplemento java.lang.String
     */
    public void setCeComplemento(java.lang.String ceComplemento){
        this.ceComplemento = ceComplemento;
    }
    
    /**
     * Get ceComplemento value.
     *
     * @return java.lang.String
     */
    public java.lang.String getCeComplemento() {
        return this.ceComplemento;    
    }
    
    /**
     * Set ceQnaPago value.
     *
     * @param ceQnaPago java.lang.Integer
     */
    public void setCeQnaPago(java.lang.Integer ceQnaPago){
        this.ceQnaPago = ceQnaPago;
    }
    
    /**
     * Get ceQnaPago value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getCeQnaPago() {
        return this.ceQnaPago;    
    }
    
    /**
     * Set idCxlcError value.
     *
     * @param idCxlcError java.lang.Integer
     */
    public void setIdCxlcError(java.lang.Integer idCxlcError){
        this.idCxlcError = idCxlcError;
    }
    
    /**
     * Get idCxlcError value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getIdCxlcError() {
        return this.idCxlcError;    
    }
    
    /**
     * Set idFolio value.
     *
     * @param idFolio java.lang.Long
     */
    public void setIdFolio(java.lang.Long idFolio){
        this.idFolio = idFolio;
    }
    
    /**
     * Get idFolio value.
     *
     * @return java.lang.Long
     */
    public java.lang.Long getIdFolio() {
        return this.idFolio;    
    }
    
    /**
     * Set idTipoNomina value.
     *
     * @param idTipoNomina java.lang.String
     */
    public void setIdTipoNomina(java.lang.String idTipoNomina){
        this.idTipoNomina = idTipoNomina;
    }
    
    /**
     * Get idTipoNomina value.
     *
     * @return java.lang.String
     */
    public java.lang.String getIdTipoNomina() {
        return this.idTipoNomina;    
    }
    
    /**
     * Set idCptoPago value.
     *
     * @param idCptoPago java.lang.String
     */
    public void setIdCptoPago(java.lang.String idCptoPago){
        this.idCptoPago = idCptoPago;
    }
    
    /**
     * Get idCptoPago value.
     *
     * @return java.lang.String
     */
    public java.lang.String getIdCptoPago() {
        return this.idCptoPago;    
    }
    
    /**
     * Set idEdo value.
     *
     * @param idEdo java.lang.Integer
     */
    public void setIdEdo(java.lang.Integer idEdo){
        this.idEdo = idEdo;
    }
    
    /**
     * Get idEdo value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getIdEdo() {
        return this.idEdo;    
    }
    
    /**
     * Set idTipoCpto value.
     *
     * @param idTipoCpto java.lang.String
     */
    public void setIdTipoCpto(java.lang.String idTipoCpto){
        this.idTipoCpto = idTipoCpto;
    }
    
    /**
     * Get idTipoCpto value.
     *
     * @return java.lang.String
     */
    public java.lang.String getIdTipoCpto() {
        return this.idTipoCpto;    
    }
    
    /**
     * Set idUnidadNom value.
     *
     * @param idUnidadNom java.lang.String
     */
    public void setIdUnidadNom(java.lang.String idUnidadNom){
        this.idUnidadNom = idUnidadNom;
    }
    
    /**
     * Get idUnidadNom value.
     *
     * @return java.lang.String
     */
    public java.lang.String getIdUnidadNom() {
        return this.idUnidadNom;    
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
     * Set ceMonto value.
     *
     * @param ceMonto java.lang.Double
     */
    public void setCeMonto(java.lang.Double ceMonto){
        this.ceMonto = ceMonto;
    }
    
    /**
     * Get ceMonto value.
     *
     * @return java.lang.Double
     */
    public java.lang.Double getCeMonto() {
        return this.ceMonto;    
    }
    
    /**
     * Set ceRevisado value.
     *
     * @param ceRevisado java.lang.Boolean
     */
    public void setCeRevisado(java.lang.Boolean ceRevisado){
        this.ceRevisado = ceRevisado;
    }
    
    /**
     * Get ceRevisado value.
     *
     * @return java.lang.Boolean
     */
    public java.lang.Boolean isCeRevisado() {
        return this.ceRevisado;    
    }


}