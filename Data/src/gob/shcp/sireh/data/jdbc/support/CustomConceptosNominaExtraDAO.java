package gob.shcp.sireh.data.jdbc.support;

import gob.shcp.fsn.service.data.DataService;

import gob.shcp.sireh.domain.jdbc.ConceptosPagNomExtra;
import gob.shcp.sireh.domain.jdbc.TcConceptoPago;

import java.util.List;

public interface CustomConceptosNominaExtraDAO extends DataService {
    
    public ConceptosPagNomExtra getConceptosNominaExtra(String rfcEmpleado);
    
    public ConceptosPagNomExtra getDatosPlazaByGpoPagoRfc(Integer idPlaza, String rfcEmpleado);
    
    public List<String> getConceptosNominaExtraOrd(String rfcEmpleado);
    
    public List<TcConceptoPago> getConceptosNominaExtraOrdByTipoConcepto(String tipoConcepto);
    
    public List<TcConceptoPago> getConceptosNominaExtraSARFOV();
}
