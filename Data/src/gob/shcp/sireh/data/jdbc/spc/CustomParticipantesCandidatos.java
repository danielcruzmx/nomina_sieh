package gob.shcp.sireh.data.jdbc.spc;

import gob.shcp.fsn.data.Domain;

import gob.shcp.sireh.domain.jdbc.TdEmpleado;

import java.io.Serializable;

import java.util.Date;

public class CustomParticipantesCandidatos extends TdEmpleado implements Domain, Serializable {
    
    private String idUnidad;
    private String descUnidad;
    private String idNivelPto;
    private Date fechaIngreso;
    private String idPuesto;
    private String descPuesto;
    private Integer idPlaza;
    private String idGrupoPago;
    private String vigenciaSancion;
    private Integer sancionado;
    
    private String participanteEmailOficial;
    private String participanteEmailPersonal;
    
    public void setIdentity(Serializable id) {
    }

    public Serializable getIdentity() {
        return null;
    }
    
    public void setIdUnidad(String idUnidad) {
        this.idUnidad = idUnidad;
    }

    public String getIdUnidad() {
        return idUnidad;
    }
    
    public void setDescUnidad(String descUnidad) {
        this.descUnidad = descUnidad;
    }

    public String getDescUnidad() {
        return descUnidad;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public void setIdPuesto(String idPuesto) {
        this.idPuesto = idPuesto;
    }

    public String getIdPuesto() {
        return idPuesto;
    }

    public void setDescPuesto(String descPuesto) {
        this.descPuesto = descPuesto;
    }

    public String getDescPuesto() {
        return descPuesto;
    }

    public void setIdPlaza(Integer idPlaza) {
        this.idPlaza = idPlaza;
    }

    public Integer getIdPlaza() {
        return idPlaza;
    }

    public void setIdGrupoPago(String idGrupoPago) {
        this.idGrupoPago = idGrupoPago;
    }

    public String getIdGrupoPago() {
        return idGrupoPago;
    }
    
    public void setIdNivelPto(String idNivelPto) {
        this.idNivelPto = idNivelPto;
    }

    public String getIdNivelPto() {
        return idNivelPto;
    }
    
    public void setParticipanteEmailOficial(String participanteEmailOficial) {
        this.participanteEmailOficial = participanteEmailOficial;
    }

    public String getParticipanteEmailOficial() {
        return participanteEmailOficial;
    }

    public void setParticipanteEmailPersonal(String participanteEmailPersonal) {
        this.participanteEmailPersonal = participanteEmailPersonal;
    }

    public String getParticipanteEmailPersonal() {
        return participanteEmailPersonal;
    }

    public void setVigenciaSancion(String vigenciaSancion) {
        this.vigenciaSancion = vigenciaSancion;
    }

    public String getVigenciaSancion() {
        return vigenciaSancion;
    }

    public void setSancionado(Integer sancionado) {
        this.sancionado = sancionado;
    }

    public Integer getSancionado() {
        return sancionado;
    }
}
