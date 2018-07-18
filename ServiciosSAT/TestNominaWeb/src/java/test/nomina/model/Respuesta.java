package test.nomina.model;

/**
 *
 * @author omar_gomez
 */
public class Respuesta {
    
    private Integer codRespuesta;
    private String idPaquete;
    private String respuesta;
    private String uriSalida;
    

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
