package gob.shcp.sireh.model.clc.herramientas;

import gob.shcp.fsn.model.Model;

import org.springmodules.validation.bean.conf.loader.annotation.handler.ValidationMethod;

public class ConsultaClcDTO implements java.io.Serializable, Model {

    // Datos de la CXLC
    private Integer cxlcCiclo;
    private Integer cxlcQnaPago;
    private String cxlcTipoNomina;
    private String cxlcComplemento;
    
    // Configuracion inicial
    private String seccion;
    private String beanName;
    
    // Navegacion
    private String urlOrigen;
    private String urlDestino;
    
    // Control
    private boolean cancel;
    private boolean muestraRegistros;
    
    //private Integer[] cxlcGrupo;
    private String[] cxlcGrupo;
    private boolean registro;
    private String urlOrigenRegistro;
    
    // Registra Compromiso
    private boolean registraCompromiso;
    
    // Registra Solicitud de pago
    private boolean registraSolicitudPago;
    
    // Concilia CLC
    private boolean conciliaCLC;
    private Integer conciliaSICOP;
    
    
    public Integer getCxlcCiclo() {
        return cxlcCiclo;
    }

    public void setCxlcCiclo(Integer cxlcCiclo) {
        this.cxlcCiclo = cxlcCiclo;
    }
    
    public void setCxlcQnaPago(Integer cxlcQnaPago) {
        this.cxlcQnaPago = cxlcQnaPago;
    }

    public Integer getCxlcQnaPago() {
        return cxlcQnaPago;
    }
    
    public void setCxlcTipoNomina(String cxlcTipoNomina) {
        this.cxlcTipoNomina = cxlcTipoNomina;
    }

    public String getCxlcTipoNomina() {
        return cxlcTipoNomina;
    }

    public void setCxlcComplemento(String cxlcComplemento) {
        this.cxlcComplemento = cxlcComplemento;
    }

    public String getCxlcComplemento() {
        return cxlcComplemento;
    }

    public String getSeccion() {
        return seccion;
    }

    public void setSeccion(String seccion) {
        this.seccion = seccion;
    }

    public String getBeanName() {
        return beanName;
    }

    public void setBeanName(String beanName) {
        this.beanName = beanName;
    }

    public String getUrlOrigen() {
        return urlOrigen;
    }

    public void setUrlOrigen(String urlOrigen) {
        this.urlOrigen = urlOrigen;
    }

    public String getUrlDestino() {
        return urlDestino;
    }

    public void setUrlDestino(String urlDestino) {
        this.urlDestino = urlDestino;
    }

    public boolean isCancel() {
        return cancel;
    }

    public void setCancel(boolean cancel) {
        this.cancel = cancel;
    }

    public boolean isMuestraRegistros() {
        return muestraRegistros;
    }

    public void setMuestraRegistros(boolean muestraRegistros) {
        this.muestraRegistros = muestraRegistros;
    }

    /*public Integer[] getCxlcGrupo() {
        return cxlcGrupo;
    }
    public void setCxlcGrupo(Integer[] cxlcGrupo) {
        this.cxlcGrupo = cxlcGrupo;
    }*/
    public String[] getCxlcGrupo() {
        return cxlcGrupo;
    }
    
    public void setCxlcGrupo(String[] cxlcGrupo) {
        this.cxlcGrupo = cxlcGrupo;
    }

    public boolean isRegistro() {
        return registro;
    }

    public void setRegistro(boolean registro) {
        this.registro = registro;
    }

    public String getUrlOrigenRegistro() {
        return urlOrigenRegistro;
    }

    public void setUrlOrigenRegistro(String urlOrigenRegistro) {
        this.urlOrigenRegistro = urlOrigenRegistro;
    }

    public boolean isRegistraCompromiso() {
        return registraCompromiso;
    }

    public void setRegistraCompromiso(boolean registraCompromiso) {
        this.registraCompromiso = registraCompromiso;
    }

    public boolean isRegistraSolicitudPago() {
        return registraSolicitudPago;
    }

    public void setRegistraSolicitudPago(boolean registraSolicitudPago) {
        this.registraSolicitudPago = registraSolicitudPago;
    }
    
    public void setConciliaCLC(boolean conciliaCLC) {
        this.conciliaCLC = conciliaCLC;
    }

    public boolean isConciliaCLC() {
        return conciliaCLC;
    }
    
    public void setConciliaSICOP(Integer conciliaSICOP) {
        this.conciliaSICOP = conciliaSICOP;
    }

    public Integer getConciliaSICOP() {
        return conciliaSICOP;
    }
    
    /* V A L I D A C I O N E S */
    @ValidationMethod(forProperty="cxlcGrupo", errorCode="error.verify.unselected")
    private boolean validateCxlcGrupo() {
        if (this.isRegistro() || this.isConciliaCLC()) {
            return (this.getCxlcGrupo() != null && this.getCxlcGrupo().length > 0);
        }
        return true;
    }
}
