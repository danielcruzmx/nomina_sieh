package gob.shcp.sireh.data.jdbc.support;

import gob.shcp.fsn.service.data.DataService;

import java.util.HashMap;
import java.util.List;

public interface CustomTnPlantillaPlazaEstructuraDAO extends DataService {
    public void saveTnPlantillaPlazaEstructura(List<HashMap<String,Object>> listaMapasPlantilla, String usuario);
    public void deleteTnPlantillaPlazaEstructura(String usuario);
}
