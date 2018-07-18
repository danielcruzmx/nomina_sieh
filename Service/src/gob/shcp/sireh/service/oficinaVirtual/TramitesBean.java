package gob.shcp.sireh.service.oficinaVirtual;

import gob.shcp.fsn.service.AbstractBean;
import gob.shcp.sireh.model.ItemDTO;
import gob.shcp.sireh.model.expediente.ExpedienteDTO;
import gob.shcp.sireh.model.oficinaVirtual.PeriodoVacacionalDTO;

import java.util.List;

import javax.ejb.Local;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;

@Stateless(name = "Tramites")
@TransactionManagement(TransactionManagementType.CONTAINER)
@TransactionAttribute(value = TransactionAttributeType.SUPPORTS)
@Local( { TramitesService.class })
public class TramitesBean extends AbstractBean implements TramitesService {
    
    /**
     * Consulta los datos perosonales del trabajador
     * @author Martin C.
     * @param rfc String
     * @return periodoVacacionalDTO
     */
    public PeriodoVacacionalDTO getDatosUsuario(String rfc){
       return super.getService(TramitesService.class).getDatosUsuario(rfc);
    } 
    
    /**
     * Consulta los estatus de la Solicitud Individual de Vacaciones
     * @author Martin C.
     * @return ArrayList
     */
    public List<ItemDTO> getStatatusVacaciciones(){
        return super.getService(TramitesService.class).getStatatusVacaciciones();
    }
}
