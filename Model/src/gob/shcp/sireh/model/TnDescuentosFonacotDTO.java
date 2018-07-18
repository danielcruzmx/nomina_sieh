package gob.shcp.sireh.model;

import gob.shcp.fsn.model.Model;

import org.springmodules.validation.bean.conf.loader.annotation.handler.NotNull;
//import org.springmodules.validation.bean.conf.loader.annotation.handler.NotBlank;
import org.springmodules.validation.bean.conf.loader.annotation.handler.MaxLength;

/**
 * Model object for transporting TnDescuentosFonacot data.
 */
public class TnDescuentosFonacotDTO  implements java.io.Serializable, Model {    

    private java.lang.Long fonacotSecuencia;
    @NotNull
    private int fonacotCiclo;
    @NotNull
    private int fonacotMes;
    @MaxLength(60)    
    private java.lang.String fonacotClave;
    private java.lang.Long fonacotCredito;
    @MaxLength(40)    
    private java.lang.String fonacotFin;
    private java.lang.Integer fonacotIncidencia;
    @MaxLength(40)    
    private java.lang.String fonacotIniBaja;
    private java.lang.Integer fonacotMeses;
    @MaxLength(400)    
    private java.lang.String fonacotNombre;
    private java.lang.Long fonacotNumero;
    private java.lang.Double fonacotPagoQnaNon;
    private java.lang.Double fonacotPagoQnaPar;
    private java.lang.Integer fonacotPlazo;
    private java.lang.Double fonacotRetMensual;
    private java.lang.Double fonacotRetQnaNon;
    private java.lang.Double fonacotRetQnaPar;
    private java.lang.Double fonacotRetReal;
    @MaxLength(40)    
    private java.lang.String fonacotReubicado;
    @MaxLength(52)    
    private java.lang.String fonacotRfc;

    /**
     * Constructor for TnDescuentosFonacotDTO class.
     */
    public TnDescuentosFonacotDTO() { }    

                                                                                    
    /**
     * Constructor for TnDescuentosFonacotDTO class.
     *
     * @param fonacotSecuencia java.lang.Integer
     * @param fonacotCiclo int
     * @param fonacotMes int
     * @param fonacotClave java.lang.String
     * @param fonacotCredito java.lang.Long
     * @param fonacotFin java.lang.String
     * @param fonacotIncidencia java.lang.Boolean
     * @param fonacotIniBaja java.lang.String
     * @param fonacotMeses java.lang.Integer
     * @param fonacotNombre java.lang.String
     * @param fonacotNumero java.lang.Long
     * @param fonacotPagoQnaNon java.lang.Double
     * @param fonacotPagoQnaPar java.lang.Double
     * @param fonacotPlazo java.lang.Integer
     * @param fonacotRetMensual java.lang.Double
     * @param fonacotRetQnaNon java.lang.Double
     * @param fonacotRetQnaPar java.lang.Double
     * @param fonacotRetReal java.lang.Double
     * @param fonacotReubicado java.lang.String
     * @param fonacotRfc java.lang.String
     */
    public TnDescuentosFonacotDTO( java.lang.Long fonacotSecuencia, int fonacotCiclo, int fonacotMes, java.lang.String fonacotClave, java.lang.Long fonacotCredito, java.lang.String fonacotFin, java.lang.Integer fonacotIncidencia, java.lang.String fonacotIniBaja, java.lang.Integer fonacotMeses, java.lang.String fonacotNombre, java.lang.Long fonacotNumero, java.lang.Double fonacotPagoQnaNon, java.lang.Double fonacotPagoQnaPar, java.lang.Integer fonacotPlazo, java.lang.Double fonacotRetMensual, java.lang.Double fonacotRetQnaNon, java.lang.Double fonacotRetQnaPar, java.lang.Double fonacotRetReal, java.lang.String fonacotReubicado, java.lang.String fonacotRfc){    
        this.fonacotSecuencia = fonacotSecuencia;
        this.fonacotCiclo = fonacotCiclo;
        this.fonacotMes = fonacotMes;
        this.fonacotClave = fonacotClave;
        this.fonacotCredito = fonacotCredito;
        this.fonacotFin = fonacotFin;
        this.fonacotIncidencia = fonacotIncidencia;
        this.fonacotIniBaja = fonacotIniBaja;
        this.fonacotMeses = fonacotMeses;
        this.fonacotNombre = fonacotNombre;
        this.fonacotNumero = fonacotNumero;
        this.fonacotPagoQnaNon = fonacotPagoQnaNon;
        this.fonacotPagoQnaPar = fonacotPagoQnaPar;
        this.fonacotPlazo = fonacotPlazo;
        this.fonacotRetMensual = fonacotRetMensual;
        this.fonacotRetQnaNon = fonacotRetQnaNon;
        this.fonacotRetQnaPar = fonacotRetQnaPar;
        this.fonacotRetReal = fonacotRetReal;
        this.fonacotReubicado = fonacotReubicado;
        this.fonacotRfc = fonacotRfc;
    }    

    
    /**
     * Set fonacotSecuencia value.
     *
     * @param fonacotSecuencia java.lang.Integer
     */
    public void setFonacotSecuencia(java.lang.Long fonacotSecuencia){
        this.fonacotSecuencia = fonacotSecuencia;
    }
    
