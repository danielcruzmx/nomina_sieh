package gob.shcp.sireh.model.clc.interfaz;

import gob.shcp.fsn.model.Model;

import java.util.Date;
import java.util.List;

public class SolicitudCLCDTO implements java.io.Serializable, Model {

    // Cabecera
    private String idBeneSicop;
    private String descBeneSicop;
    private String bsCtaBancaria;
    private String bsTipoMoneda;
    private String bsLeyenda;
    private String bsTipoPago;
    private String bsTipoNom;
    private String concepto;
    
    // Cuenta CXLC
    private Integer[] cxlcGrupo;
    private Integer cxlcCiclo;
    private String cxlcQnaPagoMultiple;
    private List<Integer> quincenasList;
    private String idTipoNomina;
    private Integer cxlcComplemento;
    private boolean buscaCxlc;
    private boolean cancelBuscaCxlc;
    private List<String> idTipoNominaList;
    private String idTipoNominaTodas;
    
    // Otros
    private Date fechaExp;
    private Date fechaApli;
    private Date fechaIni;
    private Date fechaFin;
    private Date fechaComp;
    private String doctoRef;
    private String mes;
    private String qnaPago;
     
    // Consejerias
    private Double tipoCambio;
    private String referencia;
    private Date fechaRef;
    
    private boolean cancel;
    private boolean muestraRegistros;
    
    // Archivo
    private java.lang.String fileName;
    private java.lang.String csvFileName;
    private java.lang.String csvFilePath;
    private java.lang.String zipFileName;
    private java.lang.String zipFilePath;
    
    public void setIdBeneSicop(String idBeneSicop) {
        this.idBeneSicop = idBeneSicop;
    }

    public String getIdBeneSicop() {
        return idBeneSicop;
    }

    public void setDescBeneSicop(String descBeneSicop) {
        this.descBeneSicop = descBeneSicop;
    }

    public String getDescBeneSicop() {
        return descBeneSicop;
    }

    public void setBsCtaBancaria(String bsCtaBancaria) {
        this.bsCtaBancaria = bsCtaBancaria;
    }

    public String getBsCtaBancaria() {
        return bsCtaBancaria;
    }

    public void setBsTipoMoneda(String bsTipoMoneda) {
        this.bsTipoMoneda = bsTipoMoneda;
    }

    public String getBsTipoMoneda() {
        return bsTipoMoneda;
    }

    public void setBsLeyenda(String bsLeyenda) {
        this.bsLeyenda = bsLeyenda;
    }

    public String getBsLeyenda() {
        return bsLeyenda;
    }

    public void setBsTipoPago(String bsTipoPago) {
        this.bsTipoPago = bsTipoPago;
    }

    public String getBsTipoPago() {
        return bsTipoPago;
    }

    public void setBsTipoNom(String bsTipoNom) {
        this.bsTipoNom = bsTipoNom;
    }

    public String getBsTipoNom() {
        return bsTipoNom;
    }

    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }

    public String getConcepto() {
        return concepto;
    }

    public void setCxlcGrupo(Integer[] cxlcGrupo) {
        this.cxlcGrupo = cxlcGrupo;
    }

    public Integer[] getCxlcGrupo() {
        return cxlcGrupo;
    }

    public void setCxlcCiclo(Integer cxlcCiclo) {
        this.cxlcCiclo = cxlcCiclo;
    }

    public Integer getCxlcCiclo() {
        return cxlcCiclo;
    }

    public void setCxlcQnaPagoMultiple(String cxlcQnaPagoMultiple) {
        this.cxlcQnaPagoMultiple = cxlcQnaPagoMultiple;
    }

    public String getCxlcQnaPagoMultiple() {
        return cxlcQnaPagoMultiple;
    }

    public void setIdTipoNomina(String idTipoNomina) {
        this.idTipoNomina = idTipoNomina;
    }

    public String getIdTipoNomina() {
        return idTipoNomina;
    }

    public void setCxlcComplemento(Integer cxlcComplemento) {
        this.cxlcComplemento = cxlcComplemento;
    }

    public Integer getCxlcComplemento() {
        return cxlcComplemento;
    }

    public void setBuscaCxlc(boolean buscaCxlc) {
        this.buscaCxlc = buscaCxlc;
    }

    public boolean isBuscaCxlc() {
        return buscaCxlc;
    }

    public void setCancelBuscaCxlc(boolean cancelBuscaCxlc) {
        this.cancelBuscaCxlc = cancelBuscaCxlc;
    }

    public boolean isCancelBuscaCxlc() {
        return cancelBuscaCxlc;
    }

    public void setFechaExp(Date fechaExp) {
        this.fechaExp = fechaExp;
    }

    public Date getFechaExp() {
        return fechaExp;
    }

    public void setFechaApli(Date fechaApli) {
        this.fechaApli = fechaApli;
    }

    public Date getFechaApli() {
        return fechaApli;
    }

    public void setFechaIni(Date fechaIni) {
        this.fechaIni = fechaIni;
    }

    public Date getFechaIni() {
        return fechaIni;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaComp(Date fechaComp) {
        this.fechaComp = fechaComp;
    }

    public Date getFechaComp() {
        return fechaComp;
    }

    public void setDoctoRef(String doctoRef) {
        this.doctoRef = doctoRef;
    }

    public String getDoctoRef() {
        return doctoRef;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public String getMes() {
        return mes;
    }

    public void setQnaPago(String qnaPago) {
        this.qnaPago = qnaPago;
    }

    public String getQnaPago() {
        return qnaPago;
    }

    public void setTipoCambio(Double tipoCambio) {
        this.tipoCambio = tipoCambio;
    }

    public Double getTipoCambio() {
        return tipoCambio;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setFechaRef(Date fechaRef) {
        this.fechaRef = fechaRef;
    }

    public Date getFechaRef() {
        return fechaRef;
    }

    public void setCancel(boolean cancel) {
        this.cancel = cancel;
    }

    public boolean isCancel() {
        return cancel;
    }

    public void setMuestraRegistros(boolean muestraRegistros) {
        this.muestraRegistros = muestraRegistros;
    }

    public boolean isMuestraRegistros() {
        return muestraRegistros;
    }

    public void setCsvFileName(String csvFileName) {
        this.csvFileName = csvFileName;
    }

    public String getCsvFileName() {
        return csvFileName;
    }

    public void setCsvFilePath(String csvFilePath) {
        this.csvFilePath = csvFilePath;
    }

    public String getCsvFilePath() {
        return csvFilePath;
    }

    public void setZipFileName(String zipFileName) {
        this.zipFileName = zipFileName;
    }

    public String getZipFileName() {
        return zipFileName;
    }

    public void setZipFilePath(String zipFilePath) {
        this.zipFilePath = zipFilePath;
    }

    public String getZipFilePath() {
        return zipFilePath;
    }
    
    public void setIdTipoNominaList(List<String> idTipoNominaList) {
        this.idTipoNominaList = idTipoNominaList;
    }

    public List<String> getIdTipoNominaList() {
        return idTipoNominaList;
    }
    
    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getFileName() {
        return fileName;
    }
    
    public void setIdTipoNominaTodas(String idTipoNominaTodas) {
        this.idTipoNominaTodas = idTipoNominaTodas;
    }

    public String getIdTipoNominaTodas() {
        return idTipoNominaTodas;
    }
    
    public void setQuincenasList(List<Integer> quincenasList) {
        this.quincenasList = quincenasList;
    }

    public List<Integer> getQuincenasList() {
        return quincenasList;
    }
}
