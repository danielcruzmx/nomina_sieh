package gob.shcp.sireh.service.spc.capcer.reporte;

import gob.shcp.fsn.service.AbstractService;

import gob.shcp.sireh.data.jdbc.spc.ConsultaSPCDAO;
import gob.shcp.sireh.data.jdbc.spc.QueryTcCapCursoPrincpDAO;
import gob.shcp.sireh.data.jdbc.spc.QueryTnCapCursoDAO;
import gob.shcp.sireh.data.jdbc.spc.QueryTnCapParticipanteDAO;
import gob.shcp.sireh.data.jdbc.spc.TcCapCursoPrincpDAO;
import gob.shcp.sireh.data.jdbc.spc.TnCapCursoDAO;

import gob.shcp.sireh.domain.jdbc.spc.TcCapCursoPrincp;
import gob.shcp.sireh.domain.jdbc.spc.TnCapCurso;

import gob.shcp.sireh.domain.jdbc.spc.TnCapParticipante;
import gob.shcp.sireh.model.spc.TcCapCursoPrincpDTO;
import gob.shcp.sireh.model.spc.TnCapCursoDTO;

import gob.shcp.sireh.model.spc.TnCapParticipanteDTO;

import java.util.List;
import java.util.Map;

/**
 * Servicio encargado de obtener y/o guardar informacion para los reportes de capacitacion y certificacion
 */
public class ReporteSPCBS extends AbstractService implements ReporteSPCService {

    /**
     * Obtiene un registro por cicloEjeTematico y claveCurso
     * @author Oscar S.
     * @param cursoClave String
     * @return TnCapCursoDTO
     */
    public TnCapCursoDTO getCursoByClave(String cursoClave) {
        TnCapCursoDTO tnCapCursoDTO = null;
        List<TnCapCurso> tnCapCursoList = super.persistence().get(QueryTnCapCursoDAO.class).getCursoByClave(cursoClave);

        if (tnCapCursoList.size() == 0) {
            tnCapCursoDTO = null;
        } else {
            TnCapCurso tnCapCurso = tnCapCursoList.get(0);
            tnCapCursoDTO = super.transformation().map(tnCapCurso, TnCapCursoDTO.class);
        }
        return tnCapCursoDTO;
    }

    /**
     * Obtiene el curso por su id.
     * @author Cesar B.
     * @param idCurso Integer
     * @return tnCapCursoDTO TnCapCursoDTO
     */
    public TnCapCursoDTO getById(Integer idCurso) {
        TnCapCurso TnCapCurso = super.persistence().get(TnCapCursoDAO.class).getById(idCurso);
        return super.transformation().map(TnCapCurso, TnCapCursoDTO.class);
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
        return super.persistence().get(ConsultaSPCDAO.class).generaAcuerdosUnidad(ciclo, fechaIni, fechaFin);
    }

    /**
     * Metodo que obtiene reporte Acuerdo por Modalidad
     * @author Armando Zuñiga
     * @param ciclo Integer
     * @param fechaIni String
     * @param fechaFin String
     * @return List&lt;Map&lt;Integer, Object&gt;&gt;
     */
    public List<Map<Integer, Object>> generaAcuerdoModalidad(Integer ciclo, String fechaIni, String fechaFin) {
        return super.persistence().get(ConsultaSPCDAO.class).generaAcuerdosModalidad(ciclo, fechaIni, fechaFin);
    }

    /**
     * Metodo que obtiene reporte Acuerdo por Insti Educativa
     * @author Armando Zuñiga
     * @param ciclo Integer
     * @param fechaIni String
     * @param fechaFin String
     * @return List&lt;Map&gt;Integer, Object&gt;&gt;
     */
    public List<Map<Integer, Object>> generaAcuerdoInsEdu(Integer ciclo, String fechaIni, String fechaFin) {
        return super.persistence().get(ConsultaSPCDAO.class).generaAcuerdosInsEdu(ciclo, fechaIni, fechaFin);
    }

    /**
     * Obtiene la modalidad por claveCurso
     * @author Josue Torres 
     * @param cursoClave String
     * @return tcCapCursoPrincpDTO TcCapCursoPrincpDTO
     */
    public TcCapCursoPrincpDTO getCursoPrincpByClave(String cursoClave) {
        TcCapCursoPrincpDTO tcCapCursoPrincpDTO = null;
        List<TcCapCursoPrincp> listaTcCapCursoPrincp = super.persistence().get(QueryTcCapCursoPrincpDAO.class).getCursoPrincpByClave(cursoClave);
        List<TcCapCursoPrincpDTO> listaTcCapCursoPrincpDTO = super.transformation().map(listaTcCapCursoPrincp, TcCapCursoPrincpDTO.class);
        
        if(listaTcCapCursoPrincpDTO != null && !listaTcCapCursoPrincpDTO.isEmpty()){
            tcCapCursoPrincpDTO = listaTcCapCursoPrincpDTO.get(0);
        }
        return tcCapCursoPrincpDTO;
    }

    /**
     * Obtiene Rfc de participante por idCurso
     * @author Josue Torres 
     * @param cursoClave String, rfcEmpleado String
     * @return tnCapParticipanteDTO TnCapParticipanteDTO
     */
    public TnCapParticipanteDTO getRfcParticipanteByIdCurso(String cursoClave, String rfcEmpleado) {
        TnCapParticipanteDTO tnCapParticipanteDTO = null;
        List<TnCapParticipante> listaTnCapParticipante = super.persistence().get(QueryTnCapParticipanteDAO.class).getRfcParticipanteByIdCurso(cursoClave, rfcEmpleado);
        List<TnCapParticipanteDTO> listaTnCapParticipanteDTO = super.transformation().map(listaTnCapParticipante, TnCapParticipanteDTO.class);
        
        if(listaTnCapParticipanteDTO != null && !listaTnCapParticipanteDTO.isEmpty()){
            tnCapParticipanteDTO = listaTnCapParticipanteDTO.get(0);
        }
        return tnCapParticipanteDTO;
    }

}
