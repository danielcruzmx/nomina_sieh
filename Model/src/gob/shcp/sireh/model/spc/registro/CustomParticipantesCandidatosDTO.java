package gob.shcp.sireh.model.spc.registro;

import gob.shcp.fsn.model.Model;

import java.util.Date;

public class CustomParticipantesCandidatosDTO implements java.io.Serializable, Model {
    
    private Integer idCurso;
    private String idUnidad;
    private String descUnidad;
    private String idNivelPto;
    private String rfcEmpleado;
    private String nombreEmpleado;
    private String primerApellido;
    private String segundoApellido;
    private String email;
    private String emailAlterno;
    private String sancion;
    private Date fechaIngreso;
    private Date fechaReingreso;
    private Date fechaVigencia;
    private String idPuesto;
    private String descPuesto;
    private String idGenero;
    private String idSituacionParticipante;
    private String idRuspParticipante;
    private Integer idPlaza;
    private String idGrupoPago;
    private String vigenciaSancion;
    private Integer sancionado;
    
    private String participanteEmailOficial;
    private String participanteEmailPersonal;
    
    public void setIdCurso(Integer idCurso) {
        this.idCurso = idCurso;
    }

    public Integer getIdCurso() {
        return idCurso;
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

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmailAlterno(String emailAlterno) {
        this.emailAlterno = emailAlterno;
    }

    public String getEmailAlterno() {
        return emailAlterno;
    }

    public void setSancion(String sancion) {
        this.sancion = sancion;
    }

    public String getSancion() {
        return sancion;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaReingreso(Date fechaReingreso) {
        this.fechaReingreso = fechaReingreso;
    }

    public Date getFechaReingreso() {
        return fechaReingreso;
    }

    public void setFechaVigencia(Date fechaVigencia) {
        this.fechaVigencia = fechaVigencia;
    }

    public Date getFechaVigencia() {
        return fechaVigencia;
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

    public void setIdGenero(String idGenero) {
        this.idGenero = idGenero;
    }

    public String getIdGenero() {
        return idGenero;
    }

    public void setIdSituacionParticipante(String idSituacionParticipante) {
        this.idSituacionParticipante = idSituacionParticipante;
    }

    public String getIdSituacionParticipante() {
        return idSituacionParticipante;
    }

    public void setIdRuspParticipante(String idRuspParticipante) {
        this.idRuspParticipante = idRuspParticipante;
    }

    public String getIdRuspParticipante() {
        return idRuspParticipante;
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

    public void setSancionado(Integer sancionado) {
        this.sancionado = sancionado;
    }

    public Integer getSancionado() {
        return sancionado;
    }

    public void setVigenciaSancion(String vigenciaSancion) {
        this.vigenciaSancion = vigenciaSancion;
    }

    public String getVigenciaSancion() {
        return vigenciaSancion;
    }
}
