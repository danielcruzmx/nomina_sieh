package gob.shcp.sireh.service.spc.capcer.seguimiento;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import gob.shcp.fsn.service.AbstractService;
import gob.shcp.jcr.node.FsnResource;
import gob.shcp.jcr.service.JcrService;

import gob.shcp.sireh.data.jdbc.spc.TnCapEvaluaCursoDAO;
import gob.shcp.sireh.data.jdbc.spc.CustomParticipantesInscritos;
import gob.shcp.sireh.data.jdbc.spc.QueryTnCapCursoDAO;
import gob.shcp.sireh.data.jdbc.spc.QueryTnCapParticipanteDAO;
import gob.shcp.sireh.data.jdbc.spc.TnCapCursoDAO;
import gob.shcp.sireh.data.jdbc.spc.TnCapParticipanteDAO;

import gob.shcp.sireh.domain.jdbc.spc.Calificaciones;
import gob.shcp.sireh.domain.jdbc.spc.CargarConstancia;
import gob.shcp.sireh.domain.jdbc.spc.EvaluarParticipante;
import gob.shcp.sireh.domain.jdbc.spc.TcCapSituacionParticipante;
import gob.shcp.sireh.domain.jdbc.spc.TnCapCurso;
import gob.shcp.sireh.domain.jdbc.spc.TnCapEvaluaCurso;
import gob.shcp.sireh.domain.jdbc.spc.TnCapParticipante;
import gob.shcp.sireh.domain.jdbc.spc.TnCapParticipantePK;

import gob.shcp.sireh.model.spc.TnCapCursoDTO;
import gob.shcp.sireh.model.spc.TnCapEvaluaCursoDTO;
import gob.shcp.sireh.model.spc.TnCapParticipanteDTO;
import gob.shcp.sireh.model.spc.registro.CustomParticipantesInscritosDTO;
import gob.shcp.sireh.model.spc.seguimiento.CalificacionesDTO;
import gob.shcp.sireh.model.spc.seguimiento.CargarConstanciaDTO;
import gob.shcp.sireh.model.spc.seguimiento.EvaluarParticipanteDTO;
import gob.shcp.sireh.model.spc.seguimiento.TcCapSituacionParticipanteDTO;

import java.io.IOException;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Business Service encargado de atender solicitudes del Módulo de Seguimiento
 */
public class SeguimientoCursoSPCBS extends AbstractService implements SeguimientoCursoSPCService {

    public String saveFileCargarConstancia(FsnResource fsnResource, boolean rollback) {
        String idfile = saveFileExp(fsnResource);
        if (rollback) {
            throw new RuntimeException("Rollback al archivo con id: " + idfile);
        }
        return idfile;
    }

    public String saveFileExp(FsnResource fsnResource) {
        JcrService service = super.getService(JcrService.class);
        return service.saveFile(fsnResource);
    }

