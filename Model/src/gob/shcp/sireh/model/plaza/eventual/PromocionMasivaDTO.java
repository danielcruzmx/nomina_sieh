package gob.shcp.sireh.model.plaza.eventual;

import gob.shcp.fsn.model.Model;
import gob.shcp.fsn.util.FileContent;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springmodules.validation.bean.conf.loader.annotation.handler.ValidationMethod;

public class PromocionMasivaDTO  implements java.io.Serializable, Model{
    private FileContent file;
    private boolean procesoValidacionExitoso;
    private String mensaje;
    private String anio;
    private Boolean archivoValido;
    private List listModel = new ArrayList();
    private List<PromocionMasivaDTO> listaErrores;
    private String nombreArchivoErrores;
    private String rutaArchivoErrores;
    private Integer plazasProcesadas;
    private String unidad;
    private String nivel;
    private java.lang.String mepObserva;
    
    private Integer zona;
    private String codigo;
    private Integer plaza;
    private String tipo;


    private Integer entidadFederativa;
    private Date inicioVigencia;
    private Date finVigencia;
    public boolean cancel;
    public boolean inicio;
    public boolean promocion;
    private Boolean plantillaErronea;
    private String tipoProceso;
    private List<PromocionMasivaDTO> listaPlazaEstructuraIncorrecta;
    private List<PromocionMasivaDTO> listaPlazaEstructuraCorrecta;
    
    public java.lang.String urlOrigen;
    public java.lang.String urlDestino;

    public PromocionMasivaDTO() {
    listaErrores = new ArrayList<PromocionMasivaDTO>();
    }

    public void setCancel(boolean cancel) {
        this.cancel = cancel;
    }

    public boolean isCancel() {
        return cancel;
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

    public void setInicio(boolean inicio) {
        this.inicio = inicio;
    }

    public boolean isInicio() {
        return inicio;
    }

    public void setFile(FileContent file) {
        this.file = file;
    }

    public FileContent getFile() {
        return file;
    }

    public void setProcesoValidacionExitoso(boolean procesoValidacionExitoso) {
        this.procesoValidacionExitoso = procesoValidacionExitoso;
    }

    public boolean isProcesoValidacionExitoso() {
        return procesoValidacionExitoso;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setAnio(String anio) {
        this.anio = anio;
    }

    public String getAnio() {
        return anio;
    }

    public void setArchivoValido(Boolean archivoValido) {
        this.archivoValido = archivoValido;
    }

    public Boolean getArchivoValido() {
        return archivoValido;
    }

    public void setListaErrores(List<PromocionMasivaDTO> listaErrores) {
        this.listaErrores = listaErrores;
    }

    public List<PromocionMasivaDTO> getListaErrores() {
        return listaErrores;
    }

    public void setNombreArchivoErrores(String nombreArchivoErrores) {
        this.nombreArchivoErrores = nombreArchivoErrores;
    }

    public String getNombreArchivoErrores() {
        return nombreArchivoErrores;
    }

    public void setRutaArchivoErrores(String rutaArchivoErrores) {
        this.rutaArchivoErrores = rutaArchivoErrores;
    }

    public String getRutaArchivoErrores() {
        return rutaArchivoErrores;
    }

    public void setPlazasProcesadas(Integer plazasProcesadas) {
        this.plazasProcesadas = plazasProcesadas;
    }

    public Integer getPlazasProcesadas() {
        return plazasProcesadas;
    }

    public void setUnidad(String unidad) {
        this.unidad = unidad;
    }

    public String getUnidad() {
        return unidad;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public String getNivel() {
        return nivel;
    }

    public void setZona(Integer zona) {
        this.zona = zona;
    }

    public Integer getZona() {
        return zona;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getCodigo() {
        return codigo;
    }



    public void setEntidadFederativa(Integer entidadFederativa) {
        this.entidadFederativa = entidadFederativa;
    }

    public Integer getEntidadFederativa() {
        return entidadFederativa;
    }

    public void setInicioVigencia(Date inicioVigencia) {
        this.inicioVigencia = inicioVigencia;
    }

    public Date getInicioVigencia() {
        return inicioVigencia;
    }

    public void setFinVigencia(Date finVigencia) {
        this.finVigencia = finVigencia;
    }

    public Date getFinVigencia() {
        return finVigencia;
    }

    public void setPlantillaErronea(Boolean plantillaErronea) {
        this.plantillaErronea = plantillaErronea;
    }

    public Boolean getPlantillaErronea() {
        return plantillaErronea;
    }

    public void setTipoProceso(String tipoProceso) {
        this.tipoProceso = tipoProceso;
    }

    public String getTipoProceso() {
        return tipoProceso;
    }

    public void setListaPlazaEstructuraIncorrecta(List<PromocionMasivaDTO> listaPlazaEstructuraIncorrecta) {
        this.listaPlazaEstructuraIncorrecta = listaPlazaEstructuraIncorrecta;
    }

    public List<PromocionMasivaDTO> getListaPlazaEstructuraIncorrecta() {
        return listaPlazaEstructuraIncorrecta;
    }

    public void setListaPlazaEstructuraCorrecta(List<PromocionMasivaDTO> listaPlazaEstructuraCorrecta) {
        this.listaPlazaEstructuraCorrecta = listaPlazaEstructuraCorrecta;
    }

    public List<PromocionMasivaDTO> getListaPlazaEstructuraCorrecta() {
        return listaPlazaEstructuraCorrecta;
    }

    public void setPlaza(Integer plaza) {
        this.plaza = plaza;
    }

    public Integer getPlaza() {
        return plaza;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setListModel(List listModel) {
        this.listModel = listModel;
    }

    public List getListModel() {
        return listModel;
    }

    public void setMepObserva(String mepObserva) {
        this.mepObserva = mepObserva;
    }

    public String getMepObserva() {
        return mepObserva;
    }
    
    // mepObserva maximo 
    @ValidationMethod(forProperty = "mepObserva", errorCode = "length")
    private boolean validateMepObserva() {
        if (this.isPromocion()) {
            if (this.getMepObserva() != null && this.getMepObserva().length() > 255) {
                return false;
            }
        }
        return true;
    }

    public void setPromocion(boolean promocion) {
        this.promocion = promocion;
    }

    public boolean isPromocion() {
        return promocion;
    }
}
