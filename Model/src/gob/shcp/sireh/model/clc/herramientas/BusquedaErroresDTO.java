package gob.shcp.sireh.model.clc.herramientas;

import gob.shcp.fsn.model.Model;

public class BusquedaErroresDTO implements java.io.Serializable, Model {

    private Integer cicloUnidad;
    private Integer qnaPago;
    private String tipoNomina;
    private String numComplem;
    private Integer revisado;

    private boolean cancel;
    private boolean muestraRegistros;
    
    // Configuracion inicial
    private String seccion;
    private String beanName;
    
    // Navegacion
    private String urlOrigen;
    private String urlDestino;
    
    public Integer getCicloUnidad() {
        return cicloUnidad;
    }

    public void setCicloUnidad(Integer cicloUnidad) {
        this.cicloUnidad = cicloUnidad;
    }

    public Integer getQnaPago() {
        return qnaPago;
    }

    public void setQnaPago(Integer qnaPago) {
        this.qnaPago = qnaPago;
    }

    public String getTipoNomina() {
        return tipoNomina;
    }

    public void setTipoNomina(String tipoNomina) {
        this.tipoNomina = tipoNomina;
    }

    public String getNumComplem() {
        return numComplem;
    }

    public void setNumComplem(String numComplem) {
        this.numComplem = numComplem;
    }

    public Integer getRevisado() {
        return revisado;
    }

    public void setRevisado(Integer revisado) {
        this.revisado = revisado;
    }

    public boolean isCancel() {
        return cancel;
    }

    public void setCancel(boolean cancel) {
        this.cancel = cancel;
    }

    public boolean isMuestraRegistros() {
        return muestraRegistros;
    }

    public void setMuestraRegistros(boolean muestraRegistros) {
        this.muestraRegistros = muestraRegistros;
    }
    
    public void setCion(String cion) {
        this.seccion = cion;
    }

    public String getCion() {
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
}
