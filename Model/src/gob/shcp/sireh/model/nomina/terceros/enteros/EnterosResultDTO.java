package gob.shcp.sireh.model.nomina.terceros.enteros;

import gob.shcp.fsn.model.Model;

public class EnterosResultDTO  implements java.io.Serializable, Model{ 
    private String nombre;
    private String rfc;
    private String concepto;
    private double deduccion;
    private double recuperacion;


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    public String getRfc() {
        return rfc;
    }

    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }

    public String getConcepto() {
        return concepto;
    }

    public void setDeduccion(double deduccion) {
        this.deduccion = deduccion;
    }

    public double getDeduccion() {
        return deduccion;
    }

    public void setRecuperacion(double recuperacion) {
        this.recuperacion = recuperacion;
    }

    public double getRecuperacion() {
        return recuperacion;
    }
}
