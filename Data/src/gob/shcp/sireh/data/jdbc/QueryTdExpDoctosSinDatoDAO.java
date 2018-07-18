package gob.shcp.sireh.data.jdbc;

import gob.shcp.fsn.data.annotation.FindByNamedQuery;

import gob.shcp.sireh.domain.jdbc.TcTipoDocExpAux;
import gob.shcp.sireh.domain.jdbc.TdExpDoctosSinDatos;
import gob.shcp.sireh.domain.jdbc.TotalRegistrosExpediente;

import java.util.List;

public interface QueryTdExpDoctosSinDatoDAO extends TdExpDoctosSinDatoDAO {
    
    @FindByNamedQuery(name="sequence-altaDocumentosSinCaptura", value = TdExpDoctosSinDatos.class)
    List<TdExpDoctosSinDatos> getSequenceAltaDoctosSinDatos();
    
    @FindByNamedQuery(name="totalRegistrados-altaDocumentosSinCaptura", value = TotalRegistrosExpediente.class)
    List<TotalRegistrosExpediente> getTotalRegistradosExpedienteDocumentosSinCaptura(String rfcEmpleado, String idDocto);
    
    @FindByNamedQuery(name="totalRechazados-altaDocumentosSinCaptura", value = TotalRegistrosExpediente.class)
    List<TotalRegistrosExpediente> getTotalRechazadosExpedienteDocumentosSinCaptura(String rfcEmpleado, String idDocto);   

    @FindByNamedQuery(name="getTcDescripcionAux-documentosSinDatos", value = TcTipoDocExpAux.class)
    List<TcTipoDocExpAux> getTcDescripcionAux(String idDocto);   
    
}
