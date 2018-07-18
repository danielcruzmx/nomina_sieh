package gob.shcp.sireh.model.nomina.terceros;

import gob.shcp.fsn.model.Model;

public class ResultadoDTO implements java.io.Serializable, Model{ 
    private int totalRegistros;
    private int totalReg;
    private int totalError;
    private boolean result;


    public void setTotalReg(int totalReg) {
        this.totalReg = totalReg;
    }

    public int getTotalReg() {
        return totalReg;
    }

    public void setTotalError(int totalError) {
        this.totalError = totalError;
    }

    public int getTotalError() {
        return totalError;
    }

    public void setResult(boolean result) {
        this.result = result;
    }

    public boolean isResult() {
        return result;
    }

    public void setTotalRegistros(int totalRegistros) {
        this.totalRegistros = totalRegistros;
    }

    public int getTotalRegistros() {
        return totalRegistros;
    }
}
