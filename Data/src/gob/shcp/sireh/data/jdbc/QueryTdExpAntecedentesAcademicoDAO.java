package gob.shcp.sireh.data.jdbc;

import gob.shcp.fsn.data.annotation.FindByNamedQuery;
import gob.shcp.sireh.domain.jdbc.TdExpAntecedentesAcademicos;

import gob.shcp.sireh.domain.jdbc.TotalRegistrosExpediente;

import java.util.List;

public interface QueryTdExpAntecedentesAcademicoDAO extends TdExpAntecedentesAcademicoDAO{

    @FindByNamedQuery(name="sequence-altaAntecedentesAcademicos", value = TdExpAntecedentesAcademicos.class)
    List<TdExpAntecedentesAcademicos> getSequenceAltaAntecedentesAcademicos();
    
    @FindByNamedQuery(name="totalRegistrados-altaAntecedentesAcademicos", value = TotalRegistrosExpediente.class)
    List<TotalRegistrosExpediente> getTotalRegistradosExpedienteAntecedentesAcademicos(String rfcEmpleado);
    
    @FindByNamedQuery(name="totalRechazados-altaAntecedentesAcademicos", value = TotalRegistrosExpediente.class)
    List<TotalRegistrosExpediente> getTotalRechazadosExpedienteAntecedentesAcademicos(String rfcEmpleado);    
}
