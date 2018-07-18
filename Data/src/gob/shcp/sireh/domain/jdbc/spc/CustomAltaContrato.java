package gob.shcp.sireh.domain.jdbc.spc;

import gob.shcp.fsn.data.Domain;

import java.io.Serializable;

public class CustomAltaContrato extends TnCapContratoCur implements Domain, Serializable {
    
    private String descSituacion;

    public void setDescSituacion(String descSituacion) {
        this.descSituacion = descSituacion;
    }

    public String getDescSituacion() {
        return descSituacion;
    }
}
