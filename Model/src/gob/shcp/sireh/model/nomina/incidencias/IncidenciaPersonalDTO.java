package gob.shcp.sireh.model.nomina.incidencias;

import gob.shcp.fsn.model.Model;

import java.util.Date;

public class IncidenciaPersonalDTO implements java.io.Serializable, Model{


    private java.lang.Long idMovtoConceptoPago;
    private java.util.Date mcpFecIncidencia;
    private java.lang.String idConcepto;
    private java.lang.String descConcepto;
    private java.lang.String idSitCaptura;
    private java.lang.String descSitCaptura;
    private java.lang.Double mcpMonto;
    
    

    public IncidenciaPersonalDTO() {
    }

    public void setIdMovtoConceptoPago(Long idMovtoConceptoPago) {
        this.idMovtoConceptoPago = idMovtoConceptoPago;
    }

    public Long getIdMovtoConceptoPago() {
        return idMovtoConceptoPago;
    }



    public void setIdConcepto(String idConcepto) {
        this.idConcepto = idConcepto;
    }

    public String getIdConcepto() {
        return idConcepto;
    }

    public void setDescConcepto(String descConcepto) {
        this.descConcepto = descConcepto;
    }

    public String getDescConcepto() {
        return descConcepto;
    }

    public void setIdSitCaptura(String idSitCaptura) {
        this.idSitCaptura = idSitCaptura;
    }

    public String getIdSitCaptura() {
        return idSitCaptura;
    }

    public void setDescSitCaptura(String descSitCaptura) {
        this.descSitCaptura = descSitCaptura;
    }

    public String getDescSitCaptura() {
        return descSitCaptura;
    }


    public void setMcpFecIncidencia(Date mcpFecIncidencia) {
        this.mcpFecIncidencia = mcpFecIncidencia;
    }

    public Date getMcpFecIncidencia() {
        return mcpFecIncidencia;
    }

    public void setMcpMonto(Double mcpMonto) {
        this.mcpMonto = mcpMonto;
    }

    public Double getMcpMonto() {
        return mcpMonto;
    }
}
