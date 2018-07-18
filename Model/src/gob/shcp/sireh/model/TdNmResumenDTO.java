package gob.shcp.sireh.model;

import gob.shcp.fsn.model.Model;

import org.springmodules.validation.bean.conf.loader.annotation.handler.NotNull;
import org.springmodules.validation.bean.conf.loader.annotation.handler.NotBlank;
import org.springmodules.validation.bean.conf.loader.annotation.handler.MaxLength;

/**
 * Model object for transporting TdNmResumen data.
 */
public class TdNmResumenDTO  implements java.io.Serializable, Model {    

    private java.lang.Integer nmrCausal;
    private java.lang.Integer nmrCicloPago;
    @NotBlank(errorCode="not.null")
    @MaxLength(52)    
    private java.lang.String nmrRfc;
    @NotNull
    private java.util.Date fecModifico;
    @NotNull
    private int nmrCicloFinal;
    @NotNull
    private int nmrCicloInicial;
    @NotBlank(errorCode="not.null")
    @NotNull
    @MaxLength(120)    
    private java.lang.String usuario;
    private java.lang.Integer nmrCausalDes;
    private java.lang.Boolean nmrCausalOri;
    private java.lang.Integer nmrDiasPagados;
    private java.util.Date nmrFecDeposito;
    private java.util.Date nmrFecEnvio;
    private java.lang.Double nmrImpteBruto;
    private java.lang.Double nmrImpteIsr;
    private java.lang.Double nmrImpteNeto;
    private java.lang.Double nmrImptePension;
    @MaxLength(52)    
    private java.lang.String nmrOficEnvio;
    @MaxLength(60)    
    private java.lang.String nmrOp;
    @MaxLength(52)    
    private java.lang.String nmrReferencia;
    @MaxLength(40)    
    private java.lang.String nmrRemesaInterna;

    /**
     * Constructor for TdNmResumenDTO class.
     */
    public TdNmResumenDTO() { }    

                                                                                    
    /**
     * Constructor for TdNmResumenDTO class.
     *
     * @param nmrCausal java.lang.Integer
     * @param nmrCicloPago java.lang.Integer
     * @param nmrRfc java.lang.String
     * @param fecModifico java.util.Date
     * @param nmrCicloFinal int
     * @param nmrCicloInicial int
     * @param usuario java.lang.String
     * @param nmrCausalDes java.lang.Integer
     * @param nmrCausalOri java.lang.Boolean
     * @param nmrDiasPagados java.lang.Integer
     * @param nmrFecDeposito java.util.Date
     * @param nmrFecEnvio java.util.Date
     * @param nmrImpteBruto java.lang.Double
     * @param nmrImpteIsr java.lang.Double
     * @param nmrImpteNeto java.lang.Double
     * @param nmrImptePension java.lang.Double
     * @param nmrOficEnvio java.lang.String
     * @param nmrOp java.lang.String
     * @param nmrReferencia java.lang.String
     * @param nmrRemesaInterna java.lang.String
     */
    public TdNmResumenDTO( java.lang.Integer nmrCausal, java.lang.Integer nmrCicloPago, java.lang.String nmrRfc, java.util.Date fecModifico, int nmrCicloFinal, int nmrCicloInicial, java.lang.String usuario, java.lang.Integer nmrCausalDes, java.lang.Boolean nmrCausalOri, java.lang.Integer nmrDiasPagados, java.util.Date nmrFecDeposito, java.util.Date nmrFecEnvio, java.lang.Double nmrImpteBruto, java.lang.Double nmrImpteIsr, java.lang.Double nmrImpteNeto, java.lang.Double nmrImptePension, java.lang.String nmrOficEnvio, java.lang.String nmrOp, java.lang.String nmrReferencia, java.lang.String nmrRemesaInterna){    
        this.nmrCausal = nmrCausal;
        this.nmrCicloPago = nmrCicloPago;
        this.nmrRfc = nmrRfc;
        this.fecModifico = fecModifico;
        this.nmrCicloFinal = nmrCicloFinal;
        this.nmrCicloInicial = nmrCicloInicial;
        this.usuario = usuario;
        this.nmrCausalDes = nmrCausalDes;
        this.nmrCausalOri = nmrCausalOri;
        this.nmrDiasPagados = nmrDiasPagados;
        this.nmrFecDeposito = nmrFecDeposito;
        this.nmrFecEnvio = nmrFecEnvio;
        this.nmrImpteBruto = nmrImpteBruto;
        this.nmrImpteIsr = nmrImpteIsr;
        this.nmrImpteNeto = nmrImpteNeto;
        this.nmrImptePension = nmrImptePension;
        this.nmrOficEnvio = nmrOficEnvio;
        this.nmrOp = nmrOp;
        this.nmrReferencia = nmrReferencia;
        this.nmrRemesaInterna = nmrRemesaInterna;
    }    

    
    /**
     * Set nmrCausal value.
     *
     * @param nmrCausal java.lang.Integer
     */
    public void setNmrCausal(java.lang.Integer nmrCausal){
        this.nmrCausal = nmrCausal;
    }
    
