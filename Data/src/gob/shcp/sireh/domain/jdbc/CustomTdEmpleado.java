package gob.shcp.sireh.domain.jdbc;

import gob.shcp.fsn.data.Domain;

import java.io.Serializable;

/**
 * Domain object for persistent TdEmpleado data.
 */
public class CustomTdEmpleado implements Domain, Serializable {

    private java.lang.String rfcEmpleado;
    private java.lang.String idBancoSar;
    private java.lang.String idTipoPago;
    private java.lang.Integer idUltimoMovto;
    private java.lang.String calleParticular;
    private java.lang.String casoMuestra;
    private java.lang.String clabeEmpleado;
    private java.lang.String codpostParticular;
    private java.lang.String coloniaParticular;
    private java.lang.String compatEmpleo;
    private java.lang.String curpEmpleado;
    private java.lang.String discapacidad;
    private java.lang.Integer empQnaCaptura;
    private java.lang.String estudiaSiNo;
    private java.lang.String EMailOficial;
    private java.lang.String EMailPersonal;
    private java.util.Date fecIngSpc;
    private java.util.Date fecIniDeclPatr;
    private java.util.Date fecModifico;
    private java.util.Date fecNacimiento;
    private java.util.Date fecNotDecPatr;
    private java.util.Date fecUltimoMovto;
    private java.lang.String idEdoCivil;
    private java.lang.Integer idEdoNac;
    private java.lang.Integer idEdoParticular;
    private java.lang.Integer idEspProtCivil;
    private java.lang.String idGenero;
    private java.lang.Integer idInstEducativa;
    private java.lang.Integer idInstProtcivil;
    private java.lang.Integer idMuniParticular;
    private java.lang.String idNacionalidad;
    private java.lang.Integer idNivelEscolar;
    private java.lang.Integer idPlazaVigente;
    private java.lang.Float idProfnCarrera;
    private java.lang.Integer idRusp;
    private java.lang.String imssIssste;
    private java.util.Date ingresoDependencia;
    private java.util.Date ingresoGobFed;
    private java.lang.String nombreEmpleado;
    private java.lang.String padreMadre;
    private java.lang.String primerApellido;
    private java.lang.String referenciaOficio;
    private java.lang.String rfcUnico;
    private java.lang.String segundoApellido;
    private java.lang.String sistemaReparto;
    private java.lang.String telParticular;
    private java.util.Date terminoCargoSind;
    private java.lang.String usuario;
    //Plaza
    private java.lang.String puesto;
    private Integer plaza;
    private java.lang.Integer idZonaDistNom;
    private java.lang.String idUnidadNom;

    /**
     * Constructor for TdEmpleado class.
     */
    public CustomTdEmpleado() {
    }

