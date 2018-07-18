package gob.shcp.sireh.domain.jdbc;

import gob.shcp.fsn.data.Domain;

import java.io.Serializable;

import java.util.Date;

public class TcMunicipio implements Domain, Serializable {
    private Integer idEdo;
    private Integer idMunicipio;
    private Integer idZonaEcon;
    private String  IdZonaSalMin;
    private String  descMunicipio;
    private String  usuario;
    private Date    fecModifico;
    
    public TcMunicipio() {
    }

    public void setIdEdo(Integer idEdo) {
        this.idEdo = idEdo;
    }

    public Integer getIdEdo() {
        return idEdo;
    }

    public void setIdMunicipio(Integer idMunicipio) {
        this.idMunicipio = idMunicipio;
    }

    public Integer getIdMunicipio() {
        return idMunicipio;
    }

    public void setIdZonaEcon(Integer idZonaEcon) {
        this.idZonaEcon = idZonaEcon;
    }

    public Integer getIdZonaEcon() {
        return idZonaEcon;
    }

    public void setIdZonaSalMin(String idZonaSalMin) {
        this.IdZonaSalMin = idZonaSalMin;
    }

    public String getIdZonaSalMin() {
        return IdZonaSalMin;
    }

    public void setDescMunicipio(String descMunicipio) {
        this.descMunicipio = descMunicipio;
    }

    public String getDescMunicipio() {
        return descMunicipio;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setFecModifico(Date fecModifico) {
        this.fecModifico = fecModifico;
    }

    public Date getFecModifico() {
        return fecModifico;
    }

    public void setIdentity(Serializable id) {
    }

    public Serializable getIdentity() {
        return null;
    }
}
