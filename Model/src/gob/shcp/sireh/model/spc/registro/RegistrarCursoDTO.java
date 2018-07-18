package gob.shcp.sireh.model.spc.registro;

import gob.shcp.fsn.model.Model;

import java.util.List;

import org.springmodules.validation.bean.conf.loader.annotation.handler.ValidationMethod;

public class RegistrarCursoDTO implements java.io.Serializable, Model {

    // Tipo de curso
    private String tipoCurso;
    private String anioOperacion;

    // Datos del curso
    private String idCoordinacion;
    private String idEjeTematico;
    private String idSubprograma;
    private Integer idModalidad;
    private Integer idFinalidad;
    private String idCapacidadCert;
    private Integer idCaracter;
    private String idControlCurso;
    private String descControlCurso;
    
    private String idEjeTematicoCertificacion;
    private String idSubprogramaCertificacion;

    private String idCursoPrincipal;
    private String claveCurso;

    private java.lang.Float duracion;
    private Double presupuesto;
    private Integer noParticipantes;

    // Certificación
    private String claveCertificacion;
    private String tipoCapacidad;
    private Integer nivelCurso;
    private String rfcOperDgrh;
    private String supervisorInstEducat;
    
    // Calendarizacion
    private String cursoFecIni;
    private String cursoFecFin;
    private String descSede;
    private String descAula;
    private String descHorario;
    private String cursoMinimoParticipantes;
     
    // Proveedor
    private String tipoInstEducat;
    private String proveedor;
    private Integer situacionProveedor;
    private List<String> situaciones; // Situaciones validad de acuerdo al estatus del proveedor

    // Control
    private boolean registrar;
    private boolean editar;
    private String viewName;
    private Integer idCursoEditar;
    private String path;
    private boolean validacion;
    
    // Roles
    private boolean rolAdministradorCapacitacion;
    private boolean rolAdministradorCertificacion;
    private boolean rolCoordinacionAdministrativa;
    private boolean rolOperadorCapacitacion;
    private boolean rolEjecutivoContratacion;

    // Metodos de acceso
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

    public void setIdFinalidad(Integer idFinalidad) {
        this.idFinalidad = idFinalidad;
    }

    public Integer getIdFinalidad() {
        return idFinalidad;
    }
    
    public void setIdCapacidadCert(String idCapacidadCert) {
        this.idCapacidadCert = idCapacidadCert;
    }

    public String getIdCapacidadCert() {
        return idCapacidadCert;
    }
    
    public void setIdCaracter(Integer idCaracter) {
        this.idCaracter = idCaracter;
    }

    public Integer getIdCaracter() {
        return idCaracter;
    }

    public void setIdEjeTematicoCertificacion(String idEjeTematicoCertificacion) {
        this.idEjeTematicoCertificacion = idEjeTematicoCertificacion;
    }

    public String getIdEjeTematicoCertificacion() {
        return idEjeTematicoCertificacion;
    }

    public void setIdSubprogramaCertificacion(String idSubprogramaCertificacion) {
        this.idSubprogramaCertificacion = idSubprogramaCertificacion;
    }

    public String getIdSubprogramaCertificacion() {
        return idSubprogramaCertificacion;
    }

    public void setIdCursoPrincipal(String idCursoPrincipal) {
        this.idCursoPrincipal = idCursoPrincipal;
    }

    public String getIdCursoPrincipal() {
        return idCursoPrincipal;
    }

    public void setClaveCurso(String claveCurso) {
        this.claveCurso = claveCurso;
    }

    public String getClaveCurso() {
        return claveCurso;
    }

    public void setDuracion(java.lang.Float duracion) {
        this.duracion = duracion;
    }

    public java.lang.Float getDuracion() {
        return duracion;
    }

    public void setPresupuesto(Double presupuesto) {
        this.presupuesto = presupuesto;
    }

    public Double getPresupuesto() {
        return presupuesto;
    }

    public void setNoParticipantes(Integer noParticipantes) {
        this.noParticipantes = noParticipantes;
    }

    public Integer getNoParticipantes() {
        return noParticipantes;
    }

    public void setClaveCertificacion(String claveCertificacion) {
        this.claveCertificacion = claveCertificacion;
    }

    public String getClaveCertificacion() {
        return claveCertificacion;
    }

    public void setTipoCapacidad(String tipoCapacidad) {
        this.tipoCapacidad = tipoCapacidad;
    }

    public String getTipoCapacidad() {
        return tipoCapacidad;
    }

