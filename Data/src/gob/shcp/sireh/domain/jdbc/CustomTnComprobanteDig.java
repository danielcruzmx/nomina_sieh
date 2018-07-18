package gob.shcp.sireh.domain.jdbc;

import gob.shcp.fsn.data.Domain;

import java.io.Serializable;

import java.util.Date;

public class CustomTnComprobanteDig implements Domain, Serializable {
    private java.lang.Integer cnDifFolio;
    private java.lang.Long cnFolio;
    private java.lang.Integer cnPaquete;
    private java.lang.String cnSituacion;
    private java.util.Date fecModifico;
    private java.lang.String usuario;
    private java.lang.String cnCadenaOriginal;
    private java.lang.String cnCadenaSello;
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
    private java.lang.String cnIdPaqueteSat;
        private java.lang.String cnIncidencia;
        private java.lang.Integer cnPaqueteRv;
    private java.lang.String cnRefTimbrado;
    private java.lang.String cnUriblobCanc;
        private java.lang.String cnUriblobTimb;
    private byte[] cnArchAnexo20;
        private byte[] cnArchACancelar;
        private byte[] cnArchCreacion;
        private byte[] cnArchTimbrado;

    private java.lang.String cnXmlCancelado;
    private java.lang.String cnXmlGenerado;
    private java.lang.String cnXmlTimbrado;
    
    private java.lang.Integer cnEnviadoInst;
    private java.lang.Integer cnEnviadoPers;

    public CustomTnComprobanteDig(){}

    public CustomTnComprobanteDig(     java.lang.Integer cnDifFolio, java.lang.Long cnFolio, java.lang.Integer cnPaquete, java.lang.String cnRefTimbrado, java.lang.String cnSituacion, java.util.Date fecModifico, java.lang.String usuario, byte[] cnArchAnexo20, byte[] cnArchACancelar, byte[] cnArchCreacion, byte[] cnArchTimbrado, java.lang.String cnCadenaOriginal, java.lang.String cnCadenaSello, java.lang.Integer cnConsecNomina, java.lang.Integer cnEjercicio, java.lang.Integer cnEnviadoInst, java.lang.Integer cnEnviadoPers, java.util.Date cnFechaGenerado, java.util.Date cnFecCanc, java.util.Date cnFecEnvio, java.util.Date cnFecEnvCanc, java.util.Date cnFecFirmaRec, java.util.Date cnFecRespuesta, java.lang.String cnFolioFiscal, java.lang.String cnFolioRecibo, java.lang.String cnIdPaqueteSat, java.lang.String cnIncidencia, java.lang.Integer cnPaqueteRv, java.lang.String cnRfc, java.lang.String cnUriblobCanc, java.lang.String cnUriblobTimb, java.lang.String cnXmlCancelado, java.lang.String cnXmlGenerado, java.lang.String cnXmlTimbrado) {
        this.cnFolio = cnFolio;
        this.cnDifFolio = cnDifFolio;
        this.cnPaquete = cnPaquete;
       this.cnRefTimbrado = cnRefTimbrado;
                            this.cnSituacion = cnSituacion;
                            this.fecModifico = fecModifico;
                            this.usuario = usuario;
                            this.cnArchAnexo20 = cnArchAnexo20;
                            this.cnArchACancelar = cnArchACancelar;
                            this.cnArchCreacion = cnArchCreacion;
                            this.cnArchTimbrado = cnArchTimbrado;
                            this.cnCadenaOriginal = cnCadenaOriginal;
                            this.cnCadenaSello = cnCadenaSello;
                            this.cnConsecNomina = cnConsecNomina;
                            this.cnEjercicio = cnEjercicio;
                            this.cnEnviadoInst = cnEnviadoInst;
                            this.cnEnviadoPers = cnEnviadoPers;
                            this.cnFechaGenerado = cnFechaGenerado;
                            this.cnFecCanc = cnFecCanc;
                            this.cnFecEnvio = cnFecEnvio;
                            this.cnFecEnvCanc = cnFecEnvCanc;
                            this.cnFecFirmaRec = cnFecFirmaRec;
                            this.cnFecRespuesta = cnFecRespuesta;
                            this.cnFolioFiscal = cnFolioFiscal;
                            this.cnFolioRecibo = cnFolioRecibo;
                            this.cnIdPaqueteSat = cnIdPaqueteSat;
                            this.cnIncidencia = cnIncidencia;
                            this.cnPaqueteRv = cnPaqueteRv;
                            this.cnRfc = cnRfc;
                            this.cnUriblobCanc = cnUriblobCanc;
                            this.cnUriblobTimb = cnUriblobTimb;
                            this.cnXmlCancelado = cnXmlCancelado;
                            this.cnXmlGenerado = cnXmlGenerado;
                            this.cnXmlTimbrado = cnXmlTimbrado;
                }

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

    public void setIdentity(Serializable id) {
    }

    public Serializable getIdentity() {
        return null;
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

    public void setCnCadenaSello(String cnCadenaSello) {
        this.cnCadenaSello = cnCadenaSello;
    }

    public String getCnCadenaSello() {
        return cnCadenaSello;
    }

    public void setCnIdPaqueteSat(String cnIdPaqueteSat) {
        this.cnIdPaqueteSat = cnIdPaqueteSat;
    }

    public String getCnIdPaqueteSat() {
        return cnIdPaqueteSat;
    }

    public void setCnIncidencia(String cnIncidencia) {
        this.cnIncidencia = cnIncidencia;
    }

    public String getCnIncidencia() {
        return cnIncidencia;
    }

    public void setCnPaqueteRv(Integer cnPaqueteRv) {
        this.cnPaqueteRv = cnPaqueteRv;
    }

    public Integer getCnPaqueteRv() {
        return cnPaqueteRv;
    }

    public void setCnRefTimbrado(String cnRefTimbrado) {
        this.cnRefTimbrado = cnRefTimbrado;
    }

    public String getCnRefTimbrado() {
        return cnRefTimbrado;
    }

    public void setCnUriblobCanc(String cnUriblobCanc) {
        this.cnUriblobCanc = cnUriblobCanc;
    }

    public String getCnUriblobCanc() {
        return cnUriblobCanc;
    }

    public void setCnUriblobTimb(String cnUriblobTimb) {
        this.cnUriblobTimb = cnUriblobTimb;
    }

    public String getCnUriblobTimb() {
        return cnUriblobTimb;
    }

    public void setCnArchAnexo20(byte[] cnArchAnexo20) {
        this.cnArchAnexo20 = cnArchAnexo20;
    }

    public byte[] getCnArchAnexo20() {
        return cnArchAnexo20;
    }

    public void setCnArchACancelar(byte[] cnArchACancelar) {
        this.cnArchACancelar = cnArchACancelar;
    }

    public byte[] getCnArchACancelar() {
        return cnArchACancelar;
    }

    public void setCnArchCreacion(byte[] cnArchCreacion) {
        this.cnArchCreacion = cnArchCreacion;
    }

    public byte[] getCnArchCreacion() {
        return cnArchCreacion;
    }

    public void setCnArchTimbrado(byte[] cnArchTimbrado) {
        this.cnArchTimbrado = cnArchTimbrado;
    }

    public byte[] getCnArchTimbrado() {
        return cnArchTimbrado;
    }
}
