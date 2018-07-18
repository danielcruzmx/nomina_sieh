package gob.shcp.sireh.model.nomina.terceros;

import gob.shcp.fsn.model.Model;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.springmodules.validation.bean.conf.loader.annotation.handler.ValidationMethod;

public class ReportesTercerosDTO implements java.io.Serializable, Model {

    // Filtros
    private java.lang.String uniCiclo;
    private java.lang.String idUnidad;
    private java.lang.String qnaCaptura = "0";
    private java.lang.String qnaCaptura2;
    private java.lang.String mesQna;
    private java.lang.String tipoNomina;
    private java.lang.String complemento;
    private java.lang.String fechaQna;
    private java.lang.String tipoReporte = "=";
    private java.lang.String tipoNom = "O";
    private java.lang.String tipoPension = "0";
    

    private boolean cancel;
    private boolean muestraReporte;

    // Validaciones
    private java.lang.Boolean uniCicloRequired;
    private java.lang.Boolean idUnidadRequired;
    private java.lang.Boolean qnaCapturaRequired;
    private java.lang.Boolean qnaCaptura2Required;
    private java.lang.Boolean mesQnaRequired;
    private java.lang.Boolean tipoNominaRequired;
    private java.lang.Boolean complementoRequired;
    private java.lang.Boolean tercerosRequired;
    private java.lang.Boolean fechaQnaRequired;
    private java.lang.Boolean tipoNomRequired;

    private String idTercero = "0";
    private String unidades;    
    
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

    public String getQnaCaptura2() {
        return qnaCaptura2;
    }

    public void setQnaCaptura2(String qnaCaptura2) {
        this.qnaCaptura2 = qnaCaptura2;
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
    
    public void setTipoNomina(String tipoNomina) {
        this.tipoNomina = tipoNomina;
    }

    public String getTipoNomina() {
        return tipoNomina;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getComplemento() {
        return complemento;
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

    public Boolean getQnaCaptura2Required() {
        return qnaCaptura2Required;
    }

    public void setQnaCaptura2Required(Boolean qnaCaptura2Required) {
        this.qnaCaptura2Required = qnaCaptura2Required;
    }

    public Boolean getMesQnaRequired() {
        return mesQnaRequired;
    }

    public void setMesQnaRequired(Boolean mesQnaRequired) {
        this.mesQnaRequired = mesQnaRequired;
    }

    public void setTipoNominaRequired(Boolean tipoNominaRequired) {
        this.tipoNominaRequired = tipoNominaRequired;
    }

    public Boolean getTipoNominaRequired() {
        return tipoNominaRequired;
    }

    public void setComplementoRequired(Boolean complementoRequired) {
        this.complementoRequired = complementoRequired;
    }

    public Boolean getComplementoRequired() {
        return complementoRequired;
    }
    
    @ValidationMethod(forProperty = "uniCiclo", errorCode = "error.select.unspecified")
    public boolean validateUniCiclo() {
        if (this.getUniCicloRequired() != null && this.getUniCicloRequired() && !this.isCancel()) {
            if (this.getUniCiclo() != null && !this.getUniCiclo().equals("") && !this.getUniCiclo().equals("0")) {
                muestraReporte = true;
                return true;
            } else {
                muestraReporte = false;
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

    
    @ValidationMethod(forProperty = "complemento", errorCode = "error.select.unspecified")
    public boolean validateComplemento() {
        if (this.getComplementoRequired() != null && this.getComplementoRequired() && !this.isCancel()) {
            if (this.getComplemento() != null && !this.getComplemento().equals("") ) {
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
    
    @ValidationMethod(forProperty = "fechaQna", errorCode = "error.select.unspecified")
    public boolean validateFechaQna() {
        if (this.getFechaQnaRequired() != null && this.getFechaQnaRequired() && !this.isCancel()) {
            if (this.getFechaQna() != null && !this.getFechaQna().equals("") && !this.getFechaQna().equals("0")) {
                muestraReporte = true;
                return true;
            } else {
                muestraReporte = false;
                return false;
            }
        }
        return true;
    }

    public void setIdTercero(String idTercero) {
        this.idTercero = idTercero;
    }

    public String getIdTercero() {
        return idTercero;
    }

    public void setTercerosRequired(Boolean tercerosRequired) {
        this.tercerosRequired = tercerosRequired;
    }

    public Boolean getTercerosRequired() {
        return tercerosRequired;
    }

    public void setFechaQna(String fechaQna) {
        this.fechaQna = fechaQna;
    }

    public String getFechaQna() {
        return fechaQna;
    }

    public void setFechaQnaRequired(Boolean fechaQnaRequired) {
        this.fechaQnaRequired = fechaQnaRequired;
    }

    public Boolean getFechaQnaRequired() {
        return fechaQnaRequired;
    }

    public void setTipoReporte(String tipoReporte) {
        this.tipoReporte = tipoReporte;
    }

    public String getTipoReporte() {
        return tipoReporte;
    }

    public void setTipoNom(String tipoNom) {
        this.tipoNom = tipoNom;
    }

    public String getTipoNom() {
        return tipoNom;
    }

    public void setTipoNomRequired(Boolean tipoNomRequired) {
        this.tipoNomRequired = tipoNomRequired;
    }

    public Boolean getTipoNomRequired() {
        return tipoNomRequired;
    }

    public void setTipoPension(String tipoPension) {
        this.tipoPension = tipoPension;
    }

    public String getTipoPension() {
        return tipoPension;
    }

    public void setUnidades(String unidades) {
        this.unidades = unidades;
    }

    public String getUnidades() {
        return unidades;
    }
}

