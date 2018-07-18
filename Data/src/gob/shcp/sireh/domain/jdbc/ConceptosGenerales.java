package gob.shcp.sireh.domain.jdbc;

import gob.shcp.fsn.data.Domain;

import java.io.Serializable;

import java.math.BigDecimal;

import java.util.Date;

public class ConceptosGenerales implements Domain, Serializable {
    //QUERY 1
    // TD_EMPLEADO
    private java.lang.String rfcEmpleado;
    private java.lang.String nombreEmpleado;
    private java.lang.String primerApellido;
    private java.lang.String segundoApellido;
    // TD_PLAZA
    private java.lang.Integer idPlaza;
    private java.lang.String idUnidadNom;
    private java.lang.String idPuestoNom;
    // TC_UNIDAD
    private java.lang.String uniDesc;
    // TC_PUESTO
    private java.lang.String descPuesto;
    // TC_TABULADOR
    private java.math.BigDecimal tabSueldo;
    private java.math.BigDecimal tabCompensacion;
    // TC_ATRIBUTO_PUESTO
    private java.lang.String idNivelPto;
    // TC_NOMBRAMIENTO
    private java.lang.String descNomNombramiento;
    // QUERY 2
    // TD_CAP_CONCEPTO
    private java.lang.String idSitCapConcepto;
    private java.lang.String idTipoCpto;
    private java.lang.String codigo;
    private java.lang.String idCptoPago;
    private java.math.BigDecimal tdCcMonto;
    private java.math.BigDecimal tdCcPorcentaje;
    private java.math.BigDecimal tdCcMontoAdeudo;
    private java.util.Date fecModifico;

    // TC_CONCEPTO_PAGO
    private java.lang.String descConPag;

    //TN_MOVTO_CONCEPTO_PAGO
    private java.lang.Integer qnaCancelo; //qna_cancelo --> quincena en la que se hace la cancelacion.

    // APLICACION
    private java.lang.String commonName;
    private java.lang.String usuario;
    private java.lang.Boolean buscar;
    private java.lang.Boolean delete;

    private java.lang.String mcpRefCancela; //en la jsp: Input texto  Referencia
    private java.lang.String origenMenu; //guarda la referencai de que menu viene
    private String urlOrigen;
    private String urlDestino;
    private boolean cancel;

    public ConceptosGenerales() {
    }

