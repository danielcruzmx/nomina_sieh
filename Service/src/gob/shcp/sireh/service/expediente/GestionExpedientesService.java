package gob.shcp.sireh.service.expediente;

import gob.shcp.fsn.service.BusinessService;
import gob.shcp.sireh.model.ItemDTO;
import gob.shcp.sireh.model.TdExpControlExpedienteDTO;
import gob.shcp.sireh.model.expediente.UsuariosAutorizadosDTO;
import gob.shcp.sireh.model.oficinaVirtual.PeriodoVacacionalDTO;

import java.util.List;

import javax.ejb.Local;


@Local
public interface GestionExpedientesService extends BusinessService {

    UsuariosAutorizadosDTO getUsuario(UsuariosAutorizadosDTO usuariosAutorizadosDTO);

    public void saveUsuario(UsuariosAutorizadosDTO usuariosAutorizadosDTO);

    /**
     * Registro - Control del expediente
     * @author Oscar S.
     * @param tdExpControlExpedienteDTO TdExpControlExpedienteDTO
     */
    public void saveExpedienteControlExpediente(TdExpControlExpedienteDTO tdExpControlExpedienteDTO);
    
}
