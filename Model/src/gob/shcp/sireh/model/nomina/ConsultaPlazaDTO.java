package gob.shcp.sireh.model.nomina;

import gob.shcp.fsn.model.Model;

import java.util.List;

import org.springmodules.validation.bean.conf.loader.annotation.handler.ValidationMethod;

public class ConsultaPlazaDTO implements java.io.Serializable, Model{

    private java.lang.String descSitPlaza;
    private java.lang.Integer idPlaza;
    private java.lang.String idPuestoNom;
    private java.lang.String descPuesto;
    private java.lang.String idNivelPto;
    private java.lang.String descGrupoPago;
    private java.lang.String descJerarquia;
    private java.lang.String descNombramiento;
    private java.lang.String rfcEmpleado;
    private java.lang.String nombreEmpleado;
    private java.lang.String primerApellido;
    private java.lang.String segundoApellido;


    private java.lang.Integer idMovsPersonal;
    private java.lang.String descMovsPersonal;
    private String mpTipoMovMenu;
    private java.lang.String idSitPlaNva;
    private java.lang.String idSitPlaAnt;

    // Filtros
    private List<java.lang.String> idSitPlaza;
    private List<java.lang.String> idGrupoPago;
    private List<java.lang.String> idJerarquia;
    private List<java.lang.String> idNombramiento;
    
    private String header;

    
    public ConsultaPlazaDTO() {
        this.setIdMovsPersonal(Integer.valueOf(-1));
    }


    public void setDescSitPlaza(String descSitPlaza) {
        this.descSitPlaza = descSitPlaza;
    }

    public String getDescSitPlaza() {
        return descSitPlaza;
    }

    public void setIdPlaza(Integer idPlaza) {
        this.idPlaza = idPlaza;
    }

    public Integer getIdPlaza() {
        return idPlaza;
    }

    public void setIdPuestoNom(String idPuestoNom) {
        this.idPuestoNom = idPuestoNom;
    }

    public String getIdPuestoNom() {
        return idPuestoNom;
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

    public void setDescGrupoPago(String descGrupoPago) {
        this.descGrupoPago = descGrupoPago;
    }

    public String getDescGrupoPago() {
        return descGrupoPago;
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

    public void setIdSitPlaza(List<String> idSitPlaza) {
        this.idSitPlaza = idSitPlaza;
    }

    public List<String> getIdSitPlaza() {
        return idSitPlaza;
    }

    public void setIdGrupoPago(List<String> idGrupoPago) {
        this.idGrupoPago = idGrupoPago;
    }

    public List<String> getIdGrupoPago() {
        return idGrupoPago;
    }

    public void setIdJerarquia(List<String> idJerarquia) {
        this.idJerarquia = idJerarquia;
    }

    public List<String> getIdJerarquia() {
        return idJerarquia;
    }

    public void setIdNombramiento(List<String> idNombramiento) {
        this.idNombramiento = idNombramiento;
    }

    public List<String> getIdNombramiento() {
        return idNombramiento;
    }

    public void setMpTipoMovMenu(String mpTipoMovMenu) {
        this.mpTipoMovMenu = mpTipoMovMenu;
    }

    public String getMpTipoMovMenu() {
        return mpTipoMovMenu;
    }
    
    public void setIdSitPlaNva(String idSitPlaNva) {
        this.idSitPlaNva = idSitPlaNva;
    }

    public String getIdSitPlaNva() {
        return idSitPlaNva;
    }

    public void setIdSitPlaAnt(String idSitPlaAnt) {
        this.idSitPlaAnt = idSitPlaAnt;
    }

    public String getIdSitPlaAnt() {
        return idSitPlaAnt;
    }
    
    @ValidationMethod(forProperty="idMovsPersonal", errorCode="error.select.unspecified")
    public boolean validateIdMovsPersonal(){
        return this.getIdMovsPersonal() != 0;
    }


    public void setHeader(String header) {
        this.header = header;
    }

    public String getHeader() {
        return header;
    }
}
