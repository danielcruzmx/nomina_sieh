package gob.shcp.sireh.model.clc.herramientas;

import gob.shcp.fsn.model.Model;

import gob.shcp.sireh.model.clc.EtiquetaClaveValorEntero;

import java.util.ArrayList;

public class BorraClcDTO implements java.io.Serializable, Model {

    private ArrayList<EtiquetaClaveValorEntero> cicloValores;
    
    private Integer cicloUnidad;
    private Integer qnaPago;
    private String tipoNomina;
    private String numComplem;
    private String situacion;
    private String estatus;
    
    private boolean cancel;
    private boolean muestraRegistros;
    private boolean borrarCLC;
    
    // Configuracion inicial
    private String seccion;
    private String beanName;
    
    // Navegacion
    private String urlOrigen;
    private String urlDestino;
    
    public void setCicloValores(ArrayList<EtiquetaClaveValorEntero> cicloValores) {
        this.cicloValores = cicloValores;
    }

    public ArrayList<EtiquetaClaveValorEntero> getCicloValores() {
        return cicloValores;
    }

    public void setCicloUnidad(Integer cicloUnidad) {
        this.cicloUnidad = cicloUnidad;
    }

    public Integer getCicloUnidad() {
        return cicloUnidad;
    }

    public void setQnaPago(Integer qnaPago) {
        this.qnaPago = qnaPago;
    }

    public Integer getQnaPago() {
        return qnaPago;
    }

    public void setTipoNomina(String tipoNomina) {
        this.tipoNomina = tipoNomina;
    }

    public String getTipoNomina() {
        return tipoNomina;
    }

    public void setNumComplem(String numComplem) {
        this.numComplem = numComplem;
    }

    public String getNumComplem() {
        return numComplem;
    }

    public void setSituacion(String situacion) {
        this.situacion = situacion;
    }

    public String getSituacion() {
        return situacion;
    }

    public void setEstatus(String estatus) {
        this.estatus = estatus;
    }

    public String getEstatus() {
        return estatus;
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

    public void setBorrarCLC(boolean borrarCLC) {
        this.borrarCLC = borrarCLC;
    }

    public boolean isBorrarCLC() {
        return borrarCLC;
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
