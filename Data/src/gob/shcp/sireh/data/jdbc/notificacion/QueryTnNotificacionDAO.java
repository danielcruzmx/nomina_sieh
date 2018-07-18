package gob.shcp.sireh.data.jdbc.notificacion;

import gob.shcp.fsn.data.annotation.FindByNamedQuery;
import gob.shcp.sireh.data.jdbc.TnNotificacionDAO;

import gob.shcp.sireh.domain.jdbc.TnNotificacion;
import gob.shcp.sireh.domain.jdbc.oficinaVirtual.CustomTnNotificacion;

import java.util.List;

public interface QueryTnNotificacionDAO extends TnNotificacionDAO {

    @FindByNamedQuery(name = "sequence-TnNotificacion", value = TnNotificacion.class)
    public List<TnNotificacion> getSequenceTnNotificacion();
    
    @FindByNamedQuery(name = "TnNotificacion-getNotificacionesEmpleado", value = CustomTnNotificacion.class)
    public List<CustomTnNotificacion> getNotificacionesEmpleado(String rfcEmpleado);
    
    @FindByNamedQuery(name = "TnNotificacion-getNotificacionEmpleado", value = CustomTnNotificacion.class)
    public List<CustomTnNotificacion> getNotificacionEmpleado(Integer idNotificacion, String rfcEmpleado);
}
