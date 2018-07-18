package gob.shcp.sireh.data.jdbc;

import gob.shcp.fsn.data.annotation.FindByNamedQuery;

import gob.shcp.sireh.domain.jdbc.TdExpFechasLaborales;
import gob.shcp.sireh.domain.jdbc.TotalRegistrosExpediente;

import java.util.List;

public interface QueryTdExpFechasLaboralesDAO extends TdExpFechasLaboralesDAO {

    @FindByNamedQuery(name = "sequence-altaFechasLaborales", value = TdExpFechasLaborales.class)
    List<TdExpFechasLaborales> getSequenceAltaFechasLaborales();

    @FindByNamedQuery(name = "totalRegistrados-altaFechasLaborales", value = TotalRegistrosExpediente.class)
    List<TotalRegistrosExpediente> getTotalRegistradosExpedienteFechasLaborales(String rfcEmpleado);

    @FindByNamedQuery(name = "totalRechazados-altaFechasLaborales", value = TotalRegistrosExpediente.class)
    List<TotalRegistrosExpediente> getTotalRechazadosExpedienteFechasLaborales(String rfcEmpleado);
}
