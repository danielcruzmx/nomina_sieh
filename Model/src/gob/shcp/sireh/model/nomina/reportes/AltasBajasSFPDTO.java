package gob.shcp.sireh.model.nomina.reportes;

import gob.shcp.fsn.model.Model;

import org.springmodules.validation.bean.conf.loader.annotation.handler.ValidationMethod;

public class AltasBajasSFPDTO implements java.io.Serializable, Model {

    private java.lang.String qnaRep;
    private boolean cancel;
    private boolean muestraReporte = false;
    
    private java.lang.Boolean qnaRepRequired;

    public void setQnaRep(String qnaRep) {
        this.qnaRep = qnaRep;
    }

    public String getQnaRep() {
        return qnaRep;
    }

    public void setCancel(boolean cancel) {
        this.cancel = cancel;
    }

    public boolean isCancel() {
        return cancel;
    }

    public void setQnaRepRequired(Boolean qnaRepRequired) {
        this.qnaRepRequired = qnaRepRequired;
    }

    public Boolean getQnaRepRequired() {
        return qnaRepRequired;
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

    public void setMuestraReporte(boolean muestraReporte) {
        this.muestraReporte = muestraReporte;
    }

    public boolean isMuestraReporte() {
        return muestraReporte;
    }
}
