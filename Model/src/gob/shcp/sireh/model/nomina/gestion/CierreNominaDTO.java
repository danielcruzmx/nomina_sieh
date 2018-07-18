package gob.shcp.sireh.model.nomina.gestion;

import gob.shcp.fsn.model.Model;

import java.io.Serializable;

public class CierreNominaDTO implements Serializable, Model {

    private Integer qnaPago;
    
    public void setQnaPago(Integer qnaPago) {
        this.qnaPago = qnaPago;
    }

    public Integer getQnaPago() {
        return qnaPago;
    }
}
