package gob.shcp.sireh.model.plaza.gestion;

import gob.shcp.fsn.model.Model;

import java.util.Date;

public class ConsultaPlazaSoporteDTO implements java.io.Serializable, Model {

    //Filtros para SQL
    private String uniCiclo;
    private Integer idPlazaf;
    private String idUnidadf;
    private String tipof;

    //Campos para SQL    
    private String tipo;
    private String grupoPagoEve;
    private String uniDescEve;
    private Integer idPlazaEve;
    private String descSitPlazaEve;
    private Integer plazaRespaldoEve;
    private String plazaRfcEve;
    private String nombreEmpEve;

    private String descPuestoEve;
    private String idNivelPtoEve;
    private Integer idRangoEve;
    private String descJerarquiaEve;
    private String descNombramientoEve;
    private Integer idZonaEcoEve;
    private String descMovsPersonalEve;
    private String plazaQnaCapturaEve;
    private Date plazaUltimoMovtoEve;
    private Date plazaIniContEve;
    private Date plazaFinContEve;
    private Double tabSueldoEve;
    private Double tabCompensacionEve;

    private String grupoPagoEst;
    private String uniDescEst;
    private Integer idPlazaEst;
    private Integer plazaRespaldoEst;
    private String plazaRfcEst;
    private String nombreEmpEst;
    private String descSitPlazaEst;
    private String descPuestoEst;
    private String idNivelPtoEst;
    private Integer idRangoEst;
    private String descJerarquiaEst;
    private String descNombramientoEst;
    private Integer idZonaEcoEst;
    private String descMovsPersonalEst;
    private String plazaQnaCapturaEst;
    private Date plazaUltimoMovtoEst;
    private Date plazaIniContEst;
    private Date plazaFinContEst;
    private Double tabSueldoEst;
    private Double tabCompensacionEst;

    //Propiedades default
    private String urlOrigen;
    private String urlDestino;
    private boolean cancel;
    private boolean muestraRegistros;

    // Configuracion inicial
    private String seccion;
    private String beanName;
    private String beanNameSituacion;


    public void setUniCiclo(String uniCiclo) {
        this.uniCiclo = uniCiclo;
    }

    public String getUniCiclo() {
        return uniCiclo;
    }

    public void setIdPlazaf(Integer idPlazaf) {
        this.idPlazaf = idPlazaf;
    }

    public Integer getIdPlazaf() {
        return idPlazaf;
    }

    public void setIdUnidadf(String idUnidadf) {
        this.idUnidadf = idUnidadf;
    }

    public String getIdUnidadf() {
        return idUnidadf;
    }

    public void setTipof(String tipof) {
        this.tipof = tipof;
    }

