package gob.shcp.sireh.model.nomina.terceros;

import gob.shcp.fsn.model.Model;

import java.util.ArrayList;
import java.util.List;

import org.springmodules.validation.bean.conf.loader.annotation.handler.ValidationMethod;

public class GeneraArchivosTercerosDTO implements java.io.Serializable, Model {

    private Integer[] idGrupo;
    private List<Integer> quincenas;

    private String idTercero;
    private String descTercero;
    private String datTipoCpto;
    private String datConcepto;
    private String llaveTercero;
    private Integer hpQnaPago;
    private Integer hpQnaPagoFin;
    private String hpConsecNomina;
    private String hpConcecNominaHidden;
    private String beanlista;
    private String agrupaVerEmp = "N";
    private Integer tipoQna;
    private String idTipoNomina;
    private String hpIniPago;
    private String tipoEntero;
    private String estadoPago = "T";
    private String qnaIni;
    private String qnaFin;
    private String ciclo;
    private String bimestre;
    private String mes;
    private Integer tipoArc=0;
    private String leyenda = "Si se localiza información con los parámetros capturados, seleccione la nómina a procesar y active el botón de generar";
    private String leyendag = "Proceso de generación de archivo, al finalizar revise su carperta de descargas";
    private Double importe;
    private String descEstadoNom;
    private String estadoNomina;
    private String nomArchAnexo20;
    private String estadoAnexo20;
    private String nomRefTimbrado;
    private String QnaPago;
    
    private String txtFileName;
    private String version;
    
    // Configuracion inicial
    private String beanName;

    // Navegacion
    private String urlOrigen;
    private String urlDestino;

    private boolean muestraRegistros;
    private boolean muestraReporte;
    private boolean cancel;
    private boolean generar;
    private boolean generaArchivo;
    private boolean generarXml;
    
    private String[] seleccionConsecNomina;
    private List<Integer> conceptosList;

    private java.lang.Boolean qnaCapturaRequired;
    private java.lang.Boolean qnaCapturaIRequired;
    
    private List<CustomGeneraArchivostercerosDTO> listaCamposQueryterceros = new ArrayList<CustomGeneraArchivostercerosDTO>();

    public void setIdTercero(String idTercero) {
        this.idTercero = idTercero;
    }

    public String getIdTercero() {
        return idTercero;
    }

    public void setDescTercero(String descTercero) {
        this.descTercero = descTercero;
    }