    /**
     * Constructor for TdEmpleado class.
     *
     * @param rfcEmpleado java.lang.String
     * @param idBancoSar java.lang.String
     * @param idTipoPago java.lang.String
     * @param idUltimoMovto java.lang.Integer
     * @param calleParticular java.lang.String
     * @param casoMuestra java.lang.String
     * @param clabeEmpleado java.lang.String
     * @param codpostParticular java.lang.String
     * @param coloniaParticular java.lang.String
     * @param compatEmpleo java.lang.String
     * @param curpEmpleado java.lang.String
     * @param discapacidad java.lang.String
     * @param empQnaCaptura java.lang.Integer
     * @param estudiaSiNo java.lang.String
     * @param EMailOficial java.lang.String
     * @param EMailPersonal java.lang.String
     * @param fecIngSpc java.util.Date
     * @param fecIniDeclPatr java.util.Date
     * @param fecModifico java.util.Date
     * @param fecNacimiento java.util.Date
     * @param fecNotDecPatr java.util.Date
     * @param fecUltimoMovto java.util.Date
     * @param idEdoCivil java.lang.String
     * @param idEdoNac java.lang.Integer
     * @param idEdoParticular java.lang.Integer
     * @param idEspProtCivil java.lang.Integer
     * @param idGenero java.lang.String
     * @param idInstEducativa java.lang.Integer
     * @param idInstProtcivil java.lang.Integer
     * @param idMuniParticular java.lang.Integer
     * @param idNacionalidad java.lang.String
     * @param idNivelEscolar java.lang.Integer
     * @param idPlazaVigente java.lang.Integer
     * @param idProfnCarrera java.lang.Float
     * @param idRusp java.lang.Integer
     * @param imssIssste java.lang.String
     * @param ingresoDependencia java.util.Date
     * @param ingresoGobFed java.util.Date
     * @param nombreEmpleado java.lang.String
     * @param padreMadre java.lang.String
     * @param primerApellido java.lang.String
     * @param referenciaOficio java.lang.String
     * @param rfcUnico java.lang.String
     * @param segundoApellido java.lang.String
     * @param sistemaReparto java.lang.String
     * @param telParticular java.lang.String
     * @param terminoCargoSind java.util.Date
     * @param usuario java.lang.String
     */
    public CustomTdEmpleado(java.lang.String rfcEmpleado, 
                            java.lang.String idBancoSar, 
                            java.lang.String idTipoPago, 
                            java.lang.Integer idUltimoMovto, 
                            java.lang.String calleParticular, 
                            java.lang.String casoMuestra, 
                            java.lang.String clabeEmpleado, 
                            java.lang.String codpostParticular, 
                            java.lang.String coloniaParticular, 
                            java.lang.String compatEmpleo, 
                            java.lang.String curpEmpleado, 
                            java.lang.String discapacidad, 
                            java.lang.Integer empQnaCaptura, 
                            java.lang.String estudiaSiNo, 
                            java.lang.String EMailOficial, 
                            java.lang.String EMailPersonal, 
                            java.util.Date fecIngSpc, 
                            java.util.Date fecIniDeclPatr, 
                            java.util.Date fecModifico, 
                            java.util.Date fecNacimiento, 
                            java.util.Date fecNotDecPatr, 
                            java.util.Date fecUltimoMovto, 
                            java.lang.String idEdoCivil, 
                            java.lang.Integer idEdoNac, 
                            java.lang.Integer idEdoParticular, 
                            java.lang.Integer idEspProtCivil, 
                            java.lang.String idGenero, 
                            java.lang.Integer idInstEducativa, 
                            java.lang.Integer idInstProtcivil, 
                            java.lang.Integer idMuniParticular, 
                            java.lang.String idNacionalidad, 
                            java.lang.Integer idNivelEscolar, 
                            java.lang.Integer idPlazaVigente, 
                            java.lang.Float idProfnCarrera, 
                            java.lang.Integer idRusp, 
                            java.lang.String imssIssste, 
                            java.util.Date ingresoDependencia, 
                            java.util.Date ingresoGobFed, 
                            java.lang.String nombreEmpleado, 
                            java.lang.String padreMadre, 
                            java.lang.String primerApellido, 
                            java.lang.String referenciaOficio, 
                            java.lang.String rfcUnico, 
                            java.lang.String segundoApellido, 
                            java.lang.String sistemaReparto, 
                            java.lang.String telParticular, 
                            java.util.Date terminoCargoSind, 
                            java.lang.String usuario, java.lang.String puesto, 
                            Integer plaza, java.lang.Integer idZonaDistNom, 
                            java.lang.String idUnidadNom) {
        this.rfcEmpleado = rfcEmpleado;
        this.idBancoSar = idBancoSar;
        this.idTipoPago = idTipoPago;
        this.idUltimoMovto = idUltimoMovto;
        this.calleParticular = calleParticular;
        this.casoMuestra = casoMuestra;
        this.clabeEmpleado = clabeEmpleado;
        this.codpostParticular = codpostParticular;
        this.coloniaParticular = coloniaParticular;
        this.compatEmpleo = compatEmpleo;
        this.curpEmpleado = curpEmpleado;
        this.discapacidad = discapacidad;
        this.empQnaCaptura = empQnaCaptura;
        this.estudiaSiNo = estudiaSiNo;
        this.EMailOficial = EMailOficial;
        this.EMailPersonal = EMailPersonal;
        this.fecIngSpc = fecIngSpc;
        this.fecIniDeclPatr = fecIniDeclPatr;
        this.fecModifico = fecModifico;
        this.fecNacimiento = fecNacimiento;
        this.fecNotDecPatr = fecNotDecPatr;
        this.fecUltimoMovto = fecUltimoMovto;
        this.idEdoCivil = idEdoCivil;
        this.idEdoNac = idEdoNac;
        this.idEdoParticular = idEdoParticular;
        this.idEspProtCivil = idEspProtCivil;
        this.idGenero = idGenero;
        this.idInstEducativa = idInstEducativa;
        this.idInstProtcivil = idInstProtcivil;
        this.idMuniParticular = idMuniParticular;
        this.idNacionalidad = idNacionalidad;
        this.idNivelEscolar = idNivelEscolar;
        this.idPlazaVigente = idPlazaVigente;
        this.idProfnCarrera = idProfnCarrera;
        this.idRusp = idRusp;
        this.imssIssste = imssIssste;
        this.ingresoDependencia = ingresoDependencia;
        this.ingresoGobFed = ingresoGobFed;
        this.nombreEmpleado = nombreEmpleado;
        this.padreMadre = padreMadre;
        this.primerApellido = primerApellido;
        this.referenciaOficio = referenciaOficio;
        this.rfcUnico = rfcUnico;
        this.segundoApellido = segundoApellido;
        this.sistemaReparto = sistemaReparto;
        this.telParticular = telParticular;
        this.terminoCargoSind = terminoCargoSind;
        this.usuario = usuario;
        this.puesto = puesto;
        this.plaza = plaza;
        this.idZonaDistNom = idZonaDistNom;
        this.idUnidadNom = idUnidadNom;
    }

