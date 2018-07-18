package gob.shcp.sireh.model;

import gob.shcp.fsn.model.Model;

public class SelectIntegerStringDTO implements java.io.Serializable, Model {
    private Integer key;
    private String value;

    public SelectIntegerStringDTO() {
    }

    public SelectIntegerStringDTO(Integer key, String value) {
        this.key = key;
        this.value = value;
    }

    public void setKey(Integer key) {
        this.key = key;
    }

    public Integer getKey() {
        return key;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
