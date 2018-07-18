package gob.shcp.sireh.domain.jdbc;

import gob.shcp.fsn.data.Domain;

import java.io.Serializable;

import java.math.BigDecimal;

public class CustomTnConceptoPagadoXML implements Domain, Serializable {
    private Integer folio;
    private Integer difFolio;
    private Integer numConcepto;
    private String  rfc;
    private String  tipoCpto;
    private String  cptoPago;
    private String  idCptoPago;
    private BigDecimal  monto;
    private String  descripcion;
    private String  cveSat;
    private String  tieneIsr;

    public void setFolio(Integer folio) {
        this.folio = folio;
    }

    public Integer getFolio() {
        return folio;
    }

    public void setDifFolio(Integer difFolio) {
        this.difFolio = difFolio;
    }

    public Integer getDifFolio() {
        return difFolio;
    }

    public void setNumConcepto(Integer numConcepto) {
        this.numConcepto = numConcepto;
    }

    public Integer getNumConcepto() {
        return numConcepto;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    public String getRfc() {
        return rfc;
    }

    public void setTipoCpto(String tipoCpto) {
        this.tipoCpto = tipoCpto;
    }

    public String getTipoCpto() {
        return tipoCpto;
    }

    public void setCptoPago(String cptoPago) {
        this.cptoPago = cptoPago;
    }

    public String getCptoPago() {
        return cptoPago;
    }

    public void setMonto(BigDecimal monto) {
        this.monto = monto;
    }

    public BigDecimal getMonto() {
        return monto;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setCveSat(String cveSat) {
        this.cveSat = cveSat;
    }

    public String getCveSat() {
        return cveSat;
    }

    public void setTieneIsr(String tieneIsr) {
        this.tieneIsr = tieneIsr;
    }

    public String getTieneIsr() {
        return tieneIsr;
    }

    public void setIdentity(Serializable id) {
    }

    public Serializable getIdentity() {
        return null;
    }

    public void setIdCptoPago(String idCptoPago) {
        this.idCptoPago = idCptoPago;
    }

    public String getIdCptoPago() {
        return idCptoPago;
    }
}