    /**
     * Get nmrCausal value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getNmrCausal() {
        return this.nmrCausal;    
    }
    
    /**
     * Set nmrCicloPago value.
     *
     * @param nmrCicloPago java.lang.Integer
     */
    public void setNmrCicloPago(java.lang.Integer nmrCicloPago){
        this.nmrCicloPago = nmrCicloPago;
    }
    
    /**
     * Get nmrCicloPago value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getNmrCicloPago() {
        return this.nmrCicloPago;    
    }
    
    /**
     * Set nmrRfc value.
     *
     * @param nmrRfc java.lang.String
     */
    public void setNmrRfc(java.lang.String nmrRfc){
        this.nmrRfc = nmrRfc;
    }
    
    /**
     * Get nmrRfc value.
     *
     * @return java.lang.String
     */
    public java.lang.String getNmrRfc() {
        return this.nmrRfc;    
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
     * Set nmrCicloFinal value.
     *
     * @param nmrCicloFinal int
     */
    public void setNmrCicloFinal(int nmrCicloFinal){
        this.nmrCicloFinal = nmrCicloFinal;
    }
    
    /**
     * Get nmrCicloFinal value.
     *
     * @return int
     */
    public int getNmrCicloFinal() {
        return this.nmrCicloFinal;    
    }
    
    /**
     * Set nmrCicloInicial value.
     *
     * @param nmrCicloInicial int
     */
    public void setNmrCicloInicial(int nmrCicloInicial){
        this.nmrCicloInicial = nmrCicloInicial;
    }
    
    /**
     * Get nmrCicloInicial value.
     *
     * @return int
     */
    public int getNmrCicloInicial() {
        return this.nmrCicloInicial;    
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
     * Set nmrCausalDes value.
     *
     * @param nmrCausalDes java.lang.Integer
     */
    public void setNmrCausalDes(java.lang.Integer nmrCausalDes){
        this.nmrCausalDes = nmrCausalDes;
    }
    
    /**
     * Get nmrCausalDes value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getNmrCausalDes() {
        return this.nmrCausalDes;    
    }
    
    /**
     * Set nmrCausalOri value.
     *
     * @param nmrCausalOri java.lang.Boolean
     */
    public void setNmrCausalOri(java.lang.Boolean nmrCausalOri){
        this.nmrCausalOri = nmrCausalOri;
    }
    
    /**
     * Get nmrCausalOri value.
     *
     * @return java.lang.Boolean
     */
    public java.lang.Boolean isNmrCausalOri() {
        return this.nmrCausalOri;    
    }
    
    /**
     * Set nmrDiasPagados value.
     *
     * @param nmrDiasPagados java.lang.Integer
     */
    public void setNmrDiasPagados(java.lang.Integer nmrDiasPagados){
        this.nmrDiasPagados = nmrDiasPagados;
    }
    
    /**
     * Get nmrDiasPagados value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getNmrDiasPagados() {
        return this.nmrDiasPagados;    
    }
    
    /**
     * Set nmrFecDeposito value.
     *
     * @param nmrFecDeposito java.util.Date
     */
    public void setNmrFecDeposito(java.util.Date nmrFecDeposito){
        this.nmrFecDeposito = nmrFecDeposito;
    }
    
    /**
     * Get nmrFecDeposito value.
     *
     * @return java.util.Date
     */
    public java.util.Date getNmrFecDeposito() {
        return this.nmrFecDeposito;    
    }
    
    /**
     * Set nmrFecEnvio value.
     *
     * @param nmrFecEnvio java.util.Date
     */
    public void setNmrFecEnvio(java.util.Date nmrFecEnvio){
        this.nmrFecEnvio = nmrFecEnvio;
    }
    
    /**
     * Get nmrFecEnvio value.
     *
     * @return java.util.Date
     */
    public java.util.Date getNmrFecEnvio() {
        return this.nmrFecEnvio;    
    }
    
    /**
     * Set nmrImpteBruto value.
     *
     * @param nmrImpteBruto java.lang.Double
     */
    public void setNmrImpteBruto(java.lang.Double nmrImpteBruto){
        this.nmrImpteBruto = nmrImpteBruto;
    }
    
    /**
     * Get nmrImpteBruto value.
     *
     * @return java.lang.Double
     */
    public java.lang.Double getNmrImpteBruto() {
        return this.nmrImpteBruto;    
    }
    
    /**
     * Set nmrImpteIsr value.
     *
     * @param nmrImpteIsr java.lang.Double
     */
    public void setNmrImpteIsr(java.lang.Double nmrImpteIsr){
        this.nmrImpteIsr = nmrImpteIsr;
    }
    
    /**
     * Get nmrImpteIsr value.
     *
     * @return java.lang.Double
     */
    public java.lang.Double getNmrImpteIsr() {
        return this.nmrImpteIsr;    
    }
    
    /**
     * Set nmrImpteNeto value.
     *
     * @param nmrImpteNeto java.lang.Double
     */
    public void setNmrImpteNeto(java.lang.Double nmrImpteNeto){
        this.nmrImpteNeto = nmrImpteNeto;
    }
    
    /**
     * Get nmrImpteNeto value.
     *
     * @return java.lang.Double
     */
    public java.lang.Double getNmrImpteNeto() {
        return this.nmrImpteNeto;    
    }
    
    /**
     * Set nmrImptePension value.
     *
     * @param nmrImptePension java.lang.Double
     */
    public void setNmrImptePension(java.lang.Double nmrImptePension){
        this.nmrImptePension = nmrImptePension;
    }
    
    /**
     * Get nmrImptePension value.
     *
     * @return java.lang.Double
     */
    public java.lang.Double getNmrImptePension() {
        return this.nmrImptePension;    
    }
    
    /**
     * Set nmrOficEnvio value.
     *
     * @param nmrOficEnvio java.lang.String
     */
    public void setNmrOficEnvio(java.lang.String nmrOficEnvio){
        this.nmrOficEnvio = nmrOficEnvio;
    }
    
    /**
     * Get nmrOficEnvio value.
     *
     * @return java.lang.String
     */
    public java.lang.String getNmrOficEnvio() {
        return this.nmrOficEnvio;    
    }
    
    /**
     * Set nmrOp value.
     *
     * @param nmrOp java.lang.String
     */
    public void setNmrOp(java.lang.String nmrOp){
        this.nmrOp = nmrOp;
    }
    
    /**
     * Get nmrOp value.
     *
     * @return java.lang.String
     */
    public java.lang.String getNmrOp() {
        return this.nmrOp;    
    }
    
    /**
     * Set nmrReferencia value.
     *
     * @param nmrReferencia java.lang.String
     */
    public void setNmrReferencia(java.lang.String nmrReferencia){
        this.nmrReferencia = nmrReferencia;
    }
    
    /**
     * Get nmrReferencia value.
     *
     * @return java.lang.String
     */
    public java.lang.String getNmrReferencia() {
        return this.nmrReferencia;    
    }
    
    /**
     * Set nmrRemesaInterna value.
     *
     * @param nmrRemesaInterna java.lang.String
     */
    public void setNmrRemesaInterna(java.lang.String nmrRemesaInterna){
        this.nmrRemesaInterna = nmrRemesaInterna;
    }
    
    /**
     * Get nmrRemesaInterna value.
     *
     * @return java.lang.String
     */
    public java.lang.String getNmrRemesaInterna() {
        return this.nmrRemesaInterna;    
    }


}