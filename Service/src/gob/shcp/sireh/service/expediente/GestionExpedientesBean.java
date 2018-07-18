package gob.shcp.sireh.service.expediente;

import gob.shcp.fsn.service.AbstractBean;
import gob.shcp.sireh.model.ItemDTO;
import gob.shcp.sireh.model.TdExpControlExpedienteDTO;
import gob.shcp.sireh.model.expediente.UsuariosAutorizadosDTO;
import gob.shcp.sireh.model.oficinaVirtual.PeriodoVacacionalDTO;

import java.util.List;

import javax.ejb.Local;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;


@Stateless(name = "gestionExpedientes")
@TransactionManagement(TransactionManagementType.CONTAINER)
@TransactionAttribute(value = TransactionAttributeType.SUPPORTS)
@Local( { GestionExpedientesService.class })
public class GestionExpedientesBean extends AbstractBean implements GestionExpedientesService {
    
    public UsuariosAutorizadosDTO getUsuario(UsuariosAutorizadosDTO usuariosAutorizadosDTO) {
        return super.getService(GestionExpedientesService.class).getUsuario(usuariosAutorizadosDTO);
    }

    public void saveUsuario(UsuariosAutorizadosDTO usuariosAutorizadosDTO) {
        super.getService(GestionExpedientesService.class).saveUsuario(usuariosAutorizadosDTO);
    }
    
    /**
     * Registro - Control del expediente
     * @author Oscar S.
     * @param tdExpControlExpedienteDTO TdExpControlExpedienteDTO
     */
    public void saveExpedienteControlExpediente(TdExpControlExpedienteDTO tdExpControlExpedienteDTO) {
        super.getService(GestionExpedientesService.class).saveExpedienteControlExpediente(tdExpControlExpedienteDTO);
    }
    
}
