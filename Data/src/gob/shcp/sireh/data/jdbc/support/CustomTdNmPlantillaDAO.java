package gob.shcp.sireh.data.jdbc.support;

import gob.shcp.fsn.service.data.DataService;

import java.util.HashMap;
import java.util.List;

public interface CustomTdNmPlantillaDAO extends  DataService {

    /** 
    * Metodo para insertar los datos que vienen del archivo de puntualidad, capacitación o evaluación de desempeño en la tabla temporal
    * @author Victor Pérez.
    * @param listaMapasPlantilla List<HashMap<String,Object>>
    * @param usuario String
    * @return void
    */
    public void savePlantilla(List<HashMap<String,Object>> listaMapasPlantilla, String usuario);
    
    /** 
    * Metodo para actualizas el RFC empatando la tabla de Histórico, Resúmen y el Archivo de Carga contra la tabla de Empleado
    * @author Victor Pérez.
    * @param debeDecir String
    * @param dice String
    * @param tdNmId String
    * @return void
    */
    public void updatePlantillaRfc(String debeDecir, String dice, String tdNmId);
    
    /** 
    * Metodo para eliminar los registros de la tabla temporal almacenados derivados de la carga de archivos
    * @author Victor Pérez.
    * @param tdNmOp String
    * @return void
    */
    public void deletePlantilla(String tnNmpOp);
}
