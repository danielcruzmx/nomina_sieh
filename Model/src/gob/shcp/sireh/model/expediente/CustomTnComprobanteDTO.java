package gob.shcp.sireh.model.expediente;

import gob.shcp.fsn.model.Model;
import gob.shcp.sireh.model.nomina.terceros.timbradosat.TnComprobanteDTO;

import java.util.Date;

public class CustomTnComprobanteDTO extends TnComprobanteDTO implements java.io.Serializable, Model {

    private String rfcPatron;
    private String razonSocial;
    private String nombreEmpleado;
    private String primerApellido;
    private String segundoApellido;
    private String descEdoComp;
    private Date hpIniPago;
    
    // De TN_HISTORICO_PAGO - 27/05/2016 - MCS
    private Long        hpFolio;
    private Long        hpDifFolio;
    private String      descTipoNomina;
    private Long        hpCicloUnidad;
    private Integer     hpEjerFiscal;
    private Integer     idPlaza;
    private String      idUnidadNom;
    private String      idPuestoNom;
    private String      descGrupoPago;
    private String      neto;
    
    public void setRfcPatron(String rfcPatron) {
        this.rfcPatron = rfcPatron;
    }

    public String getRfcPatron() {
        return rfcPatron;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public String getRazonSocial() {
        return razonSocial;
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
    
    public void setDescEdoComp(String descEdoComp) {
        this.descEdoComp = descEdoComp;
    }

    public String getDescEdoComp() {
        return descEdoComp;
    }

    public Date getHpIniPago() {
        return hpIniPago;
    }

    public void setHpIniPago(Date hpIniPago) {
        this.hpIniPago = hpIniPago;
    }

    public void setHpFolio(Long hpFolio) {
        this.hpFolio = hpFolio;
    }

    public Long getHpFolio() {
        return hpFolio;
    }

    public void setDescTipoNomina(String descTipoNomina) {
        this.descTipoNomina = descTipoNomina;
    }

    public String getDescTipoNomina() {
        return descTipoNomina;
    }

    public void setHpEjerFiscal(Integer hpEjerFiscal) {
        this.hpEjerFiscal = hpEjerFiscal;
    }

    public Integer getHpEjerFiscal() {
        return hpEjerFiscal;
    }

    public void setIdPlaza(Integer idPlaza) {
        this.idPlaza = idPlaza;
    }

    public Integer getIdPlaza() {
        return idPlaza;
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

    public void setDescGrupoPago(String descGrupoPago) {
        this.descGrupoPago = descGrupoPago;
    }

    public String getDescGrupoPago() {
        return descGrupoPago;
    }

    public void setNeto(String neto) {
        this.neto = neto;
    }

    public String getNeto() {
        return neto;
    }

    public void setHpDifFolio(Long hpDifFolio) {
        this.hpDifFolio = hpDifFolio;
    }

    public Long getHpDifFolio() {
        return hpDifFolio;
    }

    public void setHpCicloUnidad(Long hpCicloUnidad) {
        this.hpCicloUnidad = hpCicloUnidad;
    }

    public Long getHpCicloUnidad() {
        return hpCicloUnidad;
    }
}
