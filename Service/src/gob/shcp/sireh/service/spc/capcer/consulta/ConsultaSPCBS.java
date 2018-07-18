package gob.shcp.sireh.service.spc.capcer.consulta;

import gob.shcp.fsn.service.AbstractService;

import gob.shcp.sireh.data.jdbc.spc.CustomPAC;
import gob.shcp.sireh.data.jdbc.spc.CustomParticipantesInscritos;
import gob.shcp.sireh.data.jdbc.spc.CustomPresupuestoDAO;
import gob.shcp.sireh.data.jdbc.spc.QueryTnCapCursoDAO;

import gob.shcp.sireh.domain.jdbc.CustomOutputFile;
import gob.shcp.sireh.domain.jdbc.spc.CustomCalendario;
import gob.shcp.sireh.domain.jdbc.spc.LayoutRhnet;

import gob.shcp.sireh.domain.jdbc.spc.SecuenciaEmpleado;
import gob.shcp.sireh.domain.jdbc.spc.SecuenciaInstructor;
import gob.shcp.sireh.model.spc.consulta.CustomCalendarioDTO;
import gob.shcp.sireh.model.spc.consulta.CustomPACDTO;
import gob.shcp.sireh.model.spc.consulta.CustomPresupuestoDTO;
import gob.shcp.sireh.model.spc.consulta.LayoutRhnetDTO;

import gob.shcp.sireh.model.spc.consulta.SecuenciaEmpleadoDTO;

import gob.shcp.sireh.model.spc.consulta.SecuenciaInstructorDTO;

import java.text.DecimalFormat;
import java.text.NumberFormat;

import java.util.ArrayList;
import java.util.List;

public class ConsultaSPCBS extends AbstractService implements ConsultaSPCService {

    /**
     * Metodo que obtiene la consulta del PAC
     * @author Armando Zuñiga
     * @param ciclo Integer
     * @param fechaIni String
     * @param fechaFin String
     * @return List&lt;CustomPACDTO&gt;
     */
    public List<CustomPACDTO> getConsultaPAC(Integer ciclo, String fechaIni, String fechaFin) {
        List<CustomPAC> customPACList = super.persistence().get(QueryTnCapCursoDAO.class).getConsultaPAC(ciclo, fechaIni, fechaFin);
        logger.debug("ConsultaSPCBS -> getConsultaPac -> customPACList.size() -> " + customPACList.size());
        return super.transformation().map(customPACList, CustomPACDTO.class);
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
        List<CustomPresupuestoDAO> customPresupuestoList = super.persistence().get(QueryTnCapCursoDAO.class).getConsultaPresupuesto(ciclo, fechaIni, fechaFin);
        logger.debug("ConsultaSPCBS -> getConsultaPresupuesto -> customPresupuestoList.size() -> " + customPresupuestoList.size());
        return super.transformation().map(customPresupuestoList, CustomPresupuestoDTO.class);
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
        List<CustomCalendario> customCalendarioList = super.persistence().get(QueryTnCapCursoDAO.class).getConsultaCalendario(ciclo, fechaIni, fechaFin);
        logger.debug("ConsultaSPCBS -> getConsultaCalendario -> customCalendarioList.size() -> " + customCalendarioList.size());
        return super.transformation().map(customCalendarioList, CustomCalendarioDTO.class);
    }

    /**
     * Metodo que genera Layout de RHNET
     * @author Josue Torres
     * @param ciclo
     * @param fechaIni
     * @param fechaFin
     * @return List&lt;LayoutRhnetDTO&gt;
     */
    public List<LayoutRhnetDTO> getLayoutRhnet(Integer ciclo, String fechaIni, String fechaFin) {
        List<LayoutRhnet> layoutRhnetList = super.persistence().get(QueryTnCapCursoDAO.class).getLayoutRhnet(ciclo, fechaIni, fechaFin);
        logger.debug("ConsultaSPCBS --> getLayoutRhnet --> layoutRhnetList.size() --> " + layoutRhnetList.size());
        return super.transformation().map(layoutRhnetList, LayoutRhnetDTO.class);
    }

