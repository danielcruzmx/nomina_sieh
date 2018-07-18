package gob.shcp.sireh.model.spc.seguimiento;

import gob.shcp.fsn.model.Model;

import java.util.Date;

public class EvaluarParticipanteDTO implements Model, java.io.Serializable {
    //***** Control ida y regreso al controller
    private Integer     idCurso;
    private Integer     idCursos;
    private Integer     cRef;
    private String      idInstructor;
    
    //***** Informativas del curso en Alta del Instructor
    private String      cursoClave;
    private String      cursoPrincipal;
    private String      minimoParticipantes;
    private String      nombreCurso;
    private String      subPrograma;
    private String      ejeTematico;
    private String      modalidad;
    private String      finalidad;
    private String      duracion;
    private String      proveedor;
    private Date        fechaInicio;
    private Date        fechaFin;
    private String      sede;
    private String      aula;
    private String      horario;
    private String      idJerarquia;
    
    //*****   Variables de control de estado en los botones del formulario
    private boolean     aceptar;
    private boolean     cancelar;
    private boolean     muestraRegistros;
    
    //***** Navegacion entre la pantalla de Asignar Instructor y los medotos en el controller
    private String      beanName;
    private String      urlOrigen;
    private String      urlDestino;
    private String      urlValidar;
    
    //***** Datos para el grid de Calificaciones
    private String      jsonDataString;
    private String      postData;
    
    // Roles
    private boolean rolAdministradorCapacitacion;
    private boolean rolAdministradorCertificacion;
    private boolean rolCoordinacionAdministrativa;
    private boolean rolOperadorCapacitacion;
    private boolean rolEjecutivoContratacion;
        
    public EvaluarParticipanteDTO() {
    }

    public void setIdCurso(Integer idCurso) {
        this.idCurso = idCurso;
    }

    public Integer getIdCurso() {
        return idCurso;
    }

    public void setIdCursos(Integer idCursos) {
        this.idCursos = idCursos;
    }

    public Integer getIdCursos() {
        return idCursos;
    }

    public void setCRef(Integer cRef) {
        this.cRef = cRef;
    }

    public Integer getCRef() {
        return cRef;
    }

    public void setIdInstructor(String idInstructor) {
        this.idInstructor = idInstructor;
    }

    public String getIdInstructor() {
        return idInstructor;
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

    public void setAceptar(boolean aceptar) {
        this.aceptar = aceptar;
    }

    public boolean isAceptar() {
        return aceptar;
    }

    public void setCancelar(boolean cancelar) {
        this.cancelar = cancelar;
    }

    public boolean isCancelar() {
        return cancelar;
    }

    public void setMuestraRegistros(boolean muestraRegistros) {
        this.muestraRegistros = muestraRegistros;
    }

    public boolean isMuestraRegistros() {
        return muestraRegistros;
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

    public void setUrlValidar(String urlValidar) {
        this.urlValidar = urlValidar;
    }

    public String getUrlValidar() {
        return urlValidar;
    }

    public void setJsonDataString(String jsonDataString) {
        this.jsonDataString = jsonDataString;
    }

    public String getJsonDataString() {
        return jsonDataString;
    }

    public void setPostData(String postData) {
        this.postData = postData;
    }

    public String getPostData() {
        return postData;
    }

    public void setIdJerarquia(String idJerarquia) {
        this.idJerarquia = idJerarquia;
    }

    public String getIdJerarquia() {
        return idJerarquia;
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

    public void setCursoClave(String cursoClave) {
        this.cursoClave = cursoClave;
    }

    public String getCursoClave() {
        return cursoClave;
    }

    public void setCursoPrincipal(String cursoPrincipal) {
        this.cursoPrincipal = cursoPrincipal;
    }

    public String getCursoPrincipal() {
        return cursoPrincipal;
    }

    public void setMinimoParticipantes(String minimoParticipantes) {
        this.minimoParticipantes = minimoParticipantes;
    }

    public String getMinimoParticipantes() {
        return minimoParticipantes;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public Date getFechaFin() {
        return fechaFin;
    }
}

