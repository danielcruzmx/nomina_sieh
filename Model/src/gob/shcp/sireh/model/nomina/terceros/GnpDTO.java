package gob.shcp.sireh.model.nomina.terceros;

import gob.shcp.fsn.model.Model;

import org.springmodules.validation.bean.conf.loader.annotation.handler.ValidationMethod;

public class GnpDTO implements java.io.Serializable, Model {

    private java.lang.String qnaIni;
    private java.lang.String qnaFin;
    private java.lang.String gpoPago;
    private java.lang.String unidad;
    private java.lang.String edo;
    private java.lang.String primer;
    private java.lang.String segundo;
    private java.lang.String nombre;
    private java.lang.String rfc;
    private java.lang.String curp;
    private java.lang.String sexo;
    private java.lang.Number primaTra;
    private java.lang.Number primaDep;
    private java.lang.Number totalImp;
    private java.lang.String situacion;

    private boolean cancel;
    private boolean muestraReporte;
    private java.lang.Boolean qnaIniRequired;
    private java.lang.Boolean qnaFinRequired;

    public void setQnaIni(String qnaIni) {
        this.qnaIni = qnaIni;
    }

    public String getQnaIni() {
        return qnaIni;
    }

    public void setQnaFin(String qnaFin) {
        this.qnaFin = qnaFin;
    }

    public String getQnaFin() {
        return qnaFin;
    }

    public void setGpoPago(String gpoPago) {
        this.gpoPago = gpoPago;
    }

    public String getGpoPago() {
        return gpoPago;
    }

    public void setUnidad(String unidad) {
        this.unidad = unidad;
    }

    public String getUnidad() {
        return unidad;
    }

    public void setEdo(String edo) {
        this.edo = edo;
    }

    public String getEdo() {
        return edo;
    }

    public void setPrimer(String primer) {
        this.primer = primer;
    }

    public String getPrimer() {
        return primer;
    }

    public void setSegundo(String segundo) {
        this.segundo = segundo;
    }

    public String getSegundo() {
        return segundo;
    }

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

    public void setCurp(String curp) {
        this.curp = curp;
    }

    public String getCurp() {
        return curp;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getSexo() {
        return sexo;
    }

    public void setPrimaTra(Number primaTra) {
        this.primaTra = primaTra;
    }

    public Number getPrimaTra() {
        return primaTra;
    }

    public void setPrimaDep(Number primaDep) {
        this.primaDep = primaDep;
    }

    public Number getPrimaDep() {
        return primaDep;
    }

    public void setTotalImp(Number totalImp) {
        this.totalImp = totalImp;
    }

    public Number getTotalImp() {
        return totalImp;
    }

    public void setSituacion(String situacion) {
        this.situacion = situacion;
    }

    public String getSituacion() {
        return situacion;
    }

    public void setCancel(boolean cancel) {
        this.cancel = cancel;
    }

    public boolean isCancel() {
        return cancel;
    }

    public void setMuestraReporte(boolean muestraReporte) {
        this.muestraReporte = muestraReporte;
    }

    public boolean isMuestraReporte() {
        return muestraReporte;
    }

    public void setQnaIniRequired(Boolean qnaIniRequired) {
        this.qnaIniRequired = qnaIniRequired;
    }

    public Boolean getQnaIniRequired() {
        return qnaIniRequired;
    }

    public void setQnaFinRequired(Boolean qnaFinRequired) {
        this.qnaFinRequired = qnaFinRequired;
    }

    public Boolean getQnaFinRequired() {
        return qnaFinRequired;
    }

    @ValidationMethod(forProperty = "qnaIni", errorCode = "error.select.unspecified")
    public boolean validateQnaIni() {
        if (this.getQnaIniRequired() != null && this.getQnaIniRequired() && 
            !this.isCancel()) {
            if (this.getQnaIni() != null && !this.getQnaIni().equals("") && 
                !this.getQnaIni().equals("0")) {
                //muestraReporte = true;
                return true;
            } else {
                //muestraReporte = false;
                return false;
            }
        }
        return true;
    }

    @ValidationMethod(forProperty = "qnaFin", errorCode = "error.select.unspecified")
    public boolean validateQnaFin() {
        if (this.getQnaFinRequired() != null && this.getQnaFinRequired() && 
            !this.isCancel()) {
            if (this.getQnaFin() != null && !this.getQnaFin().equals("") && 
                !this.getQnaFin().equals("0")) {
                //muestraReporte = true;
                return true;
            } else {
                //muestraReporte = false;
                return false;
            }
        }
        return true;
    }
}
