package gob.shcp.sireh.model.nomina.calculo;

import gob.shcp.fsn.model.Model;

public class ComparaGralDTO implements java.io.Serializable, Model {

    // Datos 
    private Integer cpFolio;
    private Integer cpDifFolio;
    private Integer quincenaAnterior;
    private Integer quincenaReferencia;
    
    private String comprobanteAnterior;
    private String comprobanteReferencia;
    private String empleadoAnterior;
    private String empleadoReferencia;
    private String puestoFuncionalAnterior;
    private String puestoFuncionalReferencia;
    private String curpAnterior;
    private String curpReferencia;
    private String cveBancoAnterior;
    private String cveBancoReferencia;
    private String nivelHerramientaAnterior;
    private String nivelHerramientaReferencia;
    private String imssIsssteAnterior;
    private String imssIsssteReferencia;
    private String unidadFisicaAnterior;
    private String unidadFisicaReferencia;
    private String pcpAnterior;
    private String pcpReferencia;
    private String zonaPagadoraAnterior;
    private String zonaPagadoraReferencia;
    private String numPensionAnterior;
    private String numPensionReferencia;
    private String regcontFecPagoAnterior;
    private String regcontFecPagoReferencia;
    private String idNominaAnterior;
    private String idNominaReferencia;
    private String leyendaCanceladoAnterior;
    private String leyendaCanceladoReferencia;
    private Integer hpFolioAnterior;
    private Integer hpFolioReferencia;
    private Integer hpDifFolioAnterior;
    private Integer hpDifFolioReferencia;
    private Double hpNetoPagoAnterior;
    private Double hpNetoPagoReferencia;
    private Double deduccionesAnterior;
    private Double deduccionesReferencia;
    private Double percepcionesAnterior;
    private Double percepcionesReferencia;
    private Integer qnaIni;
    private Integer qnaFin;
    private String nomIni;
    private String nomFin;
    private String tipoNomIni;
    private String gpoPagoIni;
    private Integer numCompIni;
    private String tipoNomFin;
    private String gpoPagoFin;
    private Integer numCompFin;
    
    // Configuracion inicial
    private String seccion;
    private String beanName;
    
    // Navegacion
    private String urlOrigen;
    private String urlDestino;
    private boolean muestraRegistros; 
    private boolean cancel;

    public void setCpFolio(Integer cpFolio) {
        this.cpFolio = cpFolio;
    }

    public Integer getCpFolio() {
        return cpFolio;
    }

    public void setCpDifFolio(Integer cpDifFolio) {
        this.cpDifFolio = cpDifFolio;
    }

    public Integer getCpDifFolio() {
        return cpDifFolio;
    }

    public void setQuincenaAnterior(Integer quincenaAnterior) {
        this.quincenaAnterior = quincenaAnterior;
    }

    public Integer getQuincenaAnterior() {
        return quincenaAnterior;
    }

    public void setQuincenaReferencia(Integer quincenaReferencia) {
        this.quincenaReferencia = quincenaReferencia;
    }

    public Integer getQuincenaReferencia() {
        return quincenaReferencia;
    }

    public void setComprobanteAnterior(String comprobanteAnterior) {
        this.comprobanteAnterior = comprobanteAnterior;
    }

    public String getComprobanteAnterior() {
        return comprobanteAnterior;
    }

    public void setComprobanteReferencia(String comprobanteReferencia) {
        this.comprobanteReferencia = comprobanteReferencia;
    }

    public String getComprobanteReferencia() {
        return comprobanteReferencia;
    }

    public void setEmpleadoAnterior(String empleadoAnterior) {
        this.empleadoAnterior = empleadoAnterior;
    }

    public String getEmpleadoAnterior() {
        return empleadoAnterior;
    }

    public void setEmpleadoReferencia(String empleadoReferencia) {
        this.empleadoReferencia = empleadoReferencia;
    }

    public String getEmpleadoReferencia() {
        return empleadoReferencia;
    }

    public void setPuestoFuncionalAnterior(String puestoFuncionalAnterior) {
        this.puestoFuncionalAnterior = puestoFuncionalAnterior;
    }

    public String getPuestoFuncionalAnterior() {
        return puestoFuncionalAnterior;
    }

    public void setPuestoFuncionalReferencia(String puestoFuncionalReferencia) {
        this.puestoFuncionalReferencia = puestoFuncionalReferencia;
    }

    public String getPuestoFuncionalReferencia() {
        return puestoFuncionalReferencia;
    }

    public void setCurpAnterior(String curpAnterior) {
        this.curpAnterior = curpAnterior;
    }

    public String getCurpAnterior() {
        return curpAnterior;
    }

