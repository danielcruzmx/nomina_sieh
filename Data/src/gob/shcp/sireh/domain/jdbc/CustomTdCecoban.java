package gob.shcp.sireh.domain.jdbc;

import gob.shcp.fsn.data.Domain;

import java.io.Serializable;

public class CustomTdCecoban implements Domain, Serializable {
    String pUno;
    String pDos;

    public CustomTdCecoban() {
    }

    public CustomTdCecoban(String pUno, String pDos) {
        this.pUno = pUno;
        this.pDos = pDos;
    }

    public void setIdentity(Serializable id) {
    }

    public Serializable getIdentity() {
        return null;
    }

    public void setPUno(String pUno) {
        this.pUno = pUno;
    }

    public String getPUno() {
        return pUno;
    }

    public void setPDos(String pDos) {
        this.pDos = pDos;
    }

    public String getPDos() {
        return pDos;
    }
}
