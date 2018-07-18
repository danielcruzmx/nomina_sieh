package gob.shcp.sireh.model.nomina.terceros.aportaciones;

import gob.shcp.fsn.model.Model;

import gob.shcp.sireh.model.clc.EtiquetaClaveValorEntero;

import java.util.ArrayList;
import java.util.List;

import org.springmodules.validation.bean.conf.loader.annotation.handler.ValidationMethod;

public class ProcesaPeriodoSARTercerosDTO implements java.io.Serializable, Model {

    private String beanName;
    private String urlOrigen;
    private String urlDestino;
    
    private boolean cancel;
    private boolean muestraRegistros;
    
    private Integer ciclo;
    private Integer bimestre;
    private List<String> tipoNomina;
    private ArrayList<EtiquetaClaveValorEntero> bimestresValores;
    
    private List<Integer> quincenas;
    private Integer[] idGrupo;
    private boolean procesar;
    private boolean reporte;
    
    public String getBeanName() {
        return beanName;
    }

    public void setBeanName(String beanName) {
        this.beanName = beanName;
    }

    public String getUrlOrigen() {
        return urlOrigen;
    }

    public void setUrlOrigen(String urlOrigen) {
        this.urlOrigen = urlOrigen;
    }

    public String getUrlDestino() {
        return urlDestino;
    }

    public void setUrlDestino(String urlDestino) {
        this.urlDestino = urlDestino;
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
    
    public Integer getCiclo() {
        return ciclo;
    }

    public void setCiclo(Integer ciclo) {
        this.ciclo = ciclo;
    }

    public Integer getBimestre() {
        return bimestre;
    }

    public void setBimestre(Integer bimestre) {
        this.bimestre = bimestre;
    }

    public List<String> getTipoNomina() {
        return tipoNomina;
    }

    public void setTipoNomina(List<String> tipoNomina) {
        this.tipoNomina = tipoNomina;
    }
    
    public void setBimestresValores(ArrayList<EtiquetaClaveValorEntero> bimestresValores) {
        this.bimestresValores = bimestresValores;
    }

    public ArrayList<EtiquetaClaveValorEntero> getBimestresValores() {
        return bimestresValores;
    }
    
    public List<Integer> getQuincenas() {
        return quincenas;
    }

    public void setQuincenas(List<Integer> quincenas) {
        this.quincenas = quincenas;
    }
    
    public Integer[] getIdGrupo() {
        return idGrupo;
    }

    public void setIdGrupo(Integer[] idGrupo) {
        this.idGrupo = idGrupo;
    }
    
    public void setProcesar(boolean procesar) {
        this.procesar = procesar;
    }

    public boolean isProcesar() {
        return procesar;
    }
    
    public void setReporte(boolean reporte) {
        this.reporte = reporte;
    }

    public boolean isReporte() {
        return reporte;
    }
    
    /* V A L I D A C I O N E S */
    @ValidationMethod(forProperty="idGrupo", errorCode="[error.procesar.nomina.unselected")
    private boolean validateIdGrupo() {
        if(this.isProcesar()) {
            return (this.getIdGrupo() != null && this.getIdGrupo().length > 0);
        }
        return true;
    }
}
