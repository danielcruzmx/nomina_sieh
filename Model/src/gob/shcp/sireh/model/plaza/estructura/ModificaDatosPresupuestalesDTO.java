package gob.shcp.sireh.model.plaza.estructura;

import gob.shcp.fsn.model.Model;
import gob.shcp.sireh.model.plaza.TdPlazaDTO;

import org.springmodules.validation.bean.conf.loader.annotation.handler.ValidationMethod;

public class ModificaDatosPresupuestalesDTO extends TdPlazaDTO implements java.io.Serializable, Model {

    // Datos Plaza Origen
    private java.lang.Integer plazaOrigen;
    private java.lang.String situacionOrigen;
    private String situacionOrigenDesc;
    private java.lang.String unidadOrigen;
    private String unidadOrigenDesc;
    private java.lang.String puestoOrigen;
    private String puestoOrigenDesc;
    private java.lang.String estadoOrigen;
    private String estadoOrigenDesc;
    private java.lang.String nivelOrigen;
    private java.lang.String zonaOrigen;
    private String zonaOrigenDesc;
    
    // Datos Plaza Destino
    private java.lang.Integer plazaDestino;
    private java.lang.String situacionDestino;
    private String situacionDestinoDesc;
    private java.lang.String unidadDestino;
    private String unidadDestinoDesc;
    private java.lang.String puestoDestino;
    private String puestoDestinoDesc;
    private java.lang.String estadoDestino;
    private String estadoDestinoDesc;
    private java.lang.String nivelDestino;
    private java.lang.String zonaDestino;
    private String zonaDestinoDesc;
    
    public Integer getPlazaOrigen() {
        return plazaOrigen;
    }

    public void setPlazaOrigen(Integer plazaOrigen) {
        this.plazaOrigen = plazaOrigen;
    }

    public String getSituacionOrigen() {
        return situacionOrigen;
    }

    public void setSituacionOrigen(String situacionOrigen) {
        this.situacionOrigen = situacionOrigen;
    }

    public String getUnidadOrigen() {
        return unidadOrigen;
    }

    public void setUnidadOrigen(String unidadOrigen) {
        this.unidadOrigen = unidadOrigen;
    }

    public String getPuestoOrigen() {
        return puestoOrigen;
    }

    public void setPuestoOrigen(String puestoOrigen) {
        this.puestoOrigen = puestoOrigen;
    }

    public String getEstadoOrigen() {
        return estadoOrigen;
    }

    public void setEstadoOrigen(String estadoOrigen) {
        this.estadoOrigen = estadoOrigen;
    }

    public String getNivelOrigen() {
        return nivelOrigen;
    }

    public void setNivelOrigen(String nivelOrigen) {
        this.nivelOrigen = nivelOrigen;
    }

    public String getZonaOrigen() {
        return zonaOrigen;
    }

    public void setZonaOrigen(String zonaOrigen) {
        this.zonaOrigen = zonaOrigen;
    }

    public Integer getPlazaDestino() {
        return plazaDestino;
    }

    public void setPlazaDestino(Integer plazaDestino) {
        this.plazaDestino = plazaDestino;
    }

    public String getSituacionDestino() {
        return situacionDestino;
    }

    public void setSituacionDestino(String situacionDestino) {
        this.situacionDestino = situacionDestino;
    }

    public String getUnidadDestino() {
        return unidadDestino;
    }

    public void setUnidadDestino(String unidadDestino) {
        this.unidadDestino = unidadDestino;
    }

    public String getPuestoDestino() {
        return puestoDestino;
    }

    public void setPuestoDestino(String puestoDestino) {
        this.puestoDestino = puestoDestino;
    }

    public String getEstadoDestino() {
        return estadoDestino;
    }

    public void setEstadoDestino(String estadoDestino) {
        this.estadoDestino = estadoDestino;
    }

    public String getNivelDestino() {
        return nivelDestino;
    }

    public void setNivelDestino(String nivelDestino) {
        this.nivelDestino = nivelDestino;
    }

    public String getZonaDestino() {
        return zonaDestino;
    }

    public void setZonaDestino(String zonaDestino) {
        this.zonaDestino = zonaDestino;
    }
    
    /* V A L I D A C I O N E S */
    
    @ValidationMethod(forProperty = "plazaOrigen", errorCode = "not.blank")
    public boolean validatePlazaOrigen() {
        return this.getPlazaOrigen() != null && this.getPlazaOrigen() != 0;
    }
    
    @ValidationMethod(forProperty = "plazaDestino", errorCode = "not.blank")
    public boolean validatePlazaDestino() {
        return this.getPlazaDestino() != null && this.getPlazaDestino() != 0;
    }

    public void setSituacionOrigenDesc(String situacionOrigenDesc) {
        this.situacionOrigenDesc = situacionOrigenDesc;
    }

    public String getSituacionOrigenDesc() {
        return situacionOrigenDesc;
    }

    public void setUnidadOrigenDesc(String unidadOrigenDesc) {
        this.unidadOrigenDesc = unidadOrigenDesc;
    }

    public String getUnidadOrigenDesc() {
        return unidadOrigenDesc;
    }

    public void setPuestoOrigenDesc(String puestoOrigenDesc) {
        this.puestoOrigenDesc = puestoOrigenDesc;
    }

    public String getPuestoOrigenDesc() {
        return puestoOrigenDesc;
    }

    public void setEstadoOrigenDesc(String estadoOrigenDesc) {
        this.estadoOrigenDesc = estadoOrigenDesc;
    }

    public String getEstadoOrigenDesc() {
        return estadoOrigenDesc;
    }

    public void setZonaOrigenDesc(String zonaOrigenDesc) {
        this.zonaOrigenDesc = zonaOrigenDesc;
    }

    public String getZonaOrigenDesc() {
        return zonaOrigenDesc;
    }

    public void setSituacionDestinoDesc(String situacionDestinoDesc) {
        this.situacionDestinoDesc = situacionDestinoDesc;
    }

    public String getSituacionDestinoDesc() {
        return situacionDestinoDesc;
    }

    public void setUnidadDestinoDesc(String unidadDestinoDesc) {
        this.unidadDestinoDesc = unidadDestinoDesc;
    }

    public String getUnidadDestinoDesc() {
        return unidadDestinoDesc;
    }

    public void setPuestoDestinoDesc(String puestoDestinoDesc) {
        this.puestoDestinoDesc = puestoDestinoDesc;
    }

    public String getPuestoDestinoDesc() {
        return puestoDestinoDesc;
    }

    public void setEstadoDestinoDesc(String estadoDestinoDesc) {
        this.estadoDestinoDesc = estadoDestinoDesc;
    }

    public String getEstadoDestinoDesc() {
        return estadoDestinoDesc;
    }

    public void setZonaDestinoDesc(String zonaDestinoDesc) {
        this.zonaDestinoDesc = zonaDestinoDesc;
    }

    public String getZonaDestinoDesc() {
        return zonaDestinoDesc;
    }
}
