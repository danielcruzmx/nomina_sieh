package gob.shcp.sireh.model.plaza.reporte;

import gob.shcp.fsn.model.Model;

import org.springmodules.validation.bean.conf.loader.annotation.handler.ValidationMethod;

public class ReportePlazaDTO implements java.io.Serializable, Model {

    // Filtros
    private java.lang.String uniCiclo;
    private java.lang.String idUnidad;
    private java.lang.String qnaCaptura;
    private java.lang.String qnaCaptura2;
    private java.lang.String mesQna;
    private java.lang.String Origen;

    private boolean cancel;
    private boolean muestraReporte;

    // Validaciones
    private java.lang.Boolean uniCicloRequired;
    private java.lang.Boolean idUnidadRequired;
    private java.lang.Boolean qnaCapturaRequired;
    private java.lang.Boolean qnaCaptura2Required;
    private java.lang.Boolean mesQnaRequired;

    private String unidades;
    private String fileName;

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

    public void setUnidades( String unidades ) {
        this.unidades = unidades;
    }

    public String getUnidades() {
        return unidades;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getFileName() {
        return fileName;
    }

    public void setOrigen(String origen) {
        this.Origen = origen;
    }

    public String getOrigen() {
        return Origen;
    }
}
