package gob.shcp.sireh.model.nomina;

import gob.shcp.fsn.model.Model;

import gob.shcp.sireh.model.Constants;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import java.util.Calendar;
import java.util.Date;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.lang.time.DateUtils;

import org.springmodules.validation.bean.conf.loader.annotation.handler.ValidationMethod;

public class CambioMovimientosPersonalDTO implements java.io.Serializable, Model, Constants{
    // Datos del mov
    private java.lang.Integer idMovsPersonal;
    private java.lang.String descMovsPersonal;
    private java.lang.String mpTipoMovMenu;
    private java.lang.String idSitPlaNva;
    private java.lang.String idSitPlaAnt;

    
    // Datos del empleado

    private java.lang.String primerApellido;

    private java.lang.String segundoApellido;

    private java.lang.String nombreEmpleado;
    private java.lang.String rfcEmpleado;
    private java.lang.String curpEmpleado;

    private java.lang.String imssIssste;
    private java.util.Date ingresoGobFed;
    private java.util.Date ingresoDependencia;
    private java.lang.String idTipoPago;
    private java.lang.String clabeEmpleado;
    private java.lang.String clabeEmpleado1;
    private java.lang.String clabeEmpleado2;
    private java.lang.String idBanco;
    // Datos de domicilio

    private java.lang.String calleParticular;
    private java.lang.String coloniaParticular;
    private java.lang.String telParticular;

    private java.lang.String codpostParticular;
    private java.lang.Integer idEdoParticular;
    private java.lang.Integer idMuniParticular;
    
    // Datos de Plaza
    private java.lang.Integer idPlaza;
    private java.lang.String descPuesto;
    private java.lang.String idNivelPto;
    private java.lang.Integer idEdo;
    private java.lang.String descEstado;
    private java.lang.Integer idMunicipio;
    private java.lang.String descMunicipio;
    private java.lang.String idUnidadNom;
    private java.lang.String idPuestoNom;
    private java.lang.Integer idZonaEcoNom;
    private java.lang.Double plazaImpHono;
    private java.lang.String descGrupoPago;
    private java.lang.String plazaReferencia;
    private java.util.Date fechaInicial;
    private java.util.Date fechaFinal;
    private java.lang.Integer idZonaDistNom;
    private java.util.Date plazaIniCont;
    private java.util.Date plazaFinCont;
    private java.util.Date plazaIniLic;
    private java.util.Date plazaFinLic;
    private java.lang.Integer idRangoNom;
    private java.lang.String idGrupoPago;
    private java.lang.String idJerarquia;
    private java.lang.String idNombramiento;
    
    // Datos de plaza nueva
     private java.lang.Integer idPlazaPromo;
     private java.lang.String descPuestoPromo;
     private java.lang.String idNivelPtoPromo;
     private java.lang.Integer idEdoPromo;
     private java.lang.String descEstadoPromo;
     private java.lang.Integer idMunicipioPromo;
     private java.lang.String descMunicipioPromo;
     private java.lang.String descGrupoPagoPromo;
     private java.lang.Integer idRangoNomPromo;
     private java.lang.Integer idZonaEcoNomPromo;
     private java.lang.Double plazaImpHonoPromo;
     private java.lang.String idGrupoPagoPromo;
     private java.lang.Integer idZonaDistNomPromo;
     private java.lang.String plazaReferenciaPromo;
     private java.lang.String idJerarquiaPromo;
     private java.lang.String idNombramientoPromo;
     private java.lang.String idUnidadNomPromo;
     private java.lang.String idPuestoNomPromo;
     private java.util.Date plazaIniContPromo;
     private java.util.Date plazaFinContPromo;
    
    // Datos de mostrado de campos
    private java.lang.Boolean alta;
    private java.lang.Boolean altaPorReingreso;
    private java.lang.Boolean baja;
    private java.lang.Boolean promocion;
    private java.lang.Boolean licencia;
    private java.lang.Boolean preventiva;
    private java.lang.Boolean prorroga;
    
    // Quincena de captura
    private Date inicioQuincenaCaptura;
    private Date finQuincenaCaptura;
    
    // Pantalla
     private boolean checkFechaTermino;
     private String header;
    


