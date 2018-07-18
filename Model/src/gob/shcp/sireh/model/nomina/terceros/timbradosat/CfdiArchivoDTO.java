package gob.shcp.sireh.model.nomina.terceros.timbradosat;

import gob.shcp.fsn.model.Model;

import java.io.Serializable;

import org.springmodules.validation.bean.conf.loader.annotation.handler.ValidationMethod;

public class CfdiArchivoDTO implements Serializable, Model{
    //Criterios busqueda
    private Integer qnaPago;
    private Integer qnaCaptura;
    private String complemento;
    private Integer hpConsecNomina;
    private String  tipoNomina;
    private String  unidad;
    private String  beanName;
    private String  urlOrigen;
    private String  urlDestino;
    private String[] idGrupo;
    
    //buaqueda por usuario
    private Integer qnaIniEmpl;
    private Integer qnaFinEmpl;
    private String  rfcEmpleado;
     
    //Comprobante
    private Integer idComprobante;
    private Integer idPaquete;
    
    //Empleado
    private String rfc;
    private String nombre;
    private String nivel;
    
    
    //Control
    private boolean buscar;
    private boolean limpiar;
    private boolean procesar;
    private boolean muestraRegistros;
    public CfdiArchivoDTO() {
    }


    public void setQnaPago(Integer qnaPago) {
        this.qnaPago = qnaPago;
    }

    public Integer getQnaPago() {
        return qnaPago;
    }

    public void setQnaCaptura(Integer qnaCaptura) {
        this.qnaCaptura = qnaCaptura;
    }

    public Integer getQnaCaptura() {
        return qnaCaptura;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getComplemento() {
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

    public void setIdGrupo(String[] idGrupo) {
        this.idGrupo = idGrupo;
    }

    public String[] getIdGrupo() {
        return idGrupo;
    }

    public void setQnaIniEmpl(Integer qnaIniEmpl) {
        this.qnaIniEmpl = qnaIniEmpl;
    }

    public Integer getQnaIniEmpl() {
        return qnaIniEmpl;
    }

    public void setQnaFinEmpl(Integer qnaFinEmpl) {
        this.qnaFinEmpl = qnaFinEmpl;
    }

    public Integer getQnaFinEmpl() {
        return qnaFinEmpl;
    }

    public void setRfcEmpleado(String rfcEmpleado) {
        this.rfcEmpleado = rfcEmpleado;
    }

    public String getRfcEmpleado() {
        return rfcEmpleado;
    }

    public void setIdComprobante(Integer idComprobante) {
        this.idComprobante = idComprobante;
    }

    public Integer getIdComprobante() {
        return idComprobante;
    }

    public void setIdPaquete(Integer idPaquete) {
        this.idPaquete = idPaquete;
    }

    public Integer getIdPaquete() {
        return idPaquete;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    public String getRfc() {
        return rfc;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public String getNivel() {
        return nivel;
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

    public void setProcesar(boolean procesar) {
        this.procesar = procesar;
    }

    public boolean isProcesar() {
        return procesar;
    }

    public void setMuestraRegistros(boolean muestraRegistros) {
        this.muestraRegistros = muestraRegistros;
    }

    public boolean isMuestraRegistros() {
        return muestraRegistros;
    }

    
    @ValidationMethod(forProperty="qnaPago", errorCode="error.select.unspecified")
    public boolean validateQnaPago(){
        if ( this.isBuscar()) {
            return  this.getQnaPago() != null && this.getQnaPago().compareTo(0) != 0 ;
        }  
        return true;
    }
    
    @ValidationMethod(forProperty="hpConsecNomina", errorCode="error.select.unspecified")
    public boolean validateHpConsecNomina(){
        if ( this.isBuscar()) {
            return  this.getHpConsecNomina() != null;
        }  
        return true;
    }
    
    @ValidationMethod(forProperty="tipoNomina", errorCode="error.select.unspecified")
    public boolean validateTipoNomina(){
        if ( this.isBuscar()) {
            return  this.getTipoNomina() != null && !this.getTipoNomina().equals("0") ;
        }  
        return true;
    }

    public void setHpConsecNomina(Integer hpConsecNomina) {
        this.hpConsecNomina = hpConsecNomina;
    }

    public Integer getHpConsecNomina() {
        return hpConsecNomina;
    }
}
