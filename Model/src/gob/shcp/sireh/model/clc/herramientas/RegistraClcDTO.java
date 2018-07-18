package gob.shcp.sireh.model.clc.herramientas;

import gob.shcp.fsn.model.Model;

public class RegistraClcDTO implements java.io.Serializable, Model {
    
    // Datos de la CXLC
    private Integer cxlcCiclo;
    private Integer cxlcQnaPago;
    private String idTipoNomina;
    private Integer cxlcComplemento;
    private Integer cxlc;
    private Integer cxlcSIAFF;
    
    private boolean cancel;
    private boolean muestraErrores;
    
    public Integer getCxlcCiclo() {
        return cxlcCiclo;
    }

    public void setCxlcCiclo(Integer cxlcCiclo) {
        this.cxlcCiclo = cxlcCiclo;
    }

    public Integer getCxlcQnaPago() {
        return cxlcQnaPago;
    }

    public void setCxlcQnaPago(Integer cxlcQnaPago) {
        this.cxlcQnaPago = cxlcQnaPago;
    }

    public String getIdTipoNomina() {
        return idTipoNomina;
    }

    public void setIdTipoNomina(String idTipoNomina) {
        this.idTipoNomina = idTipoNomina;
    }

    public Integer getCxlcComplemento() {
        return cxlcComplemento;
    }

    public void setCxlcComplemento(Integer cxlcComplemento) {
        this.cxlcComplemento = cxlcComplemento;
    }

    public Integer getCxlc() {
        return cxlc;
    }

    public void setCxlc(Integer cxlc) {
        this.cxlc = cxlc;
    }

    public Integer getCxlcSIAFF() {
        return cxlcSIAFF;
    }

    public void setCxlcSIAFF(Integer cxlcSIAFF) {
        this.cxlcSIAFF = cxlcSIAFF;
    }
    
    public boolean isCancel() {
        return cancel;
    }

    public void setCancel(boolean cancel) {
        this.cancel = cancel;
    }

    public boolean isMuestraErrores() {
        return muestraErrores;
    }

    public void setMuestraErrores(boolean muestraErrores) {
        this.muestraErrores = muestraErrores;
    }
}
