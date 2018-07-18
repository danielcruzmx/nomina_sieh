package gob.shcp.sireh.domain.jdbc;

import gob.shcp.fsn.data.Domain;

import java.io.Serializable;

import java.util.Date;

public class CustomTdNmResumen extends TdNmResumen implements Domain, 
                                                              Serializable {
    private Integer consecutivo;
    private String tdNmhCveUnidad;
    private String nombreEmpleado;
    private String tdNmhTipoPlaza;
    private Integer idPlaza;
    private String desGenero;
    private Integer anosAcumulados;
    private String fuente;
    private String conceptoPago;
    private String dice;
    private String debeDecir;
    private Integer idUnidad;
    private String nmrRfc;
    private Integer nmrDiasPagados;
    private String nmrRemesaInterna;
    private String nmhTipoPlaza;
    private String nombre;
    private String genero;
    private String idGenero;
    private String descRechazo;
    private String idPuesto;
    private String idNivelPto;
    private String descMhCausal;
    private String tdNmhOp;
    private Integer tdNmhCiclo;
    private String idNombramiento;
    private Integer hpQnaPagoValidar;
    private Date fecModifico;
    private String fechaModifico;

    public Integer getConsecutivo() {
        return consecutivo;
    }

    public void setConsecutivo(Integer consecutivo) {
        this.consecutivo = consecutivo;
    }

    public String getTdNmhCveUnidad() {
        return tdNmhCveUnidad;
    }

    public void setTdNmhCveUnidad(String tdNmhCveUnidad) {
        this.tdNmhCveUnidad = tdNmhCveUnidad;
    }

    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }

    public String getTdNmhTipoPlaza() {
        return tdNmhTipoPlaza;
    }

    public void setTdNmhTipoPlaza(String tdNmhTipoPlaza) {
        this.tdNmhTipoPlaza = tdNmhTipoPlaza;
    }

    public String getDesGenero() {
        return desGenero;
    }

    public void setDesGenero(String desGenero) {
        this.desGenero = desGenero;
    }

    public Integer getAnosAcumulados() {
        return anosAcumulados;
    }

    public void setAnosAcumulados(Integer anosAcumulados) {
        this.anosAcumulados = anosAcumulados;
    }

    public String getFuente() {
        return fuente;
    }

    public void setFuente(String fuente) {
        this.fuente = fuente;
    }

    public String getConceptoPago() {
        return conceptoPago;
    }

    public void setConceptoPago(String conceptoPago) {
        this.conceptoPago = conceptoPago;
    }

    public String getDice() {
        return dice;
    }

    public void setDice(String dice) {
        this.dice = dice;
    }

    public String getDebeDecir() {
        return debeDecir;
    }

    public void setDebeDecir(String debeDecir) {
        this.debeDecir = debeDecir;
    }

    public Integer getIdUnidad() {
        return idUnidad;
    }

    public void setIdUnidad(Integer idUnidad) {
        this.idUnidad = idUnidad;
    }

    public String getNmhTipoPlaza() {
        return nmhTipoPlaza;
    }

    public void setNmhTipoPlaza(String nmhTipoPlaza) {
        this.nmhTipoPlaza = nmhTipoPlaza;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setDescRechazo(String descRechazo) {
        this.descRechazo = descRechazo;
    }

    public String getDescRechazo() {
        return descRechazo;
    }

    public void set_nmrRfc(String _nmrRfc) {
        this.nmrRfc = _nmrRfc;
    }

    public String get_nmrRfc() {
        return nmrRfc;
    }

    public Integer get_nmrDiasPagados() {
        return nmrDiasPagados;
    }

    public String get_nmrRemesaInterna() {
        return nmrRemesaInterna;
    }

    public void setIdPuesto(String idPuesto) {
        this.idPuesto = idPuesto;
    }

    public String getIdPuesto() {
        return idPuesto;
    }

    public void setIdNivelPto(String idNivelPto) {
        this.idNivelPto = idNivelPto;
    }

    public String getIdNivelPto() {
        return idNivelPto;
    }

    public void setDescMhCausal(String descMhCausal) {
        this.descMhCausal = descMhCausal;
    }

    public String getDescMhCausal() {
        return descMhCausal;
    }

    public void setTdNmhOp(String tdNmhOp) {
        this.tdNmhOp = tdNmhOp;
    }

    public String getTdNmhOp() {
        return tdNmhOp;
    }

    public void setIdGenero(String idGenero) {
        this.idGenero = idGenero;
    }

    public String getIdGenero() {
        return idGenero;
    }

    public void setTdNmhCiclo(Integer tdNmhCiclo) {
        this.tdNmhCiclo = tdNmhCiclo;
    }

    public Integer getTdNmhCiclo() {
        return tdNmhCiclo;
    }

    public void setIdPlaza(Integer idPlaza) {
        this.idPlaza = idPlaza;
    }

    public Integer getIdPlaza() {
        return idPlaza;
    }

    public void setHpQnaPagoValidar(Integer hpQnaPagoValidar) {
        this.hpQnaPagoValidar = hpQnaPagoValidar;
    }

    public Integer getHpQnaPagoValidar() {
        return hpQnaPagoValidar;
    }

    public Date get_fecModifico() {
        return fecModifico;
    }

    public void setIdNombramiento(String idNombramiento) {
        this.idNombramiento = idNombramiento;
    }

    public String getIdNombramiento() {
        return idNombramiento;
    }

    public void setFechaModifico(String fechaModifico) {
        this.fechaModifico = fechaModifico;
    }

    public String getFechaModifico() {
        return fechaModifico;
    }
}
