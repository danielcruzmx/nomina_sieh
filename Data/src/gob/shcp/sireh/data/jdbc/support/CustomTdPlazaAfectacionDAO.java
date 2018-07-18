package gob.shcp.sireh.data.jdbc.support;

import gob.shcp.fsn.service.data.DataService;

import java.util.HashMap;
import java.util.List;

public interface CustomTdPlazaAfectacionDAO extends  DataService {
    public void saveTdPlazaAfectacion(List<HashMap<String,Object>> listaMapasPlantilla, String usuario);
    public void deleteTdPlazaAfectacion(String usuario);
}
