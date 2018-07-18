package gob.shcp.sireh.model.nomina.terceros;

import gob.shcp.fsn.model.Model;

public class SericaDTO implements java.io.Serializable, Model{ 
    // Datos  
    private Integer qnaIni;
    private Integer ciclo;
    private Integer complemento;
    private String tiponom;
    private String nomIni;
    private String mes;
    private String nominaQuincenal;
    private String parametro1;
    private String tipoNomIni;
    private String gpoPagoIni;
    private Integer numCompIni;
    private String fechaIni;

    private String[] seleccion;
    
    // Configuracion inicial
    private String seccion;
    private String beanName;
    
    // Navegacion
    private String urlOrigen;
    private String urlDestino;
    private boolean muestraRegistros; 
    private boolean cancel;
    private boolean aceptar;
    private boolean limpiar;
    private boolean buscar;

    public void setQnaIni(Integer qnaIni) {
        this.qnaIni = qnaIni;
    }

    public Integer getQnaIni() {
        return qnaIni;
    }

    public void setCiclo(Integer ciclo) {
        this.ciclo = ciclo;
    }

    public Integer getCiclo() {
        return ciclo;
    }

    public void setComplemento(Integer complemento) {
        this.complemento = complemento;
    }

    public Integer getComplemento() {
        return complemento;
    }

    public void setTiponom(String tiponom) {
        this.tiponom = tiponom;
    }

    public String getTiponom() {
        return tiponom;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public String getMes() {
        return mes;
    }

    public void setNominaQuincenal(String nominaQuincenal) {
        this.nominaQuincenal = nominaQuincenal;
    }

    public String getNominaQuincenal() {
        return nominaQuincenal;
    }

    public void setParametro1(String parametro1) {
        this.parametro1 = parametro1;
    }

    public String getParametro1() {
        return parametro1;
    }

    public void setSeleccion(String[] seleccion) {
        this.seleccion = seleccion;
    }

    public String[] getSeleccion() {
        return seleccion;
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

    public void setAceptar(boolean aceptar) {
        this.aceptar = aceptar;
    }

    public boolean isAceptar() {
        return aceptar;
    }

    public void setLimpiar(boolean limpiar) {
        this.limpiar = limpiar;
    }

    public boolean isLimpiar() {
        return limpiar;
    }

    public void setBuscar(boolean buscar) {
        this.buscar = buscar;
    }

    public boolean isBuscar() {
        return buscar;
    }

    public void setNomIni(String nomIni) {
        this.nomIni = nomIni;
    }

    public String getNomIni() {
        return nomIni;
    }

    public void setTipoNomIni(String tipoNomIni) {
        this.tipoNomIni = tipoNomIni;
    }

    public String getTipoNomIni() {
        return tipoNomIni;
    }

    public void setGpoPagoIni(String gpoPagoIni) {
        this.gpoPagoIni = gpoPagoIni;
    }

    public String getGpoPagoIni() {
        return gpoPagoIni;
    }

    public void setNumCompIni(Integer numCompIni) {
        this.numCompIni = numCompIni;
    }

    public Integer getNumCompIni() {
        return numCompIni;
    }

    public void setFechaIni(String fechaIni) {
        this.fechaIni = fechaIni;
    }

    public String getFechaIni() {
        return fechaIni;
    }
}
