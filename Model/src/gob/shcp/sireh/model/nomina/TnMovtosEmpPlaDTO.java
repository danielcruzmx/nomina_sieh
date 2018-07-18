package gob.shcp.sireh.model.nomina;

import gob.shcp.fsn.model.Model;

import org.springmodules.validation.bean.conf.loader.annotation.handler.NotNull;
import org.springmodules.validation.bean.conf.loader.annotation.handler.NotBlank;
import org.springmodules.validation.bean.conf.loader.annotation.handler.MaxLength;

/**
 * Model object for transporting TnMovtosEmpPla data.
 */
public class TnMovtosEmpPlaDTO implements java.io.Serializable, Model {

    private java.lang.Integer idMovtosEmpPla;
    @MaxLength(12)
    private java.lang.String idBancoSar;
    @MaxLength(8)
    private java.lang.String idTipoPago;
    @NotNull
    private java.util.Date fecModifico;
    @NotBlank(errorCode = "not.null")
    @NotNull
    @MaxLength(120)
    private java.lang.String usuario;
    @MaxLength(4)
    private java.lang.String idEdoCivil;
    private java.lang.Integer idEdoNac;
    private java.lang.Integer idEdoNom;
    private java.lang.Integer idEdoNomAnt;
    private java.lang.Integer idEdoParticular;
    private java.lang.Integer idEdoPre;
    private java.lang.Integer idEspProtcivil;
    @MaxLength(4)
    private java.lang.String idGenero;
    @MaxLength(4)
    private java.lang.String idGrupoPago;
    private java.lang.Integer idInmueble;
    private java.lang.Integer idInstEducativa;
    private java.lang.Integer idInstProtcivil;
    @MaxLength(4)
    private java.lang.String idJerarquiaAnt;
    @MaxLength(4)
    private java.lang.String idJerarquiaNom;
    private java.lang.Integer idMovtoPersona;
    private java.lang.Integer idMuniNom;
    private java.lang.Integer idMuniNomAnt;
    private java.lang.Integer idMuniParticular;
    @MaxLength(4)
    private java.lang.String idNacionalidad;
    private java.lang.Integer idNivelEscolar;
    @MaxLength(16)
    private java.lang.String idNivelPtoAnt;
    @MaxLength(16)
    private java.lang.String idNivelPtoNom;
    @MaxLength(8)
    private java.lang.String idNombramientoAnt;
    @MaxLength(4)
    private java.lang.String idNombramientoNom;
    private java.lang.Integer idPlaza;
    private java.lang.Float idProfnCarrera;
    @MaxLength(8)
    private java.lang.String idPtoEstrategico;
    @MaxLength(28)
    private java.lang.String idPuestoNom;
    @MaxLength(28)
    private java.lang.String idPuestoNomAnt;
    @MaxLength(28)
    private java.lang.String idPuestoPre;
    private java.lang.Integer idRangoNom;
    private java.lang.Integer idRangoNomAnt;
    private java.lang.Integer idRangoPre;
    private java.lang.Integer idRusp;
    @MaxLength(20)
    private java.lang.String idServPub;
    @MaxLength(8)
    private java.lang.String idSituacionPlaza;
    @MaxLength(4)
    private java.lang.String idTipoPlaza;
    @MaxLength(12)
    private java.lang.String idUnidadNom;
    @MaxLength(12)
    private java.lang.String idUnidadNomAnt;
    @MaxLength(12)
    private java.lang.String idUnidadPre;
    private java.lang.Integer idZonaDistNom;
    private java.lang.Integer idZonaEcoNom;
    private java.lang.Integer idZonaEcoNomAnt;
    private java.lang.Integer idZonaEcoPre;
    @MaxLength(160)
    private java.lang.String mepAla;
    @MaxLength(480)
    private java.lang.String mepCalleParticular;
    @MaxLength(4)
    private java.lang.String mepCasoMuestra;
    @MaxLength(72)
    private java.lang.String mepClabe;
    @MaxLength(20)
    private java.lang.String mepCodpostParticular;
    @MaxLength(200)
    private java.lang.String mepColoniaParticular;
    @MaxLength(4)
    private java.lang.String mepCompatEmpleo;
    @MaxLength(60)
    private java.lang.String mepConmut;
    @MaxLength(72)
    private java.lang.String mepCurp;
    @MaxLength(4)
    private java.lang.String mepDiscapacidad;
    @MaxLength(160)
    private java.lang.String mepEdif;
    @MaxLength(4)
    private java.lang.String mepEstudiaSiNo;
    @MaxLength(60)
    private java.lang.String mepExt1;
    @MaxLength(60)
    private java.lang.String mepExt2;
    @MaxLength(240)
    private java.lang.String mepEMailOficial;
    @MaxLength(240)
    private java.lang.String mepEMailPersonal;
    private java.util.Date mepFechaCancela;
    private java.util.Date mepFecIngSpc;
    private java.util.Date mepFecIniDeclPatr;
    private java.util.Date mepFecNacimiento;
    private java.util.Date mepFecNotDecPatr;
    private java.util.Date mepFinCont;
    private java.util.Date mepFinLic;
    private java.lang.Double mepImporteHonorario;
    @MaxLength(44)
    private java.lang.String mepImssIssste;
    private java.util.Date mepIngresoDependencia;
    private java.util.Date mepIngresoGobFed;
    private java.util.Date mepIniCont;
    private java.util.Date mepIniLic;
    @MaxLength(160)
    private java.lang.String mepNombre;
    @MaxLength(1020)
    private java.lang.String mepObserva;
    @MaxLength(2000)
    private java.lang.String mepObservaInternas;
    @MaxLength(160)
    private java.lang.String mepOfna;
    @MaxLength(4)
    private java.lang.String mepPadreMadre;
    @MaxLength(160)
    private java.lang.String mepPiso;
    private java.lang.Integer mepPlazaAnt;
    private java.lang.Integer mepPlazaRespaldo;
    @MaxLength(160)
    private java.lang.String mepPrimerApellido;
    private java.lang.Integer mepQnaCancela;
    private java.lang.Integer mepQnaCaptura;
    @MaxLength(76)
    private java.lang.String mepReferenciaOficio;
    @MaxLength(52)
    private java.lang.String mepRfc;
    @MaxLength(52)
    private java.lang.String mepRfcUnico;
    @MaxLength(160)
    private java.lang.String mepSegundoApellido;
    @MaxLength(4)
    private java.lang.String mepSistemaReparto;
    @MaxLength(4)
    private java.lang.String mepSpcAnioAnt;
    @MaxLength(60)
    private java.lang.String mepTelOf1;
    @MaxLength(60)
    private java.lang.String mepTelOf2;
    @MaxLength(60)
    private java.lang.String mepTelParticular;
    private java.util.Date mepTerminoCargoSind;
    private java.util.Date mepUltimoMovto;
    @MaxLength(52)
    private java.lang.String mepUsrCancela;

    /**
     * Constructor for TnMovtosEmpPlaDTO class.
     */
    public TnMovtosEmpPlaDTO() {
    }


