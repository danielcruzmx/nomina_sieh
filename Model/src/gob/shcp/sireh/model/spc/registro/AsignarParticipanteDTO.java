package gob.shcp.sireh.model.spc.registro;

import gob.shcp.fsn.model.Model;

import java.util.Date;

import org.springmodules.validation.bean.conf.loader.annotation.handler.ValidationMethod;

public class AsignarParticipanteDTO implements java.io.Serializable, Model {
    
    // Tipo de curso
    private java.lang.String idTipoCurso;
    private String tipoCursoDescripcion;
    private String tipoCurso;
    private String anioOperacion;

    // Datos del curso
    private java.lang.Integer idCurso;
    private java.lang.String cursoClave;
    private java.lang.String descCursoPrincipal;
    private java.lang.Integer idSubprograma;
    private java.lang.String descSubprograma;
    private java.lang.String idEjeTematico;
    private java.lang.String descEjeTematico;
    private java.lang.Integer idModalidad;
    private java.lang.String descModalidad;
    private int idFinalidad;
    private java.lang.String descFinalidad;
    private java.lang.Float cursoDuracion;
    private java.util.Date cursoFecIni;
    private java.util.Date cursoFecFin;
    private java.lang.String cursoFecIniFormat;
    private java.lang.String cursoFecFinFormat;
    private java.lang.String idSede;
    private java.lang.String descSede;
    private java.lang.String idAula;
    private java.lang.String descAula;
    private java.lang.String idHorarioCurso;
    private java.lang.String descHorarioCurso;
    private java.lang.Integer cursoMinimoParticipantes;
    private java.lang.String capNotifCursoMsg;
    private java.lang.String capNotifCursoAsunto;
    private java.lang.Integer idMotivoDesasigna;
    private java.lang.Integer cupoMaximoAula;
    
    // JSON
    private String postDataInscribirParticipante;
    private String postDataCancelarParticipante;
    
    // Navegacion
    private String urlInscribirParticipante;
    private String urlCancelarParticipante;
    
    // Roles
    private boolean rolAdministradorCapacitacion;
    private boolean rolAdministradorCertificacion;
    private boolean rolCoordinacionAdministrativa;
    private boolean rolOperadorCapacitacion;
    private boolean rolEjecutivoContratacion;
    
    // Botones
    private boolean enviarNotificacion;
    private boolean inscribirParticipantes;
    private boolean cancelarInscripcion;
    
    public void setIdCurso(Integer idCurso) {
        this.idCurso = idCurso;
    }

    public Integer getIdCurso() {
        return idCurso;
    }

    public void setCursoClave(String cursoClave) {
        this.cursoClave = cursoClave;
    }

    public String getCursoClave() {
        return cursoClave;
    }

    public void setDescCursoPrincipal(String descCursoPrincipal) {
        this.descCursoPrincipal = descCursoPrincipal;
    }

    public String getDescCursoPrincipal() {
        return descCursoPrincipal;
    }

    public void setIdSubprograma(Integer idSubprograma) {
        this.idSubprograma = idSubprograma;
    }

    public Integer getIdSubprograma() {
        return idSubprograma;
    }

    public void setDescSubprograma(String descSubprograma) {
        this.descSubprograma = descSubprograma;
    }

    public String getDescSubprograma() {
        return descSubprograma;
    }

    public void setIdEjeTematico(String idEjeTematico) {
        this.idEjeTematico = idEjeTematico;
    }

    public String getIdEjeTematico() {
        return idEjeTematico;
    }

    public void setDescEjeTematico(String descEjeTematico) {
        this.descEjeTematico = descEjeTematico;
    }

    public String getDescEjeTematico() {
        return descEjeTematico;
    }

    public void setIdModalidad(java.lang.Integer idModalidad) {
        this.idModalidad = idModalidad;
    }

    public java.lang.Integer getIdModalidad() {
        return idModalidad;
    }

    public void setDescModalidad(String descModalidad) {
        this.descModalidad = descModalidad;
    }

    public String getDescModalidad() {
        return descModalidad;
    }

    public void setIdFinalidad(int idFinalidad) {
        this.idFinalidad = idFinalidad;
    }

    public int getIdFinalidad() {
        return idFinalidad;
    }

    public void setDescFinalidad(String descFinalidad) {
        this.descFinalidad = descFinalidad;
    }

    public String getDescFinalidad() {
        return descFinalidad;
    }

    public void setCursoDuracion(java.lang.Float cursoDuracion) {
        this.cursoDuracion = cursoDuracion;
    }

    public java.lang.Float getCursoDuracion() {
        return cursoDuracion;
    }

    public void setCursoFecFin(Date cursoFecFin) {
        this.cursoFecFin = cursoFecFin;
    }

    public Date getCursoFecFin() {
        return cursoFecFin;
    }

    public void setCursoFecIni(Date cursoFecIni) {
        this.cursoFecIni = cursoFecIni;
    }

    public Date getCursoFecIni() {
        return cursoFecIni;
    }

    public void setIdSede(String idSede) {
        this.idSede = idSede;
    }

    public String getIdSede() {
        return idSede;
    }

    public void setDescSede(String descSede) {
        this.descSede = descSede;
    }

    public String getDescSede() {
        return descSede;
    }

