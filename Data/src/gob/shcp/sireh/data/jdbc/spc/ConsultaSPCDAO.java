package gob.shcp.sireh.data.jdbc.spc;

import gob.shcp.fsn.service.data.DataService;

import java.util.List;
import java.util.Map;

public interface ConsultaSPCDAO extends DataService {

    /**
     * Metodo encargado de obtener Acuerdos CAPCER
     * @author Armando Zuñiga.
     * @param ciclo Integer
     * @param fechaIni String
     * @param fechaFin String
     * @return List&lt;Map&lt;Integer, Object&gt;&gt;
     */
    public List<Map<Integer, Object>> generaAcuerdosUnidad(Integer ciclo, String fechaIni, String fechaFin);

    /**
     * Metodo encargado de obtener Acuerdos CAPCER Modalidad
     * @author Armando Zuñiga.
     * @param ciclo Integer
     * @param fechaIni String
     * @param fechaFin String
     * @return List&lt;Map&lt;Integer, Object&gt;&gt;
     */
    public List<Map<Integer, Object>> generaAcuerdosModalidad(Integer ciclo, String fechaIni, String fechaFin);

    /**
     * Metodo encargado de obtener Acuerdos CAPCER Insti Educa
     * @author Armando Zuñiga.
     * @param ciclo Integer
     * @param fechaIni String
     * @param fechaFin String
     * @return List&lt;Map&lt;Integer, Object&gt;&gt;
     */
    public List<Map<Integer, Object>> generaAcuerdosInsEdu(Integer ciclo, String fechaIni, String fechaFin);

}
