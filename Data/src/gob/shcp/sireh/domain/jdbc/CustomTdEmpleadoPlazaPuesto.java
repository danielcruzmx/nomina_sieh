package gob.shcp.sireh.domain.jdbc;

import gob.shcp.fsn.data.Domain;

import java.io.Serializable;

public class CustomTdEmpleadoPlazaPuesto implements Domain, Serializable {
    private java.lang.String rfcEmpleado;
    private java.lang.String nombreEmpleado;
    private java.lang.String primerApellido;
    private java.lang.String segundoApellido;
    private java.lang.String idPuestoNom;
    private java.lang.String idNivelPto;
    private java.lang.Integer idPlaza;
    private java.lang.Integer idZonaEcoNom;
    private java.lang.Integer idRangoNom;
    private java.lang.Double monto;
    private java.lang.String apErarioFederal;

    public CustomTdEmpleadoPlazaPuesto() {
    }

    public CustomTdEmpleadoPlazaPuesto(java.lang.String rfcEmpleado, 
                                       java.lang.String nombreEmpleado, 
                                       java.lang.String primerApellido, 
                                       java.lang.String segundoApellido, 
                                       java.lang.String idPuestoNom, 
                                       java.lang.String idNivelPto, 
                                       java.lang.Integer idPlaza, 
                                       java.lang.Integer idZonaEcoNom, 
                                       java.lang.Integer idRangoNom, 
                                       java.lang.Double monto, 
                                       java.lang.String apErarioFederal) {
        this.rfcEmpleado = rfcEmpleado;
        this.nombreEmpleado = nombreEmpleado;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
        this.idPuestoNom = idPuestoNom;
        this.idNivelPto = idNivelPto;
        this.idPlaza = idPlaza;
        this.idZonaEcoNom = idZonaEcoNom;
        this.idRangoNom = idRangoNom;
        this.monto = monto;
        this.apErarioFederal = apErarioFederal;
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

    public void setRfcEmpleado(String rfcEmpleado) {
        this.rfcEmpleado = rfcEmpleado;
    }

    public String getRfcEmpleado() {
        return rfcEmpleado;
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

    public void setIdPuestoNom(String idPuestoNom) {
        this.idPuestoNom = idPuestoNom;
    }

    public String getIdPuestoNom() {
        return idPuestoNom;
    }

    public void setIdNivelPto(String idNivelPto) {
        this.idNivelPto = idNivelPto;
    }

    public String getIdNivelPto() {
        return idNivelPto;
    }

    public void setIdPlaza(Integer idPlaza) {
        this.idPlaza = idPlaza;
    }

    public Integer getIdPlaza() {
        return idPlaza;
    }

    public void setIdZonaEcoNom(Integer idZonaEcoNom) {
        this.idZonaEcoNom = idZonaEcoNom;
    }

    public Integer getIdZonaEcoNom() {
        return idZonaEcoNom;
    }

    public void setIdRangoNom(Integer idRangoNom) {
        this.idRangoNom = idRangoNom;
    }

    public Integer getIdRangoNom() {
        return idRangoNom;
    }

    public void setMonto(Double monto) {
        this.monto = monto;
    }

    public Double getMonto() {
        return monto;
    }

    public void setApErarioFederal(String apErarioFederal) {
        this.apErarioFederal = apErarioFederal;
    }

    public String getApErarioFederal() {
        return apErarioFederal;
    }
}
