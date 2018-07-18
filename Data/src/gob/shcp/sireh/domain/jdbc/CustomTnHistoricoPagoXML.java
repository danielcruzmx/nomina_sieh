package gob.shcp.sireh.domain.jdbc;

import gob.shcp.fsn.data.Domain;

import java.io.Serializable;

import java.text.SimpleDateFormat;


public class CustomTnHistoricoPagoXML implements Domain, Serializable {
    SimpleDateFormat formato = new SimpleDateFormat("yyyy-mm-dd");
    private String  rfcEmpleado;
    private String  primerApellido;
    private String  segundoApellido;
    private String  nombreEmpleado;
    private Integer folio;
    private String  serieRecibo;
    private String  condicionPago;
    private Double  tipoCambio;
    private String  moneda;
    private String  metodoPago;
    private String  lugar;
    private String  numCta;
    private String  regPatronal;
    private String  curpEmpleado;
    private Integer tipoReg;
    private String  nssEmpleado;
    private java.sql.Date fecPago;
    private java.sql.Date    fecIniPago;
    private java.sql.Date    fecFinPago;
    private Integer diasPagados;
    private String  depto;
    private String  clabe;
    private String  banco;
    private java.sql.Date    fecIngreso;
    private Integer antiguedad;
    private String  puesto;
    private String  puesto1;
    private String  tipoContrata;
    private String  jornada;
    private String  tipoNomina;
    private String  periodicidad;
    private Double  sdoBase;
    private Integer riesgo;
    private Double  sdoDia;
    private Integer diasIncapacidad;
    private String  tipoIncapacidad;
    private String  descuento;
    private String  diasHorasExtra;
    private String  tipoHorasExtra;
    private String  horasExtra;
    private String  importePag;
    private Integer hpDifFolio;
    private Integer idNomina;
    private String hpNombramiento;

    public void setFormato(SimpleDateFormat formato) {
        this.formato = formato;
    }

    public SimpleDateFormat getFormato() {
        return formato;
    }

    public void setRfcEmpleado(String rfcEmpleado) {
        this.rfcEmpleado = rfcEmpleado;
    }

    public String getRfcEmpleado() {
        return rfcEmpleado;
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    public String getPrimerApellido() {
        return primerApellido;
    }

    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }

