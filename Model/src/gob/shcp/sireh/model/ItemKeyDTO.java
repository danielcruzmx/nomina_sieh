package gob.shcp.sireh.model;

import gob.shcp.fsn.model.Model;

import java.io.Serializable;

public class ItemKeyDTO implements Serializable, Model {

    private Object key;
    private Object value;

    public ItemKeyDTO() {
    }

    public ItemKeyDTO(Object key, Object value) {
        this.key = key;
        this.value = value;
    }


    public void setKey(Object key) {
        this.key = key;
    }

    public Object getKey() {
        return key;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    public Object getValue() {
        return value;
    }
}
