package gob.shcp.sireh.data.jdbc;

import gob.shcp.fsn.data.annotation.FindByNamedQuery;
import gob.shcp.sireh.domain.jdbc.TdExpCurp;
import gob.shcp.sireh.domain.jdbc.TotalRegistrosExpediente;

import java.util.List;

public interface QueryTdExpCurpDAO extends TdExpCurpDAO {
    
    @FindByNamedQuery(name="sequence-altaCurp", value = TdExpCurp.class)
    List<TdExpCurp> getSequenceAltaCurp();
    
    @FindByNamedQuery(name="totalRegistrados-altaCurp", value = TotalRegistrosExpediente.class)
    List<TotalRegistrosExpediente> getTotalRegistradosExpedienteCurp(String rfcEmpleado);
    
    @FindByNamedQuery(name="totalRechazados-altaCurp", value = TotalRegistrosExpediente.class)
    List<TotalRegistrosExpediente> getTotalRechazadosExpedienteCurp(String rfcEmpleado);  
}
