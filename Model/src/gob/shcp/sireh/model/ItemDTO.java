package gob.shcp.sireh.model;

import gob.shcp.fsn.model.Model;

public class ItemDTO implements java.io.Serializable, Model {
    
    private Object clave;
    private Object valor;

    public ItemDTO() {
    }

    public ItemDTO(Object clave, Object valor) {
        this.clave = clave;
        this.valor = valor;
    }


    public void setClave(Object clave) {
        this.clave = clave;
    }

    public Object getClave() {
        return clave;
    }

    public void setValor(Object valor) {
        this.valor = valor;
    }

    public Object getValor() {
        return valor;
    }
}