    /**
     * Constructor for TnMovtosEmpPlaDTO class.
     *
     * @param idMovtosEmpPla java.lang.Integer
     * @param idBancoSar java.lang.String
     * @param idTipoPago java.lang.String
     * @param fecModifico java.util.Date
     * @param usuario java.lang.String
     * @param idEdoCivil java.lang.String
     * @param idEdoNac java.lang.Integer
     * @param idEdoNom java.lang.Integer
     * @param idEdoNomAnt java.lang.Integer
     * @param idEdoParticular java.lang.Integer
     * @param idEdoPre java.lang.Integer
     * @param idEspProtcivil java.lang.Integer
     * @param idGenero java.lang.String
     * @param idGrupoPago java.lang.String
     * @param idInmueble java.lang.Integer
     * @param idInstEducativa java.lang.Integer
     * @param idInstProtcivil java.lang.Integer
     * @param idJerarquiaAnt java.lang.String
     * @param idJerarquiaNom java.lang.String
     * @param idMovtoPersona java.lang.Integer
     * @param idMuniNom java.lang.Integer
     * @param idMuniNomAnt java.lang.Integer
     * @param idMuniParticular java.lang.Integer
     * @param idNacionalidad java.lang.String
     * @param idNivelEscolar java.lang.Integer
     * @param idNivelPtoAnt java.lang.String
     * @param idNivelPtoNom java.lang.String
     * @param idNombramientoAnt java.lang.String
     * @param idNombramientoNom java.lang.String
     * @param idPlaza java.lang.Integer
     * @param idProfnCarrera java.lang.Float
     * @param idPtoEstrategico java.lang.String
     * @param idPuestoNom java.lang.String
     * @param idPuestoNomAnt java.lang.String
     * @param idPuestoPre java.lang.String
     * @param idRangoNom java.lang.Integer
     * @param idRangoNomAnt java.lang.Integer
     * @param idRangoPre java.lang.Integer
     * @param idRusp java.lang.Integer
     * @param idServPub java.lang.String
     * @param idSituacionPlaza java.lang.String
     * @param idTipoPlaza java.lang.String
     * @param idUnidadNom java.lang.String
     * @param idUnidadNomAnt java.lang.String
     * @param idUnidadPre java.lang.String
     * @param idZonaDistNom java.lang.Integer
     * @param idZonaEcoNom java.lang.Integer
     * @param idZonaEcoNomAnt java.lang.Integer
     * @param idZonaEcoPre java.lang.Integer
     * @param mepAla java.lang.String
     * @param mepCalleParticular java.lang.String
     * @param mepCasoMuestra java.lang.String
     * @param mepClabe java.lang.String
     * @param mepCodpostParticular java.lang.String
     * @param mepColoniaParticular java.lang.String
     * @param mepCompatEmpleo java.lang.String
     * @param mepConmut java.lang.String
     * @param mepCurp java.lang.String
     * @param mepDiscapacidad java.lang.String
     * @param mepEdif java.lang.String
     * @param mepEstudiaSiNo java.lang.String
     * @param mepExt1 java.lang.String
     * @param mepExt2 java.lang.String
     * @param mepEMailOficial java.lang.String
     * @param mepEMailPersonal java.lang.String
     * @param mepFechaCancela java.util.Date
     * @param mepFecIngSpc java.util.Date
     * @param mepFecIniDeclPatr java.util.Date
     * @param mepFecNacimiento java.util.Date
     * @param mepFecNotDecPatr java.util.Date
     * @param mepFinCont java.util.Date
     * @param mepFinLic java.util.Date
     * @param mepImporteHonorario java.lang.Double
     * @param mepImssIssste java.lang.String
     * @param mepIngresoDependencia java.util.Date
     * @param mepIngresoGobFed java.util.Date
     * @param mepIniCont java.util.Date
     * @param mepIniLic java.util.Date
     * @param mepNombre java.lang.String
     * @param mepObserva java.lang.String
     * @param mepObservaInternas java.lang.String
     * @param mepOfna java.lang.String
     * @param mepPadreMadre java.lang.String
     * @param mepPiso java.lang.String
     * @param mepPlazaAnt java.lang.Integer
     * @param mepPlazaRespaldo java.lang.Integer
     * @param mepPrimerApellido java.lang.String
     * @param mepQnaCancela java.lang.Integer
     * @param mepQnaCaptura java.lang.Integer
     * @param mepReferenciaOficio java.lang.String
     * @param mepRfc java.lang.String
     * @param mepRfcUnico java.lang.String
     * @param mepSegundoApellido java.lang.String
     * @param mepSistemaReparto java.lang.String
     * @param mepSpcAnioAnt java.lang.String
     * @param mepTelOf1 java.lang.String
     * @param mepTelOf2 java.lang.String
     * @param mepTelParticular java.lang.String
     * @param mepTerminoCargoSind java.util.Date
     * @param mepUltimoMovto java.util.Date
     * @param mepUsrCancela java.lang.String
     */
    public TnMovtosEmpPlaDTO(java.lang.Integer idMovtosEmpPla, 
                             java.lang.String idBancoSar, 
                             java.lang.String idTipoPago, 
                             java.util.Date fecModifico, 
                             java.lang.String usuario, 
                             java.lang.String idEdoCivil, 
                             java.lang.Integer idEdoNac, 
                             java.lang.Integer idEdoNom, 
                             java.lang.Integer idEdoNomAnt, 
                             java.lang.Integer idEdoParticular, 
                             java.lang.Integer idEdoPre, 
                             java.lang.Integer idEspProtcivil, 
                             java.lang.String idGenero, 
                             java.lang.String idGrupoPago, 
                             java.lang.Integer idInmueble, 
                             java.lang.Integer idInstEducativa, 
                             java.lang.Integer idInstProtcivil, 
                             java.lang.String idJerarquiaAnt, 
                             java.lang.String idJerarquiaNom, 
                             java.lang.Integer idMovtoPersona, 
                             java.lang.Integer idMuniNom, 
                             java.lang.Integer idMuniNomAnt, 
                             java.lang.Integer idMuniParticular, 
                             java.lang.String idNacionalidad, 
                             java.lang.Integer idNivelEscolar, 
                             java.lang.String idNivelPtoAnt, 
                             java.lang.String idNivelPtoNom, 
                             java.lang.String idNombramientoAnt, 
                             java.lang.String idNombramientoNom, 
                             java.lang.Integer idPlaza, 
                             java.lang.Float idProfnCarrera, 
                             java.lang.String idPtoEstrategico, 
                             java.lang.String idPuestoNom, 
                             java.lang.String idPuestoNomAnt, 
                             java.lang.String idPuestoPre, 
                             java.lang.Integer idRangoNom, 
                             java.lang.Integer idRangoNomAnt, 
                             java.lang.Integer idRangoPre, 
                             java.lang.Integer idRusp, 
                             java.lang.String idServPub, 
                             java.lang.String idSituacionPlaza, 
                             java.lang.String idTipoPlaza, 
                             java.lang.String idUnidadNom, 
                             java.lang.String idUnidadNomAnt, 
                             java.lang.String idUnidadPre, 
                             java.lang.Integer idZonaDistNom, 
                             java.lang.Integer idZonaEcoNom, 
                             java.lang.Integer idZonaEcoNomAnt, 
                             java.lang.Integer idZonaEcoPre, 
                             java.lang.String mepAla, 
                             java.lang.String mepCalleParticular, 
                             java.lang.String mepCasoMuestra, 
                             java.lang.String mepClabe, 
                             java.lang.String mepCodpostParticular, 
                             java.lang.String mepColoniaParticular, 
                             java.lang.String mepCompatEmpleo, 
                             java.lang.String mepConmut, 
                             java.lang.String mepCurp, 
                             java.lang.String mepDiscapacidad, 
                             java.lang.String mepEdif, 
                             java.lang.String mepEstudiaSiNo, 
                             java.lang.String mepExt1, 
                             java.lang.String mepExt2, 
                             java.lang.String mepEMailOficial, 
                             java.lang.String mepEMailPersonal, 
                             java.util.Date mepFechaCancela, 
                             java.util.Date mepFecIngSpc, 
                             java.util.Date mepFecIniDeclPatr, 
                             java.util.Date mepFecNacimiento, 
                             java.util.Date mepFecNotDecPatr, 
                             java.util.Date mepFinCont, 
                             java.util.Date mepFinLic, 
                             java.lang.Double mepImporteHonorario, 
                             java.lang.String mepImssIssste, 
                             java.util.Date mepIngresoDependencia, 
                             java.util.Date mepIngresoGobFed, 
                             java.util.Date mepIniCont, 
                             java.util.Date mepIniLic, 
                             java.lang.String mepNombre, 
                             java.lang.String mepObserva, 
                             java.lang.String mepObservaInternas, 
                             java.lang.String mepOfna, 
                             java.lang.String mepPadreMadre, 
                             java.lang.String mepPiso, 
                             java.lang.Integer mepPlazaAnt, 
                             java.lang.Integer mepPlazaRespaldo, 
                             java.lang.String mepPrimerApellido, 
                             java.lang.Integer mepQnaCancela, 
                             java.lang.Integer mepQnaCaptura, 
                             java.lang.String mepReferenciaOficio, 
                             java.lang.String mepRfc, 
                             java.lang.String mepRfcUnico, 
                             java.lang.String mepSegundoApellido, 
                             java.lang.String mepSistemaReparto, 
                             java.lang.String mepSpcAnioAnt, 
                             java.lang.String mepTelOf1, 
                             java.lang.String mepTelOf2, 
                             java.lang.String mepTelParticular, 
                             java.util.Date mepTerminoCargoSind, 
                             java.util.Date mepUltimoMovto, 
                             java.lang.String mepUsrCancela) {
        this.idMovtosEmpPla = idMovtosEmpPla;
        this.idBancoSar = idBancoSar;
        this.idTipoPago = idTipoPago;
        this.fecModifico = fecModifico;
        this.usuario = usuario;
        this.idEdoCivil = idEdoCivil;
        this.idEdoNac = idEdoNac;
        this.idEdoNom = idEdoNom;
        this.idEdoNomAnt = idEdoNomAnt;
        this.idEdoParticular = idEdoParticular;
        this.idEdoPre = idEdoPre;
        this.idEspProtcivil = idEspProtcivil;
        this.idGenero = idGenero;
        this.idGrupoPago = idGrupoPago;
        this.idInmueble = idInmueble;
        this.idInstEducativa = idInstEducativa;
        this.idInstProtcivil = idInstProtcivil;
        this.idJerarquiaAnt = idJerarquiaAnt;
        this.idJerarquiaNom = idJerarquiaNom;
        this.idMovtoPersona = idMovtoPersona;
        this.idMuniNom = idMuniNom;
        this.idMuniNomAnt = idMuniNomAnt;
        this.idMuniParticular = idMuniParticular;
        this.idNacionalidad = idNacionalidad;
        this.idNivelEscolar = idNivelEscolar;
        this.idNivelPtoAnt = idNivelPtoAnt;
        this.idNivelPtoNom = idNivelPtoNom;
        this.idNombramientoAnt = idNombramientoAnt;
        this.idNombramientoNom = idNombramientoNom;
        this.idPlaza = idPlaza;
        this.idProfnCarrera = idProfnCarrera;
        this.idPtoEstrategico = idPtoEstrategico;
        this.idPuestoNom = idPuestoNom;
        this.idPuestoNomAnt = idPuestoNomAnt;
        this.idPuestoPre = idPuestoPre;
        this.idRangoNom = idRangoNom;
        this.idRangoNomAnt = idRangoNomAnt;
        this.idRangoPre = idRangoPre;
        this.idRusp = idRusp;
        this.idServPub = idServPub;
        this.idSituacionPlaza = idSituacionPlaza;
        this.idTipoPlaza = idTipoPlaza;
        this.idUnidadNom = idUnidadNom;
        this.idUnidadNomAnt = idUnidadNomAnt;
        this.idUnidadPre = idUnidadPre;
        this.idZonaDistNom = idZonaDistNom;
        this.idZonaEcoNom = idZonaEcoNom;
        this.idZonaEcoNomAnt = idZonaEcoNomAnt;
        this.idZonaEcoPre = idZonaEcoPre;
        this.mepAla = mepAla;
        this.mepCalleParticular = mepCalleParticular;
        this.mepCasoMuestra = mepCasoMuestra;
        this.mepClabe = mepClabe;
        this.mepCodpostParticular = mepCodpostParticular;
        this.mepColoniaParticular = mepColoniaParticular;
        this.mepCompatEmpleo = mepCompatEmpleo;
        this.mepConmut = mepConmut;
        this.mepCurp = mepCurp;
        this.mepDiscapacidad = mepDiscapacidad;
        this.mepEdif = mepEdif;
        this.mepEstudiaSiNo = mepEstudiaSiNo;
        this.mepExt1 = mepExt1;
        this.mepExt2 = mepExt2;
        this.mepEMailOficial = mepEMailOficial;
        this.mepEMailPersonal = mepEMailPersonal;
        this.mepFechaCancela = mepFechaCancela;
        this.mepFecIngSpc = mepFecIngSpc;
        this.mepFecIniDeclPatr = mepFecIniDeclPatr;
        this.mepFecNacimiento = mepFecNacimiento;
        this.mepFecNotDecPatr = mepFecNotDecPatr;
        this.mepFinCont = mepFinCont;
        this.mepFinLic = mepFinLic;
        this.mepImporteHonorario = mepImporteHonorario;
        this.mepImssIssste = mepImssIssste;
        this.mepIngresoDependencia = mepIngresoDependencia;
        this.mepIngresoGobFed = mepIngresoGobFed;
        this.mepIniCont = mepIniCont;
        this.mepIniLic = mepIniLic;
        this.mepNombre = mepNombre;
        this.mepObserva = mepObserva;
        this.mepObservaInternas = mepObservaInternas;
        this.mepOfna = mepOfna;
        this.mepPadreMadre = mepPadreMadre;
        this.mepPiso = mepPiso;
        this.mepPlazaAnt = mepPlazaAnt;
        this.mepPlazaRespaldo = mepPlazaRespaldo;
        this.mepPrimerApellido = mepPrimerApellido;
        this.mepQnaCancela = mepQnaCancela;
        this.mepQnaCaptura = mepQnaCaptura;
        this.mepReferenciaOficio = mepReferenciaOficio;
        this.mepRfc = mepRfc;
        this.mepRfcUnico = mepRfcUnico;
        this.mepSegundoApellido = mepSegundoApellido;
        this.mepSistemaReparto = mepSistemaReparto;
        this.mepSpcAnioAnt = mepSpcAnioAnt;
        this.mepTelOf1 = mepTelOf1;
        this.mepTelOf2 = mepTelOf2;
        this.mepTelParticular = mepTelParticular;
        this.mepTerminoCargoSind = mepTerminoCargoSind;
        this.mepUltimoMovto = mepUltimoMovto;
        this.mepUsrCancela = mepUsrCancela;
    }


