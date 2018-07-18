package gob.shcp.sireh.model.nomina.terceros.aportaciones;

import gob.shcp.fsn.model.Model;
import gob.shcp.sireh.model.clc.EtiquetaClaveValorEntero;

import java.util.ArrayList;

public class ArchivoIntSARTercerosDTO implements java.io.Serializable, Model {

    private String beanName;
    private String urlOrigen;
    private String urlDestino;
    
    private boolean generaArchivo;
    private boolean cancel;
    private boolean muestraRegistros;

    private Integer ciclo;
    private Integer bimestre;
    private ArrayList<EtiquetaClaveValorEntero> bimestresValores;
    private String versionArchivo;
    private String tipoArchivo;
    
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

    public void setGeneraArchivo(boolean generaArchivo) {
        this.generaArchivo = generaArchivo;
    }

    public boolean isGeneraArchivo() {
        return generaArchivo;
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

    public void setCiclo(Integer ciclo) {
        this.ciclo = ciclo;
    }

    public Integer getCiclo() {
        return ciclo;
    }

    public void setBimestre(Integer bimestre) {
        this.bimestre = bimestre;
    }

    public Integer getBimestre() {
        return bimestre;
    }

    public void setBimestresValores(ArrayList<EtiquetaClaveValorEntero> bimestresValores) {
        this.bimestresValores = bimestresValores;
    }

    public ArrayList<EtiquetaClaveValorEntero> getBimestresValores() {
        return bimestresValores;
    }

    public void setVersionArchivo(String versionArchivo) {
        this.versionArchivo = versionArchivo;
    }

    public String getVersionArchivo() {
        return versionArchivo;
    }

    public void setTipoArchivo(String tipoArchivo) {
        this.tipoArchivo = tipoArchivo;
    }

    public String getTipoArchivo() {
        return tipoArchivo;
    }
}
