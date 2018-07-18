package gob.shcp.sireh.domain.jdbc.spc;

import gob.shcp.fsn.data.Domain;

import java.io.Serializable;

import java.util.List;

public class SecuenciaEmpleado implements Domain, Serializable {
    // Curso
    private Integer idCurso;
    private String  coordinacionCurso;
    private String  descripcionCurso;
    private String  subprogramaCurso;
    private String  duracionCurso;
    private String  fechaInicioCurso;
    private String  fechaTerminoCurso;
    private Integer participantesCurso;
    private String  modalidadCurso;
    private String  finalidadCurso;
    private String  sedeCurso;
    private String  aulaCurso;
    private String  horarioCurso;
    private String  estatusCurso;
    private String  descTipoCurso;
    private String  ClaveCurso;
    private String  descEjeTematicoCurso;
    
    //Proveedor
    private String  nombreProveedor;
    private Integer idInstrTit;
    private String  nombreInstrTitular;
    private Integer idInstrSup;
    private String  nombreInstrSuplente;
    private String  causalDesasignacion;
    private Integer idCausalDesasignacion;
    private String  causalDesasignacionTit;
    private String  causalDesasignacionSup;
    
    // Participante
    private String  participanteRfc;
    private String  participanteAsistencia;
    private String  participanteEvalInicial;
    private String  participanteEvalFinal;
    private String  situacionPartCurso; 
    private String  participanteUnidad;
    private String  participantePuesto;
    private String  participanteNivel;
    private String  participanteGenero;
    private String  participanteNombre;
    private String  participantePrimerApellido;
    private String  participanteSegundoApellido;
    private String  participanteEmail;
    private String  participanteNotificacion;
    private String  observaciones;
    private Integer idCapBitacInstr;
    
    // Configuracion inicial
    private List<String> estatusCursos; // Estatus soportados por interior
    private String control; // Control de interior
    private String interior; // Nombre del interior
    private String beanName; // beanName del PagedList
    
    // Navegacion
    private String urlOrigen;
    private String urlDestino;
    private String urlRegistroCurso;
    private String urlDeleteRegistroCurso;
    private String urlInscribirParticipante;
    private String urlCancelarParticipante;
    
    // Control
    private boolean cancel;
    private String  rfc;
    private boolean muestraRegistros;

    public void setIdentity(Serializable id) {
    }

    public Serializable getIdentity() {
        return null;
    }

    public void setIdCurso(Integer idCurso) {
        this.idCurso = idCurso;
    }

    public Integer getIdCurso() {
        return idCurso;
    }

    public void setCoordinacionCurso(String coordinacionCurso) {
        this.coordinacionCurso = coordinacionCurso;
    }

    public String getCoordinacionCurso() {
        return coordinacionCurso;
    }

    public void setDescripcionCurso(String descripcionCurso) {
        this.descripcionCurso = descripcionCurso;
    }

    public String getDescripcionCurso() {
        return descripcionCurso;
    }

    public void setSubprogramaCurso(String subprogramaCurso) {
        this.subprogramaCurso = subprogramaCurso;
    }

    public String getSubprogramaCurso() {
        return subprogramaCurso;
    }

    public void setDuracionCurso(String duracionCurso) {
        this.duracionCurso = duracionCurso;
    }

    public String getDuracionCurso() {
        return duracionCurso;
    }

    public void setFechaInicioCurso(String fechaInicioCurso) {
        this.fechaInicioCurso = fechaInicioCurso;
    }

    public String getFechaInicioCurso() {
        return fechaInicioCurso;
    }

    public void setFechaTerminoCurso(String fechaTerminoCurso) {
        this.fechaTerminoCurso = fechaTerminoCurso;
    }

    public String getFechaTerminoCurso() {
        return fechaTerminoCurso;
    }

    public void setParticipantesCurso(Integer participantesCurso) {
        this.participantesCurso = participantesCurso;
    }

    public Integer getParticipantesCurso() {
        return participantesCurso;
    }

    public void setModalidadCurso(String modalidadCurso) {
        this.modalidadCurso = modalidadCurso;
    }

    public String getModalidadCurso() {
        return modalidadCurso;
    }

    public void setFinalidadCurso(String finalidadCurso) {
        this.finalidadCurso = finalidadCurso;
    }

    public String getFinalidadCurso() {
        return finalidadCurso;
    }

    public void setSedeCurso(String sedeCurso) {
        this.sedeCurso = sedeCurso;
    }

    public String getSedeCurso() {
        return sedeCurso;
    }

    public void setAulaCurso(String aulaCurso) {
        this.aulaCurso = aulaCurso;
    }

    public String getAulaCurso() {
        return aulaCurso;
    }

    public void setHorarioCurso(String horarioCurso) {
        this.horarioCurso = horarioCurso;
    }

    public String getHorarioCurso() {
        return horarioCurso;
    }

    public void setEstatusCurso(String estatusCurso) {
        this.estatusCurso = estatusCurso;
    }

