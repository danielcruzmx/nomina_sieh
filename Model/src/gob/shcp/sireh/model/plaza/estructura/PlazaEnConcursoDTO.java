package gob.shcp.sireh.model.plaza.estructura;

import gob.shcp.fsn.model.Model;

import java.util.Date;

import org.springmodules.validation.bean.conf.loader.annotation.handler.ValidationMethod;

public class PlazaEnConcursoDTO implements java.io.Serializable, Model {

    private Integer idPlaza;
    private Integer idPlazaConcurso;
    private Integer idEstatus;
    private Integer idPlazaBusqueda;
    private String plazaRfc;
    private String nombreEmpleado;
    private String codigoPuesto;
    private String nombrePuesto;
    private String idUnidadNom;
    private String descUnidad;
    private String idPuestoNom;
    private String idNivelPto;
    private String idRangoNom;
    private String idSitPlaza;
    private String descSitPlaza;
    private Date fechaDesierta;
    private Date fechaEtapa;
    private String urlOrigen;
    private String urlDestino;
    private Integer idEtapa;
    private String descripcionEtapa;
    private Date fechaCancelado;
    
    private boolean buscar;
    private boolean limpiar;
    private boolean guardar;
    private boolean cancelar;
    private boolean concurso;
    private boolean muestraConcurso;
    
    public PlazaEnConcursoDTO() {
    }


    public void setIdPlaza(Integer idPlaza) {
        this.idPlaza = idPlaza;
    }

    public Integer getIdPlaza() {
        return idPlaza;
    }

    public void setPlazaRfc(String plazaRfc) {
        this.plazaRfc = plazaRfc;
    }

    public String getPlazaRfc() {
        return plazaRfc;
    }

    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }

    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public void setCodigoPuesto(String codigoPuesto) {
        this.codigoPuesto = codigoPuesto;
    }

    public String getCodigoPuesto() {
        return codigoPuesto;
    }

    public void setNombrePuesto(String nombrePuesto) {
        this.nombrePuesto = nombrePuesto;
    }

    public String getNombrePuesto() {
        return nombrePuesto;
    }

    public void setIdUnidadNom(String idUnidadNom) {
        this.idUnidadNom = idUnidadNom;
    }

    public String getIdUnidadNom() {
        return idUnidadNom;
    }

    public void setDescUnidad(String descUnidad) {
        this.descUnidad = descUnidad;
    }

    public String getDescUnidad() {
        return descUnidad;
    }

    public void setIdPuestoNom(String idPuestoNom) {
        this.idPuestoNom = idPuestoNom;
    }

    public String getIdPuestoNom() {
        return idPuestoNom;
    }

    public void setIdNivelPto(String idNivelPto) {
        this.idNivelPto = idNivelPto;
    }

    public String getIdNivelPto() {
        return idNivelPto;
    }

    public void setIdRangoNom(String idRangoNom) {
        this.idRangoNom = idRangoNom;
    }

    public String getIdRangoNom() {
        return idRangoNom;
    }

    public void setIdSitPlaza(String idSitPlaza) {
        this.idSitPlaza = idSitPlaza;
    }

    public String getIdSitPlaza() {
        return idSitPlaza;
    }

    public void setDescSitPlaza(String descSitPlaza) {
        this.descSitPlaza = descSitPlaza;
    }

    public String getDescSitPlaza() {
        return descSitPlaza;
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

    public void setBuscar(boolean buscar) {
        this.buscar = buscar;
    }

    public boolean isBuscar() {
        return buscar;
    }

    public void setLimpiar(boolean limpiar) {
        this.limpiar = limpiar;
    }

    public boolean isLimpiar() {
        return limpiar;
    }

    public void setGuardar(boolean guardar) {
        this.guardar = guardar;
    }

    public boolean isGuardar() {
        return guardar;
    }

    public void setCancelar(boolean cancelar) {
        this.cancelar = cancelar;
    }

    public boolean isCancelar() {
        return cancelar;
    }

    public void setIdPlazaBusqueda(Integer idPlazaBusqueda) {
        this.idPlazaBusqueda = idPlazaBusqueda;
    }

    public Integer getIdPlazaBusqueda() {
        return idPlazaBusqueda;
    }



    public void setMuestraConcurso(boolean muestraConcurso) {
        this.muestraConcurso = muestraConcurso;
    }

    public boolean isMuestraConcurso() {
        return muestraConcurso;
    }

    public void setIdPlazaConcurso(Integer idPlazaConcurso) {
        this.idPlazaConcurso = idPlazaConcurso;
    }

    public Integer getIdPlazaConcurso() {
        return idPlazaConcurso;
    }

    public void setIdEstatus(Integer idEstatus) {
        this.idEstatus = idEstatus;
    }

    public Integer getIdEstatus() {
        return idEstatus;
    }

    public void setFechaDesierta(Date fechaDesierta) {
        this.fechaDesierta = fechaDesierta;
    }

    public Date getFechaDesierta() {
        return fechaDesierta;
    }
    
    @ValidationMethod(forProperty = "idEstatus", errorCode = "not.blank")
    public boolean validateIdEstatus() {
        if(this.isGuardar()){
            return this.getIdEstatus() != null;    
        }
        return true;
    }
    
    @ValidationMethod(forProperty = "fechaDesierta", errorCode = "not.blank")
    public boolean validateFechaDesierta() {
        if(this.isGuardar()){
            if(this.getIdEstatus() != null && this.getIdEstatus().intValue() == 2 ){
                return this.getFechaDesierta() != null;    
            }
        }
        return true;
    }

    @ValidationMethod(forProperty = "fechaEtapa", errorCode = "not.blank")
    public boolean validateFechaEtapa() {
        if(this.isGuardar()){
            if(this.getIdEstatus() != null && this.getIdEstatus().intValue() == 1 ){
                return this.getFechaEtapa() != null;    
            }
        }
        return true;
    }
    
    public void setConcurso(boolean concurso) {
        this.concurso = concurso;
    }

    public boolean isConcurso() {
        return concurso;
    }

    public void setIdEtapa(Integer idEtapa) {
        this.idEtapa = idEtapa;
    }

    public Integer getIdEtapa() {
        return idEtapa;
    }

    public void setDescripcionEtapa(String descripcionEtapa) {
        this.descripcionEtapa = descripcionEtapa;
    }

    public String getDescripcionEtapa() {
        return descripcionEtapa;
    }

    public void setFechaEtapa(Date fechaEtapa) {
        this.fechaEtapa = fechaEtapa;
    }

    public Date getFechaEtapa() {
        return fechaEtapa;
    }

    public void setFechaCancelado(Date fechaCancelado) {
        this.fechaCancelado = fechaCancelado;
    }

    public Date getFechaCancelado() {
        return fechaCancelado;
    }
}
