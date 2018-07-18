package gob.shcp.sireh.service.expediente;

import gob.shcp.fsn.service.AbstractService;
import gob.shcp.sireh.data.jdbc.QueryTdEmpleadoDAO;
import gob.shcp.sireh.data.jdbc.TdEmpleadoDAO;
import gob.shcp.sireh.data.jdbc.TdExpControlExpedienteDAO;
import gob.shcp.sireh.data.jdbc.TdExpUsuarioDAO;
import gob.shcp.sireh.domain.jdbc.Item;
import gob.shcp.sireh.domain.jdbc.TdEmpleado;
import gob.shcp.sireh.domain.jdbc.TdExpControlExpediente;
import gob.shcp.sireh.domain.jdbc.TdExpUsuarios;
import gob.shcp.sireh.domain.jdbc.oficinaVirtual.tramites.PeriodoVacacional;
import gob.shcp.sireh.model.ItemDTO;
import gob.shcp.sireh.model.TdExpControlExpedienteDTO;
import gob.shcp.sireh.model.expediente.UsuariosAutorizadosDTO;
//import gob.shcp.sireh.model.oficinaVirtual.EtiquetaClaveValorDTO;
import gob.shcp.sireh.model.oficinaVirtual.PeriodoVacacionalDTO;

import java.util.ArrayList;
import java.util.List;


public class GestionExpedientesBS extends AbstractService implements GestionExpedientesService {

    public UsuariosAutorizadosDTO getUsuario(UsuariosAutorizadosDTO usuariosAutorizadosDTO) {
        TdExpUsuarios tdExpUsuarios = super.persistence().get(TdExpUsuarioDAO.class).getById(usuariosAutorizadosDTO.getRfcEmpleado());

        if (tdExpUsuarios != null) {
            usuariosAutorizadosDTO.setUsuRfcEmpleado(tdExpUsuarios.getRfcEmpleado());
            usuariosAutorizadosDTO.setUsuDoctoAutorizacion(tdExpUsuarios.getUsuDoctoAutorizacion());
            usuariosAutorizadosDTO.setUsuFechaAutorizacion(tdExpUsuarios.getUsuFechaAutorizacion());
            usuariosAutorizadosDTO.setUsuTelefono(tdExpUsuarios.getUsuTelefono());
            usuariosAutorizadosDTO.setIdStatus(tdExpUsuarios.getIdStatus());
        }

        TdEmpleado tdEmpleado = super.persistence().get(TdEmpleadoDAO.class).getById(usuariosAutorizadosDTO.getRfcEmpleado());
        
        if (tdEmpleado != null) {
            usuariosAutorizadosDTO.setUsuNombreEmpleado(tdEmpleado.getNombreEmpleado());
            usuariosAutorizadosDTO.setUsuPrimerApellido(tdEmpleado.getPrimerApellido());
            usuariosAutorizadosDTO.setUsuSegundoApellido(tdEmpleado.getSegundoApellido());
        }
        return usuariosAutorizadosDTO;
    }

    public void saveUsuario(UsuariosAutorizadosDTO usuariosAutorizadosDTO) {
        String userName = super.security().getUserName();
        TdExpUsuarios tdExpUsuarios = super.transformation().map(usuariosAutorizadosDTO, TdExpUsuarios.class);
        tdExpUsuarios.setRfcEmpleado(usuariosAutorizadosDTO.getRfcEmpleado());
        tdExpUsuarios.setUsuario(userName);
        tdExpUsuarios.setFecModifico(new java.util.Date());
        super.persistence().get(TdExpUsuarioDAO.class).save(tdExpUsuarios);
    }

    /**
     * Registro - Control del expediente
     * @author Oscar S.
     * @param tdExpControlExpedienteDTO TdExpControlExpedienteDTO
     */
    public void saveExpedienteControlExpediente(TdExpControlExpedienteDTO tdExpControlExpedienteDTO) {
        TdExpControlExpediente tdExpControlExpedienteBase = super.persistence().get(TdExpControlExpedienteDAO.class).getById(tdExpControlExpedienteDTO.getRfcEmpleado());

        if (tdExpControlExpedienteDTO.getExePrestado() != null && tdExpControlExpedienteBase != null && 
            tdExpControlExpedienteDTO.getExePrestado().equals("NO")) {
            tdExpControlExpedienteDTO.setExeRfcUsuarioPrestamo(tdExpControlExpedienteBase.getExeRfcUsuarioPrestamo());
            tdExpControlExpedienteDTO.setExeFechaPrestamo(tdExpControlExpedienteBase.getExeFechaPrestamo());
        }
        if (tdExpControlExpedienteDTO.getExeDatosUbicacion() == null || 
            tdExpControlExpedienteDTO.getExeDatosUbicacion().equals("")) {
            tdExpControlExpedienteDTO.setExeDatosUbicacion("SIN INFORMACION");
        }
        if (tdExpControlExpedienteDTO.getExeDatosClasificacion() == null || 
            tdExpControlExpedienteDTO.getExeDatosClasificacion().equals("")) {
            tdExpControlExpedienteDTO.setExeDatosClasificacion("SIN INFORMACION");
        }
        
        TdExpControlExpediente tdExpControlExpediente = super.transformation().map(tdExpControlExpedienteDTO, TdExpControlExpediente.class);

        super.persistence().get(TdExpControlExpedienteDAO.class).save(tdExpControlExpediente);
    }
    
}
