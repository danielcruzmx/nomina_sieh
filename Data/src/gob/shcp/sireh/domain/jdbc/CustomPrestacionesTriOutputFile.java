package gob.shcp.sireh.domain.jdbc;

import gob.shcp.fsn.data.Domain;

import java.io.Serializable;

public class CustomPrestacionesTriOutputFile implements Domain, Serializable {

    private String descPrestacion;
    private String estructuraMonto;
    private String estructuraCasos;
    private String eventualesMonto;
    private String eventualesCasos;
    private String totalMonto;
    private String totalCasos;

    public void setIdentity(Serializable id) {
    }

    public Serializable getIdentity() {
        return null;
    }

    public void setDescPrestacion(String descPrestacion) {
        this.descPrestacion = descPrestacion;
    }

    public String getDescPrestacion() {
        return descPrestacion;
    }

    public void setEstructuraMonto(String estructuraMonto) {
        this.estructuraMonto = estructuraMonto;
    }

    public String getEstructuraMonto() {
        return estructuraMonto;
    }

    public void setEstructuraCasos(String estructuraCasos) {
        this.estructuraCasos = estructuraCasos;
    }

    public String getEstructuraCasos() {
        return estructuraCasos;
    }

    public void setEventualesMonto(String eventualesMonto) {
        this.eventualesMonto = eventualesMonto;
    }

    public String getEventualesMonto() {
        return eventualesMonto;
    }

    public void setEventualesCasos(String eventualesCasos) {
        this.eventualesCasos = eventualesCasos;
    }

    public String getEventualesCasos() {
        return eventualesCasos;
    }

    public void setTotalMonto(String totalMonto) {
        this.totalMonto = totalMonto;
    }

    public String getTotalMonto() {
        return totalMonto;
    }

    public void setTotalCasos(String totalCasos) {
        this.totalCasos = totalCasos;
    }

    public String getTotalCasos() {
        return totalCasos;
    }
}
