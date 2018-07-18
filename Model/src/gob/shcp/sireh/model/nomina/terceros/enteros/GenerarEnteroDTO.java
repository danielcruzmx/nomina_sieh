package gob.shcp.sireh.model.nomina.terceros.enteros;

import gob.shcp.fsn.model.Model;

import java.util.List;

public class GenerarEnteroDTO  implements java.io.Serializable, Model{  
    public GenerarEnteroDTO() {
    }
    
   private String  qnaPago;
   private String  tipoNomina;
   private String tercero;
   private String complemento;
   private String[] checkComplemento;
    private List  listaComplemento;
   private List  listaProceso;
   private String  totalEntero;
   private String  ImporteEntero;
   private String  totalRecuperacion;
   private String  importeRecuperacion;
    private Integer  totalRegistros;


    public void setQnaPago(String qnaPago) {
        this.qnaPago = qnaPago;
    }

    public String getQnaPago() {
        return qnaPago;
    }

    public void setTipoNomina(String tipoNomina) {
        this.tipoNomina = tipoNomina;
    }

    public String getTipoNomina() {
        return tipoNomina;
    }

    public void setTercero(String tercero) {
        this.tercero = tercero;
    }

    public String getTercero() {
        return tercero;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setCheckComplemento(String[] checkComplemento) {
        this.checkComplemento = checkComplemento;
    }

    public String[] getCheckComplemento() {
        return checkComplemento;
    }

    public void setListaComplemento(List listaComplemento) {
        this.listaComplemento = listaComplemento;
    }

    public List getListaComplemento() {
        return listaComplemento;
    }

    public void setListaProceso(List listaProceso) {
        this.listaProceso = listaProceso;
    }

    public List getListaProceso() {
        return listaProceso;
    }

    public void setTotalEntero(String totalEntero) {
        this.totalEntero = totalEntero;
    }

    public String getTotalEntero() {
        return totalEntero;
    }

    public void setImporteEntero(String importeEntero) {
        this.ImporteEntero = importeEntero;
    }

    public String getImporteEntero() {
        return ImporteEntero;
    }

    public void setTotalRecuperacion(String totalRecuperacion) {
        this.totalRecuperacion = totalRecuperacion;
    }

    public String getTotalRecuperacion() {
        return totalRecuperacion;
    }

    public void setImporteRecuperacion(String importeRecuperacion) {
        this.importeRecuperacion = importeRecuperacion;
    }

    public String getImporteRecuperacion() {
        return importeRecuperacion;
    }

    public void setTotalRegistros(Integer totalRegistros) {
        this.totalRegistros = totalRegistros;
    }

    public Integer getTotalRegistros() {
        return totalRegistros;
    }
}