    public void setNivelCurso(Integer nivelCurso) {
        this.nivelCurso = nivelCurso;
    }

    public Integer getNivelCurso() {
        return nivelCurso;
    }

    public void setRfcOperDgrh(String rfcOperDgrh) {
        this.rfcOperDgrh = rfcOperDgrh;
    }

    public String getRfcOperDgrh() {
        return rfcOperDgrh;
    }

    public void setSupervisorInstEducat(String supervisorInstEducat) {
        this.supervisorInstEducat = supervisorInstEducat;
    }

    public String getSupervisorInstEducat() {
        return supervisorInstEducat;
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

    public void setDescHorario(String descHorario) {
        this.descHorario = descHorario;
    }

    public String getDescHorario() {
        return descHorario;
    }

    public void setCursoMinimoParticipantes(String cursoMinimoParticipantes) {
        this.cursoMinimoParticipantes = cursoMinimoParticipantes;
    }

    public String getCursoMinimoParticipantes() {
        return cursoMinimoParticipantes;
    }

    public void setTipoInstEducat(String tipoInstEducat) {
        this.tipoInstEducat = tipoInstEducat;
    }

    public String getTipoInstEducat() {
        return tipoInstEducat;
    }

    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
    }

    public String getProveedor() {
        return proveedor;
    }

    public void setSituacionProveedor(Integer situacionProveedor) {
        this.situacionProveedor = situacionProveedor;
    }

    public Integer getSituacionProveedor() {
        return situacionProveedor;
    }

    public void setSituaciones(List<String> situaciones) {
        this.situaciones = situaciones;
    }

    public List<String> getSituaciones() {
        return situaciones;
    }

    public void setRegistrar(boolean registrar) {
        this.registrar = registrar;
    }

    public boolean isRegistrar() {
        return registrar;
    }

    public void setEditar(boolean editar) {
        this.editar = editar;
    }

    public boolean isEditar() {
        return editar;
    }

    public void setViewName(String viewName) {
        this.viewName = viewName;
    }

    public String getViewName() {
        return viewName;
    }

    public void setIdCursoEditar(Integer idCursoEditar) {
        this.idCursoEditar = idCursoEditar;
    }

