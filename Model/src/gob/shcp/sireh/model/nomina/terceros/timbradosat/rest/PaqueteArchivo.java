package gob.shcp.sireh.model.nomina.terceros.timbradosat.rest;

public class PaqueteArchivo {
    public PaqueteArchivo() {
    }

    private java.lang.String fileName;

    private byte[] resource;

    private java.lang.String idNomina;


    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getFileName() {
        return fileName;
    }

    public void setResource(byte[] resource) {
        this.resource = resource;
    }

    public byte[] getResource() {
        return resource;
    }

    public void setIdNomina(String idNomina) {
        this.idNomina = idNomina;
    }

    public String getIdNomina() {
        return idNomina;
    }
}
