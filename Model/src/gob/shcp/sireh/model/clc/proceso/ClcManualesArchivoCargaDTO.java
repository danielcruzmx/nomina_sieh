package gob.shcp.sireh.model.clc.proceso;

import gob.shcp.fsn.model.Model;

public class ClcManualesArchivoCargaDTO implements java.io.Serializable, Model {
    
    private Integer unidad;
    private Integer estado;
    private double monto;
    private Integer partida;
    private String tipoCpto;
    private Integer tipoMovto;

    public Integer getUnidad() {
        return unidad;
    }

    public void setUnidad(Integer unidad) {
        this.unidad = unidad;
    }

    public Integer getEstado() {
        return estado;
    }

    public void setEstado(Integer estado) {
        this.estado = estado;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public Integer getPartida() {
        return partida;
    }

    public void setPartida(Integer partida) {
        this.partida = partida;
    }

    public String getTipoCpto() {
        return tipoCpto;
    }

    public void setTipoCpto(String tipoCpto) {
        this.tipoCpto = tipoCpto;
    }

    public Integer getTipoMovto() {
        return tipoMovto;
    }

    public void setTipoMovto(Integer tipoMovto) {
        this.tipoMovto = tipoMovto;
    }
}
