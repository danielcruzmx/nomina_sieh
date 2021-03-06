package gob.shcp.sireh.domain.jdbc;

import gob.shcp.fsn.data.Domain;

import java.io.Serializable;

import java.math.BigDecimal;

import java.util.List;

public class ExpedienteEliminaDocumentos implements Domain, Serializable {
    private String documento;
    private Integer numDocumentos;
    private String nombreTabla;
    private Integer numero;
    private List<ExpedienteEliminaDocumentos> listaDocumentos;
    private BigDecimal secuencia;
    private String  referencia;
    private String  rfcEmpleado;
    private String  idDocto;
    
    private boolean procesar;

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getDocumento() {
        return documento;
    }

    public void setNumDocumentos(Integer numDocumentos) {
        this.numDocumentos = numDocumentos;
    }

    public Integer getNumDocumentos() {
        return numDocumentos;
    }

    public void setNombreTabla(String nombreTabla) {
        this.nombreTabla = nombreTabla;
    }

    public String getNombreTabla() {
        return nombreTabla;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setRfcEmpleado(String rfcEmpleado) {
        this.rfcEmpleado = rfcEmpleado;
    }

    public String getRfcEmpleado() {
        return rfcEmpleado;
    }

    public void setProcesar(boolean procesar) {
        this.procesar = procesar;
    }

    public boolean isProcesar() {
        return procesar;
    }

    public void setIdentity(Serializable id) {
    }

    public Serializable getIdentity() {
        return null;
    }

    public void setSecuencia(BigDecimal secuencia) {
        this.secuencia = secuencia;
    }

    public BigDecimal getSecuencia() {
        return secuencia;
    }

    public void setListaDocumentos(List<ExpedienteEliminaDocumentos> listaDocumentos) {
        this.listaDocumentos = listaDocumentos;
    }

    public List<ExpedienteEliminaDocumentos> getListaDocumentos() {
        return listaDocumentos;
    }

    public void setIdDocto(String idDocto) {
        this.idDocto = idDocto;
    }

    public String getIdDocto() {
        return idDocto;
    }
}
