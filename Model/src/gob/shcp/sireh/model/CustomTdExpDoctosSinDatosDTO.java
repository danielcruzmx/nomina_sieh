package gob.shcp.sireh.model;

import gob.shcp.fsn.model.Model;

public class CustomTdExpDoctosSinDatosDTO extends TdExpDoctosSinDatoDTO implements java.io.Serializable, Model{
    private String descDocto;

    public void setDescDocto(String descDocto) {
        this.descDocto = descDocto;
    }

    public String getDescDocto() {
        return descDocto;
    }
}
