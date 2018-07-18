package gob.shcp.sireh.model.nomina;

import gob.shcp.fsn.model.Model;

import java.util.ArrayList;
import java.util.List;

import org.springmodules.validation.bean.conf.loader.annotation.handler.ValidationMethod;

public class CambioEmpleadoPensionesDTO implements java.io.Serializable, Model {

    private boolean delete;
    private java.lang.String rfcEmpleado;
    private java.lang.String nombreEmpleado;
    private java.lang.String primerApellido;
    private java.lang.String segundoApellido;
    private java.lang.String statusPension;
    private String[] idPension;
    
    public CambioEmpleadoPensionesDTO(){}

    public void setRfcEmpleado(String rfcEmpleado) {
        this.rfcEmpleado = rfcEmpleado;
    }

    public String getRfcEmpleado() {
        return rfcEmpleado;
    }

    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }

    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    public String getPrimerApellido() {
        return primerApellido;
    }

    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }

    public String getSegundoApellido() {
        return segundoApellido;
    }



    public void setDelete(boolean delete) {
        this.delete = delete;
    }

    public boolean isDelete() {
        return delete;
    }
    
    @ValidationMethod(forProperty="idPensiones", errorCode="error.delete.unselected")
    private boolean validateIdPensiones() {
        if(this.isDelete()) {
            return (this.getIdPension() != null && this.getIdPension().length > 0);
        }
        return true;
    }


    public void setStatusPension(String statusPension) {
        this.statusPension = statusPension;
    }

    public String getStatusPension() {
        return statusPension;
    }

    public void setIdPension(String[] idPension) {
        this.idPension = idPension;
    }

    public String[] getIdPension() {
        return idPension;
    }
}