    public void setCurpReferencia(String curpReferencia) {
        this.curpReferencia = curpReferencia;
    }

    public String getCurpReferencia() {
        return curpReferencia;
    }

    public void setCveBancoAnterior(String cveBancoAnterior) {
        this.cveBancoAnterior = cveBancoAnterior;
    }

    public String getCveBancoAnterior() {
        return cveBancoAnterior;
    }

    public void setCveBancoReferencia(String cveBancoReferencia) {
        this.cveBancoReferencia = cveBancoReferencia;
    }

    public String getCveBancoReferencia() {
        return cveBancoReferencia;
    }

    public void setNivelHerramientaAnterior(String nivelHerramientaAnterior) {
        this.nivelHerramientaAnterior = nivelHerramientaAnterior;
    }

    public String getNivelHerramientaAnterior() {
        return nivelHerramientaAnterior;
    }

    public void setNivelHerramientaReferencia(String nivelHerramientaReferencia) {
        this.nivelHerramientaReferencia = nivelHerramientaReferencia;
    }

    public String getNivelHerramientaReferencia() {
        return nivelHerramientaReferencia;
    }

    public void setImssIsssteAnterior(String imssIsssteAnterior) {
        this.imssIsssteAnterior = imssIsssteAnterior;
    }

    public String getImssIsssteAnterior() {
        return imssIsssteAnterior;
    }

    public void setImssIsssteReferencia(String imssIsssteReferencia) {
        this.imssIsssteReferencia = imssIsssteReferencia;
    }

    public String getImssIsssteReferencia() {
        return imssIsssteReferencia;
    }

    public void setUnidadFisicaAnterior(String unidadFisicaAnterior) {
        this.unidadFisicaAnterior = unidadFisicaAnterior;
    }

    public String getUnidadFisicaAnterior() {
        return unidadFisicaAnterior;
    }

    public void setUnidadFisicaReferencia(String unidadFisicaReferencia) {
        this.unidadFisicaReferencia = unidadFisicaReferencia;
    }

    public String getUnidadFisicaReferencia() {
        return unidadFisicaReferencia;
    }

    public void setPcpAnterior(String pcpAnterior) {
        this.pcpAnterior = pcpAnterior;
    }

    public String getPcpAnterior() {
        return pcpAnterior;
    }

    public void setPcpReferencia(String pcpReferencia) {
        this.pcpReferencia = pcpReferencia;
    }

    public String getPcpReferencia() {
        return pcpReferencia;
    }

    public void setZonaPagadoraAnterior(String zonaPagadoraAnterior) {
        this.zonaPagadoraAnterior = zonaPagadoraAnterior;
    }

    public String getZonaPagadoraAnterior() {
        return zonaPagadoraAnterior;
    }

    public void setZonaPagadoraReferencia(String zonaPagadoraReferencia) {
        this.zonaPagadoraReferencia = zonaPagadoraReferencia;
    }

    public String getZonaPagadoraReferencia() {
        return zonaPagadoraReferencia;
    }

    public void setNumPensionAnterior(String numPensionAnterior) {
        this.numPensionAnterior = numPensionAnterior;
    }

    public String getNumPensionAnterior() {
        return numPensionAnterior;
    }

    public void setNumPensionReferencia(String numPensionReferencia) {
        this.numPensionReferencia = numPensionReferencia;
    }

    public String getNumPensionReferencia() {
        return numPensionReferencia;
    }

    public void setRegcontFecPagoAnterior(String regcontFecPagoAnterior) {
        this.regcontFecPagoAnterior = regcontFecPagoAnterior;
    }

    public String getRegcontFecPagoAnterior() {
        return regcontFecPagoAnterior;
    }

    public void setRegcontFecPagoReferencia(String regcontFecPagoReferencia) {
        this.regcontFecPagoReferencia = regcontFecPagoReferencia;
    }

    public String getRegcontFecPagoReferencia() {
        return regcontFecPagoReferencia;
    }

    public void setIdNominaAnterior(String idNominaAnterior) {
        this.idNominaAnterior = idNominaAnterior;
    }

    public String getIdNominaAnterior() {
        return idNominaAnterior;
    }

    public void setIdNominaReferencia(String idNominaReferencia) {
        this.idNominaReferencia = idNominaReferencia;
    }

    public String getIdNominaReferencia() {
        return idNominaReferencia;
    }

    public void setLeyendaCanceladoAnterior(String leyendaCanceladoAnterior) {
        this.leyendaCanceladoAnterior = leyendaCanceladoAnterior;
    }

    public String getLeyendaCanceladoAnterior() {
        return leyendaCanceladoAnterior;
    }

