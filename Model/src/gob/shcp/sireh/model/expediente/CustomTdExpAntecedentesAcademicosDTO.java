package gob.shcp.sireh.model.expediente;

import gob.shcp.fsn.model.Model;
import gob.shcp.sireh.model.expediente.gestion.documentos.ExpedienteDatosAcademicosDTO;

import java.util.Date;

public class CustomTdExpAntecedentesAcademicosDTO extends ExpedienteDatosAcademicosDTO implements java.io.Serializable, Model {
    private String  descInstEducat;
    private String  idDocto;
    private Long    accSecuencia;
    private String  descRechazo;
    private String  descNivelEscolar;
    private String  descProfnCarrera;
    private String  desStatus;
    
    private Float   aacPromedio;
    private Integer aacCedProfesional;
    private String  aacDoctoRef;
    private String  aacEstConcluidos;
    private Date    fecModifico;
    
    
    

    public void setDescInstEducat(String descInstEducat) {
        this.descInstEducat = descInstEducat;
    }

    public String getDescInstEducat() {
        return descInstEducat;
    }

    public void setIdDocto(String idDocto) {
        this.idDocto = idDocto;
    }

    public String getIdDocto() {
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

    public void setAacDoctoRef(String aacDoctoRef) {
        this.aacDoctoRef = aacDoctoRef;
    }

    public String getAacDoctoRef() {
        return aacDoctoRef;
    }

    public void setAacEstConcluidos(String aacEstConcluidos) {
        this.aacEstConcluidos = aacEstConcluidos;
    }

    public String getAacEstConcluidos() {
        return aacEstConcluidos;
    }

    public void setFecModifico(Date fecModifico) {
        this.fecModifico = fecModifico;
    }

    public Date getFecModifico() {
        return fecModifico;
    }

    public void setAacPromedio(Float aacPromedio) {
        this.aacPromedio = aacPromedio;
    }

    public Float getAacPromedio() {
        return aacPromedio;
    }

    public void setAacCedProfesional(Integer aacCedProfesional) {
        this.aacCedProfesional = aacCedProfesional;
    }

    public Integer getAacCedProfesional() {
        return aacCedProfesional;
    }
}