    public String getSegundoApellido() {
        return segundoApellido;
    }

    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }

    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public void setFolio(Integer folio) {
        this.folio = folio;
    }

    public Integer getFolio() {
        return folio;
    }

    public void setSerieRecibo(String serieRecibo) {
        this.serieRecibo = serieRecibo;
    }

    public String getSerieRecibo() {
        return serieRecibo;
    }

    public void setCondicionPago(String condicionPago) {
        this.condicionPago = condicionPago;
    }

    public String getCondicionPago() {
        return condicionPago;
    }

    public void setTipoCambio(Double tipoCambio) {
        this.tipoCambio = tipoCambio;
    }

    public Double getTipoCambio() {
        return tipoCambio;
    }

    public void setMoneda(String moneda) {
        this.moneda = moneda;
    }

    public String getMoneda() {
        return moneda;
    }

    public void setMetodoPago(String metodoPago) {
        this.metodoPago = metodoPago;
    }

    public String getMetodoPago() {
        return metodoPago;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public String getLugar() {
        return lugar;
    }

    public void setNumCta(String numCta) {
        this.numCta = numCta;
    }

    public String getNumCta() {
        return numCta;
    }

    public void setRegPatronal(String regPatronal) {
        this.regPatronal = regPatronal;
    }

    public String getRegPatronal() {
        return regPatronal;
    }

    public void setCurpEmpleado(String curpEmpleado) {
        this.curpEmpleado = curpEmpleado;
    }

    public String getCurpEmpleado() {
        return curpEmpleado;
    }

    public void setTipoReg(Integer tipoReg) {
        this.tipoReg = tipoReg;
    }

    public Integer getTipoReg() {
        return tipoReg;
    }

    public void setNssEmpleado(String nssEmpleado) {
        this.nssEmpleado = nssEmpleado;
    }

    public String getNssEmpleado() {
        return nssEmpleado;
    }

    public void setFecPago(java.sql.Date fecPago) {
        this.fecPago = fecPago;
    }

    public java.sql.Date getFecPago() {
        return fecPago;
    }

    public void setFecIniPago(java.sql.Date fecIniPago) {
        this.fecIniPago = fecIniPago;
    }

    public java.sql.Date getFecIniPago() {
        return fecIniPago;
    }

    public void setFecFinPago(java.sql.Date fecFinPago) {
        this.fecFinPago = fecFinPago;
    }

    public java.sql.Date getFecFinPago() {
        return fecFinPago;
    }

    public void setDiasPagados(Integer diasPagados) {
        this.diasPagados = diasPagados;
    }

    public Integer getDiasPagados() {
        return diasPagados;
    }

    public void setDepto(String depto) {
        this.depto = depto;
    }

    public String getDepto() {
        return depto;
    }

    public void setClabe(String clabe) {
        this.clabe = clabe;
    }

    public String getClabe() {
        return clabe;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public String getBanco() {
        return banco;
    }

    public void setFecIngreso(java.sql.Date fecIngreso) {
        this.fecIngreso = fecIngreso;
    }

    public java.sql.Date getFecIngreso() {
        return fecIngreso;
    }

    public void setAntiguedad(Integer antiguedad) {
        this.antiguedad = antiguedad;
    }

    public Integer getAntiguedad() {
        return antiguedad;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setTipoContrata(String tipoContrata) {
        this.tipoContrata = tipoContrata;
    }

    public String getTipoContrata() {
        return tipoContrata;
    }

    public void setJornada(String jornada) {
        this.jornada = jornada;
    }

    public String getJornada() {
        return jornada;
    }

    public void setPeriodicidad(String periodicidad) {
        this.periodicidad = periodicidad;
    }

    public String getPeriodicidad() {
        return periodicidad;
    }

    public void setSdoBase(Double sdoBase) {
        this.sdoBase = sdoBase;
    }

    public Double getSdoBase() {
        return sdoBase;
    }

    public void setRiesgo(Integer riesgo) {
        this.riesgo = riesgo;
    }

    public Integer getRiesgo() {
        return riesgo;
    }

    public void setSdoDia(Double sdoDia) {
        this.sdoDia = sdoDia;
    }

    public Double getSdoDia() {
        return sdoDia;
    }

    public void setDiasIncapacidad(Integer diasIncapacidad) {
        this.diasIncapacidad = diasIncapacidad;
    }

    public Integer getDiasIncapacidad() {
        return diasIncapacidad;
    }

    public void setTipoIncapacidad(String tipoIncapacidad) {
        this.tipoIncapacidad = tipoIncapacidad;
    }

    public String getTipoIncapacidad() {
        return tipoIncapacidad;
    }

    public void setDescuento(String descuento) {
        this.descuento = descuento;
    }

    public String getDescuento() {
        return descuento;
    }

    public void setDiasHorasExtra(String diasHorasExtra) {
        this.diasHorasExtra = diasHorasExtra;
    }

    public String getDiasHorasExtra() {
        return diasHorasExtra;
    }

    public void setTipoHorasExtra(String tipoHorasExtra) {
        this.tipoHorasExtra = tipoHorasExtra;
    }

    public String getTipoHorasExtra() {
        return tipoHorasExtra;
    }

    public void setHorasExtra(String horasExtra) {
        this.horasExtra = horasExtra;
    }

    public String getHorasExtra() {
        return horasExtra;
    }

    public void setImportePag(String importePag) {
        this.importePag = importePag;
    }

    public String getImportePag() {
        return importePag;
    }

    public void setHpDifFolio(Integer hpDifFolio) {
        this.hpDifFolio = hpDifFolio;
    }

    public Integer getHpDifFolio() {
        return hpDifFolio;
    }

    public void setIdentity(Serializable id) {
    }

    public Serializable getIdentity() {
        return null;
    }

    public void setTipoNomina(String tipoNomina) {
        this.tipoNomina = tipoNomina;
    }

    public String getTipoNomina() {
        return tipoNomina;
    }

    public void setIdNomina(Integer idNomina) {
        this.idNomina = idNomina;
    }

    public Integer getIdNomina() {
        return idNomina;
    }

    public void setPuesto1(String puesto1) {
        this.puesto1 = puesto1;
    }

    public String getPuesto1() {
        return puesto1;
    }

    public void setHpNombramiento(String hpNombramiento) {
        this.hpNombramiento = hpNombramiento;
    }

    public String getHpNombramiento() {
        return hpNombramiento;
    }
}
