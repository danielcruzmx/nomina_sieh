package gob.shcp.sireh.model.spc.seguimiento;

import gob.shcp.fsn.model.Model;

import gob.shcp.fsn.util.FileContent;

import gob.shcp.jcr.node.FsnResource;

import java.util.Date;
import java.util.Map;

public class CargarConstanciaDTO extends FsnResource implements Model {

    public static String NODE_TYPE = "fsn:constanciaSirehResource";
    public static final String PROPERTY_RFC_META = "fsn:rfc_meta";
    public static final String PROPERTY_DOC_META = "fsn:doc_meta";

    // Control ida y regreso al controller
    private Integer idCurso;

    // Informativas 
    private String claveCurso;
    private String nombreCurso;
    private String subPrograma;
    private String ejeTematico;
    private String modalidad;
    private String finalidad;
    private String duracion;
    private String proveedor;
    private Date fechaInicio;
    private Date fechaTermino;
    private String sede;
    private String aula;
    private String horario;
    private String idJerarquia;

    // Variables de control 
    private boolean aceptar;
    private boolean cancelar;
    private boolean muestraRegistros;

    // Documento Soporte
    private FileContent documentoSoporte;
    private boolean rollback;
    private String tipoDocumento;
    private String[] docGrupo;

    // Navegacion
    private String beanName;
    private String urlOrigen;
    private String urlDestino;
    private String urlBorrar;

    // Roles
    private boolean rolAdministradorCapacitacion;
    private boolean rolAdministradorCertificacion;
    private boolean rolCoordinacionAdministrativa;
    private boolean rolOperadorCapacitacion;
    private boolean rolEjecutivoContratacion;

    // JCR
    public CargarConstanciaDTO() {
        super(NODE_TYPE);
        setVersionable(true);
    }

    public CargarConstanciaDTO(Map properties) {
        super(properties, NODE_TYPE);
        setVersionable(true);
    }

    public void setRfcMeta(String rfcMeta) {
        this.getProperties().put(PROPERTY_RFC_META, rfcMeta);
    }

    public String getRfcMeta() {
        return (String)this.getProperties().get(PROPERTY_RFC_META);
    }

    public void setDocMeta(String docMeta) {
        this.getProperties().put(PROPERTY_DOC_META, docMeta);
    }

    public String getDocMeta() {
        return (String)this.getProperties().get(PROPERTY_DOC_META);
    }

    public void setDescripcion(String descripcion) {
        super.getProperties().put(PROPERTY_DESCRIPTION, descripcion);
    }

    public String getDescripcion() {
        return (String)super.getProperties().get(PROPERTY_DESCRIPTION);
    }

    // Metodos de acceso
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

    public void setIdJerarquia(String idJerarquia) {
        this.idJerarquia = idJerarquia;
    }

    public String getIdJerarquia() {
        return idJerarquia;
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

    public void setUrlBorrar(String urlBorrar) {
        this.urlBorrar = urlBorrar;
    }

    public String getUrlBorrar() {
        return urlBorrar;
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

    public void setRollback(boolean rollback) {
        this.rollback = rollback;
    }

    public boolean isRollback() {
        return rollback;
    }

    public void setDocGrupo(String[] docGrupo) {
        this.docGrupo = docGrupo;
    }

    public String[] getDocGrupo() {
        return docGrupo;
    }

    public void setDocumentoSoporte(FileContent documentoSoporte) {
        this.documentoSoporte = documentoSoporte;
    }

    public FileContent getDocumentoSoporte() {
        return documentoSoporte;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

}
