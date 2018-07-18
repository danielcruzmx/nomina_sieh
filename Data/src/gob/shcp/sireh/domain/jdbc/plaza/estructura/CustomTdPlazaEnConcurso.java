package gob.shcp.sireh.domain.jdbc.plaza.estructura;

import gob.shcp.fsn.data.Domain;

import gob.shcp.fsn.data.annotation.PrimaryKey;

import java.io.Serializable;

import java.util.Date;

public class CustomTdPlazaEnConcurso implements Domain, Serializable{
    @PrimaryKey
    private Integer idPlaza;
    private String plazaRfc;
    private String nombreEmpleado;
    private String codigoPuesto;
    private String nombrePuesto;
    private String idUnidadNom;
    private String descUnidad;
    private String idPuestoNom;
    private String idNivelPto;
    private String idRangoNom;
    private String idSitPlaza;
    private String descSitPlaza;
    // Datos concurso
    private Integer idPlazaConcurso;
    private Integer idEstatus;
    private Date fechaDesierta;
    private Date fechaEtapa;
    private Integer idEtapa;
    
    public CustomTdPlazaEnConcurso() {
    }

    /**
     * Set identity value.
     *
     * @param idPlaza Serializable
     */
    public void setIdentity(Serializable idPlaza) {
        this.idPlaza = (java.lang.Integer)idPlaza;
    }

    /**
     * Get identity value.
     *
     * @return Serializable
     */
    public Serializable getIdentity() {
        return this.idPlaza;
    }


    public void setIdPlaza(Integer idPlaza) {
        this.idPlaza = idPlaza;
    }

    public Integer getIdPlaza() {
        return idPlaza;
    }

    public void setPlazaRfc(String plazaRfc) {
        this.plazaRfc = plazaRfc;
    }

    public String getPlazaRfc() {
        return plazaRfc;
    }

    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }

    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public void setCodigoPuesto(String codigoPuesto) {
        this.codigoPuesto = codigoPuesto;
    }

    public String getCodigoPuesto() {
        return codigoPuesto;
    }

    public void setNombrePuesto(String nombrePuesto) {
        this.nombrePuesto = nombrePuesto;
    }

    public String getNombrePuesto() {
        return nombrePuesto;
    }

    public void setIdUnidadNom(String idUnidadNom) {
        this.idUnidadNom = idUnidadNom;
    }

    public String getIdUnidadNom() {
        return idUnidadNom;
    }

    public void setDescUnidad(String descUnidad) {
        this.descUnidad = descUnidad;
    }

    public String getDescUnidad() {
        return descUnidad;
    }

    public void setIdPuestoNom(String idPuestoNom) {
        this.idPuestoNom = idPuestoNom;
    }

    public String getIdPuestoNom() {
        return idPuestoNom;
    }

    public void setIdNivelPto(String idNivelPto) {
        this.idNivelPto = idNivelPto;
    }

    public String getIdNivelPto() {
        return idNivelPto;
    }

    public void setIdRangoNom(String idRangoNom) {
        this.idRangoNom = idRangoNom;
    }

    public String getIdRangoNom() {
        return idRangoNom;
    }

    public void setIdSitPlaza(String idSitPlaza) {
        this.idSitPlaza = idSitPlaza;
    }

    public String getIdSitPlaza() {
        return idSitPlaza;
    }

    public void setDescSitPlaza(String descSitPlaza) {
        this.descSitPlaza = descSitPlaza;
    }

    public String getDescSitPlaza() {
        return descSitPlaza;
    }

    public void setIdPlazaConcurso(Integer idPlazaConcurso) {
        this.idPlazaConcurso = idPlazaConcurso;
    }

    public Integer getIdPlazaConcurso() {
        return idPlazaConcurso;
    }

    public void setIdEstatus(Integer idEstatus) {
        this.idEstatus = idEstatus;
    }

    public Integer getIdEstatus() {
        return idEstatus;
    }

    public void setFechaDesierta(Date fechaDesierta) {
        this.fechaDesierta = fechaDesierta;
    }

    public Date getFechaDesierta() {
        return fechaDesierta;
    }

    public void setIdEtapa(Integer idEtapa) {
        this.idEtapa = idEtapa;
    }

    public Integer getIdEtapa() {
        return idEtapa;
    }

    public void setFechaEtapa(Date fechaEtapa) {
        this.fechaEtapa = fechaEtapa;
    }

    public Date getFechaEtapa() {
        return fechaEtapa;
    }
}
