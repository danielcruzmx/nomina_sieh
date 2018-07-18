package gob.shcp.sireh.model.rusp;

import gob.shcp.fsn.model.Model;

public class DatosBasicos1DTO implements java.io.Serializable, Model {

    private java.lang.String rfcEmpleado;
    private java.lang.String rfcUnico;
    private java.lang.String primerApellido;
    private java.lang.String segundoApellido;
    private java.lang.String nombreEmpleado;
    private java.lang.String curpEmpleado;
    private java.lang.Integer lengua;
    private java.lang.String tipo;
    private java.lang.String nombreHijo;

    public void setRfcEmpleado(String rfcEmpleado) {
        this.rfcEmpleado = rfcEmpleado;
    }

    public String getRfcEmpleado() {
        return rfcEmpleado;
    }

    public void setRfcUnico(String rfcUnico) {
        this.rfcUnico = rfcUnico;
    }

    public String getRfcUnico() {
        return rfcUnico;
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

    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }

    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public void setCurpEmpleado(String curpEmpleado) {
        this.curpEmpleado = curpEmpleado;
    }

    public String getCurpEmpleado() {
        return curpEmpleado;
    }

    public void setLengua(Integer lengua) {
        this.lengua = lengua;
    }

    public Integer getLengua() {
        return lengua;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setNombreHijo(String nombreHijo) {
        this.nombreHijo = nombreHijo;
    }

    public String getNombreHijo() {
        return nombreHijo;
    }
}
