package gob.shcp.sireh.model.nomina.calculo;

import gob.shcp.fsn.model.Model;

import gob.shcp.sireh.model.Constants;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import org.apache.commons.lang.time.DateUtils;

import org.springmodules.validation.bean.conf.loader.annotation.handler.ValidationMethod;

public class AsociaPlazaEmpleadoDTO implements java.io.Serializable, Model, Constants {
    public AsociaPlazaEmpleadoDTO() {
    }

    private java.lang.Integer idMovsPersonal;

    // Datos del empleado
    private java.lang.String primerApellido;
    private java.lang.String segundoApellido;
    private java.lang.String nombreEmpleado;
    private java.lang.String rfcEmpleado;
    private java.lang.String curpEmpleado;
    private java.lang.String rfcEmpleadoNuevo;
    private java.lang.String imssIssste;
    private java.util.Date ingresoGobFed;
    private java.util.Date ingresoDependencia;
    private java.lang.String idTipoPago;
    private java.lang.String clabeEmpleado;
    //private java.lang.String clabeEmpleadoAux;
    private java.lang.String clabeEmpleado1;
    private java.lang.String clabeEmpleado2;

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
    private java.lang.Integer idRangoNom;
    private java.lang.String idGrupoPago;
    private java.lang.String idJerarquia;
    private java.lang.String idNombramiento;

    private java.lang.String descBancos;
    private java.lang.String idBanco;

    private int idNomina;
    private String idTipoNomina;
    private java.lang.String idGrupoPagoNomina;

    // Quincena de captura
    private Date inicioQuincenaCaptura;
    private Date finQuincenaCaptura;
    private Date finSiguienteQuincenaCaptura;

    // Pantalla
    private boolean checkRfcEmpleado;
    private java.lang.Integer cnqFolio;
    private String helproutineBeanName;
    // Aguinaldo
    private String agVigente;
    private String header;

    private boolean aceptar;
    private boolean cancelar;

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

//    @ValidationMethod(forProperty = "primerApellido", errorCode = "not.blank")
//    public boolean validatePrimerApellido() {
//        if (this.isAceptar() && this.isCheckRfcEmpleado()) {
//            return this.getPrimerApellido() != null && this.getPrimerApellido().length() > 0;
//        }
//        return true;
//    }
//
//    @ValidationMethod(forProperty = "segundoApellido", errorCode = "not.blank")
//    public boolean validateSegundoApellido() {
//        if (this.isAceptar() && this.isCheckRfcEmpleado()) {
//            return this.getSegundoApellido() != null && this.getSegundoApellido().length() > 0;
//        }
//        return true;
//    }

    @ValidationMethod(forProperty = "nombreEmpleado", errorCode = "not.blank")
    public boolean validateNombreEmpleado() {
        if (this.isAceptar() && this.isCheckRfcEmpleado()) {
            return this.getNombreEmpleado() != null && this.getNombreEmpleado().length() > 0;
        }
        return true;
    }

    @ValidationMethod(forProperty = "rfcEmpleado", errorCode = "not.blank")
    public boolean validateRfcEmpleado() {
        if (this.isAceptar() && !this.isCheckRfcEmpleado()) {
            return this.getRfcEmpleado() != null && this.getRfcEmpleado().length() > 0;
        }
        return true;
    }

    @ValidationMethod(forProperty = "rfcEmpleadoNuevo", errorCode = "not.blank")
    public boolean validateRfcEmpleadoBlank() {
        if (this.isAceptar() && this.isCheckRfcEmpleado()) {
            return this.getRfcEmpleadoNuevo() != null && this.getRfcEmpleadoNuevo().length() > 0;
        }
        return true;
    }

    @ValidationMethod(forProperty = "rfcEmpleadoNuevo", errorCode = "regexp")
    public boolean validateRfcEmpleadoRegexp() {
        if (this.isAceptar() && this.isCheckRfcEmpleado()) {
            return this.getRfcEmpleadoNuevo() != null && 
                this.getRfcEmpleadoNuevo().matches("^[A-Z]{4}[0-9]{6}[A-Z0-9]{3}$");
        }
        return true;
    }

