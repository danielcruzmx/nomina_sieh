package gob.shcp.sireh.model.nomina.terceros.enteros;

import gob.shcp.fsn.model.Model;


import gob.shcp.sireh.model.nomina.terceros.DatosArchivoDTO;

import java.util.List;


public class GeneraArchivoTercerosDTO  implements java.io.Serializable, Model{ 

    private String rfc;
    private String curp;
    private Double importe;
    private String concepto;
    private String tipoEntero;
    
    private String idTercero;
    private String descTercero;
    private boolean procesar;
    private boolean cancel;
    private String urlOrigen;
    private String urlDestino;
    
    private String cadena;
    
    private List<DatosArchivoDTO> lista ;


    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    public String getRfc() {
        return rfc;
    }

    public void setCurp(String curp) {
        this.curp = curp;
    }

    public String getCurp() {
        return curp;
    }

    public void setImporte(Double importe) {
        this.importe = importe;
    }

    public Double getImporte() {
        return importe;
    }

    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }

    public String getConcepto() {
        return concepto;
    }

    public void setIdTercero(String idTercero) {
        this.idTercero = idTercero;
    }

    public String getIdTercero() {
        return idTercero;
    }

    public void setDescTercero(String descTercero) {
        this.descTercero = descTercero;
    }

    public String getDescTercero() {
        return descTercero;
    }

    public void setProcesar(boolean procesar) {
        this.procesar = procesar;
    }

    public boolean isProcesar() {
        return procesar;
    }

    public void setCancel(boolean cancel) {
        this.cancel = cancel;
    }

    public boolean isCancel() {
        return cancel;
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

    public void setCadena(String cadena) {
        this.cadena = cadena;
    }

    public String getCadena() {
        return cadena;
    }

    public void setLista(List<DatosArchivoDTO> lista) {
        this.lista = lista;
    }

    public List<DatosArchivoDTO> getLista() {
        return lista;
    }

    public void setTipoEntero(String tipoEntero) {
        this.tipoEntero = tipoEntero;
    }

    public String getTipoEntero() {
        return tipoEntero;
    }
}
