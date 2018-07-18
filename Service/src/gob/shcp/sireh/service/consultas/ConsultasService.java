package gob.shcp.sireh.service.consultas;

import gob.shcp.fsn.service.BusinessService;

import gob.shcp.sireh.model.expediente.ExpedienteDTO;

import javax.ejb.Local;

@Local
public interface ConsultasService extends BusinessService {
    
    public ExpedienteDTO datosPersonales(String rfcEmpleado, ExpedienteDTO expedienteDTO);
    public ExpedienteDTO familiaresDependientes(String rfcEmpleado, ExpedienteDTO expedienteDTO);
    public ExpedienteDTO comprobantesPago(String rfcEmpleado, ExpedienteDTO expedienteDTO);
    public ExpedienteDTO incidenciasLaborales(String rfcEmpleado, ExpedienteDTO expedienteDTO);
    public ExpedienteDTO notasMerito(String rfcEmpleado, ExpedienteDTO expedienteDTO);
    public ExpedienteDTO capacitacionCursos(String rfcEmpleado, ExpedienteDTO expedienteDTO);
    public ExpedienteDTO servicioProfesional(String rfcEmpleado, ExpedienteDTO expedienteDTO);
    public String getNombreEmpleado(String rfcEmpleado);
}
