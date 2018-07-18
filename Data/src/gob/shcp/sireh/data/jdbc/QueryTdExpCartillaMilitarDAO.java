package gob.shcp.sireh.data.jdbc;

import gob.shcp.fsn.data.annotation.FindByNamedQuery;
import gob.shcp.sireh.domain.jdbc.TdExpCartillaMilitar;
import gob.shcp.sireh.domain.jdbc.TotalRegistrosExpediente;

import java.util.List;

public interface QueryTdExpCartillaMilitarDAO extends TdExpCartillaMilitarDAO {

    @FindByNamedQuery(name = "sequence-altaCartillaMilitar", value = TdExpCartillaMilitar.class)
    List<TdExpCartillaMilitar> getSequenceAltaCartillaMilitar();

    @FindByNamedQuery(name = "totalRegistrados-altaCartillaMilitar", value = TotalRegistrosExpediente.class)
    List<TotalRegistrosExpediente> getTotalRegistradosExpedienteCartillaMilitar(String rfcEmpleado);

    @FindByNamedQuery(name = "totalRechazados-altaCartillaMilitar", value = TotalRegistrosExpediente.class)
    List<TotalRegistrosExpediente> getTotalRechazadosExpedienteCartillaMilitar(String rfcEmpleado);
}