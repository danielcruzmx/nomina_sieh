package gob.shcp.sireh.model.configuracion.mantenimiento.plantillas;

import gob.shcp.fsn.model.Model;

public class EtiquetaDTO implements java.io.Serializable, Model{
   private String valor;
    public EtiquetaDTO( String valor) {
        this.valor = valor;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }
}
