package gob.shcp.sireh.data.jdbc;

import gob.shcp.fsn.data.annotation.FindByNamedQuery;
import gob.shcp.sireh.domain.jdbc.TdExpDatosNacimiento;
import gob.shcp.sireh.domain.jdbc.TotalRegistrosExpediente;

import java.util.List;

public interface QueryTdExpDatosNacimientoDAO extends TdExpDatosNacimientoDAO {

    @FindByNamedQuery(name = "sequence-altaDatosNacimiento", value = TdExpDatosNacimiento.class)
    List<TdExpDatosNacimiento> getSequenceAltaDatosNacimiento();

    @FindByNamedQuery(name = "totalRegistrados-altaDatosNacimiento", value = TotalRegistrosExpediente.class)
    List<TotalRegistrosExpediente> getTotalRegistradosExpedienteDatosNacimiento(String rfcEmpleado);

    @FindByNamedQuery(name = "totalRechazados-altaDatosNacimiento", value = TotalRegistrosExpediente.class)
    List<TotalRegistrosExpediente> getTotalRechazadosExpedienteDatosNacimiento(String rfcEmpleado);
}
