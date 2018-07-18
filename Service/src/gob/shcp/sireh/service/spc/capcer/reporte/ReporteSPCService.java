package gob.shcp.sireh.service.spc.capcer.reporte;

import gob.shcp.fsn.service.BusinessService;

import gob.shcp.sireh.model.spc.TcCapCursoPrincpDTO;
import gob.shcp.sireh.model.spc.TnCapCursoDTO;

import gob.shcp.sireh.model.spc.TnCapParticipanteDTO;

import java.util.List;
import java.util.Map;

import javax.ejb.Local;

/**
 * Servicio encargado de obtener y/o guardar informacion para los reportes de capacitacion y certificacion
 */
@Local
public interface ReporteSPCService extends BusinessService {

    /**
     * Obtiene un registro por cicloEjeTematico y claveCurso
     * @author Oscar S.
     * @param cursoClave String
     * @return TnCapCursoDTO
     */
    public TnCapCursoDTO getCursoByClave(String cursoClave);

    /**
     * Obtiene el curso por su id.
     * @author Cesar B.
     * @param idCurso Integer
     * @return tnCapCursoDTO TnCapCursoDTO
     */
    public TnCapCursoDTO getById(Integer idCurso);

    /**
     * Metodo que obtiene reporte Acuerdo por unidad Administrativa
     * @author Armando Zuñiga
     * @param ciclo Integer
     * @param fechaIni String
     * @param fechaFin String
     * @return List&lt;Map&lt;Integer, Object&gt;&gt;
     */
    public List<Map<Integer, Object>> generaAcuerdoUnidad(Integer ciclo, String fechaIni, String fechaFin);

    /**
     * Metodo que obtiene reporte Acuerdo por Modalidad
     * @author Armando Zuñiga
     * @param ciclo Integer
     * @param fechaIni String
     * @param fechaFin String
     * @return List&lt;Map&lt;Integer, Object&gt;&gt;
     */
    public List<Map<Integer, Object>> generaAcuerdoModalidad(Integer ciclo, String fechaIni, String fechaFin);

    /**
     * Metodo que obtiene reporte Acuerdo por Institucion Educativa
     * @author Armando Zuñiga
     * @param ciclo Integer
     * @param fechaIni String
     * @param fechaFin String
     * @return List&lt;Map&lt;Integer, Object&gt;&gt;
     */
    public List<Map<Integer, Object>> generaAcuerdoInsEdu(Integer ciclo, String fechaIni, String fechaFin);

    /**
     * Obtiene la modalidad por claveCurso
     * @author Josue Torres
     * @param cursoClave String
     * @return TcCapCursoPrincpDTO
     */
    public TcCapCursoPrincpDTO getCursoPrincpByClave(String cursoClave);

    /**
     * Obtiene RFC de participante por id Curso
     * @author Josue Torres
     * @param cursoClave Sring rfcEmpleado String
     * @return TnCapParticipanteDTO
     */
    public TnCapParticipanteDTO getRfcParticipanteByIdCurso(String cursoClave, String rfcEmpleado);

}