    /**
     * Get rfcEmpleado value.
     *
     * @return java.lang.String
     */
    public java.lang.String getRfcEmpleado() {
        return this.rfcEmpleado;
    }

    /**
     * Get idBancoSar value.
     *
     * @return java.lang.String
     */
    public java.lang.String getIdBancoSar() {
        return this.idBancoSar;
    }

    /**
     * Get idTipoPago value.
     *
     * @return java.lang.String
     */
    public java.lang.String getIdTipoPago() {
        return this.idTipoPago;
    }

    /**
     * Get idUltimoMovto value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getIdUltimoMovto() {
        return this.idUltimoMovto;
    }

    /**
     * Get calleParticular value.
     *
     * @return java.lang.String
     */
    public java.lang.String getCalleParticular() {
        return this.calleParticular;
    }

    /**
     * Get casoMuestra value.
     *
     * @return java.lang.String
     */
    public java.lang.String getCasoMuestra() {
        return this.casoMuestra;
    }

    /**
     * Get clabeEmpleado value.
     *
     * @return java.lang.String
     */
    public java.lang.String getClabeEmpleado() {
        return this.clabeEmpleado;
    }

    /**
     * Get codpostParticular value.
     *
     * @return java.lang.String
     */
    public java.lang.String getCodpostParticular() {
        return this.codpostParticular;
    }

    /**
     * Get coloniaParticular value.
     *
     * @return java.lang.String
     */
    public java.lang.String getColoniaParticular() {
        return this.coloniaParticular;
    }

    /**
     * Get compatEmpleo value.
     *
     * @return java.lang.String
     */
    public java.lang.String getCompatEmpleo() {
        return this.compatEmpleo;
    }

    /**
     * Get curpEmpleado value.
     *
     * @return java.lang.String
     */
    public java.lang.String getCurpEmpleado() {
        return this.curpEmpleado;
    }

    /**
     * Get discapacidad value.
     *
     * @return java.lang.String
     */
    public java.lang.String getDiscapacidad() {
        return this.discapacidad;
    }

    /**
     * Get empQnaCaptura value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getEmpQnaCaptura() {
        return this.empQnaCaptura;
    }

    /**
     * Get estudiaSiNo value.
     *
     * @return java.lang.String
     */
    public java.lang.String getEstudiaSiNo() {
        return this.estudiaSiNo;
    }

    /**
     * Get EMailOficial value.
     *
     * @return java.lang.String
     */
    public java.lang.String getEMailOficial() {
        return this.EMailOficial;
    }

    /**
     * Get EMailPersonal value.
     *
     * @return java.lang.String
     */
    public java.lang.String getEMailPersonal() {
        return this.EMailPersonal;
    }