    /**
     * Get fonacotSecuencia value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Long getFonacotSecuencia() {
        return this.fonacotSecuencia;    
    }
    
    /**
     * Set fonacotCiclo value.
     *
     * @param fonacotCiclo int
     */
    public void setFonacotCiclo(int fonacotCiclo){
        this.fonacotCiclo = fonacotCiclo;
    }
    
    /**
     * Get fonacotCiclo value.
     *
     * @return int
     */
    public int getFonacotCiclo() {
        return this.fonacotCiclo;    
    }
    
    /**
     * Set fonacotMes value.
     *
     * @param fonacotMes int
     */
    public void setFonacotMes(int fonacotMes){
        this.fonacotMes = fonacotMes;
    }
    
    /**
     * Get fonacotMes value.
     *
     * @return int
     */
    public int getFonacotMes() {
        return this.fonacotMes;    
    }
    
    /**
     * Set fonacotClave value.
     *
     * @param fonacotClave java.lang.String
     */
    public void setFonacotClave(java.lang.String fonacotClave){
        this.fonacotClave = fonacotClave;
    }
    
    /**
     * Get fonacotClave value.
     *
     * @return java.lang.String
     */
    public java.lang.String getFonacotClave() {
        return this.fonacotClave;    
    }
    
    /**
     * Set fonacotCredito value.
     *
     * @param fonacotCredito java.lang.Long
     */
    public void setFonacotCredito(java.lang.Long fonacotCredito){
        this.fonacotCredito = fonacotCredito;
    }
    
    /**
     * Get fonacotCredito value.
     *
     * @return java.lang.Long
     */
    public java.lang.Long getFonacotCredito() {
        return this.fonacotCredito;    
    }
    
    /**
     * Set fonacotFin value.
     *
     * @param fonacotFin java.lang.String
     */
    public void setFonacotFin(java.lang.String fonacotFin){
        this.fonacotFin = fonacotFin;
    }
    
    /**
     * Get fonacotFin value.
     *
     * @return java.lang.String
     */
    public java.lang.String getFonacotFin() {
        return this.fonacotFin;    
    }
    
    /**
     * Set fonacotIncidencia value.
     *
     * @param fonacotIncidencia java.lang.Boolean
     */
    public void setFonacotIncidencia(java.lang.Integer fonacotIncidencia){
        this.fonacotIncidencia = fonacotIncidencia;
    }
    
    /**
     * Get fonacotIncidencia value.
     *
     * @return java.lang.Boolean
     */
    public java.lang.Integer getFonacotIncidencia() {
        return this.fonacotIncidencia;    
    }
    
    /**
     * Set fonacotIniBaja value.
     *
     * @param fonacotIniBaja java.lang.String
     */
    public void setFonacotIniBaja(java.lang.String fonacotIniBaja){
        this.fonacotIniBaja = fonacotIniBaja;
    }
    
    /**
     * Get fonacotIniBaja value.
     *
     * @return java.lang.String
     */
    public java.lang.String getFonacotIniBaja() {
        return this.fonacotIniBaja;    
    }
    
    /**
     * Set fonacotMeses value.
     *
     * @param fonacotMeses java.lang.Integer
     */
    public void setFonacotMeses(java.lang.Integer fonacotMeses){
        this.fonacotMeses = fonacotMeses;
    }
    
    /**
     * Get fonacotMeses value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getFonacotMeses() {
        return this.fonacotMeses;    
    }
    
    /**
     * Set fonacotNombre value.
     *
     * @param fonacotNombre java.lang.String
     */
    public void setFonacotNombre(java.lang.String fonacotNombre){
        this.fonacotNombre = fonacotNombre;
    }
    
    /**
     * Get fonacotNombre value.
     *
     * @return java.lang.String
     */
    public java.lang.String getFonacotNombre() {
        return this.fonacotNombre;    
    }
    
