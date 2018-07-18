package gob.shcp.sireh.domain.jdbc;

import gob.shcp.fsn.data.Domain;

import java.io.Serializable;

import java.math.BigDecimal;

import java.util.Date;

public class ConceptoPago implements Domain, Serializable {
    private java.lang.String rfc;
    private java.lang.Integer idMovtoConceptoPago;
    private java.lang.String idTipoCpto;
    private java.lang.String idConcepto;
    private java.lang.Double monto;
    private java.lang.Float porcentaje;
    private java.util.Date fecIncidencia;
    private java.math.BigDecimal qnaFin;
    private java.math.BigDecimal qnaIni;
    private java.math.BigDecimal qnaAplicadas;
    private java.math.BigDecimal qnaADescontar;
    private java.lang.Double montoAdeudo;
    private java.math.BigDecimal qnasAdeudo;

    private String descConPag;

    public void setIdentity(Serializable id) {
    }

    public Serializable getIdentity() {
        return null;
    }

    public void setIdMovtoConceptoPago(Integer idMovtoConceptoPago) {
        this.idMovtoConceptoPago = idMovtoConceptoPago;
    }

    public Integer getIdMovtoConceptoPago() {
        return idMovtoConceptoPago;
    }

    public void setIdTipoCpto(String idTipoCpto) {
        this.idTipoCpto = idTipoCpto;
    }

    public String getIdTipoCpto() {
        return idTipoCpto;
    }

    public void setIdConcepto(String idConcepto) {
        this.idConcepto = idConcepto;
    }

    public String getIdConcepto() {
        return idConcepto;
    }

    public void setMonto(Double monto) {
        this.monto = monto;
    }

    public Double getMonto() {
        return monto;
    }

    public void setPorcentaje(Float porcentaje) {
        this.porcentaje = porcentaje;
    }

    public Float getPorcentaje() {
        return porcentaje;
    }

    public void setFecIncidencia(Date fecIncidencia) {
        this.fecIncidencia = fecIncidencia;
    }

    public Date getFecIncidencia() {
        return fecIncidencia;
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

    public void setMontoAdeudo(Double montoAdeudo) {
        this.montoAdeudo = montoAdeudo;
    }

    public Double getMontoAdeudo() {
        return montoAdeudo;
    }

    public void setQnasAdeudo(BigDecimal qnasAdeudo) {
        this.qnasAdeudo = qnasAdeudo;
    }

    public BigDecimal getQnasAdeudo() {
        return qnasAdeudo;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    public String getRfc() {
        return rfc;
    }

    public void setDescConPag(String descConPag) {
        this.descConPag = descConPag;
    }

    public String getDescConPag() {
        return descConPag;
    }
}