    /**
     * Get fecIngSpc value.
     *
     * @return java.util.Date
     */
    public java.util.Date getFecIngSpc() {
        return this.fecIngSpc;
    }

    /**
     * Get fecIniDeclPatr value.
     *
     * @return java.util.Date
     */
    public java.util.Date getFecIniDeclPatr() {
        return this.fecIniDeclPatr;
    }

    /**
     * Get fecModifico value.
     *
     * @return java.util.Date
     */
    public java.util.Date getFecModifico() {
        return this.fecModifico;
    }

    /**
     * Get fecNacimiento value.
     *
     * @return java.util.Date
     */
    public java.util.Date getFecNacimiento() {
        return this.fecNacimiento;
    }

    /**
     * Get fecNotDecPatr value.
     *
     * @return java.util.Date
     */
    public java.util.Date getFecNotDecPatr() {
        return this.fecNotDecPatr;
    }

    /**
     * Get fecUltimoMovto value.
     *
     * @return java.util.Date
     */
    public java.util.Date getFecUltimoMovto() {
        return this.fecUltimoMovto;
    }

    /**
     * Get idEdoCivil value.
     *
     * @return java.lang.String
     */
    public java.lang.String getIdEdoCivil() {
        return this.idEdoCivil;
    }

    /**
     * Get idEdoNac value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getIdEdoNac() {
        return this.idEdoNac;
    }

    /**
     * Get idEdoParticular value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getIdEdoParticular() {
        return this.idEdoParticular;
    }

    /**
     * Get idEspProtCivil value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getIdEspProtCivil() {
        return this.idEspProtCivil;
    }

    /**
     * Get idGenero value.
     *
     * @return java.lang.String
     */
    public java.lang.String getIdGenero() {
        return this.idGenero;
    }

    /**
     * Get idInstEducativa value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getIdInstEducativa() {
        return this.idInstEducativa;
    }

    /**
     * Get idInstProtcivil value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getIdInstProtcivil() {
        return this.idInstProtcivil;
    }

    /**
     * Get idMuniParticular value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getIdMuniParticular() {
        return this.idMuniParticular;
    }

    /**
     * Get idNacionalidad value.
     *
     * @return java.lang.String
     */
    public java.lang.String getIdNacionalidad() {
        return this.idNacionalidad;
    }

    /**
     * Get idNivelEscolar value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getIdNivelEscolar() {
        return this.idNivelEscolar;
    }

    /**
     * Get idPlazaVigente value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getIdPlazaVigente() {
        return this.idPlazaVigente;
    }

    /**
     * Get idProfnCarrera value.
     *
     * @return java.lang.Float
     */
    public java.lang.Float getIdProfnCarrera() {
        return this.idProfnCarrera;
    }

    /**
     * Get idRusp value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getIdRusp() {
        return this.idRusp;
    }

    /**
     * Get imssIssste value.
     *
     * @return java.lang.String
     */
    public java.lang.String getImssIssste() {
        return this.imssIssste;
    }

    /**
     * Get ingresoDependencia value.
     *
     * @return java.util.Date
     */
    public java.util.Date getIngresoDependencia() {
        return this.ingresoDependencia;
    }

    /**
     * Get ingresoGobFed value.
     *
     * @return java.util.Date
     */
    public java.util.Date getIngresoGobFed() {
        return this.ingresoGobFed;
    }

    /**
     * Get nombreEmpleado value.
     *
     * @return java.lang.String
     */
    public java.lang.String getNombreEmpleado() {
        return this.nombreEmpleado;
    }

    /**
     * Get padreMadre value.
     *
     * @return java.lang.String
     */
    public java.lang.String getPadreMadre() {
        return this.padreMadre;
    }

    /**
     * Get primerApellido value.
     *
     * @return java.lang.String
     */
    public java.lang.String getPrimerApellido() {
        return this.primerApellido;
    }

    /**
     * Get referenciaOficio value.
     *
     * @return java.lang.String
     */
    public java.lang.String getReferenciaOficio() {
        return this.referenciaOficio;
    }

    /**
     * Get rfcUnico value.
     *
     * @return java.lang.String
     */
    public java.lang.String getRfcUnico() {
        return this.rfcUnico;
    }

