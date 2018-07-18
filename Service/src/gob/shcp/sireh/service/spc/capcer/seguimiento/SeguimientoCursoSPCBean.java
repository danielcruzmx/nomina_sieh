package gob.shcp.sireh.service.spc.capcer.seguimiento;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;

import gob.shcp.fsn.service.AbstractBean;
import gob.shcp.jcr.node.FsnResource;

import gob.shcp.sireh.model.spc.TnCapCursoDTO;
import gob.shcp.sireh.model.spc.TnCapEvaluaCursoDTO;
import gob.shcp.sireh.model.spc.TnCapParticipanteDTO;
import gob.shcp.sireh.model.spc.registro.CustomParticipantesInscritosDTO;
import gob.shcp.sireh.model.spc.seguimiento.CalificacionesDTO;
import gob.shcp.sireh.model.spc.seguimiento.CargarConstanciaDTO;
import gob.shcp.sireh.model.spc.seguimiento.EvaluarParticipanteDTO;
import gob.shcp.sireh.model.spc.seguimiento.TcCapSituacionParticipanteDTO;

import java.io.IOException;

import java.util.List;

import javax.ejb.Local;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;

@Stateless(name = "SeguimientoCursoSPC")
@Local( { SeguimientoCursoSPCService.class })
@TransactionManagement(TransactionManagementType.CONTAINER)
@TransactionAttribute(value = TransactionAttributeType.SUPPORTS)
public class SeguimientoCursoSPCBean extends AbstractBean implements SeguimientoCursoSPCService {

    public String saveFileCargarConstancia(FsnResource fsnResource, boolean rollback) {
        return super.getService(SeguimientoCursoSPCService.class).saveFileCargarConstancia(fsnResource, rollback);
    }

    /**
     * Obtener los datos del Curso con base en su id.
     * @author Martin C.
     * @param idCurso String
     * @return avaluarParticipanteDTO EvaluarParticipanteDTO
     */
    public EvaluarParticipanteDTO getEvaluarParticipante(Integer idCurso) throws IOException, JsonGenerationException, JsonMappingException {
        return super.getService(SeguimientoCursoSPCService.class).getEvaluarParticipante(idCurso);
    }

    /**
     * Actualiza las calificaciones del grupo
     * @author Martin C.
     * @param idCurso String
     * @param lCalificacionesDTO List
     */
    public void saveEvaluarParticipante(Integer idCurso, List<CalificacionesDTO> lCalificacionesDTO) {
        super.getService(SeguimientoCursoSPCService.class).saveEvaluarParticipante(idCurso, lCalificacionesDTO);
    }

    /**
     * Obtiene los estatus de evaluacion.
     * @author Martin C.
     * @return tcCapSituacionParticipanteDTO TcCapSituacionParticipanteDTO
     */
    public List<TcCapSituacionParticipanteDTO> getEstatusEvaluacionParticipante() {
        return super.getService(SeguimientoCursoSPCService.class).getEstatusEvaluacionParticipante();
    }

    /**
     * Datos del formulario cargarConstancia.
     * @author Martin C.
     * @param idCurso String
     * @return List
     */
    public CargarConstanciaDTO cargarConstancia(String idCurso) {
        return super.getService(SeguimientoCursoSPCService.class).cargarConstancia(idCurso);
    }

    /**
     * Guarda registro - Alta del documento.
     * @author Martin C.
     * @param tnCapParticipanteDTO TnCapParticipanteDTO
     */
    public void saveCargarConstancia(TnCapParticipanteDTO tnCapParticipanteDTO) {
        super.getService(SeguimientoCursoSPCService.class).saveCargarConstancia(tnCapParticipanteDTO);
    }

    /**
     * Elimina archivo.
     * @author Martin C.
     * @param documento String
     */
    public void deleteFileCargarConstancia(String documento) {
        super.getService(SeguimientoCursoSPCService.class).deleteFileCargarConstancia(documento);
    }

    /**
     * Elimina el documento.
     * @author Martin C.
     * @param tnCapParticipanteDTO TnCapParticipanteDTO
     */
    public void deleteCargarConstancia(TnCapParticipanteDTO tnCapParticipanteDTO, String tipoDocumento) {
        super.getService(SeguimientoCursoSPCService.class).deleteCargarConstancia(tnCapParticipanteDTO, tipoDocumento);
    }

    /**
     * Obtiene el curso por su id.
     * @author Martin C.
     * @param idCurso Integer
     * @return tnCapCursoDTO TnCapCursoDTO
     */
    public TnCapCursoDTO getById(Integer idCurso) {
        return super.getService(SeguimientoCursoSPCService.class).getById(idCurso);
    }
    
    /**
     * Metodo que obtiene el registro de la tabla TN_CAP_EVALUA_CURSO por el ID_CURSO
     * @author Gualberto G.
     * @param idCurso
     * @return TnCapEvaluacionCursoDTO
     */
    public TnCapEvaluaCursoDTO getEvaluacionCurso(Integer idCurso){
        return super.getService(SeguimientoCursoSPCService.class).getEvaluacionCurso(idCurso);
    }
    
    /**
     * Obtiene los participantes inscritos al curso
     * @author Gualberto G.
     * @param ciclo
     * @param idCurso
     * @return List&lt;CustomParticipantesInscritosDTO&gt;
     */
    public List<CustomParticipantesInscritosDTO> getParticipantesInscritosEvaluacionReacion(Integer ciclo, Integer idCurso){
        return super.getService(SeguimientoCursoSPCService.class).getParticipantesInscritosEvaluacionReacion(ciclo, idCurso);
    }
    
    /**
     * Metodo que guarda o actualiza un registro de la tabla TN_CAP_EVALUA_CURSO
     * @author Gualberto G.
     * @param tnCapEvaluacionCursoDTO
     */
    public void saveTnCapEvaluacionCurso(TnCapEvaluaCursoDTO tnCapEvaluacionCursoDTO){
        super.getService(SeguimientoCursoSPCService.class).saveTnCapEvaluacionCurso(tnCapEvaluacionCursoDTO);
    }
    
    /**
     * Ejecuta la validacion de la evaluacion de reaccion
     * @author Gualberto G.
     * @param idCurso
     */
    public void saveValidarEvaluacionCurso(Integer idCurso){
        super.getService(SeguimientoCursoSPCService.class).saveValidarEvaluacionCurso(idCurso);
    }
}
