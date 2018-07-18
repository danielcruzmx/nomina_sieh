package gob.shcp.sireh.domain.jdbc.nomina.terceros;

import gob.shcp.sireh.domain.jdbc.TnComprobanteDig;

public class TnComprobanteDigCorreo extends  TnComprobanteDig{

    private String eMailOficial;
    private String eMailPersonal;
    

    public TnComprobanteDigCorreo(){}

    public TnComprobanteDigCorreo(String eMailOficial,
     String eMailPersonal) {
     this.eMailOficial = eMailOficial;
     this.eMailPersonal = eMailPersonal;
    }

    public void setEMailOficial(String eMailOficial) {
        this.eMailOficial = eMailOficial;
    }

    public String getEMailOficial() {
        return eMailOficial;
    }

    public void setEMailPersonal(String eMailPersonal) {
        this.eMailPersonal = eMailPersonal;
    }

    public String getEMailPersonal() {
        return eMailPersonal;
    }
}
