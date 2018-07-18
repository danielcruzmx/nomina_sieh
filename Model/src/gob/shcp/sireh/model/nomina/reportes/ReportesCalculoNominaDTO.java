package gob.shcp.sireh.model.nomina.reportes;

import gob.shcp.fsn.model.Model;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.springmodules.validation.bean.conf.loader.annotation.handler.ValidationMethod;


public class ReportesCalculoNominaDTO implements java.io.Serializable, Model {

    // Filtros
    private java.lang.String rfcUnico; 
    private java.lang.String uniCiclo;    
    private java.lang.String rfcEmpleado; 
    private java.lang.String idPlaza; 
    private java.lang.String mesQna;
    private java.lang.String idUnidad;
    private java.lang.String qnaCaptura;
    private java.lang.String tipoCpto;
    private java.lang.String qnaIni;
    private java.lang.String qnaFin;
    private java.lang.String qnaPago;
    private java.lang.String concepto;
    private java.lang.String complemento;
    private java.lang.String tipoNomina;
    private java.lang.String cheque;
    private java.lang.String subReport;
    private java.lang.String leyenda;

    private boolean cancel;
    private boolean muestraReporte;

    // Validaciones
    private java.lang.Boolean uniCicloRequired;
    private java.lang.Boolean idUnidadRequired;
    private java.lang.Boolean qnaCapturaRequired;
    private java.lang.Boolean rfcUnicoRequired;
    private java.lang.Boolean rfcRequired;
    private java.lang.Boolean mesQnaRequired;
    private java.lang.Boolean tipoCptoRequired;
    private java.lang.Boolean qnaIniRequired;
    private java.lang.Boolean qnaFinRequired;
    private java.lang.Boolean qnaPagoRequired;
    private java.lang.Boolean qnaRepRequired;
    private java.lang.Boolean conceptoRequired;
    private java.lang.Boolean complementoRequired;
    private java.lang.Boolean tipoNominaRequired;
    private java.lang.Boolean chequeRequired;
    private java.lang.Boolean idPlazaOrRfcRequired;
    private java.lang.Boolean leyendaRequired;

    private String qnaIniNumber;
    private String qnaFinNumber;
    private String pension = "0";
    private String unidades;    

    private Integer maxPag;

    public String getUniCiclo() {
        return uniCiclo;
    }

    public void setUniCiclo(String uniCiclo) {
        this.uniCiclo = uniCiclo;
    }

    public String getIdUnidad() {
        return idUnidad;
    }

    public void setIdUnidad(String idUnidad) {
        this.idUnidad = idUnidad;
    }

    public String getQnaCaptura() {
        return qnaCaptura;
    }

    public void setQnaCaptura(String qnaCaptura) {
        this.qnaCaptura = qnaCaptura;
    }

    public boolean isCancel() {
        return cancel;
    }

    public void setCancel(boolean cancel) {
        this.cancel = cancel;
    }

    public boolean isMuestraReporte() {
        return muestraReporte;
    }

    public void setMuestraReporte(boolean muestraReporte) {
        this.muestraReporte = muestraReporte;
    }

    public String getMesQna() {
        return mesQna;
    }

    public void setMesQna(String mesQna) {
        this.mesQna = mesQna;
    }
    
    public void setTipoCpto(String tipoCpto) {
        this.tipoCpto = tipoCpto;
    }

    public String getTipoCpto() {
        return tipoCpto;
    }

    public void setQnaIni(String qnaIni) {
        this.qnaIni = qnaIni;
    }

    public String getQnaIni() {
        return qnaIni;
    }

    public void setQnaFin(String qnaFin) {
        this.qnaFin = qnaFin;
    }

