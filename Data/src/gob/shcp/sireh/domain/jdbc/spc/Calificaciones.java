package gob.shcp.sireh.domain.jdbc.spc;

import gob.shcp.fsn.data.Domain;

import java.io.Serializable;

public class Calificaciones implements Domain, Serializable {
    private String  rfc;
    private String  nombre;
    private String  primerApellido;
    private String  segundoApellido;
    private String  asistencia;
    private String  calificacionInicial;
    private String  calificacionFinal;
    private String  estatus;
    private String  myac;
    private String  jerarquia;
    
    public Calificaciones() {
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    public String getRfc() {
        return rfc;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
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

    public void setAsistencia(String asistencia) {
        this.asistencia = asistencia;
    }

    public String getAsistencia() {
        return asistencia;
    }

    public void setCalificacionInicial(String calificacionInicial) {
        this.calificacionInicial = calificacionInicial;
    }

    public String getCalificacionInicial() {
        return calificacionInicial;
    }

    public void setCalificacionFinal(String calificacionFinal) {
        this.calificacionFinal = calificacionFinal;
    }

    public String getCalificacionFinal() {
        return calificacionFinal;
    }

    public void setEstatus(String estatus) {
        this.estatus = estatus;
    }

    public String getEstatus() {
        return estatus;
    }

    public void setIdentity(Serializable id) {
    }

    public Serializable getIdentity() {
        return null;
    }

    public void setMyac(String myac) {
        this.myac = myac;
    }

    public String getMyac() {
        return myac;
    }

    public void setJerarquia(String jerarquia) {
        this.jerarquia = jerarquia;
    }

    public String getJerarquia() {
        return jerarquia;
    }
}
