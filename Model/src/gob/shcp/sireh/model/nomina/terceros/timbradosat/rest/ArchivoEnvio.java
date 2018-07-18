package gob.shcp.sireh.model.nomina.terceros.timbradosat.rest;

import java.io.Serializable;

public class ArchivoEnvio implements Serializable {

    private Integer idNomina;
    private Integer cnFolio;
    private Integer cnPaquete;
    private String fileName;
    private String resource;
    private String service;

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getResource() {
        return resource;
    }

    public void setResource(String resource) {
        this.resource = resource;
    }

    public Integer getIdNomina() {
        return idNomina;
    }

    public void setIdNomina(Integer idNomina) {
        this.idNomina = idNomina;
    }

    public void setService(String service) {
        this.service = service;
    }

    public String getService() {
        return service;
    }

    public void setCnFolio(Integer cnFolio) {
        this.cnFolio = cnFolio;
    }

    public Integer getCnFolio() {
        return cnFolio;
    }

    public void setCnPaquete(Integer cnPaquete) {
        this.cnPaquete = cnPaquete;
    }

    public Integer getCnPaquete() {
        return cnPaquete;
    }
}