    /**
     * Get segundoApellido value.
     *
     * @return java.lang.String
     */
    public java.lang.String getSegundoApellido() {
        return this.segundoApellido;
    }

    /**
     * Get sistemaReparto value.
     *
     * @return java.lang.String
     */
    public java.lang.String getSistemaReparto() {
        return this.sistemaReparto;
    }

    /**
     * Get telParticular value.
     *
     * @return java.lang.String
     */
    public java.lang.String getTelParticular() {
        return this.telParticular;
    }

    /**
     * Get terminoCargoSind value.
     *
     * @return java.util.Date
     */
    public java.util.Date getTerminoCargoSind() {
        return this.terminoCargoSind;
    }

    /**
     * Get usuario value.
     *
     * @return java.lang.String
     */
    public java.lang.String getUsuario() {
        return this.usuario;
    }


    /**
     * Set rfcEmpleado value.
     *
     * @param rfcEmpleado java.lang.String
     */
    public void setRfcEmpleado(java.lang.String rfcEmpleado) {
        this.rfcEmpleado = rfcEmpleado;
    }

    /**
     * Set idBancoSar value.
     *
     * @param idBancoSar java.lang.String
     */
    public void setIdBancoSar(java.lang.String idBancoSar) {
        this.idBancoSar = idBancoSar;
    }

    /**
     * Set idTipoPago value.
     *
     * @param idTipoPago java.lang.String
     */
    public void setIdTipoPago(java.lang.String idTipoPago) {
        this.idTipoPago = idTipoPago;
    }

    /**
     * Set idUltimoMovto value.
     *
     * @param idUltimoMovto java.lang.Integer
     */
    public void setIdUltimoMovto(java.lang.Integer idUltimoMovto) {
        this.idUltimoMovto = idUltimoMovto;
    }

    /**
     * Set calleParticular value.
     *
     * @param calleParticular java.lang.String
     */
    public void setCalleParticular(java.lang.String calleParticular) {
        this.calleParticular = calleParticular;
    }

    /**
     * Set casoMuestra value.
     *
     * @param casoMuestra java.lang.String
     */
    public void setCasoMuestra(java.lang.String casoMuestra) {
        this.casoMuestra = casoMuestra;
    }

    /**
     * Set clabeEmpleado value.
     *
     * @param clabeEmpleado java.lang.String
     */
    public void setClabeEmpleado(java.lang.String clabeEmpleado) {
        this.clabeEmpleado = clabeEmpleado;
    }

    /**
     * Set codpostParticular value.
     *
     * @param codpostParticular java.lang.String
     */
    public void setCodpostParticular(java.lang.String codpostParticular) {
        this.codpostParticular = codpostParticular;
    }

    /**
     * Set coloniaParticular value.
     *
     * @param coloniaParticular java.lang.String
     */
    public void setColoniaParticular(java.lang.String coloniaParticular) {
        this.coloniaParticular = coloniaParticular;
    }

    /**
     * Set compatEmpleo value.
     *
     * @param compatEmpleo java.lang.String
     */
    public void setCompatEmpleo(java.lang.String compatEmpleo) {
        this.compatEmpleo = compatEmpleo;
    }

    /**
     * Set curpEmpleado value.
     *
     * @param curpEmpleado java.lang.String
     */
    public void setCurpEmpleado(java.lang.String curpEmpleado) {
        this.curpEmpleado = curpEmpleado;
    }

    /**
     * Set discapacidad value.
     *
     * @param discapacidad java.lang.String
     */
    public void setDiscapacidad(java.lang.String discapacidad) {
        this.discapacidad = discapacidad;
    }

    /**
     * Set empQnaCaptura value.
     *
     * @param empQnaCaptura java.lang.Integer
     */
    public void setEmpQnaCaptura(java.lang.Integer empQnaCaptura) {
        this.empQnaCaptura = empQnaCaptura;
    }

    /**
     * Set estudiaSiNo value.
     *
     * @param estudiaSiNo java.lang.String
     */
    public void setEstudiaSiNo(java.lang.String estudiaSiNo) {
        this.estudiaSiNo = estudiaSiNo;
    }

