package gob.shcp.sireh.domain;

import gob.shcp.fsn.data.Domain;
import gob.shcp.sireh.domain.jdbc.TdExpDoctosSinDatos;

import java.io.Serializable;

public class CustomTdExpDoctosSinDatos extends TdExpDoctosSinDatos implements Domain, Serializable {
    private String descDocto;

    public void setDescDocto(String descDocto) {
        this.descDocto = descDocto;
    }

    public String getDescDocto() {
        return descDocto;
    }
}
