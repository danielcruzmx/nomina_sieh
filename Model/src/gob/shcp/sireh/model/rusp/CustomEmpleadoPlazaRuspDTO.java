package gob.shcp.sireh.model.rusp;

import gob.shcp.fsn.model.Model;

import gob.shcp.sireh.model.plaza.TdPlazaDTO;

import java.util.Date;

public class CustomEmpleadoPlazaRuspDTO extends TdPlazaDTO implements java.io.Serializable, Model {
    
    private String desGrupoPago;
    private String nombreEmpleado;
    private String primerApellido;
    private String segundoApellido;
    private String codigoPuesto;
    private String nombrePuesto;
    private String descUnidad;
    private String descPuesto;
    private String descJerarquia;
    private String descNombramiento;
    private String descMotivoObligado;
    
    private String emailOficial;
    private String emailPersonal;
    private Date fecGobiernoFederal;
    private Date fecShcp;
    private Date fecIngSpc;
    private Date fecIniDeclPatr;
    
    private String idNombramiento;
    private String idJerarquia;
    private String discapacidad;
    
    public void setDesGrupoPago(String desGrupoPago) {
        this.desGrupoPago = desGrupoPago;
    }

    public String getDesGrupoPago() {
        return desGrupoPago;
    }

    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }

    public String getNombreEmpleado() {
        return nombreEmpleado;
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

    public void setCodigoPuesto(String codigoPuesto) {
        this.codigoPuesto = codigoPuesto;
    }

    public String getCodigoPuesto() {
        return codigoPuesto;
    }

    public void setNombrePuesto(String nombrePuesto) {
        this.nombrePuesto = nombrePuesto;
    }

    public String getNombrePuesto() {
        return nombrePuesto;
    }

    public void setDescUnidad(String descUnidad) {
        this.descUnidad = descUnidad;
    }

    public String getDescUnidad() {
        return descUnidad;
    }

    public void setDescPuesto(String descPuesto) {
        this.descPuesto = descPuesto;
    }

    public String getDescPuesto() {
        return descPuesto;
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

    public void setDescMotivoObligado(String descMotivoObligado) {
        this.descMotivoObligado = descMotivoObligado;
    }

    public String getDescMotivoObligado() {
        return descMotivoObligado;
    }

    public void setEmailOficial(String emailOficial) {
        this.emailOficial = emailOficial;
    }

    public String getEmailOficial() {
        return emailOficial;
    }

    public void setEmailPersonal(String emailPersonal) {
        this.emailPersonal = emailPersonal;
    }

    public String getEmailPersonal() {
        return emailPersonal;
    }

    public void setFecGobiernoFederal(Date fecGobiernoFederal) {
        this.fecGobiernoFederal = fecGobiernoFederal;
    }

    public Date getFecGobiernoFederal() {
        return fecGobiernoFederal;
    }

    public void setFecShcp(Date fecShcp) {
        this.fecShcp = fecShcp;
    }

    public Date getFecShcp() {
        return fecShcp;
    }

    public void setFecIngSpc(Date fecIngSpc) {
        this.fecIngSpc = fecIngSpc;
    }

    public Date getFecIngSpc() {
        return fecIngSpc;
    }

    public void setFecIniDeclPatr(Date fecIniDeclPatr) {
        this.fecIniDeclPatr = fecIniDeclPatr;
    }

    public Date getFecIniDeclPatr() {
        return fecIniDeclPatr;
    }

    public void setIdNombramiento(String idNombramiento) {
        this.idNombramiento = idNombramiento;
    }

    public String getIdNombramiento() {
        return idNombramiento;
    }

    public void setIdJerarquia(String idJerarquia) {
        this.idJerarquia = idJerarquia;
    }

    public String getIdJerarquia() {
        return idJerarquia;
    }
    
    public void setDiscapacidad(String discapacidad) {
        this.discapacidad = discapacidad;
    }

    public String getDiscapacidad() {
        return discapacidad;
    }
}
