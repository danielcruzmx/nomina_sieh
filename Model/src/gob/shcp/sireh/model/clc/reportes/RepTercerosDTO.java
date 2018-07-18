package gob.shcp.sireh.model.clc.reportes;

import gob.shcp.fsn.model.Model;

import java.text.SimpleDateFormat;

import java.util.Date;
import java.util.Locale;

public class RepTercerosDTO implements java.io.Serializable, Model {
   
    private SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MMM/yyyy", new Locale("es","MX") );
    
    // Datos  
    private Integer qnaIni;
    private Integer ciclo;
    private Integer complemento;
    private String tiponom;
    private String origen;
    private String nombreArchivo;
    private String unidad;
    private String documento;
    private String numeroSolicitud;
    private String mes;
    private Date fechaBanco;
    private Date fechaPago;
    private String periodo;
    private String responsable;
    private String puestoCargo;
    private String nominaQuincenal;
    private String parametro1;

    private String[] seleccionQuincenal;
    private String[] seleccionMensual;
    private String[] seleccionBimestral;
    
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

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getOrigen() {
        return origen;
    }

    public void setNombreArchivo(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
    }

    public String getNombreArchivo() {
        return nombreArchivo;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getDocumento() {
        return documento;
    }

    public void setNumeroSolicitud(String numeroSolicitud) {
        this.numeroSolicitud = numeroSolicitud;
    }

    public String getNumeroSolicitud() {
        return numeroSolicitud;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public String getMes() {
        return mes;
    }

    public void setFechaBanco(Date fechaBanco) {
        this.fechaBanco = fechaBanco;
    }

    public Date getFechaBanco() {
        return fechaBanco;
    }
    
    public String getFechaBancoCad() {
        return fechaBanco==null? "": dateFormat.format(fechaBanco);
    }

    public String getFechaPagoCad() {
        return fechaBanco==null? "": dateFormat.format(fechaPago);
    }

    public void setFechaPago(Date fechaPago) {
        this.fechaPago = fechaPago;
    }

    public Date getFechaPago() {
        return fechaPago;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setResponsable(String responsable) {
        this.responsable = responsable;
    }

    public String getResponsable() {
        return responsable;
    }

    public void setPuestoCargo(String puestoCargo) {
        this.puestoCargo = puestoCargo;
    }

    public String getPuestoCargo() {
        return puestoCargo;
    }

    public void setUnidad(String unidad) {
        this.unidad = unidad;
    }

    public String getUnidad() {
        return unidad;
    }

    public void setNominaQuincenal(String nominaQuincenal) {
        this.nominaQuincenal = nominaQuincenal;
    }

    public String getNominaQuincenal() {
        return nominaQuincenal;
    }

    public void setSeleccionQuincenal(String[] seleccionQuincenal) {
        this.seleccionQuincenal = seleccionQuincenal;
    }

    public String[] getSeleccionQuincenal() {
        return seleccionQuincenal;
    }

    public void setSeleccionMensual(String[] seleccionMensual) {
        this.seleccionMensual = seleccionMensual;
    }

    public String[] getSeleccionMensual() {
        return seleccionMensual;
    }

    public void setSeleccionBimestral(String[] seleccionBimestral) {
        this.seleccionBimestral = seleccionBimestral;
    }

    public String[] getSeleccionBimestral() {
        return seleccionBimestral;
    }

    public void setParametro1(String parametro1) {
        this.parametro1 = parametro1;
    }

    public String getParametro1() {
        return parametro1;
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

}
