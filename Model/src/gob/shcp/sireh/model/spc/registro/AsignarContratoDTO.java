package gob.shcp.sireh.model.spc.registro;

import gob.shcp.fsn.model.Model;

import java.util.Date;

import org.springmodules.validation.bean.conf.loader.annotation.handler.ValidationMethod;

public class AsignarContratoDTO implements java.io.Serializable, Model {
    
    private Integer idCursoEditar;
    private Integer anioOperacion;
    
    // Tipo de curso
    private String tipoCurso;
    private String tipoCursoDescripcion;

    // Datos del curso
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
    private java.lang.String idProveedor;
    private java.lang.String descProveedor;
    private java.util.Date cursoFecFin;
    private java.util.Date cursoFecIni;
    private java.lang.String cursoFecIniFormat;
    private java.lang.String cursoFecFinFormat;
    private java.lang.String idSede;
    private java.lang.String descSede;
    private java.lang.String idAula;
    private java.lang.String descAula;
    private java.lang.String idHorarioCurso;
    private java.lang.String descHorarioCurso;
    private java.lang.Integer cursoMinimoParticipantes;
    private java.lang.Integer idSituacionContrato;
    
    // Configuracion inicial
    private String beanName; // beanName del PagedList

    // Navegacion
    private String urlOrigen;
    private String urlDestino;
    
    // Control
    private boolean registrar;
    private boolean editar;
    private String viewName;
    private String path;
    
    // Roles
    private boolean rolAdministradorCapacitacion;
    private boolean rolAdministradorCertificacion;
    private boolean rolCoordinacionAdministrativa;
    private boolean rolOperadorCapacitacion;
    private boolean rolEjecutivoContratacion;
    
    // Contrato
    private String[] idContratos;
    
    // Factura
    private String facturaFolio;
    private Double facturaMonto;
    private Date facturaFechaPago;
    private Integer idSituacionFactura;
    
    //Metodos de acceso
    public void setTipoCurso(String tipoCurso) {
        this.tipoCurso = tipoCurso;
    }

    public String getTipoCurso() {
        return tipoCurso;
    }

    public void setAnioOperacion(Integer anioOperacion) {
        this.anioOperacion = anioOperacion;
    }

    public Integer getAnioOperacion() {
        return anioOperacion;
    }

    public void setTipoCursoDescripcion(String tipoCursoDescripcion) {
        this.tipoCursoDescripcion = tipoCursoDescripcion;
    }

    public String getTipoCursoDescripcion() {
        return tipoCursoDescripcion;
    }

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

    public void setIdProveedor(String idProveedor) {
        this.idProveedor = idProveedor;
    }

    public String getIdProveedor() {
        return idProveedor;
    }

    public void setDescProveedor(String descProveedor) {
        this.descProveedor = descProveedor;
    }

    public String getDescProveedor() {
        return descProveedor;
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

    public void setIdSituacionContrato(Integer idSituacionContrato) {
        this.idSituacionContrato = idSituacionContrato;
    }

    public Integer getIdSituacionContrato() {
        return idSituacionContrato;
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

    public void setIdContratos(String[] idContratos) {
        this.idContratos = idContratos;
    }

    public String[] getIdContratos() {
        return idContratos;
    }

    public void setFacturaFolio(String facturaFolio) {
        this.facturaFolio = facturaFolio;
    }

    public String getFacturaFolio() {
        return facturaFolio;
    }

    public void setFacturaMonto(Double facturaMonto) {
        this.facturaMonto = facturaMonto;
    }

    public Double getFacturaMonto() {
        return facturaMonto;
    }

    public void setFacturaFechaPago(Date facturaFechaPago) {
        this.facturaFechaPago = facturaFechaPago;
    }

    public Date getFacturaFechaPago() {
        return facturaFechaPago;
    }

    public void setIdSituacionFactura(Integer idSituacionFactura) {
        this.idSituacionFactura = idSituacionFactura;
    }

    public Integer getIdSituacionFactura() {
        return idSituacionFactura;
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
    
    public void setPath(String path) {
        this.path = path;
    }

    public String getPath() {
        return path;
    }
    
    public void setIdCursoEditar(Integer idCursoEditar) {
        this.idCursoEditar = idCursoEditar;
    }

    public Integer getIdCursoEditar() {
        return idCursoEditar;
    }
    
    // Validaciones
    @ValidationMethod(forProperty = "idContratos", errorCode = "error.contrato.unselected")
    private boolean validateIdContratos() {
        if (this.isRegistrar() || (this.isEditar())) {
            return (this.getIdContratos() != null && this.getIdContratos().length > 0);
        }
        return true;
    }
    
    @ValidationMethod(forProperty = "facturaFolio", errorCode = "not.null")
    private boolean validateFacturaFolio() {
        if (this.isRegistrar() || (this.isEditar())) {
            return (this.getFacturaFolio() != null && !this.getFacturaFolio().equals(""));
        }
        return true;
    }
    
    @ValidationMethod(forProperty = "facturaMonto", errorCode = "not.null")
    private boolean validateFacturaMonto() {
        if (this.isRegistrar() || (this.isEditar())) {
            return (this.getFacturaMonto() != null && this.getFacturaMonto() > 0);
        }
        return true;
    }
    
    @ValidationMethod(forProperty = "facturaFechaPago", errorCode = "not.null")
    private boolean validateFechaPago() {
        if (this.isRegistrar() || (this.isEditar())) {
            return (this.getFacturaFechaPago() != null);
        }
        return true;
    }
}
