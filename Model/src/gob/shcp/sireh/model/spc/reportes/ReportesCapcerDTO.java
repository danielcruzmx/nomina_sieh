package gob.shcp.sireh.model.spc.reportes;

import gob.shcp.fsn.model.Model;

import gob.shcp.sireh.model.clc.EtiquetaClaveValorEntero;

import java.util.ArrayList;
import org.springmodules.validation.bean.conf.loader.annotation.handler.ValidationMethod;

public class ReportesCapcerDTO implements java.io.Serializable, Model {

    // Filtros
    private java.lang.String tipoBusqueda;
    
    private java.lang.Integer cicloEjeTematico;    
    private java.lang.String idSubprograma;
    private java.lang.String idEjeTematico;
    private java.lang.String idModalidad;
    private java.lang.Integer idCurso;
    private java.lang.Integer cicloEjeTematico2;
    private java.lang.String cursoClave;
    private java.lang.String idUnidadCoord;
    private java.lang.Integer sesionesCurso;
    private java.lang.Integer trimestre;
    private java.lang.String fechaIni;
    private java.lang.String fechaFin;
    private java.lang.String quincena;
    private ArrayList<EtiquetaClaveValorEntero> trimestresValores;
    private java.lang.String rfcParticipante;
    private java.lang.String rfcParticipanteInput;
    private java.lang.String tipo;

    //Control de Acceso
    private java.lang.Boolean rolAdministradorCapacitacion;
    private java.lang.Boolean rolOperadorCapacitacion;

    // Control
    private boolean cancel;
    private boolean muestraReporte;
    private boolean validacion;
    
    // Busqueda
    private java.lang.Integer cicloEjeTematicoBusqueda; 
    private java.lang.Integer idCursoBusqueda;
    
    // Validaciones
    private java.lang.Boolean cicloEjeTematicoRequired;
    private java.lang.Boolean idSubprogramaRequired;
    private java.lang.Boolean idEjeTematicoRequired;
    private java.lang.Boolean idModalidadRequired;
    private java.lang.Boolean idCursoRequired;
    
    // Metodos de acceso
    
    public void setTipoBusqueda(String tipoBusqueda) {
        this.tipoBusqueda = tipoBusqueda;
    }

    public String getTipoBusqueda() {
        return tipoBusqueda;
    }

    public void setCicloEjeTematico(Integer cicloEjeTematico) {
        this.cicloEjeTematico = cicloEjeTematico;
    }

    public Integer getCicloEjeTematico() {
        return cicloEjeTematico;
    }

    public void setIdSubprograma(String idSubprograma) {
        this.idSubprograma = idSubprograma;
    }

    public String getIdSubprograma() {
        return idSubprograma;
    }

    public void setIdEjeTematico(String idEjeTematico) {
        this.idEjeTematico = idEjeTematico;
    }

    public String getIdEjeTematico() {
        return idEjeTematico;
    }

    public void setIdModalidad(String idModalidad) {
        this.idModalidad = idModalidad;
    }

    public String getIdModalidad() {
        return idModalidad;
    }

    public void setIdCurso(Integer idCurso) {
        this.idCurso = idCurso;
    }

    public Integer getIdCurso() {
        return idCurso;
    }

    public void setCicloEjeTematico2(Integer cicloEjeTematico2) {
        this.cicloEjeTematico2 = cicloEjeTematico2;
    }

    public Integer getCicloEjeTematico2() {
        return cicloEjeTematico2;
    }

    public void setCursoClave(String cursoClave) {
        this.cursoClave = cursoClave;
    }

    public String getCursoClave() {
        return cursoClave;
    }

    public void setCancel(boolean cancel) {
        this.cancel = cancel;
    }

    public boolean isCancel() {
        return cancel;
    }

    public void setMuestraReporte(boolean muestraReporte) {
        this.muestraReporte = muestraReporte;
    }

    public boolean isMuestraReporte() {
        return muestraReporte;
    }

    public void setCicloEjeTematicoBusqueda(Integer cicloEjeTematicoBusqueda) {
        this.cicloEjeTematicoBusqueda = cicloEjeTematicoBusqueda;
    }

    public Integer getCicloEjeTematicoBusqueda() {
        return cicloEjeTematicoBusqueda;
    }

