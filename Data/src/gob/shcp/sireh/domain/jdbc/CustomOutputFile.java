package gob.shcp.sireh.domain.jdbc;

import gob.shcp.fsn.data.Domain;

import java.io.Serializable;

public class CustomOutputFile implements Domain, Serializable {

    private String registro;

    public CustomOutputFile() {
    }

    public CustomOutputFile(String registro) {
        this.registro = registro;
    }

    public void setRegistro(String registro) {
        this.registro = registro;
    }

    public String getRegistro() {
        return registro;
    }

    public void setIdentity(Serializable id) {
    }

    public Serializable getIdentity() {
        return null;
    }
}
