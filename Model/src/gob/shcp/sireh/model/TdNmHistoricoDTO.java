package gob.shcp.sireh.model;

import gob.shcp.fsn.model.Model;

import org.springmodules.validation.bean.conf.loader.annotation.handler.NotNull;
import org.springmodules.validation.bean.conf.loader.annotation.handler.NotBlank;
import org.springmodules.validation.bean.conf.loader.annotation.handler.MaxLength;

/**
 * Model object for transporting TdNmHistorico data.
 */
public class TdNmHistoricoDTO  implements java.io.Serializable, Model {    

    private java.lang.Integer nmhCausal;
    private java.lang.Integer nmhCiclo;
    @NotBlank(errorCode="not.null")
    @MaxLength(48)    
    private java.lang.String nmhNumDocto;
    @NotBlank(errorCode="not.null")
    @MaxLength(52)    
    private java.lang.String nmhRfc;
    @NotBlank(errorCode="not.null")
    @MaxLength(52)    
    private java.lang.String nmhRfcUnico;
    @NotNull
    private java.util.Date fecModifico;
    @NotBlank(errorCode="not.null")
    @NotNull
    @MaxLength(12)    
    private java.lang.String idUnidad;
    @NotBlank(errorCode="not.null")
    @NotNull
    @MaxLength(120)    
    private java.lang.String usuario;
    @MaxLength(4)    
    private java.lang.String idGenero;
    @MaxLength(16)    
    private java.lang.String idNivelPto;
    private java.lang.Integer idPlaza;
    @MaxLength(28)    
    private java.lang.String idPuesto;
    private java.lang.Integer nmhCicloPago;
    private java.util.Date nmhFechaAgre;
    private java.util.Date nmhFechaReg;
    @MaxLength(48)    
    private java.lang.String nmhMesCurso;
    @MaxLength(60)    
    private java.lang.String nmhOp;
    private java.lang.Integer nmhQnaPagoValidar;
    @MaxLength(4)    
    private java.lang.String nmhTipoPlaza;

    /**
     * Constructor for TdNmHistoricoDTO class.
     */
    public TdNmHistoricoDTO() { }    

                                                                                
    /**
     * Constructor for TdNmHistoricoDTO class.
     *
     * @param nmhCausal java.lang.Integer
     * @param nmhCiclo java.lang.Integer
     * @param nmhNumDocto java.lang.String
     * @param nmhRfc java.lang.String
     * @param nmhRfcUnico java.lang.String
     * @param fecModifico java.util.Date
     * @param idUnidad java.lang.String
     * @param usuario java.lang.String
     * @param idGenero java.lang.String
     * @param idNivelPto java.lang.String
     * @param idPlaza java.lang.Integer
     * @param idPuesto java.lang.String
     * @param nmhCicloPago java.lang.Integer
     * @param nmhFechaAgre java.util.Date
     * @param nmhFechaReg java.util.Date
     * @param nmhMesCurso java.lang.String
     * @param nmhOp java.lang.String
     * @param nmhQnaPagoValidar java.lang.Integer
     * @param nmhTipoPlaza java.lang.String
     */
    public TdNmHistoricoDTO( java.lang.Integer nmhCausal, java.lang.Integer nmhCiclo, java.lang.String nmhNumDocto, java.lang.String nmhRfc, java.lang.String nmhRfcUnico, java.util.Date fecModifico, java.lang.String idUnidad, java.lang.String usuario, java.lang.String idGenero, java.lang.String idNivelPto, java.lang.Integer idPlaza, java.lang.String idPuesto, java.lang.Integer nmhCicloPago, java.util.Date nmhFechaAgre, java.util.Date nmhFechaReg, java.lang.String nmhMesCurso, java.lang.String nmhOp, java.lang.Integer nmhQnaPagoValidar, java.lang.String nmhTipoPlaza){    
        this.nmhCausal = nmhCausal;
        this.nmhCiclo = nmhCiclo;
        this.nmhNumDocto = nmhNumDocto;
        this.nmhRfc = nmhRfc;
        this.nmhRfcUnico = nmhRfcUnico;
        this.fecModifico = fecModifico;
        this.idUnidad = idUnidad;
        this.usuario = usuario;
        this.idGenero = idGenero;
        this.idNivelPto = idNivelPto;
        this.idPlaza = idPlaza;
        this.idPuesto = idPuesto;
        this.nmhCicloPago = nmhCicloPago;
        this.nmhFechaAgre = nmhFechaAgre;
        this.nmhFechaReg = nmhFechaReg;
        this.nmhMesCurso = nmhMesCurso;
        this.nmhOp = nmhOp;
        this.nmhQnaPagoValidar = nmhQnaPagoValidar;
        this.nmhTipoPlaza = nmhTipoPlaza;
    }    

    
    /**
     * Set nmhCausal value.
     *
     * @param nmhCausal java.lang.Integer
     */
    public void setNmhCausal(java.lang.Integer nmhCausal){
        this.nmhCausal = nmhCausal;
    }
    
    /**
     * Get nmhCausal value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getNmhCausal() {
        return this.nmhCausal;    
    }
    
    /**
     * Set nmhCiclo value.
     *
     * @param nmhCiclo java.lang.Integer
     */
    public void setNmhCiclo(java.lang.Integer nmhCiclo){
        this.nmhCiclo = nmhCiclo;
    }
    
    /**
     * Get nmhCiclo value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getNmhCiclo() {
        return this.nmhCiclo;    
    }
    
    /**
     * Set nmhNumDocto value.
     *
     * @param nmhNumDocto java.lang.String
     */
    public void setNmhNumDocto(java.lang.String nmhNumDocto){
        this.nmhNumDocto = nmhNumDocto;
    }
    
