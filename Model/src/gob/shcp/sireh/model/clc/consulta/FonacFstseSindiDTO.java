package gob.shcp.sireh.model.clc.consulta;

import gob.shcp.fsn.model.Model;

public class FonacFstseSindiDTO implements java.io.Serializable, Model {

    // Datos de la CXLC
    private Integer cxlcCiclo;
    private Integer cxlcQnaPago;
    private Integer complem;
    private String idNomina;
    private Integer importe;
    private String nomina;
    private String complemento;
    private String cptopago;
    private String gpopago;
    private String rfc;
    private Integer qnaaplica;
    private String titulo;
    
    // Configuracion inicial
    private String seccion;
    private String beanName;
    
    // Navegacion
    private String urlOrigen;
    private String urlDestino;
    private boolean muestraRegistros; 
    private boolean cancel;

    public void setCxlcCiclo(Integer cxlcCiclo) {
        this.cxlcCiclo = cxlcCiclo;
    }

    public Integer getCxlcCiclo() {
        return cxlcCiclo;
    }

    public void setCxlcQnaPago(Integer cxlcQnaPago) {
        this.cxlcQnaPago = cxlcQnaPago;
    }

    public Integer getCxlcQnaPago() {
        return cxlcQnaPago;
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

    public void setComplem(Integer complem) {
        this.complem = complem;
    }

    public Integer getComplem() {
        return complem;
    }

    public void setIdNomina(String idNomina) {
        this.idNomina = idNomina;
    }

    public String getIdNomina() {
        return idNomina;
    }

    public void setImporte(Integer importe) {
        this.importe = importe;
    }

    public Integer getImporte() {
        return importe;
    }

    public void setNomina(String nomina) {
        this.nomina = nomina;
    }

    public String getNomina() {
        return nomina;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setCptopago(String cptopago) {
        this.cptopago = cptopago;
    }

    public String getCptopago() {
        return cptopago;
    }

    public void setGpopago(String gpopago) {
        this.gpopago = gpopago;
    }

    public String getGpopago() {
        return gpopago;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    public String getRfc() {
        return rfc;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setQnaaplica(Integer qnaaplica) {
        this.qnaaplica = qnaaplica;
    }

    public Integer getQnaaplica() {
        return qnaaplica;
    }
}
