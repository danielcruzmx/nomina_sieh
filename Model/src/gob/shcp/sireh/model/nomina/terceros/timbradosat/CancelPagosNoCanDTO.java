package gob.shcp.sireh.model.nomina.terceros.timbradosat;

import gob.shcp.fsn.model.Model;

import java.io.Serializable;

public class CancelPagosNoCanDTO implements Serializable, Model {
    //Criterios busqueda
    private Integer hpFolio;
    private Integer qnaPago;
    private Integer qnaCaptura;
    private Integer complemento;
    private String tipoNomina;
    private String unidad;
    private String beanName;
    private String urlOrigen;
    private String urlDestino;
    private Integer hpConsecNomina;

    //Control
    private boolean buscar;
    private boolean limpiar;
    private boolean procesar;
    private boolean muestraRegistros;

    public void setQnaPago(Integer qnaPago) {
        this.qnaPago = qnaPago;
    }

    public Integer getQnaPago() {
        return qnaPago;
    }

    public void setComplemento(Integer complemento) {
        this.complemento = complemento;
    }

    public Integer getComplemento() {
        return complemento;
    }

    public void setTipoNomina(String tipoNomina) {
        this.tipoNomina = tipoNomina;
    }

    public String getTipoNomina() {
        return tipoNomina;
    }

    public void setUnidad(String unidad) {
        this.unidad = unidad;
    }

    public String getUnidad() {
        return unidad;
    }

    public void setBuscar(boolean buscar) {
        this.buscar = buscar;
    }

    public boolean isBuscar() {
        return buscar;
    }

    public void setLimpiar(boolean limpiar) {
        this.limpiar = limpiar;
    }

    public boolean isLimpiar() {
        return limpiar;
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

    public void setProcesar(boolean procesar) {
        this.procesar = procesar;
    }

    public boolean isProcesar() {
        return procesar;
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


    public void setQnaCaptura(Integer qnaCaptura) {
        this.qnaCaptura = qnaCaptura;
    }

    public Integer getQnaCaptura() {
        return qnaCaptura;
    }

    public void setHpConsecNomina(Integer hpConsecNomina) {
        this.hpConsecNomina = hpConsecNomina;
    }

    public Integer getHpConsecNomina() {
        return hpConsecNomina;
    }

    public void setHpFolio(Integer hpFolio) {
        this.hpFolio = hpFolio;
    }

    public Integer getHpFolio() {
        return hpFolio;
    }
}
