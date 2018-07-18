package gob.shcp.sireh.model.plaza.honorarios;

import gob.shcp.fsn.model.Model;
import gob.shcp.sireh.model.plaza.TdPlazaDTO;

import java.util.Date;

import org.springmodules.validation.bean.conf.loader.annotation.handler.ValidationMethod;

public class ModificaImporteDTO extends TdPlazaDTO implements java.io.Serializable, Model {

    private boolean datosFisicos;
    private boolean datosPresupuestales;

    // Filtros
    private java.lang.String uniCiclo;
    private java.lang.String idCiclo;

    // Modifica Importe
    private java.lang.String idUnidad;
    private java.lang.Integer idEdo;
    private java.lang.Integer idMuni;
    private java.lang.String idPuesto;
    private java.lang.Integer idZonaEco;
    private java.lang.Integer idRango;
    private java.lang.String descSitPlaza;
    private Date ultimoMovto;
    private String importeHonorarioString;

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
    private java.lang.String importeHonorarioLabel;

    public void setDatosFisicos(boolean datosFisicos) {
        this.datosFisicos = datosFisicos;
    }

    public boolean isDatosFisicos() {
        return datosFisicos;
    }

    public void setDatosPresupuestales(boolean datosPresupuestales) {
        this.datosPresupuestales = datosPresupuestales;
    }

    public boolean isDatosPresupuestales() {
        return datosPresupuestales;
    }

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

    public void setIdUnidad(String idUnidad) {
        this.idUnidad = idUnidad;
    }

    public String getIdUnidad() {
        return idUnidad;
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

    public void setIdPuesto(String idPuesto) {
        this.idPuesto = idPuesto;
    }

    public String getIdPuesto() {
        return idPuesto;
    }

    public void setIdZonaEco(Integer idZonaEco) {
        this.idZonaEco = idZonaEco;
    }

    public Integer getIdZonaEco() {
        return idZonaEco;
    }

    public void setIdRango(Integer idRango) {
        this.idRango = idRango;
    }

    public Integer getIdRango() {
        return idRango;
    }

    public void setDescSitPlaza(String descSitPlaza) {
        this.descSitPlaza = descSitPlaza;
    }

    public String getDescSitPlaza() {
        return descSitPlaza;
    }

    public void setUltimoMovto(Date ultimoMovto) {
        this.ultimoMovto = ultimoMovto;
    }

    public Date getUltimoMovto() {
        return ultimoMovto;
    }

    public void setIdUnidadLabel(String idUnidadLabel) {
        this.idUnidadLabel = idUnidadLabel;
    }

    public String getIdUnidadLabel() {
        return idUnidadLabel;
    }

    public void setIdEdoLabel(Integer idEdoLabel) {
        this.idEdoLabel = idEdoLabel;
    }

    public Integer getIdEdoLabel() {
        return idEdoLabel;
    }

    public void setIdMuniLabel(Integer idMuniLabel) {
        this.idMuniLabel = idMuniLabel;
    }

    public Integer getIdMuniLabel() {
        return idMuniLabel;
    }

    public void setIdZonaEcoLabel(Integer idZonaEcoLabel) {
        this.idZonaEcoLabel = idZonaEcoLabel;
    }

    public Integer getIdZonaEcoLabel() {
        return idZonaEcoLabel;
    }

    public void setIdPuestoLabel(String idPuestoLabel) {
        this.idPuestoLabel = idPuestoLabel;
    }

    public String getIdPuestoLabel() {
        return idPuestoLabel;
    }

    public void setNivelFisicoLabel(String nivelFisicoLabel) {
        this.nivelFisicoLabel = nivelFisicoLabel;
    }

    public String getNivelFisicoLabel() {
        return nivelFisicoLabel;
    }

    public void setIdRangoLabel(Integer idRangoLabel) {
        this.idRangoLabel = idRangoLabel;
    }

    public Integer getIdRangoLabel() {
        return idRangoLabel;
    }

    public void setNombramientoLabel(String nombramientoLabel) {
        this.nombramientoLabel = nombramientoLabel;
    }

    public String getNombramientoLabel() {
        return nombramientoLabel;
    }

    public void setSueldoLabel(String sueldoLabel) {
        this.sueldoLabel = sueldoLabel;
    }

    public String getSueldoLabel() {
        return sueldoLabel;
    }

    public void setCompensacionLabel(String compensacionLabel) {
        this.compensacionLabel = compensacionLabel;
    }

    public String getCompensacionLabel() {
        return compensacionLabel;
    }
    
    public String getImporteHonorarioLabel() {
        return importeHonorarioLabel;
    }

    public void setImporteHonorarioLabel(String importeHonorarioLabel) {
        this.importeHonorarioLabel = importeHonorarioLabel;
    }
    
    public void setImporteHonorarioString(String importeHonorarioString) {
        this.importeHonorarioString = importeHonorarioString;
    }

    public String getImporteHonorarioString() {
        return importeHonorarioString;
    }
    
    /* V A L I D A C I O N E S */
    
    /*@ValidationMethod(forProperty="importeHonorario", errorCode="not.blank")
    public boolean validateImporteHonorario() {
        return this.getPlazaImpHono() != null;
    }*/
    @ValidationMethod(forProperty="importeHonorarioString", errorCode="not.blank")
    public boolean validateImporteHonorario() {
        return this.getImporteHonorarioString() != null && !this.getImporteHonorarioString().equals("");
    }
}
