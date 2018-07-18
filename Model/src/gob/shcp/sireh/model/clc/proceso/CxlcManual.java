package gob.shcp.sireh.model.clc.proceso;

import java.util.Date;

public class CxlcManual implements java.io.Serializable {

    private Integer cxlcCiclo;
    private Integer cxlcNumero;
    private Integer cxlcSecuencia;
    private String cxlcUnidadResponsable;
    private String cxlcUnidadEjecutora;
    private String cxlcEstado;
    private String cxlcFuncion;
    private String cxlcPrograma;
    private String cxlcActInst;
    private String cxlcActInstPri;
    private String cxlcActInstEsp;
    private String cxlcPartida;
    private String cxlcTipoGasto;
    private String cxlcFuente;
    
    private String cxlcSecuenciaSiaff;
    private double cxlcMonto;
    private String cxlcNota;
    private double cxlcIva;
    private String cxlcUsuario;
    private Date cxlcFechaModificacion;

    public Integer getCxlcCiclo() {
        return cxlcCiclo;
    }

    public void setCxlcCiclo(Integer cxlcCiclo) {
        this.cxlcCiclo = cxlcCiclo;
    }

    public Integer getCxlcNumero() {
        return cxlcNumero;
    }

    public void setCxlcNumero(Integer cxlcNumero) {
        this.cxlcNumero = cxlcNumero;
    }

    public Integer getCxlcSecuencia() {
        return cxlcSecuencia;
    }

    public void setCxlcSecuencia(Integer cxlcSecuencia) {
        this.cxlcSecuencia = cxlcSecuencia;
    }

    public String getCxlcUnidadResponsable() {
        return cxlcUnidadResponsable;
    }

    public void setCxlcUnidadResponsable(String cxlcUnidadResponsable) {
        this.cxlcUnidadResponsable = cxlcUnidadResponsable;
    }

    public String getCxlcUnidadEjecutora() {
        return cxlcUnidadEjecutora;
    }

    public void setCxlcUnidadEjecutora(String cxlcUnidadEjecutora) {
        this.cxlcUnidadEjecutora = cxlcUnidadEjecutora;
    }

    public String getCxlcEstado() {
        return cxlcEstado;
    }

    public void setCxlcEstado(String cxlcEstado) {
        this.cxlcEstado = cxlcEstado;
    }

    public String getCxlcFuncion() {
        return cxlcFuncion;
    }

    public void setCxlcFuncion(String cxlcFuncion) {
        this.cxlcFuncion = cxlcFuncion;
    }

    public String getCxlcPrograma() {
        return cxlcPrograma;
    }

    public void setCxlcPrograma(String cxlcPrograma) {
        this.cxlcPrograma = cxlcPrograma;
    }

    public String getCxlcActInst() {
        return cxlcActInst;
    }

    public void setCxlcActInst(String cxlcActInst) {
        this.cxlcActInst = cxlcActInst;
    }

    public String getCxlcActInstPri() {
        return cxlcActInstPri;
    }

    public void setCxlcActInstPri(String cxlcActInstPri) {
        this.cxlcActInstPri = cxlcActInstPri;
    }

    public String getCxlcActInstEsp() {
        return cxlcActInstEsp;
    }

    public void setCxlcActInstEsp(String cxlcActInstEsp) {
        this.cxlcActInstEsp = cxlcActInstEsp;
    }

    public String getCxlcPartida() {
        return cxlcPartida;
    }

    public void setCxlcPartida(String cxlcPartida) {
        this.cxlcPartida = cxlcPartida;
    }

    public String getCxlcTipoGasto() {
        return cxlcTipoGasto;
    }

    public void setCxlcTipoGasto(String cxlcTipoGasto) {
        this.cxlcTipoGasto = cxlcTipoGasto;
    }

    public String getCxlcFuente() {
        return cxlcFuente;
    }

    public void setCxlcFuente(String cxlcFuente) {
        this.cxlcFuente = cxlcFuente;
    }
    
    public void setCxlcSecuenciaSiaff(String cxlcSecuenciaSiaff) {
        this.cxlcSecuenciaSiaff = cxlcSecuenciaSiaff;
    }

    public String getCxlcSecuenciaSiaff() {
        return cxlcSecuenciaSiaff;
    }

    public void setCxlcMonto(double cxlcMonto) {
        this.cxlcMonto = cxlcMonto;
    }

    public double getCxlcMonto() {
        return cxlcMonto;
    }

    public void setCxlcNota(String cxlcNota) {
        this.cxlcNota = cxlcNota;
    }

    public String getCxlcNota() {
        return cxlcNota;
    }

    public void setCxlcIva(double cxlcIva) {
        this.cxlcIva = cxlcIva;
    }

    public double getCxlcIva() {
        return cxlcIva;
    }

    public void setCxlcUsuario(String cxlcUsuario) {
        this.cxlcUsuario = cxlcUsuario;
    }

    public String getCxlcUsuario() {
        return cxlcUsuario;
    }

    public void setCxlcFechaModificacion(Date cxlcFechaModificacion) {
        this.cxlcFechaModificacion = cxlcFechaModificacion;
    }

    public Date getCxlcFechaModificacion() {
        return cxlcFechaModificacion;
    }
}
