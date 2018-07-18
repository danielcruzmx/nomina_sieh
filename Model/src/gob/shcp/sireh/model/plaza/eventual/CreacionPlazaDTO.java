package gob.shcp.sireh.model.plaza.eventual;

import gob.shcp.fsn.model.Model;
import gob.shcp.sireh.model.plaza.TdPlazaDTO;

import java.util.Calendar;

import java.util.Date;

import org.apache.commons.lang.time.DateUtils;

import org.springmodules.validation.bean.conf.loader.annotation.handler.ValidationMethod;

public class CreacionPlazaDTO extends TdPlazaDTO implements java.io.Serializable, Model {
    
    // Filtros
    private java.lang.String uniCiclo;
    private java.lang.String idCiclo;
    private java.lang.String uniEdoCiclo;
    
    // Creacion
    private java.lang.String idUnidad;
    private java.lang.String idPuesto;
    private java.lang.Integer idEdo;
    private java.lang.Integer idMuni;
    private java.lang.Integer idZonaEco;
    private java.lang.String nivelFisico;
    private java.lang.Integer idRango;
    private java.lang.String nombramiento;
    private java.lang.String jerarquia;
    private double sueldo;
    private double compensacion;
    
    // Plaza Soporte
    private java.lang.String nivelFisicoSoporte;
    private java.lang.String nombramientoSoporte;
    private java.lang.String jerarquiaSoporte;
    private double sueldoSoporte;
    private double compensacionSoporte;
    private boolean checkPlazaSoporte;
    
    private String seccion;
    
    // Fechas de liberacion
    private java.util.Date inicioQuincenaCaptura;
    private java.util.Date finQuincenaCaptura;
    
    public String getUniCiclo() {
        return uniCiclo;
    }

    public void setUniCiclo(String uniCiclo) {
        this.uniCiclo = uniCiclo;
    }

    public String getIdCiclo() {
        return idCiclo;
    }

    public void setIdCiclo(String idCiclo) {
        this.idCiclo = idCiclo;
    }

    public String getIdUnidad() {
        return idUnidad;
    }

    public void setIdUnidad(String idUnidad) {
        this.idUnidad = idUnidad;
    }

    public String getIdPuesto() {
        return idPuesto;
    }

    public void setIdPuesto(String idPuesto) {
        this.idPuesto = idPuesto;
    }

    public Integer getIdEdo() {
        return idEdo;
    }

    public void setIdEdo(Integer idEdo) {
        this.idEdo = idEdo;
    }

    public Integer getIdMuni() {
        return idMuni;
    }

    public void setIdMuni(Integer idMuni) {
        this.idMuni = idMuni;
    }

    public Integer getIdZonaEco() {
        return idZonaEco;
    }

    public void setIdZonaEco(Integer idZonaEco) {
        this.idZonaEco = idZonaEco;
    }

    public String getNivelFisico() {
        return nivelFisico;
    }

    public void setNivelFisico(String nivelFisico) {
        this.nivelFisico = nivelFisico;
    }

    public Integer getIdRango() {
        return idRango;
    }

    public void setIdRango(Integer idRango) {
        this.idRango = idRango;
    }

    public String getNombramiento() {
        return nombramiento;
    }

    public void setNombramiento(String nombramiento) {
        this.nombramiento = nombramiento;
    }

    public String getJerarquia() {
        return jerarquia;
    }

