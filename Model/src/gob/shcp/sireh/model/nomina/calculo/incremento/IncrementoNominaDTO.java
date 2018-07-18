package gob.shcp.sireh.model.nomina.calculo.incremento;

import gob.shcp.fsn.model.Model;

import java.math.BigDecimal;

import java.util.Calendar;
import java.util.Date;

import org.apache.commons.lang.time.DateUtils;

import org.springmodules.validation.bean.conf.loader.annotation.handler.ValidationMethod;

public class IncrementoNominaDTO implements java.io.Serializable, Model{
    
    private java.util.Date fecIni;
    private java.util.Date fecFin;
    private Integer qnaProceso;
    private Integer qnaIni;
    private Integer qnaFin;
    private java.util.Date tabAnt;
    private java.util.Date tabNvo;
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
    
    
    private String subtitle;
    
    
    private Integer filterQnaInferior;
    private Integer filterQnaSuperior;
    
    
    
    public IncrementoNominaDTO() {
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
    
    
    @ValidationMethod(forProperty = "fecIni", errorCode = "not.null")
    public boolean validateFecIni() {
        return this.getFecIni() != null;
    }

    @ValidationMethod(forProperty = "fecFin", errorCode = "not.null")
    public boolean validateFecFin() {
        return this.getFecFin() != null && this.getFecIni() != null && DateUtils.truncate(this.getFecFin(), Calendar.DATE).after(DateUtils.truncate(this.getFecIni(), Calendar.DATE));
    }
    
    @ValidationMethod(forProperty = "tabAnt", errorCode = "not.null")
    public boolean validateTabAnt() {
        return this.getTabAnt() != null;
    }
    
    @ValidationMethod(forProperty = "tabNvo", errorCode = "not.null")
    public boolean validateTabNvo() {
        return this.getTabNvo() != null;
    }
    
    @ValidationMethod(forProperty = "qnaProceso", errorCode = "not.null")
    public boolean validateQnaProceso() {
        return this.getQnaProceso() != null;
    }
    
    @ValidationMethod(forProperty = "qnaIni", errorCode = "not.null")
    public boolean validateQnaIni() {
        return this.getQnaIni() != null;
    }
    
    @ValidationMethod(forProperty = "qnaFin", errorCode = "not.null")
    public boolean validateQnaFin() {
        return this.getQnaFin() != null;
    }
    
    @ValidationMethod(forProperty = "compensacionAnt", errorCode = "not.null")
    public boolean validateCompensacionAnt() {
        return this.getCompensacionAnt() != null && this.getCompensacionAnt().doubleValue()  > 0;
    }
    
    @ValidationMethod(forProperty = "despensaAnt", errorCode = "not.null")
    public boolean validateDespensaAnt() {
        return this.getDespensaAnt() != null && this.getDespensaAnt().doubleValue() > 0;
    }
    
    @ValidationMethod(forProperty = "previsionAnt", errorCode = "not.null")
    public boolean validatePrevisionAnt() {
        return this.getPrevisionAnt() != null && this.getPrevisionAnt().doubleValue() > 0;
    }
    
    @ValidationMethod(forProperty = "serviciosAnt", errorCode = "not.null")
    public boolean validateServiciosAnt() {
        return this.getServiciosAnt() != null && this.getServiciosAnt().doubleValue() > 0;
    }
    
    @ValidationMethod(forProperty = "transporteAnt", errorCode = "not.null")
    public boolean validateTransporteAnt() {
        return this.getTransporteAnt() != null && this.getTransporteAnt().doubleValue() > 0;
    }
    
    @ValidationMethod(forProperty = "compensacionNva", errorCode = "not.null")
    public boolean validateCompensacionNva() {
        return this.getCompensacionNva() != null && this.getCompensacionNva().doubleValue() > 0;
    }
    
    @ValidationMethod(forProperty = "despensaNva", errorCode = "not.null")
    public boolean validateDespensaNva() {
        return this.getDespensaNva() != null && this.getDespensaNva().doubleValue() > 0;
    }
    
    @ValidationMethod(forProperty = "previsionNva", errorCode = "not.null")
    public boolean validatePrevisionNva() {
        return this.getPrevisionNva() != null && this.getPrevisionNva().doubleValue() > 0;
    }
    
    @ValidationMethod(forProperty = "serviciosNva", errorCode = "not.null")
    public boolean validateServiciosNva() {
        return this.getServiciosNva() != null && this.getServiciosNva().doubleValue() > 0;
    }
    
    @ValidationMethod(forProperty = "transporteNva", errorCode = "not.null")
    public boolean validateTransporteNva() {
        return this.getTransporteNva() != null;
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
}
