package gob.shcp.sireh.model;

import gob.shcp.fsn.model.Model;

import java.util.Date;

public class CustomTnComprobanteDigDTO implements java.io.Serializable, Model {
    private java.lang.Integer cnDifFolio;
    private java.lang.Long cnFolio;
    private java.lang.Integer cnPaquete;
    
    private java.lang.String cnSituacion;
    
    private java.util.Date fecModifico;
    
    private java.lang.String usuario;
    
    private java.lang.String cnCadenaOriginal;
    private java.lang.Integer cnConsecNomina;
    private java.lang.Integer cnEjercicio;
    private java.util.Date cnFechaGenerado;
    private java.util.Date cnFecCanc;
    private java.util.Date cnFecEnvio;
    private java.util.Date cnFecEnvCanc;
    private java.util.Date cnFecFirmaRec;
    private java.util.Date cnFecRespuesta;
    
    private java.lang.String cnFolioFiscal;
    
    private java.lang.String cnFolioRecibo;
    
    private java.lang.String cnRfc;
    private String cnXmlCancelado;
    private String cnXmlGenerado;
    private String cnXmlTimbrado;
    private java.lang.Integer cnEnviadoInst;
    private java.lang.Integer cnEnviadoPers;
    

    public void setCnDifFolio(Integer cnDifFolio) {
        this.cnDifFolio = cnDifFolio;
    }

    public Integer getCnDifFolio() {
        return cnDifFolio;
    }

    public void setCnFolio(java.lang.Long cnFolio) {
        this.cnFolio = cnFolio;
    }

    public java.lang.Long getCnFolio() {
        return cnFolio;
    }

    public void setCnXmlCancelado(String cnXmlCancelado) {
        this.cnXmlCancelado = cnXmlCancelado;
    }

    public String getCnXmlCancelado() {
        return cnXmlCancelado;
    }

    public void setCnXmlGenerado(String cnXmlGenerado) {
        this.cnXmlGenerado = cnXmlGenerado;
    }

    public String getCnXmlGenerado() {
        return cnXmlGenerado;
    }

    public void setCnXmlTimbrado(String cnXmlTimbrado) {
        this.cnXmlTimbrado = cnXmlTimbrado;
    }

    public String getCnXmlTimbrado() {
        return cnXmlTimbrado;
    }

    public void setCnPaquete(Integer cnPaquete) {
        this.cnPaquete = cnPaquete;
    }

    public Integer getCnPaquete() {
        return cnPaquete;
    }

    public void setCnSituacion(String cnSituacion) {
        this.cnSituacion = cnSituacion;
    }

    public String getCnSituacion() {
        return cnSituacion;
    }

    public void setFecModifico(Date fecModifico) {
        this.fecModifico = fecModifico;
    }

    public Date getFecModifico() {
        return fecModifico;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setCnCadenaOriginal(String cnCadenaOriginal) {
        this.cnCadenaOriginal = cnCadenaOriginal;
    }

    public String getCnCadenaOriginal() {
        return cnCadenaOriginal;
    }

    public void setCnConsecNomina(Integer cnConsecNomina) {
        this.cnConsecNomina = cnConsecNomina;
    }

    public Integer getCnConsecNomina() {
        return cnConsecNomina;
    }

    public void setCnEjercicio(Integer cnEjercicio) {
        this.cnEjercicio = cnEjercicio;
    }

    public Integer getCnEjercicio() {
        return cnEjercicio;
    }

    public void setCnFechaGenerado(Date cnFechaGenerado) {
        this.cnFechaGenerado = cnFechaGenerado;
    }

    public Date getCnFechaGenerado() {
        return cnFechaGenerado;
    }

    public void setCnFecCanc(Date cnFecCanc) {
        this.cnFecCanc = cnFecCanc;
    }

    public Date getCnFecCanc() {
        return cnFecCanc;
    }

    public void setCnFecEnvio(Date cnFecEnvio) {
        this.cnFecEnvio = cnFecEnvio;
    }

    public Date getCnFecEnvio() {
        return cnFecEnvio;
    }

    public void setCnFecEnvCanc(Date cnFecEnvCanc) {
        this.cnFecEnvCanc = cnFecEnvCanc;
    }

    public Date getCnFecEnvCanc() {
        return cnFecEnvCanc;
    }

    public void setCnFecFirmaRec(Date cnFecFirmaRec) {
        this.cnFecFirmaRec = cnFecFirmaRec;
    }

    public Date getCnFecFirmaRec() {
        return cnFecFirmaRec;
    }

    public void setCnFecRespuesta(Date cnFecRespuesta) {
        this.cnFecRespuesta = cnFecRespuesta;
    }

    public Date getCnFecRespuesta() {
        return cnFecRespuesta;
    }

    public void setCnFolioFiscal(String cnFolioFiscal) {
        this.cnFolioFiscal = cnFolioFiscal;
    }

    public String getCnFolioFiscal() {
        return cnFolioFiscal;
    }

    public void setCnFolioRecibo(String cnFolioRecibo) {
        this.cnFolioRecibo = cnFolioRecibo;
    }

    public String getCnFolioRecibo() {
        return cnFolioRecibo;
    }

    public void setCnRfc(String cnRfc) {
        this.cnRfc = cnRfc;
    }

    public String getCnRfc() {
        return cnRfc;
    }

    public void setCnEnviadoInst(Integer cnEnviadoInst) {
        this.cnEnviadoInst = cnEnviadoInst;
    }

    public Integer getCnEnviadoInst() {
        return cnEnviadoInst;
    }

    public void setCnEnviadoPers(Integer cnEnviadoPers) {
        this.cnEnviadoPers = cnEnviadoPers;
    }

    public Integer getCnEnviadoPers() {
        return cnEnviadoPers;
    }
}
