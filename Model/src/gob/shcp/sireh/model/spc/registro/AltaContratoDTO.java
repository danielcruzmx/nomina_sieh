package gob.shcp.sireh.model.spc.registro;

import gob.shcp.fsn.model.Model;

import java.util.Date;
import java.util.List;

import org.springmodules.validation.bean.conf.loader.annotation.handler.ValidationMethod;

public class AltaContratoDTO implements java.io.Serializable, Model {

    // Datos del contrato
    private java.lang.Integer idContratoCurso;

    private String contratoCursoNumero;
    private String contratoCursoDesc;
    private Integer idTipoContratacion;
    private Integer contratoCursoCiclo;
    private String contratoCursoRep1;
    private String contratoCursoRep2;
    private String contratoCursoRep3;
    private String contratoCursoAdministrador;
    private Double contratoCursoMonto;
    private Date contratoCursoFechaAdjud;
    private Date contratoCursoFechaContr;
    private Integer idSituacionContrato;

    // Control
    private boolean registrar;
    private boolean editar;
    private String viewName;
    private boolean mostrarCursosFacturas;
    private boolean registrarCursos;
    private boolean registrarFacturas;
    private String seccion;
    private boolean bloquearEdicionContrato;
    
    // Roles
    private boolean rolAdministradorCapacitacion;
    private boolean rolAdministradorCertificacion;
    private boolean rolCoordinacionAdministrativa;
    private boolean rolOperadorCapacitacion;
    private boolean rolEjecutivoContratacion;
    
    // JSON
    private String postDataCursosContrato;
    private String postDataFacturasContrato;
    
    private List<String> estatusContratos; // Estatus soportados por interior
    
    // Metodos de acceso
    public void setContratoCursoNumero(String contratoCursoNumero) {
        this.contratoCursoNumero = contratoCursoNumero;
    }

    public String getContratoCursoNumero() {
        return contratoCursoNumero;
    }

    public void setContratoCursoCiclo(Integer contratoCursoCiclo) {
        this.contratoCursoCiclo = contratoCursoCiclo;
    }

    public Integer getContratoCursoCiclo() {
        return contratoCursoCiclo;
    }



    public void setContratoCursoAdministrador(String contratoCursoAdministrador) {
        this.contratoCursoAdministrador = contratoCursoAdministrador;
    }

    public String getContratoCursoAdministrador() {
        return contratoCursoAdministrador;
    }

    public void setContratoCursoMonto(Double contratoCursoMonto) {
        this.contratoCursoMonto = contratoCursoMonto;
    }

    public Double getContratoCursoMonto() {
        return contratoCursoMonto;
    }

    public void setIdSituacionContrato(Integer idSituacionContrato) {
        this.idSituacionContrato = idSituacionContrato;
    }

