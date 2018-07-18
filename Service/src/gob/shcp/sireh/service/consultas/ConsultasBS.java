package gob.shcp.sireh.service.consultas;

import gob.shcp.fsn.service.AbstractService;
import gob.shcp.sireh.data.jdbc.QueryExpedienteDAO;
import gob.shcp.sireh.data.jdbc.support.CustomTnComprobante;
import gob.shcp.sireh.domain.CustomTdExpDoctosSinDatos;
import gob.shcp.sireh.domain.jdbc.CustomExpediente;
import gob.shcp.sireh.domain.jdbc.CustomTdDepEco;
import gob.shcp.sireh.domain.jdbc.CustomTdExpCapacitacion;
import gob.shcp.sireh.domain.jdbc.CustomTnMovtoConceptoPago;
import gob.shcp.sireh.model.CustomTdExpCapacitacionDTO;
import gob.shcp.sireh.model.CustomTdExpDoctosSinDatosDTO;
import gob.shcp.sireh.model.expediente.CustomTdDepEcoDTO;
import gob.shcp.sireh.model.expediente.CustomTnComprobanteDTO;
import gob.shcp.sireh.model.expediente.CustomTnMovtoConceptoPagoDTO;
import gob.shcp.sireh.model.expediente.ExpedienteDTO;

import java.util.List;


public class ConsultasBS extends AbstractService implements ConsultasService {
    
    public ExpedienteDTO datosPersonales(String rfcEmpleado, ExpedienteDTO expedienteDTO) {
        List<CustomExpediente> datosPersonales = super.persistence().get(QueryExpedienteDAO.class).findExpediente(rfcEmpleado);
        CustomExpediente personales = datosPersonales.get(0);
        
        expedienteDTO = super.transformation().map(personales, ExpedienteDTO.class);
        return expedienteDTO;
    }
    
    public ExpedienteDTO familiaresDependientes(String rfcEmpleado, ExpedienteDTO expedienteDTO){
        List<CustomTdDepEco> listaDependientesDomain = super.persistence().get(QueryExpedienteDAO.class).findDependientesEco(rfcEmpleado);
        final List<CustomTdDepEcoDTO> listaDependientesDTO = super.transformation().map(listaDependientesDomain, CustomTdDepEcoDTO.class);
        expedienteDTO.setListaDependientesDTO(listaDependientesDTO);
        return expedienteDTO;
    }
    
    public ExpedienteDTO comprobantesPago(String rfcEmpleado, ExpedienteDTO expedienteDTO){
        List<CustomExpediente> datosPersonales = super.persistence().get(QueryExpedienteDAO.class).findExpediente(rfcEmpleado);
        CustomExpediente personales = datosPersonales.get(0);
        expedienteDTO = super.transformation().map(personales, ExpedienteDTO.class);
    
        List<CustomTnComprobante> comprobantes = super.persistence().get(QueryExpedienteDAO.class).findComprobante(rfcEmpleado);
        final List<CustomTnComprobanteDTO> listaTnComprobanteDTO = super.transformation().map(comprobantes, CustomTnComprobanteDTO.class);
        expedienteDTO.setListaComprobanteDTO(listaTnComprobanteDTO);
        return expedienteDTO;
    }
    
    public ExpedienteDTO incidenciasLaborales(String rfcEmpleado, ExpedienteDTO expedienteDTO){
        List<CustomExpediente> datosPersonales = super.persistence().get(QueryExpedienteDAO.class).findExpediente(rfcEmpleado);
        CustomExpediente personales = datosPersonales.get(0);
        
        expedienteDTO = super.transformation().map(personales, ExpedienteDTO.class);
        List<CustomTnMovtoConceptoPago> listaIncidenciasDomain = super.persistence().get(QueryExpedienteDAO.class).findConceptosAdicionales(rfcEmpleado, "%", "%", "P%", 
                                                                                                                                                       "D%", "U%", "LS%", "LM%", "67%", 
                                                                                                                                                       "OE%", "OS%", "FA%", "OV%", 
                                                                                                                                                       "TV%", "17%", "18%", "DL%", 
                                                                                                                                                       "DM%", "I7%", "D7%", "D8%");
        
        final List<CustomTnMovtoConceptoPagoDTO> listaIncidenciasDTO = super.transformation().map(listaIncidenciasDomain, CustomTnMovtoConceptoPagoDTO.class);
        expedienteDTO.setListaIncidenciasDTO(listaIncidenciasDTO);
        return expedienteDTO;
    }
    
    public ExpedienteDTO notasMerito(String rfcEmpleado, ExpedienteDTO expedienteDTO){
        List<CustomExpediente> listaExpedientes = super.persistence().get(QueryExpedienteDAO.class).findExpediente(rfcEmpleado);
        CustomExpediente expedientevar = listaExpedientes.get(0);
        expedienteDTO = super.transformation().map(expedientevar, ExpedienteDTO.class);
        return expedienteDTO;
    }
    
    public ExpedienteDTO capacitacionCursos(String rfcEmpleado, ExpedienteDTO expedienteDTO){
        List<CustomExpediente> datosPersonales = super.persistence().get(QueryExpedienteDAO.class).findExpediente(rfcEmpleado);
        CustomExpediente personales = datosPersonales.get(0);
        expedienteDTO = super.transformation().map(personales, ExpedienteDTO.class);
    
        List<CustomTdExpCapacitacion> listaCapacitacionDomain = super.persistence().get(QueryExpedienteDAO.class).findCapacitacion(rfcEmpleado);
        List<CustomTdExpCapacitacionDTO> listaCapacitacionDTO = super.transformation().map(listaCapacitacionDomain, CustomTdExpCapacitacionDTO.class);
        expedienteDTO.setListaCursosDTO(listaCapacitacionDTO);
        return expedienteDTO;
    }
    
    public ExpedienteDTO servicioProfesional(String rfcEmpleado, ExpedienteDTO expedienteDTO){
        List<CustomExpediente> datosPersonales = super.persistence().get(QueryExpedienteDAO.class).findExpediente(rfcEmpleado);
        CustomExpediente personales = datosPersonales.get(0);
        expedienteDTO = super.transformation().map(personales, ExpedienteDTO.class);
        
        List<CustomTdExpDoctosSinDatos> listaSPCDomain = super.persistence().get(QueryExpedienteDAO.class).findSPC(rfcEmpleado);
        final List<CustomTdExpDoctosSinDatosDTO> listaSPCDTO = super.transformation().map(listaSPCDomain, CustomTdExpDoctosSinDatosDTO.class);
        expedienteDTO.setListaSPCDTO(listaSPCDTO);
        
        return expedienteDTO;
    }
    
    public String getNombreEmpleado(String rfcEmpleado){
        List<CustomExpediente> usuario = super.persistence().get(QueryExpedienteDAO.class).findNomEmpl(rfcEmpleado);
        if(usuario.size() > 0){   return usuario.get(0).getNombreEmp();   }
        else return "";
    }
    
}