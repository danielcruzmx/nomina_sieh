package gob.shcp.sireh.model.clc.interfaz;

import gob.shcp.fsn.model.Model;

public class GestionBeneficiariosDTO implements java.io.Serializable, Model {

    // Datos 
    private String idbenef;
    private String ctabco;
    private String descrip;
    private String moneda;
    private String pago;
    private String leyenda;
    private String ref1;
    private String ref2;
    private String tiponom;
    private String rfc;
    private Integer origen;
    private Integer eroga;
    private Integer opera;    
    private String usuario;
    private String fechamod;
    
    // Configuracion inicial
    private String seccion;
    private String beanName;
    
    // Navegacion
    private String urlOrigen;
    private String urlDestino;
    private boolean muestraRegistros; 
    private boolean cancel;

    public void setIdbenef(String idbenef) {
        this.idbenef = idbenef;
    }

    public String getIdbenef() {
        return idbenef;
    }

    public void setCtabco(String ctabco) {
        this.ctabco = ctabco;
    }

    public String getCtabco() {
        return ctabco;
    }

    public void setDescrip(String descrip) {
        this.descrip = descrip;
    }

    public String getDescrip() {
        return descrip;
    }

    public void setMoneda(String moneda) {
        this.moneda = moneda;
    }

    public String getMoneda() {
        return moneda;
    }

    public void setPago(String pago) {
        this.pago = pago;
    }

    public String getPago() {
        return pago;
    }

    public void setLeyenda(String leyenda) {
        this.leyenda = leyenda;
    }

    public String getLeyenda() {
        return leyenda;
    }

    public void setRef1(String ref1) {
        this.ref1 = ref1;
    }

    public String getRef1() {
        return ref1;
    }

    public void setRef2(String ref2) {
        this.ref2 = ref2;
    }

    public String getRef2() {
        return ref2;
    }

    public void setTiponom(String tiponom) {
        this.tiponom = tiponom;
    }

    public String getTiponom() {
        return tiponom;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    public String getRfc() {
        return rfc;
    }

    public void setOrigen(Integer origen) {
        this.origen = origen;
    }

    public Integer getOrigen() {
        return origen;
    }

    public void setEroga(Integer eroga) {
        this.eroga = eroga;
    }

    public Integer getEroga() {
        return eroga;
    }

    public void setOpera(Integer opera) {
        this.opera = opera;
    }

    public Integer getOpera() {
        return opera;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setFechamod(String fechamod) {
        this.fechamod = fechamod;
    }

    public String getFechamod() {
        return fechamod;
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

    public void setMuestraRegistros(boolean muestraRegistros) {
        this.muestraRegistros = muestraRegistros;
    }

    public boolean isMuestraRegistros() {
        return muestraRegistros;
    }

    public void setCancel(boolean cancel) {
        this.cancel = cancel;
    }

    public boolean isCancel() {
        return cancel;
    }
}