    public String getTipof() {
        return tipof;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setGrupoPagoEve(String grupoPagoEve) {
        this.grupoPagoEve = grupoPagoEve;
    }

    public String getGrupoPagoEve() {
        return grupoPagoEve;
    }

    public void setUniDescEve(String uniDescEve) {
        this.uniDescEve = uniDescEve;
    }

    public String getUniDescEve() {
        return uniDescEve;
    }

    public void setIdPlazaEve(Integer idPlazaEve) {
        this.idPlazaEve = idPlazaEve;
    }

    public Integer getIdPlazaEve() {
        return idPlazaEve;
    }

    public void setPlazaRespaldoEve(Integer plazaRespaldoEve) {
        this.plazaRespaldoEve = plazaRespaldoEve;
    }

    public Integer getPlazaRespaldoEve() {
        return plazaRespaldoEve;
    }

    public void setPlazaRfcEve(String plazaRfcEve) {
        this.plazaRfcEve = plazaRfcEve;
    }

    public String getPlazaRfcEve() {
        return plazaRfcEve;
    }

    public void setNombreEmpEve(String nombreEmpEve) {
        this.nombreEmpEve = nombreEmpEve;
    }

    public String getNombreEmpEve() {
        return nombreEmpEve;
    }

    public void setDescSitPlazaEve(String descSitPlazaEve) {
        this.descSitPlazaEve = descSitPlazaEve;
    }

    public String getDescSitPlazaEve() {
        return descSitPlazaEve;
    }

    public void setDescPuestoEve(String descPuestoEve) {
        this.descPuestoEve = descPuestoEve;
    }

    public String getDescPuestoEve() {
        return descPuestoEve;
    }

    public void setIdNivelPtoEve(String idNivelPtoEve) {
        this.idNivelPtoEve = idNivelPtoEve;
    }

    public String getIdNivelPtoEve() {
        return idNivelPtoEve;
    }

    public void setIdRangoEve(Integer idRangoEve) {
        this.idRangoEve = idRangoEve;
    }

    public Integer getIdRangoEve() {
        return idRangoEve;
    }

    public void setDescJerarquiaEve(String descJerarquiaEve) {
        this.descJerarquiaEve = descJerarquiaEve;
    }

    public String getDescJerarquiaEve() {
        return descJerarquiaEve;
    }

    public void setDescNombramientoEve(String descNombramientoEve) {
        this.descNombramientoEve = descNombramientoEve;
    }

    public String getDescNombramientoEve() {
        return descNombramientoEve;
    }

    public void setIdZonaEcoEve(Integer idZonaEcoEve) {
        this.idZonaEcoEve = idZonaEcoEve;
    }

    public Integer getIdZonaEcoEve() {
        return idZonaEcoEve;
    }

    public void setDescMovsPersonalEve(String descMovsPersonalEve) {
        this.descMovsPersonalEve = descMovsPersonalEve;
    }

    public String getDescMovsPersonalEve() {
        return descMovsPersonalEve;
    }

    public void setPlazaQnaCapturaEve(String plazaQnaCapturaEve) {
        this.plazaQnaCapturaEve = plazaQnaCapturaEve;
    }

    public String getPlazaQnaCapturaEve() {
        return plazaQnaCapturaEve;
    }

    public void setPlazaUltimoMovtoEve(Date plazaUltimoMovtoEve) {
        this.plazaUltimoMovtoEve = plazaUltimoMovtoEve;
    }

    public Date getPlazaUltimoMovtoEve() {
        return plazaUltimoMovtoEve;
    }

    public void setPlazaIniContEve(Date plazaIniContEve) {
        this.plazaIniContEve = plazaIniContEve;
    }

    public Date getPlazaIniContEve() {
        return plazaIniContEve;
    }

    public void setPlazaFinContEve(Date plazaFinContEve) {
        this.plazaFinContEve = plazaFinContEve;
    }

    public Date getPlazaFinContEve() {
        return plazaFinContEve;
    }

    public void setTabSueldoEve(Double tabSueldoEve) {
        this.tabSueldoEve = tabSueldoEve;
    }

    public Double getTabSueldoEve() {
        return tabSueldoEve;
    }

    public void setTabCompensacionEve(Double tabCompensacionEve) {
        this.tabCompensacionEve = tabCompensacionEve;
    }

    public Double getTabCompensacionEve() {
        return tabCompensacionEve;
    }

    public void setGrupoPagoEst(String grupoPagoEst) {
        this.grupoPagoEst = grupoPagoEst;
    }

    public String getGrupoPagoEst() {
        return grupoPagoEst;
    }

    public void setUniDescEst(String uniDescEst) {
        this.uniDescEst = uniDescEst;
    }

    public String getUniDescEst() {
        return uniDescEst;
    }

    public void setIdPlazaEst(Integer idPlazaEst) {
        this.idPlazaEst = idPlazaEst;
    }

    public Integer getIdPlazaEst() {
        return idPlazaEst;
    }

    public void setPlazaRespaldoEst(Integer plazaRespaldoEst) {
        this.plazaRespaldoEst = plazaRespaldoEst;
    }

    public Integer getPlazaRespaldoEst() {
        return plazaRespaldoEst;
    }

    public void setPlazaRfcEst(String plazaRfcEst) {
        this.plazaRfcEst = plazaRfcEst;
    }

    public String getPlazaRfcEst() {
        return plazaRfcEst;
    }

    public void setNombreEmpEst(String nombreEmpEst) {
        this.nombreEmpEst = nombreEmpEst;
    }

    public String getNombreEmpEst() {
        return nombreEmpEst;
    }

    public void setDescSitPlazaEst(String descSitPlazaEst) {
        this.descSitPlazaEst = descSitPlazaEst;
    }

    public String getDescSitPlazaEst() {
        return descSitPlazaEst;
    }

    public void setDescPuestoEst(String descPuestoEst) {
        this.descPuestoEst = descPuestoEst;
    }

    public String getDescPuestoEst() {
        return descPuestoEst;
    }

    public void setIdNivelPtoEst(String idNivelPtoEst) {
        this.idNivelPtoEst = idNivelPtoEst;
    }

    public String getIdNivelPtoEst() {
        return idNivelPtoEst;
    }

    public void setIdRangoEst(Integer idRangoEst) {
        this.idRangoEst = idRangoEst;
    }

    public Integer getIdRangoEst() {
        return idRangoEst;
    }

    public void setDescJerarquiaEst(String descJerarquiaEst) {
        this.descJerarquiaEst = descJerarquiaEst;
    }

    public String getDescJerarquiaEst() {
        return descJerarquiaEst;
    }

    public void setDescNombramientoEst(String descNombramientoEst) {
        this.descNombramientoEst = descNombramientoEst;
    }

    public String getDescNombramientoEst() {
        return descNombramientoEst;
    }

    public void setIdZonaEcoEst(Integer idZonaEcoEst) {
        this.idZonaEcoEst = idZonaEcoEst;
    }

    public Integer getIdZonaEcoEst() {
        return idZonaEcoEst;
    }

    public void setDescMovsPersonalEst(String descMovsPersonalEst) {
        this.descMovsPersonalEst = descMovsPersonalEst;
    }

    public String getDescMovsPersonalEst() {
        return descMovsPersonalEst;
    }

    public void setPlazaQnaCapturaEst(String plazaQnaCapturaEst) {
        this.plazaQnaCapturaEst = plazaQnaCapturaEst;
    }

    public String getPlazaQnaCapturaEst() {
        return plazaQnaCapturaEst;
    }

    public void setPlazaUltimoMovtoEst(Date plazaUltimoMovtoEst) {
        this.plazaUltimoMovtoEst = plazaUltimoMovtoEst;
    }

    public Date getPlazaUltimoMovtoEst() {
        return plazaUltimoMovtoEst;
    }

    public void setPlazaIniContEst(Date plazaIniContEst) {
        this.plazaIniContEst = plazaIniContEst;
    }

    public Date getPlazaIniContEst() {
        return plazaIniContEst;
    }

    public void setPlazaFinContEst(Date plazaFinContEst) {
        this.plazaFinContEst = plazaFinContEst;
    }

    public Date getPlazaFinContEst() {
        return plazaFinContEst;
    }

    public void setTabSueldoEst(Double tabSueldoEst) {
        this.tabSueldoEst = tabSueldoEst;
    }

    public Double getTabSueldoEst() {
        return tabSueldoEst;
    }

    public void setTabCompensacionEst(Double tabCompensacionEst) {
        this.tabCompensacionEst = tabCompensacionEst;
    }

    public Double getTabCompensacionEst() {
        return tabCompensacionEst;
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

    public void setBeanNameSituacion(String beanNameSituacion) {
        this.beanNameSituacion = beanNameSituacion;
    }

    public String getBeanNameSituacion() {
        return beanNameSituacion;
    }
}
