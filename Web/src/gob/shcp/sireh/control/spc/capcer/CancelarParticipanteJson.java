package gob.shcp.sireh.control.spc.capcer;

import java.io.Serializable;

public class CancelarParticipanteJson implements Serializable {
    
    private String seleccion;
    private String unidad;
    private String nivel;
    private String rfcEmpleado;
    private String nombre;
    private String primerApellido;
    private String segundoApellido;
    private String email;
    private String fechaNotificacion;
    private String participanteObservaciones;
    
    public void setSeleccion(String seleccion) {
        this.seleccion = seleccion;
    }

    public String getSeleccion() {
        return seleccion;
    }

    public void setUnidad(String unidad) {
        this.unidad = unidad;
    }

    public String getUnidad() {
        return unidad;
    }

    public void setRfcEmpleado(String rfcEmpleado) {
        this.rfcEmpleado = rfcEmpleado;
    }

    public String getRfcEmpleado() {
        return rfcEmpleado;
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
    
    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public String getNivel() {
        return nivel;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setFechaNotificacion(String fechaNotificacion) {
        this.fechaNotificacion = fechaNotificacion;
    }

    public String getFechaNotificacion() {
        return fechaNotificacion;
    }

    public void setParticipanteObservaciones(String participanteObservaciones) {
        this.participanteObservaciones = participanteObservaciones;
    }

    public String getParticipanteObservaciones() {
        return participanteObservaciones;
    }
}
