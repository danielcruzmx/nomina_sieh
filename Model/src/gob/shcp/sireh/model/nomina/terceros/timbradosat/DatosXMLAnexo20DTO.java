package gob.shcp.sireh.model.nomina.terceros.timbradosat;

import gob.shcp.fsn.model.Model;

import java.math.BigDecimal;

import java.util.Date;
import java.util.List;

public class DatosXMLAnexo20DTO implements java.io.Serializable, Model {
    // comprobante
    private String version;
    private String serie;
    private int folio;
    private int difFolio;
    private Date fecha;
    private String sello;
    private String formaPago;
    private String noCertificado;
    private String certificado;
    private BigDecimal subTotal;
    private BigDecimal descuento;
    private String moneda;
    private BigDecimal total;
    private String tipoDeComprobante;
    private String metodoDePago;
    private String lugarExpedicion;
    private String cadenaOriginal;
    private String usoCfdi;
    private String claveProdServ;
    private String cveUnidad;
    
    // emisor
    private String rfcEmisor;
    private String nombreEmisor;
    private String regimen;
            
    // receptor
    private String rfcReceptor;
    private String nombreReceptor;
    
    // conceptos
    private int    cantidad;
    private String unidad;
    private String descripcionConcepto;
    private BigDecimal valorUnitario;
    private BigDecimal importe;
    
    // nomina
    private String versionNomina;
    private String tipoNomina;
    private Date   fechaPago;
    private Date   fechaInicial;
    private Date   fechaFinal;
    private int    numDiasPagados;
    private BigDecimal totalPercepciones;
    private BigDecimal totalDeducciones;
    private BigDecimal totalOtrosPagos;
    
    // emisor nomina
    private String registroPatronal;
    
    // receptor nomina
    private String curp;
    private String nss;
    private Date   fechaInicioRelLab;
    private String antiguedad;
    private String tipoContrato;
    private String tipoJornada;
    private String tipoRegimen;
    private String numEmpleado;
    private String departamento;
    private String puesto;
    private String riesgoPuesto;
    private String periodicidadPago;
    private String banco;
    private String cuentaBancaria;
    private BigDecimal sdoBaseCotApor;
    private BigDecimal sdoDiarioIntegrado;
    private String cveEntFed;
    private String sindicalizado;
    
    // percepciones nomina
    private BigDecimal totalSueldos;
    private BigDecimal totalSeparacionInd;
    private BigDecimal totalJubPensRet;
    private BigDecimal totalGravado;
    private BigDecimal totalExento;
    
    // deducciones nomina
    private BigDecimal totalOtrasDeducciones;
    private BigDecimal totalImpuestosRetenidos;
    
    //List <ConceptoPagoTimbrado> cptos;
    List <ConceptoPagoXMLAnexo20DTO> otrosPagos;
    List <ConceptoPagoXMLAnexo20DTO> percepciones;
    List <ConceptoPagoXMLAnexo20DTO> deducciones;
    
