package gob.shcp.sireh.domain.jdbc;

import gob.shcp.fsn.data.Domain;

import java.io.Serializable;

public class TotalRegistrosExpediente implements Domain, Serializable {

    private java.lang.Integer totalParentesco;
    private java.lang.Integer totalRegistrados;
    private java.lang.Integer totalActivos;
    private java.lang.Integer totalRechazados;
    private java.lang.Integer totalHistorico;

    public void setTotalRegistrados(Integer totalRegistrados) {
        this.totalRegistrados = totalRegistrados;
    }

    public Integer getTotalRegistrados() {
        return totalRegistrados;
    }

    public void setTotalActivos(Integer totalActivos) {
        this.totalActivos = totalActivos;
    }

    public Integer getTotalActivos() {
        return totalActivos;
    }

    public void setTotalRechazados(Integer totalRechazados) {
        this.totalRechazados = totalRechazados;
    }

    public Integer getTotalRechazados() {
        return totalRechazados;
    }

    public void setTotalHistorico(Integer totalHistorico) {
        this.totalHistorico = totalHistorico;
    }

    public Integer getTotalHistorico() {
        return totalHistorico;
    }

    public void setIdentity(Serializable id) {
    }

    public Serializable getIdentity() {
        return null;
    }

    public void setTotalParentesco(Integer totalParentesco) {
        this.totalParentesco = totalParentesco;
    }

    public Integer getTotalParentesco() {
        return totalParentesco;
    }
}
