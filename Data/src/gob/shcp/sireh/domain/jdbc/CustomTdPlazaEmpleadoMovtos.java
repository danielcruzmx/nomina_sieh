package gob.shcp.sireh.domain.jdbc;

import gob.shcp.fsn.data.Domain;

import java.io.Serializable;

import java.util.Date;

public class CustomTdPlazaEmpleadoMovtos implements Domain, Serializable {

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
    // Domicilio empleado
    private java.lang.String calleParticular;
    private java.lang.String coloniaParticular;
    private java.lang.String telParticular;
    private java.lang.String codpostParticular;
    private java.lang.Integer idEdoParticular;
    private java.lang.Integer idMuniParticular;

    // Datos de plaza
    private java.lang.String descPuesto;
    private java.lang.String idNivelPto;
    private java.lang.Integer idEdo;
    private java.lang.String descEstado;
    private java.lang.Integer idMunicipio;
    private java.lang.String descMunicipio;
    private java.lang.String idGrupoPago;
    private java.lang.String descGrupoPago;
    private java.lang.String idUnidadNom;
    private java.lang.String idPuestoNom;
    private java.lang.Integer idZonaEcoNom;
    private java.lang.Double plazaImpHono;
    private java.lang.String plazaReferencia;
    private java.lang.Integer idZonaDistNom;
    private java.util.Date plazaIniCont;
    private java.util.Date plazaFinCont;
    private java.util.Date plazaIniLic;
    private java.util.Date plazaFinLic;
    private java.lang.String idJerarquia;
    private java.lang.String idNombramiento;
    private java.lang.Integer idRangoNom;
    private java.lang.String idSitPlaza;

    private java.lang.String descSitPlaza;
    private java.lang.Integer idPlaza;
    private java.lang.String descJerarquia;
    private java.lang.String descNombramiento;

    public CustomTdPlazaEmpleadoMovtos() {
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

    public void setDescSitPlaza(String descSitPlaza) {
        this.descSitPlaza = descSitPlaza;
    }

    public String getDescSitPlaza() {
        return descSitPlaza;
    }

    public Integer get_idPlaza() {
        return idPlaza;
    }

    public void setDescJerarquia(String descJerarquia) {
        this.descJerarquia = descJerarquia;
    }

    public String getDescJerarquia() {
        return descJerarquia;
    }

    public void setDescNombramiento(String descNombramiento) {
        this.descNombramiento = descNombramiento;
    }

    public String getDescNombramiento() {
        return descNombramiento;
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

    public void setIdentity(Serializable idPlaza) {
        this.idPlaza = (java.lang.Integer)idPlaza;
    }

    public Serializable getIdentity() {
        return this.idPlaza;
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

    public void setPlazaReferencia(String plazaReferencia) {
        this.plazaReferencia = plazaReferencia;
    }

    public String getPlazaReferencia() {
        return plazaReferencia;
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

    public void setIdPlaza(Integer idPlaza) {
        this.idPlaza = idPlaza;
    }

    public Integer getIdPlaza() {
        return idPlaza;
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

    public void setIdSitPlaza(String idSitPlaza) {
        this.idSitPlaza = idSitPlaza;
    }

    public String getIdSitPlaza() {
        return idSitPlaza;
    }
}