    public String getQnaFin() {
        return qnaFin;
    }

    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }

    public String getConcepto() {
        return concepto;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setTipoNomina(String tipoNomina) {
        this.tipoNomina = tipoNomina;
    }

    public String getTipoNomina() {
        return tipoNomina;
    }
    
    public void setCheque(String cheque) {
        this.cheque = cheque;
    }

    public String getCheque() {
        return cheque;
    }


    /* V A L I D A C I O N E S */

    public Boolean getUniCicloRequired() {
        return uniCicloRequired;
    }

    public void setUniCicloRequired(Boolean uniCicloRequired) {
        this.uniCicloRequired = uniCicloRequired;
    }

    public Boolean getIdUnidadRequired() {
        return idUnidadRequired;
    }

    public void setIdUnidadRequired(Boolean idUnidadRequired) {
        this.idUnidadRequired = idUnidadRequired;
    }

    public Boolean getQnaCapturaRequired() {
        return qnaCapturaRequired;
    }

    public void setQnaCapturaRequired(Boolean qnaCapturaRequired) {
        this.qnaCapturaRequired = qnaCapturaRequired;
    }

    public Boolean getMesQnaRequired() {
        return mesQnaRequired;
    }

    public void setMesQnaRequired(Boolean mesQnaRequired) {
        this.mesQnaRequired = mesQnaRequired;
    }
    
    public void setRfcRequired(Boolean rfcRequired) {
        this.rfcRequired = rfcRequired;
    }

    public Boolean getRfcRequired() {
        return rfcRequired;
    }
    
    public void setTipoCptoRequired(Boolean tipoCptoRequired) {
        this.tipoCptoRequired = tipoCptoRequired;
    }

    public Boolean getTipoCptoRequired() {
        return tipoCptoRequired;
    }

    public void setQnaIniRequired(Boolean qnaIniRequired) {
        this.qnaIniRequired = qnaIniRequired;
    }

    public Boolean getQnaIniRequired() {
        return qnaIniRequired;
    }

    public void setQnaFinRequired(Boolean qnaFinRequired) {
        this.qnaFinRequired = qnaFinRequired;
    }

    public Boolean getQnaFinRequired() {
        return qnaFinRequired;
    }

    public void setConceptoRequired(Boolean conceptoRequired) {
        this.conceptoRequired = conceptoRequired;
    }

    public Boolean getConceptoRequired() {
        return conceptoRequired;
    }

    public void setComplementoRequired(Boolean complementoRequired) {
        this.complementoRequired = complementoRequired;
    }

    public Boolean getComplementoRequired() {
        return complementoRequired;
    }

    public void setTipoNominaRequired(Boolean tipoNominaRequired) {
        this.tipoNominaRequired = tipoNominaRequired;
    }

    public Boolean getTipoNominaRequired() {
        return tipoNominaRequired;
    }
    
    public void setChequeRequired(Boolean chequeRequired) {
        this.chequeRequired = chequeRequired;
    }

    public Boolean getChequeRequired() {
        return chequeRequired;
    }
 
    @ValidationMethod(forProperty = "uniCiclo", errorCode = "error.select.unspecified")
    public boolean validateUniCiclo() {
        if (this.getUniCicloRequired() != null && this.getUniCicloRequired() && !this.isCancel()) {
            if (this.getUniCiclo() != null && !this.getUniCiclo().equals("") && !this.getUniCiclo().equals("0")) {
                muestraReporte = true;
                uniCicloRequired=false;
                return true;
            } else {
                muestraReporte = false;
                uniCicloRequired=true;
                return false;
            }
        }
        return true;
    }

    @ValidationMethod(forProperty = "idUnidad", errorCode = "error.select.unspecified")
    public boolean validateIdUnidad() {
        if (this.getIdUnidadRequired() != null && this.getIdUnidadRequired() && !this.isCancel()) {
            if (this.getIdUnidad() != null && !this.getIdUnidad().equals("") && !this.getIdUnidad().equals("0")) {
                muestraReporte = true;
                
                return true;
            } else {
                muestraReporte = false;
                return false;
            }
        }
        return true;
    }
    
       
    @ValidationMethod(forProperty = "mesQna", errorCode = "error.select.unspecified")
    public boolean validateMesQna() {
        if (this.getMesQnaRequired() != null && this.getMesQnaRequired() && !this.isCancel()) {
            if (this.getMesQna() != null && !this.getMesQna().equals("") && !this.getMesQna().equals("0")) {
                muestraReporte = true;
                return true;
            } else {
                muestraReporte = false;
                return false;
            }
        }
        return true;
    }
    
    @ValidationMethod(forProperty = "qnaCaptura", errorCode = "error.select.unspecified")
    public boolean validateQnaCaptura() {
        if ( this.getQnaCapturaRequired()!=null && !this.isCancel()) {
            if (this.getQnaCaptura() != null && !this.getQnaCaptura().equals("") && !this.getQnaCaptura().equals("0")) {
                Pattern pat = Pattern.compile("[0-9]+");
                Matcher mat = pat.matcher(this.getQnaCaptura());
                if (mat.matches()) {
                    muestraReporte = true;
                    return true;
                }else {
                    muestraReporte = false;
                    return false;
                }
               
            } else {
                muestraReporte = false;
                return false;
            }
        }
        return true;
    }    
    
    @ValidationMethod(forProperty = "rfcEmpleado", errorCode = "not.null")
    public boolean validateRfc() {
        if (this.getRfcRequired() != null && this.getRfcRequired() && !this.isCancel()) {
            if (this.getRfcEmpleado() != null && !this.getRfcEmpleado().equals("") ) {
                Pattern pat = Pattern.compile("[A-Z]{4}[0-9]{6}[A-Z0-9]*{3}");
                Matcher mat = pat.matcher(this.getRfcEmpleado());
                if (mat.matches()) {
                    muestraReporte = true;
                    return true;
                }else {
                    muestraReporte = false;
                    rfcEmpleado=null;
                    return false;
                }
            } else {
                muestraReporte = false;
                return false;
            }
        }
        return true;
    }
    
    @ValidationMethod(forProperty = "rfcUnico", errorCode = "not.null")
    public boolean validateRfcUnico() {
        if (this.getRfcUnicoRequired() != null && this.getRfcUnicoRequired() && !this.isCancel()) {
            if (this.getRfcUnico() != null && !this.getRfcUnico().equals("") ) {
                Pattern pat = Pattern.compile("[A-Z]{4}[0-9]{6}[A-Z0-9]*{3}");
                Matcher mat = pat.matcher(this.getRfcUnico());
                if (mat.matches()) {
                    muestraReporte = true;
                    return true;
                }else {
                    muestraReporte = false;
                    rfcUnico=null;
                    return false;
                }
            } else {
                muestraReporte = false;
                return false;
            }
        }
        return true;
    }
    
   
    @ValidationMethod(forProperty = "tipoCpto", errorCode = "error.select.unspecified")
    public boolean validateTipoCpto() {
        if (this.getTipoCptoRequired() != null && this.getTipoCptoRequired() && !this.isCancel()) {
            if (this.getTipoCpto() != null && !this.getTipoCpto().equals("") && !this.getTipoCpto().equals("0")) {
                muestraReporte = true;
                return true;
            } else {
                muestraReporte = false;
                return false;
            }
        }
        return true;
    }
    
    @ValidationMethod(forProperty = "tipoNomina", errorCode = "error.select.unspecified")
    public boolean validateTipoNomina() {
        if (this.getTipoNominaRequired() != null && this.getTipoNominaRequired() && !this.isCancel()) {
            if (this.getTipoNomina() != null && !this.getTipoNomina().equals("") && !this.getTipoNomina().equals("0")) {
                muestraReporte = true;
                return true;
            } else {
                muestraReporte = false;
                return false;
            }
        }
        return true;
    }
    
    @ValidationMethod(forProperty = "qnaIni", errorCode = "error.select.unspecified")
    public boolean validateQnaIni() {
        if (this.getQnaIniRequired() != null && this.getQnaIniRequired() && !this.isCancel()) {
            if (this.getQnaIni() != null && !this.getQnaIni().equals("") && !this.getQnaIni().equals("0")) {
                muestraReporte = true;
                return true;
            } else {
                muestraReporte = false;
                return false;
            }
        }
        return true;
    }

    @ValidationMethod(forProperty = "qnaFin", errorCode = "error.select.unspecified")
    public boolean validateQnaFin() {
        if (this.getQnaFinRequired() != null && this.getQnaFinRequired() && !this.isCancel()) {
            if (this.getQnaFin() != null && !this.getQnaFin().equals("") && !this.getQnaFin().equals("0")) {
                muestraReporte = true;
                return true;
            } else {
                muestraReporte = false;
                return false;
            }
        }
        return true;
    }
    
    @ValidationMethod(forProperty = "concepto", errorCode = "error.select.unspecified")
    public boolean validateConcepto() {
        if (this.getConceptoRequired() != null && this.getConceptoRequired() && !this.isCancel()) {
            if (this.getConcepto() != null && !this.getConcepto().equals("") && !this.getConcepto().equals("0")) {
                muestraReporte = true;
                return true;
            } else {
                muestraReporte = false;
                return false;
            }
        }
        return true;
    }
    
    @ValidationMethod(forProperty = "complemento", errorCode = "not.null")
    public boolean validateComplemento() {
        if (this.getComplementoRequired() != null && this.getComplementoRequired() && !this.isCancel()) {
            if (this.getComplemento() != null && !this.getComplemento().equals("") ) {
                muestraReporte = true;
                return true;
                } else {
                muestraReporte = false;
                complemento=null;
                return false;
                }
        }
        return true;
    }
    
    @ValidationMethod(forProperty = "cheque", errorCode = "not.null")
    public boolean validateCheque() {
        if (this.getChequeRequired() != null && this.getChequeRequired() && !this.isCancel()) {
            if (this.getCheque() != null && !this.getCheque().equals("") ) {
                Pattern pat = Pattern.compile("[0-9]{4,10}");
                Matcher mat = pat.matcher(this.getCheque());
                if (mat.matches()) {
                    muestraReporte = true;
                    return true;
                }else {
                    muestraReporte = false;
                    cheque=null;
                    return false;
                }
            } else {
                muestraReporte = false;
                return false;
            }
        }
        return true;
    }

    @ValidationMethod(forProperty = "idPlaza", errorCode = "not.null")
    public boolean validateIdPlazaOrRfc() {
        if (this.getIdPlazaOrRfcRequired() != null && this.getIdPlazaOrRfcRequired() && !this.isCancel()) {
            if ((this.getRfcEmpleado() != null && !this.getRfcEmpleado().equals("")) || (this.getIdPlaza() != null && !this.getIdPlaza().equals(""))) {
                muestraReporte = true;
                return true;
            } else {
                muestraReporte = false;
                return false;
            }
        }
        return true;
    }
    

    @ValidationMethod(forProperty = "qnaPago", errorCode = "error.select.unspecified")
    public boolean validateQnaPago() {
        if (this.getQnaPagoRequired() != null && this.getQnaPagoRequired() && !this.isCancel()) {
            if (this.getQnaPago() != null && !this.getQnaPago().equals("") && !this.getQnaPago().equals("0")) {
                muestraReporte = true;
                return true;
            } else {
                muestraReporte = false;
                return false;
            }
        }
        return true;
    }
    
    @ValidationMethod(forProperty = "leyenda", errorCode = "not.null")
    public boolean validateLeyenda() {
        if (this.getLeyendaRequired() != null && this.getLeyendaRequired() && !this.isCancel()) {
            if (this.getLeyenda() != null && !this.getLeyenda().equals("") ) {
                muestraReporte = true;
                return true;
                } else {
                muestraReporte = false;
                leyenda=null;
                return false;
                }
        }
        return true;
    }

    public void setRfcEmpleado(String rfcEmpleado) {
        this.rfcEmpleado = rfcEmpleado;
    }

    public String getRfcEmpleado() {
        return rfcEmpleado;
    }

    public void setQnaIniNumber(String qnaIniNumber) {
        this.qnaIniNumber = qnaIniNumber;
    }

    public String getQnaIniNumber() {
        return qnaIniNumber;
    }

    public void setQnaFinNumber(String qnaFinNumber) {
        this.qnaFinNumber = qnaFinNumber;
    }

    public String getQnaFinNumber() {
        return qnaFinNumber;
    }

    public void setPension(String pension) {
        this.pension = pension;
    }

    public String getPension() {
        return pension;
    }

    public void setUnidades(String unidades) {
        this.unidades = unidades;
    }

    public String getUnidades() {
        return unidades;
    }

    public void setMaxPag(Integer maxPag) {
        this.maxPag = maxPag;
    }

    public Integer getMaxPag() {
        return maxPag;
    }

    public void setIdPlaza(String idPlaza) {
        this.idPlaza = idPlaza;
    }

    public String getIdPlaza() {
        return idPlaza;
    }

    public void setIdPlazaOrRfcRequired(Boolean idPlazaOrRfcRequired) {
        this.idPlazaOrRfcRequired = idPlazaOrRfcRequired;
    }

    public Boolean getIdPlazaOrRfcRequired() {
        return idPlazaOrRfcRequired;
    }

    public void setQnaPago(String qnaPago) {
        this.qnaPago = qnaPago;
    }

    public String getQnaPago() {
        return qnaPago;
    }

    public void setQnaPagoRequired(Boolean qnaPagoRequired) {
        this.qnaPagoRequired = qnaPagoRequired;
    }

    public Boolean getQnaPagoRequired() {
        return qnaPagoRequired;
    }
    
    public void setSubReport(String subReport) {
        this.subReport = subReport;
    }

    public String getSubReport() {
        return subReport;
    }

    public Boolean getQnaRepRequired() {
        return qnaRepRequired;
    }


    public void setRfcUnico(String rfcUnico) {
        this.rfcUnico = rfcUnico;
    }

    public String getRfcUnico() {
        return rfcUnico;
    }

    public void setRfcUnicoRequired(Boolean rfcUnicoRequired) {
        this.rfcUnicoRequired = rfcUnicoRequired;
    }

    public Boolean getRfcUnicoRequired() {
        return rfcUnicoRequired;
    }

    public void setLeyenda(String leyenda) {
        this.leyenda = leyenda;
    }

    public String getLeyenda() {
        return leyenda;
    }

    public void setLeyendaRequired(Boolean leyendaRequired) {
        this.leyendaRequired = leyendaRequired;
    }

    public Boolean getLeyendaRequired() {
        return leyendaRequired;
    }
}


