package gob.shcp.sireh.model.expediente.gestion.documentos;

import gob.shcp.fsn.model.Model;

public class ExpedienteBusquedaModificacionDTO implements java.io.Serializable, Model {

    private String interior;
    
    private String idDocto;
    private String rfcEmpleado;
    private String nombreEmpleado;
    private String primerApellido;
    private String segundoApellido;
    private String unidad;
    private String status;
    
    // Configuracion inicial
    private String beanName;
    private String beanNameTipoDocto;
    
    // Navegacion
    private String urlOrigen;
    private String urlDestino;
    
    // Control
     private boolean cancel;
     private boolean muestraRegistros;
    
    public void setInterior(String interior) {
        this.interior = interior;
    }

    public String getInterior() {
        return interior;
    }


    public void setIdDocto(String idDocto) {
        this.idDocto = idDocto;
    }

    public String getIdDocto() {
        return idDocto;
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

    public void setUnidad(String unidad) {
        this.unidad = unidad;
    }

    public String getUnidad() {
        return unidad;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public void setBeanName(String beanName) {
        this.beanName = beanName;
    }

    public String getBeanName() {
        return beanName;
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

    public void setMuestraRegistros(boolean muestraRegistros) {
        this.muestraRegistros = muestraRegistros;
    }

    public boolean isMuestraRegistros() {
        return muestraRegistros;
    }

    public void setBeanNameTipoDocto(String beanNameTipoDocto) {
        this.beanNameTipoDocto = beanNameTipoDocto;
    }

    public String getBeanNameTipoDocto() {
        return beanNameTipoDocto;
    }
}