    public void setIdCursoBusqueda(Integer idCursoBusqueda) {
        this.idCursoBusqueda = idCursoBusqueda;
    }

    public Integer getIdCursoBusqueda() {
        return idCursoBusqueda;
    }

    public void setCicloEjeTematicoRequired(Boolean cicloEjeTematicoRequired) {
        this.cicloEjeTematicoRequired = cicloEjeTematicoRequired;
    }

    public Boolean getCicloEjeTematicoRequired() {
        return cicloEjeTematicoRequired;
    }

    public void setIdSubprogramaRequired(Boolean idSubprogramaRequired) {
        this.idSubprogramaRequired = idSubprogramaRequired;
    }

    public Boolean getIdSubprogramaRequired() {
        return idSubprogramaRequired;
    }

    public void setIdEjeTematicoRequired(Boolean idEjeTematicoRequired) {
        this.idEjeTematicoRequired = idEjeTematicoRequired;
    }

    public Boolean getIdEjeTematicoRequired() {
        return idEjeTematicoRequired;
    }

    public void setIdModalidadRequired(Boolean idModalidadRequired) {
        this.idModalidadRequired = idModalidadRequired;
    }

    public Boolean getIdModalidadRequired() {
        return idModalidadRequired;
    }

    public void setIdCursoRequired(Boolean idCursoRequired) {
        this.idCursoRequired = idCursoRequired;
    }

    public Boolean getIdCursoRequired() {
        return idCursoRequired;
    }
    
    public boolean isValidacion() {
        return validacion;
    }

    public void setValidacion(boolean validacion) {
        this.validacion = validacion;
    }

    public void setIdUnidadCoord(String idUnidadCoord) {
        this.idUnidadCoord = idUnidadCoord;
    }

    public String getIdUnidadCoord() {
        return idUnidadCoord;
    }

    public void setRolAdministradorCapacitacion(Boolean rolAdministradorCapacitacion) {
        this.rolAdministradorCapacitacion = rolAdministradorCapacitacion;
    }

    public Boolean getRolAdministradorCapacitacion() {
        return rolAdministradorCapacitacion;
    }

    public void setRolOperadorCapacitacion(Boolean rolOperadorCapacitacion) {
        this.rolOperadorCapacitacion = rolOperadorCapacitacion;
    }

    public Boolean getRolOperadorCapacitacion() {
        return rolOperadorCapacitacion;
    }

    public void setSesionesCurso(Integer sesionesCurso) {
        this.sesionesCurso = sesionesCurso;
    }

    public Integer getSesionesCurso() {
        return sesionesCurso;
    }


    public void setTrimestre(Integer trimestre) {
        this.trimestre = trimestre;
    }

    public Integer getTrimestre() {
        return trimestre;
    }
	
	public void setTrimestresValores(ArrayList<EtiquetaClaveValorEntero> trimestresValores) {
        this.trimestresValores = trimestresValores;
    }

    public ArrayList<EtiquetaClaveValorEntero> getTrimestresValores() {
        return trimestresValores;
    }

    public void setFechaIni(String fechaIni) {
        this.fechaIni = fechaIni;
    }

    public String getFechaIni() {
        return fechaIni;
    }

    public void setFechaFin(String fechaFin) {
        this.fechaFin = fechaFin;
    }

    public String getFechaFin() {
        return fechaFin;
    }
    
    // Validaciones
   /* @ValidationMethod(forProperty = "cicloEjeTematico", errorCode = "not.null")
    public boolean validatecicloEjeTematicoRequired() {
        if (this.isMuestraReporte()) {
            return (this.cicloEjeTematico != null && this.cicloEjeTematico > 0);
        }
        return true;
    }*/

    public void setRfcParticipante(String rfcParticipante) {
        this.rfcParticipante = rfcParticipante;
    }

    public String getRfcParticipante() {
        return rfcParticipante;
    }

    public void setRfcParticipanteInput(String rfcParticipanteInput) {
        this.rfcParticipanteInput = rfcParticipanteInput;
    }

    public String getRfcParticipanteInput() {
        return rfcParticipanteInput;
    }

    public void setQuincena(String quincena) {
        this.quincena = quincena;
    }

    public String getQuincena() {
        return quincena;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }
}
