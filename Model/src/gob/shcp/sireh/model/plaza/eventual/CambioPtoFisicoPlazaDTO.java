package gob.shcp.sireh.model.plaza.eventual;

import gob.shcp.fsn.model.Model;
import gob.shcp.sireh.model.plaza.TdPlazaDTO;

import java.util.Date;

public class CambioPtoFisicoPlazaDTO extends TdPlazaDTO implements java.io.Serializable, Model {

    private boolean datosFisicos;
    private boolean datosPresupuestales;

    //Filtros
    private java.lang.String uniCiclo;
    private java.lang.String idCiclo;

    //Cambio de Puesto Fisico
    private java.lang.String idPuesto;
    private java.lang.Integer idZonaEco;
    private double sueldo;
    private double compensacion;
    private java.lang.String descSitPlaza;
    private java.lang.Integer idRango;
    private Date ultimoMovto;
    private boolean verificar;
    private boolean puestoSobrevaluado;

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

    public String getDescSitPlaza() {
        return descSitPlaza;
    }

    public void setDescSitPlaza(String descSitPlaza) {
        this.descSitPlaza = descSitPlaza;
    }

    public Integer getIdRango() {
        return idRango;
    }

    public void setIdRango(Integer idRango) {
        this.idRango = idRango;
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

    public boolean isVerificar() {
        return verificar;
    }

    public void setVerificar(boolean verificar) {
        this.verificar = verificar;
    }

    public boolean isPuestoSobrevaluado() {
        return puestoSobrevaluado;
    }

    public void setPuestoSobrevaluado(boolean puestoSobrevaluado) {
        this.puestoSobrevaluado = puestoSobrevaluado;
    }
}