    public String getEstatusCurso() {
        return estatusCurso;
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

    public void setDescEjeTematicoCurso(String descEjeTematicoCurso) {
        this.descEjeTematicoCurso = descEjeTematicoCurso;
    }

    public String getDescEjeTematicoCurso() {
        return descEjeTematicoCurso;
    }

    public void setNombreProveedor(String nombreProveedor) {
        this.nombreProveedor = nombreProveedor;
    }

    public String getNombreProveedor() {
        return nombreProveedor;
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

    public void setParticipanteRfc(String participanteRfc) {
        this.participanteRfc = participanteRfc;
    }

    public String getParticipanteRfc() {
        return participanteRfc;
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

    public void setSituacionPartCurso(String situacionPartCurso) {
        this.situacionPartCurso = situacionPartCurso;
    }

    public String getSituacionPartCurso() {
        return situacionPartCurso;
    }

    public void setParticipanteUnidad(String participanteUnidad) {
        this.participanteUnidad = participanteUnidad;
    }

    public String getParticipanteUnidad() {
        return participanteUnidad;
    }

    public void setParticipantePuesto(String participantePuesto) {
        this.participantePuesto = participantePuesto;
    }

    public String getParticipantePuesto() {
        return participantePuesto;
    }

    public void setParticipanteNivel(String participanteNivel) {
        this.participanteNivel = participanteNivel;
    }

    public String getParticipanteNivel() {
        return participanteNivel;
    }

    public void setParticipanteGenero(String participanteGenero) {
        this.participanteGenero = participanteGenero;
    }

    public String getParticipanteGenero() {
        return participanteGenero;
    }

    public void setParticipanteNombre(String participanteNombre) {
        this.participanteNombre = participanteNombre;
    }

    public String getParticipanteNombre() {
        return participanteNombre;
    }

    public void setParticipantePrimerApellido(String participantePrimerApellido) {
        this.participantePrimerApellido = participantePrimerApellido;
    }

    public String getParticipantePrimerApellido() {
        return participantePrimerApellido;
    }

    public void setParticipanteSegundoApellido(String participanteSegundoApellido) {
        this.participanteSegundoApellido = participanteSegundoApellido;
    }

    public String getParticipanteSegundoApellido() {
        return participanteSegundoApellido;
    }

    public void setParticipanteEmail(String participanteEmail) {
        this.participanteEmail = participanteEmail;
    }

    public String getParticipanteEmail() {
        return participanteEmail;
    }

    public void setParticipanteNotificacion(String participanteNotificacion) {
        this.participanteNotificacion = participanteNotificacion;
    }

    public String getParticipanteNotificacion() {
        return participanteNotificacion;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setEstatusCursos(List<String> estatusCursos) {
        this.estatusCursos = estatusCursos;
    }

    public List<String> getEstatusCursos() {
        return estatusCursos;
    }

    public void setControl(String control) {
        this.control = control;
    }

    public String getControl() {
        return control;
    }

    public void setInterior(String interior) {
        this.interior = interior;
    }

    public String getInterior() {
        return interior;
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

    public void setUrlRegistroCurso(String urlRegistroCurso) {
        this.urlRegistroCurso = urlRegistroCurso;
    }

    public String getUrlRegistroCurso() {
        return urlRegistroCurso;
    }

    public void setUrlDeleteRegistroCurso(String urlDeleteRegistroCurso) {
        this.urlDeleteRegistroCurso = urlDeleteRegistroCurso;
    }

    public String getUrlDeleteRegistroCurso() {
        return urlDeleteRegistroCurso;
    }

    public void setUrlInscribirParticipante(String urlInscribirParticipante) {
        this.urlInscribirParticipante = urlInscribirParticipante;
    }

    public String getUrlInscribirParticipante() {
        return urlInscribirParticipante;
    }

    public void setUrlCancelarParticipante(String urlCancelarParticipante) {
        this.urlCancelarParticipante = urlCancelarParticipante;
    }

    public String getUrlCancelarParticipante() {
        return urlCancelarParticipante;
    }

    public void setCancel(boolean cancel) {
        this.cancel = cancel;
    }

    public boolean isCancel() {
        return cancel;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    public String getRfc() {
        return rfc;
    }

    public void setMuestraRegistros(boolean muestraRegistros) {
        this.muestraRegistros = muestraRegistros;
    }

    public boolean isMuestraRegistros() {
        return muestraRegistros;
    }

    public void setIdCapBitacInstr(Integer idCapBitacInstr) {
        this.idCapBitacInstr = idCapBitacInstr;
    }

    public Integer getIdCapBitacInstr() {
        return idCapBitacInstr;
    }

    public void setCausalDesasignacion(String causalDesasignacion) {
        this.causalDesasignacion = causalDesasignacion;
    }

    public String getCausalDesasignacion() {
        return causalDesasignacion;
    }

    public void setIdCausalDesasignacion(Integer idCausalDesasignacion) {
        this.idCausalDesasignacion = idCausalDesasignacion;
    }

    public Integer getIdCausalDesasignacion() {
        return idCausalDesasignacion;
    }

    public void setIdInstrTit(Integer idInstrTit) {
        this.idInstrTit = idInstrTit;
    }

    public Integer getIdInstrTit() {
        return idInstrTit;
    }

    public void setIdInstrSup(Integer idInstrSup) {
        this.idInstrSup = idInstrSup;
    }

    public Integer getIdInstrSup() {
        return idInstrSup;
    }

    public void setCausalDesasignacionTit(String causalDesasignacionTit) {
        this.causalDesasignacionTit = causalDesasignacionTit;
    }

    public String getCausalDesasignacionTit() {
        return causalDesasignacionTit;
    }

    public void setCausalDesasignacionSup(String causalDesasignacionSup) {
        this.causalDesasignacionSup = causalDesasignacionSup;
    }

    public String getCausalDesasignacionSup() {
        return causalDesasignacionSup;
    }
}
