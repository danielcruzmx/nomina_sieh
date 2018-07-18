package gob.shcp.sireh.model.expediente.gestion.documentos;

import gob.shcp.fsn.model.Model;
import gob.shcp.fsn.util.FileContent;
import gob.shcp.jcr.node.FsnResource;

import java.util.Map;

import org.apache.commons.io.FilenameUtils;


import org.springmodules.validation.bean.conf.loader.annotation.handler.ValidationMethod;

public class ExpedienteDocumentosSinCapturaDTO extends FsnResource implements Model {
    
    public static String NODE_TYPE = "fsn:expedienteSirehResource";
    public static final String PROPERTY_RFC_META = "fsn:rfc_meta";
    public static final String PROPERTY_DOC_META = "fsn:doc_meta";
    
    // Datos del Empleado
    private String rfcEmpleadoBusqueda;
    private String nombreEmpleadoCompleto;
    
    // Documento Soporte
    private FileContent documentoSoporte;
    private boolean rollback;
    private String documento;
    private Integer rechazo;
    
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
   
    private String  dsdDescripDocto;
    private String  auxdsdDescripDocto="";
    private Integer dsdAxoDocto;
    
    private String auxdsdDescripDoctoLista;
    private String auxdsdDescripDoctoTexto;
    
    // JCR
    public ExpedienteDocumentosSinCapturaDTO() {
        super(NODE_TYPE);
        setVersionable(true);
    }
    public ExpedienteDocumentosSinCapturaDTO(Map properties) {
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
    
    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getDocumento() {
        return documento;
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

    public void getDocumentosSinCaptura() {
    }

    public void setRechazo(Integer rechazo) {
        this.rechazo = rechazo;
    }

    public Integer getRechazo() {
        return rechazo;
    }
    
    // Validaciones
    @ValidationMethod(forProperty = "documento", errorCode = "not.null")
    public boolean validateDocumentoRequiered() {
        if (this.isRegistrar()) {
            return (this.getDocumento() != null && !this.getDocumento().equals(""));
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
    
    @ValidationMethod(forProperty = "dsdDescripDocto", errorCode = "not.null")
    public boolean validateDescipcionDocumentoRequiered() {
        if (this.isRegistrar()) {
            return (this.getDsdDescripDocto() != null && !this.getDsdDescripDocto().equals(""));
        }
        return true;
    }

    @ValidationMethod(forProperty = "dsdAxoDocto", errorCode = "not.null")
    public boolean validateDsdAxoDoctoRequiered() {
        if (this.isRegistrar()) {
            return (this.getDsdAxoDocto() != null && !this.getDsdAxoDocto().toString().equals(""));
        }
        return true;
    }
    
    @ValidationMethod(forProperty = "dsdAxoDocto", errorCode = "regexp")
    public boolean validateDsdAxoDoctoRegexp() {
        if (this.isRegistrar()) {
            return (this.getDsdAxoDocto() != null && this.getDsdAxoDocto().toString().matches("[0-9]{4}"));
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

    public void setDsdDescripDocto(String dsdDescripDocto) {
        this.dsdDescripDocto = dsdDescripDocto;
    }

    public String getDsdDescripDocto() {
        return dsdDescripDocto;
    }

    public void setDsdAxoDocto(Integer dsdAxoDocto) {
        this.dsdAxoDocto = dsdAxoDocto;
    }

    public Integer getDsdAxoDocto() {
        return dsdAxoDocto;
    }

    public void setAuxdsdDescripDocto(String auxdsdDescripDocto) {
        this.auxdsdDescripDocto = auxdsdDescripDocto;
    }

    public String getAuxdsdDescripDocto() {
        return auxdsdDescripDocto;
    }

    public void setAuxdsdDescripDoctoLista(String auxdsdDescripDoctoLista) {
        this.auxdsdDescripDoctoLista = auxdsdDescripDoctoLista;
    }

    public String getAuxdsdDescripDoctoLista() {
        return auxdsdDescripDoctoLista;
    }

    public void setAuxdsdDescripDoctoTexto(String auxdsdDescripDoctoTexto) {
        this.auxdsdDescripDoctoTexto = auxdsdDescripDoctoTexto;
    }

    public String getAuxdsdDescripDoctoTexto() {
        return auxdsdDescripDoctoTexto;
    }
}
