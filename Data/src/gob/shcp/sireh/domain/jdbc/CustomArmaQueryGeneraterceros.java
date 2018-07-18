package gob.shcp.sireh.domain.jdbc;

import gob.shcp.fsn.data.Domain;
import gob.shcp.fsn.model.Model;

import java.io.Serializable;

public class CustomArmaQueryGeneraterceros implements Domain, Serializable {

    private String idTercero;
    private String datTipoCpto;
    private String datConcepto;
    private Integer datSecuencia;
    private String datClaseReg;
    private String datCampo;
    private String datTipoCampo;
    private String datFormatoCampo;
    private Integer datLongitudCampo;
    private String datAliasCampo;
    private String datTabla;

    public void setIdTercero(String idTercero) {
        this.idTercero = idTercero;
    }

    public String getIdTercero() {
        return idTercero;
    }

    public void setIdentity(Serializable id) {
    }

    public Serializable getIdentity() {
        return null;
    }

    public void setDatTipoCpto(String datTipoCpto) {
        this.datTipoCpto = datTipoCpto;
    }

    public String getDatTipoCpto() {
        return datTipoCpto;
    }

    public void setDatConcepto(String datConcepto) {
        this.datConcepto = datConcepto;
    }

    public String getDatConcepto() {
        return datConcepto;
    }

    public void setDatSecuencia(Integer datSecuencia) {
        this.datSecuencia = datSecuencia;
    }

    public Integer getDatSecuencia() {
        return datSecuencia;
    }

    public void setDatClaseReg(String datClaseReg) {
        this.datClaseReg = datClaseReg;
    }

    public String getDatClaseReg() {
        return datClaseReg;
    }

    public void setDatCampo(String datCampo) {
        this.datCampo = datCampo;
    }

    public String getDatCampo() {
        return datCampo;
    }

    public void setDatFormatoCampo(String datFormatoCampo) {
        this.datFormatoCampo = datFormatoCampo;
    }

    public String getDatFormatoCampo() {
        return datFormatoCampo;
    }

    public void setDatLongitudCampo(Integer datLongitudCampo) {
        this.datLongitudCampo = datLongitudCampo;
    }

    public Integer getDatLongitudCampo() {
        return datLongitudCampo;
    }

    public void setDatAliasCampo(String datAliasCampo) {
        this.datAliasCampo = datAliasCampo;
    }

    public String getDatAliasCampo() {
        return datAliasCampo;
    }

    public void setDatTabla(String datTabla) {
        this.datTabla = datTabla;
    }

    public String getDatTabla() {
        return datTabla;
    }

    public void setDatTipoCampo(String datTipoCampo) {
        this.datTipoCampo = datTipoCampo;
    }

    public String getDatTipoCampo() {
        return datTipoCampo;
    }
}
