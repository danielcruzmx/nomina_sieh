package gob.shcp.sireh.model.nomina;

import gob.shcp.fsn.model.Model;
import org.springmodules.validation.bean.conf.loader.annotation.handler.RegExp;
import java.util.Date;

import org.springmodules.validation.bean.conf.loader.annotation.handler.MaxLength;
import org.springmodules.validation.bean.conf.loader.annotation.handler.NotBlank;
import org.springmodules.validation.bean.conf.loader.annotation.handler.ValidationMethod;

/**
 * Model object for transporting Cambio de Domicilio data.
 */
public class CambioDomicilioDTO implements java.io.Serializable, Model  {

    private java.lang.String rfcUnico;
    private java.lang.String primerApellido;
    private java.lang.String segundoApellido;
    private java.lang.String nombreEmpleado;
    private java.lang.String curpEmpleado;
    private java.lang.String imssIssste;
    private java.util.Date ingresoGobFed;
    private java.util.Date ingresoDependencia;
    private java.lang.String clabeEmpleado;
    private java.lang.String puesto;
    private Integer plaza;
    private java.lang.String rfcEmpleado;
    @NotBlank
    private java.lang.String calleParticular;
    //@NotBlank(args="Colonia")
    @NotBlank
    private java.lang.String coloniaParticular;
    @NotBlank
    @MaxLength(15)
    @RegExp("[[0-9]\\(\\)\\s\\-]+")
    private java.lang.String telParticular;
    @NotBlank
    @RegExp("[0-9]{5}")
    private java.lang.String codpostParticular;
    private java.lang.Integer idMuniParticular;
    private java.lang.Integer idEdoParticular;

    /**
     * Constructor for CambioDomicilioDTO class.
     */
    public CambioDomicilioDTO() {
    }
    
    public CambioDomicilioDTO(  java.lang.String rfcUnico,
                                java.lang.String primerApellido,
                                java.lang.String segundoApellido,
                                java.lang.String nombreEmpleado,
                                java.lang.String curpEmpleado,
                                java.lang.String imssIssste,
                                java.util.Date ingresoGobFed,
                                java.util.Date ingresoDependencia,
                                java.lang.String clabeEmpleado,
                                java.lang.String puesto,
                                java.lang.Integer plaza,
                                java.lang.String rfcEmpleado,
                                java.lang.String calleParticular,
                                java.lang.String coloniaParticular,
                                java.lang.String telParticular,
                                java.lang.String codpostParticular,
                                java.lang.Integer idMuniParticular,
                                java.lang.Integer idEdoParticular
                                ) {
        this.rfcUnico = rfcUnico;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
        this.nombreEmpleado = nombreEmpleado;
        this.curpEmpleado = curpEmpleado;
        this.imssIssste = imssIssste;
        this.ingresoGobFed = ingresoGobFed;
        this.ingresoDependencia = ingresoDependencia;
        this.clabeEmpleado = clabeEmpleado;
        this.puesto = puesto;
        this.plaza = plaza;
        this.rfcEmpleado = rfcEmpleado;
        this.calleParticular = calleParticular;
        this.coloniaParticular = coloniaParticular;
        this.telParticular = telParticular;
        this.codpostParticular = codpostParticular;
        this.idMuniParticular = idMuniParticular;
        this.idEdoParticular = idEdoParticular;
    
    }

    public void setRfcUnico(String rfcUnico) {
        this.rfcUnico = rfcUnico;
    }

    public String getRfcUnico() {
        return rfcUnico;
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

    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }

    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public void setCurpEmpleado(String curpEmpleado) {
        this.curpEmpleado = curpEmpleado;
    }

    public String getCurpEmpleado() {
        return curpEmpleado;
    }

    public void setImssIssste(String imssIssste) {
        this.imssIssste = imssIssste;
    }

    public String getImssIssste() {
        return imssIssste;
    }

    public void setIngresoGobFed(Date ingresoGobFed) {
        this.ingresoGobFed = ingresoGobFed;
    }

    public Date getIngresoGobFed() {
        return ingresoGobFed;
    }

    public void setIngresoDependencia(Date ingresoDependencia) {
        this.ingresoDependencia = ingresoDependencia;
    }

    public Date getIngresoDependencia() {
        return ingresoDependencia;
    }

    public void setClabeEmpleado(String clabeEmpleado) {
        this.clabeEmpleado = clabeEmpleado;
    }

    public String getClabeEmpleado() {
        return clabeEmpleado;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPlaza(Integer plaza) {
        this.plaza = plaza;
    }

    public Integer getPlaza() {
        return plaza;
    }

    public void setRfcEmpleado(String rfcEmpleado) {
        this.rfcEmpleado = rfcEmpleado;
    }

    public String getRfcEmpleado() {
        return rfcEmpleado;
    }

    public void setCalleParticular(String calleParticular) {
        this.calleParticular = calleParticular;
    }

    public String getCalleParticular() {
        return calleParticular;
    }

    public void setColoniaParticular(String coloniaParticular) {
        this.coloniaParticular = coloniaParticular;
    }

    public String getColoniaParticular() {
        return coloniaParticular;
    }

    public void setTelParticular(String telParticular) {
        this.telParticular = telParticular;
    }

    public String getTelParticular() {
        return telParticular;
    }

    public void setCodpostParticular(String codpostParticular) {
        this.codpostParticular = codpostParticular;
    }

    public String getCodpostParticular() {
        return codpostParticular;
    }

    public void setIdMuniParticular(Integer idMuniParticular) {
        this.idMuniParticular = idMuniParticular;
    }

    public Integer getIdMuniParticular() {
        return idMuniParticular;
    }

    public void setIdEdoParticular(Integer idEdoParticular) {
        this.idEdoParticular = idEdoParticular;
    }

    public Integer getIdEdoParticular() {
        return idEdoParticular;
    }
    /*** PARA MAS METODOS DE VALIDACION VER: CambioMovimientosPersonalDTO ***/
    @ValidationMethod(forProperty="idMuniParticular", errorCode="error.select.unSelected")
    public boolean validateIdMuniParticular(){
        if(this.getIdMuniParticular() == -1){
            return false;
        } else return true;
    }  
    
    @ValidationMethod(forProperty="idEdoParticular", errorCode="error.select.unSelected")
    public boolean validateIdEdoParticular(){
        if(this.getIdEdoParticular() == 0){
            return false;
        } else return true;
    }
     
}
