package gob.shcp.sireh.model.spc.consulta;

import gob.shcp.fsn.model.Model;

import org.springmodules.validation.bean.conf.loader.annotation.handler.ValidationMethod;

public class ConsultaPresupuestoDTO implements java.io.Serializable, Model {

    private java.lang.Integer cicloEjeTematico;
    private java.lang.Integer trimestre;
    private boolean cancel;
    private boolean muestraReporte;

    public void setCicloEjeTematico(Integer cicloEjeTematico) {
        this.cicloEjeTematico = cicloEjeTematico;
    }

    public Integer getCicloEjeTematico() {
        return cicloEjeTematico;
    }

    public void setTrimestre(Integer trimestre) {
        this.trimestre = trimestre;
    }

    public Integer getTrimestre() {
        return trimestre;
    }

    public void setCancel(boolean cancel) {
        this.cancel = cancel;
    }

    public boolean isCancel() {
        return cancel;
    }

    public void setMuestraReporte(boolean muestraReporte) {
        this.muestraReporte = muestraReporte;
    }

    public boolean isMuestraReporte() {
        return muestraReporte;
    }

    // Validaciones
    @ValidationMethod(forProperty = "cicloEjeTematico", errorCode = "not.null")
    public boolean validatecicloEjeTematicoRequired() {
        if (this.isMuestraReporte()) {
            return (this.cicloEjeTematico != null && this.cicloEjeTematico > 0);
        }
        return true;
    }
}