    /**
     * Get nmhNumDocto value.
     *
     * @return java.lang.String
     */
    public java.lang.String getNmhNumDocto() {
        return this.nmhNumDocto;    
    }
    
    /**
     * Set nmhRfc value.
     *
     * @param nmhRfc java.lang.String
     */
    public void setNmhRfc(java.lang.String nmhRfc){
        this.nmhRfc = nmhRfc;
    }
    
    /**
     * Get nmhRfc value.
     *
     * @return java.lang.String
     */
    public java.lang.String getNmhRfc() {
        return this.nmhRfc;    
    }
    
    /**
     * Set nmhRfcUnico value.
     *
     * @param nmhRfcUnico java.lang.String
     */
    public void setNmhRfcUnico(java.lang.String nmhRfcUnico){
        this.nmhRfcUnico = nmhRfcUnico;
    }
    
    /**
     * Get nmhRfcUnico value.
     *
     * @return java.lang.String
     */
    public java.lang.String getNmhRfcUnico() {
        return this.nmhRfcUnico;    
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
     * Set idUnidad value.
     *
     * @param idUnidad java.lang.String
     */
    public void setIdUnidad(java.lang.String idUnidad){
        this.idUnidad = idUnidad;
    }
    
    /**
     * Get idUnidad value.
     *
     * @return java.lang.String
     */
    public java.lang.String getIdUnidad() {
        return this.idUnidad;    
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
     * Set idGenero value.
     *
     * @param idGenero java.lang.String
     */
    public void setIdGenero(java.lang.String idGenero){
        this.idGenero = idGenero;
    }
    
    /**
     * Get idGenero value.
     *
     * @return java.lang.String
     */
    public java.lang.String getIdGenero() {
        return this.idGenero;    
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
     * Set idPlaza value.
     *
     * @param idPlaza java.lang.Integer
     */
    public void setIdPlaza(java.lang.Integer idPlaza){
        this.idPlaza = idPlaza;
    }
    
    /**
     * Get idPlaza value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getIdPlaza() {
        return this.idPlaza;    
    }
    
    /**
     * Set idPuesto value.
     *
     * @param idPuesto java.lang.String
     */
    public void setIdPuesto(java.lang.String idPuesto){
        this.idPuesto = idPuesto;
    }
    
    /**
     * Get idPuesto value.
     *
     * @return java.lang.String
     */
    public java.lang.String getIdPuesto() {
        return this.idPuesto;    
    }
    
    /**
     * Set nmhCicloPago value.
     *
     * @param nmhCicloPago java.lang.Integer
     */
    public void setNmhCicloPago(java.lang.Integer nmhCicloPago){
        this.nmhCicloPago = nmhCicloPago;
    }
    
    /**
     * Get nmhCicloPago value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getNmhCicloPago() {
        return this.nmhCicloPago;    
    }
    
    /**
     * Set nmhFechaAgre value.
     *
     * @param nmhFechaAgre java.util.Date
     */
    public void setNmhFechaAgre(java.util.Date nmhFechaAgre){
        this.nmhFechaAgre = nmhFechaAgre;
    }
    
    /**
     * Get nmhFechaAgre value.
     *
     * @return java.util.Date
     */
    public java.util.Date getNmhFechaAgre() {
        return this.nmhFechaAgre;    
    }
    
    /**
     * Set nmhFechaReg value.
     *
     * @param nmhFechaReg java.util.Date
     */
    public void setNmhFechaReg(java.util.Date nmhFechaReg){
        this.nmhFechaReg = nmhFechaReg;
    }
    
    /**
     * Get nmhFechaReg value.
     *
     * @return java.util.Date
     */
    public java.util.Date getNmhFechaReg() {
        return this.nmhFechaReg;    
    }
    
    /**
     * Set nmhMesCurso value.
     *
     * @param nmhMesCurso java.lang.String
     */
    public void setNmhMesCurso(java.lang.String nmhMesCurso){
        this.nmhMesCurso = nmhMesCurso;
    }
    
    /**
     * Get nmhMesCurso value.
     *
     * @return java.lang.String
     */
    public java.lang.String getNmhMesCurso() {
        return this.nmhMesCurso;    
    }
    
    /**
     * Set nmhOp value.
     *
     * @param nmhOp java.lang.String
     */
    public void setNmhOp(java.lang.String nmhOp){
        this.nmhOp = nmhOp;
    }
    
    /**
     * Get nmhOp value.
     *
     * @return java.lang.String
     */
    public java.lang.String getNmhOp() {
        return this.nmhOp;    
    }
    
    /**
     * Set nmhQnaPagoValidar value.
     *
     * @param nmhQnaPagoValidar java.lang.Integer
     */
    public void setNmhQnaPagoValidar(java.lang.Integer nmhQnaPagoValidar){
        this.nmhQnaPagoValidar = nmhQnaPagoValidar;
    }
    
    /**
     * Get nmhQnaPagoValidar value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getNmhQnaPagoValidar() {
        return this.nmhQnaPagoValidar;    
    }
    
    /**
     * Set nmhTipoPlaza value.
     *
     * @param nmhTipoPlaza java.lang.String
     */
    public void setNmhTipoPlaza(java.lang.String nmhTipoPlaza){
        this.nmhTipoPlaza = nmhTipoPlaza;
    }
    
    /**
     * Get nmhTipoPlaza value.
     *
     * @return java.lang.String
     */
    public java.lang.String getNmhTipoPlaza() {
        return this.nmhTipoPlaza;    
    }


}