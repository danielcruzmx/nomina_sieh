package gob.shcp.sireh.model.clc.consulta;

import gob.shcp.fsn.model.Model;

import java.util.List;

public class ejercidoCptoPagoDTO implements java.io.Serializable, Model {

    //Regla: Nombres de propiedades en minusculas
    private Integer Ciclo;
    private Integer QnaPago;
    private String TipoNomina;
    private Integer Complementos;
    private Integer cuentaNumClc;
    private String situacion;
    private List<Integer> chequeComprobante;
    private Integer cveDifPago;
    private Integer secSagar;
    private String cveUnidad;
    private String cveUnidadEjecuto;
    private Integer cveEstado;
    private String cveFuncion;
    private String cvePrograma;
    private String cveActInsti;
    private String cveActPriorita;
    private String cveActInstiEsp;
    private String cvePartida;
    private Integer cveTipoGasto;
    private Integer cveFuenteFinan;
    private Integer guiaContableEjer;
    private String  cveMov;
    private Integer idSindicato;
    private Integer codigoVerif;
    private String cveTipoCpto;
    private String cveCptoPago;
    private String cveGrupoPago;
    private String ctaClabe;
    private Integer MaestroPto;
    
    //Tabla
    private Integer cxlcCiclo;
    private Integer cxlc;
    private String idTipoNomina;
    private Integer cxlcQnaPago;
    private Integer cxlcComplemento;
    private String cxlcSituacion;
    private Integer scc_folio;
    private Integer sccDifFolio;
    private Integer secCxlc;
    private String idUnidad;
    private String idUnidadEjecuto;
    private Integer idEdo;
    private String idFuncion;
    private String idPrograma;
    private String idActInsti;
    private String idActPriorita;
    private String idActInstiEsp;
    private String idPartida;
    private Integer idTipoGasto;
    private Integer idFuenteFinan;
    private Integer sccGuiaContEjer;
    private String  sccClaveMov;
    private Integer sccIdSindicato;
    private Integer sccCodigoVerif;
    private String idTipoCpto;
    private String idCptoPago;
    private String idGrupoPago;
    private String sccCtaClabe;
    private String cxlcMaestro_Pto;
    private Integer sccMonto;
    
    // Configuracion inicial
    private String seccion;
    private String beanName;
    
    // Navegacion
    private String urlOrigen;
    private String urlDestino;
    
    // Control
    private boolean cancel;
    private boolean muestraRegistros;
    private boolean registroCLC;
    private boolean casosImpuestos;
    
    public ejercidoCptoPagoDTO() {
    }

    public void setCiclo(Integer ciclo) {
        this.Ciclo = ciclo;
    }

    public Integer getCiclo() {
        return Ciclo;
    }

    public void setQnaPago(Integer qnaPago) {
        this.QnaPago = qnaPago;
    }

    public Integer getQnaPago() {
        return QnaPago;
    }

    public void setTipoNomina(String tipoNomina) {
        this.TipoNomina = tipoNomina;
    }

    public String getTipoNomina() {
        return TipoNomina;
    }

    public void setComplementos(Integer complemento) {
        this.Complementos = complemento;
    }

    public Integer getComplementos() {
        return Complementos;
    }

    public void setCuentaNumClc(Integer cuentaNumClc) {
        this.cuentaNumClc = cuentaNumClc;
    }

    public Integer getCuentaNumClc() {
        return cuentaNumClc;
    }

    public void setSituacion(String situacion) {
        this.situacion = situacion;
    }

    public String getSituacion() {
        return situacion;
    }

    public void setChequeComprobante(List<Integer> chequeComprobante) {
        this.chequeComprobante = chequeComprobante;
    }

    public List<Integer> getChequeComprobante() {
        return chequeComprobante;
    }

    public void setCveDifPago(Integer cveDifPago) {
        this.cveDifPago = cveDifPago;
    }

    public Integer getCveDifPago() {
        return cveDifPago;
    }

    public void setSecSagar(Integer secSagar) {
        this.secSagar = secSagar;
    }

    public Integer getSecSagar() {
        return secSagar;
    }

    public void setCveUnidad(String cveUnidad) {
        this.cveUnidad = cveUnidad;
    }

    public String getCveUnidad() {
        return cveUnidad;
    }

    public void setCveUnidadEjecuto(String cveUnidadEjecuto) {
        this.cveUnidadEjecuto = cveUnidadEjecuto;
    }

    public String getCveUnidadEjecuto() {
        return cveUnidadEjecuto;
    }

    public void setCveEstado(Integer cveEstado) {
        this.cveEstado = cveEstado;
    }

    public Integer getCveEstado() {
        return cveEstado;
    }

    public void setCveFuncion(String cveFuncion) {
        this.cveFuncion = cveFuncion;
    }

    public String getCveFuncion() {
        return cveFuncion;
    }

    public void setCvePrograma(String cvePrograma) {
        this.cvePrograma = cvePrograma;
    }

