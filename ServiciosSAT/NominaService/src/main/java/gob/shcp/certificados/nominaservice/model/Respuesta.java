/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gob.shcp.certificados.nominaservice.model;

/**
 *
 * @author omar_gomez
 */
public class Respuesta {
    

    private Integer codRespuesta;
    private String idPaquete;
    private String respuesta;
    private String uriSalida;
    private Integer idNomina;
    
    
    public Respuesta(Integer codRespuesta, String idPaquete, String respuesta) {
        this.codRespuesta = codRespuesta;
        this.idPaquete = idPaquete;
        this.respuesta = respuesta;
    }

    public Respuesta(Integer codRespuesta, String idPaquete, String respuesta, Integer idNomina) {
        this.codRespuesta = codRespuesta;
        this.idPaquete = idPaquete;
        this.respuesta = respuesta;
        this.idNomina = idNomina;
    }

    public Integer getIdNomina() {
        return idNomina;
    }

    public void setIdNomina(Integer idNomina) {
        this.idNomina = idNomina;
    }

    public Respuesta(String respuesta) {
        this.respuesta = respuesta;
    }

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
    
    
    
}
