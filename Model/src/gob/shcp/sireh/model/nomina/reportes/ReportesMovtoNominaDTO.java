package gob.shcp.sireh.model.nomina.reportes;

import gob.shcp.fsn.model.Model;

import java.text.SimpleDateFormat;

import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.springmodules.validation.bean.conf.loader.annotation.handler.ValidationMethod;

public class ReportesMovtoNominaDTO implements java.io.Serializable, Model {

    private SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

    // Filtros
    private java.lang.String uniCiclo;
    private java.lang.String mesQna;
    private java.lang.String idUnidad;
    private java.lang.String situacionPlaza;
    private java.lang.String qnaCaptura;
    private java.lang.String tipoCpto;
    private java.lang.String qnaIni;
    private java.lang.String qnaFin;
    private java.lang.String qnaRep;
    private java.lang.String idUni;
    private java.lang.String concepto;
    private java.lang.String complemento;
    private java.lang.String tipoNomina;
    private java.lang.String situacionCaptura;
    private java.lang.String grupoPago;

    private java.util.Date fecInicial;
    private java.util.Date fecFinal;
    private String semestre;

    private String rfcEmpleado;
    private String primerApellido;
    private String segundoApellido;
    private String nombreApellido;
    private String curpEmpleado;
    private String idPlaza;
    private String idUnidadNom;
    private String descUnidad;

    private String tipoEntero;

    private Integer idMovtoEmpPla;
    private String mepObserva;
    
    // Contrato Honorarios
    private String chNumDictamen;
    private String chNumOficio;
    private String chNombreResp;
    private String chDescCargo;
    private String chConocim;
    private String chEstudios;
    private String chServsProf;
    
    private boolean cancel;
    private boolean muestraReporte = false;

    private String qnaIniNumber;
    private String qnaFinNumber;
    private String unidades;

    // Validaciones
    private java.lang.Boolean uniCicloRequired;
    private java.lang.Boolean idUnidadRequired;
    private java.lang.Boolean qnaCapturaRequired;
    private java.lang.Boolean rfcRequired;
    private java.lang.Boolean idPlazaRequired;
    private java.lang.Boolean mesQnaRequired;
    private java.lang.Boolean situacionPlazaRequired;
    private java.lang.Boolean tipoCptoRequired;
    private java.lang.Boolean qnaIniRequired;
    private java.lang.Boolean qnaFinRequired;
    private java.lang.Boolean qnaRepRequired;
    private java.lang.Boolean idUniRequired;
    private java.lang.Boolean conceptoRequired;
    private java.lang.Boolean complementoRequired;
    private java.lang.Boolean tipoNominaRequired;
    private java.lang.Boolean fecInicialRequired;
    private java.lang.Boolean fecFinalRequired;
    
    
    

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

    public void setSituacionPlaza(String situacionPlaza) {
        this.situacionPlaza = situacionPlaza;
    }

