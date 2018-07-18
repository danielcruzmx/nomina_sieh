package gob.shcp.sireh.domain.jdbc;

import gob.shcp.fsn.data.Domain;
import gob.shcp.fsn.data.annotation.PrimaryKey;

import java.io.Serializable;

/**
 * Domain object for persistent TnDescuentosFonacot data.
 */
public class TnDescuentosFonacot implements Domain, Serializable {
    @PrimaryKey(sequenceName = "SN_DESCUENTOS_FONACOT")
    private java.lang.Long fonacotSecuencia;
    private int fonacotCiclo;
    private int fonacotMes;
    private java.lang.String fonacotClave;
    private java.lang.Long fonacotCredito;
    private java.lang.String fonacotFin;
    private java.lang.Integer fonacotIncidencia;
    private java.lang.String fonacotIniBaja;
    private java.lang.Integer fonacotMeses;
    private java.lang.String fonacotNombre;
    private java.lang.Long fonacotNumero;
    private java.lang.Double fonacotPagoQnaNon;
    private java.lang.Double fonacotPagoQnaPar;
    private java.lang.Integer fonacotPlazo;
    private java.lang.Double fonacotRetMensual;
    private java.lang.Double fonacotRetQnaNon;
    private java.lang.Double fonacotRetQnaPar;
    private java.lang.Double fonacotRetReal;
    private java.lang.String fonacotReubicado;
    private java.lang.String fonacotRfc;

    /**
     * Constructor for TnDescuentosFonacot class.
     */
    public TnDescuentosFonacot() {
    }

