package gob.shcp.sireh.model.nomina.calculo.incremento;

import gob.shcp.fsn.model.Model;

import java.io.Serializable;

import java.math.BigDecimal;

import java.util.Calendar;
import java.util.Date;

import org.apache.commons.lang.time.DateUtils;

public class IncrementoNominaMandosDTO implements Serializable, Model {

    private Date fecIni;
    private Date fecFin;
    private Integer qnaProceso;
    private Integer qnaIni;
    private Integer qnaFin;
    private Date tabAnt;
    private Date tabNvo;
    private BigDecimal compensacionAnt;
    private BigDecimal despensaAnt;
    private BigDecimal previsionAnt;
    private BigDecimal serviciosAnt;
    private BigDecimal transporteAnt;
    private BigDecimal compensacionNva;
    private BigDecimal despensaNva;
    private BigDecimal previsionNva;
    private BigDecimal serviciosNva;
    private BigDecimal transporteNva;

    private BigDecimal compensacionAnt1;
    private BigDecimal despensaAnt1;
    private BigDecimal previsionAnt1;
    private BigDecimal serviciosAnt1;
    private BigDecimal transporteAnt1;
    private BigDecimal compensacionNva1;
    private BigDecimal despensaNva1;
    private BigDecimal previsionNva1;
    private BigDecimal serviciosNva1;
    private BigDecimal transporteNva1;


    private String subtitle;


    private Integer filterQnaInferior;
    private Integer filterQnaSuperior;


    public IncrementoNominaMandosDTO() {
    }

    public void setQnaProceso(Integer qnaProceso) {
        this.qnaProceso = qnaProceso;
    }

    public Integer getQnaProceso() {
        return qnaProceso;
    }

    public void setQnaIni(Integer qnaIni) {
        this.qnaIni = qnaIni;
    }

    public Integer getQnaIni() {
        return qnaIni;
    }

    public void setQnaFin(Integer qnaFin) {
        this.qnaFin = qnaFin;
    }

    public Integer getQnaFin() {
        return qnaFin;
    }


    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public void setFecIni(Date fecIni) {
        this.fecIni = fecIni;
    }

    public Date getFecIni() {
        return fecIni;
    }

    public void setFecFin(Date fecFin) {
        this.fecFin = fecFin;
    }

    public Date getFecFin() {
        return fecFin;
    }

    public void setFilterQnaInferior(Integer filterQnaInferior) {
        this.filterQnaInferior = filterQnaInferior;
    }

    public Integer getFilterQnaInferior() {
        return filterQnaInferior;
    }

    public void setFilterQnaSuperior(Integer filterQnaSuperior) {
        this.filterQnaSuperior = filterQnaSuperior;
    }

    public Integer getFilterQnaSuperior() {
        return filterQnaSuperior;
    }

    public void setTabAnt(Date tabAnt) {
        this.tabAnt = tabAnt;
    }

    public Date getTabAnt() {
        return tabAnt;
    }

    public void setTabNvo(Date tabNvo) {
        this.tabNvo = tabNvo;
    }

    public Date getTabNvo() {
        return tabNvo;
    }

    public void setCompensacionAnt(BigDecimal compensacionAnt) {
        this.compensacionAnt = compensacionAnt;
    }

    public BigDecimal getCompensacionAnt() {
        return compensacionAnt;
    }

    public void setDespensaAnt(BigDecimal despensaAnt) {
        this.despensaAnt = despensaAnt;
    }

    public BigDecimal getDespensaAnt() {
        return despensaAnt;
    }

    public void setPrevisionAnt(BigDecimal previsionAnt) {
        this.previsionAnt = previsionAnt;
    }

    public BigDecimal getPrevisionAnt() {
        return previsionAnt;
    }

    public void setServiciosAnt(BigDecimal serviciosAnt) {
        this.serviciosAnt = serviciosAnt;
    }

    public BigDecimal getServiciosAnt() {
        return serviciosAnt;
    }

    public void setTransporteAnt(BigDecimal transporteAnt) {
        this.transporteAnt = transporteAnt;
    }

    public BigDecimal getTransporteAnt() {
        return transporteAnt;
    }

    public void setCompensacionNva(BigDecimal compensacionNva) {
        this.compensacionNva = compensacionNva;
    }

    public BigDecimal getCompensacionNva() {
        return compensacionNva;
    }

    public void setDespensaNva(BigDecimal despensaNva) {
        this.despensaNva = despensaNva;
    }

    public BigDecimal getDespensaNva() {
        return despensaNva;
    }

    public void setPrevisionNva(BigDecimal previsionNva) {
        this.previsionNva = previsionNva;
    }

    public BigDecimal getPrevisionNva() {
        return previsionNva;
    }

    public void setServiciosNva(BigDecimal serviciosNva) {
        this.serviciosNva = serviciosNva;
    }

    public BigDecimal getServiciosNva() {
        return serviciosNva;
    }

    public void setTransporteNva(BigDecimal transporteNva) {
        this.transporteNva = transporteNva;
    }

    public BigDecimal getTransporteNva() {
        return transporteNva;
    }

    public void setCompensacionAnt1(BigDecimal compensacionAnt1) {
        this.compensacionAnt1 = compensacionAnt1;
    }

    public BigDecimal getCompensacionAnt1() {
        return compensacionAnt1;
    }

    public void setDespensaAnt1(BigDecimal despensaAnt1) {
        this.despensaAnt1 = despensaAnt1;
    }

    public BigDecimal getDespensaAnt1() {
        return despensaAnt1;
    }

    public void setPrevisionAnt1(BigDecimal previsionAnt1) {
        this.previsionAnt1 = previsionAnt1;
    }

    public BigDecimal getPrevisionAnt1() {
        return previsionAnt1;
    }

    public void setServiciosAnt1(BigDecimal serviciosAnt1) {
        this.serviciosAnt1 = serviciosAnt1;
    }

    public BigDecimal getServiciosAnt1() {
        return serviciosAnt1;
    }

    public void setTransporteAnt1(BigDecimal transporteAnt1) {
        this.transporteAnt1 = transporteAnt1;
    }

    public BigDecimal getTransporteAnt1() {
        return transporteAnt1;
    }

    public void setCompensacionNva1(BigDecimal compensacionNva1) {
        this.compensacionNva1 = compensacionNva1;
    }

    public BigDecimal getCompensacionNva1() {
        return compensacionNva1;
    }

    public void setDespensaNva1(BigDecimal despensaNva1) {
        this.despensaNva1 = despensaNva1;
    }

    public BigDecimal getDespensaNva1() {
        return despensaNva1;
    }

    public void setPrevisionNva1(BigDecimal previsionNva1) {
        this.previsionNva1 = previsionNva1;
    }

    public BigDecimal getPrevisionNva1() {
        return previsionNva1;
    }

    public void setServiciosNva1(BigDecimal serviciosNva1) {
        this.serviciosNva1 = serviciosNva1;
    }

    public BigDecimal getServiciosNva1() {
        return serviciosNva1;
    }

    public void setTransporteNva1(BigDecimal transporteNva1) {
        this.transporteNva1 = transporteNva1;
    }

    public BigDecimal getTransporteNva1() {
        return transporteNva1;
    }
}
