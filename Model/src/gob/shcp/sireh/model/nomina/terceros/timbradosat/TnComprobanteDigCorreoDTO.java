package gob.shcp.sireh.model.nomina.terceros.timbradosat;

public class TnComprobanteDigCorreoDTO extends TnComprobanteDigDTO {

    private String eMailOficial;
    private String eMailPersonal;

    public TnComprobanteDigCorreoDTO(String eMailOficial, String eMailPersonal) {
        this.eMailOficial = eMailOficial;
        this.eMailPersonal = eMailPersonal;
    }
    
    public TnComprobanteDigCorreoDTO() {
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
