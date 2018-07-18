package gob.shcp.sireh.data.jdbc.rusp;

import gob.shcp.fsn.data.annotation.FindByNamedQuery;
import gob.shcp.sireh.data.jdbc.TdPlazaDAO;
import gob.shcp.sireh.domain.jdbc.CustomOutputFile;
import gob.shcp.sireh.domain.jdbc.rusp.CustomEmpleadoPlazaRusp;

import java.util.List;

public interface QueryDatosEmpleadoPlazaRuspDAO extends TdPlazaDAO {
    
    @FindByNamedQuery(name = "tdPlaza-datosEmpleadoPlazaRusp", value = CustomEmpleadoPlazaRusp.class)
    public List<CustomEmpleadoPlazaRusp> getDatosEmpleadoPlazaRusp(Integer idPlaza, Integer ciclo);

    @FindByNamedQuery(name = "interfaz-getBajasRusp", value = CustomOutputFile.class)
    public List<CustomOutputFile> getBajasRusp(String quincena);

    @FindByNamedQuery(name = "interfaz-getBajasRuspNqna", value = CustomOutputFile.class)
    public List<CustomOutputFile> getBajasRuspNqna(String quincena);

    @FindByNamedQuery(name = "interfaz-getDatosPersonalesRusp", value = CustomOutputFile.class)
    public List<CustomOutputFile> getDatosPersonalesRusp(String quincena);

    @FindByNamedQuery(name = "interfaz-getBajasCicloRusp", value = CustomOutputFile.class)
    public List<CustomOutputFile> getBajasCicloRusp(String ciclo);

    @FindByNamedQuery(name = "interfaz-getInfoBasicaRusp", value = CustomOutputFile.class)
    public List<CustomOutputFile> getInfoBasicaRusp(String ciclo);

}
