package gob.shcp.sireh.model.nomina.calculo.vales;

import gob.shcp.fsn.model.Model;
import gob.shcp.sireh.model.ItemKeyDTO;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import java.util.List;

import org.apache.commons.lang.time.DateUtils;

import org.springmodules.validation.bean.conf.loader.annotation.handler.ValidationMethod;

public class ValesNominaDTO implements java.io.Serializable, Model{
    private java.util.Date fecIni;
    private java.util.Date fecFin;
    private java.lang.String diaHacendario;
    private java.lang.String strFecIni;
    private java.lang.String strFecFin;
    private java.lang.String uniciclo;
    private java.math.BigDecimal monto;
    private java.lang.Integer qnaProceso;

    private java.lang.Integer filterQnaInferior;
    private java.lang.Integer filterQnaSuperior;
    private java.lang.Integer idNomina;
    private java.lang.Integer anio;
    private java.lang.Integer tipoNomina;
    private java.util.List<ItemKeyDTO> listaTiposNomina = new ArrayList<ItemKeyDTO>();

    @ValidationMethod(forProperty = "monto", errorCode = "not.null")
    public boolean validateMonto() {
        return this.getMonto() != null && this.getMonto().doubleValue() > 0;
    }
    
    @ValidationMethod(forProperty = "tipoNomina", errorCode = "not.null")
    public boolean validateTipoNomina() {
        return this.getTipoNomina() != null;
    }
    
    @ValidationMethod(forProperty = "fecIni", errorCode = "not.null")
    public boolean validateFecIni() {
        return this.getFecIni() != null;
    }

    @ValidationMethod(forProperty = "fecFin", errorCode = "not.null")
    public boolean validateFecFin() {
        if(this.getTipoNomina() != null && this.getTipoNomina() == 2){
            return true;
        }
        return this.getFecFin() != null && this.getFecIni() != null && DateUtils.truncate(this.getFecFin(), Calendar.DATE).after(DateUtils.truncate(this.getFecIni(), Calendar.DATE));
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

    public void setMonto(java.math.BigDecimal monto) {
        this.monto = monto;
    }

    public java.math.BigDecimal getMonto() {
        return monto;
    }

    public void setQnaProceso(Integer qnaProceso) {
        this.qnaProceso = qnaProceso;
    }

    public Integer getQnaProceso() {
        return qnaProceso;
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


    public void setIdNomina(Integer idNomina) {
        this.idNomina = idNomina;
    }

    public Integer getIdNomina() {
        return idNomina;
    }

    public void setAnio(Integer anio) {
        this.anio = anio;
    }

    public Integer getAnio() {
        return anio;
    }

    public void setTipoNomina(Integer tipoNomina) {
        this.tipoNomina = tipoNomina;
    }

    public Integer getTipoNomina() {
        return tipoNomina;
    }


    public void setListaTiposNomina(List<ItemKeyDTO> listaTiposNomina) {
        this.listaTiposNomina = listaTiposNomina;
    }

    public List<ItemKeyDTO> getListaTiposNomina() {
        return listaTiposNomina;
    }



    public void setUniciclo(String uniciclo) {
        this.uniciclo = uniciclo;
    }

    public String getUniciclo() {
        return uniciclo;
    }

    public void setDiaHacendario(String diaHacendario) {
        this.diaHacendario = diaHacendario;
    }

    public String getDiaHacendario() {
        return diaHacendario;
    }

    public void setStrFecIni(String strFecIni) {
        this.strFecIni = strFecIni;
    }

    public String getStrFecIni() {
        return strFecIni;
    }

    public void setStrFecFin(String strFecFin) {
        this.strFecFin = strFecFin;
    }

    public String getStrFecFin() {
        return strFecFin;
    }
}
