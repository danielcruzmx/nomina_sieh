package gob.shcp.sireh.data.jdbc;

import gob.shcp.fsn.data.annotation.FindByNamedQuery;

import gob.shcp.sireh.domain.jdbc.TdExpRfc;
import gob.shcp.sireh.domain.jdbc.TotalRegistrosExpediente;

import java.util.List;

public interface QueryTdExpRfcDAO extends TdExpRfcDAO {
    
    @FindByNamedQuery(name="sequence-altaRfc", value = TdExpRfc.class)
    List<TdExpRfc> getSequenceAltaRfc();
    
    @FindByNamedQuery(name="totalRegistrados-altaRfc", value = TotalRegistrosExpediente.class)
    List<TotalRegistrosExpediente> getTotalRegistradosExpedienteRfc(String rfcEmpleado);
    
    @FindByNamedQuery(name="totalRechazados-altaRfc", value = TotalRegistrosExpediente.class)
    List<TotalRegistrosExpediente> getTotalRechazadosExpedienteRfc(String rfcEmpleado);
    
    @FindByNamedQuery(name="totalHistoricoRfc-expModEstatus", value = TdExpRfc.class)
    List<TdExpRfc> getHistoricosExpedienteRfc(String rfcEmpleado);
    
    @FindByNamedQuery(name="totalRegistroRfc-expModEstatus", value = TdExpRfc.class)
    List<TdExpRfc> getRegistroExpedienteRfc(String rfcEmpleado);
    
    /******************************************************************************************************************************************************************************/
    
    @FindByNamedQuery(name="totalRegistradosRfc-expModEstatus", value = TotalRegistrosExpediente.class)
    List<TotalRegistrosExpediente> getTotalRegistradosExpModEstatusRfc(String rfcEmpleado, Integer idDocto);
    
    @FindByNamedQuery(name="totalRechazadosRfc-expModEstatus", value = TotalRegistrosExpediente.class)
    List<TotalRegistrosExpediente> getTotalRechazadosExpModEstatusRfc(String rfcEmpleado, Integer idDocto);
}
