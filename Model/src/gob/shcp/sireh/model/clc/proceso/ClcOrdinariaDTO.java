package gob.shcp.sireh.model.clc.proceso;

import gob.shcp.fsn.model.Model;

import gob.shcp.sireh.model.clc.EtiquetaClaveValorEntero;

import java.util.ArrayList;

public class ClcOrdinariaDTO implements java.io.Serializable, Model {
   
    private ArrayList<EtiquetaClaveValorEntero> cicloValores;
    
    private Integer cicloUnidad;
    private Integer qnaPago;
    private String tipoNomina;
    private String numComplem;
    
    private java.lang.Double liquido;
    private java.lang.Double deducciones;
    private java.lang.Double devoluciones;
    
    private boolean cancel;
    private boolean muestraErrores;
    
    public ArrayList<EtiquetaClaveValorEntero> getCicloValores() {
        return cicloValores;
    }

    public void setCicloValores(ArrayList<EtiquetaClaveValorEntero> cicloValores) {
        this.cicloValores = cicloValores;
    }
    
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

    public Double getLiquido() {
        return liquido;
    }

    public void setLiquido(Double liquido) {
        this.liquido = liquido;
    }

    public Double getDeducciones() {
        return deducciones;
    }

    public void setDeducciones(Double deducciones) {
        this.deducciones = deducciones;
    }

    public Double getDevoluciones() {
        return devoluciones;
    }

    public void setDevoluciones(Double devoluciones) {
        this.devoluciones = devoluciones;
    }

    public boolean isCancel() {
        return cancel;
    }

    public void setCancel(boolean cancel) {
        this.cancel = cancel;
    }

    public boolean isMuestraErrores() {
        return muestraErrores;
    }

    public void setMuestraErrores(boolean muestraErrores) {
        this.muestraErrores = muestraErrores;
    }
}
