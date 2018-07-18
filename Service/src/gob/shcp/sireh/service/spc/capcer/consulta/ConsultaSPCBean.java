package gob.shcp.sireh.service.spc.capcer.consulta;

import gob.shcp.fsn.service.AbstractBean;

import gob.shcp.sireh.model.spc.consulta.CustomCalendarioDTO;
import gob.shcp.sireh.model.spc.consulta.CustomPACDTO;
import gob.shcp.sireh.model.spc.consulta.CustomPresupuestoDTO;
import gob.shcp.sireh.model.spc.consulta.LayoutRhnetDTO;

import gob.shcp.sireh.model.spc.consulta.SecuenciaEmpleadoDTO;

import gob.shcp.sireh.model.spc.consulta.SecuenciaInstructorDTO;

import java.util.List;

import javax.ejb.Local;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;

@Stateless(name = "ConsultaSPC")
@Local( { ConsultaSPCService.class })
@TransactionManagement(TransactionManagementType.CONTAINER)
@TransactionAttribute(value = TransactionAttributeType.SUPPORTS)
public class ConsultaSPCBean extends AbstractBean implements ConsultaSPCService {

    /**
     * Metodo que obtiene la consulta del PAC
     * @author Armando Zuñiga
     * @param ciclo Integer
     * @param fechaIni String
     * @param fechaFin String
     * @return List&lt;CustomPACDTO&gt;
     */
    public List<CustomPACDTO> getConsultaPAC(Integer ciclo, String fechaIni, String fechaFin) {
        return super.getService(ConsultaSPCService.class).getConsultaPAC(ciclo, fechaIni, fechaFin);
    }
    
    /**
     * Metodo que obtiene la consulta del Presupuesto
     * @author Cesar B.
     * @param ciclo Integer
     * @param fechaIni String
     * @param fechaFin String
     * @return List&lt;CustomPresupuestoDTO&gt;
     */
    public List<CustomPresupuestoDTO> getConsultaPresupuesto(Integer ciclo, String fechaIni, String fechaFin) {
        return super.getService(ConsultaSPCService.class).getConsultaPresupuesto(ciclo, fechaIni, fechaFin);
    }

    /**
     * Metodo que ejecuta la consulta de calendario
     * @author Josue Torres
     * @param ciclo
     * @param fechaIni
     * @param fechaFin
     * @return List&lt;CustomCalendarioDTO&gt;
     */
    public List<CustomCalendarioDTO> getConsultaCalendario(Integer ciclo, String fechaIni, String fechaFin) {
        return super.getService(ConsultaSPCService.class).getConsultaCalendario(ciclo, fechaIni, fechaFin);
    }

    /**
     * Metodo que general el archivo de RHNET
     * @author Josue Torres
     * @param ciclo
     * @param fechaIni
     * @param fechaFin
     * @return List&lt;LayoutRhnetDTO&gt;
     */
    public List<LayoutRhnetDTO> getLayoutRhnet(Integer ciclo, String fechaIni, String fechaFin) {
        return super.getService(ConsultaSPCService.class).getLayoutRhnet(ciclo, fechaIni, fechaFin);
    }

    /**
     * Metodo que general el reporte de RHNET
     * @author Ricardo Leon
     * @param ciclo Integer
     * @param trimestre Integer
     * @return List
     */
    public List<String> getReporteRhnet(Integer ciclo, Integer trimestre) {
        return super.getService(ConsultaSPCService.class).getReporteRhnet(ciclo, trimestre);
    }
    
    /**
     * secuenciaEmpleados: 
     * @author Martin C.
     * @return String
     * @param  rfcEmpleado String
     */
    public String getNombreEmpleado(String rfcEmpleado){
        return super.getService(ConsultaSPCService.class).getNombreEmpleado(rfcEmpleado);
    }

    /**
     * secuenciaEmpleados: 
     * @author Martin C.
     * @param idCurso String
     * @param rfcEmpleado rfcEmpleado
     * @return String
     */
    public SecuenciaEmpleadoDTO secuenciaEmpleadoCursoDetalle(Integer idCurso, String rfcEmpleado){
        return super.getService(ConsultaSPCService.class).secuenciaEmpleadoCursoDetalle(idCurso, rfcEmpleado);
    }
    
    /**
     * secuenciaEmpleados: 
     * @author Martin C.
     * @param idCurso String
     * @return SecuenciaEmpleadoDTO
     */
    public SecuenciaEmpleadoDTO getInstructoresByCurso(Integer idCurso){
        return super.getService(ConsultaSPCService.class).getInstructoresByCurso(idCurso);
    }
    
    /**
     * estadisticas por Instructor 
     * @author Martin C.
     * @param idCurso Integer
     * @param idInstructor Integer
     * @return SecuenciaInstructorDTO
     */
    public SecuenciaInstructorDTO detallesCursoByInstructor(Integer idCurso, Integer idInstructor){
        return super.getService(ConsultaSPCService.class).detallesCursoByInstructor(idCurso, idInstructor);
    }
    
    /**
     * secuenciaEmpleados: 
     * @author Martin C.
     * @param idCurso String
     * @return SecuenciaEmpleadoDTO
     */
    public SecuenciaInstructorDTO getInstructoresByCurso(Integer idCurso, Integer idInstructor){
        return super.getService(ConsultaSPCService.class).getInstructoresByCurso(idCurso, idInstructor);
    }
    
    /**
     * estadisticas por Instructor 
     * @author Martin C.
     * @param idCurso Integer
     * @return SecuenciaInstructorDTO
    */  
    public SecuenciaInstructorDTO getEstadisticasByInstructor(Integer idCurso){
        return super.getService(ConsultaSPCService.class).getEstadisticasByInstructor(idCurso);
    }
    
    /**
     * tipo de instructor 
     * @author Martin C.
     * @param idInstructor Long
     * @return List
    */  
    public SecuenciaInstructorDTO tipoInstructor(Long idInstructor){
        return super.getService(ConsultaSPCService.class).tipoInstructor(idInstructor);
    }
}
