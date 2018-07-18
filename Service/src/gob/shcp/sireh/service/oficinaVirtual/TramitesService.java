package gob.shcp.sireh.service.oficinaVirtual;

import gob.shcp.fsn.service.BusinessService;
import gob.shcp.sireh.model.ItemDTO;
import gob.shcp.sireh.model.expediente.ExpedienteDTO;
import gob.shcp.sireh.model.oficinaVirtual.PeriodoVacacionalDTO;

import java.util.List;

import javax.ejb.Local;

@Local
public interface TramitesService extends BusinessService {
    
    /**
     * Consulta los datos perosonales del trabajador
     * @author Martin C.
     * @param rfc String
     * @return periodoVacacionalDTO
     */
    public PeriodoVacacionalDTO getDatosUsuario(String rfc);
    
    /**
     * Consulta los estatus de la Solicitud Individual de Vacaciones
     * @author Martin C.
     * @return ArrayList
     */
    public List<ItemDTO> getStatatusVacaciciones();
    
}
