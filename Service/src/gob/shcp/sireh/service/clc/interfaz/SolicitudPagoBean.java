package gob.shcp.sireh.service.clc.interfaz;

import gob.shcp.fsn.service.AbstractBean;

import gob.shcp.sireh.model.clc.interfaz.SolicitudPagoDTO;

import java.io.IOException;

import javax.ejb.Local;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;

/**
 * Bean encargado de atender solicitudes correspondientes al modulo Solicitud Pago.
 */
@Stateless(name="SolicitudPago")
@Local({SolicitudPagoService.class})
@TransactionManagement(TransactionManagementType.CONTAINER)
@TransactionAttribute(value = TransactionAttributeType.SUPPORTS)
public class SolicitudPagoBean extends AbstractBean implements SolicitudPagoService {

    /**
     * Metodo encargado de generar el archivo correspondiente a la Solicitud de pago con base en el objeto solicitudPagoDTO.
     * @author Oscar S.
     * @param solicitudPagoDTO SolicitudCLCDTO
     * @return solicitudPagoDTO SolicitudCLCDTO
     */
    public SolicitudPagoDTO updateGenSolPagoManual(SolicitudPagoDTO solicitudPagoDTO) throws IOException {
        return super.getService(SolicitudPagoService.class).updateGenSolPagoManual(solicitudPagoDTO);
    }
}
