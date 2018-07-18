package gob.shcp.sireh.model.spc.registro;

import gob.shcp.fsn.model.Model;

import java.util.List;

import org.springmodules.validation.bean.conf.loader.annotation.handler.ValidationMethod;

public class ConsultaContratoDTO implements java.io.Serializable, Model {

    // Filtros
    private Integer idContratoCurso;
    private Integer contratoCursoCiclo;
    private String idProveedor;
    private Integer idTipoContratacion;
    private Integer idSituacionContrato;

    // Configuracion inicial
    private List<String> estatusContratos; // Estatus soportados por interior
    private String beanName; // beanName del PagedList

    // Navegacion
    private String urlOrigen;
    private String urlDestino;
    private String urlAltaContrato;
    private String urlEditContrato;
    private String urlDeleteContrato;

    // Control
    private boolean cancel;
    private boolean muestraRegistros;

    // Roles
    private boolean rolAdministradorCapacitacion;
    private boolean rolAdministradorCertificacion;
    private boolean rolCoordinacionAdministrativa;
    private boolean rolOperadorCapacitacion;
    private boolean rolEjecutivoContratacion;

    // Eliminar contratos
    private boolean eliminarContratos;
    private Integer[] idContratos;

    // Metodos de acceso
    public void setIdContratoCurso(Integer idContratoCurso) {
        this.idContratoCurso = idContratoCurso;
    }

    public Integer getIdContratoCurso() {
        return idContratoCurso;
    }

    public void setContratoCursoCiclo(Integer contratoCursoCiclo) {
        this.contratoCursoCiclo = contratoCursoCiclo;
    }

    public Integer getContratoCursoCiclo() {
        return contratoCursoCiclo;
    }

    public void setIdProveedor(String idProveedor) {
        this.idProveedor = idProveedor;
    }

    public String getIdProveedor() {
        return idProveedor;
    }

    public void setIdSituacionContrato(Integer idSituacionContrato) {
        this.idSituacionContrato = idSituacionContrato;
    }

    public Integer getIdSituacionContrato() {
        return idSituacionContrato;
    }

    public void setEstatusContratos(List<String> estatusContratos) {
        this.estatusContratos = estatusContratos;
    }

    public List<String> getEstatusContratos() {
        return estatusContratos;
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

    public void setUrlAltaContrato(String urlAltaContrato) {
        this.urlAltaContrato = urlAltaContrato;
    }

    public String getUrlAltaContrato() {
        return urlAltaContrato;
    }

    public void setUrlEditContrato(String urlEditContrato) {
        this.urlEditContrato = urlEditContrato;
    }

    public String getUrlEditContrato() {
        return urlEditContrato;
    }

    public void setUrlDeleteContrato(String urlDeleteContrato) {
        this.urlDeleteContrato = urlDeleteContrato;
    }

    public String getUrlDeleteContrato() {
        return urlDeleteContrato;
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

    public void setEliminarContratos(boolean eliminarContratos) {
        this.eliminarContratos = eliminarContratos;
    }

    public boolean isEliminarContratos() {
        return eliminarContratos;
    }

    public void setIdContratos(Integer[] idContratos) {
        this.idContratos = idContratos;
    }

    public Integer[] getIdContratos() {
        return idContratos;
    }
    
    public void setIdTipoContratacion(Integer idTipoContratacion) {
        this.idTipoContratacion = idTipoContratacion;
    }

    public Integer getIdTipoContratacion() {
        return idTipoContratacion;
    }
    
    /* V A L I D A C I O N E S */
    @ValidationMethod(forProperty="idContratos", errorCode="error.delete.unselected")
    private boolean validateIdContratos() {
        if(this.isEliminarContratos()) {
            return (this.getIdContratos() != null && this.getIdContratos().length > 0);
        }
        return true;
    }
}
