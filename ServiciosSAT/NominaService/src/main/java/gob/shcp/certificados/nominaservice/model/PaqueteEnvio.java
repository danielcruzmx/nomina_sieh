package gob.shcp.certificados.nominaservice.model;

/**
 *
 * @author omar_gomez
 */
public class PaqueteEnvio {

    private String fileName;
    private byte[] resource;
    private String idPaquete;
    

    public byte[] getResource() {
        return resource;
    }

    public void setResource(byte[] resource) {
        this.resource = resource;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getIdPaquete() {
        return idPaquete;
    }

    public void setIdPaquete(String idPaquete) {
        this.idPaquete = idPaquete;
    }
    
    

}
