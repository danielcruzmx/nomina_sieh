package gob.shcp.sireh.model.expediente;

import gob.shcp.fsn.model.Model;
import gob.shcp.sireh.model.TdExpLabDTO;

import java.util.Date;

public class CustomTdExpLabDTO extends TdExpLabDTO implements java.io.Serializable, Model{
    
    private String descNivelCargo;
    
    // Oficina virtual - Expediente
    private String expSector;
    private String expDoctoRef;
    private String descPais;
    private Date expFecInicial;
    private Date expFecFinal;
    private String expOrganizacion;
    private String descActPrin;


    public void setDescNivelCargo(String descNivelCargo) {
        this.descNivelCargo = descNivelCargo;
    }

    public String getDescNivelCargo() {
        return descNivelCargo;
    }

    public void setExpSector(String expSector) {
        this.expSector = expSector;
    }

    public String getExpSector() {
        return expSector;
    }

    public void setExpDoctoRef(String expDoctoRef) {
        this.expDoctoRef = expDoctoRef;
    }

    public String getExpDoctoRef() {
        return expDoctoRef;
    }

    public void setDescPais(String descPais) {
        this.descPais = descPais;
    }

    public String getDescPais() {
        return descPais;
    }

    public void setExpFecInicial(Date expFecInicial) {
        this.expFecInicial = expFecInicial;
    }

    public Date getExpFecInicial() {
        return expFecInicial;
    }

    public void setExpFecFinal(Date expFecFinal) {
        this.expFecFinal = expFecFinal;
    }

    public Date getExpFecFinal() {
        return expFecFinal;
    }

    public void setExpOrganizacion(String expOrganizacion) {
        this.expOrganizacion = expOrganizacion;
    }

    public String getExpOrganizacion() {
        return expOrganizacion;
    }

    public void setDescActPrin(String descActPrin) {
        this.descActPrin = descActPrin;
    }

    public String getDescActPrin() {
        return descActPrin;
    }
}
