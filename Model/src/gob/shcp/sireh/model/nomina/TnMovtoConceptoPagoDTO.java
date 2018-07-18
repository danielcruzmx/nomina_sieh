package gob.shcp.sireh.model.nomina;

import gob.shcp.fsn.model.Model;

import org.springmodules.validation.bean.conf.loader.annotation.handler.NotNull;
import org.springmodules.validation.bean.conf.loader.annotation.handler.NotBlank;
import org.springmodules.validation.bean.conf.loader.annotation.handler.MaxLength;

/**
 * Model object for transporting TnMovtoConceptoPago data.
 */
public class TnMovtoConceptoPagoDTO  implements java.io.Serializable, Model {    

    private java.lang.Long idMovtoConceptoPago;
    @MaxLength(8)    
    private java.lang.String idTercero;
    @NotNull
    private java.util.Date fecModifico;
    @NotBlank(errorCode="not.null")
    @NotNull
    @MaxLength(120)    
    private java.lang.String usuario;
    @MaxLength(12)    
    private java.lang.String idConcepto;
    @MaxLength(4)    
    private java.lang.String idSitCaptura;
    @MaxLength(8)    
    private java.lang.String idTipoCpto;
    private java.util.Date mcpFecFinAdeudo;
    private java.util.Date mcpFecIncidencia;
    private java.util.Date mcpFecIniAdeudo;
    private java.lang.Integer mcpHorasDias;
    private java.lang.Double mcpMonto;
    private java.lang.Double mcpMontoAdeudo;
    private java.lang.Float mcpPorcentaje;
    private java.lang.Integer mcpQnasAdeudo;
    private java.lang.Integer mcpQnaAplicadas;
    private java.lang.Integer mcpQnaADescontar;
    private java.lang.Integer mcpQnaCancelo;
    private java.lang.Integer mcpQnaCaptura;
    private java.lang.Integer mcpQnaFin;
    private java.lang.Integer mcpQnaIni;
    @MaxLength(240)    
    private java.lang.String mcpRefCancela;
    @MaxLength(240)    
    private java.lang.String mcpRefCaptura;
    @MaxLength(52)    
    private java.lang.String mcpRfc;
    private java.lang.Integer mcpUltQnaProcesa;

