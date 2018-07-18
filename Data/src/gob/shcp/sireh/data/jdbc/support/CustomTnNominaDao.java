package gob.shcp.sireh.data.jdbc.support;

import gob.shcp.fsn.service.data.DataService;


import gob.shcp.sireh.domain.jdbc.TnNomina;

import java.util.List;
import java.util.Map;



public interface CustomTnNominaDao extends DataService {

    public int getNextComplemento(TnNomina tnNomina);

    public int updateNominaTimbrado();
    
    public TnNomina getById(int idNomina);
    
    public Map<String, Object> getTnNominaBlobById(int idNomina);
    
    public Integer getNumDoctosByTableExpediente(String nomTabla, Integer idRechazo);
    
    public List<Map<String, Object>> getDoctosByTableExpediente(String nomTabla, Integer idRechazo);
    
    
}
