package gob.shcp.sireh.domain.jdbc;

import gob.shcp.fsn.data.Domain;

import java.io.Serializable;

public class CustomTnNmPlantilla extends TnNmPlantilla implements Domain, 
                                                                  Serializable {
    private java.lang.String tdNmrRfc;
    private java.lang.String debeDecir;
    private java.lang.String dice;

    public String getTdNmrRfc() {
        return tdNmrRfc;
    }

    public void setTdNmrRfc(String tdNmrRfc) {
        this.tdNmrRfc = tdNmrRfc;
    }

    public String getDebeDecir() {
        return debeDecir;
    }

    public void setDebeDecir(String debeDecir) {
        this.debeDecir = debeDecir;
    }

    public String getDice() {
        return dice;
    }

    public void setDice(String dice) {
        this.dice = dice;
    }
}
