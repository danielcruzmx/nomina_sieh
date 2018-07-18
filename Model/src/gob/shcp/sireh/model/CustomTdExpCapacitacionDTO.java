package gob.shcp.sireh.model;

import gob.shcp.fsn.model.Model;

public class CustomTdExpCapacitacionDTO extends TdExpCapacitacionDTO implements java.io.Serializable, Model {
    private String descRechazo;
    private String nivelCapacitacion;
    private String descCapacitacion;
    private String descInstEducat;
    private String desStatus;

    public void setDescRechazo(String descRechazo) {
        this.descRechazo = descRechazo;
    }

    public String getDescRechazo() {
        return descRechazo;
    }

    public void setNivelCapacitacion(String nivelCapacitacion) {
        this.nivelCapacitacion = nivelCapacitacion;
    }

    public String getNivelCapacitacion() {
        return nivelCapacitacion;
    }

    public void setDescCapacitacion(String descCapacitacion) {
        this.descCapacitacion = descCapacitacion;
    }

    public String getDescCapacitacion() {
        return descCapacitacion;
    }

    public void setDescInstEducat(String descInstEducat) {
        this.descInstEducat = descInstEducat;
    }

    public String getDescInstEducat() {
        return descInstEducat;
    }

    public void setDesStatus(String desStatus) {
        this.desStatus = desStatus;
    }

    public String getDesStatus() {
        return desStatus;
    }
}
