package gob.shcp.sireh.model.nomina.conceptos;

import gob.shcp.fsn.model.Model;

import java.math.BigDecimal;

public class DatosConceptoEmpleadoDTO implements java.io.Serializable, Model {
    private java.lang.String rfcEmpleado;
    private java.lang.String idTipoCpto;
    private java.lang.String idConcepto;
    private java.lang.String descConPag;
    private java.math.BigDecimal mcpMonto;
    private java.math.BigDecimal mcpPorcentaje;
    private java.math.BigDecimal mcpMontoAdeudo;
    private java.lang.String usuario;
    private BigDecimal mcpHorasDias;
    
    private String mcpRefCaptura;
    private String cpcTipoCaptura;
    private String cpcTipoCalculo; 
    private String cpcPermanente;
    private String cpcMensaje;
    private String cpcSubTipo;
    
    private Integer mcpQnaIni;
    private Integer mcpQnaFin;
    private Integer mcpQnaADescontar;
    
    public DatosConceptoEmpleadoDTO(){  }
    
    public DatosConceptoEmpleadoDTO(
        String mcpRefCaptura,
        String rfcEmpleado, 
        String idTipoCpto,
        String idConcepto,
        String descConPag,
        BigDecimal mcpMonto,
        BigDecimal mcpPorcentaje,
        BigDecimal mcpMontoAdeudo,
        String usuario,
        String cpcTipoCaptura,
        String cpcTipoCalculo,
        String cpcPermanente,
        String cpcMensaje,
        String cpcSubTipo,
        Integer mcpQnaIni,
        Integer mcpQnaFin,
        Integer mcpQnaADescontar,
        BigDecimal mcpHorasDias  ) {
        
        this.mcpRefCaptura = mcpRefCaptura;
        this.rfcEmpleado = rfcEmpleado;
        this.idTipoCpto = idTipoCpto;
        this.idConcepto = idConcepto;
        this.descConPag = descConPag;
        this.mcpMonto = mcpMonto;
        this.mcpPorcentaje = mcpPorcentaje;
        this.mcpMontoAdeudo = mcpMontoAdeudo;
        this.usuario = usuario; 
        
        this.cpcTipoCaptura = cpcTipoCaptura; 
        this.cpcTipoCalculo = cpcTipoCalculo; 
        this.cpcPermanente = cpcPermanente;
        this.cpcMensaje = cpcMensaje;
        this.cpcSubTipo = cpcSubTipo;
        this.mcpQnaIni = mcpQnaIni;
        this.mcpQnaFin = mcpQnaFin;
        this.mcpQnaADescontar = mcpQnaADescontar;
        this.mcpHorasDias = mcpHorasDias; }

    public void setRfcEmpleado(String rfcEmpleado) {
        this.rfcEmpleado = rfcEmpleado;
    }

    public String getRfcEmpleado() {
        return rfcEmpleado;
    }

    public void setIdTipoCpto(String idTipoCpto) {
        this.idTipoCpto = idTipoCpto;
    }

    public String getIdTipoCpto() {
        return idTipoCpto;
    }

    public void setIdConcepto(String idConcepto) {
        this.idConcepto = idConcepto;
    }

    public String getIdConcepto() {
        return idConcepto;
    }

    public void setDescConPag(String descConPag) {
        this.descConPag = descConPag;
    }

    public String getDescConPag() {
        return descConPag;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setMcpRefCaptura(String mcpRefCaptura) {
        this.mcpRefCaptura = mcpRefCaptura;
    }

    public String getMcpRefCaptura() {
        return mcpRefCaptura;
    }

    public void setMcpMonto(BigDecimal mcpMonto) {
        this.mcpMonto = mcpMonto;
    }

    public BigDecimal getMcpMonto() {
        return mcpMonto;
    }

    public void setMcpPorcentaje(BigDecimal mcpPorcentaje) {
        this.mcpPorcentaje = mcpPorcentaje;
    }

    public BigDecimal getMcpPorcentaje() {
        return mcpPorcentaje;
    }

    public void setMcpMontoAdeudo(BigDecimal mcpMontoAdeudo) {
        this.mcpMontoAdeudo = mcpMontoAdeudo;
    }

    public BigDecimal getMcpMontoAdeudo() {
        return mcpMontoAdeudo;
    }

    public void setCpcTipoCaptura(String cpcTipoCaptura) {
        this.cpcTipoCaptura = cpcTipoCaptura;
    }

    public String getCpcTipoCaptura() {
        return cpcTipoCaptura;
    }

    public void setCpcTipoCalculo(String cpcTipoCalculo) {
        this.cpcTipoCalculo = cpcTipoCalculo;
    }

    public String getCpcTipoCalculo() {
        return cpcTipoCalculo;
    }

    public void setCpcPermanente(String cpcPermanente) {
        this.cpcPermanente = cpcPermanente;
    }

    public String getCpcPermanente() {
        return cpcPermanente;
    }

    public void setCpcMensaje(String cpcMensaje) {
        this.cpcMensaje = cpcMensaje;
    }

    public String getCpcMensaje() {
        return cpcMensaje;
    }

    public void setCpcSubTipo(String cpcSubTipo) {
        this.cpcSubTipo = cpcSubTipo;
    }

    public String getCpcSubTipo() {
        return cpcSubTipo;
    }

    public void setMcpQnaIni(Integer mcpQnaIni) {
        this.mcpQnaIni = mcpQnaIni;
    }

    public Integer getMcpQnaIni() {
        return mcpQnaIni;
    }

    public void setMcpQnaFin(Integer mcpQnaFin) {
        this.mcpQnaFin = mcpQnaFin;
    }

    public Integer getMcpQnaFin() {
        return mcpQnaFin;
    }

    public void setMcpQnaADescontar(Integer mcpQnaADescontar) {
        this.mcpQnaADescontar = mcpQnaADescontar;
    }

    public Integer getMcpQnaADescontar() {
        return mcpQnaADescontar;
    }

    public void setMcpHorasDias(BigDecimal mcpHorasDias) {
        this.mcpHorasDias = mcpHorasDias;
    }

    public BigDecimal getMcpHorasDias() {
        return mcpHorasDias;
    }
}
