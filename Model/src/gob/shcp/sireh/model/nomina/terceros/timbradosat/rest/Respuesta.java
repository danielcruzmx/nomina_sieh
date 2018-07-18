package gob.shcp.sireh.model.nomina.terceros.timbradosat.rest;

import java.io.Serializable;

public class Respuesta implements Serializable {
    
    private Integer codRespuesta;
    private String idPaquete;
    private String respuesta;
    private String uriSalida;
    private Integer idNomina;
    private Integer cnFolio;
    private Integer cnPaquete;
    

    public Respuesta(){}
    
    public Integer getCodRespuesta() {
        return codRespuesta;
    }

    public void setCodRespuesta(Integer codRespuesta) {
        this.codRespuesta = codRespuesta;
    }

    public String getIdPaquete() {
        return idPaquete;
    }

    public void setIdPaquete(String idPaquete) {
        this.idPaquete = idPaquete;
    }

    public String getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(String respuesta) {
        this.respuesta = respuesta;
    }

    public String getUriSalida() {
        return uriSalida;
    }

    public void setUriSalida(String uriSalida) {
        this.uriSalida = uriSalida;
    }

    public void setIdNomina(Integer idNomina) {
        this.idNomina = idNomina;
    }

    public Integer getIdNomina() {
        return idNomina;
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
