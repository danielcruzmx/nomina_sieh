package gob.shcp.sireh.model.plaza.eventual;

import gob.shcp.fsn.model.Model;

import gob.shcp.sireh.model.plaza.TdPlazaDTO;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.apache.commons.lang.time.DateUtils;

import org.springmodules.validation.bean.conf.loader.annotation.handler.ValidationMethod;

public class CambioAdscripcionMasivoDTO implements java.io.Serializable, Model{ 

    private String idUnidadOrigen;
    
    private String idUnidadDestino;
    
    private String urlOrigen;
    
    private String urlDestino;
    
    private java.util.Date fechaInicioMovimiento;
    private String idUnidadNom;
    private String[] idPlaza;
    private java.lang.String mepObserva;
        
    private boolean  buscar;
    private boolean cambio;
    private boolean cancel;
    private boolean muestraRegistros;
    
    // Exporta a xls
    private List<TdPlazaDTO> listaResultados = new ArrayList<TdPlazaDTO>();
    private String nombreArchivoResultados;
    
    // Filtros
    private List<String> idUnidadNomFilter;
    
    // Quincena de captura
    private Date inicioQuincenaCaptura;
    private Date finQuincenaCaptura;
    private Integer diasRetroactividad;
    private Integer anio;

    public CambioAdscripcionMasivoDTO() {
    }


    public void setIdUnidadOrigen(String idUnidadOrigen) {
        this.idUnidadOrigen = idUnidadOrigen;
    }

    public String getIdUnidadOrigen() {
        return idUnidadOrigen;
    }

    public void setIdUnidadDestino(String idUnidadDestino) {
        this.idUnidadDestino = idUnidadDestino;
    }

