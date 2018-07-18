package gob.shcp.sireh.model.configuracion.mantenimiento.plantillas;

import gob.shcp.fsn.model.Model;
import gob.shcp.fsn.util.FileContent;

import java.util.List;

public class PlantillaDTO implements java.io.Serializable, Model{
    private String rutaFile;
    private FileContent file;
    private List<EtiquetaDTO> listaFile;
    private String nameFile;
    private String urlOrigen;
    private String urlDestino;
    private String mensaje;
    private Boolean esNuevo;
    
    public PlantillaDTO() {
        esNuevo = false;
    }

    public String getRutaFile() {
        return rutaFile;
    }

    public void setRutaFile(String rutaFile) {
        this.rutaFile = rutaFile;
    }

    public FileContent getFile() {
        return file;
    }

    public void setFile(FileContent file) {
        this.file = file;
    }

    public List<EtiquetaDTO> getListaFile() {
        return listaFile;
    }

    public void setListaFile(List<EtiquetaDTO> listaFile) {
        this.listaFile = listaFile;
    }

    public String getNameFile() {
        return nameFile;
    }

    public void setNameFile(String nameFile) {
        this.nameFile = nameFile;
    }

    public String getUrlOrigen() {
        return urlOrigen;
    }

    public void setUrlOrigen(String urlOrigen) {
        this.urlOrigen = urlOrigen;
    }

    public String getUrlDestino() {
        return urlDestino;
    }

    public void setUrlDestino(String urlDestino) {
        this.urlDestino = urlDestino;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
    
    public EtiquetaDTO getInstanceEtiqueta(String valor) {
        return new EtiquetaDTO(valor);
    }

    public Boolean getEsNuevo() {
        return esNuevo;
    }

    public void setEsNuevo(Boolean esNuevo) {
        this.esNuevo = esNuevo;
    }
}


