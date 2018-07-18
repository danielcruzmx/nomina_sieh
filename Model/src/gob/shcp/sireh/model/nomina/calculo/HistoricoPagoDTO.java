package gob.shcp.sireh.model.nomina.calculo;

import gob.shcp.fsn.model.Model;

import gob.shcp.sireh.model.TnConceptoPagadoDTO;

import java.io.Serializable;

import java.util.Date;
import java.util.List;

public class HistoricoPagoDTO implements Serializable, Model {

    private String rfcEmpleado;
    private Integer idPlaza;
    private Integer idUnidadNomb;
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

    private List<TnConceptoPagadoDTO> conceptosPagados;
    private List<QuincenaDTO> quincenas;
    
    // Otros
    private String compatEmpleo;
    private Integer idZonaDistNom;
    private String idNivelPre;
    private String DescTipoPago;

    public HistoricoPagoDTO() {
    }

    public boolean tieneConcepto(String tipo, String cpto) {
        boolean ret = false;
        String tipoCpto = tipo.trim() + cpto.trim();
        for (TnConceptoPagadoDTO c: conceptosPagados) {
            String codigo = c.getIdTipoCpto().trim() + c.getIdTipoCpto().trim();
            if (codigo.equals(tipoCpto)) {
                ret = true;
                break;
            }
        }
        return ret;
    }

    public Double montoConcepto(String tipo, String cpto) {
        Double ret = 0.0;
        String tipoCpto = tipo.trim() + cpto.trim();
        for (TnConceptoPagadoDTO c: conceptosPagados) {
            String codigo = c.getIdTipoCpto().trim() + c.getIdTipoCpto().trim();
            if (codigo.equals(tipoCpto)) {
                ret = c.getCpMonto();
                break;
            }
        }
        return ret;
    }

    public void calculaLiquido() {
        Double percepciones = 0.0;
        Double deducciones = 0.0;
        for (TnConceptoPagadoDTO cp: conceptosPagados) {
            if (cp.getIdTipoCpto().contains("P"))
                percepciones = percepciones + cp.getCpMonto();
            if (cp.getIdTipoCpto().contains("D"))
                deducciones = deducciones + cp.getCpMonto();
        }
        this.setLiquido(percepciones - deducciones);
    }

    public String getRfcEmpleado() {
        return rfcEmpleado;
    }

    public void setRfcEmpleado(String rfcEmpleado) {
        this.rfcEmpleado = rfcEmpleado;
    }

    public Integer getIdPlaza() {
        return idPlaza;
    }

    public void setIdPlaza(Integer idPlaza) {
        this.idPlaza = idPlaza;
    }

    public Integer getIdUnidadNomb() {
        return idUnidadNomb;
    }

    public void setIdUnidadNomb(Integer idUnidadNomb) {
        this.idUnidadNomb = idUnidadNomb;
    }

    public String getIdGrupoPago() {
        return idGrupoPago;
    }

    public void setIdGrupoPago(String idGrupoPago) {
        this.idGrupoPago = idGrupoPago;
    }

    public String getDescGrupoPago() {
        return descGrupoPago;
    }

    public void setDescGrupoPago(String descGrupoPago) {
        this.descGrupoPago = descGrupoPago;
    }

    public String getIdNivelPto() {
        return idNivelPto;
    }

    public void setIdNivelPto(String idNivelPto) {
        this.idNivelPto = idNivelPto;
    }

    public String getIdNombramiento() {
        return idNombramiento;
    }

    public void setIdNombramiento(String idNombramiento) {
        this.idNombramiento = idNombramiento;
    }

    public String getDescNombramiento() {
        return descNombramiento;
    }

    public void setDescNombramiento(String descNombramiento) {
        this.descNombramiento = descNombramiento;
    }

    public String getIdJerarquia() {
        return idJerarquia;
    }

    public void setIdJerarquia(String idJerarquia) {
        this.idJerarquia = idJerarquia;
    }

    public String getDescJerarquia() {
        return descJerarquia;
    }

    public void setDescJerarquia(String descJerarquia) {
        this.descJerarquia = descJerarquia;
    }

    public double getTabSueldo() {
        return tabSueldo;
    }

    public void setTabSueldo(double tabSueldo) {
        this.tabSueldo = tabSueldo;
    }

    public double getTabCompensacion() {
        return tabCompensacion;
    }

    public void setTabCompensacion(double tabCompensacion) {
        this.tabCompensacion = tabCompensacion;
    }

    public String getErario() {
        return erario;
    }

    public void setErario(String erario) {
        this.erario = erario;
    }

    public List<TnConceptoPagadoDTO> getConceptosPagados() {
        return conceptosPagados;
    }

    public void setConceptosPagados(List<TnConceptoPagadoDTO> conceptosPagados) {
        this.conceptosPagados = conceptosPagados;
    }

    public double getLiquido() {
        return liquido;
    }

    public void setLiquido(double liquido) {
        this.liquido = liquido;
    }

    public boolean getPension() {
        return pension;
    }

    public void setPension(boolean pension) {
        this.pension = pension;
    }

    public int getNumQuincena() {
        return numQuincena;
    }

    public void setNumQuincena(int numQuincena) {
        this.numQuincena = numQuincena;
    }

    public String getCotiza() {
        return cotiza;
    }

    public void setCotiza(String cotizaIssste) {
        this.cotiza = cotizaIssste;
    }

    public double getTabSueldoPre() {
        return tabSueldoPre;
    }

    public void setTabSueldoPre(double tabSueldoPre) {
        this.tabSueldoPre = tabSueldoPre;
    }

    public Double getIncentivo() {
        return incentivo;
    }

    public void setIncentivo(Double incentivo) {
        this.incentivo = incentivo;
    }

    public java.util.Date getFecIniPago() {
        return fecIniPago;
    }

    public void setFecIniPago(java.util.Date fecIniPago) {
        this.fecIniPago = fecIniPago;
    }

    public java.util.Date getFecFinPago() {
        return fecIniPago;
    }

    public void setFecFinPago(java.util.Date fecFinPago) {
        this.fecIniPago = fecFinPago;
    }

    public List<QuincenaDTO> getQuincenas() {
        return quincenas;
    }

    public void setQuincenas(List<QuincenaDTO> quincenas) {
        this.quincenas = quincenas;
    }
    
    public void setQuincenaPago(int quincenaPago) {
        this.quincenaPago = quincenaPago;
    }

    public int getQuincenaPago() {
        return quincenaPago;
    }

    public void set_fecFinPago(Date _fecFinPago) {
        this.fecFinPago = _fecFinPago;
    }

    public Date get_fecFinPago() {
        return fecFinPago;
    }

    public boolean isPension() {
        return pension;
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
