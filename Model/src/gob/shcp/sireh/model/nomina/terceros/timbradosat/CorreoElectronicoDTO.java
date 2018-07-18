package gob.shcp.sireh.model.nomina.terceros.timbradosat;

import gob.shcp.fsn.model.Model;
import gob.shcp.jcr.node.FsnResource;

public class CorreoElectronicoDTO extends FsnResource implements Model {
    private String nombreReceptor;
    private String nombreEmisor;
    private String correoReceptor;
    private String correoEmisor;
    private String asunto;
    private String mensaje;
    
    private String adjuntosPath;
    private String plantillaCorreo;
    
    private String fileXML;
    private String filePDF;
    
    private boolean enviar;
    private boolean cancelar;

    public void setNombreReceptor(String nombreReceptor) {
        this.nombreReceptor = nombreReceptor;
    }

    public String getNombreReceptor() {
        return nombreReceptor;
    }

    public void setNombreEmisor(String nombreEmisor) {
        this.nombreEmisor = nombreEmisor;
    }

    public String getNombreEmisor() {
        return nombreEmisor;
    }

    public void setCorreoReceptor(String correoReceptor) {
        this.correoReceptor = correoReceptor;
    }

    public String getCorreoReceptor() {
        return correoReceptor;
    }

    public void setCorreoEmisor(String correoEmisor) {
        this.correoEmisor = correoEmisor;
    }

    public String getCorreoEmisor() {
        return correoEmisor;
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

    public void setFileXML(String fileXML) {
        this.fileXML = fileXML;
    }

    public String getFileXML() {
        return fileXML;
    }

    public void setFilePDF(String filePDF) {
        this.filePDF = filePDF;
    }

    public String getFilePDF() {
        return filePDF;
    }

    public void setEnviar(boolean enviar) {
        this.enviar = enviar;
    }

    public boolean isEnviar() {
        return enviar;
    }

    public void setCancelar(boolean cancelar) {
        this.cancelar = cancelar;
    }

    public boolean isCancelar() {
        return cancelar;
    }

    public void setAdjuntosPath(String adjuntosPath) {
        this.adjuntosPath = adjuntosPath;
    }

    public String getAdjuntosPath() {
        return adjuntosPath;
    }

    public void setPlantillaCorreo(String plantillaCorreo) {
        this.plantillaCorreo = plantillaCorreo;
    }

    public String getPlantillaCorreo() {
        return plantillaCorreo;
    }
}
