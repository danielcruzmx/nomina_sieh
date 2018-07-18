package gob.shcp.sireh.service.clc.interfaz;

import gob.shcp.fsn.service.BusinessService;

import gob.shcp.sireh.model.clc.interfaz.SolicitudPagoDTO;

import java.io.IOException;

import javax.ejb.Local;

@Local
public interface SolicitudPagoService  extends BusinessService {
    
    /**
     * Metodo encargado de generar el archivo correspondiente a la Solicitud de pago con base en el objeto solicitudPagoDTO.
     * @author Oscar S.
     * @param solicitudPagoDTO SolicitudPagoDTO
     * @return solicitudPagoDTO SolicitudPagoDTO
     */
    SolicitudPagoDTO updateGenSolPagoManual(SolicitudPagoDTO solicitudPagoDTO) throws IOException;
}
