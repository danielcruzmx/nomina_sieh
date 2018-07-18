package gob.shcp.sireh.domain.jdbc;

import gob.shcp.fsn.data.Domain;

import java.io.Serializable;

public class TcTipoDocExpAux implements Domain, Serializable {
    private String descDocto;


    public void setDescDocto(String descDocto) {
        this.descDocto = descDocto;
    }

    public String getDescDocto() {
        return descDocto;
    }

    public void setIdentity(Serializable id) {
    }

    public Serializable getIdentity() {
        return null;
    }
}