    /**
     * Constructor for TnMovtoConceptoPagoDTO class.
     */
    public TnMovtoConceptoPagoDTO() { }    

                                                                                                        
    /**
     * Constructor for TnMovtoConceptoPagoDTO class.
     *
     * @param idMovtoConceptoPago java.lang.Long
     * @param idTercero java.lang.String
     * @param fecModifico java.util.Date
     * @param usuario java.lang.String
     * @param idConcepto java.lang.String
     * @param idSitCaptura java.lang.String
     * @param idTipoCpto java.lang.String
     * @param mcpFecFinAdeudo java.util.Date
     * @param mcpFecIncidencia java.util.Date
     * @param mcpFecIniAdeudo java.util.Date
     * @param mcpHorasDias java.lang.Integer
     * @param mcpMonto java.lang.Double
     * @param mcpMontoAdeudo java.lang.Double
     * @param mcpPorcentaje java.lang.Float
     * @param mcpQnasAdeudo java.lang.Integer
     * @param mcpQnaAplicadas java.lang.Integer
     * @param mcpQnaADescontar java.lang.Integer
     * @param mcpQnaCancelo java.lang.Integer
     * @param mcpQnaCaptura java.lang.Integer
     * @param mcpQnaFin java.lang.Integer
     * @param mcpQnaIni java.lang.Integer
     * @param mcpRefCancela java.lang.String
     * @param mcpRefCaptura java.lang.String
     * @param mcpRfc java.lang.String
     * @param mcpUltQnaProcesa java.lang.Integer
     */
    public TnMovtoConceptoPagoDTO( java.lang.Long idMovtoConceptoPago, java.lang.String idTercero, java.util.Date fecModifico, java.lang.String usuario, java.lang.String idConcepto, java.lang.String idSitCaptura, java.lang.String idTipoCpto, java.util.Date mcpFecFinAdeudo, java.util.Date mcpFecIncidencia, java.util.Date mcpFecIniAdeudo, java.lang.Integer mcpHorasDias, java.lang.Double mcpMonto, java.lang.Double mcpMontoAdeudo, java.lang.Float mcpPorcentaje, java.lang.Integer mcpQnasAdeudo, java.lang.Integer mcpQnaAplicadas, java.lang.Integer mcpQnaADescontar, java.lang.Integer mcpQnaCancelo, java.lang.Integer mcpQnaCaptura, java.lang.Integer mcpQnaFin, java.lang.Integer mcpQnaIni, java.lang.String mcpRefCancela, java.lang.String mcpRefCaptura, java.lang.String mcpRfc, java.lang.Integer mcpUltQnaProcesa){    
        this.idMovtoConceptoPago = idMovtoConceptoPago;
        this.idTercero = idTercero;
        this.fecModifico = fecModifico;
        this.usuario = usuario;
        this.idConcepto = idConcepto;
        this.idSitCaptura = idSitCaptura;
        this.idTipoCpto = idTipoCpto;
        this.mcpFecFinAdeudo = mcpFecFinAdeudo;
        this.mcpFecIncidencia = mcpFecIncidencia;
        this.mcpFecIniAdeudo = mcpFecIniAdeudo;
        this.mcpHorasDias = mcpHorasDias;
        this.mcpMonto = mcpMonto;
        this.mcpMontoAdeudo = mcpMontoAdeudo;
        this.mcpPorcentaje = mcpPorcentaje;
        this.mcpQnasAdeudo = mcpQnasAdeudo;
        this.mcpQnaAplicadas = mcpQnaAplicadas;
        this.mcpQnaADescontar = mcpQnaADescontar;
        this.mcpQnaCancelo = mcpQnaCancelo;
        this.mcpQnaCaptura = mcpQnaCaptura;
        this.mcpQnaFin = mcpQnaFin;
        this.mcpQnaIni = mcpQnaIni;
        this.mcpRefCancela = mcpRefCancela;
        this.mcpRefCaptura = mcpRefCaptura;
        this.mcpRfc = mcpRfc;
        this.mcpUltQnaProcesa = mcpUltQnaProcesa;
    }    

    
    /**
     * Set idMovtoConceptoPago value.
     *
     * @param idMovtoConceptoPago java.lang.Long
     */
    public void setIdMovtoConceptoPago(java.lang.Long idMovtoConceptoPago){
        this.idMovtoConceptoPago = idMovtoConceptoPago;
    }
    
    /**
     * Get idMovtoConceptoPago value.
     *
     * @return java.lang.Long
     */
    public java.lang.Long getIdMovtoConceptoPago() {
        return this.idMovtoConceptoPago;    
    }
    
    /**
     * Set idTercero value.
     *
     * @param idTercero java.lang.String
     */
    public void setIdTercero(java.lang.String idTercero){
        this.idTercero = idTercero;
    }
    
