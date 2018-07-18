package gob.shcp.sireh.data.jdbc.support;

import gob.shcp.fsn.service.data.DataService;
import gob.shcp.sireh.domain.jdbc.ConceptosGenerales;

public interface CustomTdCapturaConceptosGreneralesDAO extends DataService {

    public ConceptosGenerales buscarConceptosGenerales(java.lang.String rfcEmpleado);
    
    public void eliminarConceptoGeneral(ConceptosGenerales conceptosGenerales);
    
}
