package gob.shcp.sireh.service.spc.capcer.consulta;

import gob.shcp.fsn.service.BusinessService;

import gob.shcp.sireh.domain.jdbc.spc.SecuenciaInstructor;
import gob.shcp.sireh.model.spc.consulta.CustomCalendarioDTO;
import gob.shcp.sireh.model.spc.consulta.CustomPACDTO;
import gob.shcp.sireh.model.spc.consulta.CustomPresupuestoDTO;
import gob.shcp.sireh.model.spc.consulta.LayoutRhnetDTO;

import gob.shcp.sireh.model.spc.consulta.SecuenciaEmpleadoDTO;

import gob.shcp.sireh.model.spc.consulta.SecuenciaInstructorDTO;

import java.util.List;

import javax.ejb.Local;

@Local
public interface ConsultaSPCService extends BusinessService {

    /**
     * Metodo que obtiene la consulta del PAC
     * @author Armando Zuñiga
     * @param ciclo Integer
     * @param fechaIni String
     * @param fechaFin String
     * @return List&lt;CustomPACDTO&gt;
     */
    public List<CustomPACDTO> getConsultaPAC(Integer ciclo, String fechaIni, String fechaFin);

    /**
     * Metodo que obtiene la consulta del Presupuesto
     * @author Cesar B.
     * @param ciclo Integer
     * @param fechaIni String
     * @param fechaFin String
     * @return List&lt;CustomPresupuestoDTO&gt;
     */
    public List<CustomPresupuestoDTO> getConsultaPresupuesto(Integer ciclo, String fechaIni, String fechaFin);

    /**
     * Metodo que ejecuta la consulta de calendario
     * @author Josue Torres
     * @param ciclo
     * @param fechaIni
     * @param fechaFin
     * @return List&lt;CustomCalendarioDTO&gt;
     */
    public List<CustomCalendarioDTO> getConsultaCalendario(Integer ciclo, String fechaIni, String fechaFin);

    /**
     * Metodo que genera el layout de RHNET
     * @author Josue Torres
     * @param ciclo
     * @param fechaIni
     * @param fechaFin
     * @return List&lt;LayoutRhnetDTO&gt;
     */
    public List<LayoutRhnetDTO> getLayoutRhnet(Integer ciclo, String fechaIni, String fechaFin);

    /**
     * Metodo que genera el reporte de RHNET
     * @author 
     * @param ciclo
     * @param trimestre
     * @return List
     */
    public List<String> getReporteRhnet(Integer ciclo, Integer trimestre);

    /**
     * secuenciaEmpleados: 
     * @author Martin C.
     * @param rfcEmpleado String
     * @return String
     */
    public String getNombreEmpleado(String rfcEmpleado);
    
    /**
     * secuenciaEmpleados: 
     * @author Martin C.
     * @param idCurso String
     * @param rfcEmpleado String
     * @return SecuenciaEmpleadoDTO
     */
    public SecuenciaEmpleadoDTO secuenciaEmpleadoCursoDetalle(Integer idCurso, String rfcEmpleado);

    /**
     * secuenciaEmpleados: 
     * @author Martin C.
     * @param idCurso String
     * @return SecuenciaEmpleadoDTO
     */
    public SecuenciaEmpleadoDTO getInstructoresByCurso(Integer idCurso);
    
     /**
      * estadisticas por Instructor 
      * @author Martin C.
      * @param idCurso Integer
      * @param idInstructor Integer
      * @return SecuenciaInstructorDTO
    */
    public SecuenciaInstructorDTO detallesCursoByInstructor(Integer idCurso, Integer idInstructor);
    
    /**
     * secuenciaEmpleados: 
     * @author Martin C.
     * @param idCurso String
     * @return SecuenciaEmpleadoDTO
     */
    public SecuenciaInstructorDTO getInstructoresByCurso(Integer idCurso, Integer idInstructor);
    
    /**
     * estadisticas por Instructor 
     * @author Martin C.
     * @param idCurso Integer
     * @return SecuenciaInstructorDTO
    */  
    public SecuenciaInstructorDTO getEstadisticasByInstructor(Integer idCurso);
    
    /**
     * tipo de instructor 
     * @author Martin C.
     * @param idInstructor Long
     * @return List
    */  
    public SecuenciaInstructorDTO tipoInstructor(Long idInstructor);
}
