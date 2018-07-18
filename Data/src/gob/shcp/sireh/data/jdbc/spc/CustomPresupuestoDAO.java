package gob.shcp.sireh.data.jdbc.spc;

import gob.shcp.fsn.data.Domain;

import gob.shcp.sireh.domain.jdbc.spc.TnCapCurso;

import java.io.Serializable;

public class CustomPresupuestoDAO extends TnCapCurso implements Domain, Serializable {

    private java.lang.String descProveedor;
    private java.lang.String servicio;
    private java.lang.Double montoEstimado;
    private java.lang.String contratoCursoNumero;
    private java.lang.Integer cursos;


    public void setDescProveedor(String descProveedor) {
        this.descProveedor = descProveedor;
    }

    public String getDescProveedor() {
        return descProveedor;
    }

    public void setServicio(String servicio) {
        this.servicio = servicio;
    }

    public String getServicio() {
        return servicio;
    }

    public void setMontoEstimado(Double montoEstimado) {
        this.montoEstimado = montoEstimado;
    }

    public Double getMontoEstimado() {
        return montoEstimado;
    }

    public void setContratoCursoNumero(String contratoCursoNumero) {
        this.contratoCursoNumero = contratoCursoNumero;
    }

    public String getContratoCursoNumero() {
        return contratoCursoNumero;
    }

    public void setCursos(Integer cursos) {
        this.cursos = cursos;
    }

    public Integer getCursos() {
        return cursos;
    }
}
