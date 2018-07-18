package gob.shcp.sireh.domain.jdbc;

import gob.shcp.fsn.data.Domain;

import java.io.Serializable;

public class CustomTdNmHistorico extends TdNmHistorico implements Domain, 
                                                                  Serializable {
    private String dice;
    private String debeDecir;
    private String rfcUnico;

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

    public String getRfcUnico() {
        return rfcUnico;
    }

    public void setRfcUnico(String rfcUnico) {
        this.rfcUnico = rfcUnico;
    }


}
