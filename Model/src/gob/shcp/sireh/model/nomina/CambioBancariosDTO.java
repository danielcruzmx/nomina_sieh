package gob.shcp.sireh.model.nomina;

import gob.shcp.fsn.model.Model;

import java.util.Date;

import org.springmodules.validation.bean.conf.loader.annotation.handler.Length;
import org.springmodules.validation.bean.conf.loader.annotation.handler.NotBlank;
import org.springmodules.validation.bean.conf.loader.annotation.handler.RegExp;
import org.springmodules.validation.bean.conf.loader.annotation.handler.ValidationMethod;

public class CambioBancariosDTO implements java.io.Serializable, Model{

    private java.lang.String primerApellido;
    private java.lang.String segundoApellido;
    private java.lang.String nombreEmpleado;
    private java.lang.String curpEmpleado;
    private java.lang.String imssIssste;
    private java.util.Date ingresoGobFed;
    private java.util.Date ingresoDependencia;
    private java.lang.String clabeEmpleado;
    private java.lang.String clabeEmpleado1;
    @RegExp("[0-9]*")
    @NotBlank
    @Length(min=15, max = 15)
    private java.lang.String clabeEmpleado2;
    
    private java.lang.String rfcEmpleado;
    private java.lang.String idTipoPago;
    private java.lang.Integer idPlazaVigente;
    // Plaza
    private java.lang.String idPuestoNom;
    private java.lang.Integer idPlaza;
    private java.lang.Integer idZonaDistNom;
    private java.lang.String idUnidadNom;
    
    private java.lang.String descBancos;
    private java.lang.String idBanco;
    
    public CambioBancariosDTO() {
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

    public void setRfcEmpleado(String rfcEmpleado) {
        this.rfcEmpleado = rfcEmpleado;
    }

    public String getRfcEmpleado() {
        return rfcEmpleado;
    }

    public void setIdZonaDistNom(Integer idZonaDistNom) {
        this.idZonaDistNom = idZonaDistNom;
    }

    public Integer getIdZonaDistNom() {
        return idZonaDistNom;
    }

    


    public void setIdUnidadNom(String idUnidadNom) {
        this.idUnidadNom = idUnidadNom;
    }

    public String getIdUnidadNom() {
        return idUnidadNom;
    }
    
    public void setIdTipoPago(String idTipoPago) {
        this.idTipoPago = idTipoPago;
    }

    public String getIdTipoPago() {
        return idTipoPago;
    }
    
    public void setIdPlaza(Integer idPlaza) {
        this.idPlaza = idPlaza;
    }

    public Integer getIdPlaza() {
        return idPlaza;
    }
    
    public void setIdPlazaVigente(Integer idPlazaVigente) {
        this.idPlazaVigente = idPlazaVigente;
    }

    public Integer getIdPlazaVigente() {
        return idPlazaVigente;
    }
    

        public void setIdPuestoNom(String idPuestoNom) {
            this.idPuestoNom = idPuestoNom;
        }

        public String getIdPuestoNom() {
            return idPuestoNom;
        }
    @ValidationMethod(forProperty="idZonaDistNom", errorCode="error.select.unspecified")
    public boolean validateIdConcepto(){
        return this.getIdZonaDistNom() != 0;
    }  
    
    @ValidationMethod(forProperty="idTipoPago", errorCode="error.select.unspecified")
    public boolean validateIdTipoPago(){
        return this.getIdTipoPago() != null && !this.getIdTipoPago().equals("0");
    }


    @ValidationMethod(forProperty = "clabeEmpleado", 
                      errorCode = "error.clabeEmpleado.ch")
    public boolean validateClabeEmpleadoCh() {
        if (this.getIdTipoPago() != null && this.getIdTipoPago().equals("CH")) {
            if (this.getClabeEmpleado1() == null || !this.getClabeEmpleado1().equals("000")) {
                return false;
            }
        }
        return true;
    }

    @ValidationMethod(forProperty="clabeEmpleado", errorCode="error.clabeEmpleado.td.digito.verificador")
    public boolean validateClabeEmpleadoTdDigitoVerificador(){
        
    if (this.getIdTipoPago() != null && this.getIdTipoPago().equals("TD")) {
            String clabe = "" + (this.getClabeEmpleado1() != null ? this.getClabeEmpleado1() : "") + (this.getClabeEmpleado2() != null ? this.getClabeEmpleado2() : "");
            if(this.getIdBanco() != null && (this.getIdBanco().equals("0") || this.getIdBanco().equals("000"))){
                return false;
            }
            return this.validaCuenta(clabe);
        }
        return true;
    }
    
    /**
     * Valida que la CLABE bancaria sea válida. Revisa el dígito verificador
     * @param cuenta Número de cuenta
     * @return boolean
     */
    private boolean validaCuenta(String cuenta) {
                    if(cuenta == null || cuenta.equals("") || cuenta.equals("000000000000000000") ){
                        return false;
                    }
                    int factorPeso = 0;
                    int sumadeproductos = 0;
                    int i = 0;
                    for (i = 0; i < cuenta.length() - 1; i++) {
                            switch (i % 3) {
                            case 0:
                                    factorPeso = 3;
                                    break;
                            case 1:
                                    factorPeso = 7;
                                    break;
                            case 2:
                                    factorPeso = 1;
                                    break;
                            }
                            sumadeproductos += (Integer.parseInt("" + cuenta.charAt(i)) * factorPeso) % 10;
                    }
                    int sumadeproductosMod10=sumadeproductos % 10;
                    int digitoControl = (10 - sumadeproductosMod10) % 10;
                    return digitoControl == Integer.parseInt("" + cuenta.charAt(i));
    }


    public void setDescBancos(String descBancos) {
        this.descBancos = descBancos;
    }

    public String getDescBancos() {
        return descBancos;
    }

    public void setIdBanco(String idBanco) {
        this.idBanco = idBanco;
    }

    public String getIdBanco() {
        return idBanco;
    }

    public void setClabeEmpleado2(String clabeEmpleado2) {
        this.clabeEmpleado2 = clabeEmpleado2;
    }

    public String getClabeEmpleado2() {
        return clabeEmpleado2;
    }


    public void setClabeEmpleado1(String clabeEmpleado1) {
        this.clabeEmpleado1 = clabeEmpleado1;
    }

    public String getClabeEmpleado1() {
        return clabeEmpleado1;
    }
}
