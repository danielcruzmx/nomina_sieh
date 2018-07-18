package gob.shcp.sireh.domain.jdbc;

import gob.shcp.fsn.data.Domain;

import java.io.Serializable;

import java.math.BigDecimal;

import java.util.Date;

public class MovtoConceptoPago implements Domain, Serializable {
    private java.lang.Long idMovtoConceptoPago;
    private java.util.Date fecFinAdeudo;
    private java.util.Date fecIncidencia;
    private java.util.Date fecIniAdeudo;
    private java.util.Date fecModifico;
    private java.math.BigDecimal horasDias;
    private java.lang.String idConcepto;
    private java.lang.String idSitCaptura;
    private java.lang.String idTercero;
    private java.lang.String idTipoCpto;
    private java.math.BigDecimal mcpQnaCaptura;
    private java.lang.String mcpRefCancela;
    private java.lang.String mcpRefCaptura;
    private java.lang.String mcpRfc;
    private java.lang.Double monto;
    private java.lang.Double montoAdeudo;
    private java.lang.Float porcentaje;
    private java.math.BigDecimal qnasAdeudo;
    private java.math.BigDecimal qnaAplicadas;
    private java.math.BigDecimal qnaADescontar;
    private java.math.BigDecimal qnaCancelo;
    private java.math.BigDecimal qnaFin;
    private java.math.BigDecimal qnaIni;
    private java.math.BigDecimal ultimaQnaProcesa;
    private java.lang.String usuario;

    private java.lang.String descSitCaptura;
    private java.lang.String descConPag;

    private String tipoCaptura;
    private String tipoCalculo;
    private String permanente;
    private String subtipo;
    private String mensaje;

    public MovtoConceptoPago() {
    }

    public MovtoConceptoPago(java.lang.String tipoCaptura, 
                             java.lang.String tipoCalculo, 
                             java.lang.String permanente, 
                             java.lang.String mensaje, 
                             java.lang.String subtipo, 
                             java.lang.String descSitCaptura, 
                             java.lang.String descConPag, 
                             java.lang.Long idMovtoConceptoPago, 
                             java.util.Date fecFinAdeudo, 
                             java.util.Date fecIncidencia, 
                             java.util.Date fecIniAdeudo, 
                             java.util.Date fecModifico, 
                             java.math.BigDecimal horasDias, 
                             java.lang.String idConcepto, 
                             java.lang.String idSitCaptura, 
                             java.lang.String idTercero, 
                             java.lang.String idTipoCpto, 
                             java.math.BigDecimal mcpQnaCaptura, 
                             java.lang.String mcpRefCancela, 
                             java.lang.String mcpRefCaptura, 
                             java.lang.String mcpRfc, java.lang.Double monto, 
                             java.lang.Double montoAdeudo, 
                             java.lang.Float porcentaje, 
                             java.math.BigDecimal qnasAdeudo, 
                             java.math.BigDecimal qnaAplicadas, 
                             java.math.BigDecimal qnaADescontar, 
                             java.math.BigDecimal qnaCancelo, 
                             java.math.BigDecimal qnaFin, 
                             java.math.BigDecimal qnaIni, 
                             java.math.BigDecimal ultimaQnaProcesa, 
                             java.lang.String usuario) {
        this.idMovtoConceptoPago = idMovtoConceptoPago;
        this.fecFinAdeudo = fecFinAdeudo;
        this.fecIncidencia = fecIncidencia;
        this.fecIniAdeudo = fecIniAdeudo;
        this.fecModifico = fecModifico;
        this.horasDias = horasDias;
        this.idConcepto = idConcepto;
        this.idSitCaptura = idSitCaptura;
        this.idTercero = idTercero;
        this.idTipoCpto = idTipoCpto;
        this.mcpQnaCaptura = mcpQnaCaptura;
        this.mcpRefCancela = mcpRefCancela;
        this.mcpRefCaptura = mcpRefCaptura;
        this.mcpRfc = mcpRfc;
        this.monto = monto;
        this.montoAdeudo = montoAdeudo;
        this.porcentaje = porcentaje;
        this.qnasAdeudo = qnasAdeudo;
        this.qnaAplicadas = qnaAplicadas;
        this.qnaADescontar = qnaADescontar;
        this.qnaCancelo = qnaCancelo;
        this.qnaFin = qnaFin;
        this.qnaIni = qnaIni;
        this.ultimaQnaProcesa = ultimaQnaProcesa;
        this.usuario = usuario;
        this.descSitCaptura = descSitCaptura;
        this.descConPag = descConPag;
        this.tipoCaptura = tipoCaptura;
        this.tipoCalculo = tipoCalculo;
        this.permanente = permanente;
        this.mensaje = mensaje;
        this.permanente = permanente;
        this.subtipo = subtipo;
    }

    public void setIdentity(Serializable id) {
    }

    public Serializable getIdentity() {
        return null;
    }

    public void setIdMovtoConceptoPago(Long idMovtoConceptoPago) {
        this.idMovtoConceptoPago = idMovtoConceptoPago;
    }

    public Long getIdMovtoConceptoPago() {
        return idMovtoConceptoPago;
    }

    public void setFecFinAdeudo(Date fecFinAdeudo) {
        this.fecFinAdeudo = fecFinAdeudo;
    }