    @ValidationMethod(forProperty = "curpEmpleado", errorCode = "not.blank")
    public boolean validateCurpEmpleadoBlank() {
        if (this.isAceptar() && this.isCheckRfcEmpleado()) {
            return this.getCurpEmpleado() != null && this.getCurpEmpleado().length() > 0;
        }
        return true;
    }

    @ValidationMethod(forProperty = "curpEmpleado", errorCode = "regexp")
    public boolean validateCurpEmpleadoRegexp() {
        if (this.isAceptar() && this.isCheckRfcEmpleado()) {
            return this.getCurpEmpleado() != null && 
                this.getCurpEmpleado().matches("[A-Z][A,E,I,O,U,X][A-Z]{2}[0-9]{2}[0-1][0-9][0-3][0-9][M,H][A-Z]{2}[B,C,D,F,G,H,J,K,L,M,N,Ñ,P,Q,R,S,T,V,W,X,Y,Z]{3}[0-9,A-Z][0-9]");
        }
        return true;
    }

    @ValidationMethod(forProperty = "imssIssste", errorCode = "regexp")
    public

    boolean validateImssIssste() {
        if (this.isAceptar() && this.isCheckRfcEmpleado()) {
            return this.getImssIssste() != null && this.getImssIssste().matches("[0-9]+");
        }
        return true;
    }


    @ValidationMethod(forProperty = "calleParticular", errorCode = "regexp")
    public boolean validateCalleParticular() {
        if (this.isAceptar() && this.isCheckRfcEmpleado()) {
            return this.getCalleParticular() != null && 
                this.getCalleParticular().matches("[[a-zA-Z][0-9] áéíóúAÉÍÓÚÑñ'\\-\\.]+");
        }
        return true;
    }

    @ValidationMethod(forProperty = "telParticular", errorCode = "length")
    public boolean validateTelParticularLength() {
        if (this.isAceptar() && this.isCheckRfcEmpleado()) {
            return this.getTelParticular() != null && this.getTelParticular().length() <= 15;
        }
        return true;
    }

    @ValidationMethod(forProperty = "telParticular", errorCode = "regexp")
    public boolean validateTelParticularRegexp() {
        if (this.isAceptar() && this.isCheckRfcEmpleado()) {
            return this.getTelParticular() != null && this.getTelParticular().matches("[[0-9]\\(\\)\\s\\-]+");
        }
        return true;
    }

    @ValidationMethod(forProperty = "codpostParticular", errorCode = "regexp")
    public boolean validateCodpostParticularRegexp() {
        if (this.isAceptar() && this.isCheckRfcEmpleado()) {
            return this.getCodpostParticular() != null && this.getCodpostParticular().matches("[0-9]{5}");
        }
        return true;
    }

    @ValidationMethod(forProperty = "clabeEmpleado", errorCode = "not.blank")
    public boolean validateClabeEmpleadoBlank() {
        if (this.isAceptar() && this.getIdTipoPago() != null && this.getIdTipoPago().equals("TD")) {
            return this.getClabeEmpleado2() != null && this.getClabeEmpleado2().length() > 0;
        }
        return true;
    }
    
    @ValidationMethod(forProperty="clabeEmpleado", errorCode="regexp")
    public boolean validateClabeEmpleadoRegexp(){
        if(this.isAceptar() && this.getIdTipoPago() != null && this.getIdTipoPago().equals("TD")){
            return this.getClabeEmpleado1() != null && this.getClabeEmpleado2() != null && this.getClabeEmpleado1().matches("[0-9]+") && this.getClabeEmpleado2().matches("[0-9]+");
        }
        return true;
    }

    @ValidationMethod(forProperty = "clabeEmpleado", errorCode = "length")
    public boolean validateClabeEmpleadoLength() {
        if (this.isAceptar() && this.getIdTipoPago() != null && this.getIdTipoPago().equals("TD") ) {
            return this.getClabeEmpleado2() != null && this.getClabeEmpleado2().length() == 15;
        }
        return true;
    }