    public void setIdAula(String idAula) {
        this.idAula = idAula;
    }

    public String getIdAula() {
        return idAula;
    }

    public void setDescAula(String descAula) {
        this.descAula = descAula;
    }

    public String getDescAula() {
        return descAula;
    }

    public void setIdHorarioCurso(String idHorarioCurso) {
        this.idHorarioCurso = idHorarioCurso;
    }

    public String getIdHorarioCurso() {
        return idHorarioCurso;
    }

    public void setDescHorarioCurso(String descHorarioCurso) {
        this.descHorarioCurso = descHorarioCurso;
    }

    public String getDescHorarioCurso() {
        return descHorarioCurso;
    }

    public void setCursoMinimoParticipantes(Integer cursoMinimoParticipantes) {
        this.cursoMinimoParticipantes = cursoMinimoParticipantes;
    }

    public Integer getCursoMinimoParticipantes() {
        return cursoMinimoParticipantes;
    }
    
    public void setTipoCurso(String tipoCurso) {
        this.tipoCurso = tipoCurso;
    }

    public String getTipoCurso() {
        return tipoCurso;
    }

    public void setAnioOperacion(String anioOperacion) {
        this.anioOperacion = anioOperacion;
    }

    public String getAnioOperacion() {
        return anioOperacion;
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
    
    public void setPostDataInscribirParticipante(String postDataInscribirParticipante) {
        this.postDataInscribirParticipante = postDataInscribirParticipante;
    }

    public String getPostDataInscribirParticipante() {
        return postDataInscribirParticipante;
    }

    public void setPostDataCancelarParticipante(String postDataCancelarParticipante) {
        this.postDataCancelarParticipante = postDataCancelarParticipante;
    }

    public String getPostDataCancelarParticipante() {
        return postDataCancelarParticipante;
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
    
    public void setTipoCursoDescripcion(String tipoCursoDescripcion) {
        this.tipoCursoDescripcion = tipoCursoDescripcion;
    }

    public String getTipoCursoDescripcion() {
        return tipoCursoDescripcion;
    }
    
    public void setIdTipoCurso(String idTipoCurso) {
        this.idTipoCurso = idTipoCurso;
    }

    public String getIdTipoCurso() {
        return idTipoCurso;
    }
    
    public void setCursoFecIniFormat(String cursoFecIniFormat) {
        this.cursoFecIniFormat = cursoFecIniFormat;
    }

    public String getCursoFecIniFormat() {
        return cursoFecIniFormat;
    }

    public void setCursoFecFinFormat(String cursoFecFinFormat) {
        this.cursoFecFinFormat = cursoFecFinFormat;
    }

    public String getCursoFecFinFormat() {
        return cursoFecFinFormat;
    }

    public void setCapNotifCursoMsg(String capNotifCursoMsg) {
        this.capNotifCursoMsg = capNotifCursoMsg;
    }

    public String getCapNotifCursoMsg() {
        return capNotifCursoMsg;
    }

    public void setCapNotifCursoAsunto(String capNotifCursoAsunto) {
        this.capNotifCursoAsunto = capNotifCursoAsunto;
    }

    public String getCapNotifCursoAsunto() {
        return capNotifCursoAsunto;
    }

    public void setEnviarNotificacion(boolean enviarNotificacion) {
        this.enviarNotificacion = enviarNotificacion;
    }

    public boolean isEnviarNotificacion() {
        return enviarNotificacion;
    }

    /** Valida que haya sido seleccionado un valor para idModalidad
     * @author Gualberto G.
     * @return boolean
     */
    @ValidationMethod(forProperty = "idModalidad", errorCode = "not.null")
    public boolean validateIdModalidadRequired() {
        if (enviarNotificacion) {
            return this.getIdModalidad() != null && this.getIdModalidad() > 0;
        }
        return true;
    }
    
    /** Valida que haya sido seleccionado un valor para idMotivoDesasigna
     * @author Gualberto G.
     * @return boolean
     */
    @ValidationMethod(forProperty = "idMotivoDesasigna", errorCode = "not.null")
    public boolean validateIdMotivoDesasignaRequired() {
        if (cancelarInscripcion) {
            return this.getIdMotivoDesasigna() != null && this.getIdMotivoDesasigna() > 0;
        }
        return true;
    }
    
    public void setIdMotivoDesasigna(Integer idMotivoDesasigna) {
        this.idMotivoDesasigna = idMotivoDesasigna;
    }

    public Integer getIdMotivoDesasigna() {
        return idMotivoDesasigna;
    }

    public void setInscribirParticipantes(boolean inscribirParticipantes) {
        this.inscribirParticipantes = inscribirParticipantes;
    }

    public boolean isInscribirParticipantes() {
        return inscribirParticipantes;
    }

    public void setCupoMaximoAula(Integer cupoMaximoAula) {
        this.cupoMaximoAula = cupoMaximoAula;
    }

    public Integer getCupoMaximoAula() {
        return cupoMaximoAula;
    }

    public void setCancelarInscripcion(boolean cancelarInscripcion) {
        this.cancelarInscripcion = cancelarInscripcion;
    }

    public boolean isCancelarInscripcion() {
        return cancelarInscripcion;
    }
}


