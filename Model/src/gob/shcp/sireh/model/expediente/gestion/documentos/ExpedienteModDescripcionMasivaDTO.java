package gob.shcp.sireh.model.expediente.gestion.documentos;

import gob.shcp.fsn.model.Model;

import org.springmodules.validation.bean.conf.loader.annotation.handler.ValidationMethod;

public class ExpedienteModDescripcionMasivaDTO implements Model{
    
    public String idDocto;
    public String dsdDescripDocto;
    public String descripcionDice;
    public String descripcionComplementaria;
    
    public String urlOrigen;
    public String urlDestino;
    
    private boolean registrar;
    
    
    public ExpedienteModDescripcionMasivaDTO() {
    }

    public void setIdDocto(String idDocto) {
        this.idDocto = idDocto;
    }

    public String getIdDocto() {
        return idDocto;
    }

    public void setDsdDescripDocto(String dsdDescripDocto) {
        this.dsdDescripDocto = dsdDescripDocto;
    }

    public String getDsdDescripDocto() {
        return dsdDescripDocto;
    }

    public void setDescripcionDice(String descripcionDice) {
        this.descripcionDice = descripcionDice;
    }

    public String getDescripcionDice() {
        return descripcionDice;
    }

    public void setUrlOrigen(String urlOrigen) {
        this.urlOrigen = urlOrigen;
    }

    public String getUrlOrigen() {
        return urlOrigen;
    }

    public void setUrlDestino(String urlDestino) {
        this.urlDestino = urlDestino;
    }

    public String getUrlDestino() {
        return urlDestino;
    }
    
    public void setRegistrar(boolean registrar) {
        this.registrar = registrar;
    }

    public boolean isRegistrar() {
        return registrar;
    }

    @ValidationMethod(forProperty = "descripcionDice", errorCode = "not.null")
    public boolean validateDescripcionDice() {
        if (this.isRegistrar()) {
            return this.getDescripcionDice() != null && this.getDescripcionDice().length() > 0;
        }
        return true;
    }

    
    @ValidationMethod(forProperty = "idDocto", errorCode = "not.null")
    public boolean validateIdDocto() {
        if (this.isRegistrar()) {
            return this.getIdDocto() != null && this.getIdDocto().length() > 0;
        }
        return true;
    }
    
    @ValidationMethod(forProperty = "dsdDescripDocto", errorCode = "not.null")
    public boolean validateDsdDescripDocto() {
        if (this.isRegistrar()) {
            return this.getDsdDescripDocto() != null && this.getDsdDescripDocto().length() > 0;
        }
        return true;
    }

    public void setDescripcionComplementaria(String descripcionComplementaria) {
        this.descripcionComplementaria = descripcionComplementaria;
    }

    public String getDescripcionComplementaria() {
        return descripcionComplementaria;
    }
}
