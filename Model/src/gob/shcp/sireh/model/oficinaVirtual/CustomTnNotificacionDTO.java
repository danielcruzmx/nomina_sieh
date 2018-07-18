package gob.shcp.sireh.model.oficinaVirtual;

import gob.shcp.fsn.model.Model;
import gob.shcp.sireh.model.TnNotificacionDTO;

public class CustomTnNotificacionDTO extends TnNotificacionDTO implements java.io.Serializable, Model {

    private String descTipoNotificacion;
    private String descSituacionNotificacion;

    public void setDescTipoNotificacion(String descTipoNotificacion) {
        this.descTipoNotificacion = descTipoNotificacion;
    }

    public String getDescTipoNotificacion() {
        return descTipoNotificacion;
    }

    public void setDescSituacionNotificacion(String descSituacionNotificacion) {
        this.descSituacionNotificacion = descSituacionNotificacion;
    }

    public String getDescSituacionNotificacion() {
        return descSituacionNotificacion;
    }
}
