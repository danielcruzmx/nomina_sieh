package gob.shcp.sireh.model.expediente.gestion.documentos;

import gob.shcp.fsn.model.Model;
import gob.shcp.fsn.util.FileContent;
import gob.shcp.jcr.node.FsnResource;

import java.util.Map;



public class ExpedienteDatosComplementariosDTO extends FsnResource implements Model {

    public static String NODE_TYPE = "fsn:expedienteSirehResource";
    public static final String PROPERTY_RFC_META = "fsn:rfc_meta";
    public static final String PROPERTY_DOC_META = "fsn:doc_meta";
    
    // Datos del Empleado
    private String rfcEmpleadoBusqueda;
    private String nombreEmpleadoCompleto;
    
    // Filtros
    private String telParticular;
    private String celParticular;
    private String emailParticular;
    private String tipoSangre;
    private String genero;
    private String padreMadre;
    private String edoCivil;
    private String tipoDiscapacidad;
    private Integer numRusp;
    private String numSegSoc;
    private Integer hablaIdioma;
    private Integer dominioIdioma;
    private Integer instProtecCivil;
    private Integer espProtecCivil;
    
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
    
    private String[] docGrupo;

    
    // JCR
    public ExpedienteDatosComplementariosDTO() {
        super(NODE_TYPE);
        setVersionable(true);
    }
    public ExpedienteDatosComplementariosDTO(Map properties) {
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
    
    public void setTelParticular(String telParticular) {
        this.telParticular = telParticular;
    }

    public String getTelParticular() {
        return telParticular;
    }

    public void setCelularParticular(String celParticular) {
        this.celParticular = celParticular;
    }

    public String getCelParticular() {
        return celParticular;
    }

    public void setEmailParticular(String emailParticular) {
        this.emailParticular = emailParticular;
    }

    public String getEmailParticular() {
        return emailParticular;
    }

    public void setTipoSangre(String tipoSangre) {
        this.tipoSangre = tipoSangre;
    }

    public String getTipoSangre() {
        return tipoSangre;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getGenero() {
        return genero;
    }

    public void setPadreMadre(String padreMadre) {
        this.padreMadre = padreMadre;
    }

    public String getPadreMadre() {
        return padreMadre;
    }

    public void setEdoCivil(String edoCivil) {
        this.edoCivil = edoCivil;
    }

    public String getEdoCivil() {
        return edoCivil;
    }

    public void setTipoDiscapacidad(String tipoDiscapacidad) {
        this.tipoDiscapacidad = tipoDiscapacidad;
    }

    public String getTipoDiscapacidad() {
        return tipoDiscapacidad;
    }

    public void setNumRusp(Integer numRusp) {
        this.numRusp = numRusp;
    }

    public Integer getNumRusp() {
        return numRusp;
    }

    public void setNumSegSoc(String numSegSoc) {
        this.numSegSoc = numSegSoc;
    }

    public String getNumSegSoc() {
        return numSegSoc;
    }

    public void setHablaIdioma(Integer hablaIdioma) {
        this.hablaIdioma = hablaIdioma;
    }

    public Integer getHablaIdioma() {
        return hablaIdioma;
    }

    public void setDominioIdioma(Integer dominioIdioma) {
        this.dominioIdioma = dominioIdioma;
    }

    public Integer getDominioIdioma() {
        return dominioIdioma;
    }

    public void setInstProtecCivil(Integer instProtecCivil) {
        this.instProtecCivil = instProtecCivil;
    }

    public Integer getInstProtecCivil() {
        return instProtecCivil;
    }

    public void setEspProtecCivil(Integer espProtecCivil) {
        this.espProtecCivil = espProtecCivil;
    }

    public Integer getEspProtecCivil() {
        return espProtecCivil;
    }

    public void setRfcEmpleadoBusqueda(String rfcEmpleadoBusqueda) {
        this.rfcEmpleadoBusqueda = rfcEmpleadoBusqueda;
    }

    public String getRfcEmpleadoBusqueda() {
        return rfcEmpleadoBusqueda;
    }

    public void setCelParticular(String celParticular) {
        this.celParticular = celParticular;
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

    // Validaciones
    //@ValidationMethod(forProperty = "genero", errorCode = "not.null")
    //public boolean validateGeneroRequired() {
    //    if (this.isRegistrar()) {
    //        return (this.getGenero() != null && this.getGenero().length() > 0);
    //    }
    //    return true;
    //}

}
