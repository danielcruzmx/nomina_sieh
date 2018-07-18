package gob.shcp.sireh.model.spc.consulta;

import gob.shcp.fsn.model.Model;

import gob.shcp.sireh.model.spc.TnCapCursoDTO;

public class CustomCalendarioDTO extends TnCapCursoDTO implements java.io.Serializable, Model {
			
    private java.lang.String descSubprograma;
    private java.lang.String descModalidad;
    private java.lang.String descEjeTematico;
    private java.lang.String descCursoPrincipal;
    private java.lang.String descFinalidad;
    private java.lang.String descSede;
    private java.lang.String descAula; 
    private java.lang.String descHorarioCurso; 
    private java.lang.String descProveedor; 
    private java.lang.String descTipoInstEducat; 
    private java.lang.Double cursoPresupuesto;
    private java.lang.String descSituacionProveedor;
    private java.lang.String instructor; 
    private java.lang.String descSituacionCurso;
    private java.lang.String cursoClaveCertificacion;
    private java.lang.String descTipoCapacidad;
    private java.lang.String descTipoCurso;
    private java.lang.String descNivelCurso;
    private java.lang.Integer cupoMaximoAula;
    private java.lang.Integer participantesTotal;
    private java.lang.Integer participantesAprobados;
    private java.lang.Double costoParticipantes;
    private java.lang.Double evaluacionReaccion;

    public void setDescSubprograma(String descSubprograma) {
        this.descSubprograma = descSubprograma;
    }

    public String getDescSubprograma() {
        return descSubprograma;
    }

    public void setDescEjeTematico(String descEjeTematico) {
        this.descEjeTematico = descEjeTematico;
    }

    public String getDescEjeTematico() {
        return descEjeTematico;
    }

    public void setDescCursoPrincipal(String descCursoPrincipal) {
        this.descCursoPrincipal = descCursoPrincipal;
    }

    public String getDescCursoPrincipal() {
        return descCursoPrincipal;
    }

    public void setDescFinalidad(String descFinalidad) {
        this.descFinalidad = descFinalidad;
    }

    public String getDescFinalidad() {
        return descFinalidad;
    }

    public void setDescSede(String descSede) {
        this.descSede = descSede;
    }

    public String getDescSede() {
        return descSede;
    }

    public void setDescAula(String descAula) {
        this.descAula = descAula;
    }

    public String getDescAula() {
        return descAula;
    }

    public void setDescHorarioCurso(String descHorarioCurso) {
        this.descHorarioCurso = descHorarioCurso;
    }

    public String getDescHorarioCurso() {
        return descHorarioCurso;
    }

    public void setDescProveedor(String descProveedor) {
        this.descProveedor = descProveedor;
    }

    public String getDescProveedor() {
        return descProveedor;
    }

    public void setDescTipoInstEducat(String descTipoInstEducat) {
        this.descTipoInstEducat = descTipoInstEducat;
    }

    public String getDescTipoInstEducat() {
        return descTipoInstEducat;
    }

    public void setDescSituacionProveedor(String descSituacionProveedor) {
        this.descSituacionProveedor = descSituacionProveedor;
    }

    public String getDescSituacionProveedor() {
        return descSituacionProveedor;
    }

    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }

    public String getInstructor() {
        return instructor;
    }

    public void setDescSituacionCurso(String descSituacionCurso) {
        this.descSituacionCurso = descSituacionCurso;
    }

    public String getDescSituacionCurso() {
        return descSituacionCurso;
    }

    public String get_cursoClaveCertificacion() {
        return cursoClaveCertificacion;
    }

    public void setDescTipoCapacidad(String descTipoCapacidad) {
        this.descTipoCapacidad = descTipoCapacidad;
    }

    public String getDescTipoCapacidad() {
        return descTipoCapacidad;
    }

    public void setDescTipoCurso(String descTipoCurso) {
        this.descTipoCurso = descTipoCurso;
    }

    public String getDescTipoCurso() {
        return descTipoCurso;
    }

    public void setDescNivelCurso(String descNivelCurso) {
        this.descNivelCurso = descNivelCurso;
    }

    public String getDescNivelCurso() {
        return descNivelCurso;
    }

    public void setCupoMaximoAula(Integer cupoMaximoAula) {
        this.cupoMaximoAula = cupoMaximoAula;
    }

    public Integer getCupoMaximoAula() {
        return cupoMaximoAula;
    }

    public void setDescModalidad(String descModalidad) {
        this.descModalidad = descModalidad;
    }

    public String getDescModalidad() {
        return descModalidad;
    }

    public void setParticipantesTotal(Integer participantesTotal) {
        this.participantesTotal = participantesTotal;
    }

    public Integer getParticipantesTotal() {
        return participantesTotal;
    }

    public void setParticipantesAprobados(Integer participantesAprobados) {
        this.participantesAprobados = participantesAprobados;
    }

    public Integer getParticipantesAprobados() {
        return participantesAprobados;
    }

    public void setCostoParticipantes(Double costoParticipantes) {
        this.costoParticipantes = costoParticipantes;
    }

    public Double getCostoParticipantes() {
        return costoParticipantes;
    }

    public void setEvaluacionReaccion(Double evaluacionReaccion) {
        this.evaluacionReaccion = evaluacionReaccion;
    }

    public Double getEvaluacionReaccion() {
        return evaluacionReaccion;
    }

    public Double get_cursoPresupuesto() {
        return cursoPresupuesto;
    }
}