    /**
     * Constructor for TnDescuentosFonacot class.
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
    public TnDescuentosFonacot(java.lang.Long fonacotSecuencia, 
                               int fonacotCiclo, int fonacotMes, 
                               java.lang.String fonacotClave, 
                               java.lang.Long fonacotCredito, 
                               java.lang.String fonacotFin, 
                               java.lang.Integer fonacotIncidencia, 
                               java.lang.String fonacotIniBaja, 
                               java.lang.Integer fonacotMeses, 
                               java.lang.String fonacotNombre, 
                               java.lang.Long fonacotNumero, 
                               java.lang.Double fonacotPagoQnaNon, 
                               java.lang.Double fonacotPagoQnaPar, 
                               java.lang.Integer fonacotPlazo, 
                               java.lang.Double fonacotRetMensual, 
                               java.lang.Double fonacotRetQnaNon, 
                               java.lang.Double fonacotRetQnaPar, 
                               java.lang.Double fonacotRetReal, 
                               java.lang.String fonacotReubicado, 
                               java.lang.String fonacotRfc) {
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
     * Get fonacotSecuencia value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Long getFonacotSecuencia() {
        return this.fonacotSecuencia;
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
     * Get fonacotMes value.
     *
     * @return int
     */
    public int getFonacotMes() {
        return this.fonacotMes;
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
     * Get fonacotCredito value.
     *
     * @return java.lang.Long
     */
    public java.lang.Long getFonacotCredito() {
        return this.fonacotCredito;
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
     * Get fonacotIncidencia value.
     *
     * @return java.lang.Boolean
     */
    public java.lang.Integer isFonacotIncidencia() {
        return this.fonacotIncidencia;
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
     * Get fonacotMeses value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getFonacotMeses() {
        return this.fonacotMeses;
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
     * Get fonacotNumero value.
     *
     * @return java.lang.Long
     */
    public java.lang.Long getFonacotNumero() {
        return this.fonacotNumero;
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
     * Get fonacotPagoQnaPar value.
     *
     * @return java.lang.Double
     */
    public java.lang.Double getFonacotPagoQnaPar() {
        return this.fonacotPagoQnaPar;
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
     * Get fonacotRetMensual value.
     *
     * @return java.lang.Double
     */
    public java.lang.Double getFonacotRetMensual() {
        return this.fonacotRetMensual;
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
     * Get fonacotRetQnaPar value.
     *
     * @return java.lang.Double
     */
    public java.lang.Double getFonacotRetQnaPar() {
        return this.fonacotRetQnaPar;
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
     * Get fonacotReubicado value.
     *
     * @return java.lang.String
     */
    public java.lang.String getFonacotReubicado() {
        return this.fonacotReubicado;
    }

    /**
     * Get fonacotRfc value.
     *
     * @return java.lang.String
     */
    public java.lang.String getFonacotRfc() {
        return this.fonacotRfc;
    }


    /**
     * Set fonacotSecuencia value.
     *
     * @param fonacotSecuencia java.lang.Integer
     */
    public void setFonacotSecuencia(java.lang.Long fonacotSecuencia) {
        this.fonacotSecuencia = fonacotSecuencia;
    }

    /**
     * Set fonacotCiclo value.
     *
     * @param fonacotCiclo int
     */
    public void setFonacotCiclo(int fonacotCiclo) {
        this.fonacotCiclo = fonacotCiclo;
    }

    /**
     * Set fonacotMes value.
     *
     * @param fonacotMes int
     */
    public void setFonacotMes(int fonacotMes) {
        this.fonacotMes = fonacotMes;
    }

    /**
     * Set fonacotClave value.
     *
     * @param fonacotClave java.lang.String
     */
    public void setFonacotClave(java.lang.String fonacotClave) {
        this.fonacotClave = fonacotClave;
    }

    /**
     * Set fonacotCredito value.
     *
     * @param fonacotCredito java.lang.Long
     */
    public void setFonacotCredito(java.lang.Long fonacotCredito) {
        this.fonacotCredito = fonacotCredito;
    }

    /**
     * Set fonacotFin value.
     *
     * @param fonacotFin java.lang.String
     */
    public void setFonacotFin(java.lang.String fonacotFin) {
        this.fonacotFin = fonacotFin;
    }

    /**
     * Set fonacotIncidencia value.
     *
     * @param fonacotIncidencia java.lang.Boolean
     */
    public void setFonacotIncidencia(java.lang.Integer fonacotIncidencia) {
        this.fonacotIncidencia = fonacotIncidencia;
    }

    /**
     * Set fonacotIniBaja value.
     *
     * @param fonacotIniBaja java.lang.String
     */
    public void setFonacotIniBaja(java.lang.String fonacotIniBaja) {
        this.fonacotIniBaja = fonacotIniBaja;
    }

    /**
     * Set fonacotMeses value.
     *
     * @param fonacotMeses java.lang.Integer
     */
    public void setFonacotMeses(java.lang.Integer fonacotMeses) {
        this.fonacotMeses = fonacotMeses;
    }

    /**
     * Set fonacotNombre value.
     *
     * @param fonacotNombre java.lang.String
     */
    public void setFonacotNombre(java.lang.String fonacotNombre) {
        this.fonacotNombre = fonacotNombre;
    }

    /**
     * Set fonacotNumero value.
     *
     * @param fonacotNumero java.lang.Long
     */
    public void setFonacotNumero(java.lang.Long fonacotNumero) {
        this.fonacotNumero = fonacotNumero;
    }

    /**
     * Set fonacotPagoQnaNon value.
     *
     * @param fonacotPagoQnaNon java.lang.Double
     */
    public void setFonacotPagoQnaNon(java.lang.Double fonacotPagoQnaNon) {
        this.fonacotPagoQnaNon = fonacotPagoQnaNon;
    }

    /**
     * Set fonacotPagoQnaPar value.
     *
     * @param fonacotPagoQnaPar java.lang.Double
     */
    public void setFonacotPagoQnaPar(java.lang.Double fonacotPagoQnaPar) {
        this.fonacotPagoQnaPar = fonacotPagoQnaPar;
    }

    /**
     * Set fonacotPlazo value.
     *
     * @param fonacotPlazo java.lang.Integer
     */
    public void setFonacotPlazo(java.lang.Integer fonacotPlazo) {
        this.fonacotPlazo = fonacotPlazo;
    }

    /**
     * Set fonacotRetMensual value.
     *
     * @param fonacotRetMensual java.lang.Double
     */
    public void setFonacotRetMensual(java.lang.Double fonacotRetMensual) {
        this.fonacotRetMensual = fonacotRetMensual;
    }

    /**
     * Set fonacotRetQnaNon value.
     *
     * @param fonacotRetQnaNon java.lang.Double
     */
    public void setFonacotRetQnaNon(java.lang.Double fonacotRetQnaNon) {
        this.fonacotRetQnaNon = fonacotRetQnaNon;
    }

    /**
     * Set fonacotRetQnaPar value.
     *
     * @param fonacotRetQnaPar java.lang.Double
     */
    public void setFonacotRetQnaPar(java.lang.Double fonacotRetQnaPar) {
        this.fonacotRetQnaPar = fonacotRetQnaPar;
    }

    /**
     * Set fonacotRetReal value.
     *
     * @param fonacotRetReal java.lang.Double
     */
    public void setFonacotRetReal(java.lang.Double fonacotRetReal) {
        this.fonacotRetReal = fonacotRetReal;
    }

    /**
     * Set fonacotReubicado value.
     *
     * @param fonacotReubicado java.lang.String
     */
    public void setFonacotReubicado(java.lang.String fonacotReubicado) {
        this.fonacotReubicado = fonacotReubicado;
    }

    /**
     * Set fonacotRfc value.
     *
     * @param fonacotRfc java.lang.String
     */
    public void setFonacotRfc(java.lang.String fonacotRfc) {
        this.fonacotRfc = fonacotRfc;
    }

    /**
     * Set identity value.
     *
     * @param fonacotSecuencia Serializable
     */
    public void setIdentity(Serializable fonacotSecuencia) {
        this.fonacotSecuencia = (java.lang.Long)fonacotSecuencia;
    }

    /**
     * Get identity value.
     *
     * @return Serializable
     */
    public Serializable getIdentity() {
        return this.fonacotSecuencia;
    }
}