    public String getDescTercero() {
        return descTercero;
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

    public void setLlaveTercero(String llaveTercero) {
        this.llaveTercero = llaveTercero;
    }

    public String getLlaveTercero() {
        return llaveTercero;
    }

    public void setHpQnaPago(Integer hpQnaPago) {
        this.hpQnaPago = hpQnaPago;
    }

    public Integer getHpQnaPago() {
        return hpQnaPago;
    }

    public void setLeyenda(String leyenda) {
        this.leyenda = leyenda;
    }

    public String getLeyenda() {
        return leyenda;
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

    public void setGeneraArchivo(boolean generaArchivo) {
        this.generaArchivo = generaArchivo;
    }

    public boolean isGeneraArchivo() {
        return generaArchivo;
    }

    public void setListaCamposQueryterceros(List<CustomGeneraArchivostercerosDTO> listaCamposQueryterceros) {
        this.listaCamposQueryterceros = listaCamposQueryterceros;
    }

    public List<CustomGeneraArchivostercerosDTO> getListaCamposQueryterceros() {
        return listaCamposQueryterceros;
    }

    public void setSeleccionConsecNomina(String[] seleccionConsecNomina) {
        this.seleccionConsecNomina = seleccionConsecNomina;
    }

    public String[] getSeleccionConsecNomina() {
        return seleccionConsecNomina;
    }

    public void setHpConsecNomina(String hpConsecNomina) {
        this.hpConsecNomina = hpConsecNomina;
    }

    public String getHpConsecNomina() {
        return hpConsecNomina;
    }

    public void setBeanlista(String beanlista) {
        this.beanlista = beanlista;
    }

    public String getBeanlista() {
        return beanlista;
    }

    public void setConceptosList(List<Integer> conceptosList) {
        this.conceptosList = conceptosList;
    }

    public List<Integer> getConceptosList() {
        return conceptosList;
    }

    public void setLeyendag(String leyendag) {
        this.leyendag = leyendag;
    }

    public String getLeyendag() {
        return leyendag;
    }

    public void setAgrupaVerEmp(String agrupaVerEmp) {
        this.agrupaVerEmp = agrupaVerEmp;
    }

    public String getAgrupaVerEmp() {
        return agrupaVerEmp;
    }


    public void setTipoQna(Integer tipoQna) {
        this.tipoQna = tipoQna;
    }

    public Integer getTipoQna() {
        return tipoQna;
    }

    public void setHpIniPago(String hpIniPago) {
        this.hpIniPago = hpIniPago;
    }

    public String getHpIniPago() {
        return hpIniPago;
    }

    public void setIdTipoNomina(String idTipoNomina) {
        this.idTipoNomina = idTipoNomina;
    }

    public String getIdTipoNomina() {
        return idTipoNomina;
    }


    public void setEstadoPago(String estadoPago) {
        this.estadoPago = estadoPago;
    }

    public String getEstadoPago() {
        return estadoPago;
    }

    public void setTipoEntero(String tipoEntero) {
        this.tipoEntero = tipoEntero;
    }

    public String getTipoEntero() {
        return tipoEntero;
    }

    public void setQnaCapturaRequired(Boolean qnaCapturaRequired) {
        this.qnaCapturaRequired = qnaCapturaRequired;
    }

    public Boolean getQnaCapturaRequired() {
        return qnaCapturaRequired;
    }

    @ValidationMethod(forProperty = "hpQnaPago", errorCode = "error.select.unspecified")
    public boolean validateHpQnaPago() {
        if (this.getQnaCapturaRequired() != null && this.getQnaCapturaRequired() && !this.isCancel()) {
            if (this.getHpQnaPago() != null && !this.getHpQnaPago().equals("") && !this.getHpQnaPago().equals("0")) {
                muestraRegistros = true;

                return true;
            } else {
                muestraRegistros = false;

                return false;
            }
        }
        return true;
    }

    public void setQnaIni(String qnaIni) {
        this.qnaIni = qnaIni;
    }

    public String getQnaIni() {
        return qnaIni;
    }

    @ValidationMethod(forProperty = "qnaIni", errorCode = "error.select.unspecified")
    public boolean validateQnaPago() {
        if (this.getQnaCapturaIRequired() != null && this.getQnaCapturaIRequired() && !this.isCancel()) {
            if (this.getQnaIni() != null && !this.getQnaIni().equals(0)) {
                generaArchivo = true;

                return true;
            } else {
                generaArchivo = false;

                return false;
            }
        }
        return true;
    }

    @ValidationMethod(forProperty = "hpConsecNomina", errorCode = "error.select.unspecified")
    public boolean validateHpConsecNomina() {
        if (this.isGenerar()) {
            if (this.getHpConsecNomina() == null || this.getHpConsecNomina().equals("0")) {
                return false;
            }
        }
        return true;
    }
    
    public void setQnaFin(String qnaFin) {
        this.qnaFin = qnaFin;
    }

    public String getQnaFin() {
        return qnaFin;
    }

    public void setCiclo(String ciclo) {
        this.ciclo = ciclo;
    }

    public String getCiclo() {
        return ciclo;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public String getMes() {
        return mes;
    }

    public void setIdGrupo(Integer[] idGrupo) {
        this.idGrupo = idGrupo;
    }

    public Integer[] getIdGrupo() {
        return idGrupo;
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
    
    public void setTxtFileName(String txtFileName) {
        this.txtFileName = txtFileName;
    }

    public String getTxtFileName() {
        return txtFileName;
    }

    public void setTipoArc(Integer tipoArc) {
        this.tipoArc = tipoArc;
    }

    public Integer getTipoArc() {
        return tipoArc;
    }

    public void setQnaCapturaIRequired(Boolean qnaCapturaIRequired) {
        this.qnaCapturaIRequired = qnaCapturaIRequired;
    }

    public Boolean getQnaCapturaIRequired() {
        return qnaCapturaIRequired;
    }

    public void setMuestraReporte(boolean muestraReporte) {
        this.muestraReporte = muestraReporte;
    }

    public boolean isMuestraReporte() {
        return muestraReporte;
    }

    public void setBimestre(String bimestre) {
        this.bimestre = bimestre;
    }

    public String getBimestre() {
        return bimestre;
    }

    public void setImporte(Double importe) {
        this.importe = importe;
    }

    public Double getImporte() {
        return importe;
    }
	
	public void setHpQnaPagoFin(Integer hpQnaPagoFin) {
        this.hpQnaPagoFin = hpQnaPagoFin;
    }

    public Integer getHpQnaPagoFin() {
        return hpQnaPagoFin;
    }

    public void setQuincenas(List<Integer> quincenas) {
        this.quincenas = quincenas;
    }

    public List<Integer> getQuincenas() {
        return quincenas;
    }

    public void setGenerar(boolean generar) {
        this.generar = generar;
    }

    public boolean isGenerar() {
        return generar;
    }

    public void setHpConcecNominaHidden(String hpConcecNominaHidden) {
        this.hpConcecNominaHidden = hpConcecNominaHidden;
    }

    public String getHpConcecNominaHidden() {
        return hpConcecNominaHidden;
    }

    public void setGenerarXml(boolean generarXml) {
        this.generarXml = generarXml;
    }

    public boolean isGenerarXml() {
        return generarXml;
    }

    public void setDescEstadoNom(String descEstadoNom) {
        this.descEstadoNom = descEstadoNom;
    }

    public String getDescEstadoNom() {
        return descEstadoNom;
    }

    public void setEstadoNomina(String estadoNomina) {
        this.estadoNomina = estadoNomina;
    }

    public String getEstadoNomina() {
        return estadoNomina;
    }

    public void setNomArchAnexo20(String nomArchAnexo20) {
        this.nomArchAnexo20 = nomArchAnexo20;
    }

    public String getNomArchAnexo20() {
        return nomArchAnexo20;
    }

    public void setEstadoAnexo20(String estadoAnexo20) {
        this.estadoAnexo20 = estadoAnexo20;
    }

    public String getEstadoAnexo20() {
        return estadoAnexo20;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getVersion() {
        return version;
    }

    public void setNomRefTimbrado(String nomRefTimbrado) {
        this.nomRefTimbrado = nomRefTimbrado;
    }

    public String getNomRefTimbrado() {
        return nomRefTimbrado;
    }

    public void setQnaPago(String qnaPago) {
        this.QnaPago = qnaPago;
    }

    public String getQnaPago() {
        return QnaPago;
    }
}
