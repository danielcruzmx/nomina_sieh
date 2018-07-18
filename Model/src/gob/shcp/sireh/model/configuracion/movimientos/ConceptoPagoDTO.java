package gob.shcp.sireh.model.configuracion.movimientos;

import gob.shcp.fsn.model.Model;

import java.io.Serializable;

public class ConceptoPagoDTO
    implements Serializable, Model  {
    
    private String idTipoConcepto;
    private String idConceptoPago;

    private String prioridad;
    private String descConPag;
    private String isr;

    private String conPension;
    
    public ConceptoPagoDTO() {
    }

    public void setIdTipoConcepto(String idTipoConcepto) {
        this.idTipoConcepto = idTipoConcepto;
    }

    public String getIdTipoConcepto() {
        return idTipoConcepto;
    }

    public void setIdConceptoPago(String idConceptoPago) {
        this.idConceptoPago = idConceptoPago;
    }

    public String getIdConceptoPago() {
        return idConceptoPago;
    }

    public void setPrioridad(String prioridad) {
        this.prioridad = prioridad;
    }

    public String getPrioridad() {
        return prioridad;
    }

    public void setDescConPag(String descConPag) {
        this.descConPag = descConPag;
    }

    public String getDescConPag() {
        return descConPag;
    }

    public void setIsr(String isr) {
        this.isr = isr;
    }

    public String getIsr() {
        return isr;
    }

    public void setConPension(String conPension) {
        this.conPension = conPension;
    }

    public String getConPension() {
        return conPension;
    }
}
