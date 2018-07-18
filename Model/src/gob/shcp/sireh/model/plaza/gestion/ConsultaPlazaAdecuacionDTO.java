package gob.shcp.sireh.model.plaza.gestion;

import gob.shcp.fsn.model.Model;

import java.sql.Date;

import org.springmodules.validation.bean.conf.loader.annotation.handler.ValidationMethod;

public class ConsultaPlazaAdecuacionDTO implements java.io.Serializable, Model {

    //Filtros
    private String idOficioAfectaf;
    
    private Integer idPlazaf;
    private String uniCiclo;
    private String idCiclo;

    //Plaza 
    private Integer plafCiclo;
    private Integer idOficioAfecta;
    private Integer idPlaza;
    private String operacion;
    private String idUnidad;
    private String idPuesto;
    private String idNivelPto;
    private Integer idEdo;
    private String idGrupoPago;
    private String proyAmplia;
    private String proyReduce;
    private Date plafInicio;
    private String plafInicios;
    private Date plafFinal;
    private String idSitAfectaci;
    private String leyendaJustificac;

    //Propiedades default
    private String beanName;
    private String urlOrigen;
    private String urlDestino;
    private boolean cancel;
    private boolean muestraRegistros;

    public void setIdOficioAfectaf(String idOficioAfectaf) {
        this.idOficioAfectaf = idOficioAfectaf;
    }

    public String getIdOficioAfectaf() {
        return idOficioAfectaf;
    }

    public void setIdPlazaf(Integer idPlazaf) {
        this.idPlazaf = idPlazaf;
    }

    public Integer getIdPlazaf() {
        return idPlazaf;
    }

    public void setUniCiclo(String uniCiclo) {
        this.uniCiclo = uniCiclo;
    }

    public String getUniCiclo() {
        return uniCiclo;
    }

    public void setIdCiclo(String idCiclo) {
        this.idCiclo = idCiclo;
    }

    public String getIdCiclo() {
        return idCiclo;
    }

    public void setPlafCiclo(Integer plafCiclo) {
        this.plafCiclo = plafCiclo;
    }

    public Integer getPlafCiclo() {
        return plafCiclo;
    }

    public void setIdOficioAfecta(Integer idOficioAfecta) {
        this.idOficioAfecta = idOficioAfecta;
    }

    public Integer getIdOficioAfecta() {
        return idOficioAfecta;
    }

    public void setIdPlaza(Integer idPlaza) {
        this.idPlaza = idPlaza;
    }

    public Integer getIdPlaza() {
        return idPlaza;
    }

    public void setOperacion(String operacion) {
        this.operacion = operacion;
    }

    public String getOperacion() {
        return operacion;
    }

    public void setIdUnidad(String idUnidad) {
        this.idUnidad = idUnidad;
    }

    public String getIdUnidad() {
        return idUnidad;
    }

    public void setIdPuesto(String idPuesto) {
        this.idPuesto = idPuesto;
    }

    public String getIdPuesto() {
        return idPuesto;
    }

    public void setIdNivelPto(String idNivelPto) {
        this.idNivelPto = idNivelPto;
    }

    public String getIdNivelPto() {
        return idNivelPto;
    }

    public void setIdEdo(Integer idEdo) {
        this.idEdo = idEdo;
    }

    public Integer getIdEdo() {
        return idEdo;
    }

    public void setIdGrupoPago(String idGrupoPago) {
        this.idGrupoPago = idGrupoPago;
    }

    public String getIdGrupoPago() {
        return idGrupoPago;
    }

    public void setProyAmplia(String proyAmplia) {
        this.proyAmplia = proyAmplia;
    }

    public String getProyAmplia() {
        return proyAmplia;
    }

    public void setProyReduce(String proyReduce) {
        this.proyReduce = proyReduce;
    }

    public String getProyReduce() {
        return proyReduce;
    }

    public void setPlafInicio(Date plafInicio) {
        this.plafInicio = plafInicio;
    }

    public Date getPlafInicio() {
        return plafInicio;
    }

    public void setPlafFinal(Date plafFinal) {
        this.plafFinal = plafFinal;
    }

    public Date getPlafFinal() {
        return plafFinal;
    }

    public void setIdSitAfectaci(String idSitAfectaci) {
        this.idSitAfectaci = idSitAfectaci;
    }

    public String getIdSitAfectaci() {
        return idSitAfectaci;
    }

    public void setLeyendaJustificac(String leyendaJustificac) {
        this.leyendaJustificac = leyendaJustificac;
    }

    public String getLeyendaJustificac() {
        return leyendaJustificac;
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

    public void setPlafInicios(String plafInicios) {
        this.plafInicios = plafInicios;
    }

    public String getPlafInicios() {
        return plafInicios;
    }
    
    /* V A L I D A C I O N E S */
    /*@ValidationMethod(forProperty="idPlazaf", errorCode="error.delete.unselected")
    private boolean validateIdPlazaf() {
        return (this.getIdPlazaf() != null && this.getIdPlazaf() > 0);
    }*/
    
    public String getBeanName() {
        return beanName;
    }

    public void setBeanName(String beanName) {
        this.beanName = beanName;
    }
}