    @ValidationMethod(forProperty = "idTipoPago", errorCode = "error.select.unspecified")
    public boolean validateIdTipoPago() {
        if (this.isAceptar()) {
            return this.getIdTipoPago() != null && !this.getIdTipoPago().equals("0");
        }
        return true;
    }

    @ValidationMethod(forProperty = "clabeEmpleado", errorCode = "error.clabeEmpleado.ch")
    public boolean validateClabeEmpleadoCh() {
        if (this.isAceptar() && this.getIdTipoPago()!= null && this.getIdTipoPago().equals("CH")) {
            if (this.getClabeEmpleado1() == null || !this.getClabeEmpleado1().equals("000")) {
                return false;
            }

        }
        return true;
    }

    @ValidationMethod(forProperty = "clabeEmpleado", errorCode = "error.clabeEmpleado.td.digito.verificador")
    public boolean validateClabeEmpleadoTdDigitoVerificador() {
        if (this.isAceptar() && this.getIdTipoPago() != null && this.getIdTipoPago().equals("TD")) {
            if(this.getIdBanco() != null && (this.getIdBanco().equals("0") || this.getIdBanco().equals("000"))){
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

    @ValidationMethod(forProperty = "idMuniParticular", errorCode = "error.select.unspecified")
    public boolean validateIdMuniParticular() {
        if (this.isAceptar() && this.isCheckRfcEmpleado()) {
            return this.getIdMuniParticular() != null && this.getIdMuniParticular() != -1;
        }
        return true;
    }

    @ValidationMethod(forProperty = "idEdoParticular", errorCode = "error.select.unspecified")
    public boolean validateIdEdoParticular() {
        if (this.isAceptar() && this.isCheckRfcEmpleado()) {
            return this.getIdEdoParticular() != null && this.getIdEdoParticular() != 0;
        }
        return true;
    }

    @ValidationMethod(forProperty = "cnqFolio", errorCode = "not.blank")
    public boolean validateCnqFolio() {
        if (this.isAceptar() && this.getIdTipoNomina() != null && 
            (this.getIdTipoNomina().equals("AG") || 
             this.getIdTipoNomina().equals("AC") || 
             this.getIdTipoNomina().equals("OD") || 
             this.getIdTipoNomina().equals("DB") || 
             this.getIdTipoNomina().equals("FE"))) {
            return this.getCnqFolio() != null && this.getCnqFolio() > 0;
        }
        return true;
    }
    

    @ValidationMethod(forProperty = "idPlaza", errorCode = "not.blank")
    public boolean validateIdPlaza() {
        if (this.isAceptar()) {
            return this.getIdPlaza() != null;
        }
        return true;
    }

    // la fecha inicial debe ser menor a la fecha final
    @ValidationMethod(forProperty = "fechaInicial", errorCode = "fecha.invalida.alta.rango")
    public boolean validateFechasAltaRango() {
        if (this.isAceptar()) {
            
            if (this.getFechaInicial() == null || this.getFechaFinal() == null) {
                return false;
            } else {
                Date ini = DateUtils.truncate(this.getFechaInicial(), Calendar.DATE); 
                Date fin = DateUtils.truncate(this.getFechaFinal(), Calendar.DATE); 
                if (!(ini.before(fin)) && !(fin.before(ini))) { // fechas iguales
                    return true;
                } else {
                    if (!DateUtils.truncate(this.getFechaFinal(), Calendar.DATE).after(DateUtils.truncate(this.getFechaInicial(), Calendar.DATE))) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    // La fecha final de Alta debe estar antes <= de la final de quincena de captura
    @ValidationMethod(forProperty = "fechaFinal", errorCode = "fechaFinal.invalida.quincena")
    public boolean validateFechaFinalQuincena() {
        SimpleDateFormat formatoDelTexto = new SimpleDateFormat("yyyy-MM-dd");
        if (this.isAceptar() && this.getIdTipoNomina() != null && !this.getIdTipoNomina().equals("AG") && !this.getIdTipoNomina().equals("AC") ) {
            if (this.getFechaFinal() == null) {
                return false;
            } else {
                Date ini = DateUtils.truncate(this.getFechaInicial(), Calendar.DATE); 
                Date fin = DateUtils.truncate(this.getFechaFinal(), Calendar.DATE); 
                if (!(ini.before(fin)) && !(fin.before(ini))) { // fechas iguales
                    return true;
                } else {
                    if (DateUtils.truncate(this.getFechaFinal(), Calendar.DATE).after(DateUtils.truncate(this.getFinSiguienteQuincenaCaptura(), Calendar.DATE))) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public static Date agregarDias(Date fecha, int dias) {
        Calendar cal = new GregorianCalendar();
        cal.setLenient(false);
        cal.setTime(fecha);
        cal.add(Calendar.DAY_OF_MONTH, dias);
        return new Date(cal.getTimeInMillis());
    }

    @ValidationMethod(forProperty = "ingresoGobFed", errorCode = "error.calendar.unspecified")
    public boolean validateIngresoGobFed() {
        if (this.isAceptar() && this.isCheckRfcEmpleado()) {
            return this.getIngresoGobFed() != null;
        }
        return true;
    }

    @ValidationMethod(forProperty = "ingresoDependencia", errorCode = "error.calendar.unspecified")
    public boolean validateIngresoDependencia() {
        if (this.isAceptar() && this.isCheckRfcEmpleado()) {
            return this.getIngresoDependencia() != null;
        }
        return true;
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

    public void setPlazaImpHono(Double plazaImpHono) {
        this.plazaImpHono = plazaImpHono;
    }

    public Double getPlazaImpHono() {
        return plazaImpHono;
    }

    public void setCheckRfcEmpleado(boolean checkRfcEmpleado) {
        this.checkRfcEmpleado = checkRfcEmpleado;
    }

    public boolean isCheckRfcEmpleado() {
        return checkRfcEmpleado;
    }

    public void setRfcEmpleadoNuevo(String rfcEmpleadoNuevo) {
        this.rfcEmpleadoNuevo = rfcEmpleadoNuevo;
    }

    public String getRfcEmpleadoNuevo() {
        return rfcEmpleadoNuevo;
    }

    public void setIdNomina(int idNomina) {
        this.idNomina = idNomina;
    }

    public int getIdNomina() {
        return idNomina;
    }

    public void setIdGrupoPagoNomina(String idGrupoPagoNomina) {
        this.idGrupoPagoNomina = idGrupoPagoNomina;
    }

    public String getIdGrupoPagoNomina() {
        return idGrupoPagoNomina;
    }

    public void setIdMovsPersonal(Integer idMovsPersonal) {
        this.idMovsPersonal = idMovsPersonal;
    }

    public Integer getIdMovsPersonal() {
        return idMovsPersonal;
    }

    public void setAceptar(boolean aceptar) {
        this.aceptar = aceptar;
    }

    public boolean isAceptar() {
        return aceptar;
    }

    public void setIdTipoNomina(String idTipoNomina) {
        this.idTipoNomina = idTipoNomina;
    }

    public String getIdTipoNomina() {
        return idTipoNomina;
    }

/*    public void setClabeEmpleadoAux(String clabeEmpleadoAux) {
        this.clabeEmpleadoAux = clabeEmpleadoAux;
    }

    public String getClabeEmpleadoAux() {
        return clabeEmpleadoAux;
    }
*/
    public void setCnqFolio(Integer cnqFolio) {
        this.cnqFolio = cnqFolio;
    }

    public Integer getCnqFolio() {
        return cnqFolio;
    }

    public void setAgVigente(String agVigente) {
        this.agVigente = agVigente;
    }

    public String getAgVigente() {
        return agVigente;
    }

    public void setFinSiguienteQuincenaCaptura(Date finSiguienteQuincenaCaptura) {
        this.finSiguienteQuincenaCaptura = finSiguienteQuincenaCaptura;
    }

    public Date getFinSiguienteQuincenaCaptura() {
        return finSiguienteQuincenaCaptura;
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

    public void setHelproutineBeanName(String helproutineBeanName) {
        this.helproutineBeanName = helproutineBeanName;
    }

    public String getHelproutineBeanName() {
        return helproutineBeanName;
    }
}
