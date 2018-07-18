package gob.shcp.sireh.model.spc.seguimiento;

import gob.shcp.fsn.model.Model;

import java.io.Serializable;

import java.util.Date;

public class EvaluacionReaccionDTO implements Model, Serializable {
    private java.lang.Integer idCurso;
    private java.lang.String cursoClave;
    private java.lang.String descCursoPrincipal;
    private java.lang.Integer idSubprograma;
    private java.lang.String descSubprograma;
    private java.lang.String idEjeTematico;
    private java.lang.String descEjeTematico;
    private int idModalidad;
    private java.lang.String descModalidad;
    private int idFinalidad;
    private java.lang.String descFinalidad;
    private java.lang.Float cursoDuracion;
    private java.util.Date cursoFecFin;
    private java.util.Date cursoFecIni;
    private java.lang.String idSede;
    private java.lang.String descSede;
    private java.lang.String idAula;
    private java.lang.String descAula;
    private java.lang.String idHorarioCurso;
    private java.lang.String descHorarioCurso;
    private java.lang.Integer cursoMinimoParticipantes;
    private java.lang.Integer cursoMaximoParticipantes;
    private java.lang.String idControlCurso;
    private java.lang.String cursoHorarioObser;
    private Integer cursoParticipantes;
    
    
    
    // Roles
    private boolean rolAdministradorCapacitacion;
    private boolean rolAdministradorCertificacion;
    private boolean rolCoordinacionAdministrativa;
    private boolean rolOperadorCapacitacion;
    private boolean rolEjecutivoContratacion;

    //urls
     private String urlSaveEvaluacionCurso;
     private String urlValidateEvaluacionCurso;
     private String urlCancelEvaluacionCurso;
    private String urlTerminarCaptura;

    // JSON
    private String postDataEvaluacionCurso; 
    
    //Botones
    private boolean showValidar;
    private boolean showEditarCampos;
    private boolean showTerminarCaptura;
    private boolean showGuardar;


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

    public void setIdModalidad(int idModalidad) {
        this.idModalidad = idModalidad;
    }

    public int getIdModalidad() {
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

    public void setCursoMaximoParticipantes(Integer cursoMaximoParticipantes) {
        this.cursoMaximoParticipantes = cursoMaximoParticipantes;
    }

    public Integer getCursoMaximoParticipantes() {
        return cursoMaximoParticipantes;
    }

    public void setIdControlCurso(String idControlCurso) {
        this.idControlCurso = idControlCurso;
    }

    public String getIdControlCurso() {
        return idControlCurso;
    }

    public void setCursoHorarioObser(String cursoHorarioObser) {
        this.cursoHorarioObser = cursoHorarioObser;
    }

    public String getCursoHorarioObser() {
        return cursoHorarioObser;
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
    public void setUrlSaveEvaluacionCurso(String urlSaveEvaluacionCurso) {
        this.urlSaveEvaluacionCurso = urlSaveEvaluacionCurso;
    }

    public String getUrlSaveEvaluacionCurso() {
        return urlSaveEvaluacionCurso;
    }

    public void setUrlValidateEvaluacionCurso(String urlValidateEvaluacionCurso) {
        this.urlValidateEvaluacionCurso = urlValidateEvaluacionCurso;
    }

    public String getUrlValidateEvaluacionCurso() {
        return urlValidateEvaluacionCurso;
    }

    public void setUrlCancelEvaluacionCurso(String urlCancelEvaluacionCurso) {
        this.urlCancelEvaluacionCurso = urlCancelEvaluacionCurso;
    }

    public String getUrlCancelEvaluacionCurso() {
        return urlCancelEvaluacionCurso;
    }

    public void setCursoParticipantes(Integer cursoParticipantes) {
        this.cursoParticipantes = cursoParticipantes;
    }

    public Integer getCursoParticipantes() {
        return cursoParticipantes;
    }

    public void setPostDataEvaluacionCurso(String postDataEvaluacionCurso) {
        this.postDataEvaluacionCurso = postDataEvaluacionCurso;
    }

    public String getPostDataEvaluacionCurso() {
        return postDataEvaluacionCurso;
    }

    public void setUrlTerminarCaptura(String urlTerminarCaptura) {
        this.urlTerminarCaptura = urlTerminarCaptura;
    }

    public String getUrlTerminarCaptura() {
        return urlTerminarCaptura;
    }

    public void setShowValidar(boolean showValidar) {
        this.showValidar = showValidar;
    }

    public boolean isShowValidar() {
        return showValidar;
    }

    public void setShowEditarCampos(boolean showEditarCampos) {
        this.showEditarCampos = showEditarCampos;
    }

    public boolean isShowEditarCampos() {
        return showEditarCampos;
    }

    public void setShowTerminarCaptura(boolean showTerminarCaptura) {
        this.showTerminarCaptura = showTerminarCaptura;
    }

    public boolean isShowTerminarCaptura() {
        return showTerminarCaptura;
    }

    public void setShowGuardar(boolean showGuardar) {
        this.showGuardar = showGuardar;
    }

    public boolean isShowGuardar() {
        return showGuardar;
    }
}
