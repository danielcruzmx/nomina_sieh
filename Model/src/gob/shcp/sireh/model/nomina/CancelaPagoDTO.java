package gob.shcp.sireh.model.nomina;

import gob.shcp.fsn.model.Model;

import gob.shcp.sireh.model.TnHistoricoPagoDTO;




/**
 * Model object for transporting CancelaPagoDTO data.
 */
public class CancelaPagoDTO extends TnHistoricoPagoDTO implements java.io.Serializable, Model {
    private java.lang.String descTipoNomina;
    private java.lang.Integer hpQnaPago;
    private java.lang.String descSitPago;
    private java.lang.String primerApellido;
    private java.lang.String segundoApellido;
    private java.lang.String nombreEmpleado;
    private java.lang.Integer idMotivoCancela;
    private java.lang.String descMotivoCancela;
    private java.lang.Integer cpcQnaAplica;
    private java.lang.String cpcReferencia;
    private java.lang.String usuario;
    private java.lang.String fecModifico;
    private java.lang.String seleccionado;
    private boolean cancelaPago;
   

    public CancelaPagoDTO() {    }
    
    public CancelaPagoDTO(  java.lang.String descTipoNomina,
                            java.lang.Integer hpQnaPago,
                            java.lang.String descSitPago,
                            java.lang.String primerApellido,
                            java.lang.String segundoApellido,
                            java.lang.String nombreEmpleado,
                            java.lang.Integer idMotivoCancela,
                            java.lang.String descMotivoCancela,
                            java.lang.Integer cpcQnaAplica,
                            java.lang.String cpcReferencia,
                            java.lang.String usuario,
                            java.lang.String fecModifico,
                            boolean cancelaPago) {
                    
        this.descTipoNomina = descTipoNomina;
        this.hpQnaPago = hpQnaPago;
        this.descSitPago = descSitPago;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
        this.nombreEmpleado = nombreEmpleado;
        this.idMotivoCancela = idMotivoCancela;
        this.descMotivoCancela = descMotivoCancela;
        this.cpcQnaAplica = cpcQnaAplica;
        this.cpcReferencia = cpcReferencia;
        this.usuario = usuario;
        this.fecModifico = fecModifico; 
        this.cancelaPago = cancelaPago;}


    public void setDescTipoNomina(String descTipoNomina) {
        this.descTipoNomina = descTipoNomina;
    }

    public String getDescTipoNomina() {
        return descTipoNomina;
    }

    public Integer get_hpQnaPago() {
        return hpQnaPago;
    }

    public void setDescSitPago(String descSitPago) {
        this.descSitPago = descSitPago;
    }

    public String getDescSitPago() {
        return descSitPago;
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

    public void setIdMotivoCancela(Integer idMotivoCancela) {
        this.idMotivoCancela = idMotivoCancela;
    }

    public Integer getIdMotivoCancela() {
        return idMotivoCancela;
    }

    public void setDescMotivoCancela(String descMotivoCancela) {
        this.descMotivoCancela = descMotivoCancela;
    }

    public String getDescMotivoCancela() {
        return descMotivoCancela;
    }

    public void setCpcQnaAplica(Integer cpcQnaAplica) {
        this.cpcQnaAplica = cpcQnaAplica;
    }

    public Integer getCpcQnaAplica() {
        return cpcQnaAplica;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setFecModifico(String fecModifico) {
        this.fecModifico = fecModifico;
    }

    public String getFecModifico() {
        return fecModifico;
    }

    public void setCpcReferencia(String cpcReferencia) {
        this.cpcReferencia = cpcReferencia;
    }

    public String getCpcReferencia() {
        return cpcReferencia;
    }

    public void setSeleccionado(String seleccionado) {
        this.seleccionado = seleccionado;
    }

    public String getSeleccionado() {
        return seleccionado;
    }

    public void setCancelaPago(boolean cancelaPago) {
        this.cancelaPago = cancelaPago;
    }

    public boolean isCancelaPago() {
        return cancelaPago;
    }
}
