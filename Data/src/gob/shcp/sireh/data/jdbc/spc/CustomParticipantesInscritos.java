package gob.shcp.sireh.data.jdbc.spc;

import gob.shcp.fsn.data.Domain;

import gob.shcp.sireh.domain.jdbc.spc.TnCapParticipante;

import java.io.Serializable;

import java.util.Date;

public class CustomParticipantesInscritos extends TnCapParticipante implements Domain, Serializable  {
    
    private String idUnidad;
    private String descUnidad;
    private String rfcEmpleado;
    private String nombreEmpleado;
    private String primerApellido;
    private String segundoApellido;
    private String participanteEmail;
    private java.util.Date participanteNotificacion;
    private String participanteObservaciones;
    
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

    public void setRfcEmpleado(String rfcEmpleado) {
        this.rfcEmpleado = rfcEmpleado;
    }

    public String getRfcEmpleado() {
        return rfcEmpleado;
    }

    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }

    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    public String getPrimerApellido() {
        return primerApellido;
    }

    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }

    public String getSegundoApellido() {
        return segundoApellido;
    }

    public String get_participanteEmail() {
        return participanteEmail;
    }

    public Date get_participanteNotificacion() {
        return participanteNotificacion;
    }

    public String get_participanteObservaciones() {
        return participanteObservaciones;
    }
}
