package gob.shcp.sireh.domain.jdbc;

import gob.shcp.fsn.data.Domain;

import java.io.Serializable;

public class ConceptoPNE implements Domain, Serializable {
    private String idTipoCpto;
    private String concepto;
    private String monto;

    public ConceptoPNE() {
    }

    public void setIdentity(Serializable id) {
    }

    public Serializable getIdentity() {
        return null;
    }

    public void setIdTipoCpto(String idTipoCpto) {
        this.idTipoCpto = idTipoCpto;
    }

    public String getIdTipoCpto() {
        return idTipoCpto;
    }

    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }

    public String getConcepto() {
        return concepto;
    }

    public void setMonto(String monto) {
        this.monto = monto;
    }

    public String getMonto() {
        return monto;
    }
}
