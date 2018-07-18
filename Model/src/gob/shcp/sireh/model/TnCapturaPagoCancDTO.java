package gob.shcp.sireh.model;

import gob.shcp.fsn.model.Model;

import org.springmodules.validation.bean.conf.loader.annotation.handler.NotBlank;
import org.springmodules.validation.bean.conf.loader.annotation.handler.MaxLength;

/**
 * Model object for transporting TnCapturaPagoCanc data.
 */
public class TnCapturaPagoCancDTO  implements java.io.Serializable, Model {    

    private java.lang.Long cpcChequeOComproban;
    private java.lang.Integer cpcDifFolio;
    @NotBlank(errorCode="not.null")
    @MaxLength(1)    
    private java.lang.String idSitPago;
    private java.lang.Integer idMotivoCancela;
    @MaxLength(6)    
    private java.lang.String cpcAtentaNota;
    private java.lang.Integer cpcNumCxlcDgap;
    private java.lang.Integer cpcQnaAplica;
    private java.lang.Integer cpcQnaCaptura;
    @MaxLength(18)    
    private java.lang.String cpcReferencia;
    private java.util.Date fecModifico;
    @MaxLength(13)    
    private java.lang.String usuario;

    /**
     * Constructor for TnCapturaPagoCancDTO class.
     */
    public TnCapturaPagoCancDTO() { }    

                                                
    /**
     * Constructor for TnCapturaPagoCancDTO class.
     *
     * @param cpcChequeOComproban java.lang.Long
     * @param cpcDifFolio java.lang.Integer
     * @param idSitPago java.lang.String
     * @param idMotivoCancela java.lang.Integer
     * @param cpcAtentaNota java.lang.String
     * @param cpcNumCxlcDgap java.lang.Integer
     * @param cpcQnaAplica java.lang.Integer
     * @param cpcQnaCaptura java.lang.Integer
     * @param cpcReferencia java.lang.String
     * @param fecModifico java.util.Date
     * @param usuario java.lang.String
     */
    public TnCapturaPagoCancDTO( java.lang.Long cpcChequeOComproban, java.lang.Integer cpcDifFolio, java.lang.String idSitPago, java.lang.Integer idMotivoCancela, java.lang.String cpcAtentaNota, java.lang.Integer cpcNumCxlcDgap, java.lang.Integer cpcQnaAplica, java.lang.Integer cpcQnaCaptura, java.lang.String cpcReferencia, java.util.Date fecModifico, java.lang.String usuario){    
        this.cpcChequeOComproban = cpcChequeOComproban;
        this.cpcDifFolio = cpcDifFolio;
        this.idSitPago = idSitPago;
        this.idMotivoCancela = idMotivoCancela;
        this.cpcAtentaNota = cpcAtentaNota;
        this.cpcNumCxlcDgap = cpcNumCxlcDgap;
        this.cpcQnaAplica = cpcQnaAplica;
        this.cpcQnaCaptura = cpcQnaCaptura;
        this.cpcReferencia = cpcReferencia;
        this.fecModifico = fecModifico;
        this.usuario = usuario;
    }    

    
    /**
     * Set cpcChequeOComproban value.
     *
     * @param cpcChequeOComproban java.lang.Long
     */
    public void setCpcChequeOComproban(java.lang.Long cpcChequeOComproban){
        this.cpcChequeOComproban = cpcChequeOComproban;
    }
    
    /**
     * Get cpcChequeOComproban value.
     *
     * @return java.lang.Long
     */
    public java.lang.Long getCpcChequeOComproban() {
        return this.cpcChequeOComproban;    
    }
    
    /**
     * Set cpcDifFolio value.
     *
     * @param cpcDifFolio java.lang.Integer
     */
    public void setCpcDifFolio(java.lang.Integer cpcDifFolio){
        this.cpcDifFolio = cpcDifFolio;
    }
    
    /**
     * Get cpcDifFolio value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getCpcDifFolio() {
        return this.cpcDifFolio;    
    }
    
    /**
     * Set idSitPago value.
     *
     * @param idSitPago java.lang.String
     */
    public void setIdSitPago(java.lang.String idSitPago){
        this.idSitPago = idSitPago;
    }
    
    /**
     * Get idSitPago value.
     *
     * @return java.lang.String
     */
    public java.lang.String getIdSitPago() {
        return this.idSitPago;    
    }
    
    /**
     * Set idMotivoCancela value.
     *
     * @param idMotivoCancela java.lang.Integer
     */
    public void setIdMotivoCancela(java.lang.Integer idMotivoCancela){
        this.idMotivoCancela = idMotivoCancela;
    }
    
    /**
     * Get idMotivoCancela value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getIdMotivoCancela() {
        return this.idMotivoCancela;    
    }
    
    /**
     * Set cpcAtentaNota value.
     *
     * @param cpcAtentaNota java.lang.String
     */
    public void setCpcAtentaNota(java.lang.String cpcAtentaNota){
        this.cpcAtentaNota = cpcAtentaNota;
    }
    
    /**
     * Get cpcAtentaNota value.
     *
     * @return java.lang.String
     */
    public java.lang.String getCpcAtentaNota() {
        return this.cpcAtentaNota;    
    }
    
    /**
     * Set cpcNumCxlcDgap value.
     *
     * @param cpcNumCxlcDgap java.lang.Integer
     */
    public void setCpcNumCxlcDgap(java.lang.Integer cpcNumCxlcDgap){
        this.cpcNumCxlcDgap = cpcNumCxlcDgap;
    }
    
    /**
     * Get cpcNumCxlcDgap value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getCpcNumCxlcDgap() {
        return this.cpcNumCxlcDgap;    
    }
    
    /**
     * Set cpcQnaAplica value.
     *
     * @param cpcQnaAplica java.lang.Integer
     */
    public void setCpcQnaAplica(java.lang.Integer cpcQnaAplica){
        this.cpcQnaAplica = cpcQnaAplica;
    }
    
    /**
     * Get cpcQnaAplica value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getCpcQnaAplica() {
        return this.cpcQnaAplica;    
    }
    
    /**
     * Set cpcQnaCaptura value.
     *
     * @param cpcQnaCaptura java.lang.Integer
     */
    public void setCpcQnaCaptura(java.lang.Integer cpcQnaCaptura){
        this.cpcQnaCaptura = cpcQnaCaptura;
    }
    
    /**
     * Get cpcQnaCaptura value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getCpcQnaCaptura() {
        return this.cpcQnaCaptura;    
    }
    
    /**
     * Set cpcReferencia value.
     *
     * @param cpcReferencia java.lang.String
     */
    public void setCpcReferencia(java.lang.String cpcReferencia){
        this.cpcReferencia = cpcReferencia;
    }
    
    /**
     * Get cpcReferencia value.
     *
     * @return java.lang.String
     */
    public java.lang.String getCpcReferencia() {
        return this.cpcReferencia;    
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