package gob.shcp.sireh.control.spc.capcer;

import java.io.Serializable;

public class InscribirParticipanteJson implements Serializable {
    
    private String seleccion;
    private String unidad;
    private String nivel;
    private String rfcEmpleado;
    private String nombre;
    private String primerApellido;
    private String segundoApellido;
    private String email;
    private String emailAlterno;
    private String sancionado;
    private String fechaIngreso;
    private String fechaReingreso;
    private String fechaVigencia;
    
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

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public String getNivel() {
        return nivel;
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

    public void setSancionado(String sancionado) {
        this.sancionado = sancionado;
    }

    public String getSancionado() {
        return sancionado;
    }

    public void setFechaIngreso(String fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public String getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaReingreso(String fechaReingreso) {
        this.fechaReingreso = fechaReingreso;
    }

    public String getFechaReingreso() {
        return fechaReingreso;
    }

    public void setFechaVigencia(String fechaVigencia) {
        this.fechaVigencia = fechaVigencia;
    }

    public String getFechaVigencia() {
        return fechaVigencia;
    }
}
