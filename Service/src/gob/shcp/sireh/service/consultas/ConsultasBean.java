package gob.shcp.sireh.service.consultas;

import gob.shcp.fsn.service.AbstractBean;
import gob.shcp.sireh.model.expediente.ExpedienteDTO;

import javax.ejb.Local;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;


@Stateless(name = "Consultas")
@Local( { ConsultasService.class })
@TransactionManagement(TransactionManagementType.CONTAINER)
@TransactionAttribute(value = TransactionAttributeType.SUPPORTS)
public class ConsultasBean extends AbstractBean implements ConsultasService {
    
    public ExpedienteDTO datosPersonales(String rfcEmpleado, ExpedienteDTO expedienteDTO){
        return super.getService(ConsultasService.class).datosPersonales(rfcEmpleado, expedienteDTO);
    }
    
    public ExpedienteDTO familiaresDependientes(String rfcEmpleado, ExpedienteDTO expedienteDTO){
        return super.getService(ConsultasService.class).familiaresDependientes(rfcEmpleado, expedienteDTO);
    }
    
    public ExpedienteDTO comprobantesPago(String rfcEmpleado, ExpedienteDTO expedienteDTO){
        return super.getService(ConsultasService.class).comprobantesPago(rfcEmpleado, expedienteDTO);
    }
    
    public ExpedienteDTO incidenciasLaborales(String rfcEmpleado, ExpedienteDTO expedienteDTO){
        return super.getService(ConsultasService.class).incidenciasLaborales(rfcEmpleado, expedienteDTO);
    }
    
    public ExpedienteDTO notasMerito(String rfcEmpleado, ExpedienteDTO expedienteDTO){
        return super.getService(ConsultasService.class).notasMerito(rfcEmpleado, expedienteDTO);
    }
    
    public ExpedienteDTO capacitacionCursos(String rfcEmpleado, ExpedienteDTO expedienteDTO){
        return super.getService(ConsultasService.class).capacitacionCursos(rfcEmpleado, expedienteDTO);
    }
    
    public ExpedienteDTO servicioProfesional(String rfcEmpleado, ExpedienteDTO expedienteDTO){
        return super.getService(ConsultasService.class).servicioProfesional(rfcEmpleado, expedienteDTO);
    }
    
    public String getNombreEmpleado(String rfcEmpleado){
        return super.getService(ConsultasService.class).getNombreEmpleado(rfcEmpleado);
    }
    
}