    public Integer getIdSituacionContrato() {
        return idSituacionContrato;
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

    public void setIdContratoCurso(Integer idContratoCurso) {
        this.idContratoCurso = idContratoCurso;
    }

    public Integer getIdContratoCurso() {
        return idContratoCurso;
    }
    
    public void setMostrarCursosFacturas(boolean mostrarCursosFacturas) {
        this.mostrarCursosFacturas = mostrarCursosFacturas;
    }

    public boolean isMostrarCursosFacturas() {
        return mostrarCursosFacturas;
    }
    
    public void setIdTipoContratacion(Integer idTipoContratacion) {
        this.idTipoContratacion = idTipoContratacion;
    }

    public Integer getIdTipoContratacion() {
        return idTipoContratacion;
    }
    
    public void setEstatusContratos(List<String> estatusContratos) {
        this.estatusContratos = estatusContratos;
    }

    public List<String> getEstatusContratos() {
        return estatusContratos;
    }
    
    public void setRegistrarCursos(boolean registrarCursos) {
        this.registrarCursos = registrarCursos;
    }

    public boolean isRegistrarCursos() {
        return registrarCursos;
    }

    public void setRegistrarFacturas(boolean registrarFacturas) {
        this.registrarFacturas = registrarFacturas;
    }

    public boolean isRegistrarFacturas() {
        return registrarFacturas;
    }
    
    public void setPostDataCursosContrato(String postDataCursosContrato) {
        this.postDataCursosContrato = postDataCursosContrato;
    }

    public String getPostDataCursosContrato() {
        return postDataCursosContrato;
    }

    public void setPostDataFacturasContrato(String postDataFacturasContrato) {
        this.postDataFacturasContrato = postDataFacturasContrato;
    }

    public String getPostDataFacturasContrato() {
        return postDataFacturasContrato;
    }
    
    public void setSeccion(String seccion) {
        this.seccion = seccion;
    }

    public String getSeccion() {
        return seccion;
    }
    
    public void setContratoCursoDesc(String contratoCursoDesc) {
        this.contratoCursoDesc = contratoCursoDesc;
    }

    public String getContratoCursoDesc() {
        return contratoCursoDesc;
    }
    
    public void setBloquearEdicionContrato(boolean bloquearEdicionContrato) {
        this.bloquearEdicionContrato = bloquearEdicionContrato;
    }

    public boolean isBloquearEdicionContrato() {
        return bloquearEdicionContrato;
    }
    
    // Validaciones
    @ValidationMethod(forProperty = "contratoCursoNumero", errorCode = "not.null")
    private boolean validateContratoCursoNumero() {
        if (this.isRegistrar() || (this.isEditar())) {
            return (this.getContratoCursoNumero() != null && !this.getContratoCursoNumero().equals(""));
        }
        return true;
    }
    
    @ValidationMethod(forProperty = "contratoCursoDesc", errorCode = "not.null")
    private boolean validateContratoCursoDesc() {
        if (this.isRegistrar() || (this.isEditar())) {
            return (this.getContratoCursoDesc() != null && !this.getContratoCursoDesc().equals(""));
        }
        return true;
    }
    
    @ValidationMethod(forProperty = "idTipoContratacion", errorCode = "not.null")
    private boolean validateIdTipoContratacion() {
        if (this.isRegistrar() || (this.isEditar())) {
            return (this.getIdTipoContratacion() != null && this.getIdTipoContratacion() > 0);
        }
        return true;
    }
    
    @ValidationMethod(forProperty = "contratoCursoRep1", errorCode = "not.null")
    private boolean validateContratoCursoRepresentante() {
        if (this.isRegistrar() || (this.isEditar())) {
            return (this.getContratoCursoRep1() != null && !this.getContratoCursoRep1().equals(""));
        }
        return true;
    }
    
    @ValidationMethod(forProperty = "contratoCursoAdministrador", errorCode = "not.null")
    private boolean validateContratoCursoAdministrador() {
        if (this.isRegistrar() || (this.isEditar())) {
            return (this.getContratoCursoAdministrador() != null && !this.getContratoCursoAdministrador().equals(""));
        }
        return true;
    }
    
    @ValidationMethod(forProperty = "contratoCursoMonto", errorCode = "not.null")
    private boolean validateContratoCursoMonto() {
        if (this.isRegistrar() || (this.isEditar())) {
            return (this.getContratoCursoMonto() != null && this.getContratoCursoMonto() > 0);
        }
        return true;
    }
    
    @ValidationMethod(forProperty = "contratoCursoFechaAdjud", errorCode = "not.null")
    private boolean validateContratoCursoFechaAdjud() {
        if (this.isRegistrar() || (this.isEditar())) {
            return (this.getContratoCursoFechaAdjud() != null);
        }
        return true;
    }
    
    @ValidationMethod(forProperty = "contratoCursoFechaContr", errorCode = "not.null")
    private boolean validateContratoCursoFechaContr() {
        if (this.isRegistrar() || (this.isEditar())) {
            return (this.getContratoCursoFechaContr() != null);
        }
        return true;
    }
    
    @ValidationMethod(forProperty = "idSituacionContrato", errorCode = "not.null")
    private boolean validateIdSituacionContrato() {
        if (this.isRegistrar() || (this.isEditar())) {
            return (this.getIdSituacionContrato() != null && this.getIdSituacionContrato() > 0);
        }
        return true;
    }

    public void setContratoCursoRep1(String contratoCursoRep1) {
        this.contratoCursoRep1 = contratoCursoRep1;
    }

    public String getContratoCursoRep1() {
        return contratoCursoRep1;
    }

    public void setContratoCursoRep2(String contratoCursoRep2) {
        this.contratoCursoRep2 = contratoCursoRep2;
    }

    public String getContratoCursoRep2() {
        return contratoCursoRep2;
    }

    public void setContratoCursoRep3(String contratoCursoRep3) {
        this.contratoCursoRep3 = contratoCursoRep3;
    }

    public String getContratoCursoRep3() {
        return contratoCursoRep3;
    }

    public void setContratoCursoFechaAdjud(Date contratoCursoFechaAdjud) {
        this.contratoCursoFechaAdjud = contratoCursoFechaAdjud;
    }

    public Date getContratoCursoFechaAdjud() {
        return contratoCursoFechaAdjud;
    }

    public void setContratoCursoFechaContr(Date contratoCursoFechaContr) {
        this.contratoCursoFechaContr = contratoCursoFechaContr;
    }

    public Date getContratoCursoFechaContr() {
        return contratoCursoFechaContr;
    }
}
