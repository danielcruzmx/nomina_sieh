package gob.shcp.sireh.model.plaza.estructura;

import gob.shcp.fsn.model.Model;
import gob.shcp.sireh.model.plaza.TdPlazaDTO;

import java.util.Date;

import org.springmodules.validation.bean.conf.loader.annotation.handler.ValidationMethod;

public class CambioURFisicaPlazaDTO extends TdPlazaDTO implements java.io.Serializable, Model {

    private boolean datosFisicos;
    private boolean datosPresupuestales;

    //Filtros
    private java.lang.String uniCiclo;
    private java.lang.String idCiclo;

    //Cambio de Unidad Responsable
    private java.lang.String idUnidad;
    private java.lang.Integer idEdo;
    private java.lang.Integer idMuni;
    private java.lang.String idPuesto;
    private java.lang.Integer idZonaEco;
    private java.lang.Integer idRango;
    private java.lang.String descSitPlaza;
    private Date ultimoMovto;

    //Etiquetas
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

    public String getIdPuesto() {
        return idPuesto;
    }

    public void setIdPuesto(String idPuesto) {
        this.idPuesto = idPuesto;
    }

    public Integer getIdZonaEco() {
        return idZonaEco;
    }

    public void setIdZonaEco(Integer idZonaEco) {
        this.idZonaEco = idZonaEco;
    }

    public Integer getIdRango() {
        return idRango;
    }

    public void setIdRango(Integer idRango) {
        this.idRango = idRango;
    }

    public String getDescSitPlaza() {
        return descSitPlaza;
    }

    public void setDescSitPlaza(String descSitPlaza) {
        this.descSitPlaza = descSitPlaza;
    }

    public Date getUltimoMovto() {
        return ultimoMovto;
    }

    public void setUltimoMovto(Date ultimoMovto) {
        this.ultimoMovto = ultimoMovto;
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
    
    /* V A L I D A C I O N E S */
    
     @ValidationMethod(forProperty="idUnidad", errorCode="error.select.unspecified")
     public boolean validateIdUnidad(){
         return  this.getIdUnidad() != null && !this.getIdUnidad().equals("") && !this.getIdUnidad().equals("0");
     }
     
    @ValidationMethod(forProperty="idEdo", errorCode="error.select.unspecified")
    public boolean validateIdEdo(){
        return  this.getIdEdo() != null && this.getIdEdo() != 0;
    }
    
    @ValidationMethod(forProperty="plazaIniCont", errorCode="fecha.invalida.not.blank")
    public boolean validatePlazaIniCont(){
        return this.getPlazaIniCont() != null;
    }
    
    @ValidationMethod(forProperty="plazaFinCont", errorCode="fecha.invalida.not.blank")
    public boolean validatePlazaFinCont(){
        return this.getPlazaFinCont() != null;
    }
}