    public String getCvePrograma() {
        return cvePrograma;
    }

    public void setCveActInsti(String cveActInsti) {
        this.cveActInsti = cveActInsti;
    }

    public String getCveActInsti() {
        return cveActInsti;
    }

    public void setCveActPriorita(String cveActPriorita) {
        this.cveActPriorita = cveActPriorita;
    }

    public String getCveActPriorita() {
        return cveActPriorita;
    }

    public void setCveActInstiEsp(String cveActInstiEsp) {
        this.cveActInstiEsp = cveActInstiEsp;
    }

    public String getCveActInstiEsp() {
        return cveActInstiEsp;
    }

    public void setCvePartida(String cvePartida) {
        this.cvePartida = cvePartida;
    }

    public String getCvePartida() {
        return cvePartida;
    }

    public void setCveTipoGasto(Integer cveTipoGasto) {
        this.cveTipoGasto = cveTipoGasto;
    }

    public Integer getCveTipoGasto() {
        return cveTipoGasto;
    }

    public void setCveFuenteFinan(Integer cveFuenteFinan) {
        this.cveFuenteFinan = cveFuenteFinan;
    }

    public Integer getCveFuenteFinan() {
        return cveFuenteFinan;
    }

    public void setGuiaContableEjer(Integer guiaContableEjer) {
        this.guiaContableEjer = guiaContableEjer;
    }

    public Integer getGuiaContableEjer() {
        return guiaContableEjer;
    }

    public void setCveMov(String cveMov) {
        this.cveMov = cveMov;
    }

    public String getCveMov() {
        return cveMov;
    }

    public void setIdSindicato(Integer idSindicato) {
        this.idSindicato = idSindicato;
    }

    public Integer getIdSindicato() {
        return idSindicato;
    }

    public void setCodigoVerif(Integer codigoVerif) {
        this.codigoVerif = codigoVerif;
    }

    public Integer getCodigoVerif() {
        return codigoVerif;
    }

    public void setCveTipoCpto(String cveTipoCpto) {
        this.cveTipoCpto = cveTipoCpto;
    }

    public String getCveTipoCpto() {
        return cveTipoCpto;
    }

    public void setCveCptoPago(String cveCptoPago) {
        this.cveCptoPago = cveCptoPago;
    }

    public String getCveCptoPago() {
        return cveCptoPago;
    }

    public void setCveGrupoPago(String cveGrupoPago) {
        this.cveGrupoPago = cveGrupoPago;
    }

    public String getCveGrupoPago() {
        return cveGrupoPago;
    }

    public void setCtaClabe(String ctaClabe) {
        this.ctaClabe = ctaClabe;
    }

    public String getCtaClabe() {
        return ctaClabe;
    }

    public void setMaestroPto(Integer maestroPto) {
        this.MaestroPto = maestroPto;
    }

    public Integer getMaestroPto() {
        return MaestroPto;
    }

    public void setCxlcCiclo(Integer cxlcCiclo) {
        this.cxlcCiclo = cxlcCiclo;
    }

    public Integer getCxlcCiclo() {
        return cxlcCiclo;
    }

    public void setCxlc(Integer cxlc) {
        this.cxlc = cxlc;
    }

    public Integer getCxlc() {
        return cxlc;
    }

    public void setIdTipoNomina(String idTipoNomina) {
        this.idTipoNomina = idTipoNomina;
    }

    public String getIdTipoNomina() {
        return idTipoNomina;
    }

    public void setCxlcQnaPago(Integer cxlcQnaPago) {
        this.cxlcQnaPago = cxlcQnaPago;
    }

    public Integer getCxlcQnaPago() {
        return cxlcQnaPago;
    }

    public void setCxlcComplemento(Integer cxlcComplemento) {
        this.cxlcComplemento = cxlcComplemento;
    }

    public Integer getCxlcComplemento() {
        return cxlcComplemento;
    }

    public void setCxlcSituacion(String cxlcSituacion) {
        this.cxlcSituacion = cxlcSituacion;
    }

    public String getCxlcSituacion() {
        return cxlcSituacion;
    }

    public void setScc_folio(Integer scc_folio) {
        this.scc_folio = scc_folio;
    }

    public Integer getScc_folio() {
        return scc_folio;
    }

    public void setSccDifFolio(Integer sccDifFolio) {
        this.sccDifFolio = sccDifFolio;
    }

    public Integer getSccDifFolio() {
        return sccDifFolio;
    }

    public void setSecCxlc(Integer secCxlc) {
        this.secCxlc = secCxlc;
    }

    public Integer getSecCxlc() {
        return secCxlc;
    }

    public void setIdUnidad(String idUnidad) {
        this.idUnidad = idUnidad;
    }

    public String getIdUnidad() {
        return idUnidad;
    }

    public void setIdUnidadEjecuto(String idUnidadEjecuto) {
        this.idUnidadEjecuto = idUnidadEjecuto;
    }

    public String getIdUnidadEjecuto() {
        return idUnidadEjecuto;
    }

