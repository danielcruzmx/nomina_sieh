package gob.shcp.sireh.data.jdbc;

import gob.shcp.fsn.data.annotation.FindByNamedQuery;

import gob.shcp.sireh.domain.jdbc.TdExpBeneficiarios;
import gob.shcp.sireh.domain.jdbc.TotalRegistrosExpediente;

import java.util.List;

public interface QueryTdExpBeneficiariosDAO extends TdExpBeneficiariosDAO {
    
    @FindByNamedQuery(name="sequence-altaDepBenef", value = TdExpBeneficiarios.class)
    List<TdExpBeneficiarios> getSequenceAltaDepBenef();
    
    @FindByNamedQuery(name="totalRegistrados-altaDepBenef", value = TotalRegistrosExpediente.class)
    List<TotalRegistrosExpediente> getTotalRegistradosExpedienteDepBenef(String rfcEmpleado);
    
    @FindByNamedQuery(name="totalRechazados-altaDepBenef", value = TotalRegistrosExpediente.class)
    List<TotalRegistrosExpediente> getTotalRechazadosExpedienteDepBenef(String rfcEmpleado);
}
