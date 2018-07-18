package gob.shcp.sireh.service.clc.interfaz;

import gob.shcp.fsn.service.BusinessService;

import gob.shcp.sireh.model.clc.interfaz.SolicitudCLCDTO;

import java.io.IOException;

import javax.ejb.Local;

@Local
public interface SolicitudCLCService  extends BusinessService {

    /**
     * Metodo encargado de generar el archivo correspondiente a la Solicitud de CLC con base en el objeto solicitudCLCDTO.
     * @author Oscar S.
     * @param solicitudCLCDTO SolicitudCLCDTO
     * @return solicitudCLCDTO SolicitudCLCDTO
     */
    SolicitudCLCDTO genSolCLCManual(SolicitudCLCDTO solicitudCLCDTO) throws IOException;
}
