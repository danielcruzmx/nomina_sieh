package gob.shcp.sireh.domain.jdbc.oficinaVirtual.tramites;

import gob.shcp.fsn.data.Domain;
import gob.shcp.sireh.domain.jdbc.Item;

import java.io.Serializable;

import java.util.Date;
import java.util.List;


public class PeriodoVacacional implements Domain, Serializable {
    private String      idEstatus;
    private String      descEstatus;
    private String      idUnidad;
    private String      descUnidad;
    private Integer     ciclo;
    private String      idPuesto;
    private String      descPuesto;
    private String      idArea;
    private String      descArea;
    private String      nombre;
    private String      primerApellido;
    private String      segundoApellido;
    private String      rfcEmpleado;
    private Date        fechaInicial;
    private Date        fechaFinal;
    private Date        fechaCaptura;
    private Date        ingresoDependencia;
    private String      idTipo;
    private String      descTipo;
    private Integer     idPeriodo;
    private String      descPeriodo;
    private Integer     idMotivo;
    private String      descMotivo;
    private String      nip;
    private List<Item> listStatus;
    
    private Integer     diasSolicitados;
    private Integer     diasRestantes;
    
    private String      urlOrigen;
    private String      urlDestino;
    
    private String[]    docGrupo;
    private String      movimiento;
    
    private String      beanName;
    
    private boolean     muestraRegistros;
    private boolean     cancel;

    public void setIdEstatus(String idEstatus) {
        this.idEstatus = idEstatus;
    }

    public String getIdEstatus() {
        return idEstatus;
    }

    public void setDescEstatus(String descEstatus) {
        this.descEstatus = descEstatus;
    }

    public String getDescEstatus() {
        return descEstatus;
    }

    public void setIdUnidad(String idUnidad) {
        this.idUnidad = idUnidad;
    }

    public String getIdUnidad() {
        return idUnidad;
    }

    public void setDescUnidad(String descUnidad) {
        this.descUnidad = descUnidad;
    }

    public String getDescUnidad() {
        return descUnidad;
    }

    public void setCiclo(Integer ciclo) {
        this.ciclo = ciclo;
    }

    public Integer getCiclo() {
        return ciclo;
    }

    public void setIdPuesto(String idPuesto) {
        this.idPuesto = idPuesto;
    }

    public String getIdPuesto() {
        return idPuesto;
    }

    public void setDescPuesto(String descPuesto) {
        this.descPuesto = descPuesto;
    }

    public String getDescPuesto() {
        return descPuesto;
    }

    public void setIdArea(String idArea) {
        this.idArea = idArea;
    }

    public String getIdArea() {
        return idArea;
    }

    public void setDescArea(String descArea) {
        this.descArea = descArea;
    }

    public String getDescArea() {
        return descArea;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
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

    public void setRfcEmpleado(String rfcEmpleado) {
        this.rfcEmpleado = rfcEmpleado;
    }

    public String getRfcEmpleado() {
        return rfcEmpleado;
    }

    public void setFechaInicial(Date fechaInicial) {
        this.fechaInicial = fechaInicial;
    }

    public Date getFechaInicial() {
        return fechaInicial;
    }

    public void setFechaFinal(Date fechaFinal) {
        this.fechaFinal = fechaFinal;
    }

    public Date getFechaFinal() {
        return fechaFinal;
    }

    public void setFechaCaptura(Date fechaCaptura) {
        this.fechaCaptura = fechaCaptura;
    }

    public Date getFechaCaptura() {
        return fechaCaptura;
    }

    public void setIngresoDependencia(Date ingresoDependencia) {
        this.ingresoDependencia = ingresoDependencia;
    }

    public Date getIngresoDependencia() {
        return ingresoDependencia;
    }

    public void setIdTipo(String idTipo) {
        this.idTipo = idTipo;
    }

    public String getIdTipo() {
        return idTipo;
    }

    public void setDescTipo(String descTipo) {
        this.descTipo = descTipo;
    }

    public String getDescTipo() {
        return descTipo;
    }

    public void setIdPeriodo(Integer idPeriodo) {
        this.idPeriodo = idPeriodo;
    }

    public Integer getIdPeriodo() {
        return idPeriodo;
    }

    public void setDescPeriodo(String descPeriodo) {
        this.descPeriodo = descPeriodo;
    }

    public String getDescPeriodo() {
        return descPeriodo;
    }

    public void setIdMotivo(Integer idMotivo) {
        this.idMotivo = idMotivo;
    }

    public Integer getIdMotivo() {
        return idMotivo;
    }

    public void setDescMotivo(String descMotivo) {
        this.descMotivo = descMotivo;
    }

    public String getDescMotivo() {
        return descMotivo;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public String getNip() {
        return nip;
    }

    public void setDiasSolicitados(Integer diasSolicitados) {
        this.diasSolicitados = diasSolicitados;
    }

    public Integer getDiasSolicitados() {
        return diasSolicitados;
    }

    public void setDiasRestantes(Integer diasRestantes) {
        this.diasRestantes = diasRestantes;
    }

    public Integer getDiasRestantes() {
        return diasRestantes;
    }

    public void setUrlOrigen(String urlOrigen) {
        this.urlOrigen = urlOrigen;
    }

    public String getUrlOrigen() {
        return urlOrigen;
    }

    public void setUrlDestino(String urlDestino) {
        this.urlDestino = urlDestino;
    }

    public String getUrlDestino() {
        return urlDestino;
    }

    public void setDocGrupo(String[] docGrupo) {
        this.docGrupo = docGrupo;
    }

    public String[] getDocGrupo() {
        return docGrupo;
    }

    public void setMovimiento(String movimiento) {
        this.movimiento = movimiento;
    }

    public String getMovimiento() {
        return movimiento;
    }

    public void setBeanName(String beanName) {
        this.beanName = beanName;
    }

    public String getBeanName() {
        return beanName;
    }

    public void setMuestraRegistros(boolean muestraRegistros) {
        this.muestraRegistros = muestraRegistros;
    }

    public boolean isMuestraRegistros() {
        return muestraRegistros;
    }

    public void setCancel(boolean cancel) {
        this.cancel = cancel;
    }

    public boolean isCancel() {
        return cancel;
    }

    public void setIdentity(Serializable id) {
    }

    public Serializable getIdentity() {
        return null;
    }

    public void setListStatus(List<Item> listStatus) {
        this.listStatus = listStatus;
    }

    public List<Item> getListStatus() {
        return listStatus;
    }
}
