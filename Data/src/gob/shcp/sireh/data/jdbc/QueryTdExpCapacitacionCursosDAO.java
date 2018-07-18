package gob.shcp.sireh.data.jdbc;

import gob.shcp.fsn.data.annotation.FindByNamedQuery;
import gob.shcp.sireh.domain.jdbc.TdExpCapacitacion;
import gob.shcp.sireh.domain.jdbc.TotalRegistrosExpediente;

import java.util.List;

public interface QueryTdExpCapacitacionCursosDAO extends TdExpCapacitacionDAO {

    @FindByNamedQuery(name="sequence-altaCapacitacionCursos", value = TdExpCapacitacion.class)
    List<TdExpCapacitacion> getSequenceAltaCapacitacionCursos();
    
    @FindByNamedQuery(name="totalRegistrados-altaCapacitacionCursos", value = TotalRegistrosExpediente.class)
    List<TotalRegistrosExpediente> getTotalRegistradosExpedienteCapacitacionCursos(String rfcEmpleado);
    
    @FindByNamedQuery(name="totalRechazados-altaCapacitacionCursos", value = TotalRegistrosExpediente.class)
    List<TotalRegistrosExpediente> getTotalRechazadosExpedienteCapacitacionCursos(String rfcEmpleado); 
}
