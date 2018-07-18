package gob.shcp.sireh.model.merito;

import gob.shcp.fsn.model.Model;

import java.io.Serializable;

public class ActImporDepoDTO implements Serializable, Model {
    private boolean limpiar;

    public void setLimpiar(boolean limpiar) {
        this.limpiar = limpiar;
    }

    public boolean isLimpiar() {
        return limpiar;
    }
}
