package gob.shcp.sireh.data.jdbc.spc;

import gob.shcp.fsn.data.annotation.FindByCondition;
import gob.shcp.fsn.data.annotation.FindByNamedQuery;

import gob.shcp.sireh.domain.jdbc.spc.CustomRegistroCalendario;
import gob.shcp.sireh.domain.jdbc.spc.CustomTnCapCalendarioCurso;
import gob.shcp.sireh.domain.jdbc.spc.TnCapCalCurso;

import java.util.List;

public interface QueryTnCapCalCursoDAO extends TnCapCalCursoDAO{

    @FindByNamedQuery(name = "tnCapCurso-asignarCalendario", value = CustomRegistroCalendario.class)
    public List<CustomRegistroCalendario> getDatosCurso(Integer idCurso);
    
    @FindByNamedQuery(name = "tnCapCalendarioCurso-asignarCalendario", value = CustomTnCapCalendarioCurso.class)
    public List<CustomTnCapCalendarioCurso> getCalendarioCursoByAula(String idAula);

    @FindByNamedQuery(name = "tnCapCalendarioCursoByDiayHora-asignarCalendario", value = TnCapCalCurso.class)
    public List<TnCapCalCurso> getCalendarioCursoByDiasYHora(Integer idCurso, java.util.Date cursoFecIni, java.util.Date cursoFecFin, String idAula,
                                                                    Integer horarioInicialLunes1, Integer horarioInicialLunes2, Integer horarioFinalLunes1, Integer horarioFinalLunes2, 
                                                                    Integer horarioInicialMartes1, Integer horarioInicialMartes2, Integer horarioFinalMartes1, Integer horarioFinalMartes2, 
                                                                    Integer horarioInicialMiercoles1, Integer horarioInicialMiercoles2, Integer horarioFinalMiercoles1, Integer horarioFinalMiercoles2, 
                                                                    Integer horarioInicialJueves1, Integer horarioInicialJueves2, Integer horarioFinalJueves1, Integer horarioFinalJueves2, 
                                                                    Integer horarioInicialViernes1, Integer horarioInicialViernes2, Integer horarioFinalViernes1, Integer horarioFinalViernes2, 
                                                                    Integer horarioInicialSabado1, Integer horarioInicialSabado2, Integer horarioFinalSabado1, Integer horarioFinalSabado2, 
                                                                    Integer horarioInicialDomingo1, Integer horarioInicialDomingo2, Integer horarioFinalDomingo1, Integer horarioFinalDomingo2);

    @FindByCondition(value=TnCapCalCurso.class, condition="ID_CURSO=?")
    List<TnCapCalCurso> findByIdCurso(java.lang.Integer idCurso);

    
    @FindByNamedQuery(name = "tnCapCalendarioCursoDiasByIdCurso-asignarCalendario", value = CustomTnCapCalendarioCurso.class)
    List<CustomTnCapCalendarioCurso> findDiasByIdCurso(java.lang.Integer idCurso);
}
