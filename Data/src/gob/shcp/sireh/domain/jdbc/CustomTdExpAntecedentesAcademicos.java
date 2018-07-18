package gob.shcp.sireh.domain.jdbc;

import gob.shcp.fsn.data.Domain;

import java.io.Serializable;

public class CustomTdExpAntecedentesAcademicos extends TdExpAntecedentesAcademicos implements Domain, Serializable {
    private String  descInstEducat;
    private String  idDocto;
    private Long    accSecuencia;
    private String  descRechazo;
    private String  descNivelEscolar;
    private String  descProfnCarrera;
    private String  desStatus;


    public void setDescInstEducat(String descInstEducat) {
        this.descInstEducat = descInstEducat;
    }

    public String getDescInstEducat() {
        return descInstEducat;
    }

    public void set_idDocto(String _idDocto) {
        this.idDocto = _idDocto;
    }

    public String get_idDocto() {
        return idDocto;
    }

    public void setAccSecuencia(Long accSecuencia) {
        this.accSecuencia = accSecuencia;
    }

    public Long getAccSecuencia() {
        return accSecuencia;
    }

    public void setDescRechazo(String descRechazo) {
        this.descRechazo = descRechazo;
    }

    public String getDescRechazo() {
        return descRechazo;
    }

    public void setDescNivelEscolar(String descNivelEscolar) {
        this.descNivelEscolar = descNivelEscolar;
    }

    public String getDescNivelEscolar() {
        return descNivelEscolar;
    }

    public void setDescProfnCarrera(String descProfnCarrera) {
        this.descProfnCarrera = descProfnCarrera;
    }

    public String getDescProfnCarrera() {
        return descProfnCarrera;
    }

    public void setDesStatus(String desStatus) {
        this.desStatus = desStatus;
    }

    public String getDesStatus() {
        return desStatus;
    }
}
