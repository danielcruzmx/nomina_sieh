package gob.shcp.sireh.data.jdbc.support;

import gob.shcp.fsn.service.data.DataService;

import java.util.List;
import java.util.Map;

public interface CustomHistoricoRevisionDAO extends DataService {

    /**
     * DAO para la generacion de archivos con informacion de nomina y conceptos con o sin pago
     * @author Roberto Muñoz
     * @param consecNomina, tipoarchivo
     * @return Lista con datos
     */    
   List<Map<Integer, Object>> getSelectHistoricoRevisionOP1(Integer consecNomina, String tipoarchivo) throws Exception ;

    /**
     * DAO para la generacion de archivos con informacion acumulada por rfc y periodo
     * @author Roberto Muñoz
     * @param consecNomina, tipoarchivo
     * @return Lista con datos
     */    
    List<Map<Integer, Object>> getSelectHistoricoAcumuladoOP1(Integer qnaini, Integer qnafin, String rfc, String rfcb, String estatus, String tipopro) throws Exception ;
    
}
