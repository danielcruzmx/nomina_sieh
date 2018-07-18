package gob.shcp.sireh.model.oficinaVirtual;

import gob.shcp.fsn.model.Model;

public class ConsultaNotificacionesDTO implements java.io.Serializable, Model {
    
    private boolean regresar;
    
    public void setRegresar(boolean regresar) {
        this.regresar = regresar;
    }

    public boolean isRegresar() {
        return regresar;
    }
}
