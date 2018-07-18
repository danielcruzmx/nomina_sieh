package gob.shcp.sireh.domain.jdbc;

import gob.shcp.fsn.data.Domain;

import java.io.Serializable;

public class CustomTdEmpleadoPension implements Domain, Serializable {

    // Empleado
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

    // Pension
    private java.lang.Integer idPension;
    private int numPension;
    private java.lang.String beneficiariaPension;
    private java.lang.String clabePension;
    private java.lang.String cptosPorcentaje;
    private java.lang.Integer idZonaDist;
    private java.lang.Double montoAdeudo;
    private java.lang.Double montoPension;
    private java.lang.Float porcentajePension;
    private java.lang.Integer qnaAplicaAdeudo;
    private java.lang.Integer qnaCapturaAdeudo;
    private java.lang.Integer qnaCapturaPension;
    private java.lang.Integer qnaDescAdeudo;
    private java.lang.String referenciaPension;
    private java.lang.String refAdeudoPension;
    private java.lang.String rfcPension;
    private java.lang.String statusPension;
    private java.lang.Integer ultQnaProcesaAdeudo;

    public CustomTdEmpleadoPension() {
    }

    public CustomTdEmpleadoPension(java.lang.String rfcEmpleado, 
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
                                   java.lang.String usuario, 
                                   java.lang.Integer idPension, int numPension, 
                                   java.lang.String beneficiariaPension, 
                                   java.lang.String clabePension, 
                                   java.lang.String cptosPorcentaje, 
                                   java.lang.Integer idZonaDist, 
                                   java.lang.Double montoAdeudo, 
                                   java.lang.Double montoPension, 
                                   java.lang.Float porcentajePension, 
                                   java.lang.Integer qnaAplicaAdeudo, 
                                   java.lang.Integer qnaCapturaAdeudo, 
                                   java.lang.Integer qnaCapturaPension, 
                                   java.lang.Integer qnaDescAdeudo, 
                                   java.lang.String referenciaPension, 
                                   java.lang.String refAdeudoPension, 
                                   java.lang.String rfcPension, 
                                   java.lang.String statusPension, 
                                   java.lang.Integer ultQnaProcesaAdeudo) {
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
        this.idPension = idPension;
        this.numPension = numPension;
        this.beneficiariaPension = beneficiariaPension;
        this.clabePension = clabePension;
        this.cptosPorcentaje = cptosPorcentaje;
        this.idZonaDist = idZonaDist;
        this.montoAdeudo = montoAdeudo;
        this.montoPension = montoPension;
        this.porcentajePension = porcentajePension;
        this.qnaAplicaAdeudo = qnaAplicaAdeudo;
        this.qnaCapturaAdeudo = qnaCapturaAdeudo;
        this.qnaCapturaPension = qnaCapturaPension;
        this.qnaDescAdeudo = qnaDescAdeudo;
        this.referenciaPension = referenciaPension;
        this.refAdeudoPension = refAdeudoPension;
        this.rfcPension = rfcPension;
        this.statusPension = statusPension;
        this.ultQnaProcesaAdeudo = ultQnaProcesaAdeudo;

    }

    public void setIdentity(Serializable rfcEmpleado) {
        this.rfcEmpleado = (java.lang.String)rfcEmpleado;
    }

    public Serializable getIdentity() {
        return this.rfcEmpleado;
    }
}
