package gob.shcp.sireh.service.oficinaVirtual;

import gob.shcp.fsn.service.AbstractService;

import gob.shcp.sireh.data.jdbc.TnNotificacionDAO;
import gob.shcp.sireh.data.jdbc.notificacion.QueryTnNotificacionDAO;

import gob.shcp.sireh.domain.jdbc.TnNotificacion;
import gob.shcp.sireh.domain.jdbc.oficinaVirtual.CustomTnNotificacion;

import gob.shcp.sireh.model.TnNotificacionDTO;
import gob.shcp.sireh.model.oficinaVirtual.CustomTnNotificacionDTO;

import java.util.List;

/**
 * Business Service encargado de atender solicitudes del Módulo de Notificaciones.
 */
public class NotificacionesBS extends AbstractService implements NotificacionesService {
    
    /**
     * Oficina Virtual - Consulta Notificaciones - Metodo encargado de obtener el listado de notificaciones por empleado.
     * @author Oscar S.
     * @param rfcEmpleado String
     * @return List&lt;CustomTnNotificacionDTO&gt;
     */
    public List<CustomTnNotificacionDTO> getNotificacionesEmpleado(String rfcEmpleado) {
        List<CustomTnNotificacion> listaCustomTnNotificacion = super.persistence().get(QueryTnNotificacionDAO.class).getNotificacionesEmpleado(rfcEmpleado);
        logger.debug("NotificacionesBS -> getNotificacionesEmpleado -> listaCustomTnNotificacion.size -> " + listaCustomTnNotificacion.size());
        
        return super.transformation().map(listaCustomTnNotificacion, CustomTnNotificacionDTO.class);
    }
    
    /** 
     * Oficina Virtual - Consulta Notificaciones - Metodo encargado de obtener el detalle de la notificacion con base en su id.
     * @author Oscar S.
     * @param idNotificacion Integer
     * @param rfcEmpleado String
     * @return customTnNotificacionDTO CustomTnNotificacionDTO
     */
    public CustomTnNotificacionDTO getNotificacionEmpleado(Integer idNotificacion, String rfcEmpleado) {
        List<CustomTnNotificacion> listaCustomTnNotificacion = super.persistence().get(QueryTnNotificacionDAO.class).getNotificacionEmpleado(idNotificacion, rfcEmpleado);
        CustomTnNotificacion customTnNotificacion = listaCustomTnNotificacion.get(0);
        return super.transformation().map(customTnNotificacion, CustomTnNotificacionDTO.class);
    }
    
    /** 
     * Oficina Virtual - Consulta Notificaciones - Metodo encargado de registrar la notificacion.
     * @author Oscar S.
     * @param tnNotificacionDTO TnNotificacionDTO
     */
    public void getSaveNotificacion(TnNotificacionDTO tnNotificacionDTO) {
        // Paso 1) Obtener la secuencia
        List<TnNotificacion> tnNotificacionList = super.persistence().get(QueryTnNotificacionDAO.class).getSequenceTnNotificacion();
        TnNotificacion sequence = tnNotificacionList.get(0);
        tnNotificacionDTO.setIdNotificacion(sequence.getIdNotificacion());
        
        // Paso 2) Transformar objeto
        TnNotificacion tnNotificacion = super.transformation().map(tnNotificacionDTO, TnNotificacion.class);
        
        // Paso 3) Guardar registro
        super.persistence().get(TnNotificacionDAO.class).save(tnNotificacion);
    }
    
    /** 
     * Oficina Virtual - Consulta Notificaciones - Metodo encargado de actuallizar la notificacion.
     * @author Oscar S.
     * @param tnNotificacionDTO TnNotificacionDTO
     */
    public void getUpdateNotificacion(TnNotificacionDTO tnNotificacionDTO) {
        // Paso 1) Transformar objeto
        TnNotificacion tnNotificacion = super.transformation().map(tnNotificacionDTO, TnNotificacion.class);
        
        // Paso 2) Guardar registro
        super.persistence().get(TnNotificacionDAO.class).save(tnNotificacion);
    }
}
