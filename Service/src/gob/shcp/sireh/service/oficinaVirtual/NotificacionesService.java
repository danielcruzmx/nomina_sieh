package gob.shcp.sireh.service.oficinaVirtual;

import gob.shcp.fsn.service.BusinessService;

import gob.shcp.sireh.model.TnNotificacionDTO;
import gob.shcp.sireh.model.oficinaVirtual.CustomTnNotificacionDTO;

import java.util.List;

import javax.ejb.Local;

@Local
public interface NotificacionesService extends BusinessService {
    
    /**
     * Oficina Virtual - Consulta Notificaciones - Metodo encargado de obtener el listado de notificaciones por empleado.
     * @author Oscar S.
     * @param rfcEmpleado String
     * @return List&lt;CustomTnNotificacionDTO&gt;
     */
    public List<CustomTnNotificacionDTO> getNotificacionesEmpleado(String rfcEmpleado);

    /** 
     * Oficina Virtual - Consulta Notificaciones - Metodo encargado de obtener el detalle de la notificacion con base en su id.
     * @author Oscar S.
     * @param idNotificacion Integer
     * @param rfcEmpleado String
     * @return customTnNotificacionDTO CustomTnNotificacionDTO
     */
    public CustomTnNotificacionDTO getNotificacionEmpleado(Integer idNotificacion, String rfcEmpleado);

    /** 
     * Oficina Virtual - Consulta Notificaciones - Metodo encargado de registrar la notificacion.
     * @author Oscar S.
     * @param tnNotificacionDTO TnNotificacionDTO
     */
    public void getSaveNotificacion(TnNotificacionDTO tnNotificacionDTO);
    
    /** 
     * Oficina Virtual - Consulta Notificaciones - Metodo encargado de actualizar la notificacion.
     * @author Oscar S.
     * @param tnNotificacionDTO TnNotificacionDTO
     */
    public void getUpdateNotificacion(TnNotificacionDTO tnNotificacionDTO);
}
