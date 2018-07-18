package gob.shcp.sireh.model.spc.reportes;

import gob.shcp.fsn.model.Model;

import java.io.Serializable;

public class CustomAcuerdosFileDTO implements Serializable, Model {


     private String descEjeTematico;
     private Integer totalInscritos;
     private Integer cursosImpartidos;
     private Integer totalAcreditados;


    public void setDescEjeTematico(String descEjeTematico) {
        this.descEjeTematico = descEjeTematico;
    }

    public String getDescEjeTematico() {
        return descEjeTematico;
    }

    public void setTotalInscritos(Integer totalInscritos) {
        this.totalInscritos = totalInscritos;
    }

    public Integer getTotalInscritos() {
        return totalInscritos;
    }

    public void setCursosImpartidos(Integer cursosImpartidos) {
        this.cursosImpartidos = cursosImpartidos;
    }

    public Integer getCursosImpartidos() {
        return cursosImpartidos;
    }

    public void setTotalAcreditados(Integer totalAcreditados) {
        this.totalAcreditados = totalAcreditados;
    }

    public Integer getTotalAcreditados() {
        return totalAcreditados;
    }
}