    /**
     * Obtener los datos del participante en base al id del curso.
     * @author Martin C.
     * @param idCurso String
     * @return avaluarParticipanteDTO EvaluarParticipanteDTO
     */
    public EvaluarParticipanteDTO getEvaluarParticipante(Integer idCurso) throws IOException, JsonGenerationException, JsonMappingException {
        EvaluarParticipanteDTO evaluarParticipanteDTO = new EvaluarParticipanteDTO();
        ObjectMapper objectMapper = new ObjectMapper();
        int consecutivo = 1;

        List<EvaluarParticipante> lEvaluarParticipante = super.persistence().get(QueryTnCapParticipanteDAO.class).getEvaluarParticipante(idCurso);

        if (lEvaluarParticipante != null && lEvaluarParticipante.size() > 0) {
            EvaluarParticipante evaluarParticipante = lEvaluarParticipante.get(0);

            List<Calificaciones> lCalificaciones = 
                super.persistence().get(QueryTnCapParticipanteDAO.class).getCalificaciones(idCurso);

            // jsonMap Nivel 1
            HashMap<String, Object> jsonMapCalificaciones1 = new HashMap<String, Object>();
            // jsonMap Nivel 2
            List jsonMapCalificaciones2 = new ArrayList();
            HashMap<String, Object> idCellJsonMap;
            // jsonMap Nivel 3
            HashMap<String, Object> jsonCalificaciones;

            for (Calificaciones calificacion: lCalificaciones) {
                jsonCalificaciones = new HashMap<String, Object>();
                jsonCalificaciones.put("jerarquia", calificacion.getJerarquia() != null ? calificacion.getJerarquia() : "");
                jsonCalificaciones.put("rfc", calificacion.getRfc() != null ? calificacion.getRfc() : "");
                jsonCalificaciones.put("nombre", calificacion.getNombre() != null ? calificacion.getNombre() : "");
                jsonCalificaciones.put("primerApellido", calificacion.getPrimerApellido() != null ? calificacion.getPrimerApellido() : "");
                jsonCalificaciones.put("segundoApellido", calificacion.getSegundoApellido() != null ? calificacion.getSegundoApellido() : "");
                jsonCalificaciones.put("asistencia", calificacion.getAsistencia() != null ? calificacion.getAsistencia() : "");
                jsonCalificaciones.put("calificacionInicial", calificacion.getCalificacionInicial() != null ? calificacion.getCalificacionInicial() : "");
                jsonCalificaciones.put("calificacionFinal", calificacion.getCalificacionFinal() != null ? calificacion.getCalificacionFinal() : "");
                jsonCalificaciones.put("estatus", calificacion.getEstatus() != null ? calificacion.getEstatus() : "");

                // jsonMap Nivel 2
                idCellJsonMap = new HashMap<String, Object>();
                idCellJsonMap.put("id", String.valueOf(consecutivo));
                idCellJsonMap.put("cell", jsonCalificaciones);
                jsonMapCalificaciones2.add(idCellJsonMap);
                consecutivo++;
            }

            jsonMapCalificaciones1.put("page", 1);
            jsonMapCalificaciones1.put("total", 1);
            jsonMapCalificaciones1.put("records", consecutivo > 0 ? consecutivo - 1 : 0);
            jsonMapCalificaciones1.put("rows", (Object) jsonMapCalificaciones2);

            evaluarParticipante.setJsonDataString(objectMapper.writeValueAsString(jsonMapCalificaciones1));
            evaluarParticipanteDTO = super.transformation().map(evaluarParticipante, EvaluarParticipanteDTO.class);

        } else {
            evaluarParticipanteDTO = null;
        }
        return evaluarParticipanteDTO;
    }

    /**
     * Actualiza las calificaciones del grupo
     * @author Martin C.
     * @param idCurso Integer
     * @param lCalificacionesDTO List
     */
    public void saveEvaluarParticipante(Integer idCurso, List<CalificacionesDTO> lCalificacionesDTO) {
        List<Calificaciones> lCalificacionesBD = super.persistence().get(QueryTnCapParticipanteDAO.class).getCalificaciones(idCurso);
        List<Calificaciones> lCalificacionesGRID = super.transformation().map(lCalificacionesDTO, Calificaciones.class);
        Map<String, Object> hashMap = new HashMap<String, Object>();

        List<Calificaciones> editados = new ArrayList<Calificaciones>();
        List<Calificaciones> eliminados = new ArrayList<Calificaciones>();

        List<TcCapSituacionParticipante> lTcCapSituacionParticipante = super.persistence().get(QueryTnCapParticipanteDAO.class).getEstatusEvaluacionParticipante();
        
        for (TcCapSituacionParticipante tcCapSituacionParticipante: lTcCapSituacionParticipante) {
            hashMap.put(tcCapSituacionParticipante.getDescSituacionParticipante(), tcCapSituacionParticipante.getIdSituacionParticipante().toString());
        }

        for (Calificaciones calificacionesBD: lCalificacionesBD) {
            int contador = 1;
            boolean bandera = false;

            for (Calificaciones calificacionesGRID: lCalificacionesGRID) {
                if (calificacionesBD.getRfc().equalsIgnoreCase(calificacionesGRID.getRfc())) {
                    editados.add(calificacionesGRID);
                    bandera = true;
                }
                if ((!calificacionesBD.getRfc().equalsIgnoreCase(calificacionesGRID.getRfc())) && 
                    contador == lCalificacionesGRID.size() && bandera == false) {
                    eliminados.add(calificacionesBD);
                }
                contador += 1;
            }
        }

        for (Calificaciones editado: editados) {
            TnCapParticipante tnCapParticipante = super.persistence().get(TnCapParticipanteDAO.class).getById(new TnCapParticipantePK(new Integer(idCurso), editado.getRfc()));
            tnCapParticipante.setParticipanteAsistencia(new Integer(editado.getAsistencia()).intValue());
            tnCapParticipante.setParticipanteCalificacionIni(new Float(editado.getCalificacionInicial()).floatValue());
            tnCapParticipante.setParticipanteCalificacionFin(new Float(editado.getCalificacionFinal()).floatValue());
            tnCapParticipante.setIdSituacionParticipante(Integer.valueOf((String)hashMap.get(editado.getEstatus())));
            TnCapParticipantePK pk = new TnCapParticipantePK(new Integer(idCurso), editado.getRfc());
            tnCapParticipante.setIdentity(pk);
            super.persistence().get(TnCapParticipanteDAO.class).save(tnCapParticipante);
        }

        for (Calificaciones eliminado: eliminados) {
            TnCapParticipante tnCapParticipante = new TnCapParticipante();
            tnCapParticipante.setIdCurso(new Integer(idCurso));
            tnCapParticipante.setRfcEmpleado(eliminado.getRfc());
            super.persistence().get(TnCapParticipanteDAO.class).delete(tnCapParticipante);
        }
    }

