package gob.shcp.sireh.domain.jdbc;

import gob.shcp.fsn.data.Domain;

import gob.shcp.fsn.data.annotation.PrimaryKey;

import java.io.Serializable;

/**
 * Domain object for persistent TnMovtoConceptoPago data.
 */
public class TnMovtoConceptoPago implements Domain, Serializable {
    @PrimaryKey(sequenceName = "SN_MOVTO_CONCEPTO_PAGO")
    private java.lang.Long idMovtoConceptoPago;
    private java.lang.String idTercero;
    private java.util.Date fecModifico;
    private java.lang.String usuario;
    private java.lang.String idConcepto;
    private java.lang.String idSitCaptura;
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
    private java.lang.String mcpRefCancela;
    private java.lang.String mcpRefCaptura;
    private java.lang.String mcpRfc;
    private java.lang.Integer mcpUltQnaProcesa;

    /**
     * Constructor for TnMovtoConceptoPago class.
     */
    public TnMovtoConceptoPago() {
    }

    /**
     * Constructor for TnMovtoConceptoPago class.
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
    public TnMovtoConceptoPago(java.lang.Long idMovtoConceptoPago, 
                               java.lang.String idTercero, 
                               java.util.Date fecModifico, 
                               java.lang.String usuario, 
                               java.lang.String idConcepto, 
                               java.lang.String idSitCaptura, 
                               java.lang.String idTipoCpto, 
                               java.util.Date mcpFecFinAdeudo, 
                               java.util.Date mcpFecIncidencia, 
                               java.util.Date mcpFecIniAdeudo, 
                               java.lang.Integer mcpHorasDias, 
                               java.lang.Double mcpMonto, 
                               java.lang.Double mcpMontoAdeudo, 
                               java.lang.Float mcpPorcentaje, 
                               java.lang.Integer mcpQnasAdeudo, 
                               java.lang.Integer mcpQnaAplicadas, 
                               java.lang.Integer mcpQnaADescontar, 
                               java.lang.Integer mcpQnaCancelo, 
                               java.lang.Integer mcpQnaCaptura, 
                               java.lang.Integer mcpQnaFin, 
                               java.lang.Integer mcpQnaIni, 
                               java.lang.String mcpRefCancela, 
                               java.lang.String mcpRefCaptura, 
                               java.lang.String mcpRfc, 
                               java.lang.Integer mcpUltQnaProcesa) {
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
     * Get idMovtoConceptoPago value.
     *
     * @return java.lang.Long
     */
    public java.lang.Long getIdMovtoConceptoPago() {
        return this.idMovtoConceptoPago;
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
     * Get fecModifico value.
     *
     * @return java.util.Date
     */
    public java.util.Date getFecModifico() {
        return this.fecModifico;
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
     * Get idConcepto value.
     *
     * @return java.lang.String
     */
    public java.lang.String getIdConcepto() {
        return this.idConcepto;
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
     * Get idTipoCpto value.
     *
     * @return java.lang.String
     */
    public java.lang.String getIdTipoCpto() {
        return this.idTipoCpto;
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
     * Get mcpFecIncidencia value.
     *
     * @return java.util.Date
     */
    public java.util.Date getMcpFecIncidencia() {
        return this.mcpFecIncidencia;
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
     * Get mcpHorasDias value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getMcpHorasDias() {
        return this.mcpHorasDias;
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
     * Get mcpMontoAdeudo value.
     *
     * @return java.lang.Double
     */
    public java.lang.Double getMcpMontoAdeudo() {
        return this.mcpMontoAdeudo;
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
     * Get mcpQnasAdeudo value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getMcpQnasAdeudo() {
        return this.mcpQnasAdeudo;
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
     * Get mcpQnaADescontar value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getMcpQnaADescontar() {
        return this.mcpQnaADescontar;
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
     * Get mcpQnaCaptura value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getMcpQnaCaptura() {
        return this.mcpQnaCaptura;
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
     * Get mcpQnaIni value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getMcpQnaIni() {
        return this.mcpQnaIni;
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
     * Get mcpRefCaptura value.
     *
     * @return java.lang.String
     */
    public java.lang.String getMcpRefCaptura() {
        return this.mcpRefCaptura;
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
     * Get mcpUltQnaProcesa value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getMcpUltQnaProcesa() {
        return this.mcpUltQnaProcesa;
    }


    /**
     * Set idMovtoConceptoPago value.
     *
     * @param idMovtoConceptoPago java.lang.Long
     */
    public void setIdMovtoConceptoPago(java.lang.Long idMovtoConceptoPago) {
        this.idMovtoConceptoPago = idMovtoConceptoPago;
    }

    /**
     * Set idTercero value.
     *
     * @param idTercero java.lang.String
     */
    public void setIdTercero(java.lang.String idTercero) {
        this.idTercero = idTercero;
    }

    /**
     * Set fecModifico value.
     *
     * @param fecModifico java.util.Date
     */
    public void setFecModifico(java.util.Date fecModifico) {
        this.fecModifico = fecModifico;
    }

    /**
     * Set usuario value.
     *
     * @param usuario java.lang.String
     */
    public void setUsuario(java.lang.String usuario) {
        this.usuario = usuario;
    }

    /**
     * Set idConcepto value.
     *
     * @param idConcepto java.lang.String
     */
    public void setIdConcepto(java.lang.String idConcepto) {
        this.idConcepto = idConcepto;
    }

    /**
     * Set idSitCaptura value.
     *
     * @param idSitCaptura java.lang.String
     */
    public void setIdSitCaptura(java.lang.String idSitCaptura) {
        this.idSitCaptura = idSitCaptura;
    }

    /**
     * Set idTipoCpto value.
     *
     * @param idTipoCpto java.lang.String
     */
    public void setIdTipoCpto(java.lang.String idTipoCpto) {
        this.idTipoCpto = idTipoCpto;
    }

    /**
     * Set mcpFecFinAdeudo value.
     *
     * @param mcpFecFinAdeudo java.util.Date
     */
    public void setMcpFecFinAdeudo(java.util.Date mcpFecFinAdeudo) {
        this.mcpFecFinAdeudo = mcpFecFinAdeudo;
    }

    /**
     * Set mcpFecIncidencia value.
     *
     * @param mcpFecIncidencia java.util.Date
     */
    public void setMcpFecIncidencia(java.util.Date mcpFecIncidencia) {
        this.mcpFecIncidencia = mcpFecIncidencia;
    }

    /**
     * Set mcpFecIniAdeudo value.
     *
     * @param mcpFecIniAdeudo java.util.Date
     */
    public void setMcpFecIniAdeudo(java.util.Date mcpFecIniAdeudo) {
        this.mcpFecIniAdeudo = mcpFecIniAdeudo;
    }

    /**
     * Set mcpHorasDias value.
     *
     * @param mcpHorasDias java.lang.Integer
     */
    public void setMcpHorasDias(java.lang.Integer mcpHorasDias) {
        this.mcpHorasDias = mcpHorasDias;
    }

    /**
     * Set mcpMonto value.
     *
     * @param mcpMonto java.lang.Double
     */
    public void setMcpMonto(java.lang.Double mcpMonto) {
        this.mcpMonto = mcpMonto;
    }

    /**
     * Set mcpMontoAdeudo value.
     *
     * @param mcpMontoAdeudo java.lang.Double
     */
    public void setMcpMontoAdeudo(java.lang.Double mcpMontoAdeudo) {
        this.mcpMontoAdeudo = mcpMontoAdeudo;
    }

    /**
     * Set mcpPorcentaje value.
     *
     * @param mcpPorcentaje java.lang.Float
     */
    public void setMcpPorcentaje(java.lang.Float mcpPorcentaje) {
        this.mcpPorcentaje = mcpPorcentaje;
    }

    /**
     * Set mcpQnasAdeudo value.
     *
     * @param mcpQnasAdeudo java.lang.Integer
     */
    public void setMcpQnasAdeudo(java.lang.Integer mcpQnasAdeudo) {
        this.mcpQnasAdeudo = mcpQnasAdeudo;
    }

    /**
     * Set mcpQnaAplicadas value.
     *
     * @param mcpQnaAplicadas java.lang.Integer
     */
    public void setMcpQnaAplicadas(java.lang.Integer mcpQnaAplicadas) {
        this.mcpQnaAplicadas = mcpQnaAplicadas;
    }

    /**
     * Set mcpQnaADescontar value.
     *
     * @param mcpQnaADescontar java.lang.Integer
     */
    public void setMcpQnaADescontar(java.lang.Integer mcpQnaADescontar) {
        this.mcpQnaADescontar = mcpQnaADescontar;
    }

    /**
     * Set mcpQnaCancelo value.
     *
     * @param mcpQnaCancelo java.lang.Integer
     */
    public void setMcpQnaCancelo(java.lang.Integer mcpQnaCancelo) {
        this.mcpQnaCancelo = mcpQnaCancelo;
    }

    /**
     * Set mcpQnaCaptura value.
     *
     * @param mcpQnaCaptura java.lang.Integer
     */
    public void setMcpQnaCaptura(java.lang.Integer mcpQnaCaptura) {
        this.mcpQnaCaptura = mcpQnaCaptura;
    }

    /**
     * Set mcpQnaFin value.
     *
     * @param mcpQnaFin java.lang.Integer
     */
    public void setMcpQnaFin(java.lang.Integer mcpQnaFin) {
        this.mcpQnaFin = mcpQnaFin;
    }

    /**
     * Set mcpQnaIni value.
     *
     * @param mcpQnaIni java.lang.Integer
     */
    public void setMcpQnaIni(java.lang.Integer mcpQnaIni) {
        this.mcpQnaIni = mcpQnaIni;
    }

    /**
     * Set mcpRefCancela value.
     *
     * @param mcpRefCancela java.lang.String
     */
    public void setMcpRefCancela(java.lang.String mcpRefCancela) {
        this.mcpRefCancela = mcpRefCancela;
    }

    /**
     * Set mcpRefCaptura value.
     *
     * @param mcpRefCaptura java.lang.String
     */
    public void setMcpRefCaptura(java.lang.String mcpRefCaptura) {
        this.mcpRefCaptura = mcpRefCaptura;
    }

    /**
     * Set mcpRfc value.
     *
     * @param mcpRfc java.lang.String
     */
    public void setMcpRfc(java.lang.String mcpRfc) {
        this.mcpRfc = mcpRfc;
    }

    /**
     * Set mcpUltQnaProcesa value.
     *
     * @param mcpUltQnaProcesa java.lang.Integer
     */
    public void setMcpUltQnaProcesa(java.lang.Integer mcpUltQnaProcesa) {
        this.mcpUltQnaProcesa = mcpUltQnaProcesa;
    }

    /**
     * Set identity value.
     *
     * @param idMovtoConceptoPago Serializable
     */
    public void setIdentity(Serializable idMovtoConceptoPago) {
        this.idMovtoConceptoPago = (java.lang.Long)idMovtoConceptoPago;
    }

    /**
     * Get identity value.
     *
     * @return Serializable
     */
    public Serializable getIdentity() {
        return this.idMovtoConceptoPago;
    }

    public boolean isEquivalente(TnMovtoConceptoPago tnMovtoConceptoPago) {

        if (!((this.getMcpRefCaptura() == null && 
               tnMovtoConceptoPago.getMcpRefCaptura() == null) || 
              (this.getMcpRefCaptura() != null && 
               tnMovtoConceptoPago.getMcpRefCaptura() != null && 
               this.getMcpRefCaptura().equals(tnMovtoConceptoPago.getMcpRefCaptura())) || 
              (this.getMcpRefCaptura() != null && 
               this.getMcpRefCaptura().equals("") && 
               tnMovtoConceptoPago.getMcpRefCaptura() == null) || 
              (this.getMcpRefCaptura() == null && 
               tnMovtoConceptoPago.getMcpRefCaptura() != null && 
               tnMovtoConceptoPago.getMcpRefCaptura().equals("")))) {
            return false;
        }

        if (!((this.getMcpQnaAplicadas() == null && 
               tnMovtoConceptoPago.getMcpQnaAplicadas() == null) || 
              (this.getMcpQnaAplicadas() != null && 
               tnMovtoConceptoPago.getMcpQnaAplicadas() != null && 
               this.getMcpQnaAplicadas().equals(tnMovtoConceptoPago.getMcpQnaAplicadas())) || 
              (this.getMcpQnaAplicadas() != null && 
               this.getMcpQnaAplicadas().equals(0) && 
               tnMovtoConceptoPago.getMcpQnaAplicadas() == null) || 
              (this.getMcpQnaAplicadas() == null && 
               tnMovtoConceptoPago.getMcpQnaAplicadas() != null && 
               tnMovtoConceptoPago.getMcpQnaAplicadas().equals(0)))) {
            return false;
        }

        if (!((this.getMcpMontoAdeudo() == null && 
               tnMovtoConceptoPago.getMcpMontoAdeudo() == null) || 
              (this.getMcpMontoAdeudo() != null && 
               tnMovtoConceptoPago.getMcpMontoAdeudo() != null && 
               this.getMcpMontoAdeudo().equals(tnMovtoConceptoPago.getMcpMontoAdeudo())) || 
              (this.getMcpMontoAdeudo() != null && 
               this.getMcpMontoAdeudo().equals(0) && 
               tnMovtoConceptoPago.getMcpMontoAdeudo() == null) || 
              (this.getMcpMontoAdeudo() == null && 
               tnMovtoConceptoPago.getMcpMontoAdeudo() != null && 
               tnMovtoConceptoPago.getMcpMontoAdeudo().equals(0)))) {
            return false;
        }

        if (!((this.getMcpQnasAdeudo() == null && 
               tnMovtoConceptoPago.getMcpQnasAdeudo() == null) || 
              (this.getMcpQnasAdeudo() != null && 
               tnMovtoConceptoPago.getMcpQnasAdeudo() != null && 
               this.getMcpQnasAdeudo().equals(tnMovtoConceptoPago.getMcpQnasAdeudo())) || 
              (this.getMcpQnasAdeudo() != null && 
               this.getMcpQnasAdeudo().equals(0) && 
               tnMovtoConceptoPago.getMcpQnasAdeudo() == null) || 
              (this.getMcpQnasAdeudo() == null && 
               tnMovtoConceptoPago.getMcpQnasAdeudo() != null && 
               tnMovtoConceptoPago.getMcpQnasAdeudo().equals(0)))) {
            return false;
        }

        if (!((this.getMcpFecFinAdeudo() == null && 
               tnMovtoConceptoPago.getMcpFecFinAdeudo() == null) || 
              (this.getMcpFecFinAdeudo() != null && 
               tnMovtoConceptoPago.getMcpFecFinAdeudo() != null && 
               this.getMcpFecFinAdeudo().equals(tnMovtoConceptoPago.getMcpFecFinAdeudo())))) {
            return false;
        }

        if (!((this.getMcpFecIniAdeudo() == null && 
               tnMovtoConceptoPago.getMcpFecIniAdeudo() == null) || 
              (this.getMcpFecIniAdeudo() != null && 
               tnMovtoConceptoPago.getMcpFecIniAdeudo() != null && 
               this.getMcpFecIniAdeudo().equals(tnMovtoConceptoPago.getMcpFecIniAdeudo())))) {
            return false;
        }

        return true;
    }
}
