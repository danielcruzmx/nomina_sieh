package gob.shcp.sireh.model.rusp;

import gob.shcp.fsn.model.Model;

public class ConsultaEmpleadoRuspDTO implements java.io.Serializable, Model {
    
    // Configuracion inicial
    private String interior; // Nombre del interior
    private String beanName; // beanName del PagedList
    
    // Control
    private boolean cancel;
    private boolean muestraRegistros;
    
    // Navegacion
    private String urlOrigen;
    private String urlDestino;
    
    // Edicion
    private String linkDestino; // Propiedades para edicion
    private String paramIdDestino; // Propiedades para edicion
    private String propertyDestino; // Propiedades para edicion
    
     // Seleccion mutiple
     private Integer[] idPlazas;
     
    private Integer idPlaza;
    private String rfcEmpleado;
    private String nombreEmpleado;
    private String primerApellido;
    private String segundoApellido;
    
    // Metodos de acceso
    public void setInterior(String interior) {
        this.interior = interior;
    }

    public String getInterior() {
        return interior;
    }

    public void setBeanName(String beanName) {
        this.beanName = beanName;
    }

    public String getBeanName() {
        return beanName;
    }

    public void setCancel(boolean cancel) {
        this.cancel = cancel;
    }

    public boolean isCancel() {
        return cancel;
    }

    public void setMuestraRegistros(boolean muestraRegistros) {
        this.muestraRegistros = muestraRegistros;
    }

    public boolean isMuestraRegistros() {
        return muestraRegistros;
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

    public void setLinkDestino(String linkDestino) {
        this.linkDestino = linkDestino;
    }

    public String getLinkDestino() {
        return linkDestino;
    }

    public void setParamIdDestino(String paramIdDestino) {
        this.paramIdDestino = paramIdDestino;
    }

    public String getParamIdDestino() {
        return paramIdDestino;
    }

    public void setPropertyDestino(String propertyDestino) {
        this.propertyDestino = propertyDestino;
    }

    public String getPropertyDestino() {
        return propertyDestino;
    }
    
    public void setIdPlaza(Integer idPlaza) {
        this.idPlaza = idPlaza;
    }

    public Integer getIdPlaza() {
        return idPlaza;
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
    
    public void setIdPlazas(Integer[] idPlazas) {
        this.idPlazas = idPlazas;
    }

    public Integer[] getIdPlazas() {
        return idPlazas;
    }
}