    /**
     * Set EMailOficial value.
     *
     * @param EMailOficial java.lang.String
     */
    public void setEMailOficial(java.lang.String EMailOficial) {
        this.EMailOficial = EMailOficial;
    }

    /**
     * Set EMailPersonal value.
     *
     * @param EMailPersonal java.lang.String
     */
    public void setEMailPersonal(java.lang.String EMailPersonal) {
        this.EMailPersonal = EMailPersonal;
    }

    /**
     * Set fecIngSpc value.
     *
     * @param fecIngSpc java.util.Date
     */
    public void setFecIngSpc(java.util.Date fecIngSpc) {
        this.fecIngSpc = fecIngSpc;
    }

    /**
     * Set fecIniDeclPatr value.
     *
     * @param fecIniDeclPatr java.util.Date
     */
    public void setFecIniDeclPatr(java.util.Date fecIniDeclPatr) {
        this.fecIniDeclPatr = fecIniDeclPatr;
    }

    /**
     * Set fecModifico value.
     *
     * @param fecModifico java.util.Date
     */
    public void setFecModifico(java.util.Date fecModifico) {
        this.fecModifico = fecModifico;
    }

    /**
     * Set fecNacimiento value.
     *
     * @param fecNacimiento java.util.Date
     */
    public void setFecNacimiento(java.util.Date fecNacimiento) {
        this.fecNacimiento = fecNacimiento;
    }

    /**
     * Set fecNotDecPatr value.
     *
     * @param fecNotDecPatr java.util.Date
     */
    public void setFecNotDecPatr(java.util.Date fecNotDecPatr) {
        this.fecNotDecPatr = fecNotDecPatr;
    }

    /**
     * Set fecUltimoMovto value.
     *
     * @param fecUltimoMovto java.util.Date
     */
    public void setFecUltimoMovto(java.util.Date fecUltimoMovto) {
        this.fecUltimoMovto = fecUltimoMovto;
    }

    /**
     * Set idEdoCivil value.
     *
     * @param idEdoCivil java.lang.String
     */
    public void setIdEdoCivil(java.lang.String idEdoCivil) {
        this.idEdoCivil = idEdoCivil;
    }

    /**
     * Set idEdoNac value.
     *
     * @param idEdoNac java.lang.Integer
     */
    public void setIdEdoNac(java.lang.Integer idEdoNac) {
        this.idEdoNac = idEdoNac;
    }

    /**
     * Set idEdoParticular value.
     *
     * @param idEdoParticular java.lang.Integer
     */
    public void setIdEdoParticular(java.lang.Integer idEdoParticular) {
        this.idEdoParticular = idEdoParticular;
    }

    /**
     * Set idEspProtCivil value.
     *
     * @param idEspProtCivil java.lang.Integer
     */
    public void setIdEspProtCivil(java.lang.Integer idEspProtCivil) {
        this.idEspProtCivil = idEspProtCivil;
    }

    /**
     * Set idGenero value.
     *
     * @param idGenero java.lang.String
     */
    public void setIdGenero(java.lang.String idGenero) {
        this.idGenero = idGenero;
    }

    /**
     * Set idInstEducativa value.
     *
     * @param idInstEducativa java.lang.Integer
     */
    public void setIdInstEducativa(java.lang.Integer idInstEducativa) {
        this.idInstEducativa = idInstEducativa;
    }

    /**
     * Set idInstProtcivil value.
     *
     * @param idInstProtcivil java.lang.Integer
     */
    public void setIdInstProtcivil(java.lang.Integer idInstProtcivil) {
        this.idInstProtcivil = idInstProtcivil;
    }

    /**
     * Set idMuniParticular value.
     *
     * @param idMuniParticular java.lang.Integer
     */
    public void setIdMuniParticular(java.lang.Integer idMuniParticular) {
        this.idMuniParticular = idMuniParticular;
    }

    /**
     * Set idNacionalidad value.
     *
     * @param idNacionalidad java.lang.String
     */
    public void setIdNacionalidad(java.lang.String idNacionalidad) {
        this.idNacionalidad = idNacionalidad;
    }

