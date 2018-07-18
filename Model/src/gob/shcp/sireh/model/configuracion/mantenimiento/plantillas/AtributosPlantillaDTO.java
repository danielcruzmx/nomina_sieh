package gob.shcp.sireh.model.configuracion.mantenimiento.plantillas;

import gob.shcp.fsn.model.Model;

public class AtributosPlantillaDTO implements java.io.Serializable, Model { 
    
    private String start;
    private String end;
    private String type;
    private String beanref;


    public void setStart(String start) {
        this.start = start;
    }

    public String getStart() {
        return start;
    }

    public void setEnd(String end) {
        this.end = end;
    }

    public String getEnd() {
        return end;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setBeanref(String beanref) {
        this.beanref = beanref;
    }

    public String getBeanref() {
        return beanref;
    }
}