    public CambioMovimientosPersonalDTO() {
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

    public void setRfcEmpleado(String rfcEmpleado) {
        this.rfcEmpleado = rfcEmpleado;
    }

    public String getRfcEmpleado() {
        return rfcEmpleado;
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

    public void setIdTipoPago(String idTipoPago) {
        this.idTipoPago = idTipoPago;
    }

    public String getIdTipoPago() {
        return idTipoPago;
    }

    public void setClabeEmpleado(String clabeEmpleado) {
        this.clabeEmpleado = clabeEmpleado;
    }

    public String getClabeEmpleado() {
        return clabeEmpleado;
    }

    public void setDescPuesto(String descPuesto) {
        this.descPuesto = descPuesto;
    }

    public String getDescPuesto() {
        return descPuesto;
    }

    public void setIdNivelPto(String idNivelPto) {
        this.idNivelPto = idNivelPto;
    }

    public String getIdNivelPto() {
        return idNivelPto;
    }

    public void setIdEdo(Integer idEdo) {
        this.idEdo = idEdo;
    }

    public Integer getIdEdo() {
        return idEdo;
    }

    public void setDescEstado(String descEstado) {
        this.descEstado = descEstado;
    }

    public String getDescEstado() {
        return descEstado;
    }

    public void setIdMunicipio(Integer idMunicipio) {
        this.idMunicipio = idMunicipio;
    }

    public Integer getIdMunicipio() {
        return idMunicipio;
    }

    public void setDescGrupoPago(String descGrupoPago) {
        this.descGrupoPago = descGrupoPago;
    }

    public String getDescGrupoPago() {
        return descGrupoPago;
    }


    public void setFechaInicial(Date fechaInicial) {
        this.fechaInicial = fechaInicial;
    }

    public Date getFechaInicial() {
        return fechaInicial;
    }

    public void setFechaFinal(Date fechaFinal) {
        this.fechaFinal = fechaFinal;
    }

    public Date getFechaFinal() {
        return fechaFinal;
    }

    public void setIdMovsPersonal(Integer idMovsPersonal) {
        this.idMovsPersonal = idMovsPersonal;
    }

    public Integer getIdMovsPersonal() {
        return idMovsPersonal;
    }

    public void setDescMovsPersonal(String descMovsPersonal) {
        this.descMovsPersonal = descMovsPersonal;
    }

    public String getDescMovsPersonal() {
        return descMovsPersonal;
    }

    public void setMpTipoMovMenu(String mpTipoMovMenu) {
        this.mpTipoMovMenu = mpTipoMovMenu;
    }

    public String getMpTipoMovMenu() {
        return mpTipoMovMenu;
    }

    public void setAlta(Boolean alta) {
        this.alta = alta;
    }

    public Boolean getAlta() {
        return alta;
    }

    public void setAltaPorReingreso(Boolean altaPorReingreso) {
        this.altaPorReingreso = altaPorReingreso;
    }

    public Boolean getAltaPorReingreso() {
        return altaPorReingreso;
    }

    public void setBaja(Boolean baja) {
        this.baja = baja;
    }

    public Boolean getBaja() {
        return baja;
    }

    public void setPromocion(Boolean promocion) {
        this.promocion = promocion;
    }

    public Boolean getPromocion() {
        return promocion;
    }

    public void setLicencia(Boolean licencia) {
        this.licencia = licencia;
    }

    public Boolean getLicencia() {
        return licencia;
    }

    public void setProrroga(Boolean prorroga) {
        this.prorroga = prorroga;
    }

    public Boolean getProrroga() {
        return prorroga;
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

    public void setIdEdoParticular(Integer idEdoParticular) {
        this.idEdoParticular = idEdoParticular;
    }

    public Integer getIdEdoParticular() {
        return idEdoParticular;
    }

    public void setIdMuniParticular(Integer idMuniParticular) {
        this.idMuniParticular = idMuniParticular;
    }

    public Integer getIdMuniParticular() {
        return idMuniParticular;
    }

    public Integer get_idPlaza() {
        return idPlaza;
    }

    public void setIdPlazaPromo(Integer idPlazaPromo) {
        this.idPlazaPromo = idPlazaPromo;
    }

    public Integer getIdPlazaPromo() {
        return idPlazaPromo;
    }

    public void setDescPuestoPromo(String descPuestoPromo) {
        this.descPuestoPromo = descPuestoPromo;
    }

    public String getDescPuestoPromo() {
        return descPuestoPromo;
    }

    public void setIdNivelPtoPromo(String idNivelPtoPromo) {
        this.idNivelPtoPromo = idNivelPtoPromo;
    }

    public String getIdNivelPtoPromo() {
        return idNivelPtoPromo;
    }

    public void setIdEdoPromo(Integer idEdoPromo) {
        this.idEdoPromo = idEdoPromo;
    }

    public Integer getIdEdoPromo() {
        return idEdoPromo;
    }

    public void setDescEstadoPromo(String descEstadoPromo) {
        this.descEstadoPromo = descEstadoPromo;
    }

    public String getDescEstadoPromo() {
        return descEstadoPromo;
    }

    public void setIdMunicipioPromo(Integer idMunicipioPromo) {
        this.idMunicipioPromo = idMunicipioPromo;
    }

    public Integer getIdMunicipioPromo() {
        return idMunicipioPromo;
    }



    public void setDescGrupoPagoPromo(String descGrupoPagoPromo) {
        this.descGrupoPagoPromo = descGrupoPagoPromo;
    }

    public String getDescGrupoPagoPromo() {
        return descGrupoPagoPromo;
    }

    public void setIdRangoNomPromo(Integer idRangoNomPromo) {
        this.idRangoNomPromo = idRangoNomPromo;
    }

    public Integer getIdRangoNomPromo() {
        return idRangoNomPromo;
    }

    public void setIdZonaEcoNomPromo(Integer idZonaEcoNomPromo) {
        this.idZonaEcoNomPromo = idZonaEcoNomPromo;
    }

    public Integer getIdZonaEcoNomPromo() {
        return idZonaEcoNomPromo;
    }



    public void setIdGrupoPagoPromo(String idGrupoPagoPromo) {
        this.idGrupoPagoPromo = idGrupoPagoPromo;
    }

    public String getIdGrupoPagoPromo() {
        return idGrupoPagoPromo;
    }

    public void setIdZonaDistNomPromo(Integer idZonaDistNomPromo) {
        this.idZonaDistNomPromo = idZonaDistNomPromo;
    }

    public Integer getIdZonaDistNomPromo() {
        return idZonaDistNomPromo;
    }

    public void setPlazaReferenciaPromo(String plazaReferenciaPromo) {
        this.plazaReferenciaPromo = plazaReferenciaPromo;
    }

    public String getPlazaReferenciaPromo() {
        return plazaReferenciaPromo;
    }

    public void setInicioQuincenaCaptura(Date inicioQuincenaCaptura) {
        this.inicioQuincenaCaptura = inicioQuincenaCaptura;
    }

    public Date getInicioQuincenaCaptura() {
        return inicioQuincenaCaptura;
    }

    public void setFinQuincenaCaptura(Date finQuincenaCaptura) {
        this.finQuincenaCaptura = finQuincenaCaptura;
    }

    public Date getFinQuincenaCaptura() {
        return finQuincenaCaptura;
    }
    
    public void setPlazaReferencia(String plazaReferencia) {
        this.plazaReferencia = plazaReferencia;
    }

    public String getPlazaReferencia() {
        return plazaReferencia;
    }
    
    public void setIdSitPlaAnt(String idSitPlaAnt) {
        this.idSitPlaAnt = idSitPlaAnt;
    }

    public String getIdSitPlaAnt() {
        return idSitPlaAnt;
    }

    public void setIdSitPlaNva(String idSitPlaNva) {
        this.idSitPlaNva = idSitPlaNva;
    }

    public String getIdSitPlaNva() {
        return idSitPlaNva;
    }

    public void setIdPlaza(Integer idPlaza) {
        this.idPlaza = idPlaza;
    }

    public Integer getIdPlaza() {
        return idPlaza;
    }

    public void setIdUnidadNom(String idUnidadNom) {
        this.idUnidadNom = idUnidadNom;
    }

    public String getIdUnidadNom() {
        return idUnidadNom;
    }

    public void setIdPuestoNom(String idPuestoNom) {
        this.idPuestoNom = idPuestoNom;
    }

    public String getIdPuestoNom() {
        return idPuestoNom;
    }

    public void setIdZonaEcoNom(Integer idZonaEcoNom) {
        this.idZonaEcoNom = idZonaEcoNom;
    }

    public Integer getIdZonaEcoNom() {
        return idZonaEcoNom;
    }

    public void setIdZonaDistNom(Integer idZonaDistNom) {
        this.idZonaDistNom = idZonaDistNom;
    }

    public Integer getIdZonaDistNom() {
        return idZonaDistNom;
    }

    public void setPlazaIniCont(Date plazaIniCont) {
        this.plazaIniCont = plazaIniCont;
    }

    public Date getPlazaIniCont() {
        return plazaIniCont;
    }

    public void setPlazaFinCont(Date plazaFinCont) {
        this.plazaFinCont = plazaFinCont;
    }

    public Date getPlazaFinCont() {
        return plazaFinCont;
    }

    public void setIdRangoNom(Integer idRangoNom) {
        this.idRangoNom = idRangoNom;
    }

    public Integer getIdRangoNom() {
        return idRangoNom;
    }

    public void setIdGrupoPago(String idGrupoPago) {
        this.idGrupoPago = idGrupoPago;
    }

    public String getIdGrupoPago() {
        return idGrupoPago;
    }

    public void setIdJerarquia(String idJerarquia) {
        this.idJerarquia = idJerarquia;
    }

    public String getIdJerarquia() {
        return idJerarquia;
    }

    public void setIdNombramiento(String idNombramiento) {
        this.idNombramiento = idNombramiento;
    }

    public String getIdNombramiento() {
        return idNombramiento;
    }

    public void setIdJerarquiaPromo(String idJerarquiaPromo) {
        this.idJerarquiaPromo = idJerarquiaPromo;
    }

    public String getIdJerarquiaPromo() {
        return idJerarquiaPromo;
    }

    public void setIdNombramientoPromo(String idNombramientoPromo) {
        this.idNombramientoPromo = idNombramientoPromo;
    }

    public String getIdNombramientoPromo() {
        return idNombramientoPromo;
    }

    public void setIdUnidadNomPromo(String idUnidadNomPromo) {
        this.idUnidadNomPromo = idUnidadNomPromo;
    }

    public String getIdUnidadNomPromo() {
        return idUnidadNomPromo;
    }

    public void setIdPuestoNomPromo(String idPuestoNomPromo) {
        this.idPuestoNomPromo = idPuestoNomPromo;
    }

    public String getIdPuestoNomPromo() {
        return idPuestoNomPromo;
    }

    public void setCheckFechaTermino(boolean checkFechaTermino) {
        this.checkFechaTermino = checkFechaTermino;
    }

    public boolean isCheckFechaTermino() {
        return checkFechaTermino;
    }
    
    

    
    @ValidationMethod(forProperty="nombreEmpleado", errorCode="not.blank")
    public boolean validateNombreEmpleado(){
        if(this.getAlta() || this.getAltaPorReingreso()){
            return this.getNombreEmpleado() != null && this.getNombreEmpleado().length() > 0;
        }
        return true;
    }
    
    @ValidationMethod(forProperty="rfcEmpleado", errorCode="not.blank")
    public boolean validateRfcEmpleadoBlank(){
        if(this.getAlta() || this.getAltaPorReingreso()){
            return this.getRfcEmpleado() != null && this.getRfcEmpleado().length() > 0;
        }
        return true;
    }
     
    @ValidationMethod(forProperty="rfcEmpleado", errorCode="regexp")
    public boolean validateRfcEmpleadoRegexp(){
        if(this.getAlta() || this.getAltaPorReingreso()){
            
            String pattern1 = "^[A-Z]{4}[0-9]{6}[A-Z0-9]{3}$";
            String pattern2 = "^[A-Z]{4}[0-9]{6}(?!000)";

            Pattern r1 = Pattern.compile(pattern1);
            Pattern r2 = Pattern.compile(pattern2);

            return this.getRfcEmpleado() != null && r1.matcher(this.getRfcEmpleado()).find() && r2.matcher(this.getRfcEmpleado()).find();
        }
        return true;
    }
    
    @ValidationMethod(forProperty="curpEmpleado", errorCode="not.blank")
    public boolean validateCurpEmpleadoBlank(){
        if(this.getAlta() || this.getAltaPorReingreso()){
            return this.getCurpEmpleado() != null && this.getCurpEmpleado().length() > 0;
        }
        return true;
    }    
    
    @ValidationMethod(forProperty="curpEmpleado", errorCode="regexp")
    public boolean validateCurpEmpleadoRegexp(){
        if(this.getAlta() || this.getAltaPorReingreso()){
            return this.getCurpEmpleado() != null && this.getCurpEmpleado().matches("[A-Z][A,E,I,O,U,X][A-Z]{2}[0-9]{2}[0-1][0-9][0-3][0-9][M,H][A-Z]{2}[B,C,D,F,G,H,J,K,L,M,N,Ñ,P,Q,R,S,T,V,W,X,Y,Z]{3}[0-9,A-Z][0-9]");
        }
        return true;
    }
    
    @ValidationMethod(forProperty="imssIssste", errorCode="regexp")
    public boolean validateImssIssste(){
        if(this.getAlta() || this.getAltaPorReingreso()){
            return this.getImssIssste() != null && this.getImssIssste().matches("[0-9]+");
        }
        return true;
    }
    

    @ValidationMethod(forProperty="calleParticular", errorCode="regexp")
    public boolean validateCalleParticular(){
        if(this.getAlta() || this.getAltaPorReingreso()){
            return this.getCalleParticular() != null && this.getCalleParticular().matches("[[a-zA-Z][0-9] áéíóúAÉÍÓÚÑñ'\\-\\.]+");
        }
        return true;
    }
    
    @ValidationMethod(forProperty="telParticular", errorCode="length")
    public boolean validateTelParticularLength(){
        if(this.getAlta() || this.getAltaPorReingreso()){
            return this.getTelParticular() != null && this.getTelParticular().length() <= 15;
        }
        return true;
    }
    
    @ValidationMethod(forProperty="telParticular", errorCode="regexp")
    public boolean validateTelParticularRegexp(){
        if(this.getAlta() || this.getAltaPorReingreso()){
            return this.getTelParticular() != null && this.getTelParticular().matches("[[0-9]\\(\\)\\s\\-]+");
        }
        return true;
    }
    
    @ValidationMethod(forProperty="codpostParticular", errorCode="regexp")
    public boolean validateCodpostParticularRegexp(){
        if(this.getAlta() || this.getAltaPorReingreso()){
            return this.getCodpostParticular() != null && this.getCodpostParticular().matches("[0-9]{5}");
        }
        return true;
    }
    
    @ValidationMethod(forProperty="clabeEmpleado", errorCode="not.blank")
    public boolean validateClabeEmpleadoBlank(){
        if((this.getAlta() || this.getAltaPorReingreso()) && this.getIdTipoPago() != null && this.getIdTipoPago().equals("TD")){
            return this.getClabeEmpleado2() != null && this.getClabeEmpleado2().length() > 0;
        }
        return true;
    }
    
    @ValidationMethod(forProperty="clabeEmpleado", errorCode="regexp")
    public boolean validateClabeEmpleadoRegexp(){
        if((this.getAlta() || this.getAltaPorReingreso()) && this.getIdTipoPago() != null && this.getIdTipoPago().equals("TD")){
            return this.getClabeEmpleado1() != null && this.getClabeEmpleado2() != null && this.getClabeEmpleado1().matches("[0-9]+") && this.getClabeEmpleado2().matches("[0-9]+");
        }
        return true;
    }
    
    @ValidationMethod(forProperty="clabeEmpleado", errorCode="length")
    public boolean validateClabeEmpleadoLength(){
        if ((this.getAlta() || this.getAltaPorReingreso()) && this.getIdTipoPago() != null && this.getIdTipoPago().equals("TD") ) {
            return this.getClabeEmpleado2() != null && this.getClabeEmpleado2().length() == 15;
        }
        return true;
    }
     
    @ValidationMethod(forProperty="idTipoPago", errorCode="error.select.unspecified")
    public boolean validateIdTipoPago(){
        if(this.getAlta() || this.getAltaPorReingreso()){
            return  this.getIdTipoPago() != null && !this.getIdTipoPago().equals("0");
        }
        return true;
    }  
    
    @ValidationMethod(forProperty="clabeEmpleado", errorCode="error.clabeEmpleado.ch")
    public boolean validateClabeEmpleadoCh(){
        if ((this.getAlta() || this.getAltaPorReingreso()) && this.getIdTipoPago()!= null && this.getIdTipoPago().equals("CH")) {
            if (this.getClabeEmpleado1() == null || !this.getClabeEmpleado1().equals("000")) {
                return false;
            }
        }
        return true;
    }


    @ValidationMethod(forProperty = "clabeEmpleado", errorCode = "error.clabeEmpleado.td.digito.verificador")
    public boolean validateClabeEmpleadoTdDigitoVerificador() {
        if ((this.getAlta() || this.getAltaPorReingreso()) && this.getIdTipoPago() != null && this.getIdTipoPago().equals("TD")) {
            if (this.getIdBanco() != null && (this.getIdBanco().equals("0") || this.getIdBanco().equals("000"))) {
                return false;
            }
            String clabe = "" + (this.getClabeEmpleado1() != null ? this.getClabeEmpleado1() : "") + (this.getClabeEmpleado2() != null ? this.getClabeEmpleado2() : "");
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
        int sumadeproductosMod10 = sumadeproductos % 10;
        int digitoControl = (10 - sumadeproductosMod10) % 10;
        return digitoControl == Integer.parseInt("" + cuenta.charAt(i));
    }


    @ValidationMethod(forProperty="idMuniParticular", errorCode="error.select.unspecified")
    public boolean validateIdMuniParticular(){
        if(this.getAlta() || this.getAltaPorReingreso()){
            return this.getIdMuniParticular() != null && this.getIdMuniParticular() != -1 ;
        }
        return true;
    }  
    
    @ValidationMethod(forProperty="idEdoParticular", errorCode="error.select.unspecified")
    public boolean validateIdEdoParticular(){
        if(this.getAlta() || this.getAltaPorReingreso()){
            return this.getIdEdoParticular() != null && this.getIdEdoParticular() != 0;
        }
        return true;
    }

    // las fechas deben ser iguales        
    @ValidationMethod(forProperty = "fechaInicial", errorCode = "fecha.invalida.baja.rango")
    public boolean validateFechasBajaRango() {
        if (this.getBaja() || this.getPreventiva()) {
            if (this.getFechaInicial() == null || this.getFechaFinal() == null) {
                return false;
            }

            if (!DateUtils.truncate(this.getFechaInicial(), Calendar.DATE).equals(DateUtils.truncate(this.getFechaFinal(), Calendar.DATE))) {
                return false;
            }
        }
        return true;
    }

    // La fecha de baja debe ser menor o igual que la fecha de Inicio de la Quincena de captura
    @ValidationMethod(forProperty = "fechaInicial", errorCode = "fecha.invalida.baja.quincena")
    public boolean validateFechasBajaQuincena() {
        if ( this.getBaja()  ) {
            if (this.getFechaInicial() == null || this.getFechaFinal() == null) {
                return false;
            }
        
            if (DateUtils.truncate(this.getFechaFinal(), Calendar.DATE).after(DateUtils.truncate(this.getInicioQuincenaCaptura(), Calendar.DATE))){
                return false;
            }
        }
        return true;
    }
        
        // la fecha inicial debe ser menor a la fecha final
    @ValidationMethod(forProperty = "fechaInicial", errorCode = "fecha.invalida.alta.rango")
    public boolean validateFechasAltaRango() {
        if ( this.getAlta() || this.getAltaPorReingreso() || this.getPromocion() || this.getLicencia() || this.getProrroga()) {
            if (this.getFechaInicial() == null || (this.getFechaFinal() == null && !this.isCheckFechaTermino())) {
                return false;
            }
        
            if (!DateUtils.truncate(this.isCheckFechaTermino() ? getFechaInfinita() : this.getFechaFinal(), Calendar.DATE).after(DateUtils.truncate(this.getFechaInicial(), Calendar.DATE))){
                return false;
            }
        }
        return true;
    }


    
    // la fecha inicial debe estar dentro de la fecha de liberacion de plaza
        @ValidationMethod(forProperty = "fechaInicial", errorCode = "fechaInicial.invalida.alta.liberacion")
        public boolean validateFechaInicialAltaLiberacion() {
            if ( this.getAlta() || this.getAltaPorReingreso() || this.getProrroga()) {
                if (this.getFechaInicial() == null || this.getPlazaIniCont() == null ) {
                    return false;
            }

            if (DateUtils.truncate(this.getFechaInicial(), Calendar.DATE).before(DateUtils.truncate(this.getPlazaIniCont(), Calendar.DATE))) {
                return false;
            }
        }
        return true;
    }
    
    // la fecha final debe estar dentro de la fecha de liberacion de plaza
        @ValidationMethod(forProperty = "fechaFinal", errorCode = "fechaFinal.invalida.alta.liberacion")
        public boolean validateFechaFinalAltaLiberacion() {
            if ( this.getAlta() || this.getAltaPorReingreso() || this.getProrroga()) {
                if ((this.getFechaFinal() == null && !this.isCheckFechaTermino()) || this.getPlazaFinCont() == null ) {
                    return false;
                }

            if (DateUtils.truncate(this.isCheckFechaTermino() ? this.getFechaInfinita() : this.getFechaFinal(), Calendar.DATE).after(DateUtils.truncate(this.getPlazaFinCont(),  Calendar.DATE))) {
                return false;
            }
        }
        return true;
    }

    // la fecha inicial debe estar dentro de la fecha de Licencia
    // Fecha inicial >= Fecha inicio Licencia
//    @ValidationMethod(forProperty = "fechaInicial", errorCode = "fechaInicial.invalida.alta.plazainilic")
//    public boolean validateFechaInicialVsPlazaIniLic() {
//        if (this.getLicencia()) {
//            if (this.getFechaInicial() == null || this.getPlazaIniLic() == null) {
//                return false;
//            }
//
//            if (DateUtils.truncate(this.getFechaInicial(), Calendar.DATE).before(DateUtils.truncate(this.getPlazaIniLic(), Calendar.DATE))) {
//                return false;
//            }
//        }
//        return true;
//    }

    // la fecha final debe estar dentro de la fecha de Licencia
    // Fecha final <= Fecha final Licencia
//    @ValidationMethod(forProperty = "fechaFinal", errorCode = "fechaFinal.invalida.alta.plazafinlic")
//    public boolean validateFechaFinalVsPlazaFinLi() {
//        if (this.getLicencia()) {
//            if ((this.getFechaFinal() == null && 
//                 !this.isCheckFechaTermino()) || 
//                this.getPlazaFinLic() == null) {
//                return false;
//            }
//
//            if (DateUtils.truncate(this.isCheckFechaTermino() ? 
//                                   this.getFechaInfinita() : 
//                                   this.getFechaFinal(), 
//                                   Calendar.DATE).after(DateUtils.truncate(this.getPlazaFinLic(), 
//                                                                           Calendar.DATE))) {
//                return false;
//            }
//        }
//        return true;
//    }


    // la fecha inicial PROMOCION debe estar dentro de la fecha de liberacion de plaza 
        @ValidationMethod(forProperty = "fechaInicial", errorCode = "fechaInicial.invalida.alta.liberacion")
        public boolean validateFechaInicialAltaLiberacionPromocion() {
            if ( this.getPromocion()) {
                if (this.getFechaInicial() == null || this.getPlazaIniContPromo() == null ) {
                    return false;
            }

            if (DateUtils.truncate(this.getFechaInicial(), Calendar.DATE).before(DateUtils.truncate(this.getPlazaIniContPromo(), Calendar.DATE))) {
                return false;
            }
        }
        return true;
    }
    
    // la fecha final PROMOCION debe estar dentro de la fecha de liberacion de plaza
        @ValidationMethod(forProperty = "fechaFinal", errorCode = "fechaFinal.invalida.alta.liberacion")
        public boolean validateFechaFinalAltaLiberacionPromocion() {
            if ( this.getPromocion()) {
                if ((this.getFechaFinal() == null && !this.isCheckFechaTermino()) || this.getPlazaFinContPromo() == null ) {
                    return false;
                }

            if (DateUtils.truncate(this.isCheckFechaTermino() ? this.getFechaInfinita() : this.getFechaFinal(), Calendar.DATE).after(DateUtils.truncate(this.getPlazaFinContPromo(),  Calendar.DATE))) {
                return false;
            }
        }
        return true;
    }
    

    // La fecha inicial de Alta debe estar antes <= de la inicial de quincena de captura
        @ValidationMethod(forProperty = "fechaInicial", errorCode = "fechaInicial.invalida.alta.quincena")
        public boolean validateFechaInicialAltaQuincena() {
            if ( this.getAlta() || this.getAltaPorReingreso() || this.getPromocion() || this.getProrroga() ) {
                if (this.getFechaInicial() == null) {
                    return false;
                }
                if (DateUtils.truncate(this.getFechaInicial(), Calendar.DATE).after(DateUtils.truncate(this.getInicioQuincenaCaptura(), Calendar.DATE))){
                    return false;
                }
            }
            return true;
        }
        
    // La fecha final de Alta debe estar despues >= de la final de quincena de captura
        @ValidationMethod(forProperty = "fechaFinal", errorCode = "fechaFinal.invalida.alta.quincena")
        public boolean validateFechaFinalAltaQuincena() {
            if ( this.getAlta() || this.getAltaPorReingreso() || this.getPromocion() || this.getLicencia() || this.getProrroga() ) {
                if (this.getFechaFinal() == null && !this.isCheckFechaTermino()) {
                    return false;
                }
                if (DateUtils.truncate(this.isCheckFechaTermino() ? this.getFechaInfinita() : this.getFechaFinal(), Calendar.DATE).before(DateUtils.truncate(this.getFinQuincenaCaptura(), Calendar.DATE))){
                    return false;
                }
            }
            return true;
        }
        
        
    // La fecha inicial de Licencia debe estar antes <= de la final de quincena de captura
        @ValidationMethod(forProperty = "fechaInicial", errorCode = "fechaInicial.invalida.licencia.alta.quincena")
        public boolean validateFechaInicialAltaLicenciaQuincena() {
            if ( this.getLicencia() || this.getPreventiva() ) {
                if (this.getFechaInicial() == null) {
                    return false;
                }
                if (DateUtils.truncate(this.getFechaInicial(), Calendar.DATE).after(DateUtils.truncate(this.getFinQuincenaCaptura(), Calendar.DATE))){
                    return false;
                }
            }
            return true;
        }

    @ValidationMethod(forProperty="ingresoGobFed", errorCode="error.calendar.unspecified")
    public boolean validateIngresoGobFed(){
        return this.getIngresoGobFed() != null;
    }  
    
    @ValidationMethod(forProperty="ingresoDependencia", errorCode="error.calendar.unspecified")
    public boolean validateIngresoDependencia(){
        return this.getIngresoDependencia() != null;
    }  
    
    @ValidationMethod(forProperty="idZonaDistNom", errorCode="error.select.unspecified")
    public boolean validateIdZonaDistNom(){
        if ( (this.getAlta() != null && this.getAlta() ) || (this.getAltaPorReingreso() != null && this.getAltaPorReingreso() )) {
            return  this.getIdZonaDistNom() != null && this.getIdZonaDistNom() != 0;
        }  
        return true;
    }
    
    @ValidationMethod(forProperty="idZonaDistNomPromo", errorCode="error.select.unspecified")
    public boolean validateIdZonaDistNomPromo(){
        if ( (this.getPromocion() != null && this.getPromocion() ) ) {
            return  this.getIdZonaDistNomPromo() != null && this.getIdZonaDistNomPromo() != 0;
        }  
        return true;
    }
    
    @ValidationMethod(forProperty="idPlazaPromo", errorCode="not.blank")
    public boolean validateIdPlazaPromo(){
        if ( this.getPromocion() != null && this.getPromocion() )  {
            return  this.getIdPlazaPromo() != null;
        }  
        return true;
    }
    
    @ValidationMethod(forProperty="plazaReferencia", errorCode="not.blank")
    public boolean validatePlazaReferencia(){
        return this.getPlazaReferencia() != null && this.getPlazaReferencia().length() > 0;
    }




    private Date getFechaInfinita() {
        SimpleDateFormat formatoDelTexto = new SimpleDateFormat("yyyy-MM-dd");
        Date ap_fin = new Date();
        try {
            ap_fin = formatoDelTexto.parse(AP_FIN);
        } catch (ParseException ex) {
            ex.printStackTrace();
        }
        return ap_fin;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public String getHeader() {
        return header;
    }

    public void setDescMunicipio(String descMunicipio) {
        this.descMunicipio = descMunicipio;
    }

    public String getDescMunicipio() {
        return descMunicipio;
    }

    public void setDescMunicipioPromo(String descMunicipioPromo) {
        this.descMunicipioPromo = descMunicipioPromo;
    }

    public String getDescMunicipioPromo() {
        return descMunicipioPromo;
    }

    public void setPlazaImpHonoPromo(Double plazaImpHonoPromo) {
        this.plazaImpHonoPromo = plazaImpHonoPromo;
    }

    public Double getPlazaImpHonoPromo() {
        return plazaImpHonoPromo;
    }

    public void setPlazaImpHono(Double plazaImpHono) {
        this.plazaImpHono = plazaImpHono;
    }

    public Double getPlazaImpHono() {
        return plazaImpHono;
    }

    public void setPlazaIniContPromo(Date plazaIniContPromo) {
        this.plazaIniContPromo = plazaIniContPromo;
    }

    public Date getPlazaIniContPromo() {
        return plazaIniContPromo;
    }

    public void setPlazaFinContPromo(Date plazaFinContPromo) {
        this.plazaFinContPromo = plazaFinContPromo;
    }

    public Date getPlazaFinContPromo() {
        return plazaFinContPromo;
    }

    public void setPreventiva(Boolean preventiva) {
        this.preventiva = preventiva;
    }

    public Boolean getPreventiva() {
        return preventiva;
    }

    public void setPlazaIniLic(Date plazaIniLic) {
        this.plazaIniLic = plazaIniLic;
    }

    public Date getPlazaIniLic() {
        return plazaIniLic;
    }

    public void setPlazaFinLic(Date plazaFinLic) {
        this.plazaFinLic = plazaFinLic;
    }

    public Date getPlazaFinLic() {
        return plazaFinLic;
    }

    public void setClabeEmpleado1(String clabeEmpleado1) {
        this.clabeEmpleado1 = clabeEmpleado1;
    }

    public String getClabeEmpleado1() {
        return clabeEmpleado1;
    }

    public void setClabeEmpleado2(String clabeEmpleado2) {
        this.clabeEmpleado2 = clabeEmpleado2;
    }

    public String getClabeEmpleado2() {
        return clabeEmpleado2;
    }

    public void setIdBanco(String idBanco) {
        this.idBanco = idBanco;
    }

    public String getIdBanco() {
        return idBanco;
    }
}
