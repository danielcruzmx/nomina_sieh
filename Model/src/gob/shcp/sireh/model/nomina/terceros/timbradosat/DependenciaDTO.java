package gob.shcp.sireh.model.nomina.terceros.timbradosat;

import gob.shcp.fsn.model.Model;

public class DependenciaDTO implements java.io.Serializable, Model {
    private String  rfc;
    private String  nombre;
    private String  regimenFiscal;
    private String  lugar;
    private String  numCertificado;
    private String  registroPatronal;
    private String  version32;
    private String  version33;
    private String  versionNomina;
    private Integer cantidad;
    private String  unidad;
    private String  descripcionConcepto;
    private String  formaPago;
    private String  tipoComprobante;
    private String  metodoPago;
    private String  certificado;
    
    private String  cveUnidad;
    private String  usoCfdi;
    private String  cveProdServ;
    
    public DependenciaDTO(){
        this.setVersion32("3.2");
        this.setVersion33("3.3");
        this.setVersionNomina("1.2");
        this.setLugar("06060");
        this.setRfc("");
        this.setNombre("SECRETARIA DE HACIENDA Y CREDITO PUBLICO");
        this.setRegimenFiscal("603"); //?
        this.setRegistroPatronal("0000699900");
        this.setCantidad(1);
        this.setCveUnidad("ACT");
        this.setDescripcionConcepto("Pago de nómina");
        this.setTipoComprobante("E");
        this.setMetodoPago("PUE");
        this.setUsoCfdi("P01");
        this.setCveProdServ("84111505");
        
        this.setNumCertificado("");
        this.setUnidad("ACT");
        this.setFormaPago("En una sola exhibición");
        this.setCertificado("");
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
        
    }

    public String getRfc() {
        return rfc;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setRegimenFiscal(String regimenFiscal) {
        this.regimenFiscal = regimenFiscal;
    }

    public String getRegimenFiscal() {
        return regimenFiscal;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public String getLugar() {
        return lugar;
    }

    public void setNumCertificado(String numCertificado) {
        this.numCertificado = numCertificado;
    }

    public String getNumCertificado() {
        return numCertificado;
    }

    public void setRegistroPatronal(String registroPatronal) {
        this.registroPatronal = registroPatronal;
    }

    public String getRegistroPatronal() {
        return registroPatronal;
    }

    public void setVersion32(String version) {
        this.version32 = version;
    }

    public String getVersion32() {
        return version32;
    }
    
    public void setVersion33(String version) {
        this.version33 = version;
    }
    
    public String getVersion33() {
        return version33;
    }

    public void setVersionNomina(String versionNomina) {
        this.versionNomina = versionNomina;
    }

    public String getVersionNomina() {
        return versionNomina;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Integer getCantidad() {
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

    public void setFormaPago(String formaPago) {
        this.formaPago = formaPago;
    }

    public String getFormaPago() {
        return formaPago;
    }

    public void setTipoComprobante(String tipoComprobante) {
        this.tipoComprobante = tipoComprobante;
    }

    public String getTipoComprobante() {
        return tipoComprobante;
    }

    public void setMetodoPago(String metodoPago) {
        this.metodoPago = metodoPago;
    }

    public String getMetodoPago() {
        return metodoPago;
    }

    public void setCertificado(String certificado) {
        this.certificado = certificado;
    }

    public String getCertificado() {
        return certificado;
    }

    public void setCveUnidad(String cveUnidad) {
        this.cveUnidad = cveUnidad;
    }

    public String getCveUnidad() {
        return cveUnidad;
    }

    public void setUsoCfdi(String usoCfdi) {
        this.usoCfdi = usoCfdi;
    }

    public String getUsoCfdi() {
        return usoCfdi;
    }

    public void setCveProdServ(String cveProdServ) {
        this.cveProdServ = cveProdServ;
    }

    public String getCveProdServ() {
        return cveProdServ;
    }
}
