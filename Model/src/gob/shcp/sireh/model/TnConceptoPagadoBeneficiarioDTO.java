package gob.shcp.sireh.model;

public class TnConceptoPagadoBeneficiarioDTO extends TnConceptoPagadoBigDTO {
    
    public TnConceptoPagadoBeneficiarioDTO() {
    }
    
    String beneficiario;


    public void setBeneficiario(String beneficiario) {
        this.beneficiario = beneficiario;
    }

    public String getBeneficiario() {
        return beneficiario;
    }
}
