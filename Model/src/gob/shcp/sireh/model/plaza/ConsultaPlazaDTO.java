package gob.shcp.sireh.model.plaza;

import gob.shcp.fsn.model.Model;

import org.springmodules.validation.bean.conf.loader.annotation.handler.ValidationMethod;

public class ConsultaPlazaDTO implements java.io.Serializable, Model {

    // Datos de la Plaza
    private Integer idPlaza;
    private String idSituacionPlaza;
    private String descSitPlaza;
    private String idUnidadPre;
    private String idPuestoPre;
    private String primerApellido;
    private String segundoApellido;
    private String nombreEmpleado;
    
    // Configuracion inicial
    private String seccion;
    private String beanName;
    private String beanNameSituacion;
    private String beanNameUnidad;
    
    private String urlOrigen;
    private String urlDestino;
    private boolean cancel;
    private boolean muestraRegistros;
    
    // Filtros
    private String uniCiclo;
    private String idCiclo;
    
    // Depura Plazas
    private boolean depura;
    private Integer[] idPlazas;
    private String urlOrigenDepura;
    private String observaciones;
    
    // Asigna Plaza Soporte
    private boolean asignaPlazaSoporte;
    
    // Elimina Plaza Soporte
    private boolean eliminaPlazaSoporte;
    private Integer[] idPlazasSoporte;
    private String urlOrigenEliminaPlaza;
    
    // Demominacion Funcional
    private boolean denominacionFuncional;
    
    // Observaciones Plaza
    private boolean observacionesPlaza;
    
    // Prorroga Art.34
    private boolean prorrogaArt34;
    
    // Prorroga Contrato Eventual
    private boolean prorrogaContratoEventual;
    
    // Prorroga Contrato Honorarios
    private boolean prorrogaContratoHonorarios;
    
    public Integer getIdPlaza() {
        return idPlaza;
    }

    public void setIdPlaza(Integer idPlaza) {
        this.idPlaza = idPlaza;
    }

    public String getIdSituacionPlaza() {
        return idSituacionPlaza;
    }

    public void setIdSituacionPlaza(String idSituacionPlaza) {
        this.idSituacionPlaza = idSituacionPlaza;
    }

    public String getDescSitPlaza() {
        return descSitPlaza;
    }

    public void setDescSitPlaza(String descSitPlaza) {
        this.descSitPlaza = descSitPlaza;
    }

    public String getIdUnidadPre() {
        return idUnidadPre;
    }

    public void setIdUnidadPre(String idUnidadPre) {
        this.idUnidadPre = idUnidadPre;
    }

    public String getIdPuestoPre() {
        return idPuestoPre;
    }

    public void setIdPuestoPre(String idPuestoPre) {
        this.idPuestoPre = idPuestoPre;
    }

    public String getPrimerApellido() {
        return primerApellido;
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    public String getSegundoApellido() {
        return segundoApellido;
    }

    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }

    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
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

    public String getBeanNameSituacion() {
        return beanNameSituacion;
    }

    public void setBeanNameSituacion(String beanNameSituacion) {
        this.beanNameSituacion = beanNameSituacion;
    }
    
    public String getBeanNameUnidad() {
        return beanNameUnidad;
    }

    public void setBeanNameUnidad(String beanNameUnidad) {
        this.beanNameUnidad = beanNameUnidad;
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

    public String getUniCiclo() {
        return uniCiclo;
    }

    public void setUniCiclo(String uniCiclo) {
        this.uniCiclo = uniCiclo;
    }

    public String getIdCiclo() {
        return idCiclo;
    }

    public void setIdCiclo(String idCiclo) {
        this.idCiclo = idCiclo;
    }

    public boolean isDepura() {
        return depura;
    }

    public void setDepura(boolean depura) {
        this.depura = depura;
    }

    public Integer[] getIdPlazas() {
        return idPlazas;
    }

    public void setIdPlazas(Integer[] idPlazas) {
        this.idPlazas = idPlazas;
    }

    public String getUrlOrigenDepura() {
        return urlOrigenDepura;
    }

    public void setUrlOrigenDepura(String urlOrigenDepura) {
        this.urlOrigenDepura = urlOrigenDepura;
    }
    
    public boolean isAsignaPlazaSoporte() {
        return asignaPlazaSoporte;
    }

    public void setAsignaPlazaSoporte(boolean asignaPlazaSoporte) {
        this.asignaPlazaSoporte = asignaPlazaSoporte;
    }
    
    public boolean isEliminaPlazaSoporte() {
        return eliminaPlazaSoporte;
    }

    public void setEliminaPlazaSoporte(boolean eliminaPlazaSoporte) {
        this.eliminaPlazaSoporte = eliminaPlazaSoporte;
    }
    
    public Integer[] getIdPlazasSoporte() {
        return idPlazasSoporte;
    }

    public void setIdPlazasSoporte(Integer[] idPlazasSoporte) {
        this.idPlazasSoporte = idPlazasSoporte;
    }

    public String getUrlOrigenEliminaPlaza() {
        return urlOrigenEliminaPlaza;
    }

    public void setUrlOrigenEliminaPlaza(String urlOrigenEliminaPlaza) {
        this.urlOrigenEliminaPlaza = urlOrigenEliminaPlaza;
    }
    
    public boolean isDenominacionFuncional() {
        return denominacionFuncional;
    }

    public void setDenominacionFuncional(boolean denominacionFuncional) {
        this.denominacionFuncional = denominacionFuncional;
    }
    
    public boolean isObservacionesPlaza() {
        return observacionesPlaza;
    }

    public void setObservacionesPlaza(boolean observacionesPlaza) {
        this.observacionesPlaza = observacionesPlaza;
    }
    
    public boolean isProrrogaArt34() {
        return prorrogaArt34;
    }

    public void setProrrogaArt34(boolean prorrogaArt34) {
        this.prorrogaArt34 = prorrogaArt34;
    }
    
    public boolean isProrrogaContratoEventual() {
        return prorrogaContratoEventual;
    }

    public void setProrrogaContratoEventual(boolean prorrogaContratoEventual) {
        this.prorrogaContratoEventual = prorrogaContratoEventual;
    }
    
    public boolean isProrrogaContratoHonorarios() {
        return prorrogaContratoHonorarios;
    }

    public void setProrrogaContratoHonorarios(boolean prorrogaContratoHonorarios) {
        this.prorrogaContratoHonorarios = prorrogaContratoHonorarios;
    }
    
    /* V A L I D A C I O N E S */
    
    @ValidationMethod(forProperty="idPlazas", errorCode="error.delete.unselected")
    private boolean validateIdPlazas() {
        if(this.isDepura()) {
            return (this.getIdPlazas() != null && this.getIdPlazas().length > 0);
        }
        return true;
    }
    
    @ValidationMethod(forProperty="idPlazasSoporte", errorCode="error.delete.unselected")
    private boolean validateIdPlazasSoporte() {
        if(this.isEliminaPlazaSoporte()) {
            return (this.getIdPlazasSoporte() != null && this.getIdPlazasSoporte().length > 0);
        }
        return true;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public String getObservaciones() {
        return observaciones;
    }
}