    public Integer getIdCursoEditar() {
        return idCursoEditar;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getPath() {
        return path;
    }

    public void setValidacion(boolean validacion) {
        this.validacion = validacion;
    }

    public boolean isValidacion() {
        return validacion;
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
    
    public void setIdControlCurso(String idControlCurso) {
        this.idControlCurso = idControlCurso;
    }

    public String getIdControlCurso() {
        return idControlCurso;
    }
    
    public void setDescControlCurso(String descControlCurso) {
        this.descControlCurso = descControlCurso;
    }

    public String getDescControlCurso() {
        return descControlCurso;
    }
    
    // Validaciones
    @ValidationMethod(forProperty = "tipoCurso", errorCode = "not.null")
    public boolean validatRequired() {
        if (this.isRegistrar() || this.isEditar()) {
            if (this.getTipoCurso() != null && !this.getTipoCurso().equals("")) {
                this.setValidacion(true);
                return true;
            } else {
                this.setValidacion(true);
                return false;
            }
        }
        return true;
    }

    @ValidationMethod(forProperty = "idCoordinacion", errorCode = "not.null")
    public boolean validateIdCoordinacionRequired() {
        if (this.isRegistrar() || this.isEditar()) {
            if (this.getIdCoordinacion() != null && !this.getIdCoordinacion().equals("")) {
                this.setValidacion(true);
                return true;
            } else {
                this.setValidacion(true);
                return false;
            }
        }
        return true;
    }

    @ValidationMethod(forProperty = "idEjeTematico", errorCode = "not.null")
    public boolean validateIdEjeTematicoRequired() {
        if (this.isRegistrar() || this.isEditar()) {
            if (this.getIdEjeTematico() != null && !this.getIdEjeTematico().equals("")) {
                this.setValidacion(true);
                return true;
            } else {
                this.setValidacion(true);
                return false;
            }
        }
        return true;
    }

    @ValidationMethod(forProperty = "idSubprograma", errorCode = "not.null")
    public boolean validateIdSubprogramaRequired() {
        if (this.isRegistrar() || this.isEditar()) {
            if (this.getIdSubprograma() != null && !this.getIdSubprograma().equals("")) {
                this.setValidacion(true);
                return true;
            } else {
                this.setValidacion(true);
                return false;
            }
        }
        return true;
    }

    /*@ValidationMethod(forProperty = "idModalidad", errorCode = "not.null")
    public boolean validateIdModalidadRequired() {
        if (this.isRegistrar() || this.isEditar()) {
            if (this.getIdModalidad() != null && this.getIdModalidad() > 0) {
                this.setValidacion(true);
                return true;
            } else {
                this.setValidacion(true);
                return false;
            }
        }
        return true;
    }

    @ValidationMethod(forProperty = "idFinalidad", errorCode = "not.null")
    public boolean validateIdFinalidadRequired() {
        if (this.isRegistrar() || this.isEditar()) {
            if (this.getIdFinalidad() != null && this.getIdFinalidad() != 0) {
                this.setValidacion(true);
                return true;
            } else {
                this.setValidacion(true);
                return false;
            }
        }
        return true;
    }

    @ValidationMethod(forProperty = "idCaracter", errorCode = "not.null")
    public boolean validateIdCaracterRequired() {
        if (this.isRegistrar() || this.isEditar()) {
            if (this.getIdCaracter() != null && this.getIdCaracter() != 0) {
                this.setValidacion(true);
                return true;
            } else {
                this.setValidacion(true);
                return false;
            }
        }
        return true;
    }

    @ValidationMethod(forProperty = "idCursoPrincipal", errorCode = "not.null")
    public boolean validateIdCursoPrincipalRequired() {
        if (this.isRegistrar() || this.isEditar()) {
            if (this.getIdCursoPrincipal() != null && !this.getIdCursoPrincipal().equals("")) {
                this.setValidacion(true);
                return true;
            } else {
                this.setValidacion(true);
                return false;
            }
        }
        return true;
    }*/
    
    @ValidationMethod(forProperty = "claveCurso", errorCode = "not.null")
    public boolean validateClaveCursoRequired() {
        if (this.isRegistrar() || this.isEditar()) {
            if (this.getClaveCurso() != null && !this.getClaveCurso().equals("")) {
                this.setValidacion(true);
                return true;
            } else {
                this.setValidacion(true);
                return false;
            }
        }
        return true;
    }
    
    @ValidationMethod(forProperty = "duracion", errorCode = "not.null")
    public boolean validateDuracionRequired() {
        if (this.isRegistrar() || this.isEditar()) {
            if (this.getDuracion() != null && !this.getDuracion().toString().equals("") && this.getDuracion() % 0.5 == 0) {
                this.setValidacion(true);
                return true;
            } else {
                this.setValidacion(true);
                return false;
            }
        }
        return true;
    }
    
    @ValidationMethod(forProperty = "presupuesto", errorCode = "not.null")
    public boolean validatePresupuestoRequired() {
        if (this.isRegistrar() || this.isEditar()) {
            if (this.getPresupuesto() != null) {
                this.setValidacion(true);
                return true;
            } else {
                this.setValidacion(true);
                return false;
            }
        }
        return true;
    }
    
    @ValidationMethod(forProperty = "rfcOperDgrh", errorCode = "not.null")
    public boolean validategetRfcOperDgrhRequired() {
        if (this.isRegistrar() || this.isEditar()) {
            if (this.getRfcOperDgrh() != null && !this.getRfcOperDgrh().equals("")) {
                this.setValidacion(true);
                return true;
            } else {
                this.setValidacion(true);
                return false;
            }
        }
        return true;
    }
    
    @ValidationMethod(forProperty = "tipoInstEducat", errorCode = "not.null")
    public boolean validateTipoInstEducatRequired() {
        if (this.isRegistrar() || this.isEditar()) {
            if (this.getTipoInstEducat() != null && !this.getTipoInstEducat().equals("")) {
                this.setValidacion(true);
                return true;
            } else {
                this.setValidacion(true);
                return false;
            }
        }
        return true;
    }
    
    @ValidationMethod(forProperty = "proveedor", errorCode = "not.null")
    public boolean validateProveedorRequired() {
        if (this.isRegistrar() || this.isEditar()) {
            if (this.getProveedor() != null && !this.getProveedor().equals("")) {
                this.setValidacion(true);
                return true;
            } else {
                this.setValidacion(true);
                return false;
            }
        }
        return true;
    }
    
    @ValidationMethod(forProperty = "situacionProveedor", errorCode = "not.null")
    public boolean validateSituacionProveedorRequired() {
        if (this.isRegistrar() || this.isEditar()) {
            if (this.getSituacionProveedor() != null && this.getSituacionProveedor() > 0) {
                this.setValidacion(true);
                return true;
            } else {
                this.setValidacion(true);
                return false;
            }
        }
        return true;
    }
}
