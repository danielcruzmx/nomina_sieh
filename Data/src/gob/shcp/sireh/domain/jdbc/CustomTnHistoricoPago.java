package gob.shcp.sireh.domain.jdbc;

import gob.shcp.fsn.data.Domain;

import java.io.Serializable;

public class CustomTnHistoricoPago extends TnHistoricoPago implements Domain, 
                                                                      Serializable {

    private String descTipoNomina;
    private String descSitPago;
    private String descGrupoPago;
    private String descNombramiento;
    private String descJerarquia;
    private String descBancos;
    private String neto;
    private String periodo;
    private String labelPeriodo;

    public void setDescTipoNomina(String descTipoNomina) {
        this.descTipoNomina = descTipoNomina;
    }

    public String getDescTipoNomina() {
        return descTipoNomina;
    }

    public void setDescSitPago(String descSitPago) {
        this.descSitPago = descSitPago;
    }

    public String getDescSitPago() {
        return descSitPago;
    }

    public void setDescGrupoPago(String descGrupoPago) {
        this.descGrupoPago = descGrupoPago;
    }

    public String getDescGrupoPago() {
        return descGrupoPago;
    }

    public void setDescNombramiento(String descNombramiento) {
        this.descNombramiento = descNombramiento;
    }

    public String getDescNombramiento() {
        return descNombramiento;
    }

    public void setDescJerarquia(String descJerarquia) {
        this.descJerarquia = descJerarquia;
    }

    public String getDescJerarquia() {
        return descJerarquia;
    }

    public void setDescBancos(String descBancos) {
        this.descBancos = descBancos;
    }

    public String getDescBancos() {
        return descBancos;
    }

    public void setNeto(String neto) {
        this.neto = neto;
    }

    public String getNeto() {
        return neto;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setLabelPeriodo(String labelPeriodo) {
        this.labelPeriodo = labelPeriodo;
    }

    public String getLabelPeriodo() {
        return labelPeriodo;
    }
}
