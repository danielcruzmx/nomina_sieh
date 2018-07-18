package gob.shcp.sireh.domain.jdbc.oficinaVirtual;

import gob.shcp.fsn.data.Domain;
import gob.shcp.sireh.domain.jdbc.TnNotificacion;

import java.io.Serializable;

public class CustomTnNotificacion extends TnNotificacion implements Domain, Serializable {
    
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
