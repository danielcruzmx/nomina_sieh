package gob.shcp.sireh.model.expediente.gestion.documentos;

import gob.shcp.fsn.model.Model;
import gob.shcp.fsn.util.FileContent;
import gob.shcp.jcr.node.FsnResource;

import java.util.Date;
import java.util.Map;

import org.apache.commons.io.FilenameUtils;

import org.springmodules.validation.bean.conf.loader.annotation.handler.ValidationMethod;

public class ExpedienteExperienciaLaboralDTO extends FsnResource implements Model {
    
    public static String NODE_TYPE = "fsn:expedienteSirehResource";
    public static final String PROPERTY_RFC_META = "fsn:rfc_meta";
    public static final String PROPERTY_DOC_META = "fsn:doc_meta";
    
    // Datos del Empleado

    private String rfcEmpleadoBusqueda;
    private String nombreEmpleadoCompleto;
    
    // Filtros
    private String sector;
    private String pais;
    private Date fecInicial;
    private Date fecFinal;
    private String organizacion;
    private String puestoOcupado;
    private String actividadPrincipal;
    private Integer rechazo;
    
    // Documento Soporte
    private FileContent documentoSoporte;
    private boolean rollback;
    
    // Configuracion inicial
    private String beanName;
    
    // Navegacion
    private String urlOrigen;
    private String urlDestino;
    
    // Control
    private boolean cancel;
    private boolean muestraRegistros;
    private boolean clean;
    private boolean autorizar;
    private boolean rechazar;
    private boolean registrar;
    
    private boolean rolAutorizar;
    private boolean rolRechazar;
    private boolean rolRegistrar;
    
    private String[] docGrupo;
    
    private Integer totalRegistrados;
    private Integer totalRechazados;
    
