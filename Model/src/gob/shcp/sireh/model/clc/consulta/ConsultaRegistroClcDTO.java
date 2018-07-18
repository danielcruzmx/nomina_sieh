package gob.shcp.sireh.model.clc.consulta;

import gob.shcp.fsn.model.Model;

public class ConsultaRegistroClcDTO implements java.io.Serializable, Model {
    
    // Datos de la CXLC
    private String cxlcCiclo;
    private String cxlcQnaPago;
    private String cxlcTipoNomina;
    private String cxlcComplemento;
    private String cxlcNum;
   
    // json - CXLC
    private String jsonMaster;
    private Integer totalMaster;
    
    private String mes;
    private String Armi;
    private String mesQna;
    private String histoCiclo;
    
    // Configuracion inicial
    private String seccion;
    private String beanName;
    
    // Navegacion
    private String urlOrigen;
    private String urlDestino;
    
    // Control
    private boolean cancel;
    private boolean muestraRegistros;
    private boolean registroCLC;
    private boolean casosImpuestos;
    
    // Casos 2N    
    private Integer h2ncCiclo;
    private Integer idEdo;
    private Integer h2ncCasos;
    private Integer h2ncMonto;
       
    // Clc Procesada cxlc_qna_pago, cxlc, cxlc_complemento, id_tipo_nomina, cxlc_monto
    private Integer cxlc;
    private String idTipoNomina;
    private Integer cxlcMonto;
    
    public void setCxlcCiclo(String cxlcCiclo) {
        this.cxlcCiclo = cxlcCiclo;
    }

    public String getCxlcCiclo() {
        return cxlcCiclo;
    }

    public void setCxlcQnaPago(String cxlcQnaPago) {
        this.cxlcQnaPago = cxlcQnaPago;
    }

    public String getCxlcQnaPago() {
        return cxlcQnaPago;
    }

    public void setCxlcTipoNomina(String cxlcTipoNomina) {
        this.cxlcTipoNomina = cxlcTipoNomina;
    }

    public String getCxlcTipoNomina() {
        return cxlcTipoNomina;
    }

    public void setCxlcComplemento(String cxlcComplemento) {
        this.cxlcComplemento = cxlcComplemento;
    }

    public String getCxlcComplemento() {
        return cxlcComplemento;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public String getMes() {
        return mes;
    }

    public void setSeccion(String seccion) {
        this.seccion = seccion;
    }

    public String getSeccion() {
        return seccion;
    }

    public void setBeanName(String beanName) {
        this.beanName = beanName;
    }

    public String getBeanName() {
        return beanName;
    }

    public void setUrlOrigen(String urlOrigen) {
        this.urlOrigen = urlOrigen;
    }

    public String getUrlOrigen() {
        return urlOrigen;
    }

    public void setUrlDestino(String urlDestino) {
        this.urlDestino = urlDestino;
    }

    public String getUrlDestino() {
        return urlDestino;
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

    public void setRegistroCLC(boolean registroCLC) {
        this.registroCLC = registroCLC;
    }

    public boolean isRegistroCLC() {
        return registroCLC;
    }

    public void setCasosImpuestos(boolean casosImpuestos) {
        this.casosImpuestos = casosImpuestos;
    }

    public boolean isCasosImpuestos() {
        return casosImpuestos;
    }

    public void setArmi(String armi) {
        this.Armi = armi;
    }

    public String getArmi() {
        return Armi;
    }

    public void setMesQna(String mesQna) {
        this.mesQna = mesQna;
    }

    public String getMesQna() {
        return mesQna;
    }

    public void setHistoCiclo(String histoCiclo) {
        this.histoCiclo = histoCiclo;
    }

    public String getHistoCiclo() {
        return histoCiclo;
    }

    public void setH2ncCiclo(Integer h2ncCiclo) {
        this.h2ncCiclo = h2ncCiclo;
    }

    public Integer getH2ncCiclo() {
        return h2ncCiclo;
    }

    public void setIdEdo(Integer idEdo) {
        this.idEdo = idEdo;
    }

    public Integer getIdEdo() {
        return idEdo;
    }

    public void setH2ncCasos(Integer h2ncCasos) {
        this.h2ncCasos = h2ncCasos;
    }

    public Integer getH2ncCasos() {
        return h2ncCasos;
    }

    public void setH2ncMonto(Integer h2ncMonto) {
        this.h2ncMonto = h2ncMonto;
    }

    public Integer getH2ncMonto() {
        return h2ncMonto;
    }

    public void setCxlcNum(String cxlcNum) {
        this.cxlcNum = cxlcNum;
    }

    public String getCxlcNum() {
        return cxlcNum;
    }

    public void setCxlc(Integer cxlc) {
        this.cxlc = cxlc;
    }

    public Integer getCxlc() {
        return cxlc;
    }

    public void setIdTipoNomina(String idTipoNomina) {
        this.idTipoNomina = idTipoNomina;
    }

    public String getIdTipoNomina() {
        return idTipoNomina;
    }

    public void setCxlcMonto(Integer cxlcMonto) {
        this.cxlcMonto = cxlcMonto;
    }

    public Integer getCxlcMonto() {
        return cxlcMonto;
    }
    
    public void setJsonMaster(String jsonMaster) {
        this.jsonMaster = jsonMaster;
    }

    public String getJsonMaster() {
        return jsonMaster;
    }

    public void setTotalMaster(Integer totalMaster) {
        this.totalMaster = totalMaster;
    }

    public Integer getTotalMaster() {
        return totalMaster;
    }
    
    
}
