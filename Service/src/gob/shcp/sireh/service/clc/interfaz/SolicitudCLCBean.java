package gob.shcp.sireh.service.clc.interfaz;

import gob.shcp.fsn.service.AbstractBean;

import gob.shcp.sireh.model.clc.interfaz.SolicitudCLCDTO;

import java.io.IOException;

import javax.ejb.Local;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;

/**
 * Bean encargado de atender solicitudes correspondientes al modulo Solicitud CLC.
 */
@Stateless(name="SolicitudCLC")
@Local({SolicitudCLCService.class})
@TransactionManagement(TransactionManagementType.CONTAINER)
@TransactionAttribute(value = TransactionAttributeType.SUPPORTS)
public class SolicitudCLCBean extends AbstractBean implements SolicitudCLCService {
    
    /**
     * Metodo encargado de generar el archivo correspondiente a la Solicitud de CLC con base en el objeto solicitudCLCDTO.
     * @author Oscar S.
     * @param solicitudCLCDTO SolicitudCLCDTO
     * @return solicitudCLCDTO SolicitudCLCDTO
     */
    public SolicitudCLCDTO genSolCLCManual(SolicitudCLCDTO solicitudCLCDTO) throws IOException {
        return super.getService(SolicitudCLCService.class).genSolCLCManual(solicitudCLCDTO);
    }
}
