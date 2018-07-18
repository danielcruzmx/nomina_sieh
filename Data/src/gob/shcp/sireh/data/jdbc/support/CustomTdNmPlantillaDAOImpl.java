package gob.shcp.sireh.data.jdbc.support;

import gob.shcp.fsn.data.support.JdbcDAO;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class CustomTdNmPlantillaDAOImpl extends JdbcDAO implements CustomTdNmPlantillaDAO {

    /** 
     * Metodo para insertar los datos que vienen del archivo de puntualidad, capacitaci�n o evaluaci�n de desempe�o en la tabla temporal
     * @author Victor P�rez.
     * @param listaMapasPlantilla List<HashMap<String,Object>>
     * @param usuario String
     * @return void
     */
    public void savePlantilla(List<HashMap<String, Object>> listaMapasPlantilla, String usuario) {
        List<Object[]> parameters = new ArrayList<Object[]>();

        for (HashMap<String, Object> mapaPago: listaMapasPlantilla) {
            parameters.add(new Object[] { mapaPago.get("tnNmpId"), mapaPago.get("tnNmpTipoCarga"), 
                                          mapaPago.get("tnNmpFechaCarga"), mapaPago.get("tnNmpRfc"), 
                                          mapaPago.get("tnNmpNombre"), mapaPago.get("tnNmpUnidad"), 
                                          mapaPago.get("tnNmpPuesto"), mapaPago.get("tnNmpPlaza"), 
                                          mapaPago.get("tnNmpNivel"), mapaPago.get("tnNmpCurso"), 
                                          mapaPago.get("tnNmpDenominacion"), mapaPago.get("tnNmpInicio"), 
                                          mapaPago.get("tnNmpTermino"), mapaPago.get("tnNmpDuracion"), 
                                          mapaPago.get("tnNmpTipoPuesto"), mapaPago.get("tnNmpGenero"), 
                                          mapaPago.get("tnNmpEstatus"), mapaPago.get("tnNmpMes"), 
                                          mapaPago.get("tnNmpOp") });

        }
        super.getJdbcTemplate().batchUpdate(super.getQueryDefinition("insertMeritoPlantilla"), parameters);
    }

    /** 
     * Metodo para actualizar el RFC empatando la tabla de Hist�rico, Res�men y el Archivo de Carga contra la tabla de Empleado
     * @author Victor P�rez.
     * @param debeDecir String
     * @param dice String
     * @param tdNmId String
     * @return void
     */
    public void updatePlantillaRfc(String debeDecir, String dice, String tdNmId) {
        super.executeByNamedQuery("updateMeritoActualizaRfcContrArchivo", debeDecir, dice, tdNmId);
    }

    /** 
     * Metodo para eliminar los registros de la tabla temporal almacenados derivados de la carga de archivos
     * @author Victor P�rez.
     * @param tnNmpOp String
     * @return void
     */
    public void deletePlantilla(String tnNmpOp) {
        super.executeByNamedQuery("deletePlantillaMerito", tnNmpOp);
    }
}