    // JCR
    public ExpedienteExperienciaLaboralDTO() {
        super(NODE_TYPE);
        setVersionable(true);
    }
    public ExpedienteExperienciaLaboralDTO(Map properties) {
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
    public void setNombreEmpleadoCompleto(String nombreEmpleadoCompleto) {
        this.nombreEmpleadoCompleto = nombreEmpleadoCompleto;
    }

    public String getNombreEmpleadoCompleto() {
        return nombreEmpleadoCompleto;
    }

    public void setDocumentoSoporte(FileContent documentoSoporte) {
        this.documentoSoporte = documentoSoporte;
    }

    public FileContent getDocumentoSoporte() {
        return documentoSoporte;
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

    public void setSector(String sector) {
        this.sector = sector;
    }

    public String getSector() {
        return sector;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getPais() {
        return pais;
    }

    public void setFecInicial(Date fecInicial) {
        this.fecInicial = fecInicial;
    }

    public Date getFecInicial() {
        return fecInicial;
    }

    public void setFecFinal(Date fecFinal) {
        this.fecFinal = fecFinal;
    }

    public Date getFecFinal() {
        return fecFinal;
    }

    public void setOrganizacion(String organizacion) {
        this.organizacion = organizacion;
    }

    public String getOrganizacion() {
        return organizacion;
    }

    public void setPuestoOcupado(String puestoOcupado) {
        this.puestoOcupado = puestoOcupado;
    }

    public String getPuestoOcupado() {
        return puestoOcupado;
    }

    public void setActividadPrincipal(String actividadPrincipal) {
        this.actividadPrincipal = actividadPrincipal;
    }

    public String getActividadPrincipal() {
        return actividadPrincipal;
    }

    public void setRfcEmpleadoBusqueda(String rfcEmpleadoBusqueda) {
        this.rfcEmpleadoBusqueda = rfcEmpleadoBusqueda;
    }

    public String getRfcEmpleadoBusqueda() {
        return rfcEmpleadoBusqueda;
    }

    public void setRollback(boolean rollback) {
        this.rollback = rollback;
    }

    public boolean isRollback() {
        return rollback;
    }

    public void setClean(boolean clean) {
        this.clean = clean;
    }

    public boolean isClean() {
        return clean;
    }

    public void setAutorizar(boolean autorizar) {
        this.autorizar = autorizar;
    }

    public boolean isAutorizar() {
        return autorizar;
    }

    public void setRechazar(boolean rechazar) {
        this.rechazar = rechazar;
    }

    public boolean isRechazar() {
        return rechazar;
    }

    public void setRegistrar(boolean registrar) {
        this.registrar = registrar;
    }

    public boolean isRegistrar() {
        return registrar;
    }

    public void setDocGrupo(String[] docGrupo) {
        this.docGrupo = docGrupo;
    }

    public String[] getDocGrupo() {
        return docGrupo;
    }

    public void setRechazo(Integer rechazo) {
        this.rechazo = rechazo;
    }

    public Integer getRechazo() {
        return rechazo;
    }
    
    // Validaciones

    
    @ValidationMethod(forProperty = "sector", errorCode = "not.null")
    public boolean validateSectorRequired() {
        if (this.isRegistrar()) {
            return (this.getSector() != null && this.getSector().length() > 0);
        }
        return true;
    }
    
    @ValidationMethod(forProperty = "pais", errorCode = "not.null")
    public boolean validatePaisRequired() {
        if (this.isRegistrar()) {
            return (this.getPais() != null && this.getPais().length() > 0);
        }
        return true;
    }
    
    @ValidationMethod(forProperty = "fecInicial", errorCode = "not.null")
    public boolean validateFecInicialRequired() {
        if (this.isRegistrar()) {
            return this.getFecInicial() != null;
        }
        return true;
    }
    
    @ValidationMethod(forProperty = "fecFinal", errorCode = "not.null")
    public boolean validateFecFinalRequired() {
        if (this.isRegistrar()) {
            return this.getFecFinal() != null;
        }
        return true;
    }
    
    @ValidationMethod(forProperty = "organizacion", errorCode = "not.null")
    public boolean validateOrganizacionRequired() {
        if (this.isRegistrar()) {
            return this.getOrganizacion() != null;
        }
        return true;
    }
    
    @ValidationMethod(forProperty = "puestoOcupado", errorCode = "not.null")
    public boolean validatePuestoOcupadoRequired() {
        if (this.isRegistrar()) {
            return this.getPuestoOcupado() != null;
        }
        return true;
    }
    
    @ValidationMethod(forProperty = "actividadPrincipal", errorCode = "not.null")
    public boolean validateActividadPrincipalRequired() {
        if (this.isRegistrar()) {
            return this.getActividadPrincipal() != null;
        }
        return true;
    }
    
    @ValidationMethod(forProperty = "documentoSoporte", errorCode = "not.null")
    public boolean validateDocumentoSoporteRequired() {
        if (this.isRegistrar()) {
            return (this.getDocumentoSoporte() != null && this.getDocumentoSoporte().getSize() > 0);
        }
        return true;
    }

    @ValidationMethod(forProperty = "documentoSoporte", errorCode = "not.pdf")
    public boolean validateDocumentoSoportePdf() {
        if (this.isRegistrar()) {
            return (this.getDocumentoSoporte() != null && this.getDocumentoSoporte().getSize() > 0 && FilenameUtils.getExtension(this.getDocumentoSoporte().getOriginalFilename()).equals("pdf"));
        }
        return true;
    }
    
    @ValidationMethod(forProperty = "rechazo", errorCode = "not.null")
    public boolean validateEstatusRechazo() {
        if (this.isRechazar()) {
            return this.getRechazo() != null;
        }
        return true;
    }

    public void setTotalRegistrados(Integer totalRegistrados) {
        this.totalRegistrados = totalRegistrados;
    }

    public Integer getTotalRegistrados() {
        return totalRegistrados;
    }

    public void setTotalRechazados(Integer totalRechazados) {
        this.totalRechazados = totalRechazados;
    }

    public Integer getTotalRechazados() {
        return totalRechazados;
    }

    public void setRolAutorizar(boolean rolAutorizar) {
        this.rolAutorizar = rolAutorizar;
    }

    public boolean isRolAutorizar() {
        return rolAutorizar;
    }

    public void setRolRechazar(boolean rolRechazar) {
        this.rolRechazar = rolRechazar;
    }

    public boolean isRolRechazar() {
        return rolRechazar;
    }

    public void setRolRegistrar(boolean rolRegistrar) {
        this.rolRegistrar = rolRegistrar;
    }

    public boolean isRolRegistrar() {
        return rolRegistrar;
    }
}