    /**
     * Metodo que genera Layout de RHNET
     * @author
     * @param ciclo
     * @param trimestre
     * @return listaString List<String>;
     */
    public List<String> getReporteRhnet(Integer ciclo, Integer trimestre) {
        List<String> listaString = new ArrayList<String>();
        List<CustomOutputFile> items = new ArrayList<CustomOutputFile>();
        List<CustomOutputFile> itemsHeader = new ArrayList<CustomOutputFile>();
        
        items = super.persistence().get(QueryTnCapCursoDAO.class).getReporteRhnet(ciclo, trimestre);
        
        if (items != null) {
            for (CustomOutputFile row: items) {
               listaString.add(row.getRegistro());
            }
        }
        return listaString;
    }
    
    /**
     * secuenciaEmpleados: 
     * @author Martin C.
     * @param  rfcEmpleado String
     * @return String
     */
    public String getNombreEmpleado(String rfcEmpleado){
        CustomParticipantesInscritos nombre = super.persistence().get(QueryTnCapCursoDAO.class).getNombreEmpleado(rfcEmpleado).get(0);
        return nombre.getNombreEmpleado();
    }

    /**
     * secuenciaEmpleados: 
     * @author Martin C.
     * @param idCurso String
     * @return SecuenciaEmpleadoDTO
     */
    public SecuenciaEmpleadoDTO secuenciaEmpleadoCursoDetalle(Integer idCurso, String rfcEmpleado){
        List<SecuenciaEmpleado> secuenciaEmpleado = super.persistence().get(QueryTnCapCursoDAO.class).secuenciaEmpleadoCursoDetalle(idCurso, rfcEmpleado);
        if(secuenciaEmpleado.size() > 0){
           SecuenciaEmpleadoDTO secuenciaEmpleadoDTO = super.transformation().map(secuenciaEmpleado.get(0), SecuenciaEmpleadoDTO.class); 
           return secuenciaEmpleadoDTO;
        } else return new SecuenciaEmpleadoDTO();
    }
    
    /**
     * secuenciaEmpleados: 
     * @author Martin C.
     * @param idCurso String
     * @return SecuenciaEmpleadoDTO
     */
    public SecuenciaEmpleadoDTO getInstructoresByCurso(Integer idCurso){       
        SecuenciaEmpleado    instructores    = new SecuenciaEmpleado();
        
        List<SecuenciaEmpleado> listaInstructores = super.persistence().get(QueryTnCapCursoDAO.class).getInstructoresByCurso(idCurso);
        
        if(listaInstructores.size() > 0){
            if(listaInstructores.get(0).getNombreInstrTitular().equalsIgnoreCase(" ")){
                List<SecuenciaEmpleado> listaInstrBitacora = super.persistence().get(QueryTnCapCursoDAO.class).getInstrByCursoBitacora(idCurso);
                if(listaInstrBitacora.size() > 0){
                    if(!listaInstrBitacora.get(0).getNombreInstrTitular().equalsIgnoreCase(" ")){
                        instructores.setNombreInstrTitular(listaInstrBitacora.get(0).getNombreInstrTitular());
                        instructores.setNombreInstrSuplente(listaInstructores.get(0).getNombreInstrSuplente());
                        instructores.setCausalDesasignacionTit(listaInstrBitacora.get(0).getCausalDesasignacion());
                    } else {  instructores.setNombreInstrTitular("");  }
                } else {  instructores.setNombreInstrTitular("");  }
            } else {  instructores.setNombreInstrTitular(listaInstructores.get(0).getNombreInstrTitular());  }
            if(listaInstructores.get(0).getNombreInstrSuplente().equalsIgnoreCase(" ")){
                List<SecuenciaEmpleado> listaInstrBitacora = super.persistence().get(QueryTnCapCursoDAO.class).getInstrByCursoBitacora(idCurso);
                if(listaInstrBitacora.size() > 0){
                    if(!listaInstrBitacora.get(0).getNombreInstrSuplente().equalsIgnoreCase(" ")){
                        instructores.setNombreInstrSuplente(listaInstrBitacora.get(0).getNombreInstrSuplente());
                        instructores.setNombreInstrTitular(listaInstructores.get(0).getNombreInstrTitular());
                        instructores.setCausalDesasignacionSup(listaInstrBitacora.get(0).getCausalDesasignacion());
                    } else {  instructores.setNombreInstrSuplente("");  }
                } else {  instructores.setNombreInstrSuplente("");  }
            } else {  instructores.setNombreInstrSuplente(listaInstructores.get(0).getNombreInstrSuplente());  }
            if(!listaInstructores.get(0).getNombreInstrTitular().equalsIgnoreCase(" ") & !listaInstructores.get(0).getNombreInstrSuplente().equalsIgnoreCase(" ")){
                instructores.setNombreInstrTitular(listaInstructores.get(0).getNombreInstrTitular());
                instructores.setNombreInstrSuplente(listaInstructores.get(0).getNombreInstrSuplente());
            }
        }
        return super.transformation().map(instructores, SecuenciaEmpleadoDTO.class);
    }
    