    public void setJerarquia(String jerarquia) {
        this.jerarquia = jerarquia;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public double getCompensacion() {
        return compensacion;
    }

    public void setCompensacion(double compensacion) {
        this.compensacion = compensacion;
    }

    public String getNivelFisicoSoporte() {
        return nivelFisicoSoporte;
    }

    public void setNivelFisicoSoporte(String nivelFisicoSoporte) {
        this.nivelFisicoSoporte = nivelFisicoSoporte;
    }

    public String getNombramientoSoporte() {
        return nombramientoSoporte;
    }

    public void setNombramientoSoporte(String nombramientoSoporte) {
        this.nombramientoSoporte = nombramientoSoporte;
    }

    public String getJerarquiaSoporte() {
        return jerarquiaSoporte;
    }

    public void setJerarquiaSoporte(String jerarquiaSoporte) {
        this.jerarquiaSoporte = jerarquiaSoporte;
    }

    public double getSueldoSoporte() {
        return sueldoSoporte;
    }

    public void setSueldoSoporte(double sueldoSoporte) {
        this.sueldoSoporte = sueldoSoporte;
    }

    public double getCompensacionSoporte() {
        return compensacionSoporte;
    }

    public void setCompensacionSoporte(double compensacionSoporte) {
        this.compensacionSoporte = compensacionSoporte;
    }
    
    public void setCheckPlazaSoporte(boolean checkPlazaSoporte) {
        this.checkPlazaSoporte = checkPlazaSoporte;
    }

    public boolean isCheckPlazaSoporte() {
        return checkPlazaSoporte;
    }
    
    public void setSeccion(String seccion) {
        this.seccion = seccion;
    }

    public String getSeccion() {
        return seccion;
    }
    
    public void setUniEdoCiclo(String uniEdoCiclo) {
        this.uniEdoCiclo = uniEdoCiclo;
    }

    public String getUniEdoCiclo() {
        return uniEdoCiclo;
    }
    
    public void setInicioQuincenaCaptura(Date inicioQuincenaCaptura) {
        this.inicioQuincenaCaptura = inicioQuincenaCaptura;
    }

    public Date getInicioQuincenaCaptura() {
        return inicioQuincenaCaptura;
    }

    public void setFinQuincenaCaptura(Date finQuincenaCaptura) {
        this.finQuincenaCaptura = finQuincenaCaptura;
    }

    public Date getFinQuincenaCaptura() {
        return finQuincenaCaptura;
    }
    
    /* V A L I D A C I O N E S */
    @ValidationMethod(forProperty="idUnidad", errorCode="error.select.unspecified")
    public boolean validateIdUnidad(){
        return  this.getIdUnidad() != null && !this.getIdUnidad().equals("") && !this.getIdUnidad().equals("0");
    }
    
    @ValidationMethod(forProperty="idPuesto", errorCode="error.select.unspecified")
    public boolean validateIdPuesto(){
        return  this.getIdPuesto() != null && !this.getIdPuesto().equals("") && !this.getIdPuesto().equals("0");
    }
    
    @ValidationMethod(forProperty="idEdo", errorCode="error.select.unspecified")
    public boolean validateIdEdo(){
        return  this.getIdEdo() != null && this.getIdEdo() != 0;
    }
    
    @ValidationMethod(forProperty="idMuni", errorCode="error.select.unspecified")
    public boolean validateIdMuni(){
        return  this.getIdMuni() != null && this.getIdMuni() != 0;
    }
    
    @ValidationMethod(forProperty="plazaIniCont", errorCode="fecha.invalida.not.blank")
    public boolean validatePlazaIniCont(){
        return this.getPlazaIniCont() != null;
    }
    
    @ValidationMethod(forProperty="plazaFinCont", errorCode="fecha.invalida.not.blank")
    public boolean validatePlazaFinCont(){
        return this.getPlazaFinCont() != null;
    }
    
    @ValidationMethod(forProperty="idZonaEco", errorCode="error.select.unspecified")
    public boolean validateIdZonaEco() {
        return this.getIdZonaEco() != null  && this.getIdZonaEco() != 0;
    }
    
    @ValidationMethod(forProperty="idServPub", errorCode="error.select.unspecified")
    public boolean validateIdServPub(){
        return this.getIdServPub() != null && !this.getIdServPub().equals("") && !this.getIdServPub().equals("0");
    }
    
    // fechaInicioVigencia < Quincena de captura
    @ValidationMethod(forProperty = "plazaIniCont", errorCode = "fecha.invalida.quincena")
    private boolean validateFechaInicioVigenciaVsQuincena() {
        if (DateUtils.truncate(this.getPlazaIniCont(), Calendar.DATE).after(DateUtils.truncate(this.getFinQuincenaCaptura(), Calendar.DATE))) {
            return false;
        }
        return true;
    }
}