    public String getSituacionPlaza() {
        return situacionPlaza;
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

    public void setSituacionPlazaRequired(Boolean situacionPlazaRequired) {
        this.situacionPlazaRequired = situacionPlazaRequired;
    }

    public Boolean getSituacionPlazaRequired() {
        return situacionPlazaRequired;
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
    
    /* V A L I D A C I O N E S */
    
    @ValidationMethod(forProperty = "uniCiclo", errorCode = "error.select.unspecified")
    public boolean validateUniCiclo() {
        if (this.getUniCicloRequired() != null && this.getUniCicloRequired() && 
            !this.isCancel()) {
            if (this.getUniCiclo() != null && !this.getUniCiclo().equals("") && 
                !this.getUniCiclo().equals("0")) {
                //muestraReporte = true;
                uniCicloRequired = false;
                return true;
            } else {
                //muestraReporte = false;
                uniCicloRequired = true;
                return false;
            }
        }
        return true;
    }

    @ValidationMethod(forProperty = "idUnidad", errorCode = "error.select.unspecified")
    public boolean validateIdUnidad() {
        if (this.getIdUnidadRequired() != null && this.getIdUnidadRequired() && 
            !this.isCancel()) {
            if (this.getIdUnidad() != null && !this.getIdUnidad().equals("") && 
                !this.getIdUnidad().equals("0")) {
                //muestraReporte = true;
                return true;
            } else {
                //muestraReporte = false;
                return false;
            }
        }
        return true;
    }

    @ValidationMethod(forProperty = "idUni", errorCode = "error.select.unspecified")
    public boolean validateIdUni() {
        if (this.getIdUniRequired() != null && this.getIdUniRequired() && 
            !this.isCancel()) {
            if (this.getIdUni() != null && !this.getIdUni().equals("") && 
                !this.getIdUni().equals("0")) {
                idUniRequired = false;
                //muestraReporte = true;
                return true;
            } else {
                //muestraReporte = false;
                 idUniRequired = true;
                return false;
            }
        }
        return true;
    }

    @ValidationMethod(forProperty = "mesQna", errorCode = "error.select.unspecified")
    public boolean validateMesQna() {
        if (this.getMesQnaRequired() != null && this.getMesQnaRequired() && 
            !this.isCancel()) {
            if (this.getMesQna() != null && !this.getMesQna().equals("") && 
                !this.getMesQna().equals("0")) {
                //muestraReporte = true;
                return true;
            } else {
                //muestraReporte = false;
                return false;
            }
        }
        return true;
    }

    @ValidationMethod(forProperty = "qnaCaptura", errorCode = "error.select.unspecified")
    public boolean validateQnaCaptura() {
        if (this.getQnaCapturaRequired() != null && !this.isCancel()) {
            if (this.getQnaCaptura() != null && 
                !this.getQnaCaptura().equals("") && 
                !this.getQnaCaptura().equals("0")) {
                Pattern pat = Pattern.compile("[0-9]+");
                Matcher mat = pat.matcher(this.getQnaCaptura());
                if (mat.matches()) {
                    //muestraReporte = true;
                    return true;
                } else {
                    //muestraReporte = false;
                    return false;
                }

            } else {
                //muestraReporte = false;
                return false;
            }
        }
        return true;
    }

    @ValidationMethod(forProperty = "rfcEmpleado", errorCode = "not.null")
    public boolean validateRfc() {
        if (this.getRfcRequired() != null && this.getRfcRequired() && 
            !this.isCancel()) {
            if (this.getRfcEmpleado() != null && 
                !this.getRfcEmpleado().equals("")) {
                Pattern pat = Pattern.compile("[A-Z]{4}[0-9]{6}[A-Z0-9]*{3}");
                Matcher mat = pat.matcher(this.getRfcEmpleado());
                if (mat.matches()) {
                    //muestraReporte = true;
                    return true;
                } else {
                    //muestraReporte = false;
                    rfcEmpleado = null;
                    return false;
                }
            } else {
                //muestraReporte = false;
                return false;
            }
        }
        return true;
    }

    @ValidationMethod(forProperty = "situacionPlaza", errorCode = "error.select.unspecified")
    public boolean validateSituacionPlaza() {
        if (this.getSituacionPlazaRequired() != null && 
            this.getSituacionPlazaRequired() && !this.isCancel()) {
            if (this.getSituacionPlaza() != null && 
                !this.getSituacionPlaza().equals("") && 
                !this.getSituacionPlaza().equals("0")) {
                //muestraReporte = true;
                return true;
            } else {
                //muestraReporte = false;
                return false;
            }
        }
        return true;
    }

    @ValidationMethod(forProperty = "tipoCpto", errorCode = "error.select.unspecified")
    public boolean validateTipoCpto() {
        if (this.getTipoCptoRequired() != null && this.getTipoCptoRequired() && 
            !this.isCancel()) {
            if (this.getTipoCpto() != null && !this.getTipoCpto().equals("") && 
                !this.getTipoCpto().equals("0")) {
                //muestraReporte = true;
                return true;
            } else {
                //muestraReporte = false;
                return false;
            }
        }
        return true;
    }

    @ValidationMethod(forProperty = "tipoNomina", errorCode = "error.select.unspecified")
    public boolean validateTipoNomina() {
        if (this.getTipoNominaRequired() != null && 
            this.getTipoNominaRequired() && !this.isCancel()) {
            if (this.getTipoNomina() != null && 
                !this.getTipoNomina().equals("") && 
                !this.getTipoNomina().equals("0")) {
                //muestraReporte = true;
                return true;
            } else {
                //muestraReporte = false;
                return false;
            }
        }
        return true;
    }

    @ValidationMethod(forProperty = "qnaIni", errorCode = "error.select.unspecified")
    public boolean validateQnaIni() {
        if (this.getQnaIniRequired() != null && this.getQnaIniRequired() && 
            !this.isCancel()) {
            if (this.getQnaIni() != null && !this.getQnaIni().equals("") && 
                !this.getQnaIni().equals("0")) {
                //muestraReporte = true;
                return true;
            } else {
                //muestraReporte = false;
                return false;
            }
        }
        return true;
    }
    @ValidationMethod(forProperty = "qnaRep", errorCode = "error.select.unspecified")
    public boolean validateQnaRep() {
        if (this.getQnaRepRequired() != null && this.getQnaRepRequired() && 
            !this.isCancel()) {
            if (this.getQnaRep() != null && !this.getQnaRep().equals("") && 
                !this.getQnaRep().equals("0")) {
                //muestraReporte = true;
                return true;
            } else {
                //muestraReporte = false;
                return false;
            }
        }
        return true;
    }

    @ValidationMethod(forProperty = "qnaFin", errorCode = "error.select.unspecified")
    public boolean validateQnaFin() {
        if (this.getQnaFinRequired() != null && this.getQnaFinRequired() && 
            !this.isCancel()) {
            if (this.getQnaFin() != null && !this.getQnaFin().equals("") && 
                !this.getQnaFin().equals("0")) {
                //muestraReporte = true;
                return true;
            } else {
                //muestraReporte = false;
                return false;
            }
        }
        return true;
    }

    @ValidationMethod(forProperty = "concepto",  errorCode = "error.select.unspecified")
    public boolean validateConcepto() {
        if (this.getConceptoRequired() != null && this.getConceptoRequired() && 
            !this.isCancel()) {
            if (this.getConcepto() != null && !this.getConcepto().equals("") && 
                !this.getConcepto().equals("0")) {
                //muestraReporte = true;
                return true;
            } else {
                //muestraReporte = false;
                return false;
            }
        }
        return true;
    }

    @ValidationMethod(forProperty = "complemento", errorCode = "not.null")
    public boolean validateComplemento() {
        if (this.getComplementoRequired() != null && 
            this.getComplementoRequired() && !this.isCancel()) {
            if (this.getComplemento() != null && 
                !this.getComplemento().equals("")) {
                //muestraReporte = true;
                return true;
            } else {
                //muestraReporte = false;
                complemento = null;
                return false;
            }
        }
        return true;
    }

    public void setSituacionCaptura(String situacionCaptura) {
        this.situacionCaptura = situacionCaptura;
    }

    public String getSituacionCaptura() {
        return situacionCaptura;
    }

    public void setFecInicial(Date fecInicial) {
        this.fecInicial = fecInicial;
    }

    public Date getFecInicial() {
        return fecInicial;
    }

    public void setFecFinal(Date fecFinal) {
        this.fecFinal = fecFinal;
    }

    public Date getFecFinal() {
        return fecFinal;
    }

    public void setFecInicialRequired(Boolean fecInicialRequired) {
        this.fecInicialRequired = fecInicialRequired;
    }

    public Boolean getFecInicialRequired() {
        return fecInicialRequired;
    }

    public void setFecFinalRequired(Boolean fecFinalRequired) {
        this.fecFinalRequired = fecFinalRequired;
    }

    public Boolean getFecFinalRequired() {
        return fecFinalRequired;
    }

    public String getFecInicialCad() {
        return dateFormat.format(fecInicial);
    }

    public String getFecFinalCad() {
        return dateFormat.format(fecFinal);
    }

    public void setRfcEmpleado(String rfcEmpleado) {
        this.rfcEmpleado = rfcEmpleado;
    }

    public String getRfcEmpleado() {
        return rfcEmpleado;
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    public String getPrimerApellido() {
        return primerApellido;
    }

    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }

    public String getSegundoApellido() {
        return segundoApellido;
    }

    public void setNombreApellido(String nombreApellido) {
        this.nombreApellido = nombreApellido;
    }

    public String getNombreApellido() {
        return nombreApellido;
    }

    public void setCurpEmpleado(String curpEmpleado) {
        this.curpEmpleado = curpEmpleado;
    }

    public String getCurpEmpleado() {
        return curpEmpleado;
    }

    public void setIdPlaza(String idPlaza) {
        this.idPlaza = idPlaza;
    }

    public String getIdPlaza() {
        return idPlaza;
    }

    public void setIdUnidadNom(String idUnidadNom) {
        this.idUnidadNom = idUnidadNom;
    }

    public String getIdUnidadNom() {
        return idUnidadNom;
    }

    public void setDescUnidad(String descUnidad) {
        this.descUnidad = descUnidad;
    }

    public String getDescUnidad() {
        return descUnidad;
    }

    public void setSemestre(String semestre) {
        this.semestre = semestre;
    }

    public String getSemestre() {
        return semestre;
    }

    public void setIdMovtoEmpPla(Integer idMovtoEmpPla) {
        this.idMovtoEmpPla = idMovtoEmpPla;
    }

    public Integer getIdMovtoEmpPla() {
        return idMovtoEmpPla;
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

    public void setUnidades(String unidades) {
        this.unidades = unidades;
    }

    public String getUnidades() {
        return unidades;
    }

    public void setIdPlazaRequired(Boolean idPlazaRequired) {
        this.idPlazaRequired = idPlazaRequired;
    }

    public Boolean getIdPlazaRequired() {
        return idPlazaRequired;
    }

    public void setMepObserva(String mepObserva) {
        this.mepObserva = mepObserva;
    }

    public String getMepObserva() {
        return mepObserva;
    }
    
    public void setChNumDictamen(String chNumDictamen) {
        this.chNumDictamen = chNumDictamen;
    }

    public String getChNumDictamen() {
        return chNumDictamen;
    }

    public void setChNumOficio(String chNumOficio) {
        this.chNumOficio = chNumOficio;
    }

    public String getChNumOficio() {
        return chNumOficio;
    }

    public void setChDescCargo(String chDescCargo) {
        this.chDescCargo = chDescCargo;
    }

    public String getChDescCargo() {
        return chDescCargo;
    }

    public void setChConocim(String chConocim) {
        this.chConocim = chConocim;
    }

    public String getChConocim() {
        return chConocim;
    }

    public void setChEstudios(String chEstudios) {
        this.chEstudios = chEstudios;
    }

    public String getChEstudios() {
        return chEstudios;
    }

    public void setChServsProf(String chServsProf) {
        this.chServsProf = chServsProf;
    }

    public String getChServsProf() {
        return chServsProf;
    }
    
    public void setChNombreResp(String chNombreResp) {
        this.chNombreResp = chNombreResp;
    }

    public String getChNombreResp() {
        return chNombreResp;
    }

    public void setDateFormat(SimpleDateFormat dateFormat) {
        this.dateFormat = dateFormat;
    }

    public SimpleDateFormat getDateFormat() {
        return dateFormat;
    }

    public void setQnaRep(String qnaRep) {
        this.qnaRep = qnaRep;
    }

    public String getQnaRep() {
        return qnaRep;
    }

    public void setIdUni(String idUni) {
        this.idUni = idUni;
    }

    public String getIdUni() {
        return idUni;
    }

    public void setQnaRepRequired(Boolean qnaRepRequired) {
        this.qnaRepRequired = qnaRepRequired;
    }

    public Boolean getQnaRepRequired() {
        return qnaRepRequired;
    }

    public void setIdUniRequired(Boolean idUniRequired) {
        this.idUniRequired = idUniRequired;
    }

    public Boolean getIdUniRequired() {
        return idUniRequired;
    }

    public void setGrupoPago(String grupoPago) {
        this.grupoPago = grupoPago;
    }

    public String getGrupoPago() {
        return grupoPago;
    }

    public void setTipoEntero(String tipoEntero) {
        this.tipoEntero = tipoEntero;
    }

    public String getTipoEntero() {
        return tipoEntero;
    }
}