    /**
     * Obtiene los estatus de evaluacion.
     * @author Martin C.
     * @return tcCapSituacionParticipanteDTO TcCapSituacionParticipanteDTO
     */
    public List<TcCapSituacionParticipanteDTO> getEstatusEvaluacionParticipante() {
        List<TcCapSituacionParticipanteDTO> retorno;
        List<TcCapSituacionParticipante> lTcCapSituacionParticipante = super.persistence().get(QueryTnCapParticipanteDAO.class).getEstatusEvaluacionParticipante();

        if (lTcCapSituacionParticipante != null) {
            if (lTcCapSituacionParticipante.size() > 0) {
                retorno = super.transformation().map(lTcCapSituacionParticipante, TcCapSituacionParticipanteDTO.class);
            } else {
                retorno = null;
            }
        } else {
            retorno = null;
        }
        return retorno;
    }

    /**
     * Datos del formulario cargarConstancia.
     * @author Martin C.
     * @param idCurso String
     * @return List
     */
    public CargarConstanciaDTO cargarConstancia(String idCurso) {
        List<CargarConstancia> lCargarConstanciaDTO = super.persistence().get(QueryTnCapCursoDAO.class).cargarConstancia(idCurso);

        if (lCargarConstanciaDTO != null && lCargarConstanciaDTO.size() > 0) {
            return super.transformation().map(lCargarConstanciaDTO.get(0), CargarConstanciaDTO.class);
        } else {
            return null;
        }
    }

    /**
     * Guarda registro - Alta del documento.
     * @author Martin C.
     * @param tnCapParticipanteDTO TnCapParticipanteDTO
     */
    public void saveCargarConstancia(TnCapParticipanteDTO tnCapParticipanteDTO) {
        TnCapParticipante tnCapParticipante = super.transformation().map(tnCapParticipanteDTO, TnCapParticipante.class);

        TnCapParticipantePK pk = new TnCapParticipantePK();
        pk.setIdCurso(tnCapParticipanteDTO.getIdCurso());
        pk.setRfcEmpleado(tnCapParticipanteDTO.getRfcEmpleado());

        TnCapParticipante tnCapParticipanteBd = super.persistence().get(TnCapParticipanteDAO.class).getById(pk);
        tnCapParticipanteBd.setIdentity(pk);
        tnCapParticipanteBd.setUsuario(tnCapParticipante.getUsuario());
        tnCapParticipanteBd.setFecModifico(tnCapParticipante.getFecModifico());

        if (tnCapParticipante.getParticipanteAcuse() == null) {
            tnCapParticipanteBd.setParticipanteAcuseFirmado(tnCapParticipante.getParticipanteAcuseFirmado());
        } else if (tnCapParticipante.getParticipanteAcuseFirmado() == null) {
            tnCapParticipanteBd.setParticipanteAcuse(tnCapParticipante.getParticipanteAcuse());
        }
        super.persistence().get(TnCapParticipanteDAO.class).save(tnCapParticipanteBd);
    }

    /**
     * Elimina archivo.
     * @author Martin C.
     * @param documento String
     */
    public void deleteFileCargarConstancia(String documento) {
        JcrService service = super.getService(JcrService.class);
        service.deleteFile(documento);
    }