    public DatosXMLAnexo20DTO(){
        super();
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getVersion() {
        return version;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public String getSerie() {
        return serie;
    }

    public void setFolio(int folio) {
        this.folio = folio;
    }

    public int getFolio() {
        return folio;
    }

    public void setDifFolio(int difFolio) {
        this.difFolio = difFolio;
    }

    public int getDifFolio() {
        return difFolio;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setSello(String sello) {
        this.sello = sello;
    }

    public String getSello() {
        return sello;
    }

    public void setFormaPago(String formaPago) {
        this.formaPago = formaPago;
    }

    public String getFormaPago() {
        return formaPago;
    }

    public void setNoCertificado(String noCertificado) {
        this.noCertificado = noCertificado;
    }

    public String getNoCertificado() {
        return noCertificado;
    }

    public void setCertificado(String certificado) {
        this.certificado = certificado;
    }

    public String getCertificado() {
        return certificado;
    }

    public void setSubTotal(BigDecimal subTotal) {
        this.subTotal = subTotal;
    }

    public BigDecimal getSubTotal() {
        return subTotal;
    }

    public void setDescuento(BigDecimal descuento) {
        this.descuento = descuento;
    }

    public BigDecimal getDescuento() {
        return descuento;
    }

    public void setMoneda(String moneda) {
        this.moneda = moneda;
    }

    public String getMoneda() {
        return moneda;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTipoDeComprobante(String tipoDeComprobante) {
        this.tipoDeComprobante = tipoDeComprobante;
    }

    public String getTipoDeComprobante() {
        return tipoDeComprobante;
    }

    public void setMetodoDePago(String metodoDePago) {
        this.metodoDePago = metodoDePago;
    }

    public String getMetodoDePago() {
        return metodoDePago;
    }

    public void setLugarExpedicion(String lugarExpedicion) {
        this.lugarExpedicion = lugarExpedicion;
    }

    public String getLugarExpedicion() {
        return lugarExpedicion;
    }

    public void setCadenaOriginal(String cadenaOriginal) {
        this.cadenaOriginal = cadenaOriginal;
    }

    public String getCadenaOriginal() {
        return cadenaOriginal;
    }

    public void setRfcEmisor(String rfcEmisor) {
        this.rfcEmisor = rfcEmisor;
    }

    public String getRfcEmisor() {
        return rfcEmisor;
    }

    public void setNombreEmisor(String nombreEmisor) {
        this.nombreEmisor = nombreEmisor;
    }

    public String getNombreEmisor() {
        return nombreEmisor;
    }

    public void setRegimen(String regimen) {
        this.regimen = regimen;
    }

    public String getRegimen() {
        return regimen;
    }

    public void setRfcReceptor(String rfcReceptor) {
        this.rfcReceptor = rfcReceptor;
    }

    public String getRfcReceptor() {
        return rfcReceptor;
    }

    public void setNombreReceptor(String nombreReceptor) {
        this.nombreReceptor = nombreReceptor;
    }

    public String getNombreReceptor() {
        return nombreReceptor;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setUnidad(String unidad) {
        this.unidad = unidad;
    }

    public String getUnidad() {
        return unidad;
    }

    public void setDescripcionConcepto(String descripcionConcepto) {
        this.descripcionConcepto = descripcionConcepto;
    }

    public String getDescripcionConcepto() {
        return descripcionConcepto;
    }

    public void setValorUnitario(BigDecimal valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    public BigDecimal getValorUnitario() {
        return valorUnitario;
    }

    public void setImporte(BigDecimal importe) {
        this.importe = importe;
    }

    public BigDecimal getImporte() {
        return importe;
    }

    public void setVersionNomina(String versionNomina) {
        this.versionNomina = versionNomina;
    }

    public String getVersionNomina() {
        return versionNomina;
    }

    public void setTipoNomina(String tipoNomina) {
        this.tipoNomina = tipoNomina;
    }

    public String getTipoNomina() {
        return tipoNomina;
    }

    public void setFechaPago(Date fechaPago) {
        this.fechaPago = fechaPago;
    }

    public Date getFechaPago() {
        return fechaPago;
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

    public void setNumDiasPagados(int numDiasPagados) {
        this.numDiasPagados = numDiasPagados;
    }

    public int getNumDiasPagados() {
        return numDiasPagados;
    }

    public void setTotalPercepciones(BigDecimal totalPercepciones) {
        this.totalPercepciones = totalPercepciones;
    }

    public BigDecimal getTotalPercepciones() {
        return totalPercepciones;
    }

    public void setTotalDeducciones(BigDecimal totalDeducciones) {
        this.totalDeducciones = totalDeducciones;
    }

    public BigDecimal getTotalDeducciones() {
        return totalDeducciones;
    }

    public void setTotalOtrosPagos(BigDecimal totalOtrosPagos) {
        this.totalOtrosPagos = totalOtrosPagos;
    }

    public BigDecimal getTotalOtrosPagos() {
        return totalOtrosPagos;
    }

    public void setRegistroPatronal(String registroPatronal) {
        this.registroPatronal = registroPatronal;
    }

    public String getRegistroPatronal() {
        return registroPatronal;
    }

    public void setCurp(String curp) {
        this.curp = curp;
    }

    public String getCurp() {
        return curp;
    }

    public void setNss(String nss) {
        this.nss = nss;
    }

    public String getNss() {
        return nss;
    }

    public void setFechaInicioRelLab(Date fechaInicioRelLab) {
        this.fechaInicioRelLab = fechaInicioRelLab;
    }

    public Date getFechaInicioRelLab() {
        return fechaInicioRelLab;
    }

    public void setAntiguedad(String antiguedad) {
        this.antiguedad = antiguedad;
    }

    public String getAntiguedad() {
        return antiguedad;
    }

    public void setTipoContrato(String tipoContrato) {
        this.tipoContrato = tipoContrato;
    }

    public String getTipoContrato() {
        return tipoContrato;
    }

    public void setTipoJornada(String tipoJornada) {
        this.tipoJornada = tipoJornada;
    }

    public String getTipoJornada() {
        return tipoJornada;
    }

    public void setTipoRegimen(String tipoRegimen) {
        this.tipoRegimen = tipoRegimen;
    }

    public String getTipoRegimen() {
        return tipoRegimen;
    }

    public void setNumEmpleado(String numEmpleado) {
        this.numEmpleado = numEmpleado;
    }

    public String getNumEmpleado() {
        return numEmpleado;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setRiesgoPuesto(String riesgoPuesto) {
        this.riesgoPuesto = riesgoPuesto;
    }

    public String getRiesgoPuesto() {
        return riesgoPuesto;
    }

    public void setPeriodicidadPago(String periodicidadPago) {
        this.periodicidadPago = periodicidadPago;
    }

    public String getPeriodicidadPago() {
        return periodicidadPago;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public String getBanco() {
        return banco;
    }

    public void setCuentaBancaria(String cuentaBancaria) {
        this.cuentaBancaria = cuentaBancaria;
    }

    public String getCuentaBancaria() {
        return cuentaBancaria;
    }

    public void setSdoBaseCotApor(BigDecimal sdoBaseCotApor) {
        this.sdoBaseCotApor = sdoBaseCotApor;
    }

    public BigDecimal getSdoBaseCotApor() {
        return sdoBaseCotApor;
    }

    public void setSdoDiarioIntegrado(BigDecimal sdoDiarioIntegrado) {
        this.sdoDiarioIntegrado = sdoDiarioIntegrado;
    }

    public BigDecimal getSdoDiarioIntegrado() {
        return sdoDiarioIntegrado;
    }

    public void setCveEntFed(String cveEntFed) {
        this.cveEntFed = cveEntFed;
    }

    public String getCveEntFed() {
        return cveEntFed;
    }

    public void setTotalSueldos(BigDecimal totalSueldos) {
        this.totalSueldos = totalSueldos;
    }

    public BigDecimal getTotalSueldos() {
        return totalSueldos;
    }

    public void setTotalSeparacionInd(BigDecimal totalSeparacionInd) {
        this.totalSeparacionInd = totalSeparacionInd;
    }

    public BigDecimal getTotalSeparacionInd() {
        return totalSeparacionInd;
    }

    public void setTotalJubPensRet(BigDecimal totalJubPensRet) {
        this.totalJubPensRet = totalJubPensRet;
    }

    public BigDecimal getTotalJubPensRet() {
        return totalJubPensRet;
    }

    public void setTotalGravado(BigDecimal totalGravado) {
        this.totalGravado = totalGravado;
    }

    public BigDecimal getTotalGravado() {
        return totalGravado;
    }

    public void setTotalExento(BigDecimal totalExento) {
        this.totalExento = totalExento;
    }

    public BigDecimal getTotalExento() {
        return totalExento;
    }

    public void setTotalOtrasDeducciones(BigDecimal totalOtrasDeducciones) {
        this.totalOtrasDeducciones = totalOtrasDeducciones;
    }

    public BigDecimal getTotalOtrasDeducciones() {
        return totalOtrasDeducciones;
    }

    public void setTotalImpuestosRetenidos(BigDecimal totalImpuestosRetenidos) {
        this.totalImpuestosRetenidos = totalImpuestosRetenidos;
    }

    public BigDecimal getTotalImpuestosRetenidos() {
        return totalImpuestosRetenidos;
    }

    public void setPercepciones(List<ConceptoPagoXMLAnexo20DTO> percepciones) {
        this.percepciones = percepciones;
    }

    public List<ConceptoPagoXMLAnexo20DTO> getPercepciones() {
        return percepciones;
    }

    public void setDeducciones(List<ConceptoPagoXMLAnexo20DTO> deducciones) {
        this.deducciones = deducciones;
    }

    public List<ConceptoPagoXMLAnexo20DTO> getDeducciones() {
        return deducciones;
    }

    public void setUsoCfdi(String usoCfdi) {
        this.usoCfdi = usoCfdi;
    }

    public String getUsoCfdi() {
        return usoCfdi;
    }

    public void setClaveProdServ(String claveProdServ) {
        this.claveProdServ = claveProdServ;
    }

    public String getClaveProdServ() {
        return claveProdServ;
    }

    public void setCveUnidad(String cveUnidad) {
        this.cveUnidad = cveUnidad;
    }

    public String getCveUnidad() {
        return cveUnidad;
    }

    public void setOtrosPagos(List<ConceptoPagoXMLAnexo20DTO> otrosPagos) {
        this.otrosPagos = otrosPagos;
    }

    public List<ConceptoPagoXMLAnexo20DTO> getOtrosPagos() {
        return otrosPagos;
    }

    public void setSindicalizado(String sindicalizado) {
        this.sindicalizado = sindicalizado;
    }

    public String getSindicalizado() {
        return sindicalizado;
    }
}
