package gob.shcp.sireh.domain.jdbc;

import gob.shcp.fsn.data.Domain;

import java.io.Serializable;

public class CustomTnMovtoConceptoPago extends TnMovtoConceptoPago implements Domain, 
                                                                              Serializable {

    private String descSitCaptura;
    private String descTercero;
    private String descTipoConcepto;
    private String descConPag;
    private String montof;
    private String porcentajef;
    private String qnaAplicadasf;

    public void setDescSitCaptura(String descSitCaptura) {
        this.descSitCaptura = descSitCaptura;
    }

    public String getDescSitCaptura() {
        return descSitCaptura;
    }

    public void setDescTercero(String descTercero) {
        this.descTercero = descTercero;
    }

    public String getDescTercero() {
        return descTercero;
    }

    public void setDescTipoConcepto(String descTipoConcepto) {
        this.descTipoConcepto = descTipoConcepto;
    }

    public String getDescTipoConcepto() {
        return descTipoConcepto;
    }

    public void setDescConPag(String descConPag) {
        this.descConPag = descConPag;
    }

    public String getDescConPag() {
        return descConPag;
    }

    public void setMontof(String montof) {
        this.montof = montof;
    }

    public String getMontof() {
        return montof;
    }

    public void setPorcentajef(String porcentajef) {
        this.porcentajef = porcentajef;
    }

    public String getPorcentajef() {
        return porcentajef;
    }

    public void setQnaAplicadasf(String qnaAplicadasf) {
        this.qnaAplicadasf = qnaAplicadasf;
    }

    public String getQnaAplicadasf() {
        return qnaAplicadasf;
    }
}
