package gob.shcp.sireh.model.nomina;

public class CancelaPagoPkDTO {
    private java.lang.Integer hpDifFolio;
    private java.lang.Long idFolio;
    
    public CancelaPagoPkDTO() { }
    
    public CancelaPagoPkDTO(java.lang.Integer hpDifFolio, java.lang.Long idFolio) { 
        this.hpDifFolio = hpDifFolio;
        this.idFolio = idFolio;
    }


    public void setHpDifFolio(Integer hpDifFolio) {
        this.hpDifFolio = hpDifFolio;
    }

    public Integer getHpDifFolio() {
        return hpDifFolio;
    }

    public void setIdFolio(Long idFolio) {
        this.idFolio = idFolio;
    }

    public Long getIdFolio() {
        return idFolio;
    }
}
