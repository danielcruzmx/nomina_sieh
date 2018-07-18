package gob.shcp.sireh.model.clc.herramientas;

import gob.shcp.fsn.model.Model;
import gob.shcp.sireh.model.TdCxlcDTO;

import java.util.List;

import org.springmodules.validation.bean.conf.loader.annotation.handler.ValidationMethod;

public class RegistraSolicitudPagoDTO implements java.io.Serializable, Model {

    private Integer cxlcCiclo;
    private Long solicitudPago;
    private Integer[] cxlcGrupo;  
    
    private List<TdCxlcDTO> cxlcSeleccionadas;                        
    private List<TdCxlcDTO> cxlcInvolucradas;
    
    // Navegacion
    private String urlOrigen;
    private String urlDestino;
    
    // Sobrescribir
    private boolean sobrescribir;

    public Integer getCxlcCiclo() {
        return cxlcCiclo;
    }

    public void setCxlcCiclo(Integer cxlcCiclo) {
        this.cxlcCiclo = cxlcCiclo;
    }

    public Long getSolicitudPago() {
        return solicitudPago;
    }

    public void setSolicitudPago(Long solicitudPago) {
        this.solicitudPago = solicitudPago;
    }

    public Integer[] getCxlcGrupo() {
        return cxlcGrupo;
    }

    public void setCxlcGrupo(Integer[] cxlcGrupo) {
        this.cxlcGrupo = cxlcGrupo;
    }

    public List<TdCxlcDTO> getCxlcSeleccionadas() {
        return cxlcSeleccionadas;
    }

    public void setCxlcSeleccionadas(List<TdCxlcDTO> cxlcSeleccionadas) {
        this.cxlcSeleccionadas = cxlcSeleccionadas;
    }

    public List<TdCxlcDTO> getCxlcInvolucradas() {
        return cxlcInvolucradas;
    }

    public void setCxlcInvolucradas(List<TdCxlcDTO> cxlcInvolucradas) {
        this.cxlcInvolucradas = cxlcInvolucradas;
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
    
    public boolean isSobrescribir() {
        return sobrescribir;
    }

    public void setSobrescribir(boolean sobrescribir) {
        this.sobrescribir = sobrescribir;
    }
    
    /* V A L I D A C I O N E S */
    
    @ValidationMethod(forProperty="solicitudPago", errorCode="not.null")
    private boolean validateSolicitudPago() {
        return (this.getSolicitudPago() != null && this.getSolicitudPago() > 0);
    }
}
