package gob.shcp.sireh.data.jdbc;

import gob.shcp.fsn.data.annotation.FindByNamedQuery;
import gob.shcp.sireh.domain.jdbc.TdExpFamiliarDepsBenef;
import gob.shcp.sireh.domain.jdbc.TotalRegistrosExpediente;

import java.util.List;

public interface QueryTdExpFamiliarDepsBenefDAO extends TdExpFamiliarDepsBenefDAO {
    
    @FindByNamedQuery(name="sequence-altaDependientes", value = TdExpFamiliarDepsBenef.class)
    List<TdExpFamiliarDepsBenef> getSequenceAltaDependientes();
    
    @FindByNamedQuery(name="totalRegistrados-altaDependientes", value = TotalRegistrosExpediente.class)
    List<TotalRegistrosExpediente> getTotalRegistradosExpedienteDependientes(String rfcEmpleado);
    
    @FindByNamedQuery(name="totalRechazados-altaDependientes", value = TotalRegistrosExpediente.class)
    List<TotalRegistrosExpediente> getTotalRechazadosExpedienteDependientes(String rfcEmpleado);
    
    @FindByNamedQuery(name="verificaParentesco-altaDependientes", value = TotalRegistrosExpediente.class)
    List<TotalRegistrosExpediente> verificaParentescoExpedienteDependientes(String rfcEmpleado, Integer idParentesco);
}
