package gob.shcp.sireh.service.nomina.reportes;

import gob.shcp.fsn.service.BusinessService;

import java.util.List;
import java.util.Map;

import javax.ejb.Local;

@Local
public interface ReporteCalculoService extends BusinessService {
    
    public Integer getHistoricoMaxPag( String rfcEmpleado, String qnaIni, String qnaFin );
    
    /**
     * Servicio para la generacion de archivos con informacion de nomina y conceptos con o sin pago
     * @author Roberto Muñoz
     * @param consecNomina,  tipoarchivo
     * @return Lista con datos
     */

    public List<Map<Integer, Object>> getHistoricoRevision(Integer consecNomina, String tipoarchivo);
    
    public List<Map<Integer, Object>> getHistoricoAcumulado(Integer qnaini, Integer qnafin, String rfc, String rfcb, String estatus, String tipopro);
    
    
}
