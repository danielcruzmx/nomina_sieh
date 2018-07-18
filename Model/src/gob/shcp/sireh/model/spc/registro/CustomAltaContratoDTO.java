package gob.shcp.sireh.model.spc.registro;

import gob.shcp.fsn.model.Model;

import gob.shcp.sireh.model.spc.TnCapContratoCurDTO;

public class CustomAltaContratoDTO extends TnCapContratoCurDTO implements java.io.Serializable, Model {
    
    private String descSituacion;

    public void setDescSituacion(String descSituacion) {
        this.descSituacion = descSituacion;
    }

    public String getDescSituacion() {
        return descSituacion;
    }
}
