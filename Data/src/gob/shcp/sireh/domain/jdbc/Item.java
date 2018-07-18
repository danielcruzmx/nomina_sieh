package gob.shcp.sireh.domain.jdbc;

import gob.shcp.fsn.data.Domain;

import java.io.Serializable;

public class Item implements Domain, Serializable {

    private java.lang.String clave;
    private java.lang.String valor;

    public Item() {
    }

    public Item(java.lang.String clave, java.lang.String valor) {
        this.clave = clave;
        this.valor = valor;
    }

    public void setIdentity(Serializable id) {
    }

    public Serializable getIdentity() {
        return null;
    }


    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getClave() {
        return clave;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public String getValor() {
        return valor;
    }
}