     /**
      * estadisticas por Instructor 
      * @author Martin C.
      * @param idCurso Integer
      * @param idInstructor Integer
      * @return SecuenciaInstructorDTO
     */
    public SecuenciaInstructorDTO detallesCursoByInstructor(Integer idCurso, Integer idInstructor){
        List<SecuenciaInstructor> secuenciaInstructor = super.persistence().get(QueryTnCapCursoDAO.class).detallesCursoByInstructor(idCurso);
        if(secuenciaInstructor.size() > 0){
           SecuenciaInstructorDTO SecuenciaInstructor = super.transformation().map(secuenciaInstructor.get(0), SecuenciaInstructorDTO.class); 
           return SecuenciaInstructor;
        } else return new SecuenciaInstructorDTO();
    }
    
    /**
     * estadisticas por Instructor 
     * @author Martin C.
     * @param idCurso Integer
     * @param idInstructor Integer
     * @return SecuenciaInstructorDTO
    */  
    public SecuenciaInstructorDTO getInstructoresByCurso(Integer idCurso, Integer idInstructor){
        SecuenciaInstructor instructores = new SecuenciaInstructor();
        List<String> instructs = new ArrayList<String>();
        List<SecuenciaInstructor> listaInstructores = super.persistence().get(QueryTnCapCursoDAO.class).getInstructoresByCursoInstr(idCurso);
        
        if(listaInstructores.size() > 0){
            if(listaInstructores.get(0).getNombreInstrTitular().equalsIgnoreCase(" ")){
                List<SecuenciaInstructor> listaInstrBitacora = super.persistence().get(QueryTnCapCursoDAO.class).getInstrByCursoBitacoraInstr(idCurso);
                if(listaInstrBitacora.size() > 0){
                    if(!listaInstrBitacora.get(0).getNombreInstrTitular().equalsIgnoreCase(" ")){
                        instructores.setNombreInstrTitular(listaInstrBitacora.get(0).getNombreInstrTitular());
                        instructores.setNombreInstrSuplente(listaInstructores.get(0).getNombreInstrSuplente());
                        instructores.setCausalDesasigTitular(listaInstrBitacora.get(0).getCausalDesasignacion());
                    } else {  instructores.setNombreInstrTitular("");  }
                } else {  instructores.setNombreInstrTitular("");  }
            } else {  instructores.setNombreInstrTitular(listaInstructores.get(0).getNombreInstrTitular());  }
            if(listaInstructores.get(0).getNombreInstrSuplente().equalsIgnoreCase(" ")){
                List<SecuenciaInstructor> listaInstrBitacora = super.persistence().get(QueryTnCapCursoDAO.class).getInstrByCursoBitacoraInstr(idCurso);
                if(listaInstrBitacora.size() > 0){
                    if(!listaInstrBitacora.get(0).getNombreInstrSuplente().equalsIgnoreCase(" ")){
                        instructores.setNombreInstrSuplente(listaInstrBitacora.get(0).getNombreInstrSuplente());
                        instructores.setNombreInstrTitular(listaInstructores.get(0).getNombreInstrTitular());
                        instructores.setCausalDesasigSuplente(listaInstrBitacora.get(0).getCausalDesasignacion());
                    } else {  instructores.setNombreInstrSuplente("");  }
                } else {  instructores.setNombreInstrSuplente("");  }
            } else {  instructores.setNombreInstrSuplente(listaInstructores.get(0).getNombreInstrSuplente());  }
            if(!listaInstructores.get(0).getNombreInstrTitular().equalsIgnoreCase(" ") & !listaInstructores.get(0).getNombreInstrSuplente().equalsIgnoreCase(" ")){
                instructores.setNombreInstrTitular(listaInstructores.get(0).getNombreInstrTitular());
                instructores.setNombreInstrSuplente(listaInstructores.get(0).getNombreInstrSuplente());
            }
        }
        
        return super.transformation().map(instructores, SecuenciaInstructorDTO.class);
    }
    
