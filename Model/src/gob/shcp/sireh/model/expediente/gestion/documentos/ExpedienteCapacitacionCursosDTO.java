package gob.shcp.sireh.model.expediente.gestion.documentos;

import gob.shcp.fsn.model.Model;
import gob.shcp.fsn.util.FileContent;
import gob.shcp.jcr.node.FsnResource;

import java.util.Map;

import org.apache.commons.io.FilenameUtils;

import org.springmodules.validation.bean.conf.loader.annotation.handler.ValidationMethod;

public class ExpedienteCapacitacionCursosDTO extends FsnResource implements Model {

    public static String NODE_TYPE = "fsn:expedienteSirehResource";
    public static final String PROPERTY_RFC_META = "fsn:rfc_meta";
    public static final String PROPERTY_DOC_META = "fsn:doc_meta";

    // Datos del Empleado
    private String rfcEmpleadoBusqueda;
    private String nombreEmpleadoCompleto;

    // Filtros
    private String nivelCapacitacion;
    private String descCapacitacion;
    private Integer instEducat;
    private Double promedioFinal;
    private String estudiosConcluidos;

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
    
    private Integer rechazo;

    private String[] docGrupo;
    
    private Integer totalRegistrados;
    private Integer totalRechazados;


    // JCR

    public ExpedienteCapacitacionCursosDTO() {
        super(NODE_TYPE);
        setVersionable(true);
    }

    public ExpedienteCapacitacionCursosDTO(Map properties) {
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

    public void setNivelCapacitacion(String nivelCapacitacion) {
        this.nivelCapacitacion = nivelCapacitacion;
    }

    public String getNivelCapacitacion() {
        return nivelCapacitacion;
    }

    public void setDescCapacitacion(String descCapacitacion) {
        this.descCapacitacion = descCapacitacion;
    }

    public String getDescCapacitacion() {
        return descCapacitacion;
    }


    public void setEstudiosConcluidos(String estudiosConcluidos) {
        this.estudiosConcluidos = estudiosConcluidos;
    }

    public String getEstudiosConcluidos() {
        return estudiosConcluidos;
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

    public void setPromedioFinal(Double promedioFinal) {
        this.promedioFinal = promedioFinal;
    }

    public Double getPromedioFinal() {
        return promedioFinal;
    }

    public void setInstEducat(Integer instEducat) {
        this.instEducat = instEducat;
    }

    public Integer getInstEducat() {
        return instEducat;
    }

    public void setRechazo(Integer rechazo) {
        this.rechazo = rechazo;
    }

    public Integer getRechazo() {
        return rechazo;
    }

    // Validaciones

    @ValidationMethod(forProperty = "nivelCapacitacion", errorCode = "not.null")
    public boolean validateNivelCapacitacionRequired() {
        if (this.isRegistrar()) {
            return (this.getNivelCapacitacion() != null && 
                    !this.getNivelCapacitacion().equals(""));
        }
        return true;
    }


    @ValidationMethod(forProperty = "descCapacitacion", errorCode = "not.null")
    public boolean validateDescCapacitacionRequired() {
        if (this.isRegistrar()) {
            return (this.getDescCapacitacion() != null && 
                    !this.getDescCapacitacion().equals(""));
        }
        return true;
    }

    @ValidationMethod(forProperty = "instEducat", errorCode = "not.null")
    public boolean validateInstEducatRequired() {
        if (this.isRegistrar()) {
            return (this.getInstEducat() != null && 
                    !this.getInstEducat().equals(""));
        }
        return true;
    }


    @ValidationMethod(forProperty = "estudiosConcluidos", errorCode = "not.null")
    public boolean validateEstudiosConcluidosRequired() {
        if (this.isRegistrar()) {
            return (this.getEstudiosConcluidos() != null && 
                    !this.getEstudiosConcluidos().equals(""));
        }
        return true;
    }
    
    @ValidationMethod(forProperty = "documentoSoporte", errorCode = "not.null")
    public boolean validateDocumentoSoporteRequired() {
        if (this.isRegistrar()) {
            return (this.getDocumentoSoporte() != null && 
                    this.getDocumentoSoporte().getSize() > 0);
        }
        return true;
    }

    @ValidationMethod(forProperty = "documentoSoporte", errorCode = "not.pdf")
    public boolean validateDocumentoSoportePdf() {
        if (this.isRegistrar()) {
            return (this.getDocumentoSoporte() != null && 
                    this.getDocumentoSoporte().getSize() > 0 && 
                    FilenameUtils.getExtension(this.getDocumentoSoporte().getOriginalFilename()).equals("pdf"));
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
