package gob.shcp.sireh.model.nomina.terceros;

import gob.shcp.fsn.model.Model;

public class FonacotDTO extends DatosArchivoDTO implements java.io.Serializable, Model{ 

    private String idFonacot;
    private String rfc;
    private String nombre;
    private String noCredito;
    private Double retencionMes;    
    private String claveEmpleado;   
    private String plazo;   
    private String cuotasPagadas;   
    private Double retencionReal;   
    private String incidencia;      
    private String fechaIniBaja;    
    private String fechaFin;
    private String reubicado;



    public void setIdFonacot(String idFonacot) {
        this.idFonacot = idFonacot;
    }

    public String getIdFonacot() {
        return idFonacot;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    public String getRfc() {
        return rfc;
    }

    public void setNoCredito(String noCredito) {
        this.noCredito = noCredito;
    }

    public String getNoCredito() {
        return noCredito;
    }

    public void setRetencionMes(Double retencionMes) {
        this.retencionMes = retencionMes;
    }

    public Double getRetencionMes() {
        return retencionMes;
    }

    public void setClaveEmpleado(String claveEmpleado) {
        this.claveEmpleado = claveEmpleado;
    }

    public String getClaveEmpleado() {
        return claveEmpleado;
    }

    public void setPlazo(String plazo) {
        this.plazo = plazo;
    }

    public String getPlazo() {
        return plazo;
    }

    public void setCuotasPagadas(String cuotasPagadas) {
        this.cuotasPagadas = cuotasPagadas;
    }

    public String getCuotasPagadas() {
        return cuotasPagadas;
    }

    public void setRetencionReal(Double retencionReal) {
        this.retencionReal = retencionReal;
    }

    public Double getRetencionReal() {
        return retencionReal;
    }

    public void setIncidencia(String incidencia) {
        this.incidencia = incidencia;
    }

    public String getIncidencia() {
        return incidencia;
    }

    public void setFechaIniBaja(String fechaIniBaja) {
        this.fechaIniBaja = fechaIniBaja;
    }

    public String getFechaIniBaja() {
        return fechaIniBaja;
    }

    public void setFechaFin(String fechaFin) {
        this.fechaFin = fechaFin;
    }

    public String getFechaFin() {
        return fechaFin;
    }

    public void setReubicado(String reubicado) {
        this.reubicado = reubicado;
    }

    public String getReubicado() {
        return reubicado;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
}
