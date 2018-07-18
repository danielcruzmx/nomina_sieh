package gob.shcp.sireh.model.plaza.gestion;

import gob.shcp.fsn.model.Model;

import java.io.Serializable;

public class ConsultaPlazaSpcDTO implements Serializable, Model{
    //Filtros
    private String plazaRfc;
    private String nombreEmpleado;
    private String primerApellido;
    private String segundoApellido;
    private String idPlaza;
    private String nombrePuesto;
    private String parPlazaRfc;
    private String parIdPlaza;
    private Long id;


    //Propiedades default
    private String beanName;
    private String urlOrigen;
    private String urlDestino;
    private String filter;
    private boolean cancel;
    private boolean muestraRegistros;
    private boolean muestraReporte;

 


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

    public void setIdPlaza(String idPlaza) {
        this.idPlaza = idPlaza;
    }

    public String getIdPlaza() {
        return idPlaza;
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

    public void setNombrePuesto(String nombrePuesto) {
        this.nombrePuesto = nombrePuesto;
    }

    public String getNombrePuesto() {
        return nombrePuesto;
    }

    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }

    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public void setPlazaRfc(String plazaRfc) {
        this.plazaRfc = plazaRfc;
    }

    public String getPlazaRfc() {
        return plazaRfc;
    }

    public void setMuestraReporte(boolean muestraReporte) {
        this.muestraReporte = muestraReporte;
    }

    public boolean isMuestraReporte() {
        return muestraReporte;
    }


    public void setParPlazaRfc(String parPlazaRfc) {
        this.parPlazaRfc = parPlazaRfc;
    }

    public String getParPlazaRfc() {
        return parPlazaRfc;
    }

    public void setParIdPlaza(String parIdPlaza) {
        this.parIdPlaza = parIdPlaza;
    }

    public String getParIdPlaza() {
        return parIdPlaza;
    }

    public void setFilter(String filter) {
        this.filter = filter;
    }

    public String getFilter() {
        return filter;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
