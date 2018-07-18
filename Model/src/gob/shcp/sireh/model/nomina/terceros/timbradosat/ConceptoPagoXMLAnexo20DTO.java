package gob.shcp.sireh.model.nomina.terceros.timbradosat;

import gob.shcp.fsn.model.Model;

import java.math.BigDecimal;

public class ConceptoPagoXMLAnexo20DTO implements Model, java.io.Serializable {
    private String  tipoPercepcion;
    private String  tipoDeduccion;
    private String  cveCptoTimbrado;
    private String  descripcionCpto;
    private String  tipoCptoNom;
    private String  cveCptoNom;
    private Integer numCpto;
    private BigDecimal  montoCpto;
    private String  tieneIsr;
    private BigDecimal  montoGravado;
    private BigDecimal  montoExento;

    public void setTipoPercepcion(String tipoPercepcion) {
        this.tipoPercepcion = tipoPercepcion;
    }

    public String getTipoPercepcion() {
        return tipoPercepcion;
    }

    public void setTipoDeduccion(String tipoDeduccion) {
        this.tipoDeduccion = tipoDeduccion;
    }

    public String getTipoDeduccion() {
        return tipoDeduccion;
    }

    public void setCveCptoTimbrado(String cveCptoTimbrado) {
        this.cveCptoTimbrado = cveCptoTimbrado;
    }

    public String getCveCptoTimbrado() {
        return cveCptoTimbrado;
    }

    public void setDescripcionCpto(String descripcionCpto) {
        this.descripcionCpto = descripcionCpto;
    }

    public String getDescripcionCpto() {
        return descripcionCpto;
    }

    public void setTipoCptoNom(String tipoCptoNom) {
        this.tipoCptoNom = tipoCptoNom;
    }

    public String getTipoCptoNom() {
        return tipoCptoNom;
    }

    public void setCveCptoNom(String cveCptoNom) {
        this.cveCptoNom = cveCptoNom;
    }

    public String getCveCptoNom() {
        return cveCptoNom;
    }

    public void setNumCpto(Integer numCpto) {
        this.numCpto = numCpto;
    }

    public Integer getNumCpto() {
        return numCpto;
    }

    public void setMontoCpto(BigDecimal montoCpto) {
        this.montoCpto = montoCpto;
    }

    public BigDecimal getMontoCpto() {
        return montoCpto;
    }

    public void setTieneIsr(String tieneIsr) {
        this.tieneIsr = tieneIsr;
    }

    public String getTieneIsr() {
        return tieneIsr;
    }

    public void setMontoGravado(BigDecimal montoGravado) {
        this.montoGravado = montoGravado;
    }

    public BigDecimal getMontoGravado() {
        return montoGravado;
    }

    public void setMontoExento(BigDecimal montoExento) {
        this.montoExento = montoExento;
    }

    public BigDecimal getMontoExento() {
        return montoExento;
    }
}
