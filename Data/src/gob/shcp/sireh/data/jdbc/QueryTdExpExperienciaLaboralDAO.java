package gob.shcp.sireh.data.jdbc;

import gob.shcp.fsn.data.annotation.FindByNamedQuery;
import gob.shcp.sireh.domain.jdbc.TdExpCurp;
import gob.shcp.sireh.domain.jdbc.TdExpExperienciaLaboral;
import gob.shcp.sireh.domain.jdbc.TotalRegistrosExpediente;

import java.util.List;

public interface QueryTdExpExperienciaLaboralDAO extends TdExpExperienciaLaboralDAO{

    @FindByNamedQuery(name="sequence-experienciaLaboral", value = TdExpExperienciaLaboral.class)
    List<TdExpExperienciaLaboral> getSequenceAltaExperienciaLaboral();
    
    @FindByNamedQuery(name="totalRegistrados-experienciaLaboral", value = TotalRegistrosExpediente.class)
    List<TotalRegistrosExpediente> getTotalRegistradosExperienciaLaboral(String rfcEmpleado);
    
    @FindByNamedQuery(name="totalRechazados-experienciaLaboral", value = TotalRegistrosExpediente.class)
    List<TotalRegistrosExpediente> getTotalRechazadosExperienciaLaboral(String rfcEmpleado);  
}