    public ConceptosGenerales(java.lang.String rfcEmpleado, 
                              java.lang.String nombreEmpleado, 
                              java.lang.String primerApellido, 
                              java.lang.String segundoApellido, 
                              java.lang.Integer idPlaza, 
                              java.lang.String idUnidadNom, 
                              java.lang.String idPuestoNom, 
                              java.lang.String uniDesc, 
                              java.lang.String descPuesto, 
                              java.math.BigDecimal tabSueldo, 
                              java.math.BigDecimal tabCompensacion, 
                              java.lang.String idNivelPto, 
                              java.lang.String descNomNombramiento, 
                              java.lang.String idSitCapConcepto, 
                              java.lang.String idTipoCpto, 
                              java.lang.String codigo, 
                              java.lang.String idCptoPago, 
                              java.math.BigDecimal tdCcMonto, 
                              java.math.BigDecimal tdCcPorcentaje, 
                              java.math.BigDecimal tdCcMontoAdeudo, 
                              java.lang.String usuario, 
                              java.util.Date fecModifico, 
                              java.lang.String descConPag, 
                              java.lang.String commonName, 
                              java.lang.Boolean buscar, 
                              java.lang.Boolean delete, String urlOrigen, 
                              String urlDestino, java.lang.Integer qnaCancelo, 
                              java.lang.String origenMenu, 
                              java.lang.String mcpRefCancela, boolean cancel) {

        this.rfcEmpleado = rfcEmpleado;
        this.nombreEmpleado = nombreEmpleado;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
        this.idPlaza = idPlaza;
        this.idUnidadNom = idUnidadNom;
        this.idPuestoNom = idPuestoNom;
        this.uniDesc = uniDesc;
        this.descPuesto = descPuesto;
        this.tabSueldo = tabSueldo;
        this.tabCompensacion = tabCompensacion;
        this.idNivelPto = idNivelPto;
        this.idNivelPto = idNivelPto;
        this.descNomNombramiento = descNomNombramiento;
        this.idSitCapConcepto = idSitCapConcepto;
        this.idTipoCpto = idTipoCpto;
        this.codigo = codigo;
        this.idCptoPago = idCptoPago;
        this.tdCcMonto = tdCcMonto;
        this.tdCcPorcentaje = tdCcPorcentaje;
        this.tdCcMontoAdeudo = tdCcMontoAdeudo;
        this.descConPag = descConPag;
        this.commonName = commonName;
        this.buscar = buscar;
        this.delete = delete;
        this.usuario = usuario;
        this.fecModifico = fecModifico;
        this.urlOrigen = urlOrigen;
        this.urlDestino = urlDestino;
        this.cancel = cancel;
        this.qnaCancelo = qnaCancelo;
        this.origenMenu = origenMenu;
        this.mcpRefCancela = mcpRefCancela;
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

    public void setUniDesc(String uniDesc) {
        this.uniDesc = uniDesc;
    }

    public String getUniDesc() {
        return uniDesc;
    }

    public void setDescPuesto(String descPuesto) {
        this.descPuesto = descPuesto;
    }

    public String getDescPuesto() {
        return descPuesto;
    }

    public void setTabSueldo(BigDecimal tabSueldo) {
        this.tabSueldo = tabSueldo;
    }

    public BigDecimal getTabSueldo() {
        return tabSueldo;
    }

    public void setTabCompensacion(BigDecimal tabCompensacion) {
        this.tabCompensacion = tabCompensacion;
    }

    public BigDecimal getTabCompensacion() {
        return tabCompensacion;
    }

    public void setIdNivelPto(String idNivelPto) {
        this.idNivelPto = idNivelPto;
    }

    public String getIdNivelPto() {
        return idNivelPto;
    }

    public void setDescNomNombramiento(String descNomNombramiento) {
        this.descNomNombramiento = descNomNombramiento;
    }

    public String getDescNomNombramiento() {
        return descNomNombramiento;
    }

    public void setIdSitCapConcepto(String idSitCapConcepto) {
        this.idSitCapConcepto = idSitCapConcepto;
    }

    public String getIdSitCapConcepto() {
        return idSitCapConcepto;
    }

    public void setIdTipoCpto(String idTipoCpto) {
        this.idTipoCpto = idTipoCpto;
    }

    public String getIdTipoCpto() {
        return idTipoCpto;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setIdCptoPago(String idCptoPago) {
        this.idCptoPago = idCptoPago;
    }

    public String getIdCptoPago() {
        return idCptoPago;
    }

    public void setTdCcMonto(BigDecimal tdCcMonto) {
        this.tdCcMonto = tdCcMonto;
    }

    public BigDecimal getTdCcMonto() {
        return tdCcMonto;
    }

    public void setTdCcPorcentaje(BigDecimal tdCcPorcentaje) {
        this.tdCcPorcentaje = tdCcPorcentaje;
    }

    public BigDecimal getTdCcPorcentaje() {
        return tdCcPorcentaje;
    }

    public void setTdCcMontoAdeudo(BigDecimal tdCcMontoAdeudo) {
        this.tdCcMontoAdeudo = tdCcMontoAdeudo;
    }

    public BigDecimal getTdCcMontoAdeudo() {
        return tdCcMontoAdeudo;
    }

    public void setFecModifico(Date fecModifico) {
        this.fecModifico = fecModifico;
    }

    public Date getFecModifico() {
        return fecModifico;
    }

    public void setDescConPag(String descConPag) {
        this.descConPag = descConPag;
    }

    public String getDescConPag() {
        return descConPag;
    }

    public void setQnaCancelo(Integer qnaCancelo) {
        this.qnaCancelo = qnaCancelo;
    }

    public Integer getQnaCancelo() {
        return qnaCancelo;
    }

    public void setCommonName(String commonName) {
        this.commonName = commonName;
    }

    public String getCommonName() {
        return commonName;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setBuscar(Boolean buscar) {
        this.buscar = buscar;
    }

    public Boolean getBuscar() {
        return buscar;
    }

    public void setDelete(Boolean delete) {
        this.delete = delete;
    }

    public Boolean getDelete() {
        return delete;
    }

    public void setMcpRefCancela(String mcpRefCancela) {
        this.mcpRefCancela = mcpRefCancela;
    }

    public String getMcpRefCancela() {
        return mcpRefCancela;
    }

    public void setOrigenMenu(String origenMenu) {
        this.origenMenu = origenMenu;
    }

    public String getOrigenMenu() {
        return origenMenu;
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

    public void setCancel(boolean cancel) {
        this.cancel = cancel;
    }

    public boolean isCancel() {
        return cancel;
    }

    /* solo para consulta*/

    public void setIdentity(Serializable id) {
    }

    public Serializable getIdentity() {
        return null;
    }

}
