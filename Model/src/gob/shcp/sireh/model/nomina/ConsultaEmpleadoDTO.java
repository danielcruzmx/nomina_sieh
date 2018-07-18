package gob.shcp.sireh.model.nomina;

import gob.shcp.fsn.model.Model;

public class ConsultaEmpleadoDTO implements java.io.Serializable, Model {

    private String rfcEmpleado;
    private String curpEmpleado;
    private String primerApellido;
    private String segundoApellido;
    private String nombreEmpleado;
    private String urlController;
    private String urlOrigen;
    private String urlDestino;
    private boolean cancel;

    private String menuTitle;
    private String nombrePantalla;
    
    public ConsultaEmpleadoDTO() {
    }

    public String getCurpEmpleado() {
        return curpEmpleado;
    }

    public void setCurpEmpleado(String curpEmpleado) {
        this.curpEmpleado = curpEmpleado;
    }

    public String getRfcEmpleado() {
        return rfcEmpleado;
    }

    public void setRfcEmpleado(String rfcEmpleado) {
        this.rfcEmpleado = rfcEmpleado;
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    public String getPrimerApellido() {
        return primerApellido;
    }

    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }

    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public String getSegundoApellido() {
        return segundoApellido;
    }

    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
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

    public void setUrlController(String urlController) {
        this.urlController = urlController;
    }

    public String getUrlController() {
        return urlController;
    }

    public void setMenuTitle(String menuTitle) {
        this.menuTitle = menuTitle;
    }
    
    public String getMenuTitle() {
        return menuTitle;
    }

    public void setNombrePantalla(String nombrePantalla) {
        this.nombrePantalla = nombrePantalla;
    }

    public String getNombrePantalla() {
        return nombrePantalla;
    }
}
