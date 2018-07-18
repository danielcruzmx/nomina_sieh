package gob.shcp.sireh.data.jdbc.support;

import gob.shcp.fsn.data.support.JdbcDAO;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class CustomTnPlantillaPlazaEstructuraDAOImpl extends JdbcDAO implements CustomTnPlantillaPlazaEstructuraDAO {

    public void saveTnPlantillaPlazaEstructura(List<HashMap<String, Object>> listaMapasPlantilla, String usuario) {
        List<Object[]> parameters = new ArrayList<Object[]>();

        for (HashMap<String, Object> mapaPago: listaMapasPlantilla) {
            parameters.add(new Object[] { mapaPago.get("idPpeSec"), 
                                          mapaPago.get("ppeAdecuacionCicloAnterior"), 
                                          mapaPago.get("ppeAdecuacionCicloActual"), 
                                          mapaPago.get("ppeInicioVigencia"), 
                                          mapaPago.get("ppeFinVigencia"), 
                                          mapaPago.get("ppeAdecuacionIdUnidad"), 
                                          mapaPago.get("ppeAdecuacionIdNivel"), 
                                          mapaPago.get("ppeAdecuacionIdZona"), 
                                          mapaPago.get("ppeAdecuacionIdPuesto"), 
                                          mapaPago.get("ppeAdecuacionIdPlaza"), 
                                          mapaPago.get("ppeTipoServPub"), 
                                          mapaPago.get("ppeTipoPlaza"), 
                                          mapaPago.get("ppePtoEstrategico"), 
                                          mapaPago.get("ppeImpHono"), 
                                          mapaPago.get("ppeCasos"), 
                                          mapaPago.get("ppeTipo"), 
                                          mapaPago.get("ppeEstatus"), 
                                          mapaPago.get("ppeCancelada"), 
                                          mapaPago.get("ppeTipoMov"), 
                                          mapaPago.get("ppeRegularizable"), 
                                          mapaPago.get("ppeTipoPersonal"), 
                                          mapaPago.get("ppeEntidadFederativa"), 
                                          mapaPago.get("ppeInmueble"), 
                                          mapaPago.get("usuario"), 
                                          mapaPago.get("fecModifico") });
        }
        super.getJdbcTemplate().batchUpdate(super.getQueryDefinition("insertTnPlantillaPlazaEstructura"), parameters);
    }

    public void deleteTnPlantillaPlazaEstructura(String usuario) {
        super.executeByNamedQuery("deleteTnPlantillaPlazaEstructura", usuario);
    }
}
