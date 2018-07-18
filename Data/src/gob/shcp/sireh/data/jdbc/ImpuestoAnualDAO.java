package gob.shcp.sireh.data.jdbc;

import gob.shcp.fsn.service.data.DataService;

import java.util.List;
import java.util.Map;

public interface ImpuestoAnualDAO extends DataService {
    
    public void updateNomina(Long idNomina, Integer ciclo);
    
    public List<Map<Integer, Object>> getAcumuladoPercepcionesDeducciones(Integer ciclo, String tipoConcepto, String origen, String filtro);
    
}
