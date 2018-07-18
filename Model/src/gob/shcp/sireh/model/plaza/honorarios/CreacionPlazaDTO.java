package gob.shcp.sireh.model.plaza.honorarios;

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
    private java.lang.Integer uniEdoCiclo;

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
    private double importeHonorario;
    private String importeHonorarioString;
    
    // Fechas de liberacion
    private java.util.Date inicioQuincenaCaptura;
    private java.util.Date finQuincenaCaptura;
    
    public void setUniCiclo(String uniCiclo) {
        this.uniCiclo = uniCiclo;
    }

    public String getUniCiclo() {
        return uniCiclo;
    }

    public void setIdCiclo(String idCiclo) {
        this.idCiclo = idCiclo;
    }

    public String getIdCiclo() {
        return idCiclo;
    }
    
    public Integer getUniEdoCiclo() {
        return uniEdoCiclo;
    }

    public void setUniEdoCiclo(Integer uniEdoCiclo) {
        this.uniEdoCiclo = uniEdoCiclo;
    }

    public void setIdUnidad(String idUnidad) {
        this.idUnidad = idUnidad;
    }

    public String getIdUnidad() {
        return idUnidad;
    }

    public void setIdPuesto(String idPuesto) {
        this.idPuesto = idPuesto;
    }

    public String getIdPuesto() {
        return idPuesto;
    }

    public void setIdEdo(Integer idEdo) {
        this.idEdo = idEdo;
    }

    public Integer getIdEdo() {
        return idEdo;
    }

    public void setIdMuni(Integer idMuni) {
        this.idMuni = idMuni;
    }

    public Integer getIdMuni() {
        return idMuni;
    }

    public void setIdZonaEco(Integer idZonaEco) {
        this.idZonaEco = idZonaEco;
    }

    public Integer getIdZonaEco() {
        return idZonaEco;
    }

    public void setNivelFisico(String nivelFisico) {
        this.nivelFisico = nivelFisico;
    }

    public String getNivelFisico() {
        return nivelFisico;
    }

    public void setIdRango(Integer idRango) {
        this.idRango = idRango;
    }

    public Integer getIdRango() {
        return idRango;
    }

    public void setNombramiento(String nombramiento) {
        this.nombramiento = nombramiento;
    }

    public String getNombramiento() {
        return nombramiento;
    }

    public void setJerarquia(String jerarquia) {
        this.jerarquia = jerarquia;
    }

    public String getJerarquia() {
        return jerarquia;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setCompensacion(double compensacion) {
        this.compensacion = compensacion;
    }

    public double getCompensacion() {
        return compensacion;
    }
    
    public void setImporteHonorario(double importeHonorario) {
        this.importeHonorario = importeHonorario;
    }

    public double getImporteHonorario() {
        return importeHonorario;
    }
    
    public void setImporteHonorarioString(String importeHonorarioString) {
        this.importeHonorarioString = importeHonorarioString;
    }

    public String getImporteHonorarioString() {
        return importeHonorarioString;
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
    public boolean validateIdUnidad() {
        return this.getIdUnidad() != null && !this.getIdUnidad().equals("") && !this.getIdUnidad().equals("0");
    }
    
    @ValidationMethod(forProperty="idPuesto", errorCode="error.select.unspecified")
    public boolean validateIdPuesto() {
        return this.getIdPuesto() != null && !this.getIdPuesto().equals("") && !this.getIdPuesto().equals("0");
    }
    
    @ValidationMethod(forProperty="idEdo", errorCode="error.select.unspecified")
    public boolean validateIdEdo() {
        return this.getIdEdo() != null && this.getIdEdo() != 0;
    }
    
    @ValidationMethod(forProperty="idMuni", errorCode="error.select.unspecified")
    public boolean validateIdMuni() {
        return this.getIdMuni() != null && this.getIdMuni() != 0;
    }
    
    @ValidationMethod(forProperty="plazaIniCont", errorCode="fecha.invalida.not.blank")
    public boolean validatePlazaIniCont() {
        return this.getPlazaIniCont() != null;
    }
    
    @ValidationMethod(forProperty="plazaFinCont", errorCode="fecha.invalida.not.blank")
    public boolean validatePlazaFinCont() {
        return this.getPlazaFinCont() != null;
    }

    @ValidationMethod(forProperty = "idZonaEco", errorCode = "error.select.unspecified")
    public boolean validateIdZonaEco() {
        return this.getIdZonaEco() != null && this.getIdZonaEco() != 0;
    }

    @ValidationMethod(forProperty = "importeHonorarioString", errorCode = "not.blank")
    public boolean validateImporteHonorario() {
        return this.getImporteHonorarioString() != null && !this.getImporteHonorarioString().equals("");
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
