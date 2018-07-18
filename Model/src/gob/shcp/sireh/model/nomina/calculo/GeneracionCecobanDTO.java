package gob.shcp.sireh.model.nomina.calculo;

import gob.shcp.fsn.model.Model;

import gob.shcp.sireh.model.SelectIntegerStringDTO;

import java.util.ArrayList;

import java.util.Date;
import java.util.List;

import org.springmodules.validation.bean.conf.loader.annotation.handler.ValidationMethod;

public class GeneracionCecobanDTO implements java.io.Serializable, Model {

    private java.lang.Integer rcQnaCaptura;
    List<SelectIntegerStringDTO> listaQuincenas = new ArrayList<SelectIntegerStringDTO>();
    
    private java.lang.String hpNumComplem;
    private java.lang.Integer numArchivo;
    private java.util.Date fecTransferencia;
    private java.util.Date fecPresentacion;
    private List<SelectIntegerStringDTO> listaNumArchivo = new ArrayList<SelectIntegerStringDTO>();
    private java.lang.String idTipoNomina;
    private java.lang.String nombreArchivo;
    private java.lang.String rutaArchivo;
    private java.lang.String nombreArchivoUser;
    private java.lang.Boolean isGenerar;
    
    
    private java.lang.Integer numeroCasos;
    private java.lang.String monto;
    // Filtro
    private java.lang.Integer filterRcQnaCaptura;
    

    public GeneracionCecobanDTO() {
    }

    public void setRcQnaCaptura(Integer rcQnaCaptura) {
        this.rcQnaCaptura = rcQnaCaptura;
    }

    public Integer getRcQnaCaptura() {
        return rcQnaCaptura;
    }

    public void setHpNumComplem(String hpNumComplem) {
        this.hpNumComplem = hpNumComplem;
    }

    public String getHpNumComplem() {
        return hpNumComplem;
    }

    public void setNumArchivo(Integer numArchivo) {
        this.numArchivo = numArchivo;
    }

    public Integer getNumArchivo() {
        return numArchivo;
    }

    public void setListaNumArchivo(List<SelectIntegerStringDTO> listaNumArchivo) {
        this.listaNumArchivo = listaNumArchivo;
    }

    public List<SelectIntegerStringDTO> getListaNumArchivo() {
        return listaNumArchivo;
    }

    public void setFilterRcQnaCaptura(Integer filterRcQnaCaptura) {
        this.filterRcQnaCaptura = filterRcQnaCaptura;
    }

    public Integer getFilterRcQnaCaptura() {
        return filterRcQnaCaptura;
    }

    public void setIdTipoNomina(String idTipoNomina) {
        this.idTipoNomina = idTipoNomina;
    }

    public String getIdTipoNomina() {
        return idTipoNomina;
    }

    public void setFecTransferencia(Date fecTransferencia) {
        this.fecTransferencia = fecTransferencia;
    }

    public Date getFecTransferencia() {
        return fecTransferencia;
    }

    public void setFecPresentacion(Date fecPresentacion) {
        this.fecPresentacion = fecPresentacion;
    }

    public Date getFecPresentacion() {
        return fecPresentacion;
    }

    public void setListaQuincenas(List<SelectIntegerStringDTO> listaQuincenas) {
        this.listaQuincenas = listaQuincenas;
    }

    public List<SelectIntegerStringDTO> getListaQuincenas() {
        return listaQuincenas;
    }

    public void setNumeroCasos(Integer numeroCasos) {
        this.numeroCasos = numeroCasos;
    }

    public Integer getNumeroCasos() {
        return numeroCasos;
    }

    public void setMonto(String monto) {
        this.monto = monto;
    }

    public String getMonto() {
        return monto;
    }
    
    @ValidationMethod(forProperty="hpNumComplem", errorCode="error.select.unspecified", applyIf="isGenerar=true")
    public boolean validateHpNumComplem(){
        return this.getHpNumComplem() != null && !this.getHpNumComplem().equals("-1");
    }
    
    @ValidationMethod(forProperty="numArchivo", errorCode="error.select.unspecified", applyIf="isGenerar=true")
    public boolean validateNumArchivo(){
        return this.getNumArchivo() != null && !this.getNumArchivo().equals(0);
    }
    
    @ValidationMethod(forProperty="idTipoNomina", errorCode="error.select.unspecified", applyIf="isGenerar=true")
    public boolean validateIdTipoNomina(){
        return this.getIdTipoNomina() != null && !this.getIdTipoNomina().equals("0");
    }
    
    @ValidationMethod(forProperty="fecTransferencia", errorCode="not.null", applyIf="isGenerar=true")
    public boolean validateFecTransferencia(){
        return this.getFecTransferencia() != null;
    }
    
    @ValidationMethod(forProperty="fecPresentacion", errorCode="not.null", applyIf="isGenerar=true")
    public boolean validateFecPresentacion(){
        return this.getFecPresentacion() != null;
    }

    public void setNombreArchivo(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
    }

    public String getNombreArchivo() {
        return nombreArchivo;
    }

    public void setRutaArchivo(String rutaArchivo) {
        this.rutaArchivo = rutaArchivo;
    }

    public String getRutaArchivo() {
        return rutaArchivo;
    }

    public void setNombreArchivoUser(String nombreArchivoUser) {
        this.nombreArchivoUser = nombreArchivoUser;
    }

    public String getNombreArchivoUser() {
        return nombreArchivoUser;
    }

    public void setIsGenerar(Boolean isGenerar) {
        this.isGenerar = isGenerar;
    }

    public Boolean getIsGenerar() {
        return isGenerar;
    }
}
