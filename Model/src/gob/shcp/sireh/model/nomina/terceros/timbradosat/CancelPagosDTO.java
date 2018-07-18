package gob.shcp.sireh.model.nomina.terceros.timbradosat;

import gob.shcp.fsn.model.Model;

import java.io.Serializable;

import java.util.Date;
import java.util.List;

public class CancelPagosDTO implements Serializable, Model {


    public CancelPagosDTO() {
    }

    
    // Configuracion inicial
    private String beanName;

    // Navegacion
    private String urlOrigen;
    private String urlDestino;


    public void setBeanName(String beanName) {
        this.beanName = beanName;
    }

    public String getBeanName() {
        return beanName;
    }

    public void setUrlOrigen(String urlOrigen) {
        this.urlOrigen = urlOrigen;
    }

    public String getUrlOrigen() {
        return urlOrigen;
    }

    public void setUrlDestino(String urlDestino) {
        this.urlDestino = urlDestino;
    }

    public String getUrlDestino() {
        return urlDestino;
    }
}