    /**
     * Set idNivelEscolar value.
     *
     * @param idNivelEscolar java.lang.Integer
     */
    public void setIdNivelEscolar(java.lang.Integer idNivelEscolar) {
        this.idNivelEscolar = idNivelEscolar;
    }

    /**
     * Set idPlazaVigente value.
     *
     * @param idPlazaVigente java.lang.Integer
     */
    public void setIdPlazaVigente(java.lang.Integer idPlazaVigente) {
        this.idPlazaVigente = idPlazaVigente;
    }

    /**
     * Set idProfnCarrera value.
     *
     * @param idProfnCarrera java.lang.Float
     */
    public void setIdProfnCarrera(java.lang.Float idProfnCarrera) {
        this.idProfnCarrera = idProfnCarrera;
    }

    /**
     * Set idRusp value.
     *
     * @param idRusp java.lang.Integer
     */
    public void setIdRusp(java.lang.Integer idRusp) {
        this.idRusp = idRusp;
    }

    /**
     * Set imssIssste value.
     *
     * @param imssIssste java.lang.String
     */
    public void setImssIssste(java.lang.String imssIssste) {
        this.imssIssste = imssIssste;
    }

    /**
     * Set ingresoDependencia value.
     *
     * @param ingresoDependencia java.util.Date
     */
    public void setIngresoDependencia(java.util.Date ingresoDependencia) {
        this.ingresoDependencia = ingresoDependencia;
    }

    /**
     * Set ingresoGobFed value.
     *
     * @param ingresoGobFed java.util.Date
     */
    public void setIngresoGobFed(java.util.Date ingresoGobFed) {
        this.ingresoGobFed = ingresoGobFed;
    }

    /**
     * Set nombreEmpleado value.
     *
     * @param nombreEmpleado java.lang.String
     */
    public void setNombreEmpleado(java.lang.String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }

    /**
     * Set padreMadre value.
     *
     * @param padreMadre java.lang.String
     */
    public void setPadreMadre(java.lang.String padreMadre) {
        this.padreMadre = padreMadre;
    }

    /**
     * Set primerApellido value.
     *
     * @param primerApellido java.lang.String
     */
    public void setPrimerApellido(java.lang.String primerApellido) {
        this.primerApellido = primerApellido;
    }

    /**
     * Set referenciaOficio value.
     *
     * @param referenciaOficio java.lang.String
     */
    public void setReferenciaOficio(java.lang.String referenciaOficio) {
        this.referenciaOficio = referenciaOficio;
    }

    /**
     * Set rfcUnico value.
     *
     * @param rfcUnico java.lang.String
     */
    public void setRfcUnico(java.lang.String rfcUnico) {
        this.rfcUnico = rfcUnico;
    }

    /**
     * Set segundoApellido value.
     *
     * @param segundoApellido java.lang.String
     */
    public void setSegundoApellido(java.lang.String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }

    /**
     * Set sistemaReparto value.
     *
     * @param sistemaReparto java.lang.String
     */
    public void setSistemaReparto(java.lang.String sistemaReparto) {
        this.sistemaReparto = sistemaReparto;
    }

    /**
     * Set telParticular value.
     *
     * @param telParticular java.lang.String
     */
    public void setTelParticular(java.lang.String telParticular) {
        this.telParticular = telParticular;
    }

    /**
     * Set terminoCargoSind value.
     *
     * @param terminoCargoSind java.util.Date
     */
    public void setTerminoCargoSind(java.util.Date terminoCargoSind) {
        this.terminoCargoSind = terminoCargoSind;
    }

    /**
     * Set usuario value.
     *
     * @param usuario java.lang.String
     */
    public void setUsuario(java.lang.String usuario) {
        this.usuario = usuario;
    }

    /**
     * Set identity value.
     *
     * @param rfcEmpleado Serializable
     */
    public void setIdentity(Serializable rfcEmpleado) {
        this.rfcEmpleado = (java.lang.String)rfcEmpleado;
    }

    /**
     * Get identity value.
     *
     * @return Serializable
     */
    public Serializable getIdentity() {
        return this.rfcEmpleado;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public Integer getPlaza() {
        return plaza;
    }

    public void setPlaza(Integer plaza) {
        this.plaza = plaza;
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
}
