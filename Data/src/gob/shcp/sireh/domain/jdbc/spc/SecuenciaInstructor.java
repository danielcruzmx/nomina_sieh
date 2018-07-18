package gob.shcp.sireh.domain.jdbc.spc;

import gob.shcp.fsn.data.Domain;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

public class SecuenciaInstructor implements Domain, Serializable {
    // Filtros
    private String  nombreInstructor;
    private Long    idInstructor;
    private String  nombreInstrTitular;
    private String  nombreInstrSuplente;
    private Long    idInstrTitular;
    private Long    idInstrSuplente;
    private String  nombreProveedor;
    private String  idProveedor;
    private String  causalDesasignacion;
    private String  causalDesasigTitular;
    private String  causalDesasigSuplente;
    
    // Formulario
    private String  idCurso;
    private String  participanteRfc;
    private String  descCoordinacion;
    private String  descCursoPrincipal;
    private String  descEjeTematico;
    private String  descNivelCurso;
    private String  descModalidad;
    private String  descFinalidad;
    private String  descCaracter;
    private String  cursoFecIni;
    private String  cursoFecFin;
    private String  descSubPrograma;
    private Long    cursoDuracion;
    private String  descAulaCurso;
    private String  horarioCurso;
    private Long    cursoParticipantes;
    private String  descControlCurso;
    private String  descTipoCurso;
    private String  ClaveCurso;
    private String  descSedeCurso;
    private String  participanteAsistencia;
    private String  participanteEvalInicial;
    private String  participanteEvalFinal;
    private String  descSituacionParticipante;
    private List<String> instr = new ArrayList<String>();
    
    // Configuracion inicial
    private String beanName;
    
    // Navegacion
    private String urlOrigen;
    private String urlDestino;
    private Long anterior;
    
    // Control
    private boolean cancel;
    private boolean muestraRegistros;

    public void setNombreInstructor(String nombreInstructor) {
        this.nombreInstructor = nombreInstructor;
    }

    public String getNombreInstructor() {
        return nombreInstructor;
    }

    public void setIdInstructor(Long idInstructor) {
        this.idInstructor = idInstructor;
    }

    public Long getIdInstructor() {
        return idInstructor;
    }

    public void setNombreInstrTitular(String nombreInstrTitular) {
        this.nombreInstrTitular = nombreInstrTitular;
    }

    public String getNombreInstrTitular() {
        return nombreInstrTitular;
    }

    public void setNombreInstrSuplente(String nombreInstrSuplente) {
        this.nombreInstrSuplente = nombreInstrSuplente;
    }

    public String getNombreInstrSuplente() {
        return nombreInstrSuplente;
    }

    public void setIdInstrTitular(Long idInstrTitular) {
        this.idInstrTitular = idInstrTitular;
    }

    public Long getIdInstrTitular() {
        return idInstrTitular;
    }

    public void setIdInstrSuplente(Long idInstrSuplente) {
        this.idInstrSuplente = idInstrSuplente;
    }

    public Long getIdInstrSuplente() {
        return idInstrSuplente;
    }

    public void setNombreProveedor(String nombreProveedor) {
        this.nombreProveedor = nombreProveedor;
    }

    public String getNombreProveedor() {
        return nombreProveedor;
    }

    public void setIdProveedor(String idProveedor) {
        this.idProveedor = idProveedor;
    }

    public String getIdProveedor() {
        return idProveedor;
    }

    public void setCausalDesasigTitular(String causalDesasigTitular) {
        this.causalDesasigTitular = causalDesasigTitular;
    }

    public String getCausalDesasigTitular() {
        return causalDesasigTitular;
    }

    public void setCausalDesasigSuplente(String causalDesasigSuplente) {
        this.causalDesasigSuplente = causalDesasigSuplente;
    }

    public String getCausalDesasigSuplente() {
        return causalDesasigSuplente;
    }

    public void setIdCurso(String idCurso) {
        this.idCurso = idCurso;
    }

    public String getIdCurso() {
        return idCurso;
    }

    public void setParticipanteRfc(String participanteRfc) {
        this.participanteRfc = participanteRfc;
    }

    public String getParticipanteRfc() {
        return participanteRfc;
    }

    public void setDescCoordinacion(String descCoordinacion) {
        this.descCoordinacion = descCoordinacion;
    }

    public String getDescCoordinacion() {
        return descCoordinacion;
    }

    public void setDescCursoPrincipal(String descCursoPrincipal) {
        this.descCursoPrincipal = descCursoPrincipal;
    }

    public String getDescCursoPrincipal() {
        return descCursoPrincipal;
    }

    public void setDescEjeTematico(String descEjeTematico) {
        this.descEjeTematico = descEjeTematico;
    }

    public String getDescEjeTematico() {
        return descEjeTematico;
    }

    public void setDescNivelCurso(String descNivelCurso) {
        this.descNivelCurso = descNivelCurso;
    }

