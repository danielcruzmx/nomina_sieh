package gob.shcp.sireh.model.expediente.gestion.documentos;

import gob.shcp.fsn.model.Model;
import gob.shcp.fsn.util.FileContent;
import gob.shcp.jcr.node.FsnResource;

import java.util.Map;

import org.apache.commons.io.FilenameUtils;

import org.springmodules.validation.bean.conf.loader.annotation.handler.ValidationMethod;

public class ExpedienteDepBenefDTO extends FsnResource implements Model {
    
    public static String NODE_TYPE = "fsn:expedienteSirehResource";
    public static final String PROPERTY_RFC_META = "fsn:rfc_meta";
    public static final String PROPERTY_DOC_META = "fsn:doc_meta";
    
    // Datos del Empleado
    private String rfcEmpleadoBusqueda;
    private String nombreEmpleadoCompleto;
    
    // Filtros
    private String tipoBeneficiario;
    private double porcentaje;
    private double importe;
    private Integer rechazo;
    private String estado;
    
    // Documento Soporte
    private FileContent documentoSoporte;
    private boolean rollback;
    
    // Navegacion
    private String beanName1;
    private String beanName2;
    private String urlOrigen;
    private String urlDestino;
    
    // Control
    private boolean cancel;
    private boolean clean;
    private boolean autorizar;
    private boolean rechazar;
    private boolean registrar;
    
    private String[] docGrupo1;
    private String[] docGrupo2;
    
    private Integer totalRegistrados;
    private Integer totalRechazados;
    
    // JCR
    public ExpedienteDepBenefDTO() {
        super(NODE_TYPE);
        setVersionable(true);
    }
    public ExpedienteDepBenefDTO(Map properties) {
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
    public void setRfcEmpleadoBusqueda(String rfcEmpleadoBusqueda) {
        this.rfcEmpleadoBusqueda = rfcEmpleadoBusqueda;
    }

    public String getRfcEmpleadoBusqueda() {
        return rfcEmpleadoBusqueda;
    }

    public void setNombreEmpleadoCompleto(String nombreEmpleadoCompleto) {
        this.nombreEmpleadoCompleto = nombreEmpleadoCompleto;
    }

    public String getNombreEmpleadoCompleto() {
        return nombreEmpleadoCompleto;
    }

    public void setTipoBeneficiario(String tipoBeneficiario) {
        this.tipoBeneficiario = tipoBeneficiario;
    }

    public String getTipoBeneficiario() {
        return tipoBeneficiario;
    }

    public void setPorcentaje(double porcentaje) {
        this.porcentaje = porcentaje;
    }

    public double getPorcentaje() {
        return porcentaje;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }

    public double getImporte() {
        return importe;
    }

    public void setRechazo(Integer rechazo) {
        this.rechazo = rechazo;
    }

    public Integer getRechazo() {
        return rechazo;
    }

    public void setDocumentoSoporte(FileContent documentoSoporte) {
        this.documentoSoporte = documentoSoporte;
    }

    public FileContent getDocumentoSoporte() {
        return documentoSoporte;
    }

    public void setRollback(boolean rollback) {
        this.rollback = rollback;
    }

    public boolean isRollback() {
        return rollback;
    }

    public void setBeanName1(String beanName1) {
        this.beanName1 = beanName1;
    }

    public String getBeanName1() {
        return beanName1;
    }

    public void setBeanName2(String beanName2) {
        this.beanName2 = beanName2;
    }

    public String getBeanName2() {
        return beanName2;
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

    public void setDocGrupo1(String[] docGrupo1) {
        this.docGrupo1 = docGrupo1;
    }

    public String[] getDocGrupo1() {
        return docGrupo1;
    }

    public void setDocGrupo2(String[] docGrupo2) {
        this.docGrupo2 = docGrupo2;
    }

    public String[] getDocGrupo2() {
        return docGrupo2;
    }

    // Validaciones
    @ValidationMethod(forProperty = "docGrupo1", errorCode = "error.verify.unselected")
    private boolean validateDocGrupo1() {
        if (this.isRegistrar() && this.getEstado() != null && !this.getEstado().equals("RECHAZADO")) {
            return (this.getDocGrupo1() != null && this.getDocGrupo1().length > 0);
        }
        return true;
    }
     
    @ValidationMethod(forProperty = "tipoBeneficiario", errorCode = "not.null")
    public boolean validatTipoBeneficiarioRequired() {
        if (this.isRegistrar()) {
            return (this.getTipoBeneficiario() != null && !this.getTipoBeneficiario().equals(""));
        }
        return true;
    }
    
    /*@ValidationMethod(forProperty = "porcentaje", errorCode = "not.null")
    public boolean validatPorcentajeRequired() {
        if (this.isRegistrar()) {
            return (this.getPorcentaje() > 0);
        }
        return true;
    }
    
    @ValidationMethod(forProperty = "importe", errorCode = "not.null")
    public boolean validatImporteRequired() {
        if (this.isRegistrar()) {
            return (this.getImporte() > 0);
        }
        return true;
    }*/
    
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

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getEstado() {
        return estado;
    }
}
