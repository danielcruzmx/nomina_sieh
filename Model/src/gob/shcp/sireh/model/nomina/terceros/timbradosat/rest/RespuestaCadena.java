package gob.shcp.sireh.model.nomina.terceros.timbradosat.rest;

import gob.shcp.sireh.model.nomina.terceros.ComponenteXmlDTO;

import java.io.Serializable;

import java.util.List;

public class RespuestaCadena implements Serializable {
    private List<ComponenteXmlDTO> cadenas;
    private Integer idNomina;
    private String resource;
    private Integer cnFolio;
    private Integer cnPaquete;
    private boolean valido;

    public void setCadenas(List<ComponenteXmlDTO> cadenas) {
        this.cadenas = cadenas;
    }

    public List<ComponenteXmlDTO> getCadenas() {
        return cadenas;
    }

    public void setIdNomina(Integer idNomina) {
        this.idNomina = idNomina;
    }

    public Integer getIdNomina() {
        return idNomina;
    }

    public void setResource(String resource) {
        this.resource = resource;
    }

    public String getResource() {
        return resource;
    }

    public void setValido(boolean valido) {
        this.valido = valido;
    }

    public boolean isValido() {
        return valido;
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
