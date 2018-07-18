package gob.shcp.sireh.model.nomina.terceros.timbradosat;

import gob.shcp.fsn.model.Model;

import gob.shcp.fsn.util.FileContent;
import gob.shcp.jcr.node.FsnResource;
import gob.shcp.sireh.model.ItemKeyDTO;

import java.util.ArrayList;
import java.util.List;

import org.springmodules.validation.bean.conf.loader.annotation.handler.ValidationMethod;

public class CorreoElectronicDTO extends FsnResource implements java.io.Serializable, Model {
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
    
    private java.util.List<ItemKeyDTO> adjuntos = new ArrayList<ItemKeyDTO>();
    private String plantillaCorreo;
    
    private String filePDF;
    
    private List<FolioTnComprobanteDigDTO> listFoliosTnComprobanteDigDTO = new ArrayList<FolioTnComprobanteDigDTO>();
    
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

    public void setPlantillaCorreo(String plantillaCorreo) {
        this.plantillaCorreo = plantillaCorreo;
    }

    public String getPlantillaCorreo() {
        return plantillaCorreo;
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
    
    
    @ValidationMethod(forProperty="qnaInicial", errorCode="error.verify.unselected")
    private boolean validateQnaInicial() {
        if (this.isBuscar()) {
            return (this.getQnaInicial() != null && this.getQnaInicial().length() > 0);
        }
        return true;
    }
    
    @ValidationMethod(forProperty="qnaFinal", errorCode="error.verify.unselected")
    private boolean validateQnaFinal() {
        if (this.isBuscar()) {
            return (this.getQnaFinal() != null && this.getQnaFinal().length() > 0);
        }
        return true;
    }
    
    @ValidationMethod(forProperty="rfcEmpleado", errorCode="error.verify.unselected")
    private boolean validateRfcEmpleado() {
        if (this.isBuscar()) {
            return (this.getRfcEmpleado() != null && this.getRfcEmpleado().length() > 0);
        }
        return true;
    }

    public void setDataGrid(boolean dataGrid) {
        this.dataGrid = dataGrid;
    }

    public boolean isDataGrid() {
        return dataGrid;
    }

    public void setQuincena(String quincena) {
        this.quincena = quincena;
    }

    public String getQuincena() {
        return quincena;
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

    public void setTipoNomina(String tipoNomina) {
        this.tipoNomina = tipoNomina;
    }

    public String getTipoNomina() {
        return tipoNomina;
    }

    public void setIframePDF(boolean iframePDF) {
        this.iframePDF = iframePDF;
    }

    public boolean isIframePDF() {
        return iframePDF;
    }

    public void setEmisor(String emisor) {
        this.emisor = emisor;
    }

    public String getEmisor() {
        return emisor;
    }

    public void setCorreoReceptor(String correoReceptor) {
        this.correoReceptor = correoReceptor;
    }

    public String getCorreoReceptor() {
        return correoReceptor;
    }

    public void setCorreoReceptorConfirmar(String correoReceptorConfirmar) {
        this.correoReceptorConfirmar = correoReceptorConfirmar;
    }

    public String getCorreoReceptorConfirmar() {
        return correoReceptorConfirmar;
    }

    public void setCorreoReceptorNombre(String correoReceptorNombre) {
        this.correoReceptorNombre = correoReceptorNombre;
    }

    public String getCorreoReceptorNombre() {
        return correoReceptorNombre;
    }

    public void setDescargar(boolean descargar) {
        this.descargar = descargar;
    }

    public boolean isDescargar() {
        return descargar;
    }

    public void setIdGrupo(String[] idGrupo) {
        this.idGrupo = idGrupo;
    }

    public String[] getIdGrupo() {
        return idGrupo;
    }

    public void setPanelCorreo(boolean panelCorreo) {
        this.panelCorreo = panelCorreo;
    }

    public boolean isPanelCorreo() {
        return panelCorreo;
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

    public void setCiclo(String ciclo) {
        this.ciclo = ciclo;
    }

    public String getCiclo() {
        return ciclo;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setAdjuntos(List<ItemKeyDTO> adjuntos) {
        this.adjuntos = adjuntos;
    }

    public List<ItemKeyDTO> getAdjuntos() {
        return adjuntos;
    }

    public void setGrupoPago(String grupoPago) {
        this.grupoPago = grupoPago;
    }

    public String getGrupoPago() {
        return grupoPago;
    }

    public void setListFoliosTnComprobanteDigDTO(List<FolioTnComprobanteDigDTO> listFoliosTnComprobanteDigDTO) {
        this.listFoliosTnComprobanteDigDTO = listFoliosTnComprobanteDigDTO;
    }

    public List<FolioTnComprobanteDigDTO> getListFoliosTnComprobanteDigDTO() {
        return listFoliosTnComprobanteDigDTO;
    }

    public void setAncla(String ancla) {
        this.ancla = ancla.toLowerCase();
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
