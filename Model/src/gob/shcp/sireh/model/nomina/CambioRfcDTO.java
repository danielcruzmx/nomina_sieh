package gob.shcp.sireh.model.nomina;

import gob.shcp.fsn.model.Model;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import java.util.Calendar;
import java.util.Date;

import org.springmodules.validation.bean.conf.loader.annotation.handler.NotBlank;
import org.springmodules.validation.bean.conf.loader.annotation.handler.RegExp;
import org.springmodules.validation.bean.conf.loader.annotation.handler.ValidationMethod;

/**
 * Model object for transporting CambioRfc data.
 */
public class CambioRfcDTO implements java.io.Serializable, Model {

    
    private java.lang.String rfcEmpleado;
    private java.lang.String primerApellido;
    private java.lang.String segundoApellido;
    private java.lang.String nombreEmpleado;
    private java.lang.String curpEmpleado;
    private java.lang.String imssIssste;
    private java.util.Date ingresoGobFed;
    private java.util.Date ingresoDependencia;
    private java.lang.String clabeEmpleado;
    private java.lang.String idPuestoNom;
    private java.lang.Integer idPlaza;
    @NotBlank
    @RegExp("^[A-Z]{4}[0-9]{6}[A-Z0-9]{3}$")
    private java.lang.String rfcNuevo;
    
    /**
     * Constructor for CambioRfcDTO class.
     */
    public CambioRfcDTO() {
    }

    /**
     * Constructor for CambioRfcDTO class.
     *
     * @param rfcNuevo java.lang.String
     * @param primerApellido java.lang.String
     * @param segundoApellido java.lang.String
     * @param nombreEmpleado java.lang.String
     * @param curpEmpleado java.lang.String
     * @param imssIssste java.lang.String
     * @param ingresoGobFed java.util.Date
     * @param ingresoDependencia java.util.Date
     * @param clabeEmpleado java.lang.String
     * @param idPuestoNom java.lang.String
     * @param idPlaza Integer
     * @param rfcEmpleado java.lang.String
     */
    public CambioRfcDTO(java.lang.String rfcNuevo, 
                        java.lang.String primerApellido, 
                        java.lang.String segundoApellido, 
                        java.lang.String nombreEmpleado, 
                        java.lang.String curpEmpleado, 
                        java.lang.String imssIssste, 
                        java.util.Date ingresoGobFed, 
                        java.util.Date ingresoDependencia, 
                        java.lang.String clabeEmpleado, 
                        java.lang.String idPuestoNom, 
                        Integer idPlaza, 
                        java.lang.String rfcEmpleado) {

        this.rfcNuevo = rfcNuevo;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
        this.nombreEmpleado = nombreEmpleado;
        this.curpEmpleado = curpEmpleado;
        this.imssIssste = imssIssste;
        this.ingresoGobFed = ingresoGobFed;
        this.ingresoDependencia = ingresoDependencia;
        this.clabeEmpleado = clabeEmpleado;
        this.idPuestoNom = idPuestoNom;
        this.idPlaza = idPlaza;
        this.rfcEmpleado = rfcEmpleado;
    }



    public String getPrimerApellido() {
        return primerApellido;
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    public String getSegundoApellido() {
        return segundoApellido;
    }

    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }

    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }

    public String getCurpEmpleado() {
        return curpEmpleado;
    }

    public void setCurpEmpleado(String curpEmpleado) {
        this.curpEmpleado = curpEmpleado;
    }

    public String getImssIssste() {
        return imssIssste;
    }

    public void setImssIssste(String imssIssste) {
        this.imssIssste = imssIssste;
    }

    public Date getIngresoGobFed() {
        return ingresoGobFed;
    }

    public void setIngresoGobFed(Date ingresoGobFed) {
        this.ingresoGobFed = ingresoGobFed;
    }

    public Date getIngresoDependencia() {
        return ingresoDependencia;
    }

    public void setIngresoDependencia(Date ingresoDependencia) {
        this.ingresoDependencia = ingresoDependencia;
    }

    public String getClabeEmpleado() {
        return clabeEmpleado;
    }

    public void setClabeEmpleado(String clabeEmpleado) {
        this.clabeEmpleado = clabeEmpleado;
    }

    public String getRfcEmpleado() {
        return rfcEmpleado;
    }

    public void setRfcEmpleado(String rfcEmpleado) {
        this.rfcEmpleado = rfcEmpleado;
    }

    public void setRfcNuevo(String rfcNuevo) {
        this.rfcNuevo = rfcNuevo;
    }

    public String getRfcNuevo() {
        return rfcNuevo;
    }

    public void setIdPuestoNom(String idPuestoNom) {
        this.idPuestoNom = idPuestoNom;
    }

    public String getIdPuestoNom() {
        return idPuestoNom;
    }

    public void setIdPlaza(Integer idPlaza) {
        this.idPlaza = idPlaza;
    }

    public Integer getIdPlaza() {
        return idPlaza;
    }
    
    @ValidationMethod(forProperty="rfcNuevo", errorCode="not.date")
    public boolean validateRfcNuevo(){

        String fechaNac = rfcNuevo.substring(4,10);
        
        SimpleDateFormat sdf = new SimpleDateFormat( "yyMMdd" );
        sdf.setLenient(false);
        try {
            Date date = sdf.parse(fechaNac);
        } catch (ParseException e) {
            return false;
        }
        
        String homoclave = rfcNuevo.substring(10,13);
        if( homoclave.equals( "000" ) ) {
            return false;
        }

        return true;
    }

}
