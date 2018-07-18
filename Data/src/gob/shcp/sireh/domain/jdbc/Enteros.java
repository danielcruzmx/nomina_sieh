package gob.shcp.sireh.domain.jdbc;

import gob.shcp.fsn.data.Domain;

import java.io.Serializable;

public class Enteros implements Domain, Serializable {
    private String hpRfc;
    private String primerApellido;
    private String segundoApellido;
    private String nombre;
    private String idUnidadNom;
    private String idNivelPto;
    private String curpEmpleado;
    private String imssIssste;
    private String idPlaza;
    private String hpFolio;
    private String hpQnaPago;
    private String idNombramiento;
    private String idGrupopagoNom;
    private String sistemaReparto;
    private String inicioPago;
    private String finalPago;
    private double deducciones;
    private double percepciones;

    public void setHpRfc(String hpRfc) {
        this.hpRfc = hpRfc;
    }

    public String getHpRfc() {
        return hpRfc;
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

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setIdUnidadNom(String idUnidadNom) {
        this.idUnidadNom = idUnidadNom;
    }

    public String getIdUnidadNom() {
        return idUnidadNom;
    }

    public void setIdNivelPto(String idNivelPto) {
        this.idNivelPto = idNivelPto;
    }

    public String getIdNivelPto() {
        return idNivelPto;
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

    public void setIdPlaza(String idPlaza) {
        this.idPlaza = idPlaza;
    }

    public String getIdPlaza() {
        return idPlaza;
    }

    public void setHpFolio(String hpFolio) {
        this.hpFolio = hpFolio;
    }

    public String getHpFolio() {
        return hpFolio;
    }

    public void setHpQnaPago(String hpQnaPago) {
        this.hpQnaPago = hpQnaPago;
    }

    public String getHpQnaPago() {
        return hpQnaPago;
    }

    public void setIdNombramiento(String idNombramiento) {
        this.idNombramiento = idNombramiento;
    }

    public String getIdNombramiento() {
        return idNombramiento;
    }

    public void setIdGrupopagoNom(String idGrupopagoNom) {
        this.idGrupopagoNom = idGrupopagoNom;
    }

    public String getIdGrupopagoNom() {
        return idGrupopagoNom;
    }

    public void setSistemaReparto(String sistemaReparto) {
        this.sistemaReparto = sistemaReparto;
    }

    public String getSistemaReparto() {
        return sistemaReparto;
    }

    public void setInicioPago(String inicioPago) {
        this.inicioPago = inicioPago;
    }

    public String getInicioPago() {
        return inicioPago;
    }

    public void setFinalPago(String finalPago) {
        this.finalPago = finalPago;
    }

    public String getFinalPago() {
        return finalPago;
    }

    public void setDeducciones(double deducciones) {
        this.deducciones = deducciones;
    }

    public double getDeducciones() {
        return deducciones;
    }

    public void setPercepciones(double percepciones) {
        this.percepciones = percepciones;
    }

    public double getPercepciones() {
        return percepciones;
    }

    public void setIdentity(Serializable id) {
    }

    public Serializable getIdentity() {
        return null;
    }
}
