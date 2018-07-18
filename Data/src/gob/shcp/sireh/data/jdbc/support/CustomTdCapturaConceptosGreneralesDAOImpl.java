package gob.shcp.sireh.data.jdbc.support;

import gob.shcp.fsn.data.support.JdbcDAO;
import gob.shcp.sireh.domain.jdbc.ConceptosGenerales;


public class CustomTdCapturaConceptosGreneralesDAOImpl extends JdbcDAO implements CustomTdCapturaConceptosGreneralesDAO {
    public CustomTdCapturaConceptosGreneralesDAOImpl() {   }
    
    public ConceptosGenerales buscarConceptosGenerales(java.lang.String fcEmpleado){
        ConceptosGenerales conceptosGenerales = super.findByNamedQuery(ConceptosGenerales.class, "SQLListaConceptosGenerales", new Object[]{fcEmpleado}).get(0);
        return conceptosGenerales;
    }
    
    public void eliminarConceptoGeneral(ConceptosGenerales conceptosGenerales){
        super.executeByNamedQuery("SQLEliminaConceptoGeneral", conceptosGenerales.getQnaCancelo(),  conceptosGenerales.getMcpRefCancela(), conceptosGenerales.getUsuario(), conceptosGenerales.getRfcEmpleado(), conceptosGenerales.getIdTipoCpto(), conceptosGenerales.getIdCptoPago());
    }
    
}