    /**
     * Set idMovtosEmpPla value.
     *
     * @param idMovtosEmpPla java.lang.Integer
     */
    public void setIdMovtosEmpPla(java.lang.Integer idMovtosEmpPla) {
        this.idMovtosEmpPla = idMovtosEmpPla;
    }

    /**
     * Get idMovtosEmpPla value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getIdMovtosEmpPla() {
        return this.idMovtosEmpPla;
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
     * Get idBancoSar value.
     *
     * @return java.lang.String
     */
    public java.lang.String getIdBancoSar() {
        return this.idBancoSar;
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
     * Get idTipoPago value.
     *
     * @return java.lang.String
     */
    public java.lang.String getIdTipoPago() {
        return this.idTipoPago;
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
     * Get fecModifico value.
     *
     * @return java.util.Date
     */
    public java.util.Date getFecModifico() {
        return this.fecModifico;
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
     * Get usuario value.
     *
     * @return java.lang.String
     */
    public java.lang.String getUsuario() {
        return this.usuario;
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
     * Get idEdoCivil value.
     *
     * @return java.lang.String
     */
    public java.lang.String getIdEdoCivil() {
        return this.idEdoCivil;
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
     * Get idEdoNac value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getIdEdoNac() {
        return this.idEdoNac;
    }

    /**
     * Set idEdoNom value.
     *
     * @param idEdoNom java.lang.Integer
     */
    public void setIdEdoNom(java.lang.Integer idEdoNom) {
        this.idEdoNom = idEdoNom;
    }

    /**
     * Get idEdoNom value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getIdEdoNom() {
        return this.idEdoNom;
    }

    /**
     * Set idEdoNomAnt value.
     *
     * @param idEdoNomAnt java.lang.Integer
     */
    public void setIdEdoNomAnt(java.lang.Integer idEdoNomAnt) {
        this.idEdoNomAnt = idEdoNomAnt;
    }

    /**
     * Get idEdoNomAnt value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getIdEdoNomAnt() {
        return this.idEdoNomAnt;
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
     * Get idEdoParticular value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getIdEdoParticular() {
        return this.idEdoParticular;
    }

    /**
     * Set idEdoPre value.
     *
     * @param idEdoPre java.lang.Integer
     */
    public void setIdEdoPre(java.lang.Integer idEdoPre) {
        this.idEdoPre = idEdoPre;
    }

    /**
     * Get idEdoPre value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getIdEdoPre() {
        return this.idEdoPre;
    }

    /**
     * Set idEspProtcivil value.
     *
     * @param idEspProtcivil java.lang.Integer
     */
    public void setIdEspProtcivil(java.lang.Integer idEspProtcivil) {
        this.idEspProtcivil = idEspProtcivil;
    }

    /**
     * Get idEspProtcivil value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getIdEspProtcivil() {
        return this.idEspProtcivil;
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
     * Get idGenero value.
     *
     * @return java.lang.String
     */
    public java.lang.String getIdGenero() {
        return this.idGenero;
    }

    /**
     * Set idGrupoPago value.
     *
     * @param idGrupoPago java.lang.String
     */
    public void setIdGrupoPago(java.lang.String idGrupoPago) {
        this.idGrupoPago = idGrupoPago;
    }

    /**
     * Get idGrupoPago value.
     *
     * @return java.lang.String
     */
    public java.lang.String getIdGrupoPago() {
        return this.idGrupoPago;
    }

    /**
     * Set idInmueble value.
     *
     * @param idInmueble java.lang.Integer
     */
    public void setIdInmueble(java.lang.Integer idInmueble) {
        this.idInmueble = idInmueble;
    }

    /**
     * Get idInmueble value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getIdInmueble() {
        return this.idInmueble;
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
     * Get idInstEducativa value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getIdInstEducativa() {
        return this.idInstEducativa;
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
     * Get idInstProtcivil value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getIdInstProtcivil() {
        return this.idInstProtcivil;
    }

    /**
     * Set idJerarquiaAnt value.
     *
     * @param idJerarquiaAnt java.lang.String
     */
    public void setIdJerarquiaAnt(java.lang.String idJerarquiaAnt) {
        this.idJerarquiaAnt = idJerarquiaAnt;
    }

    /**
     * Get idJerarquiaAnt value.
     *
     * @return java.lang.String
     */
    public java.lang.String getIdJerarquiaAnt() {
        return this.idJerarquiaAnt;
    }

    /**
     * Set idJerarquiaNom value.
     *
     * @param idJerarquiaNom java.lang.String
     */
    public void setIdJerarquiaNom(java.lang.String idJerarquiaNom) {
        this.idJerarquiaNom = idJerarquiaNom;
    }

    /**
     * Get idJerarquiaNom value.
     *
     * @return java.lang.String
     */
    public java.lang.String getIdJerarquiaNom() {
        return this.idJerarquiaNom;
    }

    /**
     * Set idMovtoPersona value.
     *
     * @param idMovtoPersona java.lang.Integer
     */
    public void setIdMovtoPersona(java.lang.Integer idMovtoPersona) {
        this.idMovtoPersona = idMovtoPersona;
    }

    /**
     * Get idMovtoPersona value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getIdMovtoPersona() {
        return this.idMovtoPersona;
    }

    /**
     * Set idMuniNom value.
     *
     * @param idMuniNom java.lang.Integer
     */
    public void setIdMuniNom(java.lang.Integer idMuniNom) {
        this.idMuniNom = idMuniNom;
    }

    /**
     * Get idMuniNom value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getIdMuniNom() {
        return this.idMuniNom;
    }

    /**
     * Set idMuniNomAnt value.
     *
     * @param idMuniNomAnt java.lang.Integer
     */
    public void setIdMuniNomAnt(java.lang.Integer idMuniNomAnt) {
        this.idMuniNomAnt = idMuniNomAnt;
    }

    /**
     * Get idMuniNomAnt value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getIdMuniNomAnt() {
        return this.idMuniNomAnt;
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
     * Get idMuniParticular value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getIdMuniParticular() {
        return this.idMuniParticular;
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
     * Get idNacionalidad value.
     *
     * @return java.lang.String
     */
    public java.lang.String getIdNacionalidad() {
        return this.idNacionalidad;
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
     * Get idNivelEscolar value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getIdNivelEscolar() {
        return this.idNivelEscolar;
    }

    /**
     * Set idNivelPtoAnt value.
     *
     * @param idNivelPtoAnt java.lang.String
     */
    public void setIdNivelPtoAnt(java.lang.String idNivelPtoAnt) {
        this.idNivelPtoAnt = idNivelPtoAnt;
    }

    /**
     * Get idNivelPtoAnt value.
     *
     * @return java.lang.String
     */
    public java.lang.String getIdNivelPtoAnt() {
        return this.idNivelPtoAnt;
    }

    /**
     * Set idNivelPtoNom value.
     *
     * @param idNivelPtoNom java.lang.String
     */
    public void setIdNivelPtoNom(java.lang.String idNivelPtoNom) {
        this.idNivelPtoNom = idNivelPtoNom;
    }

    /**
     * Get idNivelPtoNom value.
     *
     * @return java.lang.String
     */
    public java.lang.String getIdNivelPtoNom() {
        return this.idNivelPtoNom;
    }

    /**
     * Set idNombramientoAnt value.
     *
     * @param idNombramientoAnt java.lang.String
     */
    public void setIdNombramientoAnt(java.lang.String idNombramientoAnt) {
        this.idNombramientoAnt = idNombramientoAnt;
    }

    /**
     * Get idNombramientoAnt value.
     *
     * @return java.lang.String
     */
    public java.lang.String getIdNombramientoAnt() {
        return this.idNombramientoAnt;
    }

    /**
     * Set idNombramientoNom value.
     *
     * @param idNombramientoNom java.lang.String
     */
    public void setIdNombramientoNom(java.lang.String idNombramientoNom) {
        this.idNombramientoNom = idNombramientoNom;
    }

    /**
     * Get idNombramientoNom value.
     *
     * @return java.lang.String
     */
    public java.lang.String getIdNombramientoNom() {
        return this.idNombramientoNom;
    }

    /**
     * Set idPlaza value.
     *
     * @param idPlaza java.lang.Integer
     */
    public void setIdPlaza(java.lang.Integer idPlaza) {
        this.idPlaza = idPlaza;
    }

    /**
     * Get idPlaza value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getIdPlaza() {
        return this.idPlaza;
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
     * Get idProfnCarrera value.
     *
     * @return java.lang.Float
     */
    public java.lang.Float getIdProfnCarrera() {
        return this.idProfnCarrera;
    }

    /**
     * Set idPtoEstrategico value.
     *
     * @param idPtoEstrategico java.lang.String
     */
    public void setIdPtoEstrategico(java.lang.String idPtoEstrategico) {
        this.idPtoEstrategico = idPtoEstrategico;
    }

    /**
     * Get idPtoEstrategico value.
     *
     * @return java.lang.String
     */
    public java.lang.String getIdPtoEstrategico() {
        return this.idPtoEstrategico;
    }

    /**
     * Set idPuestoNom value.
     *
     * @param idPuestoNom java.lang.String
     */
    public void setIdPuestoNom(java.lang.String idPuestoNom) {
        this.idPuestoNom = idPuestoNom;
    }

    /**
     * Get idPuestoNom value.
     *
     * @return java.lang.String
     */
    public java.lang.String getIdPuestoNom() {
        return this.idPuestoNom;
    }

    /**
     * Set idPuestoNomAnt value.
     *
     * @param idPuestoNomAnt java.lang.String
     */
    public void setIdPuestoNomAnt(java.lang.String idPuestoNomAnt) {
        this.idPuestoNomAnt = idPuestoNomAnt;
    }

    /**
     * Get idPuestoNomAnt value.
     *
     * @return java.lang.String
     */
    public java.lang.String getIdPuestoNomAnt() {
        return this.idPuestoNomAnt;
    }

    /**
     * Set idPuestoPre value.
     *
     * @param idPuestoPre java.lang.String
     */
    public void setIdPuestoPre(java.lang.String idPuestoPre) {
        this.idPuestoPre = idPuestoPre;
    }

    /**
     * Get idPuestoPre value.
     *
     * @return java.lang.String
     */
    public java.lang.String getIdPuestoPre() {
        return this.idPuestoPre;
    }

    /**
     * Set idRangoNom value.
     *
     * @param idRangoNom java.lang.Integer
     */
    public void setIdRangoNom(java.lang.Integer idRangoNom) {
        this.idRangoNom = idRangoNom;
    }

    /**
     * Get idRangoNom value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getIdRangoNom() {
        return this.idRangoNom;
    }

    /**
     * Set idRangoNomAnt value.
     *
     * @param idRangoNomAnt java.lang.Integer
     */
    public void setIdRangoNomAnt(java.lang.Integer idRangoNomAnt) {
        this.idRangoNomAnt = idRangoNomAnt;
    }

    /**
     * Get idRangoNomAnt value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getIdRangoNomAnt() {
        return this.idRangoNomAnt;
    }

    /**
     * Set idRangoPre value.
     *
     * @param idRangoPre java.lang.Integer
     */
    public void setIdRangoPre(java.lang.Integer idRangoPre) {
        this.idRangoPre = idRangoPre;
    }

    /**
     * Get idRangoPre value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getIdRangoPre() {
        return this.idRangoPre;
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
     * Get idRusp value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getIdRusp() {
        return this.idRusp;
    }

    /**
     * Set idServPub value.
     *
     * @param idServPub java.lang.String
     */
    public void setIdServPub(java.lang.String idServPub) {
        this.idServPub = idServPub;
    }

    /**
     * Get idServPub value.
     *
     * @return java.lang.String
     */
    public java.lang.String getIdServPub() {
        return this.idServPub;
    }

    /**
     * Set idSituacionPlaza value.
     *
     * @param idSituacionPlaza java.lang.String
     */
    public void setIdSituacionPlaza(java.lang.String idSituacionPlaza) {
        this.idSituacionPlaza = idSituacionPlaza;
    }

    /**
     * Get idSituacionPlaza value.
     *
     * @return java.lang.String
     */
    public java.lang.String getIdSituacionPlaza() {
        return this.idSituacionPlaza;
    }

    /**
     * Set idTipoPlaza value.
     *
     * @param idTipoPlaza java.lang.String
     */
    public void setIdTipoPlaza(java.lang.String idTipoPlaza) {
        this.idTipoPlaza = idTipoPlaza;
    }

    /**
     * Get idTipoPlaza value.
     *
     * @return java.lang.String
     */
    public java.lang.String getIdTipoPlaza() {
        return this.idTipoPlaza;
    }

    /**
     * Set idUnidadNom value.
     *
     * @param idUnidadNom java.lang.String
     */
    public void setIdUnidadNom(java.lang.String idUnidadNom) {
        this.idUnidadNom = idUnidadNom;
    }

    /**
     * Get idUnidadNom value.
     *
     * @return java.lang.String
     */
    public java.lang.String getIdUnidadNom() {
        return this.idUnidadNom;
    }

    /**
     * Set idUnidadNomAnt value.
     *
     * @param idUnidadNomAnt java.lang.String
     */
    public void setIdUnidadNomAnt(java.lang.String idUnidadNomAnt) {
        this.idUnidadNomAnt = idUnidadNomAnt;
    }

    /**
     * Get idUnidadNomAnt value.
     *
     * @return java.lang.String
     */
    public java.lang.String getIdUnidadNomAnt() {
        return this.idUnidadNomAnt;
    }

    /**
     * Set idUnidadPre value.
     *
     * @param idUnidadPre java.lang.String
     */
    public void setIdUnidadPre(java.lang.String idUnidadPre) {
        this.idUnidadPre = idUnidadPre;
    }

    /**
     * Get idUnidadPre value.
     *
     * @return java.lang.String
     */
    public java.lang.String getIdUnidadPre() {
        return this.idUnidadPre;
    }

    /**
     * Set idZonaDistNom value.
     *
     * @param idZonaDistNom java.lang.Integer
     */
    public void setIdZonaDistNom(java.lang.Integer idZonaDistNom) {
        this.idZonaDistNom = idZonaDistNom;
    }

    /**
     * Get idZonaDistNom value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getIdZonaDistNom() {
        return this.idZonaDistNom;
    }

    /**
     * Set idZonaEcoNom value.
     *
     * @param idZonaEcoNom java.lang.Integer
     */
    public void setIdZonaEcoNom(java.lang.Integer idZonaEcoNom) {
        this.idZonaEcoNom = idZonaEcoNom;
    }

    /**
     * Get idZonaEcoNom value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getIdZonaEcoNom() {
        return this.idZonaEcoNom;
    }

    /**
     * Set idZonaEcoNomAnt value.
     *
     * @param idZonaEcoNomAnt java.lang.Integer
     */
    public void setIdZonaEcoNomAnt(java.lang.Integer idZonaEcoNomAnt) {
        this.idZonaEcoNomAnt = idZonaEcoNomAnt;
    }

    /**
     * Get idZonaEcoNomAnt value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getIdZonaEcoNomAnt() {
        return this.idZonaEcoNomAnt;
    }

    /**
     * Set idZonaEcoPre value.
     *
     * @param idZonaEcoPre java.lang.Boolean
     */
    public void setIdZonaEcoPre(java.lang.Integer idZonaEcoPre) {
        this.idZonaEcoPre = idZonaEcoPre;
    }

    /**
     * Get idZonaEcoPre value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getIdZonaEcoPre() {
        return this.idZonaEcoPre;
    }

    /**
     * Set mepAla value.
     *
     * @param mepAla java.lang.String
     */
    public void setMepAla(java.lang.String mepAla) {
        this.mepAla = mepAla;
    }

    /**
     * Get mepAla value.
     *
     * @return java.lang.String
     */
    public java.lang.String getMepAla() {
        return this.mepAla;
    }

    /**
     * Set mepCalleParticular value.
     *
     * @param mepCalleParticular java.lang.String
     */
    public void setMepCalleParticular(java.lang.String mepCalleParticular) {
        this.mepCalleParticular = mepCalleParticular;
    }

    /**
     * Get mepCalleParticular value.
     *
     * @return java.lang.String
     */
    public java.lang.String getMepCalleParticular() {
        return this.mepCalleParticular;
    }

    /**
     * Set mepCasoMuestra value.
     *
     * @param mepCasoMuestra java.lang.String
     */
    public void setMepCasoMuestra(java.lang.String mepCasoMuestra) {
        this.mepCasoMuestra = mepCasoMuestra;
    }

    /**
     * Get mepCasoMuestra value.
     *
     * @return java.lang.String
     */
    public java.lang.String getMepCasoMuestra() {
        return this.mepCasoMuestra;
    }

    /**
     * Set mepClabe value.
     *
     * @param mepClabe java.lang.String
     */
    public void setMepClabe(java.lang.String mepClabe) {
        this.mepClabe = mepClabe;
    }

    /**
     * Get mepClabe value.
     *
     * @return java.lang.String
     */
    public java.lang.String getMepClabe() {
        return this.mepClabe;
    }

    /**
     * Set mepCodpostParticular value.
     *
     * @param mepCodpostParticular java.lang.String
     */
    public void setMepCodpostParticular(java.lang.String mepCodpostParticular) {
        this.mepCodpostParticular = mepCodpostParticular;
    }

    /**
     * Get mepCodpostParticular value.
     *
     * @return java.lang.String
     */
    public java.lang.String getMepCodpostParticular() {
        return this.mepCodpostParticular;
    }

    /**
     * Set mepColoniaParticular value.
     *
     * @param mepColoniaParticular java.lang.String
     */
    public void setMepColoniaParticular(java.lang.String mepColoniaParticular) {
        this.mepColoniaParticular = mepColoniaParticular;
    }

    /**
     * Get mepColoniaParticular value.
     *
     * @return java.lang.String
     */
    public java.lang.String getMepColoniaParticular() {
        return this.mepColoniaParticular;
    }

    /**
     * Set mepCompatEmpleo value.
     *
     * @param mepCompatEmpleo java.lang.String
     */
    public void setMepCompatEmpleo(java.lang.String mepCompatEmpleo) {
        this.mepCompatEmpleo = mepCompatEmpleo;
    }

    /**
     * Get mepCompatEmpleo value.
     *
     * @return java.lang.String
     */
    public java.lang.String getMepCompatEmpleo() {
        return this.mepCompatEmpleo;
    }

    /**
     * Set mepConmut value.
     *
     * @param mepConmut java.lang.String
     */
    public void setMepConmut(java.lang.String mepConmut) {
        this.mepConmut = mepConmut;
    }

    /**
     * Get mepConmut value.
     *
     * @return java.lang.String
     */
    public java.lang.String getMepConmut() {
        return this.mepConmut;
    }

    /**
     * Set mepCurp value.
     *
     * @param mepCurp java.lang.String
     */
    public void setMepCurp(java.lang.String mepCurp) {
        this.mepCurp = mepCurp;
    }

    /**
     * Get mepCurp value.
     *
     * @return java.lang.String
     */
    public java.lang.String getMepCurp() {
        return this.mepCurp;
    }

    /**
     * Set mepDiscapacidad value.
     *
     * @param mepDiscapacidad java.lang.String
     */
    public void setMepDiscapacidad(java.lang.String mepDiscapacidad) {
        this.mepDiscapacidad = mepDiscapacidad;
    }

    /**
     * Get mepDiscapacidad value.
     *
     * @return java.lang.String
     */
    public java.lang.String getMepDiscapacidad() {
        return this.mepDiscapacidad;
    }

    /**
     * Set mepEdif value.
     *
     * @param mepEdif java.lang.String
     */
    public void setMepEdif(java.lang.String mepEdif) {
        this.mepEdif = mepEdif;
    }

    /**
     * Get mepEdif value.
     *
     * @return java.lang.String
     */
    public java.lang.String getMepEdif() {
        return this.mepEdif;
    }

    /**
     * Set mepEstudiaSiNo value.
     *
     * @param mepEstudiaSiNo java.lang.String
     */
    public void setMepEstudiaSiNo(java.lang.String mepEstudiaSiNo) {
        this.mepEstudiaSiNo = mepEstudiaSiNo;
    }

    /**
     * Get mepEstudiaSiNo value.
     *
     * @return java.lang.String
     */
    public java.lang.String getMepEstudiaSiNo() {
        return this.mepEstudiaSiNo;
    }

    /**
     * Set mepExt1 value.
     *
     * @param mepExt1 java.lang.String
     */
    public void setMepExt1(java.lang.String mepExt1) {
        this.mepExt1 = mepExt1;
    }

    /**
     * Get mepExt1 value.
     *
     * @return java.lang.String
     */
    public java.lang.String getMepExt1() {
        return this.mepExt1;
    }

    /**
     * Set mepExt2 value.
     *
     * @param mepExt2 java.lang.String
     */
    public void setMepExt2(java.lang.String mepExt2) {
        this.mepExt2 = mepExt2;
    }

    /**
     * Get mepExt2 value.
     *
     * @return java.lang.String
     */
    public java.lang.String getMepExt2() {
        return this.mepExt2;
    }

    /**
     * Set mepEMailOficial value.
     *
     * @param mepEMailOficial java.lang.String
     */
    public void setMepEMailOficial(java.lang.String mepEMailOficial) {
        this.mepEMailOficial = mepEMailOficial;
    }

    /**
     * Get mepEMailOficial value.
     *
     * @return java.lang.String
     */
    public java.lang.String getMepEMailOficial() {
        return this.mepEMailOficial;
    }

    /**
     * Set mepEMailPersonal value.
     *
     * @param mepEMailPersonal java.lang.String
     */
    public void setMepEMailPersonal(java.lang.String mepEMailPersonal) {
        this.mepEMailPersonal = mepEMailPersonal;
    }

    /**
     * Get mepEMailPersonal value.
     *
     * @return java.lang.String
     */
    public java.lang.String getMepEMailPersonal() {
        return this.mepEMailPersonal;
    }

    /**
     * Set mepFechaCancela value.
     *
     * @param mepFechaCancela java.util.Date
     */
    public void setMepFechaCancela(java.util.Date mepFechaCancela) {
        this.mepFechaCancela = mepFechaCancela;
    }

    /**
     * Get mepFechaCancela value.
     *
     * @return java.util.Date
     */
    public java.util.Date getMepFechaCancela() {
        return this.mepFechaCancela;
    }

    /**
     * Set mepFecIngSpc value.
     *
     * @param mepFecIngSpc java.util.Date
     */
    public void setMepFecIngSpc(java.util.Date mepFecIngSpc) {
        this.mepFecIngSpc = mepFecIngSpc;
    }

    /**
     * Get mepFecIngSpc value.
     *
     * @return java.util.Date
     */
    public java.util.Date getMepFecIngSpc() {
        return this.mepFecIngSpc;
    }

    /**
     * Set mepFecIniDeclPatr value.
     *
     * @param mepFecIniDeclPatr java.util.Date
     */
    public void setMepFecIniDeclPatr(java.util.Date mepFecIniDeclPatr) {
        this.mepFecIniDeclPatr = mepFecIniDeclPatr;
    }

    /**
     * Get mepFecIniDeclPatr value.
     *
     * @return java.util.Date
     */
    public java.util.Date getMepFecIniDeclPatr() {
        return this.mepFecIniDeclPatr;
    }

    /**
     * Set mepFecNacimiento value.
     *
     * @param mepFecNacimiento java.util.Date
     */
    public void setMepFecNacimiento(java.util.Date mepFecNacimiento) {
        this.mepFecNacimiento = mepFecNacimiento;
    }

    /**
     * Get mepFecNacimiento value.
     *
     * @return java.util.Date
     */
    public java.util.Date getMepFecNacimiento() {
        return this.mepFecNacimiento;
    }

    /**
     * Set mepFecNotDecPatr value.
     *
     * @param mepFecNotDecPatr java.util.Date
     */
    public void setMepFecNotDecPatr(java.util.Date mepFecNotDecPatr) {
        this.mepFecNotDecPatr = mepFecNotDecPatr;
    }

    /**
     * Get mepFecNotDecPatr value.
     *
     * @return java.util.Date
     */
    public java.util.Date getMepFecNotDecPatr() {
        return this.mepFecNotDecPatr;
    }

    /**
     * Set mepFinCont value.
     *
     * @param mepFinCont java.util.Date
     */
    public void setMepFinCont(java.util.Date mepFinCont) {
        this.mepFinCont = mepFinCont;
    }

    /**
     * Get mepFinCont value.
     *
     * @return java.util.Date
     */
    public java.util.Date getMepFinCont() {
        return this.mepFinCont;
    }

    /**
     * Set mepFinLic value.
     *
     * @param mepFinLic java.util.Date
     */
    public void setMepFinLic(java.util.Date mepFinLic) {
        this.mepFinLic = mepFinLic;
    }

    /**
     * Get mepFinLic value.
     *
     * @return java.util.Date
     */
    public java.util.Date getMepFinLic() {
        return this.mepFinLic;
    }

    /**
     * Set mepImporteHonorario value.
     *
     * @param mepImporteHonorario java.lang.Double
     */
    public void setMepImporteHonorario(java.lang.Double mepImporteHonorario) {
        this.mepImporteHonorario = mepImporteHonorario;
    }

    /**
     * Get mepImporteHonorario value.
     *
     * @return java.lang.Double
     */
    public java.lang.Double getMepImporteHonorario() {
        return this.mepImporteHonorario;
    }

    /**
     * Set mepImssIssste value.
     *
     * @param mepImssIssste java.lang.String
     */
    public void setMepImssIssste(java.lang.String mepImssIssste) {
        this.mepImssIssste = mepImssIssste;
    }

    /**
     * Get mepImssIssste value.
     *
     * @return java.lang.String
     */
    public java.lang.String getMepImssIssste() {
        return this.mepImssIssste;
    }

    /**
     * Set mepIngresoDependencia value.
     *
     * @param mepIngresoDependencia java.util.Date
     */
    public void setMepIngresoDependencia(java.util.Date mepIngresoDependencia) {
        this.mepIngresoDependencia = mepIngresoDependencia;
    }

    /**
     * Get mepIngresoDependencia value.
     *
     * @return java.util.Date
     */
    public java.util.Date getMepIngresoDependencia() {
        return this.mepIngresoDependencia;
    }

    /**
     * Set mepIngresoGobFed value.
     *
     * @param mepIngresoGobFed java.util.Date
     */
    public void setMepIngresoGobFed(java.util.Date mepIngresoGobFed) {
        this.mepIngresoGobFed = mepIngresoGobFed;
    }

    /**
     * Get mepIngresoGobFed value.
     *
     * @return java.util.Date
     */
    public java.util.Date getMepIngresoGobFed() {
        return this.mepIngresoGobFed;
    }

    /**
     * Set mepIniCont value.
     *
     * @param mepIniCont java.util.Date
     */
    public void setMepIniCont(java.util.Date mepIniCont) {
        this.mepIniCont = mepIniCont;
    }

    /**
     * Get mepIniCont value.
     *
     * @return java.util.Date
     */
    public java.util.Date getMepIniCont() {
        return this.mepIniCont;
    }

    /**
     * Set mepIniLic value.
     *
     * @param mepIniLic java.util.Date
     */
    public void setMepIniLic(java.util.Date mepIniLic) {
        this.mepIniLic = mepIniLic;
    }

    /**
     * Get mepIniLic value.
     *
     * @return java.util.Date
     */
    public java.util.Date getMepIniLic() {
        return this.mepIniLic;
    }

    /**
     * Set mepNombre value.
     *
     * @param mepNombre java.lang.String
     */
    public void setMepNombre(java.lang.String mepNombre) {
        this.mepNombre = mepNombre;
    }

    /**
     * Get mepNombre value.
     *
     * @return java.lang.String
     */
    public java.lang.String getMepNombre() {
        return this.mepNombre;
    }

    /**
     * Set mepObserva value.
     *
     * @param mepObserva java.lang.String
     */
    public void setMepObserva(java.lang.String mepObserva) {
        this.mepObserva = mepObserva;
    }

    /**
     * Get mepObserva value.
     *
     * @return java.lang.String
     */
    public java.lang.String getMepObserva() {
        return this.mepObserva;
    }

    /**
     * Set mepObservaInternas value.
     *
     * @param mepObservaInternas java.lang.String
     */
    public void setMepObservaInternas(java.lang.String mepObservaInternas) {
        this.mepObservaInternas = mepObservaInternas;
    }

    /**
     * Get mepObservaInternas value.
     *
     * @return java.lang.String
     */
    public java.lang.String getMepObservaInternas() {
        return this.mepObservaInternas;
    }

    /**
     * Set mepOfna value.
     *
     * @param mepOfna java.lang.String
     */
    public void setMepOfna(java.lang.String mepOfna) {
        this.mepOfna = mepOfna;
    }

    /**
     * Get mepOfna value.
     *
     * @return java.lang.String
     */
    public java.lang.String getMepOfna() {
        return this.mepOfna;
    }

    /**
     * Set mepPadreMadre value.
     *
     * @param mepPadreMadre java.lang.String
     */
    public void setMepPadreMadre(java.lang.String mepPadreMadre) {
        this.mepPadreMadre = mepPadreMadre;
    }

    /**
     * Get mepPadreMadre value.
     *
     * @return java.lang.String
     */
    public java.lang.String getMepPadreMadre() {
        return this.mepPadreMadre;
    }

    /**
     * Set mepPiso value.
     *
     * @param mepPiso java.lang.String
     */
    public void setMepPiso(java.lang.String mepPiso) {
        this.mepPiso = mepPiso;
    }

    /**
     * Get mepPiso value.
     *
     * @return java.lang.String
     */
    public java.lang.String getMepPiso() {
        return this.mepPiso;
    }

    /**
     * Set mepPlazaAnt value.
     *
     * @param mepPlazaAnt java.lang.Integer
     */
    public void setMepPlazaAnt(java.lang.Integer mepPlazaAnt) {
        this.mepPlazaAnt = mepPlazaAnt;
    }

    /**
     * Get mepPlazaAnt value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getMepPlazaAnt() {
        return this.mepPlazaAnt;
    }

    /**
     * Set mepPlazaRespaldo value.
     *
     * @param mepPlazaRespaldo java.lang.Integer
     */
    public void setMepPlazaRespaldo(java.lang.Integer mepPlazaRespaldo) {
        this.mepPlazaRespaldo = mepPlazaRespaldo;
    }

    /**
     * Get mepPlazaRespaldo value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getMepPlazaRespaldo() {
        return this.mepPlazaRespaldo;
    }

    /**
     * Set mepPrimerApellido value.
     *
     * @param mepPrimerApellido java.lang.String
     */
    public void setMepPrimerApellido(java.lang.String mepPrimerApellido) {
        this.mepPrimerApellido = mepPrimerApellido;
    }

    /**
     * Get mepPrimerApellido value.
     *
     * @return java.lang.String
     */
    public java.lang.String getMepPrimerApellido() {
        return this.mepPrimerApellido;
    }

    /**
     * Set mepQnaCancela value.
     *
     * @param mepQnaCancela java.lang.Integer
     */
    public void setMepQnaCancela(java.lang.Integer mepQnaCancela) {
        this.mepQnaCancela = mepQnaCancela;
    }

    /**
     * Get mepQnaCancela value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getMepQnaCancela() {
        return this.mepQnaCancela;
    }

    /**
     * Set mepQnaCaptura value.
     *
     * @param mepQnaCaptura java.lang.Integer
     */
    public void setMepQnaCaptura(java.lang.Integer mepQnaCaptura) {
        this.mepQnaCaptura = mepQnaCaptura;
    }

    /**
     * Get mepQnaCaptura value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getMepQnaCaptura() {
        return this.mepQnaCaptura;
    }

    /**
     * Set mepReferenciaOficio value.
     *
     * @param mepReferenciaOficio java.lang.String
     */
    public void setMepReferenciaOficio(java.lang.String mepReferenciaOficio) {
        this.mepReferenciaOficio = mepReferenciaOficio;
    }

    /**
     * Get mepReferenciaOficio value.
     *
     * @return java.lang.String
     */
    public java.lang.String getMepReferenciaOficio() {
        return this.mepReferenciaOficio;
    }

    /**
     * Set mepRfc value.
     *
     * @param mepRfc java.lang.String
     */
    public void setMepRfc(java.lang.String mepRfc) {
        this.mepRfc = mepRfc;
    }

    /**
     * Get mepRfc value.
     *
     * @return java.lang.String
     */
    public java.lang.String getMepRfc() {
        return this.mepRfc;
    }

    /**
     * Set mepRfcUnico value.
     *
     * @param mepRfcUnico java.lang.String
     */
    public void setMepRfcUnico(java.lang.String mepRfcUnico) {
        this.mepRfcUnico = mepRfcUnico;
    }

    /**
     * Get mepRfcUnico value.
     *
     * @return java.lang.String
     */
    public java.lang.String getMepRfcUnico() {
        return this.mepRfcUnico;
    }

    /**
     * Set mepSegundoApellido value.
     *
     * @param mepSegundoApellido java.lang.String
     */
    public void setMepSegundoApellido(java.lang.String mepSegundoApellido) {
        this.mepSegundoApellido = mepSegundoApellido;
    }

    /**
     * Get mepSegundoApellido value.
     *
     * @return java.lang.String
     */
    public java.lang.String getMepSegundoApellido() {
        return this.mepSegundoApellido;
    }

    /**
     * Set mepSistemaReparto value.
     *
     * @param mepSistemaReparto java.lang.String
     */
    public void setMepSistemaReparto(java.lang.String mepSistemaReparto) {
        this.mepSistemaReparto = mepSistemaReparto;
    }

    /**
     * Get mepSistemaReparto value.
     *
     * @return java.lang.String
     */
    public java.lang.String getMepSistemaReparto() {
        return this.mepSistemaReparto;
    }

    /**
     * Set mepSpcAnioAnt value.
     *
     * @param mepSpcAnioAnt java.lang.String
     */
    public void setMepSpcAnioAnt(java.lang.String mepSpcAnioAnt) {
        this.mepSpcAnioAnt = mepSpcAnioAnt;
    }

    /**
     * Get mepSpcAnioAnt value.
     *
     * @return java.lang.String
     */
    public java.lang.String getMepSpcAnioAnt() {
        return this.mepSpcAnioAnt;
    }

    /**
     * Set mepTelOf1 value.
     *
     * @param mepTelOf1 java.lang.String
     */
    public void setMepTelOf1(java.lang.String mepTelOf1) {
        this.mepTelOf1 = mepTelOf1;
    }

    /**
     * Get mepTelOf1 value.
     *
     * @return java.lang.String
     */
    public java.lang.String getMepTelOf1() {
        return this.mepTelOf1;
    }

    /**
     * Set mepTelOf2 value.
     *
     * @param mepTelOf2 java.lang.String
     */
    public void setMepTelOf2(java.lang.String mepTelOf2) {
        this.mepTelOf2 = mepTelOf2;
    }

    /**
     * Get mepTelOf2 value.
     *
     * @return java.lang.String
     */
    public java.lang.String getMepTelOf2() {
        return this.mepTelOf2;
    }

    /**
     * Set mepTelParticular value.
     *
     * @param mepTelParticular java.lang.String
     */
    public void setMepTelParticular(java.lang.String mepTelParticular) {
        this.mepTelParticular = mepTelParticular;
    }

    /**
     * Get mepTelParticular value.
     *
     * @return java.lang.String
     */
    public java.lang.String getMepTelParticular() {
        return this.mepTelParticular;
    }

    /**
     * Set mepTerminoCargoSind value.
     *
     * @param mepTerminoCargoSind java.util.Date
     */
    public void setMepTerminoCargoSind(java.util.Date mepTerminoCargoSind) {
        this.mepTerminoCargoSind = mepTerminoCargoSind;
    }

    /**
     * Get mepTerminoCargoSind value.
     *
     * @return java.util.Date
     */
    public java.util.Date getMepTerminoCargoSind() {
        return this.mepTerminoCargoSind;
    }

    /**
     * Set mepUltimoMovto value.
     *
     * @param mepUltimoMovto java.util.Date
     */
    public void setMepUltimoMovto(java.util.Date mepUltimoMovto) {
        this.mepUltimoMovto = mepUltimoMovto;
    }

    /**
     * Get mepUltimoMovto value.
     *
     * @return java.util.Date
     */
    public java.util.Date getMepUltimoMovto() {
        return this.mepUltimoMovto;
    }

    /**
     * Set mepUsrCancela value.
     *
     * @param mepUsrCancela java.lang.String
     */
    public void setMepUsrCancela(java.lang.String mepUsrCancela) {
        this.mepUsrCancela = mepUsrCancela;
    }

    /**
     * Get mepUsrCancela value.
     *
     * @return java.lang.String
     */
    public java.lang.String getMepUsrCancela() {
        return this.mepUsrCancela;
    }

}
