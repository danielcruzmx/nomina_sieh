package gob.shcp.sireh.domain.jdbc;

import gob.shcp.fsn.data.Domain;

import java.io.Serializable;

public class FinContrato implements Domain, Serializable {
    private String quincena;
    private String plazaIniContrato;
    private String plazaFinContrato;
    private String curpEmpleado;
    private String rfcEmpleado;
    private String pApellido;
    private String sApellido;
    private String nombre;
    private String puesto;
    private String plaza;
    private String nivelPuesto;
    private String unidad;
    private String DESC_GRUPO_PAGO;

    public FinContrato() {
    }

    public FinContrato(String quincena, String plazaIniContrato, 
                       String plazaFinContrato, String curpEmpleado, 
                       String rfcEmpleado, String pApellido, String sApellido, 
                       String nombre, String puesto, String plaza, 
                       String nivelPuesto, String unidad, 
                       String DESC_GRUPO_PAGO) {
        this.quincena = quincena;
        this.plazaIniContrato = plazaIniContrato;
        this.plazaFinContrato = plazaFinContrato;
        this.curpEmpleado = curpEmpleado;
        this.rfcEmpleado = rfcEmpleado;
        this.pApellido = pApellido;
        this.sApellido = sApellido;
        this.nombre = nombre;
        this.puesto = puesto;
        this.plaza = plaza;
        this.nivelPuesto = nivelPuesto;
        this.unidad = unidad;
        this.DESC_GRUPO_PAGO = DESC_GRUPO_PAGO;
    }

    public void setQuincena(String quincena) {
        this.quincena = quincena;
    }

    public String getQuincena() {
        return quincena;
    }

    public void setPlazaIniContrato(String plazaIniContrato) {
        this.plazaIniContrato = plazaIniContrato;
    }

    public String getPlazaIniContrato() {
        return plazaIniContrato;
    }

    public void setPlazaFinContrato(String plazaFinContrato) {
        this.plazaFinContrato = plazaFinContrato;
    }

    public String getPlazaFinContrato() {
        return plazaFinContrato;
    }

    public void setCurpEmpleado(String curpEmpleado) {
        this.curpEmpleado = curpEmpleado;
    }

    public String getCurpEmpleado() {
        return curpEmpleado;
    }

    public void setRfcEmpleado(String rfcEmpleado) {
        this.rfcEmpleado = rfcEmpleado;
    }

    public String getRfcEmpleado() {
        return rfcEmpleado;
    }

    public void setPApellido(String pApellido) {
        this.pApellido = pApellido;
    }

    public String getPApellido() {
        return pApellido;
    }

    public void setSApellido(String sApellido) {
        this.sApellido = sApellido;
    }

    public String getSApellido() {
        return sApellido;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPlaza(String plaza) {
        this.plaza = plaza;
    }

    public String getPlaza() {
        return plaza;
    }

    public void setNivelPuesto(String nivelPuesto) {
        this.nivelPuesto = nivelPuesto;
    }

    public String getNivelPuesto() {
        return nivelPuesto;
    }

    public void setUnidad(String unidad) {
        this.unidad = unidad;
    }

    public String getUnidad() {
        return unidad;
    }

    public void setIdentity(Serializable id) {
    }

    public Serializable getIdentity() {
        return null;
    }

    public void setDESC_GRUPO_PAGO(String dESC_GRUPO_PAGO) {
        this.DESC_GRUPO_PAGO = dESC_GRUPO_PAGO;
    }

    public String getDESC_GRUPO_PAGO() {
        return DESC_GRUPO_PAGO;
    }
}
