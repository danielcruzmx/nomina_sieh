package gob.shcp.sireh.data.jdbc.spc;

import gob.shcp.fsn.data.Domain;

import gob.shcp.sireh.domain.jdbc.spc.TnCapCurso;

import java.io.Serializable;

public class CustomPAC extends TnCapCurso implements Domain, Serializable {

    private java.lang.String descCursoPrincipal;
    private java.lang.String descCoordinacion;
    private java.lang.String descTipoCurso;
    private java.lang.String descNivelCurso;
    private java.lang.String descTipoInstEducat;
    private java.lang.String descSituacionCurso;
    private java.lang.String descHorarioCurso;
    private java.lang.Double cursoCostoParticipante;
    private java.lang.String descSubprograma;
    private java.lang.String descTipoCapacidad;
    private java.lang.String descSede;
    private java.lang.String descAula; 
    private java.lang.String descProveedor;
    private java.lang.String descSituacionProveedor;
    private java.lang.String descControlCurso;
    private java.lang.String instructor; 
    private java.lang.String descEjeTematico;
    private java.lang.String rfcEmpleado;
    private java.lang.String nombreEmpleado; 
    private java.lang.String idPuestoNom;
    private java.lang.String idNivelPto;
    private java.lang.String participanteUrRepoOm;
    private java.lang.String participanteDg;
    private java.lang.String idGenero; 
    private java.lang.String descSituacionParticipante; 
    private java.lang.Double participanteCalificacionFin; 
    private java.lang.Integer participanteAsistencia;
    private java.lang.String participanteIdRusp;
    private java.lang.String participanteCategoriaRusp; 
    private java.lang.String participantePtoRusp;
    private java.lang.String participanteClasifRusp;

    public void setDescCursoPrincipal(String descCursoPrincipal) {
        this.descCursoPrincipal = descCursoPrincipal;
    }

    public String getDescCursoPrincipal() {
        return descCursoPrincipal;
    }

    public void setDescCoordinacion(String descCoordinacion) {
        this.descCoordinacion = descCoordinacion;
    }

    public String getDescCoordinacion() {
        return descCoordinacion;
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

    public void setDescTipoInstEducat(String descTipoInstEducat) {
        this.descTipoInstEducat = descTipoInstEducat;
    }

    public String getDescTipoInstEducat() {
        return descTipoInstEducat;
    }

    public void setDescSituacionCurso(String descSituacionCurso) {
        this.descSituacionCurso = descSituacionCurso;
    }

    public String getDescSituacionCurso() {
        return descSituacionCurso;
    }

    public void setDescHorarioCurso(String descHorarioCurso) {
        this.descHorarioCurso = descHorarioCurso;
    }

    public String getDescHorarioCurso() {
        return descHorarioCurso;
    }

    public void setCursoCostoParticipante(Double cursoCostoParticipante) {
        this.cursoCostoParticipante = cursoCostoParticipante;
    }

    public Double getCursoCostoParticipante() {
        return cursoCostoParticipante;
    }

    public void setDescSubprograma(String descSubprograma) {
        this.descSubprograma = descSubprograma;
    }

    public String getDescSubprograma() {
        return descSubprograma;
    }

    public void setDescTipoCapacidad(String descTipoCapacidad) {
        this.descTipoCapacidad = descTipoCapacidad;
    }

    public String getDescTipoCapacidad() {
        return descTipoCapacidad;
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

    public void setDescProveedor(String descProveedor) {
        this.descProveedor = descProveedor;
    }

    public String getDescProveedor() {
        return descProveedor;
    }

    public void setDescSituacionProveedor(String descSituacionProveedor) {
        this.descSituacionProveedor = descSituacionProveedor;
    }

    public String getDescSituacionProveedor() {
        return descSituacionProveedor;
    }

    public void setDescControlCurso(String descControlCurso) {
        this.descControlCurso = descControlCurso;
    }

    public String getDescControlCurso() {
        return descControlCurso;
    }

    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }

    public String getInstructor() {
        return instructor;
    }

    public void setDescEjeTematico(String descEjeTematico) {
        this.descEjeTematico = descEjeTematico;
    }

    public String getDescEjeTematico() {
        return descEjeTematico;
    }

    public void setRfcEmpleado(String rfcEmpleado) {
        this.rfcEmpleado = rfcEmpleado;
    }

    public String getRfcEmpleado() {
        return rfcEmpleado;
    }

    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }

    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public void setIdPuestoNom(String idPuestoNom) {
        this.idPuestoNom = idPuestoNom;
    }

    public String getIdPuestoNom() {
        return idPuestoNom;
    }

    public void setIdNivelPto(String idNivelPto) {
        this.idNivelPto = idNivelPto;
    }

    public String getIdNivelPto() {
        return idNivelPto;
    }

    public void setParticipanteUrRepoOm(String participanteUrRepoOm) {
        this.participanteUrRepoOm = participanteUrRepoOm;
    }

    public String getParticipanteUrRepoOm() {
        return participanteUrRepoOm;
    }

    public void setParticipanteDg(String participanteDg) {
        this.participanteDg = participanteDg;
    }

    public String getParticipanteDg() {
        return participanteDg;
    }

    public void setIdGenero(String idGenero) {
        this.idGenero = idGenero;
    }

    public String getIdGenero() {
        return idGenero;
    }

    public void setDescSituacionParticipante(String descSituacionParticipante) {
        this.descSituacionParticipante = descSituacionParticipante;
    }

    public String getDescSituacionParticipante() {
        return descSituacionParticipante;
    }

    public void setParticipanteCalificacionFin(Double participanteCalificacionFin) {
        this.participanteCalificacionFin = participanteCalificacionFin;
    }

    public Double getParticipanteCalificacionFin() {
        return participanteCalificacionFin;
    }

    public void setParticipanteAsistencia(Integer participanteAsistencia) {
        this.participanteAsistencia = participanteAsistencia;
    }

    public Integer getParticipanteAsistencia() {
        return participanteAsistencia;
    }

    public void setParticipanteIdRusp(String participanteIdRusp) {
        this.participanteIdRusp = participanteIdRusp;
    }

    public String getParticipanteIdRusp() {
        return participanteIdRusp;
    }

    public void setParticipanteCategoriaRusp(String participanteCategoriaRusp) {
        this.participanteCategoriaRusp = participanteCategoriaRusp;
    }

    public String getParticipanteCategoriaRusp() {
        return participanteCategoriaRusp;
    }

    public void setParticipantePtoRusp(String participantePtoRusp) {
        this.participantePtoRusp = participantePtoRusp;
    }

    public String getParticipantePtoRusp() {
        return participantePtoRusp;
    }

    public void setParticipanteClasifRusp(String participanteClasifRusp) {
        this.participanteClasifRusp = participanteClasifRusp;
    }

    public String getParticipanteClasifRusp() {
        return participanteClasifRusp;
    }
}