    public void setIdEdo(Integer idEdo) {
        this.idEdo = idEdo;
    }

    public Integer getIdEdo() {
        return idEdo;
    }

    public void setIdFuncion(String idFuncion) {
        this.idFuncion = idFuncion;
    }

    public String getIdFuncion() {
        return idFuncion;
    }

    public void setIdPrograma(String idPrograma) {
        this.idPrograma = idPrograma;
    }

    public String getIdPrograma() {
        return idPrograma;
    }

    public void setIdActInsti(String idActInsti) {
        this.idActInsti = idActInsti;
    }

    public String getIdActInsti() {
        return idActInsti;
    }

    public void setIdActPriorita(String idActPriorita) {
        this.idActPriorita = idActPriorita;
    }

    public String getIdActPriorita() {
        return idActPriorita;
    }

    public void setIdActInstiEsp(String idActInstiEsp) {
        this.idActInstiEsp = idActInstiEsp;
    }

    public String getIdActInstiEsp() {
        return idActInstiEsp;
    }

    public void setIdPartida(String idPartida) {
        this.idPartida = idPartida;
    }

    public String getIdPartida() {
        return idPartida;
    }

    public void setIdTipoGasto(Integer idTipoGasto) {
        this.idTipoGasto = idTipoGasto;
    }

    public Integer getIdTipoGasto() {
        return idTipoGasto;
    }

    public void setIdFuenteFinan(Integer idFuenteFinan) {
        this.idFuenteFinan = idFuenteFinan;
    }

    public Integer getIdFuenteFinan() {
        return idFuenteFinan;
    }

    public void setSccGuiaContEjer(Integer sccGuiaContEjer) {
        this.sccGuiaContEjer = sccGuiaContEjer;
    }

    public Integer getSccGuiaContEjer() {
        return sccGuiaContEjer;
    }

    public void setSccClaveMov(String sccClaveMov) {
        this.sccClaveMov = sccClaveMov;
    }

    public String getSccClaveMov() {
        return sccClaveMov;
    }

    public void setSccIdSindicato(Integer sccIdSindicato) {
        this.sccIdSindicato = sccIdSindicato;
    }

    public Integer getSccIdSindicato() {
        return sccIdSindicato;
    }

    public void setSccCodigoVerif(Integer sccCodigoVerif) {
        this.sccCodigoVerif = sccCodigoVerif;
    }

    public Integer getSccCodigoVerif() {
        return sccCodigoVerif;
    }

    public void setIdTipoCpto(String idTipoCpto) {
        this.idTipoCpto = idTipoCpto;
    }

    public String getIdTipoCpto() {
        return idTipoCpto;
    }

    public void setIdCptoPago(String idCptoPago) {
        this.idCptoPago = idCptoPago;
    }

    public String getIdCptoPago() {
        return idCptoPago;
    }

    public void setIdGrupoPago(String idGrupoPago) {
        this.idGrupoPago = idGrupoPago;
    }

    public String getIdGrupoPago() {
        return idGrupoPago;
    }

    public void setSccCtaClabe(String sccCtaClabe) {
        this.sccCtaClabe = sccCtaClabe;
    }

    public String getSccCtaClabe() {
        return sccCtaClabe;
    }

    public void setCxlcMaestro_Pto(String cxlcMaestro_Pto) {
        this.cxlcMaestro_Pto = cxlcMaestro_Pto;
    }

    public String getCxlcMaestro_Pto() {
        return cxlcMaestro_Pto;
    }

    public void setSccMonto(Integer sccMonto) {
        this.sccMonto = sccMonto;
    }

    public Integer getSccMonto() {
        return sccMonto;
    }

    public void setSeccion(String seccion) {
        this.seccion = seccion;
    }

    public String getSeccion() {
        return seccion;
    }

    public void setBeanName(String beanName) {
        this.beanName = beanName;
    }

    public String getBeanName() {
        return beanName;
    }

    public void setUrlOrigen(String urlOrigen) {
        this.urlOrigen = urlOrigen;
    }

    public String getUrlOrigen() {
        return urlOrigen;
    }

    public void setUrlDestino(String urlDestino) {
        this.urlDestino = urlDestino;
    }

    public String getUrlDestino() {
        return urlDestino;
    }

    public void setCancel(boolean cancel) {
        this.cancel = cancel;
    }

    public boolean isCancel() {
        return cancel;
    }

    public void setMuestraRegistros(boolean muestraRegistros) {
        this.muestraRegistros = muestraRegistros;
    }

    public boolean isMuestraRegistros() {
        return muestraRegistros;
    }

    public void setRegistroCLC(boolean registroCLC) {
        this.registroCLC = registroCLC;
    }

    public boolean isRegistroCLC() {
        return registroCLC;
    }

    public void setCasosImpuestos(boolean casosImpuestos) {
        this.casosImpuestos = casosImpuestos;
    }

    public boolean isCasosImpuestos() {
        return casosImpuestos;
    }
}
