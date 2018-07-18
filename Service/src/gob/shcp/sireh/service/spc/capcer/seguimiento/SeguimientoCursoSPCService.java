package gob.shcp.sireh.service.spc.capcer.seguimiento;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;

import gob.shcp.fsn.service.BusinessService;
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

@Local
public interface SeguimientoCursoSPCService extends BusinessService {

    public String saveFileCargarConstancia(FsnResource fsnResource, boolean rollback);

    /**
     * Obtener los datos del Curso con base en su id.
     * @author Martin C.
     * @param idCurso String
     * @return avaluarParticipanteDTO EvaluarParticipanteDTO
     */
    public EvaluarParticipanteDTO getEvaluarParticipante(Integer idCurso) throws IOException, JsonGenerationException, JsonMappingException;

    /**
     * Actualiza las calificaciones del grupo
     * @author Martin C.
     * @param idCurso String
     * @param lCalificacionesDTO List
     */
    public void saveEvaluarParticipante(Integer idCurso, List<CalificacionesDTO> lCalificacionesDTO);

    /**
     * Obtiene los estatus de evaluacion del participante.
     * @author Martin C.
     * @return List
     */
    public List<TcCapSituacionParticipanteDTO> getEstatusEvaluacionParticipante();

    /**
     * Datos del formulario cargarConstancia.
     * @author Martin C.
     * @param idCurso String
     * @return List
     */
    public CargarConstanciaDTO cargarConstancia(String idCurso);

    /**
     * Guarda registro - Alta del documento.
     * @author Martin C.
     * @param tnCapParticipanteDTO TnCapParticipanteDTO
     */
    public void saveCargarConstancia(TnCapParticipanteDTO tnCapParticipanteDTO);

    /**
     * Elimina archivo.
     * @author Martin C.
     * @param documento String
     */
    public void deleteFileCargarConstancia(String documento);

    /**
     * Elimina el documento.
     * @author Martin C.
     * @param tnCapParticipanteDTO TnCapParticipanteDTO
     */
    public void deleteCargarConstancia(TnCapParticipanteDTO tnCapParticipanteDTO, String tipoDocumento);

    /**
     * Obtiene el curso por su id.
     * @author Martin C.
     * @param idCurso Integer
     * @return tnCapCursoDTO TnCapCursoDTO
     */
    public TnCapCursoDTO getById(Integer idCurso);

    /**
     * Metodo que obtiene el registro de la tabla TN_CAP_EVALUA_CURSO por el ID_CURSO
     * @author Gualberto G.
     * @param idCurso
     * @return TnCapEvaluacionCursoDTO
     */
    public TnCapEvaluaCursoDTO getEvaluacionCurso(Integer idCurso);

    public List<CustomParticipantesInscritosDTO> getParticipantesInscritosEvaluacionReacion(Integer ciclo, Integer idCurso);

    /**
     * Metodo que guarda o actualiza un registro de la tabla TN_CAP_EVALUA_CURSO
     * @author Gualberto G.
     * @param tnCapEvaluacionCursoDTO
     */
    public void saveTnCapEvaluacionCurso(TnCapEvaluaCursoDTO tnCapEvaluacionCursoDTO);

    /**
     * Ejecuta la validacion de la evaluacion de reaccion
     * @author Gualberto G.
     * @param idCurso 
     */
    public void saveValidarEvaluacionCurso(Integer idCurso);

}