    /**
     * estadisticas por Instructor 
     * @author Martin C.
     * @param idCurso Integer
     * @return SecuenciaInstructorDTO
    */  
    public SecuenciaInstructorDTO getEstadisticasByInstructor(Integer idCurso){
        SecuenciaInstructor secuenciaInstructor = new SecuenciaInstructor();
        Double asistencia = 0.0;
        Double evalInicial = 0.0;
        Double evalFinal = 0.0;
        Double evalEstatus = 0.0;
        
        NumberFormat f = new DecimalFormat("#0.00");
        
        List<SecuenciaInstructor> estadisticas = super.persistence().get(QueryTnCapCursoDAO.class).getEstadisticasByInstructor(idCurso);
        
        if(estadisticas.size() > 0){
            Double tamanio = new Double(estadisticas.size());
            for(SecuenciaInstructor estadistica : estadisticas){
                if(new Integer(estadistica.getParticipanteAsistencia()) > 80){  asistencia += 1;  }
                if(new Integer(estadistica.getParticipanteEvalInicial() ) > 70){  evalInicial += 1;  }
                if(new Integer(estadistica.getParticipanteEvalFinal()) > 80){  evalFinal += 1;  }
                if(new Integer(estadistica.getDescSituacionParticipante() ) == 1){  evalEstatus += 1;  }
            }
            
            Double auxAsistencia  = (asistencia/tamanio)*100;
            Double auxEvalInicial = (evalInicial/tamanio)*100;
            Double auxEvalFinal   = (evalFinal/tamanio)*100;
            Double aucEvalEstatus = (evalEstatus/tamanio)*100;
            
            secuenciaInstructor.setParticipanteAsistencia( f.format(auxAsistencia)  );
            secuenciaInstructor.setParticipanteEvalInicial( f.format(auxEvalInicial) );
            secuenciaInstructor.setParticipanteEvalFinal( f.format(auxEvalFinal) );
            secuenciaInstructor.setDescSituacionParticipante( f.format(aucEvalEstatus) );
            
        } else {  return new SecuenciaInstructorDTO();  }
        
        return super.transformation().map(secuenciaInstructor, SecuenciaInstructorDTO.class);
    }
    
    /**
     * tipo de instructor 
     * @author Martin C.
     * @param idInstructor Long
     * @return String
    */  
    public SecuenciaInstructorDTO tipoInstructor(Long idInstructor){
        List<SecuenciaInstructor> tipoInstructor = super.persistence().get(QueryTnCapCursoDAO.class).getTipoInstructor(idInstructor, idInstructor, idInstructor, idInstructor);
        if(tipoInstructor.size() > 0){
            return super.transformation().map(tipoInstructor.get(0), SecuenciaInstructorDTO.class);  }
        else return new SecuenciaInstructorDTO();
    }
}
