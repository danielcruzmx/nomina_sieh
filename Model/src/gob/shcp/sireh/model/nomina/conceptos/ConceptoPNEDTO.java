package gob.shcp.sireh.model.nomina.conceptos;

import gob.shcp.fsn.model.Model;

import java.io.Serializable;

public class ConceptoPNEDTO implements Model, Serializable{
    private String idTipoCpto;
    private String concepto;
    private String monto;

    public ConceptoPNEDTO() {
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