    /**
     * Elimina el documento.
     * @author Martin C.
     * @param tnCapParticipanteDTO TnCapParticipanteDTO
     */
    public void deleteCargarConstancia(TnCapParticipanteDTO tnCapParticipanteDTO, String tipoDocumento) {
        TnCapParticipante tnCapParticipante = super.transformation().map(tnCapParticipanteDTO, TnCapParticipante.class);
        TnCapParticipante tnCapParticipanteBd = new TnCapParticipante();

        TnCapParticipantePK pk = new TnCapParticipantePK();
        pk.setIdCurso(tnCapParticipanteDTO.getIdCurso());
        pk.setRfcEmpleado(tnCapParticipanteDTO.getRfcEmpleado());

        tnCapParticipanteBd.setIdentity(pk);
        tnCapParticipanteBd = super.persistence().get(TnCapParticipanteDAO.class).getById(pk);

        tnCapParticipanteBd.setUsuario(tnCapParticipante.getUsuario());
        tnCapParticipanteBd.setFecModifico(tnCapParticipante.getFecModifico());

        if (tipoDocumento.equalsIgnoreCase("A")) {
            tnCapParticipanteBd.setParticipanteAcuse(null);
        } else if (tipoDocumento.equalsIgnoreCase("C")) {
            tnCapParticipanteBd.setParticipanteAcuseFirmado(null);
        }
        super.persistence().get(TnCapParticipanteDAO.class).save(tnCapParticipanteBd);
    }

    /**
     * Obtiene el curso por su id.
     * @author Martin C.
     * @param idCurso Integer
     * @return tnCapCursoDTO TnCapCursoDTO
     */
    public TnCapCursoDTO getById(Integer idCurso) {
        TnCapCurso TnCapCurso = super.persistence().get(TnCapCursoDAO.class).getById(idCurso);
        return super.transformation().map(TnCapCurso, TnCapCursoDTO.class);
    }
    
    /**
     * Metodo que obtiene el registro de la tabla TN_CAP_EVALUA_CURSO por el ID_CURSO
     * @author Gualberto G.
     * @param idCurso
     * @return TnCapEvaluaCursoDTO
     */
    public TnCapEvaluaCursoDTO getEvaluacionCurso(Integer idCurso){
        TnCapEvaluaCurso tnCapEvaluacionCurso = super.persistence().get(TnCapEvaluaCursoDAO.class).getById(idCurso);
        TnCapEvaluaCursoDTO tnCapEvaluaCursoDTO = super.transformation().map(tnCapEvaluacionCurso, TnCapEvaluaCursoDTO.class);
        return tnCapEvaluaCursoDTO;
    }
    
    /**
     * Obtiene los participantes inscritos al curso
     * @author Gualberto G.
     * @param ciclo
     * @param idCurso
     * @return List&lt;CustomParticipantesInscritosDTO&gt;
     */
    public List<CustomParticipantesInscritosDTO> getParticipantesInscritosEvaluacionReacion(Integer ciclo, Integer idCurso){
        List<CustomParticipantesInscritos> lista = super.persistence().get(QueryTnCapCursoDAO.class).getParticipantesInscritosEvaluacionReacion( ciclo, idCurso);
        List<CustomParticipantesInscritosDTO> listaCustomParticipantesInscritosDTO = super.transformation().map(lista, CustomParticipantesInscritosDTO.class);
        return listaCustomParticipantesInscritosDTO;
    }
    
    /**
     * Guarda la evaluacion de reaccion para un curso
     * @author Gualberto G.
     * @param tnCapEvaluaCursoDTO
     */
    public void saveTnCapEvaluacionCurso(TnCapEvaluaCursoDTO tnCapEvaluaCursoDTO){
        TnCapEvaluaCurso tnCapEvaluacionCurso = super.transformation().map(tnCapEvaluaCursoDTO, TnCapEvaluaCurso.class);
        super.persistence().get(TnCapEvaluaCursoDAO.class).save(tnCapEvaluacionCurso);
    }

    /**
     * Ejecuta la validacion de la evaluacion de reaccion
     * @author Gualberto G.
     * @param idCurso
     */
    public void saveValidarEvaluacionCurso(Integer idCurso) {
        TnCapCurso tnCapCurso = super.persistence().get(TnCapCursoDAO.class).getById(idCurso);

        if (tnCapCurso != null) {
            tnCapCurso.setIdControlCurso("EVR");
            super.persistence().get(TnCapCursoDAO.class).save(tnCapCurso);
        }

    }
}
