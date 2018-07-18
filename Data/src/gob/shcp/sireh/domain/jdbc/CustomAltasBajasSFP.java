package gob.shcp.sireh.domain.jdbc;

import gob.shcp.fsn.data.Domain;

import java.io.Serializable;

public class CustomAltasBajasSFP extends TnMovtosEmpPla implements Domain, Serializable {

    private java.lang.String descUnidad;
    private java.lang.String descMovsPersonal;
    private java.lang.String nombre;
    private java.lang.String curpEmpleado;
    private java.lang.String idNivelPto;
    private java.lang.String descGrupoPago;

    public void setDescUnidad(String descUnidad) {
        this.descUnidad = descUnidad;
    }

    public String getDescUnidad() {
        return descUnidad;
    }

    public void setDescMovsPersonal(String descMovsPersonal) {
        this.descMovsPersonal = descMovsPersonal;
    }

    public String getDescMovsPersonal() {
        return descMovsPersonal;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setCurpEmpleado(String curpEmpleado) {
        this.curpEmpleado = curpEmpleado;
    }

    public String getCurpEmpleado() {
        return curpEmpleado;
    }

    public void setIdNivelPto(String idNivelPto) {
        this.idNivelPto = idNivelPto;
    }

    public String getIdNivelPto() {
        return idNivelPto;
    }

    public void setDescGrupoPago(String descGrupoPago) {
        this.descGrupoPago = descGrupoPago;
    }

    public String getDescGrupoPago() {
        return descGrupoPago;
    }
}
