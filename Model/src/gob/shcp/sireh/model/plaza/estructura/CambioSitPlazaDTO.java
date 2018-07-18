package gob.shcp.sireh.model.plaza.estructura;

import gob.shcp.fsn.model.Model;
import gob.shcp.sireh.model.plaza.TdPlazaDTO;

import java.util.Date;

import org.springmodules.validation.bean.conf.loader.annotation.handler.MaxLength;
import org.springmodules.validation.bean.conf.loader.annotation.handler.ValidationMethod;

public class CambioSitPlazaDTO extends TdPlazaDTO implements java.io.Serializable, Model {
    
    private boolean datosFisicos;
    private boolean datosPresupuestales;
    
    //Filtros
    private java.lang.String uniCiclo;
    private java.lang.String idCiclo;
    
    //Cambio de Situación
    @MaxLength(2)
    private java.lang.String idSitPlazaOrigen;
    @MaxLength(2)
    private java.lang.String idSitPlazaDestino;
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

    public String getIdSitPlazaOrigen() {
        return idSitPlazaOrigen;
    }

    public void setIdSitPlazaOrigen(String idSitPlazaOrigen) {
        this.idSitPlazaOrigen = idSitPlazaOrigen;
    }

    public String getIdSitPlazaDestino() {
        return idSitPlazaDestino;
    }

    public void setIdSitPlazaDestino(String idSitPlazaDestino) {
        this.idSitPlazaDestino = idSitPlazaDestino;
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
    
    /* V A L I D A C I O N E S */
    
     @ValidationMethod(forProperty="idSitPlazaDestino", errorCode="error.select.unspecified")
     public boolean validateIdSitPlazaDestin(){
         return  this.getIdSitPlazaDestino() != null && !this.getIdSitPlazaDestino().equals("") && !this.getIdSitPlazaDestino().equals("0");
     }
     
    @ValidationMethod(forProperty="plazaIniCont", errorCode="fecha.invalida.not.blank")
    public boolean validatePlazaIniCont(){
        return this.getPlazaIniCont() != null;
    }
}