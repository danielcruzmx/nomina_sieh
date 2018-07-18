package gob.shcp.sireh.model.spc.registro;

import gob.shcp.fsn.model.Model;

import java.util.Date;

public class CustomParticipantesInscritosDTO implements java.io.Serializable, Model {
    
    private String idUnidad;
    private String descUnidad;
    private String idNivelPto;
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
    
    public void setIdNivelPto(String idNivelPto) {
        this.idNivelPto = idNivelPto;
    }

    public String getIdNivelPto() {
        return idNivelPto;
    }

    public void setParticipanteEmail(String participanteEmail) {
        this.participanteEmail = participanteEmail;
    }

    public String getParticipanteEmail() {
        return participanteEmail;
    }

    public void setParticipanteNotificacion(Date participanteNotificacion) {
        this.participanteNotificacion = participanteNotificacion;
    }

    public Date getParticipanteNotificacion() {
        return participanteNotificacion;
    }

    public void setParticipanteObservaciones(String participanteObservaciones) {
        this.participanteObservaciones = participanteObservaciones;
    }

    public String getParticipanteObservaciones() {
        return participanteObservaciones;
    }
}
