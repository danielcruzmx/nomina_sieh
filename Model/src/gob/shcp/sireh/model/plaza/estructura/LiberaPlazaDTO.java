package gob.shcp.sireh.model.plaza.estructura;

import gob.shcp.fsn.model.Model;
import gob.shcp.sireh.model.plaza.TdPlazaDTO;

import java.util.Calendar;
import java.util.Date;

import org.apache.commons.lang.time.DateUtils;

import org.springmodules.validation.bean.conf.loader.annotation.handler.ValidationMethod;

public class LiberaPlazaDTO extends TdPlazaDTO implements java.io.Serializable, Model {
    
    private boolean datosFisicos;
    private boolean datosPresupuestales;
    
    // Filtros
    private java.lang.String uniCiclo;
    private java.lang.String idCiclo;
    private java.lang.String idPtoOrigen;
    
    // Liberacion
    private java.lang.String idUnidad;
    private java.lang.Integer idEdo;
    private java.lang.Integer idMuni;
    private java.lang.Integer idZonaEco;
    private java.lang.String idPuesto;
    private java.lang.String idSitPlazaDestino;
    private java.lang.String nivelFisico;
    private java.lang.Integer idRango;
    private java.lang.String nombramiento;
    private double sueldo;
    private double compensacion;
    private boolean checkFechaTermino;
    private Integer radioAutorizacion;
    
    // Etiquetas
    private java.lang.String idUnidadLabel;
    private java.lang.Integer idEdoLabel;
    private java.lang.Integer idMuniLabel;
    private java.lang.Integer idZonaEcoLabel;
    private java.lang.String idPuestoLabel;
    private java.lang.String nivelFisicoLabel;
    private java.lang.Integer idRangoLabel;
    private java.lang.String nombramientoLabel;
    private java.lang.String sueldoLabel;
    private java.lang.String compensacionLabel;
    private java.lang.String idVacanciaLabel;
    private java.lang.Integer idVacanciaAux;
    
    //beanNames
    private String beanNamePuesto;
    
    // Fechas de liberacion
    private java.util.Date inicioQuincenaCaptura;
    private java.util.Date finQuincenaCaptura;
    
    public boolean isDatosFisicos() {
        return datosFisicos;
    }

    public void setDatosFisicos(boolean datosFisicos) {
        this.datosFisicos = datosFisicos;
    }

    public boolean isDatosPresupuestales() {
        return datosPresupuestales;
    }

    public void setDatosPresupuestales(boolean datosPresupuestales) {
        this.datosPresupuestales = datosPresupuestales;
    }

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

    public String getIdPuesto() {
        return idPuesto;
    }

    public void setIdPuesto(String idPuesto) {
        this.idPuesto = idPuesto;
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


    public String getIdUnidadLabel() {
        return idUnidadLabel;
    }

    public void setIdUnidadLabel(String idUnidadLabel) {
        this.idUnidadLabel = idUnidadLabel;
    }

    public Integer getIdEdoLabel() {
        return idEdoLabel;
    }

    public void setIdEdoLabel(Integer idEdoLabel) {
        this.idEdoLabel = idEdoLabel;
    }

    public Integer getIdMuniLabel() {
        return idMuniLabel;
    }

    public void setIdMuniLabel(Integer idMuniLabel) {
        this.idMuniLabel = idMuniLabel;
    }

    public Integer getIdZonaEcoLabel() {
        return idZonaEcoLabel;
    }

    public void setIdZonaEcoLabel(Integer idZonaEcoLabel) {
        this.idZonaEcoLabel = idZonaEcoLabel;
    }

    public String getIdPuestoLabel() {
        return idPuestoLabel;
    }

    public void setIdPuestoLabel(String idPuestoLabel) {
        this.idPuestoLabel = idPuestoLabel;
    }

    public String getNivelFisicoLabel() {
        return nivelFisicoLabel;
    }

    public void setNivelFisicoLabel(String nivelFisicoLabel) {
        this.nivelFisicoLabel = nivelFisicoLabel;
    }

    public Integer getIdRangoLabel() {
        return idRangoLabel;
    }

    public void setIdRangoLabel(Integer idRangoLabel) {
        this.idRangoLabel = idRangoLabel;
    }

    public String getNombramientoLabel() {
        return nombramientoLabel;
    }

    public void setNombramientoLabel(String nombramientoLabel) {
        this.nombramientoLabel = nombramientoLabel;
    }

    public String getSueldoLabel() {
        return sueldoLabel;
    }

    public void setSueldoLabel(String sueldoLabel) {
        this.sueldoLabel = sueldoLabel;
    }

    public String getCompensacionLabel() {
        return compensacionLabel;
    }

    public void setCompensacionLabel(String compensacionLabel) {
        this.compensacionLabel = compensacionLabel;
    }
    
    public boolean isCheckFechaTermino() {
        return checkFechaTermino;
    }

    public void setCheckFechaTermino(boolean checkFechaTermino) {
        this.checkFechaTermino = checkFechaTermino;
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
    
    @ValidationMethod(forProperty="idTipoPlaza", errorCode="error.select.unspecified")
    public boolean validateIdTipoPlaza() {
        return this.getIdTipoPlaza() != null && !this.getIdTipoPlaza().equals("") && !this.getIdTipoPlaza().equals("0");
    }
    
    @ValidationMethod(forProperty="idServPub", errorCode="error.select.unspecified")
    public boolean validateIdServPub() {
        return this.getIdServPub() != null && !this.getIdServPub().equals("") && !this.getIdServPub().equals("0");
    }
    
    @ValidationMethod(forProperty="idInmueble", errorCode="error.select.unspecified")
    public boolean validateIdInmueble() {
        return this.getIdInmueble() != null && this.getIdInmueble() != 0;
    }
    
    // fechaInicioVigencia < Quincena de captura
    @ValidationMethod(forProperty = "plazaIniCont", errorCode = "fecha.invalida.quincena")
    private boolean validateFechaInicioVigenciaVsQuincena() {
        if (DateUtils.truncate(this.getPlazaIniCont(), Calendar.DATE).after(DateUtils.truncate(this.getFinQuincenaCaptura(), Calendar.DATE))) {
            return false;
        }
        return true;
    }

    public void setBeanNamePuesto(String beanNamePuesto) {
        this.beanNamePuesto = beanNamePuesto;
    }

    public String getBeanNamePuesto() {
        return beanNamePuesto;
    }

    public void setIdPtoOrigen(String idPtoOrigen) {
        this.idPtoOrigen = idPtoOrigen;
    }

    public String getIdPtoOrigen() {
        return idPtoOrigen;
    }

    public void setIdSitPlazaDestino(String idSitPlazaDestino) {
        this.idSitPlazaDestino = idSitPlazaDestino;
    }

    public String getIdSitPlazaDestino() {
        return idSitPlazaDestino;
    }

    public void setIdVacanciaLabel(String idVacanciaLabel) {
        this.idVacanciaLabel = idVacanciaLabel;
    }

    public String getIdVacanciaLabel() {
        return idVacanciaLabel;
    }


    public void setRadioAutorizacion(Integer radioAutorizacion) {
        this.radioAutorizacion = radioAutorizacion;
    }

    public Integer getRadioAutorizacion() {
        return radioAutorizacion;
    }

    public void setIdVacanciaAux(Integer idVacanciaAux) {
        this.idVacanciaAux = idVacanciaAux;
    }

    public Integer getIdVacanciaAux() {
        return idVacanciaAux;
    }
}
