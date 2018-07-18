package gob.shcp.sireh.model.merito.reporte;

import gob.shcp.fsn.model.Model;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.springmodules.validation.bean.conf.loader.annotation.handler.ValidationMethod;


public class ReporteNotasDeMeritoDTO implements java.io.Serializable, Model {

    // Filtros
    private java.lang.String uniCiclo;
    private java.lang.String idUnidad;
    private java.lang.String qnaCaptura;
    private java.lang.String mesQna;
    private java.lang.String rfcEmpleado;
    private java.lang.String fecInicio;
    private java.lang.String fecFin;
    private java.lang.String remesa;
    private java.lang.String remesa2;
    private java.lang.String cveCausal;
    


    private boolean cancel;
    private boolean muestraReporte;

    // Validaciones
    private java.lang.Boolean uniCicloRequired;
    private java.lang.Boolean idUnidadRequired;
    private java.lang.Boolean qnaCapturaRequired;
    private java.lang.Boolean rfcRequired;
    private java.lang.Boolean mesQnaRequired;
    private java.lang.Boolean fecInicioRequired;
    private java.lang.Boolean fecFinRequired;
    private java.lang.Boolean remesaRequired;
    private java.lang.Boolean remesa2Required;
    private java.lang.Boolean cveCausalRequired;




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
    
    public void setRfcEmpleado(String rfcEmpleado) {
        this.rfcEmpleado = rfcEmpleado;
    }

    public String getRfcEmpleado() {
        return rfcEmpleado;
    }

    public void setFecInicio(String fecInicio) {
        this.fecInicio = fecInicio;
    }

    public String getFecInicio() {
        return fecInicio;
    }

    public void setFecFin(String fecFin) {
        this.fecFin = fecFin;
    }

    public String getFecFin() {
        return fecFin;
    }

    public void setRemesa(String remesa) {
        this.remesa = remesa;
    }

    public String getRemesa() {
        return remesa;
    }

    public void setRemesa2(String remesa2) {
        this.remesa2 = remesa2;
    }

    public String getRemesa2() {
        return remesa2;
    }

    public void setcveCausal(String cveCausal) {
        this.cveCausal = cveCausal;
    }

    public String getcveCausal() {
        return cveCausal;
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

    public void setFecInicioRequired(Boolean fecInicioRequired) {
        this.fecInicioRequired = fecInicioRequired;
    }

    public Boolean getFecInicioRequired() {
        return fecInicioRequired;
    }

    public void setFecFinRequired(Boolean fecFinRequired) {
        this.fecFinRequired = fecFinRequired;
    }

    public Boolean getFecFinRequired() {
        return fecFinRequired;
    }

    public void setRemesaRequired(Boolean remesaRequired) {
        this.remesaRequired = remesaRequired;
    }

    public Boolean getRemesaRequired() {
        return remesaRequired;
    }

    public void setRemesa2Required(Boolean remesa2Required) {
        this.remesa2Required = remesa2Required;
    }

    public Boolean getRemesa2Required() {
        return remesa2Required;
    }

    public void setCveCausalRequired(Boolean cveCausalRequired) {
        this.cveCausalRequired = cveCausalRequired;
    }

    public Boolean getCveCausalRequired() {
        return cveCausalRequired;
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
    
    @ValidationMethod(forProperty = "fecInicio", errorCode = "error.select.unspecified")
    public boolean validateFecInicio() {
        if (this.getFecInicioRequired() != null && this.getFecInicioRequired() && !this.isCancel()) {
            if (this.getFecInicio() != null && !this.getFecInicio().equals("")) {
                muestraReporte = true;
                return true;
            } else {
                muestraReporte = false;
                fecInicio=null;
                return false;
            }
        }
        return true;
    }
    
    @ValidationMethod(forProperty = "fecFin", errorCode = "error.select.unspecified")
    public boolean validateFecFin() {
        if (this.getFecFinRequired() != null && this.getFecFinRequired() && !this.isCancel()) {
            if (this.getFecFin() != null && !this.getFecFin().equals("") ) {
                muestraReporte = true;
                return true;
            } else {
                muestraReporte = false;
                fecFin=null;
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


    public void setRfcRequired(Boolean rfcRequired) {
        this.rfcRequired = rfcRequired;
    }

    public Boolean getRfcRequired() {
        return rfcRequired;
    }
    
    
    @ValidationMethod(forProperty = "rfc", errorCode = "not.null")
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
    
        @ValidationMethod(forProperty = "remesa", errorCode = "error.select.unspecified")
    public boolean validateRemesa() {
        if (this.getRemesaRequired() != null && this.getRemesaRequired() && !this.isCancel()) {
            if (this.getRemesa() != null && !this.getRemesa().equals("")&& !this.getRemesa().equals("0")) {
                muestraReporte = true;
                return true;
            } else {
                muestraReporte = false;
                return false;
            }
        }
        return true;
    }
    
            @ValidationMethod(forProperty = "remesa2", errorCode = "error.select.unspecified")
    public boolean validateRemesa2() {
        if (this.getRemesa2Required() != null && this.getRemesa2Required() && !this.isCancel()) {
            if (this.getRemesa2() != null && !this.getRemesa2().equals("")&& !this.getRemesa2().equals("0")) {
                muestraReporte = true;
                return true;
            } else {
                muestraReporte = false;
                return false;
            }
        }
        return true;
    }
    
    @ValidationMethod(forProperty = "cveCausal", errorCode = "error.select.unspecified")
    public boolean validateCveCausal() {
    if (this.getCveCausalRequired() != null && this.getCveCausalRequired() && !this.isCancel()) {
    if (this.getCveCausal() != null && !this.getCveCausal().equals("")&& !this.getCveCausal().equals("0")) {
        muestraReporte = true;
        return true;
    } else {
        muestraReporte = false;
        return false;
    }
    }
    return true;
    }

    public void setCveCausal(String cveCausal) {
        this.cveCausal = cveCausal;
    }

    public String getCveCausal() {
        return cveCausal;
    }
}

