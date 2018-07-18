package gob.shcp.sireh.model.expediente.gestion.control;

import gob.shcp.fsn.model.Model;

import java.util.Date;

import org.springmodules.validation.bean.conf.loader.annotation.handler.ValidationMethod;

public class ControlExpedientesDTO implements java.io.Serializable, Model {
    
    // Filtros
    private String idUnidadNom;
    private String rfcEmpleado;
    private String nombreEmpleado;;
    private String primerApellido;
    private String segundoApellido;
    
    // Configuracion inicial
    private String beanName;
    
    // Navegacion
    private String urlOrigen;
    private String urlDestino;
    
    // Control
    private boolean cancel;
    private boolean muestraRegistros;
    private boolean cancelar;
    private boolean guardar;
    private boolean showPagedList;
    
    private String usuRfcEmpleado;
    private String usuNombreEmpleado;;
    private String usuPrimerApellido;
    private String usuSegundoApellido;
    private java.util.Date usuFechaAutorizacion;
    private String usuDoctoAutorizacion;
    private String usuTelefono;
    private String idStatus;
    private String exePrestado;
    private String exeRfcUsuarioPrestamo;
    private java.util.Date exeFechaPrestamo;
    private String exeDatosClasificacion;
    private String exeDatosUbicacion;
    private String empleadoGrupo;
    
    private String rfcEmpleadoBusqueda;
    
    public void setIdUnidadNom(String idUnidadNom) {
        this.idUnidadNom = idUnidadNom;
    }

    public String getIdUnidadNom() {
        return idUnidadNom;
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

    public void setUsuRfcEmpleado(String usuRfcEmpleado) {
        this.usuRfcEmpleado = usuRfcEmpleado;
    }

    public String getUsuRfcEmpleado() {
        return usuRfcEmpleado;
    }

    public void setUsuNombreEmpleado(String usuNombreEmpleado) {
        this.usuNombreEmpleado = usuNombreEmpleado;
    }

    public String getUsuNombreEmpleado() {
        return usuNombreEmpleado;
    }

    public void setUsuPrimerApellido(String usuPrimerApellido) {
        this.usuPrimerApellido = usuPrimerApellido;
    }

    public String getUsuPrimerApellido() {
        return usuPrimerApellido;
    }

    public void setUsuSegundoApellido(String usuSegundoApellido) {
        this.usuSegundoApellido = usuSegundoApellido;
    }

    public String getUsuSegundoApellido() {
        return usuSegundoApellido;
    }

    public void setUsuFechaAutorizacion(Date usuFechaAutorizacion) {
        this.usuFechaAutorizacion = usuFechaAutorizacion;
    }

    public Date getUsuFechaAutorizacion() {
        return usuFechaAutorizacion;
    }

    public void setUsuDoctoAutorizacion(String usuDoctoAutorizacion) {
        this.usuDoctoAutorizacion = usuDoctoAutorizacion;
    }

    public String getUsuDoctoAutorizacion() {
        return usuDoctoAutorizacion;
    }

    public void setUsuTelefono(String usuTelefono) {
        this.usuTelefono = usuTelefono;
    }

    public String getUsuTelefono() {
        return usuTelefono;
    }

    public void setIdStatus(String idStatus) {
        this.idStatus = idStatus;
    }

    public String getIdStatus() {
        return idStatus;
    }

    public void setExePrestado(String exePrestado) {
        this.exePrestado = exePrestado;
    }

    public String getExePrestado() {
        return exePrestado;
    }

    public void setExeRfcUsuarioPrestamo(String exeRfcUsuarioPrestamo) {
        this.exeRfcUsuarioPrestamo = exeRfcUsuarioPrestamo;
    }

    public String getExeRfcUsuarioPrestamo() {
        return exeRfcUsuarioPrestamo;
    }

    public void setExeFechaPrestamo(Date exeFechaPrestamo) {
        this.exeFechaPrestamo = exeFechaPrestamo;
    }

    public Date getExeFechaPrestamo() {
        return exeFechaPrestamo;
    }

    public void setExeDatosClasificacion(String exeDatosClasificacion) {
        this.exeDatosClasificacion = exeDatosClasificacion;
    }

    public String getExeDatosClasificacion() {
        return exeDatosClasificacion;
    }

    public void setExeDatosUbicacion(String exeDatosUbicacion) {
        this.exeDatosUbicacion = exeDatosUbicacion;
    }

    public String getExeDatosUbicacion() {
        return exeDatosUbicacion;
    }
    
    public void setCancelar(boolean cancelar) {
        this.cancelar = cancelar;
    }

    public boolean isCancelar() {
        return cancelar;
    }

    public void setGuardar(boolean guardar) {
        this.guardar = guardar;
    }

    public boolean isGuardar() {
        return guardar;
    }
    
    // Validaciones
    @ValidationMethod(forProperty = "exePrestado", errorCode = "not.null")
    public boolean validateExePrestadoRequiered() {

        if (this.isGuardar()) {
            return (this.getExePrestado() != null && !this.getExePrestado().equals(""));
        }
        return true;
    }
    
    @ValidationMethod(forProperty = "exeRfcUsuarioPrestamo", errorCode = "not.null")
    public boolean validateExeRfcUsuarioPrestamoRequiered() {

        if (this.isGuardar() && this.getExePrestado() != null && this.getExePrestado().equals("SI")) {
            return (this.getExeRfcUsuarioPrestamo() != null && !this.getExeRfcUsuarioPrestamo().equals(""));
        }
        return true;
    }
    
    @ValidationMethod(forProperty = "exeFechaPrestamo", errorCode = "not.null")
    public boolean validateExeFechaPrestamoRequiered() {

        if (this.isGuardar() && this.getExePrestado() != null && this.getExePrestado().equals("SI") ) {
            return (this.getExeFechaPrestamo() != null);
        }
        return true;
    }
    
    @ValidationMethod(forProperty = "usuRfcEmpleado", errorCode = "not.null")
    public boolean validateUsuRfcEmpleadoRequiered() {

        if (this.isGuardar() && this.getExePrestado().equals("SI") ) {
            return (this.getUsuRfcEmpleado() != null && this.getUsuRfcEmpleado().length() > 0);
        }
        return true;
    }

    
    public void setRfcEmpleadoBusqueda(String rfcEmpleadoBusqueda) {
        this.rfcEmpleadoBusqueda = rfcEmpleadoBusqueda;
    }

    public String getRfcEmpleadoBusqueda() {
        return rfcEmpleadoBusqueda;
    }

    public void setShowPagedList(boolean showPagedList) {
        this.showPagedList = showPagedList;
    }

    public boolean isShowPagedList() {
        return showPagedList;
    }

    public void setEmpleadoGrupo(String empleadoGrupo) {
        this.empleadoGrupo = empleadoGrupo;
    }

    public String getEmpleadoGrupo() {
        return empleadoGrupo;
    }
}