    public void setLeyendaCanceladoReferencia(String leyendaCanceladoReferencia) {
        this.leyendaCanceladoReferencia = leyendaCanceladoReferencia;
    }

    public String getLeyendaCanceladoReferencia() {
        return leyendaCanceladoReferencia;
    }

    public void setHpFolioAnterior(Integer hpFolioAnterior) {
        this.hpFolioAnterior = hpFolioAnterior;
    }

    public Integer getHpFolioAnterior() {
        return hpFolioAnterior;
    }

    public void setHpFolioReferencia(Integer hpFolioReferencia) {
        this.hpFolioReferencia = hpFolioReferencia;
    }

    public Integer getHpFolioReferencia() {
        return hpFolioReferencia;
    }

    public void setHpDifFolioAnterior(Integer hpDifFolioAnterior) {
        this.hpDifFolioAnterior = hpDifFolioAnterior;
    }

    public Integer getHpDifFolioAnterior() {
        return hpDifFolioAnterior;
    }

    public void setHpDifFolioReferencia(Integer hpDifFolioReferencia) {
        this.hpDifFolioReferencia = hpDifFolioReferencia;
    }

    public Integer getHpDifFolioReferencia() {
        return hpDifFolioReferencia;
    }

    public void setHpNetoPagoAnterior(Double hpNetoPagoAnterior) {
        this.hpNetoPagoAnterior = hpNetoPagoAnterior;
    }

    public Double getHpNetoPagoAnterior() {
        return hpNetoPagoAnterior;
    }

    public void setHpNetoPagoReferencia(Double hpNetoPagoReferencia) {
        this.hpNetoPagoReferencia = hpNetoPagoReferencia;
    }

    public Double getHpNetoPagoReferencia() {
        return hpNetoPagoReferencia;
    }

    public void setDeduccionesAnterior(Double deduccionesAnterior) {
        this.deduccionesAnterior = deduccionesAnterior;
    }

    public Double getDeduccionesAnterior() {
        return deduccionesAnterior;
    }

    public void setDeduccionesReferencia(Double deduccionesReferencia) {
        this.deduccionesReferencia = deduccionesReferencia;
    }

    public Double getDeduccionesReferencia() {
        return deduccionesReferencia;
    }

    public void setPercepcionesAnterior(Double percepcionesAnterior) {
        this.percepcionesAnterior = percepcionesAnterior;
    }

    public Double getPercepcionesAnterior() {
        return percepcionesAnterior;
    }

    public void setPercepcionesReferencia(Double percepcionesReferencia) {
        this.percepcionesReferencia = percepcionesReferencia;
    }

    public Double getPercepcionesReferencia() {
        return percepcionesReferencia;
    }

    public void setQnaIni(Integer qnaIni) {
        this.qnaIni = qnaIni;
    }

    public Integer getQnaIni() {
        return qnaIni;
    }

    public void setQnaFin(Integer qnaFin) {
        this.qnaFin = qnaFin;
    }

    public Integer getQnaFin() {
        return qnaFin;
    }

    public void setNomIni(String nomIni) {
        this.nomIni = nomIni;
    }

    public String getNomIni() {
        return nomIni;
    }

    public void setNomFin(String nomFin) {
        this.nomFin = nomFin;
    }

    public String getNomFin() {
        return nomFin;
    }

    public void setTipoNomIni(String tipoNomIni) {
        this.tipoNomIni = tipoNomIni;
    }

    public String getTipoNomIni() {
        return tipoNomIni;
    }

    public void setGpoPagoIni(String gpoPagoIni) {
        this.gpoPagoIni = gpoPagoIni;
    }

    public String getGpoPagoIni() {
        return gpoPagoIni;
    }

    public void setNumCompIni(Integer numCompIni) {
        this.numCompIni = numCompIni;
    }

    public Integer getNumCompIni() {
        return numCompIni;
    }

    public void setTipoNomFin(String tipoNomFin) {
        this.tipoNomFin = tipoNomFin;
    }

    public String getTipoNomFin() {
        return tipoNomFin;
    }

    public void setGpoPagoFin(String gpoPagoFin) {
        this.gpoPagoFin = gpoPagoFin;
    }

    public String getGpoPagoFin() {
        return gpoPagoFin;
    }

    public void setNumCompFin(Integer numCompFin) {
        this.numCompFin = numCompFin;
    }

    public Integer getNumCompFin() {
        return numCompFin;
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

    public void setMuestraRegistros(boolean muestraRegistros) {
        this.muestraRegistros = muestraRegistros;
    }

    public boolean isMuestraRegistros() {
        return muestraRegistros;
    }

    public void setCancel(boolean cancel) {
        this.cancel = cancel;
    }

    public boolean isCancel() {
        return cancel;
    }
}
