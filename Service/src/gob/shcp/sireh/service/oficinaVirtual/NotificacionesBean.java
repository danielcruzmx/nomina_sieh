package gob.shcp.sireh.service.oficinaVirtual;

import gob.shcp.fsn.service.AbstractBean;

import gob.shcp.sireh.model.TnNotificacionDTO;
import gob.shcp.sireh.model.oficinaVirtual.CustomTnNotificacionDTO;

import java.util.List;

import javax.ejb.Local;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;

@Stateless(name = "Notificaciones")
@Local( { NotificacionesService.class })
@TransactionManagement(TransactionManagementType.CONTAINER)
@TransactionAttribute(value = TransactionAttributeType.SUPPORTS)
public class NotificacionesBean extends AbstractBean implements NotificacionesService {
    
    /**
     * Oficina Virtual - Consulta Notificaciones - Metodo encargado de obtener el listado de notificaciones por empleado.
     * @author Oscar S.
     * @param rfcEmpleado String
     * @return List&lt;CustomTnNotificacionDTO&gt;
     */
    public List<CustomTnNotificacionDTO> getNotificacionesEmpleado(String rfcEmpleado) {
        return super.getService(NotificacionesService.class).getNotificacionesEmpleado(rfcEmpleado);
    }
    
    /** 
     * Oficina Virtual - Consulta Notificaciones - Metodo encargado de obtener el detalle de la notificacion con base en su id.
     * @author Oscar S.
     * @param idNotificacion Integer
     * @param rfcEmpleado String
     * @return customTnNotificacionDTO CustomTnNotificacionDTO
     */
    public CustomTnNotificacionDTO getNotificacionEmpleado(Integer idNotificacion, String rfcEmpleado) {
        return super.getService(NotificacionesService.class).getNotificacionEmpleado(idNotificacion, rfcEmpleado);
    }
    
    /** 
     * Oficina Virtual - Consulta Notificaciones - Metodo encargado de registrar la notificacion.
     * @author Oscar S.
     * @param tnNotificacionDTO TnNotificacionDTO
     */
    public void getSaveNotificacion(TnNotificacionDTO tnNotificacionDTO) {
        super.getService(NotificacionesService.class).getSaveNotificacion(tnNotificacionDTO);
    }
    
    /** 
     * Oficina Virtual - Consulta Notificaciones - Metodo actualizar de registrar la notificacion.
     * @author Oscar S.
     * @param tnNotificacionDTO TnNotificacionDTO
     */
    public void getUpdateNotificacion(TnNotificacionDTO tnNotificacionDTO) {
        super.getService(NotificacionesService.class).getUpdateNotificacion(tnNotificacionDTO);
    }
}