    /**
     * Set fonacotNumero value.
     *
     * @param fonacotNumero java.lang.Long
     */
    public void setFonacotNumero(java.lang.Long fonacotNumero){
        this.fonacotNumero = fonacotNumero;
    }
    
    /**
     * Get fonacotNumero value.
     *
     * @return java.lang.Long
     */
    public java.lang.Long getFonacotNumero() {
        return this.fonacotNumero;    
    }
    
    /**
     * Set fonacotPagoQnaNon value.
     *
     * @param fonacotPagoQnaNon java.lang.Double
     */
    public void setFonacotPagoQnaNon(java.lang.Double fonacotPagoQnaNon){
        this.fonacotPagoQnaNon = fonacotPagoQnaNon;
    }
    
    /**
     * Get fonacotPagoQnaNon value.
     *
     * @return java.lang.Double
     */
    public java.lang.Double getFonacotPagoQnaNon() {
        return this.fonacotPagoQnaNon;    
    }
    
    /**
     * Set fonacotPagoQnaPar value.
     *
     * @param fonacotPagoQnaPar java.lang.Double
     */
    public void setFonacotPagoQnaPar(java.lang.Double fonacotPagoQnaPar){
        this.fonacotPagoQnaPar = fonacotPagoQnaPar;
    }
    
    /**
     * Get fonacotPagoQnaPar value.
     *
     * @return java.lang.Double
     */
    public java.lang.Double getFonacotPagoQnaPar() {
        return this.fonacotPagoQnaPar;    
    }
    
    /**
     * Set fonacotPlazo value.
     *
     * @param fonacotPlazo java.lang.Integer
     */
    public void setFonacotPlazo(java.lang.Integer fonacotPlazo){
        this.fonacotPlazo = fonacotPlazo;
    }
    
    /**
     * Get fonacotPlazo value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getFonacotPlazo() {
        return this.fonacotPlazo;    
    }
    
    /**
     * Set fonacotRetMensual value.
     *
     * @param fonacotRetMensual java.lang.Double
     */
    public void setFonacotRetMensual(java.lang.Double fonacotRetMensual){
        this.fonacotRetMensual = fonacotRetMensual;
    }
    
    /**
     * Get fonacotRetMensual value.
     *
     * @return java.lang.Double
     */
    public java.lang.Double getFonacotRetMensual() {
        return this.fonacotRetMensual;    
    }
    
    /**
     * Set fonacotRetQnaNon value.
     *
     * @param fonacotRetQnaNon java.lang.Double
     */
    public void setFonacotRetQnaNon(java.lang.Double fonacotRetQnaNon){
        this.fonacotRetQnaNon = fonacotRetQnaNon;
    }
    
    /**
     * Get fonacotRetQnaNon value.
     *
     * @return java.lang.Double
     */
    public java.lang.Double getFonacotRetQnaNon() {
        return this.fonacotRetQnaNon;    
    }
    
    /**
     * Set fonacotRetQnaPar value.
     *
     * @param fonacotRetQnaPar java.lang.Double
     */
    public void setFonacotRetQnaPar(java.lang.Double fonacotRetQnaPar){
        this.fonacotRetQnaPar = fonacotRetQnaPar;
    }
    
    /**
     * Get fonacotRetQnaPar value.
     *
     * @return java.lang.Double
     */
    public java.lang.Double getFonacotRetQnaPar() {
        return this.fonacotRetQnaPar;    
    }
    
    /**
     * Set fonacotRetReal value.
     *
     * @param fonacotRetReal java.lang.Double
     */
    public void setFonacotRetReal(java.lang.Double fonacotRetReal){
        this.fonacotRetReal = fonacotRetReal;
    }
    
    /**
     * Get fonacotRetReal value.
     *
     * @return java.lang.Double
     */
    public java.lang.Double getFonacotRetReal() {
        return this.fonacotRetReal;    
    }
    
    /**
     * Set fonacotReubicado value.
     *
     * @param fonacotReubicado java.lang.String
     */
    public void setFonacotReubicado(java.lang.String fonacotReubicado){
        this.fonacotReubicado = fonacotReubicado;
    }
    
    /**
     * Get fonacotReubicado value.
     *
     * @return java.lang.String
     */
    public java.lang.String getFonacotReubicado() {
        return this.fonacotReubicado;    
    }
    
    /**
     * Set fonacotRfc value.
     *
     * @param fonacotRfc java.lang.String
     */
    public void setFonacotRfc(java.lang.String fonacotRfc){
        this.fonacotRfc = fonacotRfc;
    }
    
    /**
     * Get fonacotRfc value.
     *
     * @return java.lang.String
     */
    public java.lang.String getFonacotRfc() {
        return this.fonacotRfc;    
    }


}