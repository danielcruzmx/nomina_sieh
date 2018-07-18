package gob.shcp.sireh.data.jdbc.spc;

import gob.shcp.fsn.data.annotation.FindByNamedQuery;

import gob.shcp.sireh.domain.jdbc.spc.Calificaciones;
import gob.shcp.sireh.domain.jdbc.spc.EvaluarParticipante;
import gob.shcp.sireh.domain.jdbc.spc.TcCapCursoPrincp;
import gob.shcp.sireh.domain.jdbc.spc.TcCapSituacionParticipante;
import gob.shcp.sireh.domain.jdbc.spc.TnCapParticipante;

import java.util.List;

public interface QueryTnCapParticipanteDAO extends TnCapParticipanteDAO {
    
    @FindByNamedQuery(name="tnCapParticipante-SeguimientoYcontrol-EvaluarParticipante-Formulario", value = EvaluarParticipante.class)
    public List<EvaluarParticipante> getEvaluarParticipante(Integer idCurso);
    
    @FindByNamedQuery(name="tnCapCurso-EvaluarParticipante-calificaciones", value = Calificaciones.class)
    public List<Calificaciones> getCalificaciones(Integer idCurso);
    
    @FindByNamedQuery(name="tcCapCursoCustomParticipantesByIdCurso-asignarParticipante", value = TnCapParticipante.class)
    public List<TnCapParticipante> ParticipantesByIdCurso(String idCurso);
    
    @FindByNamedQuery(name="TnCapPartipante-SeguimientoControl-EvaluacionParticipante-listaEstatusEvaluacion", value = TcCapSituacionParticipante.class)
    public List<TcCapSituacionParticipante> getEstatusEvaluacionParticipante();

    @FindByNamedQuery(name = "TnCapParticpante-getRfcParticipanteByIdCurso", value = TnCapParticipante.class)
    public List<TnCapParticipante> getRfcParticipanteByIdCurso(String cursoClave, String rfcEmpleado);
    
}
