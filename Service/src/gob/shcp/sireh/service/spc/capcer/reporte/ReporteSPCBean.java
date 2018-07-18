package gob.shcp.sireh.service.spc.capcer.reporte;

import gob.shcp.fsn.service.AbstractBean;
import gob.shcp.sireh.model.spc.TcCapCursoPrincpDTO;
import gob.shcp.sireh.model.spc.TnCapCursoDTO;

import gob.shcp.sireh.model.spc.TnCapParticipanteDTO;

import java.util.List;
import java.util.Map;

import javax.ejb.Local;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;

/**
 * Servicio encargado de obtener y/o guardar informacion para los reportes de capacitacion y certificacion
 */
@Stateless(name = "ReporteSPC")
@Local( { ReporteSPCService.class })
@TransactionManagement(TransactionManagementType.CONTAINER)
@TransactionAttribute(value = TransactionAttributeType.SUPPORTS)
public class ReporteSPCBean extends AbstractBean implements ReporteSPCService {

    /**
     * Obtiene un registro por cicloEjeTematico y claveCurso
     * @author Oscar S.
     * @param cursoClave String
     * @return TnCapCursoDTO
     */
    public TnCapCursoDTO getCursoByClave(String cursoClave) {
        return super.getService(ReporteSPCService.class).getCursoByClave(cursoClave);
    }

    /**
     * Obtiene el curso por su id.
     * @author Cesar B.
     * @param idCurso Integer
     * @return tnCapCursoDTO TnCapCursoDTO
     */
    public TnCapCursoDTO getById(Integer idCurso) {
        return super.getService(ReporteSPCService.class).getById(idCurso);
    }

    /**
     * Metodo que obtiene reporte Acuerdo por unidad Administrativa
     * @author Armando Zuñiga
     * @param ciclo Integer
     * @param fechaIni String
     * @param fechaFin String
     * @return List&lt;Map&lt;Integer, Object&gt;&gt;
     */
    public List<Map<Integer, Object>> generaAcuerdoUnidad(Integer ciclo, String fechaIni, String fechaFin) {
        return super.getService(ReporteSPCService.class).generaAcuerdoUnidad(ciclo, fechaIni, fechaFin);
    }

    /**
     * Metodo que obtiene reporte Acuerdo por Modalidad
     * @author Armando Zuñiga
     * @param ciclo Integer
     * @param fechaIni String
     * @param fechaFin String
     * @return List&lt;Map&gt;Integer, Object&gt;&gt;
     */
    public List<Map<Integer, Object>> generaAcuerdoModalidad(Integer ciclo, String fechaIni, String fechaFin) {
        return super.getService(ReporteSPCService.class).generaAcuerdoModalidad(ciclo, fechaIni, fechaFin);
    }

    /**
     * Metodo que obtiene reporte Acuerdo por Insti Educa
     * @author Armando Zuñiga
     * @param ciclo Integer
     * @param fechaIni String
     * @param fechaFin String
     * @return List&lt;Map&lt;Integer, Object&gt;&gt;
     */
    public List<Map<Integer, Object>> generaAcuerdoInsEdu(Integer ciclo, String fechaIni, String fechaFin) {
        return super.getService(ReporteSPCService.class).generaAcuerdoInsEdu(ciclo, fechaIni, fechaFin);
    }

    /**
     * Obtiene modalidad por claveCurso
     * @author Josue Torres
     * @param cursoClave String
     * @return TcCapCursoPrincpDTO
     */
    public TcCapCursoPrincpDTO getCursoPrincpByClave(String cursoClave) {
        return super.getService(ReporteSPCService.class).getCursoPrincpByClave(cursoClave);
    }

    /**
     * Obtiene Rfc participante por IdClave
     * @author Josue Torres
     * @param cursoClave String, rfcEmpleado String
     * @return TnCapParticipanteDTO
     */
    public TnCapParticipanteDTO getRfcParticipanteByIdCurso(String cursoClave, String rfcEmpleado) {
        return super.getService(ReporteSPCService.class).getRfcParticipanteByIdCurso(cursoClave, rfcEmpleado);
    }

}
