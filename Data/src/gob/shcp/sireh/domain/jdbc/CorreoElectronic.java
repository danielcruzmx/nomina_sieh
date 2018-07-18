package gob.shcp.sireh.domain.jdbc;

import gob.shcp.fsn.data.Domain;

import gob.shcp.fsn.util.FileContent;
import gob.shcp.jcr.node.FsnResource;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

public class CorreoElectronic extends FsnResource implements Domain, Serializable {
    private String rfcEmpleado;
    
    private String qnaInicial;
    private String qnaFinal;
    private String quincena;
    private String ciclo;
    private String grupoPago;
    
    // CORREO
    private String correoReceptor;
    private String correoReceptorNombre;
    private String correoReceptorConfirmar;
    private String asunto;
    private String mensaje;
    private String emisor;
    
    private String filePDF;
    
    private List<TnComprobanteDig> lisTnComprobanteDig = new ArrayList<TnComprobanteDig>();
    private List<TnConceptoPagado> lisTnConceptoPagado =  new ArrayList<TnConceptoPagado>();
    
    private boolean buscar;
    private boolean generar;
    private boolean enviar;
    private boolean limpiar;
    private boolean descargar;
    
    private boolean dataGrid;
    private boolean iframePDF;
    private boolean panelCorreo;
    
    private String[] idGrupo;
    
    private String cscNoina;
    private String folio;
    private String complemento;
    private String tipoNomina;
    
    private String mergedPDF;
    private String nameFileZip;
    
    private FileContent imagen;
    private String ancla;
    
    private String imgTag;

    public void setRfcEmpleado(String rfcEmpleado) {
        this.rfcEmpleado = rfcEmpleado;
    }

    public String getRfcEmpleado() {
        return rfcEmpleado;
    }

    public void setQnaInicial(String qnaInicial) {
        this.qnaInicial = qnaInicial;
    }

    public String getQnaInicial() {
        return qnaInicial;
    }

    public void setQnaFinal(String qnaFinal) {
        this.qnaFinal = qnaFinal;
    }

    public String getQnaFinal() {
        return qnaFinal;
    }

    public void setQuincena(String quincena) {
        this.quincena = quincena;
    }

    public String getQuincena() {
        return quincena;
    }

    public void setCiclo(String ciclo) {
        this.ciclo = ciclo;
    }

    public String getCiclo() {
        return ciclo;
    }

    public void setCorreoReceptor(String correoReceptor) {
        this.correoReceptor = correoReceptor;
    }

    public String getCorreoReceptor() {
        return correoReceptor;
    }

    public void setCorreoReceptorNombre(String correoReceptorNombre) {
        this.correoReceptorNombre = correoReceptorNombre;
    }

    public String getCorreoReceptorNombre() {
        return correoReceptorNombre;
    }

    public void setCorreoReceptorConfirmar(String correoReceptorConfirmar) {
        this.correoReceptorConfirmar = correoReceptorConfirmar;
    }

    public String getCorreoReceptorConfirmar() {
        return correoReceptorConfirmar;
    }

    public void setAsunto(String asunto) {
        this.asunto = asunto;
    }

    public String getAsunto() {
        return asunto;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setEmisor(String emisor) {
        this.emisor = emisor;
    }

    public String getEmisor() {
        return emisor;
    }

    public void setFilePDF(String filePDF) {
        this.filePDF = filePDF;
    }

    public String getFilePDF() {
        return filePDF;
    }

    public void setBuscar(boolean buscar) {
        this.buscar = buscar;
    }

    public boolean isBuscar() {
        return buscar;
    }

    public void setGenerar(boolean generar) {
        this.generar = generar;
    }

    public boolean isGenerar() {
        return generar;
    }

    public void setEnviar(boolean enviar) {
        this.enviar = enviar;
    }

    public boolean isEnviar() {
        return enviar;
    }

    public void setLimpiar(boolean limpiar) {
        this.limpiar = limpiar;
    }

    public boolean isLimpiar() {
        return limpiar;
    }

    public void setDescargar(boolean descargar) {
        this.descargar = descargar;
    }

    public boolean isDescargar() {
        return descargar;
    }

    public void setDataGrid(boolean dataGrid) {
        this.dataGrid = dataGrid;
    }

    public boolean isDataGrid() {
        return dataGrid;
    }

    public void setIframePDF(boolean iframePDF) {
        this.iframePDF = iframePDF;
    }

    public boolean isIframePDF() {
        return iframePDF;
    }

    public void setPanelCorreo(boolean panelCorreo) {
        this.panelCorreo = panelCorreo;
    }

    public boolean isPanelCorreo() {
        return panelCorreo;
    }

    public void setIdGrupo(String[] idGrupo) {
        this.idGrupo = idGrupo;
    }

    public String[] getIdGrupo() {
        return idGrupo;
    }

    public void setCscNoina(String cscNoina) {
        this.cscNoina = cscNoina;
    }

    public String getCscNoina() {
        return cscNoina;
    }

    public void setFolio(String folio) {
        this.folio = folio;
    }

    public String getFolio() {
        return folio;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setTipoNomina(String tipoNomina) {
        this.tipoNomina = tipoNomina;
    }

    public String getTipoNomina() {
        return tipoNomina;
    }

    public void setMergedPDF(String mergedPDF) {
        this.mergedPDF = mergedPDF;
    }

    public String getMergedPDF() {
        return mergedPDF;
    }

    public void setNameFileZip(String nameFileZip) {
        this.nameFileZip = nameFileZip;
    }

    public String getNameFileZip() {
        return nameFileZip;
    }

    public void setIdentity(Serializable id) {
    }

    public Serializable getIdentity() {
        return null;
    }

    public void setGrupoPago(String grupoPago) {
        this.grupoPago = grupoPago;
    }

    public String getGrupoPago() {
        return grupoPago;
    }

    public void setLisTnComprobanteDig(List<TnComprobanteDig> lisTnComprobanteDig) {
        this.lisTnComprobanteDig = lisTnComprobanteDig;
    }

    public List<TnComprobanteDig> getLisTnComprobanteDig() {
        return lisTnComprobanteDig;
    }

    public void setLisTnConceptoPagado(List<TnConceptoPagado> lisTnConceptoPagado) {
        this.lisTnConceptoPagado = lisTnConceptoPagado;
    }

    public List<TnConceptoPagado> getLisTnConceptoPagado() {
        return lisTnConceptoPagado;
    }

    public void setAncla(String ancla) {
        this.ancla = ancla;
    }

    public String getAncla() {
        return ancla;
    }

    public void setImagen(FileContent imagen) {
        this.imagen = imagen;
    }

    public FileContent getImagen() {
        return imagen;
    }

    public void setImgTag(String imgTag) {
        this.imgTag = imgTag;
    }

    public String getImgTag() {
        return imgTag;
    }
}
