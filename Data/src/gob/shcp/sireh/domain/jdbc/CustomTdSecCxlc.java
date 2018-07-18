package gob.shcp.sireh.domain.jdbc;

import gob.shcp.fsn.data.Domain;

import java.io.Serializable;

public class CustomTdSecCxlc extends TdSecCxlc implements Domain, 
                                                          Serializable {

    private java.lang.Double monto;
    private java.lang.Integer devengado;

    public void setMonto(Double monto) {
        this.monto = monto;
    }

    public Double getMonto() {
        return monto;
    }

    public void setDevengado(Integer devengado) {
        this.devengado = devengado;
    }

    public Integer getDevengado() {
        return devengado;
    }
}
