package gob.shcp.sireh.model.spc.registro;

import gob.shcp.fsn.model.Model;

import gob.shcp.sireh.model.ItemDTO;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class AsignarInstructorDTO implements Model, java.io.Serializable{
    //***** Control ida y regreso al controller
    private Integer     idCurso;
    private Integer     idCursos;
    private String      idHorarioCurso;
    private String      idInstructor;
    private String      instructorTitular;
    private String      idInstructorTitular;
    private String      instructorSuplente;
    private String      idInstructorSuplente;
    private String      idProveedor;
    private Integer     idSituacionProveedor;
    private String      motivoDesasignado;
    private Integer     motivoDesasigna;
    private String      interior;
    
    //***** Informativas del curso en Alta del Instructor
    private String      claveCurso;
    private String      nombreCurso;
    private String      subPrograma;
    private String      ejeTematico;
    private String      modalidad;
    private String      finalidad;
    private String      duracion;
    private String      proveedor;
    private Date        fechaInicio;
    private Date        fechaTermino;
    private String      sFechaInicio;
    private String      sFechaTermino;
    private String      sede;
    private String      aula;
    private String      horario;
    private Integer     cursoHoraInicio;
    private Integer     cursoHoraFin;
    private List<String> estatusCursos; // Estatus soportados por interior
    
    //*****   Variables de control de estado en los botones del formulario
    private boolean     asignarTitular;
    private boolean     asignarSuplente;
    private boolean     cancelar;
    private boolean     desasignarTitular;
    private boolean     desasignarSuplente;
    private boolean     muestraRegistros;
    private boolean     enCurso;
    private boolean     desAsignado;
    
    //***** Navegacion entre la pantalla de Asignar Instructor y los medotos en el controller
    private String[]    docGrupo;
    private String      beanName;
    private String      urlOrigen;
    private String      urlDestino;
    
    // Roles
    private boolean rolAdministradorCapacitacion;
    private boolean rolAdministradorCertificacion;
    private boolean rolCoordinacionAdministrativa;
    private boolean rolOperadorCapacitacion;
    private boolean rolEjecutivoContratacion;
    
    public AsignarInstructorDTO() {
    }

    public void setIdCurso(Integer idCurso) {
        this.idCurso = idCurso;
    }

    public Integer getIdCurso() {
        return idCurso;
    }
    
    public void setClaveCurso(String claveCurso) {
        this.claveCurso = claveCurso;
    }

    public String getClaveCurso() {
        return claveCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setSubPrograma(String subPrograma) {
        this.subPrograma = subPrograma;
    }

    public String getSubPrograma() {
        return subPrograma;
    }

    public void setEjeTematico(String ejeTematico) {
        this.ejeTematico = ejeTematico;
    }

    public String getEjeTematico() {
        return ejeTematico;
    }

    public void setModalidad(String modalidad) {
        this.modalidad = modalidad;
    }

    public String getModalidad() {
        return modalidad;
    }

    public void setFinalidad(String finalidad) {
        this.finalidad = finalidad;
    }

    public String getFinalidad() {
        return finalidad;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
    }

    public String getProveedor() {
        return proveedor;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaTermino(Date fechaTermino) {
        this.fechaTermino = fechaTermino;
    }

    public Date getFechaTermino() {
        return fechaTermino;
    }

    public void setSede(String sede) {
        this.sede = sede;
    }

    public String getSede() {
        return sede;
    }

    public void setAula(String aula) {
        this.aula = aula;
    }

    public String getAula() {
        return aula;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getHorario() {
        return horario;
    }

    public void setCancelar(boolean cancelar) {
        this.cancelar = cancelar;
    }

    public boolean isCancelar() {
        return cancelar;
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

    public void setIdCursos(Integer idCursos) {
        this.idCursos = idCursos;
    }

    public Integer getIdCursos() {
        return idCursos;
    }
    
    public void setIdHorarioCurso(String idHorarioCurso) {
        this.idHorarioCurso = idHorarioCurso;
    }

    public String getIdHorarioCurso() {
        return idHorarioCurso;
    }

    public void setSFechaInicio(String sFechaInicio) {
        this.sFechaInicio = sFechaInicio;
    }

    public String getSFechaInicio() {
        return sFechaInicio;
    }

    public void setSFechaTermino(String sFechaTermino) {
        this.sFechaTermino = sFechaTermino;
    }

    public String getSFechaTermino() {
        return sFechaTermino;
    }
    
    public void setRolAdministradorCapacitacion(boolean rolAdministradorCapacitacion) {
        this.rolAdministradorCapacitacion = rolAdministradorCapacitacion;
    }

    public boolean isRolAdministradorCapacitacion() {
        return rolAdministradorCapacitacion;
    }

    public void setRolAdministradorCertificacion(boolean rolAdministradorCertificacion) {
        this.rolAdministradorCertificacion = rolAdministradorCertificacion;
    }

    public boolean isRolAdministradorCertificacion() {
        return rolAdministradorCertificacion;
    }

    public void setRolCoordinacionAdministrativa(boolean rolCoordinacionAdministrativa) {
        this.rolCoordinacionAdministrativa = rolCoordinacionAdministrativa;
    }

    public boolean isRolCoordinacionAdministrativa() {
        return rolCoordinacionAdministrativa;
    }

    public void setRolOperadorCapacitacion(boolean rolOperadorCapacitacion) {
        this.rolOperadorCapacitacion = rolOperadorCapacitacion;
    }

    public boolean isRolOperadorCapacitacion() {
        return rolOperadorCapacitacion;
    }

    public void setRolEjecutivoContratacion(boolean rolEjecutivoContratacion) {
        this.rolEjecutivoContratacion = rolEjecutivoContratacion;
    }

    public boolean isRolEjecutivoContratacion() {
        return rolEjecutivoContratacion;
    }

    public void setEstatusCursos(List<String> estatusCursos) {
        this.estatusCursos = estatusCursos;
    }

    public List<String> getEstatusCursos() {
        return estatusCursos;
    }
    
    public void setIdInstructor(String idInstructor) {
        this.idInstructor = idInstructor;
    }

    public String getIdInstructor() {
        return idInstructor;
    }

    public void setDesasignarTitular(boolean desasignarTitular) {
        this.desasignarTitular = desasignarTitular;
    }

    public boolean isDesasignarTitular() {
        return desasignarTitular;
    }

    public void setDesasignarSuplente(boolean desasignarSuplente) {
        this.desasignarSuplente = desasignarSuplente;
    }

    public boolean isDesasignarSuplente() {
        return desasignarSuplente;
    }

    public void setDocGrupo(String[] docGrupo) {
        this.docGrupo = docGrupo;
    }

    public String[] getDocGrupo() {
        return docGrupo;
    }

    public void setAsignarTitular(boolean asignarTitular) {
        this.asignarTitular = asignarTitular;
    }

    public boolean isAsignarTitular() {
        return asignarTitular;
    }

    public void setAsignarSuplente(boolean asignarSuplente) {
        this.asignarSuplente = asignarSuplente;
    }

    public boolean isAsignarSuplente() {
        return asignarSuplente;
    }

    public void setUrlDestino(String urlDestino) {
        this.urlDestino = urlDestino;
    }

    public String getUrlDestino() {
        return urlDestino;
    }

    public void setMuestraRegistros(boolean muestraRegistros) {
        this.muestraRegistros = muestraRegistros;
    }

    public boolean isMuestraRegistros() {
        return muestraRegistros;
    }

    public void setIdInstructorTitular(String idInstructorTitular) {
        this.idInstructorTitular = idInstructorTitular;
    }

    public String getIdInstructorTitular() {
        return idInstructorTitular;
    }

    public void setIdInstructorSuplente(String idInstructorSuplente) {
        this.idInstructorSuplente = idInstructorSuplente;
    }

    public String getIdInstructorSuplente() {
        return idInstructorSuplente;
    }

    public void setIdProveedor(String idProveedor) {
        this.idProveedor = idProveedor;
    }

    public String getIdProveedor() {
        return idProveedor;
    }

    public void setIdSituacionProveedor(Integer idSituacionProveedor) {
        this.idSituacionProveedor = idSituacionProveedor;
    }

    public Integer getIdSituacionProveedor() {
        return idSituacionProveedor;
    }

    public void setInstructorTitular(String instructorTitular) {
        this.instructorTitular = instructorTitular;
    }

    public String getInstructorTitular() {
        return instructorTitular;
    }

    public void setInstructorSuplente(String instructorSuplente) {
        this.instructorSuplente = instructorSuplente;
    }

    public String getInstructorSuplente() {
        return instructorSuplente;
    }

    public void setEnCurso(boolean enCurso) {
        this.enCurso = enCurso;
    }

    public boolean isEnCurso() {
        return enCurso;
    }

    public void setMotivoDesasignado(String motivoDesasignado) {
        this.motivoDesasignado = motivoDesasignado;
    }

    public String getMotivoDesasignado() {
        return motivoDesasignado;
    }

    public void setMotivoDesasigna(Integer motivoDesasigna) {
        this.motivoDesasigna = motivoDesasigna;
    }

    public Integer getMotivoDesasigna() {
        return motivoDesasigna;
    }

    public void setDesAsignado(boolean desAsignado) {
        this.desAsignado = desAsignado;
    }

    public boolean isDesAsignado() {
        return desAsignado;
    }

    public void setCursoHoraInicio(Integer cursoHoraInicio) {
        this.cursoHoraInicio = cursoHoraInicio;
    }

    public Integer getCursoHoraInicio() {
        return cursoHoraInicio;
    }

    public void setCursoHoraFin(Integer cursoHoraFin) {
        this.cursoHoraFin = cursoHoraFin;
    }

    public Integer getCursoHoraFin() {
        return cursoHoraFin;
    }

    public void setInterior(String interior) {
        this.interior = interior;
    }

    public String getInterior() {
        return interior;
    }
}
