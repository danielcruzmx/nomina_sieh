package gob.shcp.sireh.service.clc.interfaz;

import gob.shcp.fsn.service.BusinessService;

import gob.shcp.sireh.model.TcTipoNominaDTO;
import gob.shcp.sireh.model.clc.interfaz.SolicitudCompromisoDTO;

import java.io.IOException;

import java.util.List;

import javax.ejb.Local;

@Local
public interface SolicitudCompromisoService extends BusinessService {

    /**
     * Metodo encargado de generar el archivo correspondiente a la Solicitud de compromiso con base en el objeto solicitudCompromisoDTO.
     * @author Oscar S.
     * @param solicitudCompromisoDTO SolicitudCompromisoDTO
     * @return solicitudCompromisoDTO SolicitudCompromisoDTO
     */
    SolicitudCompromisoDTO updateGenSolCompManual(SolicitudCompromisoDTO solicitudCompromisoDTO) throws IOException;
    
    /**
     * Metodo encargado de obtener las nominas validas para el Usuario comodin.
     * @author Oscar S.
     * @return nominasValidasBenefComodin List<TcTipoNominaDTO>
     */
    List<TcTipoNominaDTO> getNominasValidasBenefComodin();
}
