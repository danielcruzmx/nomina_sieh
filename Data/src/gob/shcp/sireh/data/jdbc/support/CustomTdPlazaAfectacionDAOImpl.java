package gob.shcp.sireh.data.jdbc.support;

import gob.shcp.fsn.data.support.JdbcDAO;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class CustomTdPlazaAfectacionDAOImpl extends JdbcDAO implements CustomTdPlazaAfectacionDAO {

    public void saveTdPlazaAfectacion(List<HashMap<String, Object>> listaMapasTdPlazaAfectacion, String usuario) {
        List<Object[]> parameters = new ArrayList<Object[]>();

        for (HashMap<String, Object> mapaPago: listaMapasTdPlazaAfectacion) {
            parameters.add(new Object[] { mapaPago.get("plafCiclo"), mapaPago.get("idOficioAfecta"), 
                                          mapaPago.get("idPlaza"), mapaPago.get("idOperacion"), 
                                          mapaPago.get("idRegularizable"), mapaPago.get("idJustificacion"), 
                                          mapaPago.get("idUnidad"), mapaPago.get("idPuesto"), mapaPago.get("idEdo"), 
                                          mapaPago.get("idZonaEcon"), mapaPago.get("idGrupoPago"), 
                                          mapaPago.get("plafProfAmplia"), mapaPago.get("plafProfReduce"), 
                                          mapaPago.get("plafInicio"), mapaPago.get("plafFinal"), 
                                          mapaPago.get("plafDiasPrima"), mapaPago.get("plafDiasAguinaldo"), 
                                          mapaPago.get("usuario"), mapaPago.get("fecModifico") });

        }
        super.getJdbcTemplate().batchUpdate(super.getQueryDefinition("insertTdPlazaAfectacion"), parameters);
    }

    public void deleteTdPlazaAfectacion(String usuario) {
        super.executeByNamedQuery("deleteTdPlazaAfectacion", usuario);
    }
}
