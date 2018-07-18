package gob.shcp.sireh.domain.jdbc;

import gob.shcp.fsn.data.Domain;

import java.io.Serializable;

public class Cfdi implements Domain, Serializable {
    
    // Consultados a la base de datos
    private String unidad;
    private String descUnidad;
    private String puesto;
    private String descPuesto;
    private String ciclo;
    private String qnaPago;
    private String plaza;
    private String nivel;
    private String cadenaOriginal;
    private String cnConsecNomina;
    private String nominaPdf;
    private String pcp;
    private String nomLeyenda;
    private String descNombramiento;

    public void setUnidad(String unidad) {
        this.unidad = unidad;
    }

    public String getUnidad() {
        return unidad;
    }

    public void setDescUnidad(String descUnidad) {
        this.descUnidad = descUnidad;
    }

    public String getDescUnidad() {
        return descUnidad;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setDescPuesto(String descPuesto) {
        this.descPuesto = descPuesto;
    }

    public String getDescPuesto() {
        return descPuesto;
    }

    public void setCiclo(String ciclo) {
        this.ciclo = ciclo;
    }

    public String getCiclo() {
        return ciclo;
    }

    public void setQnaPago(String qnaPago) {
        this.qnaPago = qnaPago;
    }

    public String getQnaPago() {
        return qnaPago;
    }

    public void setPlaza(String plaza) {
        this.plaza = plaza;
    }

    public String getPlaza() {
        return plaza;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public String getNivel() {
        return nivel;
    }

    public void setIdentity(Serializable id) {
    }

    public Serializable getIdentity() {
        return null;
    }

    public void setCadenaOriginal(String cadenaOriginal) {
        this.cadenaOriginal = cadenaOriginal;
    }

    public String getCadenaOriginal() {
        return cadenaOriginal;
    }

    public void setCnConsecNomina(String cnConsecNomina) {
        this.cnConsecNomina = cnConsecNomina;
    }

    public String getCnConsecNomina() {
        return cnConsecNomina;
    }

    public void setNominaPdf(String nominaPdf) {
        this.nominaPdf = nominaPdf;
    }

    public String getNominaPdf() {
        return nominaPdf;
    }

    public void setPcp(String pcp) {
        this.pcp = pcp;
    }

    public String getPcp() {
        return pcp;
    }

    public void setNomLeyenda(String nomLeyenda) {
        this.nomLeyenda = nomLeyenda;
    }

    public String getNomLeyenda() {
        return nomLeyenda;
    }

    public void setDescNombramiento(String descNombramiento) {
        this.descNombramiento = descNombramiento;
    }

    public String getDescNombramiento() {
        return descNombramiento;
    }
}
