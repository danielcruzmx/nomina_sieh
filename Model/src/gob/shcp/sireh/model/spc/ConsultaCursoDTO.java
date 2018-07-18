package gob.shcp.sireh.model.spc;

import gob.shcp.fsn.model.Model;

import java.util.Date;
import java.util.List;

import org.springmodules.validation.bean.conf.loader.annotation.handler.ValidationMethod;

public class ConsultaCursoDTO implements java.io.Serializable, Model {

    // Filtros
    private String idCoordinacion;
    private String idProveedor;
    private String rfcOperDgrh;
    private String idEjeTematico;
    private String idSubprograma;
    private Integer idModalidad;
    private Integer idFinalidad;
    private String claveCurso;
    private java.util.Date cursoFecIni;
    private java.util.Date cursoFecFin;
    
    private java.lang.String cursoFecIniTxt;
    private java.lang.String cursoFecFinTxt;
    
    private String idControlCurso; // Estatus del curso

    // Configuracion inicial
    private List<String> estatusCursos; // Estatus soportados por interior
    private String control; // Control de interior
    private String interior; // Nombre del interior
    private String beanName; // beanName del PagedList
    
    // Edicion
    private String linkDestino; // Propiedades para edicion
    private String paramIdDestino; // Propiedades para edicion
    private String propertyDestino; // Propiedades para edicion

    // Navegacion
    private String urlOrigen;
    private String urlDestino;
    private String urlRegistroCurso;
    private String urlDeleteRegistroCurso;
    private String urlInscribirParticipante;
    private String urlCancelarParticipante;
    
    // Control
    private boolean cancel;
    private boolean muestraRegistros;

    // Roles
    private boolean rolAdministradorCapacitacion;
    private boolean rolAdministradorCertificacion;
    private boolean rolCoordinacionAdministrativa;
    private boolean rolOperadorCapacitacion;
    private boolean rolEjecutivoContratacion;

    // Eliminar cursos
    private boolean eliminarCursos;
    private Integer[] idCursos;

    // Metodos de acceso
    public void setIdCoordinacion(String idCoordinacion) {
        this.idCoordinacion = idCoordinacion;
    }

    public String getIdCoordinacion() {
        return idCoordinacion;
    }

    public void setIdEjeTematico(String idEjeTematico) {
        this.idEjeTematico = idEjeTematico;
    }

    public String getIdEjeTematico() {
        return idEjeTematico;
    }

    public void setIdSubprograma(String idSubprograma) {
        this.idSubprograma = idSubprograma;
    }

    public String getIdSubprograma() {
        return idSubprograma;
    }

    public void setIdModalidad(Integer idModalidad) {
        this.idModalidad = idModalidad;
    }

    public Integer getIdModalidad() {
        return idModalidad;
    }

    public void setClaveCurso(String claveCurso) {
        this.claveCurso = claveCurso;
    }

    public String getClaveCurso() {
        return claveCurso;
    }

    public void setIdControlCurso(String idControlCurso) {
        this.idControlCurso = idControlCurso;
    }

    public String getIdControlCurso() {
        return idControlCurso;
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

    public void setEliminarCursos(boolean eliminarCursos) {
        this.eliminarCursos = eliminarCursos;
    }

    public boolean isEliminarCursos() {
        return eliminarCursos;
    }

    public void setIdCursos(Integer[] idCursos) {
        this.idCursos = idCursos;
    }

    public Integer[] getIdCursos() {
        return idCursos;
    }

    public void setInterior(String interior) {
        this.interior = interior;
    }

    public String getInterior() {
        return interior;
    }

    public void setEstatusCursos(List<String> estatusCursos) {
        this.estatusCursos = estatusCursos;
    }

    public List<String> getEstatusCursos() {
        return estatusCursos;
    }

    public void setLinkDestino(String linkDestino) {
        this.linkDestino = linkDestino;
    }

    public String getLinkDestino() {
        return linkDestino;
    }

    public void setParamIdDestino(String paramIdDestino) {
        this.paramIdDestino = paramIdDestino;
    }

    public String getParamIdDestino() {
        return paramIdDestino;
    }

    public void setPropertyDestino(String propertyDestino) {
        this.propertyDestino = propertyDestino;
    }

    public String getPropertyDestino() {
        return propertyDestino;
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
    
    public void setIdFinalidad(Integer idFinalidad) {
        this.idFinalidad = idFinalidad;
    }

    public Integer getIdFinalidad() {
        return idFinalidad;
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
    
    public void setControl(String control) {
        this.control = control;
    }

    public String getControl() {
        return control;
    }
    
    public void setIdProveedor(String idProveedor) {
        this.idProveedor = idProveedor;
    }

    public String getIdProveedor() {
        return idProveedor;
    }

    public void setRfcOperDgrh(String rfcOperDgrh) {
        this.rfcOperDgrh = rfcOperDgrh;
    }

    public String getRfcOperDgrh() {
        return rfcOperDgrh;
    }
    
    public void setCursoFecIniTxt(String cursoFecIniTxt) {
        this.cursoFecIniTxt = cursoFecIniTxt;
    }

    public String getCursoFecIniTxt() {
        return cursoFecIniTxt;
    }

    public void setCursoFecFinTxt(String cursoFecFinTxt) {
        this.cursoFecFinTxt = cursoFecFinTxt;
    }

    public String getCursoFecFinTxt() {
        return cursoFecFinTxt;
    }
    
    // Validaciones
    @ValidationMethod(forProperty = "idCursos", errorCode = "error.delete.unselected")
    private boolean validateIdCursos() {
        if (this.isEliminarCursos()) {
            return (this.getIdCursos() != null && this.getIdCursos().length > 0);
        }
        return true;
    }
}
