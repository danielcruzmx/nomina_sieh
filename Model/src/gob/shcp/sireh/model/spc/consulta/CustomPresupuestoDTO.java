package gob.shcp.sireh.model.spc.consulta;

import gob.shcp.fsn.model.Model;

import gob.shcp.sireh.model.spc.TnCapCursoDTO;

public class CustomPresupuestoDTO extends TnCapCursoDTO implements java.io.Serializable, Model {

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
