package gob.shcp.sireh.model.nomina.terceros.timbradosat.rest;

import java.io.Serializable;

public class PeticionCadena implements Serializable {

    private Integer idNomina;
    private Integer cnFolio;
    private Integer cnPaquete;

    public void setIdNomina(Integer idNomina) {
        this.idNomina = idNomina;
    }

    public Integer getIdNomina() {
        return idNomina;
    }

    public void setCnFolio(Integer cnFolio) {
        this.cnFolio = cnFolio;
    }

    public Integer getCnFolio() {
        return cnFolio;
    }

    public void setCnPaquete(Integer cnPaquete) {
        this.cnPaquete = cnPaquete;
    }

    public Integer getCnPaquete() {
        return cnPaquete;
    }
}
