package gob.shcp.sireh.model.clc.interfaz;

import gob.shcp.fsn.model.Model;
import gob.shcp.sireh.model.TcBeneficiarioSicopDTO;

import java.util.List;

public class DetalleBeneficiarioDTO extends TcBeneficiarioSicopDTO implements java.io.Serializable, Model {

    private boolean muestraRegistros; 
    private boolean cancel;
    private String[] tiponomina;
    private List<String> tipoNomina;

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

    public void setTiponomina(String[] tiponomina) {
        this.tiponomina = tiponomina;
    }

    public String[] getTiponomina() {
        return tiponomina;
    }
    
    public List<String> getTipoNomina() {
        return tipoNomina;
    }

    public void setTipoNomina(List<String> tipoNomina) {
        this.tipoNomina = tipoNomina;
    }
}
