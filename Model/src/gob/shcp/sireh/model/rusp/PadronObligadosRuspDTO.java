package gob.shcp.sireh.model.rusp;

import gob.shcp.fsn.model.Model;

import org.springmodules.validation.bean.conf.loader.annotation.handler.ValidationMethod;

public class PadronObligadosRuspDTO implements java.io.Serializable, Model {
    
    // Datos del empleado-plaza
    private Integer plaza;
    private String rfc;
    private String nombre;
    private String primerApellido;
    private String segundoApellido;
    private String puesto;
    private String codigoPuesto;
    private String unidad;
    private String jerarquia;
    private String nombramiento;
    
    private String emailOficial;
    private String emailPersonal;
    private String fecGobiernoFederal;
    private String fecShcp;
    private String plazaUltimoMovto;
    private String fecIngSpc;
    private String fecIniDeclPatr;
    
    private String obligadoPresentar;
    private Integer idMotivoObligado;
    
    public void setPlaza(Integer plaza) {
        this.plaza = plaza;
    }

    public Integer getPlaza() {
        return plaza;
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

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setCodigoPuesto(String codigoPuesto) {
        this.codigoPuesto = codigoPuesto;
    }

    public String getCodigoPuesto() {
        return codigoPuesto;
    }

    public void setUnidad(String unidad) {
        this.unidad = unidad;
    }

    public String getUnidad() {
        return unidad;
    }

    public void setJerarquia(String jerarquia) {
        this.jerarquia = jerarquia;
    }

    public String getJerarquia() {
        return jerarquia;
    }

    public void setNombramiento(String nombramiento) {
        this.nombramiento = nombramiento;
    }

    public String getNombramiento() {
        return nombramiento;
    }
    
    public void setObligadoPresentar(String obligadoPresentar) {
        this.obligadoPresentar = obligadoPresentar;
    }

    public String getObligadoPresentar() {
        return obligadoPresentar;
    }
    
    public void setEmailOficial(String emailOficial) {
        this.emailOficial = emailOficial;
    }

    public String getEmailOficial() {
        return emailOficial;
    }

    public void setEmailPersonal(String emailPersonal) {
        this.emailPersonal = emailPersonal;
    }

    public String getEmailPersonal() {
        return emailPersonal;
    }

    public void setFecGobiernoFederal(String fecGobiernoFederal) {
        this.fecGobiernoFederal = fecGobiernoFederal;
    }

    public String getFecGobiernoFederal() {
        return fecGobiernoFederal;
    }

    public void setFecShcp(String fecShcp) {
        this.fecShcp = fecShcp;
    }

    public String getFecShcp() {
        return fecShcp;
    }

    public void setPlazaUltimoMovto(String plazaUltimoMovto) {
        this.plazaUltimoMovto = plazaUltimoMovto;
    }

    public String getPlazaUltimoMovto() {
        return plazaUltimoMovto;
    }

    public void setFecIngSpc(String fecIngSpc) {
        this.fecIngSpc = fecIngSpc;
    }

    public String getFecIngSpc() {
        return fecIngSpc;
    }

    public void setFecIniDeclPatr(String fecIniDeclPatr) {
        this.fecIniDeclPatr = fecIniDeclPatr;
    }

    public String getFecIniDeclPatr() {
        return fecIniDeclPatr;
    }
    
    public void setIdMotivoObligado(Integer idMotivoObligado) {
        this.idMotivoObligado = idMotivoObligado;
    }

    public Integer getIdMotivoObligado() {
        return idMotivoObligado;
    }
    
    // Validaciones
    @ValidationMethod(forProperty = "obligadoPresentar", errorCode = "not.null")
    public boolean validateObligadoPresentar() {
        return this.getObligadoPresentar() != null && !this.getObligadoPresentar().equals("");
    }
}