    public Date getFecFinAdeudo() {
        return fecFinAdeudo;
    }

    public void setFecIncidencia(Date fecIncidencia) {
        this.fecIncidencia = fecIncidencia;
    }

    public Date getFecIncidencia() {
        return fecIncidencia;
    }

    public void setFecIniAdeudo(Date fecIniAdeudo) {
        this.fecIniAdeudo = fecIniAdeudo;
    }

    public Date getFecIniAdeudo() {
        return fecIniAdeudo;
    }

    public void setFecModifico(Date fecModifico) {
        this.fecModifico = fecModifico;
    }

    public Date getFecModifico() {
        return fecModifico;
    }

    public void setHorasDias(BigDecimal horasDias) {
        this.horasDias = horasDias;
    }

    public BigDecimal getHorasDias() {
        return horasDias;
    }

    public void setIdConcepto(String idConcepto) {
        this.idConcepto = idConcepto;
    }

    public String getIdConcepto() {
        return idConcepto;
    }

    public void setIdSitCaptura(String idSitCaptura) {
        this.idSitCaptura = idSitCaptura;
    }

    public String getIdSitCaptura() {
        return idSitCaptura;
    }

    public void setIdTercero(String idTercero) {
        this.idTercero = idTercero;
    }

    public String getIdTercero() {
        return idTercero;
    }

    public void setIdTipoCpto(String idTipoCpto) {
        this.idTipoCpto = idTipoCpto;
    }

    public String getIdTipoCpto() {
        return idTipoCpto;
    }

    public void setMcpQnaCaptura(BigDecimal mcpQnaCaptura) {
        this.mcpQnaCaptura = mcpQnaCaptura;
    }

    public BigDecimal getMcpQnaCaptura() {
        return mcpQnaCaptura;
    }

    public void setMcpRefCancela(String mcpRefCancela) {
        this.mcpRefCancela = mcpRefCancela;
    }

    public String getMcpRefCancela() {
        return mcpRefCancela;
    }

    public void setMcpRefCaptura(String mcpRefCaptura) {
        this.mcpRefCaptura = mcpRefCaptura;
    }

    public String getMcpRefCaptura() {
        return mcpRefCaptura;
    }

    public void setMcpRfc(String mcpRfc) {
        this.mcpRfc = mcpRfc;
    }

    public String getMcpRfc() {
        return mcpRfc;
    }

    public void setMonto(Double monto) {
        this.monto = monto;
    }

    public Double getMonto() {
        return monto;
    }

    public void setMontoAdeudo(Double montoAdeudo) {
        this.montoAdeudo = montoAdeudo;
    }

    public Double getMontoAdeudo() {
        return montoAdeudo;
    }

    public void setPorcentaje(Float porcentaje) {
        this.porcentaje = porcentaje;
    }

    public Float getPorcentaje() {
        return porcentaje;
    }

    public void setQnasAdeudo(BigDecimal qnasAdeudo) {
        this.qnasAdeudo = qnasAdeudo;
    }

    public BigDecimal getQnasAdeudo() {
        return qnasAdeudo;
    }

    public void setQnaAplicadas(BigDecimal qnaAplicadas) {
        this.qnaAplicadas = qnaAplicadas;
    }

    public BigDecimal getQnaAplicadas() {
        return qnaAplicadas;
    }

    public void setQnaADescontar(BigDecimal qnaADescontar) {
        this.qnaADescontar = qnaADescontar;
    }

    public BigDecimal getQnaADescontar() {
        return qnaADescontar;
    }

    public void setQnaCancelo(BigDecimal qnaCancelo) {
        this.qnaCancelo = qnaCancelo;
    }

    public BigDecimal getQnaCancelo() {
        return qnaCancelo;
    }

    public void setQnaFin(BigDecimal qnaFin) {
        this.qnaFin = qnaFin;
    }

    public BigDecimal getQnaFin() {
        return qnaFin;
    }

    public void setQnaIni(BigDecimal qnaIni) {
        this.qnaIni = qnaIni;
    }

    public BigDecimal getQnaIni() {
        return qnaIni;
    }

    public void setUltimaQnaProcesa(BigDecimal ultimaQnaProcesa) {
        this.ultimaQnaProcesa = ultimaQnaProcesa;
    }

    public BigDecimal getUltimaQnaProcesa() {
        return ultimaQnaProcesa;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setDescSitCaptura(String descSitCaptura) {
        this.descSitCaptura = descSitCaptura;
    }

    public String getDescSitCaptura() {
        return descSitCaptura;
    }

    public void setDescConPag(String descConPag) {
        this.descConPag = descConPag;
    }

    public String getDescConPag() {
        return descConPag;
    }

    public void setTipoCaptura(String tipoCaptura) {
        this.tipoCaptura = tipoCaptura;
    }

    public String getTipoCaptura() {
        return tipoCaptura;
    }

    public void setTipoCalculo(String tipoCalculo) {
        this.tipoCalculo = tipoCalculo;
    }

    public String getTipoCalculo() {
        return tipoCalculo;
    }

    public void setPermanente(String permanente) {
        this.permanente = permanente;
    }

    public String getPermanente() {
        return permanente;
    }

    public void setSubtipo(String subtipo) {
        this.subtipo = subtipo;
    }

    public String getSubtipo() {
        return subtipo;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getMensaje() {
        return mensaje;
    }
}
