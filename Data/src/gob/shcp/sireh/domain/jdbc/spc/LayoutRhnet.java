package gob.shcp.sireh.domain.jdbc.spc;

import gob.shcp.fsn.data.Domain;

import java.io.Serializable;

public class LayoutRhnet extends TnCapCurso implements Domain, Serializable{

    private java.lang.String idRamo;
    private java.lang.String idUnidad;
    private java.lang.Integer cicloEjeTematico;
    private java.lang.Integer idTrimestre;
    private java.lang.String participanteIdRusp;
    private java.lang.String capDetectada;
    private java.lang.String descCursoPrincipal;
    private java.lang.Double cmePrpCostoUnit;
    private java.lang.String descModalidad; 
    private java.lang.String descTipoAccion; 
    private java.lang.String descCaracter; 
    private java.lang.String descFinalidad;
    private java.lang.String descCapac;
    private java.lang.String descCapacidadCert;
    private java.lang.String idTipoCapacidad; 
    private java.lang.String codigoUnicoCapacidadCert;
    private java.lang.Integer participanteCalificacionFin;
    private java.lang.String situacionParticipante;
    private java.lang.String veces;
    private java.lang.String campus;
    private java.lang.String fecIni;
    private java.lang.String fecFin;


    public LayoutRhnet() {
    }

    public void setIdentity(Serializable id) {
    }

    public Serializable getIdentity() {
        return null;
    }

    public void setIdRamo(String idRamo) {
        this.idRamo = idRamo;
    }

    public String getIdRamo() {
        return idRamo;
    }

    public void setIdUnidad(String idUnidad) {
        this.idUnidad = idUnidad;
    }

    public String getIdUnidad() {
        return idUnidad;
    }

    public void setIdTrimestre(Integer idTrimestre) {
        this.idTrimestre = idTrimestre;
    }

    public Integer getIdTrimestre() {
        return idTrimestre;
    }

    public void setParticipanteIdRusp(String participanteIdRusp) {
        this.participanteIdRusp = participanteIdRusp;
    }

    public String getParticipanteIdRusp() {
        return participanteIdRusp;
    }

    public void setCapDetectada(String capDetectada) {
        this.capDetectada = capDetectada;
    }

    public String getCapDetectada() {
        return capDetectada;
    }

    public void setDescCursoPrincipal(String descCursoPrincipal) {
        this.descCursoPrincipal = descCursoPrincipal;
    }

    public String getDescCursoPrincipal() {
        return descCursoPrincipal;
    }

    public void setCmePrpCostoUnit(Double cmePrpCostoUnit) {
        this.cmePrpCostoUnit = cmePrpCostoUnit;
    }

    public Double getCmePrpCostoUnit() {
        return cmePrpCostoUnit;
    }

    public void setDescModalidad(String descModalidad) {
        this.descModalidad = descModalidad;
    }

    public String getDescModalidad() {
        return descModalidad;
    }

    public void setDescCaracter(String descCaracter) {
        this.descCaracter = descCaracter;
    }

    public String getDescCaracter() {
        return descCaracter;
    }

    public void setDescFinalidad(String descFinalidad) {
        this.descFinalidad = descFinalidad;
    }

    public String getDescFinalidad() {
        return descFinalidad;
    }

    public void setDescCapac(String descCapac) {
        this.descCapac = descCapac;
    }

    public String getDescCapac() {
        return descCapac;
    }

    public void setParticipanteCalificacionFin(Integer participanteCalificacionFin) {
        this.participanteCalificacionFin = participanteCalificacionFin;
    }

    public Integer getParticipanteCalificacionFin() {
        return participanteCalificacionFin;
    }

    public void setSituacionParticipante(String situacionParticipante) {
        this.situacionParticipante = situacionParticipante;
    }

    public String getSituacionParticipante() {
        return situacionParticipante;
    }

    public void setVeces(String veces) {
        this.veces = veces;
    }

    public String getVeces() {
        return veces;
    }

    public void setCampus(String campus) {
        this.campus = campus;
    }

    public String getCampus() {
        return campus;
    }

    public void setFecIni(String fecIni) {
        this.fecIni = fecIni;
    }

    public String getFecIni() {
        return fecIni;
    }

    public void setFecFin(String fecFin) {
        this.fecFin = fecFin;
    }

    public String getFecFin() {
        return fecFin;
    }

    public Integer get_cicloEjeTematico() {
        return cicloEjeTematico;
    }

    public String get_idTipoCapacidad() {
        return idTipoCapacidad;
    }

    public void setDescCapacidadCert(String descCapacidadCert) {
        this.descCapacidadCert = descCapacidadCert;
    }

    public String getDescCapacidadCert() {
        return descCapacidadCert;
    }

    public void setCodigoUnicoCapacidadCert(String codigoUnicoCapacidadCert) {
        this.codigoUnicoCapacidadCert = codigoUnicoCapacidadCert;
    }

    public String getCodigoUnicoCapacidadCert() {
        return codigoUnicoCapacidadCert;
    }

    public void setDescTipoAccion(String descTipoAccion) {
        this.descTipoAccion = descTipoAccion;
    }

    public String getDescTipoAccion() {
        return descTipoAccion;
    }
}