    public String getIdUnidadDestino() {
        return idUnidadDestino;
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

    public void setIdUnidadNomFilter(List<String> idUnidadNomFilter) {
        this.idUnidadNomFilter = idUnidadNomFilter;
    }

    public List<String> getIdUnidadNomFilter() {
        return idUnidadNomFilter;
    }

    public void setMuestraRegistros(boolean muestraRegistros) {
        this.muestraRegistros = muestraRegistros;
    }

    public boolean isMuestraRegistros() {
        return muestraRegistros;
    }

    public void setFechaInicioMovimiento(Date fechaInicioMovimiento) {
        this.fechaInicioMovimiento = fechaInicioMovimiento;
    }

    public Date getFechaInicioMovimiento() {
        return fechaInicioMovimiento;
    }

    public void setCambio(boolean cambio) {
        this.cambio = cambio;
    }

    public boolean isCambio() {
        return cambio;
    }

    public void setInicioQuincenaCaptura(Date inicioQuincenaCaptura) {
        this.inicioQuincenaCaptura = inicioQuincenaCaptura;
    }

    public Date getInicioQuincenaCaptura() {
        return inicioQuincenaCaptura;
    }

    public void setFinQuincenaCaptura(Date finQuincenaCaptura) {
        this.finQuincenaCaptura = finQuincenaCaptura;
    }

    public Date getFinQuincenaCaptura() {
        return finQuincenaCaptura;
    }

    public void setDiasRetroactividad(Integer diasRetroactividad) {
        this.diasRetroactividad = diasRetroactividad;
    }

    public Integer getDiasRetroactividad() {
        return diasRetroactividad;
    }

    public void setIdUnidadNom(String idUnidadNom) {
        this.idUnidadNom = idUnidadNom;
    }

    public String getIdUnidadNom() {
        return idUnidadNom;
    }

    public void setIdPlaza(String[] idPlaza) {
        this.idPlaza = idPlaza;
    }

    public String[] getIdPlaza() {
        return idPlaza;
    }
    
    
    
    // fechaInicioMovimiento dentro del año actual
    @ValidationMethod(forProperty = "fechaInicioMovimiento", errorCode = "fecha.invalida.anio")
    private boolean validateFechaInicioMovimientoAnio() {

        if (this.isCambio()) {
            if (this.getFechaInicioMovimiento() == null ) {
                return false;
            }
            Calendar calFechaTermino = Calendar.getInstance();
            calFechaTermino.setTime(this.getFechaInicioMovimiento());
            int anioFechaTermino = (int)calFechaTermino.get(Calendar.YEAR);
            if(this.getAnio() != anioFechaTermino){
                return false;
            }
        }
        return true;
    }

    // La fechaInicioMovimiento <= Fecha final quincena captura
    @ValidationMethod(forProperty = "fechaInicioMovimiento", errorCode = "fecha.invalida.quincena")
    private boolean validateFechaInicioMovimientoVsQuincena() {

        if (this.isCambio()) {
            if (this.getFechaInicioMovimiento() == null ) {
                return false;
            }
        
            if (DateUtils.truncate(this.getFechaInicioMovimiento(), Calendar.DATE).after(DateUtils.truncate(this.getFinQuincenaCaptura(), Calendar.DATE))) {
                return false;
            }
        }
        return true;
    }
    

    // La fechaInicioMovimiento >= 90 dias hacia atras de la fecha actual (Retrocatividad)
    @ValidationMethod(forProperty = "fechaInicioMovimiento", errorCode = "fecha.invalida.retroactividad")
    private boolean validateFechaInicioMovimientoVsRetroactividad() {
            
        if (this.isCambio()) {
        
            if (this.getFechaInicioMovimiento() == null ) {
                return false;
            }
            
            Calendar fechaDiasRetroactivos = Calendar.getInstance();
            fechaDiasRetroactivos.setTime(new Date());
            fechaDiasRetroactivos.add(Calendar.DATE, this.getDiasRetroactividad() * -1);
            
            if (DateUtils.truncate(this.getFechaInicioMovimiento(), Calendar.DATE).before(DateUtils.truncate(fechaDiasRetroactivos.getTime(), Calendar.DATE))) {
                return false;
            }
        }
        return true;
    }
    
    // La fechaInicioMovimiento not null
    @ValidationMethod(forProperty = "fechaInicioMovimiento", errorCode = "fecha.invalida")
    private boolean validatefechaInicioMovimiento() {
        if (this.isCambio()) {
            if (this.getFechaInicioMovimiento() == null) {
                return false;
            }
        }
        return true;
    }
    
    // Unidad destino not null
    @ValidationMethod(forProperty = "idUnidadDestino", errorCode="not.null")
    private boolean validateIdUnidadDestino() {
            
        if (this.isCambio()) {
                if(this.getIdUnidadDestino() == null || this.getIdUnidadDestino().equals(""))
                return false;
            }
        return true;
    }
    
    // Unidad destino not null
    @ValidationMethod(forProperty = "idUnidadDestino", errorCode="same.idunidad")
    private boolean validateIdUnidadDestinoSameUnidad() {
            
        if (this.isCambio()) {
                if(this.getIdUnidadDestino() == null || this.getIdUnidadDestino().equals(""))
                return false;
            }
            
        if(this.getIdUnidadNomFilter() != null && this.getIdUnidadNomFilter().size() == 1 && this.getIdUnidadNomFilter().get(0).equals(this.getIdUnidadDestino())){
            return false;
        }
        return true;
    }    
    
    // mepObserva maximo 
    @ValidationMethod(forProperty = "mepObserva", errorCode = "length")
    private boolean validateMepObserva() {
        if (this.isCambio()) {
            if (this.getMepObserva() != null && this.getMepObserva().length() > 255) {
                return false;
            }
        }
        return true;
    }
    

    public void setCancel(boolean cancel) {
        this.cancel = cancel;
    }

    public boolean isCancel() {
        return cancel;
    }

    public void setListaResultados(List<TdPlazaDTO> listaResultados) {
        this.listaResultados = listaResultados;
    }

    public List<TdPlazaDTO> getListaResultados() {
        return listaResultados;
    }

    public void setNombreArchivoResultados(String nombreArchivoResultados) {
        this.nombreArchivoResultados = nombreArchivoResultados;
    }

    public String getNombreArchivoResultados() {
        return nombreArchivoResultados;
    }

    public void setAnio(Integer anio) {
        this.anio = anio;
    }

    public Integer getAnio() {
        return anio;
    }

    public void setMepObserva(String mepObserva) {
        this.mepObserva = mepObserva;
    }

    public String getMepObserva() {
        return mepObserva;
    }
}