    public String getDescNivelCurso() {
        return descNivelCurso;
    }

    public void setDescModalidad(String descModalidad) {
        this.descModalidad = descModalidad;
    }

    public String getDescModalidad() {
        return descModalidad;
    }

    public void setDescFinalidad(String descFinalidad) {
        this.descFinalidad = descFinalidad;
    }

    public String getDescFinalidad() {
        return descFinalidad;
    }

    public void setDescCaracter(String descCaracter) {
        this.descCaracter = descCaracter;
    }

    public String getDescCaracter() {
        return descCaracter;
    }

    public void setCursoFecIni(String cursoFecIni) {
        this.cursoFecIni = cursoFecIni;
    }

    public String getCursoFecIni() {
        return cursoFecIni;
    }

    public void setCursoFecFin(String cursoFecFin) {
        this.cursoFecFin = cursoFecFin;
    }

    public String getCursoFecFin() {
        return cursoFecFin;
    }

    public void setDescSubPrograma(String descSubPrograma) {
        this.descSubPrograma = descSubPrograma;
    }

    public String getDescSubPrograma() {
        return descSubPrograma;
    }

    public void setCursoDuracion(Long cursoDuracion) {
        this.cursoDuracion = cursoDuracion;
    }

    public Long getCursoDuracion() {
        return cursoDuracion;
    }

    public void setDescAulaCurso(String descAulaCurso) {
        this.descAulaCurso = descAulaCurso;
    }

    public String getDescAulaCurso() {
        return descAulaCurso;
    }

    public void setHorarioCurso(String horarioCurso) {
        this.horarioCurso = horarioCurso;
    }

    public String getHorarioCurso() {
        return horarioCurso;
    }

    public void setCursoParticipantes(Long cursoParticipantes) {
        this.cursoParticipantes = cursoParticipantes;
    }

    public Long getCursoParticipantes() {
        return cursoParticipantes;
    }

    public void setDescControlCurso(String descControlCurso) {
        this.descControlCurso = descControlCurso;
    }

    public String getDescControlCurso() {
        return descControlCurso;
    }

    public void setDescTipoCurso(String descTipoCurso) {
        this.descTipoCurso = descTipoCurso;
    }

    public String getDescTipoCurso() {
        return descTipoCurso;
    }

    public void setClaveCurso(String claveCurso) {
        this.ClaveCurso = claveCurso;
    }

    public String getClaveCurso() {
        return ClaveCurso;
    }

    public void setDescSedeCurso(String descSedeCurso) {
        this.descSedeCurso = descSedeCurso;
    }

    public String getDescSedeCurso() {
        return descSedeCurso;
    }

    public void setParticipanteAsistencia(String participanteAsistencia) {
        this.participanteAsistencia = participanteAsistencia;
    }

    public String getParticipanteAsistencia() {
        return participanteAsistencia;
    }

    public void setParticipanteEvalInicial(String participanteEvalInicial) {
        this.participanteEvalInicial = participanteEvalInicial;
    }

    public String getParticipanteEvalInicial() {
        return participanteEvalInicial;
    }

    public void setParticipanteEvalFinal(String participanteEvalFinal) {
        this.participanteEvalFinal = participanteEvalFinal;
    }

    public String getParticipanteEvalFinal() {
        return participanteEvalFinal;
    }

    public void setDescSituacionParticipante(String descSituacionParticipante) {
        this.descSituacionParticipante = descSituacionParticipante;
    }

    public String getDescSituacionParticipante() {
        return descSituacionParticipante;
    }

    public void setBeanName(String beanName) {
        this.beanName = beanName;
    }

    public String getBeanName() {
        return beanName;
    }

    public void setUrlOrigen(String urlOrigen) {
        this.urlOrigen = urlOrigen;
    }

    public String getUrlOrigen() {
        return urlOrigen;
    }

    public void setUrlDestino(String urlDestino) {
        this.urlDestino = urlDestino;
    }

    public String getUrlDestino() {
        return urlDestino;
    }

    public void setAnterior(Long anterior) {
        this.anterior = anterior;
    }

    public Long getAnterior() {
        return anterior;
    }

    public void setCancel(boolean cancel) {
        this.cancel = cancel;
    }

    public boolean isCancel() {
        return cancel;
    }

    public void setMuestraRegistros(boolean muestraRegistros) {
        this.muestraRegistros = muestraRegistros;
    }

    public boolean isMuestraRegistros() {
        return muestraRegistros;
    }

    public void setIdentity(Serializable id) {
    }

    public Serializable getIdentity() {
        return null;
    }

    public void setCausalDesasignacion(String causalDesasignacion) {
        this.causalDesasignacion = causalDesasignacion;
    }

    public String getCausalDesasignacion() {
        return causalDesasignacion;
    }

    public void setInstr(List<String> instr) {
        this.instr = instr;
    }

    public List<String> getInstr() {
        return instr;
    }
}