    /**
     * Get idTercero value.
     *
     * @return java.lang.String
     */
    public java.lang.String getIdTercero() {
        return this.idTercero;    
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
     * Set idConcepto value.
     *
     * @param idConcepto java.lang.String
     */
    public void setIdConcepto(java.lang.String idConcepto){
        this.idConcepto = idConcepto;
    }
    
    /**
     * Get idConcepto value.
     *
     * @return java.lang.String
     */
    public java.lang.String getIdConcepto() {
        return this.idConcepto;    
    }
    
    /**
     * Set idSitCaptura value.
     *
     * @param idSitCaptura java.lang.String
     */
    public void setIdSitCaptura(java.lang.String idSitCaptura){
        this.idSitCaptura = idSitCaptura;
    }
    
    /**
     * Get idSitCaptura value.
     *
     * @return java.lang.String
     */
    public java.lang.String getIdSitCaptura() {
        return this.idSitCaptura;    
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
     * Set mcpFecFinAdeudo value.
     *
     * @param mcpFecFinAdeudo java.util.Date
     */
    public void setMcpFecFinAdeudo(java.util.Date mcpFecFinAdeudo){
        this.mcpFecFinAdeudo = mcpFecFinAdeudo;
    }
    
    /**
     * Get mcpFecFinAdeudo value.
     *
     * @return java.util.Date
     */
    public java.util.Date getMcpFecFinAdeudo() {
        return this.mcpFecFinAdeudo;    
    }
    
    /**
     * Set mcpFecIncidencia value.
     *
     * @param mcpFecIncidencia java.util.Date
     */
    public void setMcpFecIncidencia(java.util.Date mcpFecIncidencia){
        this.mcpFecIncidencia = mcpFecIncidencia;
    }
    
    /**
     * Get mcpFecIncidencia value.
     *
     * @return java.util.Date
     */
    public java.util.Date getMcpFecIncidencia() {
        return this.mcpFecIncidencia;    
    }
    
    /**
     * Set mcpFecIniAdeudo value.
     *
     * @param mcpFecIniAdeudo java.util.Date
     */
    public void setMcpFecIniAdeudo(java.util.Date mcpFecIniAdeudo){
        this.mcpFecIniAdeudo = mcpFecIniAdeudo;
    }
    
    /**
     * Get mcpFecIniAdeudo value.
     *
     * @return java.util.Date
     */
    public java.util.Date getMcpFecIniAdeudo() {
        return this.mcpFecIniAdeudo;    
    }
    
    /**
     * Set mcpHorasDias value.
     *
     * @param mcpHorasDias java.lang.Integer
     */
    public void setMcpHorasDias(java.lang.Integer mcpHorasDias){
        this.mcpHorasDias = mcpHorasDias;
    }
    
    /**
     * Get mcpHorasDias value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getMcpHorasDias() {
        return this.mcpHorasDias;    
    }
    
    /**
     * Set mcpMonto value.
     *
     * @param mcpMonto java.lang.Double
     */
    public void setMcpMonto(java.lang.Double mcpMonto){
        this.mcpMonto = mcpMonto;
    }
    
    /**
     * Get mcpMonto value.
     *
     * @return java.lang.Double
     */
    public java.lang.Double getMcpMonto() {
        return this.mcpMonto;    
    }
    
    /**
     * Set mcpMontoAdeudo value.
     *
     * @param mcpMontoAdeudo java.lang.Double
     */
    public void setMcpMontoAdeudo(java.lang.Double mcpMontoAdeudo){
        this.mcpMontoAdeudo = mcpMontoAdeudo;
    }
    
    /**
     * Get mcpMontoAdeudo value.
     *
     * @return java.lang.Double
     */
    public java.lang.Double getMcpMontoAdeudo() {
        return this.mcpMontoAdeudo;    
    }
    
    /**
     * Set mcpPorcentaje value.
     *
     * @param mcpPorcentaje java.lang.Float
     */
    public void setMcpPorcentaje(java.lang.Float mcpPorcentaje){
        this.mcpPorcentaje = mcpPorcentaje;
    }
    
    /**
     * Get mcpPorcentaje value.
     *
     * @return java.lang.Float
     */
    public java.lang.Float getMcpPorcentaje() {
        return this.mcpPorcentaje;    
    }
    
    /**
     * Set mcpQnasAdeudo value.
     *
     * @param mcpQnasAdeudo java.lang.Integer
     */
    public void setMcpQnasAdeudo(java.lang.Integer mcpQnasAdeudo){
        this.mcpQnasAdeudo = mcpQnasAdeudo;
    }
    
    /**
     * Get mcpQnasAdeudo value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getMcpQnasAdeudo() {
        return this.mcpQnasAdeudo;    
    }
    
    /**
     * Set mcpQnaAplicadas value.
     *
     * @param mcpQnaAplicadas java.lang.Integer
     */
    public void setMcpQnaAplicadas(java.lang.Integer mcpQnaAplicadas){
        this.mcpQnaAplicadas = mcpQnaAplicadas;
    }
    
    /**
     * Get mcpQnaAplicadas value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getMcpQnaAplicadas() {
        return this.mcpQnaAplicadas;    
    }
    
    /**
     * Set mcpQnaADescontar value.
     *
     * @param mcpQnaADescontar java.lang.Integer
     */
    public void setMcpQnaADescontar(java.lang.Integer mcpQnaADescontar){
        this.mcpQnaADescontar = mcpQnaADescontar;
    }
    
    /**
     * Get mcpQnaADescontar value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getMcpQnaADescontar() {
        return this.mcpQnaADescontar;    
    }
    
    /**
     * Set mcpQnaCancelo value.
     *
     * @param mcpQnaCancelo java.lang.Integer
     */
    public void setMcpQnaCancelo(java.lang.Integer mcpQnaCancelo){
        this.mcpQnaCancelo = mcpQnaCancelo;
    }
    
    /**
     * Get mcpQnaCancelo value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getMcpQnaCancelo() {
        return this.mcpQnaCancelo;    
    }
    
    /**
     * Set mcpQnaCaptura value.
     *
     * @param mcpQnaCaptura java.lang.Integer
     */
    public void setMcpQnaCaptura(java.lang.Integer mcpQnaCaptura){
        this.mcpQnaCaptura = mcpQnaCaptura;
    }
    
    /**
     * Get mcpQnaCaptura value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getMcpQnaCaptura() {
        return this.mcpQnaCaptura;    
    }
    
    /**
     * Set mcpQnaFin value.
     *
     * @param mcpQnaFin java.lang.Integer
     */
    public void setMcpQnaFin(java.lang.Integer mcpQnaFin){
        this.mcpQnaFin = mcpQnaFin;
    }
    
    /**
     * Get mcpQnaFin value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getMcpQnaFin() {
        return this.mcpQnaFin;    
    }
    
    /**
     * Set mcpQnaIni value.
     *
     * @param mcpQnaIni java.lang.Integer
     */
    public void setMcpQnaIni(java.lang.Integer mcpQnaIni){
        this.mcpQnaIni = mcpQnaIni;
    }
    
    /**
     * Get mcpQnaIni value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getMcpQnaIni() {
        return this.mcpQnaIni;    
    }
    
    /**
     * Set mcpRefCancela value.
     *
     * @param mcpRefCancela java.lang.String
     */
    public void setMcpRefCancela(java.lang.String mcpRefCancela){
        this.mcpRefCancela = mcpRefCancela;
    }
    
    /**
     * Get mcpRefCancela value.
     *
     * @return java.lang.String
     */
    public java.lang.String getMcpRefCancela() {
        return this.mcpRefCancela;    
    }
    
    /**
     * Set mcpRefCaptura value.
     *
     * @param mcpRefCaptura java.lang.String
     */
    public void setMcpRefCaptura(java.lang.String mcpRefCaptura){
        this.mcpRefCaptura = mcpRefCaptura;
    }
    
    /**
     * Get mcpRefCaptura value.
     *
     * @return java.lang.String
     */
    public java.lang.String getMcpRefCaptura() {
        return this.mcpRefCaptura;    
    }
    
    /**
     * Set mcpRfc value.
     *
     * @param mcpRfc java.lang.String
     */
    public void setMcpRfc(java.lang.String mcpRfc){
        this.mcpRfc = mcpRfc;
    }
    
    /**
     * Get mcpRfc value.
     *
     * @return java.lang.String
     */
    public java.lang.String getMcpRfc() {
        return this.mcpRfc;    
    }
    
    /**
     * Set mcpUltQnaProcesa value.
     *
     * @param mcpUltQnaProcesa java.lang.Integer
     */
    public void setMcpUltQnaProcesa(java.lang.Integer mcpUltQnaProcesa){
        this.mcpUltQnaProcesa = mcpUltQnaProcesa;
    }
    
    /**
     * Get mcpUltQnaProcesa value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getMcpUltQnaProcesa() {
        return this.mcpUltQnaProcesa;    
    }


}