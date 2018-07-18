package gob.shcp.sireh.domain.jdbc;

import gob.shcp.fsn.data.Domain;

import java.io.Serializable;

import java.util.Date;

public class HistoricoPago implements Domain, Serializable {

    private String rfcEmpleado;
    private Integer idPlaza;
    private String idUnidadNomb;
    private String idGrupoPago;
    private String descGrupoPago;
    private String idNivelPto;
    private String idNombramiento;
    private String descNombramiento;
    private String idJerarquia;
    private String descJerarquia;
    private double tabSueldo;
    private double tabCompensacion;
    private String erario;
    private double tabSueldoPre;
    private String cotiza;
    private double incentivo;
    private int quincenaPago;
    private java.util.Date fecIniPago;
    private java.util.Date fecFinPago;

    private int numQuincena;
    private boolean pension;
    private double liquido;

    // Otros
    private String compatEmpleo;
    private Integer idZonaDistNom;
    private String idNivelPre;
    private String DescTipoPago;

    public void setRfcEmpleado(String rfcEmpleado) {
        this.rfcEmpleado = rfcEmpleado;
    }

    public String getRfcEmpleado() {
        return rfcEmpleado;
    }

    public void setIdPlaza(Integer idPlaza) {
        this.idPlaza = idPlaza;
    }

    public Integer getIdPlaza() {
        return idPlaza;
    }

    public void setIdUnidadNomb(String idUnidadNomb) {
        this.idUnidadNomb = idUnidadNomb;
    }

    public String getIdUnidadNomb() {
        return idUnidadNomb;
    }

    public void setIdGrupoPago(String idGrupoPago) {
        this.idGrupoPago = idGrupoPago;
    }

    public String getIdGrupoPago() {
        return idGrupoPago;
    }

    public void setDescGrupoPago(String descGrupoPago) {
        this.descGrupoPago = descGrupoPago;
    }

    public String getDescGrupoPago() {
        return descGrupoPago;
    }

    public void setIdNivelPto(String idNivelPto) {
        this.idNivelPto = idNivelPto;
    }

    public String getIdNivelPto() {
        return idNivelPto;
    }

    public void setIdNombramiento(String idNombramiento) {
        this.idNombramiento = idNombramiento;
    }

    public String getIdNombramiento() {
        return idNombramiento;
    }

    public void setDescNombramiento(String descNombramiento) {
        this.descNombramiento = descNombramiento;
    }

    public String getDescNombramiento() {
        return descNombramiento;
    }

    public void setIdJerarquia(String idJerarquia) {
        this.idJerarquia = idJerarquia;
    }

    public String getIdJerarquia() {
        return idJerarquia;
    }

    public void setDescJerarquia(String descJerarquia) {
        this.descJerarquia = descJerarquia;
    }

    public String getDescJerarquia() {
        return descJerarquia;
    }

    public void setTabSueldo(double tabSueldo) {
        this.tabSueldo = tabSueldo;
    }

    public double getTabSueldo() {
        return tabSueldo;
    }

    public void setTabCompensacion(double tabCompensacion) {
        this.tabCompensacion = tabCompensacion;
    }

    public double getTabCompensacion() {
        return tabCompensacion;
    }

    public void setErario(String erario) {
        this.erario = erario;
    }

    public String getErario() {
        return erario;
    }

    public void setTabSueldoPre(double tabSueldoPre) {
        this.tabSueldoPre = tabSueldoPre;
    }

    public double getTabSueldoPre() {
        return tabSueldoPre;
    }

    public void setCotiza(String cotiza) {
        this.cotiza = cotiza;
    }

    public String getCotiza() {
        return cotiza;
    }

    public void setIncentivo(double incentivo) {
        this.incentivo = incentivo;
    }

    public double getIncentivo() {
        return incentivo;
    }

    public void setQuincenaPago(int quincenaPago) {
        this.quincenaPago = quincenaPago;
    }

    public int getQuincenaPago() {
        return quincenaPago;
    }

    public void setFecIniPago(Date fecIniPago) {
        this.fecIniPago = fecIniPago;
    }

    public Date getFecIniPago() {
        return fecIniPago;
    }

    public void setFecFinPago(Date fecFinPago) {
        this.fecFinPago = fecFinPago;
    }

    public Date getFecFinPago() {
        return fecFinPago;
    }

    public void setNumQuincena(int numQuincena) {
        this.numQuincena = numQuincena;
    }

    public int getNumQuincena() {
        return numQuincena;
    }

    public void setPension(boolean pension) {
        this.pension = pension;
    }

    public boolean isPension() {
        return pension;
    }

    public void setLiquido(double liquido) {
        this.liquido = liquido;
    }

    public double getLiquido() {
        return liquido;
    }

    public void setIdentity(Serializable id) {
    }

    public Serializable getIdentity() {
        return null;
    }

    public void setCompatEmpleo(String compatEmpleo) {
        this.compatEmpleo = compatEmpleo;
    }

    public String getCompatEmpleo() {
        return compatEmpleo;
    }

    public void setIdZonaDistNom(Integer idZonaDistNom) {
        this.idZonaDistNom = idZonaDistNom;
    }

    public Integer getIdZonaDistNom() {
        return idZonaDistNom;
    }

    public void setIdNivelPre(String idNivelPre) {
        this.idNivelPre = idNivelPre;
    }

    public String getIdNivelPre() {
        return idNivelPre;
    }

    public void setDescTipoPago(String descTipoPago) {
        this.DescTipoPago = descTipoPago;
    }

    public String getDescTipoPago() {
        return DescTipoPago;
    }
}
