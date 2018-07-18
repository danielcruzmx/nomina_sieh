package gob.shcp.sireh.data.jdbc;

import gob.shcp.fsn.data.annotation.FindByNamedQuery;
import gob.shcp.sireh.domain.jdbc.TdExpCuentasBancarias;
import gob.shcp.sireh.domain.jdbc.TotalRegistrosExpediente;

import java.util.List;

public interface QueryTdExpCuentasBancariasDAO extends TdExpCuentasBancariaDAO {
    
    @FindByNamedQuery(name = "sequence-altaCuentasBancarias", value = TdExpCuentasBancarias.class)
    List<TdExpCuentasBancarias> getSequenceAltaCuentasBancarias();

    @FindByNamedQuery(name = "totalRegistrados-altaCuentasBancarias", value = TotalRegistrosExpediente.class)
    List<TotalRegistrosExpediente> getTotalRegistradosExpedienteCuentasBancarias(String rfcEmpleado);

    @FindByNamedQuery(name = "totalRechazados-altaCuentasBancarias", value = TotalRegistrosExpediente.class)
    List<TotalRegistrosExpediente> getTotalRechazadosExpedienteCuentasBancarias(String rfcEmpleado);
    
}
