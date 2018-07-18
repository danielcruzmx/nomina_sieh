package gob.shcp.sireh.model.expediente;

import gob.shcp.fsn.model.Model;
import gob.shcp.sireh.model.nomina.TnMovtoConceptoPagoDTO;


public class CustomTnMovtoConceptoPagoDTO extends TnMovtoConceptoPagoDTO  implements java.io.Serializable, Model{
    
    private String descSitCaptura;
    private String descTercero;
    private String descTipoConcepto;
    private String descConPag;
    private String montof;
    private String porcentajef;
    private String qnaAplicadasf;
    
    //Etiquetas
    private String montoLabel;


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

    public void setMontoLabel(String montoLabel) {
        this.montoLabel = montoLabel;
    }

    public String getMontoLabel() {
        return montoLabel;
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
